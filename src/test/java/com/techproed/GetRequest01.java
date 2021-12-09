package com.techproed;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {

    /*
    *https://restful-booker.herokuapp.com/booking/18
    *
    * */

    @Test
    public void test01(){

        //set the url
        String url="https://restful-booker.herokuapp.com/booking/7";

        //expected result

        //send the request

       Response response=given().accept("application/json").when().get(url);
        response.prettyPrint();
        //get the response

        // assertion
        response.then().assertThat().contentType(ContentType.JSON).statusCode(200);
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeaders());
        System.out.println(response.contentType());


    }
}
