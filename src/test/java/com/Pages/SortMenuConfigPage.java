package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SortMenuConfigPage extends BasePage
{

//	public SelfHealingDriver driver;
//	public ExtentTest test;

//	public SortMenuConfigPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		super(driver, test);
//		PageFactory.initElements(driver, this);
//	}



	@FindBy(xpath = "//span[contains(.,'Categories or Display Groups')]/../..//div[contains(@class,'sort-select-box')]")
	WebElement Cat_SortByDropBtn;

	@FindBy(xpath = "//span[contains(.,'Menu Items of')]/../..//div[contains(@class,'sort-select-box')]")
	WebElement Menu_SortByDropBtn;
	
	@FindBy(xpath = "//span[contains(.,'Sub Categories of')]/../..//div[contains(@class,'sort-select-box')]")
    WebElement SubCat_SortByDropBtn;
	
	@FindBy(xpath = "//select-option[contains(.,'A-Z')]")
	WebElement AtoZ_SortingBtn;

	@FindBy(xpath = "//select-option[contains(.,'Z-A')]")
	WebElement ZtoA_SortingBtn;

	@FindBy(xpath = "//select-option[contains(.,'CUSTOM')]")
	WebElement Custom_SortingBtn;

	@FindBy(xpath = "//button[@id='category-arrow-left']")
	WebElement Left_arrowBtn;

	@FindBy(xpath = "//button[@id='category-arrow-right']") 
	WebElement Right_arrowBtn;
	
	@FindBy(xpath="//span[contains(@class,'px-1')]")
	WebElement Save_Btn;
	
	@FindBy(xpath = "//div[contains(@class,'sort-category-config')]/div[1]/div/div")
	WebElement Cat_First;
	
	@FindBy(xpath = "//div[contains(@class,'sort-category-config')]/div[2]/div/div")
	WebElement Cat_Second;
	
	@FindBy(xpath = "//div[contains(@class,'sort-category-config')]/div[3]/div/div")
	WebElement Cat_Third;
	
	////app-sort-menu-config/div/div[2]/div[2]//div/div/span
	
	@FindBy(xpath = "//div[contains(@class,'sort-subCategory-config')]/div[1]/div/div")
	WebElement SubCat_First;
	
	@FindBy(xpath = "//div[contains(@class,'sort-subCategory-config')]/div[2]/div/div")
	WebElement SubCat_Second;
	
	@FindBy(xpath = "//div[contains(@class,'menu-example-container')]/div[1]/div/div/div")
	WebElement Menu_First;
	
	@FindBy(xpath = "//div[contains(@class,'menu-example-container')]/div[2]/div/div/div")
	WebElement Menu_Second;
	
	public WebElement AtoZ_Sorting()
	{
		return AtoZ_SortingBtn;
		
	}
	
	public WebElement ZtoA_Sorting()
	{
		return ZtoA_SortingBtn;
		
	}
	
	public void Verify_Sorting_Options_AtoZ() 
	{
		if(AtoZ_SortingBtn.isDisplayed()) {
			test.log(LogStatus.PASS,"A-Z Sorting Button Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "A-Z Sorting button not displayed");
		}
		
	}
	
	public void Verify_Sorting_Options_ZtoA() 
	{
		if(ZtoA_SortingBtn.isDisplayed()) {
			test.log(LogStatus.PASS,"Z-A Sorting Button Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Z-A Sorting button not displayed");
		}
	}
	
	public void Verify_Sorting_Options_Custom() 
	{
		if(Custom_SortingBtn.isDisplayed()) {
			test.log(LogStatus.PASS,"Custom Sorting Button Displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Custom Sorting button not displayed");
		}
	}
	
    public void Select_Category_SortByDropdownButton() throws Exception 
    {
        driver.findElement(By.tagName("html")).sendKeys(Keys.HOME);
    	Thread.sleep(2000);
		Cat_SortByDropBtn.click();
    }
    
    public void Select_SubCategory_SortByDropdownButton() throws Exception 
    {
    	
    	try
		{
			if(SubCat_SortByDropBtn.isDisplayed())
			{
				Thread.sleep(2000);
			SubCat_SortByDropBtn.click();
			Thread.sleep(2000);
			}
		}
			catch(Exception g)
			{
				test.log(LogStatus.INFO, "SubCategories not available to do Sorting");
			}
    }
	
	
	public void Select_AtoZSorting_Category() throws Exception
	{
        AtoZ_SortingBtn.click();

	}

	public void Select_ZtoASorting_Category() throws Exception
	{
//		Thread.sleep(2000);
//
//		Cat_SortByDropBtn.click();
//		Thread.sleep(2000);

		ZtoA_SortingBtn.click();
	}
	
	public void Select_AtoZSorting_SubCategory() throws Exception
	{
		try
		{
		   AtoZ_SortingBtn.click();
		
		}
		catch(Exception g)
		{
			test.log(LogStatus.INFO, "SubCategories not available to do Sorting");
		}
	}

	public void Select_ZtoASorting_SubCategory() throws Exception
	{
		try
		{
			
			ZtoA_SortingBtn.click();
		}
		catch(Exception g)
		{
			test.log(LogStatus.INFO, "SubCategories not available to do Sorting");
		}
	}

	public WebElement Category_First()
	{
		return Cat_First;
	}
	
	public WebElement Category_Second()
	{
		return Cat_Second;
	}
	
	public WebElement Category_Third()
	{
		return Cat_Third;
	}
	
	public WebElement SubCategory_First()
	{
		return SubCat_First;
	}
	
	public WebElement SubCategory_Second()
	{
		return SubCat_Second;
	}
	
	public WebElement Menu_First()
	{
		return Menu_First;
	}
	
	public WebElement Menu_Second()
	{
		return Menu_Second;
	}
	
	public void Click_Custom_SortingButton() 
	{
		Custom_SortingBtn.click();
	}
	
	
	public void Select_CustomSorting_Category() throws Exception
	{
//		Thread.sleep(1000);
//		Cat_SortByDropBtn.click();
//
//		Thread.sleep(1000);
//		Custom_SortingBtn.click();

//		WebElement DG1 =driver.findElement(By.xpath("//div[contains(@class,'sort-category-config')]/div[1]/div"));
		String str1=Cat_First.getText();
		
//		WebElement DG2=driver.findElement(By.xpath("//div[contains(@class,'sort-category-config')]/div[2]/div"));
		String str2=Cat_Third.getText();
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(Cat_Third, Cat_First).build().perform();
		
	}
	
	public void Click_CustomSort_SubCategory() 
	{
		try
		{
			Custom_SortingBtn.click();
		}
		catch(Exception g)
		{
			test.log(LogStatus.INFO, "SubCategories not available to do Sorting");
		}
	}
	
	public void CustomSorting_SubCategory() throws Exception
	{
		try
		{
		if(!SubCat_SortByDropBtn.isDisplayed())
		{
			
		
			test.log(LogStatus.INFO, "SubCategories not available to do Sorting");
		
		}
		}
		catch(Exception k)
		{
		
			Actions ac=new Actions(driver);
			ac.dragAndDrop(SubCat_First, SubCat_Second).build().perform();
		}
		

	}
	
	public void Select_SortByMenuItems() 
	{
		try
		{
			if(Menu_SortByDropBtn.isDisplayed())
			{
				Thread.sleep(2000);
				Menu_SortByDropBtn.click();
			Thread.sleep(2000);
			}
		}
			catch(Exception g)
			{
				test.log(LogStatus.INFO, "MenuItems not available to do Sorting");
			}
	}
	
	public void Click_CustomSort_MenuItems() 
	{
		try
		{
			
			Custom_SortingBtn.click();
		
		}
		catch(Exception j)
		{
			
			
			test.log(LogStatus.INFO, "Menu Items Not available for Sorting");
		}
	}
	
	public void Select_CustomSorting_MenuItems() throws Exception
	{
		try
		{
		if(!Menu_SortByDropBtn.isDisplayed())
		{
			test.log(LogStatus.INFO, "Menu Items Not available for Sorting");
		
		}
		}
		catch(Exception j)
		{
			
			
//			Menu_SortByDropBtn.click();

//			Custom_SortingBtn.click();

//			WebElement DG1 =driver.findElement(By.xpath("//div[contains(@class,'sort-category-config')]/div[1]/div"));
//			String str1=Cat_First.getText();
			
//			WebElement DG2=driver.findElement(By.xpath("//div[contains(@class,'sort-category-config')]/div[2]/div"));
//			String str2=Cat_Second.getText();
			
			Actions ac=new Actions(driver);
			ac.dragAndDrop(Menu_Second, Menu_First).build().perform();
		}
		
		

	}

	public void Select_AtoZSorting_MenuItems()
	{
		try
		{
			AtoZ_SortingBtn.click();
		}
		catch(Exception l)
		{
	//	Menu_SortByDropBtn.click();

		  test.log(LogStatus.INFO,"Menu Items not Available for Sorting");

//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",  Menu_SortByDropBtn);
//		Menu_SortByDropBtn.click();
		}
	}

	public void Select_ZtoASorting_MenuItems()
	{
		try
		{
			ZtoA_SortingBtn.click();
		}
		catch(Exception l)
		{
	//	Menu_SortByDropBtn.click();

		test.log(LogStatus.INFO,"Menu Items are not available for sorting");

//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",  Menu_SortByDropBtn);
//		Menu_SortByDropBtn.click();
		}
	}

//	public void Select_CustomSorting_MenuItems()
//	{
//		Menu_SortByDropBtn.click();
//
//		Custom_SortingBtn.click();
//
//		WebElement MI1 =driver.findElement(By.xpath("//div[contains(@class,'menu-example-container')]/div[1]/div"));
//		WebElement MI2=driver.findElement(By.xpath("//div[contains(@class,'menu-example-container')]/div[2]/div"));
//		Actions ac=new Actions(driver);
//		ac.dragAndDrop(MI1, MI2).build().perform();
//
//	}

	public void Move_left()
	{
		Left_arrowBtn.click();
	}
	public void Move_right()
	{
		Right_arrowBtn.click();
	} 
	public void Save()
	{
		Save_Btn.click();
	}
	
	@FindBy(xpath = "//span[.='Categories or Display Groups']")
	WebElement Categegories_OrDisplayGroupHeader;
	
	public void Verify_Categories_OrDisplayGroup_Header() 
	{
		if(Categegories_OrDisplayGroupHeader.isDisplayed())
		{
			test.log(LogStatus.PASS, "Categories or DisplayGroup Header Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Categories or display Group header not displayed");
		}
	}
	
	public void Select_Random_Category() throws Exception
	{
		Thread.sleep(1000);
//		List<WebElement> CategoryList=driver.findElements(By.xpath("//div[contains(@class,'sort-category-config')]/div/div/div/span"));
//		
//		int CategorySize=CategoryList.size();
//		
//		
//		int randomCategory=ThreadLocalRandom.current().nextInt(1, CategorySize);
//		
//		
//		driver.findElement(By.xpath("//div[contains(@class,'sort-category-config')]/div["+randomCategory+"]/div/div/span")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'sort-category-config')]/div[7]/div/div/span")).click();
	}
	
	public void Select_SubCategory() throws Exception
	{
		try {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'sort-subCategory-config')]/div[1]/div/div/span")).click();
		}
		catch (Exception e) {
			test.log(LogStatus.INFO, "SubCategories Not available for Sorting");
		}
	}
	
	public void Verify_SubCategories_Header() 
	{
		try {
		if(driver.findElement(By.xpath("//span[contains(.,'Sub Categories ')]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "SubCategories Header Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"SubCategories header not displayed");
		}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"SubCategories are not available");
		}
	}
	
	public void Verify_MenuItem_Header() 
	{
		try {
		if(driver.findElement(By.xpath("//span[contains(.,'Menu Items ')]")).isDisplayed())
		{
			test.log(LogStatus.PASS, "Menu Item Header Displayed");
		}
		else {
			test.log(LogStatus.FAIL,"Menu Item header not displayed");
		}
		}
		catch (Exception e) {
			test.log(LogStatus.INFO,"Menu Items are not available");
		}
	}
	
	public void Select_Default_AtoZ_Sorting_InCategory() 
	{
	   String AtoZCategory = driver.findElement(By.xpath("(//input[@aria-label='Sort By:'])[1]")).getText();
	   
	   if(AtoZCategory.equalsIgnoreCase("A-Z")) {
		   test.log(LogStatus.PASS,"A-Z Sorting option Selected  in Category");
	   }
	   
	   else {
		   test.log(LogStatus.FAIL," A-Z optin not selected in Category");
	   }
	}
	
	public void Select_Default_AtoZ_Sorting_InSubCategory() 
	{
	   String AtoZCategory = driver.findElement(By.xpath("(//input[@aria-label='Sort By:'])[2]")).getText();
	   try {
	   if(AtoZCategory.equalsIgnoreCase("A-Z")) {
		   test.log(LogStatus.PASS," A-Z option Selected By Default in Sub Catgeory");
	   }
	   
	   else {
		   test.log(LogStatus.FAIL,"A-Z optin not selected In SubCategory");
	   }
	   }
	   catch (Exception e) {
		test.log(LogStatus.INFO, "Sub Category not available");
	}
	}
	
	public void Select_Default_AtoZ_Sorting_InMenuItem() 
	{
		try {
	   String AtoZCategory = driver.findElement(By.xpath("(//input[@aria-label='Sort By:'])[3]")).getText();
	   
	   if(AtoZCategory.equalsIgnoreCase("A-Z")) {
		   test.log(LogStatus.PASS,"By Default A-Z option Selected in MenuItem");
	   }
	   
	   else {
		   test.log(LogStatus.FAIL," A-Z optin not selected In MenuItem");
	   }
	   }
	   catch (Exception e) {
		test.log(LogStatus.INFO,"Menu Item Not available");
	}
	}
	
	
	public void Verify_Customsorting_InCategory() 
	{
	   String AtoZCategory = driver.findElement(By.xpath("(//input[@aria-label='Sort By:'])[1]")).getText();
	   
	   if(AtoZCategory.equalsIgnoreCase("custom")) {
		   test.log(LogStatus.PASS,"Custom Sort is Selected in Catgeory");
	   }
	   
	   else {
		   test.log(LogStatus.FAIL,"Custom Sort not selected in Category");
	   }
	}
	
	public void Verify_Customsorting_InSubCategory() 
	{
	   String AtoZCategory = driver.findElement(By.xpath("(//input[@aria-label='Sort By:'])[2]")).getText();
	   try {
	   if(AtoZCategory.equalsIgnoreCase("custom")) {
		   test.log(LogStatus.PASS,"Custom sort is selected in Sub Catgeory");
	   }
	   
	   else {
		   test.log(LogStatus.FAIL,"SubCategory not selected In SubCategory");
	   }
	   }
	   catch (Exception e) {
		test.log(LogStatus.INFO, "Sub Category not available");
	}
	}
	
	public void Verify_Customsorting_InMenuItem() 
	{
		try {
	   String AtoZCategory = driver.findElement(By.xpath("(//input[@aria-label='Sort By:'])[3]")).getText();
	   
	   if(AtoZCategory.equalsIgnoreCase("custom")) {
		   test.log(LogStatus.PASS,"By Custom sort is selected in MenuItem");
	   }
	   
	   else {
		   test.log(LogStatus.FAIL,"Custom sort not selected In MenuItem");
	   }
	   }
	   catch (Exception e) {
		test.log(LogStatus.INFO,"Menu Item Not available");
	}
	}
	
}
