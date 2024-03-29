@Settings
@RevenueCenter

Feature: Settings - Revenue Center
I am verify the Settings-Revenue Center module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Settings - Revenue Center page
Given Open the Settings - Revenue Center home page BaseURL and StoreID

Scenario: Verify whether the Revenue Center Header is Displayed
Given Verifying the Revenue Center Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
#When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Revenue Center Page header
Given Click the New Revenue Center button
When Verify the New Revenue Center Header

Scenario: Verify whether the All Fields are available in Revenue Center Settings
Then Check Name Field in Table is Displayed
Then Check Nodes Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed


#Scenario: Verify whether we able to Create the New Revenue Center without Entering Name/Mandatory Fields
#Given Click the New Revenue Center button
#And I Click the Save button without Entering Revenue Center Name
#
#Scenario: Verify whether we able to Save the Revenue Center with Single letter
#Given Click the New Revenue Center button
#And I Enter the Single letter in Revenue Center Name the Click the Save button

Scenario: Verify whether the user can able to Enter the Revenue Center Name above the limit
Given Click the New Revenue Center button
And I Enter the Revenue Center Name Exceeding the limit
And I Click the Cancel button

Scenario: Verify we can able to Save Revenue Center without Name
Given Click the New Revenue Center button
And I Select Nodes
#Then Check the Save button is Disabled
And I Click the Save button
Then Check Please Enter Valid Revenue Center Name Error is Displayed
And I Click the Cancel button

Scenario: Verify we can able to Save Revenue Center without Nodes
Given Click the New Revenue Center button
And I Select Nodes
And I Enter the Revenue Center Name
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify whether user can able to Create a New Revenue Center 
Given Click the New Revenue Center button
#When Verify the New Revenue Center Header
And I Enter the Revenue Center Name
And I Select Nodes
And I Click the Save button
Then Verify whether Revenue Center Saved or Not

Scenario: Verify the Update header by Editing Saved Revenue Center
Given I Search and Edit the Revenue Center
When Verify the Update Revenue Center Header

Scenario: Verify whether we can able to Cancel/Close the Revenue Center Update screen
Given I Search and Edit the Revenue Center
And I Click the Cancel button
Then I Verify Revenue Center Update screen Close or Not

Scenario: Verify able to search the Revenue Center by entering 3 letters of Revenue Center Name
And I Verify Searching the Item when entering three letters



Scenario: Verify we can able to Update Revenue Center without Name
Given I Search and Edit the Revenue Center
And I Clear the Name
And I Select Nodes
#Then Check the Update button is Disabled
And I Click the Update button
Then Check Please Enter Valid Revenue Center Name Error is Displayed
And I Click the Cancel button

Scenario: Verify we can able to Update Revenue Center without Nodes
Given I Search and Edit the Revenue Center
And I Enter the Revenue Center Name
And I Remove Nodes
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Updating Revenue Center Settings
Given I Search and Edit the Revenue Center
And I Enter the Revenue Center Name
#And I Select Nodes
And I Click the Update button
And Verify whether Revenue Center Updated or Not

Scenario: Verify whether able to Creating Duplicate Revenue Center
Given Click the New Revenue Center button
And I Enter the Revenue Center Name
And I Select Nodes
And I Click the Save button 
Then Verify whether the Duplicate Revenue Center is Saved or Not

Scenario: Verify whether the available Revenue Center is Displayed or Not
Then Verify the Available Revenue Center is Displayed or Not

Scenario: Verify whether the Revenue Center Saved by Entering Special Characters
Given Click the New Revenue Center button
When I Enter the New Revenue Center Name with Special Characters
And I Click the Save button 
#Then Verify whether the Revenue Center with Special Characters is Saved or Not
And Verify whether Revenue Center Saved or Not

Scenario: Verify whether the Revenue Center Updating with Space in the end of Revenue Center name
Given I Search and Edit the Revenue Center
When I Enter the New Revenue Center Name with Space
And I Click the Update button 
#Then Verify whether the Revenue Center Name with Space in end is Updated or Not
And Verify whether Revenue Center Updated or Not

@EditRevenueCenter
Scenario: Verify Unable to Delete the Revenue Center Configured Nodes in Store License Page
And I Navigate to Setings - Store License Page
And I Search the Revenue Center Node and Click the Sign Out button
Then I Verifying the Revenue Center Configured Nodes is Deleted or not
#And Open the Settings - Revenue Center home page BaseURL and StoreID

#This Node is configured in 'Revenue Center'. could not unsync.
Scenario: Verify whether Unable to Deleted the Revenue Center Clicking Cancel/No button
Given I Search the Revenue Center and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Revenue Center Deleted/Inactivated or Not

Scenario: Verify whether Able to Deleted the Revenue Center Clicking Delete/Yes button
Given I Search the Revenue Center and Click the Delete button
And I Click the Delete button
Then I Verifying the Revenue Center Deleted or Not

#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
