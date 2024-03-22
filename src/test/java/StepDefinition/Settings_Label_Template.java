package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Label_TemplatePage;
import com.Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_Label_Template 
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage();

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Label_TemplatePage ltp = new Label_TemplatePage();

	@Given("Open Label Template home page BaseURL and StoreID")
	public void OpenLabelTemplateHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"labelTemplate");
	}

	@Given("Verifying the Label Template Header Page")
	public void verifyingTheLabelTemplateHeaderPage() 
	{
		if(ltp.Label_TemplateHeader().isDisplayed())
		{
			test.log(LogStatus.PASS, "Label Template Page Loaded Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Label Template Page Loading Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Check Epson Box Label Template Displayed or Not")
	public void checkEpsonBoxLabelTemplateDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.EpsonBox_LabelTemplateTab,"Epson Box Label Template Tab");
	}
	@Given("Check Zebra Box Label Template Displayed or Not")
	public void checkZebraBoxLabelTemplateDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Zebra_LabelTemplateTab,"Zebra Box Label Template Tab");
	}
	@Given("Check Kitchen box Label Template Displayed or Not")
	public void checkKitchenBoxLabelTemplateDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Kitchen_LabelTemplateTab,"Kitchen Box Label Template Tab");
	}
	@Given("Check SKU Code Label Template Displayed or Not")
	public void checkSKUCodeLabelTemplateDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.SKU_CodeLabelTemplate,"SKU Code Label Template Tab");
	}

	@Then("Click on Epson Box Label Template")
	public void clickOnEpsonBoxLabelTemplate() 
	{
		ltp.Click_EpsonBox_LabelTemplate();
	}

	@Then("Verify Select Template Dropdown is Displayed or Not")
	public void verifySelectTemplateDropdownIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Select_TemplateInputBox,"Select Template Dropdown");
	}
	@Then("Verify Width Input Field is Displayed or Not")
	public void verifyWidthInputFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Width_InputBox,"Width Input Box");
	}
	@Then("Verify Height Input Field is Displayed or Not")
	public void verifyHeightInputFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Height_InputBox,"Height Input Box");
	}
	@Then("Verify Enable Auto Cut Checkbox is Displayed or Not")
	public void verifyEnableAutoCutCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Enable_Autocut_ChkBox,"Enable Autocut Checkbox");
	}
	@Then("Verify Font Options Field is Displayed or Not")
	public void verifyFontOptionsFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.FontOptions_ArrowRightBtn,"Font Options Field");
	}

	@Given("Open Font Options Field")
	public void openFontOptionsField() throws Exception 
	{
		ltp.Open_FontOptions_Screen();
	}
	@Then("Verify Check and Date input Field is Displayed or Not")
	public void verifyCheckAndDateInputFieldIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Check_Date_InputBox,"Check and Date Input Box");
	}
	@Then("Verify Business Name input Field is Displayed or Not")
	public void verifyBusinessNameInputFieldIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Business_Name_InputBox,"Business Name Input Box");
	}
	@Then("Verify Menu Item Name input Field is Displayed or Not")
	public void verifyMenuItemNameInputFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Menu_ItemName_InputBox,"Menu Item Name Input Box");
	}
	@Then("Verify Modifiers input Field is Displayed or Not")
	public void verifyModifiersInputFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Modifiers_InputBox,"Modifiers Input Box");
	}
	@Then("Verify Delivery Notes Field is Displayed or Not")
	public void verifyDeliveryNotesFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Delivery_Notes_InputBox,"Delivery Notes Input Box");
	}

	@Then("Verify Customer Info Field in Font Options is Displayed or Not")
	public void CustomerInfoFieldIsDisplayedorNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.CstomerInfo_InputBox,"Customer Info Input Box");
	}
	@Then("Close Font Options Field")
	public void closeFontOptionsField() throws Exception 
	{
		for(int i=1;i<=6;i++) 
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}

		ltp.Close_FontOptions_Screen();
	}

	@Given("Click on Template Dropdown")
	public void clickOnTemplateDropdown() throws Exception 
	{
		for(int i=1;i<=10;i++) 
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		Thread.sleep(2000);
		ltp.Select_TemplateInputBox.click();
	}
	@Then("Select Template one From dropdown")
	public void selectTemplateOneFromDropdown() 
	{
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/select-option")).click();
	}
	@Then("Save Label Template")
	public void saveLabelTemplate()
	{
		driver.findElement(By.xpath("//button[.=' SAVE ']")).click();
	}
	@Then("Verify Epson Box Label Template Saved or Not")
	public void verifyEpsonBoxLabelTemplateSavedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the Label Template Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Delivery Label Template Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Label Template Saved Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Label Template Save Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Select Template two From dropdown")
	public void selectTemplateTwoFromDropdown()
	{
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[2]/select-option")).click();
	}
	@Then("Select Template three From dropdown")
	public void selectTemplateThreeFromDropdown()
	{
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[3]/select-option")).click();
	}

	@Given("Enter width less than three")
	public void enterWidthLessThanThree() 
	{
		ltp.Enter_Width("2");
	}
	@Then("Verify Minimum width is {int} and Maximum width is {int} Error Message")
	public void verifyMinimumWidthIsAndMaximumWidthIsErrorMessage(Integer int1, Integer int2) 
	{
		//Verify whether the Min and Max Error Msg Displayed or not
		ltp.Verify_Width_ErrorMsg();
	}
	@Then("Enter Width More than four")
	public void enterWidthMoreThanFour()
	{
		ltp.Enter_Width("5");
	}

	@Given("Enter Height less than {double}")
	public void enterHeightLessThan(Double double1) 
	{
		ltp.Enter_Height("2");
	}
	@Then("Verify Minimum height is {double} and Maximum height is {int} Error Message")
	public void verifyMinimumHeightIsAndMaximumHeightIsErrorMessage(Double double1, Integer int1) 
	{
		//Verify whether the Min and Max Error Msg Displayed or not
		ltp.Verify_Height_ErrorMsg();
	}
	@Then("Enter Height More than three")
	public void enterHeightMoreThanThree()
	{
		ltp.Enter_Height("4");
	}

	@Given("Enter Valid Width")
	public void enterValidWidth()
	{
		ltp.Enter_Width("4");
	}
	@Given("Enter Valid Height")
	public void enterValidHeight() 
	{
		ltp.Enter_Height("3");
	}
	@Given("Check Enable AutoCut Checkbox")
	public void checkEnableAutoCutCheckbox()
	{
		ltp.Select_Enable_Autocut_CheckBox();
	}

	@Then("Select Check and Date From Dropdown")
	public void selectCheckAndDateFromDropdown() throws Exception 
	{
		Thread.sleep(1000);
		//Select the Check & Date Font
		ltp.Select_Check_Date_Option();
	}
	@Then("Select Business Name From Dropdown")
	public void selectBusinessNameFromDropdown() throws Exception 
	{
		Thread.sleep(1000);
		//Select the Font for Business Name
		ltp.Select_Business_Name_Option();
	}
	@Then("Select Menu Item Name From Dropdown")
	public void selectMenuItemNameFromDropdown() throws Exception 
	{
		Thread.sleep(1000);
		//Select Menu Item Name Font
		ltp.Select_MenuItem_Name_Option();
	}
	@Then("Select Modifiers From Dropdown")
	public void selectModifiersFromDropdown() throws Exception 
	{
		Thread.sleep(1000);
		//Select Modifiers Font
		ltp.Select_Modifiers_Option();
	}
	@Then("Select Customer Info From Dropdown")
	public void selectCustomerInfoFromDropdown() throws Exception 
	{
		Thread.sleep(2000);
		//Select Customer Info Font
		ltp.Select_CustomerInfo_EpsonBox_Option();
	}

	@Given("Click on Zebra Box Label Template")
	public void clickOnZebraBoxLabelTemplate() 
	{
		ltp.Click_Zebra_LabelTemplate();
	}

	@Then("Verify Check Details Field is Displayed or Not")
	public void verifyCheckDetailsFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.CheckDetails_ArrowRightBtn,"Check Details Field");
	}
	@Then("Verify Menu Item Info Field is Displayed or Not")
	public void verifyMenuItemInfoFieldIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.MenuItem_Info_ArrowRightBtn,"Menu Item Info Field");
	}
	@Then("Verify Order Summary Filed is Displayed or Not")
	public void verifyOrderSummaryFiledIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Order_Summary_ArrowRightBtn,"Order Summary Field");
	}

	@Given("Open Check Details Field")
	public void openCheckDetailsField() throws Exception 
	{
		ltp.Open_CheckDetails_Screen();
	}
	@Then("Verify Business Name Checkbox is Displayed or Not")
	public void verifyBusinessNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Business_Name_CheckDetails_ChkBox,"Business Name Checkbox");
	}
	@Then("Verify Date and Time Checkbox is Displayed or Not")
	public void verifyDateAndTimeCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Date_Time_CheckDetails_ChkBox,"Date and Time Checkbox");
	}
	@Then("Verify Menu Item Number Checkbox is Displayed or Not")
	public void verifyMenuItemNumberCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.MenuItem_Number_CheckDetails_ChkBox,"Menu Item Number Checkbox");
	}
	@Then("Verify Order Type Checkbox is Dispalyed or Not")
	public void verifyOrderTypeCheckboxIsDispalyedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Order_Type_CheckDetails_ChkBox,"Order Type Checkbox");
	}
	@Then("Verify Pay Status Checkbox is Dispalyed or Not")
	public void verifyPayStatusCheckboxIsDispalyedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.PayStatus_CheckDetails_ChkBox,"Pay Status Checkbox");
	}
	@Then("Verify Check Details Checkbox is Displayed or Not")
	public void verifyCheckDetailsCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.CheckDetails_CheckDetails_ChkBox,"Check Details Checkbox");
	}
	@Then("Verify Order Type & Pay Status Checkbox is Displayed or Not")
	public void verifyOrderTypePayStatusCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Order_Type_CheckDetails_ChkBox,"Order Type Checkbox");
	}
	@Then("Verify Business Name Dropdown Field is Displayed or Not")
	public void verifyBusinessNameDropdownFieldIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Business_Name_InputBox,"Business Name Dropdown");
	}
	@Then("Verify Check Details Dropdown Field is Displayed or Not")
	public void verifyCheckDetailsDropdownFieldIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.CheckDetails_Font_InputBox,"Check Details Dropdown");
	}
	@Then("Verify Order Type and Pay Status Field is Displayed or Not")
	public void verifyOrderTypeAndPayStatusFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.OrderType_PayStatus_InputBox,"Order Type and Pay Status Dropdown");
	}
	@Then("Close Check Details Field")
	public void closeCheckDetailsField() throws Exception 
	{
		ltp.Close_CheckDetails_Screen();
	}

	@Given("Open Menu Item Info Field")
	public void openMenuItemInfoField() throws Exception 
	{
		ltp.Open_MenuItem_Info_Screen();
	}
	@Then("Verify Menu Item Name Checkbox is Displayed or Not")
	public void verifyMenuItemNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.MenuItem_Name_MenuItemInfo_ChkBox,"Menu Item Name Checkbox");
	}
	@Then("Verify Menu Item Serving Size Checkbox is Displayed or Not")
	public void verifyMenuItemServingSizeCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.MenuItem_ServingSize_MenuItemInfo_ChkBox,"Menu Item Serving Size Checkbox");
	}
	@Then("Verify Modifiers Checkbox is Displayed or Not")
	public void verifyModifiersCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Modifiers_MenuItemInfo_ChkBox,"Modifiers Checkbox");
	}
	@Then("Verify Item Notes Checkbox is Displayed or Not")
	public void verifyItemNotesCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.ItemNotes_MenuItemInfo_ChkBox,"Item Notes Checkbox");
	}
	@Then("Verify Bottom Divider Checkbox is Displayed or Not")
	public void verifyBottomDividerCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.BottomDivider_MenuItemInfo_ChkBox,"Bottom Divider Checkbox");
	}
	@Then("Verify Item Name and Serving Size dropdown is Displayed or Not")
	public void verifyItemNameAndServingSizeDropdownIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.ItemName_ServingSize_MenuItemInfoInputBox,"Item Name and Serving Size Dropdown");
	}
	@Then("Verify Modifiers and Notes Dropdown is Displayed or Not")
	public void verifyModifiersAndNotesDropdownIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Modifiers_Notes_MenuItemInfoInputBox,"Modifiers and Notes Dropdown");
	}
	@Then("Close Menu Item Info Field")
	public void closeMenuItemInfoField() throws Exception
	{
		ltp.Close_MenuItem_Info_Screen();
	}

	@Given("Open Customer Info Field")
	public void openCustomerInfoField() throws Exception 
	{
		ltp.Open_Customer_Info_Screen();
	}
	@Then("Verify Customer Address Checkbox is Displayed or Not")
	public void verifyCustomerAddressCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.CustomerAddress_CustomerInfo_ChkBox,"Customer Address Checkbox");
	}
	@Then("Verify Delivery Notes Checkbox is Displayed or Not")
	public void verifyDeliveryNotesCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.DeliveryNotes_CustomerInfo_ChkBox,"Delivery Notes Checkbox");
	}
	@Then("Verify Right Divider Checkbox is Displayed or Not")
	public void verifyRightDividerCheckboxIsDisplayedOrNot() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(ltp.RightDivider_CustomerInfo_ChkBox,"Right Divider Checkbox");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify Customer Name Dropdown is Displayed or Not")
	public void verifyCustomerNameDropdownIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.CustomerName_CustomerInfoInputBox,"Customer Name Dropdown");
	}
	@Then("Verify Customer Details Dropdown is Displayed or Not")
	public void verifyCustomerDetailsDropdownIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.CustomerDetails_CustomerInfoInputBox,"Customer Details Dropdown");
	}
	@Then("Close Customer Info Field")
	public void closeCustomerInfoField() throws Exception
	{
		ltp.Close_Customer_Info_Screen();
	}

	@Given("Open Order Summary Field")
	public void openOrderSummaryField() throws Exception 
	{
		ltp.Open_Order_Summary_Screen();
	}

	@Then("Verify SubTotal Checkbox is Displayed or Not")
	public void verifySubTotalCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.SubTotal_OrderSummaryChkBox,"Sub Total Checkbox");
	}
	@Then("Verify Discounts Checkbox is Displayed or Not")
	public void verifyDiscountsCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Discounts_OrderSummaryChkBox,"Discount Checkbox");
	}
	@Then("Verify Delivery Fee Checkbox is Displayed or Not")
	public void verifyDeliveryFeeCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.DeliveryFee_OrderSummaryChkBox,"Delivery Fee Checkbox");
	}
	@Then("Verify Tax Checkbox is Displayed or Not")
	public void verifyTaxCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Tax_OrderSummaryChkBox, "Tax Checkbox");
	}
	@Then("Verify Total Checkbox is Displayed or Not")
	public void verifyTotalCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Total_OrderSummaryChkBox, "Total Checkbox");
	}
	@Then("Verify Order Summary Dropdown is Displayed or Not")
	public void verifyOrderSummaryDropdownIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.OrderSummary_OrderSummaryInputBox, "Order Summary Dropdown");
	}
	@Then("Verify Balance Due Dropdown is Displayed or Not")
	public void verifyBalanceDueDropdownIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.BalanceDue_OrderSummaryChkBox, "Balance Due Dropdown");
	}
	@Then("Close Order Summary Field")
	public void closeOrderSummaryField() throws Exception
	{
		ltp.Close_Order_Summary_Screen();
	}

	@Then("Verify Zebra Box Label Template Saved or Not")
	public void verifyZebraBoxLabelTemplateSavedOrNot() 
	{
		try {
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Zebra Label Template Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Label Template Saved Successfully for Zebra Label Template (Selecting Font & Disable All Check)");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Label Template Save Failed for Zebra Label Template (Selecting Font & Disable All Check)");

			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Uncheck Business Name Checkbox")
	public void uncheckBusinessNameCheckbox() 
	{
		try
		{
			if(ltp.Business_Name_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.Business_Name_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("Uncheck Check Number Checkbox")
	public void uncheckCheckNumberCheckbox()
	{
		try
		{
			//Select the Check Number Font
			if(ltp.Check_Number_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.Check_Number_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l) {}

	}
	@Then("Uncheck Date and Time Checkbox")
	public void uncheckDateAndTimeCheckbox() 
	{
		try
		{
			//Select the Date & Time Font
			if(ltp.Date_Time_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.Date_Time_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Menu Item Number Checkbox")
	public void uncheckMenuItemNumberCheckbox()
	{
		try
		{
			//Thread.sleep(1000);
			//Select the Menu Item Number Font
			if(ltp.MenuItem_Number_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.MenuItem_Number_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Server Name Checkbox")
	public void uncheckServerNameCheckbox() 
	{
		try
		{
			//Select the Server Name Font
			if(ltp.Server_Name_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.Server_Name_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Order Type Checkbox")
	public void uncheckOrderTypeCheckbox() 
	{
		try
		{
			//Select the Order Type Font
			if(ltp.Order_Type_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.Order_Type_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Pay Status Checkbox")
	public void uncheckPayStatusCheckbox() 
	{
		try
		{
			//Select the Pay Status Font
			if(ltp.PayStatus_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.PayStatus_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Check Details Checkbox")
	public void uncheckCheckDetailsCheckbox()
	{
		try
		{
			//Select the Check Details Check box in Check Details screen
			if(ltp.CheckDetails_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.CheckDetails_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Order Type & Pay Status Checkbox")
	public void uncheckOrderTypePayStatusCheckbox() 
	{
		try
		{
			//Select the Order Type & Pay Status
			if(ltp.OrderType_PayStatus_CheckDetails_CheckBox_SLD().isDisplayed())
			{
				ltp.OrderType_PayStatus_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}

	@Then("Uncheck Menu Item Name Checkbox")
	public void uncheckMenuItemNameCheckbox() 
	{
		try
		{
			//Select the Menu Item Name Font
			if(ltp.MenuItem_Name_MenuItemInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.MenuItem_Name_MenuItemInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Menu Item Serving Size Checkbox")
	public void uncheckMenuItemServingSizeCheckbox() 
	{
		try
		{
			//Select the Menu Item Serving Size Font
			if(ltp.MenuItem_ServingSize_MenuItemInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.MenuItem_ServingSize_MenuItemInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}

	}
	@Then("Uncheck Modifiers Checkbox")
	public void uncheckModifiersCheckbox() 
	{
		try
		{
			//Select the Modifiers Font
			if(ltp.Modifiers_MenuItemInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.Modifiers_MenuItemInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Item Notes Checkbox")
	public void uncheckItemNotesCheckbox() 
	{
		try
		{
			//Select the Item Notes Font
			if(ltp.ItemNotes_MenuItemInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.ItemNotes_MenuItemInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Bottom Divider Checkbox")
	public void uncheckBottomDividerCheckbox() 
	{
		try
		{
			//Select the Bottom Divider Font
			if(ltp.BottomDivider_MenuItemInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.BottomDivider_MenuItemInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}

	@Then("Uncheck Customer Name Checkbox")
	public void uncheckCustomerNameCheckbox() 
	{
		try
		{
			//Select the Customer Name Font
			if(ltp.CustomerName_CustomerInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.CustomerName_CustomerInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Customer Address Checkbox")
	public void uncheckCustomerAddressCheckbox() 
	{
		try
		{
			//Select the Customer Address Font
			if(ltp.CustomerAddress_CustomerInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.CustomerAddress_CustomerInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Delivery Notes Checkbox")
	public void uncheckDeliveryNotesCheckbox() 
	{
		try
		{
			//Select the Delivery Notes Font
			if(ltp.DeliveryNotes_CustomerInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.DeliveryNotes_CustomerInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Right Divider Checkbox")
	public void uncheckRightDividerCheckbox()
	{
		try
		{
			//Select the Phone Number Font
			if(ltp.RightDivider_CustomerInfo_CheckBox_SLD().isDisplayed())
			{
				ltp.RightDivider_CustomerInfo_CheckBox().click();
			}
		}
		catch(Exception l) {}

	}

	@Then("Check SubTotal Checkbox")
	public void checkSubTotalCheckbox() 
	{
		try
		{
			//Select the Sub Total in Order Summary
			if(ltp.SubTotal_OrderSummary_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Sub Total Check Box not Selected while Reopening the page After Saved");					

				//Enable Sub Total
				ltp.SubTotal_OrderSummary_CheckBox().click();
			}
		}
		catch(Exception p)
		{
			test.log(LogStatus.FAIL, "Sub Total Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check Discounts Checkbox")
	public void checkDiscountsCheckbox() 
	{
		try
		{
			//Select the Discounts in Order Summary
			if(ltp.Discounts_OrderSummary_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Discounts Check Box not Selected while Reopening the page After Saved");					

				//Enable Discounts
				ltp.Discounts_OrderSummary_CheckBox().click();

			}
		}
		catch(Exception p)
		{
			test.log(LogStatus.FAIL, "Discounts Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();

		}
	}
	@Then("Check Delivery Fee Checkbox")
	public void checkDeliveryFeeCheckbox()
	{
		try
		{
			//Select the Delivery Fee in Order Summary
			if(ltp.DeliveryFee_OrderSummary_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Delivery Fee Check Box not Selected while Reopening the page After Saved");					

				//Enable Delivery Fee
				ltp.DeliveryFee_OrderSummary_CheckBox().click();
			}
		}
		catch (Exception e)
		{

			test.log(LogStatus.FAIL, "Delivery Fee Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}
	@Then("Check Tax Checkbox")
	public void checkTaxCheckbox() 
	{
		try
		{
			//Select the Tax in Order Summary
			if(ltp.Tax_OrderSummary_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Tax Check Box not Selected while Reopening the page After Saved");					

				//Enable Tax
				ltp.Tax_OrderSummary_CheckBox().click();

			}
		}
		catch(Exception p)
		{
			test.log(LogStatus.FAIL, "Tax Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


	@Then("Check Business Name Checkbox")
	public void checkBusinessNameCheckbox()
	{
		try
		{
			//Select the Business Name Font
			if(ltp.Business_Name_CheckDetails_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Business Name Check Box not Selected while Reopening the page After Saved");					

				//Enable Business Name
				ltp.Business_Name_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception p)
		{

			test.log(LogStatus.FAIL, "Business Name Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();

		}
	}
	@Then("Check Date and Time Checkbox")
	public void checkDateAndTimeCheckbox() 
	{
		try
		{
			//Select the Date & Time Font
			if(ltp.Date_Time_CheckDetails_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Date & Time Check Box not Selected while Reopening the page After Saved");					

				//Enable Date & Time
				ltp.Date_Time_CheckDetails_CheckBox().click();
			}
		}
		catch (Exception e) 
		{

			test.log(LogStatus.FAIL, "Date & Time Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();

		}

	}
	@Then("Check Menu Item Number Checkbox")
	public void checkMenuItemNumberCheckbox() 
	{
		try
		{
			//Select the Menu Item Number Font
			if(ltp.MenuItem_Number_CheckDetails_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Menu Item Number Check Box not Selected while Reopening the page After Saved");					

				//Enable Menu Item Number
				ltp.MenuItem_Number_CheckDetails_CheckBox().click();

			}
		}
		catch (Exception e)
		{

			test.log(LogStatus.FAIL, "Menu Item Number Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check Order Type Checkbox")
	public void checkOrderTypeCheckbox() 
	{
		try
		{
			//Select the Order Type Font
			if(ltp.Order_Type_CheckDetails_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Order Type Check Box not Selected while Reopening the page After Saved");					

				//Enable Order Type
				ltp.Order_Type_CheckDetails_CheckBox().click();


			}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.FAIL, "Order Type Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check Pay Status Checkbox")
	public void checkPayStatusCheckbox() 
	{
		try
		{
			//Select the Pay Status Font
			if(ltp.PayStatus_CheckDetails_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Pay Status Check Box not Selected while Reopening the page After Saved");					

				//Enable Pay Status
				ltp.PayStatus_CheckDetails_CheckBox().click();

			}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.FAIL, "Pay Status Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();

		}
	}
	@Then("Check Check Details Checkbox")
	public void checkCheckDetailsCheckbox() 
	{
		try
		{
			//Select the Check Details Check box in Check Details screen
			if(ltp.CheckDetails_CheckDetails_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Check Details Check Box not Selected while Reopening the page After Saved");					

				//Enable Check Details
				ltp.CheckDetails_CheckDetails_CheckBox().click();

			}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.FAIL, "Check Details Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check Order Type & Pay Status Checkbox")
	public void checkOrderTypePayStatusCheckbox() 
	{
		try
		{
			//Select the Order Type & Pay Status
			if(ltp.OrderType_PayStatus_CheckDetails_CheckBox_SLD1().isDisplayed())
			{

				test.log(LogStatus.PASS, "Order Type & Pay Status Check Box not Selected while Reopening the page After Saved");					

				//Enable Order Type & Pay Status

				ltp.OrderType_PayStatus_CheckDetails_CheckBox().click();
			}
		}
		catch(Exception l)
		{

			test.log(LogStatus.FAIL, "Order Type & Pay Status Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Select Check Details from Dropdown")
	public void selectCheckDetailsFromDropdown() 
	{
		ltp.Select_CheckDetails_Font_Option();
	}

	@Then("Check Menu Item Name Checkbox")
	public void checkMenuItemNameCheckbox() 
	{
		try
		{
			//Select the Menu Item Name Font
			if(ltp.MenuItem_Name_MenuItemInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Menu Item Name Check Box not Selected while Reopening the page After Saved");					

				//Enable Menu Item Name
				ltp.MenuItem_Name_MenuItemInfo_CheckBox().click();

			}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.FAIL, "Menu Item Name Check Box Selected while Reopening the page After Saved");					
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check Menu Item Serving Size Checkbox")
	public void checkMenuItemServingSizeCheckbox() 
	{

		try
		{
			//Select the Menu Item Serving Size Font
			if(ltp.MenuItem_ServingSize_MenuItemInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Menu Item Serving Size Check Box not Selected while Reopening the page After Saved");					

				//Enable Menu Item Serving Size
				ltp.MenuItem_ServingSize_MenuItemInfo_CheckBox().click();

			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Menu Item Serving Size Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check Modifiers Checkbox")
	public void checkModifiersCheckbox() 
	{
		try
		{
			//Select the Modifiers Font
			if(ltp.Modifiers_MenuItemInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Modifiers Check Box not Selected while Reopening the page After Saved");					


				//Enable Modifiers
				ltp.Modifiers_MenuItemInfo_CheckBox().click();

			}
		}
		catch (Exception e)
		{
			test.log(LogStatus.FAIL, "Modifiers Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}
	@Then("Check Item Notes Checkbox")
	public void checkItemNotesCheckbox() 
	{
		try
		{
			//Select the Item Notes Font
			if(ltp.ItemNotes_MenuItemInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Item Notes Check Box not Selected while Reopening the page After Saved");					

				//Enable Item Notes
				ltp.ItemNotes_MenuItemInfo_CheckBox().click();

			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Item Notes Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}

	}
	@Then("Check Bottom Divider Checkbox")
	public void checkBottomDividerCheckbox()
	{
		try
		{
			//Select the Bottom Divider Font
			if(ltp.BottomDivider_MenuItemInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Bottom Divider Check Box not Selected while Reopening the page After Saved");					

				//Enable Botton Divider
				ltp.BottomDivider_MenuItemInfo_CheckBox().click();

			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Bottom Divider Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Select Item Name and Serving Size from Dropdown")
	public void selectItemNameAndServingSizeFromDropdown() 
	{
		try
		{
			//Select the Menu Item Serving Size Font
			if(ltp.MenuItem_ServingSize_MenuItemInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Menu Item Serving Size Check Box not Selected while Reopening the page After Saved");					

				//Enable Menu Item Serving Size
				ltp.MenuItem_ServingSize_MenuItemInfo_CheckBox().click();

			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Menu Item Serving Size Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Select Modifiers and Notes from Dropdown")
	public void selectModifiersAndNotesFromDropdown() 
	{
		ltp.Select_Modifiers_Notes_MenuItemInfo_Font_Option();
	}

	@Then("Check Customer Address Checkbox")
	public void checkCustomerAddressCheckbox() 
	{
		try
		{
			//Select the Customer Address Font
			if(ltp.CustomerAddress_CustomerInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Customer Address Check Box not Selected while Reopening the page After Saved");					

				//Enable Customer Address
				ltp.CustomerAddress_CustomerInfo_CheckBox().click();

			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Customer Address Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check Delivery Notes Checkbox")
	public void checkDeliveryNotesCheckbox() 
	{
		try
		{
			//Select the Delivery Notes Font
			if(ltp.DeliveryNotes_CustomerInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Delivery Notes Check Box not Selected while Reopening the page After Saved");					

				//Enable Delivery Notes
				ltp.DeliveryNotes_CustomerInfo_CheckBox().click();

			}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Delivery Notes Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check Right Divider Checkbox")
	public void checkRightDividerCheckbox()
	{
		try
		{
			//Select the Phone Number Font
			if(ltp.RightDivider_CustomerInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Right Divider Check Box not Selected while Reopening the page After Saved");					

				//Enable Right Divider
				ltp.RightDivider_CustomerInfo_CheckBox().click();

			}
		}
		catch(Exception p)
		{

			test.log(LogStatus.FAIL, "Right Divider Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();		
		}
	}
	@Then("Select Customer Name from Dropdown")
	public void selectCustomerNameFromDropdown() 
	{
		try
		{
			//Select the Customer Name
			if(ltp.CustomerName_CustomerInfo_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Customer Name Check Box not Selected while Reopening the page After Saved");					

				//Enable Customer Name
				ltp.CustomerName_CustomerInfo_CheckBox().click();	

			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Customer Name Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Select Customer Details from Dropdown")
	public void selectCustomerDetailsFromDropdown() 
	{
		ltp.Select_CustomerDetails_CustomerInfo_Font_Option();
	}

	@Then("Uncheck SubTotal Checkbox")
	public void uncheckSubTotalCheckbox() 
	{
		try
		{
			//Select the Sub Total in Order Summary
			if(ltp.SubTotal_OrderSummary_CheckBox_SLD().isDisplayed())
			{
				ltp.SubTotal_OrderSummary_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Discounts Checkbox")
	public void uncheckDiscountsCheckbox()
	{
		try
		{
			//Select the Discounts in Order Summary
			if(ltp.Discounts_OrderSummary_CheckBox_SLD().isDisplayed())
			{
				ltp.Discounts_OrderSummary_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Delivery Fee Checkbox")
	public void uncheckDeliveryFeeCheckbox() 
	{
		try
		{
			//Select the Delivery Fee in Order Summary
			if(ltp.DeliveryFee_OrderSummary_CheckBox_SLD().isDisplayed())
			{
				ltp.DeliveryFee_OrderSummary_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Uncheck Tax Checkbox")
	public void uncheckTaxCheckbox() 
	{
		try
		{
			//Select the Tax in Order Summary
			if(ltp.Tax_OrderSummary_CheckBox_SLD().isDisplayed())
			{
				ltp.Tax_OrderSummary_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}
	@Then("Select Order Summary from Dropdown")
	public void selectOrderSummaryFromDropdown() throws Exception
	{
		Thread.sleep(1000);
		//Select Order Summary Font
		ltp.Select_OrderSummary_OrderSummary_Font_Option();
	}
	@Then("Select Balance Due from Dropdown")
	public void selectBalanceDueFromDropdown() throws Exception 
	{
		Thread.sleep(1000);
		//Select Balance Due Font
		ltp.Select_BalanceDue_OrderSummary_Font_Option();
	}

	@Given("Click on Kitchen Box Lable Template")
	public void clickOnKitchenBoxLableTemplate() 
	{
		ltp.Kitchen_LabelTemplateTab.click();
	}
	@Then("Verify Order Number Checkbox is Displayed or Not")
	public void verifyOrderNumberCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.OrderNumber_KitchenLabelChkBox, "Order Number Checkbox");
	}
	@Then("Verify Order Type Checkbox is Displayed or Not")
	public void verifyOrderTypeCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Order_Type_CheckDetails_ChkBox, "Order Type Checkbox");
	}
	@Then("Verify Sale Number Checkbox is Displayed or Not")
	public void verifySaleNumberCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.SaleNumber_KitchenLabelChkBox, "Sale Number Checkbox");
	}

	@Then("Verify Check Details Dropdown is Displayed or Not")
	public void verifyCheckDetailsDropdownIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.CheckDetails_Font_InputBox, "Check Deatils Dropdown");
	}

	@Then("Verify Menu Item Name Bottom Divider Checkbox is Displayed or Not")
	public void verifyMenuItemNameBottomDividerCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.MenuItem_Name_BottomDivider_KitchenLabelChkBox, "Menu Item Name and Bottom Divider Checkbox");
	}
	@Then("Verify Item Name dropdown is Displayed or Not")
	public void verifyItemNameDropdownIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Item_Name_FontSize_KitchenLabelInputBox, "Item Name Dropdown");
	}
	@Then("Verify Modifiers Dropdown is Displayed or Not")
	public void verifyModifiersDropdownIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Modifiers_FontSize_KitchenLabelInputBox, "Modifiers Dropdown");
	}


	@Then("Uncheck Order Number Checkbox")
	public void uncheckOrderNumberCheckbox() 
	{
		try
		{
			//Select the Sale Number
			if(ltp.SaleNumber_KitchenLabel_CheckBox_SLD().isDisplayed())
			{
				ltp.SaleNumber_KitchenLabel_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}

	@Then("Uncheck Sale Number Checkbox")
	public void uncheckSaleNumberCheckbox() 
	{
		try
		{
			//Select the Order Number Font
			if(ltp.OrderNumber_KitchenLabel_CheckBox_SLD().isDisplayed())
			{
				ltp.OrderNumber_KitchenLabel_CheckBox().click();
			}
		}
		catch(Exception p) {}
	}

	@Then("Verify Kitchen Box Label Template Saved or Not")
	public void verifyKitchenBoxLabelTemplateSavedOrNot() throws Exception 
	{
		try {
		Thread.sleep(3000);
		//Check whether the Label Template Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Kitchen Label Template Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Label Template Saved Successfully for Kitchen Label Template (Selecting Font & Disable All Check)");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Label Template Save Failed for Kitchen Label Template (Selecting Font & Disable All Check)");

			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}


	@Then("Uncheck Menu Item Name Bottom Divider Checkbox")
	public void uncheckMenuItemNameBottomDividerCheckbox() 
	{
		try
		{
			//Select the Menu Item Name Bottom Divider
			if(ltp.MenuItem_Name_BottomDivider_KitchenLabel_CheckBox_SLD().isDisplayed())
			{
				ltp.MenuItem_Name_BottomDivider_KitchenLabel_CheckBox().click();
			}
		}
		catch(Exception l) {}
	}


	@Then("Check Order Number Checkbox")
	public void checkOrderNumberCheckbox() {
		try
		{
			//Select the Order Number in Kitchen Label
			if(ltp.OrderNumber_KitchenLabel_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Order Number Check Box not Selected while Reopening the page After Saved");					

				//Enable Order Number
				ltp.OrderNumber_KitchenLabel_CheckBox().click();
			}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Order Number Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Check Sale Number Checkbox")
	public void checkSaleNumberCheckbox()
	{
		try
		{
			//Select the Sale Number
			if(ltp.SaleNumber_KitchenLabel_CheckBox_SLD1().isDisplayed())
			{
				test.log(LogStatus.PASS, "Sale Number Check Box not Selected while Reopening the page After Saved");					

				//Enable Sale Number
				ltp.SaleNumber_KitchenLabel_CheckBox().click();

			}
		}
		catch(Exception p)
		{
			test.log(LogStatus.FAIL, "Sale Number Check Box Selected while Reopening the page After Saved");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Select Item Name from Dropdown")
	public void selectItemNameFromDropdown() 
	{
		ltp.Select_Item_Name_FontSize_KitchenLabel_Font_Option();
	}

	@Given("Click on SKU Code Label Template")
	public void clickOnSKUCodeLabelTemplate() 
	{
		ltp.SKU_CodeLabelTemplate.click();
	}

	@Then("Verify Select Label Size Dropdown is Displayed or Not")
	public void verifySelectLabelSizeDropdownIsDisplayedOrNot() throws Exception
	{

		cmp.Check_Element_or_Text_Displayed(ltp.Select_LabelSize_Input, "Label Size Dropdown");
	}

	@Then("Select Template Type as Inventory Label")
	public void selectTemplateTypeAsInventoryLabel()
	{
		driver.findElement(By.xpath("(//div[.='Inventory Label'])[1]")).click();
	}
	@Then("Select Label Size From Dropdown")
	public void selectLabelSizeFromDropdown() throws Exception
	{
		ltp.Select_LabelSize_Input.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/select-option")).click();
	}

	@Then("Verify SKU Code Checkbox is Displayed or Not")
	public void verifySKUCodeCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.SKU_Code_Checkbox, "SKU Code Checkbox");
	}

	@Then("Uncheck SKU Code Checkbox")
	public void uncheckSKUCodeCheckbox()
	{
		ltp.SKU_Code_Checkbox.click();
	}

	@Then("Verify SKU Code Label Template Saved or Not")
	public void verifySKUCodeLabelTemplateSavedOrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the Label Template Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("SKU Code Label Template Saved Successfully"))
		{
			test.log(LogStatus.PASS, "SKU Code Label Template Saved Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "SKU Code Label Template Save Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	@Then("Check SKU Code Checkbox")
	public void checkSKUCodeCheckbox()
	{
		ltp.SKU_Code_Checkbox.click();
	}
	@Then("Select Font Size from Dropdown")
	public void selectFontSizeFromDropdown() throws Exception 
	{
		driver.findElement(By.xpath("//label[contains(.,' Font Size ')]/../../input")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/select-option")).click();
	}

	@Then("Select Template Type as Shelf Label")
	public void selectTemplateTypeAsShelfLabel() 
	{
		driver.findElement(By.xpath("(//div[.='Shelf Label'])[1]")).click();
	}

	@Then("Select Template Type as Product Item")
	public void selectTemplateTypeAsProductItem()
	{
		driver.findElement(By.xpath("(//div[.='Product Label'])[1]")).click();
	}

	@Then("Select Template Type as Price Label")
	public void selectTemplateTypeAsPriceLabel()
	{
		driver.findElement(By.xpath("(//div[.='Price Label'])[1]")).click();
	}

	@Then("Verify Item Name Checkbox is Displayed or Not")
	public void verifyItemNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Item_name_Checkbox, "Item Name Checkbox");
	}
	@Then("Verify Price Checkbox is Displayed or Not")
	public void verifyPriceCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Price_Checkbox, "Price Checkbox");
	}
	@Then("Verify BarCode Checkbox is Displayed or Not")
	public void verifyBarCodeCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ltp.Barcode_Checkbox, "BarCode Checkbox");
	}
	@Then("Uncheck Item Name Checkbox")
	public void uncheckItemNameCheckbox()
	{
		ltp.Item_name_Checkbox.click();
	}
	@Then("Uncheck Price Checkbox")
	public void uncheckPriceCheckbox()
	{
		ltp.Price_Checkbox.click();
	}
	@Then("Uncheck BarCode Checkbox")
	public void uncheckBarCodeCheckbox()
	{
		ltp.Barcode_Checkbox.click();
	}

	@Then("Check Item Name Checkbox")
	public void checkItemNameCheckbox() 
	{
		ltp.Item_name_Checkbox.click();
	}
	@Then("Check Price Checkbox")
	public void checkPriceCheckbox() 
	{
		ltp.Price_Checkbox.click();
	}
	@Then("Check BarCode Checkbox")
	public void checkBarCodeCheckbox() 
	{
		ltp.Barcode_Checkbox.click();
	}

	@Given("Click on SKU Code Template Dropdown")
	public void ClickSKUCodeTemplateDropdown() 
	{
		ltp.SKU_SelectTemplateInputBox.click();
	}

	@Then("Verify Select Template Dropdown in SKU Code is Displayed or Not")
	public void VerifySKUCodeTemplateDropdownDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ltp.SKU_SelectTemplateInputBox, "SKU Select Template Input Box");
	}

	@Given("Enter width less than Zero")
	public void EnterWidthLessThanZero() 
	{
		ltp.Enter_Width("0");
	}

	@Then("Verify Minimum width is one and Maximum width is four Error Message")
	public void VerifyWidthErrorMessage() 
	{
		if(driver.findElement(By.xpath("//div[.='Minimum width is 1 and Maximum width is 4']")).isDisplayed()) 
		{

			test.log(LogStatus.PASS, "Minimum Width is 1 and Maximum Width is 4 Error Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Minimum Width is 1 and Maximum Width is 4 Error not displayed");
		}
	}
    
	@Given("Enter Height less than Zero")
	public void EnterHeightZero()
	{
		ltp.Enter_Height("0");
	}
	
	@And("Enter Height More than Six")
	public void EnterHeightSix() 
	{
		ltp.Enter_Height("7");
	}
	
	@Then("Verify Minimum height is one and Maximum height is six Error Message")
	public void VerifyHeightErrorMessage()
	{
		if(driver.findElement(By.xpath("//div[.='Minimum height is 1 and Maximum height is 6']")).isDisplayed()) 
		{

			test.log(LogStatus.PASS, "Minimum Height is 1 and Maximum Height is 6 Error Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Minimum Height is 1 and Maximum Height is 6 Error not displayed");
		}
	}
	
	@Then("Verify Minimum width is one and Maximum width is four Error Message in Zebra")
	public void VerifyWidthErrorMessageInZebra()
	{
		if(driver.findElement(By.xpath("//div[.='Minimum width is 2 and waximum width is 4']")).isDisplayed()) 
		{

			test.log(LogStatus.PASS, "Minimum Width is 2 and Maximum Width is 4 Error Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Minimum Width is 2 and Maximum Width is 4 Error not displayed");
		}
	}
	
	@Then("Verify Minimum height is one and Maximum height is Three Error Message in Zebra")
	public void VerifyHeightErrorMessageInZebra() 
	{
		if(driver.findElement(By.xpath("//div[.='Minimum height is 1 and Maximum height is 3']")).isDisplayed()) 
		{

			test.log(LogStatus.PASS, "Minimum Height is 1 and Maximum Height is 3 Error Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Minimum Height is 1 and Maximum Height is 3 Error not displayed");
		}
	}

}
