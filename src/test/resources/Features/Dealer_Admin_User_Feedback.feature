@Dealer_Admin
@Dealer_User_Feedback
Feature: Dealer Admin	 - User Feedback

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the User feedback module after Login to Application when Enter Username and Passowrd

Background: Opening the Dealer User Feedback page
Given Open the Dealer Admin - User Feedback home page BaseURL and storeID

#Scenario: Verify the "We welcome your Feedback" pop-up appears and check the Number filter and Comment box
#And I Clicking the number Filter option from "recommend to your friend option"
#And I Clicking the number Filter option from "customer support rating" 
#And I Click on the comment Box
#When I Enter the comment
#And I Click on the Submit button
#Then Verify Pop up displaying feedback sent or not

Scenario: Verify User Feedback not found while opening user feedback page
Then User Feedback not found is Displayed

Scenario: Verify whether the Dealer - User Feedback Header is Displayed
Given Verifying the User Feedback Header Page
And I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order


Scenario: Verify whether we able to find all table fields in User Feedback page 
#When I Click the User Feedback module
Then Check Date Created Field Displayed
Then Check Name Field Displayed	
Then Check Email ID Field Displayed
Then Check Account Name Displayed
Then Check Store Name Displayed
Then Check Product Rating Displayed
Then Check Support Rating Displayed
Then Check Comment Displayed


#Scenario: Verify whether user can view Time Period Field, Search Option & Export as Excel button with pagination.
#Given I can do the Pagination 
#And I Click the Filter option with coloumns 
#Then Verify whether user can able to find the  Time Period Field, Search Option & Export as Excel button or not.

#Scenario: Verify whether the By Default, Time period will be Today.
#When I Click the User Feedback module
#Then Check Time Period is Defaultly Selected as Today

#Scenario: Verify whether the Detail Description of each column in Data Table
#When I Click the User Feedback module 
#Given The table fields like Date Created, Name, Email Id, Account Name, Store Name ,Product Rating ,Support Rating Comment
#Then Verify whether each column in the data table is having values or not 
#Then Verify whether Date Created column have value in Date-month-year format or not
#Then Verify whether Name column have Proper name or not
#Then Verify whether Email id column have Valid email or not
#Then Verify whether Account Name column have the account name of the customer or not 
#Then Verify whether Store Name column have valid store name or not
#Then Verify whether Product Rating column have numbers in the range of 1-10 or not
#Then Verify whethe comment column is having comments provided by the user in the "We welcome your Feedback" pop-up or not 



Scenario: Verify able to generate the User Feedback for Today
And I Select the Time Period as Today
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for Yesterday
And I Select the Time Period as Yesterday
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for Last N days
And I Select the Time Period as Last N Days
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for This Week
And I Select the Time Period as This Week
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for Last Week
And I Select the Time Period as Last Week
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for Last 7 days
And I Select the Time Period as Last Seven days
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not


Scenario: Verify able to generate the User Feedback for This Month
And I Select the Time Period as This Month
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for Last Month
And I Select the Time Period as Last Month
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for Last 30 days
And I Select the Time Period as Last Thirty days
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for Specific Date
And I Select the Time Period as Specific Date
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

Scenario: Verify able to generate the User Feedback for Date Range
And I Select the Time Period as Date Range
And I Click the Apply button
Then Verify User Feedback Report generated for Selected Time Period or Not

