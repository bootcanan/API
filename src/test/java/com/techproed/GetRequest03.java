package com.techproed;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest03 {

    @Test

    public void get01(){
        String url="https://restful-booker.herokuapp.com/booking/7";

        Response response=given().get(url);
        response.prettyPrint();

//        response.then().
//                assertThat().
//                statusCode(200).contentType(ContentType.JSON).
//                body("firstname", Matchers.equalTo("Eric")).
//                body("lastname",Matchers.equalTo("Ericsson")).
//                body("totalprice", Matchers.equalTo(154)).
//                body("depositpaid",Matchers.equalTo(false)).
//                body("bookingdates.checkin", Matchers.equalTo( "2019-11-05")).
//                body("bookingdates.checkout",Matchers.equalTo("2021-06-15"));
        response.then().
                assertThat().
                statusCode(200).contentType(ContentType.JSON).
                body("firstname",equalTo("Susan"),
                "lastname", equalTo("Ericsson"),
                "totalprice", equalTo(469),
                "depositpaid", equalTo(true),
                "bookingdates.checkin", equalTo( "2019-05-16"),
                "bookingdates.checkout", equalTo("2020-11-03"));



    }

}
