@Settings
@TableLayout

Feature: Settings - Table Layout
I am verify the Settings- Table Layout Module and Performing Some Operations on that

Background: Opening the Table Layout page
Given Open Table Layout home page BaseURL and StoreID

Scenario: Verify whether the Table Layout Header is Displayed
Given Verifying the Table Layout Header Page

Scenario: Verify Available Fields in Table Layout
Then Verify Add Floor button is Displayed or Not
Then Verify Static object is Displayed or Not
Then Verify Table Name Checkbox is Displayed or Not
Then Verify Guest Count Checkbox is Displayed or Not
Then Verify Customer Checkbox is Displayed or Not
Then Verify Employee Checkbox is Displayed or Not
Then Verify Wait Time Checkbox is Displayed or Not
Then Verify Floor Settings is Displayed or Not
Then Verify Delete Floor is Displayed or Not

Scenario: Uncheck the Available Checkboxes and Save the Data
And Uncheck the Table Name Checkbox
And Uncheck the Guest Count Checkbox
And Uncheck the Customer Checkbox
And Uncheck the Employee Checkbox
And Uncheck the Wait Time Checkbox
And I Click the Save button in Delivery Settings
Then Verify Table Layout Settings Saved or Not

Scenario: Check the Available Checkboxes and Save the Data
And Check the Table Name Checkbox
And Check the Guest Count Checkbox
And Check the Customer Checkbox
And Check the Employee Checkbox
And Check the Wait Time Checkbox
And I Click the Save button in Delivery Settings
Then Verify Table Layout Settings Saved or Not

Scenario: Verify New Floor Creation Screen Header
Given Click on Add Floor button
Then Verify New Floor Header
And I Click the Cancel button

Scenario: Verify Whether User Able to Create New Floor without Mandatory Fields
Given Click on Add Floor button
Then Verify whether the Save button is Disabled
And I Click the Cancel button

Scenario: Add Floor Name Exceeding Limit
Given Click on Add Floor button
And Enter Floor Name Exceeding Limit
And I Click the Cancel button

Scenario: Create a floor with all Mandatory Fields
Given Click on Add Floor button
And Enter the Floor Name
And Enter Order Sequence
Then Upload an Image
And I Click the Save button
Then Verify Table Layout Settings Saved or Not

Scenario: Create a Duplicate Floor
Given Click on Add Floor button
And Enter the Floor Name
Then Verify Floor Name already present Error Message
And I Click the Cancel button

Scenario: Add Eclipse Table and Verify
Given Click on Eclipse Table

Scenario: Edit the Eclipse Table and Verify Edit header
Given Click on Edit Table
Then Verify Table Edit Screen Header
Then I Click the Cancel button

Scenario: Edit the Eclipse Table 
Given Click on Edit Table
And Enter Number Of Seats
Then I Click the Cancel button
#Then Verify Table Updated or Not

Scenario: Duplicate the Eclipse Table
Given Click on Duplicate
And I Click the Save button in Delivery Settings
Then Verify Table Layout Settings Saved or Not

Scenario: Delete the Eclipse Table and Click on Cancel
Given Click on Delete Table
And I Click the Cancel button in Pop Up
#Then Verify the Cancelled Table Deleted or Not

Scenario: Delete the Eclipse Table
Given Click on Delete Table
 And I Click the Delete button in Table
#Then Verify the Table Deleted or Not

Scenario: Add Rectangle Table and Verify
Given Click on Rectangle Table

Scenario: Edit the Rectangle Table 
Given Click on Edit Table
And Enter Number Of Seats
Then I Click the Cancel button
#Then Verify Table Updated or Not

Scenario: Delete the Rectangle Table and Click on Cancel
Given Click on Delete Table
And I Click the Cancel button in Pop Up
#Then Verify the Cancelled Table Deleted or Not

Scenario: Delete the Rectangle Table
Given Click on Delete Table
And I Click the Delete button in Table
#Then Verify the Table Deleted or Not

Scenario: Click on Floor Settings and Verify the Header
Given Click on Floor Settings
Then Verify Floor Settings Header
And I Click the Cancel button

Scenario: Click on Floor Settings and Update
Given Click on Floor Settings
And Enter Order Sequence
And I Click the Update button
#Then Verify Floor Settings Updated or Not

Scenario: Click on Delete the Floor and Cancel
Given Click on Delete Floor button
And I Click the Cancel button in Pop Up
#Then Verify Cancelled Floor Deleted or Not

Scenario: Click on Delete the Floor 
Given Click on Delete Floor button
And I Click the Delete button in Table
#Then Verify Floor Deleted or Not

Scenario: Save the Table Layout 
And I Click the Save button in Delivery Settings
Then Verify Table Layout Settings Saved or Not



