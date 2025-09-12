#masthead
#progressbar
#masthead-black-box
#cards
#progressbar
#ImageSection
#CTAbutton
#Completed
@Invoice_Discounting
Feature: Invoice Discounting
  I want to verify the components present in the cards page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Invoice Finance option
    Then I should be naviagated to Invoice Finance page
    And I should see Invoice Discounting card on the page
    When I click on Invoice Discounting card CTA button
    Then I should redirected to Invoice Discounting page

  @MastheadMedium
  Scenario Outline: Verify the Invoice Discounting header
    And I should see "<header>" on Invoice Discounting page header

    Examples: 
      | header              |
      | Invoice Discounting |

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
  Scenario Outline: Verify the different label present Who is it for? option
    And I should see the "<title>" as a header on Image Section
    And I should be able to click on the Find out more on the Bad debt protection image copy link and redirected to the respective page

    Examples: 
      | title               |
      | At a glance         |
      | Bad debt protection |

  @MoreCard
  Scenario Outline: Verify the More card section
    And I should see the more card header "<moreCardHeader>" on Invoice Discounting FAQs section
    And I should be able to click on View Invoice Finance FAQs CTA button and should be redirected to "<pageTitle>" page

    Examples: 
      | title                    | pageTitle                                   | moreCardHeader |
      | Invoice Discounting FAQs | Frequently Asked Questions: Invoice Finance | Find out more  |

  @DocumentCards
  Scenario Outline: Verify the different label present Documents option
    And I should see the "<title>" Cards under Documents option

    Examples: 
      | title                             |
      | Invoice Discounting Product Sheet |
      | Bad Debt Protection Product Sheet |

  @YellowBanner
  Scenario Outline: Verify the yellow banner present on the page
    And I should see "<CTAbutton>" present on the yellow banner
    And I should able to click on the yellow banner abd redirected to "<pageTitle>" page

    Examples: 
      | CTAbutton                  | pageTitle                            |
      | Get in touch with our team | Contact Details for Business Finance |
