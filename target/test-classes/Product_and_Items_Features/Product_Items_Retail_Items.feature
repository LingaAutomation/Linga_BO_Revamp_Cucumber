@Product/Items 
@RetailItems
@Product/Items01
Feature: Product and Items - Retail Items
  I am Verify the Product/Items-RetailItems module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Product/Items - Retail Items page
Given Open the Product/Items - Retail Item home page BaseURL and StoreID
And Click RETAIL ITEMS menu

@RetailTest1
Scenario: Verfiy whether the Product/Items Item Header is Displayed 
Given Verifying the Product/Items Header page
And Close online Help chat box

@RetailTest2
  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

@RetailTest3
  Scenario: Verify whether Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Decending Order

@RetailTest4
  Scenario: Verify the New Retail Item Page header
    Given Click the New Retail Item button
    Then Verify the New Retail Item header
    And I Click the Backward button

@RetailTest5
  Scenario: Verify whether we able to Create the New Retail Item without entering Name Fields
    And Click the New Retail Item button
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
   	And I Select Unit of Measure
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Verify Basic details title to scroll up page
    And I Select Inventory Details Tab
    #And I Select the Inventory Level as Category
    #And I Select the Inventory Category
    #And I Enter the Brand
    #And I Enter the Inventory Count
    #And I Select the Inventory Unit
    #And I Select the Vendor
    #And I Select the Tracking
    #And I Disable the Calculate COGS On Cost Price Toggle
    #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest6
 Scenario: Verify whether we able to Create the New Retail Item without selecting POS Level
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    #And I Select the POS Level as Category
    And I Select the Taxes from RetailItems
    #And I Select Unit of Measure
    #And I Enter the SKU Code
    #And I Enter the Selling Price
    #And I Select Inventory Details Tab
    #And I Select the Inventory Level as Category
    #And I Select the Inventory Category
    #And I Enter the Brand
    #And I Enter the Inventory Count
    #And I Select the Inventory Unit
    #And I Select the Vendor
    #And I Select the Tracking
    #And I Disable the Calculate COGS On Cost Price Toggle
    #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest7
  Scenario: Verify whether we able to Create the New Retail Item without selecting POS Category
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the Taxes from RetailItems
    #And I Select Unit of Measure
    #And I Enter the SKU Code
    #And I Enter the Selling Price
    And I Select Inventory Details Tab
    #And I Select the Inventory Level as Category
    #And I Select the Inventory Category
    #And I Enter the Brand
    #And I Enter the Inventory Count
    #And I Select the Inventory Unit
    #And I Select the Vendor
    #And I Select the Tracking
    #And I Disable the Calculate COGS On Cost Price Toggle
    #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest8
  Scenario: Verify whether we able to Create the New Retail Item without selecting POS Sub Category
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as SubCategory
    #And I Select the POS Category
    And I Select the Taxes from RetailItems
    #And I Select Unit of Measure
    #And I Enter the SKU Code
    #And I Enter the Selling Price
    And I Select Inventory Details Tab
    #And I Select the Inventory Level as Category
    #And I Select the Inventory Category
    #And I Enter the Brand
    #And I Enter the Inventory Count
    #And I Select the Inventory Unit
    #And I Select the Vendor
    #And I Select the Tracking
    #And I Disable the Calculate COGS On Cost Price Toggle
    #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest9
  Scenario: Verify whether we able to Create the New Retail Item without Selcting Unit of Measure
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    #And I Select the Inventory Level as Category
    #And I Select the Inventory Category
    #And I Enter the Brand
    #And I Enter the Inventory Count
    #And I Select the Inventory Unit
    #And I Select the Vendor
    #And I Select the Tracking
    #And I Disable the Calculate COGS On Cost Price Toggle
    #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest10
  Scenario: Verify whether we able to Create the New Retail Item without entering SKU Code
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    #And I Select the Inventory Level as Category
    #And I Select the Inventory Category
    #And I Enter the Brand
    #And I Enter the Inventory Count
    #And I Select the Inventory Unit
    #And I Select the Vendor
    #And I Select the Tracking
    #And I Disable the Calculate COGS On Cost Price Toggle
    #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest11
  Scenario: Verify whether we able to Create the New Retail Item without entering Selling Price
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Select Inventory Details Tab
    #And I Select the Inventory Level as Category
    #And I Select the Inventory Category
    #And I Enter the Brand
    #And I Enter the Inventory Count
    #And I Select the Inventory Unit
    #And I Select the Vendor
    #And I Select the Tracking
    #And I Disable the Calculate COGS On Cost Price Toggle
    #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

	@RetailTest12
  Scenario: Verify whether we able to Create the New Retail Item without selecting Inventory Level
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Verify Basic details title to scroll up page
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Category
    And I Enter the Inventory Count
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Disable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button
    
@RetailTest13
  Scenario: Verify whether we able to Create the New Retail Item without selecting Inventory Level Category
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Level as Category
    And I Enter the Inventory Count
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Disable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
   # And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest14
  Scenario: Verify whether we able to Create the New Retail Item by Selecting Inventory SubCategory without selecting Category
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Level as SubCategory
    And I Select the Inventory SubCategory
    Then Check No Results Match Info Message is Displayed
    And I Enter the Inventory Count
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Disable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest15
  Scenario: Verify whether we able to Create the New Retail Item with selecting Inventory Category and without selecting Inventory SubCategory
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Level as SubCategory
    And I Select the Inventory Category
    And I Enter the Inventory Count
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Disable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest16
  Scenario: Verify whether we able to Create the New Retail Item without selecting Inventory Unit
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Level as Category
    And I Select the Inventory Category
    And I Enter the Inventory Count
    #And I Select the Tracking
    And I Select the Vendor
    And I Disable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
   # And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest17
  Scenario: Verify whether we able to Create the New Retail Item without selecting Vendor
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Level as Category
    And I Select the Inventory Category
    And I Enter the Inventory Count
    #And I Select the Tracking
    And I Disable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest18
  Scenario: Verify whether we able to Create the New Retail Item without selecting Primary Storage
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Level as Category
    And I Select the Inventory Category
    And I Enter the Inventory Count
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Disable the Calculate COGS On Cost Price Toggle
   #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest19
  Scenario: Verify whether we able to Create a Tax in Retail Item
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Disable the Inherit Tax From Category Settings Toggle
    And I Click Add Tax button in New Retail item page
    When Verify the New Taxes Header
    And I Enter the Tax Name in Menu Item
    And I Select the Tax Type as Amount
    And I Enter the Amount
    And I Click the tax Save button from Retailitem
    Then Verify whether the Tax is Saved or not
     #And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Selling Price
    And I Select Inventory Details Tab
    #And I Select the Inventory Level as Category
    #And I Select the Inventory Category
    #And I Enter the Brand
    #And I Enter the Inventory Count
    #And I Select the Inventory Unit
    #And I Select the Vendor
    #And I Select the Tracking
    #And I Disable the Calculate COGS On Cost Price Toggle
    #And I Select the Primary Storage
    #And I Select the Secondary Storage
    Then Check the Save button is Disabled
    And I Click the Backward button

@RetailTest20
  Scenario: Verify whether we able to Create the New Retail Item
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Supplier Cost
    And I Enter the Markup Percentage
    And I Enter the Selling Price
    And I Enable Hide In Kiosk Toggle
    And I Enable Hide In POS Toggle
    And I Select the Availability as Always
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Level as Category
    And I Select the Inventory Category
    And I Enter the Par Level
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Enable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    #And I Select the Secondary Storage
    And I Click Save button #Retail Item saved successfully
    Then Verify whether Retail Item Saved or not

@RetailTest21
  Scenario: Verify whether we able to Create the New Retail Item With Link Child Items
    And Click the New Retail Item button
    And I Enter the Retail Item Name for Child
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Supplier Cost
    And I Enter the Markup Percentage
    And I Enter the Selling Price
    And I Enable Hide In Kiosk Toggle
    And I Enable Hide In POS Toggle
    And I Select the Availability as Always
    And I Select Inventory Details Tab
    And I Enter the Brand
    And I Select the Inventory Level as Category
    And I Select the Inventory Category
    And I Enter the Par Level
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Enable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    #And I Select the Secondary Storage
    And I Enter the Current Inventory in Inventory Level
    And I Enter the Par Level in Current Inventory Level
    And I Click the Save & Next button
    Then Check Please Save Retail Item Before Moving To Child Item Info is Displayed #(Please Save Retail Item Before Moving To Child Item)
    And I Click the Cancel button from SAVENEXTConfirmationAlertMsg
    And I Click Next button
    And I Click the Save & Next button
    Then Check Please Save Retail Item Before Moving To Child Item Info is Displayed
    And I Click Save button from SAVENEXTConfirmationAlertMsg
    And I Click Link Existing Item button
    And I Select Existing Item
    Then Verify the Update Child header
    And I Click the Cancel button
    Then Verify Child Item Linked with Retail Item or not #Retail item linked successfully
    Then Check the Save button is Disabled
    And I Click the Backward button 
    Then Verify whether the Retail Item is Updated or not

@RetailTest22
  	Scenario: Verify able to search the Retail Item by entering 3 letters of Retail Item Name
    And I Verify Searching the Item when entering three letters for Retail Item
    

@RetailTest23
  Scenario: Update Retail Item without Entering Retail Item name
  	Given I Search and Edit the Retail Item
    When I Clear the Name
    Then Check the Update button is Disabled
    And I Click the Backward button

@RetailTest24
  Scenario: Verify whether able to create New Inventory Category In Inventory Category
    Given I Search and Edit the Retail Item
    And I Select Inventory Details Tab
    And I Select the Inventory Category drop down
    And I Click New Inventory Category
    And I Enter the New Inventory Category Name
    And I Enter the Code
    And I Click New Inventory Category Save button
    Then I Verify the New Inventory Category saved or not
       And I Click the Backward button

@RetailTest25
  Scenario: Verify whether able to create New Vendor In Vendor
    Given I Search and Edit the Retail Item
    And I Select Inventory Details Tab
   # And I Select the Vendor
    And I Select the Inventory New Vendor
    And I Enter the New Vendor Name
    And I Enter the New Vendor Phone Number
    And I Enter the New Vendor Email
    And I Click the Inventory new vendor Save button
    Then I Verify the New Vendor saved or not
       And I Click the Backward button

@RetailTest26
Scenario: Verify whether we able to Create the New Retail Item with Visiblity toggles disabled
    And Click the New Retail Item button
    And I Enter the Retail Item Name for Visibility toggle
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Supplier Cost
    And I Enter the Markup Percentage
    And I Enter the Selling Price
    And I Disable Hide In Kiosk Toggle
    And I Disable Hide In POS Toggle
    And I Disable EBT Retail Item Toggle
    #And I Disable Hide In Online Order Toggle
    And I Select the Availability as Always
    And I Select Inventory Details Tab
    And I Select the Inventory Level as Category
    And I Select the Inventory Category
    And I Enter the Brand
    And I Enter the Par Level
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Enable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    #And I Select the Secondary Storage
    And I Click Save button #Retail Item saved successfully
    Then Verify whether Retail Item Saved or not

@RetailTest27
  Scenario: Verify we able to Update Retail Item with Visibility
    Given I Search and Edit the Retail Item with Visibility toggles disabled
    Then I Verify Hide In Kiosk is Disabled
    Then I Verify EBT Retail Item is Disabled
    Then I Verify Hide In POS is Disabled
    Then I Verify Hide In Online Order is Disabled
    And I Enable Hide In Kiosk Toggle
    And I Click the Update button
    Then Verify whether the Retail Item is Updated or not
    Given I Search and Edit the Retail Item
    Then I Verify Hide In Kiosk is Enabled
    And I Enable EBT Retail Item Toggle
    And I Click the Update button
    Then Verify whether the Retail Item is Updated or not
    Given I Search and Edit the Retail Item
    Then I Verify EBT Retail Item is Enabled
    And I Enable Hide In POS Toggle
    And I Click the Update button
    Then Verify whether the Retail Item is Updated or not
    Given I Search and Edit the Retail Item
    Then I Verify Hide In POS is Enabled
    And I Enable Hide In Online Order Toggle
    And I Click the Update button
    Then Verify whether the Retail Item is Updated or not
    Given I Search and Edit the Retail Item
    Then I Verify Hide In Online Order is Enabled
    Given I Search and Edit the Retail Item
    Then I Verify Hide In Kiosk is Enabled
    Then I Verify EBT Retail Item is Enabled
    Then I Verify Hide In POS is Enabled
    Then I Verify Hide In Online Order is Enabled
    And I Click the Backward button
  
  @RetailTest28  
    Scenario: Update the Retail Item after Unlinking the Child
    Given I Search and Edit the Retail Item with Child
    And I Select the Child Tab
    And I Select Child and Click Unlink button
   Then Verify Child Item Unlinked with Retail Item or not
   And I Click the Backward button
   
  @RetailTest29
     Scenario: Update the Retail Item after Deleting the Child
    Given I Search and Edit the Retail Item with Child
    And I Select the Child Tab
    And I Select Child and Click Delete button
     And I Click the Delete button
   Then Verify Child Item Deleted with Retail Item or not
   And I Click the Backward button
    
  @RetailTest30  
  Scenario: Update the Retail Item with Days of Week
    Given I Search and Edit the Retail Item
    And I Select the Availability as Days of Week
    Then Check the Retail Item Update button is Disabled
    And I Selecting the Days
    Then Check the Retail Item Update button is Enabled
    And I Enable the Restriction Time Toggle
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Restriction Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Restriction Time
    Then Check the Retail Item Update button is Enabled
    And I Enable the Available Time Toggle
    And I Click the Add New Time button
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Available Time Same as Restriction Time
    Then Verify the There is overlap in restriction & available time Error Mesasage
    And I Select the Start Time in Available Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Available Time Same as Restriction Time
    Then Verify the Start time should be less than end time Error Mesasage
    And I Select the End Time in Available Time Below the Same as Restriction Time
    Then Verify the There is overlap in restriction & available time Error Mesasage
    And I Select the End Time in Available Time
     And I Click the Update button
    Then Verfiy whether Retail Item Updated or Not

  @RetailTest31
  Scenario: Update the Retail Item t Days of Month
    Given I Search and Edit the Retail Item
    And I Select the Availability as Days of Month
    Then Check the Retail Item Update button is Disabled
    And I Selecting the Days Of Months
    Then Check the Retail Item Update button is Enabled
    And I Enable Avaiable Months Toggle
    Then Check the Retail Item Update button is Disabled
    And I Selecting the Available Months
    Then Check the Retail Item Update button is Enabled
    And I Enable the Restriction Months Toggle
    Then Check the Retail Item Update button is Disabled
    And I Selecting the Restriction Months
    Then Check the Retail Item Update button is Enabled
    And I Enable the Restriction Time Toggle
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Restriction Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Restriction Time
    Then Check the Retail Item Update button is Enabled
    And I Enable the Available Time Toggle
    And I Click the Add New Time button
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Available Time Same as Restriction Time
    Then Verify the There is overlap in restriction & available time Error Mesasage
    And I Select the Start Time in Available Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Available Time Same as Restriction Time
    Then Verify the There is overlap in restriction & available time Error Mesasage
    And I Select the End Time in Available Time
    And I Click the Update button
    Then Verfiy whether Retail Item Updated or Not

  @RetailTest32
  Scenario: Update the Retail  Date Range
    Given I Search and Edit the Retail Item
    And I Select the Availability as Date Range
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Date
    Then Check the Retail Item Update button is Disabled
    And I Select the End Date
    Then Check the Retail Item Update button is Enabled
    And I Enable the Available Days Toggle
    Then Check the Retail Item Update button is Disabled
    And I Selecting the Available Days
    Then Check the Retail Item Update button is Enabled
    And I Enable Restriction Days Toggle
    Then Check the Retail Item Update button is Disabled
    And I Selecting the Restriction Days
    Then Check the Retail Item Update button is Enabled
    And I Enable the Restriction Time Toggle
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Restriction Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Restriction Time
    Then Check the Retail Item Update button is Enabled
    And I Enable the Available Time Toggle
    And I Click the Add New Time button
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Available Time Same as Restriction Time
    Then Verify the There is overlap in restriction & available time Error Mesasage
    And I Select the Start Time in Available Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Available Time Same as Restriction Time
    Then Verify the There is overlap in restriction & available time Error Mesasage
    And I Select the End Time in Available Time
    And I Click the Update button
    Then Verfiy whether Retail Item Updated or Not

  @RetailTest33
  Scenario: Update the Retail Item with Specific Date
    Given I Search and Edit the Retail Item
    And I Select the Availability as Specific Date
    Then Check the Retail Item Update button is Disabled
    And I Select the Specific Date
    Then Check the Retail Item Update button is Enabled
    And I Enable the Restriction Time Toggle
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Restriction Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Restriction Time
    Then Check the Retail Item Update button is Enabled
    And I Enable the Available Time Toggle
    And I Click the Add New Time button
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Available Time Same as Restriction Time
    Then Verify the There is overlap in restriction & available time Error Mesasage
    And I Select the Start Time in Available Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Available Time Same as Restriction Time
    Then Verify the There is overlap in restriction & available time Error Mesasage
    And I Select the End Time in Available Time
    And I Click the Update button
    Then Verfiy whether Retail Item Updated or Not

  @RetailTest34
  Scenario: Update the Retail Item to Retail Item with Date Range with Time
    Given I Search and Edit the Retail Item
    And I Select the Availability as Date Range with Time
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Date
    Then Check the Retail Item Update button is Disabled
    And I Select the End Date
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Date Range Available Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Date Range Available Time
    Then Check the Retail Item Update button is Enabled
    And I Enable the Available Days Toggle
    Then Check the Retail Item Update button is Disabled
    And I Selecting the Available Days
    Then Check the Retail Item Update button is Enabled
    And I Enable Restriction Days Toggle
    Then Check the Retail Item Update button is Disabled
    And I Selecting the Restriction Days
    Then Check the Retail Item Update button is Enabled
    And I Enable the Restriction Time Toggle
    Then Check the Retail Item Update button is Disabled
    And I Select the Start Time in Restriction Time
    Then Check the Retail Item Update button is Disabled
    And I Select the End Time in Restriction Time
    Then Check the Retail Item Update button is Enabled
    And I Click the Update button
    Then Verfiy whether Retail Item Updated or Not

  @RetailTest35
  Scenario: Update the Retail Item with Always
    Given I Search and Edit the Retail Item
    Then I Verify the Selected Availability as Date Range with Time
    And I Select the Availability as Always
    And I Click the Update button
    Then Verfiy whether Retail Item Updated or Not

  @RetailTest36
  Scenario: Verify Updated Retail Item Availability is Selected as Always
    Given I Search and Edit the Retail Item
    Then I Verify the Selected Availability as Always
    And I Click the Backward button

  @RetailTest37
Scenario: Verify whether we able to Create the New Retail Item Name with Special characters
    And Click the New Retail Item button
    And I Enter the Retail Item Name for Special characters
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Supplier Cost
    And I Enter the Markup Percentage
    And I Enter the Selling Price
    And I Disable Hide In Kiosk Toggle
    And I Enable Hide In POS Toggle
    And I Disable EBT Retail Item Toggle
    And I Enable Hide In Online Order Toggle
    And I Select the Availability as Always
    And I Select Inventory Details Tab
    And I Select the Inventory Level as Category
    And I Select the Inventory Category
    And I Enter the Brand
    And I Enter the Par Level
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Enable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    #And I Select the Secondary Storage
    And I Click the Save button
    Then Verify whether Retail Item Saved or not

  @RetailTest38
  Scenario: Searching with Special Characters
    Then Enter Special Characters in Search field and Verify for Retail Item

  @RetailTest39
  Scenario: Verify whether able to Inactivate the Retail Item Clicking Cancel/No button
    Given I Search the Retail Item and Click the Delete button
    And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Retail Item Deleted/Inactivated or not

  @RetailTest40
  Scenario: Verify whether Able to Inactivate the Retail Item Clicking Delete/Yes button
    Given I Search the Retail Item and Click the Delete button
    And I Click the Delete button
    Then I Verifying the Retail Item Deleted or not
    And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Retail Item

  @RetailTest41
  Scenario: Verify whether able to Activate the Retail Item Clicking Cancel/No button
    And I Click Retail Items Active button 
    And I Search the Retail Item and Click the Click to Activate button
    And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Retail Item is Activated or not

  @RetailTest42
  Scenario: Verify whether Able to Activate the Retail Item Clicking Activate/Yes button
    And I Click Retail Items Active button 
    And I Search the Retail Item and Click the Click to Activate button
    And I Click the Activate button
    Then I Verifying the Retail Item Activated or not
    And I Click the Active button to navigate Activated screen to Verify Activated Retail Item

  @RetailTest43
  Scenario: Create a Duplicate Retail Item
    And Click the New Retail Item button
    And I Enter the Retail Item Name
    And I Enter the Secondary Name
    And I Select the POS Level as Category
    And I Select the POS Category
    And I Select the Taxes from RetailItems
    And I Select Unit of Measure
    And I Enter the SKU Code
    And I Enter the Supplier Cost
    And I Enter the Markup Percentage
    And I Enter the Selling Price
    And I Enable Hide In Kiosk Toggle
    And I Enable Hide In POS Toggle
    And I Select the Availability as Always
    And I Select Inventory Details Tab
    And I Select the Inventory Level as Category
    And I Select the Inventory Category
    And I Enter the Brand
    And I Enter the Par Level
    And I Select the Inventory Unit
    And I Select the Vendor
    #And I Select the Tracking
    And I Enable the Calculate COGS On Cost Price Toggle
    And I Select the Primary Storage
    And I Select the Secondary Storage
    And I Click the Save button
    Then Verify whether Retail Item Saved or not

  @RetailTest44
  Scenario: Verify we able to Delete the Retail Item
    Given I Search Retail Item with Child and Click the Delete button
    And I Click the Delete button
    Then I Verifying Retail Item is Deleted or not

  @RetailTest45
  Scenario: Verify we able to Create the New  Item with the COPY option
    Given I Search the Retail Item and Click the Copy button
    And I Verfiy Is POS Category/SubCategory selected or not
    And I Verify Toggles Enabled as per the copied Retail Item
    Then Verify the New Retail Item header
    And I Click the Backward button
    