@Reports
@Employee_TipOutShare

Feature: Reports - Employee - Tip Out Share Report
	I Verifying the Employee - Tip Out Share Reports for various Time Periods with Excel
	
Background: Open the Employee - Tip Out Share Report Home Page
Given Open the Reports - Employee - Tip Out Share Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Employee - Tip Out Share Report Header is Displayed
Given Verifying the Employee - Tip Out Share Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Employee - Tip Out Share Report
Then Check Business Date Picker Field is Displayed
Then Check Employee Field is Displayed
Then Check Role Field is Displayed
Then Check Time Period is Displayed
Then Check Name Field in Table is Displayed
Then Check Role Field in Table is Displayed
Then Check Total Hours Field in Table is Displayed
Then Check Tip Out Share Field in Table is Displayed
Then Check Tip Out Adjust Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Tip Out Share Report Available for Employee 
And I Select the Business Date
And I Select the Any Employee
And I Select the Role as All
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

Scenario: Verify whether the Tip Out Share Report Available for Admin
And I Select the Business Date
And I Select the Employee as All
And I Select the Role as Admin
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

Scenario: Verify whether the Tip Out Share Report Available for Bartender
And I Select the Business Date
And I Select the Employee as All
And I Select the Role as Bartender
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

Scenario: Verify whether the Tip Out Share Report Available for Cashier
And I Select the Business Date
And I Select the Employee as All
And I Select the Role as Cashier
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

Scenario: Verify whether the Tip Out Share Report Available for Dish
And I Select the Business Date
And I Select the Employee as All
And I Select the Role as Dish
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

Scenario: Verify whether the Tip Out Share Report Available for Driver
And I Select the Business Date
And I Select the Employee as All
And I Select the Role as Driver
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

Scenario: Verify whether the Tip Out Share Report Available for Manager
And I Select the Business Date
And I Select the Employee as All
And I Select the Role as Manager
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

Scenario: Verify whether the Tip Out Share Report Available for Server
And I Select the Business Date
And I Select the Employee as All
And I Select the Role as Server
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

Scenario: Verify whether the Employee - Tip Out Share Reports Available
And I Select the Business Date
And I Select the Employee as All
And I Select the Role as All
And I Click the Apply button
Then Verify Employee - Tip Out Share Report Availble or Not

#Scenario: Verify whether the Tip Out Share value with Tip Adjustment Screen
#And Navigate to Tip Adjustment User Management - Tip Adjustment Page and Varify the Tip Shared Value
#And Navigate to Employee Role Based Payroll Report and Verify the Tip Shared Value

