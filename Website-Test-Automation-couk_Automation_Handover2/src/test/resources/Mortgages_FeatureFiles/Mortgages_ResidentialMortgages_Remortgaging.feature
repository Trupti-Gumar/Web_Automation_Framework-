@Remortgaging

Feature: Remortgaging
I want to verify the component in this page.

Scenario Outline: Verify Remortgaging header
Given I am on a Aldermore page
When  I click to Mortgages dropdown option
Then  I should see "<MenuItem>" as a Link
And   I click on the link 
Then  I should be redirected to the "<PageTitle>" page

Examples:
     |MenuItem    | PageTitle    |
     |Remortgaging| Remortgaging |
	 
	 
Scenario Outline: Verify headers on Image copy section
Given I am on a Aldermore page
When  I navigate to Remortgaging page 	
Then  I should see the "<header>" on the Image section 

Examples: 
	| header 	      	|
	| Contact a broker	|

Scenario Outline: Verify 'Residential mortgage FAQs' section links 
Given I am on a Aldermore page
When  I navigate to Remortgaging page 
Then  I navigate to 'Residential mortgage FAQs' accordion 
And   I should see the "<SectionLink>" header 
And   I should be able to click on "<SectionLink>" I should be able to expand and collapse the content 

Examples:
    |SectionLink                                                                                      |
    |My mortgage application was rejected by a high street bank. Can I get a mortgage with Aldermore? |
    |What is a decision in principle?                                                                 |
    |Can I get a mortgage before I've found a home to buy?                                            |
    |Can I get a mortgage if I'm not in the UK?                                                       |
	
	
Scenario Outline: Verify More FAQ Card 
Given I am on a Aldermore page
When  I navigate to Remortgaging page 
Then  I navigate to 'Residential mortgages FAQs' accordion 
And  I should see the "<Cardheader>" 
When   I click on "<CTALink>"
Then  I should be redirected to the "<PageTitle>"

Examples:
    |Card                                   | CTALink 				     | PageTitle				  |
    |Haven't found what you're looking for? | Mortgages help and support | Mortgages help and support |
