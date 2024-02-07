@Dealer_Admin
@Dealer_Subscriptions
Feature: DealerAdmin - Subscriptions
  I am verify the Dealer - Subscriptions module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Dealer - Subscriptions page
Given Open the Dealer - Subscriptions page BaseURL and StoreID

Scenario: Verify whether the Subscriptions Header is Displayed
Given Verifying the Subscriptions Header Page

  #Scenario: Verify Selected Subscriptions Under Dealer Admin Page
    #Given Verify Subscriptions Selected From Dealer Admin Page or Not

Scenario: Verify Path Displayed above the Header
Given Verifying the Path Admin / Dealers / Subscriptions Displayed above the Header

Scenario: Verify field is Displayed under Subscriptions Page
Then Check the Customer Name header in Subscriptions is Displayed
Then Check the Plan header in Subscriptions is Displayed
Then Check the Status header in Subscriptions is Displayed
Then Check the Created Date header in Subscriptions is Displayed
Then Check the Activated Date header in Subscriptions is Displayed
Then Check the Amount header in Subscriptions is Displayed
Then Check the Last Billing Date header in Subscriptions is Displayed
Then Check the Next Billing Date header in Subscriptions is Displayed

Scenario: Verify whether Subscriptions Field is Displayed or not
Then Check Subscriptions not found Disclaimer is Displayed

    #Sorting
#Scenario: Verify Sorting Options Under All Fields
#And I Check Sorting Option Displayed in Customer Name header
#And I Check Sorting Option Displayed in Plan header
#And I Check Sorting Option Displayed in Status header
#And I Check Sorting Option Displayed in Created Date header
#And I Check Sorting Option Displayed in Activated Date header
#And I Check Sorting Option Displayed in Amount header
#And I Check Sorting Option Displayed in Last Billing Date header
#And I Check Sorting Option Displayed in Next Billing Date header
#Then Verify Sorting option in all header or not

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify able to search the Account by entering 3 letters of Account Name
And I Verify Searching the Item when entering three letters

Scenario: Verify whether the Subscriptions Reports are Generated
Then Verify the Subscriptions Reports are Generated or not


    #Ascending Order
  #Scenario: Verify Perform Ascending Sorting Options Under All Fields
    #And I Check in Customer Name header Displayed as Ascending Order
    #And I Check in Plan header Displayed as Ascending Order
    #And I Check in Status header Displayed as Ascending Order
    #And I Check in Created Date header Displayed as Ascending Order
    #And I Check in Activated Date header Displayed as Ascending Order
    #And I Check in Amount header Displayed as Ascending Order
    #And I Check in Last Billing Date header Displayed as Ascending Order
    #And I Check in Next Billing Date header Displayed as Ascending Order
    #Then Verify Ascending Sorting Perform in all header or not

    #Descending Order
  #Scenario: Verify Perform Descending Sorting Options Under All Fields
    #And I Check in Customer Name header Displayed as Descending Order
    #And I Check in Plan header Displayed as Descending Order
    #And I Check in Status header Displayed as Descending Order
    #And I Check in Created Date header Displayed as Descending Order
    #And I Check in Activated Date header Displayed as Descending Order
    #And I Check in Amount header Displayed as Descending Order
    #And I Check in Last Billing Date header Displayed as Descending Order
    #And I Check in Next Billing Date header Displayed as Descending Order
    #Then Verify Descending Sorting Perform in all header or not

    #Trail
#Scenario: Verify Core Plan displaying in Subscriptions
#Given I Search the Trail Account with Plan as Basic
#Then Check the Plan as Basic
#Then Verify Core Plan and Details in Subscriptions Displayed or Not
#
#Scenario: Verify Pro Plan displaying in Subscriptions
#Given I Search the Trail Account with Plan as Pro Plan
#Then Check the Plan as Pro Plan
#Then Verify Pro Plan and Details in Subscriptions Displayed or Not
#
#Scenario: Verify Enterprise Plan displaying in Subscriptions
#Given I Search the Trail Account with Plan as Enterprise Plan
#Then Check the Plan as Enterprise Plan
#Then Verify Enterprise Plan and Details in Subscriptions Displayed or Not
#
#Scenario: Verify Linga One Plan displaying in Subscriptions
#Given I Search the Trail Account with Plan as Linga One Plan
#Then Check the Plan as Linga One Plan
#Then Verify Linga One Plan and Details in Subscriptions Displayed or Not
#
#Scenario: Verify Trail for Retail- Pro Plan displaying in Subscriptions
#Given I Search the Trail Account with Plan as Retail- Pro Plan
#Then Check the Plan as Retail- Pro Plan
#Then Verify Retail- Pro Plan and Details in Subscriptions Displayed or Not
#
#Scenario: Verify Trail for Retail- Core Plan displaying in Subscriptions
#Given I Search the Trail Account with Plan as Retail- Core Plan
#Then Check the Plan as Retail- Core Plan
#Then Verify Retail- Core Plan and Details in Subscriptions Displayed or Not
#
#Scenario: Verify Trail for Retail- Enterprise Plan displaying in Subscriptions
#Given I Search the Trail Account with Plan as Retail- Enterprise Plan
#Then Check the Plan as Retail- Enterprise Plan
#Then Verify Retail- Enterprise Plan and Details in Subscriptions Displayed or Not

#Trail Expired
@pro
Scenario: Verify Trail Expired for Basic Plan displaying in Subscriptions
Given I Search the Trail Expired Account with Plan as Basic Plan
Then Check the Plan as Basic Plan
Then Verify Trail Expired Basic Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Trail Expired for Pro Plan displaying in Subscriptions
Given I Search the Trail Expired Account with Plan as Pro Plan
Then Check the Plan as Pro Plan
Then Verify Trail Expired Pro Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Trail Expired for Enterprise Plan displaying in Subscriptions
Given I Search the Trail Expired Account with Plan as Enterprise Plan
Then Check the Plan as Enterprise Plan
Then Verify Trail Expired Enterprise Plan and Details in Subscriptions Displayed or Not

#Linga One Not available

#Scenario: Verify Trail Expired for Linga One Plan displaying in Subscriptions
#Given I Search the Trail Expired Account with Plan as Linga One Plan
#Then Check the Plan as Linga One Plan
#Then Verify Linga One Plan and Details in Subscriptions Displayed or Not

#Retail Pro Not Available

#Scenario: Verify Trail Expired for Retail- Pro Plan displaying in Subscriptions
#Given I Search the Trail Expired Account with Plan as Retail- Pro Plan
#Then Check the Plan as Retail- Pro Plan
#Then Verify Retail- Pro Plan and Details in Subscriptions Displayed or Not

#Retail CorePlan

#Scenario: Verify Trail Expired for Retail- Core Plan displaying in Subscriptions
#Given I Search the Trail Expired Account with Plan as Retail- Core Plan
#Then Check the Plan as Retail- Core Plan
#Then Verify Retail- Core Plan and Details in Subscriptions Displayed or Not

#Retial Enterprise Plan

#Scenario: Verify Trail Expired for Retail- Enterprise Plan displaying in Subscriptions
#Given I Search the Trail Expired Account with Plan as Retail- Enterprise Plan
#Then Check the Plan as Retail- Enterprise Plan
#Then Verify Retail- Enterprise Plan and Details in Subscriptions Displayed or Not

#Cancelled
Scenario: Verify Cancelled Core Plan displaying in Subscriptions
Given I Search the Cancelled Account with Plan as Core Plan
Then Check the Plan as Core Plan
Then Verify Cancelled Core Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Cancelled Pro Plan displaying in Subscriptions
Given I Search the Cancelled Account with Plan as Pro Plan
Then Check the Plan as Pro Plan
Then Verify Cancelled Pro Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Cancelled Enterprise Plan displaying in Subscriptions
Given I Search the Cancelled Account with Plan as Enterprise Plan
Then Check the Plan as Enterprise Plan
Then Verify Cancelled Enterprise Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Cancelled Linga One Plan displaying in Subscriptions
Given I Search the Cancelled Account with Plan as Linga One Plan
Then Check the Plan as Linga One Plan
Then Verify Cancelled Linga One Plan and Details in Subscriptions Displayed or Not

#Scenario: Verify Cancelled for Retail- Pro Plan displaying in Subscriptions
#Given I Search the Cancelled Account with Plan as Retail- Pro Plan
#Then Check the Plan as Retail- Pro Plan
#Then Verify Retail- Pro Plan and Details in Subscriptions Displayed or Not
#
#Scenario: Verify Cancelled for Retail- Core Plan displaying in Subscriptions
#Given I Search the Cancelled Account with Plan as Retail- Core Plan
#Then Check the Plan as Retail- Core Plan
#Then Verify Retail- Core Plan and Details in Subscriptions Displayed or Not
#
#Scenario: Verify Cancelled for Retail- Enterprise Plan displaying in Subscriptions
#Given I Search the Cancelled Account with Plan as Retail- Enterprise Plan
#Then Check the Plan as Retail- Enterprise Plan
#Then Verify Retail- Enterprise Plan and Details in Subscriptions Displayed or Not

 #Live
Scenario: Verify Live Core Plan displaying in Subscriptions
Given I Search the Live Account with Plan as Core Plan
Then Check the Plan as Core Plan
Then Verify Live Core Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Live Pro Plan displaying in Subscriptions
Given I Search the Live Account with Plan as Pro Plan
Then Check the Plan as Pro Plan
Then Verify Live Pro Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Live Enterprise Plan displaying in Subscriptions
Given I Search the Live Account with Plan as Enterprise Plan
Then Check the Plan as Enterprise Plan
Then Verify Live Enterprise Plan and Details in Subscriptions Displayed or Not

#Scenario: Verify Live Linga One Plan displaying in Subscriptions
#Given I Search the Live Account with Plan as Linga One Plan
#Then Check the Plan as Linga One Plan
#Then Verify Linga One Plan and Details in Subscriptions Displayed or Not
#
  #Scenario: Verify Live for Retail- Pro Plan displaying in Subscriptions
    #Given I Search the Live Account with Plan as Retail- Pro Plan
    #Then Check the Plan as Retail- Pro Plan
    #Then Verify Retail- Pro Plan and Details in Subscriptions Displayed or Not
#
  #Scenario: Verify Live for Retail- Core Plan displaying in Subscriptions
    #Given I Search the Live Account with Plan as Retail- Core Plan
    #Then Check the Plan as Retail- Core Plan
    #Then Verify Retail- Core Plan and Details in Subscriptions Displayed or Not
#
  #Scenario: Verify Live for Retail- Enterprise Plan displaying in Subscriptions
    #Given I Search the Live Account with Plan as Retail- Enterprise Plan
    #Then Check the Plan as Retail- Enterprise Plan
    #Then Verify Retail- Enterprise Plan and Details in Subscriptions Displayed or Not

    #Cancelled_from_dunning
  #Scenario: Verify Cancelled_from_dunning Core Plan displaying in Subscriptions
    #Given I Search the Cancelled_from_dunning Account with Plan as Core Plan
    #Then Check the Plan as Core Plan
    #Then Verify Core Plan and Details in Subscriptions Displayed or Not
#
  #Scenario: Verify Cancelled_from_dunning Pro Plan displaying in Subscriptions
    #Given I Search the Cancelled_from_dunning Account with Plan as Pro Plan
    #Then Check the Plan as Pro Plan
    #Then Verify Pro Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Cancelled_from_dunning Enterprise Plan displaying in Subscriptions
Given I Search the Cancelled_from_dunning Account with Plan as Enterprise Plan
Then Check the Plan as Enterprise Plan
Then Verify Cancelled_from_dunning Enterprise Plan and Details in Subscriptions Displayed or Not

  #Scenario: Verify Cancelled_from_dunning Linga One Plan displaying in Subscriptions
    #Given I Search the Cancelled_from_dunning Account with Plan as Linga One Plan
    #Then Check the Plan as Linga One Plan
    #Then Verify Linga One Plan and Details in Subscriptions Displayed or Not
#
  #Scenario: Verify Cancelled_from_dunning for Retail- Pro Plan displaying in Subscriptions
    #Given I Search the Cancelled_from_dunning Account with Plan as Retail- Pro Plan
    #Then Check the Plan as Retail- Pro Plan
    #Then Verify Retail- Pro Plan and Details in Subscriptions Displayed or Not
#
  #Scenario: Verify Cancelled_from_dunning for Retail- Core Plan displaying in Subscriptions
    #Given I Search the Cancelled_from_dunning Account with Plan as Retail- Core Plan
    #Then Check the Plan as Retail- Core Plan
    #Then Verify Retail- Core Plan and Details in Subscriptions Displayed or Not
#
  #Scenario: Verify Cancelled_from_dunning for Retail- Enterprise Plan displaying in Subscriptions
    #Given I Search the Cancelled_from_dunning Account with Plan as Retail- Enterprise Plan
    #Then Check the Plan as Retail- Enterprise Plan
    #Then Verify Retail- Enterprise Plan and Details in Subscriptions Displayed or Not






