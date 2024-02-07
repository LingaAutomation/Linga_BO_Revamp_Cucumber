@Linga_Admin
@Linga_Admin_UsersA
Feature: Linga_Admin - Users
I am verify User module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the User module after Login to Application when Enter Username and Passowrd

Background: Opening the Linga Admin - Users page
Given Open the Linga-Admin Users home page BaseURL 

Scenario: Verify whether the Users Header is Displayed
Given Verifying the Users Header Page
Given I can do the Pagination

Scenario: Verify the Filter & Ascending and Descending Order 
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

Scenario: Verify the New User Page header
Given Click the New User button
When Verify the New User Header

Scenario: Verify whether we able to create the New User without Entering Name/Mandatory Fields
#And I Click the Save button without Entering User Name
Then Check the Save button is Disabled

#Scenario: Verify whether we able to Save the User with Single letter
#And I Enter the Single letter in User Name and Click the Save button

Scenario: Verify whether the user can able to Enter the User Name above the limit
And I Enter the First Name Exceeding the limit

Scenario: Verify whether the user can able to Enter the User Name above the limit
And I Enter the Last Name Exceeding the limit

Scenario: Verify whether can able to Save without First Name
And I Enter the Admin User First Name
And I Clear the First Name
Then Check Please Enter Name Error is Displayed
And I Enter the Admin User Last Name
And I Enter the Admin User Email ID
Then Check the Save button is Disabled

Scenario: Verify whether can able to Save without Last Name
And I Enter the Admin User First Name
And I Clear the Last Name
Then Check Please Enter Last Name Error is Displayed
And I Enter the Admin User Email ID
Then Check the Save button is Disabled

Scenario: Verify whether can able to Save without Email ID
And I Enter the Admin User First Name
And I Enter the Admin User Last Name
And I Clear the Email ID
Then Check the Save button is Disabled

Scenario: Verify whether can able to Save with Invalid Email ID
And I Enter the Admin User First Name
And I Enter the Admin User Last Name
And I Enter the Invalid Email ID
Then Check Enter Valid Email ID Error is Displayed
Then Check the Save button is Disabled

Scenario: Save the New User - Linga Admin
And I Enter the Admin User First Name
And I Enter the Admin User Last Name
And I Enter the Admin User Email ID
And I Click the Save button
Then Verify whether the User is Saved or Not

Scenario: Verify the Update header by Editing Saved User
Given I Search and Edit the Linga Admin User
When Verify the Update User Header

Scenario: Verify whether we can able to Cancel/Close the User Update screen
And I Click the Cancel button
Then I Verify User Update screen Close or not

Scenario: Verify able to search the User by entering 3 letters of User
And I Verify Searching the Item when entering three letters

Scenario: Verify whether can able to Update without First Name
Given I Search and Edit the Linga Admin User
And I Clear the First Name
Then Check Please Enter Name Error is Displayed
And I Enter the Admin User Last Name
And I Enter the Admin User Email ID
Then Check the Update button is Disabled

Scenario: Verify whether can able to Update without Last Name
And I Enter the Admin User First Name
And I Clear the Last Name
Then Check Please Enter Last Name Error is Displayed
And I Enter the Admin User Email ID
Then Check the Update button is Disabled

Scenario: Verify whether can able to Update without Email ID
And I Enter the Admin User First Name
And I Enter the Admin User Last Name
And I Clear the Email ID
Then Check the Update button is Disabled

Scenario: Verify whether can able to Update with Invalid Email ID
And I Enter the Admin User First Name
And I Enter the Admin User Last Name
And I Enter the Invalid Email ID
Then Check Enter Valid Email ID Error is Displayed
Then Check the Update button is Disabled

Scenario: Update the New User - Linga Admin
And I Enter the Admin User First Name
And I Enter the Admin User Last Name
And I Enter the Admin User Email ID
And I Click the Update button
Then Verify whether the User is Updated or Not

Scenario: Verify whether Unable to Inactivate the User Clicking Cancel/No button
Given I Search the Linga Admin User and Click the Delete button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled User Deleted/Inactivated or not


Scenario: Verify whether Able to Inactivate the User Clicking Delete/Yes button
Given I Search the Linga Admin User and Click the Delete button
And I Click the Delete button
Then I Verifying the User Deleted or not
And I Click the Inactive button to navigate Inactivated screen to Verify Inactivated Admin User

Scenario: Verify whether Unable to Activate the User Clicking Cancel/No button
Given I Search the Linga Admin User and Click the Active button
And I Click the Cancel button in Pop Up
Then Verify the Cancelled User is Activated or not

Scenario: Verify whether Able to Activate the User Clicking Delete/Yes button
Given I Search the Linga Admin User and Click the Active button
And I Click the Activate button
Then I Verifying the User Activated or not
And I Click the Active button to navigate Activated screen to Verify Activated Admin User

#Scenario: Verify whether able to Creating Duplicate User
#Given Click the New User button
#And I Enter the Admin User First Name
#And I Enter the Admin User Last Name
#And I Enter the Admin User Email ID
#And I Click the Update button
#Then Verify whether the Duplicate User is Saved or Not

Scenario: Verify whether able to Creating User with Existing Email ID
Given Click the New User button
And I Enter the Admin User First Name
And I Enter the Admin User Last Name
And I Enter the Admin User Email ID
And I Click the Save button
Then Verify whether the User is Saved with Existing Email or Not

Scenario: Verify whether able to Update User with Duplicate/Existing Email ID from Other User
And I Take the Existing Email ID
Given I Search and Edit the Linga Admin User
And I Enter the Admin User First Name
And I Enter the Admin User Last Name
And I Enter the Existing Email ID
And I Click the Update button
Then Verify whether the User is Updated with Existing or Duplicate Email or Not


#Scenario: Verify whether the User Saved by Entering Special Characters
#Given Click the New User button
#When I Enter the New User Name with Special Characters
#And I Enter the User Last Name
#And I Enter the User Email
#And I Enter the User Password
#And I Enter the Confirm Password
#And I Click the Save button
#Then Verify whether the User with Special Characters is Saved or not



Scenario: Verify whether the User Updating with Space in the end of Admin User name
Given I Search and Edit the Linga Admin User
When I Enter the New First Name with Space
And I Click the Update button 
Then Verify whether the User Name with Space in end is Updated or not
