@Affordabilitycalculators
Feature: Affordability calculators page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Affordability calculators link
    Then I should navigate to Affordability calculators page

  @Masthead
  Scenario Outline: Verify the Affordability calculators page header
    And I should see the "<header>" as the header for the Affordability calculators page

    Examples: 
      | header       |
      | Calculators	 |

  
  @Tabs_Section
   Scenario Outline: Verify the tabs present on the page.
    And I should see these "<TabTitle>" tabs on the Affordability calculators page
    
    Examples: 
     | TabTitle     |
     | Residential 	|
     | Buy to Let		|
     

 

