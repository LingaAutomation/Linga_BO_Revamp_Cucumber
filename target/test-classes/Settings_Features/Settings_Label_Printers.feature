@Settings
@Label_Printers

Feature: Settings - Label Printers
I am verify the Settings-Label Printer module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Settings - Label Printer page
Given Open the Settings - Label Printer home page BaseURL and StoreID

Scenario: Verify whether the Label Printer Header is Displayed
Given Verifying the Label Printer Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Label Printer Page header
Given Click the New Label Printer button
When Verify the New Label Printer Header

Scenario: Verify whether the All Fields are available in Label Printers Settings
Then Check Name Field in Table is Displayed
Then Check IP Address Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed


#Scenario: Verify whether we able to Create the New Label Printer without Entering Name/Mandatory Fields
#Given Click the New Label Printer button
#And I Click the Save button without Entering Label Printer Name
#
#Scenario: Verify whether we able to Save the Label Printer with Single letter
#Given Click the New Label Printer button
#And I Enter the Single letter in Label Printer Name the Click the Save button

Scenario: Verify whether the user can able to Enter the Label Printer Name above the limit
Given Click the New Label Printer button
And I Enter the Label Printer Name Exceeding the limit
And I Click the Cancel button

Scenario: Verify we can able to Save Label Printer without Printer Model
Given Click the New Label Printer button
And I Select Printer Type as Kitchen Label
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Label Printer without Name
Given Click the New Label Printer button
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer IP Address
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Label Printer without IP Address
Given Click the New Label Printer button
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Label Printer with Invalid IP Address
Given Click the New Label Printer button
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer Invalid IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Label Printer Entering IP Address Alphabetics
Given Click the New Label Printer button
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer Invalid String IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Label Printer without selecting Allow Service Types
Given Click the New Label Printer button
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Enable Service Type Restriction Toggle
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Label Printer without selecting Alternate Printer
Given Click the New Label Printer button
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Alternate Printer Toggle
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify whether user can able to Create a New Label Printer
Given Click the New Label Printer button
#When Verify the New Label Printer Header
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Enable Service Type Restriction Toggle
And I Select Allow Service Types
And I Click the Save button
Then Verify whether Label Printer Saved or Not

Scenario: Verify whether user can able to Create a New Label Printer as Box Label
Given Click the New Label Printer button
#When Verify the New Label Printer Header
And I Select Printer Type as Box Label
And I Select Printer Model
And I Enter the Box Label Printer Name
And I Enter the Box Label Printer IP Address
And I Enable Enable Service Type Restriction Toggle
And I Select Allow Service Types
And I Click the Save button
Then Verify whether Label Printer Saved or Not

Scenario: Verify the Update header by Editing Saved Label Printer
Given I Search and Edit the Label Printer
When Verify the Update Label Printer Header

Scenario: Verify whether we can able to Cancel/Close the Label Printer Update screen
Given I Search and Edit the Label Printer
And I Click the Cancel button
Then I Verify Label Printer Update screen Close or Not


Scenario: Verify able to search the Label Printer by entering 3 letters of Label Printer Name
And I Verify Searching the Item when entering three letters


#Scenario: Verify we can able to Save Label Printer without Printer Model
#Given I Search and Edit the Label Printer
#And I Clear Printer Model
#And I Select Printer Type as Kitchen Label
#And I Enter the Label Printer Name
#And I Enter the Label Printer IP Address
#Then Check the Save button is Disabled
#And I Click the Cancel button

Scenario: Verify we can able to Update Label Printer without Name
Given I Search and Edit the Label Printer
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer IP Address
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Label Printer without IP Address
Given I Search and Edit the Label Printer
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Label Printer with Invalid IP Address
Given I Search and Edit the Label Printer
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer Invalid IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Label Printer Entering IP Address with Alphabetics
Given I Search and Edit the Label Printer
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer Invalid String IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Label Printer without selecting Allow Service Types
Given I Search and Edit the Label Printer
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Enable Service Type Restriction Toggle
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Label Printer without selecting Alternate Printer
Given I Search and Edit the Label Printer
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Alternate Printer Toggle
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Update Label Printer by Enabling Alternate Printer
Given I Search and Edit the Label Printer
Then Check Enable Service Type Restriction Toggle is Enabled
#And I Select Printer Type as Box Label
#And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Alternate Printer Toggle
And I Select Alternate Printer
And I Click the Update button
And Verify whether Label Printer Updated or Not

Scenario: Update Label Printer by Enabling Apply to All Categories Toggle
Given I Search and Edit the Label Printer
Then Check Alternate Printer Toggle is Enabled
And I Select Printer Type as Box Label
#And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Apply to All Categories Toggle
And I Enable Apply to All Menu Items Toggle
And I Select Alternate Printer
And I Click the Update button
And Verify whether Label Printer Updated or Not

Scenario: Update Label Printer by Disabling Alternate Printer
Given I Search and Edit the Label Printer
Then Check Apply to All Categories Toggle is Enabled
Then Check Apply to All Menu Items Toggle is Enabled
#And I Select Printer Type as Box Label
#And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Alternate Printer Toggle
And I Select Alternate Printer
And I Click the Update button
And Verify whether Label Printer Updated or Not

Scenario: Update Label Printer by Disabling Apply to All Categories Toggle
Given I Search and Edit the Label Printer
Then Check Alternate Printer Toggle is Disabled
And I Disable Apply to All Menu Items Toggle
And I Disable Apply to All Categories Toggle
And I Select Printer Type as Box Label
#And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Select Alternate Printer
And I Click the Update button
And Verify whether Label Printer Updated or Not

Scenario: Update Label Printer to Box Label
Given I Search and Edit the Label Printer
Then Check Printer Type as Kitchen Label is Selected
Then Check Apply to All Categories Toggle is Disabled
#Then Check Apply to All Menu Items Toggle is Enabled
And I Select Printer Type as Box Label
#And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Enable Service Type Restriction Toggle
And I Select Allow Service Types
And I Click the Update button
And Verify whether Label Printer Updated or Not

Scenario: Update Label Printer to Kitchen Label
Given I Search and Edit the Label Printer
Then Check Printer Type as Box Label is Selected
Then Check Enable Service Type Restriction Toggle is Enabled
And I Select Printer Type as Kitchen Label
#And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Enable Enable Service Type Restriction Toggle
And I Select Allow Service Types
And I Click the Update button
And Verify whether Label Printer Updated or Not
Given I Search and Edit the Label Printer
Then Check Printer Type as Kitchen Label is Selected
And I Click the Cancel button

Scenario: Verify whether Created Label Printer is Available/Displayed in Product/Items - Category Module
Given Open the Category home page BaseURL and StoreID
Given Verifying the Category Header Page
Given Click the New Category button
Then Check Created Label Printer is Availale in Category Module
And I Click the Backward button

Scenario: Verify whether Created Label Printer is Available/Displayed in Product/Items - SubCategory Module
Given Open the SubCategory home page BaseURL and StoreID
Given Verifying the SubCategory Header Page
Given Click the New SubCategory button
Then Check Created Label Printer is Availale in SubCategory Module
And I Click the Backward button
And Open the Settings - Label Printer home page BaseURL and StoreID

Scenario: Verify whether Unable to Deleted the Label Printer Clicking Cancel/No button
Given I Search the Label Printer and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Label Printer Deleted/Inactivated or Not

Scenario: Verify whether Able to Deleted the Label Printer Clicking Delete/Yes button
Given I Search the Label Printer and Click the Delete button
And I Click the Delete button
Then I Verifying the Label Printer Deleted or Not

Scenario: Verify whether able to Creating Duplicate Label Printer
Given Click the New Label Printer button
And I Select Printer Type as Kitchen Label
And I Select Printer Model
And I Enter the Label Printer Name
And I Enter the Label Printer IP Address
And I Click the Save button 
Then Verify whether the Duplicate Label Printer is Saved or Not

Scenario: Verify whether the available Label Printer is Displayed or Not
Then Verify the Available Label Printer is Displayed or Not

Scenario: Verify whether the Label Printer Saved by Entering Special Characters
Given Click the New Label Printer button
When I Enter the New Label Printer Name with Special Characters
And I Click the Save button 
#Then Verify whether the Label Printer with Special Characters is Saved or Not
And Verify whether Label Printer Saved or Not

Scenario: Verify whether the Label Printer Updating with Space in the end of Label Printer name
Given I Search and Edit the Label Printer
When I Enter the New Label Printer Name with Space
And I Click the Update button 
#Then Verify whether the Label Printer Name with Space in end is Updated or Not
And Verify whether Label Printer Updated or Not



#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
