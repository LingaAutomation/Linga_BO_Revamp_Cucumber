@Linga_Admin
@Linga_Settings_Countries
Feature: Linga Admin - Settings - Country
I am verify the Admin-Country module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Linga Admin Countries page.
Given Open the Admin-Countries page BaseURL and StoreID

Scenario: Verify Whether the Countries Header is Displayed.
Given Verifying the Countries Header Page

Scenario: Verify Path Displayed above the Header.
Given Verifying the Path Admin / Settings / Countries Displayed above the Header

#Scenario: Verify field is Displayed under Countries Page.
#Then Verify the Name header in Countries is Displayed
#Then Verify the Currency Name header in Countries is Displayed
#Then Verify the Currency Symbol in Countries is Displayed
#Then Verify the Actions header in Countries is Displayed

#Sorting
#Scenario: Verify Sorting Options Under All Fields.
#Then Verify the Sorting Option Displayed in Name header
#Then Verify the Sorting Option Displayed in Currency Name header
#Then Verify the Sorting Option Displayed in Currency Symbol header

Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

Scenario: Verify whether we can able to do Rows Per Page
Given I can do the Rows Per Page

Scenario: Verify the New Country Page header
Given Click the New Country button
When Verify the New Country Header

Scenario: Verify whether we able to create the New Country without Entering Name/Mandatory Fields
#And I Click the Save button without Entering User Name
Then Check the Save button is Disabled

Scenario: Verify whether the user can able to Enter the Country Name above the limit
And I Enter the Country Name Exceeding the limit

Scenario: Verify whether the user can able to Enter the Currency Name above the limit
And I Enter the Currency Name Exceeding the limit

Scenario: Verify whether the user can able to Enter the Currency Symbol above the limit
And I Enter the Currency Symbol Exceeding the limit

Scenario: Verify whether the user can able to Enter the Phone Code above the limit
And I Enter the Phone Code Exceeding the limit

Scenario: Verify whether the user can able to Enter the ISO Code above the limit
And I Enter the ISO Code Exceeding the limit
And I Click the Cancel button

 Scenario: Verify whether we can able to Save without Country Name
 Given Click the New Country button
 And I Clear the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Save button is Disabled
 
 Scenario: Verify whether we can able to Save without Currency Name
 And I Enter the Country Name
  And I Clear the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Save button is Disabled
 
Scenario: Verify whether we can able to Save without Currency Symbol
 And I Enter the Country Name
 And I Enter the Currency Name
  And I Clear the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Save button is Disabled
 
Scenario: Verify whether we can able to Save without Phone Code
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Clear the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Save button is Disabled
 
Scenario: Verify whether we can able to Save without ISO Code
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Clear the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Save button is Disabled
 
Scenario: Verify whether we can able to Save without Currency Decimal as 0
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal as Zero
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Save button is Disabled
 
Scenario: Verify whether we can able to Create a New Country
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
And I Click the Save button
Then Verify the Country Saved Successfully or not

Scenario: Verify the Update header by Editing Saved Country
Given I Search and Edit the Country
When Verify the Update Country Header

Scenario: Verify whether we can able to Cancel/Close the Country Update screen
And I Click the Cancel button
Then I Verify Country Update screen Close or not

Scenario: Verify able to search the Country by entering 3 letters of User
And I Verify Searching the Item when entering three letters

Scenario: Update the Country without Country Name
Given I Search and Edit the Country
And I Clear the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Update button is Disabled

 Scenario: Verify whether we can able to Update without Currency Name
 And I Enter the Country Name
 And I Clear the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Update button is Disabled
 
Scenario: Verify whether we can able to Update without Currency Symbol
 And I Enter the Country Name
 And I Enter the Currency Name
 And I Clear the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Update button is Disabled
 
Scenario: Verify whether we can able to Update without Phone Code
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Clear the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Update button is Disabled
 
Scenario: Verify whether we can able to Update without ISO Code
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Clear the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Update button is Disabled
 
Scenario: Verify whether we can able to Update without Currency Decimal as 0
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal as Zero
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 Then Check the Update button is Disabled
 
Scenario: Update the Country
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Dot
 And I Select the Thousand Separator as Comma
And I Click the Update button
Then Verify the Country Update Successfully or not

Scenario: Update the Country Name with Space
Given I Search and Edit the Country
And I Enter the Country Name with Space
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 And I Click the Update button
 Then Verify the Country Updated with Space or not
 
 Scenario: Create a Duplicate Country
Given Click the New Country button
And I Enter the Country Name
 And I Enter the Currency Name
 And I Enter the Currency Symbol
 And I Enter the Phone Code
 And I Enter the ISO Code
 And I Enter the Currency Decimal
 And I Select the Decimal Separator as Comma
 And I Select the Thousand Separator as Dot
 And I Click the Save button
 Then Verify the Duplicate Country Saved or not


#Scenario: Verify Minimum Character in All Field Under New Country
#And I Select +New Country
#Then Verify Minimum Character in All Field or Not
#
#Scenario: Verify Maximum Character in All Field Under New Country
#And I Select +New Country
#Then Verify Maximum Character in All Field or Not
#
#Scenario: Verify Select Cancel in Create New Country.
#And I Select +New Country
#And I Click the Cancel button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify Select Close in Create New Country.
#And I Select +New Country
#And I Click the Close button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify Select Cancel in Create New Country.
#And I Select +New Country
#And I Enter Country Name
#And I Enter Currency Name
#And I Enter Currency Symbol
#And I Enter Phone Code
#And I Enter ISO Code
#And I Enter Currency Decimal
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Cancel button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify Select Close in Create New Country.
#And I Select +New Country
#And I Enter Country Name
#And I Enter Currency Name
#And I Enter Currency Symbol
#And I Enter Phone Code
#And I Enter ISO Code
#And I Enter Currency Decimal
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Close button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify whether able to Create Duplicate Country
#And I Select +New Country
#And I Enter Country Name
#And I Enter Currency Name
#And I Enter Currency Symbol
#And I Enter Phone Code
#And I Enter ISO Code
#And I Enter Currency Decimal
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Save button
#Then Verify whether Duplicate Country is Saved or not
#
#Scenario: Verify Four Decimal in Currency Decimal under Create New Country.
#And I Select +New Country
#And I Check Currency Decimal
#Then Verify Four Decimal Displayed or not
#
#Scenario: Verify Four Decimal in Currency Decimal under Edit Country.
#And I Select Edit Country
#And I Check Currency Decimal
#Then Verify Four Decimal Displayed or not
#
#Scenario: Verify Select Cancel in Update Newly Created Country.
#Given I Select Created Country
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Edit Thousand Separator
#And I Click the Cancel button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify Select Close in Update Newly Created Country.
#Given I Select Created Country
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Edit Thousand Separator
#And I Click the Close button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify After Create Use able to Edit Country in Update Country.
#Given I Create Country
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Edit Thousand Separator
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Select Cancel in Update Country.
#Given I Select Edit Country
#And I Click the Cancel button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify Select Close in Update Country.
#Given I Select Edit Country
#And I Click the Close button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify Field Under Decimal Separator in Edit Country page.
#Given I Select Existing Country
#Given I Select Edit Country
#And I Select Decimal Separator
#Then I Check Drop down with Comma and Dot Option
#
#Scenario: Verify Edit Country and Set Comma Decimal Separator.
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Select Comma(,) in Drop Down
#And I Edit Thousand Separator
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Country and Set Dot Decimal Separator.
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Select Dot(.) in Drop Down
#And I Edit Thousand Separator
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Field Under Thousand Separator in Edit Country page.
#Given I Select Existing Country
#Given I Select Edit Country
#And I Select Thousand Separator
#Then I Check Drop down with Comma and Dot Option
#
#Scenario: Verify Edit Country and Set Comma Thousand Separator.
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Edit Thousand Separator
#And I Select Comma(,) in Drop Down
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Country and Set Dot Thousand Separator.
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Edit Thousand Separator
#And I Select Dot(.) in Drop Down
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Minimum Character in All Field Under New Country
#Given I Select Existing Country
#Given I Select Edit Country
#Then Verify Minimum Character in All Field or Not
#
#Scenario: Verify Maximum Character in All Field Under New Country
#Given I Select Existing Country
#Given I Select Edit Country
#Then Verify Maximum Character in All Field or Not
#
#Scenario: Verify Update Existing Created Country.
#Given I Select Existing Country
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Edit Thousand Separator
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify whether able to Update Duplicate Country
#Given I Select Edit Country Newly Created
#And I Enter Country Name
#And I Enter Currency Name
#And I Enter Currency Symbol
#And I Enter Phone Code
#And I Enter ISO Code
#And I Enter Currency Decimal
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Update button
#Then Verify whether Duplicate Country is Update or not
#
#Scenario: Verify whether able to Update Duplicate Country with Existing Created Country
#Given I Select Existing Country
#Given I Select Edit Country
#And I Enter Country Name
#And I Enter Currency Name
#And I Enter Currency Symbol
#And I Enter Phone Code
#And I Enter ISO Code
#And I Enter Currency Decimal
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Update button
#Then Verify whether Duplicate Country is Update or not
#
#Scenario: Verify Select Cancel in Update Existing Created Country.
#Given I Select Existing Country
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Edit Thousand Separator
#And I Click the Cancel button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify Select Close in Update Existing Created Country.
#Given I Select Existing Country
#Given I Select Edit Country
#And I Edit Country Name
#And I Edit Currency Name
#And I Edit Currency Symbol
#And I Edit Phone Code
#And I Edit ISO Code
#And I Edit Currency Decimal
#And I Edit Decimal Separator
#And I Edit Thousand Separator
#And I Click the Close button
#Then Verify the Page Navigate to Countries Home page or not
#
#Scenario: Verify Edit Change Country Name in Update Country.
#Given I Select Edit Country
#And I Edit Country Name
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Change Country Name in Update Country.
#Given I Select Edit Country
#And I Edit Currency Name
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Change Currency Symbol in Update Country.
#Given I Select Edit Country
#And I Edit Currency Symbol
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Change Phone Code in Update Country.
#Given I Select Edit Country
#And I Edit Phone Code
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Change ISO Code in Update Country.
#Given I Select Edit Country
#And I Edit ISO Code
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Change Currency Symbol in Update Country.
#Given I Select Edit Country
#And I Edit Currency Symbol
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Change Decimal Separator in Update Country.
#Given I Select Edit Country
#And I Edit Decimal Separator
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify Edit Change Thousand Separator in Update Country.
#Given I Select Edit Country
#And I Edit Thousand Separator
#And I Click the Update button
#Then Verify the Country Updated Successfully or not
#
#Scenario: Verify whether the Country Saved by Entering Special Characters
#And I Select +New Country
#And I Enter Country Name with Special Characters
#And I Enter Currency Name with Special Characters
#And I Enter Currency Symbol with Special Characters
#And I Enter Phone Code with Special Characters
#And I Enter ISO Code with Special Characters
#And I Enter Currency Decimal with Special Characters
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Save button
#Then Verify whether the Country with Special Characters is Saved or not
#
#Scenario: Verify whether the Country Saved by Entering Special Characters
#Given I Select Existing Country
#Given I Select Edit Country
#And I Enter Country Name with Special Characters
#And I Enter Currency Name with Special Characters
#And I Enter Currency Symbol with Special Characters
#And I Enter Phone Code with Special Characters
#And I Enter ISO Code with Special Characters
#And I Enter Currency Decimal with Special Characters
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Update button
#Then Verify whether the Country with Special Characters is Update or not
#
#Scenario: Verify whether the Country Saved by Entering Special Characters
#Given I Select Edit Country with Newly Created
#And I Enter Country Name with Special Characters
#And I Enter Currency Name with Special Characters
#And I Enter Currency Symbol with Special Characters
#And I Enter Phone Code with Special Characters
#And I Enter ISO Code with Special Characters
#And I Enter Currency Decimal with Special Characters
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Update button
#Then Verify whether the Country with Special Characters is Update or not
#
#Scenario: Verify whether able to Create Country with Space
#And I Select +New Country
#And I Enter Country Name with Space
#And I Enter Currency Name with Space
#And I Enter Currency Symbol with Space
#And I Enter Phone Code with Space
#And I Enter ISO Code with Space
#And I Enter Currency Decimal with Space
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Save button
#Then Verify whether able to Create Country with Space or not
#
#Scenario: Verify whether the user can able to Enter above the limit in New Country
#And I Select +New Country
#And I Enter Country Name with Above the Limit
#And I Enter Currency Name with Above the Limit
#And I Enter Currency Symbol with Above the Limit
#And I Enter Phone Code with Above the Limit
#And I Enter ISO Code with Above the Limit
#And I Enter Currency Decimal with Above the Limit
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Save button
#Then Verify Whether the user can able to Enter above the Limit or not
#
#Scenario: Verify whether the user can able to Enter above the limit in Existing Country
#Given I Select Edit Country with Newly Created
#And I Enter Country Name with Above the Limit
#And I Enter Currency Name with Above the Limit
#And I Enter Currency Symbol with Above the Limit
#And I Enter Phone Code with Above the Limit
#And I Enter ISO Code with Above the Limit
#And I Enter Currency Decimal with Above the Limit
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Update button
#Then Verify Whether the user can able to Enter above the Limit or not
#
#Scenario: Verify whether we able to Save the Country with Single letter
#And I Select +New Country
#And I Enter Country Name with Single Letter
#And I Enter Currency Name with Single Letter
#And I Enter Currency Symbol with Single Letter
#And I Enter Phone Code with Single Letter
#And I Enter ISO Code with Single Letter
#And I Enter Currency Decimal with Single Digit
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Save button
#Then Verify whether we able to Save the Current with Single letter or not
#
#Scenario: Verify whether we able to Save the Country with Single letter
#Given I Select Edit Country with Newly Created
#And I Enter Country Name with Single Letter
#And I Enter Currency Name with Single Letter
#And I Enter Currency Symbol with Single Letter
#And I Enter Phone Code with Single Letter
#And I Enter ISO Code with Single Letter
#And I Enter Currency Decimal with Single Digit
#And I Select Decimal Separator
#And I Select Thousand Separator
#And I Click the Update button
#Then Verify whether we able to Update the Current with Single letter or not





