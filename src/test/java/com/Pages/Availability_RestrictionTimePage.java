package com.Pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;

public class Availability_RestrictionTimePage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	Utility ut=new Utility();
	Common_XPaths cmp=new Common_XPaths();
	
//	public Availability_RestrictionTimePage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
//	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div[contains(.,'Always')]")
	public WebElement Always_AvailabiltyBtn;
	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div[contains(.,'Days Of Week')]")
	public WebElement DaysOfWeek_AvailabiltyBtn;
	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div[contains(.,'Days Of Month')]")
	public WebElement DaysOfMonth_AvailabiltyBtn;
	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div[.='Date Range']")
	public WebElement DateRange_AvailabiltyBtn;
	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div[.='Date Range with Time']")
	public WebElement DateRangeWithTime_AvailabiltyBtn;
		
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div[contains(.,'Specific Date')]")
	public WebElement SpecificDate_AvailabiltyBtn;
		
	@FindBy(xpath = "//span[contains(.,'Restriction Time')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement RestrictionTime_YesBtn;
		
	@FindBy(xpath = "//span[contains(.,'Restriction Time')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement RestrictionTime_NoBtn;
		
	@FindBy(xpath = "//span[contains(.,'Available Time')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement AvailableTime_YesBtn;
		
	@FindBy(xpath = "//span[contains(.,'Available Time')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement AvailableTime_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Available Months')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement AvailableMonths_YesBtn;
		
	@FindBy(xpath = "//span[contains(.,'Available Months')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement AvailableMonths_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Restriction months')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement RestrictionMonths_YesBtn;
		
	@FindBy(xpath = "//span[contains(.,'Restriction months')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement RestrictionMonths_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Available Days')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement AvailableDays_YesBtn;
		
	@FindBy(xpath = "//span[contains(.,'Available Days')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement AvailableDays_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Restriction Days')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement RestrictionDays_YesBtn;
		
	@FindBy(xpath = "//span[contains(.,'Restriction Days')]/../..//app-toggle//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement RestrictionDays_NoBtn;
	
	@FindBy(xpath = "//app-time-picker[@name='startTime']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")	
	WebElement StartTime_RestrictionTimeInputBtn;	
		
	@FindBy(xpath = "//app-time-picker[@name='endTime']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")	
	WebElement EndTime_RestrictionTimeInputBtn;	
		
	@FindBy(xpath = "//div[@class='editable-data-grid']/div/div[1]/app-time-picker[@size='stretch']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")	
	WebElement StartTime_AvailableTimeInputBtn;	
		
	@FindBy(xpath = "//div[@class='editable-data-grid']/div/div[2]/app-time-picker[@size='stretch']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")	
	WebElement EndTime_AvailableTimeInputBtn;	
	
	@FindBy(xpath = "//header[contains(@class,'timepicker__header')]")
	WebElement TimePickerHeader;
	
	@FindBy(xpath = "//div[@class='timepicker-dial__time']/ngx-material-timepicker-dial-control[1]/input")
	WebElement Hours_TimeInputBox;
		
	@FindBy(xpath = "//div[@class='timepicker-dial__time']/ngx-material-timepicker-dial-control[2]/input")
	WebElement Minutes_TimeInputBox;
		
	@FindBy(xpath = "//button[contains(.,'AM')]")
	public WebElement AM_Btn;
	
	@FindBy(xpath = "//button[contains(.,'PM')]")
	public WebElement PM_Btn;
		
	@FindBy(xpath = "//div[contains(@class,'timepicker__actions')]/div/button[contains(.,'OK')]")
	WebElement OK_TimePickerBtn;
	
	@FindBy(xpath = "//div[contains(@class,'timepicker__actions')]/div/button[contains(.,'CANCEL')]")
	WebElement Cancel_TimePickerBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add New Time')]")
	WebElement Add_NewTimeBtn;
	
		@FindBy(xpath = "//label[contains(.,'Start Date')]/../../..//mat-datepicker-toggle")
		WebElement StartDate_DateRangeInputBox;
		
		@FindBy(xpath = "//label[contains(.,'End Date')]/../../..//mat-datepicker-toggle")
		WebElement EndDate_DateRangeInputBox;
		
		@FindBy(xpath = "//date-picker[@label='Date']//mat-datepicker-toggle/button")
		WebElement SpecificDate_DateRangeInputBox;
		
		@FindBy(xpath = "//span[contains(.,'Available Time')]/../../../..//app-time-picker[@name='startTime']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")
		WebElement StartTime_AvailableTimeDateRangeInputBox;
		
		@FindBy(xpath = "//span[contains(.,'Available Time')]/../../../..//app-time-picker[@name='endTime']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")
		WebElement EndTime_AvailableTimeDateRangeInputBox;
		
		@FindBy(xpath = "(//div[contains(.,'Restriction Time')]//app-time-picker[@name='startTime']//input)[1]")
		WebElement Start_Time_RestrictionTime_DateRangeWithTime;
		
		@FindBy(xpath = "(//div[contains(.,'Restriction Time')]//app-time-picker[@name='endTime']//input)[1]")
		WebElement End_Time_RestrictionTime_DateRangeWithTime;
		
		@FindBy(xpath = "//span[contains(.,'There is overlap in restriction & available time')]")
		public WebElement Overlap_Time_ErrorMsg;
		
		@FindBy(xpath = "//span[contains(.,'Start time should be less than end time')]")
		public WebElement Start_Time_Less_than_End_ErrorMsg;
		
	public void Select_AlwaysButton() throws Exception
	{
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
		Always_AvailabiltyBtn.click();
	}
	
	public WebElement Always_Availabilty()
	{
		return Always_AvailabiltyBtn;
	}
	
	
	public void Select_Days_Of_WeekButton() throws Exception
	{
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
		DaysOfWeek_AvailabiltyBtn.click();
	}
	
	public WebElement DaysOfWeek_Availabilty()
	{
		return DaysOfWeek_AvailabiltyBtn;
	}
	
	public void Select_Days_Of_MonthButton() throws Exception
	{
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
		DaysOfMonth_AvailabiltyBtn.click();
	}
	

	public WebElement DaysOfMonth_Availabilty()
	{
		return DaysOfMonth_AvailabiltyBtn;
	}
	
	public void Select_Date_RangeButton() throws Exception
	{
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
		DateRange_AvailabiltyBtn.click();
	}
	
	public WebElement DateRange_Availabilty()
	{
		return DateRange_AvailabiltyBtn;
	}
	
	
	public void Select_Specific_DateButton() throws Exception
	{
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
		SpecificDate_AvailabiltyBtn.click();
	}
	
	public WebElement SpecificDate_Availabilty()
	{
		return SpecificDate_AvailabiltyBtn;
	}
	
	
	public void Select_Date_Range_With_TimeButton() throws Exception
	{
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
		DateRangeWithTime_AvailabiltyBtn.click();
	}
	
	public WebElement DateRangeWithTime_Availabilty()
	{
		return DateRangeWithTime_AvailabiltyBtn;
	}
	
	public void Enable_Restriction_Time_Toggle() throws Exception
	{
		Thread.sleep(500);
		if(RestrictionTime_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			RestrictionTime_YesBtn.click();
		}
	}
	
	public void Enable_Available_Time_Toggle() throws Exception
	{
		
		Thread.sleep(500);
		if(AvailableTime_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			AvailableTime_YesBtn.click();
		}
	}
	
	public void Enable_Restriction_Months_Toggle() throws Exception
	{
		Thread.sleep(500);
		if(RestrictionMonths_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			RestrictionMonths_YesBtn.click();
		}
	}
	
	
	
	public void Enable_Restriction_Days_Toggle() throws Exception
	{
		Thread.sleep(500);
		if(RestrictionDays_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			RestrictionDays_YesBtn.click();
		}
	}
	
	public void Enable_Available_Months_Toggle() throws Exception
	{
		Thread.sleep(500);
		if(AvailableMonths_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			AvailableMonths_YesBtn.click();
		}
	}
	
	public void Enable_Available_Days_Toggle() throws Exception
	{
		Thread.sleep(500);
		if(AvailableDays_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			AvailableDays_YesBtn.click();
		}
	}
	
	public void Enter_RestrictionTime() throws Exception
	{
		Thread.sleep(500);
//		if(RestrictionTime_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Thread.sleep(2000);
			RestrictionTime_YesBtn.click();
//		}
		
		Thread.sleep(2000);
		StartTime_RestrictionTimeInputBtn.click();
		
//		if(TimePickerHeader.isDisplayed())
//		{
			
		
		Thread.sleep(1000);
		Hours_TimeInputBox.click();
		
		Thread.sleep(1000);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][10]")).click();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 30']")).click();
		
		Thread.sleep(1000);
		PM_Btn.click();
		
		
		Thread.sleep(1000);
		OK_TimePickerBtn.click();
//		}
		Thread.sleep(1000);
		EndTime_RestrictionTimeInputBtn.click();
		
		Thread.sleep(500);
		Thread.sleep(500);
//		Hours_TimeInputBox.clear();
		Hours_TimeInputBox.click();

		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][11]")).click();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 30']")).click();
		
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("8");
//		
//		Thread.sleep(500);
//		Minutes_TimeInputBox.clear();
//		
//		Thread.sleep(500);
//		Minutes_TimeInputBox.sendKeys("30");
		
		Thread.sleep(1000);
		PM_Btn.click();
		
		
		Thread.sleep(1000);
		OK_TimePickerBtn.click();
	}
	
	
	public void Select_Start_Restriction_Time(String Hours,String Mins, WebElement AMPM) throws Exception
	{
		Thread.sleep(1000);
		for(int i=1;i<=3;i++)
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		}
//		driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		
		StartTime_RestrictionTimeInputBtn.click();
		
//		if(TimePickerHeader.isDisplayed())
//		{
			
		
		Thread.sleep(1000);
		Hours_TimeInputBox.click();
		
		Thread.sleep(1000);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]["+Hours+"]")).click();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.sendKeys(Mins);
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 30']")).click();
		
		Thread.sleep(1000);
		AMPM.click();
		
		
		Thread.sleep(1000);
		OK_TimePickerBtn.click();
	}
	
	public void Select_End_Restriction_Time(String Hours,String Mins, WebElement AMPM) throws Exception
	{
		Thread.sleep(1000);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		Thread.sleep(1000);
		End_Time_RestrictionTime_DateRangeWithTime.click();
		
		Thread.sleep(500);
		Thread.sleep(500);
//		Hours_TimeInputBox.clear();
		Hours_TimeInputBox.click();

		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]["+Hours+"]")).click();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys(Mins);
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 30']")).click();
		
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("8");
//		
//		Thread.sleep(500);
//		Minutes_TimeInputBox.clear();
//		
//		Thread.sleep(500);
//		Minutes_TimeInputBox.sendKeys("30");
		
		Thread.sleep(1000);
		AMPM.click();
		
		
		Thread.sleep(1000);
		OK_TimePickerBtn.click();
	}
	
	public void Select_Start_Available_Time(String Hours,String Mins, WebElement AMPM) throws Exception
	{
		Thread.sleep(1000);
		for(int i=1;i<=3;i++)
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		}
		Thread.sleep(2000);
//		Thread.sleep(500);
		StartTime_AvailableTimeInputBtn.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.clear();
//		
//		Hours_TimeInputBox.sendKeys("10");
//		
//		Minutes_TimeInputBox.clear();
//		
//		Minutes_TimeInputBox.sendKeys("45");
		
		Thread.sleep(500);
		Hours_TimeInputBox.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]["+Hours+"]")).click();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys(Mins);
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 45']")).click();
		AMPM.click();
		
		Thread.sleep(500);
		OK_TimePickerBtn.click();
	}
	
	public void Select_End_Available_Time(String Hours,String Mins, WebElement AMPM) throws Exception
	{
		Thread.sleep(1000);
		EndTime_AvailableTimeInputBtn.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.clear();
//		Thread.sleep(500);
//
//		Hours_TimeInputBox.sendKeys("8");
//		Thread.sleep(500);
//
//		Minutes_TimeInputBox.clear();
//		Thread.sleep(500);
//
//		Minutes_TimeInputBox.sendKeys("15");
		
		Thread.sleep(500);
		Hours_TimeInputBox.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]["+Hours+"]")).click();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys(Mins);
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 15']")).click();
		
		AMPM.click();
		Thread.sleep(500);

		OK_TimePickerBtn.click();
		Thread.sleep(500);
	}
	
	
	public void Enter_RestrictionTime_DateRangewithTime() throws Exception
	{
		Thread.sleep(1000);
//		if(RestrictionTime_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Thread.sleep(1000);
			RestrictionTime_YesBtn.click();
//		}
		
		Thread.sleep(1000);
		Start_Time_RestrictionTime_DateRangeWithTime.click();
		
//		if(TimePickerHeader.isDisplayed())
//		{
			
		
		Thread.sleep(1000);
		Hours_TimeInputBox.click();
		
		Thread.sleep(1000);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][10]")).click();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 30']")).click();
		
		Thread.sleep(1000);
		PM_Btn.click();
		
		
		Thread.sleep(1000);
		OK_TimePickerBtn.click();
//		}
		Thread.sleep(1000);
		End_Time_RestrictionTime_DateRangeWithTime.click();
		
		Thread.sleep(500);
		Thread.sleep(500);
//		Hours_TimeInputBox.clear();
		Hours_TimeInputBox.click();

		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][11]")).click();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 30']")).click();
		
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("8");
//		
//		Thread.sleep(500);
//		Minutes_TimeInputBox.clear();
//		
//		Thread.sleep(500);
//		Minutes_TimeInputBox.sendKeys("30");
		
		Thread.sleep(1000);
		PM_Btn.click();
		
		
		Thread.sleep(1000);
		OK_TimePickerBtn.click();
	}
	
	public void Click_Add_New_Time() throws Exception
	{
		Thread.sleep(1000);
		Add_NewTimeBtn.click();
	}
	
	
	public void Enter_AvailableTime() throws Exception
	{
		Thread.sleep(500);
//		if(AvailableTime_YesBtn.isSelected())
//		{
//			
//		}
//		else 
//		{
			AvailableTime_YesBtn.click();	
//		}
		
//	
		
		Thread.sleep(500);
		Add_NewTimeBtn.click();
//		if(TimePickerHeader.isDisplayed())
//		{
		Thread.sleep(500);
		StartTime_AvailableTimeInputBtn.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.clear();
//		
//		Hours_TimeInputBox.sendKeys("10");
//		
//		Minutes_TimeInputBox.clear();
//		
//		Minutes_TimeInputBox.sendKeys("45");
		
		Thread.sleep(500);
		Hours_TimeInputBox.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][9]")).click();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys("00");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 45']")).click();
		AM_Btn.click();
		
		Thread.sleep(500);
		OK_TimePickerBtn.click();
		
		Thread.sleep(1000);
		EndTime_AvailableTimeInputBtn.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.clear();
//		Thread.sleep(500);
//
//		Hours_TimeInputBox.sendKeys("8");
//		Thread.sleep(500);
//
//		Minutes_TimeInputBox.clear();
//		Thread.sleep(500);
//
//		Minutes_TimeInputBox.sendKeys("15");
		
		Thread.sleep(500);
		Hours_TimeInputBox.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][5]")).click();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 15']")).click();
		
		PM_Btn.click();
		Thread.sleep(500);

		OK_TimePickerBtn.click();
		Thread.sleep(500);

//		}

	}
	
	@FindBy(xpath = "//span[contains(.,'Select Days')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_Select_DaysBtn;
	
	@FindBy(xpath = "//app-chip[@name='availableToMonths']//button[contains(.,'Show All')]")
	WebElement ShowAll_Available_MonthsBtn;
	
	@FindBy(xpath = "//app-chip[@name='restrictToMonths']//button[contains(.,'Show All')]")
	WebElement ShowAll_Restrict_MonthsBtn;
	
	
	
	
	public void Select_DaysOfWeek() throws Exception
	{
		cmp=new Common_XPaths();
		Thread.sleep(1500);
		Select_Days_Of_WeekButton();
		
		
		List<WebElement> daysList=driver.findElements(By.xpath("//app-days-of-week/div/div[3]/div/app-chip/div/mat-chip-list/div/mat-chip"));
		
	try
	{
		if(ShowAll_Select_DaysBtn.isDisplayed())
		{
			ShowAll_Select_DaysBtn.click();
			
			
		}
	}
	catch(Exception k) {}
	
	
		Thread.sleep(500);
		for(int i=1;i<=daysList.size();i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-days-of-week/div/div[3]/div/app-chip/div/mat-chip-list/div/mat-chip["+i+"]")).click();
		}
//		}
//		else
//		{
//			for(int i=1;i<=daysList.size();i++)
//			{
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//app-days-of-week/div/div[3]/div/app-chip/div/mat-chip-list/div/mat-chip["+i+"]")).click();
//			}
//		}
			
		
		
	}
	
	public void Select_Days_of_Month_Days() throws Exception
	{
		Thread.sleep(1000);
//		DaysOfMonth_AvailabiltyBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		
		List<WebElement> dateList=driver.findElements(By.xpath("//app-days-of-month/div/div[3]/div/mat-card/app-day-picker/div/div/div"));
		
		int datesSize=dateList.size();
		
		
		int randomDate=ThreadLocalRandom.current().nextInt(1, datesSize);
		
//		cmp.Cursor_MoveToElement(driver.findElement(By.xpath("//app-days-of-month/div/div[3]/div/mat-card/app-day-picker/div/div/div["+randomDate+"]")));
		driver.findElement(By.xpath("//app-days-of-month/div/div[3]/div/mat-card/app-day-picker/div/div/div["+randomDate+"]")).click();
		
	}
	

	
	public void Select_Available_Months() throws Exception
	{
		List<WebElement> AvailMonthsList=driver.findElements(By.xpath("//app-chip[@name='availableToMonths']/div/mat-chip-list/div/mat-chip"));
//		cmp.Cursor_MoveToElement(ShowAll_Available_MonthsBtn);
		try
		{
		if(ShowAll_Available_MonthsBtn.isDisplayed())
		{
			Thread.sleep(1000);
			ShowAll_Available_MonthsBtn.click();
		}
		}
		catch(Exception l) {}
		
		for(int j=1;j<=6;j++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-chip[@name='availableToMonths']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		
	}
	
	public void Select_Restriction_Months() throws Exception
	{
		List<WebElement> RestrictMonthsList=driver.findElements(By.xpath("//app-chip[@name='restrictToMonths']/div/mat-chip-list/div/mat-chip"));
//		cmp.Cursor_MoveToElement(ShowAll_Restrict_MonthsBtn);
		try
		{
		
		if(ShowAll_Restrict_MonthsBtn.isDisplayed())
		{
			ShowAll_Restrict_MonthsBtn.click();
		}
		}
		catch(Exception p) {}
		
		for(int j=7;j<=RestrictMonthsList.size();j++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-chip[@name='restrictToMonths']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		
	}
	
	public void Select_DaysOfMonth() throws Exception
	{
		Thread.sleep(1000);
		DaysOfMonth_AvailabiltyBtn.click();
		
		
		List<WebElement> dateList=driver.findElements(By.xpath("//app-days-of-month/div/div[3]/div/mat-card/app-day-picker/div/div/div"));
		
		int datesSize=dateList.size();
		
		
		int randomDate=ThreadLocalRandom.current().nextInt(1, datesSize);
		
		
		driver.findElement(By.xpath("//app-days-of-month/div/div[3]/div/mat-card/app-day-picker/div/div/div["+randomDate+"]")).click();
		
	try
	{
//		if(AvailableMonths_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			AvailableMonths_YesBtn.click();
//		}
		
		List<WebElement> AvailMonthsList=driver.findElements(By.xpath("//app-chip[@name='availableToMonths']/div/mat-chip-list/div/mat-chip"));
	
		try
		{
		if(ShowAll_Available_MonthsBtn.isDisplayed())
		{
			ShowAll_Available_MonthsBtn.click();
		}
		}
		catch(Exception l) {}
		
		for(int j=1;j<=6;j++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-chip[@name='availableToMonths']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		
	}
	catch(Exception g) {}
		
		Thread.sleep(1000);
//		if(RestrictionMonths_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			RestrictionMonths_YesBtn.click();
//		}
		
		
		List<WebElement> RestrictMonthsList=driver.findElements(By.xpath("//app-chip[@name='restrictToMonths']/div/mat-chip-list/div/mat-chip"));
		
		try
		{
		
		if(ShowAll_Restrict_MonthsBtn.isDisplayed())
		{
			ShowAll_Restrict_MonthsBtn.click();
		}
		}
		catch(Exception p) {}
		
		for(int j=7;j<=RestrictMonthsList.size();j++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-chip[@name='restrictToMonths']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		
		
		
	}
	
	@FindBy(xpath =  "//td[@role='gridcell']/button[contains(@class,'mat-calendar-body-cell mat-calendar-body-active')]/div[contains(@class,'mat-calendar-body-today')]")
	WebElement currentDate;
	
	public void Select_Start_Date_DateRange() throws Exception
	{
//		StartDate_DateRangeInputBox.clear();
//		StartDate_DateRangeInputBox.sendKeys("12/20/2050");
//		Thread.sleep(1000);
//
//		EndDate_DateRangeInputBox.clear();
//		EndDate_DateRangeInputBox.sendKeys("12/25/2050");
//		Thread.sleep(1000);
		
		Thread.sleep(1000);
		StartDate_DateRangeInputBox.click();
		Thread.sleep(1000);
		currentDate.click();
		
		//StartDate_DateRangeInputBox.sendKeys("1/27/2050");
		Thread.sleep(1000);
	}
	public void Select_End_Date_DateRange() throws Exception
	{
		EndDate_DateRangeInputBox.click();
		Thread.sleep(1000);
		currentDate.click();
		//EndDate_DateRangeInputBox.sendKeys("1/28/2050");
		Thread.sleep(1000);

	}
	
	@FindBy(xpath = "//span[contains(.,'Available Days')]/../../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_AvailableDaysBtn;
	
	@FindBy(xpath = "//span[contains(.,'Restriction Days')]/../../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_RestrictionDaysBtn;
	
	
	public void Select_Available_Days() throws Exception
	{
//		cmp.Cursor_MoveToElement(ShowAll_AvailableDaysBtn);
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		try
		{
			Thread.sleep(1000);
			if(ShowAll_AvailableDaysBtn.isDisplayed())
			{
				Thread.sleep(1000);
				ShowAll_AvailableDaysBtn.click();
			}
		}
		catch(Exception l) {}
		
		
		List<WebElement> AvailDaysList=driver.findElements(By.xpath("//app-chip[@name='availableDays']/div/mat-chip-list/div/mat-chip"));
		
		for(int j=1;j<=4;j++)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//app-chip[@name='availableDays']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		
	}
	
	public void Select_Restriction_Days() throws Exception
	{
		try
		{
			if(ShowAll_RestrictionDaysBtn.isDisplayed())
			{
				ShowAll_RestrictionDaysBtn.click();
			}
		}
		catch(Exception p) {}
			
		List<WebElement> RestrictDaysList=driver.findElements(By.xpath("//app-chip[@name='restrictDays']/div/mat-chip-list/div/mat-chip"));
		Thread.sleep(1000);

		for(int j=5;j<=RestrictDaysList.size();j++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-chip[@name='restrictDays']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
			
	}
	
		public void Select_DateRange() throws Exception
		{
			Thread.sleep(1000);
			DateRange_AvailabiltyBtn.click();
			Thread.sleep(1000);
	
			Select_Start_Date_DateRange();
			
			Select_End_Date_DateRange();
			
			try
			{
			if(AvailableDays_YesBtn.isDisplayed())
			{
//			if(AvailableDays_YesBtn.isSelected())
//			{
//				
//			}
//			else
//			{
				Thread.sleep(1000);
				AvailableDays_YesBtn.click();
//			}
			try
			{
				if(ShowAll_AvailableDaysBtn.isDisplayed())
				{
					ShowAll_AvailableDaysBtn.click();
				}
			}
			catch(Exception l) {}
			
			
			List<WebElement> AvailDaysList=driver.findElements(By.xpath("//app-chip[@name='availableDays']/div/mat-chip-list/div/mat-chip"));
			
			for(int j=1;j<=4;j++)
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//app-chip[@name='availableDays']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
			}
			}
			}
			catch(Exception h) {}
			
			Thread.sleep(3000);
//			if(RestrictionDays_YesBtn.isSelected())
//			{
//				
//			}
//			else
//			{
			try
			{
				if(RestrictionDays_YesBtn.isDisplayed())
				{
				RestrictionDays_YesBtn.click();
//			}
			try
			{
				if(ShowAll_RestrictionDaysBtn.isDisplayed())
				{
					ShowAll_RestrictionDaysBtn.click();
				}
			}
			catch(Exception p) {}
				
			List<WebElement> RestrictDaysList=driver.findElements(By.xpath("//app-chip[@name='restrictDays']/div/mat-chip-list/div/mat-chip"));
			Thread.sleep(1000);

			for(int j=5;j<=RestrictDaysList.size();j++)
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//app-chip[@name='restrictDays']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
			}
				}
			}
			catch(Exception lp) {}
			Thread.sleep(1000);

			 
			Enter_RestrictionTime();
			Thread.sleep(1000);

			try
			{
			Enter_AvailableTime();
			}
			catch(Exception k) {}
		}
	
	public void Select_Specific_Date() throws Exception
	{
//		cmp.Cursor_MoveToElement(SpecificDate_DateRangeInputBox);
		
		Thread.sleep(1000);
//		SpecificDate_AvailabiltyBtn.click();
		Thread.sleep(1000);
		SpecificDate_DateRangeInputBox.click();
		currentDate.click();
//		SpecificDate_DateRangeInputBox.sendKeys("12/30/2040");

		driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		for(int i=1;i<=4;i++)
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		}
		
		Thread.sleep(2000);
//		Enter_RestrictionTime();
//		
//		for(int i=1;i<=3;i++)
//		{
//			driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
//		}
//		
//		
//		Thread.sleep(1000);
//
//		try
//		{
//		Enter_AvailableTime();
//		}
//		catch(Exception h) {}
	}
	
	public void Select_Start_Time_Available_Time_DateRange() throws Exception
	{
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		}
		
		Thread.sleep(1000);
		StartTime_AvailableTimeDateRangeInputBox.click();
		
//		Hours_TimeInputBox.clear();
//		
//		Hours_TimeInputBox.sendKeys("10");
//		
//		Minutes_TimeInputBox.clear();
//		
//		Minutes_TimeInputBox.sendKeys("00");
//		
		
		Thread.sleep(1000);
		Hours_TimeInputBox.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][10]")).click();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')][1]")).click();
		
		Thread.sleep(1000);
		AM_Btn.click();
		
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", OK_TimePickerBtn);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.elementToBeClickable(OK_TimePickerBtn));
		OK_TimePickerBtn.click(); 
	}
	
	public void Select_End_Time_Available_Time_DateRange() throws Exception
	{
		Thread.sleep(2000);
		EndTime_AvailableTimeDateRangeInputBox.click();
		
//		Hours_TimeInputBox.clear();
//		
//		Hours_TimeInputBox.sendKeys("08");
//		
//		Minutes_TimeInputBox.clear();
//		
//		Minutes_TimeInputBox.sendKeys("30");
		
		Thread.sleep(1000);
		Hours_TimeInputBox.click();
		
		Thread.sleep(1000);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][8]")).click();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')][30]")).click();
		
		
		Thread.sleep(1000);
		PM_Btn.click();
		Thread.sleep(1000);
		OK_TimePickerBtn.click();
	}
	
	public void Select_DateRangeWithTime() throws Exception
	{
		JavascriptExecutor js1=(JavascriptExecutor)driver;

		Thread.sleep(2000);
		DateRangeWithTime_AvailabiltyBtn.click();
		Thread.sleep(1000);
		Select_Start_Date_DateRange();
		
		Select_End_Date_DateRange();
		
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		}
		
		Thread.sleep(1000);
		StartTime_AvailableTimeDateRangeInputBox.click();
		
//		Hours_TimeInputBox.clear();
//		
//		Hours_TimeInputBox.sendKeys("10");
//		
//		Minutes_TimeInputBox.clear();
//		
//		Minutes_TimeInputBox.sendKeys("00");
//		
		
		Thread.sleep(1000);
		Hours_TimeInputBox.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][10]")).click();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')][1]")).click();
		
		Thread.sleep(1000);
		AM_Btn.click();
		
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", OK_TimePickerBtn);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.elementToBeClickable(OK_TimePickerBtn));
		OK_TimePickerBtn.click(); 
		
		Thread.sleep(2000);
		EndTime_AvailableTimeDateRangeInputBox.click();
		
//		Hours_TimeInputBox.clear();
//		
//		Hours_TimeInputBox.sendKeys("08");
//		
//		Minutes_TimeInputBox.clear();
//		
//		Minutes_TimeInputBox.sendKeys("30");
		
		Thread.sleep(1000);
		Hours_TimeInputBox.click();
		
		Thread.sleep(1000);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')][8]")).click();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(1000);
		Minutes_TimeInputBox.sendKeys("30");
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')][30]")).click();
		
		
		Thread.sleep(1000);
		PM_Btn.click();
		Thread.sleep(1000);
		OK_TimePickerBtn.click();
		
		try
		{
		
//		if(AvailableDays_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
		Thread.sleep(1000);
			AvailableDays_YesBtn.click();
//		}
		
			
		List<WebElement> AvailDaysList=driver.findElements(By.xpath("//app-chip[@name='availableDays']/div/mat-chip-list/div/mat-chip"));
		
		try
		{
		if(ShowAll_AvailableDaysBtn.isDisplayed())
		{
			ShowAll_AvailableDaysBtn.click();
		}
		}
		catch(Exception l) {}
		
		for(int j=1;j<=4;j++)
		{
			driver.findElement(By.xpath("//app-chip[@name='availableDays']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		}
		catch(Exception k) {}
		
		Thread.sleep(1000);
//		if(RestrictionDays_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);

//		js1.executeScript("arguments[0].scrollIntoView(true);", RestrictionDays_YesBtn);
//driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		
		Thread.sleep(1000);
		try
		{
			if(RestrictionDays_YesBtn.isDisplayed())
			{
				RestrictionDays_YesBtn.click();
//				}
					
					Thread.sleep(1000);
//					driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
//					js1.executeScript("arguments[0].scrollIntoView(true);", ShowAll_RestrictionDaysBtn);
//					if(ShowAll_RestrictionDaysBtn.isDisplayed())
//					{
//						ShowAll_RestrictionDaysBtn.click();
//					}
//					
				
				
					
				List<WebElement> RestrictDaysList=driver.findElements(By.xpath("//app-chip[@name='restrictDays']/div/mat-chip-list/div/mat-chip"));
				Thread.sleep(1000);
				
				try
				{
				if(ShowAll_RestrictionDaysBtn.isDisplayed())
				{
					ShowAll_RestrictionDaysBtn.click();
				}
				}
				catch(Exception p) {}
				
				Thread.sleep(1000);
				for(int j=5;j<=RestrictDaysList.size();j++)
				{
					Thread.sleep(1000);
//					if(driver.findElement(By.xpath("//app-chip[@name='restrictDays']/div/mat-chip-list/div/mat-chip["+j+"]")).isSelected())
//					{
//						
//					}
//					else
//					{
					driver.findElement(By.xpath("//app-chip[@name='restrictDays']/div/mat-chip-list/div/mat-chip["+j+"]")).click();
//					}
				}
			}
		}
		catch(Exception po)
		{
		}
		
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
		}
		
		try
		{
		Thread.sleep(1000);
		if(RestrictionTime_YesBtn.isDisplayed())
		{
			
			Enter_RestrictionTime_DateRangewithTime();
		}
		}
		catch(Exception h) {}
	}
	
	//mat-chip-list[@id='mat-chip-list-27']/div/mat-chip
	//mat-chip-list[@id='mat-chip-list-30']/div/mat-chip
	
	//app-days-of-week/div/div[3]/div/app-chip/div/mat-chip-list/div/mat-chip
	//span[contains(.,'Select Days')]/../../../div[3]/div/app-chip/div/mat-chip-list/div/mat-chip
		
	//mat-card/app-day-picker/div/div/div
		
	//app-days-of-month/div/div[3]/div/mat-card/app-day-picker/div/div/div
	
	
	//span[contains(.,'Available Months')]/../../../..//div/app-chip/div/mat-chip-list/div/mat-chip

	//mat-chip-list[@id='mat-chip-list-18']/div/mat-chip
	
}
