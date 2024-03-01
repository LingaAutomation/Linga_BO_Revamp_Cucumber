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

public class ModifiersPage extends BasePage {

	
//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	Common_XPaths cmp=new Common_XPaths();
	Utility ut=new Utility();
	
//	public ModifiersPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW MODIFIER')]")
	WebElement New_ModifierBtn;
	
	@FindBy(xpath = "//label[contains(.,'Prefixary Name')]/../../input")
	WebElement Prefixary_NameInputBox;
	
	@FindBy(xpath = "//label[contains(.,'PLU Code')]/../../input")
	WebElement PLU_CodeInputBox;
	
	@FindBy(xpath = "//input[@aria-label='Maximum No of Times']")
	public WebElement Maximum_NoTimesInputBox;
	
	public @FindBy(xpath = "//div[contains(@id,'new-modifier-general')]/div/div/div[contains(.,'Enter valid maximum number of times')]")
	WebElement Max_TimesErrorMsg;
	
	@FindBy(xpath = "//label[contains(.,'Modify With')]/../../input")
	public WebElement ModifyWith_DropBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add Prefix')]")
	public WebElement Add_PrefixBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add Serving Size Level')]")
	public WebElement Add_ServingSizeLevelBtn;
	
	@FindBy(xpath = "//span[.='Show Modifier']/../../div//div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement ShowModifier_YesBtn;
	
	@FindBy(xpath = "//span[.='Show Modifier']/../../div//div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement ShowModifier_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Show Menu Item In Modifier Print')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement ShowMenuItemModiInPrint_YesBtn;
	
	@FindBy(xpath = "//span[contains(.,'Show Menu Item In Modifier Print')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement ShowMenuItemModiInPrint_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Show Modifier In Menu Print')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement ShowModifierInMenuPrint_YesBtn;
	
	@FindBy(xpath = "//span[contains(.,'Show Modifier In Menu Print')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement ShowModifierInMenuPrint_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Set Price Here')]/../..//div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement SetPriceHere_YesBtn;
	
	@FindBy(xpath = "//span[contains(.,'Set Price Here')]/../..//div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement SetPriceHere_NoBtn;

	@FindBy(xpath = "//mat-step-header[contains(.,'Proceed to Inventory Mapping')]")
	public WebElement ProceedToInventoryMappingTab;
	
	@FindBy(xpath = "//app-information-content/div/div/div/div/span")
	public WebElement InfoContent;
	
	@FindBy(xpath = "(//div[@class='radio-box'][.='Item'])[1]")
	public WebElement Modifier_ItemType_Item_RadioBtn;
	
	@FindBy(xpath = "(//div[@class='radio-box'][.='Menu Item'])[1]")
	public WebElement Modifier_ItemType_MenuItem_RadioBtn;
	
	@FindBy(xpath = "(//div[@class='radio-box'][.='Sub Recipe'])[1]")
	public WebElement Modifier_ItemType_SubRecipe_RadioBtn;
	
	@FindBy(xpath = "(//input[@aria-label='Sub Recipe'])[1]")
	public WebElement Modifier_SubRecipe_ItemTypeInputBx;
	
	@FindBy(xpath = "(//input[@aria-label='Menu Item'])[1]")
	public WebElement Modifier_MenuItem_ItemTypeInputBx;
	
	@FindBy(xpath = "(//input[@aria-label='Category'])[1]")
	public WebElement Modifier_Category_ItemTypeInputBx;
	
	@FindBy(xpath = "(//input[@aria-label='Inventory Item'])[1]")
	public WebElement Modifier_InventoryItem_ItemTypeInputBx;
	
	@FindBy(xpath = "(//div[@class='radio-box'][.='Item'])[1]")
	public WebElement Prefix_ItemType_Item_RadioBtn;
	
	@FindBy(xpath = "(//div[@class='radio-box'][.='Sub Recipe'])[2]")
	public WebElement Prefix_ItemType_SubRecipe_RadioBtn;
	
	@FindBy(xpath = "(//input[@aria-label='Sub Recipe'])[2]")
	public WebElement Prefix_SubRecipe_ItemTypeInputBx;
	
	@FindBy(xpath = "(//input[@aria-label='Category'])[2]")
	public WebElement Prefix_Category_ItemTypeInputBx;
	
	@FindBy(xpath = "(//input[@aria-label='Inventory Item'])[2]")
	public WebElement Prefix_InventoryItem_ItemTypeInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Prefix Name']")
	public WebElement PrefixInputColumn;
	
	@FindBy(xpath = "//input[@aria-label='Serving Size - Prefix']")
	public WebElement ServingSizeLevelInputColumn;
	
	@FindBy(xpath = "(//mat-slide-toggle[contains(.,'Is Inventory Item')])[1]")
	public WebElement Is_InventoryItem_Modifier_ItemType_Toggle;
	
	@FindBy(xpath = "(//mat-slide-toggle[contains(.,'Is Inventory Item')])[2]")
	public WebElement Is_InventoryItem_Prefix_ItemType_Toggle;
	
	public WebElement PrefixInputColumn()
	{
		return PrefixInputColumn;
	}
	
	public WebElement ServingSizeLevelInputColumn()
	{
		return ServingSizeLevelInputColumn;
	}
	
	//h6[contains(.,'Modifiers and Prefixes')]/../../div[ 3]/mat-accordion/app-accordion/div/mat-expansion-panel/div/div/div/div[2]/div/app-radio-box-button/div/div/div/label[.='Item']
	//h6[contains(.,'Modifiers and Prefixes')]/../../div[ 3]/mat-accordion/app-accordion/div/mat-expansion-panel/div/div/div/div[2]/div/app-radio-box-button/div/div/div/label[.='Sub Recipe']
	//2nd row sub recipe input
	//h6[contains(.,'Modifiers and Prefixes')]/../../div[3]/mat-accordion/app-accordion/div/mat-expansion-panel/div/div/div[2]/div/app-selectbox/div/mat-form-field/div/div/div[3]/input
	//2nd row category
	//h6[contains(.,'Modifiers and Prefixes')]/../../div[3]/mat-accordion/app-accordion/div/mat-expansion-panel/div/div/div[2]/div[1]/app-selectbox/div/mat-form-field/div/div/div[3]/input
	//2nd row inventory item
	//h6[contains(.,'Modifiers and Prefixes')]/../../div[3]/mat-accordion/app-accordion/div/mat-expansion-panel/div/div/div[2]/div[2]/app-selectbox/div/mat-form-field/div/div/div[3]/input
	
	public WebElement InfoContent()
	{
		return InfoContent;
	}
	
	
	public WebElement ProceedToInventoryMappingTab()
	{
		return ProceedToInventoryMappingTab;
	}
	
	//mat-step-header[contains(.,'Proceed to Inventory Mapping')]/div[2]
	@FindBy(xpath = "//mat-step-header[contains(.,'Basic Details')]")
	public WebElement BasicDetailsTab;
	
	@FindBy(xpath = "//mat-step-header[contains(.,'Prefixes and Serving Size Levels')]")
	public WebElement Prefixs_and_ServingSizePrefixTab;
	
	@FindBy(xpath = "//button[contains(.,'SAVE AND PROCEED')]")
	public WebElement SaveAndProceedBtn;
	
	@FindBy(xpath = "//button[contains(.,'Proceed without saving')]")
	public WebElement ProceedwithoutSavingBtn;
	
	
	
	
	public void Click_NewModifierButton() throws Exception
	{
		Thread.sleep(1000);
		New_ModifierBtn.click();
	}
	
	
	public void Enter_PrefixaryName(String str)
	{
		Prefixary_NameInputBox.clear();
		
		Prefixary_NameInputBox.sendKeys(str);
	}
	
	public void Enter_PLUCode(String str)
	{
		PLU_CodeInputBox.clear();
		
		PLU_CodeInputBox.sendKeys(str);
	}
	
	
	public void Enter_MaximumNoOfTimes(String str)
	{
		Maximum_NoTimesInputBox.clear();
		
		Maximum_NoTimesInputBox.sendKeys(str);
	}
	
	public WebElement Maximum_NoTimesInputBox()
	{
		return Maximum_NoTimesInputBox;
		
	}
	
	public WebElement Max_TimesErrorMsg()
	{
		return Max_TimesErrorMsg;
	}
	
	public void Verify_Maximum_No_ofTimesErrorMsg()
	{
		try
		{
		if(Max_TimesErrorMsg().isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter valid maximum number of times Displayed when Entering Negative values");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Enter valid maximum number of times not diisplayed when Entering Negative values");
		}
		
	}
	
	public void Select_ModifyWith() throws Exception
	{
		Thread.sleep(1000);
		ModifyWith_DropBtn.click();
		
		
		List<WebElement> ModifyWithList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int ModifyWithSize=ModifyWithList.size();
		
		
		if(ModifyWithSize==0)
		{
			
			List<WebElement> ModifyWithList1=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
			
			int ModifyWithSize1=ModifyWithList1.size();
			
			
			int randomModifyWith=ThreadLocalRandom.current().nextInt(1, ModifyWithSize1);
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomModifyWith+"]")).click();
		
		}
		else if(ModifyWithSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+ModifyWithSize+"]")).click();
		
		}
		else if(ModifyWithSize<=10)
		{
			
		int randomModifyWith=ThreadLocalRandom.current().nextInt(1, ModifyWithSize);
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomModifyWith+"]")).click();
		}
		else
		{
			int randomModifyWith=ThreadLocalRandom.current().nextInt(1, 10);
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomModifyWith+"]")).click();
			
		}
		
		List<WebElement> ModifyWithList1=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));

		if(ModifyWithList1.size()!=0)
		{
			ModifyWith_DropBtn.click();
			
		}
	}
	
	public void Select_ModifierTax()
	{
		List<WebElement> ModifTaxList=driver.findElements(By.xpath("//div[@id='new-modifier-tax']/div[4]/div/app-chip/div/mat-chip-list/div/mat-chip"));
		
		int ModifTaxSize=ModifTaxList.size();
		
		driver.findElement(By.xpath("//button[contains(.,'Show All')]")).click();
		
		int randomModifTax=ThreadLocalRandom.current().nextInt(1, ModifTaxSize);
		
		if(driver.findElement(By.xpath("//div[@id='new-modifier-tax']/div[4]/div/app-chip/div/mat-chip-list/div/mat-chip["+randomModifTax+"]")).isSelected())
		{
			
		}
		else
		{
			driver.findElement(By.xpath("//div[@id='new-modifier-tax']/div[4]/div/app-chip/div/mat-chip-list/div/mat-chip["+randomModifTax+"]")).click();
		}
		
	}
	
	@FindBy(xpath = "//div[@id='new-modifier-kitchen-printers']//button[contains(.,'Show All')]")
	WebElement ShowAll_KitchenPrinterBtn;
	
	public void Select_ModifierKitchenPrinters() throws Exception
	{
		List<WebElement> KitchenPrinterList=driver.findElements(By.xpath("//div[@id='new-modifier-kitchen-printers']/div[3]/div/app-chip/div/mat-chip-list/div/mat-chip"));
		
		int KitchenPrinterSize=KitchenPrinterList.size();
		
		
		int randomModifKitchenPrinter=ThreadLocalRandom.current().nextInt(1, KitchenPrinterSize);
	
		try
		{
		if(ShowAll_KitchenPrinterBtn.isDisplayed())
		{
			Thread.sleep(1000);
			ShowAll_KitchenPrinterBtn.click();
		}
		}
		catch(Exception pl) {}
			
			Thread.sleep(1000);
		if(driver.findElement(By.xpath("//div[@id='new-modifier-kitchen-printers']/div[3]/div/app-chip/div/mat-chip-list/div/mat-chip["+randomModifKitchenPrinter+"]")).isSelected())
		{
			
		}
		else
		{
		driver.findElement(By.xpath("//div[@id='new-modifier-kitchen-printers']/div[3]/div/app-chip/div/mat-chip-list/div/mat-chip["+randomModifKitchenPrinter+"]")).click();
		}
		
		
	}
	
	public void Enable_ShowModifierInMenuPrint()
	{
		if(ShowModifierInMenuPrint_YesBtn.isSelected())
		{
			
		}
		else
		{
			ShowModifierInMenuPrint_YesBtn.click();
		}
	}
	
	public void Enable_ShowMenuItemInModifierPrint()
	{
		if(ShowMenuItemModiInPrint_YesBtn.isSelected())
		{
			
		}
		else
		{
			ShowMenuItemModiInPrint_YesBtn.click();
		}
	}
	
	public void Enable_ShowModifier()
	{
		if(ShowModifier_YesBtn.isSelected())
		{
			
		}
		else
		{
			ShowModifier_YesBtn.click();
		}
	}
	
	public void Disable_ShowModifierInMenuPrint()
	{
		if(ShowModifierInMenuPrint_YesBtn.isSelected())
		{
			ShowModifierInMenuPrint_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Click_ProceedToInventoryMappingTab()
	{
		ProceedToInventoryMappingTab.click();
	}
	
	public void Click_BasicDetailsTab() throws Exception
	{
		Thread.sleep(2000);
		BasicDetailsTab.click();
	}
	
	public void Click_Prefixs_and_ServingSizesTab()
	{
		Prefixs_and_ServingSizePrefixTab.click();
	}
	
	public void Disable_ShowMenuItemInModifierPrint()
	{
		if(ShowMenuItemModiInPrint_YesBtn.isSelected())
		{
			ShowMenuItemModiInPrint_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Disable_ShowModifier()
	{
		if(ShowModifier_YesBtn.isSelected())
		{
			ShowModifier_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Click_AddPrefixbutton()
	{
		Add_PrefixBtn.click();
	}
	
	public void Click_AddServingSizeLevelbutton()
	{
		Add_ServingSizeLevelBtn.click();
	}
	
	public void Enter_Prefix_with_Override_ModifierPrice(String str, String str2) throws Exception
	{
		cmp=new Common_XPaths();
		
		cmp.Prefix_Tab_inContents.click();
		Thread.sleep(500);
	
	for(int i=1;i<=3;i++)
	{
		Click_AddPrefixbutton();
	}
//		
		List<WebElement> PrefixList=driver.findElements(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input"));
	
		for(int i=2;i<=PrefixList.size();i++)
		{
			//Prefix name
			driver.findElement(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div["+i+"]/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			
			driver.findElement(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div["+i+"]/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(str+i);
			Thread.sleep(500);

			//Prefix price
			driver.findElement(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div["+i+"]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			
			driver.findElement(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div["+i+"]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(str2);
			
			Thread.sleep(500);
	
			if(driver.findElement(By.xpath("(//div[@id='new-modifier-serving-sizes-prefixes']//section/mat-slide-toggle)["+i+"]")).isSelected())
			{
				
			}
			else
			{
				driver.findElement(By.xpath("(//div[@id='new-modifier-serving-sizes-prefixes']//section/mat-slide-toggle)["+i+"]")).click();
			}
			
		}
		
		List<WebElement> PrefixList1=driver.findElements(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input"));
		
		
		for(int i=2;i<=PrefixList1.size();i++)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div[3]/div/button")).click();
			Thread.sleep(500);

		cmp.Click_DeleteButton();
		}
		
	}
	
	public void Remove_Prefix() throws Exception
	{
		cmp=new Common_XPaths();
		cmp.Prefix_Tab_inContents.click();
//		Click_AddPrefixbutton();
		
		List<WebElement> PrefixList=driver.findElements(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input"));
		
		for(int i=2;i<=PrefixList.size();i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']/div[3]/app-input-table[1]/div/div[2]/div/button")).click();
			Thread.sleep(1000);

		cmp.Click_DeleteButton();
		}
	}
	
	public void Remove_ServingSizeLevel() throws Exception
	{
	cmp=new Common_XPaths();
//		Click_AddServingSizeLevelbutton();
	cmp.Serving_Sizes_Tab_inContents.click();
	Thread.sleep(2000);
		
		
		List<WebElement> SizeList=driver.findElements(By.xpath("//div[@class='serving-size-prefix-row']/div/div/div/app-selectbox[contains(@id,'servingSize')]/div/mat-form-field/div/div/div[3]/input"));
		
		for(int i=2;i<=SizeList.size();i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='serving-size-prefix-row']/div[2]/div[2]/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button/span[contains(.,'DELETE')]")).click();
			Thread.sleep(1000);
		}
		
	}
	
	public void Enable_SetPriceHere()
	{
		if(SetPriceHere_YesBtn.isSelected())
		{
			
		}
		else
		{
			SetPriceHere_YesBtn.click();
		}
	}
	
	public void Disable_SetPriceHere()
	{
		if(SetPriceHere_YesBtn.isSelected())
		{
			SetPriceHere_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enter_ServingSizeLevel(String str) throws Exception
	{
		cmp=new Common_XPaths();
		
		cmp.Serving_Sizes_Tab_inContents.click();
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
			Click_AddServingSizeLevelbutton();
		}
		Thread.sleep(500);

		Enable_SetPriceHere();
		Thread.sleep(500);

		List<WebElement> SizeList=driver.findElements(By.xpath("//div[@class='serving-size-prefix-row']/div/div/div/app-selectbox[contains(@id,'servingSize')]/div/mat-form-field/div/div/div[3]/input"));
		for(int k=2;k<=SizeList.size();k++)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='serving-size-prefix-row']/div["+k+"]/div/div/app-selectbox[contains(@id,'servingSize')]/div/mat-form-field/div/div/div[3]/input")).click();
		
		List<WebElement> OpSizeList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int OpSizeSize=OpSizeList.size();
		
		if(OpSizeSize==0)
		{
			
		}
		else if(OpSizeSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+OpSizeSize+"]")).click();
	
		}
		else if(OpSizeSize<=10)
		{
			int randomOpSize=ThreadLocalRandom.current().nextInt(1, OpSizeSize);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomOpSize+"]")).click();
			
		}
		else
		{
		int randomOpSize=ThreadLocalRandom.current().nextInt(1, 10);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomOpSize+"]")).click();
		}
		List<WebElement> OpSizeList1=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));

		if(OpSizeList1.size()!=0)
		{
			driver.findElement(By.xpath("//div[@class='serving-size-prefix-row']/div["+k+"]/div/div/app-selectbox[contains(@id,'servingSize')]/div/mat-form-field/div/div/div[3]/input")).click();
			
		}
		//Enter the price here
		
		driver.findElement(By.xpath("//div[@class='serving-size-prefix-row']/div["+k+"]/div[1]/div/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
		
		driver.findElement(By.xpath("//div[@class='serving-size-prefix-row']/div["+k+"]/div[1]/div/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(str);
		
		}
		
	//	List<WebElement> delBtns=driver.findElements(By.xpath("//div[@class='serving-size-prefix-row']/div/div[2]/button"));
		for(int i=1;i<=2;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='serving-size-prefix-row']/div[3]/div[2]/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(.,'DELETE')]")).click();
		}
		
	
		//div[@class='serving-size-prefix-row']/div[3]/div[1]/div/app-input/div/div/mat-form-field/div/div/div[4]/input
	
	
	}
	
	public void Click_SaveAndProceed()
	{
		SaveAndProceedBtn.click();
	}
	
	public void Click_ProceedWithoutSaving()
	{
		ProceedwithoutSavingBtn.click();
	}
	
	public void Add_ItemInventoryModiferModifier()
	{
		
		 
		Modifier_ItemType_Item_RadioBtn.click();
		
		Modifier_Category_ItemTypeInputBx.click();
		
	List<WebElement> CatList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int CatSize=CatList.size();
		
		if(CatSize==0)
		{
			Modifier_Category_ItemTypeInputBx.click();
			
			List<WebElement> CatList1=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
			
			int CatSize1=CatList1.size();
			
			int randomCat=ThreadLocalRandom.current().nextInt(1, CatSize1);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomCat+"]")).click();
		
		}
		else if(CatSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+CatSize+"]")).click();

		}
		else if(CatSize<=6)
		{
		int randomCat=ThreadLocalRandom.current().nextInt(1, CatSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomCat+"]")).click();
		}
		else
		{
			int randomCat=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomCat+"]")).click();
		
		}
		
		Modifier_InventoryItem_ItemTypeInputBx.click();
		
	List<WebElement> ItemList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int ItemSize=ItemList.size();
		
	if(ItemSize==0)
	{
		Modifier_InventoryItem_ItemTypeInputBx.click();
		
		try
		{
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div[1]")).click();
		}catch(Exception pl) { test.log(LogStatus.INFO, "Inventory Item Not available for this Category");}
		
	}
	else if(ItemSize==1)
	{
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+ItemSize+"]")).click();

	}
	else if(ItemSize<=6)
	{
		int randomItem=ThreadLocalRandom.current().nextInt(1, ItemSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomItem+"]")).click();
	}
	else
	{
	int randomItem=ThreadLocalRandom.current().nextInt(1, 6);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomItem+"]")).click();
	
	}
	}
	
	public void Add_MenuItemInventoryModiferModifier()
	{
	
		Modifier_ItemType_MenuItem_RadioBtn.click();
		
		Modifier_MenuItem_ItemTypeInputBx.click();
		
	List<WebElement> MenuList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int MenuSize=MenuList.size();
		
		if(MenuSize==0)
		{
			Modifier_MenuItem_ItemTypeInputBx.click();

			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div[1]")).click();
		
		}
		else if(MenuSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+MenuSize+"]")).click();
		
		}
		else if(MenuSize<=6)
		{
		int randomMenu=ThreadLocalRandom.current().nextInt(1, MenuSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomMenu+"]")).click();
		}
		else 
		{
			int randomMenu=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomMenu+"]")).click();
		
		}
		
		
	}
	public void Add_SubRecipeInventoryModiferModifier()
	{
	
	
		Modifier_ItemType_SubRecipe_RadioBtn.click();
		
		Modifier_MenuItem_ItemTypeInputBx.click();
		
	List<WebElement> SubRecList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int SubRecSize=SubRecList.size();
		
		if(SubRecSize==0)
		{
			Modifier_MenuItem_ItemTypeInputBx.click();

			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div[1]")).click();

		}
		else if(SubRecSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+SubRecSize+"]")).click();

		}
		else if(SubRecSize<=6)
		{
		
		int randomSubRec=ThreadLocalRandom.current().nextInt(1, SubRecSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomSubRec+"]")).click();
		}
		else
		{
			int randomSubRec=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomSubRec+"]")).click();
		}
			
		
	
	}
	public void Add_ItemInventoryModiferPrefix()
	{
		try 
		{
			if(Prefix_ItemType_Item_RadioBtn.isDisplayed())
			{
			Prefix_ItemType_Item_RadioBtn.click();
		
		
		Prefix_Category_ItemTypeInputBx.click();
		
		List<WebElement> CatList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int CatSize=CatList.size();
		
		if(CatSize==0)
		{
			Prefix_Category_ItemTypeInputBx.click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div[1]")).click();

		}
		else if(CatSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+CatSize+"]")).click();
		
		}
		else if(CatSize<=6)
		{
		int randomCat=ThreadLocalRandom.current().nextInt(1, CatSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomCat+"]")).click();
		}
		else
		{
			int randomCat=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomCat+"]")).click();
		
		}
		
		Prefix_InventoryItem_ItemTypeInputBx.click();
		
	List<WebElement> ItemList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int ItemSize=ItemList.size();
		
		if(ItemSize==0)
		{
			Prefix_InventoryItem_ItemTypeInputBx.click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div[1]")).click();

		}
		else if(ItemSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+ItemSize+"]")).click();
		
		}
		else if(ItemSize<=6)
		{
		int randomItem=ThreadLocalRandom.current().nextInt(1, ItemSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomItem+"]")).click();
		}
		else
		{
			int randomItem=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomItem+"]")).click();
		
		}
		}
		}
		catch(Exception h)
		{
			
		}
		
	}
	
	public void Add_SubRecipeInventoryModiferPrefix() throws Exception
	{
		try
		{ 
		if(Prefix_ItemType_SubRecipe_RadioBtn.isDisplayed())
		{
			Prefix_ItemType_SubRecipe_RadioBtn.click();
		
		Prefix_SubRecipe_ItemTypeInputBx.click();
		
		List<WebElement> SubRecList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
		
		int SubRecSize=SubRecList.size();
		 
		if(SubRecSize==0)
		{
			Prefix_SubRecipe_ItemTypeInputBx.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div[1]")).click();

		}
		else if(SubRecSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+SubRecSize+"]")).click();
	
		}
		else if(SubRecSize<=6)
		{
		int randomSubRec=ThreadLocalRandom.current().nextInt(1, SubRecSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomSubRec+"]")).click();
		}
		else
		{
			
			int randomSubRec=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomSubRec+"]")).click();
		
		}
		}
		}
	
	catch(Exception p) {}
	}
}
