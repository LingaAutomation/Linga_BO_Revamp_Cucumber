@Linga_Admin
@Linga_Dealer_Payments

Feature: Linga_Admin - Dealers_Payments
I am verify the Linga_Admin - Dealers_Payments module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Linga Admin - Payments page
Given Open the Linga Admin - Payments home page BaseURL and StoreID

Scenario: Verify whether the Linga Admin - Payments Header is Displayed
Given Verifying the Payments Header Page

Scenario: Verify whether Dealers and Subscription Field is Displayed or not
Then Check Dealers Field is Displayed
Then Check Subscription Field is Displayed
Then Check Apply button is Disabled
Then Check Payments not found Disclaimer is Displayed

Scenario: Verify whether the Subscriptions is Displayed or not
When I Click the Subscription
Then Check the Subscriptions is not Displayed

Scenario: Verify whether Dealers are Displayed in Dealer dropdown
And I Click the Dealer
Then Verify whether the Search bar is Displayed
And I Click the Dealer
And I Select the Dealer
And I Click the Subscription
Then Check whether the Subscriptions of the Dealer is Displayed
And I Click the Subscription
And I Select the Subscriptions
Then Check whether the Apply button is Enabled
And I Click the Apply button
Then Check whether the Payments is Displayed

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the Make Payment header
Given I Search the Invoice and Click Pay Now button
Then Verify the Make Payment Header

Scenario: Verify whether we can able to Cancel/Close the Make Payment screen
And I Click the Cancel button
Then I Verify Department Update screen Close or not

Scenario: Verify able to Search the Payments by entering 3 letters of Invoice Number, Amount
And I Verify Searching the Item when entering three letters

Scenario: Verify whether Customer Name, Amount Receied and Commission Fields is Displayed or not
And I Take the Customer Name Before Search 
Given I Search the Invoice and Click Pay Now button
Then Check whether the Customer Name Field is Displayed
And I Take the Name from Customer Name Field
Then Validate the Customer Name Same in Make Payment Screen
Then Check Amount Receied Field is Displayed
Then Check Commission Field is Displayed
Then Check Amount to Be Paid Field is Displayed
And I Click the Cancel button

 

#And I Edit the Customer Name, Amount Received and Commission Fields
#Then Verify whether the Customer Name, Amount Received and Commission Fields Can be Edited or not


Scenario: Verify whether Amount and Amount received fields are showing same Amount
And I Take the Amount Before Search
Given I Search the Invoice and Click Pay Now button
And I Take the Amount from Amount Received Field
Then Verify the Amount in Invoice and Amount Received in Make Payment screen are same

Scenario: Validate the Amount to Be Paid by Amount Received with Commission or not
Given I Search the Invoice and Click Pay Now button
Then Validate the Amount to Be Paid by Amount Received with Commission
And I Click Pay Now button
Then Verify whether the can make the Payment

Scenario: Verify whether the Commission Status is Displayed as Un-Paid
Then I Search the Invoice and Check the Status as Un-Paid

Scenario: Verify whether the user can make the Payment after Entering the Amount to Be Paid
Given I Search the Invoice and Click Pay Now button
And I Enter the Amount to Be Paid
And I Click Pay Now button
Then Verify whether the can make the Payment

Scenario: Verify whether the Commission Status is Displayed as Paid
Then I Search the Invoice and Check the Status as Paid

Scenario: Verify whether the user can make the Payment with 0 Amount to Be Paid
Given I Search the Invoice and Click Pay Now button
And I Enter the Amount to Be Paid as Zero
And I Click Pay Now button
Then Verify whether the can make the Payment

Scenario: Verify whether the Commission Amount/Percentage is Displayed which is Mapped to the Dealer
Given Navigate to Linga Admin - Dealers Page
And I Search and Edit the Dealer Name
And I Take the Percentage from Dealers Page
Then I Navigate to Linga Admin - Payments Page
And I Select the Dealer
And I Select the Subscriptions
And I Click the Apply button
Given I Search the Invoice and Click Pay Now button
And I Take the Commision Percentage
Then Verify whether the Commission Amount/Percentage is Displayed which is Mapped to the Dealer
And I Click the Cancel button
Then Check the Commision Percentage in Column

#Scenario: Verify whether the Status is Displayed as Paid
#Then I Search the Invoice and Check the Status as Paid
#
#Scenario: Verify whether the Commission Status is Displayed as Un-Paid
#Then I Search the Invoice and Check the Status as Un-Paid



#Scenario: Verify whether the Currency symbol is Displayed or not
#And I Click the Dealer Dropdown
#And I Select the Dealer
#And I Select the Subscriptions
#And I Select the Subscriptions
#And I Click the Apply button
#Then Verify whether the Currency symbol is not Displayed


























