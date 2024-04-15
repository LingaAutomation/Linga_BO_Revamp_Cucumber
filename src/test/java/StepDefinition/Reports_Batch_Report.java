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

import Utility.ExcelDataConfig;
import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Reports_Batch_Report 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	Utility ut = new Utility();
	
	@Given("Open the Reports - Batch Report home page BaseURL and storeID")
	public void OpenBatchReportHomePage() throws Exception
	{
		Thread.sleep(5000);
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"batchReport");
	}

	@Given("Verifying the Batch Report Header Page")
	public void verifyingTheBatchReportHeaderPage() throws Exception 
	{
		Thread.sleep(5000);
		cmp.VerifyMainScreenPageHeader("Batch");
	}

	@Then("Check Select Node Field is Displayed")
	public void checkSelectNodeFieldIsDisplayed() throws Exception 
	{
	  cmp.Check_Element_or_Text_Displayed(repts.Node_InputBx,"Select Node Field");
	}
	@Then("Check Select Batch Type Field is Displayed")
	public void checkSelectBatchTypeFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Batch_Type_InputBx,"Select Batch Type Field");
	}
	@Then("Check Select Date Type Field is Displayed")
	public void checkSelectDateTypeFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Date_Type_InputBx,"Select Date Type Field");
	}
//	@Then("Check Check Field in Table is Displayed")
//	public void checkCheckFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Check_Column_Field,"Check Column Field");
//	}
	@Then("Verify Card Number Field in Table is Dispalyed")
	public void verifyCardNumberFieldInTableIsDispalyed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Card_Number_Column_Field,"Card Number Column Field");
	}
	@Then("Check Transaction Field in Table is Displayed")
	public void checkTransactionFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Transaction_Column_Field,"Transaction Column Field");
	}
	@Then("Check Tip Amount Field in Table is Displayed")
	public void checkTipAmountFieldInTableIsDisplayed() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(repts.TipColumn,"Tip Column Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Then("Check Batch Settled Field in Table is Displayed")
	public void checkBatchSettledFieldInTableIsDisplayed() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(repts.Batch_Settle_Date_Column_Field,"Batch Settled Date Column Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Check Server Name Field in Table is Displayed")
	public void checkServerNameFieldInTableIsDisplayed() throws Exception
	{
		try {
		cmp.Check_Element_or_Text_Displayed(repts.Server_Name_Column_Field,"Server Name Column Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Check POS Node Field in Table is Displayed")
	public void checkPOSNodeFieldInTableIsDisplayed() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(repts.POS_Node_Column_Field,"POS Node Column Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
//	@Then("Check Type Field in Table is Displayed")
//	public void checkTypeFieldInTableIsDisplayed() throws Exception 
//	{
//		try {
//		cmp.Check_Element_or_Text_Displayed(repts.Type_Column_Field,"Type Column Field");
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//	}

	@Given("I Select the Node as All")
	public void iSelectTheNodeAsAll() throws Exception 
	{
		//Select the Node
	    repts.Select_Node("Select All");
	}
	@Given("I Select Batch Type as All")
	public void iSelectBatchTypeAsAll() throws Exception 
	{
		Thread.sleep(1000);
		//Select the Batch Type
		repts.Select_Batch_Type("All");
	}
	@Given("I Select Date Type as Business Date")
	public void iSelectDateTypeAsBusinessDate() throws Exception 
	{
		Thread.sleep(1000);	
		//Select Business Type
		repts.Select_Date_Type("Business Date");
	}
	@Then("Verify Batch Report Available for Today or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForTodayOrNotWithDateTypeAsBusinessDate() throws Exception
	{
		
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Today for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Today for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}
	
	@Then("Verify Batch Report Available for Yesterday or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForYesterdayOrNotWithDateTypeAsBusinessDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Yesterday for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Yesterday for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last N Days or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForLastNDaysOrNotWithDateTypeAsBusinessDate() throws Exception
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last N Days for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last N Days for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				try {
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
			
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}
	
	@Then("Verify Batch Report Available for This Week or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForThisWeekOrNotWithDateTypeAsBusinessDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for This Week for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for This Week for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last Week or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForLastWeekOrNotWithDateTypeAsBusinessDate() throws Exception
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last Week for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last Week for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}
	
	@Then("Verify Batch Report Available for Last Seven Days or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForLastSevenDaysOrNotWithDateTypeAsBusinessDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last Seven Days for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last Seven Days for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for This Month or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForThisMonthOrNotWithDateTypeAsBusinessDate() throws Exception
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for This Month for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for This Month for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last Month or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForLastMonthOrNotWithDateTypeAsBusinessDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last Month for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last Month for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last Thirty Days or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForLastThirtyDaysOrNotWithDateTypeAsBusinessDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last 30 Days for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last 30 Days for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}
	
	@Then("Verify Batch Report Available for Specific Date or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForSpecificDateOrNotWithDateTypeAsBusinessDate() throws Exception
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Specific Date for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Specific Date for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}
	
	@Then("Verify Batch Report Available for Date Range or Not with DateType as BusinessDate")
	public void verifyBatchReportAvailableForDateRangeOrNotWithDateTypeAsBusinessDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Date Range for Date Type as Business Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Date Range for Date Type as Business Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Given("I Select Date Type as Batch Settled Date")
	public void iSelectDateTypeAsBatchSettledDate() throws Exception 
	{
		Thread.sleep(1000);	
		//Select Business Type
		repts.Select_Date_Type("Batch Settled Date");
	}
	@Then("Verify Batch Report Available for Today or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForTodayOrNotWithDateTypeAsBatchSettledDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Today for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Today for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Yesterday or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForYesterdayOrNotWithDateTypeAsBatchSettledDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Yesterday for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Yesterday for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last N Days or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForLastNDaysOrNotWithDateTypeAsBatchSettledDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last N Days for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last N Days for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for This Week or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForThisWeekOrNotWithDateTypeAsBatchSettledDate() throws Exception {
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for This Week for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for This Week for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last Week or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForLastWeekOrNotWithDateTypeAsBatchSettledDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last Week for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last Week for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last Seven Days or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForLastSevenDaysOrNotWithDateTypeAsBatchSettledDate() throws Exception
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last Seven Days for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last Seven Days for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for This Month or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForThisMonthOrNotWithDateTypeAsBatchSettledDate() throws Exception
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for This Month for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for This Month for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last Month or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForLastMonthOrNotWithDateTypeAsBatchSettledDate() throws Exception
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last Month for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last Month for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Last Thirty Days or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForLastThirtyDaysOrNotWithDateTypeAsBatchSettledDate() throws Exception 
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Last 30 Days for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Last 30 Days for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}

	@Then("Verify Batch Report Available for Specific Date or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForSpecificDateOrNotWithDateTypeAsBatchSettledDate() throws Exception {
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Date Range for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Date Range for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}
	
	@Then("Verify Batch Report Available for Date Range or Not with DateType as BatchSettledDate")
	public void verifyBatchReportAvailableForDateRangeOrNotWithDateTypeAsBatchSettledDate() throws Exception
	{
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Batch Reports Not Available for Date Range for Date Type as Batch Settled Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Batch Reports Available for Date Range for Date Type as Batch Settled Date");
			
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
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
				
			
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
				Check.click();
				
				String SubTot=repts.SubTotal_DriverReport();
				double SubTotal=Double.parseDouble(SubTot);
				
				String TaxTot=repts.TaxTotal_DriverReport();
				double TaxTotal=Double.parseDouble(TaxTot);
				
				double ExpectedTotal=SubTotal+TaxTotal;
				String ExpectedAmount=String.valueOf(ExpectedTotal);
				
				double diff=ActualTotal-ExpectedTotal;
				String Diff=String.valueOf(diff);
				
//				if(diff==0)
//				{
//					test.log(LogStatus.PASS, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount);
//				
//				excel.setreport_PassedData("Today", i, 4, Diff);
//				}
//				else
//				{
//					
//					excel.setreport_FailedData("Today", i, 4, Diff);
//
//					test.log(LogStatus.FAIL, "Expected and ActualAmount is Correct for the Check Number : "+Check_No+" ActualAmount is : "+ActualAmount+" Differenc is : "+diff);
//				}
			
//				excel.setreportData("Today", i, 0, DriverName);
//				excel.setreportData("Today", i, 1, Check_No);
//				excel.setreportData("Today", i, 2, ActualAmount);
//				excel.setreportData("Today", i, 3, ExpectedAmount);
//				excel.setreportData("Today", i, 5, Delivery_Charge);
//				excel.setreportData("Today", i, 6, Batch_Tip);

				
				
				
				Thread.sleep(1000);
				//Click the Back button
				repts.Click_Back_Button();
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//a"));
				
				String Check_No=Check.getText();
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				double ActualTotal=Double.parseDouble(ActualAmount);
	
				
				String BatchType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();
				
				String Service_Charge=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();

				String Tip_Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_date+" Check No is: "+Check_No+" Amount is : "+ActualAmount+" Batch Type is : "+BatchType+ "Service Charge Cost is : "+Service_Charge+" Tip Amount is : "+Tip_Amount);
				
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
//		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Batch_Report"));
	
			
		}
	}



















}
