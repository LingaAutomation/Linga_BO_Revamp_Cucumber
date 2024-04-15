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

import Utility.ExcelDataConfig;
import Utility.Utility;
import io.cucumber.java.en.*;

public class Reports_Driver_Report 
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
	
	public static String DriverName;
	
	@Given("Open the Reports - Driver Report home page BaseURL and storeID")
	public void openTheReportsDriverReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Daily page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"driverReport");

	}
	@Given("Verifying the Driver Report Header Page")
	public void verifyingTheDriverReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loeded or not
		cmp.VerifyMainScreenPageHeader("Driver");
	}
	@Then("Check Driver Field is Displayed")
	public void checkDriverFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Driver_InputBx, "Driver Field");
	}
	@Then("Check Time Field in Table is Displayed")
	public void checkTimeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Time_Column_Field, "Time Column Field");
	}
	@Then("Check Check Field in Table is Displayed")
	public void checkCheckFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Check_Column_Field, "Check Column Field");
	}
	@Then("Check Owed Field in Table is Displayed")
	public void checkOwedFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Owed_Column_Field, "Owed Column Field");
	}
	@Then("Check Delivery Charge Cost Field in Table is Displayed")
	public void checkDeliveryChargeCostFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Delivery_Charge_Cost_Column_Field, "Delivery Charge Cost Column Field");
	}
	@Then("Check Driver Tip Field in Table is Displayed")
	public void checkDriverTipFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Driver_Tip_Column_Field, "Driver Tip Column Field");
	}
	@Given("I Select the Driver")
	public void iSelectTheDriver() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		repts.Driver_InputBx.click();
		
//		String Driver_Name=driver.findElement(By.xpath("//select-option[2]")).getText();
		
		cmp.Click_DropDown_withSearch(repts.Driver_InputBx, "Driver Selected");
		
		String Driver_Name=repts.Driver_InputBx.getAttribute("value");
		
		
		this.DriverName=Driver_Name;
		
//		repts.Driver_InputBx.click();
		
		//Select Employee 
//		repts.Select_Driver(Driver_Name);
		
		
	}
	@Then("Verify Driver Report Availble for Selected Driver or Not")
	public void verifyDriverReportAvailbleForSelectedDriverOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText().equalsIgnoreCase(DriverName))
		{
			test.log(LogStatus.PASS, "Driver Reports is Available for Searched Driver Number");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Driver Reports is Not Available for Searched Driver Number");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Driver as All")
	public void iSelectTheDriverAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Driver_InputBx, "All", "Driver selected as All");
	}
	@Then("Verify Driver Report Availble for Today or Not")
	public void verifyDriverReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Today");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
				if(diff==0)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				
				excel.setreport_PassedData("Today", i, 4, Diff);
				}
				else
				{
					
					excel.setreport_FailedData("Today", i, 4, Diff);

					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
			
				excel.setreportData("Today", i, 0, DriverName);
				excel.setreportData("Today", i, 1, Check_No);
				excel.setreportData("Today", i, 2, ActualAmount);
				excel.setreportData("Today", i, 3, ExpectedAmount);
				excel.setreportData("Today", i, 5, Delivery_Charge);
				excel.setreportData("Today", i, 6, Driver_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
			
			
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
			
		}
	}
	@Then("Verify Driver Report Availble for Yesterday or Not")
	public void verifyDriverReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Yesterday");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
		
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
		
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}	
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
			
			
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
	
			
		}
	}
	@Then("Verify Driver Report Availble for Last N Days or Not")
	public void verifyDriverReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Last 'N' days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Last 'N' days");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
			
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
			
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
			
			
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
			
		}
	}
	@Then("Verify Driver Report Availble for This Week or Not")
	public void verifyDriverReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));

		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for This Week");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}		
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
		
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
			
			
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
			
		}
	}
	@Then("Verify Driver Report Availble for Last Week or Not")
	public void verifyDriverReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));

		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Last Week");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
		
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		}
	}
	@Then("Verify Driver Report Availble for Last Seven Days or Not")
	public void verifyDriverReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));

		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Last 7 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Last 7 Days");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
			
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		}
	}
	@Then("Verify Driver Report Availble for This Month or Not")
	public void verifyDriverReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));

		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for This Month");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		}
	}
	@Then("Verify Driver Report Availble for Last Month or Not")
	public void verifyDriverReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));


		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Last Month");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
			}
		}
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		}
	}
	@Then("Verify Driver Report Availble for Last Thirty Days or Not")
	public void verifyDriverReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));

		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Last 30 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Last 30 Days");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
			}
		}
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		}
	}
	@Then("Verify Driver Report Availble for Specific Date or Not")
	public void verifyDriverReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));

		
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Specific Date");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
				
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		}
	}
	@Then("Verify Driver Report Availble for Date Range or Not")
	public void verifyDriverReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));

		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Driver Reports Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Driver Reports Available for Date Range");
			
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
			
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
			
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				//Enter Email Address
				repts.Enter_EmailAddress_DriverReport("abcd");
				
				//Verify Email Id error message
				repts.Verify_Valid_EmailID_ErrorMessage();
				
				
				//Enter Email Address
				repts.Enter_EmailAddress_DriverReport(Utility.getProperty("userName"));
				
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
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
				String DriverName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
			
				
				String Owed=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Delivery_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();

				String Driver_Tip=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

				test.log(LogStatus.INFO, "Driver Name is : "+DriverName+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Owed is : "+Owed+ "Delivery Charge Cost is : "+Delivery_Charge+" Driver Tip is : "+Driver_Tip);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				
				
				if(ActualTotal==ExpectedTotal)
				{
					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
				}
				else
				{
					double diff=ActualTotal-ExpectedTotal;
					
					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
				}
				
				//Enter Email Address
				repts.Enter_EmailAddress_DriverReport("abcd");
				
				//Verify Email Id error message
				repts.Verify_Valid_EmailID_ErrorMessage();
				
				
				//Enter Email Address
				repts.Enter_EmailAddress_DriverReport(Utility.getProperty("userName"));
				
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
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Driver_Report"));
	
		}
	}
}
