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

import Utility.Utility;
import io.cucumber.java.en.*;

public class Reports_Gift_Card_Report 
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
	
	public static String Card_Number,Employee;
	
	@Given("Open the Reports - Gift Card Report home page BaseURL and storeID")
	public void openTheReportsGiftCardReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Daily page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"giftCardReport/giftCard");

	}
	@Given("Verifying the Gift Card Report Header Page")
	public void verifyingTheGiftCardReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Categories page loeded or not
		repts.Verify_ReportHomePage("GIFT CARD");
	}
	@Then("Check Card Number Field is Displayed")
	public void checkCardNumberFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Card_NumberInputBx, "Card Number Field");
	}
	@Then("Check Activity Type Field is Displayed")
	public void checkActivityTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Activity_Type_InputBx, "Activity Type Field");
	}
	@Then("Check Sold In Field is Displayed")
	public void checkSoldInFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(repts.Sold_In_InputBx, "Sold In Field");
	}
	@Then("Check Card Number Field in Table is Displayed")
	public void checkCardNumberFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Card_Number_Column_Field, "Card Number Column Field");
	}
	@Then("Check Employee Field in Table is Displayed")
	public void checkEmployeeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Employee_Column_Field, "Employee Column Field");
	}
	@Then("Check Sale Number Field in Table is Displayed")
	public void checkSaleNumberFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Sale_Number_Column_Field, "Sale Number Column Field");
	}
	@Then("Check Activity Type Field in Table is Displayed")
	public void checkActivityTypeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Activity_Type_Column_Field, "Activity Type Column Field");
	}
	@Then("Check Sold In Field in Table is Displayed")
	public void checkSoldInFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Sold_In_Column_Field, "Sold In Column Field");
	}
	@Then("Check Balance Field in Table is Displayed")
	public void checkBalanceFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Balance_Column_Field, "Balance Column Field");
	}
	@Given("I Search the Selected Gift Card Number")
	public void iSearchTheSelectedGiftCardNumber() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		String GiftCard_Number=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
		
		this.Card_Number=GiftCard_Number;
		//Enter Gift Card Number
		repts.Enter_Card_Number(GiftCard_Number);
		
		
		
	}
	@Then("Verify Gift Card Report Available for Selected Gift Card or Not")
	public void verifyGiftCardReportAvailableForSelectedGiftCardOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText().equalsIgnoreCase(Card_Number))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Gift Card Number");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Gift Card Number");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Clear the Card Number")
	public void iClearTheCardNumber() {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Card_NumberInputBx.click();
	}
	@Given("I Select the Activity Type as Adjustment")
	public void iSelectTheActivityTypeAsAdjustment() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Activity_Type_InputBx, "Adjustment", "Activity Type selected as Adjustment");
	}
	@Given("I Select the Sold In as All")
	public void iSelectTheSoldInAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Sold_In_InputBx, "All", "Sold In selected as All");
	}
	@Then("Verify Gift Card Report Available for Selected Adjustment Activity Type or Not")
	public void verifyGiftCardReportAvailableForSelectedAdjustmentActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText().equalsIgnoreCase("Adjustment"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Activity Type as Adjustment");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Activity Type as Adjustment");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Given("I Select the Activity Type as Redeemed")
	public void iSelectTheActivityTypeAsRedeemed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Activity_Type_InputBx, "Redeemed", "Activity Type selected as Redeemed");
	}
	
	@Then("Verify Gift Card Report Available for Selected Redeemed Activity Type or Not")
	public void verifyGiftCardReportAvailableForSelectedRedeemedActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText().equalsIgnoreCase("Redeemed"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Activity Type as Redeemed");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Activity Type as Redeemed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Activity Type as Recharges")
	public void iSelectTheActivityTypeAsRecharges() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Activity_Type_InputBx, "Recharges", "Activity Type selected as Recharges");
	}
	@Then("Verify Gift Card Report Available for Selected Recharges Activity Type or Not")
	public void verifyGiftCardReportAvailableForSelectedRechargesActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText().equalsIgnoreCase("Recharges"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Activity Type as Recharges");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Activity Type as Recharges");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Activity Type as Sold")
	public void iSelectTheActivityTypeAsSold() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Activity_Type_InputBx, "Sold", "Activity Type selected as Sold");
	}
	@Then("Verify Gift Card Report Available for Selected Sold Activity Type or Not")
	public void verifyGiftCardReportAvailableForSelectedSoldActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText().equalsIgnoreCase("Sold"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Activity Type as Sold");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Activity Type as Sold");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Activity Type as Refund")
	public void iSelectTheActivityTypeAsRefund() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Activity_Type_InputBx, "Refund", "Activity Type selected as Refund");
	}
	@Then("Verify Gift Card Report Available for Selected Refund Activity Type or Not")
	public void verifyGiftCardReportAvailableForSelectedRefundActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText().equalsIgnoreCase("Refund"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Activity Type as Refund");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Activity Type as Refund");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Activity Type as Void")
	public void iSelectTheActivityTypeAsVoid() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Activity_Type_InputBx, "Void", "Activity Type selected as Void");
	}
	@Then("Verify Gift Card Report Available for Selected Void Activity Type or Not")
	public void verifyGiftCardReportAvailableForSelectedVoidActivityTypeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText().equalsIgnoreCase("Void"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Activity Type as Void");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Activity Type as Void");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Activity Type as All")
	public void iSelectTheActivityTypeAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Activity_Type_InputBx, "All", "Activity Type selected as All");
	}
	@Given("I Select the Employee")
	public void iSelectTheEmployee() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch(repts.Employee_InputBx, "Employee selected");
	    
	    String Emp=repts.Employee_InputBx.getAttribute("value");
	    
	    this.Employee=Emp;
	}
	@Then("Verify Gift Card Report Available for Selected Employee or Not")
	public void verifyGiftCardReportAvailableForSelectedEmployeeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText().equalsIgnoreCase(Employee))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for selected Employee");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for selected Employee");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("I Select the Sold In as Back Office")
	public void iSelectTheSoldInAsBackOffice() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Sold_In_InputBx, "Back Office", "Sold In selected as Back Office");
	}
	@Then("Verify Gift Card Report Available for Selected Back Office Sold In or Not")
	public void verifyGiftCardReportAvailableForSelectedBackOfficeSoldInOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]")).getText().equalsIgnoreCase("Back Office"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Sold In as Back Office");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Sold In as Back Office");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Sold In as Online Ordering")
	public void iSelectTheSoldInAsOnlineOrdering() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Sold_In_InputBx, "Online Ordering", "Sold In selected as Back Office");
	}
	@Then("Verify Gift Card Report Available for Selected Online Ordering Sold In or Not")
	public void verifyGiftCardReportAvailableForSelectedOnlineOrderingSoldInOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]")).getText().equalsIgnoreCase("Online Ordring"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Sold In as Online Ordering");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Sold In as Online Ordering");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Sold In as POS")
	public void iSelectTheSoldInAsPOS() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Sold_In_InputBx, "POS", "Sold In selected as POS");
	}
	@Then("Verify Gift Card Report Available for Selected POS Sold In or Not")
	public void verifyGiftCardReportAvailableForSelectedPOSSoldInOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]")).getText().equalsIgnoreCase("POS"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Sold In as POS");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Sold In as POS");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Sold In as Kiosk")
	public void iSelectTheSoldInAsKiosk() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_Selection(repts.Sold_In_InputBx, "KIOSK", "Sold In selected as Kiosk");
	}
	@Then("Verify Gift Card Report Available for Selected Kiosk Sold In or Not")
	public void verifyGiftCardReportAvailableForSelectedKioskSoldInOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]")).getText().equalsIgnoreCase("KIOSK"))
		{
			test.log(LogStatus.PASS, "Gift Card Reports is Available for Searched Sold In as Kiosk");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Gift Card Reports is Not Available for Searched Sold In as Kiosk");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Verify Gift Card Report Available for Today or Not")
	public void verifyGiftCardReportAvailableForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Today");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+" Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
			
			
		
		
	
			
		}
	}
	@Then("Verify Gift Card Report Available for Yesterday or Not")
	public void verifyGiftCardReportAvailableForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Yesterday");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
			
			
		
		
	
			
		}
	}
	@Then("Verify Gift Card Report Available for Last N Days or Not")
	public void verifyGiftCardReportAvailableForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Last 'N' days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Last 'N' days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
			
			
		
		
	
			
		}
	}
	@Then("Verify Gift Card Report Available for This Week or Not")
	public void verifyGiftCardReportAvailableForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for This Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
			
			
		
		
	
			
		}
	}
	@Then("Verify Gift Card Report Available for Last Week or Not")
	public void verifyGiftCardReportAvailableForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Last Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify Gift Card Report Available for Last Seven Days or Not")
	public void verifyGiftCardReportAvailableForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Last 7 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Last 7 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
	
		}
	}
	@Then("Verify Gift Card Report Available for This Month or Not")
	public void verifyGiftCardReportAvailableForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for This Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify Gift Card Report Available for Last Month or Not")
	public void verifyGiftCardReportAvailableForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Last Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify Gift Card Report Available for Last Thirty Days or Not")
	public void verifyGiftCardReportAvailableForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Last 30 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Last 30 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify Gift Card Report Available for Specific Date or Not")
	public void verifyGiftCardReportAvailableForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Specific Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}
	@Then("Verify Gift Card Report Available for Date Range or Not")
	public void verifyGiftCardReportAvailableForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Gift Card Reports Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Gift Card Reports Available for Date Range");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size();
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String GiftCard_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Busi_date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
				
				String Activity_Type=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
				
//				String SoldIn=driver.findElement(By.xpath("")).getText();
				
				String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();
				
				
				String Balance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[10]")).getText();
				
				test.log(LogStatus.INFO, "Gift Card No is : "+GiftCard_No+" Business Date is : "+Busi_date+" Activity Type is : "+"Amount is : "+Amount+" Balance is : "+Balance);
				
			}
		}

		}
	}

}
