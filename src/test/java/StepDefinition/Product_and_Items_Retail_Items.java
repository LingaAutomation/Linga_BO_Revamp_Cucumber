package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product_and_Items_Retail_Items {

	
	WebDriver driver=new Driver_Manager().getDriver();
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
	
	
	@Given("Open the Product\\/Items - Retail Item home page BaseURL and StoreID")
	public void openTheProductItemsRetailItemHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"productItems");
		Thread.sleep(5000);
		cmp.waitForPageToLoad();
	}
	
	@When("Verify the Ascending and Decending Order")
	public void verifyTheAscendingAndDecendingOrder() {
	    // Write code here that turns the phrase above into concrete actions
	  cmp.Ascending_And_Descending_Order();
	}

	
	@Given("Click RETAIL ITEMS menu")
	public void clickTheRetailItemMenuButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
				pmt.Click_RetailItem_MenuBtn();
		}
	
	@Given("Click the New Retail Item button")
	public void clickTheNewRetailItemButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
				pmt.Click_New_RetailItem();
		}
	
	@Then("Verify the New Retail Item header")
	public void verifyTheNewRetailItemHeader() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   pmt.VerifyRetailItemScreenPageHeader("New Retail Item");
	}

@Given("I Select the POS Level as Category")
public void iSelectThePOSLevelAsCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Click_Category_LevelTypeOption_RetailItem();
}

@Given("I Select the POS Category")
public void iSelectThePOSCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pmt.Select_Category_LevelType();
}

@Given("I Select the Taxes from RetailItems")
public void ISelectTaxes_RetailItems() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pmt.Select_Taxes_RetailItems();
}


@Given("I Select Unit of Measure")
public void iSelectUnitOfMeasure() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.IselectunitofMeasure();
}

@Given("I Enter the SKU Code")
public void iEnterTheSKUCode() throws Exception {
    // Write code here that turns the phrase above into concrete actions
pmt.IEnterSKUcode();	
}
	
@Given("I Enter the Selling Price")
public void iEnterTheSellingPrice() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Enter_SellingPrice("2.88");}
	
	
	@Given("I Verify Basic details title to scroll up page")
	public void iVerifyBasicdetailsTitle() throws Exception {
		pmt.Verify_BasicdetailsTitle("Basic Details");
	
}
	
@Given("I Select the Inventory Level as Category")
public void iSelectTheInventoryLevelAsCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Click_Category_LevelTypeOption_RetailItemInventory();
}

@Given("I Select the Inventory Category drop down")
public void iSelectTheInventoryCategorydropdown() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Select_Categorydropdown_InventoryRetailInputBx();
	
	}


@Given("I Select the Inventory Category")
public void iSelectTheInventoryCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Select_Category_InventoryRetailInputBx();
}
	
@Given("I Enter the Brand")
public void iEnterTheBrand() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_Brand_RetailItem("Samsung");
}
@Given("I Enter the Inventory Count")
public void iEnterTheInventoryCount() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.IEntertheInventoryCount();
}
@Given("I Select the Inventory Unit")
public void iSelectTheInventoryUnit() throws Exception {
    // Write code here that turns the phrase above into concrete actions
pmt.Select_Inventory_Unit_RetailItem();
}

@Given("I Select the Vendor")
public void iSelectTheVendor() throws Exception {
    // Write code here that turns the phrase above into concrete actions
pmt.Select_Vendor_RetailItem();
}

@Given("I Select the Inventory New Vendor")
public void iSelectTheInventoryNewVendor() throws Exception {
    // Write code here that turns the phrase above into concrete actions
pmt.Select_InventoryNewVendor_RetailItem();
}

@Given("I Select the Tracking")
public void iSelectTheTracking() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Tracking_RetailItem();
}
@Given("I Disable the Calculate COGS On Cost Price Toggle")
public void iDisableTheCalculateCOGSOnCostPriceToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Disable_Calculate_COGS_onCostPrice();
}
@Given("I Select the Primary Storage")
public void iSelectThePrimaryStorage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pmt.Select_Primary_Storage_RetailItem();
}
//@Then("Check the Save button is Disabled")
//public void checkTheSaveButtonIsDisabled() throws Exception {
//    // Write code here that turns the phrase above into concrete actions
// cmp.Check_Save_Button_Diabled();
// }
//@Then("Check the Save button is Enabled")
//public void checkTheSaveButtonIsEnabled() throws Exception {
//    // Write code here that turns the phrase above into concrete actions
// cmp.Check_Save_Button_Enabled();
// }
//
//@Then("Check the Retail Item Update button is Disabled")
//public void checkTheRetailItemUpdateButtonIsDisabled() {
//    // Write code here that turns the phrase above into concrete actions
//    pmt.checkTheUpdateButtonIsDisabled();
//}
@Then("Check the Retail Item Update button is Enabled")
public void checkTheRetailItemUpdateButtonIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	  pmt.checkTheUpdateButtonIsEnabled();
}


@Given("I Enter the Retail Item Name")
public void iEnterTheRetailItemName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.IEnterRetailName(ut.getProperty("Product_Retail_Items_Name"));
  
}

@Given("I Select the POS Level as SubCategory")
public void iSelectThePOSLevelAsSubCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Click_SubCategory_LevelTypeOption_RetailItem();
}

@Given("I Select the Inventory Level as SubCategory")
public void iSelectTheInventoryLevelAsSubCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pmt.Click_SubCategory_LevelTypeOption_RetailItemInventory();
}
@Given("I Select the Inventory SubCategory")
public void iSelectTheInventorySubCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.iSelectInventorySubCategory();
}
@Then("Check No Results Match Info Message is Displayed")
public void checkNoResultsMatchInfoMessageIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.iSelectInventorySubCategory();
}



@Given("I Disable the Inherit Tax From Category Settings Toggle")
public void iDisableTheInheritTaxFromCategorySettingsToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
  pmt.Disable_InheritTaxfromCategorySettings();
  
}

@Given("I Click Add Tax button in New Retail item page")
public void IClickAddTaxbutton_Retailitem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cmp.Click_AddTax_RetailItem();
}

@Given("I Click the tax Save button from Retailitem")
public void IClickTaxSavebutton_Retailitem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
 cmp.IClickTaxSavebutton_Retailitem();  
}

@Given("I Enter the Supplier Cost")
public void iEnterTheSupplierCost() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.IEnterSypplierCost("20");
}

@Given("I Enter the Markup Percentage")
public void iEnterTheMarkupPercentage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pmt.IEnterMarkupPercentage("1.8");
}

@Given("I Enter the Par Level")
public void iEnterTheParLevel() throws Exception {
	
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_Par_Level_RetailItem("2");}
 
    @Given("I Enter the Par Level in Current Inventory Level")
    public void  IEntertheParLevelinCurrentInventoryLevel() throws Exception {
    	
        // Write code here that turns the phrase above into concrete actions
        pmt.iEnterTheCurrentInventoryInInventoryLevel();
    

}
@Given("I Enable the Calculate COGS On Cost Price Toggle")
public void iEnableTheCalculateCOGSOnCostPriceToggle() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enable_Calculate_COGS_onCostPrice();
    }

@Then("Verify whether Retail Item Saved or not")
public void verifyWhetherRetailItemSavedOrNot() throws Throwable {
    pmt.verify_the_RetailItem_SAVED_or_not();
  
}

@And("I Verify Searching the Item when entering three letters for Retail Item")
public void i_Verify_Searching_the_Item_when_entering_three_letters_RetailItem() throws Throwable {
	
	Thread.sleep(1000);
	//Search and Verify the Search box when Entering 3 Characters
	pmt.SearchAndVerify_SearchBox3letter_RetailItem();}

@Given("I Enter the Retail Item Name for Child")
public void iEnterTheRetailItemNameForChild() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	  pmt.IEnterRetailName(ut.getProperty("Product_Retail_Items_Name1"));
}
@Given("I Select the Secondary Storage")
public void iSelectTheSecondaryStorage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_Secondary_Storage_RetailItem();
}
@Given("I Enter the Current Inventory in Inventory Level")
public void iEnterTheCurrentInventoryInInventoryLevel() {
    // Write code here that turns the phrase above into concrete actions
    pmt.iEnterTheCurrentInventoryInInventoryLevel();
}

@Given("I Click the Save & Next button")
public void iClickTheSaveNextButton() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    cmp.iClickTheSaveNextButton();
}

@Then("Check Please Save Retail Item Before Moving To Child Item Info is Displayed #\\(Please Save Retail Item Before Moving To Child Item)")
public void checkPleaseSaveRetailItemBeforeMovingToChildItemInfoIsDisplayedPleaseSaveRetailItemBeforeMovingToChildItem() 
		throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveNextConfirmationAlertMessage("Please Save Retail Item Before Moving To Child Item");
}

@Then("I Click Next button")
public void iClickNextButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.iClickTheNextButton();
}

@Then("Check Please Save Retail Item Before Moving To Child Item Info is Displayed")
public void checkPleaseSaveRetailItemBeforeMovingToChildItemInfoIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
  cmp.VerifySaveNextConfirmationAlertMessage("Please Save Retail Item Before Moving To Child Item");
}

@Then("I Click Save button #Retail Item saved successfully")
public void iClickSaveButtonRetailItemSavedSuccessfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 pmt.Click_SaveButton_RetailItem();
}

@Then("I Click Save button from SAVENEXTConfirmationAlertMsg")
public void iClickSaveButtonFromSAVENEXTConfirmationAlertMsg() {
    // Write code here that turns the phrase above into concrete actions
    cmp.IClick_SaveBtn_SAVENEXTConfirmationAlertMsg();
}


@Then("I Click Link Existing Item button")
public void iClickLinkExistingItemButton() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    pmt.IclickLinkExistingItem_RetailInventory();
}

@Then("I Select Existing Item")
public void iSelectExistingItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Select_ExistingItem_RetailInventory();
}

@Then("Verify Child Item Linked with Retail Item or not #Retail item linked successfully")
public void verifyChildItemLinkedWithRetailItemOrNotRetailItemLinkedSuccessfully() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Menu Item linked Successfully");
}

@Then("Verify the Update Child header")
public void verifyTheUpdateChildHeader() {
    // Write code here that turns the phrase above into concrete actions
    pmt.VerifyUpdateChildHeaderRetail("Update Child");
}
@Then("Verify whether the Retail Item is Updated or not")
public void verifyWhetherTheRetailItemIsUpdatedOrNot() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
pmt.verify_the_RetailItem_Updated_or_not();
}


@Given("I Search and Edit the Retail Item")
public void iSearchAndEditTheRetailItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.SearchAndClickEditRetailItem(ut.getProperty("Product_Retail_Items_Name"));
}

@Given("Close online Help chat box")
public void closeOnlineHelpChatBox() throws Exception {
    // Write code here that turns the phrase above into concrete actions
//    cmp.Close_Online_Help_ChatBox();
}

//@Then("Check the Update button is Disabled")
//public void checkTheUpdateButtonIsDisabled() throws Exception {
//    // Write code here that turns the phrase above into concrete actions
//    cmp.Check_Update_Button_Diabled();
//}

@Given("I Click New Inventory Category")
public void iClickNewInventoryCategory() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.ISelect_NewInventoryCategory_RetailItem();
}
@Given("I Enter the New Inventory Category Name")
public void iEnterTheNewCategoryName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_NewCategory_Name_inSecondaryScreen_RetailItem(ut.getProperty("ProductRetailItem_NewInventoryCategoryName"));
}
@Given("I Enter the Code")
public void iEnterTheCode() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_NewCategory_Code_inSecondaryScreen_RetailItem(ut.getProperty("ProductRetailItem_NewInventoryCategoryCode"));
}

@Given("I Click Save button")
public void iClickSaveButton() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   pmt.Click_SaveButton_RetailItem();
}

@Given("I Click New Inventory Category Save button")
public void iClickNewInventoryCategorySaveButton() {
    // Write code here that turns the phrase above into concrete actions
   pmt.ClickSaveBtn_NewInventoryCategory_RetailItem();
}

@Then("I Verify the New Inventory Category saved or not")
public void iVerifyTheNewCategorySavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Verify_NewInventoryCategory_SavedorNot();
}

@Given("I Select the New Vendor")
public void iSelectTheNewVendor() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Select_InventoryNewVendor_RetailItem();
}
@Given("I Enter the New Vendor Name")
public void iEnterTheName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.Enter_NewVendor_Name_inSecondaryScreen_RetailItem(ut.getProperty("ProductRetailItem_InventoryNewVendorName"));
    
}
@Given("I Enter the New Vendor Phone Number")
public void iEnterThePhoneNumber() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	   pmt.Enter_NewVendor_PhoneNumber_inSecondaryScreen_RetailItem(ut.getProperty("ProductRetailItem_InventoryNewVendorPhonenumber"));
}
@Given("I Enter the New Vendor Email")
public void iEnterTheEmail() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Enter_NewVendor_Email_inSecondaryScreen_RetailItem(ut.getProperty("ProductRetailItem_InventoryNewVendorEmail"));
  
}

@Given("I Click the Inventory new vendor Save button")
public void IClicktheInventorynewvendor_Savebutton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.ClickSaveBtn_InventoryNewVendor_RetailItem();
  
}

@Then("I Verify the New Vendor saved or not")
public void iVerifyTheNewVendorSavedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   pmt.Verify_InventoryNewVendor_SavedorNot();
}

@Then("I Enable EBT Retail Item Toggle")
public void iEnableEBTRetailItemToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Iclick_EBTRetailItem_YesBtn();
}

@Then("I Disable EBT Retail Item Toggle")
public void iDisableEBTRetailItemToggle() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Iclick_EBTRetailItem_NoBtn();
}


@Then("I Verify EBT Retail Item is Enabled")
public void iVerifyEBTRetailItemIsEnabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Enabled(pmt.EBT_Menu_Item_YesBtn, "EBT Retail Item");
}


@Then("I Verify EBT Retail Item is Disabled")
public void iVerifyEBTRetailItemIsDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Disabled(pmt.EBT_Menu_Item_YesBtn, "EBT Retail Item");
}

@Given("I Search and Edit the Retail Item with Child")
public void iSearchAndEditTheRetailItemWithChild() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.SearchAndClickEditRetailItem(ut.getProperty("Product_Retail_Items_Name1"));
}

@Then("I Enter the Retail Item Name for Visibility toggle")
public void iEnterTheRetailItemNameForVisibilityToggle() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 pmt.IEnterRetailName(ut.getProperty("Product_Retail_Items_Name2"));
}

@Then("I Enter the Retail Item Name for Special characters")
public void iEnterTheRetailItemNameForSpecialCharacters() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 pmt.IEnterRetailName(ut.getProperty("Product_Retail_Items_Name3"));
}

@Then("Enter Special Characters in Search field and Verify for Retail Item")
public void enterSpecialCharactersInSearchFieldAndVerifyForRetailItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Verify_Search(ut.getProperty("Product_Retail_Items_Name3"));
}

@Given("I Search and Edit the Retail Item with Visibility toggles disabled")
public void iSearchAndEditTheRetailItemWithVisibilityTogglesDisabled() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.SearchAndClickEditRetailItem(ut.getProperty("Product_Retail_Items_Name2"));
}


@Given("I Select the Child Tab")
public void iSelectTheChildTab() {
    // Write code here that turns the phrase above into concrete actions
   pmt.Click_ChildTab();
}

@Given("I Select Child and Click Unlink button")
public void iSelectChildAndClickUnlinkButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Click_Unlink_Child_RetailItem();
}
@Then("Verify Child Item Unlinked with Retail Item or not")
public void verifyChildItemUnlinkedWithRetailItemOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Menu Item un-linked Successfully");
}



@Then("Verfiy whether Retail Item Updated or Not")
public void verfiyWhetherRetailItemUpdatedOrNot() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    pmt.verify_the_RetailItem_Updated_or_not();
}


@Given("I Select Child and Click Delete button")
public void iSelectChildAndClickDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.Click_Delete_Child_RetailItem();
}

@Then("Verify Child Item Deleted with Retail Item or not")
public void verifyChildItemDeletedWithRetailItemOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Retail item inactivated Successfully");
}

@Given("I Search the Retail Item and Click the Delete button")
public void iSearchTheRetailItemAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//  cmp.SearchAndClickDelete(Utility.getProperty("Product_Retail_Items_Name1"));
	  pmt.SearchAndClickDeleteRetailItem(ut.getProperty("Product_Retail_Items_Name1"));
      Thread.sleep(500);
	//Click the Delete button
	cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
}

@Then("Verify the Cancelled Retail Item Deleted\\/Inactivated or not")
public void verifyTheCancelledRetailItemDeletedInactivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.verifyTheCancelledRetailItemDeletedInactivatedOrNot();
}

@Then("I Verifying the Retail Item Deleted or not")
public void iVerifyingTheRetailItemDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Retail Item Inactivated Successfully");
}

@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Retail Item")
public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedRetailItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    pmt.iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedCRetailItem();
}



@Given("I Click Retail Items Active button")
public void iClickRetailItemsActiveButton() {
    // Write code here that turns the phrase above into concrete actions
	pmt.IClickActiveRetailItem_Btn();
}


@Given("I Search the Retail Item and Click the Click to Activate button")
public void iSearchTheRetailItemAndClickTheActiveButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
pmt.SearchAndClickActiveRetailItemBtn(ut.getProperty("Product_Retail_Items_Name1"));
//	
//	Thread.sleep(1500);
//	//Click the Delete button
//	cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
}

@Given("I Click the Retail Item Update button")
public void IClicktheRetailItemUpdatebutton() {
    // Write code here that turns the phrase above into concrete actions
    pmt.Click_Update_Button_RetailItem();
}

@Then("Verify the Cancelled Retail Item is Activated or not")
public void verifyTheCancelledRetailItemIsActivatedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    pmt.verifyTheCancelledRetailItemIsActivatedOrNot();
}


@Then("I Verifying the Retail Item Activated or not")
public void iVerifyingTheRetailItemActivatedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Retail Item Inactivated Successfully");
}

@Then("I Click the Active button to navigate Activated screen to Verify Activated Retail Item")
public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedRetailItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedRetailItem("Product_Retail_Items_Name1");
}

@Given("I Search Retail Item with Child and Click the Delete button")
public void iSearchRetailItemWithChildAndClickTheDeleteButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Retail Item Inactivated Successfully");
}
@Then("I Verifying Retail Item is Deleted or not")
public void iVerifyingRetailItemIsDeletedOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.VerifySaveConfirmationAlertMessage("Retail Item Inactivated");
}

@Given("I Search the Retail Item and Click the Copy button")
public void iSearchTheRetailItemAndClickTheCopyButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	pmt.SearchAndClickCopyRetailItem(ut.getProperty("Product_Retail_Items_Name"));
}

@Given("I Verfiy Is POS Category\\/SubCategory selected or not")
public void iVerfiyIsPOSCategorySubCategorySelectedOrNot() {
    // Write code here that turns the phrase above into concrete actions
    pmt.verify_POSCategory_Subcategory_SelectedorNot();
}

@Given("I Verify Toggles Enabled as per the copied Retail Item")
public void iVerifyTogglesEnabledAsPerTheCopiedRetailItem() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Check_Toggle_Enabled(pmt.Hide_In_Kiosk_YesBtn, "Hide In Kiosk");
	cmp.Check_Toggle_Enabled(pmt.EBT_Menu_Item_YesBtn, "EBT Menu Item");
	cmp.Check_Toggle_Enabled(pmt.Hide_In_POS_YesBtn, "Hide In POS");
	  cmp.Check_Toggle_Enabled(pmt.Hide_In_Online_Order_YesBtn, "Hide In Online Order");
}

@Then("I Click the Cancel button from SAVENEXTConfirmationAlertMsg")
public void iClickTheCancelButtonFromSAVENEXTConfirmationAlertMsg() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	   cmp.IClickCancelBtn_SAVENEXTConfirmationAlertMsg();
  
}



}
	

