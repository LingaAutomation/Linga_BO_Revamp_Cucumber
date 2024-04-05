package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_StoreInventory_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_Store_Inventory
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;


	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_StoreInventory_Page SI = new Settings_StoreInventory_Page();

	@Given("Open Store Inventory home page BaseURL and StoreID")
	public void OpenStoreInventoryPage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"storeInventory");
		Thread.sleep(2000);
	}

	@Given("Verifying the Store Inventory Header Page")
	public void verifyingTheStoreInventoryHeaderPage() 
	{
		cmp.VerifyMainScreenPageHeader("Store Inventory");
	}

	@Given("Verify Business Date Field is Displayed or Not")
	public void verifyBusinessDateFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(SI.date,"Business Date Field");
	}
	@Then("Verify Selling Price Option is Displayed or Not")
	public void verifySellingPriceOptionIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(SI.Selling_Price,"Selling Price Field");
	}
	@Then("Verify Markup Percenatge Option is Displayed or Not")
	public void verifyMarkupPercenatgeOptionIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(SI.Markup_Percentage,"Markup Percentage Field");
	}
	@Then("Verify Email Summary Toggle is Displayed or Not")
	public void verifyEmailSummaryToggleIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(SI.Email_Summary_Alert_NoToggle,"Email Summary Toggle");
	}
	@Then("Verify Vendors CC Toggle is Displayed or Not")
	public void verifyVendorsCCToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(SI.VendorCC_NoToggle,"Vendor CC Toggle");
	}
	@Then("Verify Enable Summary Alert Toggle is Displayed or Not")
	public void verifyEnableSummaryAlertToggleIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(SI.Email_Summary_Alert_NoToggle,"Email Summary Alert Toggle");
	}
	@Then("Verify Enable Stock Expired Alert Toggle is Displayed or Not")
	public void verifyEnableStockExpiredAlertToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(SI.EnableStockExpiredAlert_NoToggle,"Stock Expired Alert Toggle");
	}
	@Then("Verify Auto Remove Expired Stock Toggle is Displayed or Not")
	public void verifyAutoRemoveExpiredStockToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(SI.AutoRemoveExpiredStock_NoToggle,"Auto Remove Expired Stock Toggle");
	}

	@Given("select the Business Date")
	public void selectTheBusinessDate() throws Exception 
	{
		//SI.Dates(Utility.getProperty("Business_Date"));
		SI.Dates();
	}
	@Then("Verify Store Inventory Updated or Not")
	public void verifyStoreInventoryUpdatedOrNot() throws Exception
	{
		try {
		Thread.sleep(1000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Store Inventory Settings Updated Successfully")) 
		{
			test.log(LogStatus.PASS,"Store Inventory Settings Updated Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL,"Store Inventory Settings Not Updated Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("Verify Impact Cost Price as Markup Percentage is Selected as Selling Price")
	public void verifyImpactCostPriceAsMarkupPercentageIsSelectedAsSellingPrice()
	{
		if(SI.Selling_Price.isSelected()) 
		{
			test.log(LogStatus.PASS,"Selling Price Selected as Default");
		}
	}
	@Given("Select the Impact Cost Price as Markup Percentage")
	public void selectTheImpactCostPriceAsMarkupPercentage()
	{
		SI.Markup_Percentage.click();
	}


	@Given("Select the Impact Cost Price as Selling price")
	public void selectTheImpactCostPriceAsSellingPrice() 
	{
		SI.Selling_Price.click();
	}

	@Given("Enable Email Summary Alert Toggle")
	public void enableEmailSummaryAlertToggle() 
	{
		SI.Email_Summary_Alert_YesToggle.click();
	}
	@Then("Verify Email ID Input Box is Displayed or Not")
	public void verifyEmailIDInputBoxIsDisplayedOrNot() 
	{
		try {
			if(SI.Email.isDisplayed()) {
				test.log(LogStatus.PASS,"Email ID input Field is Displayed");
			}
			else {
				test.log(LogStatus.FAIL,"Email ID Inout Field not Displayed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}


	@Given("Enable Vendor CC Toggle")
	public void enableVendorCCToggle() 
	{
		SI.VendorCC_YesToggle.click();
	}


	@Given("Enable Enable Summary Alert")
	public void enableEnableSummaryAlert() 
	{
	  SI.EnableSummaryAlert_YesToggle.click();
	}


	@Given("Enable Enable Stock Expired Toggle")
	public void enableEnableStockExpiredToggle() 
	{
		SI.EnableStockExpiredAlert_YesToggle.click();
	}

	@Given("Enable Auto Remove Expired Stock Toggle")
	public void enableAutoRemoveExpiredStockToggle()
	{
	   SI.AutoRemoveExpiredStock_YesToggle.click();
	}

	@Given("Disable Email Summary Alert Toggle")
	public void disableEmailSummaryAlertToggle() throws Exception 
	{
		for(int i=1;i<=5;i++) 
		{
			Thread.sleep(500);
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		SI.Email_Summary_Alert_NoToggle.click();
	}


	@Given("Disable Vendor CC Toggle")
	public void disableVendorCCToggle() throws Exception
	{
		for(int i=1;i<=7;i++) 
		{
			Thread.sleep(500);
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		SI.VendorCC_NoToggle.click();
	}

	@Given("Disable Enable Summary Alert")
	public void disableEnableSummaryAlert()
	{
		SI.EnableSummaryAlert_NoToggle.click();
	}

	@Given("Disable Enable Stock Expired Toggle")
	public void disableEnableStockExpiredToggle() 
	{
		SI.EnableStockExpiredAlert_NoToggle.click();
	}

	@Given("Disable Auto Remove Expired Stock Toggle")
	public void disableAutoRemoveExpiredStockToggle()
	{
		SI.AutoRemoveExpiredStock_NoToggle.click();
	}
	
	@Given("Enter the Invalid Email ID")
	public void EnterInvalidEmialID() throws Exception 
	{
		SI.Email.clear();
		Thread.sleep(500);
		SI.Email.sendKeys("abc");
	}
	
	@Given("Enter the Valid Email ID")
	public void EnterValidEmailID() throws Exception 
	{
		SI.Email.clear();
		Thread.sleep(500);
		SI.Email.sendKeys(Utility.getProperty("userName"));
	}
	
	@And("I Click the Update button in Store Inventory")
	public void ClickUpdateButtonInStoreInventory() throws Exception 
	{
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[.=' UPDATE ']")).click();
	}

	@Then("Verify Enter Valid Email ID Error Message")
	public void verifyEnterValidEmailIDErrorMessage()
	{
	   if(driver.findElement(By.xpath("(//mat-hint[contains(.,'Enter Valid Email')])[1]")).isDisplayed())
	   {
		   test.log(LogStatus.PASS,"Enter Valid Email Error Message Displayed");
	   }
	   else 
	   {
		   test.log(LogStatus.FAIL,"Enter Valid Email Error Message not Displayed");
	   }
	}

	@Then("Verify whether the Update button is Disabled in Store Inventory")
	public void verifyWhetherTheUpdateButtonIsDisabledInStoreInventory() throws Exception 
	{
		cmp.Check_Button_Disabled(SI.update_btn, "Update button");
	}







}
