package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.CoursingPage;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Product_and_Items_Coursing 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	CoursingPage cp=new CoursingPage();
	
	String Course_withCat, Course_withSubCat;

	@Given("Open the Coursing home page BaseURL and StoreID")
	public void openTheCoursingHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Coursing page
	
		
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"coursing");
	}
	
	@Given("Verifying the Coursing Header Page")
	public void verifyingTheCoursingHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Coursing page loeded or not
		cmp.VerifyMainScreenPageHeader("Coursing");	
	}

	@Given("Click the New Coursing button")
	public void clickTheNewCoursingButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Click the New Coursing
		cp.ClickNewCoursing();
	}
	@When("Verify the New Coursing Header")
	public void verifyTheNewCoursingHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		
		//Verify the New Course creation screen opened or not
		cmp.VerifyCreationScreenPageHeader("New Coursing");
	}

	@Given("I Click the Save button without Entering Coursing Name")
	public void iClickTheSaveButtonWithoutEnteringCoursingName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		new Common_XPaths().EnterName("");
		
		Thread.sleep(2000);
		
		if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
		Thread.sleep(3000);
		//Check whether the New Course Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Name"))
		{
			test.log(LogStatus.PASS, "Please Enter Name Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Name Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.INFO, "Save button not Enabled without Entering Coursing Name");
		}
	}

	@Given("I Enter the Single letter in Coursing Name the Click the Save button")
	public void iEnterTheSingleLetterInCoursingNameTheClickTheSaveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 new Common_XPaths().EnterName("i");
		    
		    if(cmp.Save_Button().isEnabled())
			{
			//Click the Save button
			cmp.Click_SaveButton();
			
			Thread.sleep(3000);
			//Check whether the New Coursing Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Coursing Name"))
			{
				test.log(LogStatus.PASS, "Please Enter Coursing Name Alert Displayed");
			
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Saved Successfully"))
			{
				test.log(LogStatus.FAIL, "Course Saved with Single Letter");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				cp.ClickNewCoursing();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
			{
				test.log(LogStatus.FAIL, "Course Already Saved with Single Letter");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
//				cp.ClickNewCoursing();
//				cmp.Click_CancelButton();
			}
			else
			{
				test.log(LogStatus.FAIL, "Please Enter Coursing Name Alert not Displayed");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
			}
			else
			{
				test.log(LogStatus.PASS, "Save button not Enabled while Entering Single Letter");
			}
	}


	@Given("I Enter the Coursing Name Exceeding the limit")
	public void iEnterTheCoursingNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}
	
	@Given("I Enter the Priority")
	public void iEnterThePriority() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cp.EnterPriority("1");
	}
	
	@Then("Verify whether the Coursing Saved only with Priority or not")
	public void verifyWhetherTheCoursingSavedOnlyWithPriorityOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
//		cmp.EnterName("");
		cmp.NameInputBox().clear();
		
		Thread.sleep(1000);

	if(cmp.Save_Button().isEnabled())
	{
			//Click the Save button
			cmp.Click_SaveButton();

	Thread.sleep(3000);
	//Check whether the New Course Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter Valid Priority"))
	{
		test.log(LogStatus.PASS, "Enter Valid Priority Alert Displayed");

		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Saved Successfully"))
	{
		test.log(LogStatus.FAIL, "Course Saved only with Priority");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
		cp.ClickNewCoursing();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
	{
		test.log(LogStatus.FAIL, "Course Already saved. ");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
//		cp.ClickNewCoursing();
//		cmp.Click_CancelButton();
	}
	else
	{
		test.log(LogStatus.FAIL, "Enter Valid Priority Alert not Displayed");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
}
else
{
	test.log(LogStatus.INFO, "Save button not Enabled without entering Priority");
}
	}
	
	@Given("I Clear the Priority")
	public void iClearThePriority() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cp.EnterPriority("");
	}
	
	@And("I Clicking the Save button without entering Priority")
	public void iClickingTheSaveButtonWithoutEnteringPriority() throws Exception {
		
		
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.Save_Button().isEnabled())
		{
//Click the Save button
cmp.Click_SaveButton();

Thread.sleep(3000);
//Check whether the New Course Saved or not
if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter Valid Priority"))
{
	test.log(LogStatus.PASS, "Enter Valid Priority Alert Displayed");

	ut.PassedCaptureScreenshotAsBASE64();
}
else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Saved Successfully"))
{
	test.log(LogStatus.FAIL, "Course Saved without Priority");

	ut.FailedCaptureScreenshotAsBASE64();
	
	Thread.sleep(2000);
	cp.ClickNewCoursing();
//	cmp.SearchAndClickEdit(Utility.getProperty("ProductsItems_Add_Course_Name"));
}
else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
{
	test.log(LogStatus.FAIL, "Course already Saved. Enter Priority Error Pop up not Displayed");

	ut.FailedCaptureScreenshotAsBASE64();
	
//	cp.ClickNewCoursing();
}
else
{
	test.log(LogStatus.FAIL, "Enter Valid Priority Alert not Displayed");
	
	ut.FailedCaptureScreenshotAsBASE64();
}
		}
		else
		{
			test.log(LogStatus.INFO, "Save button not Enabled without entering Priority");
		}
	}

	@When("I Enter the New Coursing Name")
	public void iEnterTheNewCoursingName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		//Enter the Course Name
		cmp.EnterName(Utility.getProperty("ProductsItems_Add_Course_Name"));
		
	}
	
	@When("I Enter the Priority as Zero")
	public void iEnterThePriorityAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    cp.EnterPriority("0");
	}
	
	
	@Then("Verify whether the Coursing is Saved with Periority as Zero or not")
	public void verifyWhetherTheCoursingIsSavedWithPeriorityAsZeroOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
	    cp.VerifyZeroPriorityAlertMsg();
	}


	@And("I Enter the Priority as Decimal value")
	public void iEnterThePriorityAsDecimalValue() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cp.EnterPriority("2");
	    
	    cp.PriorityInputBox().sendKeys(Keys.LEFT);
	    
	    cp.PriorityInputBox().sendKeys("1.");
	    
	   
	    
	    
	}
	@Then("Verify whether the Coursing is Saved with Periority as Decimal or not")
	public void verifyWhetherTheCoursingIsSavedWithPeriorityAsDecimalOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
		 Thread.sleep(2000);
			if(cmp.Save_Button().isEnabled())
			{
					//Click the Save button
					cmp.Click_SaveButton();

					Thread.sleep(3000);
				//Check whether the New Course Saved or not
				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter Valid Priority"))
				{
					test.log(LogStatus.PASS, "Enter Valid Priority Alert Displayed");

					ut.PassedCaptureScreenshotAsBASE64();
				}
				else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Saved Successfully"))
				{
					test.log(LogStatus.FAIL, "Course Saved with Priority as Decimal Value");
				
					ut.FailedCaptureScreenshotAsBASE64();
					
					cp.ClickNewCoursing();
				}
				else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
				{
					test.log(LogStatus.FAIL, "Name Already Exist Displayed. Decimal Error Pop up not Dispalyed");
				
					ut.FailedCaptureScreenshotAsBASE64();
					
//					cp.ClickNewCoursing();
//					cmp.Click_CancelButton();
				}
				else
				{
					test.log(LogStatus.FAIL, "Enter Valid Priority Alert not Displayed");
			
					ut.FailedCaptureScreenshotAsBASE64();
				}
			}
			else
			{
				test.log(LogStatus.INFO, "Save button not Enabled while Entering Priority as Decimal Value");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
		    
	}
	

	@Then("Verify whether the Coursing is Saved or not")
	public void verifyWhetherTheCoursingIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException()
		cmp.VerifySaveConfirmationAlertMessage("Course Saved");
	}
	
	@Given("I Search and Edit the Coursing")
	public void iSearchAndEditTheCoursing() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		//Search and Click Edit button
		cmp.SearchAndClickEdit(Utility.getProperty("ProductsItems_Add_Course_Name"));
		
	}
	@When("Verify the Update Coursing Header")
	public void verifyTheUpdateCoursingHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Coursing");
	}

	@Then("^I Verify Coursing Update screen Close or not$")
	public void i_Verify_CoursingUpdate_screen_Close_or_not() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new CoursingPage(driver, test);
		
		cmp.Verify_Close_Cancel_CreationScreen("Coursing Update");
		
	}
	
	@Given("I Clicking the Update button without entering Coursing Name")
	public void iClickingTheUpdateButtonWithoutEnteringCoursingName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Name
		cmp.EnterName("");
	
		
		if(cmp.Update_Button().isEnabled())
		{
			Thread.sleep(1000);
			//Click the Update button
			cmp.Click_UpdateButton();
			
			Thread.sleep(3000);
			//Check whether the New Coursing Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Coursing Updated without Coursing Name");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				Thread.sleep(3000);
				//Search and Click Edit button
				cmp.SearchAndClickEdit(Utility.getProperty("ProductsItems_Add_Course_Name"));
				
				
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Coursing not Updated without Coursing Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@Given("I Clicking the Update button without entering Priority")
	public void iClickingTheUpdateButtonWithoutEnteringPriority() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		if(cmp.Update_Button().isEnabled())
		{
				//Click the Save button
				cmp.Click_UpdateButton();

					Thread.sleep(3000);
					//Check whether the New Course Saved or not
					if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter Valid Priority"))
					{	
						test.log(LogStatus.PASS, "Enter Valid Priority Alert Displayed");

						ut.PassedCaptureScreenshotAsBASE64();
					}
					else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Updated Successfully"))
					{
						test.log(LogStatus.FAIL, "Coursing Updated without Priority");
					
						ut.FailedCaptureScreenshotAsBASE64();
						
						Thread.sleep(3000);
						//Search and Click Edit button
						cmp.SearchAndClickEdit(Utility.getProperty("ProductsItems_Add_Course_Name"));
						
						
					}
					else
					{
						test.log(LogStatus.FAIL, "Enter Valid Priority Alert not Displayed");
	
						ut.FailedCaptureScreenshotAsBASE64();
					}
			}
			else
			{
				test.log(LogStatus.INFO, "Update button not Enabled without entering Priority");
			}
	}
	
	
	@Then("Verify whether the Coursing is Updated with Periority as Zero or not")
	public void verifyWhetherTheCoursingIsUpdatedWithPeriorityAsZeroOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		cp.VerifyZeroPriorityAlertMsg();
		
//		if(cmp.Update_Button().isEnabled())
//		{
//			test.log(LogStatus.FAIL, null);
//		}
	}

	
	@Then("Verify whether the Coursing is Updated with Periority as Decimal or not")
	public void verifyWhetherTheCoursingIsUpdatedWithPeriorityAsDecimalOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		 Thread.sleep(2000);
			if(cmp.Update_Button().isEnabled())
			{
					//Click the Save button
					cmp.Click_UpdateButton();

					Thread.sleep(3000);
				//Check whether the New Course Saved or not
				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Enter Valid Priority"))
				{
					test.log(LogStatus.PASS, "Enter Valid Priority Alert Displayed");

					ut.PassedCaptureScreenshotAsBASE64();
				}
				else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Updated Successfully"))
				{
					test.log(LogStatus.FAIL, "Coursing Updated with Priority as Decimal Value");
				
					ut.FailedCaptureScreenshotAsBASE64();
					
					Thread.sleep(3000);
					//Search and Click Edit button
					cmp.SearchAndClickEdit(Utility.getProperty("ProductsItems_Add_Course_Name"));
					
					
				}
				else
				{
					test.log(LogStatus.FAIL, "Enter Valid Priority Alert not Displayed");
			
					ut.FailedCaptureScreenshotAsBASE64();
				}
			}
			else
			{
				test.log(LogStatus.INFO, "Update button not Enabled while Entering Priority as Decimal Value");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
	}
	
	@When("I Change the Priority")
	public void iChangeThePriority() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		cp.EnterPriority("3");
	}
	@Then("Verify the Coursing is Updated or not")
	public void verifyTheCoursingIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Course Updated");
	}
	
	@Given("I Search the Coursing and Click the Delete button")
	public void iSearchTheCoursingAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("ProductsItems_Add_Course_Name"));
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
		
	}
	
	@Then("Verify the Cancelled Coursing Deleted\\/Inactivated or not")
	public void verifyTheCancelledCoursingDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Course Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Course not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}


	@Then("I Verifying the Coursing Deleted or not")
	public void iVerifyingTheCoursingDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Coursing Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Course Inactivated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Course Inactivated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Coursing")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedCoursing() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
				cmp.Click_ActivetoInactiveButton();
				
				//Check whether the Inactive screen opened or not
				cmp.VerifyActive_InactiveStatus("Inactive");
				
				Thread.sleep(3000);
				cmp.Verify_Search(Utility.getProperty("ProductsItems_Add_Course_Name"));
	}
	
	@Given("I Search the Coursing and Click the Active button")
	public void iSearchTheCoursingAndClickTheActiveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("ProductsItems_Add_Course_Name"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}
	
	
	@Then("Verify the Cancelled Coursing is Activated or not")
	public void verifyTheCancelledCoursingIsActivatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "Course Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Course not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}

	}
	
	
	@Then("I Verifying the Coursing Activated or not")
	public void iVerifyingTheCoursingActivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Coursing Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Course activated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Course activated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Click the Active button to navigate Activated screen to Verify Activated Coursing")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedCoursing() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Coursing activated or not
		cmp.Verify_Search(Utility.getProperty("ProductsItems_Add_Course_Name"));
	}
	
	@Given("Navigate to Catgeory page and Get the value and navigate to the Coursing page")
	public void navigateToCatgeoryPageAndGetTheValueAndNavigateToTheCoursingPage() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
		
		//Load the Category page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"categories");
		
		
		Thread.sleep(5000);
		//Verify the Coursings page loaded or not
		cmp.VerifyMainScreenPageHeader("Categories");
		
		//Get the Any Coursing name which are mapped with Category
		String Course_withCat=driver.findElement(By.xpath("//tr[1]/td[4]")).getText();
		this.Course_withCat=Course_withCat;
		System.out.println("Coursing which mapped with Category"+Course_withCat);
		
		Thread.sleep(5000);
		//Load the Coursing page
//		a.Navigate_To_Page(Utility.getProperty("store_Id1"), "Coursings");
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"coursing");
	
		
		Thread.sleep(5000);
	} 
	
	@Then("I Search the Coursing mapped with Category and Click the Delete button")
	public void iSearchTheCoursingMappedWithCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickDelete(Course_withCat);
	}
	
	
	//I Click the Delete button - Already Present
	
	
	@Then("I Verifying the Category Mapped Coursing is Deleted or not")
	public void iVerifyingTheCategoryMappedCoursingIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		

		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This Course is attached with Category, Could not inactivate."))
		{
			test.log(LogStatus.PASS, "This Coursing is attached with Category, Could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Category Mapped Coursing Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This Coursing is attached with Category, Could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}

	@Given("Navigate to SubCatgeory page and Get the value and navigate to the Coursing page")
	public void navigateToSubCatgeoryPageAndGetTheValueAndNavigateToTheCoursingPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Load the Coursing page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"subCategories");
		
		Thread.sleep(5000);
		//Verify the Coursings page loaded or not
		cmp.VerifyMainScreenPageHeader("SubCategories");
		
		//Get the Any Coursing name which are mapped with Category
		String Course_withSubCatA=driver.findElement(By.xpath("//tr[1]/td[5]")).getText();
		this.Course_withSubCat=Course_withSubCatA;
		System.out.println("Coursing which mapped with SubCategory"+Course_withSubCat);

		Thread.sleep(5000);
		//Load the Coursing page
//		a.Navigate_To_Page(Utility.getProperty("store_Id1"), "Coursings");
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"coursing");
		
		Thread.sleep(5000);
	}
	
	@Then("I Search the Coursing mapped with SubCategory and Click the Delete button")
	public void iSearchTheCoursingMappedWithSubCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.SearchAndClickDelete(Course_withSubCat);
		
	}


	
	@Then("I Verifying the SubCategory Mapped Coursing is Deleted or not")
	public void iVerifyingTheSubCategoryMappedCoursingIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This Course is attached with Category, Could not inactivate."))
		{
			test.log(LogStatus.PASS, "This Coursing is attached with SubCategory, Could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "SubCategory Mapped Coursing Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This Coursing is attached with SubCategory, Could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}




	@Then("Verify whether the Duplicate Coursing is Saved or not")
	public void verifyWhetherTheDuplicateCoursingIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Coursing Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Course Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Duplicate Course Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Course Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Verify the Available Coursing is Displayed ot not")
	public void verifyTheAvailableCoursingIsDisplayedOtNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Search(Utility.getProperty("ProductsItems_Add_Course_Name"));
	}

	

	@When("I Enter the New Coursing Name with Special Characters")
	public void iEnterTheNewCoursingNameWithSpecialCharacters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName("*&%$$#$$$$$$$$$$");
		
	}
	
	@Then("Verify whether the Coursing with Special Characters is Saved or not")
	public void verifyWhetherTheCoursingWithSpecialCharactersIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Course Saved with Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Course Name already exist pop up displayed when Entering Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
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
			test.log(LogStatus.FAIL, "Course not Saved with Special Characters");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@When("I Enter the New Coursing Name with Space")
	public void iEnterTheNewCoursingNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		   cmp.EnterName(Utility.getProperty("ProductsItems_Add_Course_Name")+Keys.SPACE);
	}
	@Then("Verify whether the Coursing Name with Space in end is Updated or not")
	public void verifyWhetherTheCoursingNameWithSpaceInEndIsUpdatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Course Updated Successfully"))
				{
					test.log(LogStatus.PASS, "Course Updated with Space in the End of Coursing Name");
				
					ut.PassedCaptureScreenshotAsBASE64();
				}
				else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
				{
					test.log(LogStatus.PASS, "Course Name already exist pop up displayed when Entering Space in the End of Coursing Name");
				
					ut.PassedCaptureScreenshotAsBASE64();
					
					cmp.Click_CancelButton();
				}
				else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
				{
					test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Coursing Name");
					
					ut.PassedCaptureScreenshotAsBASE64();
					
					cmp.Click_CancelButton();
				}
				else
				{
					test.log(LogStatus.FAIL, "Course not Saved with Space in the End of Coursing Name");
					
					ut.FailedCaptureScreenshotAsBASE64();
				}
	}

	
}
