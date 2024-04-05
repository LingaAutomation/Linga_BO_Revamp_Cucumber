package StepDefinition;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.EMVSettingsPage;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_EMV_Settings
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	EMVSettingsPage emv = new EMVSettingsPage();

	@Given("Open EMV Settings home page BaseURL and StoreID")
	public void OpenEMVSettingsHomePage() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"EmvSettings");
		
		cmp.Close_Online_Help_ChatBox();
	}

	@Given("Verifying the EMV Settings Header Page")
	public void verifyingTheEMVSettingsHeaderPage() 
	{
		cmp.VerifyMainScreenPageHeader("EMV Settings");
	}

	@Given("Click on New EMV Settings button")
	public void clickOnNewEMVSettingsButton() throws Exception
	{
		Thread.sleep(5000);
		//Click the New EMV
		emv.Click_NewEMV();
	}
	@Then("verify New EMV Settings Header")
	public void verifyNewEMVSettingsHeader() throws Exception
	{
		Thread.sleep(1000);
		String src = driver.findElement(By.xpath("(//h3)[2]")).getText();
		Thread.sleep(2000);
		if(src.equalsIgnoreCase("New EMV Settings"))
		{
			test.log(LogStatus.PASS, "New EMV settings page displayed");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "New EMV settings page not displayed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Enter IP Address")
	public void enterIPAddress() throws Exception 
	{
		emv.EnterIP(Utility.getProperty("EMVSettings_IP"));
	}

	@Given("Enter EMV Settings Name")
	public void enterEMVSettingsName() throws Exception 
	{
		cmp.EnterName(Utility.getProperty("EMVSettings_Name"));
	}
	@Given("Select Type as SP-PAX")
	public void selectTypeAsSPPAX() throws Exception 
	{
		emv.TypeInputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[.='SP-PAX'])[2]")).click();
	}
	@Then("Select Serial Number")
	public void selectSerialNumber() throws Exception
	{
		emv.SerialNumber.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class='options with-height']//select-option)[1]")).click();
		

	}

	@Given("Enter Invalid IP Address")
	public void enterInvalidIPAddress() throws Exception 
	{
		emv.EnterIP("101.4657.324.01");
	}
	@Then("Verify Enter Valid IP Address Error Popup")
	public void verifyEnterValidIPAddressErrorPopup() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter valid IP address"))
		{
			test.log(LogStatus.PASS,"Enter Valid Ip Address Popup Displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Enter Valid IP Address Popup not Displayed");
		}
	}

	@Given("Enter EMV Settings Name for OPTOMANY")
	public void enterEMVSettingsNameForOPTOMANY() throws Exception 
	{
		cmp.EnterName(Utility.getProperty("EMVSettings_Name_Optomany"));
	}
	@Given("Enter IP Address OPTOMANY")
	public void enterIPAddressOPTOMANY() throws Exception 
	{
		emv.EnterIP(Utility.getProperty("EMVSettings_IP_Optomany"));
	}
	@Given("Select the Type as OPTOMANY")
	public void selectTheTypeAsOPTOMANY() throws Exception 
	{
		emv.TypeInputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[.='OPTOMANY'])[2]")).click();
	}
	@Then("Verify EMV Setting Saved or Not")
	public void verifyEMVSettingsSavedOrNot() throws Exception
	{
		Thread.sleep(3000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("EMV settings Saved successfully"))
		{
			test.log(LogStatus.PASS, "EMV settings Saved successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "EMV settings Saved failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("Enter EMV Settings Name for INGENICO")
	public void enterEMVSettingsNameForINGENICO() throws Exception
	{
		cmp.EnterName(Utility.getProperty("EMVSettings_Name_Ingenico"));
	}
	@Given("Enter IP Address INGENICO")
	public void enterIPAddressINGENICO() throws Exception 
	{
		emv.EnterIP(Utility.getProperty("EMVSettings_IP_Ingenico"));
	}
	@Given("Select the Type as INGENICO")
	public void selectTheTypeAsINGENICO() throws Exception 
	{
		emv.TypeInputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[.='INGENICO'])[2]")).click();
	}
	@Given("Enter EMV Settings Name for CLOVER")
	public void enterEMVSettingsNameForCLOVER() throws Exception 
	{
		cmp.EnterName(Utility.getProperty("EMVSettings_Name_Clover"));
	}
	@Given("Enter IP Address CLOVER")
	public void enterIPAddressCLOVER() throws Exception 
	{
		emv.EnterIP(Utility.getProperty("EMVSettings_IP_Clover"));
	}
	@Given("Select the Type as CLOVER")
	public void selectTheTypeAsCLOVER() throws Exception
	{
		emv.TypeInputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[.='CLOVER'])[2]")).click();
	}
	@Given("Enter EMV Settings Name for MONERIS")
	public void enterEMVSettingsNameForMONERIS() throws Exception 
	{
		cmp.EnterName(Utility.getProperty("EMVSettings_Name_Moneris"));
	}

	@And("Enter IP Address MONERIS")
	public void EnterIPAddressMoneris() throws Exception
	{
		emv.EnterIP(Utility.getProperty("EMVSettings_IP_Moneris"));
	}
	@Given("Enter IP Address DEJAVOO")
	public void enterIPAddressDEJAVOO() throws Exception 
	{
		emv.EnterIP(Utility.getProperty("EMVSettings_IP_Dejavoo"));
	}
	@Given("Select the Type as MONERIS")
	public void selectTheTypeAsMONERIS() throws Exception {
		emv.TypeInputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[.='MONERIS'])[2]")).click();
	}

	@Given("Enter EMV Settings Name for EVERTEC")
	public void enterEMVSettingsNameForEVERTEC() throws Exception 
	{
		cmp.EnterName(Utility.getProperty("EMVSettings_Name_Evertec"));
	}
	@Given("Enter IP Address EVERTEC")
	public void enterIPAddressEVERTEC() throws Exception
	{
		emv.EnterIP(Utility.getProperty("EMVSettings_IP_Evertec"));
	}
	@Given("Select the Type as EVERTEC")
	public void selectTheTypeAsEVERTEC() throws Exception 
	{
		emv.TypeInputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[.='EVERTEC'])[2]")).click();
	}
	@Given("Enter Terminal ID")
	public void enterTerminalID() throws Exception 
	{
       driver.findElement(By.xpath("//input[@aria-label='Terminal Id']")).clear();
       Thread.sleep(500);
       driver.findElement(By.xpath("//input[@aria-label='Terminal Id']")).sendKeys(RandomStringUtils.randomAlphanumeric(8));
	}

	@Given("Enter EMV Settings Name for DEJAVOO")
	public void enterEMVSettingsNameForDEJAVOO() throws Exception 
	{
		cmp.EnterName(Utility.getProperty("EMVSettings_Name_Dejavoo"));
	}

	@Given("Select the Type as DEJAVOO")
	public void selectTheTypeAsDEJAVOO() throws Exception
	{
		emv.TypeInputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[.='DEJAVOO'])[2]")).click();
	}
	@Given("Enter Authorization Key")
	public void enterAuthorizationKey() throws Exception 
	{
		emv.Auth_Key.clear();
		Thread.sleep(500);
		emv.Auth_Key.sendKeys(RandomStringUtils.randomAlphanumeric(7));
	}
	@Given("Enter TPN Value")
	public void enterTPNValue() throws Exception 
	{
		emv.TPN.clear();
		Thread.sleep(500);
		emv.TPN.sendKeys(RandomStringUtils.randomAlphanumeric(7));
	}
	@Given("Enter Token Value")
	public void enterTokenValue() throws Exception 
	{
		emv.Token.clear();
		Thread.sleep(500);
		emv.Token.sendKeys(RandomStringUtils.randomAlphanumeric(7));
	}

	@Given("I Search and Edit the EMV Settings")
	public void iSearchAndEditTheEMVSettings() throws Exception
	{
		cmp.SearchAndClickEdit(Utility.getProperty("EMVSettings_Name"));
	}
	@Then("Verify the Update EMV Settings Header")
	public void verifyTheUpdateEMVSettingsHeader() throws Exception
	{
		Thread.sleep(500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update EMV Settings");
	}

	@Then("I Verify EMV Settings Update screen Closed or Not")
	public void VerifyEMVSettingsUpdateScreenClosedOrNot() throws Exception 
	{
		Thread.sleep(1000);
		//Check whether the New Category Creation form Closed or not

		if(!cmp.NewCreationScreenHeader().isDisplayed()) 
		{ 
			test.log(LogStatus.PASS,"EMV Settings Cancelled");
		} 
		else 
		{ 
			test.log(LogStatus.FAIL, "EMV Settings not Cancelled");
		}
	}

	@Then("Clear the IP Address")
	public void clearTheIPAddress() 
	{
		emv.IPAddress.clear();
	}

	@Then("Verify IP Address Already Exist Error Message")
	public void verifyIPAddressAlreadyExistErrorMessage() 
	{
		if(driver.findElement(By.xpath("(//mat-hint[.='IP Address Already Exists'])[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Ip Address already Exist Message Displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Ip Address Already Exist Message Not Displayed");
		}
	}

	@Then("Enter New IP Address")
	public void enterIPAddressDuplicate() throws Exception 
	{
		emv.EnterIP(Utility.getProperty("EMVSettings_IP1"));
	}
	@Then("Verify Name Already Exist Error Message")
	public void verifyDuplicateEmvSettingSavedOrNot() throws Exception 
	{
		if(driver.findElement(By.xpath("(//mat-hint[.='Name already exist '])[1]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Name Already Exist Popup Displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else 
		{
			test.log(LogStatus.FAIL,"Name Already Exist Popup Not Displayed");
		}
	}

	@Given("Search EMV Setting and Click on Delete")
	public void searchEMVSettingAndClickOnDelete() throws Exception
	{
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("EMVSettings_Name"));
		Thread.sleep(500);
		cmp.Alert_PopupMsg("Please make sure you submit batch before deleting EMV settings");
	}
	@Then("Verify the Cancelled EMV Setting Deleted or Not")
	public void verifyTheCancelledEMVSettingDeletedOrNot() 
	{
		try {
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("EMV Settings Removed Successfully"))
		{
			test.log(LogStatus.FAIL, "EMV Settings Removed Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.PASS," Emv Settings not Removed After Clicking on Cancel");
		}
	}

	@Then("Verify EMV Setting Deleted or Not")
	public void verifyEMVSettingDeletedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("EMV Settings Removed Successfully"))
		{
			test.log(LogStatus.PASS, "EMV Settings Removed Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "EMV Settings Removed Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}



   @Then("Verify EMV Settings Updated or Not")
   public void VerifyEMVSettingsUpdatedorNot() throws Exception 
   {
	   Thread.sleep(3000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("EMV settings updated successfully"))
		{
			test.log(LogStatus.PASS, "EMV Settings updated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "EMV Settings updated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
   }
   
   @And("Enter New EMV Settings Name")
   public void EnterNewEMVSettingsName() throws Exception
   {
	   cmp.EnterName(Utility.getProperty("EMVSettings_Name_Evertec")+"1");
   }
   
   @And("I Click the Delete button in EMV")
   public void ClickDeleteButton() 
   {
	   cmp.DeleteBtn.click();
   }


}
