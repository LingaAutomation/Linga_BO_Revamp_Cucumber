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

import Utility.Utility;

public class KitchenPrinterPage extends BasePage
{
//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Common_XPaths cmp;
	Utility ut=new Utility();
	
//	public KitchenPrinterPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW KITCHEN PRINTER')]")
	public WebElement New_KitchenPrinterBtn;
	
	@FindBy(xpath = "//app-radio-box-button[@name='printerType']/div/div/div/div[contains(.,'Printer')]")
	public WebElement Printer_KitchenPrinterTypeBtn;
	
	@FindBy(xpath = "//app-radio-box-button[@name='printerType']/div/div/div/div[contains(.,'KDS')]")
	public WebElement KDS_KitchenPrinterTypeBtn;
	
	@FindBy(xpath = "//app-radio-box-button[@name='printerType']/div/div/div/div[contains(.,'Driver')]")
	public WebElement Driver_KitchenPrinterTypeBtn;
	
	@FindBy(xpath = "//input[@aria-label='Printer Model']")
	public WebElement Printer_ModelInputBox;
	
	@FindBy(xpath = "//app-input[@name='printerName']//input")
	public WebElement KitchenPrinterNameInputBx;
	
	@FindBy(xpath = "//h3[contains(.,'Label Printer')]/../../..//app-input[@name='name']//input")
	public WebElement LabelPrinter_NameInputBx;
	
	@FindBy(xpath = "//input[@aria-label='IP Address']")
	public WebElement IP_AddressInputBx;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Enable Service Type Restriction')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement EnableServiceTypeRestriction_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Enable Service Type Restriction')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement EnableServiceTypeRestriction_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Apply To All Categories')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement ApplyToAllCategories_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Apply To All Categories')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement ApplyToAllCategories_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Apply To All Menu Items')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement ApplyToAllMenuItems_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Apply To All Menu Items')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement ApplyToAllMenuItems_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Expo Device')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement ExpoDevice_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Expo Device')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement ExpoDevice_NoBtn;
	
	@FindBy(xpath = "//input[@aria-label='Expo Printer IP Address']")
	public WebElement Expo_Printer_IP_AddressInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Queue Device IP Address']")
	public WebElement Queue_Device_IP_AddressInputBx;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Alternate Printer')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement AlternatePrinter_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Alternate Printer')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement AlternatePrinter_NoBtn;
	
	@FindBy(xpath = "//input[@aria-label='Alternate Printer']")
	public WebElement Alternate_PrinterInputBox;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Seat Ordering Override')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement SeatOrderingOverride_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Seat Ordering Override')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement SeatOrderingOverride_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print Voided Items to the Kitchen')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Print_VoidedItemstotheKitchen_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print Voided Items to the Kitchen')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Print_VoidedItemstotheKitchen_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print Included Modifier In Kitchen')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Print_IncludedModifierInKitchen_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print Included Modifier In Kitchen')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Print_IncludedModifierInKitchen_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print Included Modifier For Alternate Modifier')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Print_IncludedModifier_For_AlternateModifier_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print Included Modifier For Alternate Modifier')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Print_IncludedModifier_For_AlternateModifier_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Serving Size in Front of Menu in KOT')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement ServingSizeinFront_of_MenuinKOT_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Serving Size in Front of Menu in KOT')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement ServingSizeinFront_of_MenuinKOT_NoBtn;
	
	@FindBy(xpath = "//span[contains(@class,'segment-button')][.='PRINTERS']")
	public WebElement Printers_Tab;
	
	@FindBy(xpath = "//span[contains(@class,'segment-button')][.='SETTINGS']")
	public WebElement Settings_Tab;
	
	@FindBy(xpath = "//app-input[@label='IP Address']/../div/p")
	public WebElement Invalid_IPAddressErrorMsg;
	
	@FindBy(xpath = "//p[contains(@class,'color-red')][contains(.,'Please Enter Valid IP Address')]")
	public WebElement Enter_Valid_IP_Address_ErrorMsg;
	
	@FindBy(xpath = "//button[contains(.,'UPDATE')]")
	public WebElement Update_BtnPrinters;
	
	public void Click_NewKitchenPrinter()
	{
		New_KitchenPrinterBtn.click();
	}
	
	public void Click_Update_inPrinters()
	{
		Update_BtnPrinters.click();
	}
	
	public void Click_Printer_PrinterType()
	{
		Printer_KitchenPrinterTypeBtn.click();
	}
	
	public WebElement Printer_KitchenPrinterBtn()
	{
		return Printer_KitchenPrinterTypeBtn;
	}
	
	public void Click_KDS_PrinterType()
	{
		KDS_KitchenPrinterTypeBtn.click();
	}
	
	public WebElement KDS_KitchenPrinterBtn()
	{
		return KDS_KitchenPrinterTypeBtn;
	}
	
	public void Click_Driver_PrinterType()
	{
		Driver_KitchenPrinterTypeBtn.click();
	}
	
	public WebElement Driver_KitchenPrinterBtn()
	{
		return Driver_KitchenPrinterTypeBtn;
	}
	
	public void Enter_KitchenPrinterName(String str)
	{
		KitchenPrinterNameInputBx.clear();
		
		KitchenPrinterNameInputBx.sendKeys(str);
	}
	
	public void Enter_Expo_Printer_IPAddress(String str)
	{
		Expo_Printer_IP_AddressInputBx.clear();
		
		Expo_Printer_IP_AddressInputBx.sendKeys(str);
	}
	
	public void Enter_Queue_Device_IPAddress(String str)
	{
		Queue_Device_IP_AddressInputBx.clear();
		
		Queue_Device_IP_AddressInputBx.sendKeys(str);
	}
	
	
	public void Enter_IP_Address(String str)
	{
		IP_AddressInputBx.clear();
		
		IP_AddressInputBx.sendKeys(str);
	}
	
	public WebElement Invalid_IPAddressErrorMsg()
	{
		return Invalid_IPAddressErrorMsg;
	}
	
	public void Verify_Invalid_IP_AddressMsg(String str)
	{
		if(Invalid_IPAddressErrorMsg.getText().equalsIgnoreCase(str))
		{
			test.log(LogStatus.PASS, str+" Displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, str+" not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Click_Printers_Tab()
	{
		Printers_Tab.click();
	}
	
	public void Click_Settings_Tab()
	{
		Settings_Tab.click();
	}
	
	public void Select_Printer_Model() throws Exception
	{
		Thread.sleep(3000);
		Printer_ModelInputBox.click();
		
		Thread.sleep(1000);
		List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		int PrinterSize=PrinterList.size();
		
		
		int randomPrinter=ThreadLocalRandom.current().nextInt(1, PrinterSize);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomPrinter+"]/select-option")).click();
	
	}
	
	public void Select_Alternate_Printer()
	{
		Alternate_PrinterInputBox.click();
		
		List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		int PrinterSize=PrinterList.size();
		
		
		int randomPrinter=ThreadLocalRandom.current().nextInt(1, PrinterSize);
		
		
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomPrinter+"]/select-option")).click();
	
	}
	
	public WebElement EnableServiceTypeRestriction_YesBtn()
	{
		return EnableServiceTypeRestriction_YesBtn;
	}
	
	public void Enable_ServiceTypeRestriction()
	{
		if(EnableServiceTypeRestriction_YesBtn.isSelected())
		{
			
		}
		else
		{
			EnableServiceTypeRestriction_YesBtn.click();
		}
		
	}
	
	@FindBy(xpath = "//p[contains(.,'Allow Service Types')]/..//button[contains(.,'Show All')]")
	public WebElement ShowAll_ServiceTypesBtn;
	
	public void Enable_EnableServiceTypeRestriction() throws Exception
	{
		Thread.sleep(1000);
		if(EnableServiceTypeRestriction_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Thread.sleep(1000);
			EnableServiceTypeRestriction_YesBtn.click();
		}
		Thread.sleep(1000);
		try
		{
		if(ShowAll_ServiceTypesBtn.isDisplayed())
		{
			ShowAll_ServiceTypesBtn.click();
		}
		}
		catch(Exception k) {}
		
		for(int i = 0;i <=15;i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		
		Thread.sleep(2000);
		List<WebElement> ServTypeList=driver.findElements(By.xpath("//app-chip[contains(@name,'service')]/div/mat-chip-list/div/mat-chip"));
		

		int ServTypeSize=ServTypeList.size();
		
		
		
		int randomServType=ThreadLocalRandom.current().nextInt(1, ServTypeSize);
		
		
		driver.findElement(By.xpath("//app-chip[contains(@name,'service')]/div/mat-chip-list/div/mat-chip["+randomServType+"]")).click();
	
	}
	
	public void Select_Allow_ServiceTypes() throws Exception
	{
		Thread.sleep(1000);
		try
		{
		if(ShowAll_ServiceTypesBtn.isDisplayed())
		{
			ShowAll_ServiceTypesBtn.click();
		}
		}
		catch(Exception k) {}
		
		for(int i = 0;i <=15;i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		
		Thread.sleep(2000);
		List<WebElement> ServTypeList=driver.findElements(By.xpath("//app-chip[contains(@name,'service')]/div/mat-chip-list/div/mat-chip"));
		

		int ServTypeSize=ServTypeList.size();
		
		
		
		int randomServType=ThreadLocalRandom.current().nextInt(1, ServTypeSize);
		
		
		driver.findElement(By.xpath("//app-chip[contains(@name,'service')]/div/mat-chip-list/div/mat-chip["+randomServType+"]")).click();
	
	}
	
	@FindBy(xpath = "//p[contains(.,'Select Service Types')]/..//button[contains(.,'Show All')]")
	public WebElement ShowAll_ServiceTypesBtn1;
	
	@FindBy(xpath = "//app-toggle[@name='serviceTypeRestriction']//mat-button-toggle-group[contains(@class,'disabled')]")
	public WebElement Enable_ServiceType_Restriction_DisabledToggle;
	
	public void Enable_EnableServiceTypeRestriction1() throws Exception
	{
		if(EnableServiceTypeRestriction_YesBtn.isSelected())
		{
			
		}
		else
		{
			EnableServiceTypeRestriction_YesBtn.click();
		}
		
		try
		{
		if(ShowAll_ServiceTypesBtn1.isDisplayed())
		{
			ShowAll_ServiceTypesBtn1.click();
		}
		}
		catch(Exception k) {}
		
		for(int i = 0;i <=15;i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		
		Thread.sleep(2000);
		List<WebElement> ServTypeList=driver.findElements(By.xpath("//app-chip[contains(@name,'service')]/div/mat-chip-list/div/mat-chip"));
		

		int ServTypeSize=ServTypeList.size();
		
		
		
		int randomServType=ThreadLocalRandom.current().nextInt(1, ServTypeSize);
		
		
		driver.findElement(By.xpath("//app-chip[contains(@name,'service')]/div/mat-chip-list/div/mat-chip["+randomServType+"]")).click();
	
	}
	
	
	public void Disable_EnableServiceTypeRestriction()
	{
		if(EnableServiceTypeRestriction_YesBtn.isSelected())
		{
			EnableServiceTypeRestriction_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_ApplyToAllCategories()
	{
		if(ApplyToAllCategories_YesBtn.isSelected())
		{
			
		}
		else
		{
			ApplyToAllCategories_YesBtn.click();
		}
		
		
	
	}
	
	public void Enable_ApplyToAllMenuItems()
	{
		if(ApplyToAllMenuItems_YesBtn.isSelected())
		{
			
		}
		else
		{
			ApplyToAllMenuItems_YesBtn.click();
		}
		
	}
	
	public void Disable_ApplyToAllMenuItems()
	{
		if(ApplyToAllMenuItems_YesBtn.isSelected())
		{
			ApplyToAllMenuItems_NoBtn.click();
		}
		else
		{
			
		}
		
	}
	
	public void Disable_ApplyToAllCategories()
	{
		if(ApplyToAllCategories_YesBtn.isSelected())
		{
			ApplyToAllCategories_NoBtn.click();
		}
		else
		{
			
		}
	}
	
//	public void Select_Printer_Model()
//	{
//		 Printer_ModelInputBox.click();
//			
//			List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
//			
//			int PrinterSize=PrinterList.size();
//			
//			
//			int randomPrinter=ThreadLocalRandom.current().nextInt(1, PrinterSize);
//			
//			
//			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomPrinter+"]/select-option")).click();
//		
//	}
	
	public void Create_KitchenPrinter(String str1,String str2) throws Exception
	{
		cmp=new Common_XPaths();
		
		New_KitchenPrinterBtn.click();
		
		if(cmp.CreationScreenHeader.getText().equalsIgnoreCase("New Kitchen Printer"))
		{
			test.log(LogStatus.PASS, "New Kitchen Printer page opened");
		}
		else
		{
			test.log(LogStatus.FAIL, "New Kitchen Printer page not opened");
		}
		
		KDS_KitchenPrinterTypeBtn.click();
		
        Printer_ModelInputBox.click();
		
		List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		int PrinterSize=PrinterList.size();
		
		
		int randomPrinter=ThreadLocalRandom.current().nextInt(1, PrinterSize);
		
		
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomPrinter+"]/select-option")).click();
	
		KitchenPrinterNameInputBx.clear();
		KitchenPrinterNameInputBx.sendKeys(str1);
		
		IP_AddressInputBx.clear();
		IP_AddressInputBx.sendKeys(str2);
		
		
//		if(EnableServiceTypeRestriction_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
//			EnableServiceTypeRestriction_YesBtn.click();
//		}
//		
//		List<WebElement> ServTypeList=driver.findElements(By.xpath("//div[contains(.,'Enable Service Type Restriction')]/../div[3]/app-chip/div/mat-chip-list/div/mat-chip"));
//		
//		for(int i=1;i<=ServTypeList.size();i++)
//		{
//			driver.findElement(By.xpath("//div[contains(.,'Enable Service Type Restriction')]/../div[3]/app-chip/div/mat-chip-list/div/mat-chip["+i+"]")).click();
//		}
		
		Enable_EnableServiceTypeRestriction();
		
		if(ApplyToAllCategories_YesBtn.isSelected())
		{
			
		}
		else
		{
			ApplyToAllCategories_YesBtn.click();
		}
		
		
		if(ApplyToAllMenuItems_YesBtn.isSelected())
		{
			
		}
		else
		{
			ApplyToAllMenuItems_YesBtn.click();
		}
		
		
		cmp.Click_SaveButton();
	}
	
	public void Enable_ExpoDevice()
	{
		if(ExpoDevice_YesBtn.isSelected())
		{
			
		}
		else
		{
			ExpoDevice_YesBtn.click();
		}
	}
	
	public void Disable_ExpoDevice()
	{
		if(ExpoDevice_YesBtn.isSelected())
		{
			ExpoDevice_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	
	public void Enable_AlternatePrinter()
	{
		if(AlternatePrinter_YesBtn.isSelected())
		{
			
		}
		else
		{
			AlternatePrinter_YesBtn.click();
		}
	}
	
	public void Disable_AlternatePrinter()
	{
		if(AlternatePrinter_YesBtn.isSelected())
		{
			AlternatePrinter_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Select_AlternatePrinter()
	{
		Alternate_PrinterInputBox.click();
		
		
		
		List<WebElement> AlterPrinterList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		int AlterPrinterSize=AlterPrinterList.size();
		
		if(AlterPrinterSize==0)
		{
			Alternate_PrinterInputBox.click();
			
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/select-option")).click();


		}
		else if(AlterPrinterSize==1)
		{
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+AlterPrinterSize+"]/select-option")).click();

		}
		else if(AlterPrinterSize<=10)
		{
		int randomAlterPrinter=ThreadLocalRandom.current().nextInt(1, AlterPrinterSize);
		
		
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomAlterPrinter+"]/select-option")).click();
		}
		else
		{
			int randomAlterPrinter=ThreadLocalRandom.current().nextInt(1, 10);
			
			
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomAlterPrinter+"]/select-option")).click();
		
		}
	}
	
	
	public void Enable_SeatOrderingOverride()
	{
		if(SeatOrderingOverride_YesBtn.isSelected())
		{
			
		}
		else
		{
			SeatOrderingOverride_YesBtn.click();
		}
	}
	
	public WebElement SeatOrderingOverride_YesBtn()
	{
		return SeatOrderingOverride_YesBtn;
	}
	
	public void Disable_SeatOrderingOverride()
	{
		if(SeatOrderingOverride_YesBtn.isSelected())
		{
			SeatOrderingOverride_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Print_VoidedItemstotheKitchen()
	{
		if(Print_VoidedItemstotheKitchen_YesBtn.isSelected())
		{
			
		}
		else
		{
			Print_VoidedItemstotheKitchen_YesBtn.click();
		}
	}
	
	public WebElement Print_VoidedItemstotheKitchen_YesBtn()
	{
		return Print_VoidedItemstotheKitchen_YesBtn;
	}
	
	public void Disable_Print_VoidedItemstotheKitchen()
	{
		if(Print_VoidedItemstotheKitchen_YesBtn.isSelected())
		{
			Print_VoidedItemstotheKitchen_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Print_IncludedModifierInKitchen()
	{
		if(Print_IncludedModifierInKitchen_YesBtn.isSelected())
		{
			
		}
		else
		{
			Print_IncludedModifierInKitchen_YesBtn.click();
		}
	}
	
	public WebElement Print_IncludedModifierInKitchen_YesBtn()
	{
		return Print_IncludedModifierInKitchen_YesBtn;
	}
	
	public void Disable_Print_IncludedModifierInKitchen()
	{
		if(Print_IncludedModifierInKitchen_YesBtn.isSelected())
		{
			Print_IncludedModifierInKitchen_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Print_IncludedModifier_For_AlternateModifier()
	{
		if(Print_IncludedModifier_For_AlternateModifier_YesBtn.isSelected())
		{
			
		}
		else
		{
			Print_IncludedModifier_For_AlternateModifier_YesBtn.click();
		}
	}
	
	public WebElement Print_IncludedModifier_For_AlternateModifier_YesBtn()
	{
		return Print_IncludedModifier_For_AlternateModifier_YesBtn;
	}
	
	public void Disable_Print_IncludedModifier_For_AlternateModifier()
	{
		if(Print_IncludedModifier_For_AlternateModifier_YesBtn.isSelected())
		{
			Print_IncludedModifier_For_AlternateModifier_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_ServingSizeinFront_of_MenuinKOT()
	{
		if(ServingSizeinFront_of_MenuinKOT_YesBtn.isSelected())
		{
			
		}
		else
		{
			ServingSizeinFront_of_MenuinKOT_YesBtn.click();
		}
	}
	
	public WebElement ServingSizeinFront_of_MenuinKOT_YesBtn()
	{
		return ServingSizeinFront_of_MenuinKOT_YesBtn;
	}
	
	public void Disable_ServingSizeinFront_of_MenuinKOT()
	{
		if(ServingSizeinFront_of_MenuinKOT_YesBtn.isSelected())
		{
			ServingSizeinFront_of_MenuinKOT_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	//Receipt Printers
	@FindBy(xpath = "//button[contains(.,'NEW RECEIPT PRINTER')]")
	public WebElement New_ReceiptPrinterBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Set as Default')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement SetasDefault_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Set as Default')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement SetasDefault_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Auto Print Receipt')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement AutoPrintReceipt_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Auto Print Receipt')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement AutoPrintReceipt_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Show CC Receipt Screen')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Show_CC_ReceiptScreen_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Show CC Receipt Screen')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Show_CC_ReceiptScreen_NoBtn;

	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Default')]")
	public WebElement Default_Column_Field;
	
	public void Click_New_ReceiptPrinter() throws Exception
	{
		Thread.sleep(3000);
		New_ReceiptPrinterBtn.click();
	}
	
	public void Enable_SetasDefault()
	{
		if(SetasDefault_YesBtn.isEnabled())
		{
			
		}
		else
		{
			SetasDefault_YesBtn.click();
		}
	}
	
	
	
	public void Disable_SetasDefault()
	{
		if(SetasDefault_YesBtn.isEnabled())
		{
			SetasDefault_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement SetasDefault() 
	{
		return SetasDefault_YesBtn;
	}
	
	public void Enable_AutoPrintReceipt()
	{
		if(AutoPrintReceipt_YesBtn.isEnabled())
		{
			
		}
		else
		{
			AutoPrintReceipt_YesBtn.click();
		}
	}
	
	
	
	public void Disable_AutoPrintReceipt()
	{
		if(AutoPrintReceipt_YesBtn.isEnabled())
		{
			AutoPrintReceipt_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement AutoPrintReceipt() 
	{
		return AutoPrintReceipt_YesBtn;
	}
	
	public void Enable_Show_CC_ReceiptScreen()
	{
		if(Show_CC_ReceiptScreen_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Show_CC_ReceiptScreen_YesBtn.click();
		}
	}
	
	
	
	public void Disable_Show_CC_ReceiptScreen()
	{
		if(Show_CC_ReceiptScreen_YesBtn.isEnabled())
		{
			Show_CC_ReceiptScreen_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Show_CC_ReceiptScreen() 
	{
		return Show_CC_ReceiptScreen_YesBtn;
	}
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print CC Customer Copy')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Print_CC_CustomerCopy_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print CC Customer Copy')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Print_CC_CustomerCopy_NoBtn;

	public void Enable_Print_CC_CustomerCopy()
	{
		if(Print_CC_CustomerCopy_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Print_CC_CustomerCopy_YesBtn.click();
		}
	}
	
	
	
	public void Disable_Print_CC_CustomerCopy()
	{
		if(Print_CC_CustomerCopy_YesBtn.isEnabled())
		{
			Print_CC_CustomerCopy_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Print_CC_CustomerCopy() 
	{
		return Print_CC_CustomerCopy_YesBtn;
	}
	
	@FindBy(xpath = "//app-toggle[contains(.,'Show Digital Receipt Screen')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Show_Digital_ReceiptScreen_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Show Digital Receipt Screen')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Show_Digital_ReceiptScreen_NoBtn;

	public void Enable_Show_Digital_ReceiptScreen()
	{
		if(Show_Digital_ReceiptScreen_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Show_Digital_ReceiptScreen_YesBtn.click();
		}
	}
	
	public void Disable_Show_Digital_ReceiptScreen()
	{
		if(Show_Digital_ReceiptScreen_YesBtn.isEnabled())
		{
			Show_Digital_ReceiptScreen_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Show_Digital_ReceiptScreen() 
	{
		return Show_Digital_ReceiptScreen_YesBtn;
	}
	
	@FindBy(xpath = "//app-toggle[contains(.,'Show Digital Receipt in CDS')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Show_Digital_ReceiptinCDS_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Show Digital Receipt in CDS')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Show_Digital_ReceiptinCDS_NoBtn;
	
	public void Enable_Show_Digital_ReceiptinCDS()
	{
		if(Show_Digital_ReceiptinCDS_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Show_Digital_ReceiptinCDS_YesBtn.click();
		}
	}
	
	public void Disable_Show_Digital_ReceiptinCDS()
	{
		if(Show_Digital_ReceiptinCDS_YesBtn.isEnabled())
		{
			Show_Digital_ReceiptinCDS_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Show_Digital_ReceiptinCDS() 
	{
		return Show_Digital_ReceiptinCDS_YesBtn;
	}
	
	@FindBy(xpath = "//app-toggle[contains(.,'Show Signature Pad')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Show_SignaturePad_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Show Signature Pad')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Show_SignaturePad_NoBtn;
	
	public void Enable_Show_SignaturePad()
	{
		if(Show_SignaturePad_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Show_SignaturePad_YesBtn.click();
		}
	}
	
	public void Disable_Show_SignaturePad()
	{
		if(Show_SignaturePad_YesBtn.isEnabled())
		{
			Show_SignaturePad_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Show_SignaturePad() 
	{
		return Show_SignaturePad_YesBtn;
	}
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print CC Merchant Copy')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Print_CC_MerchantCopy_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Print CC Merchant Copy')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Print_CC_MerchantCopy_NoBtn;
	
	
	public void Enable_Print_CC_MerchantCopy()
	{
		if(Print_CC_MerchantCopy_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Print_CC_MerchantCopy_YesBtn.click();
		}
	}
	
	public void Disable_Print_CC_MerchantCopy()
	{
		if(Print_CC_MerchantCopy_YesBtn.isEnabled())
		{
			Print_CC_MerchantCopy_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Print_CC_MerchantCopy() 
	{
		return Print_CC_MerchantCopy_YesBtn;
	}
	
	
	@FindBy(xpath = "//app-toggle[contains(.,'Remove Tip Line')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Remove_Tip_Line_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Remove Tip Line')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Remove_Tip_Line_NoBtn;
	
	
	public void Enable_Remove_Tip_Line()
	{
		if(Remove_Tip_Line_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Remove_Tip_Line_YesBtn.click();
		}
	}
	
	public void Disable_Remove_Tip_Line()
	{
		if(Remove_Tip_Line_YesBtn.isEnabled())
		{
			Remove_Tip_Line_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Remove_Tip_Line() 
	{
		return Remove_Tip_Line_YesBtn;
	}
	
	@FindBy(xpath = "//app-toggle[contains(.,'Enable Itemized Receipt')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Enable_Itemized_Receipt_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Enable Itemized Receipt')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Enable_Itemized_Receipt_NoBtn;
	
	public void Enable_Enable_Itemized_Receipt()
	{
		if(Enable_Itemized_Receipt_YesBtn.isEnabled())
		{
			
		}
		else
		{
			Enable_Itemized_Receipt_YesBtn.click();
		}
	}
	
	public void Disable_Enable_Itemized_Receipt()
	{
		if(Enable_Itemized_Receipt_YesBtn.isEnabled())
		{
			Enable_Itemized_Receipt_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public WebElement Enable_Itemized_Receipt() 
	{
		return Enable_Itemized_Receipt_YesBtn;
	}
	
	
	//Label Printers page objects
	@FindBy(xpath = "//button[contains(.,'NEW LABEL PRINTER')]")
	public WebElement New_LabelPrinterBtn;
	
	@FindBy(xpath = "//app-radio-box-button[@name='printertype']/div/div/div[contains(.,'Kitchen Label')]")
	public WebElement Kitchen_Label_PrinterTypeBtn;
	
	@FindBy(xpath = "//app-radio-box-button[@name='printertype']/div/div/div[contains(.,'Box Label')]")
	public WebElement Box_Label_PrinterTypeBtn;
	
	public void Click_New_LabelPrinter()
	{
		New_LabelPrinterBtn.click();
	}
	
	
	public void Click_KitchenLabel_PrinterType()
	{
		Kitchen_Label_PrinterTypeBtn.click();
	}
	
	public WebElement Kitchen_LabelBtn()
	{
		return Kitchen_Label_PrinterTypeBtn;
	}
	
	public void Click_BoxLabel_PrinterType()
	{
		Box_Label_PrinterTypeBtn.click();
	}
	
	public WebElement Box_LabelBtn()
	{
		return Box_Label_PrinterTypeBtn;
	}
	
	public WebElement Printer_ModelInputBox()
	{
		return Printer_ModelInputBox;
	}
	
	public WebElement Alternate_PrinterInputBox()
	{
		return Alternate_PrinterInputBox;
	}
	
	@FindBy(xpath = "//input[@data-placeholder='Search ']")
	WebElement SearchBox;
	
	public void SearchAndClickEdit(String SearchValue) throws Exception
	{
		
		//Wait_ForElementVisibility(SearchBox, 180);
	
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);
		try
		{
			Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")).click();
		
		}
		catch(Exception g)
		{
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")).click();
		}
		
		}
	
	public void SearchAndClickDelete(String SearchValue) throws Exception
	{
		//Wait_ForElementVisibility(SearchBox, 180);
		try
		{
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[2]/button")).click();
		Thread.sleep(1000);
		}
		catch(Exception h)
		{
			Thread.sleep(1000);
			SearchBox.clear();
			Thread.sleep(2000);

			SearchBox.sendKeys(SearchValue);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[2]/button")).click();
			Thread.sleep(1000);
		}
	}
	
	public void Enter_Label_Printer_Name(String str) throws Exception
	{
		Thread.sleep(1000);
		LabelPrinter_NameInputBx.clear();
		Thread.sleep(500);
		LabelPrinter_NameInputBx.sendKeys(str);
	}
	
}
