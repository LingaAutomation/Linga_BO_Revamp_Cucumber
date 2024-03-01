package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
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

public class Reports_Weekly_Summary_Report 
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
	
	@Given("Open the Reports - Weekly Summary Report home page BaseURL and storeID")
	public void openTheReportsWeeklySummaryReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Menu Item sales report page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/weekly");
	}
	@Given("Verifying the Weekly Summary Report Header Page")
	public void verifyingTheWeeklySummaryReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Menu Item sales report page loeded or not
		repts.Verify_ReportHomePage("WEEKLY SUMMARY");
	}
	
	@Then("Verify Weekly Summary Report Availble for This Week or Not")
	public void verifyWeeklySummaryReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
		Thread.sleep(8000);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("This Week", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
		
		List<WebElement> rowList=driver.findElements(By.xpath("//td[contains(.,'Net Sales')]/../td"));
		String netSales = driver.findElement(By.xpath("//td[contains(.,'Net Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_netSales=Double.parseDouble(netSales);
		
		//Export the net Sale Amount value to Excel
		excel.setreportData("This Week", 2, 18, netSales);
		
		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==Actual_netSales)
		{
			test.log(LogStatus.PASS, "Net Sale Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 2, 19, "0.00");
			excel.setreport_PassedData("This Week", 39, 9, netSales+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-Actual_netSales;
			test.log(LogStatus.FAIL, "Sale Amount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("This Week", 2, 19,diff_value);
			 excel.setreport_FailedData("This Week", 39, 9,diff_value);
		}
		
		//Get the Tax from Sale Recap Report
		String Expeccted_Tax=excel.getData("This Week", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tax);
		
		String Tx = driver.findElement(By.xpath("//td[contains(.,'Total Tax Collected')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_Tx=Double.parseDouble(Tx);
		
		//Export the tax Amount value to Excel
		excel.setreportData("This Week", 3, 18, Tx);
		
		//Check whether the tax Amount value is Equal or not
		if(Expected_Tax==Actual_Tx)
		{
			test.log(LogStatus.PASS, "Tax Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 3, 19, "0.00");
			excel.setreport_PassedData("This Week", 40, 9, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-Actual_Tx;
			test.log(LogStatus.FAIL, "Tax for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the tax Amount value to Excel
			 excel.setreport_FailedData("This Week", 3, 19,diff_value);
			 excel.setreport_FailedData("This Week", 40, 9,diff_value);
		}
		
		//Get the Discount from Sale Recap Report
		String Expeccted_Discount=excel.getData("This Week", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discount);
		
		String Disc = driver.findElement(By.xpath("//td[contains(.,'Discounts')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_Disc=Double.parseDouble(Disc);
		
		//Export the discount Amount value to Excel
		excel.setreportData("This Week", 4, 18, Disc);
		
		//Check whether the discount Amount value is Equal or not
		if(Expected_Discount==Actual_Disc)
		{
			test.log(LogStatus.PASS, "Discount Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 4, 19, "0.00");
			excel.setreport_PassedData("This Week", 41, 9, Disc+"`");
		}
		else
		{
			double diff=Expected_Discount-Actual_Disc;
			test.log(LogStatus.FAIL, "Discount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the discount Amount value to Excel
			 excel.setreport_FailedData("This Week", 4, 19,diff_value);
			 excel.setreport_FailedData("This Week", 41, 9,diff_value);
		}
		
		//Get the Grand Sales from Sale Recap Report
		String Expeccted_GrandSales=excel.getData("This Week", 5, 1).toString().replace(",", "");
		double Expected_GrandSales=Double.parseDouble(Expeccted_GrandSales);
		
		String GrandSales = driver.findElement(By.xpath("//td[contains(.,'Grand Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrandSales=Double.parseDouble(GrandSales);
		
		//Export the Grand Sales Amount value to Excel
		excel.setreportData("This Week", 5, 18, GrandSales);
		
		//Check whether the Grand Sales Amount value is Equal or not
		if(Expected_GrandSales==Actual_GrandSales)
		{
			test.log(LogStatus.PASS, "Grand Sales Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 5, 19, "0.00");
			excel.setreport_PassedData("This Week", 42, 9, GrandSales+"`");
		}
		else
		{
			double diff=Expected_GrandSales-Actual_GrandSales;
			test.log(LogStatus.FAIL, "Grand Sales Amount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Grand Sales Amount value to Excel
			 excel.setreport_FailedData("This Week", 5, 19,diff_value);
			 excel.setreport_FailedData("This Week", 42, 9,diff_value);
		}
		
		//Get the Gross Receipt from Sale Recap Report
		String Expeccted_GrossReceipt=excel.getData("This Week", 6, 1).toString().replace(",", "");
		double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);
		
		String GrossReceipt = driver.findElement(By.xpath("//td[contains(.,'Gross Receipt')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossReceipt=Double.parseDouble(GrossReceipt);
		
		//Export the Gross Receipt Amount value to Excel
		excel.setreportData("This Week", 6, 18, GrossReceipt);
		
		//Check whether the Gross Receipt Amount value is Equal or not
		if(Expected_GrossReceipt==Actual_GrossReceipt)
		{
			test.log(LogStatus.PASS, "Gross Receipt Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 6, 19, "0.00");
			excel.setreport_PassedData("This Week", 43, 9, GrossReceipt+"`");
		}
		else
		{
			double diff=Expected_GrossReceipt-Actual_GrossReceipt;
			test.log(LogStatus.FAIL, "Gross Receipt Amount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Receipt Amount value to Excel
			 excel.setreport_FailedData("This Week", 6, 19,diff_value);
			 excel.setreport_FailedData("This Week", 43, 9,diff_value);
		}
		
		//Get the Gross Sales from Sale Recap Report
		String Expeccted_GrossSales=excel.getData("This Week", 7, 1).toString().replace(",", "");
		double Expected_GrossSales=Double.parseDouble(Expeccted_GrossSales);
		
		String GrossSales = driver.findElement(By.xpath("//td[contains(.,'Gross Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossSales=Double.parseDouble(GrossSales);
		
		//Export the Gross Sales Amount value to Excel
		excel.setreportData("This Week", 7, 18, GrossSales);
		
		//Check whether the Gross Sales Amount value is Equal or not
		if(Expected_GrossSales==Actual_GrossSales)
		{
			test.log(LogStatus.PASS, "Gross Sales Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 7, 19, "0.00");
			excel.setreport_PassedData("This Week", 44, 9, GrossSales+"`");
		}
		else
		{
			double diff=Expected_GrossSales-Actual_GrossSales;
			test.log(LogStatus.FAIL, "Gross Sales Amount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Sales Amount value to Excel
			 excel.setreport_FailedData("This Week", 7, 19,diff_value);
			 excel.setreport_FailedData("This Week", 44, 9,diff_value);
		}
		
		//Get the Tax Exempt from Sale Recap Report
		String Expeccted_TaxExe=excel.getData("This Week", 8, 1).toString().replace(",", "");
		double Expected_TaxExe=Double.parseDouble(Expeccted_TaxExe);
		
		String TaxExe = driver.findElement(By.xpath("//td[contains(.,'Tax Exempt')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_TaxExe=Double.parseDouble(TaxExe);
		
		//Export the Tax Exempt Amount value to Excel
		excel.setreportData("This Week", 8, 18, TaxExe);
		
		//Check whether the Tax Exempt Amount value is Equal or not
		if(Expected_TaxExe==Actual_TaxExe)
		{
			test.log(LogStatus.PASS, "Tax Exempt Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 8, 19, "0.00");
			excel.setreport_PassedData("This Week", 45, 9, TaxExe+"`");
		}
		else
		{
			double diff=Expected_TaxExe-Actual_TaxExe;
			test.log(LogStatus.FAIL, "Tax Exempt Amount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Tax Exempt Amount value to Excel
			 excel.setreport_FailedData("This Week", 8, 19,diff_value);
			 excel.setreport_FailedData("This Week", 45, 9,diff_value);
		}
		
		//Get the Net Void from Sale Recap Report
		String Expeccted_NetVoid=excel.getData("This Week", 9, 1).toString().replace(",", "");
		double Expected_NetVoid=Double.parseDouble(Expeccted_NetVoid);
		
		String NetVoid = driver.findElement(By.xpath("//td[contains(.,'Net Void')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_NetVoid=Double.parseDouble(NetVoid);
		
		//Export the Net Void Amount value to Excel
		excel.setreportData("This Week", 9, 18, NetVoid);
		
		//Check whether the Net Void Amount value is Equal or not
		if(Expected_NetVoid==Actual_NetVoid)
		{
			test.log(LogStatus.PASS, "Net Void Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 9, 19, "0.00");
			excel.setreport_PassedData("This Week", 46, 9, NetVoid+"`");
		}
		else
		{
			double diff=Expected_NetVoid-Actual_NetVoid;
			test.log(LogStatus.FAIL, "Net Void Amount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Net Void Amount value to Excel
			 excel.setreport_FailedData("This Week", 9, 19,diff_value);
			 excel.setreport_FailedData("This Week", 46, 9,diff_value);
		}
		
		//Get the Gross Void from Sale Recap Report
		String Expeccted_GrossVoid=excel.getData("This Week", 10, 1).toString().replace(",", "");
		double Expected_GrossVoid=Double.parseDouble(Expeccted_GrossVoid);
		
		String GrossVoid = driver.findElement(By.xpath("//td[contains(.,'Gross Void')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossVoid=Double.parseDouble(GrossVoid);
		
		//Export the Gross Void Amount value to Excel
		excel.setreportData("This Week", 10, 18, GrossVoid);
		
		//Check whether the Gross Void Amount value is Equal or not
		if(Expected_GrossVoid==Actual_GrossVoid)
		{
			test.log(LogStatus.PASS, "Gross Void Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 10, 19, "0.00");
			excel.setreport_PassedData("This Week", 47, 9, GrossVoid+"`");
		}
		else
		{
			double diff=Expected_GrossVoid-Actual_GrossVoid;
			test.log(LogStatus.FAIL, "Gross Void Amount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Void Amount value to Excel
			 excel.setreport_FailedData("This Week", 10, 19,diff_value);
			 excel.setreport_FailedData("This Week", 47, 9,diff_value);
		}
		
		//Get the Discount Tax from Sale Recap Report
		String Expeccted_DiscTx=excel.getData("This Week", 13, 1).toString().replace(",", "");
		double Expected_DiscTx=Double.parseDouble(Expeccted_DiscTx);
		
		String DiscTx = driver.findElement(By.xpath("//td[contains(.,'Discount Tax')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_DiscTx=Double.parseDouble(DiscTx);
		
		//Export the Discount Tax Amount value to Excel
		excel.setreportData("This Week", 13, 18, DiscTx);
		
		//Check whether the Discount Tax Amount value is Equal or not
		if(Expected_DiscTx==Actual_DiscTx)
		{
			test.log(LogStatus.PASS, "Discount Tax Amount for Weekly Summary Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 13, 19, "0.00");
			excel.setreport_PassedData("This Week", 50, 9, DiscTx+"`");
		}
		else
		{
			double diff=Expected_DiscTx-Actual_DiscTx;
			test.log(LogStatus.FAIL, "Discount Tax Amount for Weekly Summary Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Discount Tax Amount value to Excel
			 excel.setreport_FailedData("This Week", 13, 19,diff_value);
			 excel.setreport_FailedData("This Week", 50, 9,diff_value);
		}
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td/.."));
		for(int i = 1; i <= rows.size();i++) {
			double tot = 0;
			List<WebElement> rows1 = driver.findElements(By.xpath("(//tr/td/..)["+i+"]/td"));
			for(int j = 2; j <= rows1.size()-1; j++) {
				String val = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td["+j+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
				if(val.equals(""))
				{					
				}else {
					//System.out.println("dsd "+val);
					double s = Double.parseDouble(val);
					tot = tot + s;
				}
			}
			String val = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td["+rows1.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
			double s = Double.parseDouble(val);
			String txt = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td[1]")).getText();
			if(tot==s) {	
				test.log(LogStatus.PASS, "Total(All days) of "+txt+" value is equal to the Total value");
			}
			else {
				double diff = s - tot;
				test.log(LogStatus.FAIL, "Total(All days) of "+txt+" value is different to the Total value and the difference is : "+diff);
			}
		}

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);
	}
	@Then("Verify Weekly Summary Report Availble for Last Week or Not")
	public void verifyWeeklySummaryReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);

		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Last Week", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		List<WebElement> rowList=driver.findElements(By.xpath("//td[contains(.,'Net Sales')]/../td"));
		String netSales = driver.findElement(By.xpath("//td[contains(.,'Net Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_netSales=Double.parseDouble(netSales);

		//Export the net Sale Amount value to Excel
		excel.setreportData("Last Week", 2, 18, netSales);

		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==Actual_netSales)
		{
			test.log(LogStatus.PASS, "Net Sale Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 2, 19, "0.00");
			excel.setreport_PassedData("Last Week", 39, 9, netSales+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-Actual_netSales;
			test.log(LogStatus.FAIL, "Sale Amount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last Week", 2, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 39, 9,diff_value);
		}

		//Get the Tax from Sale Recap Report
		String Expeccted_Tax=excel.getData("Last Week", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tax);

		String Tx = driver.findElement(By.xpath("//td[contains(.,'Total Tax Collected')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_Tx=Double.parseDouble(Tx);

		//Export the tax Amount value to Excel
		excel.setreportData("Last Week", 3, 18, Tx);

		//Check whether the tax Amount value is Equal or not
		if(Expected_Tax==Actual_Tx)
		{
			test.log(LogStatus.PASS, "Tax Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 3, 19, "0.00");
			excel.setreport_PassedData("Last Week", 40, 9, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-Actual_Tx;
			test.log(LogStatus.FAIL, "Tax for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the tax Amount value to Excel
			 excel.setreport_FailedData("Last Week", 3, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 40, 9,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discount=excel.getData("Last Week", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discount);

		String Disc = driver.findElement(By.xpath("//td[contains(.,'Discounts')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_Disc=Double.parseDouble(Disc);

		//Export the discount Amount value to Excel
		excel.setreportData("Last Week", 4, 18, Disc);

		//Check whether the discount Amount value is Equal or not
		if(Expected_Discount==Actual_Disc)
		{
			test.log(LogStatus.PASS, "Discount Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 4, 19, "0.00");
			excel.setreport_PassedData("Last Week", 41, 9, Disc+"`");
		}
		else
		{
			double diff=Expected_Discount-Actual_Disc;
			test.log(LogStatus.FAIL, "Discount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the discount Amount value to Excel
			 excel.setreport_FailedData("Last Week", 4, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 41, 9,diff_value);
		}

		//Get the Grand Sales from Sale Recap Report
		String Expeccted_GrandSales=excel.getData("Last Week", 5, 1).toString().replace(",", "");
		double Expected_GrandSales=Double.parseDouble(Expeccted_GrandSales);

		String GrandSales = driver.findElement(By.xpath("//td[contains(.,'Grand Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrandSales=Double.parseDouble(GrandSales);

		//Export the Grand Sales Amount value to Excel
		excel.setreportData("Last Week", 5, 18, GrandSales);

		//Check whether the Grand Sales Amount value is Equal or not
		if(Expected_GrandSales==Actual_GrandSales)
		{
			test.log(LogStatus.PASS, "Grand Sales Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 5, 19, "0.00");
			excel.setreport_PassedData("Last Week", 42, 9, GrandSales+"`");
		}
		else
		{
			double diff=Expected_GrandSales-Actual_GrandSales;
			test.log(LogStatus.FAIL, "Grand Sales Amount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Grand Sales Amount value to Excel
			 excel.setreport_FailedData("Last Week", 5, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 42, 9,diff_value);
		}

		//Get the Gross Receipt from Sale Recap Report
		String Expeccted_GrossReceipt=excel.getData("Last Week", 6, 1).toString().replace(",", "");
		double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);

		String GrossReceipt = driver.findElement(By.xpath("//td[contains(.,'Gross Receipt')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossReceipt=Double.parseDouble(GrossReceipt);

		//Export the Gross Receipt Amount value to Excel
		excel.setreportData("Last Week", 6, 18, GrossReceipt);

		//Check whether the Gross Receipt Amount value is Equal or not
		if(Expected_GrossReceipt==Actual_GrossReceipt)
		{
			test.log(LogStatus.PASS, "Gross Receipt Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 6, 19, "0.00");
			excel.setreport_PassedData("Last Week", 43, 9, GrossReceipt+"`");
		}
		else
		{
			double diff=Expected_GrossReceipt-Actual_GrossReceipt;
			test.log(LogStatus.FAIL, "Gross Receipt Amount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Receipt Amount value to Excel
			 excel.setreport_FailedData("Last Week", 6, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 43, 9,diff_value);
		}

		//Get the Gross Sales from Sale Recap Report
		String Expeccted_GrossSales=excel.getData("Last Week", 7, 1).toString().replace(",", "");
		double Expected_GrossSales=Double.parseDouble(Expeccted_GrossSales);

		String GrossSales = driver.findElement(By.xpath("//td[contains(.,'Gross Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossSales=Double.parseDouble(GrossSales);

		//Export the Gross Sales Amount value to Excel
		excel.setreportData("Last Week", 7, 18, GrossSales);

		//Check whether the Gross Sales Amount value is Equal or not
		if(Expected_GrossSales==Actual_GrossSales)
		{
			test.log(LogStatus.PASS, "Gross Sales Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 7, 19, "0.00");
			excel.setreport_PassedData("Last Week", 44, 9, GrossSales+"`");
		}
		else
		{
			double diff=Expected_GrossSales-Actual_GrossSales;
			test.log(LogStatus.FAIL, "Gross Sales Amount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Sales Amount value to Excel
			 excel.setreport_FailedData("Last Week", 7, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 44, 9,diff_value);
		}

		//Get the Tax Exempt from Sale Recap Report
		String Expeccted_TaxExe=excel.getData("Last Week", 8, 1).toString().replace(",", "");
		double Expected_TaxExe=Double.parseDouble(Expeccted_TaxExe);

		String TaxExe = driver.findElement(By.xpath("//td[contains(.,'Tax Exempt')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_TaxExe=Double.parseDouble(TaxExe);

		//Export the Tax Exempt Amount value to Excel
		excel.setreportData("Last Week", 8, 18, TaxExe);

		//Check whether the Tax Exempt Amount value is Equal or not
		if(Expected_TaxExe==Actual_TaxExe)
		{
			test.log(LogStatus.PASS, "Tax Exempt Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 8, 19, "0.00");
			excel.setreport_PassedData("Last Week", 45, 9, TaxExe+"`");
		}
		else
		{
			double diff=Expected_TaxExe-Actual_TaxExe;
			test.log(LogStatus.FAIL, "Tax Exempt Amount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Tax Exempt Amount value to Excel
			 excel.setreport_FailedData("Last Week", 8, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 45, 9,diff_value);
		}

		//Get the Net Void from Sale Recap Report
		String Expeccted_NetVoid=excel.getData("Last Week", 9, 1).toString().replace(",", "");
		double Expected_NetVoid=Double.parseDouble(Expeccted_NetVoid);

		String NetVoid = driver.findElement(By.xpath("//td[contains(.,'Net Void')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_NetVoid=Double.parseDouble(NetVoid);

		//Export the Net Void Amount value to Excel
		excel.setreportData("Last Week", 9, 18, NetVoid);

		//Check whether the Net Void Amount value is Equal or not
		if(Expected_NetVoid==Actual_NetVoid)
		{
			test.log(LogStatus.PASS, "Net Void Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 9, 19, "0.00");
			excel.setreport_PassedData("Last Week", 46, 9, NetVoid+"`");
		}
		else
		{
			double diff=Expected_NetVoid-Actual_NetVoid;
			test.log(LogStatus.FAIL, "Net Void Amount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Net Void Amount value to Excel
			 excel.setreport_FailedData("Last Week", 9, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 46, 9,diff_value);
		}

		//Get the Gross Void from Sale Recap Report
		String Expeccted_GrossVoid=excel.getData("Last Week", 10, 1).toString().replace(",", "");
		double Expected_GrossVoid=Double.parseDouble(Expeccted_GrossVoid);

		String GrossVoid = driver.findElement(By.xpath("//td[contains(.,'Gross Void')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossVoid=Double.parseDouble(GrossVoid);

		//Export the Gross Void Amount value to Excel
		excel.setreportData("Last Week", 10, 18, GrossVoid);

		//Check whether the Gross Void Amount value is Equal or not
		if(Expected_GrossVoid==Actual_GrossVoid)
		{
			test.log(LogStatus.PASS, "Gross Void Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 10, 19, "0.00");
			excel.setreport_PassedData("Last Week", 47, 9, GrossVoid+"`");
		}
		else
		{
			double diff=Expected_GrossVoid-Actual_GrossVoid;
			test.log(LogStatus.FAIL, "Gross Void Amount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Void Amount value to Excel
			 excel.setreport_FailedData("Last Week", 10, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 47, 9,diff_value);
		}

		//Get the Discount Tax from Sale Recap Report
		String Expeccted_DiscTx=excel.getData("Last Week", 13, 1).toString().replace(",", "");
		double Expected_DiscTx=Double.parseDouble(Expeccted_DiscTx);

		String DiscTx = driver.findElement(By.xpath("//td[contains(.,'Discount Tax')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_DiscTx=Double.parseDouble(DiscTx);

		//Export the Discount Tax Amount value to Excel
		excel.setreportData("Last Week", 13, 18, DiscTx);

		//Check whether the Discount Tax Amount value is Equal or not
		if(Expected_DiscTx==Actual_DiscTx)
		{
			test.log(LogStatus.PASS, "Discount Tax Amount for Weekly Summary Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 13, 19, "0.00");
			excel.setreport_PassedData("Last Week", 50, 9, DiscTx+"`");
		}
		else
		{
			double diff=Expected_DiscTx-Actual_DiscTx;
			test.log(LogStatus.FAIL, "Discount Tax Amount for Weekly Summary Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Discount Tax Amount value to Excel
			 excel.setreport_FailedData("Last Week", 13, 19,diff_value);
			 excel.setreport_FailedData("Last Week", 50, 9,diff_value);
		}



		List<WebElement> rows = driver.findElements(By.xpath("//tr/td/.."));
		for(int i = 1; i <= rows.size();i++) {
			
			double tot = 0;
			List<WebElement> rows1 = driver.findElements(By.xpath("(//tr/td/..)["+i+"]/td"));
			for(int j = 2; j <= rows1.size()-1; j++) {
				String val = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td["+j+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
				if(val.equals(""))
				{
				}else {
					////System.out.println("dsd "+val);
					double s = Double.parseDouble(val);
					tot = tot + s;
				}
			}
			String val = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td["+rows1.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
			//System.out.println("i value is : "+i);
			//System.out.println("Size value is : "+rows1.size());
			double s = Double.parseDouble(val);
			String txt = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td[1]")).getText();
			if(tot==s) {
				test.log(LogStatus.PASS, "Total(All days) of "+txt+" value is equal to the Total value");
			}
			else {
				double diff = s - tot;
				test.log(LogStatus.FAIL, "Total(All days) of "+txt+" value is different to the Total value and the difference is : "+diff);
			}
		}
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			Thread.sleep(3000);
	}
	@Then("Verify Weekly Summary Report Availble for Last Seven Days or Not")
	public void verifyWeeklySummaryReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);

		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Last 7 days", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		List<WebElement> rowList=driver.findElements(By.xpath("//td[contains(.,'Net Sales')]/../td"));
		String netSales = driver.findElement(By.xpath("//td[contains(.,'Net Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_netSales=Double.parseDouble(netSales);

		//Export the net Sale Amount value to Excel
		excel.setreportData("Last 7 days", 2, 18, netSales);

		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==Actual_netSales)
		{
			test.log(LogStatus.PASS, "Net Sale Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 2, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 39, 9, netSales+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-Actual_netSales;
			test.log(LogStatus.FAIL, "Sale Amount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 2, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 39, 9,diff_value);
		}

		//Get the Tax from Sale Recap Report
		String Expeccted_Tax=excel.getData("Last 7 days", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tax);

		String Tx = driver.findElement(By.xpath("//td[contains(.,'Total Tax Collected')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_Tx=Double.parseDouble(Tx);

		//Export the tax Amount value to Excel
		excel.setreportData("Last 7 days", 3, 18, Tx);

		//Check whether the tax Amount value is Equal or not
		if(Expected_Tax==Actual_Tx)
		{
			test.log(LogStatus.PASS, "Tax Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 3, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 40, 9, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-Actual_Tx;
			test.log(LogStatus.FAIL, "Tax for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the tax Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 3, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 40, 9,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discount=excel.getData("Last 7 days", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discount);

		String Disc = driver.findElement(By.xpath("//td[contains(.,'Discounts')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_Disc=Double.parseDouble(Disc);

		//Export the discount Amount value to Excel
		excel.setreportData("Last 7 days", 4, 18, Disc);

		//Check whether the discount Amount value is Equal or not
		if(Expected_Discount==Actual_Disc)
		{
			test.log(LogStatus.PASS, "Discount Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 4, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 41, 9, Disc+"`");
		}
		else
		{
			double diff=Expected_Discount-Actual_Disc;
			test.log(LogStatus.FAIL, "Discount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the discount Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 4, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 41, 9,diff_value);
		}

		//Get the Grand Sales from Sale Recap Report
		String Expeccted_GrandSales=excel.getData("Last 7 days", 5, 1).toString().replace(",", "");
		double Expected_GrandSales=Double.parseDouble(Expeccted_GrandSales);

		String GrandSales = driver.findElement(By.xpath("//td[contains(.,'Grand Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrandSales=Double.parseDouble(GrandSales);

		//Export the Grand Sales Amount value to Excel
		excel.setreportData("Last 7 days", 5, 18, GrandSales);

		//Check whether the Grand Sales Amount value is Equal or not
		if(Expected_GrandSales==Actual_GrandSales)
		{
			test.log(LogStatus.PASS, "Grand Sales Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 5, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 42, 9, GrandSales+"`");
		}
		else
		{
			double diff=Expected_GrandSales-Actual_GrandSales;
			test.log(LogStatus.FAIL, "Grand Sales Amount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Grand Sales Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 5, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 42, 9,diff_value);
		}

		//Get the Gross Receipt from Sale Recap Report
		String Expeccted_GrossReceipt=excel.getData("Last 7 days", 6, 1).toString().replace(",", "");
		double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);

		String GrossReceipt = driver.findElement(By.xpath("//td[contains(.,'Gross Receipt')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossReceipt=Double.parseDouble(GrossReceipt);

		//Export the Gross Receipt Amount value to Excel
		excel.setreportData("Last 7 days", 6, 18, GrossReceipt);

		//Check whether the Gross Receipt Amount value is Equal or not
		if(Expected_GrossReceipt==Actual_GrossReceipt)
		{
			test.log(LogStatus.PASS, "Gross Receipt Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 6, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 43, 9, GrossReceipt+"`");
		}
		else
		{
			double diff=Expected_GrossReceipt-Actual_GrossReceipt;
			test.log(LogStatus.FAIL, "Gross Receipt Amount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Receipt Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 6, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 43, 9,diff_value);
		}

		//Get the Gross Sales from Sale Recap Report
		String Expeccted_GrossSales=excel.getData("Last 7 days", 7, 1).toString().replace(",", "");
		double Expected_GrossSales=Double.parseDouble(Expeccted_GrossSales);

		String GrossSales = driver.findElement(By.xpath("//td[contains(.,'Gross Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossSales=Double.parseDouble(GrossSales);

		//Export the Gross Sales Amount value to Excel
		excel.setreportData("Last 7 days", 7, 18, GrossSales);

		//Check whether the Gross Sales Amount value is Equal or not
		if(Expected_GrossSales==Actual_GrossSales)
		{
			test.log(LogStatus.PASS, "Gross Sales Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 7, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 44, 9, GrossSales+"`");
		}
		else
		{
			double diff=Expected_GrossSales-Actual_GrossSales;
			test.log(LogStatus.FAIL, "Gross Sales Amount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Sales Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 7, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 44, 9,diff_value);
		}

		//Get the Tax Exempt from Sale Recap Report
		String Expeccted_TaxExe=excel.getData("Last 7 days", 8, 1).toString().replace(",", "");
		double Expected_TaxExe=Double.parseDouble(Expeccted_TaxExe);

		String TaxExe = driver.findElement(By.xpath("//td[contains(.,'Tax Exempt')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_TaxExe=Double.parseDouble(TaxExe);

		//Export the Tax Exempt Amount value to Excel
		excel.setreportData("Last 7 days", 8, 18, TaxExe);

		//Check whether the Tax Exempt Amount value is Equal or not
		if(Expected_TaxExe==Actual_TaxExe)
		{
			test.log(LogStatus.PASS, "Tax Exempt Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 8, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 45, 9, TaxExe+"`");
		}
		else
		{
			double diff=Expected_TaxExe-Actual_TaxExe;
			test.log(LogStatus.FAIL, "Tax Exempt Amount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Tax Exempt Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 8, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 45, 9,diff_value);
		}

		//Get the Net Void from Sale Recap Report
		String Expeccted_NetVoid=excel.getData("Last 7 days", 9, 1).toString().replace(",", "");
		double Expected_NetVoid=Double.parseDouble(Expeccted_NetVoid);

		String NetVoid = driver.findElement(By.xpath("//td[contains(.,'Net Void')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_NetVoid=Double.parseDouble(NetVoid);

		//Export the Net Void Amount value to Excel
		excel.setreportData("Last 7 days", 9, 18, NetVoid);

		//Check whether the Net Void Amount value is Equal or not
		if(Expected_NetVoid==Actual_NetVoid)
		{
			test.log(LogStatus.PASS, "Net Void Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 9, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 46, 9, NetVoid+"`");
		}
		else
		{
			double diff=Expected_NetVoid-Actual_NetVoid;
			test.log(LogStatus.FAIL, "Net Void Amount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Net Void Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 9, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 46, 9,diff_value);
		}

		//Get the Gross Void from Sale Recap Report
		String Expeccted_GrossVoid=excel.getData("Last 7 days", 10, 1).toString().replace(",", "");
		double Expected_GrossVoid=Double.parseDouble(Expeccted_GrossVoid);

		String GrossVoid = driver.findElement(By.xpath("//td[contains(.,'Gross Void')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossVoid=Double.parseDouble(GrossVoid);

		//Export the Gross Void Amount value to Excel
		excel.setreportData("Last 7 days", 10, 18, GrossVoid);

		//Check whether the Gross Void Amount value is Equal or not
		if(Expected_GrossVoid==Actual_GrossVoid)
		{
			test.log(LogStatus.PASS, "Gross Void Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 10, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 47, 9, GrossVoid+"`");
		}
		else
		{
			double diff=Expected_GrossVoid-Actual_GrossVoid;
			test.log(LogStatus.FAIL, "Gross Void Amount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Void Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 10, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 47, 9,diff_value);
		}

		//Get the Discount Tax from Sale Recap Report
		String Expeccted_DiscTx=excel.getData("Last 7 days", 13, 1).toString().replace(",", "");
		double Expected_DiscTx=Double.parseDouble(Expeccted_DiscTx);

		String DiscTx = driver.findElement(By.xpath("//td[contains(.,'Discount Tax')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_DiscTx=Double.parseDouble(DiscTx);

		//Export the Discount Tax Amount value to Excel
		excel.setreportData("Last 7 days", 13, 18, DiscTx);

		//Check whether the Discount Tax Amount value is Equal or not
		if(Expected_DiscTx==Actual_DiscTx)
		{
			test.log(LogStatus.PASS, "Discount Tax Amount for Weekly Summary Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 13, 19, "0.00");
			excel.setreport_PassedData("Last 7 days", 50, 9, DiscTx+"`");
		}
		else
		{
			double diff=Expected_DiscTx-Actual_DiscTx;
			test.log(LogStatus.FAIL, "Discount Tax Amount for Weekly Summary Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Discount Tax Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 13, 19,diff_value);
			 excel.setreport_FailedData("Last 7 days", 50, 9,diff_value);
		}



		List<WebElement> rows = driver.findElements(By.xpath("//tr/td/.."));
		for(int i = 1; i <= rows.size();i++) {
			double tot = 0;
			List<WebElement> rows1 = driver.findElements(By.xpath("(//tr/td/..)["+i+"]/td"));
			for(int j = 2; j <= rows1.size()-1; j++) {
				String val = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td["+j+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
				if(val.equals(""))
				{
				}else {
					//System.out.println("dsd "+val);
					double s = Double.parseDouble(val);
					tot = tot + s;
				}
			}
			String val = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td["+rows1.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
			double s = Double.parseDouble(val);
			String txt = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td[1]")).getText();
			if(tot==s) {
				test.log(LogStatus.PASS, "Total(All days) of "+txt+" value is equal to the Total value");
			}
			else {
				double diff = s - tot;
				test.log(LogStatus.FAIL, "Total(All days) of "+txt+" value is different to the Total value and the difference is : "+diff);
			}
		}
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			Thread.sleep(3000);
	}
	@Then("Verify Weekly Summary Report Availble for Specific Date or Not")
	public void verifyWeeklySummaryReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);

		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Specific Date", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		List<WebElement> rowList=driver.findElements(By.xpath("//td[contains(.,'Net Sales')]/../td"));
		String netSales = driver.findElement(By.xpath("//td[contains(.,'Net Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_netSales=Double.parseDouble(netSales);

		//Export the net Sale Amount value to Excel
		excel.setreportData("Specific Date", 2, 18, netSales);

		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==Actual_netSales)
		{
			test.log(LogStatus.PASS, "Net Sale Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 2, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 39, 9, netSales+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-Actual_netSales;
			test.log(LogStatus.FAIL, "Sale Amount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 2, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 39, 9,diff_value);
		}

		//Get the Tax from Sale Recap Report
		String Expeccted_Tax=excel.getData("Specific Date", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tax);

		String Tx = driver.findElement(By.xpath("//td[contains(.,'Total Tax Collected')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_Tx=Double.parseDouble(Tx);

		//Export the tax Amount value to Excel
		excel.setreportData("Specific Date", 3, 18, Tx);

		//Check whether the tax Amount value is Equal or not
		if(Expected_Tax==Actual_Tx)
		{
			test.log(LogStatus.PASS, "Tax Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 3, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 40, 9, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-Actual_Tx;
			test.log(LogStatus.FAIL, "Tax for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the tax Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 3, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 40, 9,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discount=excel.getData("Specific Date", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discount);

		String Disc = driver.findElement(By.xpath("//td[contains(.,'Discounts')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_Disc=Double.parseDouble(Disc);

		//Export the discount Amount value to Excel
		excel.setreportData("Specific Date", 4, 18, Disc);

		//Check whether the discount Amount value is Equal or not
		if(Expected_Discount==Actual_Disc)
		{
			test.log(LogStatus.PASS, "Discount Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 4, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 41, 9, Disc+"`");
		}
		else
		{
			double diff=Expected_Discount-Actual_Disc;
			test.log(LogStatus.FAIL, "Discount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the discount Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 4, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 41, 9,diff_value);
		}

		//Get the Grand Sales from Sale Recap Report
		String Expeccted_GrandSales=excel.getData("Specific Date", 5, 1).toString().replace(",", "");
		double Expected_GrandSales=Double.parseDouble(Expeccted_GrandSales);

		String GrandSales = driver.findElement(By.xpath("//td[contains(.,'Grand Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrandSales=Double.parseDouble(GrandSales);

		//Export the Grand Sales Amount value to Excel
		excel.setreportData("Specific Date", 5, 18, GrandSales);

		//Check whether the Grand Sales Amount value is Equal or not
		if(Expected_GrandSales==Actual_GrandSales)
		{
			test.log(LogStatus.PASS, "Grand Sales Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 5, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 42, 9, GrandSales+"`");
		}
		else
		{
			double diff=Expected_GrandSales-Actual_GrandSales;
			test.log(LogStatus.FAIL, "Grand Sales Amount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Grand Sales Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 5, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 42, 9,diff_value);
		}

		//Get the Gross Receipt from Sale Recap Report
		String Expeccted_GrossReceipt=excel.getData("Specific Date", 6, 1).toString().replace(",", "");
		double Expected_GrossReceipt=Double.parseDouble(Expeccted_GrossReceipt);

		String GrossReceipt = driver.findElement(By.xpath("//td[contains(.,'Gross Receipt')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossReceipt=Double.parseDouble(GrossReceipt);

		//Export the Gross Receipt Amount value to Excel
		excel.setreportData("Specific Date", 6, 18, GrossReceipt);

		//Check whether the Gross Receipt Amount value is Equal or not
		if(Expected_GrossReceipt==Actual_GrossReceipt)
		{
			test.log(LogStatus.PASS, "Gross Receipt Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 6, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 43, 9, GrossReceipt+"`");
		}
		else
		{
			double diff=Expected_GrossReceipt-Actual_GrossReceipt;
			test.log(LogStatus.FAIL, "Gross Receipt Amount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Receipt Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 6, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 43, 9,diff_value);
		}

		//Get the Gross Sales from Sale Recap Report
		String Expeccted_GrossSales=excel.getData("Specific Date", 7, 1).toString().replace(",", "");
		double Expected_GrossSales=Double.parseDouble(Expeccted_GrossSales);

		String GrossSales = driver.findElement(By.xpath("//td[contains(.,'Gross Sales')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossSales=Double.parseDouble(GrossSales);

		//Export the Gross Sales Amount value to Excel
		excel.setreportData("Specific Date", 7, 18, GrossSales);

		//Check whether the Gross Sales Amount value is Equal or not
		if(Expected_GrossSales==Actual_GrossSales)
		{
			test.log(LogStatus.PASS, "Gross Sales Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 7, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 44, 9, GrossSales+"`");
		}
		else
		{
			double diff=Expected_GrossSales-Actual_GrossSales;
			test.log(LogStatus.FAIL, "Gross Sales Amount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Sales Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 7, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 44, 9,diff_value);
		}

		//Get the Tax Exempt from Sale Recap Report
		String Expeccted_TaxExe=excel.getData("Specific Date", 8, 1).toString().replace(",", "");
		double Expected_TaxExe=Double.parseDouble(Expeccted_TaxExe);

		String TaxExe = driver.findElement(By.xpath("//td[contains(.,'Tax Exempt')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_TaxExe=Double.parseDouble(TaxExe);

		//Export the Tax Exempt Amount value to Excel
		excel.setreportData("Specific Date", 8, 18, TaxExe);

		//Check whether the Tax Exempt Amount value is Equal or not
		if(Expected_TaxExe==Actual_TaxExe)
		{
			test.log(LogStatus.PASS, "Tax Exempt Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 8, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 45, 9, TaxExe+"`");
		}
		else
		{
			double diff=Expected_TaxExe-Actual_TaxExe;
			test.log(LogStatus.FAIL, "Tax Exempt Amount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Tax Exempt Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 8, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 45, 9,diff_value);
		}

		//Get the Net Void from Sale Recap Report
		String Expeccted_NetVoid=excel.getData("Specific Date", 9, 1).toString().replace(",", "");
		double Expected_NetVoid=Double.parseDouble(Expeccted_NetVoid);

		String NetVoid = driver.findElement(By.xpath("//td[contains(.,'Net Void')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_NetVoid=Double.parseDouble(NetVoid);

		//Export the Net Void Amount value to Excel
		excel.setreportData("Specific Date", 9, 18, NetVoid);

		//Check whether the Net Void Amount value is Equal or not
		if(Expected_NetVoid==Actual_NetVoid)
		{
			test.log(LogStatus.PASS, "Net Void Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 9, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 46, 9, NetVoid+"`");
		}
		else
		{
			double diff=Expected_NetVoid-Actual_NetVoid;
			test.log(LogStatus.FAIL, "Net Void Amount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Net Void Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 9, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 46, 9,diff_value);
		}

		//Get the Gross Void from Sale Recap Report
		String Expeccted_GrossVoid=excel.getData("Specific Date", 10, 1).toString().replace(",", "");
		double Expected_GrossVoid=Double.parseDouble(Expeccted_GrossVoid);

		String GrossVoid = driver.findElement(By.xpath("//td[contains(.,'Gross Void')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_GrossVoid=Double.parseDouble(GrossVoid);

		//Export the Gross Void Amount value to Excel
		excel.setreportData("Specific Date", 10, 18, GrossVoid);

		//Check whether the Gross Void Amount value is Equal or not
		if(Expected_GrossVoid==Actual_GrossVoid)
		{
			test.log(LogStatus.PASS, "Gross Void Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 10, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 47, 9, GrossVoid+"`");
		}
		else
		{
			double diff=Expected_GrossVoid-Actual_GrossVoid;
			test.log(LogStatus.FAIL, "Gross Void Amount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Gross Void Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 10, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 47, 9,diff_value);
		}

		//Get the Discount Tax from Sale Recap Report
		String Expeccted_DiscTx=excel.getData("Specific Date", 13, 1).toString().replace(",", "");
		double Expected_DiscTx=Double.parseDouble(Expeccted_DiscTx);

		String DiscTx = driver.findElement(By.xpath("//td[contains(.,'Discount Tax')]/../td["+rowList.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
		double Actual_DiscTx=Double.parseDouble(DiscTx);

		//Export the Discount Tax Amount value to Excel
		excel.setreportData("Specific Date", 13, 18, DiscTx);

		//Check whether the Discount Tax Amount value is Equal or not
		if(Expected_DiscTx==Actual_DiscTx)
		{
			test.log(LogStatus.PASS, "Discount Tax Amount for Weekly Summary Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 13, 19, "0.00");
			excel.setreport_PassedData("Specific Date", 50, 9, DiscTx+"`");
		}
		else
		{
			double diff=Expected_DiscTx-Actual_DiscTx;
			test.log(LogStatus.FAIL, "Discount Tax Amount for Weekly Summary Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Discount Tax Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 13, 19,diff_value);
			 excel.setreport_FailedData("Specific Date", 50, 9,diff_value);
		}



		List<WebElement> rows = driver.findElements(By.xpath("//tr/td/.."));
		for(int i = 1; i <= rows.size();i++) {
			double tot = 0;
			List<WebElement> rows1 = driver.findElements(By.xpath("(//tr/td/..)["+i+"]/td"));
			for(int j = 2; j <= rows1.size()-1; j++) {
				String val = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td["+j+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
				if(val.equals(""))
				{
				}else {
					//System.out.println("dsd "+val);
					double s = Double.parseDouble(val);
					tot = tot + s;
				}
			}
			String val = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td["+rows1.size()+"]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
			double s = Double.parseDouble(val);
			String txt = driver.findElement(By.xpath("(//tr/td/..)["+i+"]/td[1]")).getText();
			if(tot==s) {
				test.log(LogStatus.PASS, "Total(All days) of "+txt+" value is equal to the Total value");
			}
			else {
				double diff = s - tot;
				test.log(LogStatus.FAIL, "Total(All days) of "+txt+" value is different to the Total value and the difference is : "+diff);
			}
		}
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			Thread.sleep(3000);
	}


}
