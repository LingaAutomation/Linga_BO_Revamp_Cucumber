@Reports
@Weekly_Sale_Report

Feature: Reports - Weekly Summary Report
	I Verifying the Weekly Summary Reports for various Time Periods with Excel
	
Background: Open the Weekly Summary Report Home Page
Given Open the Reports - Weekly Summary Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Weekly Summary Report Header is Displayed
Given Verifying the Weekly Summary Report Header Page

#Scenario: Verify the Filter & Ascending and Descending Order
#When User Select the Filter option with Columns
#And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Weekly Summary Report
Then Check Time Period is Displayed
#Then Check Date Field in Table is Displayed
#Then Check Net Sale Field in Table is Displayed
#Then Check Tax Field in Table is Displayed
#Then Check Discount Field in Table is Displayed
#Then Check Grand Sale Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Weekly Summary Reports Available for This Week
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Weekly Summary Report Availble for This Week or Not

Scenario: Verify whether the Weekly Summary Reports Available for Last Week
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Weekly Summary Report Availble for Last Week or Not

Scenario: Verify whether the Weekly Summary Reports Available for Last 7 Days
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Weekly Summary Report Availble for Last Seven Days or Not

Scenario: Verify whether the Weekly Summary Reports Available for Specific Date
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Weekly Summary Report Availble for Specific Date or Not
