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

public class Reports_Void_Employee_Report 
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
	
	@Given("Open the Reports - Void Employee home page BaseURL and storeID")
	public void openTheReportsVoidEmployeeHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(5000);
		//Load the Daily page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"voidReport/employee");

	}
	@Given("Verifying the Void Employee Header Page")
	public void verifyingTheVoidEmployeeHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loaded or not
		repts.Verify_ReportHomePage("EMPLOYEE");
	}
	@Then("Check Void Reason Field in Table is Displayed")
	public void checkVoidReasonFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Void_Reason_Column_Field, "Void Reason Column Field");

	}
	@Then("Check Open By Field in Table is Displayed")
	public void checkOpenByFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Open_By_Column_Field, "Open By Column Field");

	}
	@Then("Check Void By Field in Table is Displayed")
	public void checkVoidByFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Void_By_Column_Field, "Void By Column Field");

	}
	@Then("Verify Void Employee Report Available for Selected Employee or Not")
	public void verifyVoidEmployeeReportAvailableForSelectedEmployeeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Void - Employees is Available for Searched Employee");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Void - Employees is Not Available for Searched Employee");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
	}
	@Then("Verify Void Employee Report Available for Today or Not")
	public void verifyVoidEmployeeReportAvailableForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Today");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
			
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
					
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
	
		}
	}
	@Then("Verify Void Employee Report Available for Yesterday or Not")
	public void verifyVoidEmployeeReportAvailableForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Yesterday");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
		
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
		
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				//Check.click();
				
				
			}
		}
			
			

			
		}
	}
	@Then("Verify Void Employee Report Available for Last N Days or Not")
	public void verifyVoidEmployeeReportAvailableForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Last 'N' days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Last 'N' days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
			
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
			
		}
	}
	@Then("Verify Void Employee Report Available for This Week or Not")
	public void verifyVoidEmployeeReportAvailableForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for This Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
			
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
		
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		
		}
	}
	@Then("Verify Void Employee Report Available for Last Week or Not")
	public void verifyVoidEmployeeReportAvailableForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Last Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
		
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
			
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		

	
		}
	}
	@Then("Verify Void Employee Report Available for Last Seven Days or Not")
	public void verifyVoidEmployeeReportAvailableForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Last 7 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Last 7 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
			
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
			
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		

	
		}
	}
	@Then("Verify Void Employee Report Available for This Month or Not")
	public void verifyVoidEmployeeReportAvailableForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for This Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
			
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
			
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		

	
		}
	}
	@Then("Verify Void Employee Report Available for Last Month or Not")
	public void verifyVoidEmployeeReportAvailableForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Last Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
				
			}
		}
	
		}
	}
	@Then("Verify Void Employee Report Available for Last Thirty Days or Not")
	public void verifyVoidEmployeeReportAvailableForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Last 30 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Last 30 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}

		}
	}
	@Then("Verify Void Employee Report Available for Specific Date or Not")
	public void verifyVoidEmployeeReportAvailableForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Specific Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				
				
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				
			}
		}
	
		}
	}
	@Then("Verify Void Employee Report Available for Date Range or Not")
	public void verifyVoidEmployeeReportAvailableForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Employees Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Employees Available for Date Range");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				Check.click();
				
			
				//Enter Email Address
				repts.Enter_EmailAddress_DriverReport("abcd");
				
				//Verify Email Id error message
				repts.Verify_Valid_EmailID_ErrorMessage();
				
				Thread.sleep(1000);
				//Enter Email Address
				repts.Enter_EmailAddress_DriverReport(Utility.getProperty("userName"));
				
				Thread.sleep(1000);
				//Click the Send Receipt button
				repts.Click_Send_Receipt_Button();
				
				cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 30);
				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Email receipt sent successfully"))
				{
					test.log(LogStatus.PASS, "Email receipt sent successfully");
					ut.PassedCaptureScreenshotAsBASE64();
				}
				else
				{
					test.log(LogStatus.FAIL, "Email receipt sent Failed");
					ut.FailedCaptureScreenshotAsBASE64();
				}
				
				Thread.sleep(2000);
				driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
				
				Thread.sleep(2000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
				
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();

				test.log(LogStatus.INFO, "Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
				
				Check.click();
				
				Thread.sleep(1000);
				//Enter Email Address
				repts.Enter_EmailAddress_DriverReport("abcd");
				
				//Verify Email Id error message
				repts.Verify_Valid_EmailID_ErrorMessage();
				
				Thread.sleep(1000);
				//Enter Email Address
				repts.Enter_EmailAddress_DriverReport(Utility.getProperty("userName"));
				
				Thread.sleep(1000);
				//Click the Send Receipt button
				repts.Click_Send_Receipt_Button();
				
				cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 30);
				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Email receipt sent successfully"))
				{
					test.log(LogStatus.PASS, "Email receipt sent successfully");
					ut.PassedCaptureScreenshotAsBASE64();
				}
				else
				{
					test.log(LogStatus.FAIL, "Email receipt sent Failed");
					ut.FailedCaptureScreenshotAsBASE64();
				}
				
				Thread.sleep(2000);
				driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
				
				Thread.sleep(2000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}

		}
	}

}
