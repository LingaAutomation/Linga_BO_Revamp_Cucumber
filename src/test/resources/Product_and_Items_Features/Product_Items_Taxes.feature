@Product/Items
@Taxes
@Product/Items01

Feature: Product and Items - Taxes
I am verify the Product/Items-Taxes module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Taxes page
Given Open the Taxes home page BaseURL and StoreID

Scenario: Verify whether the Taxes Header is Displayed
Given Verifying the Taxes Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Taxes Page header
Given Click the New Tax button
When Verify the New Taxes Header
And I Click the Backward button

Scenario: Verify whether we able to create the New Taxes without Entering Name/Mandatory Fields
Given Click the New Tax button
And I Click the Save and Publish button without Entering Taxes Name
And I Click the Backward button

Scenario: Verify whether we able to Save the Taxes with Single letter
Given Click the New Tax button
And I Enter the Single letter in Taxes Name then Click the Save and Publish button
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Taxes Name above the limit
Given Click the New Tax button
And I Enter the Taxes Name Exceeding the limit
And I Click the Backward button

Scenario: Verify whether when Entering Invalid Percentage
Given Click the New Tax button
And I Entering Invalid Percentage
And I Click the Backward button

Scenario: Verify whether we can able to Save the Item Tax with Amount
Given Click the New Tax button
When I Enter the Item Tax with Amount Name
And I Enter the Tax Code
And I Select the Tax Type as Amount
And I Enter the Amount
And I Select Apply To as Item
And I Click the Save and Publish button
Then Verify whether the Item Tax with Amount is Saved or not 

Scenario: Save Item Tax with Percentage and Quantity Based without Entering Quantity
Given Click the New Tax button
When I Enter the Item Tax with Percentage Name
And I Enter the Tax Code
And I Select the Tax Type as Percentage
And I Enter the Percentage in Tax
And I Select Apply To as Item
And I Enable the Quantity Based Toggle
And I Click the Save and Publish button
Then Verify whether the Item Tax with Percentage and Quantity Based without entering Quantity is Saved or not 

Scenario: Verify whether user can able to create a New Item Tax with Percentage
Given Click the New Tax button
When I Enter the Item Tax with Percentage Name
And I Enter the Tax Code
And I Select the Tax Type as Percentage
And I Enter the Percentage in Tax
And I Select Apply To as Item
And I Click the Save and Publish button
Then Verify whether the Item Tax with Percentage is Saved or not 

Scenario: Verify whether user can able to create a New Check Tax
Given Click the New Tax button
When I Enter the Check Tax Name
And I Enter the Tax Code
And I Select the Tax Type as Percentage
And I Enter the Percentage in Tax
And I Select Apply To as Check
And I Enter the Check Amount
And I Enable the Apply On Subtotal
And I Click the Save and Publish button
Then Verify whether the Check Tax is Saved or not 

Scenario: Verify whether user can able to create a New Tax On Item Tax
Given Click the New Tax button
When I Enter the Tax On Item Tax Name
And I Enter the Tax Code
And I Select the Tax Type as Percentage
And I Enter the Percentage in Tax
And I Select Apply To as Tax On Item Tax
And I Select Apply For Item Taxes
And I Click the Save and Publish button
Then Verify whether the Tax On Item Tax is Saved or not

Scenario: Verify whether user can able to create a New Tax On Check Tax
Given Click the New Tax button
When I Enter the Tax On Check Tax Name
And I Enter the Tax Code
And I Select the Tax Type as Percentage
And I Enter the Percentage in Tax
And I Select Apply To as Tax On Check Tax
And I Select Apply For Check Taxes
And I Click the Save and Publish button
Then Verify whether the Tax On Check Tax is Saved or not 

Scenario: Verify the Update header by Editing Saved Tax
Given I Search and Edit the Tax
When Verify the Update Taxes Header

Scenario: Verify whether we can able to Cancel/Close the Taxes Update screen
And I Click the Backward button
Then I Verify Taxes Update screen Close or not

Scenario: Verify able to search the Taxes by entering 3 letters of Taxes Name
And I Verify Searching the Item when entering three letters

Scenario: Update Taxes without Entering Taxes name
Given I Search and Edit the Tax
And I Clicking the Update button without entering Taxes Name

Scenario: Update the Item Tax with Percentage by Enabling Inclusive, Default Tax and Quantity BasedTax, Include In Daily Summary Report
Given I Search and Edit the Tax
And I can verify the Percentage value
And I Enable Include In Daily Summary Report
And I Enable Inclusive Tax
And I Enable Default Tax
And I Enable Quantity Based Tax
And I Click the Update and Publish button
Then Verify whether the Item Tax with Percentage after Enabled with Inclusive, Default, Quantity Based, Include In Daily Summary Report is Updated or not

Scenario: Verify the Inclusive, Default, Quantity Based Tax Toggles are Enabled or Not 
Given I Search and Edit the Tax
And I can verify the Enabled Inclusive Tax Toggle
And I can verify the Enabled Default Tax Toggle
And I can verify the Enabled Quantity Based Tax Toggle
And I Click the Backward button

Scenario: Update the Item Tax with Percentage by Disabling Inclusive, Default Tax and Quantity BasedTax, Include In Daily Summary Report
Given I Search and Edit the Tax
#And I can verify the Percentage value
And I Disable Include In Daily Summary Report
And I Disable Inclusive Tax
And I Disable Default Tax
And I Disable Quantity Based Tax
And I Click the Update and Publish button
Then Verify whether the Item Tax with Percentage after Disabled with Inclusive, Default, Quantity Based, Include In Daily Summary Report is Updated or not

Scenario: Verify the Inclusive, Default, Quantity Based Tax Toggles are Disabled or Not 
Given I Search and Edit the Tax
And I can verify the Disabled Inclusive Tax Toggle
And I can verify the Disabled Default Tax Toggle
And I can verify the Disabled Quantity Based Tax Toggle
And I Click the Backward button

Scenario: Update the Apply To for Tax from Item to Check
Given I Search and Edit the Tax
And I can verify Apply To is selected as Item Tax
And I Select Apply To as Check
And I Enter the Check Amount
And I Enable the Apply On Subtotal
And I Click the Update and Publish button
Then Verify whether the Apply To for Tax from Item to Check is Updated or not

Scenario: Update the Apply To for Tax from Check to Tax On Item Tax
Given I Search and Edit the Tax
And I can verify Apply To is selected as Check Tax
And I Select Apply To as Tax On Item Tax
And I Select Apply For Item Taxes
And I Click the Update and Publish button
Then Verify whether the Apply To for Tax from Check to Tax On Item Tax is Updated or not

Scenario: Update the Apply To for Tax from Tax On Item Tax to Tax On Check Tax
Given I Search and Edit the Tax
And I can verify Apply To is selected as Tax On Item Tax
And I Select Apply To as Tax On Check Tax
And I Select Apply For Check Taxes
And I Click the Update and Publish button
Then Verify whether the Apply To for Tax from Tax On Item Tax to Tax On Check Tax is Updated or not

Scenario: Update the Apply To for Tax from Tax On Check Tax to Item Tax
Given I Search and Edit the Tax
And I can verify Apply To is selected as Tax On Check Tax
And I Select Apply To as Item
And I Click the Update and Publish button
Then Verify whether the Apply To for Tax from Tax On Check Tax to Item Tax is Updated or not


Scenario: Update the Check Amount for Check Tax
Given I Search and Edit the Check Tax
And I Change the Check Amount
And I Disable the Apply On Subtotal
And I Click the Update and Publish button
Then Verify the Check Tax with Updated Check Amount is Updated or not

Scenario: Verify the Update the Check Amount after Reopen the Check Tax
Given I Search and Edit the Check Tax
Then I Validating the Check Amount after Reopen
And I Click the Backward button

Scenario: Verify whether Unable to Inactivate the Taxes Clicking Cancel/No button
Given I Search the Taxes and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Taxes Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Taxes Clicking Delete/Yes button
Given I Search the Taxes and Click the Delete button
And I Click the Delete button
Then I Verifying the Taxes Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Taxes

Scenario: Verify whether Unable to Activate the Taxes Clicking Cancel/No button
Given I Search the Taxes and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Taxes is Activated or not

Scenario: Verify whether Able to Activate the Taxes Clicking Delete/Yes button
Given I Search the Taxes and Click the Active button
And I Click the Activate button
Then I Verifying the Taxes Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Taxes

Scenario: Verify whether able to Delete the Tax which is mapped with Category/SubCatgeory/Menu Item
#Given Navigate to Catgeory page and Get the value and navigate to the Serving Size Level page
Then I Search the Tax mapped with Category and Click the Delete button
And I Click the Delete button
Then I Verifying the Tax Mapped Catgeory is Deleted or not

#Scenario: Verify whether able to Delete the Taxes which is mapped with SubCategory
#Given Navigate to SubCatgeory page and Get the value and navigate to the Taxes page
#Then I Search the Taxes mapped with SubCategory and Click the Delete button
#And I Click the Delete button
#Then I Verifying the SubCategory Mapped Taxes is Deleted or not

Scenario: Verify whether able to Creating Duplicate Taxes
Given Click the New Tax button
When I Enter the Item Tax with Amount Name
And I Enter the Tax Code
And I Select the Tax Type as Amount
And I Enter the Amount
And I Select Apply To as Item
And I Click the Save and Publish button
Then Verify whether the Duplicate Taxes is Saved or not

Scenario: Verify whether the available Taxes is Displayed or not
Then Verify the Available Taxes is Displayed ot not

Scenario: Verify whether the Taxes Saved by Entering Special Characters
Given Click the New Tax button
When I Enter the New Tax Name with Special Characters
And I Click the Save and Publish button
Then Verify whether the Taxes with Special Characters is Saved or not

Scenario: Verify whether the Taxes Updating with Space in the end of Taxes name
Given I Search and Edit the Tax
When I Enter the New Tax Name with Space
And I Click the Update and Publish button 
Then Verify whether the Taxes Name with Space in end is Updated or not

Scenario: Verify whether user can able to Save the Tax by Enabling Tax Per Service Type or not
And I Enable Tax Per Service Type
Given Click the New Tax button
When I Enter the Item Tax with Amount Name for Tax Per Service Type
And I Enter the Tax Code
And I Select the Tax Type as Amount
And I Enter the Amount
And I Select Apply To as Item
And I Enter the Percentage for All Service Type
And I Click the Save and Publish button
Then Verify whether the Tax by Enabled with Tax Per Service Type is Saved or not

Scenario: Update the Tax percentage for Service Types after Enabled with Tax Per Service Type
Given I Search and Edit the Tax Per Service Type
And I Change the Percentage for All Service Type
And I Click the Update and Publish button
Then Verify whether the Tax by Enabled with Tax Per Service Type is Updated or not

Scenario: Validating the Changed Taxes values for Service Types
Given I Search and Edit the Tax Per Service Type
And I Validate the Tax Percentage for All Service Type after Reopen
And I Click the Backward button
And I Disable the Tax Per Service Type


#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
