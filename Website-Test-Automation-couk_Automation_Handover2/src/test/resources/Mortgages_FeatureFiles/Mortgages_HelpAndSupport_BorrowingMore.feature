
@Borrowing_more

Feature: Borrowing more
I want to verify the components in this page.

Background: 
Given I am on a Aldermore page
When  I navigate to Mortgages dropdown option

@MortgagesBorrowingMore
Scenario Outline: Verify Borrowing more page 
Then  I should see the "<headerlink>" as options  
When  Clicked the link
Then  I should be redirected to the "<pageTitle>"

Examples: 
	| headerlink 	   | pageTitle	|
	| Borrowing more | Borrow more|
	
	
@ImageSectionHeader
Scenario Outline: Verify headers on Image copy section
Then  I navigate to Borrowing more page 	
Then  "<header>" on the Image section 

Examples: 
	| header 								  |
	| Here's what you could borrow money for: |
	| Our eligibility checklist				  |
	
	
#@ImageSectionLink	
#Scenario Outline: Verify links on Image copy section
#Then  I navigate to Borrowing more page
#And   I will click the "<link>" on the ImageSection
#Then  It will redirected to "<PageTitle>"
#
#Examples: 
#	|link         | PageTitle								                   |
#	|Get in touch | Contact information for mortgage customers |



@QuickSectionLink	
Scenario Outline: Verify links on Image copy section
Then  I navigate to Borrowing more page
And   I will click the "<link>" on the QuickLinkSection
Then  It will redirected to "<PageTitle>"

Examples: 
	|link                   | PageTitle								                   |
	|Income and expenditure | Income and expenditure form |
