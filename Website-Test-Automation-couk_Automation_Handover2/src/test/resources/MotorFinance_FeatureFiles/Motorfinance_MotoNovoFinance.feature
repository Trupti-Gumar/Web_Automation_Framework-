@MotoNovoFinance
Feature: MotoNovo Finance Page
I want to verify the components in this page.

Background: 
    Given I am on Aldermore home page
    When I navigate to MotoNovo Finance page

	Scenario Outline: Verify the MotoNovo Finance page header
    And I should be able to click on the "<linkTitle>" link present on the MotoNovo Finance page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle           | pageHeader  	   	 |
      | Motonovo Finance		| MotoNovo Finance	 |