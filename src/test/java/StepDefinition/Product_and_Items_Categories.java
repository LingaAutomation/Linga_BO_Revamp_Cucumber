package StepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.Availability_RestrictionTimePage;
import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.GratuitiesPage;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.ServingSizeLevelsPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
//import com.epam.healenium.SelfHealingDriver;
//import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentManager;
import Utility.Utility;
import bsh.util.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Product_and_Items_Categories
{
	// public WebDriver driver;

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
	
	
	public static String Actual_Percentage;
	public static String Expected_Percentage=null;
	public static String Expected_ChangeAmount, Actual_ChangeAmount, Expected_ChangeAmountBef;
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	SoftAssert sa=new SoftAssert();
	
	Availability_RestrictionTimePage al=new Availability_RestrictionTimePage();
	public static String Cat_inMenuPage;

	@Given("Open the Category home page BaseURL and StoreID")
	public void openTheCategoryHomePageBaseURLAndStoreID() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		//Load the Category page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"categories");
	}

	@Given("Verifying the Category Header Page")
	public void verifyingTheCategoryHeaderPage() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Verify the Category page loaded or not
		cmp.VerifyMainScreenPageHeader("Categories");	
	}

	@Given("Sort the Category column")
	public void SortCategoryColumn() throws Exception 
	{
		ctp.Sorting_CategoryName();
	}

	@Given("Verifying the Homepath")
	public void Verifying_home_path() 
	{
		String home = ctp.Home().getText();
		String products_Items = ctp.Products_Items().getText();
		String Path1 = ctp.path1().getText();

		String total = home+products_Items+Path1;
		System.out.println(total);

		if(total.equalsIgnoreCase("Home /Products/Items /Categories")) {

			test.log(LogStatus.PASS, "Categories Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Categories Path is not displayed");
		}

	}
	
	@Given("Click the New Category button")
	public void clickTheNewCategoryButton() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Click the New Coursing
		//Click the New Categories
		ctp.Click_NewCategory();
//		Thread.sleep(4000);
	}

	@Then("Verify the New Category Header")
	public void verifyTheNewCategoryHeader() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);

		//Verify the New Course creation screen opened or not
		cmp.VerifyCreationScreenPageHeader_Two("New Category");
	}
	
	@When("Verify the New Taxes Header in Category Page")
	public void verifyTheNewTaxesHeaderInCategoryPage()
	{
		cmp.VerifyCreationScreenPageHeader("New Tax");
	}
	
	@Then("Upload an Image")
	public void Uploading_an_Image() throws Exception 
	{
		
		Thread.sleep(4000);
		//Upload picture
		cmp.Upload_Picture(Utility.getProperty("Settings_Store_Information_Store_Image_Path"));
	}
	
	
	@Given("I Click the Save button without Entering Category Name")
	public void iClickTheSaveButtonWithoutEnteringCategoryName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.NameInputBox().clear();
		
		Thread.sleep(1000);
		ctp.Select_Department();
		
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
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Category Saved and Published Successfully"))
			{
				test.log(LogStatus.FAIL, "Category Saved without Name");

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

	@Given("I Enter the Category Name Exceeding the limit")
	public void iEnterTheCategoryNameExceedingTheLimit() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}

	@When("I Enter Category Name")
	public void iEnterCategoryName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//Enter the Category Name
		cmp.EnterName(Utility.getProperty("Category_Name"));
		
	}
	@Then("Check the Save and Publish button is Disabled")
	public void checkTheSaveAndPublishButtonIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
	    if(cmp.Save_and_PublishButton().isEnabled())
	    {
	    	test.log(LogStatus.FAIL, "Save and Publish button is Enabled");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    }
	    else
	    {
	    	test.log(LogStatus.PASS, "Save and Publish button is Disabled");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(false, cmp.Save_and_PublishButton().isEnabled());
	    }
	}

	
	@When("I Click New Department button in Category")
	public void iClickNewCategoryButtonInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Click_New_Departmnet_Button_InDropInputBox();
	}
	@When("I Enter the Department Name in Category")
	public void iEnterTheCategoryNameInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enter_Dept_Name_inSecondaryScreen(Utility.getProperty("Category_Add_Dept_Name"));
	}
	@When("I Enter the Department Code in Category")
	public void iEnterTheCategoryCodeInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    dp.Enter_DepartmentCode(Utility.getProperty("Category_Add_Dept_Code"));
	}

	@Then("I Select the Coursing")
	public void iSelectTheCoursing() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	    ctp.Select_Coursing();
	}
	
	@Then("I Select Serving Size level")
	public void iSelectServingSizeLevel() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Select_ServingSizeLevel();
	}
	
	@Then("Check the Save and Publish button is Enabled")
	public void checkTheSaveAndPublishButtonIsEnabled() {
	    // Write code here that turns the phrase above into concrete actions
		  if(cmp.Save_and_PublishButton().isEnabled())
		    {
		    	test.log(LogStatus.PASS, "Save and Publish button is Enabled");
		    	
		    	ut.PassedCaptureScreenshotAsBASE64();
		    	
		    	Assert.assertEquals(true, cmp.Save_and_PublishButton().isEnabled());
		    }
		    else
		    {
		    	test.log(LogStatus.FAIL, "Save and Publish button is Disabled");
		    	
		    	ut.FailedCaptureScreenshotAsBASE64();
		    	
		    	Assert.assertEquals(false, cmp.Save_and_PublishButton().isEnabled());
		    }
	}


	@When("I Select the Department")
	public void iSelectTheCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Select_Department();
	}
	
	@When("I Click New Coursing button in Category")
	public void iClickNewCoursingButtonInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Click_New_Coursing_Button_InDropInputBox();
	}
	
	@When("I Enter the Coursing Name in Category")
	public void iEnterTheCoursingNameInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enter_Course_Name_inSecondaryScreen(Utility.getProperty("Category_Add_Course_Name"));
	}


	@When("I Click New Serving Size Level button In Category")
	public void iClickNewServingSizeLevelButtonInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Click_New_Serving_SizeLevel_Button_InDropInputBox();
	}
	@When("I Enter the Serving Size Level Name in Category")
	public void iEnterTheServingSizeLevelNameInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enter_ServingSizeLvl_Name_inSecondaryScreen(Utility.getProperty("Category_Add_ServingSize_Name"));
	}
	


	@Then("I Disable the Inherit Default Tax Toggle")
	public void iDisableTheInheritDefaultTaxToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Disable_Inherit_DefaultTaxSettings();
	}


	@When("I Click New Tax button in Category")
	public void iClickNewTaxButtonInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Click_New_Tax_Btn_SecondaryScreen();
	    Thread.sleep(2000);
	}
	@When("I Enter the Tax Name in Category")
	public void iEnterTheTaxNameInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    ctp.Enter_Tax_Name_inSecondaryScreen(Utility.getProperty("Category_Add_Tax_Name"));
	}

	@Then("Verify whether the Tax is Saved or not")
	public void verifyWhetherTheTaxIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(2000);
	    cmp.VerifySaveConfirmationAlertMessage("Tax Saved");
	}
	
	@When("I Enable the Inherit Default Tax Toggle")
	public void iEnableTheInheritDefaultTaxToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enable_Inherit_DefaultTaxSettings();
	}
	@When("I Select the Item Service Charge")
	public void iSelectTheItemServiceCharge() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Select_ItemServiceCharge();
	}
	@When("I Select the Roles")
	public void iSelectTheRoles() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Select_Roles();
	}
	
	@When("I Select the Tare Group")
	public void iSelectTheTareGroup() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Select_TareGroup();
	}
	@Given("I Enter the TareGroup Name in Category")
	public void iEnterTheTareGroupNameInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enter_TareGroup_Name_inSecondaryScreen(Utility.getProperty("Category_Add_TareGroup_Name"));
	}

	@When("I Select the Taxes")
	public void iSelectTheTaxes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
	    ctp.Select_Taxes();
	}
	
	@When("I Select the Availability as Always")
	public void iSelectTheAvailabilityAsAlways() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_AlwaysButton();
	}
	@When("I Enable Hide in POS Toggle")
	public void iEnableHideInPOSToggle()  throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enable_Hide_In_POS_Toggle();
	}
	@When("I Enable Hide In Online Order Toggle")
	public void iEnableHideInOnlineOrderToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enable_Hide_In_OnlineOrder_Toggle();
	}
	@When("I Enable Hide in Kiosk Toggle")
	public void iEnableHideInKioskToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enable_Hide_In_Kiosk_Toggle();
	}
	
	@Then("I Enable Exclude Gratuity Toggle")
	public void iEnableExcludeGratuityToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enable_Exclude_Gratuity_Toggle();
	}

	@When("I Verify Exclude Gratuity Toggle is Enabled")
	public void iVerifyExcludeGratuityToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Toggle_Enabled(ctp.Exclude_Gratuity_YesBtn,"Exclude Gratuity");
	}
	
	@Then("I Disable Exclude Gratuity Toggle")
	public void iDisableExcludeGratuityToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Disable_Exclude_Gratuity_Toggle();
	}

	@Given("I Verify Exclude Gratuity Toggle is Disabled")
	public void iVerifyExcludeGratuityToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Toggle_Disabled(ctp.Exclude_Gratuity_YesBtn,"Exclude Gratuity");

	}

	@Given("I Verify Hide In Online Order Toggle is Disabled")
	public void iVerifyHideInOnlineOrderToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Check_Toggle_Disabled(ctp.Hide_In_OnlineOrder_YesBtn,"Hide In Online Order");
	}

	
	@When("Click on New Kitchen Printer button")
	public void clickOnNewKitchenPrinterButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		try
		{
		cmp.Kitchen_Printers_Tab_inContents.click();
		}
		catch(Exception ll) {}
	    ctp.Click_New_Kitchen_PrinterButton_SecondaryScreen();
	}
	@When("Verify the New Kitchen Printer Header")
	public void verifyTheNewKitchenPrinterHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("New Kitchen Printer");
	}
	@When("I Select Printer Model")
	public void iSelectPrinterModel() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    kp.Select_Printer_Model();
	}

	
	@When("I Enter Kitchen Printer Name in Category")
	public void iEnterKitchenPrinterNameInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		
	    kp.Enter_KitchenPrinterName(Utility.getProperty("Category_Add_Kitchen_Printer_Name"));
	    
	    
	  
	}
	@When("I Enter the Kitchen Printer IP Address in Category")
	public void iEnterTheKitchenPrinterIPAddressInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kp.Enter_IP_Address(Utility.getProperty("Category_Kitchen_Printer_IP"));
	}
	
	@When("I Enable Service Type Restriction and Select Allow Service Types")
	public void iEnableServiceTypeRestrictionAndSelectAllowServiceTypes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kp.Enable_EnableServiceTypeRestriction();
	}

	
//	@When("I Enable Service Type Restriction and Select Allow Service Types")
//	public void iEnableServiceTypeRestriction() throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    kp.Enable_EnableServiceTypeRestriction();
//	}
//	@When("I Select the Kitchen Printer Allow Service Types")/
//	public void iSelectTheKitchenPrinterAllowServiceTypes() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("Verify whether Kitchen Printer Saved or Not")
	public void verifyWhetherKitchenPrinterSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Kitchen Printer Saved");
	}
	
//	@Then("Check Added Kitchen Printer is Selected")
//	public void checkAddedKitchenPrinterIsSelected() throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Check_Toggle_Button_Enabled(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Category_Add_Kitchen_Printer_Name")+"')]")), "Kitchen Printer");
//	}
	
	@Then("Check Added Kitchen Printer in Category is Selected")
	public void checkAddedKitchenPrinterInCategoryIsSelected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Button_Enabled(driver.findElement(By.xpath("//app-chip[@name='kitchenPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Category_Add_Kitchen_Printer_Name")+"')]")), "Kitchen Printer");

	}
	
	@Then("Click on New Label Printer button")
	public void clickOnNewLabelPrinterButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		cmp.Label_Printers_Tab_inContents.click();
		}
		catch(Exception ll) {}
		
	    ctp.Click_New_Label_PrinterButton_SecondaryScreen();
	}
	@When("Verify the New Label Printer Header")
	public void verifyTheNewLabelPrinterHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("New Label Printer");
	}
	
	@When("I Enter Label Printer Name in Category")
	public void iEnterLabelPrinterNameInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kp.Enter_Label_Printer_Name(Utility.getProperty("Category_Add_Label_Printer_Name"));
	}

	
	@When("I Enter the Label Printer IP Address in Category")
	public void iEnterTheLabelPrinterIPAddressInCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kp.Enter_IP_Address(Utility.getProperty("Category_Label_Printer_IP"));
	}
	@When("Verify whether Label Printer Saved or Not")
	public void verifyWhetherLabelPrinterSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Label Printer Saved");
	}
	
	@Then("Check Added Label Printer in Category is Selected")
	public void checkAddedLabelPrinterInCategoryIsSelected() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Button_Enabled(driver.findElement(By.xpath("//app-chip[@name='labelPrinter']//mat-chip[contains(.,'"+Utility.getProperty("Category_Add_Label_Printer_Name")+"')]")), "Label Printer");

	}
	@Then("I Select the Restrict Printers")
	public void iSelectTheRestrictPrinters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Select_RestrictPrinter();
	}
	
	@Then("Verify whether the Category is Saved or not")
	public void verifyWhetherTheCategoryIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Category Saved");
	}
	
	@Given("Search and Click Edit Category")
	public void searchAndClickEditCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.SearchAndClickEdit(Utility.getProperty("Category_Name"));
	}
	
	@Then("Check the Update and Publish button is Disabled")
	public void checkTheUpdateAndPublishButtonIsDisabled() {
	    // Write code here that turns the phrase above into concrete actions
	    
		if(cmp.Update_and_PublishButton().isEnabled())
	    {
	    	test.log(LogStatus.FAIL, "Update and Publish button is Enabled");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    }
	    else
	    {
	    	test.log(LogStatus.PASS, "Update and Publish button is Disabled");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(false, cmp.Update_and_PublishButton().isEnabled());
	    }
	}

	
	
	
	
	@Then("I Verify the Selected Availability as Always")
	public void iVerifyTheSelectedAvailabilityAsAlways() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
	    cmp.Check_Button_Enabled(al.Always_AvailabiltyBtn, "Always Availability");
	}
	
	@Then("I Verify Hide in POS Toggle is Enabled")
	public void iVerifyHideInPOSToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(ctp.Hide_In_POS_YesBtn, "Hide In Pos Toggle");
	}
	@Then("I Verify Hide In Online Order Toggle is Enabled")
	public void iVerifyHideInOnlineOrderToggleIsEnabled() throws Exception {
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(ctp.Hide_In_OnlineOrder_YesBtn, "Hide In Online Order Toggle");
	}
	@Then("I Verify Hide in Kiosk Toggle is Enabled")
	public void iVerifyHideInKioskToggleIsEnabled() throws Exception {
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(ctp.Hide_In_Kiosk_YesBtn, "Hide In Kiosk Toggle");
	}
	@Then("I Select the Availability as Days of Week")
	public void iSelectTheAvailabilityAsDaysOfWeek() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
	    al.Select_Days_Of_WeekButton();
	}
	
	@Then("I Selecting the Days")
	public void iSelectingTheDays() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_DaysOfWeek();
	}
	@Then("Check the Update and Publish button is Enabled")
	public void checkTheUpdateAndPublishButtonIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.Update_and_PublishButton().isEnabled())
	    {
	    	test.log(LogStatus.PASS, "Update and Publish button is Enabled");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(true, cmp.Update_and_PublishButton().isEnabled());
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, "Update and Publish button is Disabled");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(false, cmp.Update_and_PublishButton().isEnabled());
	    	
	    }
	}
	@Then("I Enable the Restriction Time Toggle")
	public void iEnableTheRestrictionTimeToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Enable_Restriction_Time_Toggle();
	}
	@Then("I Select the Start Time in Restriction Time")
	public void iSelectTheStartTimeInRestrictionTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Start_Restriction_Time("12", "30", al.AM_Btn);
	}
	@Then("I Select the End Time in Restriction Time")
	public void iSelectTheEndTimeInRestrictionTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_End_Restriction_Time("05", "30", al.PM_Btn);
	}
	
	@Then("I Enable the Available Time Toggle")
	public void iEnableTheAvailableTimeToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Enable_Available_Time_Toggle();
	}
	
	@Then("I Click the Add New Time button")
	public void iClickTheAddNewTimeButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Click_Add_New_Time();
	}
	
	@Then("I Select the Start Time in Available Time Same as Restriction Time")
	public void iSelectTheStartTimeInAvailableTimeSameAsRestrictionTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		al.Select_Start_Available_Time("12", "30", al.AM_Btn);
	}
	@Then("Verify the There is overlap in restriction & available time Error Mesasage")
	public void verifyTheThereIsOverlapInRestrictionAvailableTimeErrorMesasage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(al.Overlap_Time_ErrorMsg, "There is overlap in restriction & available time");
	}
	
	@Then("I Select the Start Time in Available Time")
	public void iSelectTheStartTimeInAvailableTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		al.Select_Start_Available_Time("06", "30", al.PM_Btn);
	}
	
	@Then("Verify the Start time should be less than end time Error Mesasage")
	public void verifyTheStartTimeShouldBeLessThanEndTimeErrorMesasage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(al.Start_Time_Less_than_End_ErrorMsg, "Start time should be less than end time");
	}
	
	@Then("I Select the End Time in Available Time Below the Same as Restriction Time")
	public void iSelectTheEndTimeInAvailableTimeBelowTheSameAsRestrictionTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		al.Select_End_Available_Time("04", "30", al.PM_Btn);
	}
	
	@Then("I Select the End Time in Available Time Same as Restriction Time")
	public void iSelectTheEndTimeInAvailableTimeSameAsRestrictionTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		al.Select_End_Available_Time("05", "30", al.PM_Btn);
	}
	@Then("I Select the End Time in Available Time")
	public void iSelectTheEndTimeInAvailableTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		al.Select_End_Available_Time("11", "00", al.PM_Btn);
	}
	@Then("I Enable Conversational Toggle")
	public void iEnableConversationalToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enable_Conversational_Toggle();
	}
	@Then("I Enable Enable Age Restriction Toggle")
	public void iEnableEnableAgeRestrictionToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enable_Age_Restriction_Toggle();
	}
	
	@Then("I Enable Exclude Check Tax Toggle")
	public void iEnableExcludeCheckTaxToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Enable_Exclude_Check_Tax_Toggle();
	}
	@Then("I Enable Exclude Category Toggle")
	public void iEnableExcludeCategoryToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("I Select the Kitchen Printers")
	public void iSelectTheKitchenPrinters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Select_KitchenPrinter();
	}
	@Then("I Select the Label Printers")
	public void iSelectTheLabelPrinters() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Select_LabelPrinter();
	}
	@Then("Verfiy whether Category Updated or Not")
	public void verfiyWhetherCategoryUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessageForPublish("Category Updated");
	}

	
	@Then("I Verify the Selected Availability as Days of Week")
	public void iVerifyTheSelectedAvailabilityAsDaysOfWeek() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
	    cmp.Check_Button_Enabled(al.DaysOfWeek_Availabilty(), "Days of Week Availablility");
	}
	@When("I Verify Conversational Toggle is Enabled")
	public void iVerifyConversationalToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    cmp.Check_Toggle_Enabled(ctp.Conversational_YesBtn, "Conversational Toggle");
	}
	
	@When("I Verify Enable Age Restriction Toggle is Enabled")
	public void iVerifyEnableAgeRestrictionToggleIsEnabled() throws Exception {
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(ctp.Enable_Age_Restriction_YesBtn, "Enable Age Restriction Toggle");
	}
	@When("I Verify Exclude Check Tax Toggle is Enabled")
	public void iVerifyExcludeCheckTaxToggleIsEnabled() throws Exception {
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(ctp.Exclude_Check_Tax_YesBtn, "Exclude Check Tax Toggle");
	}
	@When("I Verify Exclude Category Toggle is Enabled")
	public void iVerifyExcludeCategoryToggleIsEnabled() throws Exception {
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
//	    cmp.Check_Toggle_or_Button_Enabled(ctp.Conversational_YesBtn, "Conversational Toggle");
	}
	@When("I Select the Availability as Days of Month")
	public void iSelectTheAvailabilityAsDaysOfMonth() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Days_Of_MonthButton();
	}

	@Then("I Selecting the Days Of Months")
	public void iSelectingTheDaysOfMonths() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Days_of_Month_Days();
	}
	
	@Then("I Enable Avaiable Months Toggle")
	public void iEnableAvaiableMonthsToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Enable_Available_Months_Toggle();
	}
	@Then("I Selecting the Available Months")
	public void iSelectingTheAvailableMonths() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Available_Months();
	}
	@Then("I Enable the Restriction Months Toggle")
	public void iEnableTheRestrictionMonthsToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Enable_Restriction_Months_Toggle();
	}
	@Then("I Selecting the Restriction Months")
	public void iSelectingTheRestrictionMonths() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Restriction_Months();
	}

	@Then("I Disable Hide in POS Toggle")
	public void iDisableHideInPOSToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Disable_Hide_In_POS_Toggle();
	}
	@Then("I Disable Hide In Online Order Toggle")
	public void iDisableHideInOnlineOrderToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Disable_Hide_In_OnlineOrder_Toggle();
	}
	@Then("I Disable Hide in Kiosk Toggle")
	public void iDisableHideInKioskToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Disable_Hide_In_Kiosk_Toggle();
	}
	@Then("I Disable Conversational Toggle")
	public void iDisableConversationalToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Disable_Conversational_Toggle();
	}
	@Then("I Disable Enable Age Restriction Toggle")
	public void iDisableEnableAgeRestrictionToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Disable_Age_Restriction_Toggle();
	}
	@Then("I Disable Exclude Check Tax Toggle")
	public void iDisableExcludeCheckTaxToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    ctp.Disable_Exclude_Check_Tax_Toggle();
	}
	@Then("I Disable Exclude Category Toggle")
	public void iDisableExcludeCategoryToggle() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}


	@Given("I Verify Conversational Toggle is Disabled")
	public void iVerifyConversationalToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    cmp.Check_Toggle_Disabled(ctp.Conversational_YesBtn, "Conversational Toggle");
	}
	@Given("I Verify Enable Age Restriction Toggle is Disabled")
	public void iVerifyEnableAgeRestrictionToggleIsDisabled() throws Exception {
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(ctp.Enable_Age_Restriction_YesBtn, "Enable Age Restriction Toggle");
	}
	@Given("I Verify Exclude Check Tax Toggle is Disabled")
	public void iVerifyExcludeCheckTaxToggleIsDisabled() throws Exception {
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(ctp.Exclude_Check_Tax_YesBtn, "Exclude Check Tax Toggle");
	}
	@Given("I Verify Exclude Category Toggle is Disabled")
	public void iVerifyExcludeCategoryToggleIsDisabled() throws Exception {
		Thread.sleep(1000);
		cmp.Visibility_Tab_inContents.click();
		
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("I Verify the Selected Availability as Days of Month")
	public void iVerifyTheSelectedAvailabilityAsDaysOfMonth() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
	    cmp.Check_Button_Enabled(al.DaysOfMonth_AvailabiltyBtn, "Days of Month Availability");
	}
	
	@When("I Select the Availability as Date Range")
	public void iSelectTheAvailabilityAsDateRange() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Date_RangeButton();
	}
	
	@Then("I Select the Start Date")
	public void iSelectTheStartDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Start_Date_DateRange();
	}
	@Then("I Select the End Date")
	public void iSelectTheEndDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_End_Date_DateRange();
	}
	
	@Then("I Enable the Available Days Toggle")
	public void iEnableTheAvailableDaysToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Enable_Available_Days_Toggle();
	}
	
	@Then("I Selecting the Available Days")
	public void iSelectingTheAvailableDays() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Available_Days();
	}
	@Then("I Enable Restriction Days Toggle")
	public void iEnableRestrictionDaysToggle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Enable_Restriction_Days_Toggle();
	}
	@Then("I Selecting the Restriction Days")
	public void iSelectingTheRestrictionDays() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Restriction_Days();
	}

	@Then("I Verify the Selected Availability as Date Range")
	public void iVerifyTheSelectedAvailabilityAsDateRange() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
	    cmp.Check_Button_Enabled(al.DateRange_AvailabiltyBtn, "Date Range Availability");
	}
	
	@When("I Select the Availability as Specific Date")
	public void iSelectTheAvailabilityAsSpecificDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Specific_DateButton();
	}
	
	@Then("I Select the Specific Date")
	public void iSelectTheSpecificDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Specific_Date();
	}

	@Then("I Verify the Selected Availability as Date Range with Time")
	public void iVerifyTheSelectedAvailabilityAsDateRangeWithTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
		 cmp.Check_Button_Enabled(al.DateRangeWithTime_AvailabiltyBtn, "Date Range with Time Availability");
	}


	
	@Then("I Verify the Selected Availability as Specific Date")
	public void iVerifyTheSelectedAvailabilityAsSpecificDate() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		cmp.Availability_Tab_inContents.click();
		Thread.sleep(1000);
	    cmp.Check_Button_Enabled(al.SpecificDate_AvailabiltyBtn, "Specific Date Availability");
	}
	@When("I Select the Availability as Date Range with Time")
	public void iSelectTheAvailabilityAsDateRangeWithTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Date_Range_With_TimeButton();
	}
	
	@Then("I Select the Start Time in Date Range Available Time")
	public void iSelectTheStartTimeInDateRangeAvailableTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_Start_Time_Available_Time_DateRange();
	}
	@Then("I Select the End Time in Date Range Available Time")
	public void iSelectTheEndTimeInDateRangeAvailableTime() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    al.Select_End_Time_Available_Time_DateRange();
	}
	
	@Then("Enter Special Characters in Search field and Verify")
	public void enterSpecialCharactersInSearchFieldAndVerify() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Search("&&&&");
	}

	@Given("I Search the Category and Click the Delete button")
	public void iSearchTheCategoryAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  cmp.SearchAndClickDelete(Utility.getProperty("Category_Name"));
		    
		    
		    Thread.sleep(500);
			//Click the Delete button
			cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	
	
	
	
	@Then("Verify the Cancelled Catgeory Deleted\\/Inactivated or not")
	public void verifyTheCancelledCatgeoryDeletedInactivatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Category Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Category Deleted when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
			
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Category not Deleted when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}


	@Then("I Verifying the Category Deleted or not")
	public void iVerifyingTheCategoryDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("Category Inactivated");
	}
	@Then("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Category")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Category_Name"));
	}
	

	@Given("I Search the Category and Click the Active button")
	public void iSearchTheCategoryAndClickTheActiveButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("Category_Name"));
		
		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}

	@Then("Verify the Cancelled Category is Activated or not")
	public void verifyTheCancelledCategoryIsActivatedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Category Activated Successfully"))
		{
			test.log(LogStatus.FAIL, "Category Activated when clicking Cancel button");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Category not Activated when Clicking Cancel button");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}


	@Then("I Verifying the Category Activated or not")
	public void iVerifyingTheCategoryActivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.VerifySaveConfirmationAlertMessage("Category Activated");
	}
	
	@Then("I Click the Active button to navigate Activated screen to Verify Activated Category")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedCategory() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Category activated or not
		cmp.Verify_Search(Utility.getProperty("Category_Name"));
	}

	@Given("Navigate to Menu Items page and Get the value and navigate to the Categories page")
	public void navigateToMenuItemsPageAndGetTheValueAndNavigateToTheCategoriesPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Load the Menu Item page

				lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"productItems");
				
				
				Thread.sleep(5000);
				//Verify the Categorys page loaded or not
				cmp.VerifyMainScreenPageHeader("Products/Items");
				
				//Get the Any Category name which are mapped with Category
				String Cat_withMenu=driver.findElement(By.xpath("//tr[1]/td[3]")).getText();
				this.Cat_inMenuPage=Cat_withMenu;
				System.out.println("Category which mapped with Menu Item"+Cat_withMenu);
				
				Thread.sleep(5000);
				//Load the Categories page
//				a.Navigate_To_Page(Utility.getProperty("store_Id1"), "Categorys");
				lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"categories");
			
				
				Thread.sleep(5000);
	}

	@Then("I Search the Category mapped with Menu Item and Click the Delete button")
	public void iSearchTheCategoryMappedWithMenuItemAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.SearchAndClickDelete(Cat_inMenuPage);
	}
	@Then("I Verifying the Category Mapped Menu Item is Deleted or not")
	public void iVerifyingTheCategoryMappedMenuItemIsDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		//Check whether the New Modifier Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This category is attached in sub-categories. Could not inactivate."))
		{
			test.log(LogStatus.PASS, "This category is attached in Menu Item. Could not inactivate is Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Category Inactivated Successfully"))
		{
			test.log(LogStatus.FAIL, "Category Mapped Menu Item Inactivated");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "This Category is attached with Menu Item, Could not inactivate is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}

	@Then("Verify whether the Duplicate Category is Saved or not")
	public void verifyWhetherTheDuplicateCategoryIsSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
		Thread.sleep(2000);
//		Thread.sleep(5000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Category Name already exist pop up displayed");
		
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
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Category Saved and Published Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Category Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Category Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try
		{
			Thread.sleep(2000);
			cmp.Click_BackspaceButton();
			
			System.out.println("Cancel button not Clicked while creating Duplicate Category");
		}
		catch(Exception k)
		{}
	}


	@When("I Enter the New Category Name with Space")
	public void iEnterTheNewCategoryNameWithSpace() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.EnterName(Utility.getProperty("Category_Name")+Keys.SPACE);
	}
	
	@Then("Verify whether the Category Name with Space in end is Updated or not")
	public void verifyWhetherTheCategoryNameWithSpaceInEndIsUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Category Updated Successfully and Store data published successfully"))
		{
			test.log(LogStatus.PASS, "Category Updated with Space in the End of Category Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Category Name already exist pop up displayed when Entering Space in the End of Category Name");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_BackspaceButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Category Name");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_BackspaceButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Category not Saved with Space in the End of Category Name");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("I Enter Diff Kitchen Printer Name")
	public void iEnterDiffKitchenPrinterName() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    kp.Enter_KitchenPrinterName(Utility.getProperty("Category_Add_Kitchen_Printer_Name")+"A");
	}
	@Then("Verify whether Kitchen Printer with Duplicate Ip Saved or Not")
	public void verifyWhetherKitchenPrinterWithDuplicateIpSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		wait.until(ExpectedConditions.visibilityOf(cmp.ConfirmationAlertMsg()));
		Thread.sleep(2000);
		//Check whether the New Category Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Kitchen Printer Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			Thread.sleep(2000);
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");
			
			ut.PassedCaptureScreenshotAsBASE64();
			
			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Kitchen Printer Saved Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Kitchen Printer Saved");
		
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Kitchen Printer Name already exist pop up not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try
		{
			Thread.sleep(2000);
			cmp.Click_CancelButton();
			
			System.out.println("Cancel button not Clicked while creating Duplicate Kitchen Printer");
		}
		catch(Exception k)
		{}
	}
	
	@Given("Search the Element in Active and InActive List")
	public void searchTheElementInActiveAndInActiveList() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();
		
		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");
		
		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("Category_Name"));
		
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();
				
		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");
		
		//Verify whether the Gratuity activated or not
		cmp.Verify_Search(Utility.getProperty("Category_Name"));
	}


	@Given("Navigate the Kitchen Printers Page and I Search the Added Kitchen Printer from Category in Kitchen Printers Settings Page")
	public void navigateTheKitchenPrintersPageAndISearchTheAddedKitchenPrinterFromCategoryInKitchenPrintersSettingsPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Load the Kitchen Printer page

				lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"kitchenPrinters");
				
				Thread.sleep(5000);
				cmp.VerifyMainScreenPageHeader("Kitchen Printers");
	}
	@Then("Veifying the Saved Kitchen Printer In Category Page")
	public void veifyingTheSavedKitchenPrinterInCategoryPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    cmp.Verify_Search(Utility.getProperty("Category_Add_Kitchen_Printer_Name"));
	}
	
	@Given("Navigate the Label Printers Page and I Search the Added Label Printer from Category in Label Printers Settings Page")
	public void navigateTheLabelPrintersPageAndISearchTheAddedLabelPrinterFromCategoryInLabelPrintersSettingsPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Load the Label Printer page

		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"labelPrinters");
		
		Thread.sleep(5000);
		cmp.VerifyMainScreenPageHeader("Label Printers");
	
	}
	@Then("Veifying the Saved Label Printer In Category Page")
	public void veifyingTheSavedLabelPrinterInCategoryPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		cmp.Verify_Search(Utility.getProperty("Category_Add_Label_Printer_Name"));
		
		
		Thread.sleep(5000);
		//Load the Categories page
//		a.Navigate_To_Page(Utility.getProperty("store_Id1"), "Categorys");
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"categories");
	
	}


	
}

