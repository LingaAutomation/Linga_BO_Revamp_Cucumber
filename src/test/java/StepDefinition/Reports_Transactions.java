package StepDefinition;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Reports_Transactions 
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();

	public String st="NA";


	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();

	@Given("Open the Reports - Transaction Report home page BaseURL and storeID")
	public void openTheReportsTransactionReportHomePageBaseURLAndStoreID() throws Exception 
	{
		Thread.sleep(5000);
		//Load the Department page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"transactionsReport/transactions");
	}
	@Given("Verifying the Transaction Report Header Page")
	public void verifyingTheTransactionReportHeaderPage() throws Exception
	{
		Thread.sleep(8000);
		//Verify the Categories page loeded or not
		repts.Verify_ReportHomePage("TRANSACTIONS");
	}

	@Then("Check Select TenderOption Field is Displayed")
	public void checkSelectTenderOptionFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Tender_Dropdown, "Select Tender Option Field");
	}
	@Then("Check Select TenderName Field is Displayed")
	public void checkSelectTenderNameFieldIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.TenderName_Dropdown, "Select Tender Name Field");
	}
	@Then("Check Select CardType Field is Displayed")
	public void checkSelectCardTypeFieldIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.CardType_Dropdown, "Select CardType Field");
	}
	@Then("Check Select SaleCloseDate Field is Displayed")
	public void checkSelectSaleCloseDateFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.SaleCloseDate_Dropdown, "Select SaleCloseDate Field");
	}
	@Then("Check Select TransactionDate Field is Displayed")
	public void checkSelectTransactionDateFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.TransactionDate_Dropdown, "Select TransactionDate Field");
	}
	@Then("Check SaleCloseDate Field in Table is Displayed")
	public void checkSaleCloseDateFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.SaleCloseDateColumn, "Sale close Date Column Field");
	}
	@Then("Check TransactionDate Field in Table is Displayed")
	public void checkTransactionDateFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.TransactionDateColumn, "Transaction Date Column Field");
	}
	@Then("Check PaymentNo Field in Table is Displayed")
	public void checkPaymentNoFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.PaymentNoColumn, "Payment No Column Field");
	}
	@Then("Check EmployeeName Field in Table is Displayed")
	public void checkEmployeeNameFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.EmployeeNameColumn, "Employee Name Column Field");
	}
	@Then("Check TenderName Field in Table is Displayed")
	public void checkTenderNameFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.TenderNameColumn, "Tender Name Column Field");
	}
	@Then("Check CardType Field in Table is Displayed")
	public void checkCardTypeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.CardTypeColumn, "CardType Column Field");
	}
	@Then("Check CardNumber\\(last {int}-digits) Field in Table is Displayed")
	public void checkCardNumberLastDigitsFieldInTableIsDisplayed(Integer int1) throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.CardNumberLast4digits, "CardNumber(last-4 digits) Column Field");
	}
	@Then("Check AuthCode Field in Table is Displayed")
	public void checkAuthCodeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.AuthCodeColumn, "Auth Code Column Field");
	}
	@Then("Check Status Field in Table is Displayed")
	public void checkStatusFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.StatusColumn, "Status Column Field");
	}
	@Then("Check CCTip Charge Field in Table is Displayed")
	public void checkCCTipChargeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.CCTipChargeColumn, "CC Tip Charge Column Field");
	}
//	@Then("Check Amount Field in Table is Displayed")
//	public void checkAmountFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.AmountColumn, "Amount Column Field");
//	}
	@Then("Check Tip Field in Table is Displayed")
	public void checkTipFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.TipColumn, "Tip Column Field");
	}

	@Given("Select Tender Option as ByTenderName")
	public void selectTenderOptionAsByTenderName() throws Exception 
	{
		Thread.sleep(8000);
		repts.Tender_Dropdown.click();
		Thread.sleep(500);
		// Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'Name')]")).click();
	}
	@Then("Select Tender Name as All")
	public void selectTenderNameAsAll() throws Exception 
	{
		repts.TenderName_Dropdown.click();
		Thread.sleep(500);
		// Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();

	}
	@Then("Select Card Type as All")
	public void selectCardTypeAsAll() throws Exception 
	{
		repts.CardType_Dropdown.click();
		Thread.sleep(500);
		// Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}
	@Then("Select Sale Close Date as Last N Days")
	public void selectSaleCloseDateAsLastNDays() throws Exception {
		repts.SaleCloseDate_Dropdown.click();
		Thread.sleep(500);
		// Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'Last N days')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(.,'Number of Days')]/../input)")).clear();
		driver.findElement(By.xpath("(//span[contains(.,'Number of Days')]/../input)")).sendKeys("100");
		Thread.sleep(500);
	}
	@Then("Select the Transaction Date as Today")
	public void selectTheTransactionDateAsToday() throws Exception 
	{
		repts.TransactionDate_Dropdown.click();
		Thread.sleep(500);
		//repts.Select_Today_TimePeriod();
		driver.findElement(By.xpath("//select-option[contains(.,'Today')]")).click();
	}
	@Then("Verify Transaction Report Availble for Today or Not")
	public void verifyTransactionReportAvailbleForTodayOrNot() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Today");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {

			test.log(LogStatus.PASS, "Transaction Report Available for Today");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList = driver
					.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

			for (int i = 10; i <= colList.size(); i++) {
				test.log(LogStatus.INFO, "Total "
						+ driver.findElement(By.xpath(
								"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
						.getText()
						+ " value is available for the mentioned time period - Today : "
						+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Select the Transaction Date as Yesterday")
	public void selectTheTransactionDateAsYesterday() throws Exception 
	{
		repts.TransactionDate_Dropdown.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'Yesterday')]")).click();
	}
	@Then("Verify Transaction Report Availble for Yesterday or Not")
	public void verifyTransactionReportAvailbleForYesterdayOrNot() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Yesterday");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for Yesterday");

			Thread.sleep(2000);
			// Verify Donut Chart screen
			// repts.Verify_Donut_Chart_Screen_TopSales();

			// Verify Bars Chart Screen
			// repts.Verify_Bars_Chart_Screen_TopSales();

			// Verify Sales By Hours
			// repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList = driver
					.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

			for (int i = 10; i <= colList.size(); i++) {
				test.log(LogStatus.INFO, "Total "
						+ driver.findElement(By.xpath(
								"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
						.getText()
						+ " value is available for the mentioned time period - Yesterday : "
						+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Select the Transaction Date as Last N Days")
	public void selectTheTransactionDateAsLastNDays() throws Exception {
		repts.TransactionDate_Dropdown.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'Last N days')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[contains(.,'Number of Days')]/../input)")).clear();
		driver.findElement(By.xpath("(//span[contains(.,'Number of Days')]/../input)")).sendKeys("1000");
		Thread.sleep(500);
	}
	@Then("Verify Transaction Report Availble for Last N Days or Not")
	public void verifyTransactionReportAvailbleForLastNDaysOrNot() throws Exception {
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Last N Days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for Last N days");

			Thread.sleep(2000);
			// Verify Donut Chart screen
			// repts.Verify_Donut_Chart_Screen_TopSales();

			// Verify Bars Chart Screen
			// repts.Verify_Bars_Chart_Screen_TopSales();

			// Verify Sales By Hours
			// repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList = driver
					.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

			for (int i = 10; i <= colList.size(); i++) {
				test.log(LogStatus.INFO, "Total "
						+ driver.findElement(By.xpath(
								"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
						.getText()
						+ " value is available for the mentioned time period - Last N Days : "
						+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Select the Transaction Date as This Week")
	public void selectTheTransactionDateAsThisWeek() throws Exception 
	{
		repts.TransactionDate_Dropdown.click();
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'This week')]")).click();
	}
	@Then("Verify Transaction Report Availble for This Week or Not")
	public void verifyTransactionReportAvailbleForThisWeekOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for This Week");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for This Week");

			Thread.sleep(2000);


			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);

			List<WebElement> colList = driver
					.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

			for (int i = 10; i <= colList.size(); i++) {
				test.log(LogStatus.INFO, "Total "
						+ driver.findElement(By.xpath(
								"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
						.getText()
						+ " value is available for the mentioned time period - This Week : "
						+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Select the Transaction Date as Last Week")
	public void selectTheTransactionDateAsLastWeek() throws Exception {
		repts.TransactionDate_Dropdown.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'Last week')]")).click();
	}
	@Then("Verify Transaction Report Availble for Last Week or Not")
	public void verifyTransactionReportAvailbleForLastWeekOrNot() throws Exception {
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Last Week");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for Last Week");

			Thread.sleep(2000);

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);

			Thread.sleep(3000);


			try {
				List<WebElement> colList = driver.findElements(
						By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

				for (int i = 10; i <= colList.size(); i++) {
					test.log(LogStatus.INFO,
							"Total " + driver.findElement(By.xpath(
									"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
							.getText() + " value is available for the mentioned time period - Last Week : "
							+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]"))
							.getText());
				}

				ut.PassedCaptureScreenshotAsBASE64();
				Thread.sleep(3000);
			} catch (Exception f) {
				test.log(LogStatus.FAIL, "Total values are not available but some transaction reoprts are available");
			}

		}
	}

	@Then("Select the Transaction Date as Last Seven Days")
	public void selectTheTransactionDateAsLastSevenDays() throws Exception 
	{
		repts.TransactionDate_Dropdown.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'Last 7 days')]")).click();
	}
	@Then("Verify Transaction Report Availble for Last Seven Days or Not")
	public void verifyTransactionReportAvailbleForLastSevenDaysOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Last 7 days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for Last 7 days");

			Thread.sleep(2000);
			// Verify Donut Chart screen
			// repts.Verify_Donut_Chart_Screen_TopSales();

			// Verify Bars Chart Screen
			// repts.Verify_Bars_Chart_Screen_TopSales();

			// Verify Sales By Hours
			// repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList = driver
					.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

			for (int i = 10; i <= colList.size(); i++) {
				test.log(LogStatus.INFO, "Total "
						+ driver.findElement(By.xpath(
								"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
						.getText()
						+ " value is available for the mentioned time period - Last 7 Days : "
						+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Select the Transaction Date as This Month")
	public void selectTheTransactionDateAsThisMonth() throws Exception 
	{
		repts.TransactionDate_Dropdown.click();
		Thread.sleep(500);
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//select-option[contains(.,'This month')]")).click();
	}
	@Then("Verify Transaction Report Availble for This Month or Not")
	public void verifyTransactionReportAvailbleForThisMonthOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for This month");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for This month");

			Thread.sleep(2000);
			// Verify Donut Chart screen
			// repts.Verify_Donut_Chart_Screen_TopSales();

			// Verify Bars Chart Screen
			// repts.Verify_Bars_Chart_Screen_TopSales();

			// Verify Sales By Hours
			// repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			try {
				List<WebElement> colList = driver.findElements(
						By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

				for (int i = 10; i <= colList.size(); i++) {
					test.log(LogStatus.INFO,
							"Total " + driver.findElement(By.xpath(
									"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
							.getText() + " value is available for the mentioned time period - Last Week : "
							+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]"))
							.getText());
				}

				ut.PassedCaptureScreenshotAsBASE64();
				Thread.sleep(3000);
			} catch (Exception f) {
				test.log(LogStatus.FAIL, "Total values are not available but some transaction reoprts are available");
			}

		}
	}

	@Then("Select the Transaction Date as Last Month")
	public void selectTheTransactionDateAsLastMonth() throws Exception 
	{
		repts.TransactionDate_Dropdown.click();
		Thread.sleep(500);
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport")).sendKeys(Keys.ARROW_DOWN);
		}
	driver.findElement(By.xpath("//select-option[contains(.,'Last month')]")).click();
	}
	@Then("Verify Transaction Report Availble for Last Month or Not")
	public void verifyTransactionReportAvailbleForLastMonthOrNot() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Last month");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for Last month");

			Thread.sleep(2000);
			// Verify Donut Chart screen
			// repts.Verify_Donut_Chart_Screen_TopSales();

			// Verify Bars Chart Screen
			// repts.Verify_Bars_Chart_Screen_TopSales();

			// Verify Sales By Hours
			// repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList = driver
					.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

			for (int i = 10; i <= colList.size(); i++) {
				test.log(LogStatus.INFO, "Total "
						+ driver.findElement(By.xpath(
								"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
						.getText()
						+ " value is available for the mentioned time period - Last Month : "
						+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Select the Transaction Date as Last Thirty Days")
	public void selectTheTransactionDateAsLastThirtyDays() throws Exception {
		repts.TransactionDate_Dropdown.click();
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport")).sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'Last 30 days')]")).click();
	}
	@Then("Verify Transaction Report Availble for Last Thirty Days or Not")
	public void verifyTransactionReportAvailbleForLastThirtyDaysOrNot() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Last 30 days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for Last 30 days");

			Thread.sleep(2000);
			// Verify Donut Chart screen
			// repts.Verify_Donut_Chart_Screen_TopSales();

			// Verify Bars Chart Screen
			// repts.Verify_Bars_Chart_Screen_TopSales();

			// Verify Sales By Hours
			// repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList = driver
					.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

			for (int i = 10; i <= colList.size(); i++) {
				test.log(LogStatus.INFO, "Total "
						+ driver.findElement(By.xpath(
								"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
						.getText()
						+ " value is available for the mentioned time period - Last 30 days : "
						+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}


	@Then("Select the Transaction Date as Specific Date")
	public void selectTheTransactionDateAsSpecificDate() throws Exception
	{
		String SpecificDate = Utility.getProperty("Report_Specific_Date");
		// Select Specific Date
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
		}
		repts.TransactionDate_Dropdown.click();
		Thread.sleep(500);
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//select-option[contains(.,'Specific date')]")).click();

		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
		}
		Thread.sleep(3000);
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Open calendar']")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).click();
		String year = SpecificDate.substring(6, 10);

		driver.findElement(By.xpath("//div[contains(.,'" + year + "') and contains(@class,'mat-calendar-body-today')]"))
				.click();

		String months = SpecificDate.substring(3, 5);
		String month = repts.selectMonth(months);

		driver.findElement(By.xpath("//div[contains(.,'" + month + "') and contains(@class,'mat-calendar-body')]"))
				.click();

		String days = SpecificDate.substring(0, 2);
		String day = repts.selectDate(days);

		driver.findElement(By.xpath("//div[contains(.,'" + day + "') and contains(@class,'mat-calendar-body')]"))
				.click();
	}
	@Then("Verify Transaction Report Availble for Specific Date or Not")
	public void verifyTransactionReportAvailbleForSpecificDateOrNot() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Specific Date");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for Specific Date");

			Thread.sleep(2000);
			// Verify Donut Chart screen
			// repts.Verify_Donut_Chart_Screen_TopSales();

			// Verify Bars Chart Screen
			// repts.Verify_Bars_Chart_Screen_TopSales();

			// Verify Sales By Hours
			// repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList = driver
					.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

			for (int i = 10; i <= colList.size(); i++) {
				test.log(LogStatus.INFO, "Total "
						+ driver.findElement(By.xpath(
								"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
						.getText()
						+ " value is available for the mentioned time period - Specific Date : "
						+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}


	@Then("Select the Transaction Date as Date Range")
	public void selectTheTransactionDateAsDateRange() throws Exception 
	{
		// Select Date Range
				String FromDate = Utility.getProperty("Report_Start_Date");
				String ToDate = Utility.getProperty("Report_End_Date");

				// Select Specific Date
				for (int i = 1; i <= 10; i++) {
					driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
				}
			    repts.TransactionDate_Dropdown.click();
				Thread.sleep(500);
				for(int i=1;i<=5;i++)
				{
					Thread.sleep(500);
					driver.findElement(By.xpath("//cdk-virtual-scroll-viewport")).sendKeys(Keys.ARROW_DOWN);
				}
				driver.findElement(By.xpath("//select-option[contains(.,'Date range')]")).click();

				for (int i = 1; i <= 10; i++) {
					driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
				}
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//button[@aria-label='Open calendar'])[1]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).click();
				String year = FromDate.substring(6, 10);

				driver.findElement(By.xpath("//div[contains(.,'" + year + "') and contains(@class,'mat-calendar-body-today')]"))
						.click();

				String months = FromDate.substring(3, 5);
				String month = repts.selectMonth(months);

				driver.findElement(By.xpath("//div[contains(.,'" + month + "') and contains(@class,'mat-calendar-body')]"))
						.click();

				String days = FromDate.substring(0, 2);
				String day = repts.selectDate(days);

				driver.findElement(By.xpath("//div[contains(.,'" + day + "') and contains(@class,'mat-calendar-body')]"))
						.click();

				// Date_inSpecificDateInputBx.clear();
				Thread.sleep(500);

				// Start_DateInputBx.sendKeys(FromDate);

				Thread.sleep(1000);
				driver.findElement(By.xpath("(//button[@aria-label='Open calendar'])[2]")).click();

				Thread.sleep(500);
				driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).click();
				String year1 = ToDate.substring(6, 10);

				driver.findElement(
						By.xpath("//div[contains(.,'" + year1 + "') and contains(@class,'mat-calendar-body-today')]")).click();

				String months1 = ToDate.substring(3, 5);
				String month1 = repts.selectMonth(months1);

				driver.findElement(By.xpath("//div[contains(.,'" + month1 + "') and contains(@class,'mat-calendar-body')]"))
						.click();

				String days1 = ToDate.substring(0, 2);
				String day1 = repts.selectDate(days1);

				driver.findElement(By.xpath("//div[contains(.,'" + day1 + "') and contains(@class,'mat-calendar-body')]"))
						.click();

				Thread.sleep(500);
	}
	@Then("Verify Transaction Report Availble for Date Range or Not")
	public void verifyTransactionReportAvailbleForDateRangeOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (repts.No_TransactionFound_InfoMessage().isDisplayed()) {
				test.log(LogStatus.INFO, "Transaction Report Not Available for Date Range");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} catch (Exception G) {
			test.log(LogStatus.PASS, "Transaction Report Available for Date Range");

			Thread.sleep(2000);
			// Verify Donut Chart screen
			// repts.Verify_Donut_Chart_Screen_TopSales();

			// Verify Bars Chart Screen
			// repts.Verify_Bars_Chart_Screen_TopSales();

			// Verify Sales By Hours
			// repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			// Do pagination to Last
			// repts.Do_Pagination();

			Thread.sleep(3000);
			// Get Sale Amount
			// List<WebElement>
			// rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			try {
				List<WebElement> colList = driver.findElements(
						By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));

				for (int i = 10; i <= colList.size(); i++) {
					test.log(LogStatus.INFO,
							"Total " + driver.findElement(By.xpath(
									"//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[" + i + "]"))
							.getText() + " value is available for the mentioned time period - Last Week : "
							+ driver.findElement(By.xpath("//div[contains(@class,'total row')]/div[" + i + "]"))
							.getText());
				}

				ut.PassedCaptureScreenshotAsBASE64();
				Thread.sleep(3000);
			} catch (Exception f) {
				test.log(LogStatus.FAIL, "Total values are not available but some transaction reoprts are available");
			}
		}
		}


		@Given("Select Tender Option as ByTenderType")
		public void selectTenderOptionAsByTenderType() throws Exception 
		{
			Thread.sleep(8000);
			repts.Tender_Dropdown.click();
			Thread.sleep(500);
			// Select the All option
			driver.findElement(By.xpath("//select-option[contains(.,'Type')]")).click();
		}





	}
