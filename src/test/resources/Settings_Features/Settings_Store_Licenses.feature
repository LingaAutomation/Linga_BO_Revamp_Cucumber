#//*******************************************************************************************************************
#//--------------------------READ ME---Execution Steps to Follow------------------------------------------------------
#//Input the Username_Report and password_Report into LoginTest.java - Line no 72
#//Input the Store name into LoginPage()- Line no 168
#//Input the Store ID into openTheSettingsStoreLicensesHomePageBaseURLAndStoreID() in Settings_StoreLicences_Page
#// 
#// Update Runner class with:::::::::::::::
#// features={"classpath:Settings_Features"}
#// tags =("@SettingsStoreLicenses")
#//
#//Important:::::::::::::::::::::::::::::::
#//  ************1. Make sure Minimum 2 no of Store licenses present in Store Licenses - Settings ***********************************
#//*******************************************************************************************************************

@Settings
@SettingsStoreLicenses
Feature: Settings - Store Licenses
I Verifying the Settings for Store Licenses
	
Background: Open the Settings Store Licenses Home Page
Given Open the Settings - Store Licenses Home Page BaseURL and storeID

@SSL1
Scenario: Verify Store Licenses Page Header
Given I Verify Store Licenses Settings Page Header in Store Licenses settings

@SSL2
Scenario: Verify Whether Store Licenses Settings Fields are displayed
Given I Check Store Licenses Header in Store Licenses settings
Then I Check Note Id is displayed in Store Licenses settings
Then I Check Device Type is displayed in Store Licenses settings
Then I Check Device Name is displayed in Store Licenses settings
Then I Check Last Login Time is displayed in Store Licenses settings
Then I Check Last Access Time is displayed in Store Licenses settings
Then I Check Actions is displayed in Store Licenses settings
Then I Check Rows per page is displayed in Store Licenses settings

@SSL3
Scenario: Verify whether we can able to do Pagination for Ten pages in Store Licenses settings
Given I can do the Pagination for Ten pages in Store Licenses settings

@SSL4
Scenario: Verify whether we can able to do Pagination for Twenty pages in Store Licenses settings
Given I can do the Pagination for Twenty pages in Store Licenses settings

@SSL5
Scenario: Verify whether we can able to do Pagination for Fifty pages in Store Licenses settings
Given I can do the Pagination for Fifty pages in Store Licenses settings

@SSL6
Scenario: Verify whether we can able to do Pagination for Hundread pages in Store Licenses settings
Given I can do the Pagination for Hundread pages in Store Licenses settings

@SSL7
Scenario: Verify Whether able to SIGNOUT with NO Option
Given I Click SIGN OUT button from Store Licences
Then I Verify Store Licences Reminder Alert Pop up Message
And I Click No button from Store Licences Reminder Alert Pop up Message
Then I Verify Store Licenses Settings Page Header in Store Licenses settings

@SSL8
Scenario: Verify Whether able to SIGNOUT with CLOSE Option
Given I Click SIGN OUT button from Store Licences
Then I Verify Store Licences Reminder Alert Pop up Message
And I Click Close button from Store Licences Reminder Alert Pop up Message
Then I Verify Store Licenses Settings Page Header in Store Licenses settings

@SSL9
Scenario: Verify Whether able to SIGNOUT with YES Option
Given I Click SIGN OUT button from Store Licences
Then I Verify Store Licences Reminder Alert Pop up Message
And I Click Yes button from Store Licences Reminder Alert Pop up Message
Then I Verify Store License Unlinked Successfully
Then I Verify Store Licenses Settings Page Header in Store Licenses settings

@SSL10
Scenario: Verify whether able to filter the Store Licenses table COLUMNS
When User Select the Filter option with Columns
And Verify the Ascending and Decending Order