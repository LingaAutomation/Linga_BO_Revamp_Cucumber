package StepDefinition;

import Utility.Utility;
import com.Pages.*;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Product_and_Items_Check_Based_Discount {

    SelfHealingDriver driver=new Driver_Manager().getDriver();
    ExtentReports rep=new Driver_Manager().getRep();
    ExtentTest test=new Driver_Manager().test;

    LoginPage lgpg=new LoginPage();

    Utility ut=new Utility();

    CoursingPage cp=new CoursingPage();

    Common_XPaths cmp=new Common_XPaths();

    SubCategoriesPage scp=new SubCategoriesPage();
    LoginTest a=new LoginTest();
    TaxesPage tp=new TaxesPage();

    DiscountsPage DP = new DiscountsPage();

    Availability_RestrictionTimePage Art = new Availability_RestrictionTimePage();

//    @When("I Clear the Name")
//    public void iClearTheName() throws Exception {
//        // Write code here that turns the phrase above into concrete actions
//        Thread.sleep(3000);
//        cmp.NameInputBox().clear();
//    }


    @Then("Verify whether Check Based field is selected as default or not")
    public void verifyWhetherCheckBasedFieldIsSelectedAsDefaultOrNot() {
        DP.verifyWhetherCheckBasedDiscountTabIsSelected();
    }


    @When("Verify the Check Based Header")
    public void verifyTheCheckBasedHeader() {
        DP.VerifyCheckDiscountHeadername();
    }

    @And("Check the Save and Publish button is Disabled without Entering Check Based Discount Name")
    public void checkTheSaveAndPublishButtonIsDisabledWithoutEnteringCheckBasedDiscountName() {
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

    @When("I Enter the Check Based Discount Name")
    public void iEnterTheCheckBasedDiscountName() {
        DP.Enter_Discount_Name_Check_Discount("Check Discount 06");
    }

    @And("I Click Add Offer")
    public void iClickAddOffer() {
        DP.Click_Add_Offer();
    }

    @And("I Enter the Check Total Amount")
    public void iEnterTheCheckTotalAmount() throws Exception {
        DP.Enter_Check_Total("10.00");
    }

    @And("I Click the Add Offer button")
    public void iClickTheAddOfferButton() {
        DP.Click_Add_Offer();
    }

    @And("I Select the Offers as Percentage")
    public void iSelectTheOffersAsPercentage() {
        DP.Click_Percentage_Discount_In_Offers();
    }

    @And("I Select the Check Based Tab")
    public void iSelectTheCheckBasedTab() {
        driver.findElement(By.xpath("//button[contains(@class,'active')]//span//div//span[.='CHECK BASED']")).click();
    }

    @And("I Enter the Check Based Discount Name Exceeding the limit")
    public void iEnterTheCheckBasedDiscountNameExceedingTheLimit() {
        DP.Enter_Discount_Name_Exceedlimit();
    }

    @Then("Verify whether the Check Based Discount is Saved with Priority as Decimal or not")
    public void verifyWhetherTheCheckBasedDiscountIsSavedWithPriorityAsDecimalOrNot() throws Exception {
        DP.verifyWhetherTheCheckBasedDiscountIsSavedWithPriorityAsDecimalOrNot();
    }

    @Then("Check Offers Type is Selected Default as Percentage")
    public void checkOffersTypeIsSelectedDefaultAsPercentage() throws Exception {
        DP.Verify_the_PercentageOptionSelectedDefaultIn_Offers();
    }


    @And("I Enter the Check Based Discount Name with Single letter")
    public void iEnterTheCheckBasedDiscountNameWithSingleLetter() {
        DP.Enter_Discount_Name_Check_Discount("S");
    }

    @Then("Verify whether we able to Save the Check Based Discount with Single letter")
    public void verifyWhetherWeAbleToSaveTheCheckBasedDiscountWithSingleLetter() throws Exception {
        DP.verifyWhetherWeAbleToSaveTheItemBasedDiscountWithSingleLetter();
    }

    @Then("Verify whether the Check Based Discount is Saved or not")
    public void verifyWhetherTheCheckBasedDiscountIsSavedOrNot() {
        DP.Verify_Saved_Discount_is_displayed_are_Not("Check Discount 06");
    }

    @Given("I Search and Edit the Check Based Discount")
    public void iSearchAndEditTheCheckBasedDiscount() throws Exception {
        DP.iSearchAndEditTheCheckBasedDiscount("Item Discount 06");
    }

    @Then("I Verify Item Discount Discount Update screen Close or not")
    public void iVerifyItemDiscountDiscountUpdateScreenCloseOrNot() throws InterruptedException {
        cmp.VerifyMainScreenPageHeader("Discounts");
        Thread.sleep(500);
    }

    @And("I Remove the Categories")
    public void iRemoveTheCategories() throws Exception {
        DP.iRemoveLastOptionInTheSelectedOptions();
    }

    @And("I Select the Offers as Amount")
    public void iSelectTheOffersAsAmount() {
        DP.Click_Amount_DiscountRateType();
    }

    @Then("Verify whether the Check Based Discount is Updated or not")
    public void verifyWhetherTheCheckBasedDiscountIsUpdatedOrNot() {
        DP.Verify_Updated_Discount_is_displayed_are_Not("Check Discount 06");
    }

    @And("I Select the Offers as Set Price")
    public void iSelectTheOffersAsSetPrice() {
        DP.Click_Set_Price_DiscountRateType();
    }

    @Then("Check Offers as Set Price")
    public void checkOffersAsSetPrice() {
        DP.Verify_DiscountRate_As_SetPrice_Is_Selected();
    }

    @And("I Select the Offers as Free Item")
    public void iSelectTheOffersAsFreeItem() {
        DP.Click_Free_Item_DiscountRateType();
    }

    @Then("Check Offers as Free Item")
    public void checkOffersAsFreeItem() {
        DP.Verify_DiscountRate_As_FreeItem_Is_Selected();
    }

    @Then("Check Offers as Percentage")
    public void checkOffersAsPercentage() {
        DP.Click_Percentage_DiscountRateType();
    }

    @Given("I Search the Check Based Discount and Click the Delete button")
    public void iSearchTheCheckBasedDiscountAndClickTheDeleteButton() throws Exception {
        DP.iSearchAndDeleteTheItemBasedDiscount("Check Discount 06");
    }

    @Then("Verify the Cancelled Check Based Discount Deleted or Inactivated or not")
    public void verifyTheCancelledCheckBasedDiscountDeletedOrInactivatedOrNot() {
        DP.verifytheCancelledItemisactiveordeactive("Check Discount 06");
    }

    @Then("I Verifying the Check Based Discount Deleted or not")
    public void iVerifyingTheCheckBasedDiscountDeletedOrNot() {
        DP.VerifytheCheckDiscountisdeleted();
    }

    @And("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Check Based Discount")
    public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedCheckBasedDiscount() throws InterruptedException {
        DP.Verifythe_Inactive_ItemDiscount("Item Discount 06");
    }

    @Given("I Search the Check Based Discount and Click the Active button")
    public void iSearchTheCheckBasedDiscountAndClickTheActiveButton() throws InterruptedException {
        DP.Verifythe_Inactive_ItemDiscountandActivate("Item Discount 06");
    }

    @Then("Verify the Cancelled Check Based Discount is Activated or not")
    public void verifyTheCancelledCheckBasedDiscountIsActivatedOrNot() {
        DP.VerifytheCheckDiscountisActivatedSuccessfully();
    }

    @Then("Check Offers as Amount")
    public void checkOffersAsAmount() {
        DP.Click_Amount_DiscountRateType();
    }

    @Then("I Verifying the Check Based Discount Activated or not")
    public void iVerifyingTheCheckBasedDiscountActivatedOrNot() {

    }

    @And("I Click the Active button to navigate Activated screen to Verify Activated Check Based Discount")
    public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedCheckBasedDiscount() throws InterruptedException {
        DP.Verifythe_Inactive_ItemDiscount("Check Discount 06");
    }

    @When("I Enter the New Check Based Discount Name")
    public void iEnterTheNewCheckBasedDiscountName() {
        DP.Enter_Discount_Name_Item_Discount("Item Discount 06" + "1");
    }

    @Then("Verify the Check Based Discount is Updated or not")
    public void verifyTheCheckBasedDiscountIsUpdatedOrNot() {
        DP.Verify_Updated_Discount_is_displayed_are_Not("Check Discount 06");
    }

    @Then("Verify whether the Duplicate Check Based Discount is Saved or not")
    public void verifyWhetherTheDuplicateCheckBasedDiscountIsSavedOrNot() throws Exception {
        cmp.VerifySaveConfirmationAlertMessage("Save");
    }

    @When("I Enter the New Check Based Discount Name with Space")
    public void iEnterTheNewCheckBasedDiscountNameWithSpace() throws InterruptedException {
        DP.iEnterTheNewItemBasedDiscountNameWithSpace();
    }

    @Then("Verify whether the Check Based Discount Name with Space in end is Updated or not")
    public void verifyWhetherTheCheckBasedDiscountNameWithSpaceInEndIsUpdatedOrNot() {
        DP.Enter_Discount_Name_Item_Discount("Check Discount 06 ");
    }
}
