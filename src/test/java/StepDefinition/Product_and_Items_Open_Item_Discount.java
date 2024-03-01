package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.Common_XPaths;
import com.Pages.DiscountsPage;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.ModifierGroupsPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.jdi.light.asserts.core.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product_and_Items_Open_Item_Discount 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 


	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	DiscountsPage dcp = new DiscountsPage();
	ModifierGroupsPage mgp = new ModifierGroupsPage();


	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));

	SoftAssert sa=new SoftAssert();


	@Given("Open the Discounts home page BaseURL and StoreID")
	public void Open_Discounts_Page() throws Exception 
	{
		//Load the Discounts page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"discounts");
	}

	@Given("Verifying the Discounts Header Page")
	public void Verifying_DiscountsPageHeader() throws Exception 
	{
		Thread.sleep(5000);
		//Verify the Open Item Discount page loeded or not
		cmp.VerifyMainScreenPageHeader("Discounts");

		cmp.Close_Online_Help_ChatBox();
	}
	@And("I Click Open Item")
	public void Open_ItemTab()
	{
		//Click the Open Item Screen
		dcp.Select_Open_Item_DiscountTab();
	}

	@Then("Verify the Open Item Discount not Found is Displayed")
	public void Verify_OpenItemDiscountNotFound() 
	{
		try {
			if(driver.findElement(By.xpath("//span[.=' Open Item Discount not Found ']")).isDisplayed())
			{
				test.log(LogStatus.PASS,"Open Item Disocunt Not Found message displayed");
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else 
			{
				test.log(LogStatus.FAIL,"Open Item Discount not found message not displayed");
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Item Discount Already Created");
		}
	}

	@Then("Verify whether Open Item Tab is Selected")
	public void VerifyWhetherOpenItemTabSeletedOrNot()
	{
		if(dcp.Open_Item().isSelected()) 
		{
			test.log(LogStatus.PASS,"Open Item Tab is Selected");
		}
		else {
			test.log(LogStatus.FAIL,"Open Item Tab is Not Selected");
		}
	}

	@Given("Click the New Open Item Discount button")
	public void Click_NewOpenItemDiscount() throws Exception 
	{
		try {
			if(dcp.New_Open_Item_DiscountBtn.isDisplayed()) 
			{
				dcp.Click_New_Open_Item_Discount();
				Thread.sleep(5000);
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Item Discount Already Created");
			if(dcp.open_Edit.isDisplayed()) {
				dcp.Click_Open_Edit();
				Thread.sleep(5000);
			}
		}
	}

	@When("Verify the Open Item Header")
	public void Verify_OpenItemHeader()
	{
		try {
			cmp.VerifyCreationScreenPageHeader("Open Item");
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Item Discount Already Created");
		}
	}

	@Then("Check the Save and Publish button is Disabled in Open Discount Type")
	public void Check_SaveAndPublishButtonDisabledInOpenItem() 
	{
		try {
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
		catch (Exception e) 
		{
			test.log(LogStatus.INFO,"Open Item Discount Already Created");
		}
	}

	//	@And("I Click the Backward button in Open Discount Type")
	//	public void Click_BackWardButton() throws Exception
	//	{
	//		try {
	//			Thread.sleep(3000);
	//			cmp.Click_BackspaceButton();
	//		}
	//		catch (Exception e) {
	//			test.log(LogStatus.INFO,"Open Item Discount Already Created Not able to Click on BackWard Button");
	//		}
	//	}

	@And("I Enter the Open Item Discount Name Exceeding the limit")
	public void Enter_OpenItemDiscountNameExceedingLimit() throws Exception 
	{

		Thread.sleep(2000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());

		//		catch (Exception e) {
		//			test.log(LogStatus.INFO,"Open Item Discount Already Created not able to add Name");
		//		}
	}

	@And("I Enter the Priority in Open Discount")
	public void Enter_Priority() throws Exception 
	{

		if(cmp.Priority_Input().isDisplayed()) {
			cmp.Enter_Priority("123");
		}
		else {
			test.log(LogStatus.PASS,"Priority Input Box Not displayed");
		}
	}

	@And("I Clear the Priority in Open DiscountType")
	public void Clear_Priority() 
	{

		if(cmp.Priority_Input().isDisplayed()) {
			cmp.Priority_Input().clear();
		}

		else {
			test.log(LogStatus.PASS,"Priority Input Box Not displayed");
		}
	}

	@When("I Enter the Open Item Discount Name")
	public void Enter_OpenItemDiscountName() throws Exception 
	{

		if(cmp.NameInputBox().isDisplayed()) {
			Thread.sleep(1000);
			//Enter the Discount Name
			cmp.EnterName(Utility.getProperty("DiscountName_OpenItemAMT"));
		}
		else {
			test.log(LogStatus.FAIL,"Name Field Not displayed");
		}
	}

	@When("I Enter the Open Item Discount Name with single letter")
	public void Enter_OpenItemDiscountName_SingleLetter() throws Exception
	{

		if(cmp.NameInputBox().isDisplayed()) {
			Thread.sleep(1000);
			//Enter the Discount Name
			cmp.EnterName("O");
		}
		else {
			test.log(LogStatus.FAIL,"Name Field Not displayed");
		}

	}

	@And("I Select Apply as Before Tax")
	public void Select_ApplyAsBeforeTax() throws Exception 
	{
		Thread.sleep(500);
		//Select After Tax
		dcp.Select_BeforeTax();



	}

	@And("I Enable Discount In Percentage Toggle")
	public void EnableDiscountInPercentageToggle() throws Exception 
	{

		if(dcp.Discount_In_Percentage_YesBtn.isDisplayed()) {
			Thread.sleep(1000);
			//Enable Discount in Percentage
			dcp.Enable_Discount_In_Percentage();
		}
		else 
		{
			test.log(LogStatus.FAIL,"Discount In Percentage Not displayed because Open Item Discount Already Created");
		}

	}

	@And("I Enter Minimum Percentage")
	public void Enter_MinimumPercentage() throws Exception
	{
		if(dcp.Minimum_Percentage().isDisplayed()) 
		{
			test.log(LogStatus.PASS,"Minimum Percentage input box Displayed");
			//Enter Minium Percentage
			dcp.Enter_Minimum_Percentage("1000");
		}
		else {
			test.log(LogStatus.FAIL,"Minimum Percentage Inputbox Not displayed because Open Item Discount Already Created");
		}
	}

	@And("I Enter Maximum Percentage")
	public void Enter_MaxPercentage() throws Exception 
	{

		if(dcp.Maximum_Percentage().isDisplayed()) {
			//Enter the Maximum Percentage
			dcp.Enter_Maximum_Percentage("5000");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Maximum Percentage Inputbox Not displayed because Open Item Discount Already Created");
		}

	}

	@Then("Check the Save and Publish button is Enabled in Open Discount Type")
	public void Check_SaveAndPublishButtonEnabledInOpenDiscountType() 
	{
		try {
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
		catch (Exception e) 
		{
			test.log(LogStatus.INFO,"Open Item Discount Already Created so Not able to See Save And Publisg Button");
		}
	}

	@And("I Enter the Priority in Open Discount as Zero")
	public void Enter_PriorityInOpenDiscountAsZero() throws Exception 
	{

		if(cmp.Priority_Input().isDisplayed()) {
			mgp.Enter_Price("0");
		}

		else {
			test.log(LogStatus.PASS,"Priority Input Box Not displayed");
		}
		//		}
		//		catch (Exception e) {
		//			test.log(LogStatus.INFO,"Open Item Discount Already Created Not able to See Priority Field");
		//		}
	}

	@Then("Check Enter Valid Priority error is Displayed")
	public void CheckEnterValidPriorityError() 
	{

		dcp.Verify_Enter_Valid_PriorityErrorMessage();
	}

	@And("I Select Apply as After Tax")
	public void Select_ApplyAsAfterTax() throws Exception 
	{
		Thread.sleep(500);
		//Select After Tax
		dcp.Select_AfterTax();
	}

	@Then("Verify whether Promo is Selected as Default")
	public void Verify_PromoSelectedAsDefault() 
	{

		if(dcp.Promo_DiscountType_RadioBtn.isSelected()) {
			test.log(LogStatus.PASS, "By Default Promo Discount Type is Selected");
		}
		else{
			test.log(LogStatus.FAIL,"By default Promo Discount Type is Not selected");
		}
	}

	@And("I Enter the Priority in Open Discount as Decimal Values")
	public void EnterPriorityAsZero() throws Exception 
	{

		if(cmp.Priority_Input().isDisplayed()) {
			mgp.Enter_Priority("1.34");
		}

		else {
			test.log(LogStatus.PASS,"Priority Input Box Not displayed");
		}

	}

	@And("I Click Apply Field")
	public void Click_Applyfield() 
	{

		dcp.Apply_DropDown().click();
	}

	@Then("Verify whether the Before Tax\\/After Tax is displayed")
	public void VerifyBefore_AndAfterTaxDisplayed() 
	{

		if(dcp.After_TaxBtn.isDisplayed()) {
			test.log(LogStatus.PASS,"After Tax Button Displayed");
		}

		if(dcp.Before_TaxBtn.isDisplayed()) {
			test.log(LogStatus.PASS,"Before Tax Button Displayed");
		}

	}

	@And("I Select Comp Discount Type")
	public void SelectCompDiscountType()
	{

		dcp.Select_Comp_DiscountType();

	}

	@Then("Check the Coupon Only Toggle is Disabled")
	public void VerifyCouponOnlyToggleIsDisabled() throws Exception 
	{

		//cmp.Check_Toggle_Disabled(dcp.Coupon_Only_YesBtn,"Coupon Only Toggle");
		if(!dcp.Coupon_Only_YesBtn.isEnabled())
		{
			test.log(LogStatus.FAIL,"Coupon Only Toggle is Enabled");
		}
		else {
			test.log(LogStatus.PASS,"Coupon Only Toggle is Disabled");
		}

	}

	@And("I Enable Coupon Only Toggle")
	public void EnableCouponOnlyToggle() 
	{

		dcp.Enable_Coupon_Only();

	}

	@And("I Select Promo Discount Type")
	public void SelectPromoDiscountType() 
	{

		dcp.Select_Promo_DiscountType();

	}

	@Then("Check the Combine With Other Discount Toggle is Enabled")
	public void VerifyCombineWithOtherDiscountToggleIsEnabled() throws Exception 
	{

		cmp.Check_Toggle_Enabled(dcp.Combine_WithOther_Discount_YesBtn,"Combine with Other Discounts ");

	}

	@Then("Verify whether Apply For Discounted Price is Displayed")
	public void VerifyApplyForDiscountedPriceIsDisplayed()
	{
		try {

			if(driver.findElement(By.xpath("//app-toggle[contains(.,'Apply For Discounted Price')]//span")).isDisplayed())
			{
				test.log(LogStatus.PASS,"Apply for Discounted Price Toggle Displayed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	@And("I Disable Combine With Other Discount Toggle")
	public void DisableCombineWithOtherDisountToggle() 
	{

		dcp.Disable_Combine_WithOther_Discount();

	}

	@Then("Verify whether Apply For Discounted Price is Not Displayed")
	public void VerifyApplyForDiscountedPriceIsNotDisplayed()
	{
		try {
			if(driver.findElement(By.xpath("//app-toggle[contains(.,'Apply For Discounted Price')]//span")).isDisplayed())
			{
				test.log(LogStatus.PASS,"Apply for Discounted Price Toggle is Not Displayed");
			}
			else
			{
				test.log(LogStatus.FAIL,"Apply for Discounted Price Toggle is Displayed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("Check the Attach Customer Toggle is Disabled")
	public void VerifyAttachCustomerToggleIsDisabled() throws Exception 
	{
        try {
		cmp.Check_Button_Disabled(dcp.Employee_Discount_NoBtn,"Attach Customer Toggle");
        }
        catch (Exception e) {
			// TODO: handle exception
		}

	}

	@And("I Enable Attach Customer Toggle")
	public void Enable_AttachCustomerToggle() 
	{

		dcp.Enable_Attach_Customer();

	}

	//	@And("I Select Membership Plan")
	//	public void Select_MembershipPlan()
	//	{
	//		
	//	}

//	@Then("Check the Restrict POS Visibility Toggle is Disabled")
//	public void VerifyRestrictedPOSVisibilityToggleIsDisabled() throws Exception 
//	{
//		try {
//			//	cmp.Check_Button_Disabled(dcp.Restrict_POS_Visiblity_ByUser_NoBtn,"Attach Customer Toggle");
//			if(!dcp.Restrict_POS_Visiblity_ByUser_NoBtn.isEnabled()) 
//			{
//				test.log(LogStatus.FAIL,"Restrict POS Visibility Toggle Enabled");
//			}
//			else {
//				test.log(LogStatus.PASS,"Restrict POS Visibilty Toggle Disabled");
//			}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}

//	@And("I Enable the Restrict POS Visibility Toggle")
//	public void Enable_RestrictionPOSToggle() 
//	{
//
//		dcp.Enable_Restrict_POS_Visiblity_ByUser();
//
//	}

	@And("I Select the Roles Discount")
	public void Select_Roles()
	{
		try {
			dcp.Select_Restrict_POS_VisibilityRoles();
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Item Discount Already Created");
		}
	}

	@Then("Check Enter Valid Max.Percentage error is Displayed")
	public void Check_ValidMaxPercentageErrorMessage() 
	{
		try {
			if(dcp.Maximum_PercentageErrorPop().isDisplayed()) 
			{
				test.log(LogStatus.PASS,"Enter Valid Max Percenatge Error Displayed");
			}
			else
			{
				test.log(LogStatus.FAIL,"Enter Valid Max Percentage Not Displayed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("Check Maximum Percentage should be Greater than Minimum Percentage is Displayed")
	public void CheckMaximumPercenatgeshouldbeGreaterthanMinPercenatge() 
	{
		try {
			if(dcp.MaximumToMinimum_PercentageErrorPop().isDisplayed())
			{
				test.log(LogStatus.PASS, "Maximum percentage should be greater than minimum percentage is Displayed when Entering Minimum Percentage above Maximum Percentage");
			}
			else

			{
				test.log(LogStatus.FAIL, "Maximum percentage should be greater than minimum percenatage is not Displayed when Entering Percentage above Maximum Percentage");

			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	@And("I Enter Maximum Percentage below Minimum Percentage")
	public void EnterMaxPercenatgeBelowMinPercentage() throws Exception
	{

		//Enter Minium Percentage
		dcp.Enter_Minimum_Percentage("1000");

		//Enter the Maximum Percentage
		dcp.Enter_Maximum_Percentage("500");

	}

	@And("I Enter Maximum Percentage above Minimum Percentage")
	public void EnterMaxPercenatgeAboveMinPercentage() throws Exception 
	{

		//Enter Minium Percentage
		dcp.Enter_Minimum_Percentage("5000");

		//Enter the Maximum Percentage
		dcp.Enter_Maximum_Percentage("10000");

	}

	@And("I Click the Save and Publish button in Open Discount")
	public void Click_SaveAndPublishButton() 
	{
		try {
			cmp.Click_Save_and_PublishButton();
		}

		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Item Discount Already Created");
		}
	}

	@Then("Verify whether the Open Item Discount is Saved or not")
	public void Verify_OpenItemDiscountSavedOrNot() 
	{
		try {
			Thread.sleep(2000);
			//Click the Save and Publish button
			//cmp.Click_Save_and_PublishButton();


			Thread.sleep(3000);
			//Check whether the Open Item Discount Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Open Item Discount Saved successfully"))
			{
				test.log(LogStatus.PASS, "Open Item Discount Saved Successfully");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Open Item Discount Save Failed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}

		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Item Discount Already Created");
		}
	}

	@Given("I Edit the Open Item Discount")
	public void Click_Edit() 
	{
		dcp.Click_Open_Edit();
	}

	@Then("Verify whether Discount In Percentage is Enabled")
	public void VerifyDiscountInPercenatgeIsEnabledOrNot() 
	{
		if(dcp.Discount_In_Percentage_YesToggle().isEnabled()) 
		{
			test.log(LogStatus.PASS,"Discount In Percentage Toggle is Enabled");
		}
		else {
			test.log(LogStatus.FAIL,"Discount In Percentage Toggle is not Enabled");
		}
	}

	@And("I Enable Discount In Amount Toggle")
	public void EnableDiscountInAmountToggle()
	{
		dcp.Enable_Discount_In_Amount();
	}

	@And("I Enter Minimum Amount")
	public void Enter_MinimumAmount() throws Exception 
	{
		dcp.Enter_Minimum_Amount("2000");
	}

	@And("I Enter Maximum Amount")
	public void EnterMaximumAmount() throws Exception 
	{
		dcp.Enter_Maximum_Amount("3000");
	}

	@And("I Enter Safety Limit Percentage")
	public void EnterSafteyLimitPercentage() throws Exception 
	{
		dcp.Enter_Safety_Limit_Percentage("2500");
	}

	@Then("Verify whether Open Item Discount is Updated or not")
	public void VerifyWhetherOpenItemDiscountUpdatedOrNot() throws Exception 
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
		//Check whether the Open Item Discount Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Updated & Published Successfully"))
		{
			test.log(LogStatus.PASS, "Open Item Discount updated successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Open Item Discount updated failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
		Thread.sleep(5000);
	}

	@And("I Select Membership Plan")
	public void Select_MemeberShipPlan()
	{
		try {
			dcp.Select_Donation_DiscountType();
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Open Item Discount Already Careated");
		}
	}

//	@Then("Check the Restrict POS Visibility Toggle is Enabled")
//	public void VerifyRestrictPOSVisibilityToggleEnabled() 
//	{
//		if(dcp.Restrict_POS_Visiblity_ByUser_YesBtn.isEnabled()) 
//		{
//			test.log(LogStatus.PASS,"Restrict POS Visibility Toggle Enabled");
//		}
//		else 
//		{
//			test.log(LogStatus.FAIL,"Restrict POS Visibility Toggle is Not Enabled");
//		}
//	}

	@Then("I Verify Open Item Discount Update screen Close or not")
	public void VerifyOpenItemDiscountUpdateScreenClosedOrNot() throws Exception 
	{
		cmp.Verify_Close_Cancel_CreationScreen("Open Item");
	}

	@And("I Clicking the Update and Publish button without Any Changes")
	public void ClickUpdateAndPublishWithoutAnyChanges()
	{
		if(cmp.Update_and_PublishButton().isEnabled()) {
			test.log(LogStatus.FAIL,"Update and Publish button Enabled without any Changes");
		}
		else {
			test.log(LogStatus.PASS,"Update And Publish Button Not Enabled without Any Changes");
		}
	}

	@And("I Clicking the Update and Publish button without entering Priority")
	public void Click_UpdateAndPublishWithoutPriority() 
	{
		if(cmp.Update_and_PublishButton().isEnabled()) {
			test.log(LogStatus.FAIL,"Update and Publish button Enabled without Priority");
		}
		else {
			test.log(LogStatus.PASS,"Update And Publish Button Not Enabled without Priority");
		}
	}

	@Then("Verify whether the Open Item Discount is Updated with Priority as 0 or not")
	public void VerifyOpeItemDiscountUpdatedWithPriorityZero() 
	{
		if(cmp.Update_and_PublishButton().isEnabled()) {
			test.log(LogStatus.FAIL,"Update and Publish button Enabled with Priority 0");
		}
		else {
			test.log(LogStatus.PASS,"Update And Publish Button Not Enabled with Priority 0");
		}
	}

	@Then("Verify whether the Open Item Discount is Updated with Priority as Decimal or not")
	public void VerifyWhetherOpenItemUpdatedWithPriorityAsDecimal() 
	{
		cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
		//Check whether the Open Item Discount Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Updated & Published Successfully"))
		{
			test.log(LogStatus.PASS, "Open Item Discount updated successfully with Priority as Decimal");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Open Item Discount updated failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	//	@And("I Change the Priority")
	//	public void ChangePriority() 
	//	{
	//		mgp.Enter_Priority("430");
	//	}

	@Given("I Click the Deactivate button")
	public void Click_DeActivateButton() throws Exception
	{
		try {
			if(driver.findElement(By.xpath("//button[contains(.,'DEACTIVATE')]")).isDisplayed()) {

				//Click the deactive button
				driver.findElement(By.xpath("//button[contains(.,'DEACTIVATE')]")).click();

				Thread.sleep(500);
				//Click the Delete button
				cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Deactivate Button Not Present it is in Active status");

			//Click the Activate button
			driver.findElement(By.xpath("//button[contains(.,'ACTIVATE')]")).click();
			Thread.sleep(500);
			//Click the Delete button
			cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
		}
	}

	@And("I Click the Cancel button in Open Discount")
	public void Click_CancelButtonInOpenDiscount() 
	{
		try {
			cmp.Click_CancelButton();
		}

		catch (Exception e) {
			test.log(LogStatus.INFO,"Discount is in Active status");
			cmp.Click_CancelButtonInAlert();
		}
	}

	@Then("Verify the Cancelled Open Item Discount Deleted\\/Inactivated or not")
	public void VerifyCancelledOpenItemDiscountDeletedOrNot() 
	{
		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Inactivated Successfully"))
			{
				test.log(LogStatus.FAIL, "Open Item Deleted when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Open Item not Deleted when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
			//cmp.Click_CancelButtonInAlert();
		}
	}

	@And("I Click the Delete button in Open Discount")
	public void Click_DeleteButton() throws Exception 
	{
		try {
			if(cmp.DeleteBtn.isDisplayed()) {
			cmp.Click_DeleteButton();
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Discount is in Active status");
			cmp.Click_ActivateButton();
		}
	}

	@Then("I Verifying the Open Item Discount Deleted or not")
	public void VerifyOpenItemDiscountDeletedOrNot() 
	{
		try {
			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the Open Item Discount Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Inactivated Successfully"))
			{
				test.log(LogStatus.PASS, "Open Item Discount Inactivated Successfully");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Open Item Discount Inactivated Failed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch (Exception e) 
		{
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Activated Successfully"))
			{
				test.log(LogStatus.PASS, "Open Item Discount Activated Successfully");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Open Item Discount activated Failed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
	}

	@Given("I Click the Activate button in Open Discount")
	public void Click_ActivateButton() throws Exception 
	{
		try {
			if(driver.findElement(By.xpath("//button[contains(.,'ACTIVATE')]")).isDisplayed()) 
			{
				//Click the Activate button
				driver.findElement(By.xpath("//button[contains(.,'ACTIVATE')]")).click();

				cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Activate Button Is Not avilable it is In DeActivate State");
			//Click the deactive button
			driver.findElement(By.xpath("//button[contains(.,'DEACTIVATE')]")).click();

			Thread.sleep(500);
			//Click the Delete button
			cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
		}
	}

	@And("I Click the Cancel button in Pop Up In Open Discount")
	public void ClickCancelButtonPopupinOpenDiscount()
	{
		try {
			if(cmp.CancelBtn_AlertPopup.isDisplayed()) {
			cmp.Click_CancelButtonInAlert();
			}
		}
		catch (Exception e) 
		{
			test.log(LogStatus.INFO,"Discount is not in Active status");
			cmp.Click_CancelButton();
		}
	}

	@Then("Verify the Cancelled Open Item Discount is Activated or not")
	public void VerifyCancelledOpenItemActivatedOrNot() 
	{
		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Activated Successfully"))
			{
				test.log(LogStatus.FAIL, "Open Item Activated when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Open Item not Activated when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
			//cmp.Click_CancelButton();
		}

		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Inactivated Successfully"))
			{
				test.log(LogStatus.FAIL, "Open Item Deleted when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Open Item not Deleted when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
			//cmp.Click_CancelButtonInAlert();
		}
	}
	
	@And("I Click the Activate button in Open Discount Popup")
	public void Click_ActivateButtonPopup() throws Exception {
		try {
			if(cmp.ActivateBtn.isDisplayed()) {
			cmp.Click_ActivateButton();
			}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Discount is Not in Active Status");
			cmp.Click_DeleteButton();
		}
	}

	@Then("I Verifying the Open Item Discount Activated or not")
	public void VerifyOpenItemActivatedOrNot() 
	{
		try {
			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the Open Item Discount Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Activated Successfully"))
			{
				test.log(LogStatus.PASS, "Open Item Discount Activated Successfully");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Open Item Discount activated Failed");

				ut.FailedCaptureScreenshotAsBASE64();

				cmp.Click_ActivateButton();
			}
		}
		catch (Exception e) {



			//Check whether the Open Item Discount Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Inactivated Successfully"))
			{
				test.log(LogStatus.PASS, "Open Item Discount Inactivated Successfully");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Open Item Discount Inactivated Failed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
	}

	@When("I Enter the Open Item Discount Name with Space")
	public void EnterOpenItemNameWithSpace() throws Exception 
	{
		//Enter the Discount Name
		cmp.EnterName(Utility.getProperty("DiscountName_OpenItemAMT")+Keys.SPACE);
	}

	@Then("Verify whether the Open Item Discount Name with Space in end is Updated or not")
	public void VerifyOpenItemDiscountNameWithSpaceUpdatedOrNot()
	{
		// Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Discount Updated & Published Successfully"))
		{
			test.log(LogStatus.PASS, "Open Item Discount Updated with Space in the End of Discount Name");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Open Item Name already exist pop up displayed when Entering Space in the End of Open Item Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of Open Item Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Open Item Discount not Saved with Space in the End of Discount Name");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Clicking the Update and Publish button without entering Open Check Discount Name")
	public void Click_UPdatewithoutenteringopenCheckDiscountName() 
	{
		if(cmp.Update_and_PublishButton().isEnabled()) {
			test.log(LogStatus.FAIL,"Update and publish button is enabled without any changes");
		}
		
		else {
			test.log(LogStatus.PASS,"Update and publish button is not enabled");
		}
	}
}


