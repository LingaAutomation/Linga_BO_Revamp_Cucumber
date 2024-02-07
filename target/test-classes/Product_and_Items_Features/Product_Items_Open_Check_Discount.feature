#@Products/Items
#@Open_Check_Discount
Feature: Product and Items - Open Check Discount
I am verify the Product/Items-Open Check Discount module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd

Background: Opening the Discounts page
Given Open the Discounts home page BaseURL and StoreID

Scenario: Verify whether the Discounts Header is Displayed
Given Verifying the Discounts Header Page

Scenario: Verify whether Open Check Tab is Selected 
Given Open the Discounts home page BaseURL and StoreID
And I Click Open Check
Then Verify the Open Check Discount not Found is Displayed
Then Verify whether Open Check Tab is Selected

Scenario: Verify the Open Check Page header
Given Click the New Open Check Discount button
When Verify the Open Check Header

Scenario: Verify whether we able to create the Open Check Discount without Entering Name/Mandatory Fields
Given Click the New Open Check Discount button
Then Check the Save and Publish button is Disabled 
And I Click the Backward button

Scenario: Verify whether the user can able to Enter the Open Check Discount Name above the limit
Given Click the New Open Check Discount button
And I Enter the Open Check Discount Name Exceeding the limit
And I Click the Backward button

Scenario: Verify whether we can able to Save the Open Check Discount only by Entering Priority
Given Click the New Open Check Discount button
And I Enter the Priority
#And I Click the Save and Publish button 
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Save Open Check Discount without Entering Priority
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name
And I Clear the Priority
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we able to Save the Open Check Discount with Single letter
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name with single letter
And I Enter the Priority 
And I Select Apply as Before Tax
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Save and Publish button is Enabled
#And I Click the Save and Publish button 
#Then Verify whether we able to Save the Open Check Discount with Single letter
And I Click the Backward button

Scenario: Verify whether user can able to create a Open Check Discount with Priority as 0
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name 
And I Enter the Priority as Zero
Then Check Enter Valid Priority error is Displayed
And I Select Apply as After Tax
Then Verify whether Promo is Selected as Default
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether user can able to create a Open Check Discount with Priority as Decimal Values
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name 
And I Enter the Priority as Decimal Values
And I Select Apply as After Tax
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify whether the Before Tax/After Tax is displayed in Apply field dropdown
Given Click the New Open Check Discount button
And I Enter the Open Check Discount Name
And I Enter the Priority
And I Click Apply Field
Then Verify whether the Before Tax/After Tax is displayed
And I Click the Backward button

Scenario: Verify whether Coupon Only Toggle can be Enabled
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name 
And I Enter the Priority 
And I Select Apply as After Tax
And I Select Comp Discount Type
Then Check the Coupon Only Toggle is Disabled
And I Enable Coupon Only Toggle
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Backward button 

Scenario: Verify whether Combine With Other Discount Toggle is Enabled or not
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name 
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
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify Save and Publish button is Enabled after selecting Membership plan
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name 
And I Enter the Priority 
And I Select Apply as Before Tax
And I Select Promo Discount Type
And I Select Membership Plan
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Verify whether Restrict POS Visibility by User Role Toggle is Enabled
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name 
And I Enter the Priority 
And I Select Apply as Before Tax
And I Select Promo Discount Type
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Restrict POS Visibility Toggle is Disabled
And I Enable the Restrict POS Visibility Toggle
And I Select the Roles
Then Check the Save and Publish button is Enabled
And I Click the Backward button

Scenario: Create and Save New Open Check with Mandatory Fields
Given Click the New Open Check Discount button
When I Enter the Open Check Discount Name 
And I Enter the Priority 
And I Select Apply as Before Tax
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
Then Check Enter Valid Max.Percentage error is Displayed
Then Check Maximum Percentage should be Greater than Minimum Percentage is Displayed
And I Enter Maximum Percentage below Minimum Percentage
Then Check Maximum Percentage should be Greater than Minimum Percentage is Displayed
And I Enter Maximum Percentage above Minimum Percentage
Then Check the Save and Publish button is Enabled
And I Click the Save and Publish button 
Then Verify whether the Open Check Discount is Saved or not

Scenario: Verify whether user can able to update by Enable Discount In Amount 
Given I Edit the Open Check Discount
Then Verify whether Discount In Percentage is Enabled
And I Enable Discount In Amount Toggle
And I Enter Minimum Amount
And I Enter Maximum Amount
And I Enter Safety Limit Percentage
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether Open Check Discount is Updated or Not

Scenario: Verify whether Coupon Only field is displayed after enabling
Given I Edit the Open Check Discount
Then Check the Coupon Only Toggle is Disabled
And I Enable Coupon Only Toggle
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether Open Check Discount is Updated or Not

Scenario: Verify whether Combine With Other Discount Toggle is Enabled or not
Given I Edit the Open Check Discount
Then Check the Combine With Other Discount Toggle is Enabled
Then Verify whether Apply For Discounted Price is Displayed
And I Disable Combine With Other Discount Toggle
Then Verify whether Apply For Discounted Price is Not Displayed
Then Check the Attach Customer Toggle is Disabled
And I Enable Attach Customer Toggle
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether Open Check Discount is Updated or Not


Scenario: Verify Update and Publish button is Enabled after selecting Membership plan
Given I Edit the Open Check Discount
And I Select Membership Plan
And I Enable Discount In Percentage Toggle
And I Enter Minimum Percentage
And I Enter Maximum Percentage
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify whether Open Check Discount is Updated or Not

Scenario: Verify Roles are shown if Restrict POS Visibility by User Role is Enabled
Given I Edit the Open Check Discount
Then Check the Restrict POS Visibility Toggle is Enabled
#Then Verify Roles are shown
And I Select the Roles
And I Click the Update and Publish button
Then Verify whether Open Check Discount is Updated or not

Scenario: Verify whether we can able to Cancel/Close the Open Check Discount Update screen
And I Click the Cancel button
Then I Verify Open Check Discount Discount Update screen Close or not

Scenario: Update Open Check Discount without Entering Open Check Discount name
Given I Edit the Open Check Discount
And I Clicking the Update and Publish button without entering Open Check Discount Name

Scenario: Update Open Check Discount without Entering Priority
Given I Edit the Open Check Discount
When I Enter the New Open Check Discount Name
And I Clicking the Update and Publish button without entering Priority

Scenario: Verify whether user can able to Update Open Check Discount with Priority as 0
Given I Edit the Open Check Discount
When I Enter the New Open Check Discount Name
And I Enter the Priority as Zero
And I Click the Update and Publish button
Then Verify whether the Open Check Discount is Updated with Priority as 0 or not

Scenario: Verify whether user can able to New Open Check Discount with Priority as with Decimal values 
Given I Edit the Open Check Discount
When I Enter the New Open Check Discount Name
And I Enter the Priority as Decimal value
And I Click the Update and Publish button
Then Verify whether the Open Check Discount is Updated with Priority as Decimal or not

Scenario: Updating Open Check Discount by Changing Priority
Given I Edit the Open Check Discount
When I Enter the New Open Check Discount Name
And I Change the Priority
And I Click the Update and Publish button 
Then Verify the Open Check Discount is Updated or not

Scenario: Verify whether Unable to Inactivate the Open Check Discount Clicking Cancel/No button
Given I Click the Deactivate button
And I Click the Cancel button
Then Verify the Cancelled Open Check Discount Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Open Check Discount Clicking Delete/Yes button
Given I Click the Deactivate button
And I Click the Delete button
Then I Verifying the Open Check Discount Deleted or not

Scenario: Verify whether Unable to Activate the Open Check Discount Clicking Cancel/No button
Given I Click the Activate button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Open Check Discount is Activated or not

Scenario: Verify whether Able to Activate the Open Check Discount Clicking Delete/Yes button
Given I Click the Activate button
And I Click the Activate button
Then I Verifying the Open Check Discount Activated or not

Scenario: Verify whether the Open Check Discount Updating with Space in the end of Open Check Discount name
Given I Edit the Open Check Discount
When I Enter the New Open Check Discount Name with Space
And I Click the Update and Publish button
Then Verify whether the Open Check Discount Name with Space in end is Updated or not
