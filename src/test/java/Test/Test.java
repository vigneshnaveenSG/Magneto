package Test;



import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;





public class Test {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
	
	/*	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.setCapability("browserName", "Chrome");
		options.setCapability("version", "113.0");
		options.setCapability("platform", "Windows 10");
		options.setCapability("resolution", "1920x1080");
		options.setCapability("build", "LambdaTestSampleApp"); // CI/CD job or build name;
		options.setCapability("name", "LambdaTestJavaSample"); // Test name
		options.setCapability("tunnel",true);
		options.setCapability("network",true);
		options.setCapability("console",true);
		options.setCapability("terminal",true);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);*/
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("114.0");
		browserOptions.addArguments("--ignore-ssl-errors=yes");
		browserOptions.addArguments("--ignore-certificate-errors");
		
		HashSet<String> ab = new HashSet<>();
		ab.add("New.PNG");
		
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "vigneshnaveen.sg");
		ltOptions.put("accessKey", "uFtHAT3LK2KeY4kRcEk1di09UOZ09UsakTDKG1WZmjGMVuQqkp");
		ltOptions.put("project", "Untitled");
		ltOptions.put("selenium_version", "4.0.0");
		ltOptions.put("resolution", "1366x768");
		ltOptions.put("w3c", true);
		ltOptions.put("plugin", "java-java");
		ltOptions.put("tunnel",true);
		ltOptions.put("lambda:userFiles",ab);
		browserOptions.setCapability("LT:Options", ltOptions);
		
		
		

		String hubUrl="https://vigneshnaveen.sg:9gH5OtSNALqQPP03qYHWiNx61gMZAy4bST57IK19pO4Tl7ln1Q@hub.lambdatest.com/wd/hub";
		
		WebDriver driver;
		try {
			driver = new RemoteWebDriver(new URL(hubUrl), browserOptions);
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pmsit.w360.cginet/pmcore/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test.wops");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Everest.1");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until((ExpectedCondition<Boolean>) wd ->
		((JavascriptExecutor) wd).executeScript("return document.readyState").toString().equals("complete"));
		
System.out.println(((JavascriptExecutor) driver).executeScript("return document.readyState").toString());
		driver.findElement(By.xpath("//button[@class='menu-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(), 'Operations')]/parent::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(), 'Operations')]/parent::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='menu-toggle']")).click();
		Thread.sleep(2000);		
		
		driver.findElement(By.xpath("//button[@class='menu-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(), 'Operations')]/parent::button")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Management Fees')]/parent::button")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Master Fee Rule')]/parent::button")).click();
		Thread.sleep(2000);
		//String str = "C:\\\\Users\\\\ltuser\\\\Downloads\\\\New.PNG";
		//String tempstr=downloadImageToTemporaryLocation(str);
		
		Robot robot = new Robot();
		robot.mouseMove(500, 70);

		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		
		int heightAfter;
		int heightBefore;
		Dimension size;
		
		size = driver.manage().window().getSize();
		heightBefore = size.getHeight();
		System.out.println("Heighnt before-->"+heightBefore);
		System.out.println("size before-->"+size);
		
		Dimension d = new Dimension(420, 600);
		driver.manage().window().setSize(d);
		
		driver.manage().window().maximize();
		
		size = driver.manage().window().getSize();
		heightAfter = size.getHeight();
		
		System.out.println("Heighnt before-->"+heightAfter);
		System.out.println("size before-->"+size);
		
		Screen s = new Screen();
		//Pattern login = new Pattern("C:\\Users\\ltuser\\Downloads\\New.PNG");
		Pattern login = new Pattern("C:\\Vignesh\\Learning\\MagnetoProject\\src\\main\\resources\\img\\New.PNG");
		s.click(login);
		
		driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
