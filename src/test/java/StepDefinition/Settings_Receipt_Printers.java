package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Receipt_Printers 
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

	
	@Given("Open the Settings - Receipt Printer home page BaseURL and StoreID")
	public void openTheSettingsReceiptPrinterHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Receipt Printer page
		lgpg.Open_URL(Utility.getProperty("baseURL")+"settings/"+"receiptPrinters");
	}
	@Given("Verifying the Receipt Printer Header Page")
	public void verifyingTheReceiptPrinterHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Receipt Printers page loaded or not
		cmp.VerifyMainScreenPageHeader("Receipt Printers");	
	}
	@Given("Click the New Receipt Printer button")
	public void clickTheNewReceiptPrinterButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Click the New Receipt Printers
		kppg.Click_New_ReceiptPrinter();
	}
	@When("Verify the New Receipt Printer Header")
	public void verifyTheNewReceiptPrinterHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		
		//Verify the New Receipt Printer creation screen opened or not 
		cmp.VerifyCreationScreenPageHeader("New Receipt Printer");
	}
	@Then("Check Default Field in Table is Displayed")
	public void checkDefaultFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Default_Column_Field, "Default in Column Field");
	}
	@Then("Check Auto Print Receipt Toggle is Displayed")
	public void checkAutoPrintReceiptToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.AutoPrintReceipt_YesBtn, "Auto Print Receipt Toggle");
	}
	@Then("Check Show CC Receipt Screen Toggle is Displayed")
	public void checkShowCCReceiptScreenToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Show_CC_ReceiptScreen_YesBtn, "Show CC Receipt Toggle");
	}
	@Then("Check Print CC Customer Copy Toggle is Displayed")
	public void checkPrintCCCustomerCopyToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Print_CC_CustomerCopy_YesBtn, "Print CC Customer Copy Toggle");

	}
	@Then("Check Show Digital Receipt Screen Toggle is Displayed")
	public void checkShowDigitalReceiptScreenToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Show_Digital_ReceiptScreen_YesBtn, "Show Digital Receipt Screen Toggle");

	}
	@Then("I Enable Show Digital Receipt Screen Toggle")
	public void iEnableShowDigitalReceiptScreenToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    kppg.Show_Digital_ReceiptScreen_YesBtn.click();
	}
	@Then("Check Show Digital Receipt in CDS Toggle is Displayed")
	public void checkShowDigitalReceiptInCDSToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Show_Digital_ReceiptinCDS_YesBtn, "Show Digital Receipt in CDS Toggle");

	}
	@Then("Check Show Signature Pad Toggle is Displayed")
	public void checkShowSignaturePadToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Show_SignaturePad_YesBtn, "Show Signature Pad Toggle");

	}
	@Then("Check Print CC Merchant Copy Toggle is Displayed")
	public void checkPrintCCMerchantCopyToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Print_CC_MerchantCopy_YesBtn, "Print CC Merchant Copy Toggle");

	}
	@Then("Check Remove Tip Line Toggle is Displayed")
	public void checkRemoveTipLineToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Remove_Tip_Line_YesBtn, "Remove Tip Line Toggle");

	}
	@Then("Check Enable Itemized Receipt Toggle is Displayed")
	public void checkEnableItemizedReceiptToggleIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(kppg.Enable_Itemized_Receipt_YesBtn, "Enable Itemerized Receipt Toggle");

	}
	@Given("I Enter the Receipt Printer Name Exceeding the limit")
	public void iEnterTheReceiptPrinterNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}
	@Given("I Enter the Receipt Printer Name")
	public void iEnterTheReceiptPrinterName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Enter the Receipt Printer Name
		cmp.EnterName(Utility.getProperty("Receipt_Printer_Name"));
	}
	@Given("I Enter the Receipt Printer IP Address")
	public void iEnterTheReceiptPrinterIPAddress() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enter the IP Address
				kppg.Enter_IP_Address(Utility.getProperty("Receipt_Printer_IP"));
	}
	@Given("I Enter the Receipt Printer Invalid IP Address")
	public void iEnterTheReceiptPrinterInvalidIPAddress() {
	    // Write code here that turns the phrase above into concrete actions
		//Enter the Invalid Ip Address
		kppg.Enter_IP_Address("180.1.1");
	}
	@Given("I Enter the Receipt Printer Invalid String IP Address")
	public void iEnterTheReceiptPrinterInvalidStringIPAddress() {
	    // Write code here that turns the phrase above into concrete actions
		//Enter the Invalid Ip Address
		kppg.Enter_IP_Address("abcd");
	}
	@Given("I Enable Set as Default Toggle")
	public void iEnableSetAsDefaultToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.SetasDefault_YesBtn.click();
	}
	@Then("Verify whether Receipt Printer Saved or Not")
	public void verifyWhetherReceiptPrinterSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Receipt Printer Saved");
	}
	@Given("I Search and Edit the Receipt Printer")
	public void iSearchAndEditTheReceiptPrinter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Search the Receipt Printers to Click Edit and Cancel
		kppg.SearchAndClickEdit(Utility.getProperty("Receipt_Printer_Name"));
	}
	@When("Verify the Update Receipt Printer Header")
	public void verifyTheUpdateReceiptPrinterHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Receipt Printer");
	}
	@Then("I Verify Receipt Printer Update screen Close or Not")
	public void iVerifyReceiptPrinterUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Close_Cancel_CreationScreen("Update Receipt Printer");
	}
	@Then("Check Set as Default Toggle is Enabled")
	public void checkSetAsDefaultToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.SetasDefault_YesBtn, "Set as Default");
	}
	@Then("I Disable Set as Default Toggle")
	public void iDisableSetAsDefaultToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.SetasDefault_NoBtn.click();
	}
	@Then("Verify whether Receipt Printer Updated or Not")
	public void verifyWhetherReceiptPrinterUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("Receipt Printer Updated");
	}
	@Then("Check Set as Default Toggle is Disabled")
	public void checkSetAsDefaultToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.SetasDefault_YesBtn, "Set as Default");
	}
	@Then("Check Created Receipt Printer is Availale in Category Module")
	public void checkCreatedReceiptPrinterIsAvailaleInCategoryModule() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Restrict_Printers_Tab_inContents.click();
		    
		    try
		    {
		    	if(ctp.ShowAll_Select_RestrictPrintersBtn.isDisplayed())
		    	{
		    		ctp.ShowAll_Select_KitchenPrintersBtn.click();
		    	}
		    }
		    catch(Exception k)
		    {
		    	
		    }
		    
		    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//app-chip[@name='restrictPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")), "Created Kitchen Printer in Category");
//		    cmp.Assertion_Validation_True_Element_Displayed(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")));

	}
	@Then("Check Created Receipt Printer is Availale in SubCategory Module")
	public void checkCreatedReceiptPrinterIsAvailaleInSubCategoryModule() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Restrict_Printers_Tab_inContents.click();
		    
		    try
		    {
		    	if(ctp.ShowAll_Select_RestrictPrintersBtn.isDisplayed())
		    	{
		    		ctp.ShowAll_Select_KitchenPrintersBtn.click();
		    	}
		    }
		    catch(Exception k)
		    {
		    	
		    }
		    
		    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//app-chip[@name='restrictPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")), "Created Kitchen Printer in Category");
//		    cmp.Assertion_Validation_True_Element_Displayed(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")));

	}
	@Given("I Enable Auto Print Receipt Toggle")
	public void iEnableAutoPrintReceiptToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    kppg.AutoPrintReceipt_YesBtn.click();
	}
	@Given("I Enable Show CC Receipt Screen Toggle")
	public void iEnableShowCCReceiptScreenToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Show_CC_ReceiptScreen_YesBtn.click();
	}
	@Given("I Enable Print CC Customer Copy Toggle")
	public void iEnablePrintCCCustomerCopyToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_CC_CustomerCopy_YesBtn.click();
	}
	@Then("I Enable Show Digital Receipt in CDS Toggle")
	public void iEnableShowDigitalReceiptInCDSToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Show_Digital_ReceiptinCDS_YesBtn.click();
	}
	@Then("I Enable Show Signature Pad Toggle")
	public void iEnableShowSignaturePadToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Show_SignaturePad_YesBtn.click();
	}
	@Then("I Enable Print CC Merchant Copy Toggle")
	public void iEnablePrintCCMerchantCopyToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_CC_MerchantCopy_YesBtn.click();
	}
	@Then("I Enable Remove Tip Line Toggle")
	public void iEnableRemoveTipLineToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Remove_Tip_Line_YesBtn.click();
	}
	@Then("I Enable Enable Itemized Receipt Toggle")
	public void iEnableEnableItemizedReceiptToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enable_Itemized_Receipt_YesBtn.click();
	}
	@Then("Check Auto Print Receipt Toggle is Enabled")
	public void checkAutoPrintReceiptToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.AutoPrintReceipt_YesBtn, "Auto Print Receipt");
	}
	@Then("Check Show CC Receipt Screen Toggle is Enabled")
	public void checkShowCCReceiptScreenToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Show_CC_ReceiptScreen_YesBtn, "Show CC Receipt Screen");

	}
	@Then("Check Print CC Customer Copy Toggle is Enabled")
	public void checkPrintCCCustomerCopyToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Print_CC_CustomerCopy_YesBtn, "Print CC Customer Copy");

	}
	@Then("Check Show Digital Receipt Screen Toggle is Enabled")
	public void checkShowDigitalReceiptScreenToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Show_Digital_ReceiptScreen_YesBtn, "Show Digital Receipt Screen");

	}
	@Then("Check Show Digital Receipt in CDS Toggle is Enabled")
	public void checkShowDigitalReceiptInCDSToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Show_Digital_ReceiptinCDS_YesBtn, "Show Digital Receipt in CDS");

	}
	@Then("Check Show Signature Pad Toggle is Enabled")
	public void checkShowSignaturePadToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Show_SignaturePad_YesBtn, "Show Signature Pad");

	}
	@Then("Check Print CC Merchant Copy Toggle is Enabled")
	public void checkPrintCCMerchantCopyToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Print_CC_MerchantCopy_YesBtn, "Print CC Merchant Copy");

	}
	@Then("Check Remove Tip Line Toggle is Enabled")
	public void checkRemoveTipLineToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Remove_Tip_Line_YesBtn, "Remove Tip Line");

	}
	@Then("Check Enable Itemized Receipt Toggle is Enabled")
	public void checkEnableItemizedReceiptToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(kppg.Enable_Itemized_Receipt_YesBtn, "Enable Itemized Receipt");

	}
	@Given("I Disable Auto Print Receipt Toggle")
	public void iDisableAutoPrintReceiptToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    kppg.AutoPrintReceipt_NoBtn.click();
	}
	@Given("I Disable Show CC Receipt Screen Toggle")
	public void iDisableShowCCReceiptScreenToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Show_CC_ReceiptScreen_NoBtn.click();
	}
	@Given("I Disable Print CC Customer Copy Toggle")
	public void iDisablePrintCCCustomerCopyToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_CC_CustomerCopy_NoBtn.click();
	}
	@Given("I Disable Show Digital Receipt in CDS Toggle")
	public void iDisableShowDigitalReceiptInCDSToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Show_Digital_ReceiptinCDS_NoBtn.click();
	}
	@Given("I Disable Show Digital Receipt Screen Toggle")
	public void iDisableShowDigitalReceiptScreenToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Show_Digital_ReceiptScreen_NoBtn.click();
	}
	@Given("I Disable Show Signature Pad Toggle")
	public void iDisableShowSignaturePadToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Show_SignaturePad_NoBtn.click();
	}
	@Given("I Disable Print CC Merchant Copy Toggle")
	public void iDisablePrintCCMerchantCopyToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Print_CC_MerchantCopy_NoBtn.click();
	}
	@Given("I Disable Remove Tip Line Toggle")
	public void iDisableRemoveTipLineToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Remove_Tip_Line_NoBtn.click();
	}
	@Given("I Disable Enable Itemized Receipt Toggle")
	public void iDisableEnableItemizedReceiptToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    kppg.Enable_Itemized_Receipt_NoBtn.click();
	}
	@Then("Check Auto Print Receipt Toggle is Disabled")
	public void checkAutoPrintReceiptToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.AutoPrintReceipt_YesBtn, "Auto Print Receipt");
	}
	@Then("Check Show CC Receipt Screen Toggle is Disabled")
	public void checkShowCCReceiptScreenToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.Show_CC_ReceiptScreen_YesBtn, "Show CC Receipt Screen");

	}
	@Then("Check Print CC Customer Copy Toggle is Disabled")
	public void checkPrintCCCustomerCopyToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.Print_CC_CustomerCopy_YesBtn, "Print CC Customer Copy");

	}
	@Then("Check Show Digital Receipt Screen Toggle is Disabled")
	public void checkShowDigitalReceiptScreenToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.Show_Digital_ReceiptScreen_YesBtn, "Show Digital Receipt Screen");

	}
	@Then("Check Show Signature Pad Toggle is Disabled")
	public void checkShowSignaturePadToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.Show_SignaturePad_YesBtn, "Show Signature Pad");

	}
	@Then("Check Print CC Merchant Copy Toggle is Disabled")
	public void checkPrintCCMerchantCopyToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.Print_CC_MerchantCopy_YesBtn, "Print CC Merchant Copy");

	}
	@Then("Check Remove Tip Line Toggle is Disabled")
	public void checkRemoveTipLineToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.Remove_Tip_Line_YesBtn, "Remove Tip Line");

	}
	@Then("Check Enable Itemized Receipt Toggle is Disabled")
	public void checkEnableItemizedReceiptToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(kppg.Enable_Itemized_Receipt_YesBtn, "Enable Itemized Receipt");

	}
	@Given("I Search the Receipt Printer and Click the Delete button")
	public void iSearchTheReceiptPrinterAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Click Delete button
		kppg.SearchAndClickDelete(Utility.getProperty("Receipt_Printer_Name"));
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Receipt Printer Deleted\\/Inactivated or Not")
	public void verifyTheCancelledReceiptPrinterDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Kitchen Printer Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Receipt Printer Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Receipt Printer Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Receipt Printer not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Verifying the Receipt Printer Deleted or Not")
	public void iVerifyingTheReceiptPrinterDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("Receipt Printer Deleted");
	}
	@Then("Verify whether the Duplicate Receipt Printer is Saved or Not")
	public void verifyWhetherTheDuplicateReceiptPrinterIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Receipt Printer Name already exist pop up displayed");
		
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
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Receipt Printer Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Receipt Printer Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Receipt Printer Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify the Available Receipt Printer is Displayed or Not")
	public void verifyTheAvailableReceiptPrinterIsDisplayedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.SearchAndVerify_SearchBox();
	}
	@When("I Enter the New Receipt Printer Name with Special Characters")
	public void iEnterTheNewReceiptPrinterNameWithSpecialCharacters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.EnterName("&&&&****");
	}
	@When("I Enter the New Receipt Printer Name with Space")
	public void iEnterTheNewReceiptPrinterNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName(Utility.getProperty("Receipt_Printer_Name")+Keys.SPACE);
	}
}
