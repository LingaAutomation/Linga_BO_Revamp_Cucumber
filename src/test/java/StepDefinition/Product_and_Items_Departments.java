package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.Random;
import StepDefinition.Hooks;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;

import com.Pages.BasePage;
import com.Pages.Common_XPaths;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentManager;
import Utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Product_and_Items_Departments 
{

//	public static SelfHealingDriver driver;

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
//	ExtentReports Trep = ExtentManager.getInstance();
//	ExtentTest Ttest = rep.startTest("AddEditDelete Departments");
	
	
	
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	DepartmentPage dpg=new DepartmentPage();
	

//	ExtentReports rep=new Driver_Manager().rep;
//	ExtentTest test=rep.startTest("AddEditDelete Departments");
//	test= rep.startTest("AddEditDelete Departments");
	
	
	
//	ExtentTest dm=new Driver_Manager().Genarate_ExtentReport("AddEditDelete Departments");;
	
	String Dep_withCat, Dep_withSubCat;
	
//	@AfterClass
//	public void flushTest() throws Exception
//	{
//		Thread.sleep(2000);
//		rep.endTest(test);
//		rep.flush();
//	}
	
//	@After
//	public void TestFail(ITestResult result) throws Exception
//	{
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//			
//			String s="data:image/png;base64,"+scnsht;
//			
//			test.log(LogStatus.FAIL, test.addScreenCapture(s));
//	
//		
//		}
//	}
	

	
	


//	@Given("^Open the Browser and Enter URL$")
//	public void open_the_Browser_and_Enter_URL() throws Throwable {
//	    
//		Thread.sleep(2000);
//		Call the chrome driver
//		ChromeOptions chrOpt=new ChromeOptions();
//		chrOpt.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver(chrOpt);
//		WebDriverManager.chromedriver().setup();
		
//		ChromeOptions options=new ChromeOptions();
//		
//		options.setHeadless(false);
//		
//		WebDriver delegate=new ChromeDriver();
//		this.driver.getDelegate();
//		driver=SelfHealingDriver.create(delegate);
//		//Wait for 30 seconds
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//Maximize the Chrome window
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		//Launch the URL
//		lgpg.Open_URL(Utility.getProperty("appURL"));
//		
//		   
//				Thread.sleep(10000);
////				a.Login(driver, test);
//			    
//	}
	
	
//	@AfterAll
//	public void LogOut() throws Exception
//	{
//		a.LogOut(driver, test);
//		
//		Thread.sleep(2000);
//		rep.endTest(test);
//		rep.flush();
//	}

//	@When("^I Select the Store after Login to Application when Enter Username and Passowrd$")
//	public void i_Select_the_Store_after_Login_to_Application_when_Enter_Username_and_Passowrd() throws Throwable {
//	    
//		Thread.sleep(10000);
//		a.Login(driver, test);
//	    
//	}

	@Given("^Open the Department home page BaseURL and StoreID$")
	public void open_the_Department_home_page_BaseURL_and_StoreID() throws Throwable {
	    
	
		Thread.sleep(10000);
		//Load the Department page
	
		
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"departments");
//		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"departments");
//		new LoginPage(driver, test).Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"departments");
		
		
	}

	@Given("^Verifying the Department Header Page$")
	public void verifying_the_Department_Header_Page() throws Throwable {
		//cmp=new Common_XPaths();
		
//		Thread.sleep(8000);
//		cmp.Close_Online_Help_ChatBox();

		Thread.sleep(8000);
		//Verify the Departments page loaded or not
		cmp.VerifyMainScreenPageHeader("Departments");	
	}
	
	@Given("I can do the Pagination")
	public void iCanDoThePagination() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyPagination_and_Refresh_Publish();
	}



	@When("User Select the Filter option with Columns")
	public void userSelectTheFilterOptionWithColumns() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//cmp=new Common_XPaths();
		
		//Verify the Pagination and Refresh the page
//		cmp.VerifyPagination_and_Refresh_Publish();
		
		//Verify Column Filtration
		cmp.Filter_Columns();
	}
	
	@And("^Verify the Ascending and Descending Order$")
	public void verify_the_Ascending_Order() throws Throwable {
	    
	    //cmp=new Common_XPaths();
	    
	    cmp.Ascending_And_Descending_Order();
	}

	

	@Given("^Click the New Department button$")
	public void click_the_New_Department_button() throws Throwable {
	
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		Thread.sleep(2000);
		//Click the New Departments
		dpg.Click_NewDepartment();
	}

	@When("^Verify the New Department Header$")
	public void verify_the_New_Department_Header() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		cmp.VerifyCreationScreenPageHeader("New Department");
		Thread.sleep(2000);
	}
	
	@And("^I Click the Save button without Entering Department Name$")
	public void i_Click_the_Save_button_without_Entering_Department_Name() throws Throwable {
	    
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		new Common_XPaths().EnterName("");
		
		if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
		Thread.sleep(3000);
		//Check whether the New Department Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Department Name"))
		{
			test.log(LogStatus.PASS, "Please Enter Department Name Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Enter Department Name Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled without Entering Department Name");
		}
	
	}
	
	@And("I Enter the Single letter in Department Name and Click the Save button")
	public void enterTheSingleLetterInDepartmentNameAndClickTheSaveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    new Common_XPaths().EnterName("a");
	    
	    if(cmp.Save_Button().isEnabled())
		{
		//Click the Save button
		cmp.Click_SaveButton();
		
//		Thread.sleep(3000);
//		//Check whether the New Department Saved or not
//		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Department Name"))
//		{
//			test.log(LogStatus.PASS, "Please Enter Department Name Alert Displayed");
//		
//			ut.PassedCaptureScreenshotAsBASE64();
//		}
//		else
//		{
//			test.log(LogStatus.FAIL, "Please Enter Department Name Alert not Displayed");
//			
//			ut.FailedCaptureScreenshotAsBASE64();
//		}
		cmp.VerifySaveConfirmationAlertMessage("Department Saved");
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled while Entering Single Letter");
		}
	}

	@And("I Enter the Only Department code and Click the Save button")
	public void iEnterTheDepartmentCodeAndClickTheSaveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(1000);
		cmp.NameInputBox().clear();
		
		Thread.sleep(1000);
		dpg.Enter_DepartmentCode(Utility.getProperty("Product_Items_New_Department_Code"));
		
	    if(cmp.Save_Button().isEnabled())
			{
			//Click the Save button
			cmp.Click_SaveButton();
			
			Thread.sleep(3000);
			//Check whether the New Department Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Department Name"))
			{
				test.log(LogStatus.PASS, "Please Enter Department Name Alert Displayed");
			
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Please Enter Department Name Alert not Displayed");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
			}
			else
			{
				test.log(LogStatus.PASS, "Save button not Enabled only by Entering Department Code");
				
				
			}
	    
	    
	}

	@And("I Enter the Only Description and Click the Save button")
	public void iEnterTheDescriptionAndClickTheSaveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
//		dpg.Enter_DepartmentCode("");
		
		dpg.Enter_Description("This is the Description and Going to see without Name");
		
		Thread.sleep(2000);
		 if(cmp.Save_Button().isEnabled())
			{
			//Click the Save button
			cmp.Click_SaveButton();
			
			Thread.sleep(3000);
			//Check whether the New Department Saved or not
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
				test.log(LogStatus.PASS, "Save button not Enabled only by Entering Description");
				
				
			}
	}

	
	@And("^I Enter the Department Name Exceeding the limit$")
	public void i_Enter_the_Department_Name_Exceeding_the_limit() throws Throwable {
	    
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}

	@When("^I Enter the New Department Name$")
	public void i_Enter_the_New_Department_Name() throws Throwable {
	    
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		Thread.sleep(500);
		//Enter the Department Name
		cmp.EnterName(Utility.getProperty("Product_Items_New_Department_Name"));
	}

	@And("^I Enter the Department Code$")
	public void enter_the_Department_Code() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
	    dpg.Enter_DepartmentCode(Utility.getProperty("Product_Items_New_Department_Code"));
	}

	@And("^I Enter the Department Description$")
	public void enter_the_Department_Description() throws Throwable {
	    
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		dpg.Enter_Description(Utility.getProperty("Product_Items_New_Department_Name"));
	}

	@And("^I Enable the Include Membership$")
	public void i_Enable_the_Include_Membership() throws Throwable {
	    
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
	    cmp.Click_Yes_Toggle();
	}

	@And("^I Click the Save button$")
	public void iClick_the_Save_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(2000);
		//Click the Save button
		cmp.Click_SaveButton();
		
	}

	@Then("^Verify whether the Department is Saved or not$")
	public void verify_the_Department_Saved_or_not() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(3000);
		//Check whether the New Department Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Department Saved Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Department Name already exist pop up displayed when Entering Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Department Save Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("^I Search and Edit the Department$")
	public void search_and_Edit_the_Department() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Search and Click Edit button
		cmp.SearchAndClickEdit(Utility.getProperty("Product_Items_New_Department_Name"));
	
	}

	@When("^Verify the Update Department Header$")
	public void verify_the_Update_Department_Header() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		//Check whether the application displays Update screen or not
		cmp.VerifyCreationScreenPageHeader("Update Department");
		
	}

	@And("^I Click the Cancel button$")
	public void iClick_the_Cancel_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(2000);
		//Click Cancel button
		cmp.Click_CancelButton();
		
	}
	
	@Then("^I Verify Department Update screen Close or not$")
	public void i_Verify_DepartmentUpdate_screen_Close_or_not() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(1000);
//		//Check whether the New Department Creation form Closed or not
//		if(!cmp.NewCreationScreenHeader().isDisplayed())
//		{
//			test.log(LogStatus.PASS, "Department screen Closed");
//		}
//		else
//		{
//			test.log(LogStatus.FAIL, "Department screen not Closed");
//		}
		cmp.Verify_Close_Cancel_CreationScreen("Update Department");
		
	}
	
	@And("^I Verify Searching the Item when entering three letters$")
	public void i_Verify_Searching_the_Item_when_entering_three_letters() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(1000);
		//Search and Verify the Search box when Entering 3 Characters
		cmp.SearchAndVerify_SearchBox();
	
	}
	
//	@Given("^I Search and Edit the newly added Department$")
//	public void i_Search_and_Edit_the_newly_added_Department() throws Throwable {
//		//cmp=new Common_XPaths();
//		//dpg=new DepartmentPage(driver, test);
//		
//		Thread.sleep(1000);
//		//Search and Click Edit button
//		cmp.SearchAndClickEdit(Utility.getProperty("Product_Items_New_Department_Name"));
//		
//		
//	}
	
	@And("^I Clicking the Update button without entering Department Name$")
	public void i_Updating_Department_without_Name() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Enter the Name
		cmp.EnterName("");
	
		Thread.sleep(2000);
		if(cmp.Update_Button().isEnabled())
		{
			Thread.sleep(500);
			//Click the Update button
			cmp.Click_UpdateButton();
			
			Thread.sleep(3000);
			//Check whether the New Department Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Department Updated without Department Name");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
				Thread.sleep(3000);
				//Search and Click Edit button
				cmp.SearchAndClickEdit(Utility.getProperty("Product_Items_New_Department_Name"));
				
				
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Department not Updated without Department Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}
	
	@When("^Editing the Department with Department Name$")
	public void editing_the_Department_with_Department_Name() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Enter the Name
		dpg.Enter_Department_Without_Membership(ut.getProperty("Product_Items_New_Department_Name"), ut.getProperty("Product_Items_New_Department_Code"));
		

	}
	
	@When("I validate the Include Membership Toggle is Enabled or not")
	public void iValidateTheIncludeMembershipToggleIsEnabledOrNot() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(cmp.YesToggleBtn.isEnabled(), true);
	    
	    if(cmp.YesToggleBtn.isEnabled())
	    {
	    test.log(LogStatus.PASS, "Include Membership Toggle is Enabled");
	    ut.PassedCaptureScreenshotAsBASE64();
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, "Include Membership Toggle is not Enabled");
	    	ut.FailedCaptureScreenshotAsBASE64();
	    }
	}



	@And("^I Disable Include Membership$")
	public void i_Disable_Include_Membership() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Disable Include Membership
		cmp.Disable_Toggle(cmp.YesToggleBtn, cmp.NoToggleBtn, "Include Membership Toggle Disabled");
	
	}
	@And("^I Click the Update button$")
	public void iClick_the_Update_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Click the Update button
		cmp.Click_UpdateButton();
	
	}

	@Then("^Verify the Department is Updated or not$")
	public void verify_the_Department_Updated_or_not() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(3000);
		//Check whether the New Department Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Department Updated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Department Updated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("^I Search the Department and Click the Delete button$")
	public void i_Search_the_Department_and_Click_the_Cancel_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(1000);
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("Product_Items_New_Department_Name"));
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
		
	}


	//I Click the Cancel button  - Already present

	@Then("^Verify the Cancelled Department Deleted/Inactivated or not$")
	public void verify_the_Cancelled_Department_Deleted_or_not() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(3000);
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Department Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Department not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}

	//I Search the Department and Click the Delete button - Already present
	

	@And("^I Click the Delete button$")
	public void i_Click_the_Delete_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Click the Delete button
		cmp.Click_DeleteButton();
		
	}

	@And("^I Verifying the Department Deleted or not$")
	public void i_Verifying_the_Department_Deleted_or_not() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(3000);
		//Check whether the New Department Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Department Inactivated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Department Inactivated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Department")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedDepartment() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Product_Items_New_Department_Name"));
	}

	

	@And("^I Search the Department and Click the Active button$")
	public void i_Search_the_Department_and_Click_the_Active_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("Product_Items_New_Department_Name"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
		
	}
	

	@And("^I Click the Cancel button in Pop Up$")
	public void i_Click_the_Cancel_button_while_Activating_the_Department() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		//Click the Cancel button
		cmp.Click_CancelButtonInAlert();

	}

	@Then("^Verify the Cancelled Department is Activated or not$")
	public void Verify_the_Cancelled_Department_Activated_or_not() throws Throwable {
	    
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "Department Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Department not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}

	}
	
	// I Search the Department and Click the Active button - Already Present
	


	@And("^I Click the Activate button$")
	public void i_Click_the_Activate_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Click the Activate button
		cmp.Click_ActivateButton();
		
	}

	@Then("^I Verifying the Department Activated or not$")
	public void i_Verifying_the_Department_Activated_or_not() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(3000);
		//Check whether the New Department Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Department activated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Department activated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("^I Click the Active button to navigate Activated screen to Verify Activated Department$")
	public void i_Click_the_Active_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Department activated or not
		cmp.Verify_Search(Utility.getProperty("Product_Items_New_Department_Name"));
		
	}
	
	
	@Given("Navigate to Catgeory page and Get the value and navigate to the Department page")
	public void navigateToCatgeoryPageAndGetTheValueAndNavigateToTheDepartmentPage() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
		
		//Load the Category page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"categories");
		
		
		Thread.sleep(5000);
		//Verify the Departments page loaded or not
		cmp.VerifyMainScreenPageHeader("Categories");
		
		//Get the Any Department name which are mapped with Category
		String Dep_withCat=driver.findElement(By.xpath("//tr[1]/td[3]")).getText();
		this.Dep_withCat=Dep_withCat;
		System.out.println("Department which mapped with Category"+Dep_withCat);
		
		Thread.sleep(5000);
		//Load the Department page
//		a.Navigate_To_Page(Utility.getProperty("store_Id1"), "departments");
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"departments");
	
		
		Thread.sleep(5000);
	} 
	
	@Then("I Search the Department mapped with Category and Click the Delete button")
	public void iSearchTheDepartmentMappedWithCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickDelete(Dep_withCat);
	}
	
	
	//I Click the Delete button - Already Present
	
	
	@Then("I Verifying the Category Mapped Department is Deleted or not")
	public void iVerifyingTheCategoryMappedDepartmentIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		

		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This Department is attached with Category, Could not inactivate."))
		{
			test.log(LogStatus.PASS, "This Department is attached with Category, Could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Category Mapped Department Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This Department is attached with Category, Could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}

	@Given("Navigate to SubCatgeory page and Get the value and navigate to the Department page")
	public void navigateToSubCatgeoryPageAndGetTheValueAndNavigateToTheDepartmentPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Load the Department page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"subCategories");
		
		Thread.sleep(5000);
		//Verify the Departments page loaded or not
		cmp.VerifyMainScreenPageHeader("SubCategories");
		
		//Get the Any Department name which are mapped with Category
		String Dep_withSubCatA=driver.findElement(By.xpath("//tr[1]/td[3]")).getText();
		this.Dep_withSubCat=Dep_withSubCatA;
		System.out.println("Department which mapped with SubCategory"+Dep_withSubCat);

		Thread.sleep(5000);
		//Load the Department page
//		a.Navigate_To_Page(Utility.getProperty("store_Id1"), "departments");
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"departments");
		
		Thread.sleep(5000);
	}
	
	@Then("I Search the Department mapped with SubCategory and Click the Delete button")
	public void iSearchTheDepartmentMappedWithSubCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.SearchAndClickDelete(Dep_withSubCat);
		
	}


	
	@Then("I Verifying the SubCategory Mapped Department is Deleted or not")
	public void iVerifyingTheSubCategoryMappedDepartmentIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This Department is attached with Category, Could not inactivate."))
		{
			test.log(LogStatus.PASS, "This Department is attached with SubCategory, Could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "SubCategory Mapped Department Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This Department is attached with SubCategory, Could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


	
	@Given("^I Click the New Department button$")
	public void i_Click_the_New_Department_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(2000);
		//Click the New Departments button
		dpg.Click_NewDepartment();
		Thread.sleep(2000);
	
	}

	@When("^I Enter the Exising Department Name$")
	public void i_Enter_the_Exising_Department_Name() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(500);
		//Enter the existing Department name
		cmp.EnterName(Utility.getProperty("Product_Items_New_Department_Name"));
		
	
	}
	
	// I Enter the Department Code - Already Present
	// I Enter the Department Description - Already Present
	// Click the Save button - Already Present

	@Then("Verify whether the Duplicate Department is Saved or not")
	public void verifyWhetherTheDuplicateDepartmentIsSavedOrNot() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	//Check whether the New Department Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Department Name already exist pop up displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Saved Successfully"))
	{
		test.log(LogStatus.PASS, "Duplicate Department Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Department Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}

	
	@Then("Verify the Available Department is Displayed ot not")
	public void verifyTheAvailableDepartmentIsDisplayedOtNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		cmp.Verify_Search(Utility.getProperty("Product_Items_New_Department_Name"));
	}
	
	//Click the New Department button - Already Present

	@When("I Enter the New Department Name with Special Characters")
	public void iEnterTheNewDepartmentNameWithSpecialCharacters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	   String randomSpecial=RandomStringUtils.randomAscii(20);
		cmp.EnterName("*&%$$#$$$$$$$$$$");
		
		
		
	}
	
	// Click the Save button - Already Present
	
	@Then("Verify whether the Department with Special Characters is Saved or not")
	public void verifyWhetherTheDepartmentWithSpecialCharactersIsSavedOrNot() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Department Saved with Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Department Name already exist pop up displayed when Entering Special Characters");
		
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
			test.log(LogStatus.FAIL, "Department not Saved with Special Characters");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	   
	}

	
	// Click the New Department button - Already Present
	

	@When("I Enter the New Department Name with Space")
	public void iEnterTheNewDepartmentNameWithSpace() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	   cmp.EnterName(Utility.getProperty("Product_Items_New_Department_Name")+Keys.SPACE);
	}
	
	// Click the Update button - Already Present
	
	@Then("Verify whether the Department Name with Space in end is Updated or not")
	public void verifyWhetherTheDepartmentNameWithSpaceInEndIsSavedOrNot() 
	{
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Department Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Department Updated with Space in the End of Department Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Department Name already exist pop up displayed when Entering Space in the End of Department Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Department Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Department not Saved with Space in the End of Department Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@When("I Clear the Name")
	public void iClearTheName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	    cmp.NameInputBox().clear();
	}


}
