@Reports
@GiveXReport

Feature: Reports - GiveX Report
I Verifying the Cash Transaction Report for various Time Periods with Excel
	
Scenario: Open the GiveX Report Home Page
Given Open the Reports - GiveX Report home page BaseURL and storeID

Scenario: Verify whether the Reports - GiveX Report Header is Displayed
Given Verifying the GiveX Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify Available Fields in GiveX Report
Then Check GiveX Number Input Field is Displayed
Then Check Select Employee Field is Displayed 
Then Check Select TimePeriod Field is Displayed
Then Check GiveX Number Field in Table is Displayed
Then Check Date Field in Table is Displayed
Then Check Check Number Field in Table is Displayed
Then Verify Employee Field in Table is Dispalyed
Then Check Node Field in Table is Displayed
Then Check ActivityType Field in Table is Displayed
Then Check Amount Field in Table is Displayed

Scenario: Verify Whether the Give X Report Available for Today
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Today or Not

Scenario: Verify Whether the Give X Report Available for Yesterday
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Yesterday or Not

Scenario: Verify Whether the Give X Report Available for Last N Days
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Last N Days or Not

Scenario: Verify Whether the Give X Report Available for This Week
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for This Week or Not

Scenario: Verify Whether the Give X Report Available for Last Week
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Last Week or Not

Scenario: Verify Whether the Give X Report Available for Last Seven Days
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Last Seven Days or Not

Scenario: Verify Whether the Give X Report Available for This Month
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for This Month or Not

Scenario: Verify Whether the Give X Report Available for Last Month
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Last Month or Not

Scenario: Verify Whether the Give X Report Available for Last Thirty Days
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Last Thirty Days or Not

Scenario: Verify Whether the Give X Report Available for Specific Date
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Specific Date or Not

Scenario: Verify Whether the Give X Report Available for Date Range
Given Enter GiveX Number
And I Select Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify GiveX Report Available for Date Range or Not