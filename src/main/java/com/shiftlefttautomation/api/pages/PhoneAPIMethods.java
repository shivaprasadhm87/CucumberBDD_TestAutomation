package com.shiftlefttautomation.api.pages;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.shiftlefttautomation.*;

import io.opentelemetry.api.internal.StringUtils;

public class PhoneAPIMethods {

	public static final String ENV = "dev";

	public String getBaseUri(String endPoint) throws Exception {
		String url = null;
		Properties prop = new Properties();
		InputStream file = new FileInputStream("src/main/resources/phoneSvc.Properties");
		prop.load(file);
		url = prop.getProperty("phone_svc");
		String env = prop.getProperty("com.shiftleftautomation.test.environment");
		
		if (env == "") {
			url = url.replace("{0}", ENV);
		}
		else {
			url = url.replace("{0}", env);
		}
		return url;
		
	}
	
	public String getService(String Svc) throws Exception {
		String service = null;
		Properties prop = new Properties();
		InputStream file = new FileInputStream("src/main/resources/phoneSvc.Properties");
		prop.load(file);
		service = prop.getProperty(Svc);
		return service;
	}
	
	//public String get

}
