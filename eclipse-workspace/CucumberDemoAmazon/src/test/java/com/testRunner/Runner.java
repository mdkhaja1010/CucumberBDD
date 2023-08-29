package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features\\login.feature", 
glue= {"com.stepdefinitions","com.hooks"},
dryRun=false,
publish=true,
plugin= {"pretty","html:test-output",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
) 
public class Runner {
	

}
