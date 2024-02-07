@Dealer_Admin
@Dealer_Partner_Portal

Feature: Dealers_Admin - Parter_Portal
I am verify the Dealers_Admin - Payments module by Add/Edit/Delete/Activate/Duplicate

  Background: Opening the Dealer - Parter_Portal page
  Given Open the Dealer - Dashboard BaseURL and StoreID
  
  Scenario: Verify whether the Dashboard Header is Displayed
  Then Verifying the Dashboard Header Page
    
  Scenario: Verify URL After Selecting Dealer Portal
  And I Select Dealer Portal Module
  Then Verify URL as https://www.lingaros.com/partners/partner-resource-center/ Opened or Not
    
  Scenario: Verify whether the Dealer Portal Page Header
  Then Verifying the Dealer Portal Header Page 
    

#"https://www.lingaros.com/partners/partner-resource-center/" 
