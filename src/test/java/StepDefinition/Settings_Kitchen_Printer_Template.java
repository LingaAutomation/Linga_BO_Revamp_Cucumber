package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterTemplatePage;
import com.Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_Kitchen_Printer_Template 
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	KitchenPrinterTemplatePage kpt = new KitchenPrinterTemplatePage();

	@Given("Open Kitchen Printer Template home page BaseURL and StoreID")
	public void OpenKitchenPrinterTemplateHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"kitchenPrinterTemplate");
	}

	@Given("Verifying the Kitchen Printer Template Header Page")
	public void verifyingTheKitchenPrinterTemplateHeaderPage() throws Exception 
	{
		Thread.sleep(5000);
		//Verify the Kitchen Printer Template page loaded or not
		if(kpt.Kitchen_Printer_TemplateHeader().isDisplayed())
		{
			test.log(LogStatus.PASS, "Kitchen Printer Template Page Loaded Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Kitchen Printer Template Page Loading Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Verify Font Size is Displayed or Not")
	public void verifyFontSizeIsDisplayedOrNot()
	{
		if(driver.findElement(By.xpath("//span[.='Font Size']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Font Size Field is Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Font Size Field is not Displayed");
		}
	}
	@Then("Verify Store and Check Details Filed is Displayed or Not")
	public void verifyStoreAndCheckDetailsFiledIsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("(//div[.='Store & Check Details'])[1]")).isEnabled())
		{
			test.log(LogStatus.PASS,"Store and Check Details Field is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Store and Check Details Field is not Displayed");
		}
	}
	@Then("Verify Order and Item Summary Field is Displayed or Not")
	public void verifyOrderAndItemSummaryFieldIsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("(//div[.='Order & Item Summary'])[1]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Order and Item Summary Field is Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Order and Item Summary Field is not Displayed");
		}
	}
	@Then("Verify Customer Info Field is Displayed or Not")
	public void verifyCustomerInfoFieldIsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("(//div[.='Customer Info'])[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Customer Info Field is Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Customer Info Field is not Displayed");
		}
	}
	@Then("Verify Driver Receipt Options Field is Displayed or Not")
	public void verifyDriverReceiptOptionsFieldIsDisplayedOrNot()
	{
		if(driver.findElement(By.xpath("(//div[.='Driver Receipt Options'])[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Driver Receipt options Field is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL,"Driver Receipt options Field is not Displayed");
		}
	}
	@Then("Verify Additional Details Field is Displayed or Not")
	public void verifyAdditionalDetailsFieldIsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("(//div[.='Additional Details'])[1]")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Additional Details Field is Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Additional Details Field is Displayed");
		}
	}
	@Then("Verify Template Preview Field is Displayed or Not")
	public void verifyTemplatePreviewFieldIsDisplayedOrNot() 
	{
		if(driver.findElement(By.xpath("//h6[.='Template Preview']")).isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Template Preview Field is Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Template Preview Field is not Displayed");
		}
	}

	@Given("Select Font Size as Medium")
	public void selectFontSizeAsMedium() 
	{
		kpt.Medium_RadioBtn.click();
	}
	@Then("Select the Font Style From Dropdown")
	public void selectTheFontStyleFromDropdown() throws Exception 
	{
		kpt.Font_Style_InputBox.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[.='2 Height'])[2]")).click();
	}
	@Then("Verify Kitchen Printer Template Updated or Not")
	public void verifyKitchenPrinterTemplateUpdatedOrNot()
	{
		try {
			Thread.sleep(3000);
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Kitchen Receipt Template Saved Successfully"))
			{
				test.log(LogStatus.PASS, "Kitchen Receipt Template Saved Successfully After Disable All Checkboxes");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Kitchen Printer Template Save Failed After Disabling All Checkboxes");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Given("Select the Font Size as Large")
	public void selectTheFontSizeAsLarge() 
	{
		kpt.Large_RadioBtn.click();
	}

	@Given("Select the Font Size as Small")
	public void selectTheFontSizeAsSmall()
	{
		kpt.Small_RadioBtn.click();
	}

	@Given("Click on Store and Check Details")
	public void clickOnStoreAndCheckDetails() throws Exception 
	{
		kpt.Open_Store_CheckDetails_Screen();
	}
	@Then("Verify Store Name Checkbox is Displayed or Not")
	public void verifyStoreNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Store_Name_ChkBox,"Store Name Checkbox");
	}
	@Then("Verify Check Number Checkbox is Displayed or Not")
	public void verifyCheckNumberCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Check_Number_ChkBox,"Check Number Checkbox");
	}
	@Then("Verify Service Type Checkbox is Displayed or Not")
	public void verifyServiceTypeCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(kpt.ServiceType_ChkBox,"Service Type Checkbox");
	}
	@Then("Verify Table Name Checkbox is Displayed or Not")
	public void verifyTableNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Table_Name_ChkBox,"Table Name Checkbox");
	}
	@Then("Verify Printer Name Checkbox is Displayed or Not")
	public void verifyPrinterNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Printer_Name_ChkBox,"Printer Name Checkbox");
	}
	@Then("Verify Server Name Checkbox is Displayed or Not")
	public void verifyServerNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Server_Name_ChkBox,"Server Name Checkbox");
	}
	@Then("Verify Print Date and Time Checkbox is Displayed or Not")
	public void verifyPrintDateAndTimeCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Printer_DateTime_ChkBox,"Print Date and Time Checkbox");
	}
	@Then("Verify Customer Name Checkbox is Displayed or Not")
	public void verifyCustomerNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Customer_Name_ChkBox,"Customer Name Checkbox");
	}
	@Then("Verify PickUp Date and Time Checkbox is Dislayed or Not")
	public void verifyPickUpDateAndTimeCheckboxIsDislayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.PickUp_DateTime_ChkBox,"PickUp Date and Time Checkbox");
	}

	@Given("Click on Order and Iten Summary")
	public void clickOnOrderAndItenSummary() throws Exception
	{
		Thread.sleep(1000);
		//Open the Order & Item Summary Screen
		kpt.Open_Order_and_ItemSummary_Screen();
	}
	@Then("Verify SplitByCourse Checkbox is Displayed or Not")
	public void verifySplitByCourseCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.SplitByCourse_ChkBox,"Split By Course Checkbox");
	}
	@Then("Verify MenuPrice Checkbox is Displayed or Not")
	public void verifyMenuPriceCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Menu_Price_ChkBox,"Menu Price Checkbox");
	}
	@Then("Verify QuantityBefore ItemName Checkbox is Displayed or Not")
	public void verifyQuantityBeforeItemNameCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(kpt.QuantityBefore_ItemName_ChkBox,"QuantityBefore ItenName Checkbox");
	}
	@Then("Verify All Modifiers in Modifier Print Checkbox is Displayed or Not")
	public void verifyAllModifiersInModifierPrintCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.AllModifiers_inModifierPrint_ChkBox,"All Modifiers in Modifier Print Checkbox");
	}
	@Then("Verify Short Form for the Modifier Checkbox is Displayed or Not")
	public void verifyShortFormForTheModifierCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.ShortFormfortheModifier_ChkBox,"Short Form of Modifier Checkbox");
	}
	@Then("Verify Horizantal view for Modifier Checkbox is Displayed or Not")
	public void verifyHorizantalViewForModifierCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.HorizontalViewModifier_ChkBox,"Horizontal View Modifier Checkbox");
	}
	@Then("Verify Other language Menu Name Checkbox is Displayed or Not")
	public void verifyOtherLanguageMenuNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.OtherLanguage_MenuName_ChkBox,"Other Language Menu Name Checkbox");
	}
	@Then("Verify Split Menu Quantity Checkbox is Displayed or Not")
	public void verifySplitMenuQuantityCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Split_MenuQuantity_ChkBox,"Split Menu Quantity Checkbox");
	}
	@Then("Verify Enable Item Summary Checkbox is Displayed or Not")
	public void verifyEnableItemSummaryCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Enable_ItemSummary_ChkBox,"Enable Item Summary Checkbox");
	}

	@Given("Click on Customer Info Field")
	public void clickOnCustomerInfoField() throws Exception 
	{
		kpt.Open_Customer_Info_Screen();
	}
	@Then("Verify Customer Info Position is Displayed or Not")
	public void verifyCustomerInfoPositionIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//span[.='Customer Info Position:']")),"Customer Info Position");
	}
	@Then("Verify Address Checkbox is displayed or Not")
	public void verifyAddressCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Address__CustomerInfo_ChkBox,"Address Checkbox");
	}
	@Then("Verify Email Checkbox is Displayed or Not")
	public void verifyEmailCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Email_CustomerInfo_ChkBox,"Email Checkbox");
	}
	@Then("Verify Phone Number Checkbox is Displayed or Not")
	public void verifyPhoneNumberCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Phone_Number_CustomerInfo_ChkBox,"Phone Number Checkbox");
	}
	@Then("Verify Customer Notes Checkbox is Displayed or Not")
	public void verifyCustomerNotesCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Customer_Notes_CustomerInfo_ChkBox,"Customer Notes Checkbox");
	}

	@Given("Click on Driver Receipt Options")
	public void clickOnDriverReceiptOptions() throws Exception 
	{
		kpt.Open_Driver_ReceiptOptions_Screen();
	}
	@Then("Verify Enable Driver Receipt Toggle is Displayed or Not")
	public void verifyEnableDriverReceiptToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.Enable_DriverReceipt_YesBtn,"Enable Driver Receipt Toggle");
	}
	@Then("Verify Total Check box is Displayed or Not")
	public void verifyTotalCheckBoxIsDisplayedOrNot() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(kpt.Total_DriverReceipt_ChkBox,"Total Checkbox");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify Tip Checkbox is Displayed or Not")
	public void verifyTipCheckboxIsDisplayedOrNot() throws Exception
	{
		try {
		cmp.Check_Element_or_Text_Displayed(kpt.Tip_DriverReceipt_ChkBox,"Tip Checkbox");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify Signature Checkbox is Displayed or Not")
	public void verifySignatureCheckboxIsDisplayedOrNot() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(kpt.Signature_DriverReceipt_ChkBox,"Signature Checkbox");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify Balance Due Checkbox is Displayed or Not")
	public void verifyBalanceDueCheckboxIsDisplayedOrNot() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(kpt.Balance_Due_DriverReceipt_ChkBox,"Balance Due Checkbox");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify Driver Receipt No of Copies Input box is Dispalyed or Not")
	public void verifyDriverReceiptNoOfCopiesInputBoxIsDispalyedOrNot() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(kpt.No_ofCopies_InputBox,"No of Copies Input Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("Click on Additional Details options")
	public void clickOnAdditionalDetailsOptions() throws Exception 
	{
		kpt.Open_Additional_Details_Screen();
	}
	@Then("Verify Cut Paper After Each Print Checkbox")
	public void verifyCutPaperAfterEachPrintCheckbox() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(kpt.CutPaper_After_EachPrint_ChkBox,"Cut Paper After Each Print");
	}

	@Given("UnCheck the Store Name Checkbox")
	public void unCheckTheStoreNameCheckbox() throws Exception
	{
		Thread.sleep(2000);
		//Select the Store Name Font
		try
		{
			if(kpt.Store_Name_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.Store_Name_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("UnCheck Check Number Checkbox")
	public void unCheckCheckNumberCheckbox() throws Exception 
	{
		Thread.sleep(1000);
		try
		{
			//Select the Check Number Font
			if(kpt.Check_Number_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.Check_Number_CheckBox().click();

				try
				{
					Thread.sleep(1000);
					if(kpt.Inline_Position_Check_Number_RadioButton().isDisplayed())
					{
						test.log(LogStatus.FAIL, "Inline Position for Check Number Radio button Displayed");

					}

				}
				catch(Exception g)
				{
					test.log(LogStatus.PASS, "Inline Position for Check Number Radio button not Displayed");

				}
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("UnCheck Service Type Checkbox")
	public void unCheckServiceTypeCheckbox()
	{
		try
		{
			//Select the Check Number Font
			if(kpt.ServiceType_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.ServiceType_CheckBox().click();

				try
				{
					Thread.sleep(1000);
					if(kpt.Inline_Position_Service_Type_RadioButton().isDisplayed())
					{
						test.log(LogStatus.FAIL, "Inline Position for Service Type Radio button Displayed");

					}

				}
				catch(Exception g)
				{
					test.log(LogStatus.PASS, "Inline Position for Service Type Radio button not Displayed");


				}
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("UnCheck Table Name Checkbox")
	public void unCheckTableNameCheckbox() 
	{
		try
		{
			//Select the Table Name Font
			if(kpt.Table_Name_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.Table_Name_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("UnCheck Printer Name Checkbox")
	public void unCheckPrinterNameCheckbox() 
	{
		try
		{
			//Select the Printer Name Font
			if(kpt.Printer_Name_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.Printer_Name_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("UnCheck Server Name Checkbox")
	public void unCheckServerNameCheckbox() 
	{
		try
		{
			//Disable Server Name
			if(kpt.Server_Name_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.Server_Name_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("UnCheck Print Date and Time Checkbox")
	public void unCheckPrintDateAndTimeCheckbox()
	{
		try
		{
			//Disable Print Date & Time
			if(kpt.Printer_DateTime_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.Printer_DateTime_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("UnCheck Customer Name Checkbox")
	public void unCheckCustomerNameCheckbox() 
	{
		try
		{
			//Disable Customer Name Checkbox
			if(kpt.Customer_Name_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.Customer_Name_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("UnCheck PickUp Date and Time Checkbox")
	public void unCheckPickUpDateAndTimeCheckbox() 
	{
		try
		{
			//Disable Pickup Date & Time Checkbox
			if(kpt.PickUp_DateTime_CheckBox_Selected().isDisplayed())
			{
				Thread.sleep(2000);
				kpt.PickUp_DateTime_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}

	}
	@Then("Close Store and Check Details")
	public void closeStoreAndCheckDetails() throws Exception 
	{
		Thread.sleep(1000);
		//Close the Store & Check Details screen
		kpt.Close_Store_CheckDetails_Screen();
	}

	@Given("Uncheck SplitByCourse Checkbox")
	public void uncheckSplitByCourseCheckbox()
	{
		try
		{
			//Disable Split By Course Checkbox
			if(kpt.SplitByCourse_CheckBox_Selected().isDisplayed())
			{
				kpt.SplitByCourse_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}

	}
	@Given("Uncheck MenuPrice Checkbox")
	public void uncheckMenuPriceCheckbox() 
	{
		try
		{
			//Disable Menu Price Checkbox
			if(kpt.Menu_Price_CheckBox_Selected().isDisplayed())
			{
				kpt.Menu_Price_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck QuantityBefore ItemName Checkbox")
	public void uncheckQuantityBeforeItemNameCheckbox() 
	{
		try
		{
			//Disable Quantity Before Item Name Checkbox
			if(kpt.QuantityBefore_ItemName_CheckBox_Selected().isDisplayed())
			{
				kpt.QuantityBefore_ItemName_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck All Modifiers in Modifier Print Checkbox")
	public void uncheckAllModifiersInModifierPrintCheckbox() 
	{
		try
		{
			//Disable All Modifiers in Modifier Print Checkbox
			if(kpt.AllModifiers_inModifierPrint_CheckBox_Selected().isDisplayed())
			{
				kpt.AllModifiers_inModifierPrint_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck Short Form for the Modifier Checkbox")
	public void uncheckShortFormForTheModifierCheckbox()
	{
		try
		{
			//Disable Split By Course Checkbox
			if(kpt.ShortFormfortheModifier_ChkBox_SLD.isDisplayed())
			{
				kpt.ShortFormfortheModifier_ChkBox.click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck Horizantal view for Modifier Checkbox")
	public void uncheckHorizantalViewForModifierCheckbox() {
		try
		{
			//Disable Split By Course Checkbox
			if(kpt.HorizontalViewModifier_ChkBox_SLD.isDisplayed())
			{
				kpt.HorizontalViewModifier_ChkBox.click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck Other language Menu Name Checkbox")
	public void uncheckOtherLanguageMenuNameCheckbox() 
	{
		try
		{
			//Disable Other language Menu Name Checkbox
			if(kpt.OtherLanguage_MenuName_CheckBox_Selected().isDisplayed())
			{
				kpt.OtherLanguage_MenuName_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck Split Menu Quantity Checkbox")
	public void uncheckSplitMenuQuantityCheckbox() 
	{
		try
		{
			//Disable Split By Course Checkbox
			if(kpt.Split_MenuQuantity_ChkBox_SLD.isDisplayed())
			{
				kpt.Split_MenuQuantity_ChkBox.click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck Enable Item Summary Checkbox")
	public void uncheckEnableItemSummaryCheckbox() 
	{
		try
		{
			//Disable Enable Item Summary Checkbox
			if(kpt.Enable_ItemSummary_CheckBox_Selected().isDisplayed())
			{
				kpt.Enable_ItemSummary_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Close Order and Item Summary")
	public void closeOrderAndItemSummary() throws Exception 
	{
		Thread.sleep(1000);
		//Close Order & Item Summary
		kpt.Close_Order_and_ItemSummary_Screen();
	}

	@Given("Uncheck Address Checkbox")
	public void uncheckAddressCheckbox()
	{
		try
		{
			//Disable Address Checkbox
			if(kpt.Address__CustomerInfo_CheckBox_Selected().isDisplayed())
			{
				kpt.Address__CustomerInfo_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck Email Checkbox")
	public void uncheckEmailCheckbox() 
	{
		try
		{
			//Disable Email Checkbox
			if(kpt.Email_CustomerInfo_CheckBox_Selected().isDisplayed())
			{
				kpt.Email_CustomerInfo_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck Phone Number Checkbox")
	public void uncheckPhoneNumberCheckbox() 
	{
		try
		{
			//Disable Phone Number Checkbox
			if(kpt.Phone_Number_CustomerInfo_CheckBox_Selected().isDisplayed())
			{
				kpt.Phone_Number_CustomerInfo_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Given("Uncheck Customer Notes Checkbox")
	public void uncheckCustomerNotesCheckbox() 
	{
		try
		{
			//Disable Customer Notes Checkbox
			if(kpt.Customer_Notes_CustomerInfo_CheckBox_Selected().isDisplayed())
			{
				kpt.Customer_Notes_CustomerInfo_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}

	}
	@Then("Close Customer Info")
	public void closeCustomerInfo() throws Exception 
	{
		Thread.sleep(1000);
		//Close Customer Info Screen
		kpt.Close_Customer_Info_Screen();
	}


	@Then("Disable Driver Receipt Toggle")
	public void disableDriverReceiptToggle() throws Exception 
	{
		Thread.sleep(1000);
		//Disable Enable Driver Receipt
		kpt.Disable_DriverReceipt();
	}

	@Then("Enable Enable Driver Receipt Toggle")
	public void enableEnableDriverReceiptToggle() 
	{
		kpt.Enable_DriverReceipt_YesBtn.click();
	}
	@Then("Uncheck Total Checkbox")
	public void uncheckTotalCheckbox() 
	{
		try
		{
			//Disable Total Checkbox
			if(kpt.Total_DriverReceipt_CheckBox_Selected().isDisplayed())
			{
				kpt.Total_DriverReceipt_CheckBox().click();
			}
		}
		catch(Exception l)
		{
		}
	}
	@Then("Uncheck Tip Checkbox")
	public void uncheckTipCheckbox() 
	{
		try
		{
			//Disable Tip Checkbox
			if(kpt.Tip_DriverReceipt_CheckBox_Selected().isDisplayed())
			{
				kpt.Tip_DriverReceipt_CheckBox().click();
			}
		}
		catch(Exception l)
		{
		}
	}
	@Then("Uncheck Signature Checkbox")
	public void uncheckSignatureCheckbox()
	{
		try
		{
			//Disable Signature Checkbox
			if(kpt.Signature_DriverReceipt_CheckBox_Selected().isDisplayed())
			{
				kpt.Signature_DriverReceipt_CheckBox().click();
			}
		}
		catch(Exception l)
		{
		}
	}
	@Then("Uncheck Balance Due Checkbox")
	public void uncheckBalanceDueCheckbox() 
	{
		try
		{
			//Disable Balance Due Checkbox
			if(kpt.Balance_Due_DriverReceipt_CheckBox_Selected().isDisplayed())
			{
				kpt.Balance_Due_DriverReceipt_CheckBox().click();
			}
		}
		catch(Exception l)
		{}
	}

	@And("Enter No.of Copies as Zero")
	public void EnterNo_ofCopiesAsZero() throws Exception 
	{
		Thread.sleep(1000);
		//Select No of Copies
		kpt.Enter_No_ofCopies("0");
	}

	@And("Enter No.of Copies More Than Ten")
	public void EnterNo_OfCopiesMoreThanTen() throws Exception
	{
		Thread.sleep(1000);
		//Select No of Copies
		kpt.Enter_No_ofCopies("100");
	}

	@And("Enter No.of Copies")
	public void EnterCopies() throws Exception
	{
		Thread.sleep(1000);
		//Select No of Copies
		kpt.Enter_No_ofCopies("5");
	}

	@Then("Verify the Value Must be one to ten")
	public void VerifyErrorMessage() throws Exception 
	{
		Thread.sleep(1000);
		//Check whether the No of Copies Error msg displays or not
		if(kpt.No_ofCopiesErrorMsg().isDisplayed())
		{
			test.log(LogStatus.PASS, "The value must be in range 1 to 10 Displayed when Entering above 10");
		}
		else
		{
			test.log(LogStatus.FAIL, "The value must be in range 1 to 10 not Displayed when Entering above 10");
		}
	}
	@Then("Close Driver Receipt options")
	public void closeDriverReceiptOptions() throws Exception 
	{
		Thread.sleep(1000);
		//Close Driver Receipt screen
		kpt.Close_Driver_ReceiptOptions_Screen();
	}


	@Then("Uncheck Cut Paper After Each print Checkbox")
	public void uncheckCutPaperAfterEachPrintCheckbox() 
	{
		try
		{
			//Disable Customer Notes Checkbox
			if(kpt.CutPaper_After_EachPrint_CheckBox_Selected().isDisplayed())
			{
				kpt.CutPaper_After_EachPrint_CheckBox().click();
			}
		}
		catch(Exception g)
		{

		}
	}
	@Then("Close Additional Details")
	public void closeAdditionalDetails() throws Exception
	{
		Thread.sleep(1000);
		//Close Additional Details
		kpt.Close_Additional_Details_Screen();
	}

	@Given("Check the Store Name Checkbox")
	public void checkTheStoreNameCheckbox() 
	{
//		try
//		{
//			//Check and Enable Store Name Checkbox
//			if(kpt.Store_Name_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Store Name
				kpt.Store_Name_CheckBox().click();
//			}
//		}
//		catch(Exception g)
//		{
//
//		}
	}
	@Given("Check Check Number Checkbox")
	public void checkCheckNumberCheckbox() 
	{
//		try
//		{
//			//Check and Enable Check Number Checkbox
//			if(kpt.Check_Number_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Check Number
				kpt.Check_Number_CheckBox().click();

				try
				{
					Thread.sleep(1000);
					if(kpt.Inline_Position_Check_Number_RadioButton().isDisplayed())
					{
						test.log(LogStatus.PASS, "Inline Position for Check Number Radio button Displayed");

						Thread.sleep(1000);
						kpt.Inline_Position_Check_Number_RadioButton().click();
					}

				}
				catch(Exception k)
				{
					test.log(LogStatus.FAIL, "Inline Position for Check Number Radio button not Displayed");

				}
//			}
//		}
//		catch(Exception g)
//		{
//
//		}			
	}
	@Given("Check Service Type Checkbox")
	public void checkServiceTypeCheckbox() throws Exception 
	{
//		try
//		{
//			//Check and Enable Service Type Checkbox
//			if(kpt.ServiceType_CheckBox_Selected1().isDisplayed())
//			{

				Thread.sleep(1000);
				//Enable Service Type
				kpt.ServiceType_CheckBox().click();

				try
				{
					if(kpt.Inline_Position_Service_Type_RadioButton().isDisplayed())
					{
						test.log(LogStatus.PASS, "Inline Position for Service Type Radio button Displayed");

						Thread.sleep(1000);
						kpt.Inline_Position_Service_Type_RadioButton().click();
					}

				}
				catch(Exception g)
				{
					test.log(LogStatus.FAIL, "Inline Position for Service Type Radio button not Displayed");
				}	
//			}
//		}
//		catch(Exception l)
//		{
//
//		}

	}
	@Given("Check Table Name Checkbox")
	public void checkTableNameCheckbox() 
	{
//		try
//		{
//			//Check and Enable Table Name Checkbox
//			if(kpt.Table_Name_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Table Name
				kpt.Table_Name_CheckBox().click();
//			}
//		}
//		catch(Exception g)
//		{
//
//		}
	}
	@Given("Check Printer Name Checkbox")
	public void checkPrinterNameCheckbox()
	{
//		try
//		{
//			//Check and Enable Printer Name Checkbox
//			if(kpt.Printer_Name_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Printer Name
				kpt.Printer_Name_CheckBox().click();
//			}
//		}
//		catch(Exception g)
//		{
//
//		}
	}
	@Given("Check Server Name Checkbox")
	public void checkServerNameCheckbox()
	{
//		try
//		{
//			//Check and Enable Server Name Checkbox
//			if(kpt.Server_Name_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Server Name
				kpt.Server_Name_CheckBox().click();	
//			}
//		}
//		catch(Exception j)
//		{					
//
//		}

	}
	@Given("Check Print Date and Time Checkbox")
	public void checkPrintDateAndTimeCheckbox() 
	{
//		try
//		{
//			//Check and Enable Print Date & Time Checkbox
//			if(kpt.Printer_DateTime_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Print Date & Time
				kpt.Printer_DateTime_CheckBox().click();		
//			}
//		}
//		catch(Exception k)
//		{
//
//		}

	}
	@Given("Check Customer Name Checkbox")
	public void checkCustomerNameCheckbox()
	{
//		try
//		{
//			//Check and Enable Customer Name Checkbox
//			if(kpt.Customer_Name_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Customer Name
//				kpt.Customer_Name_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check PickUp Date and Time Checkbox")
	public void checkPickUpDateAndTimeCheckbox() throws Exception 
	{
//		try
//		{
//			//Check and Enable PickUp Date & Time Checkbox
//			if(kpt.PickUp_DateTime_CheckBox_Selected1().isDisplayed())
//			{

				Thread.sleep(1000);
				//Enable PickUp Date & Time
				kpt.PickUp_DateTime_CheckBox().click();
//			}
//		}
//		catch(Exception k)
//		{
//
//		}
	}

	@Given("Check SplitByCourse Checkbox")
	public void checkSplitByCourseCheckbox() 
	{
//		try
//		{
//			//Check and Enable Split By Course Checkbox
//			if(kpt.SplitByCourse_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Split By Course
				kpt.SplitByCourse_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check MenuPrice Checkbox")
	public void checkMenuPriceCheckbox() 
	{
//		try
//		{
//			//Check and Enable Menu Price Checkbox
//			if(kpt.Menu_Price_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Menu Price
				kpt.Menu_Price_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{
//
//		}

	}
	@Given("Check QuantityBefore ItemName Checkbox")
	public void checkQuantityBeforeItemNameCheckbox() 
	{
//		try
//		{
//			//Check and Enable Quantity Before Item Name Checkbox
//			if(kpt.QuantityBefore_ItemName_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Quantity Before Item Name
//				kpt.QuantityBefore_ItemName_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check All Modifiers in Modifier Print Checkbox")
	public void checkAllModifiersInModifierPrintCheckbox() {
//		try
//		{
//			//Check and Enable All Modifiers in Modifier Print Checkbox
//			if(kpt.AllModifiers_inModifierPrint_CheckBox_Selected1().isDisplayed())
//			{

				//Enable All Modifiers in Modifier Print
				kpt.AllModifiers_inModifierPrint_CheckBox().click();		
//			}
//		}
//		catch(Exception l)
//		{
//
//		}

	}
	@Given("Check Short Form for the Modifier Checkbox")
	public void checkShortFormForTheModifierCheckbox() 
	{
//		try
//		{
//			//Check and Enable Other language Menu Name Checkbox
//			if(kpt.ShortFormfortheModifier_ChkBox_SLD1.isDisplayed())
//			{

				//Enable Other language Menu Name
//				kpt.ShortFormfortheModifier_ChkBox.click();
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check Horizantal view for Modifier Checkbox")
	public void checkHorizantalViewForModifierCheckbox()
	{
//		try
//		{
//			//Check and Enable Other language Menu Name Checkbox
//			if(kpt.HorizontalViewModifier_ChkBox_SLD1.isDisplayed())
//			{

				//Enable Other language Menu Name
				kpt.HorizontalViewModifier_ChkBox.click();
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check Other language Menu Name Checkbox")
	public void checkOtherLanguageMenuNameCheckbox() 
	{
//		try
//		{
//			//Check and Enable Other language Menu Name Checkbox
//			if(kpt.OtherLanguage_MenuName_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Other language Menu Name
				kpt.OtherLanguage_MenuName_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check Split Menu Quantity Checkbox")
	public void checkSplitMenuQuantityCheckbox() {
//		try
//		{
//			//Check and Enable Consolidate Menu In Kitchen Checkbox
//			if(kpt.Consolidate_Menu_InKitchen_CheckBox_Selected1().isDisplayed())
//			{	
//
//				if(kpt.Split_MenuQuantity_CheckBox_Selected().isDisplayed())
//				{
					kpt.Split_MenuQuantity_CheckBox().click();
//				}
//
//				//Enable Consolidate Menu In Kitchen
//				kpt.Consolidate_Menu_InKitchen_CheckBox().click();	
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check Enable Item Summary Checkbox")
	public void checkEnableItemSummaryCheckbox() 
	{
//		try
//		{
//			//Check and Enable Enable Item Summary Checkbox
//			if(kpt.Enable_ItemSummary_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Enable Item Summary
				kpt.Enable_ItemSummary_CheckBox().click();		
//			}
//		}
//		catch(Exception l)
//		{
//		}
	}

	@Given("Check Address Checkbox")
	public void checkAddressCheckbox()
	{
//		try
//		{
//			//Check and Enable Address Checkbox
//			if(kpt.Address__CustomerInfo_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Address
				kpt.Address__CustomerInfo_CheckBox().click();		
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check Email Checkbox")
	public void checkEmailCheckbox() 
	{
//		try
//		{
//			//Check and Enable Email Checkbox
//			if(kpt.Email_CustomerInfo_CheckBox_Selected1().isDisplayed())
//			{


				//Enable Email
				kpt.Email_CustomerInfo_CheckBox().click();
//			}
//		}
//		catch(Exception p)
//		{
//
//		}
	}
	@Given("Check Phone Number Checkbox")
	public void checkPhoneNumberCheckbox() {
//		try
//		{
//			//Check and Enable Phone Number Checkbox
//			if(kpt.Phone_Number_CustomerInfo_CheckBox_Selected1().isDisplayed())
//			{


				//Enable Phone Number
				kpt.Phone_Number_CustomerInfo_CheckBox().click();			
//			}
//		}
//		catch(Exception l)
//		{
//
//		}
	}
	@Given("Check Customer Notes Checkbox")
	public void checkCustomerNotesCheckbox() {
//		try
//		{
//			//Check and Enable Customer Notes Checkbox
//			if(kpt.Customer_Notes_CustomerInfo_CheckBox_Selected1().isDisplayed())
//			{

				//Enable Customer Notes
				kpt.Customer_Notes_CustomerInfo_CheckBox().click();	
//			}
//		}
//		catch(Exception p)
//		{
//
//		}
	}

	@Then("Check Total Checkbox")
	public void checkTotalCheckbox()
	{
//		try
//		{
//			//Disable Total Checkbox
//			if(kpt.Total_DriverReceipt_CheckBox_Selected1().isDisplayed())
//			{
				kpt.Total_DriverReceipt_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{
//		}
	}
	@Then("Check Tip Checkbox")
	public void checkTipCheckbox() 
	{
//		try
//		{
//			//Disable Tip Checkbox
//			if(kpt.Tip_DriverReceipt_CheckBox_Selected1().isDisplayed())
//			{
				kpt.Tip_DriverReceipt_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{
//		}
	}
	@Then("Check Signature Checkbox")
	public void checkSignatureCheckbox() 
	{
//		try
//		{
//			//Disable Signature Checkbox
//			if(kpt.Signature_DriverReceipt_CheckBox_Selected1().isDisplayed())
//			{
				kpt.Signature_DriverReceipt_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{
//		}

	}
	@Then("Check Balance Due Checkbox")
	public void checkBalanceDueCheckbox() 
	{
//		try
//		{
//			//Disable Balance Due Checkbox
//			if(kpt.Balance_Due_DriverReceipt_CheckBox_Selected1().isDisplayed())
//			{
				kpt.Balance_Due_DriverReceipt_CheckBox().click();
//			}
//		}
//		catch(Exception l)
//		{}
	}


	@Then("Check Cut Paper After Each print Checkbox")
	public void checkCutPaperAfterEachPrintCheckbox()
	{
//		try
//		{
//			//Check and Enable Cut Paper After Each print Checkbox
//			if(kpt.CutPaper_After_EachPrint_CheckBox_Selected1().isDisplayed())
//			{


				//Enable Cut Paper After Each print
				kpt.CutPaper_After_EachPrint_CheckBox().click();
//			}
//		}
//		catch(Exception k)
//		{
//
//		}

	}

	@Given("Verify the Store Name Checkbox Disabled or Not")
	public void verifyTheStoreNameCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Store Name Checkbox
			if(kpt.Store_Name_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Store Name Check Box not Selected while Reopening the page After Saved");					
				
		    }
		}
		catch(Exception g)
		{
			test.log(LogStatus.FAIL, "Store Name Check Box Selected while Reopening the page After Saved");
		}
		
	}
	@Given("Verify Check Number Checkbox Disabled or Not")
	public void verifyCheckNumberCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Check Number Checkbox
			if(kpt.Check_Number_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Check Number Check Box not Selected while Reopening the page After Saved");					
				

			}
		}
				catch(Exception k)
				{
					test.log(LogStatus.FAIL, "Inline Position for Check Number Radio button not Displayed");

				}
	}
	@Given("Verify Service Type Checkbox Disabled or Not")
	public void verifyServiceTypeCheckboxDisabledOrNot()
	{
		try
		{
			//Check and Enable Service Type Checkbox
			if(kpt.ServiceType_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Service Type Check Box not Selected while Reopening the page After Saved");					
				
			}
			}
				catch(Exception g)
				{
					test.log(LogStatus.FAIL, "Inline Position for Service Type Radio button not Displayed");
				}	
	}
	@Given("Verify Table Name Checkbox Disabled or Not")
	public void verifyTableNameCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Table Name Checkbox
			if(kpt.Table_Name_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Table Name Check Box not Selected while Reopening the page After Saved");					

			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.FAIL, "Table Name Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Printer Name Checkbox Disabled or Not")
	public void verifyPrinterNameCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Printer Name Checkbox
			if(kpt.Printer_Name_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Printer Name Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.FAIL, "Printer Name Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Server Name Checkbox Disabled or Not")
	public void verifyServerNameCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Server Name Checkbox
			if(kpt.Server_Name_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Server Name Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception j)
		{					
			test.log(LogStatus.FAIL, "Server Name Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Print Date and Time Checkbox Disabled or Not")
	public void verifyPrintDateAndTimeCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Print Date & Time Checkbox
			if(kpt.Printer_DateTime_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Print Date & Time Check Box not Selected while Reopening the page After Saved");							
			}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Print Date & Time Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Customer Name Checkbox Disabled or Not")
	public void verifyCustomerNameCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Customer Name Checkbox
			if(kpt.Customer_Name_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Customer Name Check Box not Selected while Reopening the page After Saved");					

			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Customer Name Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify PickUp Date and Time Checkbox Disabled or Not")
	public void verifyPickUpDateAndTimeCheckboxDisabledOrNot() 
	{
		
		try
		{
			//Check and Enable PickUp Date & Time Checkbox
			if(kpt.PickUp_DateTime_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "PickUp Date & Time Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "PickUp Date & Time Check Box Selected while Reopening the page After Saved");
		}
	}


	@Given("Verify SplitByCourse Checkbox Disabled or Not")
	public void verifySplitByCourseCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Split By Course Checkbox
			if(kpt.SplitByCourse_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Split By Course Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Split By Course Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify MenuPrice Checkbox Disabled or Not")
	public void verifyMenuPriceCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Menu Price Checkbox
			if(kpt.Menu_Price_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Menu Price Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Menu Price Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify QuantityBefore ItemName Checkbox Disabled or Not")
	public void verifyQuantityBeforeItemNameCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Quantity Before Item Name Checkbox
			if(kpt.QuantityBefore_ItemName_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Quantity Before Item Name Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Quantity Before Item Name Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify All Modifiers in Modifier Print Checkbox Disabled or Not")
	public void verifyAllModifiersInModifierPrintCheckboxDisabledOrNot() {
		try
		{
			//Check and Enable All Modifiers in Modifier Print Checkbox
			if(kpt.AllModifiers_inModifierPrint_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "All Modifiers in Modifier Print Check Box not Selected while Reopening the page After Saved");							
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "All Modifiers in Modifier Print Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Short Form for the Modifier Checkbox Disabled or Not")
	public void verifyShortFormForTheModifierCheckboxDisabledOrNot() {

		try
		{
			//Check and Enable Other language Menu Name Checkbox
			if(kpt.ShortFormfortheModifier_ChkBox_SLD1.isDisplayed())
			{

				test.log(LogStatus.PASS, "Short Form For the Modifier Check Box not Selected while Reopening the page After Saved");							
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Short Form For the Modifier Check Box Selected while Reopening the page After Saved");							
		}
	}
	
		
	
	@Given("Verify Horizantal view for Modifier Checkbox Disabled or Not")
	public void verifyHorizantalViewForModifierCheckboxDisabledOrNot() {

		try
		{
			//Check and Enable Other language Menu Name Checkbox
			if(kpt.HorizontalViewModifier_ChkBox_SLD1.isDisplayed())
			{

				test.log(LogStatus.PASS, "Horizantal View Modifier Check Box not Selected while Reopening the page After Saved");							
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Horizantal View Modifier Check Box Selected while Reopening the page After Saved");							
		}
	}

	@Given("Verify Other language Menu Name Checkbox Disabled or Not")
	public void verifyOtherLanguageMenuNameCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Other language Menu Name Checkbox
			if(kpt.OtherLanguage_MenuName_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Other language Menu Name Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Other language Menu Name Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Split Menu Quantity Checkbox Disabled or Not")
	public void verifySplitMenuQuantityCheckboxDisabledOrNot() {
		try
		{
			
			if(kpt.Split_MenuQuantity_CheckBox_Selected().isDisplayed())
			{
				test.log(LogStatus.PASS, "Split Menu Quantity Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Split Menu Quantity Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Enable Item Summary Checkbox Disabled or Not")
	public void verifyEnableItemSummaryCheckboxDisabledOrNot()
	{
		try
		{
			//Check and Enable Enable Item Summary Checkbox
			if(kpt.Enable_ItemSummary_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Enable Item Summary Check Box not Selected while Reopening the page After Saved");					
						
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Enable Item Summary Check Box Selected while Reopening the page After Saved");
		}
	}

	@Given("Verify Address Checkbox Disabled or Not")
	public void verifyAddressCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Address Checkbox
			if(kpt.Address__CustomerInfo_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Address Check Box not Selected while Reopening the page After Saved");						
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Address Check Box Selected while Reopening the page After Saved");
		}
		
	}
	@Given("Verify Email Checkbox Disabled or Not")
	public void verifyEmailCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Email Checkbox
			if(kpt.Email_CustomerInfo_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Email Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception p)
		{
			test.log(LogStatus.FAIL, "Email Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Phone Number Checkbox Disabled or Not")
	public void verifyPhoneNumberCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Phone Number Checkbox
			if(kpt.Phone_Number_CustomerInfo_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Phone Number Check Box not Selected while Reopening the page After Saved");								
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Phone Number Check Box Selected while Reopening the page After Saved");
		}
	}
	@Given("Verify Customer Notes Checkbox Disabled or Not")
	public void verifyCustomerNotesCheckboxDisabledOrNot() 
	{
		try
		{
			//Check and Enable Customer Notes Checkbox
			if(kpt.Customer_Notes_CustomerInfo_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Customer Notes Check Box not Selected while Reopening the page After Saved");					
				
			}
		}
		catch(Exception p)
		{
			test.log(LogStatus.FAIL, "Customer Notes Check Box Selected while Reopening the page After Saved");
		}
	}

	@Then("Verify Total Checkbox Disabled or Not")
	public void verifyTotalCheckboxDisabledOrNot()
	{
		try
		{
			//Disable Total Checkbox
			if(kpt.Total_DriverReceipt_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Total Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Total Check Box Selected while Reopening the page After Saved");					
		}
	}

	@Then("Verify Tip Checkbox Disabled or Not")
	public void verifyTipCheckboxDisabledOrNot() 
	{
		try
		{
			//Disable Tip Checkbox
			if(kpt.Tip_DriverReceipt_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Tip Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Tip Check Box Selected while Reopening the page After Saved");					
		}
	}

	@Then("Verify Signature Checkbox Disabled or Not")
	public void verifySignatureCheckboxDisabledOrNot() 
	{
		try
		{
			//Disable Signature Checkbox
			if(kpt.Signature_DriverReceipt_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Signature Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Signature Check Box Selected while Reopening the page After Saved");					
		}
	}

	@Then("Verify Balance Due Checkbox Disabled or Not")
	public void verifyBalanceDueCheckboxDisabledOrNot() 
	{
		try
		{
			//Disable Balance Due Checkbox
			if(kpt.Balance_Due_DriverReceipt_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Balance Due Check Box not Selected while Reopening the page After Saved");					
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Balance Due Check Box Selected while Reopening the page After Saved");					
		}
	}
	
	@Then("Verify Cut Paper After Each print Checkbox Disabled or Not")
	public void verifyCutPaperAfterEachPrintCheckboxDisabledOrNot()
	{
		try
		{
			//Check and Enable Cut Paper After Each print Checkbox
			if(kpt.CutPaper_After_EachPrint_CheckBox_Selected1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Cut Paper After Each print Check Box not Selected while Reopening the page After Saved");					
				
			}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Cut Paper After Each print Check Box Selected while Reopening the page After Saved");
		}
	}
	
	@And("I Click the Update button in Kitchen printer Template")
	public void UpdateKitchenPrinterTemplate() 
	{
		driver.findElement(By.xpath("//button[.=' UPDATE ']")).click();
	}


}
