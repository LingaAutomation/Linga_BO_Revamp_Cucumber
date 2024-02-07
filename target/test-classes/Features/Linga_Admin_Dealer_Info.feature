@Linga_Admin
@Linga_Dealer_Info
Feature: Linga Admin -Dealer Info Info
  I am verify the Linga Admin - Dealer Info module by Add/Edit/Delete/Activate/Duplicate

  #Scenario: Login to the Application
  #Given Open the Browser and Enter URL
  #When I Select the Store after Login to Application when Enter Username and Passowrd
  Background: Open the Linga Admin - Dealer Info page in Linga Admin
    Given  Open the Linga Admin - Dealer Info home page BaseURL and StoreID


  Scenario: Verify whether the Dealer Info Header is Displayed
    Given Verifying the Dealers Headers Page

  Scenario: Verify Home Path
    Given Verifying the Linga Admin Dealer Info Homepath

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Sorting Dealer column
  #Given Sort the Dealer column
  Scenario: Verify able to search the Dealer Info Page by entering 3 letters
    #And I Select the Name/Email ID/Phone Number
    And I Verify Searching the Item when entering three letters

  #And I Verify Searching the Item when entering three letters
  #And I Verify Searching the Item when entering three letters
  Scenario: Verify whether we able to create the New Delaer without Entering Name/Mandatory Fields
    Given I Click the New Dealer button
    Then Check the Save button is Disabled
    And I Click the Backward button

  Scenario: Verify whether the user can able to Enter the Dealer Name above the limit
    Given I Click the New Dealer button
    And I Enter the Dealer Name Exceeding the limit
    And I Click the Backward button

  Scenario: Veirfy able to Save without Email ID
    Given I Click the New Dealer button
    And I Enter the Dealer Name
    #And I Clear the Email ID
    #Then Check Enter Valid Email ID Error is Displayed
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Authenticate button
    #And I Click the Confirm Password
    And I Enter the Phone Number
    And I Select the Zoho Code
    And I Select the Commission Type as Amount
    And I Enter the Amount
    And I Enter the Back Office URL
    And I Enter the Purchase URL
    And I Enter the Support URL
    And I Enter the Support Phone Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    And I Click the Backward button

  Scenario: Veirfy the Phone Number validation message in Phone Number Column
    Given I Click the New Dealer button
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Authenticate button
    And I Click the Confirm Password
    And I Enter the Invalid Phone Number below Ten digits
    Then Check Enter Valid Phone Number Phone Number should be contain at least Ten digits Error is Displayed
    And I Select the Zoho Code
    And I Select the Commission Type as Amount
    And I Enter the Amount
    And I Enter the Back Office URL
    And I Enter the Purchase URL
    And I Enter the Support URL
    And I Enter the Support Phone Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    And I Click the Backward button

  Scenario: Veirfy the URL validation message in BackOffice URL
    Given I Click the New Dealer button
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Authenticate button
    And I Click the Confirm Password
    And I Enter the Phone Number
    And I Select the Zoho Code
    And I Select the Commission Type as Amount
    And I Enter the Amount
    And I Enter the Invalid Back Office URL
    Then Check URL must be Valid Error is Displayed
    And I Enter the Purchase URL
    And I Enter the Support URL
    And I Enter the Support Phone Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    And I Click the Backward button

  Scenario: Veirfy the URL validation message in Purchase URL
    Given I Click the New Dealer button
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Authenticate button
    And I Click the Confirm Password
    And I Enter the Phone Number
    And I Select the Zoho Code
    And I Select the Commission Type as Amount
    And I Enter the Amount
    And I Enter the Back Office URL
    And I Enter the Invalid Purchase URL
     Then Check URL must be Valid Error is Displayed
    And I Enter the Support URL
    And I Enter the Support Phone Number
    #And I Click the Save button
     Then Check the Save button is Disabled
    And I Click the Backward button

  Scenario: Veirfy the URL validation message in Support URL
    Given I Click the New Dealer button
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Authenticate button
    And I Click the Confirm Password
    And I Enter the Phone Number
    And I Select the Zoho Code
    And I Select the Commission Type as Amount
    And I Enter the Amount
    And I Enter the Back Office URL
    And I Enter the Purchase URL
    And I Enter the Invalid Support URL
     Then Check URL must be Valid Error is Displayed
    And I Enter the Support Phone Number
    #And I Click the Save button
     Then Check the Save button is Disabled
     And I Click the Backward button

  Scenario: Veirfy the email validation message in Support Phone Number Column
    Given I Click the New Dealer button
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Authenticate button
    And I Click the Confirm Password
    And I Enter the Phone Number
    And I Select the Zoho Code
    And I Select the Commission Type as Amount
    And I Enter the Amount
    And I Enter the Back Office URL
    And I Enter the Purchase URL
    And I Enter the Support URL
    And I Enter the Invalid Support Phone Number
    Then Check Enter Valid Phone Number Phone Number should be contain at least Ten digits Error is Displayed
      Then Check the Save button is Disabled
     And I Click the Backward button

  Scenario: Verify able to Create a New Dealer in Dealer Page
    Given I Click the New Dealer button
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Authenticate button
    #And I Click the Confirm Password
    And I Enter the Phone Number
    And I Select the Zoho Code
    And I Select the Commission Type as Amount
    And I Enter the Amount
    And I Enter the Back Office URL
    And I Enter the Purchase URL
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Click the Save button
    Then I verify the New Dealer Saved or not

  #Scenario: Verify able to create a New Dealer in Delaer Page with Used Zoho code
    #Given I Click the New Dealer button
    #And I Enter the Dealer Name
    #And I Enter the Email ID
    #And I Click the Password
    #And I Enter the New Password
    #And I Enter the Confirm Password
    #And I Click the Authenticate button
    #And I Click the Confirm Password #Confirm Password should get freezed
    #And I Enter the Phone Number
    #And I Select the Zoho Code #used code need to be Selected
    #And I Select the Commission Type as Amount
    #And I Enter the Amount
    #And I Enter the Back Office URL
    #And I Enter the Purchase URL
    #And I Enter the Support URL
    #And I Enter the Support Phone Number
    #And I Click the Save button
    #Then I verify the New Dealer Saved or not #Zoho code already exist

   Scenario: Verify the Update header by Editing Saved Dealer
Given Search and Edit the Dealer
When Verify the Update Dealer Header
  And I Click the Backward button

Scenario: Verify whether we can able to Cancel/Close the Gratuity Update screen
Given Search and Edit the Dealer
  And I Click the Backward button
Then I Verify Dealer Update screen Close or not

 
  Scenario: verify whether able to Update without Name
    Given Search and Edit the Dealer
    And I Clear the Name
    Then Check Please Enter Name Error is Displayed
    Then Check the Update button is Disabled
    And I Click the Backward button

  Scenario: verify whether able to Update without Email ID
    Given Search and Edit the Dealer
    And I Clear the Email ID
    Then Check Enter Valid Email ID Error is Displayed
    Then Check the Update button is Disabled
    And I Click the Backward button

  Scenario: verify whether able to Update without Phone Number
    Given Search and Edit the Dealer
    And I Clear the Phone Number
    Then Check Enter Valid Phone Number Error is Displayed
    Then Check the Update button is Disabled
    And I Click the Backward button

  Scenario: verify whether able to Update with Percentage as 0
    Given Search and Edit the Dealer
    And I Enter the Percentage as Zero
    Then Check the Update button is Disabled
    And I Click the Backward button
    
      Scenario: verify whether able to Update with Percentage above 100
    Given Search and Edit the Dealer
    And I Enter the Percentage above the percentage limit
    Then Check The value should not be more than 100% Error is Displayed
    Then Check the Update button is Disabled
    And I Click the Backward button

  Scenario: verify whether able to Update without Backoffice URL
    Given Search and Edit the Dealer
    And I Clear the Backoffice URL
    Then Check URL must be Valid Error is Displayed
    Then Check the Update button is Disabled
    And I Click the Backward button

  Scenario: verify whether able to Update without Purchase URL
    Given Search and Edit the Dealer
    And I Clear the Purchase URL
    Then Check URL must be Valid Error is Displayed
    Then Check the Update button is Disabled
    And I Click the Backward button

  Scenario: verify whether able to Update without Support URL
    Given Search and Edit the Dealer
    And I Clear the Support URL
    Then Check URL must be Valid Error is Displayed
    Then Check the Update button is Disabled
    And I Click the Backward button

  Scenario: verify whether able to Update without Support Phone Number
    Given Search and Edit the Dealer
    And I Clear the Support Phone Number
    Then Check Enter Valid Phone Number Error is Displayed
    Then Check the Update button is Disabled
    And I Click the Backward button
    
    Scenario: Verify able to Update the Dealer in Dealer Page by Input the Percentage value
     Given Search and Edit the Dealer
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    Then I Click the Authenticate button
    #And I Click the Confirm Password #Confirm Password should get freezed
    And I Enter the Phone Number
    And I Select the Zoho Code 
    And I Select the Commission Type as Percentage
    And I Enter the Amount
    And I Enter the Back Office URL
    And I Enter the Purchase URL
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Click the Update button
    Then I verify the New Dealer Updated or not 

  Scenario: Searching with Special Charcters
    Then Enter Special Characters in Search field and Verify

  Scenario: Verify whether able to Inactivate the Dealer Clicking Cancel/No button
    Given I Search the Dealer and Click the Delete button
    And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Dealer Deleted/Inactivated or not

  Scenario: Verify whether Able to Inactivate the Dealer Clicking Delete/Yes button
    Given I Search the Dealer and Click the Delete button
    And I Click the Delete button
    Then I Verifying the Dealer Deleted or not
    And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Dealer

  Scenario: Verify whether able to Activate the Dealer Clicking Cancel/No button
    Given I Search the Dealer and Click the Active button
    And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Dealer is Activated or not

  Scenario: Verify whether Able to Activate the Dealer Clicking Activate/Yes button
    Given I Search the Dealer and Click the Active button
    And I Click the Activate button
    Then I Verifying the Dealer Activated or not
    And I Click the Active button to navigate Activated screen to Verify Activated Dealer

  Scenario: Verfiy Searched element displaying in Active and Inactive list
    Given Search the Element in Active and InActive List
    
     Scenario: Verify whether able to Creating Duplicate Dealer
    Given I Click the New Dealer button
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Click the Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Authenticate button
    And I Click the Confirm Password 
    And I Enter the Phone Number
    And I Select the Zoho Code
    And I Select the Commission Type as Amount
    And I Enter the Amount
    And I Enter the Back Office URL
    And I Enter the Purchase URL
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Click the Save button
    Then Verify whether the Duplicate Delaer is Saved or not
    
