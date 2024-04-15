@Reports
@BatchReport

Feature: Reports - Batch Report
I Verifying the Batch Report for various Time Periods with Excel
	
Scenario: Open the Batch Report Home Page
Given Open the Reports - Batch Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Batch Report Header is Displayed
Given Verifying the Batch Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify Available Fields in Batch Report
Then Check Select Node Field is Displayed
Then Check Select Employee Field is Displayed 
Then Check Select Batch Type Field is Displayed
Then Check Select Date Type Field is Displayed
Then Check Select TimePeriod Field is Displayed
Then Check Check Field in Table is Displayed
Then Verify Card Number Field in Table is Dispalyed
Then Check Transaction Field in Table is Displayed
Then Check Amount Field in Table is Displayed
Then Check CC Service Charge Field in Table is Displayed
Then Check Tip Amount Field in Table is Displayed
Then Check Date Field in Table is Displayed
Then Check Batch Settled Field in Table is Displayed
Then Check Server Name Field in Table is Displayed
Then Check POS Node Field in Table is Displayed
Then Check Type Field in Table is Displayed

Scenario: Verify Whether the Batch Report Available for Today with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Today or Not with DateType as BusinessDate 

Scenario: Verify Whether the Batch Report Available for Yesterday with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Yesterday or Not with DateType as BusinessDate 

Scenario: Verify Whether the Batch Report Available for Last N Days with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last N Days or Not with DateType as BusinessDate 

Scenario: Verify Whether the Batch Report Available for This Week with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Batch Report Available for This Week or Not with DateType as BusinessDate 

Scenario: Verify Whether the Batch Report Available for Last Week with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last Week or Not with DateType as BusinessDate 

Scenario: Verify Whether the Batch Report Available for Last Seven Days with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last Seven Days or Not with DateType as BusinessDate

Scenario: Verify Whether the Batch Report Available for This Month with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify Batch Report Available for This Month or Not with DateType as BusinessDate 

Scenario: Verify Whether the Batch Report Available for Last Month with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last Month or Not with DateType as BusinessDate

Scenario: Verify Whether the Batch Report Available for Last 30 Days with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last Thirty Days or Not with DateType as BusinessDate

Scenario: Verify Whether the Batch Report Available for Specific Date with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Specific Date or Not with DateType as BusinessDate

Scenario: Verify Whether the Batch Report Available for Date Range with DateType as BusinessDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Business Date
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Date Range or Not with DateType as BusinessDate

Scenario: Verify Whether the Batch Report Available for Today with DateType as Batch Settled Date 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as Today
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Today or Not with DateType as BatchSettledDate

Scenario: Verify Whether the Batch Report Available for Yesterday with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as Yesterday
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Yesterday or Not with DateType as BatchSettledDate  

Scenario: Verify Whether the Batch Report Available for Last N Days with DateType as BatchSettledDate  
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date 
And I Select the Time Period as Last N Days
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last N Days or Not with DateType as BatchSettledDate  

Scenario: Verify Whether the Batch Report Available for This Week with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as This Week
And I Click the Apply button in Till Report
Then Verify Batch Report Available for This Week or Not with DateType as BatchSettledDate 

Scenario: Verify Whether the Batch Report Available for Last Week with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as Last Week
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last Week or Not with DateType as BatchSettledDate 

Scenario: Verify Whether the Batch Report Available for Last Seven Days with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as Last Seven Days
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last Seven Days or Not with DateType as BatchSettledDate

Scenario: Verify Whether the Batch Report Available for This Month with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as This Month
And I Click the Apply button in Till Report
Then Verify Batch Report Available for This Month or Not with DateType as BatchSettledDate 

Scenario: Verify Whether the Batch Report Available for Last Month with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as Last Month
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last Month or Not with DateType as BatchSettledDate

Scenario: Verify Whether the Batch Report Available for Last 30 Days with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as Last Thirty Days
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Last Thirty Days or Not with DateType as BatchSettledDate

Scenario: Verify Whether the Batch Report Available for Specific Date with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as Specific Date
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Specific Date or Not with DateType as BatchSettledDate

Scenario: Verify Whether the Batch Report Available for Date Range with DateType as BatchSettledDate 
Given I Select the Node as All
And I Select Employee as All
And I Select Batch Type as All
And I Select Date Type as Batch Settled Date
And I Select the Time Period as Date Range
And I Click the Apply button in Till Report
Then Verify Batch Report Available for Date Range or Not with DateType as BatchSettledDate