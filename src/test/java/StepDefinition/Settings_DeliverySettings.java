package StepDefinition;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.Pages.Settings_Delivary_Settings_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_DeliverySettings 
{
	public String Percentage;
	public String PercenatgeAfterIncrease;
	public String PercenatgeAfterDecrease;
	public String Min;
	public String MinAfterIncrease;
	public String MinAfterDecrease;
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Delivary_Settings_Page dsp = new Settings_Delivary_Settings_Page();
	ReportsPage rp = new ReportsPage();

	@Given("Open DeliverySettings home page BaseURL and StoreID")
	public void OpenDeliverySettingsHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"delivery");
	}


	@Given("Verifying the DeliverySettings Header Page")
	public void verifyingTheDeliverySettingsHeaderPage() throws Exception
	{
		Thread.sleep(5000);
		cmp.VerifyMainScreenPageHeader("Delivery");
	}

	@Given("Click on Settings Tab Under Settings")
	public void clickOnSettingsTabUnderSettings() 
	{
		driver.findElement(By.xpath("(//span[.='SETTINGS'])[2]")).click();
	}

	@Then("Verify Sync Data to Weborder Field is Displayed or Not")
	public void verifySyncDataToWeborderFieldIsDisplayedOrNot() 
	{
		if(dsp.sync.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sync Data Button is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL,"Sync Data Field is Not Displayed");
		}
	}
	@Then("Verify DeliveryCharge Cost Field is Displayed or Not")
	public void verifyDeliveryChargeCostFieldIsDisplayedOrNot() 
	{
		if(dsp.cost.isDisplayed())
		{
			test.log(LogStatus.PASS,"Delivery Charge Cost Field is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Delivery Charge Cost Field is Not Displayed");
		}
	}
	@Then("Verify DeliveryCharge Compensastion to Driver is Displayed or Not")
	public void verifyDeliveryChargeCompensastionToDriverIsDisplayedOrNot()
	{
		if(dsp.per.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"DeliveryCharge Compensastion to Driver Field is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL,"DeliveryCharge Compensastion to Driver Field is Not Displayed");
		}
	}
	@Then("Verify Print Future Order Before is Displayed or Not")
	public void verifyPrintFutureOrderBeforeIsDisplayedOrNot()
	{
		if(dsp.min.isDisplayed()) 
		{
			test.log(LogStatus.PASS," Print Future Order Before Field is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL," Print Future Order Before Field is Not Displayed");
		}
	}
	@Then("Verify Assign Order to Departed Driver Toggle is Displayed or Not")
	public void verifyAssignOrderToDepartedDriverToggleIsDisplayedOrNot() 
	{
		if(dsp.AssignOrderToDepartedOrder_YesToggle.isDisplayed())
		{
			test.log(LogStatus.PASS,"Assign Order to Departed Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Assign Order to Departed Toggle is Not Displayed");
		}
	}
	@Then("Verify Cashier report for Driver Toggle is Displayed or Not")
	public void verifyCashierReportForDriverToggleIsDisplayedOrNot()
	{
		if(dsp.EnableCashierReportForDriver_YesToggle.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Cashier Report for Toggel is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Cashier Report for Toggel is not Displayed");
		}
	}

	@Given("Click on Sync Data")
	public void clickOnSyncData() throws Exception
	{
		Thread.sleep(2000);
		dsp.sync.click();
		Thread.sleep(2000);
		cmp.Alert_PopupMsg("Are you sure want to sync with web order?");
	}
	@Then("I Click on No button")
	public void iClickOnNoButton() throws Exception 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'action-buttons')])[1]/div/div[1]/button")).click();
	}

	@Given("Click on Yes button")
	public void clickOnYesButton() throws Exception 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'action-buttons')])[1]/div/div[2]/button")).click();
		Thread.sleep(2000);
	}
	@Then("Verify Data Synced or Not")
	public void verifyDataSyncedOrNot() throws Exception 
	{
		cmp.VerifySaveConfirmationAlertMessage("Store successfully synced. This process can take up to 15 minutes.");
	}

	@Given("Clear the Cost Filed")
	public void clearTheCostFiled() 
	{
		dsp.cost.clear();
	}
	@Then("Enter Cost Exceeding Limit")
	public void enterCostExceedingLimit()
	{
		dsp.cost.sendKeys(RandomStringUtils.randomNumeric(15));
		//get the value or string of store name field
		int s2 =dsp.cost.getAttribute("value").length();

		//verify it accepts only 25 or above
		if(s2==9) {
			test.log(LogStatus.PASS, "Cost field accept only the 9 chars");
		}
		else if(s2 > 9){
			test.log(LogStatus.FAIL, "Cost field accept more than 9 chars");
		}
	}

	@Given("Enter Valid Cost")
	public void enterValidCost() 
	{
		dsp.cost.sendKeys("563");
	}
	@Then("Verify Delivery Settings Saved Or Not")
	public void verifyDeliverySettingsSavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Delivery Settings Updated Successfully"))
		{
			test.log(LogStatus.PASS,"Delivery Settings Updated Successfully");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Delivery Settings Not Updated Successfully");
		}
	}

	@Given("Clear the Percenatge Filed")
	public void clearThePercenatgeFiled()
	{
		dsp.per.clear();
	}
	@Given("Enter Invalid Percentage")
	public void enterInvalidPercentage() 
	{
		dsp.per.sendKeys("10200");
	}
	@Then("Verify Percentage should not be greater than hundred Error Message")
	public void verifyPercentageShouldNotBeGreaterThanErrorMessage() 
	{
		if(driver.findElement(By.xpath("//div[.=' Percentage should not be greater than 100 ']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Percentage should not be greated than 100 Message Displayed");
		}
		else 
		{
			test.log(LogStatus.PASS,"Percentage should not be greated than 100 Message Not Displayed");
		}
	}

	@Given("Enter Valid Percentage")
	public void enterValidPercentage() 
	{
		dsp.per.sendKeys("6000");
	}


	@Given("Click on UpArrow in Percentage")
	public void clickOnUpArrowInPercentage() 
	{
		Percentage=dsp.per.getAttribute("value");

		driver.findElement(By.xpath("//app-input[contains(@type,'percentage')]/../..//button[1]")).click();

		PercenatgeAfterIncrease=dsp.per.getAttribute("value");


	}

	@Then("Verify Percentage is Increased or Not")
	public void verifyPercentageIsIncreasedOrNot()
	{
		if(Percentage!=PercenatgeAfterIncrease)
		{
			test.log(LogStatus.PASS,PercenatgeAfterIncrease +"Entered percentage increased by 1");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, PercenatgeAfterIncrease +"Entered percentage not increased by 1");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


	@Given("Click on DownArrow in Percentage")
	public void clickOnDownArrowInPercentage()
	{
		Percentage=dsp.per.getAttribute("value");

		driver.findElement(By.xpath("//app-input[contains(@type,'percentage')]/../..//button[2]")).click();

	}
	@Then("Verify Percentage is Decreased or Not")
	public void verifyPercentageIsDecreasedOrNot() 
	{
		PercenatgeAfterDecrease=dsp.per.getAttribute("value");
		if(PercenatgeAfterIncrease!=PercenatgeAfterDecrease)
		{
			test.log(LogStatus.PASS,PercenatgeAfterDecrease +"Entered percentage decreased by 1");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL,PercenatgeAfterDecrease +"Entered percentage not decreased by 1");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Clear the Minutes Field")
	public void clearTheMinutesField() 
	{
		dsp.min.clear();
	}
	@Then("Enter Minutes Exceeding Limit")
	public void enterMinutesExceedingLimit() 
	{
		dsp.min.sendKeys(RandomStringUtils.randomNumeric(4));
		//get the value or string of store name field
		int s2 =dsp.min.getAttribute("value").length();

		//verify it accepts only 25 or above
		if(s2==4) {
			test.log(LogStatus.PASS, "Min field accept only the 4 chars");
		}
		else if(s2 > 4){
			test.log(LogStatus.FAIL, "Min field accept more than 4 chars");
		}
	}

	@Then("Enter Valid Minutes")
	public void enterValidMinutes() 
	{
		dsp.min.sendKeys("30");
	}

	@Given("Click on UpArrow in Minutes")
	public void clickOnUpArrowInMinutes() throws Exception 
	{
		Min=dsp.min.getAttribute("value");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//app-input[contains(@type,'number')]/div/div/mat-form-field/div/div[1]//button[1]")).click();

	}

	@Then("Verify Verify Minutes Increased or Not")
	public void verifyVerifyMinutesIncreasedOrNot() 
	{
		MinAfterIncrease = dsp.min.getAttribute("value");
		if(Min!=MinAfterIncrease)
		{
			test.log(LogStatus.PASS,MinAfterIncrease+"Entered minute increased by 1");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL,MinAfterIncrease+"Entered minute not increased by 1");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Click on DownArrow in Minutes")
	public void clickOnDownArrowInMinutes() throws Exception
	{
		Thread.sleep(1500);
		driver.findElement(By.xpath("//app-input[contains(@type,'number')]/div/div/mat-form-field/div/div[1]//button[2]")).click();
	}

	@Then("Verify Verify Minutes Decreased or Not")
	public void verifyVerifyMinutesDecreasedOrNot()
	{
		MinAfterDecrease =dsp.min.getAttribute("value");
		if(MinAfterIncrease!=MinAfterDecrease)
		{
			test.log(LogStatus.PASS,MinAfterDecrease+"Entered minute decreased by 1");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, MinAfterDecrease+"Entered minute not decreased by 1");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Disable Assign Order to Departed Driver Toggle")
	public void disableAssignOrderToDepartedDriverToggle()
	{
		dsp.AssignOrderToDepartedOrder_NoToggle.click();
	}
	@Given("Enable Assign Order to Departed Driver Toggle")
	public void enableAssignOrderToDepartedDriverToggle() 
	{
		dsp.AssignOrderToDepartedOrder_NoToggle.click();
	}


	@Given("Disable Enable Cashier Report for Driver Toggle")
	public void disableEnableCashierReportForDriverToggle() 
	{
		dsp.EnableCashierReportForDriver_NoToggle.click();
	}
	@Given("Enable Enable Cashier Report for Driver Toggle")
	public void enableEnableCashierReportForDriverToggle() 
	{
		dsp.EnableCashierReportForDriver_YesToggle.click();
	}

	@Given("Click on Delivery Zone")
	public void clickOnDeliveryZone() throws Exception 
	{
		Thread.sleep(3000);
		dsp.Click_Delivery_ZoneTab();
	}
	@Given("Verify Delivery Zone Heading")
	public void verifyDeliveryZoneHeading() 
	{
		dsp.Verify_DeliveryHomePage("DELIVERY ZONES");
	}

	@Then("Verify Name Filed in Table Displayed or Not")
	public void verifyNameFiledInTableDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(dsp.NameField,"Name Field"); 
	}
	@Then("Verify Charge Cost Field in Table Displayed or Not")
	public void verifyChargeCostFieldInTableDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(dsp.ChargeCostField,"Charge Cost Field");
	}
	@Then("Verify Exp Delivery Time Field in Table Displayed or Not")
	public void verifyExpDeliveryTimeFieldInTableDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(dsp.ExpDeliveryTimeFiled,"Exp DeliveryTime Filed");
	}
	@Given("Click on New Delivery Zone")
	public void clickOnNewDeliveryZone() throws Exception 
	{
		for(int i=1;i<=10;i++) 
		{
			Thread.sleep(500);
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		dsp.Add_Delivery_ZoneBtn.click();
	}
	@Then("Verify Creation Screen Page Header")
	public void verifyCreationScreenPageHeader() 
	{
		cmp.VerifyCreationScreenPageHeader("New Delivery Zone");
	}

	@Given("Enter Delivery Zone Name")
	public void enterDeliveryZoneName() throws Exception
	{
		cmp.EnterName(Utility.getProperty("New_Store_State")+"1");
	}

	@Given("Enter Delivery Charge Cost")
	public void enterDeliveryChargeCost()
	{
		dsp.Delivery_Charge_Cost_InputBx.sendKeys(RandomStringUtils.randomNumeric(10));
	}

	@Given("Enter Expected Delivery Time")
	public void enterExpectedDeliveryTime() 
	{
		dsp.Expected_DeliveryTime_InputBx.sendKeys(RandomStringUtils.randomNumeric(4));
	}

	@Then("Verify Draw Your Delivery Zone Popup Displayed or Not")
	public void verifyDrawYourDeliveryZonePopupDisplayedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Draw Your Delivery Zone On the Map"))
		{
			test.log(LogStatus.PASS, "Draw Your Delivery Zone On the Map is Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Draw your Delivery Zone popup is not Displayed");
		}
	}

	@Given("Select the Zone Area")
	public void selectTheZoneArea() throws Exception 
	{
		dsp.Draw_DeliveryZone_onMap();
	}
	@Then("Verify whether Delivery zone Saved or Not")
	public void verifyWhetherDeliveryZoneSavedOrNot() throws Exception 
	{
		Thread.sleep(2000);
		//Check whether the Delivery Zone Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Delivery Zone Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Delivery Zone Saved Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Delivery Zone Save Failed");
			ut.FailedCaptureScreenshotAsBASE64();

		}
	}

	@Given("Search and Click Edit Delivery Zone")
	public void searchAndClickEditDeliveryZone() throws Exception
	{
		//Click the Delivery Zone
		dsp.SearchAndClickEdit(Utility.getProperty("New_Store_State")+"1");


		Thread.sleep(1000);

	}
	@Then("Verify Update Screen Header")
	public void verifyUpdateScreenHeader() throws Exception 
	{
		Thread.sleep(2000);
		//Verify whether the Delivery Zone Page opened or not
		cmp.VerifyCreationScreenPageHeader("Update Delivery Zone");
	}

	@Given("Clear the Name")
	public void clearTheName() throws Exception 
	{
		cmp.EnterName("");
	}

	@Then("Clear Delivery Charge Cost")
	public void clearDeliveryChargeCost()
	{
		dsp.Delivery_Charge_Cost_InputBx.clear();
	}


	@Given("Disable Enable PUC Toggle")
	public void disableEnablePUCToggle()
	{
		dsp.puc_No.click();
	}
	@Then("Enable Enable PUC Toggle")
	public void enableEnablePUCToggle() 
	{
		dsp.puc_Yes.click();
	}
	@Then("Verify API Key Field is Displayed or Not")
	public void verifyAPIKeyFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(dsp.APIKey_Input,"API Key Input Feild"); 
	}
	@Then("Verify Cabinate Alias Field is Dispalyed or Not")
	public void verifyCabinateAliasFieldIsDispalyedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(dsp.Cabinate_Alias_Input,"Cabinate Alias Input Feild"); 
	}
	@Then("Verify Cabinate ID Field is Dispalyed or Not")
	public void verifyCabinateIDFieldIsDispalyedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(dsp.Cabinate_ID_Input,"Cabinate ID Input Feild"); 
	}

	@Given("Clear the API Key")
	public void clearTheAPIKey()
	{
		dsp.APIKey_Input.clear();
	}
	@Then("Enter API Key in the Form of Numbers")
	public void enterAPIKeyInTheFormOfNumbers()
	{
		dsp.APIKey_Input.sendKeys(RandomStringUtils.randomNumeric(5));
	}

	@Then("Enter API Key in the Form of Numbers Special Characters and Alphabets")
	public void enterAPIKeyInTheFormOfNumbersSpecialCharactersAndAlphabets() 
	{
		dsp.APIKey_Input.sendKeys("fghd%^^123A");
	}

	@Given("Clear the Cabinate Alias")
	public void clearTheCabinateAlias()
	{
		dsp.Cabinate_Alias_Input.clear();
	}
	@Then("Enter Cabinate Alias in the Form of Numbers Special Characters and Alphabets")
	public void enterCabinateAliasInTheFormOfNumbersSpecialCharactersAndAlphabets()
	{
		dsp.Cabinate_Alias_Input.sendKeys("fg#$@12h");
	}
	@Then("Verify whether PUC Settings Saved or Not")
	public void verifyWhetherPUCSettingsSavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("PUC Cabinet Settings Updated Successfully"))
		{
			test.log(LogStatus.PASS,"PUC Cabinate Settings Updated Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else 
		{
			test.log(LogStatus.FAIL,"PUC Cabinate Settings Not Updated Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Clear the Cabinate ID")
	public void clearTheCabinateID() 
	{
		dsp.Cabinate_ID_Input.clear();
	}
	@Then("Enter Cabinate ID in the Form of Numbers Special Characters and Alphabets")
	public void enterCabinateIDInTheFormOfNumbersSpecialCharactersAndAlphabets()
	{
		dsp.Cabinate_ID_Input.sendKeys("gh$%444C");
	}

	@Given("Click on Driver Tab")
	public void clickOnDriverTab() throws Exception
	{
		 for(int i=1;i<=8;i++) 
		    {
			 Thread.sleep(500);
		    	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		    }
		dsp.driver_btn.click();
	}
	@Then("Verify Main Screen Page Header")
	public void verifyMainScreenPageHeader()
	{
		dsp.Verify_DeliveryHomePage("DRIVER");
	}

	@Given("Disable Enable Tarcking Toggle")
	public void disableEnableTarckingToggle() 
	{
		dsp.EnableTracking_NoToggle.click();
	}
	@Then("Enable Enable Tracking Toggle")
	public void enableEnableTrackingToggle()
	{
		dsp.EnableTracking_YesToggle.click();
	}
	@Then("Verify whether Driver Settings Saved or Not")
	public void verifyWhetherDriverSettingsSavedOrNot()
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Driver Settings Updated Successfully"))
		{
			test.log(LogStatus.PASS,"Driver Settings Updated Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else 
		{
			test.log(LogStatus.FAIL,"Driver Settings Not Updated Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Disable Directions Toggle")
	public void disableDirectionsToggle() throws Exception 
	{
		Thread.sleep(2000);
		dsp.Direction_NoToggle.click();
	}
	@Then("Enable Directions Toggle")
	public void enableDirectionsToggle()
	{
		dsp.Direction_YesToggle.click();
	}


	@Given("Disable Show Inactive Drivers Toggle")
	public void disableShowInactiveDriversToggle()
	{
		dsp.Show_InactiveDrivers_No.click();
	}
	@Then("Enable show Inactive Drivers Toggle")
	public void enableShowInactiveDriversToggle()
	{
		dsp.Show_InactiveDrivers_Yes.click();
	}


	@Given("Clear the Order Undelivered From Driver")
	public void clearTheOrderUndeliveredFromDriver() 
	{
		driver.findElement(By.xpath("//span[.='Order Undelivered (From Driver App) Notification']/../..//input")).clear();
	}
	@Then("Enter Order Undelivered From Driver")
	public void enterOrderUndeliveredFromDriver()
	{
		driver.findElement(By.xpath("//span[.='Order Undelivered (From Driver App) Notification']/../..//input")).sendKeys(RandomStringUtils.randomAlphabetic(10));
	}

	@Given("Disable Driver Departure Toggle")
	public void disableDriverDepartureToggle()
	{
		dsp.Driver_Departure_No.click();
	}
	@Then("Enable Driver Departure Toggle")
	public void enableDriverDepartureToggle() 
	{
		dsp.Driver_Departure_Yes.click();
	}

	@Given("Clear the Driver Departure Input Field")
	public void clearTheDriverDepartureInputField()
	{
		dsp.Driver_DepartureTextArea.clear();
	}
	@Then("Enter Driver Departure Text Message")
	public void enterDriverDepartureTextMessage() 
	{
		dsp.Driver_DepartureTextArea.sendKeys(RandomStringUtils.randomAlphanumeric(18));
	}

	@Given("Disable Order Delayed Toggle")
	public void disableOrderDelayedToggle() 
	{
		dsp.OrderDelayed_No.click();
	}
	@Then("Enable Order Delayed Toggle")
	public void enableOrderDelayedToggle()
	{
		dsp.OrderDelayed_Yes.click();
	}


	@Given("Clear the Order Delayed Input Field")
	public void clearTheOrderDelayedInputField()
	{
		dsp.OrderDelayed_Text.clear();
	}
	@Then("Enter Order Delayed Text Message")
	public void enterOrderDelayedTextMessage() 
	{
		dsp.OrderDelayed_Text.sendKeys(RandomStringUtils.randomAlphanumeric(18));
	}

	@Given("Disable Undelivered Toggle")
	public void disableUndeliveredToggle()
	{
		dsp.Undelivered_No.click();
	}
	@Then("Enable Undelivered toggle")
	public void enableUndeliveredToggle()
	{
		dsp.Undelivered_Yes.click();
	}

	@Given("Clear the Undelivered Input Field")
	public void clearTheUndeliveredInputField() 
	{
		dsp.Undelivered_Text.clear();
	}
	@Then("Enter Undelivered Text Message")
	public void enterUndeliveredTextMessage() 
	{
		dsp.Undelivered_Text.sendKeys(RandomStringUtils.randomAlphanumeric(18));
	}


	@Given("Disable Near By Toggle")
	public void disableNearByToggle() 
	{
		dsp.NearBy_No.click();
	}
	@Then("Enable Near By Toggle")
	public void enableNearByToggle()
	{
		dsp.NearBy_Yes.click();
	}

	@Given("Clear the Near By Input Field")
	public void clearTheNearByInputField()
	{
		dsp.NearBy_Text.clear();
	}
	@Then("Enter Near By Text Message")
	public void enterNearByTextMessage() 
	{
		dsp.NearBy_Text.sendKeys(RandomStringUtils.randomAlphanumeric(18));
	}


	@Given("Disable Completed Toggle")
	public void disableCompletedToggle() 
	{
		dsp.Completed_No.click();
	}
	@Then("Enable Completed Toggle")
	public void enableCompletedToggle()
	{
		dsp.Completed_Yes.click();
	}


	@Given("Clear the Completed Input Field")
	public void clearTheCompletedInputField() 
	{
		dsp.Order_Completed.clear();
	}
	@Then("Enter Completed Text Message")
	public void enterCompletedTextMessage() 
	{
		dsp.Order_Completed.sendKeys(RandomStringUtils.randomAlphanumeric(18));
	}

	@And("I Click the Save button in Delivery Settings")
	public void ClickSaveButtonInDeliverySettings() throws Exception
	{
		if(driver.findElement(By.xpath("//span[contains(.,'SAVE')]")).isEnabled()) 
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(.,'SAVE')]")).click();
		}
	}

	@Given("Click on PUC Tab")
	public void clickOnPUCTab() 
	{
	    for(int i=1;i<=8;i++) 
	    {
	    	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
	    }
		dsp.puc_btn.click();
	}
	@Then("Verify PUC Screen Header")
	public void verifyPUCScreenHeader()
	{
		dsp.Verify_DeliveryHomePage("PUC");
	}

	@Then("Verify Delivery Zone Updated Or Not")
	public void verifyDeliveryZoneUpdatedOrNot()
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Delivery Zone Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Delivery Zone Updated Successfully");
	        ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL, "Delivery Zone Not Updated Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Search the Delivery Zone and Click the Delete button")
	public void searchTheDeliveryZoneAndClickTheDeleteButton() throws Exception
	{
		//Search and Click Delete button
				dsp.SearchAndClickDelete(Utility.getProperty("New_Store_State")+"1");
				
				Thread.sleep(500);
				//Click the Delete button
				cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Delivery Zone Inactivated or Not")
	public void verifyTheCancelledDeliveryZoneInactivatedOrNot()
	{
		try
		{
		if(driver.findElement(By.xpath("//div[.='"+Utility.getProperty("New_Store_State")+"1"+"']/../div/div[2]/button")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Delivery Zone not Inactivated when Click Cancel button");
		}
		}
		catch(Exception p)
		{
			test.log(LogStatus.FAIL, "Delivery Zone Inactivated when Click Cancel button");
		}
	}

	@Then("I Verifying the Delivery Zone Deleted or Not")
	public void iVerifyingTheDeliveryZoneDeletedOrNot() {
	   if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Delivery Zone Inactivated Successfully")) 
	   {
		   test.log(LogStatus.PASS,"Delivery Zone Inactivated Successfully");
		   ut.PassedCaptureScreenshotAsBASE64();
	   }
	   else {
		   test.log(LogStatus.FAIL,"Delivery Zone Not Inactivated");
	   }
	}
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Delivery Zone")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedDeliveryZone() throws Exception 
	{
		//Enable the Inactive Status
				cmp.Click_ActivetoInactiveButton();

				//Check whether the Inactive screen opened or not
				cmp.VerifyActive_InactiveStatus("Inactive");

				Thread.sleep(3000);
				cmp.Verify_Search(Utility.getProperty("New_Store_State")+"1");
	}


	@Given("I Search the Delivery Zone and Click the Active button")
	public void iSearchTheDeliveryZoneAndClickTheActiveButton() throws Exception 
	{
		//Search and Activate the In activated item
		dsp.SearchAndClickActivate(Utility.getProperty("New_Store_State")+"1");
	}
	@Then("Verify the Cancelled Delivery Zone is Activated or Not")
	public void verifyTheCancelledDeliveryZoneIsActivatedOrNot() 
	{
		try {
	    if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Delivery Zone Activated Successfully"))
	    {
	    	test.log(LogStatus.FAIL, "Delivery Zone Activated Successfully After Clicking on Cancel");
	    }
		}
		catch (Exception e) {
			test.log(LogStatus.PASS,"Delivery Zone Not Activated After Clicking on Cancel");
		}
	    
	}

	

	@Then("I Verifying the Delivery Zone Activated or Not")
	public void iVerifyingTheDeliveryZoneActivatedOrNot() 
	{
		  if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Delivery Zone Activated Successfully"))
		    {
		    	test.log(LogStatus.PASS, "Delivery Zone Activated Successfully");
		    	ut.PassedCaptureScreenshotAsBASE64();
		    }
		  else {
			  test.log(LogStatus.FAIL,"Delivery Zone Not Activated");
		  }
	}
	@Then("I Click the Active button to navigate Activated screen to Verify Activated Delivery Zone")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedDeliveryZone() throws Exception 
	{
		Thread.sleep(500);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();

		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");

		//Verify whether the Department activated or not
		cmp.Verify_Search(Utility.getProperty("New_Store_State")+"1");
	}

	@Then("Clear Expected Delivery Time")
	public void clearExpectedDeliveryTime() {
	  dsp.Expected_DeliveryTime_InputBx.clear();
	}

   @Then("Verify whether the Save button is Disabled in PUC")
   public void VerifySaveButtonIsDisabled() throws Exception 
   {
	   cmp.Check_Button_Disabled(driver.findElement(By.xpath("//span[contains(.,'SAVE')]")), "Update button");
   }
   
   @Given("Clear the Map API Key")
   public void ClearMapAPIKey() 
   {
	   try {
	   driver.findElement(By.xpath("//span[.='Map API KEY']/../..//input")).clear();
	   }
	   catch (Exception e) {
		test.log(LogStatus.PASS,"Map API key is not available");
	}
   }
    @Then("Enter Map API Key")
    public void EnterMapAPIKey() 
    {
    	 try {
    		   driver.findElement(By.xpath("//span[.='Map API KEY']/../..//input")).sendKeys("fghye5$$@12");;
    		   }
    		   catch (Exception e) {
    			test.log(LogStatus.PASS,"Map API key is not available");
    		}
    }
}
