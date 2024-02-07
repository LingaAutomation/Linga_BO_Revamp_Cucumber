package StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.Pages.ReportsPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.*;

public class Linga_Admin_Stores 
{


	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths();
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap=new Linga_and_Dealer_Admin_Page();
	
	ReportsPage repts=new ReportsPage();

	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
	
	String StoreName, ParentWin;
	
	@Given("I Select the Stores Tab")
	public void iSelectTheStoresTab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    lap.Select_Stores_Tab();
	}

//	@Given("Verifying the Linga Admin - Stores Path page")
//	public void verifyingTheLingaAdminStoresPathPage() {
//	    // Write code here that turns the phrase above into concrete actions
//		String home = cmp.Home.getText();
//		String path = cmp.path1.getText();
//	
//
//		String total = home+path;
//		System.out.println(total);
//
//		if(total.equalsIgnoreCase("Admin / Accounts")) {
//
//			test.log(LogStatus.PASS, "Admin Accounts Path is displayed");
//		}
//		else {
//			test.log(LogStatus.FAIL, "Admin Accounts Path is not displayed");
//		}
//	}

	@Then("Verify the Total Stores and Details Reports Displayed or not")
	public void verifyTheTotalStoresAndDetailsReportsDisplayedOrNot() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			if(repts.No_Records_FoundInfoMessage().isDisplayed())
			{
				test.log(LogStatus.INFO, "No Records Founds");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		catch(Exception k)
		{
		//Get the Total Stores
		String Total_Stores=driver.findElement(By.xpath("//span[contains(.,'Total Stores:')]")).getText().replaceAll("[a-zA-Z $ ₹ , :]", "");
//		int Total_Accounts=Integer.parseInt(Total_Accs);
		
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		for(int i=1;i<=3;i++)
		{
		
			String StoreName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
			String AccountName=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			String Plan=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
			String IndustryType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
			String BusinessType=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]")).getText();
//			String Status=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[12]")).getText();
		
		
		
			test.log(LogStatus.PASS, "Store Name : "+StoreName+" Account Name : "+AccountName+" Plan : "+Plan+" Industry Type : "+IndustryType+" Business Type : "+BusinessType);//+" Status : "+Status);
		}
		}
	}

	@Given("I Select the Business Type as Bakery")
	public void iSelectTheBusinessTypeAsBakery() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Bakery", "Bakery Business Type is Selected");

	}

	@Given("I Select the Business Type as Coffee Shop")
	public void iSelectTheBusinessTypeAsCoffeeShop() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Coffee Shop", "Coffee Shop Business Type is Selected");

	}

	@Given("I Select the Business Type as Yogurt Shops")
	public void iSelectTheBusinessTypeAsYogurtShops() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Yogurt Shops", "Yogurt Shops Business Type is Selected");

	}

@Given("I Select the Business Type as Food Trucks")
public void iSelectTheBusinessTypeAsFoodTrucks() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Food Trucks", "Food Trucks Business Type is Selected");

}

@Given("I Select the Business Type as Fine Dining")
public void iSelectTheBusinessTypeAsFineDining() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Fine Dining", "Fine Dining Business Type is Selected");

}
	
@Given("I Select the Business Type as Restaurants")
public void iSelectTheBusinessTypeAsRestaurants() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Restaurants", "Restaurants Business Type is Selected");

}

@Given("I Select the Business Type as Hotel & Resorts")
public void iSelectTheBusinessTypeAsHotelResorts() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	cmp.Click_DropDown_withSearchText(lap.Business_Type_InputBx, "Hotel & Resorts", "Hotel & Resorts Business Type is Selected");

}


@Given("I Seach the Account and Disable the Auto Update")
public void iSeachTheAccountAndDisableTheAutoUpdate() throws Exception {
    // Write code here that turns the phrase above into concrete actions
String StoreName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
    
    this.StoreName=StoreName;
    cmp.Search(StoreName);
    
    Thread.sleep(3000);
    
    
    if(driver.findElement(By.xpath("//td[contains(.,'"+StoreName+"')]/..//mat-slide-toggle")).isEnabled())
    {
    	driver.findElement(By.xpath("//td[contains(.,'"+StoreName+"')]/..//mat-slide-toggle")).click();
    }
}
@Given("I Verify the Updated Successfully or not")
public void iVerifyTheUpdatedSuccessfullyOrNot() throws Exception {
    // Write code here that turns the phrase above into concrete actions
   cmp.VerifySaveConfirmationAlertMessage("Updated");
}
@Given("I Seach the Account and Enable the Auto Update")
public void iSeachTheAccountAndEnableTheAutoUpdate() throws Exception {
    // Write code here that turns the phrase above into concrete actions
String StoreName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
    
    this.StoreName=StoreName;
    cmp.Search(StoreName);
    
    Thread.sleep(3000);
    
    
    if(driver.findElement(By.xpath("//td[contains(.,'"+StoreName+"')]/..//mat-slide-toggle")).isEnabled())
    {
    	
    }
    else
    {
    	driver.findElement(By.xpath("//td[contains(.,'"+StoreName+"')]/..//mat-slide-toggle")).click();
    }
}

@Given("I Search and Select the Store Name")
public void iSearchAndSelectTheStoreName() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 String StoreName=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
	    cmp.Search(StoreName);
	    
	    driver.findElement(By.xpath("//td/span[contains(.,'"+StoreName+"')]")).click();
	    
	    String parentWin=driver.getWindowHandle();
	    this.ParentWin=parentWin;
	    Set<String> childWins=driver.getWindowHandles();
	    
	    for(String ChildWin:childWins)
	    {
	    	if(!childWins.equals(parentWin))
	    	{
	    		driver.switchTo().window(ChildWin);
	    	}
	    }
}




@Then("Verifying the Store Details Header Page")
public void verifyingTheStoreDetailsHeaderPage() {
    // Write code here that turns the phrase above into concrete actions
    cmp.VerifyMainScreenPageHeader("Store Detail");
}



}
