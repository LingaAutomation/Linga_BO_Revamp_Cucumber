@Settings
@WaitList
@Settings01

Feature: Settings - Wait List
I am verify the Settings-Wait List module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Settings - Wait List page
Given Open the Settings - Wait List home page BaseURL and StoreID

Scenario: Verify whether the Wait List Header is Displayed
Given Verifying the Wait List Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

#Scenario: Verify the Filter & Ascending and Descending Order 
#When User Select the Filter option with Columns
#And Verify the Ascending and Descending Order

Scenario: Verify the New Wait List Page header
Given Click the New Wait List button
When Verify the New Wait List Header
And I Click the Cancel button

Scenario: Verify whether the All Fields are available in Wait List Settings
And I Select Wait List Tab
Then Check Min Seat Field in Table is Displayed
Then Check Max Seat Field in Table is Displayed
Then Check Occupied Time Field in Table is Displayed
Then Check Actions Field in Table is Displayed
#Then Check Rows Per Page Filter Field is Displayed
And I Select Reasons Tab
Then Check Reasons Field in Table is Displayed
Then Check Actions Field in Table is Displayed
#Then Check Rows Per Page Filter Field is Displayed
And I Select Wait List Tab

Scenario: Verify we can able to Save Wait List without Min Seat
Given Click the New Wait List button
#And I Enter the Min Seats
And I Enter the Max Seats
And I Select the Hours
And I Select the Minutes
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Wait List without Max Seat
Given Click the New Wait List button
And I Enter the Min Seats
#And I Enter the Max Seats
And I Select the Hours
And I Select the Minutes
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Wait List without Hours
Given Click the New Wait List button
And I Enter the Min Seats
And I Enter the Max Seats
#And I Select the Hours
And I Select the Minutes
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Wait List without Minutes
Given Click the New Wait List button
And I Enter the Min Seats
And I Enter the Max Seats
And I Select the Hours
#And I Select the Minutes
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Wait List by Entering Min Seats as 0
Given Click the New Wait List button
And I Enter the Max Seats
And I Enter the Min Seats as 0
Then Check Enter more than Zero value Error is Displayed
And I Select the Hours
And I Select the Minutes
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Wait List by Entering Invalid Min Seats
Given Click the New Wait List button
And I Enter the Max Seats
And I Enter the Invalid Min Seats
And I Select the Hours
And I Select the Minutes
Then Check Min Seats should be less than Max Error is Displayed
Then Check Max Seats should be greater than Min Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Wait List by Entering Max Seats as 0
Given Click the New Wait List button
And I Enter the Min Seats
And I Enter the Max Seats as 0
Then Check Enter more than Zero value Error is Displayed
And I Select the Hours
And I Select the Minutes
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Wait List by Selecting Hours & Minutes as 0
Given Click the New Wait List button
And I Enter the Min Seats
And I Enter the Max Seats
And I Select the Hours as 00
And I Select the Minutes as 00
#Then Check the Save button is Disabled
And I Click the Save button
Then Check Wait List Saved without Time or Not
And I Click the Cancel button

Scenario: Verify whether user can able to Create a New Wait List 
Given Click the New Wait List button
And I Enter the Min Seats
And I Enter the Max Seats
And I Select the Hours
And I Select the Minutes
And I Click the Save button
Then Verify whether Wait List Saved or Not

Scenario: Verify whether able to Creating Wait List with Existing Seats
Given Click the New Wait List button
And I Enter the Min Seats
And I Enter the Max Seats
And I Select the Hours
And I Select the Minutes
And I Click the Save button 
Then Verify whether the Duplicate Wait List is Saved or Not

Scenario: Verify whether Unable to Deleted the Wait List Clicking Cancel/No button
Given I Search the Wait List and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Wait List Deleted/Inactivated or Not

Scenario: Verify whether Able to Deleted the Wait List Clicking Delete/Yes button
Given I Search the Wait List and Click the Delete button
And I Click the Delete button
Then I Verifying the Wait List Deleted or Not

Scenario: Verify the New Reasons Page header
And I Select Reasons Tab
Given Click the New Reason button
When Verify the New Reason Header

Scenario: Verify we can able to Save Reason without Entering Reason Name
And I Select Reasons Tab
Given Click the New Reason button
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify whether user can able to Create a New Reason
And I Select Reasons Tab
Given Click the New Reason button
And I Enter the Wait List Reason
And I Click the Save button
Then Verify whether Wait List Reason Saved or Not

Scenario: Verify whether able to Creating Duplicate Reason
And I Select Reasons Tab
Given Click the New Reason button
And I Enter the Wait List Reason
Then Check Name Already Exist Error is Displayed
#And I Click the Save button 
#Then Verify whether the Duplicate Wait List Reason is Saved or Not
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify whether Unable to Deleted the Reason Clicking Cancel/No button
And I Select Reasons Tab
Given I Search the Wait List Reason and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Reason Deleted/Inactivated or Not

Scenario: Verify whether Able to Deleted the Reason Clicking Delete/Yes button
And I Select Reasons Tab
Given I Search the Wait List Reason and Click the Delete button
And I Click the Delete button
Then I Verifying the Reason Deleted or Not


 
