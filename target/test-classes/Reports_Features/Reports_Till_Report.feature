@Reports
@Till_Report

Feature: Reports - Till Report
I Verifying the Till Reports for various Time Periods with Excel
	
Scenario: Open the Till Report Home Page
Given Open the Reports - Till Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Till Report Header is Displayed
Given Verifying the Till Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify Available Fields in Till Report
Then Check Select Employee Field is Displayed 
Then Check Select Till Type Field is Displayed
Then Check Select TimePeriod Field is Displayed
Then Check Node Field in Table is Displayed
Then Check Date Field in Table is Displayed
Then Check User Field in Table is Displayed
Then Check Cash Expected Field in Table is Displayed
Then Check Amount Field in Table is Displayed
Then Check Over/Shortage Field in Table is Displayed

Scenario: Verify Whether the Till Report Available for Today
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Till Report Available for Today or Not

Scenario: Verify Whether the Till Report Available for Yesterday
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Till Report Available for Yesterday or Not
@LastNDays
Scenario: Verify Whether the Till Report Available for Last N Days
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Till Report Available for Last N Days or Not

Scenario: Verify Whether the Till Report Available for This Week
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Till Report Available for This Week or Not

Scenario: Verify Whether the Till Report Available for Last Week
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Till Report Available for Last Week or Not

Scenario: Verify Whether the Till Report Available for Last Seven Days
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Till Report Available for Last Seven Days or Not

Scenario: Verify Whether the Till Report Available for This Month
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify Till Report Available for This Month or Not

Scenario: Verify Whether the Till Report Available for Last Month
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Till Report Available for Last Month or Not

Scenario: Verify Whether the Till Report Available for Last Thirty Days
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Till Report Available for Last Thirty Days or Not

Scenario: Verify Whether the Till Report Available for Specific Date
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Till Report Available for Specific Date or Not

Scenario: Verify Whether the Till Report Available for Date Range
Given I Select Employee as All
And I Select Till Type as All
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Till Report Available for Date Range or Not



 