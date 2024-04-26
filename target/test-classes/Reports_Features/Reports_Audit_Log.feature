@Reports
@AuditLogReport

Feature: Reports - AuditLog Report
I Verifying the AuditLog Report for various Time Periods with Excel
	
Scenario: Open the Audit Log Report Home Page
Given Open the Reports - Audit Log Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Audit Log Report Header is Displayed
Given Verifying the Audit Log Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the Available Fields in Audit Log
Then Check Select the Source Field is Displayed 
Then Check Select TimePeriod Field is Displayed
Then Check Action Field in Table is Displayed
Then Check Event Date and Time Field in Table is Displayed
Then Check Employee Field in Table is Displayed
Then Check Device Type Field in Table is Displayed
Then Check Log Field in Table is Displayed

Scenario: Select the Source as BO and Check the Available Fields
Given I Select the Source as BO
Then Check Select the Event Field is Displayed

Scenario: Verify Audit Log Report Availbale For Today with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Today or Not with Source as BO

Scenario: Verify Audit Log Report Availbale For Yesterday with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Yesterday or Not with Source as BO

Scenario: Verify Audit Log Report Availbale For Last N Days with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last N Days or Not with Source as BO

Scenario: Verify Audit Log Report Availbale For This Week with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for This Week or Not with Source as BO

Scenario: Verify Audit Log Report Availbale For Last Week with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last Week or Not with Source as BO

Scenario: Verify Audit Log Report Availbale For Last Seven Days with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last Seven Days or Not with Source as BO

Scenario: Verify Audit Log Report Availbale For This Month with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for This Month or Not with Source as BO

Scenario: Verify Audit Log Report Availbale For Last Month with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last Month or Not with Source as BO

Scenario: Verify Audit Log Report Availbale For Last Thirty Days with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last Thirty Days or Not with Source as BO

Scenario: Verify Audit Log Report Availbale for Specific Date with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Specific Date or Not with Source as BO

Scenario: Verify Audit Log Report Availbale for Date Range with Source as BO
Given I Select the Source as BO
And I Select the Event as All
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Date Range or Not with Source as BO

Scenario: Select the Source as POS and Check the Available Fields
Given I Select the Source as POS
Then Check Select Filter Field in Table is Displayed
Then Check Select Check Type Field in Table is Displayed

Scenario: Verify Audit Log Report Available for Today with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Today or Not with Source as POS

Scenario: Verify Audit Log Report Available for Yesterday with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Yesterday or Not with Source as POS

Scenario: Verify Audit Log Report Available for Last N Days with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last N Days or Not with Source as POS

Scenario: Verify Audit Log Report Available for This Week with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for This Week or Not with Source as POS

Scenario: Verify Audit Log Report Available for Last Week with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last Week or Not with Source as POS

Scenario: Verify Audit Log Report Available for Last Seven Days with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last Seven Days or Not with Source as POS

Scenario: Verify Audit Log Report Available for This Month with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as This Month
And I Click the Apply button in Till Report 
Then Verify Audit Log Report Available for This Month or Not with Source as POSs

Scenario: Verify Audit Log Report Available for Last Month with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last Month or Not with Source as POS

Scenario: Verify Audit Log Report Available for Last Thirty Days with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Last Thirty Days or Not with Source as POS

Scenario: Verify Audit Log Report Available for Specific Date with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Specific Date or Not with Source as POS

Scenario: Verify Audit Log Report Available for Date Range with Source as POS
Given I Select the Source as POS
And I Select Filter as All
And I Select Check Type as All
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Audit Log Report Available for Date Range or Not with Source as POS

