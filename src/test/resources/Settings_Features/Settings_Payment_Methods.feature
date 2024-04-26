@Settings
@Payment_Methods_Settings
@Settings01

Feature: Settings - Payment Methods Settings
	I Verifying the Settings - Payment Methods Settings
	
Background: Open the Settings - Payment Methods Settings Home Page
Given Open the Settings - Payment Methods Settings home page BaseURL and storeID

Scenario: Verify whether the Settings - Payment Methods Settings Header is Displayed
Given Verifying the Settings - Payment Methods Settings Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New Modifier Group Page header
Given I Click the New Payment Method button
Then Verify the New Payment Method Header
Then I Click the Cancel button

Scenario: Verify whether the All Fields are available in Payment Methods Settings
Then Check Add Payment Method Field is Displayed
Then Check Payment Type Field is Displayed
Then Check Name Field in Table is Displayed
Then Check Priority in Table Field is Displayed
Then Check Amount in Table Field is Displayed
Then Check Open Cash Drawer Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed

Scenario: Verify whether the user can able to Enter the Payment Method Name above the limit
Given I Click the New Payment Method button
And I Enter the Payment Method Name Exceeding the limit

Scenario: Verify able to Save Payment Method without Name
Given I Click the New Payment Method button
And I Select Payment Type as Cash
And I Enter the Code
And I Enter the Priority
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Save Payment Method without Selecting Payment Type
Given I Click the New Payment Method button
And I Enter the Payment Method Name
And I Enter the Code
And I Enter the Priority
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Save Payment Method without Selecting Multi Currency
Given I Click the New Payment Method button
And I Enter the Payment Method Name
And I Select Payment Type as Cash
And I Enter the Code
And I Enter the Priority
And I Enable Multi Currency Toggle
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Save Payment Method without Entering Exchange Rate
Given I Click the New Payment Method button
And I Enter the Payment Method Name
And I Select Payment Type as Cash
And I Enter the Code
And I Enter the Priority
And I Enable Multi Currency Toggle
And I Select the Currency
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Save Payment Method as Cash
Given I Click the New Payment Method button
And I Enter the Payment Method Name
And I Select Payment Type as Cash
And I Enter the Code
And I Enter the Priority
And I Enable Open Cash Drawer Toggle
#And I Enable Exempt Surcharge Toggle
And I Click the Save button
Then Verify whether Payment Method is Saved or Not

Scenario: Verify the Update header by Editing Saved Payment Method
Given I Search and Edit the Payment Method
When Verify the Update Payment Method Header

Scenario: Verify whether we can able to Cancel/Close the Coursing Update screen
Given I Search and Edit the Payment Method
And I Click the Cancel button
Then I Verify Payment Method Update screen Close or not

Scenario: Verify able to search the Payment Method by entering 3 letters of Payment Name
And I Verify Searching the Item when entering three letters

Scenario: Verify able to Update Payment Method without Name
Given I Search and Edit the Payment Method
And I Clear the Name
And I Select Payment Type as Cash
And I Enter the Code
And I Enter the Priority
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Payment Method without selecting Multi Currency
Given I Search and Edit the Payment Method
#And I Enter the Payment Method Name
#And I Select Payment Type as Cash
#And I Enter the Code
#And I Enter the Priority
And I Enable Multi Currency Toggle
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify able to Update Payment Method without Entering Exchange Rate
Given I Search and Edit the Payment Method
#And I Enter the Payment Method Name
#And I Select Payment Type as Cash
#And I Enter the Code
#And I Enter the Priority
And I Enable Multi Currency Toggle
And I Select the Currency
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Update Cash Payment Method with Multi Currency
Given I Search and Edit the Payment Method
#Then Check Open Cash Drawer Toggle is Enabled
#Then Check Exempt Surcharge Toggle is Enabled
And I Enter the Payment Method Name
And I Select Payment Type as Cash
And I Enter the Code
And I Enter the Priority
And I Enable Multi Currency Toggle
And I Select the Currency
And I Enter the Exchange Rate
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method by Enabling Open Drawer & Exchange Surcharge Toggle
Given I Search and Edit the Payment Method
#And I Enter the Payment Method Name
#And I Select Payment Type as Cash
#And I Enter the Code
#And I Enter the Priority
#And I Enable Multi Currency Toggle
#And I Select the Currency
#And I Enter the Exchange Rate
And I Enable Open Cash Drawer Toggle
And I Enable Exempt Surcharge Toggle
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method by Disabling Open Drawer & Exchange Surcharge Toggle
Given I Search and Edit the Payment Method
#And I Enter the Payment Method Name
Then Check Open Cash Drawer Toggle is Enabled
#Then Check Exempt Surcharge Toggle is Enabled
#And I Select Payment Type as Cash
#And I Enter the Code
#And I Enter the Priority
#And I Enable Multi Currency Toggle
#And I Select the Currency
#And I Enter the Exchange Rate
And I Disable Open Cash Drawer Toggle
And I Disable Exempt Surcharge Toggle
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Gift Card
Given I Search and Edit the Payment Method
And I Enter the Payment Method Name
And I Select Payment Type as Gift Card
#And I Enter the Code
#And I Enter the Priority
Then Check Enable Multi Currency Toggle is Not Displayed
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Credit Card
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Gift Card
And I Select Payment Type as Credit Card
Then Check Debit Toggle is Displayed
And I Enable Debit Toggle
Then Check Exempt Surcharge Toggle is Disabled
And I Disable Debit Toggle
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

#Scenario: Update Payment Method to Credit Card
#Given I Search and Edit the Payment Method
#Then Check Selected Payment Type as Gift Card
#And I Select Payment Type as Credit Card
#Then Check Debit Toggle is Displayed
#And I Enable Debit Toggle
#Then Check Exempt Surcharge Toggle is Disabled
#And I Disable Debit Toggle
#And I Click the Update button
#Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Side CC with Enable Multi Currency
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Credit Card
And I Select Payment Type as Side CC
Then Check Enable Multi Currency Toggle is Displayed
Then Check Debit Toggle is Displayed
Then Check Open Cash Drawer Toggle is Displayed
Then Check Exempt Surcharge Toggle is Displayed
And I Enable Debit Toggle
Then Check Exempt Surcharge Toggle is Disabled
And I Disable Debit Toggle
And I Enable Multi Currency Toggle
Then Check the Update button is Disabled
And I Select the Currency
Then Check the Update button is Disabled
And I Enter the Exchange Rate
And I Click the Update button
Then Verify whether Payment Method is Updated or Not


Scenario: Update Payment Method to Side CC By Disabling Multi Currency
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Side CC
Then Check Enable Multi Currency Toggle is Enabled
#And I Select Payment Type as Side CC
#Then Check Enable Multi Currency Toggle is Displayed
#Then Check Debit Toggle is Displayed
#Then Check Open Cash Drawer Toggle is Displayed
#Then Check Exempt Surcharge Toggle is Displayed
#And I Enable Debit Toggle
#Then Check Exempt Surcharge Toggle is Disabled
#And I Disable Debit Toggle
And I Disable Multi Currency Toggle
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Bionet Meal Card
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Side CC
Then Check Enable Multi Currency Toggle is Disabled
And I Select Payment Type as Bionet Meal Card
#Then Check Enable Multi Currency Toggle is Not Displayed
#Then Check Debit Toggle is Not Displayed
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Castle and Go
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Bionet Meal Card
And I Select Payment Type as Castle and Go
#Then Check Enable Multi Currency Toggle is Not Displayed
#Then Check Debit Toggle is Not Displayed
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to SPPax by Enabling EBT & Valutec Toggle
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Castle and Go
And I Select Payment Type as SPPax
Then Check Model Type Field is Displayed 
Then Check Enable EBT Toggle is Displayed
Then Check Factor4 Cards Toggle is Displayed
Then Check Valutec Cards Toggle is Displayed
And I Enable EBT Toggle
And I Enable Valutec Cards Toggle
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to SPPax by Enabling Factor4 Cards Toggle
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as SPPax
Then Check Enable EBT Toggle is Enabled
Then Check Valutec Cards Toggle is Enabled 
And I Enable Factor4 Cards Toggle
Then Check Enable EBT Toggle is Disabled
Then Check Enable Valutec Cards Toggle is Disabled
And I Enable EBT Toggle
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to SPPax by Disabling EBT, Factor4 Cards, Valutec Cards Toggle
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as SPPax
Then Check Enable EBT Toggle is Enabled
Then Check Factor4 Cards Toggle is Enabled 
And I Enable Valutec Cards Toggle
Then Check Factor4 Cards Toggle is Disabled
And I Disable Enable EBT Toggle
And I Disable Factor4 Cards Toggle
And I Disable Valutec Cards Toggle
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Others
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as SPPax
Then Check Enable EBT Toggle is Disabled
Then Check Factor4 Cards Toggle is Disabled 
Then Check Valutec Cards Toggle is Disabled
And I Select Payment Type as Others
#Then Check Enable Multi Currency Toggle is Not Displayed
#Then Check Debit Toggle is Not Displayed
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to GiveX
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Others
And I Select Payment Type as GiveX
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to HA Payment
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as GiveX
And I Select Payment Type as HA Payment
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to NMI Tokenization
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as HA Payment
And I Select Payment Type as NMI Tokenization
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Dejavoo
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as NMI Tokenization
And I Select Payment Type as Dejavoo
Then Check Enable EBT Toggle is Displayed
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Optomany
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Dejavoo
And I Select Payment Type as Optomany
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to MPPG Credit Card as Authorize
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Optomany
And I Select Payment Type as MPPG Credit Card
And I Select Type as Authorize
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to MPPG Credit Card as Sale
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as MPPG Credit Card
Then Check Type is Selected as Authorize
And I Select Payment Type as MPPG Credit Card
And I Select Type as Sale
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Ingenico
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as MPPG Credit Card
Then Check Type is Selected as Sale
And I Select Payment Type as Ingenico
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Update Payment Method to Cash
Given I Search and Edit the Payment Method
Then Check Selected Payment Type as Ingenico
And I Select Payment Type as Cash
And I Click the Update button
Then Verify whether Payment Method is Updated or Not

Scenario: Save Payment Method as Gift Card
Given I Click the New Payment Method button
And I Enter the Payment Method Name for Gift Card
And I Select Payment Type as Gift Card
And I Click the Save button
Then Verify whether Payment Method is Saved or Not

Scenario: Save Payment Method as Credit Card
Given I Click the New Payment Method button
And I Enter the Payment Method Name for Credit Card
And I Select Payment Type as Credit Card
And I Disable Debit Toggle
And I Click the Save button
Then Verify whether Payment Method is Saved or Not

Scenario: Save Payment Method as Side CC
Given I Click the New Payment Method button
And I Enter the Payment Method Name for Side CC
And I Select Payment Type as Side CC
And I Click the Save button
Then Verify whether Payment Method is Saved or Not

Scenario: Save Payment Method as Bionet Meal Card
Given I Click the New Payment Method button
And I Enter the Payment Method Name for Bionet Meal Card
And I Select Payment Type as Bionet Meal Card
And I Click the Save button
Then Verify whether Payment Method is Saved or Not

Scenario: Create Duplicate Payment Method
Given I Click the New Payment Method button
And I Enter the Payment Method Name
And I Select Payment Type as Cash
Then Check Name Already Exist Error in Name Field is Displayed
Then Check the Save button is Disabled
#And I Click the Save button
#Then Verify whether Duplicate Payment Method is Saved or Not
And I Click the Cancel button

Scenario: Verify whether Unable to Delete the Payment Method Clicking Cancel/No button
Given I Search the Payment Method and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Payment Method Deleted or not

Scenario: Verify whether Able to Delete the Payment Method Clicking Delete/Yes button
Given I Search the Payment Method and Click the Delete button
And I Click the Delete button
Then I Verifying the Payment Method Deleted or not


