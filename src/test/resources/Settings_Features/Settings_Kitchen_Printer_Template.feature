@Settings
@KitchenPrinterTemplate

Feature: Settings - Kitchen Printer Template
I am verify the Settings- Kitchen Printer Template Module and Performing Some Operations on that

Scenario: Opening the Kitchen Printer Template page
Given Open Kitchen Printer Template home page BaseURL and StoreID

Scenario: Verify whether the Kitchen Printer Template Header is Displayed
Given Verifying the Kitchen Printer Template Header Page

Scenario: Verfy Available Fields Displayed or Not
Given Verify Font Size is Displayed or Not
Then Verify Store and Check Details Filed is Displayed or Not
Then Verify Order and Item Summary Field is Displayed or Not
Then Verify Customer Info Field is Displayed or Not
Then Verify Driver Receipt Options Field is Displayed or Not
Then Verify Additional Details Field is Displayed or Not
Then Verify Template Preview Field is Displayed or Not

Scenario: Select the Font Size as Medium
Given Select Font Size as Medium
Then Select the Font Style From Dropdown
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Select the Font Size as Large
Given Select the Font Size as Large
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Select the Font Size a Small
Given Select the Font Size as Small
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Click on Store and Check Details and Verify the Available Fields
Given Click on Store and Check Details 
Then Verify Store Name Checkbox is Displayed or Not
Then Verify Check Number Checkbox is Displayed or Not
Then Verify Service Type Checkbox is Displayed or Not
Then Verify Table Name Checkbox is Displayed or Not
Then Verify Printer Name Checkbox is Displayed or Not
Then Verify Server Name Checkbox is Displayed or Not
Then Verify Print Date and Time Checkbox is Displayed or Not
Then Verify Customer Name Checkbox is Displayed or Not
Then Verify PickUp Date and Time Checkbox is Dislayed or Not

Scenario: Click on Order and Item Summary and Verify the Available Fields
Given Click on Order and Iten Summary 
Then Verify SplitByCourse Checkbox is Displayed or Not
Then Verify MenuPrice Checkbox is Displayed or Not
Then Verify QuantityBefore ItemName Checkbox is Displayed or Not
Then Verify All Modifiers in Modifier Print Checkbox is Displayed or Not
Then Verify Short Form for the Modifier Checkbox is Displayed or Not
Then Verify Horizantal view for Modifier Checkbox is Displayed or Not
Then Verify Other language Menu Name Checkbox is Displayed or Not
Then Verify Split Menu Quantity Checkbox is Displayed or Not
Then Verify Enable Item Summary Checkbox is Displayed or Not

Scenario: Click on Customer Info and Verify Available Fileds
Given Click on Customer Info Field
Then Verify Customer Info Position is Displayed or Not
Then Verify Address Checkbox is displayed or Not
Then Verify Email Checkbox is Displayed or Not
Then Verify Phone Number Checkbox is Displayed or Not
Then Verify Customer Notes Checkbox is Displayed or Not

Scenario: Click on Driver Receipt Options and Verify Available Options
Given Click on Driver Receipt Options
Then Verify Enable Driver Receipt Toggle is Displayed or Not
Then Verify Total Check box is Displayed or Not
Then Verify Tip Checkbox is Displayed or Not
Then Verify Signature Checkbox is Displayed or Not
Then Verify Balance Due Checkbox is Displayed or Not
Then Verify Driver Receipt No of Copies Input box is Dispalyed or Not

Scenario: Click on Additional Details and Verify Available Fields
Given Click on Additional Details options
Then Verify Cut Paper After Each Print Checkbox

Scenario: Disable Store and Check Details all the Available Checkboxes
And UnCheck the Store Name Checkbox
And UnCheck Check Number Checkbox
And UnCheck Service Type Checkbox
And UnCheck Table Name Checkbox 
And UnCheck Printer Name Checkbox 
And UnCheck Server Name Checkbox
And UnCheck Print Date and Time Checkbox
And UnCheck Customer Name Checkbox
And UnCheck PickUp Date and Time Checkbox
Then Close Store and Check Details 
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Disable Order and Item Summary all Available Checkboxes
And Uncheck SplitByCourse Checkbox
And Uncheck MenuPrice Checkbox
And Uncheck QuantityBefore ItemName Checkbox
And Uncheck All Modifiers in Modifier Print Checkbox
And Uncheck Short Form for the Modifier Checkbox
And Uncheck Horizantal view for Modifier Checkbox
And Uncheck Other language Menu Name Checkbox
And Uncheck Split Menu Quantity Checkbox
And Uncheck Enable Item Summary Checkbox
And Close Order and Item Summary
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Disable Customer Info all Available CheckBoxes
And Uncheck Address Checkbox
And Uncheck Email Checkbox
And Uncheck Phone Number Checkbox
And Uncheck Customer Notes Checkbox
Then Close Customer Info
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Disable Driver Receipt Options all Avaliable Checkboxes
Then Disable Driver Receipt Toggle
Then Verify Enable Driver Receipt Toggle is Displayed or Not
Then Verify Total Check box is Displayed or Not
Then Verify Tip Checkbox is Displayed or Not
Then Verify Signature Checkbox is Displayed or Not
Then Verify Balance Due Checkbox is Displayed or Not
Then Verify Driver Receipt No of Copies Input box is Dispalyed or Not
Then Enable Enable Driver Receipt Toggle
Then Uncheck Total Checkbox
Then Uncheck Tip Checkbox
Then Uncheck Signature Checkbox
Then Uncheck Balance Due Checkbox
Then Close Driver Receipt options
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Disable Additional Details Available Checkboxes
Then Uncheck Cut Paper After Each print Checkbox
Then Close Additional Details 
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Verify Disabled Checkboxes of Store and Check Details
Given Click on Store and Check Details 
And Verify the Store Name Checkbox Disabled or Not
And Verify Check Number Checkbox Disabled or Not
And Verify Service Type Checkbox Disabled or Not
And Verify Table Name Checkbox Disabled or Not
And Verify Printer Name Checkbox Disabled or Not
And Verify Server Name Checkbox Disabled or Not
And Verify Print Date and Time Checkbox Disabled or Not
And Verify Customer Name Checkbox Disabled or Not
And Verify PickUp Date and Time Checkbox Disabled or Not
Then Close Store and Check Details 

Scenario: Verify disabled Checkboxes of Order and Item Summary
Given Click on Order and Iten Summary 
And Verify SplitByCourse Checkbox Disabled or Not
And Verify MenuPrice Checkbox Disabled or Not
And Verify QuantityBefore ItemName Checkbox Disabled or Not
And Verify All Modifiers in Modifier Print Checkbox Disabled or Not
And Verify Short Form for the Modifier Checkbox Disabled or Not
And Verify Horizantal view for Modifier Checkbox Disabled or Not
And Verify Other language Menu Name Checkbox Disabled or Not
And Verify Split Menu Quantity Checkbox Disabled or Not
And Verify Enable Item Summary Checkbox Disabled or Not
And Close Order and Item Summary

Scenario: Verify Disabled Checkboxes of Customer Info 
Given Click on Customer Info Field
And Verify Address Checkbox Disabled or Not
And Verify Email Checkbox Disabled or Not
And Verify Phone Number Checkbox Disabled or Not
And Verify Customer Notes Checkbox Disabled or Not
Then Close Customer Info

Scenario: Verify Disabled Checkboxes of Driver Receipt Options
Given Click on Driver Receipt Options
Then Enable Enable Driver Receipt Toggle
And Enter No.of Copies
Then Verify Total Checkbox Disabled or Not
Then Verify Tip Checkbox Disabled or Not
Then Verify Signature Checkbox Disabled or Not
Then Verify Balance Due Checkbox Disabled or Not
Then Close Driver Receipt options

Scenario: Verify Disabled Checkboxes of Additional Details
Given Click on Additional Details options
Then Verify Cut Paper After Each print Checkbox Disabled or Not
Then Close Additional Details 


Scenario: Enable Store and Check Details all the Available Checkboxes
Given Click on Store and Check Details 
And Check the Store Name Checkbox
And Check Check Number Checkbox
And Check Service Type Checkbox
And Check Table Name Checkbox 
And Check Printer Name Checkbox 
And Check Server Name Checkbox
And Check Print Date and Time Checkbox
And Check Customer Name Checkbox
And Check PickUp Date and Time Checkbox
Then Close Store and Check Details 
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Enable Order and Item Summary all Available Checkboxes
Given Click on Order and Iten Summary 
And Check SplitByCourse Checkbox
And Check MenuPrice Checkbox
And Check QuantityBefore ItemName Checkbox
And Check All Modifiers in Modifier Print Checkbox
And Check Short Form for the Modifier Checkbox
And Check Horizantal view for Modifier Checkbox
And Check Other language Menu Name Checkbox
And Check Split Menu Quantity Checkbox
And Check Enable Item Summary Checkbox
And Close Order and Item Summary
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Enable Customer Info all Available CheckBoxes
Given Click on Customer Info Field
And Check Address Checkbox
And Check Email Checkbox
And Check Phone Number Checkbox
And Check Customer Notes Checkbox
Then Close Customer Info
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Enable Driver Receipt Options all Avaliable Checkboxes
Given Click on Driver Receipt Options
Then Enable Enable Driver Receipt Toggle
And Enter No.of Copies as Zero
Then Verify the Value Must be one to ten
And Enter No.of Copies More Than Ten
Then Verify the Value Must be one to ten
And Enter No.of Copies
Then Check Total Checkbox
Then Check Tip Checkbox
Then Check Signature Checkbox
Then Check Balance Due Checkbox
Then Close Driver Receipt options
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not

Scenario: Enable Additional Details Available Checkboxes
Given Click on Additional Details options
Then Check Cut Paper After Each print Checkbox
Then Close Additional Details 
And I Click the Update button in Kitchen printer Template
Then Verify Kitchen Printer Template Updated or Not





