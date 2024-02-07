package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.Pages.UserManagementPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Linga_Admin_Users 
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
	
	public static String Existing_Email;
	
	UserManagementPage usm=new UserManagementPage();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
	

@Given("Open the Linga-Admin Users home page BaseURL")
public void openTheLingaAdminUsersHomePageBaseURL() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(10000);
	//Load the Department page

	
	lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"users");
}
@Given("Verifying the Users Header Page")
public void verifyingTheUsersHeaderPage() {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifyMainScreenPageHeader("Users");	
}

@Given("Click the New User button")
public void clickTheNewUserButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    usm.Click_New_User();
}
@When("Verify the New User Header")
public void verifyTheNewUserHeader() {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifyCreationScreenPageHeader("New User");
}

@Then("Check the Save button is Disabled")
public void checkTheSaveButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Button_Enabled(cmp.Save_Button(), "Save button");
}


@Given("I Enter the First Name Exceeding the limit")
public void iEnterTheFirstNameExceedingTheLimit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Enter_Excess_Limit_Name(usm.First_Name_Input);
}
@Given("I Enter the Last Name Exceeding the limit")
public void iEnterTheLastNameExceedingTheLimit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Enter_Excess_Limit_Name(usm.Last_Name_Input);
}

@Given("I Enter the First Name")
public void iEnterTheFirstName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    usm.Enter_FirstName("A"+Utility.getProperty("User_FirstName"));
}

@Given("I Clear the First Name")
public void iClearTheFirstName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    usm.Enter_LastName(Utility.getProperty("User_LastName"));
}



@Then("Check Please Enter Name Error is Displayed")
public void checkPleaseEnterNameErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(usm.Please_Enter_Name_ErrorMsg, "Enter Name Error");
}
@Given("I Enter the Admin User First Name")
public void iEnterTheAdminUserFirstName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    usm.Enter_FirstName("A"+Utility.getProperty("User_FirstName"));
}
@Then("I Enter the Admin User Last Name")
public void iEnterTheAdminUserLastName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    usm.Enter_LastName(Utility.getProperty("User_LastName"));
}
@Then("I Enter the Admin User Email ID")
public void iEnterTheAdminUserEmailID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    usm.Enter_Email_ID("a"+Utility.getProperty("User_Email_ID"));
}
@Given("I Clear the Last Name")
public void iClearTheLastName() {
    // Write code here that turns the phrase above into concrete actions
    usm.Last_Name_Input.clear();
}
@Then("Check Please Enter Last Name Error is Displayed")
public void checkPleaseEnterLastNameErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(usm.Please_Enter_Last_Name_ErrorMsg, "Enter Last Name Error");
}
@Given("I Clear the Email ID")
public void iClearTheEmailID() {
    // Write code here that turns the phrase above into concrete actions
    usm.Email_InputBx.clear();
}

@Given("I Enter the Invalid Email ID")
public void iEnterTheInvalidEmailID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    usm.Enter_Email_ID("hbhbasc@");
}
@Then("Check Enter Valid Email ID Error is Displayed")
public void checkEnterValidEmailIDErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(usm.Enter_Valid_Email_ID_ErrorMsg, "Enter Valid Email ID Error");

}

@Then("Verify whether the User is Saved or Not")
public void verifyWhetherTheUserIsSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("User Saved");
}

@Given("I Search and Edit the Linga Admin User")
public void iSearchAndEditTheLingaAdminUser() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.SearchAndClickEdit("A"+Utility.getProperty("User_FirstName"));
}
@When("Verify the Update User Header")
public void verifyTheUpdateUserHeader() {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifyCreationScreenPageHeader("Update User");
}

@Then("I Verify User Update screen Close or not")
public void iVerifyUserUpdateScreenCloseOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Close_Cancel_CreationScreen("Update User");
}
@Then("Check the Update button is Disabled")
public void checkTheUpdateButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Button_Disabled(cmp.Update_Button(), "Update button");
}
@Then("Verify whether the User is Updated or Not")
public void verifyWhetherTheUserIsUpdatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("User Updated");
}
@Given("I Search the Linga Admin User and Click the Delete button")
public void iSearchTheLingaAdminUserAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.SearchAndClickDelete("A"+Utility.getProperty("User_FirstName"));
	
	 Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
}
@Then("Verify the Cancelled User Deleted\\/Inactivated or not")
public void verifyTheCancelledUserDeletedInactivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("User Inactivated Successfully"))
	{
		test.log(LogStatus.FAIL, "User Deleted when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "User not Deleted when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

@Then("I Verifying the User Deleted or not")
public void iVerifyingTheUserDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("User Inactivated");
}
@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Admin User")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedAdminUser() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Enable the Inactive Status
	cmp.Click_ActivetoInactiveButton();
	
	//Check whether the Inactive screen opened or not
	cmp.VerifyActive_InactiveStatus("Inactive");
	
	Thread.sleep(3000);
	cmp.Verify_Search("A"+Utility.getProperty("User_FirstName"));
}



@Given("I Search the Linga Admin User and Click the Active button")
public void iSearchTheLingaAdminUserAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Search and Activate the In activated item
		cmp.SearchAndClickActivate("A"+Utility.getProperty("User_FirstName"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
}
@Then("Verify the Cancelled User is Activated or not")
public void verifyTheCancelledUserIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	Thread.sleep(3000);
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("User Activated Successfully"))
	{
		test.log(LogStatus.FAIL, "User Activated when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "User not Activated when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

@Then("I Verifying the User Activated or not")
public void iVerifyingTheUserActivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("User Activated");
}
@Then("I Click the Active button to navigate Activated screen to Verify Activated Admin User")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedAdminUser() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	//Verify whether the Gratuity activated or not
	cmp.Verify_Search("A"+Utility.getProperty("User_FirstName"));
}

@Then("Verify whether the User is Saved with Existing Email or Not")
public void verifyWhetherTheUserIsSavedWithExistingEmailOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
//	Thread.sleep(5000);
	//Check whether the New Gratuity Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Email id already Exists"))
	{
		test.log(LogStatus.PASS, "Email id already Exists pop up displayed");
	
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
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("User Saved Successfully"))
	{
		test.log(LogStatus.FAIL, "Duplicate Linga Admin - User Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Users Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
		Thread.sleep(2000);
		cmp.Click_CancelButton();
		
		System.out.println("Cancel button not Clicked while creating Duplicate User");
	}
	catch(Exception k)
	{}
}

@Given("I Take the Existing Email ID")
public void iTakeTheExistingEmailID() {
    // Write code here that turns the phrase above into concrete actions
	String Exist_Email=driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
	this.Existing_Email=Exist_Email;
}


@Given("I Enter the Existing Email ID")
public void iEnterTheExistingEmailID() throws Exception {
    // Write code here that turns the phrase above into concrete actions

//	usm.Enter_Email_ID("a"+Utility.getProperty("User_Email_ID"));
	usm.Enter_Email_ID(Existing_Email);
}
@Then("Verify whether the User is Updated with Existing or Duplicate Email or Not")
public void verifyWhetherTheUserIsUpdatedWithExistingOrDuplicateEmailOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
//	Thread.sleep(5000);
	//Check whether the New Gratuity Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Email id already Exists"))
	{
		test.log(LogStatus.PASS, "Email id already Exists pop up displayed");
	
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
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("User Updated Successfully"))
	{
		test.log(LogStatus.FAIL, "Duplicate Linga Admin - User Updated");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Users Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
		Thread.sleep(2000);
		cmp.Click_CancelButton();
		
		System.out.println("Cancel button not Clicked while creating Duplicate User");
	}
	catch(Exception k)
	{}
}


@When("I Enter the New First Name with Space")
public void iEnterTheNewFirstNameWithSpace() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   usm.Enter_FirstName("A"+Utility.getProperty("User_FirstName")+Keys.SPACE);
}
@Then("Verify whether the User Name with Space in end is Updated or not")
public void verifyWhetherTheUserNameWithSpaceInEndIsUpdatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("User Updated Successfully"))
	{
		test.log(LogStatus.PASS, "User Updated with Space in the End of User First Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "User Name already exist pop up displayed when Entering Space in the End of User Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of User Name");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else
	{
		test.log(LogStatus.FAIL, "User not Updated with Space in the End of User Name");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}

}
