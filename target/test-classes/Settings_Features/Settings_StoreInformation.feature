@Settings
@StoreInformation

Feature: Settings - StoreInformation
I am verify the Settings- Store Information Module and Performing Some Operations on that

Background: Opening the Store Information page
Given Open the Store Information home page BaseURL and StoreID

Scenario: Verify whether the Store Information Header is Displayed
Given Verifying the Store Information Header Page

Scenario: Verify Save button Without any changes After Opening Page
Then Verify whether the Save button is Disabled

Scenario: Verfiy able to Save without Entering Store Name
Given Clear the Store Name
Then Verify whether the Save button is Disabled

Scenario: Verfiy able save Store Information with Store Name In Numbers
Given Enter Store Name In Number
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

#35
Scenario: Verify Store Name Exceeding the Limit
Given Clear the Store Name
Then Enter Store Name Exceeding Limit

Scenario: Verfiy able save Store Information with Store Name In Special Characters
Given Clear the Store Name
Then Enter Store Name In Special Characters
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Verfiy able save Store Information with Store Name In Special Characters and Numbers
Given Clear the Store Name
Then Enter Store Name In Special Characters and Numbers
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter the Existing Store Name and Click on Save
Given Clear the Store Name
Then Enter Existing Store Name
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Ente Store ID in the form of Alphabets
Given Clear the Store ID
Then Enter Store ID in the Form of Alphabets
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter Store ID in the form of Numbers and Alphabets
Given Clear the Store ID
Then Enter Store ID in the Form of Alphabets and Numbers
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not
#11
Scenario: Enter Store ID Exceeding the Limit
Given Clear the Store ID
Then Enter Store ID Exceeding Limit

Scenario: Verify able to save Store Information adding less than Six Digits in Phone Number Field
Given Clear the Phone Number Field
Then Enter Phone Number Less than six Digits
Then Verify Phone Number Should Be Contain At Least Six Digits error message
Then Verify whether the Save button is Disabled

Scenario: Enter Special Characters in Phone Number Field and Verify able to Save
Given Clear the Phone Number Field
Then Enter Special Characters in Phone Number Field
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not
#25
Scenario: Enter Phone Number Exceeding Limit
Given Clear the Phone Number Field
Then Enter Phone Number Exceeding Limit

Scenario: Enter Phone Number in the Form of Numbers and Save Store Information
Given Clear the Phone Number Field
Then Enter Numbers in Phone Number Field
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter Invalid Email ID and Verify Save button
Given Clear the Email ID 
Then Enter Invalid Email ID
Then Verify Please Enter Valid Email Error Message
Then Verify whether the Save button is Disabled

Scenario: Enter Valid Email and Save the Store Information
Given Clear the Email ID 
Then Enter Valid Email ID
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter Invalid GiftCard EmailID and Verify Save button
Given Clear the Gift Card Email ID 
Then Enter Invalid Gift Card Email ID
Then Verify Please Enter Valid Email Error Message
Then Verify whether the Save button is Disabled

Scenario: Enter Valid Gift Card Email ID and Save the Store Information
Given Clear the Gift Card Email ID 
Then Enter Valid Gift Card Email ID
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Upload Store Image 
Then Upload an Image
#And I Click the Save button in Store Information
#Then Verify Store Inofrmation Saved or Not
@languages
Scenario: Verify able to Save Store Information Without Selecting Languages
Given Clear the Selected Languages
Then Verify whether the Save button is Disabled
@languages
Scenario: Select the Languages from Drop down and Save Store Information
Given Click on Languages Dropdown 
Then Select the Languages
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not
@languages
Scenario: Select the Default Languages From Dropdown
Given Click on Default Languages Dropdown
Then Select Default Language From Dropdown
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter Street In the Form of Numbers
Given Clear the Street Name
Then Enter Street Name in the Form of Numbers
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter Street Name in the Form of Special Characters
Given Clear the Street Name
Then Enter Street Name in the Form of Special Characters
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not
#40
Scenario: Enter Street Name Exceeding the Limit
Given Clear the Street Name
Then Enter Street Name Exceeding Limit

Scenario: Enter Street Name as a combination and Save 
Given Clear the Street Name
Then Enter Street Name in the Form of Numbers and alphabets
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter Apt and Suite Field Exceeding Limit
Given Clear Apt and Suite Field
Then Enter Apt and Suite Exceeding Limit

Scenario: Enter Apt and Suite Field as combination
Given Clear Apt and Suite Field
Then Enter Apt and Suite in the Form of Numbers and alphabets
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter City in the Form of Numbers
Given Clear the City Field
And Enter City in the Form of Numbers
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not
#25
Scenario: Enter City Exceeding the Limit
Given Clear the City Field
Then Enter City Exceeding the Limit

Scenario: Enter City Field as combination
Given Clear the City Field
Then Enter City in the Form of Numbers and alphabets
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter State in the Form of Numbers
Given Clear the State Field
And Enter State in the Form of Numbers
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not
#25
Scenario: Enter State Exceeding the Limit
Given Clear the State Field
Then Enter State Exceeding the Limit

Scenario: Enter State in the Form of Special Characters
Given Clear the State Field
Then Enter State in the form of Special Characters
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter State Field as combination
Given Clear the State Field
Then Enter State in the Form of Numbers and alphabets
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter ZipCode less than Four digits
Given Clear the ZipCode Field
Then Enter Zipcode Less than Four digits
Then verify ZipCode should be Four To Ten characters Error Message

Scenario: Enter Zipcode in the form Special characters
Given Clear the ZipCode Field
Then Enter Zipcode in the form of Special characters
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Enter Zipcode as Combination
Given Clear the ZipCode Field
Then Enter Zipcode in the form of alphabets and Numbers
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not

Scenario: Select the Time Zone from Dropdown and Save
Given Click on Time Zone from Dropdown
Then Select the Time Zone from Dropdown
And I Click the Save button in Store Information
Then Verify Store Inofrmation Saved or Not
























 