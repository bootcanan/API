package com.techproed.tests;

import com.techproed.testBase.TestBaseDummy;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest08 extends TestBaseDummy {



@Test

    public void test01(){



         String url="https://dummy.restapiexample.com/api/v1/employees";
    Response response=given().accept("application/json").
         when().get(url);
    response.prettyPrint();



}


}
