@Help_BusinessSavingsHelp
Feature: Help_Business Savings Help Page
  I want to verify the components in this page
  
  Background: 
    Given I am on this Aldermore home page
    When I navigate in to the Help page
    And I navigate to Business Savings Help page

  Scenario Outline: Verify the Help page Header
    Then I should see the "<header>" as the header for the Business Savings Help page

    Examples: 
      | header           									|
      | Business savings help and support |
      
   
   @Popular_questions
   
   Scenario Outline: Verify the Popular questions present on the page.
    Then I should see this "<QuestionTitle>" Popular Question on the Business Savings Help page
    And I should be able to click on this "<QuestionTitle>" Popular Question link and redirected to the "<pageHeader>" page
      
    Examples: 
      | QuestionTitle                           									| pageHeader 																										|
      | How do I pay money into my Business Savings Account? 			| How do I pay money into my Business Savings Account?  				|
      | What happens when my Fixed Rate account matures?        	| What happens when my Fixed Rate savings account matures?			|
      | What do I do if I've forgotten my password or username?   | What do I do if I've forgotten my password or username?				|
      | How do I withdraw money from my Business Savings Account?	| How do I withdraw money from my Business Savings Account?			|
      | How do I set up additional users on my account?           | How do I set up multiple users on my Business Savings Account?|
      | What is a significant owner? 															| What's a controlling person or a significant owner?						|
      

   @Cards
   Scenario Outline: Verify the card present on the page.
    Then I should see this "<CardTitle>" card on the Business Savings Help page
    And I should be able to click on the "<CardTitle>" cardlink and redirected to the respective "<pageHeader>" page
    
    Examples: 
      | CardTitle                    	| pageHeader                                    |
      | Applications          				| Applications - Business Savings FAQs   				|
      | Transfers and paying money in | Transfers & Paying In - Business Savings FAQs |
      | Internet banking              | Internet Banking - Business Savings FAQs      |
      | Withdrawing money         		| Withdrawing Money - Business Savings FAQs 		|
      | Maturity         							| Maturity - Business Savings FAQs        			|
			| Closing your account					| Closing an Account - Business Savings FAQs    |
      | Security				           		| Security - Business Savings FAQs					    |
      
         
  @Button      
  Scenario Outline: Verify the Forgotten password reset button redirect to the page.
    And I should be able to click on the Forgotten password reset button and redirected to the "<pageHeader>" respective page
    
    Examples: 
      | pageHeader                              					  |
      | Aldermore - Business Savings Customer Portal (dev)  |
      
    	
  @Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on the Business Savings Help page

    Examples: 
      | header       |
      | Quick links  |

  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Business Savings Help page and redirected to the respective "<pageHeader>" page

    Examples: 
      | linkTitle                 						| pageHeader                          								   |
      | Forms and documents							  		| Business savings forms and documents - Aldermore bank  |
      | Internet banking log in						  	| Log in 																								 |
      
      
      
      
      
      
      
      