@Reports
@HA_Activity_Report

Feature: Reports - House Account - HA Activity Report
	I Verifying the HA Activity Reports for various Time Periods with Excel
	
Background: Open the Reports - HA Activity Report Home Page
Given Open the Reports - HA Activity Report home page BaseURL and storeID


Scenario: Verify whether the Reports - HA Activity Report Header is Displayed
Given Verifying the HA Activity Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order


Scenario: Check the Available Fields in HA Activity Report
Then Check Card Number Field is Displayed
Then Check Activity Type Field is Displayed
Then Check Employee Field is Displayed
Then Check Time Period is Displayed
Then Check Date Field in Table is Displayed
Then Check Customer Field in Table is Displayed
Then Check Card Number Field in Table is Displayed
Then Check Check Number Field in Table is Displayed
Then Check User Name Field in Table is Displayed
Then Check Activity Type Field in Table is Displayed
Then Check Amount Field in Table is Displayed
Then Check Balance Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the HA Activity Reports Available for searched Card Number
#And I Clear the Card Number
#And I Select the Activity Type as All
#And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
And I Search the Selected Card Number
Then Verify HA Activity Report Available for Selected Card Number or Not

Scenario: Verify whether the HA Activity Reports Available for Activity Type as Issued
And I Clear the Card Number
And I Select the Activity Type as Issued
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify HA Activity Report Available for Selected Issued Activity Type or Not

Scenario: Verify whether the HA Activity Reports Available for Activity Type as Redeemed
And I Clear the Card Number
And I Select the Activity Type as Redeemed
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify HA Activity Report Available for Selected Redeemed Activity Type or Not

Scenario: Verify whether the HA Activity Reports Available for Activity Type as Recharges
And I Clear the Card Number
And I Select the Activity Type as Recharges
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify HA Activity Report Available for Selected Recharges Activity Type or Not

Scenario: Verify whether the HA Activity Reports Available for Activity Type as Refund
And I Clear the Card Number
And I Select the Activity Type as Refund
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify HA Activity Report Available for Selected Refund Activity Type or Not

Scenario: Verify whether the HA Activity Reports Available for Activity Type as Void
And I Clear the Card Number
And I Select the Activity Type as Void
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify HA Activity Report Available for Selected Void Activity Type or Not

Scenario: Verify whether the HA Activity Reports Available for Activity Type as Adjustment
And I Clear the Card Number
And I Select the Activity Type as Adjustment
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify HA Activity Report Available for Selected Adjustment Activity Type or Not

Scenario: Verify whether the HA Activity Reports Available for selected Employee
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify HA Activity Report Available for Selected Employee or Not

Scenario: Verify whether the HA Activity Reports Available for Today
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify HA Activity Report Available for Today or Not

Scenario: Verify whether the HA Activity Reports Available for Yesterday
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify HA Activity Report Available for Yesterday or Not

Scenario: Verify whether the HA Activity Reports Available for Last 'N' Days
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify HA Activity Report Available for Last N Days or Not

Scenario: Verify whether the HA Activity Reports Available for This Week
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify HA Activity Report Available for This Week or Not

Scenario: Verify whether the HA Activity Reports Available for Last Week
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify HA Activity Report Available for Last Week or Not

Scenario: Verify whether the HA Activity Reports Available for Last 7 Days
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify HA Activity Report Available for Last Seven Days or Not

Scenario: Verify whether the HA Activity Reports Available for This Month
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify HA Activity Report Available for This Month or Not

Scenario: Verify whether the HA Activity Reports Available for Last Month
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify HA Activity Report Available for Last Month or Not

Scenario: Verify whether the HA Activity Reports Available for Last 30 Days
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify HA Activity Report Available for Last Thirty Days or Not

Scenario: Verify whether the HA Activity Reports Available for Specific Date
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify HA Activity Report Available for Specific Date or Not

Scenario: Verify whether the HA Activity Reports Available for Date Range
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify HA Activity Report Available for Date Range or Not

#Scenario: Verify whether the HA Activity Reports displays for Searched Date
#
#And I Select the Time Period as Date Range
#And I Click the Apply button
#And I Search the selected Date
#Then Verify HA Activity Report Available for Selected Date or Not

