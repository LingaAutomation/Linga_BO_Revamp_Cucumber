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

public class Reports_Department_Sale_Report
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

	@Given("Open the Reports - Department Sale Report home page BaseURL and storeID")
	public void openTheReportsDepartmentSaleReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		//Load the Department page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/department");

	}
	
	@Given("Verifying the Department Sale Report Header Page")
	public void verifyingTheDepartmentSaleReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loeded or not
		repts.Verify_ReportHomePage("DEPARTMENT");
	}

	
	@Then("Check Select Department Field is Displayed")
	public void checkSelectDepartmentFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Select_Department_InputBx, "Select Department Field");
	}
	@Then("Check Time Period is Displayed")
	public void checkTimePeriodIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Time_PeriodInputBx, "Time Period Field");

	}
	@Then("Check Name Field in Table is Displayed")
	public void checkNameFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Name_Column_Field, "Name Column Field");
	}
	@Then("Check Sale Amount Field in Table is Displayed")
	public void checkSaleAmountFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Sale_Amount_Column_Field, "Sale Amount Column Field");

	}
	@Then("Check Quantity Field in Table is Displayed")
	public void checkQuantityFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Quantity_Column_Field, "Quantity Column Field");

	}
	@Then("Check Tax Field in Table is Displayed")
	public void checkTaxFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Tax_Column_Field, "Tax Column Field");
	}
	@Then("Check Discount Field in Table is Displayed")
	public void checkDiscountFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Discount_Column_Field, "Discount Column Field");

	}
	@Then("Check %of Sale Field in Table is Displayed")
	public void checkOfSaleFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Name_Column_Field, "% of Sale Column Field");

	}
	@Then("Check Export Field is Displayed")
	public void checkExportFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Export_Btn, "Export Button Field");

	}

@Given("I Select the Department as All")
public void iSelectTheDepartmentAsAll() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearchText(repts.Select_Department_InputBx, "All", "Select Department selected as All");
}
@Then("Verify Department Sale Report Availble for Today or Not")
public void verifyDepartmentSaleReportAvailbleForTodayOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
	Thread.sleep(8000);
	try
	{
		test.log(LogStatus.PASS, "Sale Report for Department Available for Today");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
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
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Today", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Today", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Today");

		excel.setreport_PassedData("Today", 2, 3, "0.00");
		
		excel.setreport_PassedData("Today", 39, 2, SaleAmount+"`");

		
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			String diff_value=String.valueOf(diff);
			
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
			

			excel.setreport_FailedData("Today", 2, 3,diff_value);
	
			excel.setreport_FailedData("Today", 39, 2,diff_value);
		}
		
	

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Today", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Today", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Today");
	
			excel.setreport_PassedData("Today", 3, 3, "0.00");

			excel.setreport_PassedData("Today", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 3, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Today", 3, 3,diff_value);

			excel.setreport_FailedData("Today", 40, 2,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Today", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Today", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Today");
	
		
			excel.setreport_PassedData("Today", 4, 3, "0.00");

			excel.setreport_PassedData("Today", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
		
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 4, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Today", 4, 3,diff_value);

			excel.setreport_FailedData("Today", 41, 2,diff_value);
		}
		
		
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);
	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Today");
	
			excel.setreportData("Today", 2, 2, st);
			excel.setreportData("Today", 3, 2, st);
			excel.setreportData("Today", 4, 2, st);
			
			
			excel.setreportData("Today", 2, 3, st);
			excel.setreportData("Today", 3, 3, st);
			excel.setreportData("Today", 4, 3, st);
			
			excel.setreportData("Today", 39, 2, st);
			excel.setreportData("Today", 40, 2, st);
			excel.setreportData("Today", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	

	}
}

@Then("Verify Department Sale Report Availble for Yesterday or Not")
public void verifyDepartmentSaleReportAvailbleForYesterdayOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for Yesterday");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
//		//Verify Donut Chart screen
//		repts.Verify_Donut_Chart_Screen_TopSales();
//		
//		//Verify Bars Chart Screen
//		repts.Verify_Bars_Chart_Screen_TopSales();
//		
//		//Verify Sales By Hours
//		repts.Verify_Sales_byHours_Chart_Screen();
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Yesterday", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "").replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Yesterday", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Yesterday");
	
		
			excel.setreport_PassedData("Yesterday", 2, 3, "0.00");

			excel.setreport_PassedData("Yesterday", 39, 2, SaleAmount+"`");
			
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
	

			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Yesterday", 2, 3,diff_value);
			excel.setreport_FailedData("Yesterday", 39, 2,diff_value);
		
		}
		
	

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Yesterday", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Yesterday", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Yesterday");
	
			excel.setreport_PassedData("Yesterday", 3, 3, "0.00");
		
			excel.setreport_PassedData("Yesterday", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Yesterday", 3, 3,diff_value);
			excel.setreport_FailedData("Yesterday", 40, 2,diff_value);

		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Yesterday", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Yesterday", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Yesterday");
	
		
			excel.setreport_PassedData("Yesterday", 4, 3, "0.00");
			excel.setreport_PassedData("Yesterday", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);

		
			
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Yesterday", 4, 3,diff_value);
			excel.setreport_FailedData("Yesterday", 41, 2,diff_value);

		}
		
	
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);
	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Yesterday");
		
			excel.setreportData("Yesterday", 2, 2, st);
			excel.setreportData("Yesterday", 3, 2, st);
			excel.setreportData("Yesterday", 4, 2, st);
			
			excel.setreportData("Yesterday", 2, 3, st);
			excel.setreportData("Yesterday", 3, 3, st);
			excel.setreportData("Yesterday", 4, 3, st);
			
			excel.setreportData("Yesterday", 39, 2, st);
			excel.setreportData("Yesterday", 40, 2, st);
			excel.setreportData("Yesterday", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	

	}
}
@Then("Verify Department Sale Report Availble for Last N Days or Not")
public void verifyDepartmentSaleReportAvailbleForLastNDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for Last N days");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
//		//Verify Donut Chart screen
//		repts.Verify_Donut_Chart_Screen_TopSales();
//		
//		//Verify Bars Chart Screen
//		repts.Verify_Bars_Chart_Screen_TopSales();
//		
//		//Verify Sales By Hours
//		repts.Verify_Sales_byHours_Chart_Screen();
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Last N days", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Last N days", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Last 'N' Days");
	
			excel.setreport_PassedData("Last N days", 2, 3, "0.00");
			
			excel.setreport_PassedData("Last N days", 39, 2, SaleAmount+"`");
			
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
	

			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last N days", 2, 3,diff_value);
			excel.setreport_FailedData("Last N days", 39, 2,diff_value);
		
		}
		
		

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Last N days", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Last N days", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Last 'N' Days");
		
		
			excel.setreport_PassedData("Last N days", 3, 3, "0.00");
			excel.setreport_PassedData("Last N days", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last N days", 3, 3,diff_value);
			excel.setreport_FailedData("Last N days", 40, 2,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Last N days", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Last N days", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Last 'N' Days");
	
			excel.setreport_PassedData("Last N days", 4, 3, "0.00");
			excel.setreport_PassedData("Last N days", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last N days", 4, 3,diff_value);
			excel.setreport_FailedData("Last N days", 41, 2,diff_value);
		}
		
	
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);

	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Last N days");
		
			excel.setreportData("Last N days", 2, 2, st);
			excel.setreportData("Last N days", 3, 2, st);
			excel.setreportData("Last N days", 4, 2, st);
			
			excel.setreportData("Last N days", 2, 3, st);
			excel.setreportData("Last N days", 3, 3, st);
			excel.setreportData("Last N days", 4, 3, st);
			
			
			excel.setreportData("Last N days", 39, 2, st);
			excel.setreportData("Last N days", 40, 2, st);
			excel.setreportData("Last N days", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	
	}
}
@Then("Verify Department Sale Report Availble for This Week or Not")
public void verifyDepartmentSaleReportAvailbleForThisWeekOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for This Week");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
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
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("This Week", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("This Week", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for This Week");
	
			excel.setreport_PassedData("This Week", 2, 3, "0.00");
			excel.setreport_PassedData("This Week", 39, 2, SaleAmount+"`");
		
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
		
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
			excel.setreport_FailedData("This Week", 2, 3,diff_value);
			excel.setreport_FailedData("This Week", 39, 2,diff_value);
		
		}
		
	

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("This Week", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("This Week", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for This Week");
	
			excel.setreport_PassedData("This Week", 3, 3, "0.00");
			excel.setreport_PassedData("This Week", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
		
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
			excel.setreport_FailedData("This Week", 3, 3,diff_value);
			excel.setreport_FailedData("This Week", 40, 2,diff_value);
		
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("This Week", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("This Week", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for This Week");
	
		
			excel.setreport_PassedData("This Week", 4, 3, "0.00");
			excel.setreport_PassedData("This Week", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
			excel.setreport_FailedData("This Week", 4, 3,diff_value);
			excel.setreport_FailedData("This Week", 41, 2,diff_value);
		}
		
	
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);

	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for This Week");
	
		
			excel.setreportData("This Week", 2, 2, st);
			excel.setreportData("This Week", 3, 2, st);
			excel.setreportData("This Week", 4, 2, st);
			
			excel.setreportData("This Week", 2, 3, st);
			excel.setreportData("This Week", 3, 3, st);
			excel.setreportData("This Week", 4, 3, st);
			
			
			excel.setreportData("This Week", 39, 2, st);
			excel.setreportData("This Week", 40, 2, st);
			excel.setreportData("This Week", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		
	}
}

@Then("Verify Department Sale Report Availble for Last Week or Not")
public void verifyDepartmentSaleReportAvailbleForLastWeekOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for Last Week");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
//		//Verify Donut Chart screen
//		repts.Verify_Donut_Chart_Screen_TopSales();
//		
//		//Verify Bars Chart Screen
//		repts.Verify_Bars_Chart_Screen_TopSales();
//		
//		//Verify Sales By Hours
//		repts.Verify_Sales_byHours_Chart_Screen();
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Last Week", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Last Week", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Last Week");
	

			excel.setreport_PassedData("Last Week", 2, 3, "0.00");
			excel.setreport_PassedData("Last Week", 39, 2, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);

			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last Week", 2, 3,diff_value);
			excel.setreport_FailedData("Last Week", 39, 2,diff_value);

		}
		
	
		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Last Week", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Last Week", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Last Week");
	

			excel.setreport_PassedData("Last Week", 3, 3, "0.00");
			excel.setreport_PassedData("Last Week", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last Week", 3, 3,diff_value);
			excel.setreport_FailedData("Last Week", 40, 2,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Last Week", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Last Week", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Last Week");
		
			excel.setreport_PassedData("Last Week", 4, 3, "0.00");
			excel.setreport_PassedData("Last Week", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last Week", 4, 3,diff_value);
			excel.setreport_FailedData("Last Week", 41, 2,diff_value);
		
		}
		
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);
	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Last Week");
		
			
			excel.setreportData("Last Week", 2, 2, st);
			excel.setreportData("Last Week", 3, 2, st);
			excel.setreportData("Last Week", 4, 2, st);
			
			excel.setreportData("Last Week", 2, 3, st);
			excel.setreportData("Last Week", 3, 3, st);
			excel.setreportData("Last Week", 4, 3, st);
			
			
			excel.setreportData("Last Week", 39, 2, st);
			excel.setreportData("Last Week", 40, 2, st);
			excel.setreportData("Last Week", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	

	}
}

@Then("Verify Department Sale Report Availble for Last Seven Days or Not")
public void verifyDepartmentSaleReportAvailbleForLastSevenDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for Last 7 days");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
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
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Last 7 days", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Last 7 days", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Last 7 days");
	
			excel.setreport_PassedData("Last 7 days", 2, 3, "0.00");
			excel.setreport_PassedData("Last 7 days", 39, 2, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last 7 days", 2, 3,diff_value);
			excel.setreport_FailedData("Last 7 days", 39, 2,diff_value);

		}
		
	

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Last 7 days", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Last 7 days", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Last 7 days");
	
			excel.setreport_PassedData("Last 7 days", 3, 3, "0.00");

			excel.setreport_PassedData("Last 7 days", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last 7 days", 3, 3,diff_value);
			excel.setreport_FailedData("Last 7 days", 40, 2,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Last 7 days", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Last 7 days", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Last 7 days");
	
			excel.setreport_PassedData("Last 7 days", 4, 3, "0.00");
			
			excel.setreport_PassedData("Last 7 days", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last 7 days", 4, 3,diff_value);
			
			excel.setreport_FailedData("Last 7 days", 41, 2,diff_value);
		}
		
	
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);
	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Last 7 days");
	
			excel.setreportData("Last 7 days", 2, 2, st);
			excel.setreportData("Last 7 days", 3, 2, st);
			excel.setreportData("Last 7 days", 4, 2, st);
			
			excel.setreportData("Last 7 days", 2, 3, st);
			excel.setreportData("Last 7 days", 3, 3, st);
			excel.setreportData("Last 7 days", 4, 3, st);
			
			
			excel.setreportData("Last 7 days", 39, 2, st);
			excel.setreportData("Last 7 days", 40, 2, st);
			excel.setreportData("Last 7 days", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	

	}
}

@Then("Verify Department Sale Report Availble for This Month or Not")
public void verifyDepartmentSaleReportAvailbleForThisMonthOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for This month");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
//		//Verify Donut Chart screen
//		repts.Verify_Donut_Chart_Screen_TopSales();
//		
//		//Verify Bars Chart Screen
//		repts.Verify_Bars_Chart_Screen_TopSales();
//		
//		//Verify Sales By Hours
//		repts.Verify_Sales_byHours_Chart_Screen();
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("This month", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("This month", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for This month");
	
			excel.setreport_PassedData("This month", 2, 3, "0.00");
			excel.setreport_PassedData("This month", 39, 2, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("This month", 2, 3,diff_value);
			
			excel.setreport_FailedData("This month", 39, 2,diff_value);
		}
		
	

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("This month", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("This month", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for This month");
	
			excel.setreport_PassedData("This month", 3, 3, "0.00");
			
			excel.setreport_PassedData("This month", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("This month", 3, 3,diff_value);
			excel.setreport_FailedData("This month", 40, 2,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("This month", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("This month", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for This month");
	
			excel.setreport_PassedData("This month", 4, 3, "0.00");
			excel.setreport_PassedData("This month", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("This month", 4, 3,diff_value);
			excel.setreport_FailedData("This month", 41, 2,diff_value);
		}
		
	
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);

	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for This month");
		
		
			excel.setreportData("This month", 2, 2, st);
			excel.setreportData("This month", 3, 2, st);
			excel.setreportData("This month", 4, 2, st);
			
			excel.setreportData("This month", 2, 3, st);
			excel.setreportData("This month", 3, 3, st);
			excel.setreportData("This month", 4, 3, st);
			
			
			excel.setreportData("This month", 39, 2, st);
			excel.setreportData("This month", 40, 2, st);
			excel.setreportData("This month", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	
	}
}

@Then("Verify Department Sale Report Availble for Last Month or Not")
public void verifyDepartmentSaleReportAvailbleForLastMonthOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for Last month");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
//		//Verify Donut Chart screen
//		repts.Verify_Donut_Chart_Screen_TopSales();
//		
//		//Verify Bars Chart Screen
//		repts.Verify_Bars_Chart_Screen_TopSales();
//		
//		//Verify Sales By Hours
//		repts.Verify_Sales_byHours_Chart_Screen();
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Last month", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Last month", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Last month");
	
			excel.setreport_PassedData("Last month", 2, 3, "0.00");
			excel.setreport_PassedData("Last month", 39, 2, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last month", 2, 3,diff_value);
			excel.setreport_FailedData("Last month", 39, 2,diff_value);
		}
		
	

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Last month", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Last month", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Last month");
	
			excel.setreport_PassedData("Last month", 3, 3, "0.00");
			
			excel.setreport_PassedData("Last month", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last month", 2, 3,diff_value);
			excel.setreport_FailedData("Last month", 40, 2,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Last month", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Last month", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Last month");
	
			excel.setreport_PassedData("Last month", 4, 3, "0.00");
			excel.setreport_PassedData("Last month", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last month", 4, 3,diff_value);
			excel.setreport_FailedData("Last month", 41, 2,diff_value);
		}
		
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);
	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Last month");
	
			excel.setreportData("Last month", 2, 2, st);
			excel.setreportData("Last month", 3, 2, st);
			excel.setreportData("Last month", 4, 2, st);
			
			excel.setreportData("Last month", 2, 3, st);
			excel.setreportData("Last month", 3, 3, st);
			excel.setreportData("Last month", 4, 3, st);
			
			
			excel.setreportData("Last month", 39, 2, st);
			excel.setreportData("Last month", 40, 2, st);
			excel.setreportData("Last month", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	

	}
}

@Then("Verify Department Sale Report Availble for Last Thirty Days or Not")
public void verifyDepartmentSaleReportAvailbleForLastThirtyDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for Last 30 days");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
//		//Verify Donut Chart screen
//		repts.Verify_Donut_Chart_Screen_TopSales();
//		
//		//Verify Bars Chart Screen
//		repts.Verify_Bars_Chart_Screen_TopSales();
//		
//		//Verify Sales By Hours
//		repts.Verify_Sales_byHours_Chart_Screen();
//		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Last 30 days", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Last 30 days", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Last 30 days");
		
			excel.setreport_PassedData("Last 30 days", 2, 3, "0.00");
			excel.setreport_PassedData("Last 30 days", 39, 2, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last 30 days", 2, 3,diff_value);
			excel.setreport_FailedData("Last 30 days", 39, 2,diff_value);
		}
		
		

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Last 30 days", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Last 30 days", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Last 30 days");
		
			excel.setreport_PassedData("Last 30 days", 3, 3, "0.00");
			excel.setreport_PassedData("Last 30 days", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
	

			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last 30 days", 3, 3,diff_value);
			excel.setreport_FailedData("Last 30 days", 40, 2,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Last 30 days", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Last 30 days", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Last 30 days");
		
			excel.setreport_PassedData("Last 30 days", 4, 3, "0.00");
			excel.setreport_PassedData("Last 30 days", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
	

			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
//			excel.setreportData("Today", 6, 3, diff_value);
//			excel.Highlight_DifferenceValue();
			excel.setreport_FailedData("Last 30 days", 4, 3,diff_value);
			excel.setreport_FailedData("Last 30 days", 41, 2,diff_value);
		}
		
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);

	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Last 30 days");
		
		
			excel.setreportData("Last 30 days", 2, 2, st);
			excel.setreportData("Last 30 days", 3, 2, st);
			excel.setreportData("Last 30 days", 4, 2, st);
			
			excel.setreportData("Last 30 days", 2, 3, st);
			excel.setreportData("Last 30 days", 3, 3, st);
			excel.setreportData("Last 30 days", 4, 3, st);
			
			
			excel.setreportData("Last 30 days", 39, 2, st);
			excel.setreportData("Last 30 days", 40, 2, st);
			excel.setreportData("Last 30 days", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	
	}
}


@Then("Verify Department Sale Report Availble for Specific Date or Not")
public void verifyDepartmentSaleReportAvailbleForSpecificDateOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for Specific Date");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
		//Verify Donut Chart screen
//		repts.Verify_Donut_Chart_Screen_TopSales();
//		
//		//Verify Bars Chart Screen
//		repts.Verify_Bars_Chart_Screen_TopSales();
//		
//		//Verify Sales By Hours
//		repts.Verify_Sales_byHours_Chart_Screen();
//		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Specific Date", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Specific Date", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Specific Date");
	
			excel.setreport_PassedData("Specific Date", 2, 3, "0.00");
			excel.setreport_PassedData("Specific Date", 39, 2, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
		
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
			excel.setreport_FailedData("Specific Date", 2, 3,diff_value);
			excel.setreport_FailedData("Specific Date", 39, 2,diff_value);

		}
		
	

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Specific Date", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Specific Date", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Specific Date");
	
			excel.setreport_PassedData("Specific Date", 3, 3, "0.00");
			excel.setreport_PassedData("Specific Date", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel

			excel.setreport_FailedData("Specific Date", 3, 3,diff_value);
			excel.setreport_FailedData("Specific Date", 40, 2,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Specific Date", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Specific Date", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Specific Date");
		
			excel.setreport_PassedData("Specific Date", 4, 3, "0.00");
			excel.setreport_PassedData("Specific Date", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel

			excel.setreport_FailedData("Specific Date", 4, 3,diff_value);
			excel.setreport_FailedData("Specific Date", 41, 2,diff_value);
		}
		
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);
	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Specific Date");
		
			excel.setreportData("Specific Date", 2, 2, st);
			excel.setreportData("Specific Date", 3, 2, st);
			excel.setreportData("Specific Date", 4, 2, st);
			
			excel.setreportData("Specific Date", 2, 3, st);
			excel.setreportData("Specific Date", 3, 3, st);
			excel.setreportData("Specific Date", 4, 3, st);
			
			
			excel.setreportData("Specific Date", 39, 2, st);
			excel.setreportData("Specific Date", 40, 2, st);
			excel.setreportData("Specific Date", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	

	}
}

@Then("Verify Department Sale Report Availble for Date Range or Not")
public void verifyDepartmentSaleReportAvailbleForDateRangeOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
test.log(LogStatus.PASS, "Sale Report for Department Available for Date Range");
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
//		//Verify Donut Chart screen
//		repts.Verify_Donut_Chart_Screen_TopSales();
//		
//		//Verify Bars Chart Screen
//		repts.Verify_Bars_Chart_Screen_TopSales();
//		
//		//Verify Sales By Hours
//		repts.Verify_Sales_byHours_Chart_Screen();
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);
		
		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();
		
		
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expected_SaleAmt=excel.getData("Date Range", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expected_SaleAmt);
		
		

		Thread.sleep(3000);
		//Get Sale Amount
		String SaleAmount=repts.Sale_NetSales_Amount_SaleReport().getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);
		
		//Export the Sale Amount value to Excel
		excel.setreportData("Date Range", 2, 2, SaleAmount);

		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Department Report is equal to Sale Recap Report for Date Range");

		
			excel.setreport_PassedData("Date Range", 2, 3, "0.00");
			excel.setreport_PassedData("Date Range", 39, 2, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Department Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
		
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
			excel.setreport_FailedData("Date Range", 2, 3,diff_value);
			excel.setreport_FailedData("Date Range", 39, 2,diff_value);

		}
		
	

		//Get the Tax from Sale Recap Report
		String Expected_Tx=excel.getData("Date Range", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expected_Tx);
		
		
		//Get the Tax
		String Tx=repts.Tax_SaleReport().getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);
		
		//Export Tax value to Excel
		excel.setreportData("Date Range", 3, 2, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Department Report is equal to Sale Recap Report for Date Range");
	
			excel.setreport_PassedData("Date Range", 3, 3, "0.00");
			excel.setreport_PassedData("Date Range", 40, 2, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Department Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
	
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
			excel.setreport_FailedData("Date Range", 3, 3,diff_value);
			excel.setreport_FailedData("Date Range", 40, 2,diff_value);

		}
		
		//Get the Discount from Sale Recap Report
		String Expected_Discnt=excel.getData("Date Range", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expected_Discnt);
		
		//Get the Discount
		String Discnt=repts.Discount_SaleReport().getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);
		
		//Export Discount value to Excel
		excel.setreportData("Date Range", 4, 2, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Department Report is equal to Sale Recap Report for Date Range");
	
			excel.setreport_PassedData("Date Range", 4, 3, "0.00");
			excel.setreport_PassedData("Date Range", 41, 2, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Department Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
		
		
			String diff_value=String.valueOf(diff);

			//Export the Sale Amount value to Excel
			excel.setreport_FailedData("Date Range", 4, 3,diff_value);
			excel.setreport_FailedData("Date Range", 41, 2,diff_value);

		}
		
		
		//To Write all the Data to Excel
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
		
		Thread.sleep(3000);
	}
	catch(Exception G)
	{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Department Not Available for Date Range");
		
			excel.setreportData("Date Range", 2, 2, st);
			excel.setreportData("Date Range", 3, 2, st);
			excel.setreportData("Date Range", 4, 2, st);
			

			excel.setreportData("Date Range", 2, 3, st);
			excel.setreportData("Date Range", 3, 3, st);
			excel.setreportData("Date Range", 4, 3, st);
			
			
			excel.setreportData("Date Range", 39, 2, st);
			excel.setreportData("Date Range", 40, 2, st);
			excel.setreportData("Date Range", 41, 2, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
	

	}
}

@Then("Check Top Sales displayed as Donut Chart")
public void checkTopSalesDisplayedAsDonutChart() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	//Verify Donut Chart screen
	repts.Verify_Donut_Chart_Screen_TopSales();
}

@Then("Check Top Sales displayed as Bar Chart")
public void checkTopSalesDisplayedAsBarChart() throws Exception {
    // Write code here that turns the phrase above into concrete actions

	//Verify Bars Chart Screen
	repts.Verify_Bars_Chart_Screen_TopSales();
	
}
@Then("Check Sales By Hour Graph is Displayed")
public void checkSalesByHourGraphIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Verify Sales By Hours
	repts.Verify_Sales_byHours_Chart_Screen();
}



	
}
