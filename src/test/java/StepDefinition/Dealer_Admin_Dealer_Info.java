package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.Pages.Settings_StoreInformation_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Dealer_Admin_Dealer_Info 
{

	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage repts=new ReportsPage();
	Settings_StoreInformation_Page si=new Settings_StoreInformation_Page();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));

	@Given("Open the Dealer Admin - Dealer Info home page BaseURL and StoreID")
	public void openTheDealerAdminDealerInfoHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Dealer Info page

		
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"dealer-info");
	}

	@Given("Verifying the Dealer Admin Dealer Info Homepath")
	public void verifyingTheDealerAdminDealerInfoHomepath() {
	    // Write code here that turns the phrase above into concrete actions
		String home = cmp.Home.getText();
		String path = cmp.path1.getText();
	

		String total = home+path;
		System.out.println(total);

		if(total.equalsIgnoreCase("Admin / Dealer Info")) {

			test.log(LogStatus.PASS, "Dealer Admin - Dealer Info Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Dealer Admin - Dealer Info Path is not displayed");
		}
	}

	
	@Given("I Select the Dealer Info Tab")
	public void iSelectTheDealerInfoTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Select_Dealer_Info_Tab();
	}
	@Given("I Enter the Address Line1")
	public void iEnterTheAddressLine1() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   lap.Enter_Address_Line1("1234, Gandhi Baazar");
	}
	@Given("I Enter the Address Line2")
	public void iEnterTheAddressLine2() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_Address_Line2("Thalavanur");
	}
	@Given("I Enter the City")
	public void iEnterTheCity() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_City("Gingee");
	}
	@Given("I Enter the State")
	public void iEnterTheState() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_State("Tamil Nadu");
	}
	@Given("I Enter the Zip Code")
	public void iEnterTheZipCode() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_ZipCode("604202");
	}
	@Given("I Enter the Country")
	public void iEnterTheCountry() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_Country("INDIA");
	}
	@Then("I Select the SMTP Info Tab")
	public void iSelectTheSMTPInfoTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Select_SMTP_Info_Tab();
	}
	@Then("I Enter the User Name")
	public void iEnterTheUserName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_User_Name(Utility.getProperty("UserName_Dealer"));
	}
	@Then("I Enter the Server")
	public void iEnterTheServer() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_Server("west.EXCH031.serverdata.net");
	}
	@Then("I Enter the From")
	public void iEnterTheFrom() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   lap.Enter_From(Utility.getProperty("UserName_Dealer"));
	}
	@Then("I Enter the Port Number")
	public void iEnterThePortNumber() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_Port_Number("9220");
	}
	@Given("I Enter the Invalid Phone Number below Six digits")
	public void iEnterTheInvalidPhoneNumberBelowSixDigits() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_Phone_Number("88272");
	}
	@Then("Check Enter Valid Phone Number Phone Number should be contain at least Six digits Error is Displayed")
	public void checkEnterValidPhoneNumberPhoneNumberShouldBeContainAtLeastSixDigitsErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Phone_Number_Should_be_6_Digits_ErrorMsg, "Phone Number should be 6 digits Error");
	}
	
	@Given("I Enter the Invalid Support Phone Number below Six digits")
	public void iEnterTheInvalidSupportPhoneNumberBelowSixDigits() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(lap.Support_Phone_Number_InputBx, "98409", "Support Phone lessthan 6 digits Entered");
	}

	@Given("I Clear the Back Office URL")
	public void iClearTheBackOfficeURL() {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Back_Offic_URL_InputBx.clear();
	}

	@Given("I Clear the User Name")
	public void iClearTheUserName() {
	    // Write code here that turns the phrase above into concrete actions
	    lap.UserName_InputBx.clear();
	}
	
	@Given("I Clear the Password")
	public void iClearThePassword() {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Password_InputBx.clear();
	}
	@Given("I Clear the Server")
	public void iClearTheServer() {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Server_InputBx.clear();
	}
	
	@Given("I Clear the From")
	public void iClearTheFrom() {
	    // Write code here that turns the phrase above into concrete actions
	    lap.From_InputBx.clear();
	}
	
	@Given("I Clear the Port Number")
	public void iClearThePortNumber() {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Port_InputBx.clear();
	}

	@Then("Check the Save button is Enabled")
	public void checkTheSaveButtonIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Enabled(cmp.Save_Button());
	}
	
	@Then("Verify whether the Dealer Info Updated or Not")
	public void verifyWhetherTheDealerInfoUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Dealer Updated");
	}

	@Given("I Upload the Image for BO Login Screen Icon")
	public void iUploadTheImageForBOLoginScreenIcon() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.BO_Login_Screen_Img_FileIcon.sendKeys(Utility.getProperty("Settings_Store_Information_Store_Image_Path"));
	}
	@Given("I Upload the Image for BO Application Icon")
	public void iUploadTheImageForBOApplicationIcon() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.BO_Application_Img_FileIcon.sendKeys(Utility.getProperty("Store_Logo_Path"));
	}
	@Given("I Upload the Image for Admin Page Logo")
	public void iUploadTheImageForAdminPageLogo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Admin_Page_Logo_Img_FileIcon.sendKeys(Utility.getProperty("DisplayGroupImage"));
	}
	@Given("I Upload the Image for Web Browser Tab Icon")
	public void iUploadTheImageForWebBrowserTabIcon() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Web_Browser_Tab_Screen_Img_FileIcon.sendKeys(Utility.getProperty("DisplayGroupImage"));
	}
	@Given("I Upload the Image for Dealer POS Screen Icon")
	public void iUploadTheImageForDealerPOSScreenIcon() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Dealer_POS_Screen_Img_FileIcon.sendKeys(Utility.getProperty("Store_Logo_Path"));
	}
	@Given("I Upload the Image for Web POS Login Page")
	public void iUploadTheImageForWebPOSLoginPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Web_POS_Login_Page_Img_FileIcon.sendKeys(Utility.getProperty("Store_Logo_Path"));
	}

}
