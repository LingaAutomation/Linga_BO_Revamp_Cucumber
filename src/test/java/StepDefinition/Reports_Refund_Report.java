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

public class Reports_Refund_Report 
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	Utility ut = new Utility();

	@Given("Open the Reports - Refund Report home page BaseURL and storeID")
	public void OpenRefundReportHomepage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"refundReport");
		Thread.sleep(5000);
	}

	@Given("Verifying the Refund Report Header Page")
	public void verifyingTheRefundReportHeaderPage() 
	{
		try {
			if(driver.findElement(By.xpath("//h3[contains(.,'Refund')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "Refund report page is loaded successfully");
			}
		}catch(Exception E) {
			test.log(LogStatus.FAIL, "Refund report page is not loaded");
		}
	}

	@Given("Select Payment Option as By Payment Name")
	public void selectPaymentOptionAsByPaymentName() throws Exception 
	{
		repts.Select_Payment_Type("By Payment Name");
	}
	@Given("Select Payment Name as All")
	public void selectPaymentNameAsAll() throws Exception 
	{
		repts.Payment_NameDropdown.click();
		Thread.sleep(500);
		//Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}

	@Then("Check Select Payment Option Field is Displayed")
	public void checkSelectPaymentOptionFieldIsDisplayed() throws Exception 
	{
	    cmp.Check_Element_or_Text_Displayed(repts.Payment_Option_InputBox,"Select Payment Option Inputbox");
	}
	@Then("Check Select Payment Name Field is Displayed")
	public void checkSelectPaymentNameFieldIsDisplayed() throws Exception 
	{
		  cmp.Check_Element_or_Text_Displayed(repts.Payment_NameDropdown,"Select Payment Name Inputbox");
	}
	
	@Then("Check Device Field in Table is Displayed")
	public void checkDeviceFieldInTableIsDisplayed() throws Exception
	{
		 cmp.Check_Element_or_Text_Displayed(repts.Device_Column,"Device Column Field");
	}
	@Then("Check Refund By Field in Table is Displayed")
	public void checkRefundByFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.Refund_Column,"Refund Column Field");
	}
	@Then("Check Payment Name Field in Table is Displayed")
	public void checkPaymentNameFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.PaymentName_Column,"Payment Name Column Field");
	}
//	@Then("Check NetSales Field in Table is Displayed")
//	public void checkNetSalesFieldInTableIsDisplayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@Then("Check Refund Tax Field in Table is Displayed")
	public void checkRefundTaxFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.RefundTax_Column,"Refund Tax Column Field");
	}
	@Then("Check Service Charge Field in Table is Displayed")
	public void checkServiceChargeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.ServiceCharge_Column,"Service Charge Column Field");
	}
	@Then("Check Total Amount Field in Table is Displayed")
	public void checkTotalAmountFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.TotalAmount_Column,"Total Amount Column Field");
	}

    @Then("Verify Refund Report Available for Today or Not By Payment Name")
	public void verifyRefundReportAvailableForTodayOrNotByPaymentName() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Today for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Today for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Yesterday or Not By Payment Name")
	public void verifyRefundReportAvailableForYesterdayOrNotByPaymentName() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Yesterday for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Yesterday for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Refund Report Available for Last N Days or Not By Payment Name")
	public void verifyRefundReportAvailableForLastNDaysOrNotByPaymentName() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last N Days for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last N Days for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last N Days : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last N Days : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last N Days : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}


	@Then("Verify Refund Report Available for This Week or Not By Payment Name")
	public void verifyRefundReportAvailableForThisWeekOrNotByPaymentName() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for This Week for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for This Week for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - ThisWeek : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - This Week : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - This Week : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Last Week or Not By Payment Name")
	public void verifyRefundReportAvailableForLastWeekOrNotByPaymentName() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last Week for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last Week for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last Week : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last Week : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last Week : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Last Seven Days or Not By Payment Name")
	public void verifyRefundReportAvailableForLastSevenDaysOrNotByPaymentName() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last Seven Days for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last Seven Days for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last Seven Days : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last Seven Days : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last Seven Days : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Refund Report Available for This Month or Not By Payment Name")
	public void verifyRefundReportAvailableForThisMonthOrNotByPaymentName() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for This Month for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for This Month");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - This Month : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - This Month : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - This Month : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Last Month or Not By Payment Name")
	public void verifyRefundReportAvailableForLastMonthOrNotByPaymentName() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last Month");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last Month for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last Month : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last Month : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last Month : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Refund Report Available for Last Thirty Days or Not By Payment Name")
	public void verifyRefundReportAvailableForLastThirtyDaysOrNotByPaymentName() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last 30 Days for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last 30 Days for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last 30 Days : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last 30 Days : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last 30 Days : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Specific Date or Not By Payment Name")
	public void verifyRefundReportAvailableForSpecificDateOrNotByPaymentName() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Specific Date for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Specific Date for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Specific Date : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Specific Date : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Specific Date : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Date Range or Not By Payment Name")
	public void verifyRefundReportAvailableForDateRangeOrNotByPaymentName() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Date Range for Payment Option as Payment Name");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Date Range for Payment Option as Payment Name");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Date Range : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Date Range : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Date Range : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Given("Select Payment Option as By Payment Type")
	public void selectPaymentOptionAsByPaymentType() throws Exception 
	{
		repts.Select_Payment_Type("By Payment Type");
	}
	@Given("Select Payment Type as All")
	public void selectPaymentTypeAsAll() throws Exception 
	{
		repts.Payment_Type.click();
		Thread.sleep(500);
		//Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}
	@Then("Verify Refund Report Available for Today or Not By Payment Type")
	public void verifyRefundReportAvailableForTodayOrNotByPaymentType() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Today for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Today for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Today : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Yesterday or Not By Payment Type")
	public void verifyRefundReportAvailableForYesterdayOrNotByPaymentType() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Yesterday for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Yesterday for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Last N Days or Not By Payment Type")
	public void verifyRefundReportAvailableForLastNDaysOrNotByPaymentType() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last N Days for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last N Days for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last N Days : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last N Days : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last N Days : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}
	@Then("Verify Refund Report Available for This Week or Not By Payment Type")
	public void verifyRefundReportAvailableForThisWeekOrNotByPaymentType() throws Exception
	{Thread.sleep(8000);
	try
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Refund Report Not Available for This Week for Payment Option as Payment Type ");
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Refund Report Available for This Week for Payment Option as Payment Type");

		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		//Do pagination to Last
		//repts.Do_Pagination();
		
		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

		test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - This Week : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
		test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - This Week : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
		test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - This Week : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
		
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(3000);

	}
	}

	@Then("Verify Refund Report Available for Last Week or Not By Payment Type")
	public void verifyRefundReportAvailableForLastWeekOrNotByPaymentType() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last Week for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last Week for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last Week : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last Week : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last Week : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Last Seven Days or Not By Payment Type")
	public void verifyRefundReportAvailableForLastSevenDaysOrNotByPaymentType() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last Seven Days for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last Seven Days for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last Seven Days : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last Seven Days : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last Seven Days : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for This Month or Not By Payment Type")
	public void verifyRefundReportAvailableForThisMonthOrNotByPaymentType() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for This Month for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for This Month for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - This Month : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - This Month : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - This Month : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Last Month or Not By Payment Type")
	public void verifyRefundReportAvailableForLastMonthOrNotByPaymentType() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last Month for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last Month for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last Month : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last Month : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last Month : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Last Thirty Days or Not By Payment Type")
	public void verifyRefundReportAvailableForLastThirtyDaysOrNotByPaymentType() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Last 30 Days for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Last 30 Days for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Last 30 Days : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Last 30 Days : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Last 30 Days : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Specific Date or Not By Payment Type")
	public void verifyRefundReportAvailableForSpecificDateOrNotByPaymentType() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Specific Date for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Specific Date for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Yesterday : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Refund Report Available for Date Range or Not By Payment Type")
	public void verifyRefundReportAvailableForDateRangeOrNotByPaymentType() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Refund Report Not Available for Date Range for Payment Option as Payment Type ");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Refund Report Available for Date Range for Payment Option as Payment Type");

			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			//Do pagination to Last
			//repts.Do_Pagination();
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			test.log(LogStatus.INFO, "Total Net sales value is available for the mentioned time period - Date Range : "+driver.findElement(By.xpath("//tfoot//td[7]")).getText());
			test.log(LogStatus.INFO, "Total Refund Tax value is available for the mentioned time period - Date Range : "+driver.findElement(By.xpath("//tfoot//td[8]")).getText());
			test.log(LogStatus.INFO, "Total Amount value is available for the mentioned time period - Date Range : "+driver.findElement(By.xpath("//tfoot//td[9]")).getText());
			
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

}
