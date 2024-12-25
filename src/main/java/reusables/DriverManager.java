package reusables;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	 private ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();  
	
	public void getDriver(String browser) throws Exception
	{
		switch (browser.toLowerCase())
		{
	
		case "chrome":
		//	ChromeOptions options = new ChromeOptions();
		//	options.setBrowserVersion("116.0");
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\.cache\\selenium\\chromedriver\\win64\\\\116.0.5845.96\\chromedriver.exe");  
			 threadLocal.set(new ChromeDriver());
			driver = threadLocal.get();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.out.println("Yet to Implement");
			throw new Exception ("Edge browser is not yet implemented");
		
		case "remote":
			String grid_url = "http://hub:4444/wd/hub";
			ChromeOptions chromeOptions = new ChromeOptions();
			
			driver = new RemoteWebDriver(new URL(grid_url), chromeOptions);
			
		}
	}
	
	public void loadConfig()
	{
		try {
			FileReader fr  = new FileReader("target/Magneto/src/test/resources/configFiles/Config.properties");
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
