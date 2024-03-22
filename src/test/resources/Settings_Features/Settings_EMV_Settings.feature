@Settings
@EMVSettings

Feature: Settings - EMV Settings
I am verify the Settings- EMV Settings Module and Performing Some Operations on that

Scenario: Opening the EMV Settings page
Given Open EMV Settings home page BaseURL and StoreID

Scenario: Verify whether the EMV Settings Header is Displayed
Given Verifying the EMV Settings Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify New EMV Settings Header Page
Given Click on New EMV Settings button
Then verify New EMV Settings Header
And I Click the Cancel button

Scenario: Verify Whether Able to Create New EMV Without Entering Name
Given Click on New EMV Settings button
And Enter IP Address
And Select Type as SP-PAX
Then Select Serial Number
Then Verify whether the Save button is Disabled
 And I Click the Cancel button

Scenario: Verify whether able to Create New EMV without Entering IP Address
Given Click on New EMV Settings button
And Enter EMV Settings Name
And Select Type as SP-PAX
Then Select Serial Number
Then Verify whether the Save button is Disabled
 And I Click the Cancel button
 
 Scenario: Verify whether able to Create New EMV without Selecting Type
 Given Click on New EMV Settings button
And Enter EMV Settings Name
And Enter IP Address
Then Verify whether the Save button is Disabled
 And I Click the Cancel button
 
 Scenario: Enter Invalid IP Address and Click on Save
Given Click on New EMV Settings button
And Enter EMV Settings Name
And Enter Invalid IP Address
And Select Type as SP-PAX
Then Select Serial Number
And I Click the Save button
Then Verify Enter Valid IP Address Error Popup

Scenario: Create New EMV Settings with Mandatory Fields
And Enter EMV Settings Name
And Enter IP Address
And Select Type as SP-PAX
Then Select Serial Number
And I Click the Save button
Then Verify EMV Setting Saved or Not

Scenario: Verify Able to Save EMV Settings with Type as OPTOMANY
Given Click on New EMV Settings button
And Enter EMV Settings Name for OPTOMANY
And Enter IP Address OPTOMANY
And Select the Type as OPTOMANY
And I Click the Save button
Then Verify EMV Setting Saved or Not

Scenario: Verify able to Save EMV Settings with Type as INGENICO
Given Click on New EMV Settings button
And Enter EMV Settings Name for INGENICO
And Enter IP Address INGENICO
And Select the Type as INGENICO
And I Click the Save button
Then Verify EMV Setting Saved or Not

Scenario: Verify able to Save EMV Settings with Type as CLOVER
Given Click on New EMV Settings button
And Enter EMV Settings Name for CLOVER
And Enter IP Address CLOVER
And Select the Type as CLOVER
And I Click the Save button
Then Verify EMV Setting Saved or Not

Scenario: Verify able to Save EMV Settings with Type as MONERIS
Given Click on New EMV Settings button
And Enter EMV Settings Name for MONERIS
And Enter IP Address MONERIS
And Select the Type as MONERIS
And I Click the Save button
Then Verify EMV Setting Saved or Not

Scenario: Verify able to Save EMV Settings with Type as EVERTEC
Given Click on New EMV Settings button
And Enter EMV Settings Name for EVERTEC
And Enter IP Address EVERTEC
And Select the Type as EVERTEC
And Enter Terminal ID
And I Click the Save button
Then Verify EMV Setting Saved or Not

Scenario: Verify able to Save EMV Settings with Type as DEJAVOO
Given Click on New EMV Settings button
And Enter EMV Settings Name for DEJAVOO
And Enter IP Address DEJAVOO
And Select the Type as DEJAVOO
And Enter Authorization Key
And Enter TPN Value
And Enter Token Value
And I Click the Save button
Then Verify EMV Setting Saved or Not

 Scenario: Verify able to search the Reason by entering 3 letters of EMV
 And I Verify Searching the Item when entering three letters
 
Scenario: Verify the Update header by Editing Saved EMV Setting
Given I Search and Edit the EMV Settings
Then Verify the Update EMV Settings Header
  
Scenario: Verify whether we can able to Cancel/Close the EMV Settings Update screen
And I Click the Cancel button
Then I Verify EMV Settings Update screen Closed or Not

Scenario: Verify Able to Update EMV Settings Without Entering Name
Given I Search and Edit the EMV Settings
Then Clear the Name
Then Verify whether the Update button is Disabled
And I Click the Cancel button

Scenario: Verify Able to Update EMV Settings Without Entering IP Address
Given I Search and Edit the EMV Settings
Then Clear the IP Address
Then Verify whether the Update button is Disabled
And I Click the Cancel button

Scenario: Update the EMV Settings
Given I Search and Edit the EMV Settings
And Enter EMV Settings Name
And I Click the Update button
Then Verify EMV Settings Updated or Not

Scenario: Create a Duplicate EMV Settings with Same IP Address
Given Click on New EMV Settings button
And Enter New EMV Settings Name
Then Enter IP Address
Then Verify IP Address Already Exist Error Message
Then Verify whether the Save button is Disabled

Scenario: Create a Duplicate EMV Settings with Same Name
#Given Click on New EMV Settings button
And Enter EMV Settings Name
Then Enter New IP Address
And I Click the Save button
Then Verify Name Already Exist Error Message
Then Verify whether the Save button is Disabled
And I Click the Cancel button

Scenario: Verify whether able to Delete EMV Setting After Clicking On Cancel
Given Search EMV Setting and Click on Delete
And I Click the Cancel button in Pop Up
Then Verify the Cancelled EMV Setting Deleted or Not

Scenario: Verify whether able to Delete After Clicking on Delete
Given Search EMV Setting and Click on Delete
And I Click the Delete button in EMV
Then Verify EMV Setting Deleted or Not









 
