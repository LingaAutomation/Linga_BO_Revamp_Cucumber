package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Pages.Availability_RestrictionTimePage;
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

public class Linga_Admin_Announcement
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
	Availability_RestrictionTimePage al=new Availability_RestrictionTimePage();

	@Given("Open the Linga Admin - Announcement home page BaseURL and StoreID")
	public void OpenTheLingaAdminAnnouncementHomePageBaseURLAndStoreID() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"announcements");
	}

	@Given("Verifying the Announcement Header")
	public void VerifyAnnouncementHeader()
	{
		cmp.VerifyMainScreenPageHeader("Announcements");
	}

	@When("I Click on the Arrow button in Announcement")
	public void Click_Announcement_ExpandArrow() throws Exception 
	{
		
		for(int i=1;i<=6;i++) 
		{
			Thread.sleep(500);
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		lap.Click_ExpandRowButton();
	}

	@Then("Verify able to View the Announcement Content")
	public void VerifyAnnouncementContent() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[2]/td/div")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Announcement Content Displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Announcement Content not displayed");
		}
	}

	@Given("I Click the New Announcement button")
	public void Click_NewAnnouncementButton() 
	{
		lap.Click_NewAnnouncementButton();
	}

	@When("Verify the New Announcement Header")
	public void VerifyNewAnnouncementHeader() 
	{
		cmp.VerifyCreationScreenPageHeader("New Announcement");
	}

	@And("I Click the Save button without Entering Announcement Name")
	public void ClickOnSaveButtonWithoutEnteringName() throws Exception 
	{
		cmp.EnterName("");
		if(cmp.Save_Button().isEnabled()) {

			test.log(LogStatus.FAIL,"Save Button Not enabled without entering Announcement Name");
		}

		else {
			test.log(LogStatus.PASS,"Save  button not enabled without entering Name");
		}
	}

	@Then("Check From Date Default Value")
	public void CheckFromDateDefaultValue() 
	{
		String FromDateDefaultValue = lap.FromdateInputBox.getText();
		test.log(LogStatus.INFO,"From Date Default Value :"+ FromDateDefaultValue);
	}

	@Then("Check To Date Default Value")
	public void CheckToDateDefaultValue() 
	{
		String ToDateDefaultValue = lap.ToDateInputBox.getText();
		test.log(LogStatus.INFO,"To Date Default Value :"+ ToDateDefaultValue);
	}

	@When("I Enter the Announcement Name")
	public void EnterAnnouncementName() throws Exception
	{
		cmp.EnterName(Utility.getProperty("AdminAnnouncementName"));
	}

	@And("I Select To Date")
	public void SelectStartDate() throws Exception 
	{
		lap.Select_ToDate();
	}

	@And("I Select To Time")
	public void Select_StartTime() throws Exception 
	{
		lap.Select_ToTime("11", "30", al.AM_Btn);
	}

	@And("I Enter Announcement Content")
	public void Enter_AnnouncementContent() throws Exception 
	{
		lap.Enter_Announcement_InputBox(Utility.getProperty("AdminAnnouncementName")+"A1");
	}

	@Then("Verify the Save button is Disabled")
	public void checkTheSaveButtonIsDisabled() {
		// Write code here that turns the phrase above into concrete actions
		if(cmp.Save_Button().isEnabled())
		{
			test.log(LogStatus.FAIL, "Save button is Enabled");

			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.PASS, "Save button is Disabled");

			ut.PassedCaptureScreenshotAsBASE64();

			Assert.assertEquals(false, cmp.Save_Button().isEnabled());
		}
	}

	@And("I Select From Date")
	public void Select_FromDate() throws Exception 
	{
		lap.Select_FromDate();
	}

	@And("I Select From Time")
	public void Select_FromTime() throws Exception
	{
		lap.Select_FromTime("12", "30", al.AM_Btn);
	}

	@Then("Verify the Announcement is Saved or not")
	public void VerifyAnnouncementSavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement saved successfully")) 
		{
			test.log(LogStatus.PASS,"Announcement Saved Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}

		else {
			test.log(LogStatus.FAIL,"Announcement Not Saved Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@When("I Enter the Numbers in Announcement Name")
	public void Enter_NumbersInAnnouncementName() throws Exception 
	{
		cmp.EnterName(Utility.getProperty("AdminAnnouncementName_Numbers"));
	}

	@Then("Verify the Announcement is Saved or not with Numbers in Announcement name")
	public void VerifyWhetherIsAnnouncementSavedOrNotWithNumbers() throws Exception 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement saved successfully")) 
		{
			test.log(LogStatus.PASS,"Announcement Saved Successfully with Numbers");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exists"))
		{
			test.log(LogStatus.PASS,"Name Already Exist popup displayed");
			ut.PassedCaptureScreenshotAsBASE64();
			cmp.Click_BackspaceButton();
		}

		else {
			test.log(LogStatus.FAIL,"Announcement Not Saved Successfully with Numbers in Name Field");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@When("I Enter the Special Characters in Announcement Name")
	public void Enter_SpecialCharactersInAnnouncementName() throws Exception 
	{
		cmp.EnterName("#$$$$#@@@");
	}

	@Then("Verify the Announcement is Saved with Special characters or not")
	public void VerifyAnnouncementWithSpecialcharacters() throws Exception 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement saved successfully")) 
		{
			test.log(LogStatus.PASS,"Announcement Saved Successfully with Special Characters");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exists"))
		{
			test.log(LogStatus.PASS,"Name Already Exist popup displayed");
			ut.PassedCaptureScreenshotAsBASE64();
			cmp.Click_BackspaceButton();
		}

		else {
			test.log(LogStatus.FAIL,"Announcement Not Saved Successfully with Special characters in Name Field");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Select the Invalid From Date")
	public void Select_InvalidFromDate() throws Exception
	{
		lap.SelectInvalidFromDate();
	}

	@Given("I Search and Edit the Announcement")
	public void SearchAndClickEdit() throws Exception 
	{
		cmp.SearchAndClickEdit(Utility.getProperty("AdminAnnouncementName"));
	}

	@When("Verify the Update Announcement Header")
	public void Verify_UpdateAnnouncementHeader() 
	{
		cmp.VerifyCreationScreenPageHeader("Update Announcement");
	}

	@And("Verify the Update button is Disabled")
	public void VerifyUpdateButton() 
	{
		if(lap.UpdateButton.isEnabled())
		{
			test.log(LogStatus.FAIL, "Update button is Enabled");

			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.PASS, "Update button is Disabled");

			ut.PassedCaptureScreenshotAsBASE64();

			Assert.assertEquals(false, lap.UpdateButton.isEnabled());
		}
	}

	@Then("Check Previous From Date is Disabled")
	public void Select_FromDateIsdisabled() 
	{
		try {
		if(!driver.findElement(By.xpath("(//td[@role='gridcell'])[1]")).isEnabled()) {
			test.log(LogStatus.PASS,"Previous From Dates are disabled");
		}
		else{
			test.log(LogStatus.FAIL,"Previous From Dates is Enabled");
		}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Not able to click Previoud Dates because past dates are disabled ");
		}
	}

	@Then("Check Previous To Date is Disabled")
	public void Select_ToDateIsDisabled() 
	{
		try {
		if(!driver.findElement(By.xpath("(//td[@role='gridcell'])[1]")).isEnabled()) {
			test.log(LogStatus.PASS,"Previous To Dates are disabled");
		}
		else{
			test.log(LogStatus.FAIL,"Previous To Dates is Enabled");
		}
	}
	catch (Exception e) {
		test.log(LogStatus.INFO,"Not able to click Previoud Dates because past dates are disabled ");
	}
	}

	@When("I Clear the text in Announcement Content")
	public void TextAnnouncement_Content() 
	{
		lap.Announcement_InpuBox.clear();
	}

	@Then("I Enter space five times in the Announcement Content")
	public void EnterSpaceFiveTimesInAnnouncementContent() throws Exception 
	{
		cmp.EnterName(Utility.getProperty("DiscountName_OpenCheckAMT")+Keys.SPACE+Keys.SPACE+Keys.SPACE+Keys.SPACE+Keys.SPACE);
	}

	@Then("I Verify Announcement Updated or not")
	public void VerifyAnnouncementUpdatedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement updated successfully")) 
		{
			test.log(LogStatus.PASS,"Announcement Updated Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}

		else {
			test.log(LogStatus.FAIL,"Announcement Not Updated Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("I Search the Announcement and Click the Delete button")
	public void Search_AndClickDelete() throws Exception 
	{
		cmp.SearchAndClickDelete(Utility.getProperty("AdminAnnouncementName"));

		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}

	@Then("Verify the Cancelled Announcement Inactivated or not")
	public void VerifyCancelledAnnouncementInActivatedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement inactivated successfully"))
			{
				test.log(LogStatus.FAIL, "Announcement Deleted when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();

			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Announcement not Deleted when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}

	}

	@Then("I Verifying the Announcement Deleted or not")
	public void VerifytheAnnouncementDeletedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement inactivated successfully"))
		{
			test.log(LogStatus.PASS, "Announcement Deleted Successfully");

			ut.PassedCaptureScreenshotAsBASE64();

		}

		else
		{
			test.log(LogStatus.FAIL, "Announcement Not Deleted Successfully");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Announcement")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedAnnouncement() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);

		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();

		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");

		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("AdminAnnouncementName"));
	}

	@Given("I Search the Announcement and Click the Active button")
	public void Search_And_Click_Activate() throws Exception 
	{
		cmp.SearchAndClickActivate(Utility.getProperty("AdminAnnouncementName"));

		Thread.sleep(1500);
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}

	@Then("Verify the Cancelled Announcement is Activated or not")
	public void Verify_the_Cancelled_Department_Activated_or_not() throws Throwable {

		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);

		try
		{
			Thread.sleep(3000);
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement activated successfully"))
			{
				test.log(LogStatus.FAIL, "Announcement Activated when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Announcement not Activated when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the Announcement Activated or not")
	public void Verifying_AnnouncementActivatedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement activated successfully"))
		{
			test.log(LogStatus.PASS, "Announcement Activated Successflly");

			ut.PassedCaptureScreenshotAsBASE64();
		}

		{
			test.log(LogStatus.FAIL, "Announcement not Activated Successfully");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Click the Active button to navigate Activated screen to Verify Activated Announcement")
	public void i_Click_the_Active_button() throws Throwable {

		Thread.sleep(500);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();

		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");

		//Verify whether the Department activated or not
		cmp.Verify_Search(Utility.getProperty("AdminAnnouncementName"));
	}

	@Then("Verify whether the Duplicate Announcement is Saved or not")
	public void VerifyWhetherDuplicateAnnouncementIsSavedorNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Department Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Announcement Name already exist pop up displayed");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement saved successfully"))
		{
			test.log(LogStatus.PASS, "Duplicate Announcement Saved");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Announcement Name already exist pop up not Displayed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@When("I Enter the New Announcement Name with Space")
	public void EnterAnnouncementNameWithSpace() throws Exception 
	{
		cmp.EnterName((Utility.getProperty("AdminAnnouncementName"))+Keys.SPACE);
	}

	@Then("Verify whether the Announcement Name with Space in end is Updated or not")
	public void VerifywhetherAnnouncementNamewithspaceUpdatedOrNot() 
	{
		// Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Announcement Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Announcement Updated with Space in the End of Announcement Name");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Announcement Name already exist pop up displayed when Entering Space in the End of Announcement Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Announcement Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Announcement not Saved with Space in the End of Announcement Name");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
//	@And("I Click the Save button")
//	public void ClickSaveButton() throws Exception 
//	{
//		if(driver.findElement(By.xpath("//button[contains(.,'SAVE')]")).isEnabled()) 
//		{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(.,'SAVE')]")).click();
//		}
//	}
	
	@And("I click the Update button in Announcement")
	public void Click_UpdateButton() 
	{
		lap.UpdateButton.click();
	}
	
	@And("I Click the Cancel button in Announcement")
	public void Click_CancelButtonInAnnouncement() 
	{
		lap.Cancel.click();
	}
}
