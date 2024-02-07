package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.Availability_RestrictionTimePage;
import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.GiftCardsPage;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.SubCategoriesPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import bsh.util.Util;
import io.cucumber.java.en.*;

public class Product_and_Items_Gift_Cards 
{
	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	GiftCardsPage gcp=new GiftCardsPage();
	
	
	
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	SoftAssert sa=new SoftAssert();
	
	Availability_RestrictionTimePage al=new Availability_RestrictionTimePage();
	String Bef_Rech_Balance, Aft_Rech_Balance; 
	
	@Given("Open the Gift Cards home page BaseURL and StoreID")
	public void openTheGiftCardsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Gift Card page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"giftCard");

	}


	
	@Given("Verifying the Gift Cards Header Page")
	public void verifyingTheGiftCardsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Gift Cards page loeded or not
		cmp.VerifyMainScreenPageHeader("Gift Cards");	
	}

	@Given("I Click the New Gift Card button")
	public void iClickTheNewGiftCardButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Click the New Gift Cards
		gcp.Click_NewGiftCard();
	}
	
	@When("Verify the New Gift Card Header")
	public void verifyTheNewGiftCardHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		
		//Verify the New Gift Card creation screen opened or not
		cmp.VerifyCreationScreenPageHeader("New Gift Card");
		Thread.sleep(2000);
	}

	@Given("I Click the Save button without Entering Gift Card Number")
	public void iClickTheSaveButtonWithoutEnteringGiftCardNumber() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		gcp.GiftCardNumberInputBox.clear();
		
		Thread.sleep(1000);
		gcp.Enter_GiftCardBalance("1000");
		
		Thread.sleep(1000);
		gcp.Select_PaymentMethod_Cash();
		
		Thread.sleep(1000);
//		cmp.Check_Button_Disabled(cmp.Save_Button(), "Save button not Enabld without Gift Card Number");
		
		if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
		Thread.sleep(3000);
		//Check whether the New Course Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Name"))
		{
			test.log(LogStatus.PASS, "Please Enter Name Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Name Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.INFO, "Save button not Enabled without Entering Gratuity Name");
			
			
		}
		
		
	}
	
	@Then("Check Please Enter Gift Card Number Error is Displayed")
	public void checkPleaseEnterGiftCardNumberErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_in_Confirmation_Displayed(cmp.ConfirmationAlertMsg(), "Please Enter Gift Card Number");

	}

	@Then("Check Please Select Payment Methods Error is Displayed")
	public void checkPleaseSelectPaymentMethodsErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_in_Confirmation_Displayed(cmp.ConfirmationAlertMsg(), "Please Select Payment Methods");
	}


	
	@Then("I Enter the Gift Card Number Exceeding the limit")
	public void iEnterTheGiftCardNumberExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Verify_Enter_Excess_Limit_InputBox(gcp.GiftCardNumberInputBox, "123456789012345678901234567890",25);
	}
	
	@Given("I Enter the Gift Card Number")
	public void iEnterTheGiftCardNumber() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Enter the Gift Card Name
		gcp.Enter_GiftCardNumber(Utility.getProperty("GiftCard_Number"));
	}
	
	@Then("I Enter the Balance Exceeding the limit")
	public void iEnterTheBalanceExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Verify_Enter_Excess_Limit_InputBox(gcp.BalanceInputBox, "12345678901234567890",16);

	}

	@Given("I Enter Special Characters in Card Number")
	public void iEnterSpecialCharactersInCardNumber() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Gift Card Name
		gcp.Enter_GiftCardNumber("*&&^^^^");
	}
	
	@Then("Check Please Enter Valid Gift Card Number Error is Displayed")
	public void checkPleaseEnterValidGiftCardNumberErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_in_Confirmation_Displayed(cmp.ConfirmationAlertMsg(), "Please Enter Valid Gift Card Number");
	}

	@Given("I Enter Alphabets in Card Number")
	public void iEnterAlphabetsInCardNumber() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Enter_GiftCardNumber("RAJA");
	}
	
	
	@Given("I Enter the Balance")
	public void iEnterTheBalance() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Enter_GiftCardBalance("2000");
	}
	@Given("I Enter the New Balance")
	public void iEnterTheNewBalance() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Enter_GiftCardBalance("20000");
	}
	
	@Given("I Enter the Recharge Balance")
	public void iEnterTheRechargeBalance() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Enter_GiftCard_RechargeBalance("25000");
	}
	
	@Then("Verify whether the Gift Card Saved without Selecting Payment Method or Not")
	public void verifyWhetherTheGiftCardSavedWithoutSelectingPaymentMethodOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		Thread.sleep(2000);
		//Enter the Gift Card Name
		gcp.Enter_GiftCardNumber(Utility.getProperty("GiftCard_Number"));
		
		Thread.sleep(1000);
		gcp.Enter_GiftCardBalance("500");
		
		Thread.sleep(2000);
		//Click the Save button
		cmp.Click_SaveButton();
		
		
		Thread.sleep(3000);
		//Check whether the New Gift Card Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Select Payment Methods"))
		{
			test.log(LogStatus.PASS, "Please Select Payment Methods Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			
			cmp.Check_Element_or_Text_in_Confirmation_Displayed(cmp.ConfirmationAlertMsg(), "Please Select Payment Methods");
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Select Payment Methods Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}

	@Given("I Select the Payment Method as Cash")
	public void iSelectThePaymentMethodAsCash() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Select_PaymentMethod_Cash();
	}
	
	@Then("Verify whether the Gift Card Saved or Not")
	public void verifyWhetherTheGiftCardSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Gift Card Saved");
	}

	@Given("I Select the Payment Method as Card")
	public void iSelectThePaymentMethodAsCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Select_PaymentMethod_Card();
	}


	@Then("I Enter the Last Four Digits")
	public void iEnterTheLastFourDigits() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Enter_Last4Digits("9220");
	}
	@Then("Check Please Select Card Type Error is Displayed")
	public void checkPleaseSelectCardTypeErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_in_Confirmation_Displayed(cmp.ConfirmationAlertMsg(), "Please Select CardType");
	}
	@Then("I Select the Card Type as Visa")
	public void iSelectTheCardTypeAsVisa() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(gcp.CardTypeInputBox, "Visa", "Visa Card Type is Selected");
	}
	@Then("I Enter the Alphabets in Last Four Digits")
	public void iEnterTheAlphabetsInLastFourDigits() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Enter_Last4Digits("abcd");
	}
	@Then("Check Please Enter Valid Last Four Characters Error is Displayed")
	public void checkPleaseEnterValidLastFourCharactersErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_in_Confirmation_Displayed(cmp.ConfirmationAlertMsg(), "Please Enter Valid Last 4 Characters");
	}
	@Then("I Enter the Special Characters in Last Four Digits")
	public void iEnterTheSpecialCharactersInLastFourDigits() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 gcp.Enter_Last4Digits("*%&*");
	}

	@Given("I Select the Card Type as Master")
	public void iSelectTheCardTypeAsMaster() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSelection(gcp.CardTypeInputBox, "Master", "Master Card Type is Selected");
	}

	@Given("I Select the Card Type as Amex")
	public void iSelectTheCardTypeAsAmex() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSelection(gcp.CardTypeInputBox, "Amex", "Amex Card Type is Selected");
	}
	
	@Given("I Select the Card Type as Diners")
	public void iSelectTheCardTypeAsDiners() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSelection(gcp.CardTypeInputBox, "Diners", "Diners Card Type is Selected");
	}

	@Given("I Select the Card Type as Others")
	public void iSelectTheCardTypeAsOthers() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSelection(gcp.CardTypeInputBox, "Others", "Others Card Type is Selected");
	}

	@Given("I Select the Payment Method as Discount")
	public void iSelectThePaymentMethodAsDiscount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gcp.Select_PaymentMethod_Discount();
	}
	
	@Given("I Search and Edit the Gift Card")
	public void iSearchAndEditTheGiftCard() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Search the Gift Cards to Click Edit and Cancel
		gcp.Click_Edit_GiftCardButton(Utility.getProperty("GiftCard_Number"));
	}
	@When("Verify the Update Gift Card Header")
	public void verifyTheUpdateGiftCardHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Gift Card");
	}

@Then("I Verify Gift Card Update screen Close or Not")
public void iVerifyGiftCardUpdateScreenCloseOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Close_Cancel_CreationScreen("Update Gift Card");
}


@When("I Clear the Gift Card Number")
public void iClearTheGiftCardNumber() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    gcp.GiftCardNumberInputBox.clear();
}

//@Then("Verify whether the Gift Card is Updated without Number or Not")
//public void verifyWhetherTheGiftCardIsUpdatedWithoutNumberOrNot() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@Given("I Take the Previous Balance Amount")
public void iTakeThePreviousBalanceAmount() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);
    String Bef_Balance=gcp.BalanceInputBox.getAttribute("value");
    this.Bef_Rech_Balance=Bef_Balance;
}


@Given("Verify the Gift Card Balance is Updated or Not")
public void verifyTheGiftCardBalanceIsUpdatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Search(Utility.getProperty("GiftCard_Number"));
    
    Thread.sleep(3000);
    String Aft_Balance=driver.findElement(By.xpath("//td[.=' "+Utility.getProperty("GiftCard_Number")+" ']/../td[2]")).getText();
    
    if(Bef_Rech_Balance.equals(Aft_Balance))
    {
    	test.log(LogStatus.PASS, "Balance Updated Successfully");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(Bef_Rech_Balance, Aft_Balance, "Balance Updated Successful");
    }
    else
    {
    	test.log(LogStatus.FAIL, "Balance Update Failed");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    }
}



@Then("Verify the Gift Card is Updated or Not")
public void verifyTheGiftCardIsUpdatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 cmp.VerifySaveConfirmationAlertMessage("Gift Card Updated");
}

@Given("I Clear the Gift Card Balance")
public void iClearTheGiftCardBalance() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    gcp.BalanceInputBox.clear();
}
@Then("Verify whether the Gift Card is Updated without Balance or Not")
public void verifyWhetherTheGiftCardIsUpdatedWithoutBalanceOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 cmp.Search(Utility.getProperty("GiftCard_Number"));
	    
	    Thread.sleep(3000);
	    String Aft_Balance=driver.findElement(By.xpath("//td[.=' "+Utility.getProperty("GiftCard_Number")+" ']/../td[2]")).getText();
	    
	
	Assert.assertEquals("0.00", Aft_Balance, "Balance Updated Successful");
}


@Given("I Search the Gift Card and Click the Recharge button")
public void iSearchTheGiftCardAndClickTheRechargeButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	gcp.Click_Recharge_GiftCardButton(Utility.getProperty("GiftCard_Number"));
}

@Given("I Take the After Balance Amount")
public void iTakeTheAfterBalanceAmount() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 Thread.sleep(2000);
	    String Aft_Balance=gcp.RechargeInputBox.getAttribute("value");
	    this.Aft_Rech_Balance=Aft_Balance;
}


@Given("Verify the Gift Card Balance is Added to the Existing Balance or Not")
public void verifyTheGiftCardBalanceIsAddedToTheExistingBalanceOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	
	double Rech_Bef=Double.parseDouble(Bef_Rech_Balance);
	
	double Rech_Aft=Double.parseDouble(Aft_Rech_Balance);
	
double Expected_RechBalance=Rech_Bef+Rech_Aft;
    
    String Expected_RechangeBalance=String.valueOf(Expected_RechBalance);
	
    cmp.Search(Utility.getProperty("GiftCard_Number"));
    
    Thread.sleep(3000);
    String Aft_Balance=driver.findElement(By.xpath("//td[.=' "+Utility.getProperty("GiftCard_Number")+" ']/../td[2]")).getText();
    
   
    
    
    
    
    if(Aft_Balance.equals(Expected_RechangeBalance))
    {
    	test.log(LogStatus.PASS, "Balance Recharged Successfully");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(Aft_Balance, Expected_RechangeBalance, "Balance Recharged Successful");
    }
    else
    {
    	test.log(LogStatus.FAIL, "Balance Update Failed");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    }
}

@Given("I Search the Gift Card and Click the Delete button")
public void iSearchTheGiftCardAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	//Search and Click Delete button
	gcp.Click_Delete_GiftCardButton(Utility.getProperty("GiftCard_Number"));
	
	Thread.sleep(500);
	//Click the Delete button
	cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
}

@Then("Verify the Cancelled Gift Card Inactivated or Not")
public void verifyTheCancelledGiftCardInactivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gift Card Inactivated Successfully"))
	{
		test.log(LogStatus.FAIL, "Gift Card Deleted when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Gift Card not Deleted when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

@Then("I Verifying the Gift Card Deleted or Not")
public void iVerifyingTheGiftCardDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Gift Card Inactivated");
}
@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Gift Card")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedGiftCard() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Enable the Inactive Status
	cmp.Click_ActivetoInactiveButton();
	
	//Check whether the Inactive screen opened or not
	cmp.VerifyActive_InactiveStatus("Inactive");
	
	Thread.sleep(3000);
	cmp.Verify_Search(Utility.getProperty("GiftCard_Number"));
}

@Given("I Search the Gift Card and Click the Active button")
public void iSearchTheGiftCardAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("GiftCard_Number"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
}
@Then("Verify the Cancelled Gift Card is Activated or Not")
public void verifyTheCancelledGiftCardIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	Thread.sleep(3000);
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gift Card Activated Successfully"))
	{
		test.log(LogStatus.FAIL, "Gift Card Activated when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Gift Card not Activated when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}


@Then("I Verifying the Gift Card Activated or Not")
public void iVerifyingTheGiftCardActivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Gift Card Activated");
}
@Then("I Click the Active button to navigate Activated screen to Verify Activated Gift Card")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedGiftCard() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	//Verify whether the Gift Card activated or not
	cmp.Verify_Search(Utility.getProperty("GiftCard_Number"));
}


@Then("Verify whether the Duplicate Gift Card is Saved or Not")
public void verifyWhetherTheDuplicateGiftCardIsSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
//	Thread.sleep(5000);
	//Check whether the New Gift Card Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Gift Card Name already exist pop up displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		Thread.sleep(2000);
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gift Card Saved Successfully"))
	{
		test.log(LogStatus.FAIL, "Duplicate Gift Card Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Gift Card Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
		Thread.sleep(2000);
		cmp.Click_CancelButton();
		
		System.out.println("Cancel button not Clicked while creating Duplicate Gift Card");
	}
	catch(Exception k)
	{}
}

@When("I Enter the New Gift Card Number with Space")
public void iEnterTheNewGiftCardNumberWithSpace() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.EnterName(Utility.getProperty("GiftCard_Number")+Keys.SPACE);
}

@Then("Verify whether the Gift Card Number with Space in end is Updated or Not")
public void verifyWhetherTheGiftCardNumberWithSpaceInEndIsUpdatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Gift Card Updated Successfully"))
	{
		test.log(LogStatus.PASS, "Gift Card Updated with Space in the End of Gift Card Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Gift Card Name already exist pop up displayed when Entering Space in the End of Gift Card Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Gift Card Name");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else
	{
		test.log(LogStatus.FAIL, "Gift Card not Saved with Space in the End of Gift Card Name");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}


}
