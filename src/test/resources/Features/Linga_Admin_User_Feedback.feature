@Linga_Admin
@Linga_User_Feedback
Feature:  Linga Admin	 - User Feedback

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the User feedback module after Login to Application when Enter Username and Passowrd

Background: Opening the Admin User Feedback page
Given Open the Linga Admin - User Feedback home page BaseURL and storeID

#Scenario: Verify the "We welcome your Feedback" pop-up appears and check the Number filter and Comment box
#And I Clicking the number Filter option from "recommend to your friend option"
#And I Clicking the number Filter option from "customer support rating" 
#And I Click on the comment Box
#When I Enter the comment
#And I Click on the Submit button
#Then Verify Pop up displaying feedback sent or not

Scenario: Verify Admin User Feedback not found while opening Admin user feedback page
Then User Feedback not found is Displayed

Scenario: Verify whether the Admin - User Feedback Header is Displayed
Given Verifying the User Feedback Header Page
And I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order


Scenario: Verify whether we able to find all table fields in Admin - User Feedback page 
#When I Click on the Admin - User Feedback module
Then Check Date Created Field Displayed
Then Check Name Field Displayed	
Then Check Email ID Field Displayed
Then Check Account Name Displayed
Then Check Store Name Displayed
Then Check Product Rating Displayed
Then Check Support Rating Displayed
Then Check Comment Displayed

Scenario: Verify whether the By Default, Time period will be Today.
Then Check Time Period is Defaultly Selected as Today


Scenario: Verify whether the Admin User can view the date in Date-month-year format
#When I Click on the user feedback module 
Then Verify Whether the date displayed is in Date-Month-Year format or not

Scenario: Verify able to generate the Admin User Feedback for Today
And I Select the Time Period as Today
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not


Scenario: Verify able to generate the Admin User Feedback for Yesterday
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the Admin User Feedback for Last N days
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the Admin User Feedback for This Week
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the Admin User Feedback for Last Week
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the Admin User Feedback for Last 7 days
And I Select the Time Period as Last Seven Days
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not


Scenario: Verify able to generate the Admin User Feedback for This Month
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the Admin User Feedback for Last Month
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the Admin User Feedback for Last 30 days
And I Select the Time Period as Last Thirty Days
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the Admin User Feedback for Specific Date
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the Admin User Feedback for Date Range
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

