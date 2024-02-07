package StepDefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Linga_Admin_Currencies
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
	
	@Given("Open the Linga Admin - Currencies home page BaseURL and StoreID")
	public void OpenTheLingaAdminCurrenciesHomePageBaseURLAndStoreID() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"settings/currencies");
		Thread.sleep(5000);
	}
	
	@Given("Verifying the Currencies Header Page")
	public void VerifyCurrenciesHomePageHeader() 
	{
		cmp.VerifyMainScreenPageHeader("Currencies");
		
	}
	
	@Given("I Click the New Currency button")
	public void ClickNewCurrencyButton() 
	{
		lap.Click_NewCurrencyButton();
	}
	
	@When("Verify the New Currency Header")
	public void VerifyNewCurrencyHeader() 
	{
		cmp.VerifyCreationScreenPageHeader("New Currency");
	}
	
	@Then("I Verify New Currency screen Close or not")
	public void CurrencyScreenClosedOrNot() throws Exception 
	{
		cmp.Verify_Close_Cancel_CreationScreen("Currency Creation");
	}
	
//	@Then("Check the Save button is Disabled")
//	public void CheckSaveButtonIsDisabled() 
//	{
//		 if(cmp.Save_Button().isEnabled())
//		    {
//		    	test.log(LogStatus.FAIL, "Save button is Enabled");
//		    	
//		    	ut.FailedCaptureScreenshotAsBASE64();
//		    }
//		    else
//		    {
//		    	test.log(LogStatus.PASS, "Save button is Disabled");
//		    	
//		    	ut.PassedCaptureScreenshotAsBASE64();
//		    	
//		    	Assert.assertEquals(false, cmp.Save_Button().isEnabled());
//		    }
//	}
	
//	@And("I Enter the Country Name Exceeding the limit")
//	public void EnterCountryNameExceedingLimit() throws Exception 
//	{
//		cmp.Verify_Enter_Excess_Limit_Name(lap.CountryName());
//	}
//	
//	@And("I Enter the Currency Name Exceeding the limit")
//	public void EnterCurrencyNameExceedingLimit() throws Exception 
//	{
//		cmp.Verify_Enter_Excess_Limit_Name(lap.CurrencyName());
//	}
//	
//	@And("I Enter the Currency Symbol Exceeding the limit")
//	public void EnterCurrencySymbolExceedingLimit() throws Exception 
//	{
//		cmp.Verify_Enter_Excess_Limit_Name(lap.CurrencySymbol());
//	}
	
//	@And("I Enter the Currency Name")
//	public void EnterCurrencyName() throws Exception 
//	{
//		lap.Enter_CurrencyName(Utility.getProperty("Admin_CurrencyName"));
//	}
//	
//	@And("I Enter the Currency Symbol")
//	public void EnterCurrencySymbol() throws Exception 
//	{
//		lap.Enter_CurrencySymbol(Utility.getProperty("Admin_CurrencySymbol"));
//	}
//	
//	@And("I Enter the Country Name")
//	public void EnterCountryName() throws Exception 
//	{
//		lap.Enter_CountryName(Utility.getProperty("Admin_CountryName"));
//	}
	
	@Then("Verify whether the Currency is Saved or not")
	public void VerifyCurrencySavedOrNot() throws Exception 
	{
		cmp.VerifySaveConfirmationAlertMessage("Currency saved");
	}
	
	@Given("I Search and Edit the Currency")
	public void SearchAndClickEdit() throws Exception 
	{
		cmp.SearchAndClickEdit(Utility.getProperty("Admin_CountryName"));
	}
	
	@When("Verify the Update Currency Header")
	public void VerifyUpdateScreenHeader() 
	{
		cmp.VerifyCreationScreenPageHeader("Update Currency");
	}
	
	@Then("I Verify Currency Update screen Close or not")
	public void VerifyUpdateScreenClosedOrNot() throws Exception 
	{
		cmp.Verify_Close_Cancel_CreationScreen("Currency Update");
	}
	
//	@And("I Clear the Country Name")
//	public void ClearCountryName() throws Exception
//	{
//		lap.CountryName.clear();
//		Thread.sleep(3000);
//	}
	
//	@Then("Check the Update button is Disabled")
//	public void CheckUpdateButtonIsDisabled() 
//	{
//		 if(cmp.Update_Button().isEnabled())
//		    {
//		    	test.log(LogStatus.FAIL, "Update button is Enabled");
//		    	
//		    	ut.FailedCaptureScreenshotAsBASE64();
//		    }
//		    else
//		    {
//		    	test.log(LogStatus.PASS, "Update button is Disabled");
//		    	
//		    	ut.PassedCaptureScreenshotAsBASE64();
//		    	
//		    	Assert.assertEquals(false, cmp.Update_Button().isEnabled());
//		    }
//	}
	
//	@And("I Clear the Currency Name")
//	public void ClearCurrencyName() throws Exception 
//	{
//		lap.CurrencyName.clear();
//		Thread.sleep(3000);
//	}
//	
//	@And("I Clear the Currency Symbol")
//	public void ClearCurrencySymbol() throws Exception
//	{
//		lap.CurrencySymbol.clear();
//		Thread.sleep(3000);
//	}
	
	@Then("Verify whether the Currency is Updated or not")
	public void VerifyWhetherCurrencyUpdatedOrNot() throws Exception 
	{
		cmp.VerifySaveConfirmationAlertMessage("Currency Updated");
	}
	
	@Given("I Search the Currency and Click the Delete button")
	public void SearchAndClickDelete() throws Exception 
	{
		cmp.SearchAndClickDelete(Utility.getProperty("Admin_CountryName"));
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	
	@Then("Verify the Cancelled Currency Deleted\\/Inactivated or not")
	public void VerifyCancelledCurrencyDeletedOrNot() throws Exception
	{
		Thread.sleep(3000);
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Currency inactivated successfully"))
		{
			test.log(LogStatus.FAIL, "Currency Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Currency not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verifying the Currency Deleted or not")
	public void VerifyCurrencyDeletedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Currency inactivated successfully"))
		{
			test.log(LogStatus.PASS, "Currency Inactivated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Currency Inactivated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Currency")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedCurrency() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Admin_CountryName"));
	}
	
	@Given("I Search the Currency and Click the Active button")
	public void SearchAndClickActivate() throws Exception 
	{
		cmp.SearchAndClickActivate(Utility.getProperty("Admin_CountryName"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}
	
	@Then("Verify the Cancelled Currency is Activated or not")
	public void VerifyCancelledCurrencyActivatedOrNot() 
	{
		try
		{
		Thread.sleep(3000);
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Currency Activated successfully"))
		{
			test.log(LogStatus.FAIL, "Currency Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Currency not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verifying the Currency Activated or not")
	public void VerifyCurrecyActivatedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Currency Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Currency activated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Currency activated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Click the Active button to navigate Activated screen to Verify Activated Currency")
	public void i_Click_the_Active_button() throws Throwable 
	{
		Thread.sleep(500);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Department activated or not
		cmp.Verify_Search(Utility.getProperty("Admin_CountryName"));
		
	}
	
	@Then("Verify whether the Duplicate Currency is Saved or not")
	public void VerifyDuplicatedCurrencySavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Country name already exists"))
		{
			test.log(LogStatus.PASS, "Country Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Currency Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Duplicate Currency Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Country Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Enter the Space in Country Name")
	public void EnterSpaceIncountryName() throws Exception 
	{
		lap.Enter_CountryName(Utility.getProperty("Admin_CountryName")+Keys.SPACE);
	}
	
	@And("I Enter the Space in Currency Name")
	public void EnterCurrencyNameWithSpace() throws Exception 
	{
		lap.Enter_CurrencyName(Utility.getProperty("Admin_CurrencyName")+Keys.SPACE);
	}
	
	@And("I Enter the Space in Currency Symbol")
	public void EnterCurrencySymbolWithSpace() throws Exception 
	{
		lap.Enter_CurrencySymbol(Utility.getProperty("Admin_CurrencySymbol")+Keys.SPACE);
	}
	
	@Then("Verify whether able to Updated Currency with Space or not")
	public void VerifyAbletoUpdateCurrencyWithSpaceOrNot() 
	{
		 // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Currency Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Currency Updated with Space in the End of Currency, Country Names");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Currency Name already exist pop up displayed when Entering Space in the End of Names");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Names");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Currency not Updated with Space in the End of Country Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("Verify whether able to Create Currency with Space or not")
	public void VerifyAbletoCreateCurrencywithspace() 
	{
		 // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Currency Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Currency Saved with Space in the End of Currency, Country Names");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Currency Name already exist pop up displayed when Entering Space in the End of Names");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Names");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Currency not Saved with Space in the End of Country Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
}
