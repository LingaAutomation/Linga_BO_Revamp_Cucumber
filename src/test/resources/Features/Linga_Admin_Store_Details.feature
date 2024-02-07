@Linga_Admin
@Admin_StoreDetails

Feature: Linga Admin - Store Details
  I am verify the Admin - Store Details module by Add/Edit/Delete/Activate/Duplicate

Scenario:  Opening the Linga Store Details page
Given Open the Linga Store Details home page BaseURL and StoreID
    
Scenario: Verify the Upgrade Account in the Actions button
Then Select Any of the Stores
    
Scenario: Verify the Actions button
Then Check the Actions button is Displayed

Scenario: Verify the Archive in the Actions button
Given Click On Actions button
Then Verify able to navigate to the Archive page
#And I Click the Backward button

#Scenario: Verify the Support in the Actions button
#Given Click On Actions button
  #Then Verify able to navigate to the Support page
  #And I Click the Backward button
  
  Scenario:  Verify whether the Store Details Header is Displayed
Given Verifying the Store Details Header Page

#Scenario: Verify the Login button
  #Then Verify able to navigate to the Linga POS Login page
  #And I Navigate to Linga Admin Store Details Page

Scenario: Verify the Store Details Fields Displayed or not
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
  And Check the Ingenico Toggle is Displayed
  And Check the NMI Tokenization Toggle is Displayed
  And Check the Dejavoo Toggle is Displayed
  And Check the Optomany Toggle is Displayed
  And Check the Vexen Payment Toggle is Displayed
  And Check the Clover Payment Toggle is Displayed
  And Check the Show Dual Price Toggle is Displayed
  And Check the Show Deposit In Sale Recap Toggle is Displayed
  And Check the Oracle PMS Integration Toggle is Displayed
  And Check the Emaar Integration Toggle is Displayed
  And Check the Moneris Toggle is Displayed
  And Check the Digital Gator Toggle is Displayed
  And Check the Check Out Toggle is Displayed
  And Check the Membership Toggle is Displayed
  And Check the Ingenico TR Toggle is Displayed
  And Check the Food Check Toggle is Displayed
  And Check the Mobile Toggle is Displayed
  And Check the Score Toggle is Displayed
  And Check the Evertec Toggle is Displayed
  And Check the Ingenico TR Cash Toggle is Displayed
  And Check the PayPal Toggle is Displayed
  And Check the Venmo Toggle is Displayed
  And Check the LPG Toggle is Displayed
  And Check the PMS Aspire Toggle is Displayed

Scenario: Verify the Include Credit Card Toggle Under Store Settings
  And I Enable Include Credit Card Toggle
  And Verify Store Settings Updated or Not
  And Check the User ID Field is Displayed
  And Check the Encryption Key Field is Displayed
  #And I Click the Change Password button
  #And I Verify the Change Password Header
  #And I Enter Invalid Current Password
  #And I Enter the New Password
  #And I Enter the Confirm Password
  #And I Click the Submit button
  #Then Verify the Current Password is Incorrect or Not

#Scenario: Verify the Include Credit Card Toggle Under Store Settings with Valid Current Password and Invalid Confirm Password
    #Given I Click Change Password
    #And I Enter the Current Password
    #And I Enter the New Password
    #And I Enter the Invalid Confirm Password
    #And I Click the Submit button
    #Then Verify the Confirm Password is Incorrect or Not

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
    And I Enter the Primary URL in Admin StoreDetails
    And I Enter the Confirm Password Givex Admin
    #And I Enter the Secondary URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle with out Entering Primary URL
    And I Enter the User Id GiveX
    And I Enter the New Password In Givex
    And I Enter the Confirm Password Givex Admin
    #And I Enter the Secondary URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle with out Entering Password
    #  And I Enable Give X Gift Card Toggle
    #  Then Verify Store Settings Updated or Not
     And I Enter the User Id GiveX
    And I Enter the Primary URL in Admin StoreDetails
    And I Enter the Confirm Password Givex Admin
    #And I Enter the Secondary URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle with out Entering Confirm Password
   And I Enter the User Id GiveX
    And I Enter the Primary URL in Admin StoreDetails
    And I Enter the New Password In Givex
    #And I Enter the Secondary URL
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify Give X Gift Card Toggle with Invalid confirm Password
    And I Enable Give X Gift Card Toggle
     And I Enter the User Id GiveX
    And I Enter the Primary URL in Admin StoreDetails
    And I Enter the New Password In Givex
    And I Enter the Invalid Confirm Password in Admin StoreDetails
    Then Verify the Confirm Password is Incorrect or Not
    Then Check the Update button is Disabled in Store Details 

  Scenario: Verify Give X Gift Card Toggle by entering all the fields with valid confirm Password
    And I Enter the User Id GiveX
    And I Enter the Primary URL in Admin StoreDetails
    And I Enter the New Password In Givex
    And I Enter the Confirm Password Givex Admin
    #And I Enter the Secondary URL
    And I Click the update button GiveX Card
    Then Verify Store Settings Updated or Not
    When I Disable the Give X Gift Card Toggle
    Then Verify Store Settings Updated or Not

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
    And I Click the Update button MPPG CreditCard Admin
    Then Verify MagTek Test account updated or Not

  Scenario: Verify the MPPG Credit Card Toggle By Enabling Account Toggle and Selecting Payment Gateway as FDMS
    And I Enter the Customer Code
    And I Enter the User Name
    And I Select the Payment Gateway as FDMS
    And I Enter the Password MPPG
    And I Enter the MCC
    And I Click the Update button MPPG CreditCard Admin
    Then Verify MagTek Test account updated or Not

  Scenario: Verify the MPPG Credit Card Toggle By Enabling Account Toggle and Selecting Payment Gateway as World Pay
    And I Enter the Customer Code
    And I Enter the User Name
    And I Select the Payment Gateway as World Pay
    And I Enter the Password MPPG
    And I Enter the MCC
    And I Click the Update button MPPG CreditCard Admin
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
    Then Verify Store Settings Updated or Not

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
    And I Click the Update button In Optomany Admin
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
    And I Click the Update button Vexen Payment
    Then Verify Store Settings Updated or Not
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
    And I Click the Update button in SaleRecap Report
    Then Verify Store Settings Updated or Not
    And I Disable the Show Deposit In Sale Recap Toggle
    Then Verify Store Settings Updated or Not

Scenario: Verify the Oracle PMS Integration Toggle without entering Port number
  And I Enable the Oracle PMS Integration Toggle
  Then Verify Store Settings Updated or Not
  And I Enter the IP Address
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the Oracle PMS Integration Toggle without entering IP Address
  And I clear the Ip Address
  And I Enter the Port Number
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the Oracle PMS Integration Toggle by entering all the details
  Given I Enter the IP Address
  And I Enter the Port Number
  And I Click the Update button Oracle PMS
  Then Verify Store Settings Updated or Not
  And I Disable the Oracle PMS Integration Toggle
  Then Verify Store Settings Updated or Not

Scenario: Verify the Emaar Integration Toggle without entering X-API-Key
  Given I Enter the Unit No
  And I Enter the Lease Code
  Then Check the Save button is Disabled

Scenario: Verify the Emaar Integration Toggle without entering Unit No
  Given I Enter the X-API-Key
  And I Enter the Lease Code
  Then Check the Save button is Disabled

Scenario: Verify the Emaar Integration Toggle without entering Lease Code
  Given I Enter the X-API-Key
  And I Enter the Unit No
  Then Check the Save button is Disabled

Scenario: Verify the Emaar Integration Toggle by entering all the details
  Given I Enter the X-API-Key
  And I Enter the Unit No
  And I Enter the Lease Code
  Then I Click the Save button in Emaar
  Then Verify Emaar Credentials Saved or Not

Scenario: Verify the Moneris Toggle
  And I Enable the Moneris Toggle
  Then Verify Store Settings Updated or Not
  And I Disable the Moneris Toggle
  Then Verify Store Settings Updated or Not

Scenario: Verify the Digital Gator Toggle without entering Bid
  And I Enable the Digital Gator Toggle
  Then Verify Store Settings Updated or Not
  And I Enable SMS Configuration Toggle
  And I Enter the SMS Review Template ID
  And I Enter the Email Review Template ID
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the Digital Gator Toggle without entering SMS Review Template ID
  And I Enter the Bid
  And I Enter the Email Review Template ID
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the Digital Gator Toggle without entering Email Review Template ID
  And I Enter the Bid
  And I Enter the SMS Review Template ID
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the Digital Gator Toggle by entering all the details
  And I Disable SMS Configuration Toggle
  And I Enter the Bid
  And I Enter the SMS Review Template ID
  And I Enter the Email Review Template ID
  And I Click the update button in Digital Gator
  Then Verify Store Settings Updated or Not
  And I Disable the Digital Gator Toggle
  Then Verify Store Settings Updated or Not

Scenario: Verify the Check Out Toggle
  And I Enable the Check Out Toggle
  Then Verify Store Settings Updated or Not
  And I Disable the Check Out Toggle
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

  Scenario: Verify the Evertec Toggle
    And I Enable the Evertec Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Evertec Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the Ingenico TR Cash Toggle
    And I Enable the Ingenico TR Cash Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the Ingenico TR Cash Toggle
    Then Verify Store Settings Updated or Not

  Scenario: Verify the PayPal Toggle
    And I Enable the PayPal Toggle
    Then Verify Store Settings Updated or Not
    And I Disable the PayPal Toggle
    Then Verify Store Settings Updated or Not

Scenario: Verify the Venmo Toggle without entering Percentage
  And I Enable the Venmo Toggle
  Then Verify Store Settings Updated or Not
  And I Enter the Amount
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the Venmo Toggle without entering Amount
  And I Clear the Percentage in Venmo
  And I Enter the Amount
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the Venmo Toggle by entering all the Details
  And I Enter the Percentage in Venmo
  And I Enter the Amount
  And I Click the Update button in Venmo
  Then Verify Store Settings Updated or Not

Scenario: Verify the LPG Toggle by selecting Environment as Staging and Without Entering RNID
  Given I Enable the LPG Toggle
  And I Select the Environment as Staging
  And I Enter the RNCERT
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the LPG Toggle by selecting Environment as Staging and Without Entering RNCERT
  And I Clear the RNCERT
  And I Enter the RNID
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the LPG Toggle by selecting Environment as Staging and entering all details
  And I Enter the RNID
  And I Enter the RNCERT
  And I Click the Update button in LPG
  Then Verify Store Settings Updated or Not

  Scenario: Verify the LPG Toggle by selecting Environment as Production and Without Entering RNID
    Given I Enable the LPG Toggle
    And I Select the Environment as Production
    And I Enter the RNCERT
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify the LPG Toggle by selecting Environment as Production and Without Entering RNCERT
    And I Clear the RNCERT
    And I Enter the RNID
    Then Check the Update button is Disabled in Store Details

  Scenario: Verify the LPG Toggle by selecting Environment as Production and entering all details
    And I Enter the RNID
    And I Enter the RNCERT
     And I Click the Update button in LPG
    Then Verify Store Settings Updated or Not
    And I Disable the LPG Toggle
    Then Verify Store Settings Updated or Not

Scenario: Verify PMS Aspire Toggle without Entering Url
  And I Enable the PMS Aspire Toggle
  And I Enter the Property Id
  And I Enter the Ocp-Apim-subscription-Key
  Then Check the Update button is Disabled in Store Details

Scenario: Verify PMS Aspire Toggle without Entering Property Id
  And I Enter the Url
  And I Enter the Ocp-Apim-subscription-Key
  Then Check the Update button is Disabled in Store Details

Scenario: Verify PMS Aspire Toggle without Entering Ocp-Apim-subscription-Key
  And I Enter the Url
  And I Enter the Property Id
  Then Check the Update button is Disabled in Store Details

Scenario: Verify PMS Aspire Toggle with all the details
  And I Enter the Url
  And I Enter the Property Id
  And I Enter the Ocp-Apim-subscription-Key
  Then Verify Store Settings Updated or Not
  And I Disable the PMS Aspire Toggle
  Then Verify Store Settings Updated or Not

Scenario: Verify the ArchiveDB Information without entering AWS Access Key ID
  And I Enable ArchiveDB Is Active Toggle
  And I Enter the AWS Secret Access Key
  And I Enter the AWS Region
  And I Enter the AWS S3 Bucket
  And I Enter the AWS S3 Storage Class
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the ArchiveDB Information without entering AWS Secret Access Key
  And I Enter the AWS Access Key ID
  And I Enter the AWS Region
  And I Enter the AWS S3 Bucket
  And I Enter the AWS S3 Storage Class
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the ArchiveDB Information without entering AWS Region
  And I Enter the AWS Access Key ID
  And I Enter the AWS Secret Access Key
  And I Enter the AWS S3 Bucket
  And I Enter the AWS S3 Storage Class
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the ArchiveDB Information without entering AWS S3 Bucket
  And I Enter the AWS Access Key ID
  And I Enter the AWS Secret Access Key
  And I Enter the AWS Region
  And I Enter the AWS S3 Storage Class
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the ArchiveDB Information without entering AWS S3 Storage Class
  And I Enter the AWS Access Key ID
  And I Enter the AWS Secret Access Key
  And I Enter the AWS Region
  And I Enter the AWS S3 Bucket
  Then Check the Update button is Disabled in Store Details

Scenario: Verify the ArchiveDB Information by entering all the details
  And I Disable ArchiveDB Is Active Toggle
  And I Enter the AWS Access Key ID
  And I Enter the AWS Secret Access Key
  And I Enter the AWS Region
  And I Enter the AWS S3 Bucket
  And I Enter the AWS S3 Storage Class
  And I Click the Update button in ArchiveDB
  Then Verify Store Settings Updated or Not

Scenario: Verify the Generate button under DB Information
  And I Click the Genarate button
#  Then Verify the Account Info Retrived successfully or not
  And Verify the Sale Count Size
  And Verify the DB Size











