@Settings
@BatchSettings

Feature: Settings - Batch
I am verify the Settings- BatchSettings Module and Performing Some Operations on that

Scenario: Opening the Store Information page
Given Open BatchSettings home page BaseURL and StoreID

Scenario: Verify whether the BatchSettings Header is Displayed
Given Verifying the BatchSettings Header Page

Scenario: Verify Update button is Enabled without any changes After Opening Page
Then Verify whether the Update button is Disabled in Batch
 
Scenario: Verifying the Available Data Displayed or Not
Then Verify Enable Auto Batch Toggle is Displayed or Not
Then Verify Print Batch Report Toggle is Displayed or Not
Then Verify Batch Submit Device is Displayed or Not
Then Verify Default Batch Payment is Displayed or Not

Scenario: Verify the Batch Device Table Data is Displayed or Not
Then Verify TicketNo Field in Table Displayed or Not
Then Verify CardNo Field in Table Displayed or Not
Then Verify Amount Field in Table Displayed or Not
Then Verify Tip Amount Field in Table Displayed or Not
Then Verify Actions Field in Table Displayed or Not

Scenario: Verify the Toggle is Enabled By Default
Then Verify Enable Auto Auton Batch is Enabled or Not
Then Verify Print Batch Report is Enabled or Not

Scenario: Disable the Toggles
And Disable the Enable Auto Batch Toggle
Then Verify Print Batch Report Toggle is Displayed or Not
Then Enable the Enable Auto Batch Toggle
Then Verify Print Batch Report Toggle is Displayed or Not
 And I Click the Update button in Batch Settings
 Then Verify Batch Settings Updated or Not
 Then Disable Print Batch Report Toggle 
  And I Click the Update button in Batch Settings
 Then Verify Batch Settings Updated or Not
  Then Enable Print Batch Report Toggle 
   And I Click the Update button in Batch Settings
 Then Verify Batch Settings Updated or Not
 
 Scenario: Select the Time and Click on Update
 Then Select the Time
 And I Click the Update button in Batch Settings
 Then Verify Batch Settings Updated or Not
   
 Scenario: Select the Batch Submit Device and Update
 Given Select Batch Submit Device From dropdown
 And I Click the Update button in Batch Settings
 Then Verify Batch Settings Updated or Not

 Scenario: Select Default Batch Payment Device
 Given Select the Default Batch Payment Device
 And I Click the Update button in Batch Settings
 Then Verify Batch Settings Updated or Not
 
Scenario: Verify the Batch is Available and Click on Cancel the Delete
Given Search the Batch and click on Delete and Cancel
#And I Click the Cancel button in Pop Up
#Then Verify Cancelled Batch Deleted or Not

Scenario: Verify the Batch is Available and click on Delete
Given Search the Batch and click on Delete
#And I Click the Delete button in Pop Up
#Then Verify Batch Deleted or Not
 
 
 
 




 