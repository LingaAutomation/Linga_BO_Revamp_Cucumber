package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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

public class Reports_Revenue_Center 
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
	
	
	@Given("Open the Reports - Revenue Center Report home page BaseURL and storeID")
	public void openTheReportsRevenueCenterReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(5000);
		//Load the Daily page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"revenueCenterReport");
	}
	@Given("Verifying the Revenue Center Report Header Page")
	public void verifyingTheRevenueCenterReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loaded or not
		cmp.VerifyCreationScreenPageHeader("Revenue Center");
	}
	@Then("Check Revenue Centers Field is Displayed")
	public void checkRevenueCentersFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Element_or_Text_Displayed(repts.Revenue_Centers_InputBx, "Revenue Centers Field");
	}
	@Given("I Select the Revenue Centers as Number of Guests")
	public void iSelectTheRevenueCentersAsNumberOfGuests() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Revenue_Centers("Number of Guests");
	}
	@Then("Verify Revenue Center Report Available for Selected Number of Guests or Not")
	public void verifyRevenueCenterReportAvailableForSelectedNumberOfGuestsOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Membership Statement Report is Available for Searched Number of Guests");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Membership Statement Report is Not Available for Searched Number of Guests");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
	}
	@Given("I Select the Revenue Centers as Number of Checks")
	public void iSelectTheRevenueCentersAsNumberOfChecks() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Revenue_Centers("Number of Checks");
	}
	@Then("Verify Revenue Center Report Available for Selected Number of Checks or Not")
	public void verifyRevenueCenterReportAvailableForSelectedNumberOfChecksOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Membership Statement Report is Available for Searched Number of Checks");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Membership Statement Report is Not Available for Searched Number of Checks");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
	}
	@Given("I Select the Revenue Centers as Net Sales by Category")
	public void iSelectTheRevenueCentersAsNetSalesByCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Revenue_Centers("Net sales by Category");
	}
	@Then("Verify Revenue Center Report Available for Selected Net Sales by Category or Not")
	public void verifyRevenueCenterReportAvailableForSelectedNetSalesByCategoryOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Membership Statement Report is Available for Searched Net Sales by Category");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Membership Statement Report is Not Available for Searched Net Sales by Category");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
	}
	@Given("I Select the Revenue Centers as Net Sales by Shift")
	public void iSelectTheRevenueCentersAsNetSalesByShift() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Revenue_Centers("Net Sales by Shift");
	}
	@Then("Verify Revenue Center Report Available for Selected Net Sales by Shift or Not")
	public void verifyRevenueCenterReportAvailableForSelectedNetSalesByShiftOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Membership Statement Report is Available for Searched Net Sales by Shift");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Membership Statement Report is Not Available for Searched Net Sales by Shift");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
	}
	@Given("I Select the Revenue Centers as Net Sales by Revenue Center")
	public void iSelectTheRevenueCentersAsNetSalesByRevenueCenter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Revenue_Centers("Net sales for Revenue Center");
	}
	@Then("Verify Revenue Center Report Available for Selected Net Sales by Revenue Centers or Not")
	public void verifyRevenueCenterReportAvailableForSelectedNetSalesByRevenueCentersOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Membership Statement Report is Available for Searched Net Sales by Revenue Centers");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Membership Statement Report is Not Available for Searched Net Sales by Revenue Centers");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
	}
	@Given("I Select the Revenue Centers as All")
	public void iSelectTheRevenueCentersAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Revenue_Centers("Select All");
	}
	@Then("Verify Revenue Center Report Available for Today or Not")
	public void verifyRevenueCenterReportAvailableForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Today");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();

		}
			
	}
	@Then("Verify Revenue Center Report Available for Yesterday or Not")
	public void verifyRevenueCenterReportAvailableForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Yesterday");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();


			
		}
	}
	@Then("Verify Revenue Center Report Available for Last N Days or Not")
	public void verifyRevenueCenterReportAvailableForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Last 'N' days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Last 'N' days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();

	
			
		}
	}
	@Then("Verify Revenue Center Report Available for This Week or Not")
	public void verifyRevenueCenterReportAvailableForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for This Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();

		}
	}
	@Then("Verify Revenue Center Report Available for Last Week or Not")
	public void verifyRevenueCenterReportAvailableForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Last Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();

	
		}
	}
	@Then("Verify Revenue Center Report Available for Last Seven Days or Not")
	public void verifyRevenueCenterReportAvailableForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Last 7 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Last 7 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();


	
		}
	}
	@Then("Verify Revenue Center Report Available for This Month or Not")
	public void verifyRevenueCenterReportAvailableForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for This Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();


	
		}
	}
	@Then("Verify Revenue Center Report Available for Last Month or Not")
	public void verifyRevenueCenterReportAvailableForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Last Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();

		}
	}
	@Then("Verify Revenue Center Report Available for Last Thirty Days or Not")
	public void verifyRevenueCenterReportAvailableForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Last 30 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Last 30 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();


		}
	}
	@Then("Verify Revenue Center Report Available for Specific Date or Not")
	public void verifyRevenueCenterReportAvailableForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Specific Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();

		}
	}
	@Then("Verify Revenue Center Report Available for Date Range or Not")
	public void verifyRevenueCenterReportAvailableForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_Revenue_CenterFound_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Revenue Center Report Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Revenue Center Report Available for Date Range");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
	repts.Verify_No_ofGuests_RevenueCenterTotal();
			
			repts.Verify_No_ofChecks_RevenueCenterTotal();
			
			repts.Verify_NetSales_byCategory_RevenueCenterTotal();
			
			repts.Verify_NetSales_byShift_RevenueCenterTotal();
			
			repts.Verify_NetSales_byRevenue_Center_RevenueCenterTotal();
		}
	}

	
}
