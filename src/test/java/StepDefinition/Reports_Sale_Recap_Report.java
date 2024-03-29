package StepDefinition;

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

public class Reports_Sale_Recap_Report 
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
	
	@Given("Open the Reports - Sale Recap Sale Report home page BaseURL and storeID")
	public void openTheReportsSaleRecapSaleReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Daily page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/sale-recap");

	}
	@Given("Verifying the Sale Recap Sale Report Header Page")
	public void verifyingTheSaleRecapSaleReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loaded or not
		repts.Verify_ReportHomePage("SALE RECAP");
	}
	
	@Then("Check Sale Recap Type Field is Displayed")
	public void checkSaleRecapTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Check_Element_or_Text_Displayed(repts.Sale_Recap_Type_InputBx, "Sale Recap Type Field");
	}
	@Then("Check Employee Field is Displayed")
	public void checkEmployeeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Check_Element_or_Text_Displayed(repts.Employee_InputBx, "Select Employee Field");
	}

	@Given("I Select Sale Recap Type as Time Period")
	public void iSelectSaleRecapTypeAsTimePeriod() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Select Time Period in Sale Recap Report
	repts.Select_Time_Period_Sale_Recap();
	}
	@Given("I Select the Employee as All")
	public void iSelectTheEmployeeAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Employee_InputBx, "All", "Employee Selected as All");
	}
	@Then("Verify Sale Recap Sale Report Availble for Today or Not")
	public void verifySaleRecapSaleReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Today");
	
			excel.setreportData("Today", 2, 1, st);
			excel.setreportData("Today", 3, 1, st);
			excel.setreportData("Today", 4, 1, st);
			excel.setreportData("Today", 5, 1, st);
			excel.setreportData("Today", 6, 1, st);
			excel.setreportData("Today", 7, 1, st);
			
			excel.setreportData("Today", 2, 26, st);
			excel.setreportData("Today", 3, 26, st);
			excel.setreportData("Today", 4, 26, st);
			excel.setreportData("Today", 5, 26, st);
			excel.setreportData("Today", 6, 26, st);
			excel.setreportData("Today", 7, 26, st);
			
			excel.setreportData("Today", 39, 1, st);
			excel.setreportData("Today", 40, 1, st);
			excel.setreportData("Today", 41, 1, st);
			excel.setreportData("Today", 42, 1, st);
			excel.setreportData("Today", 43, 1, st);
			excel.setreportData("Today", 44, 1, st);
			
			excel1.setreportData("Today", 2, 1, st);
			excel1.setreportData("Today", 3, 1, st);
			excel1.setreportData("Today", 4, 1, st);
			excel1.setreportData("Today", 5, 1, st);
			excel1.setreportData("Today", 6, 1, st);
			excel1.setreportData("Today", 7, 1, st);
			
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));

		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Today");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			if(repts.Sales_Table_inSaleRecap().isDisplayed())
			{
				test.log(LogStatus.PASS, "Sales Table Field Available");

			Thread.sleep(3000);
			//Get Net Sales
			String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(NetSales);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Today", 2, 1, NetSales);
			excel.setreportData("Today", 2, 26, NetSales);
			excel.setreportData("Today", 39, 1, NetSales);
			excel1.setreportData("Today", 2, 1, NetSales);

			
			
			//Get the Grand Sales
			String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
			double ActualGrand_Sales=Double.parseDouble(GrandSale);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Today", 5, 1, GrandSale);
			excel.setreportData("Today", 5, 26, GrandSale);
			excel.setreportData("Today", 42, 1, GrandSale);
			excel1.setreportData("Today", 5, 1, GrandSale);

			
			
			//Get the Gross Receipt
			String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
			double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Today", 6, 1, GrandReceipt);
			excel.setreportData("Today", 6, 26, GrandReceipt);
			excel.setreportData("Today", 43, 1, GrandReceipt);
			excel1.setreportData("Today", 6, 1, GrandReceipt);

			
			
			//Get the Gross Sales
			String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
			double ActualGross_Sales=Double.parseDouble(GrossSales);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Today", 7, 1, GrossSales);
			excel.setreportData("Today", 7, 26, GrossSales);
			excel.setreportData("Today", 44, 1, GrossSales);
			excel1.setreportData("Today", 7, 1, GrossSales);

			
			
			//Get the Net Void
			String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
			double ActualNet_Void=Double.parseDouble(NetVoid);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Today", 9, 1, NetVoid);
			excel.setreportData("Today", 9, 26, NetVoid);
			excel.setreportData("Today", 46, 1, NetVoid);
			excel1.setreportData("Today", 9, 1, NetVoid);

			
			
			//Get the Gross Void
			String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
			double ActualGross_Void=Double.parseDouble(GrossVoid);
			
			//Export the % Grand Sales value to Excel
			excel.setreportData("Today", 10, 1, GrossVoid);
			excel.setreportData("Today", 10, 26, GrossVoid);
			excel.setreportData("Today", 47, 1, GrossVoid);
			excel1.setreportData("Today", 10, 1, GrossVoid);

			}
			else
			{
				test.log(LogStatus.FAIL, "Sales Table Field not available");
	
			}
			
			try
			{
			if(repts.Taxes_Table_inSaleRecap().isDisplayed())
			{
				test.log(LogStatus.PASS, "Taxes Table Field Available");
				
				//Get the Tax
				String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
				double ActualTax=Double.parseDouble(Tx);
				
				//Export Tax value to Excel
				excel.setreportData("Today", 3, 1, Tx);
				excel.setreportData("Today", 3, 26, Tx);
				excel.setreportData("Today", 40, 1, Tx);
				excel1.setreportData("Today", 3, 1, Tx);

				try
				{
				if(repts.Tax_Exempt_SaleRecap().isDisplayed())
				{
				//Get the Tax Exempted
				String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
				double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Today", 8, 1, Tx_Exmpted);
				excel.setreportData("Today", 8, 26, Tx_Exmpted);
				excel.setreportData("Today", 45, 1, Tx_Exmpted);
				excel1.setreportData("Today", 8, 1, Tx_Exmpted);

				}
				}
				catch(Exception p)
				{
					test.log(LogStatus.INFO, "Tax Exempted not available");
					
					//Export Tax Exempted value to Excel
					excel.setreportData("Today", 8, 1, st);
					excel.setreportData("Today", 8, 26, st);
					excel.setreportData("Today", 45, 1, st);
					excel1.setreportData("Today", 8, 1, st);

				}
				
				
				//Get the Rounding Off
				String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
				double ActualRounding_Off=Double.parseDouble(RoundOff);
				
				//Export Tax value to Excel
				excel.setreportData("Today", 12, 1, RoundOff);
				excel.setreportData("Today", 12, 26, RoundOff);
				excel.setreportData("Today", 49, 1, RoundOff);
				excel1.setreportData("Today", 12, 1, RoundOff);

			}
			}
			catch(Exception pp)
			{
				test.log(LogStatus.FAIL, "Taxes Table Field not available");
				
				
				//Export Tax value to Excel
				excel.setreportData("Today", 3, 1, "0.00");
				excel.setreportData("Today", 3, 26, "0.00");
				excel.setreportData("Today", 40, 1, "0.00");
				excel1.setreportData("Today", 3, 1, "0.00");

				//Export Tax Exempted value to Excel
				excel.setreportData("Today", 8, 1, st);
				excel.setreportData("Today", 8, 26, st);
				excel.setreportData("Today", 45, 1, st);
				excel1.setreportData("Today", 8, 1, st);

				//Export Tax value to Excel
				excel.setreportData("Today", 12, 1, st);
				excel.setreportData("Today", 12, 26, st);
				excel.setreportData("Today", 49, 1, st);
				excel1.setreportData("Today", 12, 1, st);

			}
			
			try
			{
			if(repts.Discount_Table_inSaleRecap().isDisplayed())
			{
				test.log(LogStatus.PASS, "Discount Table Field Available");
				
				//Get Discount 
				String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
				double ActualDiscount=Double.parseDouble(Discnt);
				
				//Export Discount value to Excel
				excel.setreportData("Today", 4, 1, Discnt);
				excel.setreportData("Today", 4, 26, Discnt);
				excel.setreportData("Today", 41, 1, Discnt);
				excel1.setreportData("Today", 4, 1, Discnt);

				
				//Get Discount Tax
				String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
				double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
				
				//Export Discount Tax value to Excel
				excel.setreportData("Today", 13, 1, DiscntTx);
				excel.setreportData("Today", 13, 26, DiscntTx);
				excel.setreportData("Today", 50, 1, DiscntTx);
				excel1.setreportData("Today", 13, 1, DiscntTx);

			}
			}
			catch(Exception h)
			{
				test.log(LogStatus.FAIL, "Discount Table Field not available");

				
				//Export Discount value to Excel
				excel.setreportData("Today", 4, 1, "0.00");
				excel.setreportData("Today", 4, 26, "0.00");
				excel.setreportData("Today", 41, 1, "0.00");
				excel1.setreportData("Today", 4, 1, "0.00");

				
				
				
				//Export Discount Tax value to Excel
				excel.setreportData("Today", 13, 1, st);
				excel.setreportData("Today", 13, 26, st);
				excel.setreportData("Today", 50, 1, st);
				excel1.setreportData("Today", 13, 1, st);

			}
			
			try
			{
			if(repts.Refund_Table_inSaleRecap().isDisplayed())
			{
				test.log(LogStatus.PASS, "Refund Table Field Available");
				
				//Get Refund Tax
				String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
				double ActualRefund=Double.parseDouble(Refund);
				
				//Export Discount value to Excel
				excel.setreportData("Today", 11, 1, Refund);
				excel.setreportData("Today", 11, 26, Refund);
				excel.setreportData("Today", 48, 1, Refund);
				excel1.setreportData("Today", 11, 1, Refund);

			}
			}
			catch(Exception l)
			{
				test.log(LogStatus.FAIL, "Refund Table Field not available");

				//Export Discount value to Excel
				excel.setreportData("Today", 11, 1, st);
				excel.setreportData("Today", 11, 26, st);
				excel.setreportData("Today", 48, 1, st);
				excel1.setreportData("Today", 11, 1, st);

			}
			
			//To Write all the Data to Excel
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));

			
			Thread.sleep(3000);

		}
	}

@Then("Verify Sale Recap Sale Report Availble for Yesterday or Not")
public void verifySaleRecapSaleReportAvailbleForYesterdayOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Yesterday");
	
		
		excel.setreportData("Yesterday", 2, 1, st);
		excel.setreportData("Yesterday", 3, 1, st);
		excel.setreportData("Yesterday", 4, 1, st);
		excel.setreportData("Yesterday", 5, 1, st);
		excel.setreportData("Yesterday", 6, 1, st);
		excel.setreportData("Yesterday", 7, 1, st);
		
		excel.setreportData("Yesterday", 2, 26, st);
		excel.setreportData("Yesterday", 3, 26, st);
		excel.setreportData("Yesterday", 4, 26, st);
		excel.setreportData("Yesterday", 5, 26, st);
		excel.setreportData("Yesterday", 6, 26, st);
		excel.setreportData("Yesterday", 7, 26, st);
		
		excel.setreportData("Yesterday", 39, 1, st);
		excel.setreportData("Yesterday", 40, 1, st);
		excel.setreportData("Yesterday", 41, 1, st);
		excel.setreportData("Yesterday", 42, 1, st);
		excel.setreportData("Yesterday", 43, 1, st);
		excel.setreportData("Yesterday", 44, 1, st);
		
		excel1.setreportData("Yesterday", 2, 1, st);
		excel1.setreportData("Yesterday", 3, 1, st);
		excel1.setreportData("Yesterday", 4, 1, st);
		excel1.setreportData("Yesterday", 5, 1, st);
		excel1.setreportData("Yesterday", 6, 1, st);
		excel1.setreportData("Yesterday", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Yesterday");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("Yesterday", 2, 1, NetSales);
		excel.setreportData("Yesterday", 2, 26, NetSales);
		excel.setreportData("Yesterday", 39, 1, NetSales);
		excel1.setreportData("Yesterday", 2, 1, NetSales);

		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Yesterday", 5, 1, GrandSale);
		excel.setreportData("Yesterday", 5, 26, GrandSale);
		excel.setreportData("Yesterday", 42, 1, GrandSale);
		excel1.setreportData("Yesterday", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Yesterday", 6, 1, GrandReceipt);
		excel.setreportData("Yesterday", 6, 26, GrandReceipt);
		excel.setreportData("Yesterday", 43, 1, GrandReceipt);
		excel1.setreportData("Yesterday", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Yesterday", 7, 1, GrossSales);
		excel.setreportData("Yesterday", 7, 26, GrossSales);
		excel.setreportData("Yesterday", 44, 1, GrossSales);
		excel1.setreportData("Yesterday", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Yesterday", 9, 1, NetVoid);
		excel.setreportData("Yesterday", 9, 26, NetVoid);
		excel.setreportData("Yesterday", 46, 1, NetVoid);
		excel1.setreportData("Yesterday", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Yesterday", 10, 1, GrossVoid);
		excel.setreportData("Yesterday", 10, 26, GrossVoid);
		excel.setreportData("Yesterday", 47, 1, GrossVoid);
		excel1.setreportData("Yesterday", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Yesterday", 3, 1, Tx);
			excel.setreportData("Yesterday", 3, 26, Tx);
			excel.setreportData("Yesterday", 40, 1, Tx);
			excel1.setreportData("Yesterday", 3, 1, Tx);

			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("Yesterday", 8, 1, Tx_Exmpted);
			excel.setreportData("Yesterday", 8, 26, Tx_Exmpted);
			excel.setreportData("Yesterday", 45, 1, Tx_Exmpted);
			excel1.setreportData("Yesterday", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Yesterday", 8, 1, st);
				excel.setreportData("Yesterday", 8, 26, st);
				excel.setreportData("Yesterday", 45, 1, st);
				excel1.setreportData("Yesterday", 8, 1, st);

			}
			
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("Yesterday", 12, 1, RoundOff);
			excel.setreportData("Yesterday", 12, 26, RoundOff);
			excel.setreportData("Yesterday", 49, 1, RoundOff);
			excel1.setreportData("Yesterday", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("Yesterday", 3, 1, "0.00");
			excel.setreportData("Yesterday", 3, 26, "0.00");
			excel.setreportData("Yesterday", 40, 1, "0.00");
			excel1.setreportData("Yesterday", 3, 1, "0.00");

			
			//Export Tax Exempted value to Excel
			excel.setreportData("Yesterday", 8, 1, st);
			excel.setreportData("Yesterday", 8, 26, st);
			excel.setreportData("Yesterday", 45, 1, st);
			excel1.setreportData("Yesterday", 8, 1, st);

			
			//Export Tax value to Excel
			excel.setreportData("Yesterday", 12, 1, st);
			excel.setreportData("Yesterday", 12, 26, st);
			excel.setreportData("Yesterday", 49, 1, st);
			excel1.setreportData("Yesterday", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Yesterday", 4, 1, Discnt);
			excel.setreportData("Yesterday", 4, 26, Discnt);
			excel.setreportData("Yesterday", 41, 1, Discnt);
			excel1.setreportData("Yesterday", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("Yesterday", 13, 1, DiscntTx);
			excel.setreportData("Yesterday", 13, 26, DiscntTx);
			excel.setreportData("Yesterday", 50, 1, DiscntTx);
			excel1.setreportData("Yesterday", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("Yesterday", 4, 1, "0.00");
			excel.setreportData("Yesterday", 4, 26, "0.00");
			excel.setreportData("Yesterday", 41, 1, "0.00");
			excel1.setreportData("Yesterday", 4, 1, "0.00");

			
			
			
			//Export Discount Tax value to Excel
			excel.setreportData("Yesterday", 13, 1, st);
			excel.setreportData("Yesterday", 13, 26, st);
			excel.setreportData("Yesterday", 50, 1, st);
			excel1.setreportData("Yesterday", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("Yesterday", 11, 1, Refund);
			excel.setreportData("Yesterday", 11, 26, Refund);
			excel.setreportData("Yesterday", 48, 1, Refund);
			excel1.setreportData("Yesterday", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("Yesterday", 11, 1, st);
			excel.setreportData("Yesterday", 11, 26, st);
			excel.setreportData("Yesterday", 48, 1, st);
			excel1.setreportData("Yesterday", 11, 1, st);

		}
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		Thread.sleep(3000);

	}
}

@Then("Verify Sale Recap Sale Report Availble for Last N Days or Not")
public void verifySaleRecapSaleReportAvailbleForLastNDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Last N days");
	
		
		
		excel.setreportData("Last N days", 2, 1, st);
		excel.setreportData("Last N days", 3, 1, st);
		excel.setreportData("Last N days", 4, 1, st);
		excel.setreportData("Last N days", 5, 1, st);
		excel.setreportData("Last N days", 6, 1, st);
		excel.setreportData("Last N days", 7, 1, st);
		
		excel.setreportData("Last N days", 2, 26, st);
		excel.setreportData("Last N days", 3, 26, st);
		excel.setreportData("Last N days", 4, 26, st);
		excel.setreportData("Last N days", 5, 26, st);
		excel.setreportData("Last N days", 6, 26, st);
		excel.setreportData("Last N days", 7, 26, st);
		
		excel.setreportData("Last N days", 39, 1, st);
		excel.setreportData("Last N days", 40, 1, st);
		excel.setreportData("Last N days", 41, 1, st);
		excel.setreportData("Last N days", 42, 1, st);
		excel.setreportData("Last N days", 43, 1, st);
		excel.setreportData("Last N days", 44, 1, st);
		
		excel1.setreportData("Last N days", 2, 1, st);
		excel1.setreportData("Last N days", 3, 1, st);
		excel1.setreportData("Last N days", 4, 1, st);
		excel1.setreportData("Last N days", 5, 1, st);
		excel1.setreportData("Last N days", 6, 1, st);
		excel1.setreportData("Last N days", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Last N days");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("Last N days", 2, 1, NetSales);
		excel.setreportData("Last N days", 2, 26, NetSales);
		excel.setreportData("Last N days", 39, 1, NetSales);
		excel1.setreportData("Last N days", 2, 1, NetSales);

		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last N days", 5, 1, GrandSale);
		excel.setreportData("Last N days", 5, 26, GrandSale);
		excel.setreportData("Last N days", 42, 1, GrandSale);
		excel1.setreportData("Last N days", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last N days", 6, 1, GrandReceipt);
		excel.setreportData("Last N days", 6, 26, GrandReceipt);
		excel.setreportData("Last N days", 43, 1, GrandReceipt);
		excel1.setreportData("Last N days", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last N days", 7, 1, GrossSales);
		excel.setreportData("Last N days", 7, 26, GrossSales);
		excel.setreportData("Last N days", 44, 1, GrossSales);
		excel1.setreportData("Last N days", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last N days", 9, 1, NetVoid);
		excel.setreportData("Last N days", 9, 26, NetVoid);
		excel.setreportData("Last N days", 46, 1, NetVoid);
		excel1.setreportData("Last N days", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last N days", 10, 1, GrossVoid);
		excel.setreportData("Last N days", 10, 26, GrossVoid);
		excel.setreportData("Last N days", 47, 1, GrossVoid);
		excel1.setreportData("Last N days", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last N days", 3, 1, Tx);
			excel.setreportData("Last N days", 3, 26, Tx);
			excel.setreportData("Last N days", 40, 1, Tx);
			excel1.setreportData("Last N days", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("Last N days", 8, 1, Tx_Exmpted);
			excel.setreportData("Last N days", 8, 26, Tx_Exmpted);
			excel.setreportData("Last N days", 45, 1, Tx_Exmpted);
			excel1.setreportData("Last N days", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Last N days", 8, 1, st);
				excel.setreportData("Last N days", 8, 26, st);
				excel.setreportData("Last N days", 45, 1, st);
				excel1.setreportData("Last N days", 8, 1, st);

			}
			
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("Last N days", 12, 1, RoundOff);
			excel.setreportData("Last N days", 12, 26, RoundOff);
			excel.setreportData("Last N days", 49, 1, RoundOff);
			excel1.setreportData("Last N days", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("Last N days", 3, 1, "0.00");
			excel.setreportData("Last N days", 3, 26, "0.00");
			excel.setreportData("Last N days", 40, 1, "0.00");
			excel1.setreportData("Last N days", 3, 1, "0.00");

			
			//Export Tax Exempted value to Excel
			excel.setreportData("Last N days", 8, 1, st);
			excel.setreportData("Last N days", 8, 26, st);
			excel.setreportData("Last N days", 45, 1, st);
			excel1.setreportData("Last N days", 8, 1, st);

			//Export Tax value to Excel
			excel.setreportData("Last N days", 12, 1, st);
			excel.setreportData("Last N days", 12, 26, st);
			excel.setreportData("Last N days", 49, 1, st);
			excel1.setreportData("Last N days", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last N days", 4, 1, Discnt);
			excel.setreportData("Last N days", 4, 26, Discnt);
			excel.setreportData("Last N days", 41, 1, Discnt);
			excel1.setreportData("Last N days", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("Last N days", 13, 1, DiscntTx);
			excel.setreportData("Last N days", 13, 26, DiscntTx);
			excel.setreportData("Last N days", 50, 1, DiscntTx);
			excel1.setreportData("Last N days", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("Last N days", 4, 1, "0.00");
			excel.setreportData("Last N days", 4, 26, "0.00");
			excel.setreportData("Last N days", 41, 1, "0.00");
			excel1.setreportData("Last N days", 4, 1, "0.00");

			//Export Discount Tax value to Excel
			excel.setreportData("Last N days", 13, 1, st);
			excel.setreportData("Last N days", 13, 26, st);
			excel.setreportData("Last N days", 50, 1, st);
			excel1.setreportData("Last N days", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("Last N days", 11, 1, Refund);
			excel.setreportData("Last N days", 11, 26, Refund);
			excel.setreportData("Last N days", 48, 1, Refund);
			excel1.setreportData("Last N days", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("Last N days", 11, 1, st);
			excel.setreportData("Last N days", 11, 26, st);
			excel.setreportData("Last N days", 48, 1, st);
			excel1.setreportData("Last N days", 11, 1, st);

		}
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(3000);

	}
}
@Then("Verify Sale Recap Sale Report Availble for This Week or Not")
public void verifySaleRecapSaleReportAvailbleForThisWeekOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for This Week");

	
		
		excel.setreportData("This Week", 2, 1, st);
		excel.setreportData("This Week", 3, 1, st);
		excel.setreportData("This Week", 4, 1, st);
		excel.setreportData("This Week", 5, 1, st);
		excel.setreportData("This Week", 6, 1, st);
		excel.setreportData("This Week", 7, 1, st);
		
		excel.setreportData("This Week", 2, 26, st);
		excel.setreportData("This Week", 3, 26, st);
		excel.setreportData("This Week", 4, 26, st);
		excel.setreportData("This Week", 5, 26, st);
		excel.setreportData("This Week", 6, 26, st);
		excel.setreportData("This Week", 7, 26, st);
		
		excel.setreportData("This Week", 39, 1, st);
		excel.setreportData("This Week", 40, 1, st);
		excel.setreportData("This Week", 41, 1, st);
		excel.setreportData("This Week", 42, 1, st);
		excel.setreportData("This Week", 43, 1, st);
		excel.setreportData("This Week", 44, 1, st);
		
		excel1.setreportData("This Week", 2, 1, st);
		excel1.setreportData("This Week", 3, 1, st);
		excel1.setreportData("This Week", 4, 1, st);
		excel1.setreportData("This Week", 5, 1, st);
		excel1.setreportData("This Week", 6, 1, st);
		excel1.setreportData("This Week", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for This Week");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("This Week", 2, 1, NetSales);
		excel.setreportData("This Week", 2, 26, NetSales);
		excel.setreportData("This Week", 39, 1, NetSales);
		excel1.setreportData("This Week", 2, 1, NetSales);

		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This Week", 5, 1, GrandSale);
		excel.setreportData("This Week", 5, 26, GrandSale);
		excel.setreportData("This Week", 42, 1, GrandSale);
		excel1.setreportData("This Week", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This Week", 6, 1, GrandReceipt);
		excel.setreportData("This Week", 6, 26, GrandReceipt);
		excel.setreportData("This Week", 43, 1, GrandReceipt);
		excel1.setreportData("This Week", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This Week", 7, 1, GrossSales);
		excel.setreportData("This Week", 7, 26, GrossSales);
		excel.setreportData("This Week", 44, 1, GrossSales);
		excel1.setreportData("This Week", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This Week", 9, 1, NetVoid);
		excel.setreportData("This Week", 9, 26, NetVoid);
		excel.setreportData("This Week", 46, 1, NetVoid);
		excel1.setreportData("This Week", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This Week", 10, 1, GrossVoid);
		excel.setreportData("This Week", 10, 26, GrossVoid);
		excel.setreportData("This Week", 47, 1, GrossVoid);
		excel1.setreportData("This Week", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("This Week", 3, 1, Tx);
			excel.setreportData("This Week", 3, 26, Tx);
			excel.setreportData("This Week", 40, 1, Tx);
			excel1.setreportData("This Week", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("This Week", 8, 1, Tx_Exmpted);
			excel.setreportData("This Week", 8, 26, Tx_Exmpted);
			excel.setreportData("This Week", 45, 1, Tx_Exmpted);
			excel1.setreportData("This Week", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("This Week", 8, 1, st);
				excel.setreportData("This Week", 8, 26, st);
				excel.setreportData("This Week", 45, 1, st);
				excel1.setreportData("This Week", 8, 1, st);

			}
			
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("This Week", 12, 1, RoundOff);
			excel.setreportData("This Week", 12, 26, RoundOff);
			excel.setreportData("This Week", 49, 1, RoundOff);
			excel1.setreportData("This Week", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("This Week", 3, 1, "0.00");
			excel.setreportData("This Week", 3, 26, "0.00");
			excel.setreportData("This Week", 40, 1, "0.00");
			excel1.setreportData("This Week", 3, 1, "0.00");

			//Export Tax Exempted value to Excel
			excel.setreportData("This Week", 8, 1, st);
			excel.setreportData("This Week", 8, 26, st);
			excel.setreportData("This Week", 45, 1, st);
			excel1.setreportData("This Week", 8, 1, st);

			//Export Tax value to Excel
			excel.setreportData("This Week", 12, 1, st);
			excel.setreportData("This Week", 12, 26, st);
			excel.setreportData("This Week", 49, 1, st);
			excel1.setreportData("This Week", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("This Week", 4, 1, Discnt);
			excel.setreportData("This Week", 4, 26, Discnt);
			excel.setreportData("This Week", 41, 1, Discnt);
			excel1.setreportData("This Week", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("This Week", 13, 1, DiscntTx);
			excel.setreportData("This Week", 13, 26, DiscntTx);
			excel.setreportData("This Week", 50, 1, DiscntTx);
			excel1.setreportData("This Week", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("This Week", 4, 1, "0.00");
			excel.setreportData("This Week", 4, 26, "0.00");
			excel.setreportData("This Week", 41, 1, "0.00");
			excel1.setreportData("This Week", 4, 1, "0.00");

			
			
			
			//Export Discount Tax value to Excel
			excel.setreportData("This Week", 13, 1, st);
			excel.setreportData("This Week", 13, 26, st);
			excel.setreportData("This Week", 50, 1, st);
			excel1.setreportData("This Week", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("This Week", 11, 1, Refund);
			excel.setreportData("This Week", 11, 26, Refund);
			excel.setreportData("This Week", 48, 1, Refund);
			excel1.setreportData("This Week", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("This Week", 11, 1, st);
			excel.setreportData("This Week", 11, 26, st);
			excel.setreportData("This Week", 48, 1, st);
			excel1.setreportData("This Week", 11, 1, st);

		}
					
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(3000);

	}
}
@Then("Verify Sale Recap Sale Report Availble for Last Week or Not")
public void verifySaleRecapSaleReportAvailbleForLastWeekOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Last Week");
	
		
		
		excel.setreportData("Last Week", 2, 1, st);
		excel.setreportData("Last Week", 3, 1, st);
		excel.setreportData("Last Week", 4, 1, st);
		excel.setreportData("Last Week", 5, 1, st);
		excel.setreportData("Last Week", 6, 1, st);
		excel.setreportData("Last Week", 7, 1, st);
		
		excel.setreportData("Last Week", 2, 26, st);
		excel.setreportData("Last Week", 3, 26, st);
		excel.setreportData("Last Week", 4, 26, st);
		excel.setreportData("Last Week", 5, 26, st);
		excel.setreportData("Last Week", 6, 26, st);
		excel.setreportData("Last Week", 7, 26, st);
		
		excel.setreportData("Last Week", 39, 1, st);
		excel.setreportData("Last Week", 40, 1, st);
		excel.setreportData("Last Week", 41, 1, st);
		excel.setreportData("Last Week", 42, 1, st);
		excel.setreportData("Last Week", 43, 1, st);
		excel.setreportData("Last Week", 44, 1, st);
		
		excel1.setreportData("Last Week", 2, 1, st);
		excel1.setreportData("Last Week", 3, 1, st);
		excel1.setreportData("Last Week", 4, 1, st);
		excel1.setreportData("Last Week", 5, 1, st);
		excel1.setreportData("Last Week", 6, 1, st);
		excel1.setreportData("Last Week", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Last Week");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("Last Week", 2, 1, NetSales);
		excel.setreportData("Last Week", 2, 26, NetSales);
		excel.setreportData("Last Week", 39, 1, NetSales);
		excel1.setreportData("Last Week", 2, 1, NetSales);

		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last Week", 5, 1, GrandSale);
		excel.setreportData("Last Week", 5, 26, GrandSale);
		excel.setreportData("Last Week", 42, 1, GrandSale);
		excel1.setreportData("Last Week", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last Week", 6, 1, GrandReceipt);
		excel.setreportData("Last Week", 6, 26, GrandReceipt);
		excel.setreportData("Last Week", 43, 1, GrandReceipt);
		excel1.setreportData("Last Week", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last Week", 7, 1, GrossSales);
		excel.setreportData("Last Week", 7, 26, GrossSales);
		excel.setreportData("Last Week", 44, 1, GrossSales);
		excel1.setreportData("Last Week", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last Week", 9, 1, NetVoid);
		excel.setreportData("Last Week", 9, 26, NetVoid);
		excel.setreportData("Last Week", 46, 1, NetVoid);
		excel1.setreportData("Last Week", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last Week", 10, 1, GrossVoid);
		excel.setreportData("Last Week", 10, 26, GrossVoid);
		excel.setreportData("Last Week", 47, 1, GrossVoid);
		excel1.setreportData("Last Week", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last Week", 3, 1, Tx);
			excel.setreportData("Last Week", 3, 26, Tx);
			excel.setreportData("Last Week", 40, 1, Tx);
			excel1.setreportData("Last Week", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("Last Week", 8, 1, Tx_Exmpted);
			excel.setreportData("Last Week", 8, 26, Tx_Exmpted);
			excel.setreportData("Last Week", 45, 1, Tx_Exmpted);
			excel1.setreportData("Last Week", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Last Week", 8, 1, st);
				excel.setreportData("Last Week", 8, 26, st);
				excel.setreportData("Last Week", 45, 1, st);
				excel1.setreportData("Last Week", 8, 1, st);

			}
			
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("Last Week", 12, 1, RoundOff);
			excel.setreportData("Last Week", 12, 26, RoundOff);
			excel.setreportData("Last Week", 49, 1, RoundOff);
			excel1.setreportData("Last Week", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("Last Week", 3, 1, "0.00");
			excel.setreportData("Last Week", 3, 26, "0.00");
			excel.setreportData("Last Week", 40, 1, "0.00");
			excel1.setreportData("Last Week", 3, 1, "0.00");

			//Export Tax Exempted value to Excel
			excel.setreportData("Last Week", 8, 1, st);
			excel.setreportData("Last Week", 8, 26, st);
			excel.setreportData("Last Week", 45, 1, st);
			excel1.setreportData("Last Week", 8, 1, st);

			//Export Tax value to Excel
			excel.setreportData("Last Week", 12, 1, st);
			excel.setreportData("Last Week", 12, 26, st);
			excel.setreportData("Last Week", 49, 1, st);
			excel1.setreportData("Last Week", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last Week", 4, 1, Discnt);
			excel.setreportData("Last Week", 4, 26, Discnt);
			excel.setreportData("Last Week", 41, 1, Discnt);
			excel1.setreportData("Last Week", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("Last Week", 13, 1, DiscntTx);
			excel.setreportData("Last Week", 13, 26, DiscntTx);
			excel.setreportData("Last Week", 50, 1, DiscntTx);
			excel1.setreportData("Last Week", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("Last Week", 4, 1, "0.00");
			excel.setreportData("Last Week", 4, 26, "0.00");
			excel.setreportData("Last Week", 41, 1, "0.00");
			excel1.setreportData("Last Week", 4, 1, "0.00");

			//Export Discount Tax value to Excel
			excel.setreportData("Last Week", 13, 1, st);
			excel.setreportData("Last Week", 13, 26, st);
			excel.setreportData("Last Week", 50, 1, st);
			excel1.setreportData("Last Week", 13, 1, st);
		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("Last Week", 11, 1, Refund);
			excel.setreportData("Last Week", 11, 26, Refund);
			excel.setreportData("Last Week", 48, 1, Refund);
			excel1.setreportData("Last Week", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("Last Week", 11, 1, st);
			excel.setreportData("Last Week", 11, 26, st);
			excel.setreportData("Last Week", 48, 1, st);
			excel1.setreportData("Last Week", 11, 1, st);

		}
					
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(3000);

	}
}
@Then("Verify Sale Recap Sale Report Availble for Last Seven Days or Not")
public void verifySaleRecapSaleReportAvailbleForLastSevenDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Last 7 days");

	
		excel.setreportData("Last 7 days", 2, 1, st);
		excel.setreportData("Last 7 days", 3, 1, st);
		excel.setreportData("Last 7 days", 4, 1, st);
		excel.setreportData("Last 7 days", 5, 1, st);
		excel.setreportData("Last 7 days", 6, 1, st);
		excel.setreportData("Last 7 days", 7, 1, st);
		
		excel.setreportData("Last 7 days", 2, 26, st);
		excel.setreportData("Last 7 days", 3, 26, st);
		excel.setreportData("Last 7 days", 4, 26, st);
		excel.setreportData("Last 7 days", 5, 26, st);
		excel.setreportData("Last 7 days", 6, 26, st);
		excel.setreportData("Last 7 days", 7, 26, st);
		
		excel.setreportData("Last 7 days", 39, 1, st);
		excel.setreportData("Last 7 days", 40, 1, st);
		excel.setreportData("Last 7 days", 41, 1, st);
		excel.setreportData("Last 7 days", 42, 1, st);
		excel.setreportData("Last 7 days", 43, 1, st);
		excel.setreportData("Last 7 days", 44, 1, st);
		
		excel1.setreportData("Last 7 days", 2, 1, st);
		excel1.setreportData("Last 7 days", 3, 1, st);
		excel1.setreportData("Last 7 days", 4, 1, st);
		excel1.setreportData("Last 7 days", 5, 1, st);
		excel1.setreportData("Last 7 days", 6, 1, st);
		excel1.setreportData("Last 7 days", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Last 7 days");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("Last 7 days", 2, 1, NetSales);
		excel.setreportData("Last 7 days", 2, 26, NetSales);
		excel.setreportData("Last 7 days", 39, 1, NetSales);
		excel1.setreportData("Last 7 days", 2, 1, NetSales);

		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 7 days", 5, 1, GrandSale);
		excel.setreportData("Last 7 days", 5, 26, GrandSale);
		excel.setreportData("Last 7 days", 42, 1, GrandSale);
		excel1.setreportData("Last 7 days", 5, 1, GrandSale);

		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 7 days", 6, 1, GrandReceipt);
		excel.setreportData("Last 7 days", 6, 26, GrandReceipt);
		excel.setreportData("Last 7 days", 43, 1, GrandReceipt);
		excel1.setreportData("Last 7 days", 6, 1, GrandReceipt);

		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 7 days", 7, 1, GrossSales);
		excel.setreportData("Last 7 days", 7, 26, GrossSales);
		excel.setreportData("Last 7 days", 44, 1, GrossSales);
		excel1.setreportData("Last 7 days", 7, 1, GrossSales);

		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 7 days", 9, 1, NetVoid);
		excel.setreportData("Last 7 days", 9, 26, NetVoid);
		excel.setreportData("Last 7 days", 46, 1, NetVoid);
		excel1.setreportData("Last 7 days", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 7 days", 10, 1, GrossVoid);
		excel.setreportData("Last 7 days", 10, 26, GrossVoid);
		excel.setreportData("Last 7 days", 47, 1, GrossVoid);
		excel1.setreportData("Last 7 days", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last 7 days", 3, 1, Tx);
			excel.setreportData("Last 7 days", 3, 26, Tx);
			excel.setreportData("Last 7 days", 40, 1, Tx);
			excel1.setreportData("Last 7 days", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("Last 7 days", 8, 1, Tx_Exmpted);
			excel.setreportData("Last 7 days", 8, 26, Tx_Exmpted);
			excel.setreportData("Last 7 days", 45, 1, Tx_Exmpted);
			excel1.setreportData("Last 7 days", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Last 7 days", 8, 1, st);
				excel.setreportData("Last 7 days", 8, 26, st);
				excel.setreportData("Last 7 days", 45, 1, st);
				excel1.setreportData("Last 7 days", 8, 1, st);

			}
			
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("Last 7 days", 12, 1, RoundOff);
			excel.setreportData("Last 7 days", 12, 26, RoundOff);
			excel.setreportData("Last 7 days", 49, 1, RoundOff);
			excel1.setreportData("Last 7 days", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("Last 7 days", 3, 1, "0.00");
			excel.setreportData("Last 7 days", 3, 26, "0.00");
			excel.setreportData("Last 7 days", 40, 1, "0.00");
			excel1.setreportData("Last 7 days", 3, 1, "0.00");

			
			//Export Tax Exempted value to Excel
			excel.setreportData("Last 7 days", 8, 1, st);
			excel.setreportData("Last 7 days", 8, 26, st);
			excel.setreportData("Last 7 days", 45, 1, st);
			excel1.setreportData("Last 7 days", 8, 1, st);

			//Export Tax value to Excel
			excel.setreportData("Last 7 days", 12, 1, st);
			excel.setreportData("Last 7 days", 12, 26, st);
			excel.setreportData("Last 7 days", 49, 1, st);
			excel1.setreportData("Last 7 days", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last 7 days", 4, 1, Discnt);
			excel.setreportData("Last 7 days", 4, 26, Discnt);
			excel.setreportData("Last 7 days", 41, 1, Discnt);
			excel1.setreportData("Last 7 days", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("Last 7 days", 13, 1, DiscntTx);
			excel.setreportData("Last 7 days", 13, 26, DiscntTx);
			excel.setreportData("Last 7 days", 50, 1, DiscntTx);
			excel1.setreportData("Last 7 days", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("Last 7 days", 4, 1, "0.00");
			excel.setreportData("Last 7 days", 4, 26, "0.00");
			excel.setreportData("Last 7 days", 41, 1, "0.00");
			excel1.setreportData("Last 7 days", 4, 1, "0.00");

			//Export Discount Tax value to Excel
			excel.setreportData("Last 7 days", 13, 1, st);
			excel.setreportData("Last 7 days", 13, 26, st);
			excel.setreportData("Last 7 days", 50, 1, st);
			excel1.setreportData("Last 7 days", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("Last 7 days", 11, 1, Refund);
			excel.setreportData("Last 7 days", 11, 26, Refund);
			excel.setreportData("Last 7 days", 48, 1, Refund);
			excel1.setreportData("Last 7 days", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("Last 7 days", 11, 1, st);
			excel.setreportData("Last 7 days", 11, 26, st);
			excel.setreportData("Last 7 days", 48, 1, st);
			excel1.setreportData("Last 7 days", 11, 1, st);

		}

					
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(3000);

	}
}

@Then("Verify Sale Recap Sale Report Availble for This Month or Not")
public void verifySaleRecapSaleReportAvailbleForThisMonthOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for This month");
	
	
		
		excel.setreportData("This month", 2, 1, st);
		excel.setreportData("This month", 3, 1, st);
		excel.setreportData("This month", 4, 1, st);
		excel.setreportData("This month", 5, 1, st);
		excel.setreportData("This month", 6, 1, st);
		excel.setreportData("This month", 7, 1, st);
		
		excel.setreportData("This month", 2, 26, st);
		excel.setreportData("This month", 3, 26, st);
		excel.setreportData("This month", 4, 26, st);
		excel.setreportData("This month", 5, 26, st);
		excel.setreportData("This month", 6, 26, st);
		excel.setreportData("This month", 7, 26, st);
		
		excel.setreportData("This month", 39, 1, st);
		excel.setreportData("This month", 40, 1, st);
		excel.setreportData("This month", 41, 1, st);
		excel.setreportData("This month", 42, 1, st);
		excel.setreportData("This month", 43, 1, st);
		excel.setreportData("This month", 44, 1, st);
		
		excel1.setreportData("This month", 2, 1, st);
		excel1.setreportData("This month", 3, 1, st);
		excel1.setreportData("This month", 4, 1, st);
		excel1.setreportData("This month", 5, 1, st);
		excel1.setreportData("This month", 6, 1, st);
		excel1.setreportData("This month", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for This month");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("This month", 2, 1, NetSales);
		excel.setreportData("This month", 2, 26, NetSales);
		excel.setreportData("This month", 39, 1, NetSales);
		excel1.setreportData("This month", 2, 1, NetSales);

		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This month", 5, 1, GrandSale);
		excel.setreportData("This month", 5, 26, GrandSale);
		excel.setreportData("This month", 42, 1, GrandSale);
		excel1.setreportData("This month", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This month", 6, 1, GrandReceipt);
		excel.setreportData("This month", 6, 26, GrandReceipt);
		excel.setreportData("This month", 43, 1, GrandReceipt);
		excel1.setreportData("This month", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This month", 7, 1, GrossSales);
		excel.setreportData("This month", 7, 26, GrossSales);
		excel.setreportData("This month", 44, 1, GrossSales);
		excel1.setreportData("This month", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This month", 9, 1, NetVoid);
		excel.setreportData("This month", 9, 26, NetVoid);
		excel.setreportData("This month", 46, 1, NetVoid);
		excel1.setreportData("This month", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("This month", 10, 1, GrossVoid);
		excel.setreportData("This month", 10, 26, GrossVoid);
		excel.setreportData("This month", 47, 1, GrossVoid);
		excel1.setreportData("This month", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("This month", 3, 1, Tx);
			excel.setreportData("This month", 3, 26, Tx);
			excel.setreportData("This month", 40, 1, Tx);
			excel1.setreportData("This month", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("This month", 8, 1, Tx_Exmpted);
			excel.setreportData("This month", 8, 26, Tx_Exmpted);
			excel.setreportData("This month", 45, 1, Tx_Exmpted);
			excel1.setreportData("This month", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("This month", 8, 1, st);
				excel.setreportData("This month", 8, 26, st);
				excel.setreportData("This month", 45, 1, st);
				excel1.setreportData("This month", 8, 1, st);

			}
			
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("This month", 12, 1, RoundOff);
			excel.setreportData("This month", 12, 26, RoundOff);
			excel.setreportData("This month", 49, 1, RoundOff);
			excel1.setreportData("This month", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("This month", 3, 1, "0.00");
			excel.setreportData("This month", 3, 26, "0.00");
			excel.setreportData("This month", 40, 1, "0.00");
			excel1.setreportData("This month", 3, 1, "0.00");

			//Export Tax Exempted value to Excel
			excel.setreportData("This month", 8, 1, st);
			excel.setreportData("This month", 8, 26, st);
			excel.setreportData("This month", 45, 1, st);
			excel1.setreportData("This month", 8, 1, st);

			//Export Tax value to Excel
			excel.setreportData("This month", 12, 1, st);
			excel.setreportData("This month", 12, 26, st);
			excel.setreportData("This month", 49, 1, st);
			excel1.setreportData("This month", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("This month", 4, 1, Discnt);
			excel.setreportData("This month", 4, 26, Discnt);
			excel.setreportData("This month", 41, 1, Discnt);
			excel1.setreportData("This month", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("This month", 13, 1, DiscntTx);
			excel.setreportData("This month", 13, 26, DiscntTx);
			excel.setreportData("This month", 50, 1, DiscntTx);
			excel1.setreportData("This month", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("This month", 4, 1, "0.00");
			excel.setreportData("This month", 4, 26, "0.00");
			excel.setreportData("This month", 41, 1, "0.00");
			excel1.setreportData("This month", 4, 1, "0.00");

			//Export Discount Tax value to Excel
			excel.setreportData("This month", 13, 1, st);
			excel.setreportData("This month", 13, 26, st);
			excel.setreportData("This month", 50, 1, st);
			excel1.setreportData("This month", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("This month", 11, 1, Refund);
			excel.setreportData("This month", 11, 26, Refund);
			excel.setreportData("This month", 48, 1, Refund);
			excel1.setreportData("This month", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("This month", 11, 1, st);
			excel.setreportData("This month", 11, 26, st);
			excel.setreportData("This month", 48, 1, st);
			excel1.setreportData("This month", 11, 1, st);

		}
					
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		Thread.sleep(3000);

	}
}

@Then("Verify Sale Recap Sale Report Availble for Last Month or Not")
public void verifySaleRecapSaleReportAvailbleForLastMonthOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Last month");

		
		excel.setreportData("Last month", 2, 1, st);
		excel.setreportData("Last month", 3, 1, st);
		excel.setreportData("Last month", 4, 1, st);
		excel.setreportData("Last month", 5, 1, st);
		excel.setreportData("Last month", 6, 1, st);
		excel.setreportData("Last month", 7, 1, st);
		
		excel.setreportData("Last month", 2, 26, st);
		excel.setreportData("Last month", 3, 26, st);
		excel.setreportData("Last month", 4, 26, st);
		excel.setreportData("Last month", 5, 26, st);
		excel.setreportData("Last month", 6, 26, st);
		excel.setreportData("Last month", 7, 26, st);
		
		excel.setreportData("Last month", 39, 1, st);
		excel.setreportData("Last month", 40, 1, st);
		excel.setreportData("Last month", 41, 1, st);
		excel.setreportData("Last month", 42, 1, st);
		excel.setreportData("Last month", 43, 1, st);
		excel.setreportData("Last month", 44, 1, st);
		
		excel1.setreportData("Last month", 2, 1, st);
		excel1.setreportData("Last month", 3, 1, st);
		excel1.setreportData("Last month", 4, 1, st);
		excel1.setreportData("Last month", 5, 1, st);
		excel1.setreportData("Last month", 6, 1, st);
		excel1.setreportData("Last month", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Last month");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("Last month", 2, 1, NetSales);
		excel.setreportData("Last month", 2, 26, NetSales);
		excel.setreportData("Last month", 39, 1, NetSales);
		excel1.setreportData("Last month", 2, 1, NetSales);

		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last month", 5, 1, GrandSale);
		excel.setreportData("Last month", 5, 26, GrandSale);
		excel.setreportData("Last month", 42, 1, GrandSale);
		excel1.setreportData("Last month", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last month", 6, 1, GrandReceipt);
		excel.setreportData("Last month", 6, 26, GrandReceipt);
		excel.setreportData("Last month", 43, 1, GrandReceipt);
		excel1.setreportData("Last month", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last month", 7, 1, GrossSales);
		excel.setreportData("Last month", 7, 26, GrossSales);
		excel.setreportData("Last month", 44, 1, GrossSales);
		excel1.setreportData("Last month", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last month", 9, 1, NetVoid);
		excel.setreportData("Last month", 9, 26, NetVoid);
		excel.setreportData("Last month", 46, 1, NetVoid);
		excel1.setreportData("Last month", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last month", 10, 1, GrossVoid);
		excel.setreportData("Last month", 10, 26, GrossVoid);
		excel.setreportData("Last month", 47, 1, GrossVoid);
		excel1.setreportData("Last month", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last month", 3, 1, Tx);
			excel.setreportData("Last month", 3, 26, Tx);
			excel.setreportData("Last month", 40, 1, Tx);
			excel1.setreportData("Last month", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("Last month", 8, 1, Tx_Exmpted);
			excel.setreportData("Last month", 8, 26, Tx_Exmpted);
			excel.setreportData("Last month", 45, 1, Tx_Exmpted);
			excel1.setreportData("Last month", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Last month", 8, 1, st);
				excel.setreportData("Last month", 8, 26, st);
				excel.setreportData("Last month", 45, 1, st);
				excel1.setreportData("Last month", 8, 1, st);

			}
			
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("Last month", 12, 1, RoundOff);
			excel.setreportData("Last month", 12, 26, RoundOff);
			excel.setreportData("Last month", 49, 1, RoundOff);
			excel1.setreportData("Last month", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("Last month", 3, 1, "0.00");
			excel.setreportData("Last month", 3, 26, "0.00");
			excel.setreportData("Last month", 40, 1, "0.00");
			excel1.setreportData("Last month", 3, 1, "0.00");

			//Export Tax Exempted value to Excel
			excel.setreportData("Last month", 8, 1, st);
			excel.setreportData("Last month", 8, 26, st);
			excel.setreportData("Last month", 45, 1, st);
			excel1.setreportData("Last month", 8, 1, st);

			//Export Tax value to Excel
			excel.setreportData("Last month", 12, 1, st);
			excel.setreportData("Last month", 12, 26, st);
			excel.setreportData("Last month", 49, 1, st);
			excel1.setreportData("Last month", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last month", 4, 1, Discnt);
			excel.setreportData("Last month", 4, 26, Discnt);
			excel.setreportData("Last month", 41, 1, Discnt);
			excel1.setreportData("Last month", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("Last month", 13, 1, DiscntTx);
			excel.setreportData("Last month", 13, 26, DiscntTx);
			excel.setreportData("Last month", 50, 1, DiscntTx);
			excel1.setreportData("Last month", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("Last month", 4, 1, "0.00");
			excel.setreportData("Last month", 4, 26, "0.00");
			excel.setreportData("Last month", 41, 1, "0.00");
			excel1.setreportData("Last month", 4, 1, "0.00");

			//Export Discount Tax value to Excel
			excel.setreportData("Last month", 13, 1, st);
			excel.setreportData("Last month", 13, 26, st);
			excel.setreportData("Last month", 50, 1, st);
			excel1.setreportData("Last month", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("Last month", 11, 1, Refund);
			excel.setreportData("Last month", 11, 26, Refund);
			excel.setreportData("Last month", 48, 1, Refund);
			excel1.setreportData("Last month", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("Last month", 11, 1, st);
			excel.setreportData("Last month", 11, 26, st);
			excel.setreportData("Last month", 48, 1, st);
			excel1.setreportData("Last month", 11, 1, st);

		}
					
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(3000);

	}
}
@Then("Verify Sale Recap Sale Report Availble for Last Thirty Days or Not")
public void verifySaleRecapSaleReportAvailbleForLastThirtyDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Last 30 days");
	
	
		
		excel.setreportData("Last 30 days", 2, 1, st);
		excel.setreportData("Last 30 days", 3, 1, st);
		excel.setreportData("Last 30 days", 4, 1, st);
		excel.setreportData("Last 30 days", 5, 1, st);
		excel.setreportData("Last 30 days", 6, 1, st);
		excel.setreportData("Last 30 days", 7, 1, st);
		
		excel.setreportData("Last 30 days", 2, 26, st);
		excel.setreportData("Last 30 days", 3, 26, st);
		excel.setreportData("Last 30 days", 4, 26, st);
		excel.setreportData("Last 30 days", 5, 26, st);
		excel.setreportData("Last 30 days", 6, 26, st);
		excel.setreportData("Last 30 days", 7, 26, st);
		
		excel.setreportData("Last 30 days", 39, 1, st);
		excel.setreportData("Last 30 days", 40, 1, st);
		excel.setreportData("Last 30 days", 41, 1, st);
		excel.setreportData("Last 30 days", 42, 1, st);
		excel.setreportData("Last 30 days", 43, 1, st);
		excel.setreportData("Last 30 days", 44, 1, st);
		
		excel1.setreportData("Last 30 days", 2, 1, st);
		excel1.setreportData("Last 30 days", 3, 1, st);
		excel1.setreportData("Last 30 days", 4, 1, st);
		excel1.setreportData("Last 30 days", 5, 1, st);
		excel1.setreportData("Last 30 days", 6, 1, st);
		excel1.setreportData("Last 30 days", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Last 30 days");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("Last 30 days", 2, 1, NetSales);
		excel.setreportData("Last 30 days", 2, 26, NetSales);
		excel.setreportData("Last 30 days", 39, 1, NetSales);
		excel1.setreportData("Last 30 days", 2, 1, NetSales);

		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 30 days", 5, 1, GrandSale);
		excel.setreportData("Last 30 days", 5, 26, GrandSale);
		excel.setreportData("Last 30 days", 42, 1, GrandSale);
		excel1.setreportData("Last 30 days", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 30 days", 6, 1, GrandReceipt);
		excel.setreportData("Last 30 days", 6, 26, GrandReceipt);
		excel.setreportData("Last 30 days", 43, 1, GrandReceipt);
		excel1.setreportData("Last 30 days", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 30 days", 7, 1, GrossSales);
		excel.setreportData("Last 30 days", 7, 26, GrossSales);
		excel.setreportData("Last 30 days", 44, 1, GrossSales);
		excel1.setreportData("Last 30 days", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 30 days", 9, 1, NetVoid);
		excel.setreportData("Last 30 days", 9, 26, NetVoid);
		excel.setreportData("Last 30 days", 46, 1, NetVoid);
		excel1.setreportData("Last 30 days", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Last 30 days", 10, 1, GrossVoid);
		excel.setreportData("Last 30 days", 10, 26, GrossVoid);
		excel.setreportData("Last 30 days", 47, 1, GrossVoid);
		excel1.setreportData("Last 30 days", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Last 30 days", 3, 1, Tx);
			excel.setreportData("Last 30 days", 3, 26, Tx);
			excel.setreportData("Last 30 days", 40, 1, Tx);
			excel1.setreportData("Last 30 days", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("Last 30 days", 8, 1, Tx_Exmpted);
			excel.setreportData("Last 30 days", 8, 26, Tx_Exmpted);
			excel.setreportData("Last 30 days", 45, 1, Tx_Exmpted);
			excel1.setreportData("Last 30 days", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Last 30 days", 8, 1, st);
				excel.setreportData("Last 30 days", 8, 26, st);
				excel.setreportData("Last 30 days", 45, 1, st);
				excel1.setreportData("Last 30 days", 8, 1, st);

			}
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("Last 30 days", 12, 1, RoundOff);
			excel.setreportData("Last 30 days", 12, 26, RoundOff);
			excel.setreportData("Last 30 days", 49, 1, RoundOff);
			excel1.setreportData("Last 30 days", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("Last 30 days", 3, 1, "0.00");
			excel.setreportData("Last 30 days", 3, 26, "0.00");
			excel.setreportData("Last 30 days", 40, 1, "0.00");
			excel1.setreportData("Last 30 days", 3, 1, "0.00");

			//Export Tax Exempted value to Excel
			excel.setreportData("Last 30 days", 8, 1, st);
			excel.setreportData("Last 30 days", 8, 26, st);
			excel.setreportData("Last 30 days", 45, 1, st);
			excel1.setreportData("Last 30 days", 8, 1, st);
	
			//Export Tax value to Excel
			excel.setreportData("Last 30 days", 12, 1, st);
			excel.setreportData("Last 30 days", 12, 26, st);
			excel.setreportData("Last 30 days", 49, 1, st);
			excel1.setreportData("Last 30 days", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Last 30 days", 4, 1, Discnt);
			excel.setreportData("Last 30 days", 4, 26, Discnt);
			excel.setreportData("Last 30 days", 41, 1, Discnt);
			excel1.setreportData("Last 30 days", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("Last 30 days", 13, 1, DiscntTx);
			excel.setreportData("Last 30 days", 13, 26, DiscntTx);
			excel.setreportData("Last 30 days", 50, 1, DiscntTx);
			excel1.setreportData("Last 30 days", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("Last 30 days", 4, 1, "0.00");
			excel.setreportData("Last 30 days", 4, 26, "0.00");
			excel.setreportData("Last 30 days", 41, 1, "0.00");
			excel1.setreportData("Last 30 days", 4, 1, "0.00");

			//Export Discount Tax value to Excel
			excel.setreportData("Last 30 days", 13, 1, st);
			excel.setreportData("Last 30 days", 13, 26, st);
			excel.setreportData("Last 30 days", 50, 1, st);
			excel1.setreportData("Last 30 days", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("Last 30 days", 11, 1, Refund);
			excel.setreportData("Last 30 days", 11, 26, Refund);
			excel.setreportData("Last 30 days", 48, 1, Refund);
			excel1.setreportData("Last 30 days", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("Last 30 days", 11, 1, st);
			excel.setreportData("Last 30 days", 11, 26, st);
			excel.setreportData("Last 30 days", 48, 1, st);
			excel1.setreportData("Last 30 days", 11, 1, st);

		}
					
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));

		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(3000);

	}
}
@Then("Verify Sale Recap Sale Report Availble for Specific Date or Not")
public void verifySaleRecapSaleReportAvailbleForSpecificDateOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Specific Date");
	
		
		excel.setreportData("Specific Date", 2, 1, st);
		excel.setreportData("Specific Date", 3, 1, st);
		excel.setreportData("Specific Date", 4, 1, st);
		excel.setreportData("Specific Date", 5, 1, st);
		excel.setreportData("Specific Date", 6, 1, st);
		excel.setreportData("Specific Date", 7, 1, st);
		
		excel.setreportData("Specific Date", 2, 26, st);
		excel.setreportData("Specific Date", 3, 26, st);
		excel.setreportData("Specific Date", 4, 26, st);
		excel.setreportData("Specific Date", 5, 26, st);
		excel.setreportData("Specific Date", 6, 26, st);
		excel.setreportData("Specific Date", 7, 26, st);
		
		excel.setreportData("Specific Date", 39, 1, st);
		excel.setreportData("Specific Date", 40, 1, st);
		excel.setreportData("Specific Date", 41, 1, st);
		excel.setreportData("Specific Date", 42, 1, st);
		excel.setreportData("Specific Date", 43, 1, st);
		excel.setreportData("Specific Date", 44, 1, st);
		
		excel1.setreportData("Specific Date", 2, 1, st);
		excel1.setreportData("Specific Date", 3, 1, st);
		excel1.setreportData("Specific Date", 4, 1, st);
		excel1.setreportData("Specific Date", 5, 1, st);
		excel1.setreportData("Specific Date", 6, 1, st);
		excel1.setreportData("Specific Date", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Specific Date");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("Specific Date", 2, 1, NetSales);
		excel.setreportData("Specific Date", 2, 26, NetSales);
		excel.setreportData("Specific Date", 39, 1, NetSales);
		excel1.setreportData("Specific Date", 2, 1, NetSales);

		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Specific Date", 5, 1, GrandSale);
		excel.setreportData("Specific Date", 5, 26, GrandSale);
		excel.setreportData("Specific Date", 42, 1, GrandSale);
		excel1.setreportData("Specific Date", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Specific Date", 6, 1, GrandReceipt);
		excel.setreportData("Specific Date", 6, 26, GrandReceipt);
		excel.setreportData("Specific Date", 43, 1, GrandReceipt);
		excel1.setreportData("Specific Date", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Specific Date", 7, 1, GrossSales);
		excel.setreportData("Specific Date", 7, 26, GrossSales);
		excel.setreportData("Specific Date", 44, 1, GrossSales);
		excel1.setreportData("Specific Date", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Specific Date", 9, 1, NetVoid);
		excel.setreportData("Specific Date", 9, 26, NetVoid);
		excel.setreportData("Specific Date", 46, 1, NetVoid);
		excel1.setreportData("Specific Date", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Specific Date", 10, 1, GrossVoid);
		excel.setreportData("Specific Date", 10, 26, GrossVoid);
		excel.setreportData("Specific Date", 47, 1, GrossVoid);
		excel1.setreportData("Specific Date", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Specific Date", 3, 1, Tx);
			excel.setreportData("Specific Date", 3, 26, Tx);
			excel.setreportData("Specific Date", 40, 1, Tx);
			excel1.setreportData("Specific Date", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("Specific Date", 8, 1, Tx_Exmpted);
			excel.setreportData("Specific Date", 8, 26, Tx_Exmpted);
			excel.setreportData("Specific Date", 45, 1, Tx_Exmpted);
			excel1.setreportData("Specific Date", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Specific Date", 8, 1, st);
				excel.setreportData("Specific Date", 8, 26, st);
				excel.setreportData("Specific Date", 45, 1, st);
				excel1.setreportData("Specific Date", 8, 1, st);

			}
			
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("Specific Date", 12, 1, RoundOff);
			excel.setreportData("Specific Date", 12, 26, RoundOff);
			excel.setreportData("Specific Date", 49, 1, RoundOff);
			excel1.setreportData("Specific Date", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("Specific Date", 3, 1, "0.00");
			excel.setreportData("Specific Date", 3, 26, "0.00");
			excel.setreportData("Specific Date", 40, 1, "0.00");
			excel1.setreportData("Specific Date", 3, 1, "0.00");

			//Export Tax Exempted value to Excel
			excel.setreportData("Specific Date", 8, 1, st);
			excel.setreportData("Specific Date", 8, 26, st);
			excel.setreportData("Specific Date", 45, 1, st);
			excel1.setreportData("Specific Date", 8, 1, st);

			//Export Tax value to Excel
			excel.setreportData("Specific Date", 12, 1, st);
			excel.setreportData("Specific Date", 12, 26, st);
			excel.setreportData("Specific Date", 49, 1, st);
			excel1.setreportData("Specific Date", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Specific Date", 4, 1, Discnt);
			excel.setreportData("Specific Date", 4, 26, Discnt);
			excel.setreportData("Specific Date", 41, 1, Discnt);
			excel1.setreportData("Specific Date", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("Specific Date", 13, 1, DiscntTx);
			excel.setreportData("Specific Date", 13, 26, DiscntTx);
			excel.setreportData("Specific Date", 50, 1, DiscntTx);
			excel1.setreportData("Specific Date", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("Specific Date", 4, 1, "0.00");
			excel.setreportData("Specific Date", 4, 26, "0.00");
			excel.setreportData("Specific Date", 41, 1, "0.00");
			excel1.setreportData("Specific Date", 4, 1, "0.00");

			//Export Discount Tax value to Excel
			excel.setreportData("Specific Date", 13, 1, st);
			excel.setreportData("Specific Date", 13, 26, st);
			excel.setreportData("Specific Date", 50, 1, st);
			excel1.setreportData("Specific Date", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("Specific Date", 11, 1, Refund);
			excel.setreportData("Specific Date", 11, 26, Refund);
			excel.setreportData("Specific Date", 48, 1, Refund);
			excel1.setreportData("Specific Date", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("Specific Date", 11, 1, st);
			excel.setreportData("Specific Date", 11, 26, st);
			excel.setreportData("Specific Date", 48, 1, st);
			excel1.setreportData("Specific Date", 11, 1, st);

		}
					
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(3000);

	}
}
@Then("Verify Sale Recap Sale Report Availble for Date Range or Not")
public void verifySaleRecapSaleReportAvailbleForDateRangeOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	ExcelDataConfig excel1=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report for Sale Recap Not Available for Date Range");
	
	
		excel.setreportData("Date Range", 2, 1, st);
		excel.setreportData("Date Range", 3, 1, st);
		excel.setreportData("Date Range", 4, 1, st);
		excel.setreportData("Date Range", 5, 1, st);
		excel.setreportData("Date Range", 6, 1, st);
		excel.setreportData("Date Range", 7, 1, st);
		
		excel.setreportData("Date Range", 2, 26, st);
		excel.setreportData("Date Range", 3, 26, st);
		excel.setreportData("Date Range", 4, 26, st);
		excel.setreportData("Date Range", 5, 26, st);
		excel.setreportData("Date Range", 6, 26, st);
		excel.setreportData("Date Range", 7, 26, st);
		
		excel.setreportData("Date Range", 39, 1, st);
		excel.setreportData("Date Range", 40, 1, st);
		excel.setreportData("Date Range", 41, 1, st);
		excel.setreportData("Date Range", 42, 1, st);
		excel.setreportData("Date Range", 43, 1, st);
		excel.setreportData("Date Range", 44, 1, st);
		
		excel1.setreportData("Date Range", 2, 1, st);
		excel1.setreportData("Date Range", 3, 1, st);
		excel1.setreportData("Date Range", 4, 1, st);
		excel1.setreportData("Date Range", 5, 1, st);
		excel1.setreportData("Date Range", 6, 1, st);
		excel1.setreportData("Date Range", 7, 1, st);
		
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
	}
	}
	catch(Exception G)
	{
		
		test.log(LogStatus.PASS, "Sale Report for Sale Recap Available for Date Range");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		if(repts.Sales_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Sales Table Field Available");

		Thread.sleep(3000);
		//Get Net Sales
		String NetSales=repts.Net_Sales_SaleRecap().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(NetSales);
		
		//Export the Net Sales value to Excel
		excel.setreportData("Date Range", 2, 1, NetSales);
		excel.setreportData("Date Range", 2, 26, NetSales);
		excel.setreportData("Date Range", 39, 1, NetSales);
		excel1.setreportData("Date Range", 2, 1, NetSales);

		
		
		//Get the Grand Sales
		String GrandSale=repts.Grand_Sales_SaleRecap().getText().replace(",", "");
		double ActualGrand_Sales=Double.parseDouble(GrandSale);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Date Range", 5, 1, GrandSale);
		excel.setreportData("Date Range", 5, 26, GrandSale);
		excel.setreportData("Date Range", 42, 1, GrandSale);
		excel1.setreportData("Date Range", 5, 1, GrandSale);

		
		
		//Get the Gross Receipt
		String GrandReceipt=repts.Gross_Receipt_SaleRecap().getText().replace(",", "");
		double ActualGross_Receipt=Double.parseDouble(GrandReceipt);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Date Range", 6, 1, GrandReceipt);
		excel.setreportData("Date Range", 6, 26, GrandReceipt);
		excel.setreportData("Date Range", 43, 1, GrandReceipt);
		excel1.setreportData("Date Range", 6, 1, GrandReceipt);

		
		
		//Get the Gross Sales
		String GrossSales=repts.Gross_Sales_SaleRecap().getText().replace(",", "");
		double ActualGross_Sales=Double.parseDouble(GrossSales);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Date Range", 7, 1, GrossSales);
		excel.setreportData("Date Range", 7, 26, GrossSales);
		excel.setreportData("Date Range", 44, 1, GrossSales);
		excel1.setreportData("Date Range", 7, 1, GrossSales);

		
		
		//Get the Net Void
		String NetVoid=repts.Net_Void_SaleRecap().getText().replace(",", "");
		double ActualNet_Void=Double.parseDouble(NetVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Date Range", 9, 1, NetVoid);
		excel.setreportData("Date Range", 9, 26, NetVoid);
		excel.setreportData("Date Range", 46, 1, NetVoid);
		excel1.setreportData("Date Range", 9, 1, NetVoid);

		
		
		//Get the Gross Void
		String GrossVoid=repts.Gross_Void_SaleRecap().getText().replace(",", "");
		double ActualGross_Void=Double.parseDouble(GrossVoid);
		
		//Export the % Grand Sales value to Excel
		excel.setreportData("Date Range", 10, 1, GrossVoid);
		excel.setreportData("Date Range", 10, 26, GrossVoid);
		excel.setreportData("Date Range", 47, 1, GrossVoid);
		excel1.setreportData("Date Range", 10, 1, GrossVoid);

		}
		else
		{
			test.log(LogStatus.FAIL, "Sales Table Field not available");

		}
		
		try
		{
		if(repts.Taxes_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Taxes Table Field Available");
			
			//Get the Tax
			String Tx=repts.Tax_SaleRecap().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Date Range", 3, 1, Tx);
			excel.setreportData("Date Range", 3, 26, Tx);
			excel.setreportData("Date Range", 40, 1, Tx);
			excel1.setreportData("Date Range", 3, 1, Tx);

			
			try
			{
			if(repts.Tax_Exempt_SaleRecap().isDisplayed())
			{
			//Get the Tax Exempted
			String Tx_Exmpted=repts.Tax_Exempt_SaleRecap().getText().replace(",", "");
			double ActualTax_Exempted=Double.parseDouble(Tx_Exmpted);
			
			//Export Tax Exempted value to Excel
			excel.setreportData("Date Range", 8, 1, Tx_Exmpted);
			excel.setreportData("Date Range", 8, 26, Tx_Exmpted);
			excel.setreportData("Date Range", 45, 1, Tx_Exmpted);
			excel1.setreportData("Date Range", 8, 1, Tx_Exmpted);

			}
			}
			catch(Exception p)
			{
				test.log(LogStatus.INFO, "Tax Exempted not available");
				
				//Export Tax Exempted value to Excel
				excel.setreportData("Date Range", 8, 1, st);
				excel.setreportData("Date Range", 8, 26, st);
				excel.setreportData("Date Range", 45, 1, st);
				excel1.setreportData("Date Range", 8, 1, st);

			}
			
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_SaleRecap().getText().replace(",", "");
			double ActualRounding_Off=Double.parseDouble(RoundOff);
			
			//Export Tax value to Excel
			excel.setreportData("Date Range", 12, 1, RoundOff);
			excel.setreportData("Date Range", 12, 26, RoundOff);
			excel.setreportData("Date Range", 49, 1, RoundOff);
			excel1.setreportData("Date Range", 12, 1, RoundOff);

		}
		}
		catch(Exception ll)
		{
			test.log(LogStatus.FAIL, "Taxes Table Field not available");
			
			
			//Export Tax value to Excel
			excel.setreportData("Date Range", 3, 1, "0.00");
			excel.setreportData("Date Range", 3, 26, "0.00");
			excel.setreportData("Date Range", 40, 1, "0.00");
			excel1.setreportData("Date Range", 3, 1, "0.00");

			//Export Tax Exempted value to Excel
			excel.setreportData("Date Range", 8, 1, st);
			excel.setreportData("Date Range", 8, 26, st);
			excel.setreportData("Date Range", 45, 1, st);
			excel1.setreportData("Date Range", 8, 1, st);

			//Export Tax value to Excel
			excel.setreportData("Date Range", 12, 1, st);
			excel.setreportData("Date Range", 12, 26, st);
			excel.setreportData("Date Range", 49, 1, st);
			excel1.setreportData("Date Range", 12, 1, st);

		}
		
		try
		{
		if(repts.Discount_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Discount Table Field Available");
			
			//Get Discount 
			String Discnt=repts.Discount_SaleRecap().getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Date Range", 4, 1, Discnt);
			excel.setreportData("Date Range", 4, 26, Discnt);
			excel.setreportData("Date Range", 41, 1, Discnt);
			excel1.setreportData("Date Range", 4, 1, Discnt);

			
			//Get Discount Tax
			String DiscntTx=repts.Discount_Tax_SaleRecap().getText().replace(",", "");
			double ActualDiscount_Tax=Double.parseDouble(DiscntTx);
			
			//Export Discount Tax value to Excel
			excel.setreportData("Date Range", 13, 1, DiscntTx);
			excel.setreportData("Date Range", 13, 26, DiscntTx);
			excel.setreportData("Date Range", 50, 1, DiscntTx);
			excel1.setreportData("Date Range", 13, 1, DiscntTx);

		}
		}
		catch(Exception h)
		{
			test.log(LogStatus.FAIL, "Discount Table Field not available");

			
			//Export Discount value to Excel
			excel.setreportData("Date Range", 4, 1, "0.00");
			excel.setreportData("Date Range", 4, 26, "0.00");
			excel.setreportData("Date Range", 41, 1, "0.00");
			excel1.setreportData("Date Range", 4, 1, "0.00");

			//Export Discount Tax value to Excel
			excel.setreportData("Date Range", 13, 1, st);
			excel.setreportData("Date Range", 13, 26, st);
			excel.setreportData("Date Range", 50, 1, st);
			excel1.setreportData("Date Range", 13, 1, st);

		}
		
		try
		{
		if(repts.Refund_Table_inSaleRecap().isDisplayed())
		{
			test.log(LogStatus.PASS, "Refund Table Field Available");
			
			//Get Refund Tax
			String Refund=repts.Refund_SaleRecap().getText().replace(",", "");
			double ActualRefund=Double.parseDouble(Refund);
			
			//Export Discount value to Excel
			excel.setreportData("Date Range", 11, 1, Refund);
			excel.setreportData("Date Range", 11, 26, Refund);
			excel.setreportData("Date Range", 48, 1, Refund);
			excel1.setreportData("Date Range", 11, 1, Refund);

		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Refund Table Field not available");

			//Export Discount value to Excel
			excel.setreportData("Date Range", 11, 1, st);
			excel.setreportData("Date Range", 11, 26, st);
			excel.setreportData("Date Range", 48, 1, st);
			excel1.setreportData("Date Range", 11, 1, st);

		}
					
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		excel1.toWrite(Utility.getProperty("Excel_Sheet_Path_Enterprise_Report"));
		
		Thread.sleep(3000);

	}
}



}
