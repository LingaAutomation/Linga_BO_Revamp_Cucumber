package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.Settings_RevenueCenter_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Revenue_Center 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_RevenueCenter_Page rvc=new Settings_RevenueCenter_Page();
	
	public static String Node_No;
	
	@Given("Open the Settings - Revenue Center home page BaseURL and StoreID")
	public void openTheSettingsRevenueCenterHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"revenueCenter");

	}
	@Given("Verifying the Revenue Center Header Page")
	public void verifyingTheRevenueCenterHeaderPage() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("Revenue Center");
	}
	@Given("Click the New Revenue Center button")
	public void clickTheNewRevenueCenterButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    rvc.New_Revenue_Button.click();
	}
	@When("Verify the New Revenue Center Header")
	public void verifyTheNewRevenueCenterHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("New Revenue Center");
	}
	@Then("Check Nodes Field in Table is Displayed")
	public void checkNodesFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(rvc.Nodes_Column_Field, "Nodes in Table Field");
	}
	@Given("I Enter the Revenue Center Name Exceeding the limit")
	public void iEnterTheRevenueCenterNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}
	@Given("I Select Nodes")
	public void iSelectNodes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch_MultipleSelection(rvc.Select_NodesInputBx, "Nodes is Selected");
	}
	@Given("I Enter the Revenue Center Name")
	public void iEnterTheRevenueCenterName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Settings_Store_Revenue_Center_Name1"));
	}
	@Then("Verify whether Revenue Center Saved or Not")
	public void verifyWhetherRevenueCenterSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Revenue Center Saved");
	}
	@Given("I Search and Edit the Revenue Center")
	public void iSearchAndEditTheRevenueCenter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit(Utility.getProperty("Settings_Store_Revenue_Center_Name1"));
	}
	@When("Verify the Update Revenue Center Header")
	public void verifyTheUpdateRevenueCenterHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("Update Revenue Center");
	}

	@Then("I Verify Revenue Center Update screen Close or Not")
	public void iVerifyRevenueCenterUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Close_Cancel_CreationScreen("Update Revenue Center");
	}
	@Given("I Remove Nodes")
	public void iRemoveNodes() {
	    // Write code here that turns the phrase above into concrete actions
	    rvc.Close_Icon_InNodesDropDownIputBx.click();
	}
	@Given("Verify whether Revenue Center Updated or Not")
	public void verifyWhetherRevenueCenterUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Revenue Center Updated");
	}
	@Then("Verify whether the Duplicate Revenue Center is Saved or Not")
	public void verifyWhetherTheDuplicateRevenueCenterIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Assertion_Validation_Two_Values(cmp.ConfirmationAlertMsg().getText(), "Revenue Center Name already exist", "");
	    
		Thread.sleep(2000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Revenue Center Name already exist"))
		{
			test.log(LogStatus.PASS, "Revenue Center Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Revenue Center Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Revenue Center Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Revenue Center Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	    
	}
	@Then("Verify the Available Revenue Center is Displayed or Not")
	public void verifyTheAvailableRevenueCenterIsDisplayedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndVerify_SearchBox();
	}
	@When("I Enter the New Revenue Center Name with Special Characters")
	public void iEnterTheNewRevenueCenterNameWithSpecialCharacters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName("&&&***");
	}
	@When("I Enter the New Revenue Center Name with Space")
	public void iEnterTheNewRevenueCenterNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.EnterName(Utility.getProperty("Settings_Store_Revenue_Center_Name1")+Keys.SPACE);
	}
	@Given("I Navigate to Setings - Store License Page")
	public void iNavigateToSetingsStoreLicensePage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.SearchBox.clear();
		cmp.SearchBox.sendKeys(Utility.getProperty("Settings_Store_Revenue_Center_Name1"));
		
		String Node=driver.findElement(By.xpath("//span[contains(.,'"+Utility.getProperty("Settings_Store_Revenue_Center_Name1")+"')]/../../td[2]/p[1]")).getText().substring(0, 4).trim();
		System.out.println("Node number is : "+Node);
		this.Node_No=Node;
		
		Thread.sleep(1000);
		driver.get(Utility.getProperty("baseURL")+"settings/"+"storeLicenses");
	}
	@Given("I Search the Revenue Center Node and Click the Sign Out button")
	public void iSearchTheRevenueCenterNodeAndClickTheSignOutButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
//	    rvc.Search_And_SignOut(Node_No);
		Thread.sleep(1000);
		cmp.SearchBox.clear();
		Thread.sleep(500);
		cmp.SearchBox.sendKeys(Node_No);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'"+Node_No+"')]/../../td//button[@aria-label='Sign Out']")).click();
	
	}
	@Then("I Verifying the Revenue Center Configured Nodes is Deleted or not")
	public void iVerifyingTheRevenueCenterConfiguredNodesIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(3000);
	    cmp.Assertion_Validation_Two_Values(cmp.ConfirmationAlertMsg().getText(), "This Node is configured in 'Revenue Center'. could not unsync.", "This Node is configured in 'Revenue Center' Error is Displayed as Expected");
	}
	@Given("I Search the Revenue Center and Click the Delete button")
	public void iSearchTheRevenueCenterAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("Settings_Store_Revenue_Center_Name1"));
		
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Revenue Center Deleted\\/Inactivated or Not")
	public void verifyTheCancelledRevenueCenterDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Revenue Center Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Revenue Center Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Revenue Center Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Revenue Center not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Verifying the Revenue Center Deleted or Not")
	public void iVerifyingTheRevenueCenterDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   cmp.VerifySaveConfirmationAlertMessage("Revenue Center Deleted");
	}
}
