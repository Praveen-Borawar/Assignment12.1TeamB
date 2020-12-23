package Base;

import static io.restassured.RestAssured.given;

import Utils.utils;


public class initializeBase  {

	public static void getMethod(){

		given().baseUri(utils.URL()).log().all()
		.get("/api/users/2").then().assertThat().statusCode(200).log().all();
		
	}
	
	public static void getQueryMethod() {
		given().baseUri(utils.URL()).log().all().queryParam("page", "2")
		.get("/api/users/").then().assertThat().statusCode(200).log().all();

	}

	public static void postMethod() {
		given().baseUri(utils.URL()).log().all()
		
		.body(utils.addBody("TeamB", "Intern"))
		.post("/api/users/").then().assertThat().statusCode(201).log().all();

	}

}
