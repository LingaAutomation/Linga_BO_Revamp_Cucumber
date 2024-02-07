#@Product/Items 
#@Bulk_Update
Feature: Product and Items - Bulk Update
  I am verify the Product/Items-Bulk Update module by Add/Edit/Delete/Activate/Duplicate

  #Scenario: Login to the Application
  #Given Open the Browser and Enter URL
  #When I Select the Store after Login to Application when Enter Username and Passowrd
  Background: Open the Bulk Update page
    Given: Open the Bulk Update home page BaseURL and StoreID


  #Scenario: Verify whether the Bulk Update Header is Displayed
  #Given Verifying the Bulk Update Header Page
  Scenario: Verify whether we can able to do Pagination
    Given I can do the Pagination

  Scenario: Verify the Filter & Ascending and Descending Order
    When User Select the Filter option with Columns
    And Verify the Ascending and Descending Order

  Scenario: Sorting Bulk Update column
    Given Sort the Bulk Update column

  Scenario: Verify Home Path
    Given Verifying the Homepath

  Scenario: Verify the Created Category is displaying when Searching Selected Category for Bulk Update
    And I Search the Category Under Category field in the Bulk Update page Home Page
    And I Click the Apply button
    Then Check the Selected Category listing out in the Bulk Update

  Scenario: Verify the Created SubCategory is displaying when Searching Selected SubCategory for Bulk Update
    And I Search the SubCategory Under SubCategory field in the Bulk Update page Home Page
    And I Click the Apply button
    Then Check the Selected SubCategory listing out in the Bulk Update

  Scenario: Verify the Bulk Change button enable by Selecting checkbox All for Category/SubCategory
    And I Click Select All Category/SubCategory Bulk Change
    Then Check Bulk Update button is Enabled

  Scenario: Verify the Bulk Change button enable by Selecting checkbox anyone for Category/SubCategory
    And I Click Select anyone Category/SubCategory Bulk Change
    Then Check Bulk Update button is Enabled

  Scenario: Verify the change button is enable after entering the mandatory fields in Bulk Change
    And I Click Select anyone Category/SubCategory Bulk Change
    And I Click Bulk Change
    And I Select operation type as Increase/Decrease
    And I Select Change By Amount/Percentage
    And I Enter the Change To Value
    Then I verify Change button enabled or not

  Scenario: Verify the Bulk Change Page getting close by Clicking Close/Cancel
    And I Click Select anyone Category/SubCategory Bulk Change
    And I Click Bulk Change
    And I Select operation type as Increase/Decrease
    And I Select Change By Amount/Percentage
    And I Enter the Change To Value
    Then I Click Close/Cancel

  Scenario: Verify I able to bulk update by increase the Amount
    And I Click Select anyone Category/SubCategory Bulk Change
    And I Click Bulk Change
    And I Select operation type as Increase
    And I Select Change By Amount
    And I Enter the Amount value
    Then I Click the Change button #Price value will change -Changes replicated in Change column
    And I Click the Update Item Price button

  Scenario: Verify I able to bulk update by Decrease the Amount
    And I Click Select anyone Category/SubCategory Bulk Change
    And I Click Bulk Change
    And I Select operation type as Decrease
    And I Select Change By Amount
    And I Enter the Amount value
    Then I Click the Change button #Price value will change -Changes replicated in Change column
    And I Click the Update Item Price button

  Scenario: Verify I able to bulk update by increase the Percentage
    And I Click Select anyone Category/SubCategory Bulk Change
    And I Click Bulk Change
    And I Select operation type as Increase
    And I Select Change By Percenatge
    And I Enter the Percentage value
    Then I Click the Change button #Price value will change -Changes replicated in Change column
    And I Click the Update Item Price button

  Scenario: Verify I able to bulk update by Decrease the Percentage
    And I Click Select anyone Category/SubCategory Bulk Change
    And I Click Bulk Change
    And I Select operation type as Decrease
    And I Select Change By Percenatge
    And I Enter the Percentage value
    Then I Click the Change button #Price value will change -Changes replicated in Change column
    And I Click the Update Item Price button

  Scenario: Verify user able to view the InActive Category/Subcategory list by Clicking Active
    When I Click the Active Field
    Then I verify the active Category/SubCategory displayed or not

  Scenario: Verify user able to view the InActive Category/Subcategory list by Clicking INActive
    When I Click the InActive Field
    Then I verify the active Category/SubCategory displayed or not

  Scenario: Verify user able to Change the price in InActive Category/SubCategory
    And I Click Select anyone Category/SubCategory Bulk Change
    And I Click Bulk Change
    And I Select operation type as Increase/Decrease
    And I Select Change By Amount/Percentage
    And I Enter the Change To Value
    Then I Click the Change button
    And I Click the Update Item Price button

  Scenario: Verify user able to Change the price without using Bulk Change option
    And I Click Select anyone Category/SubCategory Bulk Change
    And I Enter the Change To Value
    And I Click the Update Item Price button
