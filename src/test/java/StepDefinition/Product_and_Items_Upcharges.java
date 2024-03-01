package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.GratuitiesPage;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.UpchargesPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Product_and_Items_Upcharges 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	CategoriesPage ctp=new CategoriesPage();
	DepartmentPage dp=new DepartmentPage();
	CoursingPage cp=new CoursingPage();
	ServingSizeLevelsPage ssl=new ServingSizeLevelsPage();
	KitchenPrinterPage kp=new KitchenPrinterPage();
	
	UpchargesPage up=new UpchargesPage();
			GratuitiesPage gp=new GratuitiesPage();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));

	
	@Given("Open the Upcharges home page BaseURL and StoreID")
	public void openTheUpchargesHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//Load the Category page


		//		a.Login();

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"upCharges");
	}
	@Given("Verifying the Upcharges Header page")
	public void verifyingTheUpchargesHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		//Verify the Category page loaded or not
		cmp.VerifyMainScreenPageHeader("Upcharges");	
	}

	@Given("Click the New Upcharge button")
	public void clickTheNewUpchargeButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Click_NewUpcharge();
	}
	@When("Verify the New Upcharge header")
	public void verifyTheNewUpchargeHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);


		//Verify the New Upcharge creation screen opened or not
		cmp.VerifyCreationScreenPageHeader_Two("New Upcharge");
		Thread.sleep(5000);
	}
	
	@Given("I Click the Save and Publish button without entering the Upcharge name")
	public void iClickTheSaveAndPublishButtonWithoutEnteringTheUpchargeName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.NameInputBox().clear();
	    
	    up.Select_UpchargeType_Amount();
		
		up.Enter_Upcharge_Amount("100");
		
		Thread.sleep(500);
//Click and Select Category Level
up.Select_LevelType_Category();
Thread.sleep(500);

up.Select_Categories_inLevelType();

Thread.sleep(2000);

if(cmp.Save_and_PublishButton().isEnabled())
{
	//Click the Save button
	cmp.Click_Save_and_PublishButton();

	cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
	//Check whether the New Tax Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Upcharge Saved and Published Successfully"))
	{
		test.log(LogStatus.FAIL, "Upcharge Saved without Name");

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

	@Given("I Enter the Upcharge Name")
	public void iEnterTheUpchargeName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enter the Upcharge Name
		cmp.EnterName(Utility.getProperty("UpChargeName"));
	}
	
	@Given("I Enter Upcharge Amount")
	public void iEnterUpchargeAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Enter_Upcharge_Amount("1000");
	}
	@Given("I Enter Upcharge Amount as Zero")
	public void iEnterUpchargeAmountAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Enter_Upcharge_Amount("000");
	}
	@Given("I Select the Level Type as Category")
	public void iSelectTheLevelTypeAsCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	    up.Select_LevelType_Category();
	}
	
	@Given("I Select the Level Type in General as Category")
	public void iSelectTheLevelTypeInGeneralAsCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	    up.Select_LevelType_Category_GeneralTab();
	}
	@Given("I Selecting the Categories")
	public void iSelectingTheCategories() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Select_Categories_inLevelType();
	}
	
	@Then("Verify whether the Amount cannot be set as Zero error message displaying or not")
	public void verifyWhetherTheAmountCannotBeSetAsZeroErrorMessageDisplayingOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    Assert.assertEquals(true, cmp.ConfirmationAlertMsg().getText(),"Amount cannot be set as Zero");
	    Thread.sleep(3000);
	    Assert.assertEquals(cmp.ConfirmationAlertMsg().getText(),"Amount cannot be set as Zero", "Amount cannot be set as Zero Error is Displayed");
	    ut.PassedCaptureScreenshotAsBASE64();
	
	}

	
	@Given("I Select the Upcharge Type as Amount")
	public void iSelectTheUpchargeTypeAsAmount() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Select_UpchargeType_Amount();
	}
	@Given("I Enter Upcharge Amount as More than {int} characters")
	public void iEnterUpchargeAmountAsMoreThanCharacters(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Enter_Excess_Limit_InputBox(up.Amount_InputBox, "10002288282864666411", 17);
	}
	
	@Then("Verify whether the Upcharge Amount should not be more than {int} characters error message")
	public void verifyWhetherTheUpchargeAmountShouldNotBeMoreThanCharactersErrorMessage(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		if(up.Upcharge_Amount_Excess_Error_Msg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Upcharge Amount should not be more than 17 characters Error is Displayed");

			ut.PassedCaptureScreenshotAsBASE64();
	    Assert.assertEquals(true, up.Upcharge_Amount_Excess_Error_Msg);
		}
		else
		{
			test.log(LogStatus.FAIL, "Upcharge Amount should not be more than 17 characters Error is not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}



	@Given("I Select the Upcharge Type as Percentage")
	public void iSelectTheUpchargeTypeAsPercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Select_UpchargeType_Percentage();
	}
	@Then("Check the Include Additional Modifier Toggle is Displayed")
	public void checkTheIncludeAdditionalModifierToggleIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(true, up.IncludeAdditionalModifiers_YesBtn.isDisplayed());
	    
	    ut.PassedCaptureScreenshotAsBASE64();
	}

	@Given("I Enter the Upcharge Percentage")
	public void iEnterTheUpchargePercentage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Enter_Upcharge_Percentage("1000");
	}
	
	@Given("I Enter the Upcharge Percentage as Zero")
	public void iEnterTheUpchargePercentageAsZero() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Enter_Upcharge_Percentage("000");
	}
	@Then("Verify whether the Upcharge is Saved with Percentage as Zero or not")
	public void verifyWhetherTheUpchargeIsSavedWithPercentageAsZeroOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	    Assert.assertEquals(cmp.ConfirmationAlertMsg().getText(),"Percentage cannot be set as Zero", "Percentage cannot be set as Zero Error is Displayed");
	    ut.PassedCaptureScreenshotAsBASE64();
	}
	
	@Given("I Enter the Upcharge Percentage above {int}%")
	public void iEnterTheUpchargePercentageAbove(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//	    Assert.assertEquals(gp.Enter_Valid_Min_Percentage_ErrorMsg.isDisplayed(), true);
//	    
//	    ut.PassedCaptureScreenshotAsBASE64();
		
		up.Enter_Upcharge_Percentage("12000");
	}
	
	@Then("Verify whether the Upcharge is Saved with Percentage as above {int}% or not")
	public void verifyWhetherTheUpchargeIsSavedWithPercentageAsAboveOrNot(Integer int1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.Save_and_PublishButton().isEnabled())
		{
			
			Thread.sleep(1000);
			//Click the Save and Publish button
			cmp.Click_Save_and_PublishButton();
			
			Thread.sleep(3000);
			//Check whether the New Gratuity Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Upcharge Saved Successfully"))
			{
				test.log(LogStatus.FAIL, "Upcharge Saved with Percentage above 100%");
			
				ut.FailedCaptureScreenshotAsBASE64();
				
//				Thread.sleep(3000);
				//Search and Click Edit button
//				cmp.SearchAndClickEdit(Utility.getProperty("UpChargeName"));
				
				
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Valid Percentage"))
			{
				test.log(LogStatus.PASS, "Enter Valid Percentage Error is Displayed");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
		
		}
		else
		{
			test.log(LogStatus.PASS, "Upcharge not Saved when Entering Percentage above 100%");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		
//		Assert.assertEquals(true, gp.Enter_Valid_Percentage_ErrorMsg.isDisplayed());
		
	}

	@Given("I Enable the Include Additional Modifiers Toggle")
	public void iEnableTheIncludeAdditionalModifiersToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Enable_IncludeAdditionalModifiers();
	}
	@Given("I Check the Please Select Categories Error is Displayed")
	public void iCheckThePleaseSelectCategoriesErrorIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		
		if(up.Select_Categories_Error_Msg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Please Select Categories Error is Displayed");
	    Assert.assertEquals(true, up.Select_Categories_Error_Msg.isDisplayed());
	    
	    ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Select Categories Error is not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
//	@Then("I Search the Category")
//	public void iSearchTheCategory() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Check Searched Category is Displayed")
//	public void checkSearchedCategoryIsDisplayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
	@Then("I Search the Category and Check Searched Category is Displayed")
	public void iSearchTheCategoryAndCheckSearchedCategoryIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Search_DropDown_InputSearchBox(up.Category_InputBox, "Category");
	}
	

	@Given("I Select the Level Type as Sub-Category")
	public void iSelectTheLevelTypeAsSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Select_LevelType_SubCategory();
	}
	@Given("I Check the Please Select SubCategories Error is Displayed")
	public void iCheckThePleaseSelectSubCategoriesErrorIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		if(up.Select_SubCategories_Error_Msg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Please Select Sub-Categories Error is Displayed");
	    Assert.assertEquals(true, up.Select_SubCategories_Error_Msg.isDisplayed());
	    
	    ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Select Sub-Categories Error is not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

//	@Then("I Search the Sub-Category")
//	public void iSearchTheSubCategory() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Check Searched Sub-Category is Displayed")
//	public void checkSearchedSubCategoryIsDisplayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
	@Then("I Search the Sub-Category and Check Searched Sub-Category is Displayed")
	public void iSearchTheSubCategoryAndCheckSearchedSubCategoryIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Search_DropDown_InputSearchBox(up.SubCategory_InputBox, "Sub-Category");
	}

	

	@Given("I Select the Level Type as Menu Item")
	public void iSelectTheLevelTypeAsMenuItem() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		up.Select_LevelType_MenuItem();
	}
	@Given("I Check the Please Select Menu Items Error is Displayed")
	public void iCheckThePleaseSelectMenuItemsErrorIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		if(up.Select_MenuItems_Error_Msg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Please Select Menu Items Error is Displayed");
	    Assert.assertEquals(true, up.Select_MenuItems_Error_Msg.isDisplayed());
	    
	    ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Please Select Menu Items Error is not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}	}
	
//	@Then("I Search the Menu Item")
//	public void iSearchTheMenuItem() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Check Searched Menu Item is Displayed")
//	public void checkSearchedMenuItemIsDisplayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
	@Then("I Search the Menu Item and Check Searched Menu Item is Displayed")
	public void iSearchTheMenuItemAndCheckSearchedMenuItemIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Search_DropDown_InputSearchBox(up.MenuItem_InputBox, "Menu Item");
	}
	
	@Given("I Enable the Restrict POS Visibility Toggle")
	public void iEnableTheRestrictPOSVisibilityToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Enable_RestrictPOSVisiblity();
	}
	@Then("Check the Please select at least one role Error is Displayed")
	public void checkThePleaseSelectAtLeastOneRoleErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(up.Select_Role_Error_Msg, "Please select at least one role");
	}
//	@Then("I Selecting the Roles")
//	public void iSelectingTheRoles() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@Then("Verify whether the Upcharge is Saved or Not")
	public void verifyWhetherTheUpchargeIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Upcharge Saved");
	}

	@Given("I Search and Edit the Upcharge")
	public void iSearchAndEditTheUpcharge() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit(Utility.getProperty("UpChargeName"));
	}
	
	@When("Verify the Update Upcharge Header")
	public void verifyTheUpdateUpchargeHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Check whether the Update screen opened or not
				cmp.VerifyCreationScreenPageHeader_Two("Update Upcharge");	}

	@Then("I Verify Upcharge Update screen Close or not")
	public void iVerifyUpchargeUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Verify_Close_Cancel_CreationScreen("Update Upcharge");
	}

	@Given("I Remove the Selected Categories")
	public void iRemoveTheSelectedCategories() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    up.Remove_Categories_inLevelType();
	}



@Then("Check the Include Additional Modifiers Toggle is Enabled")
public void checkTheIncludeAdditionalModifiersToggleIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Toggle_Enabled(up.IncludeAdditionalModifiers_YesBtn, "Include Additional Modifiers Toggle");
}
@Then("Check the Restrict POS Visibility Toggle is Enabled")
public void checkTheRestrictPOSVisibilityToggleIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Toggle_Enabled(up.RestrictPOSvisibility_YesBtn, "Restrict POS Visibility Toggle");
}
@Then("I Disable the Include Additional Modifiers Toggle")
public void iDisableTheIncludeAdditionalModifiersToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    up.Disable_IncludeAdditionalModifiers();
}
@Then("I Disable the Restrict POS Visibility Toggle")
public void iDisableTheRestrictPOSVisibilityToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    up.Disable_RestrictPOSVisiblity();
}
@Then("Verfiy whether Upcharge Updated or Not")
public void verfiyWhetherUpchargeUpdatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Upcharge Updated");
}

@Then("Check the Restrict POS Visibility Toggle is Disabled")
public void checkTheRestrictPOSVisibilityToggleIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Toggle_Disabled(up.RestrictPOSvisibility_YesBtn, "Restrict POS Visibility Toggle");
}



@Then("Check the Include Additional Modifiers Toggle is Disabled")
public void checkTheIncludeAdditionalModifiersToggleIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Toggle_Disabled(up.IncludeAdditionalModifiers_YesBtn, "Include Additional Modifiers Toggle");
}


@Given("I Search the Upcharge and Click the Delete button")
public void iSearchTheUpchargeAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.SearchAndClickDelete(Utility.getProperty("UpChargeName"));
    
    
    Thread.sleep(500);
	//Click the Delete button
	cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
}
@Then("Verify the Cancelled Upcharge Deleted\\/Inactivated or not")
public void verifyTheCancelledUpchargeDeletedInactivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Upcharge Inactivated Successfully"))
	{
		test.log(LogStatus.FAIL, "Upcharge Deleted when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Upcharge not Deleted when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}


@Then("I Verifying the Upcharge Deleted or not")
public void iVerifyingTheUpchargeDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Upcharge Inactivated");
}

@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Upcharge")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedUpcharge() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Enable the Inactive Status
	cmp.Click_ActivetoInactiveButton();
	
	//Check whether the Inactive screen opened or not
	cmp.VerifyActive_InactiveStatus("Inactive");
	
	Thread.sleep(3000);
	cmp.Verify_Search(Utility.getProperty("UpChargeName"));

}

@Given("I Search the Upcharge and Click the Active button")
public void iSearchTheUpchargeAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("UpChargeName"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
}
@Then("Verify the Cancelled Upcharge is Activated or not")
public void verifyTheCancelledUpchargeIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	Thread.sleep(3000);
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Upcharge Activated Successfully"))
	{
		test.log(LogStatus.FAIL, "Upcharge Activated when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Upcharge not Activated when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}

}


@Then("I Verifying the Upcharge Activated or not")
public void iVerifyingTheUpchargeActivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Upcharge Activated");
}

@Then("I Click the Active button to navigate Activated screen to Verify Activated Upcharge")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedUpcharge() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	//Verify whether the Gratuity activated or not
	cmp.Verify_Search(Utility.getProperty("UpChargeName"));
}

@Then("Verify whether the Duplicate Upcharge is Saved or not")
public void verifyWhetherTheDuplicateUpchargeIsSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
//	Thread.sleep(5000);
	//Check whether the New Gratuity Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Upcharge Name already exist pop up displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		Thread.sleep(2000);
		cmp.Click_BackspaceButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_BackspaceButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Upcharge Saved Successfully"))
	{
		test.log(LogStatus.FAIL, "Duplicate Upcharge Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Upcharge Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
		Thread.sleep(2000);
		cmp.Click_BackspaceButton();
		
		System.out.println("Cancel button not Clicked while creating Duplicate Upcharge");
	}
	catch(Exception k)
	{}

}


@Given("I Enter the Upcharge Name with Space")
public void iEnterTheUpchargeNameWithSpace() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.EnterName(Utility.getProperty("UpChargeName")+Keys.SPACE);

}
@Then("Verify whether the Upcharge Name with Space in end is Updated or not")
public void verifyWhetherTheUpchargeNameWithSpaceInEndIsUpdatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Upcharge Updated Successfully"))
	{
		test.log(LogStatus.PASS, "Upcharge Updated with Space in the End of Gratuity Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Upcharge Name already exist pop up displayed when Entering Space in the End of Gratuity Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Upcharge Name");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_CancelButton();
	}
	else
	{
		test.log(LogStatus.FAIL, "Upcharge not Saved with Space in the End of Upcharge Name");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}



}
