@Settings
@Printer_Rerouting
@Settings01

Feature: Settings - Printer Rerouting Settings
	I Verifying the Settings - Printer Rerouting Settings
	
Background: Open the Settings - Printer Rerouting Settings Home Page
Given Open the Settings - Printer Rerouting Settings home page BaseURL and storeID

@RerouteByRole
Scenario: Verify whether the Settings - Printer Rerouting Settings Header is Displayed
Given Verifying the Settings - Printer Rerouting Settings Header Page

@RerouteByRole
Scenario: Verify whether we can able to do Pagination
Given I can do the Pagination

@RerouteByRole
Scenario: Verify the Filter & Ascending and Descending Order
When User Select the Filter option with Columns
And Verify the Ascending and Descending Order

@RerouteByRole
Scenario: Verify the New Reroute By Node Page header
Given I Click the New Reroute By Node button
When Verify the New Re-Route By Node Header

@RerouteByRole
Scenario: Verify whether the All Fields are available in Printer Rerouting Settings
And I Select Reroute By Node Tab
Then Check Node Field in Table is Displayed
Then Check From Printer Field in Table is Displayed
Then Check To Printer Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed
And I Select Reroute By Role Tab
Then Check Node Field in Table is Displayed
Then Check From Printer Field in Table is Displayed
Then Check To Printer Field in Table is Displayed
Then Check Actions Field in Table is Displayed
Then Check Rows Per Page Filter Field is Displayed
And I Select Reroute By Node Tab

Scenario: Verify able to Create a New Re-Route By Node without Selecting Node
And I Click the New Reroute By Node button
And I Select From Printer
And I Select To Printer
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Re-Route By Node without Selecting From Printer
And I Click the New Reroute By Node button
And I Select Node
And I Select To Printer
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Re-Route By Node without Selecting To Printer
And I Click the New Reroute By Node button
And I Select Node
And I Select From Printer
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Re-Route By Node By Selecting Same From Printer to To Printer
And I Click the New Reroute By Node button
And I Select Node
And I Select From Printer
And I Select Same To Printer
Then Check From and To Printers Should Not be Same Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Re-Route By Node By Enabling Restriction Time and without Selecting Times
And I Click the New Reroute By Node button
And I Select Node
And I Select From Printer
And I Select To Printer
And I Enable the Restriction Time Toggle
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Re-Route By Node By Enabling Restriction Time and without Selecting End Time
And I Click the New Reroute By Node button
And I Select Node
And I Select From Printer
And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the Start Time in Restriction Time
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Verify able to Create a New Re-Route By Node By Enabling Restriction Time and without Selecting Start Time
And I Click the New Reroute By Node button
And I Select Node
And I Select From Printer
And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the End Time in Restriction Time
Then Check the Save button is Disabled
And I Click the Cancel button

Scenario: Create a New Printer Reroute by Node
And I Click the New Reroute By Node button
And I Select Node
And I Select From Printer
And I Select To Printer
And I Select the Availability as All Days
And I Click the Save button
Then Verify whether the Printer Reroute Saved or Not

Scenario: Verify the Update header by Editing Saved Reroute By Node
Given I Search and Edit the Reroute By Node
When Verify the Update Reroute By Node Header


Scenario: Verify whether we can able to Cancel/Close the Reroute By Node Update screen
Given I Search and Edit the Reroute By Node
And I Click the Cancel button
Then I Verify Reroute By Node Update screen Close or Not

Scenario: Verify Unable to Update the Re-Route By Node By Selecting Same From Printer to To Printer
Given I Search and Edit the Reroute By Node
#And I Select Node
#And I Select From Printer
And I Select Same To Printer
Then Check From and To Printers Should Not be Same Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button


Scenario: Verify Unable to Update Re-Route By Node By Enabling Restriction Time and without Selecting Times
Given I Search and Edit the Reroute By Node
#And I Select Node
#And I Select From Printer
#And I Select To Printer
And I Enable the Restriction Time Toggle
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify Unable to Update Re-Route By Node By Enabling Restriction Time and without Selecting End Time
Given I Search and Edit the Reroute By Node
#And I Select Node
#And I Select From Printer
#And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the Start Time in Restriction Time
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Verify Unable to Update Re-Route By Node By Enabling Restriction Time and without Selecting Start Time
Given I Search and Edit the Reroute By Node
#And I Select Node
#And I Select From Printer
#And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the End Time in Restriction Time
Then Check the Update button is Disabled
And I Click the Cancel button

Scenario: Update the Reroute By Node by Enabling Restriction Time 
Given I Search and Edit the Reroute By Node
#And I Select Node
#And I Select From Printer
#And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the Start Time in Restriction Time
And I Select the End Time in Restriction Time
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

Scenario: Update the Reroute By Node with Availability as Days of Week
Given I Search and Edit the Reroute By Node
#And I Select Node
#And I Select From Printer
#And I Select To Printer
Then I Verify the Selected Availability as All Days
Then Check Restriction Time Toggle is Enabled
And I Select the Availability as Days of Week
Then Check the Update button is Disabled
And I Selecting the Days
#And I Select the Start Time in Restriction Time
#And I Select the End Time in Restriction Time
And I Disable the Restriction Time Toggle
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

Scenario: Update the Reroute By Node with Availability as Days of Month
Given I Search and Edit the Reroute By Node
#And I Select Node
#And I Select From Printer
#And I Select To Printer
Then I Verify the Selected Availability as Days of Week
Then Check Restriction Time Toggle is Disabled
And I Select the Availability as Days of Month
Then Check the Update button is Disabled
And I Selecting the Days Of Months
Then Check the Update button is Enabled
And I Enable the Restriction Months Toggle
Then Check the Update button is Disabled
And I Selecting the Restriction Months
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

Scenario: Update the Reroute By Node with Availability as Date Range
Given I Search and Edit the Reroute By Node
#And I Select Node
#And I Select From Printer
#And I Select To Printer
Then I Verify the Selected Availability as Days of Month
And I Select the Availability as Date Range
Then Check the Update button is Disabled
And I Select the Start Date
Then Check the Update button is Disabled
And I Select the End Date
Then Check the Update button is Enabled
And I Enable Restriction Days Toggle
Then Check the Update button is Disabled
And I Selecting the Restriction Days
Then Check the Update button is Enabled
And I Enable the Restriction Time Toggle
Then Check the Update button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update button is Disabled
And I Select the End Time in Restriction Time
Then Check the Update button is Enabled
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

Scenario: Update the Reroute By Node with Availability as Specific Date
Given I Search and Edit the Reroute By Node
Then I Verify the Selected Availability as Date Range
Then Check Restriction Days Toggle is Enabled
Then Check Restriction Time Toggle is Enabled
And I Select the Availability as Specific Date
Then Check the Update button is Disabled
And I Select the Specific Date
#Then Check the Update button is Enabled
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

Scenario: Update the Reroute By Node with Availability as Date Range with Time
Given I Search and Edit the Reroute By Node
Then I Verify the Selected Availability as Specific Date
Then Check Restriction Days Toggle is Enabled
Then Check Restriction Time Toggle is Enabled
And I Select the Availability as Date Range with Time
Then Check the Update button is Disabled
And I Select the Start Date
Then Check the Update button is Disabled
And I Select the End Date
Then Check the Update button is Disabled
And I Enable Restriction Days Toggle
Then Check the Update button is Disabled
And I Selecting the Restriction Days
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

Scenario: Update the Reroute By Node with Availability as All Days
Given I Search and Edit the Reroute By Node
Then I Verify the Selected Availability as Date Range with Time
And I Select the Availability as All Days
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not
And I Search and Edit the Reroute By Node
Then I Verify the Selected Availability as All Days
And I Click the Cancel button

Scenario: Verify whether Unable to Deleted the Reroute By Node Clicking Cancel/No button
And I Select Printers Tab
Given I Search the Reroute By Node and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Reroute By Node Deleted/Inactivated or Not

Scenario: Verify whether Able to Deleted the Reroute By Node Clicking Delete/Yes button
Given I Search the Reroute By Node and Click the Delete button
And I Click the Delete button
Then I Verifying the Reroute By Node Deleted or Not

@RerouteByRole
Scenario: Verify the New Reroute By Role Page header
And I Select Reroute By Role Tab
Given I Click the New Reroute By Role button
When Verify the New Re-Route By Role Header

@RerouteByRole
Scenario: Verify able to Create a New Re-Route By Role without Selecting Role
And I Select Reroute By Role Tab
And I Click the New Reroute By Role button
And I Select From Printer
And I Select To Printer
Then Check the Save button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify able to Create a New Re-Route By Role without Selecting From Printer
And I Select Reroute By Role Tab
And I Click the New Reroute By Role button
And I Select Role
And I Select To Printer
Then Check the Save button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify able to Create a New Re-Route By Role without Selecting To Printer
And I Select Reroute By Role Tab
And I Click the New Reroute By Role button
And I Select Role
And I Select From Printer
Then Check the Save button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify able to Create a New Re-Route By Role By Selecting Same From Printer to To Printer
And I Select Reroute By Role Tab
And I Click the New Reroute By Role button
And I Select Role
And I Select From Printer
And I Select Same To Printer
Then Check From and To Printers Should Not be Same Error is Displayed
Then Check the Save button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify able to Create a New Re-Route By Role By Enabling Restriction Time and without Selecting Times
And I Select Reroute By Role Tab
And I Click the New Reroute By Role button
And I Select Role
And I Select From Printer
And I Select To Printer
And I Enable the Restriction Time Toggle
Then Check the Save button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify able to Create a New Re-Route By Role By Enabling Restriction Time and without Selecting End Time
And I Select Reroute By Role Tab
And I Click the New Reroute By Role button
And I Select Role
And I Select From Printer
And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the Start Time in Restriction Time
Then Check the Save button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify able to Create a New Re-Route By Role By Enabling Restriction Time and without Selecting Start Time
And I Select Reroute By Role Tab
And I Click the New Reroute By Role button
And I Select Role
And I Select From Printer
And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the End Time in Restriction Time
Then Check the Save button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Create a New Printer Reroute by Role
And I Select Reroute By Role Tab
And I Click the New Reroute By Role button
And I Select Role
And I Select From Printer
And I Select To Printer
And I Select the Availability as All Days
And I Click the Save button
Then Verify whether the Printer Reroute Saved or Not

@RerouteByRole
Scenario: Verify the Update header by Editing Saved Reroute By Role
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
When Verify the Update Reroute By Role Header

@RerouteByRole
Scenario: Verify whether we can able to Cancel/Close the Reroute By Role Update screen
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
And I Click the Cancel button
Then I Verify Reroute By Role Update screen Close or Not

@RerouteByRole
Scenario: Verify Unable to Update the Re-Route By Role By Selecting Same From Printer to To Printer
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
#And I Select Role
#And I Select From Printer
And I Select Same To Printer
Then Check From and To Printers Should Not be Same Error is Displayed
Then Check the Update button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify Unable to Update Re-Route By Role By Enabling Restriction Time and without Selecting Times
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
#And I Select Role
#And I Select From Printer
#And I Select To Printer
And I Enable the Restriction Time Toggle
Then Check the Update button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify Unable to Update Re-Route By Role By Enabling Restriction Time and without Selecting End Time
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
#And I Select Role
#And I Select From Printer
#And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the Start Time in Restriction Time
Then Check the Update button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Verify Unable to Update Re-Route By Role By Enabling Restriction Time and without Selecting Start Time
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
#And I Select Role
#And I Select From Printer
#And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the End Time in Restriction Time
Then Check the Update button is Disabled
And I Click the Cancel button

@RerouteByRole
Scenario: Update the Reroute By Role by Enabling Restriction Time
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
#And I Select Role
#And I Select From Printer
#And I Select To Printer
And I Enable the Restriction Time Toggle
And I Select the Start Time in Restriction Time
And I Select the End Time in Restriction Time
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

@RerouteByRole
Scenario: Update the Reroute By Role with Availability as Days of Week
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
#And I Select Role
#And I Select From Printer
#And I Select To Printer
Then I Verify the Selected Availability as All Days
Then Check Restriction Time Toggle is Enabled
And I Select the Availability as Days of Week
Then Check the Update button is Disabled
And I Selecting the Days
#And I Select the Start Time in Restriction Time
#And I Select the End Time in Restriction Time
And I Disable the Restriction Time Toggle
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

@RerouteByRole
Scenario: Update the Reroute By Role with Availability as Days of Month
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
#And I Select Role
#And I Select From Printer
#And I Select To Printer
Then I Verify the Selected Availability as Days of Week
Then Check Restriction Time Toggle is Disabled
And I Select the Availability as Days of Month
Then Check the Update button is Disabled
And I Selecting the Days Of Months
Then Check the Update button is Enabled
And I Enable the Restriction Months Toggle
Then Check the Update button is Disabled
And I Selecting the Restriction Months
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

@RerouteByRole
Scenario: Update the Reroute By Role with Availability as Date Range
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
#And I Select Role
#And I Select From Printer
#And I Select To Printer
Then I Verify the Selected Availability as Days of Month
And I Select the Availability as Date Range
Then Check the Update button is Disabled
And I Select the Start Date
Then Check the Update button is Disabled
And I Select the End Date
Then Check the Update button is Enabled
And I Enable Restriction Days Toggle
Then Check the Update button is Disabled
And I Selecting the Restriction Days
Then Check the Update button is Enabled
And I Enable the Restriction Time Toggle
Then Check the Update button is Disabled
And I Select the Start Time in Restriction Time
Then Check the Update button is Disabled
And I Select the End Time in Restriction Time
Then Check the Update button is Enabled
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

@RerouteByRole
Scenario: Update the Reroute By Role with Availability as Specific Date
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
Then I Verify the Selected Availability as Date Range
Then Check Restriction Days Toggle is Enabled
Then Check Restriction Time Toggle is Enabled
And I Select the Availability as Specific Date
Then Check the Update button is Disabled
And I Select the Specific Date
#Then Check the Update button is Enabled
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

@RerouteByRole
Scenario: Update the Reroute By Role with Availability as Date Range with Time
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
Then I Verify the Selected Availability as Specific Date
Then Check Restriction Days Toggle is Enabled
Then Check Restriction Time Toggle is Enabled
And I Select the Availability as Date Range with Time
Then Check the Update button is Disabled
And I Select the Start Date
Then Check the Update button is Disabled
And I Select the End Date
Then Check the Update button is Disabled
And I Enable Restriction Days Toggle
Then Check the Update button is Disabled
And I Selecting the Restriction Days
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not

@RerouteByRole
Scenario: Update the Reroute By Role with Availability as All Days
And I Select Reroute By Role Tab
Given I Search and Edit the Reroute By Role
Then I Verify the Selected Availability as Date Range with Time
And I Select the Availability as All Days
And I Click the Update button
Then Verify whether the Printer Reroute Updated or Not
And I Search and Edit the Reroute By Role
Then I Verify the Selected Availability as All Days
And I Click the Cancel button

@RerouteByRole
Scenario: Verify whether Unable to Deleted the Reroute By Role Clicking Cancel/No button
And I Select Reroute By Role Tab
And I Select Printers Tab
Given I Search the Reroute By Role and Click the Delete button
 And I Click the Cancel button in Pop Up
Then Verify the Cancelled Reroute By Role Deleted/Inactivated or Not

@RerouteByRole
Scenario: Verify whether Able to Deleted the Reroute By Role Clicking Delete/Yes button
And I Select Reroute By Role Tab
Given I Search the Reroute By Role and Click the Delete button
And I Click the Delete button
Then I Verifying the Reroute By Role Deleted or Not






