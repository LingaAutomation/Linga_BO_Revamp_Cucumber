@Settings
@TipOutAndTipSharing

Feature: Settings - Tip Out and Tip Sharing
I am verify the Settings- Tip Out and Tip Sharing Module and Performing Some Operations on that

Background: Opening the Tip Out and Tip Sharing page
Given Open Tip Out and Tip Sharing home page BaseURL and StoreID

Scenario: Verify whether the Tip Out and Tip Sharing Header is Displayed
Given Verifying the Tip Out and Tip Sharing Header Page

Scenario: Verify Available Tabs in Tip Out and TipSharing
Then Verify Tip outs Tab is Displayed or Not
Then Verify Tip Sharing Tab is Displayed or Not

Scenario: Click on Tip Out Tab and Display Available Fields
Given Click on Tip Out Tab
Then Verify whether Tip out based on Percentage of Sales is Displayed or Not

Scenario: Disable Tip out based on Percentage of Sales Toggle and Verify
Given Disable Tip out based on Percentage of Sales Toggle
Then Verify Tip Share Per Hour Toggle is Displayed or Not
Then Verify New Tip Out button is Displayed or Not

Scenario: Enaable Tip out based on Percentage of Sales Toggle and Verify
Given Enable Tip out based on Percentage of Sales Toggle
Then Verify Tip Share Per Hour Toggle is Displayed or Not
Then Verify New Tip Out button is Displayed or Not

Scenario: Verify the Filter & Ascending and Descending Order
#When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify Available Fields in Tip Out and Tip Sharing Table
Then Verify TipOut Name Column is Displayed or Not
Then Verify Role From Column is Dispalyed or Not
Then Verify Role To Column is Displayed or Not
Then Verify Departments Column is Displayed or Not
Then Verfiy Prcentage Column is Displayed or Not

Scenario: Verify New TipOut Page Header
Given Click the New Tipout button
Then Verify the New Tipout Header
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Tip Out Name above the limit
Given Enable Tip out based on Percentage of Sales Toggle
Given Click the New Tipout button
Then I Enter the Tip Out Name Exceeding the limit
And I Click the Cancel button

Scenario: Verify able to Create New Tip Out Without Entering Name
Given Enable Tip out based on Percentage of Sales Toggle
Given Click the New Tipout button
Then Select Role From 
Then Select Role To
Then Select the Department form Dropdown
Then Enter the Percentage
Then Verify whether the Save button is Disabled
 And I Click the Cancel button

Scenario: Verify able to Create New Tip Out without Selecting Role From
Given Enable Tip out based on Percentage of Sales Toggle
Given Click the New Tipout button
And Enter Tip Out Name
Then Select Role To
Then Select the Department form Dropdown
Then Enter the Percentage
Then Verify whether the Save button is Disabled
 And I Click the Cancel button

Scenario: Verify able to Create New Tip Out without Selecting Role To
Given Enable Tip out based on Percentage of Sales Toggle
Given Click the New Tipout button
And Enter Tip Out Name
Then Select Role From 
Then Select the Department form Dropdown
Then Enter the Percentage
Then Verify whether the Save button is Disabled
 And I Click the Cancel button

Scenario: Verify able to Create New Tip Out without Selecting Department
Given Enable Tip out based on Percentage of Sales Toggle
Given Click the New Tipout button
And Enter Tip Out Name
Then Select Role From 
Then Select Role To
Then Enter the Percentage
Then Verify whether the Save button is Disabled
 And I Click the Cancel button

Scenario: Verify able to Create New Tip Out without Entering Percentage
Given Enable Tip out based on Percentage of Sales Toggle
Given Click the New Tipout button
And Enter Tip Out Name
Then Select Role From 
Then Select Role To
Then Select the Department form Dropdown
Then Verify whether the Save button is Disabled
 And I Click the Cancel button

Scenario: Verify able to Create New Tip Out with Mandatory Fields
Given Enable Tip out based on Percentage of Sales Toggle
Given Click the New Tipout button
And Enter Tip Out Name
Then Select Role From 
Then Select Role To
Then Select the Department form Dropdown
Then Enter the Percentage
And I Click the Save button 
Then Verify Tipout Saved or Not

Scenario: Verify Update header by Editing Saved Tip out
Given Enable Tip out based on Percentage of Sales Toggle
Given I Search and Edit the Tipout
Then Verify Update Tip Out Header

Scenario: Verify whether we can able to Cancel/Close the Tip Out Update screen
 And I Click the Cancel button
Then I Verify Tip Out Update screen Closed or Not

Scenario: Verify able to Update Tip out by Removing Tip Out Name
Given Enable Tip out based on Percentage of Sales Toggle
Given I Search and Edit the Tipout
And Clear Tip Out Name
Then Select Role From 
Then Select Role To
Then Select the Department form Dropdown
Then Enter the Percentage
Then Verify whether the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Tip out by Removing Tip Out Percentage
Given Enable Tip out based on Percentage of Sales Toggle
Given I Search and Edit the Tipout
And Clear Tip Out Name
And Enter Tip Out Name
Then Select Role From 
Then Select Role To
Then Clear the Percentage
Then Verify whether the Update button is Disabled
And I Click the Cancel button

Scenario: Update the Tip out
Given Enable Tip out based on Percentage of Sales Toggle
Given I Search and Edit the Tipout
And Clear Tip Out Name
And Enter Tip Out Name
Then Select Role From 
Then Select Role To
Then Enter the Percentage
And I Click the Update button
Then Verify Tip Out Updated or Not

Scenario: Verify whether able to Creating Duplicate Tip Out
Given Enable Tip out based on Percentage of Sales Toggle
Given Click the New Tipout button
And Enter Tip Out Name
Then Verify Name already exists must be unique error Message
Then Verify whether the Save button is Disabled
And I Click the Cancel button

Scenario: Verify whether unable to Inactivate the Tip Out Clicking Cancel/No button
Given Enable Tip out based on Percentage of Sales Toggle
Given I Search the Tip Out and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Tip Out Inactivated or Not

Scenario: Verify whether Able to Inactivate the Tip Out Clicking Delete/Yes button
#Given Enable Tip out based on Percentage of Sales Toggle
Given I Search the Tip Out and Click the Delete button
And I Click the Delete button
Then I Verifying the Tip Out Deleted or Not

@TEdit
Scenario: Navigate to Tip Sharing
Given Click on Tip Sharing Tab
@TEdit
Scenario: Verify Available Fields in Tip Sharing
Then Verify Manual Tip Sharing toggle is Displayed or Not
And Verify Automatic Tip Sharing Tab is Displayed or Not
And Verify Tip Charge Deduction Before Tip Share Toggle is Displayed or Not
Then Verify Online Pickup Tip Checkbox is Displayed or Not
Then Verify Declared Cash Tip Checkbox is Displayed or Not
Then Verify Gratuity Checkbox is Displayed or Not
Then Verify Driver Compensation Checkbox is Displayed or Not
@TEdit
Scenario: Enable the Manual Tip Sharing Toggle in Tip Sharing
Given Enable Manual Tip Sharing Toggle
#And I Click the Save button in TipOutAndTipShare
#Then Verify Please Select Roles Error Popup
Then Select the Roles from Dropdown
And I Click the Save button in TipOutAndTipShare
Then Verify Tip Sharing Saved or Not
@TEdit
Scenario: Enable the Automatic Tip Sharing Toggle in Tip Sharing
Given Click on Tip Sharing Tab
Given Enable Automatic Tip Sharing Toggle
Then Verify Manual Tip Sharing Toggle is Disabled
Then Select the Roles from Dropdown
And I Click the Save button in TipOutAndTipShare
Then Verify Tip Sharing Saved or Not
@TEdit
Scenario: Disable the Manual Tip Sharing Toggle in Tip Sharing
Given Click on Tip Sharing Tab
Given Disable Manual Tip Sharing Toggle
Then Verify Select Roles Dropdown Displayed or Not
And I Click the Save button in TipOutAndTipShare
Then Verify Tip Sharing Saved or Not
@TEdit
Scenario: Disable the Automatic Tip Sharing Toggle in Tip Sharing
Given Click on Tip Sharing Tab
Given Disable Automatic Tip Sharing Toggle
Then Verify Select Roles Dropdown Displayed or Not
And I Click the Save button in TipOutAndTipShare
Then Verify Tip Sharing Saved or Not
@TEdit
Scenario: Enable and Disable Tip Charge Deduction Before Tip Share toggle
Given Click on Tip Sharing Tab
Given Enable Tip Charge Deduction Before Tip Share Toggle
And Disable Tip Charge Deduction Before Tip Share Toggle
And I Click the Save button in TipOutAndTipShare
Then Verify Tip Sharing Saved or Not
@TEdit
Scenario: Uncheck the Available Checkboxes
Given Click on Tip Sharing Tab
Given Uncheck the Online Pickup Tip Checkbox
And Uncheck the Declared Cash Tip Checkbox
And Uncheck the Gratuity Checkbox
And Uncheck Driver Compensation Checkbox
And I Click the Save button in TipOutAndTipShare
Then Verify Tip Sharing Saved or Not
@TEdit
Scenario: Check the Available Checkboxes
Given Click on Tip Sharing Tab
Given Check the Online Pickup Tip Checkbox
And Check the Declared Cash Tip Checkbox
And Check the Gratuity Checkbox
And Check Driver Compensation Checkbox
And I Click the Save button in TipOutAndTipShare
Then Verify Tip Sharing Saved or Not





