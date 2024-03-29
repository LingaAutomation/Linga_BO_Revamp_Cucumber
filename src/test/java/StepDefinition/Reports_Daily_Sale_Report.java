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

public class Reports_Daily_Sale_Report 
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

	@Given("Open the Reports - Daily Sale Report home page BaseURL and storeID")
	public void openTheReportsDailySaleReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Daily page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/dailySale");
	}
	@Given("Verifying the Daily Sale Report Header Page")
	public void verifyingTheDailySaleReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loeded or not
		repts.Verify_ReportHomePage("DAILY");
	}
	@Then("Check Grand Sale Field in Table is Displayed")
	public void checkGrandSaleFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Grand_Sale_Column_Field, "Grand Sale Column Field");
	}
	@Then("Verify Daily Sale Report Availble for Today or Not")
	public void verifyDailySaleReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Today");
	
			excel.setreportData("Today", 2, 14, st);
			excel.setreportData("Today", 3, 14, st);
			excel.setreportData("Today", 4, 14, st);
			excel.setreportData("Today", 5, 14, st);
			
			
			excel.setreportData("Today", 2, 15, st);
			excel.setreportData("Today", 3, 15, st);
			excel.setreportData("Today", 4, 15, st);
			excel.setreportData("Today", 5, 15, st);
			
			excel.setreportData("Today", 39, 7, st);
			excel.setreportData("Today", 40, 7, st);
			excel.setreportData("Today", 41, 7, st);
			excel.setreportData("Today", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Today");
			
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
			String Expeccted_SaleAmt=excel.getData("Today", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Today", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Today");
	
			excel.setreport_PassedData("Today", 2, 15, "0.00");
			
			excel.setreport_PassedData("Today", 39, 7, SaleAmount+"`");

			
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				String diff_value=String.valueOf(diff);
				
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
				

				excel.setreport_FailedData("Today", 2, 15,diff_value);
		
				excel.setreport_FailedData("Today", 39, 7,diff_value);
			}
			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Today", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Today", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Today");
		
				excel.setreport_PassedData("Today", 3, 15, "0.00");

				excel.setreport_PassedData("Today", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 3, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Today", 3, 15,diff_value);

				excel.setreport_FailedData("Today", 40, 7,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Today", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Today", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Today");
		
			
				excel.setreport_PassedData("Today", 4, 15, "0.00");

				excel.setreport_PassedData("Today", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 4, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Today", 4, 15,diff_value);

				excel.setreport_FailedData("Today", 41, 7,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Today", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Today", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Today");
		
				excel.setreport_PassedData("Today", 5, 15, "0.00");

				excel.setreport_PassedData("Today", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report  for Today.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Today", 5, 15,diff_value);
				excel.setreport_FailedData("Today", 42, 7,diff_value);
			
			}
			
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}

	}
	@Then("Verify Daily Sale Report Availble for Yesterday or Not")
	public void verifyDailySaleReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Yesterday");
		
			excel.setreportData("Yesterday", 2, 14, st);
			excel.setreportData("Yesterday", 3, 14, st);
			excel.setreportData("Yesterday", 4, 14, st);
			excel.setreportData("Yesterday", 5, 14, st);
			
			excel.setreportData("Yesterday", 2, 15, st);
			excel.setreportData("Yesterday", 3, 15, st);
			excel.setreportData("Yesterday", 4, 15, st);
			excel.setreportData("Yesterday", 5, 15, st);
			
			excel.setreportData("Yesterday", 39, 7, st);
			excel.setreportData("Yesterday", 40, 7, st);
			excel.setreportData("Yesterday", 41, 7, st);
			excel.setreportData("Yesterday", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Yesterday");
			
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
			String Expeccted_SaleAmt=excel.getData("Yesterday", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "").replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Yesterday", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Yesterday");
		
			
				excel.setreport_PassedData("Yesterday", 2, 15, "0.00");

				excel.setreport_PassedData("Yesterday", 39, 7, SaleAmount+"`");
				
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		

				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Yesterday", 2, 15,diff_value);
				excel.setreport_FailedData("Yesterday", 39, 7,diff_value);
			
			}
			
			

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Yesterday", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Yesterday", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Yesterday");
		
				excel.setreport_PassedData("Yesterday", 3, 15, "0.00");
			
				excel.setreport_PassedData("Yesterday", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Yesterday", 3, 15,diff_value);
				excel.setreport_FailedData("Yesterday", 40, 7,diff_value);

			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Yesterday", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Yesterday", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Yesterday");
		
			
				excel.setreport_PassedData("Yesterday", 4, 15, "0.00");
				excel.setreport_PassedData("Yesterday", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
	
			
				
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Yesterday", 4, 15,diff_value);
				excel.setreport_FailedData("Yesterday", 41, 7,diff_value);

			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Yesterday", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Yesterday", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Yesterday");
		
			
				excel.setreport_PassedData("Yesterday", 5, 15, "0.00");
				excel.setreport_PassedData("Yesterday", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Yesterday", 5, 15,diff_value);
				excel.setreport_FailedData("Yesterday", 42, 7,diff_value);
			
			}
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for Last N Days or Not")
	public void verifyDailySaleReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Last N days");
		
			excel.setreportData("Last N days", 2, 14, st);			
			excel.setreportData("Last N days", 3, 14, st);
			excel.setreportData("Last N days", 4, 14, st);
			excel.setreportData("Last N days", 5, 14, st);
			
			excel.setreportData("Last N days", 2, 15, st);
			excel.setreportData("Last N days", 3, 15, st);
			excel.setreportData("Last N days", 4, 15, st);
			excel.setreportData("Last N days", 5, 15, st);
			
			
			excel.setreportData("Last N days", 39, 7, st);
			excel.setreportData("Last N days", 40, 7, st);
			excel.setreportData("Last N days", 41, 7, st);
			excel.setreportData("Last N days", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Last N days");
			
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
			String Expeccted_SaleAmt=excel.getData("Last N days", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Last N days", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Last 'N' Days");
		
				excel.setreport_PassedData("Last N days", 2, 15, "0.00");
				
				excel.setreport_PassedData("Last N days", 39, 7, SaleAmount+"`");
				
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		

				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last N days", 2, 15,diff_value);
				excel.setreport_FailedData("Last N days", 39, 7,diff_value);
			
			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last N days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last N days", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Last 'N' Days");
			
			
				excel.setreport_PassedData("Last N days", 3, 15, "0.00");
				excel.setreport_PassedData("Last N days", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last N days", 3, 15,diff_value);
				excel.setreport_FailedData("Last N days", 40, 7,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last N days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last N days", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Last 'N' Days");
		
				excel.setreport_PassedData("Last N days", 4, 15, "0.00");
				excel.setreport_PassedData("Last N days", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last N days", 4, 15,diff_value);
				excel.setreport_FailedData("Last N days", 41, 7,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last N days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Last N days", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Last 'N' Days");
		
			
				excel.setreport_PassedData("Last N days", 5, 15, "0.00");
				excel.setreport_PassedData("Last N days", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last N days", 5, 15,diff_value);
				excel.setreport_FailedData("Last N days", 42, 7,diff_value);
			}
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for This Week or Not")
	public void verifyDailySaleReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for This Week");
	
		
			excel.setreportData("This Week", 2, 14, st);
			excel.setreportData("This Week", 3, 14, st);
			excel.setreportData("This Week", 4, 14, st);
			excel.setreportData("This Week", 5, 14, st);
			
			excel.setreportData("This Week", 2, 15, st);
			excel.setreportData("This Week", 3, 15, st);
			excel.setreportData("This Week", 4, 15, st);
			excel.setreportData("This Week", 5, 15, st);
			
			
			excel.setreportData("This Week", 39, 7, st);
			excel.setreportData("This Week", 40, 7, st);
			excel.setreportData("This Week", 41, 7, st);
			excel.setreportData("This Week", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for This Week");
			
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
			String Expeccted_SaleAmt=excel.getData("This Week", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("This Week", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for This Week");
		
				excel.setreport_PassedData("This Week", 2, 15, "0.00");
				excel.setreport_PassedData("This Week", 39, 7, SaleAmount+"`");
			
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("This Week", 2, 15,diff_value);
				excel.setreport_FailedData("This Week", 39, 7,diff_value);
			
			}
			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("This Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("This Week", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for This Week");
		
				excel.setreport_PassedData("This Week", 3, 15, "0.00");
				excel.setreport_PassedData("This Week", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("This Week", 3, 15,diff_value);
				excel.setreport_FailedData("This Week", 40, 7,diff_value);
			
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("This Week", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("This Week", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for This Week");
		
			
				excel.setreport_PassedData("This Week", 4, 15, "0.00");
				excel.setreport_PassedData("This Week", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("This Week", 4, 15,diff_value);
				excel.setreport_FailedData("This Week", 41, 7,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("This Week", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("This Week", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for This Week");
		

				excel.setreport_PassedData("This Week", 5, 15, "0.00");
				excel.setreport_PassedData("This Week", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("This Week", 5, 15,diff_value);
				excel.setreport_FailedData("This Week", 42, 7,diff_value);
			
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for Last Week or Not")
	public void verifyDailySaleReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Last Week");
		
			
			excel.setreportData("Last Week", 2, 14, st);
			excel.setreportData("Last Week", 3, 14, st);
			excel.setreportData("Last Week", 4, 14, st);
			excel.setreportData("Last Week", 5, 14, st);
			
			excel.setreportData("Last Week", 2, 15, st);
			excel.setreportData("Last Week", 3, 15, st);
			excel.setreportData("Last Week", 4, 15, st);
			excel.setreportData("Last Week", 5, 15, st);
			
			
			excel.setreportData("Last Week", 39, 7, st);
			excel.setreportData("Last Week", 40, 7, st);
			excel.setreportData("Last Week", 41, 7, st);
			excel.setreportData("Last Week", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Last Week");
			
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
			String Expeccted_SaleAmt=excel.getData("Last Week", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Last Week", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Last Week");
		

				excel.setreport_PassedData("Last Week", 2, 15, "0.00");
				excel.setreport_PassedData("Last Week", 39, 7, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
	
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last Week", 2, 15,diff_value);
				excel.setreport_FailedData("Last Week", 39, 7,diff_value);

			}
			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last Week", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Last Week");
		

				excel.setreport_PassedData("Last Week", 3, 15, "0.00");
				excel.setreport_PassedData("Last Week", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last Week", 3, 15,diff_value);
				excel.setreport_FailedData("Last Week", 40, 7,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last Week", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last Week", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Last Week");
			
				excel.setreport_PassedData("Last Week", 4, 15, "0.00");
				excel.setreport_PassedData("Last Week", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last Week", 4, 15,diff_value);
				excel.setreport_FailedData("Last Week", 41, 7,diff_value);
			
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last Week", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Last Week", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Last Week");
		
				excel.setreport_PassedData("Last Week", 5, 15, "0.00");
				excel.setreport_PassedData("Last Week", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last Week", 5, 15,diff_value);
				excel.setreport_FailedData("Last Week", 42, 7,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for Last Seven Days or Not")
	public void verifyDailySaleReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Last 7 days");
	
			excel.setreportData("Last 7 days", 2, 14, st);
			excel.setreportData("Last 7 days", 3, 14, st);
			excel.setreportData("Last 7 days", 4, 14, st);
			excel.setreportData("Last 7 days", 5, 14, st);
			
			excel.setreportData("Last 7 days", 2, 15, st);
			excel.setreportData("Last 7 days", 3, 15, st);
			excel.setreportData("Last 7 days", 4, 15, st);
			excel.setreportData("Last 7 days", 5, 15, st);
			
			
			excel.setreportData("Last 7 days", 39, 7, st);
			excel.setreportData("Last 7 days", 40, 7, st);
			excel.setreportData("Last 7 days", 41, 7, st);
			excel.setreportData("Last 7 days", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Last 7 days");
			
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
			String Expeccted_SaleAmt=excel.getData("Last 7 days", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Last 7 days", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Last 7 days");
		
				excel.setreport_PassedData("Last 7 days", 2, 15, "0.00");
				excel.setreport_PassedData("Last 7 days", 39, 7, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 7 days", 2, 15,diff_value);
				excel.setreport_FailedData("Last 7 days", 39, 7,diff_value);

			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last 7 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last 7 days", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Last 7 days");
		
				excel.setreport_PassedData("Last 7 days", 3, 15, "0.00");

				excel.setreport_PassedData("Last 7 days", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 7 days", 3, 15,diff_value);
				excel.setreport_FailedData("Last 7 days", 40, 7,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last 7 days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last 7 days", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Last 7 days");
		
				excel.setreport_PassedData("Last 7 days", 4, 15, "0.00");
				
				excel.setreport_PassedData("Last 7 days", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 7 days", 4, 15,diff_value);
				
				excel.setreport_FailedData("Last 7 days", 41, 7,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last 7 days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Last 7 days", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Last 7 days");
		
				excel.setreport_PassedData("Last 7 days", 5, 15, "0.00");
				excel.setreport_PassedData("Last 7 days", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 7 days", 5, 15,diff_value);
				excel.setreport_FailedData("Last 7 days", 42, 7,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for This Month or Not")
	public void verifyDailySaleReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for This month");
		
		
			excel.setreportData("This month", 2, 14, st);
			excel.setreportData("This month", 3, 14, st);
			excel.setreportData("This month", 4, 14, st);
			excel.setreportData("This month", 5, 14, st);
			
			excel.setreportData("This month", 2, 15, st);
			excel.setreportData("This month", 3, 15, st);
			excel.setreportData("This month", 4, 15, st);
			excel.setreportData("This month", 5, 15, st);
			
			
			excel.setreportData("This month", 39, 7, st);
			excel.setreportData("This month", 40, 7, st);
			excel.setreportData("This month", 41, 7, st);
			excel.setreportData("This month", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for This month");
			
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
			String Expeccted_SaleAmt=excel.getData("This month", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("This month", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for This month");
		
				excel.setreport_PassedData("This month", 2, 15, "0.00");
				excel.setreport_PassedData("This month", 39, 7, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("This month", 2, 15,diff_value);
				
				excel.setreport_FailedData("This month", 39, 7,diff_value);
			}
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("This month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("This month", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for This month");
		
				excel.setreport_PassedData("This month", 3, 15, "0.00");
				
				excel.setreport_PassedData("This month", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("This month", 3, 15,diff_value);
				excel.setreport_FailedData("This month", 40, 7,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("This month", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("This month", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for This month");
		
				excel.setreport_PassedData("This month", 4, 15, "0.00");
				excel.setreport_PassedData("This month", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("This month", 4, 15,diff_value);
				excel.setreport_FailedData("This month", 41, 7,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("This month", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("This month", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for This month");
		
				excel.setreport_PassedData("This month", 5, 15, "0.00");
				
				excel.setreport_PassedData("This month", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
			
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("This month", 5, 15,diff_value);
				
				excel.setreport_FailedData("This month", 42, 7,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for Last Month or Not")
	public void verifyDailySaleReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Last month");
	
			excel.setreportData("Last month", 2, 14, st);
			excel.setreportData("Last month", 3, 14, st);
			excel.setreportData("Last month", 4, 14, st);
			excel.setreportData("Last month", 5, 14, st);
			
			excel.setreportData("Last month", 2, 15, st);
			excel.setreportData("Last month", 3, 15, st);
			excel.setreportData("Last month", 4, 15, st);
			excel.setreportData("Last month", 5, 15, st);
			
			
			excel.setreportData("Last month", 39, 7, st);
			excel.setreportData("Last month", 40, 7, st);
			excel.setreportData("Last month", 41, 7, st);
			excel.setreportData("Last month", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Last month");
			
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
			String Expeccted_SaleAmt=excel.getData("Last month", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Last month", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Last month");
		
				excel.setreport_PassedData("Last month", 2, 15, "0.00");
				excel.setreport_PassedData("Last month", 39, 7, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last month", 2, 15,diff_value);
				excel.setreport_FailedData("Last month", 39, 7,diff_value);
			}
			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last month", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Last month");
		
				excel.setreport_PassedData("Last month", 3, 15, "0.00");
				
				excel.setreport_PassedData("Last month", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last month", 2, 15,diff_value);
				excel.setreport_FailedData("Last month", 40, 7,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last month", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last month", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Last month");
		
				excel.setreport_PassedData("Last month", 4, 15, "0.00");
				excel.setreport_PassedData("Last month", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last month", 4, 15,diff_value);
				excel.setreport_FailedData("Last month", 41, 7,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last month", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Last month", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Last month");
		
				excel.setreport_PassedData("Last month", 5, 15, "0.00");
				excel.setreport_PassedData("Last month", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last month", 5, 15,diff_value);
				excel.setreport_FailedData("Last month", 42, 7,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for Last Thirty Days or Not")
	public void verifyDailySaleReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Last 30 days");
		
		
			excel.setreportData("Last 30 days", 2, 14, st);
			excel.setreportData("Last 30 days", 3, 14, st);
			excel.setreportData("Last 30 days", 4, 14, st);
			excel.setreportData("Last 30 days", 5, 14, st);
			
			excel.setreportData("Last 30 days", 2, 15, st);
			excel.setreportData("Last 30 days", 3, 15, st);
			excel.setreportData("Last 30 days", 4, 15, st);
			excel.setreportData("Last 30 days", 5, 15, st);
			
			
			excel.setreportData("Last 30 days", 39, 7, st);
			excel.setreportData("Last 30 days", 40, 7, st);
			excel.setreportData("Last 30 days", 41, 7, st);
			excel.setreportData("Last 30 days", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Last 30 days");
			
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
			String Expeccted_SaleAmt=excel.getData("Last 30 days", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Last 30 days", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Last 30 days");
			
				excel.setreport_PassedData("Last 30 days", 2, 15, "0.00");
				excel.setreport_PassedData("Last 30 days", 39, 7, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 30 days", 2, 15,diff_value);
				excel.setreport_FailedData("Last 30 days", 39, 7,diff_value);
			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last 30 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last 30 days", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Last 30 days");
			
				excel.setreport_PassedData("Last 30 days", 3, 15, "0.00");
				excel.setreport_PassedData("Last 30 days", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		

				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 30 days", 3, 15,diff_value);
				excel.setreport_FailedData("Last 30 days", 40, 7,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last 30 days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last 30 days", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Last 30 days");
			
				excel.setreport_PassedData("Last 30 days", 4, 15, "0.00");
				excel.setreport_PassedData("Last 30 days", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		

				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 30 days", 4, 15,diff_value);
				excel.setreport_FailedData("Last 30 days", 41, 7,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Last 30 days", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Last 30 days", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Last 30 days");
		
				excel.setreport_PassedData("Last 30 days", 5, 15, "0.00");
				excel.setreport_PassedData("Last 30 days", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
	

				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
//				excel.setreportData("Today", 5, 15, diff_value);
//				excel.Highlight_DifferenceValue();
				excel.setreport_FailedData("Last 30 days", 5, 15,diff_value);
				excel.setreport_FailedData("Last 30 days", 42, 7,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for Specific Date or Not")
	public void verifyDailySaleReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Specific Date");
		
			excel.setreportData("Specific Date", 2, 14, st);
			excel.setreportData("Specific Date", 3, 14, st);
			excel.setreportData("Specific Date", 4, 14, st);
			excel.setreportData("Specific Date", 5, 14, st);
			
			excel.setreportData("Specific Date", 2, 15, st);
			excel.setreportData("Specific Date", 3, 15, st);
			excel.setreportData("Specific Date", 4, 15, st);
			excel.setreportData("Specific Date", 5, 15, st);
			
			
			excel.setreportData("Specific Date", 39, 7, st);
			excel.setreportData("Specific Date", 40, 7, st);
			excel.setreportData("Specific Date", 41, 7, st);
			excel.setreportData("Specific Date", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Specific Date");
			
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
			String Expeccted_SaleAmt=excel.getData("Specific Date", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Specific Date", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Specific Date");
		
				excel.setreport_PassedData("Specific Date", 2, 15, "0.00");
				excel.setreport_PassedData("Specific Date", 39, 7, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("Specific Date", 2, 15,diff_value);
				excel.setreport_FailedData("Specific Date", 39, 7,diff_value);

			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Specific Date", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Specific Date", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Specific Date");
		
				excel.setreport_PassedData("Specific Date", 3, 15, "0.00");
				excel.setreport_PassedData("Specific Date", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel

				excel.setreport_FailedData("Specific Date", 3, 15,diff_value);
				excel.setreport_FailedData("Specific Date", 40, 7,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Specific Date", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Specific Date", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Specific Date");
			
				excel.setreport_PassedData("Specific Date", 4, 15, "0.00");
				excel.setreport_PassedData("Specific Date", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel

				excel.setreport_FailedData("Specific Date", 4, 15,diff_value);
				excel.setreport_FailedData("Specific Date", 41, 7,diff_value);
			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Specific Date", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Specific Date", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Specific Date");
		
				excel.setreport_PassedData("Specific Date", 5, 15, "0.00");
				excel.setreport_PassedData("Specific Date", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel

				excel.setreport_FailedData("Specific Date", 5, 15,diff_value);
				excel.setreport_FailedData("Specific Date", 42, 7,diff_value);
			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Daily Sale Report Availble for Date Range or Not")
	public void verifyDailySaleReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Daily Sale Not Available for Date Range");
		
			excel.setreportData("Date Range", 2, 14, st);
			excel.setreportData("Date Range", 3, 14, st);
			excel.setreportData("Date Range", 4, 14, st);
			excel.setreportData("Date Range", 5, 14, st);
			

			excel.setreportData("Date Range", 2, 15, st);
			excel.setreportData("Date Range", 3, 15, st);
			excel.setreportData("Date Range", 4, 15, st);
			excel.setreportData("Date Range", 5, 15, st);
			
			
			excel.setreportData("Date Range", 39, 7, st);
			excel.setreportData("Date Range", 40, 7, st);
			excel.setreportData("Date Range", 41, 7, st);
			excel.setreportData("Date Range", 42, 7, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Daily Sale Available for Date Range");
			
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
			String Expeccted_SaleAmt=excel.getData("Date Range", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			

			Thread.sleep(3000);
			//Get Sale Amount
			String SaleAmount=repts.NetSales_Amount_DailySaleReport().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Date Range", 2, 14, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Net Sale Amount for Daily Sale Report is equal to Sale Recap Report for Date Range");
	
			
				excel.setreport_PassedData("Date Range", 2, 15, "0.00");
				excel.setreport_PassedData("Date Range", 39, 7, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Net Sale Amount for Daily Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("Date Range", 2, 15,diff_value);
				excel.setreport_FailedData("Date Range", 39, 7,diff_value);

			}
			
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Date Range", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySaleReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Date Range", 3, 14, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Daily Sale Report is equal to Sale Recap Report for Date Range");
		
				excel.setreport_PassedData("Date Range", 3, 15, "0.00");
				excel.setreport_PassedData("Date Range", 40, 7, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Daily Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("Date Range", 3, 15,diff_value);
				excel.setreport_FailedData("Date Range", 40, 7,diff_value);

			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Date Range", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=repts.Discount_DailySaleReport().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Date Range", 4, 14, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Daily Sale Report is equal to Sale Recap Report for Date Range");
		
				excel.setreport_PassedData("Date Range", 4, 15, "0.00");
				excel.setreport_PassedData("Date Range", 41, 7, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Daily Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("Date Range", 4, 15,diff_value);
				excel.setreport_FailedData("Date Range", 41, 7,diff_value);

			}
			
			//Get the Grand Sales from Sale Recap Report
			String Expected_GrandSale=excel.getData("Date Range", 7, 1).toString().replace(",", "");
			double Expected_Grand_Sales=Double.parseDouble(Expected_GrandSale);
		
			
			//Get the Grand Sales
			String GrandSale=repts.GrandSales_DailySaleReport().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Date Range", 5, 14, GrandSale);

			
			//Check whether the Grand_Sales value is Equal or not
			if(Expected_Grand_Sales==ActualGrand_Sales)
			{
				test.log(LogStatus.PASS, "Grand_Sales for Daily Sale Report is equal to Sale Recap Report for Date Range");
		
				excel.setreport_PassedData("Date Range", 5, 15, "0.00");
				excel.setreport_PassedData("Date Range", 42, 7, GrandSale+"`");
			}
			else
			{
				double diff=Expected_Grand_Sales-ActualGrand_Sales;
				test.log(LogStatus.FAIL, "Grand_Sales for Daily Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			
			
				String diff_value=String.valueOf(diff);

				//Export the Sale Amount value to Excel
				excel.setreport_FailedData("Date Range", 5, 15,diff_value);
				excel.setreport_FailedData("Date Range", 42, 7,diff_value);


			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
}
