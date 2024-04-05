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
import com.Pages.Settings_StoreLicences_Page;
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

public class Settings_Store_Licences {

	
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
//	Settings_POS_Custom_URL_Page pcup = new Settings_POS_Custom_URL_Page();
	Settings_StoreLicences_Page sslp = new Settings_StoreLicences_Page();
	
	@Given("Open the Settings - Store Licenses Home Page BaseURL and storeID")
	public void openTheSettingsStoreLicensesHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	 sslp.openTheSettings_StoreLicensesHomePageBaseURLAndStoreID();
		try {
	cmp.Close_Online_Help_ChatBox();}
		catch(Exception K) {}
	}

	@Given("I Verify Store Licenses Settings Page Header in Store Licenses settings")
	public void iVerifyStoreLicensesSettingsPageHeaderInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.StoreLicense_MainScreenHeader, "Store Licenses", "Displayed", "Not Displayed");
	}
	

	@Given("I Check Store Licenses Header in Store Licenses settings")
	public void iCheckStoreLicensesHeaderInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.StoreLicense_PageHeader, "Store Licenses", "Displayed", "Not Displayed");
	}
	@Then("I Check Note Id is displayed in Store Licenses settings")
	public void iCheckNoteIdIsDisplayedInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.Field_NodeId, "Node Id", "Displayed", "Not Displayed");

	}
	@Then("I Check Device Type is displayed in Store Licenses settings")
	public void iCheckDeviceTypeIsDisplayedInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.Field_DeviceType, "Device Type", "Displayed", "Not Displayed");

	}
	@Then("I Check Device Name is displayed in Store Licenses settings")
	public void iCheckDeviceNameIsDisplayedInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.Field_DeviceName, "Device Name", "Displayed", "Not Displayed");
	}
	@Then("I Check Last Login Time is displayed in Store Licenses settings")
	public void iCheckLastLoginTimeIsDisplayedInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.Field_LastLoginTime, "Last Login Time", "Displayed", "Not Displayed");
	}
	@Then("I Check Last Access Time is displayed in Store Licenses settings")
	public void iCheckLastAccessTimeIsDisplayedInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.Field_LastAccessTime, "Last Access Time", "Displayed", "Not Displayed");
	}
	@Then("I Check Actions is displayed in Store Licenses settings")
	public void iCheckActionsIsDisplayedInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.Field_Actions, "Actions", "Displayed", "Not Displayed");
	}
	@Then("I Check Rows per page is displayed in Store Licenses settings")
	public void iCheckRowsPerPageIsDisplayedInStoreLicensesSettings() {
	    // Write code here that turns the phrase above into concrete actions
	    cds.CheckField_Displayed(sslp.Field_Rowsperpage, "Rows per page", "Displayed", "Not Displayed");
	}

	@Given("I can do the Pagination for Ten pages in Store Licenses settings")
	public void iCanDoThePaginationForTenPagesInStoreLicensesSettings() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    sslp.Verify_Rows_PageCount_10();
	}
	
	@Given("I can do the Pagination for Twenty pages in Store Licenses settings")
	public void iCanDoThePaginationForTwentyPagesInStoreLicensesSettings() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 sslp.Verify_Rows_PageCount_20();
	}
	
	@Given("I can do the Pagination for Fifty pages in Store Licenses settings")
	public void iCanDoThePaginationForFiftyPagesInStoreLicensesSettings() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 sslp.Verify_Rows_PageCount_50();
	}
	
	@Given("I can do the Pagination for Hundread pages in Store Licenses settings")
	public void iCanDoThePaginationForHundreadPagesInStoreLicensesSettings() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 sslp.Verify_Rows_PageCount_100();
	}

	@Given("I Click SIGN OUT button from Store Licences")
	public void iClickSIGNOUTButtonFromStoreLicences() {
	    // Write code here that turns the phrase above into concrete actions
	    sslp.Iclick_Signout();
	}
	@Then("I Verify Store Licences Reminder Alert Pop up Message")
	public void iVerifyStoreLicencesReminderAlertPopUpMessage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    sslp.Verify_AlertMessage_StoreLicenses();
	}
	
@Then("I Click No button from Store Licences Reminder Alert Pop up Message")
	public void iClickNoButtonFromStoreLicencesReminderAlertPopUpMessage() {
	    // Write code here that turns the phrase above into concrete actions
	    sslp.Iclick_No_StoreLicenses();
	}
	
@Then("I Click Close button from Store Licences Reminder Alert Pop up Message")
public void iClickCloseButtonFromStoreLicencesReminderAlertPopUpMessage() {
    // Write code here that turns the phrase above into concrete actions
    sslp.Iclick_Close_StoreLicenses();
}

@Then("I Click Yes button from Store Licences Reminder Alert Pop up Message")
public void iClickYesButtonFromStoreLicencesReminderAlertPopUpMessage() {
    // Write code here that turns the phrase above into concrete actions
    sslp.Iclick_Yes_StoreLicenses();
}

@Then("I Verify Store License Unlinked Successfully")
public void iVerifyUnlinkedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    sslp.Verify_LicenseUnlinked();
}

//@Given("I Select the Store Licenses COLUMNs option")
//public void iSelectTheStoreLicensesCOLUMNsOption() throws Exception {
//    // Write code here that turns the phrase above into concrete actions
//    cmp.Filter_Columns();
//}
//@Then("I Verify Store Licenses table Columns")
//public void iVerifyStoreLicensesTableColumns() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

}