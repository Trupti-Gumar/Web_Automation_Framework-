#text-block text-block-grey
#Completed
@BSAsset_finance
Feature: Asset Finance
  I want to verify the component in this page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Asset Finance option
    Then I should be naviagated to Asset Finance page

  @MastheadMedium
  Scenario Outline: Verify the Asset Finance header
    And I should see "<header>" on Asset Finance page header

    Examples: 
      | header        |
      | Asset Finance |

  @USP
  Scenario Outline: Verify the Unique Selling Points present on Asset Finance page
    And I should see the "<USPHeader>" as USP sub header on Asset Finance page

    Examples: 
      | USPHeader |
      | Expertise |
      | Funding   |
      | Service   |

  @Cards
  Scenario Outline: Verify the Cards present on Asset Finance page
    And I should see the "<cardName>" Card on Asset Finance page
    And I should be able to click on  "<cardName>" card on Asset Finance page and redirected to respective page

    Examples: 
      | cardName       |
      | Construction   |
      | Transportation |
      | Hire Purchase  |
      | Leas          |
      | Refinance      |

  @FAQ
  Scenario Outline: Verify the Asset Finance FAQs present on the page
    And I should see the Asset Finance FAQs header "<header>"  on Asset Finance page
    And I should see the Asset Finance FAQs Accordians on the Asset Finance page
    And I should see the more card header "<moreCardHeader>" on Asset Finance FAQs section
    And I should be able to click on View Asset Finance FAQs CTA button and should be redirected to "<pageTitle>" page

    Examples: 
      | header             | moreCardHeader                         | pageTitle                                |
      | Asset Finance FAQs | Haven't found what you're looking for? | Frequently Asked Questions: Asset Finance |

  @Awards
  Scenario Outline: Verify the Awards component on Asset Finance page
    And I should see the "<header>" as header for the Award component on Asset Finance page

    Examples: 
      | header                                 |
      | And don't just take our word for it... |

  
