package com.Pages;

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

public class Settings_Batch_Settings_Page extends BasePage
{
//	public SelfHealingDriver driver;
//	public ExtentTest test;

//	public Settings_Batch_Settings_Page(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		PageFactory.initElements(driver, this);
//	}
	
	 @FindBy(xpath = "//button[@mattooltip='Settings']")
	 WebElement Settings;
	 
	 @FindBy(xpath = "//span[.='Batch Settings']")
	 WebElement Batch_Settings;
	 
	 @FindBy(xpath = "//span[.='Enable Auto Batch']/../..//div[2]/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
	 public WebElement Enable_AutoBatch_Yes;
	 
	 @FindBy(xpath = "//span[.='Enable Auto Batch']/../..//div[2]/mat-button-toggle-group/mat-button-toggle/button[.='No']")
	 public WebElement Enable_AutoBatch_No;
	 
	 @FindBy(xpath = "//span[.='Print Batch Report']/../..//div[2]/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
	 public WebElement Print_BatchReport_Yes;
	 
	 @FindBy(xpath = "//span[.='Print Batch Report']/../..//div[2]/mat-button-toggle-group/mat-button-toggle/button[.='No']")
	 public WebElement Print_BatchReport_No;
	 
	 @FindBy(xpath = "//app-time-picker[@customtimepickerclass='batch-settings']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")
	 public WebElement Time_Picker;
	 
	 @FindBy(xpath = "//span[.='Batch Submit Device']/../../div[2]/div/app-selectbox/div/mat-form-field/div/div/div/div/div")
	 public WebElement Batch_Submit_Device_DropDown;
	 
	 @FindBy(xpath = "//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/select-option")
	 public WebElement Node1;
	 
	 @FindBy(xpath = "//div[@class='cdk-virtual-scroll-content-wrapper']/div[2]/select-option")
	 public WebElement Node2;
	 
	 @FindBy(xpath = "//span[.='Default Batch Payment ']/../../div[2]/div/app-selectbox/div/mat-form-field/div/div/div[3]/input")
	 public WebElement Default_Batch_Payment;
	 
	 @FindBy(xpath = "//div[contains(@class,'options')]/select-option[1]/div")
	 public WebElement Payment1;
	 
	 @FindBy(xpath = "//div[contains(@class,'options')]/select-option[2]/div")
	 public WebElement Payment2;
	 
	 @FindBy(xpath = "//span[.=' Rows per page: ']/../../div[2]/app-selectbox/div/mat-form-field/div/div/div[3]/input")
	 public WebElement Rows_Per_Page;
	 
	 @FindBy(xpath = "//div[.=' 10 ']")
	 WebElement Rows10;
	 
	 @FindBy(xpath = "//div[.=' 5 ']")
	 public WebElement Rows5;
	 
	 @FindBy(xpath = "//mat-icon[.='keyboard_arrow_right']")
	 WebElement Right_Arrow;
	 
	 @FindBy(xpath = "//mat-icon[.='keyboard_arrow_left']")
	 WebElement Left_Arrow;
	 
	 @FindBy(xpath = "//input[@data-placeholder='Search']")
	 WebElement Search;
	 
	 @FindBy(xpath = "//div[.='2-005']/../div[5]")
	public
	 WebElement delete;
	 
	 @FindBy(xpath = "//button[.='UPDATE ']")
	 public WebElement Update_button;
	 
	 @FindBy(xpath = "//th[.=' Ticket No ']")
	 public WebElement Ticket_No;
	 
	 @FindBy(xpath = "//th[.=' Amount ']")
	 public WebElement Amount;
	 
	 @FindBy(xpath = "//th[.=' Tip Amount ']")
	 public  WebElement TipAmount;
	 
	 @FindBy(xpath = "//th[.=' Card No ']")
	 public WebElement Card_No;
	 
	 @FindBy(xpath = "//th[.='Actions']")
	 public WebElement Actions;
	
	 
	 @FindBy(xpath = "//span[.='keyboard_backspace']")
	 WebElement Back_Navigation;
	 
	 public void Click_Settings()
	 {
		Settings.click(); 
	 }
	 
	 public void Click_BatchSettings() 
	 {
		 Batch_Settings.click();
	 }
	 
	 public void Click_Enable_AutoBatch_YesToggle()
	 {
		Enable_AutoBatch_Yes.click(); 
	 }
	 public void Click_TimePicker_AM() throws Exception
	 {
		Time_Picker.click(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	
	 }
	 public void Click_TimePicker_PM() throws Exception 
	 {
		 Time_Picker.click(); 
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[@style='transform: rotateZ(-90deg);']")).click();
			Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

			Thread.sleep(1000);
			a.PM_Btn.click();

			Thread.sleep(500);
			a.OK_TimePickerBtn.click(); 
	 }
	 public void Click_TimePicker_Cancle() throws Exception 
	 {
		 Time_Picker.click(); 
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[@style='transform: rotateZ(-330deg);']")).click();
			Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

			Thread.sleep(1000);
			a.AM_Btn.click();

			Thread.sleep(500);
			a.Cancel_TimePickerBtn.click(); 
	 }
	 public void Click_Enable_AutoBatch_No()
	 {
		 Enable_AutoBatch_No.click();
	 }
	 public void Click_Batch_Submit_Device_DropDown() throws Exception 
	 {
		 Thread.sleep(3000);
		Batch_Submit_Device_DropDown.click(); 
		
	 }
	 public void Clicking_Node1()
	 {
		 Node1.click(); 
	 }
	 public void Clicking_Node2()
	 {
		Node2.click(); 
	 }
	 public void Click_Batch_Payment_Device() 
	 {
		Default_Batch_Payment.click(); 
	 }
	 public void clicking_Payment1() 
	 {
		 Payment1.click();
	 }
	 public void Clicking_Payment2() 
	 {
		 Payment2.click();
	 }
	 public void Selecting_Rows_DropDown() 
	 {
		 Rows_Per_Page.click();
	 }
	 public void Selecting_Rows10() 
	 {
		 Rows10.click();
	 }
	 public void Selecting_Rows5() 
	 {
		 Rows5.click();
	 }
	 public void Search_and_Delete() throws Exception 
	 {
		 Search.clear();
		 Search.sendKeys("2-00");
		 Thread.sleep(1000);
		 Search.clear();
		 Search.sendKeys("2-005");
		 for(int i=1;i<=4;i++)
			{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			}
		 Thread.sleep(2000);
		 delete.click();
		 Common_XPaths cmp = new Common_XPaths();
	     cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	     Thread.sleep(2000);
		 cmp.Click_CancelButton();
		 Thread.sleep(1000);
		 delete.click();
		 cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	     Thread.sleep(2000);
	     Utility ut = new Utility();
		 cmp.Click_DeleteButton();
		 if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Batch Setting Removed Successfully"))
	 		{
	 			test.log(LogStatus.PASS, "Batch Settings Deleted successfully");

	 			ut.PassedCaptureScreenshotAsBASE64();
	 		}
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Batch Settings Deletion failed");

	 			ut.FailedCaptureScreenshotAsBASE64();
	 		}	
		 Search.clear();
		 
	 }
	 public void Pagination() throws Exception 
	 {
		 try {
			 if(driver.findElement(By.xpath("//td[contains(.,'Batch not found')]")).isDisplayed()) {
				 test.log(LogStatus.INFO, "Batch is not available at this time");
			 }
		 }catch(Exception d) {
			 test.log(LogStatus.INFO, "Batch is available");
			 
			 Right_Arrow.click();
			 Thread.sleep(1000);
			 Right_Arrow.click();
			 Thread.sleep(1000);
			 Left_Arrow.click();
			 Thread.sleep(1000);
		 }

	 }
	 public void Navigate_Back() 
	 {
		 Back_Navigation.click();
	 }
	 public void Sorting_TicketNo() throws Exception 
	 {
		 Common_XPaths cmp= new Common_XPaths();
		 Utility ut = new Utility();

		 for(int i=1;i<=6;i++)
			{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			}
		 WebElement Before_sort = driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/data-grid-row/div/div[1]/span"));
		 String Ticket_No_Beforesort = Before_sort.getText();
		 System.out.println(Ticket_No_Beforesort);
		 Ticket_No.click();
		 Thread.sleep(2000);
		 Ticket_No.click();
		 WebElement After_Sort = driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/data-grid-row/div/div[1]/span"));
		 String Ticket_No_Aftersort = After_Sort.getText();
		 System.out.println(Ticket_No_Aftersort);
		 if(Ticket_No_Beforesort==Ticket_No_Aftersort) {
			 System.out.println("Sorting is not done successfully");
		 }
		 else 
		 {
			 test.log(LogStatus.PASS, "Sorting done successfully for Ticket number");

	 			ut.PassedCaptureScreenshotAsBASE64();
		 }
	 }
	 public void Sorting_Amount() throws Exception 
	 {
		 Common_XPaths cmp= new Common_XPaths();
		 Utility ut = new Utility();
		 WebElement Before_sort = driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/data-grid-row/div/div[3]/span"));
		 String Ticket_No_Beforesort = Before_sort.getText();
		 System.out.println(Ticket_No_Beforesort);
		 Amount.click();
		 Thread.sleep(2000);
		 Amount.click();
		 WebElement After_Sort = driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/data-grid-row/div/div[3]/span"));
		 String Ticket_No_Aftersort = After_Sort.getText();
		 System.out.println(Ticket_No_Aftersort);
		 if(Ticket_No_Beforesort==Ticket_No_Aftersort) {
			 System.out.println("Sorting is not done successfully");
		 }
		 else 
		 {
			 test.log(LogStatus.PASS, "Sorting done successfully for Amount");

	 			ut.PassedCaptureScreenshotAsBASE64();
		 }
	 }
	 public void Sorting_TipAmount() throws Exception 
	 {
		 Common_XPaths cmp= new Common_XPaths();
		 Utility ut = new Utility();
		 WebElement Before_sort = driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/data-grid-row/div/div[4]/span"));
		 String Ticket_No_Beforesort = Before_sort.getText();
		 System.out.println(Ticket_No_Beforesort);
		 TipAmount.click();
		 Thread.sleep(2000);
		 TipAmount.click();
		 WebElement After_Sort = driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/data-grid-row/div/div[4]/span"));
		 String Ticket_No_Aftersort = After_Sort.getText();
		 System.out.println(Ticket_No_Aftersort);
		 if(Ticket_No_Beforesort==Ticket_No_Aftersort)
		 {
			 System.out.println("Sorting is not done successfully");
		 }
		 else 
		 {
			 test.log(LogStatus.PASS, "Sorting done successfully for Tip Amount");

	 			ut.PassedCaptureScreenshotAsBASE64();
		 }
	 }
	 public void Save() throws Exception 
	 {
		 Common_XPaths cmp= new Common_XPaths();
		 Utility ut = new Utility();
		 Update_button.click();
		 Thread.sleep(2000);
	 		//Check whether Batch settings saved or not
	 		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Batch Settings updated successfully"))
	 		{
	 			test.log(LogStatus.PASS, "Batch Settings updated successfully");

	 			ut.PassedCaptureScreenshotAsBASE64();
	 		}
	 		else
	 		{
	 			test.log(LogStatus.FAIL, "Batch Settings Saving failed");

	 			ut.FailedCaptureScreenshotAsBASE64();
	 		}	
	 }
}
