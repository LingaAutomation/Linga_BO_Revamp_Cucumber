@Linga_Admin
@Linga_Settings_Languages

Feature: Linga_Admin - Settings Languages
I am verify the Linga_Admin - Settings Languages module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Languages page
Given Open the Languages home page BaseURL and StoreID

Scenario: Verify whether the Languages Header is Displayed
Given Verifying the Languages Header Page

  
Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Languages Page header
Given I Click the New Language button
When Verify the New Language Header
#And I Click the Cancel button
#Then I Verify New Language screen Close or not

Scenario: Verify whether we able to create the Language without Entering Name/Mandatory Fields
Then Check the Save button is Disabled

#Scenario: Verify whether we able to Save the Language with Single letter
#And I Enter the Single letter in Language Name and Click the Save button
 
Scenario: Verify whether the user can able to Enter the Language Name above the limit
And I Enter the Language Name Exceeding the limit

Scenario: Verify whether we can able to Create a New Language
#Given I Click the New Language button
And I Enter the Language Name
And I Click the Save button
Then Verify whether the Language is Saved or Not

Scenario: Verify the Update header by Editing Saved Language
Given I Search and Edit the Linga Admin Language
When Verify the Update Language Header

Scenario: Verify whether we can able to Cancel/Close the Language Update screen
And I Click the Cancel button
Then I Verify Language Update screen Close or not

Scenario: Verify able to search the Languages by Entering 3 letters of Language Name
And I Verify Searching the Item when Entering three letters

Scenario: Update the Launguage without Language Name
Given I Search and Edit the Language
And I Clear the Name
Then Check the Update button is Disabled

Scenario: Verify whether the user can able to Enter the Language Name above the limit
#Given I Search and Edit the Language
And I Enter the Language Name Exceeding the limit

Scenario: Update the Existing Language
#Given I Search and Edit the Language
And I Enter the Language Name
And I Click the Update button
Then Verify whether the Language is Updated or Not

Scenario: Verify whether Unable to Inactivate the Language Clicking Cancel/No button
Given I Search the Language and Click the Delete button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Language Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Language Clicking Delete/Yes button
Given I Search the Language and Click the Delete button
And I Click the Delete button
Then I Verifying the Language Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Language

Scenario: Verify whether Unable to Activate the Language Clicking Cancel/No button
Given I Search the Language and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Language is Activated or not

Scenario: Verify whether Able to Activate the Language Clicking Delete/Yes button
Given I Search the Language and Click the Active button
And I Click the Activate button
Then I Verifying the Language Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Language

Scenario: Verify whether able to Create Language with Duplicate Name
Given I Click the New Language button
And I Enter the Language Name
And Click the Save button
Then Verify whether the Language with Duplicate Name is Saved or not

Scenario: Verify whether able to Update Language with Duplicate Name
Given I Search and Edit the Other Language
And I Enter the Language Name
And Click the Update button
Then Verify whether the Language with Duplicate Name is Updated or not

Scenario: Verify whether able to Create Language with Space
Given I Click the New Language button
And I Enter the Language Name with Space
Then Verify whether able to Save the Language with Space or not

Scenario: Verify whether able to Update Language with Space
Given I Search and Edit the Language
And I Enter the Language Name with Space
Then Verify whether able to Update the Language with Space or not

#Scenario: Verify whether the Language Saved by Entering Special Characters
#Given I Search and Edit the Language
#When I Enter the Language Name with Special Characters
#And Click the Update button
#Then Verify whether the Currency with Special Characters is Updated or not