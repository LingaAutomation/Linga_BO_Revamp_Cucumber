package StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Linga_Admin_Translations 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage repts=new ReportsPage();
	
	@Given("Open the Linga Admin-Translations page BaseURL and StoreID")
	public void OpenTranslationsHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"settings/translations");
		Thread.sleep(5000);
	}
	
	@Given("Verifying the Translations Header Page")
	public void VerifyTranslationHeader()
	{
		cmp.VerifyMainScreenPageHeader("Translations");
	}
	
	@Given("Verifying the Path Admin \\/ Settings \\/ Translations Displayed above the Header")
	public void VerifyingPath() 
	{
		String Admin = cmp.Home.getText();
		String Path1 = cmp.path1.getText();
		String Path2 = cmp.path2.getText();
		//String Path2 = ctp.path2().getText();

		String total = Admin+Path1+Path2;
		System.out.println(total);

		if(total.equalsIgnoreCase("Admin /Settings / Translations")) {

			test.log(LogStatus.PASS, "Translations Home Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Translations Home Path is not displayed");
		}
	}
	
	@Then("Verify the Please select languages to export translation template header in Translations is Displayed")
	public void VerifyPleaseSelectLanguagesHeader() 
	{
		if(lap.LanguagesHeading.isDisplayed())
		{
			test.log(LogStatus.PASS,"Please select languages to export translation template header displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Please select languages to export translation template headernot displayed");
		}
	}
	
	@Then("Verify the Upload the template to update translations header in Translations is Displayed")
	public void VerifyUploadTranslationsHeader() 
	{
		if(lap.UploadTemplateHeader.isDisplayed())
		{
			test.log(LogStatus.PASS,"Upload the template to update translations header in Translations is Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Upload the template to update translations header in Translations is not Displayed");
		}
	}
	
	@And("I Click the Languages")
	public void Click_LanguagesDropdown()
	{
		lap.ClickLanguagesDropdown();
	}
	
	@Then("Check List of Languages is Displayed")
	public void ChecktheListOfLanguagesDisplayed() 
	{
		List<WebElement> Languages = driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
		int Size = Languages.size();
		if(Size!=0)
		{
			test.log(LogStatus.PASS,"List Of Languages Displayed");
		}
		else {
			test.log(LogStatus.FAIL, "List Of Languages Not Displayed");
		}
	}
	
	@And("I Select All Languages")
	public void SelectAllLanguages() 
	{
		driver.findElement(By.xpath("(//select-option/div)[1]")).click();
	}
	
	@And("I Click the Dowload Template")
	public void ClickDownloadTemplate() throws Exception
	{
		lap.ClickDownloadTemplate();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}
	
	@And("I Deselect All Languages")
	public void DeslectAllLanguages() throws Exception 
	{
		lap.ClickCloseButton();
	}
	
	@And("I Select the Single Languages")
	public void SelectSingleLanguage() 
	{
		driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div[1]//select-option")).click();
	}
	
	@And("I Select the Multiple Languages")
	public void SelectMultipleLanguages() 
	{
		for(int i=1;i<=5;i++) 
		{
			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+i+"]//select-option")).click();
		}
	}
	
	@Then("Check Import button is Disabled")
	public void VerifyImportButton() 
	{
		if(driver.findElement(By.xpath("//button[.=' IMPORT ']")).isEnabled()) 
		{
			test.log(LogStatus.FAIL,"Import button is Enabled");
		}
		else {
			test.log(LogStatus.PASS,"Import Button is disabled");
		}
	}
	
	@And("I Upload the Template")
	public void UploadTemplate() throws Exception 
	{
		//lap.ClickUploadTemplate();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\sowjanya.garikapati\\Documents\\Dualprise_Tax.xlsx");
		
	}
	
	@Then("Check the Import button is Enabled")
	public void CheckImportButtonIsEnabled() throws Exception 
	{
		//cmp.Check_Button_Enabled(lap.Import,"Import Button Enabled");

		if(driver.findElement(By.xpath("//button[.=' IMPORT ']")).isEnabled()) 
		{
			test.log(LogStatus.PASS,"Import button is Enabled");
		}
		else {
			test.log(LogStatus.FAIL,"Import Button is disabled");
		}
	}
	
	@And("I Click the Import button")
	public void ClickImportButton() 
	{
		lap.Import.click();
	}
	
//	@Then("Verify the Updated Successfully or not")
//	public void VerifyUpdatedOrNot() 
//	{
//		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Updated successfully")) {
//			test.log(LogStatus.PASS,"Translation Updated Successfully");
//		}
//		else {
//			test.log(LogStatus.FAIL,"Translation Not updated Successfully");
//		}
//	}
	
	@And("I Remove the Uploaded Template")
	public void RemoveUploadedTemplate() 
	{
		lap.Upload_CancelButton.click();
	}
}
