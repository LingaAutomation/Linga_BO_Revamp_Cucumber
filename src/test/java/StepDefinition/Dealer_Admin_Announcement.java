package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.Pages.Availability_RestrictionTimePage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Dealer_Admin_Announcement 
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
	Availability_RestrictionTimePage al = new Availability_RestrictionTimePage();

	@Given("Open the Dealer Admin - Announcement home page BaseURL and StoreID")
	public void OpenTheDealerAdminAnnouncementHomePageBaseURLAndStoreID() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"announcements");
	}
	@Given("Verifying the Announcement Header Page")
	public void verifyingTheAnnouncementHeaderPage() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyMainScreenPageHeader("Announcements");
	}

	@When("I Enter Text in Announcement Content")
	public void iEnterTextInAnnouncementContent() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_Announcement_InputBox("This is Announcementf for the Admin");
	}

	@Given("I Remove the Image")
	public void iRemoveTheImage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Actions ac=new Actions(driver);
	    ac.moveToElement(lap.Uploaded_Image_Icon).build().perform();
	    
	    Thread.sleep(1000);
	    lap.Delete_Icon_In_Image.click();
	}
	@Then("Verify the Image is Removed or not")
	public void verifyTheImageIsRemovedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Assertion_Validation_False_Element(lap.Uploaded_Image_Icon);
	}
	
	@When("I Change the From Date")
	public void iChangeTheFromDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Select_FromDate();
	}
	@When("I Change the To Date")
	public void iChangeTheToDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Select_ToDate();
	}

	@When("I Change the From Time")
	public void iChangeTheFromTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Select_FromTime("10", "20", al.AM_Btn);
	}
	@When("I Change the To Time")
	public void iChangeTheToTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		lap.Select_ToTime("11", "30", al.AM_Btn);
	}


	
//	@Given("Open Dealer Announcement home page BaseURL and StoreID")
//	public void OpenDelaer_AnnouncementPage() throws Exception 
//	{
//		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"announcements");
//	}
}
