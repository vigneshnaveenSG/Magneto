package reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import reports.reportsImplementation;

public class uiActionSteps extends DriverManager{
	
	//public WebDriver driver;
	public WebElement webEle;
	reportsImplementation  rep= new reportsImplementation();
	WebDriverWait wait = WebDriverWait(driver, 1000);
	
	public void launchBrowser(String url) throws Exception
	{
		driver.get(url);
		driver.manage().window().maximize();
		rep.info("Driver is launched successfully");
	}
	
	private WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void clickElement(String actToBePerformed,String fldName) throws Exception
	{
		webEle=driver.findElement(xmlParser.LoadOR(fldName));
		Thread.sleep(1000);  
		
		Actions Act = new Actions(driver);
		
		if(webEle.isDisplayed())
		{
			
			rep.info(fldName+" is displayed successfully");
		
			switch (actToBePerformed.toLowerCase())
			{
			case "click":
			case "clicked":
				try {
					webEle.click();									
					Thread.sleep(1000);
					rep.pass(fldName+"is clickeked successfully");
					
					break;
				}
				catch(Exception e)
				{
					rep.fail(fldName+"is not clicked successfully");
					e.printStackTrace();
				}
				
				
			case "hover":
				try {
					Act.moveToElement(webEle).perform();
					Thread.sleep(1000);
					rep.pass(fldName+" is hovered successfully");
					break;
				}
				catch(Exception e)
				{
					rep.pass(fldName+" is not hovered successfully");
					e.printStackTrace();
				}
				
			case "hoverClick":
				try {
					Act.click(webEle).perform();
					
					rep.pass(fldName+"is clicked successfully");
					Thread.sleep(1000);
					break;
				}
				catch(Exception e)
				{
					rep.fail(fldName+"is not clicked successfully");
					e.printStackTrace();
				}
			}
		}
			else
			{
				rep.fail(fldName+"is clicked successfully");				;
			}
		
	}
	
	public void enterText(String actionTobePerformed,String fldName,String value) throws Exception
	{
		webEle =driver.findElement(xmlParser.LoadOR(fldName));
		Thread.sleep(1000);  
		
		if(webEle.isDisplayed())
		{
			rep.info(fldName+" is displayed successfully");
				switch (actionTobePerformed.toLowerCase())
				
				{
				case "entered":
					try {
						webEle.sendKeys(value);
					rep.pass(value+"entered in "+ fldName+"  successfully");
					}
					catch(Exception e)
					{
						rep.fail(value+"entered in "+ fldName+"  successfully");
						e.printStackTrace();
					}
					break;
				case "selects":
				case "selected":
					try
					{
					Select sel = new Select(webEle);
					sel.selectByVisibleText(value);
					rep.fail(value+" selected in "+ fldName+" listbox successfully");
					}
					catch(Exception e)
					{
						rep.fail(value+"not selected in "+ fldName+" listbox successfully");
						e.printStackTrace();
					}
					break;
				}
				
			}
		else
		{ 
			rep.info(fldName+" is not displayed successfully");
		}
	}
	
	
	public void isDisplayed(String fldName) throws Exception
	{
		webEle =driver.findElement(xmlParser.LoadOR(fldName));
		Thread.sleep(1000);  
		if(webEle.isDisplayed())
		{
			try {
				
				rep.pass(fldName+" is displayed successfully");
			}
			catch(Exception e)
			{
				rep.fail(fldName+" is not displayed successfully");
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean updateXmlDom(String fldName, String fldValue)
	{
		boolean bln=xmlParser.updateXmlOR(fldName,fldValue);
		return bln;
	}
}
