#@Product/Items
@Upcharges

Feature: Product and Items - Upcharges
I am verify the Product/Items-Upcharges module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When: I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Upcharges page
Given Open the Upcharges home page BaseURL and StoreID

Scenario: Verfiy whether the Upcharges Header is Displayed
Given Verifying the Upcharges Header page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Upcharge Page header
Given Click the New Upcharge button
When  Verify the New Upcharge header
And I Click the Backward button

Scenario: Verify whether we able to create the New Upcharge without entering Name Fields
Given Click the New Upcharge button
And I Click the Save and Publish button without entering the Upcharge name
And I Click the Backward button

Scenario: Verify whether we able to create the New Upcharge with Zero Amount
Given Click the New Upcharge button
And I Enter the Upcharge Name
And I Select the Upcharge Type as Amount
And I Enter Upcharge Amount
And I Enter Upcharge Amount as Zero
And I Select the Level Type as Category
And I Selecting the Categories
And I Click the Save and Publish button
Then Verify whether the Amount cannot be set as Zero error message displaying or not
And I Click the Backward button

Scenario:Verify whether applicaiton allows to add more than 17 numbers in amount field
Given Click the New Upcharge button
And I Enter the Upcharge Name 
And I Select the Upcharge Type as Amount
And I Enter Upcharge Amount as More than 17 characters
And I Click the Save and Publish button
Then Verify whether the Upcharge Amount should not be more than 17 characters error message
And I Click the Backward button

Scenario: Verfiy whether Include Additional Modifiers toggle is displaying when we select Upcharge Type as Percentage
Given Click the New Upcharge button
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
Then Check the Include Additional Modifier Toggle is Displayed
And I Click the Backward button

Scenario: Verify whether we able to select the Upcharge with Zero Percentage 
Given Click the New Upcharge button 
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Enter the Upcharge Percentage as Zero
And I Select the Level Type as Category
And I Selecting the Categories
And I Click the Save and Publish button
Then Verify whether the Upcharge is Saved with Percentage as Zero or not
And I Click the Backward button

Scenario: Verify whether we able to add more than 100 %
Given Click the New Upcharge button
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage above 100%
And I Select the Level Type as Category
And I Selecting the Categories
#And I Click the Save and Publish button
#Then Verify whether the Upcharge is Saved with Percentage as above 100% or not
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we able to Create the New Upcharge without Selecting the Category
Given Click the New Upcharge button
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Enable the Include Additional Modifiers Toggle
And I Select the Availability as Always
And I Select the Level Type as Category
And I Check the Please Select Categories Error is Displayed
Then Check the Save and Publish button is Disabled
Then I Search the Category and Check Searched Category is Displayed
And I Click the Backward button

Scenario: Verify whetherwe able to Create the New Upcarge wihtout Selecting the Sub-Category
Given Click the New Upcharge button
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Select the Availability as Days of Week
And I Select the Level Type as Sub-Category
And I Check the Please Select SubCategories Error is Displayed
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
Then I Search the Sub-Category and Check Searched Sub-Category is Displayed
And I Click the Backward button

Scenario: Verify whether we able to Create the New Upcharge without Selecting the Menu Item
Given Click the New Upcharge button
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Enable the Include Additional Modifiers Toggle
And I Select the Availability as Always
And I Select the Level Type as Menu Item
And I Check the Please Select Menu Items Error is Displayed
Then Check the Save and Publish button is Disabled
Then I Search the Menu Item and Check Searched Menu Item is Displayed
And I Click the Backward button


Scenario: Save the New Upcharge with Enable Include Additional Modifiers toggle
Given Click the New Upcharge button
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Enable the Include Additional Modifiers Toggle
And I Select the Level Type as Category
And I Selecting the Categories
And I Enable the Restrict POS Visibility Toggle
Then Check the Please select at least one role Error is Displayed
And I Select the Roles
And I Click the Save and Publish button
Then Verify whether the Upcharge is Saved or Not


Scenario: Verify the Update header by Editing Saved Upcharge
Given I Search and Edit the Upcharge
When Verify the Update Upcharge Header
And I Click the Backward button


Scenario: Verify whether we can able to Cancel/Close the Upcharge Update screen
Given I Search and Edit the Upcharge
And I Click the Backward button
Then I Verify Upcharge Update screen Close or not


Scenario: Verify Able to Update and Publish without Upcharge Name
Given I Search and Edit the Upcharge
When I Clear the Name
Then Check the Update and Publish button is Disabled
And I Click the Backward button


Scenario: Verify able to Update the Upcharge with Percentage as Zero
Given I Search and Edit the Upcharge
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Enter the Upcharge Percentage as Zero
And I Select the Level Type as Category
And I Selecting the Categories
And I Click the Save and Publish button
Then Verify whether the Upcharge is Saved with Percentage as Zero or not
And I Click the Backward button


Scenario: Verify able to Update the Upcharge with Percentage above 100%
Given I Search and Edit the Upcharge
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage above 100%
And I Select the Level Type as Category
And I Selecting the Categories
And I Click the Save and Publish button
Then Verify whether the Upcharge is Saved with Percentage as above 100% or not
And I Click the Backward button


Scenario: Verify able to Update the Upcharge without Selecting Categories
Given I Search and Edit the Upcharge
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Select the Availability as Always
And I Remove the Selected Categories
And I Select the Level Type as Category
And I Check the Please Select Categories Error is Displayed
Then Check the Update and Publish button is Disabled
Then I Search the Category and Check Searched Category is Displayed
And I Click the Backward button


Scenario: Verify able to Update the Upcharge without Selecting Sub-Categories
Given I Search and Edit the Upcharge
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Select the Availability as Days of Week
#And I Remove the Selected Sub-Categories
And I Select the Level Type as Sub-Category
And I Check the Please Select SubCategories Error is Displayed
And I Select the Availability as Always
Then Check the Update and Publish button is Disabled
Then I Search the Sub-Category and Check Searched Sub-Category is Displayed
And I Click the Backward button


Scenario: Verify able to Update the Upcharge without Selecting Menu Items
Given I Search and Edit the Upcharge
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Select the Availability as Always
#And I Remove the Selected Menu Items
And I Select the Level Type as Menu Item
And I Check the Please Select Menu Items Error is Displayed
Then Check the Update and Publish button is Disabled
Then I Search the Menu Item and Check Searched Menu Item is Displayed
And I Click the Backward button


Scenario: Update the Upcharge with Days of Week
Given I Search and Edit the Upcharge
Then Check the Include Additional Modifiers Toggle is Enabled
Then Check the Restrict POS Visibility Toggle is Enabled
Then I Verify the Selected Availability as Always
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Disable the Include Additional Modifiers Toggle
And I Disable the Restrict POS Visibility Toggle
And I Select the Availability as Days of Week
Then Check the Update and Publish button is Disabled
And I Selecting the Days
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Time Toggle
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Restriction Time
Then Check the Update and Publish button is Enabled
And I Enable the Available Time Toggle
And I Click the Add New Time button
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Available Time Same as Restriction Time
Then Verify the There is overlap in restriction & available time Error Mesasage
And I Select the Start Time in Available Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Available Time Same as Restriction Time
Then Verify the Start time should be less than end time Error Mesasage
And I Select the End Time in Available Time Below the Same as Restriction Time
Then Verify the There is overlap in restriction & available time Error Mesasage
And I Select the End Time in Available Time
And I Click the Update and Publish button
Then Verfiy whether Upcharge Updated or Not


Scenario: Update the Upcharge with Days of Month
Given I Search and Edit the Upcharge
Then Check the Include Additional Modifiers Toggle is Disabled
Then Check the Restrict POS Visibility Toggle is Disabled
Then I Verify the Selected Availability as Days of Week
And I Enter the Upcharge Name
And I Select the Availability as Days of Month
Then Check the Update and Publish button is Disabled
And I Selecting the Days Of Months
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Months Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Restriction Months
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Time Toggle
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Restriction Time
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verfiy whether Upcharge Updated or Not


Scenario: Update the Upcharge with Date Range
Given I Search and Edit the Upcharge
Then I Verify the Selected Availability as Days of Month
And I Enter the Upcharge Name
And I Select the Availability as Date Range
Then Check the Update and Publish button is Disabled
And I Select the Start Date
Then Check the Update and Publish button is Disabled
And I Select the End Date
Then Check the Update and Publish button is Enabled
And I Enable Restriction Days Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Restriction Days
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Time Toggle
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Restriction Time
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verfiy whether Upcharge Updated or Not


Scenario: Update the Upcharge with Specific Date
Given I Search and Edit the Upcharge
Then I Verify the Selected Availability as Date Range
And I Enter the Upcharge Name
And I Select the Availability as Specific Date
Then Check the Update and Publish button is Disabled
And I Select the Specific Date
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Time Toggle
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Restriction Time
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verfiy whether Upcharge Updated or Not


Scenario: Update the Upcharge with Date Range With Time
Given I Search and Edit the Upcharge
Then I Verify the Selected Availability as Specific Date
And I Enter the Upcharge Name
And I Select the Availability as Date Range with Time
Then Check the Update and Publish button is Disabled
And I Select the Start Date
Then Check the Update and Publish button is Disabled
And I Select the End Date
Then Check the Update and Publish button is Disabled
And I Enable the Restriction Time Toggle
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Restriction Time
Then Check the Update and Publish button is Enabled
And I Enable Restriction Days Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Restriction Days
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verfiy whether Upcharge Updated or Not


Scenario: Update the Upcharge with Always
Given I Search and Edit the Upcharge
Then I Verify the Selected Availability as Date Range with Time
And I Enter the Upcharge Name
And I Select the Availability as Always
And I Click the Update and Publish button
Then Verfiy whether Upcharge Updated or Not


Scenario: Verify Updated Upcharge Availability is Selected as Always
Given I Search and Edit the Upcharge
Then I Verify the Selected Availability as Always
And I Click the Backward button


Scenario: Verify whether able to Inactivate the Upcharge Clicking Cancel/No button
Given I Search the Upcharge and Click the Delete button
  And I Click the Cancel button in Pop Up
Then Verify the Cancelled Upcharge Deleted/Inactivated or not


Scenario: Verify whether Able to Inactivate the Upcharge Clicking Delete/Yes button
Given I Search the Upcharge and Click the Delete button
And I Click the Delete button
Then I Verifying the Upcharge Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Upcharge


Scenario: Verify whether able to Activate the Upcharge Clicking Cancel/No button
Given I Search the Upcharge and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Upcharge is Activated or not


Scenario: Verify whether Able to Activate the Upcharge Clicking Activate/Yes button
Given I Search the Upcharge and Click the Active button
And I Click the Activate button
Then I Verifying the Upcharge Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Upcharge


Scenario: Verify whether able to Creating Duplicate Upcharge
Given Click the New Upcharge button
And I Enter the Upcharge Name
And I Select the Upcharge Type as Percentage
And I Enter the Upcharge Percentage
And I Enable the Include Additional Modifiers Toggle
And I Select the Level Type as Category
And I Selecting the Categories
And I Click the Save and Publish button
Then Verify whether the Duplicate Upcharge is Saved or not


Scenario: Verify whether the Category Updating with Space in the end of Category name
Given I Search and Edit the Upcharge
And I Enter the Upcharge Name with Space
And I Click the Update and Publish button
Then Verify whether the Upcharge Name with Space in end is Updated or not





