#@Product/Items
@GiftCards

Feature: Product and Items - Gift Cards
  I am verify the Product/Items-Gift Cards module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Gift Card page
  Given Open the Gift Cards home page BaseURL and StoreID

Scenario: Verify whether the Gift Cards Header is Displayed
    Given Verifying the Gift Cards Header Page

Scenario: Verify whether we can able to do Pagination
  Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order
  When User Select the Filter option with Columns
  And Verify the Ascending and Descending Order

Scenario: Verify the New Gift Card Page header
  Given I Click the New Gift Card button
  When Verify the New Gift Card Header

Scenario: Verify whether we able to create the New Gift Card without Entering Name/Mandatory Fields
  #And I Click the Save button without Entering Gift Card Number
  When I Clear the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Cash
  And I Click the Save button
  Then Check Please Enter Gift Card Number Error is Displayed

Scenario: Verify whether the user can able to Enter the Gift Card Number above the limit
  #Given I Click the New Gift Card button
  Then I Enter the Gift Card Number Exceeding the limit

Scenario: Verify whether the user can able to Enter the Gift Card Balance above the limit
  #And I Click the New Gift Card button
  And I Enter the Gift Card Number
  Then I Enter the Balance Exceeding the limit

Scenario: Verify able to enter Special Characters in the Gift Card Number Field
  Given I Enter Special Characters in Card Number
  And I Click the Save button
  Then Check Please Enter Valid Gift Card Number Error is Displayed

Scenario: Verify able to enter Alphabets in the Gift Card Number Field
  Given I Enter Alphabets in Card Number
  And I Click the Save button
  Then Check Please Enter Valid Gift Card Number Error is Displayed
  And I Click the Cancel button

Scenario: Verify whether able to Save the Gift Card by Entering Card Number,Balance and without Selecting Payment Method
 Given I Click the New Gift Card button
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Click the Save button
  #Then Verify whether the Gift Card Saved without Selecting Payment Method or Not
  Then Check Please Select Payment Methods Error is Displayed

Scenario: Verify by able to Save the Gift Card with Card Number,Balance and Selecting Payment Method as Cash.
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Cash
  And I Click the Save button
  Then Verify whether the Gift Card Saved or Not

Scenario: Verify by able to Save the Payment Method as Card without Selecting the Card type and Last 4 digits.
  Given I Click the New Gift Card button
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Card
  Then Verify whether the Save button is Disabled

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Visa without Entering Last 4 digits
  #Given I Click the New Gift Card button
  And I Enter the Gift Card Number
  And I Enter the Balance
    And I Select the Payment Method as Card
    Then Verify whether the Save button is Disabled
    And I Enter the Last Four Digits
    And I Click the Save button
    Then Check Please Select Card Type Error is Displayed
    And I Select the Card Type as Visa
    And I Enter the Alphabets in Last Four Digits
    And I Click the Save button
    Then Check Please Enter Valid Last Four Characters Error is Displayed
    And I Enter the Special Characters in Last Four Digits
    And I Click the Save button
    Then Check Please Enter Valid Last Four Characters Error is Displayed

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Visa and Entering Last 4 digits
  #Given I Click the New Gift Card button
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Card
  And I Select the Card Type as Visa
  And I Enter the Last Four Digits
  And I Click the Save button
  Then Verify whether the Gift Card Saved or Not

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Master without Entering Last 4 digits
    Given I Click the New Gift Card button
    And I Enter the Gift Card Number
    And I Enter the Balance
    And I Select the Payment Method as Card
    And I Select the Card Type as Master
    Then Verify whether the Save button is Disabled

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Master and Entering Last 4 digits
    And I Enter the Gift Card Number
    And I Enter the Balance
    And I Select the Payment Method as Card
    And I Select the Card Type as Master
    And I Enter the Last Four Digits
    And I Click the Save button
    Then Verify whether the Gift Card Saved or Not

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Amex without Entering Last 4 digits
    Given I Click the New Gift Card button
    And I Enter the Gift Card Number
    And I Enter the Balance
    And I Select the Payment Method as Card
    And I Select the Card Type as Amex
    Then Verify whether the Save button is Disabled

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Amex and Entering Last 4 digits
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Card
  And I Select the Card Type as Amex
  And I Enter the Last Four Digits
  And I Click the Save button
  Then Verify whether the Gift Card Saved or Not

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Diners without Entering Last 4 digits
  Given I Click the New Gift Card button
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Card
  And I Select the Card Type as Diners
  Then Verify whether the Save button is Disabled

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Diners and Entering Last 4 digits
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Card
  And I Select the Card Type as Diners
  And I Enter the Last Four Digits
  And I Click the Save button
  Then Verify whether the Gift Card Saved or Not

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Others without Entering Last 4 digits
  Given I Click the New Gift Card button
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Card
  And I Select the Card Type as Others
  Then Verify whether the Save button is Disabled

Scenario: Verify able to Save the Payment Method as Card by Selecting Card Number as Others and Entering Last 4 digits
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Card
  And I Select the Card Type as Others
  And I Enter the Last Four Digits
  And I Click the Save button
  Then Verify whether the Gift Card Saved or Not

Scenario: Verify able to Save the Payment Method as Discount 100%
  Given I Click the New Gift Card button
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Discount
  And I Click the Save button
  Then Verify whether the Gift Card Saved or Not


Scenario: Verify the Update header by Editing Saved Gift Card
  Given I Search and Edit the Gift Card
  When Verify the Update Gift Card Header


Scenario: Verify whether we can able to Cancel/Close the Gift Card Update screen
#  When I Click the New Gift Card button
  And I Click the Cancel button
  Then I Verify Gift Card Update screen Close or Not


Scenario: Verify able to Edit the Gift Card by Removing the Gift Card Number
  Given I Search and Edit the Gift Card
  When I Clear the Gift Card Number
  #Then Verify whether the Update button is Disabled
  And I Enter the New Balance
  And I Select the Payment Method as Cash
  And I Click the Update button
  Then Check Please Enter Gift Card Number Error is Displayed
   And I Click the Cancel button
  
 Scenario: Verify whether able to Update the Gift Card by Entering Card Number,Balance and without Selecting Payment Method
  Given I Search and Edit the Gift Card
 	And I Enter the Gift Card Number
   And I Enter the New Balance
  And I Click the Update button
  #Then Verify whether the Gift Card Saved without Selecting Payment Method or Not
  Then Check Please Select Payment Methods Error is Displayed
  And I Click the Cancel button

Scenario: Verify able to Edit the Gift Card Balance with Cash
 Given I Search and Edit the Gift Card
	And I Take the Previous Balance Amount
  And I Enter the Gift Card Number
  And I Enter the Balance
  And I Select the Payment Method as Cash
  And I Click the Update button
  Then Verify the Gift Card is Updated or Not
  Then Verify the Gift Card Balance is Updated or Not

Scenario: Verify able to Edit the Gift Card Balance with Card without Selecting Card Type
  Given I Search and Edit the Gift Card
  And I Enter the Gift Card Number
   And I Enter the New Balance
  And I Select the Payment Method as Card
  Then Verify whether the Update button is Disabled
  And I Enter the Last Four Digits
  And I Click the Update button
  Then Check Please Select Card Type Error is Displayed

Scenario:  Verify able to Edit the Gift Card Balance with Card by Entering Special Characters in Last Four Digits
  And I Enter the Gift Card Number
   And I Enter the New Balance
  And I Select the Payment Method as Card
  Then Verify whether the Update button is Disabled
  And I Select the Card Type as Amex
  And I Enter the Special Characters in Last Four Digits
  And I Click the Update button
  Then Check Please Enter Valid Last Four Characters Error is Displayed

Scenario: Verify able to Edit the Gift Card Balance with Card by Entering Alphabets in Last Four Digits
  And I Enter the Gift Card Number
   And I Enter the New Balance
  And I Select the Payment Method as Card
  Then Verify whether the Update button is Disabled
  And I Select the Card Type as Amex
  And I Enter the Alphabets in Last Four Digits
  And I Click the Update button
  Then Check Please Enter Valid Last Four Characters Error is Displayed

  Scenario: Verify able to Edit the Gift Card Balance with Card by Selecting Card Type and Entering Last Four Digits
    Then I Enter the Gift Card Number
     And I Enter the New Balance
    And I Select the Payment Method as Card
    Then Verify whether the Update button is Disabled
    And I Select the Card Type as Amex
    And I Enter the Last Four Digits
    And I Click the Update button
    Then Verify the Gift Card is Updated or Not

Scenario: Verify able to Edit the Gift Card Balance with Discount
  Given I Search and Edit the Gift Card
  And I Take the Previous Balance Amount
  And I Enter the Gift Card Number
   And I Enter the Balance
  And I Select the Payment Method as Discount
  And I Click the Update button
  Then Verify the Gift Card is Updated or Not
  Then Verify the Gift Card Balance is Updated or Not

Scenario: Verify able to Edit the Gift Card by Removing the Gift Card Balance
  Given I Search and Edit the Gift Card
  And I Clear the Gift Card Balance
  #And I Click the Update button
  #Then Verify the Gift Card is Updated or Not
  #Then Verify whether the Gift Card is Updated without Balance or Not
  Then Verify whether the Update button is Disabled
  And I Click the Cancel button
  

Scenario: Recharge the Gift Card with Cash
Given I Search and Edit the Gift Card
And I Take the Previous Balance Amount
 And I Click the Cancel button
  Given I Search the Gift Card and Click the Recharge button
  #And I Enter the Gift Card Number
  And I Enter the Recharge Balance
  And I Take the After Balance Amount
  And I Select the Payment Method as Cash
  And I Click the Save button
  And Verify the Gift Card Balance is Added to the Existing Balance or Not


Scenario: Recharge the Gift Card with Card without Selecting Card Type
    Given I Search the Gift Card and Click the Recharge button
    #And I Enter the Gift Card Number
    And I Enter the Recharge Balance
    And I Select the Payment Method as Card
    Then Verify whether the Save button is Disabled
    And I Enter the Last Four Digits
    And I Click the Save button
    Then Check Please Select Card Type Error is Displayed
    
    
Scenario: Recharge the Gift Card with Card by Entering Special Characters in Last Four Digits
    #And I Enter the Gift Card Number
    And I Enter the Recharge Balance
    And I Select the Payment Method as Card
    Then Verify whether the Save button is Disabled
    And I Select the Card Type as Amex
    And I Enter the Special Characters in Last Four Digits
    And I Click the Save button
    Then Check Please Enter Valid Last Four Characters Error is Displayed
    
Scenario: Recharge the Gift Card with Card by Entering Alphabets in Last Four Digits
    #And I Enter the Gift Card Number
    And I Enter the Recharge Balance
    And I Select the Payment Method as Card
    Then Verify whether the Save button is Disabled
    And I Select the Card Type as Amex
    And I Enter the Alphabets in Last Four Digits
    And I Click the Save button
    Then Check Please Enter Valid Last Four Characters Error is Displayed
    
    
Scenario: Recharge the Gift Card with Card by Selecting Card Type and Entering Last Four Digits
  #Then I Enter the Gift Card Number
  And I Enter the Recharge Balance
  And I Select the Payment Method as Card
  Then Verify whether the Save button is Disabled
  And I Select the Card Type as Amex
  And I Enter the Last Four Digits
  And I Click the Save button
  And Verify the Gift Card Balance is Added to the Existing Balance or Not

Scenario: Recharge the Gift Card with Discount
  Given I Search the Gift Card and Click the Recharge button
  #And I Enter the Gift Card Number
  And I Enter the Recharge Balance
  And I Select the Payment Method as Discount
  And I Click the Save button
  And Verify the Gift Card Balance is Added to the Existing Balance or Not



#Scenario: Verify able to Recharge the Gift Card from Recharge option
#  Given I Search the Gift Card and Click the Recharge button
#  And I Enter Recharge Amount
#  And I Click the Save button

 Scenario: Verify whether unable to Inactivate the Gift Card Clicking Cancel/No button
   Given I Search the Gift Card and Click the Delete button
    And I Click the Cancel button in Pop Up
   Then Verify the Cancelled Gift Card Inactivated or Not

  Scenario: Verify whether Able to Inactivate the Gift Card Clicking Delete/Yes button
    Given I Search the Gift Card and Click the Delete button
    And I Click the Delete button
    Then I Verifying the Gift Card Deleted or Not
    And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Gift Card

  Scenario: Verify whether Unable to Activate the Gift Card Clicking Cancel/No button
    Given I Search the Gift Card and Click the Active button
    And I Click the Cancel button in Pop Up
    Then Verify the Cancelled Gift Card is Activated or Not

  Scenario: Verify whether Able to Activate the Gift Card Clicking Delete/Yes button
    Given I Search the Gift Card and Click the Active button
    And I Click the Activate button
    Then I Verifying the Gift Card Activated or Not
    And I Click the Active button to navigate Activated screen to Verify Activated Gift Card

  Scenario: Verify whether able to Creating Duplicate Gift Card
    Given I Click the New Gift Card button
    And I Enter the Gift Card Number
    And I Click the Save button
    Then Verify whether the Duplicate Gift Card is Saved or Not

Scenario: Verify whether the Gift Card Updating with Space in the end of Gift Card Number
  Given I Search and Edit the Gift Card
  When I Enter the New Gift Card Number with Space
  And I Click the Update button
  Then Verify whether the Gift Card Number with Space in end is Updated or Not



  #45