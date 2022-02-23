package com.restassured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class restAssuredTesting {
    @Test
    public void testRest(){
        RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET,"/Hyderabad");
        String re = response.getBody().toString();
        System.out.println("ContentType: " + response.getContentType());
        System.out.println("Header details: " + response.getHeaders());
        System.out.println("Status line: " + response.getStatusLine());
        System.out.println("Header Date:  " + response.getHeader("Date"));
        Headers allHeaders = response.headers();

        for(Header header : allHeaders) {
            System.out.println(header.getName() + "-------" +  header.getValue());
        }
        System.out.println(response.getBody().asString());
        System.out.println("City: " + response.jsonPath().get("City"));
        Assert.assertEquals(response.getBody().asString().contains("Hyderabad"),true,"expected is equal to actual");
    }

}

