package Test;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/main/resources/Features",
		glue={"stepDef","reusables"},
		tags="@develop",
		plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
		 
		"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json"},
				
		dryRun = false,
		monochrome = true
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
