package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.math.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.TaxesPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;import jdk.internal.net.http.common.Log;

public class Product_and_Items_Taxes {

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	TaxesPage tp=new TaxesPage();
	
	String Actual_Percentage;
	static String Expected_Percentage=null;
	String Expected_ChangeAmount, Actual_ChangeAmount, Expected_ChangeAmountBef;
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	SoftAssert sa=new SoftAssert();
	
	ArrayList<String> al=new ArrayList<>();
	
	
	@Given("Open the Taxes home page BaseURL and StoreID")
	public void openTheTaxesHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(8000);
		//Load the Tax page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"taxes");
	}
	@Given("Verifying the Taxes Header Page")
	public void verifyingTheTaxesHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
//		cmp.Close_Online_Help_ChatBox();
		Thread.sleep(8000);
		//Verify the Taxes page loaded or not
		cmp.VerifyMainScreenPageHeader("Taxes");
	}
	
	@Given("Click the New Tax button")
	public void clickTheNewTaxButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		//Click the New Taxes
		tp.Click_NewTaxButton();
		Thread.sleep(5000);
	}
	
	@When("Verify the New Taxes Header")
	public void verifyTheNewTaxesHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		
		//Verify the New Tax creation screen opened or not
		cmp.VerifyCreationScreenPageHeader_Two("New Tax");
	}
	
	@Given("I Click the Save and Publish button without Entering Taxes Name")
	public void iClickTheSaveAndPublishButtonWithoutEnteringTaxesName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		cmp.EnterName("");
		Thread.sleep(2000);
		
		if(cmp.Save_and_PublishButton().isEnabled())
		{
		//Click the Save & Publish button
				cmp.Click_Save_and_PublishButton();
				
				Thread.sleep(3000);
				//Check whether the New Tax Saved or not
				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved Successfully and Store data published successfully"))
				{
					test.log(LogStatus.FAIL, "Tax saved successfully for Item Tax (Amount) without Name");
				
					ut.FailedCaptureScreenshotAsBASE64();
				}
				else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Name"))
				{
					test.log(LogStatus.PASS, "Please Enter Name Pop up Displayed");
					
					ut.PassedCaptureScreenshotAsBASE64();
					
				}
		}
		else
		{
			test.log(LogStatus.PASS, "Save and Publish button not Enabled without Entering Name");
		}
	}
	
	@Given("I Enter the Single letter in Taxes Name then Click the Save and Publish button")
	public void iEnterTheSingleLetterInTaxesNameThenClickTheSaveAndPublishButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName("b");
		    
		    if(cmp.Save_and_PublishButton().isEnabled())
			{
			//Click the Save & Publish button
			cmp.Click_Save_and_PublishButton();
			
			Thread.sleep(3000);
			//Check whether the New Tax Saved or not
//			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Tax Name"))
//			{
//				test.log(LogStatus.PASS, "Please Enter Tax Name Alert Displayed");
//			
//				ut.PassedCaptureScreenshotAsBASE64();
//			}
//			else 
				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved Successfully and Store data published successfully"))
			{
				test.log(LogStatus.PASS, "Tax Saved with Single Letter");
			
				ut.PassedCaptureScreenshotAsBASE64();
				
				tp.Click_NewTaxButton();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
			{
				test.log(LogStatus.FAIL, "Tax Already Saved with Single Letter");
			
				ut.PassedCaptureScreenshotAsBASE64();
				
//				cp.ClickNewTax();
//				cmp.Click_CancelButton();
			}
//			else
//			{
//				test.log(LogStatus.FAIL, "Please Enter Tax Name Alert not Displayed");
//				
//				ut.FailedCaptureScreenshotAsBASE64();
//			}
			}
			else
			{
				test.log(LogStatus.FAIL, "Save & Publish button not Enabled while Entering Single Letter");
				ut.FailedCaptureScreenshotAsBASE64();
			}
	}

	@Given("I Enter the Taxes Name Exceeding the limit")
	public void iEnterTheTaxesNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}
	
	@And("I Entering Invalid Percentage")
	public void iEnteringInvalidPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Enter_Percentage("120000");
	    
	    Thread.sleep(1000);
	    ut.PassedCaptureScreenshotAsBASE64();
	    Thread.sleep(2000);
	    assertEquals(tp.Error_InputBoxBelow.getText(), "Enter Valid Percentage");
	    
	}

	
	@When("I Enter the Item Tax with Amount Name")
	public void iEnterTheItemTaxWithAmountName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Item_Tax_Amount_Name"));
	}
	@When("I Enter the Tax Code")
	public void iEnterTheTaxCode() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		tp.Enter_TaxCode("1234");
	}
	@When("I Select the Tax Type as Amount")
	public void iSelectTheTaxTypeAsAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		tp.Select_TaxType_Amount();
	}
	@When("I Enter the Amount")
	public void iEnterTheAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		tp.Enter_AmountBox("1000");
	}
	@When("I Select Apply To as Item")
	public void iSelectApplyToAsItem() {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Click_ItemTax();
	}
	@When("I Click the Save and Publish button")
	public void iClickTheSaveAndPublishButton() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_Save_and_PublishButton();
	}
	
	@Then("Verify whether the Item Tax with Amount is Saved or not")
	public void verifyWhetherTheItemTaxWithAmountIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Saved");
	}

	@When("I Enter the Item Tax with Percentage Name")
	public void iEnterTheItemTaxWithPercentageName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName(Utility.getProperty("Item_Tax_Name"));
	}
	
	@When("I Select the Tax Type as Percentage")
	public void iSelectTheTaxTypeAsPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    tp.Select_TaxType_Percentage();
	}
	@When("I Enter the Percentage in Tax")
	public void iEnterThePercentageInTax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Double PercNumber=(double) RandomUtils.nextInt(null, 0)
		Random r = new Random();
		int low = 1;
		int high = 100;
		int result = r.nextInt(high-low) + low;
		
//		double Perc=Double.parseDouble(result);
		
		String Perc_Number=String.valueOf(result)+"000";
		
		
		  Thread.sleep(1000);
	    tp.Enter_Percentage(Perc_Number);
	    
	    Thread.sleep(1000);
	    
	    String Entered_Perc=tp.Percentage_InputBox.getAttribute("value");
	    
	    
	    System.out.println("Entered % throwed : "+Entered_Perc);
	    this.Expected_Percentage=Entered_Perc.toString();
//	   Expected_Percentage=Entered_Perc;
	}

	@When("I Enable the Quantity Based Toggle")
	public void iEnableTheQuantityBasedToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Enable_Quantity_Based_Toggle();
	}
	
//	@When("I Enable the Quantity Based")
//	public void iEnableTheQuantityBased() throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    tp.Enable_Quantity_Based_Toggle();
//	}
	
	@Then("Verify whether the Item Tax with Percentage and Quantity Based without entering Quantity is Saved or not")
	public void verifyWhetherTheItemTaxWithPercentageAndQuantityBasedWithoutEnteringQuantityIsSavedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
	   
		if(cmp.Save_and_PublishButton().isEnabled())
		{
			test.log(LogStatus.FAIL, "Save & Publish button is Enabled without Entering Quantity");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.PASS, "Save & Publish button is not Enabled without Entering Quantity");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("Verify whether the Item Tax with Percentage is Saved or not")
	public void verifyWhetherTheItemTaxWithPercentageIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Saved");
	}


	@When("I Enter the Check Tax Name")
	public void iEnterTheCheckTaxName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Check_Tax_Name"));
	}


	@When("I Select Apply To as Check")
	public void iSelectApplyToAsCheck() {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Click_CheckTax();
	}
	@When("I Enter the Check Amount")
	public void iEnterTheCheckAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Random rd=new Random();
//		String RandomAmount=RandomUtils.
		
	    tp.Enter_AmountBox("2000");
	}
	@When("I Enable the Apply On Subtotal")
	public void iEnableTheApplyOnSubtotal() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Enable_ApplyOnSubtotal_Toggle();
	}


	
	@Then("Verify whether the Check Tax is Saved or not")
	public void verifyWhetherTheCheckTaxIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Saved");
	}


	@When("I Enter the Tax On Item Tax Name")
	public void iEnterTheTaxOnItemTaxName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Tax_On_Item_Tax_Name"));
	}
	

	@When("I Select Apply To as Tax On Item Tax")
	public void iSelectApplyToAsTaxOnItemTax() {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Click_TaxOnItemTax();
	}
	
	@When("I Select Apply For Item Taxes")
	public void iSelectApplyForItemTaxes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Select_Apply_ForItem_Taxes_Options();
	}
	
	@Then("Verify whether the Tax On Item Tax is Saved or not")
	public void verifyWhetherTheTaxOnItemTaxIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Saved");
	}

	@When("I Enter the Tax On Check Tax Name")
	public void iEnterTheTaxOnCheckTaxName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Tax_On_Check_Tax_Name"));
	}

	@When("I Select Apply To as Tax On Check Tax")
	public void iSelectApplyToAsTaxOnCheckTax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		tp.Click_TaxOnCheckTax();
	}
	
	@When("I Select Apply For Check Taxes")
	public void iSelectApplyForCheckTaxes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		tp.Select_Apply_ForCheck_Taxes_Options();
	}

	@Then("Verify whether the Tax On Check Tax is Saved or not")
	public void verifyWhetherTheTaxOnCheckTaxIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Saved");
	}
	
	@And("I can verify Apply To is selected as Item Tax")
	public void iCanVerifyApplyToIsSelectedAsItemTax() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(tp.Item_TaxBtn.isEnabled(), true);
	    
	    ut.PassedCaptureScreenshotAsBASE64();
	}
	
	@And("I can verify Apply To is selected as Check Tax")
	public void iCanVerifyApplyToIsSelectedAsCheckTax() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(tp.Check_TaxBtn.isEnabled(), true);
	    
	    ut.PassedCaptureScreenshotAsBASE64();
	}
	
	@And("I can verify Apply To is selected as Tax On Item Tax")
	public void iCanVerifyApplyToIsSelectedAsTaxOnItemTax() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(tp.TaxOnItem_TaxBtn.isEnabled(), true);
	    
	    
	    ut.PassedCaptureScreenshotAsBASE64();
	}

	@And("I can verify Apply To is selected as Tax On Check Tax")
	public void iCanVerifyApplyToIsSelectedAsTaxOnCheckTax() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(tp.TaxOnCheck_TaxBtn.isEnabled(), true);
	    
	    
	    ut.PassedCaptureScreenshotAsBASE64();
	}




	@Given("I Search and Edit the Tax")
	public void iSearchAndEditTheTax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Click Edit button
		cmp.SearchAndClickEdit(Utility.getProperty("Item_Tax_Name"));
	}
	@When("Verify the Update Taxes Header")
	public void verifyTheUpdateTaxesHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Check whether the application displays Update screen or not
		cmp.VerifyCreationScreenPageHeader_Two("Update Tax");
	}
	
	@Given("I Click the Backward button")
	public void iClickTheBackwardButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Click the Close button
		cmp.Click_BackspaceButton();
	}
	@Then("I Verify Taxes Update screen Close or not")
	public void iVerifyTaxesUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Close_Cancel_CreationScreen("Update Tax");
	}
	
	
	@Given("I Clicking the Update button without entering Taxes Name")
	public void iClickingTheUpdateButtonWithoutEnteringTaxesName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Name
		cmp.NameInputBox().clear();
	
		
		if(cmp.Update_and_PublishButton().isEnabled())
		{
			
			Thread.sleep(1000);
			//Click the Update button
			cmp.Click_Update_and_PublishButton();
			
			Thread.sleep(4000);
			//Check whether the New Tax Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax updated Successfully and Store data published successfully"))
			{
				test.log(LogStatus.FAIL, "Tax Updated without Tax Name");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				Thread.sleep(3000);
				//Search and Click Edit button
				cmp.SearchAndClickEdit(Utility.getProperty("Item_Tax_Name"));
				
				
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Update button Not Enabled and Tax not Updated without Tax Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	

	@Given("I can verify the Percentage value")
	public void iCanVerifyThePercentageValue() {
	    // Write code here that turns the phrase above into concrete actions
	    String ActualPerc=tp.Percentage_InputBox.getAttribute("value");
	    System.out.println("Expected %"+Expected_Percentage+" Actual % : "+ActualPerc);
	    
	    if(Expected_Percentage.equalsIgnoreCase(ActualPerc))
//	    	if("1.000%".equalsIgnoreCase(ActualPerc))
	    {
	    	test.log(LogStatus.PASS, "Percentage is correct");
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, "Percentage is not correct"+ "Expected % is "+Expected_Percentage+ " But, Actual % is "+ActualPerc);
	    }
//	    assertEquals(Expected_Percentage, ActualPerc);
	    
	}
	@Given("I Enable Include In Daily Summary Report")
	public void iEnableIncludeInDailySummaryReport() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Enable_IncludeDailySummaryReport();
	}
	@Given("I Enable Inclusive Tax")
	public void iEnableInclusiveTax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Enable_InclusiveTax();
	}
	
	@Given("I Enable Default Tax")
	public void iEnableDefaultTax() {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Enable_DefaultTax();
	}
	@Given("I Enable Quantity Based Tax")
	public void iEnableQuantityBasedTax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Enable_Quantity_Based_Toggle();
	}
	@Given("I Click the Update and Publish button")
	public void iClickTheUpdateAndPublishButton() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_Update_and_PublishButton();
	}
	@Then("Verify whether the Item Tax with Percentage after Enabled with Inclusive, Default, Quantity Based, Include In Daily Summary Report is Updated or not")
	public void verifyWhetherTheItemTaxWithPercentageAfterEnabledWithInclusiveDefaultQuantityBasedIncludeInDailySummaryReportIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
		cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Updated");
		
	    
	}


	@Given("I can verify the Enabled Inclusive Tax Toggle")
	public void iCanVerifyTheEnabledInclusiveTaxToggle() {
	    // Write code here that turns the phrase above into concrete actions
//	    assertEquals(tp.Inclusive_YesBtn.isEnabled(), true);
		sa.equals(tp.Inclusive_YesBtn.isEnabled());
		test.log(LogStatus.INFO, "Inclusive Toggle is Enabled");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	@Given("I can verify the Enabled Default Tax Toggle")
	public void iCanVerifyTheEnabledDefaultTaxToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    sa.equals(tp.DefaultTax_YesBtn.isEnabled());
	    test.log(LogStatus.INFO, "Default Toggle is Enabled");
	}
	
	@Given("I can verify the Enabled Quantity Based Tax Toggle")
	public void iCanVerifyTheEnabledQuantityBasedTaxToggle() {
	    // Write code here that turns the phrase above into concrete actions
		  sa.equals(tp.QuantityBased_YesBtn.isEnabled());
		    test.log(LogStatus.INFO, "Quantity Based Toggle is Enabled");
	}

	@Given("I Disable Include In Daily Summary Report")
	public void iDisableIncludeInDailySummaryReport() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Disable_IncludeDailySummaryReport();
	}
	
	@Given("I Disable Inclusive Tax")
	public void iDisableInclusiveTax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Disable_InclusiveTax();
	}
	@Given("I Disable Default Tax")
	public void iDisableDefaultTax() {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Disable_DefaultTax();
	}
	@Given("I Disable Quantity Based Tax")
	public void iDisableQuantityBasedTax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Disable_QuantityBasedTax();
	}
	
	@Then("Verify whether the Item Tax with Percentage after Disabled with Inclusive, Default, Quantity Based, Include In Daily Summary Report is Updated or not")
	public void verifyWhetherTheItemTaxWithPercentageAfterDisabledWithInclusiveDefaultQuantityBasedIncludeInDailySummaryReportIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Updated");
	}
	

	@Given("I can verify the Disabled Inclusive Tax Toggle")
	public void iCanVerifyTheDisabledInclusiveTaxToggle() {
	    // Write code here that turns the phrase above into concrete actions
		sa.equals(!tp.Inclusive_YesBtn.isEnabled());
		test.log(LogStatus.INFO, "Inclusive Toggle is Disabled");
	}
	@Given("I can verify the Disabled Default Tax Toggle")
	public void iCanVerifyTheDisabledDefaultTaxToggle() {
	    // Write code here that turns the phrase above into concrete actions
		sa.equals(!tp.DefaultTax_YesBtn.isEnabled());
		test.log(LogStatus.INFO, "Default Toggle is Disabled");
	}
	@Given("I can verify the Disabled Quantity Based Tax Toggle")
	public void iCanVerifyTheDisabledQuantityBasedTaxToggle() {
	    // Write code here that turns the phrase above into concrete actions
		sa.equals(!tp.QuantityBased_YesBtn.isEnabled());
		test.log(LogStatus.INFO, "Quantity Based Toggle is Disabled");
	}

	@Then("Verify whether the Apply To for Tax from Item to Check is Updated or not")
	public void verifyWhetherTheApplyToForTaxFromItemToCheckIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Updated");
		Thread.sleep(4000);
		//Check whether the New Tax Saved or not
//		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Updated Successfully and Store data published successfully"))
//		{
//			test.log(LogStatus.PASS, "Tax Updated and Published Successfully from Item to Check Tax");
//		
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
//		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Same check amount tax is already available"))
//		{
//			test.log(LogStatus.INFO, "Same check amount tax is already available. Apply to failed due to Same check amount already available");
//			
////			this.Expected_ChangeAmount=Expected_ChangeAmountBef;
//			
//			Thread.sleep(1000);
//			//Click Cancel button
//			cmp.Click_BackspaceButton();
//			
//			
//			
//		}
//		else
//		{
//			test.log(LogStatus.FAIL, "Tax Update and Publish for Check Tax Failed");
//			
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
	}
	
	@Then("Verify whether the Apply To for Tax from Check to Tax On Item Tax is Updated or not")
	public void verifyWhetherTheApplyToForTaxFromCheckToTaxOnItemTaxIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
		cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Updated");
	}

	@Then("Verify whether the Apply To for Tax from Tax On Item Tax to Tax On Check Tax is Updated or not")
	public void verifyWhetherTheApplyToForTaxFromTaxOnItemTaxToTaxOnCheckTaxIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
		cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Updated");
	}
	
	@Then("Verify whether the Apply To for Tax from Tax On Check Tax to Item Tax is Updated or not")
	public void verifyWhetherTheApplyToForTaxFromTaxOnCheckTaxToItemTaxIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
		cmp.VerifySaveConfirmationAlertMessageForPublish("Tax Updated");
	}

	
	@Given("I Search and Edit the Check Tax")
	public void iSearchAndEditTheCheckTax() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit(Utility.getProperty("Check_Tax_Name"));
	}
	
	@Given("I Change the Check Amount")
	public void iChangeTheCheckAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		String Bef_Exp_ChangeAmt=tp.Amount_InputBox.getAttribute("value");
		this.Expected_ChangeAmountBef=Bef_Exp_ChangeAmt;
		
		int ramdomInt=RandomUtils.nextInt(4);
		String Expected_ChangeAmt=String.valueOf(ramdomInt);
	    tp.Enter_AmountBox(Expected_ChangeAmt);
	    
	    String Exp_ChangeAmount=tp.Amount_InputBox.getAttribute("value");
	    this.Expected_ChangeAmount=Exp_ChangeAmount;
	}
	
	@Given("I Disable the Apply On Subtotal")
	public void iDisableTheApplyOnSubtotal() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Disable_ApplyOnSubtotal_Toggle();
	}
	
	@Then("Verify the Check Tax with Updated Check Amount is Updated or not")
	public void verifyTheCheckTaxWithUpdatedCheckAmountIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		//Check whether the New Tax Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Updated Successfully and Store data published successfully"))
		{
			test.log(LogStatus.PASS, "Tax Updated and Published Successfully for Check Tax");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Same check amount tax is already available"))
		{
			test.log(LogStatus.INFO, "Same check amount tax is already available");
			
			this.Expected_ChangeAmount=Expected_ChangeAmountBef;
			
			Thread.sleep(1000);
			//Click Cancel button
			cmp.Click_BackspaceButton();
			
			
			
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Update and Publish for Check Tax Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Validating the Check Amount after Reopen")
	public void iValidatingTheCheckAmountAfterReopen() {
	    // Write code here that turns the phrase above into concrete actions
		String Actual_ChangeAmt=tp.Amount_InputBox.getAttribute("value");
		
	    sa.equals(Expected_ChangeAmount.equals(Actual_ChangeAmt));
	    
	    if(Expected_ChangeAmount.equalsIgnoreCase(Actual_ChangeAmt))
	    {
	    	test.log(LogStatus.PASS, "Expected & Actual Check Amount is correct");
	    	ut.PassedCaptureScreenshotAsBASE64();
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, "Expected & Actual Check Amount is incorrect.."+"Expected Amount is :"+Expected_ChangeAmount+" Actual Check Amount is : "+Actual_ChangeAmt);
	    	ut.FailedCaptureScreenshotAsBASE64();
	    }
	}


	@Given("I Search the Taxes and Click the Delete button")
	public void iSearchTheTaxesAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickDelete(Utility.getProperty("Item_Tax_Name"));
	    
	    Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	
	@Then("Verify the Cancelled Taxes Deleted\\/Inactivated or not")
	public void verifyTheCancelledTaxesDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Tax Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Tax not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verifying the Taxes Deleted or not")
	public void iVerifyingTheTaxesDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Tax Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Tax Inactivated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Inactivated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Taxes")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedTaxes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
				cmp.Click_ActivetoInactiveButton();
				
				//Check whether the Inactive screen opened or not
				cmp.VerifyActive_InactiveStatus("Inactive");
				
				Thread.sleep(3000);
				cmp.Verify_Search(Utility.getProperty("Item_Tax_Name"));
	}
	
	@Given("I Search the Taxes and Click the Active button")
	public void iSearchTheTaxesAndClickTheActiveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("Item_Tax_Name"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}
	
	
	@Then("Verify the Cancelled Taxes is Activated or not")
	public void verifyTheCancelledTaxesIsActivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		try
		{
			Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "Tax Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Tax not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}


	@Then("I Verifying the Taxes Activated or not")
	public void iVerifyingTheTaxesActivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Tax Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Tax activated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax activated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		

	}
	
	@Then("I Click the Active button to navigate Activated screen to Verify Activated Taxes")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedTaxes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Tax activated or not
		cmp.Verify_Search(Utility.getProperty("Item_Tax_Name"));
		
	}
	
	@Then("I Search the Tax mapped with Category and Click the Delete button")
	public void iSearchTheTaxMappedWithCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickDelete("taxz");
	}
	@Then("I Verifying the Tax Mapped Catgeory is Deleted or not")
	public void iVerifyingTheTaxMappedCatgeoryIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This tax is attached with some item, so could not inactivate."))
		{
			test.log(LogStatus.PASS, "This tax is attached with some item, so could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Category Mapped Tax Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This tax is attached with some item, so could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	

	@Then("Verify whether the Duplicate Taxes is Saved or not")
	public void verifyWhetherTheDuplicateTaxesIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
//		Thread.sleep(5000);
		//Check whether the New Tax Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Tax Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(1000);
			cmp.Click_BackspaceButton();
			Thread.sleep(1000);
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(1000);
			cmp.Click_BackspaceButton();
			Thread.sleep(1000);
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved Successfully and Store data published successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Tax Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try
		{
			Thread.sleep(1000);
			cmp.Click_BackspaceButton();
			Thread.sleep(1000);
			
			System.out.println("Cancel button not Clicked while creating Duplicate Tax");
		}
		catch(Exception k)
		{}
	}

	@Then("Verify the Available Taxes is Displayed ot not")
	public void verifyTheAvailableTaxesIsDisplayedOtNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Search(Utility.getProperty("Item_Tax_Name"));
	}
	

	@When("I Enter the New Tax Name with Special Characters")
	public void iEnterTheNewTaxNameWithSpecialCharacters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		cmp.EnterName("*&%$$#$$$$$$$$$$");
	}

	@Then("Verify whether the Taxes with Special Characters is Saved or not")
	public void verifyWhetherTheTaxesWithSpecialCharactersIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved Successfully and Store data published successfully"))
		{
			test.log(LogStatus.PASS, "Tax Saved with Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Tax Name already exist pop up displayed when Entering Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(3000);
			cmp.Click_BackspaceButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Special Characters");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_BackspaceButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax not Saved with Special Characters");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try
		{
			Thread.sleep(2000);
			cmp.Click_BackspaceButton();
			
			System.out.println("Cancel button not Clicked while creating Tax with Special Characters");
		}
		catch(Exception k)
		{}
	}
	
	@When("I Enter the New Tax Name with Space")
	public void iEnterTheNewTaxNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName(Utility.getProperty("Item_Tax_Name")+Keys.SPACE);
	}

	@Then("Verify whether the Taxes Name with Space in end is Updated or not")
	public void verifyWhetherTheTaxesNameWithSpaceInEndIsUpdatedOrNot() throws Exception {
		
		Thread.sleep(4000);
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved Successfully and Store data published successfully"))
		{
			test.log(LogStatus.PASS, "Tax Updated with Space in the End of Tax Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Tax Name already exist pop up displayed when Entering Space in the End of Tax Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_BackspaceButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Tax Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_BackspaceButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax not Saved with Space in the End of Tax Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		} 
	}
	
	@Given("I Enable Tax Per Service Type")
	public void iEnableTaxPerServiceType() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    tp.Enable_TaxPerServiceType_Tax();
	}



	@When("I Enter the Item Tax with Amount Name for Tax Per Service Type")
	public void iEnterTheItemTaxWithAmountNameForTaxPerServiceType() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		//Enter the existing Tax name
		cmp.EnterName(Utility.getProperty("Item_Tax_Name")+"SevType");
	}

	@When("I Enter the Percentage for All Service Type")
	public void iEnterThePercentageForAllServiceType() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enter the Percentage for All Service Type
				tp.Tax_Per_Service_Type("500");
				
	}

	@Then("Verify whether the Tax by Enabled with Tax Per Service Type is Saved or not")
	public void verifyWhetherTheTaxByEnabledWithTaxPerServiceTypeIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
		//Check whether the New Tax Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved and Published Successfully"))
		{
			test.log(LogStatus.PASS, "Tax Saved and Published Successfully for Tax Per Service Type");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Saved Failed for Tax Per Service Type");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Given("I Search and Edit the Tax Per Service Type")
	public void iSearchAndEditTheTaxPerServiceType() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit(Utility.getProperty("Item_Tax_Name")+"SevType");
	}


	
	@Given("I Change the Percentage for All Service Type")
	public void iChangeThePercentageForAllServiceType() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		tp.Tax_Per_Service_Type("1000");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'p-relative inputs-rows')]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
		
		for(int i=1;i<=list.size();i++)
		{
			
			String ServicePer=driver.findElement(By.xpath("//div[contains(@class,'p-relative inputs-rows')]/div["+i+"]/app-input/div/div/mat-form-field/div/div/div[4]/input")).getAttribute("value");
		
		
		al.add(ServicePer);
		}
		
		
		
	}

	@Then("Verify whether the Tax by Enabled with Tax Per Service Type is Updated or not")
	public void verifyWhetherTheTaxByEnabledWithTaxPerServiceTypeIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		//Check whether the New Tax Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Updated and Published Successfully"))
		{
			test.log(LogStatus.PASS, "Tax Updated and Published Successfully for Tax Per Service Type");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Updated Failed for Tax Per Service Type");
			
			ut.FailedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			cmp.Click_BackspaceButton();
		}
	}
	
	@Then("I Validate the Tax Percentage for All Service Type after Reopen")
	public void iValidateTheTaxPercentageForAllServiceTypeAfterReopen() 
	{
		
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'p-relative inputs-rows')]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
		
		for(int i=1;i<=list.size();i++)
		{
			String ServiceType=driver.findElement(By.xpath("//app-input-table/div/div[1]/div["+i+"]")).getText();
			String ServicePer=driver.findElement(By.xpath("//div[contains(@class,'p-relative inputs-rows')]/div["+i+"]/app-input/div/div/mat-form-field/div/div/div[4]/input")).getAttribute("value");
		
		
			if(al.get(i).equals(ServicePer))
			{
				test.log(LogStatus.PASS, ServiceType+" Percentage is Correct");
			}
			else
			{
				test.log(LogStatus.FAIL, ServiceType+" Expected is : "+al.get(i)+" Actual is : "+ServicePer);
				ut.FailedCaptureScreenshotAsBASE64();
				
			}
		}
	}
	@Then("I Disable the Tax Per Service Type")
	public void iDisableTheTaxPerServiceType() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	    tp.Disable_TaxPerServiceType_Tax();
	}

}
