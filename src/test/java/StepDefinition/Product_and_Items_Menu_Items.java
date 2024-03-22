package StepDefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.GiftCardsPage;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.ProductItems_Menu_RetailPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.SubCategoriesPage;
import com.Pages.UpchargesPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

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
	
	public static ArrayList<String> taxlist1=new ArrayList<>();
	public static ArrayList<String> taxlist2=new ArrayList<>();
	public static String Sel_TaxSize;
	
//	GiftCardsPage gc=new GiftCardsPage();
	
	@Given("Open the Product\\/Items home page BaseURL and StoreID")
	public void openTheProductItemsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//Load the Category page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"productItems");
	}
	
	@Given("Verifying the Product\\/Items Header page")
	public void verifyingTheProductItemsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Category page loaded or not
		cmp.VerifyMainScreenPageHeader("Products/Items");	
	}





	@Given("I Click the New Menu Item button")
	public void iClickTheNewMenuItemButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
	    pmt.Click_New_MenuItem();
	}
	
	@Given("I Select the Level Type in General as Sub-Category")
	public void iSelectTheLevelTypeInGeneralAsSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		up.Select_LevelType_SubCategory_GeneralTab();
	}

	
	@Then("Verify the New Menu Item header")
	public void verifyTheNewMenuItemHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);

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

//@Given("I Check Evertec Type and Check the Evertec Options is Displayed")
//public void iCheckEvertecTypeAndCheckTheEvertecOptionsIsDisplayed() throws Exception {
//    // Write code here that turns the phrase above into concrete actions
//   
//}


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
    driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[2]//input)[2]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div[2]//input)[2]")).sendKeys(SeqNo_inSetPrice);
    
//    Thread.sleep(1000);
//    driver.findElement(By.xpath("//select-option[.='"+SeqNo_inSetPrice+"']")).click();
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
public void iSelectTheMenuTypeAsComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	cmp.Pricing_Cost_Tab_inContents.click();
	Thread.sleep(1000);
    pmt.ComboItem_MenuType_RadioBtn.click();
}
@Then("Check Price Level Settings Toggle is Disabled")
public void checkPriceLevelSettingsToggleIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_False_Element_Not_Selected(pmt.Price_Level_Settings_YesBtn);
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
//	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
	Thread.sleep(1000);
	cmp.Pricing_Cost_Tab_inContents.click();
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
    cmp.Click_DropDown(driver.findElement(By.xpath("(//input[@aria-label='Menu Item'])[1]")), "Menu Item Selected for Combo Item");
    Thread.sleep(1000);
    cmp.Click_DropDown(driver.findElement(By.xpath("(//input[@aria-label='Serving Size'])[1]")), "Serving Size Selected for Combo Item");
    Thread.sleep(1000);
    cmp.Enter_Text(driver.findElement(By.xpath("(//input[@aria-label='S.No'])[1]")), "1", "S.No Entered for Combo Item");
    Thread.sleep(1000);
    cmp.Enter_Text(driver.findElement(By.xpath("(//input[@aria-label='Unit Price'])[1]")), "2500", "Unit Price Entered for Combo Item");
    
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
	Thread.sleep(2000);
pmt.Click_Add_Menu_Item();
	
Thread.sleep(2000);
	String SeqNo_Combo=driver.findElement(By.xpath("(//input[@aria-label='S.No'])[1]")).getAttribute("value");
	
	
	Thread.sleep(1000);
//	  cmp.Click_DropDown(driver.findElement(By.xpath("(//input[@aria-label='Menu Item'])[2]")), "Same Menu Item Selected for Combo Item");
	   
	driver.findElement(By.xpath("(//input[@aria-label='S.No'])[2]")).clear();
	
	 Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@aria-label='S.No'])[2]")).sendKeys(SeqNo_Combo);
//	    driver.findElement(By.xpath("//select-option[.='"+SeqNo_Combo+"']")).click();
}

@Then("Check Seq.No Already Exists Error is Displayed")
public void checkSeqNoAlreadyExistsErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.SeqNo_Already_Exists_ErrorMsg, "Seq.No Already Exists Error");
}

@Then("I Select the Menu Item in Combo Item")
public void iSelectTheMenuItemInComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
	Thread.sleep(1000);
    cmp.Click_DropDown(driver.findElement(By.xpath("//input[@aria-label='Menu Item']")), "Menu Item Selected for Combo Item");

}
@Then("I Select the Serving Size in Combo Item")
public void iSelectTheServingSizeInComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
    cmp.Click_DropDown(driver.findElement(By.xpath("//input[@aria-label='Serving Size']")), "Serving Size Selected for Combo Item");
}
@Then("I Enter the S.No in Combo Item")
public void iEnterTheSNoInComboItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
	Thread.sleep(1000);
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

@When("I Select the Taxes in Drop Down")
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
    cmp.Check_Toggle_Enabled(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains(.,'"+Utility.getProperty("ProductsItems_Add_KitchenPrinter_Name")+"')]")), "Kitchen Printer");

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
    cmp.Check_Toggle_Enabled(driver.findElement(By.xpath("//app-chip[@name='labelPrinter']//mat-chip[contains(.,'"+Utility.getProperty("ProductsItems_Add_LabelPrinter_Name")+"')]")), "Label Printer");
}

@Given("I Verify Searching the Item when entering three letters Two")
public void iVerifySearchingTheItemWhenEnteringThreeLettersTwo() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.SearchAndVerify_SearchBoxTwo();
}

@Given("I Select Included Modifiers Tab")
public void iSelectIncludedModifiersTab() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
    pmt.Included_ModifiersTab.click();
}
@Given("I Click the Add Include Modifiers button")
public void iClickTheAddIncludeModifiersButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Click_Add_Include_Modifiers();
}
@Then("Check Please Choose all the Mandatory fields in Basic Details Error message is Displayed")
public void checkPleaseChooseAllTheMandatoryFieldsInBasicDetailsErrorMessageIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.Choose_All_Mandatory_Fields_in_Basic_Details_ErrorMsg, "Please choose all the mandatory fields in Basic Details Error");
}

@Then("Check Select Modifier Group Error is Displayed")
public void checkSelectModifierGroupErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.Select_Modifier_Group_ErrorMsg, "Select Modifier Group Error");
}
@Then("I Select Modifier Group in Include Modifiers")
public void iSelectModifierGroupInIncludeModifiers() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_ModifierGroup_Include_Modifiers();
}
@Then("I Select Modifier in Include Modifiers")
public void iSelectModifierInIncludeModifiers() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearch(pmt.Modifier_IncludeModifier_InputBx, "Modifiers Selected");
}
@Then("Check Alternate Modifier Group Toggle is Disabled")
public void checkAlternateModifierGroupToggleIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Toggle_Disabled(pmt.Alternate_Modifier_Group_YesBtn, "Alternate Modifier Group");
}
@Then("Check Override Prefix Upcharges Toggle is Disabled")
public void checkOverridePrefixUpchargesToggleIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Toggle_Disabled(pmt.Override_Prefix_Upcharges_YesBtn, "Override Prefix Upcharges");
}
@Then("I Enable Alternate Modifier Group Toggle")
public void iEnableAlternateModifierGroupToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enable_Alternate_Modifier_Group();
}
@Then("I Select the Same Alternate Modifier Group")
public void iSelectTheSameAlternateModifierGroup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    String Modi_GrpName=pmt.ModifierGroup_IncludeModifier_InputBx.getAttribute("value");
    
    cmp.Click_DropDown_withSearchText(pmt.Alternate_Modifier_GroupInputBx, Modi_GrpName, "Same Alternate Modifier Group Selected");
}
@Then("Check Invalid Alternate Modifier Group Error is Displayed")
public void checkInvalidAlternateModifierGroupErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.Invalid_Alternate_Modifier_Group_ErrorMsg, "Invalid Alternate Modifier Group Error");
}
@Then("I Select the Alternate Modifier Group")
public void iSelectTheAlternateModifierGroup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearch(pmt.Alternate_Modifier_GroupInputBx, "Alternate Modifier Group is Selected");
    
    
}
@Given("I Select Mandatory Modifier Groups Tab")
public void iSelectMandatoryModifierGroupsTab() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(4000);
    pmt.Mandatory_ModifierGroupsTab.click();
}
@Given("I Click the Add Mandatory Modifier Group button")
public void iClickTheAddMandatoryModifierGroupButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    pmt.Add_Mandatory_Modifier_GroupBtn.click();
}

@Then("I Select Modifier Group in Mandatory Modifier Group")
public void iSelectModifierGroupInMandatoryModifierGroup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    cmp.Click_DropDown_withSearch(pmt.ModifierGroup_MandatoryModifier_InputBx, "Modifier Group Selected in Mandatory Modifier Groups");
}
@Then("Check Enter Display Order Error is Displayed")
public void checkEnterDisplayOrderErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.Display_OrderErrorMsg, "Enter Display Order Error");
}
@Then("I Enter the Display Order")
public void iEnterTheDisplayOrder() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pmt.Enter_Display_Order_MandatoryModifier("2");
}
@Then("I Enter the Minimum Quantity")
public void iEnterTheMinimumQuantity() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_Minimum_Quantity_MandatoryModifier("3");
}
@Then("I Enter Invalid Maximum Quantity")
public void iEnterInvalidMaximumQuantity() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_Maximum_Quantity_MandatoryModifier("2");
}
@Then("Check Enter Maximum Quantity Error is Displayed")
public void checkEnterMaximumQuantityErrorIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(pmt.Maximum_QuantityErrorMsg, "Enter Maximum Quantity Error");
}
@Then("I Enter the Maximum Quantity")
public void iEnterTheMaximumQuantity() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_Maximum_Quantity_MandatoryModifier("4");
}
@Then("I Disable Jump with Minimum Quantity Toggle")
public void iDisableJumpWithMinimumQuantityToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Disable_Jump_With_Minimum_Quantity();
}


@Given("I Select Optional Modifier Groups Tab")
public void iSelectOptionalModifierGroupsTab() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    pmt.Optional_ModifierGroupsTab.click();
}
@Given("I Click the Add Optional Modifier Group button")
public void iClickTheAddOptionalModifierGroupButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);
    pmt.Click_Add_Optional_ModifierGroup();
}
@Then("I Select Modifier Group in Optional Modifier Group")
public void iSelectModifierGroupInOptionalModifierGroup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearch(pmt.ModifierGroup_OptionalModifier_InputBx, "Modifier Group is Selected in Optional Modifiers");
}
@Then("I Enter the Display Order in Optional Modifier")
public void iEnterTheDisplayOrderInOptionalModifier() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_Display_Order_OptionalModifier("3");
}

@Given("I Select Inventory Details Tab")
public void iSelectInventoryDetailsTab() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);
    pmt.Inventory_DetailsTab.click();
}
@Then("Check Selected Serving Size is Displayed")
public void checkSelectedServingSizeIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    String ServingSize_inSetPrice=driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input)[1]")).getAttribute("value");
  
//    String ServingSize_inInventoryDetails=
    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//span[@class='segment-button-text'][contains(.,'"+ServingSize_inSetPrice+"')]")), "Selected Serving Size is Available in Inventory Details");
    
}
@Then("I Click the Add Inventory Item button")
public void iClickTheAddInventoryItemButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    pmt.Add_Inventory_ItemBtn.click();
}
@Then("I Select the Level in Inventory Item as SubCategory")
public void iSelectTheLevelInInventoryItemAsSubCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSelection(pmt.Level_InventoyItemsInputBx, "Sub Category", "Level Type Selected as SubCategory in Inventory Items");
}
@Then("I Select the Category in Inventory Item")
public void iSelectTheCategoryInInventoryItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(pmt.Category_InventoyItemsInputBx, "Category Selected in Inventory Item");
}
@Then("I Select the SubCategory in Inventory Item")
public void iSelectTheSubCategoryInInventoryItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 Thread.sleep(1000);
    pmt.SubCategory_InventoyItemsInputBx.click();
    
    Thread.sleep(1000);
	
	try
	{
		Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
	}
	
	catch(Exception k)
	{
		if(driver.findElement(By.xpath("//select-option[contains(.,'No results match')]")).isDisplayed())
		{
		    cmp.Click_DropDown_withSelection(pmt.Level_InventoyItemsInputBx, "Category", "Level Type Selected as Category in Inventory Items due to SubCategory Unavailable");

	test.log(LogStatus.INFO, "Sub Categories not available for Selected Categories");
		
	
		cmp.Click_DropDown(pmt.Category_InventoyItemsInputBx, "Category Selected in Inventory Items");
		}
	}
}
@Then("I Select the Item in Inventory Item")
public void iSelectTheItemInInventoryItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(pmt.Item_InventoyItemsInputBx, "Item Selected in Inventory Items");
}
@Then("I Select the Recipe Unit in Inventory Item")
public void iSelectTheRecipeUnitInInventoryItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 cmp.Click_DropDown(pmt.Recipe_Unit_InventoyItemsInputBx, "Recipe Unit Selected in Inventory Items");
}
@Then("I Enter the Quantity in Inventory Item")
public void iEnterTheQuantityInInventoryItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(pmt.Quantity_InventoyItemsInputBx, "5", "Quantity Entered for Inventory Items");
}
@Then("Validate the Cost by using Unit Price with Quantity in Inventory Items")
public void validateTheCostByUsingUnitPriceWithQuantityInInventoryItems() {
    // Write code here that turns the phrase above into concrete actions
//    String UnitPrice=driver.findElement(By.xpath("//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//div[6]/span")).getText().replace(",", "");
	  String UnitPrice=pmt.Unit_Price_InventoryItemsInputBx.getText().replace(",", "");
	
	double Unit_Price=Double.parseDouble(UnitPrice);
    
    String Quan=pmt.Quantity_InventoyItemsInputBx.getAttribute("value");
    int Quantity=Integer.parseInt(Quan);
    
    double ExpectedCost=Unit_Price*Quantity;
    
    String Expected_Cost=String.valueOf(ExpectedCost);
    
//    String Actual_Cost=driver.findElement(By.xpath("//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//div[8]/span")).getText();
    String Actual_Cost=pmt.Cost_InventoryItemsInputBx.getText();
    
    ut.InfoCaptureScreenshotAsBASE64();
    
    cmp.Assertion_Validation_Two_Values(Actual_Cost, Expected_Cost, "Cost Calculated Correctly in Inventory Items");
    
    
}

@Given("I Click the Add Sub-Recipe button")
public void iClickTheAddSubRecipeButton() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(1000);
    pmt.Add_SubRecipeBtn.click();
    
}
@Then("I Select the Item in SubRecipe")
public void iSelectTheItemInSubRecipe() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(driver.findElement(By.xpath("//span[contains(.,'Select Sub Recipes')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Item']")), "Item Selected in SubRecipes");
}
@Then("I Select the Recipe Unit in SubRecipe")
public void iSelectTheRecipeUnitInSubRecipe() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(driver.findElement(By.xpath("//span[contains(.,'Select Sub Recipes')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Recipe Unit']")), "Recipe Unit Selected in SubRecipes");
}
@Then("I Enter the Quantity in SubRecipe")
public void iEnterTheQuantityInSubRecipe() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(driver.findElement(By.xpath("//span[contains(.,'Select Sub Recipes')]/../..//div[contains(@class,'inventory-table')]//input[@aria-label='Quantity']")), "8", "Quantity Entered in SubRecipe");
}
@Then("Validate the Cost by using Unit Price with Quantity in SubRecipe")
public void validateTheCostByUsingUnitPriceWithQuantityInSubRecipe() {
    // Write code here that turns the phrase above into concrete actions
	  String UnitPrice=pmt.Unit_Price_SubRecipeInputBx.getText().replace(",", "");
		
	double Unit_Price=Double.parseDouble(UnitPrice);
  
  String Quan=pmt.Quantity_SubRecipeInputBx.getAttribute("value");
  int Quantity=Integer.parseInt(Quan);
  
  double ExpectedCost=Unit_Price*Quantity;
  
  String Expected_Cost=String.valueOf(ExpectedCost);
  
//  String Actual_Cost=driver.findElement(By.xpath("//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//div[8]/span")).getText();
  String Actual_Cost=pmt.Cost_SubRecipeInputBx.getText();
  
  ut.InfoCaptureScreenshotAsBASE64();
  
  cmp.Assertion_Validation_Two_Values(Actual_Cost, Expected_Cost, "Cost Calculated Correctly in Sub Recipe");

}

@Given("I Click the Add Manual Entry button")
public void iClickTheAddManualEntryButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(1000);
    pmt.Add_Manual_EntryBtn.click();
}
@Then("I Enter the Item Name in Manual Entry")
public void iEnterTheItemNameInManualEntry() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(pmt.Item_ManualEntryInputBx, "Rice", "Item Entered for Manual Entry");
}
@Then("I Enter the Unit Price in Manual Entry")
public void iEnterTheUnitPriceInManualEntry() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Enter_Text(pmt.Unit_Price_ManualEntryInputBx, "2000", "Unit Price Entered for Manual Entry");
}
@Then("I Enter the Quantity in Manual Entry")
public void iEnterTheQuantityInManualEntry() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Enter_Text(pmt.Quantity_ManualEntryInputBx, "4", "Quantity Entered for Manual Entry");
}
@Then("Validate the Cost by using Unit Price with Quantity in Manual Entry")
public void validateTheCostByUsingUnitPriceWithQuantityInManualEntry() {
    // Write code here that turns the phrase above into concrete actions
	  String UnitPrice=pmt.Unit_Price_ManualEntryInputBx.getAttribute("value");
		
		double Unit_Price=Double.parseDouble(UnitPrice);
	  
	  String Quan=pmt.Quantity_ManualEntryInputBx.getAttribute("value");
	  int Quantity=Integer.parseInt(Quan);
	  
	  double ExpectedCost=Unit_Price*Quantity;
	  
	  String Expected_Cost=String.valueOf(ExpectedCost)+"0";
	  
	//  String Actual_Cost=driver.findElement(By.xpath("//span[contains(.,'Selected Inventory Items')]/../..//div[contains(@class,'inventory-table')]//div[8]/span")).getText();
	  String Actual_Cost=pmt.Cost_ManualEntryInputBx.getText();
	  
	  
	  ut.InfoCaptureScreenshotAsBASE64();
	  
	  cmp.Assertion_Validation_Two_Values(Actual_Cost, Expected_Cost, "Cost Calculated Correctly in Manual Entry");
	  
	  
}

@Given("I Enter the Secondary Name")
public void iEnterTheSecondaryName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(pmt.Secondary_NameInputBx, "Rock", "Secondary Name Entered");
}
@Given("I Enter the PLU Code")
public void iEnterThePLUCode() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_PLU_Code(Utility.getProperty("ProductsItems_PLU_Code"));
}
@Given("I Enter the Item Preparation Time")
public void iEnterTheItemPreparationTime() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_Item_Preparation_Time("10");
}
@Given("I Check the Evertec Options is Displayed and Select Evertec")
public void iCheckTheEvertecOptionsIsDisplayedAndSelectEvertec() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 pmt.Select_Evertec_TaxType();
}
@Given("I Enable Conversational UI at POS Toggle")
public void iEnableConversationalUIAtPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enable_Conversational_UI_atPOS();
}
@Given("I Disable Price Level Settings Toggle")
public void iDisablePriceLevelSettingsToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Disable_Price_Level_Settings();
}
//@Given("I Select the Taxes")
//public void iSelectTaxes() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
@Then("Verfiy whether Menu Item Saved or Not")
public void verfiyWhetherMenuItemSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessageForPublish("Menu Item Saved");
}
@Given("I Enter the Menu Item With Serving Size Name")
public void iEnterTheMenuItemWithServingSizeName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.EnterName("SerS"+Utility.getProperty("ProductsItems_MenuItemName"));
}
@Given("I Select Cost Type as Fixed")
public void iSelectCostTypeAsFixed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	cmp.Pricing_Cost_Tab_inContents.click();
	}
	catch(Exception k) {}
	for(int i=1;i<=5;i++)
	{
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
   pmt.Select_Fixed_Cost_Type();
}
@Given("I Select Serving Size in Set Price for Fixed")
public void iSelectServingSizeInSetPriceForFixed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Serving_Size_For_Fixed_CostType();
}
@Given("I Search and Edit the Menu Item")
public void iSearchAndEditTheMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
//    gc.Click_Edit_GiftCardButton(Utility.getProperty("ProductsItems_MenuItemName"));
    pmt.SearchAndClickEdit_MenuItemPage(Utility.getProperty("ProductsItems_MenuItemName"));
}
@Then("Verify the Update Menu Item Header")
public void verifyTheUpdateMenuItemHeader() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyCreationScreenPageHeader_Two("Update Menu Item");
}
@Then("I Verify Conversational UI at POS is Enabled")
public void iVerifyConversationalUIAtPOSIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Toggle_Enabled(pmt.Conversational_UI_atPOS_YesBtn, "Conmversational UI POS");
}
@Then("I Enable Hide In Kiosk Toggle")
public void iEnableHideInKioskToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	cmp.Visibility_Tab_inContents.click();
	}
	catch(Exception j) {}
	Thread.sleep(1000);
	
    pmt.Enable_Hide_In_Kiosk();
}

@Then("I Verify Hide In Kiosk is Enabled")
public void iVerifyHideInKioskIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	cmp.Visibility_Tab_inContents.click();
	}
	catch(Exception j) {}
	Thread.sleep(1000);
	
	  cmp.Check_Toggle_Enabled(pmt.Hide_In_Kiosk_YesBtn, "Hide In Kiosk");
}
@Then("I Enable EBT Menu Item Toggle")
public void iEnableEBTMenuItemToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enable_EBT_Menu_Item();
}
@Then("I Verify EBT Menu Item is Enabled")
public void iVerifyEBTMenuItemIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	  cmp.Check_Toggle_Enabled(pmt.EBT_Menu_Item_YesBtn, "EBT Menu Item");
}
@Then("I Enable Hide In POS Toggle")
public void iEnableHideInPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enable_Hide_In_POS();
}
@Then("I Verify Hide In POS is Enabled")
public void iVerifyHideInPOSIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	  cmp.Check_Toggle_Enabled(pmt.Hide_In_POS_YesBtn, "Hide In POS");
}
@Then("I Verify Hide In Online Order is Enabled")
public void iVerifyHideInOnlineOrderIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	  cmp.Check_Toggle_Enabled(pmt.Hide_In_Online_Order_YesBtn, "Hide In Online Order");
}
@Then("I Enable Eighty Six List Toggle")
public void iEnableEightySixListToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enable_Eighty_Six_List();
}
@Then("I Verify Eighty Six List is Enabled")
public void iVerifyEightySixListIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	  cmp.Check_Toggle_Enabled(pmt.Eighty_Six_List_YesBtn, "86 List");

}
@Then("I Enable Hide Menu Item Picture In POS Toggle")
public void iEnableHideMenuItemPictureInPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enable_Toggle(pmt.Hide_MenuItem_Picture_inPOS_YesBtn, "Hide Menu Item Picture In POS");
}
@Then("I Verify Hide Menu Item Picture In POS is Enabled")
public void iVerifyHideMenuItemPictureInPOSIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	  cmp.Check_Toggle_Enabled(pmt.Hide_MenuItem_Picture_inPOS_YesBtn, "Hide Menu Item Picture In POS");
}
@Then("I Disable Hide In Kiosk Toggle")
public void iDisableHideInKioskToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	cmp.Visibility_Tab_inContents.click();
	}
	catch(Exception j) {}
	Thread.sleep(1000);
	
    pmt.Disable_Hide_In_Kiosk();
}
@Then("I Disable EBT Menu Item Toggle")
public void iDisableEBTMenuItemToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Disable_EBT_Menu_Item();
}
@Then("I Disable Hide In POS Toggle")
public void iDisableHideInPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Disable_Hide_In_POS();
}
@Then("I Disable Eighty Six List Toggle")
public void iDisableEightySixListToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Disable_Eighty_Six_List();
}
@Then("I Disable Hide Menu Item Picture In POS Toggle")
public void iDisableHideMenuItemPictureInPOSToggle() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Disable_Toggle(pmt.Hide_MenuItem_Picture_inPOS_YesBtn, pmt.Hide_MenuItem_Picture_inPOS_NoBtn, "Hide Menu Item Picture In POS");
}
@Then("I Verify Hide In Kiosk is Disabled")
public void iVerifyHideInKioskIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	cmp.Visibility_Tab_inContents.click();
	}
	catch(Exception j) {}
	Thread.sleep(1000);
	
	  cmp.Check_Toggle_Disabled(pmt.Hide_In_Kiosk_YesBtn, "Hide In Kiosk");
}
@Then("I Verify EBT Menu Item is Disabled")
public void iVerifyEBTMenuItemIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Disabled(pmt.EBT_Menu_Item_YesBtn, "EBT Menu Item");
}
@Then("I Verify Hide In POS is Disabled")
public void iVerifyHideInPOSIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Disabled(pmt.Hide_In_POS_YesBtn, "Hide In POS");
}
@Then("I Verify Hide In Online Order is Disabled")
public void iVerifyHideInOnlineOrderIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Disabled(pmt.Hide_In_Online_Order_YesBtn, "Hide In Online Order");
}
@Then("I Verify Eighty Six List is Disabled")
public void iVerifyEightySixListIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Disabled(pmt.Eighty_Six_List_YesBtn, "86 List");

}
@Then("I Verify Hide Menu Item Picture In POS is Disabled")
public void iVerifyHideMenuItemPictureInPOSIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Disabled(pmt.Hide_MenuItem_Picture_inPOS_YesBtn, "Hide Menu Item Picture In POS");
}

@Then("Verfiy whether Menu Item Updated or Not")
public void verfiyWhetherMenuItemUpdatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessageForPublish("Menu Item Updated");
}

@Then("Check the Menu Type is Selected as Menu Item With Serving Size")
public void checkTheMenuTypeIsSelectedAsMenuItemWithServingSize() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_True_Element_Selected(pmt.MenuItem_With_ServingSize_MenuType_RadioBtn);
}
@Then("Check the Cost Type is Selected as Fixed")
public void checkTheCostTypeIsSelectedAsFixed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Assertion_Validation_True_Element_Selected(pmt.Fixed_Cost_TypeRadioBtn);

}
@Then("I Select Cost Type as Variable")
public void iSelectCostTypeAsVariable() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(1000);
    pmt.Select_Variable_Cost_Type();
}
@Then("Check the Menu Type is Selected as Open Item")
public void checkTheMenuTypeIsSelectedAsOpenItem() {
    // Write code here that turns the phrase above into concrete actions
	cmp.Assertion_Validation_True_Element_Selected(pmt.OpenItem_MenuType_RadioBtn);
}
@Then("Check the Cost Type is Selected as Variable")
public void checkTheCostTypeIsSelectedAsVariable() {
    // Write code here that turns the phrase above into concrete actions
	cmp.Assertion_Validation_True_Element_Selected(pmt.Variable_Cost_TypeRadioBtn);
}
@Then("Check the Menu Type is Selected as Scale Item")
public void checkTheMenuTypeIsSelectedAsScaleItem() {
    // Write code here that turns the phrase above into concrete actions
	cmp.Assertion_Validation_True_Element_Selected(pmt.ScaleItem_MenuType_RadioBtn);
}
@Then("Check the Menu Type is Selected as Combo Item")
public void checkTheMenuTypeIsSelectedAsComboItem() {
    // Write code here that turns the phrase above into concrete actions
	cmp.Assertion_Validation_True_Element_Selected(pmt.ComboItem_MenuType_RadioBtn);
}

@Given("I Take selected Tax Names")
public void iTakeSelectedTaxNames() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
    List<WebElement> txlist=driver.findElements(By.xpath("//div[@id='new-menu-item-tax']//app-chip//mat-chip-list//mat-chip[contains(@class,'selected')]"));
   this.Sel_TaxSize=String.valueOf(txlist.size());
    
//   System.out.println("Tax size Before Reopen : "+txlist.size());
    for(WebElement taxName:txlist)
    {
    	taxlist1.add(taxName.getText());
    	
    	
    }
//    ArrayList<String> sortedList = new ArrayList<String>();
//	for(String s:taxlist)
//	{
//	sortedList.add(s);
//	}
	Collections.sort(taxlist1);
	
	 test.log(LogStatus.INFO, "Tax size Before Reopen : "+txlist.size()+" Selected Taxes before Reopen : "+taxlist1);
	   ut.PassedCaptureScreenshotAsBASE64();
    
}
@Then("Check Tax selected as Expected")
public void checkTaxSelectedAsExpected() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(6000);
	cmp.Tax_Tab_inContents.click();
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	
	try
	{
	Thread.sleep(1000);
	if(ctp.ShowAll_Select_TaxBtn.isDisplayed())
	{
		Thread.sleep(1000);
		ctp.ShowAll_Select_TaxBtn.click();
	}
	}
	catch(Exception l) {}
	
	
	 List<WebElement> txlist=driver.findElements(By.xpath("//div[@id='new-menu-item-tax']//app-chip//mat-chip-list//mat-chip[contains(@class,'selected')]"));
//	    this.Sel_TaxSize=txlist.size();
	 
	    
//	   System.out.println("Tax size After Reopen : "+txlist.size());
//	 if(txlist.size()==Sel_TaxSize)
//	 {
//		 test.log(null, null)
//	 }
	   
//	   test.log(lo, Sel_TaxSize)
	   
	   if(Sel_TaxSize.equals(String.valueOf(txlist.size())))
			   {
		   		test.log(LogStatus.PASS, "Selected Taxes available after Reopen");
		   		
		   		ut.PassedCaptureScreenshotAsBASE64();
			   }
	   else
	   {
	   		test.log(LogStatus.FAIL, "Selected Taxes available after Reopen");
	   		
	   		ut.FailedCaptureScreenshotAsBASE64();

	   }
	   
//	   for(WebElement txName:txlist)
//	   {
	   
//	   test.log(LogStatus.INFO, "Tax size After Reopen : "+txlist.size()+ " Selected Taxes after Reopen : "+txName.getText());
//	   ut.PassedCaptureScreenshotAsBASE64();
//	   }
	 
	 cmp.Assertion_Validation_Two_Values(Sel_TaxSize, String.valueOf(txlist.size()), "Selected Tax Count is Equal");
	    
	    for(WebElement taxName:txlist)
	    {
	    	taxlist2.add(taxName.getText());
	    	
	    	
	    }
//	    ArrayList<String> sortedList1 = new ArrayList<String>();
//		for(String s:taxlist2)
//		{
//		sortedList1.add(s);
//		}
		Collections.sort(taxlist2);
		
//		if(taxlist.equals(sortedList1))
//		{
//			
//		}
		  test.log(LogStatus.INFO, "Tax size After Reopen : "+txlist.size()+ " Selected Taxes after Reopen : "+taxlist2);
		   ut.PassedCaptureScreenshotAsBASE64();
		cmp.Assertion_Validation_Two_ListValues(taxlist1, taxlist2, "Selected Taxes Available as Expected");
}


@Given("I Search the Menu Item and Click the Delete button")
public void iSearchTheMenuItemAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.SearchAndClickDelete_MenuItemPage(Utility.getProperty("ProductsItems_MenuItemName"));
    
    Thread.sleep(500);
			//Click the Delete button
			cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
    
 
}
@Then("Verify the Cancelled Menu Item Deleted\\/Inactivated or not")
public void verifyTheCancelledMenuItemDeletedInactivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Menu Item Inactivated Successfully"))
	{
		test.log(LogStatus.FAIL, "Menu Item Deleted when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
		
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Menu Item not Deleted when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}
@Then("I Verifying the Menu Item Deleted or not")
public void iVerifyingTheMenuItemDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Menu Item Inactivated");
}
@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Menu Item")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_ActivetoInactiveButton();
	
	//Check whether the Inactive screen opened or not
	cmp.VerifyActive_InactiveStatus("Inactive");
	
	Thread.sleep(3000);
	cmp.Verify_Search(Utility.getProperty("ProductsItems_MenuItemName"));
}

@Given("I Search the Menu Item and Click the Active button")
public void iSearchTheMenuItemAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Search and Activate the In activated item
	cmp.SearchAndClickActivate(Utility.getProperty("ProductsItems_MenuItemName"));
	
	Thread.sleep(1500);
	//Click the Delete button
	cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
}
@Then("Verify the Cancelled Menu Item is Activated or not")
public void verifyTheCancelledMenuItemIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
	Thread.sleep(3000);
	//Check whether the New Modifier Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Menu Item Activated Successfully"))
	{
		test.log(LogStatus.FAIL, "Menu Item Activated when clicking Cancel button");
	
		ut.FailedCaptureScreenshotAsBASE64();
	}
	}
	catch(Exception g)
	{
		test.log(LogStatus.PASS, "Menu Item not Activated when Clicking Cancel button");
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

@Then("I Verifying the Menu Item Activated or not")
public void iVerifyingTheMenuItemActivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Menu Item Activated");
}
@Then("I Click the Active button to navigate Activated screen to Verify Activated Menu Item")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedMenuItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	//Enable Active Status
	cmp.Click_InactivetoActiveButton();
			
	Thread.sleep(500);
	//Check whether verify whether the Active page opened or not
	cmp.VerifyActive_InactiveStatus("Active");
	
	//Verify whether the Category activated or not
	cmp.Verify_Search(Utility.getProperty("ProductsItems_MenuItemName"));
}
@Then("Verfiy whether Duplicate Menu Item Saved or Not")
public void verfiyWhetherDuplicateMenuItemSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
//	Thread.sleep(5000);
	//Check whether the New Category Saved or not
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
	{
		test.log(LogStatus.PASS, "Menu Item Name already exist pop up displayed");
	
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
	else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Menu Item Saved and Published Successfully"))
	{
		test.log(LogStatus.FAIL, "Duplicate Menu Item Saved");
	
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Menu Item Name already exist pop up not Displayed");
		
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	try
	{
		Thread.sleep(2000);
		cmp.Click_BackspaceButton();
		
		System.out.println("Cancel button not Clicked while creating Duplicate Menu Item");
	}
	catch(Exception k)
	{}
}
@Given("I Search the Combo Menu Item and Click the Delete button")
public void iSearchTheComboMenuItemAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.SearchAndClickDelete_MenuItemPage("Comb"+Utility.getProperty("ProductsItems_MenuItemName"));
}
@Then("I Verifying the Combo Menu Item is Deleted or not")
public void iVerifyingTheComboMenuItemIsDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifySaveConfirmationAlertMessage("Menu Item Inactivated");
}

@Given("I Search the Menu Item and Click the Copy button")
public void iSearchTheMenuItemAndClickTheCopyButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.SearchAndClickCopy_MenuItemPage(Utility.getProperty("ProductsItems_MenuItemName"));
}
@Given("I Enable the Override Prefix Upcharges Toggle")
public void iEnableTheOverridePrefixUpchargesToggle() {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enable_Toggle(pmt.Override_Prefix_Upcharges_YesBtn, "Override Prefux Upcharges Toggle");
}
@Given("I Enter the Include Modifier Prefix Price in Decimal")
public void iEnterTheIncludeModifierPrefixPriceInDecimal() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(pmt.Prefix_Price_IncludedModifiersInputBx, "2.87", "Prefix Price is Entered as Decimal value");
}
@Then("Check the Include Modifier Prefix Price in Decimal")
public void checkTheIncludeModifierPrefixPriceInDecimal() {
    // Write code here that turns the phrase above into concrete actions
    String Prefix_DecimalPrice=pmt.Prefix_Price_IncludedModifiersInputBx.getAttribute("value");
    
    ut.InfoCaptureScreenshotAsBASE64();
    
    cmp.Assertion_Validation_Two_Values(Prefix_DecimalPrice, "2.87", "Prefix Displayed Same Decimal value after Reopen");
}

@Given("I Select the Parent Modifiers in Modifier Group")
public void iSelectTheParentModifiersInModifierGroup() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
    driver.findElement(By.xpath("(//app-segmentation[@name='mandatoryModifierSegment']/div/div[1]/div/div/button/span/div/div)[1]")).click();

    Thread.sleep(1000);
//    String Sld_Modi_Grp=pmt.ModifierGroup_MandatoryModifier_InputBx.getAttribute("value");
    String Modi_Mand_ModiGrp_Sld=driver.findElement(By.xpath("(//data-grid-table//td[1])[1]")).getText().trim();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//app-segmentation[@name='mandatoryModifierSegment']/div/div[1]/div/div/button/span/div/div)[2]")).click();

    Thread.sleep(1000);
    cmp.Enter_Text(pmt.Parent_Modifiers_InputBx, Modi_Mand_ModiGrp_Sld, "Same Modifier from Mandatory Modifier Groups is Selected for Parent Modifiers");
    
    Thread.sleep(500);
    cmp.First_Option_inDropDown.click();
}
@Then("Check the Selected Parent Modifiers in Mandatory Modifier Group is Available or Not")
public void checkTheSelectedParentModifiersInMandatoryModifierGroupIsAvailableOrNot() {
    // Write code here that turns the phrase above into concrete actions
    if(pmt.Parent_Modifiers_InputBx.getAttribute("value")!=null)
    {
    	test.log(LogStatus.PASS, "Selected Parent Modifiers Available After Reopen");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    }
    else
    {
    	test.log(LogStatus.FAIL, "Selected Parent Modifiers is Not Available After Reopen");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    }

}

@Given("I Enable Set Tiered Price Toggle")
public void iEnableSetTieredPriceToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enable_Set_Tiered_Price_MandatoryModifier();
}
@Given("I Click the Add Set Tiered Price button")
public void iClickTheAddSetTieredPriceButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    pmt.Add_Set_Tiered_Price_MandatoryModiBtn.click();
}
@Given("I Select the Serving Size")
public void iSelectTheServingSize() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(pmt.Serving_Size_InputBx, "Serving Size is Selected");
}
@Given("I Enter the Sequence")
public void iEnterTheSequence() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("I Enter the Quantity in Set Tiered Price")
public void iEnterTheQuantityInSetTieredPrice() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(pmt.Quantity_Set_Tiered_Price_MandatoryModiInputBx, "6", "Quantity Entered for Set Tiered Price");
}
@Given("I Select the Set Price For")
public void iSelectTheSetPriceFor() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown(pmt.Set_Price_For_Set_Tiered_Price_MandatoryModiInputBx, "Set Price For is Selected in Set Tiered Price");
}
@Given("I Enter Set Price in Decimal in Set Tiered Price")
public void iEnterSetPriceInDecimalInSetTieredPrice() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Enter_Text(pmt.Price_Set_Tiered_Price_MandatoryModiInputBx, "12.88", "Price is Entered as Decimal in Set Tiered Price");
}
@Then("Check Updated Set Tiered Price is Showing Correctly or not")
public void checkUpdatedSetTieredPriceIsShowingCorrectlyOrNot() {
    // Write code here that turns the phrase above into concrete actions
    ut.InfoCaptureScreenshotAsBASE64();
    
    cmp.Assertion_Validation_Two_Values(pmt.Price_Set_Tiered_Price_MandatoryModiInputBx.getAttribute("value").trim(), "12.88", "Set Tiered Price is Correct After Reopen the Menu Item");
}
@Given("I Search and Edit the Menu Item With Serving Size")
public void iSearchAndEditTheMenuItemWithServingSize() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.SearchAndClickEdit_MenuItemPage("SerS"+Utility.getProperty("ProductsItems_MenuItemName"));
}
@Given("I Click the Add Serving Size Level")
public void iClickTheAddServingSizeLevel() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Click_Add_Serving_Size_Level();
}
@Given("I Select Second Serving Size in Set Price for Fixed")
public void iSelectSecondServingSizeInSetPriceForFixed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Serving_MenuItem_With_ServingSize_Fixed_CostType_Second();
    
  //form[@id='pricingCostForm']/div/div/div/div/app-selectbox/div/mat-form-field/div/div/div[3]/input
}
@Given("I Enable Price Level Settings Toggle")
public void iEnablePriceLevelSettingsToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enable_Price_Level_Settings();
}
@Given("I Enter the Second Set Price Level for Fixed")
public void iEnterTheSecondSetPriceLevelForFixed() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div//input[@aria-label='Price'])[2]")).clear();
    driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div//input[@aria-label='Price'])[2]")).sendKeys("2800");
}

@Then("Check Updated Price Level Settings Values in Serving Size Levels are Showing Correctly or not")
public void checkUpdatedPriceLevelSettingsValuesInServingSizeLevelsAreShowingCorrectlyOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);
    String PriceLevelSettings_Price1=driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div//input[@aria-label='Price'])[1]")).getAttribute("value");
    
    String PriceLevelSettings_Price2=driver.findElement(By.xpath("(//form[@id='pricingCostForm']/div//input[@aria-label='Price'])[2]")).getAttribute("value");
    
//    cmp.Assertion_Validation_Two_Values_NotEquals(PriceLevelSettings_Price2, PriceLevelSettings_Price1, "")
    ut.InfoCaptureScreenshotAsBASE64();
    
    cmp.Assertion_Validation_Two_Values(PriceLevelSettings_Price1, "20.00", "First Price for Price Level settings is Unchanged");

    
    cmp.Assertion_Validation_Two_Values(PriceLevelSettings_Price2, "28.00", "Second Price for Price Level settings is Unchanged");
    
}


	
}
