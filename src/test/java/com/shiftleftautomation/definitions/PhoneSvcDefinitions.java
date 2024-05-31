package com.shiftleftautomation.definitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.shiftlefttautomation.api.pages.PhoneAPIMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

import com.shiftleftautomation.utility.ApiUtility;
import com.shiftlefttautomation.*;


import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
//
//import files.ReUsableMethods;
//import files.payload;

import io.restassured.specification.RequestSpecification;

public class PhoneSvcDefinitions  {
	
	ApiUtility apiUtility = new ApiUtility();
	private String request = "";
	private String endPoint = "";
	private Response responseBody;
	private PhoneAPIMethods phoneapimethods = new PhoneAPIMethods();
	

//	@Given("the {string} endpoint is available")
//	public void the_endpoint_is_available(String request) throws Exception {
//		String baseuri = phoneapimethods.getBaseUri(request);
//		String service = phoneapimethods.getService(request);
//		//String service = httpmethod.api_method_get;
//		endPoint = baseuri.concat(service);
//		System.out.println(endPoint);
//		
//		RestAssured.baseURI = "https://api.restful-api.dev";
//	    String response = given().when().get("/objects").then().assertThat().statusCode(200).extract().response().asString();
//		System.out.println(response);
//		
//		JsonPath res = new JsonPath(response);
//		System.out.println(res);
//		String name = res.getString("name");
//		System.out.println(name);
//}
		
	@Given("the {string} endpoint is available")
	public void the_endpoint_is_available(String request) throws Exception {
		String baseuri = phoneapimethods.getBaseUri(request);
		String resource = phoneapimethods.getService("phone_svc_resource");
		apiUtility.setBaseUri(baseuri);
		apiUtility.setEndpoint(resource);
	}
	
	@When("request is called")
	public void request_is_called() {
	    // Write code here that turns the phrase above into concrete actions
		apiUtility.get();
	}
	
	@Then("status {int} is displayed in the response")
	public void status_is_displayed_in_the_response(Integer statusCode) {
        assertThat(apiUtility.getResponse().getStatusCode(), equalTo(statusCode));
        JsonPath response = new JsonPath(apiUtility.getResponse().asString());
        System.out.println(response);
	}
	
	@Then("phone names starting with {string} is displayed in the response")
	public void phone_names_starting_with_is_displayed_in_the_response(String expectedResult) {
		JsonPath jsonPath = new JsonPath(apiUtility.getResponse().asString());
        List<String> phoneNames = jsonPath.getList("name");

        for (String name : phoneNames) {
            if (name.startsWith(expectedResult)) {
                System.out.println(name);
            }
        }

        assertThat(phoneNames, hasItem(startsWith(expectedResult)));
	}
	@Then("phone with lowest cost is displayed")
	public void phone_with_lowest_cost_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("phone id is not null")
	public void phone_id_is_not_null() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
