package com.Pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class SubCategoriesPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	Common_XPaths cmp=new Common_XPaths();
	Utility ut=new Utility();
	CategoriesPage ctp=new CategoriesPage();
	
//	public SubCategoriesPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver, test);
//		PageFactory.initElements(driver, this);
//	}
	
	
	@FindBy(xpath = "//button[@routerlink='newSubCategory']")
	WebElement New_SubCategoryBtn;
	
	
	@FindBy(xpath = "//input[@data-placeholder='Select Category']")
	public WebElement CategoryDropBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Apply default serving size levels')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement ApplyDefaultServingSize_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Apply default serving size levels')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement ApplyDefaultServingSize_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Enable Age Restriction')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement Enable_Age_Restriction_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Enable Age Restriction')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement Enable_Age_Restriction_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Exclude Check Tax')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	WebElement Exclude_Check_Tax_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Exclude Check Tax')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement Exclude_Check_Tax_NoBtn;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Hide Menu Item In Kiosk')]//mat-button-toggle/button[contains(.,'Yes')]")
	public WebElement Hide_MenuItem_In_Kiosk_YesBtn;
		
	@FindBy(xpath = "//app-toggle[contains(.,'Hide Menu Item In Kiosk')]//mat-button-toggle/button[contains(.,'No')]")
	WebElement Hide_MenuItem_In_Kiosk_NoBtn;
	
	@FindBy(xpath = "//button[contains(.,'APPLY')]")
	WebElement ApplyBtn;
	
	//span[contains(.,'Category')]/../../div[contains(@class,'data-grid-header')]
	public void Click_NewSubCategory() throws Exception 
	{
		cmp.Wait_ForElementVisibility(New_SubCategoryBtn, 30);
		Thread.sleep(2000);
		New_SubCategoryBtn.click();	
	}
	
	public void Click_ApplyButton()
	{
		ApplyBtn.click();
	}
	
	public void Select_Category() throws Exception
	{
		Thread.sleep(1000);
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(2000);
		cmp.Click_DropDown_withSearch(CategoryDropBtn, "Category Selected");
//		CategoryDropBtn.click();
//		
//		List<WebElement> catgryList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
//		
//		int catgrySize=catgryList.size();
//		
//		if(catgrySize<=6)
//		{
//		
//		int randomcatgry=ThreadLocalRandom.current().nextInt(1, catgrySize);
//		
//		
//		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomcatgry+"]")).click();
//		}
//		else
//		{
//			int randomcatgry=ThreadLocalRandom.current().nextInt(1, 6);
//			
//			
//			driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomcatgry+"]")).click();
//		
//		}
	
	}
	
	public void Select_DefaultServingSize()
	{
		if(ApplyDefaultServingSize_YesBtn.isSelected())
		{
			
		}
		else
		{
			ApplyDefaultServingSize_YesBtn.click();
		}
	}
	
	public void DeSelect_DefaultServingSize()
	{
		if(ApplyDefaultServingSize_YesBtn.isEnabled())
		{
			ApplyDefaultServingSize_NoBtn.click();
		}
		else
		{
		
		}
	}
	
//	public void Click_New_Serving_SizeLevel_Button_InDropInputBox() throws Exception 
//	{
//		ctp.ServingSizeLevelDropBtn.click();
//
//		//div[contains(@class,'option-list')]/../div/div[3]/button[contains(.,'New Department')]
//
//
//		driver.findElement(By.xpath("//button[contains(.,'New Serving Size')]")).click();
//
//		//Clear and Enter the Department Name 
//		Thread.sleep(1000);
//	}
	
//	public void Enable_Age_Restriction_Toggle()
//	{
//		if(Enable_Age_Restriction_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
//			Enable_Age_Restriction_YesBtn.click();
//		}
//	}
//	
//	public void Disable_Age_Restriction_Toggle()
//	{
//		if(Enable_Age_Restriction_YesBtn.isEnabled())
//		{
//			Enable_Age_Restriction_NoBtn.click();
//		}
//		else
//		{
//		
//		}
//	}
//	
//	public void Enable_Exclude_Check_Tax_Toggle()
//	{
//		if(Exclude_Check_Tax_YesBtn.isSelected())
//		{
//			
//		}
//		else
//		{
//			Exclude_Check_Tax_YesBtn.click();
//		}
//	}
//	
//	public void Disable_Exclude_Check_Tax_Toggle()
//	{
//		if(Exclude_Check_Tax_YesBtn.isEnabled())
//		{
//			Exclude_Check_Tax_NoBtn.click();
//		}
//		else
//		{
//		
//		}
//	}
	
	public void Verify_CategoryFilter() throws Exception
	{
		Thread.sleep(1000);
		CategoryDropBtn.click();
		
	List<WebElement> catgryList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
		int catgrySize=catgryList.size();
		
		
		int randomcatgry=ThreadLocalRandom.current().nextInt(1, catgrySize);
		
		WebElement selCat=driver.findElement(By.xpath("//div[@class='option-list']/div/select-option["+randomcatgry+"]"));
		
		String randomCategoryName=selCat.getText();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", selCat);
		
		selCat.click();
		
		
		List<WebElement> ListOfCats=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/data-grid-row/div/div[3]/p"));
		
		for(WebElement cat:ListOfCats)
		{
			if(cat.getText().equalsIgnoreCase(randomCategoryName))
			{
				test.log(LogStatus.PASS, "Category Filtered Correctly");
				
				ut.PassedCaptureScreenshotAsBASE64();
			} 
			else
			{
				test.log(LogStatus.FAIL, "Category Filtered Incorrectly. Wrong Category name is : "+cat.getText());
			
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
	}
	
	public void Enable_Hide_MenuItem_In_Kiosk_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Hide_MenuItem_In_Kiosk_YesBtn.isSelected())
		{
			
		}
		else
		{
			Hide_MenuItem_In_Kiosk_YesBtn.click();
		}
	}
	
	public void Disable_Hide_MenuItem_In_Kiosk_Toggle() throws Exception
	{
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		Thread.sleep(1000);
		if(Hide_MenuItem_In_Kiosk_YesBtn.isSelected())
		{
			Hide_MenuItem_In_Kiosk_NoBtn.click();
		}
		else
		{
		
		}
	}
	

}
