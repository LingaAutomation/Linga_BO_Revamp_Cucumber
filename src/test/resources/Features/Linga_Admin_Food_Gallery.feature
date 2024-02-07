@Linga_Admin
@Food_Gallery
Feature: Linga Admin - Food Gallery 
I am verify the Admin Stores Page 

Background: Opening the Linga Admin - Food Gallery page
Given Open the Linga Admin - Food Gallery home page BaseURL and StoreID

Scenario: Verfiy whether the Linga Admin - Food Gallery Path is Displayed 
Given Verifying the Linga Admin - Food Gallery Path page

Scenario: Verify the New Item Service Charge Page header
And I Click the New Image button
When Verify the New Image Header

Scenario: Verify we able to Create New Image Without Entering Name
And I Select the Image For Menu Item
And I Upload the Image
Then Check the Save button is Disabled
And I Select the Image For Category
And I Upload the Image
Then Check the Save button is Disabled
And I Select the Image For Floor
And I Upload the Image
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we able to create the New image without selecting image for 
And I Click the New Image button
And I Enter the Image Name
And I Upload the Image
Then Check the Save button is Disabled

Scenario: Verify we able to save the New image without Uploading the image 
And I Click the New Image button
And I Enter the Image Name
And I Select the Image For Menu Item
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Able to Save a New Food Gallery
And I Click the New Image button
And I Enter the Image Name
And I Select the Image For Menu Item
And I Upload the Image
And I Click the Save button
Then Verify whether the Food Gallery is Saved or Not

Scenario: Verify the Update header by Editing Saved Food Gallery
Given I Edit the Food Gallery
Then Verify the Update Food Gallery

Scenario: Verify whether we can able to Cancel/Close the Food Gallery Update screen
Then I Click the Cancel button
Then I Verify Food Gallery Update screen Close or not

Scenario: Able to Update a New Food Gallery with Category
Given I Edit the Food Gallery
And I Enter the Image Name
And I Select the Image For Category
And I Upload the Image
And I Click the Update button
Then Verify whether the Food Gallery is Updated or Not

Scenario: Able to Update a New Food Gallery with Floor
Given I Edit the Food Gallery
And I Enter the Image Name
And I Select the Image For Floor
And I Upload the Image
And I Click the Update button
Then Verify whether the Food Gallery is Updated or Not

Scenario: Able to Update a New Food Gallery with Menu Item
Given I Edit the Food Gallery
And I Enter the Image Name
And I Select the Image For Menu Item
And I Upload the Image
And I Click the Update button
Then Verify whether the Food Gallery is Updated or Not

Scenario: Verify we able to save the Duplicate Food Gallery
And I Click the New Image button
And I Enter the Image Name
And I Select the Image For Menu Item
And I Upload the Image
And I Click the Save button
Then Verify whether the Duplicate Food Gallery is Saved or Not

Scenario: Delete the Food Gallery
And I Delete the Food Gallery
Then Verify whether the Food Gallery Deleted or Not


Scenario: Verify we able to do the Bulk Update or not
And I Click the Bulk Update button 
Then I Verify we able to do Bulk Update or Not

	


 






