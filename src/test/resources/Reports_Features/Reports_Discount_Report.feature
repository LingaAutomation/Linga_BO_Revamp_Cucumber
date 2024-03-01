@Reports
@Discount_Report

Feature: Reports - Discount Report
	I Verifying the Discount Reports for various Time Periods with Excel
	
Background: Open the Discount Report Home Page
Given Open the Reports - Discount Report home page BaseURL and storeID


Scenario: Verify whether the Reports - Discount Report Header is Displayed
Given Verifying the Discount Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Discount Report
Then Check Report Type Field is Displayed
Then Check Discount Field is Displayed
Then Check Sale Created By Field is Displayed
Then Check Discount Coupon Type Field is Displayed
Then Check Time Period is Displayed
Then Check Discount Name Field in Table is Displayed
Then Check Discount Total Field in Table is Displayed
Then Check %of Total Field in Table is Displayed
Then Check Count Field in Table is Displayed
Then Check Average Field in Table is Displayed
Then Check Discount Coupon Type Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Discount Reports Available for By Employee
And I Select the Report Type as By Employee
And I Select the Approved By as All
And I Select the Employee Name as All
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Report Availble for By Employee or Not

Scenario: Verify whether the Discount Reports Available for By Discount
And I Select the Report Type as By Discount
And I Select the Approved By as All
And I Select the Employee Name as All
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Report Availble for By Discount or Not

Scenario: Verify whether the Discount Reports Available for By Discount Type
And I Select the Report Type as By Discount Type
And I Select the Approved By as All
And I Select the Employee Name as All
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Report Availble for By Discount Type or Not

Scenario: Verify whether the Discount Reports Available for By Dual Price
And I Select the Report Type as By Dual Price
And I Select the Approved By as All
And I Select the Employee Name as All
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Report Availble for By Dual Price or Not

Scenario: Verify whether the Discount Reports Available for Discount Applied By
And I Select the Report Type as Discount Applied By
And I Select the Approved By as All
And I Select the Employee Name as All
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Report Availble for Discount Applied By or Not

Scenario: Verify whether the Discount Reports Available for By Name
And I Select the Report Type as By Name
And I Select the Approved By as All
And I Select the Employee Name as All
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Report Availble for By Name or Not

Scenario: Verify whether the Discount Reports Available for Today
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Discount Report Availble for Today or Not

Scenario: Verify whether the Discount Reports Available for Yesterday
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Discount Report Availble for Yesterday or Not

Scenario: Verify whether the Discount Reports Available for Last 'N' Days
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Discount Report Availble for Last N Days or Not

Scenario: Verify whether the Discount Reports Available for This Week
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Discount Report Availble for This Week or Not

Scenario: Verify whether the Discount Reports Available for Last Week
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Discount Report Availble for Last Week or Not

Scenario: Verify whether the Discount Reports Available for Last 7 Days
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Discount Report Availble for Last Seven Days or Not

Scenario: Verify whether the Discount Reports Available for This Month
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Discount Report Availble for This Month or Not

Scenario: Verify whether the Discount Reports Available for Last Month
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Discount Report Availble for Last Month or Not

Scenario: Verify whether the Discount Reports Available for Last 30 Days
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Discount Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Discount Reports Available for Specific Date
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Discount Report Availble for Specific Date or Not

Scenario: Verify whether the Discount Reports Available for Date Range
And I Select the Report Type as Summary
And I Select the Discount as All
And I Select the Sale Created By as All
And I Select the Discount Coupon Type as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Discount Report Availble for Date Range or Not

