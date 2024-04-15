package com.Pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LoginActions.Base_DriverManagerClass;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class LoginPage extends BasePage
{

//	SelfHealingDriver driver;
//	ExtentTest test;
	Utility ut=new Utility();
	
	
	
//	public LoginPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver,test);
//		
////		this.test=Base_DriverManagerClass.getTest();
////		PageFactory.initElements(Base_DriverManagerClass.getDriver(), this);
//		
//	}
	
	@FindBy(xpath = "//h4[contains(.,'Log In')]")
	public WebElement LoginPageHeaderText;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[contains(.,'Log In')]")
	public WebElement LoginBtn;
	
	@FindBy(xpath = "//b[@class='text-primary cursor-pointer']")
	WebElement ForgotPasswordCursorBtn;
	
	@FindBy(xpath = "//span[contains(.,'Create an Account')]")
	WebElement CreateNewAccountBtn;
	
	@FindBy(xpath = "//mat-icon[contains(.,'visibility')]")
	WebElement VisibilityIconBtn;
	
	@FindBy(xpath = "//app-input[@placeholder='Search']/div/div/mat-form-field/div/div/div[4]/input")
	WebElement SearchBox_inStores;
	
	@FindBy(xpath = "//div[contains(@class,'store-info')]")
	WebElement First_StoreInStoresList;
	
	@FindBy(xpath = "//div[@class='profile-name']")
	WebElement Profile_Tab;
	
	@FindBy(xpath = "//button[contains(.,'Logout')]")
	WebElement Log_OutBtn;
	
	@FindBy(xpath = "//div[.='Edit Profile']")
	WebElement Edit_ProfileBtn;
	
	@FindBy(xpath = "//div[.='Change Password']")
	WebElement Change_PasswordBtn;
	
	@FindBy(xpath = "//div[.='Support']")
	WebElement Support_Btn;
	
	@FindBy(xpath = "//h4[contains(.,'Admin Log In')]")
	WebElement LoginPageHeaderText_inAdmin;

	//mat-icon[@role='img']
	public void EnterUsername(String username)
	{
		Username.sendKeys(username);
	}
	
	public void EnterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void ClickLoginButton()
	{
		LoginBtn.click();
	}
	
	public WebElement LoginPageHeaderText()
	{
		return LoginPageHeaderText;
	}
	
	

	
	public void VerifyLoginPageHeader()
	{
		
		if(LoginPageHeaderText.getText().equalsIgnoreCase("Log In"))
		{
//			test.log(LogStatus.PASS, "Login Page Loaded Successfully");
			
//			String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//			String s="data:image/png;base64,"+scnsht;
//			
//			test.log(LogStatus.PASS, test.addScreenCapture(s));
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
//			test.log(LogStatus.FAIL, "Login page loading Failed");
			
//			String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//			String s="data:image/png;base64,"+scnsht;
//			
//			test.log(LogStatus.FAIL, test.addScreenCapture(s));
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	
	
	public void Login(String username,String password) throws Exception
	{
		Thread.sleep(1500);
		
		Username.sendKeys(username);
		
		Thread.sleep(1500);
		Password.sendKeys(password);
		
		Thread.sleep(1000);
		LoginBtn.click();
		
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//h3[contains(.,'Welcome to the new Back Office. Here’s what’s changed')]")).isDisplayed())
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(.,'Continue')]")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(.,'GOT IT')]")).click();
		}
		
		Thread.sleep(10000);
		driver.get(Utility.getProperty("Enterprise_Base_URL"));
		
		Thread.sleep(3000);
		new Common_XPaths().SearchBox.clear();
		Thread.sleep(1000);
		new Common_XPaths().SearchBox.sendKeys(Utility.getProperty("Store1"));
		
		Thread.sleep(2000);
		First_StoreInStoresList.click();
		Thread.sleep(2000);
		
	
	}
	
	public void Log_Out() throws Exception
	{
		
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		
		Thread.sleep(1000);
		Profile_Tab.click();
		
		Thread.sleep(1000);
		Log_OutBtn.click();
		
		if(LoginPageHeaderText.isDisplayed())
		{
			test.log(LogStatus.PASS, "Logged Out Successfully");
			
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Log Out Failed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
		
		
		driver.close();
	}
	
	public void Open_URL(String URL)
	{
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		
		System.out.println(driver.getCurrentUrl());
		if(!driver.getCurrentUrl().equals(URL))
		{
			driver.get(URL);
		}
//		else
//		{
//			driver.get(URL);
//		}
		
	}
	
//	public void Open_URL_with_Multi_URL(String URL1, String URL2)
//	{
//		
//		if(!driver.getCurrentUrl().equals(URL1))
//		{
//		driver.get(URL1);
//		}
//		else if(!driver.getCurrentUrl().equals(URL2))
//		{
//			driver.get(URL2);
//		}
//			
//		
//	}
	
	public void VerifyLoginPageHeader_Admin()
	{
		
		if(LoginPageHeaderText_inAdmin.getText().equalsIgnoreCase("Admin Log In"))
		{
			test.log(LogStatus.PASS, "Admin Login Page Loaded Successfully");
			
//			String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//			String s="data:image/png;base64,"+scnsht;
//			
//			test.log(LogStatus.PASS, test.addScreenCapture(s));
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Admin Login page loading Failed");
			
//			String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//			String s="data:image/png;base64,"+scnsht;
//			
//			test.log(LogStatus.FAIL, test.addScreenCapture(s));
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	public void VerifyLoginPageHeader_Dealer() throws Exception
	{
		
		if(driver.getCurrentUrl().equals(Utility.getProperty("app_Dealer_URL")))
		{
			test.log(LogStatus.PASS, "Dealer Login Page Loaded Successfully");
			
//			String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//			String s="data:image/png;base64,"+scnsht;
//			
//			test.log(LogStatus.PASS, test.addScreenCapture(s));
			ut.PassedCaptureScreenshotAsBASE64();
		}
		else
		{
			test.log(LogStatus.FAIL, "Dealer Login page loading Failed");
			
//			String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//			String s="data:image/png;base64,"+scnsht;
//			
//			test.log(LogStatus.FAIL, test.addScreenCapture(s));
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	
	public void Login_As_Admin(String username,String password) throws Exception
	{
		
		Thread.sleep(1500);
		
		Username.sendKeys(username);
		
		Thread.sleep(1500);
		Password.sendKeys(password);
		
		Thread.sleep(2000);
		LoginBtn.click();
	}
	
	
	public void Login_As_Admin_Select_Store(String username,String password) throws Exception
	{
		
		Thread.sleep(1500);
		
		Username.sendKeys(username);
		
		Thread.sleep(1500);
		Password.sendKeys(password);
		
		Thread.sleep(1000);
		LoginBtn.click();
		
		Thread.sleep(5000);
		//Click the Accounts
		driver.findElement(By.xpath("//span[contains(.,'Accounts')]/..")).click();
		
		Thread.sleep(5000);
		//Click the Stores 
		driver.findElement(By.xpath("//button[.='STORES']")).click();
		
		Thread.sleep(5000);
//		Thread.sleep(3000);
		new Common_XPaths().SearchBox.clear();
		Thread.sleep(1000);
		new Common_XPaths().SearchBox.sendKeys(Utility.getProperty("Store_Search_in_Admin"));
		
		Thread.sleep(3000);
		//Select the store
		driver.findElement(By.xpath("//a[.='"+Utility.getProperty("Store_Search_in_Admin")+"']")).click();
		
		
		Thread.sleep(2000);
		Thread.sleep(5000);
		String parent1=driver.getWindowHandle();
		Set<String> childWins1=driver.getWindowHandles();
		
		for(String child1:childWins1)
		{
			if(!parent1.equals(child1))
			{
				driver.switchTo().window(child1);
			}
		}
		
		
		
		Thread.sleep(8000);
		
		//Click the Login button
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		
		Thread.sleep(4000);
		String parent2=driver.getWindowHandle();
		Set<String> childWins2=driver.getWindowHandles();
		
		for(String child2:childWins2)
		{
			if(!parent1.equals(child2))
			{
				driver.switchTo().window(child2);
			}
		}
		
		Thread.sleep(3000);
		
	}
	
	
	public void Login_with_Old_BO() throws Exception
	{
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try
		{
			if(driver.findElement(By.xpath("//div[@id='popmake-26044']/button")).isDisplayed())
			{Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='popmake-26044']/button")).click();
			}
		}
		catch(Exception e)
		{}
		try
		{
			if(driver.findElement(By.xpath("//a[.='Accept']")).isDisplayed())
			{
				driver.findElement(By.xpath("//a[.='Accept']")).click();
			}
		}
		catch(Exception e)
		{}
		//Clear the text from the user name text box
		driver.findElement(By.xpath("//h1[contains(.,'Sign in')]/../div/div[1]/div/input")).clear();
		//Enter the user name
		driver.findElement(By.xpath("//h1[contains(.,'Sign in')]/../div/div[1]/div/input")).sendKeys(Utility.getProperty("userName"));
		//Clear the password from the password text box
		driver.findElement(By.xpath("//h1[contains(.,'Sign in')]/../div/div[2]/div/input")).clear();
		//Enter the password
		driver.findElement(By.xpath("//h1[contains(.,'Sign in')]/../div/div[2]/div/input")).sendKeys(Utility.getProperty("password"));
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);Thread.sleep(2000);
	
		//Click the login button
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		Thread.sleep(30000);
		//Check if we logged in or not
		if(driver.findElement(By.xpath("//div[@id='navigation']/ul[1]/li/a")).getText().equalsIgnoreCase("My Stores"))
		{
			test.log(LogStatus.PASS, "User Logged in Successfully for Linga Enterprise ");
		}
		else
		{
			test.log(LogStatus.FAIL, "User Logged in Failed for Linga Enterprise ");
		}
		Thread.sleep(10000);
		//Click the refresh button 
		driver.findElement(By.cssSelector("button.btn.btn-sm.btn-primary")).click();
		
		Thread.sleep(5000);
		//Clear the search field 
		driver.findElement(By.xpath("//input[@ng-model='searchText']")).clear();
		//Enter the search field 
	     driver.findElement(By.xpath("//input[@ng-model='searchText']")).sendKeys(Utility.getProperty("Store1"));
		
		//Click the Entered store Dashboard page
		driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div/div[2]/div/div/div/div[4]/div/div/div[2]/div/div[1]/a/h5")).click();
		
		//Check if we logged in or not
		try
		{
			if(driver.findElement(By.xpath("//span[.='Dashboard']")).getText().equalsIgnoreCase("Dashboard"))
			{
				test.log(LogStatus.PASS, "Linga Store level Dashboard page loaded sucessfully ");
			}
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "Linga Store level Dashboard page loaded failed ");
		}
		Thread.sleep(8000);
		
		
		//Thread.sleep(15000);
		try
		{
			if(driver.findElement(By.xpath("//span[.='Do You Want to Take a look.. ']")).isDisplayed())
			{
				Thread.sleep(3000);
				//Click Not now
				driver.findElement(By.xpath("//button[.=' Not now']")).click();
			}
		}
		catch(Exception e) {}
	}
	
	
	public void LogOut_with_Old_BO() throws Exception
	{
		LoginPage a=new LoginPage();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		//Identify the WebElement which will appear after scrolling down
		WebElement element = driver.findElement(By.xpath("//i[contains(@class,'icon-logout')]/.."));
		//Scroll the page till the Reason option present
		je.executeScript("arguments[0].scrollIntoView(true);",element); 
		//Wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Click on Logout button
		driver.findElement(By.xpath("//i[contains(@class,'icon-logout')]/..")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//Check whether user get logged out or not
/*		if(driver.findElement(By.xpath(excel.getData(0, 10, 1))).isDisplayed())
		{
	    	test.log(LogStatus.PASS, "User Logged out Successfully LingaPOs");
		}
		else
		{
			test.log(LogStatus.FAIL, "User Logged out Failed LingaPos");
		}*/
		Thread.sleep(3000);
		//Close the Browser
		driver.close();
		
	}
	
	
}
