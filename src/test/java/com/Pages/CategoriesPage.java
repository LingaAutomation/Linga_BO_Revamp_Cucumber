package com.Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

public class CategoriesPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Utility ut=new Utility();
	Common_XPaths cmp=new Common_XPaths();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	TaxesPage tx=new TaxesPage();
//	public CategoriesPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW CATEGORY')]")
	WebElement New_CategoryBtn;
	
	@FindBy(xpath = "//label[contains(.,'Department')]/../../input")
	WebElement DepartmentDropBtn;
	
	@FindBy(xpath = "//label[contains(.,'Coursing')]/../../input")
	WebElement CoursingDropBtn;
	
	@FindBy(xpath = "//label[contains(.,'Serving Size Level')]/../..//div/input")
	WebElement ServingSizeLevelDropBtn;
	
	@FindBy(xpath = "//label[contains(.,'Tare Group')]/../../input")
	WebElement TareGroupDropBtn;
	
	@FindBy(xpath = "//button[contains(.,'New Tax')]")
	WebElement New_Tax_Btn_SecondaryScreen;
	
	@FindBy(xpath = "//h3[contains(.,'New Tax')]/../../..//label[contains(.,'Name')]/../../input")
	WebElement New_TaxNameInput_SecondaryScreen;
	
	@FindBy(xpath = "//label[contains(.,'Item Service Charge')]/../../input")
	WebElement ItemServiceChargeDropBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In POS')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Hide_In_POS_YesBtn;
	//span[contains(.,'Hide in POS')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In POS')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Hide_In_POS_NoBtn;
	//span[contains(.,'Hide in POS')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In Online Order')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Hide_In_OnlineOrder_YesBtn;
	//span[contains(.,'Hide in Online Order')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]
		
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In Online Order')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Hide_In_OnlineOrder_NoBtn;
	//span[contains(.,'Hide in Online Order')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In Kiosk')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Hide_In_Kiosk_YesBtn;
	//span[contains(.,'Hide in Kiosk')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]
		
	@FindBy(xpath = "//app-toggle[contains(.,'Hide In Kiosk')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Hide_In_Kiosk_NoBtn;
	//span[contains(.,'Hide in Kiosk')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]
	
	@FindBy(xpath = "//app-toggle[contains(.,'Conversational')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Conversational_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Conversational')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Conversational_NoBtn;
	
	
	@FindBy(xpath = "//app-toggle[contains(.,'Enable Age Restriction')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Enable_Age_Restriction_YesBtn;
	

	@FindBy(xpath = "//app-toggle[contains(.,'Enable Age Restriction')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Enable_Age_Restriction_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Exclude Check Tax')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Exclude_Check_Tax_YesBtn;
	

	@FindBy(xpath = "//app-toggle[contains(.,'Exclude Check Tax')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Exclude_Check_Tax_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Exclude Check Tax')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Exclude_Gratuity_YesBtn;
	

	@FindBy(xpath = "//app-toggle[contains(.,'Exclude Check Tax')]//mat-button-toggle/button[contains(.,'No')]")
	public WebElement Exclude_Gratuity_NoBtn;
	
	@FindBy(xpath="//div[contains(@id,'kitchen-printers')]//app-chip/div/mat-chip-list/div/mat-chip[1]")
	WebElement KitchenPrinter;
	
	@FindBy(xpath="//div[contains(@id,'label-printers')]//app-chip/div/mat-chip-list/div/mat-chip[1]")
	WebElement LabelPrinter;
	
	@FindBy(xpath="//div[contains(@id,'restrict-printers')]//app-chip/div/mat-chip-list/div/mat-chip[1]")
	WebElement RestrictPrinter;
	
	@FindBy(xpath="//div[contains(@id,'restrict-printers')]//app-chip/div/mat-chip-list/div/mat-chip[1]")
	WebElement Taxes;
	
	@FindBy(xpath="//mat-slide-toggle[contains(.,'Inherit Default Tax')]")
	public WebElement Inherit_Default_Tax_ToggleBtn;
	
	
	
	public void Click_NewCategory() throws Exception
	{
		cmp.Click_Wait_ForElementClickable(New_CategoryBtn, 120);
		Thread.sleep(1000);
		New_CategoryBtn.click();
	}
	
	public void Enable_Inherit_DefaultTaxSettings() throws Exception
	{
		Thread.sleep(1000);
		if(Inherit_Default_Tax_ToggleBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.DOWN);
//			Thread.sleep(1000);
			Inherit_Default_Tax_ToggleBtn.click();
		}
	}
	
	public void Disable_Inherit_DefaultTaxSettings() throws Exception
	{
		Thread.sleep(1000);
		if(Inherit_Default_Tax_ToggleBtn.isSelected())
		{
			Thread.sleep(2000);
			Inherit_Default_Tax_ToggleBtn.click();
		}
		else
		{
			
		}
	}
	
	
	public void Enable_Hide_In_POS_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Hide_In_POS_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			Hide_In_POS_YesBtn.click();
		}
	}
	
	
	public void Enable_Hide_In_OnlineOrder_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Hide_In_OnlineOrder_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			Hide_In_OnlineOrder_YesBtn.click();
		}
	}
	
	public void Enable_Hide_In_Kiosk_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Hide_In_Kiosk_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			Hide_In_Kiosk_YesBtn.click();
		}
	}
	
	public void Enable_Conversational_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Conversational_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			Conversational_YesBtn.click();
		}
	}
	
	public void Disable_Hide_In_POS_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Hide_In_POS_YesBtn.isSelected())
		{
			Thread.sleep(2000);
			Hide_In_POS_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Exclude_Gratuity_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Exclude_Gratuity_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			Exclude_Gratuity_YesBtn.click();
		}
	}
	
	public void Disable_Exclude_Gratuity_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Exclude_Gratuity_YesBtn.isSelected())
		{
			Thread.sleep(2000);
			Exclude_Gratuity_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	
	public void Disable_Hide_In_OnlineOrder_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Hide_In_OnlineOrder_YesBtn.isSelected())
		{
			Thread.sleep(2000);
			Hide_In_OnlineOrder_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Disable_Hide_In_Kiosk_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Hide_In_Kiosk_YesBtn.isSelected())
		{
			Thread.sleep(2000);
			Hide_In_Kiosk_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Disable_Conversational_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Conversational_YesBtn.isSelected())
		{
			Thread.sleep(2000);
			Conversational_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Age_Restriction_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Enable_Age_Restriction_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			Enable_Age_Restriction_YesBtn.click();
		}
	}
	
	public void Enable_Exclude_Check_Tax_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Exclude_Check_Tax_YesBtn.isSelected())
		{
			
		}
		else
		{
			Thread.sleep(2000);
			Exclude_Check_Tax_YesBtn.click();
		}
	}
	
	public void Disable_Age_Restriction_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Enable_Age_Restriction_YesBtn.isSelected())
		{
			Thread.sleep(2000);
			Enable_Age_Restriction_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public void Disable_Exclude_Check_Tax_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Exclude_Check_Tax_YesBtn.isSelected())
		{
			Thread.sleep(2000);
			Exclude_Check_Tax_NoBtn.click();
		}
		else
		{
			
		}
	}
	
	
	
	
	public void Select_KitchenPrinter() throws Exception
	{
//		KitchenPrinter.click();
		Thread.sleep(1000);
		cmp.Kitchen_Printers_Tab_inContents.click();
		
		Thread.sleep(1000);
		List<WebElement> courseList=driver.findElements(By.xpath("//div[contains(@id,'kitchen-printers')]//app-chip/div/mat-chip-list/div/mat-chip"));
		
		int courseSize=courseList.size();
		
		
		int randomCoursing=ThreadLocalRandom.current().nextInt(1, courseSize);
		
		if(courseSize>=1)
		{
		try
		{
		if(ShowAll_Select_KitchenPrintersBtn.isDisplayed())
		{
		Thread.sleep(1000);
		ShowAll_Select_KitchenPrintersBtn.click();
		}
		}
		catch(Exception l) {}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id,'kitchen-printers')]//app-chip/div/mat-chip-list/div/mat-chip["+randomCoursing+"]")).click();
		}
		else
		{
			test.log(LogStatus.INFO, "Kitchen Printers Not available");
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Select_LabelPrinter() throws Exception
	{
//		LabelPrinter.click();
		Thread.sleep(1000);
		cmp.Label_Printers_Tab_inContents.click();
		
		Thread.sleep(1000);
	List<WebElement> courseList=driver.findElements(By.xpath("//div[contains(@id,'label-printers')]//app-chip/div/mat-chip-list/div/mat-chip"));
		
		int courseSize=courseList.size();
		
		
		int randomCoursing=ThreadLocalRandom.current().nextInt(1, courseSize);
		
		if(courseSize>=1)
		{
		try
		{
		if(ShowAll_Select_LabelPrintersBtn.isDisplayed())
		{
			Thread.sleep(1000);
			ShowAll_Select_LabelPrintersBtn.click();
		}
		}
		catch(Exception l) {}
			
			Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id,'label-printers')]//app-chip/div/mat-chip-list/div/mat-chip["+randomCoursing+"]")).click();
		}
		else
		{
			test.log(LogStatus.INFO, "Label Printers Not available");
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@FindBy(xpath = "//h5[contains(.,'Tax')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_Select_TaxBtn;
	
	@FindBy(xpath = "//h5[contains(.,'Kitchen Printers')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_Select_KitchenPrintersBtn;
	
	@FindBy(xpath = "//h5[contains(.,'Label Printers')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_Select_LabelPrintersBtn;
	
	@FindBy(xpath = "//h5[contains(.,'Restrict Printers')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_Select_RestrictPrintersBtn;
	
	
	public void Select_Taxes() throws Exception
	{
//		Taxes.click();
		Thread.sleep(1000);
		cmp.Tax_Tab_inContents.click();
		
		Thread.sleep(1000);
		List<WebElement> courseList=driver.findElements(By.xpath("//div[contains(@id,'tax')]//app-chip/div/mat-chip-list/div/mat-chip"));
		
		int courseSize=courseList.size();
		
		
		int randomCoursing=ThreadLocalRandom.current().nextInt(1, courseSize);
		
		if(courseSize>=1)
		{
		try
		{
		Thread.sleep(1000);
		if(ShowAll_Select_TaxBtn.isDisplayed())
		{
			Thread.sleep(1000);
			ShowAll_Select_TaxBtn.click();
		}
		}
		catch(Exception l) {}
		
		
			Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id,'tax')]//app-chip/div/mat-chip-list/div/mat-chip["+randomCoursing+"]")).click();
		
	}
	else
	{
		test.log(LogStatus.INFO, "Taxes Not available");
		ut.PassedCaptureScreenshotAsBASE64();
	}
	}
	
	public void Select_RestrictPrinter() throws Exception
	{
//		RestrictPrinter.click();
		Thread.sleep(1000);
		cmp.Restrict_Printers_Tab_inContents.click();
		Thread.sleep(1000);
		
	List<WebElement> courseList=driver.findElements(By.xpath("//div[contains(@id,'restrict-printers')]//app-chip/div/mat-chip-list/div/mat-chip"));
		
		int courseSize=courseList.size();
		
		
		int randomCoursing=ThreadLocalRandom.current().nextInt(1, courseSize);
		
		if(courseSize>=1)
		{
		try
		{
		if(ShowAll_Select_RestrictPrintersBtn.isDisplayed())
		{
			Thread.sleep(1000);
			ShowAll_Select_RestrictPrintersBtn.click();
		}
		}
		catch(Exception p) {}
		
			Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id,'restrict-printers')]//app-chip/div/mat-chip-list/div/mat-chip["+randomCoursing+"]")).click();
		}
		else
		{
			test.log(LogStatus.INFO, "Restrict Printers Not available");
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
//	public void Disable_DefaultTaxSettings()
//	{
//		if(DefaultTaxSetting_ToggleBtn.isSelected())
//		{
//			DefaultTaxSetting_ToggleBtn.click();	
//		}
//		else
//		{
//			
//		}
//	}
	
	public void Select_Department() throws Exception
	{
		Thread.sleep(2000);
//		//cmp=new Common_XPaths();
		
		cmp.Genaral_Tab_inContents.click();
		
		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(DepartmentDropBtn);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//		wait.until(ExpectedConditions.elementToBeClickable(DepartmentDropBtn));
//		for(int i=1;i<=3;i++)
//		{
//			Thread.sleep(1000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//		}
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		
		Thread.sleep(1000);
		wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		
		cmp.Click_DropDown_withSearch(DepartmentDropBtn, "Department selected");
		
//		DepartmentDropBtn.click();
//		wait.until(ExpectedConditions.elementToBeClickable(DepartmentDropBtn)).click();
//		
////		try
////		{
//		Thread.sleep(1000);
//		List<WebElement> departList=driver.findElements(By.xpath("//div/select-option"));
//		
//		int deptSize=departList.size();
//		
//		
//		int randomDept=ThreadLocalRandom.current().nextInt(1, deptSize);
//		
//		
//		driver.findElement(By.xpath("//div["+randomDept+"]/select-option")).click();
////		}
////		catch(Exception e)
////		{
////			cmp.FirstOption_DropBtn.click();
////		}
	
	}
	
	public void Select_Coursing() throws Exception
	{
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(2000);
//		cmp.Cursor_MoveToElement(CoursingDropBtn);
//		wait.until(ExpectedConditions.elementToBeClickable(CoursingDropBtn));
		
//		for(int i=1;i<=3;i++)
//		{
//			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//		}
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		
		Thread.sleep(2000);
		wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		
		
		Thread.sleep(2000);
		cmp.Click_DropDown_withSearch(CoursingDropBtn, "Coursing Selected");
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(CoursingDropBtn)).click();
//		CoursingDropBtn.click();
		
//		List<WebElement> courseList=driver.findElements(By.xpath("//div/select-option"));
//		
//		int courseSize=courseList.size();
//		
//		if(courseSize<=6)
//		{
//		
//		int randomCoursing=ThreadLocalRandom.current().nextInt(1, courseSize);
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
//		}
//		else
//		{
//			int randomCoursing=ThreadLocalRandom.current().nextInt(1, 6);
//			
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div["+randomCoursing+"]/select-option")).click();
//		
//		}
	
	}
	
	public void Select_ServingSizeLevel() throws Exception
	{
//		//cmp=new Common_XPaths();
		Thread.sleep(2000);
		cmp.Genaral_Tab_inContents.click();
//		cmp.Cursor_MoveToElement(ServingSizeLevelDropBtn);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//		for(int i=1;i<=3;i++)
//		{
//			Thread.sleep(2000);
////			driver.findElement(By.tagName("html")).sendKeys(Keys.ENTER);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//		}
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		
		Thread.sleep(2000);
		wait=new WebDriverWait(driver, Duration.ofSeconds(120));
	
		wait.until(ExpectedConditions.elementToBeClickable(ServingSizeLevelDropBtn)).click();
		
//		ServingSizeLevelDropBtn.click();
		Thread.sleep(2000);
		
		List<WebElement> ServSizeLvlList=driver.findElements(By.xpath("//div/select-option"));
		
		int ServSizeLvl=ServSizeLvlList.size();
		
		
		
		if(ServSizeLvl>1&&ServSizeLvl<=6)
		{
			Thread.sleep(2000);
			int randomServSizeLvl=ThreadLocalRandom.current().nextInt(2, ServSizeLvl);

//			ServingSizeLevelDropBtn.click();
			
			if(driver.findElement(By.xpath("//div["+ServSizeLvl+"]/select-option")).isSelected())
			{
				
			}
			else
			{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div["+ServSizeLvl+"]/select-option")).click();
			}
		}
		else if(ServSizeLvl==1)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[1]/select-option")).click();
		}
		else if(ServSizeLvl>6)
		{
			int randomServSizeLvl1=ThreadLocalRandom.current().nextInt(2, 6);
			driver.findElement(By.xpath("//div["+randomServSizeLvl1+"]/select-option")).click();

		}
	
		List<WebElement> ServSizeLvlList1=driver.findElements(By.xpath("//div/select-option"));

		if(ServSizeLvlList1.size()!=0)
		{
			ServingSizeLevelDropBtn.click();
		}
	}
	
	@FindBy(xpath = "//h5[contains(.,'Roles')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_Select_RolesBtn;
	
	@FindBy(xpath = "//h5[contains(.,'Visibility')]/../../..//button[contains(.,'Show All')]")
	WebElement ShowAll_Select_Roles_inVisibilityBtn;
	
	public void Select_Roles() throws Exception
	{
		
//		cmp.Cursor_MoveToElement(driver.findElement(By.xpath("//h5[.='Roles']")));
		Thread.sleep(2000);
		cmp.Roles_Tab_inContents.click();
		Thread.sleep(2000);
		
//		for(int i=1;i<=2;i++)
//		{
//			Thread.sleep(1000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//		}
//		
		
		Thread.sleep(1000);
		List<WebElement> rolesList=driver.findElements(By.xpath("//app-chip[contains(@name,'role')]/div/mat-chip-list/div/mat-chip"));
		
		
		
		
		int rolesSize=rolesList.size();
		
		
		int randomRole=ThreadLocalRandom.current().nextInt(1, rolesSize);
		
		if(rolesSize>=1)
		{
		try
		{
		if(ShowAll_Select_RolesBtn.isDisplayed())
		{
//			cmp.Cursor_MoveToElement(ShowAll_Select_RolesBtn);
			Thread.sleep(1000);
			ShowAll_Select_RolesBtn.click();
			
		}
		
		}
		catch(Exception l) {}
		
		try
		{
			if(ShowAll_Select_Roles_inVisibilityBtn.isDisplayed())
			{
				Thread.sleep(1000);
				ShowAll_Select_Roles_inVisibilityBtn.click();
			}
		}
		catch (Exception k) {
			// TODO: handle exception
		}
		
		
//		cmp.Cursor_MoveToElement(driver.findElement(By.xpath("//app-chip[contains(@name,'role')]/div/mat-chip-list/div/mat-chip["+randomRole+"]")));
			Thread.sleep(1000);
		driver.findElement(By.xpath("//app-chip[contains(@name,'role')]/div/mat-chip-list/div/mat-chip["+randomRole+"]")).click();
	
		//driver.findElement(By.xpath("//app-chip[contains(@name,'role')]/div/mat-chip-list/div/mat-chip[contains(.,'"+str+"')]")).click();
		}
		else
		{
			test.log(LogStatus.WARNING, "Roles not available");
		}
	}
	
	public void Select_TareGroup() throws Exception
	{
		//cmp=new Common_XPaths();
		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(TareGroupDropBtn);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.UP);
		Thread.sleep(1000);
		cmp.Tare_Group_Tab_inContents.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		
		cmp.Click_DropDown_withSearch(TareGroupDropBtn, "Tare Group Selected");
		
//		TareGroupDropBtn.click();
//		wait.until(ExpectedConditions.elementToBeClickable(TareGroupDropBtn)).click();
//		
//		Thread.sleep(1000);
//		List<WebElement> tareGrpList=driver.findElements(By.xpath("//div/select-option"));
//		
//		int tareGrpSize=tareGrpList.size();
//		
//		
//		int randomTareGrp=ThreadLocalRandom.current().nextInt(1, tareGrpSize);
//		
//		
//		driver.findElement(By.xpath("//div["+randomTareGrp+"]/select-option")).click();
//		
//	
	}
	
	public void Click_New_Tax_Btn_SecondaryScreen() throws Exception
	{
		
//		cmp.Cursor_MoveToElement(ItemServiceChargeDropBtn);
		Thread.sleep(1000);
		cmp.Tax_Tab_inContents.click();
		Thread.sleep(1000);
		New_Tax_Btn_SecondaryScreen.click();
	}
	
	public void Enter_Tax_Name_inSecondaryScreen(String str) throws Exception
	{
		try
		{
		New_TaxNameInput_SecondaryScreen.clear();
		Thread.sleep(500);
		New_TaxNameInput_SecondaryScreen.sendKeys(str);
		}
		catch(Exception u)
		{
			driver.findElement(By.xpath("//h3[contains(.,'NEW TAX')]/../../..//label[contains(.,'Name')]/../../input")).clear();
			Thread.sleep(500);
			driver.findElement(By.xpath("//h3[contains(.,'NEW TAX')]/../../..//label[contains(.,'Name')]/../../input")).sendKeys(str);
			
		}
	}
	
	public void Create_Category_NewTax(String str) throws Exception
	{
		//cmp=new Common_XPaths();
		tx=new TaxesPage();
		Thread.sleep(1000);
		New_Tax_Btn_SecondaryScreen.click();
		
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
		try
		{
		New_TaxNameInput_SecondaryScreen.clear();
		Thread.sleep(500);
		New_TaxNameInput_SecondaryScreen.sendKeys(str);
		}
		catch(Exception u)
		{
			driver.findElement(By.xpath("//h3[contains(.,'NEW TAX')]/../../..//label[contains(.,'Name')]/../../input")).clear();
			Thread.sleep(500);
			driver.findElement(By.xpath("//h3[contains(.,'NEW TAX')]/../../..//label[contains(.,'Name')]/../../input")).sendKeys(str);
			
		}
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
		
		Thread.sleep(3000);
		cmp.Click_SaveButton();
		
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 50);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Tax Saved Successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Saved Failed");
		}
	}
	
	
	public void Select_ItemServiceCharge() throws Exception
	{
		//cmp=new Common_XPaths();
		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(ItemServiceChargeDropBtn);
		Thread.sleep(1000);
		cmp.Item_Service_Charge_Tab_inContents.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		wait=new WebDriverWait(driver, Duration.ofSeconds(120));
	
//		ItemServiceChargeDropBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(ItemServiceChargeDropBtn)).click();
		
		Thread.sleep(1000);
		
		List<WebElement> itemServChargeList=driver.findElements(By.xpath("//div/select-option"));
		
		int itemServChargeSize=itemServChargeList.size();
		
		if(itemServChargeSize<=6)
		{
		int randomItemServCharge=ThreadLocalRandom.current().nextInt(1, itemServChargeSize);
		
		
		driver.findElement(By.xpath("//div["+randomItemServCharge+"]/select-option")).click();
		}
		else
		{
			int randomItemServCharge=ThreadLocalRandom.current().nextInt(1, 6);
			
			
			driver.findElement(By.xpath("//div["+randomItemServCharge+"]/select-option")).click();
		
		}
		
		
		List<WebElement> itemServChargeList1=driver.findElements(By.xpath("//div/select-option"));

		if(itemServChargeList1.size()!=0)
		{
			Thread.sleep(1000);
			ItemServiceChargeDropBtn.click();
		}
	
	}
	//app-selectbox[@label='Item Service Charge']/div/mat-form-field/div/div/div[3]/input
	
	
	@FindBy(xpath = "//button[contains(.,'New Kitchen Printer')]")
	WebElement New_Kitchen_PrinterBtn;
	
	
	@FindBy(xpath = "//th[.=' Name ']/div")
	WebElement Category_Name;

	public void Sorting_CategoryName() throws Exception 
	{
		Utility ut= new Utility();

		ArrayList<String> ArLst=new ArrayList<String>();
		List<WebElement> Before_sort = driver.findElements(By.xpath("//tbody/tr/td[2]/span"));

		for(WebElement CategoryName_Beforesort : Before_sort)
		{
			ArLst.add(CategoryName_Beforesort.getText());
		}
		System.out.println(ArLst);

		Category_Name.click();
		Thread.sleep(2000);
		Category_Name.click();
		ArrayList<String> Sorted_List =new ArrayList<String>();
		List<WebElement> After_Sort = driver.findElements(By.xpath("//tbody/tr/td[2]/span"));

		for(WebElement CategoryName_Aftersort:After_Sort) 
		{
			Sorted_List.add(CategoryName_Aftersort.getText());
		}
		System.out.println(Sorted_List);

		if(ArLst == Sorted_List)
		{
			System.out.println("Sorting is not done successfully");
		}
		else 
		{
			test.log(LogStatus.PASS, "Sorting done successfully for Name");

			//ut.PassedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	@FindBy(xpath = "//div[contains(@class,'breadcrumb-component')]/ol/li[1]")
	WebElement Home;

	@FindBy(xpath = "//div[contains(@class,'breadcrumb-component')]/ol/li[2]")
	WebElement Modules_Name;

	@FindBy(xpath = "//div[contains(@class,'breadcrumb-component')]/ol/li[3]")
	WebElement path1;
	@FindBy(xpath = "//div[contains(@class,'breadcrumb-component')]/ol/li[4]")
	WebElement path2;

	public WebElement Home() {

		return Home;
	}

	public WebElement Products_Items() {

		return Modules_Name;
	}
	public WebElement path1() {

		return path1;
	}
	public WebElement path2() {

		return path2;
	}

	@FindBy(xpath = "//app-new-kitchen-printer/form/div/div/app-input[@name='printerName']/div/div/mat-form-field/div/div/div[4]/input")
	WebElement KitchenPrinterNameInputBx;

	@FindBy(xpath = "//app-new-label-printer/form/div/div/app-input[@label='Name']/div/div/mat-form-field/div/div/div[4]/input")
	WebElement LabelPrinteNameInputBx;

	@FindBy(xpath = "//app-input[@name='IpAddress']/div/div/mat-form-field/div/div/div[4]/input")
	WebElement IP_AddressInputBx;

	@FindBy(xpath = "//span[contains(.,'Enable Service Type Restriction')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement EnableServiceTypeRestriction_YesBtn;

	@FindBy(xpath = "//span[contains(.,'Enable Service Type Restriction')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement EnableServiceTypeRestriction_NoBtn;

	@FindBy(xpath = "//span[contains(.,'Apply To All Categories')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement ApplyToAllCategories_YesBtn;

	@FindBy(xpath = "//span[contains(.,'Apply To All Categories')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement ApplyToAllCategories_NoBtn;

	@FindBy(xpath = "//span[contains(.,'Apply To All Menu Items')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement ApplyToAllMenuItems_YesBtn;

	@FindBy(xpath = "//span[contains(.,'Apply To All Menu Items')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement ApplyToAllMenuItems_NoBtn;

	@FindBy(xpath = "//button[contains(.,'New Kitchen Printer ')]")
	WebElement New_KitchenPrinterBtn_Secondary_Screen;
	
	@FindBy(xpath = "//button[contains(.,'New Label Printer ')]")
	WebElement New_LabelPrinterBtn_Secondary_Screen;

	@FindBy(xpath = "//app-radio-box-button[@name='printerType']/div/div/div/div[contains(.,'KDS')]")
	WebElement KDS_KitchenPrinterBtn;

	public void Enable_EnableServiceTypeRestriction() throws Exception
	{
		if(EnableServiceTypeRestriction_YesBtn.isSelected())
		{

		}
		else
		{
			EnableServiceTypeRestriction_YesBtn.click();
		}
		driver.findElement(By.xpath("//div[@class='new-kitchen-printer-restrict-printers']/app-chip//button")).click();
		Thread.sleep(1000);
		List<WebElement> ServTypeList=driver.findElements(By.xpath("//div[@class='new-kitchen-printer-restrict-printers']/app-chip/div/mat-chip-list/div/mat-chip"));


		int ServTypeSize=ServTypeList.size();

		//System.out.println("Total number of service types available:"+ServTypeSize);


		int randomServType=ThreadLocalRandom.current().nextInt(1, ServTypeSize);


		driver.findElement(By.xpath("//div[@class='new-kitchen-printer-restrict-printers']/app-chip/div/mat-chip-list/div/mat-chip["+randomServType+"]")).click();

	}

	public void Click_New_Kitchen_PrinterButton_SecondaryScreen() throws Exception
	{
		Thread.sleep(1000);
		cmp.Kitchen_Printers_Tab_inContents.click();
		Thread.sleep(1000);
		New_KitchenPrinterBtn_Secondary_Screen.click();
//		try {
//		if(cmp.CreationScreenHeader.getText().equalsIgnoreCase("New Kitchen Printer"))
//		{
//			test.log(LogStatus.PASS, "New Kitchen Printer page opened");
//		}
//		else
//		{
//			test.log(LogStatus.FAIL, "New Kitchen Printer page not opened");
//		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}

//		KDS_KitchenPrinterBtn.click();
		
		
	}
	
	public void Click_New_Label_PrinterButton_SecondaryScreen() throws Exception
	{
		Thread.sleep(1000);
		cmp.Label_Printers_Tab_inContents.click();
		Thread.sleep(1000);
		New_LabelPrinterBtn_Secondary_Screen.click();
//		try {
//		if(cmp.CreationScreenHeader.getText().equalsIgnoreCase("New Kitchen Printer"))
//		{
//			test.log(LogStatus.PASS, "New Kitchen Printer page opened");
//		}
//		else
//		{
//			test.log(LogStatus.FAIL, "New Kitchen Printer page not opened");
//		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		KDS_KitchenPrinterBtn.click();
		
		
	}

	public void Enter_Kitchen_PrinterName_SecondaryScreen(String str1) 
	{
		KitchenPrinterNameInputBx.clear();
		KitchenPrinterNameInputBx.sendKeys(str1);
	}

	public void Enter_IP_Address(String str2) throws Exception
	{
		IP_AddressInputBx.clear();
		IP_AddressInputBx.sendKeys(str2);

		cmp.Close_Online_Help_ChatBox();

	}
	public void Enable_ServiceType_Restriction() throws Exception
	{
		Enable_EnableServiceTypeRestriction();

		if(ApplyToAllCategories_YesBtn.isSelected())
		{

		}
		else
		{
			Thread.sleep(2000);
			ApplyToAllCategories_YesBtn.click();
		}
	}
	public void Create_KitchenPrinter(String str1,String str2) throws Exception
	{
		//cmp=new Common_XPaths();

		New_KitchenPrinterBtn_Secondary_Screen.click();

		if(cmp.CreationScreenHeader.getText().equalsIgnoreCase("New Kitchen Printer"))
		{
			test.log(LogStatus.PASS, "New Kitchen Printer page opened");
		}
		else
		{
			test.log(LogStatus.FAIL, "New Kitchen Printer page not opened");
		}

		KDS_KitchenPrinterBtn.click();

		//        Printer_ModelInputBox.click();
		//		
		//		List<WebElement> PrinterList=driver.findElements(By.xpath("//div[@class='options']/select-option"));
		//		
		//		int PrinterSize=PrinterList.size();
		//		
		//		
		//		int randomPrinter=ThreadLocalRandom.current().nextInt(1, PrinterSize);
		//		
		//		
		//		driver.findElement(By.xpath("//div[@class='options']/select-option["+randomPrinter+"]")).click();

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

		cmp.Close_Online_Help_ChatBox();

		Enable_EnableServiceTypeRestriction();

		if(ApplyToAllCategories_YesBtn.isSelected())
		{

		}
		else
		{
			Thread.sleep(2000);
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

	public void Checking_KitchenPrinter_InCategoryPage() throws Exception 
	{
		driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//button[.=' Show All ']")).click();

		List<WebElement> KitchenPrinter = driver.findElements(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip-list//mat-chip"));
		for(WebElement kp:KitchenPrinter) 
		{
			if(kp.getText().equals(Utility.getProperty("Category_Add_Kitchen_Printer_Name"))) 
			{
				test.log(LogStatus.PASS,"Created kichen printer Displayed in Category page");
			}
		}
	}

	@FindBy(xpath = "//span[.=' Image ']")
	WebElement image;

	public void Sorting_ImageColumn() throws Exception 
	{
		//Common_XPaths //cmp=new Common_XPaths();
		Utility ut = new Utility();

		//	 for(int i=1;i<=6;i++)
		//		{
		//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		//		}
		ArrayList<String> ArLst=new ArrayList<String>();
		List<WebElement> Before_sort = driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row/div/div[1]"));

		for(WebElement Modifier_Beforesort : Before_sort)
		{
			ArLst.add(Modifier_Beforesort.getText());
		}
		System.out.println(ArLst);
		try {

			image.click();
			Thread.sleep(2000);
			image.click();
			test.log(LogStatus.PASS,"Sort symbol is not Available for image");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		catch (Exception e) 
		{
			test.log(LogStatus.FAIL,"Sort Symbol present for image");
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}


	@FindBy(xpath = "//app-input[@name='courseName']/div/div/mat-form-field/div/div[1]/div[4]/input")
	WebElement Course_NameInputBox;

	@FindBy(xpath = "//app-input[@name='departmentName']/div/div/mat-form-field/div/div/div/input")
	WebElement Dept_Name_InputBox;

	@FindBy(xpath = "//h3[contains(.,' New Serving Size Level')]/../../../div[2]/div/app-new-serving-size-levels/form/div/div/div[1]/app-input/div/div/mat-form-field/div/div[1]/div[4]/input")
	WebElement Serving_Size_Name_InputBox;
	
	@FindBy(xpath = "//h3[contains(.,' New Tare Group')]/../../..//input")
	WebElement Tare_Group_Name_InputBox;
	
	@FindBy(xpath = "//span[contains(.,'Include Membership')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement YesToggleBtn;

	@FindBy(xpath = "//span[contains(.,'Include Membership')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement NoToggleBtn;

	@FindBy(xpath = "//app-input[@name='departmentCode']/div/div/mat-form-field/div/div/div/input")
	WebElement CodeInputBox;

	@FindBy(xpath = "//app-input[@name='departmentDescription']/div/div/mat-form-field/div/div[1]/div[4]/textarea")
	WebElement DescriptionInputBox;

	public void Enter_Dept_Name_inSecondaryScreen(String Str) throws Exception
	{
		Thread.sleep(500);
		Dept_Name_InputBox.clear();
		Thread.sleep(500);
		Dept_Name_InputBox.sendKeys(Str);
	}

	public void Enter_Course_Name_inSecondaryScreen(String Str) throws Exception
	{
		Thread.sleep(500);
		Course_NameInputBox.clear();
		Thread.sleep(500);
		Course_NameInputBox.sendKeys(Str);
	}

	public void Enter_ServingSizeLvl_Name_inSecondaryScreen(String Str) throws Exception
	{
		Thread.sleep(500);
		Serving_Size_Name_InputBox.clear();
		Thread.sleep(500);
		Serving_Size_Name_InputBox.sendKeys(Str);
	}

	public void Enter_TareGroup_Name_inSecondaryScreen(String Str) throws Exception
	{
		Thread.sleep(500);
		Tare_Group_Name_InputBox.clear();
		Thread.sleep(500);
		Tare_Group_Name_InputBox.sendKeys(Str);
	}
	

	
	public void Click_New_Departmnet_Button_InDropInputBox() throws Exception 
	{
		
		DepartmentDropBtn.click();

		//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]


		driver.findElement(By.xpath("//button[contains(.,'New Department')]")).click();

		//Clear and Enter the Department Name 
		Thread.sleep(1000);
	}
	
	public void Click_New_Coursing_Button_InDropInputBox() throws Exception 
	{
		CoursingDropBtn.click();

		//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]


		driver.findElement(By.xpath("//button[contains(.,'New Coursing')]")).click();

		//Clear and Enter the Department Name 
		Thread.sleep(1000);
	}
	
	public void Click_New_Serving_SizeLevel_Button_InDropInputBox() throws Exception 
	{
		ServingSizeLevelDropBtn.click();

		//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]


		driver.findElement(By.xpath("//button[contains(.,'New Serving Size')]")).click();

		//Clear and Enter the Department Name 
		Thread.sleep(1000);
	}
	
	public void Click_New_Tare_Group_Button_InDropInputBox() throws Exception 
	{
		TareGroupDropBtn.click();

		//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]


		driver.findElement(By.xpath("//button[contains(.,'New Tare Group')]")).click();

		//Clear and Enter the Department Name 
		Thread.sleep(1000);
	}
	
	
//	public void Enter_Department_Name(String DepName) throws Exception 
//	{
//		Thread.sleep(1000);
//		Enter_Dept_Name(DepName);
//	}
	public void Enter_Department_Code(String DepName,String DepCode) throws Exception 
	{
		Thread.sleep(1000);
		//Clear the Department Code
		CodeInputBox.clear();
		//Enter the Department Code
		CodeInputBox.sendKeys(DepCode);

		//Clear the Description button
		DescriptionInputBox.clear();
		//Enter the Description 
		DescriptionInputBox.sendKeys("Department is "+DepName);

		if(YesToggleBtn.isSelected())
		{
			NoToggleBtn.click();
		}
		else
		{

		}
	}

	public void Create_Department(String DepName,String DepCode) throws Exception
	{
		DepartmentDropBtn.click();

		//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]


		driver.findElement(By.xpath("//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]")).click();

		//Clear and Enter the Department Name 
		Thread.sleep(1000);
		Enter_Dept_Name_inSecondaryScreen(DepName);


		Thread.sleep(1000);
		//Clear the Department Code
		CodeInputBox.clear();
		//Enter the Department Code
		CodeInputBox.sendKeys(DepCode);

		//Clear the Description button
		DescriptionInputBox.clear();
		//Enter the Description 
		DescriptionInputBox.sendKeys("Department is "+DepName);

		if(YesToggleBtn.isSelected())
		{
			NoToggleBtn.click();
		}
		else
		{

		}
		try {
			driver.findElement(By.xpath("//button[.='Save']")).click();
			Thread.sleep(1000);
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Saved Successfully")){
				test.log(LogStatus.PASS,"Department Saved Successfully");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}
	@FindBy(xpath = "//input[@data-placeholder='Search ']")
	WebElement SearchBox;

	public void Serching_With_Special_Char(String SearchValue ) throws Exception
	{
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(1000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);
	}

	public void Searching(String SearchValue) throws Exception 
	{
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(1000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);
	}
	
	public void Verify_NewServingsize_Button() throws Exception 
	{
		wait.until(ExpectedConditions.elementToBeClickable(ServingSizeLevelDropBtn)).click();
		Thread.sleep(500);
		if(driver.findElement(By.xpath("//mat-icon[.='add']/..")).isDisplayed())
		{
			test.log(LogStatus.INFO,"New Serving size button displayed");
		}

		ServingSizeLevelDropBtn.click();
	}


}
