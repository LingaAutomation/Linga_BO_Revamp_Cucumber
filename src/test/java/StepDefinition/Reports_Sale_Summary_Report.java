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

public class Reports_Sale_Summary_Report 
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
	
	@Given("Open the Reports - Sale Summary Report home page BaseURL and storeID")
	public void openTheReportsSaleSummaryReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Sale Summarys report page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/saleSummary");

	}
	@Given("Verifying the Sale Summary Report Header Page")
	public void verifyingTheSaleSummaryReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Sale Summarys report page loeded or not
		repts.Verify_ReportHomePage("SALE SUMMARY");
	}
	@Then("Check Group By Employee Check Box Field is Displayed")
	public void checkGroupByEmployeeCheckBoxFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Element_or_Text_Displayed(repts.Group_By_Employee_CheckBx, "Group By Employee Check Box Field");
	}
	@Then("Check Service Type Field is Displayed")
	public void checkServiceTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Element_or_Text_Displayed(repts.Service_Type_InputBx, "Service Type Field");
	}
	@Then("Check Floor No Field is Displayed")
	public void checkFloorNoFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Element_or_Text_Displayed(repts.Floor_No_InputBx, "Select Floor No Field");
	}
	@Then("Check Table No Field is Displayed")
	public void checkTableNoFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.Check_Element_or_Text_Displayed(repts.Table_No_InputBx, "Select Table No Field");
	}
	@Then("Check Check Number Field in Table is Displayed")
	public void checkCheckNumberFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Check_Number_Column_Field, "Check Number Column Field");
	}
	@Then("Check Customer Field in Table is Displayed")
	public void checkCustomerFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Customer_Column_Field, "Customer Column Field");
	}
	@Then("Check Transaction Date Field in Table is Displayed")
	public void checkTransactionDateFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Transaction_Date_Column_Field, "Transaction Date Column Field");
	}
	@Then("Check Floor No Field in Table is Displayed")
	public void checkFloorNoFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Floor_No_Column_Field, "Floor No Column Field");
	}
	@Then("Check Table No Field in Table is Displayed")
	public void checkTableNoFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Table_No_Column_Field, "Table No Column Field");
	}
	@Then("Check Net Sale Field in Table is Displayed")
	public void checkNetSaleFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Net_Sale_Column_Field, "Net Sale Column Field");
	}
	@Then("Check Total Tax Field in Table is Displayed")
	public void checkTotalTaxFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Total_Tax_Column_Field, "Total Tax Column Field");
	}
	@Then("Check Incl Tax Field in Table is Displayed")
	public void checkInclTaxFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Incl_Tax_Column_Field, "Incl.Tax Column Field");
	}
	@Then("Check CC Service Charge Field in Table is Displayed")
	public void checkCCServiceChargeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.CC_Service_Charge_Column_Field, "CC Service Charge Column Field");
	}
	@Then("Check Gross Receipt Field in Table is Displayed")
	public void checkGrossReceiptFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Gross_Receipt_Column_Field, "Gross Receipt Column Field");
	}
	@Then("Check Closed By Field in Table is Displayed")
	public void checkClosedByFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Closed_By_Column_Field, "Closed By Column Field");
	}
	@Then("Check Closed On Field in Table is Displayed")
	public void checkClosedOnFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Closed_On_Column_Field, "Closed On Column Field");
	}
	
	@Given("I Select the Service Type as Select All")
	public void iSelectTheServiceTypeAsSelectAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Service_Type_InputBx, "Select All", "Select Service Type selected as Select All");
	}
	
	@Given("I Select the Floor No as All")
	public void iSelectTheFloorNoAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearchText(repts.Floor_No_InputBx, "All", "Select Floor No selected as All");
	}
	
	@Given("I Select the Table No as All")
	public void iSelectTheTableNoAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearchText(repts.Table_No_InputBx, "All", "Select Table No selected as All");
	}
	
	@Then("Verify Sale Summary Report Availble for Today or Not")
	public void verifySaleSummaryReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Today");
			excel.setreportData("Today", 2, 20, st);
			excel.setreportData("Today", 3, 20, st);
			excel.setreportData("Today", 4, 20, st);
			excel.setreportData("Today", 6, 20, st);
			
			excel.setreportData("Today", 2, 21, st);	
			excel.setreportData("Today", 3, 21, st);
			excel.setreportData("Today", 4, 21, st);
			excel.setreportData("Today", 6, 21, st);
			
			excel.setreportData("Today", 39, 10, st);
			excel.setreportData("Today", 40, 10, st);
			excel.setreportData("Today", 41, 10, st);
			excel.setreportData("Today", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report Available for Today");
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Today", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);
			
			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);
			
			//Export the Net Sales value to Excel
			excel.setreportData("Today", 2, 20, NetSale);

			
			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Today");
				excel.setreport_PassedData("Today", 2, 21, "0.00");
				excel.setreport_PassedData("Today", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Today", 2, 21,diff_value);
				 excel.setreport_FailedData("Today", 39, 10,diff_value);
			}
			
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Today", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Today", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Today");
				excel.setreport_PassedData("Today", 3, 21, "0.00");
				excel.setreport_PassedData("Today", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Today", 3, 21,diff_value);
				 excel.setreport_FailedData("Today", 40, 10,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Today", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Today", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Today");
				excel.setreport_PassedData("Today", 4, 21, "0.00");
				excel.setreport_PassedData("Today", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Today", 4, 21,diff_value);
				 excel.setreport_FailedData("Today", 41, 10,diff_value);
			}
			
			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Today", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);
		
			
			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);
			
			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Today", 6, 20, GrossReceipt);

			
			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Today");
				excel.setreport_PassedData("Today", 6, 21, "0.00");
				excel.setreport_PassedData("Today", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Today.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Today", 6, 21,diff_value);
				 excel.setreport_FailedData("Today", 43, 10,diff_value);
			}
			
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for Yesterday or Not")
	public void verifySaleSummaryReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Yesterday");
			excel.setreportData("Yesterday", 2, 20, st);
			excel.setreportData("Yesterday", 3, 20, st);
			excel.setreportData("Yesterday", 4, 20, st);
			excel.setreportData("Yesterday", 6, 20, st);

			excel.setreportData("Yesterday", 2, 21, st);
			excel.setreportData("Yesterday", 3, 21, st);
			excel.setreportData("Yesterday", 4, 21, st);
			excel.setreportData("Yesterday", 6, 21, st);

			excel.setreportData("Yesterday", 39, 10, st);
			excel.setreportData("Yesterday", 40, 10, st);
			excel.setreportData("Yesterday", 41, 10, st);
			excel.setreportData("Yesterday", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for Yesterday");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Yesterday", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("Yesterday", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Yesterday");
				excel.setreport_PassedData("Yesterday", 2, 21, "0.00");
				excel.setreport_PassedData("Yesterday", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Yesterday", 2, 21,diff_value);
				 excel.setreport_FailedData("Yesterday", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Yesterday", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Yesterday", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Yesterday");
				excel.setreport_PassedData("Yesterday", 3, 21, "0.00");
				excel.setreport_PassedData("Yesterday", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Yesterday", 3, 21,diff_value);
				 excel.setreport_FailedData("Yesterday", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Yesterday", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Yesterday", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Yesterday");
				excel.setreport_PassedData("Yesterday", 4, 21, "0.00");
				excel.setreport_PassedData("Yesterday", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Yesterday", 4, 21,diff_value);
				 excel.setreport_FailedData("Yesterday", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Yesterday", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Yesterday", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Yesterday");
				excel.setreport_PassedData("Yesterday", 6, 21, "0.00");
				excel.setreport_PassedData("Yesterday", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Yesterday.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Yesterday", 6, 21,diff_value);
				 excel.setreport_FailedData("Yesterday", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for Last N Days or Not")
	public void verifySaleSummaryReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last N days");
			excel.setreportData("Last N days", 2, 20, st);
			excel.setreportData("Last N days", 3, 20, st);
			excel.setreportData("Last N days", 4, 20, st);
			excel.setreportData("Last N days", 6, 20, st);

			excel.setreportData("Last N days", 2, 21, st);
			excel.setreportData("Last N days", 3, 21, st);
			excel.setreportData("Last N days", 4, 21, st);
			excel.setreportData("Last N days", 6, 21, st);

			excel.setreportData("Last N days", 39, 10, st);
			excel.setreportData("Last N days", 40, 10, st);
			excel.setreportData("Last N days", 41, 10, st);
			excel.setreportData("Last N days", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for Last N days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last N days", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("Last N days", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Last N days");
				excel.setreport_PassedData("Last N days", 2, 21, "0.00");
				excel.setreport_PassedData("Last N days", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Last N days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last N days", 2, 21,diff_value);
				 excel.setreport_FailedData("Last N days", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last N days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last N days", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Last N days");
				excel.setreport_PassedData("Last N days", 3, 21, "0.00");
				excel.setreport_PassedData("Last N days", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Last N days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last N days", 3, 21,diff_value);
				 excel.setreport_FailedData("Last N days", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last N days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Last N days", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Last N days");
				excel.setreport_PassedData("Last N days", 4, 21, "0.00");
				excel.setreport_PassedData("Last N days", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Last N days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last N days", 4, 21,diff_value);
				 excel.setreport_FailedData("Last N days", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Last N days", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last N days", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Last N days");
				excel.setreport_PassedData("Last N days", 6, 21, "0.00");
				excel.setreport_PassedData("Last N days", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Last N days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last N days", 6, 21,diff_value);
				 excel.setreport_FailedData("Last N days", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for This Week or Not")
	public void verifySaleSummaryReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for This Week");
			excel.setreportData("This Week", 2, 20, st);
			excel.setreportData("This Week", 3, 20, st);
			excel.setreportData("This Week", 4, 20, st);
			excel.setreportData("This Week", 6, 20, st);

			excel.setreportData("This Week", 2, 21, st);
			excel.setreportData("This Week", 3, 21, st);
			excel.setreportData("This Week", 4, 21, st);
			excel.setreportData("This Week", 6, 21, st);

			excel.setreportData("This Week", 39, 10, st);
			excel.setreportData("This Week", 40, 10, st);
			excel.setreportData("This Week", 41, 10, st);
			excel.setreportData("This Week", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for This Week");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("This Week", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("This Week", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for This Week");
				excel.setreport_PassedData("This Week", 2, 21, "0.00");
				excel.setreport_PassedData("This Week", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("This Week", 2, 21,diff_value);
				 excel.setreport_FailedData("This Week", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("This Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("This Week", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for This Week");
				excel.setreport_PassedData("This Week", 3, 21, "0.00");
				excel.setreport_PassedData("This Week", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("This Week", 3, 21,diff_value);
				 excel.setreport_FailedData("This Week", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("This Week", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("This Week", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for This Week");
				excel.setreport_PassedData("This Week", 4, 21, "0.00");
				excel.setreport_PassedData("This Week", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("This Week", 4, 21,diff_value);
				 excel.setreport_FailedData("This Week", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("This Week", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("This Week", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for This Week");
				excel.setreport_PassedData("This Week", 6, 21, "0.00");
				excel.setreport_PassedData("This Week", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for This Week.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("This Week", 6, 21,diff_value);
				 excel.setreport_FailedData("This Week", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for Last Week or Not")
	public void verifySaleSummaryReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last Week");
			excel.setreportData("Last Week", 2, 20, st);
			excel.setreportData("Last Week", 3, 20, st);
			excel.setreportData("Last Week", 4, 20, st);
			excel.setreportData("Last Week", 6, 20, st);

			excel.setreportData("Last Week", 2, 21, st);
			excel.setreportData("Last Week", 3, 21, st);
			excel.setreportData("Last Week", 4, 21, st);
			excel.setreportData("Last Week", 6, 21, st);

			excel.setreportData("Last Week", 39, 10, st);
			excel.setreportData("Last Week", 40, 10, st);
			excel.setreportData("Last Week", 41, 10, st);
			excel.setreportData("Last Week", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for Last Week");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last Week", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("Last Week", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Last Week");
				excel.setreport_PassedData("Last Week", 2, 21, "0.00");
				excel.setreport_PassedData("Last Week", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last Week", 2, 21,diff_value);
				 excel.setreport_FailedData("Last Week", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last Week", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Last Week");
				excel.setreport_PassedData("Last Week", 3, 21, "0.00");
				excel.setreport_PassedData("Last Week", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last Week", 3, 21,diff_value);
				 excel.setreport_FailedData("Last Week", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last Week", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Last Week", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Last Week");
				excel.setreport_PassedData("Last Week", 4, 21, "0.00");
				excel.setreport_PassedData("Last Week", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last Week", 4, 21,diff_value);
				 excel.setreport_FailedData("Last Week", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Last Week", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last Week", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Last Week");
				excel.setreport_PassedData("Last Week", 6, 21, "0.00");
				excel.setreport_PassedData("Last Week", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Last Week.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last Week", 6, 21,diff_value);
				 excel.setreport_FailedData("Last Week", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for Last Seven Days or Not")
	public void verifySaleSummaryReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last 7 days");
			excel.setreportData("Last 7 days", 2, 20, st);
			excel.setreportData("Last 7 days", 3, 20, st);
			excel.setreportData("Last 7 days", 4, 20, st);
			excel.setreportData("Last 7 days", 6, 20, st);

			excel.setreportData("Last 7 days", 2, 21, st);
			excel.setreportData("Last 7 days", 3, 21, st);
			excel.setreportData("Last 7 days", 4, 21, st);
			excel.setreportData("Last 7 days", 6, 21, st);

			excel.setreportData("Last 7 days", 39, 10, st);
			excel.setreportData("Last 7 days", 40, 10, st);
			excel.setreportData("Last 7 days", 41, 10, st);
			excel.setreportData("Last 7 days", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for Last 7 days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last 7 days", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("Last 7 days", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Last 7 days");
				excel.setreport_PassedData("Last 7 days", 2, 21, "0.00");
				excel.setreport_PassedData("Last 7 days", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last 7 days", 2, 21,diff_value);
				 excel.setreport_FailedData("Last 7 days", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last 7 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last 7 days", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Last 7 days");
				excel.setreport_PassedData("Last 7 days", 3, 21, "0.00");
				excel.setreport_PassedData("Last 7 days", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last 7 days", 3, 21,diff_value);
				 excel.setreport_FailedData("Last 7 days", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last 7 days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Last 7 days", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Last 7 days");
				excel.setreport_PassedData("Last 7 days", 4, 21, "0.00");
				excel.setreport_PassedData("Last 7 days", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last 7 days", 4, 21,diff_value);
				 excel.setreport_FailedData("Last 7 days", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Last 7 days", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last 7 days", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Last 7 days");
				excel.setreport_PassedData("Last 7 days", 6, 21, "0.00");
				excel.setreport_PassedData("Last 7 days", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Last 7 days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last 7 days", 6, 21,diff_value);
				 excel.setreport_FailedData("Last 7 days", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for This Month or Not")
	public void verifySaleSummaryReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for This month");
			excel.setreportData("This month", 2, 20, st);
			excel.setreportData("This month", 3, 20, st);
			excel.setreportData("This month", 4, 20, st);
			excel.setreportData("This month", 6, 20, st);

			excel.setreportData("This month", 2, 21, st);
			excel.setreportData("This month", 3, 21, st);
			excel.setreportData("This month", 4, 21, st);
			excel.setreportData("This month", 6, 21, st);

			excel.setreportData("This month", 39, 10, st);
			excel.setreportData("This month", 40, 10, st);
			excel.setreportData("This month", 41, 10, st);
			excel.setreportData("This month", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for This month");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("This month", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("This month", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for This month");
				excel.setreport_PassedData("This month", 2, 21, "0.00");
				excel.setreport_PassedData("This month", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("This month", 2, 21,diff_value);
				 excel.setreport_FailedData("This month", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("This month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("This month", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for This month");
				excel.setreport_PassedData("This month", 3, 21, "0.00");
				excel.setreport_PassedData("This month", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("This month", 3, 21,diff_value);
				 excel.setreport_FailedData("This month", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("This month", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("This month", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for This month");
				excel.setreport_PassedData("This month", 4, 21, "0.00");
				excel.setreport_PassedData("This month", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("This month", 4, 21,diff_value);
				 excel.setreport_FailedData("This month", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("This month", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("This month", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for This month");
				excel.setreport_PassedData("This month", 6, 21, "0.00");
				excel.setreport_PassedData("This month", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for This month.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("This month", 6, 21,diff_value);
				 excel.setreport_FailedData("This month", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for Last Month or Not")
	public void verifySaleSummaryReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last month");
			excel.setreportData("Last month", 2, 20, st);
			excel.setreportData("Last month", 3, 20, st);
			excel.setreportData("Last month", 4, 20, st);
			excel.setreportData("Last month", 6, 20, st);

			excel.setreportData("Last month", 2, 21, st);
			excel.setreportData("Last month", 3, 21, st);
			excel.setreportData("Last month", 4, 21, st);
			excel.setreportData("Last month", 6, 21, st);

			excel.setreportData("Last month", 39, 10, st);
			excel.setreportData("Last month", 40, 10, st);
			excel.setreportData("Last month", 41, 10, st);
			excel.setreportData("Last month", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for Last month");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last month", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("Last month", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Last month");
				excel.setreport_PassedData("Last month", 2, 21, "0.00");
				excel.setreport_PassedData("Last month", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last month", 2, 21,diff_value);
				 excel.setreport_FailedData("Last month", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last month", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Last month");
				excel.setreport_PassedData("Last month", 3, 21, "0.00");
				excel.setreport_PassedData("Last month", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last month", 3, 21,diff_value);
				 excel.setreport_FailedData("Last month", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last month", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Last month", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Last month");
				excel.setreport_PassedData("Last month", 4, 21, "0.00");
				excel.setreport_PassedData("Last month", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last month", 4, 21,diff_value);
				 excel.setreport_FailedData("Last month", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Last month", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last month", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Last month");
				excel.setreport_PassedData("Last month", 6, 21, "0.00");
				excel.setreport_PassedData("Last month", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Last month.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last month", 6, 21,diff_value);
				 excel.setreport_FailedData("Last month", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for Last Thirty Days or Not")
	public void verifySaleSummaryReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last 30 days");
			excel.setreportData("Last 30 days", 2, 20, st);
			excel.setreportData("Last 30 days", 3, 20, st);
			excel.setreportData("Last 30 days", 4, 20, st);
			excel.setreportData("Last 30 days", 6, 20, st);

			excel.setreportData("Last 30 days", 2, 21, st);
			excel.setreportData("Last 30 days", 3, 21, st);
			excel.setreportData("Last 30 days", 4, 21, st);
			excel.setreportData("Last 30 days", 6, 21, st);

			excel.setreportData("Last 30 days", 39, 10, st);
			excel.setreportData("Last 30 days", 40, 10, st);
			excel.setreportData("Last 30 days", 41, 10, st);
			excel.setreportData("Last 30 days", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for Last 30 days");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Last 30 days", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("Last 30 days", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Last 30 days");
				excel.setreport_PassedData("Last 30 days", 2, 21, "0.00");
				excel.setreport_PassedData("Last 30 days", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last 30 days", 2, 21,diff_value);
				 excel.setreport_FailedData("Last 30 days", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last 30 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last 30 days", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Last 30 days");
				excel.setreport_PassedData("Last 30 days", 3, 21, "0.00");
				excel.setreport_PassedData("Last 30 days", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last 30 days", 3, 21,diff_value);
				 excel.setreport_FailedData("Last 30 days", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Last 30 days", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Last 30 days", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Last 30 days");
				excel.setreport_PassedData("Last 30 days", 4, 21, "0.00");
				excel.setreport_PassedData("Last 30 days", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last 30 days", 4, 21,diff_value);
				 excel.setreport_FailedData("Last 30 days", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Last 30 days", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Last 30 days", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Last 30 days");
				excel.setreport_PassedData("Last 30 days", 6, 21, "0.00");
				excel.setreport_PassedData("Last 30 days", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Last 30 days.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Last 30 days", 6, 21,diff_value);
				 excel.setreport_FailedData("Last 30 days", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for Specific Date or Not")
	public void verifySaleSummaryReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Specific Date");
			excel.setreportData("Specific Date", 2, 20, st);
			excel.setreportData("Specific Date", 3, 20, st);
			excel.setreportData("Specific Date", 4, 20, st);
			excel.setreportData("Specific Date", 6, 20, st);

			excel.setreportData("Specific Date", 2, 21, st);
			excel.setreportData("Specific Date", 3, 21, st);
			excel.setreportData("Specific Date", 4, 21, st);
			excel.setreportData("Specific Date", 6, 21, st);

			excel.setreportData("Specific Date", 39, 10, st);
			excel.setreportData("Specific Date", 40, 10, st);
			excel.setreportData("Specific Date", 41, 10, st);
			excel.setreportData("Specific Date", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for Specific Date");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Specific Date", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("Specific Date", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Specific Date");
				excel.setreport_PassedData("Specific Date", 2, 21, "0.00");
				excel.setreport_PassedData("Specific Date", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Specific Date", 2, 21,diff_value);
				 excel.setreport_FailedData("Specific Date", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Specific Date", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Specific Date", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Specific Date");
				excel.setreport_PassedData("Specific Date", 3, 21, "0.00");
				excel.setreport_PassedData("Specific Date", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Specific Date", 3, 21,diff_value);
				 excel.setreport_FailedData("Specific Date", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Specific Date", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Specific Date", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Specific Date");
				excel.setreport_PassedData("Specific Date", 4, 21, "0.00");
				excel.setreport_PassedData("Specific Date", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Specific Date", 4, 21,diff_value);
				 excel.setreport_FailedData("Specific Date", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Specific Date", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Specific Date", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Specific Date");
				excel.setreport_PassedData("Specific Date", 6, 21, "0.00");
				excel.setreport_PassedData("Specific Date", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Specific Date.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Specific Date", 6, 21,diff_value);
				 excel.setreport_FailedData("Specific Date", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Sale Summary Report Availble for Date Range or Not")
	public void verifySaleSummaryReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'No sale summary for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Date Range");
			excel.setreportData("Date Range", 2, 20, st);
			excel.setreportData("Date Range", 3, 20, st);
			excel.setreportData("Date Range", 4, 20, st);
			excel.setreportData("Date Range", 6, 20, st);

			excel.setreportData("Date Range", 2, 21, st);
			excel.setreportData("Date Range", 3, 21, st);
			excel.setreportData("Date Range", 4, 21, st);
			excel.setreportData("Date Range", 6, 21, st);

			excel.setreportData("Date Range", 39, 10, st);
			excel.setreportData("Date Range", 40, 10, st);
			excel.setreportData("Date Range", 41, 10, st);
			excel.setreportData("Date Range", 43, 10, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{

			test.log(LogStatus.PASS, "Sale Report Available for Date Range");

			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);

			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();


//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//Get the NEt Sales from Sale Recap Report
			String Expeccted_SaleAmt=excel.getData("Date Range", 2, 1).toString().replace(",", "");
			double Expected_NetSale=Double.parseDouble(Expeccted_SaleAmt);

			Thread.sleep(3000);
			//Get Net Sales
			//List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			String NetSale=driver.findElement(By.xpath("//tfoot/tr/td[4]")).getText().replace(",", "");
			double ActualNet_Sale=Double.parseDouble(NetSale);

			//Export the Net Sales value to Excel
			excel.setreportData("Date Range", 2, 20, NetSale);


			//Check whether the Net Sales value is Equal or not
			if(Expected_NetSale==ActualNet_Sale)
			{
				test.log(LogStatus.PASS, "Net Sales for Sale Summary Report is equal to Sale Recap Report for Date Range");
				excel.setreport_PassedData("Date Range", 2, 21, "0.00");
				excel.setreport_PassedData("Date Range", 39, 10, NetSale+"`");
			}
			else
			{
				double diff=Expected_NetSale-ActualNet_Sale;
				test.log(LogStatus.FAIL, "Net Sales for Sale Summary Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Date Range", 2, 21,diff_value);
				 excel.setreport_FailedData("Date Range", 39, 10,diff_value);
			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Date Range", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tfoot/tr/td[5]")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Date Range", 3, 20, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Sale Summary Report is equal to Sale Recap Report for Date Range");
				excel.setreport_PassedData("Date Range", 3, 21, "0.00");
				excel.setreport_PassedData("Date Range", 40, 10, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Sale Summary Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Date Range", 3, 21,diff_value);
				 excel.setreport_FailedData("Date Range", 40, 10,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Date Range", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tfoot/tr/td[8]")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Date Range", 4, 20, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Sale Summary Report is equal to Sale Recap Report for Date Range");
				excel.setreport_PassedData("Date Range", 4, 21, "0.00");
				excel.setreport_PassedData("Date Range", 41, 10, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Sale Summary Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Date Range", 4, 21,diff_value);
				 excel.setreport_FailedData("Date Range", 41, 10,diff_value);
			}

			//Get the Gross Receipt from Sale Recap Report
			String Expeccted_GrossReceipt=excel.getData("Date Range", 6, 1).toString().replace(",", "");
			double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);


			//Get the Gross Receipt
			String GrossReceipt=driver.findElement(By.xpath("//tfoot/tr/td[9]")).getText().replace(",", "");
			double ActualGrossReceipt=Double.parseDouble(GrossReceipt);

			//Export the % Percentage of Sale value to Excel
			excel.setreportData("Date Range", 6, 20, GrossReceipt);


			//Check whether the Gross Receipt value is Equal or not
			if(Expected_GrossReceipt==ActualGrossReceipt)
			{
				test.log(LogStatus.PASS, "Gross Receipt for Sale Summary Report is equal to Sale Recap Report for Date Range");
				excel.setreport_PassedData("Date Range", 6, 21, "0.00");
				excel.setreport_PassedData("Date Range", 43, 10, GrossReceipt+"`");
			}
			else
			{
				double diff=Expected_GrossReceipt-ActualGrossReceipt;
				test.log(LogStatus.FAIL, "Gross Receipt for Sale Summary Report is not equal to Sale Recap Report  for Date Range.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Net Sales value to Excel
				 excel.setreport_FailedData("Date Range", 6, 21,diff_value);
				 excel.setreport_FailedData("Date Range", 43, 10,diff_value);
			}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}






	
}
