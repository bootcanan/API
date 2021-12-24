package com.techproed.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest05 {

@Test

    public void test01(){

   String url="http://dummy.restapiexample.com/api/v1/employees" ;


   Response response=given().accept("application/json").when().get(url);
   response.prettyPrint();

   response.then().assertThat().
           contentType(ContentType.JSON).
           statusCode(200).body("data.id", Matchers.hasSize(24),
           "data.employee_name", Matchers.hasItem("Tiger Nixon"),
           "data.employee_age",Matchers.hasItems(61,23,36));







}}
