@Settings
@BusinessHours

Feature: Settings - Business Hours
I am verify the Settings- Business Hours Module and Performing Some Operations on that

Scenario: Opening the Store Business Hours page
Given Open Business Hours home page BaseURL and StoreID

Scenario: Verify whether the Business Hours Header is Displayed
Given Verifying the Business Hours Header Page

Scenario: Verify By Default Store Hours is Selected or Not
Given Verify Store Hours is Selected or Not

Scenario: Verify Store Hours Available Fields Displayed or Not
Given Click on Store Hours Field
Then Verify Day Field is Displayed or Not
Then Verify Open or Closed Field is Displayed or Not
Then Verify Open at Field is Displayed or Not
Then Verify Closed at Field is Displayed or Not

Scenario: Select the Sunday as Closed and Verify Openat and Closedat
Given Select Sunday as Closed 
Then Verify Open at Closed at Displayed or Not
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Sunday as Opened 
Given Select Sunday as Opened
Then Verify Open at Closed at Displayed or Not
And Select Open at Time
And Select Closed at Time
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Monday as Closed and Verify Openat and Closedat
Given Select Monday as Closed 
Then Verify For Monday Open at Closed at Displayed or Not
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Monday as Opened 
Given Select Monday as Opened
Then Verify Open at Closed at Displayed or Not
And Select Monday Open at Time
And Select Monday Closed at Time
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Tuesday as Closed and Verify Openat and Closedat
Given Select Tuesday as Closed 
Then Verify For Tuesday Open at Closed at Displayed or Not
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Tuesday as Opened 
Given Select Tuesday as Opened
Then Verify Open at Closed at Displayed or Not
And Select Tuesday Open at Time
And Select Tuesday Closed at Time
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Wednesday as Closed and Verify Openat and Closedat
Given Select Wednesday as Closed 
Then Verify Wednesday Open at Closed at Displayed or Not
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Wednesday as Opened 
Given Select Wednesday as Opened
Then Verify Open at Closed at Displayed or Not
And Select Wednesday Open at Time
And Select Wednesday Closed at Time
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Thursday as Closed and Verify Openat and Closedat
Given Select Thursday as Closed 
Then Verify Thursday Open at Closed at Displayed or Not
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Thursday as Opened 
Given Select Thursday as Opened
Then Verify Open at Closed at Displayed or Not
And Select Thursday Open at Time
And Select Thursday Closed at Time
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Friday as Closed and Verify Openat and Closedat
Given Select Friday as Closed 
Then Verify Friday Open at Closed at Displayed or Not
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Friday as Opened 
Given Select Friday as Opened
Then Verify Open at Closed at Displayed or Not
And Select Friday Open at Time
And Select Friday Closed at Time
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Saturday as Closed and Verify Openat and Closedat
Given Select Saturday as Closed 
Then Verify Saturday Open at Closed at Displayed or Not
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Saturday as Opened 
Given Select Saturday as Opened
Then Verify Open at Closed at Displayed or Not
And Select Saturday Open at Time
And Select Saturday Closed at Time
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Verify the Available Toggles Displayed or Not
Then Verify Require Confirmation Before Closing Day Toggle is Displayed or Not
Then Verify Close All Active Tills Toggle is Displayed or Not
Then Verify Close All Active Employees Toggle is Displayed or Not
Then Verify Close Opened Checks Toggle is Displayed or Not
Then Verify Closing Opened Checks Toggle is Displayed or Not

Scenario: Enable Require Confirmation Before Closing Day
Given Enable Require Confirmation Before Closing Day
Then Verify the Confirmation Alert Message
And I Click the Cancel button in Pop Up
Then Disable Require Confirmation Before Closing Day
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Enable and Disable Close All Active Tills Toggle
Given Disable Close All Active Tills Toggle
Then Enable Close All Active Tills Toggle
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Enable and Disable Close All Active Employees Toggle
Given Disable Close All Active Employees Toggle
Then Enable Close All Active Employees Toggle
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Enable and Disable Close Opened Checks Toggle
Given Disable Close Opened Check Toggle
Then Enable Close Opened Check Toggle
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Closing Opened Checks Toggle as Cash
Given Select Closing Opened Checks Toggle as Cash
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Select the Closing Opened Checks Toggle as Void
Given Select Closing Opened Checks Toggle as Void
And I Click the Update button Business Hours
Then Verify Bussiness Hours Updated or Not

Scenario: Click on shifts and Navigate to Shifts
Given Click on Shifts 

Scenario: Verify the Available Fields in Shift
Then Verify Shift Name Field is Displayed or Not
Then Verify Open at Field is Displayed or Not in Shifts
Then Verify Closed at Field is Displayed or Not in Shifts

Scenario: Add New Shift
#Given Click on Add Shift button
And Enter the Shift Name
Then Enter Open at Time
And Enter Closed at Time
And I Click the Update button Business Hours
Then Verify Shift Updated or Not

Scenario: Add New Shift
#Given Click on Add Shift button
And Enter the Second Shift Name
Then Enter Second shift Open at Time
And Enter Second Closed at Time
And I Click the Update button Business Hours
Then Verify Shift Updated or Not

Scenario: Add New Shift
#Given Click on Add Shift button
And Enter the Third Shift Name
Then Enter Third shift Open at Time
And Enter Third Closed at Time
And I Click the Update button Business Hours
Then Verify Shift Updated or Not

Scenario: Add New Shift
Given Click on Add Shift button
And Enter the Fourth Shift Name
Then Enter Fourth shift Open at Time
And Enter Fourth Closed at Time

Scenario: Delete the Added shift and Click on Cancel
Given Click on Delete the Added Shift
And I Click the Cancel button in Pop Up
Then Verify Shift is Deleted After Clicking on Cancel

Scenario: Delete the Added shift
Given Click on Delete the Added Shift
 And I Click the Delete button
Then Verify Shift is Deleted or Not

Scenario: Update the Shift After Deletion
And I Click the Update button Business Hours
Then Verify Shift Updated or Not







