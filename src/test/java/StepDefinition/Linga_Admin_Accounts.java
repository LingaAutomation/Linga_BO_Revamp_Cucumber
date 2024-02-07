package StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.Pages.Settings_StoreInformation_Page;
import com.Pages.TaxesPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Linga_Admin_Accounts {

	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage repts=new ReportsPage();

	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	String AccountName, ParentWin;
	
	@Given("Open the Linga Admin - Accounts home page BaseURL and StoreID")
	public void openTheLingaAdminAccountsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Department page

		
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"accounts");
	}
	
	@Given("Verifying the Linga Admin - Accounts Path page")
	public void verifyingTheLingaAdminAccountsPathPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		String home = cmp.Home.getText();
		String path = cmp.path1.getText();
	

		String total = home+path;
		System.out.println(total);

		if(total.equalsIgnoreCase("Admin / Accounts")) {

			test.log(LogStatus.PASS, "Admin Accounts Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Admin Accounts Path is not displayed");
		}
	}
	
	@Given("Check the Back Office Access Date Field is Displayed")
	public void checkTheBackOfficeAccessDateFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.BackOffice_Access_Date_InputBx, "Back Office Access Date Field");
	}
	@Given("Check the Last POS Access Date Field is Displayed")
	public void checkTheLastPOSAccessDateFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Last_POS_Access_Date_InputBx, "Last POS Access Date Field");
	}
	@Given("Check the Expiry Date Field is Displayed")
	public void checkTheExpiryDateFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Expiry_Date_InputBx, "Expiry Date Field");
	}
	@Given("Check the Subscription Status Field is Displayed")
	public void checkTheSubscriptionStatusFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Subscription_Status_InputBx, "Subscription Status Field");
	}
	@Given("Check the Plan Field is Displayed")
	public void checkThePlanFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Plan_InputBx, "Plan Field");
	}
	@Given("Check the Industry Type Field is Displayed")
	public void checkTheIndustryTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Industry_Type_InputBx, "Industry Type Field");
	}
	@Given("Check the Business Type Field is Displayed")
	public void checkTheBusinessTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Business_Type_InputBx, "Business Type Field");
	}

	@Given("I Select the Subscription Status as Live")
	public void iSelectTheSubscriptionStatusAsLive() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Live");
	}
	@Then("Verify the Total Accounts and Details Reports Displayed or not")
	public void verifyTheTotalAccountsAndDetailsReportsDisplayedOrNot() {
	    // Write code here that turns the phrase above into concrete actions

		try
		{
			if(repts.No_Records_FoundInfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "No Records Founds");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception k)
		{
		//Get the Total Accounts
		String Total_Accounts=driver.findElement(By.xpath("//span[contains(.,'Total Accounts:')]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
//		int Total_Accounts=Integer.parseInt(Total_Accs);
		
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		for(int i=1;i<=3;i++)
		{
		
			String AccountName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
			String AccountType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
			String IndustryType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
			String BusinessType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
			String Status=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[12]")).getText();
		
		
		
			test.log(LogStatus.PASS, "Account Name : "+AccountName+" Account Type : "+AccountType+" Plan : "+Plan+" Industry Type : "+IndustryType+" Business Type : "+BusinessType+" Status : "+Status);
		}
		}
		
	}
	
	@Given("I Select the Subscription Status as Trail Expired")
	public void iSelectTheSubscriptionStatusAsTrailExpired() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Trail Expired");
	}

	@Given("I Select the Subscription Status as Dunning")
	public void iSelectTheSubscriptionStatusAsDunning() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Dunning");
	}

	@Given("I Select the Subscription Status as Unpaid")
	public void iSelectTheSubscriptionStatusAsUnpaid() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Unpaid");
	}

	@Given("I Select the Subscription Status as Non Renewing")
	public void iSelectTheSubscriptionStatusAsNonRenewing() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Non Renewing");
	}

	@Given("I Select the Subscription Status as Cancelled")
	public void iSelectTheSubscriptionStatusAsCancelled() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Cancelled");
	}

	@Given("I Select the Subscription Status as Creation Failed")
	public void iSelectTheSubscriptionStatusAsCreationFailed() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Creation Failed");
	}

	@Given("I Select the Subscription Status as Cancelled From Dunning")
	public void iSelectTheSubscriptionStatusAsCancelledFromDunning() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Cancelled From Dunning");
	}
	@Given("I Select the Subscription Status as Expired")
	public void iSelectTheSubscriptionStatusAsExpired() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Expired");
	}

	@Given("I Select the Subscription Status as Trail")
	public void iSelectTheSubscriptionStatusAsTrail() {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_Subscription_Status("Trail");
	}


@Given("I Select the Subscription Status as Future")
public void iSelectTheSubscriptionStatusAsFuture() {
    // Write code here that turns the phrase above into concrete actions
	lap.Select_Subscription_Status("Future");
}
@Given("I Select the Subscription Status as No Subscription")
public void iSelectTheSubscriptionStatusAsNoSubscription() {
    // Write code here that turns the phrase above into concrete actions
	lap.Select_Subscription_Status("No Subscription");
}

@Given("I Select the Plan as Basic")
public void iSelectThePlanAsBasic() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearchText(lap.Plan_InputBx, "BASIC", "Basic Plan Selected");
}
@Given("I Select the Plan as Pro")
public void iSelectThePlanAsPro() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Plan_InputBx, "PRO", "Pro Plan Selected");
}
@Given("I Select the Plan as Core")
public void iSelectThePlanAsCore() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Plan_InputBx, "CORE", "Core Plan Selected");
}

@Given("I Select the Plan as Enterprise")
public void iSelectThePlanAsEnterprise() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Plan_InputBx, "ENTERPRISE", "Enterprise Plan Selected");
}
@Given("I Select the Plan as Linga One")
public void iSelectThePlanAsLingaOne() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Plan_InputBx, "LINGA ONE", "Linga One Plan Selected");
}
@Given("I Select the Industry Type as Retail")
public void iSelectTheIndustryTypeAsRetail() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSelection(lap.Industry_Type_InputBx, "Retail", "Retail Industry Type is Selected");
}
@Given("I Select the Industry Type as Restaurant")
public void iSelectTheIndustryTypeAsRestaurant() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSelection(lap.Industry_Type_InputBx, "Restaurant", "Restaurant Industry Type is Selected");

}

@Given("I Select the Business Type as Apparel and Footwear")
public void iSelectTheBusinessTypeAsApparelAndFootwear() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Apparel and Footwear", "Apparel and Footwear Business Type is Selected");

}

@Given("I Select the Business Type as Books Store")
public void iSelectTheBusinessTypeAsBooksStore() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Books Store", "Books Store Business Type is Selected");

}
@Given("I Select the Business Type as Electronics")
public void iSelectTheBusinessTypeAsElectronics() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Electronics", "Electronics Business Type is Selected");

}
@Given("I Select the Business Type as Deli and Market")
public void iSelectTheBusinessTypeAsDeliAndMarket() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Deli and Market", "Deli and Market Business Type is Selected");

}

@Given("I Select the Business Type as Gift Shops")
public void iSelectTheBusinessTypeAsGiftShops() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Gift Shops", "Gift Shops Business Type is Selected");

}
@Given("I Select the Business Type as Jewelry")
public void iSelectTheBusinessTypeAsJewelry() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Jewelry", "Jewelry Business Type is Selected");

}

@Given("I Select the Business Type as Services")
public void iSelectTheBusinessTypeAsServices() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Services", "Services Business Type is Selected");

}

@Given("I Select the Business Type as Other")
public void iSelectTheBusinessTypeAsOther() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Other", "Other Business Type is Selected");

}
@Given("I Select the Business Type as Full Service")
public void iSelectTheBusinessTypeAsFullService() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Full Service", "Full Service Business Type is Selected");

}

@Given("I Select the Business Type as Quick Service")
public void iSelectTheBusinessTypeAsQuickService() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Quick Service", "Quick Service Business Type is Selected");

}
@Given("I Select the Business Type as Bars and Clubs")
public void iSelectTheBusinessTypeAsBarsAndClubs() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Bars and Clubs", "Bars and Clubs Business Type is Selected");

}
@Given("I Select the Business Type as Franchise")
public void iSelectTheBusinessTypeAsFranchise() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Franchise", "Franchise Business Type is Selected");

}
@Given("I Select the Business Type as Pizzerias")
public void iSelectTheBusinessTypeAsPizzerias() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Pizzerias", "Pizzerias Business Type is Selected");

}
@Given("I Select the Business Type as Table Service")
public void iSelectTheBusinessTypeAsTableService() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Table Service", "Table Service Business Type is Selected");

}

@Given("I Seach the Account and Disable the Show Upgrade")
public void iSeachTheAccountAndDisableTheShowUpgrade() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    String AccountName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
    
    this.AccountName=AccountName;
    cmp.Search(AccountName);
    
    Thread.sleep(3000);
    
    
    if(driver.findElement(By.xpath("//td[contains(.,'"+AccountName+"')]/..//mat-slide-toggle")).isEnabled())
    {
    	driver.findElement(By.xpath("//td[contains(.,'"+AccountName+"')]/..//mat-slide-toggle")).click();
    }
    
}
@Given("I Verify the Upgrade Disabled or not")
public void iVerifyTheUpgradeDisabledOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage(AccountName+" upgrade disabled successfully!.");
}

@Given("I Seach the Account and Enable the Show Upgrade")
public void iSeachTheAccountAndEnableTheShowUpgrade() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    String AccountName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
    
    this.AccountName=AccountName;
    cmp.Search(AccountName);
    
    Thread.sleep(3000);
    
    
    if(driver.findElement(By.xpath("//td[contains(.,'"+AccountName+"')]/..//mat-slide-toggle")).isEnabled())
    {
    	
    }
    else
    {
    	driver.findElement(By.xpath("//td[contains(.,'"+AccountName+"')]/..//mat-slide-toggle")).click();
    }
}
@Given("I Verify the Upgrade Enabled or not")
public void iVerifyTheUpgradeEnabledOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage(AccountName+" upgrade enabled successfully!.");
}

@Given("I Search and Select the Account")
public void iSearchAndSelectTheAccount() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	
	 String AccountName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
    cmp.Search(AccountName);
    
    driver.findElement(By.xpath("//td/span[contains(.,'"+AccountName+"')]")).click();
    
    String parentWin=driver.getWindowHandle();
    this.ParentWin=parentWin;
    Set<String> childWins=driver.getWindowHandles();
    
    for(String ChildWin:childWins)
    {
    	if(!childWins.equals(parentWin))
    	{
    		driver.switchTo().window(ChildWin);
    	}
    }
    
}
@Then("Verifying the Account Details Header Page")
public void verifyingTheAccountDetailsHeaderPage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);
    cmp.VerifyMainScreenPageHeader("Account Detail");
}






}
