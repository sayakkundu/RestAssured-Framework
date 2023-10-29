package com.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.junit.Assert.*;

import payload.AddPetPayload;

public class PetSteps {

	RequestSpecification request = RestAssured.given();
	Response response;
	AddPetPayload addpet = new AddPetPayload();
	
	@Given("User request the API using method {string}")
	public void user_request_the_api_using_method(String method) {

		response = request.when().header("accept", "application/json").header("Content-Type", "application/json")
				.body(addpet.addPetPayload()).post("https://petstore.swagger.io/v2/pet");
	}

	@When("User fills in information about pet")
	public void user_fills_in_information_about_pet() {

		request.log().body();
	}

	@Then("Pet should be added")
	public void pet_should_be_added() {
		
		response.prettyPrint();
	}

	@And("Status code should be {int}")
	public void status_code_should_be(Integer int1) {
		
		int statusCode = response.getStatusCode();
		assertEquals(200, statusCode);
	}
}
