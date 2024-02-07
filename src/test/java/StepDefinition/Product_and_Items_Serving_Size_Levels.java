package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ServingSizeLevelsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Product_and_Items_Serving_Size_Levels {

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	ServingSizeLevelsPage ssl=new ServingSizeLevelsPage();
	
	String ServingSize_withCat_Menu;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	@Given("Open the Serving Size Level home page BaseURL and StoreID")
	public void openTheServingSizeLevelHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Department page
	
		
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"servingSizeLevels");
	}
	
	@Given("Verifying the Serving Size Level Header Page")
	public void verifyingTheServingSizeLevelHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
//		cmp.Close_Online_Help_ChatBox();

		Thread.sleep(1000);
		//Verify the Serving Size Level page loaded or not
		cmp.VerifyMainScreenPageHeader("Serving Size Levels");	
	}

	@Given("Click the New Serving Size Level button")
	public void clickTheNewServingSizeLevelButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(2000);
		//Click the New Serving Size Level
		ssl.Click_NewServingSizeLevelButton();
	}
	
	@When("Verify the New Serving Size Level Header")
	public void verifyTheNewServingSizeLevelHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		
		//Verify the New Serving Size Level creation screen opened or not
		cmp.VerifyCreationScreenPageHeader("New Serving Size Level");
	}
	
	@Given("I Click the Save button without Entering Serving Size Level Name")
	public void iClickTheSaveButtonWithoutEnteringServingSizeLevelName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		cmp.NameInputBox().clear();
		
		Thread.sleep(1000);
		if(cmp.Save_Button().isEnabled())
		{
			Thread.sleep(1000);
		//Click the Save button
		cmp.Click_SaveButton();
		
		Thread.sleep(3000);
		//Check whether the New Serving Size Level Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Serving Size Name"))
		{
			test.log(LogStatus.PASS, "Please enter Serving Size Name Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please enter Serving Size Name Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled without Entering Serving Size Level Name");
		}
		
	}

	@Given("I Enter the Single letter in Serving Size Level Name and Click the Save button")
	public void iEnterTheSingleLetterInServingSizeLevelNameAndClickTheSaveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		 new Common_XPaths().EnterName("a");
		    
		    if(cmp.Save_Button().isEnabled())
			{
			//Click the Save button
			cmp.Click_SaveButton();
			
			Thread.sleep(3000);
			//Check whether the New Serving Size Level Saved or not
//			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Serving Size Level Name"))
//			{
//				test.log(LogStatus.PASS, "Please Enter Serving Size Level Name Alert Displayed");
//			
//				ut.PassedCaptureScreenshotAsBASE64();
//			}
//			else 
//				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Saved Successfully"))
//			{
//				test.log(LogStatus.PASS, "Serving Size Level Saved with Single Letter");
//			
//				ut.PassedCaptureScreenshotAsBASE64();
//				
//				ssl.Click_NewServingSizeLevelButton();
//			}
//			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
//			{
//				test.log(LogStatus.PASS, "Serving Size Level Already Saved with Single Letter");
//			
//				ut.PassedCaptureScreenshotAsBASE64();
//				
////				cp.ClickNewServing Size Level();
////				cmp.Click_CancelButton();
//			}
//			else
//			{
//				test.log(LogStatus.FAIL, "Please Enter Serving Size Level Name Alert not Displayed");
//				
//				ut.FailedCaptureScreenshotAsBASE64();
//			}
			
			cmp.VerifySaveConfirmationAlertMessage("Serving Size Level Saved");
			}
			else
			{
				test.log(LogStatus.PASS, "Save button not Enabled while Entering Single Letter");
			}
		
	}
	
	@Given("I Enter the Serving Size Level Name Exceeding the limit")
	public void iEnterTheServingSizeLevelNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());

	}
	
	@When("I Enter the New Serving Size Level Name")
	public void iEnterTheNewServingSizeLevelName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(1500);
		//Enter the Course Name
		cmp.EnterName(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));
	}
	@When("I Enter the Serving Size Level Description")
	public void iEnterTheServingSizeLevelDescription() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Description
		ssl.EnterDescription("Newly SSL is "+Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));
		
	}
	@Then("Verify whether the Serving Size Level is Saved or not")
	public void verifyWhetherTheServingSizeLevelIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("Serving Size Level Saved");
	}
	
	@Given("I Search and Edit the Serving Size Level")
	public void iSearchAndEditTheServingSizeLevel() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		//Search and Click Edit button
		cmp.SearchAndClickEdit(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));
	}
	
	@When("Verify the Update Serving Size Level Header")
	public void verifyTheUpdateServingSizeLevelHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Serving Size Level");
	}
	
	@Then("I Verify Serving Size Level Update screen Close or not")
	public void iVerifyServingSizeLevelUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Close_Cancel_CreationScreen("Update Serving Size Level");
	}

	//Searching Serving Size level -Already present

	@Given("I Clicking the Update button without entering Serving Size Level Name")
	public void iClickingTheUpdateButtonWithoutEnteringServingSizeLevelName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Name
		cmp.NameInputBox().clear();
	
		
		if(cmp.Update_Button().isEnabled())
		{
			
			Thread.sleep(1000);
			//Click the Update button
			cmp.Click_UpdateButton();
			
			Thread.sleep(3000);
			//Check whether the New Serving Size Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Serving Size Level Updated without Serving Size Level Name");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				Thread.sleep(3000);
				//Search and Click Edit button
				cmp.SearchAndClickEdit(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));
				
				
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Serving Size Level not Updated without Serving Size Level Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}


	@Then("Verify the Serving Size Level is Updated or not")
	public void verifyTheServingSizeLevelIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Serving Size Level Updated");
	}
	
	@Given("I Search the Serving Size Level and Click the Delete button")
	public void iSearchTheServingSizeLevelAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	
	@Then("Verify the Cancelled Serving Size Level Deleted\\/Inactivated or not")
	public void verifyTheCancelledServingSizeLevelDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Serving Size Level Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Serving Size Level not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}

	}
	
	@Then("I Verifying the Serving Size Level Deleted or not")
	public void iVerifyingTheServingSizeLevelDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Serving Size Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Serving Size Level Inactivated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Serving Size Level Inactivated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Serving Size Level")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedServingSizeLevel() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));

	}
	
	@Given("I Search the Serving Size Level and Click the Active button")
	public void iSearchTheServingSizeLevelAndClickTheActiveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Activate the In activated item
				cmp.SearchAndClickActivate(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));
				
				Thread.sleep(1500);
				//Click the Delete button
				cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}
	
	@Then("Verify the Cancelled Serving Size Level is Activated or not")
	public void verifyTheCancelledServingSizeLevelIsActivatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "Serving Size Level Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Serving Size Level not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}

	}

	@Then("I Verifying the Serving Size Level Activated or not")
	public void iVerifyingTheServingSizeLevelActivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Serving Size Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Serving Size Level activated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Serving Size Level activated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Click the Active button to navigate Activated screen to Verify Activated Serving Size Level")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedServingSizeLevel() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Serving Size activated or not
		cmp.Verify_Search(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));

	}

//	@Given("Navigate to Catgeory page and Get the value and navigate to the Serving Size Level page")
//	public void navigateToCatgeoryPageAndGetTheValueAndNavigateToTheServingSizeLevelPage() throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//		//Search and Activate the In activated item
//	    cmp.SearchAndClickDelete("kg");
//	    
//	}
	@Then("I Search the Serving Size Level mapped with Category and Click the Delete button")
	public void iSearchTheServingSizeLevelMappedWithCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Activate the In activated item
	    cmp.SearchAndClickDelete("WITH OUT CHEESE");
		
		
	}
	@Then("I Verifying the Category Mapped Serving Size Level is Deleted or not")
	public void iVerifyingTheCategoryMappedServingSizeLevelIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This serving size is attached in some categories/items"))
		{
			test.log(LogStatus.PASS, "This serving size is attached in some categories/items is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Category Mapped Serving Size Level Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This serving size is attached in some categories/items is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}
	
	
	@Then("Verify whether the Duplicate Serving Size Level is Saved or not")
	public void verifyWhetherTheDuplicateServingSizeLevelIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
		Thread.sleep(3000);
		//Check whether the New Serving Size Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Serving Size Level Name already exist pop up displayed");
		
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
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Serving Size Level Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Serving Size Level Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try
		{
			Thread.sleep(2000);
			cmp.Click_CancelButton();
			
			System.out.println("Cancel button not Clicked while creating Duplicate Serving Size");
		}
		catch(Exception k)
		{}
	}
	
	
	@Then("Verify the Available Serving Size Level is Displayed ot not")
	public void verifyTheAvailableServingSizeLevelIsDisplayedOtNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Search(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name"));
		}
	
	
	@When("I Enter the New Serving Size Level Name with Special Characters")
	public void iEnterTheNewServingSizeLevelNameWithSpecialCharacters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName("*&%$$#$$$$$$$$$$");
	}
	@Then("Verify whether the Serving Size Level with Special Characters is Saved or not")
	public void verifyWhetherTheServingSizeLevelWithSpecialCharactersIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Serving Size Level Saved with Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Serving Size Level Name already exist pop up displayed when Entering Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(3000);
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Special Characters");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Serving Size Level not Saved with Special Characters");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try
		{
			Thread.sleep(2000);
			cmp.Click_CancelButton();
			
			System.out.println("Cancel button not Clicked while creating Serving Size with Special Characters");
		}
		catch(Exception k)
		{}
	}


	@When("I Enter the New Serving Size Level Name with Space")
	public void iEnterTheNewServingSizeLevelNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName(Utility.getProperty("ProductsItems_Add_ServingSizeLevel_Name")+Keys.SPACE);
	}
	
	@Then("Verify whether the Serving Size Level Name with Space in end is Updated or not")
	public void verifyWhetherTheServingSizeLevelNameWithSpaceInEndIsUpdatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Serving Size Level Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Serving Size Level Updated with Space in the End of Serving Size Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Serving Size Level Name already exist pop up displayed when Entering Space in the End of Serving Size Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Serving size Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Serving Size Level not Saved with Space in the End of Serving Size Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	
	
	

	

}
