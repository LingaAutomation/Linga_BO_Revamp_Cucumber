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

public class Settings_Label_Printers 
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
	
	
	@Given("Open the Settings - Label Printer home page BaseURL and StoreID")
	public void openTheSettingsLabelPrinterHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Label Printer page
		driver.get(Utility.getProperty("baseURL")+"settings/"+"labelPrinters");
	}
	@Given("Verifying the Label Printer Header Page")
	public void verifyingTheLabelPrinterHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Label Printers page loaded or not
		cmp.VerifyMainScreenPageHeader("Label Printers");	
	}
	@Given("Click the New Label Printer button")
	public void clickTheNewLabelPrinterButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Click the New Label Printers
		kppg.Click_New_LabelPrinter();
	}
	@Given("I Enter the Label Printer Name Exceeding the limit")
	public void iEnterTheLabelPrinterNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}
	@Given("I Select Printer Type as Kitchen Label")
	public void iSelectPrinterTypeAsKitchenLabel() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    kppg.Kitchen_Label_PrinterTypeBtn.click();
	}
	@Given("I Enter the Label Printer Name")
	public void iEnterTheLabelPrinterName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Label Printer Name
		cmp.EnterName(Utility.getProperty("Label_Printer_Name"));
	}
	@Given("I Enter the Label Printer IP Address")
	public void iEnterTheLabelPrinterIPAddress() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the IP Address
		kppg.Enter_IP_Address(Utility.getProperty("Label_Printer_IP"));
	}
	@Given("I Enter the Label Printer Invalid IP Address")
	public void iEnterTheLabelPrinterInvalidIPAddress() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Invalid Ip Address
		kppg.Enter_IP_Address("190.1.1"); 
	}
	@Given("I Enter the Label Printer Invalid String IP Address")
	public void iEnterTheLabelPrinterInvalidStringIPAddress() {
	    // Write code here that turns the phrase above into concrete actions
		//Enter the Invalid Ip Address
		kppg.Enter_IP_Address("abcd");
		
	}
	@Given("I Enter the Box Label Printer Name")
	public void iEnterTheBoxLabelPrinterName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Label Printer Name
		cmp.EnterName("Box"+Utility.getProperty("Label_Printer_Name"));
	}
	@Given("I Enter the Box Label Printer IP Address")
	public void iEnterTheBoxLabelPrinterIPAddress() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the IP Address
		kppg.Enter_IP_Address(Utility.getProperty("Label_Printer_IP_Box"));
	}
	@Given("I Search and Edit the Label Printer")
	public void iSearchAndEditTheLabelPrinter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Search the Label Printers to Click Edit and Cancel
				cmp.SearchAndClickEdit(Utility.getProperty("Label_Printer_Name"));
	}
	@When("Verify the Update Label Printer Header")
	public void verifyTheUpdateLabelPrinterHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Label Printer");
	}
	@Then("I Verify Label Printer Update screen Close or Not")
	public void iVerifyLabelPrinterUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Close_Cancel_CreationScreen("Update Label Printer");
	}
	@Then("Verify whether Label Printer Updated or Not")
	public void verifyWhetherLabelPrinterUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Label Printer Updated");
	}
	@Then("I Select Printer Type as Box Label")
	public void iSelectPrinterTypeAsBoxLabel() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    kppg.Box_Label_PrinterTypeBtn.click();
	}
	@Then("Check Printer Type as Kitchen Label is Selected")
	public void checkPrinterTypeAsKitchenLabelIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_True_Element_Selected(kppg.Kitchen_Label_PrinterTypeBtn);
	}
	@Then("Check Printer Type as Box Label is Selected")
	public void checkPrinterTypeAsBoxLabelIsSelected() {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Assertion_Validation_True_Element_Selected(kppg.Box_Label_PrinterTypeBtn);
	}
	@Then("Check Created Label Printer is Availale in Category Module")
	public void checkCreatedLabelPrinterIsAvailaleInCategoryModule() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Label_Printers_Tab_inContents.click();
		    
		    try
		    {
		    	if(ctp.ShowAll_Select_LabelPrintersBtn.isDisplayed())
		    	{
		    		ctp.ShowAll_Select_LabelPrintersBtn.click();
		    	}
		    }
		    catch(Exception k)
		    {
		    	
		    }
		    
		    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//app-chip[@name='labelPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Label_Printer_Name")+"')]")), "Created Kitchen Printer in Category");
//		    cmp.Assertion_Validation_True_Element_Displayed(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")));

	}
	@Then("Check Created Label Printer is Availale in SubCategory Module")
	public void checkCreatedLabelPrinterIsAvailaleInSubCategoryModule() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Label_Printers_Tab_inContents.click();
		    
		    try
		    {
		    	if(ctp.ShowAll_Select_LabelPrintersBtn.isDisplayed())
		    	{
		    		ctp.ShowAll_Select_LabelPrintersBtn.click();
		    	}
		    }
		    catch(Exception k)
		    {
		    	
		    }
		    
		    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//app-chip[@name='labelPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Label_Printer_Name")+"')]")), "Created Kitchen Printer in Category");
//		    cmp.Assertion_Validation_True_Element_Displayed(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains.,'"+Utility.getProperty("Kitchen_Printer_Name")+"')]")));
		
	}
	@Given("I Search the Label Printer and Click the Delete button")
	public void iSearchTheLabelPrinterAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("Label_Printer_Name"));
		
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Label Printer Deleted\\/Inactivated or Not")
	public void verifyTheCancelledLabelPrinterDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Kitchen Printer Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Label Printer Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Label Printer Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Label Printer not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the Label Printer Deleted or Not")
	public void iVerifyingTheLabelPrinterDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.VerifySaveConfirmationAlertMessage("Label Printer Deleted");
	}
	@Then("Verify whether the Duplicate Label Printer is Saved or Not")
	public void verifyWhetherTheDuplicateLabelPrinterIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Label Printer Name already exist pop up displayed");
		
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
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Label Printer Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Label Printer Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Label Printer Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify the Available Label Printer is Displayed or Not")
	public void verifyTheAvailableLabelPrinterIsDisplayedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndVerify_SearchBox();
	}
	@When("I Enter the New Label Printer Name with Special Characters")
	public void iEnterTheNewLabelPrinterNameWithSpecialCharacters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.EnterName("&&&&****");
	}
	@When("I Enter the New Label Printer Name with Space")
	public void iEnterTheNewLabelPrinterNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Label Printer Name
		cmp.EnterName(Utility.getProperty("Label_Printer_Name")+Keys.SPACE);
	}


}
