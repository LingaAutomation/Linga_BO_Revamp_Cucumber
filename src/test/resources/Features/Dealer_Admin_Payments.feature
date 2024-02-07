@Dealer_Admin
@Dealer_Admin_Payments

Feature: Dealers Admin - Payments
I am verify the Dealers_Admin - Payments module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Dealers_Admin - Payments page
Given Open the Dealers - Payments home page BaseURL and StoreID

Scenario: Verify whether the Dealers Admin - Payments Header is Displayed
Given Verifying the Payments Header Page

Scenario: Verify whether Subscription Field is Displayed or not
Then Check Subscription Field is Displayed
Then Check Apply button is Disabled
Then Check Payments not found Disclaimer is Displayed

Scenario: Verify whether the Subscriptions is Displayed or not
When I Click the Subscription
Then Check the Subscriptions is Displayed

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify able to Search the Payments by entering 3 letters of Invoice Number, Amount
And I Verify Searching the Item when entering three letters

#Scenario: Verify whether the Currency symbol is Displayed or not
#And I Click the Subscription
#And I Select the Subscriptions
#And I Click the Apply button
#Then Verify whether the Currency symbol is not Displayed

Scenario: Verify whether the user can able to Click the Download button or not
And I Click the Subscription
And I Select the Subscriptions
And I Click the Apply button
Then Verify Subscriptions Report Generated or Not
And I Search the Invoice and Click Download button
Then Verify whether the it is Navigating to Download Invoice URL or not
























