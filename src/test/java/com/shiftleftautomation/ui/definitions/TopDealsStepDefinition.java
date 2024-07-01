package com.shiftleftautomation.ui.definitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shiftleftautomation.ui.pages.PageObjectManager;
import com.shiftleftautomation.ui.pages.TopDealsPage;
import com.shiftleftautomation.ui.utility.GenericUtility;
import com.shiftleftautomation.ui.utility.TestContextSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TopDealsStepDefinition {
	
	public TopDealsPage topDealsPage;
	WebDriver driver;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	
	public TopDealsStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		topDealsPage = testContextSetup.pageObjectManager.getTopDealsPage();
			
	}
	

	
	@When("user searches for {string} in top detals page")
	public void user_searches_for_in_top_detals_page(String string) {
		
		
		
	}
	
	@Then("{string} is displayed in the search criteria")
	public void is_displayed_in_the_search_criteria(String searchInput) throws InterruptedException {
		
	}
	
	@Then("results matches with data displayed landing page")
	public void results_matches_with_data_displayed_landing_page() {
	    
}

}