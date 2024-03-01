package com.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import StepDefinition.Hooks;
import Utility.ExtentManager;
import Utility.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Manager {
	
//	String fullFeatureName = FilenameUtils.getName(scenario.getUri().toString());
	private static ThreadLocal<SelfHealingDriver> driver= new ThreadLocal<>();
	public static ExtentReports rep=ExtentManager.getInstance();//=ExtentManager.getInstance();
	public static ExtentTest test=rep.startTest("Test Started...!"+Hooks.FeatureNameText());//=rep.startTest("Test Started...!"+Hooks.FeatureName.toString());
	
	 public static SelfHealingDriver getDriver()
	    {
	    	return driver.get();
	    }
	 
	 public ExtentTest getTest()
	 {
		 return test;
	 }

	 public void Launch_Browser() throws Exception
	 {
		 SelfHealingDriver driver=null;
		 
		 
		 
		 
		 if(driver==null)
		 {
			 try
			 {
			 System.out.println("Initializing Self Healing Driver");
			 
			 WebDriverManager.chromedriver().setup();
		  		
		  		ChromeOptions options=new ChromeOptions();
		  		
		  		options.setHeadless(false);
		  		
		  		WebDriver delegate=new ChromeDriver();
		  		
		  		driver=SelfHealingDriver.create(delegate);
		  		//Wait for 30 seconds
		  		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  		//Maximize the Chrome window
		  		driver.manage().window().maximize();
		  		
		  		if(driver==null)
		  		{
		  			throw new Exception("Driver is null... Abort");
		  		}
		  		
		  		System.err.println("Driver is Initialized...!");
		  		Driver_Manager.driver.set(driver);
		  	//Launch the URL
//				driver.get(Utility.getProperty("appURL"));
				
				Thread.sleep(10000);
//		  		LoginPage lp=new LoginPage();
//		  		lp.VerifyLoginPageHeader();
//		  		lp.Login(Utility.getProperty("userName"), Utility.getProperty("password"));
				
				
				Thread.sleep(10000);
			 }
			 catch (IOException e) 
			 {
				 e.printStackTrace();
				 System.out.println("Driver Initiazation Failed...!"+e.toString());
			 }
		 }
			 
		
	 }
	 
	 public ExtentTest Genarate_ExtentReport(String ReportDetails)
	 {
		 getRep();
		 return test = rep.startTest(ReportDetails);
	 }
	 
	 public ExtentReports getRep()
	 {
		 return rep=ExtentManager.getInstance();
	 }
}
