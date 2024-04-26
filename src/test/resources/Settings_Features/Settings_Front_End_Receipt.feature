@Settings
@Front_End_Receipt
@Settings01

Feature: Settings - Front End Receipt Settings
	I Verifying the Settings - Front End Receipt Settings
	
Background: Open the Settings - Front End Receipt Settings Home Page
Given Open the Settings - Front End Receipt Settings home page BaseURL and storeID

Scenario: Verify whether the Settings - Front End Receipt Settings Header is Displayed
Given Verifying the Settings - Front End Receipt Settings Header Page

Scenario: Verify whether the All Fields are available in Front End Receipt Settings
#Then Check Print Template Screen Field is Displayed
And I Open Print Template Screen
Then Check Font Size Field is Displayed
Then Check Choose Template Field is Displayed
And I Close Print Template Screen
And I Open Store Info Screen
Then Check Store Logo Check Box is Displayed
Then Check Store Name Check Box is Displayed
Then Check Store Address Check Box is Displayed
Then Check Store Email Check Box is Displayed
Then Check Store Phone Number Check Box is Displayed
Then Check Header Notes Check Box is Displayed
And I Close Store Info Screen
And I Open Check Details Screen
Then Check Check Number Check Box is Displayed
Then Check Table Name Check Box is Displayed
Then Check Seat Number Check Box is Displayed
Then Check Check Open Server Check Box is Displayed
Then Check Check Close Server Check Box is Displayed
Then Check Open Date & Time Check Box is Displayed
Then Check Close Date & Time Check Box is Displayed
Then Check Service Type Check Box is Displayed
And I Close Check Details Screen
And I Open Order Summary Screen
Then Check Secondary Menu Name Check Box is Displayed
Then Check Roll Out Modifier Price To Menu Check Box is Displayed
And I Select Roll Out Modifier Price To Menu Check Box
Then Check Roll Out Modifier To Menu Check Box is Displayed
Then Check Roll Out Modifier Price & Quantity To Menu Check Box is Displayed
And I Unselect Roll Out Modifier Price To Menu Check Box
Then Check Exclude Zero Price Menu Item Check Box is Displayed
Then Check Exclude Zero Price Modifier Check Box is Displayed
Then Check Tax Total Check Box is Displayed
Then Check Hide Inclusive Tax Check Box is Displayed
Then Check Gratuity Check Box is Displayed
Then Check Tip Check Box is Displayed
Then Check Cash Discount Check Box is Displayed
Then Check Check Total Check Box is Displayed
Then Check Tender Details Check Box is Displayed
Then Check Show Membership Balance Check Box is Displayed
Then Check Discount Under the Menu Item Check Box is Displayed
Then Check Print Check In Primary & Secondary Languages Check Box is Displayed
And I Close Order Summary Screen
And I Open Customer Info Screen
Then Check Customer Name Check Box is Displayed
Then Check Customer Address Check Box is Displayed
Then Check Customer Phone Number Check Box is Displayed
Then Check Customer Email Check Box is Displayed
Then Check Customer Notes Text Box is Displayed
And I Close Customer Info Screen
And I Open Additional Settings Screen
Then Check Tip Line Check Box is Displayed
Then Check Signature Check Box is Displayed
Then Check Show E-Invoice URL Check Box is Displayed
Then Check Show E-Invoice QR Check Box is Displayed
Then Check Tip Suggestion Check Box is Displayed
Then Check Special Notes Check Box is Displayed
Then Check Loyalty Amount Check Box is Displayed
Then Check Barcode Check Box is Displayed
Then Check Show Remaining Balance Check Box is Displayed
Then Check Show QR Payment Check Box is Displayed
Then Check Rename Tip Amount as Additional Tip Check Box is Displayed
And I Close Additional Settings Screen
And I Open Merchant Copy Screen
Then Check Print GC Balance Check Box in Merchant Copy is Displayed
Then Check Print HA Balance Check Box in Merchant Copy is Displayed
Then Check Print Tab Name Check Box is Displayed
Then Check Print Membership Balance in Merchant Copy Check Box is Displayed
And I Close Merchant Copy Screen
And I Open Customer Copy Screen
Then Check Print GC Balance Check Box in Customer Copy is Displayed
Then Check Print HA Balance Check Box in Customer Copy is Displayed
Then Check Print Membership Balance in Customer Copy Check Box is Displayed
And I Close Customer Copy Screen

Scenario: Updating Print Template with Font Sizes as Medium
And I Open Print Template Screen
And I Select Font Size as Medium Radio button
Then Check Font Size changes as Medium in Template Preview Screen
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not
And I Refresh the Page
And I Open Print Template Screen
Then Check Font Size selected as Medium
Then Check Font Size changes as Medium in Template Preview Screen

Scenario: Updating Print Template with Font Sizes as Small
And I Open Print Template Screen
And I Select Font Size as Small Radio button
Then Check Font Size changes as Small in Template Preview Screen
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not
And I Refresh the Page
And I Open Print Template Screen
Then Check Font Size selected as Small
Then Check Font Size changes as Small in Template Preview Screen

Scenario: Updating Print Template by Changing Template 2
And I Open Print Template Screen
And I Select Choose Template as Template2
#Then Check Font Size changes as Medium in Template Preview Screen
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not
And I Refresh the Page
And I Open Print Template Screen
Then Check Template selected as Template2

Scenario: Updating Print Template by Changing Template 1
And I Open Print Template Screen
And I Select Choose Template as Template1
#Then Check Font Size changes as Medium in Template Preview Screen
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not
And I Refresh the Page
And I Open Print Template Screen
Then Check Template selected as Template1

#@EditFrontEnd
Scenario: Updating Store Info by Unselecting All CheckBoxs
And I Open Store Info Screen
And I Unselect Store Logo Check Box
And I Unselect Store Name Check Box
And I Unselect Store Address Check Box
And I Unselect Store Email Check Box
And I Unselect Store Phone Number Check Box
#And I Unselect Highlight Store Name Check Box
#And I Unselect Include Hours of Operation Check Box
And I Unselect Header Notes Check Box
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

#@EditFrontEnd
Scenario: Verify All Check Boxs Unselected in Store Info After Reopen
And I Refresh the Page
And I Open Store Info Screen
Then Check Store Logo Check Box is Unselected
Then Check Store Name Check Box is Unselected
Then Check Store Address Check Box is Unselected
Then Check Store Email Check Box is Unselected
Then Check Store Phone Number Check Box is Unselected
#Then Check Highlight Store Name Check Box is Unselected
#Then Check Include Hours of Operation Check Box is Unselected
Then Check Header Notes Check Box is Unselected
And I Close Store Info Screen

@EditFrontEnd
Scenario: Updating Store Info by Selecting All CheckBoxs
And I Open Store Info Screen
And I Select Store Logo Check Box
Then Check Upload Image Field is Displayed
And I Upload the Image above Recommended Size
Then Check Recommended image size should be 100*100 Error is Displayed
Then Upload an Image
And I Select Store Name Check Box
And I Select Store Address Check Box
And I Select Store Email Check Box
And I Select Store Phone Number Check Box
#And I Select Highlight Store Name Check Box
#And I Select Include Hours of Operation Check Box
And I Select Header Notes Check Box
And I Enter the Header Notes
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

@EditFrontEnd
Scenario: Verify All Check Boxs Selected in Store Info After Reopen
And I Refresh the Page
And I Open Store Info Screen
Then Check Store Logo Check Box is Selected
Then Check Store Name Check Box is Selected
Then Check Store Address Check Box is Selected
Then Check Store Email Check Box is Selected
Then Check Store Phone Number Check Box is Selected
#Then Check Highlight Store Name Check Box is Selected
#Then Check Include Hours of Operation Check Box is Selected
Then Check Header Notes Check Box is Selected
And I Close Store Info Screen

Scenario: Updating Check Details by Unselecting All CheckBoxs
And I Open Check Details Screen
And I Unselect Check Number Check Box
And I Unselect Table Name Check Box
And I Unselect Seat Number Check Box
And I Unselect Check Open Server Check Box
And I Unselect Check Close Server Check Box
And I Unselect Open Date & Time Check Box
And I Unselect Close Date & Time Check Box
And I Unselect Service Type Check Box
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Unselected in Check Details After Reopen
And I Refresh the Page
And I Open Check Details Screen
Then Check Check Number Check Box is Unselected
Then Check Table Name Check Box is Unselected
Then Check Seat Number Check Box is Unselected
Then Check Check Open Server Check Box is Unselected
Then Check Check Close Server Check Box is Unselected
Then Check Open Date & Time Check Box is Unselected
Then Check Close Date & Time Check Box is Unselected
Then Check Service Type Check Box is Unselected
And I Close Check Details Screen

Scenario: Updating Check Details by Selecting All CheckBoxs
And I Open Check Details Screen
And I Select Check Number Check Box
Then Check Position for Check Number Radio button Field is Displayed
Then Check Font Size for Check Number Radio button Field is Displayed
And I Select Check Number Position as Block2
Then Check Font Size for Check Number Radio button Field is Not Displayed
And I Select Check Number Position as Block1
And I Select Check Number Font Size as Normal
And I Select Table Name Check Box
And I Select Seat Number Check Box
And I Select Check Open Server Check Box
And I Select Check Close Server Check Box
And I Select Open Date & Time Check Box
And I Select Close Date & Time Check Box
And I Select Service Type Check Box
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Selected in Check Details After Reopen
And I Refresh the Page
And I Open Check Details Screen
Then Check Check Number Check Box is Selected
Then Check Check Number Position selected as Block1
Then Check Check Number Font Size selected as Normal
Then Check Table Name Check Box is Selected
Then Check Seat Number Check Box is Selected
Then Check Check Open Server Check Box is Selected
Then Check Check Close Server Check Box is Selected
Then Check Open Date & Time Check Box is Selected
Then Check Close Date & Time Check Box is Selected
Then Check Service Type Check Box is Selected
And I Close Check Details Screen

Scenario: Updating Order Summary by Unselecting All CheckBoxs
And I Open Order Summary Screen
And I Unselect Secondary Menu Name Check Box
And I Unselect Roll Out Modifier Price To Menu Check Box
And I Unselect Exclude Zero Price Menu Item Check Box
And I Unselect Exclude Zero Price Modifier Check Box
And I Unselect Tax Total Check Box
And I Unselect Hide Inclusive Tax Check Box
And I Unselect Gratuity Check Box
And I Unselect Tip Check Box
And I Unselect Cash Discount Check Box
And I Unselect Check Total Check Box
And I Unselect Tender Details Check Box
And I Unselect Show Membership Balance Check Box
And I Unselect Discount Under the Menu Item Check Box
And I Unselect Print Check In Primary & Secondary Languages Check Box
And I Unselect Single Quantity Price Inside Braces Check Box
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Unselected in Order Summary After Reopen
And I Refresh the Page
And I Open Order Summary Screen
Then Check Secondary Menu Name Check Box is Unselected
Then Check Roll Out Modifier Price To Menu Check Box is Unselected
Then Check Exclude Zero Price Menu Item Check Box is Unselected
Then Check Exclude Zero Price Modifier Check Box is Unselected
Then Check Tax Total Check Box is Unselected
Then Check Hide Inclusive Tax Check Box is Unselected
Then Check Gratuity Check Box is Unselected
Then Check Tip Check Box is Unselected
Then Check Cash Discount Check Box is Unselected
Then Check Check Total Check Box is Unselected
Then Check Tender Details Check Box is Unselected
Then Check Show Membership Balance Check Box is Unselected
Then Check Discount Under the Menu Item Check Box is Unselected
Then Check Print Check In Primary & Secondary Languages Check Box is Unselected
Then Check Single Quantity Price Inside Braces Check Box is Unselected
And I Close Order Summary Screen

Scenario: Updating Order Summary by Selecting All CheckBoxs
And I Open Order Summary Screen
And I Select Secondary Menu Name Check Box
And I Select Roll Out Modifier Price To Menu Check Box
And I Select Roll Out Modifier To Menu Check Box
And I Select Roll Out Modifier Price & Quantity To Menu Check Box
And I Select Exclude Zero Price Menu Item Check Box
And I Select Exclude Zero Price Modifier Check Box
And I Select Tax Total Check Box
And I Select Hide Inclusive Tax Check Box
And I Select Gratuity Check Box
And I Select Tip Check Box
And I Select Cash Discount Check Box
And I Select Check Total Check Box
And I Select Tender Details Check Box
And I Select Show Membership Balance Check Box
And I Select Discount Under the Menu Item Check Box
And I Select Print Check In Primary & Secondary Languages Check Box
And I Select Single Quantity Price Inside Braces Check Box
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Selected in Order Summary After Reopen
And I Refresh the Page
And I Open Order Summary Screen
Then Check Secondary Menu Name Check Box is Selected
Then Check Roll Out Modifier Price To Menu Check Box is Selected
Then Check Roll Out Modifier To Menu Check Box is Selected
Then Check Roll Out Modifier Price & Quantity To Menu Check Box is Selected
Then Check Exclude Zero Price Menu Item Check Box is Selected
Then Check Exclude Zero Price Modifier Check Box is Selected
Then Check Tax Total Check Box is Selected
Then Check Hide Inclusive Tax Check Box is Selected
Then Check Gratuity Check Box is Selected
Then Check Tip Check Box is Selected
Then Check Cash Discount Check Box is Selected
Then Check Check Total Check Box is Selected
Then Check Tender Details Check Box is Selected
Then Check Show Membership Balance Check Box is Selected
Then Check Discount Under the Menu Item Check Box is Selected
Then Check Print Check In Primary & Secondary Languages Check Box is Selected
Then Check Single Quantity Price Inside Braces Check Box is Selected
And I Close Order Summary Screen

Scenario: Updating Customer Info by Unselecting All CheckBoxs
And I Open Customer Info Screen
And I Unselect Customer Name Check Box
And I Unselect Customer Address Check Box
And I Unselect Customer Phone Number Check Box
And I Unselect Customer Email Check Box
And I Unselect Card Details Check Box
And I Unselect Customer Notes Check Box
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Unselected in Customer Info After Reopen
And I Refresh the Page
And I Open Customer Info Screen
Then Check Customer Name Check Box is Unselected
Then Check Customer Address Check Box is Unselected
Then Check Customer Phone Number Check Box is Unselected
Then Check Customer Email Check Box is Unselected
Then Check Card Details Check Box is Unselected
Then Check Customer Notes Check Box is Unselected
And I Close Customer Info Screen

Scenario: Updating Customer Info by Selecting All CheckBoxs
And I Open Customer Info Screen
And I Select Customer Name Check Box
And I Select Customer Address Check Box
And I Select Customer Phone Number Check Box
And I Select Customer Email Check Box
And I Select Card Details Check Box
And I Select Customer Notes Check Box
#Then Check Customer Notes Text Box is Displayed
And I Enter the Customer Notes
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Selected in Customer Info After Reopen
And I Refresh the Page
And I Open Customer Info Screen
Then Check Customer Name Check Box is Selected
Then Check Customer Address Check Box is Selected
Then Check Customer Phone Number Check Box is Selected
Then Check Customer Email Check Box is Selected
Then Check Card Details Check Box is Selected
Then Check Customer Notes Check Box is Selected
And I Close Customer Info Screen

Scenario: Updating Additional Settings by Unselecting All CheckBoxs
And I Open Additional Settings Screen
And I Unselect Tip Line Check Box
And I Unselect Signature  Check Box
And I Unselect Show E-Invoice URL Check Box
And I Unselect Show E-Invoice QR Check Box
And I Unselect Tip Suggestion Check Box
And I Unselect Special Notes Check Box
And I Unselect Loyalty Amount Check Box
And I Unselect Barcode Check Box
And I Unselect Cut Paper After Each Print Check Box
And I Unselect Show Remaining Balance Check Box
And I Unselect Show QR Payment Check Box
And I Unselect Rename Tip Amount as Additional Tip Check Box
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Unselected in Additional Settings After Reopen
And I Refresh the Page
And I Open Additional Settings Screen
Then Check Tip Line Check Box is Unselected
Then Check Signature Check Box is Unselected
Then Check Show E-Invoice URL Check Box is Unselected
Then Check Show E-Invoice QR Check Box is Unselected
Then Check Tip Suggestion Check Box is Unselected
Then Check Special Notes Check Box is Unselected
Then Check Loyalty Amount Check Box is Unselected
Then Check Barcode Check Box is Unselected
Then Check Cut Paper After Each Print Check Box is Unselected
Then Check Show Remaining Balance Check Box is Unselected
Then Check Show QR Payment Check Box is Unselected
Then Check Rename Tip Amount as Additional Tip Check Box is Unselected
And I Close Additional Settings Screen

Scenario: Updating Additional Settings by Selecting All CheckBoxs
And I Open Additional Settings Screen
And I Select Tip Line Check Box
Then Check Tip Field displayed in Template Preview
And I Select Signature Check Box
Then Check Customer Signature Field displayed in Template Preview
And I Select Show E-Invoice URL Check Box
Then Check E-Invoice URL Field displayed in Template Preview
And I Select Show E-Invoice QR Check Box
Then Check E-Invoice QR Field displayed in Template Preview
And I Select Tip Suggestion Check Box
Then Check Suggested Tip Amount Field displayed in Template Preview
Then Check Tip Suggestion Custom Message Check Box is Displayed
And I Select Tip Suggestion Custom Message Check Box
And I Select Special Notes Check Box
And I Select Loyalty Amount Check Box
#Then Check Loyalty Amount Field displayed in Template Preview
And I Select Barcode Check Box
Then Check Barcode Field displayed in Template Preview
And I Select Cut Paper After Each Print Check Box
And I Select Show Remaining Balance Check Box
And I Select Show QR Payment Check Box
Then Check QR Payment Field displayed in Template Preview
And I Select Rename Tip Amount as Additional Tip Check Box
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Selected in Additional Settings After Reopen
And I Refresh the Page
And I Open Additional Settings Screen
Then Check Tip Line Check Box is Selected
Then Check Signature  Check Box is Selected
Then Check Show E-Invoice URL Check Box is Selected
Then Check Show E-Invoice QR Check Box is Selected
Then Check Tip Suggestion Check Box is Selected
Then Check Tip Suggestion Custom Message Check Box is Selected
Then Check Special Notes Check Box is Selected
Then Check Loyalty Amount Check Box is Selected
Then Check Barcode Check Box is Selected
Then Check Cut Paper After Each Print Check Box is Selected
Then Check Show Remaining Balance Check Box is Selected
Then Check Show QR Payment Check Box is Selected
Then Check Rename Tip Amount as Additional Tip Check Box is Selected
And I Close Additional Settings Screen

Scenario: Updating Merchant Copy by Unselecting All CheckBoxs
And I Open Merchant Copy Screen
And I Unselect Print GC Balance Check Box in Merchant Copy
And I Unselect Print HA Balance Check Box in Merchant Copy
And I Unselect Print Tab Name Check Box
And I Unselect Print Membership Balance Check Box in Merchant Copy
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Unselected in Merchant Copy After Reopen
And I Refresh the Page
And I Open Merchant Copy Screen
Then Check Print GC Balance Check Box in Merchant Copy is Unselected
Then Check Print HA Balance Check Box in Merchant Copy is Unselected
Then Check Print Tab Name Check Box is Unselected
Then Check Print Membership Balance in Merchant Copy Check Box is Unselected
And I Close Merchant Copy Screen


Scenario: Updating Merchant Copy by Selecting All CheckBoxs
And I Open Merchant Copy Screen
And I Select Print GC Balance Check Box in Merchant Copy
And I Select Print HA Balance Check Box in Merchant Copy
And I Select Print Tab Name Check Box
And I Select Print Membership Balance Check Box in Merchant Copy
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Selected in Merchant Copy After Reopen
And I Refresh the Page
And I Open Merchant Copy Screen
Then Check Print GC Balance Check Box in Merchant Copy is Selected
Then Check Print HA Balance Check Box in Merchant Copy is Selected
Then Check Print Tab Name Check Box is Selected
Then Check Print Membership Balance in Merchant Copy Check Box is Selected
And I Close Merchant Copy Screen

Scenario: Updating Customer Copy by Unselecting All CheckBoxs
And I Open Customer Copy Screen
And I Unselect Print GC Balance Check Box in Customer Copy
And I Unselect Print HA Balance Check Box in Customer Copy
And I Unselect Print Membership Balance Check Box in Customer Copy
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Unselected in Customer Copy After Reopen
And I Refresh the Page
And I Open Customer Copy Screen
Then Check Print GC Balance Check Box in Customer Copy is Unselected
Then Check Print HA Balance Check Box in Customer Copy is Unselected
Then Check Print Membership Balance in Customer Copy Check Box is Unselected
And I Close Customer Copy Screen

Scenario: Updating Customer Copy by Selecting All CheckBoxs
And I Open Customer Copy Screen
And I Select Print GC Balance Check Box in Customer Copy
And I Select Print HA Balance Check Box in Customer Copy
And I Select Print Membership Balance Check Box in Customer Copy
And I Click the Update buttonTwo
Then Verify whether Receipt Template Updated or Not

Scenario: Verify All Check Boxs Selected in Customer Copy After Reopen
And I Refresh the Page
And I Open Customer Copy Screen
Then Check Print GC Balance Check Box in Customer Copy is Selected
Then Check Print HA Balance Check Box in Customer Copy is Selected
Then Check Print Membership Balance in Customer Copy Check Box is Selected
And I Close Customer Copy Screen
