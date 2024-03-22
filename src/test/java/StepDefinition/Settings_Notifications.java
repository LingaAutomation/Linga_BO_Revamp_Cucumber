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

public class Settings_Notifications {

	
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
	Settings_NotificationsPage snp = new Settings_NotificationsPage();
	
	@Given("Open the Settings - Notifications Home Page BaseURL and storeID")
	public void openTheSettingsNotificationsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    snp.openTheSettingsNotificationsHomePageBaseURLAndStoreID();
		try {
			cmp.Close_Online_Help_ChatBox();}
			catch(Exception K) {}
	}
	@Given("Verifying  Notifications Page Header")
	public void verifyingNotificationsPageHeader() {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifyMainScreenPageHeader("Notifications");
	}
	@Then("Check Discount Field is displayed")
	public void checkDiscountFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
	    snp.Check_Notifications_Field_Displayed(snp.DiscountFieldText, "Discount", "Discount Field displayed successfully");
	}
	@Then("Check Void Field is displayed")
	public void checkVoidFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.VoidFieldText, "Void", "Void Field displayed successfully");
	}
	@Then("Check Max No Cash Drawer Accessed For No Sale Field is displayed")
	public void checkMaxNoCashDrawerAccessedForNoSaleFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.MaxNoCashDrawerAccessedForNoSaleFieldText, "Max No Cash Drawer Accessed For No Sale", "Max No Cash Drawer Accessed For No Sale Field displayed successfully");
	}
	@Then("Check Time Clock Field is displayed")
	public void checkTimeClockFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.TimeClockFieldText, "Time Clock", "Time Clock Field displayed successfully");
	}
	@Then("Check Daily KPI Field is displayed")
	public void checkDailyKPIFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.DailyKPIFieldText, "Daily KPI", "Daily KPI Field displayed successfully");
	}
	@Then("Check End Of the Day Alert Field is displayed")
	public void checkEndOfTheDayAlertFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.EndOftheDayAlertFieldText, "End Of the Day Alert", "End Of the Day Alert Field displayed successfully");
	}
	@Then("Check Wait List Field is displayed")
	public void checkWaitListFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.WaitListFieldText, "Wait List", "Wait List Field displayed successfully");
	}
	@Then("Check Sale Recap Report Field is displayed")
	public void checkSaleRecapReportFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.SaleRecapReportFieldText, "Sale Recap Report", "Sale Recap Report Field displayed successfully");
	}
	@Then("Check One Page PDF Field is displayed")
	public void checkOnePagePDFFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.OnePagePDFFieldText, "One Page PDF", "One Page PDF Field displayed successfully");
	}
	@Then("Check Offline Payment Field is displayed")
	public void checkOfflinePaymentFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Check_Notifications_Field_Displayed(snp.OfflinePaymentFieldText, "Offline Payment", "Offline Payment Field displayed successfully");
	}

	@Given("I Click Discount Field Toggle as No")
	public void iClickDiscountFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    snp.IClick_Toggle_No_Btn(snp.Discount_YesToggle, snp.Discount_NoToggle);
	}
	@Given("I Click Void Field Toggle as No")
	public void iClickVoidFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    snp.IClick_Toggle_No_Btn(snp.Void_YesToggle, snp.Void_NoToggle);
	}
	@Given("I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No")
	public void iClickMaxNoCashDrawerAccessedForNoSaleFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    snp.IClick_Toggle_No_Btn(snp.CashDrawer_YesToggle, snp.CashDrawer_NoToggle);
	}
	@Given("I Click Time Clock Field Toggle as No")
	public void iClickTimeClockFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 snp.IClick_Toggle_No_Btn(snp.TimeClock_YesToggle, snp.TimeClock_NoToggle);
	}
	@Given("I Click Daily KPI Field Toggle as No")
	public void iClickDailyKPIFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 snp.IClick_Toggle_No_Btn(snp.KPI_YesToggle, snp.KPI_NoToggle);
	}
	@Given("I Click End Of the Day Alert Field Toggle as No")
	public void iClickEndOfTheDayAlertFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 snp.IClick_Toggle_No_Btn(snp.EOD_YesToggle, snp.EOD_NoToggle);
	}
	@Given("I Click Wait List Field Toggle as No")
	public void iClickWaitListFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 snp.IClick_Toggle_No_Btn(snp.Wait_List_YesToggle, snp.Wait_List_NoToggle);
	}
	@Given("I Click Sale Recap Report Field Toggle as No")
	public void iClickSaleRecapReportFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 snp.IClick_Toggle_No_Btn(snp.SRR_YesToggle, snp.SRR_NoToggle);
	}
	@Given("I Click One Page PDF Field Toggle as No")
	public void iClickOnePagePDFFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 snp.IClick_Toggle_No_Btn(snp.OPP_YesToggle, snp.OPP_NoToggle);
	}
	@Given("I Click Offline Payment Field Toggle as No")
	public void iClickOfflinePaymentFieldToggleAsNo() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 snp.IClick_Toggle_No_Btn(snp.OfflinePayment_YesToggle, snp.OfflinePayment_NoToggle);
	}
	
	@Then("I Click SAVE btn")
	public void iClickSAVEBtn() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   snp.Iclick_SaveBtn_Notification();
	}
	
	@Then("I Verify Notifications SAVE button is Disabled")
	public void IVerifyNotificationsSAVEbuttonisDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   snp.Verify_Save_Button_Diabled_Notification();
	}
	
	@Then("I Verify Notifications SAVE button is Enabled")
	public void IVerifyNotificationsSAVEbuttonisEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   snp.Verify_Save_Button_Enabled_Notification();
	}
		
	
	
	@Then("I Verify Notification Settings SAVED Successfully")
	public void iVerifyNotificationSettingsSAVEDSuccessfully() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    snp.IVerify_NotificationSettingsSavedSuccessfully();	}

	@Given("I Click Discount Field Toggle as Yes")
	public void iClickDiscountFieldToggleAsYes() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    snp.IClick_Toggle_Yes_Btn(snp.Discount_YesToggle, snp.Discount_NoToggle);
	}
	
	@Given("I Enter Discount Limit")
	public void iEnterDiscountLimit() {
	    // Write code here that turns the phrase above into concrete actions
	    snp.IEnter_Limit(snp.Discount_Limit_Textbox, "0.5");
	}
	
	@Given("I Select Notify by Text for discount")
	public void iSelectNotifyByTextDiscount() {
	    // Write code here that turns the phrase above into concrete actions
	   snp.Iselect_CheckBox(snp.Discount_TextMsgs_Checkbox, "Discount Text");
	}
	
	@Given("I Select Notify by Text for void")
	public void iSelectNotifyByTextVoid() {
	    // Write code here that turns the phrase above into concrete actions
		   snp.Iselect_CheckBox(snp.Void_TextMsgs_CheckBox, "Void Text");
	}
	
	@Given("I Select Notify by Text for Cashdrawer")
	public void iSelectNotifyByTextCashdrawer() {
	    // Write code here that turns the phrase above into concrete actions
		  snp.Iselect_CheckBox(snp.Cash_TextMsgs_CheckBox, "Cashdrawer Text");
	}
	
	@Given("I Select Notify by Text for Time Clock")
	public void iSelectNotifyByTextTimeClock() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.TimeClock_PhoneMsgs_CheckBox, "Time Clock Text");
	}
	
	@Given("I Select Notify by Text for Daily KPI")
	public void iSelectNotifyByTextdailykpi() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.KPI_PhoneMsgs_CheckBox, "Daily KPI Text");
	}
	
	@Given("I Select Notify by Text for EOD")
	public void iSelectNotifyByTextEOD() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.EOD_PhoneMsgs_CheckBox, "End of the Day Alert Text");
	}
	
	
	@Given("I Select Notify by Text for Wait List")
	public void iSelectNotifyByTextWaitList() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.WaitList_PhoneMsgs_CheckBox, "Wait List Text");
	}
	
	
	
	@Given("I Enter Valid Mobile number for discount")
	public void iEnterValidMobileNumberdiscount() {
	    // Write code here that turns the phrase above into concrete actions
		 snp.IEnter_Mobilenumber(snp.Discount_Phone_no, "9789485860");
	}
	
	@Given("I Enter Valid Mobile number for void")
	public void iEnterValidMobileNumbervoid() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_Mobilenumber(snp.Void_Phoneno, "9789485860");
	}
	
	@Given("I Enter Valid Mobile number for Cashdrawer")
	public void iEnterValidMobileNumbercashdrawer() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_Mobilenumber(snp.CashDrawer_Phoneno, "9789485860");
	}
	
	@Given("I Enter Valid Mobile number for Wait List")
	public void iEnterValidMobileNumberWaitList() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_Mobilenumber(snp.WaitList_Phone, "9789485860");
	}
	
	@Given("I Enter Valid Mobile number for EOD")
	public void iEnterValidMobileNumberEOD() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_Mobilenumber(snp.EOD_Phoneno, "9789485860");
	}
	
	@Given("I Enter Valid Mobile number for Daily KPI")
	public void iEnterValidMobileNumberDailyKPI() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_Mobilenumber(snp.KPI_Phone, "9789485860");
	}
	
	@Given("I Enter Valid Mobile number for Time Clock")
	public void iEnterValidMobileNumberTimeclock() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_Mobilenumber(snp.TimeClock_Phone, "9789485860");
	}
	
	@Given("I Select Notify by Email for discount")
	public void iSelectNotifyByEmaildiscount() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.Discount_Emails_Checkbox, "Discount Email");
	}
	
	@Given("I Select Notify by Email for void")
	public void iSelectNotifyByEmailvoid() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.Void_EmailMsgs_CheckBox, "Void Email");
	}
	
	@Given("I Select Notify by Email for Cashdrawer")
	public void iSelectNotifyByEmailcashdrawer() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.Cash_EmailMsgs_CheckBox, "Cashdrawer Email");
	}
	
	@Given("I Select Notify by Email for OPP")
	public void iSelectNotifyByEmailvoidOPP() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.OPP_EmailMsgs_CheckBox, "One Page PDF Email");
	}
	
	@Given("I Select Notify by Email for SRR")
	public void iSelectNotifyByEmailvoidSRR() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.SRR_EmailMsgs_CheckBox, "Sale Recap Report Email");
	}
	
	@Given("I Select Notify by Email for Daily KPI")
	public void iSelectNotifyByEmailvoidDailyKPI() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.KPI_EmailMsgs_CheckBox, "Daily KPI Email");

	}
	

	@Given("I Select Notify by Email for Time Clock")
	public void iSelectNotifyByEmailTimeClock() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.TimeClock_EmailMsgs_CheckBox, "Time Clock Email");

	}
	
	@Given("I Select Notify by Email for EOD")
	public void iSelectNotifyByEmailEOD() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.EOD_EmailMsgs_CheckBox, "End of the Day Alert Email");

	}
	
	@Given("I Select Notify by Email for offline payment")
	public void iSelectNotifyByEmailofflinepayment() {
	    // Write code here that turns the phrase above into concrete actions
		snp.Iselect_CheckBox(snp.OfflinePayment_EmailMsgs_CheckBox, "Offline Payment Email");

	}
	
	@Given("I Enter Valid Email ID for discount")
	public void iEnterValidEmailIDdiscount() {
	    // Write code here that turns the phrase above into concrete actions
	    snp.IEnter_MailId(snp.Discount_Email, "din1@gmail.com");
	}
	
	@Given("I Enter Valid Email ID for void")
	public void iEnterValidEmailIDvoid() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_MailId(snp.Void_Email, "din2@gmail.com");
	}
	
	@Given("I Enter Valid Email ID for Cashdrawer")
	public void iEnterValidEmailIDCashdrawer() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_MailId(snp.CashDrawer_Email, "din3@gmail.com");
	}
	
	@Given("I Enter Valid Email ID for Daily KPI")
	public void iEnterValidEmailIDDailyKPI() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_MailId(snp.KPI_Email, "din4@gmail.com");
	}
	
	
	@Given("I Enter Valid Email ID for Time Clock")
	public void iEnterValidEmailIDTimeClock() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_MailId(snp.TimeClock_Email, "din5@gmail.com");
	}
	
	
	@Given("I Enter Valid Email ID for OPP")
	public void iEnterValidEmailIDOPP() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_MailId(snp.OPP_Email, "din6@gmail.com");
	}
	
	@Given("I Enter Valid Email ID for SRR")
	public void iEnterValidEmailIDSRR() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_MailId(snp.SRR_Email, "din7@gmail.com");
	}
	
		
	@Given("I Enter Valid Email ID for EOD")
	public void iEnterValidEmailIDEOD() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_MailId(snp.EOD_Email, "din8@gmail.com");
	}
	
	@Given("I Enter Valid Email ID for offline payment")
	public void iEnterValidEmailIDofflinepayment() {
	    // Write code here that turns the phrase above into concrete actions
		snp.IEnter_MailId(snp.OfflinePayment_Email, "din9@gmail.com");
	}

@Given("I Click Void Field Toggle as Yes")
public void iClickVoidFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
  snp.IClick_Toggle_Yes_Btn(snp.Void_YesToggle, snp.Void_NoToggle);
}

@Given("I Enter Void Limit")
public void iEnterVoidLimit() {
    // Write code here that turns the phrase above into concrete actions
    snp.IEnter_Limit(snp.Void_Limit, "1.6");
}

@Given("I Enter Void Limit with Negative Value")
public void iEnterVoidLimitWithNegativeValue() {
    // Write code here that turns the phrase above into concrete actions
	 snp.IEnter_Limit(snp.Void_Limit, "-2");
}
@Given("I Enter Void Limit with Characters")
public void iEnterVoidLimitWithCharacters() {
    // Write code here that turns the phrase above into concrete actions
	 snp.IEnter_Limit(snp.Void_Limit, "ab");
}

@Given("I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes")
public void iClickMaxNoCashDrawerAccessedForNoSaleFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IClick_Toggle_Yes_Btn(snp.CashDrawer_YesToggle, snp.CashDrawer_NoToggle);
}

@Given("I Enter Max No Cash Drawer Accessed For No Sale Limit")
public void iEnterMaxNoCashDrawerAccessedForNoSaleLimit() {
    // Write code here that turns the phrase above into concrete actions
	 snp.IEnter_Limit(snp.Cashdrawer_Limit, "30");
}


@Given("I Enter Max No Cash Drawer Accessed For No Sale Limit with Negative Value")
public void iEnterMaxNoCashDrawerAccessedForNoSaleLimitWithNegativeValue() {
    // Write code here that turns the phrase above into concrete actions
	 snp.IEnter_Limit(snp.Cashdrawer_Limit, "-3");
}

@Given("I Enter Max No Cash Drawer Accessed For No Sale Limit with Greater Value")
public void iEnterMaxNoCashDrawerAccessedForNoSaleLimitWithGreaterValue() {
    // Write code here that turns the phrase above into concrete actions
	 snp.IEnter_Limit(snp.Cashdrawer_Limit, "1001");
}

@Given("I Verify Max No Cash Drawer Accessed For No Sale Limit Error Message")
public void iEnterMaxNoCashDrawerAccessedForNoSaleLimitError() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 snp.IVerify_LimitError(snp.Cashdrawer_LimitError, " Enter valid limit and it should be between -1 to 1000 ");
}

@Given("I Enter Max No Cash Drawer Accessed For No Sale Limit with Characters")
public void iEnterMaxNoCashDrawerAccessedForNoSaleLimitWithCharacters() {
    // Write code here that turns the phrase above into concrete actions
	 snp.IEnter_Limit(snp.Cashdrawer_Limit, "c");
}

@Given("I Click Time Clock Field Toggle as Yes")
public void iClickTimeClockFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IClick_Toggle_Yes_Btn(snp.TimeClock_YesToggle, snp.TimeClock_NoToggle);
}
@Given("I Click Daily KPI Field Toggle as Yes")
public void iClickDailyKPIFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(snp.KPI_YesToggle, snp.KPI_NoToggle);
}
@Given("I Click End Of the Day Alert Field Toggle as Yes")
public void iClickEndOfTheDayAlertFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(snp.EOD_YesToggle, snp.EOD_NoToggle);
}


@Given("I Click Wait List Field Toggle as Yes")
public void iClickWaitListFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(snp.Wait_List_YesToggle, snp.Wait_List_NoToggle);
}
@Given("I Enter Custom Text")
public void iEnterCustomText() {
    // Write code here that turns the phrase above into concrete actions
    snp.IEnter_CustomText(snp.Wait_List_Text, "Queued");
}

@Given("I Click Sale Recap Report Field Toggle as Yes")
public void iClickSaleRecapReportFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(snp.SRR_YesToggle, snp.SRR_NoToggle);
}

@Given("I Click One Page PDF Field Toggle as Yes")
public void iClickOnePagePDFFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(snp.OPP_YesToggle, snp.OPP_NoToggle);
}


@Given("I Click Offline Payment Field Toggle as Yes")
public void iClickOfflinePaymentFieldToggleAsYes() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IClick_Toggle_Yes_Btn(snp.OfflinePayment_YesToggle, snp.OfflinePayment_NoToggle);
}


@Given("I Enter Discount Limit with Negative Value")
public void iEnterDiscountLimitWithNegativeValue() {
    // Write code here that turns the phrase above into concrete actions
    snp.IEnter_Limit(snp.Discount_Limit_Textbox, "-1");
}

@Given("I Enter Discount Limit with Characters")
public void iEnterDiscountLimitWithCharacters() {
    // Write code here that turns the phrase above into concrete actions
    snp.IEnter_Limit(snp.Discount_Limit_Textbox, "ee");
}

@Given("I Enter Mobile number with one digit for discount")
public void iEnterMobileNumberWithOneDigitdiscount() {
    // Write code here that turns the phrase above into concrete actions
    snp.IEnter_Mobilenumber(snp.Discount_Phone_no, "9");
}

@Given("I Enter Mobile number with one digit for void")
public void iEnterMobileNumberWithOneDigitvoid() {
    // Write code here that turns the phrase above into concrete actions
    snp.IEnter_Mobilenumber(snp.Void_Phoneno, "e");
}


@Given("I Enter Mobile number with one digit for Daily KPI")
public void iEnterMobileNumberWithOneDigitDailyKPI() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.KPI_Phone, "@");
}

@Given("I Enter Mobile number with one digit for Time Clock")
public void iEnterMobileNumberWithOneDigitTimeClock() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.TimeClock_Phone, "978958,");
}

@Given("I Enter Mobile number with one digit for Wait List")
public void iEnterMobileNumberWithOneDigitWaitList() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.WaitList_Phone, "978958,eeewsq");
}

@Given("I Enter Mobile number with one digit for Cashdrawer")
public void iEnterMobileNumberWithOneDigitCashdrawer() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.CashDrawer_Phoneno, "962932,@#@#!$");
}

@Given("I Enter Mobile number with one digit for EOD")
public void iEnterMobileNumberWithOneDigitEOD() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.EOD_Phoneno, "8");
}


@Then("I Verify Enter Valid Phone Number Error message for discount")
public void iVerifyEnterValidPhoneNumberErrorMessagediscount() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    snp.IVerify_PhonenumberError(snp.Phoneno_Error, "Enter Valid Phone Number");
}

@Then("I Verify Enter Valid Phone Number Error message for void")
public void iVerifyEnterValidPhoneNumberErrorMessagevoid() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Error, "Enter Valid Phone Number");
}

@Then("I Verify Enter Valid Phone Number Error message for Daily KPI")
public void iVerifyEnterValidPhoneNumberErrorMessageDailyKPI() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Error, "Enter Valid Phone Number");
}

@Then("I Verify Enter Valid Phone Number Error message for Time Clock")
public void iVerifyEnterValidPhoneNumberErrorMessageTimeClock() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Error, "Enter Valid Phone Number");
}

@Then("I Verify Enter Valid Phone Number Error message for EOD")
public void iVerifyEnterValidPhoneNumberErrorMessageEOD() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Error, "Enter Valid Phone Number");
}

@Then("I Verify Enter Valid Phone Number Error message for Cashdrawer")
public void iVerifyEnterValidPhoneNumberErrorMessageCashdrawer() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Error, "Enter Valid Phone Number");
}


@Then("I Verify Enter Valid Phone Number Error message for Wait List")
public void iVerifyEnterValidPhoneNumberErrorMessageWaitList() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Error, "Enter Valid Phone Number");
}

@Given("I Enter Mobile number with less than {int} digit for discount")
public void iEnterMobileNumberWithLessThanDigitdiscount(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.Discount_Phone_no, "81");
}

@Given("I Enter Mobile number with less than {int} digit for void")
public void iEnterMobileNumberWithLessThanDigitvoid(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.Void_Phoneno, "72412");
}

@Given("I Enter Mobile number with less than {int} digit for Daily KPI")
public void iEnterMobileNumberWithLessThanDigitDailyKPI(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.KPI_Phone, "775412,91");
}

@Given("I Enter Mobile number with less than {int} digit for Time Clock")
public void iEnterMobileNumberWithLessThanDigitTimeClock(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.TimeClock_Phone, "775412,@&");
}

@Given("I Enter Mobile number with less than {int} digit for EOD")
public void iEnterMobileNumberWithLessThanDigitEOD(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.EOD_Phoneno, "@#$%!");
}

@Given("I Enter Mobile number with less than {int} digit for Wait List")
public void iEnterMobileNumberWithLessThanDigitWaitList(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.WaitList_Phone, "ewe");
}

@Given("I Enter Mobile number with less than {int} digit for Cashdrawer")
public void iEnterMobileNumberWithLessThanDigitCashdrawer(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.CashDrawer_Phoneno, "775412,@&");
}

@Then("I Verify Phone Number Should Be Contain At Least {int} Digits Error message for discount")
public void iVerifyPhoneNumberShouldBeContainAtLeastDigitsErrorMessagediscount(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Empty_Error, "Phone Number Should Be Contain At Least 6 Digits");
}

@Then("I Verify Phone Number Should Be Contain At Least {int} Digits Error message for void")
public void iVerifyPhoneNumberShouldBeContainAtLeastDigitsErrorMessagevoid(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Empty_Error, "Phone Number Should Be Contain At Least 6 Digits");
}

@Then("I Verify Phone Number Should Be Contain At Least {int} Digits Error message for Cashdrawer")
public void iVerifyPhoneNumberShouldBeContainAtLeastDigitsErrorMessagecashdrawer(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Empty_Error, "Phone Number Should Be Contain At Least 6 Digits");
}



@Then("I Verify Phone Number Should Be Contain At Least {int} Digits Error message for Time Clock")
public void iVerifyPhoneNumberShouldBeContainAtLeastDigitsErrorMessageTimeClock(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Empty_Error, "Phone Number Should Be Contain At Least 6 Digits");
}

@Then("I Verify Phone Number Should Be Contain At Least {int} Digits Error message for Wait List")
public void iVerifyPhoneNumberShouldBeContainAtLeastDigitsErrorMessageWaitList(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Empty_Error, "Phone Number Should Be Contain At Least 6 Digits");
}

@Then("I Verify Phone Number Should Be Contain At Least {int} Digits Error message for EOD")
public void iVerifyPhoneNumberShouldBeContainAtLeastDigitsErrorMessageEOD(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Empty_Error, "Phone Number Should Be Contain At Least 6 Digits");
}

@Then("I Verify Phone Number Should Be Contain At Least {int} Digits Error message for Daily KPI")
public void iVerifyPhoneNumberShouldBeContainAtLeastDigitsErrorMessagedailyKPI(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	snp.IVerify_PhonenumberError(snp.Phoneno_Empty_Error, "Phone Number Should Be Contain At Least 6 Digits");
}


@Given("I Enter more than one Phone number for discount")
public void iEnterMoreThanOnePhoneNumberdiscount() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.Discount_Phone_no, "978948,9629322");
}

@Given("I Enter more than one Phone number for void")
public void iEnterMoreThanOnePhoneNumbervoid() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.Void_Phoneno, "878948,8629322");
}

@Given("I Enter more than one Phone number for Cashdrawer")
public void iEnterMoreThanOnePhoneNumberCashdrawer() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.CashDrawer_Phoneno, "878948,8629322,9789485860");
}

@Given("I Enter more than one Phone number for Wait List")
public void iEnterMoreThanOnePhoneNumberWaitList() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.WaitList_Phone, "878948,8629322,9789485860,56765622");
}

@Given("I Enter more than one Phone number for Daily KPI")
public void iEnterMoreThanOnePhoneNumberDailyKPI() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.KPI_Phone, "878948,8629322,9789485860,56765622,912345621");
}

@Given("I Enter more than one Phone number for EOD")
public void iEnterMoreThanOnePhoneNumberEOD() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.EOD_Phoneno, "9789485860,56765622,912345621");
}

@Given("I Enter more than one Phone number for Time Clock")
public void iEnterMoreThanOnePhoneNumberTimeClock() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_Mobilenumber(snp.TimeClock_Phone, "9789485860,56765622,912345621");
}


@Given("I Enter Invalid Email ID for discount")
public void iEnterInvalidEmailIDdiscount() {
// Write code here that turns the phrase above into concrete actions
snp.IEnter_MailId(snp.Discount_Email, "111222");
}

@Given("I Enter Invalid Email ID for offline payment")
public void iEnterInvalidEmailIDofflinepayment() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.OfflinePayment_Email, "#@#$$$$");
}

@Given("I Enter Invalid Email ID for void")
public void iEnterInvalidEmailIDvoid() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.Void_Email, "dine@");
}

@Given("I Enter Invalid Email ID for Cashdrawer")
public void iEnterInvalidEmailIDcashdrawer() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.CashDrawer_Email, "#@#$$$$");
}

@Given("I Enter Invalid Email ID for Time Clock")
public void iEnterInvalidEmailIDTimeClock() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.TimeClock_Email, "dine@g.com,");
}

@Given("I Enter Invalid Email ID for Daily KPI")
public void iEnterInvalidEmailIDDailyKPI() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.TimeClock_Email, "dine@g.com,dddd@w.com");
}

@Given("I Enter Invalid Email ID for OPP")
public void iEnterInvalidEmailIDOPP() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.OPP_Email, "dine@g.com,");
}

@Given("I Enter Invalid Email ID for SRR")
public void iEnterInvalidEmailIDSRR() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.SRR_Email, "dine@g.");
}

@Given("I Enter Invalid Email ID for EOD")
public void iEnterInvalidEmailIDEOD() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.EOD_Email, "12@");
}

@Given("I Enter Invalid Email ID for Wait List")
public void iEnterInvalidEmailIDwaitlist() {
// Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.OPP_Email, "232!@");
}



@Then("I Verify Enter Valid Email Error message for discount")
public void iVerifyEnterValidEmailErrorMessagediscount() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}

@Then("I Verify Enter Valid Email Error message for offline payment")
public void iVerifyEnterValidEmailErrorMessageofflinepayment() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}


@Then("I Verify Enter Valid Email Error message for void")
public void iVerifyEnterValidEmailErrorMessagevoid() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}


@Then("I Verify Enter Valid Email Error message for Time Clock")
public void iVerifyEnterValidEmailErrorMessageTimeClock() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}


@Then("I Verify Enter Valid Email Error message for Daily KPI")
public void iVerifyEnterValidEmailErrorMessageDailyKPI() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}


@Then("I Verify Enter Valid Email Error message for WaitList")
public void iVerifyEnterValidEmailErrorMessageWaitlist() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}

@Then("I Verify Enter Valid Email Error message for OPP")
public void iVerifyEnterValidEmailErrorMessageOPP() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}

@Then("I Verify Enter Valid Email Error message for SRR")
public void iVerifyEnterValidEmailErrorMessageSRR() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}

@Then("I Verify Enter Valid Email Error message for EOD")
public void iVerifyEnterValidEmailErrorMessageEOD() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}

@Then("I Verify Enter Valid Email Error message for Cashdrawer")
public void iVerifyEnterValidEmailErrorMessageCashdrawer() throws InterruptedException {
// Write code here that turns the phrase above into concrete actions
	snp.IVerify_EmailError(snp.Email_Error, "Enter Valid Email");
}


@Given("I Enter more than one valid EMailId for Daily KPI")
public void iEnterMoreThanOneValidEMailIdDailyKPI() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.KPI_Email, "dine@g.com,dinu@gmail.com");
}

@Given("I Enter more than one valid EMailId for offline payment")
public void iEnterMoreThanOneValidEMailIdofflinepayment() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.OfflinePayment_Email, "dine@g.com,dinu@gmail.com,1243@yahoo.com");
}

@Given("I Enter more than one valid EMailId for discount")
public void iEnterMoreThanOneValidEMailIddiscount() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.Discount_Email, "dine1@g.com,dinu@gmail.com");
}

@Given("I Enter more than one valid EMailId for void")
public void iEnterMoreThanOneValidEMailIdvoid() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.Void_Email, "dine@g.com,dinu@gmail.com,1we3@yahoo.com");
}

@Given("I Enter more than one valid EMailId for Cashdrawer")
public void iEnterMoreThanOneValidEMailIdcashdrawer() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.CashDrawer_Email, "dine@g.com,dinu@gmail.com,1243@yahoo.com");
}

@Given("I Enter more than one valid EMailId for Time Clock")
public void iEnterMoreThanOneValidEMailIdTimeClock() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.TimeClock_Email, "dine@g.com,dinu@gmail.com,1233@yahoo.com");
}


@Given("I Enter more than one valid EMailId for SRR")
public void iEnterMoreThanOneValidEMailIdSRR() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.SRR_Email, "dine@g.com,dinu@gmail.com,1243@yahoo.com");
}

@Given("I Enter more than one valid EMailId for OPP")
public void iEnterMoreThanOneValidEMailIdOPP() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.OPP_Email, "dine@g.com,dinu@gmail.com,1243@yahoo.com,yty@goo.com");
}

@Given("I Enter more than one valid EMailId for EOD")
public void iEnterMoreThanOneValidEMailIdEOD() {
    // Write code here that turns the phrase above into concrete actions
	snp.IEnter_MailId(snp.EOD_Email, "dine@g.com,dinu@gmail.com,1243@yahoo.com,yty@goo.com,yth@din.com");
}

}