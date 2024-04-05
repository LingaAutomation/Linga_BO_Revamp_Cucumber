@Reports
@Daily_Summary_Report

Feature: Reports - Daily Summary Report
	I Verifying the Daily Summary Reports for various Time Periods with Excel
	
Background: Open the Daily Summary Report Home Page
Given Open the Reports - Daily Summary Report home page BaseURL and storeID


Scenario: Verify whether the Reports - Daily Summary Report Header is Displayed
Given Verifying the Daily Summary Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Daily Summary Report
Then Check Select Department Field is Displayed
Then Check Select Tax Field is Displayed
Then Check Time Period is Displayed
Then Check Name Field in Table is Displayed
Then Check Sale Amount Field in Table is Displayed
Then Check Quantity Field in Table is Displayed
Then Check Tax Field in Table is Displayed
Then Check Discount Field in Table is Displayed
Then Check %of Sale Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Daily Summary Reports Available for Today
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Daily Summary Report Available for Today or Not

Scenario: Verify whether the Daily Summary Reports Available for Yesterday
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Daily Summary Report Available for Yesterday or Not

Scenario: Verify whether the Daily Summary Reports Available for Last 'N' Days
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Daily Summary Report Available for Last N Days or Not

Scenario: Verify whether the Daily Summary Reports Available for This Week
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Daily Summary Report Available for This Week or Not

Scenario: Verify whether the Daily Summary Reports Available for Last Week
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Daily Summary Report Available for Last Week or Not

Scenario: Verify whether the Daily Summary Reports Available for Last 7 Days
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Daily Summary Report Available for Last Seven Days or Not

Scenario: Verify whether the Daily Summary Reports Available for This Month
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Daily Summary Report Available for This Month or Not

Scenario: Verify whether the Daily Summary Reports Available for Last Month
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Daily Summary Report Available for Last Month or Not

Scenario: Verify whether the Daily Summary Reports Available for Last 30 Days
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Daily Summary Report Available for Last Thirty Days or Not

Scenario: Verify whether the Daily Summary Reports Available for Specific Date
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Daily Summary Report Available for Specific Date or Not

Scenario: Verify whether the Daily Summary Reports Available for Date Range
And I Select the Department as All
And I Select the Tax as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Daily Summary Report Available for Date Range or Not

