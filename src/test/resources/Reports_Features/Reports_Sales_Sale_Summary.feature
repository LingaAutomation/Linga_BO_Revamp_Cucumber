@Reports
@SaleSummary_Sale_Report

Feature: Reports - Sale Summary Report
	I Verifying the Sale Summary Reports for various Time Periods with Excel
	
Background: Open the Sale Summary Report Home Page
Given Open the Reports - Sale Summary Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Sale Summary Report Header is Displayed
Given Verifying the Sale Summary Report Header Page


#Scenario: Verify the Filter & Ascending and Descending Order
#When User Select the Filter option with Columns
#And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Sale Summary Report
Then Check Group By Employee Check Box Field is Displayed
Then Check Employee Field is Displayed
Then Check Service Type Field is Displayed
Then Check Floor No Field is Displayed
Then Check Table No Field is Displayed
Then Check Time Period is Displayed
Then Check Check Number Field in Table is Displayed
Then Check Customer Field in Table is Displayed
Then Check Transaction Date Field in Table is Displayed
Then Check Floor No Field in Table is Displayed
Then Check Table No Field in Table is Displayed
Then Check Net Sale Field in Table is Displayed
Then Check Total Tax Field in Table is Displayed
Then Check Incl Tax Field in Table is Displayed
Then Check CC Service Charge Field in Table is Displayed
Then Check Discount Field in Table is Displayed
Then Check Gross Receipt Field in Table is Displayed
Then Check Closed By Field in Table is Displayed
Then Check Closed On Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Sale Summary Reports Available for Today
And I Select the Employee as All
And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Sale Summary Report Availble for Today or Not

Scenario: Verify whether the Sale Summary Reports Available for Yesterday
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Sale Summary Report Availble for Yesterday or Not

Scenario: Verify whether the Sale Summary Reports Available for Last 'N' Days
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Sale Summary Report Availble for Last N Days or Not

Scenario: Verify whether the Sale Summary Reports Available for This Week
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Sale Summary Report Availble for This Week or Not

Scenario: Verify whether the Sale Summary Reports Available for Last Week
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Sale Summary Report Availble for Last Week or Not

Scenario: Verify whether the Sale Summary Reports Available for Last 7 Days
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Sale Summary Report Availble for Last Seven Days or Not

Scenario: Verify whether the Sale Summary Reports Available for This Month
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Sale Summary Report Availble for This Month or Not

Scenario: Verify whether the Sale Summary Reports Available for Last Month
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Sale Summary Report Availble for Last Month or Not

Scenario: Verify whether the Sale Summary Reports Available for Last 30 Days
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Sale Summary Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Sale Summary Reports Available for Specific Date
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Sale Summary Report Availble for Specific Date or Not

Scenario: Verify whether the Sale Summary Reports Available for Date Range
And I Select the Employee as All
#And I Select the Service Type as Select All
And I Select the Floor No as All
#And I Select the Table No as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Sale Summary Report Availble for Date Range or Not

