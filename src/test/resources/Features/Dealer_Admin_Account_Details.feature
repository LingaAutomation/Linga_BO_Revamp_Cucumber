@Dealer_Admin
@Dealer_Admin_AccountDetails


Feature:: Dealer Admin - Account Details
  I am verify the Dealer - Account Details module by Add/Edit/Delete/Activate/Duplicate

 Scenario: Opening the Dealer Admin - Dashboard page
  Given Open the Dealer Admin - Dashboard BaseURL and StoreID

Scenario: Verify whether the Account Details Header is Displayed
And Select Any of the Stores
  Given Verifying the Account Details Header Page

Scenario: Verify the Actions button
  Then Check the Actions button is Displayed

Scenario: Verify the Upgrade Account in the Actions button
And Click On Actions button
  When Verify able to navigate to the Upgrade Account page
  And I Navigate the Page to Back

Scenario: Verify the Show Stores in the Actions button
And Click On Actions button
  When Verify able to navigate to the Show Stores page
  And I Navigate the Page to Back

Scenario: Verify the Login button
#And I Click the Login button
  When Verify able to navigate to the Dealer Login page
  #And I Navigate to Dealer Admin Account Details Page
  Then Verify wether the Stores Page Opened or not

Scenario: Verify the Account Details Fields Displayed or not
    And Check the Account Name Field is Displayed
    And Check the Phone Number Field is Displayed
    And Check the Email ID Field is Displayed
    And Check the Store Address Field is Displayed
    #And Check the Accounts Field is Displayed
    And I Select the Account
    And I Click the Save button
    Then Verify Account Linked or Not
    And Check the Dealer Field is Displayed
    And I Select the Dealer
    And I Click the Save button
    Then Verify Dealer Mapped or Not

Scenario: Verify the Plan Details Fields Displayed or not
    And Check the Plan Field is Displayed
    And Check the License Field is Displayed
    And Check the Stores Active Inactive Field is Displayed
    And Check the Date Created Field is Displayed
    And Check the Last POS Access Date Field is Displayed
    And Check the Features Screen Field is Displayed
    And Check the POS Licenses Screen Field is Displayed

Scenario: Verify the Account Settings Fields Displayed or not
  And Check the Account Level Gift Card Toggle is Displayed
  And Check the Account Level House Account Toggle is Displayed

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

Scenario: Verify the Generate button under DB Information
  And I Click the Genarate button
  Then Verify the Account Info Retrived successfully or not
  And Check the Sale Count Size field is Displayed
  And Check the DB Size field is Displayed



