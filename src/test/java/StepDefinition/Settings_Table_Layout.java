package StepDefinition;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.Settings_Table_Layout_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_Table_Layout 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage();

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Table_Layout_Page TL = new Settings_Table_Layout_Page();

	@Given("Open Table Layout home page BaseURL and StoreID")
	public void openTableLayoutHomePageBaseURLAndStoreID() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"tableLayout");
	}
	@Given("Verifying the Table Layout Header Page")
	public void verifyingTheTableLayoutHeaderPage()
	{
	   //cmp.VerifyMainScreenPageHeader("Table Layout");
		if(driver.findElement(By.xpath("//h3[contains(.,'Table Layout')]")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Table Layout Header Displayed");
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else {
			test.log(LogStatus.FAIL,"Table Layout Header Not Displayed");
		}
	}
	
	@Then("Verify Add Floor button is Displayed or Not")
	public void verifyAddFloorButtonIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(TL.AddFloor_Btn,"Add Floor Button Displayed");
	}
	@Then("Verify Static object is Displayed or Not")
	public void verifyStaticObjectIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//h6[.='Static object']")),"Static Object Displayed");
	}
	@Then("Verify Guest Count Checkbox is Displayed or Not")
	public void verifyGuestCountCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(TL.GuestCount,"Guest Count Checkbox Displayed");
	}
	@Then("Verify Customer Checkbox is Displayed or Not")
	public void verifyCustomerCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(TL.Customer,"Customer Checkbox Displayed");
	}
	@Then("Verify Employee Checkbox is Displayed or Not")
	public void verifyEmployeeCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(TL.Employee,"Employee Checkbox Displayed");
	}
	@Then("Verify Wait Time Checkbox is Displayed or Not")
	public void verifyWaitTimeCheckboxIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(TL.WaitTime,"Wait Time Checkbox Displayed");
	}
	@Then("Verify Floor Settings is Displayed or Not")
	public void verifyFloorSettingsIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(TL.FloorSettings,"Floor Settings Displayed");
	}
	@Then("Verify Delete Floor is Displayed or Not")
	public void verifyDeleteFloorIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(TL.DeleteFloor,"Delete Floor Displayed");
	}

	@Given("Uncheck the Table Name Checkbox")
	public void uncheckTheTableNameCheckbox() 
	{
		try
		{
			if(TL.TableName_Checkbox_SLD.isDisplayed())
			{
				TL.TableName_Checkbox.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Given("Uncheck the Guest Count Checkbox")
	public void uncheckTheGuestCountCheckbox() 
	{
		try
		{
			if(TL.GuestCount_SLD_Checkbox.isDisplayed())
			{
				TL.GuestCount.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Given("Uncheck the Customer Checkbox")
	public void uncheckTheCustomerCheckbox()
	{
		try
		{
			if(TL.Customer_Checkbox_SLD.isDisplayed())
			{
				TL.Customer.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Given("Uncheck the Employee Checkbox")
	public void uncheckTheEmployeeCheckbox() 
	{
		try
		{
			if(TL.Employee_Checkbox_SLD.isDisplayed())
			{
				TL.Employee.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Given("Uncheck the Wait Time Checkbox")
	public void uncheckTheWaitTimeCheckbox()
	{
		try
		{
			if(TL.WaitTime_Checkbox_SLD.isDisplayed())
			{
				TL.WaitTime.click();
			}
		}
		catch(Exception l)
		{}
	}
	@Then("Verify Table Layout Settings Saved or Not")
	public void verifyTableLayoutSettingsSavedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Store layout updated successfully")) 
		{
			test.log(LogStatus.PASS, "Store layout updated successfully message is displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Store layout updated successfully message is not displayed");
		}
	}

	@Given("Check the Table Name Checkbox")
	public void checkTheTableNameCheckbox()
	{
	    TL.TableName.click();
	}
	@Given("Check the Guest Count Checkbox")
	public void checkTheGuestCountCheckbox() 
	{
	  TL.GuestCount.click();
	}
	@Given("Check the Customer Checkbox")
	public void checkTheCustomerCheckbox()
	{
	  TL.Customer.click();
	}
	@Given("Check the Employee Checkbox")
	public void checkTheEmployeeCheckbox() 
	{
	   TL.Employee.click();
	}
	@Given("Check the Wait Time Checkbox")
	public void checkTheWaitTimeCheckbox() 
	{
	    TL.WaitTime.click();
	}

	@Given("Click on Add Floor button")
	public void clickOnAddFloorButton() throws Exception
	{
		for(int i=1;i<=15;i++) 
		{
			Thread.sleep(500);
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
	    TL.AddFloor_Btn.click();
	}
	@Then("Verify New Floor Header")
	public void verifyNewFloorHeader() 
	{
	    cmp.VerifyCreationScreenPageHeader("New Floor");
	}
	
	@Given("Enter Floor Name Exceeding Limit")
	public void enterFloorNameExceedingLimit() 
	{
		//Enter the tip out name more than 25 chars
		TL.FloorName.sendKeys(RandomStringUtils.randomAlphanumeric(30));

				//get the count totally entered in the tip out name filed
				String FN = TL.FloorName.getAttribute("value");

				//Check the length of the Tip Out Name
				if(FN.length() == 25)
				{
					test.log(LogStatus.PASS, "Floor Name field accepts only 25 chars");
				}else if(FN.length() == 30)
				{
					test.log(LogStatus.FAIL, "Floor Name field accepts more than 25 chars");
				}   
	}
	
	@Given("Enter the Floor Name")
	public void enterTheFloorName() 
	{
	  TL.FloorName.sendKeys("Floor1");  
	}
	@Given("Enter Order Sequence")
	public void enterOrderSequence() throws Exception 
	{
	   TL.OrderSequence.clear();
	   Thread.sleep(500);
	   TL.OrderSequence.sendKeys("4");
	}
	
	@Given("Click on Eclipse Table")
	public void clickOnEclipseTable() throws Exception 
	{
	// driver.findElement(By.xpath("//span[contains(.,'Temp Floor')]")).click();
	 Thread.sleep(500);
	   TL.EclipseTable.click();
	}

	@Given("Click on Edit Table")
	public void clickOnEditTable()
	{
	  TL.EditTble.click();
	}
	@Then("Verify Table Edit Screen Header")
	public void verifyTableEditScreenHeader() 
	{
	   cmp.VerifyCreationScreenPageHeader("Edit Table");
	}
	
	@Given("Enter Number Of Seats")
	public void enterNumberOfSeats() throws Exception 
	{
	    TL.EnterNumberOfSeats.clear();
	    Thread.sleep(500);
	    TL.EnterNumberOfSeats.sendKeys("3");
	}

	@Given("Click on Duplicate")
	public void clickOnDuplicate() 
	{
	    TL.DuplicateTble.click();
	}
	
	@Given("Click on Delete Table")
	public void clickOnDeleteTable() 
	{
	    TL.DeleteTble.click();
	}
	
	@And("I Click the Delete button in Table")
	public void Click_DeleteButton() 
	{
		driver.findElement(By.xpath("(//button[contains(.,' Delete ')])[2]")).click();
	}

	@Given("Click on Rectangle Table")
	public void clickOnRectangleTable() 
	{
	    TL.RectangleTable.click();
	}

	@Given("Click on Floor Settings")
	public void clickOnFloorSettings() 
	{
	   TL.FloorSettings.click();
	}
	@Then("Verify Floor Settings Header")
	public void verifyFloorSettingsHeader()
	{
	    cmp.VerifyCreationScreenPageHeader("Floor Settings");
	}
	
	@Then("Verify Floor Name already present Error Message")
	public void verifyFloorNameAlreadyPresentErrorPopup()
	{
	  if(driver.findElement(By.xpath("//span[.=' Floor Name already present ']")).isDisplayed())
	  {
		  test.log(LogStatus.PASS,"Floor Name Already Exist Popup Displayed");
		  ut.PassedCaptureScreenshotAsBASE64();
	  }
	  else
	  {
		  test.log(LogStatus.FAIL,"Floor Name Already Exist Popup Not Displayed");
		  ut.FailedCaptureScreenshotAsBASE64();
	  }
	}

	@Given("Click on Delete Floor button")
	public void clickOnDeleteFloorButton() throws Exception
	{
	  TL.DeleteFloor.click();
	  
	  Thread.sleep(500);
		//Click the Delete button
		cmp.Alert_PopupMsg("You are about to delete this table. Are You Sure?");
	}
	
}
