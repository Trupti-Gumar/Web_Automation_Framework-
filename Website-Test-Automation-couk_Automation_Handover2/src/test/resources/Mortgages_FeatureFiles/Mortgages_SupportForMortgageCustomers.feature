#masthead

@Support_for_mortgage_customers

Feature: Support for mortgage customers
I want to verify the components in this page.

Scenario Outline: Verify Support for mortgage customers page 
Given I am on a Aldermore page
When  I navigate to Mortgages dropdown option
Then  I should see the "<headerlink>" as options  
When  I click on the link
Then  I should be redirected to the "<pageTitle>"

	Examples: 
		| headerlink 	   	   			 			 | pageTitle		 	  	  |
		| Support for mortgage customers | Mortgages help and support |