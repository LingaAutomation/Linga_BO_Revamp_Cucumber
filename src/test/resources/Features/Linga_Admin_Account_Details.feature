@Linga_Admin
@Linga_AccountDetails


Feature: Linga Admin - Account Details
  I am verify the Linga Admin - Account Details module 

Background: Opening the Linga Account Details page
    Given Open the Linga Account Details home page BaseURL and StoreID

Scenario: Verify whether the Account Details Header is Displayed
    Given Verifying the Account Details Header Page

Scenario: Verify the Actions buttons
  Then Check the Actions button is Displayed

Scenario: Verify the Upgrade Account in the Actions button
  Then Verify able to navigate to the Upgrade Account page
  And I Click the Backward button

Scenario: Verify the Show Stores in the Actions button
  Then Verify able to navigate to the Show Stores page
  And I Click the Backward button

Scenario: Verify the Archive in the Actions button
  Then Verify able to navigate to the Archive page
  And I Click the Backward button

Scenario: Verify the Inactivate in the Actions button
  Then Verify able to navigate to the Inactivate page
  And I Click the Backward button

Scenario: Verify the Login button
  Then Verify able to navigate to the Linga POS Login page
  And I Navigate to Linga Admin Account Details Page

Scenario: Verify the Account Details Fields Displayed or not
  #Given Verify the Account name field is present
  And Check the Account Name Field is Displayed
  And Check the Phone Number Field is Displayed
 And Check the Email ID Field is Displayed
 And Check the Store Address Field is Displayed
And Check the Link Account Field is Displayed
 And Check the Dealer Field is Displayed
 
 Scenario: Verify the Plan Details Fields Displayed or not
  And Check the Plan Field is Displayed
  And Check the License Field is Displayed
 And Check the Stores Active Inactive Field is Displayed
 And Check the Date Created Field is Displayed
And Check the Last POS Access Date Field is Displayed
 And Check the Dealer Field is Displayed
 
  Scenario: Verify the Subscription Details Fields Displayed or not
  And Check the Subscription ID Field is Displayed
  And Check the Customer ID Field is Displayed
 And Check the Zoho Subscription Email Field is Displayed
 And Check the Features Screen Field is Displayed
And Check the POS Licenses Screen Field is Displayed

  Scenario: Verify the Account Settings Fields Displayed or not
  And Check the Account Level Gift Card Toggle is Displayed
  And Check the Account Level House Account Toggle is Displayed
 And Check the Enable Net Suite Integration Toggle is Displayed
 And Check the Disable Marketing Toggle is Displayed
And Check the Is FTP Enabled Toggle is Displayed
And Check the Enable New Theme Toggle is Displayed

Scenario: Verify Account Level Gift Card Toggle
  And I Enable Account Level Gift Card Toggle
  Then Verify the Account Settings Updated or Not
  And I Disable Account Level Gift Card Toggle
  Then Verify the Account Settings Updated or Not
  

Scenario: Verify Account Level House Account Toggle
  And I Enable Account Level House Account Toggle
  Then Verify the Account Settings Updated or Not
  And I Disable Account Level House Account Toggle
  Then Verify the Account Settings Updated or Not
  

Scenario: Verify Enable Net Suite Integration Toggle
  And I Enable Enable Net Suite Integration Toggle
    Then Verify the Account Settings Updated or Not
  And I Disable Enable Net Suite Integration Toggle
    Then Verify the Account Settings Updated or Not
  

Scenario: Verify Disable Marketing  Toggle
  And I Enable Disable Marketing Toggle
    Then Verify the Account Settings Updated or Not
  And I Disable Disable Marketing Toggle
    Then Verify the Account Settings Updated or Not
    
 Scenario: Verify Is FTP Enabled Toggle without Host Name
  Given I Enable Is FTP Enabled Toggle
  And I Enter the Port
  And I Enter the User Name
  And I Enter the Password
  Then Check the Save button is Disabled 

Scenario: Verify Is FTP Enabled Toggle without Port
  Given I Enable Is FTP Enabled Toggle
  And I Enter the Host Name
  And I Enter the User Name
  And I Enter the Password
  Then Check the Save button is Disabled 

Scenario: Verify Is FTP Enabled Toggle without User Name
  Given I Enable Is FTP Enabled Toggle
  And I Enter the Host Name
  And I Enter the Port
  And I Enter the Password
  Then Check the Save button is Disabled
  
  Scenario: Verify Is FTP Enabled Toggle without Password
  Given I Enable Is FTP Enabled Toggle
  And I Enter the Host Name
  And I Enter the Port
  And I Enter the User Name
  Then Check the Save button is Disabled
  
Scenario: Verify Is FTP Enabled Toggle With all the fields
  Given I Enable Is FTP Enabled Toggle
  And I Enter the Host Name
  And I Enter the Port
  And I Enter the User Name
  And I Enter the Password
  And I Click the Save button
  Then Verify the Account Settings Updated or Not
  And I Disable Is FTP Enabled Toggle

Scenario: Verify Enable New Theme Toggle
  And I Enable Enable New Theme Toggle
  Then Verify the Account Settings Updated or Not
  And I Disable Enable New Theme Toggle
  Then Verify the Account Settings Updated or Not

Scenario: Verify the Generate button under DB Information
	And I Click the Genarate button
  Then Verify the Account Info Retrived successfully or not
  And Check the Sale Count Size field is Displayed
  And Check the DB Size field is Displayed
  
Scenario: Verify able to Save by entering only Client ID in Mail Chimp Details
  And I Enter the Client ID
  And I Clear the Client Secret
  Then Check the Save button is Disabled

Scenario:  Verify able to Save by entering only Client Secret in Mail Chimp Details
   And I Clear the Client ID
  And I Enter the Client Secret
  Then Check the Save button is Disabled

Scenario: Verify able to Save By entering both Client ID and Client Secret in Mail Chimp Details
   And I Enter the Client ID
  And I Enter the Client Secret
  And I Click the Save button
  Then Verify Mail Chimp Details Saved or Not


#31

















