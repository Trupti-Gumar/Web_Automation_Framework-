#masthead
#masthead-black-box
#cards
#ImageSection
#completed
@Receivables_Finance
Feature: Receivables Finance
  I want to verify the components present in the cards page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Invoice Finance option
    Then I should be naviagated to Invoice Finance page
    And I should see Receivables Finance card on the page
    When I click on Receivables Finance card CTA button
    Then I should redirected to Receivables Finance page

  @MastheadMedium
  Scenario Outline: Verify the Receivables Finance header
    And I should see "<header>" on Receivables Finance page header

    Examples: 
      | header              |
      | Receivables Finance |

  @MastheadBlackBox
  Scenario Outline: Verify Masthead black box contents
    And I should see "<header>" as header for the Masthead black box
    And I should see contact number on the Masthead black box
    #And I should see Request a call back on the Masthead black box
    And I should see Email us on the Masthead black box

    Examples: 
      | header            |
      | Let's get started |

  @ImageCopySection
  Scenario Outline: Verify the Image Copy Sections
    And I should see the "<title>" as a header for Image copy Section on Receivables Finance page

    Examples: 
      | title       |
      | At a glance |

  @DocumentCards
  Scenario Outline: Verify the different label present Documents option
    And I should see the "<title>" Cards under Documents option on Receivables Finance page

    Examples: 
      | title                             |
      | Receivables Finance Product Sheet |

  @YellowBanner
  Scenario Outline: Verify the yellow banner present on the page
    And I should see "<CTAbutton>" CTA banner on the Receivables Finance page
    And I should able to click on the yellow CTA banner abd redirected to "<pageTitle>" page

    Examples: 
      | CTAbutton                  | pageTitle                            |
      | Get in touch with our team | Contact Details for Business Finance |
