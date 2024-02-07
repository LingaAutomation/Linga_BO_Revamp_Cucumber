@Dealer_Admin 
@Dealer_Admin_DashBoard

Feature: DealerAdmin - DashBoard
  I am verify the Dealer Admin - DashBoard module by Add/Edit/Delete/Activate/Duplicate

  Background: Opening the Dealer Admin - Dashboard page
  Given Open the Dealer Admin - Dashboard BaseURL and StoreID
  
  Scenario: Verify whether the Dashboard Header is Displayed
  Then Verifying the Dashboard Header Page

  #Scenario: Verify Home Path
    #Given Verifying the Homepath

  Scenario: Verify the Dashboard Tiles in Dealer is Displayed
    And Check the Core/Basic Plan Tile is Displayed
    And Check the Pro Plan Tile is Displayed
    And Check the Enterprise Plan Tile is Displayed
    And Check Sales_Last2Days Tile is Displayed
    And Check Sales_Last2to7Days Tile is Displayed
    And Check Sales_Last7to30Days Tile is Displayed
    And Check Sales_Over from Last30Days Tile is Displayed

  #Core/Basic Plan
  Scenario: Verify able to search the Coursing by entering 3 letters of Core/Basic Plan
    And I Select the Core/Basic Plan Tile
    And I Verify Searching the Item when entering three letters

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify I able to extract the report by using export option
  #And I Click the Export button
  #Then I Click the save #exported file will get saved
  Scenario: Verify I able to Enable the Show Upgrade toggle in Core/Basic Plan
    And I Verify Searching the Item and Enable the Show Upgrade
    Then Verify Upgrade Enabled Successfully

  Scenario: Verify I able to Enable the Show Upgrade toggle in Core/Basic Plan
    And I Verify Searching the Item and Disable the Show Upgrade
    Then Verify Upgrade Disabled Successfully

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Verify I able to do Bulk Update Version with No
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the No button

  Scenario: Verify I able to do Bulk Update Version with Yes
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the Yes button
    Then Verify the Updated Successfully or not

  #Pro Plan
  Scenario: Verify able to search the Coursing by entering 3 letters of Pro Plan
    And I Select the Core/Basic Plan Tile
    And I Verify Searching the Item when entering three letters

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify I able to extract the report by using export option
  #And I Click the Export button
  #Then I Click the save #exported file will get saved
  Scenario: Verify I able to Enable the Show Upgrade toggle in Pro Plan
    And I Verify Searching the Item and Enable the Show Upgrade
    Then Verify Upgrade Enabled Successfully

  Scenario: Verify I able to Enable the Show Upgrade toggle in Pro Plan
    And I Verify Searching the Item and Disable the Show Upgrade
    Then Verify Upgrade Disabled Successfully

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Verify I able to do Bulk Update Version with No
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the No button

  Scenario: Verify I able to do Bulk Update Version with Yes
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the Yes button
    Then Verify the Updated Successfully or not

  #Enterprise Plan
  Scenario: Verify able to search the Coursing by entering 3 letters of Enterprise Plan
    And I Select the Core/Basic Plan Tile
    And I Verify Searching the Item when entering three letters

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify I able to extract the report by using export option
  #And I Click the Export button
  #Then I Click the save #exported file will get saved
  Scenario: Verify I able to Enable the Show Upgrade toggle in Enterprise Plan
    And I Verify Searching the Item and Enable the Show Upgrade
    Then Verify Upgrade Enabled Successfully

  Scenario: Verify I able to Enable the Show Upgrade toggle in Enterprise Plan
    And I Verify Searching the Item and Disable the Show Upgrade
    Then Verify Upgrade Disabled Successfully

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Verify I able to do Bulk Update Version with No
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the No button

  Scenario: Verify I able to do Bulk Update Version with Yes
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the Yes button
    Then Verify the Updated Successfully or not

  #Sales_Last2Days
  Scenario: Verify able to search the Coursing by entering 3 letters of Sales_Last2Days
    And I Select the Core/Basic Plan Tile
    And I Verify Searching the Item when entering three letters

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify I able to extract the report by using export option
  #And I Click the Export button
  #Then I Click the save #exported file will get saved
  Scenario: Verify I able to Enable the Show Upgrade toggle in Sales_Last2Days
    And I Verify Searching the Item and Enable the Show Upgrade
    Then Verify Upgrade Enabled Successfully

  Scenario: Verify I able to Enable the Show Upgrade toggle in Sales_Last2Days
    And I Verify Searching the Item and Disable the Show Upgrade
    Then Verify Upgrade Disabled Successfully

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Verify I able to do Bulk Update Version with No
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the No button

  Scenario: Verify I able to do Bulk Update Version with Yes
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the Yes button
    Then Verify the Updated Successfully or not

  #Sales_Last2to7Days
  Scenario: Verify able to search the Coursing by entering 3 letters of Sales_Last2to7Days
    And I Select the Core/Basic Plan Tile
    And I Verify Searching the Item when entering three letters

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify I able to extract the report by using export option
  #And I Click the Export button
  #Then I Click the save #exported file will get saved
  Scenario: Verify I able to Enable the Show Upgrade toggle in Sales_Last2to7Days
    And I Verify Searching the Item and Enable the Show Upgrade
    Then Verify Upgrade Enabled Successfully

  Scenario: Verify I able to Enable the Show Upgrade toggle in Sales_Last2to7Days
    And I Verify Searching the Item and Disable the Show Upgrade
    Then Verify Upgrade Disabled Successfully

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Verify I able to do Bulk Update Version with No
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the No button

  Scenario: Verify I able to do Bulk Update Version with Yes
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the Yes button
    Then Verify the Updated Successfully or not

  #Sales_Last7to30Days
  Scenario: Verify able to search the Coursing by entering 3 letters of Sales_Last7to30Days
    And I Select the Core/Basic Plan Tile
    And I Verify Searching the Item when entering three letters

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify I able to extract the report by using export option
  #And I Click the Export button
  #Then I Click the save #exported file will get saved
  Scenario: Verify I able to Enable the Show Upgrade toggle in Sales_Last7to30Days
    And I Verify Searching the Item and Enable the Show Upgrade
    Then Verify Upgrade Enabled Successfully

  Scenario: Verify I able to Enable the Show Upgrade toggle in Sales_Last7to30Days
    And I Verify Searching the Item and Disable the Show Upgrade
    Then Verify Upgrade Disabled Successfully

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Verify I able to do Bulk Update Version with No
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the No button

  Scenario: Verify I able to do Bulk Update Version with Yes
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the Yes button
    Then Verify the Updated Successfully or not

  #Sales_Over from Last30Days
  Scenario: Verify able to search the Coursing by entering 3 letters of Sales_Over from Last30Days
    And I Select the Core/Basic Plan Tile
    And I Verify Searching the Item when entering three letters

  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify I able to extract the report by using export option
  #And I Click the Export button
  #Then I Click the save #exported file will get saved
  Scenario: Verify I able to Enable the Show Upgrade toggle in Sales_Over from Last30Days
    And I Verify Searching the Item and Enable the Show Upgrade
    Then Verify Upgrade Enabled Successfully

  Scenario: Verify I able to Enable the Show Upgrade toggle in Sales_Over from Last30Days
    And I Verify Searching the Item and Disable the Show Upgrade
    Then Verify Upgrade Disabled Successfully

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Verify I able to do Bulk Update Version with No
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the No button

  Scenario: Verify I able to do Bulk Update Version with Yes
    And I Select the Bulk Update Version
    And I Click the Update All button
    Then Check Update the latest version for All Auto Enabled Store is Displayed
    And I Click the Yes button
    Then Verify the Updated Successfully or not

  Scenario: Verify the UPOS Plan Details page opens when Clicking New Account
    And I Click the New Account button
    Then Check the UPOS Plan Details Page Opened

  Scenario: Verify the UPOS Plan Details page opens when Selecting the Store
    And I Search and Select the Store
    Then Check the Store Details Page Opened
