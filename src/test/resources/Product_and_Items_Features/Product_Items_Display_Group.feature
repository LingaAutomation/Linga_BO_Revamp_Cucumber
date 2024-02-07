@Product/Items
@Display_Group
Feature: Product and Items - Display_Group
I am verify the Product/Items-Display_Group module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Display Group page
Given Open the Display Group home page BaseURL and StoreID

Scenario: Verify whether the Display Group Header is Displayed
Given Verifying the Display Group Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Display Group Page header
Given Click the New Display Group button
When Verify the New Display Group Header
And I Click the Backward button

Scenario: Verify whether able to Upload Image
Given Click the New Display Group button
Then Upload an Image
And I Click the Backward button

Scenario: Verify whether we able to create the New Display Group without Entering Name/Mandatory Fields
Given Click the New Display Group button
And I Click the Save button without Entering Display Group Name
And I Click the Backward button

Scenario: Enter the Name without Selecting Menu Items and verify Save and Publish button
Given Click the New Display Group button
And I Enter Display Group Name
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Display Group Name above the limit
Given Click the New Display Group button
Then I Enter the Display Group Name Exceeding the limit
And I Click the Backward button

Scenario: Select the Menu Item without Entering Name and verify Save and Publish button
Given Click the New Display Group button
When I Clear the Name
And I Select the Menu item
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we able to Save the Display Group with Single letter
Given Click the New Display Group button
And I Enter the Single letter in Display Group Name
And I Select the Multiple Menu Items
And I Click the Save and Publish button
Then Verify whether we able to Save the Display Group with Single letter

Scenario: Create New Display Group with Mandatory Fields
Given Click the New Display Group button
Then Upload an Image
When I Enter Display Group Name
And I Select the Multiple Menu Items
And I Select the Availability as Always
And I Click the Save and Publish button
Then Verify DisplayGroup Saved Or Not

Scenario: Verify Update Display Group Page header and Can able to Edit and Cancel
Given Search and Click Edit Display Group
And Verify Update Display Group Header
And Check the Update and Publish button is Disabled
And I Click the Backward button
Then Verify Edit Screen Closed or Not

Scenario: Verify Able to Update and Publish without Display Group Name
Given Search and Click Edit Display Group
When I Clear the Name
Then Check the Update and Publish button is Disabled
And I Click the Backward button

Scenario: Verify Able to Update and Publish without Menu Items
Given Search and Click Edit Display Group
And I Delete the Menu Item
And I Click the Delete button
Then Check the Update and Publish button is Disabled
And I Click the Backward button

Scenario: Verify Able Do Z-A sorting
Given Search and Click Edit Display Group
And I Select Sort By Option as Z-A
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

Scenario: Verify Able Do Custom sorting
Given Search and Click Edit Display Group
And I Select Sort By Option as Custom
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

Scenario: Verify Able Do A_Z sorting
Given Search and Click Edit Display Group
And I Select Sort By Option as A-Z
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

Scenario: Update the Display Group with Days of Week
Given Search and Click Edit Display Group
Then I Verify the Selected Availability as Always
When I Enter Display Group Name
And I Select the Availability as Days of Week
Then Check the Update and Publish button is Disabled
And I Selecting the Days
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Time Toggle
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
Then Verify the Start time should be less than end time Error Mesasage
And I Select the End Time in Restriction Time
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

Scenario: Update the Display Group with Days of Month
Given Search and Click Edit Display Group
Then I Verify the Selected Availability as Days of Week
When I Enter Display Group Name
And I Select the Availability as Days of Month
Then Check the Update and Publish button is Disabled
And I Selecting the Days Of Months
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Months Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Restriction Months
And I Enable the Restriction Time Toggle
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
#Then Verify the Start time should be less than end time Error Mesasage
And I Select the End Time in Restriction Time
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

Scenario: Update the Display Group with Date Range
Given Search and Click Edit Display Group
Then I Verify the Selected Availability as Days of Month
When I Enter Display Group Name
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
#Then Verify the Start time should be less than end time Error Mesasage
And I Select the End Time in Restriction Time
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

Scenario: Update the Display Group with Specific Date
Given Search and Click Edit Display Group
Then I Verify the Selected Availability as Date Range
When I Enter Display Group Name
And I Select the Availability as Specific Date
Then Check the Update and Publish button is Disabled
And I Select the Specific Date
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Time Toggle
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
#Then Verify the Start time should be less than end time Error Mesasage
And I Select the End Time in Restriction Time
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

Scenario: Update the Display Group with Date Range With Time
Given Search and Click Edit Display Group
Then I Verify the Selected Availability as Specific Date
When I Enter Display Group Name
And I Select the Availability as Date Range with Time
Then Check the Update and Publish button is Disabled
And I Select the Start Date
Then Check the Update and Publish button is Disabled
And I Select the End Date
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Date Range Available Time
Then Check the Update and Publish button is Disabled
#Then Verify the Start time should be less than end time Error Mesasage
And I Select the End Time in Date Range Available Time
Then Check the Update and Publish button is Enabled
And I Enable the Available Days Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Available Days
Then Check the Update and Publish button is Enabled
And I Enable Restriction Days Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Restriction Days
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

Scenario: Verify whether the price level dropdown is displayed after Selecting price level menu
Given Navigate to MenuItem page and Get the value of MenuItem which has Price and navigate to the DisplayGroup page
Then Search and Click Edit Display Group
And I Select the price level Menu Item
And Select the Price level From Dropdown
And I Click the Update and Publish button
Then Verfiy whether Display Groups Updated or Not

#Scenario: Verify whether the menu item is getting deleted after removing the menu item using "X" button
#Given Click the New Display Group button
#And I Enter the Display Group Name
#And I Select the Multiple Menu Items
#And I remove the menu item using "X" button
#Then Verify whether the menu item is getting deleted

#Scenario: Verify whether the Display group is updated or not
#Given Search and Click on Edit Display Group
#And I Change the price level
#And I Click the Update and Publish button
#Then Verfiy whether Display Group Updated or Not

#Scenario: Verify whether "Select days of week" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Days of Week
#And I Enable the Restriction Time Toggle
#Then Verify whether "Select days of week" error is displayed

#Scenario: Verify "Start time should be less than end time" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Days of Week
#And I Selecting the Days
#And I Enable the Restriction Time Toggle
#And I Select the Start Time in Restriction Time
#And I Select the End Time in Restriction Time same as Start Time
#Then Verify "Start time should be less than end time" error is displayed

#Scenario: Verify whether "Select days of month" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Days of month
#And I Enable the Restriction Months Toggle
#Then Verify whether "Select days of month" error is displayed

#Scenario: Verify "Start time should be less than end time" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Days of Month
#And I Selecting the Days
#And I Enable the Restriction Months Toggle
#And I Enable the Restriction Time Toggle
#And I Select the Start Time in Restriction Time
#And I Select the End Time in Restriction Time same as Start Time
#Then Verify "Start time should be less than end time" error is displayed

#Scenario: Verify "Please Select End Date" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Date Range
#And I Select the Start Date
#Then Verify "Please Select End Date" error is displayed

#Scenario: Verify "Please Select Start Date" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Date Range
#And I Select the End Date
#Then Verify "Please Select Start Date" error is displayed

#Scenario: Verify whether "Select days of week" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Date Range
#And I Select the Start Date
#And I Select the End Date
#And I Enable the Restriction Month Toggle
#Then Verify whether "Select days of week" error is displayed

#Scenario: Verify "Start time should be less than end time" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Date Range
#And I Select the Start Date
#And I Select the End Date
#And I Enable the Restriction Months Toggle
#And I Enable the Restriction Time Toggle
#And I Select the Start Time in Restriction Time
#And I Select the End Time in Restriction Time same as Start Time
#Then Verify "Start time should be less than end time" error is displayed

#Scenario: Verify "Select Date" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Specific Date
#And I Enable the Restriction Time Toggle
#Then Verify "Select Date" error is displayed

#Scenario: Verify "Start time should be less than end time" error is displayed
#Given Search and Click on Edit Display Group
#Then I Verify the Selected Availability as Always
#And I Select the Availability as Specific Date
#And I Select the Date
#And I Select the Start Time in Restriction Time
#And I Select the End Time in Restriction Time same as Start Time
#Then Verify "Start time should be less than end time" error is displayed

Scenario: Verify whether Unable to Inactivate the Display Group Clicking Cancel/No button
Given I Search the Display Group and Click the Delete button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Display Group Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Display Group Clicking Delete/Yes button
Given I Search the Display Group and Click the Delete button
And I Click the Delete button
Then I Verifying the Display Group Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Display Group

Scenario: Verify whether Unable to Activate the Display Group Clicking Cancel/No button
Given I Search the Display Group and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Display Group is Activated or not

Scenario: Verify whether Able to Activate the Display Group Clicking Delete/Yes button
Given I Search the Display Group and Click the Active button
And I Click the Activate button
Then I Verifying the Display Group Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Display Group

Scenario: Verify whether the Display Group Updating with Space in the end of Category name
Given Search and Click Edit Display Group
When I Enter the New Display Group Name with Space
And I Click the Update and Publish button
Then Verify whether the Display Group Name with Space in end is Updated or not

Scenario: Verify whether able to Creating Duplicate Display Group
Given Click the New Display Group button
When I Enter Display Group Name
And I Select the Menu item
And I Select the Availability as Always
And I Click the Save and Publish button
Then Verify whether the Duplicate Display Group is Saved or not
























