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

public class GratuitiesPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Common_XPaths cmp;
	Utility ut=new Utility();
			
//	public GratuitiesPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	
	
	@FindBy(xpath = "//button[contains(.,'NEW GRATUITY')]")
	WebElement New_GratuityBtn;
	
	@FindBy(xpath = "//button[contains(.,'FIXED')]")
	WebElement Fixed_GratuityBtn;
	
	@FindBy(xpath = "//button[contains(.,'VARYING')]")
	WebElement Varying_GratuityBtn;
	
	@FindBy(xpath = "//label[contains(.,'Percentage')]/../../input")
	WebElement Percentage_InputBox;

	@FindBy(xpath = "//label[contains(.,'Min. Percentage')]/../../input")
	public WebElement Min_Percentage_InputBox;

	@FindBy(xpath = "//label[contains(.,'Max. Percentage')]/../../input")
	public WebElement Max_Percentage_InputBox;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Auto Gratuity')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement Auto_Gratuity_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Auto Gratuity')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement Auto_Gratuity_NoBtn;

	@FindBy(xpath = "//label[contains(.,'Auto Gratuity Seat Count')]/../../input")
	public WebElement Auto_Seat_Count_InputBox;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Enter Valid percentage')]")
	public WebElement Enter_Valid_Percentage_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Enter Valid Seat Count')]")
	public WebElement Enter_Valid_SeatCount_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Enter Valid Min.Percentage')]")
	public WebElement Enter_Valid_Min_Percentage_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Enter Valid Max.Percentage')]")
	public WebElement Enter_Valid_Max_Percentage_ErrorMsg;
	
//	@FindBy(xpath = "//label[contains(.,'Percentage')]/../../..//button[1]")
//	public WebElement UpArrow_Percentage_InputBox;
//	
//	@FindBy(xpath = "//label[contains(.,'Percentage')]/../../..//button[2]")
//	public WebElement DownArrow_Percentage_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Auto Gratuity Seat Count')]/../../..//button[1]")
	public WebElement UpArrow_Auto_Gratuity_Seat_Count_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Auto Gratuity Seat Count')]/../../..//button[2]")
	public WebElement DownArrow_Auto_Gratuity_Seat_Count_InputBox;

	public void Click_NewGratuityButton()
	{
		New_GratuityBtn.click();
	}
	
	public void Enter_GratuityName(String str) throws Exception
	{
		cmp=new Common_XPaths();
		cmp.EnterName(str);
	}
	
	@FindBy(xpath = "//mat-icon[.='arrow_drop_down']")
	WebElement ArrowDown_PercentageBtn;
	
	@FindBy(xpath = "//mat-icon[.='arrow_drop_up']")
	WebElement ArrowUp_PercentageBtn;
	
	
	public void Enter_PercentageFixed(String str) throws Exception
	{
		Percentage_InputBox.clear();
		Thread.sleep(500);
		Percentage_InputBox.sendKeys(str);
		
//		ArrowDown_PercentageBtn.click();
//		ArrowUp_PercentageBtn.click();
	}
	
	public WebElement Percentage_InputBox()
	{
		return Percentage_InputBox;
	}
	
	public void Enter_Min_PercentageFixed(String str) throws Exception
	{
		Min_Percentage_InputBox.clear();
		Thread.sleep(500);
		Min_Percentage_InputBox.sendKeys(str);
	}
	
	public WebElement Min_Percentage_InputBox()
	{
		return Min_Percentage_InputBox;
	}
	
	
	public void Enter_Max_PercentageFixed(String str) throws Exception
	{
		Max_Percentage_InputBox.clear();
		Thread.sleep(500);
		Max_Percentage_InputBox.sendKeys(str);
	}
	

	public WebElement Max_Percentage_InputBox()
	{
		return Max_Percentage_InputBox;
	}
	
	
	public void Enter_Auto_Gratuity_SeatCount(String str) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
//		cmp=new Common_XPaths();
		Thread.sleep(1000);
//		cmp.Click_YesButton();
		Auto_Gratuity_YesBtn.click();
		Thread.sleep(500);
		
		Auto_Seat_Count_InputBox.clear();
		Thread.sleep(500);
		Auto_Seat_Count_InputBox.sendKeys(str);
	}
	
	public WebElement Auto_Seat_Count_InputBox()
	{
		return Auto_Seat_Count_InputBox;
	}
	
	
	public void Select_Fixed_Gratuity() throws Exception
	{
		Thread.sleep(1000);
		Fixed_GratuityBtn.click();
	}
	
	public void Select_Varying_Gratuity() throws Exception
	{
		Thread.sleep(1000);
		Varying_GratuityBtn.click();
	}
	
	public void Enable_Auto_Gratuity() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
//		cmp=new Common_XPaths();
		Thread.sleep(2000);
		
		if(Auto_Gratuity_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Auto_Gratuity_YesBtn.click();
		}
	}
	
	public void Disable_Auto_Gratuity() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
//		cmp=new Common_XPaths();
		Thread.sleep(1000);
		
		if(Auto_Gratuity_YesBtn.isEnabled())
		{
			Auto_Gratuity_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Auto_Gratuity_Toggle()
	{
		return Auto_Gratuity_YesBtn;
	}
	
	
	
	public void Enter_Fixed_Gratuity(String str) throws Exception
	{
		cmp=new Common_XPaths();
		cmp.EnterName(str);
		
		Thread.sleep(500);
		if(Fixed_GratuityBtn.isSelected())
		{
			
		}
		else
		{
			Fixed_GratuityBtn.click();
		}
		
		Thread.sleep(500);
		Percentage_InputBox.clear();
		Thread.sleep(500);

		Percentage_InputBox.sendKeys("1000");
		
		Thread.sleep(500);
		cmp.Click_No_Toggle();
	}
	
	
	public void Enter_Variable_Gratuity(String str) throws Exception
	{
		cmp=new Common_XPaths();
		
		cmp.EnterName(str);
		
		Thread.sleep(500);
		Select_Varying_Gratuity();
		
		Thread.sleep(500);
		Enter_Min_PercentageFixed("1000");
		
		Thread.sleep(500);
		Enter_Max_PercentageFixed("5000");
		
		Thread.sleep(500);
	}
	
	public void Enter_Variable_AutoGratuity(String str) throws Exception
	{
		cmp=new Common_XPaths();
		cmp.EnterName(str);
		
		Thread.sleep(500);
		Select_Varying_Gratuity();
		
		Thread.sleep(500);
		Enter_Min_PercentageFixed("1000");
		
		Thread.sleep(500);
		Enter_Max_PercentageFixed("5000");
		
		Thread.sleep(500);
		cmp.Click_Yes_Toggle();
		
		Thread.sleep(500);
		Enter_Auto_Gratuity_SeatCount("12");
	}
	
	public void Enter_Fixed_AutoGratuity_SeatCount(String str) throws Exception
	{
		Thread.sleep(500);

		Auto_Seat_Count_InputBox.clear();
		Thread.sleep(500);

		Auto_Seat_Count_InputBox.sendKeys(str);
		Thread.sleep(500);
	}
	
	public void Enter_Fixed_AutoGratuity(String str) throws Exception
	{
		cmp=new Common_XPaths();
		cmp.EnterName(str);
		
		if(Fixed_GratuityBtn.isSelected())
		{
			
		}
		else
		{
			Fixed_GratuityBtn.click();
		}
		
		Thread.sleep(500);
		Percentage_InputBox.clear();
		Thread.sleep(500);

		Percentage_InputBox.sendKeys("2000");
		Thread.sleep(500);

		cmp.Click_Yes_Toggle();
		Thread.sleep(500);

		Auto_Seat_Count_InputBox.clear();
		Thread.sleep(500);

		Auto_Seat_Count_InputBox.sendKeys("8");
		Thread.sleep(500);

	}
	
	public void Verify_Valid_Percentage_ErrorMessage()
	{
		try
		{
			if(Enter_Valid_Percentage_ErrorMsg.isDisplayed())
			{
				test.log(LogStatus.PASS, "Please Enter Valid Percentage Alert Displayed");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception r)
		{
			test.log(LogStatus.FAIL, "Please Enter Valid Percentage Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Verify_Valid_Seat_Count_ErrorMessage()
	{
		try
		{
			if(Enter_Valid_SeatCount_ErrorMsg.isDisplayed())
			{
				test.log(LogStatus.PASS, "Please Enter Valid Seat Count Alert Displayed");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception r)
		{
			test.log(LogStatus.FAIL, "Please Enter Valid Seat Count Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	
	public void Enter_Min_Percentage(String str) throws Exception
	{
		Thread.sleep(1000);
		Min_Percentage_InputBox.clear();
		Thread.sleep(500);
		Min_Percentage_InputBox.sendKeys(str);
	}
	
	
	public void Enter_Max_Percentage(String str) throws Exception
	{
		Thread.sleep(1000);
		Max_Percentage_InputBox.clear();
		Thread.sleep(500);
		Max_Percentage_InputBox.sendKeys(str);
	}
}
