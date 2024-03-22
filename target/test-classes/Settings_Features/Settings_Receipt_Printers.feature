@Settings
@Receipt_Printers

Feature: Settings - Receipt Printers
I am verify the Settings-Receipt Printer module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Settings - Receipt Printer page
Given Open the Settings - Receipt Printer home page BaseURL and StoreID

Scenario: Verify whether the Receipt Printer Header is Displayed
Given Verifying the Receipt Printer Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Receipt Printer Page header
Given Click the New Receipt Printer button
When Verify the New Receipt Printer Header

Scenario: Verify whether the All Fields are available in Receipt Printers Settings
And I Select Printers Tab
Then Check Name Field in Table is Displayed
Then Check IP Address Field in Table is Displayed
Then Check Default Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed
And I Select Settings Tab
Then Check Auto Print Receipt Toggle is Displayed
Then Check Show CC Receipt Screen Toggle is Displayed
Then Check Print CC Customer Copy Toggle is Displayed
Then Check Show Digital Receipt Screen Toggle is Displayed
And I Enable Show Digital Receipt Screen Toggle
Then Check Show Digital Receipt in CDS Toggle is Displayed
Then Check Show Signature Pad Toggle is Displayed
Then Check Print CC Merchant Copy Toggle is Displayed
Then Check Remove Tip Line Toggle is Displayed
Then Check Enable Itemized Receipt Toggle is Displayed
And I Select Printers Tab

#Scenario: Verify whether we able to Create the New Receipt Printer without Entering Name/Mandatory Fields
#Given Click the New Receipt Printer button
#And I Click the Save button without Entering Receipt Printer Name
#
#Scenario: Verify whether we able to Save the Receipt Printer with Single letter
#Given Click the New Receipt Printer button
#And I Enter the Single letter in Receipt Printer Name the Click the Save button

Scenario: Verify whether the user can able to Enter the Receipt Printer Name above the limit
Given Click the New Receipt Printer button
And I Enter the Receipt Printer Name Exceeding the limit
And I Click the Cancel button

Scenario: Verify we can able to Save Receipt Printer without Printer Model
Given Click the New Receipt Printer button
And I Enter the Receipt Printer Name
And I Enter the Receipt Printer IP Address
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Receipt Printer without Name
Given Click the New Receipt Printer button
And I Select Printer Model
And I Enter the Receipt Printer IP Address
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Receipt Printer without IP Address
Given Click the New Receipt Printer button
And I Select Printer Model
And I Enter the Receipt Printer Name
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Receipt Printer with Invalid IP Address
Given Click the New Receipt Printer button
And I Select Printer Model
And I Enter the Receipt Printer Name
And I Enter the Receipt Printer Invalid IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Receipt Printer Entering IP Address Alphabetics
Given Click the New Receipt Printer button
And I Select Printer Model
And I Enter the Receipt Printer Name
And I Enter the Receipt Printer Invalid String IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button


Scenario: Verify whether user can able to Create a New Receipt Printer 
Given Click the New Receipt Printer button
#When Verify the New Receipt Printer Header
And I Select Printer Model
And I Enter the Receipt Printer Name
And I Enter the Receipt Printer IP Address
And I Enable Set as Default Toggle
And I Click the Save button
Then Verify whether Receipt Printer Saved or Not


Scenario: Verify the Update header by Editing Saved Receipt Printer
Given I Search and Edit the Receipt Printer
When Verify the Update Receipt Printer Header


Scenario: Verify whether we can able to Cancel/Close the Receipt Printer Update screen
Given I Search and Edit the Receipt Printer
And I Click the Cancel button
Then I Verify Receipt Printer Update screen Close or Not


Scenario: Verify able to search the Receipt Printer by entering 3 letters of Receipt Printer Name
And I Verify Searching the Item when entering three letters


#Scenario: Verify we can able to Save Receipt Printer without Printer Model
#Given I Search and Edit the Receipt Printer
#And I Clear Printer Model
#And I Enter the Receipt Printer Name
#And I Enter the Receipt Printer IP Address
#Then Check the Save button is Disabled
#And I Click the Cancel button

Scenario: Verify we can able to Update Receipt Printer without Name
Given I Search and Edit the Receipt Printer
And I Select Printer Model
And I Enter the Receipt Printer IP Address
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Receipt Printer without IP Address
Given I Search and Edit the Receipt Printer
And I Select Printer Model
And I Enter the Receipt Printer Name
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Receipt Printer with Invalid IP Address
Given I Search and Edit the Receipt Printer
And I Select Printer Model
And I Enter the Receipt Printer Name
And I Enter the Receipt Printer Invalid IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Receipt Printer Entering IP Address with Alphabetics
Given I Search and Edit the Receipt Printer
And I Select Printer Model
And I Enter the Receipt Printer Name
And I Enter the Receipt Printer Invalid String IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

@EditKitcPrint
Scenario: Update Receipt Printer by Disabling Set as Default
Given I Search and Edit the Receipt Printer
Then Check Set as Default Toggle is Enabled
#And I Select Printer Model
And I Enter the Receipt Printer Name
And I Enter the Receipt Printer IP Address
And I Disable Set as Default Toggle
And I Click the Update button
And Verify whether Receipt Printer Updated or Not
Given I Search and Edit the Receipt Printer
Then Check Set as Default Toggle is Disabled


#@EditKitcPrint
#Scenario: Verify whether Created Receipt Printer is Available/Displayed in Product/Items - Category Module
#Given Open the Category home page BaseURL and StoreID
#Given Verifying the Category Header Page
#Given Click the New Category button
#Then Check Created Receipt Printer is Availale in Category Module
#And I Click the Backward button
#
#@EditKitcPrint
#Scenario: Verify whether Created Receipt Printer is Available/Displayed in Product/Items - SubCategory Module
#Given Open the SubCategory home page BaseURL and StoreID
#Given Verifying the SubCategory Header Page
#Given Click the New SubCategory button
#Then Check Created Receipt Printer is Availale in SubCategory Module
#And I Click the Backward button
#And Open the Settings - Receipt Printer home page BaseURL and StoreID

@EditKitcPrint
Scenario: Updating Receipt Printer Settings by Enabling All Toggle
And I Select Settings Tab
And I Enable Auto Print Receipt Toggle
And I Enable Show CC Receipt Screen Toggle
And I Enable Print CC Customer Copy Toggle
And I Enable Show Digital Receipt Screen Toggle
Then Check Show Digital Receipt in CDS Toggle is Displayed
And I Enable Show Digital Receipt in CDS Toggle
And I Enable Show Signature Pad Toggle
And I Enable Print CC Merchant Copy Toggle
And I Enable Remove Tip Line Toggle
And I Enable Enable Itemized Receipt Toggle
And I Click the Update button
And Verify whether Receipt Printer Updated or Not

@EditKitcPrint
Scenario: Verify whether All the Toggles are Enabled in Receipt Printer Settings
And I Select Printers Tab
And I Select Settings Tab
Then Check Auto Print Receipt Toggle is Enabled
Then Check Show CC Receipt Screen Toggle is Enabled
Then Check Print CC Customer Copy Toggle is Enabled
Then Check Show Digital Receipt Screen Toggle is Enabled
Then Check Show Digital Receipt in CDS Toggle is Enabled
Then Check Show Signature Pad Toggle is Enabled
Then Check Print CC Merchant Copy Toggle is Enabled
Then Check Remove Tip Line Toggle is Enabled
Then Check Enable Itemized Receipt Toggle is Enabled

@EditKitcPrint
Scenario: Updating Receipt Printer Settings by Disabling All Toggle
And I Select Settings Tab
And I Disable Auto Print Receipt Toggle
And I Disable Show CC Receipt Screen Toggle
And I Disable Print CC Customer Copy Toggle
And I Disable Show Digital Receipt in CDS Toggle
And I Disable Show Digital Receipt Screen Toggle
And I Disable Show Signature Pad Toggle
And I Disable Print CC Merchant Copy Toggle
And I Disable Remove Tip Line Toggle
And I Disable Enable Itemized Receipt Toggle
And I Click the Update button
And Verify whether Receipt Printer Updated or Not

@EditKitcPrint
Scenario: Verify whether All the Toggles are Disabled in Receipt Printer Settings
And I Select Printers Tab
And I Select Settings Tab
Then Check Auto Print Receipt Toggle is Disabled
Then Check Show CC Receipt Screen Toggle is Disabled
Then Check Print CC Customer Copy Toggle is Disabled
Then Check Show Digital Receipt Screen Toggle is Disabled
Then Check Show Signature Pad Toggle is Disabled
Then Check Print CC Merchant Copy Toggle is Disabled
Then Check Remove Tip Line Toggle is Disabled
Then Check Enable Itemized Receipt Toggle is Disabled
And I Select Printers Tab



Scenario: Verify whether able to Creating Duplicate Receipt Printer
Given Click the New Receipt Printer button
And I Select Printer Model
And I Enter the Receipt Printer Name
And I Enter the Receipt Printer IP Address
And I Click the Save button 
Then Verify whether the Duplicate Receipt Printer is Saved or Not

Scenario: Verify whether the available Receipt Printer is Displayed or Not
Then Verify the Available Receipt Printer is Displayed or Not

Scenario: Verify whether the Receipt Printer Saved by Entering Special Characters
Given Click the New Receipt Printer button
When I Enter the New Receipt Printer Name with Special Characters
And I Click the Save button 
#Then Verify whether the Receipt Printer with Special Characters is Saved or Not
And Verify whether Receipt Printer Saved or Not

Scenario: Verify whether the Receipt Printer Updating with Space in the end of Receipt Printer name
Given I Search and Edit the Receipt Printer
When I Enter the New Receipt Printer Name with Space
And I Click the Update button 
#Then Verify whether the Receipt Printer Name with Space in end is Updated or Not
And Verify whether Receipt Printer Updated or Not

Scenario: Verify whether Unable to Deleted the Receipt Printer Clicking Cancel/No button
And I Select Printers Tab
Given I Search the Receipt Printer and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Receipt Printer Deleted/Inactivated or Not

Scenario: Verify whether Able to Deleted the Receipt Printer Clicking Delete/Yes button
Given I Search the Receipt Printer and Click the Delete button
And I Click the Delete button
Then I Verifying the Receipt Printer Deleted or Not

#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
