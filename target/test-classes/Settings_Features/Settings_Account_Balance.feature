@Settings
@AccountBalance

Feature: Settings - Account Balance
I am verify the Settings- Account Balance Module and Performing Some Operations on that

Background: Opening the Account Balance page
Given Open Account Balance home page BaseURL and StoreID

Scenario: Verify whether the Account Balance Header is Displayed
Given Verifying the Account Balance Header Page

Scenario: Verify Available Fields in Account Balance Page
Then Verify Paid Out Inputbox is Displayed or Not
Then Verify CC Tip Reduction Inputbox is Displayed or Not
Then Verify Refund Inputbox is Displayed or Not
Then Verify Deposite Inputbox is Displayed or Not
Then Verify Over/shortage Inputbox is Displayed or Not
Then Verify Sales Open Items Inputbox is Displayed or Not
Then Verify Combo Discounts Inputbox is Displayed or Not
Then Verify Comp Discounts Inputbox is Displayed or Not
Then Verify Delivery Charge Cost Inputbox is Displayed or Not
Then Verify HA and GC Recharge Inputbox is Displayed or Not
Then Verify Driver Tip Inputbox is Displayed or Not
Then Verify Promo Discounts Inputbox is Dispkayed or Not
Then Verify Donation Discounts Inputbox is Displayed or Not
Then Verify Loyalty Discounts Inputbox is Displayed or Not

Scenario: Enter Paid Out in Special Characters and save the Data
Given Clear the Paidout
And Enter Paid Out in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Paid Out as Numbers and Alphabets and save the Data
Given Clear the Paidout
And Enter Paid Out in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter CC Tip Reduction in Special Characters and save the Data
Given Clear the CC Tip Reduction
And Enter CC Tip Reduction in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter CC Tip Reduction as Numbers and Alphabets and save the Data
Given Clear the CC Tip Reduction
And Enter CC Tip Reduction in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Refund in Special Characters and save the Data
Given Clear the Refund
And Enter Refund in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Refund as Numbers and Alphabets and save the Data
Given Clear the Refund
And Enter Refund in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Deposit in Special Characters and save the Data
Given Clear the Deposit
And Enter Deposit in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Deposit as Numbers and Alphabets and save the Data
Given Clear the Deposit
And Enter Deposit in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Over/Shortage in Special Characters and save the Data
Given Clear the Over/Shortage
And Enter Over/Shortage in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Over/Shortage as Numbers and Alphabets and save the Data
Given Clear the Over/Shortage
And Enter Over/Shortage in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Sales Open Items in Special Characters and save the Data
Given Clear the Sales Open Items
And Enter Sales Open Items in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Sales Open Items as Numbers and Alphabets and save the Data
Given Clear the Sales Open Items
And Enter Sales Open Items in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Combo Discounts in Special Characters and save the Data
Given Clear the Combo Discounts
And Enter Combo Discounts in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Combo Discounts as Numbers and Alphabets and save the Data
Given Clear the Combo Discounts
And Enter Combo Discounts in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Comp Discounts in Special Characters and save the Data
Given Clear the Comp Discounts
And Enter Comp Discounts in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Comp Discounts as Numbers and Alphabets and save the Data
Given Clear the Comp Discounts
And Enter Comp Discounts in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Delivery Charge Cost in Special Characters and save the Data
Given Clear the Delivery Charge Cost
And Enter Delivery Charge Cost in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Delivery Charge Cost as Numbers and Alphabets and save the Data
Given Clear the Delivery Charge Cost
And Enter Delivery Charge Cost in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter HA and GC Recharge in Special Characters and save the Data
Given Clear the HA and GC Recharge 
And Enter HA and GC Recharge in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter HA and GC Recharge as Numbers and Alphabets and save the Data
Given Clear the HA and GC Recharge 
And Enter HA and GC Recharge in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Driver Tip in Special Characters and save the Data
Given Clear the Driver Tip
And Enter Driver Tip in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Driver Tip as Numbers and Alphabets and save the Data
Given Clear the Driver Tip
And Enter Driver Tip in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Tip/Gratuity in Special Characters and save the Data
Given Clear the Tip/Gratuity
And Enter Tip/Gratuity in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Tip/Gratuity as Numbers and Alphabets and save the Data
Given Clear the Tip/Gratuity
And Enter Tip/Gratuity in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Promo Discounts in Special Characters and save the Data
Given Clear the Promo Discounts
And Enter Promo Discounts in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Promo Discounts as Numbers and Alphabets and save the Data
Given Clear the Promo Discounts
And Enter Promo Discounts in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Donation Discounts in Special Characters and save the Data
Given Clear the Donation Discounts
And Enter Donation Discounts in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Donation Discounts as Numbers and Alphabets and save the Data
Given Clear the Donation Discounts
And Enter Donation Discounts in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Loaylty Discounts in Special Characters and save the Data
Given Clear the Loaylty Discounts
And Enter Loaylty Discounts in Special Characters
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not

Scenario: Enter Loaylty Discounts as Numbers and Alphabets and save the Data
Given Clear the Loaylty Discounts
And Enter Loaylty Discounts in AlphaNumeric
And I Click the Save button in Delivery Settings
Then Verify Account Balance Settings Saved or Not
