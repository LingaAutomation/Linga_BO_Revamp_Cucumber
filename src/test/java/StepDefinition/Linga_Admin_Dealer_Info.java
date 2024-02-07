package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

public class Linga_Admin_Dealer_Info 
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
	TaxesPage tx=new TaxesPage();
	Settings_StoreInformation_Page si=new Settings_StoreInformation_Page();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	String DealerName;

@Given("Open the Linga Admin - Dealer Info home page BaseURL and StoreID")
public void openTheLingaAdminDealerInfoHomePageBaseURLAndStoreID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(10000);
	//Load the Department page

	
	lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"dealers/dealers");
}
@Given("Verifying the Dealers Headers Page")
public void verifyingTheDealersHeadersPage() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyMainScreenPageHeader("Dealers");
}

@Given("Verifying the Linga Admin Dealer Info Homepath")
public void verifyingTheLingaAdminDealerInfoHomepath() {
    // Write code here that turns the phrase above into concrete actions
	String home = cmp.Home.getText();
	String products_Items = cmp.Modules_Name.getText();
	String Path1 = cmp.path1.getText();

	String total = home+products_Items+Path1;
	System.out.println(total);

	if(total.equalsIgnoreCase("Admin / Dealers / Dealers")) {

		test.log(LogStatus.PASS, "Dealers Path is displayed");
	}
	else {
		test.log(LogStatus.FAIL, "Dealers Path is not displayed");
	}
}

@Given("I Click the New Dealer button")
public void iClickTheNewDealerButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Click_New_DealerButton();
}
@Given("I Enter the Dealer Name Exceeding the limit")
public void iEnterTheDealerNameExceedingTheLimit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
}

@Given("I Enter the New Password")
public void iEnterTheNewPassword() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   lap.Enter_New_Password("Raja@9220");
}

@When("I Enter the Dealer Name")
public void iEnterTheDealerName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.EnterName(Utility.getProperty("Admin_Dealer_Name"));
}
@Then("I Click the Password")
public void iClickThePassword() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   lap.Password_InputBx.click();
}
//@Then("I Click the Aunthentic button")
//public void iClickTheAunthenticButton() throws Exception {
//    // Write code here that turns the phrase above into concrete actions
//    lap.Click_New_AuthenticateButton();
//}
@Then("I Click the Confirm Password")
public void iClickTheConfirmPassword() {
    // Write code here that turns the phrase above into concrete actions
    lap.Confirm_Password_InputBx.click();
}
@Then("I Enter the Phone Number")
public void iEnterThePhoneNumber() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Enter_Phone_Number(Utility.getProperty("User_PhoneNumber"));
}
@Then("I Select the Zoho Code")
public void iSelectTheZohoCode() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Select_Zoho_Code();
}
@Then("I Select the Commission Type as Amount")
public void iSelectTheCommissionTypeAsAmount() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    tx.Select_TaxType_Amount();
}
@Then("I Enter the Back Office URL")
public void iEnterTheBackOfficeURL() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Back_Offic_URL_InputBx, Utility.getProperty("Admin_Back_Office_URL"), "Back Office URL Entered");
}
@Then("I Enter the Purchase URL")
public void iEnterThePurchaseURL() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Purchase_URL_InputBx, Utility.getProperty("Admin_Purchase_URL"), "Purchased URL Entered");

}
@Then("I Enter the Support URL")
public void iEnterTheSupportURL() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Support_URL_InputBx, Utility.getProperty("Admin_Support_URL"), "Support URL Entered");

}
@Then("I Enter the Support Phone Number")
public void iEnterTheSupportPhoneNumber() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Support_Phone_Number_InputBx, Utility.getProperty("Admin_Support_Phone_Number"), "Support Phone Number Entered");
}

@When("I Enter the Email ID")
public void iEnterTheEmailID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Email_Id_InputBx, Utility.getProperty("New_Store_Email"), "Email ID Entered");

}
@When("I Enter the Invalid Phone Number below Ten digits")
public void iEnterTheInvalidPhoneNumberBelowTenDigits() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Enter_Phone_Number("987678");
}
@Then("Check Enter Valid Phone Number Phone Number should be contain at least Ten digits Error is Displayed")
public void checkEnterValidPhoneNumberPhoneNumberShouldBeContainAtLeastTenDigitsErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
//    cmp.Assertion_Validation_True_Element(lap.Phone_Number_Should_be_10_Digits_ErrorMsg);
	 cmp.Check_Element_or_Text_Displayed(lap.Phone_Number_Should_be_10_Digits_ErrorMsg, "Enter Valid Phone Number. Phone Number should be contain at least 10 digits Error");
}

@When("I Enter the Invalid Back Office URL")
public void iEnterTheInvalidBackOfficeURL() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Back_Offic_URL_InputBx, "jh", "Invalid Back Office URL Entered");
}
@Then("Check URL must be Valid Error is Displayed")
public void checkURLMustBeValidErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(lap.URL_Must_be_Valid_ErrorMsg, "URL Must be Valid Error");
}


@When("I Enter the Invalid Purchase URL")
public void iEnterTheInvalidPurchaseURL() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Purchase_URL_InputBx, "Inv", "Invalid Purchase URL Entered");
}

@When("I Enter the Invalid Support URL")
public void iEnterTheInvalidSupportURL() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Support_URL_InputBx, "iv", "Invalid Support URL Entered");
}

@When("I Enter the Invalid Support Phone Number")
public void iEnterTheInvalidSupportPhoneNumber() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cmp.Enter_Text(lap.Support_Phone_Number_InputBx, "999", "Invalid Support Phone Number Entered");
}

@Then("I verify the New Dealer Saved or not")
public void iVerifyTheNewDealerSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	if(wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg())).getText().equals("Dealer Saved Successfully"))
	{
		test.log(LogStatus.PASS, "Dealer Saved Successfully");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Dealer zoho code already exists"))
	{
		test.log(LogStatus.FAIL, "Dealer Zoho Code already exists pop up displayed");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
//		try
//		{
			lap.Select_Zoho_Code();
			
			
			cmp.Click_SaveButton();
			
			Thread.sleep(3000);
			if(wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg())).getText().equals("Dealer Saved Successfully"))
			{
				test.log(LogStatus.PASS, "Dealer Saved Successfully");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Dealer zoho code already exists"))
			{
				test.log(LogStatus.FAIL, "Dealer Zoho Code already exists pop up displayed");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				cmp.Click_BackspaceButton();
			}
			
			
		
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Name already exist pop up displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		
		Thread.sleep(2000);
		cmp.Click_BackspaceButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.FAIL, "Validation Error(s) pop up displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
		
		cmp.Click_BackspaceButton();
	}
	else
	{
		test.log(LogStatus.FAIL, "Dealer Saved Failed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
//		if(cmp.ba.isDisplayed())
//		{
			cmp.Click_BackspaceButton();
//		}
	} 
	catch(Exception k) {}
}

@Given("Search and Edit the Dealer")
public void searchAndEditTheDealer() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try
	{
    cmp.SearchAndClickEdit(Utility.getProperty("Admin_Dealer_Name"));
	}
	catch(Exception k)
	{
		if(lap.Dealer_Not_FoundInfoMsg.isDisplayed())
		{
			
			String DealerName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
			
//			this.DealerName=DealerName;
			
			 cmp.SearchAndClickEdit(DealerName);
			
		}
	}
}
@When("Verify the Update Dealer Header")
public void verifyTheUpdateDealerHeader() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyCreationScreenPageHeader("Update Dealer");
}
@Then("I Verify Dealer Update screen Close or not")
public void iVerifyDealerUpdateScreenCloseOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Close_Cancel_CreationScreen("Update Dealer");
}

@Given("I Clear the Phone Number")
public void iClearThePhoneNumber() {
    // Write code here that turns the phrase above into concrete actions
    lap.Phone_Number_InputBx.clear();
}
@Then("Check Enter Valid Phone Number Error is Displayed")
public void checkEnterValidPhoneNumberErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(lap.Enter_Valid_Phone_Number_ErrorMsg, "Enter Valid Phone Number Error");
}
@Then("Check The value should not be more than {int}% Error is Displayed")
public void checkTheValueShouldNotBeMoreThanErrorIsDisplayed(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(lap.Value_Should_Not_be_100_ErrorMsg, "The value should not be more than 100% Error");
}

@Given("I Clear the Backoffice URL")
public void iClearTheBackofficeURL() {
    // Write code here that turns the phrase above into concrete actions
    lap.Back_Offic_URL_InputBx.clear();
}
//@Then("Check Backoffice URL Error is Displayed")
//public void checkBackofficeURLErrorIsDisplayed() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@Given("I Clear the Purchase URL")
public void iClearThePurchaseURL() {
    // Write code here that turns the phrase above into concrete actions
    lap.Purchase_URL_InputBx.clear();
}
//@Then("Check Purchase URL Error is Displayed")
//public void checkPurchaseURLErrorIsDisplayed() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
@Given("I Clear the Support URL")
public void iClearTheSupportURL() {
    // Write code here that turns the phrase above into concrete actions
    lap.Support_URL_InputBx.clear();
}
@Given("I Clear the Support Phone Number")
public void iClearTheSupportPhoneNumber() {
    // Write code here that turns the phrase above into concrete actions
    lap.Support_Phone_Number_InputBx.clear();
}

@Then("I Click the Authenticate button")
public void iClickTheAuthenticateButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Click_New_AuthenticateButton();
}
@Then("I Select the Commission Type as Percentage")
public void iSelectTheCommissionTypeAsPercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    tx.Select_TaxType_Percentage();
}
@Then("I verify the New Dealer Updated or not")
public void iVerifyTheNewDealerUpdatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("Dealer Updated");
}


@Given("I Search the Dealer and Click the Delete button")
public void iSearchTheDealerAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try
	{
    cmp.SearchAndClickDelete(Utility.getProperty("Admin_Dealer_Name"));
    
    Thread.sleep(500);
	//Click the Delete button
	cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	catch(Exception k)
	{
		if(lap.Dealer_Not_FoundInfoMsg.isDisplayed())
		{
			
			String DealerName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
			this.DealerName=DealerName;
			 cmp.SearchAndClickDelete(DealerName);
			 
			 Thread.sleep(500);
				//Click the Delete button
				cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
			
		}
	}
}


@Then("Verify the Cancelled Dealer Deleted\\/Inactivated or not")
public void verifyTheCancelledDealerDeletedInactivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	try
	{
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Dealer Inactivated Successfully"))
	{
		test.log(LogStatus.FAIL, "Dealer Deleted when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Dealer not Deleted when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}



@Then("I Verifying the Dealer Deleted or not")
public void iVerifyingTheDealerDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Dealer Inactivated");
}
@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Dealer")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedDealer() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Enable the Inactive Status
			cmp.Click_ActivetoInactiveButton();
			
			//Check whether the Inactive screen opened or not
			cmp.VerifyActive_InactiveStatus("Inactive");
			
			Thread.sleep(3000);
			try
			{
			cmp.Verify_Search(Utility.getProperty("Admin_Dealer_Name"));
			}
			catch (Exception e) {
				// TODO: handle exception
				
				cmp.Verify_Search(DealerName);
			}
}


@Given("I Search the Dealer and Click the Active button")
public void iSearchTheDealerAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try
	{
    cmp.SearchAndClickActivate(Utility.getProperty("Admin_Dealer_Name"));
    
    Thread.sleep(1000);
	//Click the Delete button
	cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}
	catch(Exception k)
	{
		if(lap.Dealer_Not_FoundInfoMsg.isDisplayed())
		{
			
//			String DealerName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
//			this.DealerName=DealerName;
			 cmp.SearchAndClickActivate(DealerName);
			 
			 Thread.sleep(1000);
				//Click the Delete button
				cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
			
		}
	}
}
@Then("Verify the Cancelled Dealer is Activated or not")
public void verifyTheCancelledDealerIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	Thread.sleep(3000);
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Dealer Activated Successfully"))
	{
		test.log(LogStatus.FAIL, "Dealer Activated when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Dealer not Activated when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}
@Then("I Verifying the Dealer Activated or not")
public void iVerifyingTheDealerActivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Dealer Activated");
}
@Then("I Click the Active button to navigate Activated screen to Verify Activated Dealer")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedDealer() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	Thread.sleep(3000);
	try
	{
	cmp.Verify_Search(Utility.getProperty("Admin_Dealer_Name"));
	}
	catch (Exception e) {
		// TODO: handle exception
		
		cmp.Verify_Search(DealerName);
	}
}
@Then("Verify whether the Duplicate Delaer is Saved or not")
public void verifyWhetherTheDuplicateDelaerIsSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Dealer already exists"))
	{
		test.log(LogStatus.PASS, "Dealer already exist pop up displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		Thread.sleep(2000);
		cmp.Click_BackspaceButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Dealer zoho code already exists"))
	{
		test.log(LogStatus.INFO, "Dealer zoho code already exists Error is Displayed");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_BackspaceButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_BackspaceButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Dealer Saved Successfully"))
	{
		test.log(LogStatus.FAIL, "Duplicate Dealer Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Dealer Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
}



}
