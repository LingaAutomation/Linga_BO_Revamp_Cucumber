@Product/Items
@Categories
@Product/Items01

Feature: Product and Items - Category
I am verify the Product/Items-Category module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Category page
Given Open the Category home page BaseURL and StoreID

Scenario: Verify whether the Category Header is Displayed
Given Verifying the Category Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Sorting Category column
Given Sort the Category column

#Scenario: Sorting Image column in Category
#Given Sort the Image column

Scenario: Verify Home Path
Given Verifying the Homepath

Scenario: Verify the New Categories Page header
Given Click the New Category button
Then Verify the New Category Header
And I Click the Backward button

Scenario: Verify whether able to Upload Image
Given Click the New Category button
Then Upload an Image
And I Click the Backward button

Scenario: Verify whether we able to create the New Category without Entering Name/Mandatory Fields
Given Click the New Category button
And I Click the Save button without Entering Category Name
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Category Name above the limit
Given Click the New Category button
And I Enter the Category Name Exceeding the limit
And I Click the Backward button

Scenario: Enter the Name without Selecting Mandatory Fields and verify Save and Publish button
Given Click the New Category button
When I Enter Category Name
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify able to Create a New Department in Category
Given Click the New Category button
When I Enter Category Name
And I Click New Department button in Category
When Verify the New Department Header
And I Enter the Department Name in Category
And I Enter the Department Code in Category
And I Click the Save button
Then Verify whether the Department is Saved or not
Then Check the Save and Publish button is Disabled
And I Select the Coursing
And I Select Serving Size level
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify able to Create a New Coursing in Category
Given Click the New Category button
When I Enter Category Name
And I Select the Department
And I Click New Coursing button in Category
When Verify the New Coursing Header
And I Enter the Coursing Name in Category
And I Enter the Priority
And I Click the Save button
Then Verify whether the Coursing is Saved or not
Then Check the Save and Publish button is Disabled
And I Select Serving Size level
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify able to Create a New Serving Size Level in Category
Given Click the New Category button
When I Enter Category Name
And I Select the Department
And I Click New Serving Size Level button In Category
When Verify the New Serving Size Level Header
And I Enter the Serving Size Level Name in Category
And I Enter the Serving Size Level Description
And I Click the Save button
Then Verify whether the Serving Size Level is Saved or not
Then Check the Save and Publish button is Disabled
And I Select the Coursing
Then Check the Save and Publish button is Enabled
And I Disable the Inherit Default Tax Toggle
And I Click the Backward button

Scenario: Verify able to Create a New Tax in Category
Given Click the New Category button
When I Enter Category Name
And I Click New Tax button in Category
When Verify the New Taxes Header in Category Page
And I Enter the Tax Name in Category
And I Select the Tax Type as Amount
And I Enter the Amount
And I Click the Save button
Then Verify whether the Tax is Saved or not
And I Select the Department
And I Select the Coursing
And I Select Serving Size level
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify able to Create a TareGroup in SubCategory
Given Click the New SubCategory button
When I Enter Category Name
And I Click New TareGroup button In Category
When Verify the New TareGroup Header
And I Enter the TareGroup Name in Category
And I Click on the Add Weight
	And I Enter the Sequence Number
	And I Enter the Weight Name
	And I Enter the Unit of Measure Weight
 	And I Enter the Weight
	And I Click the Save button
	Then Check whether Tare Group Saved or Not
    #Then Check the Save and Publish button is Disabled
And I Select the Department
 And I Select the Coursing
And I Select Serving Size level
And I Select the Taxes
Then Check the Save and Publish button is Enabled
And I Disable the Inherit Default Tax Toggle
   And I Click the Backward button

Scenario: Create and Save New Category with Mandatory Fields
Given Click the New Category button
Then Upload an Image
When I Enter Category Name
And I Select the Department
And I Select the Coursing
And I Select Serving Size level
And I Enable the Inherit Default Tax Toggle
And I Select the Item Service Charge
And I Select the Roles
And I Select the Tare Group
And I Select the Taxes
And I Select the Availability as Always
And I Enable Hide in POS Toggle
And I Enable Hide In Online Order Toggle
And I Enable Hide in Kiosk Toggle
And Click on New Kitchen Printer button
When Verify the New Kitchen Printer Header
And I Select Printer Model
And I Enter Kitchen Printer Name in Category
And I Enter the Kitchen Printer IP Address in Category
#And I Enable Service Type Restriction and Select Allow Service Types
#And I Select the Kitchen Printer Allow Service Types
And I Click the Save button
And Verify whether Kitchen Printer Saved or Not
Then Check Added Kitchen Printer in Category is Selected
And Click on New Label Printer button
When Verify the New Label Printer Header
And I Select Printer Model
And I Enter Label Printer Name in Category
And I Enter the Label Printer IP Address in Category
#And I Enable Service Type Restriction 
#And I Select the Kitchen Printer Allow Service Types
And I Click the Save button
And Verify whether Label Printer Saved or Not
Then Check Added Label Printer in Category is Selected
And I Select the Restrict Printers
And I Click the Save and Publish button
Then Verify whether the Category is Saved or not

#Scenario: Create & Verify New Kitchen Printer in Category
#Given Click the New Category button
#And Click on New Kitchen Printer button
#When I Enter Kitchen Printer Name in Category
#And I Enter the Kitchen Printer IP Address in Category
#And I Enable Service Type Restriction 
#And I Select the Kitchen Printer Allow Service Types
#And I Click the Save button
#And Verify whether Kitchen Printer Saved or Not
#Then Check Added Kitchen Printer is Selected
#
#Scenario: Create & Verify New Label Printer in Category
#Given Click the New Category button
#
#Scenario: Create & Verify New Label Printer in Category
#Given Click the New Category button
#And Click on New Label Printer button
#When I Enter Label Printer Name in Category
#And I Enter the Label Printer IP Address in Category
#And I Enable Service Type Restriction 
#And I Select the Kitchen Printer Allow Service Types
#And I Click the Save button
#And Verify whether Label Printer Saved or Not
#Then Check Added Label Printer is Selected


Scenario: Verify Can able to Edit and Cancel
Given Search and Click Edit Category
Then Check the Update and Publish button is Disabled
And I Click the Backward button


Scenario: Verify Able to Update and Publish without Category Name
Given Search and Click Edit Category
When I Clear the Name
Then Check the Update and Publish button is Disabled
And I Click the Backward button


Scenario: Verify Able to Update and Publish Category Without Taxes
Given Search and Click Edit Category
And I Disable the Inherit Default Tax Toggle
Then Check the Update and Publish button is Disabled
And I Click the Backward button


Scenario: Update the Category with Days of Week
Given Search and Click Edit Category
When I Enter Category Name
#And I Select the Department
#And I Select the Coursing
#And I Select Serving Size level
#And I Enable the Inherit Default Tax Toggle
#And I Select the Taxes
Then Check Added Kitchen Printer in Category is Selected
Then Check Added Label Printer in Category is Selected
Then I Verify the Selected Availability as Always
And I Verify Hide in POS Toggle is Enabled
And I Verify Hide In Online Order Toggle is Enabled 
And I Verify Hide in Kiosk Toggle is Enabled
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
And I Enable Conversational Toggle
And I Enable Enable Age Restriction Toggle
And I Enable Exclude Check Tax Toggle
And I Enable Exclude Gratuity Toggle
And I Select the Kitchen Printers
And I Select the Label Printers
And I Select the Restrict Printers
And I Click the Update and Publish button
Then Verfiy whether Category Updated or Not


Scenario: Update the Category with Days of Month
Given Search and Click Edit Category
Then I Verify the Selected Availability as Days of Week
When I Enter Category Name
And I Verify Conversational Toggle is Enabled 
And I Verify Enable Age Restriction Toggle is Enabled
And I Verify Exclude Check Tax Toggle is Enabled
And I Verify Exclude Gratuity Toggle is Enabled
And I Select the Availability as Days of Month
Then Check the Update and Publish button is Disabled
And I Selecting the Days Of Months
Then Check the Update and Publish button is Enabled
And I Enable Avaiable Months Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Available Months
Then Check the Update and Publish button is Enabled
And I Enable the Restriction Months Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Restriction Months
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
Then Verify the There is overlap in restriction & available time Error Mesasage
And I Select the End Time in Available Time
And I Disable Hide in POS Toggle
And I Disable Hide In Online Order Toggle
And I Disable Hide in Kiosk Toggle
And I Disable Conversational Toggle
And I Disable Enable Age Restriction Toggle
And I Disable Exclude Check Tax Toggle
And I Disable Exclude Gratuity Toggle
And I Click the Update and Publish button
Then Verfiy whether Category Updated or Not


Scenario: Update the Category with Date Range
Given Search and Click Edit Category
And I Verify Conversational Toggle is Disabled 
And I Verify Enable Age Restriction Toggle is Disabled
And I Verify Exclude Check Tax Toggle is Disabled
And I Verify Exclude Gratuity Toggle is Disabled
And I Verify Hide In Online Order Toggle is Disabled
Then I Verify the Selected Availability as Days of Month
When I Enter Category Name
And I Enable Conversational Toggle
And I Select the Availability as Date Range
Then Check the Update and Publish button is Disabled
And I Select the Start Date
Then Check the Update and Publish button is Disabled
And I Select the End Date
Then Check the Update and Publish button is Enabled
And I Enable the Available Days Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Available Days
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
And I Enable the Available Time Toggle
And I Click the Add New Time button
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Available Time Same as Restriction Time
Then Verify the There is overlap in restriction & available time Error Mesasage
And I Select the Start Time in Available Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Available Time Same as Restriction Time
Then Verify the There is overlap in restriction & available time Error Mesasage
And I Select the End Time in Available Time
And I Click the Update and Publish button
Then Verfiy whether Category Updated or Not


Scenario: Update the Category with Specific Date
Given Search and Click Edit Category
And I Verify Conversational Toggle is Enabled
Then I Verify the Selected Availability as Date Range
When I Enter Category Name
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
And I Enable the Available Time Toggle
And I Click the Add New Time button
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Available Time Same as Restriction Time
Then Verify the There is overlap in restriction & available time Error Mesasage
And I Select the Start Time in Available Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Available Time Same as Restriction Time
Then Verify the There is overlap in restriction & available time Error Mesasage
And I Select the End Time in Available Time
And I Click the Update and Publish button
Then Verfiy whether Category Updated or Not


Scenario: Update the Category with Date Range With Time
Given Search and Click Edit Category
Then I Verify the Selected Availability as Specific Date
When I Enter Category Name
And I Select the Availability as Date Range with Time
Then Check the Update and Publish button is Disabled
And I Select the Start Date
Then Check the Update and Publish button is Disabled
And I Select the End Date
Then Check the Update and Publish button is Disabled
And I Select the Start Time in Date Range Available Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Date Range Available Time
Then Check the Update and Publish button is Enabled
And I Enable the Available Days Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Available Days
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
Then Verfiy whether Category Updated or Not


Scenario: Update the Category with Always
Given Search and Click Edit Category
Then I Verify the Selected Availability as Date Range with Time
When I Enter Category Name
And I Select the Availability as Always
And I Click the Update and Publish button
Then Verfiy whether Category Updated or Not

Scenario: Verify Updated Category Availability is Selected as Always
Given Search and Click Edit Category
Then I Verify the Selected Availability as Always
And I Click the Backward button


Scenario: Searching with Special Characters
Then Enter Special Characters in Search field and Verify

Scenario: Verify whether able to Inactivate the Category Clicking Cancel/No button
Given I Search the Category and Click the Delete button
  And I Click the Cancel button in Pop Up
Then Verify the Cancelled Catgeory Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Category Clicking Delete/Yes button
Given I Search the Category and Click the Delete button
And I Click the Delete button
Then I Verifying the Category Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Category

Scenario: Verify whether able to Activate the Category Clicking Cancel/No button
Given I Search the Category and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Category is Activated or not

Scenario: Verify whether Able to Activate the Category Clicking Activate/Yes button
Given I Search the Category and Click the Active button
And I Click the Activate button
Then I Verifying the Category Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Category

Scenario: Verify whether able to Delete the Category which is mapped with SubCatgeory/Menu Item
Given Navigate to Menu Items page and Get the value and navigate to the Categories page
Then I Search the Category mapped with Menu Item and Click the Delete button
And I Click the Delete button
Then I Verifying the Category Mapped Menu Item is Deleted or not

Scenario: Verify whether able to Creating Duplicate Category
Given Click the New Category button
When I Enter Category Name
And I Select the Department
And I Select the Coursing
And I Select Serving Size level
And I Enable the Inherit Default Tax Toggle
And I Select the Taxes
And I Click the Save and Publish button
Then Verify whether the Duplicate Category is Saved or not

Scenario: Verify whether the Category Updating with Space in the end of Category name
Given Search and Click Edit Category
When I Enter the New Category Name with Space
And I Click the Update and Publish button
Then Verify whether the Category Name with Space in end is Updated or not

Scenario: Create a Kitchen Printer with Duplicate IP Address and verify it is displaying in category screen
Given Click the New Category button
And Click on New Kitchen Printer button
And I Select Printer Model
And I Enter Diff Kitchen Printer Name
And I Enter the Kitchen Printer IP Address in Category
#And I Enable Service Type Restriction and Select Allow Service Types
#And I Select the Kitchen Printer Allow Service Types
And I Click the Save button
Then Verify whether Kitchen Printer with Duplicate Ip Saved or Not
And I Click the Backward button

Scenario: Verfiy Searched element displaying in Active and Inactive list
Given Search the Element in Active and InActive List

Scenario: Verify the Created Kitchen Printer in Category Page is Displayed on Kitchen Printer Page
Given Navigate the Kitchen Printers Page and I Search the Added Kitchen Printer from Category in Kitchen Printers Settings Page
Then Veifying the Saved Kitchen Printer In Category Page


Scenario: Verify the Created Label Printer in Category Page is Displayed on Label Printer Page
Given Navigate the Label Printers Page and I Search the Added Label Printer from Category in Label Printers Settings Page
Then Veifying the Saved Label Printer In Category Page
Given Open the Category home page BaseURL and StoreID