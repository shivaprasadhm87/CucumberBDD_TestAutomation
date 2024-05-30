package com.shiftleftautomation.definitions;

import java.util.List;
import java.util.Optional;

import org.apache.http.HttpStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhoneSvcDefinitions {


	@Given("the {string} endpoint is available")
	public void the_endpoint_is_available(String serviceName) {

	}

	@When("{string} is called")
	public void service_is_called(String serviceName) {
	}

	@Then("status 200 is displayed in the response")
	public void status_200_is_displayed_in_the_response() {
	}

	@Then("phone names starting with {string} is displayed in the response")
	public void phone_names_starting_with_is_displayed_in_the_response(String prefix) {
		}
	

	@Then("phone with lowest cost is displayed")
	public void phone_with_lowest_cost_is_displayed() {
		
	}

	@Then("phone id is not null")
	public void phone_id_is_not_null() {
		
	}

	// Phone class should be defined or imported
	public static class Phone {
		private String id;
		private String name;
		private double cost;

		// Getters and setters

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}
	}
}
