package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Linga_Admin_Dashboard 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage repts=new ReportsPage();
	
	@Given("Open the Linga Admin - Dashboard BaseURL and StoreID")
	public void openTheLingaAdminDashboardBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Department page

		
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"dashboard");
	}
	
	@Then("Check the Total Stores Tile is Displayed")
	public void checkTheTotalStoresTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Total_Stores_Tile, "Total Stores Tile");
	}

	@Then("Check the Linga One Tile is Displayed")
	public void checkTheLingaOneTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Linga_One_Tile, "Linga One Tile");
	}

	@Then("Check the On Trial\\/ Trial Expired Tile is Displayed")
	public void checkTheOnTrialTrialExpiredTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.On_Trail_Trail_Expired_Tile, "On Trail/Trail Expired Tile");
	}
	
	@Then("Check the Linga Online Order Tile is Displayed")
	public void checkTheLingaOnlineOrderTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Linga_Online_Order_Tile, "Linga Online Order Tile");
	}

	@Then("Check the Unpaid Tile is Displayed")
	public void checkTheUnpaidTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Unpaid_Tile, "Unpaid Tile");
	}



	@Then("I Check Stores by Business Types Graph is Displayed")
	public void iCheckStoresByBusinessTypesGraphIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Stores_by_BustinessTypes_Graph, "Stores By Business Type Graph");
	}

	@Then("I Check Stores by Status Graph is Displayed")
	public void iCheckStoresByStatusGraphIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Stores_by_Status_Graph, "Stores By Status Graph");
	}

	@Given("I Select the Online Ordering Tab")
	public void iSelectTheOnlineOrderingTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Select_Online_Ordering_Tab();
	}
	@Given("Check the Web Order Sales Tile is Displayed")
	public void checkTheWebOrderSalesTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Web_Order_Sales_Tile, "Web Order Sales Tile");
	}
	@Given("Check the Mobile Sales Tile is Displayed")
	public void checkTheMobileSalesTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Mobile_Sales_Tile, "Mobile Sales Tile");
	}
	@Given("Check the Call Centre Sales Tile is Displayed")
	public void checkTheCallCentreSalesTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Call_Centre_Sales_Tile, "Call Centre Sales Tile");
	}
	@Given("Check the Total Sales Tile is Displayed")
	public void checkTheTotalSalesTileIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Total_Sales_Tile, "Total Sales Tile");
	}


	@Given("I Select the Time Period as Date Range")
	public void iSelectTheTimePeriodAsDateRange() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Date_Range_TimePeriod(Utility.getProperty("Report_Start_Date"), Utility.getProperty("Report_End_Date"));
	}
	@Given("I Select the Web Order Sales Tile")
	public void iSelectTheWebOrderSalesTile() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_Button(lap.Web_Order_Sales_Tile, "Web Order Sales Tile is Selected");
	}

	@Given("I Select the Time Period as Today")
	public void iSelectTheTimePeriodAsToday() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Today_TimePeriod();
	}
	@Then("Verify User Web Order Sales Report generated for Selected Time Period or Not")
	public void verifyUserWebOrderSalesReportGeneratedForSelectedTimePeriodOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		try
		{
	    if(repts.No_Records_FoundInfoMessage().isDisplayed())
	    {
	    	test.log(LogStatus.INFO, "No Records available for Web Order Sales in this Selected Time Period");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    }
	    }
	    catch(Exception k)
	    {
	    	test.log(LogStatus.PASS, "Web Order Sales Report Available for this Selected Time Period");
	    	
	    	Thread.sleep(2000);
	    	
	    	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	    	
	    	int rowSize=rowList.size();
	    	
	    	for(int i=1;i<=rowSize;i++)
	    	{
	    		
	    		String Pickup_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
	    		String Delivery_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
	    		String Total_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
	    		String Pickup_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
	    		String Delivery_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
	    		String Total_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

	    		test.log(LogStatus.INFO, "Pickup Order Count : "+Pickup_OrderCount+" Pickup Order Amount : "+Pickup_OrderAmount);
	    		test.log(LogStatus.INFO, "Delivery Order Count : "+Delivery_OrderCount+" Delivery Order Amount : "+Delivery_OrderAmount);
	    		test.log(LogStatus.INFO, "Total Order Count : "+Total_OrderCount+" Total Order Amount : "+Total_OrderAmount);
	
	    		
	    	}
	    	
	    	
	    }
	}
	@Given("I Select the Time Period as Yesterday")
	public void iSelectTheTimePeriodAsYesterday() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Yesterday_TimePeriod();
	}
	
	@Given("I Select the Time Period as Last N Days")
	public void iSelectTheTimePeriodAsLastNDays() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Last_N_Days_TimePeriod(Utility.getProperty("Last_N_Days"));
	}

	@Given("I Select the Time Period as This Week")
	public void iSelectTheTimePeriodAsThisWeek() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_This_Week_TimePeriod();
	}

	@Given("I Select the Time Period as Last Week")
	public void iSelectTheTimePeriodAsLastWeek() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Last_Week_TimePeriod();
	}

	@Given("I Select the Time Period as Last Seven days")
	public void iSelectTheTimePeriodAsLastSevenDays() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Last_7_Days_TimePeriod();
	}

	@Given("I Select the Time Period as This Month")
	public void iSelectTheTimePeriodAsThisMonth() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_This_Month_TimePeriod();
	}

	@Given("I Select the Time Period as Last Month")
	public void iSelectTheTimePeriodAsLastMonth() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.Select_Last_Month_TimePeriod();
	}
	

@Given("I Select the Time Period as Last Thirty days")
public void iSelectTheTimePeriodAsLastThirtyDays() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    repts.Select_Last_30_Days_TimePeriod();
}

@Given("I Select the Time Period as Specific Date")
public void iSelectTheTimePeriodAsSpecificDate() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    repts.Select_Specific_Date_TimePeriod(Utility.getProperty("Report_Specific_Date"));
}

@Given("I Select the Mobile Sales Tile")
public void iSelectTheMobileSalesTile() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_Button(lap.Mobile_Sales_Tile, "Mobile Sales Tile is Selected");
}


@Then("Verify User Mobile Sales Report generated for Selected Time Period or Not")
public void verifyUserMobileSalesReportGeneratedForSelectedTimePeriodOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	try
	{
    if(repts.No_Records_FoundInfoMessage().isDisplayed())
    {
    	test.log(LogStatus.INFO, "No Records available for Mobile Sales in this Selected Time Period");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    }
}
catch(Exception k)
    {
    	test.log(LogStatus.PASS, "Mobile Sales Report Available for this Selected Time Period");
    	
    	Thread.sleep(2000);
    	
    	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
    	
    	int rowSize=rowList.size();
    	
    	for(int i=1;i<=rowSize;i++)
    	{
    		
    		String Pickup_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
    		String Delivery_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
    		String Total_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
    		String Pickup_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
    		String Delivery_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
    		String Total_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

    		test.log(LogStatus.INFO, "Pickup Order Count : "+Pickup_OrderCount+" Pickup Order Amount : "+Pickup_OrderAmount);
    		test.log(LogStatus.INFO, "Delivery Order Count : "+Delivery_OrderCount+" Delivery Order Amount : "+Delivery_OrderAmount);
    		test.log(LogStatus.INFO, "Total Order Count : "+Total_OrderCount+" Total Order Amount : "+Total_OrderAmount);

    		
    	}
    	
    	
    }
}
@Given("I Select the Call Centre Tile")
public void iSelectTheCallCentreTile() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_Button(lap.Call_Centre_Sales_Tile, "Call Centre Sales Tile is Selected");
}

@Then("Verify User Call Centre Report generated for Selected Time Period or Not")
public void verifyUserCallCentreReportGeneratedForSelectedTimePeriodOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	try
	{
    if(repts.No_Records_FoundInfoMessage().isDisplayed())
    {
    	test.log(LogStatus.INFO, "No Records available for Call Centre Sales in this Selected Time Period");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    }
}
catch(Exception k)
    {
    	test.log(LogStatus.PASS, "Call Centre Sales Report Available for this Selected Time Period");
    	
    	Thread.sleep(2000);
    	
    	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
    	
    	int rowSize=rowList.size();
    	
    	for(int i=1;i<=rowSize;i++)
    	{
    		
    		String Pickup_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
    		String Delivery_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
    		String Total_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
    		String Pickup_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
    		String Delivery_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
    		String Total_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

    		test.log(LogStatus.INFO, "Pickup Order Count : "+Pickup_OrderCount+" Pickup Order Amount : "+Pickup_OrderAmount);
    		test.log(LogStatus.INFO, "Delivery Order Count : "+Delivery_OrderCount+" Delivery Order Amount : "+Delivery_OrderAmount);
    		test.log(LogStatus.INFO, "Total Order Count : "+Total_OrderCount+" Total Order Amount : "+Total_OrderAmount);

    		
    	}
    	
    	
    }
}
@Given("I Select the Total Sales Tile")
public void iSelectTheTotalSalesTile() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_Button(lap.Total_Sales_Tile, "Total Sales Tile is Selected");
}
@Then("Verify User Total Sales Report generated for Selected Time Period or Not")
public void verifyUserTotalSalesReportGeneratedForSelectedTimePeriodOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	try
	{
    if(repts.No_Records_FoundInfoMessage().isDisplayed())
    {
    	test.log(LogStatus.INFO, "No Records available for Total Sales in this Selected Time Period");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    }
}
catch(Exception k)
    {
    	test.log(LogStatus.PASS, "Total Sales Report Available for this Selected Time Period");
    	
    	Thread.sleep(2000);
    	
    	List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
    	
    	int rowSize=rowList.size();
    	
    	for(int i=1;i<=rowSize;i++)
    	{
    		
    		String Pickup_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
    		String Delivery_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
    		String Total_OrderCount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
    		String Pickup_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[6]")).getText();
    		String Delivery_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]")).getText();
    		String Total_OrderAmount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).getText();

    		test.log(LogStatus.INFO, "Pickup Order Count : "+Pickup_OrderCount+" Pickup Order Amount : "+Pickup_OrderAmount);
    		test.log(LogStatus.INFO, "Delivery Order Count : "+Delivery_OrderCount+" Delivery Order Amount : "+Delivery_OrderAmount);
    		test.log(LogStatus.INFO, "Total Order Count : "+Total_OrderCount+" Total Order Amount : "+Total_OrderAmount);

    		
    	}
    	
    	
    }
}

}
