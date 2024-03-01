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

public class Reports_Discount_Report 
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
	
	@Given("Open the Reports - Discount Report home page BaseURL and storeID")
	public void openTheReportsDiscountReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Customer Preference Summarys report page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"discount/Discount");
	}
	@Given("Verifying the Discount Report Header Page")
	public void verifyingTheDiscountReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the discount report page loaded or not
		repts.Verify_ReportHomePage("DISCOUNT");
	}
	@Then("Check Discount Field is Displayed")
	public void checkDiscountFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Element_or_Text_Displayed(repts.Discount_InputBx, "Discount Field");
	}
	@Then("Check Sale Created By Field is Displayed")
	public void checkSaleCreatedByFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Element_or_Text_Displayed(repts.Sale_Created_By_InputBx, "Sale Created By Field");
	}
	@Then("Check Discount Coupon Type Field is Displayed")
	public void checkDiscountCouponTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Element_or_Text_Displayed(repts.Discount_Coupon_Type_InputBx, "Discount Coupon Type Field");
	}
	@Then("Check Discount Name Field in Table is Displayed")
	public void checkDiscountNameFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Discount_Name_Column_Field, "Discount Name Column Field");
	}
	@Then("Check Discount Total Field in Table is Displayed")
	public void checkDiscountTotalFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Discount_Total_Column_Field, "Discount Total Column Field");
	}
	@Then("Check %of Total Field in Table is Displayed")
	public void checkOfTotalFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Percentag_ofTotal_Column_Field, "% of Total Column Field");
	}
	@Then("Check Count Field in Table is Displayed")
	public void checkCountFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Count_Column_Field, "Count Column Field");
	}
	@Then("Check Average Field in Table is Displayed")
	public void checkAverageFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Average_Column_Field, "Average Column Field");
	}
	@Then("Check Discount Coupon Type Field in Table is Displayed")
	public void checkDiscountCouponTypeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Discount_Coupon_Type_Column_Field, "Discount Coupon Type Column Field");
	}
	@Given("I Select the Report Type as By Employee")
	public void iSelectTheReportTypeAsByEmployee() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Report_Type_InputBx, "By Employee", "Report Type selected as By Employee");
	}
	@Given("I Select the Approved By as All")
	public void iSelectTheApprovedByAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Approved_By_InputBx, "All", "Approved By selected as All");
	}
	@Given("I Select the Employee Name as All")
	public void iSelectTheEmployeeNameAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Employee_Name_InputBx, "All", "Employee Name selected as All");
	}
	@Given("I Select the Discount as All")
	public void iSelectTheDiscountAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Discount_InputBx, "All", "Discount selected as All");

	}
	@Given("I Select the Sale Created By as All")
	public void iSelectTheSaleCreatedByAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Sale_Created_By_InputBx, "All", "Sale Created By selected as All");

	}
	@Given("I Select the Discount Coupon Type as All")
	public void iSelectTheDiscountCouponTypeAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Discount_Coupon_Type_InputBx, "All", "Discount Coupon Type selected as All");

	}
	@Then("Verify Discount Report Availble for By Employee or Not")
	public void verifyDiscountReportAvailbleForByEmployeeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for By Employee");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Discount Report Available for By Employee");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
//			Thread.sleep(2000);
//			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
//			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
//			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
//			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
//			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
//			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
//			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
//			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
//			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
//			Thread.sleep(3000);

		}
	}
	@Given("I Select the Report Type as By Discount")
	public void iSelectTheReportTypeAsByDiscount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Report_Type_InputBx, "By Discount", "Report Type selected as By Discount");

	}
	@Then("Verify Discount Report Availble for By Discount or Not")
	public void verifyDiscountReportAvailbleForByDiscountOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for By Discount");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Discount Report Available for By Discount");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Report Type as By Discount Type")
	public void iSelectTheReportTypeAsByDiscountType() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Report_Type_InputBx, "By Discount Type", "Report Type selected as By Discount Type");

	}
	@Then("Verify Discount Report Availble for By Discount Type or Not")
	public void verifyDiscountReportAvailbleForByDiscountTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for By Discount Type");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Discount Report Available for By Discount Type");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Report Type as By Dual Price")
	public void iSelectTheReportTypeAsByDualPrice() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Report_Type_InputBx, "By Dual Price", "Report Type selected as By Dual Price");

	}
	@Then("Verify Discount Report Availble for By Dual Price or Not")
	public void verifyDiscountReportAvailbleForByDualPriceOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for By Dual Price");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Discount Report Available for By Dual Price");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Report Type as Discount Applied By")
	public void iSelectTheReportTypeAsDiscountAppliedBy() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Report_Type_InputBx, "Discount Applied By", "Report Type selected as Discount Applied By");

	}
	@Then("Verify Discount Report Availble for Discount Applied By or Not")
	public void verifyDiscountReportAvailbleForDiscountAppliedByOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Discount Applied By");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Discount Report Available for Discount Applied By");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Report Type as By Name")
	public void iSelectTheReportTypeAsByName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Report_Type_InputBx, "By Name", "Report Type selected as By Name");

	}
	@Then("Verify Discount Report Availble for By Name or Not")
	public void verifyDiscountReportAvailbleForByNameOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for By Name");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Discount Report Available for By Name");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Report Type as Summary")
	public void iSelectTheReportTypeAsSummary() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Report_Type_InputBx, "Summary", "Report Type selected as Summary");

	}
	@Then("Verify Discount Report Availble for Today or Not")
	public void verifyDiscountReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Today");
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Discount Report Available for Today");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);

		}
	}
	@Then("Verify Discount Report Availble for Yesterday or Not")
	public void verifyDiscountReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Yesterday");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for Yesterday");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for Last N Days or Not")
	public void verifyDiscountReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Last N days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for Last N days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for This Week or Not")
	public void verifyDiscountReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for This Week");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for This Week");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for Last Week or Not")
	public void verifyDiscountReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Last Week");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for Last Week");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for Last Seven Days or Not")
	public void verifyDiscountReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Last 7 days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for Last 7 days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for This Month or Not")
	public void verifyDiscountReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for This month");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for This month");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for Last Month or Not")
	public void verifyDiscountReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Last month");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for Last month");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for Last Thirty Days or Not")
	public void verifyDiscountReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Last 30 days");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for Last 30 days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for Specific Date or Not")
	public void verifyDiscountReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Specific Date");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for Specific Date");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
	@Then("Verify Discount Report Availble for Date Range or Not")
	public void verifyDiscountReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Discount Report Not Available for Date Range");
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Discount Report Available for Date Range");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Discount Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[2]/div")).getText());
			test.log(LogStatus.INFO, "% of Total : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[3]/div")).getText());
			test.log(LogStatus.INFO, "Count : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[4]/div")).getText());
			test.log(LogStatus.INFO, "Average : "+driver.findElement(By.xpath("//div[contains(.,'Total Discounts')]/../../td[5]/div")).getText());
			test.log(LogStatus.INFO, "Total Checks : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[1]")).getText());
			test.log(LogStatus.INFO, "% of Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[2]")).getText());
			test.log(LogStatus.INFO, "Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[3]")).getText());
			test.log(LogStatus.INFO, "% Discount of Gross sales : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[4]")).getText());
			test.log(LogStatus.INFO, "Checks discounted : "+driver.findElement(By.xpath("//td[contains(.,'Total Checks')]/../..//tr[3]/td[5]")).getText());
			Thread.sleep(3000);
		}
	}
}
