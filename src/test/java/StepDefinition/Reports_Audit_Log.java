package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

public class Reports_Audit_Log 
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	Utility ut = new Utility();

	@Given("Open the Reports - Audit Log Report home page BaseURL and storeID")
	public void OpenAuditLogHomepage() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"auditLog");
		Thread.sleep(5000);
	}

	@Given("Verifying the Audit Log Report Header Page")
	public void verifyingTheAuditLogReportHeaderPage()
	{
		try {
			if(driver.findElement(By.xpath("//h3[contains(.,'Audit Log')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "Audit Log report page is loaded successfully");
			}
		}catch(Exception E) {
			test.log(LogStatus.FAIL, "Audit Log report page is not loaded");
		}
	}

	@Then("Check Select the Source Field is Displayed")
	public void checkSelectTheSourceFieldIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.Source_Filed,"Select Source Field");
	}
	@Then("Check Action Field in Table is Displayed")
	public void checkActionFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.Action_ColumnField,"Action Column Field");
	}
	@Then("Check Event Date and Time Field in Table is Displayed")
	public void checkEventDateAndTimeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.EventDateAndTime_ColumnField,"Event Date and Time Column Field");
	}
//	@Then("Check Employee Field in Table is Displayed")
//	public void checkEmployeeFieldInTableIsDisplayed() throws Exception
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Employee_Column_Field,"Employee Column Field");
//	}
	@Then("Check Device Type Field in Table is Displayed")
	public void checkDeviceTypeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.DeviceType_ColumnField,"Device Type Column Field");
	}
	@Then("Check Log Field in Table is Displayed")
	public void checkLogFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Log_ColumnField,"Log Column Field");
	}

	@Given("I Select the Source as BO")
	public void iSelectTheSourceAsBO() throws Exception 
	{
		repts.Source_Filed.click();
		Thread.sleep(500);
		repts.BOSource.click();
	}
	@Then("Check Select the Event Field is Displayed")
	public void checkSelectTheEventFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.EventInputBox,"Select Event Field");
	}
	@Given("I Select the Event as All")
	public void iSelectTheEventAsAll() throws Exception 
	{
		repts.EventInputBox.click();
		Thread.sleep(500);
		// Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}
	@Then("Verify Audit Log Report Available for Today or Not with Source as BO")
	public void verifyAuditLogReportAvailableForTodayOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Today");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Today");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Audit Log Report Available for Yesterday or Not with Source as BO")
	public void verifyAuditLogReportAvailableForYesterdayOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Yesterday");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Yesterday");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);

		}
	}

	@Then("Verify Audit Log Report Available for Last N Days or Not with Source as BO")
	public void verifyAuditLogReportAvailableForLastNDaysOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last N Days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last N Days");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for This Week or Not with Source as BO")
	public void verifyAuditLogReportAvailableForThisWeekOrNot() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for This Week");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for This Week");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Last Week or Not with Source as BO")
	public void verifyAuditLogReportAvailableForLastWeekOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last Week");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last Week");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Last Seven Days or Not with Source as BO")
	public void verifyAuditLogReportAvailableForLastSevenDaysOrNot() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last Seven Days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last Seven Days");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}
	@Then("Verify Audit Log Report Available for This Month or Not with Source as BO")
	public void verifyAuditLogReportAvailableForThisMonthOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for This Month");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for This Month");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Last Month or Not with Source as BO")
	public void verifyAuditLogReportAvailableForLastMonthOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last Month");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last Month");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Last Thirty Days or Not with Source as BO")
	public void verifyAuditLogReportAvailableForLastThirtyDaysOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last Thirty Days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last Thirty Days");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Specific Date or Not with Source as BO")
	public void verifyAuditLogReportAvailableForSpecificDateOrNot() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Specific Date");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Specific Date");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Date Range or Not with Source as BO")
	public void verifyAuditLogReportAvailableForDateRangeOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Date Range");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Date Range");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Given("I Select the Source as POS")
	public void iSelectTheSourceAsPOS() throws Exception 
	{
		repts.Source_Filed.click();
		Thread.sleep(500);
		repts.POSSource.click();
	}
	@Then("Check Select Filter Field in Table is Displayed")
	public void checkSelectFilterFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Filter_Input, "Select Filter Field");
	}
	@Then("Check Select Check Type Field in Table is Displayed")
	public void checkSelectCheckTypeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.CheckType_Input, "Check Type Field");
	}

	@Given("I Select Filter as All")
	public void iSelectFilterAsAll() throws Exception
	{
		repts.Filter_Input.click();
		Thread.sleep(500);
		// Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}
	@Given("I Select Check Type as All")
	public void iSelectCheckTypeAsAll() throws Exception
	{
		repts.CheckType_Input.click();
		Thread.sleep(500);
		// Select the All option
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}

	@Then("Verify Audit Log Report Available for Today or Not with Source as POS")
	public void verifyAuditLogReportAvailableForTodayOrNotSourcePOS() throws Exception 
	{Thread.sleep(8000);
	try {
		if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Audit Log Not Available for Today");
			ut.PassedCaptureScreenshotAsBASE64();
		}
	} 
	catch (Exception G) 
	{

		test.log(LogStatus.PASS, "Audit Log Available for Today");

		Thread.sleep(2000);

		test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
		test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
		test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
		test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
		test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

		//div[1]/div/data-grid-row/div/div[2]/span
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(3000);
	}
	}

	@Then("Verify Audit Log Report Available for Yesterday or Not with Source as POS")
	public void verifyAuditLogReportAvailableForYesterdayOrNotSourcePOS() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Yesterday");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Yesterday");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Last N Days or Not with Source as POS")
	public void verifyAuditLogReportAvailableForLastNDaysOrNotSourcePOS() throws Exception
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last N Dayss");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last N Days");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for This Week or Not with Source as POS")
	public void verifyAuditLogReportAvailableForThisWeekOrNotSourcePOS() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for This Week");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for This week");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Last Week or Not with Source as POS")
	public void verifyAuditLogReportAvailableForLastWeekOrNotSourcePOS() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last Week");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last Week");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Last Seven Days or Not with Source as POS")
	public void verifyAuditLogReportAvailableForLastSevenDaysOrNotSourcePOS() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last Seven Days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last Seven Days");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}
	@Then("Verify Audit Log Report Available for This Month or Not with Source as POS")
	public void verifyAuditLogReportAvailableForThisMonthOrNotSourcePOS() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify Audit Log Report Available for Last Month or Not with Source as POS")
	public void verifyAuditLogReportAvailableForLastMonthOrNotSourcePOS() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last Month");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last Month");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Last Thirty Days or Not with Source as POS")
	public void verifyAuditLogReportAvailableForLastThirtyDaysOrNotSourcePOS() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Last Thirty Days");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Last Thirty Days");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Specific Date or Not with Source as POS")
	public void verifyAuditLogReportAvailableForSpecificDateOrNotSourcePOS() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Specific Date");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Specific Date");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

	@Then("Verify Audit Log Report Available for Date Range or Not with Source as POS")
	public void verifyAuditLogReportAvailableForDateRangeOrNotSourcePOS() throws Exception 
	{
		Thread.sleep(8000);
		try {
			if (driver.findElement(By.xpath("//td[contains(.,'No audit log for selected time period')]")).isDisplayed())
			{
				test.log(LogStatus.INFO, "Audit Log Not Available for Date Range");
				ut.PassedCaptureScreenshotAsBASE64();
			}
		} 
		catch (Exception G) 
		{

			test.log(LogStatus.PASS, "Audit Log Available for Date Range");

			Thread.sleep(2000);

			test.log(LogStatus.INFO, "Action is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText());
			test.log(LogStatus.INFO, "Event date & time is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span")).getText());
			test.log(LogStatus.INFO, "Employee is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span")).getText());
			test.log(LogStatus.INFO, "Device Type is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[4]/span")).getText());
			test.log(LogStatus.INFO, "Log is : "+driver.findElement(By.xpath("//tbody/tr[1]/td[5]//a")).getText());

			//div[1]/div/data-grid-row/div/div[2]/span
			ut.PassedCaptureScreenshotAsBASE64();
			Thread.sleep(3000);
		}
	}

}
