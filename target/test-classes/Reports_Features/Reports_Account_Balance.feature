@Reports
@Account_Balance_Report

Feature: Reports - Account Balance Report
	I Verifying the Account Balance Reports for various Time Periods with Excel
	
Background: Open the Reports - Account Balance Report Home Page
Given Open the Reports - Account Balance Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Account Balance Report Header is Displayed
Given Verifying the Account Balance Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Account Balance Report
Then Check Select Date Field is Displayed
Then Check Date Field in Table is Displayed
Then Check Memo Field in Table is Displayed
Then Check Account Field in Table is Displayed
Then Check Debit Field in Table is Displayed
Then Check Credit Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Account Balance Reports Not displayed without Selecting Date
#And I Select the Customer
#And I Click the Apply button
#Then Verify Account Balance Report Availble for Selected Driver or Not
Then Check the Save button is Disabled

Scenario: Verify whether the Account Balance Reports Available for Selected Account Balance Date
And I Select the Account Balance Date
And I Click the Apply button
Then Verify Account Balance Report Availble for Selected Account Balance Date or Not
