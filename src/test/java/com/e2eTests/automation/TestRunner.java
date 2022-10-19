package com.e2eTests.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"},
		plugin = {"pretty", "html:target/cucumber-reports"},
		snippets = SnippetType.CAMELCASE,
		tags = {("@authentification")}
		)
public class TestRunner {
	
	

}