package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Reports_Account_Balance 
{

	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
//	ExtentReports Trep = ExtentManager.getInstance();
//	ExtentTest Ttest = rep.startTest("AddEditDelete Departments");
	
	
	public String st="NA";
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	
	@Given("Open the Reports - Account Balance Report home page BaseURL and storeID")
	public void openTheReportsAccountBalanceReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(5000);
	 //Load the Sale Summarys report page
	 		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"account-balance");

	}
	@Given("Verifying the Account Balance Report Header Page")
	public void verifyingTheAccountBalanceReportHeaderPage() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyMainScreenPageHeader("Account Balance");
	}
	@Then("Check Select Date Field is Displayed")
	public void checkSelectDateFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Select_Date_InputBx, "Select Date Field");
	}
	@Then("Check Memo Field in Table is Displayed")
	public void checkMemoFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Memo_Column_Field, "Memo Column Field");
	}
	@Then("Check Account Field in Table is Displayed")
	public void checkAccountFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Account_Column_Field, "Account Column Field");
	}
	@Then("Check Debit Field in Table is Displayed")
	public void checkDebitFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Debit_Column_Field, "Debit Column Field");
	}
	@Then("Check Credit Field in Table is Displayed")
	public void checkCreditFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Credit_Column_Field, "Credit Column Field");
	}
	@Given("I Select the Account Balance Date")
	public void iSelectTheAccountBalanceDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Date(Utility.getProperty("Account_Balance_Date"));
	}
	@Then("Verify Account Balance Report Availble for Selected Account Balance Date or Not")
	public void verifyAccountBalanceReportAvailbleForSelectedAccountBalanceDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Account Balance Report Not Available for Selected Date");
				
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Account Balance Report Available for Selected Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			int i = rowList.size();

			String Date = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
			String Amount = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
			String Debit = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
			String Credit = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
			
			test.log(LogStatus.INFO, "Account balance report Available for the mentioned date totally "+rowList.size()+" orders available and the total Debit value is : "+Debit);		
			test.log(LogStatus.INFO, "Account balance report Available for the mentioned date totally "+rowList.size()+" orders available and the total Credit value is : "+Credit);		
		}
	}

	
}
