package StepDefinition;

import org.openqa.selenium.By;

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

public class Reports_HA_Statement 
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
	
	@Given("Open the Reports - HA Statement Report home page BaseURL and storeID")
	public void openTheReportsHAStatementReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Sale Summarys report page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"houseAccount/haStatement");

	}
	@Given("Verifying the HA Statement Report Header Page")
	public void verifyingTheHAStatementReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the HA Statement page loeded or not
		repts.Verify_ReportHomePage("HA STATEMENT");
	}
	@Then("Check Customer Field is Displayed")
	public void checkCustomerFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Customer_InputBx, "Customer Field");
	}
	@Then("Check Menu Item Field in Table is Displayed")
	public void checkMenuItemFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Menu_Item_Column_Field, "Menu Item Column Field");

	}
	@Then("Check HA Recharge Field in Table is Displayed")
	public void checkHARechargeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.HA_Recharge_Column_Field, "HA Recharge Column Field");
	}
	@Then("Check Price Field in Table is Displayed")
	public void checkPriceFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Price_Column_Field, "Price Column Field");
	}
	@Then("Check Gratuity Field in Table is Displayed")
	public void checkGratuityFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Gratuity_Column_Field, "Gratuity Column Field");
	}
	@Then("Check Tips Field in Table is Displayed")
	public void checkTipsFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Tips_Column_Field, "Tips Column Field");
	}
	@Given("I Select the Customer")
	public void iSelectTheCustomer() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch(repts.Customer_InputBx, "Customer selected Randomly");
	}
	@Then("Verify HA Statement Report Available for Selected Customer or Not")
	public void verifyHAStatementReportAvailableForSelectedCustomerOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for selected Customer");
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Statement Available for Selected Customer");
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Given("I Select the Customer as All")
	public void iSelectTheCustomerAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.Click_DropDown_withSearch_Selection(repts.Customer_InputBx, "All", "Customer selected as All");
	}
	@Then("Verify HA Statement Report Available for Today or Not")
	public void verifyHAStatementReportAvailableForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Today");
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Statement Available for Today");
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for Yesterday or Not")
	public void verifyHAStatementReportAvailableForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Yesterday");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for Yesterday");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for Last N Days or Not")
	public void verifyHAStatementReportAvailableForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Last N days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for Last N days");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for This Week or Not")
	public void verifyHAStatementReportAvailableForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for This Week");
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "HA Statement Available for This Week");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for Last Week or Not")
	public void verifyHAStatementReportAvailableForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Last Week");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for Last Week");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for Last Seven Days or Not")
	public void verifyHAStatementReportAvailableForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Last 7 days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for Last 7 days");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for This Month or Not")
	public void verifyHAStatementReportAvailableForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for This month");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for This month");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for Last Month or Not")
	public void verifyHAStatementReportAvailableForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Last month");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for Last month");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for Last Thirty Days or Not")
	public void verifyHAStatementReportAvailableForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Last 30 days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for Last 30 days");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for Specific Date or Not")
	public void verifyHAStatementReportAvailableForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Specific Date");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for Specific Date");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify HA Statement Report Available for Date Range or Not")
	public void verifyHAStatementReportAvailableForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "HA Statement Not Available for Date Range");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "HA Statement Available for Date Range");

			Thread.sleep(2000);
			test.log(LogStatus.INFO, "HA Statement is available and the date is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[1]/span")).getText() +" and the check number is : "+driver.findElement(By.xpath("//div[2]/div/data-grid-row/div/div[2]/span")).getText());
			Thread.sleep(3000);

		}
	}
}
