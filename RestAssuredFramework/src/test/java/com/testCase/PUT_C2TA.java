package com.testCase;

import org.testng.annotations.Test;

import com.baseClass.PayLoad;

import io.restassured.RestAssured;

public class PUT_C2TA extends PayLoad{
	
	@Test
	public void put() {
		RestAssured.baseURI="https://www.c2ta.co.in";
		RestAssured.given().log().all().body(putLoad()).when().get("/api/update.php").then().log().all().statusCode(200);
	}
}
