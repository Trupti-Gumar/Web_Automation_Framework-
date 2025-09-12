@First_time_buyer_mortgages

Feature: First time buyer mortgages  
I want to verify the component in this page.

 Background: 
    Given I am on the Aldermore page
    When  I navigate to Mortgages dropdown option 

@FirstTimePageTitle
Scenario Outline: Verify First time buyer mortgages header
Then  I should see "<MenuItem>" as a Link in Mortgage dropdown 
And   I click on the option link
Then  I should be redirected to the Mortgage option "<PageTitle>"

Examples:
    |MenuItem                   | PageTitle				    |
    |First time buyer mortgages | First time buyer mortgages|

@ImageSection
Scenario Outline: Verify headers on Image copy section
And   I navigate to First time buyer mortgages page 	
Then  I should see the "<header>" on Image section 

Examples: 
	|header 		                  |
	|We take a different approach |
	|Real life stories|

@FAQHeader
Scenario Outline: Verify First time buyer mortgages FAQs section links 
Then I navigate to First time buyer mortgages page 	 
And  I should see the First time mortgages FAQs header "<header>" on page
And  I should see the more card header "<moreCardHeader>" on First timer FAQs section
And  I should click on FAQs CTA button and should be redirected to "<pageTitle>" page

 Examples:      
 			| header             				      | moreCardHeader      							  | pageTitle 		 |
      | First time buyer mortgages FAQs | Not found what you're looking for?  | Mortgage FAQs  |                                                                                     

@CardHeader
Scenario Outline: Verify Cardheader present on First Time buyer mortgages 
Then I navigate to First time buyer mortgages page 
And  I should see "<cardheader>" present on the First Timer Buyer Page

Examples:
  |cardheader                                         |
  |Self-employed mortgages                            |
  |Mortgages for customers with credit problems       |
  |Buy to let mortgages                               |
  |Why use a mortgage broker? Here’s 10 great reasons |
  |Divorce and mortgages – What you need to know      |
  
@CTAButton
 Scenario Outline: Verify CTA present on the ImageSection 
 Then I navigate to First time buyer mortgages page
 When I should click the CTA button present on the Image section  
 Then I should be redirected to the CTA button title "<page>"
 
 Examples: 
 	 |page                                                                |
   |Real life stories: Aldermore supported us with buying our dream home|
