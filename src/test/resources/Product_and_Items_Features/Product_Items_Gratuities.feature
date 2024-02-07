#@Product/Items
@Gratuities
Feature: Product and Items - Gratuities
  I am Verify the Product/Items-Gratuities module by Add/Edit/Delete/Activate/Duplicate

  #Scenario: Login to the Application
  #Given Open the Browser and Enter URL
  #When I Select the Store after Login to Application when Enter Username and Passowrd

  Background: Open the Gratuities page
	Given Open the Gratuities home page BaseURL and StoreID

  Scenario: Verify whether the Gratuities Header is Displayed
    Given Verifying the Gratuities Header Page

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Verify the New Gratuity Page header
    Given Click the New Gratuity button
    When Verify the New Gratuity Header

  Scenario: Verify whether we able to create the New Gratuity without Entering Name/Mandatory Fields
    And I Click the Save button without Entering Gratuity Name

  Scenario: Verify whether we able to Save the Gratuity by Entering Gratuity Name with single letter
    And I Enter the Single letter in Gratuity Name and Click the Save button
    

  Scenario: Verify whether we able to Save the Gratuity only by Entering Gratuity Percentage
  #	When I Clear the Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    Then Verify whether the Gratuity saved only with Percentage or not
    #Then Verify whether the Save button is Disabled

  Scenario: Verify whether we able to Save the Gratuity by Entering Gratuity Percentage as Zero
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage as Zero
    And I Disable the Auto Gratuity
    Then Verify whether We able to save the Gratuity Percentage as Zero
    
    Scenario: Verify whether we able to Save the Gratuity by Entering Gratuity Percentage above the percentage limit
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage above the percentage limit
    And I Disable the Auto Gratuity
    #And I Click the Save button
    Then Verify whether We able to save the Gratuity Percentage above the limit
    #Then Verify whether the Save button is Disabled

  Scenario: Verify whether we able to increase the Percentage by clicking Up Icon
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    And I Click the Percentage Input Box Up Icon
    Then Verify whether We able to Increase the Percentage by clicking Up Icon

  Scenario: Verify whether we able to Decrease the Percentage by clicking Down Icon
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage 
    And I Click the Percentage Input Box Down Icon
    Then Verify whether We able to Decrease the Percentage by clicking Down Icon

  Scenario: Verify whether we can able Enable the Auto Gratuity
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    And I Enable the Auto Gratuity
    Then Verify whether the Auto Gratuity Seat Count is Displayed or not

  Scenario: Verify whether we able to Save the Auto Gratuity Count as Zero
    And I Enter the Auto Gratuity Count Seat as Zero
    Then I Verify the Enter Valid Seat Count is Displayed or not
    #And I Click the Save button
    #Then Verify whether the Gratuity Saved with Auto Gratuity Seat Count as Zero or not
    Then Verify whether the Save button is Disabled

  Scenario: Verify whether we able to Increase the Auto Gratuity Seat Count by clicking Up Icon
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    And I Enable the Auto Gratuity
    And I Enter the Auto Gratuity Seat Count
    And I Click the Auto Gratuity Seat Count Input Box Up Icon
    Then Verify whether we able to Increase the Auto Gratuity Seat Count

  Scenario: Verify whether we able to Decrease the Auto Gratuity Seat Count by clicking Down Icon
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    And I Enable the Auto Gratuity
    And I Enter the Auto Gratuity Seat Count
    And I Click the Auto Gratuity Seat Count Input Box Down Icon
    Then Verify whether we able to Decrease the Auto Gratuity Seat Count
    
 Scenario: Verify whether we can able to Save the Gratuity with Exceeding Auto Gratuity Seat Count
	When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    And I Enable the Auto Gratuity
    And I Enter the Auto Gratuity Seat Count above the Limit
    #And I Click the Save button
    Then Verify whether the Gratuity Saved with Exceed the limit in Auto Gratuity Seat Count or not
    And I Click the Cancel button


  Scenario: Verify whether Save button is Enabled without Entering the Minimum & Maximum Percentage
  Given Click the New Gratuity button
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Check Enter Valid Min Percentage Error Message is Displayed
    And I Check Enter Valid Max Percentage Error Message is Displayed
    And I Enter the Min Percentage as Zero
    And I Enter the Max Percentage as Zero
    Then Verify whether the Save button is Disabled
    
      Scenario: Verify whether Save button is Enabled by Entering the Minimum & Maximum Percentage above Percentage Limit
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage above the percentage limit
    And I Enter the Max Percentage above the percentage limit
    Then Verify whether the Save button is Disabled
    
       Scenario: Verify whether Save button is Enabled by Entering the Valid Minimum & Maximum Percentage as Zero
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage
    And I Enter the Max Percentage as Zero
    Then Verify whether the Save button is Disabled
    
   Scenario: Verify whether Save button is Enabled by Entering the Minimum as Zero & Valid Maximum Percentage
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage as Zero
    And I Enter the Max Percentage
    Then Verify whether the Save button is Disabled
    
   Scenario: Verify whether Save button is Enabled by Entering the Valid Minimum & Maximum Percentage above Percentage Limit
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage
    And I Enter the Max Percentage above the percentage limit
    Then Verify whether the Save button is Disabled
    
   Scenario: Verify whether Save button is Enabled by Entering the Minimum Percentage above Percentage Limit & Valid Maximum Percentage
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage above the percentage limit
    And I Enter the Max Percentage
    Then Verify whether the Save button is Disabled
    And I Click the Cancel button

  Scenario: Save the Fixed Gratuity with Auto Gratuity
  	Given Click the New Gratuity button
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    And I Enable the Auto Gratuity
    And I Enter the Auto Gratuity Seat Count
    And I Click the Save button
    Then Verify whether the Fixed Gratuity is Saved or Not
    
 Scenario: Verify the Update header by Editing Saved Gratuity
Given I Search and Edit the Fixed Gratuity
When Verify the Update Gratuity Header

Scenario: Verify whether we can able to Cancel/Close the Gratuity Update screen
And I Click the Cancel button
Then I Verify Gratuity Update screen Close or not

Scenario: Verify able to search the Gratuity by entering 3 letters of Gratuity Name
And I Verify Searching the Item when entering three letters
 
  Scenario: Verify whether we can able Update the Fixed Gratuity without Gratuity Name
	Given I Search and Edit the Fixed Gratuity
	And I Click the Update button without Gratuity Name
#	And I Click the Cancel button
	
	Scenario: Verify whether we can able Update the Fixed Gratuity without Percentage
#	Given I Search and Edit the Fixed Gratuity
	And I Click the Update button without Entering Percentage
	And I Enter the Percentage
#	And I Click the Cancel button

	Scenario: Verify whether we can able Update the Fixed Gratuity without Auto Gratuity Seat Count
#	Given I Search and Edit the Fixed Gratuity
	And I Click the Update button without Entering Auto Gratuity Seat Count
	And I Enter the Auto Gratuity Seat Count
	
	Scenario: Verify whether we can able Update the Fixed Gratuity by Entering Percentage as Zero
#	Given I Search and Edit the Fixed Gratuity
	And I Enter the Percentage as Zero
	Then Verify whether the Update button is Disabled
	And I Enter the Percentage
#	And I Click the Cancel button
	

Scenario: Verify whether we can able Update the Fixed Gratuity by Entering Percentage above the limit
#Given I Search and Edit the Fixed Gratuity
	And I Enter the Percentage above the percentage limit
	Then Verify whether the Update button is Disabled
	And I Enter the Percentage
#	And I Click the Cancel button
	
	Scenario: Verify whether we can able Update the Fixed Gratuity by Entering Auto Gratuity Seat Count as Zero
	And I Enter the Auto Gratuity Count Seat as Zero
	Then Verify whether the Update button is Disabled
	And I Enter the Auto Gratuity Seat Count
#	And I Click the Cancel button

Scenario: Verify whether we can able Update the Fixed Gratuity by Entering Auto Gratuity Seat Count above the limit
	And I Enter the Auto Gratuity Seat Count above the Limit
	Then Verify whether the Update button is Disabled
#	And I Enter the Auto Gratuity Seat Count
	And I Click the Cancel button
	
	Scenario: Update the Fixed Gratuity by Disabling Auto Gratuity
	Given I Search and Edit the Fixed Gratuity
	And I Can verify the Enabled Auto Gratuity Toggle
	And I Can verify the Percentage
	And I Can verify the Auto Gratuity Seat Count
	When I Enter the Fixed Gratuity Name
	And I Enter the Percentage
	And I Disable the Auto Gratuity
	And I Click the Update button
	Then Verify whether the Fixed Gratuity is Updated or not

Scenario: Save the Varying Gratuity with Auto Gratuity
Given Click the New Gratuity button
When I Enter the Varying Gratuity Name
And I Select the Apply To as Varying
And I Enter the Min Percentage
And I Enter the Max Percentage
And I Enable the Auto Gratuity
And I Enter the Auto Gratuity Seat Count
And I Click the Save button
Then Verify whether the Varying Gratuity is Saved or Not


  Scenario: Verify whether Update button is Enabled by Entering the Minimum & Maximum Percentage above Percentage Limit
    Given I Search and Edit the Varying Gratuity
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage above the percentage limit
    And I Enter the Max Percentage above the percentage limit
    Then Verify whether the Update button is Disabled
    
       Scenario: Verify whether Update button is Enabled by Entering the Valid Minimum & Maximum Percentage as Zero
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage
    And I Enter the Max Percentage as Zero
    Then Verify whether the Update button is Disabled
    
   Scenario: Verify whether Update button is Enabled by Entering the Minimum as Zero & Valid Maximum Percentage
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage as Zero
    And I Enter the Max Percentage
    Then Verify whether the Update button is Disabled
    
   Scenario: Verify whether Update button is Enabled by Entering the Valid Minimum & Maximum Percentage above Percentage Limit
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage
    And I Enter the Max Percentage above the percentage limit
    Then Verify whether the Update button is Disabled
    
   Scenario: Verify whether Update button is Enabled by Entering the Minimum Percentage above Percentage Limit & Valid Maximum Percentage
    When I Enter the Varying Gratuity Name
    And I Select the Apply To as Varying
    And I Enter the Min Percentage above the percentage limit
    And I Enter the Max Percentage
    Then Verify whether the Update button is Disabled
    And I Click the Cancel button

    
Scenario: Update the Varying Gratuity by Disabling Auto Gratuity
Given I Search and Edit the Varying Gratuity
When I Enter the Varying Gratuity Name
And I Select the Apply To as Varying
And I Enter the Min Percentage
And I Enter the Max Percentage
And I Disable the Auto Gratuity
And I Click the Update button
Then Verify whether the Varying Gratuity is Updated or Not

  Scenario: Verify whether Unable to Inactivate the Gratuity Clicking Cancel/No button
    Given I Search the Gratuity and Click the Delete button
    And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Gratuity Deleted/Inactivated or not

  Scenario: Verify whether Able to Inactivate the Gratuity Clicking Delete/Yes button
    Given I Search the Gratuity and Click the Delete button
    And I Click the Delete button
    Then I Verifying the Gratuity Deleted or not
    And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Gratuity

  Scenario: Verify whether Unable to Activate the Gratuity Clicking Cancel/No button
    Given I Search the Gratuity and Click the Active button
    And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Gratuity is Activated or not

  Scenario: Verify whether Able to Activate the Gratuity Clicking Delete/Yes button
    Given I Search the Gratuity and Click the Active button
    And I Click the Activate button
    Then I Verifying the Gratuity Activated or not
    And I Click the Active button to navigate Activated screen to Verify Activated Gratuity

  Scenario: Verify whether able to Creating Duplicate Gratuity
    Given Click the New Gratuity button
    When I Enter the Fixed Gratuity Name
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    And I Click the Save button
    Then Verify whether the Duplicate Gratuity is Saved or not

  Scenario: Verify whether the Gratuity Saved by Entering Special Characters
    Given Click the New Gratuity button
    When I Enter the New Gratuity Name with Special Characters
    And I Select the Apply To as Fixed
    And I Enter the Percentage
    And I Click the Save button
    Then Verify whether the Gratuity with Special Characters is Saved or not

  Scenario: Verify whether the Gratuity Updating with Space in the end of Gratuity name
    Given I Search and Edit the Fixed Gratuity
    When I Enter the New Grtauity Name with Space
    And I Click the Update button
    Then Verify whether the Gratuity Name with Space in end is Updated or not

 