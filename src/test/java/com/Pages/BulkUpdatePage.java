package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.impl.WebElementCommunicator;

import Utility.Utility;

public class BulkUpdatePage extends BasePage
{
	Common_XPaths cmp;
	Utility ut=new Utility();
	
	@FindBy(xpath = "(//div[.=' Menu Item Name '])[2]")
	public WebElement MenuItemColumn;
	
	@FindBy(xpath = "//button[.=' BULK CHANGE ']")
	public WebElement BulkChange_Button;
	
	@FindBy(xpath = "//table//th[1]")
	public WebElement Category_CheckBox;
	
	@FindBy(xpath = "//input[@data-placeholder='Category']")
	public WebElement Category_Dropdown;
	
	@FindBy(xpath = "//input[@data-placeholder='Sub Category']")
	public WebElement SubCategory_Dropdown;
	
	@FindBy(xpath = "(//div[.='All'])[2]")
	public WebElement All;
	
	@FindBy(xpath = "//app-toggle[@name='operationType']//mat-button-toggle-group/mat-button-toggle/button[contains(.,'Decrease')]")
    public WebElement Decrease_button;
    
    @FindBy(xpath = "//app-toggle[@name='operationType']//mat-button-toggle-group/mat-button-toggle/button[contains(.,'Increase')]")
    public WebElement Increase_button;
    
    @FindBy(xpath = "//app-toggle[@name='changeBy']//mat-button-toggle-group/mat-button-toggle/button[contains(.,'Amount')]")
    public WebElement Amount_button;
    
    @FindBy(xpath = "//app-toggle[@name='changeBy']//mat-button-toggle-group/mat-button-toggle/button[contains(.,'Percentage')]")
    public WebElement Percentage_button;
    
    @FindBy(xpath = "//label[contains(.,' Amount ')]/../../input")
    public WebElement Amount_input;
 
    @FindBy(xpath = " //label[contains(.,' Percentage ')]/../../input")
    public WebElement Percentage_input;
    
    @FindBy(xpath = "//button[contains(.,'change')]")
    public  WebElement Change_button;
    
    @FindBy(xpath = "//span[contains(.,'UPDATE ITEM PRICE')]")
    public WebElement UPDATE_ITEM_PRICE;
    
    @FindBy(xpath = "//table/tbody/tr[1]/td[6]//input")
    public WebElement ChangeTo_InputBox;
    
    @FindBy(xpath = "(//input[contains(@data-placeholder,'Search')])[1]")
    public WebElement DropdownSearch;
    
    @FindBy(xpath = "//table/tbody/tr[1]/td[7]/div")
    public WebElement Change_Inputbox;
    
    @FindBy(xpath = "//table/tbody/tr[1]/td[5]")
    public WebElement Existing_Price;
    
    public void SearchDropdown(String Str) throws Exception 
    {
    	DropdownSearch.clear();
    	Thread.sleep(500);
    	DropdownSearch.sendKeys(Str);
    }
}
