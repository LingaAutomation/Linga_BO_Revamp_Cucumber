@Linga_Admin 
@Linga_Admin_DashBoard

Feature: LingaAdmin - DashBoard
  I am verify the LingaAdmin - DashBoard module by Add/Edit/Delete/Activate/Duplicate

  #Scenario: Login to the Application
  #Given Open the Browser and Enter URL
  #When I Select the Store after Login to Application when Enter Username and Passowrd
  Background: Opening the Linga Admin - Dashboard page
    Given Open the Linga Admin - Dashboard BaseURL and StoreID

  Scenario: Verify whether the Dashboard Header is Displayed
    Then Verifying the Dashboard Header Page

  #Scenario: Verify Home Path
  #Given Verifying the Homepath
  Scenario: Verify the value Displayed in the Total Store Tile
    Then Check the Total Stores Tile is Displayed

  Scenario: Verify the value Displayed in the Core/Basic Plan Tile
    Then Check the Core/Basic Plan Tile is Displayed

  Scenario: Verify the value Displayed in the Pro Plan Tile
    Then Check the Pro Plan Tile is Displayed

  Scenario: Verify the value Displayed in the Enterprise Plan Tile
    Then Check the Enterprise Plan Tile is Displayed

  Scenario: Verify the value Displayed in the Linga One Plan Tile
    Then Check the Linga One Tile is Displayed

  Scenario: Verify the value Displayed in the On Trial/Trial Expired Tile
    Then Check the On Trial/ Trial Expired Tile is Displayed

  Scenario: Verify the value Displayed in the Linga Online Order Tile
    Then Check the Linga Online Order Tile is Displayed

  Scenario: Verify the value Displayed in the Unpaid Tile
    Then Check the Unpaid Tile is Displayed

  Scenario: Verify the Chart in the Stores by Business Types
    Then I Check Stores by Business Types Graph is Displayed

  Scenario: Verify the Chart in the Stores by Status
    Then I Check Stores by Status Graph is Displayed

  Scenario: Verify the Dashboard Tiles in Online Ordering Tab is Displayed
    Given I Select the Online Ordering Tab
    And Check the Web Order Sales Tile is Displayed
    And Check the Mobile Sales Tile is Displayed
    And Check the Call Centre Sales Tile is Displayed
    And Check the Total Sales Tile is Displayed

  Scenario: Verify able to search by entering three letters in Web Order Sales and Pagination, Columns Filter
   Given I Select the Online Ordering Tab
   And I Select the Time Period as Date Range
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    And I Verify Searching the Item when entering three letters
   
  #Scenario: Verify whether we can able to do Pagination
   Given I Select the Online Ordering Tab
    Given I can do the Pagination

  #Scenario: Verify the Filter & Ascending and Descending Order
   #Given I Select the Online Ordering Tab
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify whether the By Default, Time period will be Today
    #Then Check Time Period is Defaultly Selected as Today

  #Scenario: Verify whether the Admin User can view the date in Date-month-year format
    #When I click on the Web Order Sales Tile
    #Then Verify Whether the date displayed is in Date-Month-Year format or not

  Scenario: Verify able to generate the Admin User Web Order Sales for Today
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Today
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for Yesterday
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Yesterday
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for Last N days
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last N Days
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for This Week
   Given I Select the Online Ordering Tab
    And I Select the Time Period as This Week
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for Last Week
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Week
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for Last 7 days
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Seven days
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for This Month
   Given I Select the Online Ordering Tab
    And I Select the Time Period as This Month
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for Last Month
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Month
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for Last 30 days
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Thirty days
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for Specific Date
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Specific Date
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Web Order Sales for Date Range
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Date Range
    And I Click the Apply button
    And I Select the Web Order Sales Tile
    Then Verify User Web Order Sales Report generated for Selected Time Period or Not
    
    #------------------------------------------------------------------------------
    
    Scenario: Verify able to search by entering three letters in Mobile Sales and Pagination, Columns Filters
     Given I Select the Online Ordering Tab
     And I Select the Time Period as Date Range
     And I Click the Apply button
    And I Select the Mobile Sales Tile
    And I Verify Searching the Item when entering three letters
   
  #Scenario: Verify whether we can able to do Pagination
   #Given I Select the Online Ordering Tab
    #And I Select the Mobile Sales Tile
    Given I can do the Pagination

  #Scenario: Verify the Filter & Ascending and Descending Order
   #Given I Select the Online Ordering Tab
   #And I Select the Time Period as Date Range
    #And I Select the Mobile Sales Tile
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify whether the By Default, Time period will be Today.
    #Then Check Time Period is Defaultly Selected as Today
#
  #Scenario: Verify whether the Admin User can view the date in Date-month-year format
    #When I click on the Mobile Sales Tile
    #Then Verify Whether the date displayed is in Date-Month-Year format or not

  Scenario: Verify able to generate the Admin User Mobile Sales for Today
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Today
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Yesterday
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Yesterday
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last N days
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Last N Days
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for This Week
  Given I Select the Online Ordering Tab
    And I Select the Time Period as This Week
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last Week
    Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Week
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last 7 days
    Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Seven days
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for This Month
    Given I Select the Online Ordering Tab
    And I Select the Time Period as This Month
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last Month
    Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Month
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last 30 days
    Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Thirty days
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Specific Date
    Given I Select the Online Ordering Tab
    And I Select the Time Period as Specific Date
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Date Range
    Given I Select the Online Ordering Tab
    And I Select the Time Period as Date Range
    And I Click the Apply button
     And I Select the Mobile Sales Tile
    Then Verify User Mobile Sales Report generated for Selected Time Period or Not
    
   #------------------------------------------------------------------------------
   
     Scenario: Verify able to search by entering three letters in Call Centre Sales and Pagination, Columns Filters
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Date Range
    And I Click the Apply button
    And I Select the Call Centre Tile
    And I Verify Searching the Item when entering three letters
   
  #Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  #Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify whether the By Default, Time period will be Today.
    #Then Check Time Period is Defaultly Selected as Today

  #Scenario: Verify whether the Admin User can view the date in Date-month-year format
    #When I click on the Mobile Sales Tile
    #Then Verify Whether the date displayed is in Date-Month-Year format or not

  Scenario: Verify able to generate the Admin User Mobile Sales for Today
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Today
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Yesterday
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Yesterday
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last N days
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Last N Days
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for This Week
  Given I Select the Online Ordering Tab
    And I Select the Time Period as This Week
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last Week
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Week
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last 7 days
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Seven days
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for This Month
  Given I Select the Online Ordering Tab
    And I Select the Time Period as This Month
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last Month
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Month
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Last 30 days
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Thirty days
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Specific Date
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Specific Date
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Mobile Sales for Date Range
  Given I Select the Online Ordering Tab
    And I Select the Time Period as Date Range
    And I Click the Apply button
    And I Select the Call Centre Tile
    Then Verify User Call Centre Report generated for Selected Time Period or Not
    
    #-----------------------------------------------------------------------------------
    
       Scenario: Verify able to search by entering three letters in Total Sales and Pagination, Columns Filter
       Given I Select the Online Ordering Tab
       And I Select the Time Period as Date Range
       And I Click the Apply button
    And I Select the Total Sales Tile
    And I Verify Searching the Item when entering three letters
   
  #Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  #Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  #Scenario: Verify whether the By Default, Time period will be Today.
    #Then Check Time Period is Defaultly Selected as Today
#
  #Scenario: Verify whether the Admin User can view the date in Date-month-year format
    #When I click on the Mobile Sales Tile
    #Then Verify Whether the date displayed is in Date-Month-Year format or not

  Scenario: Verify able to generate the Admin User Total Sales for Today
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Today
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for Yesterday
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Yesterday
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for Last N days
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last N Days
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for This Week
   Given I Select the Online Ordering Tab
    And I Select the Time Period as This Week
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for Last Week
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Week
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for Last 7 days
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Seven days
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for This Month
   Given I Select the Online Ordering Tab
    And I Select the Time Period as This Month
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for Last Month
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Month
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for Last 30 days
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Last Thirty days
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for Specific Date
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Specific Date
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not

  Scenario: Verify able to generate the Admin User Total Sales for Date Range
   Given I Select the Online Ordering Tab
    And I Select the Time Period as Date Range
    And I Click the Apply button
     And I Select the Total Sales Tile
    Then Verify User Total Sales Report generated for Selected Time Period or Not
    
   