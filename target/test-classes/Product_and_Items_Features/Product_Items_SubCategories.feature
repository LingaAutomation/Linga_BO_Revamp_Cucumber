@Product/Items 
@SubCategory
@Product/Items01

Feature: Product and Items - SubCategory
  I am verify the Product/Items-SubCategory module by Add/Edit/Delete/Activate/Duplicate

 
  Background: Opening the SubCategory page
Given Open the SubCategory home page BaseURL and StoreID

Scenario: Verify whether the SubCategory Header is Displayed
Given Verifying the SubCategory Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Sorting SubCategory column
Given Sort the SubCategory column

  #Scenario: Sorting Image column in SubCategory
    #Given Sort the Image column

  #Scenario: Verify Home Path
    #Given Verifying the Homepath

Scenario: Verify the New Sub Categories Page header
Given Click the New SubCategory button
Then Verify the New SubCategory Header
And I Click the Backward button

Scenario: Verify whether able to Upload Image
Given Click the New SubCategory button
Then Upload an Image
And I Click the Backward button

Scenario: Verify whether we able to create the New SubCategory without Entering Name/Mandatory Fields
Given Click the New SubCategory button
And I Click the Save button without Entering SubCategory Name
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the SubCategory Name above the limit
Given Click the New SubCategory button
And I Enter the SubCategory Name Exceeding the limit
And I Click the Backward button

Scenario: Enter the Name without Selecting Mandatory Fields and verify Save and Publish button
Given Click the New SubCategory button
When I Enter SubCategory Name
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify able to Create a New Coursing in SubCategory
Given Click the New SubCategory button
When I Enter SubCategory Name
And I Click New Coursing button in Category
When Verify the New Coursing Header
And I Enter the Coursing Name in SubCategory
And I Enter the Priority
And I Click the Save button
Then Verify whether the Coursing is Saved or not
Then Check the Save and Publish button is Disabled
And I Select the Category
And I Select Serving Size level
And I Select the Taxes
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify able to Create a New Serving Size Level in SubCategory
Given Click the New SubCategory button
When I Enter SubCategory Name
And I Click New Serving Size Level button In Category
When Verify the New Serving Size Level Header
And I Enter the Serving Size Name in SubCategory
And I Enter the Serving Size Level Description
And I Click the Save button
Then Verify whether the Serving Size Level is Saved or not
Then Check the Save and Publish button is Disabled
And I Select the Category
And I Select the Coursing
And I Select the Taxes
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify able to Create a TareGroup in SubCategory
Given Click the New SubCategory button
When I Enter SubCategory Name
And I Click New TareGroup button In Category
When Verify the New TareGroup Header
And I Enter the TareGroup Name in SubCategory
And I Click on the Add Weight
	And I Enter the Sequence Number
	And I Enter the Weight Name
	And I Enter the Unit of Measure Weight
 	And I Enter the Weight
	And I Click the Save button
	Then Check whether Tare Group Saved or Not
    #Then Check the Save and Publish button is Disabled
And I Select the Category
 And I Select the Coursing
And I Select Serving Size level
And I Select the Taxes
Then Check the Save and Publish button is Enabled
And I Disable the Inherit Default Tax Toggle
   And I Click the Backward button
   
Scenario: Verify able to Create a New Tax in SubCategory
Given Click the New SubCategory button
When I Enter SubCategory Name
And I Click New Tax button in Category
When Verify the New Taxes Header in Category Page
And I Enter the Tax Name in SubCategory
And I Select the Tax Type as Amount
And I Enter the Amount
And I Click the Save button
Then Verify whether the Tax is Saved or not
And I Select the Category
And I Select the Coursing
And I Select Serving Size level
Then Check the Save and Publish button is Enabled
And I Click the Backward button


Scenario: Create and Save New SubCategory with Mandatory Fields
Given Click the New SubCategory button
When I Enter SubCategory Name
And I Select the Coursing
And I Select the Category
And I Select Serving Size level
And I Select the Tare Group
And I Enable the Inherit Default Tax Toggle
And I Select the Taxes
And I Select the Availability as Always
And I Enable Hide in POS Toggle
And I Enable Hide In Online Order Toggle
And I Enable Hide Menu Item In Kiosk Toggle
And Click on New Kitchen Printer button
When Verify the New Kitchen Printer Header
And I Select Printer Model
And I Enter Kitchen Printer Name in SubCategory
And I Enter the Kitchen Printer IP Address in SubCategory
    #And I Enable Service Type Restriction
    #And I Select the Kitchen Printer Allow Service Types
And I Click the Save button
And Verify whether Kitchen Printer Saved or Not
Then Check Added Kitchen Printer in SubCategory is Selected
And Click on New Label Printer button
When Verify the New Label Printer Header
And I Select Printer Model
And I Enter Label Printer Name in SubCategory
And I Enter the Label Printer IP Address in SubCategory
    #And I Enable Service Type Restriction
    #And I Select the Kitchen Printer Allow Service Types
And I Click the Save button
And Verify whether Label Printer Saved or Not
Then Check Added Label Printer in SubCategory is Selected
And I Select the Restrict Printers
And I Click the Save and Publish button
Then Verify whether the SubCategory is Saved or not

  #Scenario: Create & Verify New Kitchen Printer in SubCategory
  #Given Click the New SubCategory button
  #And Click on New Kitchen Printer button
  #When I Enter Kitchen Printer Name in SubCategory
  #And I Enter the Kitchen Printer IP Address in SubCategory
  #And I Enable Service Type Restriction
  #And I Select the Kitchen Printer Allow Service Types
  #And I Click the Save button
  #And Verify whether Kitchen Printer Saved or Not
  #Then Check Added Kitchen Printer is Selected
  #
  #Scenario: Create & Verify New Label Printer in SubCategory
  #Given Click the New SubCategory button
  #
  #Scenario: Create & Verify New Label Printer in SubCategory
  #Given Click the New SubCategory button
  #And Click on New Label Printer button
  #When I Enter Label Printer Name in SubCategory
  #And I Enter the Label Printer IP Address in SubCategory
  #And I Enable Service Type Restriction
  #And I Select the Kitchen Printer Allow Service Types
  #And I Click the Save button
  #And Verify whether Label Printer Saved or Not
  #Then Check Added Label Printer is Selected
  
  
Scenario: Verify Can able to Edit and Cancel
Given Search and Click Edit SubCategory
Then Check the Update and Publish button is Disabled
And I Click the Backward button


Scenario: Verify Able to Update and Publish without SubCategory Name
Given Search and Click Edit SubCategory
When I Clear the Name
Then Check the Update and Publish button is Disabled
And I Click the Backward button

Scenario: Verify Able to Update and Publish SubCategory Without Taxes
Given Search and Click Edit SubCategory
And I Disable the Inherit Default Tax Toggle
Then Check the Update and Publish button is Disabled
And I Click the Backward button

Scenario: Update the SubCategory with Days of Week
Given Search and Click Edit SubCategory
When I Enter SubCategory Name
    #And I Select the Coursing
    #And I Select the Category
    #And I Select Serving Size level
    #And I Select the Tare Group
    #And I Enable the Inherit Default Tax Toggle
Then Check Added Kitchen Printer in SubCategory is Selected
Then Check Added Label Printer in SubCategory is Selected
Then I Verify the Selected Availability as Always
And I Verify Hide in POS Toggle is Enabled
And I Verify Hide In Online Order Toggle is Enabled 
And I Verify Hide Menu Item In Kiosk Toggle is Enabled
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
Then Verfiy whether SubCategory Updated or Not

Scenario: Update the SubCategory with Days of Month
Given Search and Click Edit SubCategory
Then I Verify the Selected Availability as Days of Week
When I Enter SubCategory Name
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
And I Disable Hide Menu Item In Kiosk Toggle
And I Disable Conversational Toggle
And I Disable Enable Age Restriction Toggle
And I Disable Exclude Check Tax Toggle
And I Disable Exclude Gratuity Toggle
And I Click the Update and Publish button
Then Verfiy whether SubCategory Updated or Not

Scenario: Update the SubCategory with Date Range
Given Search and Click Edit SubCategory
And I Verify Conversational Toggle is Disabled 
And I Verify Enable Age Restriction Toggle is Disabled
And I Verify Exclude Check Tax Toggle is Disabled
And I Verify Exclude Gratuity Toggle is Disabled
Then I Verify the Selected Availability as Days of Month
When I Enter SubCategory Name
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
Then Verfiy whether SubCategory Updated or Not

Scenario: Update the SubCategory with Specific Date
Given Search and Click Edit SubCategory
   And I Verify Conversational Toggle is Enabled
Then I Verify the Selected Availability as Date Range
When I Enter SubCategory Name
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
Then Verfiy whether SubCategory Updated or Not

Scenario: Update the SubCategory with Date Range With Time
Given Search and Click Edit SubCategory
Then I Verify the Selected Availability as Specific Date
When I Enter SubCategory Name
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
Then Verfiy whether SubCategory Updated or Not

Scenario: Update the SubCategory with Always
Given Search and Click Edit SubCategory
Then I Verify the Selected Availability as Date Range with Time
When I Enter SubCategory Name
And I Select the Availability as Always
And I Click the Update and Publish button
Then Verfiy whether SubCategory Updated or Not

Scenario: Verify Updated SubCategory Availability is Selected as Always
Given Search and Click Edit SubCategory
Then I Verify the Selected Availability as Always
And I Click the Backward button

Scenario: Searching with Special Characters
Then Enter Special Characters in Search field and Verify

Scenario: Verify whether able to Inactivate the SubCategory Clicking Cancel/No button
Given I Search the SubCategory and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled SubCategory Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the SubCategory Clicking Delete/Yes button
Given I Search the SubCategory and Click the Delete button
And I Click the Delete button
Then I Verifying the SubCategory Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated SubCategory

Scenario: Verify whether able to Activate the SubCategory Clicking Cancel/No button
Given I Search the SubCategory and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled SubCategory is Activated or not

Scenario: Verify whether Able to Activate the SubCategory Clicking Activate/Yes button
Given I Search the SubCategory and Click the Active button
And I Click the Activate button
Then I Verifying the SubCategory Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated SubCategory

#Scenario: Verify whether able to Delete the Category which is mapped with Category
#Given Navigate to Menu Items page and Get the value and navigate to the SubCategories page
#Then I Search the SubCategory mapped with Menu Item and Click the Delete button
#And I Click the Delete button
#Then I Verifying the SubCategory Mapped Menu Item is Deleted or not

Scenario: Verify whether able to Delete the Category which is mapped with Category/Menu Item
Given Navigate to Menu Items page and Get the value and navigate to the SubCategories page
Then I Search the SubCategory mapped with Menu Item and Click the Delete button
And I Click the Delete button
Then I Verifying the SubCategory Mapped Menu Item is Deleted or not

Scenario: Verify whether able to Creating Duplicate SubCategory
Given Click the New SubCategory button
When I Enter SubCategory Name
And I Select the Coursing
And I Select the Category
And I Select Serving Size level
And I Enable the Inherit Default Tax Toggle
And I Select the Taxes
And I Click the Save and Publish button
Then Verify whether the Duplicate SubCategory is Saved or Not

Scenario: Verify whether the SubCategory Updating with Space in the end of SubCategory name
Given Search and Click Edit SubCategory
When I Enter the New SubCategory Name with Space
And I Click the Update and Publish button
Then Verify whether the SubCategory Name with Space in end is Updated or not

Scenario: Create a Kitchen Printer with Duplicate IP Address and verify it is displaying in SubCategory screen
Given Click the New SubCategory button
And Click on New Kitchen Printer button
And I Enter Diff Kitchen Printer Name
And I Enter the Kitchen Printer IP Address in SubCategory
#And I Enable Service Type Restriction
#And I Select the Kitchen Printer Allow Service Types
And I Click the Save button
Then Verify whether Kitchen Printer with Duplicate Ip Saved or Not
And I Click the Backward button

Scenario: Verfiy Searched element displaying in Active and Inactive list
Given Search the Element in Active and InActive List

Scenario: Verify the Created Kitchen Printer in SubCategory Page is Displayed on Kitchen Printer Page
Given Navigate the Kitchen Printers Page and I Search the Added Kitchen Printer from SubCategory in Kitchen Printers Settings Page
Then Veifying the Saved Kitchen Printer In SubCategory Page

Scenario: Verify the Created Label Printer in SubCategory Page is Displayed on Label Printer Page
Given Navigate the Label Printers Page and I Search the Added Label Printer from SubCategory in Label Printers Settings Page
Then Veifying the Saved Label Printer In SubCategory Page
Given Open the SubCategory home page BaseURL and StoreID

Scenario: Verify the Created Sub-Category is displaying when Searching Selected Category for Sub-Category
#And I Click Category in SubCategory Page
And I Search the Selected Category in SubCategory Home Page
And I Click the Apply button
Then Check the Selected Category listing out the Created Sub-Category is Displayed

