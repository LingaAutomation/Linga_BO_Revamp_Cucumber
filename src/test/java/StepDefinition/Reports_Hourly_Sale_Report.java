package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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

public class Reports_Hourly_Sale_Report 
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

	@Given("Open the Reports - Hourly Sale Report home page BaseURL and storeID")
	public void openTheReportsHourlySaleReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Hourly Sale page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/hourly");

	}
	@Given("Verifying the Hourly Sale Report Header Page")
	public void verifyingTheHourlySaleReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loaded or not
		repts.Verify_ReportHomePage("HOURLY");
	}
	@Then("Check Date Field in Table is Displayed")
	public void checkDateFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Date_Column_Field, "Date Column Field");
	}
	@Then("Check Grand Sales Field in Table is Displayed")
	public void checkGrandSalesFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Grand_Sales_Column_Field, "Grand Sales Column Field");
	}
	@Then("Check Number Of Customer Field in Table is Displayed")
	public void checkNumberOfCustomerFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.No_Of_Customer_Column_Field, "Number Of Customer Column Field");
	}
	@Then("Verify Hourly Sale Report Availble for Today or Not")
	public void verifyHourlySaleReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Today");
	
			excel.setreportData("Today", 2, 12, st);
			excel.setreportData("Today", 3, 12, st);
			excel.setreportData("Today", 4, 12, st);
			excel.setreportData("Today", 5, 12, st);
			
			excel.setreportData("Today", 2, 13, st);
			excel.setreportData("Today", 3, 13, st);
			excel.setreportData("Today", 4, 13, st);
			excel.setreportData("Today", 5, 13, st);
			
			excel.setreportData("Today", 39, 6, st);
			excel.setreportData("Today", 40, 6, st);
			excel.setreportData("Today", 41, 6, st);
			excel.setreportData("Today", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Today");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
			//Verify Donut Chart screen
			repts.Verify_Donut_Chart_Screen_TopSales();
			
			//Verify Bars Chart Screen
			repts.Verify_Bars_Chart_Screen_TopSales();
			
			//Verify Sales By Hours
			repts.Verify_Sales_byHours_Chart_Screen();
//			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Today", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Today", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Today");
	
			excel.setreport_PassedData("Today", 2, 13, "0.00");
			
			excel.setreport_PassedData("Today", 39, 6, NetSale+"`");

			
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				String diff_value=String.valueOf(diff);
				
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
				

				excel.setreport_FailedData("Today", 2, 13,diff_value);
		
				excel.setreport_FailedData("Today", 39, 6,diff_value);
			}
			
		

			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Today", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Today", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Today");
		
				excel.setreport_PassedData("Today", 3, 13, "0.00");

				excel.setreport_PassedData("Today", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 3, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Today", 3, 13,diff_value);

				excel.setreport_FailedData("Today", 40, 6,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Today", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Today", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Today");
		
			
				excel.setreport_PassedData("Today", 4, 13, "0.00");

				excel.setreport_PassedData("Today", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 4, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Today", 4, 13,diff_value);

				excel.setreport_FailedData("Today", 41, 6,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Today", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Today", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Today");
		
				excel.setreport_PassedData("Today", 5, 13, "0.00");

				excel.setreport_PassedData("Today", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report  for Today.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Today", 5, 13,diff_value);
				excel.setreport_FailedData("Today", 42, 6,diff_value);
			
			}
			
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for Yesterday or Not")
	public void verifyHourlySaleReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Yesterday");
		
			excel.setreportData("Yesterday", 2, 12, st);
			excel.setreportData("Yesterday", 3, 12, st);
			excel.setreportData("Yesterday", 4, 12, st);
			excel.setreportData("Yesterday", 5, 12, st);
			
			excel.setreportData("Yesterday", 2, 13, st);
			excel.setreportData("Yesterday", 3, 13, st);
			excel.setreportData("Yesterday", 4, 13, st);
			excel.setreportData("Yesterday", 5, 13, st);
			
			excel.setreportData("Yesterday", 39, 6, st);
			excel.setreportData("Yesterday", 40, 6, st);
			excel.setreportData("Yesterday", 41, 6, st);
			excel.setreportData("Yesterday", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Yesterday");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
//			//Verify Donut Chart screen
//			repts.Verify_Donut_Chart_Screen_TopSales();
//			
//			//Verify Bars Chart Screen
//			repts.Verify_Bars_Chart_Screen_TopSales();
//			
//			//Verify Sales By Hours
//			repts.Verify_Sales_byHours_Chart_Screen();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Yesterday", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "").replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Yesterday", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Yesterday");
		
			
				excel.setreport_PassedData("Yesterday", 2, 13, "0.00");

				excel.setreport_PassedData("Yesterday", 39, 6, NetSale+"`");
				
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		

				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Yesterday", 2, 13,diff_value);
				excel.setreport_FailedData("Yesterday", 39, 6,diff_value);
			
			}
			
			

			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Yesterday", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Yesterday", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Yesterday");
		
				excel.setreport_PassedData("Yesterday", 3, 13, "0.00");
			
				excel.setreport_PassedData("Yesterday", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Yesterday", 3, 13,diff_value);
				excel.setreport_FailedData("Yesterday", 40, 6,diff_value);

			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Yesterday", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Yesterday", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Yesterday");
		
			
				excel.setreport_PassedData("Yesterday", 4, 13, "0.00");
				excel.setreport_PassedData("Yesterday", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
	
			
				
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Yesterday", 4, 13,diff_value);
				excel.setreport_FailedData("Yesterday", 41, 6,diff_value);

			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Yesterday", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Yesterday", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Yesterday");
		
			
				excel.setreport_PassedData("Yesterday", 5, 13, "0.00");
				excel.setreport_PassedData("Yesterday", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Yesterday", 5, 13,diff_value);
				excel.setreport_FailedData("Yesterday", 42, 6,diff_value);
			
			}
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for Last N Days or Not")
	public void verifyHourlySaleReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Last N days");
		
			excel.setreportData("Last N days", 2, 12, st);
			excel.setreportData("Last N days", 3, 12, st);
			excel.setreportData("Last N days", 4, 12, st);
			excel.setreportData("Last N days", 5, 12, st);
			
			excel.setreportData("Last N days", 2, 13, st);
			excel.setreportData("Last N days", 3, 13, st);
			excel.setreportData("Last N days", 4, 13, st);
			excel.setreportData("Last N days", 5, 13, st);
			
			
			excel.setreportData("Last N days", 39, 6, st);
			excel.setreportData("Last N days", 40, 6, st);
			excel.setreportData("Last N days", 41, 6, st);
			excel.setreportData("Last N days", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Last N days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
//			//Verify Donut Chart screen
//			repts.Verify_Donut_Chart_Screen_TopSales();
//			
//			//Verify Bars Chart Screen
//			repts.Verify_Bars_Chart_Screen_TopSales();
//			
//			//Verify Sales By Hours
//			repts.Verify_Sales_byHours_Chart_Screen();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Last N days", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Last N days", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Last 'N' Days");
		
				excel.setreport_PassedData("Last N days", 2, 13, "0.00");
				
				excel.setreport_PassedData("Last N days", 39, 6, NetSale+"`");
				
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		

				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last N days", 2, 13,diff_value);
				excel.setreport_FailedData("Last N days", 39, 6,diff_value);
			
			}
			
		
			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Last N days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last N days", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Last 'N' Days");
			
			
				excel.setreport_PassedData("Last N days", 3, 13, "0.00");
				excel.setreport_PassedData("Last N days", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last N days", 3, 13,diff_value);
				excel.setreport_FailedData("Last N days", 40, 6,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Last N days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last N days", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Last 'N' Days");
		
				excel.setreport_PassedData("Last N days", 4, 13, "0.00");
				excel.setreport_PassedData("Last N days", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last N days", 4, 13,diff_value);
				excel.setreport_FailedData("Last N days", 41, 6,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last N days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last N days", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Last 'N' Days");
		
			
				excel.setreport_PassedData("Last N days", 5, 13, "0.00");
				excel.setreport_PassedData("Last N days", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last N days", 5, 13,diff_value);
				excel.setreport_FailedData("Last N days", 42, 6,diff_value);
			}
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for This Week or Not")
	public void verifyHourlySaleReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for This Week");
	
		
			excel.setreportData("This Week", 2, 12, st);
			excel.setreportData("This Week", 3, 12, st);
			excel.setreportData("This Week", 4, 12, st);
			excel.setreportData("This Week", 5, 12, st);
			
			excel.setreportData("This Week", 2, 13, st);
			excel.setreportData("This Week", 3, 13, st);
			excel.setreportData("This Week", 4, 13, st);
			excel.setreportData("This Week", 5, 13, st);
			
			excel.setreportData("This Week", 39, 6, st);
			excel.setreportData("This Week", 40, 6, st);
			excel.setreportData("This Week", 41, 6, st);
			excel.setreportData("This Week", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for This Week");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
			//Verify Donut Chart screen
			repts.Verify_Donut_Chart_Screen_TopSales();
			
			//Verify Bars Chart Screen
			repts.Verify_Bars_Chart_Screen_TopSales();
			
			//Verify Sales By Hours
			repts.Verify_Sales_byHours_Chart_Screen();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("This Week", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("This Week", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for This Week");
		
				excel.setreport_PassedData("This Week", 2, 13, "0.00");
				excel.setreport_PassedData("This Week", 39, 6, NetSale+"`");
			
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("This Week", 2, 13,diff_value);
				excel.setreport_FailedData("This Week", 39, 6,diff_value);
			
			}
			
		
			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("This Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("This Week", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for This Week");
		
				excel.setreport_PassedData("This Week", 3, 13, "0.00");
				excel.setreport_PassedData("This Week", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("This Week", 3, 13,diff_value);
				excel.setreport_FailedData("This Week", 40, 6,diff_value);
			
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("This Week", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("This Week", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for This Week");
		
			
				excel.setreport_PassedData("This Week", 4, 13, "0.00");
				excel.setreport_PassedData("This Week", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("This Week", 4, 13,diff_value);
				excel.setreport_FailedData("This Week", 41, 6,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("This Week", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("This Week", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for This Week");
		

				excel.setreport_PassedData("This Week", 5, 13, "0.00");
				excel.setreport_PassedData("This Week", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("This Week", 5, 13,diff_value);
				excel.setreport_FailedData("This Week", 42, 6,diff_value);
			
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for Last Week or Not")
	public void verifyHourlySaleReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Last Week");
		
			
			excel.setreportData("Last Week", 2, 12, st);
			excel.setreportData("Last Week", 3, 12, st);
			excel.setreportData("Last Week", 4, 12, st);
			excel.setreportData("Last Week", 5, 12, st);
			
			excel.setreportData("Last Week", 2, 13, st);
			excel.setreportData("Last Week", 3, 13, st);
			excel.setreportData("Last Week", 4, 13, st);
			excel.setreportData("Last Week", 5, 13, st);
			
			excel.setreportData("Last Week", 39, 6, st);
			excel.setreportData("Last Week", 40, 6, st);
			excel.setreportData("Last Week", 41, 6, st);
			excel.setreportData("Last Week", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Last Week");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
//			//Verify Donut Chart screen
//			repts.Verify_Donut_Chart_Screen_TopSales();
//			
//			//Verify Bars Chart Screen
//			repts.Verify_Bars_Chart_Screen_TopSales();
//			
//			//Verify Sales By Hours
//			repts.Verify_Sales_byHours_Chart_Screen();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Last Week", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Last Week", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Last Week");
		

				excel.setreport_PassedData("Last Week", 2, 13, "0.00");
				excel.setreport_PassedData("Last Week", 39, 6, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
	
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last Week", 2, 13,diff_value);
				excel.setreport_FailedData("Last Week", 39, 6,diff_value);

			}
			
			

			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Last Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last Week", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Last Week");
		

				excel.setreport_PassedData("Last Week", 3, 13, "0.00");
				excel.setreport_PassedData("Last Week", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last Week", 3, 13,diff_value);
				excel.setreport_FailedData("Last Week", 40, 6,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Last Week", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last Week", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Last Week");
			
				excel.setreport_PassedData("Last Week", 4, 13, "0.00");
				excel.setreport_PassedData("Last Week", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last Week", 4, 13,diff_value);
				excel.setreport_FailedData("Last Week", 41, 6,diff_value);
			
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last Week", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last Week", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Last Week");
		
				excel.setreport_PassedData("Last Week", 5, 13, "0.00");
				excel.setreport_PassedData("Last Week", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last Week", 5, 13,diff_value);
				excel.setreport_FailedData("Last Week", 42, 6,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for Last Seven Days or Not")
	public void verifyHourlySaleReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Last 7 days");
	
			excel.setreportData("Last 7 days", 2, 12, st);
			excel.setreportData("Last 7 days", 3, 12, st);
			excel.setreportData("Last 7 days", 4, 12, st);
			excel.setreportData("Last 7 days", 5, 12, st);
			
			excel.setreportData("Last 7 days", 2, 13, st);
			excel.setreportData("Last 7 days", 3, 13, st);
			excel.setreportData("Last 7 days", 4, 13, st);
			excel.setreportData("Last 7 days", 5, 13, st);
			
			excel.setreportData("Last 7 days", 39, 6, st);
			excel.setreportData("Last 7 days", 40, 6, st);
			excel.setreportData("Last 7 days", 41, 6, st);
			excel.setreportData("Last 7 days", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Last 7 days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
			//Verify Donut Chart screen
			repts.Verify_Donut_Chart_Screen_TopSales();
			
			//Verify Bars Chart Screen
			repts.Verify_Bars_Chart_Screen_TopSales();
			
			//Verify Sales By Hours
			repts.Verify_Sales_byHours_Chart_Screen();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Last 7 days", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Last 7 days", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Last 7 days");
		
				excel.setreport_PassedData("Last 7 days", 2, 13, "0.00");
				excel.setreport_PassedData("Last 7 days", 39, 6, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 7 days", 2, 13,diff_value);
				excel.setreport_FailedData("Last 7 days", 39, 6,diff_value);

			}
			
		
			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Last 7 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last 7 days", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Last 7 days");
		
				excel.setreport_PassedData("Last 7 days", 3, 13, "0.00");

				excel.setreport_PassedData("Last 7 days", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 7 days", 3, 13,diff_value);
				excel.setreport_FailedData("Last 7 days", 40, 6,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Last 7 days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last 7 days", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Last 7 days");
		
				excel.setreport_PassedData("Last 7 days", 4, 13, "0.00");
				
				excel.setreport_PassedData("Last 7 days", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 7 days", 4, 13,diff_value);
				
				excel.setreport_FailedData("Last 7 days", 41, 6,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last 7 days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last 7 days", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Last 7 days");
		
				excel.setreport_PassedData("Last 7 days", 5, 13, "0.00");
				excel.setreport_PassedData("Last 7 days", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 7 days", 5, 13,diff_value);
				excel.setreport_FailedData("Last 7 days", 42, 6,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for This Month or Not")
	public void verifyHourlySaleReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for This month");
		
		
			excel.setreportData("This month", 2, 12, st);
			excel.setreportData("This month", 3, 12, st);
			excel.setreportData("This month", 4, 12, st);
			excel.setreportData("This month", 5, 12, st);
			
			excel.setreportData("This month", 2, 13, st);
			excel.setreportData("This month", 3, 13, st);
			excel.setreportData("This month", 4, 13, st);
			excel.setreportData("This month", 5, 13, st);
			
			excel.setreportData("This month", 39, 6, st);
			excel.setreportData("This month", 40, 6, st);
			excel.setreportData("This month", 41, 6, st);
			excel.setreportData("This month", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for This month");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
//			//Verify Donut Chart screen
//			repts.Verify_Donut_Chart_Screen_TopSales();
//			
//			//Verify Bars Chart Screen
//			repts.Verify_Bars_Chart_Screen_TopSales();
//			
//			//Verify Sales By Hours
//			repts.Verify_Sales_byHours_Chart_Screen();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("This month", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("This month", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for This month");
		
				excel.setreport_PassedData("This month", 2, 13, "0.00");
				excel.setreport_PassedData("This month", 39, 6, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("This month", 2, 13,diff_value);
				
				excel.setreport_FailedData("This month", 39, 6,diff_value);
			}
			
		

			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("This month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("This month", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for This month");
		
				excel.setreport_PassedData("This month", 3, 13, "0.00");
				
				excel.setreport_PassedData("This month", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("This month", 3, 13,diff_value);
				excel.setreport_FailedData("This month", 40, 6,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("This month", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("This month", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for This month");
		
				excel.setreport_PassedData("This month", 4, 13, "0.00");
				excel.setreport_PassedData("This month", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("This month", 4, 13,diff_value);
				excel.setreport_FailedData("This month", 41, 6,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("This month", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("This month", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for This month");
		
				excel.setreport_PassedData("This month", 5, 13, "0.00");
				
				excel.setreport_PassedData("This month", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
			
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("This month", 5, 13,diff_value);
				
				excel.setreport_FailedData("This month", 42, 6,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for Last Month or Not")
	public void verifyHourlySaleReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Last month");
	
			excel.setreportData("Last month", 2, 12, st);
			excel.setreportData("Last month", 3, 12, st);
			excel.setreportData("Last month", 4, 12, st);
			excel.setreportData("Last month", 5, 12, st);
			
			excel.setreportData("Last month", 2, 13, st);
			excel.setreportData("Last month", 3, 13, st);
			excel.setreportData("Last month", 4, 13, st);
			excel.setreportData("Last month", 5, 13, st);
			
			excel.setreportData("Last month", 39, 6, st);
			excel.setreportData("Last month", 40, 6, st);
			excel.setreportData("Last month", 41, 6, st);
			excel.setreportData("Last month", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Last month");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
//			//Verify Donut Chart screen
//			repts.Verify_Donut_Chart_Screen_TopSales();
//			
//			//Verify Bars Chart Screen
//			repts.Verify_Bars_Chart_Screen_TopSales();
//			
//			//Verify Sales By Hours
//			repts.Verify_Sales_byHours_Chart_Screen();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Last month", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Last month", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Last month");
		
				excel.setreport_PassedData("Last month", 2, 13, "0.00");
				excel.setreport_PassedData("Last month", 39, 6, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last month", 2, 13,diff_value);
				excel.setreport_FailedData("Last month", 39, 6,diff_value);
			}
			
			

			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Last month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last month", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Last month");
		
				excel.setreport_PassedData("Last month", 3, 13, "0.00");
				
				excel.setreport_PassedData("Last month", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last month", 2, 13,diff_value);
				excel.setreport_FailedData("Last month", 40, 6,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Last month", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last month", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Last month");
		
				excel.setreport_PassedData("Last month", 4, 13, "0.00");
				excel.setreport_PassedData("Last month", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last month", 4, 13,diff_value);
				excel.setreport_FailedData("Last month", 41, 6,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last month", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last month", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Last month");
		
				excel.setreport_PassedData("Last month", 5, 13, "0.00");
				excel.setreport_PassedData("Last month", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last month", 5, 13,diff_value);
				excel.setreport_FailedData("Last month", 42, 6,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for Last Thirty Days or Not")
	public void verifyHourlySaleReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Last 30 days");
		
		
			excel.setreportData("Last 30 days", 2, 12, st);
			excel.setreportData("Last 30 days", 3, 12, st);
			excel.setreportData("Last 30 days", 4, 12, st);
			excel.setreportData("Last 30 days", 5, 12, st);
			
			excel.setreportData("Last 30 days", 2, 13, st);
			excel.setreportData("Last 30 days", 3, 13, st);
			excel.setreportData("Last 30 days", 4, 13, st);
			excel.setreportData("Last 30 days", 5, 13, st);
			
			excel.setreportData("Last 30 days", 39, 6, st);
			excel.setreportData("Last 30 days", 40, 6, st);
			excel.setreportData("Last 30 days", 41, 6, st);
			excel.setreportData("Last 30 days", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Last 30 days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
//			//Verify Donut Chart screen
//			repts.Verify_Donut_Chart_Screen_TopSales();
//			
//			//Verify Bars Chart Screen
//			repts.Verify_Bars_Chart_Screen_TopSales();
//			
//			//Verify Sales By Hours
//			repts.Verify_Sales_byHours_Chart_Screen();
//			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Last 30 days", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Last 30 days", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Last 30 days");
			
				excel.setreport_PassedData("Last 30 days", 2, 13, "0.00");
				excel.setreport_PassedData("Last 30 days", 39, 6, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 30 days", 2, 13,diff_value);
				excel.setreport_FailedData("Last 30 days", 39, 6,diff_value);
			}
			
		

			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Last 30 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last 30 days", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Last 30 days");
			
				excel.setreport_PassedData("Last 30 days", 3, 13, "0.00");
				excel.setreport_PassedData("Last 30 days", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		

				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 30 days", 3, 13,diff_value);
				excel.setreport_FailedData("Last 30 days", 40, 6,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Last 30 days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last 30 days", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Last 30 days");
			
				excel.setreport_PassedData("Last 30 days", 4, 13, "0.00");
				excel.setreport_PassedData("Last 30 days", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		

				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 30 days", 4, 13,diff_value);
				excel.setreport_FailedData("Last 30 days", 41, 6,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last 30 days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last 30 days", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Last 30 days");
		
				excel.setreport_PassedData("Last 30 days", 5, 13, "0.00");
				excel.setreport_PassedData("Last 30 days", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
	

				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
//				excel.setreportData("Today", 5, 13, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 30 days", 5, 13,diff_value);
				excel.setreport_FailedData("Last 30 days", 42, 6,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for Specific Date or Not")
	public void verifyHourlySaleReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Specific Date");
		
			excel.setreportData("Specific Date", 2, 12, st);
			excel.setreportData("Specific Date", 3, 12, st);
			excel.setreportData("Specific Date", 4, 12, st);
			excel.setreportData("Specific Date", 5, 12, st);
			
			excel.setreportData("Specific Date", 2, 13, st);
			excel.setreportData("Specific Date", 3, 13, st);
			excel.setreportData("Specific Date", 4, 13, st);
			excel.setreportData("Specific Date", 5, 13, st);
			
			excel.setreportData("Specific Date", 39, 6, st);
			excel.setreportData("Specific Date", 40, 6, st);
			excel.setreportData("Specific Date", 41, 6, st);
			excel.setreportData("Specific Date", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Specific Date");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
			//Verify Donut Chart screen
//			repts.Verify_Donut_Chart_Screen_TopSales();
//			
//			//Verify Bars Chart Screen
//			repts.Verify_Bars_Chart_Screen_TopSales();
//			
//			//Verify Sales By Hours
//			repts.Verify_Sales_byHours_Chart_Screen();
//			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Specific Date", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Specific Date", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Specific Date");
		
				excel.setreport_PassedData("Specific Date", 2, 13, "0.00");
				excel.setreport_PassedData("Specific Date", 39, 6, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("Specific Date", 2, 13,diff_value);
				excel.setreport_FailedData("Specific Date", 39, 6,diff_value);

			}
			
			

			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Specific Date", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Specific Date", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Specific Date");
		
				excel.setreport_PassedData("Specific Date", 3, 13, "0.00");
				excel.setreport_PassedData("Specific Date", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel

				excel.setreport_FailedData("Specific Date", 3, 13,diff_value);
				excel.setreport_FailedData("Specific Date", 40, 6,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Specific Date", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Specific Date", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Specific Date");
			
				excel.setreport_PassedData("Specific Date", 4, 13, "0.00");
				excel.setreport_PassedData("Specific Date", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel

				excel.setreport_FailedData("Specific Date", 4, 13,diff_value);
				excel.setreport_FailedData("Specific Date", 41, 6,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Specific Date", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Specific Date", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Specific Date");
		
				excel.setreport_PassedData("Specific Date", 5, 13, "0.00");
				excel.setreport_PassedData("Specific Date", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel

				excel.setreport_FailedData("Specific Date", 5, 13,diff_value);
				excel.setreport_FailedData("Specific Date", 42, 6,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Hourly Sale Report Availble for Date Range or Not")
	public void verifyHourlySaleReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Hourly Sale Not Available for Date Range");
		
			excel.setreportData("Date Range", 2, 12, st);
			excel.setreportData("Date Range", 3, 12, st);
			excel.setreportData("Date Range", 4, 12, st);
			excel.setreportData("Date Range", 5, 12, st);

			excel.setreportData("Date Range", 2, 13, st);
			excel.setreportData("Date Range", 3, 13, st);
			excel.setreportData("Date Range", 4, 13, st);
			excel.setreportData("Date Range", 5, 13, st);
			
			excel.setreportData("Date Range", 39, 6, st);
			excel.setreportData("Date Range", 40, 6, st);
			excel.setreportData("Date Range", 41, 6, st);
			excel.setreportData("Date Range", 42, 6, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Hourly Sale Available for Date Range");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);
//			//Verify Donut Chart screen
//			repts.Verify_Donut_Chart_Screen_TopSales();
//			
//			//Verify Bars Chart Screen
//			repts.Verify_Bars_Chart_Screen_TopSales();
//			
//			//Verify Sales By Hours
//			repts.Verify_Sales_byHours_Chart_Screen();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expected_Net_Sale=excel.getData("Date Range", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expected_Net_Sale);
			
			

			Thread.sleep(3000);
			//Get Net Sales
			String NetSale=repts.NetSales_Amount_HourlySaleReport().getText().replace(",", "");
			double ActualNet_Sales=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Date Range", 2, 12, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sales)
			{
				test.log(LogStatus.PASS, "Net Sales for Hourly Sale Report is equal to Sale Recap Report for Date Range");
	
			
				excel.setreport_PassedData("Date Range", 2, 13, "0.00");
				excel.setreport_PassedData("Date Range", 39, 6, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sales;
				test.log(LogStatus.FAIL, "Net Sales for Hourly Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("Date Range", 2, 13,diff_value);
				excel.setreport_FailedData("Date Range", 39, 6,diff_value);

			}
			
			

			//Get the Tax from Sale Recap Report
			String Expected_Tx=excel.getData("Date Range", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expected_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_HourlySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Date Range", 3, 12, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Hourly Sale Report is equal to Sale Recap Report for Date Range");
		
				excel.setreport_PassedData("Date Range", 3, 13, "0.00");
				excel.setreport_PassedData("Date Range", 40, 6, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Hourly Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("Date Range", 3, 13,diff_value);
				excel.setreport_FailedData("Date Range", 40, 6,diff_value);

			}
			
			//Get the Discount from Sale Recap Report
			String Expected_Discnt=excel.getData("Date Range", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expected_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_HourlySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Date Range", 4, 12, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Hourly Sale Report is equal to Sale Recap Report for Date Range");
		
				excel.setreport_PassedData("Date Range", 4, 13, "0.00");
				excel.setreport_PassedData("Date Range", 41, 6, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Hourly Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("Date Range", 4, 13,diff_value);
				excel.setreport_FailedData("Date Range", 41, 6,diff_value);

			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Date Range", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Percentage of Sale
			String GrandSale=repts.GrandSales_HourlySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Date Range", 5, 12, GrandSale);

			
			//Check whether the Grand Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand Sales for Hourly Sale Report is equal to Sale Recap Report for Date Range");
		
				excel.setreport_PassedData("Date Range", 5, 13, "0.00");
				excel.setreport_PassedData("Date Range", 42, 6, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand Sales for Hourly Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			
			
				String diff_value=String.valueOf(diff);

				//Export the Net Sales value to Excel
				excel.setreport_FailedData("Date Range", 5, 13,diff_value);
				excel.setreport_FailedData("Date Range", 42, 6,diff_value);


			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}

}
