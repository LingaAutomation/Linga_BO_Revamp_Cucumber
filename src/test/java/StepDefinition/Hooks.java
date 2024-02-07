package StepDefinition;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
public class Hooks 
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
	 		
	 		try
	 		{
	 		if(lgpg.LoginBtn.isDisplayed())
	 		{
	 			System.out.println("Session Expired & Application Closed...!");
	 			Thread.sleep(2000);
	 			driver.navigate().refresh();
	 			Thread.sleep(10000);
				a.Login();
	 			
	 		}
	 		}
	 		catch(Exception h) 
	 		{
	 			
	 		}
	 		
	 		
	 		
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
