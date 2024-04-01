#//*******************************************************************************************************************
#//--------------------------READ ME---Execution Steps to Follow------------------------------------------------------
#//Input the Username_Report and password_Report into LoginTest.java - Line no 72
#//Input the Store name into LoginPage()- Line no 168
#//Input the Store ID into openTheSettingsPOSCustomURL_PageBaseURLAndStoreID() in Settings_POS_Custom_URL_Page
#// 
#// Update Runner class with:::::::::::::::
#// features={"classpath:Settings_Features"}
#// tags =("@SettingsPOSCustomURL")
#//
#//Important:::::::::::::::::::::::::::::::
#//  ************1. DELETE ALL POS URLs before Commencing suite execution for this Module*******
#//  ************2. Make sure IMAGE LOCATION PATH IS CORRECT ***********************************
#//*******************************************************************************************************************

@Settings
@SettingsPOSCustomURL
Feature: Settings - POS Custom URLs
	I Verifying the Settings for POS Custom URLs
	
Background: Open the Settings POS Custom URLs Home Page
Given Open the Settings - POS Custom URLs Home Page BaseURL and storeID

@PCUS1
Scenario: Verify POS Custom URLs Page Header
Given I Verify POS Custom URLs Settings Page Header
Then I Verify POS Custom URLs Page Header
Then I Verify POS Custom URLs SAVE button is Disabled

@PCUS2
Scenario: Verify Whether All POS Custom URLs Settings Fields are displayed
Then Check POS Access URL Field is displayed
Then Check Name Label is displayed
Then Check URL Label is displayed
Then Check button Image field is displayed
Then I Verify POS Custom URLs SAVE button is Disabled

@PCUS3
Scenario: Verify Whether POS Custom URLs Settings Toggles are Disabled
Given I Click POS Access URL Field Toggle as No
Then I Verify POS Custom URLs SAVE button is Disabled

@PCUS4
Scenario: Verify Whether POS Custom URLs Settings Toggles are Enabled
Given I Click POS Access URL Field Toggle as Yes
Then I Verify POS Custom URLs SAVE button is Disabled

@PCUS5
Scenario: Verify Name Field Label Message in POS Custom URLs
Given I Click POS Access URL Field Toggle as Yes
And I Enter Name in POS Custom URLs
And I Clear Name in POS Custom URLs
Then I Verify Please Enter Name message
Then I Verify POS Custom URLs SAVE button is Disabled

@PCUS6
Scenario: Verify URL Field Label Message in POS Custom URLs
Given I Click POS Access URL Field Toggle as Yes
And I Enter URL in POS Custom URLs
And I Clear URL in POS Custom URLs
Then I Verify Please Enter URL message
Then I Verify POS Custom URLs SAVE button is Disabled

@PCUS7
Scenario: Verify Whether able to Add New POS Custom URLs
Given I Click POS Access URL Field Toggle as Yes
And I Enter Name in POS Custom URLs
And I Enter URL in POS Custom URLs
Then I Verify POS Custom URLs SAVE button is Disabled
And I Upload Image in POS Custom URLs
Then I Verify POS Custom URLs SAVE button is Enabled
And I Click SAVE button in POS Custom URLs
Then I Verify POS Custom URL Updated Successfully

@PCUS8
Scenario: Verify New POS Custom URL Page Header
Given I Click URL Link button in URL Links
Then I Verify New POS Custom URL Page Header in New POS Custom URL Screen
And I Verify New POS Custom URL SAVE button is Disabled
And I Click Cancel button in New POS Custom URL Screen
Given I Verify POS Custom URLs Page Header

@PCUS9
Scenario: Verify Whether able to Add New POS Custom URLs through URL Link button
Given I Click URL Link button in URL Links
And I Enter Name in New POS Custom URL Screen
And I Enter URL in New POS Custom URL Screen
Then I Verify New POS Custom URL SAVE button is Disabled in New POS Custom URL Screen
And I Upload Image in New POS Custom URL Screen
Then I Verify New POS Custom URL SAVE button is Enabled in New POS Custom URL Screen
And I Click SAVE button in New POS Custom URL Screen
Then I Verify POS Custom URL Updated Successfully

@PCUS10
Scenario: Verify Update POS Custom URL Page Header
Given I Click Edit button in URL Links
Then I Verify Update POS Custom URL Page Header
And I Verify Update POS Custom URL Update button is Disabled
And I Click Cancel button in Update POS Custom URL
Given I Verify POS Custom URLs Page Header

@PCUS11
Scenario: Verify Whether able to Edit POS Custom URLs - Name Field
Given I Click Edit button in URL Links
And I Update Name in Update POS Custom URL Screen
Then I Verify Update button is Enabled in Update POS Custom URL Screen
And I Click Update button in Update POS Custom URL Screen
Then I Verify POS Custom URL Updated Successfully

@PCUS12
Scenario: Verify Whether able to Edit POS Custom URLs - URL Field
Given I Click Edit button in URL Links
And I Update URL in Update POS Custom URL Screen
Then I Verify Update button is Enabled in Update POS Custom URL Screen
And I Click Update button in Update POS Custom URL Screen
Then I Verify POS Custom URL Updated Successfully

@PCUS13
Scenario: Verify Whether able to Delete POS Custom URLs with Delete/No
Given I Click Delete button in URL Links
And I Verify Are you sure you want to delete this item message
And I Click No button in Delete Popup
Then I Verify POS Custom URLs Page Header

@PCUS14
Scenario: Verify Whether able to Delete POS Custom URLs with Delete/Yes
Given I Click Delete button in URL Links
And I Verify Are you sure you want to delete this item message
And I Click Yes button in Delete Popup
Then I Verify URL Deleted Successfully

@PCUS15
Scenario: Verify Whether able to Add New POS Custom URLs upto ten nos through URL Link button
Given I Create Ten POS URLs One by One using URL Links
Then I Verify Ten POS URLs added

@PCUS16
Scenario: Verify Whether able to Delete All the POS Custom URLs with Delete/Yes
Given I Delete All POS URLs One by One
Then I Verify all POS URLs Deleted Successfully