package reusables;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import reports.reportsImplementation;


public class TestHooks extends DriverManager {
	
	Scenario scenario;

	@Before(order=0)
	public void loadOR(Scenario sce) throws Exception
	{
				
		loadConfig();
		ORLoader.LoadOR(prop.getProperty("ORPath"));
		reportsImplementation  rep= new reportsImplementation();
		rep.reportsInitialization(sce);
		//getDriver(prop.getProperty("browser"));
		
	/*	xmlParser xp = new xmlParser();
		xp.LoadOR("PassWord");*/
	}
	
/*	@Before(order=1)
	public void setup(Scenario sce) throws Exception
	{
		reportsImplementation  rep= new reportsImplementation();
		rep.reportsInitialization(sce);
		getDriver(prop.getProperty("browser"));
	}*/
	
	@After()
	public void closeDriver()
	{
		driver.close();
		//rep.info("Driver is closed");
	} 
} 
