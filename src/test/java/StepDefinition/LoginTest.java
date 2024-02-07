package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	
	LoginPage a=new LoginPage();
	public void LoginAsInvalidUser(SelfHealingDriver driver,ExtentTest test)
	{
		
	}
//	@Before
	public void Login() throws Exception
	{
		a=new LoginPage();
		Thread.sleep(2000);
		//Call the chrome driver 
//		System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
//		//Open the Chrome window
//		driver = new ChromeDriver();
//		ChromeOptions chrOpt=new ChromeOptions();
//		chrOpt.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver(chrOpt);
//		
//		//Wait for 30 seconds
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//Maximize the Chrome window
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		//Launch the URL
//		driver.get(Utility.getProperty("appURL"));
		
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions options=new ChromeOptions();
//		
//		options.setHeadless(false);
//		
//		WebDriver delegate=new ChromeDriver();
//		
//		driver=SelfHealingDriver.create(delegate);
//		
//		//Wait for 30 seconds
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				//Maximize the Chrome window
//				driver.manage().window().maximize();
		
		Thread.sleep(1000);
		a.VerifyLoginPageHeader();
		
		Thread.sleep(2000);
		a.Login(Utility.getProperty("userName"), Utility.getProperty("password"));
		
	}
	
//	@After
	public void LogOut() throws Exception
	{
		a=new LoginPage();
		
		a.Log_Out();
		
//		a.VerifyLoginPageHeader();
		
//		driver.close();
		
	}
	
	
	public void Login_As_Admin() throws Exception
	{
		a=new LoginPage();
		Thread.sleep(2000);
		//Call the chrome driver 
//		System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
//		//Open the Chrome window
//		driver = new ChromeDriver();
//		ChromeOptions chrOpt=new ChromeOptions();
//		chrOpt.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver(chrOpt);
//		
//		//Wait for 30 seconds
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//Maximize the Chrome window
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		//Launch the URL
//		driver.get(Utility.getProperty("appURL"));
		
		Thread.sleep(1000);
		a.VerifyLoginPageHeader_Admin();
		
		Thread.sleep(5000);
		a.Login_As_Admin(Utility.getProperty("UserName_Admin"), Utility.getProperty("Password_Admin"));
		
	}
	
	public void Login_As_Dealer() throws Exception
	{
		a=new LoginPage();
		Thread.sleep(2000);
		//Call the chrome driver 
//		System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
//		//Open the Chrome window
//		driver = new ChromeDriver();
//		ChromeOptions chrOpt=new ChromeOptions();
//		chrOpt.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver(chrOpt);
//		
//		//Wait for 30 seconds
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//Maximize the Chrome window
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		//Launch the URL
//		driver.get(Utility.getProperty("appURL"));
		
		Thread.sleep(1000);
		a.VerifyLoginPageHeader_Dealer();
		
		Thread.sleep(5000);
		a.Login_As_Admin(Utility.getProperty("UserName_Dealer"), Utility.getProperty("Password_Dealer"));
		
	}
	
	public void Login_As_Admin_Select_Store() throws Exception
	{
		a=new LoginPage();
		Thread.sleep(2000);
		//Call the chrome driver 
//		System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
//		//Open the Chrome window
//		driver = new ChromeDriver();
//		ChromeOptions chrOpt=new ChromeOptions();
//		chrOpt.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver(chrOpt);
//		
//		//Wait for 30 seconds
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//Maximize the Chrome window
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		//Launch the URL
//		driver.get(Utility.getProperty("appURL"));
	
		Thread.sleep(1000);
		a.VerifyLoginPageHeader_Admin();
		
		Thread.sleep(5000);
		a.Login_As_Admin_Select_Store(Utility.getProperty("UserName_Admin"), Utility.getProperty("Password_Admin"));
		
	}
	
	
	
}
