package com.shiftleftautomation.definitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.startsWith;
import static org.testng.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shiftleftautomation.utility.ApiUtility;
import com.shiftlefttautomation.api.pages.Constants;
import com.shiftlefttautomation.api.pages.Phone;
import com.shiftlefttautomation.api.pages.PhoneAPIMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PhoneSvcDefinitions {

	ApiUtility apiUtility = new ApiUtility();
	private String request = "";
	private String endPoint = "";
	private Response responseBody;
	private PhoneAPIMethods phoneapimethods = new PhoneAPIMethods();
	private List<Phone> phones = new ArrayList<Phone>();
	private JsonPath response;
	private String responseJSON;
	private Phone lowestCostPhone;
	JsonNode jsonNode;

	@Given("the {string} endpoint is available")
	public void the_endpoint_is_available(String request) throws Exception {
		//Set end point with resource 
		apiUtility.setBaseUri(phoneapimethods.getBaseUri(request));
		apiUtility.setEndpoint(phoneapimethods.getResource("phone_svc_resource"));
	}

	@When("request is called")
	public void request_is_called() {
		//sending get request 
		apiUtility.sendRequest(Constants.api_method_get, Constants.api_content_type, "");
	}

	@Then("status {int} is displayed in the response")
	public void status_is_displayed_in_the_response(Integer statusCode) {
		assertThat(apiUtility.getResponse().getStatusCode(), equalTo(statusCode));
		JsonPath response = new JsonPath(apiUtility.getResponse().asString());
		System.out.println(response);
	}

	@Then("phone names starting with {string} is displayed in the response")
	public void phone_names_starting_with_is_displayed_in_the_response(String expectedResult) {
		responseJSON = apiUtility.getResponse().asString();
		response = new JsonPath(responseJSON);
		List<String> phoneNames = response.getList("name");

		for (String name : phoneNames) {
			if (name.startsWith(expectedResult)) {
				System.out.println(name);
			}
		}

		assertThat(phoneNames, hasItem(startsWith(expectedResult)));
	}

	@Then("phone with lowest cost is displayed")
	public void phone_with_lowest_cost_is_displayed() throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		jsonNode = objectMapper.readTree(responseJSON);

		for (JsonNode node : jsonNode) {
			String name = node.get("name").asText();
			if (node.get("data").get("price") != null) {
				double price = node.get("data").get("price").asDouble();
				phones.add(new Phone(name, price));
			}

		}

		lowestCostPhone = phones.stream().min(Comparator.comparingDouble(Phone::getPrice)).orElse(null);

		if (lowestCostPhone != null) {
			System.out.println("Lowest cost phone found: " + lowestCostPhone.getName() + " with price: "
					+ lowestCostPhone.getPrice());
		} else {
			System.out.println("No phone found.");
		}

	}

	@Then("phone id is not null")
	public void phone_id_is_not_null() {
		List<String> ids = response.getList("id");

		for (String id : ids) {
			assertNotNull(id, "Id should not be null");
		}
	}

}
