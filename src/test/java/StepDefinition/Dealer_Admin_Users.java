package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.Pages.UserManagementPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Dealer_Admin_Users {
	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage rp=new ReportsPage();
	
	String Existing_Email;
	
	UserManagementPage usm=new UserManagementPage();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
	
	@Given("Open the Dealer Admin - Users home page BaseURL")
	public void openTheDealerAdminUsersHomePageBaseURL() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Department page
	
		
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"users");
	}


	@Given("I Enter the Dealer User First Name")
	public void iEnterTheDealerUserFirstName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		usm.Enter_FirstName("D"+Utility.getProperty("User_FirstName"));
	}
	@Then("I Enter the Dealer User Last Name")
	public void iEnterTheDealerUserLastName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 usm.Enter_LastName(Utility.getProperty("User_LastName"));
	}
	@Then("I Enter the Dealer User Email ID")
	public void iEnterTheDealerUserEmailID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		usm.Enter_Email_ID("d"+Utility.getProperty("User_Email_ID"));
	}
	@Given("I Enter the Confirm Password")
	public void iEnterTheConfirmPassword() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Enter_Confirm_Password("Raja@9220");
	}
	@Then("Check Confirm Password Should Be Matched With Password Error is Displayed")
	public void checkConfirmPasswordShouldBeMatchedWithPasswordErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Element_or_Text_Displayed(lap.Confirm_Password_Should_Match_Password_ErrorMsg, "Confirm Password Should Be Matched With Password Error");
	}
	@Given("I Enter the Password")
	public void iEnterThePassword() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		lap.Enter_Password("Raja@9220");
	}
	@Given("I Enter the Invalid Confirm Password")
	public void iEnterTheInvalidConfirmPassword() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		lap.Enter_Confirm_Password("Raja");
	}
	@Given("I Select the Access")
	public void iSelectTheAccess() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown(lap.Access_InputBx, "Access Selected");
	}

	@Given("I Search and Edit the Dealer User")
	public void iSearchAndEditTheDealerUser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit("D"+Utility.getProperty("User_FirstName"));
	}
	
	@Given("I Search the Dealer User and Click the Delete button")
	public void iSearchTheDealerUserAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickDelete("D"+Utility.getProperty("User_FirstName"));
	}
	
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Dealer User")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedDealerUser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search("D"+Utility.getProperty("User_FirstName"));
	}

@Given("I Search the Dealer User and Click the Active button")
public void iSearchTheDealerUserAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.SearchAndClickActivate("D"+Utility.getProperty("User_FirstName"));
}

@Then("I Click the Active button to navigate Activated screen to Verify Activated Dealer User")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedDealerUser() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	//Verify whether the Gratuity activated or not
	cmp.Verify_Search("D"+Utility.getProperty("User_FirstName"));
}



}
