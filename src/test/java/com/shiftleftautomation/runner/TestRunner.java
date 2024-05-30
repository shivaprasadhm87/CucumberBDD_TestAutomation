package com.shiftleftautomation.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions( features = {"src/test/resources/features/PhoneSvc.feature"},
glue = "com.shiftleftautomation.definitions", dryRun = true, plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)

public class TestRunner {

}
