@Product/Items
@Departments
Feature: Product and Items - Departments
I am verify the Product/Items-Department module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Department page
Given Open the Department home page BaseURL and StoreID

Scenario: Verify whether the Department Header is Displayed
Given Verifying the Department Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Department Page header
Given Click the New Department button
When Verify the New Department Header

Scenario: Verify whether we able to create the New Department without Entering Name/Mandatory Fields
Given Click the New Department button
And I Click the Save button without Entering Department Name

Scenario: Verify whether we able to Save the Department with Single letter
Given Click the New Department button
And I Enter the Single letter in Department Name and Click the Save button

Scenario: Verify whether we can able to Save the Department only by Entering Department code
Given Click the New Department button
And I Enter the Only Department code and Click the Save button

 Scenario: Verify whether we can able to Save the Department only by Entering Department Description
 Given Click the New Department button
And I Enter the Only Description and Click the Save button

Scenario: Verify whether the user can able to Enter the Department Name above the limit
Given Click the New Department button
And I Enter the Department Name Exceeding the limit

Scenario: Verify whether user can able to create a New Department with Enabling Membership
Given Click the New Department button
When I Enter the New Department Name
And I Enter the Department Code
And I Enter the Department Description
And I Enable the Include Membership
And I Click the Save button
Then Verify whether the Department is Saved or not

Scenario: Verify the Update header by Editing Saved Department
Given I Search and Edit the Department
When Verify the Update Department Header

Scenario: Verify whether we can able to Cancel/Close the Department Update screen
Given I Search and Edit the Department
And I Click the Cancel button
Then I Verify Department Update screen Close or not

Scenario: Verify able to search the Department by entering 3 letters of Department Name
And I Verify Searching the Item when entering three letters

Scenario: Update Department without Entering Department name
Given I Search and Edit the Department
And I Clicking the Update button without entering Department Name

Scenario: Updating Department by Disabling Include Membership
Given I Search and Edit the Department
When Editing the Department with Department Name
And I validate the Include Membership Toggle is Enabled or not
And I Disable Include Membership
And I Click the Update button 
Then Verify the Department is Updated or not

Scenario: Verify whether Unable to Inactivate the Department Clicking Cancel/No button
Given I Search the Department and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Department Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Department Clicking Delete/Yes button
Given I Search the Department and Click the Delete button
And I Click the Delete button
Then I Verifying the Department Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Department

Scenario: Verify whether Unable to Activate the Department Clicking Cancel/No button
Given I Search the Department and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Department is Activated or not

Scenario: Verify whether Able to Activate the Department Clicking Delete/Yes button
Given I Search the Department and Click the Active button
And I Click the Activate button
Then I Verifying the Department Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Department

Scenario: Verify whether able to Delete the Department which is mapped with Category
Given Navigate to Catgeory page and Get the value and navigate to the Department page
Then I Search the Department mapped with Category and Click the Delete button
And I Click the Delete button
Then I Verifying the Category Mapped Department is Deleted or not

Scenario: Verify whether able to Delete the Department which is mapped with SubCategory
Given Navigate to SubCatgeory page and Get the value and navigate to the Department page
Then I Search the Department mapped with SubCategory and Click the Delete button
And I Click the Delete button
Then I Verifying the SubCategory Mapped Department is Deleted or not

Scenario: Verify whether able to Creating Duplicate Department
Given Click the New Department button
When I Enter the New Department Name
And I Enter the Department Code
And I Enter the Department Description
And I Click the Save button
Then Verify whether the Duplicate Department is Saved or not

Scenario: Verify whether the available Department is Displayed or not
Then Verify the Available Department is Displayed ot not

Scenario: Verify whether the Department Saved by Entering Special Characters
Given Click the New Department button
When I Enter the New Department Name with Special Characters
And I Click the Save button
Then Verify whether the Department with Special Characters is Saved or not

Scenario: Verify whether the Department Updating with Space in the end of Department name
Given I Search and Edit the Department
When I Enter the New Department Name with Space
And I Click the Update button 
Then Verify whether the Department Name with Space in end is Updated or not

#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
