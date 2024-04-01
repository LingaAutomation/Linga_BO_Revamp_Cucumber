@Settings
@MatrixReport

Feature: Settings - Matrix Reports
I am verify the Settings-Matrix Report 

Background: Opening the Settings - Matrix Report page
Given Open the Settings - Matrix Report home page BaseURL and StoreID

Scenario: Verify whether the Matrix Report Header is Displayed
Given Verifying the Matrix Report Header Page

Scenario: Update the Matrix Report with Invalid Percentage
And I Enter the Invalid Popularity Threshold Percentage
Then Check Percentage should be between 0-100 Error is Displayed
Then Check the Update buttonTwo is Disabled

Scenario: Update the Matrix Report Settings
And I Enter Profit Threshold Amount
And I Enter Popularity Threshold Percentage
And I Click the Update buttonTwo
Then Verify whether Matrix Report Settings is Updated or Not

Scenario: Verify the Matrix Report Settings Profit Threshold Amount Values after Reopen
And I Refresh the Page
Then Check Profit Threshold Amount displayed as Expected

Scenario: Verify the Matrix Report Settings Popularity Threshold Percentage Values after Reopen
#And I Refresh the Page
Then Check Popularity Threshold Percentage displayed as Expected



# Intergration: 
# Create a Inventory Item in Inventory module 
# and Map the created Inventory Item in P&I-Menu Item 
# and Make a Sale in POS 
# and Validate the Profit in Matrix Report with Profit Threshold Amount & Popularity Percentage


