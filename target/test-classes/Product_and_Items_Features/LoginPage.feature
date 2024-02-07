Feature: Login to Linga URL
Background:
Given Open the Login page when Entering "<URL>"
And Verify the Login Page
When Enter the Username"<Username>" and Password "<Password>"
Then Click the Login button
Then Navigate to Enterprises stores page "<Enterprise URL>"
Then Select the Required Store "<Store Name>"


Scenario Outline: Verify the Department page
Given Open Department page in Product and Items when Entering "<Department URL>"
When Verify the Department Header
Then Verify the Pagination
Then Verify the Filter Columns

Scenario Outline: Creating New Department
Given Click the New Department button
When Verify New Department page header
Then Enter the Department name "<Department Name>"


Examples:
|Username					|Password     |Enterprise URL																				|Store Name |Department URL																								|Department Name|
|borevamp@mail.com|test123			|https://staging-revamp.lingaros.com/enterprise/stores|Bo Revamp	|https://staging-revamp.lingaros.com/productsItems/departments|Department001  |