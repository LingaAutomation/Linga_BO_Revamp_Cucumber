package StepDefinition;

import org.openqa.selenium.By;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Front_End_Receipt_TemplatePage;
import com.Pages.LoginPage;
import com.Pages.PaymentMethodsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Front_End_Receipt_Template 
{


	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Front_End_Receipt_TemplatePage fert=new Front_End_Receipt_TemplatePage();
	
	@Given("Open the Settings - Front End Receipt Settings home page BaseURL and storeID")
	public void openTheSettingsFrontEndReceiptSettingsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Front End Receipt Template page
		driver.get(Utility.getProperty("baseURL")+"settings/"+"frontEndReceipt");

	}
	@Given("Verifying the Settings - Front End Receipt Settings Header Page")
	public void verifyingTheSettingsFrontEndReceiptSettingsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
//		//Verify the Front End Receipt Template page loaded or not
//		if(fert.Front_EndReceipt_Header().isDisplayed())
//		{
//			test.log(LogStatus.PASS, "Front End Receipt Template Page Loaded Successfully");
//			
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
//		else
//		{
//			test.log(LogStatus.FAIL, "Front End Receipt Template Page Loading Failed");
//			
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
		cmp.VerifyMainScreenPageHeader("Front End Receipt");
	}
//	@Then("Check Print Template Screen Field is Displayed")
//	public void checkPrintTemplateScreenFieldIsDisplayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@Then("I Open Print Template Screen")
	public void iOpenPrintTemplateScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Open_Print_Template_Screen();
	}
	@Then("Check Font Size Field is Displayed")
	public void checkFontSizeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Medium_RadioBtn, "Font Size Radio buttons Field");
	}
	@Then("Check Choose Template Field is Displayed")
	public void checkChooseTemplateFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Choose_Template_InputBx, "Choose Template Field");

	}
	@Then("I Close Print Template Screen")
	public void iClosePrintTemplateScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Close_Print_Template_Screen();
	}
	@Then("I Open Store Info Screen")
	public void iOpenStoreInfoScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Open_Store_Info_Screen();
	}
	@Then("Check Store Logo Check Box is Displayed")
	public void checkStoreLogoCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Store_Logo_ChkBox, "Store Logo Check Box");

	}
	@Then("Check Store Name Check Box is Displayed")
	public void checkStoreNameCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Store_Name_ChkBox, "Store Name Check Box");

	}
	@Then("Check Store Address Check Box is Displayed")
	public void checkStoreAddressCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Address_StoreInfo_ChkBox, "Store Address Check Box");

	}
	@Then("Check Store Email Check Box is Displayed")
	public void checkStoreEmailCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Email_StoreInfo_ChkBox, "Store Email Check Box");

	}
	@Then("Check Store Phone Number Check Box is Displayed")
	public void checkStorePhoneNumberCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Phone_Number_StoreInfo_ChkBox, "Store Phone Number Check Box");

	}
	@Then("Check Header Notes Check Box is Displayed")
	public void checkHeaderNotesCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Header_Notes_ChkBox, "Header Notes Check Box");

	}
	@Then("I Close Store Info Screen")
	public void iCloseStoreInfoScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Close_Store_Info_Screen();
	}
	@Then("I Open Check Details Screen")
	public void iOpenCheckDetailsScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   fert.Open_Check_Details_Screen();
	}
	@Then("Check Check Number Check Box is Displayed")
	public void checkCheckNumberCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Check_Number_ChkBox, "Check Number Check Box");

	}
	@Then("Check Table Name Check Box is Displayed")
	public void checkTableNameCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Table_Name_ChkBox, "Table Name Check Box");

	}
	@Then("Check Seat Number Check Box is Displayed")
	public void checkSeatNumberCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Seat_Number_ChkBox, "Seat Number Check Box");

	}
	@Then("Check Check Open Server Check Box is Displayed")
	public void checkCheckOpenServerCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Check_Open_Server_ChkBox, "Check Open Server Check Box");

	}
	@Then("Check Check Close Server Check Box is Displayed")
	public void checkCheckCloseServerCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Check_Close_Server_ChkBox, "Check Close Server Check Box");

	}
	@Then("Check Open Date & Time Check Box is Displayed")
	public void checkOpenDateTimeCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Open_Date_Time_CheckBox(), "Open Date & Time Check Box");

	}
	@Then("Check Close Date & Time Check Box is Displayed")
	public void checkCloseDateTimeCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Close_Date_Time_ChkBox, "Close Date & TIme Check Box");

	}
	@Then("Check Service Type Check Box is Displayed")
	public void checkServiceTypeCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Service_Type_ChkBox, "Service Type Check Box");

	}
	@Then("I Close Check Details Screen")
	public void iCloseCheckDetailsScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Close_Check_Details_Screen();
	}
	@Then("I Open Order Summary Screen")
	public void iOpenOrderSummaryScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Open_Order_Summary_Screen();
	}
	@Then("Check Secondary Menu Name Check Box is Displayed")
	public void checkSecondaryMenuNameCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Secondary_MenuName_ChkBox, "Secondary Menu Name Check Box");

	}
	@Then("Check Roll Out Modifier Price To Menu Check Box is Displayed")
	public void checkRollOutModifierPriceToMenuCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.RollOut_ModifierPrice_To_Menu_CheckBox(), "Roll Out Modifier Price To Menu Check Box");

	}
	@Then("I Select Roll Out Modifier Price To Menu Check Box")
	public void iSelectRollOutModifierPriceToMenuCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
//		if(fert.RollOut_ModifierPrice_To_Menu_ChkBox.isSelected())
//		{
//			
//		}
//		else
//		{
//	    fert.RollOut_ModifierPrice_To_Menu_ChkBox.click();
//		}
		
		cmp.Select_CheckBox(fert.RollOut_Modifier_To_Menu_ChkBox_SLD, fert.RollOut_Modifier_To_Menu_ChkBox_SLD);
	    
	}
	@Then("Check Roll Out Modifier To Menu Check Box is Displayed")
	public void checkRollOutModifierToMenuCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.RollOut_Modifier_To_Menu_ChkBox, "Roll Out Modifier To Menu Check Box");

	}
	@Then("Check Roll Out Modifier Price & Quantity To Menu Check Box is Displayed")
	public void checkRollOutModifierPriceQuantityToMenuCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.RollOut_ModifierPrice_Quantity_To_Menu_ChkBox, "Roll Out Modifier Price & Quantity To Menu Check Box");

	}
	@Then("I Unselect Roll Out Modifier Price To Menu Check Box")
	public void iUnselectRollOutModifierPriceToMenuCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
//	    if(fert.RollOut_Modifier_To_Menu_ChkBox.isSelected())
//	    {
//	    	fert.RollOut_ModifierPrice_To_Menu_ChkBox.click();
//	    }
		
		cmp.Deselect_CheckBox(fert.RollOut_Modifier_To_Menu_ChkBox_SLD, fert.RollOut_Modifier_To_Menu_ChkBox_SLD);
	}
	@Then("Check Exclude Zero Price Menu Item Check Box is Displayed")
	public void checkExcludeZeroPriceMenuItemCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Exclude_ZeroPrice_MenuItem_ChkBox, "Exclude Zero Price Menu Item Check Box");

	}
	@Then("Check Exclude Zero Price Modifier Check Box is Displayed")
	public void checkExcludeZeroPriceModifierCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Exclude_ZeroPrice_Modifier_ChkBox, "Exclude Zero Price Modifier Check Box");

	}
	@Then("Check Tax Total Check Box is Displayed")
	public void checkTaxTotalCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Tax_Total_ChkBox, "Tax Total Check Box");

	}
	@Then("Check Hide Inclusive Tax Check Box is Displayed")
	public void checkHideInclusiveTaxCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Hide_Inclusive_Tax_ChkBox, "Hide Inclusive Tax Check Box");

	}
	@Then("Check Gratuity Check Box is Displayed")
	public void checkGratuityCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Gratuity_ChkBox, "Gratuity Check Box");

	}
	@Then("Check Tip Check Box is Displayed")
	public void checkTipCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Tip_ChkBox, "Tip Check Box");

	}
	@Then("Check Cash Discount Check Box is Displayed")
	public void checkCashDiscountCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Cash_Discount_ChkBox, "Cash Discount Check Box");

	}
	@Then("Check Check Total Check Box is Displayed")
	public void checkCheckTotalCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Check_Total_ChkBox, "Check Total Check Box");

	}
	@Then("Check Tender Details Check Box is Displayed")
	public void checkTenderDetailsCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Tender_Details_ChkBox, "Tender Details Check Box");

	}
	@Then("Check Show Membership Balance Check Box is Displayed")
	public void checkShowMembershipBalanceCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Show_Membership_Balance_ChkBox, "Show Membership Balance Check Box");

	}
	@Then("Check Discount Under the Menu Item Check Box is Displayed")
	public void checkDiscountUnderTheMenuItemCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Discount_Under_MenuItem_ChkBox, "Discount Under Menu Item Check Box");

	}
	@Then("Check Print Check In Primary & Secondary Languages Check Box is Displayed")
	public void checkPrintCheckInPrimarySecondaryLanguagesCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Print_Check_inPrimary_SecondaryLanguages_ChkBox, "Print Check In Primary & Secondary Languages Check Box");

	}
	@Then("I Close Order Summary Screen")
	public void iCloseOrderSummaryScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Close_Order_Summary_Screen();
	}
	@Then("I Open Customer Info Screen")
	public void iOpenCustomerInfoScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Open_Customer_Info_Screen();
	}
	@Then("Check Customer Name Check Box is Displayed")
	public void checkCustomerNameCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Customer_Name_ChkBox, "Customer Name Check Box");

	}
	@Then("Check Customer Address Check Box is Displayed")
	public void checkCustomerAddressCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Address_CustomerInfo_ChkBox, "Customer Address Check Box");

	}
	@Then("Check Customer Phone Number Check Box is Displayed")
	public void checkCustomerPhoneNumberCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Phone_Number_CustomerInfo_ChkBox, "Customer Phone Number Check Box");

	}
	@Then("Check Customer Email Check Box is Displayed")
	public void checkCustomerEmailCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Email_CustomerInfo_ChkBox, "Customer Email Check Box");

	}
	@Then("Check Customer Notes Text Box is Displayed")
	public void checkCustomerNotesTextBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Customer_Notes_ChkBox, "Customer Notes Check Box");

	}
	@Then("I Close Customer Info Screen")
	public void iCloseCustomerInfoScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Close_Customer_Info_Screen();
	}
	@Then("I Open Additional Settings Screen")
	public void iOpenAdditionalSettingsScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Open_Additional_Settings_Screen();
	}
	@Then("Check Tip Line Check Box is Displayed")
	public void checkTipLineCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Tip_Line_ChkBox, "Tip Line Check Box");

	}
	@Then("Check Signature Check Box is Displayed")
	public void checkSignatureCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Signature_ChkBox, "Signature Check Box");

	}
	@Then("Check Show E-Invoice URL Check Box is Displayed")
	public void checkShowEInvoiceURLCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Show_EInvoice_URL_ChkBox, "Show E-Invoice URL Check Box");

	}
	@Then("Check Show E-Invoice QR Check Box is Displayed")
	public void checkShowEInvoiceQRCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Show_EInvoice_QR_ChkBox, "Show E-Invoice QR Check Box");

	}
	@Then("Check Tip Suggestion Check Box is Displayed")
	public void checkTipSuggestionCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Tip_Suggestion_ChkBox, "Tip Suggestion Check Box");

	}
	@Then("Check Special Notes Check Box is Displayed")
	public void checkSpecialNotesCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Special_Notes_ChkBox, "Special Notes Check Box");

	}
	@Then("Check Loyalty Amount Check Box is Displayed")
	public void checkLoyaltyAmountCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Loyalty_Amount_ChkBox, "Loyalty Amount Check Box");

	}
	@Then("Check Barcode Check Box is Displayed")
	public void checkBarcodeCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Barcode_ChkBox, "Barcode Check Box");

	}
	@Then("Check Show Remaining Balance Check Box is Displayed")
	public void checkShowRemainingBalanceCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Show_Remaining_Balance_ChkBox, "Show Remaining Balance Check Box");

	}
	@Then("Check Show QR Payment Check Box is Displayed")
	public void checkShowQRPaymentCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Show_QR_Payment_ChkBox, "Show QR Payment Check Box");

	}
	@Then("Check Rename Tip Amount as Additional Tip Check Box is Displayed")
	public void checkRenameTipAmountAsAdditionalTipCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Rename_Tip_Amount_To_AdditionalTip_ChkBox, "Rename Tip Amount To Additional Tip Check Box");
	}
	@Then("I Close Additional Settings Screen")
	public void iCloseAdditionalSettingsScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Close_Additional_Settings_Screen();
	}
	@Then("I Open Merchant Copy Screen")
	public void iOpenMerchantCopyScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Open_Merchant_Copy_Screen();
	}
	@Then("Check Print GC Balance Check Box in Merchant Copy is Displayed")
	public void checkPrintGCBalanceCheckBoxInMerchantCopyIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Print_GC_Balance_MerchantCopy_ChkBox, "Print GC Balance in Merchant Copy Check Box");

	}
	@Then("Check Print HA Balance Check Box in Merchant Copy is Displayed")
	public void checkPrintHABalanceCheckBoxInMerchantCopyIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Print_HA_Balance_MerchantCopy_ChkBox, "Print HA Balance Check Box");

	}
	@Then("Check Print Tab Name Check Box is Displayed")
	public void checkPrintTabNameCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Print_Tab_Name_ChkBox, "Print Tab Name Check Box");

	}
	@Then("Check Print Membership Balance in Merchant Copy Check Box is Displayed")
	public void checkPrintMembershipBalanceInMerchantCopyCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Print_Membership_Balance_MerchantCopy_ChkBox, "Print Membership Balance Check Box");

	}
	@Then("I Close Merchant Copy Screen")
	public void iCloseMerchantCopyScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Close_Merchant_Copy_Screen();
	}
	@Then("I Open Customer Copy Screen")
	public void iOpenCustomerCopyScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Open_Customer_Copy_Screen();
	}
	@Then("Check Print GC Balance Check Box in Customer Copy is Displayed")
	public void checkPrintGCBalanceCheckBoxInCustomerCopyIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Print_GC_Balance_CustomerCopy_ChkBox, "Print GC Balance in Customer Copy Check Box");

	}
	@Then("Check Print HA Balance Check Box in Customer Copy is Displayed")
	public void checkPrintHABalanceCheckBoxInCustomerCopyIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Print_HA_Balance_CustomerCopy_ChkBox, "Print HA Balance in Customer Copy Check Box");

	}
	@Then("Check Print Membership Balance in Customer Copy Check Box is Displayed")
	public void checkPrintMembershipBalanceInCustomerCopyCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Print_Membership_Balance_CustomerCopy_ChkBox, "Print Membership Balance in Customer Copy Check Box");

	}
	@Then("I Close Customer Copy Screen")
	public void iCloseCustomerCopyScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Close_Customer_Copy_Screen();
	}
	@Given("I Select Font Size as Medium Radio button")
	public void iSelectFontSizeAsMediumRadioButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    fert.Click_Medium_FontSize();
	}
	@Then("Check Font Size changes as Medium in Template Preview Screen")
	public void checkFontSizeChangesAsMediumInTemplatePreviewScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//div[contains(@class,'preview-template bg-body font-size-1')]")), "Medium - Font Size changed in Preview Template");
	}
	@Then("Verify whether Receipt Template Updated or Not")
	public void verifyWhetherReceiptTemplateUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Receipt Template Saved");
	}
	@Then("Check Font Size selected as Medium")
	public void checkFontSizeSelectedAsMedium() {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Assertion_Validation_True_Element_Selected(fert.Medium_RadioBtn);
	}
	@Given("I Select Font Size as Small Radio button")
	public void iSelectFontSizeAsSmallRadioButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    fert.Click_Small_FontSize();
	}
	@Then("Check Font Size changes as Small in Template Preview Screen")
	public void checkFontSizeChangesAsSmallInTemplatePreviewScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//div[contains(@class,'preview-template bg-body font-size-0')]")), "Small - Font Size changed in Preview Template");
	}
	@Then("Check Font Size selected as Small")
	public void checkFontSizeSelectedAsSmall() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(fert.Small_RadioBtn);
	}
	@Given("I Select Choose Template as Template2")
	public void iSelectChooseTemplateAsTemplate2() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(fert.Choose_Template_InputBx, "Template 2", "Selecting Choose Template as Template 2");
	}
	@Then("Check Template selected as Template2")
	public void checkTemplateSelectedAsTemplate2() {
	    // Write code here that turns the phrase above into concrete actions
	    String Templ_Name=fert.Choose_Template_InputBx.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(Templ_Name, "Template 2", "Template 2 selected");
	}
	@Given("I Select Choose Template as Template1")
	public void iSelectChooseTemplateAsTemplate1() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(fert.Choose_Template_InputBx, "Template 1", "Selecting Choose Template as Template 1");
	}
	@Then("Check Template selected as Template1")
	public void checkTemplateSelectedAsTemplate1() {
	    // Write code here that turns the phrase above into concrete actions
	    String Templ_Name=fert.Choose_Template_InputBx.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(Templ_Name, "Template 1", "Template 1 selected");

	}
	@Given("I Unselect Store Logo Check Box")
	public void iUnselectStoreLogoCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Deselect_CheckBox(fert.Store_Logo_ChkBox_SLD, fert.Store_Logo_ChkBox);
	}
	@Given("I Unselect Store Name Check Box")
	public void iUnselectStoreNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Deselect_CheckBox(fert.Store_Name_ChkBox_SLD, fert.Store_Name_ChkBox);
	}
	@Given("I Unselect Store Address Check Box")
	public void iUnselectStoreAddressCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Deselect_CheckBox(fert.Address_StoreInfo_ChkBox_SLD,fert.Address_StoreInfo_ChkBox);
	}
	@Given("I Unselect Store Email Check Box")
	public void iUnselectStoreEmailCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Deselect_CheckBox(fert.Email_StoreInfo_ChkBox_SLD,fert.Email_StoreInfo_ChkBox);
	}
	@Given("I Unselect Store Phone Number Check Box")
	public void iUnselectStorePhoneNumberCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Deselect_CheckBox(fert.Phone_Number_StoreInfo_ChkBox_SLD, fert.Phone_Number_StoreInfo_ChkBox);
	}
	@Given("I Unselect Highlight Store Name Check Box")
	public void iUnselectHighlightStoreNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Deselect_CheckBox(fert.Highlight_Store_Name_ChkBox_SLD, fert.Highlight_Store_Name_ChkBox);
	}
	@Given("I Unselect Include Hours of Operation Check Box")
	public void iUnselectIncludeHoursOfOperationCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Deselect_CheckBox(fert.Include_Hours_Of_Operation_ChkBox_SLD,fert.Include_Hours_Of_Operation_ChkBox);
	}
	@Given("I Unselect Header Notes Check Box")
	public void iUnselectHeaderNotesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Deselect_CheckBox(fert.Header_Notes_ChkBox_SLD,fert.Header_Notes_ChkBox);

	}
	@Then("Check Store Logo Check Box is Unselected")
	public void checkStoreLogoCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Store_Logo_ChkBox);
	}
	@Then("Check Store Name Check Box is Unselected")
	public void checkStoreNameCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Store_Name_ChkBox);

	}
	@Then("Check Store Address Check Box is Unselected")
	public void checkStoreAddressCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Address_StoreInfo_ChkBox);

	}
	@Then("Check Store Email Check Box is Unselected")
	public void checkStoreEmailCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Email_StoreInfo_ChkBox);

	}
	@Then("Check Store Phone Number Check Box is Unselected")
	public void checkStorePhoneNumberCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Phone_Number_StoreInfo_ChkBox);

	}
	@Then("Check Highlight Store Name Check Box is Unselected")
	public void checkHighlightStoreNameCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Highlight_Store_Name_ChkBox);

	}
	@Then("Check Include Hours of Operation Check Box is Unselected")
	public void checkIncludeHoursOfOperationCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Include_Hours_Of_Operation_ChkBox);

	}
	@Then("Check Header Notes Check Box is Unselected")
	public void checkHeaderNotesCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Header_Notes_ChkBox);

	}
	@Given("I Select Store Logo Check Box")
	public void iSelectStoreLogoCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Store_Logo_ChkBox_SLD, fert.Store_Logo_ChkBox);
	}
	@Then("Check Upload Image Field is Displayed")
	public void checkUploadImageFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Upload_Picture(Utility.getProperty("Settings_Store_Information_Store_Image_Path"));
	}
	@Then("I Upload the Image above Recommended Size")
	public void iUploadTheImageAboveRecommendedSize() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Upload_Picture("./Automation_Images/Img above Size.png");

	}
	@Then("Check Recommended image size should be {int}*{int} Error is Displayed")
	public void checkRecommendedImageSizeShouldBeErrorIsDisplayed(Integer int1, Integer int2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Recommended image size should be 100*100");
	}
	@Then("I Select Store Name Check Box")
	public void iSelectStoreNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Store_Name_ChkBox_SLD,fert.Store_Name_ChkBox);
	}
	@Then("I Select Store Address Check Box")
	public void iSelectStoreAddressCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Address_StoreInfo_ChkBox_SLD,fert.Address_StoreInfo_ChkBox);

	}
	@Then("I Select Store Email Check Box")
	public void iSelectStoreEmailCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Email_StoreInfo_ChkBox_SLD,fert.Email_StoreInfo_ChkBox);

	}
	@Then("I Select Store Phone Number Check Box")
	public void iSelectStorePhoneNumberCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Phone_Number_StoreInfo_ChkBox_SLD,fert.Phone_Number_StoreInfo_ChkBox);

	}
	@Then("I Select Highlight Store Name Check Box")
	public void iSelectHighlightStoreNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Highlight_Store_Name_ChkBox_SLD,fert.Highlight_Store_Name_ChkBox);

	}
	@Then("I Select Include Hours of Operation Check Box")
	public void iSelectIncludeHoursOfOperationCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Include_Hours_Of_Operation_ChkBox_SLD,fert.Include_Hours_Of_Operation_ChkBox);

	}
	@Then("I Select Header Notes Check Box")
	public void iSelectHeaderNotesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Header_Notes_ChkBox_SLD,fert.Header_Notes_ChkBox);

	}
	@Then("I Enter the Header Notes")
	public void iEnterTheHeaderNotes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(fert.Header_Notes_TxtBox, "Welcome to Automation Store", "I Entered Header Notes");
	}
	@Then("Check Store Logo Check Box is Selected")
	public void checkStoreLogoCheckBoxIsSelected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		cmp.Select_CheckBox(fert.Header_Notes_ChkBox);
		cmp.Assertion_Validation_True_Element_Selected(fert.Store_Logo_ChkBox);
	}
	@Then("Check Store Name Check Box is Selected")
	public void checkStoreNameCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Store_Name_ChkBox);
	}
	@Then("Check Store Address Check Box is Selected")
	public void checkStoreAddressCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Address_StoreInfo_ChkBox);
	}
	@Then("Check Store Email Check Box is Selected")
	public void checkStoreEmailCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Email_StoreInfo_ChkBox);
	}
	@Then("Check Store Phone Number Check Box is Selected")
	public void checkStorePhoneNumberCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Phone_Number_StoreInfo_ChkBox);
	}
	@Then("Check Highlight Store Name Check Box is Selected")
	public void checkHighlightStoreNameCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Highlight_Store_Name_ChkBox);
	}
	@Then("Check Include Hours of Operation Check Box is Selected")
	public void checkIncludeHoursOfOperationCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Include_Hours_Of_Operation_ChkBox);
	}
	@Then("Check Header Notes Check Box is Selected")
	public void checkHeaderNotesCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Header_Notes_ChkBox);
	}
	@Given("I Unselect Check Number Check Box")
	public void iUnselectCheckNumberCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Check_Number_ChkBox_SLD,fert.Check_Number_ChkBox);
	}
	@Given("I Unselect Table Name Check Box")
	public void iUnselectTableNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Table_Name_ChkBox_SLD,fert.Table_Name_ChkBox);
	}
	@Given("I Unselect Seat Number Check Box")
	public void iUnselectSeatNumberCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Seat_Number_ChkBox_SLD,fert.Seat_Number_ChkBox);
	}
	@Given("I Unselect Check Open Server Check Box")
	public void iUnselectCheckOpenServerCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Check_Open_Server_ChkBox_SLD,fert.Check_Open_Server_ChkBox);
	}
	@Given("I Unselect Check Close Server Check Box")
	public void iUnselectCheckCloseServerCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Check_Close_Server_ChkBox_SLD,fert.Check_Close_Server_ChkBox);
	}
	@Given("I Unselect Open Date & Time Check Box")
	public void iUnselectOpenDateTimeCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Open_Date_Time_ChkBox_SLD,fert.Open_Date_Time_ChkBox);
	}
	@Given("I Unselect Close Date & Time Check Box")
	public void iUnselectCloseDateTimeCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Close_Date_Time_ChkBox_SLD,fert.Close_Date_Time_ChkBox);
	}
	@Given("I Unselect Service Type Check Box")
	public void iUnselectServiceTypeCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Service_Type_ChkBox_SLD,fert.Service_Type_ChkBox);
	}
	@Then("Check Check Number Check Box is Unselected")
	public void checkCheckNumberCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Check_Number_ChkBox);
	}
	@Then("Check Table Name Check Box is Unselected")
	public void checkTableNameCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Table_Name_ChkBox);
	}
	@Then("Check Seat Number Check Box is Unselected")
	public void checkSeatNumberCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Seat_Number_ChkBox);
	}
	@Then("Check Check Open Server Check Box is Unselected")
	public void checkCheckOpenServerCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Check_Open_Server_ChkBox);
	}
	@Then("Check Check Close Server Check Box is Unselected")
	public void checkCheckCloseServerCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Check_Close_Server_ChkBox);
	}
	@Then("Check Open Date & Time Check Box is Unselected")
	public void checkOpenDateTimeCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Open_Date_Time_ChkBox);
	}
	@Then("Check Close Date & Time Check Box is Unselected")
	public void checkCloseDateTimeCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Close_Date_Time_ChkBox);
	}
	@Then("Check Service Type Check Box is Unselected")
	public void checkServiceTypeCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(fert.Service_Type_ChkBox);
	}
	@Given("I Select Check Number Check Box")
	public void iSelectCheckNumberCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Check_Number_ChkBox_SLD,fert.Check_Number_ChkBox);
	}
	@Then("Check Position for Check Number Radio button Field is Displayed")
	public void checkPositionForCheckNumberRadioButtonFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Block1_Position_RadioBtn, "Position for Check Number");
	}
	@Then("Check Font Size for Check Number Radio button Field is Displayed")
	public void checkFontSizeForCheckNumberRadioButtonFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(fert.Normal_FontSize_CheckNumber_RadioBtn, "Font Size for Check Number");
	}
	@Then("I Select Check Number Position as Block2")
	public void iSelectCheckNumberPositionAsBlock2() {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Block2_Position_RadioBtn.click();
	}
	@Then("Check Font Size for Check Number Radio button Field is Not Displayed")
	public void checkFontSizeForCheckNumberRadioButtonFieldIsNotDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Not_Displayed(fert.Normal_FontSize_CheckNumber_RadioBtn, "Font Size for Check Number");
	}
	@Then("I Select Check Number Position as Block1")
	public void iSelectCheckNumberPositionAsBlock1() {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Block1_Position_RadioBtn.click();
	}
	@Then("I Select Check Number Font Size as Normal")
	public void iSelectCheckNumberFontSizeAsNormal() {
	    // Write code here that turns the phrase above into concrete actions
	    fert.Normal_FontSize_CheckNumber_RadioBtn.click();
	}
	@Then("I Select Table Name Check Box")
	public void iSelectTableNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Table_Name_ChkBox_SLD,fert.Table_Name_ChkBox);
	}
	@Then("I Select Seat Number Check Box")
	public void iSelectSeatNumberCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Seat_Number_ChkBox_SLD,fert.Seat_Number_ChkBox);
	}
	@Then("I Select Check Open Server Check Box")
	public void iSelectCheckOpenServerCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Check_Open_Server_ChkBox_SLD,fert.Check_Open_Server_ChkBox);
	}
	@Then("I Select Check Close Server Check Box")
	public void iSelectCheckCloseServerCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Check_Close_Server_ChkBox_SLD,fert.Check_Close_Server_ChkBox);
	}
	@Then("I Select Open Date & Time Check Box")
	public void iSelectOpenDateTimeCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Open_Date_Time_ChkBox_SLD,fert.Open_Date_Time_ChkBox);
	}
	@Then("I Select Close Date & Time Check Box")
	public void iSelectCloseDateTimeCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Close_Date_Time_ChkBox_SLD,fert.Close_Date_Time_ChkBox);
	}
	@Then("I Select Service Type Check Box")
	public void iSelectServiceTypeCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Service_Type_ChkBox_SLD,fert.Service_Type_ChkBox);
	}
	@Then("Check Check Number Check Box is Selected")
	public void checkCheckNumberCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Check_Number_ChkBox);
	}
	@Then("Check Check Number Position selected as Block1")
	public void checkCheckNumberPositionSelectedAsBlock1() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Block1_Position_RadioBtn);

	}
	@Then("Check Check Number Font Size selected as Normal")
	public void checkCheckNumberFontSizeSelectedAsNormal() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Normal_FontSize_CheckNumber_RadioBtn);

	}
	@Then("Check Table Name Check Box is Selected")
	public void checkTableNameCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Table_Name_ChkBox);

	}
	@Then("Check Seat Number Check Box is Selected")
	public void checkSeatNumberCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Seat_Number_ChkBox);

	}
	@Then("Check Check Open Server Check Box is Selected")
	public void checkCheckOpenServerCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Check_Open_Server_ChkBox);

	}
	@Then("Check Check Close Server Check Box is Selected")
	public void checkCheckCloseServerCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Check_Close_Server_ChkBox);

	}
	@Then("Check Open Date & Time Check Box is Selected")
	public void checkOpenDateTimeCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Open_Date_Time_ChkBox);

	}
	@Then("Check Close Date & Time Check Box is Selected")
	public void checkCloseDateTimeCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Close_Date_Time_ChkBox);

	}
	@Then("Check Service Type Check Box is Selected")
	public void checkServiceTypeCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Service_Type_ChkBox);

	}
	@Given("I Unselect Secondary Menu Name Check Box")
	public void iUnselectSecondaryMenuNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Secondary_MenuName_ChkBox_SLD,fert.Secondary_MenuName_ChkBox);
	}
	@Given("I Unselect Exclude Zero Price Menu Item Check Box")
	public void iUnselectExcludeZeroPriceMenuItemCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Exclude_ZeroPrice_MenuItem_ChkBox_SLD,fert.Exclude_ZeroPrice_MenuItem_ChkBox);
	}
	@Given("I Unselect Exclude Zero Price Modifier Check Box")
	public void iUnselectExcludeZeroPriceModifierCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Exclude_ZeroPrice_Modifier_ChkBox_SLD,fert.Exclude_ZeroPrice_Modifier_ChkBox);
	}
	@Given("I Unselect Tax Total Check Box")
	public void iUnselectTaxTotalCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Tax_Total_ChkBox_SLD,fert.Tax_Total_ChkBox);
	}
	@Given("I Unselect Hide Inclusive Tax Check Box")
	public void iUnselectHideInclusiveTaxCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Hide_Inclusive_Tax_ChkBox_SLD,fert.Hide_Inclusive_Tax_ChkBox);
	}
	@Given("I Unselect Gratuity Check Box")
	public void iUnselectGratuityCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Gratuity_ChkBox_SLD,fert.Gratuity_ChkBox);
	}
	@Given("I Unselect Tip Check Box")
	public void iUnselectTipCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Tip_ChkBox_SLD,fert.Tip_ChkBox);
	}
	@Given("I Unselect Cash Discount Check Box")
	public void iUnselectCashDiscountCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Cash_Discount_ChkBox_SLD,fert.Cash_Discount_ChkBox);
	}
	@Given("I Unselect Check Total Check Box")
	public void iUnselectCheckTotalCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Check_Total_ChkBox_SLD,fert.Check_Total_ChkBox);
	}
	@Given("I Unselect Tender Details Check Box")
	public void iUnselectTenderDetailsCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Tender_Details_ChkBox_SLD,fert.Tender_Details_ChkBox);
	}
	@Given("I Unselect Show Membership Balance Check Box")
	public void iUnselectShowMembershipBalanceCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Show_Membership_Balance_ChkBox_SLD,fert.Show_Membership_Balance_ChkBox);
	}
	@Given("I Unselect Discount Under the Menu Item Check Box")
	public void iUnselectDiscountUnderTheMenuItemCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Discount_Under_MenuItem_ChkBox_SLD,fert.Discount_Under_MenuItem_ChkBox);
	}
	@Given("I Unselect Print Check In Primary & Secondary Languages Check Box")
	public void iUnselectPrintCheckInPrimarySecondaryLanguagesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Print_Check_inPrimary_SecondaryLanguages_ChkBox_SLD,fert.Print_Check_inPrimary_SecondaryLanguages_ChkBox);
	}
	@Given("I Unselect Single Quantity Price Inside Braces Check Box")
	public void iUnselectSingleQuantityPriceInsideBracesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Single_Quantity_Price_Inside_Braces_ChkBox_SLD,fert.Single_Quantity_Price_Inside_Braces_ChkBox);
	}
	@Then("Check Secondary Menu Name Check Box is Unselected")
	public void checkSecondaryMenuNameCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Secondary_MenuName_ChkBox);
	}
	@Then("Check Roll Out Modifier Price To Menu Check Box is Unselected")
	public void checkRollOutModifierPriceToMenuCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.RollOut_Modifier_To_Menu_ChkBox);
	}
	@Then("Check Exclude Zero Price Menu Item Check Box is Unselected")
	public void checkExcludeZeroPriceMenuItemCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Exclude_ZeroPrice_MenuItem_ChkBox);
	}
	@Then("Check Exclude Zero Price Modifier Check Box is Unselected")
	public void checkExcludeZeroPriceModifierCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Exclude_ZeroPrice_Modifier_ChkBox);
	}
	@Then("Check Tax Total Check Box is Unselected")
	public void checkTaxTotalCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Tax_Total_ChkBox);
	}
	@Then("Check Hide Inclusive Tax Check Box is Unselected")
	public void checkHideInclusiveTaxCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Hide_Inclusive_Tax_ChkBox);
	}
	@Then("Check Gratuity Check Box is Unselected")
	public void checkGratuityCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Gratuity_ChkBox);
	}
	@Then("Check Tip Check Box is Unselected")
	public void checkTipCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Tip_ChkBox);
	}
	@Then("Check Cash Discount Check Box is Unselected")
	public void checkCashDiscountCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Cash_Discount_ChkBox);
	}
	@Then("Check Check Total Check Box is Unselected")
	public void checkCheckTotalCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Check_Total_ChkBox);
	}
	@Then("Check Tender Details Check Box is Unselected")
	public void checkTenderDetailsCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Tender_Details_ChkBox);
	}
	@Then("Check Show Membership Balance Check Box is Unselected")
	public void checkShowMembershipBalanceCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Show_Membership_Balance_ChkBox);
	}
	@Then("Check Discount Under the Menu Item Check Box is Unselected")
	public void checkDiscountUnderTheMenuItemCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Discount_Under_MenuItem_ChkBox);
	}
	@Then("Check Print Check In Primary & Secondary Languages Check Box is Unselected")
	public void checkPrintCheckInPrimarySecondaryLanguagesCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Print_Check_inPrimary_SecondaryLanguages_ChkBox);
	}
	@Then("Check Single Quantity Price Inside Braces Check Box is Unselected")
	public void checkSingleQuantityPriceInsideBracesCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_False_Element_Not_Selected(fert.Single_Quantity_Price_Inside_Braces_ChkBox);
	}
	@Given("I Select Secondary Menu Name Check Box")
	public void iSelectSecondaryMenuNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Secondary_MenuName_ChkBox_SLD,fert.Secondary_MenuName_ChkBox);
	}
	@Given("I Select Roll Out Modifier To Menu Check Box")
	public void iSelectRollOutModifierToMenuCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.RollOut_Modifier_To_Menu_ChkBox_SLD,fert.RollOut_Modifier_To_Menu_ChkBox);
	}
	@Given("I Select Roll Out Modifier Price & Quantity To Menu Check Box")
	public void iSelectRollOutModifierPriceQuantityToMenuCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.RollOut_ModifierPrice_Quantity_To_Menu_ChkBox_SLD,fert.RollOut_ModifierPrice_Quantity_To_Menu_ChkBox);
	}
	@Given("I Select Exclude Zero Price Menu Item Check Box")
	public void iSelectExcludeZeroPriceMenuItemCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Exclude_ZeroPrice_MenuItem_ChkBox_SLD,fert.Exclude_ZeroPrice_MenuItem_ChkBox);
	}
	@Given("I Select Exclude Zero Price Modifier Check Box")
	public void iSelectExcludeZeroPriceModifierCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Exclude_ZeroPrice_Modifier_ChkBox_SLD,fert.Exclude_ZeroPrice_Modifier_ChkBox);
	}
	@Given("I Select Tax Total Check Box")
	public void iSelectTaxTotalCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Tax_Total_ChkBox_SLD,fert.Tax_Total_ChkBox);
	}
	@Given("I Select Hide Inclusive Tax Check Box")
	public void iSelectHideInclusiveTaxCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Hide_Inclusive_Tax_ChkBox_SLD,fert.Hide_Inclusive_Tax_ChkBox);
	}
	@Given("I Select Gratuity Check Box")
	public void iSelectGratuityCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Gratuity_ChkBox_SLD,fert.Gratuity_ChkBox);
	}
	@Given("I Select Tip Check Box")
	public void iSelectTipCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Tip_ChkBox_SLD,fert.Tip_ChkBox);
	}
	@Given("I Select Cash Discount Check Box")
	public void iSelectCashDiscountCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Cash_Discount_ChkBox_SLD,fert.Cash_Discount_ChkBox);
	}
	@Given("I Select Check Total Check Box")
	public void iSelectCheckTotalCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Check_Total_ChkBox_SLD,fert.Check_Total_ChkBox);
	}
	@Given("I Select Tender Details Check Box")
	public void iSelectTenderDetailsCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Tender_Details_ChkBox_SLD,fert.Tender_Details_ChkBox);
	}
	@Given("I Select Show Membership Balance Check Box")
	public void iSelectShowMembershipBalanceCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Show_Membership_Balance_ChkBox_SLD,fert.Show_Membership_Balance_ChkBox);
	}
	@Given("I Select Discount Under the Menu Item Check Box")
	public void iSelectDiscountUnderTheMenuItemCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Discount_Under_MenuItem_ChkBox_SLD,fert.Discount_Under_MenuItem_ChkBox);
	}
	@Given("I Select Print Check In Primary & Secondary Languages Check Box")
	public void iSelectPrintCheckInPrimarySecondaryLanguagesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Print_Check_inPrimary_SecondaryLanguages_ChkBox_SLD,fert.Print_Check_inPrimary_SecondaryLanguages_ChkBox);
	}
	@Given("I Select Single Quantity Price Inside Braces Check Box")
	public void iSelectSingleQuantityPriceInsideBracesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Single_Quantity_Price_Inside_Braces_ChkBox_SLD,fert.Single_Quantity_Price_Inside_Braces_ChkBox);
	}
	@Then("Check Secondary Menu Name Check Box is Selected")
	public void checkSecondaryMenuNameCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Secondary_MenuName_ChkBox);
	}
	@Then("Check Roll Out Modifier Price To Menu Check Box is Selected")
	public void checkRollOutModifierPriceToMenuCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.RollOut_Modifier_To_Menu_ChkBox);
	}
	@Then("Check Roll Out Modifier To Menu Check Box is Selected")
	public void checkRollOutModifierToMenuCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.RollOut_Modifier_To_Menu_ChkBox);
	}
	@Then("Check Roll Out Modifier Price & Quantity To Menu Check Box is Selected")
	public void checkRollOutModifierPriceQuantityToMenuCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.RollOut_ModifierPrice_Quantity_To_Menu_ChkBox);
	}
	@Then("Check Exclude Zero Price Menu Item Check Box is Selected")
	public void checkExcludeZeroPriceMenuItemCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Exclude_ZeroPrice_MenuItem_ChkBox);
	}
	@Then("Check Exclude Zero Price Modifier Check Box is Selected")
	public void checkExcludeZeroPriceModifierCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Exclude_ZeroPrice_Modifier_ChkBox);
	}
	@Then("Check Tax Total Check Box is Selected")
	public void checkTaxTotalCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Tax_Total_ChkBox);
	}
	@Then("Check Hide Inclusive Tax Check Box is Selected")
	public void checkHideInclusiveTaxCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Hide_Inclusive_Tax_ChkBox);
	}
	@Then("Check Gratuity Check Box is Selected")
	public void checkGratuityCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Gratuity_ChkBox);
	}
	@Then("Check Tip Check Box is Selected")
	public void checkTipCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Tip_ChkBox);
	}
	@Then("Check Cash Discount Check Box is Selected")
	public void checkCashDiscountCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Cash_Discount_ChkBox);
	}
	@Then("Check Check Total Check Box is Selected")
	public void checkCheckTotalCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Check_Total_ChkBox);
	}
	@Then("Check Tender Details Check Box is Selected")
	public void checkTenderDetailsCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Tender_Details_ChkBox);
	}
	@Then("Check Show Membership Balance Check Box is Selected")
	public void checkShowMembershipBalanceCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Show_Membership_Balance_ChkBox);
	}
	@Then("Check Discount Under the Menu Item Check Box is Selected")
	public void checkDiscountUnderTheMenuItemCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Discount_Under_MenuItem_ChkBox);
	}
	@Then("Check Print Check In Primary & Secondary Languages Check Box is Selected")
	public void checkPrintCheckInPrimarySecondaryLanguagesCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Print_Check_inPrimary_SecondaryLanguages_ChkBox);
	}
	@Then("Check Single Quantity Price Inside Braces Check Box is Selected")
	public void checkSingleQuantityPriceInsideBracesCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Single_Quantity_Price_Inside_Braces_ChkBox);
	}
	@Given("I Unselect Customer Name Check Box")
	public void iUnselectCustomerNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Customer_Name_ChkBox_SLD,fert.Customer_Name_ChkBox);
	}
	@Given("I Unselect Customer Address Check Box")
	public void iUnselectCustomerAddressCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Address_CustomerInfo_ChkBox_SLD,fert.Address_CustomerInfo_ChkBox);
	}
	@Given("I Unselect Customer Phone Number Check Box")
	public void iUnselectCustomerPhoneNumberCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Phone_Number_CustomerInfo_ChkBox_SLD,fert.Phone_Number_CustomerInfo_ChkBox);
	}
	@Given("I Unselect Customer Email Check Box")
	public void iUnselectCustomerEmailCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Email_CustomerInfo_ChkBox_SLD,fert.Email_CustomerInfo_ChkBox);
	}
	@Given("I Unselect Card Details Check Box")
	public void iUnselectCardDetailsCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Card_Details_ChkBox_SLD,fert.Card_Details_ChkBox);
	}
	@Given("I Unselect Customer Notes Check Box")
	public void iUnselectCustomerNotesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Customer_Notes_ChkBox_SLD,fert.Customer_Notes_ChkBox);
	}
	@Then("Check Customer Name Check Box is Unselected")
	public void checkCustomerNameCheckBoxIsUnselected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Assertion_Validation_False_Element_Not_Selected(fert.Customer_Name_ChkBox);
	}
	@Then("Check Customer Address Check Box is Unselected")
	public void checkCustomerAddressCheckBoxIsUnselected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Assertion_Validation_False_Element_Not_Selected(fert.Address_CustomerInfo_ChkBox);
	}
	@Then("Check Customer Phone Number Check Box is Unselected")
	public void checkCustomerPhoneNumberCheckBoxIsUnselected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Assertion_Validation_False_Element_Not_Selected(fert.Phone_Number_CustomerInfo_ChkBox);
	}
	@Then("Check Customer Email Check Box is Unselected")
	public void checkCustomerEmailCheckBoxIsUnselected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Assertion_Validation_False_Element_Not_Selected(fert.Email_CustomerInfo_ChkBox);
	}
	@Then("Check Card Details Check Box is Unselected")
	public void checkCardDetailsCheckBoxIsUnselected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Assertion_Validation_False_Element_Not_Selected(fert.Card_Details_ChkBox);
	}
	@Then("Check Customer Notes Check Box is Unselected")
	public void checkCustomerNotesCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Assertion_Validation_False_Element_Not_Selected(fert.Customer_Notes_ChkBox);
	}
	@Given("I Select Customer Name Check Box")
	public void iSelectCustomerNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Customer_Name_ChkBox_SLD,fert.Customer_Name_ChkBox);
	}
	@Given("I Select Customer Address Check Box")
	public void iSelectCustomerAddressCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Address_CustomerInfo_ChkBox_SLD,fert.Address_CustomerInfo_ChkBox);
	}
	@Given("I Select Customer Phone Number Check Box")
	public void iSelectCustomerPhoneNumberCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Phone_Number_CustomerInfo_ChkBox_SLD,fert.Phone_Number_CustomerInfo_ChkBox);
	}
	@Given("I Select Customer Email Check Box")
	public void iSelectCustomerEmailCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Email_CustomerInfo_ChkBox_SLD,fert.Email_CustomerInfo_ChkBox);
	}
	@Given("I Select Card Details Check Box")
	public void iSelectCardDetailsCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Card_Details_ChkBox_SLD,fert.Card_Details_ChkBox);
	}
	@Given("I Select Customer Notes Check Box")
	public void iSelectCustomerNotesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Customer_Notes_ChkBox_SLD,fert.Customer_Notes_ChkBox);
	}
	@Given("I Enter the Customer Notes")
	public void iEnterTheCustomerNotes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Enter_Text(fert.Customer_Notes_TxtBx, "Thank You., Visit Again...!", "Customer Notes Entered");
	}
	@Then("Check Customer Name Check Box is Selected")
	public void checkCustomerNameCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Customer_Name_ChkBox);
	}
	@Then("Check Customer Address Check Box is Selected")
	public void checkCustomerAddressCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Address_CustomerInfo_ChkBox);
	}
	@Then("Check Customer Phone Number Check Box is Selected")
	public void checkCustomerPhoneNumberCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Phone_Number_CustomerInfo_ChkBox);
	}
	@Then("Check Customer Email Check Box is Selected")
	public void checkCustomerEmailCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Email_CustomerInfo_ChkBox);
	}
	@Then("Check Card Details Check Box is Selected")
	public void checkCardDetailsCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Card_Details_ChkBox);
	}
	@Then("Check Customer Notes Check Box is Selected")
	public void checkCustomerNotesCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Customer_Notes_ChkBox);
	}
	@Given("I Unselect Tip Line Check Box")
	public void iUnselectTipLineCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Tip_Line_ChkBox_SLD,fert.Tip_Line_ChkBox);
	}
	@Given("I Unselect Signature  Check Box")
	public void iUnselectSignatureCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Signature_ChkBox_SLD,fert.Signature_ChkBox);
	}
	@Given("I Unselect Show E-Invoice URL Check Box")
	public void iUnselectShowEInvoiceURLCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Show_EInvoice_URL_ChkBox_SLD,fert.Show_EInvoice_URL_ChkBox);
	}
	@Given("I Unselect Show E-Invoice QR Check Box")
	public void iUnselectShowEInvoiceQRCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Show_EInvoice_QR_ChkBox_SLD,fert.Show_EInvoice_QR_ChkBox);
	}
	@Given("I Unselect Tip Suggestion Check Box")
	public void iUnselectTipSuggestionCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Tip_Suggestion_ChkBox_SLD,fert.Tip_Suggestion_ChkBox);
	}
	@Given("I Unselect Special Notes Check Box")
	public void iUnselectSpecialNotesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Special_Notes_ChkBox_SLD,fert.Special_Notes_ChkBox);
	}
	@Given("I Unselect Loyalty Amount Check Box")
	public void iUnselectLoyaltyAmountCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Loyalty_Amount_ChkBox_SLD,fert.Loyalty_Amount_ChkBox);
	}
	@Given("I Unselect Barcode Check Box")
	public void iUnselectBarcodeCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Barcode_ChkBox_SLD,fert.Barcode_ChkBox);
	}
	@Given("I Unselect Cut Paper After Each Print Check Box")
	public void iUnselectCutPaperAfterEachPrintCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Cut_Paper_After_Each_Print_ChkBox_SLD,fert.Cut_Paper_After_Each_Print_ChkBox);
	}
	@Given("I Unselect Show Remaining Balance Check Box")
	public void iUnselectShowRemainingBalanceCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Show_Remaining_Balance_ChkBox_SLD,fert.Show_Remaining_Balance_ChkBox);
	}
	@Given("I Unselect Show QR Payment Check Box")
	public void iUnselectShowQRPaymentCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Show_QR_Payment_ChkBox_SLD,fert.Show_QR_Payment_ChkBox);
	}
	@Given("I Unselect Rename Tip Amount as Additional Tip Check Box")
	public void iUnselectRenameTipAmountAsAdditionalTipCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Rename_Tip_Amount_To_AdditionalTip_ChkBox_SLD,fert.Rename_Tip_Amount_To_AdditionalTip_ChkBox);
	}
	@Then("Check Tip Line Check Box is Unselected")
	public void checkTipLineCheckBoxIsUnselected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Tip_Line_ChkBox);
	}
	@Then("Check Signature Check Box is Unselected")
	public void checkSignatureCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Signature_ChkBox);
	}
	@Then("Check Show E-Invoice URL Check Box is Unselected")
	public void checkShowEInvoiceURLCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Show_EInvoice_URL_ChkBox);
	}
	@Then("Check Show E-Invoice QR Check Box is Unselected")
	public void checkShowEInvoiceQRCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Show_EInvoice_QR_ChkBox);
	}
	@Then("Check Tip Suggestion Check Box is Unselected")
	public void checkTipSuggestionCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Tip_Suggestion_ChkBox);
	}
	@Then("Check Special Notes Check Box is Unselected")
	public void checkSpecialNotesCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Special_Notes_ChkBox);
	}
	@Then("Check Loyalty Amount Check Box is Unselected")
	public void checkLoyaltyAmountCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Loyalty_Amount_ChkBox);
	}
	@Then("Check Barcode Check Box is Unselected")
	public void checkBarcodeCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Barcode_ChkBox);
	}
	@Then("Check Cut Paper After Each Print Check Box is Unselected")
	public void checkCutPaperAfterEachPrintCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Cut_Paper_After_Each_Print_ChkBox);
	}
	@Then("Check Show Remaining Balance Check Box is Unselected")
	public void checkShowRemainingBalanceCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Show_Remaining_Balance_ChkBox);
	}
	@Then("Check Show QR Payment Check Box is Unselected")
	public void checkShowQRPaymentCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Show_QR_Payment_ChkBox);
	}
	@Then("Check Rename Tip Amount as Additional Tip Check Box is Unselected")
	public void checkRenameTipAmountAsAdditionalTipCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(fert.Rename_Tip_Amount_To_AdditionalTip_ChkBox);
	}
	@Given("I Select Tip Line Check Box")
	public void iSelectTipLineCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		  cmp.Select_CheckBox(fert.Tip_Line_ChkBox_SLD,fert.Tip_Line_ChkBox);
	}
	@Then("Check Tip Field displayed in Template Preview")
	public void checkTipFieldDisplayedInTemplatePreview() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		  cmp.Check_Element_or_Text_Displayed(fert.Tip_Line_inTemplate, "Tip Line in Template");
	}
	@Then("I Select Signature Check Box")
	public void iSelectSignatureCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Signature_ChkBox_SLD,fert.Signature_ChkBox);
	}
	@Then("Check Customer Signature Field displayed in Template Preview")
	public void checkCustomerSignatureFieldDisplayedInTemplatePreview() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(fert.Signature_inTemplate, "Signature in Template");
	}
	@Then("I Select Show E-Invoice URL Check Box")
	public void iSelectShowEInvoiceURLCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Show_EInvoice_URL_ChkBox_SLD,fert.Show_EInvoice_URL_ChkBox);

	}
	@Then("Check E-Invoice URL Field displayed in Template Preview")
	public void checkEInvoiceURLFieldDisplayedInTemplatePreview() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(fert.E_Invoice_URL_inTemplate, "E-Invoice URL in Template");
	}
	@Then("I Select Show E-Invoice QR Check Box")
	public void iSelectShowEInvoiceQRCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Show_EInvoice_QR_ChkBox_SLD,fert.Show_EInvoice_QR_ChkBox);

	}
	@Then("Check E-Invoice QR Field displayed in Template Preview")
	public void checkEInvoiceQRFieldDisplayedInTemplatePreview() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(fert.E_Invoice_QR_inTemplate, "E-Invoice QR in Template");
	}
	@Then("I Select Tip Suggestion Check Box")
	public void iSelectTipSuggestionCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Tip_Suggestion_ChkBox_SLD,fert.Tip_Suggestion_ChkBox);

	}
	@Then("Check Suggested Tip Amount Field displayed in Template Preview")
	public void checkSuggestedTipAmountFieldDisplayedInTemplatePreview() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(fert.Tip_Suggestion_inTemplate, "Tip Suggestion in Template");
	}
	@Then("Check Tip Suggestion Custom Message Check Box is Displayed")
	public void checkTipSuggestionCustomMessageCheckBoxIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(fert.Tip_Suggestion_CustomMsg_ChkBox, "Tip suggestion custom message Check Box");

	}
	@Then("I Select Tip Suggestion Custom Message Check Box")
	public void iSelectTipSuggestionCustomMessageCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Tip_Suggestion_CustomMsg_ChkBox_SLD,fert.Tip_Suggestion_CustomMsg_ChkBox);

	}
	@Then("I Select Special Notes Check Box")
	public void iSelectSpecialNotesCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Special_Notes_ChkBox_SLD,fert.Special_Notes_ChkBox);

	}
	@Then("I Select Loyalty Amount Check Box")
	public void iSelectLoyaltyAmountCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Loyalty_Amount_ChkBox_SLD,fert.Loyalty_Amount_ChkBox);

	}
	@Then("I Select Barcode Check Box")
	public void iSelectBarcodeCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Barcode_ChkBox_SLD,fert.Barcode_ChkBox);

	}
	@Then("Check Barcode Field displayed in Template Preview")
	public void checkBarcodeFieldDisplayedInTemplatePreview() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(fert.Barcode_inTemplate, "Barcode in Template");

	}
	@Then("I Select Cut Paper After Each Print Check Box")
	public void iSelectCutPaperAfterEachPrintCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Cut_Paper_After_Each_Print_ChkBox_SLD,fert.Cut_Paper_After_Each_Print_ChkBox);

	}
	@Then("I Select Show Remaining Balance Check Box")
	public void iSelectShowRemainingBalanceCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Show_Remaining_Balance_ChkBox_SLD,fert.Show_Remaining_Balance_ChkBox);

	}
	@Then("I Select Show QR Payment Check Box")
	public void iSelectShowQRPaymentCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Show_QR_Payment_ChkBox_SLD,fert.Show_QR_Payment_ChkBox);

	}
	@Then("Check QR Payment Field displayed in Template Preview")
	public void checkQRPaymentFieldDisplayedInTemplatePreview() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(fert.QR_Payment_inTemplate, "QR Payment in Template");

	}
	@Then("I Select Rename Tip Amount as Additional Tip Check Box")
	public void iSelectRenameTipAmountAsAdditionalTipCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Select_CheckBox(fert.Rename_Tip_Amount_To_AdditionalTip_ChkBox_SLD,fert.Rename_Tip_Amount_To_AdditionalTip_ChkBox);

	}
	@Then("Check Tip Line Check Box is Selected")
	public void checkTipLineCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Tip_Line_ChkBox);
	}
	@Then("Check Signature  Check Box is Selected")
	public void checkSignatureCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Signature_ChkBox);
	}
	@Then("Check Show E-Invoice URL Check Box is Selected")
	public void checkShowEInvoiceURLCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Show_EInvoice_URL_ChkBox);
	}
	@Then("Check Show E-Invoice QR Check Box is Selected")
	public void checkShowEInvoiceQRCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Show_EInvoice_QR_ChkBox);
	}
	@Then("Check Tip Suggestion Check Box is Selected")
	public void checkTipSuggestionCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Tip_Suggestion_ChkBox);
	}
	@Then("Check Tip Suggestion Custom Message Check Box is Selected")
	public void checkTipSuggestionCustomMessageCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Tip_Suggestion_CustomMsg_ChkBox);
	}
	@Then("Check Special Notes Check Box is Selected")
	public void checkSpecialNotesCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Special_Notes_ChkBox);
	}
	@Then("Check Loyalty Amount Check Box is Selected")
	public void checkLoyaltyAmountCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Loyalty_Amount_ChkBox);
	}
	@Then("Check Barcode Check Box is Selected")
	public void checkBarcodeCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Barcode_ChkBox);
	}
	@Then("Check Cut Paper After Each Print Check Box is Selected")
	public void checkCutPaperAfterEachPrintCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Cut_Paper_After_Each_Print_ChkBox);
	}
	@Then("Check Show Remaining Balance Check Box is Selected")
	public void checkShowRemainingBalanceCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Show_Remaining_Balance_ChkBox);
	}
	@Then("Check Show QR Payment Check Box is Selected")
	public void checkShowQRPaymentCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Show_QR_Payment_ChkBox);
	}
	@Then("Check Rename Tip Amount as Additional Tip Check Box is Selected")
	public void checkRenameTipAmountAsAdditionalTipCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Rename_Tip_Amount_To_AdditionalTip_ChkBox);
	}
	@Given("I Unselect Print GC Balance Check Box in Merchant Copy")
	public void iUnselectPrintGCBalanceCheckBoxInMerchantCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Print_GC_Balance_MerchantCopy_ChkBox_SLD,fert.Print_GC_Balance_MerchantCopy_ChkBox);
	}
	@Given("I Unselect Print HA Balance Check Box in Merchant Copy")
	public void iUnselectPrintHABalanceCheckBoxInMerchantCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Print_HA_Balance_MerchantCopy_ChkBox_SLD,fert.Print_HA_Balance_MerchantCopy_ChkBox);
	}
	@Given("I Unselect Print Tab Name Check Box")
	public void iUnselectPrintTabNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Print_Tab_Name_ChkBox_SLD,fert.Print_Tab_Name_ChkBox);
	}
	@Given("I Unselect Print Membership Balance Check Box in Merchant Copy")
	public void iUnselectPrintMembershipBalanceCheckBoxInMerchantCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Deselect_CheckBox(fert.Print_Membership_Balance_MerchantCopy_ChkBox_SLD,fert.Print_Membership_Balance_MerchantCopy_ChkBox);
	}
	@Then("Check Print GC Balance Check Box in Merchant Copy is Unselected")
	public void checkPrintGCBalanceCheckBoxInMerchantCopyIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_False_Element_Not_Selected(fert.Print_GC_Balance_MerchantCopy_ChkBox);
	}
	@Then("Check Print HA Balance Check Box in Merchant Copy is Unselected")
	public void checkPrintHABalanceCheckBoxInMerchantCopyIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_False_Element_Not_Selected(fert.Print_HA_Balance_MerchantCopy_ChkBox);
	}
	@Then("Check Print Tab Name Check Box is Unselected")
	public void checkPrintTabNameCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_False_Element_Not_Selected(fert.Print_Tab_Name_ChkBox);
	}
	@Then("Check Print Membership Balance in Merchant Copy Check Box is Unselected")
	public void checkPrintMembershipBalanceInMerchantCopyCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_False_Element_Not_Selected(fert.Print_Membership_Balance_MerchantCopy_ChkBox);
	}
	@Given("I Select Print GC Balance Check Box in Merchant Copy")
	public void iSelectPrintGCBalanceCheckBoxInMerchantCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Print_GC_Balance_MerchantCopy_ChkBox_SLD,fert.Print_GC_Balance_MerchantCopy_ChkBox);
	}
	@Given("I Select Print HA Balance Check Box in Merchant Copy")
	public void iSelectPrintHABalanceCheckBoxInMerchantCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Print_HA_Balance_MerchantCopy_ChkBox_SLD,fert.Print_HA_Balance_MerchantCopy_ChkBox);
	}
	@Given("I Select Print Tab Name Check Box")
	public void iSelectPrintTabNameCheckBox() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Print_Tab_Name_ChkBox_SLD,fert.Print_Tab_Name_ChkBox);
	}
	@Given("I Select Print Membership Balance Check Box in Merchant Copy")
	public void iSelectPrintMembershipBalanceCheckBoxInMerchantCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Print_Membership_Balance_MerchantCopy_ChkBox_SLD,fert.Print_Membership_Balance_MerchantCopy_ChkBox);
	}
	@Then("Check Print GC Balance Check Box in Merchant Copy is Selected")
	public void checkPrintGCBalanceCheckBoxInMerchantCopyIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Print_GC_Balance_MerchantCopy_ChkBox);
	}
	@Then("Check Print HA Balance Check Box in Merchant Copy is Selected")
	public void checkPrintHABalanceCheckBoxInMerchantCopyIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Print_HA_Balance_MerchantCopy_ChkBox);
	}
	@Then("Check Print Tab Name Check Box is Selected")
	public void checkPrintTabNameCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Print_Tab_Name_ChkBox);
	}
	@Then("Check Print Membership Balance in Merchant Copy Check Box is Selected")
	public void checkPrintMembershipBalanceInMerchantCopyCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Print_Membership_Balance_MerchantCopy_ChkBox);
	}
	@Given("I Unselect Print GC Balance Check Box in Customer Copy")
	public void iUnselectPrintGCBalanceCheckBoxInCustomerCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		  cmp.Deselect_CheckBox(fert.Print_GC_Balance_CustomerCopy_ChkBox_SLD,fert.Print_GC_Balance_CustomerCopy_ChkBox);
	}
	@Given("I Unselect Print HA Balance Check Box in Customer Copy")
	public void iUnselectPrintHABalanceCheckBoxInCustomerCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		  cmp.Deselect_CheckBox(fert.Print_HA_Balance_CustomerCopy_ChkBox_SLD,fert.Print_HA_Balance_CustomerCopy_ChkBox);
	}
	@Given("I Unselect Print Membership Balance Check Box in Customer Copy")
	public void iUnselectPrintMembershipBalanceCheckBoxInCustomerCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		  cmp.Deselect_CheckBox(fert.Print_Membership_Balance_CustomerCopy_ChkBox_SLD,fert.Print_Membership_Balance_CustomerCopy_ChkBox);
	}
	@Then("Check Print GC Balance Check Box in Customer Copy is Unselected")
	public void checkPrintGCBalanceCheckBoxInCustomerCopyIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_False_Element_Not_Selected(fert.Print_GC_Balance_CustomerCopy_ChkBox);
	}
	@Then("Check Print HA Balance Check Box in Customer Copy is Unselected")
	public void checkPrintHABalanceCheckBoxInCustomerCopyIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_False_Element_Not_Selected(fert.Print_HA_Balance_CustomerCopy_ChkBox);
	}
	@Then("Check Print Membership Balance in Customer Copy Check Box is Unselected")
	public void checkPrintMembershipBalanceInCustomerCopyCheckBoxIsUnselected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_False_Element_Not_Selected(fert.Print_Membership_Balance_CustomerCopy_ChkBox);
	}
	@Given("I Select Print GC Balance Check Box in Customer Copy")
	public void iSelectPrintGCBalanceCheckBoxInCustomerCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Print_GC_Balance_CustomerCopy_ChkBox_SLD,fert.Print_GC_Balance_CustomerCopy_ChkBox);
	}
	@Given("I Select Print HA Balance Check Box in Customer Copy")
	public void iSelectPrintHABalanceCheckBoxInCustomerCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Print_HA_Balance_CustomerCopy_ChkBox_SLD,fert.Print_HA_Balance_CustomerCopy_ChkBox);
	}
	@Given("I Select Print Membership Balance Check Box in Customer Copy")
	public void iSelectPrintMembershipBalanceCheckBoxInCustomerCopy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Select_CheckBox(fert.Print_Membership_Balance_CustomerCopy_ChkBox_SLD,fert.Print_Membership_Balance_CustomerCopy_ChkBox);
	}
	@Then("Check Print GC Balance Check Box in Customer Copy is Selected")
	public void checkPrintGCBalanceCheckBoxInCustomerCopyIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Print_GC_Balance_CustomerCopy_ChkBox);
	}
	@Then("Check Print HA Balance Check Box in Customer Copy is Selected")
	public void checkPrintHABalanceCheckBoxInCustomerCopyIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Print_HA_Balance_CustomerCopy_ChkBox);
	}
	@Then("Check Print Membership Balance in Customer Copy Check Box is Selected")
	public void checkPrintMembershipBalanceInCustomerCopyCheckBoxIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(fert.Print_Membership_Balance_CustomerCopy_ChkBox);
	}

	
}
