#@Product/Items
@SortMenuConfig
Feature: Product and Items - Sort Menu Configuration
I am verify the Product/Items-Sort Menu Config module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Sort Menu Config page
Given Open the Sort Menu Config home page BaseURL and StoreID

Scenario: Verify whether the Sort Menu Config Header is Displayed
Given Verifying the Sort Menu Config Header Page

Scenario: Verify the fields under Sort Menu Config is displayed
Then Verify the Categories or Display Groups header in Sort Menu Cofig is displayed
And I select the Categories
Then Verify the Sub-Categories header in Sort Menu Cofig is Displayed
Then Verify the Menu Items header in Sort Menu Cofig is Displayed

Scenario: Verify whether by default A-Z Sort By option is displayed or Not
Then Verify the Sort By Option is Selected as A-Z Option as Default in Categories or Not

Scenario: Verify whether by default A-Z Sort By option is displayed or Not
Then Verify the Sort By Option is Selected as A-Z Option as Default in Sub-Categories or Not

Scenario: Verify whether by default A-Z Sort By option is displayed or Not
Then Verify the Sort By Option is Selected as A-Z Option as Default in Menu Items or Not

Scenario: Verify Sort By Options are Displayed in Selection Drop Down
Given I Select the Sort By in Categories
Then Verify the A-Z, Z-A, Custom Sort are Displayed or Not

  #Categories
Scenario: Verify the Sorting with Z-A to Categories
#Given I Select the Sort By in Categories
And I Select the Z-A in Categories
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Sorting with Custom Sort to Categories
Given I Select the Sort By in Categories
And I Select the Custom Sort in Categories
And I Drag and Drop the Category
And Click on the Save button
Then Verify the Item Sorted Successfully or not

  #Sub-Categories
Scenario: Verify the Sorting with Z-A to Sub-Categories
Given I Select the Sort By in Sub-Categories
And I Select the Z-A in Sub-Categories
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Sorting with Custom Sort to Sub-Categories
Given I Select the Sort By in Sub-Categories
And I Select the Custom Sort in Sub-Categories
And I Drag and Drop the Sub-Category
And Click on the Save button
Then Verify the Item Sorted Successfully or not

  #Menu Items
Scenario: Verify the Sorting with Z-A to Menu Items
Given I Select the Sort By in Menu Items
And I Select the Z-A in Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Sorting with Custom Sort to Menu Items
Given I Select the Sort By in Menu Items
And I Select the Custom Sort in Menu Items
And I Drag A and Drop B the Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Selected Sorting Option Selected After Refresh
Given Reload the Sort Menu Config Page
Then I Check Categories Sort By is Selected as Custom
Then I Check Sub-Categories Sort By is Selected as Custom
Then I Check Menu Items Sort By is Selected as Custom

Scenario: Verify the Sorting with A-Z to Categories
Given I Select the Sort By in Categories
And I Select the A-Z in Categories
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Sorting with A-Z to Sub-Categories
Given I Select the Sort By in Sub-Categories
And I Select the A-Z in Sub-Categories
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Sorting with A-Z to Menu Items
Given I Select the Sort By in Menu Items
And I Select the A-Z in Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Selected Sorting Option Selected After Reload entire page
Given Reload the Sort Menu Config Page
Then I Check Categories Sort By is Selected as A-Z
Then I Check Sub-Categories Sort By is Selected as A-Z
Then I Check Menu Items Sort By is Selected as A-Z

Scenario: Verify the after selecting Categories user able to view respective Sub-Categories
Given I Select the Sort By in Categories
And I Select the A-Z in Categories
And I select the Categories
Then Verify the user able to view Sub-Categories

Scenario: Verify the after selection Categories user able to view respective Sub-Categories
Given I Select the Sort By in Categories
And I Select the Z-A in Categories
And I select the Categories
Then Verify the user able to view Sub-Categories

Scenario: Verify the after selection Categories user able to view respective Menu Items
Given I Select the Sort By in Categories
And I Select the A-Z in Categories
And I select the Categories
Then Verify the user able to view Menu Items

Scenario: Verify the after selection Categories user able to view respective  Menu Items
Given I Select the Sort By in Categories
And I Select the Z-A in Categories
And I select the Categories
Then Verify the user able to view Menu Items

Scenario: Verify the after selection sub Categories user able to view respective Menu Items
Given I Select the Sort By in Categories
And I Select the A-Z in Categories
And I select the Categories
And I Select Sub-Categories
Then Verify the user able to view Menu Items

Scenario: Verify the after selection sub Categories user able to view respective Menu Items
Given I Select the Sort By in Categories
And I Select the Z-A in Categories
And I select the Categories
And I Select Sub-Categories
Then Verify the user able to view Menu Items

Scenario: Verify the Sorting with Custom Sort to Categories for two Categories
Given I Select the Sort By in Categories
And I Select the Custom Sort in Categories
And I Drag and Drop the Category
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Sorting with Custom Sort to Sub-Categories for two Sub-Categories
Given I Select the Sort By in Sub-Categories
And I Select the Custom Sort in Sub-Categories
And I Drag and Drop the Sub-Category
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify the Sorting with Custom Sort to Menu Items for two Menu Items
Given I Select the Sort By in Menu Items
And I Select the Custom Sort in Menu Items
And I Drag A and Drop B the Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Categories and Sub-Categories
Given I Select the Sort By in Categories
And I Select the A-Z in Categories
And I Select the Sort By in Sub-Categories
And I Select the A-Z in Sub-Categories
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Categories and Sub-Categories
Given I Select the Sort By in Categories
And I Select the Z-A in Categories
And I Select the Sort By in Sub-Categories
And I Select the Z-A in Sub-Categories
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Categories and Sub-Categories
Given I Select the Sort By in Categories
And I Select the Custom Sort in Categories
And I Drag and Drop the Category
And I Select the Sort By in Sub-Categories
And I Select the Custom Sort in Sub-Categories
And I Drag and Drop the Sub-Category
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Categories and Menu Items
Given I Select the Sort By in Categories
And I Select the A-Z in Categories
And I Select the Sort By in Menu Items
And I Select the A-Z in Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Categories and Menu Items
Given I Select the Sort By in Categories
And I Select the Z-A in Categories
And I Select the Sort By in Menu Items
And I Select the Z-A in Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Categories and Menu Items
Given I Select the Sort By in Categories
And I Select the Custom Sort in Categories
And I Drag and Drop the Category
And I Select the Sort By in Menu Items
And I Select the Custom Sort in Menu Items
And I Drag A and Drop B the Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Sub-Categories and Menu Items
Given I Select the Sort By in Sub-Categories
And I Select the A-Z in Sub-Categories
And I Select the Sort By in Menu Items
And I Select the A-Z in Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Sub-Categories and Menu Items
Given I Select the Sort By in Sub-Categories
And I Select the Z-A in Sub-Categories
And I Select the Sort By in Menu Items
And I Select the Z-A in Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not

Scenario: Verify able to save with sorting Sub-Categories and Menu Items
Given I Select the Sort By in Sub-Categories
And I Select the Custom Sort in Sub-Categories
And I Drag and Drop the Sub-Category
And I Select the Sort By in Menu Items
And I Select the Custom Sort in Menu Items
And I Drag A and Drop B the Menu Items
And Click on the Save button
Then Verify the Item Sorted Successfully or not
