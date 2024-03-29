package StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Front_End_Receipt_TemplatePage;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Kitchen_Printers 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	KitchenPrinterPage kppg=new KitchenPrinterPage();
	CategoriesPage ctp=new CategoriesPage();
	
	@Given("Open the Settings - Kitchen Printer home page BaseURL and StoreID")
	public void openTheSettingsKitchenPrinterHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Kitchen Printer page
		lgpg.Open_URL(Utility.getProperty("baseURL")+"settings/"+"kitchenPrinters");
	}
	@Given("Verifying the Kitchen Printer Header Page")
	public void verifyingTheKitchenPrinterHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Kitchen Printers page loaded or not
		cmp.VerifyMainScreenPageHeader("Kitchen Printers");	
	}
	@Given("Click the New Kitchen Printer button")
	public void clickTheNewKitchenPrinterButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Click the New Kitchen Printers
		kppg.Click_NewKitchenPrinter();
	}
	@Given("I Select Printers Tab")
	public void iSelectPrintersTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		kppg.Printers_Tab.click();
	}
	@Then("Check IP Address Field in Table is Displayed")
	public void checkIPAddressFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.IP_AddressInputBx, "IP Address Field");
	}
	@Then("I Select Settings Tab")
	public void iSelectSettingsTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
	    kppg.Settings_Tab.click();
	}
	@Then("Check Seat Ordering Override Toggle is Displayed")
	public void checkSeatOrderingOverrideToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(kppg.SeatOrderingOverride_YesBtn, "Seat Ordering Override Toggle");
	}
	@Then("Check Print Voided Items to the Kitchen Toggle is Displayed")
	public void checkPrintVoidedItemsToTheKitchenToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(kppg.Print_VoidedItemstotheKitchen_YesBtn, "Print Voided Items to the Kitchen Toggle");
	}
	@Then("Check Print Included Modifier In Kitchen Toggle is Displayed")
	public void checkPrintIncludedModifierInKitchenToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(kppg.Print_IncludedModifier_For_AlternateModifier_YesBtn, "Print Included Modifier In Kitchen Toggle");
	}
	@Then("I Enable Print Included Modifier In Kitchen Toggle")
	public void iEnablePrintIncludedModifierInKitchenToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_IncludedModifierInKitchen_YesBtn.click();
	}
	@Then("Check Print Included Modifier For Alternate Modifier Toggle is Displayed")
	public void checkPrintIncludedModifierForAlternateModifierToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(kppg.Print_IncludedModifier_For_AlternateModifier_YesBtn, "Print Included Modifier For Alternate Modifier Toggle");

	}
	@Then("Check Serving Size in Front of Menu in KOT Toggle is Displayed")
	public void checkServingSizeInFrontOfMenuInKOTToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(kppg.ServingSizeinFront_of_MenuinKOT_YesBtn, "Serving Size in Front of Menu in KOT Toggle");

	}
	@Given("I Enter the Kitchen Printer Name Exceeding the limit")
	public void iEnterTheKitchenPrinterNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}
	@Given("I Select Printer Type as Printer")
	public void iSelectPrinterTypeAsPrinter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    kppg.Printer_KitchenPrinterTypeBtn.click();
	}
	@Given("I Enter the Kitchen Printer Name")
	public void iEnterTheKitchenPrinterName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Kitchen_Printer_Name"));
	    
	}
	@Given("I Enter the Kitchen Printer IP Address")
	public void iEnterTheKitchenPrinterIPAddress() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		kppg.Enter_IP_Address(Utility.getProperty("Kitchen_Printer_IP"));
	}
	@Given("I Enter the Kitchen Printer Invalid IP Address")
	public void iEnterTheKitchenPrinterInvalidIPAddress() {
	    // Write code here that turns the phrase above into concrete actions
		//Enter the Invalid Ip Address
		kppg.Enter_IP_Address("190.1.1");
	}
	
	@Then("Check Enter Valid IP Address Error is Displayed")
	public void checkEnterValidIPAddressErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.Check_Element_or_Text_Displayed(kppg.Enter_Valid_IP_Address_ErrorMsg, "Enter Valid IP Address Error");
	}
	@Given("I Enter the Kitchen Printer Invalid String IP Address")
	public void iEnterTheKitchenPrinterInvalidStringIPAddress() {
	    // Write code here that turns the phrase above into concrete actions
		//Enter the Invalid Ip Address
		kppg.Enter_IP_Address("abcd");
	}
	@Given("I Enable Enable Service Type Restriction Toggle")
	public void iEnableEnableServiceTypeRestrictionToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.EnableServiceTypeRestriction_YesBtn.click();
	}
	@Given("I Enable Alternate Printer Toggle")
	public void iEnableAlternatePrinterToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.AlternatePrinter_YesBtn.click();
	}
	@Given("I Select Allow Service Types")
	public void iSelectAllowServiceTypes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Select_Allow_ServiceTypes();
	}
	@Given("I Enter the KDS Kitchen Printer Name")
	public void iEnterTheKDSKitchenPrinterName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enter_KitchenPrinterName("KDS"+Utility.getProperty("Kitchen_Printer_Name"));
	}
	@Given("I Enter the KDS Kitchen Printer IP Address")
	public void iEnterTheKDSKitchenPrinterIPAddress() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enter_IP_Address(Utility.getProperty("Kitchen_Printer_IP_KDS"));
	}
	@Given("I Enter the Driver Kitchen Printer Name")
	public void iEnterTheDriverKitchenPrinterName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enter_KitchenPrinterName("Dri"+Utility.getProperty("Kitchen_Printer_Name"));

	}
	@Given("I Enter the Driver Kitchen Printer IP Address")
	public void iEnterTheDriverKitchenPrinterIPAddress() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enter_IP_Address(Utility.getProperty("Kitchen_Printer_IP_Driver"));
	}
	@Then("Check Enable Service Type Restriction Toggle is Grayed Out")
	public void checkEnableServiceTypeRestrictionToggleIsGrayedOut() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Enable_ServiceType_Restriction_DisabledToggle, "Grayed Out Enable Service Type Restriction Toggle");
	}
	@Given("I Search and Edit the Kitchen Printer")
	public void iSearchAndEditTheKitchenPrinter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Search the Kitchen Printers to Click Edit and Cancel
		cmp.SearchAndClickEdit(Utility.getProperty("Kitchen_Printer_Name"));
	}
	@When("Verify the Update Kitchen Printer Header")
	public void verifyTheUpdateKitchenPrinterHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Kitchen Printer");
	}
	@Then("I Verify Kitchen Printer Update screen Close or Not")
	public void iVerifyKitchenPrinterUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Close_Cancel_CreationScreen("Update Kitchen Printer");
	}
	@Then("Check Enable Service Type Restriction Toggle is Enabled")
	public void checkEnableServiceTypeRestrictionToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.EnableServiceTypeRestriction_YesBtn, "Enable Service Type Restriction");

	}
	@Then("I Select Alternate Printer")
	public void iSelectAlternatePrinter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);
	    cmp.Click_DropDown_withSearch(kppg.Alternate_PrinterInputBox, "Alternate Printer is Selected");
	}
	@Then("Verify whether Kitchen Printer Updated or Not")
	public void verifyWhetherKitchenPrinterUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Kitchen Printer Updated");
	}
	@Then("Check Alternate Printer Toggle is Enabled")
	public void checkAlternatePrinterToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.AlternatePrinter_YesBtn, "Alternate Printer");

	}
	@Then("I Select Printer Type as KDS")
	public void iSelectPrinterTypeAsKDS() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    kppg.KDS_KitchenPrinterTypeBtn.click();
	}
	@Then("I Enable Apply to All Categories Toggle")
	public void iEnableApplyToAllCategoriesToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.ApplyToAllCategories_YesBtn.click();
	}
	@Then("I Enable Apply to All Menu Items Toggle")
	public void iEnableApplyToAllMenuItemsToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.ApplyToAllMenuItems_YesBtn.click();
	}
	@Then("Check Apply to All Categories Toggle is Enabled")
	public void checkApplyToAllCategoriesToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.ApplyToAllCategories_YesBtn, "Apply to All Categories");

	}
	@Then("Check Apply to All Menu Items Toggle is Enabled")
	public void checkApplyToAllMenuItemsToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.ApplyToAllMenuItems_YesBtn, "Apply to All Menu Items");

	}
	@Then("Check Alternate Printer Toggle is Disabled")
	public void checkAlternatePrinterToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.AlternatePrinter_YesBtn, "Alternate Printer");

	}

	@Then("I Disable Apply to All Menu Items Toggle")
	public void iDisableApplyToAllMenuItemsToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.ApplyToAllMenuItems_NoBtn.click();
	}
	@Then("I Disable Apply to All Categories Toggle")
	public void iDisableApplyToAllCategoriesToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.ApplyToAllCategories_NoBtn.click();
	}
	@Then("Check Printer Type as Printer is Selected")
	public void checkPrinterTypeAsPrinterIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(kppg.Printer_KitchenPrinterTypeBtn);
	}
	@Then("Check Apply to All Categories Toggle is Disabled")
	public void checkApplyToAllCategoriesToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.ApplyToAllCategories_YesBtn, "Apply to All Categories");

	}
	@Then("I Enable Expo Device Toggle")
	public void iEnableExpoDeviceToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.ExpoDevice_YesBtn.click();
	}
	@Then("I Enter Expo Printer IP Address")
	public void iEnterExpoPrinterIPAddress() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enter_Expo_Printer_IPAddress("180.1.1.1");
	}
	@Then("I Enter Queue Device IP Address")
	public void iEnterQueueDeviceIPAddress() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enter_Queue_Device_IPAddress("181.1.1.1");
	}
	@Then("Check Printer Type as KDS is Selected")
	public void checkPrinterTypeAsKDSIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(kppg.KDS_KitchenPrinterTypeBtn);
	}
	@Then("Check Expo Device Toggle is Enabled")
	public void checkExpoDeviceToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.ExpoDevice_YesBtn, "Expo Device");
	}
	@Then("Check Printer Type as Driver is Selected")
	public void checkPrinterTypeAsDriverIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_True_Element_Selected(kppg.Driver_KitchenPrinterTypeBtn);
	}
	@Given("I Search the Kitchen Printer and Click the Delete button")
	public void iSearchTheKitchenPrinterAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("Kitchen_Printer_Name"));
		
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Kitchen Printer Deleted\\/Inactivated or Not")
	public void verifyTheCancelledKitchenPrinterDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Kitchen Printer Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Kitchen Printer Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Kitchen Printer Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Kitchen Printer not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}
	@Then("I Verifying the Kitchen Printer Deleted or Not")
	public void iVerifyingTheKitchenPrinterDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Kitchen Printer Deleted");
	}
	@Given("I Select Printer Type as Driver")
	public void iSelectPrinterTypeAsDriver() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	   kppg.Driver_KitchenPrinterTypeBtn.click();
	}

	@Then("Check Created Kitchen Printer is Availale in Category Module")
	public void checkCreatedKitchenPrinterIsAvailaleInCategoryModule() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Kitchen_Printers_Tab_inContents.click();
	    
	    try
	    {
	    	if(ctp.ShowAll_Select_KitchenPrintersBtn.isDisplayed())
	    	{
	    		ctp.ShowAll_Select_KitchenPrintersBtn.click();
	    	}
	    }
	    catch(Exception k)
	    {
	    	
	    }
	    
	    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")), "Created Kitchen Printer in Category");
//	    cmp.Assertion_Validation_True_Element_Displayed(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")));
	}
	@Then("Check Created Kitchen Printer is Availale in SubCategory Module")
	public void checkCreatedKitchenPrinterIsAvailaleInSubCategoryModule() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Kitchen_Printers_Tab_inContents.click();
	    
	    try
	    {
	    	if(ctp.ShowAll_Select_KitchenPrintersBtn.isDisplayed())
	    	{
	    		ctp.ShowAll_Select_KitchenPrintersBtn.click();
	    	}
	    }
	    catch(Exception k)
	    {
	    	
	    }
	    
	    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")), "Created Kitchen Printer in Category");
//	    cmp.Assertion_Validation_True_Element_Displayed(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")));
	
	}
	@Then("Verify whether the Duplicate Kitchen Printer is Saved or Not")
	public void verifyWhetherTheDuplicateKitchenPrinterIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Kitchen Printer Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Kitchen Printer Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Kitchen Printer Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Kitchen Printer Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify the Available Kitchen Printer is Displayed or Not")
	public void verifyTheAvailableKitchenPrinterIsDisplayedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndVerify_SearchBox();
	}
	@When("I Enter the New Kitchen Printer Name with Special Characters")
	public void iEnterTheNewKitchenPrinterNameWithSpecialCharacters() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enter_KitchenPrinterName("&&&&****");
	}
//	@Then("Verify whether the Kitchen Printer with Special Characters is Saved or Not")
//	public void verifyWhetherTheKitchenPrinterWithSpecialCharactersIsSavedOrNot() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("I Enter the New Kitchen Printer Name with Space")
	public void iEnterTheNewKitchenPrinterNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Kitchen Printer Name
		cmp.EnterName(Utility.getProperty("Kitchen_Printer_Name")+Keys.SPACE);
	}
//	@Then("Verify whether the Kitchen Printer Name with Space in end is Updated or Not")
//	public void verifyWhetherTheKitchenPrinterNameWithSpaceInEndIsUpdatedOrNot() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Given("I Enable Seat Ordering Override Toggle")
	public void iEnableSeatOrderingOverrideToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.SeatOrderingOverride_YesBtn.click();
	}
	@Given("I Enable Print Voided Items to the Kitchen Toggle")
	public void iEnablePrintVoidedItemsToTheKitchenToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_VoidedItemstotheKitchen_YesBtn.click();
	}
	@Then("I Enable Print Included Modifier For Alternate Modifier Toggle")
	public void iEnablePrintIncludedModifierForAlternateModifierToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_IncludedModifier_For_AlternateModifier_YesBtn.click();
	}
	@Then("I Enable Serving Size in Front of Menu in KOT Toggle")
	public void iEnableServingSizeInFrontOfMenuInKOTToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.ServingSizeinFront_of_MenuinKOT_YesBtn.click();
	}
	@Then("Check Seat Ordering Override Toggle is Enabled")
	public void checkSeatOrderingOverrideToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.SeatOrderingOverride_YesBtn, "Seat Ordering Override");
	}
	@Then("Check Print Voided Items to the Kitchen Toggle is Enabled")
	public void checkPrintVoidedItemsToTheKitchenToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Print_VoidedItemstotheKitchen_YesBtn, "Print Voided Items to the Kitchen");
	}
	@Then("Check Print Included Modifier In Kitchen Toggle is Enabled")
	public void checkPrintIncludedModifierInKitchenToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Print_IncludedModifierInKitchen_YesBtn, "Print Included Modifier In Kitchen");

	}
	@Then("Check Print Included Modifier For Alternate Modifier Toggle is Enabled")
	public void checkPrintIncludedModifierForAlternateModifierToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Print_IncludedModifier_For_AlternateModifier_YesBtn, "Print Included Modifier For Alternate Modifier");

	}
	@Then("Check Serving Size in Front of Menu in KOT Toggle is Enabled")
	public void checkServingSizeInFrontOfMenuInKOTToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.ServingSizeinFront_of_MenuinKOT_YesBtn, "Serving Size in Front of Menu in KOT");

	}
	@Given("I Disable Seat Ordering Override Toggle")
	public void iDisableSeatOrderingOverrideToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.SeatOrderingOverride_NoBtn.click();
	}
	@Given("I Disable Print Voided Items to the Kitchen Toggle")
	public void iDisablePrintVoidedItemsToTheKitchenToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    kppg.Print_VoidedItemstotheKitchen_NoBtn.click();
	}
	@Given("I Disable Print Included Modifier For Alternate Modifier Toggle")
	public void iDisablePrintIncludedModifierForAlternateModifierToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_IncludedModifier_For_AlternateModifier_NoBtn.click();
	}
	@Given("I Disable Print Included Modifier In Kitchen Toggle")
	public void iDisablePrintIncludedModifierInKitchenToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_IncludedModifierInKitchen_NoBtn.click();
	}
	@Given("I Disable Serving Size in Front of Menu in KOT Toggle")
	public void iDisableServingSizeInFrontOfMenuInKOTToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.ServingSizeinFront_of_MenuinKOT_NoBtn.click();
	}
	@Then("Check Seat Ordering Override Toggle is Disabled")
	public void checkSeatOrderingOverrideToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.SeatOrderingOverride_YesBtn, "Seat Ordering Override");
	}
	@Then("Check Print Voided Items to the Kitchen Toggle is Disabled")
	public void checkPrintVoidedItemsToTheKitchenToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Toggle_Disabled(kppg.Print_VoidedItemstotheKitchen_YesBtn, "Print Voided Items to the Kitchen");
	}
	@Then("Check Print Included Modifier In Kitchen Toggle is Disabled")
	public void checkPrintIncludedModifierInKitchenToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Toggle_Disabled(kppg.Print_IncludedModifierInKitchen_YesBtn, "Print Included Modifier In Kitchen");
	}
	@Then("Check Serving Size in Front of Menu in KOT Toggle is Disabled")
	public void checkServingSizeInFrontOfMenuInKOTToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Toggle_Disabled(kppg.ServingSizeinFront_of_MenuinKOT_YesBtn, "Serving Size in Front of Menu in KOT");
	}
}
