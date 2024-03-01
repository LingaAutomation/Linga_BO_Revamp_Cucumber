package com.Pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class UpchargesPage extends BasePage
{
//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Common_XPaths cmp=new Common_XPaths();
	
//	public UpchargesPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver, test);
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW UPCHARGE')]")
	WebElement New_UpchargeBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Include Additional Modifiers')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement IncludeAdditionalModifiers_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Include Additional Modifiers')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement IncludeAdditionalModifiers_NoBtn;
	
	@FindBy(xpath = "//app-radio-box-button/div/div/div[.='Category']")
	public WebElement CategoryLevelTypeBtn;
	
	@FindBy(xpath = "//app-radio-box-button/div/div/div[.='Sub Category']")
	public WebElement SubCategoryLevelTypeBtn;
	
	@FindBy(xpath = "//app-radio-box-button/div/div/div[.='Menu Item']")
	public WebElement MenuItemLevelTypeBtn;

	@FindBy(xpath = "//input[@placeholder='Select Category']")
	public WebElement Category_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Category')]/../../..//button")
	WebElement Remove_Icon_Category_LevelType;

	@FindBy(xpath = "//input[@placeholder='Select Sub Category']")
	public WebElement SubCategory_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Sub Category')]/../../..//button")
	WebElement Remove_Icon_SubCategory_LevelType;

	@FindBy(xpath = "//label[contains(.,'Menu Item')]/../..//div/input")
	public WebElement MenuItem_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Menu Item')]/../../..//button")
	WebElement Remove_Icon_MenuItem_LevelType;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Restrict POS visibility by user role')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement RestrictPOSvisibility_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Restrict POS visibility by user role')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement RestrictPOSvisibility_NoBtn;
	
	@FindBy(xpath = "//mat-button-toggle[.='$']")
	public WebElement Amount_inUpchargeBtn;
	
	
	@FindBy(xpath = "//mat-button-toggle[.='%']")
	public WebElement Percentage_inUpchargeBtn;
	
	//app-input[@label='Upcharge Amount']/div/div/mat-form-field/div/div[1]/div[4]/input
	
	@FindBy(xpath = "//input[@aria-label='Upcharge Percentage']")
	public WebElement Percentage_InputBox;
	
	@FindBy(xpath = "//input[@aria-label='Upcharge Amount']")
	public WebElement Amount_InputBox;
	
	@FindBy(xpath = "//app-time-picker[@label='startTime']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")	
	WebElement StartTime_RestrictionTimeInputBtn;	
		
	@FindBy(xpath = "//app-time-picker[@label='endTime']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")	
	WebElement EndTime_RestrictionTimeInputBtn;	
	
	//app-time-picker[@label='Start Time']/div/app-input/div/div/mat-form-field/div/div/div[4]/input
	
	
	@FindBy(xpath = "//app-time-picker[@label='Start Time']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")	
	WebElement StartTime_RestrictionTimeInputBtn2;	
		
	@FindBy(xpath = "//app-time-picker[@label='End Time']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")	
	WebElement EndTime_RestrictionTimeInputBtn2;	
	
	
	@FindBy(xpath = "//header[contains(@class,'timepicker__header')]")
	WebElement TimePickerHeader;
	
	@FindBy(xpath = "//div[@class='timepicker-dial__time']/ngx-material-timepicker-dial-control[1]/input")
	WebElement Hours_TimeInputBox;
		
	@FindBy(xpath = "//div[@class='timepicker-dial__time']/ngx-material-timepicker-dial-control[2]/input")
	WebElement Minutes_TimeInputBox;
		
	@FindBy(xpath = "//button[contains(.,'AM')]")
	WebElement AM_Btn;
	
	@FindBy(xpath = "//button[contains(.,'PM')]")
	WebElement PM_Btn;
		
	@FindBy(xpath = "//button[contains(@class,'time-picker-button') and contains(.,'OK')]")
	WebElement OK_TimePickerBtn;
	
	@FindBy(xpath = "//button[contains(@class,'time-picker-button') and contains(.,'CANCEL')]")
	WebElement Cancel_TimePickerBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add New Time')]")
	WebElement Add_NewTimeBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Restriction Time')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement RestrictionTime_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Restriction Time')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement RestrictionTime_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Restriction Days')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement RestrictionDays_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Restriction Days')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement RestrictionDays_NoBtn;
	
	@FindBy(xpath = "//div[@class='radio-box']/div[.='Date Range']")
	WebElement DateRange_AvailabiltyBtn;
	
	@FindBy(xpath = "//div[@class='radio-box']/div[.='Date Range with Time']")
	WebElement DateRangeWithTime_AvailabiltyBtn;
	
	@FindBy(xpath = "//span[contains(.,'Start Date')]/../../div[4]/mat-datepicker-toggle/button")
	WebElement StartDate_DateRangeInputBox;
	
	@FindBy(xpath = "//span[contains(.,'End Date')]/../../div[4]/mat-datepicker-toggle/button")
	WebElement EndDate_DateRangeInputBox;
	
	@FindBy(xpath = "//app-toggle[contains(.,'DAYS OF WEEK')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement DAYS_OF_WEEk_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'DAYS OF WEEK')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement DAYS_OF_WEEk__NoBtn;
	
	@FindBy(xpath = "//div[@class='radio-box']/div[contains(.,'Specific Date')]")
	WebElement SpecificDate_AvailabiltyBtn;
	
	@FindBy(xpath = "//span[contains(.,'Date')]/../../div[4]/mat-datepicker-toggle/button")
	WebElement DateInputBox;
	
	@FindBy(xpath = "//span[contains(.,'Please Select Categories')]")
	public WebElement Select_Categories_Error_Msg;
	
	@FindBy(xpath = "//span[contains(.,'Please Select Subcategories')]")
	public WebElement Select_SubCategories_Error_Msg;
	
	@FindBy(xpath = "//span[contains(.,'Please Select Menu Items')]")
	public WebElement Select_MenuItems_Error_Msg;
	
	@FindBy(xpath = "//span[contains(.,'Upcharge Amount should not be more than 17 characters')]")
	public WebElement Upcharge_Amount_Excess_Error_Msg;
	
	@FindBy(xpath = "//span[contains(.,'Please select at least one role')]")
	public WebElement Select_Role_Error_Msg;
	
	public void Select_SpecificDate() throws Exception
	{
		Thread.sleep(1000);
		SpecificDate_AvailabiltyBtn.click();
		Thread.sleep(1000);
		
		DateInputBox.click();
		driver.findElement(By.xpath("//button[contains(@class,'mat-calendar-body-active')]")).click();

		Enter_RestrictionTime();
		Thread.sleep(1000);

	//	Enter_AvailableTime();
	}
	
	
	public void Select_DateRangeWithTime() throws Exception
	{
		DateRangeWithTime_AvailabiltyBtn.click();
		
		Enter_StartDate_EndDate_DateRange();
		
		if(RestrictionTime_YesBtn.isSelected())
		{
			
		}
		else
		{
			RestrictionTime_YesBtn.click();
		}
		
		StartTime_RestrictionTimeInputBtn2.click();
		
		Hours_TimeInputBox.clear();
		
		Hours_TimeInputBox.sendKeys("10");
		
		Minutes_TimeInputBox.clear();
		
		Minutes_TimeInputBox.sendKeys("00");
		
		AM_Btn.click();
		
		OK_TimePickerBtn.click();
		
		EndTime_RestrictionTimeInputBtn2.click();
		
		Hours_TimeInputBox.clear();
		
		Hours_TimeInputBox.sendKeys("08");
		
		Minutes_TimeInputBox.clear();
		
		Minutes_TimeInputBox.sendKeys("30");
		
		PM_Btn.click();
		
		OK_TimePickerBtn.click();
		
		if(DAYS_OF_WEEk_YesBtn.isSelected())
		{
			
		}
		else
		{
			DAYS_OF_WEEk_YesBtn.click();
		}
		
		driver.findElement(By.xpath("//button[contains(.,'Show All')]")).click();Thread.sleep(500);
		
		List<WebElement> AvailDaysList=driver.findElements(By.xpath("//mat-chip-list/div/mat-chip"));
		
		for(int j=1;j<=AvailDaysList.size()-2;j++)
		{
			driver.findElement(By.xpath("//mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		
		
		Thread.sleep(1000);
		/*if(RestrictionDays_YesBtn.isSelected())
		{
			
		}
		else
		{
			RestrictionDays_YesBtn.click();
		}
		
		driver.findElement(By.xpath("//button[contains(.,'Show All')]")).click();Thread.sleep(500);
		
		List<WebElement> RestrictDaysList=driver.findElements(By.xpath("//app-chip[contains(@name,'restrictDays')]/div/mat-chip-list/div/mat-chip"));
		Thread.sleep(1000);

		for(int j=RestrictDaysList.size()-1;j<=RestrictDaysList.size();j++)
		{
			driver.findElement(By.xpath("//app-chip[contains(@name,'restrictDays')]/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		
		Thread.sleep(1000);
		
		
		Enter_AVLRestrictionTime();
		*/
	}
	
	
	public void Enter_StartDate_EndDate_DateRange() throws Exception
	{
		//StartDate_DateRangeInputBox.clear();
		StartDate_DateRangeInputBox.click();
		driver.findElement(By.xpath("//button[contains(@class,'mat-calendar-body-active')]")).click();
		Thread.sleep(1000);

		//EndDate_DateRangeInputBox.clear();
		EndDate_DateRangeInputBox.click();
		driver.findElement(By.xpath("//button[contains(@class,'mat-calendar-body-active')]")).click();
		Thread.sleep(1000);

	}
	
	public void Select_DateRange() throws Exception
	{
		Thread.sleep(1000);
		DateRange_AvailabiltyBtn.click();
		Thread.sleep(1000);

		Enter_StartDate_EndDate_DateRange();		
		/*
		if(AvailableDays_YesBtn.isSelected())
		{
			
		}
		else
		{
			AvailableDays_YesBtn.click();
		}
		
		driver.findElement(By.xpath("(//button[contains(.,'Show All')])[2]")).click();Thread.sleep(500);
		
		List<WebElement> AvailDaysList=driver.findElements(By.xpath("//mat-chip-list/div/mat-chip"));
		
		for(int j=1;j<=AvailDaysList.size()-2;j++)
		{
			driver.findElement(By.xpath("//mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		*/
		
		Thread.sleep(1000);
		if(RestrictionDays_YesBtn.isSelected())
		{
			
		}
		else
		{
			RestrictionDays_YesBtn.click();
		}
		driver.findElement(By.xpath("//button[contains(.,'Show All')]")).click();Thread.sleep(500);
		
		List<WebElement> RestrictDaysList=driver.findElements(By.xpath("//app-chip[contains(@name,'restrictDays')]/div/mat-chip-list/div/mat-chip"));
		Thread.sleep(1000);

		for(int j=RestrictDaysList.size()-1;j<=RestrictDaysList.size();j++)
		{
			driver.findElement(By.xpath("//app-chip[contains(@name,'restrictDays')]/div/mat-chip-list/div/mat-chip["+j+"]")).click();
		}
		
		Thread.sleep(1000);

		Enter_RestrictionTime();
		Thread.sleep(1000);

	//	Enter_AvailableTime();
	}

	
	public void Enter_RestrictionTime() throws Exception
	{
		Thread.sleep(500);
		if(RestrictionTime_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(500);
			RestrictionTime_YesBtn.click();
		}
		
		for(int i = 1; i <= 3;i++) {driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);}
		Thread.sleep(500);
		//driver.findElement(By.xpath("//app-time-picker[@label='Start Time *']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")).click();
		StartTime_RestrictionTimeInputBtn.click();
//		if(TimePickerHeader.isDisplayed())
//		{
			
		
		Thread.sleep(500);
		Hours_TimeInputBox.clear();
		
		Thread.sleep(500);
		Hours_TimeInputBox.sendKeys("10");
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys("30");
		
		Thread.sleep(500);
		AM_Btn.click();
		
		
		Thread.sleep(500);
		OK_TimePickerBtn.click();
//		}
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//app-time-picker[@label='End Time *']/div/app-input/div/div/mat-form-field/div/div/div[4]/input")).click();
		EndTime_RestrictionTimeInputBtn.click();
		Thread.sleep(500);
		Thread.sleep(500);
		Hours_TimeInputBox.clear();
		
		Thread.sleep(500);
		Hours_TimeInputBox.sendKeys("8");
		
		Thread.sleep(500);
		Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		Minutes_TimeInputBox.sendKeys("30");
		
		Thread.sleep(500);
		PM_Btn.click();
		
		
		Thread.sleep(500);
		OK_TimePickerBtn.click();
	}
	
	public void Enter_Upcharge_Amount(String str) throws Exception
	{
		Thread.sleep(500);
		Amount_InputBox.clear();
		Thread.sleep(500);
		Amount_InputBox.sendKeys(str);
	}
	
	public void Enter_Upcharge_Percentage(String str) throws Exception
	{
		Thread.sleep(500);
		Percentage_InputBox.clear();
		Thread.sleep(500);
		Percentage_InputBox.sendKeys(str);
	}
	
	public void Click_NewUpcharge() throws Exception
	{
		Thread.sleep(1000);
		New_UpchargeBtn.click();
	}
	
	public WebElement Category_LevelType()
	{
		return CategoryLevelTypeBtn;
	}
	
	public WebElement SubCategory_LevelType()
	{
		return SubCategoryLevelTypeBtn;
	}
	
	public WebElement MenuItem_LevelType()
	{
		return MenuItemLevelTypeBtn;
	}
	
	public void Select_UpchargeType_Amount() throws Exception
	{
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(1000);
		Amount_inUpchargeBtn.click();
	}
	
	public void Select_UpchargeType_Percentage() throws Exception
	{
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(1000);
		Percentage_inUpchargeBtn.click();
	}
	
	public void Select_LevelType_Category() throws Exception
	{
		Thread.sleep(1000);
		
			if(cmp.Level_Tab_inContents.isDisplayed())
			{
				Thread.sleep(1000);
				cmp.Level_Tab_inContents.click();
			}
			
			Thread.sleep(1000);
			CategoryLevelTypeBtn.click();
		
	}
	
	public void Select_LevelType_Category_GeneralTab() throws Exception
	{
		Thread.sleep(1000);
	
			if(cmp.Genaral_Tab_inContents.isDisplayed())
			{
				Thread.sleep(1000);
				cmp.Genaral_Tab_inContents.click();
			}
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			CategoryLevelTypeBtn.click();
		
		
	
		
	}
	
	public void Select_LevelType_SubCategory_GeneralTab() throws Exception
	{
		Thread.sleep(1000);
		if(cmp.Genaral_Tab_inContents.isDisplayed())
		{
			cmp.Genaral_Tab_inContents.click();
		}
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		SubCategoryLevelTypeBtn.click();
	}
	
	public void Select_LevelType_SubCategory() throws Exception
	{
		Thread.sleep(1000);
//		try
//		{
			if(cmp.Level_Tab_inContents.isDisplayed())
			{
				cmp.Level_Tab_inContents.click();
			}
//		}
//		catch(Exception k)
//		{
//			
		Thread.sleep(1000);
		SubCategoryLevelTypeBtn.click();
	}
	
	public void Select_LevelType_MenuItem_GeneralTab() throws Exception
	{
		Thread.sleep(1000);
	
		if(cmp.Genaral_Tab_inContents.isDisplayed())
		{
			cmp.Genaral_Tab_inContents.click();
		}
//	}
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	MenuItemLevelTypeBtn.click();
	}
	
	public void Select_LevelType_MenuItem() throws Exception
	{
		Thread.sleep(1000);
		
			if(cmp.Level_Tab_inContents.isDisplayed())
			{
				cmp.Level_Tab_inContents.click();
			}
		
		Thread.sleep(1000);
		MenuItemLevelTypeBtn.click();
	}
	
	
	public void Select_Categories_inLevelType() throws Exception
	{
		cmp=new Common_XPaths();
		
//		Thread.sleep(1000);
//		CategoryLevelTypeBtn.click();
		Thread.sleep(5000);
		
		
		//driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
//		for(int i=1;i<=3;i++)
//		{
			Thread.sleep(3000);
		Category_InputBox.click();
		Thread.sleep(1000);
		
		
		List<WebElement> CategoryList=driver.findElements(By.xpath("//div/select-option"));
		
		int CategorySize=CategoryList.size();
		
		System.out.println(CategorySize);
		
//		try
//		{
		Thread.sleep(1000);
		List<WebElement> departList=driver.findElements(By.xpath("//div/select-option"));
		
		int deptSize=departList.size();
		
		if(deptSize>1&&deptSize<=6)
		{
			int randomDept=ThreadLocalRandom.current().nextInt(1, deptSize);
			
			String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//			
//			Category_InputBox.sendKeys(opt);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//select-option//div[contains(.,'"+opt+"')]")).click();
		
		}
		else if(deptSize>=6)
		{
			int randomDept=ThreadLocalRandom.current().nextInt(1, 6);
			
			String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//			
//			Category_InputBox.sendKeys(opt);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//select-option//div[contains(.,'"+opt+"')]")).click();
		
		}
		else if(deptSize==1)
		{
			driver.findElement(By.xpath("//div[1]/select-option")).click();

		}
			
		
		
		
		Thread.sleep(3000);
		List<WebElement> departList1=driver.findElements(By.xpath("//div/select-option"));

		if(departList1.size()!=0)
		{
			Category_InputBox.click();
		}
//		}
//		catch(Exception e)
//		{
//			cmp.FirstOption_DropBtn.click();
//		}
	
//	}

				
		}
	
	
	public void Select_SubCategories_inLevelType() throws Exception
	{
	cmp=new Common_XPaths();
		
//		Thread.sleep(1000);
//		SubCategoryLevelTypeBtn.click();
		Thread.sleep(15000);
		
		//driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
		SubCategory_InputBox.click();
		Thread.sleep(1000);
		
		
		List<WebElement> SubCategoryList=driver.findElements(By.xpath("//div/select-option"));
		
		int SubCategorySize=SubCategoryList.size();
		
		System.out.println(SubCategorySize);
		
		
		
//		try
//		{
		Thread.sleep(1000);
		List<WebElement> departList=driver.findElements(By.xpath("//div/select-option"));
		
		int deptSize=departList.size();
		
//		
		if(deptSize>1&&deptSize<=6)
		{
			int randomDept=ThreadLocalRandom.current().nextInt(1, deptSize);
			
			String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//			
//			Category_InputBox.sendKeys(opt);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//select-option//div[contains(.,'"+opt+"')]")).click();
		
		}
		else if(deptSize>=6)
		{
			int randomDept=ThreadLocalRandom.current().nextInt(1, 6);
			
			String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//			
//			Category_InputBox.sendKeys(opt);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//select-option//div[contains(.,'"+opt+"')]")).click();
		
		}
		else if(deptSize==1)
		{
			driver.findElement(By.xpath("//div[1]/select-option")).click();

		}
		
//		int randomDept=ThreadLocalRandom.current().nextInt(1, deptSize);
//		
//		String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//		
//		Category_InputBox.sendKeys(opt);
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//select-option//div[contains(.,'"+opt+"')]")).click();
		Thread.sleep(3000);
		List<WebElement> departList1=driver.findElements(By.xpath("//div/select-option"));

		if(departList1.size()!=0)
		{
			SubCategory_InputBox.click();
		}
//		}
//		catch(Exception e)
//		{
//			cmp.FirstOption_DropBtn.click();
//		}
		}
	}
	
	public void Select_MenuItems_inLevelType() throws Exception
	{
cmp=new Common_XPaths();
		
//		Thread.sleep(1000);
//		MenuItemLevelTypeBtn.click();
		Thread.sleep(15000);
		
		//driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
		MenuItem_InputBox.click();
		Thread.sleep(1000);
		
		
		List<WebElement> MenuItemList=driver.findElements(By.xpath("//div/select-option"));
		
		int MenuItemSize=MenuItemList.size();
		
		System.out.println(MenuItemSize);
		
//		try
//		{
		Thread.sleep(1000);
		List<WebElement> departList=driver.findElements(By.xpath("//div/select-option"));
		
		int deptSize=departList.size();
		
		if(deptSize>1&&deptSize<=6)
		{
			int randomDept=ThreadLocalRandom.current().nextInt(1, deptSize);
			
			String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//			
//			Category_InputBox.sendKeys(opt);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//select-option//div[contains(.,'"+opt+"')]")).click();
		
		}
		else if(deptSize>=6)
		{
			int randomDept=ThreadLocalRandom.current().nextInt(1, 6);
			
			String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//			
//			Category_InputBox.sendKeys(opt);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//select-option//div[contains(.,'"+opt+"')]")).click();
		
		}
		else if(deptSize==1)
		{
			driver.findElement(By.xpath("//div[1]/select-option")).click();

		}
//		
//		int randomDept=ThreadLocalRandom.current().nextInt(1, deptSize);
//		
//		String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//		
//		MenuItem_InputBox.sendKeys(opt);
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//select-option//div[contains(.,'"+opt+"')]")).click();
		Thread.sleep(3000);
		List<WebElement> departList1=driver.findElements(By.xpath("//div/select-option"));

		if(departList1.size()!=0)
		{
			MenuItem_InputBox.click();
		}
//		}
//		catch(Exception e)
//		{
//			cmp.FirstOption_DropBtn.click();
//		}
	
	}
	}
	
	public void Remove_Categories_inLevelType() throws Exception
	{
		Thread.sleep(1000);
		cmp.Level_Tab_inContents.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Remove_Icon_Category_LevelType.click();
	}
	
	public void Remove_SubCategories_inLevelType() throws Exception
	{
		Thread.sleep(1000);
		cmp.Level_Tab_inContents.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Remove_Icon_SubCategory_LevelType.click();
	}
	
	public void Remove_MenuItems_inLevelType() throws Exception
	{
		Thread.sleep(1000);
		cmp.Level_Tab_inContents.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Remove_Icon_MenuItem_LevelType.click();
	}
	
	public void Enable_IncludeAdditionalModifiers() throws Exception
	{
		Thread.sleep(1000);
		if(IncludeAdditionalModifiers_YesBtn.isEnabled()) 
		{
			
		}
		else
		{
			Thread.sleep(1000);
			IncludeAdditionalModifiers_YesBtn.click();
		}
	}
	
	public void Disable_IncludeAdditionalModifiers() throws Exception
	{
		Thread.sleep(1000);
		if(IncludeAdditionalModifiers_YesBtn.isEnabled()) 
		{
			Thread.sleep(1000);
			IncludeAdditionalModifiers_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public void Enable_RestrictPOSVisiblity() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		if(RestrictPOSvisibility_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Thread.sleep(1000);

			RestrictPOSvisibility_YesBtn.click();
		}
	}
	
	public void Disable_RestrictPOSVisiblity() throws Exception
	{
		Thread.sleep(1000);
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);

		if(RestrictPOSvisibility_YesBtn.isSelected()) 
		{
			Thread.sleep(1000);

			RestrictPOSvisibility_NoBtn.click();
		}
		else
		{
		
		}
	}
}