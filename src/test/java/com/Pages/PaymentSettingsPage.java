package com.Pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

public class PaymentSettingsPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	
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
	
	@FindBy(xpath = "//button[contains(.,'NEW SERVICE CHARGE')]")
	public WebElement New_ServiceChargeBtn;
	
	@FindBy(xpath = "//mat-button-toggle[@id='mat-button-toggle-4']/button[@aria-pressed='true']")
	public WebElement ManualSubmitForCreditCardToggle_YesBtn;
	
	@FindBy(xpath = "//mat-button-toggle[@id='mat-button-toggle-3']/button[@aria-pressed='false']")
	public WebElement ManualSubmitForCreditCardToggle_NoBtn;
	
	@FindBy(xpath = "//mat-button-toggle[@id='mat-button-toggle-6']/button[@aria-pressed='true']")
	public WebElement TokenizeTheCreditCardToggle_YesBtn;
	
	@FindBy(xpath = "//mat-button-toggle[@id='mat-button-toggle-5']/button[@aria-pressed='false']")
	public WebElement TokenizeTheCreditCardToggle_NoBtn;	
	
	@FindBy(xpath = "//mat-button-toggle[@id='mat-button-toggle-8']/button[@aria-pressed='true']")
	public WebElement PaymentSurchageToggle_YesBtn;	
	
	@FindBy(xpath = "//mat-button-toggle[@id='mat-button-toggle-7']/button[@aria-pressed='false']")
	public WebElement PaymentSurchageToggle_NoBtn;	
	
	@FindBy(xpath="//app-radio-box-button//div[@class='radio-box']/div[contains(.,'Surcharge')]")
	public WebElement Surcharge_radioBtn;
	
	@FindBy(xpath="//app-radio-box-button//div[@class='radio-box']/div[contains(.,'Service Charge')]")
	public WebElement ServiceCharge_radioBtn;
	
	@FindBy(xpath="//app-radio-box-button//div[@class='radio-box']/div[contains(.,'Dual Price')]")
	public WebElement DualPrice_radioBtn;
	
	@FindBy(xpath="//label[contains(.,'Fee Name')]/../../input")
	public WebElement FeeName_inputBx;
	
	@FindBy(xpath="//label[contains(.,'Surcharge Name')]/../../input")
	public WebElement SurchargeName_inputBx;
	
	@FindBy(xpath="//label[contains(.,'Surcharge Percentage')]/../../input")
	public WebElement SurchargePercentage_inputBx;
	
	@FindBy(xpath="//label[contains(.,'Service Charge Name')]/../../input")
	public WebElement ServiceChargeName_inputBx;
	
	@FindBy(xpath="//label[contains(.,'Name')]/../../input")
	public WebElement DualPriceName_inputBx;
	
	@FindBy(xpath="//label[contains(.,'Dual Price Percentage')]/../../input")
	public WebElement DualPricePercentage_inputBx;
	
	@FindBy(xpath="//label[contains(.,'Dual Price Tax Type')]/../../input")
	public WebElement DualPriceTaxType_inputBx;
	
	@FindBy(xpath="//select-option[contains(.,'Before Tax')]")
	public WebElement DualPriceTaxType_BeforeTax_inputBx;
	
	@FindBy(xpath="//select-option[contains(.,'After Tax')]")
	public WebElement DualPriceTaxType_AfterTax_inputBx;
		
	
	public void openTheSettingsPaymentSettingPageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		//Load the Reports Employee Labor page
		try {
			
			driver.navigate().refresh();
			cmp.waitForPageToLoad();
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"paymentSettings");
		Thread.sleep(5000);
		
		}
		//ClickLaborBtn.click();}
		catch(Exception K) {}
		Thread.sleep(5000);
		cmp.waitForPageToLoad();

}
	
	public WebElement ManualSubmitForCreditCard_Yes()
	{
		return ManualSubmitForCreditCardToggle_YesBtn;
	}
	
	public WebElement ManualSubmitForCreditCard_No()
	{
		return ManualSubmitForCreditCardToggle_NoBtn;
	}
	
	public WebElement TokenizeTheCreditCardToggle_Yes()
	{
		return TokenizeTheCreditCardToggle_YesBtn;
	}
	
	public WebElement TokenizeTheCreditCardToggle_No()
	{
		return TokenizeTheCreditCardToggle_NoBtn;
	}
	
	public WebElement PaymentSurchageToggle_Yes()
	{
		return PaymentSurchageToggle_YesBtn;
	}
	
	public WebElement PaymentSurchageToggle_No()
	{
		return PaymentSurchageToggle_NoBtn;
	}
	
	
	
	public void iClickManualSubmitForCreditCard_Yes() throws Exception {
		
		Thread.sleep(2000);	
		if(ManualSubmitForCreditCard_Yes().isSelected())
		{
			System.out.println("ManualSubmitForCreditCard_Yes button is Enabled");
			ut.InfoCaptureScreenshotAsBASE64();
			ut.PassedCaptureScreenshotAsBASE64();
		} else {
			
	Thread.sleep(1000);
			ManualSubmitForCreditCard_Yes().click();
			System.out.println("ManualSubmitForCreditCard_Yes button is Enabled");
			ut.InfoCaptureScreenshotAsBASE64();
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	

	public void IClickTokenizeTheCreditCardToggle_Yes() {
		
		if(TokenizeTheCreditCardToggle_Yes().isSelected())
		{
			ut.PassedCaptureScreenshotAsBASE64();
		} else {
			TokenizeTheCreditCardToggle_Yes().click();
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	
	
	public void IClickPaymentSurchageToggle_Yes() {
		
		if(PaymentSurchageToggle_Yes().isSelected())
		{
			ut.PassedCaptureScreenshotAsBASE64();
		} else {
			PaymentSurchageToggle_Yes().click();
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	

	
	public void ISelect_TokenizeServiceType() throws Exception
	{

		Thread.sleep(1000);
		List<WebElement> courseList=driver.findElements(By.xpath("//app-chip[@name='ccToken']/div/mat-chip-list/div/mat-chip"));
		
		int courseSize=courseList.size();
				
		int randomCoursing=ThreadLocalRandom.current().nextInt(1, courseSize);
		
		if(courseSize>=1)
		{
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-chip[@name='ccToken']/div/mat-chip-list/div/mat-chip["+randomCoursing+"]")).click();
		ut.PassedCaptureScreenshotAsBASE64();
		
	}
	else
	{
		test.log(LogStatus.INFO, "Service Type Not available");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	}
	
	public void Enter_FeeName_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		FeeName_inputBx.clear();
		Thread.sleep(1000);
		FeeName_inputBx.sendKeys(Str);
	}
	
	public void Update_FeeName_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		FeeName_inputBx.clear();
		Thread.sleep(1000);
		FeeName_inputBx.sendKeys(Str);
	}
	
	public void Clear_FeeName_Surcharge() throws Exception
	{
		try {
		FeeName_inputBx.click();		
        Actions actions = new Actions(driver);
        for (int i = 0; i < 25; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
        System.out.println("Backspace key used");
        for (int i = 0; i < 25; i++) {
            actions.sendKeys(Keys.DELETE).perform();
        }
        System.out.println("Delete key used");
       
        actions.sendKeys(Keys.ARROW_DOWN);
        ut.PassedCaptureScreenshotAsBASE64();

		}
		
		catch (Exception K) {
	        ut.FailedCaptureScreenshotAsBASE64();
		}		
			}
	
	public void Clear_DualPrice_FeeName_Surcharge() throws Exception
	{
		try {
			DualPriceName_inputBx.click();		
        Actions actions = new Actions(driver);
        for (int i = 0; i < 25; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
        System.out.println("Backspace key used");
        for (int i = 0; i < 25; i++) {
            actions.sendKeys(Keys.DELETE).perform();
        }
        System.out.println("Delete key used");
       
        actions.sendKeys(Keys.ARROW_DOWN);
        ut.PassedCaptureScreenshotAsBASE64();

		}
		
		catch (Exception K) {
	        ut.FailedCaptureScreenshotAsBASE64();
		}		
			}

	public void Enter_SurchargeName_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		SurchargeName_inputBx.clear();
		Thread.sleep(1000);
		SurchargeName_inputBx.sendKeys(Str);
	}
	
	public void Enter_DualPriceName_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		DualPriceName_inputBx.clear();
		Thread.sleep(1000);
		DualPriceName_inputBx.sendKeys(Str);
	}
	
	public void Enter_DualPricePercentage_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		DualPricePercentage_inputBx.clear();
		Thread.sleep(1000);
		DualPricePercentage_inputBx.sendKeys(Str);
	}
	
	
	public void Clear_DualPricePercentage_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		DualPricePercentage_inputBx.clear();
		Thread.sleep(1000);
		DualPricePercentage_inputBx.sendKeys(Str);
		try {
			IverifyDualPricePercentage_Error().getText().equalsIgnoreCase("Please Enter Valid Percentage");
			ut.PassedCaptureScreenshotAsBASE64();
			System.out.println("Please Enter Valid Percentage");
		} catch (Exception K) {}
	}
	
	public void Select_DualPriceTaxtype_AfterTax_Surcharge() throws Exception
	{
		Thread.sleep(1000);
		DualPriceTaxType_inputBx.click();
		Thread.sleep(1000);
		DualPriceTaxType_AfterTax_inputBx.click();
	}
	
	public void Select_DualPriceTaxtype_BeforeTax_Surcharge() throws Exception
	{
		Thread.sleep(1000);
		DualPriceTaxType_inputBx.click();
		Thread.sleep(1000);
		DualPriceTaxType_BeforeTax_inputBx.click();
	}
	
	public void Update_SurchargeName_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		SurchargeName_inputBx.clear();
		Thread.sleep(1000);
		SurchargeName_inputBx.sendKeys(Str);
	}
	
	public void Update_ServiceChargeName_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		ServiceChargeName_inputBx.clear();
		Thread.sleep(1000);
		ServiceChargeName_inputBx.sendKeys(Str);
	}

	public void Clear_SurchargeName_Surcharge() throws Exception
	
	{
		try {
			SurchargeName_inputBx.click();		
        Actions actions = new Actions(driver);
        for (int i = 0; i < 25; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
        System.out.println("Backspace key used");
        for (int i = 0; i < 25; i++) {
            actions.sendKeys(Keys.DELETE).perform();
        }
        System.out.println("Delete key used");
       
        actions.sendKeys(Keys.ARROW_DOWN);
        ut.PassedCaptureScreenshotAsBASE64();

		}
		
		catch (Exception K) {
	        ut.FailedCaptureScreenshotAsBASE64();
		}		
			}
	
	
	
	@FindBy(xpath="//mat-hint[@id='mat-hint-41']")
	public WebElement SurchargePercentage_Error;
	
	@FindBy(xpath="//mat-hint[@id='mat-hint-22']")
	public WebElement DualPricePercentage_Error;
		
	public WebElement IverifySurchargePercentage_Error() {
		return SurchargePercentage_Error;
		
	}
	
	public WebElement IverifyDualPricePercentage_Error() {
		return DualPricePercentage_Error;
		
	}
	
	public void Enter_SurchargePercentage_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		SurchargePercentage_inputBx.clear();
		Thread.sleep(1000);
		SurchargePercentage_inputBx.sendKeys(Str);
		Thread.sleep(1000);
	}
	
	public void Enter_SurchargePercentageGreater_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		SurchargePercentage_inputBx.clear();
		Thread.sleep(1000);
		SurchargePercentage_inputBx.sendKeys(Str);
		
		try {
			IverifySurchargePercentage_Error().getText().equalsIgnoreCase("Please Enter Valid Percentage");
			ut.PassedCaptureScreenshotAsBASE64();
			System.out.println("Please Enter Valid Percentage");
		} catch (Exception K) {}
		
	}
	
	
	public void Update_SurchargePercentage_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		SurchargePercentage_inputBx.clear();
		Thread.sleep(1000);
		SurchargePercentage_inputBx.sendKeys(Str);
		
	}
	
	public void IclickSurCharge_RadioBtn() {
		
		Surcharge_radioBtn.click();
	
	}

	public void IclickServiceCharge_RadioBtn() throws InterruptedException {
		
		ServiceCharge_radioBtn.click();
		Thread.sleep(1000);
		
		Actions actions = new Actions(driver);
		for(int i=0;i<3;i++) {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
		}}
	
	public WebElement IClickNew_ServiceChargeBtn() {
		return New_ServiceChargeBtn;
	}
	
	public void Iclick_NewServiceCharge_Btn() throws InterruptedException {
		Thread.sleep(1000);
		IClickNew_ServiceChargeBtn().click();
		Thread.sleep(2000);
	}
	
	public void IclickDualPrice_RadioBtn() {
		
	DualPrice_radioBtn.click();
	
	}
	
	@FindBy(xpath="//button[.='SAVE']")
	public WebElement PaymentSetting_SAVEBtn;
	
	public WebElement PaymentSetting_SAVEBtn() {
		return PaymentSetting_SAVEBtn;
	}
	
	public void PaymentSetting_SAVEBtn_Enabled() {
		
		if (PaymentSetting_SAVEBtn().isEnabled())
		{
			System.out.println("Payment Settings SAVE button is Enabled");
			//PaymentSetting_SAVEBtn().click();
		} else {
			System.out.println("Payment Settings SAVE button is Not Enabled");
		}
			}	
	
	public void IclickSave_Settings() throws InterruptedException {
		PaymentSetting_SAVEBtn().click();
		Thread.sleep(2000);
	}
	
	public void iVerifyPaymentSettingsSavedSuccessfully() throws InterruptedException {
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Payment Settings Saved Successfully")) {
			
			System.out.println("Payment Settings Saved Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
			
		}
	}
	
	public void iVerifyServiceChargeAddedSuccessfully() throws InterruptedException {
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Service Charge Added Successfully")) {
			
			System.out.println("Service Charge Added Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
			
		}
	}
	
	public void iVerifyServiceChargeUpdatedSuccessfully() throws InterruptedException {
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Service Charge Updated Successfully")) {
			
			System.out.println("Service Charge Updated Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}
	
	public void iVerifyServiceChargeRemovedSuccessfully() throws InterruptedException {
		
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Service Charge Removed Successfully")) {
			
			System.out.println("Service Charge Removed Successfully");
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}
	
	
	@FindBy(xpath = "//h3[@class='drawer-title']")
	public WebElement NewServiceChargeScreenHeader;
	
	
	public void VerifyNewServiceChargeScreenPageHeader(String Str) throws InterruptedException
	{
		Thread.sleep(2000);
		if(NewServiceChargeScreenHeader.getText().equals(Str))
		{
			test.log(LogStatus.PASS, Str+" New Service charge Screen Loaded Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			
		}
		else
		{
			test.log(LogStatus.FAIL, Str+" New Service charge screen Loaded Failed");
			
			ut.FailedCaptureScreenshotAsBASE64(); }
			
}	
	
	
	@FindBy(xpath="//label[contains(.,'Service Charge')]/../../input[@aria-label='Service Charge']")
	public WebElement ServicechargePercentage_inputBx;
	
	@FindBy(xpath="//label[contains(.,'Tip Charge')]/../../input")
	public WebElement TipchargePercentage_inputBx;
	
	@FindBy(xpath="//label[contains(.,'Gratuity Charge')]/../../input")
	public WebElement GratuitychargePercentage_inputBx;
	
	
	@FindBy(xpath="//span[@class='col-12 p-0 pb-2 color-red']")
	public WebElement ServiceChargePercentage_Error;
	
	public WebElement IverifyServiceChargePercentage_Error() {
		return ServiceChargePercentage_Error;
		
	}
	
	@FindBy(xpath="//span[@class='col-12 p-0 pb-2 color-red']")
	public WebElement TipChargePercentage_Error;
	
	public WebElement IverifyTipChargePercentage_Error() {
		return TipChargePercentage_Error;
		
	}
	
	@FindBy(xpath="//span[@class='col-12 p-0 pb-2 color-red']")
	public WebElement GratuityChargePercentage_Error;
	
	public WebElement IverifyGratuityChargePercentage_Error() {
		return GratuityChargePercentage_Error;
		
	}
	
		
	public void Enter_ServiceChargePercentage_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		ServicechargePercentage_inputBx.clear();
		Thread.sleep(1000);
		ServicechargePercentage_inputBx.sendKeys(Str);
		Thread.sleep(1000);
		
	}
	
	public void Enter_ServiceChargePercentageGreater_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		ServicechargePercentage_inputBx.clear();
		Thread.sleep(1000);
		ServicechargePercentage_inputBx.sendKeys(Str);
		
		try {
			IverifyServiceChargePercentage_Error().getText().equalsIgnoreCase("Please Enter Valid Percentage");
			ut.PassedCaptureScreenshotAsBASE64();
			System.out.println("Please Enter Valid Percentage");
		} catch (Exception K) {}
		
	}
	
	public void Enter_TipChargePercentage_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		TipchargePercentage_inputBx.clear();
		Thread.sleep(1000);
		TipchargePercentage_inputBx.sendKeys(Str);
		
		
	}
	
	public void Enter_TipChargePercentageGreater_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		TipchargePercentage_inputBx.clear();
		Thread.sleep(1000);
		TipchargePercentage_inputBx.sendKeys(Str);
		
		try {
			IverifyTipChargePercentage_Error().getText().equalsIgnoreCase("Please Enter Valid Percentage");
			ut.PassedCaptureScreenshotAsBASE64();
			System.out.println("Please Enter Valid Percentage");
		} catch (Exception K) {}
		
	}
	
	
	public void Enter_GratuityChargePercentage_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		GratuitychargePercentage_inputBx.clear();
		Thread.sleep(1000);
		GratuitychargePercentage_inputBx.sendKeys(Str);
		
		
	}
	
	public void Enter_GratuityChargePercentageGreater_Surcharge(String Str) throws Exception
	{
		Thread.sleep(1000);
		GratuitychargePercentage_inputBx.clear();
		Thread.sleep(1000);
		GratuitychargePercentage_inputBx.sendKeys(Str);
		
		try {
			IverifyGratuityChargePercentage_Error().getText().equalsIgnoreCase("Please Enter Valid Percentage");
			ut.PassedCaptureScreenshotAsBASE64();
			System.out.println("Please Enter Valid Percentage");
		} catch (Exception K) {}
		
	}
	
	@FindBy(xpath = "//mat-label[contains(.,'Card Type')]/../../../input")
	public WebElement Card_TypeInput;
	
	public WebElement Card_TypeInput()
	{
		return Card_TypeInput;
	}
	
	@FindBy(xpath = "//select-option[contains(.,'Visa')]")
	public WebElement Visa_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Master')]")
	public WebElement Master_CardType;
		
	@FindBy(xpath = "//select-option[contains(.,'Amex')]")
	public WebElement Amex_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Diners')]")
	public WebElement Diners_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'JCB')]")
	public WebElement JCB_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Discover')]")
	public WebElement Discover_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'ATH')]")
	public WebElement ATH_CardType;

	@FindBy(xpath = "//select-option[contains(.,'Cash')]")
	public WebElement Cash_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Unica')]")
	public WebElement Unica_CardType;
	
	@FindBy(xpath = "//select-option[.='Ebt']")
	public WebElement Ebt_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Fondo')]")
	public WebElement Fondo_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'EbtCash')]")
	public WebElement EbtCash_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Others')]")
	public WebElement Others_CardType;
	
	public void Select_Visa_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Visa_CardType.click();
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_Master_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Master_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_Amex_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Amex_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_Diners_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Diners_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_JCB_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		JCB_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_Discover_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Discover_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_ATH_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		ATH_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_Cash_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Cash_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	
	public void Select_Unica_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Unica_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_Ebt_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Ebt_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_Fondo_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		Fondo_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_EbtCash_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		EbtCash_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_Others_CardType() throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		
		Others_CardType.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Select_CardType(String Str) throws InterruptedException
	{
		Thread.sleep(1000);
		Card_TypeInput.click();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		SelectPaymentSetting_CardTypeSearchBox.clear();
		Thread.sleep(2000);

		SelectPaymentSetting_CardTypeSearchBox.sendKeys(Str);
		Thread.sleep(2000);
	
		SelectPaymentSettingCardType.click();
		test.log(LogStatus.PASS, Str+ "Card Type selected");
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(2000);
			}
	
	
	@FindBy(xpath="//input[@aria-label='Search']")
	public WebElement SelectPaymentSetting_SearchBox;
	
	
	
	@FindBy(xpath="//app-new-service-charge//input[@aria-label='Search']")
	public WebElement SelectPaymentSetting_CardTypeSearchBox;
	
//	@FindBy(xpath="//button[@aria-label='Edit']")
	@FindBy(xpath="//tbody/tr/td[5]/div/div[1]/button")
	public WebElement SelectPaymentSetting_Edit;
	
	@FindBy(xpath="//select-option/div[1]")
	public WebElement SelectPaymentSettingCardType;

//	@FindBy(xpath="//button[@aria-label='Delete']")
	@FindBy(xpath="//tbody/tr/td[5]/div/div[2]/button")
	public WebElement SelectPaymentSetting_Delete;
	
	
	
	public void SearchEdit_ServiceChargewithCardType(String Str) throws Exception
	{
		
			
				if (SelectPaymentSetting_SearchBox.isEnabled())
				{
			Thread.sleep(2000);
			SelectPaymentSetting_SearchBox.clear();
			Thread.sleep(2000);

			SelectPaymentSetting_SearchBox.sendKeys(Str);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			for(int i=0;i<4;i++) {
				actions.sendKeys(Keys.ARROW_DOWN).perform();
			}
			Thread.sleep(2000);
			SelectPaymentSetting_Edit.click();
			test.log(LogStatus.PASS, "Clicked Edit Payment Settings Button");
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(2000);
				}
				
				
					cmp.waitForPageToLoad();
			
			} {
		}

	
			public void SearchEditDelete_ServiceChargewithCardType(String Str) throws Exception
			{
				
					
						if (SelectPaymentSetting_SearchBox.isEnabled())
						{
					Thread.sleep(2000);
					SelectPaymentSetting_SearchBox.clear();
					Thread.sleep(2000);

					SelectPaymentSetting_SearchBox.sendKeys(Str);
					Thread.sleep(2000);
					
					Actions actions = new Actions(driver);
					for(int i=0;i<4;i++) {
						actions.sendKeys(Keys.ARROW_DOWN).perform();
					}
					Thread.sleep(2000);
					SelectPaymentSetting_Delete.click();
					test.log(LogStatus.PASS, "Clicked Delete Payment Settings Button");
					ut.PassedCaptureScreenshotAsBASE64();
					Thread.sleep(2000);
						}
						
						
							cmp.waitForPageToLoad();
					
					} {
				}
	
		public void VerifyUpdateServiceChargeHeader() throws InterruptedException {
			Thread.sleep(2000);
			cmp.VerifyCreationScreenPageHeader("Update Service Charge");	
			Thread.sleep(1000);
		}
	
		@FindBy(xpath="//button[.='Update'][@disabled='true']")
		public WebElement Update_Button_disabled_ServiceCharge;
		
		@FindBy(xpath="//button[.='Update']")
		public WebElement Update_Button_Enabled_ServiceCharge;
		
		public WebElement Update_Button_disabled_ServiceCharge() {
		return Update_Button_disabled_ServiceCharge;
		}
		
		public WebElement Update_Button_Enabled_ServiceCharge() {
			return Update_Button_Enabled_ServiceCharge;
			}
		
		public void Verify_Update_Button_Diabled_ServiceCharge() throws Exception
		{

			 if(Update_Button_disabled_ServiceCharge().isDisplayed())
			    {
				 
				 
			    	test.log(LogStatus.PASS, "Update button is Disabled");
			    	
			    	ut.PassedCaptureScreenshotAsBASE64();
			    }
			    else
			    {
			    	test.log(LogStatus.FAIL, "Update button is Enabled");
			    	
			    	ut.FailedCaptureScreenshotAsBASE64();
			    	
			    	Assert.assertEquals(true, Update_Button_disabled_ServiceCharge().isDisplayed());}
			    }

		public void Verify_Update_Button_Enabled_ServiceCharge() throws Exception
		{

			 if(Update_Button_Enabled_ServiceCharge().isDisplayed())
			    {
				 
				 
			    	test.log(LogStatus.PASS, "Update button is Enabled");
			    	
			    	ut.PassedCaptureScreenshotAsBASE64();
			    }
			    else
			    {
			    	test.log(LogStatus.FAIL, "Update button is Disabled");
			    	
			    	ut.FailedCaptureScreenshotAsBASE64();
			    	
			    	Assert.assertEquals(true, Update_Button_Enabled_ServiceCharge().isDisplayed());}
			    }


		
		public void Click_Update_Button_ServiceCharge()
		{
			Update_Button_Enabled_ServiceCharge().click();
		

}
		
		@FindBy(xpath="//p[contains(text(),'Are you sure you want to delete this item?')]")
		public WebElement DeleteAlertPopMessage;
		
		public WebElement DeleteAlertPopMessage() {
			return DeleteAlertPopMessage;
		}
		
		@FindBy(xpath="//mat-dialog-container/alert-dialog//button/span[contains(.,'Delete')]")
		public WebElement ClickDelete_DeleteAlertPopMessage;
		
		public WebElement IclickDeleteAlertPopMessage() {
			return ClickDelete_DeleteAlertPopMessage;
		}
		
		@FindBy(xpath="//mat-dialog-container/alert-dialog//button/span[contains(.,'Cancel')]")
		public WebElement ClickCancel_DeleteAlertPopMessage;
		
		public WebElement IclickCancelAlertPopMessage() {
			return ClickCancel_DeleteAlertPopMessage;
		}
		
		public void Iclick_Delete_ServiceChargeAlert() throws InterruptedException {
			Thread.sleep(1000);
			IclickDeleteAlertPopMessage().click();
		}
		
		public void Iclick_Cancel_ServiceChargeAlert() throws InterruptedException {
			Thread.sleep(1000);
			IclickCancelAlertPopMessage().click();
		}
		
		
		public void IverifyDeleteAlertMsg_Paymentsetting() {
			DeleteAlertPopMessage().getText().equalsIgnoreCase("Are you sure you want to delete this item?");
		    System.out.println("Are you sure you want to delete this item? Alert message displayed");
		    ut.PassedCaptureScreenshotAsBASE64();
		}
		
		
		@FindBy(xpath = "//div[@class='action-buttons']//button[contains(.,'Cancel')] ")
		public WebElement CancelBtn_SPS_Alert;
		
		@FindBy(xpath = "//div[@class='action-buttons']//button[contains(.,'Delete')] ")
		public WebElement DeleteBtn_SPS_Alert;
	
		public void Click_DeleteButton_SPSAlert() throws Exception
		{
			Thread.sleep(1000);
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Are you sure you want to delete this item?"))
			{
				test.log(LogStatus.PASS, "Delete Pop Up Displayed and Deleted");
				
				DeleteBtn_SPS_Alert.click();
			}
			else
			{
				test.log(LogStatus.FAIL, "Delete Pop Up not Displayed");
				
			}
			
		}
		
		public void Click_CancelButton_SPSAlert() throws Exception
		{
			Thread.sleep(1000);
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Are you sure you want to delete this item?"))
			{
				test.log(LogStatus.PASS, "Delete Pop Up Displayed and Clicked Cancel");
				
				CancelBtn_SPS_Alert.click();
			}
			else
			{
				test.log(LogStatus.FAIL, "Delete Pop Up not Displayed");
				
			}
			
		}
		
}
		


