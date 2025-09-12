
@Managing_and_making_changes_to_your_mortgage

Feature: Managing and making changes to your mortgage
I want to verify the component in  this page 

Background:
	Given Aldermore home dispalyed 
	When  I navigate to Mortgages help and support page

@Managing_and_making_changes
Scenario Outline: Verify the Managing and making changes to your mortgage header
	Then  I see the "<cardName>" CTA button
	When  Clicked Card CTA Button
	Then  Naviagated to "<pageTitle>" page
   
   	  Examples:
		 | cardName  								                   	| pageTitle                                   |
	   | Managing and making changes to your mortgage | Managing and making changes to your mortgage|
		 
@HeaderTitle		 
 Scenario Outline: Verify the header Title on the page
	Then I navigate to Managing and making changes to your mortgage page
	And  I have seen the "<headerTitle>" on the page
	

	  Examples: 
	  |headerTitle	                   |
		|Making changes to your mortgage | 
		
@SubHeaderTitle		
 Scenario Outline: Verify the  subheader under the header
	Then  I navigate to Managing and making changes to your mortgage page
  And   I should see the "<Subheader>" present under header Title.
  
  Examples:
  |Subheader|
  |Can I make a change to my mortgage term?|
  |Can I change my repayment type?|
  |I'd like to move home - can I take my existing mortgage with me?|
  |How do I change the name on my mortgage?|
  |How do I add or remove someone from my account?|
	|Can I take out additional borrowing?|
	|How do I switch to a new mortgage rate?|
	|I would like to start renting my home. Can you help?|