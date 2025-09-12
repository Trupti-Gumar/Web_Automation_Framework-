
@Mortgages_MortagagesHelpAndSupport_ContactUs

	Feature: Mortgages Contact Us
  I want to verify the component in Contact Us page
  
  Background: 
	Given Aldermore home dispalyed 
	When  I navigate to Mortgages help and support page
	
	
@MortgagesContactUs
Scenario Outline: Verify the Contact Us header
	Then  "<cardName>" displayed
	When  clicked Card
	Then  "<pageTitle>" displayed as redirected
   
   	  Examples:
		   | cardName  | pageTitle    |
	     | Contact us| Contact information for mortgage customers|
	     
@SubheaderMortgageContactUs
Scenario Outline: Verify the subheader on the page
  Then I will navigate to Contact us page
  And "<Subheader>" will be present on the page
  
  Examples: 
  |Subheader                                    |
  |Residential and buy to let mortgage customers|
  |Commercial mortgage customers                |