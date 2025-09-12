@Intermediaries_Homepage
Feature: Intermediaries home page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page

  @Masthead
  Scenario Outline: Verify the Internediaries home page header
    And I should see the "<header>" as the header for the Internediaries home page

    Examples: 
      | header                   |
      | Aldermore Intermediaries |

  @Cards
  Scenario Outline: Verify the cards present on the page.
    And I shoould see the "<cardTitle>" card on the Internediaries home page
    And I should be able to click on the "<cardTitle>" and redirected to the "<pageHeader>" page

    Examples: 
      | cardTitle                            | pageHeader                               |
      | Mortgage intermediaries              | Mortgage Intermediaries 									|
      | Residential mortgages 							 | Residential Owner-Occupied Mortgages     |
      | Buy to let mortgages                 | Buy to Let Mortgage Intermediaries       |
      | Commercial mortgages                 | Commercial Mortgages                     |
      | Product switching                    | Mortgage Product Switch - Intermediaries |
      | Asset finance                        | Asset Finance for Intermediaries         |
      | Invoice finance                      | Invoice Finance for Intermediaries       |
      | Property development finance         | Property Development Finance for Brokers |
