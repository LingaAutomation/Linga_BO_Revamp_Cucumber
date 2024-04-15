@Reports
@GiftCard_Report

Feature: Reports - Gift Card Report
	I Verifying the Gift Card Reports for various Time Periods with Excel
	
Background: Open the Gift Card Report Home Page
Given Open the Reports - Gift Card Report home page BaseURL and storeID

Scenario: Verify whether the Reports - Gift Card Report Header is Displayed
Given Verifying the Gift Card Report Header Page

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Check the Available Fields in Gift Card Report
Then Check Card Number Field is Displayed
Then Check Activity Type Field is Displayed
Then Check Employee Field is Displayed
Then Check Sold In Field is Displayed
Then Check Time Period is Displayed
Then Check Card Number Field in Table is Displayed
Then Check Business Date Field in Table is Displayed
Then Check Transaction Date Field in Table is Displayed
Then Check Employee Field in Table is Displayed
Then Check Sale Number Field in Table is Displayed
Then Check Node Field in Table is Displayed
Then Check Activity Type Field in Table is Displayed
Then Check Sold In Field in Table is Displayed
Then Check Amount Field in Table is Displayed
Then Check Balance Field in Table is Displayed
Then Check Export Field is Displayed

Scenario: Verify whether the Gift Card Reports Available for searched Gift Card Number
#And I Clear the Card Number
#And I Select the Activity Type as All
#And I Select the Employee as All
#And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
And I Search the Selected Gift Card Number
Then Verify Gift Card Report Available for Selected Gift Card or Not

Scenario: Verify whether the Gift Card Reports Available for Activity Type as Adjustment
And I Clear the Card Number
And I Select the Activity Type as Adjustment
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Adjustment Activity Type or Not

Scenario: Verify whether the Gift Card Reports Available for Activity Type as Redeemed
And I Clear the Card Number
And I Select the Activity Type as Redeemed
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Redeemed Activity Type or Not

Scenario: Verify whether the Gift Card Reports Available for Activity Type as Recharges
And I Clear the Card Number
And I Select the Activity Type as Recharges
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Recharges Activity Type or Not

Scenario: Verify whether the Gift Card Reports Available for Activity Type as Sold
And I Clear the Card Number
And I Select the Activity Type as Sold
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Sold Activity Type or Not

Scenario: Verify whether the Gift Card Reports Available for Activity Type as Refund
And I Clear the Card Number
And I Select the Activity Type as Refund
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Refund Activity Type or Not

Scenario: Verify whether the Gift Card Reports Available for Activity Type as Void
And I Clear the Card Number
And I Select the Activity Type as Void
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Void Activity Type or Not

Scenario: Verify whether the Gift Card Reports Available for selected Employee
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee
And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Employee or Not

Scenario: Verify whether the Gift Card Reports Available for Sold In as Back Office
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as Back Office
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Back Office Sold In or Not

Scenario: Verify whether the Gift Card Reports Available for Sold In as Online Ordering
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as Online Ordering
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Online Ordering Sold In or Not

Scenario: Verify whether the Gift Card Reports Available for Sold In as POS
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as POS
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected POS Sold In or Not

Scenario: Verify whether the Gift Card Reports Available for Sold In as Kiosk
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as Kiosk
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Selected Kiosk Sold In or Not

Scenario: Verify whether the Gift Card Reports Available for Today
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Today
And I Click the Apply button
Then Verify Gift Card Report Available for Today or Not

Scenario: Verify whether the Gift Card Reports Available for Yesterday
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify Gift Card Report Available for Yesterday or Not

Scenario: Verify whether the Gift Card Reports Available for Last 'N' Days
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify Gift Card Report Available for Last N Days or Not

Scenario: Verify whether the Gift Card Reports Available for This Week
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify Gift Card Report Available for This Week or Not

Scenario: Verify whether the Gift Card Reports Available for Last Week
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify Gift Card Report Available for Last Week or Not

Scenario: Verify whether the Gift Card Reports Available for Last 7 Days
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify Gift Card Report Available for Last Seven Days or Not

Scenario: Verify whether the Gift Card Reports Available for This Month
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify Gift Card Report Available for This Month or Not

Scenario: Verify whether the Gift Card Reports Available for Last Month
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify Gift Card Report Available for Last Month or Not

Scenario: Verify whether the Gift Card Reports Available for Last 30 Days
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify Gift Card Report Available for Last Thirty Days or Not

Scenario: Verify whether the Gift Card Reports Available for Specific Date
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify Gift Card Report Available for Specific Date or Not

Scenario: Verify whether the Gift Card Reports Available for Date Range
And I Clear the Card Number
And I Select the Activity Type as All
And I Select the Employee as All
And I Select the Sold In as All
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify Gift Card Report Available for Date Range or Not

#Scenario: Verify whether the Gift Card Reports displays for Searched Date
#
#And I Select the Time Period as Date Range
#And I Click the Apply button
#And I Search the selected Date
#Then Verify Gift Card Report Available for Selected Date or Not

