package StepDefinition;

import org.openqa.selenium.Keys;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Linga_Admin_Countries 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	@Given("Open the Admin-Countries page BaseURL and StoreID")
	public void openTheAdminCountriesPageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Department page
	
		
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"settings/countries");
	}
	@Given("Verifying the Countries Header Page")
	public void verifyingTheCountriesHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//Verify the Countries page loaded or not
		cmp.VerifyMainScreenPageHeader("Countries");	
	}
	
	@Given("Verifying the Path Admin \\/ Settings \\/ Countries Displayed above the Header")
	public void verifyingThePathAdminSettingsCountriesDisplayedAboveTheHeader() {
	    // Write code here that turns the phrase above into concrete actions
		String home = cmp.Home.getText();
		String products_Items = cmp.Modules_Name.getText();
		String Path1 = cmp.path1.getText();

		String total = home+products_Items+Path1;
		System.out.println(total);

		if(total.equalsIgnoreCase("Admin / Settings / Countries")) {

			test.log(LogStatus.PASS, "Countries Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Countries Path is not displayed");
		}
	}
	
	@Given("I can do the Rows Per Page")
	public void iCanDoTheRowsPerPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Rows_Per_Page();
	}

	@Given("Click the New Country button")
	public void clickTheNewCountryButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Click_New_Country();
	}
	@When("Verify the New Country Header")
	public void verifyTheNewCountryHeader() {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.VerifyCreationScreenPageHeader("New Country");
	}

	@Given("I Enter the Country Name Exceeding the limit")
	public void iEnterTheCountryNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Enter_Excess_Limit_Name(lap.Country_Name_InputBx, 25);
	}
	
	@Given("I Enter the Currency Name Exceeding the limit")
	public void iEnterTheCurrencyNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Enter_Excess_Limit_Name(lap.Currency_Name_InputBx, 25);
	}
	@Given("I Enter the Currency Symbol Exceeding the limit")
	public void iEnterTheCurrencySymbolExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Enter_Excess_Limit_Name(lap.Currency_Symbol_InputBx, 25);
	}


@Given("I Enter the Phone Code Exceeding the limit")
public void iEnterThePhoneCodeExceedingTheLimit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Verify_Enter_Excess_Limit_Name(lap.Phone_Code_InputBx, 25);
}

@Given("I Enter the ISO Code Exceeding the limit")
public void iEnterTheISOCodeExceedingTheLimit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Verify_Enter_Excess_Limit_Name(lap.ISO_Code_InputBx, 25);
}

@Given("I Clear the Country Name")
public void iClearTheCountryName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    lap.Country_Name_InputBx.clear();
}


@Given("I Clear the Currency Name")
public void iClearTheCurrencyName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    lap.Currency_Name_InputBx.clear();
}
@Given("I Clear the Currency Symbol")
public void iClearTheCurrencySymbol() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    lap.Currency_Symbol_InputBx.clear();
}

@Given("I Clear the Phone Code")
public void iClearThePhoneCode() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    lap.Phone_Code_InputBx.clear();
}
@Given("I Clear the ISO Code")
public void iClearTheISOCode() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    lap.ISO_Code_InputBx.clear();
}



@Given("I Enter the Currency Name")
public void iEnterTheCurrencyName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Currency_Name_InputBx, Utility.getProperty("Admin_CurrencyName"), "Currency Name Entered");
}
@Given("I Enter the Currency Symbol")
public void iEnterTheCurrencySymbol() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Currency_Symbol_InputBx, Utility.getProperty("Admin_CurrencySymbol"), "Currency Symbol Entered");
}
@Given("I Enter the Phone Code")
public void iEnterThePhoneCode() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Phone_Code_InputBx, "+91", "Phone Code Entered");
}
@Given("I Enter the ISO Code")
public void iEnterTheISOCode() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.ISO_Code_InputBx, "ISO 9001:2008", "ISOs Code Entered");
}
@Given("I Enter the Currency Decimal")
public void iEnterTheCurrencyDecimal() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Currency_Decimal_InputBx, "2", "Currency Decimal Entered");
}
@Given("I Select the Decimal Separator as Comma")
public void iSelectTheDecimalSeparatorAsComma() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Select_Decimal_Separator_as_Comma();
}
@Given("I Select the Thousand Separator as Dot")
public void iSelectTheThousandSeparatorAsDot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Select_Thousand_Separator_as_Dot();
}

@Given("I Enter the Country Name")
public void iEnterTheCountryName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Country_Name_InputBx, Utility.getProperty("Admin_CountryName"), "Country Name Entered");
}
@Given("I Enter the Currency Decimal as Zero")
public void iEnterTheCurrencyDecimalAsZero() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Currency_Decimal_InputBx, "0", "Currency Decimal Entered as 0");
}
@Then("Verify the Country Saved Successfully or not")
public void verifyTheCountrySavedSuccessfullyOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("Country Saved");
}

@Given("I Search and Edit the Country")
public void iSearchAndEditTheCountry() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.SearchAndClickEdit(Utility.getProperty("Admin_CountryName"));
}
@When("Verify the Update Country Header")
public void verifyTheUpdateCountryHeader() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyCreationScreenPageHeader("Update Country");
}
@Then("I Verify Country Update screen Close or not")
public void iVerifyCountryUpdateScreenCloseOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Close_Cancel_CreationScreen("Update Country");
}
@Given("I Select the Decimal Separator as Dot")
public void iSelectTheDecimalSeparatorAsDot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Select_Decimal_Separator_as_Dot();
}
@Given("I Select the Thousand Separator as Comma")
public void iSelectTheThousandSeparatorAsComma() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Select_Thousand_Separator_as_Comma();
}
@Then("Verify the Country Update Successfully or not")
public void verifyTheCountryUpdateSuccessfullyOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("Country Updated");
}

@Given("I Enter the Country Name with Space")
public void iEnterTheCountryNameWithSpace() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(lap.Country_Name_InputBx, Utility.getProperty("Admin_CountryName")+Keys.SPACE, "Country Name Entered with Space");
}
@Then("Verify the Country Updated with Space or not")
public void verifyTheCountryUpdatedWithSpaceOrNot() {
    // Write code here that turns the phrase above into concrete actions
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Country Updated Successfully"))
	{
		test.log(LogStatus.PASS, "Country Updated with Space in the End of Country Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Country Name already exist pop up displayed when Entering Space in the End of Country Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Country Name");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else
	{
		test.log(LogStatus.FAIL, "Country not Updated with Space in the End of Country Name");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}

@Then("Verify the Duplicate Country Saved or not")
public void verifyTheDuplicateCountrySavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	//Check whether the New Coursing Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Country Name already exist pop up displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Error in validation"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Country Saved Successfully"))
	{
		test.log(LogStatus.PASS, "Duplicate Country Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Country Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}








}
