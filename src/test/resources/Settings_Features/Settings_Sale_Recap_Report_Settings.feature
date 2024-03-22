@Settings
@Sale_Recap_Report_Settings

Feature: Settings - Sale Recap Report Settings
	I Verifying the Settings - Sale Recap Report Settings
	
Background: Open the Settings - Sale Recap Report Settings Home Page
Given Open the Settings - Sale Recap Report Settings home page BaseURL and storeID

Scenario: Verify whether the Settings - Sale Recap Report Settings Header is Displayed
Given Verifying the Settings - Sale Recap Report Settings Header Page

Scenario: Verify whether the Update button is Disabled while Opening Page
Then Check the Update buttonTwo is Disabled

Scenario: Verify whether the All Fields are available in Sale Recap Report Settings
And Check Guest/Checks Toggle is Displayed
And Check Cover Toggle is Displayed
And Check Grand Sales Toggle is Displayed
And Check Gross Receipt Toggle is Displayed
And Check Gross Void Toggle is Displayed
And Check Net Void Toggle is Displayed
And Check CC Split Up Toggle is Displayed
And Check Other Payments Split Up Toggle is Displayed
And Check Payment Name as System Defined
And Check Payment Name as User Defined
And Check Tax Split Up Toggle is Displayed
And Check Tax Exempt Toggle is Displayed
And Check Tax with Net Sales Toggle is Displayed
And Check Opening Balance Toggle is Displayed
And Check Paid In/Out Toggle is Displayed
And Check Cash Drop Toggle is Displayed
And Check Cash Expected in Summary Toggle is Displayed
And Check Over/Shortage in Summary Toggle is Displayed
And Check Cash Expected in Formula Definition Toggle is Displayed
And Check Overage/Shortage in Formula Definition Toggle is Displayed
And Check Department Summary Toggle is Displayed
And Check Category Summary Toggle is Displayed
And Check Hourly Summary Toggle is Displayed
And Check Include Credits in Daily Summary Report Toggle is Displayed
 
Scenario: Updating Sale Recap Report Settings by Disabling All Toggles from General 
And I Disable Guest/Checks Toggle
And I Enable Cover Toggle
Then Check Level Type as Category is Displayed
Then Check Level Type as SubCategory is Displayed
Then Check Level Type as Menu Item is Displayed
And I Disable Cover Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not


Scenario: Verify whether the Disabled Toggle are Not Displayed in Sale Recap Report
And I Navigate to Reports - Sale Recap Report Page
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Today
And I Select the Employee as All
And I Click the Apply button
Then Check Guest Column is Not Displayed in Sale Recap Report
Then Check Checks Column is Not Displayed in Sale Recap Report
Then Check Cover Column is Not Displayed in Sale Recap Report
And Open the Settings - Sale Recap Report Settings home page BaseURL and storeID

Scenario: Updating Sale Recap Report Settings by Disabling All Toggles from Sales
And I Refresh the Page
Then Check Guest/Checks Toggle is Disabled
Then Check Cover Toggle is Disabled
And I Enable Grand Sales Toggle
And I Disable Grand Sales Toggle
And I Disable Gross Receipt Toggle
And I Disable Gross Void Toggle
And I Disable Net Void Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Verify whether the Disabled Toggle are Not Displayed in Sale Recap Report
And I Navigate to Reports - Sale Recap Report Page
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Today
And I Select the Employee as All
And I Click the Apply button
Then Check Grand Sales Column is Not Displayed in Sale Recap Report
Then Check Gross Receipt Column is Not Displayed in Sale Recap Report
Then Check Gross Void Column is Not Displayed in Sale Recap Report
Then Check Net Void Column is Not Displayed in Sale Recap Report
And Open the Settings - Sale Recap Report Settings home page BaseURL and storeID

Scenario: Updating Sale Recap Report Settings by Disabling All Toggles from Payments
And I Refresh the Page
Then Check Grand Sales Toggle is Disabled
Then Check Gross Receipt Toggle is Disabled
Then Check Gross Void Toggle is Disabled
Then Check Net Void Toggle is Disabled
And I Enable CC Split Up Toggle
And I Disable CC Split Up Toggle
And I Disable Other Payments Split Up Toggle
And I Select Payment Name as System Defined
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Updating Sale Recap Report Settings by Disabling All Toggles from Taxes
And I Refresh the Page
Then Check CC Split Up Toggle is Disabled
Then Check Other Payments Split Up Toggle is Disabled
Then Check Payment Name Selected as System Defined
And I Enable Tax Split Up Toggle
And I Disable Tax Split Up Toggle
And I Disable Tax Exempt Toggle
#And I Disable Tax with Net Sales Toggle
Then Check Tax with Net Sales Toggle is Not Displayed
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Updating Sale Recap Report Settings by Disabling All Toggles from Summary
And I Refresh the Page
Then Check Tax Split Up Toggle is Disabled
Then Check Tax Exempt Toggle is Disabled
Then Check Tax with Net Sales Toggle is Disabled
And I Enable Opening Balance Toggle
And I Disable Opening Balance Toggle
And I Disable Paid In/Out Toggle
And I Disable Cash Drop Toggle
And I Disable Cash Expected in Summary Toggle
And I Disable Over/Shortage in Summary Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Updating Sale Recap Report Settings by Disabling All Toggles from Formula Definition
And I Refresh the Page
Then Check Opening Balance Toggle is Disabled
Then Check Paid In/Out Toggle is Disabled
Then Check Cash Drop Toggle is Disabled
Then Check Cash Expected in Summary Toggle is Disabled
Then Check Over/Shortage Toggle in Summary is Disabled
And I Enable Cash Expected in Formula Definition Toggle
And I Disable Cash Expected in Formula Definition Toggle
And I Disable Over/Shortage in Formula Definition Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Updating Sale Recap Report Settings by Disabling All Toggles from Other Summaries
And I Refresh the Page
Then Check Cash Expected in Formula Definition Toggle is Disabled
Then Check Over/Shortage Toggle in Formula Definition is Disabled
And I Enable Department Summary Toggle
And I Disable Department Summary Toggle
And I Disable Category Summary Toggle
And I Disable Hourly Summary Toggle
And I Disable Include Credits in Daily Summary Report Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

@EditSaleRecapSettings
Scenario: Updating Sale Recap Report Settings by Enabling All Toggles and Select Level Type as Category from General
Then Check Department Summary Toggle is Disabled
Then Check Category Summary Toggle is Disabled
Then Check Hourly Summary Toggle is Disabled
Then Check Include Credits in Daily Summary Report is Disabled
And I Enable Guest/Checks Toggle
And I Enable Cover Toggle
Then Check the Update buttonTwo is Disabled
And I Select the Level Type in General as Category
Then Check the Update buttonTwo is Disabled
And I Selecting the Categories
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not


Scenario: Verify whether the Enabled Toggle are Displayed in Sale Recap Report
And I Navigate to Reports - Sale Recap Report Page 
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Today
And I Select the Employee as All
And I Click the Apply button
Then Check Guest Column is Displayed in Sale Recap Report
Then Check Checks Column is Displayed in Sale Recap Report
Then Check Cover Column is Displayed in Sale Recap Report
And Open the Settings - Sale Recap Report Settings home page BaseURL and storeID


Scenario: Updating Sale Recap Report Settings by Enabling All Toggles from Sales
And I Refresh the Page
Then Check Guest/Checks Toggle is Enabled
Then Check Cover Toggle is Enabled
And I Enable Grand Sales Toggle
And I Enable Gross Receipt Toggle
And I Enable Gross Void Toggle
And I Enable Net Void Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Verify whether the Enabled Toggle are Not Displayed in Sale Recap Report
And I Navigate to Reports - Sale Recap Report Page 
And I Select Sale Recap Type as Time Period
And I Select the Time Period as Today
And I Select the Employee as All
And I Click the Apply button
Then Check Grand Sales Column is Displayed in Sale Recap Report
Then Check Gross Receipt Column is Displayed in Sale Recap Report
Then Check Gross Void Column is Displayed in Sale Recap Report
Then Check Net Void Column is Displayed in Sale Recap Report
And Open the Settings - Sale Recap Report Settings home page BaseURL and storeID

Scenario: Updating Sale Recap Report Settings by Enabling All Toggles from Payments
And I Refresh the Page
Then Check Grand Sales Toggle is Enabled
Then Check Gross Receipt Toggle is Enabled
Then Check Gross Void Toggle is Enabled
Then Check Net Void Toggle is Enabled
And I Enable CC Split Up Toggle
And I Enable Other Payments Split Up Toggle
And I Select Payment Name as User Defined
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Updating Sale Recap Report Settings by Enabling All Toggles from Taxes
And I Refresh the Page
Then Check CC Split Up Toggle is Enabled
Then Check Other Payments Split Up Toggle is Enabled
Then Check Payment Name Selected as User Defined
And I Enable Tax Split Up Toggle
Then Check Tax with Net Sales Toggle is Displayed
And I Enable Tax Exempt Toggle
And I Enable Tax with Net Sales Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Updating Sale Recap Report Settings by Enabling All Toggles from Summary
And I Refresh the Page
Then Check Tax Split Up Toggle is Enabled
Then Check Tax Exempt Toggle is Enabled
Then Check Tax with Net Sales Toggle is Enabled
And I Enable Opening Balance Toggle
And I Enable Paid In/Out Toggle
And I Enable Cash Drop Toggle
And I Enable Cash Expected in Summary Toggle
And I Enable Over/Shortage in Summary Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Updating Sale Recap Report Settings by Enabling All Toggles from Formula Definition
And I Refresh the Page
Then Check Opening Balance Toggle is Enabled
Then Check Paid In/Out Toggle is Enabled
Then Check Cash Drop Toggle is Enabled
Then Check Cash Expected in Summary Toggle is Enabled
Then Check Over/Shortage Toggle in Summary is Enabled
And I Enable Cash Expected in Formula Definition Toggle
Then Check the Update buttonTwo is Disabled
And I Select Add for Cash Expected in Formula Definition
Then Check the Update buttonTwo is Disabled
And I Select Subtract for Cash Expected in Formula Definition
And I Enable Over/Shortage in Formula Definition Toggle
And I Select Add for Over/Shortage in Formula Definition
And I Select Subtract for Over/Shortage in Formula Definition
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

Scenario: Updating Sale Recap Report Settings by Enabling All Toggles from Other Summaries
And I Refresh the Page
Then Check Cash Expected in Formula Definition Toggle is Enabled
Then Check Over/Shortage Toggle in Formula Definition is Enabled
And I Enable Department Summary Toggle
And I Enable Category Summary Toggle
And I Enable Hourly Summary Toggle
And I Enable Include Credits in Daily Summary Report Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

@EditSaleRecapSettings
Scenario: Updating Sale Recap Report Settings by Selecting Level Type as SubCategory from General
And I Refresh the Page
Then Check Department Summary Toggle is Enabled
Then Check Category Summary Toggle is Enabled
Then Check Hourly Summary Toggle is Enabled
Then Check Include Credits in Daily Summary Report is Enabled
Then Check Level Type is Selected as Category
Then Check the Update buttonTwo is Disabled
And I Select the Level Type in General as Sub-Category
Then Check the Update buttonTwo is Disabled
And I Selecting the Sub-Categories
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

@EditSaleRecapSettings
Scenario: Updating Sale Recap Report Settings by Selecting Level Type as Menu Item from General
And I Refresh the Page
Then Check Level Type is Selected as SubCategory
Then Check the Update buttonTwo is Disabled
And I Select the Level Type in General as Menu Items
Then Check the Update buttonTwo is Disabled
And I Selecting the Menu Items
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not

@EditSaleRecapSettings
Scenario: Updating Sale Recap Report Settings by Selecting Level Type as Category and Disable Cover from General
And I Refresh the Page
Then Check Level Type is Selected as Menu Items
Then Check the Update buttonTwo is Disabled
And I Select the Level Type in General as Category
Then Check the Update buttonTwo is Disabled
And I Selecting the Categories
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not
And I Disable Cover Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Sale Recap Report Settings Updated or Not
And I Refresh the Page
Then Check Cover Toggle is Disabled