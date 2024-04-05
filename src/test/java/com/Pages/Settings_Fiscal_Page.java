package com.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class Settings_Fiscal_Page extends BasePage
{
//	SelfHealingDriver driver;
//	ExtentTest test;
	Common_XPaths cmp;
	Utility ut=new Utility();
	
	public String VKN_No;
	
//	public Settings_Fiscal_Page(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver, test);
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//h3[.='Fiscal']")
	WebElement Fiscal_Heading;
	
	@FindBy(xpath = "//div[contains(.,'SETTINGS') and contains(@class,'mat-tab-label-content')]")
	WebElement Settings_Heading;
	
	@FindBy(xpath = "//div[contains(.,'FISCAL LIST') and contains(@class,'mat-tab-label-content')]")
	public WebElement FiscalList_Heading;
	
	@FindBy(xpath = "//button[contains(.,'NEW FISCAL SETTINGS')]")
	public WebElement New_Fiscal_Settings_Button;
	
	@FindBy(xpath = "//h3[contains(.,'New Fiscal Settings')]")
	public WebElement NewFiscal_Heading;
	
	@FindBy(xpath = "//h3[contains(.,'Update Fiscal Settings')]")
	public WebElement UpdateFiscal_Heading;
	
	@FindBy(xpath = "//label[contains(.,'Select Country')]/../../input")
	public WebElement Select_CountryInputBx;
	
	@FindBy(xpath = "//input[@aria-label='VKN']")
	public WebElement VKN_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='SCL No.']")
	public WebElement SCL_No_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Tax Office Name']")
	public WebElement Tax_Office_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Street Name']")
	public WebElement Street_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Building Name']")
	public WebElement Building_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='City Subdivision Name']")
	public WebElement City_Subdivision_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='City Name']")
	public WebElement City_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Postal Zone']")
	public WebElement Postal_Zone_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Region']")
	public WebElement Region_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='District']")
	public WebElement District_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Country Name']")
	public WebElement Country_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Select Provider']")
	public WebElement Select_Provider_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='User Name']")
	public WebElement User_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	public WebElement Password_InputBx;
	
	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	WebElement Cancel;
	
	@FindBy(xpath = "//div[@class='col-auto']/button[contains(.,'Cancel')] ")
	WebElement Cancel1;
	
	@FindBy(xpath = "//span[contains(.,'Close') and @class='mat-button-wrapper']")
	WebElement Close;
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	WebElement Save;
	
	@FindBy(xpath = "//button[contains(.,'Update')]")
	WebElement Update;
	
	@FindBy(xpath = "//button[contains(.,'Save') and @disabled='true']")
	WebElement SaveDisabled;
	
	@FindBy(xpath = "//button[contains(.,'Update') and @disabled='true']")
	WebElement UpdateDisabled;
	
	@FindBy(xpath = "//th[contains(.,'Country')]")
	public WebElement Country_Column;
	
	@FindBy(xpath = "//th[contains(.,'Provider')]")
	public WebElement Provider_Column;
	
	@FindBy(xpath = "//th[contains(.,'VKN Type')]")
	public WebElement VKN_Type_Column;
	
	@FindBy(xpath = "//th[contains(.,'SCL No.')]")
	public WebElement SCL_No_Column;
	
	@FindBy(xpath = "//div[contains(@class,'grid-column')]/span[contains(.,'Check ID')]")
	public WebElement CheckID_Column;
	
	@FindBy(xpath = "//div[contains(@class,'grid-column')]/span[contains(.,'Date')]")
	public WebElement Date_Column;
	
	@FindBy(xpath = "//div[contains(@class,'grid-column')]/span[contains(.,'Total')]")
	public WebElement Total_Column;
	
	@FindBy(xpath = "//div[contains(@class,'grid-column')]/span[contains(.,'Send')]")
	public WebElement Send_Column;
	
	@FindBy(xpath = "//input[@data-placeholder='Search']")
	WebElement Search;
	
	@FindBy(xpath = "//button[contains(.,'COLUMNS')]")
	WebElement Columns;
	
	@FindBy(xpath = "//span[contains(.,'Rows per page:')]")
	WebElement RowsPerPage;
	
	@FindBy(xpath =  "//button[@aria-label='edit']")
	WebElement EditBtn;
	
	@FindBy(xpath =  "//button[@aria-label='delete']")
	WebElement DeleteBtn;
	
	@FindBy(xpath =  "//span[contains(.,'Delete')]/../../button")
	WebElement Delete_btn;
	
	@FindBy(xpath =  "//div[contains(@class,'action-col')]/div/button")
	WebElement DeleteBtn1;
	
	@FindBy(xpath = "//button[contains(@class,'segment-button')][contains(.,'FISCAL LIST')]")
	public WebElement Fiscal_SettingsTab;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'SCL No. already exists')]")
	public WebElement SCL_No_Already_Exist_ErrorMsg;
	
	public void verifyFiscalPage() throws Exception {
		try {
			if(Fiscal_Heading.isDisplayed()) {
				test.log(LogStatus.PASS, "Fiscal Heading is displayed successfully");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Fiscal Heading is not displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try {
			if(Settings_Heading.isDisplayed()) {
				test.log(LogStatus.PASS, "Settings tab is displayed successfully");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Settings tab is not displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try {
			if(FiscalList_Heading.isDisplayed()) {
				test.log(LogStatus.PASS, "Fiscal List tab is displayed successfully");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Fiscal List tab is not displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}

		try {
			if(New_Fiscal_Settings_Button.isDisplayed()) {
				test.log(LogStatus.PASS, "New Fiscal Settings button is displayed successfully");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "New Fiscal Settings button is not displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}

		try {
			if(Country_Column.isDisplayed()) {
				test.log(LogStatus.PASS, "Country Column is displayed successfully when user in the Settings tab");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Country Column is not displayed when user in the Settings tab");
			ut.FailedCaptureScreenshotAsBASE64();
		}

		try {
			if(Provider_Column.isDisplayed()) {
				test.log(LogStatus.PASS, "Provider Column is displayed successfully when user in the Settings tab");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Provider Column is not displayed when user in the Settings tab");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try {
			if(VKN_Type_Column.isDisplayed()) {
				test.log(LogStatus.PASS, "VKN Type Column is displayed successfully when user in the Settings tab");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "VKN Type Column is not displayed when user in the Settings tab");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try {
			if(SCL_No_Column.isDisplayed()) {
				test.log(LogStatus.PASS, "SCL No Column is displayed successfully when user in the Settings tab");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "SCL No Column is not displayed when user in the Settings tab");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		FiscalList_Heading.click();
		Thread.sleep(2000);
		
		try {
			if(CheckID_Column.isDisplayed()) {
				test.log(LogStatus.PASS, "Check ID Column is displayed successfully when user in the Fiscal List tab");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Check ID Column is not displayed when user in the Fiscal List tab");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try {
			if(Date_Column.isDisplayed()) {
				test.log(LogStatus.PASS, "Date Column is displayed successfully when user in the Fiscal List tab");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Date Column is not displayed when user in the Fiscal List tab");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try {
			if(Total_Column.isDisplayed()) {
				test.log(LogStatus.PASS, "Total Column is displayed successfully when user in the Fiscal List tab");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Total Column is not displayed when user in the Fiscal List tab");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try {
			if(Send_Column.isDisplayed()) {
				test.log(LogStatus.PASS, "Send Column is displayed successfully when user in the Fiscal List tab");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Send Column is not displayed when user in the Fiscal List tab");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Settings_Heading.click();
		Thread.sleep(2000);
	}
	
	public void AddFiscal() throws Exception {
		Thread.sleep(2000);
		
		//Click the new fiscal settings
		New_Fiscal_Settings_Button.click();
		
		//Check weather the save button is disabled or not
		Thread.sleep(500);
		try {
			if(SaveDisabled.isDisplayed()) {
				test.log(LogStatus.PASS, "Save button is disabled when user not update the mandatory fields in the New Fiscal Settings Page");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Save button is enabled when user not update the mandatory fields in the New Fiscal Settings Page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		//Click the cancel button
		Cancel.click();
		
		Thread.sleep(2000);
		
		//Click the new fiscal settings
		New_Fiscal_Settings_Button.click();
		
		//check the new fiscal settings heading availability 
		Thread.sleep(1500);
		try {
			if(NewFiscal_Heading.isDisplayed()) {
				test.log(LogStatus.PASS, "New Fiscal heading is displayed when user click the new fiscal settings button");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "New Fiscal heading is not displayed when user click the new fiscal settings button");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		//click the select country option
		Thread.sleep(1000);
		Select_CountryInputBx.click();
		Thread.sleep(1000);
		
//		//get the list of countries
//		List<WebElement> CountryList=driver.findElements(By.xpath("//select-option"));
//		
//		//get the country count
//		int CountrySize=CountryList.size();
//		
//		//Select the random value 
//		int randomCountry=ThreadLocalRandom.current().nextInt(0, CountrySize);
//		
//		//click the random country
//		driver.findElement(By.xpath("//div[" + randomCountry + "]/select-option")).click();
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
			
		Thread.sleep(2000);
		//enter the value in VKN field
		VKN_InputBx.sendKeys("aeiouaeiou");
		
		//get the value of VKN field
		String s = VKN_InputBx.getAttribute("value");
		
		//verify the entered value is available or not
		if(s.equals("aeiouaeiou")) {
			test.log(LogStatus.FAIL, "VKN field accepts albhapetic characters");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(s.equals("")) {
			test.log(LogStatus.PASS, "VKN field not accepts albhapetic characters");
		}
		
		//enter the numeric value in VKN field
		VKN_InputBx.sendKeys(RandomStringUtils.randomNumeric(15));
		
		//get the count of VKN field value
		int s1 = VKN_InputBx.getAttribute("value").length();
		
		//verify the length of the string in VKN field
		if(s1 == 15) {
			test.log(LogStatus.FAIL, "VKN field accepts more than 10 digits and the count is "+s1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(s1 == 10) {
			test.log(LogStatus.PASS, "VKN field accepts only 10 digits");
			VKN_No = VKN_InputBx.getAttribute("value");
		}
		else if(s1 < 10) {
			test.log(LogStatus.FAIL, "VKN field accepts less than 10 digits and the count is "+s1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		//enter the value in SCL field
		SCL_No_InputBx.sendKeys("aeiouaeiou");
		
		String sa = SCL_No_InputBx.getAttribute("value");
		
		if(sa.equals("aeiouaeiou")) {
			test.log(LogStatus.FAIL, "SCL No field accepts albhapetic characters");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sa.equals("")) {
			test.log(LogStatus.PASS, "SCL No field not accepts albhapetic characters");
		}
		
		SCL_No_InputBx.sendKeys(RandomStringUtils.randomNumeric(25));
		
		int sa1 = SCL_No_InputBx.getAttribute("value").length();
		
		if(sa1 == 25) {
			test.log(LogStatus.FAIL, "SCL No field accepts more than 20 digits and the count is "+sa1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sa1 == 20) {
			test.log(LogStatus.PASS, "SCL No field accepts only 20 digits");
		}
		else if(sa1 < 20) {
			test.log(LogStatus.FAIL, "SCL No field accepts less than 20 digits and the count is "+sa1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Tax_Office_Name_InputBx.sendKeys(RandomStringUtils.randomAlphanumeric(55));
		
		int sb1 = Tax_Office_Name_InputBx.getAttribute("value").length();
		
		if(sb1 == 55) {
			test.log(LogStatus.FAIL, "Tax Office Name field accepts more than 50 Charactors and the count is "+sb1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sb1 == 50) {
			test.log(LogStatus.PASS, "Tax Office Name field accepts only 50 Charactors");
		}
		else if(sb1 < 50) {
			test.log(LogStatus.FAIL, "Tax Office Name field accepts less than 50 Charactors and the count is "+sb1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		
		Street_Name_InputBx.sendKeys(RandomStringUtils.randomAlphanumeric(105));
		
		int sc1 = Street_Name_InputBx.getAttribute("value").length();
		
		if(sc1 == 105) {
			test.log(LogStatus.FAIL, "Street Name field accepts more than 100 Charactors and the count is "+sc1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sc1 == 100) {
			test.log(LogStatus.PASS, "Street Name field accepts only 100 Charactors");
		}
		else if(sc1 < 100) {
			test.log(LogStatus.FAIL, "Street Name field accepts less than 100 Charactors and the count is "+sc1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Building_Name_InputBx.sendKeys(RandomStringUtils.randomAlphanumeric(55));
		
		int sd1 = Building_Name_InputBx.getAttribute("value").length();
		
		if(sd1 == 55) {
			test.log(LogStatus.FAIL, "Building Name field accepts more than 50 Charactors and the count is "+sd1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sd1 == 50) {
			test.log(LogStatus.PASS, "Building Name field accepts only 50 Charactors");
		}
		else if(sd1 < 50) {
			test.log(LogStatus.FAIL, "Building Name field accepts less than 50 Charactors and the count is "+sd1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		City_Subdivision_InputBx.sendKeys(RandomStringUtils.randomAlphanumeric(55));
		
		int se1 = City_Subdivision_InputBx.getAttribute("value").length();
		
		if(se1 == 55) {
			test.log(LogStatus.FAIL, "City Subdivision field accepts more than 50 Charactors and the count is "+se1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(se1 == 50) {
			test.log(LogStatus.PASS, "City Subdivision field accepts only 50 Charactors");
		}
		else if(se1 < 50) {
			test.log(LogStatus.FAIL, "City Subdivision field accepts less than 50 Charactors and the count is "+se1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		City_Name_InputBx.sendKeys(RandomStringUtils.randomAlphanumeric(25));
		
		int sf1 = City_Name_InputBx.getAttribute("value").length();
		
		if(sf1 == 25) {
			test.log(LogStatus.FAIL, "City Name field accepts more than 20 Charactors and the count is "+sf1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sf1 == 20) {
			test.log(LogStatus.PASS, "City Name field accepts only 20 Charactors");
		}
		else if(sf1 < 20) {
			test.log(LogStatus.FAIL, "City Name field accepts less than 20 Charactors and the count is "+sf1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		
		Postal_Zone_InputBx.sendKeys(RandomStringUtils.randomAlphanumeric(25));
		
		int sf2 = Postal_Zone_InputBx.getAttribute("value").length();
		
		if(sf2 == 25) {
			test.log(LogStatus.FAIL, "Postal Zone field accepts more than 20 Charactors and the count is "+sf2);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sf2 == 20) {
			test.log(LogStatus.PASS, "Postal Zone field accepts only 20 Charactors");
		}
		else if(sf2 < 20) {
			test.log(LogStatus.FAIL, "Postal Zone field accepts less than 20 Charactors and the count is "+sf2);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Region_InputBx.sendKeys(RandomStringUtils.randomAlphabetic(25));
		
		int sf3 = Region_InputBx.getAttribute("value").length();
		
		if(sf3 == 25) {
			test.log(LogStatus.FAIL, "Region field accepts more than 20 Charactors and the count is "+sf3);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sf3 == 20) {
			test.log(LogStatus.PASS, "Region field accepts only 20 Charactors");
		}
		else if(sf3 < 20) {
			test.log(LogStatus.FAIL, "Region field accepts less than 20 Charactors and the count is "+sf3);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		District_InputBx.sendKeys(RandomStringUtils.randomAlphabetic(25));
		
		int sf4 = District_InputBx.getAttribute("value").length();
		
		if(sf4 == 25) {
			test.log(LogStatus.FAIL, "District field accepts more 20 Charactors and the count is "+sf4);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sf4 == 20) {
			test.log(LogStatus.PASS, "District field accepts only 20 Charactors");
		}
		else if(sf4 < 20) {
			test.log(LogStatus.FAIL, "District field accepts less than 20 Charactors and the count is "+sf4);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Country_Name_InputBx.sendKeys(RandomStringUtils.randomAlphabetic(25));
		
		int sf5 = Country_Name_InputBx.getAttribute("value").length();
		
		if(sf5 == 25) {
			test.log(LogStatus.FAIL, "Country Name field accepts more than 20 Charactors and the count is "+sf5);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(sf5 == 20) {
			test.log(LogStatus.PASS, "Country Name field accepts only 20 Charactors");
		}
		else if(sf5 < 20) {
			test.log(LogStatus.FAIL, "Country Name field accepts less than 20 Charactors and the count is "+sf5);
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Thread.sleep(1000);
		Select_Provider_InputBx.click();
		Thread.sleep(1000);
//		List<WebElement> sp =driver.findElements(By.xpath("//select-option"));
//		
//		int sp1 =sp.size();
//		
//		
//		int randomsp =ThreadLocalRandom.current().nextInt(0, sp1);
//		
//		
//		driver.findElement(By.xpath("//div[" + randomsp + "]/select-option")).click();
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
			
		Thread.sleep(2000);
		
		//clear the user name field
		//UserName.clear();
		
		//Enter the Valid User Name
		//UserName.sendKeys("Test User Name");
		
		//Clear the Password
		//Password.clear();
		
		//Enter the Valid Password
		//Password.sendKeys("Abcd@1234");
		
		
		Thread.sleep(3000);
		
		//Click the Save button
		Save.click();
		
		Thread.sleep(1000);
		
	}

	
	public void EditFiscal() throws Exception {
		
		Thread.sleep(1000);
		//click the new fiscal
		EditBtn.click();
		
		
		Thread.sleep(2000);
		
		//Check weather the save button is disabled or not
		Thread.sleep(500);
		try {
			if(UpdateDisabled.isDisplayed()) {
				test.log(LogStatus.PASS, "Update button is disabled when user not update any fields in the edit Fiscal Settings Page");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Update button is enabled when user not update any fields in the edit Fiscal Settings Page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		//Click the cancel button
		Cancel.click();
		
		Thread.sleep(2000);
		
		//click the new fiscal
		EditBtn.click();
		
		//check the new fiscal settings heading availability 
		Thread.sleep(1500);
		try {
			if(UpdateFiscal_Heading.isDisplayed()) {
				test.log(LogStatus.PASS, "Update Fiscal heading is displayed when user click the edit fiscal button");
			}
		}catch(Exception s) {
			test.log(LogStatus.FAIL, "Update Fiscal heading is not displayed when user click the edit fiscal button");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		VKN_InputBx.click();
		
		for(int i = 1; i <=10;i++) {
			VKN_InputBx.sendKeys(Keys.ARROW_RIGHT);
		}VKN_InputBx.sendKeys(Keys.BACK_SPACE);
		
		VKN_InputBx.sendKeys("1");
		
		Thread.sleep(2000);
		
		//Click the update button
		Update.click();
		
		Thread.sleep(1000);
		
	}
	
	public void delete() throws Exception {
		DeleteBtn.click();
		
		if(driver.findElement(By.xpath("//h4[.='Delete']")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Delete Confirmation popup is displayed, while click the delete button");
		}
		else
		{
			test.log(LogStatus.FAIL, "Delete Confirmation popup is not displayed, while click the delete button");
		}
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(2000);
		DeleteBtn.click();
		
		if(driver.findElement(By.xpath("//h4[.='Delete']")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Delete Confirmation popup is displayed, while click the delete button");
		}
		else
		{
			test.log(LogStatus.FAIL, "Delete Confirmation popup is not displayed, while click the delete button");
		}
		Thread.sleep(2000);
		Cancel1.click();
		Thread.sleep(2000);
		DeleteBtn.click();Thread.sleep(1000);
		
		if(driver.findElement(By.xpath("//h4[.='Delete']")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Delete Confirmation popup is displayed, while click the delete button");
		}
		else
		{
			test.log(LogStatus.FAIL, "Delete Confirmation popup is not displayed, while click the delete button");
		}
		
		Delete_btn.click();
		Thread.sleep(2000);
		
		String s1 = driver.findElement(By.xpath("//div[@class='message mx-2']/span")).getText();
		Thread.sleep(500);
		//Check whether the error message is displayed
		if(s1.equals("Fiscal Settings Removed Successfully."))
		{
			test.log(LogStatus.PASS, "Fiscal Settings Removed Successfully message is displayed when user delete the Fiscal");
		}
		else
		{
			test.log(LogStatus.FAIL, "Fiscal Settings Removed Successfully message is not displayed when user delete the Fiscal");
		}
	}
	
	public void delete_FiscalList() throws Exception {
		
		FiscalList_Heading.click();
		Thread.sleep(2000);
		
		try {
			if(driver.findElement(By.xpath("//span[contains(.,'Fiscal List not found')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Fiscal is not found");
			}
		}catch(Exception d) {
			
			Thread.sleep(1000);
			List<WebElement> sp =driver.findElements(By.xpath("//div[@id='data-grid']/div/div/div/data-grid-row/div/div[1]/span"));
			
			int sp1 =sp.size();
			
			
			int randomsp =ThreadLocalRandom.current().nextInt(1, sp1);
			
			String sd = driver.findElement(By.xpath("//div[@id='data-grid']/div/div["+randomsp+"]/div/data-grid-row/div/div[1]/span")).getText();
			
			
			for(int i = 1; i <=10; i++) {driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.BACK_SPACE);}
			
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(sd);
			Thread.sleep(2000);
			
			//click the delete button
			DeleteBtn1.click();
			
			if(driver.findElement(By.xpath("//h4[.='Delete']")).isDisplayed())
			{
				test.log(LogStatus.PASS, "Delete Confirmation popup is displayed, while click the delete button");
			}
			else
			{
				test.log(LogStatus.FAIL, "Delete Confirmation popup is not displayed, while click the delete button");
			}
			Thread.sleep(2000);
			Close.click();
			Thread.sleep(2000);
			DeleteBtn1.click();
			
			if(driver.findElement(By.xpath("//h4[.='Delete']")).isDisplayed())
			{
				test.log(LogStatus.PASS, "Delete Confirmation popup is displayed, while click the delete button");
			}
			else
			{
				test.log(LogStatus.FAIL, "Delete Confirmation popup is not displayed, while click the delete button");
			}
			Thread.sleep(2000);
			Cancel1.click();
			
			//click the delete button
			DeleteBtn1.click();
			Thread.sleep(2000);
			
			Delete_btn.click();

			
			Thread.sleep(2000);
			
			String s1 = driver.findElement(By.xpath("//div[@class='message mx-2']/span")).getText();
			Thread.sleep(500);
			//Check whether the error message is displayed
			if(s1.equals("Fiscal List Removed Successfully."))
			{
				test.log(LogStatus.PASS, "Fiscal List Removed Successfully message is displayed when user delete the Fiscal");
			}
			else
			{
				test.log(LogStatus.FAIL, "Fiscal List Removed Successfully message is not displayed when user delete the Fiscal");
			}
			
			Thread.sleep(5000);
			for(int i = 1; i <=10; i++) {driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.BACK_SPACE);}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(sd);
			Thread.sleep(4000);
			
			if(driver.findElement(By.xpath("//span[contains(.,'Fiscal List not found')]")).isDisplayed())
			{
				test.log(LogStatus.PASS, "Fiscal is not found message is displayed after delete the Fiscal List");
			}
			else
			{
				test.log(LogStatus.FAIL, "Fiscal is not found message is not displayed after delete the Fiscal List");
			}
		}
		

		
	}

}
