@Insights
Feature: Insights page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Insights link
    Then I should navigate to Insights page

  @Masthead
  Scenario Outline: Verify the Insights page header
    And I should see the "<header>" as the header for the Insights page

    Examples: 
      | header                 					       |
      | Insights for mortgage intermediaries	 |

 
  @Cards
   Scenario Outline: Verify the cards present on the page.
    And I should see this "<CardTitle>" cards on the Insights page
    
    Examples: 
     | CardTitle                        			|
     | Storm before the Calm?   					  	|
     | Understanding the New Build Sector			|
     | 5 Easy Ways to Refresh your Business	 	|
     | 5 Ways to get into the New Build Sector|
     
   @Cards
   Scenario Outline: Verify the cardlink redirect to the respective page.
    And I should be able to click on this "<CardTitle>" cardlink on the Insights page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             									| pageHeader						 |
     | Storm before the Calm?   					  	| Storm before the Calm? |
     | Understanding the New Build Sector			| Understanding the New Build Sector |
     | 5 Easy Ways to Refresh your Business	 	| 5 Easy Ways to Refresh Your Business |
     | 5 Ways to get into the New Build Sector| 5 Ways to get into the New Build Sector |
      
 