@Settings
@EmailReceiptTemplate

Feature: Settings - Email Receipt Template
I am verify the Settings- Email Receipt Template Module and Performing Some Operations on that

Scenario: Opening the Email Receipt Template page
Given Open Email Receipt Template home page BaseURL and StoreID

Scenario: Verify whether the Email Receipt Template Header is Displayed
Given Verifying the Email Receipt Template Header Page

Scenario: Verify the Available Fields in Email Receipt Template
Then Check Store Information Field is Displayed or Not
Then Check Check Details Field is Displayed or Not
Then Check Order Summary Field is Displayed or Not
Then Check Additional Details Field is Displayed or Not

Scenario: Click on Store Information and Verify the Available Fields
Given Open Store Information Field
Then Verify Store Name Checkbox is Displayed or Not
Then Verify Email Checkbox is Displayed or Not
Then Verify Address Checkbox is Displayed or Not
Then Verify Phone Number Checkbox is Displayed or Not
Then Verify Store Logo Checkbox is Displayed or Not
Then Verify Logo URL Link Input Field is Displayed or Not
And Close Store Information Field

Scenario: UnCheck Available Fields in Store Information 
Given Open Store Information Field
Then UnCheck Store Name Checkbox
Then UnCheck Email Checkbox
Then UnCheck Address Checkbox
Then UnCheck Phone Number Checkbox
Then UnCheck Store Logo Checkbox
Then Verify Logo URL Link Input Field is Displayed or Not
And Close Store Information Field
And Save Email Receipt Template
Then Verify Email Receipt Template Saved or Not

Scenario: Check Available Fields in Store Information 
Given Open Store Information Field
Then Check Store Name Checkbox
Then Check Email Checkbox
Then Check Address Checkbox
Then Check Phone Number Checkbox
Then Check Store Logo Checkbox
Then Enter Logo URL Link
And Close Store Information Field
And Save Email Receipt Template
Then Verify Email Receipt Template Saved or Not

Scenario: Click on CheckDetails and Verify Available Fields
Given Open Check Details Field
Then Verify Check Number Checkbox is Displayed or Not
Then Verify Table No Checkbox is Displayed or Not
Then Verify Server Name Checkbox is Displayed or Not
Then Verify Date & Time Checkbox is Displayed or Not
Then Verify Customer Name Checkbox is Displayed or Not
Then Verify Seat Number Checkbox is Displayed or Not
Then Verify Service Type Checkbox is Displayed or Not
And Close Check Details Field

Scenario: UnCheck Available Fields in Check Details 
Given Open Check Details Field
Then UnCheck Check Number Checkbox
Then UnCheck Table No Checkbox
Then UnCheck Server Name Checkbox
Then UnCheck Date & Time Checkbox
Then UnCheck Customer Name Checkbox
Then UnCheck Seat Number Checkbox
Then UnCheck Service Type Checkbox
And Close Check Details Field
And Save Email Receipt Template
Then Verify Email Receipt Template Saved or Not

Scenario: Check Available Fields in Check Details 
Given Open Check Details Field
Then Check Check Number Checkbox
Then Check Table No Checkbox
Then Check Server Name Checkbox
Then Check Date & Time Checkbox
Then Check Customer Name Checkbox
Then Check Seat Number Checkbox
Then Check Service Type Checkbox
And Close Check Details Field
And Save Email Receipt Template
Then Verify Email Receipt Template Saved or Not

Scenario: Click on OrderSummary and Verify Available Fields
Given Open Order Summary Field
Then Verify Oder Summary Checkbox is Displayed or Not
Then Verify Roll Out Modifier Price To Menu Checkbox is Displayed or Not
Then Verify Exclude Zero Price Modifier Checkbox is Displayed or Not
Then Verify Discount Under the Menu Item Checkbox is Displayed or Not
Then Verify Secondary Menu Name Checkbox is Displayed or Not
Then Verify Secondary Modifier Name Checkbox is Displayed or Not
Then Verify Exclude Zero Price Menu Item Checkbox is Displayed or Not
Then Verify Tax Summary Checkbox is Displayed or Not
Then Verify Check Total Checkbox is Displayed or Not
Then Verify Tip Checkbox is Displayed or Not
Then Verify Tender Details Checkbox is Displayed or Not
And Close Order Summary Field

Scenario: UnCheck Available Fields in Order Summary
Given Open Order Summary Field
Then UnCheck Oder Summary Checkbox
Then UnCheck Roll Out Modifier Price To Menu Checkbox
Then UnCheck Exclude Zero Price Modifier Checkbox
Then UnCheck Discount Under the Menu Item Checkbox
Then UnCheck Secondary Menu Name Checkbox
Then UnCheck Secondary Modifier Name Checkbox
Then UnCheck Exclude Zero Price Menu Item Checkbox
Then UnCheck Tax Summary Checkbox 
Then UnCheck Check Total Checkbox 
Then UnCheck Tip Checkbox
Then UnCheck Tender Details Checkbox 
And Close Order Summary Field
And Save Email Receipt Template
Then Verify Email Receipt Template Saved or Not

Scenario: Check Available Fields in Order Summary
Given Open Order Summary Field
Then Check Oder Summary Checkbox
Then Check Roll Out Modifier Price To Menu Checkbox
Then Check Exclude Zero Price Modifier Checkbox
Then Check Discount Under the Menu Item Checkbox
Then Check Secondary Menu Name Checkbox
Then Check Secondary Modifier Name Checkbox
Then Check Exclude Zero Price Menu Item Checkbox
Then Check Tax Summary Checkbox 
Then Check Check Total Checkbox 
Then Check Tip Checkbox
Then Check Tender Details Checkbox 
And Close Order Summary Field
And Save Email Receipt Template
Then Verify Email Receipt Template Saved or Not

Scenario: Click on Additional Details and Verify Available Fields
Given Open Additional Details Field
Then Verify Include Card Details Checkbox is Displayed or Not
Then Verify Signature Checkbox is Displayed or Not
Then Verify Barcode Checkbox is Displayed or Not
Then Verify Powered by LINGA Checkbox is Displayed or Not
Then Verify Social Icons Checkbox is Displayed or Not
Then Verify Facebook link Input Field is Displayed or Not
Then Verify Twitter link Input Field is Displayed or Not
Then Verify LinkedIn link Input Field is Displayed or Not
Then Verify Customer Feedback Checkbox is Displayed or Not
Then Verify Special Notes Checkbox is Displayed or Not
Then Verify Special Notes input Field is Displayed or Not
And Close Additional Details Field

Scenario: UnCheck the Available fields in Additional Details
Given Open Additional Details Field
Then UnCheck Include Card Details Checkbox
Then UnCheck Signature Checkbox
Then UnCheck Barcode Checkbox
Then UnCheck Powered by LINGA Checkbox
Then UnCheck Social Icons Checkbox
Then Verify Facebook link Input Field is Displayed or Not
Then Verify Twitter link Input Field is Displayed or Not
Then Verify LinkedIn link Input Field is Displayed or Not
Then UnCheck Customer Feedback Checkbox
Then UnCheck Special Notes Checkbox
Then Verify Special Notes input Field is Displayed or Not
And Close Additional Details Field
And Save Email Receipt Template
Then Verify Email Receipt Template Saved or Not

Scenario: Check the Available fields in Additional Details
Given Open Additional Details Field
Then Check Include Card Details Checkbox
Then Check Signature Checkbox
Then Check Barcode Checkbox
Then Check Powered by LINGA Checkbox
Then Check Social Icons Checkbox
Then Verify Facebook link Input Field is Displayed or Not
Then Verify Twitter link Input Field is Displayed or Not
Then Verify LinkedIn link Input Field is Displayed or Not
Then Check Customer Feedback Checkbox
Then Check Special Notes Checkbox
Then Verify Special Notes input Field is Displayed or Not
And Close Additional Details Field
And Save Email Receipt Template
Then Verify Email Receipt Template Saved or Not

Scenario: UnCheck the Social Media Checkboxes
Given Open Additional Details Field
Then UnCheck Facebook Link Checkbox
Then Verify Facebook link Input Field is Displayed or Not
Then UnCheck Twitter Link Checkbox
Then Verify Twitter link Input Field is Displayed or Not
Then UnCheck LinkedIn Link Checkbox
Then Verify LinkedIn link Input Field is Displayed or Not
And Close Additional Details Field

Scenario: Check the Social Media Checkboxes
Given Open Additional Details Field
Then Check Facebook Link Checkbox
Then Enter Facebook Link URL
Then Check Twitter Link Checkbox
Then Enter Twitter Link URL
Then Check LinkedIn Link Checkbox
Then Enter LinkIn Link URL
And Close Additional Details Field
#And Save Email Receipt Template
#Then Verify Email Receipt Template Saved or Not



