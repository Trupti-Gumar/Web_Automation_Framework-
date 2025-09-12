@Conveyancingspecialistbuytolet
Feature: Conveyancing specialist buy to let page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Conveyancing specialist buy to let link
    Then I should navigate to Conveyancing specialist buy to let page

  @Masthead
  Scenario Outline: Verify the Conveyancing specialist buy to let documents documents page header
    And I should see the "<header>" as the header for the Conveyancing specialist buy to let page

    Examples: 
      | header                 													       |
      | Conveyancing for specialist buy to let applications	   |

 
  @Cards
   Scenario Outline: Verify the cards present on the page.
    And I should see this "<CardTitle>" cards on the Conveyancing specialist buy to let page
    
    Examples: 
     | CardTitle                        					  |
     | Multi property buy to let mortgage				  	|
     | Speak to our team 							              |
     | Buy to let mortgage documents							 	|
     
   @Cards
   Scenario Outline: Verify the cardlink redirect to the respective page.
    And I should be able to click on this "<CardTitle>" cardlink on the Conveyancing specialist buy to let page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             												| pageHeader															|
     | Multi property buy to let mortgage				    | Multi property buy to let mortgages     |
     | Speak to our team 														| Residential & Buy to Let Mortgages Contacts for Intermediaries    |
     | Buy to let mortgage documents							 	| Buy to Let Mortgage Intermediaries     |
      
 