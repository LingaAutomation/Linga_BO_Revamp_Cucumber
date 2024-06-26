package com.Pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;

public class EMVSettingsPage extends BasePage
{
//	public SelfHealingDriver driver;
//	public ExtentTest test;
	Utility ut=new Utility();
	Common_XPaths cmp=new Common_XPaths();
	
//	public EMVSettingsPage(SelfHealingDriver driver,ExtentTest test)
//	{
////		this.driver=driver;
////		this.test=test;
//		
//		super(driver,test);
//		
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//div[@class='settings']/button")
	WebElement Settings;
	
	@FindBy(xpath = "//span[contains(., 'EMV Settings')]")
	WebElement EMVSettingBtn;
	
	@FindBy(xpath = "//div[@class='col-auto pr-0']/button")
	WebElement NewEMVSettingBtn;
	
	@FindBy(xpath = "//app-input[@name='ipAddress']/div/div/mat-form-field/div/div/div[4]/input")
	public WebElement IPAddress;
	
	@FindBy(xpath = "//app-selectbox[@name='type']/div/mat-form-field/div/div/div[3]/input")
	public WebElement TypeInputBox;
	
	@FindBy(xpath = "//*[@id=\"cdk-drop-list-4\"]/div[1]/data-grid-row/div/div[4]/button[2]")
	public WebElement delete;    //6 options are available select any to edit
	
	
	@FindBy(xpath = "//app-selectbox[@class='ng-pristine ng-valid ng-touched']")
	public WebElement Rows;
	
	@FindBy(xpath = "//div[@class='drawer-component']/div/div[2]/span/span")
	public WebElement Cancel;

	
	@FindBy(xpath = "//div[@class='action-buttons']/div/div[2]/button")
	public WebElement alert_delete;
	
	@FindBy(xpath = "//input[@aria-label='Serial Number']")
	public WebElement SerialNumber;
	
	@FindBy(xpath = "//input[@aria-label='Auth Key']")
	public WebElement Auth_Key;
	
	@FindBy(xpath = "//input[@aria-label='TPN']")
	public WebElement TPN;
	
	@FindBy(xpath = "//input[@aria-label='Token']")
	public WebElement Token;
	
	@FindBy(xpath = "//div[@class='action-buttons']/div/div[1]/button")
	WebElement alert_cancel;
	Common_XPaths cp;
	
	public void settings() {
		Settings.click();
	}
	
	public void emvset() {
		EMVSettingBtn.click();
	}
	
	public void Click_NewEMV() {
		NewEMVSettingBtn.click();
	}
	
	public void EnterIP(String Str) throws Exception {
		Thread.sleep(500);
		IPAddress.clear();
		Thread.sleep(500);
		IPAddress.sendKeys(Str);
	}
	
	public void Click_Delete() {
		delete.click();
	}
	
	public void Alert_Click_Delete_Cancel() throws InterruptedException {
		alert_delete.click();
		Thread.sleep(1000);
		/*
		String delete_opt= driver.findElement(By.xpath("//div[@class='action-buttons']/div/div[2]/button/span[1]")).getText();
		String cancel_opt= driver.findElement(By.xpath("//div[@class='action-buttons']/div/div[1]/button/span[1]")).getText();
		String Delete = null;
		if(delete_opt == Delete) {
			alert_delete.click();
			Thread.sleep(500);
		}
		else {
			alert_cancel.click();
			Thread.sleep(500);
		}
		*/
	}
	public void rows_per_page() throws InterruptedException {
		Rows.click();Thread.sleep(1000);
		List<WebElement> nums=driver.findElements(By.xpath("//div[@class='row m-0 ng-star-inserted']/div[2]/app-selectbox"));
		
		int num=nums.size();
		
		int randomNum=ThreadLocalRandom.current().nextInt(1, num);
		
		driver.findElement(By.xpath("//div[@class='options']/select-option["+randomNum+"]")).click();
	}
	
	public void Select_Type()
	{
		TypeInputBox.click();
		
	    List<WebElement> TypeList=driver.findElements(By.xpath("//div[@class='options']/select-option"));
		
		int Type=TypeList.size();
		
		int randomType=ThreadLocalRandom.current().nextInt(1, Type);
		
		driver.findElement(By.xpath("//div[@class='options']/select-option["+randomType+"]")).click();
	
	}
}
