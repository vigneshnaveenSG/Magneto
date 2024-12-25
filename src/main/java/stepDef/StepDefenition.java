package stepDef;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusables.DriverManager;
import reusables.PageObject;
import reusables.TestHooks;
import reusables.uiActionSteps;
import reusables.xmlParser;

public class StepDefenition extends DriverManager {

	//	public WebDriver driver;
		uiActionSteps ui = new uiActionSteps();
		

@Given("Launch the Magneto application")
public void launch_the_magneto_application() {
		  
			String url=prop.getProperty("URL");	
			
			try {
				getDriver(prop.getProperty("browser"));
				ui.launchBrowser(url);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Then("^Verify (.*) page is displayed$")
		public void verify_home_page_is_displayed(String fldname) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions			
			xmlParser.pg.setName(fldname);					    
		}
		
		@Then("^User (click|clicks|Clicks|Click|Hover|hover|Clicked|clicked|hoverClick) on (.*) (?:link|textbox|button|logo|Logo|Button|Textbox|Link|link|Menu|menu)$")
		public void user_click_on_sign_in_link(String actionTobePerformed, String fldname) throws Exception {
		    // Write code here that turns the phrase above into concrete actions					
			ui.clickElement(actionTobePerformed,fldname);					    
		}

		
		@When("^User (entered|selected|selects|Selects) the (.*) in (.*) (?:textbox|listbox)$")
		public void user_entered_the_in_email_textbox(String actionTobePerformed,String value , String fldName) throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   ui.enterText(actionTobePerformed,fldName, value);
		}
	
		
		@Then("^(?:verify|Verify|check|Check) (.*) (?:link|textbox|button|logo|Logo|Button|Textbox|Link|section|Section|element) is (?:displayed|visible|Displayed|Visible|exist|Exist)$")
		public void verify_luma_logo_is_displayed(String fldname ) throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		    ui.isDisplayed(fldname);
		}
		
		
		@Then("^(?:verify|Verify|check|Check) \"(.*)\" (?:item|message) is displayed in (.*) Section$")
		public void verify_item_is_displayed_in_hotseller_section(String fldvalue, String fldname) throws Exception {
		   if( ui.updateXmlDom(fldname,fldvalue))
		   {
			   ui.isDisplayed(fldname);
		   }
		    
			
		}
		@Then("^(?:verify|Verify|check|Check) the \"(.*)\" item available in below (.*)$")
		@Then("^(?:verify|Verify|check|Check) the \"(.*)\" item has (.*) section")
		public void verify_the_item_available_in_below_sizes(String fldvalue,String fldname, DataTable dataTable) throws Exception {
			List <String> ls =dataTable.asList();
			boolean bln=ui.updateXmlDom(fldname,fldvalue);
			for(int i=0;i<=ls.size()-1;i++)
			{
				if(bln && ui.updateXmlDom(fldname,ls.get(i)))
				{
					ui.isDisplayed(fldname);
					
				}
				
			}
			
		}
		
	
		@Then("verify below error message is displayed in (.*) Section")
		public void verify_below_error_message_is_displayed_in_size_section(String fldname, DataTable dataTable) throws Exception {
			List <String> ls =dataTable.asList();
			for(int i=0;i<=ls.size()-1;i++)
			{
				ui.updateXmlDom(fldname,ls.get(i));
				ui.isDisplayed(fldname);
			}
		}
		
		@Then("User wait for {int} seconds")
		public void user_wait_for_seconds(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		   try {
			Thread.sleep(int1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		}

	}


