package StepDefinition;

import java.util.Set;

import org.testng.Assert;

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

public class Dealer_Admin_Shop 
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
	String parentWin;

@Given("Open the Dealer - Dashboard BaseURL and StoreID")
public void openTheDealerDashboardBaseURLAndStoreID() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(10000);
	//Load the Department page

	
	lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"dashboard");
}
@Then("Verifying the Dashboard Header Page")
public void verifyingTheDashboardHeaderPage() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyMainScreenPageHeader("Dashboard");
}

@Given("I Select Shop Module")
public void iSelectShopModule() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    lap.Select_Shop_Option_inModule();
}
@Then("Verify URL as https:\\/\\/shop.lingaros.com\\/ Opened or Not")
public void verifyURLAsHttpsShopLingarosComOpenedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	String ParentWind=driver.getWindowHandle();
	Set<String> childwins=driver.getWindowHandles();
	
	for(String ChildWin:childwins)
	{
		if(!ChildWin.equals(ParentWind))
		{
			driver.switchTo().window(ChildWin);
		}
	}
	
	this.parentWin=ParentWind;
	
    String GetCurrentURL=driver.getCurrentUrl();
    
    Assert.assertEquals(GetCurrentURL, "https://shop.lingaros.com/", "Shopping URL is Navigated Successfully");
}

@Then("Verifying the Shop Header Page")
public void verifyingTheShopHeaderPage() {
    // Write code here that turns the phrase above into concrete actions
	String pageTitle=driver.getTitle();
	
    Assert.assertEquals(pageTitle, "POS Hardware and Supplies - LINGA STORE", "Shopping Opened Successfully");
    
    driver.close();
    
    driver.switchTo().window(parentWin);
}



}
