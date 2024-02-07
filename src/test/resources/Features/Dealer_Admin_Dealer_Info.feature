@Dealer_Admin 
@Dealer_Admin_Dealer_Info
Feature: Dealer Admin - Dealer Info
  I am verify the Delaer Admin - Dealer Info module by Adding/Removing the Mandatory Details

  #Scenario: Login to the Application
  #Given Open the Browser and Enter URL
  #When I Select the Store after Login to Application when Enter Username and Passowrd
  Background: Open the Dealer Admin - Dealer Info page in Linga Admin
    Given Open the Dealer Admin - Dealer Info home page BaseURL and StoreID

  Scenario: Verify whether the Dealer Admin - Dealer Info Header is Displayed
    Given Verifying the Dealers Headers Page

  Scenario: Verify Dealer Admin - Dealer Info Home Path
    Given Verifying the Dealer Admin Dealer Info Homepath

  Scenario: Verify able to Save without Name
  And I Select the Dealer Info Tab
    #And I Enter the Dealer Name
    And I Clear the Name
    #Then Check Enter Valid Email ID Error is Displayed
    And I Enter the Email ID
    And I Enter the Phone Number
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Enter the Purchase URL
    And I Enter the Back Office URL
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled

  Scenario: Verify able to Save without Email
    And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Clear the Email ID
    And I Enter the Phone Number
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Enter the Purchase URL
    And I Enter the Back Office URL
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    
      Scenario: Verify able to Save with Invalid Email ID
    And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Enter the Invalid Email ID
    Then Check Enter Valid Email ID Error is Displayed
    And I Enter the Phone Number
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Enter the Purchase URL
    And I Enter the Back Office URL
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled

  Scenario: Verify able to Save without Phone Number
    And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Clear the Phone Number
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Enter the Purchase URL
    And I Enter the Back Office URL
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    
    
      Scenario: Verify able to Save with Invalid Phone Number
    And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Enter the Invalid Phone Number below Six digits
    Then Check Enter Valid Phone Number Phone Number should be contain at least Six digits Error is Displayed
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Enter the Purchase URL
    And I Enter the Back Office URL
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    
      Scenario: Verify able to Save without Support Phone Number
    And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Enter the Phone Number
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Clear the Support Phone Number
    And I Enter the Purchase URL
    And I Enter the Back Office URL
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    
      Scenario: Verify able to Save with Invalid Support Phone Number
    And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Enter the Phone Number
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Enter the Invalid Support Phone Number below Six digits
    Then Check Enter Valid Phone Number Phone Number should be contain at least Six digits Error is Displayed
    And I Enter the Purchase URL
    And I Enter the Back Office URL
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    

  #Scenario: Veirfy the URL validation message in Support URL
 #And I Select the Dealer Info Tab
    #And I Enter the Dealer Name
    #And I Enter the Email ID
    #And I Enetr the Phone Number
    #And I Enter the Invalid Support URL
    #Then Check URL must be Valid Error is Displayed
    #And I Enter the Purchase URL
    #And I Enter the Back Office URL
    #Then I click the SMTP INFO Page
    #And I Enter the User Name
    #And I Enter the Password
    #And I Enter the Server Details
    #And I Enter the from Details
    #And I Enter the Port Number
    #And I Click the Save button
    #Then Check the Save button is Disabled

  Scenario: Veirfy able to Save without Purchase URL
    And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Enter the Phone Number
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Clear the Purchase URL
    #Then Check URL must be Valid Error is Displayed
    And I Enter the Back Office URL
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled

    Scenario: Veirfy able to Save without Back Office URL
    And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Enter the Phone Number
    And I Enter the Address Line1
    And I Enter the Address Line2
    And I Enter the City
    And I Enter the State
    And I Enter the Zip Code
    And I Enter the Country
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Enter the Purchase URL
    And I Clear the Back Office URL
    #Then Check URL must be Valid Error is Displayed
    Then Check the Save button is Disabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled
    
  Scenario: Verify able to Save without User Name in the SMTP INFO
    And I Select the SMTP Info Tab
    And I Clear the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled

  Scenario: Verify able to Save without Password in the SMTP INFO
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Clear the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled

  Scenario: Verify able to Save without Server in the SMTP INFO
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Clear the Server
    And I Enter the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled

  Scenario: Verify able to Save without From details in the SMTP INFO
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Clear the From
    And I Enter the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled

  Scenario: Verify able to Save without Port Number in the SMTP INFO
And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Clear the Port Number
    #And I Click the Save button
    Then Check the Save button is Disabled

      Scenario: Verify able to save Dealer Info page with entering all the mandatory fields
      And I Select the Dealer Info Tab
    And I Enter the Dealer Name
    And I Enter the Email ID
    And I Enter the Phone Number
    And I Enter the Support URL
    And I Enter the Support Phone Number
    And I Enter the Purchase URL
    And I Enter the Back Office URL
    Then Check the Save button is Enabled
    And I Select the SMTP Info Tab
    And I Enter the User Name
    And I Enter the Password
    And I Enter the Server
    And I Enter the From
    And I Enter the Port Number
    And I Click the Save button
    Then Verify whether the Dealer Info Updated or Not
    
    
Scenario: Verify able to Upload the Images
And I Upload the Image for BO Login Screen Icon
And I Upload the Image for BO Application Icon
And I Upload the Image for Admin Page Logo
And I Upload the Image for Web Browser Tab Icon
And I Upload the Image for Dealer POS Screen Icon
And I Upload the Image for Web POS Login Page
