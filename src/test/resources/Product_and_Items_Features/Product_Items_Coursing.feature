@Product/Items
@Coursing
@Product/Items01


Feature: Product and Items - Coursing
I am verify the Product/Items-Coursing module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Coursing page
Given Open the Coursing home page BaseURL and StoreID

Scenario: Verify whether the Coursing Header is Displayed
Given Verifying the Coursing Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Coursing Page header
Given Click the New Coursing button
When Verify the New Coursing Header

Scenario: Verify whether we able to create the New Coursing without Entering Name/Mandatory Fields
Given Click the New Coursing button
And I Click the Save button without Entering Coursing Name

Scenario: Verify whether we able to Save the Coursing with Single letter
Given Click the New Coursing button
And I Enter the Single letter in Coursing Name the Click the Save button

Scenario: Verify whether the user can able to Enter the Coursing Name above the limit
Given Click the New Coursing button
And I Enter the Coursing Name Exceeding the limit

Scenario: Verify whether we can able to Save the Coursing only by Entering Priority
Given Click the New Coursing button
When I Clear the Name
And I Enter the Priority
And I Click the Save button 
Then Verify whether the Coursing Saved only with Priority or not



Scenario: Save Coursing without Entering Priority
Given Click the New Coursing button
When I Enter the New Coursing Name
And I Clear the Priority
And I Clicking the Save button without entering Priority

Scenario: Verify whether user can able to create a New Coursing with Priority as 0
Given Click the New Coursing button
When I Enter the New Coursing Name
And I Enter the Priority as Zero
And I Click the Save button 
Then Verify whether the Coursing is Saved with Periority as Zero or not

Scenario: Verify whether user can able to create a New Coursing with Priority as with Decimal values
Given Click the New Coursing button
When I Enter the New Coursing Name
And I Enter the Priority as Decimal value
And I Click the Save button 
Then Verify whether the Coursing is Saved with Periority as Decimal or not

Scenario: Verify whether user can able to create a New Coursing with Mandatory Fields
Given Click the New Coursing button
When I Enter the New Coursing Name
And I Enter the Priority
And I Click the Save button 
Then Verify whether the Coursing is Saved or not


Scenario: Verify the Update header by Editing Saved Coursing
Given I Search and Edit the Coursing
When Verify the Update Coursing Header


Scenario: Verify whether we can able to Cancel/Close the Coursing Update screen
Given I Search and Edit the Coursing
And I Click the Cancel button
Then I Verify Coursing Update screen Close or not


Scenario: Verify able to search the Coursing by entering 3 letters of Coursing Name
And I Verify Searching the Item when entering three letters


Scenario: Update Coursing without Entering Coursing name
Given I Search and Edit the Coursing
And I Clicking the Update button without entering Coursing Name


Scenario: Update Coursing without Entering Priority
Given I Search and Edit the Coursing
When I Enter the New Coursing Name
And I Clear the Priority
And I Clicking the Update button without entering Priority

Scenario: Verify whether user can able to Update Coursing with Priority as Zero
Given I Search and Edit the Coursing
When I Enter the New Coursing Name
And I Enter the Priority as Zero
And I Click the Update button
Then Verify whether the Coursing is Updated with Periority as Zero or not

Scenario: Verify whether user can able to New Coursing with Priority as with Decimal values 
Given I Search and Edit the Coursing
When I Enter the New Coursing Name
And I Enter the Priority as Decimal value
And I Click the Update button
Then Verify whether the Coursing is Updated with Periority as Decimal or not

Scenario: Updating Coursing by Changing Priority
Given I Search and Edit the Coursing
When I Enter the New Coursing Name
And I Change the Priority
And I Click the Update button 
Then Verify the Coursing is Updated or not

Scenario: Verify whether Unable to Inactivate the Coursing Clicking Cancel/No button
Given I Search the Coursing and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Coursing Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Coursing Clicking Delete/Yes button
Given I Search the Coursing and Click the Delete button
And I Click the Delete button
Then I Verifying the Coursing Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Coursing

Scenario: Verify whether Unable to Activate the Coursing Clicking Cancel/No button
Given I Search the Coursing and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Coursing is Activated or not

Scenario: Verify whether Able to Activate the Coursing Clicking Delete/Yes button
Given I Search the Coursing and Click the Active button
And I Click the Activate button
Then I Verifying the Coursing Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Coursing

Scenario: Verify whether able to Delete the Coursing which is mapped with Category
Given Navigate to Catgeory page and Get the value and navigate to the Coursing page
Then I Search the Coursing mapped with Category and Click the Delete button
And I Click the Delete button
Then I Verifying the Category Mapped Coursing is Deleted or not

Scenario: Verify whether able to Delete the Coursing which is mapped with SubCategory
Given Navigate to SubCatgeory page and Get the value and navigate to the Coursing page
Then I Search the Coursing mapped with SubCategory and Click the Delete button
And I Click the Delete button
Then I Verifying the SubCategory Mapped Coursing is Deleted or not

Scenario: Verify whether able to Creating Duplicate Coursing
Given Click the New Coursing button
When I Enter the New Coursing Name
And I Enter the Priority
And I Click the Save button 
Then Verify whether the Duplicate Coursing is Saved or not

Scenario: Verify whether the available Coursing is Displayed or not
Then Verify the Available Coursing is Displayed ot not

Scenario: Verify whether the Coursing Saved by Entering Special Characters
Given Click the New Coursing button
When I Enter the New Coursing Name with Special Characters
And I Click the Save button 
Then Verify whether the Coursing with Special Characters is Saved or not

Scenario: Verify whether the Coursing Updating with Space in the end of Coursing name
Given I Search and Edit the Coursing
When I Enter the New Coursing Name with Space
And I Click the Update button 
Then Verify whether the Coursing Name with Space in end is Updated or not

#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
