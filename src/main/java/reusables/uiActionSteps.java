package reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class uiActionSteps extends DriverManager{
	
	//public WebDriver driver;
	public WebElement wele;
	
	public void launchBrowser(String url) throws Exception
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void clickElement(String actToBePerformed,String fldName)
	{
		wele =driver.findElement(xmlParser.LoadOR(fldName));
		
		Actions Act = new Actions(driver);
		
		if(wele.isDisplayed())
		{
			System.out.println(fldName+" is displayed ");
		
			switch (actToBePerformed.toLowerCase())
			{
			case "click":
			case "clicked":
				try {
					wele.click();
					System.out.println(fldName+" is clicked successfully");
					Thread.sleep(1000);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			case "hover":
				try {
					Act.moveToElement(wele).perform();
					
					System.out.println(fldName+" is hovered successfully");
					Thread.sleep(1000);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			case "hoverClick":
				try {
					Act.click(wele).perform();
					
					System.out.println(fldName+" is hovered successfully");
					Thread.sleep(1000);
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public void enterText(String actionTobePerformed,String fldName,String value)
	{
		wele =driver.findElement(xmlParser.LoadOR(fldName));
		
		if(wele.isDisplayed())
		{
			try {
				switch (actionTobePerformed.toLowerCase())
				
				{
				case "entered":
					wele.sendKeys(value);
					break;
				case "selects":
				case "selected":
					Select sel = new Select(wele);
					sel.selectByVisibleText(value);
					break;
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void isDisplayed(String fldName)
	{
		wele =driver.findElement(xmlParser.LoadOR(fldName));
		if(wele.isDisplayed())
		{
			try {
				System.out.println(fldName+" ELement is displayed Successfully");
			}
			catch(Exception e)
			{
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
