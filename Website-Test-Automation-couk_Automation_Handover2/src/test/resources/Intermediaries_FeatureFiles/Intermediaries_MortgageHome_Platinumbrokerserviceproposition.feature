@PlatinumBrokerserviceproposition
Feature: Platinum Broker service proposition page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Platinum Broker service proposition link
    Then I should navigate to Platinum Broker service proposition page

  @Masthead
  Scenario Outline: Verify the Platinum Broker service proposition page header
    And I should see the "<header>" as the header for the Platinum Broker service proposition page

    Examples: 
      | header                							 |
      | Platinum Broker service proposition	 |

  
  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section present on the page
    And I should see the "<header>" as the header for the "<headerNum>" image copy section on the Platinum Broker service proposition page

    Examples: 
      | header                               | headerNum |
      | Introducing Platinum Broker      		 | First     |
      | Benefits of Platinum Broker 				 | Second    |

       
   @Cards
   Scenario Outline: Verify the cards present on the page.
    And I should see these "<CardTitle>" cards on the Platinum Broker service proposition page
    
    Examples: 
     | CardTitle                      |
     | Affordability calculators 			|
     | Product & eligibility guides   |
     | Contact us 										|
     
     @Cards
   Scenario Outline: Verify the cardlink redirect to the page.
    And I should be able to click on this "<CardTitle>" cardlink and redirected to the "<pageHeader>" Platinum Broker service proposition page
    
    Examples: 
     | CardTitle             					| pageHeader																 |
     | Affordability calculators 			| Affordability Calculators - Intermediaries |
     | Product & eligibility guides   | Mortgage Documents for Intermediaries      |
     | Contact us 										| Aldermore for Intermediaries Contact       |
 

