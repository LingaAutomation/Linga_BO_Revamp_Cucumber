package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.Settings_CDS_Page;
import com.Pages.Settings_KDS_ConfigurationPage;
import com.Pages.Settings_NotificationsPage;
import com.Pages.SubCategoriesPage;
import com.Pages.UpchargesPage;
import com.epam.healenium.SelfHealingDriver;
import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.ProductItems_Menu_RetailPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.Settings_AdditionalSettingsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentManager;
import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Settings_Additional_Settings 
{

	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	 
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	CategoriesPage ctp=new CategoriesPage();
	DepartmentPage dp=new DepartmentPage();
	CoursingPage cp=new CoursingPage();
	ServingSizeLevelsPage ssl=new ServingSizeLevelsPage();
	KitchenPrinterPage kp=new KitchenPrinterPage();
	ProductItems_Menu_RetailPage pmt=new ProductItems_Menu_RetailPage();
	UpchargesPage up=new UpchargesPage();
	SubCategoriesPage scp=new SubCategoriesPage();
//	Reports_EmployeeLaborPage rel=new Reports_EmployeeLaborPage();
//	Settings_PaymentSettingsPage sps= new Settings_PaymentSettingsPage();
	Settings_KDS_ConfigurationPage kdsc =new Settings_KDS_ConfigurationPage();
	Settings_CDS_Page cds = new Settings_CDS_Page();
	Settings_NotificationsPage snp = new Settings_NotificationsPage();
	Settings_AdditionalSettingsPage adds= new Settings_AdditionalSettingsPage();
	
	@Given("Open the Settings - Additional Settings Home Page BaseURL and storeID")
	public void openTheSettingsAdditionalSettingsHomePageBaseURLAndStoreID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   adds.openTheSettingsCustomerDisplaySystem_CDS_PageBaseURLAndStoreID();
	try {
	cmp.Close_Online_Help_ChatBox();}
	catch(Exception K) {}
}
	

@Given("Verifying Additional Settings Page Header")
public void verifyingAdditionalSettingsPageHeader() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(adds.Additional_Settings, "Additional Settings", "Displayed", "Not Displayed");
}


@Then("I Verify Additional Settings SAVE button is Disabled")
public void iVerifyAdditionalSettingsSAVEButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Disabled(adds.SAVE_Disabled, "SAVE button Disabled", "SAVE button Enabled");
}


@Then("Check Include Credits in Daily Summary Report Field is displayed")
public void checkIncludeCreditsInDailySummaryReportFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(adds.include_Credit, "Include Credits in Daily Summary Report", "Dispalyed", "Not Displayed");
}
@Then("Check Employee Tip Out Deducted from Cash Expected on Reports Field is displayed")
public void checkEmployeeTipOutDeductedFromCashExpectedOnReportsFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(adds.Employee_Tipout, "Employee Tip Out Deducted from Cash Expected on Reports", "Dispalyed", "Not Displayed");
}
@Then("Check Auto Print Close Day Report Field is displayed")
public void checkAutoPrintCloseDayReportFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(adds.Auto_Print, "Auto Print Close Day Report", "Dispalyed", "Not Displayed");
}


@Given("I Click Include Credits in Daily Summary Report Field Toggle as No")
public void iClickIncludeCreditsInDailySummaryReportFieldToggleAsNo() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_No_Btn(adds.include_Credit_YesToggle, adds.include_Credit_NoToggle);
}
@Given("I Click Employee Tip Out Deducted from Cash Expected on Reports Field Toggle as No")
public void iClickEmployeeTipOutDeductedFromCashExpectedOnReportsFieldToggleAsNo() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 snp.IClick_Toggle_No_Btn(adds.Employee_Tipout_YesToggle, adds.Employee_Tipout_NoToggle);
}
@Given("I Click Auto Print Close Day Report Field Toggle as No")
public void iClickAutoPrintCloseDayReportFieldToggleAsNo() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 snp.IClick_Toggle_No_Btn(adds.Auto_Close_YesToggle, adds.Auto_Close_NoToggle);
}


@Given("I Click Include Credits in Daily Summary Report Field Toggle as Yes")
public void iClickIncludeCreditsInDailySummaryReportFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(adds.include_Credit_YesToggle, adds.include_Credit_NoToggle);
}
@Given("I Click Employee Tip Out Deducted from Cash Expected on Reports Field Toggle as Yes")
public void iClickEmployeeTipOutDeductedFromCashExpectedOnReportsFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(adds.Employee_Tipout_YesToggle, adds.Employee_Tipout_NoToggle);
}
@Given("I Click Auto Print Close Day Report Field Toggle as Yes")
public void iClickAutoPrintCloseDayReportFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(adds.Auto_Close_YesToggle, adds.Auto_Close_NoToggle);
}

@Then("I Verify Additional Settings SAVE button is Enabled")
public void iVerifyAdditionalSettingsSAVEButtonIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Enabled(adds.SAVE_Enabled, "SAVE Button Enabled", "SAVE Button Disabled");
}

@Then("I Click Additional Settings SAVE button")
public void iClickAdditionalSettingsSAVEButton() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(adds.SAVE_Enabled);
}

@Then("I Verify Additional Settings SAVED successfully")
public void iVerifyAdditionalSettingsSAVEDSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.IVerify_SettingsSavedSuccessfully("Additional Settings Saved successfully");
}






}
