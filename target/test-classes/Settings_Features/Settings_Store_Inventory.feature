@Settings
@StoreInventory

Feature: Settings - StoreInventory
I am verify the Settings- Store Inventory Module and Performing Some Operations on that

Background: Opening the Store Inventory page
Given Open Store Inventory home page BaseURL and StoreID

Scenario: Verify whether the Store Inventory Header is Displayed
Given Verifying the Store Inventory Header Page

Scenario: Verify Available Fields in Store Inventory
Given Verify Business Date Field is Displayed or Not
Then Verify Selling Price Option is Displayed or Not
Then Verify Markup Percenatge Option is Displayed or Not
Then Verify Email Summary Toggle is Displayed or Not
Then Verify Vendors CC Toggle is Displayed or Not
Then Verify Enable Summary Alert Toggle is Displayed or Not
Then Verify Enable Stock Expired Alert Toggle is Displayed or Not
Then Verify Auto Remove Expired Stock Toggle is Displayed or Not

Scenario: Select the Business Date and Update Store Inventory
Given select the Business Date 
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Select the Impact Cost Price as Markup Percenatge and Update
Given Verify Impact Cost Price as Markup Percentage is Selected as Selling Price
And Select the Impact Cost Price as Markup Percentage
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Select the Impact Cost Price as Selling Price and Update
Given Select the Impact Cost Price as Selling price
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Enable Email Summary Alert Toggle
Given Enable Email Summary Alert Toggle
Then Verify Email ID Input Box is Displayed or Not
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Enter Invalid Email ID
Given Enter the Invalid Email ID
Then Verify Enter Valid Email ID Error Message
Then Verify whether the Update button is Disabled in Store Inventory

Scenario: Enter Valid Email ID and Update 
Given Enter the Valid Email ID
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Disable Email Summary Alert Toggle
Given Disable Email Summary Alert Toggle
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Enable VendorCC Toggle and Update without Entering Email ID
Given Enable Vendor CC Toggle
Then Verify Email ID Input Box is Displayed or Not
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Enter Invalid Email ID
Given Enter the Invalid Email ID
Then Verify Enter Valid Email ID Error Message
Then Verify whether the Update button is Disabled in Store Inventory

Scenario: Enter Valid Email ID and Update 
Given Enter the Valid Email ID
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Enable Enable Stock Expired Alert Toggle
Given Enable Enable Stock Expired Toggle
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Enable Auto Remove Expired Stock Toggle
Given Enable Auto Remove Expired Stock Toggle
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Disable Enable Summary Alert Toggle
Given Disable Enable Summary Alert
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Enable Enable Summary Alert Toggle
Given Enable Enable Summary Alert
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Disable VendorCC Toggle
Given Disable Vendor CC Toggle
Then Verify Email ID Input Box is Displayed or Not
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Disable Enable Stock Expired Alert Toggle
Given Disable Enable Stock Expired Toggle
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not

Scenario: Disable Auto Remove Expired Stock Toggle
Given Disable Auto Remove Expired Stock Toggle
And I Click the Update button in Store Inventory
Then Verify Store Inventory Updated or Not




