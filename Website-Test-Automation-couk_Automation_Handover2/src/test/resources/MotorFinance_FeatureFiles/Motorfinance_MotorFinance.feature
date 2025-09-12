@MotorFinance
Feature: Motor Finance Page
I want to verify the components in this page.

Background: 
    Given I am on the Aldermore home page
    When I navigate to Motor Finance page

	Scenario Outline: Verify the Motor Finance page header
    And I should be able to click on the "<linkTitle>" link present on the Motor Finance page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle       | pageHeader  	   |
      | Motor Finance		| Driving forward through innovation and change - MotoNovo Finance |