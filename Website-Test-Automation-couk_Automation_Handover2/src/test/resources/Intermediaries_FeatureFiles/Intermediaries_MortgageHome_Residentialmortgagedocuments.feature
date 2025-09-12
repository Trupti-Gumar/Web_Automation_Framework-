@Residentialmortgagedocuments
Feature: Residential mortgage documents page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Residential mortgage documents link
    Then I should navigate to Residential mortgage documents page

  @Masthead
  Scenario Outline: Verify the Residential mortgage documents page header
    And I should see the "<header>" as the header for the Residential mortgage documents page

    Examples: 
      | header                 														 |
      | Residential mortgage documents for intermediaries	 |

 
  @Cards
   Scenario Outline: Verify the cards present on the page.
    And I should see this "<CardTitle>" cards on the Residential mortgage documents page
    
    Examples: 
     | CardTitle                        					  |
     | Buy to let mortgage documents   							|
     | Product switching documents 									|
     | Commercial mortgage documents							 	|
     
   @Cards
   Scenario Outline: Verify the cardlink redirect to the respective page.
    And I should be able to click on this "<CardTitle>" cardlink on the Residential mortgage documents page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             												| pageHeader																 			|
     | Buy to let mortgage documents   						  | Buy to Let Mortgage Documents - Intermediaries  |
     | Product switching documents 									| Mortgage Product Switch Documents - Intermediaries |
     | Commercial mortgage documents							 	| Commercial Mortgage Documents - Intermediaries |
      
 