package RestAssuredAPITrainingBeginner;

import static io.restassured.RestAssured.given;

import io.restassured.response.ValidatableResponse;

public class BasicGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Extract Token from the Login API Response

		ValidatableResponse response = given()

				.header("Content-Type", "application/json")
				.body("{\"id\": \"4\",\"name\": \"John Doe\",\"age\": 18,\"grade\": \"12th\"}").when()
				.post("http://localhost:3000/students").then().statusCode(201).log().body();

		System.out.println(response);

	}

}
