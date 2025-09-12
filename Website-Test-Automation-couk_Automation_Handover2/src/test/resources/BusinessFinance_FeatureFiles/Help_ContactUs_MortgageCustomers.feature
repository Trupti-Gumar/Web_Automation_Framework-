@Savings_customers

Feature: Mortgage customers
I want to verify the component in  this page

Background: 
Given On this Aldermore Home page
Then  I navigate to Contact Us page under Help and Support option


Scenario Outline: Verify the Mortgage customers header
	Then  See this "<cardName>" CTA button
	When  clicked on the CTA card button
	Then  navigate to respective "<pageTitle>" page
   
   	  Examples:
		   | cardName   | pageTitle                      		         |
	     | Mortgages  | Contact information for mortgage customers |
		 
 
Scenario Outline: Verify "<TextHeader>" present under page
	Then  I navigate to Mortgage customers page
	And   I should see this "<TextHeader>" under the page 
	
	  Examples:
		   | TextHeader       	                 			    | 
	     | Residential and buy to let mortgage customers|

	     
   
Scenario: Verify Contact information for Mortgage customers expands options
	Then  I navigate to Mortgage customers page
	And   I should be click on Contact information for mortgage customers accordian and it should expand 
	