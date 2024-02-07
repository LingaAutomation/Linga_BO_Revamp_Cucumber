@Linga_Admin
@Linga_Subscriptions
Feature: Linga Admin - Subscriptions
  I am verify the Linga_Admin -Subscriptions module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Linga_Admin - Subscriptions page
Given Open the Linga Admin - Subscriptions page page BaseURL and StoreID

Scenario: Verify whether the Subscriptions Header is Displayed
 Given Verifying the Subscriptions Header Page
 
 Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify Selected Subscriptions Under Dealer Drop Down Box
Given Verify Subscriptions Selected From Dealer Drop down Box or Not

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

Scenario: Verify whether Subscription Field is Displayed or not
Then Check Subscriptions not found Disclaimer is Displayed

Scenario: Verify whether Dealers Field is Displayed or not
Then Check Dealers Field is Displayed

Scenario: Verify whether Dealers are Displayed in Dealer dropdown
And I Click the Dealer
Then Verify whether the Search bar is Displayed

Scenario: Verify able to search the Dealer by entering 3 letters of Dealer Name
And I Verify Searching the Item when entering three letters By DealerName 

Scenario: Verify able to search the Account by entering 3 letters of Account Name
And I Verify Searching the Item when entering three letters

Scenario: Verify whether the Subscriptionss Reports are Generated
Then Verify the Subscriptions Reports are Generated or not

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
#
    #Ascending Order
  #Scenario: Verify Perform Ascending Sorting Options Under All Fields
    #And I Select Dealer in Dealer Field Box
    #And I Check in Customer Name header Displayed as Ascending Order
    #And I Check in Plan header Displayed as Ascending Order
    #And I Check in Status header Displayed as Ascending Order
    #And I Check in Created Date header Displayed as Ascending Order
    #And I Check in Activated Date header Displayed as Ascending Order
    #And I Check in Amount header Displayed as Ascending Order
    #And I Check in Last Billing Date header Displayed as Ascending Order
    #And I Check in Next Billing Date header Displayed as Ascending Order
    #Then Verify Ascending Sorting Perform in all header or not
#
    #Descending Order
  #Scenario: Verify Perform Descending Sorting Options Under All Fields
    #And I Select Dealer in Dealer Field Box
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
@Searching
Scenario: Verify Trail for Core Plan displaying in Subscription
Given I Select the Dealer with Core Plan with Trail
Then Check the Plan as Core Plan
Then Verify Trail Core Plan and Details in Subcription Displayed or Not

#Scenario: Verify Trail for Basic Plan displaying in Subscriptions
#Given I Select the Dealer with Basic Plan with Trail
#Then Check the Plan as Basic
#Then Verify Basic Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail for Pro Plan displaying in Subscriptions
#Given I Select the Dealer with Pro Plan with Trail
#Then Check the Plan as Pro
#Then Verify Pro Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail for Enterprise Plan displaying in Subscriptions
#Given I Select the Dealer with Enterprise Plan with Trail
#Then Check the Plan as Enterprise
#Then Verify Enterprise Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail for Linga One Plan displaying in Subscriptions
#Given I Select the Dealer with Linga One Plan with Trail
#Then Check the Plan as Linga One
#Then Verify Linga One Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail for Retail- Pro Plan displaying in Subscriptions
#Given I Select the Dealer with Retail- Pro Plan with Trail
#Then Check the Plan as Retail- Pro
#Then Verify Retail- Pro Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail for Retail- Core Plan displaying in Subscriptions
#Given I Select the Dealer with Retail- Core Plan with Trail
#Then Check the Plan as Retail - Core
#Then Verify Retail- Core Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail for Retail- Enterprise Plan displaying in Subscriptions
#Given I Select the Dealer with Retail- Enterprise Plan with Trail
#Then Check the Plan as Retail- Enterprise
#Then Verify Retail- Enterprise Plan and Details in Subcription Displayed or Not

#Trail Expired
Scenario: Verify Trail Expired for Basic Plan displaying in Subscriptions
Given I Select the Dealer with Basic Plan with Trail Expired
Then Check the Plan as Basic Plan
Then Verify Trail Expired Basic Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Trail Expired for Pro Plan displaying in Subscriptions
Given I Select the Dealer with Pro Plan with Trail Expired
Then Check the Plan as Pro Plan
Then Verify Trail Expired Pro Plan and Details in Subscriptions Displayed or Not

#Core Palan is Not available
#Scenario: Verify Trail Expired for Core Plan displaying in Subscriptions
#Given I Select the Dealer with Core Plan with Trail Expired
#Then Check the Plan as Core Plan
#Then Verify Trail Expired Core Plan and Details in Subcription Displayed or Not

Scenario: Verify Trail Expired for Enterprise Plan displaying in Subscriptions
Given I Select the Dealer with Enterprise Plan with Trail Expired
Then Check the Plan as Enterprise Plan
Then Verify Trail Expired Enterprise Plan and Details in Subscriptions Displayed or Not

#Scenario: Verify Trail Expired for Linga One Plan displaying in Subscriptions
#Given I Select the Dealer with Linga One Plan with Trail Expired
#Then Check the Plan as Linga One Plan
#Then Verify Linga One Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail Expired for Retail- Basic Plan displaying in Subscriptions
#Given I Select the Dealer with Retail- Basic Plan with Trail Expired
#Then Check the Plan as Retail- Basic Plan
#Then Verify Retail- Basic Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail Expired for Retail- Pro Plan displaying in Subscriptions
#Given I Select the Dealer with Retail- Pro Plan with Trail Expired
#Then Check the Plan as Retail- Pro Plan
 #Then Verify Retail- Pro Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail Expired for Retail- Core Plan displaying in Subscriptions
#Given I Select the Dealer with Retail- Core Plan with Trail Expired
#Then Check the Plan as Retail- Core Plan
#Then Verify Retail- Core Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Trail Expired for Retail- Enterprise Plan displaying in Subscriptions
#Given I Select the Dealer with Retail- Enterprise Plan with Trail Expired
#Then Check the Plan as Retail- Enterprise Plan
#Then Verify Retail- Enterprise Plan and Details in Subcription Displayed or Not

#Cancelled
Scenario: Verify Cancelled Core Plan displaying in Subscriptions
Given I Select the Dealer with Core Plan with Cancelled
Then Check the Plan as Core Plan
Then Verify Cancelled Core Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Cancelled Pro Plan displaying in Subscriptions
Given I Select the Dealer with Pro Plan with Cancelled
Then Check the Plan as Pro Plan
Then Verify Cancelled Pro Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Cancelled Enterprise Plan displaying in Subscriptions
Given I Select the Dealer with Enterprise Plan with Cancelled
Then Check the Plan as Enterprise Plan
Then Verify Cancelled Enterprise Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Cancelled Linga One Plan displaying in Subscriptions
Given I Select the Dealer with Linga One Plan with Cancelled
Then Check the Plan as Linga One Plan
Then Verify Cancelled Linga One Plan and Details in Subscriptions Displayed or Not

  #Scenario: Verify Cancelled for Retail- Pro Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Pro Plan with Cancelled
    #Then Check the Plan as Retail- Pro Plan
    #Then Verify Retail- Pro Plan and Details in Subcription Displayed or Not
#
  #Scenario: Verify Cancelled for Retail- Core Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Pro Plan with Cancelled
    #Then Check the Plan as Retail- Pro Plan
    #Then Verify Retail- Pro Plan and Details in Subcription Displayed or Not
#
  #Scenario: Verify Cancelled for Retail- Enterprise Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Enterprise Plan with Cancelled
    #Then Check the Plan as Retail- Enterprise Plan
    #Then Verify Retail- Enterprise Plan and Details in Subcription Displayed or Not

    #Live
Scenario: Verify Live Core Plan displaying in Subscriptions
Given I Select the Dealer with Core Plan with Live
Then Check the Plan as Core Plan
Then Verify Live Core Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Live Pro Plan displaying in Subscriptions
Given I Select the Dealer with Pro Plan with Live
Then Check the Plan as Pro Plan
Then Verify Live Pro Plan and Details in Subscriptions Displayed or Not

Scenario: Verify Live Enterprise Plan displaying in Subscriptions
Given I Select the Dealer with Enterprise Plan with Live
Then Check the Plan as Enterprise Plan
Then Verify Live Enterprise Plan and Details in Subscriptions Displayed or Not

  #Scenario: Verify Live Linga One Plan displaying in Subscriptions
    #Given I Select the Dealer with Linga One Plan with Live
    #Then Check the Plan as Linga One Plan
    #Then Verify Linga One Plan and Details in Subcription Displayed or Not
#
  #Scenario: Verify Live for Retail- Pro Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Pro Plan with Live
    #Then Check the Plan as Retail- Pro Plan
    #Then Verify Retail- Pro Plan and Details in Subcription Displayed or Not
#
  #Scenario: Verify Live for Retail- Core Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Core Plan with Live
    #Then Check the Plan as Retail- Core Plan
    #Then Verify Retail- Core Plan and Details in Subcription Displayed or Not
#
  #Scenario: Verify Live for Retail- Enterprise Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Enterprise Plan with Live
    #Then Check the Plan as Retail- Enterprise Plan
    #Then Verify Retail- Enterprise Plan and Details in Subcription Displayed or Not

#Cancelled_from_dunning
Scenario: Verify Cancelled_from_dunning Enterprise Plan displaying in Subscriptions
Given I Select the Dealer with Enterprise Plan with Cancelled_from_dunning
Then Check the Plan as Enterprise Plan
Then Verify Cancelled_from_dunning Enterprise Plan and Details in Subscriptions Displayed or Not

#Scenario: Verify Cancelled_from_dunning Core Plan displaying in Subscriptions
#Given I Select the Dealer with Core Plan with Cancelled_from_dunning
#Then Check the Plan as Core Plan
#Then Verify Core Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Cancelled_from_dunning Pro Plan displaying in Subscriptions
#Given I Select the Dealer with Pro Plan with Cancelled_from_dunning
#Then Check the Plan as Pro Plan
#Then Verify Pro Plan and Details in Subcription Displayed or Not
#
#Scenario: Verify Cancelled_from_dunning Linga One Plan displaying in Subscriptions
    #Given I Select the Dealer with Linga One Plan with Cancelled_from_dunning
    #Then Check the Plan as Linga One Plan
    #Then Verify Linga One Plan and Details in Subcription Displayed or Not
#
  #Scenario: Verify Cancelled_from_dunning for Retail- Pro Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Pro Plan with Cancelled_from_dunning
    #Then Check the Plan as Retail- Pro Plan
    #Then Verify Retail- Pro Plan and Details in Subcription Displayed or Not
#
  #Scenario: Verify Cancelled_from_dunning for Retail- Core Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Core Plan with Cancelled_from_dunning
    #Then Check the Plan as Retail- Core Plan
    #Then Verify Retail- Core Plan and Details in Subcription Displayed or Not
#
  #Scenario: Verify Cancelled_from_dunning for Retail- Enterprise Plan displaying in Subscriptions
    #Given I Select the Dealer with Retail- Enterprise Plan with Cancelled_from_dunning
    #Then Check the Plan as Retail- Enterprise Plan
    #Then Verify Retail- Enterprise Plan and Details in Subcription Displayed or Not

Scenario: Verify Dealer without Subscriptions
Given I Select Dealer in Dealer without Subscriptions
Then Verify Subscriptions not found Displayed or Not





