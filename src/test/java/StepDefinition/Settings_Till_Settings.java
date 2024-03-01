package StepDefinition;

import org.openqa.selenium.By;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.GeneralSetting_page;
import com.Pages.LoginPage;
import com.Pages.Settings_Till_Setting_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Till_Settings 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Till_Setting_Page tsp=new Settings_Till_Setting_Page();
	
	public static String Denomination_Name, Close_Till;
	
	@Given("Open the Settings - Till Settings home page BaseURL and storeID")
	public void openTheSettingsTillSettingsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		
		//Load the Department page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"till-Settings");

	}
	@Given("Verifying the Settings - Till Settings Header Page")
	public void verifyingTheSettingsTillSettingsHeaderPage() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyMainScreenPageHeader("Till Settings");
	}
	@Given("I Select Till Settings Tab")
	public void iSelectTillSettingsTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    tsp.Till_Settings_Tab.click();
	}
	@Then("Check Automatic Global Till Toggle is Displayed")
	public void checkAutomaticGlobalTillToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(tsp.Automatic_Global_TIll_YesToggle, "Automatic Global Till Toggle");
	}
	@Then("I Enable Automatic Global Till Toggle")
	public void iEnableAutomaticGlobalTillToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    tsp.Automatic_Global_TIll_YesToggle.click();
	}
	@Then("Check Global Till Opening Balance Field is Displayed")
	public void checkGlobalTillOpeningBalanceFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(tsp.Global_OpeningBalance, "Global Till Opening Balance Field");
	}
	@Then("Check Force Cash Out at Clock Out Toggle is Displayed")
	public void checkForceCashOutAtClockOutToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(tsp.Force_CashOut_at_ClockOut_YesToggle, "Force Cash Out at Clock Out Toggle");
	}
	@Then("Check Restrict Partial Payments Toggle is Displayed")
	public void checkRestrictPartialPaymentsToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(tsp.Restrict_Partial_Payments_YesToggle, "Restrict Partial Payments Toggle");
	}
	@Then("Check Add Bank Deposit Field is Displayed")
	public void checkAddBankDepositFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(tsp.addBankDeposit, "Add Bank Deposit Field");
	}
	@Then("I Select Denominations Tab")
	public void iSelectDenominationsTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    tsp.Denominations_Tab.click();
	}
	@Then("Check Add Denomination Field is Displayed")
	public void checkAddDenominationFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(tsp.AddDenominationBtn, "Add Denomination Field");
	}
	@Then("I Select Close Till Tab")
	public void iSelectCloseTillTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    tsp.Close_Tills_Tab.click();
	}
	@Then("Check Rows Per Page Filter Field is Displayed")
	public void checkRowsPerPageFilterFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Rows_Per_Page();
	}
	@Given("I Disable Automatic Global Till Toggle")
	public void iDisableAutomaticGlobalTillToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    tsp.Automatic_Global_TIll_NoToggle.click();
	}
	@Given("I Disable Force Cash Out at Clock Out Toggle")
	public void iDisableForceCashOutAtClockOutToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   Thread.sleep(1000);
		    tsp.Force_CashOut_at_ClockOut_NoToggle.click();
	}
	@Given("I Disable Restrict Partial Payments Toggle")
	public void iDisableRestrictPartialPaymentsToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   Thread.sleep(1000);
		    tsp.Restrict_Partial_Payments_NoToggle.click();
	}
	@Then("Verify Till Settings Updated or Not")
	public void verifyTillSettingsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Till Settings Updated");
	}
	@Then("Check Automatic Global Till Toggle is Disabled")
	public void checkAutomaticGlobalTillToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(tsp.Automatic_Global_TIll_YesToggle, "Automatic Global Till Toggle");
	}
	@Then("Check Force Cash Out at Clock Out Toggle is Disabled")
	public void checkForceCashOutAtClockOutToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Toggle_Disabled(tsp.Force_CashOut_at_ClockOut_YesToggle, "Force Cash Out at Clock Out Toggle");
	}
	@Then("Check Restrict Partial Payments Toggle is Disabled")
	public void checkRestrictPartialPaymentsToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Toggle_Disabled(tsp.Automatic_Global_TIll_YesToggle, "Restrict Partial Payments Toggle");
	}
	@Given("I Enable Force Cash Out at Clock Out Toggle")
	public void iEnableForceCashOutAtClockOutToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    tsp.Force_CashOut_at_ClockOut_YesToggle.click();
	}
	@Given("I Enable Restrict Partial Payments Toggle")
	public void iEnableRestrictPartialPaymentsToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    tsp.Force_CashOut_at_ClockOut_YesToggle.click();
	}
	@Then("Check Automatic Global Till Toggle is Enabled")
	public void checkAutomaticGlobalTillToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Toggle_Enabled(tsp.Automatic_Global_TIll_YesToggle, "Automatic Global Till Toggle");
	}
	@Then("Check Force Cash Out at Clock Out Toggle is Enabled")
	public void checkForceCashOutAtClockOutToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Toggle_Enabled(tsp.Force_CashOut_at_ClockOut_YesToggle, "Force Cash Out at Clock Out Toggle");
	}
	@Then("Check Restrict Partial Payments Toggle is Enabled")
	public void checkRestrictPartialPaymentsToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Toggle_Enabled(tsp.Restrict_Partial_Payments_YesToggle, "Restrict Partial Payments Toggle");
	}
	@Given("I Click the New Bank Deposit button")
	public void iClickTheNewBankDepositButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	   tsp.addBankDeposit.click();
	}
	@Then("Verify whether New Bank Deposit Header")
	public void verifyWhetherNewBankDepositHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("New Bank Deposit");
	}
	@Then("I Enter the Deposit Amount")
	public void iEnterTheDepositAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(tsp.depositAmount_input, "2000", "Deposit Amount Entered");
	}
	@Then("I Select the Business Date")
	public void iSelectTheBusinessDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(1000);
//	    tsp.datePicker_calenderIcon.click();
//	    
	    Thread.sleep(1000);
	    tsp.selectTheBusinessDate();
	}

	@Given("I Click the New Denomnination button")
	public void iClickTheNewDenomninationButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    tsp.AddDenominationBtn.click();
	}
	@Then("Verify whether New Denomination Header")
	public void verifyWhetherNewDenominationHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.VerifyCreationScreenPageHeader("New Denomination");
	}
	@Then("I Clear the Display Name")
	public void iClearTheDisplayName() {
	    // Write code here that turns the phrase above into concrete actions
	    tsp.DisplyName_InputBx.clear();
	}
	@Given("I Enter the Display Name")
	public void iEnterTheDisplayName() {
	    // Write code here that turns the phrase above into concrete actions
	    tsp.Enter_DisplayName();
	}
	@Given("I Enter the Amount as Zero")
	public void iEnterTheAmountAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Amount("0");
	}
	@Then("Check Please Enter Amount Error is Displayed")
	public void checkPleaseEnterAmountErrorIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("")
//	    		{
//	    	
//	    		}
		String Confi=cmp.ConfirmationAlertMsg().getText();
		
		cmp.Assertion_Validation_Two_Values(Confi, "Please Enter Amount", "Please Enter Amount Error Displayed");
	}
	@Then("Verify Denomination Saved or Not")
	public void verifyDenominationSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Denomination Saved");
	}
	@Given("I Search the Denomination and Click the Delete button")
	public void iSearchTheDenominationAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    String Denomin_Name=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
	    this.Denomination_Name=Denomin_Name;
	    cmp.SearchBox.clear();
	    Thread.sleep(2000);
	    cmp.Search(Denomin_Name);
	    
	    driver.findElement(By.xpath("//span[.=' "+Denomin_Name+" ']/../../td[3]//button")).click();
	    
	    if(cmp.Alert_Popup.getText().equalsIgnoreCase("Are you sure you want to delete this item?"))
	    {
	    	test.log(LogStatus.PASS, "Are you sure you want to delete this item?");
	    }
	    
	}
	@Then("Verify the Cancelled Denomination Deleted or Not")
	public void verifyTheCancelledDenominationDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Verify_Search(Denomination_Name);
		
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Denomination Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Denomination Deleted when clicking No button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Denomination not Deleted when Clicking No button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	
	
	@Given("I Search the Till and Click the Close button")
	public void iSearchTheTillAndClickTheCloseButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 String CloseTIll=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
		    this.Close_Till=CloseTIll;
		    cmp.SearchBox.clear();
		    Thread.sleep(2000);
		    cmp.Search(CloseTIll);
		    
		    driver.findElement(By.xpath("//span[.=' "+CloseTIll+" ']/../..//button[@aria-label='Close']")).click();
		    
		    if(cmp.Alert_Popup.getText().equalsIgnoreCase("Are you sure you want to close!"))
		    {
		    	test.log(LogStatus.PASS, "Are you sure you want to close!");
		    }
	}
	@Given("I Click the No button in Pop Up")
	public void iClickTheNoButtonInPopUp() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    cmp.No_Btn.click();
	}
	@Then("Verify the Cancelled Till Closed or Not")
	public void verifyTheCancelledTillClosedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Till Closed Successfully"))
		{
			test.log(LogStatus.FAIL, "Till Closed when clicking No button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Till Not Closed when Clicking No button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify Bank Deposit Updated or Not")
	public void verifyBankDepositUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.VerifySaveConfirmationAlertMessage("Cash Flow Updated");
	}
	@Then("I Verifying the Denomination Deleted or Not")
	public void iVerifyingTheDenominationDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.VerifySaveConfirmationAlertMessage("Denomination Deleted");
	}
	@Then("Verify the Till Closed or Not")
	public void verifyTheTillClosedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.VerifySaveConfirmationAlertMessage("Till Closed");
	}

}
