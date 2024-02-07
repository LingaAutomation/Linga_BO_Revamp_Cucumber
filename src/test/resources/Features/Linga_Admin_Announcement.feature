@Linga_Admin
@Linga_Announcement


Feature: Admin - Announcement
  I am verify the Admin - Announcement module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Linga Admin - Announcement page
  Given Open the Linga Admin - Announcement home page BaseURL and StoreID

Scenario: Verify whether the Announcement Header is Displayed
  Given Verifying the Announcement Header Page

Scenario: Verify able to search the Announcement by Entering 3 letters of Announcement Name
  And I Verify Searching the Item when entering three letters

Scenario: Verify whether we can able to do Pagination
  Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
  When User Select the Filter option with Columns
  And Verify the Ascending and Descending Order

Scenario: Verify able to view the Announcement Content by Clicking on down arrow on the Announcement
  When I Click on the Arrow button in Announcement
  Then Verify able to View the Announcement Content

Scenario: Verify the New Announcement Page header
  Given I Click the New Announcement button
  When Verify the New Announcement Header

  Scenario: Verify whether able to Upload Image
    Given I Click the New Announcement button
    Then Upload an Image
    And I Click the Backward button

Scenario: Verify whether we able to create the New Announcement without Entering Name/Mandatory Fields
  And I Click the Save button without Entering Announcement Name

Scenario: Verify the the From Time and To Time fields are showing value by default
Given I Click the New Announcement button
  Then Check From Date Default Value
  Then Check To Date Default Value
  And I Click the Backward button

Scenario: Verify able to save the New Announcement without Entering From Date
  Given I Click the New Announcement button
  When I Enter the Announcement Name
  And I Select To Date
  And I Select To Time
  And I Enter Announcement Content
  Then Verify the Save button is Disabled
  And I Click the Backward button

Scenario: Verify able to save the New Announcement without Entering To Date
  Given I Click the New Announcement button
  When I Enter the Announcement Name
  And I Select From Date
  And I Select From Time
  And I Enter Announcement Content
  Then Verify the Save button is Disabled
  And I Click the Backward button

Scenario: Verify able to save the New Announcement without Entering Announcement Content
  Given I Click the New Announcement button
  When I Enter the Announcement Name
  And I Select From Date
  And I Select From Time
  And I Select To Date
  And I Select To Time
  Then Verify the Save button is Disabled
  And I Click the Backward button


Scenario: Verify able to save the New Announcement by Entering Announcement Content
  Given I Click the New Announcement button
  When I Enter the Announcement Name
  And I Select From Date
  And I Select From Time
  And I Select To Date
  And I Select To Time
  And I Enter Text in Announcement Content
  And I Click the Save button
  Then Verify the Announcement is Saved or not


Scenario: Verify able to save the New Announcement by Entering Numbers in the Announcement Name
  Given I Click the New Announcement button
  When I Enter the Numbers in Announcement Name
  And I Select From Date
  And I Select From Time
  And I Select To Date
  And I Select To Time
  And I Enter Announcement Content
  And I Click the Save button
  Then Verify the Announcement is Saved or not

Scenario: Verify able to save the New Announcement by Entering Special Characters in the Announcement Name
  Given I Click the New Announcement button
  When I Enter the Special Characters in Announcement Name
  And I Select From Date
  And I Select From Time
  And I Select To Date
  And I Select To Time
  And I Enter Announcement Content
  And I Click the Save button
  Then Verify the Announcement is Saved or not

Scenario: Verify able to save with the invalid From Date
  Given I Click the New Announcement button
  When I Enter the Announcement Name
  And I Select From Date
  And I Select From Time
  And I Select To Date
  And I Select To Time
  And I Enter Text in Announcement Content
  And I Select the Invalid From Date
  Then Verify the Save button is Disabled
  And I Click the Backward button

#Scenario: Verify able to save the New Announcement by Entering Single letter in the Announcement Name
#  Given I Click the New Announcement button
#  When I Enter the Single letter in Announcement Name
#  And I Select From Date
#  And I Select From Time
#  And I Select To Date
#  And I Select To Time
#  And I Enter Announcement Content
#  And I Click the Save button
#  Then Verify the Announcement is Saved or not

Scenario: Verify the Update Announcement header by Editing Saved Announcement
  Given I Search and Edit the Announcement
  When Verify the Update Announcement Header
  And I Click the Backward button

Scenario: Verify able to Update the Announcement by removing Announcement Name
  When I Search and Edit the Announcement
  And I Clear the Name
  And Verify the Update button is Disabled
  And I Click the Backward button

Scenario: Verify able to Update the Announcement by changing only From date
  When I Search and Edit the Announcement
  Then Check Previous From Date is Disabled
  And I Select From Date
  Then Verify the Update button is Disabled
  And I Click the Backward button

Scenario: Verify able to Update the Announcement by changing only To date
  When I Search and Edit the Announcement
  Then Check Previous To Date is Disabled
  And I Select To Date
  Then Verify the Update button is Disabled
  And I Click the Backward button

Scenario: Verify able to Update the Announcement by removing Announcement Content
  When I Search and Edit the Announcement
  When I Clear the text in Announcement Content
  Then Verify the Update button is Disabled
  And I Click the Backward button

Scenario: Verify able to Update the Announcement by Entering Space in the Announcement Content
  When I Search and Edit the Announcement
  Then I Enter space five times in the Announcement Content
  And Verify the Update button is Disabled
  And I Click the Backward button

Scenario:  Verify able to Update the Announcement by changing From date and To date
  When I Search and Edit the Announcement
  And I Change the From Date
  And I Change the To Date
  And I Click the Update button
  Then I Verify Announcement Updated or not

Scenario: Verify able to Update the Announcement by Changing the From Time and To Time
  When I Search and Edit the Announcement
  When I Change the From Time
  And I Change the To Time
  And I Click the Update button
  Then I Verify Announcement Updated or not

Scenario: Verify able to Update with the invalid From Date
  Given I Search and Edit the Announcement
  When I Enter the Announcement Name
  And I Select From Date
  And I Select To Date
  And I Enter Text in Announcement Content
  And I Select the Invalid From Date
  Then Verify the Save button is Disabled
  And I Click the Backward button

Scenario: Verify whether unable to Inactivate the Announcement Clicking Cancel/No button
  Given I Search the Announcement and Click the Delete button
  And I Click the Cancel button
  Then Verify the Cancelled Announcement Inactivated or not

Scenario: Verify whether Able to Inactivate the Announcement Clicking Delete/Yes button
  Given I Search the Announcement and Click the Delete button
  And I Click the Delete button
  Then I Verifying the Announcement Deleted or not
  And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Announcement

Scenario: Verify whether Unable to Activate the Announcement Clicking Cancel/No button
  Given I Search the Announcement and Click the Active button
  And I Click the Cancel button in Pop Up
  Then Verify the Cancelled Announcement is Activated or not

Scenario: Verify whether Able to Activate the Announcement Clicking Delete/Yes button
  Given I Search the Announcement and Click the Active button
  And I Click the Activate button
  Then I Verifying the Announcement Activated or not
  And I Click the Active button to navigate Activated screen to Verify Activated Announcement

Scenario: Verify whether able to Creating Duplicate Announcement
  Given I Click the New Announcement button
  And I Enter the Announcement Name
  And I Select From Date
  And I Select From Time
  And I Select To Date
  And I Select To Time
  And I Enter Announcement Content
  And I Click the Save button
  Then Verify whether the Duplicate Announcement is Saved or not

Scenario: Verify whether the Announcement Updating with Space in the end of Announcement name
  Given I Search and Edit the Announcement
  When I Enter the New Announcement Name with Space
  And I Click the Update button
  Then Verify whether the Announcement Name with Space in end is Updated or not


#31
