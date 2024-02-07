package StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.Availability_RestrictionTimePage;
import com.Pages.Common_XPaths;
import com.Pages.DisplayGroupsPage;
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
import io.cucumber.java.en.When;

public class Product_and_Items_Display_Groups 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;




	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	DisplayGroupsPage dgp = new DisplayGroupsPage();
	Availability_RestrictionTimePage at=new Availability_RestrictionTimePage();
	public String MenuItem;


	@Given("Open the Display Group home page BaseURL and StoreID")
	public void openTheDisplayGroupHomePageBaseURLAndStoreID() throws Exception
	{
		Thread.sleep(5000);
		//Load the Display Group page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"displayGroup");
	}

	@Given("Verifying the Display Group Header Page")
	public void verifyingTheDisplayGroupHeaderPage() throws Exception 
	{
		Thread.sleep(5000);
		//Verify the Display Groups page loaSded or not
		cmp.VerifyMainScreenPageHeader("Display Group");	

		Thread.sleep(2000);
//		cmp.Close_Online_Help_ChatBox();

	}

	@Given("Click the New Display Group button")
	public void Click_NewDisplayGroup_Button()
	{
		//Click the New Display Groups
		dgp.Click_NewDisplayGroup();
	}

	@When("Verify the New Display Group Header")
	public void Verify_New_DisplayGroup_Button() throws Exception 
	{
		Thread.sleep(7000);
		//Verify the New Display Group creation screen opened or not
		cmp.VerifyCreationScreenPageHeader_Two("New Display Group");
	}

	@And("I Click the Save button without Entering Display Group Name")
	public void Verify_Save_Button_Without_Entering_Display_Group_Name() throws Exception
	{
		new Common_XPaths().NameInputBox().clear();

		Thread.sleep(2000);

		if(cmp.Save_and_PublishButton().isEnabled())
		{
			//Click the Save button
			cmp.Click_Save_and_PublishButton();

			cmp.Wait_ForElementVisibility(cmp.ConfirmationAlertMsg(), 40);
			//Check whether the New Tax Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Saved And Published Successfully"))
			{
				test.log(LogStatus.FAIL, "Display Group saved Successfully without Entering Name");

				ut.FailedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Name"))
			{
				test.log(LogStatus.PASS, "Please Enter Name Pop up Displayed");

				ut.PassedCaptureScreenshotAsBASE64();

			}
		}
		else
		{
			test.log(LogStatus.PASS, "Save and Publish button not Enabled without Entering Name");
		}
	}

	@And("I Enter the Display Group Name Exceeding the limit")
	public void iEnterTheDisplayGroupNameExceedingTheLimit() throws Exception 
	{
		Thread.sleep(4000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}

	@When("I Enter Display Group Name")
	public void Enter_Display_GroupName() throws Exception 
	{
		//Enter the Display Group Name
		cmp.EnterName(Utility.getProperty("DisplayGroupName"));
	}

	//	@Then("Check the Save and Publish button is Disabled")
	//	public void Verify_Save_And_Publish_IsDisabled()
	//	{
	//		// Write code here that turns the phrase above into concrete actions
	//		assertEquals(!cmp.Save_and_PublishButton().isEnabled(), true);
	//		//			sa.equals(cmp.Save_Button().isEnabled());
	//
	//		//			if(cmp.save)
	//
	//		ut.PassedCaptureScreenshotAsBASE64();
	//	}

	@And("I Enter the Single letter in Display Group Name")
	public void Enter_Single_Letter_In_Name_Field() throws Exception
	{
		cmp.EnterName("D");
	}

	@And("I Select the Multiple Menu Items")
	public void Select_Multiple_MenuItem() throws Exception
	{
		try
		{
			//Select Menu Item
			Thread.sleep(2000);
			for(int i=1;i<=4;i++)
			{
				Thread.sleep(2000);
				dgp.Select_MenuItemsDisplayGroup();
			}
		}
		catch(Exception g)
		{

		}
	}

	@Then("Verify whether we able to Save the Display Group with Single letter")
	public void Verify_AbleToSave_Display_Group_With_Single_Letter() throws Exception 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Display Group Saved with Single Letter");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
		{
			test.log(LogStatus.PASS, "Display Group Already Saved with Single Letter");

			ut.PassedCaptureScreenshotAsBASE64();
			cmp.Click_BackspaceButton();
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled while Entering Single Letter");
		}
	}

	@And("I Select the Menu item")
	public void Select_MenuItem() throws Exception
	{
		dgp.Select_MenuItemsDisplayGroup();
	}

	@Then("Verify DisplayGroup Saved Or Not")
	public void Verify_Display_Group_Saved_OrNot() throws Exception
	{
		Thread.sleep(3000);
		//Check whether the New Display Group Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Saved And Published Successfully"))
		{
			test.log(LogStatus.PASS, "New Display Group Saved And Published Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "New Display Group Save Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Search and Click Edit Display Group")
	public void Search_And_Click_Edit() throws Exception 
	{
		//Thread.sleep(30000);
		//Search the Display Groups to Click Edit and Cancel
		cmp.SearchAndClickEdit(Utility.getProperty("DisplayGroupName"));
	}

	@Then("Verify Update Display Group Header")
	public void Verify_Update_Screen_Header() throws Exception 
	{
		Thread.sleep(1000);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader_Two("Update Display Group");
	}

	@Then("Verify Edit Screen Closed or Not")
	public void Verify_Edit_Screen_Closed_orNot() throws Exception
	{
		Thread.sleep(1000);
		//Check whether the New Display Group Creation form Closed or not
		if(!cmp.NewCreationScreenHeader().isDisplayed())
		{
			test.log(LogStatus.PASS, "Display Group Cancelled");
		}
		else
		{
			test.log(LogStatus.FAIL, "Display Group not Cancelled");
		}
	}

	@And("I Delete the Menu Item")
	public void Delete_MenuItem() throws Exception 
	{
		dgp.Delete_MenuItems();
	}

	@And("I Select Sort By Option as Z-A")
	public void Sort_ZtoA() throws Exception 
	{
		dgp.Select_ZtoASorting();
	}

	@Then("Verfiy whether Display Groups Updated or Not")
	public void iVerify_DisplayGroup_Updated_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Display Group Updated or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Updated And Published Successfully"))
		{
			test.log(LogStatus.PASS, "New Display Group Updated And Published Successfully for Date Range");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "New Display Group updated fail for Date Range");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Select Sort By Option as Custom")
	public void Select_Custom_Sort_Option() throws Exception 
	{
		dgp.Select_CustomSorting();
	}

	@And("I Select Sort By Option as A-Z")
	public void Select_Sort_AtoZ() throws Exception 
	{
		dgp.Select_AtoZSorting();
	}

	@Given("I Search the Display Group and Click the Delete button")
	public void Search_And_Click_Delete_Button() throws Exception
	{
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("DisplayGroupName"));
	}

	@Then("Verify the Cancelled Display Group Deleted\\/Inactivated or not")
	public void verifyTheCancelledDisplayGroupDeletedInactivatedOrNot() 
	{
		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Inactivated Successfully"))
			{
				test.log(LogStatus.FAIL, "Display Group Deleted when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Display Group not Deleted when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}

	}

	@And("I Verifying the Display Group Deleted or not")
	public void Verify_DisplayGroup_Deleted_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Display Group Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Display Group Inactivated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Display Group Inactivated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Display Group")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedDisplayGroup() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();

		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");

		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("DisplayGroupName"));
	}

	@Given("I Search the Display Group and Click the Active button")
	public void Search_And_Click_ActivateButton() throws Exception 
	{
		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("DisplayGroupName"));

		Thread.sleep(1500);
		//Click the Delete button
		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");

	}

	@Then("Verify the Cancelled Display Group is Activated or not")
	public void Verify_CancelledDisplayGroup_Activated_OrNot() 
	{
		try
		{
			Thread.sleep(3000);
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Activated Successfully"))
			{
				test.log(LogStatus.FAIL, "Display Group Activated when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Display Group not Activated when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}

	}

	@Then("I Verifying the Display Group Activated or not")
	public void Verify_DisplayGroup_Activated_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Display Group Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Display Group activated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Display Group activated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Click the Active button to navigate Activated screen to Verify Activated Display Group")
	public void iClickTheActiveButtonToNavigateActivatedScreenToVerifyActivatedDisplayGroup() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();

		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");

		//Verify whether the Category activated or not
		cmp.Verify_Search(Utility.getProperty("DisplayGroupName"));
	}

	@When("I Enter the New Display Group Name with Space")
	public void Enter_DisplayGroup_Name_WithSpace() throws Exception 
	{
		// Write code here that turns the phrase above into concrete actions
		cmp.EnterName(Utility.getProperty("DisplayGroupName")+Keys.SPACE);
	}

	@Then("Verify whether the Display Group Name with Space in end is Updated or not")
	public void verifyWhetherTheDisplayGroupNameWithSpaceInEndIsUpdatedOrNot() throws Exception 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Updated And Published Successfully"))
		{
			test.log(LogStatus.PASS, "DisplayGroup Updated with Space in the End of DisplayGroup Name");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "DisplayGroup Name already exist pop up displayed when Entering Space in the End of DisplayGroup Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_BackspaceButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of DisplayGroup Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_BackspaceButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "DisplayGroup not Saved with Space in the End of Category Name");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Verify whether the Duplicate Display Group is Saved or not")
	public void Verify_Duplicate_DisplayGroup_Saved_OrNOt() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Display Group Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Name already exist pop up displayed");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_BackspaceButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Display Group Saved And Published Successfully"))
		{
			test.log(LogStatus.FAIL, "Duplicate Display Group Saved");

			ut.FailedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_BackspaceButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Name already exist pop up not Displayed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("Navigate to MenuItem page and Get the value of MenuItem which has Price and navigate to the DisplayGroup page")
	public void NavigatetoMenuItemandgettheValueandNavigateTotheDisplayGroup() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"productItems");


		Thread.sleep(5000);
		//Verify the Departments page loaded or not
		cmp.VerifyMainScreenPageHeader("Products/Items");
		
		String MenuItem=driver.findElement(By.xpath("//tr[1]/td[2]")).getText();
		this.MenuItem=MenuItem;
		System.out.println("Menu Item"+MenuItem);
		
		Thread.sleep(5000);
        lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"displayGroup");
	
		
		Thread.sleep(5000);
	}
	
	@And("I Select the price level Menu Item")
	public void Select_Price_Level_MenuItem() throws Exception 
	{
		dgp.Select_PriceLevel_MenuItem(MenuItem);
	}
	
	@And("Select the Price level From Dropdown")
	public void Select_PriceLevel_From_Dropdown() throws Exception 
	{
		dgp.Select_Price_Level();
	}
	
//	@And("I Click the Save and Publish button")
//	public void Click_Save_And_Publish() 
//	{
//		cmp.Click_Save_and_PublishButton();
//	}
	
//	@And("I Click the Cancel button DisplayGroup")
//	public void Click_Cancel_Button() 
//	{
//		dgp.Click_Cancel();
//	}
	
//	@And("I Click the Update and Publish button")
//	public void Click_Update_And_Publish() 
//	{
//		cmp.Click_Update_and_PublishButton();
//	}

//	@Then("Verify the Start time should be less than end time Error Mesasage")
//	public void verifyTheStartTimeShouldBeLessThanEndTimeErrorMesasage() throws Exception 
//	{
//		at.Verify_Error_Msg();
//	}
	
//	@Then("I Click the Backward button")
//	public void Click_BackWard_Button() throws Exception
//	{
//		cmp.Click_BackspaceButton();
//	}
}
