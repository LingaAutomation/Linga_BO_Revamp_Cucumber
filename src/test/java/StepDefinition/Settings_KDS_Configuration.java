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

public class Settings_KDS_Configuration {

	
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
	
@Given("Open the Settings - KDS Configuration Settings Home Page BaseURL and storeID")
public void openTheSettingsKDSConfigurationsHomePageBaseURLAndStoreID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   kdsc.openTheSettingsKdsConfigurationPageBaseURLAndStoreID();
	try {
	cmp.Close_Online_Help_ChatBox();}
	catch(Exception K) {}
}

@Given("Verifying  KDS Configuration Page Header")
public void verifyingKDSConfigurationPageHeader() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyMainScreenPageHeader("KDS Configuration");
}

@Given("I Verify Update button is disabled")
public void iVerifyUpdateButtonIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Update_Button_disabled_KDS();
}

@Given("I Verify Update button is enabled")
public void iVerifyUpdateButtonIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Update_Button_Enabled_KDS();
}

@Then("Verify Field Options Page Header")
public void verifyFieldOptionsPageHeader() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.CheckHeader_FieldOptions_KDS();
}
@Then("I Click Field Options")
public void iClickFieldOptions() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Click_FieldOptions_KDS();
}

@Given("I Click Style Options")
public void iClickStyleOptions() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Click_StyleOptions_KDS();
}
@Then("Verify Style Options Page Header")
public void verifyStyleOptionsPageHeader() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.CheckHeader_StyleOptions_KDS();
}

@Given("I Click SMS Order Notifications Options")
public void iClickSMSOrderNotificationsOptions() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Click_SMS_Order_Notifications_KDS();
}
@Then("Verify SMS Order Notifications Page Header")
public void verifySMSOrderNotificationsPageHeader() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.CheckHeader_SMS_Order_Notifications_KDS();
}

@Then("Check Field Options Table Name displayed")
public void verifyFieldOptionsTableNameDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Table_Name_Option_KDS();
}
@Then("Check Field Options Service Type displayed")
public void verifyFieldOptionsServiceTypeDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Service_Type_Option_KDS();
}
@Then("Check Field Options Check Number displayed")
public void verifyFieldOptionsCheckNumberDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Check_Number_Option_KDS();
}
@Then("Check Field Options Seat Number displayed")
public void verifyFieldOptionsSeatNumberDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Seat_Number_Option_KDS();
}
@Then("Check Field Options Time displayed")
public void verifyFieldOptionsTimeDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Time_Option_KDS();
}
@Then("Check Field Options Notes displayed")
public void verifyFieldOptionsNotesDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Notes_Option_KDS();
}
@Then("Check Field Options Server Name displayed")
public void verifyFieldOptionsServerNameDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Server_Name_Option_KDS();
}
@Then("Check Field Options KDS DoneButton displayed")
public void verifyFieldOptionsKDSDoneButtonDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_KDS_Done_Btn_Option_KDS();
}
@Then("Check Field Options KDS Ticket preview displayed")
public void verifyFieldOptionsKDSTicketPreviewDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_KDS_Ticket_Preview_KDS();
}


@Given("I Select the Field Options Table Name Check box")
public void iSelectTheFieldOptionsTableNameCheckBox() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //kdsc.IselectTableName_CheckBox();
	kdsc.IselectTableName_CheckBox();
}

@Then("I Verify Table Name displayed in the KDS Ticket PreviewTable")
public void iVerifyTableNameDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_TableName_KDS_Ticket_Preview();
}

@Then("I Select the Field Options Service Type Check box")
public void iSelectTheFieldOptionsServiceTypeCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IselectService_Type_CheckBox();
}

@Then("I Verify Service Type displayed in the KDS Ticket PreviewTable")
public void iVerifyServiceTypeDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_ServiceType_KDS_Ticket_Preview();
}

@Then("I Select the Field Options Check Number Check box")
public void iSelectTheFieldOptionsCheckNumberCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IselectCheckNumber_CheckBox();
}

@Then("I Verify Check Number displayed in the KDS Ticket PreviewTable")
public void iVerifyCheckNumberDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_CheckNumber_KDS_Ticket_Preview();
}

@Then("I Select the Field Options Seat Number Check box")
public void iSelectTheFieldOptionsSeatNumberCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Iselect_SeatNumber_CheckBox();
}

@Then("I Verify Seat Number displayed in the KDS Ticket PreviewTable")
public void iVerifySeatNumberDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_SeatNumber_KDS_Ticket_Preview();
}

@Then("I Select the Field Options Time Check box")
public void iSelectTheFieldOptionsTimeCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Iselect_Time_CheckBox();
}

@Then("I Verify Time displayed in the KDS Ticket PreviewTable")
public void iVerifyTimeDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_Time_KDS_Ticket_Preview();
}

@Then("I Select the Field Options Notes Check box")
public void iSelectTheFieldOptionsNotesCheckBox() {
    // Write code here that turns the phrase above into concrete actions
   kdsc.Iselect_Notes_CheckBox();
}

@Then("I Verify Notes displayed in the KDS Ticket PreviewTable")
public void iVerifyNotesDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_Notes_KDS_Ticket_Preview();
}

@Then("I Select the Field Options Server Name Check box")
public void iSelectTheFieldOptionsServerNameCheckBox() {
    // Write code here that turns the phrase above into concrete actions
  kdsc.Iselect_ServerName_CheckBox();
}

@Then("I Verify Server Name displayed in the KDS Ticket PreviewTable")
public void iVerifyServerNameDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_ServerName_KDS_Ticket_Preview();
}

@Then("I Select the Field Options KDS DoneButton Check box")
public void iSelectTheFieldOptionsKDSDoneButtonCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Iselect_KDSDOneBtn_CheckBox();
}

@Then("I Verify KDS DoneButton displayed in the KDS Ticket PreviewTable")
public void iVerifyKDSDoneButtonDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_KDSDoneBtn_KDS_Ticket_Preview();
}

@Then("I Click Update button")
public void iClickUpdateButton() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Click_Update_Button_KDS();
}

@Then("I Verify KDS Configuration settings saved successfully")
public void iVerifyKDSConfigurationSettingsSavedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.iVerifyKDSConfigurationSettingsSavedSuccessfully();
}

@Given("I UnSelect the Field Options Table Name Check box")
public void iUnSelectTheFieldOptionsTableNameCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUnselectTableName_CheckBox();
}

@Then("I Verify Table Name not displayed in the KDS Ticket PreviewTable")
public void iVerifyTableNameNotDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_NotTableName_KDS_Ticket_Preview();
}

@Then("I UnSelect the Field Options Service Type Check box")
public void iUnSelectTheFieldOptionsServiceTypeCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUnselectService_Type_CheckBox();
}

@Then("I Verify Service Type not displayed in the KDS Ticket PreviewTable")
public void iVerifyServiceTypeNotDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_NotServiceType_KDS_Ticket_Preview();
}

@Then("I UnSelect the Field Options Check Number Check box")
public void iUnSelectTheFieldOptionsCheckNumberCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUnselectCheckNumber_CheckBox();
}

@Then("I Verify Check Number not displayed in the KDS Ticket PreviewTable")
public void iVerifyCheckNumberNotDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_NotCheckNumber_KDS_Ticket_Preview();
}

@Then("I UnSelect the Field Options Seat Number Check box")
public void iUnSelectTheFieldOptionsSeatNumberCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUnselect_SeatNumber_CheckBox();
}

@Then("I Verify Seat Number not displayed in the KDS Ticket PreviewTable")
public void iVerifySeatNumberNotDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_NotSeatNumber_KDS_Ticket_Preview();
}

@Then("I UnSelect the Field Options Time Check box")
public void iUnSelectTheFieldOptionsTimeCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUnselect_Time_CheckBox();
}

@Then("I Verify Time not displayed in the KDS Ticket PreviewTable")
public void iVerifyTimeNotDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_NotTime_KDS_Ticket_Preview();
}

@Then("I UnSelect the Field Options Notes Check box")
public void iUnSelectTheFieldOptionsNotesCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUnselect_Notes_CheckBox();
}

@Then("I Verify Notes not displayed in the KDS Ticket PreviewTable")
public void iVerifyNotesNotDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_NotNotes_KDS_Ticket_Preview();
}

@Then("I UnSelect the Field Options Server Name Check box")
public void iUnSelectTheFieldOptionsServerNameCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUnselect_ServerName_CheckBox();
}

@Then("I Verify Server Name not displayed in the KDS Ticket PreviewTable")
public void iVerifyServerNameNotDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_NotServerName_KDS_Ticket_Preview();
}

@Then("I UnSelect the Field Options KDS DoneButton Check box")
public void iUnSelectTheFieldOptionsKDSDoneButtonCheckBox() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUnselect_KDSDOneBtn_CheckBox();
}

@Then("I Verify KDS DoneButton not displayed in the KDS Ticket PreviewTable")
public void iVerifyKDSDoneButtonNotDisplayedInTheKDSTicketPreviewTable() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Verify_tble_NotKDSDoneBtn_KDS_Ticket_Preview();
}


@Then("Check Field Options HorizontalViewforModifier displayed")
public void checkFieldOptionsHorizontalViewforModifierDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_HorizontalViewforModifier_Text_KDS();
}
@Then("Check Field Options Disable KDS Broadcast displayed")
public void checkFieldOptionsDisableKDSBroadcastDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Disable_KDS_Broadcast_Text_KDS();
}

@When("I select Horizontal View for Modifier Toggle as YES")
public void IselectHorizontalViewforModifierToggleasYES() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickHorizontalViewforModifier_Toggle_Yes_Btn();
}

@When("I select Horizontal View for Modifier Toggle as NO")
public void IselectHorizontalViewforModifierToggleasNo() throws Exception {
    // Write code here that turns the phrase above into concrete actions
kdsc.IClickHorizontalViewforModifier_Toggle_No_Btn(); 
}

@Then("Verify Horizontal View for Modifier Toggle is Enabled")
public void verifyHorizontalViewForModifierToggleIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	kdsc.CheckHorizontalViewforModifier_Toggle_Enabled("Horizontal View for Modifier");
}

@Then("Verify Horizontal View for Modifier Toggle is Disabled")
public void verifyHorizontalViewForModifierToggleIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	kdsc.CheckHorizontalViewforModifier_Toggle_Disabled("Horizontal View for Modifier");
}

@When("I select Disable KDS Broadcast Toggle as YES")
public void IselectDisableKDSBroadcastToggleasYes() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickDisable_KDS_Broadcast_Toggle_Yes_Btn();
}

@When("I select Disable KDS Broadcast Toggle as No")
public void IselectDisableKDSBroadcastToggleasNo() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	   kdsc.IClickDisable_KDS_Broadcast_Toggle_No_Btn();
	   }

@Then("Verify Disable KDS Broadcast Toggle is Enabled")
public void verifyDisableKDSBroadcastToggleIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    kdsc.CheckDisableKDSBroadcast_Toggle_Enabled("Disable KDS Broadcast");
}

@Then("Verify Disable KDS Broadcast Toggle is Disabled")
public void verifyDisableKDSBroadcastToggleIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	kdsc.CheckDisableKDSBroadcast_Toggle_Disabled("Disable KDS Broadcast");
}


@Then("Check Modifier Color field is displayed")
public void iVerifyModifierColorFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_ModifierColor_KDS();
}
@Then("Check Addon Color field is displayed")
public void iVerifyAddonColorFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_AddonColor_KDS();
}

@Then("Check Status1 field is displayed")
public void iVerifyStatus1FieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Status1_KDS();
}

@Then("Check Status2 field is displayed")
public void iVerifyStatus2FieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	kdsc.Check_Status2_KDS();
}

@Then("Check Status3 field is displayed")
public void iVerifyStatus3FieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	kdsc.Check_Status3_KDS();
}


@Then("Check Status1-Status Color field is displayed")
public void iVerifyStatus1StatusColorFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_StatusColor1_Text_KDS();
}

@Then("Check Status1-AfterMins field is displayed")
public void iVerifyStatus1AfterMinsFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Status1AfterMins_Text_KDS();
}
@Then("Check Status2-Status Color field is displayed")
public void iVerifyStatus2StatusColorFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	kdsc.Check_StatusColor2_Text_KDS();
}
@Then("Check Status2-AfterMins field is displayed")
public void iVerifyStatus2AfterMinsFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	kdsc.Check_Status2AfterMins_Text_KDS();
}
@Then("Check Status3-Status Color field is displayed")
public void iVerifyStatus3StatusColorFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	kdsc.Check_StatusColor3_Text_KDS();
}
@Then("Check Status3-AfterMins field is displayed")
public void iVerifyStatus3AfterMinsFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
	kdsc.Check_Status3AfterMins_Text_KDS();
}

@Given("I Update Modifier Color and Verify displayed in the Tile and KDS Ticket PreviewTable")
public void iUpdateModifierColorandVerify() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IupdateModifierColor();
}


@Given("I Update Addon Color and Verify displayed in the Tile and KDS Ticket PreviewTable")
public void iUpdateAddonColorandVerify() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IupdateAddOnColor();
}

@Given("I Update Status1 Color and Verify updated in Status1 Tile")
public void iUpdateStatus1ColorandVerifyTile() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IupdateStatus1Color();
}

@Given("I Update Status2 Color and Verify updated in Status2 Tile")
public void iUpdateStatus2ColorandVerifyTile() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IupdateStatus2Color();
}

@Given("I Update Status3 Color and Verify updated in Status3 Tile")
public void iUpdateStatus3ColorandVerifyTile() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IupdateStatus3Color();
}

@Then("I Update Status1 AfterMins and Verify")
public void iUpdateStatus1AfterMinsAndVerify() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMins_Status1();
}

@Then("I Update Status2 AfterMins and Verify")
public void iUpdateStatus2AfterMinsAndVerify() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMins_Status2();
}

@Then("I Update Status3 AfterMins and Verify")
public void iUpdateStatus3AfterMinsAndVerify() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMins_Status3();
}


@Given("I Increase Status1 AfterMins and Verify")
public void iIncreaseStatus1AfterMins() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinsIncrease_Status1();
}

@Given("I Increase Status2 AfterMins and Verify")
public void iIncreaseStatus2AfterMins() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinsIncrease_Status2();
}

@Given("I Increase Status3 AfterMins and Verify")
public void iIncreaseStatus3AfterMins() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinsIncrease_Status3();
}

@Given("I Decrease Status1 AfterMins and Verify")
public void iDecreaseStatus1AfterMins() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinsDecrease_Status1();
}

@Given("I Decrease Status2 AfterMins and Verify")
public void iDecreaseStatus2AfterMins() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinsDecrease_Status2();
}

@Given("I Decrease Status3 AfterMins and Verify")
public void iDecreaseStatus3AfterMins() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinsDecrease_Status3();
}

@Given("I Update Status1 AfterMins with Character and Verify")
public void iUpdateStatus1AfterMinsWithCharacter() {
    // Write code here that turns the phrase above into concrete actions
   kdsc.IUpdateAfterMinswithCharacters_Status1();
}

@Given("I Update Status2 AfterMins with Character and Verify")
public void iUpdateStatus2AfterMinsWithCharacter() {
    // Write code here that turns the phrase above into concrete actions
   kdsc.IUpdateAfterMinswithCharacters_Status2();
}

@Given("I Update Status3 AfterMins with Character and Verify")
public void iUpdateStatus3AfterMinsWithCharacter() {
    // Write code here that turns the phrase above into concrete actions
   kdsc.IUpdateAfterMinswithCharacters_Status3();
}

@Given("I Update Status1 AfterMins with Negative Value and Verify")
public void iUpdateStatus1AfterMinsWithNegativeValue() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinswithNegValue_Status1();
}

@Given("I Update Status2 AfterMins with Negative Value and Verify")
public void iUpdateStatus2AfterMinsWithNegativeValue() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinswithNegValue_Status2();
}

@Given("I Update Status3 AfterMins with Negative Value and Verify")
public void iUpdateStatus3AfterMinsWithNegativeValue() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IUpdateAfterMinswithNegValue_Status3();
}

@Then("Check Customer Arrived Notification is displayed")
public void iVerifyCustomerArrivedNotificationIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_CustomerArrivedNotification_KDS();
}

@Then("Check Completed Order: QSR is displayed")
public void iVerifyCompletedOrderQSRIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Completed_Order_QSR_KDS();
}

@Then("Check Completed Order: Table Service is displayed")
public void iVerifyCompletedOrderTableServiceIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Completed_Order_TableService_KDS();
}

@Then("Check Completed Order: Online Order is displayed")
public void iVerifyCompletedOrderOnlineOrderIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Completed_Order_Online_KDS();
}

@Then("Check Completed Order: Delivery Order is displayed")
public void iVerifyCompletedOrderDeliveryOrderIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Completed_Order_Delivery_KDS();
}

@Then("Check Completed Order: To Go Order is displayed")
public void iVerifyCompletedOrderToGoOrderIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Completed_Order_ToGo_KDS();
}

@Then("Check Completed Order: For Here Order is displayed")
public void iVerifyCompletedOrderForHereOrderIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Completed_Order_ForHere_KDS();
}

@Then("Check Completed Order: Bar Tab Order is displayed")
public void iVerifyCompletedOrderBarTabOrderIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.Check_Completed_Order_BarTab_KDS();
}


@Given("I Select Customer Arrived Notification Toggle as NO")
public void iSelectCustomerArrivedNotificationToggleAsNO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCustomerArrivedNotificationToggle_No_Btn();
}

@Given("I Select Completed Order: QSR is displayed as NO")
public void iSelectCompletedOrderQSRIsDisplayedAsNO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	kdsc.IClickCompleted_Order_QSRToggle_No_Btn();
}

@Given("I Select Completed Order: Table Service is displayed as NO")
public void iSelectCompletedOrderTableServiceIsDisplayedAsNO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   kdsc.IClickCompleted_Order_TableServiceToggle_No_Btn();
}

@Given("I Select Completed Order: Online Order is displayed as NO")
public void iSelectCompletedOrderOnlineOrderIsDisplayedAsNO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   kdsc.IClickCompleted_Order_OnlineToggle_No_Btn();
}

@Given("I Select Completed Order: Delivery Order is displayed as NO")
public void iSelectCompletedOrderDeliveryOrderIsDisplayedAsNO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_DeliveryToggle_No_Btn();
}

@Given("I Select Completed Order: To Go Order is displayed as NO")
public void iSelectCompletedOrderToGoOrderIsDisplayedAsNO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_ToGoToggle_No_Btn();
}

@Given("I Select Completed Order: For Here Order is displayed as NO")
public void iSelectCompletedOrderForHereOrderIsDisplayedAsNO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_ForHereToggle_No_Btn();
}
@Given("I Select Completed Order: Bar Tab Order is displayed as NO")
public void iSelectCompletedOrderBarTabOrderIsDisplayedAsNO() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   kdsc.IClickCompleted_Order_BarTabToggle_No_Btn();
}

@Given("I Select Customer Arrived Notification Toggle as YES")
public void iSelectCustomerArrivedNotificationToggleAsYES() {
    // Write code here that turns the phrase above into concrete actions
    kdsc.CustomerArrivedNotification_Yes_Toggle();
}
@Given("I Select Completed Order: QSR is displayed as YES and Enter Message")
public void iSelectCompletedOrderQSRIsDisplayedAsYES() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_QSRToggle_Yes_Btn();
}

@Given("I Select Completed Order: Table Service is displayed as YES and Enter Message")
public void iSelectCompletedOrderTableServiceIsDisplayedAsYES() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   kdsc.IClickCompleted_Order_TableServiceToggle_Yes_Btn();
}

@Given("I Select Completed Order: Online Order is displayed as YES and Enter Message")
public void iSelectCompletedOrderOnlineOrderIsDisplayedAsYES() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_OnlineToggle_Yes_Btn();
}

@Given("I Select Completed Order: Delivery Order is displayed as YES and Enter Message")
public void iSelectCompletedOrderDeliveryOrderIsDisplayedAsYES() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_DeliveryToggle_Yes_Btn();
}

@Given("I Select Completed Order: To Go Order is displayed as YES and Enter Message")
public void iSelectCompletedOrderToGoOrderIsDisplayedAsYES() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_ToGoToggle_Yes_Btn();
}

@Given("I Select Completed Order: For Here Order is displayed as YES and Enter Message")
public void iSelectCompletedOrderForHereOrderIsDisplayedAsYES() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_ForHereToggle_Yes_Btn();
}

@Given("I Select Completed Order: Bar Tab Order is displayed as YES and Enter Message")
public void iSelectCompletedOrderBarTabOrderIsDisplayedAsYES() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    kdsc.IClickCompleted_Order_BarTabToggle_Yes_Btn();
}

}