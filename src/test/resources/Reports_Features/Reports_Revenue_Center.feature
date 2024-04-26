@Reports
@Revenue_Center_Report

Feature: Reports - Revenue Center Report
	I Verifying the Revenue Center Reports for various Time Periods with Excel
	
Background: Open the Reports - Revenue Center Report Home Page
Given Open the Reports - Revenue Center Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Revenue Center Report Header is Displayed
Given Verifying the Revenue Center Report Header Page

#Scenario: Verify the Filter & Ascending and Descending Order
#When User Select the Filter option with Columns
#And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Revenue Center Report
Then Check Revenue Centers Field is Displayed
Then Check Time Period is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Revenue Center Reports Available for Selected Number of Guests
And I Select the Revenue Centers as Number of Guests
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Revenue Center Report Available for Selected Number of Guests or Not

Scenario: Verify whether the Revenue Center Reports Available for Selected Number of Checks
And I Select the Revenue Centers as Number of Checks
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Revenue Center Report Available for Selected Number of Checks or Not

Scenario: Verify whether the Revenue Center Reports Available for Selected Net Sales by Category
And I Select the Revenue Centers as Net Sales by Category
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Revenue Center Report Available for Selected Net Sales by Category or Not

Scenario: Verify whether the Revenue Center Reports Available for Selected Net Sales by Shift
And I Select the Revenue Centers as Net Sales by Shift
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Revenue Center Report Available for Selected Net Sales by Shift or Not

Scenario: Verify whether the Revenue Center Reports Available for Selected Net Sales by Revenue Center
And I Select the Revenue Centers as Net Sales by Revenue Center
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Revenue Center Report Available for Selected Net Sales by Revenue Centers or Not

Scenario: Verify whether the Revenue Center Reports Available for Today
And I Select the Revenue Centers as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Revenue Center Report Available for Today or Not

Scenario: Verify whether the Revenue Center Reports Available for Yesterday
And I Select the Revenue Centers as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Revenue Center Report Available for Yesterday or Not

Scenario: Verify whether the Revenue Center Reports Available for Last 'N' Days
And I Select the Revenue Centers as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Revenue Center Report Available for Last N Days or Not

Scenario: Verify whether the Revenue Center Reports Available for This Week
And I Select the Revenue Centers as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Revenue Center Report Available for This Week or Not

Scenario: Verify whether the Revenue Center Reports Available for Last Week
And I Select the Revenue Centers as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Revenue Center Report Available for Last Week or Not

Scenario: Verify whether the Revenue Center Reports Available for Last 7 Days
And I Select the Revenue Centers as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Revenue Center Report Available for Last Seven Days or Not

Scenario: Verify whether the Revenue Center Reports Available for This Month
And I Select the Revenue Centers as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Revenue Center Report Available for This Month or Not

Scenario: Verify whether the Revenue Center Reports Available for Last Month
And I Select the Revenue Centers as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Revenue Center Report Available for Last Month or Not

Scenario: Verify whether the Revenue Center Reports Available for Last 30 Days
And I Select the Revenue Centers as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Revenue Center Report Available for Last Thirty Days or Not

Scenario: Verify whether the Revenue Center Reports Available for Specific Date
And I Select the Revenue Centers as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Revenue Center Report Available for Specific Date or Not

Scenario: Verify whether the Revenue Center Reports Available for Date Range
And I Select the Revenue Centers as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Revenue Center Report Available for Date Range or Not
