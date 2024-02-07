package com.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class DisplayGroupsPage extends BasePage
{

	
//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	Utility ut=new Utility();
	Common_XPaths cmp;

//	public DisplayGroupsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW DISPLAY GROUP')]")
	WebElement New_DisplayGroupBtn;
	
	@FindBy(xpath = "//input[@data-placeholder='Search Menu Item to create display group']")
	WebElement Menu_ItemsDropBtn;
	
	@FindBy(xpath = "//div[contains(@class,'selectbox-component size-small')]")
	WebElement SortByDropBtn;
	
	@FindBy(xpath = "//select-option[contains(.,'A-Z')]")
	WebElement AtoZ_SortingBtn;
	
	@FindBy(xpath = "//select-option[contains(.,'Z-A')]")
	WebElement ZtoA_SortingBtn;
	
	@FindBy(xpath = "//select-option[contains(.,'CUSTOM')]")
	WebElement Custom_SortingBtn;
	
	
	
	
	
	public void Click_NewDisplayGroup()
	{
		New_DisplayGroupBtn.click();
	}
	
	public void Select_MenuItemsDisplayGroup() throws Exception 
	{
		Thread.sleep(2000);
		Menu_ItemsDropBtn.click();
		
		List<WebElement> menuList=driver.findElements(By.xpath("//div/select-option"));
			
			int menuSize=menuList.size();
			
			
			int randomMenu=ThreadLocalRandom.current().nextInt(2, menuSize);
			
			String menu = driver.findElement(By.xpath("//div["+randomMenu+"]/select-option")).getText();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys(menu);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[1]/select-option")).click();
			
			Menu_ItemsDropBtn.click();
	}
	
	public void Select_AtoZSorting() throws Exception
	{
		Thread.sleep(2000);
		SortByDropBtn.click();
		
		Thread.sleep(1000);
		AtoZ_SortingBtn.click();
		
		Verify_Sorting("A-Z");
		
//		
//		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_ZtoASorting() throws Exception
	{
		Thread.sleep(2000);
		SortByDropBtn.click();
		
		Thread.sleep(1000);
		ZtoA_SortingBtn.click();
		
		Verify_Sorting("Z-A");
		
		
	
		
	}
	
	public void Select_CustomSorting() throws Exception
	{
		SortByDropBtn.click();
		
		Custom_SortingBtn.click();
		
		WebElement cuMenu1=driver.findElement(By.xpath("//div[contains(@class,'cdk-drop-list')]/div[1]/div/mat-icon"));
		WebElement cuMenu2=driver.findElement(By.xpath("//div[contains(@class,'cdk-drop-list')]/div[2]/div/mat-icon"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(cuMenu1, cuMenu2).build().perform();
		
		Verify_Sorting("CUSTOM");
		
//		Robot rd=new Robot();
//		rd.keyPress(KeyEvent.VK_PAGE_DOWN);
//		
//		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Verify_Sorting(String str) throws Exception
	{
		
		Robot rd=new Robot();
		rd.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		String FilterText=driver.findElement(By.xpath("//div[contains(@class,'selectbox-component size-small')]/mat-form-field/div/div/div[3]/span")).getText();
	
		if(FilterText.equalsIgnoreCase(str))
		{
			test.log(LogStatus.PASS, "Edited "+str+" Sorting Updated Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Edit "+str+" Sorting Update Fail");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	
	}
	 
	public void Delete_MenuItems() throws Exception
	{
		cmp=new Common_XPaths();
		List<WebElement> menuList=driver.findElements(By.xpath("//div[contains(@class,'cdk-drop-list')]/div/div/data-grid-row/div/div[2]/div/button"));
		
		for(int i=menuList.size()-2;i<=menuList.size()-1;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(@class,'cdk-drop-list')]/div["+i+"]/div/data-grid-row/div/div[2]/div/button")).click();
		
//			if(cmp.Alert_PopupMsg("Are you sure you want to delete this item?"))
//			{
//				
//			}
//			else
//			{
//				
//			}
			Thread.sleep(1000);

			cmp.Click_DeleteButton();
		}
	}
	
	public void Select_PriceLevel_MenuItem(String str) throws Exception 
	{
		Thread.sleep(2000);
		Menu_ItemsDropBtn.sendKeys(str);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/select-option")).click();
		Thread.sleep(2000);
		Menu_ItemsDropBtn.click();
	}
	
	@FindBy(xpath = "//app-selectbox[@name='priceLevel']//input")
	WebElement Pricelevel_Dropdown;
	
	public void Select_Price_Level() throws Exception 
	{
		try {
		cmp.wait.until(ExpectedConditions.elementToBeClickable(Pricelevel_Dropdown));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='select-option']")).click();
		}
		catch (Exception e) {
			test.log(LogStatus.FAIL,"Price level Menu Item is not Available");
		}
	}
	
	
}
