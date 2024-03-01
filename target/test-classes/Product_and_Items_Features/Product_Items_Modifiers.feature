@Product/Items
@Modifiers
@Product/Items01

Feature: Product and Items - Modifiers
I am verify the Product/Items-Modifiers module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Product/Items - Modifiers page
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
And I Enter the Secondary Name
And I Enter the PLU Code
And I Enter the Maximum No of Times
And I Select the Modify With
And I Select the Taxes
And I Disable Show Modifier Toggle
And I Disable Show Menu Item In Modifier Print Toggle
And I Disable Show Modifier In Menu Print Toggle
And Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we able to Save the Modifiers with Single letter
Given Click the New Modifier button
And I Enter the Single letter in Modifiers Name
And I Enter the Maximum No of Times
And I Select the Taxes
And I Click the Save and Publish button
Then Verify whether the Modifier Saved or not
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Modifiers Name above the limit
Given Click the New Modifier button
And I Enter the Modifiers Name Exceeding the limit
And I Click the Backward button

Scenario: Verify whether we can able to Save with Maximum No of Times as 0
Given Click the New Modifier button
And I Enter the Modifier Name
And I Select the Taxes
And I Enter the Maximum No of Times as Zero
Then Check Enter valid Maximum Number of Times Error is Displayed
And I Click the Backward button

Scenario: Verify whether we can able to Save with Maximum No of Times above 100
Given Click the New Modifier button
And I Enter the Modifier Name
And I Select the Taxes
And I Enter the Invalid Maximum No of Times
Then Check Enter valid Maximum Number of Times Error is Displayed
And I Click the Backward button


Scenario: Verify able to Create a New Modifier
Given Click the New Modifier button
And I Enter the Modifier Name
And I Enter the Maximum No of Times
And I Select the Taxes
And I Enable Show Modifier Toggle
And I Enable Show Menu Item In Modifier Print Toggle
And I Enable Show Modifier In Menu Print Toggle
And I Select the Proceed to Inventory Mapping Tab
#And I Click the Save and Publish button
Then Check There is unsaved data and Do you want to continue without saving Info Message is Displayed
And I Click the Save and Proceed button
Then Verify whether the Modifier Saved or not
#Then Check Proceed to Inventory Mapping Tab is Selected
And I Select the Modifier Item Type for Inventory Modifier as Item
Then Check the Save and Publish button is Disabled
And I Disable Is Inventory Item Toggle
Then Check the Save and Publish button is Enabled
And I Click the Save and Publish button
Then Verify whether the Modifier Saved or not

#Then Check There is unsaved data and Do you want to continue without saving Info Message is Displayed
#And I Click the Save and Proceed button

Scenario: Verify the Update header by Editing Saved Modifier
Given I Search and Edit the Modifier
When Verify the Update Modifier Header
And I Click the Backward button

Scenario: Verify whether we can able to Cancel/Close the Modifier Update screen
Given I Search and Edit the Modifier
And I Click the Backward button
Then I Verify Modifier Update screen Close or not

Scenario: Verify able to search the Modifier by entering 3 letters of Coursing Name
And I Verify Searching the Item when entering three letters

Scenario: Update Modifier without Entering Modifier name
Given I Search and Edit the Modifier
And I Select the Basic Details Tab
And I Clear the Name
Then Check the Update and Publish button is Disabled
And I Click the Backward button

Scenario: Update Modifier with Maximum No of Times as 0
Given I Search and Edit the Modifier
And I Select the Basic Details Tab
And I Enter the Maximum No of Times as Zero
Then Check Enter valid Maximum Number of Times Error is Displayed
Then Check the Update and Publish button is Disabled
And I Click the Backward button

@ModiEdit
Scenario: Update Modifier with Maximum No of Times above 100
Given I Search and Edit the Modifier
And I Select the Basic Details Tab
And I Enter the Invalid Maximum No of Times
Then Check Enter valid Maximum Number of Times Error is Displayed
Then Check the Update and Publish button is Disabled
And I Click the Backward button

@ModiEdit
Scenario: Update Modifier with Prefix
Given I Search and Edit the Modifier
Then Check Show Modifier Toggle is Enabled
Then Check Show Menu Item In Modifier Print Toggle is Enabled
Then Check Show Modifier In Menu Print Toggle is Enabled
And I Select the Basic Details Tab
And I Enter the Modifier Name
And I Enter the Maximum No of Times
And I Disable Show Modifier Toggle
And I Disable Show Menu Item In Modifier Print Toggle
And I Disable Show Modifier In Menu Print Toggle
And I Select the Prefixes and Serving Size Levels Tab
And I Click the Add Prefix button
Then Check the Update and Publish button is Disabled
And I Enter the Prefixs with Override Modifier Price
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not
And I Select the Proceed to Inventory Mapping Tab
And I Select the Modifier Item Type for Inventory Modifier as Item
Then Check the Update and Publish button is Disabled
And I Select the Inventory Modifier Item Type Category
And I Select the Inventory Modifier Item Type Inventory Item
Then Check the Update and Publish button is Disabled
And I Select the Prefix Item Type for Inventory Modifier as Item
And I Select the Inventory Modifier Prefix Item Type Category
And I Select the Inventory Modifier Prefix Item Type Inventory Item
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not

@ModiEdit
Scenario: Update Modifier with Prefix Price as Decimal
Given I Search and Edit the Modifier
Then Check Show Modifier Toggle is Enabled
Then Check Show Menu Item In Modifier Print Toggle is Enabled
Then Check Show Modifier In Menu Print Toggle is Enabled
And I Select the Basic Details Tab
And I Enter the Modifier Name
And I Enter the Maximum No of Times
And I Disable Show Modifier Toggle
And I Disable Show Menu Item In Modifier Print Toggle
And I Disable Show Modifier In Menu Print Toggle
And I Select the Prefixes and Serving Size Levels Tab
#And I Click the Add Prefix button
Then Check the Update and Publish button is Disabled
#And I Enter the Prefixs with Override Modifier Price
And I Enter the Prefixs Price as Decimal
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not
And I Select the Proceed to Inventory Mapping Tab
And I Select the Modifier Item Type for Inventory Modifier as Item
Then Check the Update and Publish button is Disabled
And I Select the Inventory Modifier Item Type Category
And I Select the Inventory Modifier Item Type Inventory Item
Then Check the Update and Publish button is Disabled
And I Select the Prefix Item Type for Inventory Modifier as Item
And I Select the Inventory Modifier Prefix Item Type Category
And I Select the Inventory Modifier Prefix Item Type Inventory Item
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not

@ModiEdit
Scenario: Update Modifier with Serving Size Levels
Given I Search and Edit the Modifier
And I Select the Basic Details Tab
Then Check Show Modifier Toggle is Disabled
Then Check Show Menu Item In Modifier Print Toggle is Disabled
Then Check Show Modifier In Menu Print Toggle is Disabled
And I Select the Prefixes and Serving Size Levels Tab
Then Check the Updated Decimal Prefix Price
Then Check the Prefixs with Override Modifier Toggle is Enabled
And I Remove the Prefixs
And I Click the Add Serving Size Level
Then Check the Update and Publish button is Disabled
And I Select Serving Size - Prefix
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not
And I Select the Proceed to Inventory Mapping Tab
And Check the Inventory Modifier Prefix Item Type as Item is Not Displayed
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not

@ModiEdit
Scenario: Update Modifier with Prefixs and Serving Size Levels
Given I Search and Edit the Modifier
And I Select the Basic Details Tab
And I Enter the Modifier Name
And I Enter the Maximum No of Times
And I Select the Prefixes and Serving Size Levels Tab
And I Remove the Serving Size - Prefix
And I Click the Add Prefix button
And I Enter the Prefixs with Override Modifier Price
And I Click the Add Serving Size Level
And I Select Serving Size - Prefix
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not
And I Select the Proceed to Inventory Mapping Tab
And I Select the Modifier Item Type for Inventory Modifier as Item
And I Select the Inventory Modifier Item Type Category
And I Select the Inventory Modifier Item Type Inventory Item
And I Select the Prefix Item Type for Inventory Modifier as Item
And I Select the Inventory Modifier Prefix Item Type Category
And I Select the Inventory Modifier Prefix Item Type Inventory Item
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not

@ModiEdit
Scenario: Update Modifier with Inventory Modifier as Menu Item and Inventory Modifier Prefix as Sub Recipe
Given I Search and Edit the Modifier
And I Select the Proceed to Inventory Mapping Tab
Then Check There is unsaved data and Do you want to continue without saving Info Message is Displayed
And I Click the Save and Proceed button
Then Verify whether the Modifier Updated or not
And I Select the Modifier Item Type for Inventory Modifier as Menu Item
Then Check the Update and Publish button is Disabled
And I Select the Inventory Modifier Item Type Menu Item
Then Check the Update and Publish button is Enabled
And I Select the Prefix Item Type for Inventory Modifier as SubRecipe
Then Check the Update and Publish button is Disabled
And I Select the Inventory Modifier Prefix Item Type SubRecipe
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not

@ModiEdit
Scenario: Update Modifier with Inventory Modifier as Sub Recipe and Inventory Modifier Prefix as Item
Given I Search and Edit the Modifier
And I Select the Proceed to Inventory Mapping Tab
Then Check There is unsaved data and Do you want to continue without saving Info Message is Displayed
And I Click the Save and Proceed button
Then Verify whether the Modifier Updated or not
Then Check Inventory Modifier Item Type is Selected as Sub Recipe
Then Check Inventory Modifier Prefix Item Type is Selected as Item
And I Select the Modifier Item Type for Inventory Modifier as Item
And I Select the Inventory Modifier Item Type Category
And I Select the Inventory Modifier Item Type Inventory Item
And I Select the Prefix Item Type for Inventory Modifier as Item
And I Select the Inventory Modifier Prefix Item Type Category
And I Select the Inventory Modifier Prefix Item Type Inventory Item
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not

@ModiEdit
Scenario: Update Modifier with Inventory Modifier as Item and Inventory Modifier Prefix as Item
Given I Search and Edit the Modifier
And I Select the Proceed to Inventory Mapping Tab
Then Check There is unsaved data and Do you want to continue without saving Info Message is Displayed
And I Click the Save and Proceed button
Then Verify whether the Modifier Updated or not
Then Check Inventory Modifier Item Type is Selected as Menu Item
Then Check Inventory Modifier Prefix Item Type is Selected as SubRecipe
And I Select the Modifier Item Type for Inventory Modifier as SubRecipe
And I Select the Inventory Modifier Item Type SubRecipe
And I Select the Prefix Item Type for Inventory Modifier as Item
And I Select the Inventory Modifier Prefix Item Type Category
And I Select the Inventory Modifier Prefix Item Type Inventory Item
And I Click the Update and Publish button
Then Verify whether the Modifier Updated or not

@ModiEdit
Scenario: Verify whether Unable to Inactivate the Modifier Clicking Cancel/No button
Given I Search the Modifier and Click the Delete button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Modifier Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Modifier Clicking Delete/Yes button
Given I Search the Modifier and Click the Delete button
And I Click the Delete button
Then I Verifying the Modifier Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Modifier

Scenario: Verify whether Unable to Activate the Modifier Clicking Cancel/No button
Given I Search the Modifier and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Modifier is Activated or not

Scenario: Verify whether Able to Activate the Modifier Clicking Delete/Yes button
Given I Search the Modifier and Click the Active button
And I Click the Activate button
Then I Verifying the Modifier Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Modifier

Scenario: Verify whether able to Delete the Modifier which is mapped with Modifier Groups
#Given Navigate to Catgeory page and Get the value and navigate to the Serving Size Level page
Then I Search the Modifier mapped with Modifier Group and Click the Delete button
And I Click the Delete button
Then I Verifying the Modifier Mapped Modifier Group is Deleted or not

#Scenario: Verify whether able to Delete the Modifiers which is mapped with SubCategory
#Given Navigate to SubCatgeory page and Get the value and navigate to the Modifiers page
#Then I Search the Modifiers mapped with SubCategory and Click the Delete button
#And I Click the Delete button
#Then I Verifying the SubCategory Mapped Modifiers is Deleted or not

@ModiEdit
Scenario: Verify whether able to Creating Duplicate Modifiers
And I Enter the Modifier Name
And I Enter the Maximum No of Times
And I Select the Taxes
And I Enable Show Modifier Toggle
And I Enable Show Menu Item In Modifier Print Toggle
And I Enable Show Modifier In Menu Print Toggle
And I Select the Proceed to Inventory Mapping Tab
#And I Click the Save and Publish button
Then Check There is unsaved data and Do you want to continue without saving Info Message is Displayed
And I Click the Save and Proceed button
Then Verify whether the Modifier Saved or not
Then Check Proceed to Inventory Mapping Tab is Selected
#And I Select the Modifier Item Type for Inventory Modifier as Item
Then Check the Save and Publish button is Disabled
And I Disable Is Inventory Item Toggle
Then Check the Save and Publish button is Enabled
And I Click the Save and Publish button
Then Verify whether the Duplicate Modifier Saved or not

Scenario: Verify whether the available Modifier is Displayed or not
Then Verify the Available Modifier is Displayed ot not

Scenario: Verify whether the Modifiers Saved by Entering Special Characters
Given Click the New Modifier button
When I Enter the New Modifier Name with Special Characters
And I Click the Save and Publish button
Then Verify whether the Modifiers with Special Characters is Saved or not

@ModiEdit
Scenario: Verify whether the Modifiers Updating with Space in the end of Modifiers name
Given I Search and Edit the Modifier
When I Enter the New Modifier Name with Space
And I Click the Update and Publish button 
Then Verify whether the Modifiers Name with Space in end is Updated or not


#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
