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

public class PaymentMethodsPage extends BasePage
{

	
//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Utility ut=new Utility();
	Common_XPaths cmp;
	
	TaxesPage tx;
//	public PaymentMethodsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		PageFactory.initElements(driver, this);
//	}
	
	
	@FindBy(xpath = "//button[contains(.,'PAYMENT METHOD')]")
	public WebElement New_PaymentMethod;
	
	@FindBy(xpath = "//app-selectbox[@name='paymentMethodType']/div/mat-form-field/div/div/div[3]/input")
	public WebElement PaymentType_Inputbox;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Payment Type')]")
	public WebElement Payment_Type_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Priority')]")
	public WebElement Priority_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Amount')]")
	public WebElement Amount_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Open Cash Drawer')]")
	public WebElement Open_Cash_Drawer_Column_Field;
	
	@FindBy(xpath = "//th[@role='columnheader'][contains(.,'Actions')]")
	public WebElement Actions_Column_Field;
	
	public WebElement PaymentType_Inputbox()
	{
		return PaymentType_Inputbox;
	}
	
	
	@FindBy(xpath = "//input[@aria-label='Code']")
	public WebElement Code_Inputbox;
	
	@FindBy(xpath = "//input[@aria-label='Priority']")
	public WebElement Priority_Inputbox;
	
//	public WebElement PaymentMethod_PriorityInputbox()
//	{
//		return pri;
//	}
//	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodIsMultiCurrency']//mat-button-toggle[.='Yes']")
	public WebElement Enable_MultiCurrency_YesToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodIsMultiCurrency']//mat-button-toggle[.='No']")
	public WebElement Enable_MultiCurrency_NoToggle;
	
	@FindBy(xpath = "//input[@aria-label='Currency']")
	public WebElement Currency_Inputbox;
	
	@FindBy(xpath = "//input[@aria-label='Exchange Rate']")
	public WebElement Exchange_Inputbox;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodOpenCashDrawer']//mat-button-toggle[contains(.,'Yes')]")
	public WebElement Open_CashDrawer_YesToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodOpenCashDrawer']//mat-button-toggle[contains(.,'No')]")
	public WebElement Open_CashDrawer_NoToggle;
	
	@FindBy(xpath = "//app-selectbox[@name='paymentMethodModelType']/div/mat-form-field/div/div/div[3]/input")
	public WebElement Model_TypeInputbox;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodIsEbtEnable']//mat-button-toggle[contains(.,'Yes')]")
	public WebElement Enable_EBT_YesToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodIsEbtEnable']//mat-button-toggle[contains(.,'No')]")
	public WebElement Enable_EBT_NoToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodFactor4Cards']//mat-button-toggle[contains(.,'Yes')]")
	public WebElement Factor4Cards_YesToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodFactor4Cards']//mat-button-toggle[contains(.,'No')]")
	public WebElement Factor4Cards_NoToggle;
	
	@FindBy(xpath = "//app-toggle[@name='exemptCashDiscount']//mat-button-toggle[contains(.,'Yes')]")
	public WebElement Exempt_Surcharge_YesToggle;
	
	@FindBy(xpath = "//app-toggle[@name='exemptCashDiscount']//mat-button-toggle[contains(.,'No')]")
	public WebElement Exempt_Surcharge_NoToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodValutecCards']//mat-button-toggle[contains(.,'Yes')]")
	public WebElement Valutec_Cards_YesToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodValutecCards']//mat-button-toggle[contains(.,'No')]")
	public WebElement Valutec_Cards_NoToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodDebit']//mat-button-toggle[contains(.,'Yes')]")
	public WebElement Debit_YesToggle;
	
	@FindBy(xpath = "//app-toggle[@name='paymentMethodDebit']//mat-button-toggle[contains(.,'No')]")
	public WebElement Debit_NoToggle;

	@FindBy(xpath = "//mat-radio-button[contains(.,'Sale')]/label/span[1]")
	public WebElement Sale_DebitInMPPGCard_RadioButton;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Authorize')]/label/span[1]")
	public WebElement Authorize_DebitInMPPGCard_RadioButton;
	
	@FindBy(xpath = "//span[contains(.,'Allowance Reset Periodically')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Allowance_ResetPeriodically_YesToggle;
	
	@FindBy(xpath = "//span[contains(.,'Allowance Reset Periodically')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Allowance_ResetPeriodically_NoToggle;
	
	@FindBy(xpath = "//span[contains(.,'Cash')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Cash_inEvertecPayment_YesToggle;
	
	@FindBy(xpath = "//span[contains(.,'Cash')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Cash_inEvertecPayment_NoToggle;
	
	@FindBy(xpath = "//span[contains(.,'Manual')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Manual_inEvertecPayment_YesToggle;
	
	@FindBy(xpath = "//span[contains(.,'Manual')]/../../div[2]/app-toggle/div/mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Manual_inEvertecPayment_NoToggle;
	
	@FindBy(xpath = "//select-option[contains(.,'Cash')]")
	public WebElement Cash_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Gift Card')]")
	public WebElement GiftCard_PaymentType;
	
	@FindBy(xpath = "//select-option[.=' Credit Card ']")
	public WebElement CreditCard_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Side CC')]")
	public WebElement SideCC_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Bionet Meal Card')]")
	public WebElement Bionet_MealCard_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Castle And Go')]")
	public WebElement CastleAndGo_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'SPPax')]")
	public WebElement SPPax_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Others')]")
	public WebElement Others_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'GiveX')]")
	public WebElement GiveX_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'NMI Tokenization')]")
	public WebElement  NMI_Tokenization_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Dejavoo')]")
	public WebElement Dejavoo_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Optomany')]")
	public WebElement Optomany_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'MPPG Credit Card')]")
	public WebElement MPPG_CreditCard_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Ingenico')]")
	public WebElement Ingenico_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'MemberShip')]")
	public WebElement MemberShip_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Evertec')]")
	public WebElement Evertec_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'PayPal')]")
	public WebElement PayPal_PaymentType;
	
	@FindBy(xpath = "//select-option[contains(.,'Venmo')]")
	public WebElement Venmo_PaymentType;
	
	public void Click_NewPaymentMethod()
	{
		New_PaymentMethod.click();
	}
	
//	public void Enter_PeymentMethod_Code(String str)
//	{
//		PaymentMethod_CodeInputbox.clear();
//		
//		PaymentMethod_CodeInputbox.sendKeys(str);
//	}
	
//	public void Enter_PeymentMethod_Priority(String str)
//	{
//		PaymentMethod_PriorityInputbox.clear();
//		
//		PaymentMethod_PriorityInputbox.sendKeys(str);
//	}
	
	
	public void Select_CashPayment()
	{
		PaymentType_Inputbox.click();
		
		Cash_PaymentType.click();
	}
	
	
	public void Enable_Multi_Currency()
	{
		if(Enable_MultiCurrency_YesToggle.isSelected())
		{
			
		}
		else
		{
			Enable_MultiCurrency_YesToggle.click();
		}
	}
	
	public void Disable_Multi_Currency()
	{
		if(Enable_MultiCurrency_YesToggle.isSelected())
		{
			Enable_MultiCurrency_NoToggle.click();
		}
		else
		{
			
		}
	}
	
	
	public void Select_Currency_inMultiCurrency()
	{
		Currency_Inputbox.click();
		
	List<WebElement> CurrencyList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		int CurrencySize=CurrencyList.size();
		
		if(CurrencySize==0)
		{
			
			Currency_Inputbox.click();
			
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/select-option")).click();
			
		}
		else if(CurrencySize==1)
		{
			
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+CurrencySize+"]/select-option")).click();
			
			
			System.out.println("Selected Currency : "+driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+CurrencySize+"]/select-option")).getText());
			
			test.log(LogStatus.INFO, "Selected Currency as : "+driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+CurrencySize+"]/select-option")).getText());
			
		}
		else if(CurrencySize<=10)
		{
		int randomCurrency=ThreadLocalRandom.current().nextInt(1, CurrencySize);
		
		
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomCurrency+"]/select-option")).click();
	
		
		System.out.println("Selected Currency : "+driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomCurrency+"]/select-option")).getText());
		
		test.log(LogStatus.INFO, "Selected Currency as : "+driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomCurrency+"]/select-option")).getText());
		}
		else
		{
			int randomCurrency=ThreadLocalRandom.current().nextInt(1, 10);
			
			
			System.out.println("Selected Currency : "+driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomCurrency+"]/select-option")).getText());
			
			test.log(LogStatus.INFO, "Selected Currency as : "+driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomCurrency+"]/select-option")).getText());
		
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomCurrency+"]/select-option")).click();
		
		
		}
		
		List<WebElement> CurrencyList1=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));

		if(CurrencyList1.size()!=0)
		{
			Currency_Inputbox.click();

		}
	}
	
	public void Enter_ExchangeRate(String str)
	{
		Exchange_Inputbox.clear();
		
		Exchange_Inputbox.sendKeys(str);
	}
	
	
	public void Enable_OpenCashDrawer()
	{
		if(Open_CashDrawer_YesToggle.isSelected())
		{
			
		}
		else
		{
			Open_CashDrawer_YesToggle.click();
		}
	}
	
	public WebElement Open_CashDrawer_YesToggle()
	{
		return Open_CashDrawer_YesToggle;
	}
	
	public void Disable_OpenCashDrawer()
	{
		if(Open_CashDrawer_YesToggle.isSelected())
		{
			Open_CashDrawer_NoToggle.click();
		}
		else
		{
			
		}
	}
	
	public void Select_GiftCard_Payment()
	{
		PaymentType_Inputbox.click();
		
		GiftCard_PaymentType.click();
	}
	
	public void Select_CreditCard_Payment()
	{
		PaymentType_Inputbox.click();
		
		CreditCard_PaymentType.click();
	}
	
	public void Select_SideCC_Payment()
	{
		PaymentType_Inputbox.click();
		
		SideCC_PaymentType.click();
	}
	
	public void Select_Bionet_MealCard_Payment()
	{
		PaymentType_Inputbox.click();
		
		Bionet_MealCard_PaymentType.click();
	}
	
	public void Select_CastleAndGo_Payment()
	{
		PaymentType_Inputbox.click();
		
		CastleAndGo_PaymentType.click();
	}
	
	public void Select_SPPax_Payment()
	{
		PaymentType_Inputbox.click();
		
		SPPax_PaymentType.click();
		
		
		Model_TypeInputbox.click();
		
	List<WebElement> ModelTypeList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		int ModelTypeSize=ModelTypeList.size();
		
		if(ModelTypeSize==0)
		{
			Model_TypeInputbox.click();

			
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/select-option")).click();

		}
		else if(ModelTypeSize==1)
		{
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+ModelTypeSize+"]/select-option")).click();

		}
		else
		{
		int randomModelType=ThreadLocalRandom.current().nextInt(1, ModelTypeSize);
		
		System.out.println("Selected Model Type : "+driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomModelType+"]/select-option")).getText());

		test.log(LogStatus.INFO, "Selected Model Type as : "+driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomModelType+"]/select-option")).getText());

		
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomModelType+"]/select-option")).click();
		}
		
		List<WebElement> ModelTypeList1=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));

		if(ModelTypeList1.size()!=0)
		{
			Model_TypeInputbox.click();

		}
	}
	
	public void Enable_EBT()
	{
		if(Enable_EBT_YesToggle.isSelected())
		{
			
		}
		else
		{
			Enable_EBT_YesToggle.click();
		}
	}
	
	public void Disable_EBT()
	{
		if(Enable_EBT_YesToggle.isSelected())
		{
			Enable_EBT_NoToggle.click();
		}
		else
		{
			
		}
	}
	
	
	public void Enable_Factor4Cards()
	{
		if(Factor4Cards_YesToggle.isSelected())
		{
			
		}
		else
		{
			Factor4Cards_YesToggle.click();
		}
	}
	
	public void Disable_Factor4Cards()
	{
		if(Factor4Cards_YesToggle.isSelected())
		{
			Factor4Cards_NoToggle.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Exempt_Surcharge()
	{
		if(Exempt_Surcharge_YesToggle.isSelected())
		{
			
		}
		else
		{
			Exempt_Surcharge_YesToggle.click();
		}
	}
	
	public WebElement Exempt_Surcharge_YesToggle()
	{
		return Exempt_Surcharge_YesToggle;
	}
	
	public void Disable_Exempt_Surcharge()
	{
		if(Exempt_Surcharge_YesToggle.isSelected())
		{
			Exempt_Surcharge_NoToggle.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Valutec_Cards()
	{
		if(Valutec_Cards_YesToggle.isSelected())
		{
			
		}
		else
		{
			Valutec_Cards_YesToggle.click();
		}
	}
	
	public void Disable_Valutec_Cards()
	{
		if(Valutec_Cards_YesToggle.isSelected())
		{
			Valutec_Cards_NoToggle.click();
		}
		else
		{
			
		}
	}
	
	
	public void Select_Others_Payment()
	{
		PaymentType_Inputbox.click();
		
		Others_PaymentType.click();
	}
	
	
	public void Select_GiveX_Payment()
	{
		PaymentType_Inputbox.click();
		
		GiveX_PaymentType.click();
	}
	
	
	public void Select_NMI_Tokenization_Payment()
	{
		PaymentType_Inputbox.click();
		
		NMI_Tokenization_PaymentType.click();
	}
	
	public void Select_Dejavoo_Payment()
	{
		PaymentType_Inputbox.click();
		
		Dejavoo_PaymentType.click();
	}
	
	public void Select_Optomany_Payment()
	{
		PaymentType_Inputbox.click();
		
		Optomany_PaymentType.click();
	}
	
	public void Select_MPPG_CreditCard_Payment()
	{
		PaymentType_Inputbox.click();
		
		MPPG_CreditCard_PaymentType.click();
	}
	
	public WebElement Sale_DebitInMPPGCard_RadioButton()
	{
		return Sale_DebitInMPPGCard_RadioButton;
	}
	
	public WebElement Authorize_DebitInMPPGCard_RadioButton()
	{
		return Authorize_DebitInMPPGCard_RadioButton;
	}
	
	public void Select_Ingenico_Payment()
	{
		PaymentType_Inputbox.click();
		
		Ingenico_PaymentType.click();
	}
	
	public void Select_MemberShip_Payment()
	{
		PaymentType_Inputbox.click();
		
		MemberShip_PaymentType.click();
	}
	
	public void Enable_Allowance_ResetPeriodically()
	{
		if(Allowance_ResetPeriodically_YesToggle.isSelected())
		{
			
		}
		else
		{
			Allowance_ResetPeriodically_YesToggle.click();
		}
	}
	
	public void Disable_Allowance_ResetPeriodically()
	{
		if(Allowance_ResetPeriodically_YesToggle.isSelected())
		{
			Allowance_ResetPeriodically_NoToggle.click();
		}
		else
		{
			
		}
	}
	
	public void Select_Evertec_Payment()
	{
		PaymentType_Inputbox.click();
		
		Evertec_PaymentType.click();
	}
	
	public void Enable_Cash_inEvertecPayment()
	{
		if(Cash_inEvertecPayment_YesToggle.isSelected())
		{
			
		}
		else
		{
			Cash_inEvertecPayment_YesToggle.click();
		}
	}
	
	public void Disable_Cash_inEvertecPayment()
	{
		if(Cash_inEvertecPayment_YesToggle.isSelected())
		{
			Cash_inEvertecPayment_NoToggle.click();
		}
		else
		{
			
		}
	}
	
	public void Enable_Manual_inEvertecPayment()
	{
		if(Manual_inEvertecPayment_YesToggle.isSelected())
		{
			
		}
		else
		{
			Manual_inEvertecPayment_YesToggle.click();
		}
	}
	
	public void Disable_Manual_inEvertecPayment()
	{
		if(Manual_inEvertecPayment_YesToggle.isSelected())
		{
			Manual_inEvertecPayment_NoToggle.click();
		}
		else
		{
			
		}
	}
	
//	public WebElement Cash_Evertec()
//	{
//		return Cash_inEvertecPayment_YesToggle
//	}
	
	
	public void Select_PayPal_Payment()
	{
		PaymentType_Inputbox.click();
		
		PayPal_PaymentType.click();
	}
	
	public void Select_Venmo_Payment()
	{
		PaymentType_Inputbox.click();
		
		Venmo_PaymentType.click();
	}
}
