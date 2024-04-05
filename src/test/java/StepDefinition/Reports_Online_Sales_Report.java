package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class Reports_Online_Sales_Report 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	
	public String st="NA";
	
	//LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	
	@Given("Open the Reports - Online Sales Report home page BaseURL and storeID")
	public void OpenOnlineSalesReportHomePage() throws Exception 
	{
		Thread.sleep(5000);
		//Load the Online Sales page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/online-sales");
	}

	@Given("Verifying the Online Sales Report Header Page")
	public void verifyingTheOnlineSalesReportHeaderPage() 
	{
	 repts.Verify_ReportHomePage("ONLINE SALES");
	}

	@Then("Check Select Source Field is Displayed")
	public void checkSelectSourceFieldIsDisplayed() throws Exception 
	{
		  cmp.Check_Element_or_Text_Displayed(repts.Source_Filed, "Source Field");
	}
	@Then("Check Select OrderType Field is Displayed")
	public void checkSelectOrderTypeFieldIsDisplayed() throws Exception 
	{
		  cmp.Check_Element_or_Text_Displayed(repts.Order_Type, "Order Type");
	}
	@Then("Check Select PaymentType Field is Displayed")
	public void checkSelectPaymentTypeFieldIsDisplayed() throws Exception 
	{
		  cmp.Check_Element_or_Text_Displayed(repts.Payment_Type, "Payment Type");
	}
	@Then("Check CheckNumber Field in Table is Displayed")
	public void checkCheckNumberFieldInTableIsDisplayed() throws Exception
	{
		 cmp.Check_Element_or_Text_Displayed(repts.Check_Number_Field, "Check Number Field");
	}
	@Then("Check OrderRef No Field in Table is Displayed")
	public void checkOrderRefNoFieldInTableIsDisplayed() throws Exception 
	{
		 cmp.Check_Element_or_Text_Displayed(repts.Order_RefNo, "Order RefNo Field");
	}
//	@Then("Check Customer Field in Table is Displayed")
//	public void checkCustomerFieldInTableIsDisplayed() throws Exception
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Customer, "Customer Field");
//	}
//	@Then("Check Transaction Date Field in Table is Displayed")
//	public void checkTransactionDateFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.TransactionDate, "Transaction Date Field");
//
//	}
//	@Then("Check Source Field in Table is Displayed")
//	public void checkSourceFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Source, "Source Field");
//	}
	@Then("Check Created By Field in Table is Displayed")
	public void checkCreatedByFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.CreatedBy, "Created By Field");
	}
	@Then("Check Order Type Field in Table is Displayed")
	public void checkOrderTypeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Order_Type, "Order Type Field");
	}
	@Then("Check Payment Type Field in Table is Displayed")
	public void checkPaymentTypeFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Payment_Type, "Payment Type Field");
	}
//	@Then("Check CC Service Charge Field in Table is Displayed")
//	public void checkCCServiceChargeFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.CC_ServiceCharge, "CC Service Charge Field");
//	}
//	@Then("Check Net Sale Field in Table is Displayed")
//	public void checkNetSaleFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.Net_Sale_Column_Field, "Net Sales Field"); 
//	}
	@Then("Check Driver Tip Field is Displayed")
	public void checkDriverTipFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.DriverTip, "Driver Tip Field"); 
	}
	@Then("Check Gross Receipt Field is Displayed")
	public void checkGrossReceiptFieldIsDisplayed() throws Exception {
		cmp.Check_Element_or_Text_Displayed(repts.GrossReceipt, "Gross Receipt Field"); 
	}

	@Given("I Select the Source as All")
	public void iSelectTheSourceAsAll() throws Exception 
	{
		// cmp.Click_DropDown_withSearchText(repts.Source, "All", "Source selected as All");
		repts.Source_Filed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@id='select-option'])[1]")).click();
	}
	@Given("I Select the Order Type as All")
	public void iSelectTheOrderTypeAsAll() throws Exception 
	{
		 cmp.Click_DropDown_withSearchText(repts.Order_Type, "All", "Order Type selected as All");
	}
	@Given("I Select the Payment Type as All")
	public void iSelectThePaymentTypeAsAll() throws Exception {
		//cmp.Click_DropDown_withSearchText(repts.Payment_Type, "All", "Payment Type selected as All");
		repts.Payment_Type.click();
		Thread.sleep(500);
		if(driver.findElement(By.xpath("(//div[@id='select-option'])[1]")).isSelected()) 
		{
			driver.findElement(By.xpath("(//div[@id='select-option'])[1]")).click();
		}
		else {
		driver.findElement(By.xpath("(//div[@id='select-option'])[1]")).click();
		}
	}
	@Then("Verify Online Sale Report Availble for Today or Not")
	public void verifyOnlineSaleReportAvailbleForTodayOrNot() throws Exception
	{
		for(int i = 1;i<=10;i++){driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);}
		Thread.sleep(1000);
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
//		SelectTheCat(driver);

		
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Today");
			excel.setreportData("Today", 2, 24, st);
			excel.setreportData("Today", 3, 24, st);
			excel.setreportData("Today", 4, 24, st);
			excel.setreportData("Today", 5, 24, st);
			excel.setreportData("Today", 6, 24, st);
			excel.setreportData("Today", 7, 24, st);
			excel.setreportData("Today", 8, 24, st);
			excel.setreportData("Today", 9, 24, st);
			excel.setreportData("Today", 10, 24, st);
			excel.setreportData("Today", 11, 24, st);
			excel.setreportData("Today", 12, 24, st);
			excel.setreportData("Today", 13, 24, st);
			
			excel.setreportData("Today", 2, 25, st);
			excel.setreportData("Today", 3, 25, st);
			excel.setreportData("Today", 4, 25, st);
			excel.setreportData("Today", 5, 25, st);
			excel.setreportData("Today", 6, 25, st);
			excel.setreportData("Today", 7, 25, st);
			excel.setreportData("Today", 8, 25, st);
			excel.setreportData("Today", 9, 25, st);
			excel.setreportData("Today", 10, 25, st);
			excel.setreportData("Today", 11, 25, st);
			excel.setreportData("Today", 12, 25, st);
			excel.setreportData("Today", 13, 25, st);

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
			
			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;
			
			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);
				
				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);
				
				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);
				
				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}
			
			String d = String.valueOf(sumNetSales);
			excel.setreportData("Today", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);		

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Today", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);		

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Today", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);		

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Today", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);		

				
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}

	@Then("Verify Online Sale Report Availble for Yesterday or Not")
	public void verifyOnlineSaleReportAvailbleForYesterdayOrNot() throws Exception {
		for(int i = 1;i<=10;i++){driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);}
		Thread.sleep(1000);
		repts=new ReportsPage();
		cmp=new Common_XPaths();
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);

		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Yesterday");
			excel.setreportData("Yesterday", 2, 24, st);
			excel.setreportData("Yesterday", 3, 24, st);
			excel.setreportData("Yesterday", 4, 24, st);
			excel.setreportData("Yesterday", 5, 24, st);
			excel.setreportData("Yesterday", 6, 24, st);
			excel.setreportData("Yesterday", 7, 24, st);
			excel.setreportData("Yesterday", 8, 24, st);
			excel.setreportData("Yesterday", 9, 24, st);
			excel.setreportData("Yesterday", 10, 24, st);
			excel.setreportData("Yesterday", 11, 24, st);
			excel.setreportData("Yesterday", 12, 24, st);
			excel.setreportData("Yesterday", 13, 24, st);

			excel.setreportData("Yesterday", 2, 25, st);
			excel.setreportData("Yesterday", 3, 25, st);
			excel.setreportData("Yesterday", 4, 25, st);
			excel.setreportData("Yesterday", 5, 25, st);
			excel.setreportData("Yesterday", 6, 25, st);
			excel.setreportData("Yesterday", 7, 25, st);
			excel.setreportData("Yesterday", 8, 25, st);
			excel.setreportData("Yesterday", 9, 25, st);
			excel.setreportData("Yesterday", 10, 25, st);
			excel.setreportData("Yesterday", 11, 25, st);
			excel.setreportData("Yesterday", 12, 25, st);
			excel.setreportData("Yesterday", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("Yesterday", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Yesterday", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Yesterday", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Yesterday", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}

	@Then("Verify Online Sale Report Availble for Last N Days or Not")
	public void verifyOnlineSaleReportAvailbleForLastNDaysOrNot() throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last N days");
			excel.setreportData("Last N days", 2, 24, st);
			excel.setreportData("Last N days", 3, 24, st);
			excel.setreportData("Last N days", 4, 24, st);
			excel.setreportData("Last N days", 5, 24, st);
			excel.setreportData("Last N days", 6, 24, st);
			excel.setreportData("Last N days", 7, 24, st);
			excel.setreportData("Last N days", 8, 24, st);
			excel.setreportData("Last N days", 9, 24, st);
			excel.setreportData("Last N days", 10, 24, st);
			excel.setreportData("Last N days", 11, 24, st);
			excel.setreportData("Last N days", 12, 24, st);
			excel.setreportData("Last N days", 13, 24, st);

			excel.setreportData("Last N days", 2, 25, st);
			excel.setreportData("Last N days", 3, 25, st);
			excel.setreportData("Last N days", 4, 25, st);
			excel.setreportData("Last N days", 5, 25, st);
			excel.setreportData("Last N days", 6, 25, st);
			excel.setreportData("Last N days", 7, 25, st);
			excel.setreportData("Last N days", 8, 25, st);
			excel.setreportData("Last N days", 9, 25, st);
			excel.setreportData("Last N days", 10, 25, st);
			excel.setreportData("Last N days", 11, 25, st);
			excel.setreportData("Last N days", 12, 25, st);
			excel.setreportData("Last N days", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("Last N days", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Last N days", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Last N days", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Last N days", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}

	@Then("Verify Online Sale Report Availble for This Week or Not")
	public void verifyOnlineSaleReportAvailbleForThisWeekOrNot() throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);

		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for This Week");
			excel.setreportData("This Week", 2, 24, st);
			excel.setreportData("This Week", 3, 24, st);
			excel.setreportData("This Week", 4, 24, st);
			excel.setreportData("This Week", 5, 24, st);
			excel.setreportData("This Week", 6, 24, st);
			excel.setreportData("This Week", 7, 24, st);
			excel.setreportData("This Week", 8, 24, st);
			excel.setreportData("This Week", 9, 24, st);
			excel.setreportData("This Week", 10, 24, st);
			excel.setreportData("This Week", 11, 24, st);
			excel.setreportData("This Week", 12, 24, st);
			excel.setreportData("This Week", 13, 24, st);

			excel.setreportData("This Week", 2, 25, st);
			excel.setreportData("This Week", 3, 25, st);
			excel.setreportData("This Week", 4, 25, st);
			excel.setreportData("This Week", 5, 25, st);
			excel.setreportData("This Week", 6, 25, st);
			excel.setreportData("This Week", 7, 25, st);
			excel.setreportData("This Week", 8, 25, st);
			excel.setreportData("This Week", 9, 25, st);
			excel.setreportData("This Week", 10, 25, st);
			excel.setreportData("This Week", 11, 25, st);
			excel.setreportData("This Week", 12, 25, st);
			excel.setreportData("This Week", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("This Week", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("This Week", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("This Week", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("This Week", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Online Sale Report Availble for Last Week or Not")
	public void verifyOnlineSaleReportAvailbleForLastWeekOrNot() throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);

		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last Week");
			excel.setreportData("Last Week", 2, 24, st);
			excel.setreportData("Last Week", 3, 24, st);
			excel.setreportData("Last Week", 4, 24, st);
			excel.setreportData("Last Week", 5, 24, st);
			excel.setreportData("Last Week", 6, 24, st);
			excel.setreportData("Last Week", 7, 24, st);
			excel.setreportData("Last Week", 8, 24, st);
			excel.setreportData("Last Week", 9, 24, st);
			excel.setreportData("Last Week", 10, 24, st);
			excel.setreportData("Last Week", 11, 24, st);
			excel.setreportData("Last Week", 12, 24, st);
			excel.setreportData("Last Week", 13, 24, st);

			excel.setreportData("Last Week", 2, 25, st);
			excel.setreportData("Last Week", 3, 25, st);
			excel.setreportData("Last Week", 4, 25, st);
			excel.setreportData("Last Week", 5, 25, st);
			excel.setreportData("Last Week", 6, 25, st);
			excel.setreportData("Last Week", 7, 25, st);
			excel.setreportData("Last Week", 8, 25, st);
			excel.setreportData("Last Week", 9, 25, st);
			excel.setreportData("Last Week", 10, 25, st);
			excel.setreportData("Last Week", 11, 25, st);
			excel.setreportData("Last Week", 12, 25, st);
			excel.setreportData("Last Week", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("Last Week", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Last Week", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Last Week", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Last Week", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
//	@Given("I Select the Time Period as Last Seven Days")
//	public void iSelectTheTimePeriodAsLastSevenDays() throws Exception {
//		
//
//		//Select Last 7 days
//		repts.Select_Last_7_Days_TimePeriod();
//
//		
//	}
	@Then("Verify Online Sale Report Availble for Last Seven Days or Not")
	public void verifyOnlineSaleReportAvailbleForLastSevenDaysOrNot() throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);
		
		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last 7 days");
			excel.setreportData("Last 7 days", 2, 24, st);
			excel.setreportData("Last 7 days", 3, 24, st);
			excel.setreportData("Last 7 days", 4, 24, st);
			excel.setreportData("Last 7 days", 5, 24, st);
			excel.setreportData("Last 7 days", 6, 24, st);
			excel.setreportData("Last 7 days", 7, 24, st);
			excel.setreportData("Last 7 days", 8, 24, st);
			excel.setreportData("Last 7 days", 9, 24, st);
			excel.setreportData("Last 7 days", 10, 24, st);
			excel.setreportData("Last 7 days", 11, 24, st);
			excel.setreportData("Last 7 days", 12, 24, st);
			excel.setreportData("Last 7 days", 13, 24, st);

			excel.setreportData("Last 7 days", 2, 25, st);
			excel.setreportData("Last 7 days", 3, 25, st);
			excel.setreportData("Last 7 days", 4, 25, st);
			excel.setreportData("Last 7 days", 5, 25, st);
			excel.setreportData("Last 7 days", 6, 25, st);
			excel.setreportData("Last 7 days", 7, 25, st);
			excel.setreportData("Last 7 days", 8, 25, st);
			excel.setreportData("Last 7 days", 9, 25, st);
			excel.setreportData("Last 7 days", 10, 25, st);
			excel.setreportData("Last 7 days", 11, 25, st);
			excel.setreportData("Last 7 days", 12, 25, st);
			excel.setreportData("Last 7 days", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("Last 7 days", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Last 7 days", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Last 7 days", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Last 7 days", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Online Sale Report Availble for This Month or Not")
	public void verifyOnlineSaleReportAvailbleForThisMonthOrNot() throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	
     Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for This month");
			excel.setreportData("This month", 2, 24, st);
			excel.setreportData("This month", 3, 24, st);
			excel.setreportData("This month", 4, 24, st);
			excel.setreportData("This month", 5, 24, st);
			excel.setreportData("This month", 6, 24, st);
			excel.setreportData("This month", 7, 24, st);
			excel.setreportData("This month", 8, 24, st);
			excel.setreportData("This month", 9, 24, st);
			excel.setreportData("This month", 10, 24, st);
			excel.setreportData("This month", 11, 24, st);
			excel.setreportData("This month", 12, 24, st);
			excel.setreportData("This month", 13, 24, st);

			excel.setreportData("This month", 2, 25, st);
			excel.setreportData("This month", 3, 25, st);
			excel.setreportData("This month", 4, 25, st);
			excel.setreportData("This month", 5, 25, st);
			excel.setreportData("This month", 6, 25, st);
			excel.setreportData("This month", 7, 25, st);
			excel.setreportData("This month", 8, 25, st);
			excel.setreportData("This month", 9, 25, st);
			excel.setreportData("This month", 10, 25, st);
			excel.setreportData("This month", 11, 25, st);
			excel.setreportData("This month", 12, 25, st);
			excel.setreportData("This month", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("This month", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("This month", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("This month", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("This month", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Online Sale Report Availble for Last Month or Not")
	public void verifyOnlineSaleReportAvailbleForLastMonthOrNot() throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);


		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last month");
			excel.setreportData("Last month", 2, 24, st);
			excel.setreportData("Last month", 3, 24, st);
			excel.setreportData("Last month", 4, 24, st);
			excel.setreportData("Last month", 5, 24, st);
			excel.setreportData("Last month", 6, 24, st);
			excel.setreportData("Last month", 7, 24, st);
			excel.setreportData("Last month", 8, 24, st);
			excel.setreportData("Last month", 9, 24, st);
			excel.setreportData("Last month", 10, 24, st);
			excel.setreportData("Last month", 11, 24, st);
			excel.setreportData("Last month", 12, 24, st);
			excel.setreportData("Last month", 13, 24, st);

			excel.setreportData("Last month", 2, 25, st);
			excel.setreportData("Last month", 3, 25, st);
			excel.setreportData("Last month", 4, 25, st);
			excel.setreportData("Last month", 5, 25, st);
			excel.setreportData("Last month", 6, 25, st);
			excel.setreportData("Last month", 7, 25, st);
			excel.setreportData("Last month", 8, 25, st);
			excel.setreportData("Last month", 9, 25, st);
			excel.setreportData("Last month", 10, 25, st);
			excel.setreportData("Last month", 11, 25, st);
			excel.setreportData("Last month", 12, 25, st);
			excel.setreportData("Last month", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("Last month", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Last month", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Last month", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Last month", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
//	@Given("I Select the Time Period as Last Thirty Days")
//	public void iSelectTheTimePeriodAsLastThirtyDays() throws Exception {
//		
//
//		//Select Last 30 days
//		repts.Select_Last_30_Days_TimePeriod();
//
//	}
	@Then("Verify Online Sale Report Availble for Last Thirty Days or Not")
	public void verifyOnlineSaleReportAvailbleForLastThirtyDaysOrNot() throws Exception 
	{
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);

		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last 30 days");
			excel.setreportData("Last 30 days", 2, 24, st);
			excel.setreportData("Last 30 days", 3, 24, st);
			excel.setreportData("Last 30 days", 4, 24, st);
			excel.setreportData("Last 30 days", 5, 24, st);
			excel.setreportData("Last 30 days", 6, 24, st);
			excel.setreportData("Last 30 days", 7, 24, st);
			excel.setreportData("Last 30 days", 8, 24, st);
			excel.setreportData("Last 30 days", 9, 24, st);
			excel.setreportData("Last 30 days", 10, 24, st);
			excel.setreportData("Last 30 days", 11, 24, st);
			excel.setreportData("Last 30 days", 12, 24, st);
			excel.setreportData("Last 30 days", 13, 24, st);

			excel.setreportData("Last 30 days", 2, 25, st);
			excel.setreportData("Last 30 days", 3, 25, st);
			excel.setreportData("Last 30 days", 4, 25, st);
			excel.setreportData("Last 30 days", 5, 25, st);
			excel.setreportData("Last 30 days", 6, 25, st);
			excel.setreportData("Last 30 days", 7, 25, st);
			excel.setreportData("Last 30 days", 8, 25, st);
			excel.setreportData("Last 30 days", 9, 25, st);
			excel.setreportData("Last 30 days", 10, 25, st);
			excel.setreportData("Last 30 days", 11, 25, st);
			excel.setreportData("Last 30 days", 12, 25, st);
			excel.setreportData("Last 30 days", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("Last 30 days", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Last 30 days", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Last 30 days", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Last 30 days", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Online Sale Report Availble for Specific Date or Not")
	public void verifyOnlineSaleReportAvailbleForSpecificDateOrNot() throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);


		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Specific Date");
			excel.setreportData("Specific Date", 2, 24, st);
			excel.setreportData("Specific Date", 3, 24, st);
			excel.setreportData("Specific Date", 4, 24, st);
			excel.setreportData("Specific Date", 5, 24, st);
			excel.setreportData("Specific Date", 6, 24, st);
			excel.setreportData("Specific Date", 7, 24, st);
			excel.setreportData("Specific Date", 8, 24, st);
			excel.setreportData("Specific Date", 9, 24, st);
			excel.setreportData("Specific Date", 10, 24, st);
			excel.setreportData("Specific Date", 11, 24, st);
			excel.setreportData("Specific Date", 12, 24, st);
			excel.setreportData("Specific Date", 13, 24, st);

			excel.setreportData("Specific Date", 2, 25, st);
			excel.setreportData("Specific Date", 3, 25, st);
			excel.setreportData("Specific Date", 4, 25, st);
			excel.setreportData("Specific Date", 5, 25, st);
			excel.setreportData("Specific Date", 6, 25, st);
			excel.setreportData("Specific Date", 7, 25, st);
			excel.setreportData("Specific Date", 8, 25, st);
			excel.setreportData("Specific Date", 9, 25, st);
			excel.setreportData("Specific Date", 10, 25, st);
			excel.setreportData("Specific Date", 11, 25, st);
			excel.setreportData("Specific Date", 12, 25, st);
			excel.setreportData("Specific Date", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("Specific Date", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Specific Date", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Specific Date", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Specific Date", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Online Sale Report Availble for Date Range or Not")
	public void verifyOnlineSaleReportAvailbleForDateRangeOrNot() throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		//SelectTheCat(driver);


		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[.='No Online Sales for selected time period']")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Date Range");
			excel.setreportData("Date Range", 2, 24, st);
			excel.setreportData("Date Range", 3, 24, st);
			excel.setreportData("Date Range", 4, 24, st);
			excel.setreportData("Date Range", 5, 24, st);
			excel.setreportData("Date Range", 6, 24, st);
			excel.setreportData("Date Range", 7, 24, st);
			excel.setreportData("Date Range", 8, 24, st);
			excel.setreportData("Date Range", 9, 24, st);
			excel.setreportData("Date Range", 10, 24, st);
			excel.setreportData("Date Range", 11, 24, st);
			excel.setreportData("Date Range", 12, 24, st);
			excel.setreportData("Date Range", 13, 24, st);

			excel.setreportData("Date Range", 2, 25, st);
			excel.setreportData("Date Range", 3, 25, st);
			excel.setreportData("Date Range", 4, 25, st);
			excel.setreportData("Date Range", 5, 25, st);
			excel.setreportData("Date Range", 6, 25, st);
			excel.setreportData("Date Range", 7, 25, st);
			excel.setreportData("Date Range", 8, 25, st);
			excel.setreportData("Date Range", 9, 25, st);
			excel.setreportData("Date Range", 10, 25, st);
			excel.setreportData("Date Range", 11, 25, st);
			excel.setreportData("Date Range", 12, 25, st);
			excel.setreportData("Date Range", 13, 25, st);

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

			List<WebElement> rowList=driver.findElements(By.xpath("//data-grid/div/div/div/div[@class='content-container']/data-grid-row"));
			double sumNetSales = 0;
			double sumDiscount = 0;
			double sumTax = 0;
			double sumGrossReceipt = 0;

			for(int i = 1; i <= rowList.size();i++) {
				String NetSales=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[9]/span")).getText().replace(",", "");
				double NetSales_Amount=Double.parseDouble(NetSales);

				String Discount=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[10]/span")).getText().replace(",", "");
				double Discount_Amount=Double.parseDouble(Discount);

				String Tax=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[11]/span")).getText().replace(",", "");
				double Tax_Amount=Double.parseDouble(Tax);

				String GrossReceipt=driver.findElement(By.xpath("//data-grid/div/div/div["+i+"]/div[@class='content-container']/data-grid-row/div/div[14]/span")).getText().replace(",", "");
				double GrossReceipt_Amount=Double.parseDouble(GrossReceipt);

				sumNetSales = sumNetSales + NetSales_Amount;
				sumDiscount = sumDiscount + Discount_Amount;
				sumTax = sumTax + Tax_Amount;
				sumGrossReceipt = sumGrossReceipt + GrossReceipt_Amount;
			}

			String d = String.valueOf(sumNetSales);
			excel.setreportData("Date Range", 2, 24, d);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Online Sales report Available for the mentioned date totally "+rowList.size()+" orders available and the total Netsale value is : "+sumNetSales);

			String d1 = String.valueOf(sumDiscount);
			excel.setreportData("Date Range", 4, 24, d1);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Discount value is : "+sumDiscount);

			String d2 = String.valueOf(sumTax);
			excel.setreportData("Date Range", 3, 24, d2);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Tax value is : "+sumTax);

			String d3 = String.valueOf(sumGrossReceipt);
			excel.setreportData("Date Range", 6, 24, d3);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total Gross Recipt value is : "+sumGrossReceipt);


			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	
}
