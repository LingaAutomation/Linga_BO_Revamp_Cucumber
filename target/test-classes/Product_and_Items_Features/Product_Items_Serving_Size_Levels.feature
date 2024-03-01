@Product/Items
@Serving_Size_Levels
@Product/Items01

Feature: Product and Items - Serving Size Levels
I am verify the Product/Items-Serving Size Level module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Serving Size Level page
Given Open the Serving Size Level home page BaseURL and StoreID

Scenario: Verify whether the Serving Size Level Header is Displayed
Given Verifying the Serving Size Level Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Serving Size Level Page header
Given Click the New Serving Size Level button
When Verify the New Serving Size Level Header

Scenario: Verify whether we able to create the New Serving Size Level without Entering Name/Mandatory Fields
Given Click the New Serving Size Level button
And I Click the Save button without Entering Serving Size Level Name

Scenario: Verify whether we able to Save the Serving Size Level with Single letter
Given Click the New Serving Size Level button
And I Enter the Single letter in Serving Size Level Name and Click the Save button

Scenario: Verify whether we can able to Save the Serving Size Level only by Entering Serving Size Level Description
Given Click the New Serving Size Level button
And I Enter the Only Description and Click the Save button 

Scenario: Verify whether the user can able to Enter the Serving Size Level Name above the limit
Given Click the New Serving Size Level button
And I Enter the Serving Size Level Name Exceeding the limit

Scenario: Verify whether user can able to create a New Serving Size Level
Given Click the New Serving Size Level button
When I Enter the New Serving Size Level Name
And I Enter the Serving Size Level Description
And I Click the Save button 
Then Verify whether the Serving Size Level is Saved or not

Scenario: Verify the Update header by Editing Saved Serving Size Level
Given I Search and Edit the Serving Size Level
When Verify the Update Serving Size Level Header

Scenario: Verify whether we can able to Cancel/Close the Serving Size Level Update screen
Given I Search and Edit the Serving Size Level
And I Click the Cancel button
Then I Verify Serving Size Level Update screen Close or not

Scenario: Verify able to search the Serving Size Level by entering 3 letters of Serving Size Level Name
And I Verify Searching the Item when entering three letters

Scenario: Update Serving Size Level without Entering Serving Size Level name
Given I Search and Edit the Serving Size Level
And I Clicking the Update button without entering Serving Size Level Name

Scenario: Updating Serving Size Level
Given I Search and Edit the Serving Size Level
When I Enter the New Serving Size Level Name
And I Enter the Serving Size Level Description
And I Click the Update button 
Then Verify the Serving Size Level is Updated or not

Scenario: Verify whether Unable to Inactivate the Serving Size Level Clicking Cancel/No button
Given I Search the Serving Size Level and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Serving Size Level Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Serving Size Level Clicking Delete/Yes button
Given I Search the Serving Size Level and Click the Delete button
And I Click the Delete button
Then I Verifying the Serving Size Level Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Serving Size Level

Scenario: Verify whether Unable to Activate the Serving Size Level Clicking Cancel/No button
Given I Search the Serving Size Level and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Serving Size Level is Activated or not

Scenario: Verify whether Able to Activate the Serving Size Level Clicking Delete/Yes button
Given I Search the Serving Size Level and Click the Active button
And I Click the Activate button
Then I Verifying the Serving Size Level Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Serving Size Level

Scenario: Verify whether able to Delete the Serving Size Level which is mapped with Category/Menu Item
#Given Navigate to Catgeory page and Get the value and navigate to the Serving Size Level page
Then I Search the Serving Size Level mapped with Category and Click the Delete button
And I Click the Delete button
Then I Verifying the Category Mapped Serving Size Level is Deleted or not

Scenario: Verify whether able to Creating Duplicate Serving Size Level
Given Click the New Serving Size Level button
When I Enter the New Serving Size Level Name
And I Enter the Serving Size Level Description
And I Click the Save button 
Then Verify whether the Duplicate Serving Size Level is Saved or not

Scenario: Verify whether the available Serving Size Level is Displayed or not
Then Verify the Available Serving Size Level is Displayed ot not

Scenario: Verify whether the Serving Size Level Saved by Entering Special Characters
Given Click the New Serving Size Level button
When I Enter the New Serving Size Level Name with Special Characters
And I Click the Save button 
Then Verify whether the Serving Size Level with Special Characters is Saved or not

Scenario: Verify whether the Serving Size Level Updating with Space in the end of Serving Size Level name
Given I Search and Edit the Serving Size Level
When I Enter the New Serving Size Level Name with Space
And I Click the Update button 
Then Verify whether the Serving Size Level Name with Space in end is Updated or not

#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
