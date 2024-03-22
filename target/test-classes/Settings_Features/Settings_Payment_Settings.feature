#//****************************************************
#//-----------Read me---Execution Steps to Follow----------------
#//Input the Username_Report and password_Report into LoginTest.java - Line no 72
#//Input the Store name into LoginPage()- Line no 168
#// Input the Store ID into openTheReportsEmployeeLaborHomePageBaseURLAndStoreID() in Reports_EmployeeLaborPage
#// 
#//Update Runner class with::: 
#// features={"classpath:Settings_Features"}
#// tags = ("@PaymentSettings")
#//
#//Update Common_data properties file:
#//
#//Check If All service charges are deleted from Payment Settings page - Service Charge under selected Store
#//
#//
#//
#//
#//
#//
#//
#//
#//
#//
#//
#
#//****************************************************


@Settings
@PaymentSettings
Feature: Settings - Payment Settings
	I Verifying the Payment Settings for Payment Surcharge
	
Background: Open the Payment Settings Home Page
Given Open the Settings - Payment Settings Home Page BaseURL and storeID

@SPS1
Scenario: Verify Whether Payment Surcharge - Surcharge is SAVED without Fee Name
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Surcharge button
And I Clear the Fee Name
Then I Verify SAVE button is Disabled

@SPS2
Scenario: Verify Whether Payment Surcharge - Surcharge is SAVED without Surcharge Name
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Surcharge button
And I Clear the Surcharge Name
Then I Verify SAVE button is Disabled

@SPS3
Scenario: Verify Whether Payment Surcharge - Surcharge Percentage is greater than 100%
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Surcharge button
And I Enter Surcharge Percentage greater than 100% and Verify Error
Then I Verify SAVE button is Disabled

@SPS4
Scenario: Verify Whether Payment Surcharge - SAVED with 25 characters of Fee & Surcharge Name
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Surcharge button
And I Enter Fee Name with 25 characters
And I Enter Surcharge Name with 25 characters
And I Enter Surcharge Percentage
Then I Verify SAVE button is Enabled
And I Click SAVE button 
Then I Verify Payment Settings Saved Successfully

@SPS5
Scenario: Verify Whether Payment Surcharge - Surcharge is Updated with New Fee Name,Surcharge Name and Surcharge Percentage
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Surcharge button
And I Update Fee Name
And I Update Surcharge Name
And I Update Surcharge Percentage
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS6
Scenario: Verify whether Payment Surcharge - Service Charge - New Service Charge Header
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
Then I Verify New service charge header title
And I Click Cancel

@SPS7
Scenario: Verify whether able to save the Payment Surcharge - New Service Charge without Card Type
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Disabled
And I Click Cancel

@SPS8
Scenario: Verify whether Payment Surcharge - Service Charge - Service Charge Percentage is greater than 100%
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as VISA
And I Enter Service Charge Percentage greater than 100 and Verify Error
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Disabled
And I Click Cancel

@SPS9
Scenario: Verify whether Payment Surcharge - Service Charge - Tip Charge Percentage is greater than 100%
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as VISA
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage greater than 100 and Verify Error
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Disabled
And I Click Cancel

@SPS10
Scenario: Verify whether Payment Surcharge - Service Charge - Gratuity Charge Percentage is greater than 100%
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as VISA
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage greater than 100 and Verify Error
Then I Verify SAVE&ADD button is Disabled
And I Click Cancel

@SPS11
Scenario: Verify whether Payment Surcharge - Service Charge - Added for Card type - VISA
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as VISA
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Enabled
And I Click SAVE&ADD button
Then I Verify Service Charge Added Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS12
Scenario: Verify whether Payment Surcharge - Service Charge - Added for Card type - MASTER
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as MASTER
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Enabled
And I Click SAVE&ADD button
Then I Verify Service Charge Added Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS13
Scenario: Verify whether Payment Surcharge - Service Charge - Added for Card type - AMEX
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as AMEX
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Enabled
And I Click SAVE&ADD button
Then I Verify Service Charge Added Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS14
Scenario: Verify whether Payment Surcharge - Service Charge - Added for Card type - DINERS
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as DINERS
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Enabled
And I Click SAVE&ADD button
Then I Verify Service Charge Added Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS15
Scenario: Verify whether Payment Surcharge - Service Charge - Added for Card type - JCB
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as JCB
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Enabled
And I Click SAVE&ADD button
Then I Verify Service Charge Added Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS16
Scenario: Verify whether Payment Surcharge - Service Charge - Added for Card type - DISCOVER
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as DISCOVER
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Enabled
And I Click SAVE&ADD button
Then I Verify Service Charge Added Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS17
Scenario: Verify whether Payment Surcharge - Service Charge - Added for Card type - EBTCASH
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click New Service Charge button
And I select the Card Type as EBTCASH
And I Enter Service Charge Percentage
And I Enter Tip Charge Percentage
And I Enter Gratuity Charge Percentage
Then I Verify SAVE&ADD button is Enabled
And I Click SAVE&ADD button
Then I Verify Service Charge Added Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS18
Scenario: Verify whether Payment Surcharge - Service Charge - Update Service Charge Header
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Edit the Service Charge
Then I Verify Update Service Charge Header Title
Then I Verify UPDATE button is Disabled
And I Click Cancel

@SPS19
Scenario: Verify whether Payment Surcharge - Service Charge - Updated Card type from DINERS to CASH and Service Charge
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Edit the Service Charge with Card Type DINERS
And I Update the Card Type to CASH
And I Update the Service Charge
Then I Verify UPDATE button is Enabled
And I Click UPDATE button
Then I Verify Service Charges Updated Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS20
Scenario: Verify whether Payment Surcharge - Service Charge - Updated Card type from AMEX to ATH and Tip Charge
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Edit the Service Charge with Card Type AMEX
And I Update the Card Type to ATH
And I Update the Tip Charge
Then I Verify UPDATE button is Enabled
And I Click UPDATE button
Then I Verify Service Charges Updated Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS21
Scenario: Verify whether Payment Surcharge - Service Charge - Updated Card type from JCB to UNICA and Gratuity Charge
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Edit the Service Charge with Card Type JCB
And I Update the Card Type to UNICA
And I Update the Gratuity Charge
Then I Verify UPDATE button is Enabled
And I Click UPDATE button
Then I Verify Service Charges Updated Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS22
Scenario: Verify whether Payment Surcharge - Service Charge - Updated Service Charge Name with 25 characters
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Update the Service Charge Name with 25 characters
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS23
Scenario: Verify whether Payment Surcharge - Service Charge - Updated Card type from DISCOVER to EBT and Service Charge
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Edit the Service Charge with Card Type DISCOVER
And I Update the Card Type to EBT
And I Update the Service Charge
Then I Verify UPDATE button is Enabled
And I Click UPDATE button
Then I Verify Service Charges Updated Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS24
Scenario: Verify whether Payment Surcharge - Service Charge - Updated Card type from MASTER to FONDO and Tip Charge
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Edit the Service Charge with Card Type MASTER
And I Update the Card Type to FONDO
And I Update the Tip Charge
Then I Verify UPDATE button is Enabled
And I Click UPDATE button
Then I Verify Service Charges Updated Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS25
Scenario: Verify whether Payment Surcharge - Service Charge - Updated Card type from EBTCASH to Others and Gratuity Charge
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Edit the Service Charge with Card Type EBTCASH
And I Update the Card Type to Others
And I Update the Gratuity Charge
Then I Verify UPDATE button is Enabled
And I Click UPDATE button
Then I Verify Service Charges Updated Successfully
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS26
Scenario: Verify whether Payment Surcharge - Service Charge - Sorting, Filter columns
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Click COLUMNS for Sorting
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS27
Scenario: Verify whether Payment Surcharge - Service Charge - Deleted (Cancel button)
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Delete the Service Charge
Then I Verify Are you sure you want to delete this item message
And I Click Cancel from Alert Popup

@SPS28
Scenario: Verify whether Payment Surcharge - Service Charge - Deleted (Delete button)
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Service Charge button
And I Search and Delete the Service Charge
Then I Verify Are you sure you want to delete this item message
And I Click DELETE from Alert Popup
Then I Verify Service Charge Removed Successfully

@SPS29
Scenario: Verify Whether Payment Surcharge - Dual Price is SAVED without Name
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Dual Price button
And I Clear the DualPrice Fee Name
And I Enter Dual Price Percentage
And I Select Dual Price Tax Type as Before Tax
Then I Verify SAVE button is Disabled

@SPS30
Scenario: Verify Whether Payment Surcharge - Dual Price is SAVED without Dual Price Percentage
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Dual Price button
And I Enter Dual Price Name
And I Clear Dual Price Percentage and verify Error
And I Select Dual Price Tax Type as After Tax
Then I Verify SAVE button is Disabled


@SPS31
Scenario: Verify Whether Payment Surcharge - Dual Price is SAVED with Name 25 characters
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Dual Price button
And I Enter Dual Price Name with 25 characters
And I Enter Dual Price Percentage
And I Select Dual Price Tax Type as Before Tax
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully 

@SPS32
Scenario: Verify Whether Payment Surcharge - Dual Price is SAVED with After Tax
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Dual Price button
And I Enter Dual Price Name
And I Enter Dual Price Percentage
And I Select Dual Price Tax Type as After Tax
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS33
Scenario: Verify Whether Payment Surcharge - Dual Price is Updated with New Name, Dual Price Percentage
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Dual Price button
And I Update Dual Price Name
And I Update Dual Price Percentage
And I Select Dual Price Tax Type as Before Tax
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully

@SPS34
Scenario: Verify Whether Payment Surcharge - Dual Price is Updated with New Name, Dual Price Percentage and Taxtype
And I Click Manual Submit For Credit Card Toggle as YES
And I Click Tokenize The Credit Card Toggle as YES
And I Click Payment Surcharge Toggle as YES
And I Click Dual Price button
And I Update Dual Price Name
And I Update Dual Price Percentage
And I Select Dual Price Tax Type as After Tax
Then I Verify SAVE button is Enabled
And I Click SAVE button
Then I Verify Payment Settings Saved Successfully
