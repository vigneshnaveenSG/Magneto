package reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Scenario;
import reports.reportsImplementation;

public class uiActionSteps extends DriverManager{
	
	//public WebDriver driver;
	public WebElement wele;
	reportsImplementation  rep= new reportsImplementation();
	
	public void launchBrowser(String url) throws Exception
	{
		driver.get(url);
		driver.manage().window().maximize();
		rep.info("Driver is launched successfully");
	}
	
	public void clickElement(String actToBePerformed,String fldName)
	{
		wele =driver.findElement(xmlParser.LoadOR(fldName));
		
		Actions Act = new Actions(driver);
		
		if(wele.isDisplayed())
		{
			
			rep.info(fldName+" is displayed successfully");
		
			switch (actToBePerformed.toLowerCase())
			{
			case "click":
			case "clicked":
				try {
					wele.click();									
					Thread.sleep(1000);
					rep.pass(fldName+"is clickeked successfully");
					
					break;
				}
				catch(Exception e)
				{
					rep.fail(fldName+"is not clickeked successfully");
					e.printStackTrace();
				}
				
				
			case "hover":
				try {
					Act.moveToElement(wele).perform();
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
					Act.click(wele).perform();
					
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
	
	public void enterText(String actionTobePerformed,String fldName,String value)
	{
		wele =driver.findElement(xmlParser.LoadOR(fldName));
		
		if(wele.isDisplayed())
		{
			rep.info(fldName+" is displayed successfully");
				switch (actionTobePerformed.toLowerCase())
				
				{
				case "entered":
					try {
					wele.sendKeys(value);
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
					Select sel = new Select(wele);
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
	
	
	public void isDisplayed(String fldName)
	{
		wele =driver.findElement(xmlParser.LoadOR(fldName));
		if(wele.isDisplayed())
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
