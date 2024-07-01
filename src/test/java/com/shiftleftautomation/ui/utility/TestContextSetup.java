package com.shiftleftautomation.ui.utility;

import java.io.IOException;

import com.shiftleftautomation.ui.pages.PageObjectManager;

public class TestContextSetup {
	
	public BaseTest baseTest;
	public PageObjectManager pageObjectManager;
	public GenericUtility genericUtility;
	
	
	public TestContextSetup() throws IOException {
		baseTest = new BaseTest();
		//creating object to invoke driver from base tset web driver manager class
		pageObjectManager = new PageObjectManager(baseTest.WebDriverManager());
		genericUtility = new GenericUtility(baseTest.WebDriverManager());
		

	}

}
