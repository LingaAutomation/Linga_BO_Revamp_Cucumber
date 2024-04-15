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

public class Reports_GiveX_Report 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	Utility ut = new Utility();
	
	@Given("Open the Reports - GiveX Report home page BaseURL and storeID")
	public void OpenGiveXHomePage() throws Exception 
	{
		Thread.sleep(5000);
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"giftCardReport/giveX");
	}
	
	@Given("Verifying the GiveX Report Header Page")
	public void verifyingTheGiveXReportHeaderPage() throws Exception 
	{
		Thread.sleep(5000);
		repts.Verify_ReportHomePage("GIVE X");
	}
	

	@Then("Check GiveX Number Input Field is Displayed")
	public void checkGiveXNumberInputFieldIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.GiveX_NumberInputBx,"GiveX Number Input Field");
	}
	@Then("Check GiveX Number Field in Table is Displayed")
	public void checkGiveXNumberFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.GiveX_Number_Column_Field,"GiveX Number Column Field");
	}
//	@Then("Check Check Number Field in Table is Displayed")
//	public void checkCheckNumberFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Check_Number_Column_Field,"Check Number Column Field");
//	}
	@Then("Check ActivityType Field in Table is Displayed")
	public void checkActivityTypeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Activity_Type_Column_Field,"Activity Type Column Field");
	}

	@Given("Enter GiveX Number")
	public void enterGiveXNumber() throws Exception 
	{
		//Enter GiveX Number
		repts.Enter_GiveX_Number("");
		
	}
	@Then("Verify GiveX Report Available for Today or Not")
	public void verifyGiveXReportAvailableForTodayOrNot() throws Exception
	{
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Today");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
		
	}

	@Then("Verify GiveX Report Available for Yesterday or Not")
	public void verifyGiveXReportAvailableForYesterdayOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Yesterday");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}

	@Then("Verify GiveX Report Available for Last N Days or Not")
	public void verifyGiveXReportAvailableForLastNDaysOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Last N Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Last N Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}

	@Then("Verify GiveX Report Available for This Week or Not")
	public void verifyGiveXReportAvailableForThisWeekOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for This Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}

	@Then("Verify GiveX Report Available for Last Week or Not")
	public void verifyGiveXReportAvailableForLastWeekOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Last Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}

	@Then("Verify GiveX Report Available for Last Seven Days or Not")
	public void verifyGiveXReportAvailableForLastSevenDaysOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Last Seven Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Last Seven Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}

	@Then("Verify GiveX Report Available for This Month or Not")
	public void verifyGiveXReportAvailableForThisMonthOrNot() throws Exception
	{
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for This Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}

	@Then("Verify GiveX Report Available for Last Month or Not")
	public void verifyGiveXReportAvailableForLastMonthOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Last Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}
	
	@Then("Verify GiveX Report Available for Last Thirty Days or Not")
	public void verifyGiveXReportAvailableForLastThirtyDaysOrNot() throws Exception {
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Last Thirty Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Last Thirty Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}

	@Then("Verify GiveX Report Available for Specific Date or Not")
	public void verifyGiveXReportAvailableForSpecificDateOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Specific Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}

	@Then("Verify GiveX Report Available for Date Range or Not")
	public void verifyGiveXReportAvailableForDateRangeOrNot() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "GiveX Reports Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "GiveX Reports Available for Date Range");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "GiveX No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		}
	}


}
