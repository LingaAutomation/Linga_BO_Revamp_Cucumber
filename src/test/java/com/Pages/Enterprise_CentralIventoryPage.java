package com.Pages;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;

public class Enterprise_CentralIventoryPage extends BasePage
{
	public SelfHealingDriver driver;
	public ExtentTest test;
	
	Utility ut=new Utility();
	Common_XPaths cmp;
	
//	public Enterprise_CentralIventoryPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//button[contains(.,'CENTRAL WAREHOUSE')]")
	WebElement Add_Central_WarehouseBtn;
	
	@FindBy(xpath = "//app-selectbox[@name='timeZone']//input")
	WebElement Time_ZoneInputBx;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Copy Menu From Existing Store')]//button[.='Yes']")
	WebElement Copy_Menu_ExistingStore_YesToggle;
	
	@FindBy(xpath = "//app-toggle[contains(.,'Copy Menu From Existing Store')]//button[.='No']")
	WebElement Copy_Menu_ExistingStore_NoToggle;
	
	@FindBy(xpath = "//label[contains(.,'Select Store')]/../../input")
	WebElement Select_StoreInputBx;
	
	public void Click_Add_Central_Warehouse()
	{
		Add_Central_WarehouseBtn.click();
	}
	
	public void Enable_Copy_Menu_ExistingStore_Toggle()
	{
		new Common_XPaths().Enable_Toggle(Copy_Menu_ExistingStore_YesToggle, "Copy Menu from Existing Store Toggle Enabled");
	}
	
	public void Disable_Copy_Menu_ExistingStore_Toggle()
	{
		new Common_XPaths().Disable_Toggle(Copy_Menu_ExistingStore_YesToggle, Copy_Menu_ExistingStore_NoToggle, "Copy Menu from Existing Store Toggle Disabled");
	}
	
	public void Select_Store() throws Exception
	{
		Thread.sleep(1000);
		new Common_XPaths().Click_DropDown_withSearch(Select_StoreInputBx, "Store Selected");
	}
	
	public WebElement Copy_Menu_ExistingStore_YesToggle()
	{
		return Copy_Menu_ExistingStore_YesToggle;
	}
	
	public void Search_and_Edit_CentralInventory(String Name) throws Exception
	{
		Thread.sleep(1000);
		new Common_XPaths().SearchBox.clear();
		Thread.sleep(1000);
		new Common_XPaths().SearchBox.sendKeys(Name);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//app-central-warehouse-item//button)[1]")).click();
		
	}
	
	@FindBy(xpath = "//mat-panel-title[contains(.,'Low Stocks')]/..//mat-icon[.='keyboard_arrow_right']")
	public WebElement Low_Stocks_RightArrow;
	
	@FindBy(xpath = "//mat-panel-title[contains(.,'Low Stocks')]/..//mat-icon[.='keyboard_arrow_down']")
	public WebElement Low_Stocks_DownArrow;
	
	
	
	
	//////////////  Central Inventory - Transfer Request  ////////////////////////////
	
	@FindBy(xpath = "//button[contains(.,'NEW TRANSFER REQUEST ')]")
	WebElement New_Transfer_Request;
	
	@FindBy(xpath = "//label[contains(.,'Source')]/../../input")
	WebElement Source_input_btn;
	
	@FindBy(xpath = "//label[contains(.,'Destination')]/../../input")
	WebElement Destination_input_btn;
	
	@FindBy(xpath = "//div[contains(@class,'drawer-footer')]/../div[3]/div[2]/button")
	WebElement Request_Btn;
	
	@FindBy(xpath = "//div[contains(@class,'drawer-footer')]/../div[3]/div[2]/button[contains(@disabled,'true')]")
	WebElement Request_Disabled_Btn;
	
	@FindBy(xpath = "//div[@class='option-list']//input[@data-placeholder='Search']")
	WebElement SearchBox_DropDown;
	
	@FindBy(xpath = "//cdk-virtual-scroll-viewport//div/div[1]//select-option/div")
	WebElement First_Option_inDropDown;
	
	
	
	@FindBy(xpath = "//span[contains(.,'Inventory Item')]/span[1]")
	WebElement Add_Inventory;
	
	public WebElement Add_Inventory() {
		return Add_Inventory;
	}
	
	public WebElement Source_input_btn() {
		return Source_input_btn;
	}
	
	public WebElement Destination_input_btn() {
		return Destination_input_btn;
	}
	
	public WebElement SearchBox_DropDown() {
		return SearchBox_DropDown;
	}
	
	public WebElement First_Option_inDropDown() {
		return First_Option_inDropDown;
	}
	
	public WebElement Request_Btn() {
		return Request_Btn;
	}
	
	
	public WebElement Request_Disabled_Btn() {
		return Request_Disabled_Btn;
	}
	
	public WebElement New_Transfer_Request() {
		return New_Transfer_Request;
	}
	
	

	public void Select_Source_Store() throws InterruptedException {
		
		Thread.sleep(1000);
		Source_input_btn.click();
		Thread.sleep(1000);

		List<WebElement> optList=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
 
		int optionSize=optList.size();
		
		System.out.println("Options Size "+optionSize);
		if(optionSize==0)
		{
			
			List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
			
			int optionSize1=optList1.size();
			
			
			int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
			Thread.sleep(1000);
			String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
			Thread.sleep(1000);
			SearchBox_DropDown.clear();
			Thread.sleep(1000);
			SearchBox_DropDown.sendKeys(opt);
			Thread.sleep(5000);
			First_Option_inDropDown.click();
			Thread.sleep(5000);
		
	}
		else //if(optionSize<=10)
		{
			
			
	List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
			
			int optionSize1=optList1.size();
			
		int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
		
		Thread.sleep(1000);
		
		
		String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
		
		Thread.sleep(1000);
		SearchBox_DropDown.clear();
		Thread.sleep(1000);
		SearchBox_DropDown.sendKeys(opt);
		Thread.sleep(5000);
		First_Option_inDropDown.click();
		Thread.sleep(5000);
		
		}
	
}
	
	public void Select_Destination_Store() throws InterruptedException {
		
		Thread.sleep(1000);
		Destination_input_btn.click();
		Thread.sleep(1000);

		List<WebElement> optList=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
 
		int optionSize=optList.size();
		
		System.out.println("Options Size "+optionSize);
		if(optionSize==0)
		{
			
			List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
			
			int optionSize1=optList1.size();
			
			
			int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
			
			
			Thread.sleep(1000);
			
			
			String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
			
			Thread.sleep(1000);
			SearchBox_DropDown.clear();
			Thread.sleep(1000);
			SearchBox_DropDown.sendKeys(opt);
			Thread.sleep(5000);
			First_Option_inDropDown.click();
			Thread.sleep(5000);
		
		
	}
		else //if(optionSize<=10)
		{
			
			
	List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
			
			int optionSize1=optList1.size();
			
		int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize);
		
		Thread.sleep(1000);
		
		
	    Thread.sleep(1000);
		
		
		String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
		
		Thread.sleep(1000);
		SearchBox_DropDown.clear();
		Thread.sleep(1000);
		SearchBox_DropDown.sendKeys(opt);
		Thread.sleep(5000);
		First_Option_inDropDown.click();
		Thread.sleep(5000);
		}
	
}
	
	public void select_Destination_store(String store) throws InterruptedException {
		
		   Thread.sleep(1000);
		   Destination_input_btn().click();
		   Thread.sleep(1000);
//		   SearchBox_DropDown().clear();
		   
		   Thread.sleep(1000);
		   SearchBox_DropDown().sendKeys(store);
		   Thread.sleep(1000);
//		   SearchBox_DropDown().sendKeys(Keys.BACK_SPACE);

		   Thread.sleep(1000);
		   First_Option_inDropDown().click();
		
	}

	
	////////////////////// Central Inventory - Sync Inventory  /////////////////////////////
	
	@FindBy(xpath = "//h3[contains(.,'Inventory Management')]")
	WebElement Inventory_management_Header;
	
	
	
	@FindBy(xpath = "//h3[contains(.,'Inventory Management')]/../p")
	WebElement Inventory_management_Header_Message;
	
	@FindBy(xpath = "//h3[contains(.,'Inventory Management')]/../div[1]/div[2]")
	WebElement Create_purchase_orders;
	@FindBy(xpath = "//h3[contains(.,'Inventory Management')]/../div[2]/div[2]")
	WebElement Receive_low_stock_email_alerts;
	
	@FindBy(xpath = "//h3[contains(.,'Inventory Management')]/../div[3]/div[2]")
	WebElement Calculate_your_cogs;
	@FindBy(xpath = "//h3[contains(.,'Inventory Management')]/../div[4]/div[2]")
	WebElement Theoretical_vs_actual_inventory;
	@FindBy(xpath = "//h3[contains(.,'Inventory Management')]/../div[5]/div[2]")
	WebElement Track_wastage_spoilage;
	@FindBy(xpath = "//h3[contains(.,'Inventory Management')]/../div[6]/div[2]")
	WebElement Know_your_food_cost;
	
	@FindBy(xpath = "//button[contains(.,'SYNC DATA TO INVENTORY')]/span[1]")
	WebElement SYNC_DATA_TO_INVENTORY;
	
	public WebElement Inventory_management_Header() {
		return Inventory_management_Header;
		}


	public void Sync_Inventory() throws Exception
	{
		
		cmp=new Common_XPaths();
		
		Thread.sleep(10000);
		
		if(Inventory_management_Header().getText().equalsIgnoreCase("Inventory Management")) {
			 
			 test.log(LogStatus.PASS, "Inventory Management header are same "+Inventory_management_Header().getText());
			 
		}
		else {
			test.log(LogStatus.FAIL, "Inventory Management header are not same "+Inventory_management_Header().getText());
		}
		
		
		
		if(Inventory_management_Header_Message.isDisplayed()) {
			
			 test.log(LogStatus.PASS, "Inventory Management message are same "+Inventory_management_Header().getText());
			 
				}
				else {
					test.log(LogStatus.FAIL, "Inventory Management message are not same "+Inventory_management_Header().getText());
				}
		
		
		if(Create_purchase_orders.getText().equalsIgnoreCase("Create purchase orders")) {
			 
			 test.log(LogStatus.PASS, "Create purchase orders are same "+Create_purchase_orders.getText());
			 
		}
		else {
			test.log(LogStatus.FAIL, "Create purchase orders are not same "+Create_purchase_orders.getText());
		}
		
		
		if(Receive_low_stock_email_alerts.getText().equalsIgnoreCase("Receive low stock email alerts")) {
			 
			 test.log(LogStatus.PASS, "Receive low stock email alerts are same "+Receive_low_stock_email_alerts.getText());
			 
		}
		else {
			test.log(LogStatus.FAIL, "Receive low stock email alerts are not same "+Receive_low_stock_email_alerts.getText());
		}
		
		
		if(Calculate_your_cogs.getText().equalsIgnoreCase("Calculate your cogs")) {
			 
			 test.log(LogStatus.PASS, "Calculate your cogs are same "+Calculate_your_cogs.getText());
			 
		}
		else {
			test.log(LogStatus.FAIL, "Calculate your cogs are not same "+Calculate_your_cogs.getText());
		}
		
		
		if(Theoretical_vs_actual_inventory.getText().equalsIgnoreCase("Theoretical vs actual inventory")) {
			 
			 test.log(LogStatus.PASS, "Theoretical vs actual inventory are same "+Theoretical_vs_actual_inventory.getText());
			 
		}
		else {
			test.log(LogStatus.FAIL, "Theoretical vs actual inventory are not same "+Theoretical_vs_actual_inventory.getText());
		}
		
		
		if(Track_wastage_spoilage.getText().equalsIgnoreCase("Track wastage, theft and spoilage")) {
			 
			 test.log(LogStatus.PASS, "Track wastage, theft and spoilage are same "+Track_wastage_spoilage.getText());
			 
		}
		else {
			test.log(LogStatus.FAIL, "Track wastage, theft and spoilage are not same "+Track_wastage_spoilage.getText());
		}
		
		
		if(Know_your_food_cost.getText().equalsIgnoreCase("Know your food cost")) {
			 
			 test.log(LogStatus.PASS, "Know your food cost are same "+Know_your_food_cost.getText());
			 
		}
		else {
			test.log(LogStatus.FAIL, "Know your food cost are not same "+Know_your_food_cost.getText());
		}
		
		
		SYNC_DATA_TO_INVENTORY.click();
		
		
		Thread.sleep(3000);
		//Check whether the New Gift Card Saved or not
		if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Stay Calm, Authenticating & Syncing Inventory data"))
		{
			test.log(LogStatus.PASS, "Stay Calm, Authenticating & Syncing Inventory data Alert Displayed");
		
			ut.PassedCaptureScreenshotAsBASE64();
			if(cmp.ConfirmationAlertMsg().getText().equalsIgnoreCase("Inventory synced successfully"))
			{
				test.log(LogStatus.PASS, "Inventory synced successfully Alert Displayed");
			
				ut.PassedCaptureScreenshotAsBASE64();
			}
			
			else
			{
				test.log(LogStatus.FAIL, "Inventory synced successfully Alert not Displayed");
				
				ut.FailedCaptureScreenshotAsBASE64();
			}
		}
		else
		{
			test.log(LogStatus.FAIL, "Stay Calm, Authenticating & Syncing Inventory data Alert not Displayed");
			
			ut.FailedCaptureScreenshotAsBASE64();
		}
	}

	
	///////////////// Enterprise Central Inventory - Central Kitchen ///////////////////////
	
	@FindBy(xpath = "//button[contains(.,'CENTRAL KITCHEN')]")
	WebElement Add_Central_KitchenBtn;
	
	public void Click_Add_Central_Kitchen()
	{
		Add_Central_KitchenBtn.click();
	}
	
	@FindBy(xpath = "//input[@aria-label='Sort By']")
	WebElement Sort_ByInputBx;
	
	@FindBy(xpath = "//select-option[contains(.,'Ascending')]")
	WebElement Ascending_Option;
	
	@FindBy(xpath = "//select-option[contains(.,'Descending')]")
	WebElement Descending_Option;
	
	public void Verify_AscendingOrder_CentralInventory() throws Exception
	{
		Thread.sleep(2000);
		Sort_ByInputBx.click();
		
		Thread.sleep(2000);
		Ascending_Option.click();
		
		ArrayList<String> ArLst=new ArrayList<String>();
	
			List<WebElement> NameLst=driver.findElements(By.xpath("//div[@class='central-warehouse-content']/div/span"));
			
			for(WebElement ele:NameLst)
			{ 
				ArLst.add(ele.getText());
			}
			
			ArrayList<String> sortedLst=new ArrayList<String>();
			
			for(String st:ArLst)
			{
				sortedLst.add(st);
			}
			
			Collections.sort(sortedLst);
			
			if(sortedLst.equals(ArLst))
			{
				test.log(LogStatus.PASS, "Ascending Order Sorted Correctly");
				
				ut.PassedCaptureScreenshotAsBASE64();
				
				System.out.println(sortedLst);
			}
			else
			{
				test.log(LogStatus.FAIL, "Ascending Order Sorted Incorrect");
				
				ut.FailedCaptureScreenshotAsBASE64();
				
				System.out.println(sortedLst);
			}
		
	}
	
	public void Verify_DescendingOrder_CentralInventory() throws Exception
	{
		Thread.sleep(2000);
		Sort_ByInputBx.click();
		
		Thread.sleep(2000);
		Descending_Option.click();
		
		ArrayList<String> ArLst=new ArrayList<String>();
	
			List<WebElement> NameLst=driver.findElements(By.xpath("//div[@class='central-warehouse-content']/div/span"));
			
			for(WebElement ele:NameLst)
			{
				ArLst.add(ele.getText());
			}
			
			ArrayList<String> sortedLst=new ArrayList<String>();
			
			for(String st:ArLst)
			{
				sortedLst.add(st);
			}
			
			Collections.sort(sortedLst);
			Collections.reverse(sortedLst);
			
			if(sortedLst.equals(ArLst))
			{
				test.log(LogStatus.PASS, "Desending Order Sorted Correctly");
				
				ut.PassedCaptureScreenshotAsBASE64();
				
				System.out.println(sortedLst);
			}
			else
			{
				test.log(LogStatus.FAIL, "Desending Order Sorted Incorrect");
				
				ut.FailedCaptureScreenshotAsBASE64();
				
				System.out.println(sortedLst);
			}
		
	}
	
	
	//////////////// Central Inventory - Menu Configuration /////////////////////////////
	
	@FindBy(xpath = "//span[contains(.,' PULL MENU CONFIGURATION ')]/../../button[@disabled='true']")
	WebElement PULL_MENU_CONFIGURATION_Button_disabled;
	
	
	@FindBy(xpath = "//span[contains(.,' PULL MENU CONFIGURATION ')]/../../button")
	WebElement PULL_MENU_CONFIGURATION_Button;
	
	
	@FindBy(xpath = "(//h6[contains(.,'Pull Data From')]/..//label[contains(.,'Type')]/../../input)[1]")
	WebElement PULL_Data_From_type_input;
	
	
	@FindBy(xpath = "(//h6[contains(.,'Push Data To')]/..//label[contains(.,'Type')]/../../input)[2]")
	WebElement PUSH_Data_TO_type_input;
	
	@FindBy(xpath = "(//h6[contains(.,'Pull Data From')]/..//label[contains(.,'Select Store ')]/../../input)[1]")
	WebElement PULL_Data_From_Store_input;
	
	
	@FindBy(xpath = "(//h6[contains(.,'Push Data To')]/..//label[contains(.,'Select Store ')]/../../input)[2]")
	WebElement PUSH_Data_TO_Store_input;
	
	
	@FindBy(xpath = "//cdk-virtual-scroll-viewport//div/div/select-option/div[contains(.,'Stores')]")
	WebElement Select_Store;
	@FindBy(xpath = "//cdk-virtual-scroll-viewport//div/div/select-option/div[contains(.,'Central WareHouse')]")
	WebElement Select_Central_WareHouse;
	@FindBy(xpath = "//cdk-virtual-scroll-viewport//div/div/select-option/div[contains(.,'Central Kitchen')]")
	WebElement Select_Central_Kitchen;
	
//	@FindBy(xpath = "//div[@class='option-list']//input[@data-placeholder='Search']")
//	WebElement SearchBox_DropDown;
//	
//	@FindBy(xpath = "//cdk-virtual-scroll-viewport//div/div[1]//select-option/div")
//	WebElement First_Option_inDropDown;
//	
	
	
	@FindBy(xpath = "//span[contains(.,'Select different store')]")
	WebElement Select_different_store;
	
	
	
	public WebElement PULL_Data_From_type_input() {
		return PULL_Data_From_type_input;
	}
	public WebElement Select_different_store() {
		return Select_different_store;
	}
	
	
	
//	public WebElement First_Option_inDropDown() {
//		return First_Option_inDropDown;
//	}
//	
//	public WebElement SearchBox_DropDown() {
//		return SearchBox_DropDown;
//	}
	
	public WebElement PULL_MENU_CONFIGURATION_Button_disabled() {
		return PULL_MENU_CONFIGURATION_Button_disabled;
	}
	
	public WebElement PULL_MENU_CONFIGURATION_Button() {
		return PULL_MENU_CONFIGURATION_Button;
	}
	
	
	
	public WebElement PULL_Data_From_Store_input() {
		return PULL_Data_From_Store_input;
	}
	public WebElement PUSH_Data_TO_Store_input() {
		return PUSH_Data_TO_Store_input;
	}
	public void Select_Pull_type_store() { 
		
		PULL_Data_From_type_input.click();
		
		Select_Store.click();
	
	}
	
	
public void Select_Pull_type_Central_WareHouse() { 
		
		PULL_Data_From_type_input.click();
		
		Select_Central_WareHouse.click();
	
	}

public void Select_Pull_type_Central_Kitchen() { 
	
	PULL_Data_From_type_input.click();
	
	Select_Central_Kitchen.click();

}
	
	
public void Select_Push_type_store() { 
		
		PUSH_Data_TO_type_input.click();
		
		Select_Store.click();
	
	}

public void Select_Push_type_Central_WareHouse() { 
	
	PUSH_Data_TO_type_input.click();
	
	Select_Central_WareHouse.click();

}

public void Select_Push_type_Central_Kitchen() { 
	
	PUSH_Data_TO_type_input.click();
	
	Select_Central_Kitchen.click();

}
	
	
	
	
//public void Select_Source_Store() throws InterruptedException {
//	
//	Thread.sleep(1000);
//	PULL_Data_From_Store_input.click();
//	Thread.sleep(1000);
//
//	List<WebElement> optList=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
//
//	int optionSize=optList.size();
//	
//	System.out.println("Options Size "+optionSize);
//	if(optionSize==0)
//	{
//		
//		List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
//		
//		int optionSize1=optList1.size();
//		
//		
//		int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
//		Thread.sleep(1000);
//		String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
//		Thread.sleep(1000);
//		SearchBox_DropDown.clear();
//		Thread.sleep(1000);
//		SearchBox_DropDown.sendKeys(opt);
//		Thread.sleep(5000);
//		First_Option_inDropDown.click();
//		Thread.sleep(5000);
//	
//}
//	else //if(optionSize<=10)
//	{
//		
//		
//List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
//		
//		int optionSize1=optList1.size();
//		
//	int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
//	
//	Thread.sleep(1000);
//	
//	
//	String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
//	
//	Thread.sleep(1000);
//	SearchBox_DropDown.clear();
//	Thread.sleep(1000);
//	SearchBox_DropDown.sendKeys(opt);
//	Thread.sleep(5000);
//	First_Option_inDropDown.click();
//	Thread.sleep(5000);
//	
//	}
//
//}

//public void Select_Destination_Store() throws InterruptedException {
//	
//	Thread.sleep(1000);
//	PUSH_Data_TO_Store_input.click();
//	Thread.sleep(1000);
//
//	List<WebElement> optList=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
//
//	int optionSize=optList.size();
//	
//	System.out.println("Options Size "+optionSize);
//	if(optionSize==0)
//	{
//		
//		List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
//		
//		int optionSize1=optList1.size();
//		
//		
//		int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize1);
//		
//		
//		Thread.sleep(1000);
//		
//		
//		String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
//		
//		Thread.sleep(1000);
//		SearchBox_DropDown.clear();
//		Thread.sleep(1000);
//		SearchBox_DropDown.sendKeys(opt);
//		Thread.sleep(5000);
//		First_Option_inDropDown.click();
//		Thread.sleep(5000);
//	
//	
//}
//	else //if(optionSize<=10)
//	{
//		
//		
//List<WebElement> optList1=driver.findElements(By.xpath("//cdk-virtual-scroll-viewport//div/div//select-option"));
//		
//		int optionSize1=optList1.size();
//		
//	int randomOpt=ThreadLocalRandom.current().nextInt(1, optionSize);
//	
//	Thread.sleep(1000);
//	
//	
//    Thread.sleep(1000);
//	
//	
//	String opt=driver.findElement(By.xpath("//cdk-virtual-scroll-viewport//div/div["+randomOpt+"]//select-option")).getText();
//	
//	Thread.sleep(1000);
//	SearchBox_DropDown.clear();
//	Thread.sleep(1000);
//	SearchBox_DropDown.sendKeys(opt);
//	Thread.sleep(5000);
//	First_Option_inDropDown.click();
//	Thread.sleep(5000);
//	}
//
//}
	
	
	
}
