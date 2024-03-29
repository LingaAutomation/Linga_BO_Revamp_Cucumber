package com.Pages;

import static org.testng.Assert.expectThrows;

import java.io.File;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class Common_XPaths extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
	Utility ut=new Utility();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
//	public Common_XPaths(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	
	
	@FindBy(xpath = "//input[contains(@data-placeholder,'Search')]")
	public WebElement SearchBox;

	@FindBy(xpath = "//div[@class='option-list']//input[@data-placeholder='Search']")
	public WebElement SearchBox_DropDown;
	
	@FindBy(xpath = "//button[.='Save']")
	public WebElement SaveBtn;
	
	@FindBy(xpath = "//button[contains(.,'SAVE')]")
	public WebElement Save_ButtonTwo;
	
	@FindBy(xpath = "//button[contains(.,'UPDATE')]")
	WebElement Update_ButtonTwo;
	
	@FindBy(xpath = "//mat-hint")
	WebElement Error_BelowInputBx;
	
	@FindBy(xpath = "//mat-hint/mat-hint[contains(.,'Name already exist')]")
	public WebElement Name_Already_Exist_ErrorMsg;
	
	@FindBy(xpath = "//button[@mattooltip='Click to see actions']")
	WebElement Actions_inSearch;
	
	@FindBy(xpath = "//label[contains(.,'Percentage')]/../../..//button[1]")
	public WebElement UpArrow_Percentage_InputBox;
	
	@FindBy(xpath = "//label[contains(.,'Percentage')]/../../..//button[2]")
	public WebElement DownArrow_Percentage_InputBox;
	
	@FindBy(xpath = "//button[contains(.,'General')][contains(@class,'segment-button')]")
	public WebElement Genaral_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Level')][contains(@class,'segment-button')]")
	public WebElement Level_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Availability')][contains(@class,'segment-button')]")
	public WebElement Availability_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Visibility')][contains(@class,'segment-button')]")
	public WebElement Visibility_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Roles')][contains(@class,'segment-button')]")
	public WebElement Roles_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Prefix')][contains(@class,'segment-button')]")
	public WebElement Prefix_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Serving Size')][contains(@class,'segment-button')]")
	public WebElement Serving_Sizes_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Tare Group')][contains(@class,'segment-button')]")
	public WebElement Tare_Group_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Tax')][contains(@class,'segment-button')]")
	public WebElement Tax_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Item Service Charge')][contains(@class,'segment-button')]")
	public WebElement Item_Service_Charge_Tab_inContents;
	
	@FindBy(xpath = "//button[contains(.,'Kitchen Printers')][contains(@class,'segment-button')]")
	public WebElement Kitchen_Printers_Tab_inContents;
	
	@FindBy(xpath = "//button[contains(.,'Label Printers')][contains(@class,'segment-button')]")
	public WebElement Label_Printers_Tab_inContents;
	
	@FindBy(xpath = "//button[contains(.,'Restrict Printers')][contains(@class,'segment-button')]")
	public WebElement Restrict_Printers_Tab_inContents;
	
	@FindBy(xpath = "//button[contains(.,'Summary')][contains(@class,'segment-button')]")
	public WebElement Summary_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Sales')][contains(@class,'segment-button')]")
	public WebElement Sales_Tab_inContents; 
	
	@FindBy(xpath = "//button[contains(.,'Payments')][contains(@class,'segment-button')]")
	public WebElement Payments_Tab_inContents;
	
	@FindBy(xpath = "//button[contains(.,'Formula Definition')][contains(@class,'segment-button')]")
	public WebElement Formula_Definition_Tab_inContents;
	
	@FindBy(xpath = "//button[contains(.,'Other Summaries')][contains(@class,'segment-button')]")
	public WebElement Other_Summaries_Tab_inContents;
	
	@FindBy(xpath = "(//span[@class='sub-title'])[1]")
	public WebElement Home;

	@FindBy(xpath = "(//span[@class='sub-title'])[2]")
	public WebElement Modules_Name;

	@FindBy(xpath = "(//span[@class='sub-title'])[3]")
	public WebElement path1;
	
	@FindBy(xpath = "(//span[@class='sub-title'])[3]")
	public WebElement path2;
	
	@FindBy(xpath = "//mat-select[@aria-label='Rows per page:']//span/span")
	public WebElement Rows_Per_Page;
	
	@FindBy(xpath = "//button[contains(.,'Pricing/Cost')][contains(@class,'segment-button')]")
	public WebElement Pricing_Cost_Tab_inContents;
	
//	@FindBy(xpath = "//button[contains(.,'Visibility')][contains(@class,'segment-button')]")
//	public WebElement Visibility_Tab_inContents;
	
	@FindBy(xpath = "//button[@alt='Close']")
	public WebElement Close_Icon_InDropDownIputBx;
	
	@FindBy(xpath = "//p[@class='color-red'][contains(.,'Name already exist')]")
	public WebElement Nama_Already_ExistErrorInputBx;
	
	public WebElement Save_Button()
	{
		return SaveBtn;
	}
	
	public WebElement Update_Button()
	{
		return UpdateBtn;
	}
	
	public void Click_Save_ButtonTwo()
	{
		Save_ButtonTwo.click();
	}
	
	public void Click_Update_ButtonTwo()
	{
		Update_ButtonTwo.click();
	}
	
	public WebElement Save_ButtonTwo()
	{
		return Save_ButtonTwo;
	}
	
	public WebElement Update_ButtonTwo()
	{
		return Update_ButtonTwo;
	}
	
	@FindBy(xpath = "//button[.='Update']")
	WebElement UpdateBtn;
	
	@FindBy(xpath = "//button[.='Cancel']")
	public WebElement CancelBtn;
	
	@FindBy(xpath = "//div[@class='action-buttons']/div/div/button[contains(.,'Cancel')]")
	public WebElement CancelBtn_AlertPopup;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement DeleteBtn;
	
	@FindBy(xpath = "//button[contains(.,'Activate')]")
	public WebElement ActivateBtn;
	
	@FindBy(xpath = "//div/span[contains(.,'Close')]")
	public WebElement CloseBtn;
	
	@FindBy(xpath = "//div[@class='drawer-component']/div/div/h3")
	WebElement CreationScreenHeader;
	
	@FindBy(xpath = "//div[contains(@class,'row header')]//h3")
	WebElement CreationScreenHeaderTwo;
	
	@FindBy(xpath = "//mat-button-toggle[.='Yes']")
	public WebElement YesToggleBtn;
	
	@FindBy(xpath = "//mat-button-toggle[.='No']")
	public WebElement NoToggleBtn;
	
	@FindBy(xpath = "//button[.=' Yes ']")
	public WebElement Yes_Btn;
	
	@FindBy(xpath = "//button[.=' No ']")
	public WebElement No_Btn;
	
	
	@FindBy(xpath = "//div[contains(@class,'message')]/span")
	WebElement AlertMessageTitle;
	
	@FindBy(xpath = "//h3[@class='title']")
	WebElement MainScreenHeader;
	
	//div[contains(@class,'row header-sticky')]//h3
	
	@FindBy(xpath = "//input[@aria-label='Name']")
	WebElement NameInputBox;
	
	@FindBy(xpath = "//button[contains(.,'ACTIVE')]")
	WebElement EnableActive_InactiveBtn;
	
	@FindBy(xpath = "//button[contains(.,'INACTIVE')]")
	WebElement EnableInactive_ActiveBtn;
	
	@FindBy(xpath = "//button[contains(@class,'mat-button-base active-toggle')]/span/span")
	WebElement Active_InactiveStatus;
	
	@FindBy(xpath = "//mat-paginator/div/div/div")
	WebElement PaginationIcon;
	
	@FindBy(xpath = "//button[contains(@mattooltip,'to POS')]")
	public WebElement PublishButton;
	
	@FindBy(xpath = "//button[contains(.,'keyboard_backspace')]")
	public WebElement Backspace_Icon;
	
	@FindBy(xpath = "//button[contains(.,'SAVE AND PUBLISH')]")
	public WebElement SaveAndPublish_Btn;
	
	@FindBy(xpath = "//button[contains(.,'UPDATE AND PUBLISH')]")
	public WebElement UpdateAndPublish_Btn;

	@FindBy(xpath = "//button[contains(.,'COLUMNS')]")
	public WebElement Columns_Btn;

	@FindBy(xpath = "//input[@type='file']")
	public WebElement Upload_PictureBtn;

	@FindBy(xpath = "//div[@class='alert-content']/p")
	public WebElement Alert_Popup;
	
	@FindBy(xpath = "//button[contains(.,'amount')]")
	WebElement AmountBtn;

	@FindBy(xpath = "//button[contains(.,'percentage')]")
	WebElement PercentageBtn;
	
	@FindBy(xpath = "//div[@class='options']/select-option[1]")
	WebElement FirstOption_DropBtn;

	@FindBy(xpath = "//button[contains(.,'NEW TAX')]")
	WebElement New_TaxBtn;
	
	@FindBy(xpath = "//h3[contains(.,'New Tax')]/../../..//label[contains(.,'Name')]/../../input")
	WebElement New_TaxNameInput;
	
	@FindBy(xpath = "//button[contains(.,'Okay')]")
	WebElement Okay_Btn;
	
	public void Click_Okay_Button()
	{
		Okay_Btn.click();
		
	}
	
	public void Click_Amount()
	{
		AmountBtn.click();
	}
	
	public void Click_Percentage()
	{
		PercentageBtn.click();
	}
	
	public void Alert_PopupMsg(String str)
	{
		if(Alert_Popup.getText().equalsIgnoreCase(str))
		{
			test.log(LogStatus.PASS, str+ "Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, str+ "not Displayed");
		}
	}
	
	public void Upload_Picture(String str) throws Exception
	{
	//	Upload_PictureBtn.clear();
		Thread.sleep(1000);
		Upload_PictureBtn.sendKeys(System.getProperty("user.dir")+str);
//		Upload_PictureBtn.sendKeys(str);

	}
	
	
	public void Filter_Columns() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
		Thread.sleep(2000);
		Columns_Btn.click();
		
		//Deselect Select All
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
		Thread.sleep(500);
		
		Thread.sleep(1000);
		List<WebElement> FilterList=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
		
//		for(int i=1;i<=FilterList.size();i++)
//		{
//			
//		}
		
		
		for(WebElement ele:FilterList)
//		for(int i=1;i<=FilterList.size();i++)
		{
			String FilterText=ele.getText();
			
			ele.click();
			
			if(FilterText.equalsIgnoreCase("Select All"))
			{
				test.log(LogStatus.PASS, "Select All Filtered Successfully");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else if(driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[1]/div/span")).getText().equalsIgnoreCase(FilterText))
			{
				test.log(LogStatus.PASS, FilterText+ " Filtered Successfully");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, FilterText+ " Filter Unsuccessful. Wrongly filtered as "+driver.findElement(By.xpath("//div[contains(@class,'data-grid-headers')]/div/data-grid-row/div/div[1]/div/span")).getText());
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
			
			ele.click();
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).click();
		
		try 
		{
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("//div[@class='option-list']/div/select-option[1]")).isDisplayed())
			{
				Columns_Btn.click();
			}
		}
		catch(Exception k) {}

	}
	
	public void Click_Save_and_PublishButton()
	{
		SaveAndPublish_Btn.click();
	}
	
	public WebElement Save_and_PublishButton()
	{
		return SaveAndPublish_Btn;
	}
	
	public void Click_Update_and_PublishButton()
	{
		UpdateAndPublish_Btn.click();
	}
	
	public WebElement Update_and_PublishButton()
	{
		return UpdateAndPublish_Btn;
	}
	
	
	public void Click_BackspaceButton() throws Exception
	{
		Thread.sleep(2000);
//		Cursor_MoveToElement(Backspace_Icon);
		Backspace_Icon.click();
	}
	
	public WebElement Enable_Active_InactiveBtn()
	{
		return EnableActive_InactiveBtn;
	}
	
	public void Click_ActivetoInactiveButton()
	{
		EnableActive_InactiveBtn.click();
	}
	
	public void Click_InactivetoActiveButton()
	{
		EnableInactive_ActiveBtn.click();
	}
	
	public void Click_Yes_Toggle() throws Exception
	{
		Thread.sleep(1000);
		YesToggleBtn.click();
	}
	
	public void Click_No_Toggle() throws Exception
	{
		Thread.sleep(1000);
		NoToggleBtn.click();
	}
	
	public void Click_Yes_Button() throws Exception
	{
		Thread.sleep(1000);
		Yes_Btn.click();
	}
	
	public void Click_No_Button() throws Exception
	{
		Thread.sleep(1000);
		No_Btn.click();
	}
	
	public void VerifyActive_InactiveStatus(String str)
	{
		
		if(Active_InactiveStatus.getText().equalsIgnoreCase(str))
		{
			test.log(LogStatus.PASS, str+" Page displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, str+" Page not displayed");
		}
	}
	
	public void Click_SaveButton()
	{
		SaveBtn.click();
	}
	
	public void Click_UpdateButton()
	{
		UpdateBtn.click();
	}
	
	public void Click_DeleteButton() throws Exception
	{
		Thread.sleep(1000);
		if(Alert_Popup.getText().equalsIgnoreCase("Are you sure you want to delete this item?"))
		{
			test.log(LogStatus.PASS, "Delete Pop Up Displayed");
			
			DeleteBtn.click();
		}
		else
		{
			test.log(LogStatus.FAIL, "Delete Pop Up not Displayed");
			
		}
		
	}
	
	public void Click_DeleteButton_Message(String Message) throws Exception
	{
		Thread.sleep(1000);
		if(Alert_Popup.getText().equalsIgnoreCase(Message))
		{
			test.log(LogStatus.PASS, "Delete Pop Up Displayed");
			
			DeleteBtn.click();
		}
		else
		{
			test.log(LogStatus.FAIL, "Delete Pop Up not Displayed");
			
		}
		
	}
	
	public void Click_ActivateButton()
	{
		
		if(Alert_Popup.getText().equalsIgnoreCase("Are you sure you want to activate this item?"))
		{
			test.log(LogStatus.PASS, "Activate Pop Up Displayed");
			
			ActivateBtn.click();
		}
		else
		{
			test.log(LogStatus.FAIL, "Activate Pop Up not Displayed");
			
		}

	}
	
	
	public void Click_CancelButton()
	{
		CancelBtn.click();
	}
	
	public void Click_CancelButtonInAlert()
	{
		CancelBtn_AlertPopup.click();
	}
	
	public void Click_CloseButton()
	{
		CloseBtn.click();
	}
	
	public WebElement NameInputBox()
	{
		return NameInputBox;
	}
	
	@FindBy(xpath = "//div[contains(@class,'settings')]/button/span")
	WebElement Setting_Btn;
	
	public WebElement Setting()
	{
		return Setting_Btn;
	}
	
	public void Search(String SearchValue) throws Exception
	{
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(8000);
		
		WebElement cat = driver.findElement(By.xpath("//div[.=' "+SearchValue+" '][contains(@class,'options')]"));
		
		
		if(cat.getText().equals(SearchValue)) {
			test.log(LogStatus.PASS, "Search menu item same ");
			ut.PassedCaptureScreenshotAsBASE64();
			}
			else {
				test.log(LogStatus.FAIL, "Search menu item are not same");
				ut.PassedCaptureScreenshotAsBASE64();
			}

	}
	
	public void Search_inTable(String SearchValue) throws Exception
	{
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(8000);
	}
	
	public WebElement SearchBox()
	{
		return SearchBox;
	}
	
	
	public void EnterName(String Str) throws Exception
	{
		Thread.sleep(1000);
		NameInputBox.clear();
		Thread.sleep(1000);
		NameInputBox.sendKeys(Str);
	}
	
	public WebElement ConfirmationAlertMsg()
	{
		return AlertMessageTitle;
	}


	public void VerifyCreationScreenPageHeader(String Str)
	{
		if(CreationScreenHeader.getText().equals(Str))
		{
			test.log(LogStatus.PASS, Str+" Creation page Loaded Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, Str+" Creation Page Loaded Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void VerifyCreationScreenPageHeader_Two(String Str)
	{
		if(CreationScreenHeaderTwo.getText().equals(Str))
		{
			test.log(LogStatus.PASS, Str+" Creation page Loaded Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, Str+" Creation Page Loaded Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Navigate_To_Page(String StoreID,String PageAttribute) throws Exception
	{
		driver.get(Utility.getProperty("baseURL")+StoreID+PageAttribute);

	}
	
	public void VerifyMainScreenPageHeader(String Str)
	{
		if(MainScreenHeader.getText().equals(Str))
		{
			test.log(LogStatus.PASS, Str+" Page Loaded Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, Str+" Page Loaded Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void VerifyPagination_and_Refresh_Publish() throws Exception
	{
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		if(PaginationIcon.isDisplayed())
		{
			test.log(LogStatus.PASS, "Pagination Available");
			
			ut.PassedCaptureScreenshotAsBASE64();
		
		List<WebElement> pageList=driver.findElements(By.xpath("//mat-paginator/div/div//button"));
		
		Thread.sleep(2000);
		for(int i=2;i<pageList.size();i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//mat-paginator/div/div//button["+i+"]")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-paginator/div/div//button[2]")).click();
		
		test.log(LogStatus.INFO, "Pagination Completed");
		}
		else
		{
			test.log(LogStatus.INFO, "Pagination not available");
			
			ut.InfoCaptureScreenshotAsBASE64();
		}
		
		
		if(PublishButton.isDisplayed())
		{
			test.log(LogStatus.PASS, "Publish Icon Available");
		}
		else
		{
			test.log(LogStatus.FAIL, "Publish Icon not available");
		}
	}
	
	
	public void VerifySaveConfirmationAlertMessage(String Str) throws Exception
	{
		Thread.sleep(3000);
		if(wait.until(ExpectedConditions.visibilityOf(ConfirmationAlertMsg())).getText().equalsIgnoreCase(Str+" Successfully"))
		{
			test.log(LogStatus.PASS, Str+" Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			
			Thread.sleep(2000);
			Click_CancelButton();
		}
		else if(ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.FAIL, "Validation Error(s) pop up displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
			
			Click_CancelButton();
		}
		else
		{
			test.log(LogStatus.FAIL, Str+" Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		try
		{
			if(CancelBtn.isDisplayed())
			{
				Click_CancelButton();
			}
		}
		catch(Exception k) {}
	}
	
	public void VerifySaveConfirmationAlertMessageForPublish(String Str) throws Exception
	{
		Thread.sleep(3000);
		if(wait.until(ExpectedConditions.visibilityOf(ConfirmationAlertMsg())).getText().equalsIgnoreCase(Str+" and Published Successfully"))
		{
			test.log(LogStatus.PASS, Str+" Successfully and Published successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(ConfirmationAlertMsg().getText().equalsIgnoreCase("Name already exist"))
		{
			test.log(LogStatus.PASS, "Name already exist pop up displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			
			
			Thread.sleep(2000);
			Click_BackspaceButton();
		}
		else if(ConfirmationAlertMsg().getText().equalsIgnoreCase("Validation Error(s)"))
		{
			test.log(LogStatus.FAIL, "Validation Error(s) pop up displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
			
			Click_BackspaceButton();
		}
		else
		{
			test.log(LogStatus.FAIL, Str+" Failed and Store data published Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public WebElement NewCreationScreenHeader()
	{
		return CreationScreenHeader;
	}
	
	public void SearchAndVerify_SearchBox() throws Exception
	{
		
		try
		{
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
		{
		String SearchText=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText().substring(0, 3);

		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchText);
		Thread.sleep(2000);
		
		
		
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Searched item displayed when entering 3 Characters in Search Box");
		}
		else
		{
			test.log(LogStatus.FAIL, "Searched item not displayed when entering 3 Characters in Search box");
		}
		}
		}
		catch(Exception k)
		{
			if(driver.findElement(By.xpath("//div[contains(@id,'cdk-drop-list')]/div[1]/div/data-grid-row/div/div[1]")).isDisplayed())
			{
				String SearchText=driver.findElement(By.xpath("//div[contains(@id,'cdk-drop-list')]/div[1]/div/data-grid-row/div/div[1]")).getText().substring(0, 3);

				Thread.sleep(1000);
				SearchBox.clear();
				Thread.sleep(2000);

				SearchBox.sendKeys(SearchText);
				Thread.sleep(2000);
				
				
				
				if(driver.findElement(By.xpath("//div[contains(@id,'cdk-drop-list')]/div[1]/div/data-grid-row/div/div[1]")).isDisplayed())
				{
					test.log(LogStatus.PASS, "Searched item displayed when entering 3 Characters in Search Box");
				}
				else
				{
					test.log(LogStatus.FAIL, "Searched item not displayed when entering 3 Characters in Search box");
				}
			}
		}
	}
	
	public void Verify_Search(String SearchValue) throws Exception
	{
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(8000);
		
		try
		{
		if(driver.findElement(By.xpath("//td[contains(.,'"+SearchValue+"')]")).isDisplayed())
		{
			test.log(LogStatus.WARNING, SearchValue+" is available");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		}
		catch(Exception k)
		{
			test.log(LogStatus.WARNING, SearchValue+" is not available");
			
			ut.InfoCaptureScreenshotAsBASE64();
		}
	}
	
	
	public void SearchAndVerify_SearchBoxTwo() throws Exception
	{
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
		{
		String SearchText=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText().substring(0, 3);

		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchText);
		Thread.sleep(2000);
		
		
		try
		{
		if(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Searched item displayed when entering 3 Characters in Search Box");
		}
		}
		catch(Exception l)
		{
			test.log(LogStatus.FAIL, "Searched item not displayed when entering 3 Characters in Search box");
			ut.FailedCaptureScreenshotAsBASE64();
		}
		}
		}
		catch(Exception l)
		{
			if(driver.findElement(By.xpath("//div[contains(@id,'cdk-drop-list')]/div[1]/div/data-grid-row/div/div[2]")).isDisplayed())
			{
			String SearchText=driver.findElement(By.xpath("//div[contains(@id,'cdk-drop-list')]/div[1]/div/data-grid-row/div/div[2]")).getText().substring(0, 3);

			Thread.sleep(1000);
			SearchBox.clear();
			Thread.sleep(2000);

			SearchBox.sendKeys(SearchText);
			Thread.sleep(2000);
			
			
			try
			{
			if(driver.findElement(By.xpath("//div[contains(@id,'cdk-drop-list')]/div[1]/div/data-grid-row/div/div[2]")).isDisplayed())
			{
				test.log(LogStatus.PASS, "Searched item displayed when entering 3 Characters in Search Box");
			}
			}
			catch(Exception o)
			{
				test.log(LogStatus.FAIL, "Searched item not displayed when entering 3 Characters in Search box");
				ut.FailedCaptureScreenshotAsBASE64();
			}
			}
		}
	}
	
	public void SearchAndClickEdit(String SearchValue) throws Exception
	{
		
		Wait_ForElementVisibility(SearchBox, 180);
	
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		
		Thread.sleep(2000);
		try
		{
//			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")), 50);
//		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[1]/button")).click();
//		
			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[contains(.,'"+SearchValue+"')]/../../td//div[1]/button")), 50);
			driver.findElement(By.xpath("//span[contains(.,'"+SearchValue+"')]/../../td//div[1]/button")).click();
			
		}
		catch(Exception g)
		{
			
//			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")), 40);
//			driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[1]/button")).click();
//			
			Wait_ForElementVisibility(driver.findElement(By.xpath("//span[.='"+SearchValue+"')]/../../div//div[1]/button")), 40);
			driver.findElement(By.xpath("//span[contains(.,'"+SearchValue+"')]/../../div//div[1]/button")).click();
		
		}
		
	}
	
	public void SearchAndClickDelete(String SearchValue) throws Exception
	{
		Wait_ForElementVisibility(SearchBox, 180);
		try
		{
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td//div[2]/button")).click();
		Thread.sleep(1000);
		}
		catch(Exception h)
		{
			Thread.sleep(1000);
			SearchBox.clear();
			Thread.sleep(2000);

			SearchBox.sendKeys(SearchValue);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../../div//div[2]/button")).click();
			Thread.sleep(1000);
		}
	}
	
	public void SearchAndClickDeleteCancel(String SearchValue) throws Exception
	{
		Wait_ForElementVisibility(SearchBox, 180);
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(2000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../../td[3]//div[1]/button")).click();

	
	}
	
	public void SearchAndClickActivate(String SearchValue) throws Exception
	{
//		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(300));
		Wait_ForElementVisibility(SearchBox, 180);
		Thread.sleep(1000);
		SearchBox.clear();
		Thread.sleep(1000);

		SearchBox.sendKeys(SearchValue);
		Thread.sleep(2000);
		
		try
		{
		driver.findElement(By.xpath("//span[.=' "+SearchValue+" ']/../..//button[@aria-label='Activate']")).click();
		}
		catch(Exception h)
		{
			
			
			try
			{
			driver.findElement(By.xpath("//span[.='"+SearchValue+" ']/../..//button[@aria-label='Activate']")).click();
			}
			catch(Exception l)
			{
				driver.findElement(By.xpath("//span[.='"+SearchValue+"']/../..//button[@aria-label='Activate']")).click();

			}
		}
		
		
		
		
	}

	
	public void Create_NewTax(String str) throws Exception
	{
		TaxesPage tx=new TaxesPage();
		New_TaxBtn.click();
		
		if(CreationScreenHeader.getText().equalsIgnoreCase("New Tax"))
		{
			test.log(LogStatus.PASS, "New Tax form loaded successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "New Tax form loaded Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		New_TaxNameInput.clear();
		
		New_TaxNameInput.sendKeys(str);
		
		
		tx.Select_TaxType_Percentage();
		
		tx.Enter_Percentage("2000");
		
		tx.Enable_InclusiveTax();
		
		tx.Enable_DefaultTax();
		
		Click_SaveButton();
		
		Thread.sleep(2000);
		if(ConfirmationAlertMsg().getText().equalsIgnoreCase("Tax Saved Successfully"))
		{
			test.log(LogStatus.PASS, "Tax Saved Successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "Tax Saved Failed");
		}
	}
	
	
	@FindBy(xpath = "//label[contains(.,'Priority')]/../../input")
	WebElement PriorityComn_InputBx;
	
	public void Enter_Priority(String str) throws Exception
	{
		Thread.sleep(1000);
		PriorityComn_InputBx.clear();
		Thread.sleep(1000);
		PriorityComn_InputBx.sendKeys(str);	
	}
	
	public WebElement Priority_Input()
	{
		return PriorityComn_InputBx;
	}
	
	@FindBy(xpath = "//label[contains(.,'Quantity')]/../../input")
	WebElement QuantityComn_InputBx;
	
	public void Enter_Quantity(String str) throws Exception
	{
		Thread.sleep(1000);
		QuantityComn_InputBx.clear();
		Thread.sleep(1000);
		QuantityComn_InputBx.sendKeys(str);	
	}
	
	public WebElement Quantity_Input()
	{
		return QuantityComn_InputBx;
	}
	
	@FindBy(xpath = "//label[contains(.,'Amount')]/../../input")
	public WebElement Amount_InputBx;
	
	@FindBy(xpath = "//label[contains(.,'Percentage')]/../../input")
	public WebElement Percentage_InputBx;
	
	
	public void Enter_Amount(String str) throws Exception
	{
		Thread.sleep(1000);
		Amount_InputBx.clear();
		Thread.sleep(1000);
		Amount_InputBx.sendKeys(str);	
	}
	
	public WebElement Amount_Input()
	{
		return Amount_InputBx;
	}
	
	public void Enter_Percentage(String str) throws Exception
	{
		Thread.sleep(1000);
		Percentage_InputBx.clear();
		Thread.sleep(1000);
		Percentage_InputBx.sendKeys(str);	
	}
	
	public WebElement Percentage_Input()
	{
		return Percentage_InputBx;
	}
	
	
	public void Cursor_MoveToElement(WebElement ele) throws Exception
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(2000);
//		 js.executeScript("window.scrollBy(0, -500);");
//		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
		
	}
	
	public void Click_Wait_ForElementClickable(WebElement ele,int time)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}
	
	public void Wait_ForElementVisibility(WebElement ele,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	@FindBy(xpath = "//div[.=' Enter valid amount ']")
	WebElement Amount_Err;

	@FindBy(xpath = "//mat-hint[.='Percentage should be between (0-100)']")
	WebElement per_Err;

	public WebElement Amount_Error_Msg()
	{
		return Amount_Err;
	}
	
	public WebElement Percentage_Error_Msg()
	{
		return per_Err;
	}
	
	
	public void Verify_Enter_Excess_Limit_Name(WebElement Element) throws Exception
	{
		Thread.sleep(1000);
		Element.clear();
		
		Thread.sleep(1000);
		String NameExcess = "Entering Invalid Name to input"; 
		int ActualSize= NameExcess.length();
		System.out.println(ActualSize);

		//Enter the Modifier Name
		Element.sendKeys(NameExcess);
		
		//To get value
		String ActualName=Element.getAttribute("value");
		int EnteredSize= ActualName.length();
		System.out.println(EnteredSize);
		
		

		if(ActualSize!=EnteredSize)
		{
			test.log(LogStatus.PASS, "Name should not be Exceeded 25 Characters");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Name should exceeded the size");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		ut.PassedCaptureScreenshotAsBASE64();
		
		Thread.sleep(1000);
		Element.clear();
	
	}
	
	public void Verify_Enter_Excess_Limit_Name(WebElement Element, int Size) throws Exception
	{
		Thread.sleep(1000);
		Element.clear();
		
		Thread.sleep(1000);
		String NameExcess = "Entering Invalid Name to input"; 
		int ActualSize= NameExcess.length();
		System.out.println(ActualSize);

		//Enter the Modifier Name
		Element.sendKeys(NameExcess);
		
		//To get value
		String ActualName=Element.getAttribute("value");
		int EnteredSize= ActualName.length();
		System.out.println(EnteredSize);

		if(EnteredSize==Size)
		{
			test.log(LogStatus.PASS, "Name should not be Exceeded "+Size+" Characters");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Name should exceeded the size of "+Size+"");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Thread.sleep(1000);
		Element.clear();
	
	}
	
	public void Verify_Enter_Excess_Limit_InputBox(WebElement Element, String Inputs, int Size) throws Exception
	{
		
		Thread.sleep(1000);
		Element.clear();
		
		Thread.sleep(1000);
//		String NameExcess = "Entering Invalid Name to input"; 
		int ActualSize= Inputs.length();
		System.out.println(ActualSize);

		//Enter the Modifier Name
		Element.sendKeys(Inputs);
		
		//To get value
		String ActualName=Element.getAttribute("value");
		int EnteredSize= ActualName.length();
		System.out.println(EnteredSize);

		if(EnteredSize==Size)
		{
			test.log(LogStatus.PASS, "Name should not be Exceeded "+Size+" Characters");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Name should exceeded the size of "+Size+"");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		Thread.sleep(1000);
		Element.clear();
		
	
	}
	
	public void Ascending_And_Descending_Order() 
	{
		List<WebElement> col = driver.findElements(By.xpath("//data-grid-row/div/div/div/span[@class='header-title']"));
		
		for(int i = 1; i <= col.size(); i++) {
			
			
			//double click the required row for descending order
			driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).click();
			
			ArrayList<String> ArLst=new ArrayList<String>();
			
			if(driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/div[contains(@class,'mode-asc')]")).isDisplayed())
			{
				List<WebElement> Lst=driver.findElements(By.xpath("//div[contains(@id,'cdk-drop-list')]/div/div/data-grid-row/div/div["+i+"]"));
				
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
					test.log(LogStatus.PASS, "Ascending Order Sorted Correctly for "+driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).getText());
					
					ut.PassedCaptureScreenshotAsBASE64();
					System.out.println("Sorted List from Table(Actual - Ascending) : "+ArLst);
					System.out.println("Sorted List from Table(Expected - Ascending) : "+sortedLst);
				}
				else
				{
					test.log(LogStatus.FAIL, "Ascending Order Sorted Incorrect for "+driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).getText());
					
					ut.FailedCaptureScreenshotAsBASE64();
					
					System.out.println("Sorted List from Table(Actual - Ascending) : "+ArLst);
					System.out.println("Sorted List from Table(Expected - Ascending) : "+sortedLst);
				}
			}
		}
		
		for(int i = 1; i <= col.size(); i++) {
			
			
			//click the required row for descending order
			driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).click();
			//driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).click();
			
			ArrayList<String> ArLst=new ArrayList<String>();
			
			if(driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/div[contains(@class,'mode-desc')]")).isDisplayed())
			{
				List<WebElement> Lst=driver.findElements(By.xpath("//div[contains(@id,'cdk-drop-list')]/div/div/data-grid-row/div/div["+i+"]"));
				
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
				Collections.reverse(sortedLst);
				//System.out.println(sortedLst);
				
				if(sortedLst.equals(ArLst))
				{
					test.log(LogStatus.PASS, "Desending Order Sorted Correctly for "+driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).getText());
					
					ut.PassedCaptureScreenshotAsBASE64();
					
					System.out.println("Sorted List from Table(Actual - Descending) : "+ArLst);
					System.out.println("Sorted List from Table(Expected - Descending) : "+sortedLst);
				}
				else
				{
					test.log(LogStatus.FAIL, "Desending Order Sorted Incorrect for "+driver.findElement(By.xpath("//data-grid-row/div/div["+i+"]/div/span[@class='header-title']")).getText());
					
					ut.FailedCaptureScreenshotAsBASE64();
					
					System.out.println("Sorted List from Table(Actual - Descending) : "+ArLst);
					System.out.println("Sorted List from Table(Expected - Descending) : "+sortedLst);
				}
			}
		}
	}
	
	
	@FindBy(xpath = "//cdk-virtual-scroll-viewport//div/div[1]//select-option")
	public WebElement First_Option_inDropDown;
	

	public void Click_Button(WebElement ele, String msg) throws Exception
	{
		Thread.sleep(2000);
//		ele.click();
//	Click_Wait_ForElementClickable(ele, 30);
//		Thread.sleep(2000);
		ele.click();
		System.out.println(msg);
	}
	
	public void Click_DropDown(WebElement ele, String Msg) throws Exception
	{
		Thread.sleep(1000);
		ele.click();
		
		Thread.sleep(2000);
		List<WebElement> optList=driver.findElements(By.xpath("//select-option"));
 
		int optionSize=optList.size();
		if(optionSize==0)
		{
			
			List<WebElement> optList1=driver.findElements(By.xpath("//select-option"));
			
			int optionSize1=optList1.size();
			
			
			int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("(//select-option)["+randomOpt+"]")).click();
		
		}
		else if(optionSize==1)
		{
			driver.findElement(By.xpath("(//select-option)["+optionSize+"]")).click();
		
		}
		else if(optionSize<=10)
		{
			
		int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize);
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//select-option)["+randomOpt+"]")).click();
		}
		else
		{
			int randomOpt=ThreadLocalRandom.current().nextInt(1, 10);
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("(//select-option)["+randomOpt+"]")).click();
			
		}
		
		List<WebElement> ModifyWithList1=driver.findElements(By.xpath("//select-option"));

		if(ModifyWithList1.size()!=0)
		{
			ele.click();
			
		}
		
		System.out.println(Msg);
	}
	
	public void Click_DropDown_withSelection(WebElement ele, String Option, String Msg) throws Exception
	{
		Thread.sleep(1000);
		ele.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select-option[contains(.,'"+Option+"')]")).click();
				
		System.out.println(Msg);
	}
	
	public void Click_DropDown_withSearch_Selection(WebElement ele, String Option, String Msg) throws Exception
	{
		Thread.sleep(1000);
		ele.click();
		
		SearchBox_DropDown.clear();
		SearchBox_DropDown.sendKeys(Option);
		
		First_Option_inDropDown.click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select-option[contains(.,'"+Option+"')]")).click();
				
		System.out.println(Msg);
	}
	
	public void Click_DropDown_withSearch(WebElement ele, String Msg) throws Exception
	{
		
//		Thread.sleep(1000);
//		cmp.Cursor_MoveToElement(DepartmentDropBtn);
//		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
//		Thread.sleep(1000);
		
		Thread.sleep(2000);
		Click_Wait_ForElementClickable(ele, 120);
//		ele.click();
	
		Thread.sleep(1000);

		List<WebElement> optList=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
 
		int optionSize=optList.size();
		
		System.out.println("Options Size "+optionSize);
		if(optionSize==0)
		{
			
			List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
			
			int optionSize1=optList1.size();
			
			
			int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
			
			Thread.sleep(1000);

//			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//	Search(driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText());

			String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
//			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//			Search(opt);
			SearchBox_DropDown.clear();
			SearchBox_DropDown.sendKeys(opt);
			
			First_Option_inDropDown.click();
		}
		else //if(optionSize<=10)
		{
			
		int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize);
		
		Thread.sleep(1000);

//		driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//		Search(driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText());

		String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
//		driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//		Search(opt);
		Thread.sleep(1000);
		SearchBox_DropDown.clear();
		SearchBox_DropDown.sendKeys(opt);
		
		Thread.sleep(2000);
		First_Option_inDropDown.click();
		
		}
//		else if(optionSize==1)
//		{
//			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+optionSize+"]//select-option")).click();
//		
//		}
//		else
//		{
//			int randomOpt=ThreadLocalRandom.current().nextInt(1, 5);
//			
//			Thread.sleep(1000);
//
////			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
////			Search(driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText());
//			
//
//			String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
////			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//			SearchBox_DropDown.clear();
//			Thread.sleep(1000);
//			SearchBox_DropDown.sendKeys(opt);
//			
//			First_Option_inDropDown.click();
//		}
//		
		List<WebElement> ModifyWithList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));

		if(ModifyWithList1.size()!=0)
		{
			ele.click();
			
		}
		
		System.out.println(Msg);
	}
	
	public void Click_DropDown_withSearchText(WebElement ele, String Option, String Msg) throws Exception
	{
		Thread.sleep(2000);
		ele.click();
		
		Thread.sleep(1000);

		List<WebElement> optList=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
 
		int optionSize=optList.size();
		
		System.out.println("Options Size "+optionSize);
		if(optionSize==0)
		{
			
			List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
			
			int optionSize1=optList1.size();
			
			
			int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
			
			Thread.sleep(1000);

//			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//	Search(driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText());

//			String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
//			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//			Search(opt);
			SearchBox_DropDown.clear();
			SearchBox_DropDown.sendKeys(Option);
			
			First_Option_inDropDown.click();
		}
		else //if(optionSize<=10)
		{
			
		int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize);
		
		Thread.sleep(1000);

//		driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//		Search(driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText());

//		String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
//		driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//		Search(opt);
		Thread.sleep(1000);
		SearchBox_DropDown.clear();
		SearchBox_DropDown.sendKeys(Option);
		
		Thread.sleep(2000);
		First_Option_inDropDown.click();
		
		}
//		else if(optionSize==1)
//		{
//			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+optionSize+"]//select-option")).click();
//		
//		}
//		else
//		{
//			int randomOpt=ThreadLocalRandom.current().nextInt(1, 5);
//			
//			Thread.sleep(1000);
//
////			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
////			Search(driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText());
//			
//
//			String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
////			driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).click();
//			SearchBox_DropDown.clear();
//			Thread.sleep(1000);
//			SearchBox_DropDown.sendKeys(opt);
//			
//			First_Option_inDropDown.click();
//		}
//		
		List<WebElement> ModifyWithList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));

		if(ModifyWithList1.size()!=0)
		{
			ele.click();
			
		}
		
		System.out.println(Msg);
	}
	
	public void Enter_Text(WebElement ele,String Text, String Msg) throws Exception
	{
		Thread.sleep(1000);
		ele.clear();
		Thread.sleep(1000);
		ele.sendKeys(Text);
		
		System.out.println(Msg);
	}
	
	public void Enable_Toggle(WebElement Toggle, String Message)
	{
		if(Toggle.isSelected())
		{
			
		}
		else
		{
			Toggle.click();
		}
	}
	
	
	public void Disable_Toggle(WebElement Toggle1, WebElement Toggle2, String Msg)
	{
		if(Toggle1.isEnabled())
		{
			Toggle2.click();
		}
		else
		{

		}
	}
	
	
	////////// Select the Store in Auto-Select which is in the Header of the Page  /////
	@FindBy(xpath = "//div[contains(@class,'auto store-select')]")
	WebElement Auto_SelectOption;
	
	@FindBy(xpath = "//div[contains(@class,'auto store-select')]//input[@data-placeholder='Search']")
	WebElement Search_inAutoSelect;
	
	@FindBy(xpath = "//div[contains(@class,'stores')]//div[contains(@class,'store-name')]")
	WebElement Store_Name_inAutoSearch;
	
	public void Select_Store_in_AutoSelect(String StoreName) throws Exception
	{
		Thread.sleep(2000);
		Auto_SelectOption.click();
		
		Thread.sleep(2000);
		Search_inAutoSelect.clear();
		Thread.sleep(1000);
		Search_inAutoSelect.sendKeys(StoreName);
		
		Thread.sleep(1000);
		Store_Name_inAutoSearch.click();
	}
	
	public WebElement Error_BelowInputBox()
	{
		return Error_BelowInputBx;
	}
	
	
	public void Filter_Columns_Table() throws Exception
	{
		Thread.sleep(1000);
		Columns_Btn.click();
		
		//Deselect Select All
		driver.findElement(By.xpath("//option-panel/div/div/select-option")).click();
		Thread.sleep(500);
		
		Thread.sleep(1000);
		List<WebElement> FilterList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		for(int i=1;i<=FilterList.size();i++)
		{
			String sr = driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+i+"]/select-option")).getText();
			
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+i+"]/select-option")).click();
			
			if(driver.findElement(By.xpath("//thead/tr/th/div/div[1]")).getText().trim().equalsIgnoreCase(sr))
			{
				test.log(LogStatus.PASS, sr+ " Filtered Successfully");
				
				//ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, sr+ " Filter Unsuccessful. Wrongly filtered as "+driver.findElement(By.xpath("//thead/tr/th/div/div[1]")).getText());
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+i+"]/select-option")).click();
		}

		driver.findElement(By.xpath("//div[@class='options with-height']/select-option")).click();

		Thread.sleep(2000);
		Columns_Btn.click();
		
		try
		{
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("//div[@class='options with-height']/select-option")).isDisplayed())
			{
				Columns_Btn.click();
			}
		}
		catch(Exception l) {}
	}
	
	public void Filter_Columns_Table1() throws Exception
	{
		Thread.sleep(1000);
		Columns_Btn.click();
		
		//Deselect Select All
		driver.findElement(By.xpath("//option-panel/div/div/select-option")).click();
		Thread.sleep(500);
		
		Thread.sleep(1000);
		List<WebElement> FilterList=driver.findElements(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div/select-option"));
		
		for(int i=1;i<=FilterList.size();i++)
		{
			String sr = driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+i+"]/select-option")).getText();
			
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+i+"]/select-option")).click();
			
			if(driver.findElement(By.xpath("//thead/tr[1]/th/div/span")).getText().trim().equalsIgnoreCase(sr))
			{
				test.log(LogStatus.PASS, sr+ " Filtered Successfully");
				
				//ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, sr+ " Filter Unsuccessful. Wrongly filtered as "+driver.findElement(By.xpath("//thead/tr/th/div/div[1]")).getText());
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
			driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div["+i+"]/select-option")).click();
		}

		driver.findElement(By.xpath("//div[@class='options with-height']/select-option")).click();

		Thread.sleep(2000);
		Columns_Btn.click();
		
		try
		{
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("//div[@class='options with-height']/select-option")).isDisplayed())
			{
				Columns_Btn.click();
			}
		}
		catch(Exception l) {}
	}
	
	public String Random_NumGenerator(int DigitCount)
	{
	
		String RandomText=RandomStringUtils.randomNumeric(DigitCount);

		return RandomText;
		
	}
	
	
	public String Random_AlphaNumGenerator(int DigitCount)
	{
	
		String RandomText=RandomStringUtils.randomAlphanumeric(DigitCount);

		return RandomText;
		
	}
	
	public String Random_AlphabeticGenerator(int DigitCount)
	{
	
		String RandomText=RandomStringUtils.randomAlphabetic(DigitCount);

		return RandomText;
		
	}
	

	@FindBy(xpath = "//button[contains(.,'UPDATE AND PUBLISH')][@disabled='true']")
	WebElement UpdateAndPublish_Btn_disable;
	
	public WebElement UpdateAndPublish_Btn_disable()
	{
		return UpdateAndPublish_Btn_disable;
	}
	
	@FindBy(xpath = "//div[@id='titlediv']/p")
	WebElement Chat_Box_Popup;
	
	@FindBy(xpath = "//div/em[@class='siqico-close']")
	WebElement Close_Online_ChatBtn;
	
	public void Close_Online_Help_ChatBox() throws Exception
	{
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		ac.moveToElement(Chat_Box_Popup).build().perform();
		
		try
		{
			Thread.sleep(2000);
		if(Chat_Box_Popup.getText().equalsIgnoreCase("How may I help you today?"))
		{
			Thread.sleep(2000);
			Close_Online_ChatBtn.click();
		}
		}
		catch(Exception k)
		{
			System.out.println("Online Chat Box not displayed");
		}
	}
	
	public void Verify_Close_Cancel_CreationScreen(String ScreenName) throws Exception
	{
		Thread.sleep(1000);
		//Check whether the New Department Creation form Closed or not
		if(!NewCreationScreenHeader().isDisplayed())
		{
			test.log(LogStatus.PASS, ScreenName+" screen Closed");
		}
		else
		{
			test.log(LogStatus.FAIL, ScreenName+" screen not Closed");
		}
		
	}
	
	public void Check_Button_Disabled(WebElement ele, String Msg) throws Exception
	{
		Thread.sleep(1000);
	    if(ele.isEnabled())
	    {
	    	test.log(LogStatus.FAIL, Msg+" is Enabled");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    }
	    else
	    {
	    	test.log(LogStatus.PASS, Msg+" is Disabled");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(false, ele.isEnabled());
	    }
	}
	
	public void Check_Button_Enabled(WebElement ele, String Msg) throws Exception
	{
		if(ele.isSelected())
	    {
	    	test.log(LogStatus.PASS, Msg+" is Enabled");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(true, ele.isSelected());
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, Msg+" is Disabled");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    	
	    	
	    }
	}
	
	public void Check_Toggle_Disabled(WebElement ele, String Msg) throws Exception
	{
		Thread.sleep(1000);
	    if(ele.isSelected())
	    {
	    	test.log(LogStatus.FAIL, Msg+" is Enabled");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    }
	    else
	    {
	    	test.log(LogStatus.PASS, Msg+" is Disabled");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(false, ele.isSelected());
	    }
	}
	
	public void Check_Toggle_Enabled(WebElement ele, String Msg) throws Exception
	{
		if(ele.isSelected())
	    {
	    	test.log(LogStatus.PASS, Msg+" is Enabled");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(true, ele.isEnabled());
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, Msg+" is Disabled");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    	
	    	
	    }
	}
	
	public void Check_Element_or_Text_Not_Displayed(WebElement ele, String Msg) throws Exception
	{
		Thread.sleep(1000);
		try
		{
	    if(ele.isDisplayed())
	    {
	    	test.log(LogStatus.FAIL, Msg+" is Displayed");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    }
		}
		catch(Exception k)
	    {
	    	test.log(LogStatus.PASS, Msg+" is Not Displayed");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(false, ele.isDisplayed());
	    }
	}
	
	public void Check_Element_or_Text_Displayed(WebElement ele, String Msg) throws Exception
	{
		if(ele.isDisplayed())
	    {
	    	test.log(LogStatus.PASS, Msg+" is Displayed");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(true, ele.isDisplayed());
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, Msg+" is not Displayed");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    	Assert.assertEquals(false, ele.isDisplayed());
	    	
	    }
	}
	
	public void Check_Element_or_Text_in_Confirmation_Displayed(WebElement ele, String Msg) throws Exception
	{
		if(ele.getText().equalsIgnoreCase(Msg))
	    {
	    	test.log(LogStatus.PASS, Msg+" is Displayed");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    	
//	    	Assert.assertEquals(true, ele.getText(),Msg);
	    	
	    	Assert.assertEquals(ele.getText(), Msg);
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, Msg+" is not Displayed");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    	
	    	
	    }
	}
	
//	public void Verify_Duplicate_Save_or_Update_Confirmation(String )
	
	
	public void Verify_Search_DropDown_InputSearchBox(WebElement ele, String Msg) throws Exception
	{
	
		
		Thread.sleep(1000);
		ele.click();
		
		Thread.sleep(1000);

		List<WebElement> optList=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
 
		int optionSize=optList.size();
		
//		int optionSize1=optionSize.size();
		
		
		int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize);
		
		System.out.println("Options Size "+optionSize);
		
//		String Option=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option["+randomOpt+"]")).getText();
		String Option=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option[1]")).getText();

		ele.sendKeys(Option);
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//select-option[contains(.,'"+Option+"')]")).isDisplayed())
		{
			test.log(LogStatus.PASS, Msg+" is Searched and Available");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, Msg+" is not Searched and Not Available");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	public void Assertion_Validation_True_Element_Displayed(WebElement ele)
	{
		Assert.assertEquals(true, ele.isDisplayed());
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Assertion_Validation_False_Element_Not_Displayed(WebElement ele)
	{
		Assert.assertEquals(false, ele.isDisplayed());
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Assertion_Validation_True_Element_Selected(WebElement ele)
	{
		if(ele.isSelected())
		{
		Assert.assertEquals(true, ele.isSelected());
		
		ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(!ele.isSelected())
		{
			Assert.assertEquals(false, ele.isSelected());
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Assertion_Validation_False_Element_Not_Selected(WebElement ele)
	{
		if(!ele.isSelected())
		{
		Assert.assertEquals(false, ele.isSelected());
		
		ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(ele.isSelected())
		{
			Assert.assertEquals(true, ele.isSelected());
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Assertion_Validation_True_Element_Enabled(WebElement ele)
	{
		if(ele.isEnabled())
		{
		Assert.assertEquals(true, ele.isEnabled());
		
		ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(!ele.isEnabled())
		{
			Assert.assertEquals(false, ele.isEnabled());
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void Assertion_Validation_False_Element_Disabled(WebElement ele)
	{
		if(!ele.isEnabled())
		{
		Assert.assertEquals(false, ele.isEnabled());
		
		ut.PassedCaptureScreenshotAsBASE64();
		}
		else if(ele.isEnabled())
		{
			Assert.assertEquals(true, ele.isEnabled());
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	
	public void Assertion_Validation_Two_Values(String Actual, String Expected, String Msg)
	{
		Assert.assertEquals(Actual, Expected, Msg);
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Assertion_Validation_Two_ListValues(List<String> Actual, List<String> Expected, String Msg)
	{
		Assert.assertEquals(Actual, Expected, Msg);
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Assertion_Validation_Two_Values_NotEqual(String Actual, String Expected, String Msg)
	{
		Assert.assertNotEquals(Actual, Expected, Msg);
		
		ut.PassedCaptureScreenshotAsBASE64();
	}
	
	public void Verify_Rows_Per_Page() throws Exception
	{
		Thread.sleep(2000);
		Rows_Per_Page.click();
		
		List<WebElement> RowsPerPage_OptionList=driver.findElements(By.xpath("//mat-option"));
		int Rows_PerPage_OptionSize=RowsPerPage_OptionList.size();
//		Rows_Per_Page.click();
		driver.findElement(By.xpath("//mat-option[1]")).click();
		
		
		for(int i=1;i<=Rows_PerPage_OptionSize;i++)
		{
			Thread.sleep(2000);
			Rows_Per_Page.click();
			
			
			driver.findElement(By.xpath("//mat-option["+i+"]")).click();
			
		String Selected_Rows_perPage=Rows_Per_Page.getText();//.trim();
		
		System.out.println("Rows Per Page Selected Option is : "+Selected_Rows_perPage);
		
		int RowsPerPageSize=Integer.parseInt(Selected_Rows_perPage);
		
		
		Thread.sleep(5000);
		List<WebElement> rowsList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		int RowsSize=rowsList.size();
		
		Assert.assertEquals(RowsPerPageSize, RowsSize, "Rows Per Page is Validated");
		}
	}
	
//	public void Enter_Text(WebElement ele, String Text) throws Exception
//	{
//		Thread.sleep(1000);
//		ele.clear();
//		Thread.sleep(1000);
//		ele.sendKeys(Text);
//	}
	
	@FindBy(xpath = "//button[contains(.,'Discount Rate')][contains(@class,'segment-button')]")
	public WebElement Discount_Rate_Tab_inContents;
	
	public void Click_DropDown_withSearch_MultipleSelection(WebElement ele, String Msg) throws Exception
	{
	    Thread.sleep(2000);
	    Click_Wait_ForElementClickable(ele, 120);
	    Thread.sleep(500);

	    Thread.sleep(500);
	    List<WebElement> optList=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
	    int optionSize=optList.size();
	    System.out.println("Options Size "+optionSize);
	    if(optionSize==0)
	    {
	       List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
	       int optionSize1=optList1.size();
	       for (int i =1; i<=3; i++) {
	          int randomOpt = ThreadLocalRandom.current().nextInt(1, optionSize1);
	          Thread.sleep(1000);
	          String opt = driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
	          SearchBox_DropDown.clear();
	          SearchBox_DropDown.sendKeys(opt);
	          First_Option_inDropDown.click();
	       }
	    }
	    else
	    {
	       for (int i =1; i<=3; i++) {
	          int randomOpt = ThreadLocalRandom.current().nextInt(1, optionSize);
	          Thread.sleep(1000);
	          String opt = driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div[" + randomOpt + "]//select-option")).getText();
	          Thread.sleep(2000);
	          First_Option_inDropDown.click();
	       }
	    }
	    List<WebElement> ModifyWithList1=driver.findElements(By.xpath("//div[@class='option-list']/div/select-option"));
	    if(ModifyWithList1.size()!=0)
	    {
	       ele.click();
	    }
	    System.out.println(Msg);
	}
	


    // Example method for waiting for page to load
    public void waitForPageToLoad() {
        
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
    }

    public void scrollpageup() {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0, -250)"); // Scroll up by 250 pixels
    }
    
    public void scrollpagedown() {
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)"); // Scroll down by 250 pixels
   }
    @FindBy(xpath = "//button[.='SAVE'][@disabled='true']")
    public WebElement SaveBtnDisabled;

    @FindBy(xpath = "//button[.='SAVE'][@disabled='false']")
    public WebElement SaveBtnEnabled;
    
    public WebElement Save_Button_disabled()
    {
    	return SaveBtnDisabled;
    }

    
    public void Check_Save_Button_Diabled() throws Exception
    {

    	 if(Save_Button_disabled().isEnabled())
    	    {
    		 
    		 
    	    	test.log(LogStatus.FAIL, "Save button is Enabled");
    	    	
    	    	ut.FailedCaptureScreenshotAsBASE64();
    	    }
    	    else
    	    {
    	    	test.log(LogStatus.PASS, "Save button is Disabled");
    	    	
    	    	ut.PassedCaptureScreenshotAsBASE64();
    	    	
    	    	Assert.assertEquals(false, Save_Button_disabled().isEnabled());}
    	    }
    public WebElement Save_Button_Enabled()
    {
    	return SaveBtnEnabled;
    }

    public void Check_Save_Button_Enabled() throws Exception
    {

    	 if(Save_Button_Enabled().isEnabled())
    	    {
    		 
    		 
    	    	test.log(LogStatus.PASS, "Save button is Enabled");
    	    	ut.PassedCaptureScreenshotAsBASE64();
    	    	Assert.assertEquals(false, Save_Button_Enabled().isEnabled());
    	    	
    	    }
    	    else
    	    {
    	    	test.log(LogStatus.FAIL, "Save button is Disabled");
    	    	ut.FailedCaptureScreenshotAsBASE64();
    	    	
    	    	}
    	    }
    	
    	

    public void safeClick(WebDriver driver, WebElement element) throws InterruptedException {
        int attempts = 0;
        while (attempts < 2) {
            try {
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                // Catch and ignore StaleElementReferenceException
            } catch (org.openqa.selenium.WebDriverException e) {
                // Catch and ignore any WebDriverException
            }
            Thread.sleep(1000); // Wait for 1 second before retrying
            attempts++;
        }
    }

    @FindBy(xpath = "//button[contains(.,'Tax')][contains(@name,'retailItemAddTax')]")
    public WebElement AddTax_Tab_RetailItem; 

    public void Click_AddTax_RetailItem() throws Exception
    {
    	Thread.sleep(1000);
    	AddTax_Tab_RetailItem.click();
    	}


    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement Click_SaveTax_RetailItem; 

    public WebElement IClick_SaveTax_RetailItem() {
    return Click_SaveTax_RetailItem;
    }

    public void IClickTaxSavebutton_Retailitem() throws Exception
    {
    	Thread.sleep(1000);
    	Cursor_MoveToElement(IClick_SaveTax_RetailItem());
    	Click_SaveTax_RetailItem.click();
    }


    @FindBy(xpath = "//button[.='UPDATE'][@disabled='true']")
    public WebElement UpdateBtnDisabled;

    public WebElement Update_Button_disabled()
    {
    	return UpdateBtnDisabled;
    }

    public void Check_Update_Button_Diabled() throws Exception
    {

    	 if(Update_Button_disabled().isEnabled())
    	    {
    		 
    		 
    	    	test.log(LogStatus.FAIL, "Save button is Enabled");
    	    	
    	    	ut.FailedCaptureScreenshotAsBASE64();
    	    }
    	    else
    	    {
    	    	test.log(LogStatus.PASS, "Save button is Disabled");
    	    	
    	    	ut.PassedCaptureScreenshotAsBASE64();
    	    	
    	    	Assert.assertEquals(false, Update_Button_disabled().isEnabled());}
    	    }


    @FindBy(xpath = "//*[@id=\"ngForm\"]//button[contains(.,'SAVE & NEXT')]")
    public WebElement Click_SAVEandNEXT_Button;

    public void iClickTheSaveNextButton() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	Click_SAVEandNEXT_Button.click();
    }


    @FindBy(xpath="//p[contains(text(),'Please Save Retail Item Before Moving To Child Item')]")
    public WebElement SAVENEXTAlertMessageTitle;

    public WebElement SAVENEXTConfirmationAlertMsg()
    {
    	return SAVENEXTAlertMessageTitle;
    }


    @FindBy(xpath="//button[contains(.,'Cancel')]")
    public WebElement ClickCancelBtn_SAVENEXTConfirmationAlertMsg;

    public WebElement ClickCancelBtn_SAVENEXTConfirmationAlertMsg()
    {
    	return ClickCancelBtn_SAVENEXTConfirmationAlertMsg;
    }


    @FindBy(xpath="//alert-dialog[1]/div[1]/div[3]/div[1]/div[2]/button[1]/span[1]")
    public WebElement ClickSaveBtn_SAVENEXTConfirmationAlertMsg;

    public WebElement IClickSaveBtn_SAVENEXTConfirmationAlertMsg()
    {
    	return ClickSaveBtn_SAVENEXTConfirmationAlertMsg;
    }

    public void IClick_SaveBtn_SAVENEXTConfirmationAlertMsg() {
    	wait.until(ExpectedConditions.elementToBeClickable(IClickSaveBtn_SAVENEXTConfirmationAlertMsg()));
    	
    	IClickSaveBtn_SAVENEXTConfirmationAlertMsg().click();
    }

    public void VerifySaveNextConfirmationAlertMessage(String Str) throws Exception
    {
    	//Thread.sleep(3000);
    	if(wait.until(ExpectedConditions.visibilityOf(SAVENEXTConfirmationAlertMsg())).getText().equalsIgnoreCase(Str+" displayed"))
    	{
    		test.log(LogStatus.PASS, Str+"displayed");
    		ut.PassedCaptureScreenshotAsBASE64();
    		}
    	else
    	{
    	}

    	}

    public void IClickCancelBtn_SAVENEXTConfirmationAlertMsg() throws Exception {
    	
    	cmp=new Common_XPaths();
    	Thread.sleep(1000);
    	cmp.Click_Wait_ForElementClickable(ClickCancelBtn_SAVENEXTConfirmationAlertMsg, 60);
    	//Thread.sleep(1000);
    	
    	//Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    	wait.until(ExpectedConditions.elementToBeClickable(ClickCancelBtn_SAVENEXTConfirmationAlertMsg));
    	
    	ClickCancelBtn_SAVENEXTConfirmationAlertMsg.click();
    }


    @FindBy(xpath = "//*[@id=\"new-retail\"]//div[2]/button[contains(.,'NEXT')]/span[1]")
    public WebElement Click_NEXT_Button;

    public WebElement I_clickNext_Button() {
    	return Click_NEXT_Button;
    }

    public void iClickTheNextButton() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.elementToBeClickable(I_clickNext_Button()));
    	Click_NEXT_Button.click();
    }

//    public void Click_UpdateButton()
//    {
//    	if(UpdateBtn.isEnabled()) {
//    	UpdateBtn.click();
//    	}
//    	
//    	else {
//    		
//    		
//    	}
//    	
//    }


        // Example method for waiting for page to load
//        public void waitForPageToLoad() {
//            
//            wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
//        }
//
//        public void scrollpageup() {
//        	 JavascriptExecutor js = (JavascriptExecutor) driver;
//             js.executeScript("window.scrollBy(0, -250)"); // Scroll up by 250 pixels
//        }
//        
//        public void scrollpagedown() {
//       	 JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0, 250)"); // Scroll down by 250 pixels
//       }
      
    	public void Select_CheckBox(WebElement ele1, WebElement ele2) throws Exception
    	{
    		Thread.sleep(500);
//    		if(ele.isSelected())
//    		{
//    			
//    		}
//    		else
//    		{
//    			Thread.sleep(500);
//    			ele.click();
//    		}
    		
    		Thread.sleep(500);
//    		String isChecked=ele.findElement(By.tagName("input")).getAttribute("checked");
//    		if(isChecked=="true")
//    		try
//    		{
    		if(ele2.isSelected())
    		{
    			
    		}
//    		}
//    		catch(Exception k)
    		{
    			Thread.sleep(500);
    			ele2.click();
    		}
    	}
    	
    	public void Deselect_CheckBox(WebElement ele1, WebElement ele2) throws Exception
    	{
    		
    		Thread.sleep(500);
//    		String isChecked=ele.findElement(By.tagName("input")).getAttribute("checked");
//    		if(isChecked=="true")
    		try
    		{
    		if(ele1.isDisplayed())
    		{
    			Thread.sleep(500);
    			ele2.click();
    		}
    		}
    		catch(Exception k)
    		{
    			
    		}
    	}
    	
//    	@FindBy(xpath = "//button[.='SAVE'][@disabled='true']")
//    	public WebElement SaveBtnDisabled;
//    	 
//    	@FindBy(xpath = "//button[.='SAVE'][@disabled='false']")
//    	public WebElement SaveBtnEnabled;
    	 
    	@FindBy(xpath="//button[.='SAVE & ADD'][@disabled='true']")
    	public WebElement Save_ADD_BtnDisabled;
    	 
    	@FindBy(xpath = "//button[.='SAVE & ADD']")
    	public WebElement Save_ADD_BtnEnabled;
    	 
    	 
//    	public WebElement Save_Button_disabled()
//    	{
//    		return SaveBtnDisabled;
//    	}
    	 
    	public WebElement Save_ADD_Btn_Disabled()
    	{
    		return Save_ADD_BtnDisabled;
    	}
    	 
    	public WebElement Save_ADD_Btn_Enabled()
    	{
    		return Save_ADD_BtnEnabled;
    	}
    	 
    	 
//    	public WebElement Save_Button_Enabled()
//    	{
//    		return SaveBtnEnabled;
//    	}
    	 
//    	public void Check_Save_Button_Diabled() throws Exception
//    	{
//    	 
//    		 if(Save_Button_disabled().isEnabled())
//    		    {
//    			
//    			
//    		    	test.log(LogStatus.FAIL, "Save button is Enabled");
//    		    	
//    		    	ut.FailedCaptureScreenshotAsBASE64();
//    		    }
//    		    else
//    		    {
//    		    	test.log(LogStatus.PASS, "Save button is Disabled");
//    		    	
//    		    	ut.PassedCaptureScreenshotAsBASE64();
//    		    	
//    		    	Assert.assertEquals(false, Save_Button_disabled().isEnabled());}
//    		    }
    	 
    	public void Check_Save_ADD_Button_Diabled() throws Exception
    	{
    	 
    		 if(Save_ADD_Btn_Disabled().isEnabled())
    		    {
    			
    			
    		    	test.log(LogStatus.FAIL, "Save & Add button is Enabled");
    		    	
    		    	ut.FailedCaptureScreenshotAsBASE64();
    		    }
    		    else
    		    {
    		    	test.log(LogStatus.PASS, "Save & Add button is Disabled");
    		    	
    		    	ut.PassedCaptureScreenshotAsBASE64();
    		    	
    		    	Assert.assertEquals(false, Save_ADD_Btn_Disabled().isEnabled());}
    		    }
    	 
    	 
//    	public void Check_Save_Button_Enabled() throws Exception
//    	{
//    	 
//    		 if(Save_Button_Enabled().isEnabled())
//    		    {
//    			
//    			
//    		    	test.log(LogStatus.PASS, "Save button is Enabled");
//    		    	ut.PassedCaptureScreenshotAsBASE64();
//    		    	Assert.assertEquals(false, Save_Button_Enabled().isEnabled());
//    		    	
//    		    }
//    		    else
//    		    {
//    		    	test.log(LogStatus.FAIL, "Save button is Disabled");
//    		    	ut.FailedCaptureScreenshotAsBASE64();
//    		    	
//    		    	}
//    		    }
    		
//    	public void Check_Save_ADD_Button_Enabled() throws Exception
//    	{
//    	 
//    		 if(Save_ADD_Btn_Enabled().isEnabled())
//    		    {
//    			
//    			
//    		    	test.log(LogStatus.PASS, "Save & Add button is Enabled");
//    		    	
//    		    	ut.PassedCaptureScreenshotAsBASE64();
//    		    }
//    		    else
//    		    {
//    		    	test.log(LogStatus.FAIL, "Save & Add button is Disabled");
//    		    	
//    		    	ut.FailedCaptureScreenshotAsBASE64();
//    		    	
//    		    	Assert.assertEquals(false, Save_ADD_Btn_Enabled().isEnabled());
//    		    }
//    	}
    	 
    	
//    	public void Check_Save_ADD_Button_Diabled() throws Exception
//    	{
//    	 
//    		 if(Save_ADD_Btn_Disabled().isEnabled())
//    		    {
//    			
//    			
//    		    	test.log(LogStatus.FAIL, "Save & Add button is Enabled");
//    		    	
//    		    	ut.FailedCaptureScreenshotAsBASE64();
//    		    }
//    		    else
//    		    {
//    		    	test.log(LogStatus.PASS, "Save & Add button is Disabled");
//    		    	
//    		    	ut.PassedCaptureScreenshotAsBASE64();
//    		    	
//    		    	Assert.assertEquals(false, Save_ADD_Btn_Disabled().isEnabled());
//    		    	}
//     }

public void Check_Save_ADD_Button_Enabled() throws Exception
{
 
	 if(Save_ADD_Btn_Enabled().isEnabled())
	    {
		
		
	    	test.log(LogStatus.PASS, "Save & Add button is Enabled");
	    	
	    	ut.PassedCaptureScreenshotAsBASE64();
	    }
	    else
	    {
	    	test.log(LogStatus.FAIL, "Save & Add button is Disabled");
	    	
	    	ut.FailedCaptureScreenshotAsBASE64();
	    	
	    	Assert.assertEquals(false, Save_ADD_Btn_Enabled().isEnabled());
	    }
}
public void IClickSAVE_ADD_Btn() {
	 
Save_ADD_Btn_Enabled().click();
}
  
}
