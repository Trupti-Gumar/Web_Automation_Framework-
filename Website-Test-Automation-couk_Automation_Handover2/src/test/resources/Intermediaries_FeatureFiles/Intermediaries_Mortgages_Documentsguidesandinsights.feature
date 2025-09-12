@Documentsguidesandinsights
Feature: Documents guides and insights page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Documents guides and insights link
    Then I should navigate to Documents guides and insights page

  @Masthead
  Scenario Outline: Verify the Documents guides and insights page header
    And I should see the "<header>" as the header for the Documents guides and insights page

    Examples: 
      | header                 				 |
      | Documents and forms for mortgage intermediaries	 |

 
  @Cards
   Scenario Outline: Verify the cards present on the page.
    And I should see this "<CardTitle>" cards on the Documents guides and insights page
    
    Examples: 
     | CardTitle                        						  |
     | Residential mortgage documents    							|
     | Buy to let mortgage documents 									|
     | Commercial mortgage documents							 		|
     | Product switching 															|
     | Conveyancing documents    											|
     | Latest insight and news - Intermediaries blog 	|
     | See our latest service levels									|
     | Speak to our team															|
     
   @Cards
   Scenario Outline: Verify the cardlink redirect to the respective page.
    And I should be able to click on this "<CardTitle>" cardlink on the Documents guides and insights page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             													| pageHeader																 			|
     | Residential mortgage documents    							| Residential Mortgage Documents - Intermediaries |
     | Buy to let mortgage documents 									| Buy to Let Mortgage Documents - Intermediaries  |
     | Commercial mortgage documents							 		| Commercial Mortgage Documents - Intermediaries  |
     | Product switching 															| Mortgage Product Switch Documents - Intermediaries |
     | Conveyancing documents    											| Conveyancing guidelines - Intermediaries |
     | See our latest service levels									| Our Latest Mortgage Turnaround Times |
     | Speak to our team															| Residential & Buy to Let Mortgages Contacts for Intermediaries |
      
 