package com.shiftleftautomation.ui.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericUtility {
	
	/* this class contains generic methods for actions related to selenium
	 * like window switching, enterText, switch to frame
	 */
	
	public WebDriver driver;
	public String vegetable;
	
	public GenericUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchWindowtoChild( ) {
		//Set<String> window = new ArrayList<String>()
		Set<String> window = driver.getWindowHandles();
		Iterator<String> i1 = window.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}

	
	

}
