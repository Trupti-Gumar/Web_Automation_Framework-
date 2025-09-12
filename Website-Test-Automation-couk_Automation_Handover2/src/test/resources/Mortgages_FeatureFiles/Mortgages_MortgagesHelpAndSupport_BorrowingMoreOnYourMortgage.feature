
@Borrowing_more_on_your_mortgage

Feature: Borrowing more on your mortgage
I want to verify the component in  this page

Background:
	Given Aldermore home dispalyed 
	When  I navigate to Mortgages help and support page
	
@CardName	
Scenario Outline: Verify the Borrowing more on your mortgage header
	Then  "<cardName>" CTA button is visible
	When  clicked Card CTA button
	Then  "<pageTitle>" should be visible
   
   	  Examples:
		 | cardName  					               | pageTitle   |
	     | Borrowing more on your mortgage | Borrow more |	 
	
@ImageSectionHeader	 
Scenario Outline: Verify the Image copy section contents on the page
	Then  I navigate to Borrowing more on your mortgage page
	And   I see the "<headers>" in the ImageSection

	  Examples: 
		| headers       							            |
		| Here's what you could borrow money for: |
		| Our eligibility checklist               |
		| Get in touch														|
		
@ImageSectionCTAButton		
Scenario Outline: Verify the "<cardTitle>" Card present on the Image copy section contents 
	   Then  I navigate to Borrowing more on your mortgage page
	   And   I click the "<CTALink>" and rediretced to "<pageTitle>"
	
	  Examples: 
		| CTALink      | pageTitle									                |
		| Get in touch | Contact information for mortgage customers |
		
