package com.shiftleftautomation.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	// This is a page object class and using driver as default constructur 
	
	public static final String SEARCH_GROCERIES = "//input[@type='search']";
	@FindBy(xpath = SEARCH_GROCERIES)
	private WebElement searchgroceries;
	
	By searchResult = By.xpath("//div/h4");
	public WebDriver driver;
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchGroceries(String searchInput) {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(searchInput);
		driver.findElement(By.xpath("//button[@class='search-button']")).click();
		
	}
	

	
	

}
