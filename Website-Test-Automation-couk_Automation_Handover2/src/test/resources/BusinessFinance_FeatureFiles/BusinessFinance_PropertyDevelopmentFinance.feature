#text-block text-block-grey
#Completed
@Property_development_finance
Feature: Property development finance
  I want to verify the component in this page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Property Development Finance option
    Then I should be naviagated to Property Development Finance page

  @MastheadMedium
  Scenario Outline: Verify the Property Development Finance header
    And I should see "<header>" on Property Development Finance page header

    Examples: 
      | header                       |
      | Property Development Finance |

  @MastheadBlackBox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see "<header>" as the header for the Masthead blck box on the page

    Examples: 
      | header     |
      | Contact us |

  @USP
  Scenario Outline: Verify the Unique Selling Points present on Property Development Finance page
    And I should see the "<USPHeader>" as USP sub header on Property Development Finance page

    Examples: 
      | USPHeader          |
      | Loans from         |
      | Maximum of 65% GDV |
      | Quick turnaround   |
      | Flexible terms     |

  @ImageCopySection
  Scenario Outline: Verify the Image Copy Sections on the page
    And I should see the "<title>" as a header for Image copy Section on Property Development Finance page

    Examples: 
      | title                                        |
      | Commercial Real Estate specialists                               |
      | VAT loans for house builders and contractors |
      | Development finance to suit you                 |

  @Cards
  Scenario Outline: Verify the Cards present on Property Development Finance page
    And I should see the "<cardName>" Card on Property Development Finance page
    And I should be able to click on  "<cardName>" card and redirected to "<pageTitle>" pages

    Examples: 
      | cardName             | pageTitle            |
      | Commercial Mortgages | Commercial Mortgages |
      | Buy to Let Mortgages | Buy to Let           |
      | Business Finance     | Business Finance     |
