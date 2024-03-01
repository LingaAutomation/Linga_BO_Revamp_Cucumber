package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Pages.Availability_RestrictionTimePage;
import com.Pages.Common_XPaths;
import com.Pages.DisplayGroupsPage;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ModifierGroupsPage;
import com.Pages.ModifiersPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import bsh.util.Util;
import io.cucumber.java.en.*;

public class Product_and_Items_Modifiers 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	DisplayGroupsPage dgp = new DisplayGroupsPage();
	Availability_RestrictionTimePage at=new Availability_RestrictionTimePage();
	ModifiersPage mp=new ModifiersPage();
	ModifierGroupsPage mgp=new ModifierGroupsPage();
	
	String Modifier_Mgp;
	
	
	@Given("Open the Modifiers home page BaseURL and StoreID")
	public void openTheModifiersHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//Load the Category page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"modifiers");
	}
	@Given("Verifying the Modifiers Header Page")
	public void verifyingTheModifiersHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    cmp.VerifyMainScreenPageHeader("Modifiers");
	}

	@Given("Verifying the Modifiers page Homepath")
	public void verifyingTheModifiersPageHomepath() {
	    // Write code here that turns the phrase above into concrete actions
		String home = cmp.Home.getText();
		String products_Items = cmp.Modules_Name.getText();
		String Path1 = cmp.path1.getText();

		String total = home+products_Items+Path1;
		System.out.println(total);

		if(total.equalsIgnoreCase("Home / Products/Items / Modifiers")) {

			test.log(LogStatus.PASS, "Modifiers Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Modifiers Path is not displayed");
		}
	}

	@Given("Click the New Modifier button")
	public void clickTheNewModifierButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    mp.Click_NewModifierButton();
	}
	@When("Verify the New Modifiers Header")
	public void verifyTheNewModifiersHeader() {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.VerifyCreationScreenPageHeader("New Modifier");
	}


@Given("I Enter the Maximum No of Times")
public void iEnterTheMaximumNoOfTimes() {
    // Write code here that turns the phrase above into concrete actions
    mp.Enter_MaximumNoOfTimes("2");
}
@Given("I Select the Modify With")
public void iSelectTheModifyWith() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    mp.Select_ModifyWith();
}
@Given("I Disable Show Modifier Toggle")
public void iDisableShowModifierToggle() {
    // Write code here that turns the phrase above into concrete actions
    mp.Disable_ShowModifier();
}
@Given("I Disable Show Menu Item In Modifier Print Toggle")
public void iDisableShowMenuItemInModifierPrintToggle() {
    // Write code here that turns the phrase above into concrete actions
    mp.Disable_ShowMenuItemInModifierPrint();
}
@Given("I Disable Show Modifier In Menu Print Toggle")
public void iDisableShowModifierInMenuPrintToggle() {
    // Write code here that turns the phrase above into concrete actions
    mp.Disable_ShowModifierInMenuPrint();
}

@Given("I Enter the Single letter in Modifiers Name")
public void iEnterTheSingleLetterInModifiersName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.EnterName("a");
}

@Then("Verify whether the Modifier Saved or not")
public void verifyWhetherTheModifierSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("Modifier Saved");
}

@Given("I Enter the Modifiers Name Exceeding the limit")
public void iEnterTheModifiersNameExceedingTheLimit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
}


@Given("I Enter the Modifier Name")
public void iEnterTheModifierName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.EnterName(Utility.getProperty("Modifier_Name"));
}
@Given("I Enter the Maximum No of Times as Zero")
public void iEnterTheMaximumNoOfTimesAsZero() {
    // Write code here that turns the phrase above into concrete actions
    mp.Enter_MaximumNoOfTimes("0");
}
@Then("Check Enter valid Maximum Number of Times Error is Displayed")
public void checkEnterValidMaximumNumberOfTimesErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(mp.Max_TimesErrorMsg(), "Enter valid maximum number of times Error");
}

@Given("I Enter the Invalid Maximum No of Times")
public void iEnterTheInvalidMaximumNoOfTimes() {
    // Write code here that turns the phrase above into concrete actions
    mp.Enter_MaximumNoOfTimes("110");
}

@Given("I Enable Show Modifier Toggle")
public void iEnableShowModifierToggle() {
    // Write code here that turns the phrase above into concrete actions
    mp.Enable_ShowModifier();
}
@Given("I Enable Show Menu Item In Modifier Print Toggle")
public void iEnableShowMenuItemInModifierPrintToggle() {
    // Write code here that turns the phrase above into concrete actions
   mp.Enable_ShowMenuItemInModifierPrint();
}
@Given("I Enable Show Modifier In Menu Print Toggle")
public void iEnableShowModifierInMenuPrintToggle() {
    // Write code here that turns the phrase above into concrete actions
    mp.Enable_ShowModifierInMenuPrint();
}
@Given("I Select the Proceed to Inventory Mapping Tab")
public void iSelectTheProceedToInventoryMappingTab() {
    // Write code here that turns the phrase above into concrete actions
    mp.ProceedToInventoryMappingTab().click();
}
@Then("Check There is unsaved data and Do you want to continue without saving Info Message is Displayed")
public void checkThereIsUnsavedDataAndDoYouWantToContinueWithoutSavingInfoMessageIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
 cmp.Assertion_Validation_Two_Values(cmp.Alert_Popup.getText(), "There is unsaved data. If you proceed to inventory step, you will loose changes Do you want to continue without saving?", "Do you want to continue without saving Info is Displayed");   
}
@Then("I Click the Save and Proceed button")
public void iClickTheSaveAndProceedButton() {
    // Write code here that turns the phrase above into concrete actions
    mp.Click_SaveAndProceed();
}
@Then("Check Proceed to Inventory Mapping Tab is Selected")
public void checkProceedToInventoryMappingTabIsSelected() throws Exception {
    // Write code here that turns the phrase above into concrete actions
//    cmp.Assertion_Validation_True_Element_Selected(mp.ProceedToInventoryMappingTab());
	cmp.Check_Button_Enabled(mp.ProceedToInventoryMappingTab(), "Proceed to Inventory Mapping Tab");
}

@Then("I Disable Is Inventory Item Toggle")
public void iDisableIsInventoryItemToggle() {
    // Write code here that turns the phrase above into concrete actions
    if(mp.Is_InventoryItem_Modifier_ItemType_Toggle.isEnabled())
    {
    	mp.Is_InventoryItem_Modifier_ItemType_Toggle.click();
    }
}

@Given("I Search and Edit the Modifier")
public void iSearchAndEditTheModifier() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.SearchAndClickEdit(Utility.getProperty("Modifier_Name"));
}
@When("Verify the Update Modifier Header")
public void verifyTheUpdateModifierHeader() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyCreationScreenPageHeader("Update Modifier");
}


@Then("I Verify Modifier Update screen Close or not")
public void iVerifyModifierUpdateScreenCloseOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Close_Cancel_CreationScreen("Update Modifier");
}

@Given("I Select the Basic Details Tab")
public void iSelectTheBasicDetailsTab() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    mp.Click_BasicDetailsTab();
}
@Then("Check Show Modifier Toggle is Enabled")
public void checkShowModifierToggleIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
//    cmp.Assertion_Validation_True_Element_Enabled(mp.ShowModifier_YesBtn);
	cmp.Check_Toggle_Enabled(mp.ShowModifier_YesBtn, "Show Modifier Toggle");
}
@Then("Check Show Menu Item In Modifier Print Toggle is Enabled")
public void checkShowMenuItemInModifierPrintToggleIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Enabled(mp.ShowMenuItemModiInPrint_YesBtn, "Show Menu Item In Modifier Print Toggle");
}
@Then("Check Show Modifier In Menu Print Toggle is Enabled")
public void checkShowModifierInMenuPrintToggleIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Enabled(mp.ShowModifierInMenuPrint_YesBtn, "Show Modifier In Menu Print Toggle");
}
@Then("I Select the Prefixes and Serving Size Levels Tab")
public void iSelectThePrefixesAndServingSizeLevelsTab() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    mp.Prefixs_and_ServingSizePrefixTab.click();
}
@Then("I Click the Add Prefix button")
public void iClickTheAddPrefixButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
//	cmp.Prefix_Tab_inContents.click();
	Thread.sleep(2000);
    mp.Add_PrefixBtn.click();
}
@Then("I Enter the Prefixs with Override Modifier Price")
public void iEnterThePrefixsWithOverrideModifierPrice() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    mp.Enter_Prefix_with_Override_ModifierPrice("Slice", "200");
}
@Then("Verify whether the Modifier Updated or not")
public void verifyWhetherTheModifierUpdatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("Modifier Updated");
}
//@Then("I Select the Inventory Modifier Item Type as Item")
//public void iSelectTheInventoryModifierItemTypeAsItem() {
//    // Write code here that turns the phrase above into concrete actions
//	  
//}


@Then("I Select the Prefix Item Type for Inventory Modifier as Item")
public void iSelectThePrefixItemTypeForInventoryModifierAsItem() {
    // Write code here that turns the phrase above into concrete actions
    mp.Prefix_ItemType_Item_RadioBtn.click();
}


@Then("I Select the Modifier Item Type for Inventory Modifier as Menu Item")
public void iSelectTheModifierItemTypeForInventoryModifierAsMenuItem() {
    // Write code here that turns the phrase above into concrete actions
    mp.Modifier_ItemType_MenuItem_RadioBtn.click();
}
@Then("I Select the Prefix Item Type for Inventory Modifier as SubRecipe")
public void iSelectThePrefixItemTypeForInventoryModifierAsSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
    mp.Prefix_ItemType_SubRecipe_RadioBtn.click();
}

@Then("I Select the Modifier Item Type for Inventory Modifier as SubRecipe")
public void iSelectTheModifierItemTypeForInventoryModifierAsSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
   mp.Modifier_ItemType_SubRecipe_RadioBtn.click();
}




@Then("I Select the Modifier Item Type for Inventory Modifier as Item")
public void iSelectTheModifierItemTypeForInventoryModifierAsItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	mp.Modifier_ItemType_Item_RadioBtn.click();
}

@Then("I Select the Inventory Modifier Item Type Category")
public void iSelectTheInventoryModifierItemTypeCategory() throws Exception {
	Thread.sleep(2000);
    // Write code here that turns the phrase above into concrete actions
    mp.Modifier_Category_ItemTypeInputBx.click();
}
@Then("I Select the Inventory Modifier Item Type Inventory Item")
public void iSelectTheInventoryModifierItemTypeInventoryItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cmp.Click_DropDown_withSearch(mp.Modifier_InventoryItem_ItemTypeInputBx, "Inventory Item is Selected for Inventory Modifier");
}
@Then("I Select the Inventory Modifier Prefix Item Type as Item")
public void iSelectTheInventoryModifierPrefixItemTypeAsItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    mp.Prefix_ItemType_Item_RadioBtn.click();
}
@Then("I Select the Inventory Modifier Prefix Item Type Category")
public void iSelectTheInventoryModifierPrefixItemTypeCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearch(mp.Prefix_Category_ItemTypeInputBx, "Category Selected for Inventory Modifier Preifix");
}
@Then("I Select the Inventory Modifier Prefix Item Type Inventory Item")
public void iSelectTheInventoryModifierPrefixItemTypeInventoryItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearch(mp.Prefix_InventoryItem_ItemTypeInputBx, "Inventory Item for Prefix is Selected");
}

@Then("I Enter the Prefixs Price as Decimal")
public void iEnterThePrefixsPriceAsDecimal() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@aria-label='Price']")).clear();
	Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@aria-label='Price']")).sendKeys("2.88");
}

@Then("Check Show Modifier Toggle is Disabled")
public void checkShowModifierToggleIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_False_Element_Not_Selected(mp.ShowModifier_YesBtn);
}
@Then("Check Show Menu Item In Modifier Print Toggle is Disabled")
public void checkShowMenuItemInModifierPrintToggleIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
	  cmp.Assertion_Validation_False_Element_Not_Selected(mp.ShowMenuItemModiInPrint_YesBtn);
}
@Then("Check Show Modifier In Menu Print Toggle is Disabled")
public void checkShowModifierInMenuPrintToggleIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
	  cmp.Assertion_Validation_False_Element_Not_Selected(mp.ShowModifierInMenuPrint_YesBtn);
}
@Then("Check the Updated Decimal Prefix Price")
public void checkTheUpdatedDecimalPrefixPrice() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_Two_Values(driver.findElement(By.xpath("//input[@aria-label='Price']")).getAttribute("value"), "2.88", "Price for Decimal value is Value is Correct");
}
@Then("Check the Prefixs with Override Modifier Toggle is Enabled")
public void checkThePrefixsWithOverrideModifierToggleIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_True_Element_Selected(driver.findElement(By.xpath("//div[@id='new-modifier-serving-sizes-prefixes']//section/mat-slide-toggle")));
}
@Then("I Remove the Prefixs")
public void iRemoveThePrefixs() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    mp.Remove_Prefix();
}
@Then("I Select Serving Size - Prefix")
public void iSelectServingSizePrefix() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearch(mp.ServingSizeLevelInputColumn(), "Serving Size for Prefix is Selected");
}
@Then("Check the Inventory Modifier Prefix Item Type as Item is Not Displayed")
public void checkTheInventoryModifierPrefixItemTypeAsItemIsNotDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Not_Displayed(mp.Prefix_ItemType_Item_RadioBtn, "Prefix Item Type is not displayed in Inventory Modifier Screen");
}

@Given("I Remove the Serving Size - Prefix")
public void iRemoveTheServingSizePrefix() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    mp.Remove_ServingSizeLevel();
}


@Then("I Select the Inventory Modifier Item Type Menu Item")
public void iSelectTheInventoryModifierItemTypeMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearch(mp.Modifier_MenuItem_ItemTypeInputBx, "Menu Item is Selected for Inventory Modifier");
}

@Then("I Select the Inventory Modifier Prefix Item Type SubRecipe")
public void iSelectTheInventoryModifierPrefixItemTypeSubRecipe() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearch(mp.Modifier_SubRecipe_ItemTypeInputBx, "SubRecipe is Selected for Inventory Modifier");
}


@Then("Check Inventory Modifier Prefix Item Type is Selected as Item")
public void checkInventoryModifierPrefixItemTypeIsSelectedAsItem() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_True_Element_Selected(mp.Prefix_ItemType_Item_RadioBtn);
}

@Then("Check Inventory Modifier Item Type is Selected as Menu Item")
public void checkInventoryModifierItemTypeIsSelectedAsMenuItem() {
    // Write code here that turns the phrase above into concrete actions
	 cmp.Assertion_Validation_True_Element_Selected(mp.Modifier_ItemType_MenuItem_RadioBtn);
}
@Then("Check Inventory Modifier Prefix Item Type is Selected as SubRecipe")
public void checkInventoryModifierPrefixItemTypeIsSelectedAsSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
	 cmp.Assertion_Validation_True_Element_Selected(mp.Prefix_ItemType_SubRecipe_RadioBtn);
}

@Then("Check Inventory Modifier Item Type is Selected as Sub Recipe")
public void checkInventoryModifierItemTypeIsSelectedAsSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
	 cmp.Assertion_Validation_True_Element_Selected(mp.Modifier_ItemType_SubRecipe_RadioBtn);
}


@Then("I Select the Inventory Modifier Item Type SubRecipe")
public void iSelectTheInventoryModifierItemTypeSubRecipe() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cmp.Click_DropDown_withSearch(mp.Modifier_SubRecipe_ItemTypeInputBx, "SubRecipe is Selected for Inventory Modifier");
}

@Given("I Search the Modifier and Click the Delete button")
public void iSearchTheModifierAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	  cmp.SearchAndClickDelete(Utility.getProperty("Modifier_Name"));
	    
	    
	    Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
}
@Then("Verify the Cancelled Modifier Deleted\\/Inactivated or not")
public void verifyTheCancelledModifierDeletedInactivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Inactivated Successfully"))
	{
		test.log(LogStatus.FAIL, "Modifier Deleted when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Modifier not Deleted when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

@Then("I Verifying the Modifier Deleted or not")
public void iVerifyingTheModifierDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Modifier Inactivated");
}
@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Modifier")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedModifier() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Enable the Inactive Status
	cmp.Click_ActivetoInactiveButton();
	
	//Check whether the Inactive screen opened or not
	cmp.VerifyActive_InactiveStatus("Inactive");
	
	Thread.sleep(3000);
	cmp.Verify_Search(Utility.getProperty("Modifier_Name"));
}


@Given("I Search the Modifier and Click the Active button")
public void iSearchTheModifierAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Search and Activate the In activated item
			cmp.SearchAndClickActivate(Utility.getProperty("Modifier_Name"));
			
			Thread.sleep(1500);
			//Click the Delete button
			cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
}
@Then("Verify the Cancelled Modifier is Activated or not")
public void verifyTheCancelledModifierIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	Thread.sleep(3000);
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Activated Successfully"))
	{
		test.log(LogStatus.FAIL, "Modifier Activated when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Modifier not Activated when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}


@Then("I Verifying the Modifier Activated or not")
public void iVerifyingTheModifierActivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Modifier Activated");
}
@Then("I Click the Active button to navigate Activated screen to Verify Activated Modifier")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedModifier() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	//Verify whether the Category activated or not
	cmp.Verify_Search(Utility.getProperty("Modifier_Name"));
}

@Then("I Search the Modifier mapped with Modifier Group and Click the Delete button")
public void iSearchTheModifierMappedWithModifierGroupAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"modifierGroup");
	
	
	Thread.sleep(5000);
	//Verify the modifier group page loaded or not
	cmp.VerifyMainScreenPageHeader("Modifier Groups");
	
	//Get the Any Category name which are mapped with Category
	String Modi_MGP=driver.findElement(By.xpath("//tr[1]/td[4]")).getText();
	this.Modifier_Mgp=Modi_MGP;
	System.out.println("Modifier which mapped with Modifier Group"+Modi_MGP);
	
	Thread.sleep(5000);
	//Load the modifiers page
//	a.Navigate_To_Page(Utility.getProperty("store_Id1"), "Categorys");
	lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"modifiers");

	
	Thread.sleep(5000);
	cmp.SearchAndClickDelete(Modi_MGP);
}
@Then("I Verifying the Modifier Mapped Modifier Group is Deleted or not")
public void iVerifyingTheModifierMappedModifierGroupIsDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    
	Thread.sleep(3000);
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("The modifier that you were trying to delete is attached with some modifier groups / included modifiers"))
	{
		test.log(LogStatus.PASS, "The modifier that you were trying to delete is attached with some modifier groups / included modifiers is Displayed");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Inactivated Successfully"))
	{
		test.log(LogStatus.FAIL, "Modifier Mapped Menu Item Inactivated");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "The modifier that you were trying to delete is attached with some modifier groups / included modifiers is not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}

	
	
}

@Then("Verify whether the Duplicate Modifier Saved or not")
public void verifyWhetherTheDuplicateModifierSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
//	Thread.sleep(5000);
	//Check whether the New Category Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Modifier Name already exist pop up displayed");
	
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
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Saved Successfully"))
	{
		test.log(LogStatus.FAIL, "Duplicate Modifier Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Modifier Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
		Thread.sleep(2000);
		cmp.Click_BackspaceButton();
		
		System.out.println("Cancel button not Clicked while Creating Duplicate Modifier");
	}
	catch(Exception k)
	{}
}


@Then("Verify the Available Modifier is Displayed ot not")
public void verifyTheAvailableModifierIsDisplayedOtNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Enable the Inactive Status
			cmp.Click_ActivetoInactiveButton();
			
			//Check whether the Inactive screen opened or not
			cmp.VerifyActive_InactiveStatus("Inactive");
			
			Thread.sleep(3000);
			cmp.Verify_Search(Utility.getProperty("Modifier_Name"));
			
			Thread.sleep(1000);
			//Enable Active Status
			cmp.Click_InactivetoActiveButton();
					
			Thread.sleep(500);
			//Check whether verify whether the Active page opened or not
			cmp.VerifyActive_InactiveStatus("Active");
			
			//Verify whether the Gratuity activated or not
			cmp.Verify_Search(Utility.getProperty("Modifier_Name"));
}


@When("I Enter the New Modifier Name with Special Characters")
public void iEnterTheNewModifierNameWithSpecialCharacters() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.EnterName("&&**");
}
@Then("Verify whether the Modifiers with Special Characters is Saved or not")
public void verifyWhetherTheModifiersWithSpecialCharactersIsSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Saved Successfully"))
	{
		test.log(LogStatus.PASS, "Modifier Saved with Special Characters");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Modifier Name already exist pop up displayed when Entering Special Characters");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_BackspaceButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Special Characters");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_BackspaceButton();
	}
	
	else
	{
		test.log(LogStatus.FAIL, "Modifier not Saved with Special Characters");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}

@When("I Enter the New Modifier Name with Space")
public void iEnterTheNewModifierNameWithSpace() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.EnterName(Utility.getProperty("Modifier_Name")+Keys.SPACE);
}
@Then("Verify whether the Modifiers Name with Space in end is Updated or not")
public void verifyWhetherTheModifiersNameWithSpaceInEndIsUpdatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Modifier Updated Successfully"))
	{
		test.log(LogStatus.PASS, "Modifier Updated with Space in the End of Modifier Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Modifier Name already exist pop up displayed when Entering Space in the End of Modifier Name");
	
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_BackspaceButton();
	}
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
	{
		test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Modifier Name");
		
		ut.PassedCaptureScreenshotAsBASE64();
		
		cmp.Click_BackspaceButton();
	}
	else
	{
		test.log(LogStatus.FAIL, "Modifier not Saved with Space in the End of Modifier Name");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
}

	
	
}
