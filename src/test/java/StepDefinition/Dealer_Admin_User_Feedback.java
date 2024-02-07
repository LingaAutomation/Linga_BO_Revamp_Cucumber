package StepDefinition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.Availability_RestrictionTimePage;
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


public class Dealer_Admin_User_Feedback 
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

	@Given("Open the Dealer Admin - User Feedback home page BaseURL and storeID")
	public void OpenDealerAdminUserFeedbackHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"userFeedback");
	}

	@Given("Verifying the User Feedback Header Page")
	public void VerifyUserFeddbackHeaderpage() 
	{
		cmp.VerifyMainScreenPageHeader("User Feedback");
	}

	@Then("User Feedback not found is Displayed")
	public void VerifyUserFeedbackNotFounfMessage() 
	{
		try {
			if(lap.NoUserFeedbackFoundMessage().isDisplayed())
			{
				test.log(LogStatus.PASS,"User Feedback Not found message displayed when no Feedback is available");
			}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.FAIL,"User Feedback Not found message not displayed");
		}
	}
	
//	@When("I click on the user feedback module")
//	public void iClickOnTheUserFeedbackModule() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


	@Then("Check Date Created Field Displayed")
	public void CheckDateCreatedFiledDisplayedOrNot() 
	{
		lap.VerifyDateCreatedField();
	}

	@Then("Check Name Field Displayed")
	public void CheckNameFieldDisplayedOrNot()
	{
		lap.VerifyNameField();
	}

	@Then("Check Email ID Field Displayed")
	public void CheckEmailIDFieldDisplayedOrNot() 
	{
		lap.VerifyEmailField();
	}

	@Then("Check Account Name Displayed")
	public void CheckAccountNameFieldDisplayedOrNot()
	{
		lap.VerifyAccountNameField();
	}

	@Then("Check Store Name Displayed")
	public void CheckStoreNameDisplayedOrNot() 
	{
		lap.VerifyStoreNameField();
	}

	@Then("Check Product Rating Displayed")
	public void CheckProductRatingFieldDisplayedOrNot() 
	{
		lap.VerifyProductRatingField();
	}

	@Then("Check Support Rating Displayed")
	public void CheckSupportRatingFieldDisplayedOrNot() 
	{
		lap.VerifySupportRatingField();
	}

	@Then("Check Comment Displayed")
	public void CheckCommentFieldDisplayedOrNot() 
	{
		lap.VerifyCommentField();
	}

	@Then("Check Time Period is Defaultly Selected as Today")
	public void VerifyTimePeriodDefaultlySelectedAsToday() 
	{
		if(driver.findElement(By.xpath("//input[@aria-label='Time Period']")).getText().equalsIgnoreCase("Today")) 
		{
			test.log(LogStatus.PASS,"By Default time Period is selected as Today");
		}
		else {
			test.log(LogStatus.FAIL,"By Default TimePeriod is Not Seleced as Today");
		}
	}

	@Then("Verify Whether the date displayed is in Date-Month-Year format or not")
	public void VerifytheDateFormat()
	{
		try {
			String DateCreated = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span")).getText();
			System.out.println(DateCreated);
			SimpleDateFormat targetedDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			//		Date targetedDateCreated = targetedDateFormat.parse(DateCreated);
			//		Pattern DATE_PATTERN = Pattern.compile("^\\d{2}-\\");
			try {
				targetedDateFormat.parse(DateCreated);
				test.log(LogStatus.PASS,"Date Format is Valid it dispaying in Reuired Format");
			}

			catch (Exception e) {
				test.log(LogStatus.FAIL,"Date Format is not valid");
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"For Time Period No Data Available for User Feedback");
		}
	}

//	@And("I Select the Time Period as Today")
//	public void SelectTimePeriodAsToday() throws Exception 
//	{
//		rp.Select_Today_TimePeriod();
//	}

//	@And("I Click the Apply button")
//	public void ClickApplyButton()
//	{
//		rp.Click_ApplyButton();
//	}

	@Then("Verify User Feedback Report generated for Selected Time Period or Not")
	public void VerifyUserFeedbackGeneratedForSelectedTimePeriodOrNot() 
	{
		try {
			if(lap.NoUserFeedbackFoundMessage().isDisplayed()) 
			{
				test.log(LogStatus.INFO,"No User Feedback available for selected Time Period");
			}
		}
		catch (Exception e) {
			List<WebElement> AvailableFeedback = driver.findElements(By.xpath("//tbody/tr"));
			int FeedbackSize = AvailableFeedback.size();
			test.log(LogStatus.PASS,"Available User Feedback :"+FeedbackSize);
		}
	}

//	@And("I Select the Time Period as Yesterday")
//	public void SelectTimePeriodYesterday() throws Exception 
//	{
//		rp.Select_Yesterday_TimePeriod();
//	}
//
//	@And("I Select the Time Period as Last N Days")
//	public void SelectTimeperiodAsLastNDays() throws Exception 
//	{
//		rp.Select_Last_N_Days_TimePeriod("1000");
//	}
//
//	@And("I Select the Time Period as This Week")
//	public void SelectTimeperiodAsThisWeek() throws Exception 
//	{
//		rp.Select_This_Week_TimePeriod();
//	}
//
//	@And("I Select the Time Period as Last Week")
//	public void SelectTimeperiodAsLastWeek() throws Exception 
//	{
//		rp.Select_Last_Week_TimePeriod();
//	}
//
//	@And("I Select the Time Period as Last Seven days")
//	public void SelectTimeperiodasLastSevenDays() throws Exception
//	{
//		rp.Select_Last_7_Days_TimePeriod();
//	}
//
//	@And("I Select the Time Period as This Month")
//	public void SelectTimeperiodasThisMonth() throws Exception 
//	{
//		rp.Select_This_Month_TimePeriod();
//	}
//
//	@And("I Select the Time Period as Last Month")
//	public void SelectTimePeriodasLastMonth() throws Exception 
//	{
//		rp.Select_Last_Month_TimePeriod();
//	}
//
//	@And("I Select the Time Period as Last Thirty days")
//	public void SelectTimePeriodAsLastThirtyDays() throws Exception 
//	{
//		rp.Select_Last_30_Days_TimePeriod();
//	}
//
//	@And("I Select the Time Period as Specific Date")
//	public void SelectTimePeriodAsSpecificDate() throws Exception {
//		rp.Select_Specific_Date_TimePeriod(Utility.getProperty("DealerFeedbackSpecificDate"));
//	}
//
//	@And("I Select the Time Period as Date Range")
//	public void SelectTimePeriodAsDateRange() throws Exception 
//	{
//		rp.Select_Date_Range_TimePeriod(Utility.getProperty("DealerFeedbackStartDate"), Utility.getProperty("DealerFeedbackEndDate"));
//	}
}
