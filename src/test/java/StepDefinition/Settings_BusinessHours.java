package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.Availability_RestrictionTimePage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.GratuitiesPage;
import com.Pages.LoginPage;
import com.Pages.Settings_Businesshours_Page;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Settings_BusinessHours 
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Settings_Businesshours_Page bh = new Settings_Businesshours_Page();
	
	@Given("Open Business Hours home page BaseURL and StoreID")
	public void OpenBusinessHoursHomepage() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id2")+"storeHours");
	}

	@Given("Verifying the Business Hours Header Page")
	public void verifyingTheBusinessHoursHeaderPage() throws Exception 
	{
		Thread.sleep(5000);
		try {
			if(driver.findElement(By.xpath("//h3[contains(.,'Business Hours')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "Business Hours page is loaded successfully");
			}
		}catch(Exception E) {
			test.log(LogStatus.FAIL, "Business Hours page is not loaded");
		}
	}

	@Given("Verify Store Hours is Selected or Not")
	public void verifyStoreHoursIsSelectedOrNot() 
	{
	  if(bh.Store_hours.isSelected()) {
		  test.log(LogStatus.PASS,"Store Hours Field is Selected By Default");
	  }
	  else {
		  test.log(LogStatus.FAIL,"Store Hours Field is Not Selected");
	  }
	}
	@Given("Click on Store Hours Field")
	public void clickOnStoreHoursField() 
	{
	   bh.Navigating_StoreHours();
	}
	@Then("Verify Day Field is Displayed or Not")
	public void verifyDayFieldIsDisplayedOrNot()
	{
	  if(driver.findElement(By.xpath("//app-input-table/div/div[1]/div[1]")).isDisplayed()) 
	  {
		  test.log(LogStatus.PASS,"Days Field is Displayed");
	  }
	  else {
		  test.log(LogStatus.FAIL,"Days Field is Not Displayed");
	  }
	}
	@Then("Verify Open or Closed Field is Displayed or Not")
	public void verifyOpenOrClosedFieldIsDisplayedOrNot() 
	{
		 if(driver.findElement(By.xpath("//app-input-table/div/div[1]/div[2]")).isDisplayed()) 
		  {
			  test.log(LogStatus.PASS,"Open or Closed Field is Displayed");
		  }
		  else {
			  test.log(LogStatus.FAIL,"Open or Closed Field is Not Displayed");
		  }
	}
	@Then("Verify Open at Field is Displayed or Not")
	public void verifyOpenAtFieldIsDisplayedOrNot() 
	{
		 if(driver.findElement(By.xpath("//app-input-table/div/div[1]/div[3]")).isDisplayed()) 
		  {
			  test.log(LogStatus.PASS,"Open at Field is Displayed");
		  }
		  else {
			  test.log(LogStatus.FAIL,"Open at Field is Not Displayed");
		  }
	}
	@Then("Verify Closed at Field is Displayed or Not")
	public void verifyClosedAtFieldIsDisplayedOrNot() 
	{
		 if(driver.findElement(By.xpath("//app-input-table/div/div[1]/div[4]")).isDisplayed()) 
		  {
			  test.log(LogStatus.PASS,"Closed at Field is Displayed");
		  }
		  else {
			  test.log(LogStatus.FAIL,"Closed at Field is Not Displayed");
		  }
	}

	@Given("Select Sunday as Closed")
	public void selectSundayAsClosed() throws Exception
	{
		    Thread.sleep(2000);
			WebElement Sunclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div[2]"));
			Sunclosed.click();
			Thread.sleep(1000);
			bh.Closed.click();
	}
	@Then("Verify Open at Closed at Displayed or Not")
	public void verifyOpenAtClosedAtDisplayedOrNot() throws Exception
	{
		try {
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		}
		catch (Exception e) 
		{
			System.out.println("The store is closed Today not able to select open time for sunday");
		}
		Thread.sleep(1000);
		
        try 
		{
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		} 
		catch (Exception e) {
			System.out.println("The store is closed Today not able to select closed time for sunday");
		}
         Thread.sleep(2000);
		
	}
	@Then("Verify Bussiness Hours Updated or Not")
	public void verifyBussinessHoursUpdatedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Store Updated Successfully"))
 		{
 			test.log(LogStatus.PASS, "Store hours updated for closed sunday");

 			ut.PassedCaptureScreenshotAsBASE64();
 		}
 		else
 		{
 			test.log(LogStatus.FAIL, "Store hours updation failed for Closed Sunday");

 			ut.FailedCaptureScreenshotAsBASE64();
 		}	
	}

	@Given("Select Sunday as Opened")
	public void selectSundayAsOpened() throws Exception
	{
		 Thread.sleep(2000);
			WebElement SunOpened = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div[2]"));
			SunOpened.click();
			Thread.sleep(1000);
			bh.Open.click();
	}
	@Then("Select Open at Time")
	public void selectOpenAtTime() throws Exception
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	
	}
	@Then("Select Closed at Time")
	public void selectClosedAtTime() throws Exception 
	{
		WebElement Closedat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Closedat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a1 = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a1.PM_Btn.click();

		Thread.sleep(500);
		a1.OK_TimePickerBtn.click();
	}

	@Given("Select Monday as Closed")
	public void selectMondayAsClosed() throws Exception
	{
		 Thread.sleep(2000);
			WebElement Mondayclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div[2]"));
			Mondayclosed.click();
			Thread.sleep(1000);
			bh.Closed.click();
	}

	@Then("Verify For Monday Open at Closed at Displayed or Not")
	public void VerifyMondayOpenatClosedatDisplayedorNot() throws Exception
	{
		try {
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		}
		catch (Exception e) 
		{
			System.out.println("The store is closed Today not able to select open time for sunday");
		}
		Thread.sleep(1000);
		
        try 
		{
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		} 
		catch (Exception e) {
			System.out.println("The store is closed Today not able to select closed time for sunday");
		}
         Thread.sleep(2000);
		
	}
	@Given("Select Monday as Opened")
	public void selectMondayAsOpened() throws Exception
	{
		Thread.sleep(2000);
		WebElement MondayOpened = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div[2]"));
		MondayOpened.click();
		Thread.sleep(1000);
		bh.Open.click();
	}
  
	@And("Select Monday Open at Time")
	public void SelectMondayOpenAtTime() throws Exception 
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	
	}
	
	@And("Select Monday Closed at Time")
	public void SelectMondayClosedatime() throws Exception {
	
	WebElement Closedat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
	Closedat.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
	Availability_RestrictionTimePage a1 = new Availability_RestrictionTimePage();

	Thread.sleep(1000);
	a1.PM_Btn.click();

	Thread.sleep(500);
	a1.OK_TimePickerBtn.click();
	}

	@Given("Select Tuesday as Closed")
	public void selectTuesdayAsClosed() throws Exception 
	{
		Thread.sleep(2000);
		WebElement Tuesdayclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div[2]"));
		Tuesdayclosed.click();
		Thread.sleep(1000);
		bh.Closed.click();
	}
	
	@Then("Verify For Tuesday Open at Closed at Displayed or Not")
	public void VerifyForTuesdayOpenatAndClosedatDisplayedorNot() throws Exception 
	{
		try {
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		}
		catch (Exception e) 
		{
			System.out.println("The store is closed Today not able to select open time for sunday");
		}
		Thread.sleep(1000);
		
        try 
		{
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		} 
		catch (Exception e) {
			System.out.println("The store is closed Today not able to select closed time for sunday");
		}
         Thread.sleep(2000);
	}
	
	@Given("Select Tuesday as Opened")
	public void selectTuesdayAsOpened() throws Exception 
	{
		Thread.sleep(2000);
		WebElement Tuesdayclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div[2]"));
		Tuesdayclosed.click();
		Thread.sleep(1000);
		bh.Open.click();
	}
	
	@And("Select Tuesday Open at Time")
	public void SelectTuesdayOpenAttime() throws Exception
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	
	}
	
	@And("Select Tuesday Closed at Time")
	public void SelectTuesdayClosedAttime() throws Exception
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	
	}
	

	@Given("Select Wednesday as Closed")
	public void selectWednesdayAsClosed() throws Exception
	{
		Thread.sleep(2000);
		WebElement Wednesdayclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div[2]"));
		Wednesdayclosed.click();
		Thread.sleep(1000);
		bh.Closed.click();
	}
	
	@Then("Verify Wednesday Open at Closed at Displayed or Not")
	public void VerifyWednesdayOpenAtClosedatDisplayedOrNot() throws Exception 
	{
		try {
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		}
		catch (Exception e) 
		{
			System.out.println("The store is closed Today not able to select open time for sunday");
		}
		Thread.sleep(1000);
		
        try 
		{
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		} 
		catch (Exception e) {
			System.out.println("The store is closed Today not able to select closed time for sunday");
		}
         Thread.sleep(2000);
	}

	@Given("Select Wednesday as Opened")
	public void selectWednesdayAsOpened() throws Exception 
	{
		Thread.sleep(2000);
		WebElement WednesdayOpened = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div[2]"));
		WednesdayOpened.click();
		Thread.sleep(1000);
		bh.Open.click();
	}
	
	@And("Select Wednesday Open at Time")
	public void SelectWednesdayOpenatTime() throws Exception
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	
	@And("Select Wednesday Closed at Time")
	public void SelectWednesdayClosedatTime() throws Exception
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	
	

	@Given("Select Thursday as Closed")
	public void selectThursdayAsClosed() throws Exception 
	{
		Thread.sleep(2000);
		WebElement Thursdayclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[6]/div[2]"));
		Thursdayclosed.click();
		Thread.sleep(1000);
		bh.Closed.click();
	}
	
	@Then("Verify Thursday Open at Closed at Displayed or Not")
	public void VerifyThursdayOpenAtClosedAtDisplayedOrNot() throws Exception 
	{
		try {
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[6]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		}
		catch (Exception e) 
		{
			System.out.println("The store is closed Today not able to select open time for sunday");
		}
		Thread.sleep(1000);
		
        try 
		{
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[6]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		} 
		catch (Exception e) {
			System.out.println("The store is closed Today not able to select closed time for sunday");
		}
         Thread.sleep(2000);
	}

	@Given("Select Thursday as Opened")
	public void selectThursdayAsOpened() throws Exception 
	{
		Thread.sleep(2000);
		WebElement ThursdayOpened = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[6]/div[2]"));
		ThursdayOpened.click();
		Thread.sleep(1000);
		bh.Open.click();
	}
	
	@And("Select Thursday Open at Time")
	public void SelectThursdayOpenAtTime() throws Exception 
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[6]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	
	@And("Select Thursday Closed at Time")
	public void SelectThursdayClosedAtTime() throws Exception 
	{
		WebElement Closedat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[6]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Closedat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}

	@Given("Select Friday as Closed")
	public void selectFridayAsClosed() throws Exception 
	{
		Thread.sleep(2000);
		WebElement Fridayclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[7]/div[2]"));
		Fridayclosed.click();
		Thread.sleep(1000);
		bh.Closed.click();
	}

	@Then("Verify Friday Open at Closed at Displayed or Not")
	public void VerifyFridayOpenAtClosedAtDisplayedOrNot() throws Exception
	{
		try {
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[7]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		}
		catch (Exception e) 
		{
			System.out.println("The store is closed Today not able to select open time for sunday");
		}
		Thread.sleep(1000);
		
        try 
		{
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[7]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		} 
		catch (Exception e) {
			System.out.println("The store is closed Today not able to select closed time for sunday");
		}
         Thread.sleep(2000);
	}
	@Given("Select Friday as Opened")
	public void selectFridayAsOpened() throws Exception 
	{
		Thread.sleep(2000);
		WebElement FridayOpened = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[7]/div[2]"));
		FridayOpened.click();
		Thread.sleep(1000);
		bh.Open.click();
	}
	
	@And("Select Friday Open at Time")
	public void SelectFridayOpenAtTime() throws Exception 
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[7]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	
	@And("Select Friday Closed at Time")
	public void SelectFridayClosedAtTime() throws Exception 
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[7]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	
	@Given("Select Saturday as Closed")
	public void selectSaturdayAsClosed() throws Exception 
	{
	   Thread.sleep(2000);
		WebElement Saturdayclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[8]/div[2]"));
		Saturdayclosed.click();
		Thread.sleep(1000);
		bh.Closed.click();
	}
	
	@Then("Verify Saturday Open at Closed at Displayed or Not")
	public void VerifySaturdayOpenAtClosedAtDisplayedorNot() throws Exception 
	{
		try {
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[8]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		}
		catch (Exception e) 
		{
			System.out.println("The store is closed Today not able to select open time for sunday");
		}
		Thread.sleep(1000);
		
        try 
		{
			if(driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[8]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon")).isDisplayed()) {

			}
		} 
		catch (Exception e) {
			System.out.println("The store is closed Today not able to select closed time for sunday");
		}
         Thread.sleep(2000);
	}

	@Given("Select Saturday as Opened")
	public void selectSaturdayAsOpened() throws Exception 
	{
		Thread.sleep(2000);
		WebElement Saturdayclosed = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[8]/div[2]"));
		Saturdayclosed.click();
		Thread.sleep(1000);
		bh.Open.click();
	}
	
	@And("Select Saturday Open at Time")
	public void SelectSaturdayOpenAtTime() throws Exception
	{
		WebElement Openat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[8]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Openat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	
	@And("Select Saturday Closed at Time")
	public void SelectSaturdayClosedAtTime() throws Exception
	{
		WebElement Closedat = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[8]/div[4]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div/mat-icon"));
		Closedat.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();

		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}

	@Then("Verify Require Confirmation Before Closing Day Toggle is Displayed or Not")
	public void verifyRequireConfirmationBeforeClosingDayToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(bh.Closing_Conf_YesToggle, "Require Confirmation Before Closing");
	}
	@Then("Verify Close All Active Tills Toggle is Displayed or Not")
	public void verifyCloseAllActiveTillsToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(bh.Close_Till_YesToggle, "Close All Active Tills");
	}
	@Then("Verify Close All Active Employees Toggle is Displayed or Not")
	public void verifyCloseAllActiveEmployeesToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(bh.Close_ActiveEmp_YesToggle, "Close All Active Employees");
	}
	@Then("Verify Close Opened Checks Toggle is Displayed or Not")
	public void verifyCloseOpenedChecksToggleIsDisplayedOrNot() throws Exception
	{
		cmp.Check_Element_or_Text_Displayed(bh.Close_Check_YesToggle, "Close Opened Checks Toggle");
	}
	@Then("Verify Closing Opened Checks Toggle is Displayed or Not")
	public void verifyClosingOpenedChecksToggleIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(bh.Close_Check_CashToggle, "Closing Opened Checks Toggle");
	}

	@Given("Enable Require Confirmation Before Closing Day")
	public void enableRequireConfirmationBeforeClosingDay()
	{
	   bh.Closing_Conf_YesToggle.click();
	}
	@Then("Verify the Confirmation Alert Message")
	public void verifyTheConfirmationAlertMessage()
	{
		Common_XPaths cmp = new Common_XPaths();
		cmp.Alert_PopupMsg("Enabling this function will stop closing your day automatically, this is only recommended for 24 hour operations, enabling this function will require you to close the day manually every day. If the day is not closed manually multiple days will merge into single day.");
	}
	@Then("Disable Require Confirmation Before Closing Day")
	public void disableRequireConfirmationBeforeClosingDay()
	{
		bh.Closing_Conf_NoToggle.click();
	}
	
	@Given("Disable Close All Active Tills Toggle")
	public void disableCloseAllActiveTillsToggle() 
	{
	    bh.Close_Till_NoToggle.click();
	}
	@Then("Enable Close All Active Tills Toggle")
	public void enableCloseAllActiveTillsToggle()
	{
		bh.Close_Till_YesToggle.click();
	}


	@Given("Disable Close All Active Employees Toggle")
	public void disableCloseAllActiveEmployeesToggle() 
	{
	    bh.Close_ActiveEmp_NoToggle.click();
	}
	@Then("Enable Close All Active Employees Toggle")
	public void enableCloseAllActiveEmployeesToggle() 
	{
		bh.Close_ActiveEmp_YesToggle.click();
	}

	@Given("Disable Close Opened Check Toggle")
	public void disableCloseOpenedCheckToggle()
	{
	   bh.Close_Check_NoToggle.click();
	}
	@Then("Enable Close Opened Check Toggle")
	public void enableCloseOpenedCheckToggle()
	{
		bh.Close_Check_YesToggle.click();
	}
	

	@Given("Select Closing Opened Checks Toggle as Cash")
	public void selectClosingOpenedChecksToggleAsCash() 
	{
	   bh.Close_Check_CashToggle.click();
	}


	@Given("Select Closing Opened Checks Toggle as Void")
	public void selectClosingOpenedChecksToggleAsVoid()
	{
		 bh.Close_Check_VoidToggle.click();
	}

	@Given("Click on Shifts")
	public void clickOnShifts() throws Exception 
	{
	   bh.Clicking_Shift();
	}
	@Then("Verify Shift Name Field is Displayed or Not")
	public void verifyShiftNameFieldIsDisplayedOrNot() throws Exception 
	{
		cmp.Check_Element_or_Text_Displayed(driver.findElement(By.xpath("//app-input-table/div/div[1]/div[1]")), "Shift Name Field");
	}
	
	@Given("Enter the Shift Name")
	public void enterTheShiftName() throws Exception 
	{
	   try {
		   
			WebElement ShiftName = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
			Thread.sleep(3000);
			ShiftName.click();
			ShiftName.clear();
			Thread.sleep(3000);
			ShiftName.sendKeys("Breakfast");
	   }
	   catch (Exception e) 
	   {
		   bh.Add_Shift.click();
			Thread.sleep(1000);
		   WebElement ShiftName = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
			Thread.sleep(3000);
			ShiftName.click();
			ShiftName.clear();
			Thread.sleep(3000);
			ShiftName.sendKeys("Breakfast");
	   }
	}
	@Then("Enter Open at Time")
	public void enterOpenAtTime() throws Exception 
	{
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();
		driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div[2]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-240deg);']")).click();
		

		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	@Then("Enter Closed at Time")
	public void enterClosedAtTime() throws Exception
	{
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();
		driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[2]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-300deg);']")).click();
		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	@Then("Verify Shift Updated or Not")
	public void verifyShiftUpdatedOrNot() throws Exception
	{
		Thread.sleep(2000);
 		//Check whether Business hours are Updated  or not
 		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Shift Saved Successfully"))
 		{
 			test.log(LogStatus.PASS, "Shift hours Saved");

 			ut.PassedCaptureScreenshotAsBASE64();
 		}
 		else
 		{
 			test.log(LogStatus.FAIL, "Shift hours Saving failed");

 			ut.FailedCaptureScreenshotAsBASE64();
 		}
 		Thread.sleep(3000);
	}
	@Given("Enter the Second Shift Name")
	public void enterTheSecondShiftName() throws Exception 
	{
	  try {
		 
			WebElement ShiftName = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
			Thread.sleep(3000);
			ShiftName.click();
			ShiftName.clear();
			Thread.sleep(3000);
			ShiftName.sendKeys("Lunch");
	  }
	  catch (Exception e) 
	  {
		  bh.Add_Shift.click();
			Thread.sleep(1000);
		  WebElement ShiftName = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
			Thread.sleep(3000);
			ShiftName.click();
			ShiftName.clear();
			Thread.sleep(3000);
			ShiftName.sendKeys("Lunch");
	}
	}
	@Then("Enter Second shift Open at Time")
	public void enterSecondShiftOpenAtTime() throws Exception 
	{
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();
		driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div[2]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-330deg);']")).click();
		Thread.sleep(1000);
		a.AM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	@Then("Enter Second Closed at Time")
	public void enterSecondClosedAtTime() throws Exception 
	{
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();
		driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[3]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-60deg);']")).click();
		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	
	@Given("Enter the Third Shift Name")
	public void enterTheThirdShiftName() throws Exception 
	{
	   try 
	   {
			WebElement ShiftName = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
			Thread.sleep(3000);
			ShiftName.click();
			ShiftName.clear();
			Thread.sleep(3000);
			ShiftName.sendKeys("Dinner");
	   }
	   catch (Exception e) 
	   {
		   bh.Add_Shift.click();
			Thread.sleep(1000);
		   WebElement ShiftName = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
			Thread.sleep(3000);
			ShiftName.click();
			ShiftName.clear();
			Thread.sleep(3000);
			ShiftName.sendKeys("Dinner");
	   }
	}
	@Then("Enter Third shift Open at Time")
	public void enterThirdShiftOpenAtTime() throws Exception 
	{
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();
		driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div[2]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-180deg);']")).click();
		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	@Then("Enter Third Closed at Time")
	public void enterThirdClosedAtTime() throws Exception 
	{
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();
		driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[4]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	
	@Given("Click on Add Shift button")
	public void Adding_Shift() throws Exception 
	{
		bh.Add_Shift.click();
	}
	
	@Given("Enter the Fourth Shift Name")
	public void enterTheFourthShiftName() throws Exception 
	{
		WebElement ShiftName = driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div/app-input/div/div/mat-form-field/div/div/div[4]/input"));
		Thread.sleep(3000);
		ShiftName.click();
		ShiftName.clear();
		Thread.sleep(3000);
		ShiftName.sendKeys("sgddbh");
	}
	@Then("Enter Fourth shift Open at Time")
	public void enterFourthShiftOpenAtTime() throws Exception
	{
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();
		driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div[2]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-180deg);']")).click();
		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}
	@Then("Enter Fourth Closed at Time")
	public void enterFourthClosedAtTime() throws Exception
	{
		Availability_RestrictionTimePage a = new Availability_RestrictionTimePage();
		driver.findElement(By.xpath("//div[@class='form-card store-hours']/form/div[5]/div/div[2]/div/app-input-table/div/div[5]/div[3]/app-time-picker/div/app-input/div/div/mat-form-field/div/div[1]/div[5]/div")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@style='transform: rotateZ(-270deg);']")).click();
		Thread.sleep(1000);
		a.PM_Btn.click();

		Thread.sleep(500);
		a.OK_TimePickerBtn.click();
	}

	@Given("Click on Delete the Added Shift")
	public void clickOnDeleteTheAddedShift() 
	{
		bh.Delete.click();
		Common_XPaths cmp = new Common_XPaths();
		cmp.Alert_PopupMsg("Are you sure you want to delete this item?");
	}
	@Then("Verify Shift is Deleted After Clicking on Cancel")
	public void verifyShiftIsDeletedAfterClickingOnCancel()
	{
		try {
	   if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Shift Removed Successfully")) 
	   {
		   test.log(LogStatus.PASS,"Shift Removed Successfully");
	   }
		}
	   catch (Exception e) 
	  {
		test.log(LogStatus.INFO,"Shift not Removed After Clicking on Cancel");
	}
	}

	@Then("Verify Shift is Deleted or Not")
	public void verifyShiftIsDeletedOrNot() 
	{
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Shift Removed Successfully")) 
		   {
			   test.log(LogStatus.PASS,"Shift Removed Successfully");
		   }
		else {
			test.log(LogStatus.FAIL,"Shift Not Removed Successfully");
		}
	}


    @And("I Click the Update button Business Hours")
    public void ClickUpdateButton() 
    {
    	driver.findElement(By.xpath("//button[.=' UPDATE ']")).click();
    }


    @Then("Verify Open at Field is Displayed or Not in Shifts")
    public void VerifyOpenAtFieldIsDisplayedOrNotInShifts() 
    {
    	if(driver.findElement(By.xpath("//app-input-table/div/div[1]/div[2]")).isDisplayed()) 
		  {
			  test.log(LogStatus.PASS,"Open at Field is Displayed");
		  }
		  else {
			  test.log(LogStatus.FAIL,"Open at Field is Not Displayed");
		  }
    }


    @Then("Verify Closed at Field is Displayed or Not in Shifts")
    public void VerifyClosedAtFieldIsDisplayedOrNotInShifts() 
    {
    	if(driver.findElement(By.xpath("//app-input-table/div/div[1]/div[3]")).isDisplayed()) 
		  {
			  test.log(LogStatus.PASS,"Closed at Field is Displayed");
		  }
		  else {
			  test.log(LogStatus.FAIL,"Closed at Field is Not Displayed");
		  }
    }






}
