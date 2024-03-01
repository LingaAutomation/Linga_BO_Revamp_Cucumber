package StepDefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.BulkUpdatePage;
import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Product_and_Items_Bulk_Update 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
//	ExtentReports Trep = ExtentManager.getInstance();
//	ExtentTest Ttest = rep.startTest("AddEditDelete Departments");
	
	
	
	
	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	BulkUpdatePage bup = new BulkUpdatePage();
	CategoriesPage ctp= new CategoriesPage();

	@Given("Open the Bulk Update home page BaseURL and StoreID")
	public void OpenBulUpdateHomePage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"bulkMenuUpdate");
	}

	@Given("Sort the MenuItem column")
	public void sortTheBulkUpdateColumn() 
	{
		BulkUpdatePage bup = new BulkUpdatePage();
		ArrayList<String> ArLst=new ArrayList<String>();

		bup.MenuItemColumn.click();

		List<WebElement> Lst=driver.findElements(By.xpath("//table/tbody/tr/td[3]"));

		for(WebElement ele:Lst)
		{
			ArLst.add(ele.getText());
		}

		ArrayList<String> sortedLst=new ArrayList<String>();

		for(String st:ArLst)
		{
			sortedLst.add(st);
		}

		Collections.sort(sortedLst);
		//Collections.reverse(sortedLst);
		//System.out.println(sortedLst);

		if(sortedLst.equals(ArLst))
		{
			//test.log(LogStatus.PASS, "Ascending Order Sorted Correctly for "+driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).getText());

			ut.PassedCaptureScreenshotAsBASE64();
			System.out.println("Sorted List from Table(Actual - Ascending) : "+ArLst);
			System.out.println("Sorted List from Table(Expected - Ascending) : "+sortedLst);
		}
		else
		{
			//test.log(LogStatus.FAIL, "Ascending Order Sorted Incorrect for "+driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).getText());

			ut.FailedCaptureScreenshotAsBASE64();

			System.out.println("Sorted List from Table(Actual - Ascending) : "+ArLst);
			System.out.println("Sorted List from Table(Expected - Ascending) : "+sortedLst);
		}
	}


	@Given("I Search the Category Under Category field in the Bulk Update page Home Page")
	public void iSearchTheCategoryUnderCategoryFieldInTheBulkUpdatePageHomePage() throws Exception 
	{
		BulkUpdatePage bup = new BulkUpdatePage();
		bup.Category_Dropdown.click();
        Thread.sleep(500);
        if(driver.findElement(By.xpath("(//select-option/div)[3]")).isDisplayed())
			{
				String SearchText=driver.findElement(By.xpath("(//select-option/div)[3]")).getText();

				bup.SearchDropdown(SearchText);
			}
        
//		try
//		{
//
//			if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
//			{
//				String SearchText=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
//
//				cmp.Search(SearchText);
//			}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	@Then("Check the Selected Category listing out in the Bulk Update")
	public void checkTheSelectedCategoryListingOutInTheBulkUpdate() 
	{
		try {
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Searched Category Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Searched Category not Displayed");
		}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Searched Category not Available");
		}
	}

	@Given("I Search the SubCategory Under SubCategory field in the Bulk Update page Home Page")
	public void iSearchTheSubCategoryUnderSubCategoryFieldInTheBulkUpdatePageHomePage() throws Exception 
	{
		
		bup.Category_Dropdown.click();
        Thread.sleep(500);
        if(driver.findElement(By.xpath("(//select-option/div)[3]")).isDisplayed())
			{
				String SearchText=driver.findElement(By.xpath("(//select-option/div)[3]")).getText();

				bup.SearchDropdown(SearchText);
			}
//		try {
//			if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
//			{
//				String SearchText=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
//
//				cmp.Search(SearchText);
//			}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	@Then("Check the Selected SubCategory listing out in the Bulk Update")
	public void checkTheSelectedSubCategoryListingOutInTheBulkUpdate()
	{
		try {
			if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
			{
				test.log(LogStatus.PASS, "Searched SubCategory Displayed");
			}
			else
			{
				test.log(LogStatus.FAIL, "Searched SubCategory not Displayed");
			}
			}
			catch (Exception e) {
				test.log(LogStatus.INFO,"Searched SubCategory not Available");
			}
	}

	@Given("I Click Select All Category or SubCategory Check Box")
	public void iClickSelectAllCategoryOrSubCategoryCheckBox() 
	{
		driver.findElement(By.xpath("//table//th[1]")).click();
	}
	
	@Given("Verifying the BulkUpdate Homepath")
	public void VerifyingBulkUpdateHomePath() 
	{
		String Home = ctp.Home().getText();
		String Path1 = ctp.Products_Items().getText();
		String Path2 = ctp.path1().getText();
		//String Path2 = ctp.path2().getText();

		String total = Home+Path1+Path2;
		System.out.println(total);

		if(total.equalsIgnoreCase("Home /Products/Items / Bulk Update")) {

			test.log(LogStatus.PASS, "Bulk Update Home Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Bulk Update Home Path is not displayed");
		}
	}
	@Then("Check Bulk Change button is Enabled")
	public void checkBulkChangeButtonIsEnabled() 
	{
		if(bup.BulkChange_Button.isEnabled()) 
		{
			test.log(LogStatus.PASS,"Bulk Change Button is Enabled");
		}
		else {
			test.log(LogStatus.FAIL,"Bulk Change button is not enabled");
		}
	}

	@Given("I Select the Category as All")
	public void iSelectTheCategoryAsAll() throws Exception 
	{
//		bup.Category_Dropdown.click();
//		Thread.sleep(500);
//		bup.All.click();
		cmp.Click_DropDown_withSelection(bup.Category_Dropdown, "All", "Category Selected as All");
	}
	@Given("I Select the SubCategory")
	public void iSelectTheSubCategory() throws Exception 
	{
		bup.SubCategory_Dropdown.click();
        Thread.sleep(500);
        if(driver.findElement(By.xpath("(//select-option/div)[3]")).isDisplayed())
			{
				String SearchText=driver.findElement(By.xpath("(//select-option/div)[3]")).getText();

				bup.SearchDropdown(SearchText);
			}
	}
	@Given("I Select Any SubCategory Check Box")
	public void iSelectAnySubCategoryCheckBox() 
	{
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).click();
	}
	@Given("I Click the Bulk Change button")
	public void iClickTheBulkChangeButton() 
	{
		bup.BulkChange_Button.click();
	}
	@Then("Verify the Bulk Change Header")
	public void verifyTheBulkChangeHeader() 
	{
		cmp.VerifyCreationScreenPageHeader(" Bulk Change ");
	}

	@Then("I Verify Bulk Change screen Close or not")
	public void iVerifyBulkChangeScreenCloseOrNot() throws Exception 
	{
		cmp.Click_CancelButton();
		Thread.sleep(500);
		cmp.Verify_Close_Cancel_CreationScreen("Bulk Change");
	}

	@Given("I Select Any Category Check Box")
	public void iSelectAnyCategoryCheckBox() 
	{
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).click();;
	}

	@Given("I Select Operation Type as Increase")
	public void iSelectOperationTypeAsIncrease() throws Exception 
	{
		Thread.sleep(3000);
		bup.Increase_button.click();
	}
	@Given("I Select Change By as Amount")
	public void iSelectChangeByAsAmount() 
	{
		bup.Amount_button.click();
	}
	@Given("I Click the Change button")
	public void iClickTheChangeButton() 
	{
		bup.Change_button.click();
	}
	@Then("Check the Increased Change To Price with Existing and Change")
	public void checkTheIncreasedChangeToPriceWithExistingAndChange() 
	{
	   String ExistingPrice = bup.Existing_Price.getText().toString().replaceAll("[a-zA-Z $ ₹ % +-,. :]", "");
	   test.log(LogStatus.INFO,"Existing Price :"+ExistingPrice);
	   double ExisingValue =Double.parseDouble(ExistingPrice);
	   String ChangeTo = bup.ChangeTo_InputBox.getAttribute("value");//getText().toString().replaceAll("[a-zA-Z $ ₹ % +-,. :]", "");
	   test.log(LogStatus.INFO,"ChangeTo Price :"+ChangeTo);
	   double ChangeToValue = Double.parseDouble(ChangeTo);
	   
	   double Diff = (ExisingValue - ChangeToValue);
	   
	   String Change = bup.Change_Inputbox.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % +,-:]","");
	   test.log(LogStatus.INFO,"changed value:"+Change);
	   double ChangeValue = Double.parseDouble(Change);
	   
	   if(Diff == ChangeValue)
	   {
		   test.log(LogStatus.PASS,"Changed Value Displayed:"+Diff);
	   }
	   else 
	   {
		   test.log(LogStatus.FAIL,"Changed Value Displayed");
	   }
	}
	@Then("I Click the Update Item Price button")
	public void iClickTheUpdateItemPriceButton() 
	{
		bup.UPDATE_ITEM_PRICE.click();
	}
	@Then("Verify whether the Bulk Update Updated or not")
	public void verifyWhetherTheBulkUpdateUpdatedOrNot() throws Exception 
	{
		cmp.VerifySaveConfirmationAlertMessage("Bulk Update Updated");
	}
	@Then("Check the Updated Existing Price After Increased Amount")
	public void checkTheUpdatedExistingPriceAfterIncreasedAmount()
	{
		  String ExistingPrice = bup.Existing_Price.getText().toString().replaceAll("[a-zA-Z $ ₹ % +-,. :]", "");
		   double ExisingValue =Double.parseDouble(ExistingPrice);
		   test.log(LogStatus.INFO,"Updated Existing Price :"+ExisingValue);
	}
	@Given("I Select Operation Type as Decrease")
	public void iSelectOperationTypeAsDecrease() 
	{
		bup.Decrease_button.click();
	}

	@Then("Check the Decreased Change To Price with Existing and Change")
	public void checkTheDecreasedChangeToPriceWithExistingAndChange() 
	{
	   String ChangeTo = bup.ChangeTo_InputBox.getAttribute("value");//getText().toString().replaceAll("[a-zA-Z $ ₹ % +-,. :]", "");
	   double ChangeToValue = Double.parseDouble(ChangeTo);
	   
	   test.log(LogStatus.INFO,"Decreased changeprice value:"+ChangeToValue);
	}

	@Then("Check the Updated Existing Price After Decreased Amount")
	public void checkTheUpdatedExistingPriceAfterDecreasedAmount() 
	{
		 String ExistingPrice = bup.Existing_Price.getText().toString().replaceAll("[a-zA-Z $ ₹ % +-,. :]", "");
		   double ExisingValue =Double.parseDouble(ExistingPrice);
		   test.log(LogStatus.INFO,"Updated Existing Price :"+ExisingValue);
	}

	@Then("Check the Updated Existing Price After Increased Percentage")
	public void checkTheUpdatedExistingPriceAfterIncreasedPercentage() 
	{
		 String ExistingPrice = bup.Existing_Price.getText().toString().replaceAll("[a-zA-Z $ ₹ % +-,. :]", "");
		   double ExisingValue =Double.parseDouble(ExistingPrice);
		   test.log(LogStatus.INFO,"Updated Existing Price :"+ExisingValue);
	}
	@Then("Check the Updated Existing Price After Decreased Percentage")
	public void checkTheUpdatedExistingPriceAfterDecreasedPercentage() {
		 String ExistingPrice = bup.Existing_Price.getText().toString().replaceAll("[a-zA-Z $ ₹ % +-,. :]", "").trim();
		   double ExisingValue =Double.parseDouble(ExistingPrice);
		   test.log(LogStatus.INFO,"Updated Existing Price :"+ExisingValue);
	}

	@Given("I Click the Active button to Navigate Inactivated screen")
	public void iClickTheActiveButtonToNavigateInactivatedScreen()
	{
		cmp.Click_ActivetoInactiveButton();
	}
	@Then("Verify Inactivated Categories\\/SubCategories in Bulk Update")
	public void verifyInactivatedCategoriesSubCategoriesInBulkUpdate()
	{
		List<WebElement> InactivatedCategory_SubCategory = driver.findElements(By.xpath("//table/tbody/tr"));
		int InactivateList = InactivatedCategory_SubCategory.size();
		test.log(LogStatus.INFO,"Inactivated Categories/SubCategories List:"+InactivateList);
	}

	@Given("I Select Change By as Percentage")
	public void iSelectChangeByAsPercentage() 
	{
		bup.Percentage_button.click();
	}

	@Given("I Click the Inactive button to Navigate Inactivated screen")
	public void iClickTheInactiveButtonToNavigateInactivatedScreen() 
	{
		cmp.Click_InactivetoActiveButton();
	}

	@Given("I Enter the Change To Value")
	public void iEnterTheChangeToValue() throws Exception
	{
		bup.ChangeTo_InputBox.clear();
		Thread.sleep(500);
		bup.ChangeTo_InputBox.sendKeys("45000");
	}
	
	@And("I Select the Category in Bulk Update")
	public void SelectCategoryinBulkUpdate() throws Exception 
	{
		bup.Category_Dropdown.click();
        Thread.sleep(500);
        if(driver.findElement(By.xpath("(//select-option/div)[3]")).isDisplayed())
			{
				String SearchText=driver.findElement(By.xpath("(//select-option/div)[3]")).getText();

				bup.SearchDropdown(SearchText);
			}
	}
	


	@Then("Check Change button is Enabled")
	public void checkChangeButtonIsEnabled() 
	{
	   if(bup.Change_button.isEnabled()) 
	   {
		   test.log(LogStatus.PASS,"Change button is Enabled");
	   }
	   else {
		   test.log(LogStatus.FAIL,"Change button is not enabled");
	   }
	}





}
