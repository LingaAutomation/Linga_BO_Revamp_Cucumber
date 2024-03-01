package com.Pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class ProductItems_Menu_RetailPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Common_XPaths cmp=new Common_XPaths();
	TaxesPage tx=new TaxesPage();
	Utility ut=new Utility();
	
//	public ProductItems_Menu_RetailPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW RETAIL ITEM')]")
	public WebElement New_Retail_ItemBtn;
	
	@FindBy(xpath = "//button[contains(.,'NEW MENU ITEM')]")
	public WebElement New_Menu_ItemBtn;
	
	@FindBy(xpath = "//label[contains(.,'Secondary Name')]/../../input")
	public WebElement Secondary_NameInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Item Preparation Time')]/../../input")
	public WebElement Item_Preparation_TimeInputBx;
	
	@FindBy(xpath = "//label[contains(.,'PLU Code')]/../../input")
	public WebElement PLU_CodeInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Kitchen Printer Name')]/../../input")
	public WebElement Kitchen_Printer_NameInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Description')]/../../textarea")
	public WebElement Description_TextBx;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Category']")
	public WebElement Category_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Sub Category']")
	public WebElement SubCategory_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Menu Item']")
	public WebElement MenuItem_MenuType_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Menu Item With Serving Size']")
	public WebElement MenuItem_With_ServingSize_MenuType_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Open Item']")
	public WebElement OpenItem_MenuType_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Scale Item']")
	public WebElement ScaleItem_MenuType_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Combo Item']")
	public WebElement ComboItem_MenuType_RadioBtn;
	
	@FindBy(xpath = "//input[@placeholder='Select Category']")
	public WebElement Category_InputBx;
	
	@FindBy(xpath = "//input[@placeholder='Select Sub Category']")
	public WebElement SubCategory_InputBx;
	
	@FindBy(xpath = "//mat-label[.=' Category ']/../../../input")
	public WebElement Category_RetailInventoryInputBx;
	
	@FindBy(xpath = "//mat-label[.=' Sub Category ']/../../../input")
	public WebElement SubCategory_RetailInventoryInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Evertec Tax Type')]/../../input")
	public WebElement Evertec_Tax_TypeInputBx;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Conversational UI at POS')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Conversational_UI_atPOS_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Conversational UI at POS')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Conversational_UI_atPOS_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Cut And Modify')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Cut_And_Modify_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Cut And Modify')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Cut_And_Modify_NoBtn;
	
	@FindBy(xpath = "//mat-button-toggle[contains(.,'FIXED')]")
	public WebElement Fixed_Cost_TypeRadioBtn;
	
	@FindBy(xpath = "//mat-button-toggle[contains(.,'VARIABLE')]")
	public WebElement Variable_Cost_TypeRadioBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Price Level Settings')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Price_Level_Settings_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Price Level Settings')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Price_Level_Settings_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In Kiosk')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Hide_In_Kiosk_YesBtn;
	
	public WebElement Hide_In_Kiosk_Yes()
	{
		return Hide_In_Kiosk_YesBtn;
	}
	
		
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In Kiosk')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Hide_In_Kiosk_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'EBT Menu Item')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement EBT_Menu_Item_YesBtn;
		

	public WebElement EBT_Menu_Item_Yes()
	{
		return EBT_Menu_Item_YesBtn;
	}
	
	@FindBy(xpath = "//app-toggle[contains(.,'EBT Menu Item')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement EBT_Menu_Item_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In POS')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Hide_In_POS_YesBtn;
	
	public WebElement Hide_In_POS_Yes()
	{
		return Hide_In_POS_YesBtn;
	}
	
		
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In POS')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Hide_In_POS_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In Online Order')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Hide_In_Online_Order_YesBtn;
	
	public WebElement Hide_In_Online_Order_Yes()
	{
		return Hide_In_Online_Order_YesBtn;
	}
	
		
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In Online Order')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Hide_In_Online_Order_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'86 List')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Eighty_Six_List_YesBtn;
	
	
	
	
	public WebElement Eighty_Six_List_Yes()
	{
		return Eighty_Six_List_YesBtn;
	}
		
	@FindBy(xpath = "//app-toggle[contains(.,'86 List')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Eighty_Six_List_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide Menu Item Picture In POS')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Hide_MenuItem_Picture_inPOS_YesBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide Menu Item Picture In POS')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Hide_MenuItem_Picture_inPOS_NoBtn;
	
	
	@FindBy(xpath = "//app-toggle[contains(.,'Meito MenuItem')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Meito_MenuItem_YesBtn;
	
	public WebElement Meito_MenuItem_Yes()
	{
		return Meito_MenuItem_YesBtn;
	}
		
	@FindBy(xpath = "//app-toggle[contains(.,'Meito MenuItem')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Meito_MenuItem_NoBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add Included Modifiers')]")
	public WebElement Add_Included_ModifiersBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add Mandatory Modifier Group')]")
	public WebElement Add_Mandatory_Modifier_GroupBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add Optional Modifier Group')]")
	WebElement Add_Optional_Modifier_GroupBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Jump With Minimum Quantity')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Jump_With_Minimum_Quantity_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Jump With Minimum Quantity')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Jump_With_Minimum_Quantity_NoBtn;
	
	@FindBy(xpath = "//h3[contains(.,'Mandatory Modifier Groups')]/../../..//span[contains(.,'Set Tiered Price')]/../../div[2]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Set_Tiered_Price_MandatoryModifier_YesBtn;
		
	@FindBy(xpath = "//h3[contains(.,'Mandatory Modifier Groups')]/../../..//span[contains(.,'Set Tiered Price')]/../../div[2]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Set_Tiered_Price_MandatoryModifier_NoBtn;
	
	@FindBy(xpath = "//h3[contains(.,'Optional Modifier Groups')]/../../..//span[contains(.,'Set Tiered Price')]/../../div[2]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Set_Tiered_Price_OptionalModifier_YesBtn;
		
	@FindBy(xpath = "//h3[contains(.,'Optional Modifier Groups')]/../../..//span[contains(.,'Set Tiered Price')]/../../div[2]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Set_Tiered_Price_OptionalModifier_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Alternate Modifier Group')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Alternate_Modifier_Group_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Alternate Modifier Group')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Alternate_Modifier_Group_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Override prefix upcharges')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Override_Prefix_Upcharges_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Override prefix upcharges')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Override_Prefix_Upcharges_NoBtn;
	
	public void Click_New_MenuItem() throws Exception
	{
		Thread.sleep(5000);
//		cmp.Click_Wait_ForElementClickable(New_Menu_ItemBtn, 40);
		New_Menu_ItemBtn.click();
	}
	
	public void Click_New_RetailItem() throws Exception
	{
		Thread.sleep(3000);
//		wait.until(null)
//		New_Retail_ItemBtn.click();
		cmp.Click_Wait_ForElementClickable(New_Retail_ItemBtn, 40);
	}
	
	public void Enter_Secondary_Name(String str) throws Exception
	{
		Thread.sleep(1000);
		Secondary_NameInputBx.clear();
		Thread.sleep(1000);
		Secondary_NameInputBx.sendKeys(str);
	}
	
	public void Enter_PLU_Code(String str) throws Exception
	{
		Thread.sleep(1000);
		PLU_CodeInputBx.clear();
		Thread.sleep(1000);
		PLU_CodeInputBx.sendKeys(str);
	}
	
	public void Enter_Item_Preparation_Time(String str) throws Exception
	{
		Thread.sleep(1000);
		Item_Preparation_TimeInputBx.clear();
		Thread.sleep(1000);
		Item_Preparation_TimeInputBx.sendKeys(str);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-input[@name='preparationTime']/div/div//button[2]")).click();
	}
	
	public void Enter_Kitchen_Printer_Name(String str) throws Exception
	{
		Thread.sleep(1000);
		Kitchen_Printer_NameInputBx.clear();
		Thread.sleep(1000);
		Kitchen_Printer_NameInputBx.sendKeys(str);
	}
	
	public void Enter_Description(String str) throws Exception
	{
		Thread.sleep(1000);
		Description_TextBx.clear();
		Thread.sleep(1000);
		Description_TextBx.sendKeys(str);
	}
	
	public void Click_Category_LevelType()
	{
		Category_RadioBtn.click();
	}
	
	public WebElement Category_LevelType()
	{
		return Category_RadioBtn;
	}
	
	public void Click_SubCategory_LevelType()
	{
		SubCategory_RadioBtn.click();
	}
	
	public WebElement SubCategory_LevelType()
	{
		return SubCategory_RadioBtn;
	}
	
	public void Select_Category_LevelType() throws Exception
	{
//		Category_RadioBtn.click();
		
		Thread.sleep(1000);
		cmp=new Common_XPaths();
		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(Category_InputBx);
		
		cmp.Click_Wait_ForElementClickable(Category_InputBx, 60);
		Thread.sleep(1000);
//		Category_InputBx.click();
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(Category_InputBx)).click();
//		CoursingDropBtn.click();
		
		Category_InputBx .click();
		
		Thread.sleep(1000);
		List<WebElement> CategoryList=driver.findElements(By.xpath("//div/select-option"));
		
		int CategorySize=CategoryList.size();
		
		if(CategorySize<=6)
		{
		
		int randomCategory=ThreadLocalRandom.current().nextInt(2, CategorySize);
		
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
		
		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomCategory+"]/select-option")).getText());
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
		}
		else
		{
			int randomCategory=ThreadLocalRandom.current().nextInt(1, 6);
			
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
			
			cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomCategory+"]/select-option")).getText());
			
			driver.findElement(By.xpath("//div[1]/select-option")).click();
		
		}	
		
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		
		
		if(menuList1.size()!=0)
		{
			SubCategory_InputBx.click();
		}
	}
	

	public void Select_SubCategory_LevelType() throws Exception
	{
		cmp=new Common_XPaths();
		
		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(SubCategory_InputBx);
		Thread.sleep(1000);
//		SubCategory_RadioBtn.click();
//		cmp.Click_Wait_ForElementClickable(SubCategory_InputBx, 60);
//		SubCategory_InputBx.click();
	
	
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(SubCategory_InputBx)).click();
//		CoursingDropBtn.click();
		
//		SubCategory_InputBx.click();
		
		Thread.sleep(1000);
	
		try
		{
			Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
		}
		
		catch(Exception k)
		{
			if(driver.findElement(By.xpath("//select-option[contains(.,'No results match')]")).isDisplayed())
			{
				Category_RadioBtn.click();
		test.log(LogStatus.INFO, "Sub Categories not available for Selected Categories");
			Select_Category_LevelType();
			}
		}
		
		//		List<WebElement> SubCategoryList=driver.findElements(By.xpath("//div/select-option"));
		
		
//		
//		int SubCategorySize=SubCategoryList.size();
//		
//		if(SubCategorySize<=6)
//		{
//		
//		int randomSubCategory=ThreadLocalRandom.current().nextInt(1, SubCategorySize);
//		
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
//		
//		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomSubCategory+"]/select-option")).getText());
//		
//		driver.findElement(By.xpath("//div[1]/select-option")).click();
//		}
//		else
//		{
//			int randomSubCategory=ThreadLocalRandom.current().nextInt(1, 6);
//			
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
//			
//			cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomSubCategory+"]/select-option")).getText());
//			
//			driver.findElement(By.xpath("//div[1]/select-option")).click();
//		
//		}
//			else if(menuSize==1)
//			{
//				try
//				{
//				if(driver.findElement(By.xpath("//select-option[contains(.,'No results match')]")).isDisplayed())
//				{
//					
//					test.log(LogStatus.INFO, "Sub Categories not available for Selected Category");
//					
//					driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//					driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//
//					Click_Category_LevelType();
//					Thread.sleep(1000);
//					Select_Category_LevelType();
//					
//				}
//				}
//				catch(Exception e)
//				{
//					driver.findElement(By.xpath("//select-option[1]")).click();
//				}
//			}
//			else if(menuSize>=1 && menuSize<=6)
//			{
//				int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
//		
//		
//				driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomMenu+"]")).click();
//			}
//			else
//			{
//				int randomMenu=ThreadLocalRandom.current().nextInt(1, 6);
//			
//			
//				driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomMenu+"]")).click();
//			
//			}
		
			List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));

			if(menuList1.size()!=0)
			{
				SubCategory_InputBx.click();
			}
		
	}
	
	public void Select_Category_RetailInventoryLevelType() throws Exception
	{
//		Category_RadioBtn.click();
		
		Thread.sleep(1000);
		cmp=new Common_XPaths();
		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(Category_InputBx);
		
		cmp.Click_Wait_ForElementClickable(Category_RetailInventoryInputBx, 60);
		Thread.sleep(1000);
//		Category_InputBx.click();
		
		Thread.sleep(1000);
	List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
		
		
		int menuSize=menuList.size();
		
		if(menuSize==0)
		{
			Category_RetailInventoryInputBx.click();
			Thread.sleep(10000);

		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
			
			
			int menuSize1=menuList1.size();
			
			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize1);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']']//div/div["+randomMenu+"]/select-option")).click();
			
			
		}
		else if(menuSize<=6)
		{
		
		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
		}
		else
		{
			int randomMenu=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
		
		}
		
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));

		
		if(menuList1.size()!=0)
		{
			Category_RetailInventoryInputBx.click();
		}
	}
	

	public void Select_SubCategory_RetailInventoryLevelType() throws Exception
	{
		cmp=new Common_XPaths();
		
		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(SubCategory_InputBx);
		Thread.sleep(1000);
//		SubCategory_RadioBtn.click();
		cmp.Click_Wait_ForElementClickable(SubCategory_RetailInventoryInputBx, 60);
//		SubCategory_InputBx.click();
	
	
		Thread.sleep(1000);
		List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
		
			int menuSize=menuList.size();
		
			if(menuSize==0)
			{
				SubCategory_RetailInventoryInputBx.click();
			
			Thread.sleep(1000);
			List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
			
			int menuSize1=menuList1.size();
		
			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize1);
		
		
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
		
			}
			else if(menuSize==1)
			{
				try
				{
				if(driver.findElement(By.xpath("//select-option[contains(.,'No results match')]")).isDisplayed())
				{
					
					test.log(LogStatus.INFO, "Sub Categories not available for Selected Category");
					
					driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
					driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);

					Click_Category_LevelType();
					Thread.sleep(1000);
					Select_Category_RetailInventoryLevelType();
					
				}
				}
				catch(Exception e)
				{
					driver.findElement(By.xpath("//select-option[1]")).click();
				}
			}
			else if(menuSize>=1 && menuSize<=6)
			{
				int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
		
		
				driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
			}
			else
			{
				int randomMenu=ThreadLocalRandom.current().nextInt(1, 6);
			
			
				driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
			
			}
		
			List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));

			if(menuList1.size()!=0)
			{
				SubCategory_RetailInventoryInputBx.click();
			}
		
	}

	
	public void Select_Evertec_TaxType() throws Exception
	{
		try
		{
			if(Evertec_Tax_TypeInputBx.isDisplayed())
			{
				test.log(LogStatus.INFO, "Evertec Tax Type is Available in this Store");
				
				ut.PassedCaptureScreenshotAsBASE64();
				
				Evertec_Tax_TypeInputBx.click();
				
				Thread.sleep(1000);
			List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
				
				int menuSize=menuList.size();
				
				
				int randomMenu=ThreadLocalRandom.current().nextInt(2, menuSize);
				
				
				driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
				
			}
		}
		catch(Exception h)
		{
			test.log(LogStatus.INFO, "Evertec Tax Type is Not Available in this Store");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}
	
	public void Click_Menu_Item_MenuType()
	{
		MenuItem_MenuType_RadioBtn.click();
	}
	
	public WebElement MenuItem_MenuType()
	{
		return MenuItem_MenuType_RadioBtn;
	}
	
	public void Click_MenuItem_With_ServingSize_MenuType()
	{
		MenuItem_With_ServingSize_MenuType_RadioBtn.click();
	}
	
	public WebElement MenuItem_With_ServingSize_MenuType()
	{
		return MenuItem_With_ServingSize_MenuType_RadioBtn;
	}
	
	public void Click_OpenItem_MenuType()
	{
		OpenItem_MenuType_RadioBtn.click();
	}
	
	public WebElement OpenItem_MenuType()
	{
		return OpenItem_MenuType_RadioBtn;
	}
	
	public void Click_ScaleItem_MenuType()
	{
		ScaleItem_MenuType_RadioBtn.click();
	}
	
	public WebElement ScaleItem_MenuType()
	{
		return ScaleItem_MenuType_RadioBtn;
	}
	
	public void Click_ComboItem_MenuType()
	{
		ComboItem_MenuType_RadioBtn.click();
	}
	
	public WebElement ComboItem_MenuType()
	{
		return ComboItem_MenuType_RadioBtn;
	}
	
	public void Click_Fixed_CostType()
	{
		Fixed_Cost_TypeRadioBtn.click();
	}
	
	public WebElement Fixed_CostType()
	{
		return Fixed_Cost_TypeRadioBtn;
	}
	
	public void Click_Variable_CostType()
	{
		Variable_Cost_TypeRadioBtn.click();
	}
	
	public WebElement Variable_CostType()
	{
		return Variable_Cost_TypeRadioBtn;
	}
	
	public void Select_Serving_Size_For_Fixed_CostType() throws Exception
	{
		Fixed_Cost_TypeRadioBtn.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input")).click();

		Thread.sleep(1000);
	List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
		
		int menuSize=menuList.size();
	
		if(menuSize==0)
		{
		
			driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input")).click();

			Thread.sleep(1000);
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
			
			int menuSize1=menuList1.size();
		
		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize1);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
		}
		else if(menuSize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();

		}
		else
		{
			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
			
		}
		
		
	
	//Enter the cost
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys("5000");
		
		
		//Enter the Price
		driver.findElement(By.xpath("//form[@id='pricingCostForm']//input[@aria-label='Price']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='pricingCostForm']//input[@aria-label='Price']")).sendKeys("20000");
		
		
		
	
	}
	
	@FindBy(xpath = "//input[@aria-label='Taxes']")
	WebElement Taxes_InputBx;
	
	public void Select_Taxes_inDropDown() throws Exception
	{
//		cmp.Click_DropDown(Taxes_InputBx, "Taxes Selected");
		
		
		Thread.sleep(1000);
		wait=new WebDriverWait(driver, Duration.ofSeconds(120));
	
//		ItemServiceChargeDropBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(Taxes_InputBx)).click();
		
		Thread.sleep(1000);
		
		List<WebElement> taxesList=driver.findElements(By.xpath("//div/select-option"));
		
		int taxesSize=taxesList.size();
		
		if(taxesSize<=6)
		{
		int randomtaxes=ThreadLocalRandom.current().nextInt(1, taxesSize);
		
		
		driver.findElement(By.xpath("//div["+randomtaxes+"]/select-option")).click();
		}
		else
		{
			int randomtaxes=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div["+randomtaxes+"]/select-option")).click();
		
		}
		
		
		List<WebElement> taxesList1=driver.findElements(By.xpath("//div/select-option"));

		if(taxesList1.size()!=0)
		{
			Thread.sleep(1000);
			Taxes_InputBx.click();
		}
	}
	
	@FindBy(xpath = "//div[contains(@class,'error-text')][contains(.,'Serving Size Already Exists')]")
	public WebElement Serving_Size_Already_Exists_ErrorMsg;
	
	@FindBy(xpath = "//div[contains(@class,'error-text')][contains(.,'Menu Already Exists')]")
	public WebElement Menu_Already_Exists_ErrorMsg;
	
	@FindBy(xpath = "//div[contains(@class,'error-text')][contains(.,'Seq.No Already Exists')]")
	public WebElement SeqNo_Already_Exists_ErrorMsg;
	
	
	
	
	public void Select_Serving_MenuItem_With_ServingSize_Fixed_CostType() throws Exception
	{
		Fixed_Cost_TypeRadioBtn.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input")).click();

//		Thread.sleep(1000);
//	List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
//		
//		int menuSize=menuList.size();
//		
//		
//		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
		
		
//		driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[2]//input")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[2]//input")).sendKeys("6");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[3]//input")).clear();
	driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[3]//input")).sendKeys("P"+Utility.getProperty("ProductsItems_PLU_Code"));
	
	//Enter the cost
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[4]//input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[4]//input")).sendKeys("5000");
		
		
		//Enter the Price
		driver.findElement(By.xpath("//form[@id='pricingCostForm']//input[@aria-label='Price']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='pricingCostForm']//input[@aria-label='Price']")).sendKeys("2000");
		
		
		
	
	}
	
	public void Select_Serving_MenuItem_With_ServingSize_Fixed_CostType_Second() throws Exception
	{
		Fixed_Cost_TypeRadioBtn.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input)[2]")).click();

//		Thread.sleep(1000);
//	List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
//		
//		int menuSize=menuList.size();
//		
//		
//		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
		
		
//		driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[2]//input)[2]")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[2]//input)[2]")).sendKeys("6");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[3]//input)[2]")).clear();
	driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[3]//input)[2]")).sendKeys("PLU0008");
	
	//Enter the cost
		driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[4]//input)[2]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[4]//input)[2]")).sendKeys("5000");
		
		
		//Enter the Price
		driver.findElement(By.xpath("(//form[@id='pricingCostForm']//input[@aria-label='Price'])[2]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//form[@id='pricingCostForm']//input[@aria-label='Price'])[2]")).sendKeys("2500");
		
		
		
	
	}
	
	public void Select_Fixed_Cost_Type()
	{
		Fixed_Cost_TypeRadioBtn.click();
	}
	
	public void Select_Variable_Cost_Type()
	{
		Variable_Cost_TypeRadioBtn.click();
	}
	
	@FindBy(xpath = "//button[contains(.,'Edit')]")
	WebElement Edit_OptionBtn;
	
	@FindBy(xpath = "//button[contains(.,'Edit')]")
	WebElement Copy_OptionBtn;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	WebElement Delete_OptionBtn;
	
	public void SearchAndClickEdit_MenuItemPage(String SearchValue) throws Exception
	{
		
		cmp.Wait_ForElementVisibility(SearchBox, 180);
	
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		
		Thread.sleep(2000);
		try
		{
//			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")), 50);
//		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")).click();
//		
			cmp.Wait_ForElementVisibility(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")), 50);
			driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")).click();
			
			
		}
		catch(Exception g)
		{
			
//			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")), 40);
//			driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")).click();
//			
			cmp.Wait_ForElementVisibility(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")), 40);
			driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")).click();
		
		}
		Thread.sleep(1000);
		Edit_OptionBtn.click();
		
	}
	
	public void SearchAndClickDelete_MenuItemPage(String SearchValue) throws Exception
	{
		
		cmp.Wait_ForElementVisibility(SearchBox, 180);
	
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		
		Thread.sleep(2000);
		try
		{
//			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")), 50);
//		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")).click();
//		
			cmp.Wait_ForElementVisibility(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")), 50);
			driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")).click();
			
			
		}
		catch(Exception g)
		{
			
//			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")), 40);
//			driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")).click();
//			
			cmp.Wait_ForElementVisibility(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")), 40);
			driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")).click();
		
		}
		Thread.sleep(1000);
		Delete_OptionBtn.click();
		
	}
	
	public void SearchAndClickCopy_MenuItemPage(String SearchValue) throws Exception
	{
		
		cmp.Wait_ForElementVisibility(SearchBox, 180);
	
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		
		Thread.sleep(2000);
		try
		{
//			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")), 50);
//		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")).click();
//		
			cmp.Wait_ForElementVisibility(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")), 50);
			driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")).click();
			
			
		}
		catch(Exception g)
		{
			
//			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")), 40);
//			driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")).click();
//			
			cmp.Wait_ForElementVisibility(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")), 40);
			driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")).click();
		
		}
		Thread.sleep(1000);
		Copy_OptionBtn.click();
		
	}
	
	
	public void Select_Serving_Size_For_Variable_CostType() throws Exception
	{
		Thread.sleep(1000);
		cmp.Pricing_Cost_Tab_inContents.click();
		
		for(int i=1;i<=6;i++)
		{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);
		Variable_Cost_TypeRadioBtn.click();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input")).click();

		Thread.sleep(2000);
	List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
		
	if(menuList.size()>1)
	{
		int menuSize=menuList.size();
		
		
		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
	
	}
	else
	{
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
	}
	
	//Enter the cost
		driver.findElement(By.xpath("//form[@id='pricingCostForm']//input[@aria-label='Price']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='pricingCostForm']//input[@aria-label='Price']")).sendKeys("15000");
		
	}
	
	@FindBy(xpath = "//input[@aria-label='Price']")
	public WebElement Price_InputBx;
	
	public void Select_Serving_Size_MenuItem_With_ServingSize_Variable_CostType() throws Exception
	{
		Thread.sleep(1000);
		cmp.Pricing_Cost_Tab_inContents.click();
		
		for(int i=1;i<=6;i++)
		{
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		Variable_Cost_TypeRadioBtn.click();
		Thread.sleep(1000);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input")).click();

		Thread.sleep(1000);
	List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
		
	if(menuList.size()>1)
	{
		int menuSize=menuList.size();
		
		
		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
		
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
	
	}
	else
	{
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
	}
	//Enter the S No
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[2]//input")).clear();
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[2]//input")).sendKeys("2");
		
		
		//Enter the PLU Code
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[3]//input")).clear();
		driver.findElement(By.xpath("//form[@id='pricingCostForm']/div/div/div/div[3]//input")).sendKeys("PLU01");
		
	
	//Enter the cost
		driver.findElement(By.xpath("//form[@id='pricingCostForm']//input[@aria-label='Price']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='pricingCostForm']//input[@aria-label='Price']")).sendKeys("15000");
		
	}
	
	
	@FindBy(xpath = "//button[contains(.,'Add Price Level')]")
	WebElement Add_Price_LevelBtn;
	
	
	public void Click_Add_Price_Level()
	{
		Add_Price_LevelBtn.click();
	}
	
	public void Enter_Add_Price_Level(String str) throws Exception
	{
		Thread.sleep(1000);
		Enable_Price_Level_Settings();
		
		Thread.sleep(1000);
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(1000);
		Add_Price_LevelBtn.click();
		}
		
		Thread.sleep(1000);
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(1000);

			driver.findElement(By.xpath("//form[@id='pricingCostForm']//div[contains(@class,'price-level-data')]["+i+"]/div[2]/div/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//form[@id='pricingCostForm']//div[contains(@class,'price-level-data')]["+i+"]/div[2]/div/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(str);
		}
		
		for(int i=3;i<=4;i++)
		{
			Thread.sleep(1000);

			driver.findElement(By.xpath("//form[@id='pricingCostForm']//div[contains(@class,'price-level-data')]["+i+"]/div[2]/div/div[3]/button")).click();
		}
	}
	
	@FindBy(xpath = "//button[contains(.,'Add Menu Item')]")
	WebElement Add_Menu_ItemBtn;
	
	public void Click_Add_Menu_Item() throws Exception
	{
		Thread.sleep(2000);
		Add_Menu_ItemBtn.click();
		
	}
	
	public void Enter_Combo_Item(String st1, String st2) throws Exception
	{
		Thread.sleep(1000);
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(1000);
			Add_Menu_ItemBtn.click();
		}
		
		
		
		Thread.sleep(1000);
		for(int i=1;i<=4;i++)
		{
			driver.findElement(By.xpath("//form[@id='comboForm']//div[contains(@class,'combo-config-data')]["+i+"]/div[1]/app-selectbox/div/mat-form-field/div/div/div[3]/input")).click();
			
			Thread.sleep(1000);
			List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
				
			if(menuList.size()>1)
			{
				int menuSize=menuList.size();
				
				
				int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
				
				try {
				driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
				}
				
				catch (Exception e) {
					driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
				}
			}
			
			else
			{
				driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
			}
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//form[@id='comboForm']//div[contains(@class,'combo-config-data')]["+i+"]/div[2]/app-selectbox/div/mat-form-field/div/div/div[3]/input")).click();
				
				Thread.sleep(1000);
				List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
					
				if(menuList.size()>1)
				{
					int menuSize=menuList.size();
					
					
					int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
					try {
					
					driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
					}
					catch (Exception e)
					{
						driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
					}
				}
				else
				{
					driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
				}
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//form[@id='comboForm']//div[contains(@class,'combo-config-data')]["+i+"]/div[3]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//form[@id='comboForm']//div[contains(@class,'combo-config-data')]["+i+"]/div[3]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(st1);
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//form[@id='comboForm']//div[contains(@class,'combo-config-data')]["+i+"]/div[4]//app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//form[@id='comboForm']//div[contains(@class,'combo-config-data')]["+i+"]/div[4]//app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(st2);
		}
		
		for(int i=2;i<=4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//form[@id='comboForm']//div[contains(@class,'combo-config-data')]["+i+"]/div[4]/div/div/button")).click();
		}
		
	}
	
	public void Enable_Price_Level_Settings()
	{
		if(Price_Level_Settings_YesBtn.isEnabled()) 
		{
			
		}
		else
		{
			Price_Level_Settings_YesBtn.click();
		}
	}
	
	public void Disable_Price_Level_Settings()
	{
		if(Price_Level_Settings_YesBtn.isEnabled()) 
		{
			Price_Level_Settings_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public WebElement Price_Level_Settings_Yes()
	{
		return Price_Level_Settings_YesBtn;
	}
	
	
	public void Enable_Hide_In_Kiosk()
	{
		if(Hide_In_Kiosk_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Hide_In_Kiosk_YesBtn.click();
		}
	}
	
	public void Disable_Hide_In_Kiosk()
	{
		if(Hide_In_Kiosk_YesBtn.isEnabled()) 
		{
			Hide_In_Kiosk_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	
	public void Enable_Hide_In_POS()
	{
		if(Hide_In_POS_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Hide_In_POS_YesBtn.click();
		}
	}
	
	public void Disable_Hide_In_POS()
	{
		if(Hide_In_POS_YesBtn.isEnabled()) 
		{
			Hide_In_POS_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public void Enable_Eighty_Six_List()
	{
		if(Eighty_Six_List_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Eighty_Six_List_YesBtn.click();
		}
	}
	
	public void Disable_Eighty_Six_List()
	{
		if(Eighty_Six_List_YesBtn.isEnabled()) 
		{
			Eighty_Six_List_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public void Enable_EBT_Menu_Item()
	{
		if(EBT_Menu_Item_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			EBT_Menu_Item_YesBtn.click();
		}
	}
	
	public void Disable_EBT_Menu_Item()
	{
		if(EBT_Menu_Item_YesBtn.isEnabled()) 
		{
			EBT_Menu_Item_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	
	public void Enable_Hide_In_Online_Order()
	{
		try
		{
		if(Hide_In_Online_Order_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Hide_In_Online_Order_YesBtn.click();
		}
		
		}
		catch(Exception l)
		{
			if(driver.findElement(By.xpath("//app-toggle[contains(.,'Hide in Online Order')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")).isSelected())
			{
				
			}
			else
			{
				driver.findElement(By.xpath("//app-toggle[contains(.,'Hide in Online Order')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")).click();
			}
		}
	}
	
	public void Disable_Hide_In_Online_Order()
	{
		try
		{
		if(Hide_In_Online_Order_YesBtn.isEnabled()) 
		{
			Hide_In_Online_Order_NoBtn.click();
		}
		else
		{
		
		}
		}
		catch(Exception l)
		{
			if(driver.findElement(By.xpath("//span[contains(.,'Hide in Online Order')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")).isEnabled())
			{
				driver.findElement(By.xpath("//span[contains(.,'Hide in Online Order')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")).click();
			}
			else
			{
				
			}
		}
	}
	
	public WebElement Hide_In_Online_Order_Yes_Retail()
	{
		return driver.findElement(By.xpath("//span[contains(.,'Hide in Online Order')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]"));
	}
	
	
	public void Enable_Meito_MenuItem()
	{
		if(Meito_MenuItem_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Meito_MenuItem_YesBtn.click();
		}
	}
	
	public void Disable_Meito_MenuItem()
	{
		if(Meito_MenuItem_YesBtn.isEnabled()) 
		{
			Meito_MenuItem_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public void Enable_Conversational_UI_atPOS()
	{
		if(Conversational_UI_atPOS_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Conversational_UI_atPOS_YesBtn.click();
		}
	}
	
	public void Disable_Conversational_UI_atPOS()
	{
		if(Conversational_UI_atPOS_YesBtn.isEnabled()) 
		{
			Conversational_UI_atPOS_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public WebElement Conversational_UI_atPOS_Yes()
	{
		return Conversational_UI_atPOS_YesBtn;
	}
	
	public WebElement Cut_And_Modify_Yes()
	{
		return Cut_And_Modify_YesBtn;
	}
	
	public void Enable_Cut_And_Modify()
	{
		if(Cut_And_Modify_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Cut_And_Modify_YesBtn.click();
		}
	}
	
	public void Disable_Cut_And_Modify()
	{
		if(Cut_And_Modify_YesBtn.isEnabled()) 
		{
			Cut_And_Modify_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	@FindBy(xpath = "//label[contains(.,'Slices')]/../../input")
	public WebElement Slice_CutAndModify_InputBx;
	
	public void Enter_Slices_CutAndModify(String str) throws Exception
	{
		Thread.sleep(1000);
		Slice_CutAndModify_InputBx.clear();
		Thread.sleep(1000);
		Slice_CutAndModify_InputBx.sendKeys(str);
	}
	
	@FindBy(xpath = "//div[@id='new-menu-item-mandatoryModifierGroups']//button[contains(.,'Set Tiered Price')]")
	public WebElement Add_Set_Tiered_Price_MandatoryModiBtn;
	
	@FindBy(xpath = "//div[@id='new-menu-item-optModifierGroups']//button[contains(.,'Set Tiered Price')]")
	public WebElement Add_Set_Tiered_Price_OptionalModiBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add Shift')]")
	public WebElement Add_ShiftBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add tiered price')]")
	public WebElement Add_Tiered_PriceBtn;
	
	@FindBy(xpath = "//input[@aria-label='Serving Size']")
	public WebElement Serving_Size_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Sequence']")
	public WebElement Sequence_Set_Tiered_Price_MandatoryModiInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Set Price For']")
	public WebElement Set_Price_For_Set_Tiered_Price_MandatoryModiInputBx;
	
	@FindBy(xpath = "//app-input-table//input[@aria-label='Quantity']")
	public WebElement Quantity_Set_Tiered_Price_MandatoryModiInputBx;
	
	@FindBy(xpath = "//app-input-table//input[@aria-label='Price']")
	public WebElement Price_Set_Tiered_Price_MandatoryModiInputBx;
	
	@FindBy(xpath = "//button[contains(.,'Add Serving Size Level')]")
	WebElement Add_Serving_Size_LevelBtn;
	
	public void Click_Add_Serving_Size_Level() throws Exception
	{
		Thread.sleep(1000);
		Add_Serving_Size_LevelBtn.click();
	}
	
	
	public void Enable_Jump_With_Minimum_Quantity()
	{
		if(Jump_With_Minimum_Quantity_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Jump_With_Minimum_Quantity_YesBtn.click();
		}
	}
	
	public void Disable_Jump_With_Minimum_Quantity() throws Exception
	{
		Thread.sleep(2000);
		if(Jump_With_Minimum_Quantity_YesBtn.isEnabled()) 
		{
			Thread.sleep(2000);
			Jump_With_Minimum_Quantity_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public void Enable_Set_Tiered_Price_MandatoryModifier()
	{
		if(Set_Tiered_Price_MandatoryModifier_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Set_Tiered_Price_MandatoryModifier_YesBtn.click();
		}
	}
	
	public void Disable_Set_Tiered_Price_MandatoryModifier()
	{
		if(Set_Tiered_Price_MandatoryModifier_YesBtn.isEnabled()) 
		{
			Set_Tiered_Price_MandatoryModifier_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public void Enable_Set_Tiered_Price_OptionalModifier()
	{
		if(Set_Tiered_Price_OptionalModifier_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Set_Tiered_Price_OptionalModifier_YesBtn.click();
		}
	}
	
	public void Disable_Set_Tiered_Price_OptionalModifier()
	{
		if(Set_Tiered_Price_OptionalModifier_YesBtn.isEnabled()) 
		{
			Set_Tiered_Price_OptionalModifier_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public void Enable_Alternate_Modifier_Group() throws Exception
	{
		if(Alternate_Modifier_Group_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Thread.sleep(1000);
			Alternate_Modifier_Group_YesBtn.click();
		}
	}
	
	public void Disable_Alternate_Modifier_Group()
	{
		if(Alternate_Modifier_Group_YesBtn.isEnabled()) 
		{
			Alternate_Modifier_Group_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	@FindBy(xpath = "//input[@placeholder='Select Alternate Modifier']")
	public WebElement Alternate_Modifier_GroupInputBx;
	
	@FindBy(xpath = "//input[@placeholder='Select Modifier']")
	public WebElement Modifier_IncludeModifier_InputBx;
	
	@FindBy(xpath = "//h3[contains(.,'Included Modifiers')]/../../..//input[@aria-label='Modifier Group']")
	public WebElement ModifierGroup_IncludeModifier_InputBx;
	
	@FindBy(xpath = "//h3[contains(.,'Mandatory Modifier Groups')]/../../..//input[@aria-label='Modifier Group']")
	public WebElement ModifierGroup_MandatoryModifier_InputBx;
	
	@FindBy(xpath = "//h3[contains(.,'Optional Modifier Groups')]/../../..//input[@aria-label='Modifier Group']")
	public WebElement ModifierGroup_OptionalModifier_InputBx;
	
	@FindBy(xpath = "//h3[contains(.,'Mandatory Modifier Groups')]/../../..//label[contains(.,'Display Order')]/../../input")
	public WebElement Display_Order_MandatoryModifier_InputBx;
	
	@FindBy(xpath = "//h3[contains(.,'Optional Modifier Groups')]/../../..//label[contains(.,'Display Order')]/../../input")
	public WebElement Display_Order_OptionalModifier_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Minimum Quantity']")
	public WebElement Minimum_Quantity_MandatoryModifierInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Maximum Quantity']")
	public WebElement Maximum_Quantity_MandatoryModifierInputBx;
	
//	@FindBy(xpath = "//h3[contains(.,'Included Modifiers')]/../../..//input[@aria-label='Modifier']")
//	public WebElement Modifiers_IncludedModifiersInputBx;
	
	
	
	
	public void Select_ModifierGroup_Include_Modifiers() throws Exception
	{
		Thread.sleep(1000);
	//	ModifierGroup_IncludeModifier_InputBx.click();
		
		cmp.Click_Wait_ForElementClickable(ModifierGroup_IncludeModifier_InputBx, 60);
		Thread.sleep(1000);
//		Category_InputBx.click();
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(ModifierGroup_IncludeModifier_InputBx)).click();
//		CoursingDropBtn.click();
		
		ModifierGroup_IncludeModifier_InputBx.click();
		
		Thread.sleep(1000);
		List<WebElement> ModifierList=driver.findElements(By.xpath("//div/select-option"));
		
		int ModifierSize=ModifierList.size();
		
		if(ModifierSize<=6)
		{
		
		int randomModifier=ThreadLocalRandom.current().nextInt(2, ModifierSize);
		
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
		
		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
		}
		else
		{
			int randomModifier=ThreadLocalRandom.current().nextInt(1, 6);
			
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
			
			cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
			
			driver.findElement(By.xpath("//div[1]/select-option")).click();
		
		}	
		
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		
		
		if(menuList1.size()!=0)
		{
			ModifierGroup_IncludeModifier_InputBx.click();
		}
				
	}
	
	
	public void Select_Alternate_ModifierGroup() throws Exception
	{
		Thread.sleep(1000);
		Enable_Alternate_Modifier_Group();
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(Alternate_Modifier_GroupInputBx)).click();
//		CoursingDropBtn.click();
		
		//Alternate_Modifier_GroupInputBx .click();
		
		Thread.sleep(1000);
		List<WebElement> ModifierList=driver.findElements(By.xpath("//div/select-option"));
		
		int ModifierSize=ModifierList.size();
		
		if(ModifierSize<=6)
		{
		
		int randomModifier=ThreadLocalRandom.current().nextInt(2, ModifierSize);
		
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
		
		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
		}
		else
		{
			int randomModifier=ThreadLocalRandom.current().nextInt(1, 6);
			
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
			
			cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
			
			driver.findElement(By.xpath("//div[1]/select-option")).click();
		
		}	
		
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		
		
		if(menuList1.size()!=0)
		{
			Alternate_Modifier_GroupInputBx.click();
		}
	}
	
	public WebElement Alternate_Modifier_Group_Yes()
	{
		return Alternate_Modifier_Group_YesBtn;
	}
	
	public void Delete_Include_Modifiers()
	{
		List<WebElement> listIncludeModiGrp=driver.findElements(By.xpath("//app-segmentation[@name='includedModifierSegment']/div/div[1]/div/div/button/span/div/div"));
		
		
		if(listIncludeModiGrp.size()>=1)
		{
			for(int i=2;i<=listIncludeModiGrp.size();i++)
			{
			driver.findElement(By.xpath("//app-segmentation[@name='includedModifierSegment']/div/div[1]/div/div["+i+"]/button/span/div/div")).click();
		
			}
		}
		else
		{
			
		}
	}
	
	
	public void Select_ModifierGroup_Mandatory_Modifiers() throws Exception
	{
		Thread.sleep(1000);
	//	ModifierGroup_MandatoryModifier_InputBx.click();
		
		cmp.Click_Wait_ForElementClickable(ModifierGroup_MandatoryModifier_InputBx, 60);
		Thread.sleep(1000);
//		Category_InputBx.click();
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(ModifierGroup_MandatoryModifier_InputBx)).click();
//		CoursingDropBtn.click();
		
		ModifierGroup_MandatoryModifier_InputBx .click();
		
		Thread.sleep(1000);
		List<WebElement> ModifierList=driver.findElements(By.xpath("//div/select-option"));
		
		int ModifierSize=ModifierList.size();
		
		if(ModifierSize<=6)
		{
		
		int randomModifier=ThreadLocalRandom.current().nextInt(2, ModifierSize);
		
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
		
		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
		}
		else
		{
			int randomModifier=ThreadLocalRandom.current().nextInt(1, 6);
			
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
			
			cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
			
			driver.findElement(By.xpath("//div[1]/select-option")).click();
		
		}	
		
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		
		
		if(menuList1.size()!=0)
		{
			ModifierGroup_MandatoryModifier_InputBx.click();
		}
		
	}
	
	public void Select_ModifierGroup_Optional_Modifiers() throws Exception
	{
		Thread.sleep(1000);
		Add_Optional_Modifier_GroupBtn.click();
		
	//	ModifierGroup_OptionalModifier_InputBx.click();
		
		cmp.Click_Wait_ForElementClickable(ModifierGroup_OptionalModifier_InputBx, 60);
		Thread.sleep(1000);
//		Category_InputBx.click();
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(ModifierGroup_OptionalModifier_InputBx)).click();
//		CoursingDropBtn.click();
		
		ModifierGroup_OptionalModifier_InputBx .click();
		
		Thread.sleep(1000);
		List<WebElement> ModifierList=driver.findElements(By.xpath("//div/select-option"));
		
		int ModifierSize=ModifierList.size();
		
		if(ModifierSize<=6)
		{
		
		int randomModifier=ThreadLocalRandom.current().nextInt(2, ModifierSize);
		
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
		
		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
		}
		else
		{
			int randomModifier=ThreadLocalRandom.current().nextInt(1, 6);
			
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
			
			cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
			
			driver.findElement(By.xpath("//div[1]/select-option")).click();
		
		}	
		
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		
		
		if(menuList1.size()!=0)
		{
			ModifierGroup_OptionalModifier_InputBx.click();
		}
		
	}
	
	public void Enter_Display_Order_MandatoryModifier(String str) throws Exception
	{
		Thread.sleep(1000);
		Display_Order_MandatoryModifier_InputBx.clear();
		Thread.sleep(1000);
		Display_Order_MandatoryModifier_InputBx.sendKeys(str);
		
	}
	
	public void Enter_Display_Order_OptionalModifier(String str) throws Exception
	{
		Thread.sleep(1000);
		Display_Order_OptionalModifier_InputBx.clear();
		Thread.sleep(1000);
		Display_Order_OptionalModifier_InputBx.sendKeys(str);
		
	}
	
	public void Enter_Minimum_Quantity_MandatoryModifier(String str) throws Exception
	{
		Thread.sleep(1000);
		Minimum_Quantity_MandatoryModifierInputBx.clear();
		Thread.sleep(1000);
		Minimum_Quantity_MandatoryModifierInputBx.sendKeys(str);
		
//		driver.findElement(By.xpath("//app-input[@name='minQuantity']/div/div/div/button[1]")).click();
		
	}
	
	public void Enter_Maximum_Quantity_MandatoryModifier(String str) throws Exception
	{
		Thread.sleep(1000);
		Maximum_Quantity_MandatoryModifierInputBx.clear();
		Thread.sleep(1000);
		Maximum_Quantity_MandatoryModifierInputBx.sendKeys(str);
		
//		driver.findElement(By.xpath("//app-input[@name='maxQuantity']/div/div/div/button[1]")).click();
		
	}
	
	@FindBy(xpath = "//div[@id='new-menu-item-mandatoryModifierGroups']//app-selectbox[@label='Serving Size']/div/mat-form-field/div/div/div[3]/input")
	WebElement Serving_Size_Set_Tiered_Price_MandatoryModiInputBx;
	
	@FindBy(xpath = "//div[@id='new-menu-item-optModifierGroups']//app-selectbox[@name='servingSize']/div/mat-form-field/div/div/div[3]/input")
	WebElement Serving_Size_Set_Tiered_Price_OptionalModiInputBx;
	
	public void Select_Set_Tiered_Price_MandatoryModifier() throws Exception
	{
		Enable_Set_Tiered_Price_MandatoryModifier();
		
		Thread.sleep(1000);
		Add_Set_Tiered_Price_MandatoryModiBtn.click();
		
		Serving_Size_Set_Tiered_Price_MandatoryModiInputBx.click();
		
		cmp.Click_Wait_ForElementClickable(Serving_Size_Set_Tiered_Price_MandatoryModiInputBx, 60);
		Thread.sleep(1000);
//		Category_InputBx.click();
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(Serving_Size_Set_Tiered_Price_MandatoryModiInputBx)).click();
//		CoursingDropBtn.click();
		
		Serving_Size_Set_Tiered_Price_MandatoryModiInputBx .click();
		try {
		Thread.sleep(1000);
		List<WebElement> ModifierList=driver.findElements(By.xpath("//div/select-option"));
		
		int ModifierSize=ModifierList.size();
		
		if(ModifierSize<=6)
		{
		
		int randomModifier=ThreadLocalRandom.current().nextInt(2, ModifierSize);
		
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
		
		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
		}
		
		
		else
		{
			int randomModifier=ThreadLocalRandom.current().nextInt(1, 6);
			
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
			
			cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
			
			driver.findElement(By.xpath("//div[1]/select-option")).click();
		
		}	
		
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		
		
		if(menuList1.size()!=0)
		{
			ModifierGroup_MandatoryModifier_InputBx.click();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

	public void Select_Set_Tiered_Price_OptionalModifier() throws Exception
	{
		Common_XPaths cmp=new Common_XPaths();
		Enable_Set_Tiered_Price_OptionalModifier();
		
		Thread.sleep(1000);
		try {
		Add_Set_Tiered_Price_OptionalModiBtn.click();
		
		Serving_Size_Set_Tiered_Price_OptionalModiInputBx.click();
		
		Thread.sleep(1000);
		List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
			
			int menuSize=menuList.size();
			
			if(menuSize==0)
			{
				Serving_Size_Set_Tiered_Price_OptionalModiInputBx.click();
				
				Thread.sleep(1000);
				List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
					
					int menuSize1=menuList1.size();
					
					int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize1);
					
					
					driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
				
				
			}
			else if(menuSize==1)
			{
				driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+menuSize+"]/select-option")).click();
	
			}
			else
			{
			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
			}
			
			
			
			for(int i=1;i<=3;i++)
			{
			Thread.sleep(1000);
			Add_Tiered_PriceBtn.click();
			}
			List<WebElement> shiftList=driver.findElements(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div"));
			
			for(int i=2;i<=shiftList.size();i++)
			{
				driver.findElement(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div["+i+"]/div[2]//input")).clear();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div["+i+"]/div[2]//input")).sendKeys("10");
				
				
				driver.findElement(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div["+i+"]/div[3]//input")).click();
				
				Thread.sleep(1000);
				List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
					
					int menuSize1=menuList1.size();
					
					if(menuSize1==0)
					{
						driver.findElement(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div["+i+"]/div[3]//input")).click();
						
						Thread.sleep(1000);
						List<WebElement> menuList11=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
							
							int menuSize11=menuList11.size();
							
						int randomMenu1=ThreadLocalRandom.current().nextInt(1, menuSize11);
						
						
						driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu1+"]/select-option")).click();
					
					}
					else if(menuSize1==1)
					{
						driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+menuSize1+"]/select-option")).click();
		
					}
					else
					{
					int randomMenu1=ThreadLocalRandom.current().nextInt(1, menuSize1);
					
					
					driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomMenu1+"]")).click();
					}
				
				driver.findElement(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div["+i+"]/div[4]//input")).clear();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div["+i+"]/div[4]//input")).sendKeys("10000");
				
				
				
			}
			
			
			Thread.sleep(1000);
			for(int i=3;i<=shiftList.size();i++)
			{
				Thread.sleep(1000);
//				driver.findElement(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div["+i+"]/div[5]/button")).click();
				driver.findElement(By.xpath("//div[@id='new-menu-item-optModifierGroups']//div[@class='editable-data-grid']/div[3]/div[5]/button")).click();
	
				Thread.sleep(1000);
				cmp.Click_DeleteButton();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@FindBy(xpath = "//mat-hint[contains(.,'Enter display order')]")
	public WebElement Display_OrderErrorMsg;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Enter Minimum Quantity')]")
	public WebElement Minimum_QuantityErrorMsg;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Enter Maximum Quantity')]")
	public WebElement Maximum_QuantityErrorMsg;
	
	public void Verify_Enter_Display_OrderErrorMessage()
	{
		try
		{
			if(Display_OrderErrorMsg.isDisplayed())
			{
				test.log(LogStatus.PASS, "Enter Display Order Displayed");
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Enter Display Order not Displayed");
		}
	}
	
	public void Verify_Enter_Minimum_QuantityErrorMessage()
	{
		try
		{
			if(Minimum_QuantityErrorMsg.isDisplayed())
			{
				test.log(LogStatus.PASS, "Enter Minimum Quantity Displayed");
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Enter Minimum Quantity not Displayed");
		}
	}
	
	public void Verify_Enter_Maximum_QuantityErrorMessage()
	{
		try
		{
			if(Maximum_QuantityErrorMsg.isDisplayed())
			{
				test.log(LogStatus.PASS, "Enter Maximum Quantity Displayed");
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Enter Maximum Quantity not Displayed");
		}
	}
	
	
	@FindBy(xpath = "//mat-step-header[contains(.,'Basic Details')]")
	public WebElement Basic_DetailsTab;
	

	@FindBy(xpath = "//mat-step-header[contains(.,'Included Modifiers')]")
	public WebElement Included_ModifiersTab;
	

	@FindBy(xpath = "//mat-step-header[contains(.,'Mandatory Modifier Groups')]")
	public WebElement Mandatory_ModifierGroupsTab;
	

	@FindBy(xpath = "//mat-step-header[contains(.,'Optional Modifier Groups')]")
	public WebElement Optional_ModifierGroupsTab;
	

	@FindBy(xpath = "//mat-step-header[contains(.,'Inventory Details')]")
	public WebElement Inventory_DetailsTab;
	
	public void Click_Basic_DetailsTab()
	{
		Basic_DetailsTab.click();
	}
	
	public void Click_Included_ModifiersTab()
	{
		Included_ModifiersTab.click();
	}
	
	public void Click_Mandatory_ModifierGroupsTab()
	{
		Mandatory_ModifierGroupsTab.click();
	}
	
	public void Click_Optional_ModifierGroupsTab()
	{
		Optional_ModifierGroupsTab.click();
	}
	
	public void Click_Inventory_DetailsTab()
	{
		Inventory_DetailsTab.click();
	}
	
	public void Click_Add_Include_Modifiers() throws Exception
	{
		Thread.sleep(2000);
		Add_Included_ModifiersBtn.click();
	}
	
	public void Click_Add_Mandatory_ModifierGroup() throws Exception
	{
		Thread.sleep(2000);
		Add_Mandatory_Modifier_GroupBtn.click();
	}
	
	public void Click_Add_Optional_ModifierGroup() throws Exception
	{
		Thread.sleep(2000);
		Add_Optional_Modifier_GroupBtn.click();
	}
	
	@FindBy(xpath = "//div[contains(@class,'cursor-pointer')][contains(.,'Add Inventory Item')]")
	public WebElement Add_Inventory_ItemBtn;
	
	@FindBy(xpath = "//div[contains(@class,'cursor-pointer')][contains(.,'Add Sub-Recipe')]")
	public WebElement Add_SubRecipeBtn;
	
	@FindBy(xpath = "//div[contains(@class,'cursor-pointer')][contains(.,'Add Manual Entry')]")
	public WebElement Add_Manual_EntryBtn;
	
	@FindBy(xpath = "//input[@aria-label='Level']")
	public WebElement Level_InventoyItemsInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Category']")
	public WebElement Category_InventoyItemsInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Sub Category']")
	public WebElement SubCategory_InventoyItemsInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Item']")//"//input[@aria-label='Item']")
	public WebElement Item_InventoyItemsInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Recipe Unit']")//"//input[@aria-label='Recipe Unit']")
	public WebElement Recipe_Unit_InventoyItemsInputBx;
	
	@FindBy(xpath =   "//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Quantity']" )  //"//input[@aria-label='Quantity']")  
	public WebElement Quantity_InventoyItemsInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//div[6]/span")
	public WebElement Unit_Price_InventoryItemsInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//div[8]/span")
	public WebElement Cost_InventoryItemsInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Select Sub Recipes')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Item']")//"//input[@aria-label='Item']")
	public WebElement Item_SubRecipeInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Select Sub Recipes')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Recipe Unit']")//"//input[@aria-label='Recipe Unit']")
	public WebElement Recipe_Unit_SubRecipeInputBx;
	
	@FindBy(xpath =  "//span[contains(.,'Select Sub Recipes')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Quantity']" )  //"//input[@aria-label='Quantity']")  
	public WebElement Quantity_SubRecipeInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Select Sub Recipes')]/../..//div[contains(@class,'inventory-table')]//div[3]/span")
	public WebElement Unit_Price_SubRecipeInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Select Sub Recipes')]/../..//div[contains(@class,'inventory-table')]//div[5]/span")
	public WebElement Cost_SubRecipeInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Manual Entry']")
	public WebElement Item_ManualEntryInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Unit Price']")
	public WebElement Unit_Price_ManualEntryInputBx;
	
	@FindBy(xpath = "//span[contains(.,'Manual Entry')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Quantity']")
	public WebElement Quantity_ManualEntryInputBx;
	
	@FindBy(xpath = "(//span[contains(.,'Manual Entry')]/../..//div[contains(@class,'inventory-table')]//div[4]/span)[4]")
	public WebElement Cost_ManualEntryInputBx;
	
	
	
	public void Add_Inventory_Item() throws Exception
	{
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
		Add_Inventory_ItemBtn.click();
		}
		
		
	//Level - 	//div[contains(@class,'selected-inventory-item')]/../div[3]/div/div[1]//input
	//Category - 	//div[contains(@class,'selected-inventory-item')]/../div[3]/div/div[2]//input
	//Sub-Catgeory- //div[contains(@class,'selected-inventory-item')]/../div[3]/div/div[3]//input
		//Item - 	//div[contains(@class,'selected-inventory-item')]/../div[3]/div/div[4]//input
		//Recipe Unit - //div[contains(@class,'selected-inventory-item')]/../div[3]/div/div[5]//input
		//Unit Price - //div[contains(@class,'selected-inventory-item')]/../div[3]/div/div[6]
		//Quantity -//div[contains(@class,'selected-inventory-item')]/../div[3]/div/div[7]//input
		//Cost -//div[contains(@class,'selected-inventory-item')]/../div[3]/div/div[8]/span
		
		//Delete - //div[contains(@class,'selected-inventory-item')]/../div[3]/div[2]/button
		
	}
	
	
	//////////////// Retail Item /////////////////////
	@FindBy(xpath = "//label[contains(.,'Level')]/../../input")
	WebElement Level_RetailItemInputBx;
	
	@FindBy(xpath = "(//div[.='Standard Item'])[3]")
	WebElement Standard_Item_RadioBtn;
	
	@FindBy(xpath = "(//div[.='Item With Variants'])[3]")
	WebElement Item_With_Variants_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][.='Kit/Assembly']")
	WebElement Composite_Item_RadioBtn;
	
	public void Click_Standard_Item_ProductType()
	{
		Standard_Item_RadioBtn.click();
	}
	
	public WebElement Standard_Item_ProductType()
	{
		return Standard_Item_RadioBtn;
	}
	
	public void Click_Item_With_Variants_ProductType()
	{
		Item_With_Variants_RadioBtn.click();
	}
	
	public WebElement Item_With_Variants_ProductType()
	{
		return Item_With_Variants_RadioBtn;
	}
	
	public void Click_Composite_Item_ProductType()
	{
		Composite_Item_RadioBtn.click();
	}
	
	public WebElement Composite_Item_ProductType()
	{
		return Composite_Item_RadioBtn;
	}
	
	public void Click_Category_LevelTypeOption_RetailItem() throws Exception
	{
		Thread.sleep(1000);
		Level_RetailItemInputBx.click();
		
		Thread.sleep(1000);
		//Select Category
		driver.findElement(By.xpath("//select-option[1]")).click();
	}
	
	public void Click_SubCategory_LevelTypeOption_RetailItem() throws Exception
	{
		Thread.sleep(1000);
		Level_RetailItemInputBx.click();
		
		Thread.sleep(1000);
		//Select Category
		driver.findElement(By.xpath("//div[2]/select-option")).click();
	}
	public WebElement Level_RetailItem()
	{
		return Level_RetailItemInputBx;
	}
	public void Select_Standard_Time_ProductType(String SKUCode,String SupplyPrice,String MarkupPerc) throws Exception
	{
		
		Thread.sleep(1000);
		Standard_Item_RadioBtn.click();
		
		Thread.sleep(1000);
		//Click the Serving Size
		driver.findElement(By.xpath("//app-selectbox[@name='retailServingSize']//input")).click();
		
		Thread.sleep(2000);
		List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
			
		if(menuList.size()>1)
		{
			int menuSize=menuList.size();
			
			
			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/ cdk-virtual-scroll-viewport/div/div["+randomMenu+"]/select-option")).click();
		
		}
		else
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/ cdk-virtual-scroll-viewport/div/div/select-option")).click();
		}
		
		
		Thread.sleep(1000);
		//Click the SKU Type
		driver.findElement(By.xpath("//app-selectbox[@name='retailSkuType']//input")).click();
		
		Thread.sleep(2000);
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']/ cdk-virtual-scroll-viewport/div/div/select-option"));
			
		if(menuList1.size()>1)
		{
			int menuSize=menuList1.size();
			
			
			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']/ cdk-virtual-scroll-viewport/div/div["+randomMenu+"]/select-option")).click();
		
		}
		else
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/ cdk-virtual-scroll-viewport/div/div/select-option[1]")).click();
		}
		
		
		
		//Clear SKU Code
		driver.findElement(By.xpath("//app-input[@name='retailSkuCode']//input")).clear();
		//Enter SKU Code
		driver.findElement(By.xpath("//app-input[@name='retailSkuCode']//input")).sendKeys(SKUCode);
		
		try {
		//Clear Supply Price
		driver.findElement(By.xpath("//app-currency-input[@name='retailSupplyPrice']//input")).clear();
		//Enter Supply Price
		driver.findElement(By.xpath("//app-currency-input[@name='retailSupplyPrice']//input")).sendKeys(SupplyPrice);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//Clear Markup Percentage
		driver.findElement(By.xpath("//app-input[@name='retailMarginPercentage']//input")).clear();
		//Enter Markup Percentage
		driver.findElement(By.xpath("//app-input[@name='retailMarginPercentage']//input")).sendKeys(MarkupPerc);
		
		double Supply_Price=Double.parseDouble(SupplyPrice);
		double MarkUp_Percentage=Double.parseDouble(MarkupPerc);
		
		double Expected_Selling_Price=Supply_Price*MarkUp_Percentage;
		try {
		String Act_SellPrice1=driver.findElement(By.xpath("//app-currency-input[@name='retailSellingPrice']//input")).getAttribute("value");
		int selling = Integer.parseInt(Act_SellPrice1);
		if(!(selling==100))
		{
			test.log(LogStatus.PASS,"By default selling price is not 100");
		}
		else {
			test.log(LogStatus.FAIL, "By default selling price is 100");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		//Get the Actual Selling Price
		String Act_SellPrice=driver.findElement(By.xpath("//app-currency-input[@name='retailSellingPrice']//input")).getAttribute("value");
		double Actual_Selling_Price=Double.parseDouble(Act_SellPrice);
		
		if(Actual_Selling_Price==Expected_Selling_Price)
		{
			test.log(LogStatus.PASS, "Selling Price Calculated Correctly");
		}
		else
		{
			double diff=Expected_Selling_Price-Actual_Selling_Price;
			test.log(LogStatus.FAIL, "Selling Price Calculated Incorrcetly. The value diff is : "+diff);
		}
		
	}

	@FindBy(xpath = "//label[contains(.,'Brand')]/../../input")
	WebElement Brand_RetailItemInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Par Level')]/../../input")
	WebElement Par_Level_RetailItemInputBx;
	
	
	@FindBy(xpath = "//label[contains(.,'Inventory Unit')]/../../input")
	WebElement Inventory_Unit_RetailItemInputBx;
	
	
	@FindBy(xpath = "//label[contains(.,'Vendor')]/../../input")
	WebElement Vendor_RetailItemInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Primary Storage')]/../../input")
	WebElement Primary_Storage_RetailItemInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Secondary Storage')]/../../input")
	WebElement Secondary_Storage_RetailItemInputBx;
	
	
	public void Enter_Brand_RetailItem(String str) throws Exception
	{
		Thread.sleep(1000);
		Brand_RetailItemInputBx.clear();
		Thread.sleep(1000);
		Brand_RetailItemInputBx.sendKeys(str);
	}
	
	
	public void Enter_Par_Level_RetailItem(String str) throws Exception
	{
		Thread.sleep(1000);
		Par_Level_RetailItemInputBx.clear();
		Thread.sleep(1000);
		Par_Level_RetailItemInputBx.sendKeys(str);
	}
	
	public void Select_Inventory_Unit_RetailItem() throws Exception
	{
		Inventory_Unit_RetailItemInputBx.click();
		
		Thread.sleep(1000);
		Thread.sleep(2000);
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
	    try {
		if(menuList1.size()>1)
		{
			int menuSize=menuList1.size();
			
			
			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
			
			
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
		
		}
		else
		{
			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
		}
	    }
	    catch (Exception e) {
	    	driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
		}
		
	}
	
	public void Select_Vendor_RetailItem() throws Exception
	{
		Vendor_RetailItemInputBx.click();
		
		Thread.sleep(1000);
//		Thread.sleep(2000);
//		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
//		try {	
//		if(menuList1.size()>1)
//		{
//			int menuSize=menuList1.size();
//			
//			
//			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
//			
//			
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
//		
//		}
//		else
//		{
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
//		}
//		}
//		catch (Exception e) {
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[2]/select-option")).click();
//		}
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[2]/select-option")).click();
		
	}
	
	
	public void Select_Primary_Storage_RetailItem() throws Exception
	{
		Primary_Storage_RetailItemInputBx.click();
		
		Thread.sleep(1000);
//		Thread.sleep(2000);
//		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
//		try {
//		if(menuList1.size()>1)
//		{
//			int menuSize=menuList1.size();
//			
//			
//			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
//			
//			
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
//		
//		}
//		else
//		{
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
//		}
//		}
//		catch (Exception e) {
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[2]/select-option")).click();	
//			}
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[2]/select-option")).click();		
	}
	
	public void Select_Secondary_Storage_RetailItem() throws Exception
	{
		Secondary_Storage_RetailItemInputBx.click();
		
		Thread.sleep(1000);
//		Thread.sleep(2000);
//		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
//		try {	
//		if(menuList1.size()>1)
//		{
//			int menuSize=menuList1.size();
//			
//			
//			int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
//			
//			
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomMenu+"]/select-option")).click();
//		
//		}
//		else
//		{
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
//		}
//		}
//		catch (Exception e) {
//			driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
//		}
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[2]/select-option")).click();
		
	}
	
	@FindBy(xpath = "//span[contains(.,'Calculate COGS On Cost Price')]/../../div[2]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement Calculate_COGS_onCostPrice_YesBtn;
	
	@FindBy(xpath = "//span[contains(.,'Calculate COGS On Cost Price')]/../../div[2]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement Calculate_COGS_onCostPrice_NoBtn;
	
	public void Enable_Calculate_COGS_onCostPrice()
	{
		if(Calculate_COGS_onCostPrice_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Calculate_COGS_onCostPrice_YesBtn.click();
		}
	}
	
	public void Disable_Calculate_COGS_onCostPrice()
	{
		if(Calculate_COGS_onCostPrice_YesBtn.isEnabled()) 
		{
			Calculate_COGS_onCostPrice_NoBtn.click();
		}
		else
		{
		
		}
	}

	public WebElement Calculate_COGS_onCostPrice_Yes()
	{
		return Calculate_COGS_onCostPrice_YesBtn;
	}
	
	//app-input[@name='retailSkuCode']//mat-icon[contains(.,'add')]
	//app-input[@name='retailSkuCode']//mat-icon[contains(.,'minimize')]
	//button[contains(.,'Add SKU Code')]
	@FindBy(xpath = "//button[contains(.,'Add Tax')]")
	WebElement Add_TaxBtn;
	
	public void Create_RetailItem_NewTax(String str) throws Exception
	{
		cmp=new Common_XPaths();
		tx=new TaxesPage();
		Thread.sleep(1000);
		Add_TaxBtn.click();
		
		Thread.sleep(1000);
		if(cmp.CreationScreenHeader.getText().equalsIgnoreCase("New Tax"))
		{
			test.log(LogStatus.PASS, "New Tax form loaded successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "New Tax form loaded Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Thread.sleep(1000);
		cmp.New_TaxNameInput.clear();
		Thread.sleep(500);
		cmp.New_TaxNameInput.sendKeys(str);
	//Remove below all	
		Thread.sleep(1000);
//		tx.Select_TaxType_Percentage();
//		Thread.sleep(1000);
//		tx.Enter_Percentage("1000");
//		Thread.sleep(1000);
//		tx.Select_InclusiveTax();
//		
////		tx.Select_DefaultTax();
		Thread.sleep(1000);
		tx.Select_TaxType_Amount();
		
		Thread.sleep(1000);
		tx.Enter_AmountBox("2000");
		
//		tx.Click_ItemTax();
		
		Thread.sleep(1000);
		cmp.Click_SaveButton();
		
		Thread.sleep(2000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Tax Saved Successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Saved Failed");
		}
	}
	
	@FindBy(xpath = "//input[@data-placeholder='Search ']")
	WebElement SearchBox;
	
	public void SearchAndClickEdit(String SearchValue) throws Exception
	{
	
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);
		try
		{
			Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../td[8]/div/div[1]/button")).click();
		
		}
		catch(Exception g)
		{
			try {
				driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../td[9]/div/div[1]/button")).click();
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../div//div[1]/button")).click();
		}
		}
		
		}
	
//	public void SearchAndClickDelete(String SearchValue) throws Exception
//	{
//
//		try
//		{
//		Thread.sleep(1000);
//		SearchBox.clear();
//		Thread.sleep(2000);
//
//		SearchBox.sendKeys(SearchValue);
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../td[8]/div/div[2]/button")).click();
//		Thread.sleep(1000);
//		}
//		catch(Exception h)
//		{
//			try {
//				driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../td[9]/div/div[2]/button")).click();
//				Thread.sleep(1000);
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//		
//			Thread.sleep(1000);
//			SearchBox.clear();
//			Thread.sleep(2000);
//
//			SearchBox.sendKeys(SearchValue);
//			Thread.sleep(2000);
//
//			driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../div//div[2]/button")).click();
//			Thread.sleep(1000);
//			}
//		}
//	}
	
	public void SearchAndClickDeleteCancel(String SearchValue) throws Exception
	{
		try {
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../td[3]//div[1]/button")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	public void SearchAndClickActivate(String SearchValue) throws Exception
	{
//		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(300));
		
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(1000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);
		
		try
		{
		driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../td[8]/div/div[1]/button")).click();
		}
		catch(Exception h)
		{
			try {
				driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../td[9]/div/div[1]/button")).click();
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			
			driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../../div//div/button")).click();
			}
		}
	}
	
	public void Click_RetailItem() 
	{
		driver.findElement(By.xpath("//span[.='RETAIL ITEMS']")).click();
	}
	
	@FindBy(xpath = "//app-selectbox[@placeholder='Select Modifier']")
	WebElement Modfier_Inputbox;

	public void select_Modifier() throws Exception 
	{
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(Modfier_Inputbox)).click();
//		CoursingDropBtn.click();
		
//		Modfier_Inputbox .click();
		
		Thread.sleep(1000);
		List<WebElement> ModifierList=driver.findElements(By.xpath("//div/select-option"));
		
		int ModifierSize=ModifierList.size();
		
		if(ModifierSize<=6)
		{
		
		int randomModifier=ThreadLocalRandom.current().nextInt(2, ModifierSize);
		
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
		
		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
		}
		else
		{
			int randomModifier=ThreadLocalRandom.current().nextInt(1, 6);
			
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
			
			cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomModifier+"]/select-option")).getText());
			
			driver.findElement(By.xpath("//div[1]/select-option")).click();
		
		}	
		
		List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		
		
		if(menuList1.size()!=0)
		{
			Alternate_Modifier_GroupInputBx.click();
		}
		
	}
	
	@FindBy(xpath = "//label[contains(.,'Tare Group')]/../../input")
	WebElement TareGroupDropBtn;
	
	public void Select_TareGroup() throws Exception
	{
		cmp=new Common_XPaths();
		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(TareGroupDropBtn);
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
//		TareGroupDropBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(TareGroupDropBtn)).click();
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
		
	}
	
	@FindBy(xpath = "//input[@data-placeholder='Select Category']")
	public WebElement CategoryDropBtn;
	
	@FindBy(xpath = "//input[@data-placeholder='Select Sub Category']")
	public WebElement SubCategoryDropBtn;
	
	
	public void Click_New_Category_Button_InDropInputBox() throws Exception 
	{
		Thread.sleep(1000);
		CategoryDropBtn.click();

		//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'New Category')]")).click();

		//Clear and Enter the Department Name 
		Thread.sleep(1000);
	}
	
	public void Click_New_SubCategory_Button_InDropInputBox() throws Exception 
	{
		Thread.sleep(1000);
		SubCategoryDropBtn.click();

		//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'New SubCategory')]")).click();

		//Clear and Enter the Department Name 
		Thread.sleep(1000);
	}
	
	
	@FindBy(xpath = "(//h3[contains(.,'New Category')]/../../..//input)[1]")
	WebElement Category_Name_InputBox;
	
	@FindBy(xpath = "(//h3[contains(.,'New Subcategory')]/../../..//input)[1]")
	WebElement SubCategory_Name_InputBox;
	
	public void Enter_Category_Name_inSecondaryScreen(String Str) throws Exception
	{
		Thread.sleep(1000);
		Category_Name_InputBox.clear();
		Thread.sleep(1000);
		Category_Name_InputBox.sendKeys(Str);
	}
	
	public void Enter_SubCategory_Name_inSecondaryScreen(String Str) throws Exception
	{
		Thread.sleep(1000);
		SubCategory_Name_InputBox.clear();
		Thread.sleep(1000);
		SubCategory_Name_InputBox.sendKeys(Str);
	}
	
	
	@FindBy(xpath = "//span[contains(.,'Please choose all the mandatory fields in Basic Details')]")
	public WebElement Choose_All_Mandatory_Fields_in_Basic_Details_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Select modifier Group')]")
	public WebElement Select_Modifier_Group_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint[contains(.,'Invalid alternate modifier group')]")
	public WebElement Invalid_Alternate_Modifier_Group_ErrorMsg;
	
	@FindBy(xpath = "(//data-grid-table//input[@aria-label='Price'])[1]")
	public WebElement Prefix_Price_IncludedModifiersInputBx;
	
	@FindBy(xpath = "//input[@aria-label='Parent Modifiers']")
	public WebElement Parent_Modifiers_InputBx;
	
	@FindBy(xpath = "//button[contains(.,'RETAIL ITEMS')]")
	public WebElement Retail_Item_MenuBtn;

	
	public void Click_RetailItem_MenuBtn() throws Exception
	{
		cmp=new Common_XPaths();
		Thread.sleep(1000);
		Retail_Item_MenuBtn.click();
		Thread.sleep(2000);
		cmp.waitForPageToLoad();
	}
	
	@FindBy(xpath = "//h3[@class='title ng-star-inserted']")
	WebElement RetailItemScreenHeader;
	
	
	public void VerifyRetailItemScreenPageHeader(String Str) throws InterruptedException
	{
		Thread.sleep(2000);
		if(RetailItemScreenHeader.getText().equals(Str))
		{
			test.log(LogStatus.PASS, Str+" Page Loaded Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			
		}
		else
		{
			test.log(LogStatus.FAIL, Str+" Page Loaded Failed");
			
			ut.FailedCaptureScreenshotAsBASE64(); }
			
}	
	
	@FindBy(xpath="//span[normalize-space()='Show All']")
	WebElement Tax_showall_RetailItem;
	
	
	@FindBy(xpath = "//input[@aria-label='Selling Size']")
	WebElement SelectUnitofMeasure;
	
	public void IselectunitofMeasure () throws Exception 
	{
		
		SelectUnitofMeasure.click();
		Thread.sleep(2000);
			
		List<WebElement> MeasureList= driver.findElements(By.xpath("//div[@id='select-option']"));
		System.out.println("Measure list size is"+MeasureList);
			
		int MeasureListsize=MeasureList.size();
		
		if(MeasureListsize>1)
		{
							
			int randommeasurelist=ThreadLocalRandom.current().nextInt(1, MeasureListsize);
			System.out.println("Measure list picked is"+randommeasurelist);
			
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div["+randommeasurelist+"]/select-option")).click();
			
		}
		else if(MeasureListsize==1)
		{
			driver.findElement(By.xpath("//div[@class='options with-height']/cdk-virtual-scroll-viewport/div/div[1]/select-option")).click();
		
			
		}
		
				else {
		{
			
			driver.findElement(By.xpath("//select-option/div[contains(.,'No results match')]")).isDisplayed();
			
			cmp.Click_BackspaceButton();
			
		}
		
	}}

@FindBy(xpath="//app-input[@name='retailSkuCode']//input")
public WebElement EnterSKUcode;

public void IEnterSKUcode () throws Exception
{

EnterSKUcode.clear();
EnterSKUcode.sendKeys(ut.getProperty("Product_Retail_Items_SKUcode"));

}

@FindBy(xpath = "//input[@aria-label='Selling Price']")
public WebElement Selling_PriceInputBx;

public void Enter_SellingPrice(String Str) throws Exception
{

Selling_PriceInputBx.clear();
Selling_PriceInputBx.sendKeys(Str);
Thread.sleep(2000);
}

@FindBy(xpath="//h3[@class='title']")
public WebElement Retail_BasicdetailsTitle;

public void Verify_BasicdetailsTitle(String Str) throws Exception {
	
	//cmp.Click_Wait_ForElementClickable(Retail_BasicdetailsTitle, 60);
	cmp.Cursor_MoveToElement(Retail_BasicdetailsTitle);
	
	if(Retail_BasicdetailsTitle.getText().equals(Str))
	{
		test.log(LogStatus.PASS, Str+" Page Scrolled up Successfully");
		
		ut.PassedCaptureScreenshotAsBASE64(); }
	else
	{
		test.log(LogStatus.FAIL, Str+" Page Scroll up Failed");
		
		ut.FailedCaptureScreenshotAsBASE64(); }
}


@FindBy(xpath="//label[contains(.,'Name')]/../../input")
public WebElement RetailItem_NameInputBx;

public void IEnterRetailName (String Str) throws Exception
{

	RetailItem_NameInputBx.clear();
	Thread.sleep(2000);
	RetailItem_NameInputBx.sendKeys(Str);
	Thread.sleep(1000);

}

@FindBy(xpath = "//input[@aria-label='Inventory Count']")
public WebElement Retail_InventoryCountInputBx;

public void IEntertheInventoryCount() throws Exception
{
	Thread.sleep(2000);
	Retail_InventoryCountInputBx.clear();
	Thread.sleep(2000);
	Retail_InventoryCountInputBx.sendKeys(ut.getProperty("Product_Retail_Items_InventoryCount"));
	Thread.sleep(2000);
}


@FindBy(xpath = "//label[contains(.,'Tracking')]/../../input")
public WebElement TrackingInventory_RetailItemInputBx;

public void Select_Tracking_RetailItem() throws Exception
{
	
	cmp=new Common_XPaths();
	Thread.sleep(1000);
	cmp.Click_Wait_ForElementClickable(TrackingInventory_RetailItemInputBx, 60);
	Thread.sleep(1000);
	
//	Thread.sleep(2000);
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//	wait.until(ExpectedConditions.elementToBeClickable(TrackingInventory_RetailItemInputBx)).click();
//	
	
	TrackingInventory_RetailItemInputBx.click();
	
	Thread.sleep(1000);

	List<WebElement> menuList1=driver.findElements(By.xpath("//div/select-option[1]"));
	try {	
	if(menuList1.size()>1)
	{
		int menuSize=menuList1.size();
		
		
		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
		
	
		driver.findElement(By.xpath("//div["+randomMenu+"]/select-option[1]")).click();
		Thread.sleep(2000);
	
	}
	else
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/select-option[1]")).click();
	}
	}
	catch (Exception e) {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/select-option[1]")).click();
	}

	
}

@FindBy(xpath = "//input[@aria-label='Inventory Level']")
public WebElement Category_InventoryLevelTypeRetailInputBx;


public void Click_Category_LevelTypeOption_RetailItemInventory() throws Exception
{
	Thread.sleep(1000);
	Category_InventoryLevelTypeRetailInputBx.click();
	
	Thread.sleep(2000);
	//Select Category
	driver.findElement(By.xpath("//select-option[1]")).click();
	Thread.sleep(2000);
}

@FindBy(xpath="//input[@aria-label='Inventory Category']")
public WebElement Category_InventoryInputBx;

public void Select_Category_InventoryRetailInputBx() throws Exception
{

	cmp=new Common_XPaths();
	cmp.Click_Wait_ForElementClickable(Category_InventoryInputBx, 60);
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	wait.until(ExpectedConditions.elementToBeClickable(Category_InventoryInputBx)).click();
	
	Category_InventoryInputBx.click();
	
	Thread.sleep(2000);
	List<WebElement> InventoryCategoryList=driver.findElements(By.xpath("//div/select-option"));
	
	int InventoryCategorySize=InventoryCategoryList.size();
	
	if(InventoryCategorySize<=6)
	{
	
	int randomCategory=ThreadLocalRandom.current().nextInt(2, InventoryCategorySize);
	
	Thread.sleep(1000);
	cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomCategory+"]/select-option")).getText());
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[1]/select-option")).click();
	}
	else
	{
		int randomCategory=ThreadLocalRandom.current().nextInt(1, 6);
		
		Thread.sleep(1000);

		cmp.Verify_Search(driver.findElement(By.xpath("//div["+randomCategory+"]/select-option")).getText());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[1]/select-option")).click();
	
	}	
	
//	List<WebElement> menuList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
//	
//	if(menuList1.size()!=0)
//	{
//		SubCategory_InputBx.click();
//	}
}


public void Click_SubCategory_LevelTypeOption_RetailItemInventory() throws Exception
{
	Thread.sleep(1000);
	Category_InventoryLevelTypeRetailInputBx.click();
	
	Thread.sleep(1000);
	//Select SubCategory
	driver.findElement(By.xpath("//div[2]/select-option")).click();
}

@FindBy(xpath = "//input[@aria-label='inventorySubCategory']")
public WebElement SubCategory_InventoyRetailItemsInputBx;


public void iSelectInventorySubCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions

	Thread.sleep(3000);
	cmp.Click_Wait_ForElementClickable(SubCategory_InventoyRetailItemsInputBx, 60);
		
	SubCategory_InventoyRetailItemsInputBx.click();
    
    Thread.sleep(2000);
	
	try
	{
		Thread.sleep(1000);
		
		if(driver.findElement(By.xpath("//select-option[contains(.,'No results match')]")).isDisplayed())
		{
		//    cmp.Click_DropDown_withSelection(Category_InventoryLevelTypeRetailInputBx, "Category", "Level Type Selected as Category in Inventory Items due to SubCategory Unavailable");

	test.log(LogStatus.INFO, "Sub Categories not available for Selected Categories");
			
	//	cmp.Click_DropDown(Category_InventoryLevelTypeRetailInputBx, "Category Selected in Inventory Items");
	SubCategory_InventoyRetailItemsInputBx.click();
	
		}}
	
	catch(Exception k)
	{
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
	
		}
	
}


@FindBy(xpath = "//span[@class='mat-slide-toggle-bar']")
public WebElement Inherit__Tax_ToggleBtn_RetailItem;

public void Disable_InheritTaxfromCategorySettings() throws Exception
{
	Thread.sleep(1000);
	if(Inherit__Tax_ToggleBtn_RetailItem.isSelected())
	{
		Thread.sleep(2000);
		Inherit__Tax_ToggleBtn_RetailItem.click();
	}
	else
	{
		
	}
}

@FindBy(xpath="//app-currency-input[@name='retailSupplyPrice']//input")
public WebElement EnterSupplierCost;

public void IEnterSypplierCost (String Str) throws Exception
{

	EnterSupplierCost.clear();
	EnterSupplierCost.sendKeys(Str);

}

@FindBy(xpath="//app-input[@name='retailMarginPercentage']//input")
public WebElement EnterMarkupPercentage;

public void IEnterMarkupPercentage (String Str) throws Exception
{

	EnterMarkupPercentage.clear();
	EnterMarkupPercentage.sendKeys(Str);

}

@FindBy(xpath = "//button[.='SAVE']")
WebElement SaveBtnRetailItem;

public void Click_SaveButton_RetailItem() throws InterruptedException
{
	Thread.sleep(2000);
	SaveBtnRetailItem.click();

if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Retail item saved successfully"))
{
	Thread.sleep(2000);
	test.log(LogStatus.PASS, "Retail item saved successfully");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "Retail item save failed");
	ut.FailedCaptureScreenshotAsBASE64();
}
}


@FindBy(xpath = "//app-chip[@name='retailItemTaxes']/div/mat-chip-list/div/mat-chip")
WebElement SelectTaxesRetailsItems;

@FindBy(xpath = "//h5[contains(.,'Tax')]/../../..//button[contains(.,'Show All')]")
WebElement ShowAll_Select_TaxBtn_RetailItem;

public void Select_Taxes_RetailItems() throws Exception
{

	Thread.sleep(1000);
	List<WebElement> courseList=driver.findElements(By.xpath("//app-chip[@name='retailItemTaxes']/div/mat-chip-list/div/mat-chip"));
	
	int courseSize=courseList.size();
	
	
	int randomCoursing=ThreadLocalRandom.current().nextInt(1, courseSize);
	
	if(courseSize>=1)
	{
	try
	{
	Thread.sleep(1000);
	if(ShowAll_Select_TaxBtn_RetailItem.isDisplayed())
	{
		Thread.sleep(1000);
		ShowAll_Select_TaxBtn_RetailItem.click();
	}
	}
	catch(Exception l) {}
	
	
		Thread.sleep(1000);
	driver.findElement(By.xpath("//app-chip[@name='retailItemTaxes']/div/mat-chip-list/div/mat-chip["+randomCoursing+"]")).click();
	
}
else
{
	test.log(LogStatus.INFO, "Taxes Not available");
	ut.PassedCaptureScreenshotAsBASE64();
}
}

@FindBy(xpath="//span[normalize-space()='Link Existing Item']")
public WebElement ClickLinkExistingItem_RetailInventory;

@FindBy(xpath="//*[@id=\"cdk-drop-list-3\"]/tbody/tr/td")
public WebElement RetailChildItemnotfound;

public WebElement IverifyRetailChildItemnotFound() {
	return RetailChildItemnotfound;
}

public void Iverify_RetailChildItem_notfound() {
	IverifyRetailChildItemnotFound().getText().equals("Retail Child Item not found");
}

public void IclickLinkExistingItem_RetailInventory() throws InterruptedException {
	Thread.sleep(2000);
	
	try {
		if (IverifyRetailChildItemnotFound().isDisplayed()) {
			test.log(LogStatus.FAIL, "Retail Child Item not found");
			ut.FailedCaptureScreenshotAsBASE64();	
		}
		else {
			
		}
	}
	catch(Exception E) {
		ClickLinkExistingItem_RetailInventory.click();
	}
	
}


@FindBy(xpath="//input[@aria-label='Search']")
public WebElement SelectExistingItem_RetailInventory;

public void Select_ExistingItem_RetailInventory() throws Exception
{
	Thread.sleep(2000);
	SelectExistingItem_RetailInventory.click();
	
	Thread.sleep(1000);

	List<WebElement> menuList1=driver.findElements(By.xpath("//div/select-option[1]"));
	try {	
	if(menuList1.size()>1)
	{
		int menuSize=menuList1.size();
		
		
		int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
		
	
		driver.findElement(By.xpath("//div["+randomMenu+"]/select-option[1]")).click();
	
	}
	else
	{
		driver.findElement(By.xpath("//div[1]/select-option[1]")).click();
	}
	}
	catch (Exception e) {
		driver.findElement(By.xpath("//div[2]/select-option[1]")).click();
	}

	
}

@FindBy(xpath = "//div/h3[@class='drawer-title']")
public WebElement UpdateChildHeaderRetail;

public WebElement VerifyUpdate_ChildHeaderRetail()
{
	return UpdateChildHeaderRetail;
}

public void VerifyUpdateChildHeaderRetail(String Str)
{
	if(VerifyUpdate_ChildHeaderRetail().getText().equals(Str))
	{
		test.log(LogStatus.PASS, Str+" Verified Successfully");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, Str+" Verification Failed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}


@FindBy(xpath="//input[@aria-label='Search']")
public WebElement SelectRetailIteam_SearchBox;

public void SearchAndVerify_SearchBox3letter_RetailItem() throws Exception
{
	
	try
	{
		
	if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
	{
	String SearchText=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText().substring(0, 3);

	Thread.sleep(1000);
	SelectRetailIteam_SearchBox.clear();
	Thread.sleep(2000);

	SelectRetailIteam_SearchBox.sendKeys(SearchText);
	Thread.sleep(2000);
	
	
	if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
	{
		test.log(LogStatus.PASS, "Searched item displayed when entering 3 Characters in Search Box");
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(1000);
		SelectRetailIteam_SearchBox.clear();
	}
	else
	{
		test.log(LogStatus.FAIL, "Searched item not displayed when entering 3 Characters in Search box");
		ut.FailedCaptureScreenshotAsBASE64();
		Thread.sleep(1000);
		SelectRetailIteam_SearchBox.clear();
	}}}
	
	catch(Exception k) {
		}
	}


@FindBy(xpath="//tbody/tr[1]/td[9]/div[2]/button/span[1]//mat-icon[@role='img'][normalize-space()='more_horiz']")
public WebElement ClickThreedots_RetailItem;

@FindBy(xpath="//*[@id=\"cdk-drop-list-9\"]/tbody/tr[1]/td[9]/div/button")
public WebElement ClickActivatetick_RetailItem;

@FindBy(xpath="//*[@class=\"cdk-overlay-pane\"]/div/div/button[1]/span[1]")
public WebElement ClickEdit_RetailItem;

@FindBy(xpath="//*[@class=\"cdk-overlay-pane\"]/div/div/button[3]/span[1]")
public WebElement ClickDelete_RetailItem;

@FindBy(xpath="//*[@class=\"cdk-overlay-pane\"]/div/div/button[2]/span[1]")
public WebElement ClickCopy_RetailItem;

public void SearchAndClickEditRetailItem(String Str) throws Exception
{
//	Thread.sleep(3000);
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//	wait.until(ExpectedConditions.elementToBeClickable(New_Retail_ItemBtn)).click();
//	
//	Thread.sleep(2000);
//	wait.until(ExpectedConditions.elementToBeClickable(cmp.ClickBackspace_Icon())).click();
	
	try {
	
		if (SelectRetailIteam_SearchBox.isEnabled())
		{
	Thread.sleep(2000);
	SelectRetailIteam_SearchBox.clear();
	Thread.sleep(2000);

	SelectRetailIteam_SearchBox.sendKeys(Str);
	Thread.sleep(2000);
	
	cmp.waitForPageToLoad();
	
	Thread.sleep(2000);
	ClickThreedots_RetailItem.click();
	test.log(LogStatus.PASS, "Clicked Threedots_Retail Item");
	ut.PassedCaptureScreenshotAsBASE64();
	Thread.sleep(2000);

	ClickEdit_RetailItem.click();
	test.log(LogStatus.PASS, "Clicked Edit Button_Retail Item");
	ut.PassedCaptureScreenshotAsBASE64();
	Thread.sleep(2000);
		} else {
			
		}}
		
		catch (Exception K) {
			
			SelectRetailIteam_SearchBox.clear();
			Thread.sleep(2000);
			
			Click_RetailItem_MenuBtn();
			
			cmp.waitForPageToLoad();
			
			List<WebElement> menuList1=driver.findElements(By.xpath("//tbody/tr/td[2]"));
			System.out.println("--------------------------- menu list : "+menuList1.size());
				
			if(menuList1.size()>1)
			{
				
				int menuSize=menuList1.size();
				
				int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
				System.out.println("--------------------------- menu listqqq : "+randomMenu);
				String SearchText=driver.findElement(By.xpath("//tbody/tr["+randomMenu+"]/td[2]")).getText().substring(0,3);
				
				System.out.println("--------------------------- menu listqqq : "+SearchText);
				Thread.sleep(1000);
				SelectRetailIteam_SearchBox.clear();
				Thread.sleep(2000);

				SelectRetailIteam_SearchBox.sendKeys(SearchText);
				test.log(LogStatus.PASS, "Retail Item search successful");
				ut.PassedCaptureScreenshotAsBASE64();
				
				cmp.waitForPageToLoad();
				
				Thread.sleep(2000);
				ClickThreedots_RetailItem.click();
				test.log(LogStatus.PASS, "Clicked Threedots_Retail Item");
				ut.PassedCaptureScreenshotAsBASE64();
				Thread.sleep(2000);

				ClickEdit_RetailItem.click();
				test.log(LogStatus.PASS, "Clicked Edit Button_Retail Item");
				ut.PassedCaptureScreenshotAsBASE64();
				Thread.sleep(2000);
				
				
			}
			else
			{
//				System.out.println("--------------------------- menu listsssssssss : ");
//				String SearchText=driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().substring(0,3);
//				
//				Thread.sleep(1000);
//				SelectRetailIteam_SearchBox.clear();
//				SelectRetailIteam_SearchBox.sendKeys(SearchText);
//				Thread.sleep(2000);
//				test.log(LogStatus.PASS, "Retail Item search successful");
//				ut.PassedCaptureScreenshotAsBASE64();}
//			
//			cmp.waitForPageToLoad();
//			
//			Thread.sleep(2000);
//			ClickThreedots_RetailItem.click();
//			test.log(LogStatus.PASS, "Clicked Threedots_Retail Item");
//			ut.PassedCaptureScreenshotAsBASE64();
//			Thread.sleep(2000);
//
//			ClickEdit_RetailItem.click();
//			test.log(LogStatus.PASS, "Clicked Edit Button_Retail Item");
//			ut.PassedCaptureScreenshotAsBASE64();
//			Thread.sleep(2000);
			
			
			}	
			
			
//		Thread.sleep(2000);
//		ClickThreedots_RetailItem.click();
//		test.log(LogStatus.PASS, "Clicked Threedots_Retail Item");
//		ut.PassedCaptureScreenshotAsBASE64();
//		Thread.sleep(2000);
//
//		ClickEdit_RetailItem.click();
//		test.log(LogStatus.PASS, "Clicked Edit Button_Retail Item");
//		ut.PassedCaptureScreenshotAsBASE64();
//		Thread.sleep(2000);
//		
//		cmp.waitForPageToLoad();
	
	} 
}
	

	public void Select_Categorydropdown_InventoryRetailInputBx() throws Exception
	{

		cmp=new Common_XPaths();
		Thread.sleep(1000);
		cmp.Click_Wait_ForElementClickable(Category_InventoryInputBx, 60);
		//cmp.scrollpagedown();
		Category_InventoryInputBx.click();
		Thread.sleep(1000);
		}

	
@FindBy(xpath="//*[@id='option-panel']/div[3]/button/span[1]")
public WebElement SelectNewInventoryCategory;
	
	public void ISelect_NewInventoryCategory_RetailItem() throws Exception
	{
		Thread.sleep(2000);
			try {
		
if (SelectNewInventoryCategory.isDisplayed()) {
	SelectNewInventoryCategory.click();
} else 
{
		cmp.Click_Wait_ForElementClickable(SelectNewInventoryCategory, 60);
			
		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//		wait.until(ExpectedConditions.elementToBeClickable(SelectNewInventoryCategory));
			
		SelectNewInventoryCategory.click(); }}

catch(Exception K) {
	
	cmp.scrollpagedown();
	cmp.Click_Wait_ForElementClickable(SelectNewInventoryCategory, 60);
	SelectNewInventoryCategory.click();
	
	
}
		
		}	


@FindBy(xpath="//label[contains(.,'Name')]/../../input")
public WebElement EnterNewCategoryName_RetailItem;

public void Enter_NewCategory_Name_inSecondaryScreen_RetailItem(String Str) throws Exception
{
	Thread.sleep(1000);
	EnterNewCategoryName_RetailItem.clear();
	Thread.sleep(1000);
	EnterNewCategoryName_RetailItem.sendKeys(Str);
}

@FindBy(xpath="//label[contains(.,'Code')]/../../input")
public WebElement EnterNewCategoryCode_RetailItem;

public void Enter_NewCategory_Code_inSecondaryScreen_RetailItem(String Str) throws Exception
{
	Thread.sleep(1000);
	EnterNewCategoryCode_RetailItem.clear();
	Thread.sleep(1000);
	EnterNewCategoryCode_RetailItem.sendKeys(Str);
}

@FindBy(xpath = "//*[@id=\"drawer-component\"]/div[3]/div[2]/button/span[2]")
WebElement SaveBtn_NewInventoryCategory_RetailItem;

public void ClickSaveBtn_NewInventoryCategory_RetailItem()
{
	SaveBtn_NewInventoryCategory_RetailItem.click();

if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("category saved successfully!."))
{
	test.log(LogStatus.PASS, "New Inventory category saved successfully!.");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "New Inventory category save failed!.");
	ut.FailedCaptureScreenshotAsBASE64();
}
}



public void Verify_NewInventoryCategory_SavedorNot() throws Exception
{
	cmp=new Common_XPaths();
	Thread.sleep(1000);
	
	Thread.sleep(4000);
	
	cmp.Click_Wait_ForElementClickable(Category_InventoryInputBx, 120);

	Category_InventoryInputBx.click();
		Thread.sleep(1000);
		
	driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(ut.getProperty("ProductRetailItem_NewInventoryCategoryName"));
	ut.PassedCaptureScreenshotAsBASE64();
	
	if(driver.findElement(By.xpath("//div[1]/select-option")).getText().equalsIgnoreCase(ut.getProperty("ProductRetailItem_NewInventoryCategoryName")))
	{
		test.log(LogStatus.PASS, "New Inventory category saved successfully!.");
		ut.PassedCaptureScreenshotAsBASE64();
	
	} else {
	
		test.log(LogStatus.FAIL, "New Inventory category save failed!.");
		ut.FailedCaptureScreenshotAsBASE64();
	}
}

@FindBy(xpath="//*[@id=\\\"option-panel\\\"]/div[3]/button")
public WebElement SelectInventoryNewvendorBtn_RetailItem;

//public void Select_InventoryNewVendor_RetailItem() throws Exception
//{
//	
//Thread.sleep(1000);
//	Vendor_RetailItemInputBx.click();
//	
//	Thread.sleep(1000);
//	
//	cmp.Click_Wait_ForElementClickable(SelectInventoryNewvendorBtn_RetailItem, 200);
//	
//	cmp.scrollpagedown();
//	
//	SelectInventoryNewvendorBtn_RetailItem.click();
//	
//}

public void Select_InventoryNewVendor_RetailItem() throws Exception
{
	Thread.sleep(2000);
	
		Vendor_RetailItemInputBx.click();	
Thread.sleep(1000);

		try {
	
if (SelectInventoryNewvendorBtn_RetailItem.isDisplayed()) {
SelectInventoryNewvendorBtn_RetailItem.click();
} else 
{
	cmp.Click_Wait_ForElementClickable(SelectInventoryNewvendorBtn_RetailItem, 60);
		
	Thread.sleep(2000);
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//	wait.until(ExpectedConditions.elementToBeClickable(SelectNewInventoryCategory));
		
	SelectInventoryNewvendorBtn_RetailItem.click(); }}

catch(Exception K) {

cmp.scrollpagedown();
cmp.Click_Wait_ForElementClickable(SelectInventoryNewvendorBtn_RetailItem, 60);
SelectInventoryNewvendorBtn_RetailItem.click();


}
	
	}	


@FindBy(xpath="//label[contains(.,'Name')]/../../input")
public WebElement EnterNewVendorName_RetailItem;

public void Enter_NewVendor_Name_inSecondaryScreen_RetailItem(String Str) throws Exception
{
	EnterNewVendorName_RetailItem.clear();
	EnterNewVendorName_RetailItem.sendKeys(Str);
}

@FindBy(xpath="//label[contains(.,'Phone Number')]/../../input")
public WebElement EnterNewVendorPhonenumber_RetailItem;

public void Enter_NewVendor_PhoneNumber_inSecondaryScreen_RetailItem(String Str) throws Exception
{
	
	EnterNewVendorPhonenumber_RetailItem.clear();
	EnterNewVendorPhonenumber_RetailItem.sendKeys(Str);
}

@FindBy(xpath="//label[contains(.,'Email')]/../../input")
public WebElement EnterNewVendorEmail_RetailItem;

public void Enter_NewVendor_Email_inSecondaryScreen_RetailItem(String Str) throws Exception
{
	
	EnterNewVendorEmail_RetailItem.clear();
	EnterNewVendorEmail_RetailItem.sendKeys(Str);
}

public void ClickSaveBtn_InventoryNewVendor_RetailItem()
{
	SaveBtn_NewInventoryCategory_RetailItem.click();

if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Vendor saved successfully"))
{
	test.log(LogStatus.PASS, "Inventory New vendor saved successfully!.");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "Inventory New vendor save failed!.");
	ut.FailedCaptureScreenshotAsBASE64();
}
}



public void Verify_InventoryNewVendor_SavedorNot() throws Exception
{
	
	cmp.Click_Wait_ForElementClickable(Vendor_RetailItemInputBx, 120);
	

	Vendor_RetailItemInputBx.click();
		Thread.sleep(1000);
		
	driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(ut.getProperty("ProductRetailItem_InventoryNewVendorName"));
	ut.PassedCaptureScreenshotAsBASE64();
	
	if(driver.findElement(By.xpath("//div[1]/select-option")).getText().equalsIgnoreCase(ut.getProperty("ProductRetailItem_InventoryNewVendorName")))
	{
		test.log(LogStatus.PASS, "Inventory New Vendor saved successfully!.");
		ut.PassedCaptureScreenshotAsBASE64();
	
	} else {
	
		test.log(LogStatus.FAIL, "Inventory New Venddor save failed!.");
		ut.FailedCaptureScreenshotAsBASE64();
	}
}

//@FindBy(xpath = "//button[contains(.,'RETAIL ITEMS')]")
//public WebElement Retail_Item_MenuBtn;
//
//public void Click_RetailItem_MenuBtn() throws Exception
//{
//	cmp=new Common_XPaths();
//	Thread.sleep(1000);
//	Retail_Item_MenuBtn.click();
//	Thread.sleep(2000);
//	cmp.waitForPageToLoad();
//}

@FindBy(xpath = "//*[@id=\"cdk-drop-list-21\"]//tr[@role='row'][contains(.,'Inventory Level not found')]")
public WebElement VerifyCurrentInventoryLevel;

public void iEnterTheCurrentInventoryInInventoryLevel() {
  
	try {
		if (VerifyCurrentInventoryLevel.isDisplayed()) {
			test.log(LogStatus.PASS, "Current Inventory Level not found");
			ut.PassedCaptureScreenshotAsBASE64();	
		}
		else {
			test.log(LogStatus.FAIL, "Current Inventory Level found");
			ut.FailedCaptureScreenshotAsBASE64();	
		}
	}
	catch(Exception E) {}
}

public void verify_the_RetailItem_Updated_or_not() throws Throwable {
	
	Thread.sleep(3000);
	//Check whether the New Department Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Retail item updated successfully"))
	{
		test.log(LogStatus.PASS, "Retail Item Updated Successfully");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Retail Item Updated Failed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}


public void verify_the_RetailItem_SAVED_or_not() throws Throwable {
	
	
	//Check whether the New Retail Item Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Retail item saved successfully"))
	{
		test.log(LogStatus.PASS, "Retail Item saved Successfully");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Retail Item save Failed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}


@FindBy(xpath = "//app-toggle[contains(.,'EBT Retail Item')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
public WebElement EBT_Retail_Item_YesBtn;
	

public WebElement Iclick_EBT_Retail_Item_YesBtn()
{
	return EBT_Retail_Item_YesBtn;
}

public void Iclick_EBTRetailItem_YesBtn() {

	EBT_Retail_Item_YesBtn.click();
}


@FindBy(xpath = "//app-toggle[contains(.,'EBT Retail Item')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
public WebElement Click_EBT_Retail_Item_NoBtn;
	

public WebElement EBT_Retail_Item_NoBtn()
{
	return Click_EBT_Retail_Item_NoBtn;
}

public void Iclick_EBTRetailItem_NoBtn() {

	EBT_Retail_Item_YesBtn.click();
}


@FindBy(xpath = "//button[contains(.,'UPDATE')]")
public WebElement Update_Btn_RetailItem;


public WebElement Click_Update_Button()
{
	return Update_Btn_RetailItem;
}

public void Click_Update_Button_RetailItem()
{
	Update_Btn_RetailItem.click();
}


public void checkTheUpdateButtonIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	if(Click_Update_Button().isEnabled())
    {
    	test.log(LogStatus.PASS, "Update  button is Enabled");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(true, cmp.Update_and_PublishButton().isEnabled());
    }
    else
    {
    	test.log(LogStatus.FAIL, "Update button is Disabled");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(false, cmp.Update_and_PublishButton().isEnabled());
    	
    }
}

public void checkTheUpdateButtonIsDisabled() {
    
	if(Click_Update_Button().isEnabled())
    {
    	test.log(LogStatus.FAIL, "Update button is Enabled");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    }
    else
    {
    	test.log(LogStatus.PASS, "Update button is Disabled");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(false, cmp.Update_and_PublishButton().isEnabled());
    }
}

//public void iSearchTheRetailItemAndClickTheDeleteButton() throws Exception {
//    // Write code here that turns the phrase above into concrete actions
//	  cmp.SearchAndClickDelete(Utility.getProperty("Product_Retail_Items_Name1"));
//	      Thread.sleep(500);
//		//Click the Delete button
//		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
//}

public void verifyTheCancelledRetailItemDeletedInactivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Verify_Search(ut.getProperty("Product_Retail_Items_Name1"));
	 
}

public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedCRetailItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Enable the Inactive Status
	cmp.Click_ActivetoInactiveButton();
	
	//Check whether the Inactive screen opened or not
	cmp.VerifyActive_InactiveStatus("Inactive");
	
	Thread.sleep(3000);
	cmp.Verify_Search(Utility.getProperty("Product_Retail_Items_Name1"));
}

//public void iSearchTheRetailItemAndClickTheActiveButton() throws Exception {
//    // Write code here that turns the phrase above into concrete actions
//	//Search and Activate the In activated item
//	cmp.SearchAndClickActivate(Utility.getProperty("Product_Retail_Items_Name2"));
//	
//	Thread.sleep(1500);
//	//Click the Delete button
//	cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
//}

public void verifyTheCancelledRetailItemIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	Thread.sleep(3000);
	
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Retail Item Activated Successfully"))
	{
		test.log(LogStatus.FAIL, "Retail Item Activated when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Retail Item not Activated when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedRetailItem(String Str) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	//Verify whether the Category activated or not
	cmp.Verify_Search(Utility.getProperty(Str));
}


	@FindBy(xpath = "//mat-step-header[contains(.,'Child')]")
	public WebElement ChildTab;
	
	public void Click_ChildTab()
	{
		ChildTab.click();
	}

	
	

//public void SearchAndClickCopy_RetailItemPage(String SearchValue) throws Exception
//{
//	cmp.Wait_ForElementVisibility(SearchBox, 180);
//
//	Thread.sleep(1000);
//	SearchBox.clear();
//	Thread.sleep(2000);
//	SearchBox.sendKeys(SearchValue);
//	
//	Thread.sleep(2000);
//	try
//	{
//
//		cmp.Wait_ForElementVisibility(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")), 50);
//		driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")).click();
//	
//		
//	}
//	catch(Exception g)
//	{
//		
//		cmp.Wait_ForElementVisibility(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")), 40);
//		driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]/..//button[@aria-label='Actions']")).click();
//	
//	}
//	Thread.sleep(1000);
//	Copy_OptionBtn.click();
//	
//}


public void verify_POSCategory_Subcategory_SelectedorNot() {
	
	try 
	{
		if (Category_InputBx.isSelected() && SubCategory_InputBx.isSelected()) 
		{
			
			test.log(LogStatus.INFO, "POS Category selected");
			ut.PassedCaptureScreenshotAsBASE64();
			
			SubCategory_InputBx.isSelected();
			test.log(LogStatus.INFO, "POS Sub Category also selected");
			ut.PassedCaptureScreenshotAsBASE64();
			
		} 
		else if (Category_InputBx.isSelected() || SubCategory_InputBx.isSelected())
		
		{
			test.log(LogStatus.INFO, "POS Category or Sub category selected");
			ut.PassedCaptureScreenshotAsBASE64();
		} 
		
	}
		
catch (Exception K) { 
	test.log(LogStatus.FAIL, "POS Category or Sub category NOT selected");
	ut.FailedCaptureScreenshotAsBASE64();
	}

}

@FindBy(xpath = "//button[@aria-label='UnLink']")
public WebElement UnlinkChildRetailItem;

@FindBy(xpath = "//button[@aria-label='delete']")
public WebElement DeleteChildRetailItem;

@FindBy(xpath="//div/button//mat-icon[@role='img'][normalize-space()='more_horiz']")
public WebElement ClickThreedots_RetailItem_Child;

public void Click_Unlink_Child_RetailItem() throws Exception
{

	
		Thread.sleep(2000);
		ClickThreedots_RetailItem_Child.click();
		test.log(LogStatus.PASS, "Clicked Threedots_Retail Item_Child");
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(2000);

		UnlinkChildRetailItem.click();
		test.log(LogStatus.PASS, "Clicked Unlink Button_Retail Item Child");
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(2000);
		
	
	} {
}
	
	public void Click_Delete_Child_RetailItem() throws Exception
	{

		cmp=new Common_XPaths();
		Thread.sleep(1000);
		cmp.Click_Wait_ForElementClickable(ClickThreedots_RetailItem_Child, 60);
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.elementToBeClickable(ClickThreedots_RetailItem_Child));
						
			ClickThreedots_RetailItem_Child.click();
			test.log(LogStatus.PASS, "Clicked Threedots_Retail Item_Child");
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(2000);

			DeleteChildRetailItem.click();
			test.log(LogStatus.PASS, "Clicked Delete Button_Retail Item Child");
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(2000);
		
		} {
	}

		
		public void SearchAndClickDeleteRetailItem(String Str) throws Exception
		{

			try {
			
				if (SelectRetailIteam_SearchBox.isEnabled())
				{
			Thread.sleep(2000);
			SelectRetailIteam_SearchBox.clear();
			Thread.sleep(2000);

			SelectRetailIteam_SearchBox.sendKeys(Str);
			Thread.sleep(2000);
				} else {
					
				}}
				
				catch (Exception K) {
					
					List<WebElement> menuList1=driver.findElements(By.xpath("//tbody/tr/td[2]"));
					System.out.println("--------------------------- menu list : "+menuList1.size());
						
					if(menuList1.size()>1)
					{
						
						int menuSize=menuList1.size();
						
						int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
						System.out.println("--------------------------- menu listqqq : "+randomMenu);
						String SearchText=driver.findElement(By.xpath("//tbody/tr["+randomMenu+"]/td[2]")).getText().substring(0,3);
						
						System.out.println("--------------------------- menu listqqq : "+SearchText);
						Thread.sleep(1000);
						SelectRetailIteam_SearchBox.clear();
						Thread.sleep(2000);

						SelectRetailIteam_SearchBox.sendKeys(SearchText);
						test.log(LogStatus.PASS, "Retail Item search successful");
						ut.PassedCaptureScreenshotAsBASE64();
					}
					else
					{
						System.out.println("--------------------------- menu listsssssssss : ");
						String SearchText=driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().substring(0,3);
						
						Thread.sleep(1000);
						SelectRetailIteam_SearchBox.clear();
						SelectRetailIteam_SearchBox.sendKeys(SearchText);
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Retail Item search successful");
						ut.PassedCaptureScreenshotAsBASE64();}
					
					}	
					
					
				Thread.sleep(2000);
				ClickThreedots_RetailItem.click();
				test.log(LogStatus.PASS, "Clicked Threedots_Retail Item");
				ut.PassedCaptureScreenshotAsBASE64();
				Thread.sleep(2000);

				ClickDelete_RetailItem.click();
				test.log(LogStatus.PASS, "Clicked Delete Button_Retail Item");
				ut.PassedCaptureScreenshotAsBASE64();
				Thread.sleep(2000);
				
				cmp.waitForPageToLoad();
			
			} {
		}
		
	
			public void SearchAndClickCopyRetailItem(String Str) throws Exception
			{

				try {
				
					if (SelectRetailIteam_SearchBox.isEnabled())
					{
				Thread.sleep(2000);
				SelectRetailIteam_SearchBox.clear();
				Thread.sleep(2000);

				SelectRetailIteam_SearchBox.sendKeys(Str);
				Thread.sleep(2000);
					} else {
						
					}}
					
					catch (Exception K) {
						
						List<WebElement> menuList1=driver.findElements(By.xpath("//tbody/tr/td[2]"));
						System.out.println("--------------------------- menu list : "+menuList1.size());
							
						if(menuList1.size()>1)
						{
							
							int menuSize=menuList1.size();
							
							int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
							System.out.println("--------------------------- menu listqqq : "+randomMenu);
							String SearchText=driver.findElement(By.xpath("//tbody/tr["+randomMenu+"]/td[2]")).getText().substring(0,3);
							
							System.out.println("--------------------------- menu listqqq : "+SearchText);
							Thread.sleep(1000);
							SelectRetailIteam_SearchBox.clear();
							Thread.sleep(2000);

							SelectRetailIteam_SearchBox.sendKeys(SearchText);
							test.log(LogStatus.PASS, "Retail Item search successful");
							ut.PassedCaptureScreenshotAsBASE64();
						}
						else
						{
							System.out.println("--------------------------- menu listsssssssss : ");
							String SearchText=driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().substring(0,3);
							
							Thread.sleep(1000);
							SelectRetailIteam_SearchBox.clear();
							SelectRetailIteam_SearchBox.sendKeys(SearchText);
							Thread.sleep(2000);
							test.log(LogStatus.PASS, "Retail Item search successful");
							ut.PassedCaptureScreenshotAsBASE64();}
						
						}	
						
						
					Thread.sleep(2000);
					ClickThreedots_RetailItem.click();
					test.log(LogStatus.PASS, "Clicked Threedots_Retail Item");
					ut.PassedCaptureScreenshotAsBASE64();
					Thread.sleep(2000);

					ClickCopy_RetailItem.click();
					test.log(LogStatus.PASS, "Clicked Edit Button_Retail Item");
					ut.PassedCaptureScreenshotAsBASE64();
					Thread.sleep(2000);
					
					cmp.waitForPageToLoad();
				
				} {
			}
			

@FindBy(xpath = "//*[@id='menuItem-datagrid']/div/div/div/div[1]/button/span[3]")
public WebElement ClickActiveRetailItem;

public void IClickActiveRetailItem_Btn() {
	
	cmp.Click_Wait_ForElementClickable(ClickActiveRetailItem, 30);
	ClickActiveRetailItem.click();
}


				
public void SearchAndClickActiveRetailItemBtn(String Str) throws Exception
				{

					try {
					
						if (SelectRetailIteam_SearchBox.isEnabled())
						{
					Thread.sleep(2000);
					SelectRetailIteam_SearchBox.clear();
					Thread.sleep(2000);

					SelectRetailIteam_SearchBox.sendKeys(Str);
					Thread.sleep(2000);
						} else {
							
						}}
						
						catch (Exception K) {
							
							List<WebElement> menuList1=driver.findElements(By.xpath("//tbody/tr/td[2]"));
							System.out.println("--------------------------- menu list : "+menuList1.size());
								
							if(menuList1.size()>1)
							{
								
								int menuSize=menuList1.size();
								
								int randomMenu=ThreadLocalRandom.current().nextInt(1, menuSize);
								System.out.println("--------------------------- menu listqqq : "+randomMenu);
								String SearchText=driver.findElement(By.xpath("//tbody/tr["+randomMenu+"]/td[2]")).getText().substring(0,3);
								
								System.out.println("--------------------------- menu listqqq : "+SearchText);
								Thread.sleep(1000);
								SelectRetailIteam_SearchBox.clear();
								Thread.sleep(2000);

								SelectRetailIteam_SearchBox.sendKeys(SearchText);
								test.log(LogStatus.PASS, "Retail Item search successful");
								ut.PassedCaptureScreenshotAsBASE64();
							}
							else
							{
								System.out.println("--------------------------- menu listsssssssss : ");
								String SearchText=driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().substring(0,3);
								
								Thread.sleep(1000);
								SelectRetailIteam_SearchBox.clear();
								SelectRetailIteam_SearchBox.sendKeys(SearchText);
								Thread.sleep(2000);
								test.log(LogStatus.PASS, "Retail Item search successful");
								ut.PassedCaptureScreenshotAsBASE64();}
							
							}	
							
							
						Thread.sleep(2000);
						ClickActivatetick_RetailItem.click();
						test.log(LogStatus.PASS, "Clicked Activate Tick Retail Item");
						ut.PassedCaptureScreenshotAsBASE64();
						Thread.sleep(2000);

						
						cmp.waitForPageToLoad();
					
					} {
				}
				
				


}
