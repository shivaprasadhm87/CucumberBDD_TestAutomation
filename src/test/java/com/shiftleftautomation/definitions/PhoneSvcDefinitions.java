package com.shiftleftautomation.definitions;

import org.apache.commons.exec.util.StringUtils;

import com.shiftlefttautomation.api.pages.Constants;
import com.shiftlefttautomation.api.pages.PhoneAPIMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PhoneSvcDefinitions  {
	
	private String request = "";
	private String endPoint = "";
	private Response responseBody;
	private PhoneAPIMethods phoneapimethods = new PhoneAPIMethods();
	private Constants httpmethod = new Constants();

	@Given("the {string} endpoint is available")
	public void the_endpoint_is_available(String request) throws Exception {
		String baseuri = phoneapimethods.getBaseUri(request);
		String service = phoneapimethods.getService(request);
		//String service = httpmethod.api_method_get;
		endPoint = baseuri.concat(service);
		System.out.println(endPoint);
	   
	}
	@When("{string} is called")
	public void is_called(String endPoint) {
		RequestSpecification request = RestAssured.given();
		responseBody = request.get(endPoint);
		System.out.println(endPoint);
	  
	}
	@Then("status {int} is displayed in the response")
	public void status_is_displayed_in_the_response(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("phone names starting with {string} is displayed in the response")
	public void phone_names_starting_with_is_displayed_in_the_response(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
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
