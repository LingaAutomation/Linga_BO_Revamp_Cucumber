@Reports
@MenuItem_Sale_Report

Feature: Reports - Menu Item Sale Report
	I Verifying the Menu Item Sale Reports for various Time Periods with Excel
	
Background: Open the Menu Item Sale Report Home Page
Given Open the Reports - Menu Item Sale Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Menu Item Sale Report Header is Displayed
Given Verifying the Menu Item Sale Report Header Page


Scenario: Check the Available Fields in Menu Item Sale Report
Then Check Select Department Field is Displayed
Then Check Select Category Field is Displayed
Then Check Select SubCategory Field is Displayed
Then Check Select Menu Item Field is Displayed
Then Check Select Serving Level Field is Displayed
Then Check Select Price Level Field is Displayed
Then Check Employee Field is Displayed
Then Check Select Split By Serving Level Check Box Field is Displayed
Then Check Time Period is Displayed
Then Check Name Field in Table is Displayed
Then Check Department Field in Table is Displayed
Then Check Category Field in Table is Displayed
Then Check SubCategory Field in Table is Displayed
Then Check Sale Amount Field in Table is Displayed
Then Check Quantity Field in Table is Displayed
Then Check Tax Field in Table is Displayed
Then Check Discount Field in Table is Displayed
Then Check %of Sale Field in Table is Displayed
Then Check Price Level Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Menu Item Sale Reports Available for Today
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Today or Not

Scenario: Verify whether the Menu Item Sale Reports Available for Yesterday
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Yesterday or Not

Scenario: Verify whether the Menu Item Sale Reports Available for Last 'N' Days
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Last N Days or Not

Scenario: Verify whether the Menu Item Sale Reports Available for This Week
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for This Week or Not

Scenario: Verify whether the Menu Item Sale Reports Available for Last Week
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Last Week or Not

Scenario: Verify whether the Menu Item Sale Reports Available for Last 7 Days
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Last Seven Days or Not

Scenario: Verify whether the Menu Item Sale Reports Available for This Month
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for This Month or Not

Scenario: Verify whether the Menu Item Sale Reports Available for Last Month
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Last Month or Not

Scenario: Verify whether the Menu Item Sale Reports Available for Last 30 Days
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Last Thirty Days or Not

Scenario: Verify whether the Menu Item Sale Reports Available for Specific Date
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Specific Date or Not

Scenario: Verify whether the Menu Item Sale Reports Available for Date Range
And I Select the Department as All
And I Select the Category as All
And I Select the SubCategory as All
And I Select the Menu Item as All
And I Select the Serving Level as All
And I Select the Price as All
And I Select the Employee as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Menu Item Sale Report Availble for Date Range or Not

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