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

public class Reports_Membership_Statement 
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
	
	@Given("Open the Reports - Membership Statement Report home page BaseURL and storeID")
	public void openTheReportsMembershipStatementReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Daily page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"membershipReport/membershipStatement");

	}
	@Given("Verifying the Membership Statement Report Header Page")
	public void verifyingTheMembershipStatementReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loaded or not
		repts.Verify_ReportHomePage("MEMBERSHIP STATEMENT");
		
	}
	@Then("Check Plan Field in Table is Displayed")
	public void checkPlanFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Plan_Column_Field, "Plan Column Field");

	}
	@Then("Check Account Recharge Field in Table is Displayed")
	public void checkAccountRechargeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Account_Recharge_Column_Field, "Account Recharge Column Field");

	}
	@Then("Verify Membership Statement Report Available for Selected Customer or Not")
	public void verifyMembershipStatementReportAvailableForSelectedCustomerOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/div/data-grid-row/div/div[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Membership Statement Report is Available for Searched Customer");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Membership Statement Report is Not Available for Searched Customer");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
	}
	@Then("Verify Membership Statement Report Available for Today or Not")
	public void verifyMembershipStatementReportAvailableForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Today");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
			
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
		
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
			
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
			
				
			}
		}
	
		}
	}
	@Then("Verify Membership Statement Report Available for Yesterday or Not")
	public void verifyMembershipStatementReportAvailableForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Yesterday");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
		
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
		
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
		
			}
		}
		
		}
	}
	@Then("Verify Membership Statement Report Available for Last N Days or Not")
	public void verifyMembershipStatementReportAvailableForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Last 'N' days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Last 'N' days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
			
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
			
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
	
			
		}
	}
	@Then("Verify Membership Statement Report Available for This Week or Not")
	public void verifyMembershipStatementReportAvailableForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for This Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
			
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
		
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		
		}
	}
	@Then("Verify Membership Statement Report Available for Last Week or Not")
	public void verifyMembershipStatementReportAvailableForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Last Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
		
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
			
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
	
		}
	}
	@Then("Verify Membership Statement Report Available for Last Seven Days or Not")
	public void verifyMembershipStatementReportAvailableForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Last 7 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Last 7 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
			
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
			
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		

	
		}
	}
	@Then("Verify Membership Statement Report Available for This Month or Not")
	public void verifyMembershipStatementReportAvailableForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for This Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
			
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
			
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		

	
		}
	}
	@Then("Verify Membership Statement Report Available for Last Month or Not")
	public void verifyMembershipStatementReportAvailableForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Last Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
				
			}
		}
	
		}
	}
	@Then("Verify Membership Statement Report Available for Last Thirty Days or Not")
	public void verifyMembershipStatementReportAvailableForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Last 30 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Last 30 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
			
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}

		}
	}
	@Then("Verify Membership Statement Report Available for Specific Date or Not")
	public void verifyMembershipStatementReportAvailableForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Specific Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				
				
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
				
				
			}
		}
	
		}
	}
	@Then("Verify Membership Statement Report Available for Date Range or Not")
	public void verifyMembershipStatementReportAvailableForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Membership Statement Report Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Membership Statement Report Available for Date Range");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
			
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				
				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);

			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String Account_Recharge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
			
				
				String Price=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Tax=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Total=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Tips=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				test.log(LogStatus.INFO, "Date is : "+Date+" Check No is: "+Check+" Business Date is : "+Date+" Plan is : "+Plan+" Account Recharge is : "+Account_Recharge+" Price is : "+Price+" Tax : "+Tax+" Total is : "+Total+ "Tips : "+Tips);
	
			}
		}

		}
	}
}
