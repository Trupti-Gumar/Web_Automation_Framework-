@MotorFinancebyMotoNovo
Feature: Motor Finance By MotoNovo Page
I want to verify the components in this page.

Background: 
    Given I am on a Aldermore home page
    When I navigate to Motor Finance By MotoNovo page

@Masthead_Medium
  Scenario Outline: Verify the Motor Finance By MotoNovo page header
    Then I should see the "<header>" as the header for the Motor Finance By MotoNovo page

    Examples: 
      | header        				    |
      | Motor Finance by MotoNovo |
      
@Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on the Motor Finance By MotoNovo page

    Examples: 
      | header      		 |
      | MotoNovo Finance |     
      
 @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Motor Finance By MotoNovo page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle     | pageHeader                            												   |
 #     | Find a car		| findandfundmycar.com																					   |
      | Visit website	| Driving forward through innovation and change - MotoNovo Finance |  
      
      
      
 