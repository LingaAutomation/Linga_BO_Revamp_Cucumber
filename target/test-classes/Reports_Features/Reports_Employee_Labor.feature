@Reports
@EmployeeLaborReport
Feature: Reports - Employee Labor Report
	I Verifying the Employee Labor Reports for various Time Periods with Excel
	
Background: Open the Employee Labor Report Home Page
Given Open the Reports - Employee Labor Report home page BaseURL and storeID

@ELRTest1
Scenario: Verify whether the Reports - Employee Labor Report Header is Displayed
Given Verifying the Employee Labor Report Header Page

@ELRTest2
Scenario: Check the Available Fields in Employee Labor Report
Then Check Employee Field is Displayed
Then Check Process Field is Displayed
Then Check Format Field is Displayed
Then Check Active/Inactive Field is Displayed
Then Check Shift Status Field is Displayed
Then Check Time Period Field is Displayed
Then Check Search Field is Displayed
Then Check Columns Field is Displayed
Then Check Export Field is Displayed
Then Check Name Field in Table is Displayed
Then Check Employee Id Field in Table is Displayed
Then Check Net Sales Field in Table is Displayed
Then Check Hours in Table is Displayed
Then Check Labor in Table is Displayed
Then Check % of Net Sales Field in Table is Displayed
Then Check Labor Percentage Field in Table is Displayed
Then Check Shift Status Field in Table is Displayed

@ELRTest3
Scenario: Verify whether the Employee Labor Report Available for Process DW, InHours, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Hours
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Availble for Process DW, InHours, DateRange

@ELRTest4
Scenario: Verify whether the Employee Labor Report Available for Process DW, InHours, Active, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Hours
And I select Active/Inactive as Active
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Available for Process DW, InHours, Active, DateRange

@ELRTest5
Scenario: Verify whether the Employee Labor Report Available for Process DW, InHours, Inactive, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Hours
And I select Active/Inactive as Inactive
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Available for Process DW, InHours, Inactive, DateRange

@ELRTest6
Scenario: Verify whether the Employee Labor Report Available for Process DW, InHours, In Shift, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Hours
And I select Active/Inactive as All
And I select Shift Status as In Shift
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Available for Process DW, InHours, In Shift, DateRange

@ELRTest7
Scenario: Verify whether the Employee Labor Report Available for Process DW, InHours, Shift Closed, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Hours
And I select Active/Inactive as All
And I select Shift Status as Shift Closed
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Available for Process DW, InHours, Shift Closed, DateRange

@ELRTest8
Scenario: Verify whether the Employee Labor Report Available for Process DW, InTime, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Availble for Process DW, InTime, DateRange

@ELRTest9
Scenario: Verify whether the Employee Labor Report Available for Process DW, InTime, Active, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as Active
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Available for Process DW, InTime, Active, DateRange

@ELRTest10
Scenario: Verify whether the Employee Labor Report Available for Process DW, InTime, Inactive, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as Inactive
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Available for Process DW, InTime, Inactive, DateRange

@ELRTest11
Scenario: Verify whether the Employee Labor Report Available for Process DW, InTime, In Shift, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as In Shift
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Available for Process DW, InTime, In Shift, DateRange

@ELRTest12
Scenario: Verify whether the Employee Labor Report Available for Process DW, InTime, Shift Closed, DateRange
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as Shift Closed
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Available for Process DW, InTime, Shift Closed, DateRange

@ELRTest13
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Today
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Today
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Today

@ELRTest14
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Yesterday
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Yesterday
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Yesterday

@ELRTest15
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Last_NDays
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last_NDays
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Last_NDays


@ELRTest16
Scenario: Verify whether the Employee Labor Report Available for Process Daily, This Week
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as This Week
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, This Week

@ELRTest17
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Last Week
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last Week
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Last Week

@ELRTest18
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Last_7Days
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And  I select Time Period as Last_7Days
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Last_7Days

@ELRTest19
Scenario: Verify whether the Employee Labor Report Available for Process Daily, This Month
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as This Month
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, This Month

@ELRTest20
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Last Month
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last Month
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Last Month

@ELRTest21
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Last_30Days
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last_30Days
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Last_30Days

@ELRTest22
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Specific Date
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Specific Date
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Specific Date

@ELRTest23
Scenario: Verify whether the Employee Labor Report Available for Process Daily, Date Range
And I select Employee as All
And I select Process as Daily
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily, Date Range

@ELRTest24
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Today
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Today
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Today

@ELRTest25
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Yesterday
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Yesterday
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Yesterday

@ELRTest26
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Last_NDays
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last_NDays
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Last_NDays

@ELRTest27
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, This Week
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as This Week
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, This Week

@ELRTest28
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Last Week
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last Week
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Last Week

@ELRTest29
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Last_7Days
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last_7Days
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Last_7Days

@ELRTest30
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, This Month
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as This Month
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, This Month

@ELRTest31
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Last Month
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last Month
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Last Month

@ELRTest32
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Last_30Days
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last_30Days
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Last_30Days

@ELRTest33
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Specific Date
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Specific Date
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Specific Date

@ELRTest34
Scenario: Verify whether the Employee Labor Report Available for Process Weekly, Date Range
And I select Employee as All
And I select Process as Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Weekly, Date Range

@ELRTest35
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Today
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Today
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Today

@ELRTest36
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Yesterday
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Yesterday
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Yesterday

@ELRTest37
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, This Week
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as This Week
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, This Week

@ELRTest38
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Last Week
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last Week
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Last Week

@ELRTest39
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Last_7Days
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last_7Days
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Last_7Days

@ELRTest40
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, This Month
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as This Month
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, This Month

@ELRTest41
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Last Month
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last Month
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Last Month

@ELRTest42
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Last_30Days
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last_30Days
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Last_30Days

@ELRTest43
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Specific Date
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Specific Date
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Specific Date

@ELRTest44
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Date Range
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Date Range
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Date Range

@ELRTest45
Scenario: Verify whether the Employee Labor Report Available for Process Daily/Weekly, Last_NDays
And I select Employee as All
And I select Process as Daily/Weekly
And I select Format as In Time
And I select Active/Inactive as All
And I select Shift Status as All
And I select Time Period as Last_NDays
And I Click Apply button
Then Verify Employee Labor Report Availble for Process Daily/Weekly, Last_NDays
