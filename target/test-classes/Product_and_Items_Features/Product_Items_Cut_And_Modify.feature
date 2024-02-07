#@Product/Items
#@CutAndModify
Feature: Product and Items - Cut and Modify
  I am verify the Product/Items-Cut and Modify module by Add/Edit/Delete/Activate/Duplicate

#Scenario: Login to the Application
#Given Open the Browser and Enter URL
#When I Select the Store after Login to Application when Enter Username and Passowrd
Background: Opening the Cut and Modify page
Given Open the Cut and Modify home page BaseURL and StoreID

Scenario: Verify whether the Cut and Modify Header is Displayed
Given Verifying the Cut and Modify Header Page

Scenario: Verify Path Displayed above the Header
Given Verifying the Path Home / Product/Items / Cut and Modify Displayed above the Header

Scenario: Verify Selected Home in Path
Given Verifying the Path Home / Product/Items / Cut and Modify Displayed
And I Select Home in Path
Then Verify Page Navigate to Home Page

Scenario: Verify field under Cut and Modify is Displayed
Then Verify the Slice Fraction header in Cut and Modify is Displayed
Then Verify the Modifier Price Percentage header in Cut and Modify is Displayed

Scenario: Verify the Default Values under Slice Fraction
And I Check Slice Second Franction Value 
And I Check Slice Third Franction Value 
And I Check Slice Fourth Franction Value 

  #Scenario: Verify the Default Values under Modifier Price Percentage
    #And I Check Value 55.00% in First Row
    #And I Check Value 40.00% in Second Row
    #And I Check Value 30.00% in Third Row

Scenario: Verify by Default Save button Should be Disabled
Then Check the Save button is Disabled

  #//Scenario: Verify Slice Fraction values should be Non-Editable
    #And I Try To Edit Value 2
    #Then Verify Slice Fraction should be Non-Editable and It will Not allow to Edit the value

  #Scenario: Verify whether application allow us to save without any changes
    #And I Click the Save button
    #Then Verify without any changes should not allow us to save by default the save option is disabled

Scenario: Verify Increase Arrow in the Modifier Price Percentage
And I Click the Up Arrow for First Slice and Check the Increased Value
And I Click the Up Arrow for Second Slice and Check the Increased Value
And I Click the Up Arrow for Third Slice and Check the Increased Value

Scenario: Verify Decrease Arrow in the Modifier Price Percentage
And I Click the Down Arrow for First Slice and Check the Decreased Value
And I Click the Down Arrow for Second Slice and Check the Decreased Value
And I Click the Down Arrow for Third Slice and Check the Decreased Value

Scenario: Saving Modifier Price Percentage above 100% for Slice Fraction 2
And I Enter the Second Slice Fraction Modifier Price Percentage above the Limit
And I Click the Save button
Then Check Please enter less than 100 Percentage Error Message is Displayed
 		
Scenario: Saving Modifier Price Percentage above 100% for Slice Fraction 3
And I Enter the Second Slice Fraction Modifier Price Percentage
And I Enter the Third Slice Fraction Modifier Price Percentage above the Limit
And I Click the Save button
Then Check Please enter less than 100 Percentage Error Message is Displayed
 		
Scenario: Saving the Modifier Price Percentage above 100% for Slice Fraction 4
And I Enter the Third Slice Fraction Modifier Price Percentage
And I Enter the Fourth Slice Fraction Modifier Price Percentage above the Limit
And I Click the Save button
Then Check Please enter less than 100 Percentage Error Message is Displayed
 		
Scenario: Saving the Modifier Price Percentage for All Slice Fraction
And I Enter the Second Slice Fraction Modifier Price Percentage
And I Enter the Third Slice Fraction Modifier Price Percentage
And I Enter the Fourth Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
 		
Scenario: Changing the Modifier Price Percentage for Second Slice Fraction
And I Change the Second Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Updated Second Slice Fraction Modifier Price Percentage
 		
Scenario: Changing the Modifier Price Percentage for Third Slice Fraction
And I Change the Third Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Updated Third Slice Fraction Modifier Price Percentage
 		
Scenario: Changing the Modifier Price Percentage for Fourth Slice Fraction
And I Change the Fourth Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Updated Fourth Slice Fraction Modifier Price Percentage

Scenario: Increasing the Modifier Price Percentage for Second Slice Fraction
And I Click the Up Arrow the Second Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Increased Second Slice Fraction Modifier Price Percentage
 		
Scenario: Increasing the Modifier Price Percentage for Third Slice Fraction
And I Click the Up Arrow the Third Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Increased Third Slice Fraction Modifier Price Percentage
 		
Scenario: Increasing the Modifier Price Percentage for Fourth Slice Fraction
And I Click the Up Arrow the Fourth Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Increased Fourth Slice Fraction Modifier Price Percentage

Scenario: Decreasing the Modifier Price Percentage for Second Slice Fraction
And I Click the Down Arrow the Second Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Decreased Second Slice Fraction Modifier Price Percentage
 		
Scenario: Decreasing the Modifier Price Percentage for Third Slice Fraction
And I Click the Down Arrow the Third Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Decreased Third Slice Fraction Modifier Price Percentage
 		
Scenario: Decreasing the Modifier Price Percentage for Fourth Slice Fraction
And I Click the Down Arrow the Fourth Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not
And I Reload the Cut and Modify Page
Then Check the Decreased Fourth Slice Fraction Modifier Price Percentage

Scenario: Updating the Modifier Price Percentage for All Slice Fractions
And I Enter the Second Slice Fraction Modifier Price Percentage
And I Enter the Third Slice Fraction Modifier Price Percentage
And I Enter the Fourth Slice Fraction Modifier Price Percentage
And I Click the Save button
Then Verify the Cut and Modify Saved Successfully or not

Scenario: Check the Updated Modifier Price Percentage to All Slice Fraction after Refresh/Reload
And I Reload the Cut and Modify Page
Then Check the Updated Second Slice Fraction Modifier Price Percentage
Then Check the Updated Third Slice Fraction Modifier Price Percentage
Then Check the Updated Fourth Slice Fraction Modifier Price Percentage

  #Scenario: Verify Increase Arrow in the Modifier Price Percentage.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Increase Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase Arrow in the Modifier Price Percentage.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Increase Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase Arrow in the Modifier Price Percentage.
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Increase Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease Arrow in the Modifier Price Percentage.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Decrease Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease Arrow in the Modifier Price Percentage.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Decrease Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease Arrow in the Modifier Price Percentage.
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Decrease Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify the Selected Increase Value Selected After Refresh
    #Given Reload the Cut and Modify Page
    #Then I Check Slice Fraction 2 with Selected Value in Modifier  Price Increase Percentage
    #Then I Check Slice Fraction 3 with Selected Value in Modifier  Price Increase Percentage
    #Then I Check Slice Fraction 4 with Selected Value in Modifier  Price Increase Percentage
#
  #Scenario: Verify the Selected Decrease Value Selected After Refresh
    #Given Reload the Cut and Modify Page
    #Then I Check Slice Fraction 2 with Selected Value in Modifier  Price Decrease Percentage
    #Then I Check Slice Fraction 3 with Selected Value in Modifier  Price Decrease Percentage
    #Then I Check Slice Fraction 4 with Selected Value in Modifier  Price Decrease Percentage
#
  #Scenario: Verify the Selected Increase value Selected After Reload entire page
    #Given Reload the Cut and Modify Page
    #Then I Check Slice Fraction 2 with Selected Value in Modifier  Price Increase Percentage
    #Then I Check Slice Fraction 3 with Selected Value in Modifier  Price Increase Percentage
    #Then I Check Slice Fraction 4 with Selected Value in Modifier  Price Increase Percentage
#
  #Scenario: Verify the Selected Decrease Value Selected After Reload entire page
    #Given Reload the Cut and Modify Page
    #Then I Check Slice Fraction 2 with Selected Value in Modifier  Price Decrease Percentage
    #Then I Check Slice Fraction 3 with Selected Value in Modifier  Price Decrease Percentage
    #Then I Check Slice Fraction 4 with Selected Value in Modifier  Price Decrease Percentage
#
  #Scenario: Verify Increase the Modifier Price Percentage by Increase Arrow for Two Slice Fraction.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Increase Arrow
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Increase Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Increase Arrow for Two Slice Fraction.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Increase Arrow
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Increase Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Increase Arrow for Two Slice Fraction.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Increase Arrow
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Increase Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Decrease Arrow for Two Slice Fraction.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Decrease Arrow
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Decrease Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Decrease Arrow for Two Slice Fraction.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Decrease Arrow
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Decrease Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Decrease Arrow for Two Slice Fraction.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Decrease Arrow
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Decrease Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Increase Arrow for Three Slice Fraction.
    #And I Check Value 55.00% in First Row
    #And I Click Increase Arrow
    #And I Check Value 40.00% in Second Row
    #And I Click Increase Arrow
    #And I Check Value 30.00% in Third Row
    #And I Click Increase Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Decrease Arrow for Three Slice Fraction
    #And I Check Value 55.00% in First Row
    #And I Click Decrease Arrow
    #And I Check Value 40.00% in Second Row
    #And I Click Decrease Arrow
    #And I Check Value 30.00% in Third Row
    #And I Click Decrease Arrow
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Manually
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Manually
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Manually
    #And I Check Value 4 in Second Row
    #And I Check Value 30.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Manually
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Decrease Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Manually
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Decrease Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Manually
    #And I Check Value 4 in Second Row
    #And I Check Value 30.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Decrease Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Increase Arrow for Two Slice Fraction.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Increase Arrow for Two Slice Fraction.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Increase the Modifier Price Percentage by Increase Arrow for Two Slice Fraction.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Increase Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Decrease Arrow for Two Slice Fraction.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Decrease Percentage Manually.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Decrease Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Decrease Arrow for Two Slice Fraction.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Decrease Decrease Percentage Manually.
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Decrease the Modifier Price Percentage by Decrease Arrow for Two Slice Fraction.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Decrease Percentage Manually.
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Third Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Decrease Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Minimum Percentage in the Modifier Price Percentage by Decrease Arrow.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Decrease Arrow
    #Then Verify the Minimum Value Zero is Displaying or not
#
  #Scenario: Verify Minimum Percentage in the Modifier Price Percentage by Decrease Arrow.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Decrease Arrow
    #Then Verify the Minimum Value Zero is Displaying or not
#
  #Scenario: Verify Minimum Percentage in the Modifier Price Percentage by Decrease Arrow.
    #And I Check Value 4 in Third  Row
    #And I Check Value 30.00% in Thirs  Row
    #And I Click Decrease Arrow
    #Then Verify the Minimum Value Zero is Displaying or not
#
  #Scenario: Verify Maximum Percentage in the Modifier Price Percentage by Increase Arrow.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Increase Arrow
    #Then Verify the Maximum Value Zero is Displaying or not
#
  #Scenario: Verify Minimum Percentage in the Modifier Price Percentage by Increase Arrow.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Increase Arrow
    #Then Verify the Maximum Value Zero is Displaying or not
#
  #Scenario: Verify Minimum Percentage in the Modifier Price Percentage by Increase Arrow.
    #And I Check Value 4 in Third  Row
    #And I Check Value 30.00% in Thirs  Row
    #And I Click Increase Arrow
    #Then Verify the Maximum Value Zero is Displaying or not
#
  #Scenario: Verify Zero Percentage in the Modifier Price Percentage by Manually.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Zero Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Zero Percentage in the Modifier Price Percentage by Manually
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Zero Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Zero Percentage in the Modifier Price Percentage by Manually
    #And I Check Value 4 in Third  Row
    #And I Check Value 30.00% in Thirs  Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Zero Percentage Manually.
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Zero Percentage in the Modifier Price Percentage by Decrease Arrow.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Decrease Arrow
    #And I Set Zero Percentage
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Zero Percentage in the Modifier Price Percentage by Decrease Arrow.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Decrease Arrow
    #And I Set Zero Percentage
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Zero Percentage in the Modifier Price Percentage by Decrease Arrow.
    #And I Check Value 4 in Third  Row
    #And I Check Value 30.00% in Thirs  Row
    #And I Click Decrease Arrow
    #And I Set Zero Percentage
    #And I Click the Save button
    #Then Verify the Cut and Modify Saved Successfully or not
#
  #Scenario: Verify Zero Percentage displaying by Selected Back Space in the Modifier Price Percentage by Manually.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #Then Verify the Zero Percentage displaying or not
#
  #Scenario: Verify Zero Percentage displaying by Selected Back Space in the Modifier Price Percentage by Manually.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Remove Percentage by selecting Back Space
    #Then Verify the Zero Percentage displaying or not
#
  #Scenario: Verify Zero Percentage displaying by Selected Back Space in the Modifier Price Percentage by Manually.
    #And I Check Value 4 in Third  Row
    #And I Check Value 30.00% in Thirs  Row
    #And I Click Remove Percentage by selecting Back Space
    #Then Verify the Zero Percentage displaying or not
#
  #Scenario: Verify More Than 100 Percentage in the Modifier Price Percentage by Manually.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter More Than 100 Percentage Manually.
    #And I Click the Save button
    #Then Verify the Please Enter Less Than 100 Percentage or not
#
  #Scenario: Verify More Than 100 Percentage in the Modifier Price Percentage by Manually
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter More Than 100 Percentage Manually.
    #And I Click the Save button
    #Then Verify the Please Enter Less Than 100 Percentage or not
#
  #Scenario: Verify More Than 100 Percentage in the Modifier Price Percentage by Manually
    #And I Check Value 4 in Third  Row
    #And I Check Value 30.00% in Thirs  Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter More Than 100 Percentage Manually.
    #And I Click the Save button
    #Then Verify the Please Enter Less Than 100 Percentage or not
#
  #Scenario: Verify More Than 100 Percentage in the Modifier Price Percentage by Increase Arrow.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Increase Arrow
    #And I Set More Than 100 Percentage
    #And I Click the Save button
    #Then Verify the Please Enter Less Than 100 Percentage or not
#
  #Scenario: Verify More Than 100 Percentage in the Modifier Price Percentage by Increase Arrow.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Increase Arrow
    #And I Set More Than 100 Percentage
    #And I Click the Save button
    #Then Verify Please Enter Less Than 100 Percentage or not
#
  #Scenario: Verify More Than 100 Percentage in the Modifier Price Percentage by Increase Arrow.
    #And I Check Value 4 in Third  Row
    #And I Check Value 30.00% in Thirs  Row
    #And I Click Increase Arrow
    #And I Set More Than 100 Percentage
    #And I Click the Save button
    #Then Verify the Please Enter Less Than 100 Percentage or not
#
  #Scenario: Verify Negative Percentage in the Modifier Price Percentage by Decrease Zero.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Decrease Arrow
    #And I Set Negative Percentage
    #Then Verify should not allow to enter Nagative value
#
  #Scenario: Verify Negative Percentage in the Modifier Price Percentage by Decrease Zero.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Decrease Arrow
    #And I Set Negative Percentage
    #Then Verify should not allow to enter Nagative value
#
  #Scenario: Verify Negative Percentage in the Modifier Price Percentage by Decrease Zero.
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Thirs Row
    #And I Click Decrease Arrow
    #And I Set Negative Percentage
    #Then Verify should not allow to enter Nagative value
#
  #Scenario: Verify Negative Percentage in the Modifier Price Percentage by Manually Decrease.
    #And I Check Value 2 in First Row
    #And I Check Value 55.00% in First Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Negative Decrease Percentage Manually.
    #Then Verify should not allow to enter Nagative value
#
  #Scenario: Verify Negative Percentage in the Modifier Price Percentage by Manually Decrease.
    #And I Check Value 3 in Second Row
    #And I Check Value 40.00% in Second Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Negative Decrease Percentage Manually.
    #Then Verify should not allow to enter Nagative value
#
  #Scenario: Verify Negative Percentage in the Modifier Price Percentage by Manually Decrease.
    #And I Check Value 4 in Third Row
    #And I Check Value 30.00% in Thirs Row
    #And I Click Remove Percentage by selecting Back Space
    #And I Enter Negative Decrease Percentage Manually.
    #Then Verify should not allow to enter Nagative value









