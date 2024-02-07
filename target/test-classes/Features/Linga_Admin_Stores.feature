@Linga_Admin
@Linga_Admin_Stores
Feature: Linga Admin - Stores 
I am verify the Linga Admin - Stores Page 

Scenario: Opening the Linga Admin - Accounts page
Given Open the Linga Admin - Accounts home page BaseURL and StoreID
And I Select the Stores Tab

#Scenario: Verfiy whether the Linga Admin - Stores Path is Displayed
#Given Verifying the Linga Admin - Stores Path page

 Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

Scenario: Verify the Linga - Accounts Required Fields Displayed or not
And Check the Back Office Access Date Field is Displayed
And Check the Last POS Access Date Field is Displayed
And Check the Expiry Date Field is Displayed
And Check the Subscription Status Field is Displayed
And Check the Plan Field is Displayed
And Check the Industry Type Field is Displayed
And Check the Business Type Field is Displayed

Scenario: Verify Accounts by Selecting Subscription Status as Live
And I Select the Subscription Status as Live
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Trail Expired
And I Select the Subscription Status as Trail Expired
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Dunning
And I Select the Subscription Status as Dunning
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Unpaid
And I Select the Subscription Status as Unpaid
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Non Renewing
And I Select the Subscription Status as Non Renewing
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Cancelled
And I Select the Subscription Status as Cancelled
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Creation Failed
And I Select the Subscription Status as Creation Failed
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Cancelled From Dunning
And I Select the Subscription Status as Cancelled From Dunning
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Expired
And I Select the Subscription Status as Expired
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Trail
And I Select the Subscription Status as Trail
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as Future
And I Select the Subscription Status as Future
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Subscription Status as No Subscription
And I Select the Subscription Status as No Subscription
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Plan as BASIC
And I Select the Plan as Basic
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Plan as PRO
And I Select the Plan as Pro
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Plan as CORE
And I Select the Plan as Core
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Plan as ENTERPRISE
And I Select the Plan as Enterprise
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Plan as LINGA ONE
And I Select the Plan as Linga One
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Retail
And I Select the Plan as Basic
And I Select the Industry Type as Retail
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant
And I Select the Industry Type as Restaurant
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

#Scenario: Verify Account page shows the Table based on the Industry Type 
#And I Click on Industry Type Dropdown
#And I Search and select the Retail plan 
#And I Click on Apply button
#And I Verify Total Accounts count
#Then I Verify Industry Type column shows only Retail
#And I Click on Industry Type Dropdown
#And I Search and select the Restaurant plan
#And I Click on Apply button
#And I Verify Total Accounts count
#Then I Verify Industry Type column shows only Restaurant 

Scenario: Verify Accounts by Selecting Industry Type as Retail & Business Type as Apparel and Footwear
And I Select the Industry Type as Retail
And I Select the Business Type as Apparel and Footwear
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Retail
#Then I Verify Business Type Column Shows Only Apparel and Footwear

Scenario: Verify Accounts by Selecting Industry Type as Retail & Business Type as Books Store
And I Select the Business Type as Books Store
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Retail
#Then I Verify Business Type Column Shows Only Books Store

Scenario: Verify Accounts by Selecting Industry Type as Retail & Business Type as Electronics
And I Select the Business Type as Electronics
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Retail
#Then I Verify Business Type Column Shows Only Electronics

Scenario: Verify Accounts by Selecting Industry Type as Retail & Business Type as Deli and Market
And I Select the Business Type as Deli and Market
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Retail
#Then I Verify Business Type Column Shows Only Deli and Market

Scenario: Verify Accounts by Selecting Industry Type as Retail & Business Type as Gift Shops
And I Select the Business Type as Gift Shops
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Retail
#Then I Verify Business Type Column Shows Only Gift Shops

Scenario: Verify Accounts by Selecting Industry Type as Retail & Business Type as Jewelry
And I Select the Business Type as Jewelry
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Retail
#Then I Verify Business Type Column Shows Only Jewelry

Scenario: Verify Accounts by Selecting Industry Type as Retail & Business Type as Services
And I Select the Business Type as Services
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Retail
#Then I Verify Business Type Column Shows Only Services

Scenario: Verify Accounts by Selecting Industry Type as Retail & Business Type as Other
And I Select the Business Type as Other
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Retail
#Then I Verify Business Type Column Shows Only Other

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Full Service
And I Select the Industry Type as Restaurant
And I Select the Business Type as Full Service
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not
#Then I Verify Industry Type Column Shows Only Restaurant
#Then I Verify Business Type Column Shows Only Full Service

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Quick Service
And I Select the Industry Type as Restaurant
And I Select the Business Type as Quick Service
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Bars and Clubs
And I Select the Industry Type as Restaurant
And I Select the Business Type as Bars and Clubs
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Franchise
And I Select the Industry Type as Restaurant
And I Select the Business Type as Franchise
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Pizzerias
And I Select the Industry Type as Restaurant
And I Select the Business Type as Pizzerias
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Table Service
And I Select the Industry Type as Restaurant
And I Select the Business Type as Table Service
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Bakery
And I Select the Industry Type as Restaurant
And I Select the Business Type as Bakery
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Coffee Shop
And I Select the Industry Type as Restaurant
And I Select the Business Type as Coffee Shop
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Yogurt Shops
And I Select the Industry Type as Restaurant
And I Select the Business Type as Yogurt Shops
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Food Trucks
And I Select the Industry Type as Restaurant
And I Select the Business Type as Food Trucks
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Fine Dining
And I Select the Industry Type as Restaurant
And I Select the Business Type as Fine Dining
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Restaurants
And I Select the Industry Type as Restaurant
And I Select the Business Type as Restaurants
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify Accounts by Selecting Industry Type as Restaurant & Business Type as Hotel & Resorts
And I Select the Industry Type as Restaurant
And I Select the Business Type as Hotel & Resorts
And I Click the Apply button
Then Verify the Total Stores and Details Reports Displayed or not

Scenario: Verify we able to Disable the Auto Update
Given I Seach the Account and Disable the Auto Update
And I Verify the Updated Successfully or not
#Then I Verify we able to Disable the Upgrade toggle

Scenario: Verify we able to Enable the Show Auto Update
Given I Seach the Account and Enable the Auto Update
And I Verify the Updated Successfully or not
#Then I Verify we able to Enable the Upgrade toggle



#Scenario: Verify we able to Export the Accounts 
#And I Click on Export button
#Then I Verify the Accounts details are Exported or not

Scenario: Verify Page is getting navigating or not if we click on the Store Name
Given I Search and Select the Store Name
  Then Verifying the Store Details Header Page






