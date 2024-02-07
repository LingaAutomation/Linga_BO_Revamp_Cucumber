package StepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Linga_Admin_Payments {

	

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage rp=new ReportsPage();
	
	String Cus_Name_Bef,Cus_Name_Aft;
	
	String Amount_Bef,Amount_Aft;
	
	String Perc_inDealer,Commission_Perc;
	
	static String Inv_No; 
	
	@Given("Open the Linga Admin - Payments home page BaseURL and StoreID")
	public void openTheLingaAdminPaymentsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(10000);
		//Load the Department page
	
		
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"dealers/payments");
	}
	@Given("Verifying the Payments Header Page")
	public void verifyingThePaymentsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//Verify the Departments page loaded or not
		cmp.VerifyMainScreenPageHeader("Payments");	
	}

	@Then("Check Dealers Field is Displayed")
	public void checkDealersFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		lap.Dealers_InputBx.click();
	    
	}
	@Then("Check Subscription Field is Displayed")
	public void checkSubscriptionFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    lap.Subscriptions_InputBx.click();
	}
	@Then("Check Apply button is Disabled")
	public void checkApplyButtonIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cmp.Check_Button_Disabled(rp.Apply_Btn, "Apply button");
	}
	@Then("Check Payments not found Disclaimer is Displayed")
	public void checkPaymentsNotFoundDisclaimerIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(lap.Payment_Not_Found_InfoMsg, "Payment not Found");
	}

	@When("I Click the Subscription")
	public void iClickTheSubscription() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    lap.Subscriptions_InputBx.click();
	}
	@Then("Check the Subscriptions is not Displayed")
	public void checkTheSubscriptionsIsNotDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    cmp.Check_Element_or_Text_Not_Displayed(driver.findElement(By.xpath("//div[@class='option-list']")), "Subscription Options Available");
	}

	@Given("I Click the Dealer")
	public void iClickTheDealer() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    lap.Dealers_InputBx.click();
	}
	@Then("Verify whether the Search bar is Displayed")
	public void verifyWhetherTheSearchBarIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(cmp.SearchBox_DropDown, "Search field is available in Option list");
	}
	@Then("I Select the Dealer")
	public void iSelectTheDealer() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSelection(lap.Dealers_InputBx, "POS DEALER", "Dealer Selected");
	}

	@Then("Check whether the Subscriptions of the Dealer is Displayed")
	public void checkWhetherTheSubscriptionsOfTheDealerIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//div[@class='option-list']")), "Subscription Options Available");
	    
//	    lap.Subscriptions_InputBx.click();
	}
	@Then("I Select the Subscriptions")
	public void iSelectTheSubscriptions() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch(lap.Subscriptions_InputBx, "Subscription is Selected");
	}
	
	@Then("Check whether the Apply button is Enabled")
	public void checkWhetherTheApplyButtonIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Button_Enabled(rp.Apply_Btn, "Apply button");
	}

	@Then("Check whether the Payments is Displayed")
	public void checkWhetherThePaymentsIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Not_Displayed(lap.Payment_Not_Found_InfoMsg, "Payments available");
	}
	

@Given("I Search the Invoice and Click Pay Now button")
public void iSearchTheInvoiceAndClickPayNowButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    String Inv_No=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
    this.Inv_No=Inv_No;
    
    Thread.sleep(1000);
    cmp.SearchBox.clear();
    Thread.sleep(1000);
    cmp.SearchBox.sendKeys(Inv_No);
    Thread.sleep(2000);
    System.out.println("Invoice No is : "+Inv_No);
    lap.Click_Pay_Now_Button();
}
@Then("Verify the Make Payment Header")
public void verifyTheMakePaymentHeader() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyCreationScreenPageHeader("Make Payment");
}



@Given("I Take the Customer Name Before Search")
public void iTakeTheCustomerNameBeforeSearch() {
    // Write code here that turns the phrase above into concrete actions
    String CustomerName_Bef=lap.Dealers_InputBx.getAttribute("value");
    this.Cus_Name_Bef=CustomerName_Bef;
}

@Then("Check whether the Customer Name Field is Displayed")
public void checkWhetherTheCustomerNameFieldIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(lap.Customer_Name_InputBx, "Customer Name");
}
@Then("I Take the Name from Customer Name Field")
public void iTakeTheNameFromCustomerNameField() {
    // Write code here that turns the phrase above into concrete actions
	 String CustomerName_Aft=lap.Customer_Name_InputBx.getAttribute("value");
	    this.Cus_Name_Aft=CustomerName_Aft;
}
@Then("Validate the Customer Name Same in Make Payment Screen")
public void validateTheCustomerNameSameInMakePaymentScreen() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    Assert.assertEquals(Cus_Name_Bef, Cus_Name_Aft,"Customer Name Matched Each Other");
}
@Then("Check Amount Receied Field is Displayed")
public void checkAmountReceiedFieldIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(lap.Amount_Received_InputBx, "Amount Received");
}
@Then("Check Commission Field is Displayed")
public void checkCommissionFieldIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(lap.Commission_InputBx, "Commission");

}
@Then("Check Amount to Be Paid Field is Displayed")
public void checkAmountToBePaidFieldIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(lap.Amount_To_be_Paid_InputBx, "Amount To be Paid");

}

@Given("I Take the Amount Before Search")
public void iTakeTheAmountBeforeSearch() {
    // Write code here that turns the phrase above into concrete actions
	
	
    String Bef_Amt=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
    this.Amount_Bef=Bef_Amt;
    
}
@Given("I Take the Amount from Amount Received Field")
public void iTakeTheAmountFromAmountReceivedField() {
    // Write code here that turns the phrase above into concrete actions
//	 String Bef_Amt=lap.Amount_Received_InputValue();
	String Aft_Amt=lap.Amount_Received_InputBx.getAttribute("value");
	    this.Amount_Aft=Aft_Amt;
}
@Then("Verify the Amount in Invoice and Amount Received in Make Payment screen are same")
public void verifyTheAmountInInvoiceAndAmountReceivedInMakePaymentScreenAreSame() {
    // Write code here that turns the phrase above into concrete actions
   Assert.assertEquals(Amount_Bef, Amount_Aft,"Amount Received is Matched with Amount in Table");
}

@Then("Validate the Amount to Be Paid by Amount Received with Commission")
public void validateTheAmountToBePaidByAmountReceivedWithCommission() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    String Amount_Recd=lap.Amount_Received_InputBx.getAttribute("value");
    double Amount_Received=Double.parseDouble(Amount_Recd);
    
    String Commission_Perc=lap.Commission_InputBx.getAttribute("value").replace("%", "");
    double Commission_Percentage=Double.parseDouble(Commission_Perc);
    
    double Exp_Amt_Paid=Amount_Received%Commission_Percentage;
    String Expected_Amount_Paid=String.valueOf(Exp_Amt_Paid);
    
    String Actual_Amount_Paid=lap.Amount_To_be_Paid_InputBx.getAttribute("value");
//    String Expected=
    
    cmp.Assertion_Validation_Two_Values(Actual_Amount_Paid, Expected_Amount_Paid, "Amount To Be Paid is Equal Each Other");
    
}
@Then("I Click Pay Now button")
public void iClickPayNowButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Click_Pay_Now_Button();
}
@Then("Verify whether the can make the Payment")
public void verifyWhetherTheCanMakeThePayment() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("Paid Successfully"); //Need to Check the confirmation messsage
}


@Then("I Search the Invoice and Check the Status as Un-Paid")
public void iSearchTheInvoiceAndCheckTheStatusAsUnPaid() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_Two_Values(driver.findElement(By.xpath("//td[contains(.,'"+Inv_No+"')]/../td[5]")).getText(), "un-paid", "Un-Paid Status is Displayed");
}
@Given("I Enter the Amount to Be Paid")
public void iEnterTheAmountToBePaid() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Enter_Amount_To_Be_Paid("10000");
}

@Then("I Search the Invoice and Check the Status as Paid")
public void iSearchTheInvoiceAndCheckTheStatusAsPaid() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_Two_Values(driver.findElement(By.xpath("//td[contains(.,'"+Inv_No+"')]/../td[5]")).getText(), "paid", "Paid Status is Displayed");

}
@Given("I Enter the Amount to Be Paid as Zero")
public void iEnterTheAmountToBePaidAsZero() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Enter_Amount_To_Be_Paid("0000");
}

@Given("Navigate to Linga Admin - Dealers Page")
public void navigateToLingaAdminDealersPage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(5000);

	lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"dealers/dealers");
}
@Given("I Search and Edit the Dealer Name")
public void iSearchAndEditTheDealerName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.SearchAndClickEdit(Cus_Name_Aft);
}
@Given("I Take the Percentage from Dealers Page")
public void iTakeThePercentageFromDealersPage() {
    // Write code here that turns the phrase above into concrete actions
    String Perc_inDealer=cmp.Percentage_Input().getAttribute("value");
    
    this.Perc_inDealer=Perc_inDealer;
}
@Then("I Navigate to Linga Admin - Payments Page")
public void iNavigateToLingaAdminPaymentsPage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"dealers/payments");
}
@Given("I Take the Commision Percentage")
public void iTakeTheCommisionPercentage() {
    // Write code here that turns the phrase above into concrete actions
    String Commission_Per=lap.Commission_InputBx.getAttribute("value");
    
    this.Commission_Perc=Commission_Per;
    
    
}
@Then("Verify whether the Commission Amount\\/Percentage is Displayed which is Mapped to the Dealer")
public void verifyWhetherTheCommissionAmountPercentageIsDisplayedWhichIsMappedToTheDealer() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_Two_Values(Commission_Perc, Perc_inDealer, "Commission % is Equal to % in Dealer page for this Customer");
}
@Then("Check the Commision Percentage in Column")
public void checkTheCommisionPercentageInColumn() {
    // Write code here that turns the phrase above into concrete actions
	String Commission_Per_inTable=driver.findElement(By.xpath("//td[contains(.,'"+Inv_No+"')]/../td[6]")).getText();
	
    cmp.Assertion_Validation_Two_Values(Commission_Perc, Commission_Per_inTable, "Commission Percentage is Equal on both Make Payments & Table");
}


}
