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

public class Reports_Menu_Item_Sale_Report 
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
	
	@Given("Open the Reports - Menu Item Sale Report home page BaseURL and storeID")
	public void openTheReportsMenuItemSaleReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Menu Item sales report page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"salesReports/menuItem");
	}
	@Given("Verifying the Menu Item Sale Report Header Page")
	public void verifyingTheMenuItemSaleReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Menu Item sales report page loeded or not
		repts.Verify_ReportHomePage("MENU ITEM");
	}
	@Then("Check Select Menu Item Field is Displayed")
	public void checkSelectMenuItemFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Check_Element_or_Text_Displayed(repts.Menu_Item_InputBx, "Select Menu Item Field");
	}
	@Then("Check Select Serving Level Field is Displayed")
	public void checkSelectServingLevelFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Check_Element_or_Text_Displayed(repts.Serving_Level_InputBx, "Select Serving Level Field");
	}
	@Then("Check Select Price Level Field is Displayed")
	public void checkSelectPriceLevelFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Check_Element_or_Text_Displayed(repts.Price_Level_InputBx, "Select Price Level Field");
	}
	@Then("Check Select Split By Serving Level Check Box Field is Displayed")
	public void checkSelectSplitByServingLevelCheckBoxFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Split_By_Serving_Level_CheckBox, "Split By Serving Level Check Box Field");
	}
	@Then("Check Department Field in Table is Displayed")
	public void checkDepartmentFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Department_Column_Field, "Department Column Field");
	}
	@Then("Check Category Field in Table is Displayed")
	public void checkCategoryFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Category_Column_Field, "Category Column Field");
	}
	@Then("Check SubCategory Field in Table is Displayed")
	public void checkSubCategoryFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.SubCategory_Column_Field, "SubCategory Column Field");
	}
	@Then("Check Price Level Field in Table is Displayed")
	public void checkPriceLevelFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Price_Level_Column_Field, "Price Level Column Field");
	}
	
	@Given("I Select the Menu Item as All")
	public void iSelectTheMenuItemAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Menu_Item_InputBx, "All", "Menu Item selected as All");
	}
	@Given("I Select the Serving Level as All")
	public void iSelectTheServingLevelAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Serving_Level_InputBx, "All", "Serving Level selected as All");
	}
	@Given("I Select the Price as All")
	public void iSelectThePriceAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSelection(repts.Price_Level_InputBx, "All", "Price Level selected as All");

	}
	@Then("Verify Menu Item Sale Report Availble for Today or Not")
	public void verifyMenuItemSaleReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Today");
			excel.setreportData("Today", 2, 8, st);
			excel.setreportData("Today", 3, 8, st);
			excel.setreportData("Today", 4, 8, st);
			excel.setreportData("Today", 5, 8, st);
			excel.setreportData("Today", 6, 8, st);
			excel.setreportData("Today", 7, 8, st);
			excel.setreportData("Today", 8, 8, st);
			excel.setreportData("Today", 9, 8, st);
			excel.setreportData("Today", 10, 8, st);
			excel.setreportData("Today", 11, 8, st);
			excel.setreportData("Today", 12, 8, st);
			excel.setreportData("Today", 13, 8, st);
			
			excel.setreportData("Today", 2, 9, st);
			excel.setreportData("Today", 3, 9, st);
			excel.setreportData("Today", 4, 9, st);
			excel.setreportData("Today", 5, 9, st);
			excel.setreportData("Today", 6, 9, st);
			excel.setreportData("Today", 7, 9, st);
			excel.setreportData("Today", 8, 9, st);
			excel.setreportData("Today", 9, 9, st);
			excel.setreportData("Today", 10, 9, st);
			excel.setreportData("Today", 11, 9, st);
			excel.setreportData("Today", 12, 9, st);
			excel.setreportData("Today", 13, 9, st);
			
			excel.setreportData("Today", 39, 5, st);
			excel.setreportData("Today", 40, 5, st);
			excel.setreportData("Today", 41, 5, st);
			excel.setreportData("Today", 42, 5, st);
			excel.setreportData("Today", 43, 5, st);
			excel.setreportData("Today", 44, 5, st);
			excel.setreportData("Today", 45, 5, st);
			excel.setreportData("Today", 46, 5, st);
			excel.setreportData("Today", 47, 5, st);
			excel.setreportData("Today", 48, 5, st);
			excel.setreportData("Today", 49, 5, st);
			excel.setreportData("Today", 50, 5, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report Available for Today");
	
			
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
			String Expeccted_SaleAmt=excel.getData("Today", 2, 1).toString().replace(",", "");
			double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);
			
			Thread.sleep(3000);
			//Get Sale Amount
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);
			
			//Export the Sale Amount value to Excel
			excel.setreportData("Today", 2, 8, SaleAmount);

			
			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Today");
				excel.setreport_PassedData("Today", 2, 9, "0.00");
				excel.setreport_PassedData("Today", 39, 5, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Sale Amount value to Excel
				 excel.setreport_FailedData("Today", 2, 9,diff_value);
				 excel.setreport_FailedData("Today", 39, 5,diff_value);
			}
			
			//Get the Quantity from Sale Recap Report
			//String Expeccted_Qty=excel.getData("Today", 3, 1).toString().replace(",", "");
			//double Expected_Quantity=Double.parseDouble(Expeccted_Qty);
		
			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			//double ActualQuantity=Double.parseDouble(Qty);
			
			//Export Qunatity value to Excel
			//excel.setreportData("Today", 3, 8, Qty);
			
			
			//Check whether the Quantity value is Equal or not
//			if(Expected_Quantity==ActualQuantity)
//			{
				test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Today and the value is : "+Qty);
//				excel.setreport_PassedData("Today", 3, 9, "0");
//				excel.setreport_PassedData("Today", 22, 5, Qty+"`");
//			}
//			else
//			{
//				double diff=Expected_Quantity-ActualQuantity;
//				test.log(LogStatus.FAIL, "Quantity for Menu Item Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
//				 String diff_value=String.valueOf(diff);
//				 //Export the Sale Amount value to Excel
//				 excel.setreport_FailedData("Today", 3, 9,diff_value);
//				 excel.setreport_FailedData("Today", 22, 5,diff_value);
//			}

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Today", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Export Tax value to Excel
			excel.setreportData("Today", 3, 8, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Today");
				excel.setreport_PassedData("Today", 3, 9, "0.00");
				excel.setreport_PassedData("Today", 40, 5, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Sale Amount value to Excel
				 excel.setreport_FailedData("Today", 3, 9,diff_value);
				 excel.setreport_FailedData("Today", 40, 5,diff_value);
			}
			
			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Today", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);
			
			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);
			
			//Export Discount value to Excel
			excel.setreportData("Today", 4, 8, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Today");
				excel.setreport_PassedData("Today", 4, 9, "0.00");
				excel.setreport_PassedData("Today", 41, 5, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Sale Amount value to Excel
				 excel.setreport_FailedData("Today", 4, 9,diff_value);
				 excel.setreport_FailedData("Today", 41, 5,diff_value);
			}
			
			//Get the % Sale from Sale Recap Report
//			String Expeccted_PerSale=excel.getData("Today", 6, 1).toString().replace(",", "");
//			double Expected_Percentage_ofSale=Double.parseDouble(Expeccted_PerSale);
//		
//			
//			//Get the Percentage of Sale
			String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
//			double ActualPercentage_ofSale=Double.parseDouble(PerSale);
//			
//			//Export the % Percentage of Sale value to Excel
//			excel.setreportData("Today", 6, 8, PerSale);
//
//			
//			//Check whether the % of Sale value is Equal or not
//			if(Expected_Percentage_ofSale==ActualPercentage_ofSale)
//			{
				test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Today and the value is : "+PerSale);
//				excel.setreport_PassedData("Today", 6, 9, "0.00");
//				excel.setreport_PassedData("Today", 25, 5, PerSale+"`");
//			}
//			else
//			{
//				double diff=Expected_Percentage_ofSale-ActualPercentage_ofSale;
//				test.log(LogStatus.FAIL, "% of Sale for Menu Item Sale Report is not equal to Sale Recap Report  for Today.The value diff is : "+diff);
//				 String diff_value=String.valueOf(diff);
//				 //Export the Sale Amount value to Excel
//				 excel.setreport_FailedData("Today", 6, 9,diff_value);
//				 excel.setreport_FailedData("Today", 25, 5,diff_value);
//			}
			
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		
			
			Thread.sleep(3000);

		}
	}
	
	@Then("Verify Menu Item Sale Report Availble for Yesterday or Not")
	public void verifyMenuItemSaleReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report Not Available for Yesterday");
			excel.setreportData("Yesterday", 2, 8, st);
			excel.setreportData("Yesterday", 3, 8, st);
			excel.setreportData("Yesterday", 4, 8, st);
			excel.setreportData("Yesterday", 5, 8, st);
			excel.setreportData("Yesterday", 6, 8, st);
			excel.setreportData("Yesterday", 7, 8, st);
			excel.setreportData("Yesterday", 8, 8, st);
			excel.setreportData("Yesterday", 9, 8, st);
			excel.setreportData("Yesterday", 10, 8, st);
			excel.setreportData("Yesterday", 11, 8, st);
			excel.setreportData("Yesterday", 12, 8, st);
			excel.setreportData("Yesterday", 13, 8, st);

			excel.setreportData("Yesterday", 2, 9, st);
			excel.setreportData("Yesterday", 3, 9, st);
			excel.setreportData("Yesterday", 4, 9, st);
			excel.setreportData("Yesterday", 5, 9, st);
			excel.setreportData("Yesterday", 6, 9, st);
			excel.setreportData("Yesterday", 7, 9, st);
			excel.setreportData("Yesterday", 8, 9, st);
			excel.setreportData("Yesterday", 9, 9, st);
			excel.setreportData("Yesterday", 10, 9, st);
			excel.setreportData("Yesterday", 11, 9, st);
			excel.setreportData("Yesterday", 12, 9, st);
			excel.setreportData("Yesterday", 13, 9, st);

			excel.setreportData("Yesterday", 39, 5, st);
			excel.setreportData("Yesterday", 40, 5, st);
			excel.setreportData("Yesterday", 41, 5, st);
			excel.setreportData("Yesterday", 42, 5, st);
			excel.setreportData("Yesterday", 43, 5, st);
			excel.setreportData("Yesterday", 44, 5, st);
			excel.setreportData("Yesterday", 45, 5, st);
			excel.setreportData("Yesterday", 46, 5, st);
			excel.setreportData("Yesterday", 47, 5, st);
			excel.setreportData("Yesterday", 48, 5, st);
			excel.setreportData("Yesterday", 49, 5, st);
			excel.setreportData("Yesterday", 50, 5, st);
			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
		}
		}
		catch(Exception G)
		{
			test.log(LogStatus.PASS, "Sale Report Available for Yesterday");

			Thread.sleep(2000);
			//Verify Donut Chart screen
			//repts.Verify_Donut_Chart_Screen_TopSales();

			//Verify Bars Chart Screen
			//repts.Verify_Bars_Chart_Screen_TopSales();

			//Verify Sales By Hours
			//repts.Verify_Sales_byHours_Chart_Screen();

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
			List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
			String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
			double ActualSale_Amount=Double.parseDouble(SaleAmount);

			//Export the Sale Amount value to Excel
			excel.setreportData("Yesterday", 2, 8, SaleAmount);


			//Check whether the Sale Amount value is Equal or not
			if(Expected_SaleAmount==ActualSale_Amount)
			{
				test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Yesterday");
				excel.setreport_PassedData("Yesterday", 2, 9, "0.00");
				excel.setreport_PassedData("Yesterday", 39, 5, SaleAmount+"`");
			}
			else
			{
				double diff=Expected_SaleAmount-ActualSale_Amount;
				test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Sale Amount value to Excel
				 excel.setreport_FailedData("Yesterday", 2, 9,diff_value);
				 excel.setreport_FailedData("Yesterday", 39, 5,diff_value);
			}

			//Get the Quantity
			String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
				test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Yesterday and the value is : "+Qty);

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Yesterday", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);

			//Get the Tax
			String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);

			//Export Tax value to Excel
			excel.setreportData("Yesterday", 3, 8, Tx);

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Yesterday");
				excel.setreport_PassedData("Yesterday", 3, 9, "0.00");
				excel.setreport_PassedData("Yesterday", 40, 5, Tx+"`");
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Sale Amount value to Excel
				 excel.setreport_FailedData("Yesterday", 3, 9,diff_value);
				 excel.setreport_FailedData("Yesterday", 40, 5,diff_value);
			}

			//Get the Discount from Sale Recap Report
			String Expeccted_Discnt=excel.getData("Yesterday", 4, 1).toString().replace(",", "");
			double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

			//Get the Discount
			String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
			double ActualDiscount=Double.parseDouble(Discnt);

			//Export Discount value to Excel
			excel.setreportData("Yesterday", 4, 8, Discnt);

			//Check whether the Tax value is Equal or not
			if(Expected_Discount==ActualDiscount)
			{
				test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Yesterday");
				excel.setreport_PassedData("Yesterday", 4, 9, "0.00");
				excel.setreport_PassedData("Yesterday", 41, 5, Discnt+"`");
			}
			else
			{
				double diff=Expected_Discount-ActualDiscount;
				test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
				 String diff_value=String.valueOf(diff);
				 //Export the Sale Amount value to Excel
				 excel.setreport_FailedData("Yesterday", 4, 9,diff_value);
				 excel.setreport_FailedData("Yesterday", 41, 5,diff_value);
			}

			//Get the Percentage of Sale
			String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
				test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Yesterday and the value is : "+PerSale);

			excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


			Thread.sleep(3000);

		}
	}

@Then("Verify Menu Item Sale Report Availble for Last N Days or Not")
public void verifyMenuItemSaleReportAvailbleForLastNDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for Last N days");
		excel.setreportData("Last N days", 2, 8, st);
		excel.setreportData("Last N days", 3, 8, st);
		excel.setreportData("Last N days", 4, 8, st);
		excel.setreportData("Last N days", 5, 8, st);
		excel.setreportData("Last N days", 6, 8, st);
		excel.setreportData("Last N days", 7, 8, st);
		excel.setreportData("Last N days", 8, 8, st);
		excel.setreportData("Last N days", 9, 8, st);
		excel.setreportData("Last N days", 10, 8, st);
		excel.setreportData("Last N days", 11, 8, st);
		excel.setreportData("Last N days", 12, 8, st);
		excel.setreportData("Last N days", 13, 8, st);

		excel.setreportData("Last N days", 2, 9, st);
		excel.setreportData("Last N days", 3, 9, st);
		excel.setreportData("Last N days", 4, 9, st);
		excel.setreportData("Last N days", 5, 9, st);
		excel.setreportData("Last N days", 6, 9, st);
		excel.setreportData("Last N days", 7, 9, st);
		excel.setreportData("Last N days", 8, 9, st);
		excel.setreportData("Last N days", 9, 9, st);
		excel.setreportData("Last N days", 10, 9, st);
		excel.setreportData("Last N days", 11, 9, st);
		excel.setreportData("Last N days", 12, 9, st);
		excel.setreportData("Last N days", 13, 9, st);

		excel.setreportData("Last N days", 39, 5, st);
		excel.setreportData("Last N days", 40, 5, st);
		excel.setreportData("Last N days", 41, 5, st);
		excel.setreportData("Last N days", 42, 5, st);
		excel.setreportData("Last N days", 43, 5, st);
		excel.setreportData("Last N days", 44, 5, st);
		excel.setreportData("Last N days", 45, 5, st);
		excel.setreportData("Last N days", 46, 5, st);
		excel.setreportData("Last N days", 47, 5, st);
		excel.setreportData("Last N days", 48, 5, st);
		excel.setreportData("Last N days", 49, 5, st);
		excel.setreportData("Last N days", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for Last N days");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Last N days", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("Last N days", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Last N days");
			excel.setreport_PassedData("Last N days", 2, 9, "0.00");
			excel.setreport_PassedData("Last N days", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Last N days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last N days", 2, 9,diff_value);
			 excel.setreport_FailedData("Last N days", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Last N days and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("Last N days", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("Last N days", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Last N days");
			excel.setreport_PassedData("Last N days", 3, 9, "0.00");
			excel.setreport_PassedData("Last N days", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Last N days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last N days", 3, 9,diff_value);
			 excel.setreport_FailedData("Last N days", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("Last N days", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("Last N days", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Last N days");
			excel.setreport_PassedData("Last N days", 4, 9, "0.00");
			excel.setreport_PassedData("Last N days", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Last N days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last N days", 4, 9,diff_value);
			 excel.setreport_FailedData("Last N days", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Last N days and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}
@Then("Verify Menu Item Sale Report Availble for This Week or Not")
public void verifyMenuItemSaleReportAvailbleForThisWeekOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for This Week");
		excel.setreportData("This Week", 2, 8, st);
		excel.setreportData("This Week", 3, 8, st);
		excel.setreportData("This Week", 4, 8, st);
		excel.setreportData("This Week", 5, 8, st);
		excel.setreportData("This Week", 6, 8, st);
		excel.setreportData("This Week", 7, 8, st);
		excel.setreportData("This Week", 8, 8, st);
		excel.setreportData("This Week", 9, 8, st);
		excel.setreportData("This Week", 10, 8, st);
		excel.setreportData("This Week", 11, 8, st);
		excel.setreportData("This Week", 12, 8, st);
		excel.setreportData("This Week", 13, 8, st);

		excel.setreportData("This Week", 2, 9, st);
		excel.setreportData("This Week", 3, 9, st);
		excel.setreportData("This Week", 4, 9, st);
		excel.setreportData("This Week", 5, 9, st);
		excel.setreportData("This Week", 6, 9, st);
		excel.setreportData("This Week", 7, 9, st);
		excel.setreportData("This Week", 8, 9, st);
		excel.setreportData("This Week", 9, 9, st);
		excel.setreportData("This Week", 10, 9, st);
		excel.setreportData("This Week", 11, 9, st);
		excel.setreportData("This Week", 12, 9, st);
		excel.setreportData("This Week", 13, 9, st);

		excel.setreportData("This Week", 39, 5, st);
		excel.setreportData("This Week", 40, 5, st);
		excel.setreportData("This Week", 41, 5, st);
		excel.setreportData("This Week", 42, 5, st);
		excel.setreportData("This Week", 43, 5, st);
		excel.setreportData("This Week", 44, 5, st);
		excel.setreportData("This Week", 45, 5, st);
		excel.setreportData("This Week", 46, 5, st);
		excel.setreportData("This Week", 47, 5, st);
		excel.setreportData("This Week", 48, 5, st);
		excel.setreportData("This Week", 49, 5, st);
		excel.setreportData("This Week", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for This Week");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("This Week", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("This Week", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 2, 9, "0.00");
			excel.setreport_PassedData("This Week", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("This Week", 2, 9,diff_value);
			 excel.setreport_FailedData("This Week", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for This Week and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("This Week", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("This Week", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 3, 9, "0.00");
			excel.setreport_PassedData("This Week", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("This Week", 3, 9,diff_value);
			 excel.setreport_FailedData("This Week", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("This Week", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("This Week", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for This Week");
			excel.setreport_PassedData("This Week", 4, 9, "0.00");
			excel.setreport_PassedData("This Week", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("This Week", 4, 9,diff_value);
			 excel.setreport_FailedData("This Week", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for This Week and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}
@Then("Verify Menu Item Sale Report Availble for Last Week or Not")
public void verifyMenuItemSaleReportAvailbleForLastWeekOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for Last Week");
		excel.setreportData("Last Week", 2, 8, st);
		excel.setreportData("Last Week", 3, 8, st);
		excel.setreportData("Last Week", 4, 8, st);
		excel.setreportData("Last Week", 5, 8, st);
		excel.setreportData("Last Week", 6, 8, st);
		excel.setreportData("Last Week", 7, 8, st);
		excel.setreportData("Last Week", 8, 8, st);
		excel.setreportData("Last Week", 9, 8, st);
		excel.setreportData("Last Week", 10, 8, st);
		excel.setreportData("Last Week", 11, 8, st);
		excel.setreportData("Last Week", 12, 8, st);
		excel.setreportData("Last Week", 13, 8, st);

		excel.setreportData("Last Week", 2, 9, st);
		excel.setreportData("Last Week", 3, 9, st);
		excel.setreportData("Last Week", 4, 9, st);
		excel.setreportData("Last Week", 5, 9, st);
		excel.setreportData("Last Week", 6, 9, st);
		excel.setreportData("Last Week", 7, 9, st);
		excel.setreportData("Last Week", 8, 9, st);
		excel.setreportData("Last Week", 9, 9, st);
		excel.setreportData("Last Week", 10, 9, st);
		excel.setreportData("Last Week", 11, 9, st);
		excel.setreportData("Last Week", 12, 9, st);
		excel.setreportData("Last Week", 13, 9, st);

		excel.setreportData("Last Week", 39, 5, st);
		excel.setreportData("Last Week", 40, 5, st);
		excel.setreportData("Last Week", 41, 5, st);
		excel.setreportData("Last Week", 42, 5, st);
		excel.setreportData("Last Week", 43, 5, st);
		excel.setreportData("Last Week", 44, 5, st);
		excel.setreportData("Last Week", 45, 5, st);
		excel.setreportData("Last Week", 46, 5, st);
		excel.setreportData("Last Week", 47, 5, st);
		excel.setreportData("Last Week", 48, 5, st);
		excel.setreportData("Last Week", 49, 5, st);
		excel.setreportData("Last Week", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for Last Week");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Last Week", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("Last Week", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 2, 9, "0.00");
			excel.setreport_PassedData("Last Week", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last Week", 2, 9,diff_value);
			 excel.setreport_FailedData("Last Week", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Last Week and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("Last Week", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("Last Week", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 3, 9, "0.00");
			excel.setreport_PassedData("Last Week", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last Week", 3, 9,diff_value);
			 excel.setreport_FailedData("Last Week", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("Last Week", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("Last Week", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Last Week");
			excel.setreport_PassedData("Last Week", 4, 9, "0.00");
			excel.setreport_PassedData("Last Week", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last Week", 4, 9,diff_value);
			 excel.setreport_FailedData("Last Week", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Last Week and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}
@Then("Verify Menu Item Sale Report Availble for Last Seven Days or Not")
public void verifyMenuItemSaleReportAvailbleForLastSevenDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for Last 7 days");
		excel.setreportData("Last 7 days", 2, 8, st);
		excel.setreportData("Last 7 days", 3, 8, st);
		excel.setreportData("Last 7 days", 4, 8, st);
		excel.setreportData("Last 7 days", 5, 8, st);
		excel.setreportData("Last 7 days", 6, 8, st);
		excel.setreportData("Last 7 days", 7, 8, st);
		excel.setreportData("Last 7 days", 8, 8, st);
		excel.setreportData("Last 7 days", 9, 8, st);
		excel.setreportData("Last 7 days", 10, 8, st);
		excel.setreportData("Last 7 days", 11, 8, st);
		excel.setreportData("Last 7 days", 12, 8, st);
		excel.setreportData("Last 7 days", 13, 8, st);

		excel.setreportData("Last 7 days", 2, 9, st);
		excel.setreportData("Last 7 days", 3, 9, st);
		excel.setreportData("Last 7 days", 4, 9, st);
		excel.setreportData("Last 7 days", 5, 9, st);
		excel.setreportData("Last 7 days", 6, 9, st);
		excel.setreportData("Last 7 days", 7, 9, st);
		excel.setreportData("Last 7 days", 8, 9, st);
		excel.setreportData("Last 7 days", 9, 9, st);
		excel.setreportData("Last 7 days", 10, 9, st);
		excel.setreportData("Last 7 days", 11, 9, st);
		excel.setreportData("Last 7 days", 12, 9, st);
		excel.setreportData("Last 7 days", 13, 9, st);

		excel.setreportData("Last 7 days", 39, 5, st);
		excel.setreportData("Last 7 days", 40, 5, st);
		excel.setreportData("Last 7 days", 41, 5, st);
		excel.setreportData("Last 7 days", 42, 5, st);
		excel.setreportData("Last 7 days", 43, 5, st);
		excel.setreportData("Last 7 days", 44, 5, st);
		excel.setreportData("Last 7 days", 45, 5, st);
		excel.setreportData("Last 7 days", 46, 5, st);
		excel.setreportData("Last 7 days", 47, 5, st);
		excel.setreportData("Last 7 days", 48, 5, st);
		excel.setreportData("Last 7 days", 49, 5, st);
		excel.setreportData("Last 7 days", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for Last 7 days");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Last 7 days", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("Last 7 days", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 2, 9, "0.00");
			excel.setreport_PassedData("Last 7 days", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 2, 9,diff_value);
			 excel.setreport_FailedData("Last 7 days", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Last 7 days and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("Last 7 days", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("Last 7 days", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 3, 9, "0.00");
			excel.setreport_PassedData("Last 7 days", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 3, 9,diff_value);
			 excel.setreport_FailedData("Last 7 days", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("Last 7 days", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("Last 7 days", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Last 7 days");
			excel.setreport_PassedData("Last 7 days", 4, 9, "0.00");
			excel.setreport_PassedData("Last 7 days", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last 7 days", 4, 9,diff_value);
			 excel.setreport_FailedData("Last 7 days", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Last 7 days and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}
@Then("Verify Menu Item Sale Report Availble for This Month or Not")
public void verifyMenuItemSaleReportAvailbleForThisMonthOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for This month");
		excel.setreportData("This month", 2, 8, st);
		excel.setreportData("This month", 3, 8, st);
		excel.setreportData("This month", 4, 8, st);
		excel.setreportData("This month", 5, 8, st);
		excel.setreportData("This month", 6, 8, st);
		excel.setreportData("This month", 7, 8, st);
		excel.setreportData("This month", 8, 8, st);
		excel.setreportData("This month", 9, 8, st);
		excel.setreportData("This month", 10, 8, st);
		excel.setreportData("This month", 11, 8, st);
		excel.setreportData("This month", 12, 8, st);
		excel.setreportData("This month", 13, 8, st);

		excel.setreportData("This month", 2, 9, st);
		excel.setreportData("This month", 3, 9, st);
		excel.setreportData("This month", 4, 9, st);
		excel.setreportData("This month", 5, 9, st);
		excel.setreportData("This month", 6, 9, st);
		excel.setreportData("This month", 7, 9, st);
		excel.setreportData("This month", 8, 9, st);
		excel.setreportData("This month", 9, 9, st);
		excel.setreportData("This month", 10, 9, st);
		excel.setreportData("This month", 11, 9, st);
		excel.setreportData("This month", 12, 9, st);
		excel.setreportData("This month", 13, 9, st);

		excel.setreportData("This month", 39, 5, st);
		excel.setreportData("This month", 40, 5, st);
		excel.setreportData("This month", 41, 5, st);
		excel.setreportData("This month", 42, 5, st);
		excel.setreportData("This month", 43, 5, st);
		excel.setreportData("This month", 44, 5, st);
		excel.setreportData("This month", 45, 5, st);
		excel.setreportData("This month", 46, 5, st);
		excel.setreportData("This month", 47, 5, st);
		excel.setreportData("This month", 48, 5, st);
		excel.setreportData("This month", 49, 5, st);
		excel.setreportData("This month", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for This month");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("This month", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("This month", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for This month");
			excel.setreport_PassedData("This month", 2, 9, "0.00");
			excel.setreport_PassedData("This month", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("This month", 2, 9,diff_value);
			 excel.setreport_FailedData("This month", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for This month and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("This month", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("This month", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for This month");
			excel.setreport_PassedData("This month", 3, 9, "0.00");
			excel.setreport_PassedData("This month", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("This month", 3, 9,diff_value);
			 excel.setreport_FailedData("This month", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("This month", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("This month", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for This month");
			excel.setreport_PassedData("This month", 4, 9, "0.00");
			excel.setreport_PassedData("This month", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("This month", 4, 9,diff_value);
			 excel.setreport_FailedData("This month", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for This month and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}
@Then("Verify Menu Item Sale Report Availble for Last Month or Not")
public void verifyMenuItemSaleReportAvailbleForLastMonthOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for Last month");
		excel.setreportData("Last month", 2, 8, st);
		excel.setreportData("Last month", 3, 8, st);
		excel.setreportData("Last month", 4, 8, st);
		excel.setreportData("Last month", 5, 8, st);
		excel.setreportData("Last month", 6, 8, st);
		excel.setreportData("Last month", 7, 8, st);
		excel.setreportData("Last month", 8, 8, st);
		excel.setreportData("Last month", 9, 8, st);
		excel.setreportData("Last month", 10, 8, st);
		excel.setreportData("Last month", 11, 8, st);
		excel.setreportData("Last month", 12, 8, st);
		excel.setreportData("Last month", 13, 8, st);

		excel.setreportData("Last month", 2, 9, st);
		excel.setreportData("Last month", 3, 9, st);
		excel.setreportData("Last month", 4, 9, st);
		excel.setreportData("Last month", 5, 9, st);
		excel.setreportData("Last month", 6, 9, st);
		excel.setreportData("Last month", 7, 9, st);
		excel.setreportData("Last month", 8, 9, st);
		excel.setreportData("Last month", 9, 9, st);
		excel.setreportData("Last month", 10, 9, st);
		excel.setreportData("Last month", 11, 9, st);
		excel.setreportData("Last month", 12, 9, st);
		excel.setreportData("Last month", 13, 9, st);

		excel.setreportData("Last month", 39, 5, st);
		excel.setreportData("Last month", 40, 5, st);
		excel.setreportData("Last month", 41, 5, st);
		excel.setreportData("Last month", 42, 5, st);
		excel.setreportData("Last month", 43, 5, st);
		excel.setreportData("Last month", 44, 5, st);
		excel.setreportData("Last month", 45, 5, st);
		excel.setreportData("Last month", 46, 5, st);
		excel.setreportData("Last month", 47, 5, st);
		excel.setreportData("Last month", 48, 5, st);
		excel.setreportData("Last month", 49, 5, st);
		excel.setreportData("Last month", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for Last month");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Last month", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("Last month", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Last month");
			excel.setreport_PassedData("Last month", 2, 9, "0.00");
			excel.setreport_PassedData("Last month", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last month", 2, 9,diff_value);
			 excel.setreport_FailedData("Last month", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Last month and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("Last month", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("Last month", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Last month");
			excel.setreport_PassedData("Last month", 3, 9, "0.00");
			excel.setreport_PassedData("Last month", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last month", 3, 9,diff_value);
			 excel.setreport_FailedData("Last month", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("Last month", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("Last month", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Last month");
			excel.setreport_PassedData("Last month", 4, 9, "0.00");
			excel.setreport_PassedData("Last month", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last month", 4, 9,diff_value);
			 excel.setreport_FailedData("Last month", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Last month and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}
@Then("Verify Menu Item Sale Report Availble for Last Thirty Days or Not")
public void verifyMenuItemSaleReportAvailbleForLastThirtyDaysOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for Last 30 days");
		excel.setreportData("Last 30 days", 2, 8, st);
		excel.setreportData("Last 30 days", 3, 8, st);
		excel.setreportData("Last 30 days", 4, 8, st);
		excel.setreportData("Last 30 days", 5, 8, st);
		excel.setreportData("Last 30 days", 6, 8, st);
		excel.setreportData("Last 30 days", 7, 8, st);
		excel.setreportData("Last 30 days", 8, 8, st);
		excel.setreportData("Last 30 days", 9, 8, st);
		excel.setreportData("Last 30 days", 10, 8, st);
		excel.setreportData("Last 30 days", 11, 8, st);
		excel.setreportData("Last 30 days", 12, 8, st);
		excel.setreportData("Last 30 days", 13, 8, st);

		excel.setreportData("Last 30 days", 2, 9, st);
		excel.setreportData("Last 30 days", 3, 9, st);
		excel.setreportData("Last 30 days", 4, 9, st);
		excel.setreportData("Last 30 days", 5, 9, st);
		excel.setreportData("Last 30 days", 6, 9, st);
		excel.setreportData("Last 30 days", 7, 9, st);
		excel.setreportData("Last 30 days", 8, 9, st);
		excel.setreportData("Last 30 days", 9, 9, st);
		excel.setreportData("Last 30 days", 10, 9, st);
		excel.setreportData("Last 30 days", 11, 9, st);
		excel.setreportData("Last 30 days", 12, 9, st);
		excel.setreportData("Last 30 days", 13, 9, st);

		excel.setreportData("Last 30 days", 39, 5, st);
		excel.setreportData("Last 30 days", 40, 5, st);
		excel.setreportData("Last 30 days", 41, 5, st);
		excel.setreportData("Last 30 days", 42, 5, st);
		excel.setreportData("Last 30 days", 43, 5, st);
		excel.setreportData("Last 30 days", 44, 5, st);
		excel.setreportData("Last 30 days", 45, 5, st);
		excel.setreportData("Last 30 days", 46, 5, st);
		excel.setreportData("Last 30 days", 47, 5, st);
		excel.setreportData("Last 30 days", 48, 5, st);
		excel.setreportData("Last 30 days", 49, 5, st);
		excel.setreportData("Last 30 days", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for Last 30 days");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Last 30 days", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("Last 30 days", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Last 30 days");
			excel.setreport_PassedData("Last 30 days", 2, 9, "0.00");
			excel.setreport_PassedData("Last 30 days", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last 30 days", 2, 9,diff_value);
			 excel.setreport_FailedData("Last 30 days", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Last 30 days and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("Last 30 days", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("Last 30 days", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Last 30 days");
			excel.setreport_PassedData("Last 30 days", 3, 9, "0.00");
			excel.setreport_PassedData("Last 30 days", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last 30 days", 3, 9,diff_value);
			 excel.setreport_FailedData("Last 30 days", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("Last 30 days", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("Last 30 days", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Last 30 days");
			excel.setreport_PassedData("Last 30 days", 4, 9, "0.00");
			excel.setreport_PassedData("Last 30 days", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Last 30 days", 4, 9,diff_value);
			 excel.setreport_FailedData("Last 30 days", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Last 30 days and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}
@Then("Verify Menu Item Sale Report Availble for Specific Date or Not")
public void verifyMenuItemSaleReportAvailbleForSpecificDateOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for Specific Date");
		excel.setreportData("Specific Date", 2, 8, st);
		excel.setreportData("Specific Date", 3, 8, st);
		excel.setreportData("Specific Date", 4, 8, st);
		excel.setreportData("Specific Date", 5, 8, st);
		excel.setreportData("Specific Date", 6, 8, st);
		excel.setreportData("Specific Date", 7, 8, st);
		excel.setreportData("Specific Date", 8, 8, st);
		excel.setreportData("Specific Date", 9, 8, st);
		excel.setreportData("Specific Date", 10, 8, st);
		excel.setreportData("Specific Date", 11, 8, st);
		excel.setreportData("Specific Date", 12, 8, st);
		excel.setreportData("Specific Date", 13, 8, st);

		excel.setreportData("Specific Date", 2, 9, st);
		excel.setreportData("Specific Date", 3, 9, st);
		excel.setreportData("Specific Date", 4, 9, st);
		excel.setreportData("Specific Date", 5, 9, st);
		excel.setreportData("Specific Date", 6, 9, st);
		excel.setreportData("Specific Date", 7, 9, st);
		excel.setreportData("Specific Date", 8, 9, st);
		excel.setreportData("Specific Date", 9, 9, st);
		excel.setreportData("Specific Date", 10, 9, st);
		excel.setreportData("Specific Date", 11, 9, st);
		excel.setreportData("Specific Date", 12, 9, st);
		excel.setreportData("Specific Date", 13, 9, st);

		excel.setreportData("Specific Date", 39, 5, st);
		excel.setreportData("Specific Date", 40, 5, st);
		excel.setreportData("Specific Date", 41, 5, st);
		excel.setreportData("Specific Date", 42, 5, st);
		excel.setreportData("Specific Date", 43, 5, st);
		excel.setreportData("Specific Date", 44, 5, st);
		excel.setreportData("Specific Date", 45, 5, st);
		excel.setreportData("Specific Date", 46, 5, st);
		excel.setreportData("Specific Date", 47, 5, st);
		excel.setreportData("Specific Date", 48, 5, st);
		excel.setreportData("Specific Date", 49, 5, st);
		excel.setreportData("Specific Date", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for Specific Date");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Specific Date", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("Specific Date", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 2, 9, "0.00");
			excel.setreport_PassedData("Specific Date", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 2, 9,diff_value);
			 excel.setreport_FailedData("Specific Date", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Specific Date and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("Specific Date", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("Specific Date", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 3, 9, "0.00");
			excel.setreport_PassedData("Specific Date", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 3, 9,diff_value);
			 excel.setreport_FailedData("Specific Date", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("Specific Date", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("Specific Date", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Specific Date");
			excel.setreport_PassedData("Specific Date", 4, 9, "0.00");
			excel.setreport_PassedData("Specific Date", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Specific Date", 4, 9,diff_value);
			 excel.setreport_FailedData("Specific Date", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Specific Date and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}
@Then("Verify Menu Item Sale Report Availble for Date Range or Not")
public void verifyMenuItemSaleReportAvailbleForDateRangeOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
	Thread.sleep(8000);
	try
	{
	if(repts.No_TransactionFound_InfoMessage().isDisplayed())
	{
		test.log(LogStatus.INFO, "Sale Report Not Available for Date Range");
		excel.setreportData("Date Range", 2, 8, st);
		excel.setreportData("Date Range", 3, 8, st);
		excel.setreportData("Date Range", 4, 8, st);
		excel.setreportData("Date Range", 5, 8, st);
		excel.setreportData("Date Range", 6, 8, st);
		excel.setreportData("Date Range", 7, 8, st);
		excel.setreportData("Date Range", 8, 8, st);
		excel.setreportData("Date Range", 9, 8, st);
		excel.setreportData("Date Range", 10, 8, st);
		excel.setreportData("Date Range", 11, 8, st);
		excel.setreportData("Date Range", 12, 8, st);
		excel.setreportData("Date Range", 13, 8, st);

		excel.setreportData("Date Range", 2, 9, st);
		excel.setreportData("Date Range", 3, 9, st);
		excel.setreportData("Date Range", 4, 9, st);
		excel.setreportData("Date Range", 5, 9, st);
		excel.setreportData("Date Range", 6, 9, st);
		excel.setreportData("Date Range", 7, 9, st);
		excel.setreportData("Date Range", 8, 9, st);
		excel.setreportData("Date Range", 9, 9, st);
		excel.setreportData("Date Range", 10, 9, st);
		excel.setreportData("Date Range", 11, 9, st);
		excel.setreportData("Date Range", 12, 9, st);
		excel.setreportData("Date Range", 13, 9, st);

		excel.setreportData("Date Range", 39, 5, st);
		excel.setreportData("Date Range", 40, 5, st);
		excel.setreportData("Date Range", 41, 5, st);
		excel.setreportData("Date Range", 42, 5, st);
		excel.setreportData("Date Range", 43, 5, st);
		excel.setreportData("Date Range", 44, 5, st);
		excel.setreportData("Date Range", 45, 5, st);
		excel.setreportData("Date Range", 46, 5, st);
		excel.setreportData("Date Range", 47, 5, st);
		excel.setreportData("Date Range", 48, 5, st);
		excel.setreportData("Date Range", 49, 5, st);
		excel.setreportData("Date Range", 50, 5, st);
		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));
	}
	}
	catch(Exception G)
	{
		test.log(LogStatus.PASS, "Sale Report Available for Date Range");

		Thread.sleep(2000);
		//Verify Donut Chart screen
		//repts.Verify_Donut_Chart_Screen_TopSales();

		//Verify Bars Chart Screen
		//repts.Verify_Bars_Chart_Screen_TopSales();

		//Verify Sales By Hours
		//repts.Verify_Sales_byHours_Chart_Screen();

		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.END);

		Thread.sleep(2000);
		//Do pagination to Last
		repts.Do_Pagination();


//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		//Get the NEt Sales from Sale Recap Report
		String Expeccted_SaleAmt=excel.getData("Date Range", 2, 1).toString().replace(",", "");
		double Expected_SaleAmount=Double.parseDouble(Expeccted_SaleAmt);

		Thread.sleep(3000);
		//Get Sale Amount
		List<WebElement> rowList=driver.findElements(By.xpath("//tbody/tr"));
		String SaleAmount=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[5]/span")).getText().replace(",", "");
		double ActualSale_Amount=Double.parseDouble(SaleAmount);

		//Export the Sale Amount value to Excel
		excel.setreportData("Date Range", 2, 8, SaleAmount);


		//Check whether the Sale Amount value is Equal or not
		if(Expected_SaleAmount==ActualSale_Amount)
		{
			test.log(LogStatus.PASS, "Sale Amount for Menu Item Sale Report is equal to Sale Recap Report for Date Range");
			excel.setreport_PassedData("Date Range", 2, 9, "0.00");
			excel.setreport_PassedData("Date Range", 39, 5, SaleAmount+"`");
		}
		else
		{
			double diff=Expected_SaleAmount-ActualSale_Amount;
			test.log(LogStatus.FAIL, "Sale Amount for Menu Item Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Date Range", 2, 9,diff_value);
			 excel.setreport_FailedData("Date Range", 39, 5,diff_value);
		}

		//Get the Quantity
		String Qty=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[6]/span")).getText().replace(",", "");
			test.log(LogStatus.INFO, "Quantity for Menu Item Sale Report is displayed for Date Range and the value is : "+Qty);

		//Get the Tax from Sale Recap Report
		String Expeccted_Tx=excel.getData("Date Range", 3, 1).toString().replace(",", "");
		double Expected_Tax=Double.parseDouble(Expeccted_Tx);

		//Get the Tax
		String Tx=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[7]/span")).getText().replace(",", "");
		double ActualTax=Double.parseDouble(Tx);

		//Export Tax value to Excel
		excel.setreportData("Date Range", 3, 8, Tx);

		//Check whether the Tax value is Equal or not
		if(Expected_Tax==ActualTax)
		{
			test.log(LogStatus.PASS, "Tax for Menu Item Sale Report is equal to Sale Recap Report for Date Range");
			excel.setreport_PassedData("Date Range", 3, 9, "0.00");
			excel.setreport_PassedData("Date Range", 40, 5, Tx+"`");
		}
		else
		{
			double diff=Expected_Tax-ActualTax;
			test.log(LogStatus.FAIL, "Tax for Menu Item Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Date Range", 3, 9,diff_value);
			 excel.setreport_FailedData("Date Range", 40, 5,diff_value);
		}

		//Get the Discount from Sale Recap Report
		String Expeccted_Discnt=excel.getData("Date Range", 4, 1).toString().replace(",", "");
		double Expected_Discount=Double.parseDouble(Expeccted_Discnt);

		//Get the Discount
		String Discnt=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[8]/span")).getText().replace(",", "");
		double ActualDiscount=Double.parseDouble(Discnt);

		//Export Discount value to Excel
		excel.setreportData("Date Range", 4, 8, Discnt);

		//Check whether the Tax value is Equal or not
		if(Expected_Discount==ActualDiscount)
		{
			test.log(LogStatus.PASS, "Discount for Menu Item Sale Report is equal to Sale Recap Report for Date Range");
			excel.setreport_PassedData("Date Range", 4, 9, "0.00");
			excel.setreport_PassedData("Date Range", 41, 5, Discnt+"`");
		}
		else
		{
			double diff=Expected_Discount-ActualDiscount;
			test.log(LogStatus.FAIL, "Discount for Menu Item Sale Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			 String diff_value=String.valueOf(diff);
			 //Export the Sale Amount value to Excel
			 excel.setreport_FailedData("Date Range", 4, 9,diff_value);
			 excel.setreport_FailedData("Date Range", 41, 5,diff_value);
		}

		//Get the Percentage of Sale
		String PerSale=driver.findElement(By.xpath("//tbody/tr["+rowList.size()+"]/td[9]/span")).getText().replace(",", "");
			test.log(LogStatus.PASS, "% of Sale for Menu Item Sale Report is displayed for Date Range and the value is : "+PerSale);

		excel.toWrite(Utility.getProperty("Excel_Sheet_Path_Reports"));


		Thread.sleep(3000);

	}
}




	
}
