package com.Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class ModifierGroupsPage extends BasePage
{

	
//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	Utility ut=new Utility();
//	public ModifierGroupsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	ModifiersPage mp=new ModifiersPage();
	
	@FindBy(xpath = "//button[contains(.,'NEW MODIFIER GROUP')]")
	WebElement New_ModifierGroupBtn;
	
	@FindBy(xpath = "//span[contains(.,'Pizza Topping')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement PizzaTopping_YesBtn;
	
	@FindBy(xpath = "//span[contains(.,'Pizza Topping')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement PizzaTopping_NoBtn;
	
	@FindBy(xpath = "//span[contains(.,'Hide Modifier Group')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement HideModifierGroup_YesBtn;
	
	@FindBy(xpath = "//span[contains(.,'Hide Modifier Group')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement HideModifierGroup_NoBtn;
	
	@FindBy(xpath = "//app-auto-complete[@label='Search Modifiers']/..//div/mat-form-field/div/div[1]/div[3]//input")
	WebElement Modifiers_SearchInputBox;
	
	@FindBy(xpath = "//button[contains(.,'Add Serving')]")
	WebElement Add_PriceBtn;
	
	@FindBy(xpath = "//label[contains(.,'Priority')]/../../input")
	WebElement Priority_ModifierGrpInputBox;
	
	@FindBy(xpath = "//mat-step-header[contains(.,'Proceed to Inventory Menu Items Mapping')]")
	WebElement ProceedtoInventoryMenuItemsMappingTab;
	
	@FindBy(xpath = "//div[contains(@class,'sort-select-box')]/app-selectbox/div/mat-form-field/div/div/div[3]/input")
	WebElement SortBy_Btn;
	
	@FindBy(xpath = "//select-option[contains(.,'A-Z')]")
	WebElement AtoZ_Sort;
	
	@FindBy(xpath = "//select-option[contains(.,'Z-A')]")
	WebElement ZtoA_Sort;
	
	@FindBy(xpath = "//select-option[contains(.,'CUSTOM')]")
	WebElement Custom_Sort;
	
	@FindBy(xpath = "//div[@id='new-modifier']/div[2]/div/div/div/div[4]/div[2]/div/div[2]/p")
	WebElement Number_ExceptionErrorMsg;
	
	@FindBy(xpath = "//h3[contains(.,'Inventory Menu Item')]")
	WebElement Inventory_MenuItemHeader;
	
	@FindBy(xpath = "//div[contains(@id,'cdk-drop-list')]/div[1]/div/mat-icon")
	WebElement FirstModifier;
	
	@FindBy(xpath = "//div[contains(@id,'cdk-drop-list')]/div[2]/div/mat-icon")
	WebElement SecondModifier;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/app-switch")
	WebElement HideInOnline_Order;
	
	@FindBy(xpath = "//button[contains(.,'Add Serving')]")
	WebElement Add_ServingSizeBtn;
	
	@FindBy(xpath = "//div[.=' Serving Size Already Exists ']")
	public WebElement Serving_Size_Already_Exist_ErrorMsg;
	
	@FindBy(xpath = "//span[.='Sort By']/..//app-selectbox//input")
	WebElement SortBy_InputBox;
	
	public void Click_NewModifierGroup()
	{
		New_ModifierGroupBtn.click();
	}
	
	public void Click_ProceedtoInventoryMenuItemsMappingTab()
	{
		ProceedtoInventoryMenuItemsMappingTab.click();
	}
	
	public WebElement ProceedtoInventoryMenuItemsMappingTab()
	{
		return ProceedtoInventoryMenuItemsMappingTab;
	}
	
	public void Enter_Priority(String str)
	{
		Priority_ModifierGrpInputBox.clear();
		
		Priority_ModifierGrpInputBox.sendKeys(str);
	}
	
	public void Verify_InvalidNumberErrorMsg(String str)
	{
		if(Number_ExceptionErrorMsg.getText().equalsIgnoreCase(str))
		{
			test.log(LogStatus.PASS, str+" is Displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, str+" is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Enable_PizzaTopping()
	{
		if(PizzaTopping_YesBtn.isSelected())
		{
			
		}
		else
		{
			PizzaTopping_YesBtn.click();
		}
	}
	
	public void Disable_PizzaTopping()
	{
		if(PizzaTopping_YesBtn.isSelected())
		{
			PizzaTopping_NoBtn.click();
		}
		else
		{
			
		}
	}

	public void Enable_HideModifierGroup()
	{
		if(HideModifierGroup_YesBtn.isSelected())
		{
			
		}
		else
		{
			HideModifierGroup_YesBtn.click();
		}
	}
	
	public void Disable_HideModifierGroup()
	{
		if(HideModifierGroup_YesBtn.isSelected())
		{
			HideModifierGroup_NoBtn.click();
		}
		else
		{
			
		}
	}

	
	public void Verify_AscendingSortingforModifiers() throws Exception
	{
		
		ArrayList<String> ArLst=new ArrayList<String>();
//		if(driver.findElement(By.xpath("//span[contains(.,'Name')]/../div[contains(@class,'mode-asc')]")).isDisplayed())
//		{
		Thread.sleep(1000);

			List<WebElement> NameLst=driver.findElements(By.xpath("//tbody/tr/td[1]"));
			
			for(WebElement ele:NameLst)
			{ 
				ArLst.add(ele.getText());
			}
			
//			ArrayList<String> sortedLst=new ArrayList<String>();
//			
//			for(String st:ArLst)
//			{
//				sortedLst.add(st);
//			}
			Thread.sleep(1000);
			Collections.sort(ArLst);
			Thread.sleep(2000);
	
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.elementToBeClickable(SortBy_Btn)).click();
//			SortBy_Btn.click();
			Thread.sleep(1000);
	
			AtoZ_Sort.click();
			Thread.sleep(1000);

			ArrayList<String> AfterArLst=new ArrayList<String>();
		
			List<WebElement> NameAfterSort=driver.findElements(By.xpath("//tbody/tr/td[1]"));
			Thread.sleep(1000);

			for(WebElement ele:NameAfterSort)
			{ 
				AfterArLst.add(ele.getText());
			}
			
//			ArrayList<String> sortedLstAft=new ArrayList<String>();
//			
//			for(String st:AfterArLst)
//			{
//				sortedLstAft.add(st);
//			}
			Thread.sleep(1000);

			
			if(ArLst.equals(AfterArLst))
			{
				test.log(LogStatus.PASS, "Ascending Order Sorted Correctly");
				
				ut.PassedCaptureScreenshotAsBASE64();
				
				System.out.println(ArLst);
			}
			else
			{
				test.log(LogStatus.FAIL, "Ascending Order Sorted Incorrect");
				
				ut.FailedCaptureScreenshotAsBASE64();
				
				System.out.println(ArLst);
			}
//		}
	}
	
	public void Verify_DescendingSortingforModifiers() throws Exception
	{
		
		
		ArrayList<String> ArLst=new ArrayList<String>();
//		if(driver.findElement(By.xpath("//span[contains(.,'Name')]/../div[contains(@class,'mode-desc')]")).isDisplayed())
//		{
		Thread.sleep(1000);

			List<WebElement> NameLst=driver.findElements(By.xpath("//tbody/tr/td[1]"));
			
			for(WebElement ele:NameLst)
			{
				ArLst.add(ele.getText());
			}
			
//			ArrayList<String> sortedLst=new ArrayList<String>();
//			
//			for(String st:ArLst)
//			{
//				sortedLst.add(st);
//			}
			Thread.sleep(1000);

			Collections.sort(ArLst);
			Thread.sleep(1000);

			Collections.reverse(ArLst);
			Thread.sleep(2000);
			
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.elementToBeClickable(SortBy_Btn)).click();

//			SortBy_Btn.click();
			Thread.sleep(1000);

			ZtoA_Sort.click();
			Thread.sleep(1000);

			ArrayList<String> AfterArLst=new ArrayList<String>();
			
			List<WebElement> NameAfterSort=driver.findElements(By.xpath("//tbody/tr/td[1]"));
			Thread.sleep(1000);
	
						for(WebElement ele:NameAfterSort)
						{ 
							AfterArLst.add(ele.getText());
						}
						
//						ArrayList<String> sortedLstAft=new ArrayList<String>();
//						
//						for(String st:AfterArLst)
//						{
//							sortedLstAft.add(st);
//						}
//						
						
			if(ArLst.equals(AfterArLst))
			{
				test.log(LogStatus.PASS, "Desending Order Sorted Correctly");
				
				ut.PassedCaptureScreenshotAsBASE64();
				
				System.out.println(ArLst);
			}
			else
			{
				test.log(LogStatus.FAIL, "Desending Order Sorted Incorrect");
				
				ut.FailedCaptureScreenshotAsBASE64();
				
				System.out.println(ArLst);
			}
//		}
	}
	
	public void Verify_CustomSortforModifiers() throws Exception
	{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(SortBy_Btn)).click();
//		SortBy_Btn.click();
		Thread.sleep(1000);

		Custom_Sort.click();
		Thread.sleep(3000);

//		WebElement First=driver.findElement(By.xpath(""));
//		WebElement Second=driver.findElement(By.xpath(""));
		try{
		Actions ac=new Actions(driver);
		ac.dragAndDrop(FirstModifier, SecondModifier).build().perform();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void Select_Modifiers() throws Exception
	{
	Common_XPaths cmp=new Common_XPaths();
//		for(int i=1;i<=6;i++)
//		{
//		Modifiers_SearchInputBox.click();
//	
//        List<WebElement> CategoryList=driver.findElements(By.xpath("//div/select-option"));
//		
//		int CategorySize=CategoryList.size();
//		
//		System.out.println(CategorySize);
//		
//		
//         int randomDept=ThreadLocalRandom.current().nextInt(1, CategorySize);
//		
//		String opt=driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).getText();
//		
//		Modifiers_SearchInputBox.sendKeys(opt);
//		
//		
//		
//		
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//select-option//div[.=' "+opt+" '][@class='row']")).click();
//		Thread.sleep(3000);
//		List<WebElement> departList1=driver.findElements(By.xpath("//div/select-option"));
//
//		if(departList1.size()!=0)
//		{
//			Modifiers_SearchInputBox.click();
//		}
//
//		}
//		
//	
//	for(int i=1;i<=3;i++)
//	{
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/div/data-grid-row/div/div[3]")).click();
//		
//		Thread.sleep(1000);
//		cmp.Click_DeleteButton();
//	}
	
	Modifiers_SearchInputBox.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//div[3]/select-option")).click();
	Thread.sleep(500);
	Modifiers_SearchInputBox.click();
	
	
	}
	
	public void Enter_SetPriceHere(String str) throws Exception
	{
		ModifiersPage mp=new ModifiersPage();
		Common_XPaths cmp=new Common_XPaths();
		
		mp.Enable_SetPriceHere();
		
		for(int i=1;i<=3;i++)
		{
			Add_PriceBtn.click();
		}
		
List<WebElement> servingSizeList=driver.findElements(By.xpath("//app-selectbox/div[contains(@class,'selectbox-component')][@class='selectbox-component size-stretch']/mat-form-field//input"));
		
		
		
		for(int i=2;i<=servingSizeList.size()+1;i++)
		{
			driver.findElement(By.xpath("//div[@id='editable-data-grid']/div["+i+"]/div/app-selectbox/div[contains(@class,'selectbox-component')][@class='selectbox-component size-stretch']//input")).click();
			
			List<WebElement> OpSizeList=driver.findElements(By.xpath("//div/option-panel/div/div/cdk-virtual-scroll-viewport/div/div"));
			
			int OpSizeSize=OpSizeList.size();
			
			if(OpSizeSize>1&&OpSizeSize<=6)
			{
			int randomOpSize=ThreadLocalRandom.current().nextInt(1, OpSizeSize);
			
			Thread.sleep(1000);
		
			driver.findElement(By.xpath("//div/option-panel/div/div/cdk-virtual-scroll-viewport/div/div["+randomOpSize+"]")).click();
			}
			else if(OpSizeSize>6)
			{
			
				int randomOpSize=ThreadLocalRandom.current().nextInt(1, 6);

				driver.findElement(By.xpath("//div/option-panel/div/div/cdk-virtual-scroll-viewport/div/div["+randomOpSize+"]")).click();
			}
			
			driver.findElement(By.xpath("//div[@id='editable-data-grid']/div["+i+"]/div/app-input/div/div/mat-form-field/div/div/div//input")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='editable-data-grid']/div["+i+"]/div/app-input/div/div/mat-form-field/div/div/div//input")).sendKeys(str);
			Thread.sleep(1000);
			
		
		}
//		driver.findElement(By.xpath("//div[@id='editable-data-grid']/div[2]/div/app-input/div/div/mat-form-field/div/div/div//input")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='editable-data-grid']/div[2]/div/app-input/div/div/mat-form-field/div/div/div//input")).sendKeys(str);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='editable-data-grid']/div[3]/div/app-input/div/div/mat-form-field/div/div/div//input")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='editable-data-grid']/div[3]/div/app-input/div/div/mat-form-field/div/div/div//input")).sendKeys(str);
//		driver.findElement(By.xpath("//div[@id='editable-data-grid']/div[4]/div/app-input/div/div/mat-form-field/div/div/div//input")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='editable-data-grid']/div[4]/div/app-input/div/div/mat-form-field/div/div/div//input")).sendKeys(str);
		Thread.sleep(2000);
		
		for(int i=1;i<=2;i++) 
		{
			Thread.sleep(500);
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-input-table/div/div[2]/div[3]")).click();
			
			Thread.sleep(1000);
			cmp.Click_DeleteButton();
		}
	}
	 
	public WebElement Inventory_MenuItemHeader()
	{
		return Inventory_MenuItemHeader;
	}
	
	public void Enable_SetPrice()
	{
		
		mp.Enable_SetPriceHere();
		
	}
	
	public void Delete_Modifiers() throws Exception 
	{
		Common_XPaths cmp=new Common_XPaths();
		
		List<WebElement> Modifiers = driver.findElements(By.xpath("//tbody/tr/td/div"));
		for(int i=Modifiers.size();i<=1;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//tbody/tr["+i+"]/td[3]/div")).click();

			Thread.sleep(1000);
			cmp.Click_DeleteButton();
		}
	}
	
	@FindBy(xpath = "//input[@aria-label='Serving Size']")
    WebElement Serving_SizeInputBox;
	
	public void Select_ServingSize() throws Exception 
	{
		Serving_SizeInputBox.click();
		
//		List<WebElement> servingSizeList=driver.findElements(By.xpath("//app-selectbox/div[contains(@class,'selectbox-component')][@class='selectbox-component size-normal']/mat-form-field//input"));
//
//
//
//		for(int i=2;i<=servingSizeList.size()+1;i++)
//		{
//			driver.findElement(By.xpath("//div[@id='editable-data-grid']/div["+i+"]/div/app-selectbox/div[contains(@class,'selectbox-component')][@class='selectbox-component size-normal']//input")).click();

			List<WebElement> OpSizeList=driver.findElements(By.xpath("//div/option-panel/div/div/cdk-virtual-scroll-viewport/div/div"));

			int OpSizeSize=OpSizeList.size();

			if(OpSizeSize>1&&OpSizeSize<=6)
			{
				int randomOpSize=ThreadLocalRandom.current().nextInt(1, OpSizeSize);

				Thread.sleep(1000);

				driver.findElement(By.xpath("//div/option-panel/div/div/cdk-virtual-scroll-viewport/div/div["+randomOpSize+"]")).click();
			}
			else if(OpSizeSize>6)
			{

				int randomOpSize=ThreadLocalRandom.current().nextInt(1, 6);

				driver.findElement(By.xpath("//div/option-panel/div/div/cdk-virtual-scroll-viewport/div/div["+randomOpSize+"]")).click();
			}
		}
	

	
	public void Enter_Price(String str) throws Exception 
	{
		driver.findElement(By.xpath("//app-input[@name='priceStr']/div/div/mat-form-field/div/div/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-input[@name='priceStr']/div/div/mat-form-field/div/div/div/input")).sendKeys(str);
		Thread.sleep(1000);
	}
	
	public void Delete_ServingSizeLevel() throws Exception 
	{
		Common_XPaths cmp=new Common_XPaths();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-input-table/div/div[2]/div[3]")).click();

		Thread.sleep(1000);
		cmp.Click_DeleteButton();
	}

	
	public void Enable_HideInOnlineOrder() 
	{
		HideInOnline_Order.click();
	}
	
	public void Click_AddPrice_Button() 
	{
		Add_ServingSizeBtn.click();
	}
	
	public void Select_SortBy_OptionAs_A_to_Z() throws Exception 
	{
		SortBy_InputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div//select-option[1]")).click();
	}
	
	public void Select_SortBy_OptionAs_Z_to_A() throws Exception 
	{
		SortBy_InputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div//select-option[2]")).click();
	}
	
	public void Select_SortBy_OptionAs_Custom() throws Exception 
	{
		SortBy_InputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div//select-option[3]")).click();
	}
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement Modifier_One;
	
	@FindBy(xpath = "//tbody/tr[2]/td[1]")
	WebElement Modifier_Two;
	
	public void Custom_Sorting() 
	{
		Actions ac=new Actions(driver);
		ac.dragAndDrop(Modifier_One, Modifier_Two).build().perform();
	}
	
	
	public void Select_MultipleModifiersAboveTen() throws Exception 
	{
//		Common_XPaths cmp=new Common_XPaths();
//		for(int i=1;i<=15;i++)
//		{
//			Modifiers_SearchInputBox.click();
//
//			List<WebElement> CategoryList=driver.findElements(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div"));
//
//			int CategorySize=CategoryList.size();
//
//			System.out.println(CategorySize);
//
//
//			int randomDept=ThreadLocalRandom.current().nextInt(1, CategorySize);
//			
//			driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).click();

//			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randomDept+"]")).click();

//			Modifiers_SearchInputBox.sendKeys(opt);





//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[1]/Select-option")).click();
//			Thread.sleep(3000);
//			List<WebElement> departList1=driver.findElements(By.xpath("//div/select-option"));
//
//			if(departList1.size()!=0)
//			{
//				Modifiers_SearchInputBox.click();
//			}
//		}
		
		Modifiers_SearchInputBox.click();
		
		for(int i=1;i<=15;i++)
		{
		
		driver.findElement(By.xpath("//div["+i+"]/select-option")).click();
		}
		
		Modifiers_SearchInputBox.click();

	}
	
	public void Delete_OneModifier() throws Exception 
	{
		Common_XPaths cmp = new Common_XPaths();
		for(int i=1;i<=1;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//tbody/tr["+i+"]/td[3]/div")).click();

			Thread.sleep(1000);
			cmp.Click_DeleteButton();
		}
	}
}
