package Test;
import org.testng.annotations.Test;

import io.cucumber.core.cli.Main;

public class ParallelRunner {
	@Test

    public void runTest() {

        // Define the command-line arguments
		
		System.out.println("#####Executing the Parallel Runner###");

        String[] args = {
                "--threads", "1",
                "--tags", "@jenkins",
                "--glue", "stepDef",
                "--glue", "reusables",
                "--plugin", "html:target/cucumber-html-report",
                "--plugin", "pretty:target/cucumber-pretty.txt",
                "--plugin", "json:target/cucumber.json",
                "--plugin", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "--plugin", "usage:target/cucumber-usage.json",
              //  "--dry-run",
             //   "--monochrome",
                "src/test/resources/Features/wordpress.feature"
        };

        try {
            // Run Cucumber using Main.run with the arguments
            Main.run(args, Thread.currentThread().getContextClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
