package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "com.stepDefinitions",  plugin = { "pretty",
		"html:target/cucumber.html", "json:target/cucumber.json" })
public class RunnerTest {

}
