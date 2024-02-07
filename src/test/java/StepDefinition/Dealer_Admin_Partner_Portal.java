package StepDefinition;

import java.util.Set;

import org.testng.Assert;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Dealer_Admin_Partner_Portal 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage rp=new ReportsPage();
	String parentWinPart;
	
	
	@Given("I Select Dealer Portal Module")
	public void iSelectDealerPortalModule() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   lap.Select_Partner_Portal_Option_inModule();
	}
	@Then("Verify URL as https:\\/\\/www.lingaros.com\\/partners\\/partner-resource-center\\/ Opened or Not")
	public void verifyURLAsHttpsWwwLingarosComPartnersPartnerResourceCenterOpenedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		String ParentWind=driver.getWindowHandle();
		Set<String> childwins=driver.getWindowHandles();
		
		for(String ChildWin:childwins)
		{
			if(!ChildWin.equals(ParentWind))
			{
				driver.switchTo().window(ChildWin);
			}
		}
		
		this.parentWinPart=ParentWind;
		
	    String GetCurrentURL=driver.getCurrentUrl();
	    
	    Assert.assertEquals(GetCurrentURL, "https://www.lingaros.com/partners/partner-resource-center/", "Partner Portal URL is Navigated Successfully");

	}

	@Then("Verifying the Dealer Portal Header Page")
	public void verifyingTheDealerPortalHeaderPage() {
	    // Write code here that turns the phrase above into concrete actions
		String pageTitle=driver.getTitle();
		
	    Assert.assertEquals(pageTitle, "Partner Resource Center - LINGA Restaurant POS System", "Partner Portal Opened Successfully");
	    
	    driver.close();
	    
	    driver.switchTo().window(parentWinPart);
	}



}
