package Test;
import java.util.ArrayList;
import java.util.List;
import cucumber.
import org.testng.annotations.Test;
public class ParallelRunner {

	@Test
	public void runTest()
	{
		List <String> args =new ArrayList<String>();
		args.add("--threads");
		args.add("2");
		
		args.add("--tags");
		args.add("@jenkins");
		
		args.add("--glue");
		args.add("stepDef");
		
		args.add("--glue");
		args.add("reusables");
		
		args.add("--glue");
		args.add("reusables");
		
		args.add("--plugin");
		String strval=String.format("html:target/cucumber-html-report", new Object[] { "target/test-output" });
		args.add(strval);
		
		args.add("--plugin");
		String strval1=String.format("pretty:target/cucumber-pretty.txt", new Object[] { "target/test-output" });
		args.add(strval1);
		
		args.add("--plugin");
		String strval2=String.format("json:target/cucumber.json", new Object[] { "target/test-output" });
		args.add(strval2);
		
		args.add("--plugin");
		String strval3=String.format("com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", new Object[] { "target/test-output" });
		args.add(strval3);
		
		args.add("--plugin");
		String strval4=String.format("usage:target/cucumber-usage.json", new Object[] { "target/test-output" });
		args.add(strval4);
		
		args.add("src/main/resources/Features");
		
		try {
			      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			     
			      Runtime cruntime = Runtime.builder().withArgs(args).withClassLoader(classLoader).build();
			      cruntime.run();
			       if (Integer.valueOf(cruntime.exitStatus()).intValue() == 0)
			         return true; 
			 
			       return false;
			 
			    } catch (Exception e) {
			    
			       return false;
		     } 
		
		
	}
}
