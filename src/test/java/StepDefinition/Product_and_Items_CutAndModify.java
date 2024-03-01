package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CutAndModifyPage;
import com.Pages.Driver_Manager;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Product_and_Items_CutAndModify
{

	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
//	ExtentReports Trep = ExtentManager.getInstance();
//	ExtentTest Ttest = rep.startTest("AddEditDelete Departments");
	
	
	
	
	LoginPage lgpg=new LoginPage(); 

	Utility ut=new Utility();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	CategoriesPage ctp= new CategoriesPage();

	CutAndModifyPage cam = new CutAndModifyPage();
	
	public String SecondSliceModifyPercentage;
	public String ThirdSliceModifyPercentage;
	public String FourthSliceModifyPercentage;
	
	public double SecondSliceModifyPercentage1;
	public double ThirdSliceModifyPercentage1;
	public double FourthSliceModifyPercentage1;
	

	@Given("Open the Cut and Modify home page BaseURL and StoreID")
	public void OpenCutAndModifyPage() throws Exception 
	{
		lgpg.Open_URL(Utility.getProperty("baseURL")+Utility.getProperty("store_Id1")+"cutAndModify");
	}

	@Given("Verifying the Cut and Modify Header Page")
	public void VerifyCutAndModifyHeader() throws Exception 
	{
		Thread.sleep(5000);
		cmp.VerifyMainScreenPageHeader("Cut And Modify");	
	}

	@Given("Verifying the Path Home \\/ Product\\/Items \\/ Cut and Modify Displayed above the Header")
	public void VerifyingHomePath() 
	{
		String Home = ctp.Home().getAttribute("value");
		String Path1 = ctp.Products_Items().getAttribute("value");
		String Path2 = ctp.path1().getAttribute("value");
		//String Path2 = ctp.path2().getAttribute("value");

		String total = Home+Path1+Path2;
		System.out.println(total);

		if(total.equalsIgnoreCase("Home /Products/Items / Cut And Modify")) {

			test.log(LogStatus.PASS, "Cut And Modify Home Path is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Cut And Modify Home Path is not displayed");
		}
	}

	@Then("Verify the Slice Fraction header in Cut and Modify is Displayed")
	public void VerifySliceFractionHeaderInCutAndModifyIsDisplayed()
	{
		if(driver.findElement(By.xpath("(//div[.='Slice Fraction'])[2]")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Slice Fraction Header in Cut And Modify is Displayed");
		}

		else {
			test.log(LogStatus.FAIL,"Slice Fraction Header is Not Displayed");
		}
	}
	
	@Then("Verify the Modifier Price Percentage header in Cut and Modify is Displayed")
	public void VerifytheModifierPricePercenatgeHeaderIsDisplayedOrNot()
	{
		if(driver.findElement(By.xpath("(//div[.='Modifier Price Percentage'])[2]")).isDisplayed())
		{
			test.log(LogStatus.PASS,"Modifier Price Percentage Header in Cut And Modify is Displayed");
		}

		else {
			test.log(LogStatus.FAIL,"Modifier Price Percentage is Not Displayed");
		}
	}
	
	@And("I Check Slice Second Fraction Value")
	public void CheckSliceSecondFractionValue() 
	{
		 SecondSliceModifyPercentage = cam.FirstSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ %, : ]", "0").trim();
		 test.log(LogStatus.INFO, "Second Slice Modify Value Displayed :"+SecondSliceModifyPercentage);
		 double FirstSliceModifier= Double.parseDouble(SecondSliceModifyPercentage);
		//SecondSliceModifyPercentage = Double.parseDouble(SecondSliceModify1);
		System.out.println("Second Slice Modify Value:"+FirstSliceModifier);
		test.log(LogStatus.INFO, "Second Slice Modify Value Displayed :"+FirstSliceModifier);
	}
	
	@And("I Check Slice Third Fraction Value")
	public void CheckSliceThirdFractionValue() 
	{
		ThirdSliceModifyPercentage = cam.SecondSliceModify.getAttribute("value");
		//ThirdSliceModifyPercentage = Double.parseDouble(ThirdSliceModify1);
		test.log(LogStatus.INFO,"Third Slice Modify Value Displayed :"+ThirdSliceModifyPercentage);
	}
	
	@And("I Check Slice Fourth Fraction Value")
	public void CheckSliceFourthFracttionValue() 
	{
		FourthSliceModifyPercentage = cam.ThirdSliceModify.getAttribute("value");
		//FourthSliceModifyPercentage = Double.parseDouble(FourthSliceModify1);
		test.log(LogStatus.INFO,"Fourth Slice Modify Value Displayed :"+FourthSliceModifyPercentage);
	}
	
	@And("I Click the Up Arrow for First Slice and Check the Increased Value")
	public void ClicktheUpArrowForFirstSliceAndCheckTheIncreasedValue() throws Exception 
	{
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[2]/div[2]//mat-icon)[1]")).click();
		Thread.sleep(500);
		String FirstSliceModifyAfterIncrease = cam.FirstSliceModify.getAttribute("value");
		//double ExpectedFirstSliceModify = Double.parseDouble(FirstSliceModifyAfterIncrease);
		test.log(LogStatus.INFO, "Second Slice Modify Value After Increase :"+FirstSliceModifyAfterIncrease);
		if(FirstSliceModifyAfterIncrease != SecondSliceModifyPercentage)
		{
			test.log(LogStatus.PASS,"First Slice Value Increased after Clicking UpArrow");
		}
		else 
		{
			test.log(LogStatus.FAIL,"First Slice Value Not Increased after Clicking UpArrow");
		}
		
	}
	
	@And("I Click the Up Arrow for Second Slice and Check the Increased Value")
	public void ClicktheUpArrowForSecondSliceAndCheckTheIncreasedValue() throws Exception 
	{
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[3]/div[2]//mat-icon)[1]")).click();
		Thread.sleep(500);
		String SecondSliceModifyAfterIncrease = cam.SecondSliceModify.getAttribute("value");
		//double ExpectedSecondSliceModifyAfterIncrease = Double.parseDouble(SecondSliceModifyAfterIncrease);
		test.log(LogStatus.INFO, "Second Slice Modify Value After Increase :"+SecondSliceModifyAfterIncrease);
		if(SecondSliceModifyAfterIncrease != ThirdSliceModifyPercentage)
		{
			test.log(LogStatus.PASS,"Second Slice Value Increased after Clicking UpArrow");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Second Slice Value Not Increased after Clicking UpArrow");
		}
	}
	
	@And("I Click the Up Arrow for Third Slice and Check the Increased Value")
	public void ClicktheUpArrowForThirdSliceAndCheckTheIncreasedValue() throws Exception 
	{
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[4]/div[2]//mat-icon)[1]")).click();
		Thread.sleep(500);
		String ThirdSliceModifyAfterIncrease = cam.ThirdSliceModify.getAttribute("value");
		//double ExpectedThirdSliceModifyAfterIncrease = Double.parseDouble(ThirdSliceModifyAfterIncrease);
		test.log(LogStatus.INFO, "Second Slice Modify Value After Increase :"+ThirdSliceModifyAfterIncrease);
		if(ThirdSliceModifyAfterIncrease != FourthSliceModifyPercentage)
		{
			test.log(LogStatus.PASS,"Third Slice Value Increased after Clicking UpArrow");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Third Slice Value Not Increased after Clicking UpArrow");
		}
	}
	
	@And("I Click the Down Arrow for First Slice and Check the Decreased Value")
	public void ClickDownArrowForFirstSliceAndCheckDecreasedValue() throws Exception 
	{
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[2]/div[2]//mat-icon)[2]")).click();
		Thread.sleep(500);
		String FirstSliceModifyAfterDecrease = cam.FirstSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();
	//	double ExpectedFirstSliceModify = Double.parseDouble(FirstSliceModifyAfterDecrease);
		test.log(LogStatus.INFO, "Second Slice Modify Value After Decrease :"+FirstSliceModifyAfterDecrease);
		if(FirstSliceModifyAfterDecrease == SecondSliceModifyPercentage)
		{
			test.log(LogStatus.PASS,"First Slice Value Decreased after Clicking DownArrow");
		}
		else 
		{
			test.log(LogStatus.FAIL,"First Slice Value Not Decreased after Clicking DownArrow");
		}
	}
	
	@And("I Click the Down Arrow for Second Slice and Check the Decreased Value")
	public void ClickDownArrowForSecondSliceAndCheckDecreasedValue() throws Exception
	{
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[3]/div[2]//mat-icon)[2]")).click();
		Thread.sleep(500);
		String SecondSliceModifyAfterDecrease = cam.SecondSliceModify.getAttribute("value");
		//double ExpectedSecondSliceModifyValue = Double.parseDouble(SecondSliceModifyAfterDecrease);
		test.log(LogStatus.INFO, "Second Slice Modify Value After Decrease :"+SecondSliceModifyAfterDecrease);
		if(SecondSliceModifyAfterDecrease == ThirdSliceModifyPercentage)
		{
			test.log(LogStatus.PASS,"Second Slice Value Decreased after Clicking DownArrow");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Second Slice Value Not Decreased after Clicking DownArrow");
		}
	}
	
	@And("I Click the Down Arrow for Third Slice and Check the Decreased Value")
	public void ClickDownArrowForThirdSliceAndCheckTheDecreasedValue() throws Exception 
	{
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[4]/div[2]//mat-icon)[2]")).click();
		Thread.sleep(500);
		String ThirdSliceModifyAfterDecrease = cam.ThirdSliceModify.getAttribute("value");
		//double ExpectedThirsSliceModify = Double.parseDouble(ThirdSliceModifyAfterDecrease);
		test.log(LogStatus.INFO, "Second Slice Modify Value After Increase :"+ThirdSliceModifyAfterDecrease);
		if(ThirdSliceModifyAfterDecrease == FourthSliceModifyPercentage)
		{
			test.log(LogStatus.PASS,"Third Slice Value Decreased after Clicking DownArrow");
		}
		else 
		{
			test.log(LogStatus.FAIL,"Third Slice Value Not Decreased after Clicking DownArrow");
		}
	}
	
	@And("I Enter the Second Slice Fraction Modifier Price Percentage above the Limit")
	public void EnterSecondSliceFractionModifierPriceAbovetheLimit() throws Exception 
	{
		cam.Enter_ModifyPercentage_FirstSliceFraction("150000");
	}
	
	@Then("Check Please enter less than 100 Percentage Error Message is Displayed")
	public void CheckPleaseEnterLessThan100PercenatgeErrorMessage() 
	{
		if (driver.findElement(By.xpath("//div[contains(@class,'message mx')]")).getText()
				.equalsIgnoreCase("Please enter less than 100 percentage")) {

			test.log(LogStatus.PASS, "Please enter less than 100 percentage popup is Displayed");

			ut.PassedCaptureScreenshotAsBASE64();
		} else {
			test.log(LogStatus.FAIL, "Please enter less than 100 percentage popup is not Displayed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Enter the Second Slice Fraction Modifier Price Percentage")
	public void EntertheSecondSliceFractionModifierPricePercenatge() throws Exception
	{
		cam.Enter_ModifyPercentage_FirstSliceFraction("5000");
	}
	
	@And("I Enter the Third Slice Fraction Modifier Price Percentage above the Limit")
	public void EnterThirdSliceFractionAboveLimit() throws Exception 
	{
		cam.Enter_ModifyPercentage_SecondSliceFraction("150000");
	}
	
	@And("I Enter the Third Slice Fraction Modifier Price Percentage")
	public void EntertheThirdSliceFractionModifierPricePercenatge() throws Exception 
	{
		cam.Enter_ModifyPercentage_SecondSliceFraction("5000");
	}
	
	@And("I Enter the Fourth Slice Fraction Modifier Price Percentage above the Limit")
	public void EntertheFourthSliceFractionModifierPricePercenatgeAboveLimit() throws Exception 
	{
		cam.Enter_ModifyPercentage_ThirdSliceFraction("150000");
	}
	
	@And("I Enter the Fourth Slice Fraction Modifier Price Percentage")
	public void EntertheFourthSliceFractionModifierPricePercenatge() throws Exception 
	{
		cam.Enter_ModifyPercentage_ThirdSliceFraction("5000");
	}
	
	@Then("Verify the Cut and Modify Saved Successfully or not")
	public void VerifyCutAndModifySavedOrNot() throws Exception 
	{
		Thread.sleep(2000);
		// Check whether the New Cut and modify Saved or not
		if (cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Cut and modify saved successfully")) {
			test.log(LogStatus.PASS, "Cut and modify Saved Successfully");

			ut.PassedCaptureScreenshotAsBASE64();
		} else {
			test.log(LogStatus.FAIL, "Cut and modify Save Failed");

			ut.FailedCaptureScreenshotAsBASE64();
		}
	}
	
	@And("I Change the Second Slice Fraction Modifier Price Percentage")
	public void ChangetheSecondSliceFractionModifierPricePercenatge() throws Exception 
	{
		cam.Enter_ModifyPercentage_FirstSliceFraction("3000");
	}
	
	@And("I Reload the Cut and Modify Page")
	public void ReloadCutAndModifyPage() 
	{
		driver.navigate().refresh();
	}
	
	@Then("Check the Updated Second Slice Fraction Modifier Price Percentage")
	public void CheckUpdatedSecondSliceFractionModifierPricePercentage() 
	{
		String UpdatedSecondSliceFraction = cam.FirstSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();
		double ExpectedSecondSliceFraction = Double.parseDouble(UpdatedSecondSliceFraction);
		
		if(ExpectedSecondSliceFraction == 30) {
			test.log(LogStatus.PASS, "Updated Second Slice Fraction Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Updated Second Slice Fraction Not displayed");
		}
	}
	
	@And("I Change the Third Slice Fraction Modifier Price Percentage")
	public void ChangeThirdSliceFractionModifierPricePercenatge() throws Exception 
	{
		cam.Enter_ModifyPercentage_SecondSliceFraction("5000");
	}
	
	@Then("Check the Updated Third Slice Fraction Modifier Price Percentage")
	public void CheckUpdatedThirdSliceFractionModifierPricePercentage() 
	{
		String UpdatedThirdSliceFraction = cam.SecondSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();
		double ExpectedThirdSliceFraction = Double.parseDouble(UpdatedThirdSliceFraction);
		
		if(ExpectedThirdSliceFraction == 50) {
			test.log(LogStatus.PASS, "Updated Third Slice Fraction Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Updated Third Slice Fraction Not displayed");
		}
	}
	
	@And("I Change the Fourth Slice Fraction Modifier Price Percentage")
	public void ChnagetheFourthSliceFractionModifierPricePercentage() throws Exception 
	{
		cam.Enter_ModifyPercentage_ThirdSliceFraction("5000");
	}
	
	@Then("Check the Updated Fourth Slice Fraction Modifier Price Percentage")
	public void ChecktheUpdatedFouthSliceFractionModifierPricePercentage()
	{
		String UpdatedFourthSliceFraction = cam.ThirdSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		double ExpectedFourthSliceFraction = Double.parseDouble(UpdatedFourthSliceFraction);
		
		if(ExpectedFourthSliceFraction == 50) {
			test.log(LogStatus.PASS, "Updated Fourth Slice Fraction Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Updated Fourth Slice Fraction Not displayed");
		}
	}
	
	@And("I Click the Up Arrow the Second Slice Fraction Modifier Price Percentage")
	public void ClickUpArrowSecondSliceFractionModifierPercentage() 
	{
		String SecondSliceBeforeClickingUpArrow = cam.FirstSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		SecondSliceModifyPercentage1 = Double.parseDouble(SecondSliceBeforeClickingUpArrow);
		
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[2]/div[2]//mat-icon)[1]")).click();
		
	}
	
	@Then("Check the Increased Second Slice Fraction Modifier Price Percentage")
	public void CheckIncreasedSecondSliceFractionModifierPricePercentage() 
	{
		String SecondSliceAfterClickingUpArrow = cam.FirstSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();
		double ExpectedSecondSliceFraction = Double.parseDouble(SecondSliceAfterClickingUpArrow);
		if(ExpectedSecondSliceFraction>SecondSliceModifyPercentage1) {
			test.log(LogStatus.PASS,"Second Slice Increased Value Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Second slice Updated Value Not displayed");
		}
	}
	
	@And("I Click the Up Arrow the Third Slice Fraction Modifier Price Percentage")
	public void ClickUpArrowOftheThirdSiceFractionModifierPricePercenatge() 
	{
		String SecondSliceBeforeClickingUpArrow = cam.SecondSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		ThirdSliceModifyPercentage1 = Double.parseDouble(SecondSliceBeforeClickingUpArrow);
		
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[3]/div[2]//mat-icon)[1]")).click();
	}
	
	@Then("Check the Increased Third Slice Fraction Modifier Price Percentage")
	public void CheckIncreasedThirdSliceFractionModifierPricePercenatge()
	{
		String ThirdSliceAfterClickingUpArrow = cam.SecondSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		double ExpectedThirdSliceFraction = Double.parseDouble(ThirdSliceAfterClickingUpArrow);
		if(ExpectedThirdSliceFraction>ThirdSliceModifyPercentage1) {
			test.log(LogStatus.PASS,"Third Slice Increased Value Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Third slice Updated Value Not displayed");
		}
	}
	
	@And("I Click the Up Arrow the Fourth Slice Fraction Modifier Price Percentage")
	public void ClickUpArrowFourthSliceFractionModifierPricePercenatge() 
	{
		String SourthSliceBeforeClickingUpArrow = cam.ThirdSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		FourthSliceModifyPercentage1 = Double.parseDouble(SourthSliceBeforeClickingUpArrow);
		
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[4]/div[2]//mat-icon)[1]")).click();
	}
	
	@And("Check the Increased Fourth Slice Fraction Modifier Price Percentage")
	public void CheckIncreasedFourthSliceFractionModifierPricePercenatge()
	{
		String FourthSliceAfterClickingUpArrow = cam.ThirdSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		double ExpectedFourthSliceFraction = Double.parseDouble(FourthSliceAfterClickingUpArrow);
		if(ExpectedFourthSliceFraction>FourthSliceModifyPercentage1) {
			test.log(LogStatus.PASS,"Fourth Slice Increased Value Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Fourth slice Updated Value Not displayed");
		}
	}

	@Given("I Click the Down Arrow the Second Slice Fraction Modifier Price Percentage")
	public void iClickTheDownArrowTheSecondSliceFractionModifierPricePercentage()
	{
		String SecondSliceBeforeClickingDownbArrow = cam.FirstSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		SecondSliceModifyPercentage1 = Double.parseDouble(SecondSliceBeforeClickingDownbArrow);
		
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[2]/div[2]//mat-icon)[2]")).click();
	}
	@Then("Check the Decreased Second Slice Fraction Modifier Price Percentage")
	public void checkTheDecreasedSecondSliceFractionModifierPricePercentage() 
	{
		String SecondSliceAfterClickingDownArrow = cam.FirstSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();
		double ExpectedSecondSliceFraction = Double.parseDouble(SecondSliceAfterClickingDownArrow);
		if(ExpectedSecondSliceFraction<SecondSliceModifyPercentage1) {
			test.log(LogStatus.PASS,"Second Slice Decreased Value Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Second slice Decreased Value Not displayed");
		}
	}

	@Given("I Click the Down Arrow the Fourth Slice Fraction Modifier Price Percentage")
	public void iClickTheDownArrowTheFourthSliceFractionModifierPricePercentage()
	{
		String SourthSliceBeforeClickingDownArrow = cam.ThirdSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		FourthSliceModifyPercentage1 = Double.parseDouble(SourthSliceBeforeClickingDownArrow);
		
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[4]/div[2]//mat-icon)[2]")).click();
	}
	@Then("Check the Decreased Fourth Slice Fraction Modifier Price Percentage")
	public void checkTheDecreasedFourthSliceFractionModifierPricePercentage() {
		String FourthSliceAfterClickingDownArrow = cam.ThirdSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();;
		double ExpectedFourthSliceFraction = Double.parseDouble(FourthSliceAfterClickingDownArrow);
		if(ExpectedFourthSliceFraction<FourthSliceModifyPercentage1) {
			test.log(LogStatus.PASS,"Fourth Slice Decreased Value Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Fourth slice Decreased Value Not displayed");
		}
	}

	@Given("I Click the Down Arrow the Third Slice Fraction Modifier Price Percentage")
	public void iClickTheDownArrowTheThirdSliceFractionModifierPricePercentage() {
		String SecondSliceBeforeClickingDownArrow = cam.SecondSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", " ").trim();
		ThirdSliceModifyPercentage1 = Double.parseDouble(SecondSliceBeforeClickingDownArrow);
		
		driver.findElement(By.xpath("(//div[contains(@class,'cut-and-modify')]/div[3]/div[2]//mat-icon)[2]")).click();
	}
	@Then("Check the Decreased Third Slice Fraction Modifier Price Percentage")
	public void checkTheDecreasedThirdSliceFractionModifierPricePercentage() {
		String ThirdSliceAfterClickingDownArrow = cam.SecondSliceModify.getAttribute("value").toString().replaceAll("[a-zA-Z $ ₹ % , : ]", "0").trim();
		double ExpectedThirdSliceFraction = Double.parseDouble(ThirdSliceAfterClickingDownArrow);
		if(ExpectedThirdSliceFraction<ThirdSliceModifyPercentage1) {
			test.log(LogStatus.PASS,"Third Slice Decreased Value Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Third slice Decreased Value Not displayed");
		}
	}
	
	@And("I Click the Save button in Cut and Modify")
	public void ClickSaveButtoCutandModify() 
	{
		driver.findElement(By.xpath("//button[.='SAVE']")).click();
	}

}
