@BSCommercialRealEstate
Feature: Commercial Real Estate
  I want to verify the dropdown options in Business finance page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Commercial Real Estate option
    Then I should be naviagated to Commercial Real Estate page

  @MastheadMedium
  Scenario Outline: Verify the Commercial Real Estate header
    And I should see "<header>" on Commercial Real Estate header

    Examples: 
      | header                 |
      | Commercial Real Estate |

  @Cards
  Scenario Outline: Verify the Cards present on Commercial Real Estate page
    And I should be able to click on  "<cardName>" card on Commercial Real Estate page and redirected to respective page

    Examples: 
      | cardName                     |
      | Commercial Mortgages         |
      | Property Development Finance |

  @YellowCTABanner
  Scenario: Verify the Yellow CTA banner on the page
    And I should be able to click on Yellow CTA Banner on Commercial Real Estate page and redirected to respective page
