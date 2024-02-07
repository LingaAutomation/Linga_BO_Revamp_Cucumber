package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.SortMenuConfigPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Product_and_Items_Sort_Menu_Config 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	SortMenuConfigPage smc = new SortMenuConfigPage();

	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));

	SoftAssert sa=new SoftAssert();
	
	
	@Given("Open the Sort Menu Config home page BaseURL and StoreID")
	public void Open_SortMenuConfig_Page() throws Exception 
	{
		Thread.sleep(5000);
		//Load the sort menu config page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"sortMenuConfig");
		Thread.sleep(5000);
	}
	
	@Given("Verifying the Sort Menu Config Header Page")
	public void Verifying_SortMenuConfigHeader() throws Exception 
	{
		cmp.VerifyMainScreenPageHeader("Sort Menu Config");
		
		Thread.sleep(500);
		
//		cmp.Close_Online_Help_ChatBox();
	}
	
	@Then("Verify the Categories or Display Groups header in Sort Menu Cofig is displayed")
	public void VerifyingCategoryAndDisplayGroupDisplayedOrNot() 
	{
		smc.Verify_Categories_OrDisplayGroup_Header();
	}
	
	@And("I select the Categories")
	public void Select_Categories() throws Exception
	{
		smc.Select_Random_Category();
	}
	
	@Then("Verify the Sub-Categories header in Sort Menu Cofig is Displayed")
	public void Verify_SubCategoriesHeader_Displayed()
	{
		smc.Verify_SubCategories_Header();
	}
	
	@Then("Verify the Menu Items header in Sort Menu Cofig is Displayed")
	public void Verify_MenuItemHeader_Displayed() 
	{
		smc.Verify_MenuItem_Header();
	}
	
	@Then("Verify the Sort By Option is Selected as A-Z Option as Default in Categories or Not")
	public void VerifyAtoZOptionSelectedAsDefaultInCategory() 
	{
		smc.Select_Default_AtoZ_Sorting_InCategory();
	}
	
	@Then("Verify the Sort By Option is Selected as A-Z Option as Default in Sub-Categories or Not")
	public void VerifyAtoZOptionSelectedAsDefaultInSubCategory() 
	{
		smc.Select_Default_AtoZ_Sorting_InSubCategory();
	}
	
	@Then("Verify the Sort By Option is Selected as A-Z Option as Default in Menu Items or Not")
	public void VerifyAtoZOptionSelectedAsDefaultInMenuItem() 
	{
		smc.Select_Default_AtoZ_Sorting_InMenuItem();
	}
	
	@Given("I Select the Sort By in Categories")
	public void Select_Sort_By_InCategories() throws Exception
	{
		smc.Select_Category_SortByDropdownButton();
	}
	
	@Then("Verify the A-Z, Z-A, Custom Sort are Displayed or Not")
	public void VerifyingSortingOptions() throws Exception 
	{
		smc.Verify_Sorting_Options_AtoZ();
		Thread.sleep(500);
		smc.Verify_Sorting_Options_ZtoA();
		Thread.sleep(500);
		smc.Verify_Sorting_Options_Custom();
	}
	
	@And("I Select the Z-A in Categories")
	public void SelectZtoASortingInCategory() throws Exception 
	{
		smc.Select_ZtoASorting_Category();
	}
	
	@And("^Click on the Save button$")
	public void click_the_Save_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);
		
		Thread.sleep(2000);
		//Click the Save button
		cmp.Click_Save_ButtonTwo();
		
	}
	
	@Then("Verify the Item Sorted Successfully or not")
	public void Verify_ItemSorted_Successfully_OrNot() throws Exception
	{
		Thread.sleep(2000);
		//Check whether the sorting order Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Items sorted successfully"))
		{
			test.log(LogStatus.PASS, "AtoZ item sorting done Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Item sorting Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}

	}
	
	@And("I Select the Custom Sort in Categories")
	public void Select_Custom_Sort_InCategories()
	{
		smc.Click_Custom_SortingButton();
	}
	
	@And("I Drag and Drop the Category")
	public void Drag_And_DropCategory() throws Exception
	{
		smc.Select_CustomSorting_Category();
	}
	
	@Given("I Select the Sort By in Sub-Categories")
	public void Select_SortBy_InSubCategories() throws Exception 
	{
		smc.Select_SubCategory_SortByDropdownButton();
	}
	
	@And("I Select the Z-A in Sub-Categories")
	public void Select_ZtoASortingSubCategories() throws Exception 
	{
		smc.Select_ZtoASorting_SubCategory();
	}
	
	@And("I Select the Custom Sort in Sub-Categories")
	public void Select_CustomSort_SubCategory() throws Exception 
	{
		smc.Click_CustomSort_SubCategory();
	}
	
	@And("I Drag and Drop the Sub-Category")
	public void Drag_Drop_SubCategory() throws Exception 
	{
		smc.CustomSorting_SubCategory();
	}
	
	@Given("I Select the Sort By in Menu Items")
	public void SelectSortByMenuItem() 
	{
		smc.Select_SortByMenuItems();
	}
	
	@And("I Select the Z-A in Menu Items")
	public void SelectZtoA_InMneuItems()
	{
		smc.Select_ZtoASorting_MenuItems();
	}
	
	@And("I Select the Custom Sort in Menu Items")
	public void Select_CustomSort_InMenuitems() throws Exception 
	{
		smc.Click_CustomSort_MenuItems();
	}
	
	@And("I Drag A and Drop B the Menu Items")
	public void DragAndDropMenuItems() throws Exception 
	{
		smc.Select_CustomSorting_MenuItems();
	}
	
	@Given("Reload the Sort Menu Config Page")
	public void Refresh_thePage() 
	{
		driver.navigate().refresh();
	}
	
	@Then("I Check Categories Sort By is Selected as Custom")
	public void Select_Categories_SortBySelected_Ascustom()
	{
		smc.Verify_Customsorting_InCategory();
	}
	
	@Then("I Check Sub-Categories Sort By is Selected as Custom")
	public void Select_SubCategories_SortBySelected_Ascustom()
	{
		smc.Verify_Customsorting_InSubCategory();
	}
	
	@Then("I Check Menu Items Sort By is Selected as Custom")
	public void Select_MenuItem_SortBySelected_Ascustom()
	{
		smc.Verify_Customsorting_InMenuItem();
	}
	
	@And("I Select the A-Z in Categories")
	public void Select_AtoZInCategories() throws Exception 
	{
		smc.Select_AtoZSorting_Category();
	}
	
	@And("I Select the A-Z in Sub-Categories")
	public void Select_AtoZInSubCategories() throws Exception 
	{
		smc.Select_AtoZSorting_SubCategory();
	}
	
	@And("I Select the A-Z in Menu Items")
	public void Select_AtoZInMenuItems() throws Exception 
	{
		smc.Select_AtoZSorting_MenuItems();
	}
	
	@Then("I Check Categories Sort By is Selected as A-Z")
	public void VerifyCategoriesSortBySelectedasAtoZ()
	{
		smc.Select_Default_AtoZ_Sorting_InCategory();
	}
	
	@Then("I Check Sub-Categories Sort By is Selected as A-Z")
	public void VerifySubCategoriesSortBySelectedasAtoZ()
	{
		smc.Select_Default_AtoZ_Sorting_InSubCategory();
	}
	
	@Then("I Check Menu Items Sort By is Selected as A-Z")
	public void VerifyMenuItemSortBySelectedasAtoZ()
	{
		smc.Select_Default_AtoZ_Sorting_InMenuItem();
	}
	
	@Then("Verify the user able to view Sub-Categories")
	public void Verify_ableToViewSubCategories() 
	{
		smc.Verify_SubCategories_Header();
	}
	
	@Then("Verify the user able to view Menu Items")
	public void VerifyAbletoViewMenuItems() 
	{
		smc.Verify_MenuItem_Header();
	}
	
	@And("I Select Sub-Categories")
	public void Select_SubCategories() throws Exception 
	{
		smc.Select_SubCategory();
	}
}
