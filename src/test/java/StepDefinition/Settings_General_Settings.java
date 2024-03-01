package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.GeneralSetting_page;
import com.Pages.LoginPage;
import com.Pages.SaleRecapReport_SettingsPage;
import com.Pages.Settings_GeneralSetting_page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_General_Settings {

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	GeneralSetting_page gs=new GeneralSetting_page();
	
	@Given("Open the Settings - General Settings home page BaseURL and storeID")
	public void openTheSettingsGeneralSettingsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//load the Notifications page
//		Thread.sleep(2000);
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"generalSettings");
	}
	@Given("Verifying the Settings - General Settings Header Page")
	public void verifyingTheSettingsGeneralSettingsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//verify General settings page loaded or not
				Thread.sleep(3000);
				cmp.VerifyMainScreenPageHeader("General Settings");
	}
	
	@Given("Check Prompt Tip Screen Before Credit Card Screen in POS Toggle is Displayed")
	public void checkPromptTipScreenBeforeCreditCardScreenInPOSToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Prompt_TipScreen_Bef_CC_YesToggle, "Prompt Tip Screen Before Credit Card Screen in POS Toggle");
	}
	@Given("Check Enable Intranet Sync Toggle is Displayed")
	public void checkEnableIntranetSyncToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Intranet_Sync_YesToggle, "Enable Intranet Sync Toggle");

	}
	@Given("Check Preferred Network Name Field is Displayed")
	public void checkPreferredNetworkNameFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Prferred_Network_Name_InputBx, "Preferred Network Name Toggle");

	}
	@Given("Check Disable Gift Card Tip Toggle is Displayed")
	public void checkDisableGiftCardTipToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Disable_GiftCard_Tip_YesToggle, "Disable Gift Card Toggle");
	}
	@Given("Check Enable Gratuity Line in Credit Card Screen Toggle is Displayed")
	public void checkEnableGratuityLineInCreditCardScreenToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Enable_Gratuity_Line_YesToggle, "Enable Gratuity Line Toggle");

	}
	@Given("Check Disable Customer Nationality Toggle is Displayed")
	public void checkDisableCustomerNationalityToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Disable_Customer_Nationality_YesToggle, "Disable Customer Nationality Toggle");

	}
	@Given("Check Require Tax ID on Exempt Transaction Toggle is Displayed")
	public void checkRequireTaxIDOnExemptTransactionToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Require_TaxExempt_ID_YesToggle, "Require Tax ID on Exempt Transaction Toggle");

	}
	@Given("Check Do Not Reset Check Numbers Daily Toggle is Displayed")
	public void checkDoNotResetCheckNumbersDailyToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Do_Not_Reset_CheckNumber_YesToggle, "Do Not Reset Check Numbers Daily Toggle");
	}
	@Given("Check Auto Log Off Field is Displayed")
	public void checkAutoLogOffFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.AutoLogOff_TimeDown, "Do Not Reset Check Numbers Daily Toggle");
	}
	@Given("Check Table Expiration Time Field is Displayed")
	public void checkTableExpirationTimeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Table_Expiration_InputBx, "Table Expiration Time Field");

	}
	@Given("Check Custom Split button Action Option as Split By Check is Displayed")
	public void checkCustomSplitButtonActionOptionAsSplitByCheckIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.CustomSplit_Split_by_Check, "Custom Split button Action Option as Split By Check Field");

	}
	@Given("Check Custom Split button Action Option as Split By Seat is Displayed")
	public void checkCustomSplitButtonActionOptionAsSplitBySeatIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.CustomSplit_Split_by_Seat, "Custom Split button Action Option as Split By Seat Field");
	}
	@Given("Check Auto Generate House Account Number Toggle is Displayed")
	public void checkAutoGenerateHouseAccountNumberToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Auto_Generate_HouseAccount_Number_YesToggle, "Auto Generate House Account Number Toggle");

	}
	@Given("Check Auto Print Close Day Report Toggle is Displayed")
	public void checkAutoPrintCloseDayReportToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Auto_Close_DayReport_YesToggle, "Auto Print Close Day Report Toggle");
	}
	@Given("Check Log In\\/Clock In Via Option as PIN is Displayed")
	public void checkLogInClockInViaOptionAsPINIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.ClockIn_Pin, "Log IN/Clock IN Via PIN Option");
	}
	@Given("Check Log In\\/Clock In Via Option as Face ID is Displayed")
	public void checkLogInClockInViaOptionAsFaceIDIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.ClockIn_Pin, "Log IN/Clock IN Via Face ID Option");
	}
	@Given("Check Check Owner Option as Check Closer")
	public void checkCheckOwnerOptionAsCheckCloser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(gs.Check_Closer_CheckOwner, "Check Owner as Check Closer Option");
	}
	@Given("Check Check Owner Option as Check Creator")
	public void checkCheckOwnerOptionAsCheckCreator() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(gs.Check_Creator_CheckOwner, "Check Owner as Check Creator Option");
	}
	@Given("Check Tip Settings Option as Amount is Displayed")
	public void checkTipSettingsOptionAsAmountIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(gs.Tip_Settings_Amount_Option, "Tip Settings Option as Amount Option");
	}
	@Given("Check Tip Settings Option as Percentage is Displayed")
	public void checkTipSettingsOptionAsPercentageIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(gs.Tip_Settings_Percentage_Option, "Tip Settings Option as Percentage Option");
	}
	@Given("Check Tip Validation Toggle is Displayed")
	public void checkTipValidationToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Tip_Validation_YesToggle, "Tip Validation Toggle");

	}
	@Given("Check Floating Tab Name Field is Displayed")
	public void checkFloatingTabNameFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Floating_Tab_Name_InputBx, "Floating Tab Field");

	}
	@Given("Check POS Custom button Field is Displayed")
	public void checkPOSCustomButtonFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.POS_Custom_Button_Sel1, "POS Custom Button Field");

	}
	@Given("Check Hide Seat Number in Kitchen Print Field is Displayed")
	public void checkHideSeatNumberInKitchenPrintFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.QSR_Hide_Seat_NumberKitchenPrint, "Hide Seat Number in Kitchen Print Field");
	}
	@Given("Check Membership Auto Renewal Toggle is Displayed")
	public void checkMembershipAutoRenewalToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Membership_Auto_Renewal_YesToggle, "Membership Auto Renewal Toggle");
	}
	@Given("Check Store Level Customer Toggle is Displayed")
	public void checkStoreLevelCustomerToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Store_Level_Customer_YesToggle, "Store Level Customer Toggle");
	}
	@Given("Check Time Format Options is Displayed")
	public void checkTimeFormatOptionsIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.TimeFormat_12hours, "Time Format Options");

	}
	@Given("Check Date Format Options is Displayed")
	public void checkDateFormatOptionsIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.DateFormat_Default, "Date Format Options");
	}
	@Given("Check Tip Suggestion on Credit Card Receipt Toggle is Displayed")
	public void checkTipSuggestionOnCreditCardReceiptToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Tip_Suggestion_CC_Receipt_YesToggle, "Tip Suggestion on Credit Card Receipt Toggle");
	}
	@Given("Check Enable Doordash Drive Toggle is Displayed")
	public void checkEnableDoordashDriveToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Enable_Doordash_Drive_YesToggle, "Enable Doordash Drive Toggle");
	}
	@Given("Check Enable Age Restriction Toggle is Displayed")
	public void checkEnableAgeRestrictionToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(gs.Enable_Age_Restriction_YesToggle, "Enable Age Restriction Toggle");
	}
	@Given("I Enable Prompt Tip Screen Before Credit Card Screen in POS Toggle")
	public void iEnablePromptTipScreenBeforeCreditCardScreenInPOSToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		gs.Prompt_TipScreen_Bef_CC_YesToggle.click();
	}

	
	@Given("I Disable Prompt Tip Screen Before Credit Card Screen in POS Toggle")
	public void iDisablePromptTipScreenBeforeCreditCardScreenInPOSToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Prompt_TipScreen_Bef_CC_NoToggle.click();
	}
	@Given("I Enable Enable Intranet Sync Toggle")
	public void iEnableEnableIntranetSyncToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	   gs.Intranet_Sync_YesToggle.click();
	}
	@Then("Check Do you have intranet sync device Confirmation Pop up is Displayed")
	public void checkDoYouHaveIntranetSyncDeviceConfirmationPopUpIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    	if(cmp.Alert_Popup.getText().equalsIgnoreCase("Do you have intranet sync device?"))
	    	{
	    		test.log(LogStatus.PASS, "Do you have intranet sync device? Pop Up Displayed");
	    		
	    		ut.PassedCaptureScreenshotAsBASE64();
	    	}
	    	else
	    	{
	    		test.log(LogStatus.FAIL, "Do you have intranet sync device? Pop Up Not Displayed");
	    		
	    		ut.FailedCaptureScreenshotAsBASE64();
	    	}
	    	
	}
	@Then("I Click the Yes button in Pop Up")
	public void iClickTheYesButtonInPopUp() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Click_Yes_Button();
	}
	@Then("I Disable Enable Intranet Sync Toggle")
	public void iDisableEnableIntranetSyncToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Intranet_Sync_NoToggle.click();
	}
	@Then("Verify Application Settings Updated or Not")
	public void verifyApplicationSettingsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.VerifySaveConfirmationAlertMessage("Application Settings Updated");
	}
	@Then("Check Prompt Tip Screen Before Credit Card Screen in POS Toggle is Disabled")
	public void checkPromptTipScreenBeforeCreditCardScreenInPOSToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//cmp.Cursor_MoveToElement(gs.Prompt_TipScreen_Bef_CC_YesToggle);
	    cmp.Check_Toggle_Disabled(gs.Prompt_TipScreen_Bef_CC_YesToggle, "Prompt Tip Screen Before Credit Card Screen in POS");
	}
	@Then("Check Enable Intranet Sync Toggle is Disabled")
	public void checkEnableIntranetSyncToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(gs.Intranet_Sync_YesToggle, "Enable Intranet Sync");
	}
	@Then("I Enable Disable Gift Card Tip Toggle")
	public void iEnableDisableGiftCardTipToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Disable_GiftCard_Tip_YesToggle);
		Thread.sleep(1000);
	    gs.Disable_GiftCard_Tip_YesToggle.click();
	}
	@Then("I Disable Disable Gift Card Tip Toggle")
	public void iDisableDisableGiftCardTipToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Disable_GiftCard_Tip_NoToggle.click();
	}
	@Then("I Disable Enable Gratuity Line in Credit Card Screen Toggle")
	public void iDisableEnableGratuityLineInCreditCardScreenToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Enable_Gratuity_Line_NoToggle.click();
	}
	@Then("I Disable Disable Customer Nationality Toggle")
	public void iDisableDisableCustomerNationalityToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Disable_Customer_Nationality_NoToggle.click();
	}
	@Then("I Disable Require Tax ID on Exempt Transaction Toggle")
	public void iDisableRequireTaxIDOnExemptTransactionToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Require_TaxExempt_ID_NoToggle.click();
	}
	@Then("I Disable Do Not Reset Check Number Daily Toggle")
	public void iDisableDoNotResetCheckNumberDailyToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Do_Not_Reset_CheckNumber_NoToggle.click();
	}
	@Given("I Enter the Auto Log Off Time Less than Minimum Limits")
	public void iEnterTheAutoLogOffTimeLessThanMinimumLimits() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Auto_LogOff_InputBx);
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Auto_LogOff_InputBx, "2", "Auto Log Off Time Entered less than 5");
	}
	@Then("Check Enter Valid Value Error is Displayed")
	public void checkEnterValidValueErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Displayed(gs.Enter_Valid_Value_ErrorMsg, "Enter Valid Value Error");
	}
	@Given("I Enter the Auto Log Off Time Above than Maximum Limits")
	public void iEnterTheAutoLogOffTimeAboveThanMaximumLimits() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Auto_LogOff_InputBx, "3610", "Auto Log Off Time Entered Above 3600");
	}
	@Then("I Enter the Auto Log Off Time")
	public void iEnterTheAutoLogOffTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Auto_LogOff_InputBx, "2000", "Auto Log Off Time Entered");

	}
	@Then("Check Auto Log Off Time is Correctly Displayed")
	public void checkAutoLogOffTimeIsCorrectlyDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Auto_LogOff_InputBx);
		Thread.sleep(1000);
	    String AutoLogOFF=gs.Auto_LogOff_InputBx.getAttribute("value");//.replace(",", "");
	    
	    cmp.Assertion_Validation_Two_Values(AutoLogOFF, "2,000", "Auto Log Off is Correct");
	}
	@Given("I Clear the Table Expiration Time")
	public void iClearTheTableExpirationTime() throws Exception {
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Table_Expiration_InputBx);
	    gs.Table_Expiration_InputBx.clear();
	}
	@Then("Check Invalid Expiration Time Error is Displayed")
	public void checkInvalidExpirationTimeErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		 cmp.Check_Element_or_Text_Displayed(gs.Invalid_Expiration_Time_ErrorMsg, "Invalid Expiration Time Error");
	}
	@Then("I Enter the Table Expiration Time")
	public void iEnterTheTableExpirationTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Table_Expiration_InputBx, "20", "Table Expiration Time Entered");

	}
	@Then("Check Table Expiration Time is Correctly Displayed")
	public void checkTableExpirationTimeIsCorrectlyDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Table_Expiration_InputBx);
		Thread.sleep(1000);
		   String TableExpire=gs.Table_Expiration_InputBx.getAttribute("value");
		    
		    cmp.Assertion_Validation_Two_Values(TableExpire, "20", "Table Expiration Time is Correct");
	}
	@Then("Check Disable Gift Card Tip Toggle is Disabled")
	public void checkDisableGiftCardTipToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Disable_GiftCard_Tip_YesToggle);
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Disable_GiftCard_Tip_YesToggle, "Diable Gift Card Tip");

	}
	@Then("Check Enable Gratuity Line in Credit Card Screen Toggle is Disabled")
	public void checkEnableGratuityLineInCreditCardScreenToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Enable_Gratuity_Line_YesToggle, "Enable Gratuity Line in Credit Card Screen");

	}
	@Then("Check Disable Customer Nationality Toggle is Disabled")
	public void checkDisableCustomerNationalityToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Disable_Customer_Nationality_YesToggle, "Disable Customer Nationality");
	}
	@Then("Check Require Tax ID on Exempt Transaction Toggle is Disabled")
	public void checkRequireTaxIDOnExemptTransactionToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Require_TaxExempt_ID_YesToggle, "Require Tax ID on Exempt Transaction");
	}
	@Then("Check Do Not Reset Check Numbers Daily is Disabled")
	public void checkDoNotResetCheckNumbersDailyIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Do_Not_Reset_CheckNumber_YesToggle, "Do Not Reset Check Numbers Daily");
	}
	@Then("I Select Custom Split button Action as Split By Check")
	public void iSelectCustomSplitButtonActionAsSplitByCheck() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.CustomSplit_Split_by_Check);
		Thread.sleep(1000);
	    if(gs.CustomSplit_Split_by_Check.isSelected())
	    {
	    	
	    }
	    else
	    {
	    	gs.CustomSplit_Split_by_Check.click();
	    }
	}
	@Then("I Enable Auto Generate House Account Number Toggle")
	public void iEnableAutoGenerateHouseAccountNumberToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(1000);
	    gs.Auto_Generate_HouseAccount_Number_YesToggle.click();
	}
	@Then("I Disable Auto Generate House Account Number Toggle")
	public void iDisableAutoGenerateHouseAccountNumberToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	   gs.Auto_Generate_HouseAccount_Number_NoToggle.click();
	}
	@Then("I Disable Auto Print Close Day Report Toggle")
	public void iDisableAutoPrintCloseDayReportToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Auto_Close_DayReport_NoToggle.click();
	}
	@Then("I Select Log In\\/Clock In Via as PIN")
	public void iSelectLogInClockInViaAsPIN() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.ClockIn_Pin);
		Thread.sleep(1000);
	    if(gs.ClockIn_Pin.isSelected())
	    {
	    	
	    }
	    else
	    {
	    	gs.ClockIn_Pin.click();
	    }
	}
	@Then("Check Custom Split button Action Selected as Split By Check")
	public void checkCustomSplitButtonActionSelectedAsSplitByCheck() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.CustomSplit_Split_by_Check);
		Thread.sleep(1000);
	    cmp.Assertion_Validation_True_Element_Selected(gs.CustomSplit_Split_by_Check);
	}
	@Then("Check Auto Generate House Account Number Toggle is Disabled")
	public void checkAutoGenerateHouseAccountNumberToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Auto_Generate_HouseAccount_Number_YesToggle);
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Auto_Generate_HouseAccount_Number_YesToggle, "Auto Generate House Account Number");
	}
	@Then("Check Auto Print Close Day Report Toggle is Disabled")
	public void checkAutoPrintCloseDayReportToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Auto_Close_DayReport_YesToggle, "Auto Print Close Day Report");
	}
	@Then("Check Log In\\/Clock In Via Selected as PIN")
	public void checkLogInClockInViaSelectedAsPIN() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.ClockIn_Pin);
		Thread.sleep(1000);
	    cmp.Assertion_Validation_True_Element_Selected(gs.ClockIn_Pin);
	}
	@Then("I Select Check Owner as Check Closer")
	public void iSelectCheckOwnerAsCheckCloser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Check_Closer_CheckOwner.click();
	}
	@Then("I Select Tip Settings as Amount")
	public void iSelectTipSettingsAsAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Settings_Amount_Option);
		Thread.sleep(1000);
	    gs.Tip_Settings_Amount_Option.click();
	}
	@Then("I Enter the Tip Suggestions for Amount Above Limit")
	public void iEnterTheTipSuggestionsForAmountAboveLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    List<WebElement> rowList=driver.findElements(By.xpath("//input[@aria-label='Percentage']"));
//	    
//	    for(int i=1;i<=rowList.size();i++)
//	    {
//	    	driver.findElement(By.xpath("(//input[@aria-label='Percentage'])["+i+"]")).sendKeys("1"+i);
//	    }
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@aria-label='Amount'])[1]")).sendKeys("9999999999999999");
	    
	}
	@Then("Check Amount cannot exist more than Ten digits Error is Displayed")
	public void checkAmountCannotExistMoreThanTenDigitsErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Displayed(gs.Maximum_Tip_Amount_10Digit_ErrorMsg, "Maximum tip percentage is 100 Error");
	}
	@Then("I Enter the Tip Suggestions for Amount")
	public void iEnterTheTipSuggestionsForAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    List<WebElement> rowList=driver.findElements(By.xpath("//input[@aria-label='Amount']"));
	    
	    for(int i=1;i<=rowList.size();i++)
	    {
	    	driver.findElement(By.xpath("(//input[@aria-label='Amount'])["+i+"]")).sendKeys("1"+i);
	    }
	}
	@Then("I Enable Tip Validation Toggle")
	public void iEnableTipValidationToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Tip_Validation_YesToggle.click();
	}
	@Then("I Enter Tip Threshold Amount as Zero")
	public void iEnterTipThresholdAmountAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Threshold_Amount_InputBx);
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Tip_Threshold_Amount_InputBx, "0", "Entered Tip Threshold Amount as Zero");
	}
	@Then("Check Value should be greater than Zero Error is Displayed")
	public void checkValueShouldBeGreaterThanZeroErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Displayed(gs.Value_Should_GreaterThen_ZeroErrorMsg, "Value should be greater than Zero Error");
	}
	@Then("I Enter Tip Threshold Amount")
	public void iEnterTipThresholdAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Tip_Threshold_Amount_InputBx, "2500", "Entered Tip Threshold Amount");

	}
	@Then("I Enter Tip Threshold Percentage as Zero")
	public void iEnterTipThresholdPercentageAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Threshold_Percentage_InputBx);
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Tip_Threshold_Percentage_InputBx, "0", "Entered Tip Threshold Percentage as Zero");

	}
	@Then("I Enter Tip Threshold Percentage")
	public void iEnterTipThresholdPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Tip_Threshold_Percentage_InputBx, "4500", "Entered Tip Threshold Percentage");

	}
	@Then("I Clear the Tip validation Alert Message")
	public void iClearTheTipValidationAlertMessage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//cmp.Cursor_MoveToElement(gs.Tip_Validation_AlertTextBx);
//	    cmp.Enter_Text(gs.Tip_Threshold_Amount_InputBx, "0", "Entered Tip Threshold Amount as Zero");
		gs.Tip_Validation_AlertTextBx.clear();

	}
	@Then("Check Please Enter the Alert Message Error is Displayed")
	public void checkPleaseEnterTheAlertMessageErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Displayed(gs.Please_Enter_Alert_Message_ErrorMsg, "Please Enter the Alert Message Error");

//Please confirm if you wish to proceed with current tip amount
	}
	@Then("I Enter Tip Validation Alert Message")
	public void iEnterTipValidationAlertMessage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Tip_Validation_AlertTextBx, "Please confirm if you wish to proceed with current tip amount", "Entered Alert Message");
	}
	@Then("Check Check Owner Selected as Check Closer")
	public void checkCheckOwnerSelectedAsCheckCloser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    if(gs.Check_Closer_CheckOwner.isSelected())
		//cmp.Cursor_MoveToElement(gs.Check_Closer_CheckOwner);
		Thread.sleep(1000);
		cmp.Assertion_Validation_True_Element_Selected(gs.Check_Closer_CheckOwner);
	}
	@Then("Check Tip Settings Selected as Amount")
	public void checkTipSettingsSelectedAsAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Settings_Amount_Option);
		Thread.sleep(1000);
		cmp.Assertion_Validation_True_Element_Selected(gs.Tip_Settings_Amount_Option);
	}
	@Then("Check Tip Validation Toggle is Enabled")
	public void checkTipValidationToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Validation_YesToggle);
		Thread.sleep(1000);
	   cmp.Check_Toggle_Enabled(gs.Tip_Validation_YesToggle, "Tip Validation Toggle");
	}
	@Then("Check Tip Threshold Amount is Correctly Displayed")
	public void checkTipThresholdAmountIsCorrectlyDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		  String TipAmt=gs.Tip_Threshold_Amount_InputBx.getAttribute("value");
		    
		    cmp.Assertion_Validation_Two_Values(TipAmt, "25.00", "Tip Threshold Amount is Correct");
	}
	@Then("Check Tip Threshold Percentage is Correctly Displayed")
	public void checkTipThresholdPercentageIsCorrectlyDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		  String TipAmt=gs.Tip_Threshold_Percentage_InputBx.getAttribute("value");
		    
		    cmp.Assertion_Validation_Two_Values(TipAmt, "45.00%", "Tip Threshold Percentage is Correct");
	}
	@Then("Check Tip Validation Alert Message is Correctly Displayed")
	public void checkTipValidationAlertMessageIsCorrectlyDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Validation_AlertTextBx);
		Thread.sleep(1000);
		  String TipAmt=gs.Tip_Validation_AlertTextBx.getAttribute("value");
		    
		    cmp.Assertion_Validation_Two_Values(TipAmt, "Please confirm if you wish to proceed with current tip amount", "Alert Message is Correct");
	}
	@Then("I Enter Floating Tab Name")
	public void iEnterFloatingTabName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Floating_Tab_Name_InputBx, "BarTab", "Entered Floating Tab Name");
	}
	@Then("I Select Duplicate Options for POS Custom buttons")
	public void iSelectDuplicateOptionsForPOSCustomButtons() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.POS_Custom_Button_Sel1);
		Thread.sleep(1000);
	    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel1, "Void", "Void Selected as POS Custom Button First Option");
	
	    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel2, "Void", "Void Selected as POS Custom Button Second Option");

	}
	@Then("Check POS Custom button Must be Unique Error is Displayed")
	public void checkPOSCustomButtonMustBeUniqueErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Displayed(gs.POS_Custom_Button_Must_Unique_ErrorMsg, "POS Custom button Must be Unique Error");

	}
	@Then("I Select Options for POS Custom buttons")
	public void iSelectOptionsForPOSCustomButtons() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel1, "Void", "Void Selected as POS Custom Button 1st Option");
		
	    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel2, "Print", "Print Selected as POS Custom Button 2nd Option");

	    
	    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel3, "Discount", "Discount Selected as POS Custom Button 3rd Option");
		
	    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel4, "Order", "Order Selected as POS Custom Button 4th Option");

	    
	    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel5, "Cash", "Cash Selected as POS Custom Button 4th Option");
		
	    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel6, "Modify", "Modify Selected as POS Custom Button 6th Option");

	}
	@Then("I Select Hide Seat Number in Kitchen Print")
	public void iSelectHideSeatNumberInKitchenPrint() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		//cmp.Cursor_MoveToElement(gs.QSR_Hide_Seat_NumberKitchenPrint);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		if(gs.ToGo_Hide_Seat_NumberKitchenPrint.isEnabled())
		{
	    
		}
		else
		{
			gs.ToGo_Hide_Seat_NumberKitchenPrint.click();
		}
	}
	@Then("I Disable Membership Auto Renewal Toggle")
	public void iDisableMembershipAutoRenewalToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Membership_Auto_Renewal_NoToggle.click();
	}
	@Then("I Disable Store Level Customer Toggle")
	public void iDisableStoreLevelCustomerToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	   gs.Store_Level_Customer_NoToggle.click();
	}
	@Then("Check POS Custom buttons Selected Option1")
	public void checkPOSCustomButtonsSelectedOption1() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.POS_Custom_Button_Sel1);
		Thread.sleep(1000);
		String POS_Option1=gs.POS_Custom_Button_Sel1.getAttribute("value");
		cmp.Assertion_Validation_Two_Values(POS_Option1, "Void", "POS Custom Button 1 is displayed as Expected");

		
	}
	@Then("Check POS Custom buttons Selected Option2")
	public void checkPOSCustomButtonsSelectedOption2() throws Exception {
		Thread.sleep(1000);
		String POS_Option2=gs.POS_Custom_Button_Sel2.getAttribute("value");
		
		cmp.Assertion_Validation_Two_Values(POS_Option2, "Print", "POS Custom Button 2 is displayed as Expected");

	}
	@Then("Check POS Custom buttons Selected Option3")
	public void checkPOSCustomButtonsSelectedOption3() throws Exception {
		Thread.sleep(1000);
		String POS_Option3=gs.POS_Custom_Button_Sel3.getAttribute("value");
		
		cmp.Assertion_Validation_Two_Values(POS_Option3, "Discount", "POS Custom Button 3 is displayed as Expected");

		
		
	}
	@Then("Check POS Custom buttons Selected Option4")
	public void checkPOSCustomButtonsSelectedOption4() throws Exception {
		Thread.sleep(1000);
		String POS_Option4=gs.POS_Custom_Button_Sel4.getAttribute("value");
		
		cmp.Assertion_Validation_Two_Values(POS_Option4, "Order", "POS Custom Button 4 is displayed as Expected");

	}
	@Then("Check POS Custom buttons Selected Option5")
	public void checkPOSCustomButtonsSelectedOption5() throws Exception {
		Thread.sleep(1000);
		String POS_Option5=gs.POS_Custom_Button_Sel5.getAttribute("value");
		
		cmp.Assertion_Validation_Two_Values(POS_Option5, "Cash", "POS Custom Button 5 is displayed as Expected");

	}
	@Then("Check POS Custom buttons Selected Option6")
	public void checkPOSCustomButtonsSelectedOption6() throws Exception {
		Thread.sleep(1000);
		String POS_Option6=gs.POS_Custom_Button_Sel6.getAttribute("value");
		
		   
//		    cmp.Click_DropDown_withSearchText(gs.POS_Custom_Button_Sel6, "Modify", "Modify Selected as POS Custom Button 6th Option");
		cmp.Assertion_Validation_Two_Values(POS_Option6, "Modify", "POS Custom Button 6 is displayed as Expected");
	}
	@Then("Check Membership Auto Renewal Toggle is Disabled")
	public void checkMembershipAutoRenewalToggleIsDisabled() throws Exception {
		//cmp.Cursor_MoveToElement(gs.Membership_Auto_Renewal_YesToggle);
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(gs.Membership_Auto_Renewal_YesToggle, "Membership Auto Renewal");
	}
	@Then("Check Store Level Customer Toggle is Disabled")
	public void checkStoreLevelCustomerToggleIsDisabled() throws Exception {
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(gs.Store_Level_Customer_YesToggle, "Store Level Customer");
	}
	@Then("I Select Time Format as Twenty Four Hours")
	public void iSelectTimeFormatAsTwentyFourHours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.TimeFormat_24hours);
		Thread.sleep(1000);
	    gs.TimeFormat_24hours.click();
	}
	@Then("I Select Date Format as MM-DD-YYYY")
	public void iSelectDateFormatAsMMDDYYYY() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.DateFormat_Default);
		Thread.sleep(1000);
	    gs.DateFormat_MM_DD_YYYY.click();
	}
	@Then("Check Time Format Selected Twenty Four Hours")
	public void checkTimeFormatSelectedTwentyFourHours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.TimeFormat_24hours);
		Thread.sleep(1000);
	    cmp.Assertion_Validation_True_Element_Selected(gs.TimeFormat_24hours);
	}
	@Then("Check Date Format Selected MM-DD-YYYY")
	public void checkDateFormatSelectedMMDDYYYY() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.DateFormat_Default);
		Thread.sleep(1000);
		cmp.Assertion_Validation_True_Element_Selected(gs.DateFormat_MM_DD_YYYY);
	}
	@Then("I Enable Tip Suggestion on Credit Card Receipt Toggle")
	public void iEnableTipSuggestionOnCreditCardReceiptToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		cmp.Assertion_Validation_True_Element_Selected(gs.tip);
		Thread.sleep(1000);
		gs.Tip_Suggestion_CC_Receipt_YesToggle.click();
	}
	@Then("I Disable Tip Suggestion on Credit Card Receipt Toggle")
	public void iDisableTipSuggestionOnCreditCardReceiptToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Tip_Suggestion_CC_Receipt_NoToggle.click();
	}
	@Then("I Disable Enable Doordash Drive Toggle")
	public void iDisableEnableDoordashDriveToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Enable_Doordash_Drive_NoToggle.click();
	}
	@Then("Check Tip Suggestion on Credit Card Receipt Toggle is Disabled")
	public void checkTipSuggestionOnCreditCardReceiptToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Tip_Suggestion_CC_Receipt_NoToggle, "Tip Suggestion on Credit Card Receipt");
	}
	@Then("Check Enable Doordash Drive is Disabled")
	public void checkEnableDoordashDriveIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Enable_Doordash_Drive_NoToggle, "Enable Doordash Drive");
	}
	@Then("Check Enter Preferred Network Error is Displayed")
	public void checkEnterPreferredNetworkErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Prferred_Network_Name_InputBx);
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Displayed(gs.Enter_Preferred_Network_ErrorMsg, "Enter Preferred Network Error");
	}
	@Then("I Enter Preferred Network Name")
	public void iEnterPreferredNetworkName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Prferred_Network_Name_InputBx, "Linga", "Entered Preferred Network Name");
	}
	@Then("Check Prompt Tip Screen Before Credit Card Screen in POS Toggle is Enabled")
	public void checkPromptTipScreenBeforeCreditCardScreenInPOSToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Prompt_TipScreen_Bef_CC_YesToggle);
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Prompt_TipScreen_Bef_CC_YesToggle, "Prompt Tip Screen Before Credit Card Screen in POS");
	}
	@Then("Check Enable Intranet Sync Toggle is Enabled")
	public void checkEnableIntranetSyncToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Intranet_Sync_YesToggle, "Enable Intranet Sync");
	}
	@Then("I Enable Enable Gratuity Line in Credit Card Screen Toggle")
	public void iEnableEnableGratuityLineInCreditCardScreenToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Enable_Gratuity_Line_YesToggle.click();
	}
	@Then("I Enable Disable Customer Nationality Toggle")
	public void iEnableDisableCustomerNationalityToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		//cmp.Cursor_MoveToElement(gs.Prompt_TipScreen_Bef_CC_YesToggle);
		Thread.sleep(1000);
	    gs.Disable_Customer_Nationality_YesToggle.click();
	}
	@Then("I Enable Require Tax ID on Exempt Transaction Toggle")
	public void iEnableRequireTaxIDOnExemptTransactionToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Require_TaxExempt_ID_YesToggle.click();
	}
	@Then("I Enable Do Not Reset Check Numbers Daily Toggle")
	public void iEnableDoNotResetCheckNumbersDailyToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Do_Not_Reset_CheckNumber_YesToggle.click();
	}
	@Then("Check Disable Gift Card Tip Toggle is Enabled")
	public void checkDisableGiftCardTipToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Disable_GiftCard_Tip_YesToggle);
		Thread.sleep(1000);
		 cmp.Check_Toggle_Enabled(gs.Disable_GiftCard_Tip_YesToggle, "Disable Gift Card Tip");
	}
	@Then("Check Enable Gratuity Line in Credit Card Screen Toggle is Enabled")
	public void checkEnableGratuityLineInCreditCardScreenToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		 cmp.Check_Toggle_Enabled(gs.Enable_Gratuity_Line_YesToggle, "Enable Gratuity Line in Credit Card Screen");
	}
	@Then("Check Disable Customer Nationality Toggle is Enabled")
	public void checkDisableCustomerNationalityToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		 cmp.Check_Toggle_Enabled(gs.Disable_Customer_Nationality_YesToggle, "Disable Customer Nationality");
	}
	@Then("Check Require Tax ID on Exempt Transaction Toggle is Enabled")
	public void checkRequireTaxIDOnExemptTransactionToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		 cmp.Check_Toggle_Enabled(gs.Require_TaxExempt_ID_YesToggle, "Require Tax ID on Exempt Transaction");
	}
	@Then("Check Minimum Age Limit Field is Displayed")
	public void checkMinimumAgeLimitFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Enable_Age_Restriction_YesToggle);
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Displayed(gs.Minimum_Age_Limit_InputBx, "Minimum Age Limit Field");
	}
	@Then("I Enter Minimum Age Limit as Zero")
	public void iEnterMinimumAgeLimitAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Minimum_Age_Limit_InputBx, "0","Entered Minimum Age Limit as Zero");
	}
	@Then("Check Please Enter Age Error is Displayed")
	public void checkPleaseEnterAgeErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		 cmp.Check_Element_or_Text_Displayed(gs.Please_Enter_Age_Message_ErrorMsg, "Please Enter Age Error");
	}
	@Then("I Enter Minimum Age Limit")
	public void iEnterMinimumAgeLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		   cmp.Enter_Text(gs.Minimum_Age_Limit_InputBx, "10","Entered Minimum Age Limit");
	}
	@Then("I Clear the Age Alert Message")
	public void iClearTheAgeAlertMessage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Age_Alert_Message_TextBx.clear();
	}
	@Then("I Enter the Age Alert Message")
	public void iEnterTheAgeAlertMessage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Enter_Text(gs.Age_Alert_Message_TextBx, "The DOB condition is not met, the item will be deleted from the cart.", "Entered the Age Alert Message");
	}
	@Then("Check Do Not Reset Check Numbers Daily is Enabled")
	public void checkDoNotResetCheckNumbersDailyIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Do_Not_Reset_CheckNumber_YesToggle, "Do Not Reset Check Numbers Daily");
	}
	@Then("I Select Custom Split button Action as Split By Seat")
	public void iSelectCustomSplitButtonActionAsSplitBySeat() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.CustomSplit_Split_by_Seat);
		Thread.sleep(1000);
		if(gs.CustomSplit_Split_by_Seat.isSelected())
		{
			
		}
		else
		{
	    gs.CustomSplit_Split_by_Seat.click();
		}
	}
	@Then("I Enable Auto Print Close Day Report Toggle")
	public void iEnableAutoPrintCloseDayReportToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Auto_Close_DayReport_YesToggle.click();
	}
	@Then("I Select Log In\\/Clock In Via as Face ID")
	public void iSelectLogInClockInViaAsFaceID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.ClockIn_FaceID);
		Thread.sleep(1000);
		if(gs.ClockIn_FaceID.isSelected())
		{
			
		}
		else
		{
	    gs.ClockIn_FaceID.click();
		}
	}
	@Then("Check Custom Split button Action Selected as Split By Seat")
	public void checkCustomSplitButtonActionSelectedAsSplitBySeat() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.CustomSplit_Split_by_Seat);
		Thread.sleep(1000);
	    cmp.Assertion_Validation_True_Element_Selected(gs.CustomSplit_Split_by_Seat);
	}
	@Then("Check Auto Generate House Account Number Toggle is Enabled")
	public void checkAutoGenerateHouseAccountNumberToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Auto_Generate_HouseAccount_Number_YesToggle);
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Auto_Generate_HouseAccount_Number_YesToggle, "Auto Generate House Account Number");
	}
	@Then("Check Auto Print Close Day Report Toggle is Enabled")
	public void checkAutoPrintCloseDayReportToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Auto_Close_DayReport_YesToggle, "Auto Print Close Day Report");
	}
	@Then("Check Log In\\/Clock In Via Selected as Face ID")
	public void checkLogInClockInViaSelectedAsFaceID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.ClockIn_FaceID);
		Thread.sleep(1000);
		cmp.Assertion_Validation_True_Element_Selected(gs.ClockIn_FaceID);
	}
	@Then("I Select Check Owner as Check Creator")
	public void iSelectCheckOwnerAsCheckCreator() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Check_Creator_CheckOwner.click();
	}
	@Then("I Select Tip Settings as Percentage")
	public void iSelectTipSettingsAsPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Settings_Percentage_Option);
		Thread.sleep(1000);
	    gs.Tip_Settings_Percentage_Option.click();
	}
	
	@Then("I Enter the Tip Suggestions for Percentage Above Limit")
	public void iEnterTheTipSuggestionsForPercentageAboveLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@aria-label='Percentage'])[1]")).sendKeys("12000");
	}
	@Then("Check Maximum tip percentage is Hundred Error is Displayed")
	public void checkMaximumTipPercentageIsHundredErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		 cmp.Check_Element_or_Text_Displayed(gs.Maximum_Tip_Perc100_ErrorMsg, "Maximum tip percentage is 100 Error");

	}
	
	@Then("I Enter the Tip Suggestions for Percentage")
	public void iEnterTheTipSuggestionsForPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
List<WebElement> rowList=driver.findElements(By.xpath("//input[@aria-label='Percentage']"));
	    
	    for(int i=1;i<=rowList.size();i++)
	    {
	    	driver.findElement(By.xpath("(//input[@aria-label='Percentage'])["+i+"]")).sendKeys("1"+i);
	    }
	}

	@Then("I Disable Tip Validation Toggle")
	public void iDisableTipValidationToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Tip_Validation_NoToggle.click();
	}
	@Then("Check Tip Threshold Amount Field is Not Displayed")
	public void checkTipThresholdAmountFieldIsNotDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Settings_Percentage_Option);
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Not_Displayed(gs.Tip_Threshold_Amount_InputBx, "Tip Threshold Amount Field");
	}
	@Then("Check Tip Threshold Percentage Field is Not Displayed")
	public void checkTipThresholdPercentageFieldIsNotDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Element_or_Text_Not_Displayed(gs.Tip_Threshold_Percentage_InputBx, "Tip Threshold Percentage Field");
	}
	@Then("Check Check Owner Selected as Check Creator")
	public void checkCheckOwnerSelectedAsCheckCreator() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Check_Closer_CheckOwner);
		Thread.sleep(1000);
	    cmp.Assertion_Validation_True_Element_Selected(gs.Check_Creator_CheckOwner);
	}
	@Then("Check Tip Settings Selected as Percentage")
	public void checkTipSettingsSelectedAsPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Settings_Percentage_Option);
		Thread.sleep(1000);
	    cmp.Assertion_Validation_True_Element_Selected(gs.Tip_Settings_Percentage_Option);
	}
	@Then("Check Tip Validation Toggle is Disabled")
	public void checkTipValidationToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Validation_YesToggle);
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(gs.Tip_Validation_YesToggle, "Tip Validation");
	}
	@Then("I Enable Membership Auto Renewal Toggle")
	public void iEnableMembershipAutoRenewalToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Membership_Auto_Renewal_YesToggle);
		Thread.sleep(1000);
	    gs.Membership_Auto_Renewal_YesToggle.click();
	}
	@Then("I Enable Store Level Customer Toggle")
	public void iEnableStoreLevelCustomerToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Store_Level_Customer_YesToggle.click();
	}
	@Then("Check Membership Auto Renewal Toggle is Enabled")
	public void checkMembershipAutoRenewalToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Membership_Auto_Renewal_YesToggle);
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Membership_Auto_Renewal_YesToggle, "Membership Auto Renewal");
	}
	@Then("Check Store Level Customer Toggle is Enabled")
	public void checkStoreLevelCustomerToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Store_Level_Customer_YesToggle, "Store Level Customer");

	}
	@Then("I Select Time Format as Twele Hours")
	public void iSelectTimeFormatAsTweleHours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.TimeFormat_12hours);
		Thread.sleep(1000);
	    gs.TimeFormat_12hours.click();
	}
	@Then("I Select Date Format as DD-MM-YYYY")
	public void iSelectDateFormatAsDDMMYYYY() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.DateFormat_DD_MM_YYYY.click();
	}
	@Then("Check Time Format Selected Twele Hours")
	public void checkTimeFormatSelectedTweleHours() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.TimeFormat_12hours);
		Thread.sleep(1000);
	    cmp.Assertion_Validation_True_Element_Selected(gs.TimeFormat_12hours);
	}
	@Then("Check Date Format Selected DD-MM-YYYY")
	public void checkDateFormatSelectedDDMMYYYY() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.DateFormat_Default);
		Thread.sleep(1000);
		 cmp.Assertion_Validation_True_Element_Selected(gs.DateFormat_DD_MM_YYYY);
	}
	@Then("I Select Date Format as Default")
	public void iSelectDateFormatAsDefault() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.DateFormat_Default.click();
	}
	@Then("I Enable Enable Doordash Drive Toggle")
	public void iEnableEnableDoordashDriveToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    gs.Enable_Doordash_Drive_YesToggle.click();
	}
	@Then("Check Date Format Selected Default")
	public void checkDateFormatSelectedDefault() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.DateFormat_Default);
		Thread.sleep(1000);
		 cmp.Assertion_Validation_True_Element_Selected(gs.DateFormat_Default);
	}
	@Then("Check Tip Suggestion on Credit Card Receipt Toggle is Enabled")
	public void checkTipSuggestionOnCreditCardReceiptToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp.Cursor_MoveToElement(gs.Tip_Suggestion_CC_Receipt_YesToggle);
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Tip_Suggestion_CC_Receipt_YesToggle, "Tip Suggestion on Credit Card Receipt");

	}
	@Then("Check Enable Doordash Drive Toggle is Enabled")
	public void checkEnableDoordashDriveToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Enable_Doordash_Drive_YesToggle, "Enable Doordash Drive");
	}
	@Then("Check Enable Age Restriction Toggle is Enabled")
	public void checkEnableAgeRestrictionToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(gs.Enable_Age_Restriction_YesToggle, "Enable Age Restrictio");
	}
}
