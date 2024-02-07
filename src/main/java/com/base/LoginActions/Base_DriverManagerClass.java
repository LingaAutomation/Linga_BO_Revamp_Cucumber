package com.base.LoginActions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.epam.healenium.SelfHealingDriver;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Base_DriverManagerClass 
{
     
    private static Base_DriverManagerClass helperClass;
     
    private static SelfHealingDriver driver;
    private static ExtentTest test;
    public final static int TIMEOUT = 10;
     
     private Base_DriverManagerClass() {
          
    	

 
     }      
             
    public static void openPage(String url) {
        driver.get(url);
    }
     
    public static SelfHealingDriver getDriver() {
        return driver;
                 
    }
    
    public static ExtentTest getTest() {
        return test;
                 
    }
     
    public static void setUpDriver() {
         
        if (helperClass==null) {
             
            helperClass = new Base_DriverManagerClass();
        }
    }
 
     public static void tearDown() {
          
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
          
         helperClass = null;
 
     } 
     
}