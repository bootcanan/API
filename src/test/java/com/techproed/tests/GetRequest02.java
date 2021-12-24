package com.techproed.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest02 {

    /*
     *https://restful-booker.herokuapp.com/booking/1001
     *
     * */

    @Test
    public void test01(){
    //s et the url
        String url="https://restful-booker.herokuapp.com/booking/1001";
     // send the request
        Response response=given().accept("application/json").when().get(url);

        response.prettyPrint();

        // get the response
        response.then().assertThat().statusCode(404);

        Assert.assertTrue(response.asString().contains("Not Found"));

    }

    public static class GetRequest04 {

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
}
