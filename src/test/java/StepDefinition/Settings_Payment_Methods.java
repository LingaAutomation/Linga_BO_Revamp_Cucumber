package StepDefinition;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.PaymentMethodsPage;
import com.Pages.SaleRecapReport_SettingsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Payment_Methods 
{


	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	PaymentMethodsPage pmpg=new PaymentMethodsPage();
	
	@Given("Open the Settings - Payment Methods Settings home page BaseURL and storeID")
	public void openTheSettingsPaymentMethodsSettingsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Payment Method page
		lgpg.Open_URL(Utility.getProperty("baseURL")+"settings/"+"paymentMethods");
	}
	@Given("Verifying the Settings - Payment Methods Settings Header Page")
	public void verifyingTheSettingsPaymentMethodsSettingsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Payment Methods page loaded or not
		cmp.VerifyMainScreenPageHeader("Payment Methods");	
	}
	@Given("I Click the New Payment Method button")
	public void iClickTheNewPaymentMethodButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
		pmpg.Click_NewPaymentMethod();
	}
	@Then("Verify the New Payment Method Header")
	public void verifyTheNewPaymentMethodHeader() {
	    // Write code here that turns the phrase above into concrete actions
		//Verify the New Payment Method creation screen opened or not 
		cmp.VerifyCreationScreenPageHeader("New Payment Method");
	}
	@Then("Check Add Payment Method Field is Displayed")
	public void checkAddPaymentMethodFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.New_PaymentMethod, "Add Payment Method button");
	}
	@Then("Check Payment Type Field is Displayed")
	public void checkPaymentTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Payment_Type_Column_Field, "Payment Type Column Field");
	}
	@Then("Check Priority in Table Field is Displayed")
	public void checkPriorityInTableFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Priority_Column_Field, "Priority Column Field");
	}
	@Then("Check Amount in Table Field is Displayed")
	public void checkAmountInTableFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Amount_Column_Field, "Amount Column Field");
	}
	@Then("Check Open Cash Drawer Field in Table is Displayed")
	public void checkOpenCashDrawerFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Open_Cash_Drawer_Column_Field, "Open Cash Drawer Column Field");
	}
	@Then("Check Actions Field in Table is Displayed")
	public void checkActionsFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Actions_Column_Field, "Actions Column Field");
	}

	@Given("I Enter the Payment Method Name Exceeding the limit")
	public void iEnterThePaymentMethodNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}
	@Given("I Select Payment Type as Cash")
	public void iSelectPaymentTypeAsCash() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(pmpg.PaymentType_Inputbox, "Cash", "Payment Type selected as Cash");
	}
	@Given("I Enter the Payment Method Name")
	public void iEnterThePaymentMethodName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Cash_Payment_Name"));
	}
	@Given("I Enable Multi Currency Toggle")
	public void iEnableMultiCurrencyToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    pmpg.Enable_MultiCurrency_YesToggle.click();
	}
	@Given("I Select the Currency")
	public void iSelectTheCurrency() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.Click_DropDown_withSearch(pmpg.Currency_Inputbox, "Currency Selected");
	}
	@Given("I Enable Open Cash Drawer Toggle")
	public void iEnableOpenCashDrawerToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    pmpg.Open_CashDrawer_YesToggle.click();
	}
	@Given("I Enable Exempt Surcharge Toggle")
	public void iEnableExemptSurchargeToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    pmpg.Exempt_Surcharge_YesToggle.click();
	}
	@Then("Verify whether Payment Method is Saved or Not")
	public void verifyWhetherPaymentMethodIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Payment Methods Saved");
	}
	@Given("I Search and Edit the Payment Method")
	public void iSearchAndEditThePaymentMethod() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit(Utility.getProperty("Cash_Payment_Name"));
	}
	@When("Verify the Update Payment Method Header")
	public void verifyTheUpdatePaymentMethodHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Payment Method");
	}
	@Then("I Verify Payment Method Update screen Close or not")
	public void iVerifyPaymentMethodUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Check whether the New Payment Method Creation form Closed or not
		cmp.Verify_Close_Cancel_CreationScreen("Update Payment Method");
	}
	@Given("I Enter the Exchange Rate")
	public void iEnterTheExchangeRate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(pmpg.Exchange_Inputbox, "8000", "Exchange Rate Entered");
	}
	@Then("Verify whether Payment Method is Updated or Not")
	public void verifyWhetherPaymentMethodIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Payment Methods Updated");
	}
	@Then("Check Open Cash Drawer Toggle is Enabled")
	public void checkOpenCashDrawerToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(pmpg.Open_CashDrawer_YesToggle);
	}
	@Then("Check Exempt Surcharge Toggle is Enabled")
	public void checkExemptSurchargeToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(pmpg.Exempt_Surcharge_YesToggle);
	}
	@Then("I Disable Open Cash Drawer Toggle")
	public void iDisableOpenCashDrawerToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    pmpg.Open_CashDrawer_NoToggle.click();
	}
	@Then("I Disable Exempt Surcharge Toggle")
	public void iDisableExemptSurchargeToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   Thread.sleep(1000);
		    pmpg.Exempt_Surcharge_NoToggle.click();
	}
	@Given("I Select Payment Type as Gift Card")
	public void iSelectPaymentTypeAsGiftCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Gift Card", "Payment Type selected as Gift Card");
	}
	@Then("Check Enable Multi Currency Toggle is Not Displayed")
	public void checkEnableMultiCurrencyToggleIsNotDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Not_Displayed(pmpg.Enable_MultiCurrency_YesToggle, "Enable Multi Currency Toggle");
	}
	@Then("Check Selected Payment Type as Gift Card")
	public void checkSelectedPaymentTypeAsGiftCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Gift Card", "Gift Card Payment Type selected as Expected");
	    
	}
	@Then("I Select Payment Type as Credit Card")
	public void iSelectPaymentTypeAsCreditCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Credit Card", "Payment Type selected as Credit Card");
	}
	@Then("Check Debit Toggle is Displayed")
	public void checkDebitToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Debit_YesToggle, "Debit Toggle");
	}
	@Then("I Enable Debit Toggle")
	public void iEnableDebitToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	   pmpg.Debit_YesToggle.click();
	}
	@Then("Check Exempt Surcharge Toggle is Disabled")
	public void checkExemptSurchargeToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Exempt_Surcharge_YesToggle, "Exempt Surcharge Toggle");
	}
	@Then("I Disable Debit Toggle")
	public void iDisableDebitToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(1000);
		   pmpg.Debit_NoToggle.click();
	}
	@Then("Check Selected Payment Type as Credit Card")
	public void checkSelectedPaymentTypeAsCreditCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Credit Card", "Credit Card Payment Type selected as Expected");
	  
	}
	@Then("I Select Payment Type as Side CC")
	public void iSelectPaymentTypeAsSideCC() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Side CC", "Payment Type selected as Side CC");
	}
	@Then("Check Enable Multi Currency Toggle is Displayed")
	public void checkEnableMultiCurrencyToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Enable_MultiCurrency_YesToggle, "Enable Multi Currency Toggle");

	}

	@Then("Check Open Cash Drawer Toggle is Displayed")
	public void checkOpenCashDrawerToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Open_CashDrawer_YesToggle, "Open Cash Drawer Toggle");
	}
	@Then("Check Exempt Surcharge Toggle is Displayed")
	public void checkExemptSurchargeToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Exempt_Surcharge_YesToggle, "Exempt Surcharge Toggle");

	}
	@Then("Check Selected Payment Type as Side CC")
	public void checkSelectedPaymentTypeAsSideCC() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Side CC", "Side CC Payment Type selected as Expected");

	}
	@Then("Check Enable Multi Currency Toggle is Enabled")
	public void checkEnableMultiCurrencyToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.Assertion_Validation_True_Element_Selected(pmpg.Enable_MultiCurrency_YesToggle);
	}
	@Then("I Disable Multi Currency Toggle")
	public void iDisableMultiCurrencyToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    pmpg.Enable_MultiCurrency_NoToggle.click();
	}
	@Then("Check Enable Multi Currency Toggle is Disabled")
	public void checkEnableMultiCurrencyToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_False_Element_Not_Selected(pmpg.Enable_MultiCurrency_YesToggle);
		   
	}
	@Then("I Select Payment Type as Bionet Meal Card")
	public void iSelectPaymentTypeAsBionetMealCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Bionet Meal Card", "Payment Type selected as Bionet Meal Card");
	}
	@Then("Check Selected Payment Type as Bionet Meal Card")
	public void checkSelectedPaymentTypeAsBionetMealCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Bionet Meal Card", "Bionet Meal Card Payment Type selected as Expected");
	}
	@Then("I Select Payment Type as Castle and Go")
	public void iSelectPaymentTypeAsCastleAndGo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Castle And Go", "Payment Type selected as Castle And Go");
	}
	@Then("Check Selected Payment Type as Castle and Go")
	public void checkSelectedPaymentTypeAsCastleAndGo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Castle And Go", "Castle And Go Payment Type selected as Expected");
	}
	@Then("I Select Payment Type as SPPax")
	public void iSelectPaymentTypeAsSPPax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "SPPax", "Payment Type selected as SPPax");
	}
	@Then("Check Model Type Field is Displayed")
	public void checkModelTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Model_TypeInputbox, "Model Type Field");
	}
	@Then("Check Enable EBT Toggle is Displayed")
	public void checkEnableEBTToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Enable_EBT_YesToggle, "Enable EBT Toggle");
	}
	@Then("Check Factor4 Cards Toggle is Displayed")
	public void checkFactor4CardsToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Factor4Cards_YesToggle, "Factor4 Cards Toggle");
	}
	@Then("Check Valutec Cards Toggle is Displayed")
	public void checkValutecCardsToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(pmpg.Valutec_Cards_YesToggle, "Valutec Cards Toggle");

	}
	@Then("I Enable EBT Toggle")
	public void iEnableEBTToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    pmpg.Enable_EBT_YesToggle.click();
	}
	@Then("I Enable Valutec Cards Toggle")
	public void iEnableValutecCardsToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    pmpg.Valutec_Cards_YesToggle.click();
	}
	@Then("Check Selected Payment Type as SPPax")
	public void checkSelectedPaymentTypeAsSPPax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "SPPax", "SPPax Payment Type selected as Expected");

	}
	@Then("Check Enable EBT Toggle is Enabled")
	public void checkEnableEBTToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(pmpg.Enable_EBT_YesToggle);
	}
	@Then("Check Valutec Cards Toggle is Enabled")
	public void checkValutecCardsToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(pmpg.Valutec_Cards_YesToggle);
	}
	@Then("I Enable Factor4 Cards Toggle")
	public void iEnableFactor4CardsToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    pmpg.Factor4Cards_YesToggle.click();
	}
	@Then("Check Enable EBT Toggle is Disabled")
	public void checkEnableEBTToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(pmpg.Enable_EBT_YesToggle);
	}
	@Then("Check Enable Valutec Cards Toggle is Disabled")
	public void checkEnableValutecCardsToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(pmpg.Valutec_Cards_YesToggle);
	}
	@Then("Check Factor4 Cards Toggle is Enabled")
	public void checkFactor4CardsToggleIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(pmpg.Factor4Cards_YesToggle);
	}
	@Then("Check Factor4 Cards Toggle is Disabled")
	public void checkFactor4CardsToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(pmpg.Factor4Cards_YesToggle);
	}
	@Then("I Disable Enable EBT Toggle")
	public void iDisableEnableEBTToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    pmpg.Enable_EBT_NoToggle.click();
	}
	@Then("I Disable Factor4 Cards Toggle")
	public void iDisableFactor4CardsToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    pmpg.Factor4Cards_NoToggle.click();
	}
	@Then("I Disable Valutec Cards Toggle")
	public void iDisableValutecCardsToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    pmpg.Valutec_Cards_NoToggle.click();
	}

	@Then("Check Valutec Cards Toggle is Disabled")
	public void checkValutecCardsToggleIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element_Not_Selected(pmpg.Valutec_Cards_YesToggle);
	}
	@Then("I Select Payment Type as Others")
	public void iSelectPaymentTypeAsOthers() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Others", "Payment Type selected as Others");
	}
	@Then("Check Selected Payment Type as Others")
	public void checkSelectedPaymentTypeAsOthers() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Others", "Others Payment Type selected as Expected");

	}
	@Then("I Select Payment Type as GiveX")
	public void iSelectPaymentTypeAsGiveX() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "GiveX", "GiveX selected as Payment Type");
	}
	@Then("Check Selected Payment Type as GiveX")
	public void checkSelectedPaymentTypeAsGiveX() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "GiveX", "GiveX Payment Type selected as Expected");

	}
	@Then("I Select Payment Type as HA Payment")
	public void iSelectPaymentTypeAsHAPayment() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "HAPayment", "HA Payment selected as Payment Type");
	}
	@Then("Check Selected Payment Type as HA Payment")
	public void checkSelectedPaymentTypeAsHAPayment() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "HAPayment", "HA Payment is Payment Type selected as Expected");

	}
	@Then("I Select Payment Type as NMI Tokenization")
	public void iSelectPaymentTypeAsNMITokenization() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "NMI Tokenizatio", "NMI Tokenizatio selected as Payment Type");
	}
	@Then("Check Selected Payment Type as NMI Tokenization")
	public void checkSelectedPaymentTypeAsNMITokenization() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "NMI Tokenizatio", "NMI Tokenizatio Payment Type selected as Expected");

	}
	@Then("I Select Payment Type as Dejavoo")
	public void iSelectPaymentTypeAsDejavoo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Dejavoo", "Dejavoo selected as Payment Type");
	}
	@Then("Check Selected Payment Type as Dejavoo")
	public void checkSelectedPaymentTypeAsDejavoo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Dejavoo", "Dejavoo Payment Type selected as Expected");

	}
	@Then("I Select Payment Type as Optomany")
	public void iSelectPaymentTypeAsOptomany() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Optomany", "Optomany selected as Payment Type");
	}
	@Then("Check Selected Payment Type as Optomany")
	public void checkSelectedPaymentTypeAsOptomany() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Optomany", "Optomany Payment Type selected as Expected");

	}
	@Then("I Select Payment Type as MPPG Credit Card")
	public void iSelectPaymentTypeAsMPPGCreditCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "MPPG Credit Card", "MPPG Credit Card selected as Payment Type");
	}
	@Then("I Select Type as Authorize")
	public void iSelectTypeAsAuthorize() {
	    // Write code here that turns the phrase above into concrete actions
	    pmpg.Authorize_DebitInMPPGCard_RadioButton.click();
	}
	@Then("Check Selected Payment Type as MPPG Credit Card")
	public void checkSelectedPaymentTypeAsMPPGCreditCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "MPPG Credit Card", "MPPG Credit Card Payment Type selected as Expected");

	}
	@Then("Check Type is Selected as Authorize")
	public void checkTypeIsSelectedAsAuthorize() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(pmpg.Authorize_DebitInMPPGCard_RadioButton);
	}
	@Then("I Select Type as Sale")
	public void iSelectTypeAsSale() {
	    // Write code here that turns the phrase above into concrete actions
	    pmpg.Sale_DebitInMPPGCard_RadioButton.click();
	}
	
	@Then("Check Type is Selected as Sale")
	public void checkTypeIsSelectedAsSale() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(pmpg.Sale_DebitInMPPGCard_RadioButton);
	}
	@Then("I Select Payment Type as Ingenico")
	public void iSelectPaymentTypeAsIngenico() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(pmpg.PaymentType_Inputbox, "Ingenico", "Ingenico selected as Payment Type");
	}
	@Then("Check Selected Payment Type as Ingenico")
	public void checkSelectedPaymentTypeAsIngenico() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    String PayType=pmpg.PaymentType_Inputbox.getAttribute("value");
	    
	    cmp.Assertion_Validation_Two_Values(PayType, "Ingenico", "Ingenico Payment Type selected as Expected");

	}
	@Given("I Enter the Payment Method Name for Gift Card")
	public void iEnterThePaymentMethodNameForGiftCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		//Enter the Name
		cmp.EnterName(Utility.getProperty("Gift_Card_Payment_Name"));
	}
	@Given("I Enter the Payment Method Name for Credit Card")
	public void iEnterThePaymentMethodNameForCreditCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		//Enter the Name
		cmp.EnterName(Utility.getProperty("Credit_Card_Payment_Name"));
	}
	@Given("I Enter the Payment Method Name for Side CC")
	public void iEnterThePaymentMethodNameForSideCC() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		//Enter the Name
		cmp.EnterName(Utility.getProperty("SideCC_Payment_Name"));
	}
	@Given("I Enter the Payment Method Name for Bionet Meal Card")
	public void iEnterThePaymentMethodNameForBionetMealCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		//Enter the Name
		cmp.EnterName(Utility.getProperty("Bionet_Meal_Card_Payment_Name"));
	}
	@Then("Check Name Already Exist Error in Name Field is Displayed")
	public void checkNameAlreadyExistErrorInNameFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(cmp.Name_Already_Exist_ErrorMsg, "Name Already Exist Error");
	}

	
	@Then("Verify whether Duplicate Payment Method is Saved or Not")
	public void verifyWhetherDuplicatePaymentMethodIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Coursing Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Payment Method Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Payment Methods Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Duplicate Payment Method Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Payment Method Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Search the Payment Method and Click the Delete button")
	public void iSearchThePaymentMethodAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.SearchAndClickDelete(Utility.getProperty("Cash_Payment_Name"));
		    
		    
		    Thread.sleep(500);
			//Click the Delete button
			cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Payment Method Deleted or not")
	public void verifyTheCancelledPaymentMethodDeletedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Payment Methods Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Payment Method Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Payment Method not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verifying the Payment Method Deleted or not")
	public void iVerifyingThePaymentMethodDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("Payment Methods Deleted");
	}

}
