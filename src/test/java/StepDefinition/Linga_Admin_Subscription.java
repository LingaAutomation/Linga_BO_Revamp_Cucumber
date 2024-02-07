package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import com.Pages.CategoriesPage;
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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Linga_Admin_Subscription 
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
	
	@Given("Open the Linga Admin - Subscriptions page page BaseURL and StoreID")
	public void OpenLingaAdminSubscriptionHomePage() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"dealers/subscriptions");
		Thread.sleep(5000);
		
	}
	
	@Given("Verify Subscriptions Selected From Dealer Drop down Box or Not")
	public void VerifySubscriptionSelectedFromDealerDropdownBoxorNot() throws Exception
	{
      // cmp.Click_Wait_ForElementClickable(lap.Dealer_DropdownInputBox,50);
		Thread.sleep(1000);
		lap.Click_DealerDropdown();
		Thread.sleep(500);
		if(driver.findElement(By.xpath("//select-option/div")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Able to Select Subscription From Dealer Dropdown");
		}
		else {
			test.log(LogStatus.FAIL,"Not able to select Subscription from Delaer Dropdown");
		}
		lap.Click_DealerDropdown();
	}
	
//	@Then("Check Dealers Field is Displayed")
//	public void CheckDealersField() throws Exception 
//	{
//		Thread.sleep(5000);
//		if(lap.Dealer_DropdownInputBox.isDisplayed()) 
//		{
//			test.log(LogStatus.PASS,"Dealers Field Displayed");
//		}
//		else {
//			test.log(LogStatus.FAIL,"Delaers Field Not Displayed");
//		}
//	}
	
//	@And("I Click the Dealer")
//	public void ClickDealerDropdown() throws Exception 
//	{
//		Thread.sleep(5000);
//		lap.Click_DealerDropdown();
//	}
	
//	@Then("Verify whether the Search bar is Displayed")
//	public void VerifySearchBar() throws Exception 
//	{
//		Thread.sleep(2000);
//		if(lap.SearchBar.isDisplayed())
//		{
//			test.log(LogStatus.PASS,"Search Bar Displayed in Dealer Dropdown");
//		}
//		else {
//			test.log(LogStatus.FAIL,"Search Bar Not Displayed");
//		}
//	
//	}
	
	@And("I Verify Searching the Item when entering three letters By DealerName")
	public void SearchAndVerifyDealerName() throws Exception 
	{
		Thread.sleep(2000);
		lap.SearchAndVerify_DropdownSearchBox();
		Thread.sleep(500);
		if(lap.First_Element.isDisplayed())
		{
			test.log(LogStatus.PASS, "Searched Dealer displayed when entering 3 Characters in Search Box");
		}
		else
		{
			test.log(LogStatus.FAIL, "Searched Dealer not displayed when entering 3 Characters in Search box");
		}
		lap.Click_DealerDropdown();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@And("I Select the Dealer with Core Plan with Trail")
	public void Select_TheDelaerWithCorePlanWithTrail() throws Exception 
	{
		lap.SelectDealerFromDropdown("chennai");
		Thread.sleep(500);
		Thread.sleep(500);
		driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div[1]//select-option")).click();
		Thread.sleep(2000);
		cmp.Search("fghjgf");
	}
	
	
	@Then("Verify Trail Core Plan and Details in Subcription Displayed or Not")
	public void VerifyCoreplanandDetailsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Core Monthly Plan")) 
		{
			test.log(LogStatus.PASS,"Plan As Core Displayed for Trail");
		}
		else {
			test.log(LogStatus.FAIL,"Plan as core Not displayed for Trail");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("trial"))
		{
			test.log(LogStatus.PASS,"Status As Trail Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As Trail Not Displayed");
		}
	}
	
	@Given("I Select the Dealer with Basic Plan with Trail Expired")
	public void SelectDelaerWithBasicPlanWithTrailExpired() throws Exception 
	{
		cmp.Search("senthil test");
	}
	
	
	@Given("I Select the Dealer with Pro Plan with Trail Expired")
	public void SelectDealerWithProPlanwithTarilExpired() throws Exception 
	{
		cmp.Search("testlinga5");
	}
	
	@Given("I Select the Dealer with Enterprise Plan with Trail Expired")
	public void SelectDelaerWithEnterprisePlanTrailExpired() throws Exception 
	{
		cmp.Search("Linga Burger");
	}
	
	@Given("I Select the Dealer with Core Plan with Cancelled")
	public void SelectDealerWithCorePlanWithCancelled() throws Exception 
	{
		cmp.Search("yakacik-kartal");
	}
	
	@Given("I Select the Dealer with Pro Plan with Cancelled")
	public void SelectDealerWithProPlanCancelled() throws Exception
	{
		cmp.Search("test place hold");
	}
	
	@Given("I Select the Dealer with Enterprise Plan with Cancelled")
	public void SelectDealerWithEnterprisePlanWithCancelled() throws Exception 
	{
		cmp.Search("test the page3");
	}
	
	@Given("I Select the Dealer with Linga One Plan with Cancelled")
	public void SelectDealerWithLingaonePlanWithCancelled() throws Exception 
	{
		cmp.Search("Honeybunch");
	}
	
	@Given("I Select the Dealer with Core Plan with Live")
	public void SelectDealerWithCorePlanWithLive() throws Exception 
	{
		lap.SelectDealerFromDropdown("POS DEALER");
		Thread.sleep(500);
		driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div[1]//select-option")).click();
		Thread.sleep(2000);
		Thread.sleep(500);
		cmp.Search("noodles");
	}
	
	@Given("I Select the Dealer with Pro Plan with Live")
	public void SelectDealerWithProPlanWithLive() throws Exception 
	{
		cmp.Search("Core Store");
	}
	
	@Given("I Select the Dealer with Enterprise Plan with Live")
	public void SelectDealerWithEnterprisePlanWithLive() throws Exception 
	{
		cmp.Search("BO-Revamp");
	}
	
	@Given("I Select the Dealer with Enterprise Plan with Cancelled_from_dunning")
	public void SelectDealerWithEnterprisePlanWithCancelledFromdunning() throws Exception
	{
		cmp.Search("pinkrain");
	}
	
	@Given("I Select Dealer in Dealer without Subscriptions")
	public void SelectDealerWithoutSubscription() throws Exception 
	{
		lap.SelectDealerFromDropdown("horse");
		Thread.sleep(500);
		driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div[1]//select-option")).click();
		Thread.sleep(2000);
	}
	
	@Then("Verify Subscriptions not found Displayed or Not")
	public void VerifySubscriptionNotFoundDisplayedOrNot() 
	{
		if(lap.SubscriptionNotFoundErrMsg().isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Subscription Not Found Message Displayed When we select dealer without subscription");
		}
		else {
			test.log(LogStatus.FAIL,"Subscription Not found message not displayed when we select Dealer without subscription");
		}
	}

}
