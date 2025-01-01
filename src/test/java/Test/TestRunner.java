package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="target/Magneto/src/test/resources/Features/wordpress.feature",
		glue={"stepDef","reusables"},
		tags="@jenkins",
		plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				
		dryRun = false,
		monochrome = true
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@Test
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		System.out.println("#####Executing the Linear Runner###");
		return super.scenarios();
	}

}
