package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_Batch_Settings_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_BatchSettings 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Batch_Settings_Page bs = new Settings_Batch_Settings_Page();


	@Given("Open BatchSettings home page BaseURL and StoreID")
	public void OpenBatchSettingsHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+"settings/"+"batchSettings");
	}

	@Given("Verifying the BatchSettings Header Page")
	public void verifyingTheBatchSettingsHeaderPage()
	{
		if(driver.findElement(By.xpath("//h3[contains(.,'Batch Settings')]")).isDisplayed()) {
			test.log(LogStatus.PASS, "Batch Settings page is loaded successfully");
		}
		else {
			test.log(LogStatus.FAIL,"Batch Settings page not Loaded Successfully");
		}
	}

	@Then("Verify Enable Auto Batch Toggle is Displayed or Not")
	public void verifyEnableAutoBatchToggleIsDisplayedOrNot()
	{
		if(bs.Enable_AutoBatch_Yes.isDisplayed()) {
			test.log(LogStatus.PASS,"Enable AutoBatch Toggle is Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Enable AutoBatch Toggle is Not Displayed");
		}
	}
	@Then("Verify Print Batch Report Toggle is Displayed or Not")
	public void verifyPrintBatchReportToggleIsDisplayedOrNot()
	{
		try {
			if(bs.Print_BatchReport_Yes.isDisplayed()) {
				test.log(LogStatus.PASS,"Print Batch Report Toggle is Displayed");
			}
			else {
				test.log(LogStatus.FAIL,"Print Batch Report Toggle is Not Displayed");
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Enable Auto Batch Toggle is Disabled so Print Batch Report Toggle not Displayed");
		}
	}
	@Then("Verify Batch Submit Device is Displayed or Not")
	public void verifyBatchSubmitDeviceIsDisplayedOrNot() 
	{
		if(bs.Batch_Submit_Device_DropDown.isDisplayed()) {
			test.log(LogStatus.PASS,"Batch Submit Device Dropdown Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Batch Submit Device Dropdown Not Displayed");
		}
	}
	@Then("Verify Default Batch Payment is Displayed or Not")
	public void verifyDefaultBatchPaymentIsDisplayedOrNot() 
	{
		if(bs.Default_Batch_Payment.isDisplayed()) {
			test.log(LogStatus.PASS,"Default Batch Payment Device is Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Default Batch Payment Device Not Displayed");
		}
	}

	@Then("Verify TicketNo Field in Table Displayed or Not")
	public void verifyTicketNoFieldInTableDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(bs.Ticket_No, "Ticket No Field"); 
	}
	@Then("Verify CardNo Field in Table Displayed or Not")
	public void verifyCardNoFieldInTableDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(bs.Card_No,"Card No Feild"); 
	}
	@Then("Verify Amount Field in Table Displayed or Not")
	public void verifyAmountFieldInTableDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(bs.Amount,"Amount Feild"); 
	}
	@Then("Verify Tip Amount Field in Table Displayed or Not")
	public void verifyTipAmountFieldInTableDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(bs.TipAmount,"Tip Amount Feild"); 
	}
	@Then("Verify Actions Field in Table Displayed or Not")
	public void verifyActionsFieldInTableDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(bs.Actions,"Actions Feild"); 
	}

	@Then("Verify Enable Auto Auton Batch is Enabled or Not")
	public void verifyEnableAutoAutonBatchIsEnabledOrNot()
	{
		if(bs.Enable_AutoBatch_Yes.isEnabled()) {
			test.log(LogStatus.PASS,"By Default Enable Auto Batch Toggle is Enabled");
		}
		else {
			test.log(LogStatus.FAIL,"By Default Enable AutoBatch Toggle is Not Enabled");
		}
	}
	@Then("Verify Print Batch Report is Enabled or Not")
	public void verifyPrintBatchReportIsEnabledOrNot()
	{
		try {
		if(bs.Print_BatchReport_Yes.isEnabled()) {
			test.log(LogStatus.PASS,"By Default Print Batch Report Toggle is Enabled");
		}
		else {
			test.log(LogStatus.FAIL,"By Default Print Batch Report Toggle is Not Enabled");
		}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.INFO,"Enable Auto Batch Toggle is Disabled so Print Batch Report Toggle not Displayed");
		}
	}


	@Given("Disable the Enable Auto Batch Toggle")
	public void disableTheEnableAutoBatchToggle() 
	{
		bs.Enable_AutoBatch_No.click();
	}
	@Then("Enable the Enable Auto Batch Toggle")
	public void enableTheEnableAutoBatchToggle() 
	{
		bs.Enable_AutoBatch_Yes.click();
	}
	@Then("Verify Batch Settings Updated or Not")
	public void verifyBatchSettingsUpdatedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Batch Settings updated successfully"))
		{
			test.log(LogStatus.PASS, "Batch Settings updated successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Batch Settings Saving failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}	
	}

	@Then("Disable Print Batch Report Toggle")
	public void disablePrintBatchReportToggle() 
	{
		bs.Print_BatchReport_No.click();
	}
	@Then("Enable Print Batch Report Toggle")
	public void enablePrintBatchReportToggle() 
	{
		bs.Print_BatchReport_Yes.click();
	}

	@Then("Select the Time")
	public void selectTheTime() throws Exception
	{
		bs.Click_TimePicker_AM();
	}

	@Then("Select Batch Submit Device From dropdown")
	public void selectBatchSubmitDeviceFromDropdown() throws Exception 
	{
		Thread.sleep(4000);
		bs.Click_Batch_Submit_Device_DropDown();
		Thread.sleep(2000);
		try {
			bs.Clicking_Node1();
			Thread.sleep(2000);
//			bs.Click_Batch_Submit_Device_DropDown();
//			Thread.sleep(2000);
//			bs.Clicking_Node2();
//			Thread.sleep(2000);
		}catch(Exception d) {
			test.log(LogStatus.INFO, "Node is not available");
		}

		Thread.sleep(3000);
	}
	@Then("Select the Default Batch Payment Device")
	public void selectTheDefaultBatchPaymentDevice() throws Exception 
	{
		bs.Click_Batch_Payment_Device();
		Thread.sleep(2000);
		bs.clicking_Payment1();
		Thread.sleep(2000);
		bs.Click_Batch_Payment_Device();
		Thread.sleep(2000);
		bs.Clicking_Payment2();
		Thread.sleep(2000);
	}


	@Given("Search the Batch and click on Delete and Cancel")
	public void SearchtheBatchAndClickonDeleteandCancel() throws Exception 
	{
		try {
			if(driver.findElement(By.xpath("//td[contains(.,'Batch not found')]")).isDisplayed()) {
				test.log(LogStatus.INFO, "Batch is not available at this time");
			}
		}
		catch(Exception d) {
			test.log(LogStatus.INFO, "Batch is available");

			if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
			{
				String SearchText=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();

				Thread.sleep(1000);
				cmp.SearchBox.clear();
				Thread.sleep(2000);

				cmp.SearchBox.sendKeys(SearchText);
				Thread.sleep(2000);

				bs.delete.click();
				cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
				Thread.sleep(500);
				cmp.Click_CancelButton();

				try {
					if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Batch Setting Removed Successfully"))
					{
						test.log(LogStatus.PASS, "Batch Settings Deleted successfully");

						ut.PassedCaptureScreenshotAsBASE64();
					}
					else
					{
						test.log(LogStatus.FAIL, "Batch Settings Deletion failed");

						ut.FailedCaptureScreenshotAsBASE64();
					}	
				}
				catch (Exception e) 
				{
					test.log(LogStatus.PASS,"Batch not Deleted After Clicking on Cancel");
				}
			}

		}
	}
	
	@Given("Search the Batch and click on Delete")
	public void SearchtheBatchAndClickonDelete() throws Exception 
	{
		try {
			if(driver.findElement(By.xpath("//td[contains(.,'Batch not found')]")).isDisplayed()) {
				test.log(LogStatus.INFO, "Batch is not available at this time");
			}
		}
		catch(Exception d) {
			test.log(LogStatus.INFO, "Batch is available");

			if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
			{
				String SearchText=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();

				Thread.sleep(1000);
				cmp.SearchBox.clear();
				Thread.sleep(2000);

				cmp.SearchBox.sendKeys(SearchText);
				Thread.sleep(2000);

				bs.delete.click();
				cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
				Thread.sleep(500);
				cmp.Click_DeleteButton();

				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Batch Setting Removed Successfully"))
				{
					test.log(LogStatus.PASS, "Batch Settings Deleted successfully");

					ut.PassedCaptureScreenshotAsBASE64();
				}
				else
				{
					test.log(LogStatus.FAIL, "Batch Settings Deletion failed");

					ut.FailedCaptureScreenshotAsBASE64();
				}	
			}
		}
	}


	@And("I Click the Update button in Batch Settings")
	public void ClickUpdateButton() 
	{
		bs.Update_button.click();
	}

	@Then("Verify whether the Update button is Disabled in Batch")
	public void VerifyUpdateButtonisDisabled() throws Exception {
		cmp.Check_Button_Enabled(bs.Update_button,"Update Button");
	}

}
