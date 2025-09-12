@Login
Feature: Login page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Login link
    Then I should navigate to Login page

@Masthead
  Scenario Outline: Verify the Login page header
    And I should see the "<header>" as the header for the Login page

    Examples: 
      | header         |
      | Login centre	 |
      
      
@Navigationbar
Scenario Outline: Verify the "<NavigationBar>" present on the Login page 
	And I should see the NavigationBar options "<NavigationBar>" present on the Login page

   	  Examples:
		 | NavigationBar     | 
		 | All				 			 |
		 | Savings					 |
		 | Mortgages				 |
		 | Business finance	 |
		 
		 
Scenario Outline: Verify the "<TextHeader>" present on the Login page 
	And  I should see these Text headers "<TextHeader>" present on the Login page

   	  Examples:
		 | TextHeader  		  | 
		 | Savings					|
		 | Mortgages				|
		 | Business finance	|

@Cards		 
Scenario Outline: Verify the "<Cardheader>" present on the Login page 
	Then  I should see these card headers "<Cardheader>" present on the Login page

   	  Examples:
		 | Cardheader   	 										 		 | 
		 | Personal savings internet banking	 		 |
		 | Business savings internet banking	 		 |
		 | Residential mortgages broker portal 		 |
		 | Specialist buy to let mortgage portal	 |
		 | Asset finance Asset Backer 				 		 |
		 | Invoice finance E3					 				 		 |
 
		 
@Cards
   Scenario Outline: Verify the cardlink redirect to the respective page.
    And I should be able to click on this "<CardTitle>" cardlink on the Login page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             							 	| pageHeader						 					|
     | Personal savings internet banking	 	| Login 													|
		 | Business savings internet banking	 	| Log in  												|
		 | Residential mortgages broker portal 	| Aldermore Residential - Login   |
		 | Specialist buy to let mortgage portal| Aldermore Commercial - Login    |
		 | Asset finance Asset Backer  				 	| Log in													|
		 | Invoice finance E3									 	| E3 login page 									| 