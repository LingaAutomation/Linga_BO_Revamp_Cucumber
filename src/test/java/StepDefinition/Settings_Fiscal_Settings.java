package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_AccountBalance_Page;
import com.Pages.Settings_Fiscal_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Fiscal_Settings 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;


    LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Fiscal_Page fs=new Settings_Fiscal_Page();
	
	@Given("Open the Settings - Fiscal home page BaseURL and StoreID")
	public void openTheSettingsFiscalHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Fiscal Settings page
		lgpg.Open_URL(Utility.getProperty("baseURL")+"settings/"+"fiscal");
	}
	@Given("Verifying the Fiscal Settings Header Page")
	public void verifyingTheFiscalSettingsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Fiscal Settingss page loaded or not
		cmp.VerifyMainScreenPageHeader("Fiscal");	
	}
	@Given("Click the New Fiscal Settings button")
	public void clickTheNewFiscalSettingsButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		try
		{
			if(cmp.CancelBtn.isDisplayed())
			{
				cmp.CancelBtn.click();
			}
		}
		catch(Exception l) {}
	    Thread.sleep(3000);
	    fs.New_Fiscal_Settings_Button.click();
	}
	@When("Verify the New Fiscal Settings Header")
	public void verifyTheNewFiscalSettingsHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("New Fiscal Settings");
	}
	@Then("Check Country Field in Table is Displayed")
	public void checkCountryFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fs.Country_Column, "Country Column Field in Table");
	}
	@Then("Check Provider Field in Table is Displayed")
	public void checkProviderFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fs.Provider_Column, "Provider Column Field in Table");
	}
	@Then("Check VKN Type Field in Table is Displayed")
	public void checkVKNTypeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fs.VKN_Type_Column, "VKN Type Column Field in Table");

	}
	@Then("Check SCL No Field in Table is Displayed")
	public void checkSCLNoFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fs.SCL_No_Column, "Country Column Field in Table");

	}
	@Then("I Select Fiscal List Tab")
	public void iSelectFiscalListTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    fs.Fiscal_SettingsTab.click();
	}
	@Then("Check Check ID Field in Table is Displayed")
	public void checkCheckIDFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fs.CheckID_Column, "Check ID Column Field in Table");
	}
	@Then("Check Total Field in Table is Displayed")
	public void checkTotalFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fs.Total_Column, "Total Column Field in Table");

	}
	@Then("Check Send Field in Table is Displayed")
	public void checkSendFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fs.Send_Column, "Send Column Field in Table");

	}
	@Given("I Enter Inalid VKN")
	public void iEnterInalidVKN() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		VKN_InputBx.sendKeys("aeiouaeiou");
		cmp.Enter_Text(fs.VKN_InputBx, "aeiouaeiou", "I Entered VKN as Alphabetics");
	}
	@Then("Ckeck VKN Field Accepts Alphabetic Characters or Not")
	public void ckeckVKNFieldAcceptsAlphabeticCharactersOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		//get the value of VKN field
		String s = fs.VKN_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		Assert.assertEquals(Exp_Size, 0);
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter VKN Number more than {int} Digits")
	public void iEnterVKNNumberMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.VKN_InputBx, RandomStringUtils.randomNumeric(15),"VKN Number enterred more than 10 digits");

//	cmp.Enter_Text(null, null, null);
	}
	@Then("Check VKN Field Accepts More than {int} Digits or Not")
	public void checkVKNFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    String VKN=fs.VKN_InputBx.getAttribute("value");
	    
	    int Exp_Size=VKN.length();
	    
	    ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 10);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter Invalid SCL No")
	public void iEnterInvalidSCLNo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(fs.SCL_No_InputBx, "aeiouaeiou", "I Entered SCL No as Alphabetics");
	}
	@Then("Ckeck SCL No Field Accepts Alphabetic Characters or Not")
	public void ckeckSCLNoFieldAcceptsAlphabeticCharactersOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		String s = fs.SCL_No_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 0);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter SCL No more than {int} Digits")
	public void iEnterSCLNoMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.SCL_No_InputBx, RandomStringUtils.randomNumeric(25), "SCL No Entered more than 20 digits");
	}
	@Then("Check SCL No Field Accepts More than {int} Digits or Not")
	public void checkSCLNoFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		String s = fs.SCL_No_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 20);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter Tax Office Name more than {int} Digits")
	public void iEnterTaxOfficeNameMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Tax_Office_Name_InputBx, RandomStringUtils.randomAlphanumeric(55), "Tax Office Name entered more than 50");
	}
	@Then("Check Tax Office Name Field Accepts More than {int} Digits or Not")
	public void checkTaxOfficeNameFieldAcceptsMoreThanDigitsOrNot(Integer int1) throws Exception {
	String s = fs.Tax_Office_Name_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 50);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter Street Name more than {int} Digits")
	public void iEnterStreetNameMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Street_Name_InputBx, RandomStringUtils.randomAlphanumeric(105), "Street Name entered more than 100 digits");
//	cmp.Enter_Text(null, null, null);
	}
	@Then("Check Street Name Field Accepts More than {int} Digits or Not")
	public void checkStreetNameFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		String s = fs.Street_Name_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 100);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter Building Name more than {int} Digits")
	public void iEnterBuildingNameMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Building_Name_InputBx, RandomStringUtils.randomAlphanumeric(55), "Building Name entered more than 50");
	}
	@Then("Check Building Name Field Accepts More than {int} Digits or Not")
	public void checkBuildingNameFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		String s = fs.Building_Name_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 50);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter City Subdivision Name more than {int} Digits")
	public void iEnterCitySubdivisionNameMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.City_Subdivision_InputBx, RandomStringUtils.randomAlphanumeric(55), "City Subdivision Name entered more than 50 digits");
	}
	@Then("Check City Subdivision Name Field Accepts More than {int} Digits or Not")
	public void checkCitySubdivisionNameFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		String s = fs.City_Subdivision_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 50);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter City Name more than {int} Digits")
	public void iEnterCityNameMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.City_Name_InputBx, RandomStringUtils.randomAlphanumeric(25), "City Name entered more than 20 digits");
	}
	@Then("Check City Name Field Accepts More than {int} Digits or Not")
	public void checkCityNameFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		String s = fs.City_Name_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 20);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter Postal Zone more than {int} Digits")
	public void iEnterPostalZoneMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Postal_Zone_InputBx, RandomStringUtils.randomNumeric(25), "Postal Zone entered more than 20 digits");
	}
	@Then("Check Postal Zone Field Accepts More than {int} Digits or Not")
	public void checkPostalZoneFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	String s = fs.Postal_Zone_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 20);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter Region more than {int} Digits")
	public void iEnterRegionMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Region_InputBx, RandomStringUtils.randomAlphabetic(25), "Region entered more than 20 digits");
	}
	@Then("Check Region Field Accepts More than {int} Digits or Not")
	public void checkRegionFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	String s = fs.Region_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 20);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter District more than {int} Digits")
	public void iEnterDistrictMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.District_InputBx, RandomStringUtils.randomAlphabetic(25), "District entered more than 20 digits");
	}
	@Then("Check District Field Accepts More than {int} Digits or Not")
	public void checkDistrictFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	String s = fs.District_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 20);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter Country Name more than {int} Digits")
	public void iEnterCountryNameMoreThanDigits(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Country_Name_InputBx, RandomStringUtils.randomAlphanumeric(25),"Country Name entered more than 20 characters");
	}
	@Then("Check Country Name Field Accepts More than {int} Digits or Not")
	public void checkCountryNameFieldAcceptsMoreThanDigitsOrNot(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	String s = fs.Country_Name_InputBx.getAttribute("value");
		
		int Exp_Size=s.length();
		
		//verify the entered value is available or not
//		if(s.equals("aeiouaeiou")) {
//			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
//		else if(s.equals("")) {
//			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		Assert.assertEquals(Exp_Size, 20);
		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I Enter SCL No")
	public void iEnterSCLNo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.SCL_No_InputBx, Utility.getProperty("Fiscal_SCL_No"), "SCL No entered");
	}
	@Given("I Enter Tax Office Name")
	public void iEnterTaxOfficeName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Enter_Text(fs.Tax_Office_Name_InputBx, RandomStringUtils.randomAlphabetic(25), "Tax Office Name entered");
	    cmp.Enter_Text(fs.Tax_Office_Name_InputBx, "Linga rOS", "Tax Office Name entered");

	}
	@Given("I Enter Street Name")
	public void iEnterStreetName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Enter_Text(fs.Tax_Office_Name_InputBx, RandomStringUtils.randomAlphabetic(25), "Tax Office Name entered");
	    cmp.Enter_Text(fs.Street_Name_InputBx, RandomStringUtils.randomAlphabetic(25), "Street Name entered");

	}
	@Given("I Enter the Building Name")
	public void iEnterTheBuildingName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Enter_Text(fs.Building_Name_InputBx, RandomStringUtils.randomAlphabetic(15), "Building Name entered");
	    cmp.Enter_Text(fs.Building_Name_InputBx, "DLF Block 5", "Building Name entered");

	
	}
	@Given("I Enter City Subdivision Name")
	public void iEnterCitySubdivisionName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.City_Subdivision_InputBx, "Guindy", "City Subdivision Name entered");
	}
	@Given("I Enter City Name")
	public void iEnterCityName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.City_Name_InputBx, "Chennai", "City Name entered");

	}
	@Given("I Enter Postal Zone")
	public void iEnterPostalZone() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Postal_Zone_InputBx, "600025", "Postal Zone entered");

	}
	@Given("I Enter Region")
	public void iEnterRegion() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Region_InputBx, "Chennai South", "Region entered");
	}
	@Given("I Enter District")
	public void iEnterDistrict() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.District_InputBx, "Chennai", "District entered");
	}
	@Given("I Enter Country Name")
	public void iEnterCountryName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Country_Name_InputBx, "India", "Country Name entered");
	}
	@Given("I Select Provider")
	public void iSelectProvider() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.Click_DropDown(fs.Select_Provider_InputBx, "Provider selected");
	}
	@Given("I Enter User Name")
	public void iEnterUserName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.User_Name_InputBx, Utility.getProperty("New_Store_Name"), "User Name entered");

	}
	@Given("I Enter Passeord")
	public void iEnterPasseord() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.Password_InputBx, Utility.getProperty("password"), "Password entered");
	}
	@Given("I Enter VKN")
	public void iEnterVKN() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fs.VKN_InputBx, Utility.getProperty("Fiscal_VKN"), "VKN entered");
	}
	@Then("Verify whether the New Fiscal Settings Saved or Not")
	public void verifyWhetherTheNewFiscalSettingsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Fiscal Settings Saved");
	}
	@Given("I Search and Edit the Fiscal Settings")
	public void iSearchAndEditTheFiscalSettings() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			if(cmp.CancelBtn.isDisplayed())
			{
				cmp.CancelBtn.click();
			}
		}
		catch(Exception l) {}
	    cmp.SearchAndClickEdit(Utility.getProperty("Fiscal_SCL_No"));
	}
	@When("Verify the Update Fiscal Settings Header")
	public void verifyTheUpdateFiscalSettingsHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("Update Fiscal Settings");
	}
	@Then("I Verify Fiscal Update screen Close or Not")
	public void iVerifyFiscalUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Close_Cancel_CreationScreen("Update Fiscal Settings");
	}
	@Given("I Clear VKN")
	public void iClearVKN() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.VKN_InputBx.clear();
	}
	@Given("I Clear SCL No")
	public void iClearSCLNo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.SCL_No_InputBx.clear();
	}
	@Given("I Clear Tax Office Name")
	public void iClearTaxOfficeName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.Tax_Office_Name_InputBx.clear();
	}
	@Given("I Clear Street Name")
	public void iClearStreetName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.Street_Name_InputBx.clear();
	}
	@Given("I Clear Building Name")
	public void iClearBuildingName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.Building_Name_InputBx.clear();
	}
	@Given("I Clear City Subdivision Name")
	public void iClearCitySubdivisionName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.City_Subdivision_InputBx.clear();
	}
	@Given("I Clear City Name")
	public void iClearCityName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.City_Name_InputBx.clear();
	}
	@Given("I Clear Postal Zone")
	public void iClearPostalZone() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.Postal_Zone_InputBx.clear();
	}
	@Given("I Clear Region")
	public void iClearRegion() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.Region_InputBx.clear();
	}
	@Given("I Clear District")
	public void iClearDistrict() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.District_InputBx.clear();
	}
	@Given("I Clear Country Name")
	public void iClearCountryName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.Country_Name_InputBx.clear();
	}
	@Given("I Clear User Name")
	public void iClearUserName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.User_Name_InputBx.clear();
	}
	@Given("I Clear Password")
	public void iClearPassword() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fs.Password_InputBx.clear();
	}
	@Then("Verify whether the Fiscal Settings Updated or Not")
	public void verifyWhetherTheFiscalSettingsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Fiscal Settings Updated");
	}
	@Then("Verify whether the Duplicate Fiscal is Saved or Not")
	public void verifyWhetherTheDuplicateFiscalIsSavedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Check SCL No Already Exists Error is Displayed")
	public void checkSCLNoAlreadyExistsErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fs.SCL_No_Already_Exist_ErrorMsg, "SCL No already Exists Error");
	}
	@Given("I Search the Fiscal Settings and Click the Delete button")
	public void iSearchTheFiscalSettingsAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickDelete(Utility.getProperty("Fiscal_SCL_No"));
	    
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Fiscal Settings Removed\\/Inactivated or Not")
	public void verifyTheCancelledFiscalSettingsRemovedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Fiscal Settings Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Fiscal Settings Removed Successfully"))
		{
			test.log(LogStatus.FAIL, "Fiscal Settings Removed when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Fiscal Settings not Removed when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Verifying the Fiscal Settings Removed or Not")
	public void iVerifyingTheFiscalSettingsRemovedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.VerifySaveConfirmationAlertMessage("Fiscal Settings Removed");
	}
	@Then("Verify whether the Available Fiscal List is Available or Not")
	public void verifyWhetherTheAvailableFiscalListIsAvailableOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndVerify_SearchBox();
	}
	@Given("I Search the Fiscal Check ID and Click the Delete button")
	public void iSearchTheFiscalCheckIDAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		   cmp.SearchAndClickDelete(Utility.getProperty("Fiscal_SCL_No"));
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		int rowSize=rowList.size();
		
		Random rd=new Random();
		//	rd.nextInt(menuSize);
			
			int randomOption=ThreadLocalRandom.current().nextInt(1, rowSize);
			
			String Option=driver.findElement(By.xpath("//table/tbody/tr["+randomOption+"]/td[1]")).getText();
			
			cmp.SearchBox.clear();
			cmp.SearchBox.sendKeys(Option);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(.,'"+Option+"')]/../td//button")).click();
		    
			Thread.sleep(500);
			//Click the Delete button
			cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Fiscal List Removed\\/Inactivated or Not")
	public void verifyTheCancelledFiscalListRemovedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Fiscal Settings Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Fiscal List Removed Successfully"))
		{
			test.log(LogStatus.FAIL, "Fiscal List Removed when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Fiscal List not Removed when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Verifying the Fiscal List Removed or Not")
	public void iVerifyingTheFiscalListRemovedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.VerifySaveConfirmationAlertMessage("Fiscal List Removed");
	}

}
