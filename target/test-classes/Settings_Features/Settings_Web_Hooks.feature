@Settings
@WebHooks

Feature: Settings - WebHooks
I am verify the Settings- WebHooks Module and Performing Some Operations on that

Background: Opening the WebHooks Page
Given Open WebHooks home page BaseURL and StoreID

Scenario: Verify whether the WebHooks Header is Displayed
Given Verifying the WebHooks Header Page

Scenario: Verifying Available Fields in WebHooks
Given Verify X-API-Key Inputbox is Displayed or Not
Then Verify Value Inputbox is Displayed or Not
Then Verify Close Order Web Hooks TextBox is Displayed or Not
Then Verify Close Order Web Hooks Is Active Toggle is Displayed or Not
Then Verify Open Order WebHooks TextBox is Displayed or Not
Then Verify Open Order Web Hooks Is Active Toggle is Displayed or Not
Then Verify Update Order WebHooks TextBox is Displayed or Not
Then Verify Update Order Web Hooks Is Active Toggle is Displayed or Not
Then Verify Third Order Web Hooks Is Active Toggle is Displayed or Not

Scenario: Enter X-API-Key as single Digit
Given Clear X-API-Key 
And Enter X-API-Key in Single Digit
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter X-API-Key as Infinity Key Value
Given Clear X-API-Key 
And Enter X-API-Key as Infinity Key Value
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter X-API-Key as Alphabets
Given Clear X-API-Key 
And Enter X-API-Key as Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter X-API-Key as Special Characters
Given Clear X-API-Key 
And Enter X-API-Key as Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter X-API-Key as combination of Digits,Alphabets
Given Clear X-API-Key 
And Enter X-API-Key as combination of Digits,Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter X-API-Key as combination of Digits,Alphabets and Special Characters
Given Clear X-API-Key 
And Enter X-API-Key as combination of Digits,Alphabets and Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Value as single Digit
Given Clear the Value
And Enter Value in Single Digit
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Value as Infinity Key Value
Given Clear the Value
And Enter Value as Infinity Key Value
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Value as Alphabets
Given Clear the Value
And Enter Value as Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Value as Special Characters
Given Clear the Value
And Enter Value as Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Value as combination of Digits,Alphabets
Given Clear the Value 
And Enter Value as combination of Digits,Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Value as combination of Digits,Alphabets and Special Characters
Given Clear the Value 
And Enter Value as combination of Digits,Alphabets and Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Close Order Web Hooks as Infinity Key Value
Given Clear the Close Order Web Hooks
And Enter Close Order Web Hooks as Infinity Key Value
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Close Order Web Hooks as Alphabets
Given Clear the Close Order Web Hooks
And Enter Close Order Web Hooks as Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Close Order Web Hooks as Special Characters
Given Clear the Close Order Web Hooks
And Enter Close Order Web Hooks as Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Close Order Web Hooks as combination of Digits,Alphabets
Given Clear the Close Order Web Hooks
And Enter Close Order Web Hooks as combination of Digits,Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Close Order Web Hooks as combination of Digits,Alphabets and Special Characters
Given Clear the Close Order Web Hooks 
And Enter Close Order Web Hooks as combination of Digits,Alphabets and Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enable Close Order Web Hooks Is Active Toggle
Given Enable Close Order Web Hooks Is Active Toggle
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Disable Close Order Web Hooks Is Active Toggle
Given Disable Close Order Web Hooks Is Active Toggle
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Open Order Web Hooks as Infinity Key Value
Given Clear the Open Order Web Hooks
And Enter Open Order Web Hooks as Infinity Key Value
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Open Order Web Hooks as Alphabets
Given Clear the Open Order Web Hooks
And Enter Open Order Web Hooks as Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Open Order Web Hooks as Special Characters
Given Clear the Open Order Web Hooks
And Enter Open Order Web Hooks as Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Open Order Web Hooks as combination of Digits,Alphabets
Given Clear the Open Order Web Hooks
And Enter Open Order Web Hooks as combination of Digits,Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Open Order Web Hooks as combination of Digits,Alphabets and Special Characters
Given Clear the Open Order Web Hooks 
And Enter Open Order Web Hooks as combination of Digits,Alphabets and Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enable Open Order Web Hooks Is Active Toggle
Given Enable Open Order Web Hooks Is Active Toggle
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Disable Open Order Web Hooks Is Active Toggle
Given Disable Open Order Web Hooks Is Active Toggle
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Update Order Web Hooks as Infinity Key Value
Given Clear the Update Order Web Hooks
And Enter Update Order Web Hooks as Infinity Key Value
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Update Order Web Hooks as Alphabets
Given Clear the Update Order Web Hooks
And Enter Update Order Web Hooks as Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Update Order Web Hooks as Special Characters
Given Clear the Update Order Web Hooks
And Enter Update Order Web Hooks as Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Update Order Web Hooks as combination of Digits,Alphabets
Given Clear the Update Order Web Hooks
And Enter Update Order Web Hooks as combination of Digits,Alphabets
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enter Update Order Web Hooks as combination of Digits,Alphabets and Special Characters
Given Clear the Update Order Web Hooks 
And Enter Update Order Web Hooks as combination of Digits,Alphabets and Special Characters
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enable Update Order Web Hooks Is Active Toggle
Given Enable Update Order Web Hooks Is Active Toggle
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Disable Update Order Web Hooks Is Active Toggle
Given Disable Update Order Web Hooks Is Active Toggle
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Enable Third Order Web Hooks Is Active Toggle
Given Enable Third Order Web Hooks Is Active Toggle
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not

Scenario: Disable Third Order Web Hooks Is Active Toggle
Given Disable Third Order Web Hooks Is Active Toggle
And I Click the Update button in WebHook
Then Verify WebHooks Updated or Not




