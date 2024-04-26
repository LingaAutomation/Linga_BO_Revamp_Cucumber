@Settings
@Till_Settings
@Settings01

Feature: Settings - Till Settings
	I Verifying the Settings - Till Settings
	
Background: Open the Settings - Till Settings Home Page
Given Open the Settings - Till Settings home page BaseURL and storeID

Scenario: Verify whether the Settings - Till Settings Header is Displayed
Given Verifying the Settings - Till Settings Header Page

Scenario: Verify whether the Update button is Disabled while Opening Page
Then Check the Update buttonTwo is Disabled

Scenario: Verify whether the All Fields are available in Till Settings
And I Select Till Settings Tab
Then Check Automatic Global Till Toggle is Displayed
And I Enable Automatic Global Till Toggle
Then Check Global Till Opening Balance Field is Displayed
Then Check Force Cash Out at Clock Out Toggle is Displayed
Then Check Restrict Partial Payments Toggle is Displayed
Then Check Add Bank Deposit Field is Displayed
And I Select Denominations Tab
Then Check Add Denomination Field is Displayed
And I Select Close Till Tab
Then Check Rows Per Page Filter Field is Displayed
And I Select Till Settings Tab

Scenario: Updating Till Settings by Disabling Automatic Global Till, Force Cash Out at Clock Out, Restrict Partial Payments Toggles
And I Enable Automatic Global Till Toggle
And I Disable Automatic Global Till Toggle
And I Disable Force Cash Out at Clock Out Toggle
And I Disable Restrict Partial Payments Toggle
And I Click the Update buttonTwo 
Then Verify Till Settings Updated or Not

Scenario: Check the Disabled Toggles Till Settings Tab
Then Check Automatic Global Till Toggle is Disabled
Then Check Force Cash Out at Clock Out Toggle is Disabled
Then Check Restrict Partial Payments Toggle is Disabled

Scenario: Updating Till Settings by Enabling Toggles in Till Settings Tab
And I Enable Automatic Global Till Toggle
And I Enable Force Cash Out at Clock Out Toggle
And I Enable Restrict Partial Payments Toggle
And I Click the Update buttonTwo 
Then Verify Till Settings Updated or Not

Scenario: Check the Enabled Toggles Till Settings Tab
Then Check Automatic Global Till Toggle is Enabled
Then Check Force Cash Out at Clock Out Toggle is Enabled
Then Check Restrict Partial Payments Toggle is Enabled

Scenario: Create a Bank Deposit
And I Click the New Bank Deposit button
Then Verify whether New Bank Deposit Header
Then Check the Save button is Disabled
And I Enter the Deposit Amount
And I Select the Business Date
And I Click the Save button
Then Verify Bank Deposit Updated or Not

Scenario: Create a New Denomination without Display Name
And I Select Denominations Tab
And I Click the New Denomnination button
Then Verify whether New Denomination Header
And I Clear the Display Name
And I Enter the Amount
Then Check the Save button is Enabled

Scenario: Create a New Denomination without Amount
And I Select Denominations Tab
#And I Click the New Denomnination button
#Then Verify whether New Denomination Header
And I Enter the Display Name
And I Enter the Amount as Zero
#Then Check the Save button is Enabled
And I Click the Save button
Then Check Please Enter Amount Error is Displayed

Scenario: Create a New Denomination without Amount
And I Select Denominations Tab
And I Enter the Display Name
And I Enter the Amount
#Then Check the Save button is Enabled
And I Click the Save button
Then Verify Denomination Saved or Not

Scenario: Verify whether Unable to Delete the Denomination Clicking Cancel/No button
Given I Search the Denomination and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Denomination Deleted or Not

Scenario: Verify whether Able to Delete the Denomination Clicking Delete/Yes button
Given I Search the Denomination and Click the Delete button
And I Click the Delete button
Then I Verifying the Denomination Deleted or Not

Scenario: Verify whether Unable to Close the Till Clicking Cancel/No button
Given I Search the Till and Click the Close button
 And I Click the No button in Pop Up
Then Verify the Cancelled Till Closed or Not

Scenario: Verify whether Able to Close the Till Clicking Close/Yes button
Given I Search the Till and Click the Close button
 And I Click the Yes button in Pop Up
Then Verify the Till Closed or Not


	




