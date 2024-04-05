package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.Payroll_Report_SettingsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Payroll_Report_Settings 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Payroll_Report_SettingsPage prr=new Payroll_Report_SettingsPage();
	
	@Given("Open the Settings - Payroll Report home page BaseURL and StoreID")
	public void openTheSettingsPayrollReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Label Printer page
		lgpg.Open_URL(Utility.getProperty("baseURL")+"settings/"+"payroll");
	}
	@Given("Verifying the Payroll Report Header Page")
	public void verifyingThePayrollReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Payroll Report page loaded or not
		cmp.VerifyCreationScreenPageHeader_Two("Payroll Report");
	}
	@Then("Check Allow Over Tip Out Toggle is Displayed")
	public void checkAllowOverTipOutToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Allow_OverTip_Out_YesBtn, "Allow Over Tup Out Toggle");
	}
	@Then("Check Payroll Week Start Day Field is Displayed")
	public void checkPayrollWeekStartDayFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Payroll_Week_Start_DayInputBx, "Payroll Week Start Day Field");
	}
	@Then("Check Default Payroll Process Field is Displayed")
	public void checkDefaultPayrollProcessFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Default_Payroll_ProcessInputBx, "Default Payroll Process Field");

	}
	@Then("Check Minimum Age as Age Field is Displayed")
	public void checkMinimumAgeAsAgeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Age_LimitInputBx, "Minimum Age Limit Field");

	}
	@Then("Check Minimum Age as Hours Field is Displayed")
	public void checkMinimumAgeAsHoursFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Hours_LimitInputBx, "Minimum Hours Field");

	}
	@Then("Check Break-In\\/Break-Out Terminal Field is Displayed")
	public void checkBreakInBreakOutTerminalFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Break_In_BreakOut_InputBx, "Break In/Break Out Field");

	}
	@Then("I Select Over Time Settings Tab")
	public void iSelectOverTimeSettingsTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		
		Thread.sleep(2000);
	    prr.OverTime_SettingsTab.click();
	}
	@Then("Check Type Field in Table is Displayed")
	public void checkTypeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Type_Column_Field, "Type in Column Field");

	}
	@Then("Check Effective Date Field in Table is Displayed")
	public void checkEffectiveDateFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Effective_Date_Column_Field, "Effective Date in Column Field");
	}
	@Then("Check Hours Field in Table is Displayed")
	public void checkHoursFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Hours_Column_Field, "Hours in Column Field");
	}
	@Then("Check Percentage Field in Table is Displayed")
	public void checkPercentageFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Percentage_Column_Field, "Percentage in Column Field");

	}
	@Then("I Select Manage Breaks Tab")
	public void iSelectManageBreaksTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
	    Thread.sleep(1000);
	    prr.Manage_BreaksTab.click();
	}
	@Then("Check Break Name Field in Table is Displayed")
	public void checkBreakNameFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Break_Name_Column_Field, "Break Name in Column Field");

	}
	@Then("Check Payroll Type Field in Table is Displayed")
	public void checkPayrollTypeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Payroll_Type_Column_Field, "Payroll Type in Column Field");

	}
	@Then("Check Duration Field in Table is Displayed")
	public void checkDurationFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Duration_Column_Field, "Duration in Column Field");

	}
	@Given("I Enable Allow Over Tip Out Toggle")
	public void iEnableAllowOverTipOutToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    prr.Allow_OverTip_Out_YesBtn.click();
	}
	@Given("I Select Payroll Week Start Day as Monday")
	public void iSelectPayrollWeekStartDayAsMonday() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(prr.Payroll_Week_Start_DayInputBx, "MONDAY", "Monday selected as Payroll Week Start Day");
	}
	@Given("I Select Default Payroll Process as Daily")
	public void iSelectDefaultPayrollProcessAsDaily() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(prr.Default_Payroll_ProcessInputBx, "DAILY", "Daily selected as Default Payroll Process");
	}
	@Then("Check Maximum age limit is {int} Error is Displayed")
	public void checkMaximumAgeLimitIsErrorIsDisplayed(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Maximum_Age_Limit_100ErrorMsg, "Maximum age limit is 100 Error");
	}
	@Given("I Enter Invalid Minimum Age Limit")
	public void iEnterInvalidMinimumAgeLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(prr.Age_LimitInputBx, "120", "Invalid Age Limit is Entered");
	}
	@Given("I Select Payroll Week Start Day as Sunday")
	public void iSelectPayrollWeekStartDayAsSunday() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(prr.Payroll_Week_Start_DayInputBx, "SUNDAY", "Sunday selected as Payroll Week Start Day");

	}
	
	
	
//	@Then("I Enter Minimum Age Limit")
//	public void verifyWhetherPayrollReportSettingsSavedOrNot() throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    cmp.VerifySaveConfirmationAlertMessage("Payroll Settings Updated");
//	}
	
	@Then("Verify whether Payroll Report Settings Saved or Not")
	public void verifyWhetherPayrollReportSettingsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Payroll Settings Updated");
	}
	@Then("Check Allow Over Tip Out Toggle is Enabled")
	public void checkAllowOverTipOutToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(prr.Allow_OverTip_Out_YesBtn, "Allow Over Tip Out");
	}
	
//	@Then("I Enter Minimum Age Limit")
//	public void iEnterMinimumAgeLimit() throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Enter_Text(prr.Age_LimitInputBx, "80", "Age Limit Entered");
//	}
	@Then("Check Payroll Week Start Day selected as Sunday")
	public void checkPayrollWeekStartDaySelectedAsSunday() {
	    // Write code here that turns the phrase above into concrete actions
		String GetDay=prr.Payroll_Week_Start_DayInputBx.getAttribute("value");
		
//		cmp.Assertion_Validation_Two_Values(prr.Payroll_Week_Start_DayInputBx.getAttribute("value"), "SUNDAY", "Sunday is selected as Expected");
		
		cmp.Assertion_Validation_Two_Values(GetDay, "SUNDAY", "Sunday is selected as Expected");
	}
	@Then("Check Default Payroll Process selected as Daily")
	public void checkDefaultPayrollProcessSelectedAsDaily() {
	    // Write code here that turns the phrase above into concrete actions
		String GetProecss=prr.Default_Payroll_ProcessInputBx.getAttribute("value");
		
//		cmp.Assertion_Validation_Two_Values(prr.Payroll_Week_Start_DayInputBx.getAttribute("value"), "SUNDAY", "Sunday is selected as Expected");
		
		cmp.Assertion_Validation_Two_Values(GetProecss, "DAILY", "Daily is selected as Expected");
		}
	@Then("Check Minimum Age Limit is displayed as Expected")
	public void checkMinimumAgeLimitIsDisplayedAsExpected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_Two_Values(prr.Age_LimitInputBx.getAttribute("value"), "20", "Age Limit is displayed as Expected");
	}
	@Given("I Disable Allow Over Tip Out Toggle")
	public void iDisableAllowOverTipOutToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    prr.Allow_OverTip_Out_NoBtn.click();
	}
	@Given("I Select Default Payroll Process as Weekly")
	public void iSelectDefaultPayrollProcessAsWeekly() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(prr.Default_Payroll_ProcessInputBx, "WEEKLY", "Weekly selected as Default Payroll Process");
	}
	@Then("Check Allow Over Tip Out Toggle is Disabled")
	public void checkAllowOverTipOutToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(prr.Allow_OverTip_Out_YesBtn, "Allow Over Tip Out");
	}
	@Then("Check Payroll Week Start Day selected as Monday")
	public void checkPayrollWeekStartDaySelectedAsMonday() {
	    // Write code here that turns the phrase above into concrete actions
	String GetDay=prr.Payroll_Week_Start_DayInputBx.getAttribute("value");
		
//		cmp.Assertion_Validation_Two_Values(prr.Payroll_Week_Start_DayInputBx.getAttribute("value"), "SUNDAY", "Sunday is selected as Expected");
		
		cmp.Assertion_Validation_Two_Values(GetDay, "MONDAY", "Monday is selected as Expected");
	}
	@Then("Check Default Payroll Process selected as Weekly")
	public void checkDefaultPayrollProcessSelectedAsWeekly() {
	    // Write code here that turns the phrase above into concrete actions
		String GetProecss=prr.Default_Payroll_ProcessInputBx.getAttribute("value");
		
//		cmp.Assertion_Validation_Two_Values(prr.Payroll_Week_Start_DayInputBx.getAttribute("value"), "SUNDAY", "Sunday is selected as Expected");
		
		cmp.Assertion_Validation_Two_Values(GetProecss, "WEEKLY", "Weekly is selected as Expected");
	}
	
	@Then("I Select Default Payroll Process as Daily\\/Weekly")
	public void iSelectDefaultPayrollProcessAsDailyWeekly() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(prr.Default_Payroll_ProcessInputBx, "Daily/Weekly", "Daily/Weekly selected as Default Payroll Process");
	}
	@Then("Check Default Payroll Process selected as Daily\\/Weekly")
	public void checkDefaultPayrollProcessSelectedAsDailyWeekly() {
	    // Write code here that turns the phrase above into concrete actions
		String GetProecss=prr.Default_Payroll_ProcessInputBx.getAttribute("value");
		
//		cmp.Assertion_Validation_Two_Values(prr.Payroll_Week_Start_DayInputBx.getAttribute("value"), "SUNDAY", "Sunday is selected as Expected");
		
		cmp.Assertion_Validation_Two_Values(GetProecss, "Daily/Weekly", "Daily/Weekly is selected as Expected");
	
	}
	@Given("I Click the New Overtime button")
	public void iClickTheNewOvertimeButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    prr.Click_New_OverTime();
	}
	@Then("Verify the New Over Time Header")
	public void verifyTheNewOverTimeHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("NEW OVER TIME");
	}
	@Given("I Select Overtime as Daily")
	public void iSelectOvertimeAsDaily() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    prr.Daily_Set_OverTimeRadioBtn.click();
	}
	@Given("I Enter Over Time1 Hours")
	public void iEnterOverTime1Hours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(prr.Hours_OverTime_1_InputBx, "1", "Hours Entered for Over Time 1");
	}
	@Given("I Enter Over Time1 Percentage")
	public void iEnterOverTime1Percentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Percentage_OverTime_1_InputBx, "110", "Percentage Entered for Over Time 1");
	}
	@Given("I Enter Over Time2 Hours")
	public void iEnterOverTime2Hours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Hours_OverTime_2_InputBx, "2", "Hours Entered for Over Time 2");
	}
	@Given("I Enter Over Time2 Percentage")
	public void iEnterOverTime2Percentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Percentage_OverTime_2_InputBx, "120", "Percentage Entered for Over Time 2");
	}
	@Given("I Enter Over Time3 Hours")
	public void iEnterOverTime3Hours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Hours_OverTime_3_InputBx, "3", "Hours Entered for Over Time 3");
	}
	@Given("I Enter Over Time3 Percentage")
	public void iEnterOverTime3Percentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Percentage_OverTime_3_InputBx, "130", "Percentage Entered for Over Time 3");
	}
	@Given("I Select Effective Date")
	public void iSelectEffectiveDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    prr.Select_Effective_Date();
		prr.Select_SameDay_Effective_Date();
	}
	@Given("I Enter Over Time1 Hours as Zero")
	public void iEnterOverTime1HoursAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Hours_OverTime_1_InputBx, "0", "0 Hours Entered for Over Time 1");
	}
	@Given("I Enter Over Time1 Percentage as below {int}")
	public void iEnterOverTime1PercentageAsBelow(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Percentage_OverTime_1_InputBx, "99", "Percentage Entered less than 100 for Over Time 1");
	}
	@Then("Check Enter Valid Percentage should be more than {int} Error is Displayed")
	public void checkEnterValidPercentageShouldBeMoreThanErrorIsDisplayed(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Enter_Valid_Percentage_Morethan_100ErrorMsg, "Enter Valid Percentage should be more than 100 Error");
	}
	@Given("I Enter Over Time2 Hours as Zero")
	public void iEnterOverTime2HoursAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Hours_OverTime_2_InputBx, "0", "0 Hours Entered for Over Time 2");
	}
	@Given("I Enter Over Time2 Percentage as below {int}")
	public void iEnterOverTime2PercentageAsBelow(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Percentage_OverTime_2_InputBx, "99", "Percentage Entered less than 100 for Over Time 2");
	}
	@Given("I Enter Over Time3 Hours as Zero")
	public void iEnterOverTime3HoursAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Hours_OverTime_3_InputBx, "0", "0 Hours Entered for Over Time 3");

	}
	@Given("I Enter Over Time3 Percentage as below {int}")
	public void iEnterOverTime3PercentageAsBelow(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Percentage_OverTime_3_InputBx, "99", "Percentage Entered less than 100 for Over Time 3");

	}
	@Given("I Enter Duplicate Over Time2 Hours")
	public void iEnterDuplicateOverTime2Hours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    String DupHour=prr.Hours_OverTime_1_InputBx.getAttribute("value");
	    
		cmp.Enter_Text(prr.Hours_OverTime_2_InputBx, DupHour, "Duplicate Hours Entered for Over Time 2");
	}
	@Then("Check Enter Valid Hours Error is Displayed")
	public void checkEnterValidHoursErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.Enter_Valid_HoursErrorMsg, "Enter Valid Hours Error");
	}
	@Given("I Enter Duplicate Over Time3 Hours")
	public void iEnterDuplicateOverTime3Hours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    String DupHour=prr.Hours_OverTime_1_InputBx.getAttribute("value");
	    
		cmp.Enter_Text(prr.Hours_OverTime_3_InputBx, DupHour, "Duplicate Hours Entered for Over Time 3");
	}
	@Given("I Enter Duplicate Over Time1 Hours")
	public void iEnterDuplicateOverTime1Hours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    String DupHour=prr.Hours_OverTime_2_InputBx.getAttribute("value");
	    
		cmp.Enter_Text(prr.Hours_OverTime_1_InputBx, DupHour, "Duplicate Hours Entered for Over Time 1");
	}
	@Given("I Select Overtime as Weekly")
	public void iSelectOvertimeAsWeekly() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    prr.Weekly_Set_OverTimeRadioBtn.click();
	}
	@Given("I Enter Over Time Hours")
	public void iEnterOverTimeHours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Hours_LimitInputBx, "5", "Hours Entered for Weekly Over Time");
	}
	@Given("I Enter Over Time Percentage")
	public void iEnterOverTimePercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(cmp.Percentage_InputBx, "150", "Percentage Entered for Weekly Over Time");
	}

	@Given("I Enter Over Time Hours as Zero")
	public void iEnterOverTimeHoursAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(prr.Hours_LimitInputBx, "0", "0 Hours Entered for Weekly Over Time");
	}
	@Given("I Enter Over Time Percentage as below {int}")
	public void iEnterOverTimePercentageAsBelow(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Enter_Text(cmp.Percentage_InputBx, "60", "Percentage below 100 Entered for Weekly Over Time");
	}
	@Then("Verify whether OT Settings Saved or Not")
	public void verifyWhetherOTSettingsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("OT Settings Saved");
	}
	@Then("Verify whether Duplicate OT Settings Saved or Not")
	public void verifyWhetherDuplicateOTSettingsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Verify whether the Payroll Report Saved or not 
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Effective date already exists"))
		{
			test.log(LogStatus.PASS, "Effective date already exists is Displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();

		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("OT Settings Saved Successfully"))
		{

			test.log(LogStatus.FAIL, "Duplicate Over Time Saved");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.INFO, "Over Time Save Failed");
			ut.InfoCaptureScreenshotAsBASE64();
		}
		
	}
	@Given("I Edit the Daily Overtime")
	public void iEditTheDailyOvertime() {
	    // Write code here that turns the phrase above into concrete actions
		prr.Edit_Daily_OverTime();
	}
	@Then("Verify the Update Over Time Header")
	public void verifyTheUpdateOverTimeHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("Update Over Time");
	}
	@Given("I Clear Over Time1 Hours")
	public void iClearOverTime1Hours() {
	    // Write code here that turns the phrase above into concrete actions
	    prr.Hours_OverTime_1_InputBx.clear();
	}
	@Given("I Clear Over Time1 Percentage")
	public void iClearOverTime1Percentage() {
	    // Write code here that turns the phrase above into concrete actions
		 prr.Percentage_OverTime_1_InputBx.clear();
	}
	@Given("I Clear Over Time2 Hours")
	public void iClearOverTime2Hours() {
	    // Write code here that turns the phrase above into concrete actions
		 prr.Hours_OverTime_2_InputBx.clear();
	}
	@Given("I Clear Over Time2 Percentage")
	public void iClearOverTime2Percentage() {
	    // Write code here that turns the phrase above into concrete actions
		 prr.Percentage_OverTime_2_InputBx.clear();
	}
	@Given("I Clear Over Time3 Hours")
	public void iClearOverTime3Hours() {
	    // Write code here that turns the phrase above into concrete actions
		 prr.Hours_OverTime_3_InputBx.clear();
	}
	@Given("I Clear Over Time3 Percentage")
	public void iClearOverTime3Percentage() {
	    // Write code here that turns the phrase above into concrete actions
		 prr.Percentage_OverTime_3_InputBx.clear();
	}
	@Given("I Edit the Weekly Overtime")
	public void iEditTheWeeklyOvertime() {
	    // Write code here that turns the phrase above into concrete actions
	    prr.Edit_Weekly_OverTime();
	}
	@Given("I Clear Over Time Hours")
	public void iClearOverTimeHours() {
	    // Write code here that turns the phrase above into concrete actions
		 prr.Hours_LimitInputBx.clear();
	}
	@Given("I Change Effective Date")
	public void iChangeEffectiveDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    prr.Select_SameDay_Effective_Date();
		prr.Select_Effective_Date();
	}
	@Then("Verify whether OT Settings Updated or Not")
	public void verifyWhetherOTSettingsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("OT Settings Updated");
	}
	
	@When("Verify the New Break Header")
	public void verifyTheNewBreakHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("New Break");
	}
	@Given("I Click the New Break button")
	public void iClickTheNewBreakButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    prr.New_Break_Btn.click();
	}
	@Given("I Enter the Duration")
	public void iEnterTheDuration() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(prr.Duration_InputBx, "10", "Duration entered");
	}
	@Given("I Select Payroll Type as Paid")
	public void iSelectPayrollTypeAsPaid() {
	    // Write code here that turns the phrase above into concrete actions
	    prr.Paid_PaidType_RadioBtn.click();
	}
	@Given("I Select Apply To as All Employees")
	public void iSelectApplyToAsAllEmployees() {
	    // Write code here that turns the phrase above into concrete actions
	    prr.All_Employees_RadioBtn.click();
	}
	@Given("I Select Break Name as Meal Break")
	public void iSelectBreakNameAsMealBreak() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(prr.Break_Name_InputBx, "Meal Break", "Meal Break selected as Break Name");
	}
	@Given("I Enter the Duration as Zero")
	public void iEnterTheDurationAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(prr.Duration_InputBx, "0", "Duration entered as 0");
	}

	@Given("I Select Break Name as Rest Break")
	public void iSelectBreakNameAsRestBreak() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(prr.Break_Name_InputBx, "Rest Break", "Rest Break selected as Break Name");

	}
	@Given("I Enter the Duration above {int}")
	public void iEnterTheDurationAbove(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(prr.Duration_InputBx, "101", "Duration entered above 100");
	}
	@Then("Check Duration Minimum {int} mins and Maximum {int} mins Error is Displayed")
	public void checkDurationMinimumMinsAndMaximumMinsErrorIsDisplayed(Integer int1, Integer int2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Enter_Text(prr.Duration_InputBx, "101", "Duration entered above 100");
		cmp.Check_Element_or_Text_Displayed(prr.Duration_Min1_Max100_ErrorMsg, "Duration Min 1 & Max 100 Error");
	}
	@Given("I Select Apply To as Specific Roles")
	public void iSelectApplyToAsSpecificRoles() {
	    // Write code here that turns the phrase above into concrete actions
	    prr.Specific_Roles_RadioBtn.click();
	}
	@Given("I Select Apply To as Specific Employees")
	public void iSelectApplyToAsSpecificEmployees() {
	    // Write code here that turns the phrase above into concrete actions
	    prr.Specific_Employees_RadioBtn.click();
	}
	@Then("Verify whether Break Settings Saved or Not")
	public void verifyWhetherBreakSettingsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Break Settings Saved");
	}
	@Given("I Select Break Name as Others")
	public void iSelectBreakNameAsOthers() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(prr.Break_Name_InputBx, "Others", "Others selected as Break Name");

	}
	@Given("I Select Payroll Type as Unpaid")
	public void iSelectPayrollTypeAsUnpaid() {
	    // Write code here that turns the phrase above into concrete actions
	    prr.Unpaid_PaidType_RadioBtn.click();
	}
	@Given("I Search the Break in Payroll Report Settings and Click the Delete button")
	public void iSearchTheBreakInPayrollReportSettingsAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.SearchAndClickDelete("Others");
		Thread.sleep(2000);
		cmp.SearchBox.clear();
		cmp.SearchBox.sendKeys("Others");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Others')]/../../td[5]//button")).click();
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Break in Payroll Report Settings Deleted\\/Inactivated or Not")
	public void verifyTheCancelledBreakInPayrollReportSettingsDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Break Settings Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Break Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Break not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}

	@Then("I Verifying the Break in Payroll Report Settings Deleted or Not")
	public void iVerifyingTheBreakInPayrollReportSettingsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Break Settings Deleted");
	}
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Break in Payroll Report Settings")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedBreakInPayrollReportSettings() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search("Others");
		
		//Enable the Inactive Status
		cmp.Click_InactivetoActiveButton();
		
		Thread.sleep(2000);
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		int rowSize=rowList.size();
		
		
		for(int i=1;i<=rowSize;i++)
		{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).click();
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
		
		Thread.sleep(1000);
		cmp.Click_DeleteButton();
		
		cmp.VerifySaveConfirmationAlertMessage("Break Settings Deleted");
		}
		
		
	}
	
	@Then("Check the Save buttonTwo is Disabled")
	public void checkTheSaveButtonTwoIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Button_Disabled(cmp.Save_ButtonTwo(), "Save");
	}

	@Given("I Click the Save buttonTwo")
	public void iClickTheSaveButtonTwo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Click_Save_ButtonTwo();
	}

}
