@Reports
@SaleRecap_Sale_Report

Feature: Reports - Sale Recap Sale Report
	I Verifying the Sale Recap Sale Reports for various Time Periods with Excel
	
Background: Open the Sale Recap Sale Report Home Page
Given Open the Reports - Sale Recap Sale Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Sale Recap Sale Report Header is Displayed
Given Verifying the Sale Recap Sale Report Header Page


Scenario: Check the Available Fields in Sale Recap Sale Report
Then Check Sale Recap Type Field is Displayed
Then Check Employee Field is Displayed
Then Check Report Type Field is Displayed
#Then Check CHECK STATUS Field in Table is Displayed
#Then Check SUMMARY Field in Table is Displayed
#Then Check SALES Field in Table is Displayed
#Then Check PAYMENT SUMMARY Field in Table is Displayed
#Then Check TAXES Field in Table is Displayed
#Then Check DISCOUNT Field in Table is Displayed
#Then Check %of Sale Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Sale Recap Sale Reports Available for Today
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Today
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Today or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for Yesterday
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Yesterday
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Yesterday or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for Last 'N' Days
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Last N Days
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Last N Days or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for This Week
And I Select Sale Recap Type as Time Period
And I Select the Time Period as This Week
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for This Week or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for Last Week
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Last Week
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Last Week or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for Last 7 Days
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Last Seven Days
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Last Seven Days or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for This Month
And I Select Sale Recap Type as Time Period
And I Select the Time Period as This Month
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for This Month or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for Last Month
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Last Month
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Last Month or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for Last 30 Days
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Last Thirty Days
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for Specific Date
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Specific Date
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Specific Date or Not

Scenario: Verify whether the Sale Recap Sale Reports Available for Date Range
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Date Range
And I Select the Employee as All
And I Click the Apply button
Then Verify Sale Recap Sale Report Availble for Date Range or Not

