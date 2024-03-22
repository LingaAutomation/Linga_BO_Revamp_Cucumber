package com.Pages;

import java.awt.Desktop.Action;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class GeneralSetting_page extends BasePage
{
//    public SelfHealingDriver driver;
//    public ExtentTest test;
   
    
//    public  GeneralSetting_page(SelfHealingDriver driver, ExtentTest test) 
//    {
////    	this.driver=driver;
////    	this.test=test;
//    	super(driver, test);
//    	PageFactory.initElements(driver, this);
//    }
    
	Common_XPaths cmp=new Common_XPaths();
	Utility ut=new Utility();
	
    @FindBy(xpath = "//button[@mattooltip='Settings']")
    WebElement Settings;
    
    @FindBy(xpath = "//span[contains(.,'General Settings')]")
    WebElement General_Setting;
    
    @FindBy(xpath = "//app-toggle[@name='tipScreenBeforeCC']//mat-button-toggle[.='No']")
    public WebElement Prompt_TipScreen_Bef_CC_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='tipScreenBeforeCC']//mat-button-toggle[.='Yes']")
    public WebElement Prompt_TipScreen_Bef_CC_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='enabledIntranetSync']//mat-button-toggle[.='Yes']")
    public WebElement Intranet_Sync_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='enabledIntranetSync']//mat-button-toggle[.='No']")
    public WebElement Intranet_Sync_NoToggle;
    
    @FindBy(xpath = "//input[@aria-label='Network Name']")
    public WebElement Prferred_Network_Name_InputBx;
    
    @FindBy(xpath = "//input[contains(@aria-label,'Age')]")
    public WebElement Minimum_Age_Limit_InputBx;
    
    @FindBy(xpath = "//textarea[@name='ageRestrictionAlertMessage']")
    public WebElement Age_Alert_Message_TextBx;
    
    
    
    @FindBy(xpath = "//span[.='Enable Pre Auth']/../../div[2]/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
    public WebElement PreAuth;
    
    @FindBy(xpath = "//span[.='Enable Pre Auth']/../../div[2]/mat-button-toggle-group/mat-button-toggle/button[.='No']")
    public WebElement PreAuth_NoToggle;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Enter Valid Value')]")
    public WebElement Enter_Valid_Value_ErrorMsg;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Invalid Expiration Time')]")
    public WebElement Invalid_Expiration_Time_ErrorMsg;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Amount cannot exist more than 10 digits')]")
    public WebElement Maximum_Tip_Amount_10Digit_ErrorMsg;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Maximum tip percentage is 100')]")
    public WebElement Maximum_Tip_Perc100_ErrorMsg;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Please enter the alert message')]")
    public WebElement Please_Enter_Alert_Message_ErrorMsg;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'POS Custom Button Must be Unique')]")
    public WebElement POS_Custom_Button_Must_Unique_ErrorMsg;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Enter preferred network')]")
    public WebElement Enter_Preferred_Network_ErrorMsg;
    
    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c79-130']")
    public WebElement Pre_AuthAmount;
    
    @FindBy(xpath = "//span[.='Enable Extended Pre Auth']/../../div[2]/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
    public WebElement Extended_PreAuth;
    
    @FindBy(xpath = "//span[.='Enable Extended Pre Auth']/../../div[2]/mat-button-toggle-group/mat-button-toggle/button[.='No']")
    public WebElement Extended_PreAuth_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='restrictGiftCardTip']//mat-button-toggle[.='Yes']")
    public WebElement Disable_GiftCard_Tip_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='restrictGiftCardTip']//mat-button-toggle[.='No']")
    public WebElement Disable_GiftCard_Tip_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='disableResetCheckNumber']//mat-button-toggle[.='Yes']")
    public WebElement Do_Not_Reset_CheckNumber_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='disableResetCheckNumber']//mat-button-toggle[.='No']")
    public WebElement Do_Not_Reset_CheckNumber_NoToggle;
    
    @FindBy(xpath = "//span[.='Employee Tip Out Deducted from Cash Expected on Reports']/../../div[2]/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
    public WebElement Tipout_YesToggle;
    
    @FindBy(xpath = "//span[.='Employee Tip Out Deducted from Cash Expected on Reports']/../../div[2]/mat-button-toggle-group/mat-button-toggle/button[.='No']")
    public WebElement Tipout_NoToggle;
    
    @FindBy(xpath ="//app-toggle[@name='enableGratuityLineInCC']//mat-button-toggle[.='Yes']")
    public WebElement Enable_Gratuity_Line_YesToggle;
    
    @FindBy(xpath ="//app-toggle[@name='enableGratuityLineInCC']//mat-button-toggle[.='No']")
    public WebElement Enable_Gratuity_Line_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='disableCustomerNationality']//mat-button-toggle[.='Yes']")
    public WebElement Disable_Customer_Nationality_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='disableCustomerNationality']//mat-button-toggle[.='No']")
    public WebElement Disable_Customer_Nationality_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='taxExemptId']//mat-button-toggle[.='Yes']")
    public WebElement Require_TaxExempt_ID_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='taxExemptId']//mat-button-toggle[.='No']")
    public WebElement Require_TaxExempt_ID_NoToggle;
    
    @FindBy(xpath = "//input[@aria-label='Seconds']")
    public WebElement Auto_LogOff_InputBx;
    
    @FindBy(xpath = "//input[@aria-label='Seconds']/../..//button[@aria-label='Increase']")
    public WebElement AutoLogOff_TimeUp;
    
    @FindBy(xpath = "//input[@aria-label='Seconds']/../..//button[@aria-label='Decrease']")
    public WebElement AutoLogOff_TimeDown;

    @FindBy(xpath = "//input[@aria-label='Minutes']")
    public WebElement Table_Expiration_InputBx;
    
    @FindBy(xpath = "//input[@aria-label='Minutes']/../..//button[@aria-label='Increase']")
    public WebElement Table_expiration_TimeUp;
    
    @FindBy(xpath = "//input[@aria-label='Minutes']/../..//button[@aria-label='Decrease']")
    public WebElement Table_expiration_TimeDown;
    
    @FindBy(xpath = "//app-chip[@name='splitBy']//mat-chip[contains(.,'Split By Check')]")
    public WebElement CustomSplit_Split_by_Check;
    
    @FindBy(xpath = "//app-chip[@name='splitBy']//mat-chip[contains(.,'Split By Seat')]")
    public WebElement CustomSplit_Split_by_Seat;
    
    @FindBy(xpath = "//app-toggle[@name='autoGenerateHANo']//mat-button-toggle[.='Yes']")
    public WebElement Auto_Generate_HouseAccount_Number_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='autoGenerateHANo']//mat-button-toggle[.='No']")
    public WebElement Auto_Generate_HouseAccount_Number_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='autoPrintCloseDayReport']//mat-button-toggle[.='Yes']")
    public WebElement Auto_Close_DayReport_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='autoPrintCloseDayReport']//mat-button-toggle[.='No']")
    public WebElement Auto_Close_DayReport_NoToggle;
    
    @FindBy(xpath = "//app-chip[@name='clockInVia']//mat-chip[contains(.,'PIN')]")
    public WebElement ClockIn_Pin;
    
    @FindBy(xpath = "//app-chip[@name='clockInVia']//mat-chip[contains(.,'Face ID')]")
    public WebElement ClockIn_FaceID;
    
    @FindBy(xpath = "//app-radio-button[@name='ownerOfTheCheck']//mat-radio-button[contains(.,'Check Closer')]")
    public WebElement Check_Closer_CheckOwner;
    
    @FindBy(xpath = "//app-radio-button[@name='ownerOfTheCheck']//mat-radio-button[contains(.,'Check Creator')]")
    public WebElement Check_Creator_CheckOwner;
    
    @FindBy(xpath = "//app-radio-button[@name='tipSettingType']//mat-radio-button[contains(.,'Percentage')]")
    public WebElement Tip_Settings_Percentage_Option;
    
    @FindBy(xpath = "//app-radio-button[@name='tipSettingType']//mat-radio-button[contains(.,'Amount')]")
    public WebElement Tip_Settings_Amount_Option;
    
    @FindBy(xpath = "//input[@aria-label='Tab Name']")
    public WebElement Floating_Tab_Name_InputBx;
    
    @FindBy(xpath = "//app-toggle[@name='tip Validation']//mat-button-toggle[.='Yes']")
    public WebElement Tip_Validation_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='tip Validation']//mat-button-toggle[.='No']")
    public WebElement Tip_Validation_NoToggle;
    
    @FindBy(xpath = "//input[@aria-label='Tip Threshold Amount']")
    public WebElement Tip_Threshold_Amount_InputBx;
    
    @FindBy(xpath = "//input[@aria-label='Tip Threshold Percentage']")
    public WebElement Tip_Threshold_Percentage_InputBx;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Value should be greater than 0')]")
    public WebElement Value_Should_GreaterThen_ZeroErrorMsg;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Please enter the alert message')]")
    public WebElement Please_Enter_Alert_MessageErrorMsg;
    
    @FindBy(xpath = "//div[contains(@class,'color-red')][contains(.,'Please enter the age')]")
    public WebElement Please_Enter_Age_Message_ErrorMsg;
 
    @FindBy(xpath = "//textarea[@name='ThresholdAlert']")
    public WebElement Tip_Validation_AlertTextBx;
    
    @FindBy(xpath = "(//div[contains(@class,'custom-pos-button')]/app-input-table//app-selectbox)[1]")
    public WebElement POS_Custom_Button_Sel1;
    
    @FindBy(xpath = "(//div[contains(@class,'custom-pos-button')]/app-input-table//app-selectbox)[2]")
    public WebElement POS_Custom_Button_Sel2;
    
    @FindBy(xpath = "(//div[contains(@class,'custom-pos-button')]/app-input-table//app-selectbox)[3]")
    public WebElement POS_Custom_Button_Sel3;
    
    @FindBy(xpath = "(//div[contains(@class,'custom-pos-button')]/app-input-table//app-selectbox)[4]")
    public WebElement POS_Custom_Button_Sel4;
    
    @FindBy(xpath = "(//div[contains(@class,'custom-pos-button')]/app-input-table//app-selectbox)[5]")
    public WebElement POS_Custom_Button_Sel5;
    
    @FindBy(xpath = "(//div[contains(@class,'custom-pos-button')]/app-input-table//app-selectbox)[6]")
    public WebElement POS_Custom_Button_Sel6;
    
    @FindBy(xpath = "//app-chip[@name='hideSeat']//mat-chip[contains(.,'QSR')]")
    public WebElement QSR_Hide_Seat_NumberKitchenPrint;
    
    @FindBy(xpath = "//app-chip[@name='hideSeat']//mat-chip[contains(.,'TABLE SERVICE')]")
    public WebElement TABLE_SERVICE_Hide_Seat_NumberKitchenPrint;
    
    @FindBy(xpath = "//app-chip[@name='hideSeat']//mat-chip[contains(.,'BarTab')]")
    public WebElement BarTab_Hide_Seat_NumberKitchenPrint;
    
    @FindBy(xpath = "//app-chip[@name='hideSeat']//mat-chip[contains(.,'To Go')]")
    public WebElement ToGo_Hide_Seat_NumberKitchenPrint;
    
    @FindBy(xpath = "//app-chip[@name='hideSeat']//mat-chip[contains(.,'Phone Order')]")
    public WebElement Phone_Order_Hide_Seat_NumberKitchenPrint;
    
    @FindBy(xpath = "//app-chip[@name='hideSeat']//mat-chip[contains(.,'Web Order')]")
    public WebElement Web_Order_Hide_Seat_NumberKitchenPrint;
    
    @FindBy(xpath = "//app-toggle[@name='membershipAutoRenewal']//mat-button-toggle[.='Yes']")
    public WebElement Membership_Auto_Renewal_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='membershipAutoRenewal']//mat-button-toggle[.='No']")
    public WebElement Membership_Auto_Renewal_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='isStoreLevelCustomer']//mat-button-toggle[.='Yes']")
    public WebElement Store_Level_Customer_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='isStoreLevelCustomer']//mat-button-toggle[.='No']")
    public WebElement Store_Level_Customer_NoToggle;
    
    @FindBy(xpath = "//app-radio-button[@name='timeFormat']//input[@value='12']")
    public WebElement TimeFormat_12hours;
    
    @FindBy(xpath = "//app-radio-button[@name='timeFormat']//input[@value='24']")
    public WebElement TimeFormat_24hours;
    
    @FindBy(xpath = "//app-radio-button[@name='dateFormat']//mat-radio-button[contains(.,'Default')]")
    public WebElement DateFormat_Default;
    
    @FindBy(xpath = "//app-radio-button[@name='dateFormat']//mat-radio-button[contains(.,'MM-DD-YYYY')]")
    public WebElement DateFormat_MM_DD_YYYY;
    
    @FindBy(xpath = "//app-radio-button[@name='dateFormat']//mat-radio-button[contains(.,'DD-MM-YYYY')]")
    public WebElement DateFormat_DD_MM_YYYY;
    
    @FindBy(xpath = "//app-toggle[@name='tipSuggestion']//mat-button-toggle[.='Yes']")
    public WebElement Tip_Suggestion_CC_Receipt_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='tipSuggestion']//mat-button-toggle[.='No']")
    public WebElement Tip_Suggestion_CC_Receipt_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='doorDashDrive']//mat-button-toggle[.='Yes']")
    public WebElement Enable_Doordash_Drive_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='doorDashDrive']//mat-button-toggle[.='No']")
    public WebElement Enable_Doordash_Drive_NoToggle;
    
    @FindBy(xpath = "//app-toggle[@name='Age Restriction']//mat-button-toggle[.='Yes']")
    public WebElement Enable_Age_Restriction_YesToggle;
    
    @FindBy(xpath = "//app-toggle[@name='Age Restriction']//mat-button-toggle[.='No']")
    public WebElement Enable_Age_Restriction_NoToggle;
    
    @FindBy(xpath = "//button[.='UPDATE']" )
    WebElement Update_Button;
    
    @FindBy(xpath = "//button/span[.=' yes ']" )
    WebElement yes_btn_alert;
    
    @FindBy(xpath = "//div[@class='alert-header']/../div/p" )
    WebElement Alert_txt;
  
//    Utility ut=new Utility();
   
    public void NavigatingSettings()
    {
    	Settings.click();
    }
    public void NavigateGeneralSetting() 
    {
    	General_Setting.click();
    }
    
    public void EnablingTipScreen() throws Exception
    {
    	
Thread.sleep(1000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",TipScreen_YesToggle );
//		TipScreen_YesToggle.click();
		for(int i=1;i<=18;i++)
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		
		Thread.sleep(2500);
		if(Prompt_TipScreen_Bef_CC_YesToggle.isSelected())
		{
			
		}
		else
		{driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
			Thread.sleep(1000);
			Prompt_TipScreen_Bef_CC_YesToggle.click();
		}
    }
		public void DisablingTipScreen() {
			
		if(Prompt_TipScreen_Bef_CC_NoToggle.isSelected())
		{
			
		}
		else {
			Prompt_TipScreen_Bef_CC_NoToggle.click();
		}
    
    }
    public void Enabling_Intranet_Sync() throws Exception
    {
    	
		Thread.sleep(2000);
    	Intranet_Sync_YesToggle.click();
    	//Thread.sleep(5000);
    	Common_XPaths cmp = new Common_XPaths();
    	
		if(Alert_txt.getText().equals("Do you have intranet sync device?"))
		{
			test.log(LogStatus.PASS, "Do you have intranet sync device? alert displayed Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Do you have intranet sync device? alert is not displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
    	
        Thread.sleep(2000);
        yes_btn_alert.click();
     }
    public void Disabling_Intranet_Sync() {
    	Intranet_Sync_NoToggle.click();
    }
    
    public void preferredNetwork() throws Exception 
    {
    	Thread.sleep(1000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",Prferred_Network_Name_InputBx );
		for(int i=1;i<=3;i++)
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);
		Prferred_Network_Name_InputBx.clear();
    	Prferred_Network_Name_InputBx.sendKeys("LAN");
    	
    }
    public void Enabling_PreAuth() throws Exception 
    {
    	Thread.sleep(1000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",	PreAuth );
		for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);
		if(PreAuth.isSelected())
		{
			 
		}
		else
		{
			Thread.sleep(1000);
			PreAuth.click();
		}
     }
    public void Disabling_PreAuth() throws Exception
    {
    	 Thread.sleep(1000);
         PreAuth_NoToggle.click();
    	//Pre_AuthAmount.sendKeys("400");
    }
    
    public void Enable_Extended_PreAuth() throws Exception 
    {
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);
		if(Extended_PreAuth.isSelected())
		{
			 
		}
		else
		{
			Thread.sleep(1000);
			Extended_PreAuth.click();
		}
    }
    public void Disabling_Extended_Pre_Auth() throws Exception {
    	Thread.sleep(1000);
		Extended_PreAuth_NoToggle.click();
    }
    public void Enabling_Disable_GiftCard_Tip() throws Exception 
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);

		if(Disable_GiftCard_Tip_YesToggle.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(1000);
			Disable_GiftCard_Tip_YesToggle.click();
		}
    }
    public void Disabling_Disable_GiftCard_Tip() throws Exception
    {
    	Thread.sleep(1000);
		Disable_GiftCard_Tip_NoToggle.click();
    }
    public void Enabling_Tipout() throws Exception 
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);

		if(Tipout_YesToggle.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(1000);
			Tipout_YesToggle.click();
		}
    }
    public void Disabling_Tipout() throws Exception {
    	Thread.sleep(1000);
		Tipout_NoToggle.click();
    }
    public void enabling_Enable_Gratuity_Line() throws Exception 
    {
    Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);

		if(Enable_Gratuity_Line_YesToggle.isSelected())
		{
			
		}	
		else
		{
			Thread.sleep(1000);
			Enable_Gratuity_Line_YesToggle.click();
		}
    }
    public void Disabling_Enable_Gratuity_Line() throws Exception {
    	Thread.sleep(1000);
		Enable_Gratuity_Line_NoToggle.click();
    }
    public void Disable_Customer_Nationality() throws Exception 
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);

		if(Disable_Customer_Nationality_YesToggle.isSelected())
		{
			
		}	
		else
		{
			Thread.sleep(1000);
			Disable_Customer_Nationality_YesToggle.click();
		}
    }
    public void Enabling_Customer_Nationality() throws Exception {
    	Thread.sleep(1500);
		Disable_Customer_Nationality_NoToggle.click();
    }
    public void Enabling_Require_TaxExempt_ID() throws Exception
    {

    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);

		if(Require_TaxExempt_ID_YesToggle.isSelected())
		{
			
		}	
		else
		{
			Thread.sleep(1000);
			Require_TaxExempt_ID_YesToggle.click();
		}
    }
    public void Disabling_Require_TaxExempt_ID() throws Exception {
    	Thread.sleep(1000);
		Require_TaxExempt_ID_NoToggle.click();
    }
    public void Auto_logOff_Time() throws Exception
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);
		 AutoLogOff_TimeUp.click();
		 Thread.sleep(1000);
		 AutoLogOff_TimeDown.click();
		 Thread.sleep(1000);
		 AutoLogOff_TimeUp.click();

    }
    public void entering_Table_expiration_time() throws Exception
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);
		 Table_expiration_TimeUp.click();
		 Thread.sleep(2000);
		 Table_expiration_TimeDown.click();
		 Thread.sleep(1500);
		 Table_expiration_TimeUp.click();

    }
    public void Selecting_CustomSplit_Check() throws Exception 
    {

    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);
		if( CustomSplit_Split_by_Check.isSelected())
		{
			
		}	
		else
		{
			Thread.sleep(1000);
			CustomSplit_Split_by_Check.click();
		}
		 
    }
    public void Selecting_Custom_SplitSeat() throws Exception {
    	Thread.sleep(1000);
    	CustomSplit_Split_by_Seat.click();
    }
    public void Enabling_Automatic_Auto_Generate_HouseAccount_Number() throws Exception 
    {
    	 Thread.sleep(1000);
     	for(int i=1;i<=4;i++) 
 		{
 		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
 		}
 		Thread.sleep(1500);

 		if(Auto_Generate_HouseAccount_Number_YesToggle.isSelected())
 		{
 			
 		}	
 		else
 		{
 			Thread.sleep(1000);
 			Auto_Generate_HouseAccount_Number_YesToggle.click();
 		}
     }
    public void Disabling_Automatic_Auto_Generate_HouseAccount_Number() throws Exception {
    	Thread.sleep(1000);
 		Auto_Generate_HouseAccount_Number_NoToggle.click();
    }
    public void Enabling_Auto_CloseDay_Report() throws Exception
    {
    	 Thread.sleep(1000);
      	for(int i=1;i<=4;i++) 
  		{
  		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
  		}
  		Thread.sleep(1500);

  		if(Auto_Close_DayReport_YesToggle.isSelected())
  		{
  			
  		}	
  		else
  		{
  			Thread.sleep(1000);
  			Auto_Close_DayReport_YesToggle.click();
  		}
    }
    public void Disabling_Auto_CloseDay_Report() throws Exception {
    	Thread.sleep(1000);
  		Auto_Close_DayReport_NoToggle.click();
    }
    public void Selecting_ClockIn() throws Exception 
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);
		if(ClockIn_Pin.isSelected()) 
		{
			
		}
		else {
			ClockIn_Pin.click();
		}
	}
    public void Selecting_FaceId() throws Exception {
    	Thread.sleep(1000);
    	if(ClockIn_FaceID.isSelected()) {
    		
    	}
    	else {
		ClockIn_FaceID.click();
    	}
    }
    public void Selecting_Checkowner() throws Exception 
    {

    	Thread.sleep(1000);
    	for(int i=1;i<=2;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);
		if(Check_Creator_CheckOwner.isSelected()) 
		{
			
		}
		else {
			Check_Creator_CheckOwner.click();
		}
    }
    public void Selecting_CheckCloser() throws Exception {
    	Thread.sleep(1000);
    	if(Check_Closer_CheckOwner.isSelected()) 
		{
			
		}
		else {
			Check_Closer_CheckOwner.click();
		}
		
    }
    public void Tip_Settings_Amount() throws Exception
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=2;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);
		if(Tip_Settings_Amount_Option.isSelected()) 
		{
			
		}
		else {
			Tip_Settings_Amount_Option.click();
		}
    }
    public void Tip_Settings_Per() throws Exception {
    	Thread.sleep(1000);
    	if(Tip_Settings_Percentage_Option.isSelected()) 
		{
			
		}
		else {
			Tip_Settings_Percentage_Option.click();
		}
    }
    public void Entering_FloatingTab() throws Exception
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=2;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
    	Thread.sleep(1000);
    	Floating_Tab_Name_InputBx.clear();
    	Floating_Tab_Name_InputBx.sendKeys("Bar Tab");
    }
    public void Hide_SeatNumber_In_KitchenPrinter() throws Exception 
    {
    	Thread.sleep(1000);
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
    	if(TABLE_SERVICE_Hide_Seat_NumberKitchenPrint.isSelected())
    	{
    		
    	}
    	else {
    		TABLE_SERVICE_Hide_Seat_NumberKitchenPrint.click();
    	}
    }
    public void Hide_PhoneOrder() throws Exception 
    {driver.findElement(By.xpath("//button[contains(.,'Show All')]")).click();Thread.sleep(1000);
    if(Phone_Order_Hide_Seat_NumberKitchenPrint.isSelected()) {
    	
    }
    else {
    	Phone_Order_Hide_Seat_NumberKitchenPrint.click();
    }
    }	
    public void Hide_Togo() throws Exception {
    	Thread.sleep(1000);
    	if(ToGo_Hide_Seat_NumberKitchenPrint.isSelected()) {
    		
    	}
    	else {
    		ToGo_Hide_Seat_NumberKitchenPrint.click();
    	}
    }
    	public void Hide_Weborder() throws Exception 
    	{
    	Thread.sleep(1000);
    	if(Web_Order_Hide_Seat_NumberKitchenPrint.isSelected()) {
    		
    	}
    	else {
    		Web_Order_Hide_Seat_NumberKitchenPrint.click();
    	}
    	Thread.sleep(500);
    }
    	public void Hide_BarTab() {
    		if(BarTab_Hide_Seat_NumberKitchenPrint.isSelected()) {
    			
    		}
    		else {
    			BarTab_Hide_Seat_NumberKitchenPrint.click();
    		}
    	}
    
    public void Enabling_Memship_AutoRenewal() throws Exception 
    {
    	 Thread.sleep(1000);
       	for(int i=1;i<=6;i++) 
   		{
   		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
   		}
   		Thread.sleep(1000);

   		if(Membership_Auto_Renewal_YesToggle.isSelected())
   		{
   			
   		}	
   		else
   		{
   			Thread.sleep(1000);
   			Membership_Auto_Renewal_YesToggle.click();
   		}
   	}
   public void  Disabling_Membership_Renewal() throws Exception {
	   Thread.sleep(1500);
  		Membership_Auto_Renewal_NoToggle.click();
   }
    public void Enabling_Storelevel_Customer() throws Exception 
    {
    	Thread.sleep(1000);
       	for(int i=1;i<=4;i++) 
   		{
   		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
   		}
   		Thread.sleep(1500);

   		if(Store_Level_Customer_YesToggle.isSelected())
   		{
   			
   		}	
   		else
   		{
   			Thread.sleep(1000);
   			Store_Level_Customer_YesToggle.click();
   		}
    }
    public void Disabling_Storelevel_Customer() throws Exception {
    	Thread.sleep(1500);
   		Store_Level_Customer_NoToggle.click();
    }
    public void Time_Format() throws Exception 
    {
    	Thread.sleep(1000);
		for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);
		
		if( TimeFormat_24hours.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(1000);
			TimeFormat_24hours.click();
		}
		Thread.sleep(1500);
		TimeFormat_12hours.click();
    
    }
    public void DateFormat_Default() throws Exception 
    {
    	for(int i=1;i<=4;i++) 
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1500);
		DateFormat_Default.click();
			
    }
    public void DateFormat_MM_DD_YYYY() throws Exception
    {
    	Thread.sleep(1000);
		if(DateFormat_MM_DD_YYYY.isSelected()) {
			
		}
		else {
			DateFormat_MM_DD_YYYY.click();
		}
    }
    public void DateFormat_DD_MM_YYYY() throws Exception
    {
    	Thread.sleep(1000);
		if(DateFormat_DD_MM_YYYY.isSelected()) {
			
		}
		else {
			DateFormat_DD_MM_YYYY.click();
		}
    }
    public void enablingTipScreen() throws Exception
    {
    	for(int i=1;i<=4;i++) 
    	{
        driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
    	}
		Thread.sleep(1500);
		if(Tip_Suggestion_CC_Receipt_YesToggle.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(1000);
			Tip_Suggestion_CC_Receipt_YesToggle.click();
		}
    }
    public void Disabling_Tipscreen() throws Exception {
    	Thread.sleep(1500);
		Tip_Suggestion_CC_Receipt_NoToggle.click();
    }
    
    
    public void update() throws Exception 
    {
    	Utility ut= new Utility();
    	Thread.sleep(5500);
    	try
    	{
   		Thread.sleep(500);
    		Update_Button.click();
    		Thread.sleep(2000);
    		String s = driver.findElement(By.xpath("//div[@class='message mx-2']/span")).getText();
    		
    		//Verify the success message
    		if(s.equals("Application Settings Updated Successfully"))
    		{
    			test.log(LogStatus.PASS, "Application Settings Updated Successfully");
    			ut.PassedCaptureScreenshotAsBASE64();
    		}
    		else
    		{
    			test.log(LogStatus.FAIL, "Application Settings Updated Successfully");
    			ut.FailedCaptureScreenshotAsBASE64();
    		}
    		
    		//Click the close button of success message
    		driver.findElement(By.xpath("//div[@class='message mx-2']/../mat-icon[.='close']")).click();
    		Thread.sleep(3000);

    	}
    	catch(Exception s) {
    		System.out.println("General settings updation failed update button is disabled");
    		test.log(LogStatus.FAIL, "General settings updation failed, update button is disabled");

			ut.FailedCaptureScreenshotAsBASE64();
    	}
    }
   
}
