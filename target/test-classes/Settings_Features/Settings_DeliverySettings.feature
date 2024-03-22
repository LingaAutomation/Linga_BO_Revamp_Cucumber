@Settings
@DeliverySettings

Feature: Settings - Delivery Settings
I am verify the Settings- DeliverySettings Module and Performing Some Operations on that

Scenario: Opening the Store DeliverySettings page
Given Open DeliverySettings home page BaseURL and StoreID

Scenario: Verify whether the DeliverySettings Header is Displayed
Given Verifying the DeliverySettings Header Page

Scenario: Verify Save button is Enabled without any changes After Opening Page
Given Click on Settings Tab Under Settings
Then Verify whether the Save button is Disabled

Scenario: Verify the Available Fields Under Delivery Settings
Then Verify Sync Data to Weborder Field is Displayed or Not
Then Verify DeliveryCharge Cost Field is Displayed or Not
Then Verify DeliveryCharge Compensastion to Driver is Displayed or Not
Then Verify Print Future Order Before is Displayed or Not
Then Verify Assign Order to Departed Driver Toggle is Displayed or Not
Then Verify Cashier report for Driver Toggle is Displayed or Not

Scenario: Verify Sync Data and Cancel the Sync
Given Click on Sync Data
Then I Click on No button 

Scenario: Verify Sync Data and Sync the Data
Given Click on Sync Data
And Click on Yes button
Then Verify Data Synced or Not

Scenario: Enter the Cost Exceeding the Limit
Given Clear the Cost Filed
Then Enter Cost Exceeding Limit

Scenario: Enter Delivery Charge Cost and Save the Data
Given Clear the Cost Filed
And Enter Valid Cost
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not

Scenario: Enter Invalid Delivery Charge Compensation to Driver
Given Clear the Percenatge Filed
And Enter Invalid Percentage
Then Verify Percentage should not be greater than hundred Error Message
Then Verify whether the Save button is Disabled

Scenario: Enter valid Delivery Charge Compensation to Driver
Given Clear the Percenatge Filed
And Enter Valid Percentage
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not

Scenario: Increase the Percentage By using UpArrow and Save
Given Click on UpArrow in Percentage 
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not
Then Verify Percentage is Increased or Not 


Scenario: Decrease the Percentage by Using DownArrow and Save
Given Click on DownArrow in Percentage 
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not
Then Verify Percentage is Decreased or Not 


Scenario: Enter Print Future Order Before Time Exceeding Limit
Given Clear the Minutes Field
Then Enter Minutes Exceeding Limit

Scenario: Enter Valid Print Future Order Before Time 
Given Clear the Minutes Field
Then Enter Valid Minutes
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not

Scenario: Increase the Minutes Value By Using UpArrow
Given Click on UpArrow in Minutes
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not
Then Verify Verify Minutes Increased or Not

Scenario: Decrease the Minutes Value By Using DownArrow
Given Click on DownArrow in Minutes
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not
Then Verify Verify Minutes Decreased or Not

Scenario: Enable the Assign Order to Departed Driver
And Disable Assign Order to Departed Driver Toggle
And Enable Assign Order to Departed Driver Toggle
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not

Scenario: Enable Cashier Report for Driver Toggle
Given Disable Enable Cashier Report for Driver Toggle
And Enable Enable Cashier Report for Driver Toggle
And I Click the Save button in Delivery Settings
Then Verify Delivery Settings Saved Or Not

Scenario: Navigate to Delivery Zone and Verfiy the Heading
Given Click on Delivery Zone
And Verify Delivery Zone Heading

#Scenario: Verify whether we can able to do Pagination
#Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify Available Fields Displayed in Table or Not
Then Verify Name Filed in Table Displayed or Not
Then Verify Charge Cost Field in Table Displayed or Not
Then Verify Exp Delivery Time Field in Table Displayed or Not
Then Verify Actions Field in Table Displayed or Not

Scenario: Click on New Delivery Zone and Cancel the Creation Screen
Given Click on New Delivery Zone
Then Verify Creation Screen Page Header
Then I Click the Cancel button

Scenario: Click on New Delivery Zone and Enter Only Name and Verify save button
Given Click on New Delivery Zone
And Enter Delivery Zone Name
Then Verify whether the Save button is Disabled
Then I Click the Cancel button

Scenario: Enter Delivery Zone with only Delivery Charge Cost
Given Click on New Delivery Zone
And Enter Delivery Charge Cost
Then Verify whether the Save button is Disabled
Then I Click the Cancel button

Scenario: Enter Delivery Zone with Only Expected Delivery Time
Given Click on New Delivery Zone
And Enter Expected Delivery Time
Then Verify whether the Save button is Disabled
Then I Click the Cancel button

Scenario: Create Delivery Zone Without Selecting Zone Area
Given Click on New Delivery Zone
And Enter Delivery Zone Name
And Enter Delivery Charge Cost
And Enter Expected Delivery Time
And I Click the Save button
Then Verify Draw Your Delivery Zone Popup Displayed or Not
Then I Click the Cancel button

Scenario: Create New Delivery Zone
Given Click on New Delivery Zone
And Enter Delivery Zone Name
And Enter Delivery Charge Cost
And Enter Expected Delivery Time
And Select the Zone Area
And I Click the Save button
Then Verify whether Delivery zone Saved or Not

Scenario: Click on Edit Delivery Zone and Cancel the Edit Screen
Given Search and Click Edit Delivery Zone
Then Verify Update Screen Header
Then I Click the Cancel button

Scenario: Update the Delivery Zone Without Enter Name
Given Search and Click Edit Delivery Zone
Given Clear the Name
Then Verify whether the Update button is Disabled
Then I Click the Cancel button

Scenario: Update Delivery Zone without Entering Charge Cost
Given Search and Click Edit Delivery Zone
Then Clear Delivery Charge Cost
Then Verify whether the Update button is Disabled
Then I Click the Cancel button

Scenario: Update Delivery Zone without Entering Expected Delivery Time
Given Search and Click Edit Delivery Zone
Then Clear Expected Delivery Time
Then Verify whether the Update button is Disabled
Then I Click the Cancel button

Scenario: Update the Delivery Zone
And Enter Delivery Zone Name
And Enter Delivery Charge Cost
And Enter Expected Delivery Time
And I Click the Update button
Then Verify Delivery Zone Updated Or Not

Scenario: Verify Able to Inactivate Delivery Zone after clicking on Cancel
Given Search the Delivery Zone and Click the Delete button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Delivery Zone Inactivated or Not

 Scenario: Verify whether Able to Inactivate the Delivery Zone Clicking Delete/Yes button
 Given Search the Delivery Zone and Click the Delete button
 And I Click the Delete button
 Then I Verifying the Delivery Zone Deleted or Not
 And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Delivery Zone
 
 Scenario: Verify whether Unable to Activate the Delivery Zone Clicking Cancel/No button
 Given I Search the Delivery Zone and Click the Active button
 And I Click the Cancel button in Pop Up
 Then Verify the Cancelled Delivery Zone is Activated or Not

 Scenario: Verify whether Able to Activate the Delivery Zone Clicking Delete/Yes button
 Given I Search the Delivery Zone and Click the Active button
 And I Click the Activate button
 Then I Verifying the Delivery Zone Activated or Not
 And I Click the Active button to navigate Activated screen to Verify Activated Delivery Zone
    
 Scenario: Click on PUC and Navigate to PUC 
 Given Click on PUC Tab
 Then Verify PUC Screen Header
    
 Scenario: Enable the Toggle and Enter All the Details
 Given Disable Enable PUC Toggle
 Then Enable Enable PUC Toggle
 Then Verify whether the Save button is Disabled in PUC
 Then Verify API Key Field is Displayed or Not
 Then Verify Cabinate Alias Field is Dispalyed or Not
 Then Verify Cabinate ID Field is Dispalyed or Not
    
  Scenario: Enter API Key in the Form of Numbers
  Given Clear the API Key
  Then Enter API Key in the Form of Numbers
  Then Verify whether the Save button is Disabled in PUC
     
Scenario: Enter API Key in the Form of Special characters and Numbers and Alphabets
Given Clear the API Key
Then Enter API Key in the Form of Numbers Special Characters and Alphabets
  Then Verify whether the Save button is Disabled in PUC
       
Scenario: Enter Cabinate Alias as Combination of Special characters and Numbers and Alphabets
Given Clear the Cabinate Alias
Then Enter Cabinate Alias in the Form of Numbers Special Characters and Alphabets
And I Click the Save button in Delivery Settings
Then Verify whether PUC Settings Saved or Not
  
Scenario: Enter Cabinate ID in the form of Special characters and Numbers and Alphabets
Given Clear the Cabinate ID
Then Enter Cabinate ID in the Form of Numbers Special Characters and Alphabets
And I Click the Save button in Delivery Settings
Then Verify whether PUC Settings Saved or Not
  
Scenario: Click on Driver Tab and Navigate to Driver
Given Click on Driver Tab
Then Verify Main Screen Page Header
  
Scenario: Enable the Enable Tracking Toggle
Given Disable Enable Tarcking Toggle
Then Enable Enable Tracking Toggle
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not

Scenario: Enter Map API Key and Save the Date
Given Clear the Map API Key
Then Enter Map API Key
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 
  
Scenario: Enable Direction Toggle
Given Disable Directions Toggle
Then Enable Directions Toggle
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enable Show Inactive Drivers Toggle
Given Disable Show Inactive Drivers Toggle
Then Enable show Inactive Drivers Toggle
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enter Order Undelivered From Driver 
And Clear the Order Undelivered From Driver
Then Enter Order Undelivered From Driver
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enable and Disable Driver Departure Toggle 
Given Disable Driver Departure Toggle
Then Enable Driver Departure Toggle
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enter Driver Departure Message
And Clear the Driver Departure Input Field
Then Enter Driver Departure Text Message
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enable and Disable Order Delayed Toggle
Given Disable Order Delayed Toggle
Then Enable Order Delayed Toggle
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not

Scenario: Enter Order Delayed Text Message
And Clear the Order Delayed Input Field
Then Enter Order Delayed Text Message
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enable and Disable Undelivered Toggle
Given Disable Undelivered Toggle
Then Enable Undelivered toggle
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not

Scenario: Enter Undelivered Text Message
And Clear the Undelivered Input Field
Then Enter Undelivered Text Message
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enable and Disable Near by Toggle
Given Disable Near By Toggle
Then Enable Near By Toggle
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not

Scenario: Enter Near By Text Message
And Clear the Near By Input Field
Then Enter Near By Text Message
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enable and Disable Completed Toggle
Given Disable Completed Toggle
Then Enable Completed Toggle
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not 

Scenario: Enter Completed Text Message
And Clear the Completed Input Field
Then Enter Completed Text Message
And I Click the Save button in Delivery Settings
Then Verify whether Driver Settings Saved or Not







  
  
  
 


















