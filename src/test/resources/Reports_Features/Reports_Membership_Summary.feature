@Reports
@MembershipSummary

Feature: Reports - Membership Summary Report
I Verifying the Membership Summary Report for various Time Periods with Excel
	
Scenario: Open the Membership Summary Report Home Page
Given Open the Reports - Membership Summary Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Membership Summary Report Header is Displayed
Given Verifying the Membership Summary Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
#When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the Available Fields in Membership Summary Report
Then Check Select Customer Field is Displayed
Then Check Select Membership Plan Field is Displayed
Then Check Customer Name Field in Table is Displayed
Then Check Membership Plan Field in Table is Displayed
Then Check Membership ID Field in Table is Displayed
Then Check Allowance Field in Table is Displayed
Then Check Allowance DED Field in Table is Displayed
Then Check Overdraft Due Field in Table is Displayed
#Then Check Dec Field in Table is Displayed
Then Check Total Transaction Field in Table is Displayed
Then Check Pending Allowance Field in Table is Displayed

Scenario: Verify Membership Summary Report Available for Selected Time period
Given I Select the Customer
And I Select Random Membership Plan
Then Check Select TimePeriod Field is Displayed
Then Check Select Year Field is Displayed
And I Select Random Time Period
And I Select Random Year
And I Click the Apply button in Till Report
Then Verify Membership Summary Report Available for Selected Time Period
