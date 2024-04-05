package StepDefinition;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_Web_Hooks_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_Web_Hooks
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;


	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Web_Hooks_Page wh = new Settings_Web_Hooks_Page();

	@Given("Open WebHooks home page BaseURL and StoreID")
	public void OpenWebHooksHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"webhooks");
		Thread.sleep(2000);
	}

	@Given("Verifying the WebHooks Header Page")
	public void verifyingTheWebHooksHeaderPage()
	{
		try {
			if(driver.findElement(By.xpath("//h3[contains(.,'Web Hooks')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "Web Hooks page is loaded successfully");
			}
		}catch(Exception E) {
			test.log(LogStatus.FAIL, "Web Hooks page is not loaded");
		}
	}

	@Given("Verify X-API-Key Inputbox is Displayed or Not")
	public void verifyXAPIKeyInputboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(wh.apiKeyTextbox,"X-API-Key input box");
	}
	@Then("Verify Value Inputbox is Displayed or Not")
	public void verifyValueInputboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(wh.ValueTextbox,"Value input box");
	}
	@Then("Verify Close Order Web Hooks TextBox is Displayed or Not")
	public void verifyCloseOrderWebHooksTextBoxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(wh.CloseOrderText,"Close Order WebHook Text box");
	}
	@Then("Verify Close Order Web Hooks Is Active Toggle is Displayed or Not")
	public void verifyCloseOrderWebHooksIsActiveToggleIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(wh.Close_Order_NoToggle,"Close Order WebHook Toggle");
	}
	@Then("Verify Open Order WebHooks TextBox is Displayed or Not")
	public void verifyOpenOrderWebHooksTextBoxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(wh.OpenOrderText,"Open Order WebHook Textbox");
	}
	@Then("Verify Open Order Web Hooks Is Active Toggle is Displayed or Not")
	public void verifyOpenOrderWebHooksIsActiveToggleIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(wh.Open_Order_NoToggle,"Open Order WebHook Toggle");
	}
	@Then("Verify Update Order WebHooks TextBox is Displayed or Not")
	public void verifyUpdateOrderWebHooksTextBoxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(wh.UpdateOrderText,"Update Order WebHook Textbox");
	}
	@Then("Verify Update Order Web Hooks Is Active Toggle is Displayed or Not")
	public void verifyUpdateOrderWebHooksIsActiveToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(wh.Update_Order_NoToggle,"Update Order WebHook Toggle");
	}
	@Then("Verify Third Order Web Hooks Is Active Toggle is Displayed or Not")
	public void verifyThirdOrderWebHooksIsActiveToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(wh.Third_Order_NoToggle,"Third Order WebHook Toggle");
	}

	@Given("Clear X-API-Key")
	public void clearXAPIKey()
	{
		wh.apiKeyTextbox.clear();
	}
	@Given("Enter X-API-Key in Single Digit")
	public void enterXAPIKeyInSingleDigit() 
	{
		wh.apiKeyTextbox.sendKeys("1");
	}
	@Then("Verify WebHooks Updated or Not")
	public void verifyWebHooksUpdatedOrNot() throws Exception 
	{
		Thread.sleep(2000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Store Updated Successfully")) 
		{
			test.log(LogStatus.PASS,"Web Hooks Updated Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
		}

		else 
		{
			test.log(LogStatus.FAIL,"Web Hooks not Updated Successfully");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Enter X-API-Key as Infinity Key Value")
	public void enterXAPIKeyAsInfinityKeyValue()
	{
		wh.apiKeyTextbox.sendKeys(RandomStringUtils.randomNumeric(30));
	}

	@Given("Enter X-API-Key as Alphabets")
	public void enterXAPIKeyAsAlphabets() 
	{
		wh.apiKeyTextbox.sendKeys(RandomStringUtils.randomAlphabetic(7));

	}

	@Given("Enter X-API-Key as Special Characters")
	public void enterXAPIKeyAsSpecialCharacters() 
	{
		wh.apiKeyTextbox.sendKeys("%^&%&&*(");
	}

	@Given("Enter X-API-Key as combination of Digits,Alphabets")
	public void enterXAPIKeyAsCombinationOfDigitsAlphabets() 
	{
		wh.apiKeyTextbox.sendKeys(RandomStringUtils.randomAlphanumeric(15));
	}

	@Given("Enter X-API-Key as combination of Digits,Alphabets and Special Characters")
	public void enterXAPIKeyAsCombinationOfDigitsAlphabetsAndSpecialCharacters() 
	{
		wh.apiKeyTextbox.sendKeys(RandomStringUtils.randomAlphanumeric(10)+"$%#$");
	}

	@Given("Clear the Value")
	public void clearTheValue() 
	{
		wh.ValueTextbox.clear();
	}
	@Given("Enter Value in Single Digit")
	public void enterValueInSingleDigit()
	{
		wh.ValueTextbox.sendKeys("5");
	}

	@Given("Enter Value as Infinity Key Value")
	public void enterValueAsInfinityKeyValue() 
	{
		wh.ValueTextbox.sendKeys(RandomStringUtils.randomNumeric(35));
	}

	@Given("Enter Value as Alphabets")
	public void enterValueAsAlphabets() 
	{
		wh.ValueTextbox.sendKeys(RandomStringUtils.randomAlphabetic(8));
	}

	@Given("Enter Value as Special Characters")
	public void enterValueAsSpecialCharacters() 
	{
		wh.ValueTextbox.sendKeys("$%^&^@");
	}

	@Given("Enter Value as combination of Digits,Alphabets")
	public void enterValueAsCombinationOfDigitsAlphabets() 
	{
		wh.ValueTextbox.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Enter Value as combination of Digits,Alphabets and Special Characters")
	public void enterValueAsCombinationOfDigitsAlphabetsAndSpecialCharacters()
	{
		wh.ValueTextbox.sendKeys(RandomStringUtils.randomAlphanumeric(10)+"%^$%");
	}

	@Given("Clear the Close Order Web Hooks")
	public void clearTheCloseOrderWebHooks()
	{
		wh.CloseOrderText.clear();
	}
	@Given("Enter Close Order Web Hooks as Infinity Key Value")
	public void enterCloseOrderWebHooksAsInfinityKeyValue() 
	{
		wh.CloseOrderText.sendKeys(RandomStringUtils.randomNumeric(40));
	}

	@Given("Enter Close Order Web Hooks as Alphabets")
	public void enterCloseOrderWebHooksAsAlphabets()
	{
		wh.CloseOrderText.sendKeys(RandomStringUtils.randomAlphabetic(10));
	}

	@Given("Enter Close Order Web Hooks as Special Characters")
	public void enterCloseOrderWebHooksAsSpecialCharacters()
	{
		wh.CloseOrderText.sendKeys("%^&$^^&*");
	}
	@Given("Enter Close Order Web Hooks as combination of Digits,Alphabets")
	public void enterCloseOrderWebHooksAsCombinationOfDigitsAlphabets() 
	{
		wh.CloseOrderText.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Enter Close Order Web Hooks as combination of Digits,Alphabets and Special Characters")
	public void enterCloseOrderWebHooksAsCombinationOfDigitsAlphabetsAndSpecialCharacters() 
	{
		wh.CloseOrderText.sendKeys(RandomStringUtils.randomAlphanumeric(20)+"$##%");
	}

	@Given("Enable Close Order Web Hooks Is Active Toggle")
	public void enableCloseOrderWebHooksIsActiveToggle() 
	{
		wh.Close_Order_YesToggle.click();
	}

	@Given("Disable Close Order Web Hooks Is Active Toggle")
	public void disableCloseOrderWebHooksIsActiveToggle()
	{
		wh.Close_Order_NoToggle.click();
	}

	@Given("Clear the Open Order Web Hooks")
	public void clearTheOpenOrderWebHooks() 
	{
		wh.OpenOrderText.clear();
	}
	@Given("Enter Open Order Web Hooks as Infinity Key Value")
	public void enterOpenOrderWebHooksAsInfinityKeyValue()
	{
		wh.OpenOrderText.sendKeys(RandomStringUtils.randomNumeric(50));
	}

	@Given("Enter Open Order Web Hooks as Alphabets")
	public void enterOpenOrderWebHooksAsAlphabets() 
	{
		wh.OpenOrderText.sendKeys(RandomStringUtils.randomAlphabetic(10));
	}

	@Given("Enter Open Order Web Hooks as Special Characters")
	public void enterOpenOrderWebHooksAsSpecialCharacters() 
	{
		wh.OpenOrderText.sendKeys("%^$#%$^");
	}

	@Given("Enter Open Order Web Hooks as combination of Digits,Alphabets")
	public void enterOpenOrderWebHooksAsCombinationOfDigitsAlphabets() 
	{
		wh.OpenOrderText.sendKeys(RandomStringUtils.randomAlphanumeric(25));
	}

	@Given("Enter Open Order Web Hooks as combination of Digits,Alphabets and Special Characters")
	public void enterOpenOrderWebHooksAsCombinationOfDigitsAlphabetsAndSpecialCharacters()
	{
		wh.OpenOrderText.sendKeys(RandomStringUtils.randomAlphanumeric(25)+"$%#%$");
	}


	@Given("Enable Open Order Web Hooks Is Active Toggle")
	public void enableOpenOrderWebHooksIsActiveToggle() 
	{
		wh.Open_Order_YesToggle.click();
	}

	@Given("Disable Open Order Web Hooks Is Active Toggle")
	public void disableOpenOrderWebHooksIsActiveToggle() 
	{
		wh.Open_Order_NoToggle.click();
	}

	@Given("Clear the Update Order Web Hooks")
	public void clearTheUpdateOrderWebHooks() 
	{
		wh.UpdateOrderText.clear();
	}
	@Given("Enter Update Order Web Hooks as Infinity Key Value")
	public void enterUpdateOrderWebHooksAsInfinityKeyValue() 
	{
		wh.UpdateOrderText.sendKeys(RandomStringUtils.randomNumeric(40));
	}

	@Given("Enter Update Order Web Hooks as Alphabets")
	public void enterUpdateOrderWebHooksAsAlphabets() 
	{
		wh.UpdateOrderText.sendKeys(RandomStringUtils.randomAlphabetic(10));
	}


	@Given("Enter Update Order Web Hooks as Special Characters")
	public void enterUpdateOrderWebHooksAsSpecialCharacters() 
	{
		wh.UpdateOrderText.sendKeys("%%$^%**&(&*%");
	}

	@Given("Enter Update Order Web Hooks as combination of Digits,Alphabets")
	public void enterUpdateOrderWebHooksAsCombinationOfDigitsAlphabets() 
	{
		wh.UpdateOrderText.sendKeys(RandomStringUtils.randomAlphanumeric(30));
	}

	@Given("Enter Update Order Web Hooks as combination of Digits,Alphabets and Special Characters")
	public void enterUpdateOrderWebHooksAsCombinationOfDigitsAlphabetsAndSpecialCharacters() 
	{
		wh.UpdateOrderText.sendKeys(RandomStringUtils.randomAlphanumeric(30)+"$%#%$%");
	}

	@Given("Enable Update Order Web Hooks Is Active Toggle")
	public void enableUpdateOrderWebHooksIsActiveToggle()
	{
		wh.Update_Order_YesToggle.click();
	}


	@Given("Disable Update Order Web Hooks Is Active Toggle")
	public void disableUpdateOrderWebHooksIsActiveToggle() 
	{
		wh.Update_Order_NoToggle.click();
	}

	@Given("Enable Third Order Web Hooks Is Active Toggle")
	public void enableThirdOrderWebHooksIsActiveToggle()
	{
		wh.Third_Order_YesToggle.click();
	}

	@Given("Disable Third Order Web Hooks Is Active Toggle")
	public void disableThirdOrderWebHooksIsActiveToggle() 
	{
		wh.Third_Order_NoToggle.click();
	}


   @And("I Click the Update button in WebHook")
   public void Click_UpdateButton()
   {
	   driver.findElement(By.xpath("//button[contains(.,'UPDATE')]")).click();
   }










}
