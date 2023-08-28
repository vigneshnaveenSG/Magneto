package reusables;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;


public class TestHooks extends DriverManager {
	

	@Before(order=0)
	public void loadOR()
	{
				
		loadConfig();
		ORLoader.LoadOR(prop.getProperty("ORPath"));
		
	/*	xmlParser xp = new xmlParser();
		xp.LoadOR("PassWord");*/
	}
	
	@Before(order=1)
	public void setup() throws Exception
	{
		getDriver(prop.getProperty("browser"));
	}
}
