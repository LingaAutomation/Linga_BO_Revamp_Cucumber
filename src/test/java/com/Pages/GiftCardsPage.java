package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class GiftCardsPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	Common_XPaths cmp=new Common_XPaths();
	Utility ut=new Utility();
	
//	public GiftCardsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'NEW GIFT CARD')]")
	WebElement New_GiftCard;
	
	@FindBy(xpath = "//label[contains(.,'Card Number')]/../../input")
	public WebElement GiftCardNumberInputBox;
	
	@FindBy(xpath = "//label[contains(.,'Balance')]/../../input")
	public WebElement BalanceInputBox;
	
	@FindBy(xpath = "//label[contains(.,'Recharge')]/../../input")
	public WebElement RechargeInputBox;
	
	@FindBy(xpath = "//app-radio-box-button/div/div/div/div[contains(.,'Cash')]")
	WebElement Cash_PaymentBtn;
	
	@FindBy(xpath = "//app-radio-box-button/div/div/div/div[contains(.,'Card')]")
	WebElement Card_PaymentBtn;
	
	@FindBy(xpath = "//app-radio-box-button/div/div/div/div[contains(.,'Discount 100%')]")
	WebElement Discount100Per_PaymentBtn;
	
	@FindBy(xpath = "//label[contains(.,'Last 4 Digits')]/../../input")
	public WebElement Last4DigitsInputBox;
	
	@FindBy(xpath = "//label[contains(.,'Card Type')]/../../input")
	public WebElement CardTypeInputBox;
	
	@FindBy(xpath = "//select-option[contains(.,'Visa')]")
	public WebElement Visa_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Master')]")
	public WebElement Master_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Amex')]")
	public WebElement Amex_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Diners')]")
	public WebElement Diners_CardType;
	
	@FindBy(xpath = "//select-option[contains(.,'Others')]")
	public WebElement Others_CardType;
	
	@FindBy(xpath = "//button[contains(.,'Edit')]")
	WebElement EditGC_Btn;
	
	@FindBy(xpath = "//button[contains(.,'Edit')]")
	WebElement CopyGC_Btn;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	WebElement DeleteGC_Btn;
	
	@FindBy(xpath = "//button[contains(.,'Recharge')]")
	WebElement RechargeGC_Btn;
	
	
	
	
	public void Click_Edit_GiftCardButton(String str) throws Exception
	{
		Thread.sleep(1000);
		cmp=new Common_XPaths();
		cmp.SearchBox.clear();
		Thread.sleep(1000);

		cmp.SearchBox.sendKeys(str);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tr[contains(.,'"+str+"')]/td[3]/div/button")).click();
		
		Thread.sleep(1000);
		
		EditGC_Btn.click();
	}
	
	public void Click_Copy_GiftCardButton(String str) throws Exception
	{
		Thread.sleep(1000);
		cmp=new Common_XPaths();
		cmp.SearchBox.clear();
		Thread.sleep(1000);

		cmp.SearchBox.sendKeys(str);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tr[contains(.,'"+str+"')]/td[3]/div/button")).click();
		
		Thread.sleep(1000);
		
		CopyGC_Btn.click();
	}
	
	
	public void Click_Delete_GiftCardButton(String str) throws Exception
	{
		cmp=new Common_XPaths();

		Thread.sleep(1000);

		cmp.SearchBox.clear();
		Thread.sleep(1000);

		cmp.SearchBox.sendKeys(str);
		
		Thread.sleep(3500);
		driver.findElement(By.xpath("//tr[contains(.,'"+str+"')]/td[3]/div/button")).click();
		
		Thread.sleep(1000);
		
		DeleteGC_Btn.click();
	}
	
	public void Click_Recharge_GiftCardButton(String str) throws Exception
	{
		cmp=new Common_XPaths();

		Thread.sleep(1000);

		cmp.SearchBox.clear();
		Thread.sleep(1000);

		cmp.SearchBox.sendKeys(str);
		Thread.sleep(3500);
		driver.findElement(By.xpath("//tr[contains(.,'"+str+"')]/td[3]/div/button")).click();
		
		Thread.sleep(1000);
		
		RechargeGC_Btn.click();
		Thread.sleep(500);
		BalanceInputBox.clear();
		Thread.sleep(500);
		BalanceInputBox.sendKeys("30000");
		Thread.sleep(500);
		try
		{
			
		if(Cash_PaymentBtn.isDisplayed())
		{
		Cash_PaymentBtn.click();
		}
		}
		catch(Exception g)
		{
//			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Select Payment Methods"))
//			{
//				test.log(LogStatus.INFO, "Payment Methods not Displayed");
//				
//				ut.FailedCaptureScreenshotAsBASE64();
//
//				cmp.Click_CancelButton();
//			}
		}
	
	
	}
	
	public void Click_NewGiftCard() throws Exception
	{
//		cmp.Wait_ForElementVisibility(New_GiftCard, 30);
		Thread.sleep(3000);
		New_GiftCard.click();
	}
	
	public void Enter_GiftCardNumber(String str) throws Exception
	{
		
		Thread.sleep(500);
		GiftCardNumberInputBox.clear();
		Thread.sleep(500);
		GiftCardNumberInputBox.sendKeys(str);
	}
	
	public void Enter_GiftCardBalance(String str) throws Exception
	{
		Thread.sleep(500);
		BalanceInputBox.clear();
		Thread.sleep(500);
		BalanceInputBox.sendKeys(str);
	}
	
	public void Enter_GiftCard_RechargeBalance(String str) throws Exception
	{
		Thread.sleep(500);
		RechargeInputBox.clear();
		Thread.sleep(500);
		RechargeInputBox.sendKeys(str);
	}
	
	public void Select_GiftCard_Cash(String str) throws Exception
	{
		Thread.sleep(1000);
		GiftCardNumberInputBox.clear();
		Thread.sleep(1000);
		GiftCardNumberInputBox.sendKeys(str);
		
		
		Thread.sleep(1000);
		BalanceInputBox.clear();
		Thread.sleep(1000);
		BalanceInputBox.sendKeys("50.00");
		
		Thread.sleep(1000);
		Cash_PaymentBtn.click();
	}
	
	public void Select_GiftCard_Discount(String str) throws Exception
	{
		Thread.sleep(1000);
		GiftCardNumberInputBox.clear();
		Thread.sleep(1000);
		GiftCardNumberInputBox.sendKeys(str);
		
		
		Thread.sleep(1000);
		BalanceInputBox.clear();
		Thread.sleep(1000);
		BalanceInputBox.sendKeys("500.00");
		
//		Removed this discount 100 per
		Thread.sleep(1000);
		try
		{
		Discount100Per_PaymentBtn.click();  
		}
		catch(Exception y)
		{
			try
			{
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Select Payment Methods"))
			{
				test.log(LogStatus.INFO, "Payment Methods not Displayed");
				
				ut.FailedCaptureScreenshotAsBASE64();

				BalanceInputBox.sendKeys("600.00");

//				cmp.Click_CancelButton();
			}}
			catch(Exception g)
			{
				ut.FailedCaptureScreenshotAsBASE64();
				
//				cmp.Click_CancelButton();
			}
		}
	}
	
	public void Select_VisaCard(String str) throws Exception
	{
//		Thread.sleep(1000);
//		CardBtn.click();
//		
		Thread.sleep(1000);
		GiftCardNumberInputBox.clear();
		Thread.sleep(1000);
		GiftCardNumberInputBox.sendKeys(str);
		
		
		Thread.sleep(1000);
		BalanceInputBox.clear();
		
	
		Thread.sleep(1000);
		BalanceInputBox.sendKeys("100.00");
		
		Thread.sleep(1000);
		try
		{
		if(Card_PaymentBtn.isDisplayed())
		{
		Card_PaymentBtn.click();
		
		
		Thread.sleep(500);
		CardTypeInputBox.click();
		
		Thread.sleep(500);
		Visa_CardType.click();
		
		Thread.sleep(500);
		Last4DigitsInputBox.clear();
		Thread.sleep(500);
		Last4DigitsInputBox.sendKeys("1234");
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.INFO, "Payment Methods not Displayed");
		}
		
	}
	
	public void Select_MasterCard(String str) throws Exception
	{
		
		Thread.sleep(1000);
		GiftCardNumberInputBox.clear();
		Thread.sleep(1000);
		GiftCardNumberInputBox.sendKeys(str);
		
		
		Thread.sleep(1000);
		BalanceInputBox.clear();

		Thread.sleep(1000);
		BalanceInputBox.sendKeys("150.00");
		
		try
		{
		Thread.sleep(1000);
		if(Card_PaymentBtn.isDisplayed())
		{
		Thread.sleep(1000);
		Card_PaymentBtn.click();
		
		
		Thread.sleep(500);
		CardTypeInputBox.click();
		
		Thread.sleep(500);
		Master_CardType.click();
		
		Thread.sleep(500);
		Last4DigitsInputBox.clear();
		Thread.sleep(500);
		Last4DigitsInputBox.sendKeys("1234");
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.INFO, "Payment Methods not Displayed");
		}
		
	}
	
	public void Enter_Last4Digits(String str) throws Exception
	{
		Thread.sleep(1000);
		Last4DigitsInputBox.clear();
		Thread.sleep(500);
		Last4DigitsInputBox.sendKeys(str);
	}
	
	public void Select_AmexCard(String str) throws Exception
	{
		
		Thread.sleep(1000);
		GiftCardNumberInputBox.clear();
		Thread.sleep(1000);
		GiftCardNumberInputBox.sendKeys(str);
		
		
		Thread.sleep(1000);
		BalanceInputBox.clear();
	
		Thread.sleep(1000);
		BalanceInputBox.sendKeys("200.00");
		
		Thread.sleep(1000);
		try
		{
		if(Card_PaymentBtn.isDisplayed())
		{
		Thread.sleep(1000);
		Card_PaymentBtn.click();
		
		
		Thread.sleep(500);
		CardTypeInputBox.click();
		
		Thread.sleep(500);
		Amex_CardType.click();
		
		Thread.sleep(500);
		Last4DigitsInputBox.clear();
		Thread.sleep(500);
		Last4DigitsInputBox.sendKeys("1234");
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.INFO, "Payment Methods not Displayed");
		}
	}
	
	public void Select_DinersCard(String str) throws Exception
	{
		
		Thread.sleep(1000);
		GiftCardNumberInputBox.clear();
		Thread.sleep(1000);
		GiftCardNumberInputBox.sendKeys(str);
		
		
		Thread.sleep(1000);
		BalanceInputBox.clear();
		
		Thread.sleep(1000);
		BalanceInputBox.sendKeys("250.00");
		
		Thread.sleep(1000);
		try
		{
		if(Card_PaymentBtn.isDisplayed())
		{
		Thread.sleep(1000);
		Card_PaymentBtn.click();
		
		
		Thread.sleep(500);
		CardTypeInputBox.click();
		
		Thread.sleep(500);
		Diners_CardType.click();
		
		Thread.sleep(500);
		Last4DigitsInputBox.clear();
		Thread.sleep(500);
		Last4DigitsInputBox.sendKeys("1234");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.INFO, "Payment Methods not Displayed");
		}
		
	}
	
	public void Select_OthersCard(String str) throws Exception
	{
		
		Thread.sleep(1000);
		GiftCardNumberInputBox.clear();
		Thread.sleep(1000);
		GiftCardNumberInputBox.sendKeys(str);
		
		
		Thread.sleep(1000);
		BalanceInputBox.clear();
		Thread.sleep(1000);
		BalanceInputBox.sendKeys("300.00");
		
		Thread.sleep(1000);
		try
		{
		if(Card_PaymentBtn.isDisplayed())
		{
		Thread.sleep(1000);
		Card_PaymentBtn.click();
		
		Thread.sleep(500);
		CardTypeInputBox.click();
		
		Thread.sleep(500);
		Others_CardType.click();
		
		Thread.sleep(500);
		Last4DigitsInputBox.clear();
		Thread.sleep(500);
		Last4DigitsInputBox.sendKeys("1234");
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.INFO, "Payment Methods not Displayed");
		}
		
	}
	
	public void Select_PaymentMethod_Cash() throws Exception
	{
		Thread.sleep(1000);
		Cash_PaymentBtn.click();
	}
	
	public void Select_PaymentMethod_Card() throws Exception
	{
		Thread.sleep(1000);
		Card_PaymentBtn.click();
	}
	
	public void Select_PaymentMethod_Discount() throws Exception
	{
		Thread.sleep(1000);
		Discount100Per_PaymentBtn.click();
	}
	
	
	
	
}