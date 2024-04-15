@Reports
@CashTransactionReport

Feature: Reports - Cash Transaction Report
I Verifying the Cash Transaction Report for various Time Periods with Excel
	
Scenario: Open the Cash Transaction Report Home Page
Given Open the Reports - Cash Transaction Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Cash Transaction Report Header is Displayed
Given Verifying the Cash Transaction Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify Available Fields in Cash Transaction Report
Then Check Select Employee Field is Displayed 
Then Check Select Transaction Type Field is Displayed
Then Check Select TimePeriod Field is Displayed
Then Verify Transaction Date Field in Table is Displayed
Then Verify Employee Field in Table is Dispalyed
Then Verify Check Field in Table is Displayed
Then Check Node Field in Table is Displayed
Then Check Transaction Type Field in Table is Displayed
Then Check Amount Field in Table is Displayed
Then Check Reason Field in Table is Displayed

Scenario: Verify Whether the Cash Transaction Report Available for Today
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Today or Not

Scenario: Verify Whether the Cash Transaction Report Available for Yesterday
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Yesterday or Not

Scenario: Verify Whether the Cash Transaction Report Available for Last N Days
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Last N Days or Not

Scenario: Verify Whether the Cash Transaction Report Available for This Week
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for This Week or Not

Scenario: Verify Whether the Cash Transaction Report Available for Last Week
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Last Week or Not

Scenario: Verify Whether the Cash Transaction Report Available for Last Seven Days
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Last Seven Days or Not

Scenario: Verify Whether the Cash Transaction Report Available for This Month
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for This Month or Not

Scenario: Verify Whether the Cash Transaction Report Available for Last Month
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Last Month or Not

Scenario: Verify Whether the Cash Transaction Report Available for Last Thirty Days
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Last Thirty Days or Not

Scenario: Verify Whether the Cash Transaction Report Available for Specific Date
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Specific Date or Not

Scenario: Verify Whether the Cash Transaction Report Available for Date Range
Given I Select Employee as All
And I Select Transaction Type as All
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Cash Transaction Report Available for Date Range or Not



 