@Reports
@PaidIn_PaidOut_Reports

Feature: Reports - Paid In/Paid Out Report
	I Verifying the Paid In/Paid Out Reports for various Time Periods with Excel
	
Background: Open the Paid In/Paid Out Report Home Page
Given Open the Reports - Paid In/Paid Out Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Paid In/Paid Out Report Header is Displayed
Given Verifying the Paid In/Paid Out Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Paid In/Paid Out Report
Then Check Paid Type Field is Displayed
Then Check Time Period is Displayed
Then Check Node Field in Table is Displayed
Then Check Business Date Field in Table is Displayed
Then Check Transaction Date Field in Table is Displayed
Then Check Paid In/Paid Out By Field in Table is Displayed
Then Check Amount Field in Table is Displayed
Then Check Paid From/Paid To Field in Table is Displayed
Then Check Reason Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Paid In Report Available 
And I Select the Paid Type as Paid In
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Paid In Report Availble or Not

Scenario: Verify whether the Paid Out Report Available 
And I Select the Paid Type as Paid Out
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Paid Out Report Availble or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Today
And I Select the Paid Type as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Today or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Yesterday
And I Select the Paid Type as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Yesterday or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Last 'N' Days
And I Select the Paid Type as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Last N Days or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for This Week
And I Select the Paid Type as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for This Week or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Last Week
And I Select the Paid Type as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Last Week or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Last 7 Days
And I Select the Paid Type as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Last Seven Days or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for This Month
And I Select the Paid Type as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for This Month or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Last Month
And I Select the Paid Type as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Last Month or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Last 30 Days
And I Select the Paid Type as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Specific Date
And I Select the Paid Type as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Specific Date or Not

Scenario: Verify whether the Paid In/Paid Out Reports Available for Date Range
And I Select the Paid Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Paid In/Paid Out Report Availble for Date Range or Not

#Scenario: Verify whether the Top Sales is displayed as Donut Chart
#And I Select the Time Period as Date Range
#And I Click the Apply button
#Then Check Top Sales displayed as Donut Chart
#
#Scenario: Verify whether the Top Sales is displayed as Bar Chart
#And I Select the Time Period as Date Range
#And I Click the Apply button
#Then Check Top Sales displayed as Bar Chart
#
#Scenario: Verify whether the Sales By Hour Graph is Displayed
#And I Select the Time Period as Date Range
#And I Click the Apply button
#Then Check Sales By Hour Graph is Displayed