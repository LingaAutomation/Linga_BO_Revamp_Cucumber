@Reports
@VoidTransaction_Report

Feature: Reports - Void Transaction Report
I Verifying the Void Transaction Reports for various Time Periods with Excel
	
Scenario: Open the Transaction Report Home Page
Given Open the Reports - Void Transaction Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Transaction Report Header is Displayed
Given Verifying the Void Transaction Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Void Transaction Report
Then Check Select TenderOption Field is Displayed
Then Check Select TenderName Field in VoidTransaction is Displayed
#Then Check Select CardType Field is Displayed
#Then Check Select SaleCloseDate Field is Displayed
#Then Check Select TransactionDate Field is Displayed
Then Check CheckNumber Field in Table is Displayed
#Then Check SaleCloseDate Field in Table is Displayed
#Then Check TransactionDate Field in Table is Displayed
Then Check PaymentNo Field in Table is Displayed
Then Check EmployeeName Field in Table is Displayed
Then Check TenderName Field in Table is Displayed
#Then Check CardType Field in Table is Displayed
Then Check CardNumber(last 4-digits) Field in Table is Displayed
Then Check AuthCode Field in Table is Displayed
Then Check Status Field in Table is Displayed
Then Check CCTip Charge Field in Table is Displayed
Then Check CC Service Charge Field in Table is Displayed
Then Check Amount Field in Table is Displayed
Then Check Tip Field in Table is Displayed

Scenario: Select Tender option as ByTender Name with Transaction Date as Today
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Transaction Report Availble for Today or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as Yesterday
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Transaction Report Availble for Yesterday or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as Last N Days
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Transaction Report Availble for Last N Days or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as This Week
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Transaction Report Availble for This Week or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as Last Week
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Transaction Report Availble for Last Week or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as Last Seven Days
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Transaction Report Availble for Last Seven Days or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as This Month
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Transaction Report Availble for This Month or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as Last Month
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Transaction Report Availble for Last Month or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as Last Thirty Days
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Transaction Report Availble for Last Thirty Days or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as Specific Date
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Transaction Report Availble for Specific Date or Not

Scenario: Select Tender option as ByTender Name with Transaction Date as Date Range
Given Select Tender Option as ByTenderName
Then Select Tender Name as All in VoidTransaction
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Transaction Report Availble for Date Range or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Today
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Transaction Report Availble for Today or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Yesterday
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Transaction Report Availble for Yesterday or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Last N Days
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Transaction Report Availble for Last N Days or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as This Week
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Transaction Report Availble for This Week or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Last Week
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Transaction Report Availble for Last Week or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Last Seven Days
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Transaction Report Availble for Last Seven Days or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as This Month
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Transaction Report Availble for This Month or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Last Month
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Transaction Report Availble for Last Month or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Last Thirty Days
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Transaction Report Availble for Last Thirty Days or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Specific Date
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Transaction Report Availble for Specific Date or Not

Scenario: Select Tender option as ByTenderType with Transaction Date as Date Range
Given Select Tender Option as ByTenderType
#Then Select Tender Name as All
#Then Select Card Type as All
#And Select Sale Close Date as Last N Days
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Transaction Report Availble for Date Range or Not