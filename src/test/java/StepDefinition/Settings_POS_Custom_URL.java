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
import com.Pages.ProductItems_Menu_RetailPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.Settings_CDS_Page;
import com.Pages.Settings_KDS_ConfigurationPage;
import com.Pages.Settings_NotificationsPage;
import com.Pages.Settings_POSCustomURL_Page;
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

public class Settings_POS_Custom_URL {

	
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
//	Reports_EmployeeLaborPage rel=new Reports_EmployeeLaborPage();
//	Settings_PaymentSettingsPage sps= new Settings_PaymentSettingsPage();
	Settings_KDS_ConfigurationPage kdsc =new Settings_KDS_ConfigurationPage();
	Settings_CDS_Page cds = new Settings_CDS_Page();
	Settings_NotificationsPage snp = new Settings_NotificationsPage();
	Settings_POSCustomURL_Page pcup = new Settings_POSCustomURL_Page();
	
	@Given("Open the Settings - POS Custom URLs Home Page BaseURL and storeID")
	public void openTheSettingsCustomerDisplaySystemHomePageBaseURLAndStoreID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cds.openTheSettingsCustomerDisplaySystem_CDS_PageBaseURLAndStoreID();
	try {
	cmp.Close_Online_Help_ChatBox();}
	catch(Exception K) {}
}
	

@Given("I Verify POS Custom URLs Settings Page Header")
public void iVerifyPOSCustomURLsSettingsPageHeader() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(pcup.POSCustom_Settings_Header, "POS Custom URLs", "Displayed", "Not Displayed");
}

@Given("I Verify POS Custom URLs Page Header")
public void iVerifyPOSCustomURLsPageHeader() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(pcup.POSCustom_URLPage_Header, "POS Custom URLs", "Displayed", "Not Displayed");
}

@Then("I Verify POS Custom URLs SAVE button is Disabled")
public void iVerifyPOSCustomURLsSAVEButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Disabled(pcup.POSCustomURL_Save_Disabled, "Disabled", "Enabled");
}


@Then("Check POS Access URL Field is displayed")
public void checkPOSAccessURLFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(pcup.POSAccessURL_Field, "POS Access URL", "Dispalyed", "Not Displayed");

}
@Then("Check Name Label is displayed")
public void checkNameLabelIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	 cds.CheckField_Displayed(pcup.POSCustomURL_Name_Label_IpBx, "Name", "Dispalyed", "Not Displayed");
}
@Then("Check URL Label is displayed")
public void checkURLLabelIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	 cds.CheckField_Displayed(pcup.POSCustomURL_URL_Label_IpBx, "URL", "Dispalyed", "Not Displayed");
}
@Then("Check button Image field is displayed")
public void checkButtonImageFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	 cds.CheckField_Displayed(pcup.POSCustomURL_BtnImage_Field, "Button Image:", "Dispalyed", "Not Displayed");
}

@Given("I Click POS Access URL Field Toggle as No")
public void iClickPOSAccessURLFieldToggleAsNo() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   snp.IClick_Toggle_No_Btn(pcup.POSAccessURL_Toggle_Yes, pcup.POSAccessURL_Toggle_No);
}

@Given("I Click POS Access URL Field Toggle as Yes")
public void iClickPOSAccessURLFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	   snp.IClick_Toggle_Yes_Btn(pcup.POSAccessURL_Toggle_Yes, pcup.POSAccessURL_Toggle_No);
}

@Given("I Clear Name in POS Custom URLs")
public void iClearNameInPOSCustomURLs() {
    // Write code here that turns the phrase above into concrete actions
    pcup.IClearText(pcup.POSCustomURL_Name_Input, "Johnson", "Name Input box cleared", "Name Input box not cleared");
}

@Then("I Verify Please Enter Name message")
public void iVerifyPleaseEnterNameMessage() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    pcup.IVerify_ErrorMsg(pcup.POSCustomURL_Name_Error, "Please Enter Name");
}

@Given("I Clear URL in POS Custom URLs")
public void iClearURLInPOSCustomURLs() {
    // Write code here that turns the phrase above into concrete actions
    pcup.IClearText(pcup.POSCustomURL_URL_Input, "https://www.pos.com", "URL Input box cleared", "URL Input box not cleared");
}
@Then("I Verify Please Enter URL message")
public void iVerifyPleaseEnterURLMessage() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    pcup.IVerify_ErrorMsg(pcup.POSCustomURL_URL_Error, "Please Enter URL");
}
@Given("I Enter Name in POS Custom URLs")
public void iEnterNameInPOSCustomURLs() {
    // Write code here that turns the phrase above into concrete actions
   cds.IEnterText(pcup.POSCustomURL_Name_Input, "Wilson", "Name Entered");
}
@Given("I Enter URL in POS Custom URLs")
public void iEnterURLInPOSCustomURLs() {
    // Write code here that turns the phrase above into concrete actions
	   cds.IEnterText(pcup.POSCustomURL_URL_Input, "https://www.pos1.com", "URL Entered");
}
@Then("I Upload Image in POS Custom URLs")
public void iUploadImageInPOSCustomURLs() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pcup.IUpload_Image(pcup.POSCustomURL_BtnImage_Upload, "Settings_Store_Information_Store_Image_Path");
}
@Then("I Verify POS Custom URLs SAVE button is Enabled")
public void iVerifyPOSCustomURLsSAVEButtonIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Enabled(pcup.POSCustomURL_Save_Enabled, "Enabled", "Disabled");
}
@Then("I Click SAVE button in POS Custom URLs")
public void iClickSAVEButtonInPOSCustomURLs() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(pcup.POSCustomURL_Save_Enabled);
}
@Then("I Verify POS Custom URL Updated Successfully")
public void iVerifyPOSCustomURLUpdatedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.IVerify_SettingsSavedSuccessfully("POS Custom URL Updated Successfully");
}

@Given("I Click URL Link button in URL Links")
public void iClickURLLinkButtonInURLLinks() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(pcup.URLLink_btn);
}
@Then("I Verify New POS Custom URL Page Header in New POS Custom URL Screen")
public void iVerifyNewPOSCustomURLPageHeaderInNewPOSCustomURLScreen() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(pcup.NewPOSCustom_URLPage_Header, "New POS Custom URL", "Displayed", "Not Displayed");
}
@Then("I Verify New POS Custom URL SAVE button is Disabled")
public void iVerifyNewPOSCustomURLSAVEButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Disabled(pcup.NewPOSCustomURL_Save_Disabled, "Disabled", "Enabled");
}
@Then("I Click Cancel button in New POS Custom URL Screen")
public void iClickCancelButtonInNewPOSCustomURLScreen() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(pcup.NewPOSCustom_URLPage_Cancel);
}

@Given("I Enter Name in New POS Custom URL Screen")
public void iEnterNameInNewPOSCustomURLScreen() {
    // Write code here that turns the phrase above into concrete actions
    cds.IEnterText(pcup.POSCustomURL_Name_Input, "JohnyDepp", "Name Entered");
}
@Given("I Enter URL in New POS Custom URL Screen")
public void iEnterURLInNewPOSCustomURLScreen() {
    // Write code here that turns the phrase above into concrete actions
    cds.IEnterText(pcup.POSCustomURL_URL_Input, "https://www.pos2.com", "URL Entered");
}
@Then("I Verify New POS Custom URL SAVE button is Disabled in New POS Custom URL Screen")
public void iVerifyNewPOSCustomURLSAVEButtonIsDisabledInNewPOSCustomURLScreen() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Disabled(pcup.NewPOSCustomURL_Save_Disabled, "Disabled", "Enabled");
}
@Then("I Upload Image in New POS Custom URL Screen")
public void iUploadImageInNewPOSCustomURLScreen() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pcup.IUpload_Image(pcup.POSCustomURL_BtnImage_Upload, "Settings_Store_Information_Store_Image_Path");
}
@Then("I Verify New POS Custom URL SAVE button is Enabled in New POS Custom URL Screen")
public void iVerifyNewPOSCustomURLSAVEButtonIsEnabledInNewPOSCustomURLScreen() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Enabled(pcup.NewPOSCustomURL_Save_Enabled, "Enabled", "Disabled");
}
@Then("I Click SAVE button in New POS Custom URL Screen")
public void iClickSAVEButtonInNewPOSCustomURLScreen() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 cds.Iclick_Button(pcup.NewPOSCustomURL_Save_Enabled);
}
@Given("I Click Edit button in URL Links")
public void iClickEditButtonInURLLinks() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(pcup.POSCustom_URL_Edit_btn);
}
@Then("I Verify Update POS Custom URL Page Header")
public void iVerifyUpdatePOSCustomURLPageHeader() {
    // Write code here that turns the phrase above into concrete actions
    cds.CheckField_Displayed(pcup.UpdatePOSCustom_URLPage_Header, "Update POS Custom URL", "Displayed", "Not Displayed");
}
@Then("I Verify Update POS Custom URL Update button is Disabled")
public void iVerifyUpdatePOSCustomURLUpdateButtonIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Disabled(pcup.UpdatePOSCustomURL_Update_Disabled, "Disabled", "Enabled");
}
@Then("I Click Cancel button in Update POS Custom URL")
public void iClickCancelButtonInUpdatePOSCustomURL() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(pcup.NewPOSCustom_URLPage_Cancel);
}

@Given("I Update Name in Update POS Custom URL Screen")
public void iUpdateNameInUpdatePOSCustomURLScreen() {
    // Write code here that turns the phrase above into concrete actions
    cds.IEnterText(pcup.POSCustomURL_Name_Input, "Dravid", "Name Updated");
}
@Then("I Verify Update button is Enabled in Update POS Custom URL Screen")
public void iVerifyUpdateButtonIsEnabledInUpdatePOSCustomURLScreen() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cds.Verify_Save_Button_Enabled(pcup.UpdatePOSCustomURL_Update_Enabled, "Enabled", "Disabled");
}
@Then("I Click Update button in Update POS Custom URL Screen")
public void iClickUpdateButtonInUpdatePOSCustomURLScreen() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(pcup.UpdatePOSCustomURL_Update_Enabled);
}
@Given("I Update URL in Update POS Custom URL Screen")
public void iUpdateURLInUpdatePOSCustomURLScreen() {
    // Write code here that turns the phrase above into concrete actions
	  cds.IEnterText(pcup.POSCustomURL_URL_Input, "https://www.pos3.com", "URL Updated");
}
@Given("I Click Delete button in URL Links")
public void iClickDeleteButtonInURLLinks() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cds.Iclick_Button(pcup.POSCustom_URL_Delete_btn);
}
@Given("I Click No button in Delete Popup")
public void iClickNoButtonInDeletePopup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	   pcup.IClick_Button_FromConfirmationAlertMsg(pcup.Delete_No, "No Button clicked");
}

@Given("I Click Yes button in Delete Popup")
public void iClickYesButtonInDeletePopup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pcup.IClick_Button_FromConfirmationAlertMsg(pcup.Delete_Yes, "Yes Button clicked");
}
@Then("I Verify URL Deleted Successfully")
public void iVerifyURLDeletedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	   cds.IVerify_SettingsSavedSuccessfully("URL Deleted Successfully");
}

@Given("I Create Ten POS URLs One by One using URL Links")
public void iCreateTenPOSURLsOneByOne() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pcup.ICreate_Ten_POSURLs("Settings_Store_Information_Store_Image_Path", "POS Custom URL Updated Successfully");
}
@Then("I Verify Ten POS URLs added")
public void iVerifyTenPOSURLsDeletedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pcup.Iverify_Ten_POSURLS("Maximum 10 URL can be configured");
}

@Given("I Delete All POS URLs One by One")
public void iDeleteAllPOSURLsOneByOne() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pcup.IDelete_Ten_POSURLs();
}
@Then("I Verify all POS URLs Deleted Successfully")
public void iVerifyAllPOSURLsDeletedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pcup.Iverify_Delete_All_POSURLS("URL Configured here can be accessed in POS");
}




}