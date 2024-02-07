package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;

public class ReasonsPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	Utility ut=new Utility();
	Common_XPaths cmp=new Common_XPaths();
	
//	public ReasonsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW REASON')]")
	WebElement NewReasonBtn;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Tax Exempt')]")
	public WebElement Tax_Exempt_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Paid Out')]")
	public WebElement Paid_Out_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Paid In')]")
	public WebElement Paid_In_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Void')]")
	public WebElement Void_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Over/Shortage')]")
	public WebElement Over_Shoratage_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Attach Request')]")
	public WebElement Attach_Request_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Break')]")
	public WebElement Break_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Refund')]")
	public WebElement Refund_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Layaway')]")
	public WebElement Layaway_ReasonType;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Exchange')]")
	public WebElement Exchange_ReasonType;
	
	@FindBy(tagName = "textarea")
	public WebElement ReasonInputBox;
	
	@FindBy(xpath = "//div[contains(.,'Reason Should Not Be More Than 25 Characters')][contains(@class,'color-red')]")
	public WebElement Reason_Input_ErrorMsg;
	
	public void Click_NewReasonButton()
	{
		NewReasonBtn.click();
	}
	
	
	public WebElement TaxExemptReasonType()
	{
		return Tax_Exempt_ReasonType;
	}
	
	public WebElement PaidOutReasonType()
	{
		return Paid_Out_ReasonType;
	}
	
	public WebElement PaidInReasonType()
	{
		return Paid_In_ReasonType;
	}
	
	public WebElement VoidReasonType()
	{
		return Void_ReasonType;
	}
	
	public WebElement OverShoratageReasonType()
	{
		return Over_Shoratage_ReasonType;
	}
	
	public WebElement AttachRequestReasonType()
	{
		return Attach_Request_ReasonType;
	}
	

	
	
	public void Select_Tax_Exempt_Reason() throws Exception
	{
//		Thread.sleep(1000);
//		if(TaxExemptReasonType.isSelected())
//		{
//			
//		}
//		else
//		{
			Thread.sleep(1000);
			Tax_Exempt_ReasonType.click();
//		}
//		
//		Thread.sleep(1000);
//		ReasonInputBox.clear();
//		Thread.sleep(1000);
//		ReasonInputBox.sendKeys(str);
	}
	
	public void Enter_Reason_Name(String str) throws Exception
	{
		Thread.sleep(1000);
		ReasonInputBox.clear();
		Thread.sleep(1000);
		ReasonInputBox.sendKeys(str);
	}
	 
	
	public void Select_Paid_Out_Reason() throws Exception
	{
//		Thread.sleep(1000);
////		if(PaidOutReasonType.isSelected())
////		{
////			
////		}
////		else
////		{
			Thread.sleep(1000);
			Paid_Out_ReasonType.click();
//		}
//		
//		Thread.sleep(1000);
//		ReasonInputBox.clear();
//		Thread.sleep(1000);
//		ReasonInputBox.sendKeys(str);
	}
	
	
	public void Select_Paid_In_Reason() throws Exception
	{
//		Thread.sleep(1000);
//		if(PaidInReasonType.isSelected())
//		{
//			
//		}
//		else
//		{
			Thread.sleep(1000);
			Paid_In_ReasonType.click();
//		}
//		
//		Thread.sleep(1000);
//		ReasonInputBox.clear();
//		Thread.sleep(1000);
//		ReasonInputBox.sendKeys(str);
	}
	 
	public void Select_Void_Reason() throws Exception
	{
//		Thread.sleep(1000);
//		if(VoidReasonType.isSelected())
//		{
//			
//		}
//		else
//		{
			Thread.sleep(1000);
			Void_ReasonType.click();
//		}
//		
//		Thread.sleep(1000);
//		ReasonInputBox.clear();
//		Thread.sleep(1000);
//		ReasonInputBox.sendKeys(str);
	}
	 
	public void Select_Over_Shortage_Reason() throws Exception
	{
//		Thread.sleep(1000);
//		if(OverShoratageReasonType.isSelected())
//		{
//			
//		}
//		else
//		{
			Thread.sleep(1000);
			Over_Shoratage_ReasonType.click();
//		}
//		
//		Thread.sleep(1000);
//		ReasonInputBox.clear();
//		Thread.sleep(1000);
//		ReasonInputBox.sendKeys(str);
	}
	 
	public void Select_Attach_RequestReason() throws Exception
	{
//		Thread.sleep(1000);
//		if(AttachRequestReasonType.isSelected())
//		{
//			
//		}
//		else
//		{
			Thread.sleep(1000);
			Attach_Request_ReasonType.click();
//		}
//		
//		Thread.sleep(1000);
//		ReasonInputBox.clear();
//		Thread.sleep(1000);
//		ReasonInputBox.sendKeys(Str);
	}
	 
	
	public void Select_Break_Reason() throws Exception
	{
		Thread.sleep(1000);
		Break_ReasonType.click();
	}
	
	public void Select_Refund_Reason() throws Exception
	{
		Thread.sleep(1000);
		Refund_ReasonType.click();
	}
	
	public void Select_Layaway_Reason() throws Exception
	{
		Thread.sleep(1000);
		Layaway_ReasonType.click();
	}
	
	public void Select_Exchange_Reason() throws Exception
	{
		Thread.sleep(1000);
		Exchange_ReasonType.click();
	}
}
