package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class Reports_Discount_Store_Credit_Report 
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
	
	
	@Given("Open the Reports - Discount Store Credit Report home page BaseURL and storeID")
	public void openTheReportsDiscountStoreCreditReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Customer Preference Summarys report page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"discount/storecredit");
	}
	@Given("Verifying the Discount Store Credit Report Header Page")
	public void verifyingTheDiscountStoreCreditReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the discount report page loaded or not
		repts.Verify_ReportHomePage("STORE CREDIT");
	}
	@Then("Check Action Type Field is Displayed")
	public void checkActionTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Element_or_Text_Displayed(repts.Action_Type_InputBx, "Action Type Field");
	}
	@Then("Check Check Details Field in Table is Displayed")
	public void checkCheckDetailsFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Check_Details_Column_Field, "Check Details Column Field");
	}
	@Then("Check Employee Name and Id Field in Table is Displayed")
	public void checkEmployeeNameAndIdFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Employee_Name_Id_Column_Field, "Employee Name and Id Column Field");
	}
	@Then("Check Customer Name Field in Table is Displayed")
	public void checkCustomerNameFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Customer_Name_Column_Field, "Customer Name Column Field");
	}
	@Then("Check Customer Email Field in Table is Displayed")
	public void checkCustomerEmailFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Customer_Email_Column_Field, "Customer Email Column Field");
	}
	@Then("Check Customer Phone Field in Table is Displayed")
	public void checkCustomerPhoneFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Customer_Phone_Column_Field, "Customer Phone Column Field");
	}
	@Then("Check Credit Amount Field in Table is Displayed")
	public void checkCreditAmountFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Credit_Amount_Column_Field, "Credit Amount Column Field");
	}
	@Then("Check Date & Time Field in Table is Displayed")
	public void checkDateTimeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Date_Time_Column_Field, "Date & Time Column Field");
	}
	@Then("Check Action Type Field in Table is Displayed")
	public void checkActionTypeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Action_Type_Column_Field, "Action Type Column Field");
	}
	@Then("Check Source Field in Table is Displayed")
	public void checkSourceFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Source_Column_Field, "Source Column Field");
	}
	@Given("I Select the Action Type as Add")
	public void iSelectTheActionTypeAsAdd() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Click_DropDown_withSelection(repts.Action_Type_InputBx, "Add", "Action Type selected as Add");
	}
	@Then("Verify Discount Store Credit Report Availble for Add or Not")
	public void verifyDiscountStoreCreditReportAvailbleForAddOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Store Credit Report Not Available for Add");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Store Credit Report Available for Add");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Action Type as Update")
	public void iSelectTheActionTypeAsUpdate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		 cmp.Click_DropDown_withSelection(repts.Action_Type_InputBx, "Update", "Action Type selected as Update");
	}
	@Then("Verify Discount Store Credit Report Availble for Update or Not")
	public void verifyDiscountStoreCreditReportAvailbleForUpdateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Store Credit Report Not Available for Update");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Store Credit Report Available for Update");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Action Type as Refund")
	public void iSelectTheActionTypeAsRefund() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Click_DropDown_withSelection(repts.Action_Type_InputBx, "Refund", "Action Type selected as Refund");
	}
	@Then("Verify Discount Store Credit Report Availble for Refund or Not")
	public void verifyDiscountStoreCreditReportAvailbleForRefundOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Store Credit Report Not Available for Refund");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Store Credit Report Available for Refund");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Action Type as Redeem")
	public void iSelectTheActionTypeAsRedeem() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Click_DropDown_withSelection(repts.Action_Type_InputBx, "Redeem", "Action Type selected as Redeem");
	}
	@Then("Verify Discount Store Credit Report Availble for Redeem or Not")
	public void verifyDiscountStoreCreditReportAvailbleForRedeemOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Store Credit Report Not Available for Redeem");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Store Credit Report Available for Redeem");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Action Type as All")
	public void iSelectTheActionTypeAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Click_DropDown_withSelection(repts.Action_Type_InputBx, "All", "Action Type selected as All");
	}
	@Then("Verify Discount Store Credit Report Availble for Today or Not")
	public void verifyDiscountStoreCreditReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Today");
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Today");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Discount Store Credit Report Availble for Yesterday or Not")
	public void verifyDiscountStoreCreditReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Yesterday");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Yesterday");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Store Credit Report Availble for Last N Days or Not")
	public void verifyDiscountStoreCreditReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Last N days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Last N days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Store Credit Report Availble for This Week or Not")
	public void verifyDiscountStoreCreditReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for This Week");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for This Week");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Store Credit Report Availble for Last Week or Not")
	public void verifyDiscountStoreCreditReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Last Week");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Last Week");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Store Credit Report Availble for Last Seven Days or Not")
	public void verifyDiscountStoreCreditReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Last 7 days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Last 7 days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Store Credit Report Availble for This Month or Not")
	public void verifyDiscountStoreCreditReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for This month");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for This month");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Store Credit Report Availble for Last Month or Not")
	public void verifyDiscountStoreCreditReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Last month");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Last month");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Store Credit Report Availble for Last Thirty Days or Not")
	public void verifyDiscountStoreCreditReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Last 30 days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Last 30 days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			
			Thread.sleep(3000);
		}

	}
	@Then("Verify Discount Store Credit Report Availble for Specific Date or Not")
	public void verifyDiscountStoreCreditReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Specific Date");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Specific Date");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
			
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			}
			
			
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Store Credit Report Availble for Date Range or Not")
	public void verifyDiscountStoreCreditReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount - Store Credit Report Not Available for Date Range");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount - Store Credit Report Available for Date Range");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			for(int i=1;i<=5;i++)
			{
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Check Details : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
			test.log(LogStatus.INFO, "Employee Name & ID : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText());
			test.log(LogStatus.INFO, "Customer Name : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText());
			test.log(LogStatus.INFO, "Credit Amount : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText());
			test.log(LogStatus.INFO, "Action Type : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText());
			test.log(LogStatus.INFO, "Source : "+driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText());
			
			
			
			Thread.sleep(3000);
			}
		}
	}


}
