@Reports
@NodeReport

Feature: Reports - Void Node Report
I Verifying the Void Node Report for various Time Periods with Excel
	
Scenario: Open the Void Node Report Home Page
Given Open the Reports - Void Node Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Void Node Report Header is Displayed
Given Verifying the Void Node Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the Available Fields in Node Report
Then Check Select the Node Field is Displayed
Then Check Select TimePeriod Field is Displayed
Then Check Node Field in Table is Displayed
Then Check Check Field in Table is Displayed
Then Check Date Field in Table is Displayed
Then Check Item Name Field in Table is Displayed
Then Check Quantity Field in Table is Dispalyed
Then Check Amount Field in Table is Displayed
Then Check Tax Field in Table is Displayed
Then Check Discount Field in Table is Displayed
Then Check Void Reason in Table is Displayed
Then Check Open By in Table is Displayed
Then Check Void By in Table is Displayed

Scenario: Verify Whether Void Node Report Available For Today
Given I Select the Employee as All
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Today or Not

Scenario: Verify Whether Void Node Report Available For Yesterday
Given I Select the Employee as All
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Yesterday or Not

Scenario: Verify Whether Void Node Report Available For Last N Days
Given I Select the Employee as All
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Last N Days or Not

Scenario: Verify Whether Void Node Report Available For This Week
Given I Select the Employee as All
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for This Week or Not

Scenario: Verify Whether Void Node Report Available For Last Week
Given I Select the Employee as All
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Last Week or Not

Scenario: Verify Whether Void Node Report Available For Last Seven Days
Given I Select the Employee as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Last Seven Days or Not

Scenario: Verify Whether Void Node Report Available For This Month
Given I Select the Employee as All
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for This Month or Not

Scenario: Verify Whether Void Node Report Available For Last Month
Given I Select the Employee as All
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Last Month or Not

Scenario: Verify Whether Void Node Report Available For Last Thirty Days
Given I Select the Employee as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Last Thirty Days or Not

Scenario: Verify Whether Void Node Report Available For Specific Date
Given I Select the Employee as All
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Specific Date or Not

Scenario: Verify Whether Void Node Report Available For Date Range
Given I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Void Node Report Available for Date Range or Not


