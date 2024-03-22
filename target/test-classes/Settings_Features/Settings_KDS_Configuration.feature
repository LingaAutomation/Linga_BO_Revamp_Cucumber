#//****************************************************
#//-----------Read me---Execution Steps to Follow----------------
#//Input the Username_Report and password_Report into LoginTest.java - Line no 72
#//Input the Store name into LoginPage()- Line no 168
#// Input the StoreID into OpentheSettings-KDSConfigurationSettingsHomePageBaseURLandstoreID() in Settings_KDS_COnfigurationPage
#// 
#//Update Runner class with::: 
#// features={"classpath:Settings_Features"}
#// tags = ("@KDCConfiguration")
#//
#//Update Common_data properties file:
#//
#//
#//
#//
#
#//****************************************************

@Settings
@KDSConfiguration
Feature: Settings - KDS Configuration
	I Verifying the KDS Configuration Settings for Printer Templates
	
Background: Open the Payment Settings Home Page
Given Open the Settings - KDS Configuration Settings Home Page BaseURL and storeID

@KDSC1
Scenario: Verify KDS Configuration Page Header
Given Verifying  KDS Configuration Page Header
And I Verify Update button is disabled

@KDSC2
Scenario: Verify Field Options Page Header
And I Click Field Options
Then Verify Field Options Page Header
And I Verify Update button is disabled
And I Click Field Options

@KDSC3
Scenario: Verify Style Options Page Header
And I Click Style Options
Then Verify Style Options Page Header
And I Verify Update button is disabled
And I Click Field Options

@KDSC4
Scenario: Verify SMS Order Notifications Page Header
And I Click SMS Order Notifications Options
Then Verify SMS Order Notifications Page Header
And I Verify Update button is disabled
And I Click Field Options

@KDSC5
Scenario: Verify Field Options Fields are displayed
And I Click Field Options
Then Check Field Options Table Name displayed
Then Check Field Options Service Type displayed
Then Check Field Options Check Number displayed
Then Check Field Options Seat Number displayed
Then Check Field Options Time displayed
Then Check Field Options Notes displayed
Then Check Field Options Server Name displayed
Then Check Field Options KDS DoneButton displayed
Then Check Field Options KDS Ticket preview displayed
Then Check Field Options HorizontalViewforModifier displayed
Then Check Field Options Disable KDS Broadcast displayed


@KDSC6
Scenario: Verify Field Options Fields boxes are all UNCHECKED and displayed in KDS Ticket PreviewTable
And I Click Field Options
And I UnSelect the Field Options Table Name Check box
Then I Verify Table Name not displayed in the KDS Ticket PreviewTable
And I UnSelect the Field Options Service Type Check box
Then I Verify Service Type not displayed in the KDS Ticket PreviewTable
And I UnSelect the Field Options Check Number Check box
Then I Verify Check Number not displayed in the KDS Ticket PreviewTable
And I UnSelect the Field Options Seat Number Check box
Then I Verify Seat Number not displayed in the KDS Ticket PreviewTable
And I UnSelect the Field Options Time Check box
Then I Verify Time not displayed in the KDS Ticket PreviewTable
And I UnSelect the Field Options Notes Check box
Then I Verify Notes not displayed in the KDS Ticket PreviewTable
And I UnSelect the Field Options Server Name Check box
Then I Verify Server Name not displayed in the KDS Ticket PreviewTable
And I UnSelect the Field Options KDS DoneButton Check box
Then I Verify KDS DoneButton not displayed in the KDS Ticket PreviewTable
Then I Verify Update button is enabled
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC7
Scenario: Verify Field Options Fields boxes are all CHECKED and displayed in KDS Ticket PreviewTable
And I Click Field Options
And I Select the Field Options Table Name Check box
Then I Verify Table Name displayed in the KDS Ticket PreviewTable
And I Select the Field Options Service Type Check box
Then I Verify Service Type displayed in the KDS Ticket PreviewTable
And I Select the Field Options Check Number Check box
Then I Verify Check Number displayed in the KDS Ticket PreviewTable
And I Select the Field Options Seat Number Check box
Then I Verify Seat Number displayed in the KDS Ticket PreviewTable
And I Select the Field Options Time Check box
Then I Verify Time displayed in the KDS Ticket PreviewTable
And I Select the Field Options Notes Check box
Then I Verify Notes displayed in the KDS Ticket PreviewTable
And I Select the Field Options Server Name Check box
Then I Verify Server Name displayed in the KDS Ticket PreviewTable
And I Select the Field Options KDS DoneButton Check box
Then I Verify KDS DoneButton displayed in the KDS Ticket PreviewTable
Then I Verify Update button is enabled
And I Click Update button
Then I Verify KDS Configuration settings saved successfully


@KDSC8
Scenario: Verify Field Options Horizontal View for Modifier Toggle Disabled
And I Click Field Options
And I select Horizontal View for Modifier Toggle as NO
Then Verify Horizontal View for Modifier Toggle is Disabled
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC9
Scenario: Verify Field Options Horizontal View for Modifier Toggle Enabled
And I Click Field Options
And I select Horizontal View for Modifier Toggle as YES
Then Verify Horizontal View for Modifier Toggle is Enabled
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC10
Scenario: Verify Field Options Disable KDS Broadcast Toggle Disabled
And I Click Field Options
And I select Disable KDS Broadcast Toggle as No
Then Verify Disable KDS Broadcast Toggle is Disabled
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC11
Scenario: Verify Field Options Disable KDS Broadcast Toggle Enabled
And I Click Field Options
And I select Disable KDS Broadcast Toggle as YES
Then Verify Disable KDS Broadcast Toggle is Enabled
And I Click Update button
Then I Verify KDS Configuration settings saved successfully


@KDSC12
Scenario: Verify Style Options Fields are displayed
And I Click Style Options
Then Check Modifier Color field is displayed
Then Check Addon Color field is displayed
Then Check Status1 field is displayed
Then Check Status1-Status Color field is displayed
Then Check Status1-AfterMins field is displayed
Then Check Status2 field is displayed
Then Check Status2-Status Color field is displayed
Then Check Status2-AfterMins field is displayed
Then Check Status3 field is displayed
Then Check Status3-Status Color field is displayed
Then Check Status3-AfterMins field is displayed

@KDSC13
Scenario: Verify Style Options Modifier color is updated and displayed in KDS Ticket PreviewTable
And I Click Style Options
And I Update Modifier Color and Verify displayed in the Tile and KDS Ticket PreviewTable
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC14
Scenario: Verify Style Options Addon color is updated and displayed in KDS Ticket PreviewTable
And I Click Style Options
And I Update Addon Color and Verify displayed in the Tile and KDS Ticket PreviewTable
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC15
Scenario: Verify Style Options Status1-Status color and AfterMins updated
And I Click Style Options
And I Update Status1 Color and Verify updated in Status1 Tile
And I Update Status1 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC16
Scenario: Verify Style Options Status1-AfterMins value Increased using IncreaseButton
And I Click Style Options
And I Increase Status1 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC17
Scenario: Verify Style Options Status1-AfterMins value Decreased using DecreaseButton
And I Click Style Options
And I Decrease Status1 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC18
Scenario: Verify Style Options Status1-AfterMins field updated with Character
And I Click Style Options
And I Update Status1 AfterMins with Character and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC19
Scenario: Verify Style Options Status1-AfterMins field updated with Negative value
And I Click Style Options
And I Update Status1 AfterMins with Negative Value and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC20
Scenario: Verify Style Options Status2-Status color and AfterMins updated
And I Click Style Options
And I Update Status2 Color and Verify updated in Status2 Tile
And I Update Status2 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC21
Scenario: Verify Style Options Status2-AfterMins value Increased using IncreaseButton
And I Click Style Options
And I Increase Status2 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC22
Scenario: Verify Style Options Status2-AfterMins value Decreased using DecreaseButton
And I Click Style Options
And I Decrease Status2 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC23
Scenario: Verify Style Options Status2-AfterMins field updated with Character
And I Click Style Options
And I Update Status2 AfterMins with Character and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC24
Scenario: Verify Style Options Status2-AfterMins field updated with Negative value
And I Click Style Options
And I Update Status2 AfterMins with Negative Value and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC25
Scenario: Verify Style Options Status3-Status color and AfterMins updated
And I Click Style Options
And I Update Status3 Color and Verify updated in Status3 Tile
And I Update Status3 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC26
Scenario: Verify Style Options Status3-AfterMins value Increased using IncreaseButton
And I Click Style Options
And I Increase Status3 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully


@KDSC27
Scenario: Verify Style Options Status3-AfterMins value Decreased using DecreaseButton
And I Click Style Options
And I Decrease Status3 AfterMins and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC28
Scenario: Verify Style Options Status3-AfterMins field updated with Character
And I Click Style Options
And I Update Status3 AfterMins with Character and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC29
Scenario: Verify Style Options Status3-AfterMins field updated with Negative value
And I Click Style Options
And I Update Status3 AfterMins with Negative Value and Verify
And I Click Update button
Then I Verify KDS Configuration settings saved successfully


@KDSC30
Scenario: Verify SMS Order Notifications Fields are displayed
And I Click SMS Order Notifications Options
Then Check Customer Arrived Notification is displayed
Then Check Completed Order: QSR is displayed
Then Check Completed Order: Table Service is displayed
Then Check Completed Order: Online Order is displayed
Then Check Completed Order: Delivery Order is displayed
Then Check Completed Order: To Go Order is displayed
Then Check Completed Order: For Here Order is displayed
Then Check Completed Order: Bar Tab Order is displayed


@KDSC31
Scenario: Verify SMS Order Notifications Toggles are Set to NO
And I Click SMS Order Notifications Options
And I Select Customer Arrived Notification Toggle as NO
And I Select Completed Order: QSR is displayed as NO
And I Select Completed Order: Table Service is displayed as NO
And I Select Completed Order: Online Order is displayed as NO
And I Select Completed Order: Delivery Order is displayed as NO
And I Select Completed Order: To Go Order is displayed as NO
And I Select Completed Order: For Here Order is displayed as NO
And I Select Completed Order: Bar Tab Order is displayed as NO
And I Click Update button
Then I Verify KDS Configuration settings saved successfully

@KDSC32
Scenario: Verify SMS Order Notifications Toggles are Set to YES
And I Click SMS Order Notifications Options
And I Select Customer Arrived Notification Toggle as YES
And I Select Completed Order: QSR is displayed as YES and Enter Message
And I Select Completed Order: Table Service is displayed as YES and Enter Message
And I Select Completed Order: Online Order is displayed as YES and Enter Message
And I Select Completed Order: Delivery Order is displayed as YES and Enter Message
And I Select Completed Order: To Go Order is displayed as YES and Enter Message
And I Select Completed Order: For Here Order is displayed as YES and Enter Message
And I Select Completed Order: Bar Tab Order is displayed as YES and Enter Message
And I Click Update button
Then I Verify KDS Configuration settings saved successfully
