package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Test3 {

	public static void main(String[] args) throws  InterruptedException, MalformedURLException, FindFailed {
		// TODO Auto-generated method stub
	/*	ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("109.0");
		browserOptions.addArguments("--ignore-ssl-errors=yes");
		browserOptions.addArguments("--ignore-certificate-errors");
		
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "vigneshnaveen.sg");
		ltOptions.put("accessKey", "9gH5OtSNALqQPP03qYHWiNx61gMZAy4bST57IK19pO4Tl7ln1Q");
		ltOptions.put("project", "Untitled");
		ltOptions.put("selenium_version", "4.0.0");
		ltOptions.put("resolution", "1366x768");
		ltOptions.put("w3c", true);
		ltOptions.put("plugin", "java-java");
		ltOptions.put("tunnel",true);
		
		browserOptions.setCapability("LT:Options", ltOptions);
		
		String hubUrl="https://vigneshnaveen.sg:9gH5OtSNALqQPP03qYHWiNx61gMZAy4bST57IK19pO4Tl7ln1Q@hub.lambdatest.com/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), browserOptions);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	//	Screen s = new Screen();
		Screen s = new Screen();
		Pattern login = new Pattern("C:\\Vignesh\\Learning\\MagnetoProject\\src\\main\\resources\\img\\gmail.png");
		s.click(login);  */
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshnaveen.sg\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setBrowserVersion("116");
		WebDriver driver = new ChromeDriver(browserOptions);
		driver.get("https://www.google.com");
		

	}

}
