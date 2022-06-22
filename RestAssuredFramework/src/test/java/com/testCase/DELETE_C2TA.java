package com.testCase;

import org.testng.annotations.Test;

import com.baseClass.PayLoad;

import io.restassured.RestAssured;

public class DELETE_C2TA extends PayLoad{
	
	@Test
	public void delete() {
		RestAssured.baseURI="https://www.c2ta.co.in";
		RestAssured.given().log().all().body(deleteLoad()).when().delete("/api/delete.php").then().log().all().statusCode(200);
	}
}
