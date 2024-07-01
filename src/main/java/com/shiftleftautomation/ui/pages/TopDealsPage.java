package com.shiftleftautomation.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopDealsPage {
	
	public WebDriver driver;


	public  TopDealsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToTopDealsPage() {
		driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();

	}
	
	
	 

}
