package com.testCase;

import org.testng.annotations.Test;

import com.baseClass.PayLoad;

import io.restassured.RestAssured;

public class POST_C2TA extends PayLoad{

	@Test
	public void post() {
		RestAssured.baseURI="https://www.c2ta.co.in";
		//takes all request and print in the console
		RestAssured.given().log().all().body(postLoad()).when().post("/api/insert.php").then().log().all().statusCode(200);
		
	}
	
}
