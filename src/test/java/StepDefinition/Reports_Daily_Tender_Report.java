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

public class Reports_Daily_Tender_Report 
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
	
	@Given("Open the Reports - Daily Tender Report home page BaseURL and storeID")
	public void openTheReportsDailyTenderReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Menu Item sales report page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"dailyTenderReport");

	}
	@Given("Verifying the Daily Tender Report Header Page")
	public void verifyingTheDailyTenderReportHeaderPage() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyMainScreenPageHeader("Daily Tender");
	}
	@Then("Check Cash Field in Table is Displayed")
	public void checkCashFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Cash_Column_Field, "Cash Column Field");
	}
	@Then("Check Side CC Field in Table is Displayed")
	public void checkSideCCFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Side_CC_Column_Field, "Side CC Column Field");

	}
	@Then("Check Amex Field in Table is Displayed")
	public void checkAmexFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Amex_Column_Field, "Amex Column Field");

	}
	@Then("Check Master Field in Table is Displayed")
	public void checkMasterFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Master_Column_Field, "Master Column Field");

	}
	@Then("Check Visa Field in Table is Displayed")
	public void checkVisaFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Visa_Column_Field, "Visa Column Field");
	}
	@Then("Check Others Field in Table is Displayed")
	public void checkOthersFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Others_Column_Field, "Others Column Field");

	}
	@Then("Check Diners Field in Table is Displayed")
	public void checkDinersFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Diners_Column_Field, "Diners Column Field");

	}
	@Then("Check Online Aggregator Field in Table is Displayed")
	public void checkOnlineAggregatorFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Online_Aggregator_Column_Field, "Online Aggregator Column Field");

	}
	@Then("Check Kiosk Field in Table is Displayed")
	public void checkKioskFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Kiosk_Column_Field, "Kiosk Column Field");
	}
	@Then("Check Online Payment Field in Table is Displayed")
	public void checkOnlinePaymentFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Online_Payment_Column_Field, "Online Payment Column Field");

	}
	@Then("Check Gift Card Field in Table is Displayed")
	public void checkGiftCardFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Gift_Card_Column_Field, "Gift Card Column Field");
	}
	@Then("Check Net Amt Field in Table is Displayed")
	public void checkNetAmtFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Net_Amt_Column_Field, "Net Amt Column Field");
	}
	@Then("Check Day Total Field in Table is Displayed")
	public void checkDayTotalFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Day_Total_Column_Field, "Day Total Column Field");
	}
	@Then("Verify Daily Tender Report Available for Today or Not")
	public void verifyDailyTenderReportAvailableForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily Tender Report Not Available for Today");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Today");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Tender Report Available for Yesterday or Not")
	public void verifyDailyTenderReportAvailableForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for Yesterday");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Yesterday");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();


			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Tender Report Available for Last N Days or Not")
	public void verifyDailyTenderReportAvailableForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for Last N Days");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Last N days");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Tender Report Available for This Week or Not")
	public void verifyDailyTenderReportAvailableForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for This Week");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for This Week");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();


			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Tender Report Available for Last Week or Not")
	public void verifyDailyTenderReportAvailableForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for Last Week");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Last Week");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Tender Report Available for Last Seven Days or Not")
	public void verifyDailyTenderReportAvailableForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for Last 7 days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Last 7 days");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();


			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Tender Report Available for This Month or Not")
	public void verifyDailyTenderReportAvailableForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for This month");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for This month");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();


			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}
	
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Tender Report Available for Last Month or Not")
	public void verifyDailyTenderReportAvailableForLastMonthOrNot() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for Last month");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Last month");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}
	@Then("Verify Daily Tender Report Available for Last Thirty Days or Not")
	public void verifyDailyTenderReportAvailableForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for Last 30 days");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Last 30 days");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}
	@Then("Verify Daily Tender Report Available for Specific Date or Not")
	public void verifyDailyTenderReportAvailableForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for Specific Date");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Specific Date");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}

			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}
	@Then("Verify Daily Tender Report Available for Date Range or Not")
	public void verifyDailyTenderReportAvailableForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for Date Range");
				ut.InfoCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for Date Range");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//repts.Do_Pagination();

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));

			List<WebElement> colList=driver.findElements(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div"));
			
			for(int i = 2;i<=colList.size();i++) {
				test.log(LogStatus.INFO, "Total "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div["+i+"]")).getText()+" value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//data-grid/div/div/div["+rowList.size()+"]/div[@class='content-container']/data-grid-row/div/div["+i+"]")).getText());
			}
		
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}	
	}
	@Given("I Search the selected Date")
	public void iSearchTheSelectedDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
//	    List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	    
	    
		String Date=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
		
//		cmp.SearchBox.clear();
//		Thread.sleep(2000);
//		cmp.Search(Date);
		
		cmp.Search_inTable(Date);
		
		
	}
	@Then("Verify Daily Tender Report Available for Selected Date or Not")
	public void verifyDailyTenderReportAvailableForSelectedDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Daily_Tender Report Not Available for searched Date");
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Daily_Tender Report Available for searched Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

}
