package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import StepDefinition.LoginTest;
import Utility.Utility;

public class Settings_AdditionalSettingsPage extends BasePage
{

//	SelfHealingDriver driver=new Driver_Manager().getDriver();
//	ExtentReports rep=new Driver_Manager().getRep(); 
//	ExtentTest test=new Driver_Manager().test;
	
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
		//Load the Settings - Additional Settings page
		try {
			
			driver.navigate().refresh();
			cmp.waitForPageToLoad();
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"additionalSettings");
		Thread.sleep(5000);
		
		}
		//ClickLaborBtn.click();}
		catch(Exception K) {}
		Thread.sleep(5000);
		cmp.waitForPageToLoad();

}

	
	@FindBy(xpath = "//button[@mattooltip='Settings']")
	public WebElement Settings;
	
	@FindBy(xpath = "//span[.='Additional Settings']")
	public WebElement Additional_Settings;
	
	@FindBy(xpath="//span[.='Include Credits in Daily Summary Report']")
	public WebElement include_Credit;
	
	@FindBy(xpath = "//span[.='Include Credits in Daily Summary Report']/../../div[2]/app-toggle/div/div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
	public WebElement include_Credit_NoToggle;
	
    @FindBy(xpath = "//span[.='Include Credits in Daily Summary Report']/../../div[2]/app-toggle/div/div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
    public WebElement include_Credit_YesToggle;
    
    @FindBy(xpath="//span[.='Employee Tip Out Deducted from Cash Expected on Reports ']")
	public WebElement Employee_Tipout;
    
    @FindBy(xpath = "//span[.='Employee Tip Out Deducted from Cash Expected on Reports ']/../../div[2]/app-toggle/div/div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
    public WebElement Employee_Tipout_NoToggle;
    
    @FindBy(xpath = "//span[.='Employee Tip Out Deducted from Cash Expected on Reports ']/../../div[2]/app-toggle/div/div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
    public WebElement Employee_Tipout_YesToggle;
    
    @FindBy(xpath="//span[.='Auto Print Close Day Report']")
	public WebElement Auto_Print;
    
    @FindBy(xpath = "//span[.='Auto Print Close Day Report']/../../div[2]/app-toggle/div/div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
    public WebElement Auto_Close_NoToggle;
    
    @FindBy(xpath = "//span[.='Auto Print Close Day Report']/../../div[2]/app-toggle/div/div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
    public WebElement Auto_Close_YesToggle;
    
    @FindBy(xpath = "//button[.='SAVE'][@disabled='true']")
    public WebElement SAVE_Disabled;
    
    @FindBy(xpath = "//button[.='SAVE']")
    public WebElement SAVE_Enabled;
    
  
    
    @FindBy(xpath = "//button[.='keyboard_backspace']")
    public WebElement back_space;
	

}
		



 

