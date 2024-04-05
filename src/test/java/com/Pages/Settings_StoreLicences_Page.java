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

public class Settings_StoreLicences_Page extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;
	
//	SelfHealingDriver driver=new Driver_Manager().getDriver();
//	ExtentReports rep=new Driver_Manager().getRep(); 
//	ExtentTest test=new Driver_Manager().test;
	
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
	Settings_NotificationsPage snp = new Settings_NotificationsPage();
	Settings_CDS_Page cds = new Settings_CDS_Page();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	
	public void openTheSettings_StoreLicensesHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		//Load the Settings Store Licenses page
		try {
			driver.navigate().refresh();
			cmp.waitForPageToLoad();
		lgpg.Open_URL(Utility.getProperty("stagingbaseURL")+Utility.getProperty("store_Id2")+"storeLicenses");
		Thread.sleep(5000);
				}
		catch(Exception K) {}
		Thread.sleep(5000);
		cmp.waitForPageToLoad();
}
	
	
	@FindBy(xpath = "//a[contains(.,'Store Licenses')]")
	public WebElement StoreLicense_MainScreenHeader;
	
	@FindBy(xpath = "//h3[contains(.,'Store Licenses')]")
	public WebElement StoreLicense_PageHeader;
	
	@FindBy(xpath="	//th/div/div[contains(.,'Node Id')]")
	public WebElement Field_NodeId;

	@FindBy(xpath="	//th/div/div[contains(.,'Device Type')]")
	public WebElement Field_DeviceType;
	
	@FindBy(xpath="	//th/div/div[contains(.,'Device Name')]")
	public WebElement Field_DeviceName;
	
	@FindBy(xpath="	//th/div/div[contains(.,'Last Login Time')]")
	public WebElement Field_LastLoginTime;
	
	@FindBy(xpath="	//th/div/div[contains(.,'Last Access Time')]")
	public WebElement Field_LastAccessTime;
	
	@FindBy(xpath="	//th[contains(.,'Actions')]")
	public WebElement Field_Actions;
	
	@FindBy(xpath="	//mat-paginator/div/div/div/div[contains(.,'Rows per page')]")
	public WebElement Field_Rowsperpage;

	
	@FindBy(xpath = "//button[contains(.,'SIGN OUT')]")
	public WebElement Sign_OutBtn;
	
	@FindBy(xpath = "//mat-select/div/div[2]")
	public WebElement Pagination_InputBox;
	
	@FindBy(xpath = "//span[contains(.,'Store Licenses not found')]")
	public WebElement LicenseNotFoundMsg;
	
	@FindBy(xpath = "//mat-option[1]")
	public WebElement Count_10;
	
	@FindBy(xpath = "//mat-option[2]")
	public WebElement Count_20;
	
	@FindBy(xpath = "//mat-option[3]")
	public WebElement Count_50;
	
	@FindBy(xpath = "//mat-option[4]")
	public WebElement Count_100;
	
	public void Verify_Rows_PageCount_10() throws Exception
	{
		Pagination_InputBox.click();
		
		Count_10.click();
		test.log(LogStatus.INFO, "Now we click the Pagination option as 10");
		
		List<WebElement> StoreList=driver.findElements(By.xpath("//table/tbody/tr/td[7]"));
		
		for (WebElement result : StoreList){						
		     List<WebElement> boxes = result.findElements(By.xpath("//button[contains(.,'SIGN OUT')]"));
		     //Create the variable for getting the size of the box
		     int numberOfBoxes = boxes.size();
		     System.out.println("There are totally "+numberOfBoxes+" elements available");
		}
		
		Thread.sleep(1000);
		
	}

	public void Verify_Rows_PageCount_20() throws Exception
	{
		Pagination_InputBox.click();
		
		Count_20.click();
		test.log(LogStatus.INFO, "Now we click the Pagination option as 20");
		
		List<WebElement> StoreList1=driver.findElements(By.xpath("//table/tbody/tr/td[7]"));
		
		for (WebElement result : StoreList1){						
			//Create the web element for delete button
		     List<WebElement> boxes = result.findElements(By.xpath("//button[contains(.,'SIGN OUT')]"));
		     //Create the variable for getting the size of the box
		     int numberOfBoxes = boxes.size();
		     System.out.println("There are totally "+numberOfBoxes+" elements available");
		}
		
		Thread.sleep(1000);}
	
	public void Verify_Rows_PageCount_50() throws Exception
	{

		Pagination_InputBox.click();
		
		Count_50.click();
		test.log(LogStatus.INFO, "Now we click the Pagination option as 50");
		
		List<WebElement> StoreList2=driver.findElements(By.xpath("//table/tbody/tr/td[7]"));
		
		for (WebElement result : StoreList2){						
			//Create the web element for delete button
		     List<WebElement> boxes = result.findElements(By.xpath("//button[contains(.,'SIGN OUT')]"));
		     //Create the variable for getting the size of the box
		     int numberOfBoxes = boxes.size();
		     System.out.println("There are totally "+numberOfBoxes+" elements available");
		}

		
		
	}
	
	public void Verify_Rows_PageCount_100() throws Exception
	{

		Pagination_InputBox.click();
		
		Count_100.click();
		test.log(LogStatus.INFO, "Now we click the Pagination option as 100");
		
		List<WebElement> StoreList2=driver.findElements(By.xpath("//table/tbody/tr/td[7]"));
		
		for (WebElement result : StoreList2){						
			//Create the web element for delete button
		     List<WebElement> boxes = result.findElements(By.xpath("//button[contains(.,'SIGN OUT')]"));
		     //Create the variable for getting the size of the box
		     int numberOfBoxes = boxes.size();
		     System.out.println("There are totally "+numberOfBoxes+" elements available");
		}
	}
	
	@FindBy(xpath =  "//div[@class='alert-header']/div/div/h4")
	public WebElement Reminder_Popup;
	
	@FindBy(xpath =  "//button/span[contains(.,'No')]")
	public WebElement No_btn;
	
	@FindBy(xpath =  "//span[contains(.,'Close') and contains(@class,'mat-button')]")
	public WebElement Close_btn;
	
	@FindBy(xpath =  "//button/span[contains(.,'Yes')]")
	public WebElement Yes_btn;
	
	@FindBy(xpath = "//input[contains(@data-placeholder,'Search')]")
	public WebElement Search_option;
	
	public void Iclick_Signout() {
	
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]/div//button")).click();
	}
	
	public void Iclick_No_StoreLicenses() {
		
		No_btn.click();
	}
	
public void Iclick_Yes_StoreLicenses() {
		
		Yes_btn.click();
	}

public void Iclick_Close_StoreLicenses() {
	
	Close_btn.click();
}
	
	public void Verify_AlertMessage_StoreLicenses() throws InterruptedException
	{
		
		try {
				String s1 = driver.findElement(By.xpath("//div[@class='message mx-2']/span")).getText();
				Thread.sleep(500);
				//Check whether the License unLinked from the device successfully message is displayed
				if(s1.equals("This Node is configured in 'Revenue Center'. could not unsync."))
				{
					test.log(LogStatus.INFO, "This Node is configured in 'Revenue Center'. could not unsync. message is displayed, when user click the Signout button from the list of licenses");		
								
				}
			
				//Click the close button of warning message
				driver.findElement(By.xpath("//div[@class='message mx-2']/../mat-icon[.='close']")).click();
				driver.findElement(By.xpath("//table/tbody/tr[2]/td[7]/div//button")).click();
			}
			catch(Exception r){
				if(Reminder_Popup.getText().equals("Reminder"))
				{
					test.log(LogStatus.PASS, "Reminder popup is displayed successfully");
				}
				else
				{
					test.log(LogStatus.FAIL, "Reminder popup is displayed successfully, but it have some spelling mistake");
					ut.FailedCaptureScreenshotAsBASE64();
				}
				
			
				
				Thread.sleep(2000);
		}
		}

				
			public void Verify_LicenseUnlinked() throws InterruptedException
			{
				
				Thread.sleep(2000);
						
				String s1 = driver.findElement(By.xpath("//div[@class='message mx-2']/span")).getText();
				Thread.sleep(500);
				//Check whether the License unLinked from the device successfully message is displayed
				if(s1.equals("License unLinked from the device successfully"))
				{
					test.log(LogStatus.PASS, "License unLinked from the device successfully message is displayed, when user click the yes button from the alert popup");
				}
				else
				{
					test.log(LogStatus.FAIL, "License unLinked from the device successfully is not displayed, when user click the yes button from the alert popup");
				}
				
				//Click the close button of warning message
				driver.findElement(By.xpath("//div[@class='message mx-2']/../mat-icon[.='close']")).click();
				
			}
			
			public void Search_License() throws InterruptedException
			{
				String sa = driver.findElement(By.xpath("(//table/tbody/tr/td[1]/span)[1]")).getText();
				Search_option.sendKeys(sa);
				
				Thread.sleep(2000);
				
				List<WebElement> xs = driver.findElements(By.xpath("//span[contains(.,'Store Licenses not found')]"));
				
				if(xs.size() == 1) {
					test.log(LogStatus.PASS, "After revert the license for the partiuclar node, the corresponding node is not available in the store while searching");
				}
				else if(xs.size() == 0)
				{
					test.log(LogStatus.FAIL, "After revert the license for the partiuclar node, the corresponding node is available in the store while searching");
				
					ut.FailedCaptureScreenshotAsBASE64();
				}
				
				Search_option.clear();
				Thread.sleep(10000);
				
			}
	
	
		
		
		public void Revert_Licenses_Yes1() throws InterruptedException
		{
		//Get the value from the table
		String sa = driver.findElement(By.xpath("(//table/tbody/tr/td[1]/span)[1]")).getText();
		
		List<WebElement> Lsta=driver.findElements(By.xpath("(//table/tbody/tr/td[1]/span)[1]"));
		
		//Click the sign out button
		for(int i = 1; i <= Lsta.size(); i++)
		{
			driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]/div//button")).click();
			
			Thread.sleep(2000);
			
			try {
				String s1 = driver.findElement(By.xpath("//div[@class='message mx-2']/span")).getText();
				Thread.sleep(500);
				//Check whether the License unLinked from the device successfully message is displayed
				if(s1.equals("This Node is configured in 'Revenue Center'. could not unsync."))
				{
					test.log(LogStatus.INFO, "This Node is configured in 'Revenue Center'. could not unsync. message is displayed, when user click the Signout button from the list of licenses");		
				}
			
				//Click the close button of warning message
				driver.findElement(By.xpath("//div[@class='message mx-2']/../mat-icon[.='close']")).click();
				
			}
			catch(Exception r){
				if(Reminder_Popup.getText().equals("Remainder"))
				{
					test.log(LogStatus.PASS, "Remainder popup is displayed successfully");
				}
				else
				{
					test.log(LogStatus.FAIL, "Remainder popup is displayed successfully, but it have some spelling mistake");
					ut.FailedCaptureScreenshotAsBASE64();
				}
				
				//click the yes button
				Yes_btn.click();
				
				Thread.sleep(2000);
						
				String s1 = driver.findElement(By.xpath("//div[@class='message mx-2']/span")).getText();
				Thread.sleep(500);
				//Check whether the License unLinked from the device successfully message is displayed
				if(s1.equals("License unLinked from the device successfully"))
				{
					test.log(LogStatus.PASS, "License unLinked from the device successfully message is displayed, when user click the yes button from the alert popup");
				}
				else
				{
					test.log(LogStatus.FAIL, "License unLinked from the device successfully is not displayed, when user click the yes button from the alert popup");
				}
				
				//Click the close button of warning message
				driver.findElement(By.xpath("//div[@class='message mx-2']/../mat-icon[.='close']")).click();
				
				Search_option.sendKeys(sa);
				
				Thread.sleep(2000);
				
				List<WebElement> xs = driver.findElements(By.xpath("//span[contains(.,'Store Licenses not found')]"));
				
				if(xs.size() == 1) {
					test.log(LogStatus.PASS, "After revert the license for the partiuclar node, the corresponding node is not available in the store while searching");
				}
				else if(xs.size() == 0)
				{
					test.log(LogStatus.FAIL, "After revert the license for the partiuclar node, the corresponding node is available in the store while searching");
				
					ut.FailedCaptureScreenshotAsBASE64();
				}
				
				Search_option.clear();
				Thread.sleep(10000);
				break;
			}
		}
	}
	
	
	public void Revert_Licenses()
	{

		if(LicenseNotFoundMsg.isDisplayed())
		{
			test.log(LogStatus.INFO, "Store Licenses not found");
		}
		else
		{
			test.log(LogStatus.FAIL, "Store Licenses Available");
			
		List<WebElement> StoreList=driver.findElements(By.xpath("//div[@class='data-grid']/div[3]/div/data-grid-row/div/div[1]"));

	
		for(WebElement ele:StoreList)
		{
			cmp.SearchBox.clear();
			cmp.SearchBox.sendKeys(ele.getText());
			
			Sign_OutBtn.click();
			
			//cmp.Click_YesButton();
			
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("License Unlinked from the device Successfully"))
			{
				test.log(LogStatus.PASS, "Licenses Unlinked Successfully");
				
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("This Node is Configured in 'Revenue Center'. Could not unsync."))
			{
				test.log(LogStatus.INFO, "This Node is Configured in 'Revenue Center'. Could not unsync.");
			
				ut.PassedCaptureScreenshotAsBASE64();
			}
			else
			{
				test.log(LogStatus.FAIL, "Licenses Unlink Failed");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		}
	}
	

}
	
	
	
	
	
		
				
	
	
	

		


