@Settings
@LabelTemplate

Feature: Settings - Kitchen Printer Template
I am verify the Settings- Label Template Module and Performing Some Operations on that

Scenario: Opening the Label Template page
Given Open Label Template home page BaseURL and StoreID

Scenario: Verify whether the Label Template Header is Displayed
Given Verifying the Label Template Header Page

Scenario: Verify the Available Label Templates
And Check Epson Box Label Template Displayed or Not
And Check Zebra Box Label Template Displayed or Not
And Check Kitchen box Label Template Displayed or Not
And Check SKU Code Label Template Displayed or Not

Scenario: Navigate to Epson Box Label Template
Then Click on Epson Box Label Template

Scenario: Verify Available Field in Epson Box Label Template
Then Verify Select Template Dropdown is Displayed or Not
Then Verify Width Input Field is Displayed or Not
Then Verify Height Input Field is Displayed or Not
Then Verify Enable Auto Cut Checkbox is Displayed or Not
Then Verify Font Options Field is Displayed or Not

Scenario: Click on Font Options and Verify the Available Fields
Given Open Font Options Field
Then Verify Check and Date input Field is Displayed or Not
Then Verify Business Name input Field is Displayed or Not
Then Verify Menu Item Name input Field is Displayed or Not
Then Verify Modifiers input Field is Displayed or Not
Then Verify Customer Info Field in Font Options is Displayed or Not 
Then Verify Delivery Notes Field is Displayed or Not
And Close Font Options Field

Scenario: Select the Template From Dropdown
Given Click on Template Dropdown
Then Select Template one From dropdown
And Save Label Template
Then Verify Epson Box Label Template Saved or Not
Given Click on Template Dropdown
Then Select Template two From dropdown
And Save Label Template
Then Verify Epson Box Label Template Saved or Not
Given Click on Template Dropdown
Then Select Template three From dropdown
And Save Label Template
Then Verify Epson Box Label Template Saved or Not

Scenario: Enter Invalid Width and Verify Error Message
Given Enter width less than three
Then Verify Minimum width is 3 and Maximum width is 4 Error Message
Then Verify whether the Save button is Disabled
And Enter Width More than four
Then Verify Minimum width is 3 and Maximum width is 4 Error Message
Then Verify whether the Save button is Disabled

Scenario: Enter Invalid Height and Verify Error Message
Given Enter Height less than 2.5
Then Verify Minimum height is 2.5 and Maximum height is 3 Error Message
Then Verify whether the Save button is Disabled
And Enter Height More than three
Then Verify Minimum height is 2.5 and Maximum height is 3 Error Message
Then Verify whether the Save button is Disabled

Scenario: Enter Valid Width and Height
Given Enter Valid Width
And Enter Valid Height
And Check Enable AutoCut Checkbox
And Save Label Template
Then Verify Epson Box Label Template Saved or Not

Scenario: Select the Font Options From Dropdown
Given Open Font Options Field
Then Select Check and Date From Dropdown
And Select Business Name From Dropdown
And Select Menu Item Name From Dropdown
And Select Modifiers From Dropdown
And Select Customer Info From Dropdown
And Close Font Options Field
And Save Label Template
Then Verify Epson Box Label Template Saved or Not

Scenario: Navigate to Zebra Box Label Template
Given Click on Zebra Box Label Template

Scenario: Verify the Available Options in Zebra Box Label Template
Then Verify Select Template Dropdown is Displayed or Not
Then Verify Width Input Field is Displayed or Not
Then Verify Height Input Field is Displayed or Not
Then Verify Enable Auto Cut Checkbox is Displayed or Not
Then Verify Check Details Field is Displayed or Not
Then Verify Menu Item Info Field is Displayed or Not
Then Verify Customer Info Field is Displayed or Not
Then Verify Order Summary Filed is Displayed or Not

Scenario: Click on Check Details options and Verify Available Fields
Given Open Check Details Field
Then Verify Business Name Checkbox is Displayed or Not
Then Verify Check Number Checkbox is Displayed or Not 
Then Verify Date and Time Checkbox is Displayed or Not
Then Verify Menu Item Number Checkbox is Displayed or Not
Then Verify Server Name Checkbox is Displayed or Not
Then Verify Order Type Checkbox is Dispalyed or Not
Then Verify Pay Status Checkbox is Dispalyed or Not
#Then Verify Check Details Checkbox is Displayed or Not
#Then Verify Order Type & Pay Status Checkbox is Displayed or Not
Then Verify Business Name Dropdown Field is Displayed or Not
Then Verify Check Details Dropdown Field is Displayed or Not
#Then Verify Order Type and Pay Status Field is Displayed or Not
And Close Check Details Field

Scenario: Click on Menu Item Info and Verify  Available Fields
Given Open Menu Item Info Field
Then Verify Menu Item Name Checkbox is Displayed or Not
Then Verify Menu Item Serving Size Checkbox is Displayed or Not
Then Verify Modifiers Checkbox is Displayed or Not
Then Verify Item Notes Checkbox is Displayed or Not
#Then Verify Bottom Divider Checkbox is Displayed or Not
Then Verify Item Name and Serving Size dropdown is Displayed or Not
Then Verify Modifiers and Notes Dropdown is Displayed or Not
And Close Menu Item Info Field

Scenario: Click on Customer Info and Verify Available Fields
Given Open Customer Info Field
Then Verify Customer Name Checkbox is Displayed or Not
Then Verify Customer Address Checkbox is Displayed or Not
Then Verify Delivery Notes Checkbox is Displayed or Not
Then Verify Phone Number Checkbox is Displayed or Not
Then Verify Right Divider Checkbox is Displayed or Not
Then Verify Customer Name Dropdown is Displayed or Not
Then Verify Customer Details Dropdown is Displayed or Not
And Close Customer Info Field

Scenario: Click on Order Summary and Verify Available Fields
Given Open Order Summary Field
Then Verify SubTotal Checkbox is Displayed or Not
Then Verify Discounts Checkbox is Displayed or Not
Then Verify Delivery Fee Checkbox is Displayed or Not
Then Verify Tax Checkbox is Displayed or Not
Then Verify Tip Checkbox is Displayed or Not
Then Verify Total Checkbox is Displayed or Not
Then Verify Balance Due Checkbox is Displayed or Not
Then Verify Order Summary Dropdown is Displayed or Not
Then Verify Balance Due Dropdown is Displayed or Not
And Close Order Summary Field

Scenario: Select the Template From Dropdown
Given Click on Template Dropdown
Then Select Template one From dropdown
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
Given Click on Template Dropdown
Then Select Template two From dropdown
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not


Scenario: Enter Invalid Width and Verify Error Message
Given Enter width less than Zero
Then Verify Minimum width is one and Maximum width is four Error Message in Zebra
Then Verify whether the Save button is Disabled
And Enter Width More than four
Then Verify Minimum width is one and Maximum width is four Error Message in Zebra
Then Verify whether the Save button is Disabled

Scenario: Enter Invalid Height and Verify Error Message
Given Enter Height less than Zero
Then Verify Minimum height is one and Maximum height is Three Error Message in Zebra
Then Verify whether the Save button is Disabled
And Enter Height More than Six
Then Verify Minimum height is one and Maximum height is Three Error Message in Zebra
Then Verify whether the Save button is Disabled

Scenario: Enter Valid Width and Height
Given Enter Valid Width
And Enter Valid Height
And Check Enable AutoCut Checkbox
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not

Scenario: Uncheck the Available Fields in Check Details
Given Open Check Details Field
Then Uncheck Business Name Checkbox
Then Uncheck Check Number Checkbox
Then Uncheck Date and Time Checkbox
Then Uncheck Menu Item Number Checkbox
Then Uncheck Server Name Checkbox
Then Uncheck Order Type Checkbox
Then Uncheck Pay Status Checkbox
#Then Uncheck Check Details Checkbox
#Then Uncheck Order Type & Pay Status Checkbox
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
And Close Check Details Field

Scenario: Uncheck the Available Fields in Menu Item Info
Given Open Menu Item Info Field
Then Uncheck Menu Item Name Checkbox
Then Uncheck Menu Item Serving Size Checkbox
Then Uncheck Modifiers Checkbox
Then Uncheck Item Notes Checkbox
Then Uncheck Bottom Divider Checkbox
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
And Close Menu Item Info Field

Scenario: Uncheck the Available Fields in Customer Info
Given Open Customer Info Field
Then Uncheck Customer Name Checkbox
Then Uncheck Customer Address Checkbox
Then Uncheck Delivery Notes Checkbox
Then Uncheck Phone Number Checkbox
Then Uncheck Right Divider Checkbox
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
And Close Customer Info Field

Scenario: Uncheck the Available Fields in Order Summary
Given Open Order Summary Field
Then Uncheck SubTotal Checkbox
Then Uncheck Discounts Checkbox
Then Uncheck Delivery Fee Checkbox
Then Uncheck Tax Checkbox
Then Uncheck Tip Checkbox 
Then Uncheck Total Checkbox
Then Uncheck Balance Due Checkbox
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
And Close Order Summary Field

Scenario: Check the Available Fields in Check Details
Given Open Check Details Field
Then Check Business Name Checkbox
Then Check Check Number Checkbox
Then Check Date and Time Checkbox
Then Check Menu Item Number Checkbox
Then Check Server Name Checkbox
Then Check Order Type Checkbox
Then Check Pay Status Checkbox
#Then Check Check Details Checkbox
#Then Check Order Type & Pay Status Checkbox
Then Select Business Name From Dropdown 
Then Select Check Details from Dropdown 
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
And Close Check Details Field

Scenario: Check the Available Fields in Menu Item Info
Given Open Menu Item Info Field
Then Check Menu Item Name Checkbox
Then Check Menu Item Serving Size Checkbox
Then Check Modifiers Checkbox
Then Check Item Notes Checkbox
Then Check Bottom Divider Checkbox
Then Select Item Name and Serving Size from Dropdown
Then Select Modifiers and Notes from Dropdown
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
And Close Menu Item Info Field

Scenario: Check the Available Fields in Customer Info
Given Open Customer Info Field
Then Check Customer Name Checkbox
Then Check Customer Address Checkbox
Then Check Delivery Notes Checkbox
Then Check Phone Number Checkbox
Then Check Right Divider Checkbox
Then Select Customer Name from Dropdown
Then Select Customer Details from Dropdown
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
And Close Customer Info Field

Scenario: Check the Available Fields in Order Summary
Given Open Order Summary Field
Then Check SubTotal Checkbox
Then Check Discounts Checkbox
Then Check Delivery Fee Checkbox
Then Check Tax Checkbox
Then Check Tip Checkbox 
Then Check Total Checkbox
Then Check Balance Due Checkbox
Then Select Order Summary from Dropdown
Then Select Balance Due from Dropdown
And Save Label Template
Then Verify Zebra Box Label Template Saved or Not
And Close Order Summary Field


Scenario: Navigate to Kitchen Box Label Template
Given Click on Kitchen Box Lable Template

Scenario: Verify the Available Fields in Kitchen Box Label Template
Then Verify Width Input Field is Displayed or Not
Then Verify Height Input Field is Displayed or Not
Then Verify Enable Auto Cut Checkbox is Displayed or Not
Then Verify Check Details Field is Displayed or Not
Then Verify Menu Item Info Field is Displayed or Not

Scenario: Enter Invalid Width and Verify Error Message
Given Enter width less than Zero
Then Verify Minimum width is one and Maximum width is four Error Message
Then Verify whether the Save button is Disabled
And Enter Width More than four
Then Verify Minimum width is one and Maximum width is four Error Message
Then Verify whether the Save button is Disabled

Scenario: Enter Invalid Height and Verify Error Message
Given Enter Height less than Zero
Then Verify Minimum height is one and Maximum height is six Error Message
Then Verify whether the Save button is Disabled
And Enter Height More than Six
Then Verify Minimum height is one and Maximum height is six Error Message
Then Verify whether the Save button is Disabled

Scenario: Enter Valid Width and Height
Given Enter Valid Width
And Enter Valid Height
And Check Enable AutoCut Checkbox
And Save Label Template
Then Verify Kitchen Box Label Template Saved or Not

Scenario: Click on Check Details and Verify Available Fields
Given Open Check Details Field
Then Verify Date and Time Checkbox is Displayed or Not
Then Verify Order Number Checkbox is Displayed or Not
Then Verify Order Type Checkbox is Displayed or Not
Then Verify Sale Number Checkbox is Displayed or Not
Then Verify Customer Name Checkbox is Displayed or Not
Then Verify Bottom Divider Checkbox is Displayed or Not
Then Verify Check Details Dropdown is Displayed or Not
And Close Check Details Field

Scenario: Click on Menu Item Info and Verify Available Fields
Given Open Menu Item Info Field
Then Verify Menu Item Name Bottom Divider Checkbox is Displayed or Not
Then Verify Item Name dropdown is Displayed or Not
Then Verify Modifiers Dropdown is Displayed or Not
And Close Menu Item Info Field

Scenario: Uncheck the Available Fields in Check Details
Given Open Check Details Field
Then Uncheck Date and Time Checkbox
Then Uncheck Order Number Checkbox
Then Uncheck Order Type Checkbox
Then Uncheck Sale Number Checkbox
Then Uncheck Customer Name Checkbox
Then Uncheck Bottom Divider Checkbox
And Save Label Template
Then Verify Kitchen Box Label Template Saved or Not
And Close Check Details Field

Scenario: Uncheck the Available Fields in Menu Item Info
Given Open Menu Item Info Field
Then Uncheck Menu Item Name Bottom Divider Checkbox
And Save Label Template
Then Verify Kitchen Box Label Template Saved or Not
And Close Menu Item Info Field

Scenario: Check the Available Fields in Check Details
Given Open Check Details Field
Then Check Date and Time Checkbox
Then Check Order Number Checkbox
Then Check Order Type Checkbox
Then Check Sale Number Checkbox
Then Check Customer Name Checkbox
Then Check Bottom Divider Checkbox
Then Select Check Details from Dropdown
And Save Label Template
Then Verify Kitchen Box Label Template Saved or Not
And Close Check Details Field

Scenario: Uncheck the Available Fields in Menu Item Info
Given Open Menu Item Info Field
Then Uncheck Menu Item Name Bottom Divider Checkbox
Then Select Item Name from Dropdown
Then Select Modifiers From Dropdown
And Save Label Template
Then Verify Kitchen Box Label Template Saved or Not
And Close Menu Item Info Field

Scenario: Navigate to SKU Code Label Template
Given Click on SKU Code Label Template

Scenario: Verify the Available Fields in SKU Code Label Template
Then Verify Select Template Dropdown in SKU Code is Displayed or Not
Then Verify Select Label Size Dropdown is Displayed or Not
Then Verify Check Details Field is Displayed or Not

Scenario: Select the Template and Select Label Size from Dropdown
Given Click on SKU Code Template Dropdown
Then Select Template Type as Inventory Label
Then Select Label Size From Dropdown

Scenario: Click on Check Details and Verify Available Fields
Given Open Check Details Field
Then Verify Store Name Checkbox is Displayed or Not
Then Verify SKU Code Checkbox is Displayed or Not
Then UnCheck the Store Name Checkbox
Then Uncheck SKU Code Checkbox
And Save Label Template
Then Verify SKU Code Label Template Saved or Not
Then Check the Store Name Checkbox
Then Check SKU Code Checkbox
And Select Font Size from Dropdown
And Save Label Template
Then Verify SKU Code Label Template Saved or Not

Scenario: Select the Template and Select Label Size from Dropdown
Given Click on SKU Code Template Dropdown
Then Select Template Type as Shelf Label
Then Select Label Size From Dropdown

Scenario: Click on Check Details and Verify Available Fields
Given Open Check Details Field
Then Verify Store Name Checkbox is Displayed or Not
Then Verify SKU Code Checkbox is Displayed or Not
Then UnCheck the Store Name Checkbox
Then Uncheck SKU Code Checkbox
And Save Label Template
Then Verify SKU Code Label Template Saved or Not
Then Check the Store Name Checkbox
Then Check SKU Code Checkbox
And Select Font Size from Dropdown
And Save Label Template
Then Verify SKU Code Label Template Saved or Not

Scenario: Select the Template and Select Label Size from Dropdown
Given Click on SKU Code Template Dropdown
Then Select Template Type as Product Item
Then Select Label Size From Dropdown

Scenario: Click on Check Details and Verify Available Fields
Given Open Check Details Field
Then Verify SKU Code Checkbox is Displayed or Not
Then Uncheck SKU Code Checkbox
And Save Label Template
Then Verify SKU Code Label Template Saved or Not
Then Check SKU Code Checkbox
And Select Font Size from Dropdown
And Save Label Template
Then Verify SKU Code Label Template Saved or Not

Scenario: Select the Template and Select Label Size from Dropdown
Given Click on SKU Code Template Dropdown
Then Select Template Type as Price Label
Then Select Label Size From Dropdown

Scenario: Click on Check Details and Verify Available Fields
Given Open Check Details Field
Then Verify Item Name Checkbox is Displayed or Not
Then Verify Price Checkbox is Displayed or Not
Then Verify BarCode Checkbox is Displayed or Not
And Uncheck Item Name Checkbox 
And Uncheck Price Checkbox
And Uncheck BarCode Checkbox
And Save Label Template
Then Verify SKU Code Label Template Saved or Not
And Check Item Name Checkbox 
And Check Price Checkbox
And Check BarCode Checkbox
And Select Font Size from Dropdown
And Save Label Template
Then Verify SKU Code Label Template Saved or Not






