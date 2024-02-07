package StepDefinition;

import java.util.Set;

import org.openqa.selenium.By;

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

public class Dealer_Admin_Dashboard 
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
	
	String ParentWin;
	String StoreName;
	
	@Given("Open the Dealer Admin - Dashboard BaseURL and StoreID")
	public void openTheDealerAdminDashboardBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Department page

		
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"dashboard");
	}
	
	@Given("Check the Core\\/Basic Plan Tile is Displayed")
	public void checkTheCoreBasicPlanTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Core_Basic_Plan_Tile, "Core/Basic Plan Tile");
	}
	@Given("Check the Pro Plan Tile is Displayed")
	public void checkTheProPlanTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(lap.Pro_Plan_Tile, "Pro Plan Tile");
	}
	@Given("Check the Enterprise Plan Tile is Displayed")
	public void checkTheEnterprisePlanTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(lap.Enterprise_Plan_Tile, "Enterprise Plan Tile");
	}
	@Given("Check Sales_Last2Days Tile is Displayed")
	public void checkSalesLast2DaysTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(lap.Sale_Last_2_Days_Tile, "Sales: Last 2 days Tile");
	}
	@Given("Check Sales_Last2to7Days Tile is Displayed")
	public void checkSalesLast2to7DaysTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(lap.Sale_Last_2_To_7_Days_Tile, "Sales: Last 2 to 7 days Tile");
	}
	@Given("Check Sales_Last7to30Days Tile is Displayed")
	public void checkSalesLast7to30DaysTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(lap.Sale_Last_7_To_30_Days_Tile, "Sales: Last 7 to 30 days Tile");
	}
	@Given("Check Sales_Over from Last30Days Tile is Displayed")
	public void checkSalesOverFromLast30DaysTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(lap.Sale_Over_From_Last_30_Days_Tile, "Sales: Over from Last 30 days Tile");
	}

	@Given("I Select the Core\\/Basic Plan Tile")
	public void iSelectTheCoreBasicPlanTile() {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Core_Basic_Plan_Tile.click();
	}

	@Given("I Verify Searching the Item and Enable the Show Upgrade")
	public void iVerifySearchingTheItemAndEnableTheShowUpgrade() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    String Store_Name=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText().trim();
	    
	    this.StoreName=Store_Name;
	    
	    cmp.Search_inTable(Store_Name);
	    
	    if(driver.findElement(By.xpath("//td[.=' "+Store_Name+" ']/..//mat-slide-toggle")).isEnabled())
	    {
	    	
	    }
	    else
	    {
	    	driver.findElement(By.xpath("//td[.=' "+Store_Name+" ']/..//mat-slide-toggle")).click();
	    }
	    
	    
	    
		
	}
	@Then("Verify Upgrade Enabled Successfully")
	public void verifyUpgradeEnabledSuccessfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		String Store_Name=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText().trim();
	    cmp.VerifySaveConfirmationAlertMessage(Store_Name+" Upgrade Enabled");
	}
	
	@Given("I Verify Searching the Item and Disable the Show Upgrade")
	public void iVerifySearchingTheItemAndDisableTheShowUpgrade() {
	    // Write code here that turns the phrase above into concrete actions
		 String Store_Name=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText().trim();
		    
		 if(driver.findElement(By.xpath("//td[.=' "+Store_Name+" ']/..//mat-slide-toggle")).isEnabled())
		    {
			 driver.findElement(By.xpath("//td[.=' "+Store_Name+" ']/..//mat-slide-toggle")).click();
		    }
		    else
		    {
		    	
		    }
	}
	@Then("Verify Upgrade Disabled Successfully")
	public void verifyUpgradeDisabledSuccessfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		String Store_Name=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText().trim();
	    cmp.VerifySaveConfirmationAlertMessage(Store_Name+" Upgrade Disabled");
	}
	
	@Given("I Select the Bulk Update Version")
	public void iSelectTheBulkUpdateVersion() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown(lap.Bulk_Update_Veridion_InputBx, "Bulk Update Version Selected");
	}
	
	@Given("I Click the Update All button")
	public void iClickTheUpdateAllButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Click_Update_All();
	}
	
	@Then("Check Update the latest version for All Auto Enabled Store is Displayed")
	public void checkUpdateTheLatestVersionForAllAutoEnabledStoreIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Update_Latest_Version_to_All_Store_PopUpMsg, "Are you sure, you want to update the latest version for all auto enabled store?");
	}
	
	@Then("I Click the No button")
	public void iClickTheNoButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_No_Button();
	}
	
	@Then("I Click the Yes button")
	public void iClickTheYesButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_Yes_Button();
	}
	@Then("Verify the Updated Successfully or not")
	public void verifyTheUpdatedSuccessfullyOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Updated");
	}

	@Given("I Click the New Account button")
	public void iClickTheNewAccountButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Click_New_Account();
	}
	@Then("Check the UPOS Plan Details Page Opened")
	public void checkTheUPOSPlanDetailsPageOpened() throws Exception {
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
		
		Thread.sleep(8000);
		
//		this.ParentWin=ParentWind;
		
		String Get_CurrURL=driver.getCurrentUrl();
		
		cmp.Assertion_Validation_Two_Values(Get_CurrURL, "https://upos.io/signup/plan_details/", "Plan Details page Opened");
		
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(ParentWind);
	}
	@Given("I Search and Select the Store")
	public void iSearchAndSelectTheStore() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		 String Store_Name=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText().trim();
	    cmp.Search_inTable(Store_Name);
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//td[.=' "+Store_Name+" ']/span")).click();
	    
	}
	@Then("Check the Store Details Page Opened")
	public void checkTheStoreDetailsPageOpened() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(6000);
	    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//h3[contains(.,'Account Detail')]")), "Store Detail Page");
	}


	
}
