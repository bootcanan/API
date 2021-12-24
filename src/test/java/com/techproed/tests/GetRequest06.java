package com.techproed.tests;

import com.techproed.testBase.TestBaseJsonPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class GetRequest06 extends TestBaseJsonPlaceHolder {

    @Test
    public void test01(){

         spec.pathParams("name","todos","id",123);
        Response response=given().accept("application/json").
                spec(spec).when().get("/{name}/{id}");


       response.prettyPrint();


    }
}
