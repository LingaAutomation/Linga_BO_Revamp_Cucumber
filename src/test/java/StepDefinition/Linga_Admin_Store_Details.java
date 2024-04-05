package StepDefinition;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.Driver_Manager;
import com.Pages.Linga_and_Dealer_Admin_Page;
import com.Pages.LoginPage;
import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Linga_Admin_Store_Details 
{
	SelfHealingDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;

	LoginPage lgpg=new LoginPage(); 
	public String parentWindow;


	Utility ut=new Utility();
	CategoriesPage ctp = new CategoriesPage();

	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	Linga_and_Dealer_Admin_Page lap = new Linga_and_Dealer_Admin_Page();

	
	@Given("Open the Linga Store Details home page BaseURL and StoreID")
	public void OpenLingaStoreDetailsHomePage() throws Exception
	{
		lgpg.Open_URL(Utility.getProperty("Admin_Base_URL")+"accounts");
		Thread.sleep(5000);
	}
	
	@And("Check the Oracle PMS Integration Toggle is Displayed")
	public void CheckOraclePMSToggleIsDispalyed() 
	{
		if(lap.PMSIntegrationToggle.isDisplayed()) {
			test.log(LogStatus.PASS,"Oracle PMS Integration Toggle is Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL,"Oracle PMS Toggle Is Not displayed");
		}
	}
	
	@And("Check the Emaar Integration Toggle is Displayed")
	public void CheckEmaarIntegrationToggleIsDisplayed() 
	{
		if(lap.EmaarIntegrationToggle.isDisplayed())
		{
			test.log(LogStatus.PASS,"Emaar Integration Toggle Is Displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Emaar Integration Toggle Is not Displayed");
		}
	}
	
	@And("Check the Moneris Toggle is Displayed")
	public void ChechMonerisToggleIsDisplayed() 
	{
		if(lap.MonerisToggle.isDisplayed())
		{
			test.log(LogStatus.PASS,"Moneris Toggle Is Displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Moneris Toggle Is not Displayed");
		}
	}

	@Given("Check the Ingenico Toggle is Displayed")
	public void checkTheIngenicoToggleIsDisplayed() {
	   if(lap.Ingenico_YesToggle.isDisplayed()) {
		   test.log(LogStatus.PASS,"Ingenico Toggle Is Displayed");
	   }
	   else {
		   test.log(LogStatus.FAIL,"Ingenico Toggle is Not Displayed");
	   }
	}
	@Given("Check the Digital Gator Toggle is Displayed")
	public void checkTheDigitalGatorToggleIsDisplayed() {
	   if(lap.DigitalGatorToggle.isDisplayed()) {
		   test.log(LogStatus.PASS,"Digital Gator Toggle Is Displayed");
	   }
	   else {
		   test.log(LogStatus.FAIL, "Digital Gator Toggle is Not displayed");
	   }
	}
	@Given("Check the Check Out Toggle is Displayed")
	public void checkTheCheckOutToggleIsDisplayed() {
	  if(lap.CheckOutToggle.isDisplayed()) {
		  test.log(LogStatus.PASS, "CheckOut Toggle Is Displayed");
	  }
	  else{
		  test.log(LogStatus.FAIL,"Check out Toggle is Not displayed");
	  }
	}
	@Given("Check the Evertec Toggle is Displayed")
	public void checkTheEvertecToggleIsDisplayed() {
	   if(lap.Evertec.isDisplayed()) {
		   test.log(LogStatus.PASS,"Evertec Toggle is Displayed");
	   }
	   else {
		   test.log(LogStatus.FAIL,"Evertec Toggle is Not displayed");
	   }
	}
	@Given("Check the Ingenico TR Cash Toggle is Displayed")
	public void checkTheIngenicoTRCashToggleIsDisplayed() {
	    if(lap.IngenicoTRCash_NoToggle.isDisplayed()) {
	    	test.log(LogStatus.PASS,"Ingenico TR Cash Toggle Displayed");
	    }
	    else {
	    	test.log(LogStatus.FAIL,"Ingenico TR Cash Toggle Not Displayed");
	    }
	}
	@Given("Check the PayPal Toggle is Displayed")
	public void checkThePayPalToggleIsDisplayed() {
	   if(lap.PaypalToggle.isDisplayed()) 
	   {
		   test.log(LogStatus.PASS,"Paypal Toggle Is displayed");
	   }
	   else {
		   test.log(LogStatus.FAIL,"Paypal Toggle is Not Displayed");
	   }
	}
	@Given("Check the Venmo Toggle is Displayed")
	public void checkTheVenmoToggleIsDisplayed() {
	   if(lap.VenmoToggle.isDisplayed()) {
		   test.log(LogStatus.PASS,"Venmo Toggle is Displayed");
	   }
	   else {
		   test.log(LogStatus.FAIL,"Venmo Toggle Is Not Displayed");
	   }
	}
	@Given("Check the LPG Toggle is Displayed")
	public void checkTheLPGToggleIsDisplayed() {
	   if(lap.LPGToggle.isDisplayed()) {
		   test.log(LogStatus.PASS,"LPG Toggle Is Displayed");
	   }
	   else {
		   test.log(LogStatus.FAIL,"LPG Toggle is not Displayed");
	   }
	}
	@Given("Check the PMS Aspire Toggle is Displayed")
	public void checkThePMSAspireToggleIsDisplayed() {
	   if(lap.PMSAspireToggle.isDisplayed()) {
		   test.log(LogStatus.PASS, "PMSAspire Toggle is Displayed");
	   }
	   else {
		   test.log(LogStatus.FAIL,"PMS Toggle Is Not Displayed");
	   }
	}

	@Given("I Enable the Oracle PMS Integration Toggle")
	public void iEnableTheOraclePMSIntegrationToggle() 
	{
	    cmp.Enable_Toggle(lap.PMSIntegration_YesToggle,"PMS Integration");
	}
	@Then("I Enter the IP Address")
	public void iEnterTheIPAddress() throws Exception 
	{
	    lap.IpAddress_InputBox.clear();
	    Thread.sleep(500);
	    lap.IpAddress_InputBox.sendKeys("102.34.21.01");
	}

	@Given("I clear the Ip Address")
	public void iClearTheIpAddress()
	{
		 lap.IpAddress_InputBox.clear();
	}
//	@Given("I Enter the Port Number")
//	public void iEnterThePortNumber() throws Exception 
//	{
//	  lap.Port.clear();
//	  Thread.sleep(500);
//	  lap.Port.sendKeys("2");
//	}
//	@Given("I Click the Update button")
//	public void iClickTheUpdateButton() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@Then("I Disable the Oracle PMS Integration Toggle")
	public void iDisableTheOraclePMSIntegrationToggle() 
	{
	    cmp.Disable_Toggle(lap.PMSIntegration_YesToggle,lap.PMSIntegration_NoToggle,"PMS Integration");
	}

	@Given("I Enter the Unit No")
	public void iEnterTheUnitNo() throws Exception 
	{
	   lap.Unit_No.clear();
	   Thread.sleep(500);
	   lap.Unit_No.sendKeys("5");
	}
	@Given("I Enter the Lease Code")
	public void iEnterTheLeaseCode() throws Exception 
	{
	    lap.Leasecode.clear();
	    Thread.sleep(500);
	    lap.Leasecode.sendKeys(RandomStringUtils.randomAlphanumeric(6));
	}

	@Given("I Enter the X-API-Key")
	public void iEnterTheXAPIKey() throws Exception
	{
	  lap.XAPIKey.clear();
	  Thread.sleep(500);
	  lap.XAPIKey.sendKeys(RandomStringUtils.randomNumeric(5));
	}
	
	@Then("Verify Emaar Credentials Saved or Not")
	public void verifyEmaarCredentialsSavedOrNot()
	{
	   if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Emaar Credentials Saved Successfully"))
	   {
		   test.log(LogStatus.PASS,"Emaar Credentials Saved Successfully");
	   }
	   else {
		   test.log(LogStatus.FAIL,"Emaar Credentials Not Saved Successfully");
	   }
	}

	@Given("I Enable the Moneris Toggle")
	public void iEnableTheMonerisToggle() 
	{
	    cmp.Enable_Toggle(lap.Moneris_YesToggle, "Moneris Toggle");
	}
	@Then("I Disable the Moneris Toggle")
	public void iDisableTheMonerisToggle() 
	{
	    cmp.Disable_Toggle(lap.Moneris_YesToggle, lap.Moneris_NoToggle,"Moneris Toggle");
	}

	@Given("I Enable the Digital Gator Toggle")
	public void iEnableTheDigitalGatorToggle() 
	{
	   cmp.Enable_Toggle(lap.DigitalGator_YesToggle, "Digital Gator Toggle");
	}
	@Then("I Enable SMS Configuration Toggle")
	public void iEnableSMSConfigurationToggle()
	{
	    driver.findElement(By.xpath("//span[contains(.,' SMS Configuration ')]")).click();
	}
	@Then("I Enter the SMS Review Template ID")
	public void iEnterTheSMSReviewTemplateID() throws Exception 
	{
	   lap.SMSReviewTemplateID.clear();
	   Thread.sleep(500);
	   lap.SMSReviewTemplateID.sendKeys(RandomStringUtils.randomAlphanumeric(5));
	}
	@Then("I Enter the Email Review Template ID")
	public void iEnterTheEmailReviewTemplateID() throws Exception 
	{
	  lap.EmailReviewTemplateID.clear();
	  Thread.sleep(500);
	  lap.EmailReviewTemplateID.sendKeys(RandomStringUtils.randomAlphanumeric(5));
	}
	@Given("I Enter the Bid")
	public void iEnterTheBid() throws Exception 
	{
	  lap.BID.clear();
	  Thread.sleep(500);
	  lap.BID.sendKeys(RandomStringUtils.randomAlphanumeric(5));
	}

	@Given("I Enable the Check Out Toggle")
	public void iEnableTheCheckOutToggle() 
	{
	  cmp.Enable_Toggle(lap.CheckOut_YesToggle,"Check Out Toggle");
	}
	@Then("I Disable the Check Out Toggle")
	public void iDisableTheCheckOutToggle()
	{
	   cmp.Disable_Toggle(lap.CheckOut_YesToggle, lap.CheckOut_NoToggle,"Check out Toggle");
	}

	@Given("I Enable the Evertec Toggle")
	public void iEnableTheEvertecToggle() 
	{
	    cmp.Enable_Toggle(lap.Evertec_YesToggle,"Evertec Toggle");
	}
	@Then("I Disable the Evertec Toggle")
	public void iDisableTheEvertecToggle()
	{
	  cmp.Disable_Toggle(lap.Evertec_YesToggle,lap.Evertec_NoToggle, "Evertec Toggle");
	}

	@Given("I Enable the Ingenico TR Cash Toggle")
	public void iEnableTheIngenicoTRCashToggle() 
	{
	    cmp.Enable_Toggle(lap.IngenicoTRCash_YesToggle,"IngenicoTRCash Toggle");
	}
	@Then("I Disable the Ingenico TR Cash Toggle")
	public void iDisableTheIngenicoTRCashToggle() 
	{
	    cmp.Disable_Toggle(lap.IngenicoTRCash_YesToggle,lap.IngenicoTRCash_NoToggle,"IngenicoTRCash Toggle");
	}


	@Given("I Enable the PayPal Toggle")
	public void iEnableThePayPalToggle() 
	{
	   cmp.Enable_Toggle(lap.Paypal_YesToggle,"PayPal Toggle");
	}
	@Then("I Disable the PayPal Toggle")
	public void iDisableThePayPalToggle() 
	{
	   cmp.Disable_Toggle(lap.Paypal_YesToggle,lap.Paypal_NoToggle,"Paypal Toggle");
	}

	@Given("I Enable the Venmo Toggle")
	public void iEnableTheVenmoToggle() 
	{
	   cmp.Enable_Toggle(lap.Venmo_YesToggle,"Venmo Toggle");
	}
//	@Then("I Enter the Amount")
//	public void iEnterTheAmount() throws Exception 
//	{
//	    driver.findElement(By.xpath("//input[@aria-label='Amount']")).clear();
//	    Thread.sleep(500);
//	    driver.findElement(By.xpath("//input[@aria-label='Amount']")).sendKeys("45");
//	}

	@Given("I Enable the LPG Toggle")
	public void iEnableTheLPGToggle() throws Exception
	{
	  Thread.sleep(500);
	  cmp.Enable_Toggle(lap.LPG_YesToggle,"LPG Toggle");
	}
	@Given("I Select the Environment as Staging")
	public void iSelectTheEnvironmentAsStaging() 
	{
	    driver.findElement(By.xpath("//span[contains(.,' Staging ')]")).click();
	}
	@Given("I Enter the RNCERT")
	public void iEnterTheRNCERT() throws Exception 
	{
	   lap.RNCERT.clear();
	   Thread.sleep(500);
	   lap.RNCERT.sendKeys(RandomStringUtils.randomAlphanumeric(5));
	}

	@Given("I Clear the RNCERT")
	public void iClearTheRNCERT() 
	{
		  lap.RNCERT.clear();
	}
	@Given("I Enter the RNID")
	public void iEnterTheRNID() throws Exception 
	{
		lap.RIND.clear();
		Thread.sleep(500);
		lap.RIND.sendKeys(RandomStringUtils.randomAlphanumeric(5));
	}

	@Given("I Select the Environment as Production")
	public void iSelectTheEnvironmentAsProduction() 
	{
	  driver.findElement(By.xpath("//span[contains(.,' Production ')]")).click();
	}

	@Then("I Disable the LPG Toggle")
	public void iDisableTheLPGToggle() 
	{
	   cmp.Disable_Toggle(lap.LPG_YesToggle,lap.LPG_NoToggle,"LPG Toggle");
	}

	@Given("I Enable the PMS Aspire Toggle")
	public void iEnableThePMSAspireToggle()
	{
	    cmp.Enable_Toggle(lap.PMSAspire_YesToggle, "PMS Aspire");
	}
	@Given("I Enter the Property Id")
	public void iEnterThePropertyId() throws Exception 
	{
	   lap.PriorityID.clear();
	   Thread.sleep(500);
	   lap.PriorityID.sendKeys("4");
	}
	@Given("I Enter the Ocp-Apim-subscription-Key")
	public void iEnterTheOcpApimSubscriptionKey() throws Exception 
	{
	   lap.OcpApimSubscriptionKey.clear();
	   Thread.sleep(500);
	   lap.OcpApimSubscriptionKey.sendKeys(RandomStringUtils.randomNumeric(7));
	}

    @Given("I Enter the Url")
	public void iEnterTheUrl() throws Exception 
    {
	  lap.URL.clear();
	  Thread.sleep(500);
	  lap.URL.sendKeys(RandomStringUtils.randomAlphanumeric(10));
	}
	
    @Then("I Disable the PMS Aspire Toggle")
    public void iDisableThePMSAspireToggle() 
    {
        cmp.Disable_Toggle(lap.PMSAspire_YesToggle,lap.PMSAspire_NoToggle,"PMS Aspire Toggle");
    }

    @Given("I Enable ArchiveDB Is Active Toggle")
    public void iEnableArchiveDBIsActiveToggle() 
    {
       if(driver.findElement(By.xpath("//span[contains(.,' ArchiveDB Is Active ')]")).isEnabled()) 
       {
    	   
       }
       else
       {
    	   driver.findElement(By.xpath("//span[contains(.,' ArchiveDB Is Active ')]")).click();
       }
    }
    @Given("I Enter the AWS Secret Access Key")
    public void iEnterTheAWSSecretAccessKey() throws Exception 
    {
       lap.AWSSecretAccessKey.clear();
       Thread.sleep(500);
       lap.AWSSecretAccessKey.sendKeys(RandomStringUtils.randomAlphanumeric(5));
    }
    @Given("I Enter the AWS Region")
    public void iEnterTheAWSRegion() throws Exception 
    {
        lap.AWSRegion.clear();
        Thread.sleep(500);
        lap.AWSRegion.sendKeys(RandomStringUtils.randomAlphanumeric(5));
    }
    @Given("I Enter the AWS S3 Bucket")
    public void iEnterTheAWSS3Bucket() throws Exception
    {
        lap.AWSS3Bucket.clear();
        Thread.sleep(500);
        lap.AWSS3Bucket.sendKeys(RandomStringUtils.randomAlphanumeric(5));
    }
    
    @Given("I Enter the AWS S3 Storage Class")
    public void iEnterTheAWSS3StorageClass() throws Exception
    {
       lap.AWSS3Class.clear();
       Thread.sleep(500);
       lap.AWSS3Class.sendKeys(RandomStringUtils.randomAlphanumeric(5));
    }

    @Given("I Enter the AWS Access Key ID")
    public void iEnterTheAWSAccessKeyID() throws Exception
    {
       lap.AWSAccessKeyID.clear();
       Thread.sleep(500);
       lap.AWSAccessKeyID.sendKeys(RandomStringUtils.randomAlphanumeric(5));
    }
    

    @Given("I Disable ArchiveDB Is Active Toggle")
    public void iDisableArchiveDBIsActiveToggle() 
    {
    	if(driver.findElement(By.xpath("//span[contains(.,' ArchiveDB Is Active ')]")).isEnabled()) 
        {
    		  driver.findElement(By.xpath("//span[contains(.,' ArchiveDB Is Active ')]")).click();
        }
        else
        {
     	 
        }
    }

    @Given("Verify the Sale Count Size")
    public void verifyTheSaleCountSize() 
    {
      String SalecountSize = driver.findElement(By.xpath("(//div[@id='dbInformation']//span)[1]")).getText().toString().replaceAll("[a-zA-Z $ ₹ , : ]", "0").trim();;
      double SaleCount = Double.parseDouble(SalecountSize);
      test.log(LogStatus.INFO,"Sale Count Size :"+SaleCount);
    }
    @Given("Verify the DB Size")
    public void verifyTheDBSize() 
    {
    	String DBSize = driver.findElement(By.xpath("(//div[@id='dbInformation']//span)[2]")).getText().toString().replaceAll("[a-zA-Z $ ₹ , : ]", "0").trim();;
        double DBCount = Double.parseDouble(DBSize);
        test.log(LogStatus.INFO,"DB Size :"+DBCount);
    }
    
    @And("I Enter the Primary URL in Admin StoreDetails")
    public void EnterPrimaryURLInStoreDetails() throws Exception 
    {
    	driver.findElement(By.xpath("//input[@aria-label='Primary URL']")).clear();
    	Thread.sleep(500);
    	driver.findElement(By.xpath("//input[@aria-label='Primary URL']")).sendKeys(RandomStringUtils.randomAlphanumeric(10));
    }

   @And("I Enter the Confirm Password Givex Admin")
   public void EnterConfirmPassword() throws Exception
   {
	  driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).clear();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("sg123");
   }
   
   @And("I Enter the Invalid Confirm Password in Admin StoreDetails")
   public void EnterInvalidConfirmPassword() throws Exception 
   {
	   driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).clear();
		  Thread.sleep(500);
		  driver.findElement(By.xpath("//input[@aria-label='Confirm Password']")).sendKeys("Redf");
   }

   @And("I Click the Update button in Venmo")
   public void ClickVenmoUpdateButton()
   {
	   driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[9]")).click();
   }
   
   @And("I Click the Update button in LPG")
   public void ClickLPGUpdateButton() 
   {
	   driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[10]")).click();
   }
   

   @Given("I Disable SMS Configuration Toggle")
   public void iDisableSMSConfigurationToggle() 
   {
      if(driver.findElement(By.xpath("//span[contains(.,' SMS Configuration ')]")).isEnabled()) 
      {
    	  driver.findElement(By.xpath("//span[contains(.,' SMS Configuration ')]")).click();
      }
      else 
      {
    	  
      }
   }

   @Then("I Disable the Digital Gator Toggle")
   public void iDisableTheDigitalGatorToggle() 
   {
     cmp.Disable_Toggle(lap.DigitalGator_YesToggle, lap.DigitalGator_NoToggle, "Digital Gator Toggle");
   }
   
   @And("I Click the Update button MPPG CreditCard Admin")
   public void UpdateMPPGCreditCardAdmin() 
   {
	   driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[2]")).click();
   }
   
   @And("I Click the Update button in ArchiveDB")
   public void ClickUpdateButtonInArchiveDB() 
   {
	   driver.findElement(By.xpath("//div[@id='archiveDbInformation']//button[.='UPDATE']")).click();
   }

  @And("I Click the update button in Digital Gator")
  public void ClickUpdateButtonInDigitalGator() 
  {
	  driver.findElement(By.xpath("(//button[contains(.,'UPDATE')])[8]")).click();
  }
  
  @And("I Click the Save button in Emaar")
  public void ClickSaveButtonInEmaar() 
  {
	  driver.findElement(By.xpath("(//span[contains(.,'SAVE')])[3]")).click();
  }
  
  @And("I Click the Update button in SaleRecap Report")
  public void ClickUpdatebuttonInSaleRecapReport() 
  {
	  driver.findElement(By.xpath("(//span[contains(.,'UPDATE')])[11]")).click();
  }
  
  @And("I Click the Update button In Optomany Admin")
  public void ClickUpdateButtonInOptomany()
  {
	  driver.findElement(By.xpath("(//button[.='UPDATE'])[4]")).click();
  }
  
  @And("I Click the Update button Oracle PMS")
  public void ClickUpdateButtonOraclePMS() 
  {
	  driver.findElement(By.xpath("(//button[.='UPDATE'])[7]")).click();
  }
  
  @And("I Click the Update button Vexen Payment")
  public void ClickUpdateButtonInVexen()
  {
	  driver.findElement(By.xpath("(//button[.='UPDATE'])[5]")).click();
  }
  
  @And("I Clear the Percentage in Venmo")
  public void ClearPercentage() 
  {
	 driver.findElement(By.xpath("(//input[@aria-label='Percentage'])[2]")).clear();
  }

  @And("I Enter the Percentage in Venmo")
  public void EnterPercentage()
  {
	  driver.findElement(By.xpath("(//input[@aria-label='Percentage'])[2]")).sendKeys(RandomStringUtils.randomNumeric(3));
  }

}
