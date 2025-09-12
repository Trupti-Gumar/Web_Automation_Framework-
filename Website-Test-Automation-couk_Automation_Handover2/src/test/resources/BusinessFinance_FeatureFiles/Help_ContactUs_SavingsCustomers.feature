@Savings_customers

Feature: Savings customers
I want to verify the component in  this page

Background: 
Given On the Aldermore Home page
Then  I navigate to the ContactUs page under Help and Support option


Scenario Outline: Verify the Savings customers header
	Then  See the "<cardName>" CTA button
	When  clicked the CTA card button
	Then  navigated to respective "<pageTitle>" page
   
   	  Examples:
		   | cardName | pageTitle                      		   |
	     | Savings  | Contact information for savings customers |
		 
 
Scenario Outline: Verify "<TextHeader>" present under page
	Then  I navigate to Savings customers page
	And   I should see the "<TextHeader>" under the page 
	
	  Examples:
		   | TextHeader       	                 			| 
	     | Contact information for savings customers|

	     
   
Scenario: Verify Contact information for savings customers expands options
	Then  I navigate to Savings customers page
	And   I should be click on Contact information for savings customers accordian and it should expand 
	