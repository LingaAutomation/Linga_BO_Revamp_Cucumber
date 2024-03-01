package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.DiscountsPage;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ModifierGroupsPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product_and_Items_Open_Check_Discount 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 


	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	DiscountsPage dcp = new DiscountsPage();
	ModifierGroupsPage mgp = new ModifierGroupsPage();


	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));

	SoftAssert sa=new SoftAssert();

	@And("I Click Open Check")
	public void Click_OpenCheck() 
	{
		//Click the Open Check Screen
		dcp.Select_Open_Check_DiscountTab();
	}

	@Then("Verify the Open Check Discount not Found is Displayed")
	public void Verify_OpenCheckDiscountNotFoundDisplayedOrNot()
	{
		try {
			if(driver.findElement(By.xpath("//span[.=' Open Check Discount not Found ']")).isDisplayed())
			{
				test.log(LogStatus.PASS,"Open Check Disocunt Not Found message displayed");
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else 
			{
				test.log(LogStatus.FAIL,"Open Check Discount not found message not displayed");
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Check Discount Already Created");
		}
	}

	@Then("Verify whether Open Check Tab is Selected")
	public void VerifyOpenCheckTabSelectedOrNot() 
	{
		if(dcp.Open_Check().isSelected()) 
		{
			test.log(LogStatus.PASS,"Open Check Tab is Selected");
		}
		else {
			test.log(LogStatus.FAIL,"Open Check Tab is Not Selected");
		}
	}

	@Given("Click the New Open Check Discount button")
	public void Click_NewOpenCheckButton() throws Exception
	{

		try {
			if(dcp.Open_Check().isDisplayed()) 
			{
				dcp.Click_New_Open_Check_Discount();
				Thread.sleep(5000);
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Check Discount Already Created");
			if(dcp.open_Edit.isDisplayed()) {
				dcp.Click_Open_Edit();
				Thread.sleep(5000);
			}
		}
	}

	@When("Verify the Open Check Header")
	public void Verify_OPenCheckHeader() 
	{
		try {
			cmp.VerifyCreationScreenPageHeader("Open Check");
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Check Discount Already Created");
		}
	}

	@And("I Enter the Open Check Discount Name Exceeding the limit")
	public void Enter_OpenCheckDiscountNameExceedingLimit() throws Exception 
	{

		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}

	@When("I Enter the Open Check Discount Name")
	public void Enter_OpenCheckDiscountName() throws Exception 
	{
		if(cmp.NameInputBox().isDisplayed()) {
			Thread.sleep(1000);
			Thread.sleep(1000);
			//Enter the Discount Name
			cmp.EnterName(Utility.getProperty("DiscountName_OpenCheckAMT"));
		}
		else {
			test.log(LogStatus.FAIL,"Name Field Not displayed");
		}
	}

	@Given("I Edit the Open Check Discount")
	public void Click_Edit_OpenCheck() 
	{
		dcp.Click_Open_Edit();
	}

	@Then("I Verify Open Check Discount Discount Update screen Close or not")
	public void Verify_OPenCheckDiscountUpdateScreenClosedOrNot() throws Exception 
	{
		cmp.Verify_Close_Cancel_CreationScreen("Open Check");
	}

	@Then("Verify whether the Open Check Discount is Saved or not")
	public void Verfiy_OpenCheckDiscountSavedOrNot() 
	{
		try {
			Thread.sleep(2000);
			//Click the Save and Publish button
			//cmp.Click_Save_and_PublishButton();


			Thread.sleep(3000);
			//Check whether the Open Item Discount Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Saved & Published Successfully"))
			{
				test.log(LogStatus.PASS, "Open Check Discount Saved Successfully");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Open Check Discount Save Failed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}

		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Check Discount Already Created");
		}
	}

	@Then("Verify whether Open Check Discount is Updated or Not")
	public void VerifyOpenCheckDiscountUpdatedOrNot() throws Exception
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
		//Check whether the Open Item Discount Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Updated & Published Successfully"))
		{
			test.log(LogStatus.PASS, "Open Check Discount updated successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Open Check Discount updated failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
		Thread.sleep(5000);
	}

	@When("I Enter the Open Check Discount Name with single letter")
	public void Enter_OpenCheckDiscountNameWithSingleLetter() throws Exception 
	{
		if(cmp.NameInputBox().isDisplayed()) {
			Thread.sleep(1000);
			//Enter the Discount Name
			cmp.EnterName("C");
		}
		else {
			test.log(LogStatus.FAIL,"Name Field Not displayed");
		}
	}

	@Then("Verify the Cancelled Open Check Discount is Activated or not")
	public void VerifyCancelledOpenCheckDiscountActivatedOrNot() 
	{
		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Activated Successfully"))
			{
				test.log(LogStatus.FAIL, "Open Check Activated when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Open Check not Activated when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the Open Check Discount Activated or not")
	public void VerifyDiscount_ActivatedOrNot() 
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
		//Check whether the Open Item Discount Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Open Check Discount Activated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Open Check Discount activated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@When("I Enter the New Open Check Discount Name with Space")
	public void EnterOpenCheckDiscountNameWithSpace() throws Exception 
	{
		//Enter the Discount Name
		cmp.EnterName(Utility.getProperty("DiscountName_OpenCheckAMT")+Keys.SPACE);
	}

	@Then("Verify whether the Open Check Discount Name with Space in end is Updated or not")
	public void VerifyOpenCheckDiscountUpdatedOrNotWithSpace() 
	{
		// Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Updated & Published Successfully"))
		{
			test.log(LogStatus.PASS, "Open Check Discount Updated with Space in the End of Discount Name");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Open Check Name already exist pop up displayed when Entering Space in the End of Open Item Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Open Item Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Open Check Discount not Saved with Space in the End of Discount Name");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("Verify the Cancelled Open Check Discount Deleted\\/Inactivated or not")
	public void VerifyCancelledOpenCheckDiscountDeletedOrNot() 
	{
		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Inactivated Successfully"))
			{
				test.log(LogStatus.FAIL, "Open check Deleted when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Open check not Deleted when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
			//cmp.Click_CancelButtonInAlert();
		}
	}
	
	@And("I Verifying the Open Check Discount Deleted or not")
	public void VerifyOpenCheckDeletedOrNOt() 
	{
		try {
			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the Open Item Discount Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Inactivated Successfully"))
			{
				test.log(LogStatus.PASS, "Open Check Discount Inactivated Successfully");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Open Check Discount Inactivated Failed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch (Exception e) 
		{
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Activated Successfully"))
			{
				test.log(LogStatus.PASS, "Open Check Discount Activated Successfully");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Open Check Discount activated Failed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
	}
	
	
}
