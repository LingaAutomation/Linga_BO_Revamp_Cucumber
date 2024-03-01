package com.Pages;

import java.lang.invoke.MethodHandles;
import java.nio.channels.ScatteringByteChannel;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;

public class DiscountsPage extends BasePage {
	//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Common_XPaths cmp;
	Utility ut = new Utility();

	String removing_category;
	int Category_count;
	String removing_Subcategory;
	int Sub_Category_count;

	String removing_MenItem;
	int MenuItem_count;

//	public DiscountsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}

	@FindBy(xpath = "//button/span[contains(.,'ITEM BASED')]")
	WebElement Item_Based_ScreenTab;

	@FindBy(xpath = "//button/span[contains(.,'CHECK BASED')]")
	WebElement Check_Based_ScreenTab;

	@FindBy(xpath = "//div//h3[.='Item Based']")
	WebElement Item_Based_Discount_HeaderName;

	@FindBy(xpath = "//span/div[contains(.,'OPEN ITEM')]")
	WebElement Open_Item_ScreenTab;

	@FindBy(xpath = "//span/div[contains(.,'OPEN CHECK')]")
	WebElement Open_Check_ScreenTab;

	@FindBy(xpath = "//span/div[contains(.,'MIX AND MATCH')]")
	WebElement Mix_and_Match_ScreenTab;

	@FindBy(xpath = "//button[contains(.,'NEW DISCOUNT')]")
	WebElement New_DiscountBtn;

	@FindBy(xpath = "//button[contains(.,'SAVE AND PUBLISH')]")
	WebElement SaveandPublish_Btn;

	@FindBy(xpath = "//button[contains(.,'NEW OPEN ITEM DISCOUNT')]")
	public WebElement New_Open_Item_DiscountBtn;

	@FindBy(xpath = "//button[contains(.,'NEW OPEN CHECK DISCOUNT')]")
	public WebElement New_Open_Check_DiscountBtn;

	@FindBy(xpath = "//input[@placeholder='Select Apply Discount']")
	public WebElement Apply_DropDownBtn;

	@FindBy(xpath = "//select-option[contains(.,'Before Tax')]")
	public WebElement Before_TaxBtn;

	@FindBy(xpath = "//select-option[contains(.,'After Tax')]")
	public WebElement After_TaxBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Include Additional Modifiers')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement IncludeAdditionalModifiers_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Combine With Other Discount')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement CombineWithOtherDiscount_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Apply For Discounted Price')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement ApplyForDiscountedPrice_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Combine With Other Discount')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement CombineWithOtherDiscount_NoBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Include Additional Modifiers')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement IncludeAdditionalModifiers_NoBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Combine With Other Discount')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Combine_WithOther_Discount_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Combine With Other Discount')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Combine_WithOther_Discount_NoBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Apply For Discounted Price')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Apply_For_Discounted_Price_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Apply For Discounted Price')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Apply_For_Discounted_Price_NoBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'All Serving Sizes in Category')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement All_Serving_Sizes_inCategory_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'All Serving Sizes in Category')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement All_Serving_Sizes_inCategory_NoBtn;

	@FindBy(xpath = "(//div[contains(@class,'discount-table')]//div/input)[2]")
	public WebElement Serving_SizeInputBx;

	@FindBy(xpath = "(//div[contains(@class,'discount-table')]//div/input)[3]")
	public WebElement Quantity_InputBox;

	@FindBy(xpath = "(//div[contains(@class,'discount-table')]//div/input)[4]")
	WebElement Price_InputBox_FreeItemDiscount;

	@FindBy(xpath = "//button[@aria-label='Delete']")
	WebElement Delete_FreeItemDiscount_Price;

	@FindBy(xpath = "//button[contains(.,'Delete')]")
	WebElement Click_Delete_Confirm_Btn;

	@FindBy(xpath = "//label[contains(.,'Serving Size')]/../../../div[4]/div/button")
	WebElement Serving_Size_CloseBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Employee Discount')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Employee_Discount_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Employee Discount')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Employee_Discount_NoBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Attach Customer')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Attach_Customer_YesBtn;

	@FindBy(xpath = "//h6[.='Select Membership Plan']")
	WebElement Membership_Plan_Select_Plan_text;

	@FindBy(xpath = "//app-toggle[contains(.,'Attach Customer')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement Attach_Customer_NoBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Coupon Only')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Coupon_Only_YesBtn;

	@FindBy(xpath = "//app-toggle[@name='discountIncludeAdditionalModifiers']//mat-button-toggle[contains(@class,'mat-button-toggle-disabled')]")
	public WebElement Include_Additional_modifier_grayout;

	@FindBy(xpath = "//input[@aria-label='Coupon Code']")
	public WebElement Coupon_Only_InputBox;

	@FindBy(xpath = "//span[contains(.,'Special Characters')]")
	public WebElement Coupon_Only_Input_WarringMgs;

	@FindBy(xpath = "//app-toggle[contains(.,'Coupon Only')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement Coupon_Only_NoBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Auto Discount')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Auto_Discount_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Auto Discount')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement Auto_Discount_NoBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Restrict POS visiblity by user role')]//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Restrict_POS_Visiblity_ByUser_YesBtn;

	@FindBy(xpath = "//app-toggle[contains(.,'Restrict POS visiblity by user role')]//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	WebElement Restrict_POS_Visiblity_ByUser_NoBtn;

	@FindBy(xpath = "//div//h6[.='Select Roles']")
	WebElement Restrict_POS_Visiblity_ByUser_UserRoleList_Text;

	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Promo')]")
	public WebElement Promo_DiscountType_RadioBtn;

	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Comp')]")
	public WebElement Comp_DiscountType_RadioBtn;

	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Donation')]")
	public WebElement Donation_DiscountType_RadioBtn;

	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Loyalty Discount')]")
	public WebElement Loyalty_Discount_DiscountType_RadioBtn;

	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Amount')]")
	public WebElement Amount_DiscountRate_RadioBtn;

	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Percentage')]")
	public WebElement Percentage_DiscountRate_RadioBtn;

	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Set Price')]")
	public WebElement Set_Price_DiscountRate_RadioBtn;

	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Free Item')]")
	public WebElement Free_Item_DiscountRate_RadioBtn;

	@FindBy(xpath = "//label[contains(.,'Coupon Code')]/../../input")
	WebElement Coupon_CodeInputBx;

	@FindBy(xpath = "//label[contains(.,'Amount')]/../../input")
	WebElement Discount_Rate_Amount_inputBox;

	@FindBy(xpath = "//button[contains(.,'Add FreeItem')]")
	WebElement Add_Free_ItemBtn;

	@FindBy(xpath = "//mat-hint[.='Enter Valid Priority']")
	WebElement Enter_Valid_PriorityErrorMsg;

	@FindBy(xpath = "//mat-hint[.='Enter Valid Quantity']")
	WebElement Enter_Valid_QuantityErrorMsg;

	@FindBy(xpath = "//button[contains(.,'AND PUBLISH') and @disabled='true']")
	WebElement Disabled_SaveOrUpdate_Btn;

	@FindBy(xpath = "//button[contains(.,'keyboard_backspace')]")
	WebElement back_Btn;

	@FindBy(xpath = "//input[@aria-label='Name']")
	WebElement Item_Discount_Name;

	@FindBy(xpath = "//label[contains(.,'Priority')]/../../input")
	WebElement PriorityInput;

	@FindBy(xpath = "//input[@aria-label='Name']")
	WebElement Apply_Btn;

	@FindBy(xpath = "//input[@placeholder='Percentage']")
	WebElement Discount_Percentage_inputBox;

	@FindBy(xpath = "//input[@placeholder='Search ']")
	WebElement DisocuntTab_SearchTab;



	public void Enter_Discount_Percentage() {
		Discount_Percentage_inputBox.click();
		Discount_Percentage_inputBox.clear();
		Discount_Percentage_inputBox.sendKeys("10.00");
	}

	public void Clear_Discount_Percentage() {
		Discount_Percentage_inputBox.click();
		Discount_Percentage_inputBox.clear();
	}

	public void Verify_Saved_Discount_is_displayed_are_Not(String value) {
		DisocuntTab_SearchTab.click();
		DisocuntTab_SearchTab.clear();
		DisocuntTab_SearchTab.sendKeys(value);
		try{
			if (driver.findElement(By.xpath("//span[contains(.,'"+value+"')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "Discount is saved successfully and displayed in the discount screen");
			}
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL, "Discount is not saved and displayed in the discount screen");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_Updated_Discount_is_displayed_are_Not(String value) {
		DisocuntTab_SearchTab.click();
		DisocuntTab_SearchTab.clear();
		DisocuntTab_SearchTab.sendKeys(value);
		try{
			if (driver.findElement(By.xpath("//span[contains(.,'"+value+"')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "Discount is updated successfully in the discount screen");
			}
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL, "Discount is not updated in the discount screen");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Select_Item_Based_DiscountTab() {
		Item_Based_ScreenTab.click();
	}

	public void Select_Check_Based_DiscountTab() {
		Check_Based_ScreenTab.click();
	}

	public void Select_Open_Item_DiscountTab() {
		Open_Item_ScreenTab.click();
	}

	public void Select_Open_Check_DiscountTab() {
		Open_Check_ScreenTab.click();
	}

	public void Select_Mix_and_Match_DiscountTab() {
		Mix_and_Match_ScreenTab.click();
	}

	public void Click_New_Discount() {
		New_DiscountBtn.click();
	}

	public void Click_Save_Button_WithoutEntering_data() throws InterruptedException {

		if (SaveandPublish_Btn.isDisplayed()) {
			SaveandPublish_Btn.click();
		}
		back_Btn.click();
		Thread.sleep(3000);
	}

	public void Click_New_Open_Item_Discount() {
		New_Open_Item_DiscountBtn.click();
	}

	public void Click_New_Open_Check_Discount() {
		New_Open_Check_DiscountBtn.click();
	}

	public void Select_BeforeTax() throws Exception {
		Thread.sleep(1000);
		Apply_DropDownBtn.click();
		Thread.sleep(1000);
		Before_TaxBtn.click();

	}


	public void Verifythe_CategoryOptionSelectedDefault() throws Exception {
		Thread.sleep(1000);
		cmp.Level_Tab_inContents.click();
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Category']")).isDisplayed()) {

	   }else{
			driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Category']")).click();
	    }

	}


	public void Verifythe_PercentageOptionSelectedDefault() throws Exception {
		Thread.sleep(1000);
		cmp.Discount_Rate_Tab_inContents.click();
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Percentage']")).isSelected()) {
			test.log(LogStatus.PASS, "The Percentage is selected as default in the discount rate");
		}else{
			test.log(LogStatus.FAIL, "The Percentage is not selected as default in the discount rate");
			ut.FailedCaptureScreenshotAsBASE64();
			driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Percentage']")).click();
		}
	}

	public void Verify_the_PercentageOptionSelectedDefaultIn_Offers() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'Offers')][contains(@class,'segment-button')]")).click();
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Percentage']")).isSelected()) {
			test.log(LogStatus.PASS, "The Percentage is selected as default in the Offers");
		}else{
			test.log(LogStatus.FAIL, "The Percentage is not selected as default in the Offers");
			ut.FailedCaptureScreenshotAsBASE64();
			driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Percentage']")).click();
		}
	}

	@FindBy(xpath = "//app-auto-complete[@label='Category']//input[@type='text']")
	public WebElement CategoryDropBtn;

	@FindBy(xpath = "//app-auto-complete[@label='Sub Category']//input[@type='text']")
	public WebElement SubCategoryDropBtn;

	@FindBy(xpath = "//app-auto-complete[@name='discountMenuItems']//input[@type='text']")
	public WebElement MenuItemDropBtn;

	@FindBy(xpath = "//button[@aria-label='Close']")
	public WebElement Closetab_IN_DiscountType;

	@FindBy(xpath = "//div[@class='radio-box']//div[.='Sub Category']")
	public WebElement SubCategoryBtn;

	@FindBy(xpath = "//div[@class='radio-box']//div[.='Menu Item']")
	public WebElement SelectMenuItemTab;

	@FindBy(xpath = "//div[@class='radio-box']//div[.='Category']")
	public WebElement CategoryBtn;


	public void SelectSubCategoryTab() throws Exception {
		Thread.sleep(1000);
		SubCategoryBtn.click();
	}

	public void SelectMenuItemTab() throws Exception {
		Thread.sleep(1000);
		SelectMenuItemTab.click();
	}

	public void Select_Closebtn_In_DiscountTypeLevel() throws Exception {
		cmp.Discount_Rate_Tab_inContents.click();
		Thread.sleep(1000);
		Closetab_IN_DiscountType.click();
	}

	public void iCheckTheRemovedOptionIsNotPresentInTheCurrentOptions() throws Exception {

		Thread.sleep(1000);
		List<WebElement> list1 = driver.findElements(By.xpath("//mat-chip[@role='group']//div[contains(@class,'content-between')]//mat-icon[.='cancel']"));
		int count = list1.size();
		List<WebElement> list = driver.findElements(By.xpath("//mat-chip[@role='group']//div[contains(.,'"+removing_category+"')]"));
		if (count == Category_count) {
			if (list.isEmpty()) {
				test.log(LogStatus.PASS, "The Removed Selected Category is not get shown");
			} else {
				test.log(LogStatus.FAIL, "The Removed Selected Category is get shown");
				ut.FailedCaptureScreenshotAsBASE64();
				int i = 1/0;
			}
		}
		else {
			test.log(LogStatus.FAIL, "The Removed Selected Category is get shown");
			ut.FailedCaptureScreenshotAsBASE64();
			int i = 1/0;
		}
	}

	public void iRemoveLastOptionInTheSelectedOptions() throws Exception {
//		cmp.Discount_Rate_Tab_inContents.click();
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//mat-chip[@role='group']//div[contains(@class,'content-between')]//mat-icon[.='cancel']"));
		int count = list.size();
		String name = driver.findElement(By.xpath("(//mat-chip[@role='group']//div[contains(@class,'content-between')])["+count+"]")).getText();
		removing_category = name;
		driver.findElement(By.xpath("(//mat-chip[@role='group']//div[contains(@class,'content-between')]//mat-icon[.='cancel'])["+count+"]")).click();
		Category_count = list.size();
	}

	public void verifyWhetherSelectedCategoryIsRemovedOrNot() throws Exception {
		Thread.sleep(1000);
		CategoryBtn.click();
		try {
			if (driver.findElement(By.xpath("//mat-chip[@role='group']")).isDisplayed()){
				List<WebElement> cat_list = driver.findElements(By.xpath("//mat-chip[@role='group']"));
			    int count = 0;
				count = cat_list.size();
				if (count==0) {
					test.log(LogStatus.PASS, "The Selected Category is not get shown");
				}else {
					test.log(LogStatus.FAIL, "The Selected Category is shown");
					ut.FailedCaptureScreenshotAsBASE64();
				}
			}
		}catch (Exception e) {
		}
	}
	public void iSelectTheMultipleCategory() throws Exception {

		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(2000);
		cmp.Click_DropDown_withSearch_MultipleSelection(CategoryDropBtn, "Category Selected");
	}


	public void iSelectTheMultipleSubCategory() throws Exception {

		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(2000);
		cmp.Click_DropDown_withSearch_MultipleSelection(SubCategoryDropBtn, "Category Selected");
	}

	public void iSelectTheMultipleMenuItems() throws Exception {
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(2000);
		cmp.Click_DropDown_withSearch_MultipleSelection(MenuItemDropBtn, "Category Selected");
	}


	public void verifyWhetherTheItemBasedDiscountIsSavedWithPriorityAsDecimalOrNot() throws Exception {
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(1000);
		WebElement save_Btn = driver.findElement(By.xpath("//button[contains(.,'SAVE AND PUBLISH')]"));
		if (save_Btn.isEnabled()) {
			test.log(LogStatus.FAIL, "the Item Based Discount is not Saved with Priority as Decimal or not");
			ut.FailedCaptureScreenshotAsBASE64();
		}else{
			test.log(LogStatus.PASS, "the Item Based Discount is Saved with Priority as Decimal or not");
		}
	}

	public void verifyWhetherTheCheckBasedDiscountIsSavedWithPriorityAsDecimalOrNot() throws Exception {
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(1000);
		WebElement save_Btn = driver.findElement(By.xpath("//button[contains(.,'SAVE AND PUBLISH')]"));
		if (save_Btn.isEnabled()) {
			test.log(LogStatus.FAIL, "the Check Based Discount is not Saved with Priority as Decimal or not");
			ut.FailedCaptureScreenshotAsBASE64();
		}else{
			test.log(LogStatus.PASS, "the Check Based Discount is Saved with Priority as Decimal or not");
		}
	}


	public void verifyWhetherWeAbleToSaveTheItemBasedDiscountWithSingleLetter() throws Exception {
		Thread.sleep(1000);
		cmp.Genaral_Tab_inContents.click();
		Thread.sleep(1000);
		WebElement save_Btn = driver.findElement(By.xpath("//button[contains(.,'SAVE AND PUBLISH')]"));
		if (save_Btn.isEnabled()) {
			test.log(LogStatus.PASS, "The Save and Publish button is enabled successfully after creating the discount with the single letter name");
		}else{
			test.log(LogStatus.FAIL, "The Save and Publish button is disabled after creating the discount with the single letter name");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


	public void Select_AfterTax() throws Exception
	{
		Thread.sleep(1000);
		Apply_DropDownBtn.click();
		Thread.sleep(1000);
		After_TaxBtn.click();
		
	}
	
	public WebElement Apply_DropDown()
	{
		return Apply_DropDownBtn;
	}
	
	public void Enable_CombineWithOtherDiscount()
	{
		if(CombineWithOtherDiscount_YesBtn.isSelected())
		{
			
		}
		else
		{
			CombineWithOtherDiscount_YesBtn.click();
		}
	}

	public void Disable_CombineWithOtherDiscount()
	{
		if(CombineWithOtherDiscount_YesBtn.isSelected())
		{
			CombineWithOtherDiscount_NoBtn.click();
		}
		else
		{

		}
	}

	public void verifyWhetherApplyForDiscountedPriceIsShown()
	{
		if(ApplyForDiscountedPrice_YesBtn.isDisplayed())
		{
			test.log(LogStatus.PASS, "Apply For Discounted Price is shown in the Discount");
		}
		else
		{
			test.log(LogStatus.FAIL, "Apply For Discounted Price is not shown in the Discount");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyWhetherCouponOnlyAndAutoDiscountToggleIsNotShownIfLoyaltyDiscountTypeIsSelected()
	{
		List<WebElement> d = driver.findElements(By.xpath("//span[contains(.,'Coupon Only')]"));
		List<WebElement> d1 = driver.findElements(By.xpath("//span[contains(.,'Auto Discount')]"));

		if(d.isEmpty() && d1.isEmpty()){
			test.log(LogStatus.PASS,"Coupon only and Auto Discount is not get shown while Loyalty discount type is selected");
		}else {
			test.log(LogStatus.FAIL, "Coupon only and Auto Discount is get shown while Loyalty discount type is selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Enable_IncludeAdditionalModifiers()
	{
		if(IncludeAdditionalModifiers_YesBtn.isSelected())
		{

		}
		else
		{
			IncludeAdditionalModifiers_YesBtn.click();
		}
	}

	public void Verify_IncludeAdditionalModifiers_Is_Enabled()
	{
		if(IncludeAdditionalModifiers_YesBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Include addition modifier toggle is enabled");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Include addition modifier toggle is disable");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_CombineWithOtherDiscount_Is_Enabled()
	{
		if(CombineWithOtherDiscount_YesBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Combine with other discount toggle is enabled");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Combine with other discount toggle is disable");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountTypeAS_Promo_Is_Selected()
	{
		if(Promo_DiscountType_RadioBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Type as Promo is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Type as Promo is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountTypeAS_Comp_Is_Selected()
	{
		if(Comp_DiscountType_RadioBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Type as Comp is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Type as Comp is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountTypeAS_Donation_Is_Selected()
	{
		if(Donation_DiscountType_RadioBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Type as Donation is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Type as Donation is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountTypeAS_Loyalty_Is_Selected()
	{
		if(Loyalty_Discount_DiscountType_RadioBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Type as Loyalty is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Type as Loyalty is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountRate_As_Amount_Is_Selected()
	{
		if(Amount_DiscountRate_RadioBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Rate as Amount is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Rate as Amount is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountRate_As_FreeItem_Is_Selected()
	{
		if(Free_Item_DiscountRate_RadioBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Rate as Free Item is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Rate as Free Item is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountRate_As_BeforeTax_Is_Selected()
	{
		if(Before_TaxBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Before Tax is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Before Tax is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountRate_As_SetPrice_Is_Selected()
	{
		if(Set_Price_DiscountRate_RadioBtn.isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Rate as Set Price is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Rate as Set Price is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountTypeAS_Category_Is_Selected()
	{
		if(driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Category']")).isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Type as Category is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Type as Category is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountTypeAS_SubCategory_Is_Selected()
	{
		if(driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Sub Category']")).isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Type as Sub_Category is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Type as Sub_Category is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_DiscountTypeAS_MenuItem_Is_Selected()
	{
		if(driver.findElement(By.xpath("//div[@class='radio-box']//div[.='Menu Item']")).isSelected())
		{
			test.log(LogStatus.PASS, "The Discount Type as Menu Item is Selected");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Discount Type as Menu Item is not Selected");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Disable_IncludeAdditionalModifiers()
	{
		if(IncludeAdditionalModifiers_YesBtn.isEnabled()) 
		{
			IncludeAdditionalModifiers_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public WebElement IncludeAdditionalModifiers_YesButton()
	{
		return IncludeAdditionalModifiers_YesBtn;
	}
	
	public void Enable_Combine_WithOther_Discount()
	{
		if(Combine_WithOther_Discount_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Combine_WithOther_Discount_YesBtn.click();
		}
	}
	
	public void Disable_Combine_WithOther_Discount()
	{
		if(Combine_WithOther_Discount_YesBtn.isEnabled()) 
		{
			Combine_WithOther_Discount_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public WebElement Combine_WithOther_Discount_YesButton()
	{
		return Combine_WithOther_Discount_YesBtn;
	}
	
	public void Enable_All_Serving_Size_inCategory()
	{
		if(All_Serving_Sizes_inCategory_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			All_Serving_Sizes_inCategory_YesBtn.click();
		}
	}
	
	public void Disable_All_Serving_Size_inCategory() throws Exception
	{
		try
		{
		if(All_Serving_Sizes_inCategory_YesBtn.isEnabled()) 
		{
			All_Serving_Sizes_inCategory_NoBtn.click();
		}
		}
		catch(Exception l)
		{
		
		}
	}

	public void All_Serving_Size_inCategory_Checking_PopulatedORNot() throws Exception
	{
		try{
		if (driver.findElement(By.xpath("//input[@aria-label='Serving Size']")).isDisplayed()) {

			WebElement serving_Size_NameList = driver.findElement(By.xpath("//input[@aria-label='Serving Size']/../mat-chip"));
			WebElement serving_Size_NameList1 = driver.findElement(By.xpath("//input[@aria-label='Serving Size']/../input[contains(@placeholder,'items selected')]"));

			if (serving_Size_NameList.isDisplayed() || serving_Size_NameList1.isDisplayed()) {
				test.log(LogStatus.PASS, "Serving Size is shown for the selected Category");
			}else {
				test.log(LogStatus.FAIL, "Serving Size is not shown for the selected Category");
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}

		}catch (Exception e) {
		}
	}

	public void All_Serving_Size_inSubCategory_Checking_PopulatedORNot() throws Exception
	{
		try{
			if (driver.findElement(By.xpath("//input[@aria-label='Serving Size']")).isDisplayed()) {

				WebElement serving_Size_NameList = driver.findElement(By.xpath("//input[@aria-label='Serving Size']/../mat-chip"));
				WebElement serving_Size_NameList1 = driver.findElement(By.xpath("//input[@aria-label='Serving Size']/../input[contains(@placeholder,'items selected')]"));

				if (serving_Size_NameList.isDisplayed() || serving_Size_NameList1.isDisplayed()) {
					test.log(LogStatus.PASS, "Serving Size is shown for the selected Sub-Category");
				}else {
					test.log(LogStatus.FAIL, "Serving Size is not shown for the selected Sub-Category");
					ut.FailedCaptureScreenshotAsBASE64();
				}
			}

		}catch (Exception e) {
		}
	}

	public void iSearchAndEditTheItemBasedDiscount(String Value) throws Exception
	{
		DisocuntTab_SearchTab.click();
		DisocuntTab_SearchTab.clear();
		DisocuntTab_SearchTab.sendKeys(Value);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Edit']")).click();
		Thread.sleep(4000);
	}

	public void iSearchAndEditTheCheckBasedDiscount(String Value) throws Exception
	{
		DisocuntTab_SearchTab.click();
		DisocuntTab_SearchTab.clear();
		DisocuntTab_SearchTab.sendKeys(Value);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Edit']")).click();
		Thread.sleep(4000);
	}

	public void iSearchAndDeleteTheItemBasedDiscount(String Value) throws Exception
	{
		DisocuntTab_SearchTab.click();
		DisocuntTab_SearchTab.clear();
		DisocuntTab_SearchTab.sendKeys(Value);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Delete']")).click();
		Thread.sleep(1000);
	}

	public void All_Serving_Size_inMenuItem_Checking_PopulatedORNot() throws Exception
	{
		try{
			if (driver.findElement(By.xpath("//input[@aria-label='Serving Size']")).isDisplayed()) {

				WebElement serving_Size_NameList = driver.findElement(By.xpath("//input[@aria-label='Serving Size']/../mat-chip"));
				WebElement serving_Size_NameList1 = driver.findElement(By.xpath("//input[@aria-label='Serving Size']/../input[contains(@placeholder,'items selected')]"));

				if (serving_Size_NameList.isDisplayed() || serving_Size_NameList1.isDisplayed()) {
					test.log(LogStatus.PASS, "Serving Size is shown for the selected MenuItems");
				}else {
					test.log(LogStatus.FAIL, "Serving Size is not shown for the selected MenuItems");
					ut.FailedCaptureScreenshotAsBASE64();
				}
			}

		}catch (Exception e) {
		}
	}
	
	public void Select_Serving_Size() throws Exception
	{
//		Thread.sleep(1000);
		//Click the Cancel
//		Serving_Size_CloseBtn.click();
		
		Thread.sleep(1000);
		Serving_SizeInputBx.click();

//		for(int i=1;i<=3;i++)
//		{
			Thread.sleep(2000);
		Serving_SizeInputBx.click();
//		Thread.sleep(1000);
//		List<WebElement> CategoryList=driver.findElements(By.xpath("//div[@class='options with-height']//div/div/select-option"));
//		
//		int CategorySize=CategoryList.size();
//		
//		
//		int randomCategory=ThreadLocalRandom.current().nextInt(2, CategorySize);
//		
//		driver.findElement(By.xpath("//div[@class='options with-height']//div/div["+randomCategory+"]/select-option")).click();
		
		driver.findElement(By.xpath("//div[@class='options with-height']//div/div[1]/select-option")).click();
		
		
	
//		Thread.sleep(1000);
//		Serving_SizeInputBx.click();

//		}
	}


	public void Enter_Quantity() throws Exception
	{

		Thread.sleep(1000);
		Quantity_InputBox.click();

		Quantity_InputBox.clear();

		Quantity_InputBox.sendKeys("1");

	}

	public void Enter_Price_FreeItemDiscount() throws Exception
	{

		Thread.sleep(1000);
		Price_InputBox_FreeItemDiscount.click();

		Price_InputBox_FreeItemDiscount.clear();

		Price_InputBox_FreeItemDiscount.sendKeys("10.00");

	}

	public void Delete_Price_FreeItemDiscount() throws Exception
	{
		Thread.sleep(1000);
		Delete_FreeItemDiscount_Price.click();

		Click_Delete_Confirm_Btn.click();
		Thread.sleep(1000);
	}
	
	public WebElement All_Serving_Size_inCategory_YesButton()
	{
		return All_Serving_Sizes_inCategory_YesBtn;
	}
	
	public void Select_Promo_DiscountType()
	{
		cmp.Level_Tab_inContents.click();
		Promo_DiscountType_RadioBtn.click();
	}
	
	public WebElement Promo_DiscountType()
	{
		return Promo_DiscountType_RadioBtn;
	}
	
	public void Select_Comp_DiscountType()
	{
		Comp_DiscountType_RadioBtn.click();
	}
	
	public WebElement Comp_DiscountType()
	{
		return Comp_DiscountType_RadioBtn;
	}
	
	public void Select_Donation_DiscountType()
	{
		Donation_DiscountType_RadioBtn.click();
	}
	
	public WebElement Donation_DiscountType()
	{
		return Donation_DiscountType_RadioBtn;
	}
	
	public void Select_Loyalty_Discount_DiscountType()
	{
		Loyalty_Discount_DiscountType_RadioBtn.click();
	}
	
	public WebElement Loyalty_Discount_DiscountType()
	{
		return Loyalty_Discount_DiscountType_RadioBtn;
	}

	public void ClickON_Loyalty_Discount_DiscountType()
	{
		cmp.Discount_Rate_Tab_inContents.click();
		Loyalty_Discount_DiscountType().click();
	}

	public void Verify_RestrictPOSVisibilityByUserRole_Enbaled() throws Exception {
		if (Restrict_POS_Visiblity_ByUser_NoBtn.isSelected()) {
			test.log(LogStatus.PASS, "The Restrict POS Visibility By User Role is Disabled");
		} else {
			test.log(LogStatus.FAIL, "The Restrict POS Visibility By User Role is Enabled");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verify_RestrictPOSVisibilityByUserRole_UserDisplayed() throws Exception {
		if (driver.findElements(By.xpath(" //app-chip[@name='discountUserRoles']//mat-chip")).isEmpty()) {
			test.log(LogStatus.FAIL, "The Restrict POS Visibility By User Role - The Users Role is not displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		} else {
			test.log(LogStatus.PASS, "The Restrict POS Visibility By User Role - The Users Role is displayed");
		}
	}

	
	public void Enable_Employee_Discount()
	{
		if(Employee_Discount_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Employee_Discount_YesBtn.click();
		}
	}
	
	public void Disable_Employee_Discount() throws Exception
	{
		try
		{
		if(Employee_Discount_YesBtn.isEnabled()) 
		{
			Employee_Discount_NoBtn.click();
		}
		}
		catch(Exception l)
		{
		
		}
	}
	
	public WebElement Employee_Discount_Yes()
	{
		return Employee_Discount_YesBtn;
	}

	public void Coupon_Only_InputBox_PresentOrNot()
	{
		try {
			if (Coupon_Only_InputBox.isDisplayed()) {
				test.log(LogStatus.PASS, "Coupon only Input text box is displayed after enabling the coupon only toggle");

			} else {
				test.log(LogStatus.FAIL, "Coupon only Input text box is not displayed after enabling the coupon only toggle");
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}catch (Exception e) {}
	}

	public void verifySpecialCharactersWontAllowDisclaimerIsShownOrNot()
	{
			if (Coupon_Only_Input_WarringMgs.isDisplayed()) {
				test.log(LogStatus.PASS, "Coupon only Input text box Special Characters Won't Allow Disclaimer Is Shown");

			} else {
				test.log(LogStatus.FAIL, "Coupon only Input text box Special Characters Won't Allow Disclaimer Is not Shown");
				ut.FailedCaptureScreenshotAsBASE64();
			}
	}

	public void iSelcetAmountAsDiscountRate()
	{
		cmp.Discount_Rate_Tab_inContents.click();
		Amount_DiscountRate_RadioBtn.click();
	}
	
	public void Enable_Coupon_Only()
	{
		if(Coupon_Only_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Coupon_Only_YesBtn.click();
		}
	}
	
	public void Disable_Coupon_Only() throws Exception
	{
		try
		{
		if(Coupon_Only_YesBtn.isEnabled()) 
		{
			Coupon_Only_NoBtn.click();
		}
		}
		catch(Exception l)
		{
		
		}
	}
	
	public WebElement Coupon_Only_Yes()
	{
		return Coupon_Only_YesBtn;
	}
	
	public void Enter_Coupon_Code(String str) throws Exception
	{
		Thread.sleep(1000);
		Coupon_CodeInputBx.clear();
		Thread.sleep(1000);
		Coupon_CodeInputBx.sendKeys(str);
		
	}

	public void Enter_Discount_Amount(String str) throws Exception
	{
		Thread.sleep(1000);
		Discount_Rate_Amount_inputBox.clear();
		Thread.sleep(1000);
		Discount_Rate_Amount_inputBox.sendKeys(str);

	}
	
	public WebElement Coupon_Code_InputBox()
	{
		return Coupon_CodeInputBx;
	}
	
	public void Enable_Auto_Discount()
	{
		if(Auto_Discount_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Auto_Discount_YesBtn.click();
		}
	}
	
	public void Disable_Auto_Discount() throws Exception
	{
	
		if(Auto_Discount_YesBtn.isEnabled()) 
		{
			Auto_Discount_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public WebElement Auto_Discount_YesToggle()
	{
		return Auto_Discount_YesBtn;
	}
	
	public void Enable_Attach_Customer()
	{
		if(Attach_Customer_YesBtn.isSelected())
		{

		}
		else
		{
			Attach_Customer_YesBtn.click();
		}
	}
	
	public void Disable_Attach_Customer() throws Exception
	{
		try
		{
		if(Attach_Customer_YesBtn.isEnabled()) 
		{
			Attach_Customer_NoBtn.click();
		}
		}
		catch(Exception l)
		{
		
		}
	}


	public void Select_Membership_plan() throws Exception
	{

		if (Membership_Plan_Select_Plan_text.isDisplayed()) {
			driver.findElement(By.xpath("//button[contains(.,'Show All')]")).click();
			List<WebElement> plan_List = driver.findElements(By.xpath("//app-chip[@name='discountMemberShipPlan']//mat-chip[@role='option']"));
			int optionSize1=plan_List.size();
				int randomOpt = ThreadLocalRandom.current().nextInt(1, optionSize1);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//app-chip[@name='discountMemberShipPlan']//mat-chip[@role='option']["+randomOpt+"]")).click();
		}

	}
	public WebElement Attach_Customer_YesToggle()
	{
		return Attach_Customer_YesBtn;
	}
	
	
	public void Enable_Restrict_POS_Visiblity_ByUser()
	{
		if(Restrict_POS_Visiblity_ByUser_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Restrict_POS_Visiblity_ByUser_YesBtn.click();
		}
	}
	
	public void Disable_Restrict_POS_Visiblity_ByUser() throws Exception
	{
		try
		{
		if(Restrict_POS_Visiblity_ByUser_YesBtn.isEnabled()) 
		{
			Restrict_POS_Visiblity_ByUser_NoBtn.click();
		}
		}
		catch(Exception l)
		{
		
		}
	}
	
	public WebElement Restrict_POS_Visiblity_ByUser_YesToggle()
	{
		return Restrict_POS_Visiblity_ByUser_YesBtn;
	}
	
	public void Click_Amount_DiscountRateType()
	{
		Amount_DiscountRate_RadioBtn.click();
	}

	public void Clear_Discount_Name() throws InterruptedException {
		Item_Discount_Name.click();
		Item_Discount_Name.clear();
		Thread.sleep(200);
		Item_Discount_Name.sendKeys("Valuechecking");
		Thread.sleep(200);
		Item_Discount_Name.clear();
	}

	public void Clear_Discount_Priority() throws InterruptedException {
		Thread.sleep(500);
		PriorityInput.clear();
		PriorityInput.sendKeys("8");
		Thread.sleep(500);
		PriorityInput.clear();
	}

	public void Select_UserRole() throws Exception
	{

		if (Restrict_POS_Visiblity_ByUser_UserRoleList_Text.isDisplayed()) {
			driver.findElement(By.xpath("//app-chip[@name='discountUserRoles']//button[contains(.,'Show All')]")).click();
			List<WebElement> plan_List = driver.findElements(By.xpath("//app-chip[@name='discountUserRoles']//mat-chip[@role='option']"));
			int optionSize1=plan_List.size();
			int randomOpt = ThreadLocalRandom.current().nextInt(1, optionSize1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-chip[@name='discountUserRoles']//mat-chip[@role='option']["+randomOpt+"]")).click();
		}

	}
	
	public WebElement Amount_DiscountRateType()
	{
		return Amount_DiscountRate_RadioBtn;
	}
	
	public void Click_Percentage_DiscountRateType()
	{
		cmp.Discount_Rate_Tab_inContents.click();
		Percentage_DiscountRate_RadioBtn.click();
	}

	public void Click_Percentage_Discount_In_Offers()
	{
		Percentage_DiscountRate_RadioBtn.click();
	}
	
	public WebElement Percentage_DiscountRateType()
	{
		return Percentage_DiscountRate_RadioBtn;
	}
	
	public void Click_Set_Price_DiscountRateType()
	{
		Set_Price_DiscountRate_RadioBtn.click();
	}
	
	public WebElement Set_Price_DiscountRateType()
	{
		return Set_Price_DiscountRate_RadioBtn;
	}
	
	public void Click_Free_Item_DiscountRateType()
	{
		Free_Item_DiscountRate_RadioBtn.click();
	}
	
	public WebElement Free_Item_DiscountRateType()
	{
		return Free_Item_DiscountRate_RadioBtn;
	}
	
	@FindBy(xpath = "//app-chip[@name='discountUserRoles']//span[contains(.,'Show All')]")
	WebElement Show_All_inRoles;
	
	//Select Roles
	public void Select_Restrict_POS_VisibilityRoles() throws Exception
	{
		Thread.sleep(1000);
		
		if(Restrict_POS_Visiblity_ByUser_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Restrict_POS_Visiblity_ByUser_YesBtn.click();
		}
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		List<WebElement> SubCategoryList=driver.findElements(By.xpath("//app-chip[@name='discountUserRoles']/div/mat-chip-list/div/mat-chip"));
		int size=SubCategoryList.size()-1;
		
		for(int i=1;i<=3;i++)
		{
			try
			{
				if(Show_All_inRoles.isDisplayed())
				{
					Show_All_inRoles.click();
				}
			}
			catch(Exception lp) {}
//		int SubCategorySize=SubCategoryList.size();
//		
//		
//		int randomSubCategory=ThreadLocalRandom.current().nextInt(2, SubCategorySize);
//		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-chip[@name='discountUserRoles']/div/mat-chip-list/div/mat-chip["+i+"]")).click();
		
		Thread.sleep(1000);
		}
	}
	
	public void Verify_Enter_Valid_PriorityErrorMessage()
	{
		try
		{
		if(Enter_Valid_PriorityErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Priority is Displayed");
		}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "Enter Valid Priority is not Displayed");
		ut.FailedCaptureScreenshotAsBASE64();
		}
	}


	public void verifyCouponOnlyAutoDiscountAndAttachCustomerTogglesAreNotDisplayed()
	{
		try
		{
			if(Attach_Customer_YesBtn.isDisplayed() && Auto_Discount_YesBtn.isDisplayed() && Coupon_Only_YesBtn.isDisplayed())
			{
				test.log(LogStatus.FAIL, "The Coupon only, Auto Discount, and Attach Customer fields are shown in the Discount page");
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.PASS, "The Coupon only, Auto Discount, and Attach Customer fields are not shown in the Discount page");
		}
	}

	public void verifyAttachCustomerToggleisNotDisplayed()
	{
		try
		{
			if(Attach_Customer_YesBtn.isDisplayed())
			{
				test.log(LogStatus.FAIL, "The Attach Customer field is shown in the Discount page");
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.PASS, "The Attach Customer field is not shown in the Discount page");
		}
	}

	public void verifyAutoDiscountToggleisNotDisplayed()
	{
		try
		{
			if(Auto_Discount_YesBtn.isDisplayed())
			{
				test.log(LogStatus.FAIL, "Auto Discount field is shown in the Discount page");
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.PASS, "Auto Discount field is not shown in the Discount page");
		}
	}

	public void verifyCouponOnlyToggleisNotDisplayed()
	{
		try
		{
			if(Coupon_Only_YesBtn.isDisplayed())
			{
				test.log(LogStatus.FAIL, "The Coupon only field is shown in the Discount page");
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.PASS, "The Coupon only field is not shown in the Discount page");
		}
	}


	public void iClickSaveandPublish() throws InterruptedException {
		cmp.Save_and_PublishButton().click();
		Thread.sleep(4000);
	}

	public void iClickUpdateandPublish() throws InterruptedException {
		cmp.Update_and_PublishButton().click();
		Thread.sleep(4000);
	}

	public void verifyCouponOnlyAutoDiscountAndAttachCustomerTogglesAreDisplayed()
	{
		try
		{
			if(Attach_Customer_YesBtn.isDisplayed() && Auto_Discount_YesBtn.isDisplayed() && Coupon_Only_YesBtn.isDisplayed())
			{
				test.log(LogStatus.PASS, "The Coupon only, Auto Discount, and Attach Customer fields are shown in the Discount page");
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "The Coupon only, Auto Discount, and Attach Customer fields are not shown in the Discount page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyAttachCustomerToggleIsDisplayed()
	{
		try
		{
			if(Attach_Customer_YesBtn.isDisplayed())
			{
				test.log(LogStatus.PASS, "The Attach Customer field is shown in the Discount page");
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "The Attach Customer field is not shown in the Discount page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyAutoDiscountToggleIsDisplayed()
	{
		try
		{
			if(Auto_Discount_YesBtn.isDisplayed())
			{
				test.log(LogStatus.PASS, "Auto Discount field is shown in the Discount page");
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "Auto Discount field is not shown in the Discount page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyCouponOnlyToggleIsDisplayed()
	{
		try
		{
			if(Coupon_Only_YesBtn.isDisplayed())
			{
				test.log(LogStatus.PASS, "The Coupon only field is shown in the Discount page");
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "The Coupon only field is not shown in the Discount page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyIncludeAdditionalModifiersToggleIsGrayedOut()
	{
			if(Coupon_Only_YesBtn.isDisplayed())
			{
				test.log(LogStatus.PASS, "The Coupon only field is shown in the Discount page");
			}
			else {
				test.log(LogStatus.FAIL, "The Coupon only field is not shown in the Discount page");
				ut.FailedCaptureScreenshotAsBASE64();
			}
	}

	public void verifyAttachCustomerToggleIsEnabled()
	{
		try
		{
			if(Attach_Customer_YesBtn.isEnabled())
			{
				test.log(LogStatus.PASS, "The Attach Customer field toggle is enabled in the Discount page");
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "The Attach Customer field toggle is not enabled in the Discount page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyAutoDiscountToggleIsEnabled()
	{
		try
		{
			if(Auto_Discount_YesBtn.isEnabled())
			{
				test.log(LogStatus.PASS, "Auto Discount field toggle is enabled in the Discount page");
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "Auto Discount field toggle is not enabled in the Discount page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyCouponOnlyToggleIsEnabled()
	{
		try
		{
			if(Coupon_Only_YesBtn.isEnabled())
			{
				test.log(LogStatus.PASS, "The Coupon only field toggle is enabled in the Discount page");
			}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "The Coupon only field toggle is not enabled in the Discount page");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Verify_Enter_Valid_QuantityErrorMessage()
	{
		try
		{
		if(Enter_Valid_QuantityErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Quantity is Displayed");
		}
		}
		catch(Exception j)
		{
			test.log(LogStatus.FAIL, "Enter Valid Quantity is not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Click_Add_FreeItem()
	{
		Add_Free_ItemBtn.click();
	}
	
	/////////////////////// Check Based  ///////////////////
	
	@FindBy(xpath = "//button[contains(.,'Add Offer')]")
	WebElement Add_OfferBtn;
	
	public void Delete_AddOfferBtn() throws Exception
	{
		cmp=new Common_XPaths();
		
		List<WebElement> Offers_list=driver.findElements(By.xpath("//div[@id='new-discount-offers']/div[2]/div/mat-accordion/app-accordion/div/mat-expansion-panel/mat-expansion-panel-header/span/div/div[4]/div/div/button"));
		
		try
		{
//		for(int i=1;i<=Offers_list.size();i++)
//		{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='new-discount-offers']/div[2]/div/mat-accordion/app-accordion[2]/div/mat-expansion-panel/mat-expansion-panel-header/span/div/div[4]/div/div/button")).click();

		Thread.sleep(1000);
		cmp.Click_DeleteButton();
//		}
		}
		catch(Exception k)
		{
			try
			{
			if(driver.findElement(By.xpath("//div[@id='new-discount-offers']/div[2]/div/mat-accordion/app-accordion[1]/div/mat-expansion-panel/mat-expansion-panel-header/span/div/div[4]/div/div/button")).isDisplayed())
			{
				test.log(LogStatus.FAIL, "Already Added Offer Not Available");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
			}
			catch(Exception pl) {}
		}
		
		try
		{
			if(Set_Price_DiscountRate_RadioBtn.isDisplayed())
			{
				
			}
		}
		catch(Exception g)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='new-discount-offers']/div[2]/div/mat-accordion/app-accordion[1]/div/mat-expansion-panel/mat-expansion-panel-header/span")).click();
		}
	
	}
	
	
	public void Click_Add_Offer()
	{
		Add_OfferBtn.click();
	}
	
	@FindBy(xpath = "//label[contains(.,'Category')]/../../../div/div/input")
	WebElement Category_InputBox;

	@FindBy(xpath = "(//app-auto-complete[contains(@name,'discountMenuItems')]//div/input)[1]")
	WebElement MenuItem_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Check Total')]/../../input")
	WebElement Check_TotalInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Set Price')]/../../input")
	WebElement Set_PriceInputBx;
	
	
	public void Enter_Check_Total(String str) throws Exception
	{
		Thread.sleep(1000);
		Check_TotalInputBx.clear();
		Thread.sleep(1000);
		Check_TotalInputBx.sendKeys(str);
	}
	
	public WebElement Check_Total_InpuBox()
	{
		return Check_TotalInputBx;
	}
	
	public WebElement Set_Price_InpuBox()
	{
		return Set_PriceInputBx;
	}
	
	
	public void Enter_Set_Price(String str) throws Exception
	{
		Thread.sleep(1000);
		Set_PriceInputBx.clear();
		Thread.sleep(1000);
		Set_PriceInputBx.sendKeys(str);
	}
	
	public void Select_Exclude_Category() throws Exception
	{
		
		Thread.sleep(15000);
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
		Category_InputBox.click();
		
		Thread.sleep(1000);
		List<WebElement> CategoryList=driver.findElements(By.xpath("//div/select-option"));
		
		int CategorySize=CategoryList.size();
		
	
			if(CategorySize<=6)
			{
		
			int randomCategory=ThreadLocalRandom.current().nextInt(2, CategorySize);
			
			
			driver.findElement(By.xpath("//div["+randomCategory+"]/select-option")).click();
			}
			else
			{
				int randomCategory=ThreadLocalRandom.current().nextInt(2, 6);
				
				
				driver.findElement(By.xpath("//div["+randomCategory+"]/select-option")).click();
			
			}
			Thread.sleep(1000);
			List<WebElement> CategoryList1=driver.findElements(By.xpath("//div/select-option"));
			if(CategoryList1.size()!=0)
			{
//				test.log(LogStatus.FAIL, "SubCategory lists are displayed after Selecting the required SubCategory");
				Thread.sleep(1000);
				Category_InputBox.click();
			}
		
		}

	}
	
	public void Select_Exclude_MenuItems() throws Exception
	{
		
		Thread.sleep(15000);
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
		MenuItem_InputBox.click();
		
		Thread.sleep(1000);
		List<WebElement> MenuList=driver.findElements(By.xpath("//div/select-option"));
		
		int MenuSize=MenuList.size();
		
	
			if(MenuSize<=6)
			{
		
			int randomMenu=ThreadLocalRandom.current().nextInt(3, MenuSize);
			
			
			driver.findElement(By.xpath("//div["+randomMenu+"]/select-option")).click();
			}
			else
			{
				int randomMenu=ThreadLocalRandom.current().nextInt(3, 6);
				
				
				driver.findElement(By.xpath("//div["+randomMenu+"]/select-option")).click();
			
			}
			Thread.sleep(1000);
			List<WebElement> MenuList1=driver.findElements(By.xpath("//div/select-option"));
			if(MenuList1.size()!=0)
			{
//				test.log(LogStatus.FAIL, "SubCategory lists are displayed after Selecting the required SubCategory");
				Thread.sleep(1000);
				MenuItem_InputBox.click();
			}
		
		}
	}

	public void verifyWhetherItemDiscountTabIsSelected()
	{
		try {
			if (driver.findElement(By.xpath("//button[contains(@class,'active')]//span//div//span[.='ITEM BASED']")).isDisplayed()) {
				test.log(LogStatus.PASS, "Item Discount Tab Is Selected Successfully");
			}
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Item Discount Tab Is Not Selected Successfully");
			driver.findElement(By.xpath("//button[contains(@class,'active')]//span//div//span[.='ITEM BASED']")).click();
		}
	}

	public void verifyWhetherCheckBasedDiscountTabIsSelected()
	{
		try {
			if (driver.findElement(By.xpath("//button[contains(@class,'active')]//span//div//span[.='CHECK BASED']")).isDisplayed()) {
				test.log(LogStatus.PASS, "Check Discount Tab Is Selected Successfully");
			}
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Check Discount Tab Is Not Selected Successfully");
			driver.findElement(By.xpath("//button[contains(@class,'active')]//span//div//span[.='CHECK BASED']")).click();
		}
	}

	public void verifyWhetherOpenItemTabIsSelected()
	{
		try {
			if (driver.findElement(By.xpath("//button[contains(@class,'active')]//span//div//span[.='OPEN ITEM']")).isDisplayed()) {
				test.log(LogStatus.PASS, "Open Item Discount Tab Is Selected Successfully");
			}
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Open Item Discount Tab Is Not Selected Successfully");
			driver.findElement(By.xpath("//button[contains(@class,'active')]//span//div//span[.='OPEN ITEM']")).click();
		}
	}


	public void VerifyDiscountHeadername()
	{
			if (driver.findElement(By.xpath("//div//h3[.='Item Based']")).equals("Item Based")) {
				test.log(LogStatus.PASS, "Item Based Discount header shown Successfully");
			}
		     else{
					test.log(LogStatus.FAIL, "Item Based Discount header not shown Successfully");
				}
	}

	public void VerifyCheckDiscountHeadername()
	{
		if (driver.findElement(By.xpath("//div//h3[.='Check Based']")).equals("Check Based")) {
			test.log(LogStatus.PASS, "Check Based Discount header shown Successfully");
		}
		else{
			test.log(LogStatus.FAIL, "Check Based Discount header not shown Successfully");
		}
	}
	
	
	///////////// Open Item Discount  /////////////////////////
	
	@FindBy(xpath = "//app-toggle[@name='discountIsPercentage']//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Discount_In_Percentage_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='discountIsPercentage']//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Discount_In_Percentage_NoBtn;
	
	@FindBy(xpath = "//app-toggle[@name='discountIsAmount']//mat-button-toggle-group/mat-button-toggle[contains(.,'Yes')]")
	public WebElement Discount_In_Amount_YesBtn;
	
	@FindBy(xpath = "//app-toggle[@name='discountIsAmount']//mat-button-toggle-group/mat-button-toggle[contains(.,'No')]")
	public WebElement Discount_In_Amount_NoBtn;
	
	@FindBy(xpath = "//label[contains(.,'Minimum Percentage')]/../../input")
	public WebElement Min_PercentageInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Maximum Percentage')]/../../input")
	public WebElement Max_PercentageInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Minimum Amount')]/../../input")
	public WebElement Min_AmountInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Maximum Amount')]/../../input")
	public WebElement Max_AmountInputBx;
	
	@FindBy(xpath = "//label[contains(.,'Safety Limit Percentage')]/../../input")
	public WebElement Safety_Limit_PercentageInputBx;

	@FindBy(xpath = "//div[.='Enter Valid Priority']")
	public WebElement Enter_Valid_PriorityError;

	@FindBy(xpath = "//div//mat-hint//mat-hint[.='Please Enter Name']")
	public WebElement Enter_Valid_NameError;

	@FindBy(xpath = "//mat-hint//mat-hint[.='Enter Valid percentage']")
	public WebElement Enter_Valid_Percentage_Error;

	@FindBy(xpath = "//div[.='Enter Valid Priority']")
	public WebElement Enter_Valid_QuantityError;


	public void Enable_Discount_In_Percentage()
	{
		if(Discount_In_Percentage_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Discount_In_Percentage_YesBtn.click();
		}
	}
	
	public void Disable_Discount_In_Percentage()
	{
		if(Discount_In_Percentage_YesBtn.isEnabled()) 
		{
			Discount_In_Percentage_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	
	public WebElement Discount_In_Percentage_YesToggle()
	{
		return Discount_In_Percentage_YesBtn;
	}

	public void Enter_Discount_Name_Item_Discount(String name) {
	    name = 	name+"1";
		Item_Discount_Name.sendKeys("Item Discount01");
	}

	public void Enter_Discount_Name_Check_Discount(String name) {
		name = 	name+"1";
		Item_Discount_Name.sendKeys("Item Discount01");
	}

	public void Enter_Discount_Name_Exceedlimit() {
		String value = RandomStringUtils.randomAlphabetic(100);
		Item_Discount_Name.sendKeys(value);
	}

	public void iClickApplyField() {
		Apply_DropDownBtn.click();
	}

	public void verifyWhetherTheBeforeTaxAndAfterTaxIsDisplayed() {
		if(Before_TaxBtn.isDisplayed() && After_TaxBtn.isDisplayed())
		{
			test.log(LogStatus.PASS, "Before Tax and After Tax button is displayed in the apply dropdown");
		}
		else
		{
			test.log(LogStatus.FAIL, "Before Tax and After Tax button is not displayed in the apply dropdown");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyEnterValidQuantityErrorIsDisplayed() {
		if(Enter_Valid_QuantityError.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Quantity error is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Enter Valid Quantity error is not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyEnterValidPriorityErrorIsDisplayed() {
		if(Enter_Valid_PriorityError.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Priority error is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Enter Valid Priority error is not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void verifyEnterValidNameErrorIsDisplayed() {
		if(Enter_Valid_NameError.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Name error is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Enter Valid Name error is not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Verifythedeletepopuptext() {
		String text = driver.findElement(By.xpath("//p[.='Are you sure you want to delete this item?']")).getText();
		Assert.assertEquals(text, "Are you sure you want to delete this item?");
	}

	public void VerifytheItemDiscountisdeleted() {
		WebElement text = driver.findElement(By.xpath("//td[contains(.,'Item Based Discounts not found')]"));
		if (text.isDisplayed()) {
			test.log(LogStatus.PASS, "The Item Discount is deleted successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Item Discount is not deleted successfully");
			ut.FailedCaptureScreenshotAsBASE64();
			int i = 1/0;
		}
	}

	public void VerifytheCheckDiscountisdeleted() {
		WebElement text = driver.findElement(By.xpath("//td[contains(.,'Check Based Discounts not found')]"));
		if (text.isDisplayed()) {
			test.log(LogStatus.PASS, "The Check Discount is deleted successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Check Discount is not deleted successfully");
			ut.FailedCaptureScreenshotAsBASE64();
			int i = 1/0;
		}
	}

	public void iEnterTheNewItemBasedDiscountNameWithSpace() throws InterruptedException {

		Item_Discount_Name.click();
		Thread.sleep(200);
		Item_Discount_Name.sendKeys(Keys.SPACE);
		Thread.sleep(200);
	}

	public void VerifytheItemDiscountisActivatedSuccessfully() {
		WebElement text = driver.findElement(By.xpath("//td[contains(.,'Item Based Discounts not found')]"));
		if (text.isDisplayed()) {
			test.log(LogStatus.PASS, "The Item Discount is deleted successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Item Discount is not deleted successfully");
			ut.FailedCaptureScreenshotAsBASE64();
			int i = 1/0;
		}
	}

	public void VerifytheCheckDiscountisActivatedSuccessfully() {
		WebElement text = driver.findElement(By.xpath("//td[contains(.,'Check Based Discounts not found')]"));
		if (text.isDisplayed()) {
			test.log(LogStatus.PASS, "The Check Discount is deleted successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Check Discount is not deleted successfully");
			ut.FailedCaptureScreenshotAsBASE64();
			int i = 1/0;
		}
	}


	public void Verifythe_Inactive_ItemDiscount(String value) throws InterruptedException {
		Thread.sleep(1000);
		cmp.Click_ActivetoInactiveButton();
		Thread.sleep(2000);
		DisocuntTab_SearchTab.click();
		DisocuntTab_SearchTab.clear();
		DisocuntTab_SearchTab.sendKeys(value);

		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'"+value+"')]"));
        if (ele.isDisplayed()) {
			test.log(LogStatus.PASS, "The deleted Item Discount is shown in the inactive tab");
		}
		else
		{
			test.log(LogStatus.FAIL, "The deleted Item Discount is not shown in the inactive tab");
			ut.FailedCaptureScreenshotAsBASE64();
			int i = 1/0;
		}
	}


	public void Verifythe_Inactive_ItemDiscountandActivate(String value) throws InterruptedException {
		Thread.sleep(1000);
		cmp.Click_ActivetoInactiveButton();
		Thread.sleep(2000);
		DisocuntTab_SearchTab.click();
		DisocuntTab_SearchTab.clear();
		DisocuntTab_SearchTab.sendKeys(value);

		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'"+value+"')]"));
		if (ele.isDisplayed()) {
			Thread.sleep(500);
			//Click the Activate button
			driver.findElement(By.xpath("//button[@aria-label='Activate']")).click();
			test.log(LogStatus.PASS, "The deleted Item Discount is Active in the inactive tab");
		}
		else
		{
			test.log(LogStatus.FAIL, "The deleted Item Discount is not Active in the inactive tab");
			ut.FailedCaptureScreenshotAsBASE64();
			int i = 1/0;
		}
	}

	public void verifytheCancelledItemisactiveordeactive(String value) {
		WebElement text = driver.findElement(By.xpath("//span[contains(.,'"+value+"')]"));
		Assert.assertTrue(text.isDisplayed());
	}

	public void verifyEnterValidPercentageErrorIsDisplayedOrNot() {
		if(Enter_Valid_Percentage_Error.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Percentage error is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Enter Valid Percentage error is not Displayed");
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Enable_Discount_In_Amount()
	{
		if(Discount_In_Amount_YesBtn.isSelected()) 
		{
			
		}
		else
		{
			Discount_In_Amount_YesBtn.click();
		}
	}
	
	public void Disable_Discount_In_Amount()
	{
		if(Discount_In_Amount_YesBtn.isEnabled()) 
		{
			Discount_In_Amount_NoBtn.click();
		}
		else
		{
		
		}
	}
	
	public WebElement Discount_In_Amount_YesToggle()
	{
		return Discount_In_Amount_YesBtn;
	}
	
	
	public void Enter_Minimum_Percentage(String str) throws Exception
	{
		Thread.sleep(1000);
		Min_PercentageInputBx.clear();
		Thread.sleep(1000);
		Min_PercentageInputBx.sendKeys(str);
	}
	
	public WebElement Minimum_Percentage()
	{
		return Min_PercentageInputBx;
	}
	
	public void Enter_Maximum_Percentage(String str) throws Exception
	{
		Thread.sleep(1000);
		Max_PercentageInputBx.clear();
		Thread.sleep(1000);
		Max_PercentageInputBx.sendKeys(str);
	}
	
	public WebElement Maximum_Percentage()
	{
		return Max_PercentageInputBx;
	}
	
	public void Enter_Minimum_Amount(String str) throws Exception
	{
		Thread.sleep(1000);
		Min_AmountInputBx.clear();
		Thread.sleep(1000);
		Min_AmountInputBx.sendKeys(str);
	}
	
	public WebElement Minimum_Amount()
	{
		return Min_AmountInputBx;
	}
	
	public void Enter_Maximum_Amount(String str) throws Exception
	{
		Thread.sleep(1000);
		Max_AmountInputBx.clear();
		Thread.sleep(1000);
		Max_AmountInputBx.sendKeys(str);
	}
	
	public WebElement Maximum_Amount()
	{
		return Max_AmountInputBx;
	}
	
	public void Enter_Safety_Limit_Percentage(String str) throws Exception
	{
		Thread.sleep(1000);
		Safety_Limit_PercentageInputBx.clear();
		Thread.sleep(1000);
		Safety_Limit_PercentageInputBx.sendKeys(str);
	}
	
	public WebElement Safety_Limit_Percentage()
	{
		return Safety_Limit_PercentageInputBx;
	}
	
	@FindBy(xpath = "//span[contains(.,'Maximum Percentage should be Greater than Minimum percentage')]")
	WebElement Max_To_Min_PercentageErrorMsg;
	
	@FindBy(xpath = "//span[contains(.,'Maximum Amount should be Greater than Minimum Amount')]")
	WebElement Max_To_Min_AmountErrorMsg;
	
	@FindBy(xpath = "//span[contains(.,'Enter Valid Min.Percentage')]")
	WebElement Min_PercentageErrorMsg;
	
	@FindBy(xpath = "//span[contains(.,'Enter Valid Max.Percentage')]")
	WebElement Max_PercentageErrorMsg;
	
	@FindBy(xpath = "//span[contains(.,'Enter Valid Min.Amount')]")
	WebElement Min_AmountErrorMsg;
	
	@FindBy(xpath = "//span[contains(.,'Enter Valid Max.Amount')]")
	WebElement Max_AmountErrorMsg;
	
	@FindBy(xpath = "//span[contains(.,'Enter valid safety limit percentage')]")
	WebElement Safety_Limit_PercentageErrorMsg;
	
	
	public WebElement Minimum_PercentageErrorPop()
	{
		return Min_PercentageErrorMsg;
	}
	

	public WebElement Maximum_PercentageErrorPop()
	{
		return Max_PercentageErrorMsg;
	}
	
	public WebElement MaximumToMinimum_PercentageErrorPop()
	{
		return Max_To_Min_PercentageErrorMsg;
	}
	
	
	public WebElement Minimum_AmountErrorPop()
	{
		return Min_AmountErrorMsg;
	}
	

	public WebElement Maximum_AmountErrorPop()
	{
		return Max_AmountErrorMsg;
	}
	
	public WebElement MaximumToMinimum_AmountErrorPop()
	{
		return Max_To_Min_AmountErrorMsg;
	}
	
	public WebElement Safety_Limit_PercentageErrorPop()
	{
		return Safety_Limit_PercentageErrorMsg;
	}
	
	public void Verify_Minimum_PercentageErrorPop()
	{
		try
		{
		if(Min_PercentageErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Minimum Percentage is Displayed");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Enter Valid Minimum Percentage is not Displayed");
	
		}
	}
	
	
	public void Verify_Maximum_PercentageErrorPop()
	{
		try
		{
		if(Max_PercentageErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Maximum Percentage is Displayed");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Enter Valid Maximum Percentage is not Displayed");
	
		}
	}
	
	public void Verify_MaximumToMinimum_PercentageErrorPop()
	{
		try
		{
		if(Max_To_Min_PercentageErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Maximum Percentage should be Greater than Minimum percentage is Displayed");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Maximum Percentage should be Greater than Minimum percentage is not Displayed");
	
		}
	}
	
	
	public void Verify_Minimum_AmountErrorPop()
	{
		try
		{
		if(Min_AmountErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Minimum Amount is Displayed");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Enter Valid Minimum Amount is not Displayed");
	
		}
	}
	
	
	public void Verify_Maximum_AmountErrorPop()
	{
		try
		{
		if(Max_AmountErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter Valid Maximum Amount is Displayed");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Enter Valid Maximum Amount is not Displayed");
	
		}
	}
	
	public void Verify_MaximumToMinimum_AmountErrorPop()
	{
		try
		{
		if(Max_To_Min_AmountErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Maximum Amount should be Greater than Minimum Amount is Displayed");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Maximum Amount should be Greater than Minimum Amount is not Displayed");
	
		}
	}
	
	public void Verify_Safety_Limit_PercentageErrorPop()
	{
		try
		{
		if(Safety_Limit_PercentageErrorMsg.isDisplayed())
		{
			test.log(LogStatus.PASS, "Enter valid safety limit percentage is Displayed");
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.FAIL, "Enter valid safety limit percentage is not Displayed");
	
		}
	}
	
	
	
	//////////////////////  Mix and Match  ////////////////////
	
	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Set Each Item Price')]")
	WebElement Set_Each_Item_Price_RadioBtn;
	
	@FindBy(xpath = "//div[@class='radio-box'][contains(.,'Set Percentage')]")
	WebElement Set_Percentage_RadioBtn;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Most Expensive')]")
	WebElement Most_Expensive_ChkBx;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Least Expensive')]")
	WebElement Least_Expensive_ChkBx;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Most Expensive')][contains(@class,'mat-radio-checked')]")
	WebElement Most_Expensive_ChkBx_SLD;
	
	@FindBy(xpath = "//mat-radio-button[contains(.,'Least Expensive')][contains(@class,'mat-radio-checked')]")
	WebElement Least_Expensive_ChkBx_SLD;
	
	public WebElement Most_Expensive_RadioButton()
	{
		return Most_Expensive_ChkBx;
	}
	
	public WebElement Most_Expensive_RadioButton_Selected()
	{
		return Most_Expensive_ChkBx_SLD;
	}
	
	public WebElement Least_Expensive_RadioButton()
	{
		return Least_Expensive_ChkBx;
	}
	
	public WebElement Least_Expensive_RadioButton_Selected()
	{
		return Least_Expensive_ChkBx_SLD;
	}
	
	public void Click_Set_Each_Item_Price_DiscountRateType()
	{
		Set_Each_Item_Price_RadioBtn.click();
	}
	
	public WebElement Set_Each_Item_Price_DiscountRateType()
	{
		return Set_Each_Item_Price_RadioBtn;
	}
	
	public void Click_Set_Percentage_DiscountRateType()
	{
		Set_Percentage_RadioBtn.click();
	}
	
	public WebElement Set_Percentage_DiscountRateType()
	{
		return Set_Percentage_RadioBtn;
	}
	
	@FindBy(xpath = "//button[contains(.,'Add Price')]")
	WebElement Add_PriceBtn;
	
	public void Click_Add_Price()
	{
		Add_PriceBtn.click();
	}
	
	public void Enter_Add_Price(String st1,String st2) throws Exception
	{
		
		for(int i=1;i<=2;i++)
		{
			Click_Add_Price();
		}
		
		Thread.sleep(3000);
		List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='editable-data-grid']/div/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input"));
		for(int i=2;i<=rowList.size()+1;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(st1);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(st2);
		}
		
		
	}
	
	public void Delete_Add_Price() throws Exception
	{
		cmp=new Common_XPaths();
		List<WebElement> lista=driver.findElements(By.xpath("//div[@class='editable-data-grid']/div/div[3]/button"));
		
		for(int i=3;i<=lista.size()+1;i++)
		{
			Thread.sleep(1000);

			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[3]/button")).click();
			
			Thread.sleep(1000);
			
			cmp.Click_DeleteButton();
		}
	}
	
	
	public void Enter_Add_Price_Set_Percentage(String st1,String st2,String st3) throws Exception
	{
		
		for(int i=1;i<=4;i++)
		{
			Click_Add_Price();
		}
		
		Thread.sleep(3000);
		List<WebElement> rowList=driver.findElements(By.xpath("//div[@class='editable-data-grid']/div/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input"));
		for(int i=2;i<=rowList.size()+1;i++)
		{
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(st1);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(st2);
	
		
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[3]/app-input/div/div/mat-form-field/div/div/div[4]/input")).clear();
			
			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div["+i+"]/div[3]/app-input/div/div/mat-form-field/div/div/div[4]/input")).sendKeys(st3);
	
		
		}
		
		
	}
	
	public void Delete_Add_Price_Set_Percentage() throws Exception
	{
		cmp=new Common_XPaths();
		List<WebElement> lista=driver.findElements(By.xpath("//div[@class='editable-data-grid']/div/div[4]/button"));
		
		for(int i=3;i<=lista.size()+1;i++)
		{
			Thread.sleep(1000);

			driver.findElement(By.xpath("//div[@class='editable-data-grid']/div[3]/div[4]/button")).click();
			
			Thread.sleep(1000);
			
			cmp.Click_DeleteButton();
		}
	}
	
	@FindBy(xpath = "//div[@class='editable-data-grid']/div[2]/div[1]/app-input/div/div/mat-form-field/div/div/div[4]/input")
	WebElement Quantity_FirstRow_SetPrice;
	

	@FindBy(xpath = "//div[@class='editable-data-grid']/div[2]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")
	WebElement Price_FirstRow_SetPrice;


	@FindBy(xpath = "//div[@class='editable-data-grid']/div[2]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")
	WebElement DiscountQuantity_FirstRow_SetPercentage;
	

	@FindBy(xpath = "//div[@class='editable-data-grid']/div[2]/div[3]/app-input/div/div/mat-form-field/div/div/div[4]/input")
	WebElement Percentage_FirstRow_SetPercentage;
	 
	public WebElement Quantity_FirstRow_SetPrice()
	{
		return Quantity_FirstRow_SetPrice;
	}
	
	public WebElement Price_FirstRow_SetPrice()
	{
		return Price_FirstRow_SetPrice;
	}
	
	public WebElement DiscountQuantity_FirstRow_SetPercentage()
	{
		return DiscountQuantity_FirstRow_SetPercentage;
	}
	
	public WebElement Percentage_FirstRow_SetPercentage()
	{
		return Percentage_FirstRow_SetPercentage;
	}
	
	@FindBy(xpath = "//button[.='EDIT']")
	public WebElement open_Edit;
	
	public void Click_Open_Edit()
	{
		open_Edit.click();
	}
	public WebElement Open_Item() 
	{
		return New_Open_Item_DiscountBtn;
	}
	public WebElement Open_Check() 
	{
		return New_Open_Check_DiscountBtn;
	}
	
	
	
}
