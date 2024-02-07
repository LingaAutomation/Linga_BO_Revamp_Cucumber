#@Product/Items
@TareGroup

Feature: Product and Items - TareGroup
I am verify the Product/Items-TareGroup module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the TareGroup page
Given Open the TareGroup home page BaseURL and StoreID

Scenario: Verify whether the TareGroup Header is Displayed
Given Verifying the TareGroup Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New TareGroup Page header
Given I Click the New TareGroup button
When Verify the New TareGroup Header

Scenario: Verify whether we able to create the New TareGroup without Entering Name/Mandatory Fields
And I Click the Save button without Entering TareGroup Name

Scenario: Verify whether the user can able to Enter the TareGroup above the limit
Then I Enter the TareGroup Name Exceeding the limit

Scenario: Verify whether we able to Save the TareGroup with Single letter
And I Enter the Single letter in Tare Group Name And I Click the Save button 
#When I Enter the Single letter in TareGroup
#And I Click the Save button
#Then Check whether Tare Group Saved or Not

Scenario: Verify the Set As Default is selected to No by default
Given I Click the New TareGroup button
Then I Verify the Set As Default Toggle is Disabled

Scenario: Verify able to Save the TareGroup without adding Weights
When I Enter the TareGroup Name
And I Click on the Add Weight
#And I Click the Save button
#Then Verify whether the TareGroup Saved without weights or not (Exp - Please Enter Weight)
Then Verify whether the Save button is Disabled


Scenario: Verify able to save the TareGroup by Entering Name and adding Weight without Entering Sequence number
#Given I Click the New TareGroup button
When I Enter the TareGroup Name with No Sequence No
#And I Click on the Add Weight
And I Clear the sequence number in Weights
And I Enter the Weight Name
And I Enter the Unit of Measure Weight
And I Enter the Weight
And I Click the Save button
Then Verify whether the TareGroup Saved without Entering Weights Sequence Number or not

Scenario: Verify able to save the TareGroup by Entering Name and adding Weight without Entering weight name
Given I Click the New TareGroup button
When I Enter the TareGroup Name
And I Click on the Add Weight
And I Enter the Sequence Number
And I Clear the Name in Weights
And I Enter the Unit of Measure Weight
And I Enter the Weight
#  And I Click the Save button
Then Verify whether the TareGroup Saved without Entering Weights Name or not
And I Click the Cancel button

Scenario: Verify able to save the TareGroup by Entering Name and adding Weight without Entering Unit of Measure Weight
Given I Click the New TareGroup button
When I Enter the TareGroup Name
And I Click on the Add Weight
And I Enter the Sequence Number
And I Enter the Weight Name
And I Enter the Weight
#  And I Click the Save button
Then Verify whether the TareGroup Saved without Selecting Weights Unit of Measure or not

Scenario: Verify able to save the TareGroup by Entering Name and adding Weight without Entering Weight
#Given I Click the New TareGroup button
When I Enter the TareGroup Name
#And I Click on the Add Weight
And I Enter the Sequence Number
And I Enter the Weight Name
And I Enter the Unit of Measure Weight
And I Remove the Weight Input
#  And I Click the Save button
Then Verify whether the TareGroup Saved without Entering Weights or not
And I Click the Cancel button



Scenario: Verify able to save the TareGroup by Entering Name and adding Weight
Given I Click the New TareGroup button
When I Enter the TareGroup Name
And I Click on the Add Weight
And I Enter the Sequence Number
And I Enter the Weight Name
And I Enter the Unit of Measure Weight
And I Enter the Weight
And I Click the Save button
Then Check whether Tare Group Saved or Not

Scenario: Verify able to save the TareGroup by Entering Name and adding multiple Weight
When I Click the New TareGroup button
And I Enter the TareGroup Name2
And I Click on the Add Weight
And I Enter the Sequence Number
And I Enter the Weight Name
And I Enter the Unit of Measure Weight
And I Enter the Weight
And I Click on the Add Weight
And I Enter the Sequence Number2
And I Enter the Weight Name2
And I Enter the Unit of Measure Weight2
And I Enter the Weight2
And I Click the Save button
Then Check whether Tare Group Saved or Not

Scenario: Verify able to search the TareGroup by entering 3 letters of TareGroup Name
And I Verify Searching the Item when entering three letters

Scenario: Verify the Update header by Editing Saved TareGroup
Given I Search and Edit the TareGroup
When Verify the Update TareGroup Header

Scenario: Verify whether we can able to Cancel/Close the TareGroup Update screen
#When I Click the New TareGroup button
And I Click the Cancel button
Then I Verify TareGroup Update screen Close or not

Scenario: Verify able to update the TareGroup by removing the TareGroup Name
Then Refresh the page
Given I Search and Edit the TareGroup
When I Clear the Name
Then Verify whether the TareGroup is updated without Name or not
And I Click the Cancel button

Scenario: Verify able to update the TareGroup by removing Sequence number in weights
Then Refresh the page
Given I Search and Edit the TareGroup
And I Clear the sequence number in Weights
And I Click the Update button 
Then Verify whether the TareGroup is updated without Sequence Number in Weights or not
And I Click the Cancel button

Scenario: Verify able to update the TareGroup by removing Name in weights
Then Refresh the page
Given I Search and Edit the TareGroup
And I Clear the Name in Weights
#And I Click the Update button
Then Verify whether the TareGroup is updated without Name in Weights or not
And I Click the Cancel button

Scenario: Verify able to update the TareGroup by removing price in weights
Then Refresh the page
Given I Search and Edit the TareGroup
When I Clear the Price in Weights
#  And I Click the Update button
Then Verify whether the TareGroup is updated without Price in Weights or not
And I Click the Cancel button

#  Scenario: Verify the Update header by Editing Saved TareGroup and verify able to delete the weight
#  Given I Search and Edit the TareGroup
#  Then Verify the Update TareGroup Header
#  And I Click the Delete button
#  And I Click the Delete button in Pop Up
#  Then Verify the Weight is Deleted or not
#  And I Click the Update button
#  Then Verify the TareGroup Updated or not

Scenario: Verify able to add weight for the existing TareGroup.
Then Refresh the page
Given I Search and Edit the TareGroup
And I Enter the Sequence Number
And I Enter the Weight Name
And I Enter the Unit of Measure Weight
And I Enter the Weight
And I Click on the Add Weight
And I Click the Weight Delete button
And I Click the Delete button in Pop Up
#Then Verify the Weight is Deleted or not
And I Click the Update button
Then Verify the TareGroup Updated or not

Scenario: Verify whether unable to Inactivate the TareGroup Clicking Cancel/No button
Given I Search the TareGroup and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled TareGoup Inactivated or not

Scenario: Verify whether Able to Inactivate the TareGroup Clicking Delete/Yes button
Given I Search the TareGroup and Click the Delete button
And I Click the Delete button
Then I Verifying the TareGroup Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated TareGroup

Scenario: Verify whether Unable to Activate the TareGroup Clicking Cancel/No button
Given I Search the TareGroup and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled TareGroup is Activated or not

Scenario: Verify whether Able to Activate the TareGroup Clicking Delete/Yes button
Given I Search the TareGroup and Click the Active button
And I Click the Activate button
Then I Verifying the TareGroup Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated TareGroup

Scenario: Verify whether able to Creating Duplicate TareGroup
Given I Click the New TareGroup button
And I Enter the TareGroup Name
And I Click the Save button
Then Verify whether the Duplicate TareGroup is Saved or not
And I Click the Cancel button

Scenario: Verify whether the TareGroup Saved by Entering Special Characters
Given I Click the New TareGroup button
And I Enter the New TareGroup Name with Special Characters
And I Click the Save button
Then Verify whether the TareGroup with Special Characters is Saved or not

Scenario: Verify whether the TareGroup Updating with Space in the end of TareGroup name
Given I Search and Edit the TareGroup
When I Enter the New TareGroup Name with Space
And I Click the Update button
Then Verify whether the TareGroup Name with Space in end is Updated or not

#30
