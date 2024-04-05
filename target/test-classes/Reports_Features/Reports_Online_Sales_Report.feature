@Reports
@Online_Sales_Report

Feature: Reports - Online Sales Report
I Verifying the Online Sale Reports for various Time Periods with Excel
	
Background: Open the Online Sales Report Home Page
Given Open the Reports - Online Sales Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Online Sales Report Header is Displayed
Given Verifying the Online Sales Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Online Sales Report
Then Check Select Source Field is Displayed
Then Check Select OrderType Field is Displayed
Then Check Select PaymentType Field is Displayed
Then Check Time Period is Displayed
Then Check CheckNumber Field in Table is Displayed
Then Check OrderRef No Field in Table is Displayed
Then Check Customer Field in Table is Displayed
Then Check Transaction Date Field in Table is Displayed
Then Check Source Field in Table is Displayed
Then Check Created By Field in Table is Displayed
Then Check Order Type Field in Table is Displayed
Then Check Payment Type Field in Table is Displayed
Then Check Tax Field in Table is Displayed
Then Check CC Service Charge Field in Table is Displayed
Then Check Net Sale Field in Table is Displayed
Then Check Driver Tip Field is Displayed
Then Check Gross Receipt Field is Displayed

Scenario: Verify whether the Online Sale Reports Available for Today
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Online Sale Report Availble for Today or Not

Scenario: Verify whether the Online Sale Reports Available for Yesterday
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Online Sale Report Availble for Yesterday or Not

Scenario: Verify whether the Online Sale Reports Available for Last N Days
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Online Sale Report Availble for Last N Days or Not

Scenario: Verify whether the Online Sale Reports Available for This Week
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Online Sale Report Availble for This Week or Not

Scenario: Verify whether the Online Sale Reports Available for Last Week
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Online Sale Report Availble for Last Week or Not

Scenario: Verify whether the Online Sale Reports Available for Last Seven Days
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Online Sale Report Availble for Last Seven Days or Not

Scenario: Verify whether the Online Sale Reports Available for This Month
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Online Sale Report Availble for This Month or Not

Scenario: Verify whether the Online Sale Reports Available for Last Month
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Online Sale Report Availble for Last Month or Not

Scenario: Verify whether the Online Sale Reports Available for Last Thirty Days
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Online Sale Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Online Sale Reports Available for Specific Date
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Online Sale Report Availble for Specific Date or Not

Scenario: Verify whether the Online Sale Reports Available for Date Range
And I Select the Source as All
And I Select the Order Type as All
And I Select the Payment Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Online Sale Report Availble for Date Range or Not

