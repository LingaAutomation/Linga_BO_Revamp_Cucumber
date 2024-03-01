@Reports
@Tax_Reports

Feature: Reports - Tax Report
	I Verifying the Tax Reports for various Time Periods with Excel
	
Background: Open the Tax Report Home Page
Given Open the Reports - Tax Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Tax Report Header is Displayed
Given Verifying the Tax Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
#And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Tax Report
Then Check Tax Per ServiceType Check Box Field is Displayed
Then Check Time Period is Displayed
Then Check Tax Name Field in Table is Displayed
Then Check Tax Percentage Field in Table is Displayed
Then Check Net Sales Field in Table is Displayed
Then Check Tax Amount Field in Table is Displayed
Then Check Tax Exempt Field in Table is Displayed
And I Enable Tax Per ServiceType Check Box
Then Check QSR Field in Table is Displayed
Then Check Bar Field in Table is Displayed
Then Check Dine In Field in Table is Displayed
Then Check To Go Field in Table is Displayed
Then Check Delivery Field in Table is Displayed
Then Check For Here Field in Table is Displayed
Then Check Web Field in Table is Displayed
And I Disable Tax Per ServiceType Check Box
Then Check Export Field is Displayed

Scenario: Verify whether the Tax Reports Available for Today
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Tax Report Availble for Today or Not

Scenario: Verify whether the Tax Reports Available for Yesterday
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Tax Report Availble for Yesterday or Not

Scenario: Verify whether the Tax Reports Available for Last 'N' Days
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Tax Report Availble for Last N Days or Not

Scenario: Verify whether the Tax Reports Available for This Week
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Tax Report Availble for This Week or Not

Scenario: Verify whether the Tax Reports Available for Last Week
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Tax Report Availble for Last Week or Not

Scenario: Verify whether the Tax Reports Available for Last 7 Days
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Tax Report Availble for Last Seven Days or Not

Scenario: Verify whether the Tax Reports Available for This Month
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Tax Report Availble for This Month or Not

Scenario: Verify whether the Tax Reports Available for Last Month
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Tax Report Availble for Last Month or Not

Scenario: Verify whether the Tax Reports Available for Last 30 Days
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Tax Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Tax Reports Available for Specific Date
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Tax Report Availble for Specific Date or Not

Scenario: Verify whether the Tax Reports Available for Date Range
And I Disable Tax Per ServiceType Check Box
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Tax Report Availble for Date Range or Not

#Scenario: Verify whether the Top Sales is displayed as Donut Chart
#And I Select the Time Period as Date Range
#And I Click the Apply button
#Then Check Top Sales displayed as Donut Chart
#
#Scenario: Verify whether the Top Sales is displayed as Bar Chart
#And I Select the Time Period as Date Range
#And I Click the Apply button
#Then Check Top Sales displayed as Bar Chart
#
#Scenario: Verify whether the Sales By Hour Graph is Displayed
#And I Select the Time Period as Date Range
#And I Click the Apply button
#Then Check Sales By Hour Graph is Displayed