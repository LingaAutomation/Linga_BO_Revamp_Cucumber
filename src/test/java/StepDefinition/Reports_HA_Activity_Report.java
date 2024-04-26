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

public class Reports_HA_Activity_Report 
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
	public static String HA_Card_Number,HA_Employee;
	
	@Given("Open the Reports - HA Activity Report home page BaseURL and storeID")
	public void openTheReportsHAActivityReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Daily page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"houseAccount/haActivity");

	}
	@Given("Verifying the HA Activity Report Header Page")
	public void verifyingTheHAActivityReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loeded or not
		repts.Verify_ReportHomePage("HA ACTIVITY");
	}
	@Then("Check User Name Field in Table is Displayed")
	public void checkUserNameFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.User_Name_Column_Field, "User Name Column Field in Table");
	}
	@Given("I Search the Selected Card Number")
	public void iSearchTheSelectedCardNumber() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		String GiftCard_Number=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
		
		this.HA_Card_Number=GiftCard_Number;
		//Enter Gift Card Number
		repts.Enter_Card_Number(GiftCard_Number);
	}
	@Then("Verify HA Activity Report Available for Selected Card Number or Not")
	public void verifyHAActivityReportAvailableForSelectedCardNumberOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText().equalsIgnoreCase(HA_Card_Number))
		{
			test.log(LogStatus.PASS, "HA Activity Reports is Available for Searched Card Number");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "HA Activity Reports is Not Available for Searched Card Number");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Activity Type as Issued")
	public void iSelectTheActivityTypeAsIssued() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Activity_Type_InputBx, "Issued", "Activity Type selected as Issued");
	}
	@Then("Verify HA Activity Report Available for Selected Issued Activity Type or Not")
	public void verifyHAActivityReportAvailableForSelectedIssuedActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).getText().equalsIgnoreCase("Issued"))
		{
			test.log(LogStatus.PASS, "HA Activity Reports is Available for Searched Activity Type as Issued");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "HA Activity Reports is Not Available for Searched Activity Type as Issued");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify HA Activity Report Available for Selected Redeemed Activity Type or Not")
	public void verifyHAActivityReportAvailableForSelectedRedeemedActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).getText().equalsIgnoreCase("Redeemed"))
		{
			test.log(LogStatus.PASS, "HA Activity Reports is Available for Searched Activity Type as Redeemed");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "HA Activity Reports is Not Available for Searched Activity Type as Redeemed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify HA Activity Report Available for Selected Recharges Activity Type or Not")
	public void verifyHAActivityReportAvailableForSelectedRechargesActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).getText().equalsIgnoreCase("Recharges"))
		{
			test.log(LogStatus.PASS, "HA Activity Reports is Available for Searched Activity Type as Recharges");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "HA Activity Reports is Not Available for Searched Activity Type as Recharges");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify HA Activity Report Available for Selected Refund Activity Type or Not")
	public void verifyHAActivityReportAvailableForSelectedRefundActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).getText().equalsIgnoreCase("Refund"))
		{
			test.log(LogStatus.PASS, "HA Activity Reports is Available for Searched Activity Type as Refund");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "HA Activity Reports is Not Available for Searched Activity Type as Refund");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify HA Activity Report Available for Selected Void Activity Type or Not")
	public void verifyHAActivityReportAvailableForSelectedVoidActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).getText().equalsIgnoreCase("Void"))
		{
			test.log(LogStatus.PASS, "HA Activity Reports is Available for Searched Activity Type as Void");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "HA Activity Reports is Not Available for Searched Activity Type as Void");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify HA Activity Report Available for Selected Adjustment Activity Type or Not")
	public void verifyHAActivityReportAvailableForSelectedAdjustmentActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).getText().equalsIgnoreCase("Adjustment"))
		{
			test.log(LogStatus.PASS, "HA Activity Reports is Available for Searched Activity Type as Adjustment");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "HA Activity Reports is Not Available for Searched Activity Type as Adjustment");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify HA Activity Report Available for Selected Employee or Not")
	public void verifyHAActivityReportAvailableForSelectedEmployeeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "HA Activity Reports is Available for selected Employee");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "HA Activity Reports is Not Available for selected Employee");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify HA Activity Report Available for Today or Not")
	public void verifyHAActivityReportAvailableForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Today");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		
		}
		
	}
	@Then("Verify HA Activity Report Available for Yesterday or Not")
	public void verifyHAActivityReportAvailableForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Yesterday");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		
		}
	}
	@Then("Verify HA Activity Report Available for Last N Days or Not")
	public void verifyHAActivityReportAvailableForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Last 'N' days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Last 'N' days");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify HA Activity Report Available for This Week or Not")
	public void verifyHAActivityReportAvailableForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for This Week");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
			
		}
	}
	@Then("Verify HA Activity Report Available for Last Week or Not")
	public void verifyHAActivityReportAvailableForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Last Week");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify HA Activity Report Available for Last Seven Days or Not")
	public void verifyHAActivityReportAvailableForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Last 7 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Last 7 Days");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
	
		}
	}
	@Then("Verify HA Activity Report Available for This Month or Not")
	public void verifyHAActivityReportAvailableForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for This Month");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify HA Activity Report Available for Last Month or Not")
	public void verifyHAActivityReportAvailableForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Last Month");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify HA Activity Report Available for Last Thirty Days or Not")
	public void verifyHAActivityReportAvailableForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Last 30 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Last 30 Days");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify HA Activity Report Available for Specific Date or Not")
	public void verifyHAActivityReportAvailableForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Specific Date");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify HA Activity Report Available for Date Range or Not")
	public void verifyHAActivityReportAvailableForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "HA Activity Reports Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "HA Activity Reports Available for Date Range");
			
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
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
//				
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Card_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				String 	Check_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();

				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				

				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();
				
				test.log(LogStatus.INFO, "Card No is : "+Card_No+" Date is : "+Date+" Check No is : "+Check_No+" Activity Type is : "+Activity_Type+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}

	
}
