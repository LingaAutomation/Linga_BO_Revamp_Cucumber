package com.Pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class Payroll_Report_SettingsPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Common_XPaths cmp;
	TaxesPage tx;
	Utility ut=new Utility();
	
//	public Payroll_Report_SettingsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'OVERTIME')]")
	public WebElement Add_Overtime_btn;
	
	@FindBy(xpath = "//span[contains(.,'Allow Over Tip Out')]/../..//mat-button-toggle[contains(.,'Yes')]")
	public WebElement Allow_OverTip_Out_YesBtn;
		
	@FindBy(xpath = "//span[contains(.,'Allow Over Tip Out')]/../..//mat-button-toggle[contains(.,'No')]")
	public WebElement Allow_OverTip_Out_NoBtn;
	
	@FindBy(xpath = "//input[@aria-label='Select Day']")
	public WebElement Payroll_Week_Start_DayInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Default Payroll Process')]/../..//input")
	public WebElement Default_Payroll_ProcessInputBx;
	
	@FindBy(xpath = "//select-option[contains(.,'DAILY')]")
	public WebElement Daily_Payroll_ProcessBtn;
	
	@FindBy(xpath = "//select-option[contains(.,'WEEKLY')]")
	public WebElement Weekly_Payroll_ProcessBtn;
	
	@FindBy(xpath = "//input[@aria-label='Age']")
	public WebElement Age_LimitInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Hours']")
	public WebElement Hours_LimitInputBx;
	
	@FindBy(xpath = "//div/span[.='SETTINGS']")
	public WebElement SettingsTab;
	
	@FindBy(xpath = "//span[contains(@class,'segment-button')][.='OVER TIME SETTINGS']")
	public WebElement OverTime_SettingsTab;
	
	@FindBy(xpath = "//span[contains(@class,'segment-button')][.='MANAGE BREAKS']")
	public WebElement Manage_BreaksTab;
	
	@FindBy(xpath = "//input[@aria-label='Break-In/Break-Out Terminal']")
	public WebElement Break_In_BreakOut_InputBx;
	
	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Daily')]")
	public WebElement Daily_Set_OverTimeRadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Weekly')]")
	public WebElement Weekly_Set_OverTimeRadioBtn;
	
	@FindBy(xpath = "//button[@aria-label='Open calendar']")//button[@aria-label='Open calendar']
	public WebElement Effective_DateInputBx;
	
	@FindBy(xpath = "//div[contains(@class,'calendar-controls')]/button[3]")
	public WebElement NextMonth_Calender_EffectiveDateBtn;
	
	@FindBy(xpath = "//span[contains(.,'Over Time 1')]/../..//label[contains(.,'Hours')]/../../input")
	public WebElement Hours_OverTime_1_InputBx;
	
	@FindBy(xpath = "//span[contains(.,'Over Time 1')]/../..//label[contains(.,'Percentage')]/../../input")
	public WebElement Percentage_OverTime_1_InputBx;
	
	@FindBy(xpath = "//span[contains(.,'Over Time 2')]/../..//label[contains(.,'Hours')]/../../input")
	public WebElement Hours_OverTime_2_InputBx;
	
	@FindBy(xpath = "//span[contains(.,'Over Time 2')]/../..//label[contains(.,'Percentage')]/../../input")
	public WebElement Percentage_OverTime_2_InputBx;
	
	@FindBy(xpath = "//span[contains(.,'Over Time 3')]/../..//label[contains(.,'Hours')]/../../input")
	public WebElement Hours_OverTime_3_InputBx;
	
	@FindBy(xpath = "//span[contains(.,'Over Time 3')]/../..//label[contains(.,'Percentage')]/../../input")
	public WebElement Percentage_OverTime_3_InputBx;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Enter the minimum Age')]")
	public WebElement Minimum_AgeErrorMsg;
	
	@FindBy(xpath = "//p[contains(.,'Maximum age limit is 100')]")
	public WebElement Maximum_Age_Limit_100ErrorMsg;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'Enter valid Hours')]")
	public WebElement Enter_Valid_HoursErrorMsg;
	
	@FindBy(xpath = "//p[contains(.,'Enter valid percentage should be more than 100')]")
	public WebElement Enter_Valid_Percentage_Morethan_100ErrorMsg;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Type')]")
	public WebElement Type_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Effective Date')]")
	public WebElement Effective_Date_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Hours')]")
	public WebElement Hours_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Break Name')]")
	public WebElement Break_Name_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Payroll Type')]")
	public WebElement Payroll_Type_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Duration')]")
	public WebElement Duration_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Percentage')]")
	public WebElement Percentage_Column_Field;
	
	@FindBy(xpath = "//button[contains(.,'NEW BREAK')]")
	public WebElement New_Break_Btn;
	
	@FindBy(xpath = "//input[@aria-label='Break Name']")
	public WebElement Break_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Duration (mins)']")
	public WebElement Duration_InputBx;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Paid']")
	public WebElement Paid_PaidType_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Unpaid']")
	public WebElement Unpaid_PaidType_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='All Employees']")
	public WebElement All_Employees_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Specific Roles']")
	public WebElement Specific_Roles_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Specific Employees']")
	public WebElement Specific_Employees_RadioBtn;
	
	@FindBy(xpath = "//input[@aria-label='Select Roles']")
	public WebElement Select_Roles_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Select Employees']")
	public WebElement Select_Employees_InputBx;
	
	@FindBy(xpath = "//div[contains(@class,'row')][contains(.,'Duration minimum 1 mins and maximum 100 mins')]")
	public WebElement Duration_Min1_Max100_ErrorMsg;
	
	public void Click_New_OverTime()
	{
		Add_Overtime_btn.click();
	}
	
	public void Select_SettingsTab()
	{
		SettingsTab.click();
	}
	
	public void Select_OverTime_SettingsTab()
	{
		OverTime_SettingsTab.click();
	}
	
	
	public void Enable_Allow_OverTip_Out()
	{
		if(Allow_OverTip_Out_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Allow_OverTip_Out_YesBtn.click();
		}
	}
	
	public void Disable_Allow_OverTip_Out()
	{
		if(Allow_OverTip_Out_YesBtn.isEnabled()) 
		{
			Allow_OverTip_Out_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	
	
	public WebElement Allow_OverTip_Out_YesBtn()
	{
		return Allow_OverTip_Out_YesBtn;
	}
	
	public void Select_Payroll_Week_StartDay() throws Exception
	{
		Thread.sleep(1000);
		Payroll_Week_Start_DayInputBx.click();
		
		Thread.sleep(1000);
	List<WebElement> OptionList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		int OptionSize=OptionList.size();
		
		
		int randomOption=ThreadLocalRandom.current().nextInt(1, OptionSize);
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomOption+"]/select-option")).click();
	
	}
	
	public WebElement Payroll_Week_StartDay()
	{
		return Payroll_Week_Start_DayInputBx;
	}
	
	public void Select_Daily_Default_PayrollProcess() throws Exception
	{
		Thread.sleep(1000);
		Default_Payroll_ProcessInputBx.click();
		Thread.sleep(1000);
		Daily_Payroll_ProcessBtn.click();
	}
	
	public void Select_Weekly_Default_PayrollProcess() throws Exception
	{
		Thread.sleep(1000);
		Default_Payroll_ProcessInputBx.click();
		Thread.sleep(1000);
		Weekly_Payroll_ProcessBtn.click();
	}
	
	public WebElement Default_Payroll_ProcessInputBox()
	{
		return Default_Payroll_ProcessInputBx;
	}
	
	public void Setup_Hours_Limit_byAge(String Age, String Hours) throws Exception
	{
		Thread.sleep(1000);
		Age_LimitInputBx.clear();
		Thread.sleep(500);
		Age_LimitInputBx.sendKeys(Age);
		
		Thread.sleep(1000);
		Hours_LimitInputBx.clear();
		Thread.sleep(500);
		Hours_LimitInputBx.sendKeys(Hours);
		
		
	}
	
	public WebElement Age_LimitInputBox()
	{
		return Age_LimitInputBx;
	}
	
	public WebElement Hours_LimitInputBox()
	{
		return Hours_LimitInputBx;
	}
	
	public void Verify_Minimum_Age_ErrorMessage()
	{
		try
		{
		if(Minimum_AgeErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter the minimum Age Error Pop is Displayed");
		}
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Enter the minimum Age Error Pop is not Displayed");
			
		}
	}
	
	public void Verify_Age_Limit_ErrorMessage()
	{
		try
		{
		if(Maximum_Age_Limit_100ErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter the minimum Age Error Pop is Displayed");
		}
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Enter the minimum Age Error Pop is not Displayed");
			
		}
	}
	
	public void Click_Daily_SetOverTime()
	{
		Daily_Set_OverTimeRadioBtn.click();
	}
	
	public WebElement Daily_Set_OverTime()
	{
		return Daily_Set_OverTimeRadioBtn;
	}
	
	public void Click_Weekly_SetOverTime()
	{
		Weekly_Set_OverTimeRadioBtn.click();
	}
	
	public WebElement Weekly_Set_OverTime()
	{
		return Weekly_Set_OverTimeRadioBtn;
	}
	
	public void Verify_Valid_Hours_ErrorMessage()
	{
		try
		{
		if(Enter_Valid_HoursErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Hours Error Pop is Displayed");
		}
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Enter Valid Hours Error Pop is not Displayed");
			
		}
	}
	
	public void Verify_Valid_Percentage_ErrorMessage()
	{
		try
		{
		if(Enter_Valid_Percentage_Morethan_100ErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Percentage Error Pop is Displayed");
		}
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Enter Valid Percentage Error Pop is not Displayed");
			
		}
	}
	
	//span[contains(.,'Over Time 3')]/../..//mat-hint[contains(.,'Enter valid Hours')]
	//span[contains(.,'Over Time 3')]/../..//mat-hint[contains(.,'Enter valid percentage should be more than 100')]
	
	public void Enter_Hours_OverTime_1_(String str) throws Exception
	{
		Thread.sleep(1000);
		Hours_OverTime_1_InputBx.clear();
		Thread.sleep(500);
		Hours_OverTime_1_InputBx.sendKeys(str);
		
	}

	public void Enter_Percentage_OverTime_1_(String str) throws Exception
	{
		Thread.sleep(1000);
		Percentage_OverTime_1_InputBx.clear();
		Thread.sleep(500);
		Percentage_OverTime_1_InputBx.sendKeys(str);
		
	}
	
	public WebElement Hours_OverTime_1_InputBox()
	{
		return Hours_OverTime_1_InputBx;
	}
	
	
	public WebElement Percentage_OverTime_1_InputBox()
	{
		return Percentage_OverTime_1_InputBx;
	}
	
	public void Enter_OverTime_1_(String str, String str2) throws Exception
	{
		Thread.sleep(1000);
		Hours_OverTime_1_InputBx.clear();
		Thread.sleep(500);
		Hours_OverTime_1_InputBx.sendKeys(str);
	
		Thread.sleep(1000);
		Percentage_OverTime_1_InputBx.clear();
		Thread.sleep(500);
		Percentage_OverTime_1_InputBx.sendKeys(str2);
		
	}
	
	public void Enter_OverTime_2_(String str,String str2) throws Exception
	{
		Thread.sleep(1000);
		Hours_OverTime_2_InputBx.clear();
		Thread.sleep(500);
		Hours_OverTime_2_InputBx.sendKeys(str);
	
		Thread.sleep(1000);
		Percentage_OverTime_2_InputBx.clear();
		Thread.sleep(500);
		Percentage_OverTime_2_InputBx.sendKeys(str2);
		
	}
	
	
	public void Enter_OverTime_3_(String str,String str2) throws Exception
	{
		Thread.sleep(1000);
		Hours_OverTime_3_InputBx.clear();
		Thread.sleep(500);
		Hours_OverTime_3_InputBx.sendKeys(str);
	
		Thread.sleep(1000);
		Percentage_OverTime_3_InputBx.clear();
		Thread.sleep(500);
		Percentage_OverTime_3_InputBx.sendKeys(str2);
		
	}
	
	
	
	
	
	
	//td/button[contains(@class,'mat-calendar-body-cell')]/div[@class='mat-calendar-body-cell-content mat-focus-indicator']

	
	public void Select_SameDay_Effective_Date() throws Exception
	{
		Thread.sleep(1000);
		Effective_DateInputBx.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='mat-calendar-table']/tbody/tr/td/button[contains(@class,'mat-calendar-body-active')]")).click();
	}
	
	public void Select_Effective_Date() throws Exception
	{
		Thread.sleep(1000);
		Effective_DateInputBx.click();
		
		Thread.sleep(1000);
		NextMonth_Calender_EffectiveDateBtn.click();
		Thread.sleep(1000);
		NextMonth_Calender_EffectiveDateBtn.click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		List<WebElement> rowList=driver.findElements(By.xpath("//table[@class='mat-calendar-table']/tbody/tr"));
		List<WebElement> colList=driver.findElements(By.xpath("//table[@class='mat-calendar-table']/tbody/tr[2]/td"));
		
	//List<WebElement> OptionList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		int rowSize=rowList.size();
		
		
		int randomRow=ThreadLocalRandom.current().nextInt(2, rowSize-1);
		
		Thread.sleep(1000);

	int colSize=colList.size();
		
		
		int randomCol=ThreadLocalRandom.current().nextInt(1, colSize);
	
		driver.findElement(By.xpath("//table[@class='mat-calendar-table']/tbody/tr["+randomRow+"]/td["+randomCol+"]/button[contains(@class,'mat-calendar-body-cell')]")).click();
	}

	
	//table[@class='mat-calendar-table']/tbody/tr
	//table[@class='mat-calendar-table']/tbody/tr[5]/td
	
	public void Edit_Daily_OverTime()
	{
		 cmp=new Common_XPaths();
		
//		List<WebElement> overTimeList=driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		 List<WebElement> overTimeList=driver.findElements(By.xpath("//table/tbody/tr/td[contains(.,'Weekly')]/../td[5]"));
		
		
		
//		driver.findElement(By.xpath("//table/tbody/tr["+overTimeList.size()+"]/td[5]")).click();
		driver.findElement(By.xpath("(//table/tbody/tr/td[contains(.,'Daily')]/../td[5])["+overTimeList.size()+"]")).click();
	
		
		try
		{
			if(cmp.Alert_Popup.getText().equalsIgnoreCase("The field cannot be edited since it has passed the effective date"))
			{
				
				Thread.sleep(1000);
				cmp.Click_Okay_Button();
			}
		}
		catch(Exception g)
		{
	
		}
		
	}
	
	public void Edit_Weekly_OverTime()
	{
		 cmp=new Common_XPaths();
		
		List<WebElement> overTimeList=driver.findElements(By.xpath("//table/tbody/tr/td[contains(.,'Daily')]/../td[5]"));
		
//		int size=overTimeList.size()-1;
		
//		driver.findElement(By.xpath("//table/tbody/tr["+size+"]/td[5]")).click();
		
		driver.findElement(By.xpath("(//table/tbody/tr/td[contains(.,'Weekly')]/../td[5])["+overTimeList.size()+"]")).click();
		
		
		try
		{
			if(cmp.Alert_Popup.getText().equalsIgnoreCase("The field cannot be edited since it has passed the effective date"))
			{
				
				Thread.sleep(1000);
				cmp.Click_Okay_Button();
			}
		}
		catch(Exception g)
		{
	
		}
		
	}
	
	public void Verify_Effective_CannotBeEdit_ErrorMsg()
	{
		 cmp=new Common_XPaths();

		try
		{
			if(cmp.Alert_Popup.getText().equalsIgnoreCase("The field cannot be edited since it has passed the effective date"))
			{
				test.log(LogStatus.PASS, "The field cannot be edited since it has passed the effective date is Displayed");
				
				Thread.sleep(1000);
				cmp.Click_Okay_Button();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.FAIL, "The field cannot be edited since it has passed the effective date is not Displayed");
	
			//Click Cancel button
//			cmp.Click_CancelButton();
		}
	}
	
	@FindBy(xpath = "//label[contains(.,'Percentage')]/../../input")
	WebElement Percentage_InputBx;
	
	
	
	public void Enter_Enter_OverTime_Weekly(String Hours,String Percentage) throws Exception
	{
		Thread.sleep(1000);
		Hours_LimitInputBx.clear();
		Thread.sleep(500);
		Hours_LimitInputBx.sendKeys(Hours);
		
		Thread.sleep(1000);
		Percentage_InputBx.clear();
		Thread.sleep(500);
		Percentage_InputBx.sendKeys(Percentage);
		
	}
	
	
}
