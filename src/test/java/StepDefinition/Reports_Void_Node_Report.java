package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Reports_Void_Node_Report
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	ReportsPage repts=new ReportsPage();
	Utility ut = new Utility();
	
	@Given("Open the Reports - Void Node Report home page BaseURL and storeID")
	public void OpenVoidNodeReportHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id3")+"voidReport/node");
		Thread.sleep(5000);
	}

	@Given("Verifying the Void Node Report Header Page")
	public void verifyingTheVoidNodeReportHeaderPage() throws Exception
	{

		Thread.sleep(5000);
		//Verify the Void Node page loaded or not
		repts.Verify_ReportHomePage("NODE");
	}

	@Then("Check Select the Node Field is Displayed")
	public void checkSelectTheNodeFieldIsDisplayed() throws Exception
	{
	   cmp.Check_Element_or_Text_Displayed(repts.Node_InputBx, "Select Node Field");
	}
//	@Then("Check Item Name Field in Table is Displayed")
//	public void checkItemNameFieldInTableIsDisplayed() throws Exception
//	{
//		  cmp.Check_Element_or_Text_Displayed(repts.Item_Name_Column_Field,"Item Name Column Field");
//	}
	@Then("Check Quantity Field in Table is Dispalyed")
	public void checkQuantityFieldInTableIsDispalyed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Quantity_Column_Field,"Quantity Column Field");
	}
	@Then("Check Void Reason in Table is Displayed")
	public void checkVoidReasonInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Void_Reason_Column_Field,"Void Reason Column Field");
	}
	@Then("Check Open By in Table is Displayed")
	public void checkOpenByInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Open_By_Column_Field,"Open By Column Field");
	}
	@Then("Check Void By in Table is Displayed")
	public void checkVoidByInTableIsDisplayed() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(repts.Void_By_Column_Field,"Void By Column Field");
	}

	@Then("Verify Void Node Report Available for Today or Not")
	public void verifyVoidNodeReportAvailableForTodayOrNot() throws Exception 
	{

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Today");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Today");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
	}

	@Then("Verify Void Node Report Available for Yesterday or Not")
	public void verifyVoidNodeReportAvailableForYesterdayOrNot() throws Exception
	{

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Yesterday");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Yesterday");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
	}

	@Then("Verify Void Node Report Available for Last N Days or Not")
	public void verifyVoidNodeReportAvailableForLastNDaysOrNot() throws Exception 
	{

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Last N Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Last N Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
	}

	@Then("Verify Void Node Report Available for This Week or Not")
	public void verifyVoidNodeReportAvailableForThisWeekOrNot() throws Exception 
	{

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for This Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for This Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
	}

    @Then("Verify Void Node Report Available for Last Week or Not")
	public void verifyVoidNodeReportAvailableForLastWeekOrNot() throws Exception 
    {

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Last Week");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Last Week");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
	}

    @Then("Verify Void Node Report Available for Last Seven Days or Not")
    public void verifyVoidNodeReportAvailableForLastSevenDaysOrNot() throws Exception 
    {

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Last Seven Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Last Seven Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
    }
    
    @Then("Verify Void Node Report Available for This Month or Not")
    public void verifyVoidNodeReportAvailableForThisMonthOrNot() throws Exception 
    {

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for This Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for This Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
    }

    @Then("Verify Void Node Report Available for Last Month or Not")
    public void verifyVoidNodeReportAvailableForLastMonthOrNot() throws Exception 
    {

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Last Month");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Last Month");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
    }

    @Then("Verify Void Node Report Available for Last Thirty Days or Not")
    public void verifyVoidNodeReportAvailableForLastThirtyDaysOrNot() throws Exception
    {

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Last 30 Days");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Last 30 Days");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
    }

    @Then("Verify Void Node Report Available for Specific Date or Not")
    public void verifyVoidNodeReportAvailableForSpecificDateOrNot() throws Exception 
    {

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Specific Date");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Specific Date");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
    }

    @Then("Verify Void Node Report Available for Date Range or Not")
    public void verifyVoidNodeReportAvailableForDateRangeOrNot() throws Exception 
    {

		Thread.sleep(8000);
		try
		{
		if(repts.No_TransactionFound_InfoMessage().isDisplayed())
		{
			test.log(LogStatus.INFO, "Void - Nodes Not Available for Date Range");
	
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception G)
		{
			
			test.log(LogStatus.PASS, "Void - Nodes Available for Date Range");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
//			driver.findElement(By.tagName("html")).sendKeys(Keys.END);
			
			Thread.sleep(2000);
			//Do pagination to Last
//			repts.Do_Pagination();
			
			
			List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
			int rowSize=rowList.size()-1;
			
			
		if(rowSize<=1000)
		{
			for(int i=1;i<=rowSize;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
		
			}
		}
		else
		{
			for(int i=1;i<=1000;i++)
			{
			
				String Node=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
				
				String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
				
				WebElement Check=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]//a"));
				
				String Check_No=Check.getText();
				
				String Item_Name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
				
				
			
				
				String ActualAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
				
				String Void_Reason=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]")).getText();

				String Void_By=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[11]")).getText();

				test.log(LogStatus.INFO, "Node is : "+Node+" Check No is: "+Check_No+" Business Date is : "+Date+" Item Name is : "+Item_Name+" Amount is : "+ActualAmount+" Void Reason is : "+Void_Reason+" Void By : "+Void_By);
			
				
			}
		}
			
	}
    }

  }
