package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ModifierGroupsPage;
import com.Pages.ModifiersPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product_and_Items_Modifier_Groups 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 
	public String ModifierGroup;

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	ModifiersPage mp = new ModifiersPage();
	ModifierGroupsPage mgp = new ModifierGroupsPage();

	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));

	SoftAssert sa=new SoftAssert();

	@Given("Open the Modifier Groups home page BaseURL and StoreID")
	public void Open_ModifiersGroup_Page() throws Exception 
	{
		Thread.sleep(5000);
		//Load the sort menu config page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"modifierGroup");
		Thread.sleep(5000);
	}

	@Given("Verifying the Modifier Groups Header Page")
	public void Verifying_ModifiersGroupHeader() throws Exception 
	{
		cmp.VerifyMainScreenPageHeader("Modifier Groups");

		Thread.sleep(500);

//		cmp.Close_Online_Help_ChatBox();
	}

	@Given("Click the New Modifier Group button")
	public void Click_NewModifierGroup_Button() throws Exception 
	{
		mgp.Click_NewModifierGroup();
		Thread.sleep(2000);
	}

	@Then("Verify the New Modifier Group Header")
	public void Verify_NewModifierGroupHeader() throws Exception 
	{
		//Verify the New ModifierGroup creation screen opened or not 
		cmp.VerifyCreationScreenPageHeader_Two("New Modifier Group");
		Thread.sleep(2000);
	}

	@And("I Click the Save and Publish button without Entering Modifier Group Name")
	public void Verify_Save_Button_Without_Entering_Modifier_Group_Name() throws Exception
	{
		new Common_XPaths().EnterName("");

		Thread.sleep(2000);

		if(cmp.Save_and_PublishButton().isEnabled())
		{
			//Click the Save button
			cmp.Click_Save_and_PublishButton();

			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the New Tax Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Saved And Published Successfully"))
			{
				test.log(LogStatus.FAIL, "Modifier Group saved Successfully without Entering Name");

				ut.FailedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Name"))
			{
				test.log(LogStatus.PASS, "Please Enter Name Pop up Displayed");

				ut.PassedCaptureScreenshotAsBASE64();

			}
		}
		else
		{
			test.log(LogStatus.PASS, "Save and Publish button not Enabled without Entering Name");
		}
	}

//	@And("I Enter the Priority")
//	public void Enter_Priority() throws Exception
//	{
//		Thread.sleep(1000);
//		//Enter Priority
//		mgp.Enter_Priority("1000");
//	}

	@Then("Verify whether the Modifier Group Saved only with Priority or not")
	public void VerifyModifierGroupSavedOnlywithPriorityOrNot() throws Exception
	{
		Thread.sleep(2000);

		if(cmp.Save_and_PublishButton().isEnabled())
		{
			//Click the Save button
			cmp.Click_Save_and_PublishButton();

			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the New Tax Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Saved And Published Successfully"))
			{
				test.log(LogStatus.FAIL, "Modifier Group saved Successfully with Only Priority");

				ut.FailedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Name"))
			{
				test.log(LogStatus.PASS, "Please Enter Name Pop up Displayed");

				ut.PassedCaptureScreenshotAsBASE64();

			}
		}
		else
		{
			test.log(LogStatus.PASS, "Save and Publish button not Enabled with Entering Only Priority");
		}
	}

	@When("I Enter the New Modifier Group Name")
	public void Enter_ModifierGroupName() throws Exception
	{
		Thread.sleep(1000);
		//Enter the Modifier Group Name
		cmp.EnterName(Utility.getProperty("Modifier_Group_Name"));
		Thread.sleep(500);
	}

	@When("I Enter the New Modifier Group Name Decimal")
	public void Enter_ModifierGroupDeciamlValue() throws Exception 
	{
		Thread.sleep(1000);
		//Enter the Modifier Group Name
		cmp.EnterName(Utility.getProperty("Modifier_Group_Name")+"1");
		Thread.sleep(500);
	}

//	@And("I Clear the Priority")
//	public void Clear_Priority() 
//	{
//		mgp.Clear_Priority();
//	}

	@And("I Click the Save and Publish button without entering Priority")
	public void Click_SaveAndPublishWithoutEnteringPriority() throws Exception 
	{
		Thread.sleep(2000);

		if(cmp.Save_and_PublishButton().isEnabled())
		{
			//Click the Save button
			cmp.Click_Save_and_PublishButton();

			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the New Tax Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Saved And Published Successfully"))
			{
				test.log(LogStatus.FAIL, "Modifier Group saved Successfully without Entering Priority");

				ut.FailedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Priority"))
			{
				test.log(LogStatus.PASS, "Please Enter Priority Pop up Displayed");

				ut.PassedCaptureScreenshotAsBASE64();

			}
		}
		else
		{
			test.log(LogStatus.PASS, "Save and Publish button not Enabled without Entering Priority");
		}
	}

//	@And("I Enter the Priority as Zero")
//	public void EnterPriorityZero() 
//	{
//		mgp.Enter_Priority("0");
//	}

	@Then("Number should not be less than One error is Displayed")
	public void Verify_PriorityZeroErrorMessage() 
	{
		//Check whether the Number should not be less than 0 pop up displayed or not
		mgp.Verify_InvalidNumberErrorMsg("Number should not be less than 0");
	}

	@And("I Select the Multiple Modifier")
	public void Select_MultipleModifiers() throws Exception 
	{
		mgp.Select_Modifiers();
	}

	@Then("Verify whether the Modifier Group is Saved with Priority as Zero or not")
	public void Verify_ModifierGroupSavedwithPriorityOrNot() throws Exception
	{
		Thread.sleep(2000);

		if(cmp.Save_and_PublishButton().isEnabled())
		{
			//Click the Save button
			cmp.Click_Save_and_PublishButton();

			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the New Tax Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Saved And Published Successfully"))
			{
				test.log(LogStatus.FAIL, "Modifier Group saved Successfully with Priority as Zero");

				ut.FailedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Valid Priority"))
			{
				test.log(LogStatus.PASS, "Please Enter Valid Priority Pop up Displayed");

				ut.PassedCaptureScreenshotAsBASE64();

			}
		}
		else
		{
			test.log(LogStatus.PASS, "Save and Publish button not Enabled with Zero Priority");
		}
	}

	@And("I Enter the Priority as Decimal value InCategory")
	public void EnterPriorityAsDecimalValue()
	{
		mgp.Enter_Priority("23.3");
	}

	@Then("Verify whether the Modifier Group is Saved with Priority as Decimal or not")
	public void VerifyModifierGroupSavedWithPriorityAsDecimalOrNot() throws Exception
	{
            cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the New Tax Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Saved And Published Successfully"))
			{
				test.log(LogStatus.FAIL, "Modifier Group saved Successfully with Priority as Decimal It's taking Decimal value as Integer");

				ut.FailedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Valid Priority"))
			{
				test.log(LogStatus.PASS, "Please Enter Valid Priority Pop up Displayed");

				ut.PassedCaptureScreenshotAsBASE64();

			}
		
	
	}

	@And("I Remove the Modifiers")
	public void Remove_Modifiers() throws Exception 
	{
		mgp.Delete_Modifiers();
	}

	@And("I Enable Set Price Here Toggle")
	public void Enable_SetPrice_Toggle() 
	{
		mgp.Enable_SetPrice();
	}

	@And("I Select Serving Size in dropdown")
	public void Select_ServingSize() throws Exception
	{
		mgp.Select_ServingSize();
	}

	@And("I Enter Price")
	public void Enter_Price() throws Exception 
	{
		mgp.Enter_Price("1200");
	}

	@And("I Delete the Serving Size")
	public void Delete_ServingSize() throws Exception 
	{
		mgp.Delete_ServingSizeLevel();
	}


	@And("I Enter the Single letter in Modifier Group Name")
	public void Enter_Single_Letter_ModifierGroupName() throws Exception 
	{
		//Enter the Modifier Group Name
		cmp.EnterName("S");
	}

	@Then("I Verify Pizza Topping Toggle is Disabled")
	public void VerifyPizzaToppingToggleIsDisabled() throws Exception 
	{
		cmp.Check_Toggle_Disabled(mgp.PizzaTopping_YesBtn,"Pizza Topping");
	}

	@Then("I Verify Hide Modifier Group Toggle is Disabled")
	public void VerifyHideModifierGroupToggleIsDisable() throws Exception 
	{
		cmp.Check_Toggle_Disabled(mgp.HideModifierGroup_YesBtn,"Hide Modifier Group");
	}

	@Then("I Verify Set Price Here Toggle is Disabled")
	public void VerifySetPriceToggleIsDisabled() throws Exception
	{
		cmp.Check_Toggle_Disabled(mp.SetPriceHere_YesBtn,"Set Price Here");
	}

	@Then("Verify whether we able to Save the Modifier Group with Single letter")
	public void VerifyAbleToSaveModifierGroupWithSingleLetter() 
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 50);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Saved Successfully"))
		{
			test.log(LogStatus.PASS, "New Modifier Group Saved Successfully with Single letter");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "New Modifier Group Save Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Enable Hide in Online Order Toggle for Anyone Modifier")
	public void EnableHideInOrderToggle() 
	{
		mgp.Enable_HideInOnlineOrder();
	}

	@Then("Verify whether we can able to save and publish")
	public void VerifyWhetherAbleToSaveAndPublish() 
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 50);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Saved Successfully"))
		{
			test.log(LogStatus.PASS, "New Modifier Group Saved Successfully with Single letter");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "New Modifier Group Save Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Select Serving Size in dropdown1")
	public void Select_ServingSizeLevel1() throws Exception 
	{
		driver.findElement(By.xpath("//input[@aria-label='Serving Size']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/select-option")).click();;
	}

	@And("I Add Serving Size")
	public void Click_AddServingSize() 
	{
		mgp.Click_AddPrice_Button();
	}

	@And("I Select same Serving Size in dropdown")
	public void Add_SameServingSize() throws Exception
	{
		driver.findElement(By.xpath("(//input[@aria-label='Serving Size'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/select-option")).click();;
	}

	@Then("Verify Serving Size Already Exists error is Displayed")
	public void VerifyServingSizeAlreadyExistErrorPopup() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(mgp.Serving_Size_Already_Exist_ErrorMsg, "Serving Size Already Exists");
	}

	@And("I Enter the New Modifier Group Name Exceeding the limit")
	public void Enter_NameExceedingtheLimit() throws Exception
	{
		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}

	@And("I Click Proceed to Inventory Menu items Mapping tab")
	public void Click_ProceedToInventoryMapping() 
	{
		mgp.Click_ProceedtoInventoryMenuItemsMappingTab();
	}
	
	@Then("Verify whether we can able to Navigate Proceed to Inventory Menu items Mapping tab")
	public void Verify_AbletoNavigateProceedToInventory() 
	{
		try {
		//cmp.VerifyCreationScreenPageHeader("Inventory Menu Item");
		if(driver.findElement(By.xpath("//h3[.='Inventory Menu Item']")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Able to Navigate to Proceed to Inventory MenuItems");
		}
		else {
			test.log(LogStatus.FAIL,"Not able to navigate to Proceed to Inventory");
		}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO, "Not able to navigate to Proceed to Inventory Because Selected Modifier Not Mapped with InventoryItem");
		}
	}

	@Given("Search and Click on Edit Modifier Group")
	public void Search_And_ClickEdit_ModifierGroup() throws Exception 
	{
		Thread.sleep(1000);
		//Search the Modifier Groups to Click Edit and Cancel
		cmp.SearchAndClickEdit(Utility.getProperty("Modifier_Group_Name"));
	}

	@Then("Verify the Update Modifier Group Header")
	public void VerifyUpdateModifierGroupHeader() throws Exception
	{
		Thread.sleep(500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader_Two("Update Modifier Group");
	}

	@Then("I Verify Modifier Group Update screen Close or not")
	public void UpdateModifierGroupUpdateScreenCloseOrNot() throws Exception 
	{

		Thread.sleep(1000);
		//Check whether the New Modifier Creation form Closed or not
		if(!cmp.NewCreationScreenHeader().isDisplayed())
		{
			test.log(LogStatus.PASS, "Modifier Group Cancelled");
		}
		else
		{
			test.log(LogStatus.FAIL, "Modifier Group not Cancelled");
		}
	}


	@Then("Verify whether the Modifier Group is Updated without Entering Name")
	public void VerifyWhetherModifierGroupIsUpdatedWithoutName() 
	{
		if(cmp.Update_and_PublishButton().isEnabled()) 
		{
			cmp.Update_and_PublishButton();
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Updated Successfully")) {
				test.log(LogStatus.FAIL,"Modifier Group Updated without Entering Name");
			}
			else {
				test.log(LogStatus.PASS, "Modifier Group not updated without Entering Name");
			}

		}
		else {
			test.log(LogStatus.PASS,"Update and Publish button not enabled without Entering Name");
		}
	}

	@Then("Verify whether the Modifier Group is Updated without Entering Priority")
	public void VerifywhethertheModifierGroupIsUpdatedWithoutEnteringPriority() 
	{
		if(cmp.Update_and_PublishButton().isEnabled()) 
		{
			cmp.Update_and_PublishButton();
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Updated Successfully")) {
				test.log(LogStatus.FAIL,"Modifier Group Updated without Entering Priority");
			}
			else {
				test.log(LogStatus.PASS, "Modifier Group not updated without Entering Priority");
			}

		}
		else {
			test.log(LogStatus.PASS,"Update and Publish button not enabled without Entering Priority");
		}
	}

	@Then("Verify whether the Modifier Group is Updated with Priority as Zero or not")
	public void VerifywhethertheModifierGroupIsUpdatedwithPrioriyAsZeroOrNot() 
	{
		if(cmp.Update_and_PublishButton().isEnabled()) 
		{
			cmp.Update_and_PublishButton();
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Updated Successfully")) {
				test.log(LogStatus.FAIL,"Modifier Group Updated with Priority Zero");
			}
			else {
				test.log(LogStatus.PASS, "Modifier Group not updated without Entering Priority");
			}

		}
		else {
			test.log(LogStatus.PASS,"Update and Publish button not enabled without Entering Priority");
		}
	}

	@Then("Verify whether the Modifier Group is Updated with Priority as Decimal or not")
	public void VerifyWhetherTheModifierGroupUpdatedWithPriorityAsDecimalOrNot() 
	{
		if(cmp.Update_and_PublishButton().isEnabled()) 
		{
			cmp.Update_and_PublishButton();
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Updated Successfully")) {
				test.log(LogStatus.FAIL,"Modifier Group Updated with Priority Decimal");
			}
			else {
				test.log(LogStatus.PASS, "Modifier Group not updated By Entering Priority Decimal Value");
			}

		}
		else {
			test.log(LogStatus.PASS,"Update and Publish button not enabled By Entering Priority Decimal Value");
		}
	}

	@Then("Verify the Modifier Group is Updated or not")
	public void VerifyTheModifierGroupUpdatedOrNot() throws Exception
	{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Updated Successfully"))
		{
			test.log(LogStatus.PASS, "New Modifier Group updated successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "New Modifier Group updated fail");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

//	@And("I Select Sort By option as A-Z")
//	public void Select_SortByOptionAsAtoZ() throws Exception
//	{
//		mgp.Select_SortBy_OptionAs_A_to_Z();
//	}
//
//	@And("I Select Sort By option as Z-A")
//	public void Select_SortByOptionAsZtoA() throws Exception 
//	{
//		mgp.Select_SortBy_OptionAs_Z_to_A();
//	}
//
//	@And("I Select Sort By option as Custom")
//	public void Select_SortByAsCustom() throws Exception 
//	{
//		mgp.Select_SortBy_OptionAs_Custom();
//	}

	@And("I Drag and Drop the Menu Items from A to B")
	public void DragAndDropMenuItems()
	{
		mgp.Custom_Sorting();
	}

	@Given("I Search the Modifier Group and Click the Delete button")
	public void SearchAndClickDelete() throws Exception 
	{
		Thread.sleep(1000);
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("Modifier_Group_Name"));

		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	
	@Then("Verify the Cancelled Modifier Group Deleted\\/Inactivated or not")
	public void Verify_Cancelled_ModifierGroup_DeletedOrNOt() 
	{
		try
		{
			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 50);

		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Modifier Group Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Modifier Group not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}
	
	@Then("I Verifying the Modifier Group Deleted or not")
	public void Verify_ModifierGroup_DeletedOrNot() 
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 50);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Modifier Group Inactivated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Modifier Group Inactivated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Modifier Group")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedModifierGroup() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Modifier_Group_Name"));
	}
	
	@Given("I Search the Modifier Group and Click the Active button")
	public void Search_And_Click_ActivateButton() throws Exception
	{
		Thread.sleep(1000);
		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("Modifier_Group_Name"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}
	
	@Then("Verify the Cancelled Modifier Group is Activated or not")
	public void Verify_Cancelled_ModifierGroup_ActivatedOrNot()
	{
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "Modifier Group Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Modifier Group not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
	}
	
	@Then("I Verifying the Modifier Group Activated or not")
	public void Verify_ModifierGroupActivatedOrNot() 
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 50);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Modifier Group activated Successfully");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Modifier Group activated Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Click the Active button to navigate Activated screen to Verify Activated Modifier Group")
	public void i_Click_the_Active_button() throws Throwable {
		
		
		Thread.sleep(500);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the ModifierGroup activated or not
		cmp.Verify_Search(Utility.getProperty("Modifier_Group_Name"));
		
	}
	
	@Then("Verify whether the Duplicate Modifier Group is Saved or not")
	public void Verify_DuplicateModifierGroup_SavedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
				if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
				{
					test.log(LogStatus.PASS, "Modifier Name already exist pop up displayed");
				
					ut.PassedCaptureScreenshotAsBASE64();
					
					//Click the Back button
					cmp.Click_BackspaceButton();
				}
				else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
				{
					test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
					
					ut.PassedCaptureScreenshotAsBASE64();
					
					cmp.Click_BackspaceButton();
				}
				else
				{
					test.log(LogStatus.FAIL, "Modifier Name already exist pop up not Displayed");
					
					ut.FailedCaptureScreenshotAsBASE64();
				}
	}
	
	@When("I Enter the New Modifier Group Name with Space")
	public void iEnterTheNewModifierGroupNameWithSpace() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	   cmp.EnterName(Utility.getProperty("Modifier_Group_Name")+Keys.SPACE);
	}
	
	@Then("Verify whether the Modifier Group Name with Space in end is Updated or not")
	public void verifyWhetherTheModifierGroupNameWithSpaceInEndIsSavedOrNot() 
	{
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Modifier Group Updated with Space in the End of Modifier Group Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Modifier Group Name already exist pop up displayed when Entering Space in the End of Modifier Group Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Modifier Group Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Modifier Group not Saved with Space in the End of Modifier Group Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@Given("Navigate to Menu Items page and Get the value and navigate to the Modifier Group page")
	public void NavigatetoMenuItemandgettheValueandNavigateTotheModifierGroups() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"productItems");


		Thread.sleep(5000);
		//Verify the Departments page loaded or not
		cmp.VerifyMainScreenPageHeader("Products/Items");
		
		driver.findElement(By.xpath("(//button[@aria-label='Click To See Actions'])[1]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[.=' Edit ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[.='Included Modifiers'])[2]")).click();
		
		String Modifier=driver.findElement(By.xpath("//input[@placeholder='Select modifier Group']")).getText();
		this.ModifierGroup=Modifier;
		System.out.println("Modifier"+Modifier);
		
		Thread.sleep(5000);
        lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"modifierGroup");
	
		
		Thread.sleep(5000);
		
	}
	
	@Then("I Search the Modifier Group mapped with Menu Item and Click the Delete button")
	public void SearchModifierGroupMappedWithMenuItemAndClickDelete() throws Exception 
	{
		cmp.SearchAndClickDelete(ModifierGroup);
	}
	
	@Then("I Verifying the Modifier Group Mapped with Menu Item is Deleted or not")
	public void Verifying_ModifierGroupMappedWithMenuItem_DeletedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This ModifierGroup is attached with MenuItem, Could not inactivate."))
		{
			test.log(LogStatus.PASS, "This ModifierGroup is attached with MenuItem, Could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Group Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "MenuItem Mapped ModifierGroup Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This ModifierGroup is attached with MenuItem, Could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Click the Cancel button in Modifier Group")
	public void Click_Cancel_BUtton()
	{
		driver.findElement(By.xpath("//button[.=' Cancel ']")).click();
	}
	
	@Given("Search the Element in Active and InActive List ModifierGroup")
	public void searchTheElementInActiveAndInActiveList() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Modifier_Group_Name"));
		
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		try {
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Modifier_Group_Name"));
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Searched Element not displayed in Inactive List");
		}
		
//		Thread.sleep(1000);
//		//Enable Active Status
//		cmp.Click_InactivetoActiveButton();
//				
//		Thread.sleep(500);
//		//Check whether verify whether the Active page opened or not
//		cmp.VerifyActive_InactiveStatus("Active");
//		
//		//Verify whether the Gratuity activated or not
//		cmp.Verify_Search(Utility.getProperty("Modifier_Group_Name"));
	}
	
	@And("I Select the Multiple Modifier above Ten")
	public void SelectMultipleModifiersAboveTen() throws Exception 
	{
		mgp.Select_MultipleModifiersAboveTen();
	}
	
	@Then("Verify whether all the Selected Modifiers is Displayed")
	public void Verify_SelectedModifiersDisplayedOrNot() throws Exception 
	{
	//	String Selected_Modifiers = mgp.Modifiers_SearchInputBox.getText();
    //	int Modifiers = Selected_Modifiers.replaceAll("[a-zA-Z $ ₹ , :]","").trim();
		Thread.sleep(500);
	    int Selected_Modifier_List = driver.findElements(By.xpath("//tbody/tr/td/div")).size();
	    if(Selected_Modifier_List == 15) 
	    {
	    	test.log(LogStatus.PASS,"All Selected Modifiers Are Displaying");
	    }
	    else {
	    	test.log(LogStatus.FAIL,"All selected Modifiers not displayed");
	    }
	}
	
	@Then("Verify whether all the Selected Modifiers is Displayed AfterSorting")
	public void VerifyAllTheSelectedModifiersAfterSort() throws Exception 
	{
		Thread.sleep(500);
	    int Selected_Modifier_List = driver.findElements(By.xpath("//tbody/tr/td/div")).size();
	    if(Selected_Modifier_List == 15) 
	    {
	    	test.log(LogStatus.PASS,"All Selected Modifiers Displayed After Sorting");
	    }
	    else {
	    	test.log(LogStatus.FAIL,"All selected Modifiers not displayed After Sort");
	    }
	}
	@And("I Remove One Modifier")
	public void Delete_OneModifier() throws Exception 
	{
		mgp.Delete_OneModifier();
	}
}
