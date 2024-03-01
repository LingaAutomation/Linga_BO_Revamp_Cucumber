@Reports
@Discount_Store_Credit_Report

Feature: Reports - Discount Store Credit Report
	I Verifying the Discount Store Credit Reports for various Time Periods with Excel
	
Background: Open the Discount Store Credit Report Home Page
Given Open the Reports - Discount Store Credit Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Discount Store Credit Report Header is Displayed
Given Verifying the Discount Store Credit Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Discount Store Credit Report
Then Check Action Type Field is Displayed
Then Check Time Period is Displayed
Then Check Check Details Field in Table is Displayed
Then Check Employee Name and Id Field in Table is Displayed
Then Check Customer Name Field in Table is Displayed
Then Check Customer Email Field in Table is Displayed
Then Check Customer Phone Field in Table is Displayed
Then Check Credit Amount Field in Table is Displayed
Then Check Date & Time Field in Table is Displayed
Then Check Action Type Field in Table is Displayed
Then Check Source Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Discount Store Credit Reports Available for Action Type Add
And I Select the Action Type as Add
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Add or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Action Type Update
And I Select the Action Type as Update
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Update or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Action Type Refund
And I Select the Action Type as Refund
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Refund or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Action Type Redeem
And I Select the Action Type as Redeem
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Redeem or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Today
And I Select the Action Type as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Today or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Yesterday
And I Select the Action Type as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Yesterday or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Last 'N' Days
And I Select the Action Type as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Last N Days or Not

Scenario: Verify whether the Discount Store Credit Reports Available for This Week
And I Select the Action Type as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for This Week or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Last Week
And I Select the Action Type as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Last Week or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Last 7 Days
And I Select the Action Type as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Last Seven Days or Not

Scenario: Verify whether the Discount Store Credit Reports Available for This Month
And I Select the Action Type as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for This Month or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Last Month
And I Select the Action Type as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Last Month or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Last 30 Days
And I Select the Action Type as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Specific Date
And I Select the Action Type as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Specific Date or Not

Scenario: Verify whether the Discount Store Credit Reports Available for Date Range
And I Select the Action Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Store Credit Report Availble for Date Range or Not

