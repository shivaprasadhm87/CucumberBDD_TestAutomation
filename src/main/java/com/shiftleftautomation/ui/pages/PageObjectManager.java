package com.shiftleftautomation.ui.pages;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {
	/* This class includes page objects for each pages. This will also invoke driver since
	 * the drivers are always accessed in page. we are invoking
	 * constructer with webdriver and also calling objects for each page class. 
	 */

	public WebDriver driver;
	public LandingPage landingPage;
	public TopDealsPage hotDealsPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	public LandingPage getLandingPage() {
		landingPage= new LandingPage(driver);
		 return landingPage;
	}
	
	public TopDealsPage getTopDealsPage() {
		hotDealsPage= new TopDealsPage(driver);
		 return hotDealsPage;
	}
}
