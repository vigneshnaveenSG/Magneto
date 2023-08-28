package reusables;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	public void getDriver(String browser) throws Exception
	{
		switch (browser.toLowerCase())
		{
	
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.out.println("Yet to Implement");
			throw new Exception ("Edge browser is not yet implemented");
		
		case "remote":
			System.out.println("Yet to Implement");
			throw new Exception ("Remote browser is not yet implemented");
		}
	}
	
	public void loadConfig()
	{
		try {
			FileReader fr  = new FileReader("src/main/resources/configFiles/Config.properties");
			BufferedReader br = new BufferedReader(fr);
			prop.load(br);
		//	prop.load(System.getProperties());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
