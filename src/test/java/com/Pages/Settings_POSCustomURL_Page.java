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

public class Settings_POSCustomURL_Page extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
//	SelfHealingDriver driver=new Driver_Manager().getDriver();
//	ExtentReports rep=new Driver_Manager().getRep(); 
//	ExtentTest test=new Driver_Manager().test;
//	
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
	Settings_CDS_Page cds = new Settings_CDS_Page();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	
	@FindBy(xpath = "//span[contains(.,'POS Custom URLs')]")
	public WebElement POSCustom_Settings_Header;
	
	@FindBy(xpath = "//h3[contains(.,'POS Custom URLs')]")
	public WebElement POSCustom_URLPage_Header;
	
	@FindBy(xpath = "//span[contains(.,'POS Access URL')]")
	public WebElement POSAccessURL_Field;
	
	@FindBy(xpath = "//button[contains(@name,'toogle')]/span[.='Yes']")
	public WebElement POSAccessURL_Toggle_Yes;
	
	@FindBy(xpath = "//button[contains(@name,'toogle')]/span[.='No']")
	public WebElement POSAccessURL_Toggle_No;
	
	@FindBy(xpath = "//label[contains(.,'Name')]")
	public WebElement POSCustomURL_Name_Label_IpBx;
	
	@FindBy(xpath = "//input[@aria-label='Name']")
	public WebElement POSCustomURL_Name_Input;
	
	@FindBy(xpath = "//input[@aria-label='URL']")
	public WebElement POSCustomURL_URL_Input;
	
	@FindBy(xpath = "//span[contains(.,'Please Enter Name')]")
	public WebElement POSCustomURL_Name_Error;
	
	@FindBy(xpath = "//label[contains(.,'URL')]")
	public WebElement POSCustomURL_URL_Label_IpBx;
		
	@FindBy(xpath = "//span[contains(.,'Please Enter URL')]")
	public WebElement POSCustomURL_URL_Error;
		
	@FindBy(xpath = "//span[contains(.,'Button Image:')]")
	public WebElement POSCustomURL_BtnImage_Field;
	
	@FindBy(xpath = "//div[@mattooltipclass]/../input")
	public WebElement POSCustomURL_BtnImage_Upload;
	
	
	@FindBy(xpath = "//button[.=' SAVE '] [@disabled='true']")
	public WebElement POSCustomURL_Save_Disabled;
	
	@FindBy(xpath = "//button[.=' SAVE ']")
	public WebElement POSCustomURL_Save_Enabled;
	
	@FindBy(xpath = "//button[.='Save'] [@disabled='true']")
	public WebElement NewPOSCustomURL_Save_Disabled;
	
	@FindBy(xpath = "//button[.='Save']")
	public WebElement NewPOSCustomURL_Save_Enabled;
	
//	@FindBy(xpath = "(//div[@class='row'])[5]/div/div[2]/button")
//	public WebElement URLLink_btn;
	
	@FindBy(xpath = "//button[contains(.,'URL LINK')]")
	public WebElement URLLink_btn;
	
	@FindBy(xpath = "//h3[contains(.,'New POS Custom URL')]")
	public WebElement NewPOSCustom_URLPage_Header;

	@FindBy(xpath = "//h3[contains(.,'Update POS Custom URL')]")
	public WebElement UpdatePOSCustom_URLPage_Header;
	
	@FindBy(xpath = "//button[.='Update'] [@disabled='true']")
	public WebElement UpdatePOSCustomURL_Update_Disabled;
	
	@FindBy(xpath = "//button[.='Update']")
	public WebElement UpdatePOSCustomURL_Update_Enabled;
	
	@FindBy(xpath = "(//ul[contains(@class,'list-group')]/li[1]/div/div[2]/button[1])[1]")
	public WebElement POSCustom_URL_Edit_btn;
	
	@FindBy(xpath = "//ul[contains(@class,'list-group')]/li[1]/div/div[2]/button[1])[i]")
	public WebElement POSCustom_URL_Edit_btn_list;
	
	public WebElement POSCustom_URL_Edit_btn_list() {
		return POSCustom_URL_Edit_btn_list;
	}
	
	
	@FindBy(xpath = "(//ul[contains(@class,'list-group')]/li[1]/div/div[2]/button[2])[1]")
	public WebElement POSCustom_URL_Delete_btn;
	
	@FindBy(xpath = "(//ul[contains(@class,'list-group')]/li[1]/div/div[2]/button[2])[i]")
	public WebElement POSCustom_URL_Delete_btn_list;
	
	@FindBy(xpath = "//div[@mattooltip='image-picker-options pl-2']/img")
	public WebElement imgupload_btn;
	
	@FindBy(xpath = "//app-input[@label='URL']/div/div/mat-form-field/div/div/div[4]/input")
	public WebElement url_textbox;
	
	@FindBy(xpath = "//div[@class='row justify-content-between']/div[1]/button")
	public WebElement No;
	
	@FindBy(xpath = "//alert-dialog[1]//button[contains(.,' No ')]")
	public WebElement Delete_No;
	
	@FindBy(xpath = "//alert-dialog[1]//button[contains(.,' Yes ')]")
	public WebElement Delete_Yes;
	
		
	@FindBy(xpath = "//div[@class='row justify-content-between']/div[2]/button")
	public WebElement Yes;
	
	@FindBy(xpath = "//button[contains(@class,'save-button')]")
	public WebElement Save;
	
	@FindBy(xpath = "//button[.='Cancel']")
	public WebElement NewPOSCustom_URLPage_Cancel;
	
	@FindBy(xpath = "//app-new-pos-custom-url//div[contains(@class,'image-picker-container')]/div/div[2]/div[2]/input")
	public WebElement Upload_PictureBtn;
	
	
	public void openTheSettingsPOSCustomURL_PageBaseURLAndStoreID() throws Exception {
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

	public void IClearText(WebElement Ele, String Str, String Msg, String Msg1)
	{

	
		try {
			Ele.click();
			Ele.sendKeys(Str);
	        Actions actions = new Actions(driver);
	        for (int i = 0; i < 40; i++) {
	            actions.sendKeys(Keys.BACK_SPACE).perform();
	        }
	        System.out.println("Backspace key used");
	        for (int i = 0; i < 40; i++) {
	            actions.sendKeys(Keys.DELETE).perform();
	        }
	        System.out.println("Delete key used");
			test.log(LogStatus.PASS, Msg);
			ut.PassedCaptureScreenshotAsBASE64();
			}
			
			catch (Exception K) {
				test.log(LogStatus.FAIL, Msg1);
		        ut.FailedCaptureScreenshotAsBASE64();
			}		
				}
		
	
	
	
	public void IVerify_ErrorMsg(WebElement Ele, String Str) throws InterruptedException {
		
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

	
	public void IUpload_Image(WebElement Ele, String Str) throws Exception
	{
		Thread.sleep(1000);
		Ele.sendKeys(System.getProperty("user.dir")+ut.getProperty(Str));
	}
	
	
	public void IClick_Button_FromConfirmationAlertMsg(WebElement Ele, String Msg) throws Exception {
		
		wait.until(ExpectedConditions.elementToBeClickable((Ele)));
		Ele.click();
		test.log(LogStatus.PASS, Msg);
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	
	
	public void ICreate_Ten_POSURLs (String Str,String Msg) throws Exception 
	{
		
		List<WebElement> menuList= driver.findElements(By.xpath("(//ul[contains(@class,'list-group')]/li[1]/div/div[2]/button[1])"));

		int menuSize=menuList.size();
		
		int menuSize1 = 10 - menuSize;
		
		
	for(int i=1;i<=menuSize1;i++) 
	{
		
		try {
			 snp.IClick_Toggle_Yes_Btn(POSAccessURL_Toggle_Yes, POSAccessURL_Toggle_No);
		}  catch (Exception e) { 
			
		}
		
		try {
		
			Thread.sleep(2000);
			cds.Iclick_Button(URLLink_btn);
}  catch (Exception e) { 
			
		}
			
			
		cds.IEnterText(POSCustomURL_Name_Input, "Alex"+i, "Name Entered - " +i);
		Thread.sleep(2000);
		cds.IEnterText(POSCustomURL_URL_Input, "www.pos"+i+".com", "URL Entered - " +i);
		
		Thread.sleep(2000);
		//Upload picture
		
		POSCustomURL_BtnImage_Upload.sendKeys(System.getProperty("user.dir")+ut.getProperty(Str));
		Thread.sleep(1000);
		
		ut.InfoCaptureScreenshotAsBASE64();
		
		try {
				cds.Iclick_Button(NewPOSCustomURL_Save_Enabled);
		} catch(Exception K) {
			cds.Iclick_Button(POSCustomURL_Save_Enabled);
		}
					
		cds.IVerify_SettingsSavedSuccessfully(Msg);
		test.log(LogStatus.PASS, "POS URL Added - "+i);
		ut.PassedCaptureScreenshotAsBASE64();
		
		}}
	
	public void Iverify_Ten_POSURLS(String Msg) throws InterruptedException {
		
		List<WebElement> menuList= driver.findElements(By.xpath("(//ul[contains(@class,'list-group')]/li[1]/div/div[2]/button[1])"));

		int menuSize=menuList.size();
		
		if (menuSize==10) {
			
			test.log(LogStatus.PASS, "Ten POS URL Added");
			ut.PassedCaptureScreenshotAsBASE64();
			
			cds.Iclick_Button(URLLink_btn);
			cds.IVerify_SettingsSavedSuccessfully(Msg);
			
		}
		
	}
	
	
	public void IDelete_Ten_POSURLs () throws Exception 
	{
		
		List<WebElement> menuList= driver.findElements(By.xpath("(//ul[contains(@class,'list-group')]/li[1]/div/div[2]/button[2])"));

		int menuSize=menuList.size();
		
		for(int i=1;i<=menuSize;i++) 
	{
		
		POSCustom_URL_Delete_btn.click();
		
		   IClick_Button_FromConfirmationAlertMsg(Delete_Yes, "Yes Button clicked");
	
		   cds.IVerify_SettingsSavedSuccessfully("URL Deleted Successfully");
				
		test.log(LogStatus.PASS, "POS URL Deleted - "+i);
		ut.PassedCaptureScreenshotAsBASE64();
		
		}}
	
	public void Iverify_Delete_All_POSURLS(String Msg) throws InterruptedException {
		
		cds.IVerify_SettingsSavedSuccessfully(Msg);
			
		}
		
	}

	
	
	
	
	
		
				
	
	
	

		


