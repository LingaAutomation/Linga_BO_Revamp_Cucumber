package StepDefinition;
import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pages.BasePage;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.base.LoginActions.Base_DriverManagerClass;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;

import Utility.ExtentManager;
import Utility.Utility;
import io.cucumber.core.backend.ScenarioScoped;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Scenario;
import io.cucumber.messages.types.Feature;
public class Hooks //extends BasePage
{
	public static SelfHealingDriver driver;//=new Driver_Manager().getDriver();
	
	public static String ScenarioName;
	public static String FeatureName;
	
//	ExtentReports rep = ExtentManager.getInstance();
//	ExtentTest test = rep.startTest(FeatureName); 
//	ExtentReports rep = new Driver_Manager().getRep();
//	ExtentTest test=rep.startTest(FeatureName);
//	ExtentReports rep = new Driver_Manager().getRep();
//	ExtentTest test=new Driver_Manager().rep.startTest(FeatureName);

	Utility ut=new Utility();
	
	
	static LoginTest a=new LoginTest();
	LoginPage lgpg=new LoginPage();
	
	 	@BeforeAll
	    public static void beforeAll() throws Exception 
	 	{
	 		
	 		System.out.println("Before All Started...!");
	 		Base_DriverManagerClass.setUpDriver();
	 		 
	 		new Driver_Manager().Launch_Browser();
	 		
	 		driver=new Driver_Manager().getDriver();
 		

			
//			ChromeOptions options=new ChromeOptions();
//			
//			options.setHeadless(false);
//			
//			WebDriver delegate=new ChromeDriver();
////			this.driver.getDelegate();
//			driver=SelfHealingDriver.create(delegate);
//			//Wait for 30 seconds
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			//Maximize the Chrome window
//			driver.manage().window().maximize();
			Thread.sleep(1000);
			//Launch the URL
			driver.get(Utility.getProperty("appURL"));
			
			   
					Thread.sleep(10000);
					a.Login();
	    }
	 	
	 	@Before
	 	public void Start_Scenario(Scenario scenario) throws Exception
	 	{
//	 		Feature feature = null;
	 		
//	 		String FeatureName=feature.getName();
//	 		this.FeatureName=FeatureName;
//	 		FeatureName=scenario.getId().split(";")[0].replace("-"," ");
//	 		FeatureName =  FeatureName.substring(0, 1).toUpperCase() + FeatureName.substring(1);
	 		

	 		
	 		String featureName = FilenameUtils.getBaseName(scenario.getUri().toString());
	 		this.FeatureName=featureName;
	 		
	 		new Driver_Manager().test.log(LogStatus.INFO, FeatureName);
	 		
	 		
	 		System.out.println("Running Feature name : "+FeatureName);
	 		
	 		System.out.println("Before Hook Started...!"); 
	 		
	 		ScenarioName=scenario.getName();
	 		new Driver_Manager().test.log(LogStatus.INFO, ScenarioName);
	 		
	 		if(driver==null)
	 		{
	 			ChromeOptions options=new ChromeOptions();
				
				options.setHeadless(false);
//		  		options.addArguments("headless=false");

				
				WebDriver delegate=new ChromeDriver();
//				this.driver.getDelegate();
				driver=SelfHealingDriver.create(delegate);
				//Wait for 30 seconds
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Maximize the Chrome window
				driver.manage().window().maximize();
				Thread.sleep(1000);
				//Launch the URL
				driver.get(Utility.getProperty("appURL"));
				
				   
						Thread.sleep(10000);
						a.Login();
	 		}
	 		
	 		
//	 			try
//		 		{
//		 		if(driver.getTitle().equalsIgnoreCase("Linga rOS"))
	 				List<WebElement> LoginBtn=driver.findElements(By.xpath("//button[contains(.,'Log In')]"));
	 				
	 				System.out.println("Login button available size is : "+LoginBtn.size());
//		 		if(lgpg.LoginBtn.isDisplayed()) 
	 			if(LoginBtn.size()>0)
		 		{
		 			System.out.println("Session Expired & Application Closed...!");
		 			Thread.sleep(3000);
		 			driver.navigate().refresh();
		 			System.out.println("Page Refreshed...!");
//		 			driver.navigate().back();
//		 			Thread.sleep(2000);
//		 			driver.navigate().forward();
		 			Thread.sleep(10000);
		 			System.out.println("Re-login started...!");
					a.Login();
		 		}
	 			else
	 			{
	 				System.out.println("----Executing without Logging Out----");
	 			}
//		 		}
//		 		catch(Exception h) 
//		 		{
//		 			
//		 		}
//	 		try
//	 		{
//	 		if(driver.getCurrentUrl().trim().equals(Utility.getProperty("appURL")))
//	 		{
//	 			System.out.println("Session Expired & Application Closed...!");
//	 			Thread.sleep(2000);
//	 			driver.navigate().refresh();
//	 			Thread.sleep(10000);
//				a.Login();
//	 			
//	 		}
//	 		}
//	 		catch(Exception h) 
//	 		{
//	 			
//	 		}
	 		
//	 		try
//	 		{
//	 			if(driver.findElement(By.xpath("//button[@id='reload-button']")).isDisplayed())
//	 			{
//	 				System.out.println("Application Crashed due to Out of Memory Issue & Application Closed...!");
//		 			ut.FailedCaptureScreenshotAsBASE64();
//	 				Thread.sleep(2000);
//		 			driver.navigate().refresh();
//		 			Thread.sleep(5000);
//		 			driver.navigate().refresh();
//		 			Thread.sleep(5000);
//					a.Login();
//	 			}
//	 		}
//	 		catch(Exception kk) {}
	 		
	 		
	 		
	 	}
	 	
		@After
		public void TestFail(Scenario scenario) throws Exception
		{
			System.out.println("After Started...!");
			
			if(scenario.isFailed())
			{
				Thread.sleep(2000);
				String scnsht=((TakesScreenshot)driver.getDelegate()).getScreenshotAs(OutputType.BASE64);
				
				String s="data:image/png;base64,"+scnsht;
				
				new Driver_Manager().test.log(LogStatus.FAIL, new Driver_Manager().test.addScreenCapture(s));
				
//				final byte[] screenshot = ((TakesScreenshot) driver.getScreenshotAs(OutputType.BYTES);
//	            scenario.attach(screenshot, "image/png", scenario.getName()); 
				
//				 ExtentTestManager.getTest().addScreenCaptureFromBase64String(ut.getBase64Screenshot());
//				scenario.attach(scnsht, s, scenario.getName());
//				scenario.attach(s, scnsht, scenario.getName()); //BASE64 image not visible in Cucumber Report
				
				byte[] screenshot = ((TakesScreenshot)driver.getDelegate()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
			
			}
		}
	     
	    @AfterAll
	    public static void afterAll() throws Exception 
	    {
//	    	Feature feature = null;
//	    	String fullFeatureName = FilenameUtils.getName(scenario.getUri().toString());
//	    	String FeatureFileName=feature.getName();
	    try
	    {
	    	System.out.println("After All Started...!");
//	    	Base_DriverManagerClass.tearDown();
	    	a.LogOut();
	    	
	    	Thread.sleep(10000);
	    	
	    	
	    	new Driver_Manager().rep.endTest(new Driver_Manager().test);
	    	new Driver_Manager().rep.flush();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage()+"Report Generating...!");
	    	new Driver_Manager().rep.endTest(new Driver_Manager().test);
	    	new Driver_Manager().rep.flush();
	    }
	    }
	    
	    
	    public static String FeatureNameText()
	    {
	    	return FeatureName;
	    }
	    
	
}
