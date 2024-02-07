package StepDefinition;

import java.time.Duration;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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

public class Dealer_Admin_Store_Details
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
	
	
	
	@Given("Open the Dealer Store Details home page BaseURL and StoreID")
	public void OpenStoreDetailsHomePage() throws Exception 
	{
		Thread.sleep(7000); 
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"dashboard");
		Thread.sleep(5000);
		parentWindow = driver.getWindowHandle();
	}
	
	@Given("Verifying the Dealer Admin - Store Details Header Page")
	public void VerifyingTheDealerAdminStoreDetailsHeaderPage() throws Exception 
	{
		//driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).click();
		Thread.sleep(500);
		Thread.sleep(3000); 
//		lda.ActionsButton.click();
		lap.Click_ActionsButton();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(.,' Show Stores ')]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//h3[.='Store Detail']")).isDisplayed()) {
			test.log(LogStatus.PASS,"Able to Navigate to Store Detail page");
		}
		else {
			test.log(LogStatus.FAIL,"Not able to navigate to Store Detail page");
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
	
	@And("Check the Store Name Field is Displayed")
	public void ChecktheStoreNameFieldIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Store Name']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Store Name Field Is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Store Name Field Not Displayed");
		}
	}
	
//	@And("Check the Phone Number Field is Displayed")
//	public void CheckPhoneNumberFieldIsDispalyed()
//	{
//		if(driver.findElement(By.xpath("//input[@aria-label='Phone Number']")).isDisplayed()) 
//		{
//			test.log(LogStatus.PASS,"Phone Number Field Is Displayed");
//		}
//		else 
//		{
//			test.log(LogStatus.FAIL,"Phone Number Field Not Displayed");
//		}
//	}
	
//	@And("Check the Email ID Field is Displayed")
//	public void CheckEmailIDFieldIsDisplayed() 
//	{
//		if(driver.findElement(By.xpath("//input[@aria-label='Email Id']")).isDisplayed()) 
//		{
//			test.log(LogStatus.PASS,"Email ID Field Is Displayed");
//		}
//		else 
//		{
//			test.log(LogStatus.FAIL,"Email ID Field Not Displayed");
//		}
//	}
	
	@And("Check the Last Menu Modified Date Field is Displayed")
	public void CheckTheLastMenuModifiedDate() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Last Menu Modified Date']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Last Menu Modified Date Field Is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Last Menu Modified Date Field Not Displayed");
		}
	}
	
	@And("Check the Last Ipad Access Date Field is Displayed")
	public void CheckTheLastIpadAccessDateFieldIsDisplayed()
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Last IPad Access Date']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Last Ipad Access Date Field Is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Last Ipad Access Date Field Not Displayed");
		}
	}
	
	@And("Check the Store Address Field is Displayed In StoreDetails")
	public void ChecktheStoreAddressfieldIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//h6[.=' Store Address ']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Store Address Field Is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Store Address Field Not Displayed");
		}
	}
	
	@And("Check the Include Credit Card Toggle is Displayed")
	public void CheckTheIncludeCreditCardToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Include Credit Card']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Include Credit Card Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Include Credit Card Toggle is not Displayed");
		}
	}
	
	@And("Check the Include Gift Card Toggle is Displayed")
	public void ChecktheIncludeGiftCardToggleIsDisplayed()
	{
		if(driver.findElement(By.xpath("//span[.='Include Gift Card']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Include Gift Card Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Include Gift Card Toggle is not Displayed");
		}
	}
	
	@And("Check the Enable Multiple Cash Tenders Toggle is Displayed")
	public void CheckEnableMultipleCashTenderstoggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Enable Multiple Cash Tenders']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Enable Mutiple Cash Tenders Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Enable Mutiple Cash Tenders Toggle is Not Displayed");
		}
	}
	
	@And("Check the Enable Other Payment Options Toggle is Displayed")
	public void CheckEnableotherPaymentOptionsToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Enable Other Payment Options']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Enable Other Payment Options Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Enable Other Payment Options Toggle is Not Displayed");
		}
	}
	
	@And("Check the EMV Settings Toggle is Displayed")
	public void ChecktheEMVSettingsToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='EMV']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"EMV Settings Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"EMV Settings Toggle is Not Displayed");
		}
	}
	
	@And("Check the Give X Gift Card Toggle is Displayed")
	public void CheckGiveXGiftCardToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Give X Gift Card']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Give X GiftCard Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Give X GiftCard Toggle is Not Displayed");
		}
	}
	
	@And("Check the House Account Toggle is Displayed")
	public void CheckHouseAccontToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='House Account']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"House Account Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"House Account Toggle is Not Displayed");
		}
	}
	
	@And("Check the MPPG Credit Card Toggle is Displayed")
	public void CheckMPPGCreditCardToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='MPPG Credit Card']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"MPPG Credit Card Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"MPPG Credit Card Toggle is Not Displayed");
		}
	}
	
	@And("Check the NMI Tokenization Toggle is Displayed")
	public void CheckNMITokenizationToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='NMI Tokenization']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"NMI Tokenization Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"NMI Tokenization Toggle is Not Displayed");
		}
	}
	
	@And("Check the Dejavoo Toggle is Displayed")
	public void CheckDejavooToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Dejavoo']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Dejavoo Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Dejavoo Toggle is Not Displayed");
		}
	}
	
	@And("Check the Optomany Toggle is Displayed")
	public void CheckOptomanyToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Optomany']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"optomany Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"optomany Toggle is Not Displayed");
		}
	}
	
	@And("Check the Vexen Payment Toggle is Displayed")
	public void CheckVexenPaymentToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Vexen Payment']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Vexen Payment Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Vexen Payment Toggle is Not Displayed");
		}
	}
	
	@And("Check the Clover Payment Toggle is Displayed")
	public void ChecktheCloverPaymentToggleIsDisplayed()
	{
		if(driver.findElement(By.xpath("//span[.='Clover Payment']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Clover Payment Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Clover Payment Toggle is Not Displayed");
		}
	}
	
	@And("Check the Show Dual Price Toggle is Displayed")
	public void ChecktheshowSualPriceToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Show Dual Price']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Show Dual Price Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Show Dual Price Toggle is Not Displayed");
		}
	}
	
	@And("Check the Show Deposit In Sale Recap Toggle is Displayed")
	public void ShowDepositInSaleRecapToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Show Deposit In Sale Recap']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Show Deposit In Sale Recap Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Show Deposit In Sale Recap Toggle is Not Displayed");
		}
	}
	
	@And("Check the Membership Toggle is Displayed")
	public void ChecktheMembershipToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Membership']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Membership Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Membership Toggle is Not Displayed");
		}
	}
	
	@And("Check the Ingenico TR Toggle is Displayed")
	public void CheckIngenicoTRToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Ingenico TR']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Ingenico TR Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Ingenico TR Toggle is Not Displayed");
		}
	}
	
	@And("Check the Food Check Toggle is Displayed")
	public void CheckFoodCheckToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Food Check']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"FoodCheck Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"FoodCheck Toggle is Not Displayed");
		}
	}
	
	@And("Check the Mobile Toggle is Displayed")
	public void CheckMobileToggleIsDisplayed()
	{
		if(driver.findElement(By.xpath("//span[.='Mobile']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Mobile Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Mobile Toggle is Not Displayed");
		}
	}
	
	@And("Check the Score Toggle is Displayed")
	public void CheckScoreToggleIsDisplayed() 
	{
		if(driver.findElement(By.xpath("//span[.='Score']/../..//button")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Score Toggle is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Score Toggle is Not Displayed");
		}
	}
	
	@And("I Enable Include Credit Card Toggle")
	public void EnableIncludeCreditCardToggle()
	{
		lap.IncludeCreditCard_YesToggle.click();
	}
	
	@And("Verify Store Settings Updated or Not")
	public void VerifyStoreSettingsUpdatedOrNot() 
	{
		try {
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Store Settings Updated Successfully"))
		{
			test.log(LogStatus.PASS,"Store Settings Updated Successfully");
		}
		else
		{
			test.log(LogStatus.FAIL,"Store Settings Not Updated Successfully");
		}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"No Message Displayed");
		}
	}
	
	@And("Check the User ID Field is Displayed")
	public void CheckUserIDFieldIsDisplayed()
	{
		if(lap.UserID.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"User ID Field Is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"User ID Field Is Not Displayed");
		}
	}
	
	@And("Check the Encryption Key Field is Displayed")
	public void CheckEncryptionKeyFieldIsDisplayed() 
	{
		if(lap.EncryptionKey.isDisplayed())
		{
			test.log(LogStatus.PASS,"Encryption Key Field is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Encryption Key Field is Not Displayed");
		}
	}
	
	@And("I Click the Change Password button")
	public void ClickchangepasswordButton()
	{
		lap.ChangePassowrd.click();
	}
	
	@And("I Verify the Change Password Header")
	public void VerifyChangePasswordHeader() 
	{
		if(driver.findElement(By.xpath("//h4[.='Change Password']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Change password Header Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL,"Change password Header not Displayed");
		}
	}
	
	@And("I Enter Invalid Current Password")
	public void EnterInvalidCurrentPassword() throws Exception 
	{
		lap.CurrentPassword.clear();
		Thread.sleep(500);
		lap.CurrentPassword.sendKeys("dvsh12");
	}
	
//	@And("I Enter the New Password")
//	public void EnterNewPassword() throws Exception 
//	{
//		lap.NewPassword.clear();
//		Thread.sleep(500);
//		lap.NewPassword.sendKeys("sg345");
//	}
	
//	@And("I Enter the Confirm Password")
//	public void ConfirmPassword() throws Exception 
//	{
//		lap.ConfirmPassword.clear();
//		Thread.sleep(500);
//		lap.ConfirmPassword.sendKeys("sg345");
//	}
	
	@And("I Click the Submit button")
	public void ClickSubmitButton() 
	{
		lap.Submit.click();
	}
	
	@Then("Verify the Current Password is Incorrect or Not")
	public void VerifyCurrentPasswordIsIcorrectOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Current password is incorrect"))
		{
			test.log(LogStatus.PASS,"Current Password is Incorrect popup displayed");
		}
		else
		{
			test.log(LogStatus.FAIL,"Current Password is Incorrect popup Not displayed");
		}
	}
	
	@And("I Enter the Current Password")
	public void EnterCurrentPassword() throws Exception 
	{
		lap.CurrentPassword.clear();
		Thread.sleep(500);
		lap.CurrentPassword.sendKeys("test1234");
	}
	
//	@And("I Enter the Invalid Confirm Password")
//	public void enterInvalidConfirmPassword() throws Exception
//	{
//		lap.ConfirmPassword.clear();
//		Thread.sleep(500);
//		lap.ConfirmPassword.sendKeys("dfert");
//	}
	
	@Then("Verify the Confirm Password is Incorrect or Not")
	public void VerifyConfirmPasswordIsincorrectOrNot() 
	{
		if(driver.findElement(By.xpath("(//mat-hint[.='Confirm Password Should Be Matched With Password'])[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"confirm Password should be matched with Password popup displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"confirm Password should be matched with Password popup not displayed");
		}
	}
	
	@And("I Enable Include Gift Card Toggle")
	public void EnableIncludeGiftCardToggle()
	{
		lap.IncludeGiftCard_YesToggle.click();
	}
	
	@And("I Disable Include Gift Card Toggle")
	public void DisableIncludeGiftCardToggle() 
	{
		lap.IncludeGiftCard_NoToggle.click();
	}
	
	@And("I Enable the Enable Multiple Cash Tenders Toggle")
	public void EnaleEnableMultipleCashTendersToggle() 
	{
		lap.EnableMultipleCashTenders_YesToggle.click();
	}
	
	@And("I Disable the Enable Multiple Cash Tenders Toggle")
	public void DisableEnableMultipleCashTendersToggle() 
	{
		lap.EnableMultipleCashTenders_NoToggle.click();
	}

	@And("I Enable the Enable Other Payment Options Toggle")
	public void EnabletheEnableotherPaymentOptionsToggle() 
	{
		lap.EnableOtherPaymentOptions_YesToggle.click();
	}
	
	@And("I Disable the Enable Other Payment Options Toggle")
	public void DisabletheEnableotherPaymentOptionsToggle() 
	{
		lap.EnableOtherPaymentOptions_NoToggle.click();
	}
	
	@And("I Disable the EMV Toggle")
	public void DisableEMVToggle()
	{
		//lap.EMV_Settings_NoToggle.click();
		cmp.Disable_Toggle(lap.EMV_Settings_YesToggle, lap.EMV_Settings_NoToggle,"EMV Settings");
	}
	
	@And("I Enable the EMV Toggle")
	public void EnableEMVToggle()
	{
		//lap.EMV_Settings_YesToggle.click();
		cmp.Enable_Toggle(lap.EMV_Settings_YesToggle,"EMV Settings");
	}
	
	@Then("Check the Castle and Go Toggle is Enabled")
	public void ChecktheCastleandGoToggleisEnabled() throws Exception
	{
		cmp.Check_Toggle_Enabled(lap.CastleAndgo_YesToggle,"Castle and Go Toggle IsEnabled");
	}
	
	@Then("Check the SPPax is Enabled")
	public void CheckSPPaxIsEnabled() throws Exception 
	{
		cmp.Check_Toggle_Enabled(lap.SPPax_YesToggle,"SPPax Toggle is Enabled");
	}
	
	@Then("Check Serial number should be contain atleast 8 digits Error Message is Displayed")
	public void CheckSerialNumberShouldbeContainatleast8DigitsErrorMessage()
	{
		if(driver.findElement(By.xpath("(//mat-hint[.='Serial number should be contain atleast 8 digits'])[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Serial Number should contain atleast 8 digits displayed");
		}
		else
		{
			test.log(LogStatus.FAIL,"Serial Number should contain atleast 8 digits not displayed");
		}
	}
	
	@And("I Enter the Serial Number")
	public void EnterSerialNumber() throws Exception 
	{
		lap.SerialNumber.clear();
		Thread.sleep(500);
		lap.SerialNumber.sendKeys("34561");
	}
	
	@And("I Disable the SPPax Toggle")
	public void DisableSPPaxToggle()
	{
		lap.SPPax_NoToggle.click();
	}
	
	@And("I Enable Give X Gift Card Toggle")
	public void EnableGiveXGiftCardToggle() throws Exception
	{
		driver.findElement(By.xpath("//span[.='Store Settings']")).click();
		Thread.sleep(500);
		lap.GiveXGiftCard_YesToggle.click();
	}
	
	@And("I Enter the Primary URL")
	public void EnterPrimaryURL() throws Exception 
	{
		lap.Primary_URL.clear();
		Thread.sleep(500);
		lap.Primary_URL.sendKeys(RandomStringUtils.randomAlphanumeric(10));
	}
	
	@And("I Enter the Secondary URL")
	public void EnterSecondaryURL() throws Exception 
	{
		lap.Secondary_URL.clear();
		Thread.sleep(500);
		lap.Secondary_URL.sendKeys(RandomStringUtils.randomAlphanumeric(10));
	}
	
	@And("I Enter the User Id")
	public void EntertheUserID() throws Exception 
	{
		lap.UserID.clear();
		Thread.sleep(500);
		lap.UserID.sendKeys(RandomStringUtils.randomAlphanumeric(10));
	}
	
	@And("I Enable the House Account Toggle")
	public void EnableHouseAccountToggle() 
	{
		lap.HouseAccount_YesToggle.click();
	}
	
	@And("I Disable the House Account Toggle")
	public void DisableHouseaccountToggle()
	{
		lap.HouseAccount_NoToggle.click();
	}
	
	@And("I Enable the MPPG Credit Card Toggle")
	public void EnableMPPGCreditCardToggle() 
	{
		lap.MPPGCreditCard_YesToggle.click();
	}
	
	@And("I Enable Account Toggle")
	public void enableAccountToggle() 
	{
		if(lap.TestAccountToggle.isEnabled()) 
		{
			
		}
		else {
			lap.TestAccountToggle.click();
		}
	}
	
	@Then("Verify MagTek Test account updated or Not")
	public void VerifyMagTekTestAccountPopup()
	{
		try {
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("MagTek Test account updated successfully"))
		{
			test.log(LogStatus.PASS,"MgkTest Account Updated Successfully");
		}
		else {
			test.log(LogStatus.FAIL,"MgkTest Account Not Updated Succssfully");
		}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.INFO,"The Toggle Is Already Enabled");
		}
	}
	
	@And("I Enter the Customer Code")
	public void EnterCustomercode() throws Exception 
	{
		lap.CustomerCodeInputBox.clear();
		Thread.sleep(500);
		lap.CustomerCodeInputBox.sendKeys(RandomStringUtils.randomNumeric(5));
	}
	
	@And("I Select the Payment Gateway as TSYS")
	public void SelectPaymentGateWayAsTSYS() throws Exception 
	{
		lap.PaymentGateWay.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'TSYS')]")).click();
	}
	
	@And("I Enter the MCC")
	public void EnterMCC() throws Exception
	{
		lap.MCC.clear();
		Thread.sleep(500);
		lap.MCC.sendKeys(RandomStringUtils.randomAlphanumeric(6));
	}
	
	@And("I Select the Payment Gateway as FDMS")
	public void SelectPaymentGateWayAsFDMS() throws Exception 
	{
		lap.PaymentGateWay.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'FDMS')]")).click();
	}
	
	@And("I Select the Payment Gateway as World Pay")
	public void SelectPaymentGatewayAsWorldPay() throws Exception 
	{
		lap.PaymentGateWay.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'World Pay')]")).click();
	}
	
	@Given("I Disable Account Toggle")
	public void DisableAccountToggle() 
	{
		if(lap.TestAccountToggle.isEnabled()) 
		{
			lap.TestAccountToggle.click();
		}
		else {
			
		}
	}
	
	@And("I Disable the MPPG Credit Card Toggle")
	public void DisableMPPGCreditCardToggle() 
	{
		lap.MPPGCreditCard_NoToggle.click();
	}
	
	@And("I Enable the Ingenico Toggle")
	public void EnableIngenicoToggle() 
	{
		lap.Ingenico_YesToggle.click();
		cmp.Enable_Toggle(lap.Ingenico_YesToggle, "Ingenico Yes Toggle");
	}
	
	@And("I Disable the Ingenico Toggle")
	public void DisableIngenicoToggle() 
	{
		cmp.Disable_Toggle(lap.Ingenico_YesToggle,lap.Ingenico_NoToggle, "ingenico Togggle");
	}
	
	@And("I Enable the NMI Tokenization Toggle")
	public void EnableNMITokenizationToggle() 
	{
		cmp.Enable_Toggle(lap.NMITokenization_YesToggle, "NMI Tokenization");
	}
	
	@And("I Disable the NMI Tokenization Toggle")
	public void DisableNMITokenizationTogggle()
	{
		cmp.Disable_Toggle(lap.NMITokenization_YesToggle, lap.NMITokenization_NoToggle,"NMI Tokenization");
	}
	
	@And("I Enable the Dejavoo Toggle")
	public void EnableDejavooToggle()
	{
		cmp.Enable_Toggle(lap.Dejavoo_YesToggle, "Dejavoo Toggle");
	}
	
	@And("I Enter the Spin Cloud URL")
	public void EnterSpinCloudURL() throws Exception 
	{
		lap.SpinCloudURL.clear();
		Thread.sleep(500);
		lap.SpinCloudURL.sendKeys(RandomStringUtils.randomAlphanumeric(10));
	}
	
	@Then("Verify Dejavoo Settings Updated or Not")
	public void VerifyDejavooSettingsUpdatedOrNot()
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Dejavoo credentials saved successfully"))
		{
			test.log(LogStatus.PASS,"Dejavoo Settings Updated Successfully");
		}
		else {
			test.log(LogStatus.FAIL,"Dejavoo Settings Not Updated Successfully");
		}
	}
	
	@And("I Disable the Dejavoo Toggle")
	public void DisableDejavooToggle() 
	{
		cmp.Disable_Toggle(lap.Dejavoo_YesToggle, lap.Dejavoo_NoToggle, "Dejavoo Toggle");
	}
	
	@And("I Enable the Optomany Toggle")
	public void EnableOptomanyToggle() 
	{
		cmp.Enable_Toggle(lap.Optomany_YesToggle,"Optomany Toggle");
	}
	
	@And("I Enter the Merchant Id")
	public void EnterMerchantID() throws Exception
	{
		lap.MerchantID.clear();
		Thread.sleep(500);
		lap.MerchantID.sendKeys(RandomStringUtils.randomNumeric(5));
	}
	
	@Then("Verify Optomany Settings Updated or Not")
	public void VerifyOptomanySettingsUpdatedOrNot()
	{
		try {
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Optomany settings saved successfully")) 
		{
			test.log(LogStatus.PASS,"optomany settings Saved Successfully");
		}
		else {
			test.log(LogStatus.FAIL,"Optomany Settings Not Saved Successfully");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@And("I Disable the Optomany Toggle")
	public void DisableOptomanyToggle() 
	{
		cmp.Disable_Toggle(lap.Optomany_YesToggle, lap.Optomany_NoToggle,"Optomany Toggle");
	}
	
	@And("I Enable the Vexen Payment Toggle")
	public void EnableVexenPaymentToggle() 
	{
		cmp.Enable_Toggle(lap.VexenPayment_YesToggle,"VexenPayment Toggle");
	}
	
	@And("I Enter the Site Id")
	public void EnterSiteId() throws Exception 
	{
		lap.SiteID.clear();
		Thread.sleep(500);
		lap.SiteID.sendKeys(RandomStringUtils.randomNumeric(6));
	}
	
	@Given("I Clear the Site Id")
	public void ClearStoreID() throws Exception 
	{
		lap.SiteID.clear();
		Thread.sleep(500);
	}
	
	@And("I Enter the Provision URL")
	public void EnterProvisionalURL() throws Exception 
	{
		lap.ProvisionalUrl.clear();
		Thread.sleep(500);
		lap.ProvisionalUrl.sendKeys(RandomStringUtils.randomAlphanumeric(15));
	}
	
	@Then("Verify Vexen Settings Updated or Not")
	public void VerifyVexeSettigsUpdatedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Vexen updated successfully")) 
		{
			test.log(LogStatus.PASS,"Vexen Settings Updated Successfully");
		}
		else {
			test.log(LogStatus.FAIL,"Vexen Settings Not Updated Successfully");
		}
	}
	
	@And("I Disable the Vexen Payment Toggle")
	public void DisabletheVexenPaymentToggle() 
	{
		cmp.Disable_Toggle(lap.VexenPayment_YesToggle, lap.VexenPayment_NoToggle, "Vexen Toggle");
	}
	
	@And("I Enable the Clover Payment Toggle")
	public void EnableCloverPaymentToggle()
	{
		cmp.Enable_Toggle(lap.CloverPayment_YesToggle, "Clover Toggle");
	}
	
	@And("I Disable the Clover Payment Toggle")
	public void DisableCloverPaymentToggle() 
	{
		cmp.Disable_Toggle(lap.CloverPayment_YesToggle, lap.CloverPayment_NoToggle, "Clover Toggle");
	}
	
	@And("I Enable the Show Dual Price Toggle")
	public void EnableshowDualPriceToggle() 
	{
		cmp.Enable_Toggle(lap.ShowDualPrice_YesToggle, "Dual Price Toggle");
	}
	
	@And("I Disable the Show Dual Price Toggle")
	public void DisableShowDualPriceToggle()
	{
		cmp.Disable_Toggle(lap.ShowDualPrice_YesToggle, lap.ShowDualPrice_NoToggle, "Dual Price Toggle");
	}
	
	@And("I Enable the Show Deposit In Sale Recap Toggle")
	public void EnableShowDepositeInSaleRecapReport() 
	{
		cmp.Enable_Toggle(lap.ShowDeposite_YesToggle, "Show Deposite Toggle");
	}
	
	@And("I Clear the Percentage")
	public void ClearPercenatage() 
	{
		lap.Percentage.clear();
	}
	
//	@And("I Enter the Percentage")
//	public void EnterPercentage()
//	{
//		lap.Percentage.sendKeys(RandomStringUtils.randomNumeric(3));
//	}
	
	@And("I Disable the Show Deposit In Sale Recap Toggle")
	public void DisableShowDepositeInSaleRecapReport() 
	{
		cmp.Disable_Toggle(lap.ShowDeposite_YesToggle, lap.ShowDeposite_NoToggle, "Showdeposite");
	}
	
	@And("I Enable the Membership Toggle")
	public void EnableMembershipToggle() 
	{
		cmp.Enable_Toggle(lap.Membership_YesToggle, "Membership Toggle");
	}
	
	@And("I Disable the Membership Toggle")
	public void DisableMembershiptoggle() 
	{
		cmp.Disable_Toggle(lap.Membership_YesToggle, lap.Membership_NoToggle,"Membership Toggle");
	}
	
	@And("I Enable the Ingenico TR Toggle")
	public void EnableIngenicoTRToggle() 
	{
		cmp.Enable_Toggle(lap.IngenicoTR_YesToggle,"Ingenico TR Toggle");
	}
	
	@And("I Disable the Ingenico TR Toggle")
	public void DisableIngenicoTRToggle() 
	{
		cmp.Disable_Toggle(lap.IngenicoTR_YesToggle, lap.IngenicoTR_NoToggle, "Ingenico TR Toggle");
	}
	
	@And("I Enable the Food Check Toggle")
	public void EnablefoodCheckToggle() 
	{
		cmp.Enable_Toggle(lap.FoodCheck_YesToggle, "Food Check Toggle");
	}
	
	@And("I Disable the Food Check Toggle")
	public void DisableFoodCheckToggle()
	{
		cmp.Disable_Toggle(lap.FoodCheck_YesToggle, lap.FoodCheck_NoToggle,"Food Check Toggle");
	}
	
	@And("I Enable the Mobile Toggle")
	public void EnableMobileToggle()
	{
		cmp.Enable_Toggle(lap.Mobile_YesToggle,"Mobile Toggle");
	}
	
	@And("I Disable the Mobile Toggle")
	public void DisableMobileToggle() 
	{
		cmp.Disable_Toggle(lap.Mobile_YesToggle, lap.Mobile_NoToggle,"Mobile Toggle");
	}
	
	@And("I Enable the Score Toggle")
	public void EnableScoreToggle() 
	{
		cmp.Enable_Toggle(lap.Score_YesToggle,"Score Toggle");
	}
	
	@And("I Disable the Score Toggle")
	public void DisableScoreToggle()
	{
		cmp.Disable_Toggle(lap.Score_YesToggle, lap.Score_NoToggle,"Score Toggle");
	}
	
	@And("I Enable the Castle and Go Toggle")
	public void EnableCastleAndGoToggle() 
	{
		cmp.Enable_Toggle(lap.CastleAndgo_YesToggle, "Castle and Go Toggle");
	}
	
	@And("I Disable the Castle and Go Toggle")
	public void DisableCastleAndGoToggle() 
	{
		cmp.Disable_Toggle(lap.CastleAndgo_YesToggle, lap.CastleAndgo_NoToggle, "Castle and Go Toggle");
	}
	
	@And("I Enable the SPPax Toggle")
	public void EnableSPPaxToggle()
	{
		cmp.Enable_Toggle(lap.SPPax_YesToggle, "SPPax Toggle");
	}
	
	@Then("Check the Update button is Disabled in Store Details")
	public void VerifyUpdateButtonISEnabled() throws Exception 
	{
		cmp.Check_Button_Disabled(lap.Update, "Update Button");
	}
	
	@And("I Click the Update button In Sale Recap")
	public void ClickUpdateButtonInSaleRecap() 
	{
		driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[7]")).click();
	}
	
	@And("I Click the Update button In Vexen Payment")
	public void ClickUpdateButtonInVexen() 
	{
		driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[6]")).click();
	}
	
	@And("I Click the update button GiveX Card")
	public void ClickUpdateButtonInGiveXCard() 
	{
		driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[2]")).click();
	}
	
	@And("I Click the Update button MPPG CreditCard")
	public void ClickUpdateButtonInMPPGCreditCard()
	{
		driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[3]")).click();
	}
	
	@And("I Click the Update button InDejavoo")
	public void ClickUpdateButtonInDejavoo() 
	{
		driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[4]")).click();
	}
	
	@And("I Click the Update button In Optomany")
	public void ClickUpdateButtonInOptomany() 
	{
		driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[5]")).click();
	}
	
	@And("I Enter the User Id GiveX")
	public void EnterUserIDInGiveX() throws Exception 
	{
		lap.UserID_Two.clear();
		Thread.sleep(500);
		lap.UserID_Two.sendKeys(RandomStringUtils.randomAlphanumeric(10));
	}
	
	@And("I Enter the New Password In Givex")
	public void EnterNewPasswordInGivex() throws Exception 
	{
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]")).sendKeys("sg123");
	}
	
	@And("I Enter the Confirm Password Givex")
	public void EnterConfirmPasswordInGiveX() throws Exception 
	{
		driver.findElement(By.xpath("//input[@data-placeholder='Confirm Password']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@data-placeholder='Confirm Password']")).sendKeys("sg123");
	}
	
	@And("I Enter the Invalid Confirm Password in GiveX")
	public void EnterInvaidPAsswordInGiveX() throws Exception 
	{
		driver.findElement(By.xpath("//input[@data-placeholder='Confirm Password']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@data-placeholder='Confirm Password']")).sendKeys("red");
	}
	
	@And("I Enter the Password MPPG")
	public void EnterPassowrdInMPPG() throws Exception
	{
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]")).sendKeys(RandomStringUtils.randomAlphanumeric(5));
	}
	
//	@And("I Enter the Password in Optomany")
//	public void EnterPasswordInOptomany() throws Exception
//	{
//		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[3]")).clear();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[3]")).sendKeys(RandomStringUtils.randomAlphanumeric(5));
//	}
	
	@And("I Disable the Give X Gift Card Toggle")
	public void DisableGiveXGiftCardToggle() 
	{
		cmp.Disable_Toggle(lap.GiveXGiftCard_YesToggle, lap.GiveXGiftCard_NoToggle, "GiveX Toggle");
	}
}
