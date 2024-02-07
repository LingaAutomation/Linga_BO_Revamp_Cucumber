package StepDefinition;

import java.util.Set;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.BasePage;
import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Linga_Admin_Account_Details extends BasePage
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 
	public String parentWindow;


	Utility ut=new Utility();
	CategoriesPage ctp = new CategoriesPage();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap = new Linga_and_Dealer_Admin_Page();
	//	Admin_AnnouncementPage aap = new Admin_AnnouncementPage();
//	Admin_AccountDetailsPage lap = new Admin_AccountDetailsPage();

	@Given("Open the Linga Account Details home page BaseURL and StoreID")
	public void OpenLingaAccountDetailsHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"accounts");
		Thread.sleep(5000);
		//		parentWindow = driver.getWindowHandle();
		//		this
	}

//	@Given("Verifying the Account Details Header Page")
//	public void VerifyAccountDetailsHeader() 
//	{
//		cmp.VerifyMainScreenPageHeader("Accounts");
//	}

	@Then("Select Any of the Stores")
	public void VerifyAbletoSelectStore() throws Exception 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).click();

		Thread.sleep(6000); 
		//	cmp.VerifyMainScreenPageHeader("Account Detail");
//		Thread.sleep(3000); 

	}

	@Then("Check the Actions button is Displayed")
	public void VerifyActionsBUttonIsDisplayed() throws Exception 
	{
		//		Set<String> windows = driver.getWindowHandles(); 
		//		System.out.println(windows); 
		//		for (String window : windows)
		//		{ 
		//			if(!window.equals(parentWindow))
		//			{
		//				driver.switchTo().window(window);
		//			}
		//		}

		String ParentWin=driver.getWindowHandle();

		this.parentWindow=ParentWin;
		Set<String> currentWins=driver.getWindowHandles();

		for(String CurrentWin:currentWins)
		{
			if(!parentWindow.equals(CurrentWin))
			{
				driver.switchTo().window(CurrentWin);
			}
		}

		try {
			if(driver.findElement(By.xpath("//span[contains(.,' ACTIONS ')]")).isDisplayed()) 
			{
				test.log(LogStatus.PASS,"Actions Button Displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Actions Button Not Displayed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("Click On Actions button")
	public void ClickActionsButton() throws Exception 
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[.='Account Detail']")).click();;
		Thread.sleep(500);
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
		cmp.Wait_ForElementVisibility(lap.ActionsButton, 40);
		//		lap.ActionsButton.click();
		cmp.Click_Wait_ForElementClickable(lap.ActionsButton, 40);
	}

	@Then("Verify able to navigate to the Upgrade Account page")
	public void VerifyAbletoNavigateToUpgradeAccountPage() throws Exception 
	{
		driver.findElement(By.xpath("//button[contains(.,' Upgrade Account ')]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//h3[.='Your Plan']")).isDisplayed()) {
			test.log(LogStatus.PASS,"Able to Navigate to Upgrade Account page");
		}
		else {
			test.log(LogStatus.FAIL,"Not able to navigate to Upgrade Account page");
		}
	}

	@Then("Verify able to navigate to the Show Stores page")
	public void VerifyAbletoNavigatetoshowstorespage() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,' Show Stores ')]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//h3[.='Store Detail']")).isDisplayed()) {
			test.log(LogStatus.PASS,"Able to Navigate to Store Detail page");
		}
		else {
			test.log(LogStatus.FAIL,"Not able to navigate to Store Detail page");
		}
	}

	@Then("Verify able to navigate to the Archive page")
	public void VerifyAbletoNavigateToArchivePage() throws Exception 
	{
		driver.findElement(By.xpath("//button[contains(.,' Archive ')]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//h4[.='Confirm Password']")).isDisplayed()) {
			test.log(LogStatus.PASS,"Able to Navigate to Confirm Password page");

			lap.Password.sendKeys(Utility.getProperty("Password_Admin"));
			Thread.sleep(500);
			lap.Verify.click();
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("You haven't access to Archive Store/Account"))
			{
				test.log(LogStatus.INFO, "It's showing error message");
			}
		}
		else {
			test.log(LogStatus.FAIL,"Not able to navigate to Confirm Password page");
		}

		//driver.findElement(By.xpath("//mat-icon[.=' close ']")).click();
	}

	@Then("Verify able to navigate to the Inactivate page")
	public void NavigateToInactivepage() throws Exception 
	{
		try {
			driver.findElement(By.xpath("//button[.=' Inactivate ']")).click();
			Thread.sleep(2000);
			if(driver.findElement(By.xpath("//h4[.='Confirm Password']")).isDisplayed()) {
				test.log(LogStatus.PASS,"Able to Navigate to Inactivate page");

				lap.Password.sendKeys(Utility.getProperty("Password_Admin"));
				Thread.sleep(500);
				lap.Verify.click();
			}
			else {
				test.log(LogStatus.FAIL,"Not able to navigate to Inactivate page");
			}
		}
		catch (Exception e) {
			if(driver.findElement(By.xpath("//button[.=' Activate ']")).isDisplayed()) {
				driver.findElement(By.xpath("//button[.=' Activate ']")).click();
				Thread.sleep(2000);
				if(driver.findElement(By.xpath("//h4[.='Confirm Password']")).isDisplayed()) {
					test.log(LogStatus.PASS,"Able to Navigate to activate page");

					lap.Password.sendKeys(Utility.getProperty("Password_Admin"));
					Thread.sleep(500);
					lap.Verify.click();
				}
			}

			else {
				test.log(LogStatus.FAIL,"Not able to navigate to active page");
			}
		}
	}

	@Then("Verify able to navigate to the activate page")
	public void NavigateToActivatePage() throws Exception 
	{
		try {
			if(driver.findElement(By.xpath("//button[.=' Activate ']")).isDisplayed()) {
				driver.findElement(By.xpath("//button[.=' Activate ']")).click();
				Thread.sleep(2000);
				if(driver.findElement(By.xpath("//h4[.='Confirm Password']")).isDisplayed()) {
					test.log(LogStatus.PASS,"Able to Navigate to activate page");

					lap.Password.sendKeys(Utility.getProperty("Password_Admin"));
					Thread.sleep(500);
					lap.Verify.click();
				}
			}

			else {
				test.log(LogStatus.FAIL,"Not able to navigate to active page");
			}
		}
		catch (Exception e) {
			driver.findElement(By.xpath("//button[.=' Inactivate ']")).click();
			Thread.sleep(2000);
			if(driver.findElement(By.xpath("//h4[.='Confirm Password']")).isDisplayed()) {
				test.log(LogStatus.PASS,"Able to Navigate to Inactivate page");

				lap.Password.sendKeys(Utility.getProperty("Password_Admin"));
				Thread.sleep(500);
				lap.Verify.click();
			}
			else {
				test.log(LogStatus.FAIL,"Not able to navigate to Inactivate page");
			}
		}
	}

	@Then("Verify able to navigate to the Linga POS Login page")
	public void VerifyabletoClickOnLingaPOS() throws Exception 
	{
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[.=' Login ']")).click();
		Thread.sleep(1000);
		//	driver.close();

		String ParentWin=driver.getWindowHandle();
		this.parentWindow=ParentWin;
		Set<String> currentWins=driver.getWindowHandles();
		for(String CurrentWin:currentWins)
		{
			if(!parentWindow.equals(CurrentWin))
			{
				driver.switchTo().window(CurrentWin);

			}
		}
	}

	@And("I Navigate to Linga Admin Account Details Page")
	public void LingaAdminAccountDetailsPage() throws Exception
	{
		String ParentWin=driver.getWindowHandle();
		this.parentWindow=ParentWin;
		Set<String> currentWins=driver.getWindowHandles();
		for(String CurrentWin:currentWins)
		{
			if(!parentWindow.equals(CurrentWin))
			{
				driver.switchTo().window(CurrentWin);

			}
		}
		try {
			Thread.sleep(3000); 
			cmp.VerifyMainScreenPageHeader("Account Detail");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@And("Check the Account Name Field is Displayed")
	public void VerifyAccountNameFieldIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Account Name']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Account Name Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Account Name Field Not Displayed");
		}
	}

	@And("Check the Phone Number Field is Displayed")
	public void VerifyCheckNumberFieldIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Phone Number']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Account Name Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Account Name Field Not Displayed");
		}
	}

	@And("Check the Email ID Field is Displayed")
	public void VerifyEmailIDFieldIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Email Id']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Email ID Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Email ID Field Not Displayed");
		}
	}

	@And("Check the Store Address Field is Displayed")
	public void VerifyStoreAddressFieldIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Address']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Address Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Address Field Not Displayed");
		}

		//		driver.switchTo().window(parentWindow);
	}

	@And("Check the Link Account Field is Displayed")
	public void CheckLinkAccountFieldIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Accounts']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Accounts Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Accounts Field Not Displayed");
		}
	}

	@And("Check the Dealer Field is Displayed")
	public void CheckDealerFieldIsDisplayed()
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Dealer']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Dealer Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Dealer Field Not Displayed");
		}
	}

//	@And("Check the Plan Field is Displayed")
//	public void CheckThePlanFieldIsDisplayed() 
//	{
//		if(driver.findElement(By.xpath("//input[@aria-label='Plan']")).isDisplayed())
//		{
//			test.log(LogStatus.PASS,"Plan Field Displayed");
//		}
//		else 
//		{
//			test.log(LogStatus.FAIL,"Plan Field Not Displayed");
//		}
//	}

	@And("Check the License Field is Displayed")
	public void CheckTheLicenseField() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='License']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"License Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"License Field Not Displayed");
		}
	}

//	@And("Check the Stores\\(Active\\/Inactive) Field is Displayed")
//	public void CheckStoresActiveInactiveField()
//	{
//		if(driver.findElement(By.xpath("//input[@aria-label='Stores(Active/Inactive)']")).isDisplayed())
//		{
//			test.log(LogStatus.PASS,"Stores(Active/Inactive) Field Displayed");
//		}
//		else 
//		{
//			test.log(LogStatus.FAIL,"Stores(Active/Inactive) Field Not Displayed");
//		}
//	}

	@And("Check the Date Created Field is Displayed")
	public void ChecktheDateCreatedField()
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Date Created']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Date Created Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Date Created Field Not Displayed");
		}
	}

//	@And("Check the Last POS Access Date Field is Displayed")
//	public void CheckTheLastPOSAccessDateField() 
//	{
//		if(driver.findElement(By.xpath("//input[@aria-label='Last POS Access Date']")).isDisplayed())
//		{
//			test.log(LogStatus.PASS,"Last POS Access Date Field Displayed");
//		}
//		else 
//		{
//			test.log(LogStatus.FAIL,"Last POS Access Date Field Not Displayed");
//		}
//	}

	@And("Check the Subscription ID Field is Displayed")
	public void ChecktheubscriptionIDField() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Subscription ID']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Subscription Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Subscription Field Not Displayed");
		}
	}

	@And("Check the Customer ID Field is Displayed")
	public void ChecktheCustomerIDField() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Customer ID']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"CustomerID Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"CustomerID Field Not Displayed");
		}
	}

	@And("Check the Zoho Subscription Email Field is Displayed")
	public void CheckZohoSubscriptionEmailField() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Zoho Subscription Email']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Zoho Subscription Email Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Zoho Subscription Email Field Not Displayed");
		}
	}

	@And("Check the Features Screen Field is Displayed")
	public void CheckFeatureScreenField() 
	{
		if(driver.findElement(By.xpath("//mat-panel-title[.=' Features ']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Features Screen Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Features Screen Field Not Displayed");
		}
	}

	@And("Check the POS Licenses Screen Field is Displayed")
	public void POSLicenseScreenField() 
	{
		if(driver.findElement(By.xpath("//mat-panel-title[.=' POS Licenses ']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"POS License Screen Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"POS License Screen Field Not Displayed");
		}
	}

	@And("Check the Account Level Gift Card Toggle is Displayed")
	public void ChecktheAccountLevelGiftCardToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Account Level Gift Card']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Account Level GiftCard Toggle Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Account Level GiftCard Toggle Not displayed");
		}
	}

	@And("Check the Account Level House Account Toggle is Displayed")
	public void CheckAccountLevelHouseAccountToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Account Level House Account']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Account Level HouseAccount Toggle Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Account Level HouseAccount Toggle Not displayed");
		}
	}

	@And("Check the Enable Net Suite Integration Toggle is Displayed")
	public void CheckEnableNetSuiteIntegrationToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Enable Net Suite Integration']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Enable Net Suite Integration Toggle Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Enable Net Suite Integration Toggle Not displayed");
		}
	}

	@And("Check the Disable Marketing Toggle is Displayed")
	public void CheckDisableMarketingToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Disable Marketing']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Disable Marketing Toggle Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Disable Marketing Toggle Not displayed");
		}
	}

	@And("Check the Is FTP Enabled Toggle is Displayed")
	public void CheckTheIsFTPEnabledToggleIsDisplayed()
	{
		if(driver.findElement(By.xpath("//span[.='Is FTP Enabled']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Is FTP Enabled Toggle Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Is FTP Enabled Toggle Not displayed");
		}
	}

	@And("Check the Enable New Theme Toggle is Displayed")
	public void ChecktheNewThemeToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Enable New Theme']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Enable New Theme Toggle Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Enable New Theme Toggle Not displayed");
		}
	}

	@And("I Enable Account Level Gift Card Toggle")
	public void EnableAccountLevelGiftCardToggle() throws Exception 
	{
		driver.findElement(By.xpath("//span[.='Account Level Gift Card']/../..//button[.='Yes']")).click();
	}

	@Then("Verify the Account Settings Updated or Not")
	public void VerifyAccountSettingUpdatedOrNot() 
	{
		try {
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Account settings updated successfully")) {
				test.log(LogStatus.PASS,"Account Settings Updated Successfully");
			}
			else {
				test.log(LogStatus.FAIL,"Account Settings Not Updated Successfully");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@And("I Disable Account Level Gift Card Toggle")
	public void DisabledTheAccountLevelGiftCard()
	{
		driver.findElement(By.xpath("//span[.='Account Level Gift Card']/../..//button[.='No']")).click();

	}

	@And("I Enable Account Level House Account Toggle")
	public void EnableAccountLevelHouseAccount() 
	{
		driver.findElement(By.xpath("//span[.='Account Level House Account']/../..//button[.='Yes']")).click();
	}

	@And("I Disable Account Level House Account Toggle")
	public void DisabledAccountLevelHouseAccountToggle() 
	{
		driver.findElement(By.xpath("//span[.='Account Level House Account']/../..//button[.='No']")).click();
	}

	@And("I Enable Enable Net Suite Integration Toggle")
	public void EnableEnableNetSuiteToggle()
	{
		driver.findElement(By.xpath("//span[.='Enable Net Suite Integration']/../..//button[.='Yes']")).click();
	}

	@And("I Disable Enable Net Suite Integration Toggle")
	public void DisableEnableNetSuiteToggle()
	{
		driver.findElement(By.xpath("//span[.='Enable Net Suite Integration']/../..//button[.='No']")).click();
	}

	@And("I Enable Disable Marketing Toggle")
	public void EnableDisableMarketingToggle() 
	{
		driver.findElement(By.xpath("//span[.='Disable Marketing']/../..//button[.='Yes']")).click();
	}

	@And("I Disable Disable Marketing Toggle")
	public void DisableDisableMarketingToggle() 
	{
		driver.findElement(By.xpath("//span[.='Disable Marketing']/../..//button[.='No']")).click();
	}

	@Given("I Enable Is FTP Enabled Toggle")
	public void EnableIsFTPEnabledToggle() 
	{
		driver.findElement(By.xpath("//span[.='Is FTP Enabled']/../..//button[.='Yes']")).click();
	}

	@And("I Enter the Port")
	public void EnterPort() throws Exception 
	{
		lap.Port.clear();
		Thread.sleep(500);
		lap.Port.sendKeys("20");
	}

//	@And("I Enter the User Name")
//	public void EnterUserName() throws Exception
//	{
//		lap.UserName.clear();
//		Thread.sleep(500);
//		lap.UserName.sendKeys(RandomStringUtils.randomAlphanumeric(15));
//	}

	//	@And("I Enter the Password")
	//	public void EnterPassowrd() throws Exception 
	//	{
	//		lap.Password_Input.clear();
	//		Thread.sleep(500);
	//		lap.Password_Input.sendKeys(RandomStringUtils.randomNumeric(10));
	//	}

	@And("I Enter the Host Name")
	public void EnterHostName() throws Exception
	{
		lap.HostName.clear();
		Thread.sleep(500);
		lap.HostName.sendKeys(RandomStringUtils.randomAlphanumeric(15));
	}

	@And("I Disable Is FTP Enabled Toggle")
	public void DisableIsFTPEnableToggle()
	{
		driver.findElement(By.xpath("//span[.='Is FTP Enabled']/../..//button[.='No']")).click();
	}

	@And("I Enable Enable New Theme Toggle")
	public void EnableEnableNewThemeToggle() 
	{
		driver.findElement(By.xpath("//span[.='Enable New Theme']/../..//button[.='Yes']")).click();
	}

	@And("I Disable Enable New Theme Toggle")
	public void DisableEnableNewThemeToggle()
	{
		driver.findElement(By.xpath("//span[.='Enable New Theme']/../..//button[.='No']")).click();
	}

	@And("I Click the Genarate button")
	public void ClickGenerateButton()
	{
		driver.findElement(By.xpath("//span[.='GENERATE']")).click();
	}

	@Then("Verify the Account Info Retrived successfully or not")
	public void VerifyAccountInfoRetrivedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("AccountInfo retrived successfully")) 
		{
			test.log(LogStatus.PASS,"AccountInfo Retrived Successfully");
		}
		else 
		{
			test.log(LogStatus.FAIL,"AccountInfo Not Retrived Successfully");
		}
	}

	@And("Check the Sale Count Size field is Displayed")
	public void ChecktheSaleCountSizeFieldIdDisplayed() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Sale Count (Size)']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sale Count Size Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Sale Count Size Field Not Displayed");
		}
	}

	@And("Check the DB Size field is Displayed")
	public void CheckDBSizefieldIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='DB Size']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"DB Size Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"DB Size Field Not Displayed");
		}
	}

	@And("I Enter the Client ID")
	public void EnterClientID() throws Exception 
	{
		lap.ClientID.clear();
		Thread.sleep(500);
		lap.ClientID.sendKeys("II");
	}

	@And("I Clear the Client Secret")
	public void ClearTheClientSecret()
	{
		lap.ClientSecret.clear();
	}

	@And("I Clear the Client ID")
	public void ClearClientID() 
	{
		lap.ClientID.clear();
	}

	@And("I Enter the Client Secret")
	public void EnterClientSecret() throws Exception 
	{
		lap.ClientSecret.clear();
		Thread.sleep(500);
		lap.ClientSecret.sendKeys("Client Secret");
	}

	@Then("Verify Mail Chimp Details Saved or Not")
	public void VerifyMailChimpDetailsSavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Mail Chimp Details Saved Successfully")) 
		{
			test.log(LogStatus.PASS,"Mail Chimp Details Saved successfully");
		}
		else {
			test.log(LogStatus.FAIL,"Mail Chimp Details not Saved Successfully");
		}
	}

	@And("I Click the Save button in Account Details")
	public void ClickSaveButton() throws Exception 
	{
		if(driver.findElement(By.xpath("(//button[contains(.,'SAVE')])[3]")).isEnabled()) 
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(.,'SAVE')])[3]")).click();
		}
	}

	@And("I Click the Save button in ClientID")
	public void ClickSaveButtonInClientID() throws Exception
	{
		if(driver.findElement(By.xpath("(//button[contains(.,'SAVE')])[3]")).isEnabled()) 
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(.,'SAVE')])[3]")).click();
		}
	}
}
