package com.shiftleftautomation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions( tags = "@Smoke", features = {"src/test/resources/features/"},
glue = "com.shiftleftautomation.definitions", dryRun = false, plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
