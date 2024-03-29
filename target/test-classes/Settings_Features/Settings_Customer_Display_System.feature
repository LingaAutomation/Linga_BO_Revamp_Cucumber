#//*******************************************************************************************************************
#//--------------------------READ ME---Execution Steps to Follow------------------------------------------------------
#//Input the Username_Report and password_Report into LoginTest.java - Line no 72
#//Input the Store name into LoginPage()- Line no 168
#//Input the Store ID into openTheReportsEmployeeLaborHomePageBaseURLAndStoreID() in Settings_NotificationsPage
#// 
#// Update Runner class with:::::::::::::::
#// features={"classpath:Settings_Features"}
#// tags =("@SettingsCustomerDisplayScreen")
#//
#//Important:::::::::::::::::::::::::::::::
#       Make sure, you setting up all Toggles to "NO" and SAVE it before triggering this suite for execution
#//
#//*******************************************************************************************************************

@Settings
@SettingsCustomerDisplaySystem
Feature: Settings - Customer Display System
	I Verifying the Settings for Customer Display System
	
Background: Open the Settings Customer Display System Home Page
Given Open the Settings - Customer Display System Home Page BaseURL and storeID

@SCDS1
Scenario: Verify Customer Display System Page Header
Given Verifying  Customer Display System Page Header
And I Verify Customer Display System SAVE button is Disabled

@SCDS2
Scenario: Verify Whether All Customer Display System Settings Fields are displayed
Then Check Show Advertisements Field is displayed
Then Check Customer Profile Field is displayed
Then Check Theme Field is displayed
Then Check Theme Label is displayed
Then Check Discount Text Field is displayed
Then Check Discount Text Message box is displayed
Then Check Get Number Text Field is displayed
Then Check Get Number Text message box is displayed
Then Check Loyalty Text Field is displayed
Then Check Loyalty Text Message box is displayed

@SCDS3
Scenario: Verify Whether Customer Display System Settings Toggles are Disabled
And I Click Show Advertisements Field Toggle as No
And I Click Customer Profile Field Toggle as No
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS4
Scenario: Verify Whether Customer Display System Settings Toggles are Enabled
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as Yes
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS5
Scenario: Verify Whether able to update the CDS Settings with Dark Theme
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as Yes
And I Select Theme as Dark Theme
And I Enter Discount Text
And I Enter Get Number Text
And I Enter Loyalty Text
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS6
Scenario: Verify Whether able to update the CDS Settings with Light Theme
And I Click Show Advertisements Field Toggle as No
And I Click Customer Profile Field Toggle as No
And I Select Theme as Light Theme
And I Enter Discount Text
And I Enter Get Number Text
And I Enter Loyalty Text
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS7
Scenario: Verify Whether able to update the CDS Settings with Valid limit Discount Text
And I Click Show Advertisements Field Toggle as No
And I Click Customer Profile Field Toggle as Yes
And I Select Theme as Light Theme
And I Enter Discount Text with Valid limit
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS8
Scenario: Verify Whether able to update the CDS Settings with Valid limit Get Number Text
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as No
And I Select Theme as Dark Theme
And I Enter Get Number Text with Valid limit
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS9
Scenario: Verify Whether able to update the CDS Settings with Valid limit Loyalty Text
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as Yes
And I Select Theme as Light Theme
And I Enter Loyalty Text with Valid limit
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS10
Scenario: Verify Whether able to update the CDS Settings with Valid1 limit Discount Text
And I Click Show Advertisements Field Toggle as No
And I Click Customer Profile Field Toggle as Yes
And I Select Theme as Light Theme
And I Enter Discount Text with Valid1 limit
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS11
Scenario: Verify Whether able to update the CDS Settings with Valid1 limit Get Number Text
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as No
And I Select Theme as Dark Theme
And I Enter Get Number Text with Valid1 limit
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS12
Scenario: Verify Whether able to update the CDS Settings with Valid1 limit Loyalty Text
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as Yes
And I Select Theme as Light Theme
And I Enter Loyalty Text with Valid1 limit
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS13
Scenario: Verify Whether able to update the CDS Settings with Greater than Discount Text Invalid limit
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as Yes
And I Select Theme as Dark Theme
And I Enter Discount Text Greater than Invalid limit
Then I Verify Discount Text Message Box Error
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS14
Scenario: Verify Whether able to update the CDS Settings with Greater than Get Number Text Invalid limit
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as Yes
And I Select Theme as Light Theme
And I Enter Get Number Text Greater than Invalid limit
Then I Verify Get Number Text Message Box Error
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully

@SCDS15
Scenario: Verify Whether able to update the CDS Settings with Greater than Loyalty Text Invalid limit
And I Click Show Advertisements Field Toggle as Yes
And I Click Customer Profile Field Toggle as Yes
And I Select Theme as Dark Theme
And I Enter Loyalty Text Greater than Invalid limit
Then I Verify Loyalty Text Message Box Error
Then I Verify Customer Display System SAVE button is Enabled
And I Click Customer Display System SAVE btn
Then I Verify CDS Settings Updated Successfully
