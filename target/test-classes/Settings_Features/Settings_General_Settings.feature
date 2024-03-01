@Settings
@General_Settings

Feature: Settings - General Settings
	I Verifying the Settings - General Settings
	
Background: Open the Settings - General Settings Home Page
Given Open the Settings - General Settings home page BaseURL and storeID

Scenario: Verify whether the Settings - General Settings Header is Displayed
Given Verifying the Settings - General Settings Header Page

Scenario: Verify whether the Update button is Disabled while Opening Page
Then Check the Update buttonTwo is Disabled

Scenario: Verify whether the All Fields are available in General Settings
And Check Prompt Tip Screen Before Credit Card Screen in POS Toggle is Displayed
And Check Enable Intranet Sync Toggle is Displayed
And Check Preferred Network Name Field is Displayed
And Check Disable Gift Card Tip Toggle is Displayed
And Check Enable Gratuity Line in Credit Card Screen Toggle is Displayed
And Check Disable Customer Nationality Toggle is Displayed
And Check Require Tax ID on Exempt Transaction Toggle is Displayed
And Check Do Not Reset Check Numbers Daily Toggle is Displayed
And Check Auto Log Off Field is Displayed
And Check Table Expiration Time Field is Displayed
And Check Custom Split button Action Option as Split By Check is Displayed
And Check Custom Split button Action Option as Split By Seat is Displayed
And Check Auto Generate House Account Number Toggle is Displayed
And Check Auto Print Close Day Report Toggle is Displayed
And Check Log In/Clock In Via Option as PIN is Displayed
And Check Log In/Clock In Via Option as Face ID is Displayed
And Check Check Owner Option as Check Closer
And Check Check Owner Option as Check Creator
And Check Tip Settings Option as Amount is Displayed
And Check Tip Settings Option as Percentage is Displayed
And Check Tip Validation Toggle is Displayed
And Check Floating Tab Name Field is Displayed
And Check POS Custom button Field is Displayed
And Check Hide Seat Number in Kitchen Print Field is Displayed
And Check Membership Auto Renewal Toggle is Displayed
And Check Store Level Customer Toggle is Displayed
And Check Time Format Options is Displayed
And Check Date Format Options is Displayed
And Check Tip Suggestion on Credit Card Receipt Toggle is Displayed
And Check Enable Doordash Drive Toggle is Displayed
And Check Enable Age Restriction Toggle is Displayed

Scenario: Updating General Settings by Disabling Prompt Tip Screen Before Credit Card Screen in POS, Enable Intranet sync Toggle
And I Enable Prompt Tip Screen Before Credit Card Screen in POS Toggle
And I Disable Prompt Tip Screen Before Credit Card Screen in POS Toggle
And I Enable Enable Intranet Sync Toggle
Then Check Do you have intranet sync device Confirmation Pop up is Displayed
And I Click the Yes button in Pop Up
And I Disable Enable Intranet Sync Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not


Scenario: Updating General Settings by Disabling Gift Card Tip, Enable Gratuity Line in Credit Card Screen, Customer Nationality, Customer Nationality, Reset Check Numbers Daily Toggles
#And I Refresh the Page
Then Check Prompt Tip Screen Before Credit Card Screen in POS Toggle is Disabled
Then Check Enable Intranet Sync Toggle is Disabled
And I Enable Disable Gift Card Tip Toggle
And I Disable Disable Gift Card Tip Toggle
And I Disable Enable Gratuity Line in Credit Card Screen Toggle
And I Disable Disable Customer Nationality Toggle
And I Disable Require Tax ID on Exempt Transaction Toggle
And I Disable Do Not Reset Check Number Daily Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not
#Then Check Disable Gift Card Tip Toggle is Disabled
#Then Check Enable Gratuity Line in Credit Card Screen Toggle is Disabled
#Then Check Disable Customer Nationality Toggle is Disabled
#Then Check Require Tax ID on Exempt Transaction Toggle is Disabled

Scenario: Updating General Settings with Auto Log Off less than Minimum Duration
And I Enter the Auto Log Off Time Less than Minimum Limits
Then Check Enter Valid Value Error is Displayed
Then Check the Update buttonTwo is Disabled

Scenario: Updating General Settings with Auto Log Off Above than Maximum Duration
And I Enter the Auto Log Off Time Above than Maximum Limits
Then Check Enter Valid Value Error is Displayed
Then Check the Update buttonTwo is Disabled
And I Enter the Auto Log Off Time
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not
Then Check Auto Log Off Time is Correctly Displayed

Scenario: Updating General Settings without Table Expiration Time
And I Clear the Table Expiration Time
Then Check Invalid Expiration Time Error is Displayed
And I Enter the Table Expiration Time
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not
Then Check Table Expiration Time is Correctly Displayed
 

Scenario: Updating General Settings with Custom Split button Action as Split By Check & Log In/Clock In Via as PIN and by Disabling Auto Generate House Account Number, Auto Print Close Day Report Toggles
#And I Refresh the Page
Then Check Disable Gift Card Tip Toggle is Disabled
Then Check Enable Gratuity Line in Credit Card Screen Toggle is Disabled
Then Check Disable Customer Nationality Toggle is Disabled
Then Check Require Tax ID on Exempt Transaction Toggle is Disabled
Then Check Do Not Reset Check Numbers Daily is Disabled
And I Select Custom Split button Action as Split By Check
And I Enable Auto Generate House Account Number Toggle
And I Disable Auto Generate House Account Number Toggle
And I Disable Auto Print Close Day Report Toggle
And I Select Log In/Clock In Via as PIN
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo
Then Verify Application Settings Updated or Not

Scenario: Updating General Settings with Check Owner as Check Closer, Tip Settings with Amount and By Disabling Tip Validation Toggle
#And I Refresh the Page
Then Check Custom Split button Action Selected as Split By Check 
Then Check Auto Generate House Account Number Toggle is Disabled
Then Check Auto Print Close Day Report Toggle is Disabled
Then Check Log In/Clock In Via Selected as PIN
And I Select Check Owner as Check Closer
And I Select Tip Settings as Amount
And I Enter the Tip Suggestions for Amount Above Limit
Then Check Amount cannot exist more than Ten digits Error is Displayed
And I Enter the Tip Suggestions for Amount
And I Enable Tip Validation Toggle
And I Enter Tip Threshold Amount as Zero
Then Check Value should be greater than Zero Error is Displayed
And I Enter Tip Threshold Amount
And I Enter Tip Threshold Percentage as Zero
Then Check Value should be greater than Zero Error is Displayed
And I Enter Tip Threshold Percentage
And I Clear the Tip validation Alert Message
Then Check Please Enter the Alert Message Error is Displayed
And I Enter Tip Validation Alert Message
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not

Scenario: Updating General Settings with POS Custom buttons and by Disabling Membership Auto Renewal, Store Level Customer Toggles
#And I Refresh the Page
Then Check Check Owner Selected as Check Closer
Then Check Tip Settings Selected as Amount
#Then Check Tip Suggestions for Amount is Correctly Displayed
Then Check Tip Validation Toggle is Enabled
Then Check Tip Threshold Amount is Correctly Displayed
Then Check Tip Threshold Percentage is Correctly Displayed
Then Check Tip Validation Alert Message is Correctly Displayed
And I Enter Floating Tab Name
And I Select Duplicate Options for POS Custom buttons
Then Check POS Custom button Must be Unique Error is Displayed
And I Select Options for POS Custom buttons
And I Select Hide Seat Number in Kitchen Print
And I Disable Membership Auto Renewal Toggle
And I Disable Store Level Customer Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo
Then Verify Application Settings Updated or Not

Scenario: Updating General Settings by Time Format as 24 Hours & Date Format as MM-DD-YYYY
#And I Refresh the Page
Then Check POS Custom buttons Selected Option1
Then Check POS Custom buttons Selected Option2
Then Check POS Custom buttons Selected Option3
Then Check POS Custom buttons Selected Option4
Then Check POS Custom buttons Selected Option5
Then Check POS Custom buttons Selected Option6
Then Check Membership Auto Renewal Toggle is Disabled
Then Check Store Level Customer Toggle is Disabled
And I Select Time Format as Twenty Four Hours
And I Select Date Format as MM-DD-YYYY
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not

Scenario: Updating General Settings by Disabling Tip Suggestion on Credit Card Receipt,Enable Doordash Drive,Enable Age Restriction Toggles 
#And I Refresh the Page
Then Check Time Format Selected Twenty Four Hours
Then Check Date Format Selected MM-DD-YYYY
And I Enable Tip Suggestion on Credit Card Receipt Toggle
And I Disable Tip Suggestion on Credit Card Receipt Toggle
And I Disable Enable Doordash Drive Toggle
And I Disable Enable Age Restriction Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not


Scenario: Updating General Settings by Enablling Prompt Tip Screen Before Credit Card Screen in POS, Enable Intranet sync Toggle
Then Check Tip Suggestion on Credit Card Receipt Toggle is Disabled
Then Check Enable Doordash Drive is Disabled
Then Check Store Level Customer Toggle is Disabled
And I Enable Enable Intranet Sync Toggle
Then Check Do you have intranet sync device Confirmation Pop up is Displayed
And I Click the Yes button in Pop Up
Then Check Enter Preferred Network Error is Displayed
And I Enter Preferred Network Name
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not


Scenario: Updating General Settings by Enabling Gift Card Tip, Enable Gratuity Line in Credit Card Screen, Customer Nationality, Customer Nationality, Reset Check Numbers Daily Toggles
#And I Refresh the Page
Then Check Prompt Tip Screen Before Credit Card Screen in POS Toggle is Enabled
Then Check Enable Intranet Sync Toggle is Enabled
And I Enable Disable Gift Card Tip Toggle
And I Enable Enable Gratuity Line in Credit Card Screen Toggle
And I Enable Disable Customer Nationality Toggle
And I Enable Require Tax ID on Exempt Transaction Toggle
And I Enable Do Not Reset Check Numbers Daily Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not
#Then Check Disable Gift Card Tip Toggle is Disabled
#Then Check Enable Gratuity Line in Credit Card Screen Toggle is Disabled
#Then Check Disable Customer Nationality Toggle is Disabled
#Then Check Require Tax ID on Exempt Transaction Toggle is Disabled

#Scenario: Updating General Settings with Auto Log Off less than Minimum Duration
#And I Enter the Auto Log Off Time Less than Minimum Limits
#Then Check Enter Valid Value Error is Displayed
#Then Check the Update buttonTwo is Disabled
#
#Scenario: Updating General Settings with Auto Log Off Above than Maximum Duration
#And I Enter the Auto Log Off Time Above than Maximum Limits
#Then Check Enter Valid Value Error is Displayed
#Then Check the Update buttonTwo is Disabled
#And I Enter the Auto Log Off Time
#And I Click the Update buttonTwo 
#Then Verify Application Settings Updated or Not
#Then Check Auto Log Off Time is Correctly Displayed
#
#Scenario: Updating General Settings without Table Expiration Time
#And I Clear the Table Expiration Time
#Then Check Invalid Expiration Time Error is Displayed
#And I Enter the Table Expiration Time
#And I Click the Update buttonTwo 
#Then Verify Application Settings Updated or Not
#Then Check Table Expiration Time is Correctly Displayed
 

Scenario: Updating General Settings with Custom Split button Action as Split By Check & Log In/Clock In Via as PIN and by Enabling Auto Generate House Account Number, Auto Print Close Day Report Toggles
#And I Refresh the Page
Then Check Disable Gift Card Tip Toggle is Enabled
Then Check Enable Gratuity Line in Credit Card Screen Toggle is Enabled
Then Check Disable Customer Nationality Toggle is Enabled
Then Check Require Tax ID on Exempt Transaction Toggle is Enabled
Then Check Do Not Reset Check Numbers Daily is Enabled
And I Select Custom Split button Action as Split By Seat
And I Enable Auto Generate House Account Number Toggle
And I Enable Auto Print Close Day Report Toggle
And I Select Log In/Clock In Via as Face ID
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo
Then Verify Application Settings Updated or Not

Scenario: Updating General Settings with Check Owner as Check Closer, Tip Settings with Amount and By Disabling Tip Validation Toggle
#And I Refresh the Page
Then Check Custom Split button Action Selected as Split By Seat 
Then Check Auto Generate House Account Number Toggle is Enabled
Then Check Auto Print Close Day Report Toggle is Enabled
Then Check Log In/Clock In Via Selected as Face ID
And I Select Check Owner as Check Creator
And I Select Tip Settings as Percentage
And I Enter the Tip Suggestions for Percentage Above Limit
Then Check Maximum tip percentage is Hundred Error is Displayed
And I Enter the Tip Suggestions for Percentage
And I Disable Tip Validation Toggle
Then Check Tip Threshold Amount Field is Not Displayed
Then Check Tip Threshold Percentage Field is Not Displayed
#And I Clear the Tip validation Alert Message
#Then Check Please Enter the Alert Message Error is Displayed
#And I Enter Tip Validation Alert Message
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo 
Then Verify Application Settings Updated or Not

Scenario: Updating General Settings with POS Custom buttons and by Enabling Membership Auto Renewal, Store Level Customer Toggles
#And I Refresh the Page
Then Check Check Owner Selected as Check Creator
Then Check Tip Settings Selected as Percentage
#Then Check Tip Suggestions for Amount is Correctly Displayed
Then Check Tip Validation Toggle is Disabled
#Then Check Tip Threshold Amount is Correctly Displayed
#Then Check Tip Threshold Percentage is Correctly Displayed
#Then Check Tip Validation Alert Message is Correctly Displayed
And I Enter Floating Tab Name
And I Select Duplicate Options for POS Custom buttons
Then Check POS Custom button Must be Unique Error is Displayed
And I Select Options for POS Custom buttons
#And I Select Hide Seat Number in Kitchen Print
And I Enable Membership Auto Renewal Toggle
And I Enable Store Level Customer Toggle
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo
Then Verify Application Settings Updated or Not

Scenario: Updating General Settings by Time Format as 24 Hours & Date Format as MM-DD-YYYY
#And I Refresh the Page
Then Check POS Custom buttons Selected Option1
Then Check POS Custom buttons Selected Option2
Then Check POS Custom buttons Selected Option3
Then Check POS Custom buttons Selected Option4
Then Check POS Custom buttons Selected Option5
Then Check POS Custom buttons Selected Option6
Then Check Membership Auto Renewal Toggle is Enabled
Then Check Store Level Customer Toggle is Enabled
And I Select Time Format as Twele Hours
And I Select Date Format as DD-MM-YYYY
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo
Then Verify Application Settings Updated or Not

Scenario: Updating General Settings by Disabling Tip Suggestion on Credit Card Receipt,Enable Doordash Drive,Enable Age Restriction Toggles 
#And I Refresh the Page
Then Check Time Format Selected Twele Hours
Then Check Date Format Selected DD-MM-YYYY
And I Select Date Format as Default
And I Enable Tip Suggestion on Credit Card Receipt Toggle
And I Enable Enable Doordash Drive Toggle
And I Enable Enable Age Restriction Toggle
Then Check Minimum Age Limit Field is Displayed
And I Enter Minimum Age Limit as Zero
Then Check Please Enter Age Error is Displayed
And I Enter Minimum Age Limit
And I Clear the Age Alert Message
Then Check Please Enter the Alert Message Error is Displayed
And I Enter the Age Alert Message
Then Check the Update buttonTwo is Enabled
And I Click the Update buttonTwo
Then Verify Application Settings Updated or Not

Scenario: Check Enabled Toggles and Update Date Format
#And I Refresh the Page
Then Check Date Format Selected Default
Then Check Tip Suggestion on Credit Card Receipt Toggle is Enabled
Then Check Enable Doordash Drive Toggle is Enabled
Then Check Enable Age Restriction Toggle is Enabled

