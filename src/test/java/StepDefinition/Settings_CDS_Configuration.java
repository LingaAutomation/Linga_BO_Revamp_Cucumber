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
import com.Pages.Settings_CDS_Page;
import com.Pages.Settings_KDS_ConfigurationPage;
import com.Pages.Settings_NotificationsPage;
import com.Pages.SubCategoriesPage;
import com.Pages.UpchargesPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Settings_CDS_Configuration {

	
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
	ReportsPage rel=new ReportsPage();
	PaymentSettingsPage sps= new PaymentSettingsPage();
	Settings_KDS_ConfigurationPage kdsc =new Settings_KDS_ConfigurationPage();
	Settings_CDS_Page cds = new Settings_CDS_Page();
	Settings_NotificationsPage snp = new Settings_NotificationsPage();
	
	@Given("Open the Settings - Customer Display System Home Page BaseURL and storeID")
	public void openTheSettingsCustomerDisplaySystemHomePageBaseURLAndStoreID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cds.openTheSettingsCustomerDisplaySystem_CDS_PageBaseURLAndStoreID();
	try {
	cmp.Close_Online_Help_ChatBox();}
	catch(Exception K) {}
}

@Given("Verifying  Customer Display System Page Header")
public void verifyingCDSPageHeader() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.CDS_Header, "Customer Display System (CDS)", "Displayed", "Not Displayed");
}
@Given("I Verify Customer Display System SAVE button is Disabled")
public void iVerifyCustomerDisplaySystemSAVEButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Diabled(cds.disabled_Save_Btn, "SAVE Button disabled", "SAVE Button Enabled");
}


@Then("Check Show Advertisements Field is displayed")
public void checkShowAdvertisementsFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.SA_Field, "Show Advertisements", "Displayed", "Not Displayed");
}

@Then("Check Customer Profile Field is displayed")
public void checkCustomerProfileFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.CP_Field, "Customer Profile", "Displayed", "Not Displayed");
}

@Then("Check Theme Field is displayed")
public void checkThemeFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.Theme_Field, "Theme", "Displayed", "Not Displayed");
}


@Then("Check Theme Label is displayed")
public void checkThemeDropdownBoxIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.Theme_Label, "Theme", "Displayed", "Not Displayed");
}

@Then("Check Discount Text Field is displayed")
public void checkDiscountTextFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.DiscountText_Field, "Discount Text", "Displayed", "Not Displayed");
}
@Then("Check Discount Text Message box is displayed")
public void checkDiscountTextMessageBoxIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.DiscountText_Label, "Theme", "Displayed", "Not Displayed");
}
@Then("Check Get Number Text Field is displayed")
public void checkGetNumberTextFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.GetNumberText_Field, "Get Number Text", "Displayed", "Not Displayed");
}
@Then("Check Get Number Text message box is displayed")
public void checkGetNumberTextMessageBoxIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.GetNumber_Label, "Get Number Text", "Displayed", "Not Displayed");
}
@Then("Check Loyalty Text Field is displayed")
public void checkLoyaltyTextFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.LoyaltyText_Field, "Loyalty Text", "Displayed", "Not Displayed");

}
@Then("Check Loyalty Text Message box is displayed")
public void checkLoyaltyTextMessageBoxIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	cds.CheckField_CDS(cds.Loyalty_Label, "Loyalty Text", "Displayed", "Not Displayed");
}

@Given("I Click Show Advertisements Field Toggle as No")
public void iClickShowAdvertisementsFieldToggleAsNo() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_No_Btn(cds.No_btn_SA, cds.Yes_btn_SA);
}

@Given("I Click Customer Profile Field Toggle as No")
public void iClickCustomerProfileFieldToggleAsNo() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_No_Btn(cds.No_btn_CP, cds.Yes_btn_CP);
}
@Then("I Verify Customer Display System SAVE button is Enabled")
public void iVerifyCustomerDisplaySystemSAVEButtonIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Enabled(cds.Enabled_Save_Btn, "SAVE Button Enabled", "SAVE Button Disabled");
}
@Then("I Click Customer Display System SAVE btn")
public void iClickCustomerDisplaySystemSAVEBtn() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(cds.Enabled_Save_Btn);
} 
@Then("I Verify CDS Settings Updated Successfully")
public void iVerifyCDSSettingsUpdatedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.IVerify_SettingsSavedSuccessfully("CDS Settings Updated Successfully");
}

@Given("I Click Show Advertisements Field Toggle as Yes")
public void iClickShowAdvertisementsFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(cds.Yes_btn_SA, cds.No_btn_SA);
}

@Given("I Click Customer Profile Field Toggle as Yes")
public void iClickCustomerProfileFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(cds.Yes_btn_CP, cds.No_btn_CP);
}

@Given("I Select Theme as Dark Theme")
public void iSelectThemeAsDarkTheme() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(cds.theme_Select);
    Thread.sleep(1000);
    cds.Iclick_Button(cds.dark_Theme);
}

@Given("I Select Theme as Light Theme")
public void iSelectThemeAsLightTheme() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(cds.theme_Select);
    Thread.sleep(1000);
    cds.Iclick_Button(cds.light_Theme);
}

@Given("I Enter Discount Text")
public void iEnterDiscountText() {
    // Write code here that turns the phrase above into concrete actions
	
	String valid_Txt1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	
   cds.IEnterText(cds.textArea_Of_DiscountText, valid_Txt1, "Valid Text Entered in Discount Text");
}

@Given("I Enter Get Number Text")
public void iEnterGetNumberText() {
    // Write code here that turns the phrase above into concrete actions
	String valid_Txt1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	 cds.IEnterText(cds.textArea_Of_GetNumberText, valid_Txt1, "Valid Text Entered in Get Number Text");
}
@Given("I Enter Loyalty Text")
public void iEnterLoyaltyText() {
    // Write code here that turns the phrase above into concrete actions
	String valid_Txt1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	cds.IEnterText(cds.textArea_Of_LoyaltyText, valid_Txt1, "Valid Text Entered in Loyalty Text");
}

@Given("I Enter Discount Text with Valid limit")
public void iEnterDiscountTextWithValidLimit() {
    // Write code here that turns the phrase above into concrete actions
	String valid_Txt2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
	cds.IEnterText(cds.textArea_Of_DiscountText, valid_Txt2, "Valid Text Entered in Discount Text");
}

@Given("I Enter Get Number Text with Valid limit")
public void iEnterGetNumberTextWithValidLimit() {
    // Write code here that turns the phrase above into concrete actions
	String valid_Txt2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
	cds.IEnterText(cds.textArea_Of_GetNumberText, valid_Txt2, "Valid Text Entered in Get Number Text");
}

@Given("I Enter Loyalty Text with Valid limit")
public void iEnterLoyaltyTextWithValidLimit() {
    // Write code here that turns the phrase above into concrete actions
	String valid_Txt2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
	cds.IEnterText(cds.textArea_Of_LoyaltyText, valid_Txt2, "Valid Text Entered in Loyalty Text");
}


@Given("I Enter Discount Text with Valid1 limit")
public void iEnterDiscountTextWithValid1Limit() {
    // Write code here that turns the phrase above into concrete actions
	String valid_Txt2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
	cds.IEnterText(cds.textArea_Of_DiscountText, valid_Txt2, "Valid Text Entered in Discount Text");
}

@Given("I Enter Get Number Text with Valid1 limit")
public void iEnterGetNumberTextWithValid1Limit() {
    // Write code here that turns the phrase above into concrete actions
	String valid_Txt2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
	cds.IEnterText(cds.textArea_Of_GetNumberText, valid_Txt2, "Valid Text Entered in Get Number Text");
}

@Given("I Enter Loyalty Text with Valid1 limit")
public void iEnterLoyaltyTextWithValid1Limit() {
    // Write code here that turns the phrase above into concrete actions
	String valid_Txt2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
	cds.IEnterText(cds.textArea_Of_LoyaltyText, valid_Txt2, "Valid Text Entered in Loyalty Text");
}

@Given("I Enter Discount Text Greater than Invalid limit")
public void iEnterDiscountTextGreaterThanInvalidLimit() {
    // Write code here that turns the phrase above into concrete actions
	String invalid_Txt = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
	cds.IEnterText(cds.textArea_Of_DiscountText, invalid_Txt, "Invalid Text Entered in Discount Text");
}

@Then("I Verify Discount Text Message Box Error")
public void iVerifyDiscountTextMessageBoxError() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	cds.IVerify_CharMaxError(cds.CharMaxError_Discount, "Should not be more than 160 characters");
}
@Given("I Enter Get Number Text Greater than Invalid limit")
public void iEnterGetNumberTextGreaterThanInvalidLimit() {
    // Write code here that turns the phrase above into concrete actions
	String invalid_Txt = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
	cds.IEnterText(cds.textArea_Of_GetNumberText, invalid_Txt, "Invalid Text Entered in Get Number Text");

}
@Then("I Verify Get Number Text Message Box Error")
public void iVerifyGetNumberTextMessageBoxError() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	cds.IVerify_CharMaxError(cds.CharMaxError_GetNumber, "Should not be more than 160 characters");
}
@Given("I Enter Loyalty Text Greater than Invalid limit")
public void iEnterLoyaltyTextGreaterThanInvalidLimit() {
    // Write code here that turns the phrase above into concrete actions
	String invalid_Txt = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
	cds.IEnterText(cds.textArea_Of_LoyaltyText, invalid_Txt, "Invalid Text Entered in Loyalty Text");

}
@Then("I Verify Loyalty Text Message Box Error")
public void iVerifyLoyaltyTextMessageBoxError() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   cds.IVerify_CharMaxError(cds.CharMaxError_Loyalty, "Should not be more than 160 characters");
}
}