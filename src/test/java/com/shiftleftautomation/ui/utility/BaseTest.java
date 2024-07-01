package com.shiftleftautomation.ui.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	//this class will invoke browser, navigate to home page 
	
	public WebDriver driver;
	

	
	public WebDriver WebDriverManager() throws IOException {
		
	FileInputStream file = new FileInputStream("C:\\Users\\sprasad\\git\\PhoneSvc_BDD\\src\\main\\resources\\globalui.properties");
	Properties prop = new Properties();
	prop.load(file);
	
	String url = prop.getProperty("SQA_URL");
	String browser = prop.getProperty("browser");
	
	if (driver == null) {
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
			}
		driver.get(url);
		
	}
	return driver;
	
	}

}
