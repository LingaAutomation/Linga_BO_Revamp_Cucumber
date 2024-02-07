package StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.Pages.TareGroupPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product_and_Items_Tare_Group 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;



	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	TareGroupPage tgp = new TareGroupPage();

	@Given("Open the TareGroup home page BaseURL and StoreID")
	public void openTheTareGroupHomePageBaseURLAndStoreID() throws Exception
	{
		Thread.sleep(5000);
		//Load the Tare Group page
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"tareGroup");
	}

	@Given("Verifying the TareGroup Header Page")
	public void verifyingTheTareGroupHeaderPage() throws Exception 
	{
		Thread.sleep(10000);
		//Verify the Tare Groups page loeded or not
		cmp.VerifyMainScreenPageHeader("Tare Group");

		Thread.sleep(2000);
//		cmp.Close_Online_Help_ChatBox();

	}

	@Given("I Click the New TareGroup button")
	public void Click_NewTareGroup() throws Exception 
	{
		Thread.sleep(2000);
		//Click the New Tare Groups
		tgp.Click_NewTareGroup();
	}

	@When("Verify the New TareGroup Header")
	public void VerifyNewTareGroupHeader() 
	{
		//Verify the New Tare Group creation screen opened or not
		cmp.VerifyCreationScreenPageHeader("New Tare Group");
	}

	@And("I Click the Save button without Entering TareGroup Name")
	public void Click_Save_Without_Entering_Name() throws Exception
	{
		tgp.Enter_TareGroupName("");

		if(cmp.Save_Button().isEnabled())
		{
			//Click the Save button
			cmp.Click_SaveButton();

			Thread.sleep(3000);
			//Check whether the New Tare Group Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter Tare Group Name"))
			{
				test.log(LogStatus.PASS, "Please Enter Tare Group Name Alert Displayed");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Please Enter Tare Group Name Alert not Displayed");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled without Entering Tare Group Name");
		}
	}

	@Then("I Enter the TareGroup Name Exceeding the limit")
	public void iEnterTheTareGroupNameExceedingTheLimit() throws Exception 
	{
		Thread.sleep(4000);
		cmp.Verify_Enter_Excess_Limit_Name(cmp.NameInputBox());
	}

	@And("I Enter the Single letter in Tare Group Name and Click the Save button")
	public void Enter_TareGroup_Single_Letter() throws Exception 
	{
		tgp.Enter_TareGroupName("t");

		if(cmp.Save_Button().isEnabled())
		{
			//Click the Save button
			cmp.Click_SaveButton();

			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Saved Successfully"))
			{
				test.log(LogStatus.PASS, "Tare Group Saved with Single Letter");

				ut.PassedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already Exist"))
			{
				test.log(LogStatus.PASS, "Tare Group Already Saved with Single Letter");

				ut.PassedCaptureScreenshotAsBASE64();
				cmp.Click_CancelButton();
			}
		}

		else
		{
			test.log(LogStatus.PASS, "Save button not Enabled while Entering Single Letter");
		}
	}

	@Then("I Verify the Set As Default Toggle is Disabled")
	public void Verify_Set_As_Default_Toggle()
	{
		if(cmp.NoToggleBtn.isSelected())
		{
			test.log(LogStatus.PASS,"By Default Set As Default Toggle is disabled");
		}
		else
		{
			test.log(LogStatus.FAIL,"By Default Set As Default Toggle is Enabled");
		}
	}


	@And("I Click on the Add Weight")
	public void Click_on_AddWeight_Button() 
	{
		tgp.Click_AddWeightsButton();
	}

//	@Then("Verify whether the Save button is Disabled")
//	public void verifyWhetherTheSaveButtonIsDisabled() 
//	{
//		// Write code here that turns the phrase above into concrete actions
//		assertEquals(!cmp.Save_Button().isEnabled(), true);
//		//			sa.equals(cmp.Save_Button().isEnabled());
//
//		//			if(cmp.save)
//
//		ut.PassedCaptureScreenshotAsBASE64();
//	}

	@When("I Enter the TareGroup Name")
	public void Enter_TareGroup_Name() throws Exception 
	{
		tgp.Enter_TareGroupName(Utility.getProperty("TareGroupNameWithWeight"));
	}

	@When("I Enter the TareGroup Name with No Sequence No")
	public void Enter_Name_Without_Seq_No() throws Exception 
	{
		tgp.Enter_TareGroupName(Utility.getProperty("TareGroupNameWithoutSeqNo"));
	}

	@And("I Enter the TareGroup Name2")
	public void Enter_TareGroup_Name2() throws Exception
	{
		tgp.Enter_TareGroupName(Utility.getProperty("TareGroupNameWithMulWeight"));
	}

	@And("I Clear the sequence number in Weights")
	public void Remove_Sequence_Number() throws Exception
	{
		Thread.sleep(3000);
		tgp.Remove_Sequence_Number();
		Thread.sleep(3000);
	}

	@And("I Enter the Weight Name")
	public void Enter_Weight_Name() throws Exception 
	{
		tgp.Enter_Weight_Name();
	}

	@And("I Enter the Unit of Measure Weight")
	public void Enter_Unit_Of_Measure_Weight() throws Exception
	{
		tgp.Select_UnitOfMeasures();
	}

	@And("I Enter the Unit of Measure Weight2")
	public void Enter_Unit_Of_Measure_Weight2() throws Exception
	{
		tgp.Select_UnitOfMeasures1();
	}

	@And("I Enter the Weight")
	public void Enter_Weight() throws Exception 
	{
		tgp.Enter_Weight();
	}

	@And("I Enter the Weight2")
	public void Enter_Weight2() throws Exception 
	{
		tgp.Enter_Weight1();
	}

	@Then("Verify whether the TareGroup Saved without Entering Weights Sequence Number or not")
	public void Verify_Wihtout_Sequence_No_Able_ToSave_TareGroup()
	{

		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please enter sequence number field."))
		{
			test.log(LogStatus.PASS, "Please Enter Sequence Number Popup Displayed");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Saved Succefully"))
		{
			test.log(LogStatus.FAIL, "Tare Group Saved without entering Sequence Number");

			ut.PassedCaptureScreenshotAsBASE64();
			//cmp.Click_CancelButton();
		}
	}

	@And("I Enter the Sequence Number")
	public void Enter_Sequence_Number() throws Exception
	{
		tgp.Enter_Sequence_Number_One();
	}

//	@And("I Clear the Name in Weights")
//	public void Remove_Weight_Name() throws Exception 
//	{
//		tgp.Remove_Weight_Name();
//	}
	
	@And("I Clear the Name in Weights")
	public void iClearTheNameInWeights() throws Exception
	{
		tgp.Remove_Weight_Name();
	}




	@Then("Verify whether the TareGroup Saved without Entering Weights Name or not")
	public void Verify_TareGroup_Saved_Or_Not_Without_WeightName() 
	{
		if(cmp.Save_Button().isEnabled())
		{
			//Click the Save button
			cmp.Click_SaveButton();

			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Saved Successfully"))
			{
				test.log(LogStatus.FAIL, "Tare Group Saved without Entering Weight Name");

				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		else 
		{
			test.log(LogStatus.PASS, "Save Button Not enabled without Entering Weight Name");

			ut.PassedCaptureScreenshotAsBASE64();
		}

	}

	@Then("Verify whether the TareGroup Saved without Selecting Weights Unit of Measure or not")
	public void Verify_AbleToSave_Without_Selecting_UnitOfMeasures_OrNot() 
	{
		if(cmp.Save_Button().isEnabled())
		{
			//Click the Save button
			cmp.Click_SaveButton();

			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Saved Successfully"))
			{
				test.log(LogStatus.FAIL, "Tare Group Saved without Entering Unit Of Measures");

				ut.PassedCaptureScreenshotAsBASE64();
			}
		}
		else 
		{
			test.log(LogStatus.PASS, "Save Button Not enabled without Entering Unit Of Measures");

			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Remove the Weight Input")
	public void Remove_Weight() throws Exception
	{
		tgp.Remove_Weight_Input();
	}

	@Then("Verify whether the TareGroup Saved without Entering Weights or not")
	public void Verify_Whether_TareGroup_Saved_Without_Weight_Value_Input()
	{
		if(cmp.Save_Button().isEnabled())
		{
//			//Click the Save button
//			cmp.Click_SaveButton();
				test.log(LogStatus.FAIL, "Save Button Enabled without Entering Weight in Weight Input Field");

				ut.PassedCaptureScreenshotAsBASE64();
				//cmp.Click_CancelButton();
			
		}
		else 
		{
			test.log(LogStatus.PASS, "Save Button Not enabled without Entering Weight in Weight Input Field");

			ut.PassedCaptureScreenshotAsBASE64();
		}
	}

	@Then("Check whether Tare Group Saved or Not")
	public void Verify_Whether_TareGroup_Saved_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Tare Group Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Tare Group Saved Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tare Group Save Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Enter the Sequence Number2")
	public void Enter_Sequence_Number2() throws Exception 
	{
		tgp.Enter_Sequence_Number_Two();
	}

	@And("I Enter the Weight Name2")
	public void Enter_Weight_Name2() throws Exception
	{
		tgp.Enter_Weight_Name2();
	}

	@Given("I Search and Edit the TareGroup")
	public void Search_And_Edit_TareGroup() throws Exception 
	{
		Thread.sleep(500);
		//Search and Click Edit button
		cmp.SearchAndClickEdit(Utility.getProperty("TareGroupNameWithWeight"));
	}

	@When("Verify the Update TareGroup Header")
	public void Verify_Update_TareGroup_Header() throws Exception 
	{
		Thread.sleep(500);
		//Check whether the Update screen opened or not
		cmp.VerifyCreationScreenPageHeader("Update Tare Group");
	}

	@Then("I Verify TareGroup Update screen Close or not")
	public void Verify_TareGroup_Update_Screen_Closed_OrNOt() throws Exception 
	{
		Thread.sleep(1000);
		//Check whether the New Tare Group Creation form Closed or not
		if(!cmp.NewCreationScreenHeader().isDisplayed())
		{
			test.log(LogStatus.PASS, "Editing Tare Group screen Closed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Editing Tare Group screen not Closed");
		}


	}

//	@When("I Clear the Name")
//	public void Clear_Name() throws Exception 
//	{
//		cmp.EnterName("");
//	}

	@Then("Verify whether the TareGroup is updated without Name or not")
	public void Verify_Whether_TareGroup_Updated_Without_Name() throws Exception 
	{
		if(cmp.Update_ButtonTwo().isEnabled())
		{
			Thread.sleep(3000);

			//Click the Update button
			cmp.Click_Update_ButtonTwo();
			//Check whether the New Tare Group Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Tare Group Updated Successfully without entering Name");

				Thread.sleep(1000);

			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Please Enter name field."))
			{
				test.log(LogStatus.PASS, "Please Enter the name Field displayed while Updating without Name");
			}
			else
			{
				test.log(LogStatus.PASS, "Update Button Not enable without Entering Name");
			}
		}
	}

	@Then("Verify whether the TareGroup is updated without Sequence Number in Weights or not")
	public void Verify_Whether_AbletoUpdate_TareGroup_Without_Sequence_Number() throws Exception 
	{
		if(cmp.Update_ButtonTwo().isEnabled())
		{
			Thread.sleep(3000);

			//Click the Update button
			cmp.Click_Update_ButtonTwo();
			//Check whether the New Tare Group Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Tare Group Updated Successfully without entering Sequence number");

				Thread.sleep(1000);

			}
		}
		else 
		{
			test.log(LogStatus.PASS,"Update Button not enabled without entering sequence number");
		}
	}

	@Then("Verify whether the TareGroup is updated without Name in Weights or not")
	public void Verify_AbleToUpdate_TareGroup_Without_WeightName() throws Exception
	{
		if(cmp.Update_ButtonTwo().isEnabled())
		{
			Thread.sleep(3000);

			//Click the Update button
			cmp.Click_Update_ButtonTwo();
			//Check whether the New Tare Group Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Tare Group Updated Successfully without entering Weight Name");

				Thread.sleep(1000);

			}
		}
		else 
		{
			test.log(LogStatus.PASS,"Update Button not enabled without entering Weight Name");
		}
	}

	@Then("Verify whether the TareGroup is updated without Price in Weights or not")
	public void Verify_TareGroup_Updated_Without_Price_InWeight() throws Exception 
	{
		if(cmp.Update_ButtonTwo().isEnabled())
		{
			Thread.sleep(3000);

			//Click the Update button
			cmp.Click_Update_ButtonTwo();
			//Check whether the New Tare Group Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Updated Successfully"))
			{
				test.log(LogStatus.FAIL, "Tare Group Updated Successfully without entering Weight In Weight Filed");

				Thread.sleep(1000);

			}
		}
		else 
		{
			test.log(LogStatus.PASS,"Update Button not enabled without entering Weight in Weight Column");
		}
	}

	@And("I Clear the Price in Weights")
	public void Clear_Price_InWeights() throws Exception 
	{
		tgp.Clear_Weights();
	}


	@And("I Click the Weight Delete button")
	public void Click_Weight_Delete_Button() throws Exception 
	{
		for(int i=1;i<=4;i++) 
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		tgp.Delete_Weight();
	}

	@And("I Click the Delete button in Pop Up")
	public void Click_Delete_Button_in_Popup() throws Exception 
	{
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
		Thread.sleep(500);
		cmp.Click_DeleteButton();
	}

	@Then("Verify the TareGroup Updated or not")
	public void Verify_TareGroup_Updated_OrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Updated Successfully"))
		{
			test.log(LogStatus.PASS, "Tare Group Updated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tare Group Updated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@Given("I Search the TareGroup and Click the Delete button")
	public void Search_TarGroup_And_Click_Delete_Button() throws Exception 
	{
		//Search and Click Delete button
		cmp.SearchAndClickDelete(Utility.getProperty("TareGroupNameWithWeight"));
	}

	@Then("Verify the Cancelled TareGoup Inactivated or not")
	public void Verify_Cancelled_TareGroup_InActivated_OrNot() throws Exception 
	{
		Thread.sleep(3000);
		try
		{
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Inactivated Successfully"))
			{
				test.log(LogStatus.FAIL, "Tare Group Deleted when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Tare Group not Deleted when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}

	}

	@Then("I Verifying the TareGroup Deleted or not")
	public void i_Verifying_the_TareGroup_Deleted_or_not() throws Exception 
	{
		Thread.sleep(3000);
		//Check whether the New Tare Group Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Inactivated Successfully"))
		{
			test.log(LogStatus.PASS, "Tare Group Inactivated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tare Group Inactivated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Click the Inactive button to navigate Inactivated screen to Verify Inactivated TareGroup")
	public void iClickTheInactiveButtonToNavigateInactivatedScreenToVerifyInactivatedTareGroup() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);

		//Enable the Inactive Status
		cmp.Click_ActivetoInactiveButton();

		//Check whether the Inactive screen opened or not
		cmp.VerifyActive_InactiveStatus("Inactive");

		Thread.sleep(3000);
		cmp.Verify_Search(Utility.getProperty("TareGroupNameWithWeight"));
	}

	@Given("I Search the TareGroup and Click the Active button")
	public void Search_TareGroup_And_Click_ActivateButton() throws Exception 
	{
		//Search and Activate the In activated item
		cmp.SearchAndClickActivate(Utility.getProperty("TareGroupNameWithWeight"));

		Thread.sleep(1500);

		cmp.Alert_PopupMsg("Are you sure you want to activate this item?");
	}

	@Then("Verify the Cancelled TareGroup is Activated or not")
	public void Verify_Cancelled_Taregroup_Activated_OrNot()
	{
		try
		{
			Thread.sleep(3000);
			//Check whether the New Modifier Saved or not
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Activated Successfully"))
			{
				test.log(LogStatus.FAIL, "Tare Group Activated when clicking Cancel button");

				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception g)
		{
			test.log(LogStatus.PASS, "Tare Group not Activated when Clicking Cancel button");

			ut.PassedCaptureScreenshotAsBASE64();
		}

	}

	@Then("I Verifying the TareGroup Activated or not")
	public void Verify_TareGroup_Activated_OrNot()
	{
		//Check whether the New Tare Group Activated or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Activated Successfully"))
		{
			test.log(LogStatus.PASS, "Tare Group activated Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Tare Group activated Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@And("I Click the Active button to navigate Activated screen to Verify Activated TareGroup")
	public void i_Click_the_Active_button() throws Throwable {
		//cmp=new Common_XPaths();
		//dpg=new DepartmentPage(driver, test);

		Thread.sleep(500);
		//Enable Active Status
		cmp.Click_InactivetoActiveButton();

		Thread.sleep(500);
		//Check whether verify whether the Active page opened or not
		cmp.VerifyActive_InactiveStatus("Active");

		//Verify whether the Department activated or not
		cmp.Verify_Search(Utility.getProperty("TareGroupNameWithWeight"));

	}

	@Then("Verify whether the Duplicate TareGroup is Saved or not")
	public void Verify_Duplicate_TareGroup_Saved_OrNot() throws Exception 
	{
		Thread.sleep(3000);

		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Name already Exist pop up displayed");

			ut.PassedCaptureScreenshotAsBASE64();
			//cmp.Click_CancelButton();
			Thread.sleep(3000);
		}
		else
		{
			test.log(LogStatus.FAIL, "Name Already Exist pop up not Displayed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}


	@When("I Enter the New TareGroup Name with Special Characters")
	public void iEnterTheNewTareGroupNameWithSpecialCharacters() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		cmp.EnterName("*&%$$#$$$$$$$$$$");

	}

	@Then("Verify whether the TareGroup with Special Characters is Saved or not")
	public void verifyWhetherTheTareGroupWithSpecialCharactersIsSavedOrNot() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		Thread.sleep(3000);
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Saved Successfully"))
		{
			test.log(LogStatus.PASS, "TareGoup Saved with Special Characters");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "TaeGroup Name already exist pop up displayed when Entering Special Characters");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Special Characters");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Course not Saved with Special Characters");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	@When("I Enter the New TareGroup Name with Space")
	public void iEnterTheNewDepartmentNameWithSpace() throws Exception 
	{
		// Write code here that turns the phrase above into concrete actions
		cmp.EnterName(Utility.getProperty("TareGroupNameWithWeight")+Keys.SPACE);
	}

	// Click the Update button - Already Present

	@Then("Verify whether the TareGroup Name with Space in end is Updated or not")
	public void verifyWhetherTheDepartmentNameWithSpaceInEndIsSavedOrNot() 
	{
		// Write code here that turns the phrase above into concrete actions
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Tare Group Updated Successfully"))
		{
			test.log(LogStatus.PASS, "TareGroup Updated with Space in the End of TareGroup Name");

			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "TareGroup Name already exist pop up displayed when Entering Space in the End of TareGroup Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.PASS, "Validation Error(s) pop up displayed when Entering Space in the End of TareGroup Name");

			ut.PassedCaptureScreenshotAsBASE64();

			cmp.Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, "Department not Saved with Space in the End of Department Name");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

//	@And("I Click the Update button")
//	public void Click_Update_Button() 
//	{
//		cmp.Click_Update_ButtonTwo();
//	}
	
	@Then("Refresh the page")
	public void Refresh_Page()
	{
		driver.navigate().refresh();
	}
	
	@And("I Click the Cancel button in TareGroup Delete")
	public void Click_Delete_Cancel_Button() 
	{
		driver.findElement(By.xpath("//button[.=' Cancel ']")).click();
	}

}



