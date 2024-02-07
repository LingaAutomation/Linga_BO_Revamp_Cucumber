@Dealer_Admin
@Dealer_StoreDetails
Feature: Dealer - Store Details
  I am verify the Dealer - Announcement module by Add/Edit/Delete/Activate/Duplicate

  Scenario: Opening the Dealer Admin - Dashboard page
   Given Open the Dealer Admin - Dashboard BaseURL and StoreID
    
Scenario: Verify the Upgrade Account in the Actions button
Then Select Any of the Stores
    
Scenario: Verify the Actions button
Then Check the Actions button is Displayed

  Scenario: Verify whether the Store Details Header is Displayed
    Given Verifying the Dealer Admin - Store Details Header Page


  Scenario: Verify the Store Details Fields Displayed or not
    #Given Verify the Account name field is present
    And Check the Store Name Field is Displayed
    And Check the Phone Number Field is Displayed
    And Check the Email ID Field is Displayed
    And Check the Date Created Field is Displayed
    And Check the Last Menu Modified Date Field is Displayed
    And Check the Last Ipad Access Date Field is Displayed
    And Check the Store Address Field is Displayed In StoreDetails

  Scenario: Verify the Subscription Detail
    And Check the Features Screen Field is Displayed
    And Check the POS Licenses Screen Field is Displayed

  Scenario: Verify the Store Settings Fields Displayed or not
    And Check the Include Credit Card Toggle is Displayed
    And Check the Include Gift Card Toggle is Displayed
    And Check the Enable Multiple Cash Tenders Toggle is Displayed
    And Check the Enable Other Payment Options Toggle is Displayed
    And Check the EMV Settings Toggle is Displayed
    And Check the Give X Gift Card Toggle is Displayed
    And Check the House Account Toggle is Displayed
    And Check the MPPG Credit Card Toggle is Displayed
    And Check the NMI Tokenization Toggle is Displayed
    And Check the Dejavoo Toggle is Displayed
    And Check the Optomany Toggle is Displayed
    And Check the Vexen Payment Toggle is Displayed
    And Check the Clover Payment Toggle is Displayed
    And Check the Show Dual Price Toggle is Displayed
    And Check the Show Deposit In Sale Recap Toggle is Displayed
    And Check the Membership Toggle is Displayed
    And Check the Ingenico TR Toggle is Displayed
    And Check the Food Check Toggle is Displayed
    And Check the Mobile Toggle is Displayed
    And Check the Score Toggle is Displayed

  Scenario: Verify the Include Credit Card Toggle Under Store Settings
    And I Enable Include Credit Card Toggle
    And Verify Store Settings Updated or Not
    And Check the User ID Field is Displayed
    And Check the Encryption Key Field is Displayed
    And I Click the Change Password button
    And I Verify the Change Password Header
    And I Enter Invalid Current Password
    And I Enter the New Password
    And I Enter the Confirm Password
    And I Click the Submit button
    Then Verify the Current Password is Incorrect or Not

  Scenario: Verify the Include Credit Card Toggle Under Store Settings with Valid Current Password and Invalid Confirm Password
    Given I Click the Change Password button
    And I Enter the Current Password
    And I Enter the New Password
    And I Enter the Invalid Confirm Password
    And I Click the Submit button
    Then Verify the Confirm Password is Incorrect or Not

  #Scenario: Verify the Include Credit Card Toggle Under Store Settings with Valid Password Details
  #Given I Click Change Password
  #And I Enter the Current Password
  #And I Enter the New Password
  #And I Enter the Confirm Password
  #And I Click the Submit button
  #Then Verify Store Settings Updated or Not
  #And I Disable Include Credit Card Toggle
  #Then Verify Store Settings Updated or Not
  Scenario: Verify the Include Gift Card Toggle Under Store Settings
    And I Enable Include Gift Card Toggle
    Then Verify Store Settings Updated or Not
    And I Disable Include Gift Card Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Enable Multiple Cash Tenders Toggle Under Store Settings
    And I Enable the Enable Multiple Cash Tenders Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Enable Multiple Cash Tenders Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Enable Other Payment Options Toggle Under Store Settings
    And I Enable the Enable Other Payment Options Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Enable Other Payment Options Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify EMV Toggle under EMV Settings
    And I Disable the EMV Toggle
    And I Enable the EMV Toggle
    Then Verify Store Settings Updated or Not
    Then Check the Castle and Go Toggle is Enabled
    Then Check the SPPax is Enabled
    And I Enable the Castle and Go Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Castle and Go Toggle
    Then Verify Store Settings Updated or Not
    And I Enable the SPPax Toggle
    Then Verify Store Settings Updated or Not
    Then Check Serial number should be contain atleast 8 digits Error Message is Displayed
    And I Enter the Serial Number
    And I Disable the SPPax Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the EMV Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify Give X Gift Card Toggle with out Entering User Id
    And I Enable Give X Gift Card Toggle
    Then Verify Store Settings Updated or Not
    And I Enter the Primary URL
    And I Enter the Confirm Password Givex
    #And I Enter the Secondary URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle with out Entering Primary URL
    And I Enter the User Id GiveX
    And I Enter the New Password In Givex
    And I Enter the Confirm Password Givex
    #And I Enter the Secondary URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle with out Entering Password
    #  And I Enable Give X Gift Card Toggle
    #  Then Verify Store Settings Updated or Not
     And I Enter the User Id GiveX
    And I Enter the Primary URL
    And I Enter the Confirm Password Givex
    #And I Enter the Secondary URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle with out Entering Confirm Password
   And I Enter the User Id GiveX
    And I Enter the Primary URL
    And I Enter the New Password In Givex
    #And I Enter the Secondary URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle with Invalid confirm Password
    And I Enable Give X Gift Card Toggle
     And I Enter the User Id GiveX
    And I Enter the Primary URL
    And I Enter the New Password In Givex
    And I Enter the Invalid Confirm Password in GiveX
    Then Verify the Confirm Password is Incorrect or Not
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle by entering all the fields with valid confirm Password
    And I Enter the User Id GiveX
    And I Enter the Primary URL
    And I Enter the New Password In Givex
    And I Enter the Confirm Password Givex
    #And I Enter the Secondary URL
    And I Click the update button GiveX Card
    Then Verify Store Settings Updated or Not
    When I Disable the Give X Gift Card Toggle
    Then Verify Store Settings Updated or Not

  #Scenario: Verify Give X Gift Card Toggle Without Entering Secondary URL
  #When I Enter the User Id
  #And I Enter the Primary URL
  #And I Enter the Password
  #And I Enter the Confirm Password
  #And I Click the update button
  #Then Verify Store Settings Updated or Not
  #Scenario: Verify Give X Gift Card Toggle by Disabling toggle and Enabling to the check the data cleared or not
  #When I Disable the Give X Gift Card Toggle
  #Then Verify Store Settings Updated or Not
  #And I Enable the Give X Gift Card Toggle
  #Then Verify Store Settings Updated or Not
  #And I verify the Data
  Scenario: Verify the House Account Toggle
    And I Enable the House Account Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the House Account Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the MPPG Credit Card Toggle By Enabling Account Toggle and Selecting Payment Gateway as TSYS
    And I Enable the MPPG Credit Card Toggle
    Then Verify Store Settings Updated or Not
    And I Enable Account Toggle
    Then Verify MagTek Test account updated or Not
    And I Enter the Customer Code
    And I Enter the User Name
    And I Select the Payment Gateway as TSYS
    And I Enter the Password MPPG
    And I Enter the MCC
    And I Click the Update button MPPG CreditCard
    Then Verify MagTek Test account updated or Not

  Scenario: Verify the MPPG Credit Card Toggle By Enabling Account Toggle and Selecting Payment Gateway as FDMS
    And I Enter the Customer Code
    And I Enter the User Name
    And I Select the Payment Gateway as FDMS
    And I Enter the Password MPPG
    And I Enter the MCC
    And I Click the Update button MPPG CreditCard
    Then Verify MagTek Test account updated or Not

  Scenario: Verify the MPPG Credit Card Toggle By Enabling Account Toggle and Selecting Payment Gateway as World Pay
    And I Enter the Customer Code
    And I Enter the User Name
    And I Select the Payment Gateway as World Pay
    And I Enter the Password MPPG
    And I Enter the MCC
    And I Click the Update button MPPG CreditCard
    Then Verify MagTek Test account updated or Not

  Scenario: Verify the MPPG Credit Card Toggle By disabling Account Toggle and disabling MPPG Credit Card Toggle
    Given I Disable Account Toggle
    Then Verify MagTek Test account updated or Not
    And I Disable the MPPG Credit Card Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Ingenico Toggle
    And I Enable the Ingenico Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Ingenico Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the NMI Tokenization Toggle
    And I Enable the NMI Tokenization Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the NMI Tokenization Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Dejavoo Toggle
    And I Enable the Dejavoo Toggle
    Then Verify Store Settings Updated or Not
    And I Enter the Spin Cloud URL
    And I Click the Update button InDejavoo
    Then Verify Store Settings Updated or Not
    And I Disable the Dejavoo Toggle
    Then Verify Dejavoo Settings Updated or Not

  Scenario: Verify the Optomany Toggle with Out Entering Merchant Id
    And I Enable the Optomany Toggle
    And I Enter the User Name
    And I Enter the Password
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify the Optomany Toggle with Out Entering User Name
    #  And I Enable the Optomany Toggle
And I Enter the Merchant Id
And I Enter the Password
Then Check the Update button is Disabled in Store Details
   

  Scenario: Verify the Optomany Toggle with Out Entering Password
    And I Enter the Merchant Id
    And I Enter the User Name
    Then Check the Update button is Disabled in Store Details
    #Then Verify Store Settings Updated or Not

  Scenario: Verify the Optomany Toggle
    And I Enable the Optomany Toggle
    And I Enter the Merchant Id
    And I Enter the User Name
    And I Enter the Password
    And I Click the Update button In Optomany
    Then Verify Optomany Settings Updated or Not
    And I Disable the Optomany Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Vexen Payment Toggle without entering Provision URL
    And I Enable the Vexen Payment Toggle
    Then Verify Store Settings Updated or Not
    And I Enter the Site Id
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify the Vexen Payment Toggle without entering Site Id
    Given I Clear the Site Id
    And I Enter the Provision URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify the Vexen Payment Toggle by entering all the details
    Given I Enter the Provision URL
    And I Enter the Site Id
    And I Click the Update button In Vexen Payment
    Then Verify Vexen Settings Updated or Not
    And I Disable the Vexen Payment Toggle
    Then Verify Store Settings Updated or Not
    
    

  Scenario: Verify the Clover Payment Toggle
    And I Enable the Clover Payment Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Clover Payment Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Show Dual Price Toggle
    And I Enable the Show Dual Price Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Show Dual Price Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Show Deposit In Sale Recap Toggle with out entering percentage
    And I Enable the Show Deposit In Sale Recap Toggle
    And I Clear the Percentage
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify the Show Deposit In Sale Recap Toggle by entering Percentage
    #And I Enable the Show Deposit In Sale Recap Toggle
    And I Enter the Percentage
    And I Click the Update button
    Then Verify Store Settings Updated or Not
    And I Disable the Show Deposit In Sale Recap Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Membership Toggle
    And I Enable the Membership Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Membership Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Ingenico TR Toggle
    And I Enable the Ingenico TR Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Ingenico TR Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Food Check Toggle
    And I Enable the Food Check Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Food Check Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Mobile Toggle
    And I Enable the Mobile Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Mobile Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Score Toggle
    And I Enable the Score Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Score Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Generate button under DB Information
    And I Click the Genarate button
    Then Verify the Account Info Retrived successfully or not
   And Check the Sale Count Size field is Displayed
   And Check the DB Size field is Displayed
