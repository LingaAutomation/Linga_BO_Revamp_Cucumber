package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:Product_and_Items_Features"}//"src/test/resources",
	,glue={"StepDefinition"},monochrome=true,
	plugin= {"pretty", 
		"html:target/cucumber/report.html",
		"de.monochromata.cucumber.report.PrettyReports:target/cucumber-html-reports", 
//		"html:test-output","json:target/json_output/cucumber.json",
//		"html:target/cucumber-html-report"
		}, dryRun = true,snippets = CAMELCASE
		, tags = "@Menu_Items"
		)
//Strict Removed from Cucumber-7.0.0. So that, strict=true or false won't work and Strict default as "true" from 7.0.0

public class RunnerClass {

} 
 