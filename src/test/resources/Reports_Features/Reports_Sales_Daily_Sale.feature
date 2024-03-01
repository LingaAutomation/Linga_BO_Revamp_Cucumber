@Reports
@Daily_Sale_Report

Feature: Reports - Daily Sale Report
	I Verifying the Daily Sale Reports for various Time Periods with Excel
	
Background: Open the Daily Sale Report Home Page
Given Open the Reports - Daily Sale Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Daily Sale Report Header is Displayed
Given Verifying the Daily Sale Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Daily Sale Report
Then Check Time Period is Displayed
Then Check Date Field in Table is Displayed
Then Check Net Sale Field in Table is Displayed
Then Check Tax Field in Table is Displayed
Then Check Discount Field in Table is Displayed
Then Check Grand Sale Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Daily Sale Reports Available for Today
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Daily Sale Report Availble for Today or Not

Scenario: Verify whether the Daily Sale Reports Available for Yesterday
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Daily Sale Report Availble for Yesterday or Not

Scenario: Verify whether the Daily Sale Reports Available for Last 'N' Days
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Daily Sale Report Availble for Last N Days or Not

Scenario: Verify whether the Daily Sale Reports Available for This Week
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Daily Sale Report Availble for This Week or Not

Scenario: Verify whether the Daily Sale Reports Available for Last Week
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Daily Sale Report Availble for Last Week or Not

Scenario: Verify whether the Daily Sale Reports Available for Last 7 Days
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Daily Sale Report Availble for Last Seven Days or Not

Scenario: Verify whether the Daily Sale Reports Available for This Month
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Daily Sale Report Availble for This Month or Not

Scenario: Verify whether the Daily Sale Reports Available for Last Month
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Daily Sale Report Availble for Last Month or Not

Scenario: Verify whether the Daily Sale Reports Available for Last 30 Days
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Daily Sale Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Daily Sale Reports Available for Specific Date
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Daily Sale Report Availble for Specific Date or Not

Scenario: Verify whether the Daily Sale Reports Available for Date Range
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Daily Sale Report Availble for Date Range or Not
