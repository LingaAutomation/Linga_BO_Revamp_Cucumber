package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Reports_Void_Transactions
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	
	public String st="NA";
	
	//LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	
	@Given("Open the Reports - Void Transaction Report home page BaseURL and storeID")
	public void OpenVoidTransactionsReportHomePage() throws Exception
	{
		Thread.sleep(5000);
		//Load the Department page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"transactionsReport/voidTransactions");
	}
	
	@Given("Verifying the Void Transaction Report Header Page")
	public void VerifyVoidTransactionReportHeader() throws Exception 
	{
		Thread.sleep(5000);
		//Verify the void transactions report page loeded or not
		repts.Verify_ReportHomePage("VOID TRANSACTIONS");
	}
	
	@Then("Check Select TenderName Field in VoidTransaction is Displayed")
	public void checkSelectTenderNameVoidTransactionFieldIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.TenderNameDropDown_VoidTransaction, "Select Tender Name Field");
	}
	
	@Then("Select Tender Name as All in VoidTransaction")
	public void selectTenderNameAsAll() throws Exception 
	{
		repts.TenderNameDropDown_VoidTransaction.click();
		Thread.sleep(500);
		// Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();

	}
}
