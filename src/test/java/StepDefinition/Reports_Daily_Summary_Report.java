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

import Utility.ExcelDataConfig;
import Utility.Utility;
import io.cucumber.java.en.*;

public class Reports_Daily_Summary_Report 
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
	
	public static String Net_Sale_DailySummary, Grand_Sale_DailySummary, Gross_Sale_DailySummary, Tax_DailySummary;
	public static String DepartmentOpt_inDailySummary, TaxOpt_inDailySummary;
	
	
	@Given("Open the Reports - Daily Summary Report home page BaseURL and storeID")
	public void openTheReportsDailySummaryReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Daily page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"dailySummaryReport");

	}
	@Given("Verifying the Daily Summary Report Header Page")
	public void verifyingTheDailySummaryReportHeaderPage() {
	    // Write code here that turns the phrase above into concrete actions
		//Verify the Categories page loeded or not
		cmp.VerifyMainScreenPageHeader("Daily Summary");
	}
	
	@Then("Check Select Tax Field is Displayed")
	public void checkSelectTaxFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Tax_ReportInputBx, "Tax Field");
	}
	@Then("Check G\\/L Department Field in Table is Displayed")
	public void checkGLDepartmentFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Tax_ReportInputBx, "Tax Column Field in Table");
	}
	@Then("Check Gross Sales Field in Table is Displayed")
	public void checkGrossSalesFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Gross_Sales_Column_Field, "Gross Sales Column Field in Table");
	}
	@Then("Check Comps Field in Table is Displayed")
	public void checkCompsFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Comps_Column_Field, "Comps Column Field in Table");

	}
	@Then("Check Promo Field in Table is Displayed")
	public void checkPromoFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Promo_Column_Field, "Promo Column Field in Table");

	}
	@Then("Check Loyalty Field in Table is Displayed")
	public void checkLoyaltyFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Loyalty_Column_Field, "Loyalty Column Field in Table");
	}
	@Then("Check Donation Field in Table is Displayed")
	public void checkDonationFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Donation_Column_Field, "Donation Column Field in Table");
	}

	
	@Given("I Select the Department in Report")
	public void iSelectTheDepartmentInReport() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Select Department
		repts.Department_ReportInputBox().click();
		
		Thread.sleep(1000);
		String Department=driver.findElement(By.xpath("//div[2]/select-option")).getText();
		
		this.DepartmentOpt_inDailySummary=Department;

		Thread.sleep(1000);
		repts.Department_ReportInputBox().click();

		
		//Select the Department
		repts.Select_Department_inReport(Department);
		
		
		

	}
	@Given("I Select the Tax as All")
	public void iSelectTheTaxAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Tax_ReportInputBx, "All", "Tax selected as All");
	}
	@Then("Verify Daily Summary Report Available for Selected Department or Not")
	public void verifyDailySummaryReportAvailableForSelectedDepartmentOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/div/data-grid-row/div/div[1]")).getText().equalsIgnoreCase(DepartmentOpt_inDailySummary))
		{
			test.log(LogStatus.PASS, "Daily Summary Reports is Available for Searched Department");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Daily Summary Reports is Not Available for Searched Department");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
	}
	@Given("I Select the Tax in Report")
	public void iSelectTheTaxInReport() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Select Tax
		repts.Tax_ReportInputBox().click();
		
		String Tax=driver.findElement(By.xpath("//div[2]/select-option")).getText();

		this.Tax_DailySummary=Tax;
		
		Thread.sleep(1000);
		repts.Tax_ReportInputBox().click();

		Thread.sleep(1000);
		//Select Tax 
		repts.Select_Tax_inReport(Tax);

	}
	@Then("Verify Daily Summary Report Available for Selected Tax or Not")
	public void verifyDailySummaryReportAvailableForSelectedTaxOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/div/data-grid-row/div/div[1]")).getText().equalsIgnoreCase(TaxOpt_inDailySummary))
		{
			test.log(LogStatus.PASS, "Daily Summary Reports is Available for Searched Tax");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Daily Summary Reports is Not Available for Searched Tax");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	
	
	driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);

	}
	@Then("Verify Daily Summary Report Available for Today or Not")
	public void verifyDailySummaryReportAvailableForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Today");
			
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Today", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Today");
	
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				String diff_value=String.valueOf(diff);
				
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
		
			}
			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Today", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
	

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Today");
		
			
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

		
			}
			
		
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Today", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
		
			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Today");
		
			
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report  for Today.The value diff is : "+diff);
		

			}
			
			
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for Yesterday or Not")
	public void verifyDailySummaryReportAvailableForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Yesterday");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Yesterday");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();

			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Yesterday", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "").replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Yesterday");
		
		
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		

				
			
			}
			
			

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Yesterday", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
	
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Yesterday");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		
			
			}
			
		
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Yesterday", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
		
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Yesterday");
	
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		
			
			}
			
			
			Thread.sleep(3000);

		}
		
	}
	@Then("Verify Daily Summary Report Available for Last N Days or Not")
	public void verifyDailySummaryReportAvailableForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Last N days");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Last N days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last N days", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
		
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Last 'N' Days");
		
		
				
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
	
			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last N days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
		

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Last 'N' Days");
			
			
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
			}
			
		
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last N days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
		
			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Last 'N' Days");
		
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
			
			}
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for This Week or Not")
	public void verifyDailySummaryReportAvailableForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		
			
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for This Week");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
	
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("This Week", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for This Week");
		
			
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			
			}
			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("This Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
	
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for This Week");
		
	
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			
			
			}
			
		
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("This Week", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
		
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for This Week");
		

			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
		
			
			
			}
		
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for Last Week or Not")
	public void verifyDailySummaryReportAvailableForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Last Week");
		
			ut.FailedCaptureScreenshotAsBASE64();
		
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Last Week");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last Week", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Last Week");
		

			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
	
			

			}
			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
		
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Last Week");
		

			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
			}
			
		
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last Week", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Last Week");
		
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
		
			}
			
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for Last Seven Days or Not")
	public void verifyDailySummaryReportAvailableForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Last 7 days");
			ut.FailedCaptureScreenshotAsBASE64();
		
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Last 7 days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
		
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last 7 days", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Last 7 days");
		
		
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
			

			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last 7 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
		

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Last 7 days");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
		
			}
			
	
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last 7 days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
		
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Last 7 days");
		
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
			}
			
		
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for This Month or Not")
	public void verifyDailySummaryReportAvailableForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for This month");
		
			ut.FailedCaptureScreenshotAsBASE64();
	
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for This month");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("This month", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for This month");
		
			
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
			
			}
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("This month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for This month");
		
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
		
			}
			
		
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("This month", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for This month");
		
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
			
			
		
			}
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for Last Month or Not")
	public void verifyDailySummaryReportAvailableForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Last month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Last month");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last month", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Last month");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
			
			
			}
			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
		
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Last month");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
			}
			
		
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last month", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
		
			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Last month");
		
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
			
			}
			
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for Last Thirty Days or Not")
	public void verifyDailySummaryReportAvailableForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Last 30 days");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Last 30 days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last 30 days", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Last 30 days");
			
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		
			
			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last 30 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
		
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Last 30 days");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		

			}
			
	
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last 30 days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Last 30 days");
		
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
	

			}
			
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for Specific Date or Not")
	public void verifyDailySummaryReportAvailableForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Specific Date");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Specific Date");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Specific Date", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Specific Date");
		
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			

			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Specific Date", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
		

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Specific Date");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
		
			
			}
				
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Specific Date", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Specific Date");
		
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			
			
			}
			
		
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Summary Report Available for Date Range or Not")
	public void verifyDailySummaryReportAvailableForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Summary Not Available for Date Range");
		
		ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Summary Available for Date Range");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			ut.PassedCaptureScreenshotAsBASE64();

			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Date Range", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Summary Report is equal to Sale Recap Report for Date Range");
	
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Summary Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			

			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Date Range", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
		
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Summary Report is equal to Sale Recap Report for Date Range");
	
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Summary Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
	

			}
			
		
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Date Range", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Summary Report is equal to Sale Recap Report for Date Range");
		
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Summary Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);

			}
			
	
			
			Thread.sleep(3000);

		}
	}
	@Then("I Take the Gross Sales, Net Sales, Tax, Grand Sales values from Daily Summary")
	public void iTakeTheGrossSalesNetSalesTaxGrandSalesValuesFromDailySummary() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
		
//		Thread.sleep(3000);
		
		Thread.sleep(3000);
		//Get Gross Amount
		String GrossSales=repts.Gross_Sale_DailySummaryReport().getText().replace(",", "");
		double ActualGrossSale=Double.parseDouble(GrossSales);
		
		this.Gross_Sale_DailySummary=GrossSales;
		
		//Get Net Amount
		String NetSales=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");
		double ActualNetSale=Double.parseDouble(NetSales);
		this.Net_Sale_DailySummary=NetSales;
		
		//Get the Tax
		String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		this.Tax_DailySummary=Tx;
		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		this.Grand_Sale_DailySummary=GrandSale;
	}
//	@Given("I Navigate to Sale Recap Report Page")
//	public void iNavigateToSaleRecapReportPage() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@Then("Check the Daily Summary Gross Sales value is Equal with Sale Recap Gross Sales value")
	public void checkTheDailySummaryGrossSalesValueIsEqualWithSaleRecapGrossSalesValue() {
	    // Write code here that turns the phrase above into concrete actions
		String GrossSale=repts.Gross_Sales_SaleRecap().getText().replace(",", "");

		cmp.Assertion_Validation_Two_Values(Gross_Sale_DailySummary, GrossSale, "Gross Sales in Equal in Both Sale Recap & Daily Summary");
		
	}
	@Then("Check the Daily Summary Net Sales value is Equal with Sale Recap Net Sales value")
	public void checkTheDailySummaryNetSalesValueIsEqualWithSaleRecapNetSalesValue() {
	    // Write code here that turns the phrase above into concrete actions
		String NetSale=repts.Net_Sale_DailySummaryReport().getText().replace(",", "");

		cmp.Assertion_Validation_Two_Values(Net_Sale_DailySummary, NetSale, "Net Sales in Equal in Both Sale Recap & Daily Summary");
	
	}
	@Then("Check the Daily Summary Tax value is Equal with Sale Recap Tax value")
	public void checkTheDailySummaryTaxValueIsEqualWithSaleRecapTaxValue() {
	    // Write code here that turns the phrase above into concrete actions
		String Tax=repts.Tax_DailySummaryReport().getText().replace(",", "");

		cmp.Assertion_Validation_Two_Values(Tax_DailySummary, Tax, "Tax in Equal in Both Sale Recap & Daily Summary");
	
	}
	@Then("Check the Daily Summary Grand Sales value is Equal with Sale Recap Grand Sales value")
	public void checkTheDailySummaryGrandSalesValueIsEqualWithSaleRecapGrandSalesValue() {
	    // Write code here that turns the phrase above into concrete actions
		String GrandSale=repts.Grand_Sale_DailySummaryReport().getText().replace(",", "");

		cmp.Assertion_Validation_Two_Values(Grand_Sale_DailySummary, GrandSale, "Grand Sales in Equal in Both Sale Recap & Daily Summary");
	
	}

}
