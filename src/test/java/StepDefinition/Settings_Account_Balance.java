package StepDefinition;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_AccountBalance_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_Account_Balance
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;


    LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_AccountBalance_Page ab = new Settings_AccountBalance_Page();
	
	@Given("Open Account Balance home page BaseURL and StoreID")
	public void OpenAccountBalanceHomePage() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"accountBalance");
	}

	@Given("Verifying the Account Balance Header Page")
	public void verifyingTheAccountBalanceHeaderPage()
	{
		//Verify the Account Balance page loaded or not
		cmp.VerifyMainScreenPageHeader("Account Balance");
	}

	@Then("Verify Paid Out Inputbox is Displayed or Not")
	public void verifyPaidOutInputboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.paid_out,"Paid Out Input Field");
	}
	@Then("Verify CC Tip Reduction Inputbox is Displayed or Not")
	public void verifyCCTipReductionInputboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ab.cc_tip,"CC Tip Input Field");
	}
	@Then("Verify Refund Inputbox is Displayed or Not")
	public void verifyRefundInputboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.refund,"Refund Input Field");
	}
	@Then("Verify Deposite Inputbox is Displayed or Not")
	public void verifyDepositeInputboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.deposite,"Deposite Input Field");
	}
	@Then("Verify Over\\/shortage Inputbox is Displayed or Not")
	public void verifyOverShortageInputboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ab.ovr_shortage,"Over/shortage Input Field");
	}
	@Then("Verify Sales Open Items Inputbox is Displayed or Not")
	public void verifySalesOpenItemsInputboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.sales_opn_itm,"Sales Open Item Input Field");
	}
	@Then("Verify Combo Discounts Inputbox is Displayed or Not")
	public void verifyComboDiscountsInputboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.combo_dis,"Combo Discount Input Field");
	}
	@Then("Verify Comp Discounts Inputbox is Displayed or Not")
	public void verifyCompDiscountsInputboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ab.comp_dis,"Comp Discount Input Field");
	}
	@Then("Verify Delivery Charge Cost Inputbox is Displayed or Not")
	public void verifyDeliveryChargeCostInputboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.delevry_charge,"Delivery Charge Input Field");
	}
	@Then("Verify HA and GC Recharge Inputbox is Displayed or Not")
	public void verifyHAAndGCRechargeInputboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.HA_GC,"HA and GC Input Field");
	}
	@Then("Verify Driver Tip Inputbox is Displayed or Not")
	public void verifyDriverTipInputboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ab.Drivr_tip,"Driver Tip Input Field");
	}
	@Then("Verify Promo Discounts Inputbox is Dispkayed or Not")
	public void verifyPromoDiscountsInputboxIsDispkayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.promo_dis,"Promo Discount Input Field");
	}
	@Then("Verify Donation Discounts Inputbox is Displayed or Not")
	public void verifyDonationDiscountsInputboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ab.donation_dis,"Donation Discount Input Field");
	}
	@Then("Verify Loyalty Discounts Inputbox is Displayed or Not")
	public void verifyLoyaltyDiscountsInputboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ab.loyality_dis,"Loyalty Discount Input Field");
	}
	@Given("Clear the Paidout")
	public void clearThePaidout() 
	{
	   ab.paid_out.clear();
	}
	@Given("Enter Paid Out in Special Characters")
	public void enterPaidOutInSpecialCharacters() 
	{
	    ab.paid_out.sendKeys("%^%$^*&*&*&");
	}
	@Then("Verify Account Balance Settings Saved or Not")
	public void verifyAccountBalanceSettingsSavedOrNot() 
	{
		try {
	  if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Account Balance Added Successfully"))
	  {
		  test.log(LogStatus.PASS,"Account Balance Settings Saved Successfully");
		  ut.PassedCaptureScreenshotAsBASE64();
	  }
	  else
	  {
		  test.log(LogStatus.FAIL,"Account Balance Settings not Updated Successfully");
		  ut.FailedCaptureScreenshotAsBASE64();
	  }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Given("Enter Paid Out in AlphaNumeric")
	public void enterPaidOutInAlphaNumeric() 
	{
	    ab.paid_out.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the CC Tip Reduction")
	public void clearTheCCTipReduction()
	{
	  ab.cc_tip.clear();
	}
	@Given("Enter CC Tip Reduction in Special Characters")
	public void enterCCTipReductionInSpecialCharacters()
	{
	   ab.cc_tip.sendKeys("^*&(^^$%$^&");
	}

	@Given("Enter CC Tip Reduction in AlphaNumeric")
	public void enterCCTipReductionInAlphaNumeric() 
	{
	   ab.cc_tip.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Refund")
	public void clearTheRefund() 
	{
	   ab.refund.clear();
	}
	@Given("Enter Refund in Special Characters")
	public void enterRefundInSpecialCharacters() 
	{
	   ab.refund.sendKeys("%^^^&&&@##");
	}
	
	@Given("Enter Refund in AlphaNumeric")
	public void enterRefundInAlphaNumeric() 
	{
	   ab.refund.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Deposit")
	public void clearTheDeposit() 
	{
	    ab.deposite.clear();
	}
	@Given("Enter Deposit in Special Characters")
	public void enterDepositInSpecialCharacters()
	{
	   ab.deposite.sendKeys("^&$@#%$^^");
	}
	
	@Given("Enter Deposit in AlphaNumeric")
	public void enterDepositInAlphaNumeric()
	{
	   ab.deposite.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}
	
    @Given("Clear the Over\\/Shortage")
	public void clearTheOverShortage()
    {
	    ab.ovr_shortage.clear();
	}
	@Given("Enter Over\\/Shortage in Special Characters")
	public void enterOverShortageInSpecialCharacters() 
	{
	   ab.ovr_shortage.sendKeys("&^$#@#$$%");
	}

	@Given("Enter Over\\/Shortage in AlphaNumeric")
	public void enterOverShortageInAlphaNumeric() 
	{
	  ab.ovr_shortage.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Sales Open Items")
	public void clearTheSalesOpenItems()
	{
	  ab.sales_opn_itm.clear();
	}
	@Given("Enter Sales Open Items in Special Characters")
	public void enterSalesOpenItemsInSpecialCharacters() 
	{
	    ab.sales_opn_itm.sendKeys("^$@@#$%%%");
	}
	
	@Given("Enter Sales Open Items in AlphaNumeric")
	public void enterSalesOpenItemsInAlphaNumeric()
	{
	   ab.sales_opn_itm.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Combo Discounts")
	public void clearTheComboDiscounts()
	{
	    ab.combo_dis.clear();
	}
	@Given("Enter Combo Discounts in Special Characters")
	public void enterComboDiscountsInSpecialCharacters() 
	{
	    ab.combo_dis.sendKeys("%%##%%^^&&");	
	}
	
	@Given("Enter Combo Discounts in AlphaNumeric")
	public void enterComboDiscountsInAlphaNumeric()
	{
	    ab.combo_dis.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Comp Discounts")
	public void clearTheCompDiscounts()
	{
	  ab.comp_dis.clear();
	}
	@Given("Enter Comp Discounts in Special Characters")
	public void enterCompDiscountsInSpecialCharacters() 
	{
	   ab.comp_dis.sendKeys("&%%$%$^^&");
	}
	
	@Given("Enter Comp Discounts in AlphaNumeric")
	public void enterCompDiscountsInAlphaNumeric() 
	{
	  ab.comp_dis.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Delivery Charge Cost")
	public void clearTheDeliveryChargeCost() 
	{
	   ab.delevry_charge.clear();
	}
	@Given("Enter Delivery Charge Cost in Special Characters")
	public void enterDeliveryChargeCostInSpecialCharacters()
	{
	  ab.delevry_charge.sendKeys("^&^^&^*&*##@");
	}

	@Given("Enter Delivery Charge Cost in AlphaNumeric")
	public void enterDeliveryChargeCostInAlphaNumeric() 
	{
	  ab.delevry_charge.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the HA and GC Recharge")
	public void clearTheHAAndGCRecharge()
	{
	   ab.HA_GC.clear();
	}
	@Given("Enter HA and GC Recharge in Special Characters")
	public void enterHAAndGCRechargeInSpecialCharacters() 
	{
	    ab.HA_GC.sendKeys("^$#@#$%%!");
	}
	
	@Given("Enter HA and GC Recharge in AlphaNumeric")
	public void enterHAAndGCRechargeInAlphaNumeric()
	{
	  ab.HA_GC.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Driver Tip")
	public void clearTheDriverTip() 
	{
	    ab.Drivr_tip.clear();
	}
	@Given("Enter Driver Tip in Special Characters")
	public void enterDriverTipInSpecialCharacters() 
	{
	  ab.Drivr_tip.sendKeys("$$#%^&**");
	}
	
	@And("Enter Driver Tip in AlphaNumeric")
	public void EnterDriverTipInAlphaNumeric()
	{
		 ab.Drivr_tip.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Tip\\/Gratuity")
	public void clearTheTipGratuity()
	{
		for(int i=1;i<=20;i++)
		{
			 ab.gratiuty_tip.sendKeys(Keys.BACK_SPACE);
		}
	  //ab.gratiuty_tip.clear();
	}
	@Given("Enter Tip\\/Gratuity in Special Characters")
	public void enterTipGratuityInSpecialCharacters() 
	{
	  ab.gratiuty_tip.sendKeys("##$%%^^&&");
	}
	
	@Given("Enter Tip\\/Gratuity in AlphaNumeric")
	public void enterTipGratuityInAlphaNumeric() 
	{
	   ab.gratiuty_tip.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Promo Discounts")
	public void clearThePromoDiscounts() 
	{
		for(int i =1;i<=20;i++) 
		{
			 ab.promo_dis.sendKeys(Keys.BACK_SPACE);
		}
	
	}
	@Given("Enter Promo Discounts in Special Characters")
	public void enterPromoDiscountsInSpecialCharacters() 
	{
	    ab.promo_dis.sendKeys("^%$#%^&&*");
	}

	@Given("Enter Promo Discounts in AlphaNumeric")
	public void enterPromoDiscountsInAlphaNumeric() 
	{
	    ab.promo_dis.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Donation Discounts")
	public void clearTheDonationDiscounts()
	{
		for(int i=1;i<=20;i++) 
		{
			 ab.donation_dis.sendKeys(Keys.BACK_SPACE);
		}
	 
	}
	@Given("Enter Donation Discounts in Special Characters")
	public void enterDonationDiscountsInSpecialCharacters()
	{
	  ab.donation_dis.sendKeys("%^&$^&^*");
	}

	@Given("Enter Donation Discounts in AlphaNumeric")
	public void enterDonationDiscountsInAlphaNumeric()
	{
	   ab.donation_dis.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

	@Given("Clear the Loaylty Discounts")
	public void clearTheLoayltyDiscounts() 
	{
	    ab.loyality_dis.clear();
	}
	@Given("Enter Loaylty Discounts in Special Characters")
	public void enterLoayltyDiscountsInSpecialCharacters()
	{
	    ab.loyality_dis.sendKeys("!#%^&***(");
	}

	@Given("Enter Loaylty Discounts in AlphaNumeric")
	public void enterLoayltyDiscountsInAlphaNumeric()
	{
	   ab.loyality_dis.sendKeys(RandomStringUtils.randomAlphanumeric(20));
	}

}
