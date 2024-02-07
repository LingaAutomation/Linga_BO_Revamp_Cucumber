package StepDefinition;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

public class Dealer_Admin_Payments 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage rp=new ReportsPage();
	
	@Given("Open the Dealers - Payments home page BaseURL and StoreID")
	public void openTheDealersPaymentsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Department page
	
		
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"dealers/payments");
	}

	@Then("Check the Subscriptions is Displayed")
	public void checkTheSubscriptionsIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(5000);
	    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//div[@class='option-list']")), "Subscription Options Available");

	}
	
	@Then("Verify Subscriptions Report Generated or Not")
	public void verifySubscriptionsReportGeneratedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		
		try
		{
//			cmp.Assertion_Validation_True_Element(lap.Payment_Not_Found_InfoMsg);
			Assert.assertEquals(true, lap.Payment_Not_Found_InfoMsg,"Report not available");
			
			test.log(LogStatus.INFO, "Subscription Report not Available");
		}
		catch(Exception k)
		{
			
			test.log(LogStatus.PASS, "Subscription Report Available");
	    List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
	    int rowSize=rowList.size();
	    
	    if(rowSize<=5)
	    {
	    	for(int i=1;i<=rowSize;i++)
	    	{
	    	String Inv_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
	    	String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
	    	String Status=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
	    	String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
	    	
	    	
	    	test.log(LogStatus.INFO, "Invoice No : "+Inv_No+" Date : "+Date+" Status : "+Status+" Amount : "+Amount);
	    	}
	    	
	    }
	    else
	    {
	    	for(int i=1;i<=5;i++)
	    	{
	    	String Inv_No=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
	    	String Date=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
	    	String Status=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
	    	String Amount=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
	    	
	    	
	    	test.log(LogStatus.INFO, "Invoice No : "+Inv_No+" Date : "+Date+" Status : "+Status+" Amount : "+Amount);
	    	}
	    }
	    
	    
		}
	}

	@Given("I Search the Invoice and Click Download button")
	public void iSearchTheInvoiceAndClickDownloadButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		String Inv_No=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
		
		cmp.Search_inTable(Inv_No);
		
		Thread.sleep(3000);
		lap.Download_Icon_Btn.click();
	    
	}
	@Then("Verify whether the it is Navigating to Download Invoice URL or not")
	public void verifyWhetherTheItIsNavigatingToDownloadInvoiceURLOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		String Parentwin=driver.getWindowHandle();
		Set<String> currentWins=driver.getWindowHandles();
		
		for(String curWin:currentWins)
		{
			if(!curWin.equals(Parentwin))
			{
				driver.switchTo().window(curWin);
			}
		}
		
//	    String CurrentURL=driver.getCurrentUrl();
		String Title=driver.getTitle();
		
		cmp.Assertion_Validation_Two_Values(Title, "Test Organization", "Download URL Loaded");
		
		driver.close();
		
		driver.switchTo().window(Parentwin);
	}

	
}
