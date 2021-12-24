package com.techproed.testBase;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBaseDummy {
    protected RequestSpecification spec;

    @Before
    public void setUp(){

       spec=new RequestSpecBuilder().setBaseUri("https://dummy.restapiexample.com/api/v1").build();
//public access modifier I can access it from everywhere in my project
//default if they are in the same package i can access
//protected we can access from child classes
//private only in the class level

    }

}


