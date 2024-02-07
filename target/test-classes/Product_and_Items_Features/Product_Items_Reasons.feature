#@Product/Items
@Reasons
Feature: Product and Items - Reasons
I am verify the Product/Items-Reasons module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Reasons page
Given Open the Reasons home page BaseURL and StoreID

Scenario: Verify whether the Reasons Header is Displayed
Given Verifying the Reasons Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Reasons Page header
Given I Click the New Reasons button
When Verify the New Reasons Header

Scenario: Verify the Tax exempt option is selected by default in New Reason Screen
Then Check whether the Tax exempt option is selected by default

Scenario: Verify whether we able to create the New Reasons without Entering Name/Mandatory Fields
And I Click the Save button without Entering Reason Name

Scenario: Verify whether we able to Save the Reason with Single letter
And I Enter the Single letter in Reason then Click the Save button
Then Check whether Reasons Saved or Not

Scenario: Verify whether the user can able to Enter the Reason Name above the limit
Given I Click the New Reasons button
Then I Enter the Reason Exceeding the limit
Then Check the Exceed Error Message under Reason Name


Scenario: Verify whether We Can Able to Save Tax Exempt Reason Type without Reason Name
#Given I Click the New Reasons button
And I Select Reason Type as Tax Exempt
#Then Verify whether the Void Reason is Saved without Reason Name or not
Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Tax Exempt
And I Select Reason Type as Tax Exempt
And I Enter the Tax Exempt Reason Name
And I Click the Save button
Then Check whether Reasons Saved or Not

Scenario: erify whether We Can Able to Save Void Reason Type without Reason Name
Given I Click the New Reasons button
And I Select Reason Type as Void
#Then Verify whether the Void Reason is Saved without Reason Name or not
Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Void
And I Select Reason Type as Void
And I Enter the Void Reason Name
And I Click the Save button
Then Check whether Reasons Saved or Not

Scenario: Verify whether We Can Able to Save Paid In Reason Type without Reason Name
And I Click the New Reasons button
When I Select Reason Type as Paid In
Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Paid In
When I Select Reason Type as Paid In
And I Enter the Paid In Reason Name
Then I Click the Save button
Then Check whether Reasons Saved or Not

Scenario: Verify whether We Can Able to Save Break Reason Type without Reason Name
Given I Click the New Reasons button
And I Select Reason Type as Break
Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Break
Given I Select Reason Type as Break
And I Enter the Break Reason Name
Then I Click the Save button
Then Check whether Reasons Saved or Not

Scenario: Verify whether We Can Able to Save Layaway Reason Type without Reason Name
Given I Click the New Reasons button
And I Select Reason Type as Layaway
Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Layaway
Given I Select Reason Type as Layaway
And I Enter the Layaway Reason Name
Then I Click the Save button
Then Check whether Reasons Saved or Not

Scenario: Verify whether We Can Able to Save Paid Out Reason Type without Reason Name
  Given I Click the New Reasons button
  And I Select Reason Type as Paid Out
Then Verify whether the Save button is Disabled

  Scenario: Verify We Can Able to Save the Reason Type as Paid Out
  Given I Select Reason Type as Paid Out
  And I Enter the Paid Out Reason Name
  Then I Click the Save button
  Then Check whether Reasons Saved or Not

  Scenario: Verify whether We Can Able to Save Over/Shortage Reason Type without Reason Name
  Given I Click the New Reasons button
  And I Select Reason Type as Over Shortage
  Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Over/Shortage
Given I Select Reason Type as Over Shortage
  And I Enter the Over Shortage Reason Name
  Then I Click the Save button
  Then Check whether Reasons Saved or Not

  Scenario: Verify whether We Can Able to Save Attach Request Reason Type without Reason Name
  Given I Click the New Reasons button
  And I Select Reason Type as Attach Request
  Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Attach Request
  Given I Select Reason Type as Attach Request
  And I Enter the Attach Request Reason Name
  Then I Click the Save button
  Then Check whether Reasons Saved or Not

  Scenario: Verify whether We Can Able to Save Refund Reason Type without Reason Name
  Given I Click the New Reasons button
  And I Select Reason Type as Refund
Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Refund
  Given I Select Reason Type as Refund
  And I Enter the Refund Reason Name
  Then I Click the Save button
  Then Check whether Reasons Saved or Not

  Scenario: Verify whether We Can Able to Save Exchange Reason Type without Reason Name
  Given I Click the New Reasons button
  And I Select Reason Type as Exchange
Then Verify whether the Save button is Disabled

Scenario: Verify We Can Able to Save the Reason Type as Exchange
  Given I Select Reason Type as Exchange
  And I Enter the Exchange Reason Name
  Then I Click the Save button
  Then Check whether Reasons Saved or Not

#Scenario: Verify able to see close option in the New reasons page
#Given I Click the New Reasons button
#And Verify close button is available
#Then I click on the close button
#
#Scenario: Verify able to see cancel option in the New reasons page
#Given I Click the New Reasons button
#And  Verify cancel button is available
#Then  I click on the cancel button


  Scenario: Verify the Update header by Editing Saved Reason
    Given I Search and Edit the Reason
    When Verify the Update Reason Header

  Scenario: Verify whether we can able to Cancel/Close the Reason Update screen
    And I Click the Cancel button
    Then I Verify Reason Update screen Close or not

  Scenario: Verify able to search the Reason by entering 3 letters of Reason Name
    And I Verify Searching the Item when entering three letters

    Scenario:  Verify whether the Reasons without Reason Name
      Given I Search and Edit the Reason
      And I Clear the Reason Name
     Then Verify whether the Reason Updated without Reason Name or not
#      Then Verify the Update button is Disabled
			And I Click the Cancel button

  Scenario: Verify whether we can to Change the Reason Type from Tax Exempt to Paid Out
    Given I Search and Edit the Reason
    And I Select Reason Type as Paid Out
    And I Click the Update button
   Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Paid Out to Void
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Paid Out
    And I Select Reason Type as Void
    And I Click the Update button
    Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Void to Over/Shortage
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Void
    And I Select Reason Type as Over Shortage
    And I Click the Update button
    Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Over/Shortage to Paid In
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Over Shortage
    And I Select Reason Type as Paid In
    And I Click the Update button
    Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Paid In to Attach Request
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Paid In
    And I Select Reason Type as Attach Request
    And I Click the Update button
    Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Attach Request to Break
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Attach Request
    And I Select Reason Type as Break
    And I Click the Update button
    Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Break to Refund
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Break
    And I Select Reason Type as Refund
    And I Click the Update button
    Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Refund to Layaway
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Refund
    And I Select Reason Type as Layaway
    And I Click the Update button
    Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Layaway to Exchange
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Layaway
    And I Select Reason Type as Exchange
    And I Click the Update button
    Then Verify the Reason type is Updated or Not

  Scenario: Verify whether we can to Change the Reason Type from Exchange to Tax Exempt
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Exchange
    And I Select Reason Type as Tax Exempt
    And I Click the Update button
    Then Verify the Reason type is Updated or Not
    Given I Search and Edit the Reason
    Then I Verify the Reason Type Selected as Tax Exempt
    And I Click the Cancel button



#Scenario: Verify whether able to Delete the Reasons
#Given Search for the reasons in the search bar
#Then verify whether delete button is available for the searched reason
#And I Click the Delete button
#Then verify the popup received as Reason Inactivated Successfully

  Scenario: Verify whether unable to Inactivate the Reason Clicking Cancel/No button
    Given I Search the Reason and Click the Delete button
     And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Reason Deleted/Inactivated or not

  Scenario: Verify whether Able to Inactivate the Reason Clicking Delete/Yes button
    Given I Search the Reason and Click the Delete button
    And I Click the Delete button
    Then I Verifying the Reason Deleted or not
    And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Reason

  Scenario: Verify whether Unable to Activate the Reason Clicking Cancel/No button
    Given I Search the Reason and Click the Active button
    And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Reason is Activated or not

  Scenario: Verify whether Able to Activate the Reason Clicking Delete/Yes button
    Given I Search the Reason and Click the Active button
    And I Click the Activate button
    Then I Verifying the Reason Activated or not
    And I Click the Active button to navigate Activated screen to Verify Activated Reason


Scenario: Verify whether able to Creating Duplicate Reasons
Given I Click the New Reasons button
And I Select Reason Type as Void
When I Enter the Void Reason Name
And I Click the Save button
Then Verify whether the Duplicate reasons is Saved or not

Scenario: Verify whether the available Reason is Displayed or not
Then Verify the Available Reason is Displayed or not


Scenario: Verify whether the Reasons Saved by Entering Special Characters
Given I Click the New Reasons button
And I Select Reason Type as Void
And I Enter the New reason Name with Special Characters
And I Click the Save button
Then Verify whether the Reason with Special Characters is Saved or not

Scenario: Verify whether the Reasons Updating with Space in the end of reason name
Given I Search and Edit the Reason
When I Enter the New Reason Name with Space
And I Click the Update button
Then Verify whether the Reason Name with Space in end is Updated or not

#Scenario: Verify whether able to change the Reason type
#Given I Search and Edit the Reasons
#When I changed the Reason type
#And I Click the Update button
#Then Verify the Reason type is Updated or Not

#Scenario: Verify whether able to Activate the reason from the Inactive page.
#Given I click on the Active button
#When Search for the reason in the Search bar
#And Click on the Activate button
#Then Click on the Yes activate button in the popup
#Then Verify the Reason activated successfully popup is showing

#Scenario: Generate Extent Report for the module
#Given Create the Extent Report


#38