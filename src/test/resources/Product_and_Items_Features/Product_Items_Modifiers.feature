#@Product/Items
#@Modifiers
Feature: Product and Items - Modifiers
I am verify the Product/Items-Modifiers module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Modifiers page
Given Open the Modifiers home page BaseURL and StoreID

Scenario: Verify whether the Modifiers Header is Displayed
Given Verifying the Modifiers Header Page

Scenario: Verify Modifiers Home Path
Given Verifying the Modifiers page Homepath

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Modifiers Page header
Given Click the New Modifier button
When Verify the New Modifiers Header
And I Click the Backward button

Scenario: Verify whether we able to create the New Modifiers without Entering Name/Mandatory Fields
Given Click the New Modifier button
And I Click the Save and Publish button without Entering Modifiers Name
And I Click the Backward button

Scenario: Verify whether we able to Save the Modifiers with Single letter
Given Click the New Modifier button
And I Enter the Single letter in Modifiers Name then Click the Save and Publish button
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Modifiers Name above the limit
Given Click the New Modifier button
And I Enter the Modifiers Name Exceeding the limit
And I Click the Backward button

Scenario: Verify whether when Entering Invalid Percentage
Given Click the New Modifier button
And I Entering Invalid Percentage
And I Click the Backward button

Scenario: Verify whether we can able to Save the Item Modifier with Amount
Given Click the New Modifier button
When I Enter the Item Modifier with Amount Name
And I Enter the Modifier Code
And I Select the Modifier Type as Amount
And I Enter the Amount
And I Select Apply To as Item
And I Click the Save and Publish button
Then Verify whether the Item Modifier with Amount is Saved or not 

Scenario: Save Item Modifier with Percentage and Quantity Based without Entering Quantity
Given Click the New Modifier button
When I Enter the Item Modifier with Percentage Name
And I Enter the Modifier Code
And I Select the Modifier Type as Percentage
And I Enter the Percentage in Modifier
And I Select Apply To as Item
And I Enable the Quantity Based Toggle
And I Click the Save and Publish button
Then Verify whether the Item Modifier with Percentage and Quantity Based without entering Quantity is Saved or not 

Scenario: Verify whether user can able to create a New Item Modifier with Percentage
Given Click the New Modifier button
When I Enter the Item Modifier with Percentage Name
And I Enter the Modifier Code
And I Select the Modifier Type as Percentage
And I Enter the Percentage in Modifier
And I Select Apply To as Item
And I Click the Save and Publish button
Then Verify whether the Item Modifier with Percentage is Saved or not 

Scenario: Verify whether user can able to create a New Check Modifier
Given Click the New Modifier button
When I Enter the Check Modifier Name
And I Enter the Modifier Code
And I Select the Modifier Type as Percentage
And I Enter the Percentage in Modifier
And I Select Apply To as Check
And I Enter the Check Amount
And I Enable the Apply On Subtotal
And I Click the Save and Publish button
Then Verify whether the Check Modifier is Saved or not 

Scenario: Verify whether user can able to create a New Modifier On Item Modifier
Given Click the New Modifier button
When I Enter the Modifier On Item Modifier Name
And I Enter the Modifier Code
And I Select the Modifier Type as Percentage
And I Enter the Percentage in Modifier
And I Select Apply To as Modifier On Item Modifier
And I Select Apply For Item Modifiers
And I Click the Save and Publish button
Then Verify whether the Modifier On Item Modifier is Saved or not

Scenario: Verify whether user can able to create a New Modifier On Check Modifier
Given Click the New Modifier button
When I Enter the Modifier On Check Modifier Name
And I Enter the Modifier Code
And I Select the Modifier Type as Percentage
And I Enter the Percentage in Modifier
And I Select Apply To as Modifier On Check Modifier
And I Select Apply For Check Modifiers
And I Click the Save and Publish button
Then Verify whether the Modifier On Check Modifier is Saved or not 

Scenario: Verify the Update header by Editing Saved Modifier
Given I Search and Edit the Modifier
When Verify the Update Modifiers Header

Scenario: Verify whether we can able to Cancel/Close the Modifiers Update screen
And I Click the Backward button
Then I Verify Modifiers Update screen Close or not

Scenario: Verify able to search the Modifiers by entering 3 letters of Modifiers Name
And I Verify Searching the Item when entering three letters

Scenario: Update Modifiers without Entering Modifiers name
Given I Search and Edit the Modifier
And I Clicking the Update button without entering Modifiers Name

Scenario: Update the Item Modifier with Percentage by Enabling Inclusive, Default Modifier and Quantity BasedModifier, Include In Daily Summary Report
Given I Search and Edit the Modifier
And I can verify the Percentage value
And I Enable Include In Daily Summary Report
And I Enable Inclusive Modifier
And I Enable Default Modifier
And I Enable Quantity Based Modifier
And I Click the Update and Publish button
Then Verify whether the Item Modifier with Percentage after Enabled with Inclusive, Default, Quantity Based, Include In Daily Summary Report is Updated or not

Scenario: Verify the Inclusive, Default, Quantity Based Modifier Toggles are Enabled or Not 
Given I Search and Edit the Modifier
And I can verify the Enabled Inclusive Modifier Toggle
And I can verify the Enabled Default Modifier Toggle
And I can verify the Enabled Quantity Based Modifier Toggle
And I Click the Backward button

Scenario: Update the Item Modifier with Percentage by Disabling Inclusive, Default Modifier and Quantity BasedModifier, Include In Daily Summary Report
Given I Search and Edit the Modifier
#And I can verify the Percentage value
And I Disable Include In Daily Summary Report
And I Disable Inclusive Modifier
And I Disable Default Modifier
And I Disable Quantity Based Modifier
And I Click the Update and Publish button
Then Verify whether the Item Modifier with Percentage after Disabled with Inclusive, Default, Quantity Based, Include In Daily Summary Report is Updated or not

Scenario: Verify the Inclusive, Default, Quantity Based Modifier Toggles are Disabled or Not 
Given I Search and Edit the Modifier
And I can verify the Disabled Inclusive Modifier Toggle
And I can verify the Disabled Default Modifier Toggle
And I can verify the Disabled Quantity Based Modifier Toggle
And I Click the Backward button

Scenario: Update the Apply To for Modifier from Item to Check
Given I Search and Edit the Modifier
And I can verify Apply To is selected as Item Modifier
And I Select Apply To as Check
And I Enter the Check Amount
And I Enable the Apply On Subtotal
And I Click the Update and Publish button
Then Verify whether the Apply To for Modifier from Item to Check is Updated or not

Scenario: Update the Apply To for Modifier from Check to Modifier On Item Modifier
Given I Search and Edit the Modifier
And I can verify Apply To is selected as Check Modifier
And I Select Apply To as Modifier On Item Modifier
And I Select Apply For Item Modifiers
And I Click the Update and Publish button
Then Verify whether the Apply To for Modifier from Check to Modifier On Item Modifier is Updated or not

Scenario: Update the Apply To for Modifier from Modifier On Item Modifier to Modifier On Check Modifier
Given I Search and Edit the Modifier
And I can verify Apply To is selected as Modifier On Item Modifier
And I Select Apply To as Modifier On Check Modifier
And I Select Apply For Check Modifiers
And I Click the Update and Publish button
Then Verify whether the Apply To for Modifier from Modifier On Item Modifier to Modifier On Check Modifier is Updated or not

Scenario: Update the Apply To for Modifier from Modifier On Check Modifier to Item Modifier
Given I Search and Edit the Modifier
And I can verify Apply To is selected as Modifier On Check Modifier
And I Select Apply To as Item
And I Click the Update and Publish button
Then Verify whether the Apply To for Modifier from Modifier On Check Modifier to Item Modifier is Updated or not


Scenario: Update the Check Amount for Check Modifier
Given I Search and Edit the Check Modifier
And I Change the Check Amount
And I Disable the Apply On Subtotal
And I Click the Update and Publish button
Then Verify the Check Modifier with Updated Check Amount is Updated or not

Scenario: Verify the Update the Check Amount after Reopen the Check Modifier
Given I Search and Edit the Check Modifier
Then I Validating the Check Amount after Reopen
And I Click the Backward button

Scenario: Verify whether Unable to Inactivate the Modifiers Clicking Cancel/No button
Given I Search the Modifiers and Click the Delete button
And I Click the Cancel button
Then Verify the Cancelled Modifiers Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Modifiers Clicking Delete/Yes button
Given I Search the Modifiers and Click the Delete button
And I Click the Delete button
Then I Verifying the Modifiers Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Modifiers

Scenario: Verify whether Unable to Activate the Modifiers Clicking Cancel/No button
Given I Search the Modifiers and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Modifiers is Activated or not

Scenario: Verify whether Able to Activate the Modifiers Clicking Delete/Yes button
Given I Search the Modifiers and Click the Active button
And I Click the Activate button
Then I Verifying the Modifiers Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Modifiers

Scenario: Verify whether able to Delete the Modifier which is mapped with Category/SubCatgeory/Menu Item
#Given Navigate to Catgeory page and Get the value and navigate to the Serving Size Level page
Then I Search the Modifier mapped with Category and Click the Delete button
And I Click the Delete button
Then I Verifying the Modifier Mapped Catgeory is Deleted or not

#Scenario: Verify whether able to Delete the Modifiers which is mapped with SubCategory
#Given Navigate to SubCatgeory page and Get the value and navigate to the Modifiers page
#Then I Search the Modifiers mapped with SubCategory and Click the Delete button
#And I Click the Delete button
#Then I Verifying the SubCategory Mapped Modifiers is Deleted or not

Scenario: Verify whether able to Creating Duplicate Modifiers
Given Click the New Modifier button
When I Enter the Item Modifier with Amount Name
And I Enter the Modifier Code
And I Select the Modifier Type as Amount
And I Enter the Amount
And I Select Apply To as Item
And I Click the Save and Publish button
Then Verify whether the Duplicate Modifiers is Saved or not

Scenario: Verify whether the available Modifiers is Displayed or not
Then Verify the Available Modifiers is Displayed ot not

Scenario: Verify whether the Modifiers Saved by Entering Special Characters
Given Click the New Modifier button
When I Enter the New Modifier Name with Special Characters
And I Click the Save and Publish button
Then Verify whether the Modifiers with Special Characters is Saved or not

Scenario: Verify whether the Modifiers Updating with Space in the end of Modifiers name
Given I Search and Edit the Modifier
When I Enter the New Modifier Name with Space
And I Click the Update and Publish button 
Then Verify whether the Modifiers Name with Space in end is Updated or not


#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
