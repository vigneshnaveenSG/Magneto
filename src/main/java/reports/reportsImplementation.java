package reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import io.cucumber.java.Scenario;
import reusables.DriverManager;




public class reportsImplementation extends DriverManager implements reportsInterface {
	
	private static  Scenario scenario;
	
	public void reportsInitialization(Scenario scenario)
	{
		this.scenario = scenario;
	}

	@Override
	public void pass(String msg) {
		// TODO Auto-generated method stub
		
	scenario.log("[PASS]"+msg);		
		Assert.assertTrue(true,msg);
		byte[] screenShotFileObj = takeScreenShot();
		scenario.attach(screenShotFileObj, "image/png", "");
		
	}

	

	@Override
	public void fail(String msg) {
		// TODO Auto-generated method stub
		scenario.log(" [FAIL] "+msg);
		byte[] screenShotFileObj = takeScreenShot();
		scenario.attach(screenShotFileObj, "image/png", "");
		Assert.assertFalse(false,msg);
		
	}

	@Override
	public void info(String msg) {
		// TODO Auto-generated method stub
		
		scenario.log(" [INFO] "+msg);
		Assert.assertTrue(true,msg);
		
	}

	@Override
	public void warning(String msg) {
		// TODO Auto-generated method stub
		scenario.log(" [WARNING] "+msg);
		Assert.assertTrue(true,msg);
	}
	
	private byte[] takeScreenShot() {
		// TODO Auto-generated method stub
		TakesScreenshot ss = (TakesScreenshot)driver;
	
		byte[] ssFileObj = ss.getScreenshotAs(OutputType.BYTES);
		return ssFileObj;
	}
	
}
