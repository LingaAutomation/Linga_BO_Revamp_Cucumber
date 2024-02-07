@Linga_Admin
@Linga_Settings_Currencies


Feature: Linga_Admin - Settings_Currencies
I am verify the Linga_Admin - Settings_Currencies module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Linga Admin - Currencies page
Given Open the Linga Admin - Currencies home page BaseURL and StoreID

Scenario: Verify whether the Currencies Header is Displayed
Given Verifying the Currencies Header Page

Scenario: Verify able to search the Announcement by Entering 3 letters of Currency Name
And I Verify Searching the Item when entering three letters
  
Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Currencies Page header
Given I Click the New Currency button
When Verify the New Currency Header

Scenario: Verify whether we able to create the New Currency without Entering Mandatory Fields
#Given I Click the New Currency button
And I Click the Save button
Then Check the Save button is Disabled
#Then  Verify whether we able to create the New Currency without Entering Mandatory Fields or not

Scenario: Verify whether the user can able to Enter the Country Name, Currency Name, Currency Symbol above the limit
#Given I Click the New Currency button
And I Enter the Country Name Exceeding the limit 
And I Enter the Currency Name Exceeding the limit
And I Enter the Currency Symbol Exceeding the limit


Scenario: Verify whether we can able to Save the Currency without Country Name
#Given I Click the New Currency button
#And I Enter the Country Name
And I Enter the Currency Name
And I Enter the Currency Symbol
Then Check the Save button is Disabled

Scenario: Verify whether we can able to Save the Currency without Currency Name
#Given I Click the New Currency button
And I Enter the Country Name
#And I Enter the Currency Name
And I Enter the Currency Symbol
Then Check the Save button is Disabled

Scenario: Verify whether we can able to Save the Currency without Country Name
#Given I Click the New Currency button
And I Enter the Country Name
And I Enter the Currency Name
#And I Enter the Currency Symbol
Then Check the Save button is Disabled


Scenario: Verify whether we able to Create New Currency with Entering Mandatory Fields
#Given I Click the New Currency button
And I Enter the Country Name
And I Enter the Currency Name
And I Enter the Currency Symbol
And I Click the Save button
Then Verify whether the Currency is Saved or not


Scenario: Verify the Update header by Editing Saved Currency
Given I Search and Edit the Currency
When Verify the Update Currency Header

Scenario: Verify whether we can able to Cancel/Close the Currency Update screen
And I Click the Cancel button
Then I Verify Currency Update screen Close or not

#Scenario: Verify whether we able to Save the Currency with Single letter
#Given I Search and Edit the Currency
#And I Enter the Single letter in Country Name
#And I Enter the Single letter in Currency Name
#And I Enter the Single letter in Currency Symbol
#And I Click the Update button
#Then Verify whether we able to Save the Currency with Single letter or not

Scenario: Verify whether the user can able to Enter the Country Name, Currency Name, Currency Symbol above the limit
Given I Search and Edit the Currency
And I Enter the Country Name Exceeding the limit 
And I Enter the Currency Name Exceeding the limit
And I Enter the Currency Symbol Exceeding the limit

Scenario: Verify whether we can able to Save the Currency without Country Name
#Given I Click the New Currency button
And I Clear the Country Name
And I Enter the Currency Name
And I Enter the Currency Symbol
Then Check the Update button is Disabled

Scenario: Verify whether we can able to Save the Currency without Currency Name
#Given I Click the New Currency button
And I Enter the Country Name
And I Clear the Currency Name
And I Enter the Currency Symbol
Then Check the Update button is Disabled

Scenario: Verify whether we can able to Save the Currency without Country Name
#Given I Click the New Currency button
And I Enter the Country Name
And I Enter the Currency Name
And I Clear the Currency Symbol
Then Check the Update button is Disabled


Scenario: Verify whether we able to Create New Currency with Entering Mandatory Fields
#Given I Click the New Currency button
And I Enter the Country Name
And I Enter the Currency Name
And I Enter the Currency Symbol
And I Click the Update button
Then Verify whether the Currency is Updated or not


Scenario: Verify whether Unable to Inactivate the Currency Clicking Cancel/No button
Given I Search the Currency and Click the Delete button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Currency Deleted/Inactivated or not

Scenario: Verify whether Able to Inactivate the Currency Clicking Delete/Yes button
Given I Search the Currency and Click the Delete button
And I Click the Delete button
Then I Verifying the Currency Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Currency

Scenario: Verify whether Unable to Activate the Currency Clicking Cancel/No button
Given I Search the Currency and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Currency is Activated or not

Scenario: Verify whether Able to Activate the Currency Clicking Delete/Yes button
Given I Search the Currency and Click the Active button
And I Click the Activate button
Then I Verifying the Currency Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Currency

Scenario: Verify whether able to Create Currency with Duplicate Country
Given I Click the New Currency button
And I Enter the Country Name
And I Enter the Currency Name
And I Enter the Currency Symbol
And I Click the Save button
Then Verify whether the Duplicate Currency is Saved or not

Scenario: Verify whether able to Update Currency with Space
Given I Search and Edit the Currency
And I Enter the Space in Country Name
And I Enter the Space in Currency Name
And I Enter the Space in Currency Symbol
And I Click the Update button
Then Verify whether able to Updated Currency with Space or not

Scenario: Verify whether able to Create Currency with Space
Given I Click the New Currency button
And I Enter the Space in Country Name
And I Enter the Space in Currency Name
And I Enter the Space in Currency Symbol
And I Click the Save button
Then Verify whether able to Create Currency with Space or not

#Scenario: Verify whether the Currency Saved by Entering Special Characters
#Given I Search and Edit the Other Currency
#When I Enter the Country Name with Special Characters
#And I Enter the Currency Name with Special Characters
#And I Enter the Currency Symbol with Special Characters
#And I Click the Update button
#Then Verify whether the Currency with Special Characters is Updated or not





  

