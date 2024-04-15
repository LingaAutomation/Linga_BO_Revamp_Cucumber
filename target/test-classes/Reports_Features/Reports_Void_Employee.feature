@Reports
@Void_Employee_Report

Feature: Reports - Void Employee Report
	I Verifying the Void Employees for various Time Periods with Excel
	
Background: Open the Void Employee Report Home Page
Given Open the Reports - Void Employee home page BaseURL and storeID

Scenario: Verify whether the Reports - Void Employee Header is Displayed
Given Verifying the Void Employee Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Void Employee
Then Check Employee Field is Displayed
Then Check Time Period is Displayed
Then Check Check Field in Table is Displayed
Then Check Date Field in Table is Displayed
Then Check Item Name Field in Table is Displayed
Then Check Quantity Field in Table is Displayed
Then Check Amount Field in Table is Displayed
Then Check Tax Field in Table is Displayed
Then Check Discount Field in Table is Displayed
Then Check Void Reason Field in Table is Displayed
Then Check Open By Field in Table is Displayed
Then Check Void By Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Void Employee Report Available for Selected Employee
And I Select the Employee
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Void Employee Report Available for Selected Employee or Not

Scenario: Verify whether the Void Employee Report Available for Today
And I Select the Employee as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Void Employee Report Available for Today or Not

Scenario: Verify whether the Void Employee Report Available for Yesterday
And I Select the Employee as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Void Employee Report Available for Yesterday or Not

Scenario: Verify whether the Void Employee Report Available for Last 'N' Days
And I Select the Employee as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Void Employee Report Available for Last N Days or Not

Scenario: Verify whether the Void Employee Report Available for This Week
And I Select the Employee as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Void Employee Report Available for This Week or Not

Scenario: Verify whether the Void Employee Report Available for Last Week
And I Select the Employee as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Void Employee Report Available for Last Week or Not

Scenario: Verify whether the Void Employee Report Available for Last 7 Days
And I Select the Employee as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Void Employee Report Available for Last Seven Days or Not

Scenario: Verify whether the Void Employee Report Available for This Month
And I Select the Employee as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Void Employee Report Available for This Month or Not

Scenario: Verify whether the Void Employee Report Available for Last Month
And I Select the Employee as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Void Employee Report Available for Last Month or Not

Scenario: Verify whether the Void Employee Report Available for Last 30 Days
And I Select the Employee as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Void Employee Report Available for Last Thirty Days or Not

Scenario: Verify whether the Void Employee Report Available for Specific Date
And I Select the Employee as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Void Employee Report Available for Specific Date or Not

Scenario: Verify whether the Void Employee Report Available for Date Range
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Void Employee Report Available for Date Range or Not
