package com.Pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import StepDefinition.LoginTest;
import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_KDS_ConfigurationPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	 
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	CategoriesPage ctp=new CategoriesPage();
	DepartmentPage dp=new DepartmentPage();
	CoursingPage cp=new CoursingPage();
	ServingSizeLevelsPage ssl=new ServingSizeLevelsPage();
	KitchenPrinterPage kp=new KitchenPrinterPage();
	ProductItems_Menu_RetailPage pmt=new ProductItems_Menu_RetailPage();
	UpchargesPage up=new UpchargesPage();
	SubCategoriesPage scp=new SubCategoriesPage();
	
	
	
	public void openTheSettingsKdsConfigurationPageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		//Load the Settings KDS Configuration page
		try {
			
			driver.navigate().refresh();
			cmp.waitForPageToLoad();
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"kds");
		Thread.sleep(5000);
		
		}
		//ClickLaborBtn.click();}
		catch(Exception K) {}
		Thread.sleep(5000);
		cmp.waitForPageToLoad();

}


	//*************************************Field Options*************************************************************//
	
	@FindBy(xpath="//button[.=' UPDATE '][@disabled='true']")
	public WebElement Update_Button_disabled_KDS;
	
	@FindBy(xpath="//button[.=' UPDATE ']")
	public WebElement Update_Button_Enabled_KDS;
	
	public WebElement Update_Button_disabled_KDS() {
	return Update_Button_disabled_KDS;
	}
	
	public WebElement Update_Button_Enabled_KDS() {
		return Update_Button_Enabled_KDS;
		}
	
	public void Verify_Update_Button_Diabled_KDS() throws Exception
	{

		 if(Update_Button_disabled_KDS().isDisplayed())
		    {
			 
			 
		    	test.log(LogStatus.PASS, "KDS Update button is Disabled");
		    	
		    	ut.PassedCaptureScreenshotAsBASE64();
		    }
		    else
		    {
		    	test.log(LogStatus.FAIL, "KDS Update button is Enabled");
		    	
		    	ut.FailedCaptureScreenshotAsBASE64();
		    	
		    	Assert.assertEquals(true, Update_Button_disabled_KDS().isDisplayed());}
		    }

	public void Verify_Update_Button_Enabled_KDS() throws Exception
	{

		 if(Update_Button_Enabled_KDS().isDisplayed())
		    {
			 
			 
		    	test.log(LogStatus.PASS, "KDS Update button is Enabled");
		    	
		    	ut.PassedCaptureScreenshotAsBASE64();
		    }
		    else
		    {
		    	test.log(LogStatus.FAIL, "KDS Update button is Disabled");
		    	
		    	ut.FailedCaptureScreenshotAsBASE64();
		    	
		    	Assert.assertEquals(true, Update_Button_Enabled_KDS().isDisplayed());}
		    }

public void Click_Update_Button_KDS()
	{
		Update_Button_Enabled_KDS().click();
	}


@FindBy(xpath = "//mat-panel-title[contains(.,'Field options')]")
public WebElement FieldOptions;

public WebElement FieldOptions() {
	return FieldOptions;
}

public void Click_FieldOptions_KDS()
{
	FieldOptions().click();
}

public void CheckHeader_FieldOptions_KDS()
{
	if (FieldOptions().getText().equalsIgnoreCase("Field options")) {
		System.out.println("Field Options Header displayed");
		ut.PassedCaptureScreenshotAsBASE64();
	};
}



@FindBy(xpath = "//mat-panel-title[contains(.,'Style options')]")
public WebElement StyleOptions;

public WebElement StyleOptions() {
	return StyleOptions;
}

public void Click_StyleOptions_KDS()
{
	StyleOptions().click();
}

public void CheckHeader_StyleOptions_KDS()
{
	if (StyleOptions().getText().equalsIgnoreCase("Style options")) {
		System.out.println("Style Options Header displayed");
		ut.PassedCaptureScreenshotAsBASE64();
	};
}


@FindBy(xpath = "//mat-panel-title[contains(.,'SMS order notifications')]")
public WebElement SMS_Order_Notifications;


public WebElement SMS_Order_Notifications() {
	return SMS_Order_Notifications;
}

public void Click_SMS_Order_Notifications_KDS()
{
	SMS_Order_Notifications().click();
}

public void CheckHeader_SMS_Order_Notifications_KDS()
{
	if (SMS_Order_Notifications().getText().equalsIgnoreCase("Style options")) {
		System.out.println("Style Options Header displayed");
		ut.PassedCaptureScreenshotAsBASE64();
	};
}


@FindBy(xpath = "//label/span/span[.='Table Name']")
public WebElement Table_Name_Option;

@FindBy(xpath = "//span[.='Table Name']/../../../../mat-checkbox")
public WebElement Unchecked_Table_Name;

@FindBy(xpath = "//span[.='Table Name']/../../../../mat-checkbox[contains(@class,'mat-checkbox-checked')]")
public WebElement checked_Table_Name;

public WebElement Table_Name_Option() {
	return Table_Name_Option;
}

public void Check_Table_Name_Option_KDS()
{
	if (Table_Name_Option().getText().equalsIgnoreCase("Table Name")) {
		System.out.println("Table Name Field Option displayed");
	};
}

public void IselectTableName_CheckBox() {
	
try
	{
		if(checked_Table_Name.isDisplayed())
		{
			test.log(LogStatus.PASS, "Table name Check Box is Selected");
			ut.PassedCaptureScreenshotAsBASE64();

			}
	}
	catch(Exception d)
	{
		Unchecked_Table_Name.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}}

public void IUnselectTableName_CheckBox() {
	
try
	{
		if(checked_Table_Name.isDisplayed())
		{
			test.log(LogStatus.PASS, "Table name Check Box is Un-Selected");
			checked_Table_Name.click();
			ut.PassedCaptureScreenshotAsBASE64();
				}
	}
	catch(Exception d)
	{
		checked_Table_Name.click();
		ut.PassedCaptureScreenshotAsBASE64();
	}}

@FindBy(xpath = "//label/span/span[.='Service Type']")
public WebElement Service_Type_Option;

public WebElement Service_Type_Option() {
	return Service_Type_Option;
}

@FindBy(xpath = "//span[.='Service Type']/../../../../mat-checkbox[contains(@class,'mat-checkbox-checked')]")
public WebElement checked_Service_Type;

@FindBy(xpath = "//span[.='Service Type']/../../../../mat-checkbox")
public WebElement Unchecked_Service_Type;


public void Check_Service_Type_Option_KDS()
{
	if (Service_Type_Option().getText().equalsIgnoreCase("Service Type")) {
		System.out.println("Service Type Field Option displayed");
	};
}

public void IselectService_Type_CheckBox() {
	
try
		{
			if(checked_Service_Type.isDisplayed())
			{
				test.log(LogStatus.PASS, "Service Type Check Box is Selected");
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			Unchecked_Service_Type.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}


public void IUnselectService_Type_CheckBox() {
	
try
{
			if(checked_Service_Type.isDisplayed())
			{
				test.log(LogStatus.PASS, "Service Type Check Box is Selected");
				checked_Service_Type.click();
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			checked_Service_Type.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}

@FindBy(xpath = "//label/span/span[.='Check Number']")
public WebElement Check_Number_Option;

@FindBy(xpath = "//span[.='Check Number']/../../../../mat-checkbox[contains(@class,'mat-checkbox-checked')]")
public WebElement checked_Check_Number;

@FindBy(xpath = "//span[.='Check Number']/../../../../mat-checkbox")
public WebElement Unchecked_Check_Number;

public void IselectCheckNumber_CheckBox() {
	
try
{
			if(checked_Check_Number.isDisplayed())
			{
				test.log(LogStatus.PASS, "Check Number Check Box is Selected");
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			Unchecked_Check_Number.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}

public void IUnselectCheckNumber_CheckBox() {

try
{
	if(checked_Check_Number.isDisplayed())
			{
				test.log(LogStatus.PASS, "Check Number Check Box is Un-Selected");
				checked_Check_Number.click();
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			checked_Check_Number.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}

@FindBy(xpath = "//span[.='Seat Number']/../../../../mat-checkbox[contains(@class,'mat-checkbox-checked')]")
public WebElement checked_Seat_Number;

@FindBy(xpath = "//span[.='Seat Number']/../../../../mat-checkbox")
public WebElement Unchecked_Seat_Number;

public void Iselect_SeatNumber_CheckBox() {
	
try
		{
			if(checked_Seat_Number.isDisplayed())
			{
				test.log(LogStatus.PASS, "Seat Number Check Box is Selected");
				ut.PassedCaptureScreenshotAsBASE64();

			} 		}
		catch(Exception d)
		{
			Unchecked_Seat_Number.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}


public void IUnselect_SeatNumber_CheckBox() {
	
try
		{
			if(checked_Seat_Number.isDisplayed())
			{
				test.log(LogStatus.PASS, "Seat Number Check Box is Un-Selected");
				checked_Seat_Number.click();
				ut.PassedCaptureScreenshotAsBASE64();

			}
		}
		catch(Exception d)
		{
			checked_Seat_Number.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}

@FindBy(xpath = "//span[.='Time']/../../../../mat-checkbox[contains(@class,'mat-checkbox-checked')]")
public WebElement checked_Time;

@FindBy(xpath = "//span[.='Time']/../../../../mat-checkbox")
public WebElement Unchecked_Time;

public void Iselect_Time_CheckBox() {
	
try
		{
			if(checked_Time.isDisplayed())
			{
				test.log(LogStatus.PASS, "Time Check Box is Selected");
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			Unchecked_Time.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}



public void IUnselect_Time_CheckBox() {
	
try
		{
			if(checked_Time.isDisplayed())
			{
				test.log(LogStatus.PASS, "Time Check Box is Un-Selected");
				checked_Time.click();
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			checked_Time.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}

@FindBy(xpath = "//span[.='Notes']/../../../../mat-checkbox[contains(@class,'mat-checkbox-checked')]")
public WebElement checked_Notes;

@FindBy(xpath = "//span[.='Notes']/../../../../mat-checkbox")
public WebElement Unchecked_Notes;

public void Iselect_Notes_CheckBox() {
	
try
		{
			if(checked_Notes.isDisplayed())
			{
				test.log(LogStatus.PASS, "NOtes Check Box is Selected");
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			Unchecked_Notes.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}


public void IUnselect_Notes_CheckBox() {
	
try
		{
			if(checked_Notes.isDisplayed())
			{
				test.log(LogStatus.PASS, "Notes Check Box is Un-Selected");
				checked_Notes.click();
				ut.PassedCaptureScreenshotAsBASE64();

			}
		}
		catch(Exception d)
		{
			checked_Notes.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}

@FindBy(xpath = "//span[.='Server Name']/../../../../mat-checkbox[contains(@class,'mat-checkbox-checked')]")
public WebElement checked_Server_Name;

@FindBy(xpath = "//span[.='Server Name']/../../../../mat-checkbox")
public WebElement Unchecked_Server_Name;

public void Iselect_ServerName_CheckBox() {
	
try
		{
			if(checked_Server_Name.isDisplayed())
			{
				test.log(LogStatus.PASS, "Server Name Check Box is Selected");
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			Unchecked_Server_Name.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}


public void IUnselect_ServerName_CheckBox() {
	
try
		{
			if(checked_Server_Name.isDisplayed())
			{
				test.log(LogStatus.PASS, "Server Name Check Box is Un-Selected");
				checked_Server_Name.click();
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			checked_Server_Name.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}

@FindBy(xpath = "//span[.='KDS Done Button']/../../../../mat-checkbox[contains(@class,'mat-checkbox-checked')]")
public WebElement checked_KDS_Done_Btn;

@FindBy(xpath = "//span[.='KDS Done Button']/../../../../mat-checkbox")
public WebElement Unchecked_KDS_Done_Btn;

public void Iselect_KDSDOneBtn_CheckBox() {
	try
		{
			if(checked_KDS_Done_Btn.isDisplayed())
			{
				test.log(LogStatus.PASS, "KDS Done Btn Check Box is Selected");
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			Unchecked_KDS_Done_Btn.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}

public void IUnselect_KDSDOneBtn_CheckBox() {
	try
		{
			if(Unchecked_KDS_Done_Btn.isDisplayed())
			{
				test.log(LogStatus.PASS, "KDS Done btn Check Box is Un-Selected");
				checked_KDS_Done_Btn.click();
				ut.PassedCaptureScreenshotAsBASE64();

			} 
		}
		catch(Exception d)
		{
			checked_KDS_Done_Btn.click();
			ut.PassedCaptureScreenshotAsBASE64();
		}}


public WebElement Check_Number_Option() {
	return Check_Number_Option;
}

public void Check_Check_Number_Option_KDS()
{
	if (Check_Number_Option().getText().equalsIgnoreCase("Check Number")) {
		System.out.println("Check Number Field Option displayed");
	};
}


@FindBy(xpath = "//label/span/span[.='Seat Number']")
public WebElement Seat_Number_Option;

public WebElement Seat_Number_Option() {
	return Seat_Number_Option;
}

public void Check_Seat_Number_Option_KDS()
{
	if (Seat_Number_Option().getText().equalsIgnoreCase("Seat Number")) {
		System.out.println("Seat Number Field Option displayed");
	};
}


@FindBy(xpath = "//label/span/span[.='Time']")
public WebElement Time_Option;

public WebElement Time_Option() {
	return Time_Option;
}

public void Check_Time_Option_KDS()
{
	if (Time_Option().getText().equalsIgnoreCase("Time")) {
		System.out.println("Time Field Option displayed");
	};
}


@FindBy(xpath = "//label/span/span[.='Notes']")
public WebElement Notes_Option;

public WebElement Notes_Option() {
	return Notes_Option;
}


public void Check_Notes_Option_KDS()
{
	if (Notes_Option().getText().equalsIgnoreCase("Notes")) {
		System.out.println("Notes Field Option displayed");
	};
}


@FindBy(xpath = "//label/span/span[.='Server Name']")
public WebElement Server_Name_Option;


public WebElement Server_Name_Option() {
	return Server_Name_Option;
}

public void Check_Server_Name_Option_KDS()
{
	if (Server_Name_Option().getText().equalsIgnoreCase("Server Name")) {
		System.out.println("Server Name Field Option displayed");
	};
}

@FindBy(xpath = "//label/span/span[.='KDS Done Button']")
public WebElement KDS_Done_Btn_Option;

public WebElement KDS_Done_Btn_Option() {
	return KDS_Done_Btn_Option;
}

public void Check_KDS_Done_Btn_Option_KDS()
{
	if (KDS_Done_Btn_Option().getText().equalsIgnoreCase("KDS Done Button")) {
		System.out.println("KDS Done Button Field Option displayed");
	};
}


@FindBy(xpath = "//h6[contains(.,'KDS Ticket Preview')]")
public WebElement KDS_Ticket_Preview;

public WebElement KDS_Ticket_Preview() {
	return KDS_Ticket_Preview;
}

public void Check_KDS_Ticket_Preview_KDS()
{
	if (KDS_Ticket_Preview().getText().equalsIgnoreCase("KDS Ticket Preview")) {
		System.out.println("KDS Ticket Preview displayed");
		ut.PassedCaptureScreenshotAsBASE64();
	};
}

@FindBy(xpath = "//div[@class='table table-border']")
public WebElement KDS_Table;


@FindBy(xpath = "//img[contains(@class,'coffee')]/../../div/div[@class='row'][1]/div[2]/span")
public WebElement tble_TableName;

public WebElement tble_TableName() {
	return tble_TableName;
}

public void Verify_TableName_KDS_Ticket_Preview() {
try {
	if(tble_TableName.isDisplayed())
	{
		test.log(LogStatus.PASS, "The table name is displayed in Table Template when user Select the Table name option in the Field Options");
	}
}
catch(Exception df)
{
	test.log(LogStatus.FAIL, "The table name is not displayed in Table Template when user Select the Table name option in the Field Options");
}}

public void Verify_NotTableName_KDS_Ticket_Preview() {
try {
	if(!tble_TableName.isDisplayed())
	{
		test.log(LogStatus.PASS, "The table name is not displayed in Table Template when user Select the Table name option in the Field Options");
	}
}
catch(Exception df)
{
	test.log(LogStatus.FAIL, "The table name is displayed in Table Template when user Select the Table name option in the Field Options");
}}

@FindBy(xpath = "//img[contains(@class,'coffee')]/../../div/div[@class='row'][1]/div[1]/span")
public WebElement tble_CheckNumber;

public WebElement tble_CheckNumber() {
	return tble_CheckNumber;
}

public void Verify_tble_CheckNumber_KDS_Ticket_Preview()
{
	try {
		if(tble_CheckNumber.isDisplayed())
		{
			test.log(LogStatus.PASS, "The Check Number is displayed in Table Template when user Select the Table name option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The Check Number is not displayed in Table Template when user Select the Table name option in the Field Options");
	}}

public void Verify_tble_NotCheckNumber_KDS_Ticket_Preview()
{
	try {
		if(!tble_CheckNumber.isDisplayed())
		{
			test.log(LogStatus.PASS, "The Check Number is not displayed in Table Template when user Select the Table name option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The Check Number is displayed in Table Template when user Select the Table name option in the Field Options");
	}}

@FindBy(xpath = "//img[contains(@class,'coffee')]/../../div/div[@class='row'][1]/div[3]/span")
public WebElement tble_Time;

public WebElement tble_Time() {
	return tble_Time;
}

public void Verify_tble_Time_KDS_Ticket_Preview()
{
	try {
		if(tble_Time.isDisplayed())
		{
			test.log(LogStatus.PASS, "The Time is displayed in Table Template when user Select the Table name option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The Time is not displayed in Table Template when user Select the Table name option in the Field Options");
	}}

public void Verify_tble_NotTime_KDS_Ticket_Preview()
{
	try {
		if(!tble_Time.isDisplayed())
		{
			test.log(LogStatus.PASS, "The Time is not displayed in Table Template when user Select the Table name option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The Time is displayed in Table Template when user Select the Table name option in the Field Options");
	}}

@FindBy(xpath = "//img[contains(@class,'coffee')]/../../div/div[@class='row'][2]/div[3]/span")
public WebElement tble_ServerName;

public WebElement tble_ServerName() {
	return tble_ServerName;
}

public void Verify_tble_ServerName_KDS_Ticket_Preview()
{
	try {
		if(tble_ServerName.isDisplayed())
		{
			test.log(LogStatus.PASS, "The Server Name is displayed in Table Template when user Select the Table name option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The Server Name is not displayed in Table Template when user Select the Table name option in the Field Options");
	}}

public void Verify_tble_NotServerName_KDS_Ticket_Preview()
{
	try {
		if(!tble_ServerName.isDisplayed())
		{
			test.log(LogStatus.PASS, "The Server Name is not displayed in Table Template when user Select the Table name option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The Server Name is displayed in Table Template when user Select the Table name option in the Field Options");
	}}

@FindBy(xpath = "//img[contains(@class,'coffee')]/../../div/div[@class='row'][2]/div[1]/span")
public WebElement tble_ServeiceType;

public WebElement tble_ServeiceType() {
	return tble_ServeiceType;
}

public void Verify_tble_ServiceType_KDS_Ticket_Preview() {
try {
	if(tble_ServeiceType.isDisplayed())
	{
		test.log(LogStatus.PASS, "The Service Type is displayed in Table Template when user Select the Service Type option in the Field Options");
	}
}
catch(Exception df)
{
	test.log(LogStatus.FAIL, "The Service Type is not displayed in Table Template when user Select the Service Type option in the Field Options");
}}

public void Verify_tble_NotServiceType_KDS_Ticket_Preview() {
try {
	if(!tble_ServeiceType.isDisplayed())
	{
		test.log(LogStatus.PASS, "The Service Type is not displayed in Table Template when user Select the Service Type option in the Field Options");
	}
}
catch(Exception df)
{
	test.log(LogStatus.FAIL, "The Service Type is displayed in Table Template when user Select the Service Type option in the Field Options");
}}


@FindBy(xpath = "//span[contains(.,'Seat') and @class='ng-star-inserted']")
public WebElement tble_SeatNumber;

public WebElement tble_SeatNumber() {
	return tble_SeatNumber;
}

public void Verify_tble_SeatNumber_KDS_Ticket_Preview()
{try {
	if(tble_SeatNumber.isDisplayed())
	{
		test.log(LogStatus.PASS, "The Seat Number is displayed in Table Template when user Select the Seat Number option in the Field Options");
	}
}
catch(Exception df)
{
	test.log(LogStatus.FAIL, "The Seat Number is not displayed in Table Template when user Select the Seat Number option in the Field Options");
}}

public void Verify_tble_NotSeatNumber_KDS_Ticket_Preview()
{try {
	if(!tble_SeatNumber.isDisplayed())
	{
		test.log(LogStatus.PASS, "The Seat Number is not displayed in Table Template when user Select the Seat Number option in the Field Options");
	}
}
catch(Exception df)
{
	test.log(LogStatus.FAIL, "The Seat Number is displayed in Table Template when user Select the Seat Number option in the Field Options");
}}

@FindBy(xpath = "//span[contains(.,'Add salt and pepper') and @class='ng-star-inserted']")
public WebElement tble_Notes;

public WebElement tble_Notes() {
	return tble_Notes;
}

public void Verify_tble_Notes_KDS_Ticket_Preview()
{
	try {
		if(tble_Notes.isDisplayed())
		{
			test.log(LogStatus.PASS, "The Notes is displayed in Table Template when user Select the Notes option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The Notes is not displayed in Table Template when user Select the Notes option in the Field Options");
	}
}

public void Verify_tble_NotNotes_KDS_Ticket_Preview()
{
	try {
		if(!tble_Notes.isDisplayed())
		{
			test.log(LogStatus.PASS, "The Notes is not displayed in Table Template when user Select the Notes option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The Notes is displayed in Table Template when user Select the Notes option in the Field Options");
	}
}

@FindBy(xpath = "//img[contains(@class,'coffee')]/../../div/div[@class='row'][2]/div[2]/span")
public WebElement tble_KDSDoneBtn;

public WebElement tble_KDSDoneBtn() {
	return tble_KDSDoneBtn;
}

public void Verify_tble_KDSDoneBtn_KDS_Ticket_Preview()
{
	try {
		if(tble_KDSDoneBtn.isDisplayed())
		{
			test.log(LogStatus.PASS, "The KDS Done Button is displayed in Table Template when user Select the KDS Done Button option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The KDS Done Button is not displayed in Table Template when user Select the KDS Done Button option in the Field Options");
	}
}

public void Verify_tble_NotKDSDoneBtn_KDS_Ticket_Preview()
{
	try {
		if(!tble_KDSDoneBtn.isDisplayed())
		{
			test.log(LogStatus.PASS, "The KDS Done Button is not displayed in Table Template when user Select the KDS Done Button option in the Field Options");
		}
	}
	catch(Exception df)
	{
		test.log(LogStatus.FAIL, "The KDS Done Button is displayed in Table Template when user Select the KDS Done Button option in the Field Options");
	}
}

public void iVerifyKDSConfigurationSettingsSavedSuccessfully() throws InterruptedException {
	
	if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("KDS Configuration Saved Successfully")) {
		
		System.out.println("KDS Configuration Saved Successfully");
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(3000);
		
	}
}

@FindBy(xpath = "//h6[contains(.,'Horizontal View for Modifier')]")
public WebElement HorizontalViewforModifier_Text;

@FindBy(xpath = "//h6[contains(.,'Horizontal View for Modifier')]/../../div//div/mat-button-toggle-group/mat-button-toggle/button/span[.='No']")
public WebElement HorizontalViewforModifier_Toggle_No_Btn;

@FindBy(xpath = "//h6[contains(.,'Horizontal View for Modifier')]/../../div//div/mat-button-toggle-group/mat-button-toggle/button/span[.='Yes']")
public WebElement HorizontalViewforModifier_Toggle_Yes_Btn;


public WebElement HorizontalViewforModifier_Text() {
	return HorizontalViewforModifier_Text;
}


public WebElement HorizontalViewforModifier_Toggle_No_Btn() {
	return HorizontalViewforModifier_Toggle_No_Btn;
}


public WebElement HorizontalViewforModifier_Toggle_Yes_Btn() {
	return HorizontalViewforModifier_Toggle_Yes_Btn;
}

public void Check_HorizontalViewforModifier_Text_KDS()
{
	if (HorizontalViewforModifier_Text().getText().equalsIgnoreCase("Horizontal View for Modifier")) {
		System.out.println("Horizontal View for Modifier Field Option displayed");
	};
}


public void IClickHorizontalViewforModifier_Toggle_Yes_Btn() throws InterruptedException {
	
	if(HorizontalViewforModifier_Toggle_Yes_Btn().isEnabled())
	{
		
		HorizontalViewforModifier_Toggle_No_Btn().click();
		Thread.sleep(1000);
		HorizontalViewforModifier_Toggle_Yes_Btn().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		HorizontalViewforModifier_Toggle_Yes_Btn().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}
public void IClickHorizontalViewforModifier_Toggle_No_Btn() throws InterruptedException {
	
	if(HorizontalViewforModifier_Toggle_No_Btn().isEnabled())
	{
		Thread.sleep(1000);
		HorizontalViewforModifier_Toggle_Yes_Btn().click();
		Thread.sleep(1000);
		HorizontalViewforModifier_Toggle_No_Btn().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		HorizontalViewforModifier_Toggle_No_Btn().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void CheckHorizontalViewforModifier_Toggle_Disabled(String Msg) throws Exception
{
	Thread.sleep(1000);
    if(HorizontalViewforModifier_Toggle_No_Btn().isEnabled())
    {
    	test.log(LogStatus.PASS, Msg+" Toggle is Disabled");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(true, HorizontalViewforModifier_Toggle_No_Btn().isEnabled());
    }
    else
    {
    	test.log(LogStatus.FAIL, Msg+" Toggle is Enabled");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(false, HorizontalViewforModifier_Toggle_No_Btn().isEnabled());
    }
}


public void CheckHorizontalViewforModifier_Toggle_Enabled(String Msg) throws Exception
{
	Thread.sleep(1000);
    if(HorizontalViewforModifier_Toggle_Yes_Btn().isEnabled())
    {
    	test.log(LogStatus.PASS, Msg+" Toggle is Enabled");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(true, HorizontalViewforModifier_Toggle_Yes_Btn().isEnabled());
    }
    else
    {
    	test.log(LogStatus.FAIL, Msg+" Toggle is Disabled");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(false, HorizontalViewforModifier_Toggle_Yes_Btn().isEnabled());
    }
}



@FindBy(xpath = "//h6[contains(.,'Disable KDS Broadcast')]")
public WebElement Disable_KDS_Broadcast_Text;

@FindBy(xpath = "//h6[contains(.,'Disable KDS Broadcast')]/../../div//div/mat-button-toggle-group/mat-button-toggle/button/span[.='No']")
public WebElement Disable_KDS_Broadcast_Toggle_No_Btn;

@FindBy(xpath = "//h6[contains(.,'Disable KDS Broadcast')]/../../div//div/mat-button-toggle-group/mat-button-toggle/button/span[.='Yes']")
public WebElement Disable_KDS_Broadcast_Toggle_Yes_Btn;


public WebElement Disable_KDS_Broadcast_Text() {
	return Disable_KDS_Broadcast_Text;
}

public WebElement Disable_KDS_Broadcast_Toggle_No_Btn() {
	return Disable_KDS_Broadcast_Toggle_No_Btn;
}


public WebElement Disable_KDS_Broadcast_Toggle_Yes_Btn() {
	return Disable_KDS_Broadcast_Toggle_Yes_Btn;
}

public void Check_Disable_KDS_Broadcast_Text_KDS()
{
	if (Disable_KDS_Broadcast_Text().getText().equalsIgnoreCase("Disable KDS Broadcast")) {
		System.out.println("Disable KDS Broadcast Field Option displayed");
	};
}

public void IClickDisable_KDS_Broadcast_Toggle_Yes_Btn() throws InterruptedException {
	
	if(Disable_KDS_Broadcast_Toggle_Yes_Btn().isEnabled())
	{
		
		Disable_KDS_Broadcast_Toggle_No_Btn().click();
		Thread.sleep(1000);
		Disable_KDS_Broadcast_Toggle_Yes_Btn().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Disable_KDS_Broadcast_Toggle_Yes_Btn().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickDisable_KDS_Broadcast_Toggle_No_Btn() throws InterruptedException {
	
	if(Disable_KDS_Broadcast_Toggle_No_Btn().isEnabled())
	{
		Thread.sleep(1000);
		Disable_KDS_Broadcast_Toggle_Yes_Btn().click();
		Thread.sleep(1000);
		Disable_KDS_Broadcast_Toggle_No_Btn().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Disable_KDS_Broadcast_Toggle_No_Btn().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void CheckDisableKDSBroadcast_Toggle_Disabled(String Msg) throws Exception
{
	Thread.sleep(1000);
    if(Disable_KDS_Broadcast_Toggle_No_Btn().isEnabled())
    {
    	test.log(LogStatus.PASS, Msg+" Toggle is Disabled");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(true, Disable_KDS_Broadcast_Toggle_No_Btn().isEnabled());
    }
    else
    {
    	test.log(LogStatus.FAIL, Msg+" Toggle is Enabled");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(false, Disable_KDS_Broadcast_Toggle_No_Btn().isEnabled());
    }
}


public void CheckDisableKDSBroadcast_Toggle_Enabled(String Msg) throws Exception
{
	Thread.sleep(1000);
    if(Disable_KDS_Broadcast_Toggle_Yes_Btn().isEnabled())
    {
    	test.log(LogStatus.PASS, Msg+" Toggle is Enabled");
    	
    	ut.PassedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(true, Disable_KDS_Broadcast_Toggle_Yes_Btn().isEnabled());
    }
    else
    {
    	test.log(LogStatus.FAIL, Msg+" Toggle is Disabled");
    	
    	ut.FailedCaptureScreenshotAsBASE64();
    	
    	Assert.assertEquals(false, Disable_KDS_Broadcast_Toggle_Yes_Btn().isEnabled());
    }
}



//*************************************Style Options*************************************************************//

@FindBy(xpath = "//h6[.='Modifier color']")
public WebElement ModifierColor;

public WebElement ModifierColor() {
	return ModifierColor;
}


public void Check_ModifierColor_KDS()
{
	if (ModifierColor().getText().equalsIgnoreCase("Modifier color")) {
		System.out.println("ModifierColor Style Option displayed");
	};
}

@FindBy(xpath = "//h6[.='Addon Color']")
public WebElement AddonColor;

public WebElement AddonColor() {
	return AddonColor;
}


public void Check_AddonColor_KDS()
{
	if (AddonColor().getText().equalsIgnoreCase("Addon color")) {
		System.out.println("Addon color Style Option displayed");
	};
}

@FindBy(xpath = "//h6[.='Modifier color']/../../../../div[2]/div[1]/div/div[1]/div")
public WebElement Modifier_ColorBox;

public WebElement Modifier_ColorBox() {
	return Modifier_ColorBox;
}


@FindBy(xpath = "//h6[.='Modifier color']/../../../../div[2]/div[2]/div/div[1]/div")
public WebElement Addon_ColorBox;

public WebElement Addon_ColorBox() {
	return Addon_ColorBox;
}

@FindBy(xpath = "//h6[.='Status 1']")
public WebElement Status1;

public WebElement Status1() {
	return Status1;
}


public void Check_Status1_KDS()
{
	if (Status1().getText().equalsIgnoreCase("Status 1")) {
		System.out.println("Status1 Style Option displayed");
	};
}

@FindBy(xpath = "//h6[.='Status 2']")
public WebElement Status2;

public WebElement Status2() {
	return Status2;
}


public void Check_Status2_KDS()
{
	if (Status1().getText().equalsIgnoreCase("Status 2")) {
		System.out.println("Status2 Style Option displayed");
	};
}

@FindBy(xpath = "//h6[.='Status 3']")
public WebElement Status3;

public WebElement Status3() {
	return Status3;
}

public void Check_Status3_KDS()
{
	if (Status1().getText().equalsIgnoreCase("Status 3")) {
		System.out.println("Status3 Style Option displayed");
	};
}

@FindBy(xpath = "//h6[.='Status 1']/../../div[2]/div/div/h6")
public WebElement StatusColor1_Text;

public WebElement StatusColor1_Text() {
	return StatusColor1_Text;
}

public void Check_StatusColor1_Text_KDS()
{
	if (StatusColor1_Text().getText().equalsIgnoreCase("Status Color")) {
		System.out.println("Status1-Status Color Style Option displayed");
	};
}


@FindBy(xpath = "//h6[.='Status 2']/../../div[2]/div/div/h6")
public WebElement StatusColor2_Text;

public WebElement StatusColor2_Text() {
	return StatusColor2_Text;
}

public void Check_StatusColor2_Text_KDS()
{
	if (StatusColor2_Text().getText().equalsIgnoreCase("Status Color")) {
		System.out.println("Status2-Status Color Style Option displayed");
	};
}

@FindBy(xpath = "//h6[.='Status 3']/../../div[2]/div/div/h6")
public WebElement StatusColor3_Text;

public WebElement StatusColor3_Text() {
	return StatusColor3_Text;
}

public void Check_StatusColor3_Text_KDS()
{
	if (StatusColor3_Text().getText().equalsIgnoreCase("Status Color")) {
		System.out.println("Status3-Status Color Style Option displayed");
	};
}

@FindBy(xpath = "//h6[.='Status 1']/../../div[2]/div/div/div[1]/div")
public WebElement Status1Color_Box;

public WebElement Status1Color_Box() {
	return Status1Color_Box;
}

@FindBy(xpath = "//h6[.='Status 2']/../../div[2]/div/div/div[1]/div")
public WebElement Status2Color_Box;

public WebElement Status2Color_Box() {
	return Status2Color_Box;
}

@FindBy(xpath = "//h6[.='Status 3']/../../div[2]/div/div/div[1]/div")
public WebElement Status3Color_Box;

public WebElement Status3Color_Box() {
	return Status3Color_Box;
}

@FindBy(xpath = "//h6[.='Status 1']/../../div[2]/div[2]/app-input/div/div/mat-form-field//label[contains(.,'After Mins')]")
public WebElement Status1AfterMins_Text;

public WebElement Status1AfterMins_Text() {
	return Status1AfterMins_Text;
}

public void Check_Status1AfterMins_Text_KDS()
{
	if (Status1AfterMins_Text().getText().equalsIgnoreCase("After Mins")) {
		System.out.println("Status1AfterMins Style Option displayed");
	};
}


@FindBy(xpath = "//h6[.='Status 1']/../../div[2]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")
public WebElement Status1AfterMins_InputBx;

public WebElement Status1AfterMins_InputBx() {
	return Status1AfterMins_InputBx;
}

@FindBy(xpath = "//h6[.='Status 2']/../../div[2]/div[2]/app-input/div/div/mat-form-field//label[contains(.,'After Mins')]")
public WebElement Status2AfterMins_Text;

public WebElement Status2AfterMins_Text() {
	return Status2AfterMins_Text;
}

public void Check_Status2AfterMins_Text_KDS()
{
	if (Status2AfterMins_Text().getText().equalsIgnoreCase("After Mins")) {
		System.out.println("Status1AfterMins Style Option displayed");
	};
}


@FindBy(xpath = "//h6[.='Status 2']/../../div[2]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")
public WebElement Status2AfterMins_InputBx;

public WebElement Status2AfterMins_InputBx() {
	return Status2AfterMins_InputBx;
}

@FindBy(xpath = "//h6[.='Status 3']/../../div[2]/div[2]/app-input/div/div/mat-form-field//label[contains(.,'After Mins')]")
public WebElement Status3AfterMins_Text;

public WebElement Status3AfterMins_Text() {
	return Status3AfterMins_Text;
}

public void Check_Status3AfterMins_Text_KDS()
{
	if (Status2AfterMins_Text().getText().equalsIgnoreCase("After Mins")) {
		System.out.println("Status1AfterMins Style Option displayed");
	};
}


@FindBy(xpath = "//h6[.='Status 3']/../../div[2]/div[2]/app-input/div/div/mat-form-field/div/div/div[4]/input")
public WebElement Status3AfterMins_InputBx;

public WebElement Status3AfterMins_InputBx() {
	return Status3AfterMins_InputBx;
}

@FindBy(xpath = "//h6[.='Status 1']/../../div[2]/div[2]/app-input//mat-form-field/div/div[1]/div[5]/div/div/div/button[1]")
public WebElement Status1AfterMinsUpArrow;

public WebElement Status1AfterMinsUpArrow() {
	return Status1AfterMinsUpArrow;
}

@FindBy(xpath = "//h6[.='Status 1']/../../div[2]/div[2]/app-input//mat-form-field/div/div[1]/div[5]/div/div/div/button[2]")
public WebElement Status1AfterMinsDownArrow;

public WebElement Status1AfterMinsDownArrow() {
	return Status1AfterMinsDownArrow;
}

@FindBy(xpath = "//h6[.='Status 2']/../../div[2]/div[2]/app-input//mat-form-field/div/div[1]/div[5]/div/div/div/button[1]")
public WebElement Status2AfterMinsUpArrow;

public WebElement Status2AfterMinsUpArrow() {
	return Status2AfterMinsUpArrow;
}

@FindBy(xpath = "//h6[.='Status 2']/../../div[2]/div[2]/app-input//mat-form-field/div/div[1]/div[5]/div/div/div/button[2]")
public WebElement Status2AfterMinsDownArrow;

public WebElement Status2AfterMinsDownArrow() {
	return Status2AfterMinsDownArrow;
}

@FindBy(xpath = "//h6[.='Status 3']/../../div[2]/div[2]/app-input//mat-form-field/div/div[1]/div[5]/div/div/div/button[1]")
public WebElement Status3AfterMinsUpArrow;


public WebElement Status3AfterMinsUpArrow() {
	return Status3AfterMinsUpArrow;
}

@FindBy(xpath = "//h6[.='Status 3']/../../div[2]/div[2]/app-input//mat-form-field/div/div[1]/div[5]/div/div/div/button[2]")
public WebElement Status3AfterMinsDownArrow;

public WebElement Status3AfterMinsDownArrow() {
	return Status3AfterMinsDownArrow;
}


//********Update Modifier Color*******************//

public void IupdateModifierColor() throws InterruptedException {
	cmp.Click_Wait_ForElementClickable(Modifier_ColorBox, 60);
//	Modifier_ColorBox.click();
for(int i = 1; i <= 6; i++) {
	
	List<WebElement> col =driver.findElements(By.xpath("//div[contains(@class,'color-pick cursor-pointer')]"));
	Random r = new Random();
	int randomValue =  r.nextInt(col.size());
	System.out.println("Modifier Color list size is"+randomValue);
	col.get(randomValue).click();
	
	String col1 = col.get(randomValue).getAttribute("style");	
	System.out.println(col1);
	Thread.sleep(2000);
	
	col1 = col1.substring(12);
	System.out.println(col1);
	
	String col2 = driver.findElement(By.xpath("//span[contains(.,'American Cheese Burger')]/../span[3]")).getAttribute("style");
	
	col2 = col2.substring(12);
	System.out.println(col2);
	
	if(col1.contains(col2))
	{
		test.log(LogStatus.PASS, "The modifier text color in KDS Ticket Preview changed successfully, while user change the color in style option");
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "The modifier text color in KDS Ticket Preview not changing, while user change the color in style option");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	String selectedCol = driver.findElement(By.xpath("//mat-icon[contains(@class,'mat-icon-no-color select-check')]//parent::div")).getAttribute("style");
	
	String actualCol = Modifier_ColorBox.getAttribute("style");
	
	if(actualCol.contains(selectedCol))
	{
		test.log(LogStatus.PASS, "The Selected color is displayed in the tile after selecting the color in Modifier");
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "The Selected color is not displayed in the tile after selecting the color in Modifier");
		ut.FailedCaptureScreenshotAsBASE64();
	}
}

}

//****Update Add on Color****///

public void IupdateAddOnColor() throws InterruptedException {

	cmp.Click_Wait_ForElementClickable(Addon_ColorBox, 60);
//	Addon_ColorBox.click();	
Thread.sleep(2000);

//Actions actions = new Actions(driver);
//for (int i = 0; i < 2; i++) {
//    actions.sendKeys(Keys.ARROW_DOWN).perform();
//}

for(int i = 1; i <= 6; i++) {

List<WebElement> col =driver.findElements(By.xpath("//div[contains(@class,'color-pick cursor-pointer')]"));
Random r = new Random();
int randomValue =  r.nextInt(col.size());
System.out.println("Addon Color list size is"+randomValue);
col.get(randomValue).click();

String col1 = col.get(randomValue).getAttribute("style");			
Thread.sleep(2000);
System.out.println(col1);

col1 = col1.substring(12);
System.out.println(col1);

String col2 = driver.findElement(By.xpath("//span[contains(.,'Boneless Wing-8')]//parent::div")).getAttribute("style");

col2 = col2.substring(7);
System.out.println(col2);

if(col1.contains(col2))
{
	test.log(LogStatus.PASS, "The Addon text color in KDS Ticket Preview changed successfully, while user change the color in style option");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "The Addon text color in KDS Ticket Preview not changing, while user change the color in style option");
	ut.FailedCaptureScreenshotAsBASE64();
}

String selectedCol = driver.findElement(By.xpath("//mat-icon[contains(@class,'mat-icon-no-color select-check')]//parent::div")).getAttribute("style");

String actualCol = Addon_ColorBox.getAttribute("style");

if(actualCol.contains(selectedCol))
{
	test.log(LogStatus.PASS, "The Selected color is displayed in the tile after selecting the color in Addon");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "The Selected color is not displayed in the tile after selecting the color in Addon");
	ut.FailedCaptureScreenshotAsBASE64();
}
}

}

//**Update Status1

public void IupdateStatus1Color() throws InterruptedException {

	
Thread.sleep(2000);

for(int i = 1; i <= 4; i++)
{
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
}

//Actions actions = new Actions(driver);
//for (int i = 0; i < 3; i++) {
//    actions.sendKeys(Keys.ARROW_DOWN).perform();
//}

cmp.Click_Wait_ForElementClickable(Status1Color_Box, 60);
//Status1Color_Box.click();

for(int i = 1; i <= 5; i++) {

List<WebElement> col =driver.findElements(By.xpath("//div[contains(@class,'color-pick cursor-pointer')]"));
Random r = new Random();
int randomValue =  r.nextInt(col.size());
System.out.println("Status1 Color list size is"+randomValue);
col.get(randomValue).click();

String col1 = col.get(randomValue).getAttribute("style");			
Thread.sleep(2000);
System.out.println(col1);

col1 = col1.substring(12);
System.out.println(col1);

String selectedCol = driver.findElement(By.xpath("//mat-icon[contains(@class,'mat-icon-no-color select-check')]//parent::div")).getAttribute("style");

String actualCol = Status1Color_Box.getAttribute("style");

if(actualCol.contains(selectedCol))
{
	test.log(LogStatus.PASS, "The Selected color is displayed in the tile after selecting the color in Status1");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "The Selected color is not displayed in the tile after selecting the color in Status1");
	ut.FailedCaptureScreenshotAsBASE64();
}
}

}


//****Update Status 2 color

public void IupdateStatus2Color() throws InterruptedException {

		
Thread.sleep(2000);

for(int i = 1; i <= 4; i++)
{
	driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
}

//Actions actions = new Actions(driver);
//for (int i = 0; i < 3; i++) {
//    actions.sendKeys(Keys.ARROW_DOWN).perform();
//}

cmp.Click_Wait_ForElementClickable(Status2Color_Box, 60);
//Status2Color_Box.click(); 
for(int i = 1; i <= 5; i++) {

List<WebElement> col =driver.findElements(By.xpath("//div[contains(@class,'color-pick cursor-pointer')]"));
Random r = new Random();
int randomValue =  r.nextInt(col.size());
System.out.println("Status2 Color list size is"+randomValue);
col.get(randomValue).click();

String col1 = col.get(randomValue).getAttribute("style");			
Thread.sleep(2000);
System.out.println(col1);

col1 = col1.substring(12);
System.out.println(col1);

String selectedCol = driver.findElement(By.xpath("//mat-icon[contains(@class,'mat-icon-no-color select-check')]//parent::div")).getAttribute("style");

String actualCol = Status2Color_Box.getAttribute("style");

if(actualCol.contains(selectedCol))
{
	test.log(LogStatus.PASS, "The Selected color is displayed in the tile after selecting the color in Status2");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "The Selected color is not displayed in the tile after selecting the color in Status2");
	ut.FailedCaptureScreenshotAsBASE64();
}
}

}

//****Update Status 3 color

public void IupdateStatus3Color() throws InterruptedException {

	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	cmp.Click_Wait_ForElementClickable(Status3Color_Box, 60);
//	Status3Color_Box.click();	
Thread.sleep(2000);

//Actions actions = new Actions(driver);
//for (int i = 0; i < 3; i++) {
//    actions.sendKeys(Keys.ARROW_DOWN).perform();
//}

for(int i = 1; i <= 5; i++) {

List<WebElement> col =driver.findElements(By.xpath("//div[contains(@class,'color-pick cursor-pointer')]"));
Random r = new Random();
int randomValue =  r.nextInt(col.size());
System.out.println("Status3 Color list size is"+randomValue);
col.get(randomValue).click();

String col1 = col.get(randomValue).getAttribute("style");			
Thread.sleep(2000);
System.out.println(col1);

col1 = col1.substring(12);
System.out.println(col1);

String selectedCol = driver.findElement(By.xpath("//mat-icon[contains(@class,'mat-icon-no-color select-check')]//parent::div")).getAttribute("style");

String actualCol = Status3Color_Box.getAttribute("style");

if(actualCol.contains(selectedCol))
{
	test.log(LogStatus.PASS, "The Selected color is displayed in the tile after selecting the color in Status3");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "The Selected color is not displayed in the tile after selecting the color in Status3");
	ut.FailedCaptureScreenshotAsBASE64();
}
}

}

//**********************Status1-AfterMins**************************************************//
public void IUpdateAfterMins_Status1()
{
//	for (int i=0;i<3;i++) {
//		Actions actions =new Actions (driver);
//		actions.sendKeys(Keys.ARROW_DOWN).perform();			
//	}
//	
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	
	Status1AfterMins_InputBx.clear();
	Status1AfterMins_InputBx.sendKeys("10");
	
	String u1 =  Status1AfterMins_InputBx.getAttribute("value");
	
	System.out.println("Entered AfterMins value is"+u1);
	ut.PassedCaptureScreenshotAsBASE64();
	
}
	
	
public void IUpdateAfterMinsIncrease_Status1() throws InterruptedException {
	

	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	
	Thread.sleep(2000);
	
	
		String u1 =  Status1AfterMins_InputBx.getAttribute("value");
		
		int i1 = Integer.parseInt(u1);
		
		i1 = i1 + 1;
		
		Thread.sleep(2000);
		
		try {
			Thread.sleep(2000);
			cmp.Click_Wait_ForElementClickable(Status1AfterMinsUpArrow(), 60);}
			//Status1AfterMinsUpArrow().click();}
			catch (Exception K) {Status1AfterMinsUpArrow().click();}
	
	String u1a =  Status1AfterMins_InputBx.getAttribute("value");
	
	int i1a = Integer.parseInt(u1a);
			
	if(i1 == i1a)
	{
		test.log(LogStatus.PASS, "Increase the value of After Mins - Status 1 is working fine when user click the increase button");
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Increase the value of After Mins - Status 1 is not working fine when user click the increase");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	}

	

public void IUpdateAfterMinsDecrease_Status1() throws InterruptedException {
Thread.sleep(1000);

for (int i=0;i<5;i++) {
	Actions actions =new Actions (driver);
	actions.sendKeys(Keys.ARROW_DOWN).perform();			
}

	
Thread.sleep(2000);

//Status1AfterMins_InputBx.clear();
//Status1AfterMins_InputBx.sendKeys("10");
	
	String u1 =  Status1AfterMins_InputBx.getAttribute("value");
	
	int i1 = Integer.parseInt(u1);
	System.out.println(i1);
	Thread.sleep(1000);
	ut.PassedCaptureScreenshotAsBASE64();
	
	try {
	Thread.sleep(2000);
	cmp.Click_Wait_ForElementClickable(Status1AfterMinsDownArrow(), 60);
	//Status1AfterMinsDownArrow().click();
	}
	catch (Exception K) {Status1AfterMinsDownArrow().click();}
	
Thread.sleep(1000);
String u1a =  Status1AfterMins_InputBx.getAttribute("value");

int i1a = Integer.parseInt(u1a);
Thread.sleep(1000);
System.out.println(i1a);
		
if(i1a == (i1-1))
{
	test.log(LogStatus.PASS, "Decrease the value of After Mins - Status 1 is working fine when user click the decrease button");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "Decrease the value of After Mins - Status 1 is not working fine when user click decrease button");
	ut.FailedCaptureScreenshotAsBASE64();
}

}
	

public void IUpdateAfterMinswithCharacters_Status1() {
	
	for (int i=0;i<3;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}
	
	Status1AfterMins_InputBx.clear();

	Status1AfterMins_InputBx.sendKeys("e");
	
	ut.PassedCaptureScreenshotAsBASE64();
	
	String u4 =  Status1AfterMins_InputBx.getAttribute("value");
	
	if(u4.contains("e"))
	{
		test.log(LogStatus.FAIL, "The After mins field accept the Alphabets in Status 1");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.PASS, "The After mins field not accept the Alphabets in Status 1");
		ut.PassedCaptureScreenshotAsBASE64();
	}}


public void IUpdateAfterMinswithNegValue_Status1() {	
	
	for (int i=0;i<3;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}
	
	Status1AfterMins_InputBx.clear();
	
	Status1AfterMins_InputBx.sendKeys("-1");
	
	ut.PassedCaptureScreenshotAsBASE64();
	
	String u5 =  Status1AfterMins_InputBx.getAttribute("value");
	
	int i5 = Integer.parseInt(u5);
	
	if(i5 == -1)
	{
		test.log(LogStatus.FAIL, "The After Mins - Status 1 field accept the negative values");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.PASS, "The After Mins - Status 1 field is not accept the negative values");
		ut.PassedCaptureScreenshotAsBASE64();
	}

}


//*************************************Update-AfterMins Status 2**********************************************

public void IUpdateAfterMins_Status2()
{
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	Status2AfterMins_InputBx.clear();
	
	Status2AfterMins_InputBx.sendKeys("11");
	
	String u1 =  Status2AfterMins_InputBx.getAttribute("value");
	
	System.out.println("Entered AfterMins value is"+u1);
	ut.PassedCaptureScreenshotAsBASE64();

	
}
	
	
public void IUpdateAfterMinsIncrease_Status2() throws InterruptedException {
	
	Thread.sleep(2000);
	
//	Status2AfterMins_InputBx.clear();
//	Status2AfterMins_InputBx.sendKeys("11");
	
		String u1 =  Status2AfterMins_InputBx.getAttribute("value");
		
		int i1 = Integer.parseInt(u1);
		
		i1 = i1 + 1;
		
		Thread.sleep(2000);
		

		try {
			Thread.sleep(2000);
			cmp.Click_Wait_ForElementClickable(Status2AfterMinsUpArrow(), 60);}
			catch (Exception K) {}
	
	String u1a =  Status2AfterMins_InputBx.getAttribute("value");
	
	int i1a = Integer.parseInt(u1a);
			
	if(i1 == i1a)
	{
		test.log(LogStatus.PASS, "Increase the value of After Mins - Status 2 is working fine when user click the increase button");
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Increase the value of After Mins - Status 2 is not working fine when user click the increase");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	}

	
public void IUpdateAfterMinsDecrease_Status2() throws InterruptedException {
	Thread.sleep(1000);
	
	for (int i=0;i<5;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}
	
		
	Thread.sleep(1000);
//	
//	Status2AfterMins_InputBx.clear();
//	Status2AfterMins_InputBx.sendKeys("11");
		
		String u1 =  Status2AfterMins_InputBx.getAttribute("value");
		
		int i1 = Integer.parseInt(u1);
		System.out.println(i1);
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
		Thread.sleep(2000);
			
	
		try {
			Thread.sleep(2000);
			cmp.Click_Wait_ForElementClickable(Status2AfterMinsDownArrow(), 60);}
			catch (Exception K) {}
		
	Thread.sleep(1000);
	String u1a =  Status2AfterMins_InputBx.getAttribute("value");
	
	int i1a = Integer.parseInt(u1a);
	Thread.sleep(1000);
	System.out.println(i1a);
			
	if(i1a == (i1-1))
	{
		test.log(LogStatus.PASS, "Decrease the value of After Mins - Status 2 is working fine when user click the decrease button");
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Decrease the value of After Mins - Status 2 is not working fine when user click decrease button");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	}
	

public void IUpdateAfterMinswithCharacters_Status2() {
	
	for (int i=0;i<3;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}
	
	Status2AfterMins_InputBx.clear();

	Status2AfterMins_InputBx.sendKeys("a");
	
	ut.PassedCaptureScreenshotAsBASE64();
	
	String u4 =  Status2AfterMins_InputBx.getAttribute("value");
	
	if(u4.contains("a"))
	{
		test.log(LogStatus.FAIL, "The After mins field accept the Alphabets in Status 2");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.PASS, "The After mins field not accept the Alphabets in Status 2");
		ut.PassedCaptureScreenshotAsBASE64();
	}}


public void IUpdateAfterMinswithNegValue_Status2() {
	
	for (int i=0;i<3;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}
	
	Status2AfterMins_InputBx.clear();
	
	Status2AfterMins_InputBx.sendKeys("-2");
	ut.PassedCaptureScreenshotAsBASE64();
	
	String u5 =  Status2AfterMins_InputBx.getAttribute("value");
	
	int i5 = Integer.parseInt(u5);
	
	if(i5 == -2)
	{
		test.log(LogStatus.FAIL, "The After Mins - Status 2 field accept the negative values");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.PASS, "The After Mins - Status 2 field is not accept the negative values");
		ut.PassedCaptureScreenshotAsBASE64();
	}

}


//*************************************Update-AfterMins Status 3**********************************************

public void IUpdateAfterMins_Status3()
{
	for (int i=0;i<3;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}
	
	Status3AfterMins_InputBx.clear();
	Status3AfterMins_InputBx.sendKeys("12");
	
	String u1 =  Status3AfterMins_InputBx.getAttribute("value");
	
	System.out.println("Entered AfterMins value is"+u1);
	ut.PassedCaptureScreenshotAsBASE64();
	
}
	
	
public void IUpdateAfterMinsIncrease_Status3() throws InterruptedException {
	
	for (int i=0;i<3;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}
		
//	Status3AfterMins_InputBx.clear();
//	Status3AfterMins_InputBx.sendKeys("12");
	
		String u1 =  Status3AfterMins_InputBx.getAttribute("value");
		
		int i1 = Integer.parseInt(u1);
		
		i1 = i1 + 1;
		
		Thread.sleep(2000);
		
	
		try {
			Thread.sleep(2000);
			cmp.Click_Wait_ForElementClickable(Status3AfterMinsUpArrow(), 60);}
			catch (Exception K) {}
	
	String u1a =  Status3AfterMins_InputBx.getAttribute("value");
	
	int i1a = Integer.parseInt(u1a);
			
	if(i1 == i1a)
	{
		test.log(LogStatus.PASS, "Increase the value of After Mins - Status 3 is working fine when user click the increase button");
		ut.PassedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.FAIL, "Increase the value of After Mins - Status 3 is not working fine when user click the increase");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	
	}

	

public void IUpdateAfterMinsDecrease_Status3() throws InterruptedException {
Thread.sleep(1000);

for (int i=0;i<5;i++) {
	Actions actions =new Actions (driver);
	actions.sendKeys(Keys.ARROW_DOWN).perform();			
}
	
Thread.sleep(1000);

//Status3AfterMins_InputBx.clear();
//Status3AfterMins_InputBx.sendKeys("12");
	
	String u1 =  Status3AfterMins_InputBx.getAttribute("value");
	
	int i1 = Integer.parseInt(u1);
	System.out.println(i1);
	Thread.sleep(1000);
	ut.PassedCaptureScreenshotAsBASE64();
	Thread.sleep(2000);
		
	try {
		Thread.sleep(2000);
		cmp.Click_Wait_ForElementClickable(Status3AfterMinsDownArrow(), 60);}
		catch (Exception K) {}

	
Thread.sleep(1000);
String u1a =  Status3AfterMins_InputBx.getAttribute("value");

int i1a = Integer.parseInt(u1a);
Thread.sleep(1000);
System.out.println(i1a);
		
if(i1a == (i1-1))
{
	test.log(LogStatus.PASS, "Decrease the value of After Mins - Status 3 is working fine when user click the decrease button");
	ut.PassedCaptureScreenshotAsBASE64();
}
else
{
	test.log(LogStatus.FAIL, "Decrease the value of After Mins - Status 3 is not working fine when user click decrease button");
	ut.FailedCaptureScreenshotAsBASE64();
}

}

public void IUpdateAfterMinswithCharacters_Status3() {
	
	for (int i=0;i<3;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}

	Status3AfterMins_InputBx.clear();
	Status3AfterMins_InputBx.sendKeys("b");
	
	ut.PassedCaptureScreenshotAsBASE64();
	
	String u4 =  Status3AfterMins_InputBx.getAttribute("value");
	
	if(u4.contains("b"))
	{
		test.log(LogStatus.FAIL, "The After mins field accept the Alphabets in Status 3");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.PASS, "The After mins field not accept the Alphabets in Status 3");
		ut.PassedCaptureScreenshotAsBASE64();
	}}


public void IUpdateAfterMinswithNegValue_Status3() {	
	
	for (int i=0;i<3;i++) {
		Actions actions =new Actions (driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();			
	}
	
	Status3AfterMins_InputBx.clear();
	Status3AfterMins_InputBx.sendKeys("-3");
	
	ut.PassedCaptureScreenshotAsBASE64();
	
	String u5 =  Status3AfterMins_InputBx.getAttribute("value");
	
	int i5 = Integer.parseInt(u5);
	
	if(i5 == -3)
	{
		test.log(LogStatus.FAIL, "The After Mins - Status 3 field accept the negative values");
		ut.FailedCaptureScreenshotAsBASE64();
	}
	else
	{
		test.log(LogStatus.PASS, "The After Mins - Status 3 field is not accept the negative values");
		ut.PassedCaptureScreenshotAsBASE64();
	}

}



//************************************************SMS Order Notifications*********************************************//


@FindBy(xpath = "//h6[contains(.,'Customer Arrived Notification')]")
public WebElement CustomerArrivedNotification;

public WebElement CustomerArrivedNotification() {
	return CustomerArrivedNotification;
}

public void Check_CustomerArrivedNotification_KDS()
{
	if (CustomerArrivedNotification().getText().equalsIgnoreCase("Customer Arrived Notification")) {
		System.out.println("Customer Arrived Notification Option is displayed");
	};
}

@FindBy(xpath = "//h6[contains(.,'Completed Order: QSR')]")
public WebElement Completed_Order_QSR;

public WebElement Completed_Order_QSR() {
	return Completed_Order_QSR;
}

public void Check_Completed_Order_QSR_KDS()
{
	if (Completed_Order_QSR().getText().equalsIgnoreCase("Completed Order: QSR")) {
		System.out.println("Completed Order: QSR Option is displayed");
	};
}


@FindBy(xpath = "//h6[contains(.,'Completed Order: Table Service')]")
public WebElement Completed_Order_TableService;

public WebElement Completed_Order_TableService() {
	return Completed_Order_TableService;
}

public void Check_Completed_Order_TableService_KDS()
{
	if (Completed_Order_TableService().getText().equalsIgnoreCase("Completed Order: Table Service")) {
		System.out.println("Completed Order: Table Service Option is displayed");
	};
}

@FindBy(xpath = "//h6[contains(.,'Completed Order: Online Order')]")
public WebElement Completed_Order_Online;

public WebElement Completed_Order_Online() {
	return Completed_Order_Online;
}

public void Check_Completed_Order_Online_KDS()
{
	if (Completed_Order_Online().getText().equalsIgnoreCase("Completed Order: Online Order")) {
		System.out.println("Completed Order: Online Order Option is displayed");
	};
}

@FindBy(xpath = "//h6[contains(.,'Completed Order: Delivery Order')]")
public WebElement Completed_Order_Delivery;

public WebElement Completed_Order_Delivery() {
	return Completed_Order_Delivery;
}

public void Check_Completed_Order_Delivery_KDS()
{
	if (Completed_Order_Delivery().getText().equalsIgnoreCase("Completed Order: Delivery Order")) {
		System.out.println("Completed Order: Delivery Order Option is displayed");
	};
}

@FindBy(xpath = "//h6[contains(.,'Completed Order: To Go Order')]")
public WebElement Completed_Order_ToGo;

public WebElement Completed_Order_ToGo() {
	return Completed_Order_ToGo;
}

public void Check_Completed_Order_ToGo_KDS()
{
	if (Completed_Order_ToGo().getText().equalsIgnoreCase("Completed Order: To Go Order")) {
		System.out.println("Completed Order: To Go Order Option is displayed");
	};
}

@FindBy(xpath = "//h6[contains(.,'Completed Order: For Here Order')]")
public WebElement Completed_Order_ForHere;

public WebElement Completed_Order_ForHere() {
	return Completed_Order_ForHere;
}

public void Check_Completed_Order_ForHere_KDS()
{
	if (Completed_Order_ForHere().getText().equalsIgnoreCase("Completed Order: For Here Order")) {
		System.out.println("Completed Order: For Here Order Option is displayed");
	};
}

@FindBy(xpath = "//h6[contains(.,'Completed Order: Bar Tab Order')]")
public WebElement Completed_Order_BarTab;

public WebElement Completed_Order_BarTab() {
	return Completed_Order_BarTab;
}

public void Check_Completed_Order_BarTab_KDS()
{
	if (Completed_Order_BarTab().getText().equalsIgnoreCase("Completed Order: Bar Tab Order")) {
		System.out.println("Completed Order: Bar Tab Order Option is displayed");
	};
}


@FindBy(xpath = "//h6[contains(.,'Customer Arrived Notification')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
public WebElement CustomerArrivedNotification_No_Toggle;

public WebElement CustomerArrivedNotification_No_Toggle() {
	return CustomerArrivedNotification_No_Toggle;
}

@FindBy(xpath = "//h6[contains(.,'Customer Arrived Notification')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
public WebElement CustomerArrivedNotification_Yes_Toggle;

public WebElement CustomerArrivedNotification_Yes_Toggle() {
	return CustomerArrivedNotification_Yes_Toggle;
}


public void IClickCustomerArrivedNotificationToggle_No_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 3; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(CustomerArrivedNotification_No_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		CustomerArrivedNotification_Yes_Toggle().click();
		Thread.sleep(1000);
		CustomerArrivedNotification_No_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		CustomerArrivedNotification_No_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickCustomerArrivedNotificationToggle_Yes_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 3; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(CustomerArrivedNotification_Yes_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		CustomerArrivedNotification_No_Toggle().click();
		Thread.sleep(1000);
		CustomerArrivedNotification_Yes_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		CustomerArrivedNotification_Yes_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

@FindBy(xpath = "//h6[contains(.,'Completed Order: QSR')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
public WebElement Completed_Order_QSR_No_Toggle;

@FindBy(xpath = "//h6[contains(.,'Completed Order: QSR')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
public WebElement Completed_Order_QSR_Yes_Toggle;

@FindBy(xpath = "//h6[contains(.,'Completed Order: QSR')]/../../../div[5]/div[2]/div/textarea")
public WebElement Completed_Order_QSR_TextArea;

public WebElement Completed_Order_QSR_Yes_Toggle() {
	return Completed_Order_QSR_Yes_Toggle;
}

public WebElement Completed_Order_QSR_No_Toggle() {
	return Completed_Order_QSR_No_Toggle;
}

public WebElement Completed_Order_QSR_TextArea() {
	return Completed_Order_QSR_TextArea;
}


public void IClickCompleted_Order_QSRToggle_No_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 3; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_QSR_No_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_QSR_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_QSR_No_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_QSR_No_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickCompleted_Order_QSRToggle_Yes_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 3; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_QSR_Yes_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_QSR_No_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_QSR_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_QSR_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_QSR_Yes_Toggle().click();
		Completed_Order_QSR_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	}
}


@FindBy(xpath = "//h6[contains(.,' Completed Order: Table Service ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
public WebElement Completed_Order_TableService_No_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: Table Service ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
public WebElement Completed_Order_TableService_Yes_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: Table Service ')]/../../../div[6]/div[2]/div/textarea")
public WebElement Completed_Order_TableService_TextArea;

public WebElement Completed_Order_TableService_Yes_Toggle() {
	return Completed_Order_TableService_Yes_Toggle;
}

public WebElement Completed_Order_TableService_No_Toggle() {
	return Completed_Order_TableService_No_Toggle;
}

public WebElement Completed_Order_TableService_TextArea() {
	return Completed_Order_TableService_TextArea;
}


public void IClickCompleted_Order_TableServiceToggle_No_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_TableService_No_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_TableService_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_TableService_No_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_TableService_No_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickCompleted_Order_TableServiceToggle_Yes_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_TableService_Yes_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_TableService_No_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_TableService_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_TableService_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_TableService_Yes_Toggle().click();
		Completed_Order_TableService_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	}
}



@FindBy(xpath = "//h6[contains(.,' Completed Order: Online Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
public WebElement Completed_Order_Online_No_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: Online Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
public WebElement Completed_Order_Online_Yes_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: Online Order ')]/../../../div[8]/div[2]/div/textarea")
public WebElement Completed_Order_Online_TextArea;


public WebElement Completed_Order_Online_Yes_Toggle() {
	return Completed_Order_Online_Yes_Toggle;
}

public WebElement Completed_Order_Online_No_Toggle() {
	return Completed_Order_Online_No_Toggle;
}

public WebElement Completed_Order_Online_TextArea() {
	return Completed_Order_Online_TextArea;
}


public void IClickCompleted_Order_OnlineToggle_No_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_Online_No_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_Online_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_Online_No_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_Online_No_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickCompleted_Order_OnlineToggle_Yes_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_Online_Yes_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_Online_No_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_Online_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_Online_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_Online_Yes_Toggle().click();
		Completed_Order_Online_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	}
}


@FindBy(xpath = "//h6[contains(.,' Completed Order: Delivery Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
public WebElement Completed_Order_Delivery_No_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: Delivery Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
public WebElement Completed_Order_Delivery_Yes_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: Delivery Order ')]/../../../div[10]/div[2]/div/textarea")
public WebElement Completed_Order_Delivery_TextArea;


public WebElement Completed_Order_Delivery_No_Toggle() {
	return Completed_Order_Delivery_No_Toggle;
}

public WebElement Completed_Order_Delivery_Yes_Toggle() {
	return Completed_Order_Delivery_Yes_Toggle;
}

public WebElement Completed_Order_Delivery_TextArea() {
	return Completed_Order_Delivery_TextArea;
}


public void IClickCompleted_Order_DeliveryToggle_No_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_Delivery_No_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_Delivery_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_Delivery_No_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_Delivery_No_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickCompleted_Order_DeliveryToggle_Yes_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_Delivery_Yes_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_Delivery_No_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_Delivery_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_Delivery_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_Online_Yes_Toggle().click();
		Completed_Order_Delivery_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

@FindBy(xpath = "//h6[contains(.,' Completed Order: To Go Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
public WebElement Completed_Order_ToGo_No_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: To Go Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
public WebElement Completed_Order_ToGo_Yes_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: To Go Order ')]/../../../div[12]/div[2]/div/textarea")
public WebElement Completed_Order_ToGo_TextArea;



public WebElement Completed_Order_ToGo_No_Toggle() {
	return Completed_Order_ToGo_No_Toggle;
}

public WebElement Completed_Order_ToGo_Yes_Toggle() {
	return Completed_Order_ToGo_Yes_Toggle;
}

public WebElement Completed_Order_ToGo_TextArea() {
	return Completed_Order_ToGo_TextArea;
}


public void IClickCompleted_Order_ToGoToggle_No_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_ToGo_No_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_ToGo_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_ToGo_No_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_ToGo_No_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickCompleted_Order_ToGoToggle_Yes_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_ToGo_Yes_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_ToGo_No_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_ToGo_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_ToGo_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_ToGo_Yes_Toggle().click();
		Completed_Order_ToGo_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	}
}


@FindBy(xpath = "//h6[contains(.,' Completed Order: For Here Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
public WebElement Completed_Order_ForHere_No_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: For Here Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
public WebElement Completed_Order_ForHere_Yes_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: For Here Order ')]/../../../div[10]/div[2]/div/textarea")
public WebElement Completed_Order_ForHere_TextArea;


public WebElement Completed_Order_ForHere_No_Toggle() {
	return Completed_Order_ForHere_No_Toggle;
}

public WebElement Completed_Order_ForHere_Yes_Toggle() {
	return Completed_Order_ForHere_Yes_Toggle;
}

public WebElement Completed_Order_ForHere_TextArea() {
	return Completed_Order_ForHere_TextArea;
}


public void IClickCompleted_Order_ForHereToggle_No_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_ForHere_No_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_ForHere_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_ForHere_No_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_ForHere_No_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickCompleted_Order_ForHereToggle_Yes_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_ForHere_Yes_Toggle().isEnabled())
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		Completed_Order_ForHere_No_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_ForHere_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_ForHere_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_ForHere_Yes_Toggle().click();
		Completed_Order_ForHere_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	}
}


@FindBy(xpath = "//h6[contains(.,' Completed Order: Bar Tab Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='No']")
public WebElement Completed_Order_BarTab_No_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: Bar Tab Order ')]/../../div[2]//div/mat-button-toggle-group/mat-button-toggle/button[.='Yes']")
public WebElement Completed_Order_BarTab_Yes_Toggle;

@FindBy(xpath = "//h6[contains(.,' Completed Order: Bar Tab Order ')]/../../../div[16]/div[2]/div/textarea")
public WebElement Completed_Order_BarTab_TextArea;

public WebElement Completed_Order_BarTab_No_Toggle() {
	return Completed_Order_BarTab_No_Toggle;
}

public WebElement Completed_Order_BarTab_Yes_Toggle() {
	return Completed_Order_BarTab_Yes_Toggle;
}

public WebElement Completed_Order_BarTab_TextArea() {
	return Completed_Order_BarTab_TextArea;
}


public void IClickCompleted_Order_BarTabToggle_No_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_BarTab_No_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_BarTab_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_BarTab_No_Toggle().click();
		Thread.sleep(1000);
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_BarTab_No_Toggle().click();
		ut.PassedCaptureScreenshotAsBASE64();
	}
}

public void IClickCompleted_Order_BarTabToggle_Yes_Btn() throws InterruptedException {
	
	for(int i = 1; i <= 4; i++)
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	
	if(Completed_Order_BarTab_Yes_Toggle().isEnabled())
	{
		Thread.sleep(1000);
		Completed_Order_BarTab_No_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_BarTab_Yes_Toggle().click();
		Thread.sleep(1000);
		Completed_Order_BarTab_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	} else {
		Completed_Order_ForHere_Yes_Toggle().click();
		Completed_Order_BarTab_TextArea.sendKeys(RandomStringUtils.randomAlphabetic(160));
		ut.PassedCaptureScreenshotAsBASE64();
	}
}






		
}
		


