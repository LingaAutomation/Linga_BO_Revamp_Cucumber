#@Product/Items
@Bulk_Update
Feature: Product and Items - Bulk Update
  I am verify the Product/Items-Bulk Update module by Add/Edit/Delete/Activate/Duplicate

  #Scenario: Login to the Application
  #Given Open the Browser and Enter URL
  #When I Select the Store after Login to Application when Enter Username and Passowrd
  Background: Open the Product and Items - Bulk Update page
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

  Scenario: Verify the Bulk Change button enable by Selecting checkbox All for Category
    And I Click Select All Category or SubCategory Check Box
    Then Check Bulk Change button is Enabled
 
  Scenario: Verify the Bulk Change button enable by Selecting checkbox anyone for Category
    And I Select the Category
    And I Click the Apply button
    And I Select Any Category Check Box
    Then Check Bulk Change button is Enabled
    
     Scenario: Verify the Bulk Change button enable by Selecting checkbox anyone for Sub-Category
     And I Select the Category as All
    And I Select the SubCategory
    And I Click the Apply button
    And I Select Any SubCategory Check Box
    Then Check Bulk Change button is Enabled

  Scenario: Verify the Bulk Change Screen Header
    And I Click the Bulk Change button
    Then Verify the Bulk Change Header
		And I Click the Cancel button

  Scenario: Verify the Close/Cancel the Bulk Change Screen
    And I Click the Bulk Change button
   And I Click the Cancel button
		Then I Verify Bulk Change screen Close or not

  Scenario: Verify the Change button is Enabled after entering the mandatory fields in Bulk Change
    And I Select the Category
    And I Click the Apply button
    And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Increase
    And I Select Change By as Percentage
    And I Enter the Percentage
    #And I Enter the Change To Value
    Then Check Change button is Enabled
    And I Click the Cancel button
    And I Click the Bulk Change button
    And I Select Operation Type as Decrease
    And I Select Change By as Amount
    And I Enter the Amount
		Then Check Change button is Enabled
		And I Click the Cancel button


  Scenario: Verify I able to bulk update by Increase the Amount for Category
     And I Select the Category
    And I Click the Apply button
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Increase
    And I Select Change By as Amount
    And I Enter the Amount
    And I Click the Change button
    Then Check the Increased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Increased Amount

    Scenario: Verify I able to bulk update by Decreased the Amount for Category
      And I Select the Category
    And I Click the Apply button
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Decrease
    And I Select Change By as Amount
    And I Enter the Amount
    And I Click the Change button
    Then Check the Decreased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Decreased Amount

   Scenario: Verify I able to bulk update by Increase the Percentage for Category
     And I Select the Category
    And I Click the Apply button
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Increase
    And I Select Change By as Percentage
    And I Enter the Percentage
    And I Click the Change button
    Then Check the Increased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Increased Percentage

    Scenario: Verify I able to bulk update by Decreased the Percentage for Category
      And I Select the Category
    And I Click the Apply button
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Decrease
    And I Select Change By as Percentage
    And I Enter the Percentage
    And I Click the Change button
    Then Check the Decreased Change To Price with Existing and Change
    And I Click the Update Item Price button
    Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Decreased Percentage
    
    Scenario: Verify I able to bulk update by Increase the Amount for SubCategory
      And I Select the Category as All
      And I Select the SubCategory
    And I Click the Apply button
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Increase
    And I Select Change By as Amount
    And I Enter the Amount
    And I Click the Change button
    Then Check the Increased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Increased Amount

    Scenario: Verify I able to bulk update by Decreased the Amount for SubCategory
      And I Select the Category as All
      And I Select the SubCategory
    And I Click the Apply button
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Decrease
    And I Select Change By as Amount
    And I Enter the Amount
    And I Click the Change button
    Then Check the Decreased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Decreased Amount

   Scenario: Verify I able to bulk update by Increase the Percentage for SubCategory
     And I Select the Category as All
      And I Select the SubCategory
    And I Click the Apply button
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Increase
    And I Select Change By as Percentage
    And I Enter the Percentage
    And I Click the Change button
    Then Check the Increased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Increased Percentage

    Scenario: Verify I able to bulk update by Decreased the Percentage for SubCategory
      And I Select the Category as All
      And I Select the SubCategory
    And I Click the Apply button
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Decrease
    And I Select Change By as Percentage
    And I Enter the Percentage
    And I Click the Change button
    Then Check the Decreased Change To Price with Existing and Change
    And I Click the Update Item Price button
    Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Decreased Percentage

  Scenario: Verify user able to view the InActive Category/Subcategory list by Clicking Active
    And I Click the Active button to Navigate Inactivated screen
    Then Verify Inactivated Categories/SubCategories in Bulk Update

 Scenario: Verify I able to Bulk Bpdate by Increase the Amount Inactive Status
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Increase
    And I Select Change By as Amount
    And I Enter the Amount
    And I Click the Change button
    Then Check the Increased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Increased Amount

    Scenario: Verify I able to bulk update by Decreased the Amount Inactive
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Decrease
    And I Select Change By as Amount
    And I Enter the Amount
    And I Click the Change button
    Then Check the Decreased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Decreased Amount
    
     Scenario: Verify I able to bulk update by Increase the Percentage in Inactive Screen
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Increase
    And I Select Change By as Percentage
    And I Enter the Percentage
    And I Click the Change button
    Then Check the Increased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Increased Percentage

    Scenario: Verify I able to bulk update by Decreased the Percentage in Inactive Screen
     And I Select Any Category Check Box
    And I Click the Bulk Change button
    And I Select Operation Type as Decrease
    And I Select Change By as Percentage
    And I Enter the Percentage
    And I Click the Change button
    Then Check the Decreased Change To Price with Existing and Change
    And I Click the Update Item Price button
     Then Verify whether the Bulk Update Updated or not
    Then Check the Updated Existing Price After Decreased Percentage
    
    Scenario: Verify user able to view the InActive Category/Subcategory list by Clicking Active
    And I Click the Inactive button to Navigate Inactivated screen
    Then Verify Inactivated Categories/SubCategories in Bulk Update

  Scenario: Verify user able to Change the Price without using Bulk Change option
     And I Select Any Category Check Box
    And I Enter the Change To Value
    And I Click the Update Item Price button
