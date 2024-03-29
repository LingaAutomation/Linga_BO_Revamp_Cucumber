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

public class Reports_Modifier_Sale_Report 
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
	
	@Given("Open the Reports - Modifier Sale Report home page BaseURL and storeID")
	public void openTheReportsModifierSaleReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Modifier sales report page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/modifier");
	}
	@Given("Verifying the Modifier Sale Report Header Page")
	public void verifyingTheModifierSaleReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Modifier sales report page loeded or not
		repts.Verify_ReportHomePage("MODIFIER");
	}
	@Then("Check Select Modifier Field is Displayed")
	public void checkSelectModifierFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Modifier_InputBx, "Select Modifier Field");
	}
	@Then("Check Item Name Field in Table is Displayed")
	public void checkItemNameFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Item_Name_Column_Field, "Item Name Column Field");
	}
	@Then("Check Modifier Name Field in Table is Displayed")
	public void checkModifierNameFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Modifier_Name_Column_Field, "Modifier Name Column Field");
	}
	@Given("I Select the Modifier as All")
	public void iSelectTheModifierAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSelection(repts.Modifier_InputBx, "All", "Modifier selected as All");
	}
	@Then("Verify Modifier Sale Report Availble for Today or Not")
	public void verifyModifierSaleReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Today");
			excel.setreportData("Today", 2, 10, st);
			excel.setreportData("Today", 3, 10, st);
			excel.setreportData("Today", 4, 10, st);
			excel.setreportData("Today", 5, 10, st);
			excel.setreportData("Today", 6, 10, st);
			excel.setreportData("Today", 7, 10, st);
			excel.setreportData("Today", 8, 10, st);
			excel.setreportData("Today", 9, 10, st);
			excel.setreportData("Today", 10, 10, st);
			excel.setreportData("Today", 11, 10, st);
			excel.setreportData("Today", 12, 10, st);
			excel.setreportData("Today", 13, 10, st);

			excel.setreportData("Today", 2, 11, st);
			excel.setreportData("Today", 3, 11, st);
			excel.setreportData("Today", 4, 11, st);
			excel.setreportData("Today", 5, 11, st);
			excel.setreportData("Today", 6, 11, st);
			excel.setreportData("Today", 7, 11, st);
			excel.setreportData("Today", 8, 11, st);
			excel.setreportData("Today", 9, 11, st);
			excel.setreportData("Today", 10, 11, st);
			excel.setreportData("Today", 11, 11, st);
			excel.setreportData("Today", 12, 11, st);
			excel.setreportData("Today", 13, 11, st);

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
			/*
			 * String Expeccted_SaleAmt=excel.getData("Today", 2,
			 * 1).toString().replaceAll(",", ""); double
			 * Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			 */
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");
			//double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Today", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Today and the value is : "+SaleAmount);
			//excel.setreport_PassedData("Today", 21, 6, SaleAmount+"`");
			//excel.setreport_PassedData("Today", 21, 6, SaleAmount+"`");
			
			/*
			 * //Check whether the Sale Amount value is Equal or not
			 * if(Expected_SaleAmount==ActualSale_Amount) { test.log(LogStatus.PASS,
			 * "Sale Amount for Modifier Sale Report is equal to Sale Recap Report for Today"
			 * ); excel.setreport_PassedData("Today", 2, 11, "0.00");
			 * excel.setreport_PassedData("Today", 21, 6, SaleAmount+"`"); } else { double
			 * diff=Expected_SaleAmount-ActualSale_Amount; test.log(LogStatus.FAIL,
			 * "Sale Amount for Modifier Sale Report is not equal to Sale Recap Report for Today.The value diff is : "
			 * +diff); String diff_value=String.valueOf(diff); //Export the Sale Amount
			 * value to Excel excel.setreport_FailedData("Today", 2, 11,diff_value);
			 * excel.setreport_FailedData("Today", 21, 6,diff_value); }
			 * 
			 * //Get the Quantity from Sale Recap Report String
			 * Expeccted_Qty=excel.getData("Today", 3, 1).replaceAll(",", ""); double
			 * Expected_Quantity=Double.parseDouble(Expeccted_Qty);
			 */
		
			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Today and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);
			
			//Export Qunatity value to Excel
			//excel.setreportData("Today", 3, 10, Qty);excel.setreport_PassedData("Today", 22, 6, Qty+"`");
			//excel.setreport_PassedData("Today", 22, 6, Qty+"`");
			
			/*
			 * //Check whether the Quantity value is Equal or not
			 * if(Expected_Quantity==ActualQuantity) { test.log(LogStatus.PASS,
			 * "Quantity for Modifier Sale Report is equal to Sale Recap Report for Today");
			 * excel.setreport_PassedData("Today", 3, 11, "0");
			 * excel.setreport_PassedData("Today", 22, 6, Qty+"`"); } else { double
			 * diff=Expected_Quantity-ActualQuantity; test.log(LogStatus.FAIL,
			 * "Quantity for Modifier Sale Report is not equal to Sale Recap Report for Today.The value diff is : "
			 * +diff); String diff_value=String.valueOf(diff); //Export the Sale Amount
			 * value to Excel excel.setreport_FailedData("Today", 3, 11,diff_value);
			 * excel.setreport_FailedData("Today", 22, 6,diff_value); }
			 * 
			 * //Get the Tax from Sale Recap Report String
			 * Expeccted_Tx=excel.getData("Today", 4, 1).replaceAll(",", ""); double
			 * Expected_Tax=Double.parseDouble(Expeccted_Tx);
			 */
			
			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Today", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Today and the value is : "+Tx);
			//excel.setreport_PassedData("Today", 23, 6, Tx+"`");
			//excel.setreport_PassedData("Today", 23, 6, Tx+"`");

			/*
			 * //Check whether the Tax value is Equal or not if(Expected_Tax==ActualTax) {
			 * test.log(LogStatus.PASS,
			 * "Tax for Modifier Sale Report is equal to Sale Recap Report for Today");
			 * excel.setreport_PassedData("Today", 4, 11, "0.00");
			 * excel.setreport_PassedData("Today", 23, 6, Tx+"`"); } else { double
			 * diff=Expected_Tax-ActualTax; test.log(LogStatus.FAIL,
			 * "Tax for Modifier Sale Report is not equal to Sale Recap Report for Today.The value diff is : "
			 * +diff); String diff_value=String.valueOf(diff); //Export the Sale Amount
			 * value to Excel excel.setreport_FailedData("Today", 4, 11,diff_value);
			 * excel.setreport_FailedData("Today", 23, 6,diff_value); }
			 */
						
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for Yesterday or Not")
	public void verifyModifierSaleReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Yesterday");
			excel.setreportData("Yesterday", 2, 10, st);
			excel.setreportData("Yesterday", 3, 10, st);
			excel.setreportData("Yesterday", 4, 10, st);
			excel.setreportData("Yesterday", 5, 10, st);
			excel.setreportData("Yesterday", 6, 10, st);
			excel.setreportData("Yesterday", 7, 10, st);
			excel.setreportData("Yesterday", 8, 10, st);
			excel.setreportData("Yesterday", 9, 10, st);
			excel.setreportData("Yesterday", 10, 10, st);
			excel.setreportData("Yesterday", 11, 10, st);
			excel.setreportData("Yesterday", 12, 10, st);
			excel.setreportData("Yesterday", 13, 10, st);

			excel.setreportData("Yesterday", 2, 11, st);
			excel.setreportData("Yesterday", 3, 11, st);
			excel.setreportData("Yesterday", 4, 11, st);
			excel.setreportData("Yesterday", 5, 11, st);
			excel.setreportData("Yesterday", 6, 11, st);
			excel.setreportData("Yesterday", 7, 11, st);
			excel.setreportData("Yesterday", 8, 11, st);
			excel.setreportData("Yesterday", 9, 11, st);
			excel.setreportData("Yesterday", 10, 11, st);
			excel.setreportData("Yesterday", 11, 11, st);
			excel.setreportData("Yesterday", 12, 11, st);
			excel.setreportData("Yesterday", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("Yesterday", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Yesterday and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Yesterday and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Yesterday", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Yesterday and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for Last N Days or Not")
	public void verifyModifierSaleReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last N days");
			excel.setreportData("Last N days", 2, 10, st);
			excel.setreportData("Last N days", 3, 10, st);
			excel.setreportData("Last N days", 4, 10, st);
			excel.setreportData("Last N days", 5, 10, st);
			excel.setreportData("Last N days", 6, 10, st);
			excel.setreportData("Last N days", 7, 10, st);
			excel.setreportData("Last N days", 8, 10, st);
			excel.setreportData("Last N days", 9, 10, st);
			excel.setreportData("Last N days", 10, 10, st);
			excel.setreportData("Last N days", 11, 10, st);
			excel.setreportData("Last N days", 12, 10, st);
			excel.setreportData("Last N days", 13, 10, st);

			excel.setreportData("Last N days", 2, 11, st);
			excel.setreportData("Last N days", 3, 11, st);
			excel.setreportData("Last N days", 4, 11, st);
			excel.setreportData("Last N days", 5, 11, st);
			excel.setreportData("Last N days", 6, 11, st);
			excel.setreportData("Last N days", 7, 11, st);
			excel.setreportData("Last N days", 8, 11, st);
			excel.setreportData("Last N days", 9, 11, st);
			excel.setreportData("Last N days", 10, 11, st);
			excel.setreportData("Last N days", 11, 11, st);
			excel.setreportData("Last N days", 12, 11, st);
			excel.setreportData("Last N days", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("Last N days", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Last N days and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Last N days and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last N days", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Last N days and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for This Week or Not")
	public void verifyModifierSaleReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for This Week");
			excel.setreportData("This Week", 2, 10, st);
			excel.setreportData("This Week", 3, 10, st);
			excel.setreportData("This Week", 4, 10, st);
			excel.setreportData("This Week", 5, 10, st);
			excel.setreportData("This Week", 6, 10, st);
			excel.setreportData("This Week", 7, 10, st);
			excel.setreportData("This Week", 8, 10, st);
			excel.setreportData("This Week", 9, 10, st);
			excel.setreportData("This Week", 10, 10, st);
			excel.setreportData("This Week", 11, 10, st);
			excel.setreportData("This Week", 12, 10, st);
			excel.setreportData("This Week", 13, 10, st);

			excel.setreportData("This Week", 2, 11, st);
			excel.setreportData("This Week", 3, 11, st);
			excel.setreportData("This Week", 4, 11, st);
			excel.setreportData("This Week", 5, 11, st);
			excel.setreportData("This Week", 6, 11, st);
			excel.setreportData("This Week", 7, 11, st);
			excel.setreportData("This Week", 8, 11, st);
			excel.setreportData("This Week", 9, 11, st);
			excel.setreportData("This Week", 10, 11, st);
			excel.setreportData("This Week", 11, 11, st);
			excel.setreportData("This Week", 12, 11, st);
			excel.setreportData("This Week", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("This Week", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for This Week and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for This Week and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("This Week", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for This Week and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for Last Week or Not")
	public void verifyModifierSaleReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last Week");
			excel.setreportData("Last Week", 2, 10, st);
			excel.setreportData("Last Week", 3, 10, st);
			excel.setreportData("Last Week", 4, 10, st);
			excel.setreportData("Last Week", 5, 10, st);
			excel.setreportData("Last Week", 6, 10, st);
			excel.setreportData("Last Week", 7, 10, st);
			excel.setreportData("Last Week", 8, 10, st);
			excel.setreportData("Last Week", 9, 10, st);
			excel.setreportData("Last Week", 10, 10, st);
			excel.setreportData("Last Week", 11, 10, st);
			excel.setreportData("Last Week", 12, 10, st);
			excel.setreportData("Last Week", 13, 10, st);

			excel.setreportData("Last Week", 2, 11, st);
			excel.setreportData("Last Week", 3, 11, st);
			excel.setreportData("Last Week", 4, 11, st);
			excel.setreportData("Last Week", 5, 11, st);
			excel.setreportData("Last Week", 6, 11, st);
			excel.setreportData("Last Week", 7, 11, st);
			excel.setreportData("Last Week", 8, 11, st);
			excel.setreportData("Last Week", 9, 11, st);
			excel.setreportData("Last Week", 10, 11, st);
			excel.setreportData("Last Week", 11, 11, st);
			excel.setreportData("Last Week", 12, 11, st);
			excel.setreportData("Last Week", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("Last Week", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Last Week and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Last Week and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last Week", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Last Week and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for Last Seven Days or Not")
	public void verifyModifierSaleReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last 7 days");
			excel.setreportData("Last 7 days", 2, 10, st);
			excel.setreportData("Last 7 days", 3, 10, st);
			excel.setreportData("Last 7 days", 4, 10, st);
			excel.setreportData("Last 7 days", 5, 10, st);
			excel.setreportData("Last 7 days", 6, 10, st);
			excel.setreportData("Last 7 days", 7, 10, st);
			excel.setreportData("Last 7 days", 8, 10, st);
			excel.setreportData("Last 7 days", 9, 10, st);
			excel.setreportData("Last 7 days", 10, 10, st);
			excel.setreportData("Last 7 days", 11, 10, st);
			excel.setreportData("Last 7 days", 12, 10, st);
			excel.setreportData("Last 7 days", 13, 10, st);

			excel.setreportData("Last 7 days", 2, 11, st);
			excel.setreportData("Last 7 days", 3, 11, st);
			excel.setreportData("Last 7 days", 4, 11, st);
			excel.setreportData("Last 7 days", 5, 11, st);
			excel.setreportData("Last 7 days", 6, 11, st);
			excel.setreportData("Last 7 days", 7, 11, st);
			excel.setreportData("Last 7 days", 8, 11, st);
			excel.setreportData("Last 7 days", 9, 11, st);
			excel.setreportData("Last 7 days", 10, 11, st);
			excel.setreportData("Last 7 days", 11, 11, st);
			excel.setreportData("Last 7 days", 12, 11, st);
			excel.setreportData("Last 7 days", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("Last 7 days", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Last 7 days and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Last 7 days and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last 7 days", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Last 7 days and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for This Month or Not")
	public void verifyModifierSaleReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for This month");
			excel.setreportData("This month", 2, 10, st);
			excel.setreportData("This month", 3, 10, st);
			excel.setreportData("This month", 4, 10, st);
			excel.setreportData("This month", 5, 10, st);
			excel.setreportData("This month", 6, 10, st);
			excel.setreportData("This month", 7, 10, st);
			excel.setreportData("This month", 8, 10, st);
			excel.setreportData("This month", 9, 10, st);
			excel.setreportData("This month", 10, 10, st);
			excel.setreportData("This month", 11, 10, st);
			excel.setreportData("This month", 12, 10, st);
			excel.setreportData("This month", 13, 10, st);

			excel.setreportData("This month", 2, 11, st);
			excel.setreportData("This month", 3, 11, st);
			excel.setreportData("This month", 4, 11, st);
			excel.setreportData("This month", 5, 11, st);
			excel.setreportData("This month", 6, 11, st);
			excel.setreportData("This month", 7, 11, st);
			excel.setreportData("This month", 8, 11, st);
			excel.setreportData("This month", 9, 11, st);
			excel.setreportData("This month", 10, 11, st);
			excel.setreportData("This month", 11, 11, st);
			excel.setreportData("This month", 12, 11, st);
			excel.setreportData("This month", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("This month", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for This month and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for This month and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("This month", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for This month and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for Last Month or Not")
	public void verifyModifierSaleReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last month");
			excel.setreportData("Last month", 2, 10, st);
			excel.setreportData("Last month", 3, 10, st);
			excel.setreportData("Last month", 4, 10, st);
			excel.setreportData("Last month", 5, 10, st);
			excel.setreportData("Last month", 6, 10, st);
			excel.setreportData("Last month", 7, 10, st);
			excel.setreportData("Last month", 8, 10, st);
			excel.setreportData("Last month", 9, 10, st);
			excel.setreportData("Last month", 10, 10, st);
			excel.setreportData("Last month", 11, 10, st);
			excel.setreportData("Last month", 12, 10, st);
			excel.setreportData("Last month", 13, 10, st);

			excel.setreportData("Last month", 2, 11, st);
			excel.setreportData("Last month", 3, 11, st);
			excel.setreportData("Last month", 4, 11, st);
			excel.setreportData("Last month", 5, 11, st);
			excel.setreportData("Last month", 6, 11, st);
			excel.setreportData("Last month", 7, 11, st);
			excel.setreportData("Last month", 8, 11, st);
			excel.setreportData("Last month", 9, 11, st);
			excel.setreportData("Last month", 10, 11, st);
			excel.setreportData("Last month", 11, 11, st);
			excel.setreportData("Last month", 12, 11, st);
			excel.setreportData("Last month", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("Last month", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Last month and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Last month and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last month", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Last month and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for Last Thirty Days or Not")
	public void verifyModifierSaleReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Last 30 days");
			excel.setreportData("Last 30 days", 2, 10, st);
			excel.setreportData("Last 30 days", 3, 10, st);
			excel.setreportData("Last 30 days", 4, 10, st);
			excel.setreportData("Last 30 days", 5, 10, st);
			excel.setreportData("Last 30 days", 6, 10, st);
			excel.setreportData("Last 30 days", 7, 10, st);
			excel.setreportData("Last 30 days", 8, 10, st);
			excel.setreportData("Last 30 days", 9, 10, st);
			excel.setreportData("Last 30 days", 10, 10, st);
			excel.setreportData("Last 30 days", 11, 10, st);
			excel.setreportData("Last 30 days", 12, 10, st);
			excel.setreportData("Last 30 days", 13, 10, st);

			excel.setreportData("Last 30 days", 2, 11, st);
			excel.setreportData("Last 30 days", 3, 11, st);
			excel.setreportData("Last 30 days", 4, 11, st);
			excel.setreportData("Last 30 days", 5, 11, st);
			excel.setreportData("Last 30 days", 6, 11, st);
			excel.setreportData("Last 30 days", 7, 11, st);
			excel.setreportData("Last 30 days", 8, 11, st);
			excel.setreportData("Last 30 days", 9, 11, st);
			excel.setreportData("Last 30 days", 10, 11, st);
			excel.setreportData("Last 30 days", 11, 11, st);
			excel.setreportData("Last 30 days", 12, 11, st);
			excel.setreportData("Last 30 days", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("Last 30 days", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Last 30 days and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Last 30 days and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Last 30 days", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Last 30 days and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for Specific Date or Not")
	public void verifyModifierSaleReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Specific Date");
			excel.setreportData("Specific Date", 2, 10, st);
			excel.setreportData("Specific Date", 3, 10, st);
			excel.setreportData("Specific Date", 4, 10, st);
			excel.setreportData("Specific Date", 5, 10, st);
			excel.setreportData("Specific Date", 6, 10, st);
			excel.setreportData("Specific Date", 7, 10, st);
			excel.setreportData("Specific Date", 8, 10, st);
			excel.setreportData("Specific Date", 9, 10, st);
			excel.setreportData("Specific Date", 10, 10, st);
			excel.setreportData("Specific Date", 11, 10, st);
			excel.setreportData("Specific Date", 12, 10, st);
			excel.setreportData("Specific Date", 13, 10, st);

			excel.setreportData("Specific Date", 2, 11, st);
			excel.setreportData("Specific Date", 3, 11, st);
			excel.setreportData("Specific Date", 4, 11, st);
			excel.setreportData("Specific Date", 5, 11, st);
			excel.setreportData("Specific Date", 6, 11, st);
			excel.setreportData("Specific Date", 7, 11, st);
			excel.setreportData("Specific Date", 8, 11, st);
			excel.setreportData("Specific Date", 9, 11, st);
			excel.setreportData("Specific Date", 10, 11, st);
			excel.setreportData("Specific Date", 11, 11, st);
			excel.setreportData("Specific Date", 12, 11, st);
			excel.setreportData("Specific Date", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("Specific Date", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Specific Date and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Specific Date and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Specific Date", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Specific Date and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	@Then("Verify Modifier Sale Report Availble for Date Range or Not")
	public void verifyModifierSaleReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Date Range");
			excel.setreportData("Date Range", 2, 10, st);
			excel.setreportData("Date Range", 3, 10, st);
			excel.setreportData("Date Range", 4, 10, st);
			excel.setreportData("Date Range", 5, 10, st);
			excel.setreportData("Date Range", 6, 10, st);
			excel.setreportData("Date Range", 7, 10, st);
			excel.setreportData("Date Range", 8, 10, st);
			excel.setreportData("Date Range", 9, 10, st);
			excel.setreportData("Date Range", 10, 10, st);
			excel.setreportData("Date Range", 11, 10, st);
			excel.setreportData("Date Range", 12, 10, st);
			excel.setreportData("Date Range", 13, 10, st);

			excel.setreportData("Date Range", 2, 11, st);
			excel.setreportData("Date Range", 3, 11, st);
			excel.setreportData("Date Range", 4, 11, st);
			excel.setreportData("Date Range", 5, 11, st);
			excel.setreportData("Date Range", 6, 11, st);
			excel.setreportData("Date Range", 7, 11, st);
			excel.setreportData("Date Range", 8, 11, st);
			excel.setreportData("Date Range", 9, 11, st);
			excel.setreportData("Date Range", 10, 11, st);
			excel.setreportData("Date Range", 11, 11, st);
			excel.setreportData("Date Range", 12, 11, st);
			excel.setreportData("Date Range", 13, 11, st);

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

			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr/div[@class='content-container']/data-grid-row"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[3]/span")).getText().replace(",", "");

			//Export the Sale Amount value to Excel
			excel.setreportData("Date Range", 2, 10, SaleAmount);
			test.log(LogStatus.INFO,"Sale Amount for Modifier Sale Report is displayed for Date Range and the value is : "+SaleAmount);

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[4]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO,"Quantity for Modifier Sale Report is displayed for Date Range and the value is : "+Qty);
			//double ActualQuantity=Double.parseDouble(Qty);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			//double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Date Range", 3, 10, Tx);
			test.log(LogStatus.INFO,"Tax for Modifier Sale Report is displayed for Date Range and the value is : "+Tx);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}
	

	
}
