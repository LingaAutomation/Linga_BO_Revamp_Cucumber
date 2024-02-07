package StepDefinition;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Linga_Admin_Languages 
{

	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage rp=new ReportsPage();
	
	@Given("Open the Linga Admin - Languages home page BaseURL and StoreID")
	public void openTheLingaAdminLanguagesHomePageBaseURLAndStoreID() throws Exception 
	{
	    
		Thread.sleep(10000);
		
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"settings/languages");
	}
	
	@Given("Verifying the Languages Header Page")
	public void verifying_The_Languages_HeaderPage() throws Exception {
		
		Thread.sleep(1000);
		
		cmp.VerifyMainScreenPageHeader("Languages");
	}
	
    @Given("I Click the New Language buttonr")
    public void i_click_the_New_Language_Button() throws Exception {
    	
    	lap.Click_New_Language_Button();
    	Thread.sleep(1000);
    }
    
    @When("Verify the New Language Header")
    public void verify_the_New_Language_Header() {
    	
    cmp.VerifyCreationScreenPageHeader("New Languages");
    	
    }
    
    @And("I Enter the Language Name Exceeding the limit")
    public void i_Enter_the_Language_Name_Exceeding_the_Limit() throws Exception {
    	Thread.sleep(1000);
    	
    	cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
    	
    }
    @And("I Enter the Language Name")
    public void i_Enter_the_Language_Name() throws Exception {
    	
    	Thread.sleep(500);
    	
    	cmp.EnterName(Utility.getProperty("Admin_Language_Name"));    	
    	
    }
    
    @Then("Verify whether the Language is Saved or Not")
    public void verify_Whether_the_Language_Saved_or_Not() throws Exception {
    	
    	Thread.sleep(500);
    	
    	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language saved successfully")){
    		
    		test.log(LogStatus.PASS, "Language saved successfully");
    		
    		ut.PassedCaptureScreenshotAsBASE64();
    		
    	}
    	else
		{
			test.log(LogStatus.FAIL, "Language save Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
    }
    	
    @Given("I Search and Edit the Language")
    public void Search_And_Edit_the_Language() throws Exception {
    Thread.sleep(500);
    
    cmp.SearchAndClickEdit(Utility.getProperty("Admin_Language_Name"));
    }
    		
   @When("Verify the Update Language Header")
   public void verify_the_Update_Language_Header() throws Exception {
	Thread.sleep(500);
	
	cmp.VerifyCreationScreenPageHeader("Update Language");
   }
   
   @Then("I Verify Language Update screen Close or not")
   public void verify_Language_update_Screen_Close_or_not() throws Exception {
	   
	   Thread.sleep(500);
	   
	   cmp.Verify_Close_Cancel_CreationScreen("Update Language");
   }
  	
//   @And("I Clear the Name")
//   public void clear_the_Name() throws Exception {
//	   Thread.sleep(500);
//	   
//	  cmp.EnterName("");
//   }
//   
   @Then("Verify whether the Language is Updated or Not")
   public void verify_Whether_the_Language_Updated_or_Not() throws Exception {
   	
   	Thread.sleep(2000);
   	
   	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language updated successfully")){
   		
   		test.log(LogStatus.PASS, "Language updated successfully");
   		
   		ut.PassedCaptureScreenshotAsBASE64();
   		
   	}
   	else
		{
			test.log(LogStatus.FAIL, "Language updated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
   }
   
   @Then("I Search the Language and Click the Delete button")
   public void Search_the_Language_and_Click_the_Cancel_button() throws Exception
   {
	  Thread.sleep(500); 
	  
	  cmp.SearchAndClickDelete(Utility.getProperty("Admin_Language_Name"));
	  
	  Thread.sleep(1000);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
   }
   
   @Then("^Verify the Cancelled Language Deleted/Inactivated or not$")
	public void verify_the_Cancelled_Language_Deleted_or_not() throws Throwable {
		
		
		Thread.sleep(3000);
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Language Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Language not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}
   
   @And("^I Verifying the Language Deleted or not$")
	public void i_Verifying_the_Language_Deleted_or_not() throws Throwable {
		
		
		Thread.sleep(3000);
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Language Inactivated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Language Inactivated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
   
   @Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Language")
	public void i_Click_The_Inactive_Button_To_Navigate_Inactivated_Screen_To_Verify_Inactivated_Language() throws Exception {
	    
		
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Admin_Language_Name"));
	}
   
   @Given("I Search the Language and Click the Active button")
   public void i_Search_the_Language_And_Click_the_Active_Button() throws Exception {
		//Search and Activate the In activated item
	   
	   cmp.SearchAndClickActivate(Utility.getProperty("Admin_Language_Name"));
	   
	   Thread.sleep(500);
	   cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
   }
   
   @Then("Verify the Cancelled Language is Activated or not")
	public void Verify_the_Cancelled_Language_Activated_or_not() throws Throwable {
	    
		
		
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "Language Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Language not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}

	}
   @Then("I Verifying the Language Activated or not")
	public void i_Verifying_the_Department_Activated_or_not() throws Throwable {
		
		
		Thread.sleep(3000);
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Language activated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Language activated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Click the Active button to navigate Activated screen to Verify Activated Language")
	public void i_Click_the_Active_button() throws Throwable {
		
		
		Thread.sleep(500);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		
		cmp.Verify_Search(Utility.getProperty("Admin_Language_Name"));
		
	}
	
	@Then("Verify whether the Language with Duplicate Name is Saved or not")
	public void verify_Whether_The_Language_with_Duplicate_Name_Is_Saved_Or_Not() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Language Name already exist pop up displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language Saved Successfully"))
	{
		test.log(LogStatus.PASS, "Duplicate Language Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Language Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	
	@And("Given I Search and Edit the Other Language")
	public void given_Search_And_Edit_the_Other_Language() throws Exception {
		
		Thread.sleep(500);
		cmp.SearchAndClickEdit(Utility.getProperty("Linga_Admin_Settings_Language_Other_Name"));
	
	}
	
	@Then("Verify whether the Language with Duplicate Name is Updated or not")
	public void verify_Whether_The_Language_with_Duplicate_Name_Is_Updated_Or_Not() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Language Name already exist pop up displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language updated Successfully"))
	{
		test.log(LogStatus.PASS, "Duplicate Language Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Language Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	
	@And("I Enter the Language Name with Space")
	public void i_Enter_the_Language_Name_With_Space() throws Exception {
		cmp.EnterName("   ");
	}
	
	@Then("Verify whether able to Save the Language with Space or not")	
	public void verify_Whether_able_To_Save_the_Language_With_Space_Or_not() {
		
		    // Write code here that turns the phrase above into concrete actions
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language Saved Successfully"))
			{
				test.log(LogStatus.PASS, "Language Saved with Space");
			
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
			{
				test.log(LogStatus.PASS, "Language Name already exist pop up displayed when Entering Space in Language Name");
			
				ut.PassedCaptureScreenshotAsBASE64();
				
				cmp.Click_CancelButton();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
			{
				test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the Language Name");
				
				ut.PassedCaptureScreenshotAsBASE64();
				
				cmp.Click_CancelButton();
			}
			else
			{
				test.log(LogStatus.FAIL, "Language not Saved with Space in the Language Name");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
	@Then("Verify whether able to Update the Language with Space or not")	
	public void verify_Whether_able_To_Update_the_Language_With_Space_Or_not() {
		
		    // Write code here that turns the phrase above into concrete actions
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Language Updated Successfully"))
			{
				test.log(LogStatus.PASS, "Language Updated with Space");
			
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
			{
				test.log(LogStatus.PASS, "Language Name already exist pop up displayed when Entering Space in Language Name");
			
				ut.PassedCaptureScreenshotAsBASE64();
				
				cmp.Click_CancelButton();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
			{
				test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the Language Name");
				
				ut.PassedCaptureScreenshotAsBASE64();
				
				cmp.Click_CancelButton();
			}
			else
			{
				test.log(LogStatus.FAIL, "Language not Updated with Space in the Language Name");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
	
	}
	

	   
   
 

	

