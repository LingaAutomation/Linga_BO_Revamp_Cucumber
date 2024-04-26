package StepDefinition;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Reports_Membership_Summary_Report 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	Utility ut = new Utility();

	@Given("Open the Reports - Membership Summary Report home page BaseURL and storeID")
	public void OpenMembershipSummaryReportHomePage() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"membershipReport/membershipSummary");
		Thread.sleep(5000);
	}

	@Given("Verifying the Membership Summary Report Header Page")
	public void verifyingTheMembershipSummaryReportHeaderPage() throws Exception 
	{
		Thread.sleep(5000);
		//Verify the membership Summary report page loeded or not
		repts.Verify_ReportHomePage("MEMBERSHIP SUMMARY");
	}

	@Then("Check Select Customer Field is Displayed")
	public void checkSelectCustomerFieldIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.Customer_InputBx,"Customer Input Field");
	}
	@Then("Check Select Membership Plan Field is Displayed")
	public void checkSelectMembershipPlanFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.MembershipPlan_InputField,"Membership Input Field");
	}
	@Then("Check Select Year Field is Displayed")
	public void checkSelectYearFieldIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Year_InputField,"Year Input Field");
	}
//	@Then("Check Customer Name Field in Table is Displayed")
//	public void checkCustomerNameFieldInTableIsDisplayed() throws Exception 
//	{
//		cmp.Check_Element_or_Text_Displayed(repts.CustomerName_Column,"Customer Name Column Field");
//	}
	@Then("Check Membership Plan Field in Table is Displayed")
	public void checkMembershipPlanFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.MembershipPlan_Column,"MembershipPlan Column Field");
	}
	@Then("Check Membership ID Field in Table is Displayed")
	public void checkMembershipIDFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.MembershipID_Column,"Membership ID Column Field");
	}
	@Then("Check Allowance Field in Table is Displayed")
	public void checkAllowanceFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Allowance_Column,"Allowance sColumn Field");
	}
	@Then("Check Allowance DED Field in Table is Displayed")
	public void checkAllowanceDEDFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.AllowanceDED_Column,"Membership DED Column Field");
	}
	@Then("Check Overdraft Due Field in Table is Displayed")
	public void checkOverdraftDueFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.OverdraftDue_Column,"OverDraft Due Column Field");
	}
	//	@Then("Check Dec Field in Table is Displayed")
	//	public void checkDecFieldInTableIsDisplayed() throws Exception 
	//	{
	//		cmp.Check_Element_or_Text_Displayed(repts.Dec_Column,"Dec Column Field");
	//	}
	@Then("Check Total Transaction Field in Table is Displayed")
	public void checkTotalTransactionFieldInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.TotalTransaction_Column,"Total Transaction Column Field");
	}
	@Then("Check Pending Allowance Field in Table is Displayed")
	public void checkPendingAllowanceFieldInTableIsDisplayed() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(repts.PendingAllowance_Column,"Pending Allowance Column Field");
	}

//	@Given("I Select the Customer")
//	public void iSelectTheCustomer() throws Exception 
//	{
//		repts.Customer_InputField.click();
//		Thread.sleep(500);	
//		//Select the All option
//		driver.findElement(By.xpath("//select-option[contains(.,'All')]")).click();
////		Thread.sleep(500);
//
////		List<WebElement> CustomerList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
////
////		int CustomerSize=CustomerList.size();
////
////
////		int randomCustomer=ThreadLocalRandom.current().nextInt(1, CustomerSize);
////
////
////		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomCustomer+"]/select-option")).click();
//
//	}
	@Given("I Select Random Membership Plan")
	public void iSelectRandomMembershipPlan() throws Exception 
	{
		repts.MembershipPlan_InputField.click();
		Thread.sleep(500);

		List<WebElement> MemeberShipList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));

		int MemebershipSize=MemeberShipList.size();


		int randomMembershipPlan=ThreadLocalRandom.current().nextInt(1, MemebershipSize);


		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomMembershipPlan+"]/select-option")).click();


	}
	@Given("I Select Random Time Period")
	public void iSelectRandomTimePeriod() throws Exception 
	{
		for(int i=1;i<=8;i++) 
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		repts.Time_PeriodInputBx.click();
		Thread.sleep(500);

		List<WebElement> timeList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));

		int TimeSize=timeList.size();


		int randomTimePeriod=ThreadLocalRandom.current().nextInt(1, TimeSize);


		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomTimePeriod+"]/select-option")).click();
	}
	@Given("I Select Random Year")
	public void iSelectRandomYear() throws Exception 
	{
		repts.Year_InputField.click();
		Thread.sleep(500);

		List<WebElement> YearList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));

		int YearSize=YearList.size();


		int randomYear=ThreadLocalRandom.current().nextInt(1, YearSize);


		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+randomYear+"]/select-option")).click();
		for(int i=1;i<=8;i++) 
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
	}
	@Then("Verify Membership Summary Report Available for Selected Time Period")
	public void verifyMembershipSummaryReportAvailableForSelectedTimePeriod() throws Exception 
	{
		Thread.sleep(8000);
		try
		{
			if(repts.No_TransactionFound_InfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "Membership Summary report is not available for the mentioned time period");
			}
		}
		catch(Exception G)
		{	
			test.log(LogStatus.INFO, "Membership Summary report is available for the mentioned time period");


			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));

			int rowSize=rowList.size()-1;


			if(rowSize<=1000)
			{
				for(int i=1;i<=rowSize;i++)
				{

					String CustomerName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String MemberShipPlan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					WebElement MemberShipID=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]"));

					//String Check_No=Check.getText();

					String Allowance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();




					String Refund=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
					List<WebElement> Column = driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
					int columnSize = Column.size();

					String Total_Transaction=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+(columnSize-1)+"]")).getText();


					String Pending_Allowance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+columnSize+"]")).getText();

					test.log(LogStatus.INFO, "CustomerName is : "+CustomerName+" Membership plan is: "+MemberShipPlan+" Membership ID is : "+MemberShipID+" Allowance is : "+Allowance+" Total Transaction is : "+Total_Transaction+" Pending Allowance is : "+Pending_Allowance);

				}
			}
			else
			{
				for(int i=1;i<=1000;i++)
				{

					String CustomerName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();

					String MemberShipPlan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

					WebElement MemberShipID=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]"));

					//String Check_No=Check.getText();

					String Allowance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();




					String Refund=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
					List<WebElement> Column = driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
					int columnSize = Column.size();

					String Total_Transaction=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+(columnSize-1)+"]")).getText();


					String Pending_Allowance=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+columnSize+"]")).getText();

					test.log(LogStatus.INFO, "CustomerName is : "+CustomerName+" Membership plan is: "+MemberShipPlan+" Membership ID is : "+MemberShipID+" Allowance is : "+Allowance+" Total Transaction is : "+Total_Transaction+" Pending Allowance is : "+Pending_Allowance);


				}
			}

		}
	}



}
