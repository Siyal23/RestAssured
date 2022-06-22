package com.testCase;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GET_C2TA {
	@Test
	public void get() {
		RestAssured.baseURI="https://www.c2ta.co.in";
		RestAssured.given().log().all().when().get("/api/read.php").then().log().all().statusCode(200);
	}
}
