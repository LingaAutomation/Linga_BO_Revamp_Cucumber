@Settings
@ScaleBarcode

Feature: Settings - Scale Barcode
I am verify the Settings- Scale Barcode Module and Performing Some Operations on that

Background: Opening the Scale Barcode page
Given Open Scale Barcode home page BaseURL and StoreID

Scenario: Verify whether the Scale Barcode Header is Displayed
Given Verifying the Scale Barcode Header Page

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify Available Fields in Scale Barcode
Given Verify Name Column is Displayed or Not
Then Verify Prefix/Variable Type Column is Displayed or Not
Then Verify PLU Column is Displayed or Not
Then Verify Price Details Column is Displayed or Not
Then Verify Weight Details Column is Displayed or Not

Scenario: Verify New Scale Barcode Header
Given I Click New Scale Barcode button
Then Verify New Scale Barcode Header
And I Click the Cancel button

Scenario: Verfiy able to Create the New Scale Barcode without Entering Name/Mandatory Fields
Given I Click New Scale Barcode button
Then Verify whether the Save button is Disabled
And I Click the Cancel button

Scenario: Verfiy able to Create Scale Barcode without Entering Name
Given I Click New Scale Barcode button
And Enter Scale Barcode Name
#When Clear the Name
#Then Verify Please Enter Name Error Message
And Enter Prefix and Variable Type
And Enter PLU Start Position
And Enter PLU No.of Digits
Then Verify whether the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create Scale Barcode without Entering Prefix and Variable Type
Given I Click New Scale Barcode button
And Enter Scale Barcode Name
And Enter PLU Start Position
And Enter PLU No.of Digits
Then Verify whether the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create Scale Barcode without Entering PLU Start Position
Given I Click New Scale Barcode button
And Enter Scale Barcode Name
And Enter Prefix and Variable Type
And Enter PLU No.of Digits
Then Verify whether the Save button is Disabled
And I Click the Cancel button 

Scenario: Verify able to Create Scale Barcode without Entering PLU No.of Digits
Given I Click New Scale Barcode button
And Enter Scale Barcode Name
And Enter Prefix and Variable Type
And Enter PLU Start Position
Then Verify whether the Save button is Disabled
And I Click the Cancel button 

Scenario: Enter the Scale Barcode Name Exceeding Limit
Given I Click New Scale Barcode button
And Enter Scale Barcode Name Exceeding Limit
Then Verify Name should not be more than 25 characters Error Message
And I Click the Cancel button 

Scenario: Enter Prefix and Variable Type in Alphabets and Verify Error Message
Given I Click New Scale Barcode button
When Enter Prifix and Variable Type In Alphabets
Then Verfiy Enter Valid Prefix Error Message
And I Click the Cancel button

Scenario: Enter Prefix and Variable Type Exceeding limit
Given I Click New Scale Barcode button
Then Enter Prefix and Variable Type Exceeding Limit
And I Click the Cancel button

Scenario: Create a New Scale Barcode with Mandatory Fields set Scale By as Price
Given I Click New Scale Barcode button
And Enter Scale Barcode Name
And Enter Prefix and Variable Type
And Enter PLU Start Position
And Enter PLU No.of Digits
When Select the Set Scale By as Price
And Enter Price Start Position 
Then Enter Price No.Of Digits
And I Click the Save button
Then Verify Scale Barcode Saved or Not

Scenario: Create a New Scale Barcode with Mandatory Fields set Scale By as Weight
Given I Click New Scale Barcode button
And Enter Scale Barcode Name Set Scale By as Weight
And Enter Prefix and Variable Type 
And Enter PLU Start Position
And Enter PLU No.of Digits
When Select the Set Scale By as Weight
And Enter Weight Start Position 
Then Enter Weight No.Of Digits
And I Click the Save button
Then Verify Scale Barcode Saved or Not

Scenario: Verify Scale Barcode Screen Barcode Header
Given I Search and Edit Scale Barcode
Then Verify Update Screen Header

Scenario: Verify able to Cancel/Close the Scale Barcode Update Screen
And I Click the Cancel button 
Then Verify Scale Barcode Update Screen Closed or Not

Scenario: Verify able to Update without Scale Barcode Name
Given I Search and Edit Scale Barcode
When Clear the Name
Then Verify whether the Update button is Disabled
And I Click the Cancel button 
@SEdit
Scenario: Verify able to Update without Prefix and Variable Type
Given I Search and Edit Scale Barcode
When Clear the Barcode Prefix
#Then Verify enter Prefix Error Message
Then Verify whether the Update button is Disabled
And I Click the Cancel button 
@SEdit
Scenario: Update the Scale Barcode Settings
Given I Search and Edit Scale Barcode
And Enter Scale Barcode Name
And Enter Prefix and Variable Type
And Enter PLU Start Position
And I Click the Update button
Then Verify Scale Barcode Updated or Not
@SEdit
Scenario: Verify whether unable to Inactivate the Scale Barcode Clicking Cancel/No button
Given I Search the Scale Barcode and Click the Delete button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Scale Barcode Inactivated or Not
@SEdit
Scenario: Verify whether Able to Inactivate the Scale Barcode Clicking Delete/Yes button
Given I Search the Scale Barcode and Click the Delete button
And I Click the Delete button
Then I Verifying the Scale Barcode Deleted or Not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Scale Barcode
@SEdit
Scenario: Verify whether Unable to Activate the Scale Barcode Clicking Cancel/No button
Given I Search the Scale Barcode and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled Scale Barcode is Activated or Not
@SEdit
Scenario: Verify whether Able to Activate the Scale Barcode Clicking Delete/Yes button
Given I Search the Scale Barcode and Click the Active button
And I Click the Activate button
Then I Verifying the Scale Barcode Activated or Not
And I Click the Active button to navigate Activated screen to Verify Activated Scale Barcode
@SEdit
Scenario: Verify whether able to create Duplicate Scale Barcode
Given I Click New Scale Barcode button
And Enter Scale Barcode Name
And Enter Prefix and Variable Type
And Enter PLU Start Position
And Enter PLU No.of Digits
When Select the Set Scale By as Weight
And Enter Weight Start Position 
Then Enter Weight No.Of Digits
And I Click the Save button
Then Verify whether Duplicate Scale Barcode Saved or Not






