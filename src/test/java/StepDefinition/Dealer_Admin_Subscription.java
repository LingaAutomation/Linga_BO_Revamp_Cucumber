package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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

public class Dealer_Admin_Subscription 
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
	String UserName;
	Actions b = new Actions(driver);

	@Given("Open the Dealer - Subscriptions page BaseURL and StoreID")
	public void OpenDealerSubscriptionPage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"dealers/subscriptions");
		Thread.sleep(5000);
	}

	@Given("Verifying the Subscriptions Header Page")
	public void VerifySubscriptionHeaderPage() 
	{
		cmp.VerifyMainScreenPageHeader("Subscriptions");
	}

	@Given("Verifying the Path Admin \\/ Dealers \\/ Subscriptions Displayed above the Header")
	public void VerifytheHomePath()
	{
		String Admin = cmp.Home.getText();
		String Path1 = cmp.path1.getText();
		String Path2 = cmp.path2.getText();
		//String Path2 = ctp.path2().getText();

		String total = Admin+Path1+Path2;
		System.out.println(total);

		if(total.equalsIgnoreCase("Admin /Dealers / Subscription")) {

			test.log(LogStatus.PASS, "Subscription Home Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Subscription Home Path is not displayed");
		}
	}

	@Then("Check the Customer Name header in Subscriptions is Displayed")
	public void ChecktheCustomerNameHeaderisDisplayedOrNot() 
	{
		if(lap.CustomerNameHeader.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Customer Name Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Customer Name header not displayed");
		}
	}

	@Then("Check the Plan header in Subscriptions is Displayed")
	public void CheckPlanHeaderInSubscriptionisDisplayedOrNot() 
	{
		if(lap.PlanHeader.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Plan Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Plan header not displayed");
		}
	}

	@Then("Check the Status header in Subscriptions is Displayed")
	public void CheckStatusHeaderInSubscriptionisDisplayedOrNot() 
	{
		if(lap.StatusHeader.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Status Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status header not displayed");
		}
	}

	@Then("Check the Created Date header in Subscriptions is Displayed")
	public void ChecktheCreatedDateHeaderInSubscriptionIsDisplayedOrNot()
	{
		if(lap.CreatedDateHeader.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"CreatedDate Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"CreatedDate header not displayed");
		}
	}

	@Then("Check the Activated Date header in Subscriptions is Displayed")
	public void ChecktheActivatedDateHeaderDisplayedOrNot() 
	{
		if(lap.ActivatedDate.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"ActivatedDate Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"ActivatedDate header not displayed");
		}
	}

	@Then("Check the Amount header in Subscriptions is Displayed")
	public void VerifyAmountHeaderInSubscriptionIsDisplayedOrNot()
	{
		if(lap.Amount.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Amount Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Amount header not displayed");
		}
	}

	@Then("Check the Last Billing Date header in Subscriptions is Displayed")
	public void CheckLastBillingDateHeaderIsDisplayedOrNot() 
	{
		if(lap.LastBillingDate.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"LastBillingDate Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"LastBillingDate header not displayed");
		}
	}

	@Then("Check the Next Billing Date header in Subscriptions is Displayed")
	public void CheckNextBillingDateHeaderIsDisplayedOrNot() 
	{
		if(lap.NextBillingDate.isDisplayed()) 
		{
			test.log(LogStatus.PASS,"NextBillingDate Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"NextBillingDate header not displayed");
		}
	}

	@Then("Check Subscriptions not found Disclaimer is Displayed")
	public void CheckSubscriptionNotFoundErrorMsg() 
	{
		try {
			if(lap.SubscriptionNotFoundErrMsg().isDisplayed()) {
				test.log(LogStatus.PASS,"SubScription Not found Error message displayed if no data available");
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Subscriptions are available");
		}
	}

	@And("I Check Sorting Option Displayed in Customer Name header")
	public void CheckSortingOptionDisplayedInCustomerNameHeader() 
	{
		Actions a = new Actions(driver);

		a.moveToElement(lap.CustomerNameHeader).perform();

		if(driver.findElement(By.xpath("//div[.=' Customer Name ']/div[2]")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Sorting Option Customer Name Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Sorting Option for Customer Name Not Displayed");
		}
	}

	@And("I Check Sorting Option Displayed in Plan header")
	public void CheckSortingOptionDisplayedInPlanHeader()
	{
		b.moveToElement(lap.PlanHeader).perform();
		if(driver.findElement(By.xpath("//div[.=' Plan ']/div[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sorting Option For Plan Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Sorting Option For Plan Header Not Displayed");
		}
	}

	@And("I Check Sorting Option Displayed in Status header")
	public void CheckSortingOptionDisplayedInStatusHeader()
	{
		b.moveToElement(lap.StatusHeader).perform();
		if(driver.findElement(By.xpath("//div[.=' Status ']/div[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sorting Option For Status Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Sorting Option For Status Header Not Displayed");
		}
	}

	@And("I Check Sorting Option Displayed in Created Date header")
	public void CheckSortingOptionDisplayedInCreatedHeader()
	{
		b.moveToElement(lap.CreatedDateHeader).perform();
		if(driver.findElement(By.xpath("//div[.=' Created Date ']/div[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sorting Option For Created Date Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Sorting Option For Created Date Header Not Displayed");
		}
	}

	@And("I Check Sorting Option Displayed in Activated Date header")
	public void CheckSortingOptionDisplayedInActivatedDateHeader() 
	{
		b.moveToElement(lap.ActivatedDate).perform();
		if(driver.findElement(By.xpath("//div[.=' Activated Date ']/div[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sorting Option For Activated Date Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Sorting Option For Activated Date Header Not Displayed");
		}
	}

	@And("I Check Sorting Option Displayed in Amount header")
	public void CheckSortingOptionDisplayedInAmountHeader() 
	{
		b.moveToElement(lap.Amount).perform();
		if(driver.findElement(By.xpath("//div[.=' Amount ']/div[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sorting Option For Amount Header Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Sorting Option For Amount Header Not Displayed");
		}
	}

	@And("I Check Sorting Option Displayed in Last Billing Date header")
	public void CheckSortingOptionDisplayedInLAstBillingDateHeader()
	{
		b.moveToElement(lap.LastBillingDate).perform();
		if(driver.findElement(By.xpath("//div[.=' Last Billing Date ']/div[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sorting Option For LastBilling Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Sorting Option For LastBilling Not Displayed");
		}
	}

	@And("I Check Sorting Option Displayed in Next Billing Date header")
	public void CheckSortingOptionDisplayedInNextBillingDateHeader() 
	{
		b.moveToElement(lap.NextBillingDate).perform();
		if(driver.findElement(By.xpath("//div[.=' Next Billing Date ']/div[2]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Sorting Option For NextBilling Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Sorting Option For NextBilling Not Displayed");
		}
	}

	@Then("Verify the Subscriptions Reports are Generated or not")
	public void VerifySubscriptionsReportsGeneratedOrNot()
	{
		try {
			if(!lap.SubscriptionNotFoundErrMsg().isDisplayed()) 
			{
				test.log(LogStatus.PASS,"Subscription Reports Are Generated");
				List<WebElement> Subscriptions = driver.findElements(By.xpath("//tbody/tr"));
				int Subscriptionsize = Subscriptions.size();
				test.log(LogStatus.INFO,"available Subscription Report:"+Subscriptionsize);
			}
		}

		catch (Exception e) {
			test.log(LogStatus.INFO,"Subscription Reports are not available");
		}
	}

//	@Given("I Search the Trail Account")
//	public void SearchTheTrailAccount() throws Exception 
//	{
//		cmp.Search_inTable("trail");
//		try {
//			String Status = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
//
//			if(Status.equalsIgnoreCase("trail")) 
//			{
//				test.log(LogStatus.PASS,"Trail Account displayed");
//				int trailplansize = driver.findElements(By.xpath("//tbody/tr")).size();
//				test.log(LogStatus.INFO,"Total No of Trail Accounts :"+trailplansize);
//			}
//		}
//		catch (Exception e) {
//			if(lap.SubscriptionNotFoundErrMsg().isDisplayed()) {
//				test.log(LogStatus.INFO,"No Subscription available for trail plan");
//			}
//		}
//
//	}
//
//	@Then("Check the Plan as Pro Plan")
//	public void Check_Proplan()
//	{
//		try 
//		{
//			if(lap.SubscriptionNotFoundErrMsg().isDisplayed()) {
//				test.log(LogStatus.INFO,"No SUbscription available for Trail");
//			}
//		}
//		catch (Exception e) {
//			List<WebElement> PlanList = driver.findElements(By.xpath("//tbody/tr/td[2]"));
//
//			for(WebElement proplan:PlanList)
//			{
//				if(proplan.getText().equalsIgnoreCase("Pro")) 
//				{
//					UserName = driver.findElement(By.xpath("//tbody/tr/td[1]")).getText();
//					test.log(LogStatus.INFO,"Pro Plan CustomerName:"+UserName);
//				}
//			}
//		}
//	}
//
//	@Then("Verify Pro Plan and Details in Subscriptions Displayed or Not")
//	public void VerifyProPlanDetailsDisplayedInSubscriptionOrNot() throws Exception 
//	{
//		try {
//		cmp.Search_inTable(UserName);
//	
//			if(driver.findElement(By.xpath("//tbody/tr[1]")).isDisplayed()) 
//			{
//				String plan = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
//				if(plan.equalsIgnoreCase("Pro")) 
//				{
//					test.log(LogStatus.PASS,"Pro Plan Details displayed in Subscription");
//				}
//			}
//		}
//		catch (Exception e) {
//			test.log(LogStatus.INFO,"Subscription Not available");
//		}
//	}
	
	@Given("I Search the Trail Expired Account with Plan as Basic Plan")
	public void SearchTrailExpiredAccount() throws Exception 
	{
		cmp.Search_inTable("test sklfj");
	}
	
	@Then("Check the Plan as Basic Plan")
	public void VerifyPlanAsBase() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Basic Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Basic Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Plan as Basic Not displayed");
		}
	}
		
	@Then("Verify Trail Expired Basic Plan and Details in Subscriptions Displayed or Not")
	public void verifyBasicPlanandDetailsInSubscriptionDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Basic Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Basic Displayed for TrailExpired");
		}
		else {
			test.log(LogStatus.FAIL,"Plan as Basic Not displayed for TrailExpired");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("trial_expired"))
		{
			test.log(LogStatus.PASS,"Status As TrailExpired Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As TrailExpired Not Displayed");
		}
	}
	
	@Given("I Search the Trail Expired Account with Plan as Pro Plan")
	public void SearchTrailExpiredAccountwithPlanAsProPlan() throws Exception 
	{
		cmp.Search_inTable("Prodealer");
	}
	
	@Then("Check the Plan as Pro Plan")
	public void VerifyPlanAsPro() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Pro Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Pro Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Plan as Pro Not displayed");
		}
	}
	
	@Then("Verify Trail Expired Pro Plan and Details in Subscriptions Displayed or Not")
	public void verifyProPlanandDetailsInSubscriptionDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Pro Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Pro Displayed for TrailExpired");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Pro Not displayed for TrailExpired");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("trial_expired"))
		{
			test.log(LogStatus.PASS,"Status As TrailExpired Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As TrailExpired Not Displayed");
		}
	}
	
	@Given("I Search the Trail Expired Account with Plan as Enterprise Plan")
	public void TrailExpiredAccountWithPlanAsEnterprisePlan() throws Exception
	{
		cmp.Search_inTable("pazhamudir");
	}
	
	@Then("Check the Plan as Enterprise Plan")
	public void CheckPlanAsEnterprisePlan()
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Enterprises Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Enterprise Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Plan as Enterprise Not displayed");
		}
	}
	
	@Then("Verify Trail Expired Enterprise Plan and Details in Subscriptions Displayed or Not")
	public void verifyEterprisePlanandDetailsInSubscriptionDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Enterprises Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Enterprise Displayed for TrailExpired");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Enterprise Not displayed for TrailExpired");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("trial_expired"))
		{
			test.log(LogStatus.PASS,"Status As TrailExpired Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As TrailExpired Not Displayed");
		}
	}
	
	@Given("I Search the Cancelled Account with Plan as Core Plan")
	public void VerifyCancelledAccountwithPlanAsCore() throws Exception 
	{
		cmp.Search_inTable("pillow");
	}
	
	@Then("Check the Plan as Core Plan")
	public void CheckPlanAsCorePlan()
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Core Monthly Plan")) 
		{
			test.log(LogStatus.PASS,"Plan As Core Plan Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Plan as Core Plan Not displayed");
		}
	}
	
	@Then("Verify Cancelled Core Plan and Details in Subscriptions Displayed or Not")
	public void verifyCancelledCorePlanandDetailsInSubscriptionDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Core Monthly Plan")) 
		{
			test.log(LogStatus.PASS,"Plan As Core Monthly Displayed for Cancelled");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Core Monthly Not displayed for Cancelled");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("cancelled"))
		{
			test.log(LogStatus.PASS,"Status As Cancelled Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As Cancelled Not Displayed");
		}
	}
	
	@Given("I Search the Cancelled Account with Plan as Pro Plan")
	public void VerifyCancelledAccountwithplanAsPro() throws Exception 
	{
		cmp.Search_inTable("test place hold");
	}
	
	@Then("Verify Cancelled Pro Plan and Details in Subscriptions Displayed or Not")
	public void CancelledProPlanInSubscriptionDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Pro Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Pro Monthly Displayed for Cancelled");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Pro Monthly Not displayed for Cancelled");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("cancelled"))
		{
			test.log(LogStatus.PASS,"Status As Cancelled Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As Cancelled Not Displayed");
		}
	}
	
	@Given("I Search the Cancelled Account with Plan as Enterprise Plan")
	public void VerifyCancelledAccountWithPlanAsEnterprise() throws Exception 
	{
		cmp.Search_inTable("test dealer 3");
	}
	
	@Then("Verify Cancelled Enterprise Plan and Details in Subscriptions Displayed or Not")
	public void VerifyCancelledEnterprisePlanInSubscriptionIsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Enterprises Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Enterprise Monthly Displayed for Cancelled");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Enterprise Monthly Not displayed for Cancelled");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("cancelled"))
		{
			test.log(LogStatus.PASS,"Status As Cancelled Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As Cancelled Not Displayed");
		}
	}
	
	@Given("I Search the Cancelled Account with Plan as Linga One Plan")
	public void VerifyCancelledAccountAsLingaOnePlan() throws Exception 
	{
		cmp.Search_inTable("Honeybunch");
	}
	
	@Then("Check the Plan as Linga One Plan")
	public void CheckThePlanAsLingaOnePlan()
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Linga One Yearly")) 
		{
			test.log(LogStatus.PASS,"Plan As Linga One Plan Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Plan as Linga One Plan Not displayed");
		}
	}
	
	@Then("Verify Cancelled Linga One Plan and Details in Subscriptions Displayed or Not")
	public void LingaOnePlanInSubscriptionIsDiplayedOrNot()
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Linga One Yearly")) 
		{
			test.log(LogStatus.PASS,"Plan As Linga One Yearly Displayed for Cancelled");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Linga One Yearly Not displayed for Cancelled");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("cancelled"))
		{
			test.log(LogStatus.PASS,"Status As Cancelled Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As Cancelled Not Displayed");
		}
	}
	
	@Given("I Search the Live Account with Plan as Core Plan")
	public void SearchLiveAccountPlanAsCore() throws Exception
	{
		cmp.Search_inTable("noodles");
	}
	
	@Then("Verify Live Core Plan and Details in Subscriptions Displayed or Not")
	public void VerifyLiveCorePlanDetailsInSubscriptionIsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Core Monthly Plan")) 
		{
			test.log(LogStatus.PASS,"Plan As Core Plan Displayed for Live");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Core Not displayed for Live");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("live"))
		{
			test.log(LogStatus.PASS,"Status As Live Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As Live Not Displayed");
		}
	}
	
	@Given("I Search the Live Account with Plan as Pro Plan")
	public void SearchLiveAccountWithProPlan() throws Exception 
	{
		cmp.Search_inTable("BO-Revamp");
	}
	
	@Then("Verify Live Pro Plan and Details in Subscriptions Displayed or Not")
	public void VerifyProPlanDetailsInSubscriptionIsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Pro Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Pro Plan Displayed for Live");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Pro Plan Not displayed for Live");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("live"))
		{
			test.log(LogStatus.PASS,"Status As Live Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As Live Not Displayed");
		}
	}
	
	@Given("I Search the Live Account with Plan as Enterprise Plan")
	public void SearchLiveAccountWithPlanAsEnterprise() throws Exception 
	{
		cmp.Search_inTable("OLO Team Store");
	}
	
	@Then("Verify Live Enterprise Plan and Details in Subscriptions Displayed or Not")
	public void VerifyLiveEnterprisePlanDetailsInSubscriptionDisplayingOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Enterprises Yearly")) 
		{
			test.log(LogStatus.PASS,"Plan As Enterprise Plan Displayed for Live");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Enterprise Plan Not displayed for Live");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("live"))
		{
			test.log(LogStatus.PASS,"Status As Live Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As Live Not Displayed");
		}
	}
	
	@Given("I Search the Cancelled_from_dunning Account with Plan as Enterprise Plan")
	public void SearchCancelledFromDunningEnterprisePlan() throws Exception 
	{
		cmp.Search_inTable("pinkrain");
	}
	
	@Then("Verify Cancelled_from_dunning Enterprise Plan and Details in Subscriptions Displayed or Not")
	public void VerifyCancelledFromDunningEnterprisePlanInSubscriptionDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText().equalsIgnoreCase("Enterprises Monthly")) 
		{
			test.log(LogStatus.PASS,"Plan As Enterprise Plan Displayed for Cancelled From Dunning");
		}
		else {
			test.log(LogStatus.FAIL,"Plan As Enterprise Plan Not displayed for Cancelled From Dunning");
		}
		
		if(driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText().equalsIgnoreCase("cancelled_from_dunning"))
		{
			test.log(LogStatus.PASS,"Status As cancelled_from_dunning Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Status As cancelled_from_dunning Not Displayed");
		}
	}
}
