package com.Pages;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class Linga_and_Dealer_Admin_Page extends BasePage
{
	WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(50));
	
	Utility ut=new Utility();
	Common_XPaths cmp=new Common_XPaths();
	
	@FindBy(xpath = "//input[@aria-label='Dealers']")
	public WebElement Dealers_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Subscriptions']")
	public WebElement Subscriptions_InputBx;
	
	@FindBy(xpath = "//button[@aria-label='Pay Now']")
	WebElement Pay_Now_Btn;
	
	@FindBy(xpath = "//input[@aria-label='Customer Name']")
	public WebElement Customer_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Amount Received']")
	public WebElement Amount_Received_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Commission']")
	public WebElement Commission_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Amount To Be Paid']")
	public WebElement Amount_To_be_Paid_InputBx;
	
	@FindBy(xpath = "//td[contains(.,'Payments not found')]")
	public WebElement Payment_Not_Found_InfoMsg;
	
	@FindBy(xpath = "//i[@class='fa-regular fa-file-pdf']/../..")
	public WebElement Download_Icon_Btn;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	public WebElement Password_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Confirm Password']")
	public WebElement Confirm_Password_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='New Password']")
	public WebElement New_Password_InputBx;
	
	@FindBy(xpath = "//mat-hint/*[contains(.,'Confirm Password Should Be Matched With Password')]")
	public WebElement Confirm_Password_Should_Match_Password_ErrorMsg;
	
	@FindBy(xpath = "//input[@aria-label='Access']")
	public WebElement Access_InputBx;
	
	@FindBy(xpath = "//div[@id='menu-item-shopping-cart']")
	WebElement Shop_Icon_ModuleList_Option;
	
	@FindBy(xpath = "//div[@id='menu-item-partner-portal']")
	WebElement Partner_Portal_Icon_ModuleList_Option;
	
	
	public void Click_Pay_Now_Button() throws Exception
	{
		Thread.sleep(1000);
		Pay_Now_Btn.click();
	}
	
	public void Enter_Amount_To_Be_Paid(String str) throws Exception
	{
		Thread.sleep(1000);
		Amount_To_be_Paid_InputBx.clear();
		Thread.sleep(1000);
		Amount_To_be_Paid_InputBx.sendKeys(str);
	}
	
	public void Enter_Password(String Password) throws Exception
	{
		Thread.sleep(1000);
		Password_InputBx.clear();
		Thread.sleep(1000);
		Password_InputBx.sendKeys(Password);
	}
	
	public void Enter_Confirm_Password(String Password) throws Exception
	{
		Thread.sleep(1000);
		Confirm_Password_InputBx.clear();
		Thread.sleep(1000);
		Confirm_Password_InputBx.sendKeys(Password);
	}
	
	public String Commission_InputValue()
	{
		return Commission_InputBx.getAttribute("value");
	}
	
	public String Customer_Name_InputValue()
	{
		return Customer_Name_InputBx.getAttribute("value");
	}
	
	public String Amount_Received_InputValue()
	{
		return Amount_Received_InputBx.getAttribute("value");
	}
	
	public void Search_And_Click_Pay_Now(String str)
	{
		
	}
	
	public void Select_Shop_Option_inModule() throws Exception
	{
		Thread.sleep(1000);
		Shop_Icon_ModuleList_Option.click();
	}
	
	public void Select_Partner_Portal_Option_inModule() throws Exception
	{
		Thread.sleep(1000);
		Partner_Portal_Icon_ModuleList_Option.click();
	}
	
	
	
	//////////////////// Dealer - Dashboard ///////////////////////////
	
	@FindBy(xpath = "//app-metric[contains(.,'Core / Basic Plan')]")
	public WebElement Core_Basic_Plan_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Pro plan')]")
	public WebElement Pro_Plan_Tile;

	@FindBy(xpath = "//app-metric[contains(.,'Enterprise plan')]")
	public WebElement Enterprise_Plan_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Sales: last 2 days')]")
	public WebElement Sale_Last_2_Days_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Sales: last 2 to 7 days')]")
	public WebElement Sale_Last_2_To_7_Days_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Sales: last 7 to 30 days')]")
	public WebElement Sale_Last_7_To_30_Days_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Sales: over from last 30 days')]")
	public WebElement Sale_Over_From_Last_30_Days_Tile;
	
	@FindBy(xpath = "//button[contains(.,'NEW ACCOUNT')]")
	WebElement New_Account_Btn;
	
	@FindBy(xpath = "//input[@aria-label='Bulk Update Version']")
	public WebElement Bulk_Update_Veridion_InputBx;
	
	@FindBy(xpath = "//button[contains(.,'UPDATE ALL')]")
	public WebElement Update_All_Btn;
	
	@FindBy(xpath = "//p[contains(.,'Are you sure, you want to update the latest version for all auto enabled store?')]")
	public WebElement Update_Latest_Version_to_All_Store_PopUpMsg;
	
	public void Click_New_Account() throws Exception
	{
		Thread.sleep(2000);
		New_Account_Btn.click();
	}
	
	public void Click_Update_All() throws Exception
	{
		Thread.sleep(2000);
		Update_All_Btn.click();
	}
	
	
	/////////////////////// Admin - Countries  /////////////
	
	@FindBy(xpath = "//button[contains(.,'NEW COUNTRY')]")
	WebElement New_Country_Btn;
	
	@FindBy(xpath = "//input[@aria-label='Country Name']")
	public WebElement Country_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Currency Name']")
	public WebElement Currency_Name_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Currency Symbol']")
	public WebElement Currency_Symbol_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Phone Code']")
	public WebElement Phone_Code_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='ISO Code']")
	public WebElement ISO_Code_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Currency Decimal']")
	public WebElement Currency_Decimal_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Decimal Separator']")
	WebElement Decimal_Separator_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Thousand Separator']")
	WebElement Thousand_Separator_InputBx;
	
	@FindBy(xpath = "//select-option[contains(.,'Comma')]")
	WebElement Comma_Separator_Option;
	
	@FindBy(xpath = "//select-option[contains(.,'Dot')]")
	WebElement Dot_Separator_Option;
	
	public void Click_New_Country() throws Exception
	{
		Thread.sleep(3000);
		New_Country_Btn.click();
	}
	
	public void Select_Decimal_Separator_as_Comma() throws Exception
	{
		Thread.sleep(1000);
		Decimal_Separator_InputBx.click();
		
		Thread.sleep(1000);
		Comma_Separator_Option.click();
	}
	
	public void Select_Decimal_Separator_as_Dot() throws Exception
	{
		Thread.sleep(1000);
		Decimal_Separator_InputBx.click();
		
		Thread.sleep(1000);
		Dot_Separator_Option.click();
	}
	
	public void Select_Thousand_Separator_as_Comma() throws Exception
	{
		Thread.sleep(1000);
		Thousand_Separator_InputBx.click();
		
		Thread.sleep(1000);
		Comma_Separator_Option.click();
	}
	
	public void Select_Thousand_Separator_as_Dot() throws Exception
	{
		Thread.sleep(1000);
		Thousand_Separator_InputBx.click();
		
		Thread.sleep(1000);
		Dot_Separator_Option.click();
	}
	
	
	///////////////////  Linga & Dealer - Dashboard  //////////////////
	
	@FindBy(xpath = "//app-metric[contains(.,'Total Stores')]")
	public WebElement Total_Stores_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Linga One')]")
	public WebElement Linga_One_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'On Trial/ Trial Expired')]")
	public WebElement On_Trail_Trail_Expired_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Linga Online Order')]")
	public WebElement Linga_Online_Order_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Unpaid')]")
	public WebElement Unpaid_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Web Order Sales')]")
	public WebElement Web_Order_Sales_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Mobile Sales')]")
	public WebElement Mobile_Sales_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Call Centre Sales')]")
	public WebElement Call_Centre_Sales_Tile;
	
	@FindBy(xpath = "//app-metric[contains(.,'Total Sales')]")
	public WebElement Total_Sales_Tile;
	
	@FindBy(xpath = "//a[contains(@class,'mat-tab-link')][contains(.,'STORES')]")
	WebElement STORES_Tab;
	
	@FindBy(xpath = "//a[contains(@class,'mat-tab-link')][contains(.,'ONLINE ORDERING')]")
	WebElement ONLINE_ORDERING_Tab;
	
	@FindBy(xpath = "//app-donut-chart[contains(.,'Stores by Business Types')]")
	public WebElement Stores_by_BustinessTypes_Graph;
	
	@FindBy(xpath = "//app-donut-chart[contains(.,'Stores by Status')]")
	public WebElement Stores_by_Status_Graph;
	
	@FindBy(xpath = "//button[contains(@class,'segment-button')][contains(.,'STORES')]")
	public WebElement Stores_Tab;
	
	@FindBy(xpath = "//button[contains(@class,'segment-button')][contains(.,'ACCOUNT')]")
	public WebElement Account_Tab;
	
	public void Select_Stores_Tab() throws Exception
	{
		try
		{
		Thread.sleep(1000);
		STORES_Tab.click();
		}
		catch(Exception k)
		{
			Thread.sleep(1000);
			Stores_Tab.click();
		}
	}
	
	public void Select_Online_Ordering_Tab() throws Exception
	{
		Thread.sleep(1000);
		ONLINE_ORDERING_Tab.click();
	}
	
	@FindBy(xpath = "//button[contains(.,'NEW LANGUAGE')]")
	public WebElement New_Language_Btn;
	
	public void Click_New_Language_Button() throws Exception
	{
		Thread.sleep(1000);
		New_Language_Btn.click();
	}
	
	//////// Linga & Dealer Admin - Currencies  /////////////////
	
	@FindBy(xpath = "//button[.=' NEW CURRENCY ']")
	WebElement NewCurrency;
	
	@FindBy(xpath = "//input[@aria-label='Country Name']")
	public WebElement CountryName;
	
	@FindBy(xpath = "//input[@aria-label='Currency Name']")
	public WebElement CurrencyName;
	
	@FindBy(xpath = "//input[@aria-label='Currency Symbol']")
	public WebElement CurrencySymbol;
	
	public void Enter_CountryName(String Name) throws Exception 
	{
		CountryName.clear();
		Thread.sleep(500);
		CountryName.sendKeys(Name);
	}
	
	public void Enter_CurrencyName(String CurreName) throws Exception
	{
		CurrencyName.clear();
		Thread.sleep(500);
		CurrencyName.sendKeys(CurreName);
	}
	
	public void Enter_CurrencySymbol(String Symbol) throws Exception 
	{
		CurrencySymbol.clear();
		Thread.sleep(500);
		CurrencySymbol.sendKeys(Symbol);
	}

	public void Click_NewCurrencyButton() 
	{
		NewCurrency.click();
	}
	
	public WebElement CountryName() 
	{
		return CountryName;
	}
	public WebElement CurrencyName() 
	{
		return CurrencyName;
	}
	
	public WebElement CurrencySymbol() 
	{
		return CurrencySymbol;
	}
	
	
	//////// Linga & Dealer - Subscriptions ////////////////
	
	@FindBy(xpath = "//app-selectbox/div/mat-form-field/div/div[1]/div[3]/input")
	public WebElement Dealer_DropdownInputBox;

	public void Click_DealerDropdown()
	{
		Dealer_DropdownInputBox.click();
	}

	public void SelectDealerFromDropdown(String Value) throws Exception 
	{
		Dealer_DropdownInputBox.click();
		Thread.sleep(500);
		SearchBar.clear();
		Thread.sleep(500);
		SearchBar.sendKeys(Value);

	}

	@FindBy(xpath = "(//input[contains(@data-placeholder,'Search')])[1]")
	public WebElement SearchBar;
	
	@FindBy(xpath = "//cdk-virtual-scroll-viewport//div/div[1]//select-option")
	public WebElement First_Element;



	public void SearchAndVerify_DropdownSearchBox() throws Exception
	{
//			Thread.sleep(1000);
//			Dealer_DropdownInputBox.click();

			if(First_Element.isDisplayed())
			{
				String SearchText=First_Element.getText().substring(0, 3);
				System.out.println(SearchText);

				Thread.sleep(1000);
				SearchBar.clear();
				Thread.sleep(2000);

				SearchBar.sendKeys(SearchText);
				Thread.sleep(2000);
//                }
//                catch (Exception e) {
//					// TODO: handle exception
//				}
			}
			
//			Thread.sleep(1000);
//			Dealer_DropdownInputBox.click();
	}
	
	@FindBy(xpath = "//th[.=' Customer Name ']")
	public WebElement CustomerNameHeader;

	@FindBy(xpath = "//th[.=' Plan ']")
	public WebElement PlanHeader;

	@FindBy(xpath = "//th[.=' Status ']")
	public WebElement StatusHeader;

	@FindBy(xpath = "//th[.=' Created Date ']")
	public WebElement CreatedDateHeader;

	@FindBy(xpath = "//th[.=' Activated Date ']")
	public WebElement ActivatedDate;

	@FindBy(xpath = "//th[.=' Amount ']")
	public WebElement Amount;

	@FindBy(xpath = "//th[.=' Last Billing Date ']")
	public WebElement LastBillingDate;

	@FindBy(xpath = "//th[.=' Next Billing Date ']")
	public WebElement NextBillingDate;

	@FindBy(xpath = "//td[.='Subscriptions not found']")
	WebElement SubScriptionNotFound;

	@FindBy(xpath = "//input[contains(@data-placeholder,'Search')]")
	WebElement SearchBox;

	public WebElement SubscriptionNotFoundErrMsg() 
	{
		return SubScriptionNotFound;
	}

	public void Search(String SearchValue) throws Exception
	{
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(8000);
	}
	
	
	///////////////// Linga & Dealer - User Feedback  /////////////////////
	
	@FindBy(xpath = "//th[.=' Date Created ']/div/div[1]")
	WebElement DateCreatedField;
	
	@FindBy(xpath = "//th[.=' Name ']/div/div[1]")
	WebElement NameField;
	
	@FindBy(xpath = "//th[.=' Email Id ']/div/div[1]")
	WebElement EmailIdField;
	
	@FindBy(xpath = "//th[.=' Account Name ']/div/div[1]")
	WebElement AccountNameField;
	
	@FindBy(xpath = "//th[.=' Store Name ']/div/div[1]")
	WebElement StoreNameField;
	
	@FindBy(xpath = "//th[.=' Product Rating ']/div/div[1]")
	WebElement ProductRatingField;
	
	@FindBy(xpath = "//th[.=' Support Rating ']/div/div[1]")
	WebElement SupportRatingField;
	
	@FindBy(xpath = "//th[.=' Comment ']/div/div[1]")
	WebElement CommentField;
	
	@FindBy(xpath = "//td[.='User Feedback not found']")
	WebElement UserFeedBackNotFoundMsg;
	
	public WebElement NoUserFeedbackFoundMessage()
	{
		return UserFeedBackNotFoundMsg;
		
	}
	
	public void VerifyDateCreatedField() 
	{
	//	try {
			if(DateCreatedField.isDisplayed()) {
				test.log(LogStatus.PASS,"Date Created Field Displayed");
			}
			else {
				test.log(LogStatus.FAIL,"Date Created Field Not displayed");
			}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	
	public void VerifyNameField() 
	{
	//	try {
		if(NameField.isDisplayed()) {
			test.log(LogStatus.PASS,"Name Field Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Name Field Not displayed");
		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	
	public void VerifyEmailField() 
	{
	//	try {
		if(EmailIdField.isDisplayed()) {
			test.log(LogStatus.PASS,"EmailIdField Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"EmailIdField Not displayed");
		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	
	public void VerifyAccountNameField() 
	{
	//	try {
		if(AccountNameField.isDisplayed()) {
			test.log(LogStatus.PASS,"AccountNameField Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"AccountNameField Not displayed");
		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	
	public void VerifyStoreNameField() 
	{
//		try {
		if(StoreNameField.isDisplayed()) {
			test.log(LogStatus.PASS,"StoreName Field Displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL,"StoreName Field Not displayed");
		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	
	public void VerifyProductRatingField() 
	{
	//	try {
		if(ProductRatingField.isDisplayed()) {
			test.log(LogStatus.PASS,"ProductRating Field Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"ProductRating Field Not displayed");
		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	
	public void VerifySupportRatingField()
	{
//		try {
		if(SupportRatingField.isDisplayed()) {
			test.log(LogStatus.PASS,"SupportRating Field Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"SupportRating Field Not displayed");
		}
		
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}

	
	public void VerifyCommentField()
	{
//		try {
		if(CommentField.isDisplayed()) {
			test.log(LogStatus.PASS,"Comment Field Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Comment Field Not displayed");
		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	
	
	////////////////////////  Announcement /////////////////////////
	
	
	@FindBy(xpath = "//button[.=' ANNOUNCEMENT ']")
	WebElement New_AnnouncementButton;
	
	@FindBy(xpath = "//mat-label[.='From Date']/../../../..//mat-datepicker-toggle")
	public WebElement FromdateInputBox;
	
	@FindBy(xpath = "//mat-label[.='To Date']/../../../..//mat-datepicker-toggle")
	public WebElement ToDateInputBox;
	
	@FindBy(xpath = "//input[@aria-label='From Time']")
	WebElement FromTimeInputBox;
	
	@FindBy(xpath = "//input[@aria-label='To Time']")
	WebElement ToTimeInputBox;
	
	@FindBy(xpath = "(//button[@aria-label='expand row'])[1]")
	WebElement RowExpand_Button;
	
	@FindBy(xpath = "//div[@class='jodit-workplace']/div")
	public WebElement Announcement_InpuBox;
	
	public void Enter_Announcement_InputBox(String str) throws Exception 
	{
		Announcement_InpuBox.clear();
		Thread.sleep(500);
		Announcement_InpuBox.sendKeys(str);
	}
	
	public void Click_ExpandRowButton() 
	{
		RowExpand_Button.click();
	}
	
	public void Click_NewAnnouncementButton() 
	{
		New_AnnouncementButton.click();
	}
	public void Select_ToDate() throws Exception
	{
		Availability_RestrictionTimePage al = new Availability_RestrictionTimePage();
		ToDateInputBox.click();
		Thread.sleep(500);
		al.currentDate.click();
	}
	
	public void Select_ToTime(String Hours,String Mins, WebElement AMPM) throws Exception
	{
		Availability_RestrictionTimePage al = new Availability_RestrictionTimePage();
		ToTimeInputBox.click();
		Thread.sleep(500);
		Thread.sleep(500);
		al.Hours_TimeInputBox.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]["+Hours+"]")).click();
		
		Thread.sleep(500);
		al.Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		al.Minutes_TimeInputBox.sendKeys(Mins);
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 45']")).click();
	     AMPM.click();
		
		Thread.sleep(500);
		al.OK_TimePickerBtn.click();
	}
	
	public void Select_FromDate() throws Exception 
	{
		Availability_RestrictionTimePage al = new Availability_RestrictionTimePage();
		FromdateInputBox.click();
		Thread.sleep(500);
		al.currentDate.click();
	}
	
	public void Select_FromTime(String Hours,String Mins, WebElement AMPM) throws Exception 
	{
		Availability_RestrictionTimePage al = new Availability_RestrictionTimePage();
		FromTimeInputBox.click();
		Thread.sleep(500);
		al.Hours_TimeInputBox.click();
		
		Thread.sleep(500);
//		Hours_TimeInputBox.sendKeys("10");
//		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 10 ']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'clock-face__number clock-face__number')]["+Hours+"]")).click();
		
		Thread.sleep(500);
		al.Minutes_TimeInputBox.clear();
		
		Thread.sleep(500);
		al.Minutes_TimeInputBox.sendKeys(Mins);
//		driver.findElement(By.xpath("//ngx-material-timepicker-minutes-face/ngx-material-timepicker-face/div/div/div[contains(@class,'clock-face__number clock-face__number')]/span[.=' 45']")).click();
	     AMPM.click();
		
		Thread.sleep(500);
		al.OK_TimePickerBtn.click();
	}
	
	public void SelectInvalidFromDate() throws Exception 
	{
		Availability_RestrictionTimePage al = new Availability_RestrictionTimePage();
		
			driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
		try {
		FromdateInputBox.click();
		Thread.sleep(500);
		int FromDateSize = driver.findElements(By.xpath("(//td[@role='gridcell'])")).size();
		
		driver.findElement(By.xpath("(//td[@role='gridcell'])[FromDateSize]")).click();
		}
		catch (Exception e) {
			test.log(LogStatus.PASS,"Not able click previous date all the previous dates are disabled");
		}
	}
	
	@FindBy(xpath = "//button[.='UPDATE']")
	public WebElement UpdateButton;
	
	@FindBy(xpath = "//button[.=' Cancel ']")
	public WebElement Cancel;
	
	
	///////////////// Translatations  ////////////////////
	
	@FindBy(xpath = "//h5[.=' 1-Please select languages to export translation template ']")
	public WebElement LanguagesHeading;
	
	@FindBy(xpath = "//h5[.=' 2-Upload the template to update translations ']")
	public WebElement UploadTemplateHeader;
	
	@FindBy(xpath = "//input[@aria-label='Languages']")
	WebElement LanguagesDropdown;
	
	@FindBy(xpath = "//button[.=' Download Template ']")
	WebElement DownloadTemplateButton;
	
	@FindBy(xpath = "//input[@id='fileInput']/..//i")
	WebElement UploadTemplateButton;
	
	@FindBy(xpath = "(//mat-icon[.='close'])[2]")
	WebElement CloseButton;
	
	public void ClickLanguagesDropdown() 
	{
		LanguagesDropdown.click();
	}
	
	public void ClickDownloadTemplate()
	{
		DownloadTemplateButton.click();
	}
	
	public void ClickUploadTemplate() 
	{
		UploadTemplateButton.click();
	}
	
	public void UploadTemplate(String Image) throws Exception
	{
		UploadTemplateButton.sendKeys(Image);
	}
	
	public void ClickCloseButton() 
	{
		CloseButton.click();
	}
	
	@FindBy(xpath = "//button[.=' IMPORT ']")
	public WebElement Import;
	
	@FindBy(xpath = "(//app-file-uploader//span)[2]/i")
	public WebElement Upload_CancelButton;
	
	@FindBy(xpath = "//img[@alt='image']/..")
	public WebElement Uploaded_Image_Icon;
	
	@FindBy(xpath = "//img[@alt='delete']/..")
	public WebElement Delete_Icon_In_Image;
	
	
	//////////// Dealers  ///////////////////////
	
	@FindBy(xpath = "//button[contains(.,'NEW DEALER')]")
	WebElement New_DealerBtn;
	
	@FindBy(xpath = "//button[contains(.,'AUTHENTICATE')]")
	public WebElement Authenticate_Btn;
	
	@FindBy(xpath = "//input[@aria-label='Phone Number']")
	public WebElement Phone_Number_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Zoho Code']")
	public WebElement Zoho_Code_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Back Office URL']")
	public WebElement Back_Offic_URL_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Purchase URL']")
	public WebElement Purchase_URL_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Dealer URL']")
	public WebElement Dealer_URL_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Support URL']")
	public WebElement Support_URL_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Support Phone Number']")
	public WebElement Support_Phone_Number_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Gift Card Sender Email']")
	public WebElement Gift_Card_Sender_Email_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Email Id']")
	public WebElement Email_Id_InputBx;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'Enter Valid Phone Number. Phone Number should be contain at least 10 digits')]")
	public WebElement Phone_Number_Should_be_10_Digits_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'Enter Valid Phone Number. Phone Number should be contain at least 6 digits')]")
	public WebElement Phone_Number_Should_be_6_Digits_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'Phone number should not be more than 15 digits')]")
	public WebElement Phone_Number_Should_not_Morethan_15_Digits_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'URL must be valid')]")
	public WebElement URL_Must_be_Valid_ErrorMsg;
	
	@FindBy(xpath = "//td[contains(.,'Dealers not found')]")
	public WebElement Dealer_Not_FoundInfoMsg;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'Enter Valid Phone Number')]")
	public WebElement Enter_Valid_Phone_Number_ErrorMsg;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'The value should not be more than 100%')]")
	public WebElement Value_Should_Not_be_100_ErrorMsg;
	
//	@FindBy(xpath = "")
//	public WebElement New
	
	public void Enter_New_Password(String NewPWd) throws Exception
	{
		Thread.sleep(1000);
		New_Password_InputBx.clear();
		Thread.sleep(1000);
		New_Password_InputBx.sendKeys(NewPWd);
	}
	
	public void Click_New_DealerButton() throws Exception
	{
		Thread.sleep(3000);
		New_DealerBtn.click();
	}
	
	public void Click_New_AuthenticateButton() throws Exception
	{
		Thread.sleep(2000);
		Authenticate_Btn.click();
	}
	
	public void Enter_Phone_Number(String PhoneNumber) throws Exception
	{
		Thread.sleep(1000);
		Phone_Number_InputBx.clear();
		Thread.sleep(1000);
		Phone_Number_InputBx.sendKeys(PhoneNumber);
	}
	
	public void Select_Zoho_Code() throws Exception
	{
		cmp.Click_DropDown(Zoho_Code_InputBx, "Zoho Code Selected");
	}
	
	public void Enter_Email_ID(String EmailID) throws Exception
	{
		Thread.sleep(1000);
		Email_Id_InputBx.clear();
		Thread.sleep(1000);
		Email_Id_InputBx.sendKeys(EmailID);
	}
	
	
	/////////////////////// Accounts & Stores ////////////////////////////
	
	@FindBy(xpath = "//input[@aria-label='Back Office Access Date']")
	public WebElement BackOffice_Access_Date_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Last POS Access Date']")
	public WebElement Last_POS_Access_Date_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Expiry Date']")
	public WebElement Expiry_Date_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Subscription Status']")
	public WebElement Subscription_Status_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Plan']")
	public WebElement Plan_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Industry Type']")
	public WebElement Industry_Type_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Business Type']")
	public WebElement Business_Type_InputBx;
	

	
	
	public void Select_Subscription_Status(String Option)
	{
		driver.findElement(By.xpath("//input[@aria-label='Subscription Status']/../../div//button")).click();
		
		Subscription_Status_InputBx.click();
		
		Subscription_Status_InputBx.sendKeys(Option);
		
		driver.findElement(By.xpath("//span[@class='mat-checkbox-label'][contains(text(),'"+Option+"')]")).click();
		
	}
	
//	public void Select_Stores_Tab() throws Exception
//	{
//		Thread.sleep(2000);
//	}
	
	//////////////////// Dealer Admin - Dealer Info ///////////////////
	
	@FindBy(xpath = "//div[@role='tab'][contains(.,'DEALER INFO')]")
	public WebElement Dealer_Info_Tab;
	
	@FindBy(xpath = "//div[@role='tab'][contains(.,'SMTP INFO')]")
	public WebElement SMTP_Info_Tab;
	
	@FindBy(xpath = "//input[@aria-label='Address Line 1']")
	public WebElement Address_Line1_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Address Line 2']")
	public WebElement Address_Line2_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='City']")
	public WebElement City_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='State']")
	public WebElement State_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Country']")
	public WebElement Country_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='ZipCode']")
	public WebElement ZipCode_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='User Name']")
	public WebElement UserName_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Server']")
	public WebElement Server_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='From']")
	public WebElement From_InputBx;
	
	@FindBy(xpath = "//input[@aria-label='Port']")
	public WebElement Port_InputBx;
	
	@FindBy(xpath = "//div[contains(.,'BO Login Screen Icon')]/app-image-picker//input[@type='file']")
	public WebElement BO_Login_Screen_Img_FileIcon;
	
	@FindBy(xpath = "//div[contains(.,'BO Application Icon')]/app-image-picker//input[@type='file']")
	public WebElement BO_Application_Img_FileIcon;
	
	@FindBy(xpath = "//div[contains(.,'BO Login Screen Icon')]/app-image-picker//input[@type='file']")
	public WebElement Admin_Page_Logo_Img_FileIcon;
	
	@FindBy(xpath = "//div[contains(.,'BO Login Screen Icon')]/app-image-picker//input[@type='file']")
	public WebElement Web_Browser_Tab_Screen_Img_FileIcon;
	
	@FindBy(xpath = "//div[contains(.,'BO Login Screen Icon')]/app-image-picker//input[@type='file']")
	public WebElement Dealer_POS_Screen_Img_FileIcon;
	
	@FindBy(xpath = "//div[contains(.,'BO Login Screen Icon')]/app-image-picker//input[@type='file']")
	public WebElement Web_POS_Login_Page_Img_FileIcon;

	public void Select_Dealer_Info_Tab() throws Exception
	{
		Thread.sleep(2000);
		Dealer_Info_Tab.click();
	}
	
	public void Select_SMTP_Info_Tab() throws Exception
	{
		Thread.sleep(2000);
		SMTP_Info_Tab.click();
	}
	
	public void Enter_Address_Line1(String Add1) throws Exception
	{
		Thread.sleep(1000);
		Address_Line1_InputBx.clear();
		Thread.sleep(1000);
		Address_Line1_InputBx.sendKeys(Add1);
	}
	
	public void Enter_Address_Line2(String Add1) throws Exception
	{
		Thread.sleep(1000);
		Address_Line2_InputBx.clear();
		Thread.sleep(1000);
		Address_Line2_InputBx.sendKeys(Add1);
	}
	
	public void Enter_City(String City) throws Exception
	{
		Thread.sleep(1000);
		City_InputBx.clear();
		Thread.sleep(1000);
		City_InputBx.sendKeys(City);
	}
	
	public void Enter_State(String Add1) throws Exception
	{
		Thread.sleep(1000);
		State_InputBx.clear();
		Thread.sleep(1000);
		State_InputBx.sendKeys(Add1);
	}
	
	public void Enter_Country(String Add1) throws Exception
	{
		Thread.sleep(1000);
		Country_InputBx.clear();
		Thread.sleep(1000);
		Country_InputBx.sendKeys(Add1);
	}
	
	public void Enter_ZipCode(String Add1) throws Exception
	{
		Thread.sleep(1000);
		ZipCode_InputBx.clear();
		Thread.sleep(1000);
		ZipCode_InputBx.sendKeys(Add1);
	}
	
	public void Enter_User_Name(String Add1) throws Exception
	{
		Thread.sleep(1000);
		UserName_InputBx.clear();
		Thread.sleep(1000);
		UserName_InputBx.sendKeys(Add1);
	}
	
	public void Enter_Server(String Add1) throws Exception
	{
		Thread.sleep(1000);
		Server_InputBx.clear();
		Thread.sleep(1000);
		Server_InputBx.sendKeys(Add1);
	}
	
	public void Enter_From(String Add1) throws Exception
	{
		Thread.sleep(1000);
		From_InputBx.clear();
		Thread.sleep(1000);
		From_InputBx.sendKeys(Add1);
	}
	
	public void Enter_Port_Number(String Add1) throws Exception
	{
		Thread.sleep(1000);
		Port_InputBx.clear();
		Thread.sleep(1000);
		Port_InputBx.sendKeys(Add1);
	}
	
	
	
	//////////////// Linga & Dealer Store Details ////////////////
	
	
	@FindBy(xpath = "//button[contains(.,'ACTIONS')]")
	public WebElement ActionsButton;

	@FindBy(xpath = "//input[@data-placeholder='Password']")
	public WebElement Password;

	@FindBy(xpath = "//span[.='VERIFY']")
	public WebElement Verify;

	@FindBy(xpath = "//input[@aria-label='Port']")
	public WebElement Port;

	@FindBy(xpath = "//input[@aria-label='User Name']")
	public WebElement UserName;

	@FindBy(xpath = "//input[@aria-label='Password']")
	public WebElement Password_Input;

	@FindBy(xpath = "//input[@aria-label='Hostname']")
	public WebElement HostName;

	@FindBy(xpath = "//input[@aria-label='Client ID']")
	public WebElement ClientID;

	@FindBy(xpath = "//input[@aria-label='Client Secret']")
	public WebElement ClientSecret;

	public void Click_ActionsButton() throws Exception
	{
		Thread.sleep(2000);
		wt.until(ExpectedConditions.elementToBeClickable(ActionsButton)).click();

	}
	
	@FindBy(xpath = "//span[.='Include Credit Card']/../..//button[.='Yes']")
	public WebElement IncludeCreditCard_YesToggle;
	
	@FindBy(xpath = "//span[.='Include Credit Card']/../..//button[.='No']")
	public WebElement IncludeCreditCard_NoToggle;
	
	@FindBy(xpath = "//span[.='Include Gift Card']/../..//button[.='Yes']")
	public WebElement IncludeGiftCard_YesToggle;
	
	@FindBy(xpath = "//span[.='Include Gift Card']/../..//button[.='No']")
	public WebElement IncludeGiftCard_NoToggle;
	
	@FindBy(xpath = "//span[.='Enable Multiple Cash Tenders']/../..//button[.='Yes']")
	public WebElement EnableMultipleCashTenders_YesToggle;
	
	@FindBy(xpath = "//span[.='Enable Multiple Cash Tenders']/../..//button[.='No']")
	public WebElement EnableMultipleCashTenders_NoToggle;
	
	@FindBy(xpath = "//span[.='Enable Other Payment Options']/../..//button[.='Yes']")
	public WebElement EnableOtherPaymentOptions_YesToggle;
	
	@FindBy(xpath = "//span[.='Enable Other Payment Options']/../..//button[.='No']")
	public WebElement EnableOtherPaymentOptions_NoToggle;
	
	@FindBy(xpath = "//span[.='EMV']/../..//button[.='Yes']")
	public WebElement EMV_Settings_YesToggle;
	
	@FindBy(xpath = "//span[.='EMV']/../..//button[.='No']")
	public WebElement EMV_Settings_NoToggle;
	
	@FindBy(xpath = "//span[.='Give X Gift Card']/../..//button[.='Yes']")
	public WebElement GiveXGiftCard_YesToggle;
	
	@FindBy(xpath = "//span[.='Give X Gift Card']/../..//button[.='No']")
	public WebElement GiveXGiftCard_NoToggle;
	
	@FindBy(xpath = "//span[.='House Account']/../..//button[.='Yes']")
	public WebElement HouseAccount_YesToggle;
	
	@FindBy(xpath = "//span[.='House Account']/../..//button[.='No']")
	public WebElement HouseAccount_NoToggle;
	
	@FindBy(xpath = "//span[.='MPPG Credit Card']/../..//button[.='Yes']")
	public WebElement MPPGCreditCard_YesToggle;
	
	@FindBy(xpath = "//span[.='MPPG Credit Card']/../..//button[.='No']")
	public WebElement MPPGCreditCard_NoToggle;
	
	@FindBy(xpath = "//span[.='NMI Tokenization']/../..//button[.='Yes']")
	public WebElement NMITokenization_YesToggle;
	
	@FindBy(xpath = "//span[.='NMI Tokenization']/../..//button[.='No']")
	public WebElement NMITokenization_NoToggle;
	
	@FindBy(xpath = "//span[.='Dejavoo']/../..//button[.='Yes']")
	public WebElement Dejavoo_YesToggle;
	
	@FindBy(xpath = "//span[.='Dejavoo']/../..//button[.='No']")
	public WebElement Dejavoo_NoToggle;
	
	@FindBy(xpath = "//span[.='Optomany']/../..//button[.='Yes']")
	public WebElement Optomany_YesToggle;
	
	@FindBy(xpath = "//span[.='Optomany']/../..//button[.='No']")
	public WebElement Optomany_NoToggle;
	
	@FindBy(xpath = "//span[.='Vexen Payment']/../..//button[.='Yes']")
	public WebElement VexenPayment_YesToggle;
	
	@FindBy(xpath = "//span[.='Vexen Payment']/../..//button[.='No']")
	public WebElement VexenPayment_NoToggle;
	
	@FindBy(xpath = "//span[.='Clover Payment']/../..//button[.='Yes']")
	public WebElement CloverPayment_YesToggle;
	
	@FindBy(xpath = "//span[.='Clover Payment']/../..//button[.='No']")
	public WebElement CloverPayment_NoToggle;
	
	@FindBy(xpath = "//span[.='Show Dual Price']/../..//button[.='Yes']")
	public WebElement ShowDualPrice_YesToggle;
	
	@FindBy(xpath = "//span[.='Show Dual Price']/../..//button[.='No']")
	public WebElement ShowDualPrice_NoToggle;
	
	@FindBy(xpath = "//span[.='Show Deposit In Sale Recap']/../..//button[.='Yes']")
	public WebElement ShowDeposite_YesToggle;
	
	@FindBy(xpath = "//span[.='Show Deposit In Sale Recap']/../..//button[.='No']")
	public WebElement ShowDeposite_NoToggle;
	
	@FindBy(xpath = "//span[.='Membership']/../..//button[.='Yes']")
	public WebElement Membership_YesToggle;
	
	@FindBy(xpath = "//span[.='Membership']/../..//button[.='No']")
	public WebElement Membership_NoToggle;
	
	@FindBy(xpath = "//span[.='Ingenico TR']/../..//button[.='Yes']")
	public WebElement IngenicoTR_YesToggle;
	
	@FindBy(xpath = "//span[.='Ingenico TR']/../..//button[.='No']")
	public WebElement IngenicoTR_NoToggle;
	
	@FindBy(xpath = "//span[.='Food Check']/../..//button[.='Yes']")
	public WebElement FoodCheck_YesToggle;
	
	@FindBy(xpath = "//span[.='Food Check']/../..//button[.='No']")
	public WebElement FoodCheck_NoToggle;
	
	@FindBy(xpath = "//span[.='Mobile']/../..//button[.='Yes']")
	public WebElement Mobile_YesToggle;
	
	@FindBy(xpath = "//span[.='Mobile']/../..//button[.='No']")
	public WebElement Mobile_NoToggle;
	
	@FindBy(xpath = "//span[.='Score']/../..//button[.='Yes']")
	public WebElement Score_YesToggle;
	
	@FindBy(xpath = "//span[.='Score']/../..//button[.='No']")
	public WebElement Score_NoToggle;
	
	@FindBy(xpath = "//input[@aria-label='User Id']")
	public WebElement UserID;
	
	@FindBy(xpath = "(//input[@aria-label='User Id'])[2]")
	public WebElement UserID_Two;
	
	@FindBy(xpath = "//textarea[@aria-label='Encryption Key']")
	public WebElement EncryptionKey;
	
	@FindBy(xpath = "(//span[.=' CHANGE PASSWORD '])[2]")
	public WebElement ChangePassowrd;
	
	@FindBy(xpath = "//input[@placeholder='Current Password']")
	public WebElement CurrentPassword;
	
	@FindBy(xpath = "//input[@placeholder='New Password']")
	public WebElement NewPassword;
	
	@FindBy(xpath = "(//input[@placeholder='Confirm Password'])[2]")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath = "//span[.='Castle and Go']/../..//button[.='Yes']")
	public WebElement CastleAndgo_YesToggle;
	
	@FindBy(xpath = "//span[.='Castle and Go']/../..//button[.='No']")
	public WebElement CastleAndgo_NoToggle;
	
	@FindBy(xpath = "//span[.='SPPax']/../..//button[.='No']")
	public WebElement SPPax_NoToggle;
	
	@FindBy(xpath = "//span[.='SPPax']/../..//button[.='Yes']")
	public WebElement SPPax_YesToggle;
	
	@FindBy(xpath = "//input[@placeholder='Serial Number']")
	public WebElement SerialNumber;
	
	@FindBy(xpath = "//input[@data-placeholder='Primary URL']")
	public WebElement Primary_URL;
	
	@FindBy(xpath = "//input[@aria-label='Secondary URL']")
	public WebElement Secondary_URL;
	
	@FindBy(xpath = "//button[.=' Submit ']")
	public WebElement Submit;
	
	@FindBy(xpath = "//span[contains(.,' Test Account ')]")
	public WebElement TestAccountToggle;
	
	@FindBy(xpath = "//input[@aria-label='Customer Code']")
	public WebElement CustomerCodeInputBox;
	
//	@FindBy(xpath = "//input[@aria-label='User Name']")
//	public WebElement UserName;
	
	@FindBy(xpath = "//input[@aria-label='Payment Gateway']")
	public WebElement PaymentGateWay;
	
	@FindBy(xpath = "//input[@aria-label='MCC']")
	public WebElement MCC;
	
	@FindBy(xpath = "//span[.='Ingenico']/../..//button[.='Yes']")
	public WebElement Ingenico_YesToggle;
	
	@FindBy(xpath = "//span[.='Ingenico']/../..//button[.='No']")
	public WebElement Ingenico_NoToggle;
	
	@FindBy(xpath = "//input[@aria-label='Spin Cloud URL']")
	public WebElement SpinCloudURL;
	
	@FindBy(xpath = "//input[@aria-label='Merchant Id']")
	public WebElement MerchantID;
	
	@FindBy(xpath = "//input[@aria-label='Site Id']")
	public WebElement SiteID;
	
	@FindBy(xpath = "//input[@aria-label='Provision Url']")
	public WebElement ProvisionalUrl;
	
	@FindBy(xpath = "//input[@data-placeholder='Percentage']")
	public WebElement Percentage;
	
	@FindBy(xpath = "//button[contains(.,'UPDATE')]")
	public WebElement Update;
	
	@FindBy(xpath = "//span[.='Oracle PMS Integration']/../..//button")
	public WebElement PMSIntegrationToggle;
	
	@FindBy(xpath = "//span[.='Oracle PMS Integration']/../..//button[.='Yes']")
	public WebElement PMSIntegration_YesToggle;
	
	@FindBy(xpath = "//span[.='Oracle PMS Integration']/../..//button[.='No']")
	public WebElement PMSIntegration_NoToggle;
	
	@FindBy(xpath = "//span[.='Emaar Integration']/../..//button")
	public WebElement EmaarIntegrationToggle;
	
	@FindBy(xpath = "//span[.='Emaar Integration']/../..//button[.='Yes']")
	public WebElement EmaarIntegration_YesToggle;
	
	@FindBy(xpath = "//span[.='Emaar Integration']/../..//button[.='No']")
	public WebElement EmaarIntegration_NoToggle;
	
	@FindBy(xpath = "//span[.='Moneris']/../..//button")
	public WebElement MonerisToggle;
	
	@FindBy(xpath = "//span[.='Moneris']/../..//button[.='Yes']")
	public WebElement Moneris_YesToggle;
	
	@FindBy(xpath = "//span[.='Moneris']/../..//button[.='No']")
	public WebElement Moneris_NoToggle;
	
	@FindBy(xpath = "//span[.='Digital Gator']/../..//button")
	public WebElement DigitalGatorToggle;
	
	@FindBy(xpath = "//span[.='Digital Gator']/../..//button[.='Yes']")
	public WebElement DigitalGator_YesToggle;
	
	@FindBy(xpath = "//span[.='Digital Gator']/../..//button[.='No']")
	public WebElement DigitalGator_NoToggle;
	
	@FindBy(xpath = "//span[.='Check Out']/../..//button")
	public WebElement CheckOutToggle;
	
	@FindBy(xpath = "//span[.='Check Out']/../..//button[.='Yes']")
	public WebElement CheckOut_YesToggle;
	
	@FindBy(xpath = "//span[.='Check Out']/../..//button[.='No']")
	public WebElement CheckOut_NoToggle;
	
	@FindBy(xpath = "//span[.='Food Check']/../..//button")
	public WebElement FoodCheckToggle;
	
	@FindBy(xpath = "//span[.='Mobile']/../..//button")
	public WebElement Mobile;
	
	@FindBy(xpath = "//span[.='Evertec']/../..//button")
	public WebElement Evertec;
	
	@FindBy(xpath = "//span[.='Evertec']/../..//button[.='Yes']")
	public WebElement Evertec_YesToggle;
	
	@FindBy(xpath = "//span[.='Evertec']/../..//button[.='No']")
	public WebElement Evertec_NoToggle;
	
	@FindBy(xpath = "//span[.='PayPal']/../..//button")
	public WebElement PaypalToggle;
	
	@FindBy(xpath = "//span[.='PayPal']/../..//button[.='Yes']")
	public WebElement Paypal_YesToggle;
	
	@FindBy(xpath = "//span[.='PayPal']/../..//button[.='No']")
	public WebElement Paypal_NoToggle;
	
	@FindBy(xpath = "//span[.='Venmo']/../..//button")
	public WebElement VenmoToggle;
	
	@FindBy(xpath = "//span[.='Venmo']/../..//button[.='Yes']")
	public WebElement Venmo_YesToggle;
	
	@FindBy(xpath = "//span[.='Venmo']/../..//button[.='No']")
	public WebElement Venmo_NoToggle;
	
	@FindBy(xpath = "//span[.='LPG']/../..//button")
	public WebElement LPGToggle;
	
	@FindBy(xpath = "//span[.='LPG']/../..//button[.='Yes']")
	public WebElement LPG_YesToggle;
	
	@FindBy(xpath = "//span[.='LPG']/../..//button[.='No']")
	public WebElement LPG_NoToggle;
	
	@FindBy(xpath = "//span[.='PMS Aspire']/../..//button")
	public WebElement PMSAspireToggle;
	
	@FindBy(xpath = "//span[.='PMS Aspire']/../..//button[.='Yes']")
	public WebElement PMSAspire_YesToggle;
	
	@FindBy(xpath = "//span[.='PMS Aspire']/../..//button[.='No']")
	public WebElement PMSAspire_NoToggle;
	
	@FindBy(xpath = "//span[.='Ingenico TR Cash']/../..//button[.='No']")
	public WebElement IngenicoTRCash_NoToggle;
	
	@FindBy(xpath = "//span[.='Ingenico TR Cash']/../..//button[.='Yes']")
	public WebElement IngenicoTRCash_YesToggle;
	
	@FindBy(xpath = "//input[@aria-label='IP Address']")
	public WebElement IpAddress_InputBox;
	
//	@FindBy(xpath = "//input[@data-placeholder='Port']")
//	public WebElement Port;
	
	@FindBy(xpath = "//input[@aria-label='Unit No']")
	public WebElement Unit_No;
	
	@FindBy(xpath = "//input[@aria-label='Lease Code']")
	public WebElement Leasecode;
	
	@FindBy(xpath = "//input[@aria-label='X-API-Key']")
	public WebElement XAPIKey;
	
	@FindBy(xpath = "//input[@aria-label='SMS Review Template ID']")
	public WebElement SMSReviewTemplateID;
	
	@FindBy(xpath = "//input[@aria-label='Email Review Template ID']")
	public WebElement EmailReviewTemplateID;
	
	@FindBy(xpath = "//input[@aria-label='BID']")
	public WebElement BID;
	
	@FindBy(xpath = "//input[@aria-label='RNCERT']")
	public WebElement RNCERT;
	
	@FindBy(xpath = "//input[@aria-label='RNID']")
	public WebElement RIND;
	
	@FindBy(xpath = "//input[@aria-label='Property Id']")
	public WebElement PriorityID;
	
	@FindBy(xpath = "//input[@aria-label='Ocp-Apim-subscription-Key']")
	public WebElement OcpApimSubscriptionKey;
	
	@FindBy(xpath = "//input[@aria-label='Url']")
	public WebElement URL;
	
	@FindBy(xpath = "//input[@aria-label='AWS Access Key ID']")
	public WebElement AWSAccessKeyID;
	
	@FindBy(xpath = "//input[@aria-label='AWS Region']")
	public WebElement AWSRegion;
	
	@FindBy(xpath = "//input[@aria-label='AWS S3 Bucket']")
	public WebElement AWSS3Bucket;
	
	@FindBy(xpath = "//input[@aria-label='AWS S3 Storage Class']")
	public WebElement AWSS3Class;
	
	@FindBy(xpath = "//input[@aria-label='AWS Secret Access Key']")
	public WebElement AWSSecretAccessKey;

	
	///////////// Linga & Dealer - Account Details //////////////
	
//	@FindBy(xpath = "//button[contains(.,'ACTIONS')]")
//	public WebElement ActionsButton;
//
//	@FindBy(xpath = "//input[@data-placeholder='Password']")
//	public WebElement Password;
//
//	@FindBy(xpath = "//span[.='VERIFY']")
//	public WebElement Verify;
//
//	@FindBy(xpath = "//input[@aria-label='Port']")
//	public WebElement Port;
//
//	@FindBy(xpath = "//input[@aria-label='User Name']")
//	public WebElement UserName;
//
//	@FindBy(xpath = "//input[@aria-label='Password']")
//	public WebElement Password_Input;
//
//	@FindBy(xpath = "//input[@aria-label='Hostname']")
//	public WebElement HostName;
//
//	@FindBy(xpath = "//input[@aria-label='Client ID']")
//	public WebElement ClientID;
//
//	@FindBy(xpath = "//input[@aria-label='Client Secret']")
//	public WebElement ClientSecret;
//
//	public void Click_ActionsButton() throws Exception
//	{
//		Thread.sleep(2000);
//		wt.until(ExpectedConditions.elementToBeClickable(ActionsButton)).click();
//
//	}

}
