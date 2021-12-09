package com.techproed;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest04 {

    @Test

    public void test01(){


        String url="https://restful-booker.herokuapp.com/booking/5";

        Response response=given().get(url);
        response.prettyPrint();

        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("firstname",equalTo("Mark"),
                        "lastname",equalTo("Brown")  ,
                        "totalprice",equalTo(643));

    }
}
