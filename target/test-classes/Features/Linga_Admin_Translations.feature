@Linga_Admin
@Translations
Feature: Admin - Translations
I am verify the Admin-Translations module by Add/Edit/Delete/Activate/Duplicate

Background: Opening the Linga Admin-Translations page.
Given Open the Linga Admin-Translations page BaseURL and StoreID

Scenario: Verify Whether the Translations Header is Displayed
Given Verifying the Translations Header Page

Scenario: Verify Path Displayed above the Header.
Given Verifying the Path Admin / Settings / Translations Displayed above the Header

Scenario: Verify field is Displayed under Translations Page.
Then Verify the Please select languages to export translation template header in Translations is Displayed
Then Verify the Upload the template to update translations header in Translations is Displayed

Scenario: Verify Language Field Box Displayed Or Not
And I Click the Languages
Then Check List of Languages is Displayed

#Scenario: Verify Dropdown After Selecting Language dropdown is Displayed Or Not
#And I Select Language Field Box
#Then Verify Dropdown is Dispayed or Not
#
#Scenario: Verify List of Languages in Dropdown Box Displayed or Not
#And I Select Language Field Box
#Then Verify List of Languages in Dropdown Box Displayed or Not

@Download
Scenario: Verify User able to Download Template for All Languages
And I Select All Languages
And I Click the Dowload Template

 Scenario: Verify User able to Download Template without Selecting Languages
 #And I Click the Languages
 And I Deselect All Languages
 And I Click the Dowload Template
     
Scenario: Verify User able to Download Template for Single Languages
 And I Click the Languages
And I Select the Single Languages
And I Click the Dowload Template
    
Scenario: Verify User able to Download Template for Multiple Languages
 And I Click the Languages
And I Select the Multiple Languages
And I Click the Dowload Template
    
 Scenario: Verify User able to Download Template After Removing Language Selection
 And I Deselect All Languages
 And I Click the Dowload Template

Scenario: Verify Able to view Import button Displayed as Disabled
Then Check Import button is Disabled
@Template    
Scenario: Verify able to Import without Clicking Import
And I Upload the Template
Then Check the Import button is Enabled
@Template
Scenario: Verify able to Import After Removing Upload
And I Remove the Uploaded Template
Then Check Import button is Disabled

@Template    
Scenario: Verify able to Import the Template
And I Upload the Template
And I Click the Import button
Then Verify the Updated Successfully or not
    
        

  #Scenario: Verify Window Displayed After Selected Upload Translation Template
    #And I Select Upload Translation Template
    #Then Verify Window Displayed or Not
#
  #Scenario: Verify File Displayed Under Upload Translation Template
    #And I Select Upload Translation Template
    #And I Select File and Click on Open Button
    #Then Verify File Displayed Under Upload Translation Template
#
  #Scenario: Verify Import Button Enabled After Selecting File
    #And I Select Upload Translation Template
    #And I Select File and Click on Open Button
    #Then Verify Import Button Displayed as Enabled or Not
#
  #Scenario: Verify Able to Update Translation in Upload Translation Template
    #And I Select Upload Translation Template
    #And I Select File and Click on Open Button
    #And I Select Import Option
    #Then Verify Updated successfully Pop up Displayed or Not
#
  #Scenario: Verify Able to Remove File By Select Cross button
    #And I Select Upload Translation Template
    #And I Select File and Click on Open Button
    #And I Select Import Option
    #And I Select Cross Button Near Upload File
    #Then Verify File Got Removed or Not
#
  #Scenario: Verify After Removed File Import Button Displayed as Disabled or Not
    #And I Select Upload Translation Template
    #And I Select File and Click on Open Button
    #And I Select Import Option
    #And I Select Cross Button Near Upload File
    #Then Verify File Got Removed or Not
    #Then Verify Import Button Displayed as Disabled or Not
#
  #Scenario: Verify Select Cancel Option In Window
    #And I Select Upload Translation Template
    #And I Select Cancel Option in Window
    #Then Verify Able to Select Cancel Option or Not and Window Got Closed
#
  #Scenario: Verify Select Cross Option In Window
    #And I Select Upload Translation Template
    #And I Select Cross Option in Window
    #Then Verify Able to Select Cross Option or Not and Window Got Closed
#
  #Scenario: Verify After File Import Button Disabled as Enabled Or Not
    #And I Select Upload Translation Template
    #And I Select File and Click on Open Button
    #And I Select Import Option
    #Then Verify Updated successfully Pop up Displayed or Not
    #Then Verify Import Button Displayed as Enabled or Not
#
  #Scenario: Verify After Refresh Page Selected are Removed or Not
    #And I Select Language
    #And I Select Download Template
    #And I Select Upload Translation Template
    #And I Select File and Click on Open Button
    #And I Select Import Option
    #And I Refresh The Page
    #Then Verify Selected Language and Upload File are Removed or Not
#
  #Scenario: Verify Validation as Please select an excel file Displayed or Not
    #And I Select Language
    #And I Select Download Template
    #And I Select Upload Translation Template
    #And I Select File with PDF Format and Click on Open Button
    #Then Verify Please select an excel file Validation Pop Up Displayed or Not
#
  #Scenario: Verify Validation as Please select an excel file Displayed or Not
    #And I Select Language
    #And I Select Download Template
    #And I Select Upload Translation Template
    #And I Select File with CSV Format and Click on Open Button
    #Then Verify Please select an excel file Validation Pop Up Displayed or Not
#
  #Scenario: Verify Validation as Please select an excel file Displayed or Not
    #And I Select Language
    #And I Select Download Template
    #And I Select Upload Translation Template
    #And I Select Video and Click on Open Button
    #Then Verify Please select an excel file Validation Pop Up Displayed or Not
#







