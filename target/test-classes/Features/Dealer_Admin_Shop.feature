@Dealer_Admin
@Dealer_Shop
Feature: DealerAdmin - Shop
  I am verify the Dealer - Shop module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
  Background: Opening the Dealer - Shop page
    Given Open the Dealer - Dashboard BaseURL and StoreID

  Scenario: Verify whether the Dashboard Header is Displayed
    Then Verifying the Dashboard Header Page

  #Scenario: Verify Selected Subscriptions Under Dealer Admin Page
    #Given Verify Subscriptions Selected From Dealer Admin Page or Not

  Scenario: Verify URL After Selecting Shop
    And I Select Shop Module
    Then Verify URL as https://shop.lingaros.com/ Opened or Not

  Scenario: Verify whether the Shop Page Header
#    And I Select Shop
    Then Verifying the Shop Header Page



