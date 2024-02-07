package StepDefinition;

import org.openqa.selenium.WebDriver;

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

public class Linga_Admin_User_Feedback 
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

	
	@Given("Open the Linga Admin - User Feedback home page BaseURL and storeID")
	public void OpenLingaAdminUserFeedbackHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"userFeedback");
	}
	

}
