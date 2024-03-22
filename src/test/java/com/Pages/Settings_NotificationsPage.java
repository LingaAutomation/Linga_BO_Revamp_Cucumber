package com.Pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import StepDefinition.LoginTest;
import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_NotificationsPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	 
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	CategoriesPage ctp=new CategoriesPage();
	DepartmentPage dp=new DepartmentPage();
	CoursingPage cp=new CoursingPage();
	ServingSizeLevelsPage ssl=new ServingSizeLevelsPage();
	KitchenPrinterPage kp=new KitchenPrinterPage();
	ProductItems_Menu_RetailPage pmt=new ProductItems_Menu_RetailPage();
	UpchargesPage up=new UpchargesPage();
	SubCategoriesPage scp=new SubCategoriesPage();
	
	@FindBy(xpath = "//div[@class='settings']")
	public WebElement Settings;

	@FindBy(xpath = "//span[.='Notifications']")
	public WebElement Notifications;
	
	@FindBy(xpath = "//span[.='Discount']")
	public WebElement DiscountFieldText;
	
	@FindBy(xpath = "//span[.='Void']")
	public WebElement VoidFieldText;
	
	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']")
	public WebElement MaxNoCashDrawerAccessedForNoSaleFieldText;
	
	@FindBy(xpath = "//span[.='Time Clock']")
	public WebElement TimeClockFieldText;
	
	@FindBy(xpath = "//span[.='Daily KPI']")
	public WebElement DailyKPIFieldText;
	
	@FindBy(xpath = "//span[.='End Of the Day Alert ']")
	public WebElement EndOftheDayAlertFieldText;
	
	@FindBy(xpath = "//span[.='Wait List']")
	public WebElement WaitListFieldText;
	
	@FindBy(xpath = "//span[.='Sale Recap Report ']")
	public WebElement SaleRecapReportFieldText;
	
	@FindBy(xpath = "//span[.='One Page PDF']")
	public WebElement OnePagePDFFieldText;
	
	@FindBy(xpath = "//span[.='Offline Payment']")
	public WebElement OfflinePaymentFieldText;
	

	@FindBy(xpath = "//span[.='Discount']/../..//button[.='Yes']")
	public WebElement Discount_YesToggle;

	@FindBy(xpath = "//span[.='Discount']/../..//button[.='No']")
	public WebElement Discount_NoToggle;

	@FindBy(xpath = "//span[.='Discount']/../../div/div/div/div/app-currency-input/div//input")
	public WebElement Discount_Limit_Textbox;

	@FindBy(xpath = "//span[.='Discount']/../../div[3]/div/div/app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement Discount_TextMsg;

	@FindBy(xpath = "//span[.='Discount']/../../div[3]/div/div/app-checkbox[2]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement Discount_EmailTextMsg;
	
	@FindBy(xpath = "//span[.='Discount']/../../div[3]/div/div/app-checkbox[1]/div/mat-checkbox/label")
	public WebElement Discount_TextMsgs_Checkbox;

	@FindBy(xpath = "//span[.='Discount']/../../div[3]/div/div/app-checkbox[2]/div/mat-checkbox/label")
	public WebElement Discount_Emails_Checkbox;

	@FindBy(xpath = "//span[.='Discount']/../../div[3]/div/div[4]/div/div/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Phone')]/../input")
	public WebElement Discount_Phone_no;

	@FindBy(xpath = "//span[.='Discount']/../../div[3]/div/div[4]/div/div/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement Discount_Email;

	@FindBy(xpath = "//span[.='Void']/../..//button[.='Yes']")
	public WebElement Void_YesToggle;

	@FindBy(xpath = "//span[.='Void']/../..//button[.='No']")
	public WebElement Void_NoToggle;

	@FindBy(xpath = "//mat-label[.=' Void Limit ']/../../../input")
	public WebElement Void_Limit;
	
	@FindBy(xpath = "//span[.='Void']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement Void_TextMsg;

	@FindBy(xpath = "//span[.='Void']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement Void_EmailMsg;

	@FindBy(xpath = "//span[.='Void']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement Void_TextMsgs_CheckBox;

	@FindBy(xpath = "//span[.='Void']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label")
	public WebElement Void_EmailMsgs_CheckBox;

	@FindBy(xpath = "//span[.='Void']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Phone')]/../input")
	public WebElement Void_Phoneno;

	@FindBy(xpath = "//span[.='Void']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement Void_Email;

	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']/../..//button[.='Yes']")
	public WebElement CashDrawer_YesToggle;

	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']/../..//button[.='No']")
	public WebElement CashDrawer_NoToggle;
	
	@FindBy(xpath = "//mat-label[.=' Limit ']/../../../input")
	public WebElement Cashdrawer_Limit;
	
	@FindBy(xpath = "//span[.=' Enter valid limit and it should be between -1 to 1000 ']")
	public WebElement Cashdrawer_LimitError;

	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement Cash_PhoneMsg;
	
	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement Cash_TextMsgs_CheckBox;

	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement Cash_EmailMsg;
	
	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label")
	public WebElement Cash_EmailMsgs_CheckBox;

	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Phone')]/../input")
	public WebElement CashDrawer_Phoneno;

	@FindBy(xpath = "//span[.='Max No Cash Drawer Accessed For No Sale']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement CashDrawer_Email;


	@FindBy(xpath = "//button[.='arrow_drop_up']")
	public WebElement Arrow_Up;

	@FindBy(xpath = "//button[.='arrow_drop_down']")
	public WebElement Arrow_down;

	@FindBy(xpath = "//span[.='Time Clock']/../..//button[.='Yes']")
	public WebElement TimeClock_YesToggle;

	@FindBy(xpath = "//span[.='Time Clock']/../..//button[.='No']")
	public WebElement TimeClock_NoToggle;

	@FindBy(xpath = "//span[.='Time Clock']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement TimeClock_PhoneMsg;

	@FindBy(xpath = "//span[.='Time Clock']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement TimeClock_EmailMsg;
	
	@FindBy(xpath = "//span[.='Time Clock']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement TimeClock_PhoneMsgs_CheckBox;

	@FindBy(xpath = "//span[.='Time Clock']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label")
	public WebElement TimeClock_EmailMsgs_CheckBox;

	@FindBy(xpath = "//span[.='Time Clock']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Phone')]/../input")
	public WebElement TimeClock_Phone;

	@FindBy(xpath = "//span[.='Time Clock']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement TimeClock_Email;

	@FindBy(xpath = "//span[.='Daily KPI']/../..//button[.='Yes']")
	public WebElement KPI_YesToggle;

	@FindBy(xpath = "//span[.='Daily KPI']/../..//button[.='No']")
	public WebElement KPI_NoToggle;

	@FindBy(xpath = "//span[.='Daily KPI']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement KPI_PhoneMsg;

	@FindBy(xpath = "//span[.='Daily KPI']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement KPI_EmailMsg;
	
	@FindBy(xpath = "//span[.='Daily KPI']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement KPI_PhoneMsgs_CheckBox;

	@FindBy(xpath = "//span[.='Daily KPI']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label")
	public WebElement KPI_EmailMsgs_CheckBox;

	@FindBy(xpath = "//span[.='Daily KPI']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement KPI_Email;

	@FindBy(xpath = "//span[.='Daily KPI']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Phone')]/../input")
	public WebElement KPI_Phone;

	@FindBy(xpath = "//span[.='End Of the Day Alert ']/../..//button[.='Yes']")
	public WebElement EOD_YesToggle;

	@FindBy(xpath = "//span[.='End Of the Day Alert ']/../..//button[.='No']")
	public WebElement EOD_NoToggle;

	@FindBy(xpath = "//span[.='End Of the Day Alert ']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement EOD_PhoneMsg;

	@FindBy(xpath = "//span[.='End Of the Day Alert ']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement EOD_EmailMsg;
	
	@FindBy(xpath = "//span[.='End Of the Day Alert ']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement EOD_PhoneMsgs_CheckBox;

	@FindBy(xpath = "//span[.='End Of the Day Alert ']/../../div[3]/div/div//app-checkbox[2]/div/mat-checkbox/label")
	public WebElement EOD_EmailMsgs_CheckBox;

	@FindBy(xpath = "//span[.='End Of the Day Alert ']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Phone')]/../input")
	public WebElement EOD_Phoneno;

	@FindBy(xpath = "//span[.='End Of the Day Alert ']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement EOD_Email;

	@FindBy(xpath = "//span[.='Wait List']/../..//button[.='Yes']")
	public WebElement Wait_List_YesToggle;
	
	@FindBy(xpath = "//span[.='Wait List']/../../div/div/div/div/app-input/div/div/mat-form-field/div/div/div[4]/input")
	public WebElement Wait_List_Text;

	@FindBy(xpath = "//span[.='Wait List']/../..//button[.='No']")
	public WebElement Wait_List_NoToggle;

	@FindBy(xpath = "//span[.='Wait List']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement WaitList_PhoneMsg;
	
	@FindBy(xpath = "//span[.='Wait List']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement WaitList_PhoneMsgs_CheckBox;
	
	@FindBy(xpath = "//span[.='Wait List']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Phone')]/../input")
	public WebElement WaitList_Phone;
	
	@FindBy(xpath = "//span[.='Sale Recap Report ']/../..//button[.='Yes']")
	public WebElement SRR_YesToggle;
	
	@FindBy(xpath = "//span[.='Sale Recap Report ']/../..//button[.='No']")
	public WebElement SRR_NoToggle;
	
	@FindBy(xpath = "//span[.='Sale Recap Report ']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement SRR_EmailMsg;
	
	@FindBy(xpath = "//span[.='Sale Recap Report ']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement SRR_EmailMsgs_CheckBox;
	
	@FindBy(xpath = "//span[.='Sale Recap Report ']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement SRR_Email;
	
	@FindBy(xpath = "//span[.='One Page PDF']/../..//button[.='Yes']")
	public WebElement OPP_YesToggle;
	
	@FindBy(xpath = "//span[.='One Page PDF']/../..//button[.='No']")
	public WebElement OPP_NoToggle;
	
	@FindBy(xpath = "//span[.='One Page PDF']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement OPP_EmailMsg;
	
	@FindBy(xpath = "//span[.='One Page PDF']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement OPP_EmailMsgs_CheckBox;
	
	@FindBy(xpath = "//span[.='One Page PDF']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement OPP_Email;
	
	@FindBy(xpath = "//span[.='Offline Payment']/../..//button[.='Yes']")
	public WebElement OfflinePayment_YesToggle;
	
	@FindBy(xpath = "//span[.='Offline Payment']/../..//button[.='No']")
	public WebElement OfflinePayment_NoToggle;
	
	@FindBy(xpath = "//span[.='Offline Payment']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label/span/input[@type='checkbox']")
	public WebElement OfflinePayment_EmailMsg;
	
	@FindBy(xpath = "//span[.='Offline Payment']/../../div[3]/div/div//app-checkbox[1]/div/mat-checkbox/label")
	public WebElement OfflinePayment_EmailMsgs_CheckBox;
	
	@FindBy(xpath = "//span[.='Offline Payment']/../../div[3]/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/span[contains(.,'Email')]/../input")
	public WebElement OfflinePayment_Email;
	
	
	@FindBy(xpath = "//mat-hint[.='Enter Valid Phone Number']")
	public WebElement Phoneno_Error;
	
	@FindBy(xpath = "//mat-hint[.='Phone Number Should Be Contain At Least 6 Digits']")
	public WebElement Phoneno_Empty_Error;

	@FindBy(xpath = "//mat-hint[.='Enter Valid Email']")
	public WebElement Email_Error;

	@FindBy(xpath = "//button[.='SAVE ']")
	public WebElement Save_Btn_Notification;
	
	@FindBy(xpath = "//button[.='SAVE '][@disabled='true']")
	public WebElement Save_Btn_Disabled_Notification;
	
	
	public void openTheSettingsNotificationsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		//Load the Settings Notifications page
		try {
			
			driver.navigate().refresh();
			cmp.waitForPageToLoad();
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"notification");
		Thread.sleep(5000);
		
		}
		catch(Exception K) {}
		Thread.sleep(5000);
		cmp.waitForPageToLoad();

}

	public void Check_Notifications_Field_Displayed(WebElement Ele, String Msg, String Msg1)
	{
		if (Ele.getText().equalsIgnoreCase(Msg)) {
			System.out.println(Msg1);
			ut.PassedCaptureScreenshotAsBASE64();
		};
	}

	
	public void IClick_Toggle_Yes_Btn(WebElement Ele1_Yes, WebElement Ele2_No) throws InterruptedException {
		
		if(Ele1_Yes.isEnabled())
		{
			
			Ele2_No.click();
			Thread.sleep(1000);
			Ele1_Yes.click();
			Thread.sleep(1000);
			ut.PassedCaptureScreenshotAsBASE64();
		} else {
			Ele1_Yes.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}	
	
	
	public void IClick_Toggle_No_Btn(WebElement Ele1_Yes, WebElement Ele2_No) throws InterruptedException {
		
		if(Ele2_No.isEnabled())
		{
			Thread.sleep(1000);
			Ele1_Yes.click();
			Thread.sleep(1000);
			Ele2_No.click();
			Thread.sleep(1000);
			ut.PassedCaptureScreenshotAsBASE64();
		} else {
			Ele2_No.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	
	public void Verify_Save_Button_Diabled_Notification() throws Exception
	{

		 if(Save_Btn_Disabled_Notification.isDisplayed())
		    {
			 
			 
		    	test.log(LogStatus.PASS, "Notification SAVE button is Disabled");
		    	
		    	ut.PassedCaptureScreenshotAsBASE64();
		    }
		    else
		    {
		    	test.log(LogStatus.FAIL, "Notification SAVE button is Enabled");
		    	
		    	ut.FailedCaptureScreenshotAsBASE64();
		    	
		    	Assert.assertEquals(true, Save_Btn_Disabled_Notification.isDisplayed());}
		    }

	
	
	public void Verify_Save_Button_Enabled_Notification() throws Exception
	{

		 if(Save_Btn_Notification.isDisplayed())
		    {
			 
			 
		    	test.log(LogStatus.PASS, "Notification SAVE button is Enabled");
		    	
		    	ut.PassedCaptureScreenshotAsBASE64();
		    }
		    else
		    {
		    	test.log(LogStatus.FAIL, "Notification SAVE button is Disabled");
		    	
		    	ut.FailedCaptureScreenshotAsBASE64();
		    	
		    	Assert.assertEquals(true, Save_Btn_Notification.isDisplayed());}
		    }

	
	public void Iclick_SaveBtn_Notification() throws InterruptedException {
		Thread.sleep(2000);
		Save_Btn_Notification.click();
	}
	
	public void IVerify_NotificationSettingsSavedSuccessfully() throws InterruptedException {
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Notification Settings SAVED Successfully")) {
			
			System.out.println("Notification Settings SAVED Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
			
		}
	}
	
	
	public void IEnter_Limit(WebElement Ele, String Str)
	{

//		for(int i = 1; i <= 4; i++)
//		{
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		}
		
		Ele.clear();
		Ele.sendKeys(Str);
		
		System.out.println("Entered Limit value is"+Str);
		test.log(LogStatus.PASS, "Entered Limit value is  "+Str);
		ut.PassedCaptureScreenshotAsBASE64();
		
	}
	
	
	
	public void Iselect_CheckBox(WebElement Ele, String Msg) {
		
		try
			{
				if(Ele.isDisplayed())
				{
				cmp.Click_Wait_ForElementClickable(Ele, 60);
					test.log(LogStatus.PASS, "Check Box is Selected for"+Msg);
					ut.PassedCaptureScreenshotAsBASE64();

					}
			}
			catch(Exception d)
			{
				Ele.click();
				test.log(LogStatus.PASS, "Check Box is Selected for"+Msg);
				ut.PassedCaptureScreenshotAsBASE64();
			}}
	
	
	public void IEnter_Mobilenumber(WebElement Ele, String Str)
	{

//		for(int i = 1; i <= 4; i++)
//		{
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		}
		
		Ele.clear();
		Ele.sendKeys(Str);
		
		System.out.println("Entered Mobile Number is"+Str);
		test.log(LogStatus.PASS, "Entered Mobile Number  "+Str);
		ut.PassedCaptureScreenshotAsBASE64();
		
	}
	
	
	public void IEnter_MailId(WebElement Ele, String Str)
	{

//		for(int i = 1; i <= 4; i++)
//		{
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		}
		
		Ele.clear();
		Ele.sendKeys(Str);
		
		System.out.println("Entered Mail Id is"+Str);
		test.log(LogStatus.PASS, "Entered Mail Id  "+Str);
		ut.PassedCaptureScreenshotAsBASE64();
		
	}
	
	public void IEnter_CustomText(WebElement Ele, String Str)
	{

//		for(int i = 1; i <= 4; i++)
//		{
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		}
		
		Ele.clear();
		Ele.sendKeys(Str);
		
		System.out.println("Entered Custom text is"+Str);
		test.log(LogStatus.PASS, "Entered custom text is  "+Str);
		ut.PassedCaptureScreenshotAsBASE64();
		
	}
	
	public void IVerify_PhonenumberError(WebElement Ele, String Str) throws InterruptedException {
		
		if(Ele.getText().equalsIgnoreCase(Str)) {
			test.log(LogStatus.PASS, "Error Message is  "+Str);
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
			
		} else {
			test.log(LogStatus.FAIL, "Error Message is  "+Str);
			ut.FailedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}
		
	
	
public void IVerify_EmailError(WebElement Ele, String Str) throws InterruptedException {
		
		if(Ele.getText().equalsIgnoreCase(Str)) {
			test.log(LogStatus.PASS, "Error Message is  "+Str);
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
			
		} else {
			test.log(LogStatus.FAIL, "Error Message is  "+Str);
			ut.FailedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

public void IVerify_LimitError(WebElement Ele, String Str) throws InterruptedException {
	
	if(Ele.getText().equalsIgnoreCase(Str)) {
		test.log(LogStatus.PASS, "Error Message is  "+Str);
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(3000);
		
	} else {
		test.log(LogStatus.FAIL, "Error Message is  "+Str);
		ut.FailedCaptureScreenshotAsBASE64();
		Thread.sleep(3000);
	}
}

}
		


