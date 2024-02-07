package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.GratuitiesPage;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import bsh.util.Util;
import io.cucumber.java.en.*;

public class Product_and_Items_Gratuities 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	GratuitiesPage gp=new GratuitiesPage();
	
	String Actual_Percentage;
	String Expected_Percentage=null;
	String Expected_ChangeAmount, Actual_ChangeAmount, Expected_ChangeAmountBef;
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	SoftAssert sa=new SoftAssert();
	
	ArrayList<String> al=new ArrayList<>();
	
	
	@Given("^Open the Gratuities home page BaseURL and StoreID$")
	public void open_the_Gratuities_home_page_BaseURL_and_StoreID() throws Throwable {
	    
	
		Thread.sleep(10000);
		//Load the Gratuities page
	
		
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"gratuities");
//		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"departments");
//		new LoginPage(driver, test).Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"departments");
		
		
	}
	
	@Given("Verifying the Gratuities Header Page")
	public void verifyingTheGratuitiesHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Gratuity page loaded or not
		cmp.VerifyMainScreenPageHeader("Gratuities");	
	}
	
	@Given("Click the New Gratuity button")
	public void clickTheNewGratuityButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2500);
		//Click the New Gratuity
		gp.Click_NewGratuityButton();
	}
	@When("Verify the New Gratuity Header")
	public void verifyTheNewGratuityHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2500);
		
		//Verify the New Gratuity creation screen opened or not
		cmp.VerifyCreationScreenPageHeader("New Gratuity");
	}
	
	@Given("I Click the Save button without Entering Gratuity Name")
	public void iClickTheSaveButtonWithoutEnteringGratuityName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		new Common_XPaths().EnterName("");
		
		Thread.sleep(2000);
		
		if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
		Thread.sleep(3000);
		//Check whether the New Course Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Name"))
		{
			test.log(LogStatus.PASS, "Please Enter Name Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Name Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.INFO, "Save button not Enabled without Entering Gratuity Name");
			
			
		}
	}

	@Given("I Enter the Single letter in Gratuity Name and Click the Save button")
	public void iEnterTheSingleLetterInGratuityNameAndClickTheSaveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 new Common_XPaths().EnterName("a");
		 
		 gp.Select_Fixed_Gratuity();
		 
		 gp.Enter_PercentageFixed("1000");
		    
		    if(cmp.Save_Button().isEnabled())
			{
			//Click the Save button
			cmp.Click_SaveButton();
			
			Thread.sleep(3000);
			//Check whether the New Coursing Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Gratuity Name"))
			{
				test.log(LogStatus.FAIL, "Please Enter Gratuity Name Alert Displayed");
			
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Saved Successfully"))
			{
				test.log(LogStatus.PASS, "Gratuity Saved with Single Letter");
			
				ut.PassedCaptureScreenshotAsBASE64();
				
				gp.Click_NewGratuityButton();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
			{
				test.log(LogStatus.PASS, "Gratuity Already Saved with Single Letter");
			
				ut.PassedCaptureScreenshotAsBASE64();
				
//				cp.ClickNewCoursing();
//				cmp.Click_CancelButton();
			}
//			else
//			{
//				test.log(LogStatus.FAIL, "Please Enter Gratuity Name Alert not Displayed");
//				
//				ut.FailedCaptureScreenshotAsBASE64();
//			}
			}
			else
			{
				test.log(LogStatus.PASS, "Save button not Enabled while Entering Single Letter");
			}
	}
	
	@And("I Select the Apply To as Fixed")
	public void iSelectTheApplyToAsFixed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Select_Fixed_Gratuity();
	}
	@And("I Enter the Percentage")
	public void iEnterThePercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Percentage("2000");
	}
	@Then("Verify whether the Gratuity saved only with Percentage or not")
	public void verifyWhetherTheGratuitySavedOnlyWithPercentageOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		cmp.NameInputBox().clear();
		
		
		
		
		if(cmp.Save_Button().isEnabled())
		{
				//Click the Save button
				cmp.Click_SaveButton();

		Thread.sleep(3000);
		//Check whether the New Course Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Valid Percentage"))
		{
			test.log(LogStatus.PASS, "Please Enter Valid Percentage Alert Displayed");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Gratuity Saved only with Percentage");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
			gp.Click_NewGratuityButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
		{
			test.log(LogStatus.FAIL, "Gratuity Already saved. ");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
//			cp.ClickNewCoursing();
//			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Gratuity Name Alert not Displayed");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	else
	{
		test.log(LogStatus.PASS, "Save button not Enabled without entering Gratuity Name");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	    
	}

	@When("I Enter the Fixed Gratuity Name")
	public void iEnterTheFixedGratuityName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Fixed_GratuityName"));
	}
	
	@And("I Enter the Percentage as Zero")
	public void iEnterThePercentageAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Percentage("0000");
	}
	@And("I Disable the Auto Gratuity")
	public void iDisableTheAutoGratuity() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Disable_Auto_Gratuity();
	}
	@Then("Verify whether We able to save the Gratuity Percentage as Zero")
	public void verifyWhetherWeAbleToSaveTheGratuityPercentageAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
		
		Thread.sleep(3000);
		//Check whether the New Gratuity Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter Valid Percentage"))
		{
			test.log(LogStatus.PASS, "Please Enter Valid Percentage Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Valid Percentage Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled without Entering Percentage");
			
			
		}
	}
	
	@When("I Enter the Percentage above the percentage limit")
	public void iEnterThePercentageAboveThePercentageLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Percentage("12000");
	}
	
	@Then("Verify whether We able to save the Gratuity Percentage above the limit")
	public void verifyWhetherWeAbleToSaveTheGratuityPercentageAboveTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
		if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
		
		Thread.sleep(3000);
		//Check whether the New Gratuity Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter Valid Percentage"))
		{
			test.log(LogStatus.PASS, "Please Enter Valid Percentage Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Valid Percentage Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled without Entering Percentage");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}


	@And("I Click the Percentage Input Box Up Icon")
	public void iClickThePercentageInputBoxUpIcon() {
	    // Write code here that turns the phrase above into concrete actions
		
		cmp.UpArrow_Percentage_InputBox.click();
	    
	}
	@Then("Verify whether We able to Increase the Percentage by clicking Up Icon")
	public void verifyWhetherWeAbleToIncreaseThePercentageByClickingUpIcon() {
	    // Write code here that turns the phrase above into concrete actions
	    
//		String Up_PercValue=cmp.Percentage_Input().getAttribute("value");
		
		
//		assertEquals(cmp.Percentage_Input().getAttribute("value"), null);
		
		assertEquals(cmp.Percentage_Input().getAttribute("value"), "21.00%", "Percentage value is Increased when Clicking Up Arrow");
		ut.PassedCaptureScreenshotAsBASE64();
		
//		if(Up_PercValue.equals("21.00%"))
//		{
//			test.log(LogStatus.PASS, "Percentage value is Increased when Clicking Up Arrow");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
	}

	@And("I Click the Percentage Input Box Down Icon")
	public void iClickThePercentageInputBoxDownIcon() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.DownArrow_Percentage_InputBox.click();
	}
	@Then("Verify whether We able to Decrease the Percentage by clicking Down Icon")
	public void verifyWhetherWeAbleToDecreaseThePercentageByClickingDownIcon() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(cmp.Percentage_Input().getAttribute("value"), "19.00%", "Percentage value is Decreased when Clicking Up Arrow");
		ut.PassedCaptureScreenshotAsBASE64();
		
	}

	@And("I Enable the Auto Gratuity")
	public void iEnableTheAutoGratuity() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enable_Auto_Gratuity();
	}
	@Then("Verify whether the Auto Gratuity Seat Count is Displayed or not")
	public void verifyWhetherTheAutoGratuitySeatCountIsDisplayedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
	    assertEquals(gp.Auto_Seat_Count_InputBox().isDisplayed(), true);
	    
	    ut.PassedCaptureScreenshotAsBASE64();
	}

	@And("I Enter the Auto Gratuity Count Seat as Zero")
	public void iEnterTheAutoGratuityCountSeatAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		
	    gp.Enter_Auto_Gratuity_SeatCount("0");
	}
	@Then("I Verify the Enter Valid Seat Count is Displayed or not")
	public void iVerifyTheEnterValidSeatCountIsDisplayedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
//	    gp.Verify_Valid_Seat_Count_ErrorMessage();
		
		assertEquals(gp.Enter_Valid_SeatCount_ErrorMsg.isDisplayed(), true);
//		sa.equals(gp.Enter_Valid_SeatCount_ErrorMsg.isDisplayed());
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		
	}
	@Then("Verify whether the Gratuity Saved with Auto Gratuity Seat Count as Zero or not")
	public void verifyWhetherTheGratuitySavedWithAutoGratuitySeatCountAsZeroOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
		
		Thread.sleep(3000);
		//Check whether the New Gratuity Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter Valid Seat Count"))
		{
			test.log(LogStatus.PASS, "Please Enter Valid Seat Count Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Valid Seat Count Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled without Entering Valid Seat Count");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Enter the Auto Gratuity Seat Count")
	public void iEnterTheAutoGratuitySeatCount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enter_Auto_Gratuity_SeatCount("10");
	}
	
	@And("I Click the Auto Gratuity Seat Count Input Box Up Icon")
	public void iClickTheAutoGratuitySeatCountInputBoxUpIcon() {
	    // Write code here that turns the phrase above into concrete actions
	    gp.UpArrow_Auto_Gratuity_Seat_Count_InputBox.click();
	}
	
	@Then("Verify whether we able to Increase the Auto Gratuity Seat Count")
	public void verifyWhetherWeAbleToIncreaseTheAutoGratuitySeatCount() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(gp.Auto_Seat_Count_InputBox().getAttribute("value"), "11", "Auto Gratuity Seat Count is Increased when Clicking Up Arrow");
		ut.PassedCaptureScreenshotAsBASE64();
	}

	
	@And("I Click the Auto Gratuity Seat Count Input Box Down Icon")
	public void iClickTheAutoGratuitySeatCountInputBoxDownIcon() {
	    // Write code here that turns the phrase above into concrete actions
	    gp.DownArrow_Auto_Gratuity_Seat_Count_InputBox.click();
	}
	@Then("Verify whether we able to Decrease the Auto Gratuity Seat Count")
	public void verifyWhetherWeAbleToDecreaseTheAutoGratuitySeatCount() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(gp.Auto_Seat_Count_InputBox().getAttribute("value"), "9", "Auto Gratuity Seat Count is Increased when Clicking Up Arrow");
		ut.PassedCaptureScreenshotAsBASE64();
	}

	
	@And("I Enter the Auto Gratuity Seat Count above the Limit")
	public void iEnterTheAutoGratuitySeatCountAboveTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enter_Auto_Gratuity_SeatCount("9999999");
	}
	
	@Then("Verify whether the Gratuity Saved with Exceed the limit in Auto Gratuity Seat Count or not")
	public void verifyWhetherTheGratuitySavedWithExceedTheLimitInAutoGratuitySeatCountOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(gp.Enter_Valid_SeatCount_ErrorMsg.isDisplayed(), true);
		
		ut.PassedCaptureScreenshotAsBASE64();
	}

	@When("I Enter the Varying Gratuity Name")
	public void iEnterTheVaryingGratuityName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Varying_GratuityName"));
	}
	@And("I Select the Apply To as Varying")
	public void iSelectTheApplyToAsVarying() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Select_Varying_Gratuity();
	}
	@And("I Check Enter Valid Min Percentage Error Message is Displayed")
	public void iCheckEnterValidMinPercentageErrorMessageIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(gp.Enter_Valid_Min_Percentage_ErrorMsg.isDisplayed(), true);
	    
	    ut.PassedCaptureScreenshotAsBASE64();
	}
	@And("I Check Enter Valid Max Percentage Error Message is Displayed")
	public void iCheckEnterValidMaxPercentageErrorMessageIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(gp.Enter_Valid_Max_Percentage_ErrorMsg.isDisplayed(), true);
	    
	    ut.PassedCaptureScreenshotAsBASE64();
	}
	@And("I Enter the Min Percentage as Zero")
	public void iEnterTheMinPercentageAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enter_Min_Percentage("000");
	}
	@And("I Enter the Max Percentage as Zero")
	public void iEnterTheMaxPercentageAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enter_Max_Percentage("000");
	}
	@Then("Verify whether the Save button is Disabled")
	public void verifyWhetherTheSaveButtonIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    assertEquals(!cmp.Save_Button().isEnabled(), true);
//		Assert.assertEquals(false, cmp.Save_Button().isEnabled());

//		sa.equals(cmp.Save_Button().isEnabled());
		
//		if(cmp.save)
	    
//	    ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Check_Button_Disabled(cmp.Update_Button(), "Update button");
	}

	
	@When("I Enter the Min Percentage above the percentage limit")
	public void iEnterTheMinPercentageAboveThePercentageLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enter_Min_Percentage("12000");
	}
	@When("I Enter the Max Percentage above the percentage limit")
	public void iEnterTheMaxPercentageAboveThePercentageLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enter_Max_Percentage("14000");
	}

	@When("I Enter the Min Percentage")
	public void iEnterTheMinPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enter_Min_Percentage("1000");
	}

	
	@When("I Enter the Max Percentage")
	public void iEnterTheMaxPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gp.Enter_Max_Percentage("2000");
	}




	@Then("Verify whether the Fixed Gratuity is Saved or Not")
	public void verifyWhetherTheFixedGratuityIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Gratuity Saved");
	}

	@When("Verify the Update Gratuity Header")
	public void verifyTheUpdateGratuityHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
Thread.sleep(2000);
		
		//Verify the New Gratuity creation screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Gratuity");
	}

	@Then("I Verify Gratuity Update screen Close or not")
	public void iVerifyGratuityUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Close_Cancel_CreationScreen("Update Gratuity");
	}
	
	@Given("I Search and Edit the Fixed Gratuity")
	public void iSearchAndEditTheFixedGratuity() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit(Utility.getProperty("Fixed_GratuityName"));
	}
	@And("I Click the Update button without Gratuity Name")
	public void iClickTheUpdateButtonWithoutGratuityName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Name
		cmp.NameInputBox().clear();
	
		
		if(cmp.Update_Button().isEnabled())
		{
			
			Thread.sleep(1000);
			//Click the Update button
			cmp.Click_UpdateButton();
			
			Thread.sleep(3000);
			//Check whether the New Gratuity Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Gratuity Updated without Gratuity Name");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				Thread.sleep(3000);
				//Search and Click Edit button
				cmp.SearchAndClickEdit(Utility.getProperty("Fixed_GratuityName"));
				
				
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Gratuity not Updated without Gratuity Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
		
		cmp.EnterName(Utility.getProperty("Fixed_GratuityName"));
	}

	@And("I Click the Update button without Entering Percentage")
	public void iClickTheUpdateButtonWithoutEnteringPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Name
		cmp.Percentage_Input().clear();
	
		Thread.sleep(1000);
		if(cmp.Update_Button().isEnabled())
		{
			
			Thread.sleep(1000);
			//Click the Update button
			cmp.Click_UpdateButton();
			
			Thread.sleep(3000);
			//Check whether the New Gratuity Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Gratuity Updated without Percentage");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				Thread.sleep(3000);
				//Search and Click Edit button
				cmp.SearchAndClickEdit(Utility.getProperty("Fixed_GratuityName"));
				
				
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Gratuity not Updated without Percentage");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
		
	}

	@And("I Click the Update button without Entering Auto Gratuity Seat Count")
	public void iClickTheUpdateButtonWithoutEnteringAutoGratuitySeatCount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Name
		gp.Auto_Seat_Count_InputBox().clear();
	
		
		if(cmp.Update_Button().isEnabled())
		{
			
			Thread.sleep(1000);
			//Click the Update button
			cmp.Click_UpdateButton();
			
			Thread.sleep(3000);
			//Check whether the New Gratuity Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Gratuity Updated without Auto Gratuity Seat Count");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				Thread.sleep(3000);
				//Search and Click Edit button
				cmp.SearchAndClickEdit(Utility.getProperty("Fixed_GratuityName"));
				
				
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Gratuity not Updated without Auto Gratuity Seat Count");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}

	@Then("Verify whether the Update button is Disabled")
	public void verifyWhetherTheUpdateButtonIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    assertEquals(!cmp.Update_Button().isEnabled(), true);
//		Assert.assertEquals(false, cmp.Update_Button().isEnabled());
	    
//	    ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Check_Button_Disabled(cmp.Update_Button(), "Update button");
	}

	@And("I Can verify the Enabled Auto Gratuity Toggle")
	public void iCanVerifyTheEnabledAutoGratuityToggle() {
	    // Write code here that turns the phrase above into concrete actions
		
//		assertEquals(gp.Auto_Gratuity_Toggle().isEnabled()., true);
		
//		sa.equals(gp.Auto_Gratuity_Toggle().isEnabled());
//		Check whether the Auto Gratuity Enabled or not
				if(gp.Auto_Gratuity_Toggle().isEnabled())
				{
					test.log(LogStatus.PASS, "Auto Gratuity Enabled");
					
				
				}
				else
				{
					test.log(LogStatus.FAIL, "Auto Gratuity not Enabled");
					
					ut.FailedCaptureScreenshotAsBASE64();
				}
	}
	
	@And("I Can verify the Percentage")
	public void iCanVerifyThePercentage() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(cmp.Percentage_Input().getAttribute("value"), "20.00%","Percentage is Correctly Displayed");
	    
	}
	@And("I Can verify the Auto Gratuity Seat Count")
	public void iCanVerifyTheAutoGratuitySeatCount() {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(gp.Auto_Seat_Count_InputBox().getAttribute("value"), "10","Auto Gratuity Seat Count is Correctly Displayed");
//		   sa.equals(gp.Auto_Seat_Count_InputBox().getAttribute("value"));
	}
	
	
	
	@Then("Verify whether the Fixed Gratuity is Updated or not")
	public void verifyWhetherTheFixedGratuityIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Gratuity Updated");
	    
	    
	    try
	    {
//	    	ut.FailedCaptureScreenshotAsBASE64();
	    	
	    
	    }
	    catch(Exception kk)
	    {
	    	cmp.Click_CancelButton();
	    	
	    	test.log(LogStatus.FAIL, "Fixed Gratuity Update failed");
	    }
	    
	}


	@Then("Verify whether the Varying Gratuity is Saved or Not")
	public void verifyWhetherTheVaryingGratuityIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Gratuity Saved");
	}

	@Given("I Search and Edit the Varying Gratuity")
	public void iSearchAndEditTheVaryingGratuity() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit(Utility.getProperty("Varying_GratuityName"));
	}

	@Then("Verify whether the Varying Gratuity is Updated or Not")
	public void verifyWhetherTheVaryingGratuityIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Gratuity Updated");
	}


	@Given("I Search the Gratuity and Click the Delete button")
	public void iSearchTheGratuityAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickDelete(Utility.getProperty("Fixed_GratuityName"));
	    
	    
	    Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Gratuity Deleted\\/Inactivated or not")
	public void verifyTheCancelledGratuityDeletedInactivatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Gratuity Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Gratuity not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}




@Then("I Verifying the Gratuity Deleted or not")
public void iVerifyingTheGratuityDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	
	cmp.VerifySaveConfirmationAlertMessage("Gratuity Inactivated");
}

@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Gratuity")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedGratuity() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Enable the Inactive Status
			cmp.Click_ActivetoInactiveButton();
			
			//Check whether the Inactive screen opened or not
			cmp.VerifyActive_InactiveStatus("Inactive");
			
			Thread.sleep(3000);
			cmp.Verify_Search(Utility.getProperty("Fixed_GratuityName"));
}

@Given("I Search the Gratuity and Click the Active button")
public void iSearchTheGratuityAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Search and Activate the In activated item
	cmp.SearchAndClickActivate(Utility.getProperty("Fixed_GratuityName"));
	
	Thread.sleep(1500);
	//Click the Delete button
	cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
}
@Then("Verify the Cancelled Gratuity is Activated or not")
public void verifyTheCancelledGratuityIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	Thread.sleep(3000);
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Activated Successfully"))
	{
		test.log(LogStatus.FAIL, "Gratuity Activated when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Gratuity not Activated when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}



@Then("I Verifying the Gratuity Activated or not")
public void iVerifyingTheGratuityActivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Gratuity Activated");
}

@Then("I Click the Active button to navigate Activated screen to Verify Activated Gratuity")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedGratuity() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	//Verify whether the Gratuity activated or not
	cmp.Verify_Search(Utility.getProperty("Fixed_GratuityName"));
}

@Then("Verify whether the Duplicate Gratuity is Saved or not")
public void verifyWhetherTheDuplicateGratuityIsSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
//	Thread.sleep(5000);
	//Check whether the New Gratuity Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Gratuity Name already exist pop up displayed");
	
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
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Saved Successfully"))
	{
		test.log(LogStatus.FAIL, "Duplicate Gratuity Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Gratuity Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
		Thread.sleep(2000);
		cmp.Click_CancelButton();
		
		System.out.println("Cancel button not Clicked while creating Duplicate Gratuity");
	}
	catch(Exception k)
	{}
}


@When("I Enter the New Gratuity Name with Special Characters")
public void iEnterTheNewGratuityNameWithSpecialCharacters() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.EnterName("*&%$$#$$$$$$$$$$");
}

@Then("Verify whether the Gratuity with Special Characters is Saved or not")
public void verifyWhetherTheGratuityWithSpecialCharactersIsSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Saved Successfully"))
	{
		test.log(LogStatus.PASS, "Gratuity Saved with Special Characters");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Gratuity Name already exist pop up displayed when Entering Special Characters");
	
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
		test.log(LogStatus.FAIL, "Gratuity not Saved with Special Characters");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
		Thread.sleep(2000);
		cmp.Click_CancelButton();
		
		System.out.println("Cancel button not Clicked while Creating Gratuity with Special Characters");
	}
	catch(Exception k)
	{}
}


@When("I Enter the New Grtauity Name with Space")
public void iEnterTheNewGrtauityNameWithSpace() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.EnterName(Utility.getProperty("Fixed_GratuityName")+Keys.SPACE);
}

@Then("Verify whether the Gratuity Name with Space in end is Updated or not")
public void verifyWhetherTheGratuityNameWithSpaceInEndIsUpdatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gratuity Updated Successfully"))
	{
		test.log(LogStatus.PASS, "Gratuity Updated with Space in the End of Gratuity Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Gratuity Name already exist pop up displayed when Entering Space in the End of Gratuity Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Gratuity Name");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else
	{
		test.log(LogStatus.FAIL, "Gratuity not Saved with Space in the End of Gratuity Name");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}



}
