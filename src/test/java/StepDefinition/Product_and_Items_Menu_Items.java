package StepDefinition;

import org.openqa.selenium.By;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.ProductItems_Menu_RetailPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.SubCategoriesPage;
import com.Pages.UpchargesPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import bsh.util.Util;
import io.cucumber.java.en.*;

public class Product_and_Items_Menu_Items 
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
	ProductItems_Menu_RetailPage pmt=new ProductItems_Menu_RetailPage();
	UpchargesPage up=new UpchargesPage();
	SubCategoriesPage scp=new SubCategoriesPage();
	
	@Given("Open the Menu Items home page BaseURL and StoreID")
	public void openTheMenuItemsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//Load the Category page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"productItems");
	}
	@Given("Verifying the Menu Item Header page")
	public void verifyingTheMenuItemHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Category page loaded or not
		cmp.VerifyMainScreenPageHeader("Products/Items");	
	}

	@Given("I Click the New Menu Item button")
	public void iClickTheNewMenuItemButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pmt.Click_New_MenuItem();
	}
	
	@Then("Verify the New Menu Item header")
	public void verifyTheNewMenuItemHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);

		//Verify the New Course creation screen opened or not
		cmp.VerifyCreationScreenPageHeader_Two("New Menu Item");
	}
	

@Given("I Select Serving Size in Set Price for Variable")
public void iSelectServingSizeInSetPriceForVariable() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Serving_Size_For_Variable_CostType();
}

@Then("I Select Serving Size for Menu Item With Serving Size in Set Price for Variable")
public void iSelectServingSizeForMenuItemWithServingSizeInSetPriceForVariable() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Serving_Size_MenuItem_With_ServingSize_Variable_CostType();
}
@Then("I Select Serving Size for Menu Item With Serving Size in Set Price for Fixed")
public void iSelectServingSizeForMenuItemWithServingSizeInSetPriceForFixed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Serving_MenuItem_With_ServingSize_Fixed_CostType();
}


@Given("I Enter the Menu Item Name")
public void iEnterTheMenuItemName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	//Enter the Menu Item Name
	cmp.EnterName(Utility.getProperty("ProductsItems_MenuItemName"));
}
@Then("Check Level Type is Selected as Category")
public void checkLevelTypeIsSelectedAsCategory() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_True_Element_Selected(up.CategoryLevelTypeBtn);
}

@Then("Check the Menu Type is Selected as Menu Item")
public void checkTheMenuTypeIsSelectedAsMenuItem() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_True_Element_Selected(pmt.MenuItem_MenuType());
}

@Then("Check Cost Type is Selected as Variable")
public void checkCostTypeIsSelectedAsVariable() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_True_Element_Selected(pmt.Variable_CostType());
}

@Given("I Enter Seceonday Name Exceeding the limit")
public void iEnterSeceondayNameExceedingTheLimit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Enter_Excess_Limit_Name(pmt.Secondary_NameInputBx);
}
@Given("I Enter the PLU Code Exceeding the limit")
public void iEnterThePLUCodeExceedingTheLimit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Enter_Excess_Limit_Name(pmt.PLU_CodeInputBx);
}

@Given("I Check Evertec Type and Check the Evertec Options is Displayed")
public void iCheckEvertecTypeAndCheckTheEvertecOptionsIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Evertec_TaxType();
}


@Then("I Select the Menu Type as Menu Item With Serving Size")
public void iSelectTheMenuTypeAsMenuItemWithServingSize() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    pmt.MenuItem_With_ServingSize_MenuType_RadioBtn.click();
}


@Then("I Select the Menu Type as Menu Item")
public void iSelectTheMenuTypeAsMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    pmt.MenuItem_MenuType_RadioBtn.click();
}


@Then("I Select Same Serving size Twice in Set Price")
public void iSelectSameServingSizeTwiceInSetPrice() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    String ServingSize_inSetPrice=driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input)[1]")).getAttribute("value");
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input)[2]")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//select-option[.='"+ServingSize_inSetPrice+"']")).click();
    
    
}
@Then("Check Serving Size Already Exists Error Message")
public void CheckServingSizeAlreadyExistsErrorMessage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.Serving_Size_Already_Exists_ErrorMsg, "Serving Size Already Exists Error");
}

@Then("I Enter Same Serial Number for Mutiple Serving Size")
public void iEnterSameSerialNumberForMutipleServingSize() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    String SeqNo_inSetPrice=driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[2]//input)[1]")).getAttribute("value");
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[2]//input)[2]")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//select-option[.='"+SeqNo_inSetPrice+"']")).click();
}

@Given("I Enter the Menu Item Name for Open Item")
public void iEnterTheMenuItemNameForOpenItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	//Enter the Menu Item Name
	cmp.EnterName("Op"+Utility.getProperty("ProductsItems_MenuItemName"));
}
@Then("I Select the Menu Type as Open Item")
public void iSelectTheMenuTypeAsOpenItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    pmt.OpenItem_MenuType_RadioBtn.click();
}
@Then("I Enter the Price")
public void iEnterThePrice() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(1000);
    pmt.Price_InputBx.clear();
    Thread.sleep(1000);
    pmt.Price_InputBx.sendKeys("2000");
}

@Then("Verify whether Menu Item is Saved or Not")
public void verifyWhetherMenuItemIsSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessageForPublish("Menu Item Saved");
}


@Given("I Enter the Menu Item Name for Scale Item")
public void iEnterTheMenuItemNameForScaleItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	//Enter the Menu Item Name
	cmp.EnterName("Sca"+Utility.getProperty("ProductsItems_MenuItemName"));
}
@Then("I Select the Menu Type as Scale Item")
public void iSelectTheMenuTypeAsScaleItem() {
    // Write code here that turns the phrase above into concrete actions
    pmt.ScaleItem_MenuType_RadioBtn.click();
}

@Then("I Select the Menu Type as Combo Item")
public void iSelectTheMenuTypeAsComboItem() {
    // Write code here that turns the phrase above into concrete actions
    pmt.ComboItem_MenuType_RadioBtn.click();
}
@Then("Check Price Level Settings Toggle is Disabled")
public void checkPriceLevelSettingsToggleIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Toggle_Disabled(pmt.Price_Level_Settings_YesBtn, "Price Level Settings");
}
@Given("I Enter the Menu Item Name for Combo Item")
public void iEnterTheMenuItemNameForComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	//Enter the Menu Item Name
	cmp.EnterName("Comb"+Utility.getProperty("ProductsItems_MenuItemName"));
}

@Then("I Select the Menu Items for Combo Item")
public void iSelectTheMenuItemsForComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(driver.findElement(By.xpath("//input[@aria-label='Menu Item']")), "Menu Item Selected for Combo Item");
    
    cmp.Click_DropDown(driver.findElement(By.xpath("//input[@aria-label='Serving Size']")), "Serving Size Selected for Combo Item");
    
    cmp.Enter_Text(driver.findElement(By.xpath("//input[@aria-label='S.No']")), "1", "S.No Entered for Combo Item");
    
    cmp.Enter_Text(driver.findElement(By.xpath("//input[@aria-label='Unit Price']")), "2500", "Unit Price Entered for Combo Item");
    
}


@Then("I Select Multiple Same Menu Items")
public void iSelectMultipleSameMenuItems() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Click_Add_Menu_Item();
	
	String MenuItem_Combo=driver.findElement(By.xpath("(//input[@aria-label='Menu Item'])[1]")).getAttribute("value");
	
	
	Thread.sleep(1000);
//	  cmp.Click_DropDown(driver.findElement(By.xpath("(//input[@aria-label='Menu Item'])[2]")), "Same Menu Item Selected for Combo Item");
	   
	driver.findElement(By.xpath("(//input[@aria-label='Menu Item'])[2]")).click();
	
	 Thread.sleep(1000);
	    driver.findElement(By.xpath("//select-option[.='"+MenuItem_Combo+"']")).click();
	
   
}
@Then("Check Menu Already Exists Error is Displayed")
public void checkMenuAlreadyExistsErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.Menu_Already_Exists_ErrorMsg, "Menu Already Exists Error");
}
@Then("I Select Multiple Menu Items with Same Sequence Number")
public void iSelectMultipleMenuItemsWithSameSequenceNumber() throws Exception {
    // Write code here that turns the phrase above into concrete actions
pmt.Click_Add_Menu_Item();
	
Thread.sleep(2000);
	String SeqNo_Combo=driver.findElement(By.xpath("(//input[@aria-label='S.No'])[1]")).getAttribute("value");
	
	
	Thread.sleep(1000);
//	  cmp.Click_DropDown(driver.findElement(By.xpath("(//input[@aria-label='Menu Item'])[2]")), "Same Menu Item Selected for Combo Item");
	   
	driver.findElement(By.xpath("(//input[@aria-label='S.No'])[2]")).click();
	
	 Thread.sleep(1000);
	    driver.findElement(By.xpath("//select-option[.='"+SeqNo_Combo+"']")).click();
}

@Then("Check Seq.No Already Exists Error is Displayed")
public void checkSeqNoAlreadyExistsErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.SeqNo_Already_Exists_ErrorMsg, "Seq.No Already Exists Error");
}

@Then("I Select the Menu Item in Combo Item")
public void iSelectTheMenuItemInComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(driver.findElement(By.xpath("//input[@aria-label='Menu Item']")), "Menu Item Selected for Combo Item");

}
@Then("I Select the Serving Size in Combo Item")
public void iSelectTheServingSizeInComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(driver.findElement(By.xpath("//input[@aria-label='Serving Size']")), "Serving Size Selected for Combo Item");
}
@Then("I Enter the S.No in Combo Item")
public void iEnterTheSNoInComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(driver.findElement(By.xpath("//input[@aria-label='S.No']")), "1", "S.No Entered for Combo Item");
}
@Then("I Enter the Unit Price in Combo Item")
public void iEnterTheUnitPriceInComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(driver.findElement(By.xpath("//input[@aria-label='Unit Price']")), "2500", "Unit Price Entered for Combo Item");
}

@Then("Check Included Modifiers Tab is not Displayed")
public void checkIncludedModifiersTabIsNotDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.Included_ModifiersTab, "Included Modifiers Tab");
}
@Then("Check Mandatory Modifier Groups Tab is not Displayed")
public void checkMandatoryModifierGroupsTabIsNotDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 cmp.Check_Element_or_Text_Displayed(pmt.Mandatory_ModifierGroupsTab, "Mandatory Modifier Groups Tab");
}
@Then("Check Optional Modifier Groups Tab is not Displayed")
public void checkOptionalModifierGroupsTabIsNotDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 cmp.Check_Element_or_Text_Displayed(pmt.Optional_ModifierGroupsTab, "Optional Modifier Groups Tab");
}
@Then("Check Inventory Details Tab is not Displayed")
public void checkInventoryDetailsTabIsNotDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 cmp.Check_Element_or_Text_Displayed(pmt.Inventory_DetailsTab, "Inventory Details Tab");
}

@Given("I Click the New Category button in Menu Item")
public void iClickTheNewCategoryButtonInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
//    ctp.Click_NewCategory();
//    ctp.Click_New_Coursing_Button_InDropInputBox();
	pmt.Click_New_Category_Button_InDropInputBox();
    
}
@When("I Verify the New Category Header")
public void iVerifyTheNewCategoryHeader() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyCreationScreenPageHeader("New Category");
}
@When("I Enter the Category Name in Menu Item")
public void iEnterTheCategoryNameInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    pmt.Enter_Category_Name_inSecondaryScreen(Utility.getProperty("ProductsItems_Add_Category_Name"));
}

@When("I Select Taxes in Drop Down")
public void iSelectTaxesInDropDown() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Taxes_inDropDown();
}
@When("Verify whether Category Saved or Not")
public void verifyWhetherCategorySavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("Category Saved");
}
@Then("Check Added Category is Selected")
public void checkAddedCategoryIsSelected() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    String ExpectedCat=scp.CategoryDropBtn.getAttribute("value");
    
    cmp.Assertion_Validation_Two_Values(ExpectedCat, Utility.getProperty("ProductsItems_Add_Category_Name"), "Selected Category is Correct");
}
@Given("I Click the New SubCategory button in Menu Item")
public void iClickTheNewSubCategoryButtonInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Click_New_SubCategory_Button_InDropInputBox();
}
@When("I Verify the New SubCategory Header")
public void iVerifyTheNewSubCategoryHeader() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyCreationScreenPageHeader("New Subcategory");
}
@When("I Enter the SubCategory Name in Menu Item")
public void iEnterTheSubCategoryNameInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_SubCategory_Name_inSecondaryScreen(Utility.getProperty("ProductsItems_Add_SubCategory_Name"));
}

@When("Verify whether SubCategory Saved or Not")
public void verifyWhetherSubCategorySavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("SubCategory Saved");
}
@Then("Check Added SubCategory is Selected")
public void checkAddedSubCategoryIsSelected() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    String ExpectedSubCat=scp.CategoryDropBtn.getAttribute("value");
    
    cmp.Assertion_Validation_Two_Values(ExpectedSubCat, Utility.getProperty("ProductsItems_Add_SubCategory_Name"), "Selected SubCategory is Correct");

}

@When("I Enter the Tax Name in Menu Item")
public void iEnterTheTaxNameInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    ctp.Enter_Tax_Name_inSecondaryScreen(Utility.getProperty("ProductsItems_Add_Tax_Name"));
}

@When("I Enter Kitchen Printer Name in Menu Item")
public void iEnterKitchenPrinterNameInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    kp.Enter_KitchenPrinterName(Utility.getProperty("ProductsItems_Add_KitchenPrinter_Name"));
}
@When("I Enter the Kitchen Printer IP Address in Menu Item")
public void iEnterTheKitchenPrinterIPAddressInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    kp.Enter_IP_Address(Utility.getProperty("ProductsItems_Add_IPAddress_KitchenPrinter"));
}
@Then("Check Added Kitchen Printer in Menu Item is Selected")
public void checkAddedKitchenPrinterInMenuItemIsSelected() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Button_Enabled(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains(.,'"+Utility.getProperty("ProductsItems_Add_KitchenPrinter_Name")+"')]")), "Kitchen Printer");

}

@When("I Enter Label Printer Name in Menu Item")
public void iEnterLabelPrinterNameInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	kp.Enter_Label_Printer_Name(Utility.getProperty("ProductsItems_Add_LabelPrinter_Name"));
}
@When("I Enter the Label Printer IP Address in Menu Item")
public void iEnterTheLabelPrinterIPAddressInMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	kp.Enter_IP_Address(Utility.getProperty("ProductsItems_Add_IPAddress_LabelPrinter"));
}
@Then("Check Added Label Printer in Menu Item is Selected")
public void checkAddedLabelPrinterInMenuItemIsSelected() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Button_Enabled(driver.findElement(By.xpath("//app-chip[@name='labelPrinter']//mat-chip[contains(.,'"+Utility.getProperty("ProductsItems_Add_LabelPrinter_Name")+"')]")), "Label Printer");
}

@Given("I Select Included Modifiers Tab")
public void iSelectIncludedModifiersTab() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Included_ModifiersTab.click();
}
@Given("I Click the Add Include Modifiers button")
public void iClickTheAddIncludeModifiersButton() {
    // Write code here that turns the phrase above into concrete actions
	pmt.Click_Add_Include_Modifiers();
}
@Then("Check Please Choose all the Mandatory fields in Basic Details Error message is Displayed")
public void checkPleaseChooseAllTheMandatoryFieldsInBasicDetailsErrorMessageIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("Check Select Modifier Group Error is Displayed")
public void checkSelectModifierGroupErrorIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select Modifier Group in Include Modifiers")
public void iSelectModifierGroupInIncludeModifiers() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select Modifier in Include Modifiers")
public void iSelectModifierInIncludeModifiers() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check Alternate Modifier Group Toggle is Disabled")
public void checkAlternateModifierGroupToggleIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check Override Prefix Upcharges Toggle is Disabled")
public void checkOverridePrefixUpchargesToggleIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enable Alternate Modifier Group Toggle")
public void iEnableAlternateModifierGroupToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the Same Alternate Modifier Group")
public void iSelectTheSameAlternateModifierGroup() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check Invalid Alternate Modifier Group Error is Displayed")
public void checkInvalidAlternateModifierGroupErrorIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the Alternate Modifier Group")
public void iSelectTheAlternateModifierGroup() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Select Mandatory Modifier Groups Tab")
public void iSelectMandatoryModifierGroupsTab() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Click the Add Mandatory Modifier Group button")
public void iClickTheAddMandatoryModifierGroupButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I Select Modifier Group in Mandatory Modifier Group")
public void iSelectModifierGroupInMandatoryModifierGroup() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check Enter Display Order Error is Displayed")
public void checkEnterDisplayOrderErrorIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter the Display Order")
public void iEnterTheDisplayOrder() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter Minimum Quantity")
public void iEnterMinimumQuantity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter Invalid Maximum Quantity")
public void iEnterInvalidMaximumQuantity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check Enter Maximum Quantity Error is Displayed")
public void checkEnterMaximumQuantityErrorIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter Maximum Quantity")
public void iEnterMaximumQuantity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Disable Jump with Minimum Quantity Toggle")
public void iDisableJumpWithMinimumQuantityToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@Given("I Select Optional Modifier Groups Tab")
public void iSelectOptionalModifierGroupsTab() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Click the Add Optional Modifier Group button")
public void iClickTheAddOptionalModifierGroupButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select Modifier Group in Optional Modifier Group")
public void iSelectModifierGroupInOptionalModifierGroup() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter the Display Order in Optional Modifier")
public void iEnterTheDisplayOrderInOptionalModifier() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Select Inventory Details Tab")
public void iSelectInventoryDetailsTab() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check Selected Serving Size is Displayed")
public void checkSelectedServingSizeIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Click on the Add Inventory Item button")
public void iClickOnTheAddInventoryItemButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the Level in Inventory Item as SubCategory")
public void iSelectTheLevelInInventoryItemAsSubCategory() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the Category in Inventory Item")
public void iSelectTheCategoryInInventoryItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the SubCategory in Inventory Item")
public void iSelectTheSubCategoryInInventoryItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the Item in Inventory Item")
public void iSelectTheItemInInventoryItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the Recipe Unit in Inventory Item")
public void iSelectTheRecipeUnitInInventoryItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter the Quantity in Inventory Item")
public void iEnterTheQuantityInInventoryItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Validate the Cost by using Unit Price with Quantity")
public void validateTheCostByUsingUnitPriceWithQuantity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Click on the Add Sub-Recipe button")
public void iClickOnTheAddSubRecipeButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the Item in SubRecipe")
public void iSelectTheItemInSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select the Recipe Unit in SubRecipe")
public void iSelectTheRecipeUnitInSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter the Quantity in SubRecipe")
public void iEnterTheQuantityInSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Validate the Cost by using Unit Price with Quantity in SubRecipe")
public void validateTheCostByUsingUnitPriceWithQuantityInSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Click on the Add Manual Entry button")
public void iClickOnTheAddManualEntryButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter the Item Name in Manual Entry")
public void iEnterTheItemNameInManualEntry() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter the Unit Price in Manual Entry")
public void iEnterTheUnitPriceInManualEntry() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enter the Quantity in Manual Entry")
public void iEnterTheQuantityInManualEntry() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Validate the Cost by using Unit Price with Quantity in Manual Entry")
public void validateTheCostByUsingUnitPriceWithQuantityInManualEntry() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Enter the Secondary Name")
public void iEnterTheSecondaryName() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter the PLU Code")
public void iEnterThePLUCode() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter the Item Preparation Time")
public void iEnterTheItemPreparationTime() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Check the Evertec Options is Displayed and Select Evertec")
public void iCheckTheEvertecOptionsIsDisplayedAndSelectEvertec() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enable Conversational UI at POS Toggle")
public void iEnableConversationalUIAtPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Disable Price Level Settings Toggle")
public void iDisablePriceLevelSettingsToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Select Taxes")
public void iSelectTaxes() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Verfiy whether Menu Item Saved or Not")
public void verfiyWhetherMenuItemSavedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter the Menu Item With Serving Size Name")
public void iEnterTheMenuItemWithServingSizeName() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Select Cost Type as Fixed")
public void iSelectCostTypeAsFixed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Select Serving Size in Set Price for Fixed")
public void iSelectServingSizeInSetPriceForFixed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Search and Edit the Menu Item")
public void iSearchAndEditTheMenuItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Verify the Update Menu Item Header")
public void verifyTheUpdateMenuItemHeader() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Conversational UI at POS is Enabled")
public void iVerifyConversationalUIAtPOSIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enable Hide In Kiosk Toggle")
public void iEnableHideInKioskToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Verify whether the Menu Item is Updated or not")
public void verifyWhetherTheMenuItemIsUpdatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Hide In Kiosk is Enabled")
public void iVerifyHideInKioskIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enable EBT Menu Item Toggle")
public void iEnableEBTMenuItemToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify EBT Menu Item is Enabled")
public void iVerifyEBTMenuItemIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enable Hide In POS Toggle")
public void iEnableHideInPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Hide In POS is Enabled")
public void iVerifyHideInPOSIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Hide In Online Order is Enabled")
public void iVerifyHideInOnlineOrderIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enable Eighty Six List Toggle")
public void iEnableEightySixListToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Eighty Six List is Enabled")
public void iVerifyEightySixListIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Enable Hide Menu Item Picture In POS Toggle")
public void iEnableHideMenuItemPictureInPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Hide Menu Item Picture In POS is Enabled")
public void iVerifyHideMenuItemPictureInPOSIsEnabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Disable Hide In Kiosk Toggle")
public void iDisableHideInKioskToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Disable EBT Menu Item Toggle")
public void iDisableEBTMenuItemToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Disable Hide In POS Toggle")
public void iDisableHideInPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Disable Eighty Six List Toggle")
public void iDisableEightySixListToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Disable Hide Menu Item Picture In POS Toggle")
public void iDisableHideMenuItemPictureInPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Hide In Kiosk is Disabled")
public void iVerifyHideInKioskIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify EBT Menu Item is Disabled")
public void iVerifyEBTMenuItemIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Hide In POS is Disabled")
public void iVerifyHideInPOSIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Hide In Online Order is Disabled")
public void iVerifyHideInOnlineOrderIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Eighty Six List is Disabled")
public void iVerifyEightySixListIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verify Hide Menu Item Picture In POS is Disabled")
public void iVerifyHideMenuItemPictureInPOSIsDisabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Verfiy whether Menu Item Updated or Not")
public void verfiyWhetherMenuItemUpdatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Check the Menu Type is Selected as Menu Item With Serving Size")
public void checkTheMenuTypeIsSelectedAsMenuItemWithServingSize() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check the Cost Type is Selected as Fixed")
public void checkTheCostTypeIsSelectedAsFixed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Select Cost Type as Variable")
public void iSelectCostTypeAsVariable() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check the Menu Type is Selected as Open Item")
public void checkTheMenuTypeIsSelectedAsOpenItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check the Cost Type is Selected as Variable")
public void checkTheCostTypeIsSelectedAsVariable() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check the Menu Type is Selected as Scale Item")
public void checkTheMenuTypeIsSelectedAsScaleItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check the Menu Type is Selected as Combo Item")
public void checkTheMenuTypeIsSelectedAsComboItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Search the Menu Item and Click the Delete button")
public void iSearchTheMenuItemAndClickTheDeleteButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Verify the Cancelled Menu Item Deleted\\/Inactivated or not")
public void verifyTheCancelledMenuItemDeletedInactivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verifying the Menu Item Deleted or not")
public void iVerifyingTheMenuItemDeletedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Menu Item")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedMenuItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Search the Menu Item and Click the Active button")
public void iSearchTheMenuItemAndClickTheActiveButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Verify the Cancelled Menu Item is Activated or not")
public void verifyTheCancelledMenuItemIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I Verifying the Menu Item Activated or not")
public void iVerifyingTheMenuItemActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Click the Active button to navigate Activated screen to Verify Activated Menu Item")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedMenuItem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Verfiy whether Duplicate Menu Item Saved or Not")
public void verfiyWhetherDuplicateMenuItemSavedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Search the Combo Menu Item and Click the Delete button")
public void iSearchTheComboMenuItemAndClickTheDeleteButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("I Verifying the Combo Menu Item is Deleted or not")
public void iVerifyingTheComboMenuItemIsDeletedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Search the Menu Item and Click the Copy button")
public void iSearchTheMenuItemAndClickTheCopyButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enable the Override Prefix Upcharges Toggle")
public void iEnableTheOverridePrefixUpchargesToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter the Include Modifier Prefix Price in Decimal")
public void iEnterTheIncludeModifierPrefixPriceInDecimal() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check the Include Modifier Prefix Price in Decimal")
public void checkTheIncludeModifierPrefixPriceInDecimal() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Select the Parent Modifiers in Modifier Group")
public void iSelectTheParentModifiersInModifierGroup() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check the Selected Parent Modifiers in Mandatory Modifier Group is Available or Not")
public void checkTheSelectedParentModifiersInMandatoryModifierGroupIsAvailableOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I Enable Set Tiered Price Toggle")
public void iEnableSetTieredPriceToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Click the Add Set Tiered Price button")
public void iClickTheAddSetTieredPriceButton() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Select the Serving Size")
public void iSelectTheServingSize() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter the Sequence")
public void iEnterTheSequence() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter the Quantity")
public void iEnterTheQuantity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Select the Set Price For")
public void iSelectTheSetPriceFor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter Set Price in Decimal")
public void iEnterSetPriceInDecimal() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Check Updated Set Tiered Price is Showing Correctly or not")
public void checkUpdatedSetTieredPriceIsShowingCorrectlyOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Search and Edit the Menu Item With Serving Size")
public void iSearchAndEditTheMenuItemWithServingSize() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Click the Add Serving Size Level")
public void iClickTheAddServingSizeLevel() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Select Second Serving Size in Set Price for Fixed")
public void iSelectSecondServingSizeInSetPriceForFixed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enable Price Level Settings Toggle")
public void iEnablePriceLevelSettingsToggle() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter the Second Set Price Level for Fixed")
public void iEnterTheSecondSetPriceLevelForFixed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Check Updated Price Level Settings Values in Serving Size Levels are Showing Correctly or not")
public void checkUpdatedPriceLevelSettingsValuesInServingSizeLevelsAreShowingCorrectlyOrNot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


	
}
