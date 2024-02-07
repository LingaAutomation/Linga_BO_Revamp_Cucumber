@Product/Items
@Modifier_Groups
Feature: Product and Items - Modifier_Groups
I am verify the Product/Items-Modifier_Groups module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd

Background: Opening the Modifier Groups page
Given Open the Modifier Groups home page BaseURL and StoreID

Scenario: Verify whether the Modifier Groups Header is Displayed
Given Verifying the Modifier Groups Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Modifier Group Page header
Given Click the New Modifier Group button
Then Verify the New Modifier Group Header
Then I Click the Backward button

Scenario: Verify whether we able to create the New Modifier Group without Entering Name/Mandatory Fields
Given Click the New Modifier Group button
And I Click the Save and Publish button without Entering Modifier Group Name
Then I Click the Backward button

Scenario: Verify whether the user can able to Enter the Modifier Group Name above the limit
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name Exceeding the limit
Then I Click the Backward button

#Scenario: Verify Please add basic details and link the modifier to the Modifier Group before entering Proceed to Inventory Menu Item Mapping alert is Displayed
#Given Click the New Modifier Group button
#Then Verify Please add basic details and link the modifier to the Modifier Group before entering Proceed to Inventory Menu Item Mapping alert is Displayed
#And I Click the Backward button

Scenario: Verify whether we can able to Save the Modifier Group only by Entering Priority
Given Click the New Modifier Group button
And I Enter the Priority
And I Click the Save and Publish button 
Then Verify whether the Modifier Group Saved only with Priority or not
And I Click the Backward button

Scenario: Save Modifier Group without Entering Priority
Given Click the New Modifier Group button
When I Enter the New Modifier Group Name
And I Clear the Priority
And I Click the Save and Publish button without entering Priority
And I Click the Backward button

Scenario: Verify whether user can able to create a New Modifier Group with Priority as Zero
Given Click the New Modifier Group button
When I Enter the New Modifier Group Name
And I Enter the Priority as Zero
Then Number should not be less than One error is Displayed
And I Select the Multiple Modifier
And I Click the Save and Publish button 
Then Verify whether the Modifier Group is Saved with Priority as Zero or not
And I Click the Backward button

Scenario: Verify whether user can able to create a New Modifier Group with Priority as with Decimal values 
Given Click the New Modifier Group button
When I Enter the New Modifier Group Name Decimal
#And I Enter the New Modifier Group Name
And I Enter the Priority as Decimal value InCategory
And I Select the Multiple Modifier
And I Click the Save and Publish button 
Then Verify whether the Modifier Group is Saved with Priority as Decimal or not
#And I Click the Backward button

Scenario: Verify whether the Modifier is deleted after Removing the Modifier
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name
And I Enter the Priority
And I Select the Multiple Modifier
And I Remove the Modifiers
Then Check the Save and Publish button is Disabled
And I Click the Backward button

#NewCase Jan 03 2024
			
Scenario: Verify whether Selected Modifiers are getting Displayed or Not						
Given Click the New Modifier Group button						
And I Enter the New Modifier Group Name						
And I Enter the Priority											
And I Select the Multiple Modifier above Ten					
Then Verify whether all the Selected Modifiers is Displayed	
And I Select Sort By Option as A-Z
Then Verify whether all the Selected Modifiers is Displayed AfterSorting								
And I Remove One Modifier						
Then Verify whether all the Selected Modifiers is Displayed						
And I Click the Backward button

#NewCase Jan 03 2024	
		
Scenario: Verify whether Selected Modifiers are getting Displayed or Not						
Given Click the New Modifier Group button						
And I Enter the New Modifier Group Name						
And I Enter the Priority						
And I Select the Multiple Modifier above Ten					
Then Verify whether all the Selected Modifiers is Displayed	
And I Select Sort By Option as A-Z
Then Verify whether all the Selected Modifiers is Displayed AfterSorting							
And I Remove One Modifier							
Then Verify whether all the Selected Modifiers is Displayed						
And I Click the Backward button						
						
#NewCase Jan 03 2024	
		
Scenario: Verify whether Selected Modifiers are getting Displayed or Not						
Given Click the New Modifier Group button						
And I Enter the New Modifier Group Name						
And I Enter the Priority	
And I Select the Multiple Modifier above Ten					
Then Verify whether all the Selected Modifiers is Displayed	
And I Select Sort By Option as Custom
Then Verify whether all the Selected Modifiers is Displayed AfterSorting							
#And I Remove One Modifier												
#Then Verify whether all the Selected Modifiers is Displayed											
And I Click the Backward button						
			
Scenario: Verify whether the Serving size is deleted 
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name
And I Enter the Priority
And I Select the Multiple Modifier
And I Enable Set Price Here Toggle
And I Select Serving Size in dropdown
And I Enter Price
And I Delete the Serving Size
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify Hide in Online Order Toggles is Disabled after Selecting Modifier
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name
And I Enter the Priority
And I Select the Multiple Modifier
And I Verify Hide In Online Order Toggle is Disabled
And I Click the Backward button

Scenario: Verify whether we able to Save the Modifier Group with Single letter
Given Click the New Modifier Group button
And I Enter the Single letter in Modifier Group Name
And I Enter the Priority
Then I Verify Pizza Topping Toggle is Disabled
Then I Verify Hide Modifier Group Toggle is Disabled
And I Verify Hide In Online Order Toggle is Disabled
And I Select the Multiple Modifier
Then I Verify Set Price Here Toggle is Disabled
And I Click the Save and Publish button
Then Verify whether we able to Save the Modifier Group with Single letter


Scenario: Verify Hide Modifier Group Toggle is Disabled After Enabling Hide in Online Order Toggle is Enabled for Any One Modifier
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name
And I Enter the Priority
And I Select the Multiple Modifier
And I Enable Hide in Online Order Toggle for Anyone Modifier
Then I Verify Hide Modifier Group Toggle is Disabled
And I Click the Backward button

Scenario: Verify whether we can able to save and publish without adding service Size
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name
And I Enter the Priority
And I Select the Multiple Modifier
Then I Verify Set Price Here Toggle is Disabled
And I Enable Set Price Here Toggle
Then Check the Save and Publish button is Disabled
And I Select Serving Size in dropdown
And I Enter Price
Then Check the Save and Publish button is Enabled
And I Click the Save and Publish button
Then Verify whether we can able to save and publish


Scenario: Verify Serving Size Already Exists error is Displayed
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name
And I Enter the Priority
And I Select the Multiple Modifier
And I Enable Set Price Here Toggle
And I Select Serving Size in dropdown1
And I Add Serving Size
And I Select same Serving Size in dropdown
Then Verify Serving Size Already Exists error is Displayed
Then Check the Save and Publish button is Disabled
And I Click the Backward button

Scenario: Verify whether we can able to Navigate Proceed to Inventory Menu items Mapping tab
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name
And I Enter the Priority
And I Select the Multiple Modifier
And I Enable Set Price Here Toggle
And I Select Serving Size in dropdown
And I Enter Price
And I Click Proceed to Inventory Menu items Mapping tab
Then Verify whether we can able to Navigate Proceed to Inventory Menu items Mapping tab
And I Click the Backward button

Scenario: Verify the Update Modifier Group Page header
Given Search and Click on Edit Modifier Group
Then Verify the Update Modifier Group Header
And I Click the Backward button

Scenario: Verify whether we can able to Cancel/Close the Modifer Group Update screen
Given Search and Click on Edit Modifier Group
And I Click the Backward button
Then I Verify Modifier Group Update screen Close or not

Scenario: Verify able to search the Modifier Group by entering 3 letters of Modifier Group Name
And I Verify Searching the Item when entering three letters

Scenario: Update Modifier Group without Entering Modifier Group name
Given Search and Click on Edit Modifier Group
When I Clear the Name
Then Verify whether the Modifier Group is Updated without Entering Name
And I Click the Backward button

Scenario: Update Modifier Group without Entering Priority
Given Search and Click on Edit Modifier Group
When I Enter the New Modifier Group Name
Then I Clear the Priority
Then Check the Update and Publish button is Disabled
#Then Verify whether the Modifier Group is Updated without Entering Priority
And I Click the Backward button

Scenario: Verify whether user can able to Update Modifier Group with Priority as Zero
Given Search and Click on Edit Modifier Group
When I Enter the New Modifier Group Name
And I Enter the Priority as Zero
Then Verify whether the Modifier Group is Updated with Priority as Zero or not
And I Click the Backward button

Scenario: Verify whether user can able to New Modifier Group with Priority as with Decimal values 
Given Search and Click on Edit Modifier Group
When I Enter the New Modifier Group Name
And I Enter the Priority as Decimal value
And I Click Proceed to Inventory Menu items Mapping tab
Then Verify whether we can able to Navigate Proceed to Inventory Menu items Mapping tab
And I Click the Update and Publish button
Then Verify whether the Modifier Group is Updated with Priority as Decimal or not

Scenario: Updating Modifier Group by Changing Priority
Given Search and Click on Edit Modifier Group
When I Enter the New Modifier Group Name
And I Enter the Priority
And I Click the Update and Publish button
Then Verify the Modifier Group is Updated or not

Scenario: Verify whether Modifiers are Displayed in Ascending to Descending order
Given Search and Click on Edit Modifier Group
When I Enter the New Modifier Group Name
And I Enter the Priority
#And I Select the Multiple Modifier
And I Select Sort By Option as A-Z
#Then Verify whether Modifiers are Displayed in Ascending to Descending order
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify the Modifier Group is Updated or not
#And Search and Click on Edit Modifier Group
#Then Verify whether Modifiers are Displayed in Ascending to Descending order

#NewCase Jan 03 2024						
Scenario: Verify whether Selected Modifiers are getting Displayed or Not						
Given Search and Click on Edit Modifier Group						
When I Enter the New Modifier Group Name						
And I Enter the Priority						
And I Select the Multiple Modifier above Ten					
Then Verify whether all the Selected Modifiers is Displayed	
And I Select Sort By Option as A-Z
Then Verify whether all the Selected Modifiers is Displayed AfterSorting							
And I Remove One Modifier									
Then Verify whether all the Selected Modifiers is Displayed	

#Scenario: Verify whether Modifiers are getting Rearranged or Not
#Given Search and Click on Edit Modifier Group
#When I Enter the New Modifier Group Name
#And I Enter the Priority
#And I Select the Multiple Modifier
#And I Select Sort By Option as A-Z
#Then Verify whether Modifiers are Displayed in Ascending to Descending order
#And I Delete the Modifier
#Then Verify whether Modifiers are getting Rearranged or Not

Scenario: Verify whether Modifiers are Displayed in Descending to Ascending order
Given Search and Click on Edit Modifier Group
When I Enter the New Modifier Group Name
And I Enter the Priority
#And I Select the Multiple Modifier
And I Select Sort By Option as Z-A
#Then Verify whether Modifiers are Displayed in Descending to Ascending order
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify the Modifier Group is Updated or not
#And Search and Click on Edit Modifier Group
#Then Verify whether Modifiers are Displayed in Descending to Ascending order

#Scenario: Verify whether Modifiers are getting Rearranged or Not
#Given Search and Click on Edit Modifier Group
#When I Enter the New Modifier Group Name
#And I Enter the Priority
#And I Select the Multiple Modifier
#And I Select Sort By Option as Z-A
#Then Verify whether Modifiers are Displayed in Descending to Ascending order
#And I Delete the Modifier
#Then Verify whether Modifiers are getting Rearranged or Not

#NewCase Jan 03 2024						
Scenario: Verify whether Selected Modifiers are getting Displayed or Not						
Given Search and Click on Edit Modifier Group						
When I Enter the New Modifier Group Name						
And I Enter the Priority						
And I Select the Multiple Modifier above Ten					
Then Verify whether all the Selected Modifiers is Displayed	
And I Select Sort By Option as Z-A
Then Verify whether all the Selected Modifiers is Displayed AfterSorting							
And I Remove One Modifier								
Then Verify whether all the Selected Modifiers is Displayed		

Scenario: Verify whether Custom sort is working after selecting the Modififers
Given Search and Click on Edit Modifier Group
When I Enter the New Modifier Group Name
And I Enter the Priority
#And I Select the Multiple Modifier
And I Select Sort By Option as Custom
And I Drag and Drop the Menu Items from A to B
#Then Verify whether Modifiers are Displayed as per Custom Sort
Then Check the Update and Publish button is Enabled
And I Click the Update and Publish button
Then Verify the Modifier Group is Updated or not
#And Search and Click on Edit Modifier Group
#Then Verify whether Modifiers are Displayed as per Custom Sort

#Scenario: Verify whether Modifiers are getting Rearranged or Not
#Given Search and Click on Edit Modifier Group
#When I Enter the New Modifier Group Name
#And I Enter the Priority
#And I Select the Multiple Modifier
#And I Select Sort By Option as Custom
#Then Verify whether Modifiers are Displayed as per Custom Sort
#And I Delete the Modifier
#Then Verify whether Modifiers are getting Rearranged or Not

#NewCase Jan 03 2024						
Scenario: Verify whether Selected Modifiers are getting Displayed or Not						
Given Search and Click on Edit Modifier Group						
When I Enter the New Modifier Group Name						
And I Enter the Priority						
And I Select the Multiple Modifier above Ten					
Then Verify whether all the Selected Modifiers is Displayed	
And I Select Sort By Option as Custom
Then Verify whether all the Selected Modifiers is Displayed AfterSorting							
#And I Remove One Modifier							
#Then Verify whether all the Selected Modifiers is Displayed	
And I Click the Backward button

Scenario: Searching with Special Charcters
Then Enter Special Characters in Search field and Verify

Scenario: Verify whether Unable to Inactivate the Modifier Group Clicking Cancel/No button
Given I Search the Modifier Group and Click the Delete button
And I Click the Cancel button in Modifier Group
Then Verify the Cancelled Modifier Group Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Modifier Group Clicking Delete/Yes button
Given I Search the Modifier Group and Click the Delete button
And I Click the Delete button
Then I Verifying the Modifier Group Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Modifier Group

Scenario: Verify whether Unable to Activate the Modifier Group Clicking Cancel/No button
Given I Search the Modifier Group and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Modifier Group is Activated or not

Scenario: Verify whether Able to Activate the Modifier Group Clicking Delete/Yes button
Given I Search the Modifier Group and Click the Active button
And I Click the Activate button
Then I Verifying the Modifier Group Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Modifier Group

Scenario: Verify whether able to Delete the Modifier Group which is mapped with Menu Item
Given Navigate to Menu Items page and Get the value and navigate to the Modifier Group page
Then I Search the Modifier Group mapped with Menu Item and Click the Delete button
And I Click the Delete button
Then I Verifying the Modifier Group Mapped with Menu Item is Deleted or not

Scenario: Verify whether able to Creating Duplicate Modifier Group
Given Click the New Modifier Group button
And I Enter the New Modifier Group Name
And I Enter the Priority
And I Select the Multiple Modifier
And I Click the Save and Publish button
Then Verify whether the Duplicate Modifier Group is Saved or not

Scenario: Verify whether the Category Updating with Space in the end of Modifier Group name
Given Search and Click on Edit Modifier Group
When I Enter the New Modifier Group Name with Space
And I Click the Update and Publish button
Then Verify whether the Modifier Group Name with Space in end is Updated or not

Scenario: Verfiy Searched element displaying in Active and Inactive list
Given Search the Element in Active and InActive List ModifierGroup












