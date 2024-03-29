package StepDefinition;

import org.openqa.selenium.By;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_RevenueCenter_Page;
import com.Pages.Settings_WaitList_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Wait_List 
{

	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_WaitList_Page wl=new Settings_WaitList_Page();
	
	@Given("Open the Settings - Wait List home page BaseURL and StoreID")
	public void openTheSettingsWaitListHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Kitchen Printer page
		lgpg.Open_URL(Utility.getProperty("baseURL")+"settings/"+"waitList");
	}
	@Given("Verifying the Wait List Header Page")
	public void verifyingTheWaitListHeaderPage() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyMainScreenPageHeader("Wait List");
	}
	@Given("Click the New Wait List button")
	public void clickTheNewWaitListButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(4000);
	    wl.New_Wait_List_button.click();
	}
	@When("Verify the New Wait List Header")
	public void verifyTheNewWaitListHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("New Wait List");
	}
	@Given("I Select Wait List Tab")
	public void iSelectWaitListTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    wl.Wait_List_Tab.click();
	}
	@Then("Check Min Seat Field in Table is Displayed")
	public void checkMinSeatFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(wl.Min_Seat_Column_Field, "Min Seat Column Field");
	}
	@Then("Check Max Seat Field in Table is Displayed")
	public void checkMaxSeatFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(wl.Max_Seat_Column_Field, "Max Seat Column Field");
	}
	@Then("Check Occupied Time Field in Table is Displayed")
	public void checkOccupiedTimeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(wl.Occupied_Time_Column_Field, "Occupied Time Column Field");

	}
	@Then("I Select Reasons Tab")
	public void iSelectReasonsTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    wl.Reasons_Tab.click();
	}
	@Then("Check Reasons Field in Table is Displayed")
	public void checkReasonsFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(wl.Reasons_Column_Field, "Reasons Column Field");

	}
	@Given("I Enter the Max Seats")
	public void iEnterTheMaxSeats() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(wl.Max_SeatInputBx, "4", "Max Seats Entered");
	}
	@Given("I Select the Hours")
	public void iSelectTheHours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown(wl.Hours_Dropdown, "Hours selected");
	}
	@Given("I Select the Minutes")
	public void iSelectTheMinutes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown(wl.Minutes_Dropdown, "Minutes selected");
	}
	@Given("I Enter the Min Seats")
	public void iEnterTheMinSeats() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(wl.Min_SeatInputBx, "2", "Min Seats Entered");
	}
	@Given("I Enter the Min Seats as {int}")
	public void iEnterTheMinSeatsAs(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(wl.Min_SeatInputBx, "0", "Min Seats Entered as 0");

	}
	@Then("Check Enter more than Zero value Error is Displayed")
	public void checkEnterMoreThanZeroValueErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(wl.Enter_morethen_0_ValueErrmsg, "Enter more than 0 value Error");
	}
	@Given("I Enter the Invalid Min Seats")
	public void iEnterTheInvalidMinSeats() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(wl.Min_SeatInputBx, "5", "Invalid/More than Max Seats value entered in Min Seats");
	}
	@Then("Check Min Seats should be less than Max Error is Displayed")
	public void checkMinSeatsShouldBeLessThanMaxErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(wl.Min_Seats_Should_Lessthan_Max_ErrorMsg, "Min Seats should be less than Max Error");
	}
	@Then("Check Max Seats should be greater than Min Error is Displayed")
	public void checkMaxSeatsShouldBeGreaterThanMinErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(wl.Max_Seats_Should_Greaterthan_Min_ErrorMsg, "Max Seats should be greater than Min Error");
	}
	@Given("I Enter the Max Seats as {int}")
	public void iEnterTheMaxSeatsAs(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(wl.Max_SeatInputBx, "0", "Max Seats Entered as 0");
	}
	@Given("I Select the Hours as {int}")
	public void iSelectTheHoursAs(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(wl.Hours_Dropdown, "00", "Hours is selected as 00");
	}
	@Given("I Select the Minutes as {int}")
	public void iSelectTheMinutesAs(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(wl.Minutes_Dropdown, "00", "Miutes is selected as 00");
	}
	@Then("Check Wait List Saved without Time or Not")
	public void checkWaitListSavedWithoutTimeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	    cmp.Assertion_Validation_Two_Values(cmp.ConfirmationAlertMsg().getText(), "Enter Occupied Time should be Minimum 5 minuites", "Enter Occupied Time should be Minimum 5 minuites Error Dsiplayed");
	}
	
	@Then("Verify whether Wait List Saved or Not")
	public void verifyWhetherWaitListSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Wait List Added");
	}
	@Then("Verify whether the Duplicate Wait List is Saved or Not")
	public void verifyWhetherTheDuplicateWaitListIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	    cmp.Assertion_Validation_Two_Values(cmp.ConfirmationAlertMsg().getText(), "seat 2 is already occupied.", "seat is already occupied Error is Correctly displayed");
	}
	@Given("I Search the Wait List and Click the Delete button")
	public void iSearchTheWaitListAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//td[contains(.,'2')]/../td[contains(.,'4')]/../td//button")).click();
	    
	    Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Wait List Deleted\\/Inactivated or Not")
	public void verifyTheCancelledWaitListDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Kitchen Printer Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Wait List Removed Successfully"))
		{
			test.log(LogStatus.FAIL, "Wait List Removed when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Wait List Not Removed when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}
	@Then("I Verifying the Wait List Deleted or Not")
	public void iVerifyingTheWaitListDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Wait List Removed");
	}
	@Given("Click the New Reason button")
	public void clickTheNewReasonButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    wl.New_ReasonBtn.click();
	}
	@When("Verify the New Reason Header")
	public void verifyTheNewReasonHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("New Reason");
	}
	@Given("I Enter the Wait List Reason")
	public void iEnterTheWaitListReason() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(wl.Reason_Textbox, "Seats Occupied", "Reasons Entered");
	}
	@Then("Verify whether Wait List Reason Saved or Not")
	public void verifyWhetherWaitListReasonSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions


		cmp.VerifySaveConfirmationAlertMessage("Wait List Reason Added");
		
	}
	@Then("Check Name Already Exist Error is Displayed")
	public void checkNameAlreadyExistErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(cmp.Nama_Already_ExistErrorInputBx, "Name Already Exist Error");
	}
//	@Then("Verify whether the Duplicate Wait List Reason is Saved or Not")
//	public void verifyWhetherTheDuplicateWaitListReasonIsSavedOrNot() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@Given("I Search the Wait List Reason and Click the Delete button")
	public void iSearchTheWaitListReasonAndClickTheDeleteButton() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.SearchBox.clear();
	    Thread.sleep(500);
	    cmp.SearchBox.sendKeys("Seats Occupied");
	    
	    driver.findElement(By.xpath("//td[contains(.,'Seats Occupied')]/../td//button")).click();
	    
	    Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Reason Deleted\\/Inactivated or Not")
	public void verifyTheCancelledReasonDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Kitchen Printer Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Wait List Reason Removed Successfully"))
		{
			test.log(LogStatus.FAIL, "Wait List Reason Removed when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Wait List Reason Not Removed when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}

	@Then("I Verifying the Reason Deleted or Not")
	public void iVerifyingTheReasonDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Wait List Reason Removed");
	}

}
