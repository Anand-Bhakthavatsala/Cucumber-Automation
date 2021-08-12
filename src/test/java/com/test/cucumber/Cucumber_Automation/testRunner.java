package com.test.cucumber.Cucumber_Automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="Feature",
	glue= {"stepDefinitions"}	
)

public class testRunner {

}
