package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_Email_Receipt_Template_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_Email_Receipt_Template 
{
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Email_Receipt_Template_Page ert = new Settings_Email_Receipt_Template_Page();

	@Given("Open Email Receipt Template home page BaseURL and StoreID")
	public void openEmailReceiptTemplateHomePageBaseURLAndStoreID() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"emailReceiptTemplate");
	}

	@Given("Verifying the Email Receipt Template Header Page")
	public void verifyingTheEmailReceiptTemplateHeaderPage() 
	{
		if(ert.EmailTemplateHeader.isDisplayed())
		{
			test.log(LogStatus.PASS, "Email Receipt Template Page Loaded Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Email Receipt Template Page Loading Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Check Store Information Field is Displayed or Not")
	public void checkStoreInformationFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Store_Inform,"Store Information Tab");
	}
	@Then("Check Check Details Field is Displayed or Not")
	public void checkCheckDetailsFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Check_Details,"Check Details Field");
	}
	@Then("Check Order Summary Field is Displayed or Not")
	public void checkOrderSummaryFieldIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.Order_Summary,"Order Summary Field");
	}
	@Then("Check Additional Details Field is Displayed or Not")
	public void checkAdditionalDetailsFieldIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.additional_Details,"Additional Details Field");
	}

	@Given("Open Store Information Field")
	public void openStoreInformationField() 
	{
	   ert.Store_Inform.click();
	}
	@Then("Verify Address Checkbox is Displayed or Not")
	public void verifyAddressCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Address,"Address Checkbox");
	}
	@Then("Verify Store Logo Checkbox is Displayed or Not")
	public void verifyStoreLogoCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.Store_Logo,"Store Logo Checkbox");
	}
	@Then("Verify Logo URL Link Input Field is Displayed or Not")
	public void verifyLogoURLLinkInputFieldIsDisplayedOrNot() throws Exception
	{
		try {
		cmp.Check_Element_or_Text_Displayed(ert.StoreLogo_Text,"Store Logo URL Link Input");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Close Store Information Field")
	public void closeStoreInformationField()
	{
	  ert.Store_Inform.click();
	}

	@Then("UnCheck Store Name Checkbox")
	public void unCheckStoreNameCheckbox() 
	{
		try
		{
			if(ert.Store_Name_Checkbox_SLD.isDisplayed())
			{
				ert.Store_Name.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Email Checkbox")
	public void unCheckEmailCheckbox() 
	{
		try
		{
			if(ert.Email_CheckBox_SLD.isDisplayed())
			{
				ert.Email.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Address Checkbox")
	public void unCheckAddressCheckbox() 
	{
		try
		{
			if(ert.Address_Checkbox_SLD.isDisplayed())
			{
				ert.Address.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Phone Number Checkbox")
	public void unCheckPhoneNumberCheckbox() 
	{
		try
		{
			if(ert.PhoneNumber_Checkbox_SLD.isDisplayed())
			{
				ert.phone_Number.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Store Logo Checkbox")
	public void unCheckStoreLogoCheckbox()
	{
		try
		{
			if(ert.StoreLogo_Checkbox_SLD.isDisplayed())
			{
				ert.Store_Logo.click();
			}
		}
		catch(Exception l)
		{}
	}
	
	
	@Then("Save Email Receipt Template")
	public void saveEmailReceiptTemplate()
	{
	   driver.findElement(By.xpath("//button[.='SAVE']")).click();
	}
	@Then("Verify Email Receipt Template Saved or Not")
	public void verifyEmailReceiptTemplateSavedOrNot() 
	{
		try {
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Email Receipt Template Saved Successfully")) 
		{
			test.log(LogStatus.PASS, "Email Receipt Template saved successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Email Receipt Template saving failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Check Store Name Checkbox")
	public void checkStoreNameCheckbox()
	{
	    //Enable Sub Total
		ert.Store_Name.click();
		
	}
	@Then("Check Store Logo Checkbox")
	public void checkStoreLogoCheckbox() 
	{
	   ert.Store_Logo.click();
	}
	@Then("Enter Logo URL Link")
	public void enterLogoURLLink() throws Exception 
	{
		try {
	   ert.StoreLogo_Text.clear();
	   Thread.sleep(500);
	   ert.StoreLogo_Text.sendKeys("www.google.com");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Verify Table No Checkbox is Displayed or Not")
	public void verifyTableNoCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Table_No,"Table No Checkbox");
	}
	@Then("Verify Date & Time Checkbox is Displayed or Not")
	public void verifyDateTimeCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Date_Time,"Date and Time Checkbox");
	}
	@Then("Verify Seat Number Checkbox is Displayed or Not")
	public void verifySeatNumberCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.Seat_Number,"Seat Number Checkbox");
	}




	@Then("UnCheck Table No Checkbox")
	public void unCheckTableNoCheckbox() 
	{
		try
		{
			if(ert.Table_No_Checkbox_SLD.isDisplayed())
			{
				ert.Table_No.click();
			}
		}
		catch(Exception l)
		{}
	}
	

	@Then("Check Table No Checkbox")
	public void checkTableNoCheckbox() 
	{
		ert.Table_No.click();
	}
	@Then("Check Date & Time Checkbox")
	public void checkDateTimeCheckbox() 
	{
	  ert.Date_Time.click();
	}
	@Then("Check Seat Number Checkbox")
	public void checkSeatNumberCheckbox()
	{
	   ert.Seat_Number.click();
	}



	@Then("UnCheck Date & Time Checkbox")
	public void unCheckDateTimeCheckbox() 
	{
		try
		{
			if(ert.Date_Time_Checkbox_SLD.isDisplayed())
			{
				ert.Date_Time.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Seat Number Checkbox")
	public void unCheckSeatNumberCheckbox() 
	{
		try
		{
			if(ert.Seat_Number_Checkbox_SLD.isDisplayed())
			{
				ert.Seat_Number.click();
			}
		}
		catch(Exception l)
		{}
	}

	@Then("Verify Oder Summary Checkbox is Displayed or Not")
	public void verifyOderSummaryCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.order_summary_Checkbox,"Order Summary Checkbox");
	}
	@Then("Verify Roll Out Modifier Price To Menu Checkbox is Displayed or Not")
	public void verifyRollOutModifierPriceToMenuCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Roll_Out_Modifier_Price,"Roll Out Modifier Price Checkbox");
	}
	@Then("Verify Exclude Zero Price Modifier Checkbox is Displayed or Not")
	public void verifyExcludeZeroPriceModifierCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Exclude_Zero_Price_Modifier,"Exclude Zero Price Modifier Checkbox");
	}
	@Then("Verify Discount Under the Menu Item Checkbox is Displayed or Not")
	public void verifyDiscountUnderTheMenuItemCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Menu_Item_Discount,"Discount Under Menu Item Checkbox");
	}
	@Then("Verify Secondary Menu Name Checkbox is Displayed or Not")
	public void verifySecondaryMenuNameCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Secondary_Menu_Name,"Secondary Menu Name Checkbox");
	}
	@Then("Verify Secondary Modifier Name Checkbox is Displayed or Not")
	public void verifySecondaryModifierNameCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.Secondary_Modifier_Name,"Secondary Modifier Name Checkbox");
	}
	@Then("Verify Exclude Zero Price Menu Item Checkbox is Displayed or Not")
	public void verifyExcludeZeroPriceMenuItemCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Exclude_Zero_Price_Modifier,"Exclude Zero Price Modifier Checkbox");
	}
	@Then("Verify Tax Summary Checkbox is Displayed or Not")
	public void verifyTaxSummaryCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.Tax_Summary,"Tax Summary Checkbox");
	}
	@Then("Verify Check Total Checkbox is Displayed or Not")
	public void verifyCheckTotalCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Check_Total,"Check Total Checkbox");
	}
	@Then("Verify Tender Details Checkbox is Displayed or Not")
	public void verifyTenderDetailsCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Tender_Details,"Tender Details Checkbox");
	}

	@Then("UnCheck Oder Summary Checkbox")
	public void unCheckOderSummaryCheckbox() 
	{
		try
		{
			if(ert.Order_SummaryCheckbox_SLD.isDisplayed())
			{
				ert.Order_Summary.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Roll Out Modifier Price To Menu Checkbox")
	public void unCheckRollOutModifierPriceToMenuCheckbox() {
		try
		{
			if(ert.Roll_Out_Modifier_Price_CheckBox_SLD.isDisplayed())
			{
				ert.Roll_Out_Modifier_Price.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Exclude Zero Price Modifier Checkbox")
	public void unCheckExcludeZeroPriceModifierCheckbox()
	{
		try
		{
			if(ert.Exclude_Zero_Price_Modifier_SLD.isDisplayed())
			{
				ert.Exclude_Zero_Price_Modifier.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Discount Under the Menu Item Checkbox")
	public void unCheckDiscountUnderTheMenuItemCheckbox()
	{
		try
		{
			if(ert.Menu_Item_Discount_Checkbox_SLD.isDisplayed())
			{
				ert.Menu_Item_Discount.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Secondary Menu Name Checkbox")
	public void unCheckSecondaryMenuNameCheckbox()
	{
		try
		{
			if(ert.Secondary_Menu_Name_SLD.isDisplayed())
			{
				ert.Secondary_Menu_Name.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Secondary Modifier Name Checkbox")
	public void unCheckSecondaryModifierNameCheckbox()
	{
		try
		{
			if(ert.Secondary_Modifier_Name.isSelected())
			{
				ert.Secondary_Modifier_Name.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Exclude Zero Price Menu Item Checkbox")
	public void unCheckExcludeZeroPriceMenuItemCheckbox()
	{
		try
		{
			if(ert.Exclude_Zero_Price_Menu_SLD.isDisplayed())
			{
				ert.Exclude_Zero_Price_Menu.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Tax Summary Checkbox")
	public void unCheckTaxSummaryCheckbox() 
	{
		try
		{
			if(ert.Tax_Summary_Checkbox_SLD.isDisplayed())
			{
				ert.Tax_Summary.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Check Total Checkbox")
	public void unCheckCheckTotalCheckbox() 
	{
		try
		{
			if(ert.Tax_Summary_Checkbox_SLD.isDisplayed())
			{
				ert.Tax_Summary.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Tip Checkbox")
	public void unCheckTipCheckbox() 
	{
		try
		{
			if(ert.Tip_Checkbox_SLD.isDisplayed())
			{
				ert.Tip.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Tender Details Checkbox")
	public void unCheckTenderDetailsCheckbox() 
	{
		try
		{
			if(ert.Tender_Details_Checkbox_SLD.isDisplayed())
			{
				ert.Tender_Details.click();
			}
		}
		catch(Exception l)
		{}
	}

	@Then("Check Oder Summary Checkbox")
	public void checkOderSummaryCheckbox() 
	{
	  ert.order_summary_Checkbox.click();
	}
	@Then("Check Roll Out Modifier Price To Menu Checkbox")
	public void checkRollOutModifierPriceToMenuCheckbox()
	{
	   ert.Roll_Out_Modifier_Price.click();
	}
	@Then("Check Exclude Zero Price Modifier Checkbox")
	public void checkExcludeZeroPriceModifierCheckbox() 
	{
	    ert.Exclude_Zero_Price_Modifier.click();
	}
	@Then("Check Discount Under the Menu Item Checkbox")
	public void checkDiscountUnderTheMenuItemCheckbox()
	{
	   ert.Menu_Item_Discount.click();
	}
	@Then("Check Secondary Menu Name Checkbox")
	public void checkSecondaryMenuNameCheckbox() 
	{
	   ert.Secondary_Menu_Name.click();
	}
	@Then("Check Secondary Modifier Name Checkbox")
	public void checkSecondaryModifierNameCheckbox() 
	{
	   ert.Secondary_Modifier_Name.click();
	}
	@Then("Check Exclude Zero Price Menu Item Checkbox")
	public void checkExcludeZeroPriceMenuItemCheckbox() 
	{
	   ert.Exclude_Zero_Price_Menu.click();
	}
	@Then("Check Tax Summary Checkbox")
	public void checkTaxSummaryCheckbox()
	{
	   ert.Tax_Summary.click();
	}
	@Then("Check Check Total Checkbox")
	public void checkCheckTotalCheckbox() 
	{
	    ert.Check_Total.click();
	}
	@Then("Check Tender Details Checkbox")
	public void checkTenderDetailsCheckbox() 
	{
	   ert.Tender_Details.click();
	}


	@Given("Open Additional Details Field")
	public void openAdditionalDetailsField() 
	{
	    ert.Click_Additional_Details();
	}
	@Then("Verify Include Card Details Checkbox is Displayed or Not")
	public void verifyIncludeCardDetailsCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.Card_Details,"Include Card Details Checkbox");
	}
	@Then("Verify Barcode Checkbox is Displayed or Not")
	public void verifyBarcodeCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.BarCode,"BarCode Checkbox");
	}
	@Then("Verify Powered by LINGA Checkbox is Displayed or Not")
	public void verifyPoweredByLINGACheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Powered_By,"Powered By Linga Checkbox");
	}
	@Then("Verify Social Icons Checkbox is Displayed or Not")
	public void verifySocialIconsCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(ert.Social_Icon,"Social Icon Checkbox");
	}
	@Then("Verify Facebook link Input Field is Displayed or Not")
	public void verifyFacebookLinkInputFieldIsDisplayedOrNot() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(ert.Facebook_Text,"Facebook Link Input Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify Twitter link Input Field is Displayed or Not")
	public void verifyTwitterLinkInputFieldIsDisplayedOrNot() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(ert.Twitter_Text,"Twitter Link Input Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify LinkedIn link Input Field is Displayed or Not")
	public void verifyLinkedInLinkInputFieldIsDisplayedOrNot() throws Exception 
	{
		try {
		cmp.Check_Element_or_Text_Displayed(ert.LinkedIn_Text,"LinkedIn Link Input Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Verify Customer Feedback Checkbox is Displayed or Not")
	public void verifyCustomerFeedbackCheckboxIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(ert.Customer_Feedback,"Customer Feedback Checkbox");
	}
	@Then("Verify Special Notes Checkbox is Displayed or Not")
	public void verifySpecialNotesCheckboxIsDisplayedOrNot() throws Exception 
	{
		
		cmp.Check_Element_or_Text_Displayed(ert.Special_Note,"Special Note Checkbox");
	}
	@Then("Verify Special Notes input Field is Displayed or Not")
	public void verifySpecialNotesInputFieldIsDisplayedOrNot() throws Exception
	{
		try {
		cmp.Check_Element_or_Text_Displayed(ert.Special_Note_Text,"Special Note Input Field");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Then("Close Additional Details Field")
	public void closeAdditionalDetailsField() 
	{
	   ert.additional_Details.click();
	}

	@Then("UnCheck Include Card Details Checkbox")
	public void unCheckIncludeCardDetailsCheckbox() 
	{
		try
		{
			if(ert.IncludeCardDetailsCheckbox_SLD.isDisplayed())
			{
				ert.Card_Details.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Signature Checkbox")
	public void unCheckSignatureCheckbox()
	{
		try
		{
			if(ert.SignatureCheckbox_SLD.isDisplayed())
			{
				ert.signature.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Barcode Checkbox")
	public void unCheckBarcodeCheckbox() 
	{
		try
		{
			if(ert.BarcodeCheckbox_SLD.isDisplayed())
			{
				ert.BarCode.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Powered by LINGA Checkbox")
	public void unCheckPoweredByLINGACheckbox()
	{
		try
		{
			if(ert.PoweredByLingaCheckbox_SLD.isDisplayed())
			{
				ert.Powered_By.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Social Icons Checkbox")
	public void unCheckSocialIconsCheckbox()
	{
		try
		{
			if(ert.SocialIconsCheckbox_SLD.isDisplayed())
			{
				ert.Social_Icon.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Customer Feedback Checkbox")
	public void unCheckCustomerFeedbackCheckbox() {
		try
		{
			if(ert.CustomerFeedback_Enabled.isDisplayed())
			{
				ert.Customer_Feedback.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("UnCheck Special Notes Checkbox")
	public void unCheckSpecialNotesCheckbox() 
	{
		try
		{
			if(ert.SpecialNotes_Enabled.isDisplayed())
			{
				ert.Special_Note.click();
			}
		}
		catch(Exception l)
		{}
	}
	
	@Then("Check Include Card Details Checkbox")
	public void checkIncludeCardDetailsCheckbox() 
	{
	   ert.Card_Details.click();
	}
	@Then("Check Barcode Checkbox")
	public void checkBarcodeCheckbox() 
	{
	   ert.BarCode.click();
	}
	@Then("Check Powered by LINGA Checkbox")
	public void checkPoweredByLINGACheckbox() 
	{
	   ert.Powered_By.click();
	}
	@Then("Check Social Icons Checkbox")
	public void checkSocialIconsCheckbox()
	{
	   ert.Social_Icon.click();
	}
	
	@Then("Check Customer Feedback Checkbox")
	public void checkCustomerFeedbackCheckbox() 
	{
	    ert.Customer_Feedback.click();
	}
	@Then("Check Special Notes Checkbox")
	public void checkSpecialNotesCheckbox() 
	{
	   ert.Special_Note.click();
	}

	@Then("UnCheck Facebook Link Checkbox")
	public void unCheckFacebookLinkCheckbox() 
	{
//		try
//		{
//			if(ert.FaceBookLink_Enabled.isDisplayed())
//			{
				ert.Facebook.click();
//			}
//		}
//		catch(Exception l)
//		{}
	}
	
	@Then("Check Facebook Link Checkbox")
	public void CheckFacebookCheckbox()
	{
		ert.Facebook.click();
	}
	
	@Then("UnCheck Twitter Link Checkbox")
	public void unCheckTwitterLinkCheckbox() 
	{
		try
		{
			if(ert.TwitterLink_Enabled.isDisplayed())
			{
				ert.Twitter.click();
			}
		}
		catch(Exception l)
		{}
	}
	
	@Then("Check Twitter Link Checkbox")
	public void CheckTwitterLinkCheckbox() 
	{
		ert.Twitter.click();
	}
	
	@Then("UnCheck LinkedIn Link Checkbox")
	public void unCheckLinkedInLinkCheckbox() 
	{
		try
		{
			if(ert.LinkedinLink_Enabled.isDisplayed())
			{
				ert.LinkedIn.click();
			}
		}
		catch(Exception l)
		{}
	}
	
	@Then("Check LinkedIn Link Checkbox")
	public void CheckLinkedInCheckbox() 
	{
		ert.LinkedIn.click();
	}
	@Then("Enter Facebook Link URL")
	public void enterFacebookLinkURL() throws Exception 
	{
	   ert.Enter_Facebook_URL();
	}
	
	@Then("Enter Twitter Link URL")
	public void enterTwitterLinkURL() 
	{
	    ert.Enter_Twitter_URL();
	}
	
	@Then("Enter LinkIn Link URL")
	public void enterLinkInLinkURL()
	{
	   ert.Enter_LinkedIn_URL();
	}
	


}
