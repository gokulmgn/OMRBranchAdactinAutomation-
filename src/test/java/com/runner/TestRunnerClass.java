package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@tc"),publish = true, plugin = { "pretty",
		"json:target\\output.json" }, monochrome = true, dryRun = false , snippets = SnippetType.CAMELCASE, features = "src\\test\\resources",glue="com.stepdefinition")
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmReport(System.getProperty("user.dir") + "\\target\\output.json");
	}

}
