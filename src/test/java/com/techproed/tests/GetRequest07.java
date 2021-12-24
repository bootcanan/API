package com.techproed.tests;

import com.techproed.testBase.HerokuappPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.given;

public class GetRequest07 extends HerokuappPlaceHolder {

    @Test

    public void test01(){
     spec.pathParams("first","booking","second",5);


        Response response=given().accept("application/json").
                spec(spec).when().
                get("/{first}/{second}");
        response.prettyPrint();

         response.then().assertThat().statusCode(200).contentType(ContentType.JSON);
        JsonPath json=response.jsonPath();

        Assert.assertEquals( "Susan",json.getString("firstname"));
        Assert.assertEquals("2017-03-27",json.getString("bookingdates.checkin"));
        Assert.assertEquals(true, json.getBoolean( "depositpaid"));

    }
}
