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

public class Reports_Paid_In_Paid_Out_Report 
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
	
	@Given("Open the Reports - Paid In\\/Paid Out Report home page BaseURL and storeID")
	public void openTheReportsPaidInPaidOutReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Paid In / Paid Out Report Page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"paidInOut");
	}
	@Given("Verifying the Paid In\\/Paid Out Report Header Page")
	public void verifyingThePaidInPaidOutReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Paid In / Paid Out Report Page loaded or not
		cmp.VerifyMainScreenPageHeader("Paid In & Paid Out");
	}
	@Then("Check Paid Type Field is Displayed")
	public void checkPaidTypeFieldIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Paid_TypeInputBx, "Paid Type Field");
	}
	@Then("Check Node Field in Table is Displayed")
	public void checkNodeFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Node_Column_Field, "Node Column Field");
	}
	@Then("Check Business Date Field in Table is Displayed")
	public void checkBusinessDateFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Business_Date_Column_Field, "Business Date Column Field");
	}
	@Then("Check Paid In\\/Paid Out By Field in Table is Displayed")
	public void checkPaidInPaidOutByFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Paid_In_Out_By_Column_Field, "Paid In/Out By Column Field");
	}
	@Then("Check Amount Field in Table is Displayed")
	public void checkAmountFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Amount_Column_Field, "Amount Column Field");
	}
	@Then("Check Paid From\\/Paid To Field in Table is Displayed")
	public void checkPaidFromPaidToFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Paid_From_Paid_To_Column_Field, "Paid From/Paid To Column Field");
	}
	@Then("Check Reason Field in Table is Displayed")
	public void checkReasonFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.Check_Element_or_Text_Displayed(repts.Reason_Column_Field, "Reason Column Field");
	}
	@Given("I Select the Paid Type as Paid In")
	public void iSelectThePaidTypeAsPaidIn() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.Click_DropDown_withSelection(repts.Paid_TypeInputBx, "Paid In", "Paid Type selected as Paid In");
	}
	@Then("Verify Paid In Report Availble or Not")
	public void verifyPaidInReportAvailbleOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/div/data-grid-row/div/div[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports is Available for Paid In - Paid Type");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Paid In / Paid Out Reports is Not Available for Paid In - Paid Type");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Paid Type as Paid Out")
	public void iSelectThePaidTypeAsPaidOut() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Click_DropDown_withSelection(repts.Paid_TypeInputBx, "Paid Out", "Paid Type selected as Paid Out");
	}
	@Then("Verify Paid Out Report Availble or Not")
	public void verifyPaidOutReportAvailbleOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		if(driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div[1]/div/data-grid-row/div/div[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports is Available for Paid Out - Paid Type");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Paid In / Paid Out Reports is Not Available for Paid Out - Paid Type");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Given("I Select the Paid Type as All")
	public void iSelectThePaidTypeAsAll() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.Click_DropDown_withSelection(repts.Paid_TypeInputBx, "All", "Paid Type selected as All");
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Today or Not")
	public void verifyPaidInPaidOutReportAvailbleForTodayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Today");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
			
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
			
			
				
				

				
				
				
				Thread.sleep(1000);
				
				
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
	
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
		
			}
		}

			
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Yesterday or Not")
	public void verifyPaidInPaidOutReportAvailbleForYesterdayOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Yesterday");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
		
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
		
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);

			}
		}

		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Last N Days or Not")
	public void verifyPaidInPaidOutReportAvailbleForLastNDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Last 'N' days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Last 'N' days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
			
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
			
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);

			}
		}
	
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for This Week or Not")
	public void verifyPaidInPaidOutReportAvailbleForThisWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for This Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
			
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
			
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
		
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
	
			}
		}
	
			
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Last Week or Not")
	public void verifyPaidInPaidOutReportAvailbleForLastWeekOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Last Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
		
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
			
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);

			}
		}
		
		
	
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Last Seven Days or Not")
	public void verifyPaidInPaidOutReportAvailbleForLastSevenDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Last 7 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Last 7 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
			
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
			
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
			
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
	
			}
		}
		
		
	
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for This Month or Not")
	public void verifyPaidInPaidOutReportAvailbleForThisMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for This Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
			
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
			
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
			
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
		
			}
		}
		
		
	
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Last Month or Not")
	public void verifyPaidInPaidOutReportAvailbleForLastMonthOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Last Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);

			}
		}
		
		
	
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Last Thirty Days or Not")
	public void verifyPaidInPaidOutReportAvailbleForLastThirtyDaysOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Last 30 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Last 30 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
				
			
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
			
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
	
			}
		}
		
		
	
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Specific Date or Not")
	public void verifyPaidInPaidOutReportAvailbleForSpecificDateOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Specific Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
				
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
				
				
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);

			}
		}
		
		
	
		}
	}
	@Then("Verify Paid In\\/Paid Out Report Availble for Date Range or Not")
	public void verifyPaidInPaidOutReportAvailbleForDateRangeOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		try
		{
		if(repts.No_PaidIn_PaidOut_InfoMsg().isDisplayed())
		{
			test.log(LogStatus.INFO, "Paid In / Paid Out Reports Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Paid In / Paid Out Reports Available for Date Range");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/div/data-grid-row"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=5)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
			
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ "Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
				
				
				
			
				
			}
		}
		else
		{
			for(int i=1;i<=5;i++)
			{
				String Node=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[1]")).getText();
				
				String Busi_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[2]")).getText();
				
				String Trans_Date=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[3]")).getText();
				
				
				
				String PaidInOutBy=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[4]")).getText();
				
			
				
				String Amount=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[5]")).getText();
				
				String Paid_FromTo=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[6]")).getText();

				String Reason=driver.findElement(By.xpath("//div[@class='data-grid']/div[3]/div["+i+"]/div/data-grid-row/div/div[7]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Business Date is : "+Busi_Date+" Transaction Date is : "+Trans_Date+" Paid In & Paid Out By : "+PaidInOutBy+" Paid In/Out Amount is : "+Amount+ " Paid From & To : "+Paid_FromTo+" Reason is : "+Reason);
		
			}
		}
		
		
	
		}
	}

}
