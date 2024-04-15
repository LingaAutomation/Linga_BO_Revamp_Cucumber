@Reports
@Daily_Tender_Report

Feature: Reports - Daily Tender Report
	I Verifying the Daily Tender Reports for various Time Periods with Excel
	
Background: Open the Daily Tender Report Home Page
Given Open the Reports - Daily Tender Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Daily Tender Report Header is Displayed
Given Verifying the Daily Tender Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Daily Tender Report
Then Check Time Period is Displayed
Then Check Date Field in Table is Displayed
Then Check Cash Field in Table is Displayed
Then Check Side CC Field in Table is Displayed
Then Check Amex Field in Table is Displayed
Then Check Master Field in Table is Displayed
Then Check Visa Field in Table is Displayed
Then Check Others Field in Table is Displayed
Then Check Diners Field in Table is Displayed
Then Check Online Aggregator Field in Table is Displayed
Then Check Kiosk Field in Table is Displayed
Then Check Online Payment Field in Table is Displayed
Then Check Gift Card Field in Table is Displayed
Then Check Loyalty Field in Table is Displayed
Then Check Net Amt Field in Table is Displayed
Then Check Tip Field in Table is Displayed
Then Check Day Total Field in Table is Displayed
Then Check Export Field is Displayed


Scenario: Verify whether the Daily Tender Reports Available for Today
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Daily Tender Report Available for Today or Not

Scenario: Verify whether the Daily Tender Reports Available for Yesterday
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Daily Tender Report Available for Yesterday or Not

Scenario: Verify whether the Daily Tender Reports Available for Last 'N' Days
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Daily Tender Report Available for Last N Days or Not

Scenario: Verify whether the Daily Tender Reports Available for This Week
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Daily Tender Report Available for This Week or Not

Scenario: Verify whether the Daily Tender Reports Available for Last Week
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Daily Tender Report Available for Last Week or Not

Scenario: Verify whether the Daily Tender Reports Available for Last 7 Days
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Daily Tender Report Available for Last Seven Days or Not

Scenario: Verify whether the Daily Tender Reports Available for This Month
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Daily Tender Report Available for This Month or Not

Scenario: Verify whether the Daily Tender Reports Available for Last Month
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Daily Tender Report Available for Last Month or Not

Scenario: Verify whether the Daily Tender Reports Available for Last 30 Days
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Daily Tender Report Available for Last Thirty Days or Not

Scenario: Verify whether the Daily Tender Reports Available for Specific Date
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Daily Tender Report Available for Specific Date or Not

Scenario: Verify whether the Daily Tender Reports Available for Date Range
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Daily Tender Report Available for Date Range or Not

Scenario: Verify whether the Daily Tender Reports displays for Searched Date
And I Select the Time Period as Date Range
And I Click the Apply button
And I Search the selected Date
Then Verify Daily Tender Report Available for Selected Date or Not

