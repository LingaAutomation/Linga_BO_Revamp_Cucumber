package com.Pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import StepDefinition.LoginTest;
import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_CDS_Page extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	 
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	CategoriesPage ctp=new CategoriesPage();
	DepartmentPage dp=new DepartmentPage();
	CoursingPage cp=new CoursingPage();
	ServingSizeLevelsPage ssl=new ServingSizeLevelsPage();
	KitchenPrinterPage kp=new KitchenPrinterPage();
	ProductItems_Menu_RetailPage pmt=new ProductItems_Menu_RetailPage();
	UpchargesPage up=new UpchargesPage();
	SubCategoriesPage scp=new SubCategoriesPage();
	Settings_NotificationsPage snp = new Settings_NotificationsPage();
	
	public void openTheSettingsCustomerDisplaySystem_CDS_PageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		//Load the Settings Customer Display System (CDS) page
		try {
			
			driver.navigate().refresh();
			cmp.waitForPageToLoad();
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"customerDisplaySystem");
		Thread.sleep(5000);
		
		}
		//ClickLaborBtn.click();}
		catch(Exception K) {}
		Thread.sleep(5000);
		cmp.waitForPageToLoad();

}

	
	@FindBy(xpath = "//h3[contains(.,'Customer Display System (CDS)')]")
	public WebElement CDS_Header;
	
	@FindBy(xpath =  "//span[contains(.,'SAVE')]")
	public WebElement Update;
	
	@FindBy(xpath =  "//span[contains(.,'Show Advertisements')]")
	public WebElement SA_Field;
	
	@FindBy(xpath =  "//span[contains(.,'Show Advertisements')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[1]/button")
	public WebElement No_btn_SA;
	
	@FindBy(xpath =  "//span[contains(.,'Show Advertisements')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[1]/button[@aria-pressed='true']")
	public WebElement No_btn_SA_isSelected;
	
	@FindBy(xpath =  "//span[contains(.,'Show Advertisements')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[2]/button")
	public WebElement Yes_btn_SA;
	
	@FindBy(xpath =  "//span[contains(.,'Show Advertisements')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[2]/button[@aria-pressed='true']")
	public WebElement Yes_btn_SA_isSelected;
	
	
	@FindBy(xpath =  "//span[contains(.,'Customer Profile')]")
	public WebElement CP_Field;
	
	@FindBy(xpath =  "//span[contains(.,'Customer Profile')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[1]/button")
	public WebElement No_btn_CP;
	
	@FindBy(xpath =  "//span[contains(.,'Customer Profile')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[1]/button[@aria-pressed='true']")
	public WebElement No_btn_CP_isSelected;
	
	@FindBy(xpath =  "//span[contains(.,'Customer Profile')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[2]/button")
	public WebElement Yes_btn_CP;
	
	@FindBy(xpath =  "//span[contains(.,'Customer Profile')]/../../div[2]/mat-button-toggle-group/mat-button-toggle[2]/button[@aria-pressed='true']")
	public WebElement Yes_btn_CP_isSelected;
	
	@FindBy(xpath =  "	//div[1]/span[contains(.,'Theme')]")
	public WebElement Theme_Field;
	
	@FindBy(xpath =  "//label/mat-label[contains(.,'Theme')]")
	public WebElement Theme_Label;

	@FindBy(xpath =  "//span[contains(.,'Theme')]/../../div[2]/div/app-selectbox/div/mat-form-field/div")
	public WebElement theme_Select;
	
	@FindBy(xpath =  "//select-option/div[contains(.,'Light Theme')]")
	public WebElement light_Theme;
	
	@FindBy(xpath =  "//select-option/div[contains(.,'Dark Theme')]")
	public WebElement dark_Theme;
	
	@FindBy(xpath =  "//div[1]/span[contains(.,'Discount Text')]")
	public WebElement DiscountText_Field;
	
	@FindBy(xpath =  "//label[contains(.,'Discount Text')]")
	public WebElement DiscountText_Label;
		
	@FindBy(xpath =  "//span[contains(.,'Discount Text')]/../../div[2]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/textarea")
	public WebElement textArea_Of_DiscountText;
	
	@FindBy(xpath =  "//div[1]/span[contains(.,'Get Number Text')]")
	public WebElement GetNumberText_Field;
	
	@FindBy(xpath =  "//label[contains(.,'Get Number Text')]")
	public WebElement GetNumber_Label;
	
	@FindBy(xpath =  "//span[contains(.,'Get Number Text')]/../../div[2]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/textarea")
	public WebElement textArea_Of_GetNumberText;
	
	@FindBy(xpath =  "//div[1]/span[contains(.,'Loyalty Text')]")
	public WebElement LoyaltyText_Field;
	
	@FindBy(xpath =  "//label[contains(.,'Loyalty Text')]")
	public WebElement Loyalty_Label;
	
	@FindBy(xpath =  "//span[contains(.,'Loyalty Text')]/../../div[2]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/textarea")
	public WebElement textArea_Of_LoyaltyText;

	@FindBy(xpath =  "//div[@class='message mx-2']/span")
	public WebElement successMessage;
	
	@FindBy(xpath =  "//span[contains(.,'UPDATE')]/../../button[contains(@class,'mat-button-disabled')]")
	public WebElement disabled_Update_Btn;
	
	@FindBy(xpath =  "//span[contains(.,'SAVE')]/../../button[contains(@class,'mat-button-disabled')]")
	public WebElement disabled_Save_Btn;
	
	@FindBy(xpath =  "//span[contains(.,'SAVE')]/../../button")
	public WebElement Enabled_Save_Btn;
	
	@FindBy(xpath="//div[@id='general']/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]")
	public WebElement CharMaxError_Discount;
		
	@FindBy(xpath="//div[@id='general']/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]")
	public WebElement CharMaxError_GetNumber;
		
	@FindBy(xpath="//div[@id='general']/div[6]/div[1]/div[1]/div[2]/div[2]/div[1]")
	public WebElement CharMaxError_Loyalty;
	
	public void CheckField_CDS(WebElement Ele, String Str, String Msg, String Msg1) {
		
		if (Ele.getText().equals(Str)) {
			
			test.log(LogStatus.PASS, Str+Msg);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
		} else 
		{
			test.log(LogStatus.FAIL, Str+Msg1);
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
		
	
	
	public void Verify_Save_Button_Diabled(WebElement Ele, String Msg, String Msg1) throws Exception
	{

		 if(Ele.isDisplayed())
		    {
			 
			 
		    	test.log(LogStatus.PASS, Msg);
		    	
		    	ut.PassedCaptureScreenshotAsBASE64();
		    }
		    else
		    {
		    	test.log(LogStatus.FAIL, Msg1);
		    	
		    	ut.FailedCaptureScreenshotAsBASE64();
		    	
		    	Assert.assertEquals(true, Ele.isDisplayed());}
		    }

	
	
	public void Verify_Save_Button_Enabled(WebElement Ele, String Msg, String Msg1) throws Exception
	{

		 if(Ele.isDisplayed())
		    {
			 
			 
		    	test.log(LogStatus.PASS, Msg);
		    	
		    	ut.PassedCaptureScreenshotAsBASE64();
		    }
		    else
		    {
		    	test.log(LogStatus.FAIL, Msg1);
		    	
		    	ut.FailedCaptureScreenshotAsBASE64();
		    	
		    	Assert.assertEquals(true, Ele.isDisplayed());}
		    }

	
	public void Iclick_Button(WebElement Ele) throws InterruptedException {
		Thread.sleep(2000);
		Ele.click();
	}
	
	public void IVerify_SettingsSavedSuccessfully(String Msg) throws InterruptedException {
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase(Msg)) {
			
			System.out.println(Msg);
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
			
		}
	}


	public void IEnterText(WebElement Ele, String Str, String Msg)
	{

		Ele.clear();
		Ele.sendKeys(Str);
		
		test.log(LogStatus.PASS, Str+Msg);
		ut.PassedCaptureScreenshotAsBASE64();
		
	}
	
	public void IVerify_CharMaxError(WebElement Ele, String Str) throws InterruptedException {
		
		if(Ele.getText().equalsIgnoreCase(Str)) {
			test.log(LogStatus.PASS, "Error Message is  "+Str);
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
			
		} else {
			test.log(LogStatus.FAIL, "Error Message is  "+Str);
			ut.FailedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

}
		


