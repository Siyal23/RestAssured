package com.baseClass;

public class PayLoad {
	
	public String postLoad() {
		return "{\r\n"
				+ "\"title\": \"Training\" ,\r\n"
				+ "\"body\": \"Python\",\r\n"
				+ "\"author\": \"Patil\"\r\n"
				+ "}";
	}
	
	public String putLoad() {
		return "{\r\n"
				+ "    \"id\":\"657\",\r\n"
				+ "    \"title\":\"Java\",\r\n"
				+ "    \"author\":\"Siyal\"\r\n"
				+ "}";
	}
	
	public String deleteLoad() {
		return "{\r\n"
				+ "    \"id\": \"657\"\r\n"
				+ "}";
	}
}
