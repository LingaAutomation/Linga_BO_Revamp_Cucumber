package StepDefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.ItemServiceChargePage;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product_and_Items_Item_Service_Charge
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;


	LoginPage lgpg=new LoginPage();

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	ItemServiceChargePage iscp = new ItemServiceChargePage();

	@Given("Open the Item Service Charge home page BaseURL and StoreID")
	public void openTheItemServicechargeHomePageBaseURLAndStoreID() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Load the Department page


		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"itemServiceCharge");
	}

	@Given("Verifying the Item Service Charge Header Page")
	public void verifyingTheItemServiceChargeHeaderPage() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
//		cmp.Close_Online_Help_ChatBox();

//		Thread.sleep(1000);
		//Verify the Serving Size Level page loaded or not
		cmp.VerifyMainScreenPageHeader("Item Service Charge");	
	}

	@Given("Click the New Item Service Charge button")
	public void click_NewItemService_Charge() throws Exception 
	{
		//Click on New Item ServiceCharge button
		iscp.Click_NewItemServiceChargeButton();
	}

	@When("Verify the New Item Service Charge Header")
	public void Verfiy_NewItemService_Charge_Header() throws Exception 
	{
		//Verify the New Item Service Charge creation screen opened or not
		cmp.VerifyCreationScreenPageHeader("New Item Service Charge");
		Thread.sleep(2000);
	}

	@And("I Click the Save button without Entering Item Service Charge Name")
	public void Click_SaveButton_Without_Entering_ItemServcieChargeName() throws Exception 
	{

		cmp.NameInputBox().clear();
		Thread.sleep(1000);

		if(cmp.Save_Button().isEnabled())
		{
			//Click the Save button
			cmp.Click_SaveButton();

			Thread.sleep(3000);
			//Check whether the New Item Service Charge Saved or not
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
			test.log(LogStatus.PASS, "Save button not Enabled without Entering Item Serving Charge name");
		}
	}

	@And("I Enter the Single letter in Item Service Charge Name and Click the Save button")
	public void iEnterTheSingleLetterInItemServiceChargeNameAndClickTheSaveButton() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		new Common_XPaths().EnterName("b");

		if(cmp.Save_Button().isEnabled())
		{
			//Click the Save button
			cmp.Click_SaveButton();

			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Saved Successfully"))
			{
				test.log(LogStatus.PASS, "ItemServiceCharge Saved with Single Letter");

				ut.PassedCaptureScreenshotAsBASE64();

				iscp.Click_NewItemServiceChargeButton();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
			{
				test.log(LogStatus.PASS, "ItemServicecharge Already Saved with Single Letter");

				ut.PassedCaptureScreenshotAsBASE64();
				cmp.Click_CancelButton();
			}
		}

		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled while Entering Single Letter");
		}
	}

	@And("I Enter the Item Service Charge Name Exceeding the limit")
	public void iEnterTheItemServiceChargeNameExceedingTheLimit() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());

	}
	
	@Then("I Click the Cancel button ItemServiceCharge")
	public void Click_ItemServiceCharge_Cancel_Button() 
	{
		cmp.Click_CancelButton();
	}

	@And("I Enter the Only Percentage and Click the Save button")
	public void IEnter_ItemServicechargepercentage_and_Click_Save() throws Exception 
	{
		cmp.NameInputBox().clear();
		
		//Enter the Percentage
		iscp.Enter_Item_Service_Charge_Percentage("5000");

		if(cmp.Save_Button().isEnabled())
		{
			//Click the Save button
			cmp.Click_SaveButton();

			Thread.sleep(3000);
			//Check whether the New Item Service Charge Saved or not
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
			test.log(LogStatus.PASS, "Save button not Enabled by Entering only PErcentage without Entering Item Serving Charge name");
		}


	}

	@When("I Enter the New Item Service Charge Name")
	public void Enter_ItemServiceCharge_Name() throws Exception 
	{
		Thread.sleep(2000);
		//Enter Item Service charge name
		cmp.EnterName(Utility.getProperty("Item_Service_Charge_Name"));
	}

//	@And("I Enter the Max Percentage above the percentage limit")
//	public void Enter_Percentage_More_Than_MaxLimit() throws Exception 
//	{
//		//Enter the Percentage
//		iscp.Enter_Item_Service_Charge_Percentage("50000");
//
//	}



	@Then("Verify whether the Item Service charge able to Saved with the Percentage above the limit or not")
	public void Verify_Ableto_Save_With_Above_Percentage_Limit() throws Exception 
	{
		if(cmp.Save_Button().isEnabled())
		{
			//Click the Save button
			cmp.Click_SaveButton();

			Thread.sleep(3000);
			//Check whether the New Item Service Charge Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Valid Percentage"))
			{
				test.log(LogStatus.PASS, "Please enter valide Percentage popup displayed and not able to save with Above max percentage");

				ut.PassedCaptureScreenshotAsBASE64();

				cmp.Click_CancelButton();
			}
			else
			{
				test.log(LogStatus.FAIL, "Please enter valide Percentage popup not Displayed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}

	}

	@And("I Enter the Item Service Charge Percentage")
	public void Enter_ItemService_Charge_Percentage() throws Exception
	{
		//Enter the Percentage
		iscp.Enter_Item_Service_Charge_Percentage("5000");
	}

	@And("I Select the Taxes in Item Service Charge")
	public void Select_Taxes() throws Exception
	{
		Thread.sleep(3000);
		iscp.Select_Tax();
	}

	@Then("Verify whether the Item Service Charge is Saved or not")
	public void Verify_ItemService_charge_Saved_OrNot() 
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 50);
		//Check whether the New Item Service Charge Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Item Service Charge Saved Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Item Service Charge Save Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("I Search and Edit the Item Service Charge")
	public void Search_And_Click_Edit() throws Exception 
	{
		Thread.sleep(10000);
		//Search and Click Edit button
//		iscp.SearchAndClickEdit(Utility.getProperty("Item_Service_Charge_Name"));
		cmp.SearchAndClickEdit(Utility.getProperty("Item_Service_Charge_Name"));
	}

	@Then("Verify the Update Item Service Charge Header")
	public void Verfiy_Update_Screen_Header() throws Exception 
	{
		Thread.sleep(2000);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Item Service Charge");
	}

	//	@And("I Click the Cancel button")
	//	public void Click_On_Cancel() throws Exception
	//	{
	//		Thread.sleep(2000);
	//		//Click the Close button
	//		cmp.Click_CloseButton();
	//	}

	@Then("I Verify Item Service Charge Update screen Close or not")
	public void Verify_whether_Update_ItemService_Charge_Screen_Closed_OrNot() throws Exception
	{
		Thread.sleep(1000);
		//Check whether the New Item Service Charge Creation form Closed or not
		if(!cmp.NewCreationScreenHeader().isDisplayed())
		{
			test.log(LogStatus.PASS, "Editing Item Service Charge screen Closed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Editing Item Service Charge screen not Closed");
		}
	}

//	@And("I Verify Searching the Item Service Charge when entering three letters")
//	public void Verify_Search_With_LessThan_Three_Characters() throws Exception 
//	{
////		iscp.Search_single_letterAnd_Three_Lette("Ite");
//		cmp.SearchAndVerify_SearchBox();
//	}

	@And("I Clicking the Update button without entering Item Service Charge Name")
	public void Click_Update_Without_Entering_Name() throws Exception 
	{
		cmp.EnterName("");
		if(cmp.Update_Button().isEnabled()) 
		{
			cmp.Click_UpdateButton();
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Updated Successfully")) {
				test.log(LogStatus.FAIL,"Item Service Charge updated without any changes");
			}
			else {
				test.log(LogStatus.PASS, "Item Service charge not updated without entering name");
			}

		}
		else {
			test.log(LogStatus.PASS,"Update button not enabled without Entering name");
		}
	}

	@And("I Remove all the Selected Taxes")
	public void Remove_Selected_Taxes() throws Exception
	{
		Thread.sleep(5000);
		iscp.Remove_Selected_Taxes();
	}

	@Then("Verify the Item Service Charge is Updated or not")
	public void Verfiy_ItemService_Charge_Updated_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Item Service Charge Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Item Service Charge Updated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Item Service Charge Updated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("I Search the Item Service Charge and Click the Delete button")
	public void Search_Item_ServiceCharge_Click_Delete() throws Exception 
	{
		Thread.sleep(2000);
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("Item_Service_Charge_Name"));

		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}

	@Then("Verify the Cancelled Item Service Charge Deleted\\/Inactivated or not")
	public void Verify_Cancelled_Item_Service_Charge_Deleted_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Inactivated Successfully"))
			{
				test.log(LogStatus.FAIL, "Item Service Charge Deleted when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Item Service Charge not Deleted when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}

	}

	@Then("I Verifying the Item Service Charge Deleted or not")
	public void Verify_Item_Service_Charge_Deleted_Or_Not() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Item Service Charge Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Item Service Charge Inactivated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Item Service Charge Inactivated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Item Service Charge")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedItemServiceCharge() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);

		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();

		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");

		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Item_Service_Charge_Name"));
	}

	@Given("I Search the Item Service Charge and Click the Active button")
	public void i_Search_the_ItemServiceCharge_and_Click_the_Active_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);

		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("Item_Service_Charge_Name"));

		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");

	}

	@Then("Verify the Cancelled Item Service Charge is Activated or not")
	public void Verify_the_Cancelled_Department_Activated_or_not() throws Throwable {

		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);

		try
		{
			Thread.sleep(3000);
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("ItemServiceCharge Activated Successfully"))
			{
				test.log(LogStatus.FAIL, "ItemServicecharge Activated when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "ItemServiceCharge not Activated when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the Item Service Charge Activated or not")
	public void Verifying_ItemServiceCharge_Activated_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Item Service Charge Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Item Service Charge activated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Item Service Charge activated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Click the Active button to navigate Activated screen to Verify Activated Item Service Charge")
	public void i_Click_the_ItemServiceCharge_Active_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);

		Thread.sleep(500);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();

		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");

		//Verify whether the Department activated or not
		cmp.Verify_Search(Utility.getProperty("Item_Service_Charge_Name"));
	}

	@Then("Verify whether the Duplicate Item Service Charge is Saved or not")
	public void Verify_Duplicate_Item_ServiceCharge_Saved_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Item Service Charge Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Item Service Charge Name already exist pop up displayed");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Item Service Charge Name already exist pop up not Displayed");

			ut.FailedCaptureScreenshotAsBASE64();
		}

		Thread.sleep(3000);
	}
	
	@When("I Enter the New Item Service Charge Name with Special Characters")
	public void Enter_the_Item_Service_Charge_SpecialCharacters() throws Exception 
	{
		Thread.sleep(2000);
		//Enter Item Service charge name
//		cmp.EnterName(Utility.getProperty("Item_Service_Charge_Name_With_SpecialChar"));
		cmp.EnterName("&&%%$#####@@#$%%");
	}
	
	@Then("Verify whether the Item Service Charge with Special Characters is Saved or not")
	public void Verify_Whether_Item_ServiceCharge_Saved_OrNot()
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 50);
		//Check whether the New Item Service Charge Saved or not
//		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Item Service Charge Saved with Special Characters");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Item Service Charge Name already exist pop up displayed when Entering Special Characters");
		
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
			test.log(LogStatus.FAIL, "Item Service Charge not Saved with Special Characters");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@When("I Enter the New Item Service Charge Name with Space")
	public void iEnterTheNewDepartmentNameWithSpace() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	   cmp.EnterName(Utility.getProperty("Item_Service_Charge_Name")+Keys.SPACE);
	}
	
	@Then("Verify whether the Item Service Charge Name with Space in end is Updated or not")
	public void verifyWhetherTheDepartmentNameWithSpaceInEndIsSavedOrNot() 
	{
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Item Service Charge Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Item Service charge Updated with Space in the End of item service charge Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Item Service charge Name already exist pop up displayed when Entering Space in the End of Item Service charge Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Item Service charge Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Item Service charge not Saved with Space in the End of Item Service charge Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("Verify the Available Item Service Charge is Displayed ot not")
	public void Verify_available_ItemService_Charge_Displayed_OrNot() throws Exception 
	{
//		iscp.Verify_Available_Item(Utility.getProperty("Item_Service_Charge_Name"));
		
		 
		cmp.Verify_Search(Utility.getProperty("Item_Service_Charge_Name"));

	}
	
	//@Given("Navigate to Catgeory page and Get the value and navigate to the Item Service Charge page")
	
	@Then("I Search the Item Service Charge mapped with Category and Click the Delete button")
	public void iSearchTheTaxMappedWithCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickDelete("ItemServChar012");
	}
	@Then("I Verifying the Item Service Charge Mapped Catgeory is Deleted or not")
	public void iVerifyingTheTaxMappedCatgeoryIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This Item Service Charge is attached with some item, so could not inactivate."))
		{
			test.log(LogStatus.PASS, "This tax is attached with some item, so could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Category Mapped Tax Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This Item Service Charge is attached with some item, so could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	
}
