@Intermediaries_Businessfinance
Feature: Internediaries Business Finance home page
  I want to verify the components in this page.
  
Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    Then I click on Business finance dropdown
    And  I clicked on Business finance intermediaries option
    
  @Masthead
  Scenario Outline: Verify the Business Finance Home page header
    And I should see the "<header>" as the header for the Business finance Home page

    Examples: 
      | header                          |
      | Business Finance Intermediaries |
    
 @CardHeader
 Scenario Outline: Verify the Card Header present on the page 
    And  I will verify the "<CardHeader>" on the page 
    Then I will click the "<CardHeader>" and naviagte to "<CardPage>"
    
    Examples: 
    |CardHeader            | CardPage							| 
    |Asset Finance         |Asset Finance					|
    |Invoice Finance       |Invoice Finance				|
    |Commercial Real Estate|Commercial Real Estate|