#masthead
#progressbar
#masthead-black-box
#cards
#progressbar
#ImageSection
#CTAbutton
#completed
@BSFactoring
Feature: Factoring
  I want to verify the components present in the cards page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Invoice Finance option
    Then I should be naviagated to Invoice Finance page
    And I should see Factoring card on the page
    When I click on Factoring card CTA button
    Then I should redirected to Factoring page

  @MastheadMedium
  Scenario Outline: Verify the Factoring header
    And I should see "<header>" on Factoring page header

    Examples: 
      | header    |
      | Factoring |

  @MastheadBlackBox
  Scenario Outline: Verify Masthead black box contents
    And I should see "<header>" as header for the Masthead black box
    And I should see contact number on the Masthead black box
    # And I should see Request a call back on the Masthead black box
    And I should see Email us on the Masthead black box

    Examples: 
      | header            |
      | Let's get started |

  @ImageCopySection
  Scenario Outline: Verify the different label present Who is it for? option
    When I click on "<titleNum>" option on Factoring page
    Then I should see the "<title>" as a "<titleNum>" Image copy header on Factoring page
    And I should be able to click on the Find out more on the Bad debt protection image copy link and redirected to the respective page
    And I should be able to click on the link on the Helping businesses like yours image copy link and redirected to the respective page

    Examples: 
      | title                         | titleNum |
      | At a glance                   | First    |
      | Bad debt protection           | Second   |
      | Helping businesses like yours | Third    |

  @DocumentCards
  Scenario Outline: Verify the different label present Documents option
    And I should see the "<title>" Cards under Documents option on Fatoring page

    Examples: 
      | title                   |
      | Factoring Product Sheet |

  @YellowBanner
  Scenario Outline: Verify the yellow banner present on the page
    And I should see "<CTAbutton>" present on the yellow banner on Fatoring page
    And I should able to click on the yellow banner and redirected to "<pageTitle>" page

    Examples: 
      | CTAbutton                  | pageTitle                            |
      | Get in touch with our team | Contact Details for Business Finance |

  @InvoiceFinanceCard
  Scenario: Verify the Invoice finance card present on the page
    And I should see the invoice finance card and should be able to click on the link

  @InvoiceFinanceFAQCard
  Scenario: Verify the Invoice finance FAQ card present on the page
    And I should see the invoice finance FAQ card and should be able to click on the link

  @CustomerStoriesCard
  Scenario: Verify the Customer stories card present on the page
    And I should see the Customer stories card and should be able to click on the link
