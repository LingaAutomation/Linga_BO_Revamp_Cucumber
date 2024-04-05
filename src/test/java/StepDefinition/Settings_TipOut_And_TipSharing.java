package StepDefinition;


import java.util.List;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_TipOut_TipSharing_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.netty.util.internal.ThreadLocalRandom;

public class Settings_TipOut_And_TipSharing
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_TipOut_TipSharing_Page PR = new Settings_TipOut_TipSharing_Page();

	@Given("Open Tip Out and Tip Sharing home page BaseURL and StoreID")
	public void OpenTipoutTipSharingHomePage() throws Exception 
	{
        lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"tipoutTipsharing");
		Thread.sleep(500);
	
	}

	@Given("Verifying the Tip Out and Tip Sharing Header Page")
	public void verifyingTheTipOutAndTipSharingHeaderPage()
	{
		cmp.VerifyMainScreenPageHeader("Tip Out & Tip Sharing");
	}
	
	@Then("Verify Tip outs Tab is Displayed or Not")
	public void VerifyTipOutsTabIsDisplayedOrnot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(PR.TipOutsTab,"Tip Outs Tab");
	}
	
	@Then("Verify Tip Sharing Tab is Displayed or Not")
	public void VerifyTipSharingTabIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(PR.TipSharingTab,"Tip Sharing Tab");
	}

	@Given("Click on Tip Out Tab")
	public void clickOnTipOutTab()
	{
		PR.TipOutsTab.click();
	}
	@Then("Verify whether Tip out based on Percentage of Sales is Displayed or Not")
	public void verifyWhetherTipOutBasedOnPercentageOfSalesIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(PR.TipOutBasedOnPercentageOfSales_NoBtn,"Tip out based on Percentage of Sales");
	}

	@Given("Disable Tip out based on Percentage of Sales Toggle")
	public void disableTipOutBasedOnPercentageOfSalesToggle()
	{
		PR.TipOutBasedOnPercentageOfSales_NoBtn.click();
	}
	@Then("Verify Tip Share Per Hour Toggle is Displayed or Not")
	public void verifyTipSharePerHourToggleIsDisplayedOrNot() throws Exception
	{
		try {
			cmp.Check_Element_or_Text_Displayed(PR.TipSharePerHour_NoBtn," Tip Share Per Hour Toggle");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify New Tip Out button is Displayed or Not")
	public void verifyNewTipOutButtonIsDisplayedOrNot() throws Exception 
	{
		try {
			cmp.Check_Element_or_Text_Displayed(PR.AddTipOutBtn,"Add Tip Out Button");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Verify TipOut Name Column is Displayed or Not")
	public void verifyTipOutNameColumnIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("(//div[.=' TipOut Name '])[2]")),"Tip out Name Column");
	}
	@Then("Verify Role From Column is Dispalyed or Not")
	public void verifyRoleFromColumnIsDispalyedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("(//div[.=' Role From '])[2]")),"Role From Column");
	}
	@Then("Verify Role To Column is Displayed or Not")
	public void verifyRoleToColumnIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("(//div[.=' Role To '])[2]")),"Role To Column");
	}
	@Then("Verify Departments Column is Displayed or Not")
	public void verifyDepartmentsColumnIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("(//div[.=' Departments '])[2]")),"Department Column");
	}
	@Then("Verfiy Prcentage Column is Displayed or Not")
	public void verfiyPrcentageColumnIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("(//div[.=' Percentage '])[2]")),"Percentage Column");
	}

	@Given("Click the New Tipout button")
	public void clickTheNewTipoutButton()
	{
		PR.AddTipOutBtn.click();
	}
	@Then("Verify the New Tipout Header")
	public void verifyTheNewTipoutHeader() 
	{
		cmp.VerifyCreationScreenPageHeader("New Tip Out");
	}

	@Then("I Enter the Tip Out Name Exceeding the limit")
	public void iEnterTheTipOutNameExceedingTheLimit() 
	{
		//Enter the tip out name more than 25 chars
		PR.TipOutNameInput.sendKeys(RandomStringUtils.randomAlphanumeric(30));

		//get the count totally entered in the tip out name filed
		String tpn = PR.TipOutNameInput.getAttribute("value");

		//Check the length of the Tip Out Name
		if(tpn.length() == 25) {
			test.log(LogStatus.PASS, "Tip Out Name field accepts only 25 chars");
		}else if(tpn.length() == 30) {
			test.log(LogStatus.FAIL, "Tip Out Name field accepts more than 25 chars");
		}  
	}
	@Then("Select Role From")
	public void selectRoleFrom() throws Exception 
	{
		//click the Role from name
		PR.RoleFromInput.click();

		List<WebElement> menuList = driver.findElements(By.xpath("//select-option"));

		int menuSize=menuList.size();

		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);

		WebElement element = driver.findElement(By.xpath("(//select-option)["+randomMenu+"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		element.click();
	}
	@Then("Select Role To")
	public void selectRoleTo() throws Exception 
	{
		//click the 2 role to input
		PR.RoleToInput.click();

		List<WebElement> menuList1=driver.findElements(By.xpath("//select-option"));

		int menuSize1=menuList1.size();

		int randomMenu1=ThreadLocalRandom.current().nextInt(1, menuSize1);

		WebElement element1 = driver.findElement(By.xpath("(//select-option)["+randomMenu1+"]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(500);
		element1.click();
	}
	@Then("Select the Department form Dropdown")
	public void selectTheDepartmentFormDropdown() throws Exception 
	{
		PR.SelectDepartments.click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//select-option//mat-checkbox)[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//select-option//mat-checkbox)[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//select-option//mat-checkbox)[4]")).click();
		Thread.sleep(500);
		PR.SelectDepartments.click();
	}
	@Then("Enter the Percentage")
	public void enterThePercentage() throws InterruptedException
	{
		PR.Percentage.clear();
		Thread.sleep(500);
		PR.Percentage.sendKeys("2000");
	}

	@Given("Enter Tip Out Name")
	public void enterTipOutName() throws Exception 
	{
		//enter the tip out name
		PR.TipOutNameInput.sendKeys(Utility.getProperty("Tip_Out_Name"));
	}


	@Then("Verify Tipout Saved or Not")
	public void verifyTipoutSavedOrNot()
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tip out saved successfully")) 
		{
			test.log(LogStatus.PASS, "Tip out saved successfully");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Tip out not saved successfully");
		}
	
	}

	@Given("I Search and Edit the Tipout")
	public void iSearchAndEditTheTipout() throws Exception 
	{
		try {
		cmp.Close_Online_Help_ChatBox();
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
	
		cmp.SearchAndClickEdit(Utility.getProperty("Tip_Out_Name"));
	}
	@Then("Verify Update Tip Out Header")
	public void verifyUpdateTipOutHeader() 
	{
		cmp.VerifyCreationScreenPageHeader("Update Tip Out");
	}

	@Given("Clear Tip Out Name")
	public void clearTipOutName()
	{
		for(int i=1;i<=30;i++) 
		{
			PR.TipOutNameInput.sendKeys(Keys.BACK_SPACE);
		}
		
	}

	@Then("Clear the Percentage")
	public void clearThePercentage() 
	{
		PR.Percentage.clear();
	}

	@Then("Verify Tip Out Updated or Not")
	public void verifyTipOutUpdatedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tip Out Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Tip Out Updated Successfully");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Tip Out Not Updated Successfully");
		}
	}

	@Given("I Search the Tip Out and Click the Delete button")
	public void iSearchTheTipOutAndClickTheDeleteButton() throws Exception 
	{
	
		cmp.SearchAndClickDelete(Utility.getProperty("Tip_Out_Name"));
	}
	@Then("Verify the Cancelled Tip Out Inactivated or Not")
	public void verifyTheCancelledTipOutInactivatedOrNot() 
	{
		try {
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tip Out Removed Successfully")) 
		{
			test.log(LogStatus.FAIL,"Tip Out Removed After Clicking on Cancel");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else 
		{
			test.log(LogStatus.PASS,"Tip Out Not Removed After Clicking on Cancel");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("I Verifying the Tip Out Deleted or Not")
	public void iVerifyingTheTipOutDeletedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tip Out Removed Successfully")) 
		{
			test.log(LogStatus.PASS,"Tip Out Removed After Clicking on Delete");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else 
		{
			test.log(LogStatus.FAIL,"Tip Out Not Removed After Clicking on Delete");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


	@Then("Verify Name already exists must be unique error Message")
	public void verifyNameAlreadyExistsMustBeUniqueErrorMessage() 
	{
		if(driver.findElement(By.xpath("//p[contains(.,'Name already exists, must be unique')]")).isDisplayed())
	    {
			test.log(LogStatus.PASS,"Name Already Exist Error Message Displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Name Already Exist Error Message not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
	}

	@Given("Click on Tip Sharing Tab")
	public void clickOnTipSharingTab() 
	{
		PR.TipSharingTab.click();
	}

	@Then("Verify Manual Tip Sharing toggle is Displayed or Not")
	public void verifyManualTipSharingToggleIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(PR.ManualTipSharing_NoBtn,"Manual Tip Sharing Toggle");
	}
	@Then("Verify Automatic Tip Sharing Tab is Displayed or Not")
	public void verifyAutomaticTipSharingTabIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(PR.AutomaticTipSharing_NoBtn,"Automatic Tip Sharing Toggle");
	}
	@Then("Verify Tip Charge Deduction Before Tip Share Toggle is Displayed or Not")
	public void verifyTipChargeDeductionBeforeTipShareToggleIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(PR.TipChargeDeductionBeforeTipShare_NoBtn,"Tip Charge Deduction Before Tip Share Toggle");
	}
	@Then("Verify Online Pickup Tip Checkbox is Displayed or Not")
	public void verifyOnlinePickupTipCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(PR.Online_PickUp_Checkbox,"Online PickUp Checkbox");
	}
	@Then("Verify Declared Cash Tip Checkbox is Displayed or Not")
	public void verifyDeclaredCashTipCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(PR.Declared_CashTip_Checkbox,"Declare CashTip Checkbox");
	}
	@Then("Verify Gratuity Checkbox is Displayed or Not")
	public void verifyGratuityCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(PR.Gratuity_Checkbox,"Gratuity Checkbox");
	}
	@Then("Verify Driver Compensation Checkbox is Displayed or Not")
	public void verifyDriverCompensationCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(PR.Driver_Compensation_Checkbox,"Driver Compensation Checkbox");
	}

	@Given("Enable Manual Tip Sharing Toggle")
	public void enableManualTipSharingToggle() 
	{
		PR.ManualTipSharing_YesBtn.click();
	}
	
	@Then("Select the Roles from Dropdown")
	public void selectTheRolesFromDropdown() throws Exception 
	{
		PR.ManualTipsharing_ChooseRoles.click();	
	
	Thread.sleep(500);
	
	List<WebElement> menuList=driver.findElements(By.xpath("//select-option"));

	int menuSize=menuList.size();

//	if(menuSize<=6)
//	{
	int randomMenu=ThreadLocalRandom.current().nextInt(2, menuSize);

	WebElement element = driver.findElement(By.xpath("//div["+randomMenu+"]/select-option"));
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(1500);
//	cmp.Cursor_MoveToElement(element);
	
	
	element.click();
	Thread.sleep(500);
	PR.ManualTipsharing_ChooseRoles.click();
	}

	@Then("Verify Tip Sharing Saved or Not")
	public void verifyTipSharingSavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tip Out/Tip Sharing Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Tip Out/Tip Sharing Updated Successfully message is displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Tip Out/Tip Sharing Not Updated Successfully");
		}
	}

	@Given("Enable Automatic Tip Sharing Toggle")
	public void enableAutomaticTipSharingToggle()
	{
		PR.AutomaticTipSharing_YesBtn.click();
	}


	@Given("Disable Manual Tip Sharing Toggle")
	public void disableManualTipSharingToggle() 
	{
		PR.ManualTipSharing_NoBtn.click();
	}
	@Then("Verify Select Roles Dropdown Displayed or Not")
	public void verifySelectRolesDropdownDisplayedOrNot()
	{
		try {
		cmp.Check_Element_or_Text_Displayed(PR.ManualTipsharing_ChooseRoles,"Choose Roles Checkbox");
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Choose Roles Not Displayed After Disabling Toggle");
		}
	}


	@Given("Disable Automatic Tip Sharing Toggle")
	public void disableAutomaticTipSharingToggle() throws Exception 
	{
		Thread.sleep(2000);
		PR.AutomaticTipSharing_NoBtn.click();
	}

	@Given("Enable Tip Charge Deduction Before Tip Share Toggle")
	public void enableTipChargeDeductionBeforeTipShareToggle()
	{
		PR.TipChargeDeductionBeforeTipShare_YesBtn.click();
	}
	@Given("Disable Tip Charge Deduction Before Tip Share Toggle")
	public void disableTipChargeDeductionBeforeTipShareToggle()
	{
		PR.TipChargeDeductionBeforeTipShare_NoBtn.click();
	}


	@Given("Uncheck the Online Pickup Tip Checkbox")
	public void uncheckTheOnlinePickupTipCheckbox() 
	{
		try {
		if(PR.Online_PickUp_Checkbox_SLD.isDisplayed()) 
		{
			PR.Online_PickUp_Checkbox.click();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Given("Uncheck the Declared Cash Tip Checkbox")
	public void uncheckTheDeclaredCashTipCheckbox() 
	{
		try {
			if(PR.Declared_CashTip_Checkbox_SLD.isDisplayed()) 
			{
				PR.Declared_CashTip_Checkbox.click();
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
	}
	@Given("Uncheck the Gratuity Checkbox")
	public void uncheckTheGratuityCheckbox()
	{
		try {
			if(PR.Gratuity_Checkbox_SLD.isDisplayed()) 
			{
				PR.Gratuity_Checkbox.click();
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
	}
	@Given("Uncheck Driver Compensation Checkbox")
	public void uncheckDriverCompensationCheckbox() 
	{
		try {
			if(PR.Driver_Compensation_Checkbox_SLD.isDisplayed()) 
			{
				PR.Driver_Compensation_Checkbox.click();
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
	}


	@Given("Check the Online Pickup Tip Checkbox")
	public void checkTheOnlinePickupTipCheckbox() 
	{
	   PR.Online_PickUp_Checkbox.click();
	}
	@Given("Check the Declared Cash Tip Checkbox")
	public void checkTheDeclaredCashTipCheckbox()
	{
		PR.Declared_CashTip_Checkbox.click();
	}
	@Given("Check the Gratuity Checkbox")
	public void checkTheGratuityCheckbox()
	{
		PR.Gratuity_Checkbox.click();
	}
	@Given("Check Driver Compensation Checkbox")
	public void checkDriverCompensationCheckbox() 
	{
		PR.Driver_Compensation_Checkbox.click();
	}
	
	@Then("Verify Please Select Roles Error Popup")
	public void VerifyErrorMessage() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Select the role"))
		{
			test.log(LogStatus.PASS,"Please Select the Role Popup is Displayed After Clicking on Save Without Selecting Roles");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else 
		{
			test.log(LogStatus.FAIL,"Please Select Roles Error popup not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("Verify Manual Tip Sharing Toggle is Disabled")
	public void VerifyManualTipSharingToggle() throws Exception 
	{
		cmp.Check_Button_Disabled(PR.ManualTipSharing_NoBtn,"Manual Tip Shating No Button");
	}
	
	@And("I Click the Save button in TipOutAndTipShare")
	public void SavetheTipOutAndShare() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'SAVE')]")).click();
	}
	
	@Given("Enable Tip out based on Percentage of Sales Toggle")
	public void EnableTipoutBasedOnPercentageOfSales() 
	{
		PR.TipOutBasedOnPercentageOfSales_YesBtn.click();
	}
	
	@Then("I Verify Tip Out Update screen Closed or Not")
	public void VerifyUpdateScreenClosedOrNot() throws Exception 
	{
		cmp.Verify_Close_Cancel_CreationScreen("Update Tip Out");
	}

}
