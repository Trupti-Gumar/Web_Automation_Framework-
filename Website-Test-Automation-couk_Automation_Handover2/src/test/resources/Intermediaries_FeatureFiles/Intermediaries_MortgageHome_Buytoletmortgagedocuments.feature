@Buytoletmortgagedocuments
Feature: Buytolet mortgage documents page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Buytolet mortgage documents link
    Then I should navigate to Buytolet mortgage documents page

  @Masthead
  Scenario Outline: Verify the Buytolet mortgage documents page header
    And I should see the "<header>" as the header for the Buytolet mortgage documents page

    Examples: 
      | header                 													 |
      | Buy to let mortgage documents for intermediaries	 |

 
  @Cards
   Scenario Outline: Verify the cards present on the page.
    And I should see this "<CardTitle>" cards on the Buytolet mortgage documents page
    
    Examples: 
     | CardTitle                        					  |
     | Residential mortgage documents   						|
     | Product switching documents 									|
     | Commercial mortgage documents							 	|
     
   @Cards
   Scenario Outline: Verify the cardlink redirect to the respective page.
    And I should be able to click on this "<CardTitle>" cardlink on the Buytolet mortgage documents page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             												| pageHeader																 			   |
     | Residential mortgage documents   					  | Residential Mortgage Documents - Intermediaries    |
     | Product switching documents 									| Mortgage Product Switch Documents - Intermediaries |
     | Commercial mortgage documents							 	| Commercial Mortgage Documents - Intermediaries     |
      
 