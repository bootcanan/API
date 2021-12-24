package com.techproed.testBase;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBaseJsonPlaceHolder {
        protected RequestSpecification spec;

  @Before
            public void setUp(){

               spec=new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();
//public access modifier I can access it from everywhere in my project
//default if they are in the same package i can access
//protected we can access from child classes
//private only in the class level
           }

}
