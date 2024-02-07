#@Product/Items
@Item_Service_Charge
Feature: Product and Items - Item_Service_Charge
I am verify the Product/Items-Item_Service_Charge module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Item Service Charge page
Given Open the Item Service Charge home page BaseURL and StoreID

Scenario: Verify whether the Item Service Charge Header is Displayed
Given Verifying the Item Service Charge Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Item Service Charge Page header
Given Click the New Item Service Charge button
When Verify the New Item Service Charge Header
And I Click the Cancel button

Scenario: Verify whether we able to create the New Item Service Charge without Entering Name/Mandatory Fields
Given Click the New Item Service Charge button
And I Click the Save button without Entering Item Service Charge Name
And I Click the Cancel button

Scenario: Verify whether we able to Save the Item Service Charge with Single letter
Given Click the New Item Service Charge button
And I Enter the Single letter in Item Service Charge Name and Click the Save button
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Item Service Charge Name above the limit
Given Click the New Item Service Charge button
And I Enter the Item Service Charge Name Exceeding the limit
And I Click the Cancel button

Scenario: Verify whether we can able to Save the Item Service Charge only by Entering Item Service Charge Percentage
Given Click the New Item Service Charge button
And I Enter the Only Percentage and Click the Save button
And I Click the Cancel button

Scenario: Verify whether the Item Service Charge is allowing to enter percentage above the percentage limit
Given Click the New Item Service Charge button
When I Enter the New Item Service Charge Name
And I Enter the Max Percentage above the percentage limit
Then Verify whether the Item Service charge able to Saved with the Percentage above the limit or not
And I Click the Cancel button

Scenario: Verify whether user can able to create a New Item Service Charge
Given Click the New Item Service Charge button
When I Enter the New Item Service Charge Name
And I Enter the Item Service Charge Percentage
And I Select the Taxes in Item Service Charge
And I Click the Save button
Then Verify whether the Item Service Charge is Saved or not

Scenario: Verify the Update header by Editing Saved Item Service Charge
Given I Search and Edit the Item Service Charge
Then Verify the Update Item Service Charge Header

Scenario: Verify whether we can able to Cancel/Close the Item Service Charge Update screen
Given I Search and Edit the Item Service Charge
Then I Click the Cancel button
Then I Verify Item Service Charge Update screen Close or not

Scenario: Verify able to search the Item Service Charge by entering 3 letters of Item Service Charge Name
And I Verify Searching the Item when entering three letters

Scenario: Update Item Service Charge without Entering Item Service Charge name
Given I Search and Edit the Item Service Charge
And I Clicking the Update button without entering Item Service Charge Name
Then I Click the Cancel button


Scenario: Updating Item Service Charge
Given I Search and Edit the Item Service Charge
When I Enter the New Item Service Charge Name
And I Enter the Item Service Charge Percentage
And I Remove all the Selected Taxes
And I Click the Update button 
Then Verify the Item Service Charge is Updated or not


Scenario: Verify whether Unable to Inactivate the Item Service Charge Clicking Cancel/No button
Given I Search the Item Service Charge and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Item Service Charge Deleted/Inactivated or not


Scenario: Verify whether Able to Inactivate the Item Service Charge Clicking Delete/Yes button
Given I Search the Item Service Charge and Click the Delete button
And I Click the Delete button
Then I Verifying the Item Service Charge Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Item Service Charge

Scenario: Verify whether Unable to Activate the Item Service Charge Clicking Cancel/No button
Given I Search the Item Service Charge and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Item Service Charge is Activated or not

Scenario: Verify whether Able to Activate the Item Service Charge Clicking Delete/Yes button
Given I Search the Item Service Charge and Click the Active button
And I Click the Activate button
Then I Verifying the Item Service Charge Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Item Service Charge

#Scenario: Verify whether able to Delete the Item Service Charge which is mapped with Category/Menu Item
#Given Navigate to Catgeory page and Get the value and navigate to the Item Service Charge page
#Then I Search the Item Service Charge mapped with Category and Click the Delete button
#And I Click the Delete button
#Then I Verifying the Category Mapped Item Service Charge is Deleted or not


Scenario: Verify whether able to Creating Duplicate Item Service Charge
Given Click the New Item Service Charge button
When I Enter the New Item Service Charge Name
And I Enter the Item Service Charge Percentage
And I Click the Save button
Then Verify whether the Duplicate Item Service Charge is Saved or not

Scenario: Verify whether the available Item Service Charge is Displayed or not
Then Verify the Available Item Service Charge is Displayed ot not

Scenario: Verify whether the Item Service Charge Saved by Entering Special Characters
Given Click the New Item Service Charge button
When I Enter the New Item Service Charge Name with Special Characters
And I Click the Save button
Then Verify whether the Item Service Charge with Special Characters is Saved or not

Scenario: Verify whether the Item Service Charge Updating with Space in the end of Item Service Charge name
Given I Search and Edit the Item Service Charge
When I Enter the New Item Service Charge Name with Space
And I Click the Update button 
Then Verify whether the Item Service Charge Name with Space in end is Updated or not









