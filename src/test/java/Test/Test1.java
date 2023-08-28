package Test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		//ChromeOptions chromeoption = new ChromeOptions();
		chromeOptions.addArguments("incognito");
		chromeOptions.addArguments("--ignore-ssl-errors=yes");
		chromeOptions.addArguments("--ignore-certificate-errors");
		//chromeOptions.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshnaveen.sg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");		
//		WebDriver driver = new ChromeDriver(chromeOptions);
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://pmqa1.w360.cginet/pmcore/#/dashboard");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test.wops");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Everest.1");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='menu-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(), 'Operations')]/parent::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Management Fees')]/parent::button")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Master Fee Rule')]/parent::button")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@class='menu-toggle']")).click();
		Thread.sleep(2000);	
		Dimension d = new Dimension(1024, 768);
		driver.manage().window().setSize(d);
		driver.manage().window().fullscreen();
	//	driver.manage().window().maximize();
		Screen s = new Screen();
		//Pattern login = new Pattern("C:\\Users\\ltuser\\Downloads\\New.PNG");
		Pattern login = new Pattern("C:\\Vignesh\\Learning\\MagnetoProject\\src\\main\\resources\\img\\MasterFeeRule.png");
		Pattern login1 = new Pattern("C:\\Vignesh\\Learning\\MagnetoProject\\src\\main\\resources\\img\\New.png");
		s.click(login);
		s.type("MF001");
		
		s.click(login1);
		
		driver.quit();

	}

}
