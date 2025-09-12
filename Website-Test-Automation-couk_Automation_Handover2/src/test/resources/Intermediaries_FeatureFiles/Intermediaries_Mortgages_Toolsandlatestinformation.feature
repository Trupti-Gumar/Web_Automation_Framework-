@Toolsandlatestinformation
Feature: Tools and latest information page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Tools and latest information link
    Then I should navigate to Tools and latest information page

  @Masthead
  Scenario Outline: Verify the Tools and latest information page header
    And I should see the "<header>" as the header for the Tools and latest information page

    Examples: 
      | header                 				 |
      | Tools and useful information	 |

 
  @Cards
   Scenario Outline: Verify the cards present on the page.
    And I should see this "<CardTitle>" cards on the Tools and latest information page
    
    Examples: 
     | CardTitle                        						  |
     | Affordability calculators    								  |
     | Latest service levels 													|
     | Latest news and updates 							 					|
     | Residential and Buy to Let contact information |
     | Commercial mortgages contact information     	|
     | Platinum Broker service proposition 						|
     | We're backing you and your clients 						|
     
   @Cards
   Scenario Outline: Verify the cardlink redirect to the respective page.
    And I should be able to click on this "<CardTitle>" cardlink on the Tools and latest information page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             													| pageHeader																 |
     | Affordability calculators    								  | Affordability Calculators - Intermediaries |
     | Latest service levels 													| Our Latest Mortgage Turnaround Times       |
     | Latest news and updates 							 					| Latest Mortgage Updates for Intermediaries |
     | Residential and Buy to Let contact information | Residential & Buy to Let Mortgages Contacts for Intermediaries |
     | Commercial mortgages contact information     	| Commercial Mortgages Contact Information for Intermediaries |
     | Platinum Broker service proposition 						| Platinum Broker Service Propositions |
     | We're backing you and your clients 					  | Core Propositions for Mortgage Intermediaries |
      
 