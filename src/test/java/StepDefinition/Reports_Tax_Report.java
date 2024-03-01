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

public class Reports_Tax_Report 
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
	
	
	@Given("Open the Reports - Tax Report home page BaseURL and storeID")
	public void openTheReportsTaxReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Daily page
		driver.get(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"taxReport");
	}
	@Given("Verifying the Tax Report Header Page")
	public void verifyingTheTaxReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loaded or not
		cmp.VerifyMainScreenPageHeader("Tax");
	}
	@Then("Check Tax Per ServiceType Check Box Field is Displayed")
	public void checkTaxPerServiceTypeCheckBoxFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Tax_PerServiceType_ChkBx, "Tax Per Service Type Check Box Field");
	}
	@Then("Check Tax Name Field in Table is Displayed")
	public void checkTaxNameFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Tax_Name_Column_Field, "Tax Name Column Field");
	}
	@Then("Check Tax Percentage Field in Table is Displayed")
	public void checkTaxPercentageFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Tax_Percentage_Column_Field, "Tax Percentage Column Field");
	}
	@Then("Check Net Sales Field in Table is Displayed")
	public void checkNetSalesFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Tax_Percentage_Column_Field, "Net Sales Column Field");
	}
	@Then("Check Tax Amount Field in Table is Displayed")
	public void checkTaxAmountFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Tax_Amount_Column_Field, "Tax Amount Column Field");
	}
	@Then("Check Tax Exempt Field in Table is Displayed")
	public void checkTaxExemptFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Tax_Exempt_Column_Field, "Tax Exempt Column Field");
	}
	@Then("I Enable Tax Per ServiceType Check Box")
	public void iEnableTaxPerServiceTypeCheckBox() {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Enable_Tax_Per_ServiceType();
	}
	@Then("Check QSR Field in Table is Displayed")
	public void checkQSRFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.QSR_Column_Field, "QSR Column Field");
	}
	@Then("Check Bar Field in Table is Displayed")
	public void checkBarFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Bar_Column_Field, "Bar Column Field");
	}
	@Then("Check Dine In Field in Table is Displayed")
	public void checkDineInFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Dine_In_Column_Field, "Dine In Column Field");
	}
	@Then("Check To Go Field in Table is Displayed")
	public void checkToGoFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.ToGo_Column_Field, "ToGo Column Field");
	}
	@Then("Check Delivery Field in Table is Displayed")
	public void checkDeliveryFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Delivery_Column_Field, "Delivery Column Field");
	}
	@Then("Check For Here Field in Table is Displayed")
	public void checkForHereFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.For_Here_Column_Field, "For Here Column Field");
	}
	@Then("Check Web Field in Table is Displayed")
	public void checkWebFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(repts.Web_Column_Field, "Web Column Field");
	}
	@Given("I Disable Tax Per ServiceType Check Box")
	public void iDisableTaxPerServiceTypeCheckBox() {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Disable_Tax_Per_ServiceType();
	}
	@Then("Verify Tax Report Availble for Today or Not")
	public void verifyTaxReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Today");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
	
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);

		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Today", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
	

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Today");
		
			
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
		
				String diff_value=String.valueOf(diff);

		
			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Today", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);

			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Today");
	
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				String diff_value=String.valueOf(diff);
				
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Today.The value diff is : "+diff);
		
			}
			
			
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Today", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
			
		
			
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Today");
		
			
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report  for Today.The value diff is : "+diff);
		

			}
			
			
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for Yesterday or Not")
	public void verifyTaxReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Yesterday");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Yesterday");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);

			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);

			

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Yesterday", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
	
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Yesterday");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		
			
			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Yesterday", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "").replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
			
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Yesterday");
		
		
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		

				
			
			}
			
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Yesterday", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
			
		
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Yesterday");
	
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for Yesterday.The value diff is : "+diff);
		
			
			}
			
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for Last N Days or Not")
	public void verifyTaxReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Last N days");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Last N days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
		
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
				

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last N days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
		

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Last 'N' Days");
			
			
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
			}
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Last N days", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
			
		
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Last 'N' Days");
		
		
				
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
	
			}
			

		
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Last N days", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
			
		
			
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Last 'N' Days");
		
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for Last 'N' Days.The value diff is : "+diff);
		
			
			}
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for This Week or Not")
	public void verifyTaxReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));

		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		
			
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for This Week");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
	
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
					
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("This Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
	
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for This Week");
		
	
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			
			
			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("This Week", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
			
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for This Week");
		
			
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
			
			}
			

			
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("This Week", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
			
		
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for This Week");
		

			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for This Week.The value diff is : "+diff);
		
			
			
			}
		
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for Last Week or Not")
	public void verifyTaxReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Last Week");
		
			ut.FailedCaptureScreenshotAsBASE64();
		
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Last Week");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);

			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
				
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last Week", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
		
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Last Week");
		

			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Last Week", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
		
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Last Week");
		

			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
	
			

			}
			

			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Last Week", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
			
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Last Week");
		
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for Last Week.The value diff is : "+diff);
		
		
			}
			
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for Last Seven Days or Not")
	public void verifyTaxReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Last 7 days");
			ut.FailedCaptureScreenshotAsBASE64();
		
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Last 7 days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
		
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
					
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last 7 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
		

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Last 7 days");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
		
			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Last 7 days", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
		
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Last 7 days");
		
		
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
			

			}

			
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Last 7 days", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
			
		
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Last 7 days");
		
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for Last 7 days.The value diff is : "+diff);
		
			}
			
		
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for This Month or Not")
	public void verifyTaxReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for This month");
		
			ut.FailedCaptureScreenshotAsBASE64();
	
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for This month");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			

			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);


			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("This month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for This month");
		
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
		
			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("This month", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for This month");
		
			
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
		
			
			}
		
			
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("This month", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
		
			
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for This month");
		
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for This month.The value diff is : "+diff);
			
			
		
			}
		
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for Last Month or Not")
	public void verifyTaxReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Last month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Last month");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
	
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);

			
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last month", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
		
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Last month");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Last month", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
			
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Last month");
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
			
			
			}
			
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Last month", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
			
		
			
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Last month");
		
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for Last month.The value diff is : "+diff);
		
			
			}
			
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for Last Thirty Days or Not")
	public void verifyTaxReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Last 30 days");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Last 30 days");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			

			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		
			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Last 30 days", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
		
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Last 30 days");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		

			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Last 30 days", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
			
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Last 30 days");
			
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
		
			
			}
			
		

			
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Last 30 days", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
			
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Last 30 days");
		
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for Last 30 days.The value diff is : "+diff);
	

			}
			
			
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for Specific Date or Not")
	public void verifyTaxReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Specific Date");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Specific Date");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
	
			
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Specific Date", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
			
		

			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Specific Date");
		
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
		
			
			}
			
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Specific Date", 8, 1).toString().replace(",", "");
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Specific Date");
		
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			

			}
			
					
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Specific Date", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
		
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Specific Date");
		
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for Specific Date.The value diff is : "+diff);
			
			
			}
			
		
			Thread.sleep(3000);

		}
	}
	@Then("Verify Tax Report Availble for Date Range or Not")
	public void verifyTaxReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_Reports"));
		Thread.sleep(8000);
		try
		{
		if(repts.No_Tax_FoundInfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Sale Report for Tax Not Available for Date Range");
		
		ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Sale Report for Tax Available for Date Range");
			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(2000);

			
//			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);

			//Get the Tax from Sale Recap Report
			String Expeccted_Tx=excel.getData("Date Range", 3, 1).toString().replace(",", "");
			double Expected_Tax=Double.parseDouble(Expeccted_Tx);
			
			
			//Get the Tax
			String Tx=repts.Tax_DailySummaryReport().getText().replace(",", "");
			double ActualTax=Double.parseDouble(Tx);
		
			//Check whether the Tax value is Equal or not
			if(Expected_Tax==ActualTax)
			{
				test.log(LogStatus.PASS, "Tax for Tax Report is equal to Sale Recap Report for Date Range");
	
			}
			else
			{
				double diff=Expected_Tax-ActualTax;
				test.log(LogStatus.FAIL, "Tax for Tax Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
	

			}
			
		
			//Get the Tax Exempt from Sale Recap Report
			String Expeccted_TxExempt=excel.getData("Date Range", 8, 1).toString().replace(",", "");
			
			double Expected_TaxExempt=Double.parseDouble(Expeccted_TxExempt);
			
			

			Thread.sleep(3000);
			//Get Tax Exempt
			String TaxExempt=repts.Tax_Exempt_TaxReport().getText().replace(",", "");
			double Actual_TaxExempt=Double.parseDouble(TaxExempt);
			
			
			//Check whether the Tax Exempt value is Equal or not
			if(Expected_TaxExempt==Actual_TaxExempt)
			{
				test.log(LogStatus.PASS, "Tax Exempt for Tax Report is equal to Sale Recap Report for Date Range");
	
			}
			else
			{
				double diff=Expected_TaxExempt-Actual_TaxExempt;
				test.log(LogStatus.FAIL, "Tax Exempt for Tax Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);
			

			}
			
			//Get the Rounding Off from Sale Recap Report
			String Expected_RoundOf=excel.getData("Date Range", 12, 1).toString().replace(",", "");
			double Expected_RoundingOff=Double.parseDouble(Expected_RoundOf);
		
			
			//Get the Rounding Off
			String RoundOff=repts.Rounding_Off_TaxReport().getText().replace(",", "");
			double Actual_RoundOff=Double.parseDouble(RoundOff);
		
			//Check whether the Rounding Off value is Equal or not
			if(Expected_RoundingOff==Actual_RoundOff)
			{
				test.log(LogStatus.PASS, "Rounding Off for Tax Report is equal to Sale Recap Report for Date Range");
		
			}
			else
			{
				double diff=Expected_RoundingOff-Actual_RoundOff;
				test.log(LogStatus.FAIL, "Rounding Off for Tax Report is not equal to Sale Recap Report for Date Range.The value diff is : "+diff);

			}
			
	
			
			Thread.sleep(3000);

		}
	}
}
