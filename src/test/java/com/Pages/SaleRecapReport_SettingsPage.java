package com.Pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;

public class SaleRecapReport_SettingsPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Common_XPaths cmp;
	Utility ut=new Utility();
	
//	public SaleRecapReport_SettingsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		PageFactory.initElements(driver, this);
//	}
	
	
	@FindBy(xpath = "//app-toggle[@name='guestCheck']//mat-button-toggle[.='Yes']")
	public WebElement Guest_Checks_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='guestCheck']//mat-button-toggle[.='No']")
	public WebElement Guest_Checks_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='cover']//mat-button-toggle[.='Yes']")
	public WebElement Cover_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='cover']//mat-button-toggle[.='No']")
	WebElement Cover_NoBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Category']")
	public WebElement Category_LevelTypeBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Sub-Category')]")
	public WebElement SubCategory_LevelTypeBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Menu Items')]")
	public WebElement MenuItems_LevelTypeBtn;
	
	@FindBy(xpath = "//label[.='Category *']/../../div/div/input")
	public WebElement Category_LevelTypeInputBx;
	
	//app-auto-complete[@name='Category']//input
	@FindBy(xpath = "//label[.='Sub Category *']/../../div/div/input")
	public WebElement SubCategory_LevelTypeInputBx;
	
	@FindBy(xpath = "//label[.='Menu Item *']/../../div/div/input")
	public WebElement MenuItems_LevelTypeInputBx;
	
	@FindBy(xpath = "//app-toggle[@name='GrandSales']//mat-button-toggle[.='Yes']")
	public WebElement Grand_Sales_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='GrandSales']//mat-button-toggle[.='No']")
	public WebElement Grand_Sales_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='GrossReceipt']//mat-button-toggle[.='Yes']")
	public WebElement Gross_Receipt_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='GrossReceipt']//mat-button-toggle[.='No']")
	public WebElement Gross_Receipt_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='GrossVoid']//mat-button-toggle[.='Yes']")
	public WebElement Gross_Void_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='GrossVoid']//mat-button-toggle[.='No']")
	public WebElement Gross_Void_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='NetVoid']//mat-button-toggle[.='Yes']")
	public WebElement Net_Void_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='NetVoid']//mat-button-toggle[.='No']")
	public WebElement Net_Void_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='CreditCardSplitUp']//mat-button-toggle[.='Yes']")
	public WebElement CC_SplitUp_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='CreditCardSplitUp']//mat-button-toggle[.='No']")
	public WebElement CC_SplitUp_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='OtherPayments']//mat-button-toggle[.='Yes']")
	public WebElement OtherPayments_SplitUp_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='OtherPayments']//mat-button-toggle[.='No']")
	public WebElement OtherPayments_SplitUp_NoBtn;
	
	@FindBy(xpath = "//app-radio-box-button[@name='selectedBusinesBox']/div/div/div/div[contains(.,'System Defined')]")
	public WebElement SystemDefined_PaymentNameBtn;
	
	@FindBy(xpath = "//app-radio-box-button[@name='selectedBusinesBox']/div/div/div/div[contains(.,'User Defined')]")
	public WebElement UserDefined_PaymentNameBtn;
	
	@FindBy(xpath = "//app-toggle[@name='taxes']//mat-button-toggle[.='Yes']")
	public WebElement Tax_SplitUp_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='taxes']//mat-button-toggle[.='No']")
	public WebElement Tax_SplitUp_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='taxExempt']//mat-button-toggle[.='Yes']")
	public WebElement Tax_Exempt_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='taxExempt']//mat-button-toggle[.='No']")
	public WebElement Tax_Exempt_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='taxWithNetsales']//mat-button-toggle[.='Yes']")
	public WebElement Taxwith_NetSales_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='taxWithNetsales']//mat-button-toggle[.='No']")
	public WebElement Taxwith_NetSales_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='openingBalance']//mat-button-toggle[.='Yes']")
	public WebElement OpeningBalance_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='openingBalance']//mat-button-toggle[.='No']")
	public WebElement OpeningBalance_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='paid']//mat-button-toggle[.='Yes']")
	public WebElement PaidIn_Out_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='paid']//mat-button-toggle[.='No']")
	public WebElement PaidIn_Out_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='cashDrop']//mat-button-toggle[.='Yes']")
	public WebElement Cash_Drop_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='cashDrop']//mat-button-toggle[.='No']")
	public WebElement Cash_Drop_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='cashExpected']//mat-button-toggle[.='Yes']")
	public WebElement Cash_Expected_Summary_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='cashExpected']//mat-button-toggle[.='No']")
	public WebElement Cash_Expected_Summary_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='overShortage']//mat-button-toggle[.='Yes']")
	public WebElement Over_Shortage_Summary_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='overShortage']//mat-button-toggle[.='No']")
	public WebElement Over_Shortage_Summary_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='isCashExcepted']//mat-button-toggle[.='Yes']")
	public WebElement Cash_Expected_FormulaDef_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='isCashExcepted']//mat-button-toggle[.='No']")
	public WebElement Cash_Expected_FormulaDef_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='isOverageShortage']//mat-button-toggle[.='Yes']")
	public WebElement Over_Shortage_Summary_FormulaDef_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='isOverageShortage']//mat-button-toggle[.='No']")
	public WebElement Over_Shortage_Summary_FormulaDef_NoBtn;
	
	@FindBy(xpath = "(//div[@id='formulaDefinition']//input)[1]")
	public WebElement Cash_Expected_AddInputBox;
	
	public WebElement Cash_Expected_AddInputBox()
	{
		return Cash_Expected_AddInputBox;
	}
	
	@FindBy(xpath = "(//div[@id='formulaDefinition']//input)[2]")
	public WebElement Cash_Expected_SubtractInputBox;
		
	@FindBy(xpath = "(//div[@id='formulaDefinition']//input)[3]")
	public WebElement Overage_Shortage_AddInputBox;
	
	public WebElement Overage_Shortage_AddInputBox()
	{
		return Overage_Shortage_AddInputBox;
	}
	
	@FindBy(xpath = "(//div[@id='formulaDefinition']//input)[4]")
	public WebElement Overage_Shortage_SubtractInputBox;
	
	@FindBy(xpath = "//app-toggle[@name='departmentSummary']//mat-button-toggle[.='Yes']")
	public WebElement Department_Summary_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='departmentSummary']//mat-button-toggle[.='No']")
	public WebElement Department_Summary_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='categorySummary']//mat-button-toggle[.='Yes']")
	public WebElement Category_Summary_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='categorySummary']//mat-button-toggle[.='No']")
	public WebElement Category_Summary_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='hourlySummary']//mat-button-toggle[.='Yes']")
	public WebElement Hourly_Summary_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='hourlySummary']//mat-button-toggle[.='No']")
	public WebElement Hourly_Summary_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='includeCredits']//mat-button-toggle[.='Yes']")
	public WebElement IncludeCredits_in_DailySummaryReport_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='includeCredits']//mat-button-toggle[.='No']")
	public WebElement IncludeCredits_in_DailySummaryReport_NoBtn;
	
	@FindBy(xpath = "//button[.='UPDATE']")
	public WebElement UpdateBtnIn_SaleRecapSettings;
	
	public void Click_UpdateButtonSettings()
	{
		UpdateBtnIn_SaleRecapSettings.click();
	}
	
	public WebElement UpdateBtnIn_SaleRecapSettings()
	{
		return UpdateBtnIn_SaleRecapSettings;
	}
	
	public void Enable_GuestChecks() throws Exception
	{
		Thread.sleep(1000);
//		if(Guest_Checks_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Guest_Checks_YesBtn.click();
//		}
	}
	
	public void Disable_GuestChecks() throws Exception
	{
		Thread.sleep(1000);
//		if(Guest_Checks_YesBtn.isSelected())
//		{
			Guest_Checks_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Guest_Checks_YesBtn()
	{
		return Guest_Checks_YesBtn;
	}
	
	public void Enable_Cover() throws Exception
	{
		Thread.sleep(1000);
//		if(Cover_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Cover_YesBtn.click();
//		}
	}
	
	
	public void Disable_Cover() throws Exception
	{
		Thread.sleep(1000);
//		if(Cover_YesBtn.isSelected())
//		{
			Cover_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Cover_YesBtn()
	{
		return Cover_YesBtn;
	}
	
	public void Click_Category_LevelType()
	{
		Category_LevelTypeBtn.click();
	}
	
	public WebElement Category_LevelType()
	{
		return Category_LevelTypeBtn;
	}
	
	public void Click_SubCategory_LevelType()
	{
		SubCategory_LevelTypeBtn.click();
	}
	
	public WebElement SubCategory_LevelType()
	{
		return SubCategory_LevelTypeBtn;
	}
	
	public void Click_MenuItems_LevelType()
	{
		MenuItems_LevelTypeBtn.click();
	}
	
	public WebElement MenuItems_LevelType()
	{
		return MenuItems_LevelTypeBtn;
	}
	
	
	public void Select_Category_LevelTypeItems() throws Exception
	{
		Thread.sleep(2000);
		Category_LevelTypeInputBx.click();
//		Actions ac=new Actions(driver);
//		ac.doubleClick(Category_LevelTypeInputBx).build().perform();
		
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isEnabled())
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
			
		}
		
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
		Thread.sleep(1000);
		Category_LevelTypeInputBx.click();
//		Actions ac=new Actions(driver);
//		ac.doubleClick(Items_LevelType_InputBox).build().perform();
		
		Thread.sleep(1000);
	
	List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		int PrinterSize=PrinterList.size();
		
		if(PrinterSize==0)
		{
			Category_LevelTypeInputBx.click();
			
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();


		}
		else if(PrinterSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+PrinterSize+"]/select-option")).click();

		}
		else if(PrinterSize<=10)
		{
		int randomPrinter=ThreadLocalRandom.current().nextInt(2, PrinterSize);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		}
		else
		{
			int randomPrinter=ThreadLocalRandom.current().nextInt(2, 10);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		
		}
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		List<WebElement> PrinterList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		Thread.sleep(1000);
		if(PrinterList1.size()!=0)
		{
			driver.findElement(By.xpath("(//span[.='General'])[1]")).click();
			for(int j=1;j<=5;j++) 
			{
				Thread.sleep(1000);
				driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			}
			Thread.sleep(1000);
			Category_LevelTypeInputBx.click();
		}
		}
	}
	
	public void Select_SubCategory_LevelTypeItems() throws Exception
	{
		Thread.sleep(2000);
		SubCategory_LevelTypeInputBx.click();
		
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isEnabled())
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
			
		}
		
		Thread.sleep(1000);
		for(int i=1;i<=3;i++)
		{
		Thread.sleep(2000);
		SubCategory_LevelTypeInputBx.click();
//		Actions ac=new Actions(driver);
//		ac.doubleClick(Items_LevelType_InputBox).build().perform();
		
		Thread.sleep(1000);
	
	List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		int PrinterSize=PrinterList.size();
		
		if(PrinterSize==0)
		{
			SubCategory_LevelTypeInputBx.click();
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();


		}
		else if(PrinterSize==1)
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+PrinterSize+"]")).click();

		}
		else if(PrinterSize<=10)
		{
		int randomPrinter=ThreadLocalRandom.current().nextInt(2, PrinterSize);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		}
		else
		{
			int randomPrinter=ThreadLocalRandom.current().nextInt(2, 10);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		
		}
		Thread.sleep(1000);
		List<WebElement> PrinterList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		Thread.sleep(1000);
		if(PrinterList1.size()!=0)
		{
			
			driver.findElement(By.xpath("(//span[.='General'])[1]")).click();
			for(int j=1;j<=5;j++) 
			{
				Thread.sleep(1000);
				driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			}
			Thread.sleep(1000);
			SubCategory_LevelTypeInputBx.click();
		}
		}
	}
	
	public void Select_MenuItems_LevelTypeItems() throws Exception
	{
		Thread.sleep(2000);
		MenuItems_LevelTypeInputBx.click();
		
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isEnabled())
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
			
		}
		
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
		Thread.sleep(2000);
		MenuItems_LevelTypeInputBx.click();
//		Actions ac=new Actions(driver);
//		ac.doubleClick(Items_LevelType_InputBox).build().perform();
		
		Thread.sleep(1000);
	
	List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		int PrinterSize=PrinterList.size();
		
		if(PrinterSize==0)
		{
			MenuItems_LevelTypeInputBx.click();
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();


		}
		else if(PrinterSize==1)
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+PrinterSize+"]")).click();

		}
		else if(PrinterSize<=10)
		{
		int randomPrinter=ThreadLocalRandom.current().nextInt(2, PrinterSize);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		}
		else
		{
			int randomPrinter=ThreadLocalRandom.current().nextInt(2, 10);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		
		}
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		List<WebElement> PrinterList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		Thread.sleep(1000);
		if(PrinterList1.size()!=0)
		{
			driver.findElement(By.xpath("(//span[.='General'])[1]")).click();
			for(int j=1;j<=5;j++) 
			{
				Thread.sleep(1000);
				driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			}
			Thread.sleep(1000);
			MenuItems_LevelTypeInputBx.click();
		}
		}
	}
	
	public void SelectAll_LevelTypeItems()
	{
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
	
	}
	
	
	public void Enable_Grand_Sales() throws Exception
	{
		Thread.sleep(1000);
//		if(Grand_Sales_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Grand_Sales_YesBtn.click();
//		}
	}
	
	
	public void Disable_Grand_Sales() throws Exception
	{
		Thread.sleep(1000);
//		if(Grand_Sales_YesBtn.isSelected())
//		{
			Grand_Sales_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Grand_Sales_YesBtn()
	{
		return Grand_Sales_YesBtn;
	}
	
	
	public void Enable_Gross_Receipt() throws Exception
	{
		Thread.sleep(1000);
//		if(Gross_Receipt_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Gross_Receipt_YesBtn.click();
//		}
	}
	
	
	public void Disable_Gross_Receipt() throws Exception
	{
		Thread.sleep(1000);
//		if(Gross_Receipt_YesBtn.isSelected())
//		{
			Gross_Receipt_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Gross_Receipt_YesBtn()
	{
		return Gross_Receipt_YesBtn;
	}
	
	public void Enable_Gross_Void() throws Exception
	{
		Thread.sleep(1000);
//		if(Gross_Void_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Gross_Void_YesBtn.click();
//		}
	}
	
	
	public void Disable_Gross_Void() throws Exception
	{
		Thread.sleep(1000);
//		if(Gross_Void_YesBtn.isSelected())
//		{
			Gross_Void_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Gross_Void_YesBtn()
	{
		return Gross_Void_YesBtn;
	}
	
	public void Enable_Net_Void() throws Exception
	{
		Thread.sleep(1000);
//		if(Net_Void_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Net_Void_YesBtn.click();
//		}
	}
	
	
	public void Disable_Net_Void() throws Exception
	{
		Thread.sleep(1000);
//		if(Net_Void_YesBtn.isSelected())
//		{
			Net_Void_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Net_Void_YesBtn()
	{
		return Net_Void_YesBtn;
	}
	
	public void Enable_CC_SplitUp() throws Exception
	{
		Thread.sleep(1000);
//		if(CC_SplitUp_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			CC_SplitUp_YesBtn.click();
//		}
	}
	
	
	public void Disable_CC_SplitUp() throws Exception
	{
		Thread.sleep(1000);
//		if(CC_SplitUp_YesBtn.isSelected())
//		{
			CC_SplitUp_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement CC_SplitUp_YesBtn()
	{
		return CC_SplitUp_YesBtn;
	}
	
	public void Enable_OtherPayments_SplitUp() throws Exception
	{
		Thread.sleep(1000);
//		if(OtherPayments_SplitUp_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			OtherPayments_SplitUp_YesBtn.click();
//		}
	}
	
	
	public void Disable_OtherPayments_SplitUp() throws Exception
	{
		Thread.sleep(1000);
//		if(OtherPayments_SplitUp_YesBtn.isSelected())
//		{
			OtherPayments_SplitUp_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement OtherPayments_SplitUp_YesBtn()
	{
		return OtherPayments_SplitUp_YesBtn;
	}
	
	public void Click_SystemDefined()
	{
		SystemDefined_PaymentNameBtn.click();
	}
	
	public WebElement SystemDefined_PaymentName()
	{
		return SystemDefined_PaymentNameBtn;
	}
	
	public void Click_UserDefined()
	{
		UserDefined_PaymentNameBtn.click();
	}
	
	public WebElement UserDefined_PaymentName()
	{
		return UserDefined_PaymentNameBtn;
	}
	
	
	public void Enable_Tax_SplitUp() throws Exception
	{
		Thread.sleep(1000);
//		if(Tax_SplitUp_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Tax_SplitUp_YesBtn.click();
//		}
	}
	
	
	public void Disable_Tax_SplitUp() throws Exception
	{
		Thread.sleep(1000);
//		if(Tax_SplitUp_YesBtn.isSelected())
//		{
			Tax_SplitUp_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Tax_SplitUp_YesBtn()
	{
		return Tax_SplitUp_YesBtn;
	}
	
	public void Enable_Tax_Exempt() throws Exception
	{
		Thread.sleep(1000);
//		if(Tax_Exempt_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Tax_Exempt_YesBtn.click();
//		}
	}
	
	
	public void Disable_Tax_Exempt() throws Exception
	{
		Thread.sleep(1000);
//		if(Tax_Exempt_YesBtn.isSelected())
//		{
			Tax_Exempt_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Tax_Exempt_YesBtn()
	{
		return Tax_Exempt_YesBtn;
	}
	
	public void Enable_Taxwith_NetSales() throws Exception
	{
		Thread.sleep(1000);
//		if(Taxwith_NetSales_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Taxwith_NetSales_YesBtn.click();
//		}
	}
	
	
	public void Disable_Taxwith_NetSales() throws Exception
	{
		Thread.sleep(1000);
//		if(Taxwith_NetSales_YesBtn.isSelected())
//		{
			Taxwith_NetSales_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Taxwith_NetSales_YesBtn()
	{
		return Taxwith_NetSales_YesBtn;
	}
	
	public void Enable_OpeningBalance() throws Exception
	{
		Thread.sleep(1000);
//		if(OpeningBalance_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			OpeningBalance_YesBtn.click();
//		}
	}
	
	
	public void Disable_OpeningBalance() throws Exception
	{
		Thread.sleep(1000);
//		if(OpeningBalance_YesBtn.isSelected())
//		{
			OpeningBalance_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement OpeningBalance_YesBtn()
	{
		return OpeningBalance_YesBtn;
	}
	
	
	public void Enable_PaidIn_Out() throws Exception
	{
		Thread.sleep(1000);
//		if(PaidIn_Out_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			PaidIn_Out_YesBtn.click();
//		}
	}
	
	
	public void Disable_PaidIn_Out() throws Exception
	{
		Thread.sleep(1000);
//		if(PaidIn_Out_YesBtn.isSelected())
//		{
			PaidIn_Out_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement PaidIn_Out_YesBtn()
	{
		return PaidIn_Out_YesBtn;
	}
	
	public void Enable_Cash_Drop() throws Exception
	{
		Thread.sleep(1000);
//		if(Cash_Drop_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Cash_Drop_YesBtn.click();
//		}
	}
	
	
	public void Disable_Cash_Drop() throws Exception
	{
		Thread.sleep(1000);
//		if(Cash_Drop_YesBtn.isSelected())
//		{
			Cash_Drop_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Cash_Drop_YesBtn()
	{
		return Cash_Drop_YesBtn;
	}
	
	public void Enable_Cash_Expected_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Cash_Expected_Summary_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Cash_Expected_Summary_YesBtn.click();
//		}
	}
	
	
	public void Disable_Cash_Expected_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Cash_Expected_Summary_YesBtn.isSelected())
//		{
			Cash_Expected_Summary_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Cash_Expected_Summary_YesBtn()
	{
		return Cash_Expected_Summary_YesBtn;
	}
	
	public void Enable_Over_Shortage_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Over_Shortage_Summary_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Over_Shortage_Summary_YesBtn.click();
//		}
	}
	
	
	public void Disable_Over_Shortage_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Over_Shortage_Summary_YesBtn.isSelected())
//		{
			Over_Shortage_Summary_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Over_Shortage_Summary_YesBtn()
	{
		return Over_Shortage_Summary_YesBtn;
	}
	
	public void Enable_Cash_Expected_FormulaDef() throws Exception
	{
		Thread.sleep(1000);
//		if(Cash_Expected_FormulaDef_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Cash_Expected_FormulaDef_YesBtn.click();
//		}
	}
	
	
	public void Disable_Cash_Expected_FormulaDef() throws Exception
	{
		Thread.sleep(1000);
//		if(Cash_Expected_FormulaDef_YesBtn.isSelected())
//		{
			Cash_Expected_FormulaDef_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Cash_Expected_FormulaDef_YesBtn()
	{
		return Cash_Expected_FormulaDef_YesBtn;
	}
	
	public void Select_Add_CashExpected_FormulaDefintion() throws Exception
	{
		Thread.sleep(1000);
		Cash_Expected_AddInputBox.click();
		
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isEnabled())
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
			
		}
		Thread.sleep(1000);
		Cash_Expected_AddInputBox.click();

		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
		Cash_Expected_AddInputBox.click();
		
//		Thread.sleep(1000);
//		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isSelected())
//		{
//			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
//			
//		}
			
			
	
		List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
	
		int PrinterSize=PrinterList.size();
		
		if(PrinterSize==0)
		{
			Thread.sleep(1000);
			Cash_Expected_AddInputBox.click();
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();

			
		}
		else if(PrinterSize==1)
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+PrinterSize+"]")).click();

		}
		else if(PrinterSize<=6)
		{
		int randomPrinter=ThreadLocalRandom.current().nextInt(2, PrinterSize);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		}
		else
		{
			int randomPrinter=ThreadLocalRandom.current().nextInt(2, PrinterSize);
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		
		}
		Thread.sleep(1000);
		
		List<WebElement> PrinterList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		if(PrinterList1.size()!=0)
		{
			Thread.sleep(1000);
			Cash_Expected_AddInputBox.click();
			
		}
		
		}
	}
		
		public void Select_Subtract_Cash_Expected_FormulaDefintion() throws Exception
		{
		
		Thread.sleep(1000);
		Cash_Expected_SubtractInputBox.click();
		

//		List<WebElement> PrinterList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
//		
//		for(int i=1;i<=PrinterList1.size();i++)
//		{
//		int PrinterSize=PrinterList1.size();
//		
//		
//		int randomPrinter=ThreadLocalRandom.current().nextInt(2, PrinterSize);
//		
		
//		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
//		}
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isEnabled())
		{
			
		}
		else
		{
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
		}
		
	}
	
	
	public void Enable_Over_Shortage_Summary_FormulaDef() throws Exception
	{
		Thread.sleep(1000);
//		if(Over_Shortage_Summary_FormulaDef_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Over_Shortage_Summary_FormulaDef_YesBtn.click();
//		}
	}
	
	
	public void Disable_Over_Shortage_Summary_FormulaDef() throws Exception
	{
		Thread.sleep(1000);
//		if(Over_Shortage_Summary_FormulaDef_YesBtn.isSelected())
//		{
			Over_Shortage_Summary_FormulaDef_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Over_Shortage_Summary_FormulaDef_YesBtn()
	{
		return Over_Shortage_Summary_FormulaDef_YesBtn;
	}
	
	public void Select_Add_Over_Shortage_FormulaDefintion() throws Exception
	{
		
		Thread.sleep(1000);
		Overage_Shortage_AddInputBox.click();
		
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isSelected())
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
			
		}
		
		Overage_Shortage_AddInputBox.click();

		
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(1000);
		Overage_Shortage_AddInputBox.click();
		
//		Thread.sleep(1000);
//		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isSelected())
//		{
//			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
//			
//		}
			
			
	
		List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
	
		int PrinterSize=PrinterList.size();
		
		if(PrinterSize==0)
		{
			Thread.sleep(1000);
			Overage_Shortage_AddInputBox.click();
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();

		}
		else if(PrinterSize==1)
		{
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+PrinterSize+"]")).click();

		}
		else if(PrinterSize<=6)
		{
		int randomPrinter=ThreadLocalRandom.current().nextInt(2, PrinterSize);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
		}
		else
		{
			int randomPrinter=ThreadLocalRandom.current().nextInt(2, 6);
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
			
		}
		
		List<WebElement> PrinterList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		Thread.sleep(1000);
		
		if(PrinterList1.size()!=0) 
		{
			Thread.sleep(1000);
			Overage_Shortage_AddInputBox.click();
		
		}
			
		}
	}
		
		
		public void Select_Subtract_Overage_Shortage_FormulaDefintion() throws Exception
		{
		
		Thread.sleep(2000);
		Overage_Shortage_SubtractInputBox.click();
		

//		List<WebElement> PrinterList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
//		
//		for(int i=1;i<=PrinterList1.size();i++)
//		{
//		int PrinterSize=PrinterList1.size();
//		
//		
//		int randomPrinter=ThreadLocalRandom.current().nextInt(2, PrinterSize);
//		
		
//		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomPrinter+"]")).click();
//		}
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isEnabled())
		{
			
		}
		else
		{
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
		}
	}
	
	public void Enable_Department_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Department_Summary_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Department_Summary_YesBtn.click();
//		}
	}
	
	
	public void Disable_Department_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Department_Summary_YesBtn.isEnabled())
//		{
			Department_Summary_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Department_Summary_YesBtn()
	{
		return Department_Summary_YesBtn;
	}
	
	public void Enable_Category_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Category_Summary_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Category_Summary_YesBtn.click();
//		}
	}
	
	
	public void Disable_Category_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Category_Summary_YesBtn.isSelected())
//		{
			Category_Summary_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Category_Summary_YesBtn()
	{
		return Category_Summary_YesBtn;
	}
	
	
	public void Enable_Hourly_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Hourly_Summary_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			Hourly_Summary_YesBtn.click();
//		}
	}
	
	
	public void Disable_Hourly_Summary() throws Exception
	{
		Thread.sleep(1000);
//		if(Hourly_Summary_YesBtn.isSelected())
//		{
			Hourly_Summary_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement Hourly_Summary_YesBtn()
	{
		return Hourly_Summary_YesBtn;
	}
	
	public void Enable_IncludeCredits_in_DailySummaryReport() throws Exception
	{
		Thread.sleep(1000);
//		if(IncludeCredits_in_DailySummaryReport_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
			IncludeCredits_in_DailySummaryReport_YesBtn.click();
//		}
	}
	
	
	public void Disable_IncludeCredits_in_DailySummaryReport() throws Exception
	{
		Thread.sleep(1000);
//		if(IncludeCredits_in_DailySummaryReport_YesBtn.isSelected())
//		{
			IncludeCredits_in_DailySummaryReport_NoBtn.click();
//		}
//		else
//		{
//			
//		}
	}
	
	public WebElement IncludeCredits_in_DailySummaryReport_YesBtn()
	{
		return IncludeCredits_in_DailySummaryReport_YesBtn;
	}
}
