package StepDefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.BasePage;
import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dealer_Admin_Account_Details
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 
	public String parentWindow;


	Utility ut=new Utility();
	CategoriesPage ctp = new CategoriesPage();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lda = new Linga_and_Dealer_Admin_Page();
	
	
	@Given("Open the Dealer Account Details home page BaseURL and StoreID")
	public void OpenDealerAccountDetailsHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("Dealer_Base_URL")+"dashboard");
		Thread.sleep(5000);
		parentWindow = driver.getWindowHandle();
	}
	
	@When("Verify able to navigate to the Dealer Login page")
	public void VerifyAbletoNavigateToDelaerLoginPage() throws Exception
	{
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[.=' Login ']")).click();
		Thread.sleep(1000);
//		driver.close();
	}
	
	@And("I Navigate to Dealer Admin Account Details Page")
	public void NavigateToDelaerAdminAccountDetalsPage()
	{
		Set<String> windows = driver.getWindowHandles(); 
		System.out.println(windows); 
		System.out.println("a1"); 
		for (String window : windows)
		{ 
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
			}
		}
		try {
		Thread.sleep(3000); 
		cmp.VerifyMainScreenPageHeader("Account Detail");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

@Then("Verify wether the Stores Page Opened or not")
public void verifyWetherTheStoresPageOpenedOrNot() throws Exception {
    // Write codW
	Thread.sleep(3000);
	String parentWin=driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles(); 
	System.out.println(windows); 
	System.out.println("a1"); 
	for (String window : windows)
	{ 
		if(!window.equals(parentWin))
		{
			driver.switchTo().window(window);
		}
	}
	try {
	Thread.sleep(5000); 
//	cmp.VerifyMainScreenPageHeader("Account Detail");
	
	cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//span[contains(.,'Stores')]")), "Stores Page");
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	
	driver.switchTo().window(parentWin);
	Thread.sleep(3000);
	
}

	
	@When("I Navigate the Page to Back")
	public void iNavigateThePageToBack() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	   driver.navigate().back();
		Thread.sleep(5000);
	}
	
	@And("I Select the Account")
	public void SelectAccount() throws Exception 
	{
		driver.findElement(By.xpath("//input[@aria-label='Accounts']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//select-option/div)[5]")).click();
		
	}
	
//	@And("Check the Stores\\(Active\\/Inactive) Field is Displayed")
//	public void CheckStoresActiveInactiveField()
//	{
//		if(driver.findElement(By.xpath("//input[@aria-label='Stores(Active/Inactive)']")).isDisplayed())
//		{
//			test.log(LogStatus.PASS,"Stores(Active/Inactive) Field Displayed");
//		}
//		else 
//		{
//			test.log(LogStatus.FAIL,"Stores(Active/Inactive) Field Not Displayed");
//		}
//	}
	
	@Given("Check the Stores Active Inactive Field is Displayed")
	public void checkTheStoresActiveInactiveFieldIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.findElement(By.xpath("//input[@aria-label='Stores(Active/Inactive)']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Stores(Active/Inactive) Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Stores(Active/Inactive) Field Not Displayed");
		}
	}


	
	@Then("Verify Account Linked or Not")
	public void VerifyAccountLinkedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Account Linked Successfully"))
		{
			test.log(LogStatus.PASS,"Account Linked Successfully");
		}
		else {
			test.log(LogStatus.FAIL,"Account Not Linked Successfully");
		}
	}
	
	@And("I Select the Dealer in AccountDetails")
	public void SelectDelaer() throws Exception
	{
		driver.findElement(By.xpath("//input[@aria-label='Dealer']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//select-option/div)[5]")).click();
	}
	
	@Then("Verify Dealer Mapped or Not")
	public void VerifyDelaerMappedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Account mapped to the POS DEALER dealer successfully!.")) 
		{
			test.log(LogStatus.PASS,"Delaer Mapped Successfully");
		}
		else
		{
			test.log(LogStatus.FAIL,"Delaer Not Mapped Successfully");
		}
	}

}
