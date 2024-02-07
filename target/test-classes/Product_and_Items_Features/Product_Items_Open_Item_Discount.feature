#@Product/Items
#@Open_Item_Discount
Feature: Product and Items - Open Item Discount
I am verify the Product/Items-Open Item Discount module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd

Background: Opening the Discounts page
Given Open the Discounts home page BaseURL and StoreID

Scenario: Verify whether the Discounts Header is Displayed
Given Verifying the Discounts Header Page

Scenario: Verify whether Open Item Tab is Selected 
Given Open the Discounts home page BaseURL and StoreID
And I Select Open Item Tab
#Then Verify the Open Item Discount not Found is Displayed
Then Verify whether Open Item Tab is Selected

Scenario: Verify the Open Item Page header
Given Click the New Open Item Discount button
When Verify the Open Item Header
And I Click the Backward button

Scenario: Verify whether we able to create the Open Item Discount without Entering Name/Mandatory Fields
Given Click the New Open Item Discount button
Then Check the Save and Publish button is Disabled 
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Open Item Discount Name above the limit
Given Click the New Open Item Discount button
And I Enter the Open Item Discount Name Exceeding the limit
And I Click the Backward button

Scenario: Verify whether we can able to Save the Open Item Discount only by Entering Priority
Given Click the New Open Item Discount button
And I Enter the Priority
#And I Click the Save and Publish button 
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Save Open Item Discount without Entering Priority
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name
And I Clear the Priority
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we able to Save the Open Item Discount with Single letter
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name with single letter
And I Enter the Priority 
And I Select Apply as Before Tax
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Save and Publish button is Enabled
#And I Click the Save and Publish button 
#Then Verify whether we able to Save the Open Item Discount with Single letter
And I Click the Backward button

Scenario: Verify whether user can able to create a Open Item Discount with Priority as 0
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name 
And I Enter the Priority as Zero
Then Check Enter Valid Priority Error is Displayed
And I Select Apply as After Tax
Then Verify whether Promo is Selected as Default
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether user can able to create a Open Item Discount with Priority as Decimal Values
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name 
And I Enter the Priority as Decimal Values
Then Check Enter Valid Priority Error is Displayed
And I Select Apply as After Tax
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Save and Publish button is Disabled
And I Click the Backward button

#Scenario: Verify whether the Before Tax/After Tax is displayed in Apply field dropdown
#Given Click the New Open Item Discount button
#And I Enter the Open Item Discount Name
#And I Enter the Priority
#And I Click Apply Field
#Then Verify whether the Before Tax/After Tax is displayed
#And I Click the Backward button

Scenario: Verify whether Coupon Only Toggle can be Enabled
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name 
And I Enter the Priority 
And I Select Apply as After Tax
And I Select Comp Discount Type
Then Check the Coupon Only Toggle is Disabled
And I Enable Coupon Only Toggle
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Backward button 

Scenario: Verify whether Combine With Other Discount Toggle is Enabled or not
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name 
And I Enter the Priority 
And I Select Apply as After Tax
And I Select Promo Discount Type
Then Check the Combine With Other Discount Toggle is Enabled
Then Verify whether Apply For Discounted Price is Displayed
And I Disable Combine With Other Discount Toggle
Then Verify whether Apply For Discounted Price is Not Displayed
Then Check the Attach Customer Toggle is Disabled
And I Enable Attach Customer Toggle
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify Save and Publish button is Enabled after selecting Membership plan
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name 
And I Enter the Priority 
And I Select Apply as Before Tax
And I Select Promo Discount Type
And I Select Membership Plan
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify whether Restrict POS Visibility by User Role Toggle is Enabled
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name 
And I Enter the Priority 
And I Select Apply as Before Tax
And I Select Promo Discount Type
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Restrict POS Visibility Toggle is Disabled
And I Enable the Restrict POS Visibility Toggle
And I Select the Roles
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Create and Save New Open Item with Mandatory Fields
Given Click the New Open Item Discount button
When I Enter the Open Item Discount Name 
And I Enter the Priority
And I Select Apply as Before Tax
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
Then Check Enter Valid Max.Percentage error is Displayed
Then Check Maximum Percentage should be Greater than Minimum Percentage is Displayed
And I Enter the Maximum Percentage below Minimum Percentage
Then Check Maximum Percentage should be Greater than Minimum Percentage is Displayed
And I Enter the Maximum Percentage above Minimum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Save and Publish button
Then Verify whether the Discount is Saved or not

Scenario: Verify whether user can able to update by Enable Discount In Amount 
Given I Edit the Open Item Discount
Then Verify whether Discount In Percentage is Enabled
And I Enable Discount In Amount Toggle
And I Enter Minimum Amount
And I Enter Maximum Amount
And I Enter Safety Limit Percentage
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether Discount is Updated or Not

Scenario: Verify whether Coupon Only field is displayed after enabling
Given I Edit the Open Item Discount
Then Check the Coupon Only Toggle is Disabled
And I Enable Coupon Only Toggle
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether Discount is Updated or Not

Scenario: Verify whether Combine With Other Discount Toggle is Enabled or not
Given I Edit the Open Item Discount
Then Check the Combine With Other Discount Toggle is Enabled
Then Verify whether Apply For Discounted Price is Displayed
And I Disable Combine With Other Discount Toggle
Then Verify whether Apply For Discounted Price is Not Displayed
Then Check the Attach Customer Toggle is Disabled
And I Enable Attach Customer Toggle
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether Discount is Updated or Not


Scenario: Verify Update and Publish button is Enabled after selecting Membership plan
Given I Edit the Open Item Discount
And I Select Membership Plan
And I Enable Discount In Percentage Toggle
And I Enter the Minimum Percentage
And I Enter the Maximum Percentage
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether Discount is Updated or Not

Scenario: Verify Roles are shown if Restrict POS Visibility by User Role is Enabled
Given I Edit the Open Item Discount
Then Check the Restrict POS Visibility Toggle is Enabled
#Then Verify Roles are shown
And I Select the Roles
And I Click the Update and Publish button
Then Verify whether Discount is Updated or Not

Scenario: Verify whether we can able to Cancel/Close the Open Item Discount Update screen
And I Click the Backward button
Then I Verify Open Item Discount Discount Update screen Close or not

Scenario: Update Open Item Discount without Entering Open Item Discount name
Given I Edit the Open Item Discount
And I Clicking the Update and Publish button without entering Open Item Discount Name
And I Click the Backward button

Scenario: Update Open Item Discount without Entering Priority
Given I Edit the Open Item Discount
When I Enter the New Open Item Discount Name
And I Clicking the Update and Publish button without entering Priority
And I Click the Backward button

Scenario: Verify whether user can able to Update Open Item Discount with Priority as 0
Given I Edit the Open Item Discount
When I Enter the New Open Item Discount Name
And I Enter the Priority as Zero
#And I Click the Update and Publish button
#Then Verify whether the Open Item Discount is Updated with Priority as 0 or not
Then Check Enter Valid Priority Error Message is Displayed
Then Check the Update and Publish button is Disabled
And I Click the Backward button


Scenario: Verify whether user can able to New Open Item Discount with Priority as with Decimal values 
Given I Edit the Open Item Discount
When I Enter the New Open Item Discount Name
And I Enter the Priority as Decimal value
#And I Click the Update and Publish button
#Then Verify whether the Open Item Discount is Updated with Priority as Decimal or not
Then Check Enter Valid Priority Error Message is Displayed
Then Check the Update and Publish button is Disabled
And I Click the Backward button

Scenario: Updating Open Item Discount by Changing Priority
Given I Edit the Open Item Discount
When I Enter the New Open Item Discount Name
And I Change the Priority
And I Click the Update and Publish button 
Then Verify the Open Item Discount is Updated or not

Scenario: Verify whether Unable to Inactivate the Open Item Discount Clicking Cancel/No button
Given I Click the Deactivate button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Open Item Discount Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Open Item Discount Clicking Delete/Yes button
Given I Click the Deactivate button
And I Click the Delete button
Then I Verifying the Open Item Discount Deleted or not

Scenario: Verify whether Unable to Activate the Open Item Discount Clicking Cancel/No button
Given I Click the Activate button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Open Item Discount is Activated or not

Scenario: Verify whether Able to Activate the Open Item Discount Clicking Delete/Yes button
Given I Click the Activate button
And I Click the Activate button
Then I Verifying the Open Item Discount Activated or not

Scenario: Verify whether the Open Item Discount Updating with Space in the end of Open Item Discount name
Given I Edit the Open Item Discount
When I Enter the New Open Item Discount Name with Space
And I Click the Update and Publish button
Then Verify whether the Open Item Discount Name with Space in end is Updated or not