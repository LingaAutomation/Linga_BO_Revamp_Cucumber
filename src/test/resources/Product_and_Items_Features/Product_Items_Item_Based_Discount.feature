@Product/Items
@Item_Based_Discount
Feature: Product and Items - Item Based Discount
I am verify the Product/Items-Item Based Discount module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd

Background: Opening the Product/Items - Discounts page
Given Open the Discounts home page BaseURL and StoreID

Scenario: Verify whether the Discounts Header is Displayed
Given Verifying the Discounts Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify whether Item Based field is selected as default or not 
#Given Open the Discounts home page BaseURL and StoreID
Then Verify whether Item Based field is selected as default or not

Scenario: Verify the Item Based Discount Page header
Given Click the New Discount button
When Verify the Item Based Header
And I Click the Backward button

Scenario: Verify whether we able to create the Item Based Discount without Entering Name
Given Click the New Discount button
#And I Click the Save button without Entering Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Item Based Discount Name above the limit
And I Enter the Item Based Discount Name Exceeding the limit

Scenario: Verify whether we can able to Save the Item Based Discount only by Entering Priority
Given Click the New Discount button
#And I Enter the Item Based Discount Name
And I Enter the Priority
#And I Click the Save and Publish button 
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Save Item Based Discount without Entering Priority
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether user can able to create a Item Based Discount with Priority as 0
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority as Zero
Then Verify Enter Valid Priority Error is displayed
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether user can able to create a Item Based Discount with Priority as with Decimal values
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority as Decimal value
Then Verify Enter Valid Priority Error is displayed
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
And I Click the Save and Publish button 
Then Verify whether the Item Based Discount is Saved with Priority as Decimal or not
And I Click the Backward button

Scenario: Verify whether user can able to create a Item Based Discount with Quantity as 0
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity as Zero
Then Check Enter Valid Quantity Error is displayed
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether the Before Tax/After Tax is displayed in Apply field dropdown
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Click Apply Field
Then Verify whether the Before Tax and After Tax is displayed
And I Click the Backward button


Scenario: Verify able to Save without Selecting Apply
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button


Scenario: Verify able to Save without Selecting Categories in Level Type
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify able to Save by Entering Percentage above 100
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
Then Check Discount Rate Type is Selected Default as Percentage
And I Select the Discount Rate as Percentage
And I Enter the Percentage above the percentage limit
Then Check Enter Valid Percentage Error is Displayed
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button


Scenario: Verify whether we able to Save the Item Based Discount with Single letter
Given Click the New Discount button
And I Enter the Item Based Discount Name with Single letter
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
And I Click the Save and Publish button 
Then Verify whether we able to Save the Item Based Discount with Single letter

#Scenario: Verify whether Selected Category is removed or not
#Given Click the New Discount button
#And I Enter the Item Based Discount Name
#And I Enter the Priority
#And I Enter the Quantity
#And I Select Before Tax/ After Tax
#And I Select the Multiple Category
#And I Select Sub Category level
#Then Verify whether Selected Category is removed or not
#And I Click the Backward button

Scenario: Verify Employee Discount is enabled or not
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enable Employee Discount Toggle
Then Check Coupon Only Toggle not Displayed
Then Check Auto Discount Toggle not Displayed
Then Check Attach Customer Toggle not Displayed
Then Check the Save and Publish button is Enabled
And I Disable Employee Discount Toggle
Then Check Coupon Only Toggle Displayed
Then Check Auto Discount Toggle Displayed
Then Check Attach Customer Toggle Displayed
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify whether Coupon Only field is displayed after enabling
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Multiple Category
And I Select Promo Discount Type
And I Enable Coupon Only Toggle
Then Check the Save and Publish button is Disabled
And I Enter the Coupon Code
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify whether Special Characters can be entered in Coupon Only Field
Given Click the New Discount button
And I Enable Coupon Only Toggle
Then Verify Special Characters wont allow Disclaimer is Displayed or Not
And I Enter Special Characters in Coupon Code
Then Check the Save and Publish button is Disabled
And I Click the Backward button

#Scenario: Verify Save and Publish button is enabled after enabling Auto Discount and Attach Customer Toggles
#Given Click the New Discount button
#And I Enter the Item Based Discount Name
#And I Enter the Priority
#And I Enter the Quantity
#And I Select Before Tax/ After Tax
#And I Select the Multiple Category
#And I Select Promo Discount Type
#And I Enable Auto Discount Toggle
#Then Check the Save and Publish button is enabled
#And I Enable Attach Customer Toggle
#Then Check the Save and Publish button is enabled

#Scenario: Verify Save and Publish button is enabled after selecting Membership plan
#Given Click the New Discount button
#And I Enter the Item Based Discount Name
#And I Enter the Priority
#And I Enter the Quantity
#And I Select Before Tax/ After Tax
#And I Select the Multiple Category
#And I Select Promo Discount Type
#And I Select Membership Plan
#Then Check the Save and Publish button is Enabled
#And I Click Save and Publish button

#Scenario: Verify Amount can able to Save as Discount Rate
#Given Click the New Discount button
#And I Enter the Item Based Discount Name
#And I Enter the Priority
#And I Enter the Quantity
#And I Select Before Tax/ After Tax
#And I Select the Multiple Category
#And I Select Promo Discount Type
#And I Select Amount as Discount Rate
#And I Enter Amount
#Then Check the Save and Publish button is Enabled
#And I Click the Save and Publish button
#Then Verify whether the Item Based Discount able to Save
#
#Scenario: Verify Set Price can able to Save as Discount Rate
#Given Click the New Discount button
#And I Enter the Item Based Discount Name
#And I Enter the Priority
#And I Enter the Quantity
#And I Select Before Tax/ After Tax
#And I Select the Multiple Category
#And I Select Promo Discount Type
#And I Select Set Price as Discount Rate
#And I Enter Amount
#Then Check the Save and Publish button is Enabled
#And I Click the Save and Publish button
#Then Verify whether the Item Based Discount able to Save
#
#Scenario: Verify Free Item can able to Save as Discount Rate
#Given Click the New Discount button
#And I Enter the Item Based Discount Name
#And I Enter the Priority
#And I Enter the Quantity
#And I Select Before Tax/ After Tax
#And I Select the Multiple Category
#And I Select Promo Discount Type
#And I Select Free Item as Discount Rate
#And I Select Menu Item
#And I Select Serving Size
#And I Select Quantity
#And I Enter Price
#Then Check the Save and Publish button is Enabled
#And I Click the Save and Publish button
#Then Verify whether the Item Based Discount able to Save
#
#Scenario: Verify Free Item can able to Save as Discount Rate without adding Free Item
#Given Click the New Discount button
#And I Enter the Item Based Discount Name
#And I Enter the Priority
#And I Enter the Quantity
#And I Select Before Tax/ After Tax
#And I Select the Multiple Category
#And I Select Promo Discount Type
#And I Select Free Item as Discount Rate
#And I Select Menu Item
#And I Select Serving Size
#And I Select Quantity
#And I Enter Price
#And I Delete the Free Item
#Then Check the Save and Publish button is Disabled

Scenario: Create and Save New Item Based with Mandatory Fields
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Enable Coupon Code Toggle
And I Enter the Coupon Code
And I Enable Auto Discount Toggle
And I Enable Attach Customer Toggle
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
And I Click the Save and Publish button
Then Verify whether the Item Based Discount is Saved or not

#Scenario: Verify whether Serving Sizes are populated automatically as per the selected level
#Given Click the New Discount button
#And I Enter the Item Based Discount Name
#And I Enter the Priority
#And I Enter the Quantity
#And I Select Before Tax/ After Tax
#And I Select Category level
#And I Select Category
#Then Verify Promo is Selected as Default under Discount Type
#And I Enable Serving Sizes in Category Toggle
#Then Verify whether Serving Sizes are populated automatically for the Selected Category
#And I Select Sub Category level
#And I Select Sub Category
#And I Enable Serving Sizes in Sub Category Toggle
#Then Verify whether Serving Sizes are populated automatically for the Selected Sub Category
#And I Select Menu Item level
#And I Select Menu Item
#And I Enable Serving Sizes in Menu Items Toggle
#Then Verify whether Serving Sizes are populated automatically for the Selected Menu Items
#And I Click the Backward button

Scenario: Verify whether we can able to Cancel/Close the Item Based Discount Update screen
Given I Search and Edit the Item Based Discount
And I Click the Backward button
Then I Verify Item Discount Update screen Close or not

Scenario: Verify able to search the Item Based Discount by entering 3 letters of Item Based Discount Name
And I Verify Searching the Item when entering three letters


Scenario: Verify whether we able to Update the Item Based Discount without Entering Name
Given I Search and Edit the Item Based Discount
#And I Click the Save button without Entering Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Item Based Discount Name above the limit
Given I Search and Edit the Item Based Discount
And I Enter the Item Based Discount Name Exceeding the limit
And I Click the Backward button

Scenario: Update Item Based Discount without Entering Priority
Given I Search and Edit the Item Based Discount
And I Enter the Item Based Discount Name
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether user can able to Update a Item Based Discount with Priority as 0
Given I Search and Edit the Item Based Discount
And I Enter the Item Based Discount Name
And I Enter the Priority as Zero
Then Verify Enter Valid Priority Error is displayed
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether user can able to Update a Item Based Discount with Priority as with Decimal values
Given I Search and Edit the Item Based Discount
And I Enter the Item Based Discount Name
And I Enter the Priority as Decimal value
Then Verify Enter Valid Priority Error is displayed
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
And I Click the Save and Publish button
Then Verify whether the Item Based Discount is Saved with Priority as Decimal or not
And I Click the Backward button

Scenario: Verify whether user can able to Update a Item Based Discount with Quantity as 0
Given I Search and Edit the Item Based Discount
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity as Zero
Then Check Enter Valid Quantity Error is displayed
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify able to Update without Selecting Categories in Level Type
Given I Search and Edit the Item Based Discount
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify able to Update by Entering Percentage above 100
Given I Search and Edit the Item Based Discount
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
Then Check Discount Rate Type is Selected Default as Percentage 
And I Select the Discount Rate as Percentage
And I Enter the Percentage above the percentage limit
Then Check Enter Valid Percentage Error is Displayed
And I Select the Availability as Always
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify Update with Employee Discount is enabled or not
Given I Search and Edit the Item Based Discount
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enable Employee Discount Toggle
Then Check Coupon Only Toggle not Displayed
Then Check Auto Discount Toggle not Displayed
Then Check Attach Customer Toggle not Displayed
Then Check the Save and Publish button is Enabled
And I Disable Employee Discount Toggle
Then Check Coupon Only Toggle Displayed
Then Check Auto Discount Toggle Displayed
Then Check Attach Customer Toggle Displayed
Then Check the Save and Publish button is Enabled
And I Click the Backward button

#Scenario: Verify whether Special Characters can be entered in Coupon Only Field
#Given I Search and Edit the Item Based Discount
#And I Enable Coupon Only Toggle
#Then Verify Special Characters wont allow Disclaimer is Displayed or Not
#And I Enter Special Characters in Coupon Code
#Then Check the Save and Publish button is Disabled
#And I Click the Backward button

Scenario: Verify whether Include Additional Modifiers & Combine with Other Discount Toggle is enabled or not
Given I Search and Edit the Item Based Discount
Then Check Coupon Only Toggle is Enabled
Then Check Auto Discount Toggle is Enabled
Then Check Attach Customer Toggle is Enabled
Then Check Include Additional Modifiers Toggle is Disabled
And I Select the Discount Rate as Amount
Then Check Include Additional Modifiers Toggle is Grayed Out
And I Select the Discount Rate as Percentage
And I Enable Include Additional Modifiers Toggle
And I Enable Combine With Other Discount Toggle
Then Check the Update and Publish button is Enabled
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not

Scenario: Update Item Based Discount Type as Comp with Level Type SubCategory
Given I Search and Edit the Item Based Discount
Then Check Include Additional Modifiers Toggle is Enabled
Then Check Combine With Other Discount Toggle is Enabled
Then Check Discount Type Selected as Promo
Then Check Level Type Selected as Category
And I Disable Include Additional Modifiers Toggle
And I Disable Combine With Other Discount Toggle
And I Select the Discount Type as Comp
And I Select the Level Type as Sub-Category
Then Check the Update and Publish button is Disabled
And I Selecting the Sub-Categories
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not

Scenario: Update Item Based Discount Type as Donation with Level Type Menu Items
Given I Search and Edit the Item Based Discount
Then Check Discount Type Selected as Comp
Then Check Level Type Selected as Sub-Category
And I Select the Discount Type as Donation
And I Select the Level Type as Menu Item
Then Check the Update and Publish button is Disabled
And I Selecting the Menu Items
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not

Scenario: Update Item Based Discount Type as Loyalty Discount with Level Type Category
Given I Search and Edit the Item Based Discount
Then Check Discount Type Selected as Donation
Then Check Level Type Selected as Menu Item
And I Select the Discount Type as Loyalty Discount
Then Check Coupon Only Toggle is not Displayed
Then Check Auto Discount Toggle is not Displayed
And I Select the Level Type as Category
Then Check the Update and Publish button is Disabled
And I Selecting the Categories
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not

Scenario: Update Item Based Discount Type as Promo with Discount Rate as Amount with Availibility as Days of Week
Given I Search and Edit the Item Based Discount
Then Check Discount Type Selected as Loyalty Discount
Then Check Level Type Selected as Category
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as After Tax
And I Select the Discount Type as Promo
And I Select the Discount Rate as Amount
And I Enter the Amount
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
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not

Scenario: Update Item Based Discount Rate as Set Price with Availability Days of Month
Given I Search and Edit the Item Based Discount
Then Check Discount Type Selected as Promo
Then Check Discount Rate as Amount
Then I Verify the Selected Availability as Days of Week
Then Check Apply Selected as After Tax
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Discount Rate as Set Price
And I Enter the Amount
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
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not

Scenario: Update Item Based Discount Rate as Free Item with Availability Days of Range
Given I Search and Edit the Item Based Discount
Then Check Discount Rate as Set Price
Then I Verify the Selected Availability as Days of Month
Then Check Apply Selected as Before Tax
And I Select the Discount Rate as Free Item
Then Check the Update and Publish button is Disabled
And I Select the Menu Item for Free Item
Then Check the Update and Publish button is Disabled
And I Select the Serving Size for Free Item
And I Enter the Quantity for Free Item
And I Enter the Price for Free Item
And I Click the Add Free Item button
Then Check the Update and Publish button is Disabled
And I Remove the Free Items
Then Check the Update and Publish button is Enabled
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
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not

Scenario: Update Item Based Discount Rate as Percentage with Availability Specific Date
Given I Search and Edit the Item Based Discount
Then Check Discount Rate as Free Item
Then I Verify the Selected Availability as Date Range
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Discount Rate as Percentage
And I Enter the Percentage
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
And I Enable the Restrict POS Visibility Toggle
And I Select the Roles
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not


Scenario: Update Item Based Discount with Availability Date Range with Time
Given I Search and Edit the Item Based Discount
Then Check Discount Rate as Percentage
Then Check the Restrict POS Visibility Toggle is Enabled
Then I Verify the Selected Availability as Specific Date
And I Disable the Restrict POS Visibility Toggle
And I Select the Availability as Date Range with Time
Then Check the Update and Publish button is Disabled
And I Select the Start Date
Then Check the Update and Publish button is Disabled
And I Select the End Date
Then Check the Update and Publish button is Disabled
#And I Enable the Restriction Time Toggle
#Then Check the Update and Publish button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update and Publish button is Disabled
And I Select the End Time in Restriction Time
Then Check the Update and Publish button is Enabled
And I Enable Restriction Days Toggle
Then Check the Update and Publish button is Disabled
And I Selecting the Restriction Days
Then Check the Update and Publish button is Enabled
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not

Scenario: Update Item Based Discount with Availability Always
Given I Search and Edit the Item Based Discount
Then Check the Restrict POS Visibility Toggle is Disabled
Then I Verify the Selected Availability as Date Range with Time
And I Select the Availability as Always
And I Click Update and Publish button
Then Verify whether the Item Based Discount is Updated or not


Scenario: Verify whether able to Inactivate the Item Based Discount Clicking Cancel/No button
Given I Search the Item Based Discount and Click the Delete button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Item Based Discount Deleted or Inactivated or not

Scenario: Verify whether Able to Inactivate the Item Based Discount Clicking Delete/Yes button
Given I Search the Item Based Discount and Click the Delete button
And I Click the Delete button
Then I Verifying the Item Based Discount Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Item Based Discount

Scenario: Verify whether able to Activate the Item Based Discount Clicking Cancel/No button
Given I Search the Item Based Discount and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Item Based Discount is Activated or not

Scenario: Verify whether Able to Activate the Item Based Discount Clicking Activate/Yes button
Given I Search the Item Based Discount and Click the Active button
And I Click the Activate button
Then I Verifying the Item Based Discount Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Item Based Discount

Scenario: Updating Item Based Discount by Changing Priority
Given I Search and Edit the Item Based Discount
When I Enter the New Item Based Discount Name
And I Change the Priority
And I Click the Update and Publish button
Then Verify the Item Based Discount is Updated or not
#Then Check the Priority is Updated or Not

#Scenario: Searching with Special Charcters
#Then Enter Sepacial charcters in Search field and Verify

Scenario: Verify whether able to Creating Duplicate Item Based Discount
Given Click the New Discount button
And I Enter the Item Based Discount Name
And I Enter the Priority
And I Enter the Quantity
And I Select the Apply as Before Tax
And I Select the Level Type as Category
And I Selecting the Categories
And I Select the Discount Type as Promo
And I Select the Discount Rate as Percentage
And I Enter the Percentage
And I Select the Availability as Always
And I Click the Save and Publish button
Then Verify whether the Duplicate Item Based Discount is Saved or not

Scenario: Verify whether the Item Based Discount Updating with Space in the end of Item Based Discount name
Given I Search and Edit the Item Based Discount
When I Enter the New Item Based Discount Name with Space
And I Click the Update and Publish button
Then Verify whether the Item Based Discount Name with Space in end is Updated or not

Scenario: Verfiy Searched element displaying in Active and Inactive list
Given Search the Element in Active and InActive List










