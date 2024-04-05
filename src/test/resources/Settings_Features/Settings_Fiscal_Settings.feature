@Settings
@Fiscal_Settings

Feature: Settings - Fiscal Settings
I am verify the Settings-Fiscal module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Settings - Fiscal page
Given Open the Settings - Fiscal home page BaseURL and StoreID

Scenario: Verify whether the Fiscal Settings Header is Displayed
Given Verifying the Fiscal Settings Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Fiscal Page header
Given Click the New Fiscal Settings button
When Verify the New Fiscal Settings Header

Scenario: Verify whether the All Fields are available in Fiscal Settings
And I Select Settings Tab
Then Check Country Field in Table is Displayed
Then Check Provider Field in Table is Displayed
Then Check VKN Type Field in Table is Displayed
Then Check SCL No Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed
And I Select Fiscal List Tab
Then Check Check ID Field in Table is Displayed
Then Check Date Field in Table is Displayed
Then Check Total Field in Table is Displayed
Then Check Send Field in Table is Displayed
Then Check Actions Field in Table is Displayed
And I Select Settings Tab

#Scenario: Verify whether we able to Create the New Fiscal without Entering Name/Mandatory Fields
#Given Click the New Fiscal Settings button
#And I Click the Save button without Entering Fiscal Name
#
#Scenario: Verify whether we able to Save the Fiscal with Single letter
#Given Click the New Fiscal Settings button
#And I Enter the Single letter in Fiscal Name the Click the Save button


Scenario: Verify VKN Field Allows to Enter Alphabetic Characters
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter Inalid VKN
Then Ckeck VKN Field Accepts Alphabetic Characters or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the VKN Number more than 10 Digit Limits
Given Click the New Fiscal Settings button
And I Enter VKN Number more than 10 Digits
Then Check VKN Field Accepts More than 10 Digits or Not
And I Click the Cancel button

Scenario: Verify SCL Field Allows to Enter Alphabetic Characters
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter Invalid SCL No
Then Ckeck SCL No Field Accepts Alphabetic Characters or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the SCL Number more than 20 Digit Limits
Given Click the New Fiscal Settings button
And I Enter SCL No more than 20 Digits
Then Check SCL No Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Tax Office Name more than 50 Digit Limits
Given Click the New Fiscal Settings button
And I Enter Tax Office Name more than 50 Digits
Then Check Tax Office Name Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Street Name more than 100 Digit Limits
Given Click the New Fiscal Settings button
And I Enter Street Name more than 100 Digits
Then Check Street Name Field Accepts More than 100 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Building Name more than 50 Digit Limits
Given Click the New Fiscal Settings button
And I Enter Building Name more than 50 Digits
Then Check Building Name Field Accepts More than 50 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the City Subdivision Name more than 50 Digit Limits
Given Click the New Fiscal Settings button
And I Enter City Subdivision Name more than 50 Digits
Then Check City Subdivision Name Field Accepts More than 50 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the City Name more than 20 Digit Limits
Given Click the New Fiscal Settings button
And I Enter City Name more than 20 Digits
Then Check City Name Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Postal Zone more than 20 Digit Limits
Given Click the New Fiscal Settings button
And I Enter Postal Zone more than 20 Digits
Then Check Postal Zone Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Region more than 20 Digit Limits
Given Click the New Fiscal Settings button
And I Enter Region more than 20 Digits
Then Check Region Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the District more than 20 Digit Limits
Given Click the New Fiscal Settings button
And I Enter District more than 20 Digits
Then Check District Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Country Name more than 20 Digit Limits
Given Click the New Fiscal Settings button
And I Enter Country Name more than 20 Digits
Then Check Country Name Field Accepts More than 20 Digits or Not
And I Click the Cancel button



Scenario: Verify we can able to Save Fiscal Settings without Entering VKN
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button


Scenario: Verify we can able to Save Fiscal Settings without Entering SCL No
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering Tax Office Name
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering Street Name
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering Builing Name
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering City Subdivision Name
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering City Name
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering Postal Zone
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering Region
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering District
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering Country Name
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

#Scenario: Verify we can able to Save Fiscal Settings without Selecting Provider
#Given Click the New Fiscal Settings button
##And I Select Country
#And I Enter VKN
#And I Enter SCL No
#And I Enter Tax Office Name
#And I Enter Street Name
#And I Enter the Building Name
#And I Enter City Subdivision Name
#And I Enter City Name
#And I Enter Postal Zone
#And I Enter Region
#And I Enter District
#And I Enter Country Name
#And I Select Provider
#And I Enter User Name
#And I Enter Passeord
#Then Check the Save button is Disabled
#And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering User Name
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save Fiscal Settings without Entering Password
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Save a New Fiscal Settings
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
And I Click the Save button
Then Verify whether the New Fiscal Settings Saved or Not

Scenario: Verify the Update header by Editing Saved Fiscal
Given I Search and Edit the Fiscal Settings
When Verify the Update Fiscal Settings Header

Scenario: Verify whether we can able to Cancel/Close the Fiscal Settings Update screen
Given I Search and Edit the Fiscal Settings
And I Click the Cancel button
Then I Verify Fiscal Update screen Close or Not

Scenario: Verify able to search the Fiscal by entering 3 letters of Fiscal Country Name
And I Verify Searching the Item when entering three letters

Scenario: Verify VKN Field Allows to Enter Alphabetic Characters while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter Inalid VKN
Then Ckeck VKN Field Accepts Alphabetic Characters or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the VKN Number more than 10 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter VKN Number more than 10 Digits
Then Check VKN Field Accepts More than 10 Digits or Not
And I Click the Cancel button

Scenario: Verify SCL Field Allows to Enter Alphabetic Characters while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter Invalid SCL No
Then Ckeck SCL No Field Accepts Alphabetic Characters or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the SCL Number more than 20 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter SCL No more than 20 Digits
Then Check SCL No Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Tax Office Name more than 50 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter Tax Office Name more than 50 Digits
Then Check Tax Office Name Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Street Name more than 100 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter Street Name more than 100 Digits
Then Check Street Name Field Accepts More than 100 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Building Name more than 50 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter Building Name more than 50 Digits
Then Check Building Name Field Accepts More than 50 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the City Subdivision Name more than 50 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter City Subdivision Name more than 50 Digits
Then Check City Subdivision Name Field Accepts More than 50 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the City Name more than 20 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter City Name more than 20 Digits
Then Check City Name Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Postal Zone more than 20 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter Postal Zone more than 20 Digits
Then Check Postal Zone Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Region more than 20 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter Region more than 20 Digits
Then Check Region Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the District more than 20 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter District more than 20 Digits
Then Check District Field Accepts More than 20 Digits or Not
And I Click the Cancel button

Scenario: Verify whether the user can able to Enter the Country Name more than 20 Digit Limits while Updating Fiscal Settings
Given I Search and Edit the Fiscal Settings
And I Enter Country Name more than 20 Digits
Then Check Country Name Field Accepts More than 20 Digits or Not
And I Click the Cancel button


Scenario: Verify we can able to Update Fiscal Settings without Entering VKN
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Clear VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering SCL No
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Clear SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering Tax Office Name
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Street Name
And I Clear Tax Office Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering Street Name
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Clear Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering Builing Name
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Clear Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering City Subdivision Name
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Clear City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering City Name
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Clear City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering Postal Zone
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Clear Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering Region
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Clear Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering District
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Clear District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering Country Name
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Clear Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

#Scenario: Verify we can able to Update Fiscal Settings without Selecting Provider
#Given I Search and Edit the Fiscal Settings
##And I Select Country
#And I Enter VKN
#And I Enter SCL No
#And I Enter Tax Office Name
#And I Enter Street Name
#And I Enter the Building Name
#And I Enter City Subdivision Name
#And I Enter City Name
#And I Enter Postal Zone
#And I Enter Region
#And I Enter District
#And I Enter Country Name
#And I Select Provider
#And I Enter User Name
#And I Enter Passeord
#Then Check the Save button is Disabled
#And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering User Name
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Clear User Name
And I Enter Passeord
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update Fiscal Settings without Entering Password
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Clear Password
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify we can able to Update New Fiscal Settings
Given I Search and Edit the Fiscal Settings
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
And I Click the Update button
Then Verify whether the Fiscal Settings Updated or Not

Scenario: Verify whether able to Creating Duplicate Fiscal
Given Click the New Fiscal Settings button
#And I Select Country
And I Enter VKN
And I Enter SCL No
And I Enter Tax Office Name
And I Enter Street Name
And I Enter the Building Name
And I Enter City Subdivision Name
And I Enter City Name
And I Enter Postal Zone
And I Enter Region
And I Enter District
And I Enter Country Name
And I Select Provider
And I Enter User Name
And I Enter Passeord
And I Click the Save button 
#Then Verify whether the Duplicate Fiscal is Saved or Not
Then Check SCL No Already Exists Error is Displayed
And I Click the Cancel button

Scenario: Verify whether Unable to Removed the Fiscal Clicking Cancel/No button
And I Select Settings Tab
Given I Search the Fiscal Settings and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Fiscal Settings Removed/Inactivated or Not

Scenario: Verify whether Able to Removed the Fiscal Clicking Delete/Yes button
Given I Search the Fiscal Settings and Click the Delete button
And I Click the Delete button
Then I Verifying the Fiscal Settings Removed or Not

Scenario: Verify able to view the available Fiscal List
And I Select Fiscal List Tab
Then Verify whether the Available Fiscal List is Available or Not

Scenario: Verify able to search the Fiscal List by entering 3 letters of Fiscal Check ID
And I Select Fiscal List Tab
And I Verify Searching the Item when entering three letters

Scenario: Verify whether Unable to Removed the Fiscal Clicking Cancel/No button
And I Select Fiscal List Tab
Given I Search the Fiscal Check ID and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Fiscal List Removed/Inactivated or Not

Scenario: Verify whether Able to Removed the Fiscal Clicking Delete/Yes button
And I Select Fiscal List Tab
Given I Search the Fiscal Check ID and Click the Delete button
And I Click the Delete button
Then I Verifying the Fiscal List Removed or Not



#Scenario: Generate Extent Report for the module
#Given Create the Extent Report

 
