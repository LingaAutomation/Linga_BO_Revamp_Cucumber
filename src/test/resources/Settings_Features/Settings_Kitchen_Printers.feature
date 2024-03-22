@Settings
@Kitchen_Printers

Feature: Settings - Kitchen Printers
I am verify the Settings-Kitchen Printer module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Settings - Kitchen Printer page
Given Open the Settings - Kitchen Printer home page BaseURL and StoreID

Scenario: Verify whether the Kitchen Printer Header is Displayed
Given Verifying the Kitchen Printer Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Kitchen Printer Page header
Given Click the New Kitchen Printer button
When Verify the New Kitchen Printer Header

Scenario: Verify whether the All Fields are available in Kitchen Printers Settings
And I Select Printers Tab
Then Check Name Field in Table is Displayed
Then Check IP Address Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed
And I Select Settings Tab
Then Check Seat Ordering Override Toggle is Displayed
Then Check Print Voided Items to the Kitchen Toggle is Displayed
Then Check Print Included Modifier In Kitchen Toggle is Displayed
And I Enable Print Included Modifier In Kitchen Toggle
Then Check Print Included Modifier For Alternate Modifier Toggle is Displayed
Then Check Serving Size in Front of Menu in KOT Toggle is Displayed
And I Select Printers Tab

#Scenario: Verify whether we able to Create the New Kitchen Printer without Entering Name/Mandatory Fields
#Given Click the New Kitchen Printer button
#And I Click the Save button without Entering Kitchen Printer Name
#
#Scenario: Verify whether we able to Save the Kitchen Printer with Single letter
#Given Click the New Kitchen Printer button
#And I Enter the Single letter in Kitchen Printer Name the Click the Save button

Scenario: Verify whether the user can able to Enter the Kitchen Printer Name above the limit
Given Click the New Kitchen Printer button
And I Enter the Kitchen Printer Name Exceeding the limit
And I Click the Cancel button

Scenario: Verify we can able to Save Kitchen Printer without Printer Model
Given Click the New Kitchen Printer button
And I Select Printer Type as Printer
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Kitchen Printer without Name
Given Click the New Kitchen Printer button
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer IP Address
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Kitchen Printer without IP Address
Given Click the New Kitchen Printer button
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Kitchen Printer with Invalid IP Address
Given Click the New Kitchen Printer button
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer Invalid IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Kitchen Printer Entering IP Address Alphabetics
Given Click the New Kitchen Printer button
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer Invalid String IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Kitchen Printer without selecting Allow Service Types
Given Click the New Kitchen Printer button
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Enable Service Type Restriction Toggle
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Kitchen Printer without selecting Alternate Printer
Given Click the New Kitchen Printer button
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Alternate Printer Toggle
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify whether user can able to Create a New Kitchen Printer 
Given Click the New Kitchen Printer button
#When Verify the New Kitchen Printer Header
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Enable Service Type Restriction Toggle
And I Select Allow Service Types
And I Click the Save button
Then Verify whether Kitchen Printer Saved or Not

@EditKitcPrint
Scenario: Verify whether user can able to Create a New Kitchen Printer as KDS
Given Click the New Kitchen Printer button
#When Verify the New Kitchen Printer Header
And I Select Printer Type as KDS
And I Select Printer Model
And I Enter the KDS Kitchen Printer Name
And I Enter the KDS Kitchen Printer IP Address
And I Enable Enable Service Type Restriction Toggle
And I Select Allow Service Types
And I Click the Save button
Then Verify whether Kitchen Printer Saved or Not

@EditKitcPrint
Scenario: Verify whether user can able to Create a New Kitchen Printer as Driver
Given Click the New Kitchen Printer button
And I Select Printer Type as Driver
And I Select Printer Model
And I Enter the Driver Kitchen Printer Name
And I Enter the Driver Kitchen Printer IP Address 
Then Check Enable Service Type Restriction Toggle is Grayed Out
And I Select Allow Service Types
And I Click the Save button
Then Verify whether Kitchen Printer Saved or Not


Scenario: Verify the Update header by Editing Saved Kitchen Printer
Given I Search and Edit the Kitchen Printer
When Verify the Update Kitchen Printer Header


Scenario: Verify whether we can able to Cancel/Close the Kitchen Printer Update screen
Given I Search and Edit the Kitchen Printer
And I Click the Cancel button
Then I Verify Kitchen Printer Update screen Close or Not


Scenario: Verify able to search the Kitchen Printer by entering 3 letters of Kitchen Printer Name
And I Verify Searching the Item when entering three letters


#Scenario: Verify we can able to Save Kitchen Printer without Printer Model
#Given I Search and Edit the Kitchen Printer
#And I Clear Printer Model
#And I Select Printer Type as Printer
#And I Enter the Kitchen Printer Name
#And I Enter the Kitchen Printer IP Address
#Then Check the Save button is Disabled
#And I Click the Cancel button

Scenario: Verify we can able to Update Kitchen Printer without Name
Given I Search and Edit the Kitchen Printer
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer IP Address
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Kitchen Printer without IP Address
Given I Search and Edit the Kitchen Printer
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Kitchen Printer with Invalid IP Address
Given I Search and Edit the Kitchen Printer
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer Invalid IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Kitchen Printer Entering IP Address with Alphabetics
Given I Search and Edit the Kitchen Printer
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer Invalid String IP Address
Then Check Enter Valid IP Address Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Kitchen Printer without selecting Allow Service Types
Given I Search and Edit the Kitchen Printer
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Enable Service Type Restriction Toggle
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Kitchen Printer without selecting Alternate Printer
Given I Search and Edit the Kitchen Printer
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Alternate Printer Toggle
Then Check the Update button is Disabled
And I Click the Cancel button

@EditKitcPrint
Scenario: Update Kitchen Printer by Enabling Alternate Printer
Given I Search and Edit the Kitchen Printer
Then Check Enable Service Type Restriction Toggle is Enabled
#And I Select Printer Type as KDS
#And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Alternate Printer Toggle
And I Select Alternate Printer
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not

@EditKitcPrint
Scenario: Update Kitchen Printer by Enabling Apply to All Categories Toggle
Given I Search and Edit the Kitchen Printer
Then Check Alternate Printer Toggle is Enabled
And I Select Printer Type as KDS
#And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Apply to All Categories Toggle
And I Enable Apply to All Menu Items Toggle
And I Select Alternate Printer
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not

@EditKitcPrint
Scenario: Update Kitchen Printer by Disabling Alternate Printer
Given I Search and Edit the Kitchen Printer
Then Check Apply to All Categories Toggle is Enabled
Then Check Apply to All Menu Items Toggle is Enabled
#And I Select Printer Type as KDS
#And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Alternate Printer Toggle
And I Select Alternate Printer
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not

@EditKitcPrint
Scenario: Update Kitchen Printer by Disabling Apply to All Categories Toggle
Given I Search and Edit the Kitchen Printer
Then Check Alternate Printer Toggle is Disabled
And I Disable Apply to All Menu Items Toggle
And I Disable Apply to All Categories Toggle
And I Select Printer Type as KDS
#And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Select Alternate Printer
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not

@EditKitcPrint
Scenario: Update Kitchen Printer to KDS
Given I Search and Edit the Kitchen Printer
Then Check Printer Type as Printer is Selected
Then Check Apply to All Categories Toggle is Disabled
#Then Check Apply to All Menu Items Toggle is Enabled
And I Select Printer Type as KDS
#And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Expo Device Toggle
And I Enter Expo Printer IP Address
And I Enter Queue Device IP Address
And I Enable Enable Service Type Restriction Toggle
And I Select Allow Service Types
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not

@EditKitcPrint
Scenario: Update Kitchen Printer to Driver
Given I Search and Edit the Kitchen Printer
Then Check Printer Type as KDS is Selected
Then Check Expo Device Toggle is Enabled
Then Check Enable Service Type Restriction Toggle is Enabled
And I Select Printer Type as KDS
#And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
Then Check Enable Service Type Restriction Toggle is Grayed Out
#And I Select Allow Service Types
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not

#@EditKitcPrint
Scenario: Update Kitchen Printer to Printer
Given I Search and Edit the Kitchen Printer
Then Check Printer Type as Driver is Selected
Then Check Expo Device Toggle is Enabled
Then Check Enable Service Type Restriction Toggle is Enabled
And I Select Printer Type as KDS
#And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Enable Enable Service Type Restriction Toggle
And I Select Allow Service Types
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not
Given I Search and Edit the Kitchen Printer
Then Check Printer Type as Driver is Selected
And I Click the Cancel button

@EditKitcPrint
Scenario: Verify whether Created Kitchen Printer is Available/Displayed in Product/Items - Category Module
Given Open the Category home page BaseURL and StoreID
Given Verifying the Category Header Page
Given Click the New Category button
Then Check Created Kitchen Printer is Availale in Category Module
And I Click the Backward button

@EditKitcPrint
Scenario: Verify whether Created Kitchen Printer is Available/Displayed in Product/Items - SubCategory Module
Given Open the SubCategory home page BaseURL and StoreID
Given Verifying the SubCategory Header Page
Given Click the New SubCategory button
Then Check Created Kitchen Printer is Availale in SubCategory Module
And I Click the Backward button
And Open the Settings - Kitchen Printer home page BaseURL and StoreID

@EditKitcPrint
Scenario: Updating Kitchen Printer Settings by Enabling All Toggle
And I Select Settings Tab
And I Enable Seat Ordering Override Toggle
And I Enable Print Voided Items to the Kitchen Toggle
And I Enable Print Included Modifier In Kitchen Toggle
Then Check Print Included Modifier For Alternate Modifier Toggle is Displayed
And I Enable Print Included Modifier For Alternate Modifier Toggle
And I Enable Serving Size in Front of Menu in KOT Toggle
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not

@EditKitcPrint
Scenario: Verify whether All the Toggles are Enabled in Kitchen Printer Settings
And I Select Printers Tab
And I Select Settings Tab
Then Check Seat Ordering Override Toggle is Enabled
Then Check Print Voided Items to the Kitchen Toggle is Enabled
Then Check Print Included Modifier In Kitchen Toggle is Enabled
Then Check Print Included Modifier For Alternate Modifier Toggle is Enabled
Then Check Serving Size in Front of Menu in KOT Toggle is Enabled

@EditKitcPrint
Scenario: Updating Kitchen Printer Settings by Disabling All Toggle
And I Select Settings Tab
And I Disable Seat Ordering Override Toggle
And I Disable Print Voided Items to the Kitchen Toggle
And I Disable Print Included Modifier For Alternate Modifier Toggle
And I Disable Print Included Modifier In Kitchen Toggle
And I Disable Serving Size in Front of Menu in KOT Toggle
And I Click the Update button
And Verify whether Kitchen Printer Updated or Not

@EditKitcPrint
Scenario: Verify whether All the Toggles are Disabled in Kitchen Printer Settings
And I Select Printers Tab
And I Select Settings Tab
Then Check Seat Ordering Override Toggle is Disabled
Then Check Print Voided Items to the Kitchen Toggle is Disabled
Then Check Print Included Modifier In Kitchen Toggle is Disabled
Then Check Serving Size in Front of Menu in KOT Toggle is Disabled
And I Select Printers Tab

Scenario: Verify whether Unable to Deleted the Kitchen Printer Clicking Cancel/No button
And I Select Printers Tab
Given I Search the Kitchen Printer and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Kitchen Printer Deleted/Inactivated or Not

Scenario: Verify whether Able to Deleted the Kitchen Printer Clicking Delete/Yes button
Given I Search the Kitchen Printer and Click the Delete button
And I Click the Delete button
Then I Verifying the Kitchen Printer Deleted or Not

Scenario: Verify whether able to Creating Duplicate Kitchen Printer
Given Click the New Kitchen Printer button
And I Select Printer Type as Printer
And I Select Printer Model
And I Enter the Kitchen Printer Name
And I Enter the Kitchen Printer IP Address
And I Click the Save button 
Then Verify whether the Duplicate Kitchen Printer is Saved or Not

Scenario: Verify whether the available Kitchen Printer is Displayed or Not
Then Verify the Available Kitchen Printer is Displayed or Not

Scenario: Verify whether the Kitchen Printer Saved by Entering Special Characters
Given Click the New Kitchen Printer button
When I Enter the New Kitchen Printer Name with Special Characters
And I Click the Save button 
#Then Verify whether the Kitchen Printer with Special Characters is Saved or Not
And Verify whether Kitchen Printer Saved or Not

Scenario: Verify whether the Kitchen Printer Updating with Space in the end of Kitchen Printer name
Given I Search and Edit the Kitchen Printer
When I Enter the New Kitchen Printer Name with Space
And I Click the Update button 
#Then Verify whether the Kitchen Printer Name with Space in end is Updated or Not
And Verify whether Kitchen Printer Updated or Not



#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
