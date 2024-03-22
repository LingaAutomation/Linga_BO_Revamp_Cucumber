package StepDefinition;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_StoreInformation_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_StoreInformation 
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_StoreInformation_Page SI = new Settings_StoreInformation_Page();

	@Given("Open the Store Information home page BaseURL and StoreID")
	public void OpenStoreInformationHomePage() throws Exception
	{
		Thread.sleep(5000);
		//Load the Department page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"storeInformation");
	}


	@Given("Verifying the Store Information Header Page")
	public void verifyingTheStoreInformationHeaderPage() throws Exception 
	{
		SI.VerifyStoreInformationPage();
	}

	@Given("Clear the Store Name")
	public void clearTheStoreName()
	{
		SI.StoreName_input.clear();
	}

	@Given("Enter Store Name In Number")
	public void enterStoreNameInNumber()
	{
		//clear the store name
		SI.StoreName_input.clear();

		//Enter the random alpha numeric characters in store name field
		SI.StoreName_input.sendKeys(RandomStringUtils.randomNumeric(20));
	}
	@Then("Verify Store Inofrmation Saved or Not")
	public void verifyStoreInofrmationSavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Store Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Store updated successfully message is displayed after updating the data");
		}
		else
		{
			test.log(LogStatus.FAIL, "Store updated successfully message is not displayed after updating the data");
		}
	}

	@Then("Enter Store Name Exceeding Limit")
	public void enterStoreNameExceedingLimit()
	{
		//clear the store name
		SI.StoreName_input.clear();

		//Enter the random alpha numeric characters in store name field
		SI.StoreName_input.sendKeys(RandomStringUtils.randomAlphanumeric(38));

		//get the value or string of store name field
		int s = SI.StoreName_input.getAttribute("value").length();

		//verify it accepts only 25 or above
		if(s==35) {
			test.log(LogStatus.PASS, "Store Name field accept only the 35 chars");
		}
		else if(s > 35){
			test.log(LogStatus.FAIL, "Store Name field accept more than 35 chars");
		}
	}

	@Then("Enter Store Name In Special Characters")
	public void enterStoreNameInSpecialCharacters() 
	{
		//clear the store name
		SI.StoreName_input.clear();

		//Enter the random alpha numeric characters in store name field
		SI.StoreName_input.sendKeys("#$%$#%%");
	}

	@Then("Enter Store Name In Special Characters and Numbers")
	public void enterStoreNameInSpecialCharactersAndNumbers()
	{
		//clear the store name
		SI.StoreName_input.clear();

		//Enter the random alpha numeric characters in store name field
		SI.StoreName_input.sendKeys("#$%$#123%%");
	}

	@Then("Enter Existing Store Name")
	public void enterExistingStoreName() throws Exception
	{
		//clear the store name
		SI.StoreName_input.clear();

		//Enter the random alpha numeric characters in store name field
		SI.StoreName_input.sendKeys(Utility.getProperty("Store1"));
	}

	@Given("Clear the Store ID")
	public void clearTheStoreID() 
	{
		SI.StoreID_input.clear();
	}
	@Then("Enter Store ID in the Form of Alphabets")
	public void enterStoreIDInTheFormOfAlphabets() 
	{
		SI.StoreID_input.sendKeys(RandomStringUtils.randomAlphabetic(20));
	}

	@Then("Enter Store ID in the Form of Alphabets and Numbers")
	public void enterStoreIDInTheFormOfAlphabetsAndNumbers() 
	{
		SI.StoreID_input.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Then("Enter Store ID Exceeding Limit")
	public void enterStoreIDExceedingLimit() 
	{
		//clear the store name
		SI.StoreID_input.clear();

		//Enter the random alpha numeric characters in store name field
		SI.StoreID_input.sendKeys(RandomStringUtils.randomAlphanumeric(15));

		//get the value or string of store name field
		int s = SI.StoreID_input.getAttribute("value").length();

		//verify it accepts only 25 or above
		if(s==11) {
			test.log(LogStatus.PASS, "Store ID field accept only 11 chars");
		}
		else if(s > 11){
			test.log(LogStatus.FAIL, "Store ID field accept more than 11 chars");
		}
	}

	@Given("Clear the Phone Number Field")
	public void clearThePhoneNumberField()
	{
		SI.PhoneNumber_input.clear();
	}
	@Then("Enter Phone Number Less than six Digits")
	public void enterPhoneNumberLessThanSixDigits()
	{
		SI.PhoneNumber_input.sendKeys("12345");
	}
	@Then("Verify Phone Number Should Be Contain At Least Six Digits error message")
	public void verifyPhoneNumberShouldBeContainAtLeastDigitsErrorMessage() 
	{
		if(driver.findElement(By.xpath("//p[.='Phone Number Should Be Contain At Least 6 Digits']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS, "Phone Number Should Contain atleast 6 Digits Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Phone Number Should Contain Atleast 6 digits Not Displayed");
		}
	}

	@Then("Enter Special Characters in Phone Number Field")
	public void enterSpecialCharactersInPhoneNumberField() 
	{
		SI.PhoneNumber_input.sendKeys("#$%%@%^&");
	}


	@Then("Enter Phone Number Exceeding Limit")
	public void enterPhoneNumberExceedingLimit() throws Exception 
	{
		SI.PhoneNumber_input.sendKeys(Utility.getProperty("Settings_Store_Information_Phone"));

		//get the value or string of store name field
		int s2 =SI.PhoneNumber_input.getAttribute("value").length();

		//verify it accepts only 25 or above
		if(s2==25) {
			test.log(LogStatus.PASS, "Phonenumber field accept only the 25 chars");
		}
		else if(s2 > 25){
			test.log(LogStatus.FAIL, "Phonenumber field accept more than 25 chars");
		}
	}

	@Then("Enter Numbers in Phone Number Field")
	public void enterNumbersInPhoneNumberField()
	{
		SI.PhoneNumber_input.sendKeys("55467788");
	}


	@Given("Clear the Email ID")
	public void clearTheEmailID()
	{
		SI.Email_input.clear();
	}
	@Then("Enter Invalid Email ID")
	public void enterInvalidEmailID()
	{
		SI.Email_input.sendKeys("abc");
	}
	@Then("Verify Please Enter Valid Email Error Message")
	public void verifyPleaseEnterValidEmailErrorMessage() 
	{
		String s = driver.findElement(By.xpath("//p[contains(.,'Please Enter Valid Email')]")).getText();

		if(s.equals("Please Enter Valid Email")) {
			test.log(LogStatus.PASS, "Enter the valid email field validation is displayed, when user enter the alphabets");
		}
		else
		{
			test.log(LogStatus.FAIL, "Wrong field validation message is displayed, when user enter the alphabets only");
		}
	}


	@Then("Enter Valid Email ID")
	public void enterValidEmailID() throws Exception 
	{
		SI.Email_input.sendKeys(Utility.getProperty("Settings_Store_Information_Email"));
	}


	@Given("Clear the Gift Card Email ID")
	public void clearTheGiftCardEmailID()
	{
		SI.GiftCardEmail_input.clear();
	}
	@Then("Enter Invalid Gift Card Email ID")
	public void enterInvalidGiftCardEmailID() 
	{
		SI.GiftCardEmail_input.sendKeys("abc");

		String s = driver.findElement(By.xpath("//p[contains(.,'Please Enter Valid Email')]")).getText();

		if(s.equals("Please Enter Valid Email")) {
			test.log(LogStatus.PASS, "Enter the valid email field validation is displayed, when user enter the alphabets in gift card email");
		}
		else
		{
			test.log(LogStatus.FAIL, "Wrong field validation message is displayed, when user enter the alphabets only in gift card email");
		}
	}

	@Then("Enter Valid Gift Card Email ID")
	public void enterValidGiftCardEmailID()
	{
		SI.GiftCardEmail_input.sendKeys("abc@co.com");
	}

	@Given("Clear the Selected Languages")
	public void clearTheSelectedLanguages() 
	{
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	}


	@Given("Click on Languages Dropdown")
	public void clickOnLanguagesDropdown()
	{
		SI.Language_input.click();
	}
	@Then("Select the Languages")
	public void selectTheLanguages() throws Exception 
	{
		SI.Language_input.click();
//		Thread.sleep(2000);
//
//		List<WebElement> LanguageList=driver.findElements(By.xpath("//div/select-option"));
//
//		int Languages=LanguageList.size();
//
//
//
//		if(Languages>1&&Languages<=6)
//		{
//			Thread.sleep(1000);
//			int randomLanguages=ThreadLocalRandom.current().nextInt(2, Languages);
//
//			//			ServingSizeLevelDropBtn.click();
//
//			if(driver.findElement(By.xpath("//div["+Languages+"]/select-option")).isSelected())
//			{
//
//			}
//			else
//			{
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//div["+Languages+"]/select-option")).click();
//			}
//		}
//		else if(Languages==1)
//		{
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[1]/select-option")).click();
//		}
//		else if(Languages>6)
//		{
//			int randomLanguages1=ThreadLocalRandom.current().nextInt(2, 6);
//			driver.findElement(By.xpath("//div["+randomLanguages1+"]/select-option")).click();
//
//		}
//
//		List<WebElement> randomLanguages1=driver.findElements(By.xpath("//div/select-option"));
//
//		if(randomLanguages1.size()!=0)
//		{
//			SI.Language_input.click();
//		}
		
		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//div["+i+"]/select-option")).click();
		}
	
}


@Given("Click on Default Languages Dropdown")
public void clickOnDefaultLanguagesDrodpown() 
{
	SI.DefaultLaunguage_input.click();
}

@Then("Select Default Language From Dropdown")
public void SelectDefaultLanguage() 
{
	String s = SI.firstLanguage.getText().trim();
	
	//click the first language
	SI.firstLanguage.click();
	
	//verify the language
	String sw = SI.DefaultLaunguage_input.getAttribute("value");
	
	if(s.equals(sw)) {
		test.log(LogStatus.PASS, "The selected default language is displayed after selecting the same language");
	}
	else
	{
		test.log(LogStatus.FAIL, "The selected default language is not displayed after selecting the same language");
	}
	
}

@Given("Clear the Street Name")
public void clearTheStreetName() {
	SI.Street_input.clear();
}
@Then("Enter Street Name in the Form of Numbers")
public void enterStreeNameInTheFormOfNumbers() 
{
	SI.Street_input.sendKeys(RandomStringUtils.randomNumeric(15));
}

@Then("Enter Street Name in the Form of Special Characters")
public void enterStreeNameInTheFormOfSpecialCharacters() 
{
	SI.Street_input.sendKeys("%&&*&");
}

@Then("Enter Street Name Exceeding Limit")
public void enterStreetNameExceedingLimit() 
{
	//Enter the random alpha numeric characters in store name field
	SI.Street_input.sendKeys(RandomStringUtils.randomAlphanumeric(45));

	//get the value or string of store name field
	int s = SI.Street_input.getAttribute("value").length();

	//verify it accepts only 25 or above
	if(s==45) {
		test.log(LogStatus.PASS, "Street field accept only 11 chars");
	}
	else if(s > 45){
		test.log(LogStatus.FAIL, "Street field accept more than 11 chars");
	}
}

@Then("Enter Street Name in the Form of Numbers and alphabets")
public void enterStoreNameInTheFormOfNumbersAndAlphabets() 
{
	SI.Street_input.sendKeys(RandomStringUtils.randomAlphanumeric(45));
}


@Given("Clear Apt and Suite Field")
public void clearAptAndSuiteField() 
{
	SI.Apartment_input.clear();
}
@Then("Enter Apt and Suite Exceeding Limit")
public void enterAptAndSuiteExceedingLimit() 
{
	
	SI.Apartment_input.sendKeys(RandomStringUtils.randomAlphanumeric(45));

	//get the value or string of store name field
	int s = SI.Apartment_input.getAttribute("value").length();

	//verify it accepts only 25 or above
	if(s==45) {
		test.log(LogStatus.PASS, "Apartment field accept only 45 chars");
	}
	else if(s > 45){
		test.log(LogStatus.FAIL, "Apartment field accept more than 45 chars");
	}
}

@Then("Enter Apt and Suite in the Form of Numbers and alphabets")
public void enterAptAndSuiteInTheFormOfNumbersAndAlphabets() 
{
	SI.Apartment_input.sendKeys(RandomStringUtils.randomAlphanumeric(30));
}


@Given("Clear the City Field")
public void clearTheCityField() 
{
	SI.City_input.clear();
}
@Given("Enter City in the Form of Numbers")
public void enterCityInTheFormOfNumbers()
{
	SI.City_input.sendKeys(RandomStringUtils.randomAlphanumeric(20));
}

@Then("Enter City Exceeding the Limit")
public void enterCityExceedingTheLimit()
{
	SI.City_input.sendKeys(RandomStringUtils.randomAlphanumeric(45));

	//get the value or string of store name field
	int s = SI.City_input.getAttribute("value").length();

	//verify it accepts only 25 or above
	if(s==45) {
		test.log(LogStatus.PASS, "City field accept only 45 chars");
	}
	else if(s > 45){
		test.log(LogStatus.FAIL, "City field accept more than 45 chars");
	}
}


@Then("Enter City in the Form of Numbers and alphabets")
public void enterCityInTheFormOfNumbersAndAlphabets()
{
	SI.City_input.sendKeys(RandomStringUtils.randomAlphanumeric(25));
}


@Given("Clear the State Field")
public void clearTheStateField() 
{
	SI.State_input.clear();
}
@Given("Enter State in the Form of Numbers")
public void enterStateInTheFormOfNumbers() 
{
	SI.State_input.sendKeys(RandomStringUtils.randomNumeric(30));
}

@Then("Enter State Exceeding the Limit")
public void enterStateExceedingTheLimit()
{
	SI.State_input.sendKeys(RandomStringUtils.randomAlphanumeric(45));

	//get the value or string of store name field
	int s = SI.State_input.getAttribute("value").length();

	//verify it accepts only 25 or above
	if(s==25) {
		test.log(LogStatus.PASS, "State field accept only 25 chars");
	}
	else if(s > 25){
		test.log(LogStatus.FAIL, "State field accept more than 25 chars");
	}
}

@Then("Enter State in the form of Special Characters")
public void enterStateInTheFormOfSpecialCharacters() 
{
	SI.State_input.sendKeys("%^$%^&");
}

@Then("Enter State in the Form of Numbers and alphabets")
public void enterStateInTheFormOfNumbersAndAlphabets() 
{
	SI.State_input.sendKeys(RandomStringUtils.randomAlphanumeric(30));
}


@Given("Clear the ZipCode Field")
public void clearTheZipCodeField() 
{
	SI.ZipCode_input.clear();
}
@Then("Enter Zipcode Less than Four digits")
public void enterZipcodeLessThaDigits()
{
	SI.ZipCode_input.sendKeys("453");
}
@Then("verify ZipCode should be Four To Ten characters Error Message")
public void verifyZipCodeShouldBeToCharactersErrorMessage() 
{
	//get the field validation message
			String sd = driver.findElement(By.xpath("//mat-hint[contains(.,'ZipCode')]")).getText();
			
			if(sd.equals("ZipCode should be 4 to 10 characters")) {
				test.log(LogStatus.PASS, "ZipCode should be 4 to 10 characters field validation message is displayed when user enter the 3 characters in zipcode");
			}
			else {
				test.log(LogStatus.FAIL, "ZipCode should be 4 to 10 characters field validation message is not displayed when user enter the 3 characters in zipcode");
			}
			
}

@Then("Enter Zipcode in the form of Special characters")
public void enterZipcodeInTheFormOfSpecialCharacters() 
{
	SI.ZipCode_input.sendKeys("%^^$%%&*");
}

@Then("Enter Zipcode in the form of alphabets and Numbers")
public void enterZipcodeInTheFormOfAlphabetsAndNumbers() 
{
	SI.ZipCode_input.sendKeys(RandomStringUtils.randomAlphanumeric(25));
}

@Given("Click on Time Zone from Dropdown")
public void ClickTimeZoneDropdown() 
{
  SI.TimeZone_input.click();
}
@Then("Select the Time Zone from Dropdown")
public void selectTheTimeZoneFromDropdown() 
{
	SI.Search_input.sendKeys("GMT+05:30");
	
	SI.firstLanguage.click();
}


@And("I Click the Save button in Store Information")
public void ClickSaveBUttonInStoreInformation() throws Exception
{
	if(driver.findElement(By.xpath("//span[contains(.,' SAVE ')]")).isEnabled()) 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,' SAVE ')]")).click();
	}
}

}
