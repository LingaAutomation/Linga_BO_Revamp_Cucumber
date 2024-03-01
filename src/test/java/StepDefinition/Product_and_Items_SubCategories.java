package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Availability_RestrictionTimePage;
import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.SubCategoriesPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Product_and_Items_SubCategories 
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
	SubCategoriesPage scp=new SubCategoriesPage();
	ReportsPage rp=new ReportsPage();
	
	
	String Actual_Percentage;
	String Expected_Percentage=null;
	String Expected_ChangeAmount, Actual_ChangeAmount, Expected_ChangeAmountBef;
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	SoftAssert sa=new SoftAssert();
	
	Availability_RestrictionTimePage al=new Availability_RestrictionTimePage();
	String SubCat_inMenuPage;
	
	String Cat_Name;
	
	@Given("Open the SubCategory home page BaseURL and StoreID")
	public void openTheSubCategoryHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//Load the Category page


		//		a.Login();

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"subCategories");
	}
	
	@Given("Verifying the SubCategory Header Page")
	public void verifyingTheSubCategoryHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Category page loaded or not
		cmp.VerifyMainScreenPageHeader("SubCategories");
	}

	@Given("Sort the SubCategory column")
	public void sortTheSubCategoryColumn() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ctp.Sorting_CategoryName();
	}

	@Given("Click the New SubCategory button")
	public void clickTheNewSubCategoryButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    scp.Click_NewSubCategory();
	}
	@Then("Verify the New SubCategory Header")
	public void verifyTheNewSubCategoryHeader() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);

		//Verify the New Course creation screen opened or not
		cmp.VerifyCreationScreenPageHeader_Two("New Subcategory");
	}
	
	@Given("I Click the Save button without Entering SubCategory Name")
	public void iClickTheSaveButtonWithoutEnteringSubCategoryName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.NameInputBox().clear();
		
		Thread.sleep(1000);
		scp.Select_Category();
		
		Thread.sleep(1000);
		ctp.Select_Coursing();
		
		Thread.sleep(1000);
		ctp.Select_ServingSizeLevel();
		
		Thread.sleep(1000);
		ctp.Enable_Inherit_DefaultTaxSettings();

		Thread.sleep(2000);

		if(cmp.Save_and_PublishButton().isEnabled())
		{
			//Click the Save button
			cmp.Click_Save_and_PublishButton();

			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the New Tax Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("SubCategory Saved and Published Successfully"))
			{
				test.log(LogStatus.FAIL, "SubCategory Saved without Name");

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

	@Given("I Enter the SubCategory Name Exceeding the limit")
	public void iEnterTheSubCategoryNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}


	@When("I Enter SubCategory Name")
	public void iEnterSubCategoryName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(3000);
		//Enter the Category Name
		cmp.EnterName(Utility.getProperty("Sub_Category_Name"));
	}



	@When("I Enter the Coursing Name in SubCategory")
	public void iEnterTheCoursingNameInSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ctp.Enter_Course_Name_inSecondaryScreen(Utility.getProperty("Sub_Category_Add_Course_Name"));
	}

//	@When("Verify the New Coursing Header in SubCategory Page")
//	public void verifyTheNewCoursingHeaderInSubCategoryPage()
//	{
//		cmp.VerifyCreationScreenPageHeader("New Category");
//	}


	@When("I Enter the Serving Size Name in SubCategory")
	public void iEnterTheServingSizeNameInSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 ctp.Enter_ServingSizeLvl_Name_inSecondaryScreen(Utility.getProperty("Category_Add_ServingSize_Name"));
	}


	
	@When("I Click New TareGroup button In Category")
	public void iClickNewTareGroupButtonInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Click_New_Tare_Group_Button_InDropInputBox();
	}

	@When("I Enter the TareGroup Name in SubCategory")
	public void iEnterTheTareGroupNameInSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 ctp.Enter_TareGroup_Name_inSecondaryScreen(Utility.getProperty("Sub_Category_Add_TareGroup_Name"));

	}

	

	@Then("I Select the Category")
	public void iSelectTheCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    scp.Select_Category();
	    
	    String CatName=scp.CategoryDropBtn.getAttribute("value");
	    this.Cat_Name=CatName;
	}

	@When("I Enter the Tax Name in SubCategory")
	public void iEnterTheTaxNameInSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    ctp.Enter_Tax_Name_inSecondaryScreen(Utility.getProperty("Sub_Category_Add_Tax_Name"));
	}

	@When("I Enter Kitchen Printer Name in SubCategory")
	public void iEnterKitchenPrinterNameInSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  kp.Enter_KitchenPrinterName(Utility.getProperty("Sub_Category_Add_Kitchen_Printer_Name"));
	}
	@When("I Enter the Kitchen Printer IP Address in SubCategory")
	public void iEnterTheKitchenPrinterIPAddressInSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 kp.Enter_IP_Address(Utility.getProperty("Sub_Category_Kitchen_Printer_IP"));
	}
	@Then("Check Added Kitchen Printer in SubCategory is Selected")
	public void checkAddedKitchenPrinterInSubCategoryIsSelected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Button_Enabled(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Sub_Category_Add_Kitchen_Printer_Name")+"')]")), "Kitchen Printer");

	}
	@When("I Enter Label Printer Name in SubCategory")
	public void iEnterLabelPrinterNameInSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		kp.Enter_Label_Printer_Name(Utility.getProperty("Sub_Category_Add_Label_Printer_Name"));
	}
	@When("I Enter the Label Printer IP Address in SubCategory")
	public void iEnterTheLabelPrinterIPAddressInSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 kp.Enter_IP_Address(Utility.getProperty("Sub_Category_Label_Printer_IP"));
	}
	@Then("Check Added Label Printer in SubCategory is Selected")
	public void checkAddedLabelPrinterInSubCategoryIsSelected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Button_Enabled(driver.findElement(By.xpath("//app-chip[@name='labelPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Sub_Category_Add_Label_Printer_Name")+"')]")), "Label Printer");

	}
	
	@When("I Enable Hide Menu Item In Kiosk Toggle")
	public void iEnableHideMenuItemInKioskToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    scp.Enable_Hide_MenuItem_In_Kiosk_Toggle();
	}

	@Then("I Verify Hide Menu Item In Kiosk Toggle is Enabled")
	public void iVerifyHideMenuItemInKioskToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(scp.Hide_MenuItem_In_Kiosk_YesBtn, "Hide Menu Item In Kiosk");
	}

	@Then("I Disable Hide Menu Item In Kiosk Toggle")
	public void iDisableHideMenuItemInKioskToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    scp.Disable_Hide_MenuItem_In_Kiosk_Toggle();
	}


	
	@Then("Verify whether the SubCategory is Saved or not")
	public void verifyWhetherTheSubCategoryIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.VerifySaveConfirmationAlertMessageForPublish("Sub Category Saved");
	}

	@Given("Search and Click Edit SubCategory")
	public void searchAndClickEditSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.SearchAndClickEdit(Utility.getProperty("Sub_Category_Name"));
	}

	@Then("Verfiy whether SubCategory Updated or Not")
	public void verfiyWhetherSubCategoryUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessageForPublish("Sub Category Updated");
	}
	
	@Given("I Search the SubCategory and Click the Delete button")
	public void iSearchTheSubCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.SearchAndClickDelete(Utility.getProperty("Sub_Category_Name"));
		    
		    
		    Thread.sleep(500);
			//Click the Delete button
			cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled SubCategory Deleted\\/Inactivated or not")
	public void verifyTheCancelledSubCategoryDeletedInactivatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("SubCategory Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "SubCategory Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "SubCategory not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the SubCategory Deleted or not")
	public void iVerifyingTheSubCategoryDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("SubCategory Inactivated");
	}
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated SubCategory")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
				cmp.Click_ActivetoInactiveButton();
				
				//Check whether the Inactive screen opened or not
				cmp.VerifyActive_InactiveStatus("Inactive");
				
				Thread.sleep(3000);
				cmp.Verify_Search(Utility.getProperty("Sub_Category_Name"));
	}

	@Given("I Search the SubCategory and Click the Active button")
	public void iSearchTheSubCategoryAndClickTheActiveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Activate the In activated item
				cmp.SearchAndClickActivate(Utility.getProperty("Sub_Category_Name"));
				
				Thread.sleep(1500);
				//Click the Delete button
				cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}
	@Then("Verify the Cancelled SubCategory is Activated or not")
	public void verifyTheCancelledSubCategoryIsActivatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("SubCategory Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "SubCategory Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "SubCategory not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}


	@Then("I Verifying the SubCategory Activated or not")
	public void iVerifyingTheSubCategoryActivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("SubCategory Activated");
	}
	@Then("I Click the Active button to navigate Activated screen to Verify Activated SubCategory")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedSubCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Category activated or not
		cmp.Verify_Search(Utility.getProperty("Sub_Category_Name"));
	}

	@Given("Navigate to Menu Items page and Get the value and navigate to the SubCategories page")
	public void navigateToMenuItemsPageAndGetTheValueAndNavigateToTheSubCategoriesPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"productItems");
		
		
		Thread.sleep(5000);
		//Verify the Categorys page loaded or not
		cmp.VerifyMainScreenPageHeader("Products/Items");
		
		//Get the Any Category name which are mapped with Category
		String SubCat_withMenu=driver.findElement(By.xpath("//tr[1]/td[3]")).getText();
		this.SubCat_inMenuPage=SubCat_withMenu;
		System.out.println("Sub-Category which mapped with Menu Item"+SubCat_withMenu);
		
		Thread.sleep(5000);
		//Load the Categories page
//		a.Navigate_To_Page(Utility.getProperty("store_Id1"), "Categorys");
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"subCategories");
	
		
		Thread.sleep(5000);
	}
	@Then("I Search the SubCategory mapped with Menu Item and Click the Delete button")
	public void iSearchTheSubCategoryMappedWithMenuItemAndClickTheDeleteButton() throws Exception {
		cmp.SearchAndClickDelete(SubCat_inMenuPage);
	}
	@Then("I Verifying the SubCategory Mapped Menu Item is Deleted or not")
	public void iVerifyingTheSubCategoryMappedMenuItemIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This Sub-Category is attached in sub-categories. Could not inactivate."))
		{
			test.log(LogStatus.PASS, "This SubCategory is attached in Menu Item. Could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("SubCategory Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "SubCategory Mapped Menu Item Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This SubCategory is attached with Menu Item, Could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Verify whether the Duplicate SubCategory is Saved or Not")
	public void verifyWhetherTheDuplicateSubCategoryIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
//		Thread.sleep(5000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "SubCategory Name already exist pop up displayed");
		
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
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("SubCategory Saved and Store data published successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate SubCategory Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "SubCategory Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try
		{
			Thread.sleep(2000);
			cmp.Click_BackspaceButton();
			
			System.out.println("Cancel button not Clicked while creating Duplicate SubCategory");
		}
		catch(Exception k)
		{}
	}
	
	@When("I Enter the New SubCategory Name with Space")
	public void iEnterTheNewSubCategoryNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName(Utility.getProperty("Sub_Category_Name")+Keys.SPACE);

	}
	@Then("Verify whether the SubCategory Name with Space in end is Updated or not")
	public void verifyWhetherTheSubCategoryNameWithSpaceInEndIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("SubCategory Updated and Store data published successfully"))
		{
			test.log(LogStatus.PASS, "SubCategory Updated with Space in the End of SubCategory Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "SubCategory Name already exist pop up displayed when Entering Space in the End of SubCategory Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_BackspaceButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of SubCategory Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_BackspaceButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "SubCategory not Saved with Space in the End of SubCategory Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


//@Given("I Enable Service Type Restriction")
//public void iEnableServiceTypeRestriction() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//@Given("I Select the Kitchen Printer Allow Service Types")
//public void iSelectTheKitchenPrinterAllowServiceTypes() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@Given("Navigate the Kitchen Printers Page and I Search the Added Kitchen Printer from SubCategory in Kitchen Printers Settings Page")
public void navigateTheKitchenPrintersPageAndISearchTheAddedKitchenPrinterFromSubCategoryInKitchenPrintersSettingsPage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Load the Kitchen Printer page

	lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"kitchenPrinters");
	
	Thread.sleep(5000);
	cmp.VerifyMainScreenPageHeader("Kitchen Printers");
}
@Then("Veifying the Saved Kitchen Printer In SubCategory Page")
public void veifyingTheSavedKitchenPrinterInSubCategoryPage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Verify_Search(Utility.getProperty("Sub_Category_Add_Kitchen_Printer_Name"));
}

@Given("Navigate the Label Printers Page and I Search the Added Label Printer from SubCategory in Label Printers Settings Page")
public void navigateTheLabelPrintersPageAndISearchTheAddedLabelPrinterFromSubCategoryInLabelPrintersSettingsPage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	//Load the Label Printer page

	lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"labelPrinters");
	
	Thread.sleep(5000);
	cmp.VerifyMainScreenPageHeader("Label Printers");
}
@Then("Veifying the Saved Label Printer In SubCategory Page")
public void veifyingTheSavedLabelPrinterInSubCategoryPage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Verify_Search(Utility.getProperty("Category_Add_Label_Printer_Name"));
	
	
	Thread.sleep(5000);
	//Load the Categories page
//	a.Navigate_To_Page(Utility.getProperty("store_Id1"), "Categorys");
	lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"subCategories");
}

//@Given("I Click Category in SubCategory Page")
//public void iClickCategoryInSubCategoryPage() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
@Given("I Search the Selected Category in SubCategory Home Page")
public void iSearchTheSelectedCategoryInSubCategoryHomePage() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Click_DropDown_withSearchText(scp.CategoryDropBtn, SubCat_inMenuPage, "Selected Category is Searched in SubCategory Home Page");
}
@Given("I Click the Apply button")
public void iClickTheApplyButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    rp.Click_ApplyButton();
}
@Then("Check the Selected Category listing out the Created Sub-Category is Displayed")
public void checkTheSelectedCategoryListingOutTheCreatedSubCategoryIsDisplayed() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//td[contains(.,'"+Utility.getProperty("Sub_Category_Name")+"')]")), "Created SubCategory is Displayed when Filtered Selected Category");
}


}
