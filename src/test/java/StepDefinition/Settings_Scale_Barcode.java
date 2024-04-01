package StepDefinition;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_Scales_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Settings_Scale_Barcode 
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;


	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Scales_Page sp= new Settings_Scales_Page();


	@Given("Open Scale Barcode home page BaseURL and StoreID")
	public void OpenScaleBarcodeHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"scales");
		Thread.sleep(2000);
	}

	@Given("Verifying the Scale Barcode Header Page")
	public void verifyingTheScaleBarcodeHeaderPage() throws Exception 
	{
		Thread.sleep(3000);
		try {
		//cmp.VerifyMainScreenPageHeader("Scale Barcode");
		if(driver.findElement(By.xpath("//h3[contains(.,'Scale Barcode')]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Scale Barcode heading displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else 
		{
			test.log(LogStatus.FAIL,"Scale Barcode heading not displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("I Click New Scale Barcode button")
	public void iClickNewScaleBarcodeButton() throws Exception 
	{
		Thread.sleep(500);
		sp.NewScaleBarCode_Btn.click();
	}
	@Then("Verify New Scale Barcode Header")
	public void verifyNewScaleBarcodeHeader() 
	{
		cmp.VerifyCreationScreenPageHeader("New Scale Barcode");
	}

	@Given("Enter Prefix and Variable Type")
	public void enterPrefixAndVariableType() throws Exception 
	{
		sp.PrefixVariableType_Field.clear();
		Thread.sleep(500);
		sp.PrefixVariableType_Field.sendKeys(RandomStringUtils.randomNumeric(2));
	}
	@Given("Enter PLU Start Position")
	public void enterPLUStartPosition() throws Exception
	{
		sp.PLUStartPosition_Field.clear();
		Thread.sleep(500);
		sp.PLUStartPosition_Field.sendKeys("234");
	}
	@Given("Enter PLU No.of Digits")
	public void enterPLUNoOfDigits() throws Exception 
	{
		sp.PLUNumOfDigits_Field.clear();
		Thread.sleep(500);
		sp.PLUNumOfDigits_Field.sendKeys("65");
	}
	@Given("Enter Scale Barcode Name")
	public void enterScaleBarcodeName() throws Exception 
	{
		sp.VariableTypeName_Field.clear();
		Thread.sleep(500);
		sp.VariableTypeName_Field.sendKeys(Utility.getProperty("ScaleBarcodeName"));
	}

	@Given("Enter Scale Barcode Name Exceeding Limit")
	public void enterScaleBarcodeNameExceedingLimit() throws Exception 
	{
		sp.VariableTypeName_Field.clear();
		Thread.sleep(500);
		sp.VariableTypeName_Field.sendKeys(RandomStringUtils.randomAlphanumeric(27));
	}
	@Then("Verify Name should not be more than {int} characters Error Message")
	public void verifyNameShouldNotBeMoreThanCharactersErrorMessage(Integer int1) 
	{
		if(driver.findElement(By.xpath("(//mat-hint[contains(.,'Name should not be more than 25 characters')])[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Name Should Not be More than 25 charcters Displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Name Should not be More than 25 Characters Not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


	@When("Enter Prifix and Variable Type In Alphabets")
	public void enterPrifixAndVariableTypeInAlphabets() throws Exception
	{
		sp.PrefixVariableType_Field.clear();
		Thread.sleep(500);
		sp.PrefixVariableType_Field.sendKeys("ab");
	}
	@Then("Verfiy Enter Valid Prefix Error Message")
	public void verfiyEnterValidPrefixErrorMessage() 
	{
		if(driver.findElement(By.xpath("(//mat-hint[contains(.,'Enter Valid Prefix')])[2]")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Enter Valid Prefix Error Message Displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Enter Valid Prefix message Not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Enter Prefix and Variable Type Exceeding Limit")
	public void enterPrefixAndVariableTypeExceedingLimit() throws Exception 
	{
		Thread.sleep(1000);
		cmp.Verify_Enter_Excess_Limit_InputBox(sp.PrefixVariableType_Field, "45667",2);
	}

	@When("Select the Set Scale By as Price")
	public void selectTheSetScaleByAsPrice() 
	{
		driver.findElement(By.xpath("//app-radio-button[@name='setScaleBy']//mat-radio-group//mat-radio-button[1]")).click();
	}
	@When("Enter Price Start Position")
	public void enterPriceStartPosition() throws Exception 
	{
		sp.PriceStartPosition_Field.clear();
		Thread.sleep(500);
		sp.PriceStartPosition_Field.sendKeys(RandomStringUtils.randomNumeric(5));
	}
	@Then("Enter Price No.Of Digits")
	public void enterPriceNoOfDigits() throws Exception 
	{
		sp.PriceNumOfDigits_Field.clear();
		Thread.sleep(500);
		sp.PriceNumOfDigits_Field.sendKeys(RandomStringUtils.randomNumeric(5));
	}

	@Given("Enter Scale Barcode Name Set Scale By as Weight")
	public void enterScaleBarcodeNameSetScaleByAsWeight() throws Exception 
	{
		sp.VariableTypeName_Field.clear();
		Thread.sleep(500);
		sp.VariableTypeName_Field.sendKeys(Utility.getProperty("ScaleBarcodeWeightName"));
	}

	@When("Select the Set Scale By as Weight")
	public void selectTheSetScaleByAsWeight() 
	{
		driver.findElement(By.xpath("//app-radio-button[@name='setScaleBy']//mat-radio-group//mat-radio-button[2]")).click();
	}
	@When("Enter Weight Start Position")
	public void enterWeightStartPosition() throws Exception 
	{
		sp.WeightStartPosition_Field.clear();
		Thread.sleep(500);
		sp.WeightStartPosition_Field.sendKeys(RandomStringUtils.randomNumeric(5));
	}
	@Then("Enter Weight No.Of Digits")
	public void enterWeightNoOfDigits() throws Exception 
	{
		sp.WeightNumOfDigits_Field.clear();
		Thread.sleep(500);
		sp.WeightNumOfDigits_Field.sendKeys(RandomStringUtils.randomNumeric(5));
	}
	@Then("Verify Scale Barcode Saved or Not")
	public void verifyScaleBarcodeSavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Barcode Setting Saved Successfully")) 
		{
			test.log(LogStatus.PASS,"Barcode Settings Saved Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Barcode Settings Not Saved Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Search and Edit Scale Barcode")
	public void iSearchAndEditScaleBarcode() throws Exception 
	{
		cmp.SearchAndClickEdit(Utility.getProperty("ScaleBarcodeName"));
	}

	@When("Clear the Barcode Prefix")
	public void clearTheBarcode()
	{
		sp.PrefixVariableType_Field.clear();
	}
	@Then("Verify enter Prefix Error Message")
	public void verifyEnterPrefixErrorMessage()
	{
		if(driver.findElement(By.xpath("(//mat-hint[contains(.,'Enter Prefix')])[2]")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Enter Prefix message Displayed with Empty Prefix Value");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else 
		{
			test.log(LogStatus.PASS,"Enter Prefix message Not Displayed with Empty Prefix Value");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Verify Scale Barcode Updated or Not")
	public void verifyScaleBarcodeUpdatedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Barcode Settings Updated Successfully")) 
		{
			test.log(LogStatus.PASS,"Barcode Settings Updated Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Barcode Settings Not Updated Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("I Search the Scale Barcode and Click the Delete button")
	public void iSearchTheScaleBarcodeAndClickTheDeleteButton() throws Exception 
	{
		cmp.SearchAndClickDelete(Utility.getProperty("ScaleBarcodeName"));
	}
	@Then("Verify the Cancelled Scale Barcode Inactivated or Not")
	public void verifyTheCancelledScaleBarcodeInactivatedOrNot() 
	{
		try {
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Barcode Setting Inactivated Successfully"))
			{
				test.log(LogStatus.FAIL,"Scale Barcode Deleted After Clicking on Cancel Button");
				ut.FailedCaptureScreenshotAsBASE64();

			}
			else {
				test.log(LogStatus.PASS,"Scale Barcode Not Deleted After Clicking on Cancel");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("I Verifying the Scale Barcode Deleted or Not")
	public void iVerifyingTheScaleBarcodeDeletedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Barcode Setting Inactivated Successfully"))
		{
			test.log(LogStatus.PASS,"Scale Barcode Deleted Successfully");
			ut.PassedCaptureScreenshotAsBASE64();

		}
		else {
			test.log(LogStatus.FAIL,"Scale Barcode Not Deleted Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Scale Barcode")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedScaleBarcode() throws Exception 
	{
		// Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();

		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");

		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("ScaleBarcodeName"));
	}

	@Given("I Search the Scale Barcode and Click the Active button")
	public void iSearchTheScaleBarcodeAndClickTheActiveButton() throws Exception 
	{
		cmp.SearchAndClickActivate(Utility.getProperty("ScaleBarcodeName"));
	}
	@Then("Verify the Cancelled Scale Barcode is Activated or Not")
	public void verifyTheCancelledScaleBarcodeIsActivatedOrNot()
	{
		try {
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Barcode Setting Activated Successfully"))
		{
			test.log(LogStatus.FAIL,"Scale Barcode Activated Successfully after Clicking on Cancel");
			ut.FailedCaptureScreenshotAsBASE64();

		}
		else {
			test.log(LogStatus.PASS,"Scale Barcode Not Activated After Clicking on Cancel");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("I Verifying the Scale Barcode Activated or Not")
	public void iVerifyingTheScaleBarcodeActivatedOrNot()
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Barcode Setting Activated Successfully"))
		{
			test.log(LogStatus.PASS,"Scale Barcode Activated Successfully");
			ut.PassedCaptureScreenshotAsBASE64();

		}
		else {
			test.log(LogStatus.FAIL,"Scale Barcode Not Activated");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Click the Active button to navigate Activated screen to Verify Activated Scale Barcode")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedScaleBarcode() throws Exception 
	{
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();

		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");

		//Verify whether the Gift Card activated or not
		cmp.Verify_Search(Utility.getProperty("ScaleBarcodeName"));
	}

	@Then("Verify whether Duplicate Scale Barcode Saved or Not")
	public void verifyWhetherDuplicateScaleBarcodeSavedOrNot() throws Exception 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Scale Barcode Name already exist pop up displayed");

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
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Scale Barcode Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Scale Barcode Saved");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("Verify Please Enter Name Error Message")
	public void VerfiyPleaseEnterNameErrorMessage() 
	{
		if(driver.findElement(By.xpath("(//mat-hint[contains(.,'Please Enter Name')])[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Please Enter Name Error Message Displayed without entering Name Field");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.PASS,"Please Enter Name Error Message Not Displayed without entering Name Field");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Given("Verify Name Column is Displayed or Not")
	public void VerifyNameColumIsDispalyedorNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(sp.NameColumn,"Name Column Field");
	}
	
	@Then("Verify Prefix\\/Variable Type Column is Displayed or Not")
	public void VerifyPrefix_VariableTypeColumn() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(sp.PrefixVariableTypeColumn,"Prefix/Variable Type Column Field");
	}
	
	@Then("Verify PLU Column is Displayed or Not")
	public void VerifyPLUColumn() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(sp.PLUCodeColumn,"PLU Code Column Field");
	}
	
	@Then("Verify Price Details Column is Displayed or Not")
	public void VerifyPriceDetailsColumn() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(sp.PriceDetailsColumn,"Price Details Column Field");
	}
	
	@Then("Verify Weight Details Column is Displayed or Not")
	public void VerifyWeightDetailsColumn() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(sp.WeightDetailsColumn,"Weight Details Column Field");
	}

	@Then("Verify Scale Barcode Update Screen Closed or Not")
	public void verifyScaleBarcodeUpdateScreenClosedOrNot() throws Exception
	{
		cmp.Verify_Close_Cancel_CreationScreen("Scale Barcode Update");
	}




}
