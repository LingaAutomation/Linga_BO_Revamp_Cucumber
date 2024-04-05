@Reports
@FutureOrder_Report

Feature: Reports - FutureOrder Report
I Verifying the Online Sale Reports for various Time Periods with Excel
	
Background: Open the Future Order Report Home Page
Given Open the Reports - Future Order Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Future Order Report Header is Displayed
Given Verifying the Future Order Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in FutureOrder Report
Then Check CheckNumber Input in FutureOrder is Displayed
Then Check Select OrderDate Field is Displayed
Then Check Select DeliveryDate Filed Is Displayed
Then Check CheckNumber Field in FutureOrder Table is Displayed
Then Paid Amount Field in Table is Displayed
Then Balance Amount Field in Tale is Displayed
Then OrderedDate Field in Table is Displayed
Then DeliverDate Field in Table is Displayed
Then Status Field in Table is Displayed

Scenario: Verify whether Future Order Report available for Selected Time Period
And I Select Ordered Date
And I Select the Delivery Date
And I Click the Apply button
Then Verify Future Order Report available for Selected Time Period