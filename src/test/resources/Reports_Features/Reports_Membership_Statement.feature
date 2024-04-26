@Reports
@Membership_Statement_Report

Feature: Reports - Membership - Membership Statement Report
	I Verifying the Membership Statement Reports for various Time Periods with Excel
	
Background: Open the Reports - Membership Statement Report Home Page
Given Open the Reports - Membership Statement Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Membership Statement Report Header is Displayed
Given Verifying the Membership Statement Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Membership Statement Report
Then Check Customer Field is Displayed
Then Check Time Period is Displayed
Then Check Date Field in Table is Displayed
Then Check Check Field in Table is Displayed
Then Check Plan Field in Table is Displayed
Then Check Menu Item Field in Table is Displayed
Then Check Account Recharge Field in Table is Displayed
Then Check Price Field in Table is Displayed
Then Check Tax Field in Table is Displayed
Then Check Total Field in Table is Displayed
Then Check Tips Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Membership Statement Reports Available for Selected Customer
And I Select the Customer
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Membership Statement Report Available for Selected Customer or Not

Scenario: Verify whether the Membership Statement Reports Available for Today
And I Select the Customer as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Membership Statement Report Available for Today or Not

Scenario: Verify whether the Membership Statement Reports Available for Yesterday
And I Select the Customer as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Membership Statement Report Available for Yesterday or Not

Scenario: Verify whether the Membership Statement Reports Available for Last 'N' Days
And I Select the Customer as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Membership Statement Report Available for Last N Days or Not

Scenario: Verify whether the Membership Statement Reports Available for This Week
And I Select the Customer as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Membership Statement Report Available for This Week or Not

Scenario: Verify whether the Membership Statement Reports Available for Last Week
And I Select the Customer as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Membership Statement Report Available for Last Week or Not

Scenario: Verify whether the Membership Statement Reports Available for Last 7 Days
And I Select the Customer as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Membership Statement Report Available for Last Seven Days or Not

Scenario: Verify whether the Membership Statement Reports Available for This Month
And I Select the Customer as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Membership Statement Report Available for This Month or Not

Scenario: Verify whether the Membership Statement Reports Available for Last Month
And I Select the Customer as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Membership Statement Report Available for Last Month or Not

Scenario: Verify whether the Membership Statement Reports Available for Last 30 Days
And I Select the Customer as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Membership Statement Report Available for Last Thirty Days or Not

Scenario: Verify whether the Membership Statement Reports Available for Specific Date
And I Select the Customer as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Membership Statement Report Available for Specific Date or Not

Scenario: Verify whether the Membership Statement Reports Available for Date Range
And I Select the Customer as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Membership Statement Report Available for Date Range or Not
