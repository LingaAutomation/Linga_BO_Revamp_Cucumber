package StepDefinition;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.Settings_Matrix_Report_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Matrix_Report 
{

	
	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Matrix_Report_Page mr=new Settings_Matrix_Report_Page();
	
	@Given("Open the Settings - Matrix Report home page BaseURL and StoreID")
	public void openTheSettingsMatrixReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Label Printer page
		lgpg.Open_URL(Utility.getProperty("baseURL")+"settings/"+"storeMatrix");
	}
	@Given("Verifying the Matrix Report Header Page")
	public void verifyingTheMatrixReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Label Printers page loaded or not
		cmp.VerifyMainScreenPageHeader("Matrix Report");	
	}
	@Given("I Enter the Invalid Popularity Threshold Percentage")
	public void iEnterTheInvalidPopularityThresholdPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(cmp.Percentage_InputBx, "120", "Invalid Popularity Threshold Percentage Entered");
	}
	@Then("Check Percentage should be between {int}-{int} Error is Displayed")
	public void checkPercentageShouldBeBetweenErrorIsDisplayed(Integer int1, Integer int2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(mr.Percentage_Should_Betweek_0_100_ErrorMsg, "Percentage Should be between 0-100 Error");
	}
	@Given("I Enter Profit Threshold Amount")
	public void iEnterProfitThresholdAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(cmp.Amount_InputBx, "80", "Profit Threshold Amount Entered");
	}
	@Given("I Enter Popularity Threshold Percentage")
	public void iEnterPopularityThresholdPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Enter_Text(cmp.Percentage_InputBx, "50", "Popularity Threshold Percentage Entered");
	}
	@Then("Verify whether Matrix Report Settings is Updated or Not")
	public void verifyWhetherMatrixReportSettingsIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Matrix Report Settings Updated");
	}
	@Then("Check Profit Threshold Amount displayed as Expected")
	public void checkProfitThresholdAmountDisplayedAsExpected() {
	    // Write code here that turns the phrase above into concrete actions
	    String PofitAmt=cmp.Amount_InputBx.getAttribute("value");
	    
	    
	    cmp.Assertion_Validation_Two_Values(PofitAmt, "80", "Profit Threshold Amount displayed as Expected");
	}
	@Then("Check Popularity Threshold Percentage displayed as Expected")
	public void checkPopularityThresholdPercentageDisplayedAsExpected() {
	    // Write code here that turns the phrase above into concrete actions
	    String PopPerc=cmp.Percentage_InputBx.getAttribute("value");
	    
	    
	    cmp.Assertion_Validation_Two_Values(PopPerc, "50%", "Popularity Threshold Percentage displayed as Expected");
	
	}
}
