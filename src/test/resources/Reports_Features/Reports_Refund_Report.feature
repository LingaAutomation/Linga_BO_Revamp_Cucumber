@Reports
@RefundReport

Feature: Reports - Refund Report
I Verifying the Refund Report for various Time Periods with Excel
	
Scenario: Open the Refund Report Home Page
Given Open the Reports - Refund Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Refund Report Header is Displayed
Given Verifying the Refund Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the Available Fields in Refund Report
Then Check Select Employee Field is Displayed
Then Check Select Payment Option Field is Displayed
Then Check Select Payment Name Field is Displayed
Then Check Select TimePeriod Field is Displayed
Then Check Date Field in Table is Displayed
Then Check Check Field in Table is Displayed
Then Check Reason Field in Table is Displayed
Then Check Device Field in Table is Displayed
Then Check Refund By Field in Table is Displayed
Then Check Payment Name Field in Table is Displayed
Then Check Net Sale Field in Table is Displayed
Then Check Refund Tax Field in Table is Displayed
Then Check Service Charge Field in Table is Displayed
Then Check Total Amount Field in Table is Displayed

Scenario: Verify Refund Report Available for Today with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Today or Not By Payment Name

Scenario: Verify Refund Report Available for Yesterday with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Yesterday or Not By Payment Name

Scenario: Verify Refund Report Available for Last N Days with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last N Days or Not By Payment Name

Scenario: Verify Refund Report Available for This Week with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Refund Report Available for This Week or Not By Payment Name

Scenario: Verify Refund Report Available for Last Week with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last Week or Not By Payment Name

Scenario: Verify Refund Report Available for Last Seven Days with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last Seven Days or Not By Payment Name

Scenario: Verify Refund Report Available for This Month with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify Refund Report Available for This Month or Not By Payment Name

Scenario: Verify Refund Report Available for Last Month with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last Month or Not By Payment Name

Scenario: Verify Refund Report Available for Last Thirty Days with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last Thirty Days or Not By Payment Name

Scenario: Verify Refund Report Available for Specific Date with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Specific Date or Not By Payment Name

Scenario: Verify Refund Report Available for Date Range with Payment Option as Payment Name
Given I Select the Employee as All
And Select Payment Option as By Payment Name
And Select Payment Name as All
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Date Range or Not By Payment Name

Scenario: Verify Refund Report Available for Today with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Today or Not By Payment Type

Scenario: Verify Refund Report Available for Yesterday with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Yesterday or Not By Payment Type

Scenario: Verify Refund Report Available for Last N Days with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last N Days or Not By Payment Type

Scenario: Verify Refund Report Available for This Week with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Refund Report Available for This Week or Not By Payment Type

Scenario: Verify Refund Report Available for Last Week with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last Week or Not By Payment Type

Scenario: Verify Refund Report Available for Last Seven Days with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last Seven Days or Not By Payment Type

Scenario: Verify Refund Report Available for This Month with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify Refund Report Available for This Month or Not By Payment Type

Scenario: Verify Refund Report Available for Last Month with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last Month or Not By Payment Type

Scenario: Verify Refund Report Available for Last Thirty Days with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Last Thirty Days or Not By Payment Type

Scenario: Verify Refund Report Available for Specific Date with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Specific Date or Not By Payment Type

Scenario: Verify Refund Report Available for Date Range with Payment Option as Payment Type
Given I Select the Employee as All
And Select Payment Option as By Payment Type
And Select Payment Type as All
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Refund Report Available for Date Range or Not By Payment Type