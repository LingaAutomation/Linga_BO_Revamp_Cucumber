#//****************************************************
#//-----------Read me---Execution Steps to Follow----------------
#//Input the Username_Report and password_Report into LoginTest.java - Line no 72
#//Input the Store name into LoginPage()- Line no 168
#// Input the Store ID into openTheReportsEmployeeLaborHomePageBaseURLAndStoreID() in Settings_NotificationsPage
#// 
#//Update Runner class with::: 
#// features={"classpath:Settings_Features"}
#// tags = ("@SettingsNotifications")
#//
#//Important:::: 
#       Make sure, you setting up all Notification Toggles to "NO" and SAVE it before triggering this suite for execution
#//
#//****************************************************


@Settings
@SettingsNotifications
Feature: Settings - Notifications
	I Verifying the Settings for Notifications
	
Background: Open the Settings Notifications Home Page
Given Open the Settings - Notifications Home Page BaseURL and storeID

@SN1
Scenario: Verify Notification Page Header
Given Verifying  Notifications Page Header
And I Verify Notifications SAVE button is Disabled

@SN2
Scenario: Verify Whether All Notification Settings Fields are displayed
Then Check Discount Field is displayed
Then Check Void Field is displayed
Then Check Max No Cash Drawer Accessed For No Sale Field is displayed
Then Check Time Clock Field is displayed
Then Check Daily KPI Field is displayed
Then Check End Of the Day Alert Field is displayed
Then Check Wait List Field is displayed
Then Check Sale Recap Report Field is displayed
Then Check One Page PDF Field is displayed
Then Check Offline Payment Field is displayed

@SN3
Scenario: Verify Whether Notification Settings Toggles are Disabled
And I Click Discount Field Toggle as No
And I Click Void Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Time Clock Field Toggle as No
And I Click Daily KPI Field Toggle as No
And I Click End Of the Day Alert Field Toggle as No
And I Click Wait List Field Toggle as No
And I Click Sale Recap Report Field Toggle as No
And I Click One Page PDF Field Toggle as No
And I Click Offline Payment Field Toggle as No
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN4
Scenario: Verify Whether able to update the Discount Notification Settings
And I Click Discount Field Toggle as Yes
And I Enter Discount Limit
And I Select Notify by Text for discount
And I Enter Valid Mobile number for discount
And I Select Notify by Email for discount
And I Enter Valid Email ID for discount
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN5
Scenario: Verify Whether able to update the Discount Notification Settings with Negative Dicount Limit
And I Click Discount Field Toggle as No
And I Click Discount Field Toggle as Yes
And I Enter Discount Limit with Negative Value
And I Select Notify by Text for discount
And I Enter Valid Mobile number for discount
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN6
Scenario: Verify Whether able to update the Discount Notification Settings with Characters in Dicount Limit
And I Click Discount Field Toggle as No
And I Click Discount Field Toggle as Yes
And I Enter Discount Limit with Characters
And I Select Notify by Email for discount
And I Enter Valid Email ID for discount
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN7
Scenario: Verify Whether able to update the Discount Notification Settings with less than 1 digit phone number
And I Click Discount Field Toggle as No
And I Click Discount Field Toggle as Yes
And I Enter Discount Limit
And I Select Notify by Text for discount
And I Enter Mobile number with one digit for discount
Then I Verify Enter Valid Phone Number Error message for discount
Then I Verify Notifications SAVE button is Disabled

@SN8
Scenario: Verify Whether able to update the Discount Notification Settings with less than 6 digit phone number
And I Click Discount Field Toggle as No
And I Click Discount Field Toggle as Yes
And I Enter Discount Limit
And I Select Notify by Text for discount
And I Enter Mobile number with less than 6 digit for discount
Then I Verify Phone Number Should Be Contain At Least 6 Digits Error message for discount
Then I Verify Notifications SAVE button is Disabled

@SN9
Scenario: Verify Whether able to update the Discount Notification Settings with more than one phone number
And I Click Discount Field Toggle as No
And I Click Discount Field Toggle as Yes
And I Enter Discount Limit
And I Select Notify by Text for discount
And I Enter more than one Phone number for discount
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN10
Scenario: Verify Whether able to update the Discount Notification Settings with Invalid Email ID
And I Click Discount Field Toggle as No
And I Click Discount Field Toggle as Yes
And I Enter Discount Limit
And I Select Notify by Email for discount
And I Enter Invalid Email ID for discount
Then I Verify Enter Valid Email Error message for discount
Then I Verify Notifications SAVE button is Disabled

@SN11
Scenario: Verify Whether able to update the Discount Notification Settings with more than One EMailID
And I Click Discount Field Toggle as No
And I Click Discount Field Toggle as Yes
And I Enter Discount Limit
And I Select Notify by Email for discount
And I Enter more than one valid EMailId for discount
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN12
Scenario: Verify Whether able to update the Void Notification Settings
And I Click Void Field Toggle as Yes
And I Enter Void Limit
And I Select Notify by Text for void
And I Enter Valid Mobile number for void
And I Select Notify by Email for void
And I Enter Valid Email ID for void
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN13
Scenario: Verify Whether able to update the Void Notification Settings with Negative Void Limit
And I Click Void Field Toggle as No
And I Click Void Field Toggle as Yes
And I Enter Void Limit with Negative Value
And I Select Notify by Text for void
And I Enter Valid Mobile number for void
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN14
Scenario: Verify Whether able to update the Void Notification Settings with Characters in Void Limit
And I Click Void Field Toggle as No
And I Click Void Field Toggle as Yes
And I Enter Void Limit with Characters
And I Select Notify by Email for void
And I Enter Valid Email ID for void
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN15
Scenario: Verify Whether able to update the Void Notification Settings with less than 1 digit phone number
And I Click Void Field Toggle as No
And I Click Void Field Toggle as Yes
And I Enter Void Limit
And I Select Notify by Text for void
And I Enter Mobile number with one digit for void
Then I Verify Enter Valid Phone Number Error message for void
Then I Verify Notifications SAVE button is Disabled

@SN16
Scenario: Verify Whether able to update the Void Notification Settings with less than 6 digit phone number
And I Click Void Field Toggle as No
And I Click Void Field Toggle as Yes
And I Enter Void Limit
And I Select Notify by Text for void
And I Enter Mobile number with less than 6 digit for void
Then I Verify Phone Number Should Be Contain At Least 6 Digits Error message for void
Then I Verify Notifications SAVE button is Disabled

@SN17
Scenario: Verify Whether able to update the Void Notification Settings with more than one phone number
And I Click Void Field Toggle as No
And I Click Void Field Toggle as Yes
And I Enter Void Limit
And I Select Notify by Text for void
And I Enter more than one Phone number for void
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN18
Scenario: Verify Whether able to update the Void Notification Settings with Invalid Email ID
And I Click Void Field Toggle as No
And I Click Void Field Toggle as Yes
And I Enter Void Limit
And I Select Notify by Email for void
And I Enter Invalid Email ID for void
Then I Verify Enter Valid Email Error message for void
Then I Verify Notifications SAVE button is Disabled

@SN19
Scenario: Verify Whether able to update the Void Notification Settings with more than One EMailID
And I Click Void Field Toggle as No
And I Click Void Field Toggle as Yes
And I Enter Void Limit
And I Select Notify by Email for void
And I Enter more than one valid EMailId for void
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN20
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit
And I Select Notify by Text for Cashdrawer
And I Enter Valid Mobile number for Cashdrawer
And I Select Notify by Email for Cashdrawer
And I Enter Valid Email ID for Cashdrawer
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN21
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings with Negative Max No Cash Drawer Accessed For No Sale Limit
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit with Negative Value
Then I Verify Max No Cash Drawer Accessed For No Sale Limit Error Message
Then I Verify Notifications SAVE button is Disabled

@SN22
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings with Greater Max No Cash Drawer Accessed For No Sale Limit
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit with Greater Value
Then I Verify Max No Cash Drawer Accessed For No Sale Limit Error Message
Then I Verify Notifications SAVE button is Disabled

@SN23
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings with Characters in Max No Cash Drawer Accessed For No Sale Limit
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit with Characters
And I Select Notify by Email for Cashdrawer
And I Enter Valid Email ID for Cashdrawer
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN24
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings with less than 1 digit phone number
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit
And I Select Notify by Text for Cashdrawer
And I Enter Mobile number with one digit for Cashdrawer
Then I Verify Enter Valid Phone Number Error message for Cashdrawer
Then I Verify Notifications SAVE button is Disabled

@SN25
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings with less than 6 digit phone number
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit
And I Select Notify by Text for Cashdrawer
And I Enter Mobile number with less than 6 digit for Cashdrawer
Then I Verify Phone Number Should Be Contain At Least 6 Digits Error message for Cashdrawer
Then I Verify Notifications SAVE button is Disabled

@SN26
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings with more than one phone number
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit
And I Select Notify by Text for Cashdrawer
And I Enter more than one Phone number for Cashdrawer
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN27
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings with Invalid Email ID
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit
And I Select Notify by Email for Cashdrawer
And I Enter Invalid Email ID for Cashdrawer
Then I Verify Enter Valid Email Error message for Cashdrawer
Then I Verify Notifications SAVE button is Disabled

@SN28
Scenario: Verify Whether able to update the Max No Cash Drawer Accessed For No Sale Notification Settings with more than One EMailID
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as No
And I Click Max No Cash Drawer Accessed For No Sale Field Toggle as Yes
And I Enter Max No Cash Drawer Accessed For No Sale Limit
And I Select Notify by Email for Cashdrawer
And I Enter more than one valid EMailId for Cashdrawer
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN29
Scenario: Verify Whether able to update the Time Clock Notification Settings
And I Click Time Clock Field Toggle as Yes
And I Select Notify by Text for Time Clock
And I Enter Valid Mobile number for Time Clock
And I Select Notify by Email for Time Clock
And I Enter Valid Email ID for Time Clock
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully


@SN30
Scenario: Verify Whether able to update the Time Clock Notification Settings with less than 1 digit phone number
And I Click Time Clock Field Toggle as No
And I Click Time Clock Field Toggle as Yes
And I Select Notify by Text for Time Clock
And I Enter Mobile number with one digit for Time Clock
Then I Verify Enter Valid Phone Number Error message for Time Clock
Then I Verify Notifications SAVE button is Disabled

@SN31
Scenario: Verify Whether able to update the Time Clock Notification Settings with less than 6 digit phone number
And I Click Time Clock Field Toggle as No
And I Click Time Clock Field Toggle as Yes
And I Select Notify by Text for Time Clock
And I Enter Mobile number with less than 6 digit for Time Clock
Then I Verify Phone Number Should Be Contain At Least 6 Digits Error message for Time Clock
Then I Verify Notifications SAVE button is Disabled

@SN32
Scenario: Verify Whether able to update the Time Clock Notification Settings with more than one phone number
And I Click Time Clock Field Toggle as No
And I Click Time Clock Field Toggle as Yes
And I Select Notify by Text for Time Clock
And I Enter more than one Phone number for Time Clock
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN33
Scenario: Verify Whether able to update the Time Clock Notification Settings with Invalid Email ID
And I Click Time Clock Field Toggle as No
And I Click Time Clock Field Toggle as Yes
And I Select Notify by Email for Time Clock
And I Enter Invalid Email ID for Time Clock
Then I Verify Enter Valid Email Error message for Time Clock
Then I Verify Notifications SAVE button is Disabled

@SN34
Scenario: Verify Whether able to update the Time Clock Notification Settings with more than One EMailID
And I Click Time Clock Field Toggle as No
And I Click Time Clock Field Toggle as Yes
And I Select Notify by Email for Time Clock
And I Enter more than one valid EMailId for Time Clock
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN35
Scenario: Verify Whether able to update the Daily KPI Notification Settings
And I Click Daily KPI Field Toggle as Yes
And I Select Notify by Text for Daily KPI
And I Enter Valid Mobile number for Daily KPI
And I Select Notify by Email for Daily KPI
And I Enter Valid Email ID for Daily KPI
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully


@SN36
Scenario: Verify Whether able to update the Daily KPI Notification Settings with less than 1 digit phone number
And I Click Daily KPI Field Toggle as No
And I Click Daily KPI Field Toggle as Yes
And I Select Notify by Text for Daily KPI
And I Enter Mobile number with one digit for Daily KPI
Then I Verify Enter Valid Phone Number Error message for Daily KPI
Then I Verify Notifications SAVE button is Disabled

@SN37
Scenario: Verify Whether able to update the Daily KPI Notification Settings with less than 6 digit phone number
And I Click Daily KPI Field Toggle as No
And I Click Daily KPI Field Toggle as Yes
And I Select Notify by Text for Daily KPI
And I Enter Mobile number with less than 6 digit for Daily KPI
Then I Verify Phone Number Should Be Contain At Least 6 Digits Error message for Daily KPI
Then I Verify Notifications SAVE button is Disabled

@SN38
Scenario: Verify Whether able to update the Daily KPI Notification Settings with more than one phone number
And I Click Daily KPI Field Toggle as No
And I Click Daily KPI Field Toggle as Yes
And I Select Notify by Text for Daily KPI
And I Enter more than one Phone number for Daily KPI
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN39
Scenario: Verify Whether able to update the Daily KPI Notification Settings with Invalid Email ID
And I Click Daily KPI Field Toggle as No
And I Click Daily KPI Field Toggle as Yes
And I Select Notify by Email for Daily KPI
And I Enter Invalid Email ID for Daily KPI
Then I Verify Enter Valid Email Error message for Daily KPI
Then I Verify Notifications SAVE button is Disabled

@SN40
Scenario: Verify Whether able to update the Daily KPI Notification Settings with more than One EMailID
And I Click Daily KPI Field Toggle as No
And I Click Daily KPI Field Toggle as Yes
And I Select Notify by Email for Daily KPI
And I Enter more than one valid EMailId for Daily KPI
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN41
Scenario: Verify Whether able to update the End Of the Day Alert Notification Settings
And I Click End Of the Day Alert Field Toggle as Yes
And I Select Notify by Text for EOD
And I Enter Valid Mobile number for EOD
And I Select Notify by Email for EOD
And I Enter Valid Email ID for EOD
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully


@SN42
Scenario: Verify Whether able to update the End Of the Day Alert Notification Settings with less than 1 digit phone number
And I Click End Of the Day Alert Field Toggle as No
And I Click End Of the Day Alert Field Toggle as Yes
And I Select Notify by Text for EOD
And I Enter Mobile number with one digit for EOD
Then I Verify Enter Valid Phone Number Error message for EOD
Then I Verify Notifications SAVE button is Disabled

@SN43
Scenario: Verify Whether able to update the End Of the Day Alert Notification Settings with less than 6 digit phone number
And I Click End Of the Day Alert Field Toggle as No
And I Click End Of the Day Alert Field Toggle as Yes
And I Select Notify by Text for EOD
And I Enter Mobile number with less than 6 digit for EOD
Then I Verify Phone Number Should Be Contain At Least 6 Digits Error message for EOD
Then I Verify Notifications SAVE button is Disabled

@SN44
Scenario: Verify Whether able to update the End Of the Day Alert Notification Settings with more than one phone number
And I Click End Of the Day Alert Field Toggle as No
And I Click End Of the Day Alert Field Toggle as Yes
And I Select Notify by Text for EOD
And I Enter more than one Phone number for EOD
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN45
Scenario: Verify Whether able to update the End Of the Day Alert Notification Settings with Invalid Email ID
And I Click End Of the Day Alert Field Toggle as No
And I Click End Of the Day Alert Field Toggle as Yes
And I Select Notify by Email for EOD
And I Enter Invalid Email ID for EOD
Then I Verify Enter Valid Email Error message for EOD
Then I Verify Notifications SAVE button is Disabled

@SN46
Scenario: Verify Whether able to update the End Of the Day Alert Notification Settings with more than One EMailID
And I Click End Of the Day Alert Field Toggle as No
And I Click End Of the Day Alert Field Toggle as Yes
And I Select Notify by Email for EOD
And I Enter more than one valid EMailId for EOD
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN47
Scenario: Verify Whether able to update the Wait List Notification Settings
And I Click Wait List Field Toggle as Yes
And I Enter Custom Text
And I Select Notify by Text for Wait List
And I Enter Valid Mobile number for Wait List
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully


@SN48
Scenario: Verify Whether able to update the Wait List Notification Settings with less than 1 digit phone number
And I Click Wait List Field Toggle as No
And I Click Wait List Field Toggle as Yes
And I Enter Custom Text
And I Select Notify by Text for Wait List
And I Enter Mobile number with one digit for Wait List
Then I Verify Enter Valid Phone Number Error message for Wait List
Then I Verify Notifications SAVE button is Disabled

@SN49
Scenario: Verify Whether able to update the Wait List Notification Settings with less than 6 digit phone number
And I Click Wait List Field Toggle as No
And I Click Wait List Field Toggle as Yes
And I Enter Custom Text
And I Select Notify by Text for Wait List
And I Enter Mobile number with less than 6 digit for Wait List
Then I Verify Phone Number Should Be Contain At Least 6 Digits Error message for Wait List
Then I Verify Notifications SAVE button is Disabled

@SN50
Scenario: Verify Whether able to update the Wait List Notification Settings with more than one phone number
And I Click Wait List Field Toggle as No
And I Click Wait List Field Toggle as Yes
And I Enter Custom Text
And I Select Notify by Text for Wait List
And I Enter more than one Phone number for Wait List
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN51
Scenario: Verify Whether able to update the Sale Recap Report Notification Settings
And I Click Sale Recap Report Field Toggle as Yes
And I Select Notify by Email for SRR
And I Enter Valid Email ID for SRR
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully


@SN52
Scenario: Verify Whether able to update the Sale Recap Report Notification Settings with Invalid Email ID
And I Click Sale Recap Report Field Toggle as No
And I Click Sale Recap Report Field Toggle as Yes
And I Select Notify by Email for SRR
And I Enter Invalid Email ID for SRR
Then I Verify Enter Valid Email Error message for SRR
Then I Verify Notifications SAVE button is Disabled

@SN53
Scenario: Verify Whether able to update the Sale Recap Report Notification Settings with more than One EMailID
And I Click Sale Recap Report Field Toggle as No
And I Click Sale Recap Report Field Toggle as Yes
And I Select Notify by Email for SRR
And I Enter more than one valid EMailId for SRR
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN54
Scenario: Verify Whether able to update the One Page PDF Notification Settings
And I Click One Page PDF Field Toggle as Yes
And I Select Notify by Email for OPP
And I Enter Valid Email ID for OPP
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully


@SN55
Scenario: Verify Whether able to update the One Page PDF Notification Settings with Invalid Email ID
And I Click One Page PDF Field Toggle as No
And I Click One Page PDF Field Toggle as Yes
And I Select Notify by Email for OPP
And I Enter Invalid Email ID for OPP
Then I Verify Enter Valid Email Error message for OPP
Then I Verify Notifications SAVE button is Disabled

@SN56
Scenario: Verify Whether able to update the One Page PDF Notification Settings with more than One EMailID
And I Click One Page PDF Field Toggle as No
And I Click One Page PDF Field Toggle as Yes
And I Select Notify by Email for OPP
And I Enter more than one valid EMailId for OPP
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN57
Scenario: Verify Whether able to update the Offline Payment Notification Settings
And I Click Offline Payment Field Toggle as Yes
And I Select Notify by Email for offline payment
And I Enter Valid Email ID for offline payment
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully

@SN58
Scenario: Verify Whether able to update the Offline Payment Notification Settings with Invalid Email ID
And I Click Offline Payment Field Toggle as No
And I Click Offline Payment Field Toggle as Yes
And I Select Notify by Email for offline payment
And I Enter Invalid Email ID for offline payment
Then I Verify Enter Valid Email Error message for offline payment
Then I Verify Notifications SAVE button is Disabled

@SN59
Scenario: Verify Whether able to update the Offline Payment Notification Settings with more than One EMailID
And I Click Offline Payment Field Toggle as No
And I Click Offline Payment Field Toggle as Yes
And I Select Notify by Email for offline payment
And I Enter more than one valid EMailId for offline payment
Then I Verify Notifications SAVE button is Enabled
And I Click SAVE btn
Then I Verify Notification Settings SAVED Successfully
