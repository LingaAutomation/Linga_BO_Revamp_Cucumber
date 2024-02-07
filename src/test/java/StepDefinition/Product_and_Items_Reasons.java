package StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ReasonsPage;
import com.Pages.TaxesPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Product_and_Items_Reasons {

	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	ReasonsPage rp=new ReasonsPage();
	
	String Actual_Percentage;
	static String Expected_Percentage=null;
	String Expected_ChangeAmount, Actual_ChangeAmount, Expected_ChangeAmountBef;
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	SoftAssert sa=new SoftAssert();
	
	ArrayList<String> al=new ArrayList<>();
	
	@Given("Open the Reasons home page BaseURL and StoreID")
	public void openTheReasonsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Reasons page
	
		
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"reasons");
	}
	
	@Given("Verifying the Reasons Header Page")
	public void verifyingTheReasonsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Reasons page loaded or not
		cmp.VerifyMainScreenPageHeader("Reasons");	
	}

	@Given("I Click the New Reasons button")
	public void iClickTheNewReasonsButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2500);
		//Click the New Reasons
		rp.Click_NewReasonButton();
	}
	@When("Verify the New Reasons Header")
	public void verifyTheNewReasonsHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2500);
		
		//Verify the New Reasons creation screen opened or not
		cmp.VerifyCreationScreenPageHeader("New Reason");
	}

//	@Then("Verify the Reason Type text")
//	public void verifyTheReasonTypeText() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
	@Then("Check whether the Tax exempt option is selected by default")
	public void checkWhetherTheTaxExemptOptionIsSelectedByDefault() {
	    // Write code here that turns the phrase above into concrete actions
//	    sa.equals(rp.TaxExemptReasonType().isEnabled());
//		assertTrue(rp.TaxExemptReasonType().isEnabled(),"Tax Exempt Selected as Default");
		Assert.assertEquals(true, rp.TaxExemptReasonType().isEnabled());
		
		ut.PassedCaptureScreenshotAsBASE64();
		
//		assertEquals(rp.TaxExemptReasonType().isEnabled(), true);
		
	}

	@Given("I Click the Save button without Entering Reason Name")
	public void iClickTheSaveButtonWithoutEnteringReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    Assert.assertEquals(false, cmp.Save_Button().isEnabled());
		
Thread.sleep(2000);
		
		if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
		Thread.sleep(3000);
		//Check whether the New Course Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Reason"))
		{
			test.log(LogStatus.PASS, "Please Enter Reason Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Reason Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled without Entering Reason Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			Assert.assertEquals(false, cmp.Save_Button().isEnabled());
			
		}
	}

	@Given("I Enter the Single letter in Reason then Click the Save button")
	public void iEnterTheSingleLetterInReasonThenClickTheSaveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    rp.Enter_Reason_Name("b");
	    
	    Thread.sleep(1000);
	    cmp.Click_SaveButton();
	    
	   
	}
	
	@Then("Check whether Reasons Saved or Not")
	public void checkWhetherReasonsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.VerifySaveConfirmationAlertMessage("Reasons Saved");
	}

	@Then("I Enter the Reason Exceeding the limit")
	public void iEnterTheReasonExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
	    cmp.Verify_Enter_Excess_Limit_Name(rp.ReasonInputBox);
	}
	
	@Then("Check the Exceed Error Message under Reason Name")
	public void checkTheExceedErrorMessageUnderReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
	    Assert.assertEquals(true, rp.Reason_Input_ErrorMsg.isDisplayed());
	    
	    Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
	}



	@Given("I Select Reason Type as Tax Exempt")
	public void iSelectReasonTypeAsTaxExempt() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Tax_Exempt_Reason();
	}


	@Given("I Enter the Tax Exempt Reason Name")
	public void iEnterTheTaxExemptReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("TaxExemptReason"));
	}

	@Given("I Select Reason Type as Void")
	public void iSelectReasonTypeAsVoid() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Void_Reason();
	}

	
	@Given("I Enter the Void Reason Name")
	public void iEnterTheVoidReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("VoidReason"));
	}

	@When("I Select Reason Type as Paid In")
	public void iSelectReasonTypeAsPaidIn() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Paid_In_Reason();
	}


	@When("I Enter the Paid In Reason Name")
	public void iEnterThePaidInReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("PaidInReason"));
	}
	
	
	@Given("I Select Reason Type as Break")
	public void iSelectReasonTypeAsBreak() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Break_Reason();
	}

	
	@Given("I Enter the Break Reason Name")
	public void iEnterTheBreakReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("BreakReason"));
	}

	@Given("I Select Reason Type as Layaway")
	public void iSelectReasonTypeAsLayaway() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Layaway_Reason();
	}

	@Given("I Enter the Layaway Reason Name")
	public void iEnterTheLayawayReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("LayawayReason"));
	}

	@Given("I Select Reason Type as Paid Out")
	public void iSelectReasonTypeAsPaidOut() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Paid_Out_Reason();
	}

	@Given("I Enter the Paid Out Reason Name")
	public void iEnterThePaidOutReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("PaidOutReason"));
	}

	@Given("I Select Reason Type as Over Shortage")
	public void iSelectReasonTypeAsOverShortage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Over_Shortage_Reason();
	}


	@Given("I Enter the Over Shortage Reason Name")
	public void iEnterTheOverShortageReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("OverShortageReason"));
	}
	

	@Given("I Select Reason Type as Attach Request")
	public void iSelectReasonTypeAsAttachRequest() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Attach_RequestReason();
	}


	@Given("I Enter the Attach Request Reason Name")
	public void iEnterTheAttachRequestReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("AttachRequestReason"));
	}

	@Given("I Select Reason Type as Refund")
	public void iSelectReasonTypeAsRefund() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Refund_Reason();
	}

	
	@Given("I Enter the Refund Reason Name")
	public void iEnterTheRefundReasonName() throws Exception
	{
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("RefundReson"));
	}
	
	@Given("I Select Reason Type as Exchange")
	public void iSelectReasonTypeAsExchange() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Select_Exchange_Reason();
	}
	

	@Given("I Enter the Exchange Reason Name")
	public void iEnterTheExchangeReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name(Utility.getProperty("ExchangeReason"));
	}

	@Given("I Search and Edit the Reason")
	public void iSearchAndEditTheReason() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.SearchAndClickEdit(Utility.getProperty("TaxExemptReason"));
	}
	@When("Verify the Update Reason Header")
	public void verifyTheUpdateReasonHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("Update Reason");
	}

	@Then("I Verify Reason Update screen Close or not")
	public void iVerifyReasonUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Close_Cancel_CreationScreen("Update Reason");
	}

	@Given("I Clear the Reason Name")
	public void iClearTheReasonName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    rp.ReasonInputBox.clear();
	}
	@Then("Verify whether the Reason Updated without Reason Name or not")
	public void verifyWhetherTheReasonUpdatedWithoutReasonNameOrNot() throws Exception
	{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		if(cmp.Update_Button().isEnabled())
		{
			
			Thread.sleep(1000);
			//Click the Update button
			cmp.Click_UpdateButton();
			
			Thread.sleep(3000);
			//Check whether the New Reasons Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reasons Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Reasons Updated without Reasons Name");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				Thread.sleep(3000);
				//Search and Click Edit button
				cmp.SearchAndClickEdit(Utility.getProperty("TaxExemptReason"));
				
				
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Reasons not Updated without Reasons Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
		
	}

	@Then("Verify the Reason type is Updated or Not")
	public void verifyTheReasonTypeIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Reasons Updated");
	}

	@Then("I Verify the Reason Type Selected as Paid Out")
	public void iVerifyTheReasonTypeSelectedAsPaidOut() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		if(rp.Paid_Out_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Paid Out Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Paid_Out_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Paid Out Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verify the Reason Type Selected as Void")
	public void iVerifyTheReasonTypeSelectedAsVoid() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Void_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Void Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Void_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Void Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verify the Reason Type Selected as Over Shortage")
	public void iVerifyTheReasonTypeSelectedAsOverShortage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Over_Shoratage_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Over/Shortage Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Over_Shoratage_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Over/Shortage Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verify the Reason Type Selected as Paid In")
	public void iVerifyTheReasonTypeSelectedAsPaidIn() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Paid_In_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Paid In Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Paid_In_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Paid In Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verify the Reason Type Selected as Attach Request")
	public void iVerifyTheReasonTypeSelectedAsAttachRequest() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Attach_Request_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Attach Request Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Attach_Request_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Attach Request Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verify the Reason Type Selected as Break")
	public void iVerifyTheReasonTypeSelectedAsBreak() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Break_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Break Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Break_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Break Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verify the Reason Type Selected as Refund")
	public void iVerifyTheReasonTypeSelectedAsRefund() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Refund_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Refund Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Refund_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Refund Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verify the Reason Type Selected as Layaway")
	public void iVerifyTheReasonTypeSelectedAsLayaway() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Layaway_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Layaway Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Layaway_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Layaway Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verify the Reason Type Selected as Exchange")
	public void iVerifyTheReasonTypeSelectedAsExchange() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Exchange_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Exchange Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Exchange_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Exchange Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Verify the Reason Type Selected as Tax Exempt")
	public void iVerifyTheReasonTypeSelectedAsTaxExempt() {
	    // Write code here that turns the phrase above into concrete actions
		if(rp.Tax_Exempt_ReasonType.isEnabled())
		{
			test.log(LogStatus.PASS, "Tax Exempt Reason Type is Enabled");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Assert.assertEquals(true, rp.Tax_Exempt_ReasonType.isEnabled());
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Exempt Reason Type is not Enabled");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Given("I Search the Reason and Click the Delete button")
	public void iSearchTheReasonAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("TaxExemptReason"));
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	
	@Then("Verify the Cancelled Reason Deleted\\/Inactivated or not")
	public void verifyTheCancelledReasonDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reason Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Reason Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Reason not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the Reason Deleted or not")
	public void iVerifyingTheReasonDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("Reason Inactivated");
	}
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Reason")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedReason() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("TaxExemptReason"));
	}

	@Given("I Search the Reason and Click the Active button")
	public void iSearchTheReasonAndClickTheActiveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("TaxExemptReason"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}
	
	@Then("Verify the Cancelled Reason is Activated or not")
	public void verifyTheCancelledReasonIsActivatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reason Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "Reason Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Reason not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the Reason Activated or not")
	public void iVerifyingTheReasonActivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("Reason Activated");
	}
	
	
	@Then("I Click the Active button to navigate Activated screen to Verify Activated Reason")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedReason() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Reason activated or not
		cmp.Verify_Search(Utility.getProperty("TaxExemptReason"));
	}

	@Then("Verify whether the Duplicate reasons is Saved or not")
	public void verifyWhetherTheDuplicateReasonsIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
//		Thread.sleep(5000);
		//Check whether the New Reason Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reason already exists"))
		{
			test.log(LogStatus.PASS, "Reason already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reasons Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Reason Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Reason Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		
	}

	@Then("Verify the Available Reason is Displayed or not")
	public void verifyTheAvailableReasonIsDisplayedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Search(Utility.getProperty("TaxExemptReason"));
	}
	
	@Given("I Enter the New reason Name with Special Characters")
	public void iEnterTheNewReasonNameWithSpecialCharacters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    rp.Enter_Reason_Name("%%%&&&&&**");
	}
	@Then("Verify whether the Reason with Special Characters is Saved or not")
	public void verifyWhetherTheReasonWithSpecialCharactersIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reason Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Reason Saved with Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reason already exists"))
		{
			test.log(LogStatus.PASS, "Reason already exist pop up displayed when Entering Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(3000);
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Special Characters");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Reason not Saved with Special Characters");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@When("I Enter the New Reason Name with Space")
	public void iEnterTheNewReasonNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		rp.Enter_Reason_Name(Utility.getProperty("TaxExemptReason")+Keys.SPACE);
	}
	
	@Then("Verify whether the Reason Name with Space in end is Updated or not")
	public void verifyWhetherTheReasonNameWithSpaceInEndIsUpdatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reason Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Reason Updated with Space in the End of Reason Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Reason already exist"))
		{
			test.log(LogStatus.PASS, "Reason already exist pop up displayed when Entering Space in the End of Reason Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Reason Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Reason not Saved with Space in the End of Reason Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


}
