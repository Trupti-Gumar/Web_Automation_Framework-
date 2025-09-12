@Productswitchdocuments
Feature: Product switch documents page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Product switch documents link
    Then I should navigate to Product switch documents page

  @Masthead
  Scenario Outline: Verify the Product switch documents page header
    And I should see the "<header>" as the header for the Product switch documents page

    Examples: 
      | header                 													       |
      | Mortgage product switch documents for intermediaries	 |

 
  @Cards
   Scenario Outline: Verify the cards present on the page.
    And I should see this "<CardTitle>" cards on the Product switch documents page
    
    Examples: 
     | CardTitle                        					  |
     | Buy to let mortgage documents   					  	|
     | Residential mortgage documents 							|
     | Commercial mortgage documents							 	|
     
   @Cards
   Scenario Outline: Verify the cardlink redirect to the respective page.
    And I should be able to click on this "<CardTitle>" cardlink on the Product switch documents page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             												| pageHeader																 			   |
     | Buy to let mortgage documents   					    | Buy to Let Mortgage Documents - Intermediaries     |
     | Residential mortgage documents 							| Residential Mortgage Documents - Intermediaries    |
     | Commercial mortgage documents							 	| Commercial Mortgage Documents - Intermediaries     |
      
 