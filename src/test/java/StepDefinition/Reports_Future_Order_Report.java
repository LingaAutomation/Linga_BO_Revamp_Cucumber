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

public class Reports_Future_Order_Report 
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
	
	@Given("Open the Reports - Future Order Report home page BaseURL and storeID")
	public void OpenFutureOrderReportHomePageBaseURLAndStoreID() throws Exception 
	{
		Thread.sleep(5000);
		//Load the Online Sales page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/future-orders");
	}
	
	@Given("Verifying the Future Order Report Header Page")
	public void VerifyFutureOrderHeader() 
	{
		repts.Verify_ReportHomePage("FUTURE ORDER");
	}

	@Then("Check CheckNumber Field is Displayed")
	public void checkCheckNumberFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.CheckNumber_InputBox, "Check Number Inputbox"); 
	}
	@Then("Check Select OrderDate Field is Displayed")
	public void checkSelectOrderDateFieldIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.Ordered_DateInputBox, "Ordered Date Inputbox"); 
	}
	@Then("Check Select DeliveryDate Filed Is Displayed")
	public void checkSelectDeliveryDateFiledIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Delivered_DateInputBox, "Delivered Date Inputbox"); 
	}
	@Then("Paid Amount Field in Table is Displayed")
	public void paidAmountFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.PaidAmount_Field, "Paid Amount Field"); 
	}
	@Then("Balance Amount Field in Tale is Displayed")
	public void balanceAmountFieldInTaleIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.BalanceAmount_Field, "Balance Amount Field"); 
	}
	@Then("OrderedDate Field in Table is Displayed")
	public void orderedDateFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.OrderedDate_Field, "Ordered Date Field"); 
	}
	@Then("DeliverDate Field in Table is Displayed")
	public void deliverDateFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.DeliveryDate_Field, "Delivery Date Field");
	}
	@Then("Status Field in Table is Displayed")
	public void statusFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Status_Field, "Status Field");
	}

	@Given("I Select Ordered Date")
	public void iSelectOrderedDate() throws Exception 
	{
        repts.Ordered_DateInputBox.click();
      
		 String FromDate = Utility.getProperty("FutureOrderDate");
				
				driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).click();
				String year = FromDate.substring(6,10);
		
				driver.findElement(By.xpath("//div[contains(.,'"+year+"') and contains(@class,'mat-calendar-body-today')]")).click();
						
				String months = FromDate.substring(3,5);
				String month = repts.selectMonth(months);
				
				driver.findElement(By.xpath("//div[contains(.,'"+month+"') and contains(@class,'mat-calendar-body')]")).click();
				
				String days = FromDate.substring(0,2);
				String day = repts.selectDate(days);
				
				driver.findElement(By.xpath("//div[contains(.,'"+day+"') and contains(@class,'mat-calendar-body')]")).click();
				
				//Date_inSpecificDateInputBx.clear();
				Thread.sleep(500);  
	}
	@Given("I Select the Delivery Date")
	public void iSelectTheDeliveryDate() throws Exception 
	{
		Thread.sleep(1000);
		//select the delivery
		repts.Delivered_DateInputBox.click();

		Thread.sleep(500);
		String ToDate = Utility.getProperty("FutureOrderDeliveryDate");
		
		driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).click();	
		String year1 = ToDate.substring(6,10);
		
		driver.findElement(By.xpath("//div[contains(.,'"+year1+"') and contains(@class,'mat-calendar-body-today')]")).click();
				
		String months1 = ToDate.substring(3,5);
		String month1 = repts.selectMonth(months1);
		
		driver.findElement(By.xpath("//div[contains(.,'"+month1+"') and contains(@class,'mat-calendar-body')]")).click();
		
		String days1 = ToDate.substring(0,2);
		String day1 = repts.selectDate(days1);
		
		driver.findElement(By.xpath("//div[contains(.,'"+day1+"') and contains(@class,'mat-calendar-body')]")).click();

		Thread.sleep(500);
	}
	@Then("Verify Future Order Report available for Selected Time Period")
	public void verifyFutureOrderReportAvailableForSelectedTimePeriod() throws Exception
	{
		//ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		

		Thread.sleep(8000);
		try
		{
		if(driver.findElement(By.xpath("//span[contains(.,'No transaction for selected time period')]")).isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Today");
			ut.PassedCaptureScreenshotAsBASE64();
//			excel.setreportData("Today", 2, 22, st);
//			excel.setreportData("Today", 3, 22, st);
//			excel.setreportData("Today", 4, 22, st);
//			excel.setreportData("Today", 5, 22, st);
//			excel.setreportData("Today", 6, 22, st);
//			excel.setreportData("Today", 7, 22, st);
//			excel.setreportData("Today", 8, 22, st);
//			excel.setreportData("Today", 9, 22, st);
//			excel.setreportData("Today", 10, 22, st);
//			excel.setreportData("Today", 11, 22, st);
//			excel.setreportData("Today", 12, 22, st);
//			excel.setreportData("Today", 13, 22, st);
//			
//			excel.setreportData("Today", 2, 23, st);
//			excel.setreportData("Today", 3, 23, st);
//			excel.setreportData("Today", 4, 23, st);
//			excel.setreportData("Today", 5, 23, st);
//			excel.setreportData("Today", 6, 23, st);
//			excel.setreportData("Today", 7, 23, st);
//			excel.setreportData("Today", 8, 23, st);
//			excel.setreportData("Today", 9, 23, st);
//			excel.setreportData("Today", 10, 23, st);
//			excel.setreportData("Today", 11, 23, st);
//			excel.setreportData("Today", 12, 23, st);
//			excel.setreportData("Today", 13, 23, st);
//
//			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			List<WebElement> rowList=driver.findElements(By.xpath("//div/div/div/data-grid-row/div/div[2]/span"));
			
			double paidAmt = 0;
			for(int i = 1; i <= rowList.size();i++) {
				String s = driver.findElement(By.xpath("//div/div["+i+"]/div/data-grid-row/div/div[2]/span")).getText().replaceAll(",", "").replaceAll(" ", "");
				double s1 = Double.parseDouble(s);
				paidAmt = paidAmt + s1;
			}
			String d = String.valueOf(paidAmt);
			test.log(LogStatus.INFO,"Total Paid Amount :"+d);
			//excel.setreportData("Today", 2, 22, d);
			//excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
			test.log(LogStatus.INFO, "Future Order Sale report Available for the mentioned date totally "+rowList.size()+" orders available and the total paid value is : "+paidAmt);		
		}
	}

	@Then("Check CheckNumber Field in FutureOrder Table is Displayed")
	public void checkCheckNumberFieldInFutureOrderIsDisplayed() throws Exception 
	{
		 cmp.Check_Element_or_Text_Displayed(repts.Check_NumberField_FutureOrder, "Check Number Field");
	}

    @Then("Check CheckNumber Input in FutureOrder is Displayed")
    public void CheckCheckNumberInputInFutureOrder() throws Exception 
    {
    	 cmp.Check_Element_or_Text_Displayed(repts.CheckNumber_InputBox, "Check Number InputBox");
    }

	}

