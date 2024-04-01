#//*******************************************************************************************************************
#//--------------------------READ ME---Execution Steps to Follow------------------------------------------------------
#//Input the Username_Report and password_Report into LoginTest.java - Line no 72
#//Input the Store name into LoginPage()- Line no 168
#//Input the Store ID into openTheReportsEmployeeLaborHomePageBaseURLAndStoreID() in Settings_AdditionalSettingsPage
#// 
#// Update Runner class with:::::::::::::::
#// features={"classpath:Settings_Features"}
#// tags =("@AdditionalSettings")
#//
#//Important:::::::::::::::::::::::::::::::
#       Make sure, you setting up all Toggles to "YES" and SAVE it before triggering this suite for execution
#//
#//*******************************************************************************************************************

@Settings
@AdditionalSettings
Feature: Settings - Additional Settings
	I Verifying the Settings for Additional Settings
	
Background: Open the Settings - Additional Settings Home Page
Given Open the Settings - Additional Settings Home Page BaseURL and storeID

@ADDS1
Scenario: Verify Additional Settings Page Header
Given Verifying Additional Settings Page Header
Then I Verify Additional Settings SAVE button is Disabled

@ADDS2
Scenario: Verify Whether All Additional Settings Fields are displayed
Then Check Include Credits in Daily Summary Report Field is displayed
Then Check Employee Tip Out Deducted from Cash Expected on Reports Field is displayed
Then Check Auto Print Close Day Report Field is displayed
Then I Verify Additional Settings SAVE button is Disabled

@ADDS3
Scenario: Verify Whether Additional Settings Toggles are Disabled
And I Click Include Credits in Daily Summary Report Field Toggle as No
And I Click Employee Tip Out Deducted from Cash Expected on Reports Field Toggle as No
And I Click Auto Print Close Day Report Field Toggle as No
Then I Verify Additional Settings SAVE button is Enabled
And I Click Additional Settings SAVE button
Then I Verify Additional Settings SAVED successfully

@ADDS4
Scenario: Verify Whether Additional Settings Toggles are Enabled
And I Click Include Credits in Daily Summary Report Field Toggle as Yes
And I Click Employee Tip Out Deducted from Cash Expected on Reports Field Toggle as Yes
And I Click Auto Print Close Day Report Field Toggle as Yes
Then I Verify Additional Settings SAVE button is Enabled
And I Click Additional Settings SAVE button
Then I Verify Additional Settings SAVED successfully
