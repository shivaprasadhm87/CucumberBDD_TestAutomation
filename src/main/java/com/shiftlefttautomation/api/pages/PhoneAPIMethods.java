package com.shiftlefttautomation.api.pages;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.shiftlefttautomation.*;

public class PhoneAPIMethods {

	public static final String ENV = "dev";

	public String getBaseUri(String endPoint) throws Exception {
		String url = null;
		Properties prop = new Properties();
		InputStream file = new FileInputStream("src/main/resources/phoneSvc.Properties");
		prop.load(file);
		url = prop.getProperty(endPoint);
		String env = prop.getProperty("com.shiftleftautomation.test.environment");

		if (env.equals("")) {
			url = url.replace("{0}", ENV);
		} else {
			url = url.replace("{0}", env);
		}
		return url;

	}

	public String getResource(String resource) throws Exception {
		String service = null;
		Properties prop = new Properties();
		InputStream file = new FileInputStream("src/main/resources/phoneSvc.Properties");
		prop.load(file);
		service = prop.getProperty(resource);
		return service;
	}

}
