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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Reports_Till_Report 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	Utility ut = new Utility();

	@Given("Open the Reports - Till Report home page BaseURL and storeID")
	public void OpenTillReportHomePage() throws Exception 
	{
		Thread.sleep(5000);
		//Load the Department page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"tillReport/till");
	}

	@Given("Verifying the Till Report Header Page")
	public void verifyingTheTillReportHeaderPage() throws Exception 
	{
		Thread.sleep(5000);
		//Verify the Till Report Page loaded or not
		repts.Verify_ReportHomePage("TILL");
	}






	@Then("Check Select Employee Field is Displayed")
	public void checkSelectEmployeeFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Employee_InputBx,"Select Employee Field");
	}

	@Then("Check Select Till Type Field is Displayed")
	public void checkSelectTillTypeFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Till_TypeInputBx,"Select Till Type Field");
	}
	@Then("Check Select TimePeriod Field is Displayed")
	public void checkSelectTimePeriodFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Time_PeriodInputBx,"Select Time Period Field");
	}
//	@Then("Check Node Field in Table is Displayed")
//	public void checkNodeFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Node_Header,"Node Header Column");
//	}
//	@Then("Check Date Field in Table is Displayed")
//	public void checkDateFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Date_Header,"Date Header Column");
//	}
	@Then("Check User Field in Table is Displayed")
	public void checkUserFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.User_Header,"User Header Column");
	}
	@Then("Check Cash Expected Field in Table is Displayed")
	public void checkCashExpectedFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.Cash_Expected_Header,"Cash Expected Header Column");
	}
	@Then("Check Over\\/Shortage Field in Table is Displayed")
	public void checkOverShortageFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.OverShortage_Header,"Over/ Shortage Header Column");
	}

	@Given("I Select Employee as All")
	public void iSelectEmployeeAsAll() throws Exception
	{
		//Thread.sleep(5000);
		repts.Employee_InputBx.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}
	@Given("I Select Till Type as All")
	public void iSelectTillTypeAsAll() throws Exception 
	{
		repts.Till_TypeInputBx.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
	}
	
	@And("I Click the Apply button in Till Report")
	public void ClickApplyButton()
	{
		driver.findElement(By.xpath("//button[contains(.,'APPLY ')]")).click();
	}
	@Then("Verify Till Report Available for Today or Not")
	public void verifyTillReportAvailableForTodayOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Today");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Today");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Today");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Today. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Today");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Today. The Diff is : "+diff);
					}
				}
			}
		}
	}


	@Then("Verify Till Report Available for Yesterday or Not")
	public void verifyTillReportAvailableForYesterdayOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Yesterday");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Yesterday");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Yesterday");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Yesterday. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Yesterday");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Yesterday. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for Last N Days or Not")
	public void verifyTillReportAvailableForLastNDaysOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Last N Days");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Last N Days");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last N Days");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last N Days. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last N Days");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last N Days. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for This Week or Not")
	public void verifyTillReportAvailableForThisWeekOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for This Week");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for This Week");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for This Week");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for This Week. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for This Week");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for This Week. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for Last Week or Not")
	public void verifyTillReportAvailableForLastWeekOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Last Week");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Last Week");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last Week");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last Week. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last Week");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last Week. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for Last Seven Days or Not")
	public void verifyTillReportAvailableForLastSevenDaysOrNot() throws Exception {
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Last Seven Days");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Last Seven Days");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last Seven Days");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last Seven Days. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last Seven Days");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last Seven Days. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for This Month or Not")
	public void verifyTillReportAvailableForThisMonthOrNot() throws Exception {
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for This Month");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for This Month");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for This Month");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for This Month. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for This Month");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for This Month. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for Last Month or Not")
	public void verifyTillReportAvailableForLastMonthOrNot() throws Exception
	{
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Last Month");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Last Month");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last Month");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last Month. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last Month");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last Month. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for Last Thirty Days or Not")
	public void verifyTillReportAvailableForLastThirtyDaysOrNot() throws Exception {
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Last Thirty Days");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Last Thirty Days");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last Thirty Days");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last Thirty Days. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Last Thirty Days");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Last Thirty Days. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for Specific Date or Not")
	public void verifyTillReportAvailableForSpecificDateOrNot() throws Exception {
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Specific Date");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Specific Date");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Specific Date");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Specific Date. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Specific Date");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Specific Date. The Diff is : "+diff);
					}
				}
			}
		}
	}

	@Then("Verify Till Report Available for Date Range or Not")
	public void verifyTillReportAvailableForDateRangeOrNot() throws Exception
	{
		try
		{
			if(repts.NoTillFound_InfoMsg.isDisplayed())
			{
				test.log(LogStatus.INFO, "Till Reports Not Available for Date Range");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Till Reports Available for Date Range");

			ut.PassedCaptureScreenshotAsBASE64();

			Thread.sleep(2000);
			//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			//			repts.Do_Pagination();


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Date Range");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Date Range. The Diff is : "+diff);
					}
				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{
					String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					String User_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();

					String Cash_Expected=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

					String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

					String Over_Shortage=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

					test.log(LogStatus.INFO, "Node is : "+Node+" Date is : "+Date+" User is : "+User_Name+" Cash Expected : "+Cash_Expected+" Amount is : "+Amount+" Over/Shortage is : "+Over_Shortage);

					Thread.sleep(1000);
					String Total_CashExpect=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[4]/div")).getText();
					double Total_CashExpected=Double.parseDouble(Total_CashExpect);

					String Total_Amt=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[5]/div")).getText();
					double Total_Amount=Double.parseDouble(Total_Amt);

					double Expected_OverShortage=Total_Amount-Total_CashExpected;
					String Expected_Over_Shortage=String.valueOf(Expected_OverShortage);

					String Actual_OverShortage=driver.findElement(By.xpath("//tfoot//div[contains(.,'Total')]/../..//td[6]/div")).getText();
					double Actual_Over_Shortage=Double.parseDouble(Actual_OverShortage);

					if(Actual_Over_Shortage==Expected_OverShortage)
					{
						test.log(LogStatus.PASS, "Over/Shortage Calculated Correctly for Date Range");
					}
					else
					{
						double diff=Actual_Over_Shortage-Expected_OverShortage;

						test.log(LogStatus.FAIL, "Over/Shortage is Calculated Incorrect for Date Range. The Diff is : "+diff);
					}
				}
			}
		}
	}







}
