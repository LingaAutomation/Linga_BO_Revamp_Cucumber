package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Reports_Cash_Transaction_Report 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	Utility ut = new Utility();

	@Given("Open the Reports - Cash Transaction Report home page BaseURL and storeID")
	public void OpenCashTransactionReportHomePage() throws Exception
	{

		Thread.sleep(5000);
		//Load the Department page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"tillReport/cashTransaction");
	}

	@Given("Verifying the Cash Transaction Report Header Page")
	public void verifyingTheCashTransactionReportHeaderPage() throws Exception 
	{
		Thread.sleep(5000);
		//Verify the Till Report Page loaded or not
		repts.Verify_ReportHomePage("CASH TRANSACTION");
	}

	@Then("Check Select Transaction Type Field is Displayed")
	public void checkSelectTransactionTypeFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Transaction_TypeInputBx,"Select Transaction Type Field");
	}
	@Then("Verify Transaction Date Field in Table is Displayed")
	public void verifyTransactionDateFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.TransactionDate,"Transaction Date Field");
	}
	@Then("Verify Employee Field in Table is Dispalyed")
	public void verifyEmployeeFieldInTableIsDispalyed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Employee_Column_Field,"Employee Column Field");
	}
	@Then("Verify Check Field in Table is Displayed")
	public void verifyCheckFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Check_Column_Field,"Check Column Field");
	}
	@Then("Check Transaction Type Field in Table is Displayed")
	public void checkTransactionTypeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Transaction_Type_Column_Field,"Transaction Type Column Field");
	}
//	@Then("Check Reason Field in Table is Displayed")
//	public void checkReasonFieldInTableIsDisplayed() throws Exception
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Reason_Column_Field,"Reason Column Field");
//	}

	@Given("I Select Transaction Type as All")
	public void iSelectTransactionTypeAsAll() throws Exception
	{
		repts.Transaction_TypeInputBx.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}
	@Then("Verify Cash Transaction Report Available for Today or Not")
	public void verifyCashTransactionReportAvailableForTodayOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Today");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Today");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Today is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for Yesterday or Not")
	public void verifyCashTransactionReportAvailableForYesterdayOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Yesterday");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Yesterday");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Yesterday is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for Last N Days or Not")
	public void verifyCashTransactionReportAvailableForLastNDaysOrNot() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Last N Days");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Last N Days");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Last N  is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for This Week or Not")
	public void verifyCashTransactionReportAvailableForThisWeekOrNot() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for This Week");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for This Week");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for This Week is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for Last Seven Days or Not")
	public void verifyCashTransactionReportAvailableForLastSevenDaysOrNot() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Last Seven Days");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Last Seven Days");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Last Seven Days is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for This Month or Not")
	public void verifyCashTransactionReportAvailableForThisMonthOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for This Month");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for This Month");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for This Month is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for Last Month or Not")
	public void verifyCashTransactionReportAvailableForLastMonthOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Last Month");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Last Month");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Last Month is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for Last Thirty Days or Not")
	public void verifyCashTransactionReportAvailableForLastThirtyDaysOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Last 30 Days");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Last 30 Days");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Last 30 Days is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for Specific Date or Not")
	public void verifyCashTransactionReportAvailableForSpecificDateOrNot() throws Exception
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Specific Date");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Specific Date");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Specific Date is : "+Total);


				}

			}
		}
	}

	@Then("Verify Cash Transaction Report Available for Date Range or Not")
	public void verifyCashTransactionReportAvailableForDateRangeOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Date Range");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Date Range");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Date Range is : "+Total);


				}

			}
		}
	}


	@Then("Verify Cash Transaction Report Available for Last Week or Not")
	public void verifyCashTransactionReportAvailableForLastWeekOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
			if(repts.NoCashTransactionFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Cash Transaction Reports Not Available for Lat Week");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Cash Transaction Reports Available for Last Week");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=5)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Trans_Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Emp_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();





					String Trans_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Transaction Date is : "+Trans_Date+" Employee Name is : "+Emp_Name+" Transaction Type is : "+Trans_Type+" Amount is : "+Amount);

					Thread.sleep(1000);
					String Total=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();


					test.log(LogStatus.INFO, "Total Amount for the Selected Time Period for Last Week is : "+Total);


				}

			}
		}
	}





}
