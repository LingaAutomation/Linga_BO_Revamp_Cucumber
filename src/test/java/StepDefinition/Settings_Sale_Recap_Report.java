package StepDefinition;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.SaleRecapReport_SettingsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Sale_Recap_Report 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	SaleRecapReport_SettingsPage srcr=new SaleRecapReport_SettingsPage(); 
	
	@Given("Open the Settings - Sale Recap Report Settings home page BaseURL and storeID")
	public void openTheSettingsSaleRecapReportSettingsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Payment Method page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"salesRecapReport");
	}
	@Given("Verifying the Settings - Sale Recap Report Settings Header Page")
	public void verifyingTheSettingsSaleRecapReportSettingsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Sales Recap Report page loaded or not
		cmp.VerifyMainScreenPageHeader("Sales Recap Report");
	}
	@Given("Check Guest\\/Checks Toggle is Displayed")
	public void checkGuestChecksToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Genaral_Tab_inContents.click();
	    cmp.Check_Element_or_Text_Displayed(srcr.Guest_Checks_YesBtn, "Guest/Checks Toggle");
	}
	@Given("Check Cover Toggle is Displayed")
	public void checkCoverToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Cover_YesBtn, "Cover Toggle");
	}
	@Given("Check Grand Sales Toggle is Displayed")
	public void checkGrandSalesToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Grand_Sales_YesBtn, "Grand Sales Toggle");
	}
	@Given("Check Gross Receipt Toggle is Displayed")
	public void checkGrossReceiptToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Gross_Receipt_YesBtn, "Gross Toggle");
	}
	@Given("Check Gross Void Toggle is Displayed")
	public void checkGrossVoidToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Gross_Void_YesBtn, "Gross Void Toggle");
	}
	@Given("Check Net Void Toggle is Displayed")
	public void checkNetVoidToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Net_Void_YesBtn, "Net Void Toggle");
	}
	@Given("Check CC Split Up Toggle is Displayed")
	public void checkCCSplitUpToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.CC_SplitUp_YesBtn, "CC Split Up Toggle");
	}
	@Given("Check Other Payments Split Up Toggle is Displayed")
	public void checkOtherPaymentsSplitUpToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.OtherPayments_SplitUp_YesBtn, "Other Payment Split Up Toggle");
	}
	@Given("Check Payment Name as System Defined")
	public void checkPaymentNameAsSystemDefined() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.SystemDefined_PaymentNameBtn, "System Defined Payment Name");
	}
	@Given("Check Payment Name as User Defined")
	public void checkPaymentNameAsUserDefined() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.UserDefined_PaymentNameBtn, "User Defined Payment Name");
	}
	@Given("Check Tax Split Up Toggle is Displayed")
	public void checkTaxSplitUpToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Tax_Tab_inContents.click();
		cmp.Check_Element_or_Text_Displayed(srcr.Tax_SplitUp_YesBtn, "Tax Split Up Toggle");
	}
	@Given("Check Tax Exempt Toggle is Displayed")
	public void checkTaxExemptToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Tax_Exempt_YesBtn, "Tax Exempt Toggle");
	}
	@Given("Check Tax with Net Sales Toggle is Displayed")
	public void checkTaxWithNetSalesToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Taxwith_NetSales_YesBtn, "Tax with Net Sales Toggle");
	}
	@Given("Check Opening Balance Toggle is Displayed")
	public void checkOpeningBalanceToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Summary_Tab_inContents.click();
		cmp.Check_Element_or_Text_Displayed(srcr.OpeningBalance_YesBtn, "Opening Balance Toggle");
	}
	@Given("Check Paid In\\/Out Toggle is Displayed")
	public void checkPaidInOutToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.PaidIn_Out_YesBtn, "Paid In/Out Toggle");
	}
	@Given("Check Cash Drop Toggle is Displayed")
	public void checkCashDropToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Cash_Drop_YesBtn, "Cash Drop Toggle");
	}
	@Given("Check Cash Expected in Summary Toggle is Displayed")
	public void checkCashExpectedInSummaryToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Summary_Tab_inContents.click();
		
		cmp.Check_Element_or_Text_Displayed(srcr.Cash_Expected_Summary_YesBtn, "Cash Expeced in Summary Toggle");
	}
	@Given("Check Over\\/Shortage in Summary Toggle is Displayed")
	public void checkOverShortageInSummaryToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Over_Shortage_Summary_YesBtn, "Over/Shortage in Summary Toggle");
	}
	@Given("Check Cash Expected in Formula Definition Toggle is Displayed")
	public void checkCashExpectedInFormulaDefinitionToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Cash_Expected_FormulaDef_YesBtn, "Cash Expected in Formula Definition Toggle");
	}
	@Given("Check Overage\\/Shortage in Formula Definition Toggle is Displayed")
	public void checkOverageShortageInFormulaDefinitionToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Over_Shortage_Summary_FormulaDef_YesBtn, "Overage/Shortage in Formula Definition Toggle");
	}
	@Given("Check Department Summary Toggle is Displayed")
	public void checkDepartmentSummaryToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Other_Summaries_Tab_inContents.click();
		
		cmp.Check_Element_or_Text_Displayed(srcr.Department_Summary_YesBtn, "Department Summary Toggle");
	}
	@Given("Check Category Summary Toggle is Displayed")
	public void checkCategorySummaryToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Category_Summary_YesBtn, "Category Summary Toggle");
	}
	@Given("Check Hourly Summary Toggle is Displayed")
	public void checkHourlySummaryToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.Hourly_Summary_YesBtn, "Hourly Summary Toggle");
	}
	@Given("Check Include Credits in Daily Summary Report Toggle is Displayed")
	public void checkIncludeCreditsInDailySummaryReportToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(srcr.IncludeCredits_in_DailySummaryReport_YesBtn(), "Include Credits in Daily Summary Report Toggle");
	}
	@Given("I Disable Guest\\/Checks Toggle")
	public void iDisableGuestChecksToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Genaral_Tab_inContents.click();
	    srcr.Disable_GuestChecks();
	}
	@Given("I Enable Cover Toggle")
	public void iEnableCoverToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Cover();
	}
	@Then("Check Level Type as Category is Displayed")
	public void checkLevelTypeAsCategoryIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(srcr.Category_LevelTypeBtn, "Category Level Type");
	}
	@Then("Check Level Type as SubCategory is Displayed")
	public void checkLevelTypeAsSubCategoryIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(srcr.SubCategory_LevelTypeBtn, "Sub-Category Level Type");
	}
	@Then("Check Level Type as Menu Item is Displayed")
	public void checkLevelTypeAsMenuItemIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(srcr.MenuItems_LevelTypeBtn, "Menu Items Level Type");
	}
	@Then("I Disable Cover Toggle")
	public void iDisableCoverToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Cover();
	}
	@Then("Check the Update button is Enabled")
	public void checkTheUpdateButtonIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Button_Enabled(cmp.Update_Button(), "Update button");
	}
	@Then("Verify Sale Recap Report Settings Updated or Not")
	public void verifySaleRecapReportSettingsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Sale Recap Report Settings Updated");
	}
	@Given("I Refresh the Page")
	public void iRefreshThePage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    driver.navigate().refresh();
	    Thread.sleep(5000);
	}
	
	@Then("Check the Update buttonTwo is Disabled")
	public void checkTheUpdateButtonTwoIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Button_Disabled(cmp.Update_ButtonTwo(), "Update button");
	}
	
	@Then("Check the Update buttonTwo is Enabled")
	public void checkTheUpdateButtonTwoIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Button_Enabled(cmp.Update_ButtonTwo(), "Update button");
	}
	@Then("I Click the Update buttonTwo")
	public void iClickTheUpdateButtonTwo() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_Update_ButtonTwo();
	}

	
	@Then("Check Guest\\/Checks Toggle is Disabled")
	public void checkGuestChecksToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Guest_Checks_YesBtn);
	}
	@Then("Check Cover Toggle is Disabled")
	public void checkCoverToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Cover_YesBtn);
	}
	@Then("I Disable Grand Sales Toggle")
	public void iDisableGrandSalesToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Sales_Tab_inContents.click();
	   srcr.Disable_Grand_Sales();
	}
	@Then("I Disable Gross Receipt Toggle")
	public void iDisableGrossReceiptToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   srcr.Disable_Gross_Receipt();
	}
	@Then("I Disable Gross Void Toggle")
	public void iDisableGrossVoidToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Gross_Void();
	}
	@Then("I Disable Net Void Toggle")
	public void iDisableNetVoidToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Net_Void();
	}
	@Then("Check Grand Sales Toggle is Disabled")
	public void checkGrandSalesToggleIsDisabled() {
		cmp.Sales_Tab_inContents.click();
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Grand_Sales_YesBtn);
	}
	@Then("Check Gross Receipt Toggle is Disabled")
	public void checkGrossReceiptToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Gross_Receipt_YesBtn);
	}
	@Then("Check Gross Void Toggle is Disabled")
	public void checkGrossVoidToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Gross_Void_YesBtn);
	}
	@Then("Check Net Void Toggle is Disabled")
	public void checkNetVoidToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Net_Void_YesBtn);
	}
	@Then("I Disable CC Split Up Toggle")
	public void iDisableCCSplitUpToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_CC_SplitUp();
	}
	@Then("I Disable Other Payments Split Up Toggle")
	public void iDisableOtherPaymentsSplitUpToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_OtherPayments_SplitUp();
	}
	@Then("I Select Payment Name as System Defined")
	public void iSelectPaymentNameAsSystemDefined() {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.SystemDefined_PaymentNameBtn.click();
	}
	@Then("Check CC Split Up Toggle is Disabled")
	public void checkCCSplitUpToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.CC_SplitUp_YesBtn);
	}
	@Then("Check Other Payments Split Up Toggle is Disabled")
	public void checkOtherPaymentsSplitUpToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.OtherPayments_SplitUp_YesBtn);
	}
	@Then("Check Payment Name Selected as System Defined")
	public void checkPaymentNameSelectedAsSystemDefined() {
	    // Write code here that turns the phrase above into concrete actions
//		 cmp.Assertion_Validation_True_Element_Selected(srcr.SystemDefined_PaymentNameBtn);
		cmp.Assertion_Validation_True_Element_Enabled(srcr.SystemDefined_PaymentNameBtn);
	}
	@Then("I Disable Tax Split Up Toggle")
	public void iDisableTaxSplitUpToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Tax_Tab_inContents.click();
		
	    srcr.Disable_Tax_SplitUp();
	}
	@Then("I Disable Tax Exempt Toggle")
	public void iDisableTaxExemptToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Tax_Exempt();
	}
	@Then("Check Tax with Net Sales Toggle is Not Displayed")
	public void checkTaxWithNetSalesToggleIsNotDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.Check_Element_or_Text_Not_Displayed(srcr.Taxwith_NetSales_YesBtn, "Tax with Net Sales Toggle");
	}
	@Then("Check Tax Split Up Toggle is Disabled")
	public void checkTaxSplitUpToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Tax_Tab_inContents.click();
		
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Tax_SplitUp_YesBtn);
	}
	@Then("Check Tax Exempt Toggle is Disabled")
	public void checkTaxExemptToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Tax_Exempt_YesBtn);
	}
	@Then("Check Tax with Net Sales Toggle is Disabled")
	public void checkTaxWithNetSalesToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Taxwith_NetSales_YesBtn);
	}
	@Then("I Disable Opening Balance Toggle")
	public void iDisableOpeningBalanceToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_OpeningBalance();
	}
	@Then("I Disable Paid In\\/Out Toggle")
	public void iDisablePaidInOutToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   srcr.Disable_PaidIn_Out();
	}
	@Then("I Disable Cash Drop Toggle")
	public void iDisableCashDropToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Cash_Drop();
	}
	@Then("I Disable Cash Expected in Summary Toggle")
	public void iDisableCashExpectedInSummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Summary_Tab_inContents.click();
	    srcr.Disable_Cash_Expected_Summary();
	}
	@Then("I Disable Over\\/Shortage in Summary Toggle")
	public void iDisableOverShortageInSummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Over_Shortage_Summary();
	}
	@Then("Check Opening Balance Toggle is Disabled")
	public void checkOpeningBalanceToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.OpeningBalance_YesBtn);
	}
	@Then("Check Paid In\\/Out Toggle is Disabled")
	public void checkPaidInOutToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.PaidIn_Out_YesBtn);
	}
	@Then("Check Cash Drop Toggle is Disabled")
	public void checkCashDropToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Cash_Drop_YesBtn);
	}
	@Then("Check Cash Expected in Summary Toggle is Disabled")
	public void checkCashExpectedInSummaryToggleIsDisabled() {
		cmp.Summary_Tab_inContents.click();
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Cash_Expected_Summary_YesBtn);
	}
	@Then("Check Over\\/Shortage Toggle in Summary is Disabled")
	public void checkOverShortageToggleInSummaryIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Over_Shortage_Summary_YesBtn);
	}
	@Then("I Disable Cash Expected in Formula Definition Toggle")
	public void iDisableCashExpectedInFormulaDefinitionToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 srcr.Disable_Cash_Expected_FormulaDef();
	}
	@Then("I Disable Over\\/Shortage in Formula Definition Toggle")
	public void iDisableOverShortageInFormulaDefinitionToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Over_Shortage_Summary_FormulaDef();
	}
	@Then("Check Cash Expected in Formula Definition Toggle is Disabled")
	public void checkCashExpectedInFormulaDefinitionToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Cash_Expected_FormulaDef_YesBtn);
	}
	@Then("Check Over\\/Shortage Toggle in Formula Definition is Disabled")
	public void checkOverShortageToggleInFormulaDefinitionIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Over_Shortage_Summary_FormulaDef_YesBtn);
	}
	@Then("I Disable Department Summary Toggle")
	public void iDisableDepartmentSummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Other_Summaries_Tab_inContents.click();
	    srcr.Disable_Department_Summary();
	}
	@Then("I Disable Category Summary Toggle")
	public void iDisableCategorySummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Category_Summary();
	}
	@Then("I Disable Hourly Summary Toggle")
	public void iDisableHourlySummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_Hourly_Summary();
	}
	@Then("I Disable Include Credits in Daily Summary Report Toggle")
	public void iDisableIncludeCreditsInDailySummaryReportToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Disable_IncludeCredits_in_DailySummaryReport();
	}
	@Then("Check Department Summary Toggle is Disabled")
	public void checkDepartmentSummaryToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Department_Summary_YesBtn);
	}
	@Then("Check Category Summary Toggle is Disabled")
	public void checkCategorySummaryToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Category_Summary_YesBtn);
	}
	@Then("Check Hourly Summary Toggle is Disabled")
	public void checkHourlySummaryToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.Hourly_Summary_YesBtn);
	}
	@Then("Check Include Credits in Daily Summary Report is Disabled")
	public void checkIncludeCreditsInDailySummaryReportIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_False_Element_Not_Selected(srcr.IncludeCredits_in_DailySummaryReport_YesBtn);
	}
	@Then("I Enable Guest\\/Checks Toggle")
	public void iEnableGuestChecksToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Genaral_Tab_inContents.click();
	    srcr.Enable_GuestChecks();
	}
	@Then("Check Guest\\/Checks Toggle is Enabled")
	public void checkGuestChecksToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Guest_Checks_YesBtn);
	}
	@Then("Check Cover Toggle is Enabled")
	public void checkCoverToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    srcr.Enable_Cover();
		cmp.Assertion_Validation_True_Element_Enabled(srcr.Cover_YesBtn);
	}
	@Then("I Enable Grand Sales Toggle")
	public void iEnableGrandSalesToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Sales_Tab_inContents.click();
	    srcr.Enable_Grand_Sales();
	}
	@Then("I Enable Gross Receipt Toggle")
	public void iEnableGrossReceiptToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   srcr.Enable_Gross_Receipt();
	}
	@Then("I Enable Gross Void Toggle")
	public void iEnableGrossVoidToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Gross_Void();
	}
	@Then("I Enable Net Void Toggle")
	public void iEnableNetVoidToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Net_Void();
	}
	@Then("Check Grand Sales Toggle is Enabled")
	public void checkGrandSalesToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Grand_Sales_YesBtn);
	}
	@Then("Check Gross Receipt Toggle is Enabled")
	public void checkGrossReceiptToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Gross_Receipt_YesBtn);
	}
	@Then("Check Gross Void Toggle is Enabled")
	public void checkGrossVoidToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Gross_Void_YesBtn);
	}
	@Then("Check Net Void Toggle is Enabled")
	public void checkNetVoidToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Net_Void_YesBtn);
	}
	@Then("I Enable CC Split Up Toggle")
	public void iEnableCCSplitUpToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 srcr.Enable_CC_SplitUp();
	}
	@Then("I Enable Other Payments Split Up Toggle")
	public void iEnableOtherPaymentsSplitUpToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_OtherPayments_SplitUp();
	}
	@Then("I Select Payment Name as User Defined")
	public void iSelectPaymentNameAsUserDefined() {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.UserDefined_PaymentNameBtn.click();
	}
	@Then("Check CC Split Up Toggle is Enabled")
	public void checkCCSplitUpToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.CC_SplitUp_YesBtn);
	}
	@Then("Check Other Payments Split Up Toggle is Enabled")
	public void checkOtherPaymentsSplitUpToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.OtherPayments_SplitUp_YesBtn);
	}
	@Then("Check Payment Name Selected as User Defined")
	public void checkPaymentNameSelectedAsUserDefined() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.UserDefined_PaymentNameBtn);
	}
	@Then("I Enable Tax Split Up Toggle")
	public void iEnableTaxSplitUpToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Tax_Tab_inContents.click();
	    srcr.Enable_Tax_SplitUp();
	}
	@Then("I Enable Tax Exempt Toggle")
	public void iEnableTaxExemptToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Tax_Exempt();
	}
	@Then("I Enable Tax with Net Sales Toggle")
	public void iEnableTaxWithNetSalesToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Taxwith_NetSales();
	}
	@Then("Check Tax Split Up Toggle is Enabled")
	public void checkTaxSplitUpToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Tax_SplitUp_YesBtn);
	}
	@Then("Check Tax Exempt Toggle is Enabled")
	public void checkTaxExemptToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Tax_Exempt_YesBtn);
	}
	@Then("Check Tax with Net Sales Toggle is Enabled")
	public void checkTaxWithNetSalesToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Taxwith_NetSales_YesBtn);
	}
	@Then("I Enable Opening Balance Toggle")
	public void iEnableOpeningBalanceToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Summary_Tab_inContents.click();
	    srcr.Enable_OpeningBalance();
	}
	@Then("I Enable Paid In\\/Out Toggle")
	public void iEnablePaidInOutToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_PaidIn_Out();
	}
	@Then("I Enable Cash Drop Toggle")
	public void iEnableCashDropToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Cash_Drop();
	}
	@Then("I Enable Cash Expected in Summary Toggle")
	public void iEnableCashExpectedInSummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Cash_Expected_Summary();
	}
	@Then("I Enable Over\\/Shortage in Summary Toggle")
	public void iEnableOverShortageInSummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Over_Shortage_Summary();
	}
	@Then("Check Opening Balance Toggle is Enabled")
	public void checkOpeningBalanceToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Summary_Tab_inContents.click();
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.OpeningBalance_YesBtn);
	}
	@Then("Check Paid In\\/Out Toggle is Enabled")
	public void checkPaidInOutToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.PaidIn_Out_YesBtn);
	}
	@Then("Check Cash Drop Toggle is Enabled")
	public void checkCashDropToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Cash_Drop_YesBtn);
	}
	@Then("Check Cash Expected in Summary Toggle is Enabled")
	public void checkCashExpectedInSummaryToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Cash_Expected_Summary_YesBtn);
	}
	@Then("Check Over\\/Shortage Toggle in Summary is Enabled")
	public void checkOverShortageToggleInSummaryIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Over_Shortage_Summary_YesBtn);
	}
	@Then("I Enable Cash Expected in Formula Definition Toggle")
	public void iEnableCashExpectedInFormulaDefinitionToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Formula_Definition_Tab_inContents.click();
		
		 cmp.Assertion_Validation_True_Element_Enabled(srcr.Cash_Expected_FormulaDef_YesBtn);
	}
	@Then("I Select Add for Cash Expected in Formula Definition")
	public void iSelectAddForCashExpectedInFormulaDefinition() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    srcr.Add_CashExpected_FormulaDefintion();
		cmp.Click_DropDown_withSearch_MultipleSelection(srcr.Cash_Expected_AddInputBox, "Selected Add for Cash Expected in Formula Definition");
	}
	@Then("I Select Subtract for Cash Expected in Formula Definition")
	public void iSelectSubtractForCashExpectedInFormulaDefinition() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    srcr.subtr
		cmp.Click_DropDown_withSearch_MultipleSelection(srcr.Cash_Expected_SubtractInputBox, "Selected Subtract for Cash Expected in Formula Definition");

	}
	@Then("I Enable Over\\/Shortage in Formula Definition Toggle")
	public void iEnableOverShortageInFormulaDefinitionToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	    srcr.Enable_Over_Shortage_Summary_FormulaDef();
	}
	@Then("I Select Add for Over\\/Shortage in Formula Definition")
	public void iSelectAddForOverShortageInFormulaDefinition() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSearch_MultipleSelection(srcr.Overage_Shortage_AddInputBox, "Selected Add for Over/Shortage in Formula Definition");

	}
	@Then("I Select Subtract for Over\\/Shortage in Formula Definition")
	public void iSelectSubtractForOverShortageInFormulaDefinition() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSearch_MultipleSelection(srcr.Overage_Shortage_SubtractInputBox, "Selected Subtract for Over/Shortage in Formula Definition");

	}
	@Then("Check Cash Expected in Formula Definition Toggle is Enabled")
	public void checkCashExpectedInFormulaDefinitionToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Check_Toggle_Enabled(null, null);
		cmp.Formula_Definition_Tab_inContents.click();
		
		cmp.Assertion_Validation_True_Element_Selected(srcr.Cash_Expected_FormulaDef_YesBtn);
	}
	@Then("Check Over\\/Shortage Toggle in Formula Definition is Enabled")
	public void checkOverShortageToggleInFormulaDefinitionIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(srcr.Over_Shortage_Summary_FormulaDef_YesBtn);
	}
	@Then("I Enable Department Summary Toggle")
	public void iEnableDepartmentSummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Other_Summaries_Tab_inContents.click();
		
	    srcr.Enable_Department_Summary();
	}
	@Then("I Enable Category Summary Toggle")
	public void iEnableCategorySummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.Enable_Category_Summary();
	}
	@Then("I Enable Hourly Summary Toggle")
	public void iEnableHourlySummaryToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   srcr.Enable_Hourly_Summary();
	}
	@Then("I Enable Include Credits in Daily Summary Report Toggle")
	public void iEnableIncludeCreditsInDailySummaryReportToggle()  throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   srcr.Enable_IncludeCredits_in_DailySummaryReport();
	}
	@Then("Check Department Summary Toggle is Enabled")
	public void checkDepartmentSummaryToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(srcr.Department_Summary_YesBtn);
	}
	@Then("Check Category Summary Toggle is Enabled")
	public void checkCategorySummaryToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(srcr.Category_Summary_YesBtn);
	}
	@Then("Check Hourly Summary Toggle is Enabled")
	public void checkHourlySummaryToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(srcr.Hourly_Summary_YesBtn);
	}
	@Then("Check Include Credits in Daily Summary Report is Enabled")
	public void checkIncludeCreditsInDailySummaryReportIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(srcr.IncludeCredits_in_DailySummaryReport_YesBtn);
	}
	@Then("I Selecting the Sub-Categories")
	public void iSelectingTheSubCategories() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_MultipleSelection(srcr.SubCategory_LevelTypeInputBx, "Sub-Categories Selected");
	}
	@Then("Check Level Type is Selected as SubCategory")
	public void checkLevelTypeIsSelectedAsSubCategory() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(srcr.SubCategory_LevelTypeBtn);
	}
	@Then("I Select the Level Type as Menu Items")
	public void iSelectTheLevelTypeAsMenuItems() {
	    // Write code here that turns the phrase above into concrete actions
	    srcr.MenuItems_LevelTypeBtn.click();
	}
	@Then("I Selecting the Menu Items")
	public void iSelectingTheMenuItems() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_MultipleSelection(srcr.MenuItems_LevelTypeInputBx, "Menu Items Selected");

	}
	@Then("Check Level Type is Selected as Menu Items")
	public void checkLevelTypeIsSelectedAsMenuItems() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Assertion_Validation_True_Element_Selected(srcr.MenuItems_LevelTypeBtn);
	}







}
