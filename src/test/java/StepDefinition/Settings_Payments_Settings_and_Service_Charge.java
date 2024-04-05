package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.PaymentSettingsPage;
import com.Pages.ProductItems_Menu_RetailPage;
import com.Pages.ReportsPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.SubCategoriesPage;
import com.Pages.UpchargesPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Settings_Payments_Settings_and_Service_Charge {

	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
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
	ReportsPage rel=new ReportsPage();
	PaymentSettingsPage sps= new PaymentSettingsPage();
	
@Given("Open the Settings - Payment Settings Home Page BaseURL and storeID")
public void openTheSettingsPaymentSettingsHomePageBaseURLAndStoreID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.openTheSettingsPaymentSettingPageBaseURLAndStoreID();
	try {
	cmp.Close_Online_Help_ChatBox();}
	catch(Exception K) {}
}

@Given("I Click Manual Submit For Credit Card Toggle as YES")
public void iClickManualSubmitForCreditCardToggleAsYES() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.iClickManualSubmitForCreditCard_Yes();
}

@Given("I Click Tokenize The Credit Card Toggle as YES")
public void iClickTokenizeTheCreditCardToggleAsYES() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.IClickTokenizeTheCreditCardToggle_Yes();
    sps.ISelect_TokenizeServiceType();
}

@Given("I Click Payment Surcharge Toggle as YES")
public void iClickPaymentSurchargeToggleAsYES() {
    // Write code here that turns the phrase above into concrete actions
    sps.IClickPaymentSurchageToggle_Yes();
}

@Given("I Click Surcharge button")
public void iClickSurchargeButton() {
    // Write code here that turns the phrase above into concrete actions
    sps.IclickSurCharge_RadioBtn();
}

@Given("I Enter Surcharge Name")
public void iEnterSurchargeName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_SurchargeName_Surcharge("coupon");
}

@Given("I Clear the Fee Name")
public void iClearTheFeeName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Clear_FeeName_Surcharge();
    
    
}

@Given("I Clear the Surcharge Name")
public void iClearTheSurchargeName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Clear_SurchargeName_Surcharge();
}


@Given("I Enter Surcharge Percentage")
public void iEnterSurchargePercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   sps.Enter_SurchargePercentage_Surcharge("0.3");
}

@Then("I Verify SAVE button is Disabled")
public void iVerifySAVEButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Save_Button_Diabled();
}

@Given("I Enter Fee Name")
public void iEnterFeeName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_FeeName_Surcharge("Discount");
}

@Given("I Enter Surcharge Percentage greater than {int}% and Verify Error")
public void iEnterSurchargePercentageGreaterThan(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_SurchargePercentageGreater_Surcharge("110.00");
}

@Given("I Enter Fee Name with {int} characters")
public void iEnterFeeNameWithCharacters(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_FeeName_Surcharge("Discount Applicable onlyy");
}

@Given("I Enter Surcharge Name with {int} characters")
public void iEnterSurchageNameWithCharacters(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_SurchargeName_Surcharge("Coupon Code Applicable On");
}

@Then("I Verify SAVE button is Enabled")
public void iVerifySAVEButtonIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.PaymentSetting_SAVEBtn_Enabled();
}

@Then("I Click SAVE button")
public void iClickSAVEButton() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.IclickSave_Settings();
}

@Then("I Verify Payment Settings Saved Successfully")
public void iVerifyPaymentSettingsSavedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.iVerifyPaymentSettingsSavedSuccessfully();
}

@Given("I Update Fee Name")
public void iUpdateFeeName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Update_FeeName_Surcharge("Discont");
}

@Given("I Update Surcharge Name")
public void iUpdateSurchargeName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Update_SurchargeName_Surcharge("Coupon");
}

@Given("I Update Surcharge Percentage")
public void iUpdateSurchargePercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Update_SurchargePercentage_Surcharge("10.00");
}

@Given("I Click Service Charge button")
public void iClickServiceChargeButton() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.IclickServiceCharge_RadioBtn();
}

@Given("I Click New Service Charge button")
public void iClickNewServiceChargeButton() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.Iclick_NewServiceCharge_Btn();
}

@Then("I Verify New service charge header title")
public void iVerifyNewServiceChargeHeaderTitle() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.VerifyNewServiceChargeScreenPageHeader("New Service Charge");
}


@Given("I Enter Service Charge Percentage")
public void iEnterServiceChargePercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_ServiceChargePercentage_Surcharge("05.00");
}

@Given("I Enter Tip Charge Percentage")
public void iEnterTipChargePercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_TipChargePercentage_Surcharge("03.00");;
}

@Given("I Enter Gratuity Charge Percentage")
public void iEnterGratuityChargePercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_GratuityChargePercentage_Surcharge("06.00");
}

@Then("I Verify SAVE&ADD button is Disabled")
public void iVerifySAVEADDButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Save_ADD_Button_Diabled();
}


@Given("I Enter Service Charge Percentage greater than {int} and Verify Error")
public void iEnterServiceChargePercentageGreaterThan(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 sps.Enter_ServiceChargePercentageGreater_Surcharge("105.00");
}

//@Then("I Verify Please Enter Valid Percentage Text")
//public void iVerifyPleaseEnterValidPercentageText() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@Given("I select the Card Type as VISA")
public void iSelectTheCardTypeAsVISA() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.Select_Visa_CardType();
}

@Given("I Enter Tip Charge Percentage greater than {int} and Verify Error")
public void iEnterTipChargePercentageGreaterThan(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
   sps.Enter_TipChargePercentageGreater_Surcharge("120.00");
}

@Given("I Enter Gratuity Charge Percentage greater than {int} and Verify Error")
public void iEnterGratuityChargePercentageGreaterThan(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_GratuityChargePercentageGreater_Surcharge("100.01");
}

@Then("I Verify SAVE&ADD button is Enabled")
public void iVerifySAVEADDButtonIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Save_ADD_Button_Enabled();
}

@Then("I Click SAVE&ADD button")
public void iClickSAVEADDButton() {
    // Write code here that turns the phrase above into concrete actions
    cmp.IClickSAVE_ADD_Btn();
}

@Then("I Verify Service Charge Added Successfully")
public void iVerifyServiceChargeAddedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.iVerifyServiceChargeAddedSuccessfully();
}

@Given("I select the Card Type as MASTER")
public void iSelectTheCardTypeAsMASTER() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("Master");
}

@Given("I select the Card Type as AMEX")
public void iSelectTheCardTypeAsAMEX() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("Amex");
}

@Given("I select the Card Type as DINERS")
public void iSelectTheCardTypeAsDINERS() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("Diners");
}

@Given("I select the Card Type as JCB")
public void iSelectTheCardTypeAsJCB() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("JCB");
}

@Given("I select the Card Type as DISCOVER")
public void iSelectTheCardTypeAsDISCOVER() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 sps.Select_CardType("Discover");
}

@Given("I select the Card Type as EBTCASH")
public void iSelectTheCardTypeAsEBTCASH() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 sps.Select_CardType("EbtCash");
}

@Given("I Search and Edit the Service Charge")
public void iSearchAndEditTheServiceCharge() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.SearchEdit_ServiceChargewithCardType("Vis");
}

@Then("I Verify Update Service Charge Header Title")
public void iVerifyUpdateServiceChargeHeaderTitle() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.VerifyUpdateServiceChargeHeader();
}

@Then("I Verify UPDATE button is Disabled")
public void iVerifyUPDATEButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Verify_Update_Button_Diabled_ServiceCharge();
}

@Then("I Click CANCEL button")
public void iClickCANCELButton() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_CancelButton();
}

@Given("I Search and Edit the Service Charge with Card Type DINERS")
public void iSearchAndEditTheServiceChargeWithCardTypeDINERS() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	sps.SearchEdit_ServiceChargewithCardType("Din");
}

@Given("I Update the Card Type to CASH")
public void iUpdateTheCardTypeToCASH() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("Cash");
}

@Given("I Update the Service Charge")
public void iUpdateTheServiceCharge() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_ServiceChargePercentage_Surcharge("11.00");
}

@Then("I Verify UPDATE button is Enabled")
public void iVerifyUPDATEButtonIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   sps.Verify_Update_Button_Enabled_ServiceCharge();
}

@Then("I Click UPDATE button")
public void iClickUPDATEButton() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_UpdateButton();
}

@Then("I Verify Service Charges Updated Successfully")
public void iVerifyServiceChargesUpdatedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.iVerifyServiceChargeUpdatedSuccessfully();
}

@Given("I Search and Edit the Service Charge with Card Type AMEX")
public void iSearchAndEditTheServiceChargeWithCardTypeAMEX() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.SearchEdit_ServiceChargewithCardType("AME");
}

@Given("I Update the Card Type to ATH")
public void iUpdateTheCardTypeToATH() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("ATH");
}

@Given("I Update the Tip Charge")
public void iUpdateTheTipCharge() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_TipChargePercentage_Surcharge("12.00");
}

@Given("I Search and Edit the Service Charge with Card Type JCB")
public void iSearchAndEditTheServiceChargeWithCardTypeJCB() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.SearchEdit_ServiceChargewithCardType("JCB");
}

@Given("I Update the Card Type to UNICA")
public void iUpdateTheCardTypeToUNICA() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("Unica");
}

@Given("I Update the Gratuity Charge")
public void iUpdateTheGratuityCharge() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_GratuityChargePercentage_Surcharge("13.00");
}

//@Then("Verify UPDATE button is Enabled")
//public void verifyUPDATEButtonIsEnabled() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@Given("I Update the Service Charge Name with {int} characters")
public void iUpdateTheServiceChargeNameWithCharacters(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Update_ServiceChargeName_Surcharge("Restaurant Servicescharge");
}

@Given("I Search and Edit the Service Charge with Card Type DISCOVER")
public void iSearchAndEditTheServiceChargeWithCardTypeDISCOVER() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.SearchEdit_ServiceChargewithCardType("Disc");
}

@Given("I Update the Card Type to EBT")
public void iUpdateTheCardTypeToEBT() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("Ebt");
}

@Given("I Search and Edit the Service Charge with Card Type MASTER")
public void iSearchAndEditTheServiceChargeWithCardTypeMASTER() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   sps.SearchEdit_ServiceChargewithCardType("Mast");
}

@Given("I Update the Card Type to FONDO")
public void iUpdateTheCardTypeToFONDO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("Fondo");
}

@Given("I Search and Edit the Service Charge with Card Type EBTCASH")
public void iSearchAndEditTheServiceChargeWithCardTypeEBTCASH() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.SearchEdit_ServiceChargewithCardType("EbtCa");
}

@Given("I Update the Card Type to Others")
public void iUpdateTheCardTypeToOthers() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	sps.Select_CardType("Others");
}
	
@Given("I Click COLUMNS for Sorting")
public void iClickCOLUMNSForSorting() {
    // Write code here that turns the phrase above into concrete actions
	cmp.Ascending_And_Descending_Order();
}

@Given("I Search and Delete the Service Charge")
public void iSearchAndDeleteTheServiceCharge() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.SearchEditDelete_ServiceChargewithCardType("Vis");
}
@Then("I Verify Are you sure you want to delete this item message")
public void iVerifyAreYouSureYouWantToDeleteThisItemMessage() {
    // Write code here that turns the phrase above into concrete actions
    sps.IverifyDeleteAlertMsg_Paymentsetting();
}


@Then("I Click DELETE")
public void iClickDELETE() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cmp.Click_DeleteButton_Message("Are you sure you want to delete this item?");
}


@Then("I Click DELETE from Alert Popup")
public void iClickDELETEfromAlertPopup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   sps.Iclick_Delete_ServiceChargeAlert();
   ut.PassedCaptureScreenshotAsBASE64();
}


@Then("I Verify Service Charge Removed Successfully")
public void iVerifyServiceChargeRemovedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sps.iVerifyServiceChargeRemovedSuccessfully();
}

@Given("I Click Dual Price button")
public void iClickDualPriceButton() {
    // Write code here that turns the phrase above into concrete actions
    sps.IclickDualPrice_RadioBtn();
}
@Given("I Enter Dual Price Percentage")
public void iEnterDualPricePercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_DualPricePercentage_Surcharge("14.00");
}

@Given("I Select Dual Price Tax Type as Before Tax")
public void iSelectDualPriceTaxTypeBeforeTax() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Select_DualPriceTaxtype_BeforeTax_Surcharge();
}

@Given("I Select Dual Price Tax Type as After Tax")
public void iSelectDualPriceTaxTypeAfterTax() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Select_DualPriceTaxtype_AfterTax_Surcharge();
}

@Given("I Enter Dual Price Name")
public void iEnterDualPriceName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_DualPriceName_Surcharge("Couponcharge");
}


@Then("I Click Cancel")
public void iClickCancel() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_CancelButton();
    
}


@Then("I Click Cancel from Alert Popup")
public void iClickCancelfromAlertPopup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Iclick_Cancel_ServiceChargeAlert();
    ut.PassedCaptureScreenshotAsBASE64();
    
}


@Given("I Clear Dual Price Percentage and verify Error")
public void iEnterDualPricePercentageGreaterThan() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Clear_DualPricePercentage_Surcharge("0.00");
}

@Given("I Enter Dual Price Name with {int} characters")
public void iEnterDualPriceNameWithCharacters(Integer int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
   sps.Enter_DualPriceName_Surcharge("Couponcode ApplicableOnly");
}


@Given("I Update Dual Price Name")
public void iUpdateDualPriceName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_DualPriceName_Surcharge("ChargeExtra");
}

@Given("I Clear the DualPrice Fee Name")
public void iClearTheDualPriceFeeName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Clear_DualPrice_FeeName_Surcharge();
    
    
}

@Given("I Update Dual Price Percentage")
public void iUpdateDualPricePercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    sps.Enter_DualPricePercentage_Surcharge("12.00");
}

	
}