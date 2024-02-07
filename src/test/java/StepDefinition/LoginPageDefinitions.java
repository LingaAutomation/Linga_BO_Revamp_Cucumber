package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageDefinitions 
{
	
	public SelfHealingDriver driver;
	public ExtentTest test;
	
	LoginPage a=new LoginPage();

	
	@Given("^Open the Browser and Enter \"([^\"]*)\"$")
	public void open_the_Browser_and_Enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(chromeOptions);
//		//Wait for 30 seconds
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//Maximize the Chrome window
//		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Launch the URL
		driver.get(Utility.getProperty("appURL"));
	}
	
	@And("^Verify the Login Page$")
	public void verify_the_Login_Page()
	{
		verify_the_Login_Page();;
	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		
		a.Login(Utility.getProperty("userName"), Utility.getProperty("password"));
		
	}

	@Then("^Click the Login button$")
	public void click_the_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Clicking login button");
	}

}
