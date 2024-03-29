package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Pages.Availability_RestrictionTimePage;
import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.PaymentMethodsPage;
import com.Pages.Settings_Printer_Rerouting_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Settings_Printer_Rerouting 
{

	
	
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Printer_Rerouting_Page prr=new Settings_Printer_Rerouting_Page();
	CategoriesPage ctp=new CategoriesPage();
	Availability_RestrictionTimePage al=new Availability_RestrictionTimePage();
	
	@Given("Open the Settings - Printer Rerouting Settings home page BaseURL and storeID")
	public void openTheSettingsPrinterReroutingSettingsHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		//Load the Department page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"printerRerouting");

	}
	@Given("Verifying the Settings - Printer Rerouting Settings Header Page")
	public void verifyingTheSettingsPrinterReroutingSettingsHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
	    cmp.VerifyMainScreenPageHeader("Printer Rerouting");
	}
	@Given("I Click the New Reroute By Node button")
	public void iClickTheNewRerouteByNodeButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    prr.Add_Reroute_By_NodeBtn.click();
	}
	@When("Verify the New Re-Route By Node Header")
	public void verifyTheNewReRouteByNodeHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("Re-Route by Node");
	}
	@Given("I Select Reroute By Node Tab")
	public void iSelectRerouteByNodeTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    prr.Reroute_By_NodeTab.click();
	}
	@Then("Check From Printer Field in Table is Displayed")
	public void checkFromPrinterFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.From_Printer_Column_Field, "From Printer in Table Column Field");
	}
	@Then("Check To Printer Field in Table is Displayed")
	public void checkToPrinterFieldInTableIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.To_Printer_Column_Field, "To Printer in Table Column Field");
	}
	@Then("I Select Reroute By Role Tab")
	public void iSelectRerouteByRoleTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    prr.Reroute_By_RoleTab.click();
	}
	@Given("I Select From Printer")
	public void iSelectFromPrinter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch(prr.From_PrinterInputBx, "From Printer is Selected");
	}
	@Given("I Select To Printer")
	public void iSelectToPrinter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch(prr.To_PrinterInputBx, "To Printer is Selected");
	}
	@Given("I Select Node")
	public void iSelectNode() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch(prr.Node_InputBx, "Node is Selected");
 
	}
	@Given("I Select Same To Printer")
	public void iSelectSameToPrinter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    String FromPri=prr.From_PrinterInputBx.getAttribute("value");
	    
	    cmp.Click_DropDown_withSearchText(prr.To_PrinterInputBx, FromPri, "Same From Printer is selected to To Printer");
	}
	@Then("Check From and To Printers Should Not be Same Error is Displayed")
	public void checkFromAndToPrintersShouldNotBeSameErrorIsDisplayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Element_or_Text_Displayed(prr.From_To_Printer_Same_ErrorMsg, "From and To printers should not be same Error");
	}
	@Given("I Select the Availability as All Days")
	public void iSelectTheAvailabilityAsAllDays() {
	    // Write code here that turns the phrase above into concrete actions
	    prr.All_Days_AvailabilityRadioBx.click();
	}
	@Then("Verify whether the Printer Reroute Saved or Not")
	public void verifyWhetherThePrinterRerouteSavedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Printer Reroute Saved");
	}
	@Given("I Search and Edit the Reroute By Node")
	public void iSearchAndEditTheRerouteByNode() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		
	    String Node=driver.findElement(By.xpath("//table/tbody/tr["+rowList.size()+"]/td[1]")).getText();
	    
//	    cmp.SearchAndClickEdit(Node);
	    cmp.SearchBox.click();
	    Thread.sleep(500);
	    cmp.SearchBox.sendKeys(Node);
	    
	    Thread.sleep(2000);
	    List<WebElement> rowList1=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	    
		driver.findElement(By.xpath("//table/tbody/tr["+rowList1.size()+"]/td//div[1]/button")).click();

	    
	}
	@When("Verify the Update Reroute By Node Header")
	public void verifyTheUpdateRerouteByNodeHeader() {
	    // Write code here that turns the phrase above into concrete actions
	   cmp.VerifyCreationScreenPageHeader("Re-Route by Node");
	}
	@Then("I Verify Reroute By Node Update screen Close or Not")
	public void iVerifyRerouteByNodeUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Close_Cancel_CreationScreen("Re-Route by Node");
	}
	@Then("Verify whether the Printer Reroute Updated or Not")
	public void verifyWhetherThePrinterRerouteUpdatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Printer Reroute Updated");
	}
	@Then("I Verify the Selected Availability as All Days")
	public void iVerifyTheSelectedAvailabilityAsAllDays() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    cmp.Check_Button_Enabled(al.All_Days_AvailabiltyBtn, "All Days selected as Availability");
	}
	@Then("Check Restriction Time Toggle is Enabled")
	public void checkRestrictionTimeToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(al.RestrictionTime_YesBtn, "Restrcition Time");
	}
	@Then("I Disable the Restriction Time Toggle")
	public void iDisableTheRestrictionTimeToggle() {
	    // Write code here that turns the phrase above into concrete actions
	    al.RestrictionTime_NoBtn.click();
	}
	@Then("Check Restriction Time Toggle is Disabled")
	public void checkRestrictionTimeToggleIsDisabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Disabled(al.RestrictionTime_YesBtn, "Restrcition Time");
	}
	@Then("Check Restriction Days Toggle is Enabled")
	public void checkRestrictionDaysToggleIsEnabled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Check_Toggle_Enabled(al.RestrictionDays_YesBtn, "Restrcition Days");

	}
	@Given("I Search the Reroute By Node and Click the Delete button")
	public void iSearchTheRerouteByNodeAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		
	    String Node=driver.findElement(By.xpath("//table/tbody/tr["+rowList.size()+"]/td[1]")).getText();
	    
//	    cmp.SearchAndClickEdit(Node);
	    cmp.SearchBox.click();
	    Thread.sleep(500);
	    cmp.SearchBox.sendKeys(Node);
	    
	    Thread.sleep(2000);
	    List<WebElement> rowList1=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	    
		driver.findElement(By.xpath("//table/tbody/tr["+rowList1.size()+"]/td//div[2]/button")).click();

		
	    
	    Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Reroute By Node Deleted\\/Inactivated or Not")
	public void verifyTheCancelledRerouteByNodeDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Kitchen Printer Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Printer Reroute Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Printer Reroute Deleted when clicking Cancel button (Reroute By Node)");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Printer Reroute Not Deleted when Clicking Cancel button (Reroute By Node)");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the Reroute By Node Deleted or Not")
	public void iVerifyingTheRerouteByNodeDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Printer Reroute Deleted");
	}
	@Given("I Click the New Reroute By Role button")
	public void iClickTheNewRerouteByRoleButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    prr.Add_Reroute_By_RoleBtn.click();
	}
	@When("Verify the New Re-Route By Role Header")
	public void verifyTheNewReRouteByRoleHeader() {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifyCreationScreenPageHeader("Re-Route by Role");
	}
	@Given("I Select Role")
	public void iSelectRole() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Click_DropDown_withSearch(prr.Role_InputBx, "Role selected");
	}
	@Given("I Search and Edit the Reroute By Role")
	public void iSearchAndEditTheRerouteByRole() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		
	    String Role=driver.findElement(By.xpath("//table/tbody/tr["+rowList.size()+"]/td[1]")).getText();
	    
//	    cmp.SearchAndClickEdit(Node);
	    cmp.SearchBox.click();
	    Thread.sleep(500);
	    cmp.SearchBox.sendKeys(Role);
	    
	    Thread.sleep(2000);
	    List<WebElement> rowList1=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	    
		driver.findElement(By.xpath("//table/tbody/tr["+rowList1.size()+"]/td//div[1]/button")).click();

		
	}
	@When("Verify the Update Reroute By Role Header")
	public void verifyTheUpdateRerouteByRoleHeader() {
	    // Write code here that turns the phrase above into concrete actions
		 cmp.VerifyCreationScreenPageHeader("Re-Route by Role");
	}

	@Then("I Verify Reroute By Role Update screen Close or Not")
	public void iVerifyRerouteByRoleUpdateScreenCloseOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.Verify_Close_Cancel_CreationScreen("Re-Route by Role");
	}
	@Given("I Search the Reroute By Role and Click the Delete button")
	public void iSearchTheRerouteByRoleAndClickTheDeleteButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		
	    String Role=driver.findElement(By.xpath("//table/tbody/tr["+rowList.size()+"]/td[1]")).getText();
	    
//	    cmp.SearchAndClickEdit(Node);
	    cmp.SearchBox.click();
	    Thread.sleep(500);
	    cmp.SearchBox.sendKeys(Role);
	    
	    Thread.sleep(2000);
	    List<WebElement> rowList1=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	    
		driver.findElement(By.xpath("//table/tbody/tr["+rowList1.size()+"]/td//div[2]/button")).click();

		Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify the Cancelled Reroute By Role Deleted\\/Inactivated or Not")
	public void verifyTheCancelledRerouteByRoleDeletedInactivatedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		try
		{
		//Check whether the New Kitchen Printer Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Printer Reroute Deleted Successfully"))
		{
			test.log(LogStatus.FAIL, "Printer Reroute Deleted when clicking Cancel button (Reroute By Role)");
		
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Printer Reroute Not Deleted when Clicking Cancel button (Reroute By Role)");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("I Verifying the Reroute By Role Deleted or Not")
	public void iVerifyingTheRerouteByRoleDeletedOrNot() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    cmp.VerifySaveConfirmationAlertMessage("Printer Reroute Deleted");
	}
}
