@Product/Items
@Menu_Items
@Product/Items01

Feature: Product and Items - Menu Items
I am verify the Product/Items-Menu Items module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Product/Items - Menu Items page
Given Open the Product/Items home page BaseURL and StoreID

#@EditMenuItem
Scenario: Verfiy whether the Menu Item Header is Displayed 
Given Verifying the Product/Items Header page

#@EditMenuItem
Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

#@EditMenuItem
Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

#@EditMenuItem
Scenario: Verify the New Menu Item Page header
Given I Click the New Menu Item button
Then Verify the New Menu Item header
And I Click the Backward button

#@EditMenuItem
Scenario: Verify whether we able to Create the New Menu Item without entering Name Fields
And I Click the New Menu Item button
And I Selecting the Categories
And I Select Serving Size in Set Price for Variable
And I Select the Taxes
#And I Click Save and Publish button without entering the Menu Item name
#Then Verify whether we able to Create the New Menu Item without entering Name Fields
Then Check the Save and Publish button is Disabled
And I Click the Backward button

@EditMenuItem
Scenario: Verify whether we able to Create the New Menu Item without Selecting Category 
And I Click the New Menu Item button
And I Enter the Menu Item Name
Then Check Level Type is Selected as Category
#And I without Selecting any Category
And I Select Serving Size in Set Price for Variable
And I Select the Taxes
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we able to Create the New Menu Item without Selecting Subcategory
And I Click the New Menu Item button 
And I Enter the Menu Item Name
And  Check Level Type is Selected as Category
And I Select the Level Type in General as Sub-Category
And I Selecting the Categories 
#And I Not Selecting Subcategory
And I Select Serving Size in Set Price for Variable
And I Select the Taxes
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we able to creare the New Menu Item without Selecting Serving size
And I Click the New Menu Item button 
And I Enter the Menu Item Name
Then Check Level Type is Selected as Category
And I Selecting the Categories 
And I Select the Taxes
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we able to Create the New Menu Item without Selecting Tax
And I Click the New Menu Item button 
And I Enter the Menu Item Name
Then Check Level Type is Selected as Category
And I Selecting the Categories 
And I Select Serving Size in Set Price for Variable
And I Disable the Inherit Default Tax Toggle
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify Menu Type is Selected as Menu Item by Default
And I Click the New Menu Item button
Then Check the Menu Type is Selected as Menu Item
And I Click the Backward button

Scenario: Verify Cast type is Selected Cost Type as Variable by Default
And I Click the New Menu Item button
Then Check Cost Type is Selected as Variable
And I Click the Backward button

Scenario: Verify we able to Enter the Seconday Name and PLU Code above the Excess Limit 
And I Click the New Menu Item button 
And I Enter Seceonday Name Exceeding the limit
And I Enter the PLU Code Exceeding the limit
#And I Enter more than 15 Charactrs 
#Then Secondary name text box should not allows to enter more than 50 characters
And I Click the Backward button

#Scenario: Verify Evertec Tax Type drop down shows taxes in list
#And I Click the New Menu Item button
#And I Check the Evertec Options is Displayed and Select Evertec
#And I Verify below options None, State Tax,Reduced Tax,Municipal Tax
#Then I Verify Evertec Tax Type drop down shows taxes in list
#And I Click the Backward button

Scenario: Verify we able to Create New Menu Item without Selecting Serving Size
And I Click the New Menu Item button
And I Enter the Menu Item Name
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Menu Item With Serving Size
And I Select the Taxes
Then Check the Save and Publish button is Disabled
#Then I Verify we able to Create New Menu Item without Selecting Serving Size
And I Click the Backward button

@EditMenuItem
Scenario: Verify we able to Create New Menu Item with same Serving Size
And I Click the New Menu Item button
And I Enter the Menu Item Name
Then Check Level Type is Selected as Category
And I Select the Menu Type as Menu Item 
And I Select the Level Type in General as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Menu Item With Serving Size
And I Select Serving Size for Menu Item With Serving Size in Set Price for Variable
And I Click the Add Serving Size Level
And I Select Same Serving size Twice in Set Price
And Check Serving Size Already Exists Error Message
Then Check the Save and Publish button is Disabled
#Then I Verify we able to Create New Menu Item with same Serving Size
And I Click the Backward button

@EditMenuItem
Scenario: Verify we able to Create New Menu Item with Same S.No
And I Click the New Menu Item button
And I Enter the Menu Item Name
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Menu Item With Serving Size
And I Select Serving Size for Menu Item With Serving Size in Set Price for Variable
And I Click the Add Serving Size Level
And I Enter Same Serial Number for Mutiple Serving Size
And  Check the Save and Publish button is Disabled
#Then I Verify we able to Create New Menu Item with same S.No
And I Click the Backward button

Scenario: Verify we able to Create New Open item
And I Click the New Menu Item button
And I Enter the Menu Item Name for Open Item
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Open Item
And I Select Serving Size in Set Price for Variable
And I Select the Taxes
And I Click the Save and Publish button 
Then Verify whether Menu Item is Saved or Not

Scenario: Veify we able to Create New Scale item
And I Click the New Menu Item button
And I Enter the Menu Item Name for Scale Item
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Scale Item
And I Select Serving Size in Set Price for Variable
And I Enter the Price
And I Select the Taxes
And I Click the Save and Publish button 
Then Verify whether Menu Item is Saved or Not

Scenario: Verify we able to Create New Combo Menu Item with Price Level Settings 
And I Click the New Menu Item button
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Combo Item
Then Check Price Level Settings Toggle is Disabled
#And I Select Menu Items
#And I Select Serving Size in Set Price for Variable 
#And I Add Unit Price
#Then I Verify Price Level Settings Greyedout or not
And I Click the Backward button

Scenario: Veify we able to Create New Combo Item without Selecting Menu Item
And I Click the New Menu Item button
And I Enter the Menu Item Name for Combo Item
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Combo Item
And I Select Serving Size in Set Price for Variable
And I Enter the Price
And I Select the Taxes
Then Check the Save and Publish button is Disabled 
#Then Verify whether Menu Item is Saved or Not
And I Click the Backward button

@EditMenuItem
Scenario: Verify we able to Create New Combo Item with same Menu Items
And I Click the New Menu Item button
And I Enter the Menu Item Name for Combo Item
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Combo Item
And I Select the Menu Items for Combo Item
And I Select Multiple Same Menu Items
Then Check Menu Already Exists Error is Displayed
Then Check the Save and Publish button is Disabled
#Then I Verify able to Create New Combo Item with same Menu Item
And I Click the Backward button

@EditMenuItem
Scenario: Verify we able to set the Same Seq No to Combo Menu Item
And I Click the New Menu Item button
And I Enter the Menu Item Name
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Combo Item
And I Select the Menu Items for Combo Item
And I Select Multiple Menu Items with Same Sequence Number
Then Check Seq.No Already Exists Error is Displayed
Then Check the Save and Publish button is Disabled
#Then I Verify We able to Create Combo Menu Item  with same Seq No
And I Click the Backward button

@EditMenuItem
Scenario: Verify we able to Create a New Combo Menu Item
And I Click the New Menu Item button
And I Enter the Menu Item Name for Combo Item
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Combo Item
And I Select the Menu Item in Combo Item
And I Select the Serving Size in Combo Item
And I Enter the S.No in Combo Item
And I Enter the Unit Price in Combo Item
And I Select Serving Size in Set Price for Variable
And I Select the Taxes
And I Select the Availability as Always
And I Click the Save and Publish button 
Then Verify whether Menu Item is Saved or Not

@EditMenuItem
Scenario: Verify Include Modifiers Optional Modifiers Mandatory Modifiers Inventory Details are disabled if Menutype selected as Comboitem
And I Click the New Menu Item button
Then Check Level Type is Selected as Category
And I Selecting the Categories
Then Check the Menu Type is Selected as Menu Item
And I Select the Menu Type as Combo Item
Then Check Included Modifiers Tab is not Displayed
Then Check Mandatory Modifier Groups Tab is not Displayed
Then Check Optional Modifier Groups Tab is not Displayed
Then Check Inventory Details Tab is not Displayed
And I Click the Backward button

##//Scenario: New category creation, subcategeory , tax
#New Category
@EditMenuItem
Scenario: Verify we able to Create New Category in Menu Item
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Click the New Category button in Menu Item
When I Verify the New Category Header 
And I Enter the Category Name in Menu Item
And I Select the Department
And I Select the Coursing
And I Select Serving Size level
And I Select the Taxes in Drop Down
#And I Check the Save button is Enabled
And I Click the Save button
And Verify whether Category Saved or Not
Then Check Added Category is Selected
And I Click the Backward button

#New Subcategory
@EditMenuItem
Scenario: Verify we able to Create New Subcategory in Menu Item
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Click the New SubCategory button in Menu Item
When I Verify the New SubCategory Header
And I Enter the SubCategory Name in Menu Item
And I Select Serving Size level
And I Select the Taxes in Drop Down
#And I Check the Save button is Enabled
And I Click the Save button
And Verify whether SubCategory Saved or Not
Then Check Added SubCategory is Selected
And I Click the Backward button

#New tax
Scenario: Verify able to Create a New Tax in Menu Item
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Click New Tax button in Category
When Verify the New Taxes Header
And I Enter the Tax Name in Menu Item
And I Select the Tax Type as Amount
And I Enter the Amount
And I Click the Save button
Then Verify whether the Tax is Saved or not
Then Check the Menu Type is Selected as Menu Item
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select Serving Size in Set Price for Variable
Then Check the Save and Publish button is Enabled
And I Click the Backward button

# New kitchen printer, Lable printer

Scenario: Create & Verify New Kitchen Printer in Menu Item
Given I Click the New Menu Item button
And Click on New Kitchen Printer button
When Verify the New Kitchen Printer Header
And I Select Printer Model
And I Enter Kitchen Printer Name in Menu Item
And I Enter the Kitchen Printer IP Address in Menu Item
#And I Enable Service Type Restriction
#And I Select the Kitchen Printer Allow Service Types
And I Click the Save button
And Verify whether Kitchen Printer Saved or Not
Then Check Added Kitchen Printer in Menu Item is Selected
And I Click the Backward button

Scenario: Create & Verify New Label Printer in Menu Item
Given I Click the New Menu Item button
And Click on New Label Printer button
When Verify the New Label Printer Header
And I Select Printer Model
And I Enter Label Printer Name in Menu Item
And I Enter the Label Printer IP Address in Menu Item
#And I Enable Service Type Restriction
#And I Select the Kitchen Printer Allow Service Types
And I Click the Save button
And Verify whether Label Printer Saved or Not
Then Check Added Label Printer in Menu Item is Selected
And I Click the Backward button


Scenario: Verify we able to add the Include Modifier without filling basic details
Given I Click the New Menu Item button
And I Select Included Modifiers Tab
And I Click the Add Include Modifiers button
Then Check Please Choose all the Mandatory fields in Basic Details Error message is Displayed
And I Click the Backward button

@EditMenuItemA
Scenario: Verif we able to Create Included Modifier group without Selecting the Modifier
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item
And I Select Serving Size in Set Price for Variable
And I Select Included Modifiers Tab
And I Click the Add Include Modifiers button
Then Check Select Modifier Group Error is Displayed
And I Select Modifier Group in Include Modifiers
Then Check the Save and Publish button is Disabled
And I Select Modifier in Include Modifiers
Then Check Alternate Modifier Group Toggle is Disabled
Then Check Override Prefix Upcharges Toggle is Disabled
And I Enable Alternate Modifier Group Toggle
Then Check the Save and Publish button is Disabled
And I Select the Same Alternate Modifier Group
Then Check Invalid Alternate Modifier Group Error is Displayed
And I Select the Alternate Modifier Group
Then Check the Save and Publish button is Enabled
And I Click the Backward button

@EditMenuItemA
Scenario: Verify we able to Create Mandatory Modifier Group without Selecting the Modifier Group
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item
And I Select Serving Size in Set Price for Variable
And I Select Mandatory Modifier Groups Tab
And I Click the Add Mandatory Modifier Group button
Then Check Select Modifier Group Error is Displayed
Then Check the Save and Publish button is Disabled
And I Select Modifier Group in Mandatory Modifier Group
Then Check Enter Display Order Error is Displayed
And I Enter the Display Order
Then Check the Save and Publish button is Enabled
And I Enter the Minimum Quantity
And I Enter Invalid Maximum Quantity
Then Check Enter Maximum Quantity Error is Displayed
And I Enter the Maximum Quantity
And I Disable Jump with Minimum Quantity Toggle
Then Check the Save and Publish button is Enabled
And I Click the Backward button

@EditMenuItemA
Scenario: Verify we able to Save the Opitonal Modifier Group without Selecting Modifier Group
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item
And I Select Serving Size in Set Price for Variable
And I Select Optional Modifier Groups Tab
And I Click the Add Optional Modifier Group button
Then Check Select Modifier Group Error is Displayed
Then Check the Save and Publish button is Disabled
And I Select Modifier Group in Optional Modifier Group
Then Check Enter Display Order Error is Displayed
And I Enter the Display Order in Optional Modifier
Then Check the Save and Publish button is Enabled
And I Click the Backward button

@EditMenuItemA
Scenario: Verify we able to add the Inventory Details to Menu Item
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item
And I Select Serving Size in Set Price for Variable
And I Select Inventory Details Tab
Then Check Selected Serving Size is Displayed
And I Click the Add Inventory Item button
Then Check the Save and Publish button is Disabled
And I Select the Level in Inventory Item as SubCategory
And I Select the Category in Inventory Item
And I Select the SubCategory in Inventory Item
And I Select the Item in Inventory Item
And I Select the Recipe Unit in Inventory Item
And I Enter the Quantity in Inventory Item
Then Validate the Cost by using Unit Price with Quantity in Inventory Items
Then Check the Save and Publish button is Enabled
And I Click the Backward button

@EditMenuItemA
Scenario: Verify we able to add the Sub Recipe to Menu Item
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item
And I Select Serving Size in Set Price for Variable
And I Select Inventory Details Tab
And I Click the Add Sub-Recipe button
Then Check the Save and Publish button is Disabled
And I Select the Item in SubRecipe
And I Select the Recipe Unit in SubRecipe
And I Enter the Quantity in SubRecipe
Then Validate the Cost by using Unit Price with Quantity in SubRecipe
Then Check the Save and Publish button is Enabled
And I Click the Backward button

@EditMenuItemA
Scenario: Verify we able to add the Manual Entry to Menu Item
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item
And I Select Serving Size in Set Price for Variable
And I Select Inventory Details Tab
And I Click the Add Manual Entry button
Then Check the Save and Publish button is Disabled
And I Enter the Item Name in Manual Entry
And I Enter the Unit Price in Manual Entry
And I Enter the Quantity in Manual Entry
Then Validate the Cost by using Unit Price with Quantity in Manual Entry
Then Check the Save and Publish button is Enabled
And I Click the Backward button

#@EditMenuItemUp
Scenario: Create a New Menu Item
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Enter the Secondary Name
And I Enter the PLU Code
And I Enter the Item Preparation Time
And I Check the Evertec Options is Displayed and Select Evertec
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item
And I Enable Conversational UI at POS Toggle
And I Disable Price Level Settings Toggle
And I Select Serving Size in Set Price for Variable
And I Select the Taxes
And I Select the Availability as Always
And I Select the Kitchen Printers
And I Select the Label Printers
And I Select the Restrict Printers
And I Click the Save and Publish button
Then Verfiy whether Menu Item Saved or Not

@EditMenuItem
Scenario: Create a New Menu Item With Serving Size
Given I Click the New Menu Item button
And I Enter the Menu Item With Serving Size Name
And I Enter the Secondary Name
#And I Enter the PLU Code
And I Enter the Item Preparation Time
And I Check the Evertec Options is Displayed and Select Evertec
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item With Serving Size
And I Select Cost Type as Fixed
And I Select Serving Size for Menu Item With Serving Size in Set Price for Fixed
And I Click the Save and Publish button
Then Verfiy whether Menu Item Saved or Not

@EditMenuItem
Scenario: Verify the Update header by Editing Saved Menu Item
Given I Search and Edit the Menu Item
Then Verify the Update Menu Item Header
And I Click the Backward button

@EditMenuItem
Scenario: Verify able to search the Menu Item by entering 3 letters of Menu Item Name
And I Verify Searching the Item when entering three letters Two

@EditMenuItem
Scenario: Update Menu Item without Entering Menu Item name
Given I Search and Edit the Menu Item
When I Clear the Name
Then Check the Update and Publish button is Disabled
And I Click the Backward button

#Scenario: Update Menu Item wihtout Category
#Given I Search and Edit the Menu Item
#And I Remove the Selected Categories
#Then Check the Update and Publish button is Disabled
#And I Click the Backward button

@EditMenuItemUp
Scenario: Update Menu Item by Changing Tax
Given I Search and Edit the Menu Item
#And Check Tax selected as Expected
And I Select the Taxes
And I Take selected Tax Names
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
Given I Search and Edit the Menu Item
Then Check Tax selected as Expected
And I Click the Backward button

@EditMenuItem
Scenario: Update Menu Item wihtout Subcategory
Given I Search and Edit the Menu Item
And I Select the Level Type in General as Sub-Category
Then Check the Update and Publish button is Disabled
And I Click the Backward button

Scenario: Verify we able to Update Menu Item with Visibility
Given I Search and Edit the Menu Item
Then I Verify Conversational UI at POS is Enabled
And I Enable Hide In Kiosk Toggle 
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
Given I Search and Edit the Menu Item
Then I Verify Hide In Kiosk is Enabled
And I Enable EBT Menu Item Toggle 
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
Given I Search and Edit the Menu Item
Then I Verify EBT Menu Item is Enabled
And I Enable Hide In POS Toggle 
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
Given I Search and Edit the Menu Item
Then I Verify Hide In POS is Enabled
And I Enable Hide In Online Order Toggle 
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
Given I Search and Edit the Menu Item
Then I Verify Hide In Online Order is Enabled
And I Enable Eighty Six List Toggle 
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
Given I Search and Edit the Menu Item
Then I Verify Eighty Six List is Enabled
And I Enable Hide Menu Item Picture In POS Toggle 
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
Given I Search and Edit the Menu Item
Then I Verify Hide Menu Item Picture In POS is Enabled
And I Disable Hide In Kiosk Toggle 
And I Disable EBT Menu Item Toggle
And I Disable Hide In POS Toggle 
And I Disable Hide In Online Order Toggle 
And I Disable Eighty Six List Toggle
And I Disable Hide Menu Item Picture In POS Toggle  
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
Given I Search and Edit the Menu Item
Then I Verify Hide In Kiosk is Disabled
Then I Verify EBT Menu Item is Disabled
Then I Verify Hide In POS is Disabled
Then I Verify Hide In Online Order is Disabled
Then I Verify Eighty Six List is Disabled
Then I Verify Hide Menu Item Picture In POS is Disabled
And I Click the Backward button



Scenario: Update the Menu Item to Menu Item With Serving Size with Days of Week
Given I Search and Edit the Menu Item
Then Check the Menu Type is Selected as Menu Item
Then I Verify the Selected Availability as Always
And I Enter the Menu Item Name
And I Select the Menu Type as Menu Item With Serving Size
And I Select Cost Type as Fixed
And I Select Serving Size for Menu Item With Serving Size in Set Price for Fixed
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
And I Select the Kitchen Printers
And I Select the Label Printers
And I Select the Restrict Printers
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not


Scenario: Update the Menu Item to Open Item with Days of Month
Given I Search and Edit the Menu Item
Then Check the Menu Type is Selected as Menu Item With Serving Size
Then Check the Cost Type is Selected as Fixed
Then I Verify the Selected Availability as Days of Week
And I Enter the Menu Item Name
And I Select the Menu Type as Open Item
And I Select Cost Type as Variable
And I Select Serving Size in Set Price for Variable
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
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not

Scenario: Update the Menu Item to Scale Item with Date Range
Given I Search and Edit the Menu Item
Then Check the Menu Type is Selected as Open Item
Then Check the Cost Type is Selected as Variable
Then I Verify the Selected Availability as Days of Month
And I Enter the Menu Item Name
And I Select the Menu Type as Scale Item
And I Select the Tare Group
And I Select Cost Type as Variable
And I Select Serving Size in Set Price for Variable
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
Then Verfiy whether Menu Item Updated or Not


Scenario: Update the Menu Item to Combo Item with Specific Date
Given I Search and Edit the Menu Item
Then Check the Menu Type is Selected as Scale Item
Then I Verify the Selected Availability as Date Range
And I Enter the Menu Item Name
And I Select the Menu Type as Combo Item
And I Select the Menu Item in Combo Item
And I Select the Serving Size in Combo Item
And I Enter the S.No in Combo Item
And I Enter the Unit Price in Combo Item
And I Select Cost Type as Variable
And I Select Serving Size in Set Price for Variable
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
Then Verfiy whether Menu Item Updated or Not

Scenario: Update the Menu Item to Menu Item with Date Range with Time
Given I Search and Edit the Menu Item
Then Check the Menu Type is Selected as Combo Item
Then I Verify the Selected Availability as Specific Date
And I Enter the Menu Item Name
And I Select the Menu Type as Menu Item
And I Select Cost Type as Variable
And I Select Serving Size in Set Price for Variable
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
Then Verfiy whether Menu Item Updated or Not

@EditMenuItem
Scenario: Update the Menu Item with Always
Given I Search and Edit the Menu Item
Then Check the Menu Type is Selected as Menu Item
Then I Verify the Selected Availability as Date Range with Time
And I Enter the Menu Item Name
And I Select the Availability as Always
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not

@EditMenuItem
Scenario: Verify Updated Menu Item Availability is Selected as Always
Given I Search and Edit the Menu Item
Then I Verify the Selected Availability as Always
And I Click the Backward button

@EditMenuItem
Scenario: Searching with Special Characters
Then Enter Special Characters in Search field and Verify

@EditMenuItem
Scenario: Verify whether able to Inactivate the Menu Item Clicking Cancel/No button
Given I Search the Menu Item and Click the Delete button
  And I Click the Cancel button in Pop Up
Then Verify the Cancelled Menu Item Deleted/Inactivated or not

@EditMenuItem
Scenario: Verify whether Able to Inactivate the Menu Item Clicking Delete/Yes button
Given I Search the Menu Item and Click the Delete button
And I Click the Delete button
Then I Verifying the Menu Item Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Menu Item

@EditMenuItem
Scenario: Verify whether able to Activate the Menu Item Clicking Cancel/No button
Given I Search the Menu Item and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Menu Item is Activated or not

@EditMenuItem
Scenario: Verify whether Able to Activate the Menu Item Clicking Activate/Yes button
Given I Search the Menu Item and Click the Active button
And I Click the Activate button
Then I Verifying the Menu Item Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Menu Item

@EditMenuItem
Scenario: Create a Duplicate Menu Item
Given I Click the New Menu Item button
And I Enter the Menu Item Name
And I Enter the Secondary Name
And I Enter the PLU Code
And I Enter the Item Preparation Time
And I Check the Evertec Options is Displayed and Select Evertec
And I Select the Level Type in General as Category
And I Selecting the Categories
And I Select the Menu Type as Menu Item
And I Enable Conversational UI at POS Toggle
And I Disable Price Level Settings Toggle
And I Select Serving Size in Set Price for Variable
And I Select the Taxes
And I Select the Availability as Always
And I Select the Kitchen Printers
And I Select the Label Printers
And I Select the Restrict Printers
And I Click the Save and Publish button
Then Verfiy whether Duplicate Menu Item Saved or Not

@EditMenuItem
Scenario: Verify we able to Delete the Combo Menu Item
Given I Search the Combo Menu Item and Click the Delete button
And I Click the Delete button
Then I Verifying the Combo Menu Item is Deleted or not

@EditMenuItem
Scenario: Verify we able to Create the New Menu Item with the COPY option 
Given I Search the Menu Item and Click the Copy button
#And I Verfiy Is Category/SubCategory selected or not
#And I Verify Toggles Enabled as per the copied Menu Item 
#And I Verify Serving size and Price as per copied Menu Item
Then Verify the New Menu Item header
And I Click the Backward button

@EditMenuItem
Scenario: Verify we able to Update the Price to Include Modifiers Price
Given I Search and Edit the Menu Item
And I Select Included Modifiers Tab
And I Enable the Override Prefix Upcharges Toggle
And I Enter the Include Modifier Prefix Price in Decimal
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
And I Search and Edit the Menu Item
And I Select Included Modifiers Tab
Then Check the Include Modifier Prefix Price in Decimal
And I Click the Backward button

Scenario: Verify whether the Added Parent Modifiers is Available after Reopen in Mandatory Modifiers
Given I Search and Edit the Menu Item
And I Select Mandatory Modifier Groups Tab
And I Click the Add Mandatory Modifier Group button
And I Select Modifier Group in Mandatory Modifier Group
And I Enter the Display Order
And I Select the Parent Modifiers in Modifier Group
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
And I Search and Edit the Menu Item
Then Check the Selected Parent Modifiers in Mandatory Modifier Group is Available or Not

Scenario: Verify Applicaiton is displaying the Mandatory Modifiers Tired Price with decimals after Updating it
Given I Search and Edit the Menu Item
And I Select Mandatory Modifier Groups Tab
#And I Click the Add Mandatory Modifier Group button
And I Select Modifier Group in Mandatory Modifier Group
#And I Enter the Display Order
And I Enable Set Tiered Price Toggle 
And I Click the Add Set Tiered Price button
And I Select the Serving Size
#And I Enter the Sequence
And I Enter the Quantity in Set Tiered Price
And I Select the Set Price For
And I Enter Set Price in Decimal in Set Tiered Price
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
And I Search and Edit the Menu Item
Then Check Updated Set Tiered Price is Showing Correctly or not

Scenario: Verify Application shows the Updated Price Levels after Updating it
Given I Search and Edit the Menu Item With Serving Size
And I Select Cost Type as Fixed
And I Select Serving Size in Set Price for Fixed
And I Click the Add Serving Size Level
And I Select Second Serving Size in Set Price for Fixed
And I Enable Price Level Settings Toggle
And I Enter the Second Set Price Level for Fixed
And I Click the Update and Publish button
Then Verfiy whether Menu Item Updated or Not
And I Search and Edit the Menu Item With Serving Size
Then Check Updated Price Level Settings Values in Serving Size Levels are Showing Correctly or not


