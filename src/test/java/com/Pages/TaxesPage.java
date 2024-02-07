package com.Pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.poi.ss.formula.ptg.AddPtg;
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

public class TaxesPage extends BasePage
{
//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Common_XPaths cmp;
	
//	public TaxesPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver, test);
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW TAX')]")
	public WebElement New_TaxBtn;
	
	@FindBy(xpath = "//label[contains(.,'Code')]/../../input")
	WebElement TaxCode_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Percentage')]/../../input")
	public WebElement Percentage_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Amount')]/../../input")
	public WebElement Amount_InputBox;
	
	@FindBy(xpath = "//mat-button-toggle[contains(.,'Amount')]")
	WebElement Amount_TaxTypeBtn;
	
	@FindBy(xpath = "//mat-button-toggle[contains(.,'Percentage')]")
	WebElement Percentage_TaxTypeBtn;
	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div/div[.='Item']")
	public WebElement Item_TaxBtn;
	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div/div[.='Check']")
	public WebElement Check_TaxBtn;
	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div/div[.='Tax On Item Tax']")
	public WebElement TaxOnItem_TaxBtn;
	
	@FindBy(xpath = "//div[contains(@class,'col radio-box-button')]/div/div[.='Tax On Check Tax']")
	public WebElement TaxOnCheck_TaxBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Include In Daily Summary Report')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement IncludeDailySummaryReport_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Include In Daily Summary Report')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement IncludeDailySummaryReport_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='applyOnRawCheck']/../..//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement ApplySubtotal_YesBtn;
	 
	@FindBy(xpath = "//app-toggle[@name='applyOnRawCheck']/../..//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement ApplySubtotal_NoBtn;
	 
	@FindBy(xpath = "//app-toggle[contains(.,'Inclusive')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Inclusive_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Inclusive')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Inclusive_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Quantity Based')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement QuantityBased_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Quantity Based')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement QuantityBased_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Default Tax')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement DefaultTax_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Default Tax')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement DefaultTax_NoBtn;
	
	@FindBy(xpath = "//div[@class='editable-data-grid']/div/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input")
	public WebElement Quantity_QuantityBasedInputBox;
	
	@FindBy(xpath = "//div[@class='editable-data-grid']/div/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")
	public WebElement Percentage_QuantityBasedInputBox;
	
	@FindBy(xpath = "//button[contains(.,'Add Percentage')]")
	WebElement Add_PercentageBtn;
	
	@FindBy(xpath = "//span[contains(.,'Tax Per Service Type')]/../..//mat-button-toggle[contains(.,'No')]")
	public WebElement TaxPerServiceType_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Tax Per Service Type')]/../..//mat-button-toggle[contains(.,'Yes')]")
	public WebElement TaxPerServiceType_YesBtn;
	
	@FindBy(xpath = "//p[contains(.,'Would you like to set the Percentage/Value for all the services?')]")
	WebElement AllServiceCofirmation;
	
	@FindBy(xpath = "//button[contains(.,'Yes, Confirm')]")
	WebElement Yes_CofirmBtn;
	
	@FindBy(xpath = "//div[@class='error']")
	public WebElement Error_InputBoxBelow;
	
	//Deleting Quantity based
	//div/app-input-table/div[@class='editable-data-grid']/div[3]/div[3]/button
	
	public void Click_NewTaxButton()
	{
		New_TaxBtn.click();
	}
	
	
	
	public void Enter_TaxName(String str) throws Exception
	{
		cmp=new Common_XPaths();
		
		Thread.sleep(500);
		cmp.EnterName(str);
	}
	
	public void Enter_TaxCode(String str) throws Exception
	{
		cmp=new Common_XPaths();
		
		Thread.sleep(500);
		TaxCode_InputBox.clear();
		Thread.sleep(500);
		TaxCode_InputBox.sendKeys(str);
	}
	
	
	public void Enter_Percentage(String str) throws Exception
	{
		cmp=new Common_XPaths();
		
		Thread.sleep(500);
		Percentage_InputBox.clear();
		Thread.sleep(500);
		Percentage_InputBox.sendKeys(str);
	}
	
	public WebElement Percentage_InputBox()
	{
		return Percentage_InputBox;
	}
	
	public void Enable_TaxPerServiceType_Tax() throws Exception
	{
		if(TaxPerServiceType_YesBtn.isEnabled())
		{
			
		}
		else
		{
			TaxPerServiceType_YesBtn.click();
			
			Thread.sleep(2000);
			if(AllServiceCofirmation.isDisplayed())
			{
				test.log(LogStatus.PASS, "Would you like to set the Percentage/Value for all the services? is Displayed");
				Yes_CofirmBtn.click();
			}
			
		}
	}
	
	public void Disable_TaxPerServiceType_Tax()
	{
		if(TaxPerServiceType_YesBtn.isEnabled())
		{
			TaxPerServiceType_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Select_TaxType_Amount() throws Exception
	{
//		if(Amount_TaxTypeBtn.isSelected())
//		{
//			
//		}
//		else
//		{
		Thread.sleep(1000);
			Amount_TaxTypeBtn.click();
//		}
		
	}
	
	public void Select_TaxType_Percentage() throws Exception
	{
		
		Thread.sleep(1000);
//		if(Percentage_TaxTypeBtn.isEnabled())
//		{
//			
//		}
//		else
//		{
			Percentage_TaxTypeBtn.click();
//		}
		
	}
	
	public void Enable_InclusiveTax() throws Exception
	{
		Thread.sleep(1000);
		if(Inclusive_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Inclusive_YesBtn.click();
		}
	}
	
	public void Disable_InclusiveTax() throws Exception
	{
		Thread.sleep(1000);
		if(Inclusive_YesBtn.isEnabled())
		{
			Inclusive_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Quantity_Based_Toggle() throws Exception
	{
		Thread.sleep(1000);
		if(QuantityBased_YesBtn.isEnabled())
		{
			
		}
		else
		{
			QuantityBased_YesBtn.click();
		}
		
	}
	
	public void Select_QuantityBasedTax() throws Exception
	{
		
//		cmp=new Common_XPaths();
		Thread.sleep(1000);
		if(QuantityBased_YesBtn.isEnabled())
		{
			
		}
		else
		{
			QuantityBased_YesBtn.click();
		}
		
		Thread.sleep(500);
		Quantity_QuantityBasedInputBox.clear();
		Thread.sleep(500);
		Quantity_QuantityBasedInputBox.sendKeys("10");
		
		Thread.sleep(500);
		Percentage_QuantityBasedInputBox.clear();
		Thread.sleep(500);
		Percentage_QuantityBasedInputBox.sendKeys("2000");
		
	
		Thread.sleep(500);
		for(int i=1;i<=3;i++)
		{
		Add_PercentageBtn.click();
		}
		
		Thread.sleep(1000);
		List<WebElement> listDe=driver.findElements(By.xpath("//div/app-input-table/div[@class='editable-data-grid']/div/div[3]/button"));
		for(int i=1;i<=2;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/app-input-table/div[@class='editable-data-grid']/div[3]/div[3]/button")).click();
		
			Thread.sleep(1000);
			cmp.Click_DeleteButton();
		}
		
		Thread.sleep(1000);
		cmp.Click_Save_and_PublishButton();
		
		Thread.sleep(2000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Quantity should be greater than 10"))
		{
			test.log(LogStatus.PASS, "Quantity should be Enter on empty input box Warning pop up displayed while clicking Save button");
		}
		else
		{
			test.log(LogStatus.PASS, "Quantity should be Enter on empty input box Warning pop up not displayed while clicking Save button");
		}
		
		driver.findElement(By.xpath("//div/app-input-table/div[@class='editable-data-grid']/div[3]/div[3]/button")).click();

		Thread.sleep(1000);
		cmp.Click_DeleteButton();

	}
	
	public void Disable_QuantityBasedTax() throws Exception
	{
		
		Thread.sleep(1000);
		if(QuantityBased_YesBtn.isEnabled())
		{
			QuantityBased_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_DefaultTax()
	{
		if(DefaultTax_YesBtn.isEnabled())
		{
			
		}
		else
		{
			DefaultTax_YesBtn.click();
		}
	}
	
	
	public void Disable_DefaultTax()
	{
		if(DefaultTax_YesBtn.isEnabled())
		{
			DefaultTax_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	
	public void Enter_ItemTax_Percentage(String str) throws Exception
	{
		Enter_TaxName(str);
		
		Enter_TaxCode("1234");
		
		Thread.sleep(500);
		Select_TaxType_Percentage();
		
		Thread.sleep(500);
		if(IncludeDailySummaryReport_YesBtn.isEnabled())
		{
			IncludeDailySummaryReport_NoBtn.click();
		}
		else
		{
			
		}
		
		Thread.sleep(1000);
		Percentage_InputBox.clear();
		Thread.sleep(500);
		Percentage_InputBox.sendKeys("1000");
		
		Thread.sleep(500);
		Item_TaxBtn.click();
		
	}
	
	
	public void Enter_ItemTax_Amount(String str) throws Exception
	{
		Thread.sleep(1000);
		Enter_TaxName(str);
		
		Thread.sleep(1000);
		Enter_TaxCode("1234");
		
		Thread.sleep(1000);
		Select_TaxType_Amount();
		
		Thread.sleep(1000);
		if(IncludeDailySummaryReport_YesBtn.isEnabled())
		{
			Thread.sleep(1000);
			IncludeDailySummaryReport_NoBtn.click();
		}
		else
		{
			
		}
		
		Thread.sleep(1000);
		Amount_InputBox.clear();
		Thread.sleep(1000);
		Amount_InputBox.sendKeys("100");
		
		Thread.sleep(1000);
		Item_TaxBtn.click();
		
	}
	
	public void Enable_IncludeDailySummaryReport() throws Exception
	{
		Thread.sleep(500);
		if(IncludeDailySummaryReport_YesBtn.isEnabled())
		{
		}
		else
		{
			IncludeDailySummaryReport_YesBtn.click();
		}
	}
	
	public void Disable_IncludeDailySummaryReport() throws Exception
	{
		Thread.sleep(500);
		if(IncludeDailySummaryReport_YesBtn.isEnabled())
		{
			IncludeDailySummaryReport_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	
	public void Enable_ApplyOnSubtotal_Toggle() throws Exception
	{
		Thread.sleep(500);
		if(ApplySubtotal_YesBtn.isEnabled())
		{
		}
		else
		{
			ApplySubtotal_YesBtn.click();
		}
	}
	
	public void Disable_ApplyOnSubtotal_Toggle() throws Exception
	{
		Thread.sleep(500);
		if(ApplySubtotal_YesBtn.isEnabled())
		{
			ApplySubtotal_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enter_AmountBox(String str) throws Exception
	{
		Thread.sleep(500);
		Amount_InputBox.clear();
		Thread.sleep(500);
		Amount_InputBox.sendKeys(str);
	}
	
	@FindBy(xpath = "//label[contains(.,'Evertec Tax Type')]/../../input")
	WebElement Evertec_TaxType_InputBx;
	
	public void Select_Evertec_TaxType() throws Exception
	{
		Thread.sleep(1000);
		try
		{
			if(Evertec_TaxType_InputBx.isDisplayed())
			{
				Evertec_TaxType_InputBx.click();
				
				Thread.sleep(500);
				driver.findElement(By.xpath("//select-option[contains(.,'None')]")).click();
			}
		}
		catch(Exception k)
		{
			test.log(LogStatus.INFO, "Evertec Tax Type is not Enabled for this Store");
		}

	}
	
	public void Enter_CheckTax(String str) throws Exception
	{
		Enter_TaxName(str);
		
		Select_TaxType_Percentage();
		
		Enter_TaxCode("2222");
		
		Disable_IncludeDailySummaryReport();
		
		Enter_Percentage("10000");
		
		Click_CheckTax();
		
		Thread.sleep(500);
		Amount_InputBox.clear();
		Thread.sleep(500);
		Amount_InputBox.sendKeys("200000");
		
		Thread.sleep(1000);
		ApplySubtotal_YesBtn.click();
		
		
		Select_Evertec_TaxType();
		Thread.sleep(1000);
		
		
	}
	
	public void Enter_TaxOnItemTax(String str) throws Exception
	{
		Enter_TaxName(str);
		
		Select_TaxType_Percentage();
		
		Enter_TaxCode("2222");
		
		Disable_IncludeDailySummaryReport();
		
		Enter_Percentage("1000");
		
		Click_TaxOnItemTax();
		
		Thread.sleep(500);
		if(driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip")).isDisplayed()) 
		{
			List<WebElement> ItemList=driver.findElements(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip"));
			
			
			int ItemTaxSize=ItemList.size();
			
			
			int randomItemTax=ThreadLocalRandom.current().nextInt(1, ItemTaxSize);
			
			if(ShowAll_TaxOn_ItemTaxBtn.isDisplayed())
			{
				Thread.sleep(1000);
				ShowAll_TaxOn_ItemTaxBtn.click();
				Thread.sleep(1000);

			driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip["+randomItemTax+"]")).click();
			}
			else
			{
				Thread.sleep(1000);

				driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip["+randomItemTax+"]")).click();
		
			}
		}
		else
		{
			
		}
	}
	
	public void Select_Apply_ForItem_Taxes_Options() throws Exception
	{
		Thread.sleep(500);
		if(driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip")).isDisplayed()) 
		{
			List<WebElement> ItemList=driver.findElements(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip"));
			
			
			int ItemTaxSize=ItemList.size();
			
			
			int randomItemTax=ThreadLocalRandom.current().nextInt(1, ItemTaxSize);
			
			if(ShowAll_TaxOn_ItemTaxBtn.isDisplayed())
			{
				Thread.sleep(1000);
				ShowAll_TaxOn_ItemTaxBtn.click();
				Thread.sleep(1000);

			driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip["+randomItemTax+"]")).click();
			}
			else
			{
				Thread.sleep(1000);

				driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip["+randomItemTax+"]")).click();
		
			}
		}
		else
		{
			
		}
	}
	
	@FindBy(xpath = "//p[contains(.,'Apply For Item Taxes')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_TaxOn_ItemTaxBtn;
	
	
	@FindBy(xpath = "//p[contains(.,'Apply For Check Taxes')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_TaxOn_CheckTaxBtn;
	
	public void Enter_TaxOnCheckTax(String str) throws Exception
	{
		Enter_TaxName(str);
		
		Select_TaxType_Percentage();
		
		Enter_TaxCode("2222");
		
		Disable_IncludeDailySummaryReport();
		
		Enter_Percentage("1000");
		
		Click_TaxOnCheckTax();
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip")).isDisplayed()) 
		{
			List<WebElement> ItemList=driver.findElements(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip"));
			
			
			int ItemTaxSize=ItemList.size();
			
			
			int randomItemTax=ThreadLocalRandom.current().nextInt(1, ItemTaxSize);
			
			try
			{
			if(ShowAll_TaxOn_CheckTaxBtn.isDisplayed())
			{
				Thread.sleep(1000);
				ShowAll_TaxOn_CheckTaxBtn.click();
				Thread.sleep(1000);

			driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip["+randomItemTax+"]")).click();
			}
			}
			catch(Exception ll)
			{
				Thread.sleep(1000);

				driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip["+randomItemTax+"]")).click();
		
			}
		}
		else
		{
			
		}
	}
	
	public void Select_Apply_ForCheck_Taxes_Options() throws Exception
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip")).isDisplayed()) 
		{
			List<WebElement> ItemList=driver.findElements(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip"));
			
			
			int ItemTaxSize=ItemList.size();
			
			
			int randomItemTax=ThreadLocalRandom.current().nextInt(1, ItemTaxSize);
			
			try
			{
			if(ShowAll_TaxOn_CheckTaxBtn.isDisplayed())
			{
				Thread.sleep(1000);
				ShowAll_TaxOn_CheckTaxBtn.click();
				Thread.sleep(1000);

			driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip["+randomItemTax+"]")).click();
			}
			}
			catch(Exception ll)
			{
				Thread.sleep(1000);

				driver.findElement(By.xpath("//mat-chip-list[contains(@class,'mat-chip-list')]/div/mat-chip["+randomItemTax+"]")).click();
		
			}
		}
		else
		{
			
		}
	}
	
	public void Tax_Per_Service_Type(String str) throws Exception
	{
		
		List<WebElement> SerTypes=driver.findElements(By.xpath("//div[contains(@class,'p-relative inputs-rows')]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
		
		for(int i=1;i<=SerTypes.size();i++)
		{
			double conv=Double.parseDouble(str);
			conv=conv+1;
			String scr=String.valueOf(conv);
			
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[contains(@class,'p-relative inputs-rows')]/div["+i+"]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[contains(@class,'p-relative inputs-rows')]/div["+i+"]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(scr);
		}
		
//		for(int i=1;i<3;i++)
//		{
//		Thread.sleep(1000);
//		Add_PercentageBtn.click();
//		}
//		
		
	}
	
	public void Click_ItemTax()
	{
		Item_TaxBtn.click();
	}
	
	public void Click_CheckTax()
	{
		Check_TaxBtn.click();
	}
	
	public void Click_TaxOnItemTax()
	{
		TaxOnItem_TaxBtn.click();
	}
	
	public void Click_TaxOnCheckTax()
	{
		TaxOnCheck_TaxBtn.click();
	}
	
}
