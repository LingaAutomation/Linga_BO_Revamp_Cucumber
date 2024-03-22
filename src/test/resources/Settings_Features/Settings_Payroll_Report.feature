@Settings
@Payroll_Report

Feature: Settings - Payroll Report
I am verify the Settings - Payroll Report module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Settings - Payroll Report page
Given Open the Settings - Payroll Report home page BaseURL and StoreID

Scenario: Verify whether the Payroll Report Header is Displayed
Given Verifying the Payroll Report Header Page

Scenario: Verify whether the All Fields are available in Payroll Report Settings
And I Select Settings Tab
Then Check Allow Over Tip Out Toggle is Displayed
Then Check Payroll Week Start Day Field is Displayed
Then Check Default Payroll Process Field is Displayed
Then Check Rows Per Page Filter Field is Displayed
Then Check Minimum Age as Age Field is Displayed
Then Check Minimum Age as Hours Field is Displayed
Then Check Break-In/Break-Out Terminal Field is Displayed
And I Select Over Time Settings Tab
Then Check Type Field in Table is Displayed
Then Check Effective Date Field in Table is Displayed
Then Check Hours Field in Table is Displayed
Then Check Percentage Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed
And I Select Manage Breaks Tab
Then Check Effective Date Field in Table is Displayed
Then Check Break Name Field in Table is Displayed
Then Check Payroll Type Field in Table is Displayed
Then Check Duration Field in Table is Displayed
Then Check Actions Field in Table is Displayed
And I Select Settings Tab

Scenario: Verify able to Save the Payroll Settings with Minimum Age as 0
And I Select Settings Tab
And I Enable Allow Over Tip Out Toggle 
And I Select Payroll Week Start Day as Monday
And I Select Default Payroll Process as Daily
And I Enter Minimum Age Limit as Zero
Then Check Maximum age limit is 100 Error is Displayed
Then Check the Save buttonTwo is Disabled

Scenario: Verify able to Save the Payroll Settings with Minimum Age as above 100
And I Select Settings Tab
And I Enable Allow Over Tip Out Toggle 
And I Select Payroll Week Start Day as Monday
And I Select Default Payroll Process as Daily
And I Enter Invalid Minimum Age Limit
Then Check Maximum age limit is 100 Error is Displayed
Then Check the Save buttonTwo is Disabled

Scenario: Save the Payroll Report Settings by Enabling Allow Over Tip Out & Payroll Start Day as Sunday and Default Payroll Process as Daily
And I Enable Allow Over Tip Out Toggle
And I Select Payroll Week Start Day as Sunday
And I Select Default Payroll Process as Daily
And I Enter Minimum Age Limit
And I Click the Save buttonTwo 
Then Verify whether Payroll Report Settings Saved or Not

Scenario: Verify Enabled Allow Over Tip Out Toggle & Payroll Start Day as Sunday and Default Payroll Process as Daily
And I Refresh the Page
Then Check Allow Over Tip Out Toggle is Enabled
Then Check Payroll Week Start Day selected as Sunday
Then Check Default Payroll Process selected as Daily
Then Check Minimum Age Limit is displayed as Expected

Scenario: Save the Payroll Report Settings by Disabling Allow Over Tip Out & Payroll Start Day as Monday and Default Payroll Process as Weekly
And I Disable Allow Over Tip Out Toggle
And I Select Payroll Week Start Day as Monday
And I Select Default Payroll Process as Weekly
And I Enter Minimum Age Limit
And I Click the Save buttonTwo 
Then Verify whether Payroll Report Settings Saved or Not

Scenario: Verify Disabled Allow Over Tip Out Toggle & Payroll Start Day as Monday and Default Payroll Process as Weekly
And I Refresh the Page
Then Check Allow Over Tip Out Toggle is Disabled
Then Check Payroll Week Start Day selected as Monday
Then Check Default Payroll Process selected as Weekly
Then Check Minimum Age Limit is displayed as Expected

Scenario: Save Payroll Report Default Payroll Process as Weekly
And I Select Default Payroll Process as Weekly
And I Click the Save buttonTwo 
Then Verify whether Payroll Report Settings Saved or Not

Scenario: Save Payroll Report Default Payroll Process as Daily/Weekly
And I Refresh the Page
Then Check Default Payroll Process selected as Weekly
And I Select Default Payroll Process as Daily/Weekly
And I Click the Save buttonTwo 
Then Verify whether Payroll Report Settings Saved or Not

Scenario: Save Payroll Report Default Payroll Process as Daily
And I Refresh the Page
Then Check Default Payroll Process selected as Daily/Weekly
And I Select Default Payroll Process as Daily
And I Click the Save buttonTwo 
Then Verify whether Payroll Report Settings Saved or Not
And I Refresh the Page
Then Check Default Payroll Process selected as Daily

Scenario: Verify the New Over Time Page header
Given I Click the New Overtime button
Then Verify the New Over Time Header

Scenario: Verify able to Create a New Overtime as Daily without Selecting Effective Date
And I Select Over Time Settings Tab
And I Click the New Overtime button
And I Select Overtime as Daily
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

#Scenario: Verify able to Create a New Overtime as Weekly without Selecting Effective Date
#And I Select Over Time Settings Tab
#And I Click the New Overtime button
#And I Select Overtime as Weekly
#And I Enter Over Time Hours
#And I Enter Over Time Percentage
#Then Check the Save button is Disabled
#And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily without Entering Over Time 1
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily without Entering Over Time 2
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily without Entering Over Time 3
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

#Scenario: Verify able to Create a New Overtime as Daily without Entering Over Time 1
#And I Select Over Time Settings Tab
#And I Click the New Overtime button
#Then Verify New Over Time Header
#And I Select Overtime as Daily
#And I Select Effective Date
#And I Enter Over Time2 Hours
#And I Enter Over Time2 Percentage
#And I Enter Over Time3 Hours
#And I Enter Over Time3 Percentage
#Then Check the Save button is Disabled
#And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily by Over Time 1 Hours as 0
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours as Zero
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily by Over Time 1 Percentage below 100
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage as below 100
Then Check Enter Valid Percentage should be more than 100 Error is Displayed
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily by Over Time 2 Hours as 0
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours as Zero
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily by Over Time 2 Percentage below 100
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage as below 100
Then Check Enter Valid Percentage should be more than 100 Error is Displayed
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily by Over Time 3 Hours as 0
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours as Zero
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily by Over Time 3 Percentage below 100
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage as below 100
Then Check Enter Valid Percentage should be more than 100 Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily with Same Overtime 2 Hours
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Duplicate Over Time2 Hours
Then Check Enter Valid Hours Error is Displayed
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily with Same Overtime 3 Hours
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Duplicate Over Time3 Hours
Then Check Enter Valid Hours Error is Displayed
And I Enter Over Time3 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily with Same Overtime 1 Hours
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
And I Enter Duplicate Over Time1 Hours
Then Check Enter Valid Hours Error is Displayed
And I Enter Over Time1 Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Weekly without Selecting Effective Date
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Weekly
And I Enter Over Time Hours
And I Enter Over Time Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Weekly with Hours as 0
And I Select Over Time Settings Tab
And I Click the New Overtime button
And I Select Overtime as Weekly
And I Select Effective Date
And I Enter Over Time Hours as Zero
And I Enter Over Time Percentage
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Weekly with Percentage below 100
And I Select Over Time Settings Tab
And I Click the New Overtime button
And I Select Overtime as Weekly
And I Select Effective Date
And I Enter Over Time Hours as Zero
And I Enter Over Time Percentage as below 100
Then Check Enter Valid Percentage should be more than 100 Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily
And I Select Over Time Settings Tab
And I Click the New Overtime button
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
And I Click the Save button
Then Verify whether OT Settings Saved or Not

Scenario: Verify able to Create a New Overtime as Weekly
And I Select Over Time Settings Tab
And I Click the New Overtime button
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time Hours
And I Enter Over Time Percentage
And I Click the Save button
Then Verify whether OT Settings Saved or Not

Scenario: Verify able to Create Duplicate Overtime as Daily
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
And I Click the Save button
Then Verify whether Duplicate OT Settings Saved or Not

Scenario: Verify able to Create Duplicate Overtime as Weekly
And I Select Over Time Settings Tab
And I Click the New Overtime button
#Then Verify New Over Time Header
And I Select Overtime as Daily
And I Select Effective Date
And I Enter Over Time Hours
And I Enter Over Time Percentage
And I Click the Save button
Then Verify whether Duplicate OT Settings Saved or Not

Scenario: Verify the Update Over Time Header
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
Then Verify the Update Over Time Header
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily without Entering Over Time 1
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#Then Verify Update Over Time Header
#And I Select Overtime as Daily
#And I Select Effective Date
And I Clear Over Time1 Hours
And I Clear Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily without Entering Over Time 2
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Clear Over Time2 Hours
And I Clear Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily without Entering Over Time 3
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Clear Over Time3 Hours
And I Clear Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

#Scenario: Verify able to Create a New Overtime as Daily without Entering Over Time 1
#And I Select Over Time Settings Tab
#And I Click the New Overtime button
#And I Select Overtime as Daily
#And I Select Effective Date
#And I Clear Over Time1 Hours
#And I Clear Over Time1 Percentage
#And I Enter Over Time2 Hours
#And I Enter Over Time2 Percentage
#And I Enter Over Time3 Hours
#And I Enter Over Time3 Percentage
#Then Check the Update button is Disabled
#And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily by Over Time 1 Hours as 0
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours as Zero
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily by Over Time 1 Percentage below 100
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage as below 100
Then Check Enter Valid Percentage should be more than 100 Error is Displayed
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily by Over Time 2 Hours as 0
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours as Zero
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily by Over Time 2 Percentage below 100
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage as below 100
Then Check Enter Valid Percentage should be more than 100 Error is Displayed
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily by Over Time 3 Hours as 0
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours as Zero
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily by Over Time 3 Percentage below 100
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage as below 100
Then Check Enter Valid Percentage should be more than 100 Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily with Same Overtime 2 Hours
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Duplicate Over Time2 Hours
Then Check Enter Valid Hours Error is Displayed
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Overtime as Daily with Same Overtime 3 Hours
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Duplicate Over Time3 Hours
Then Check Enter Valid Hours Error is Displayed
And I Enter Over Time3 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily with Same Overtime 1 Hours
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
#And I Select Overtime as Daily
#And I Select Effective Date
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
And I Enter Duplicate Over Time1 Hours
Then Check Enter Valid Hours Error is Displayed
And I Enter Over Time1 Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Weekly without Hours
And I Select Over Time Settings Tab
And I Edit the Weekly Overtime
#And I Select Overtime as Weekly
And I Clear Over Time Hours
And I Enter Over Time Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Weekly with Hours as 0
And I Select Over Time Settings Tab
And I Edit the Weekly Overtime
#And I Select Overtime as Weekly
And I Select Effective Date
And I Enter Over Time Hours as Zero
And I Enter Over Time Percentage
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Weekly with Percentage below 100
And I Select Over Time Settings Tab
And I Edit the Weekly Overtime
#And I Select Overtime as Weekly
And I Select Effective Date
And I Enter Over Time Hours as Zero
And I Enter Over Time Percentage as below 100
Then Check Enter Valid Percentage should be more than 100 Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Overtime as Daily
And I Select Over Time Settings Tab
And I Edit the Daily Overtime
And I Select Overtime as Daily
And I Change Effective Date
And I Enter Over Time1 Hours
And I Enter Over Time1 Percentage
And I Enter Over Time2 Hours
And I Enter Over Time2 Percentage
And I Enter Over Time3 Hours
And I Enter Over Time3 Percentage
And I Click the Update button
Then Verify whether OT Settings Updated or Not

Scenario: Verify able to Update Overtime as Weekly
And I Select Over Time Settings Tab
And I Edit the Weekly Overtime
And I Select Overtime as Daily
And I Change Effective Date
And I Enter Over Time Hours
And I Enter Over Time Percentage
And I Click the Update button
Then Verify whether OT Settings Updated or Not

#Scenario: Verify able to Update Overtime from Daily to Weekly
#And I Select Over Time Settings Tab
#And I Edit the Weekly Overtime
#And I Select Overtime as Daily
#And I Change Effective Date
#And I Enter Over Time Hours
#And I Enter Over Time Percentage
#And I Click the Update button
#Then Verify whether OT Settings Updated or Not

Scenario: Verify the New Break Page header
Given I Click the New Break button
When Verify the New Break Header

Scenario: Verify able to Create a New Break without Selecting Break Name
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Paid
And I Select Apply To as All Employees
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Break with Duration as 0
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Meal Break
And I Enter the Duration as Zero
Then Check Duration Minimum 1 mins and Maximum 100 mins Error is Displayed
And I Select Effective Date
And I Select Payroll Type as Paid
And I Select Apply To as All Employees
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Break with Duration above 100
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Rest Break
And I Enter the Duration above 100
Then Check Duration Minimum 1 mins and Maximum 100 mins Error is Displayed
And I Select Effective Date
And I Select Payroll Type as Paid
And I Select Apply To as All Employees
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Break without Selecting Roles
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Meal Break
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Paid
And I Select Apply To as Specific Roles
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Break without Selecting Employees
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Meal Break
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Paid
And I Select Apply To as Specific Employees
Then Check the Save button is Disabled
And I Click the Cancel button


Scenario: Verify able to Create a New Break for All Employees with Payroll Type as Paid
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Meal Break
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Paid
And I Select Apply To as All Employees
And I Click the Save button
Then Verify whether Break Settings Saved or Not

Scenario: Verify able to Create a New Break for Specific Roles with Payroll Type as Paid
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Rest Break
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Paid
And I Select Apply To as Specific Roles
And I Click the Save button
Then Verify whether Break Settings Saved or Not

Scenario: Verify able to Create a New Break for Specific Employees with Payroll Type as Paid
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Others
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Paid
And I Select Apply To as Specific Employees
And I Click the Save button
Then Verify whether Break Settings Saved or Not

Scenario: Verify able to Create a New Break for All Employees with Payroll Type as Unpaid
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Meal Break
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Unpaid
And I Select Apply To as All Employees
And I Click the Save button
Then Verify whether Break Settings Saved or Not

Scenario: Verify able to Create a New Break for Specific Roles with Payroll Type as Unpaid
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Rest Break
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Unpaid
And I Select Apply To as Specific Roles
And I Click the Save button
Then Verify whether Break Settings Saved or Not

Scenario: Verify able to Create a New Break for Specific Employees with Payroll Type as Unpaid
And I Select Manage Breaks Tab
And I Click the New Break button
#Then Verify the New Break Header
And I Select Break Name as Others
And I Enter the Duration
And I Select Effective Date
And I Select Payroll Type as Unpaid
And I Select Apply To as Specific Employees
And I Click the Save button
Then Verify whether Break Settings Saved or Not

Scenario: Verify whether Unable to Deleted the Break in Payroll Report Settings Clicking Cancel/No button
Given I Search the Break in Payroll Report Settings and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Break in Payroll Report Settings Deleted/Inactivated or Not

Scenario: Verify whether Able to Deleted the Break in Payroll Report Settings Clicking Delete/Yes button
Given I Search the Break in Payroll Report Settings and Click the Delete button
And I Click the Delete button
Then I Verifying the Break in Payroll Report Settings Deleted or Not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Break in Payroll Report Settings

