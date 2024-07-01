package com.shiftleftautomation.ui.definitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shiftleftautomation.ui.pages.LandingPage;
import com.shiftleftautomation.ui.pages.PageObjectManager;
import com.shiftleftautomation.ui.utility.GenericUtility;
import com.shiftleftautomation.ui.utility.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {
	
//	this page should always have a constructur which will invoke testcontext for getting driver details
//	objects for landing pages and pageobject factory for invoking dependency injection
	
	public TestContextSetup testContextSetup;
	public PageObjectManager pageObjectManager;
	public LandingPage landingPage;
	//public WebDriver driver;

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
		
	}

	@Given("the user is on {string} page")
	public void the_user_is_on_page(String string) throws InterruptedException {

		

	}

	@Given("user searches for {string} in search field")
	public void user_searches_for_in_search_field(String searchInput) throws InterruptedException {
		landingPage.searchGroceries(searchInput);
		

	}

}
