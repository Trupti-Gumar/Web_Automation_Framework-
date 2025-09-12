#masthead
#progressbar
#masthead-black-box
#cards
#progressbar
#ImageSection
#CTAbutton
#completed
@Asset_Based_Lending
Feature: Asset Based Lending
  I want to verify the components present in the cards page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Invoice Finance option
    Then I should be naviagated to Invoice Finance page
    And I should see Asset Based Lending card on the page
    When I click on Asset Based Lending card CTA button
    Then I should redirected to Asset Based Lending page

  @MastheadMedium
  Scenario Outline: Verify the Asset Based Lending header
    And I should see "<header>" on Asset Based Lending page header

    Examples: 
      | header              |
      | Asset Based Lending |

  @MastheadBlackBox
  Scenario Outline: Verify Masthead black box contents
    And I should see "<header>" as header for the Masthead black box
    And I should see contact number on the Masthead black box
    # And I should see Request a call back on the Masthead black box
    And I should see Email us on the Masthead black box

    Examples: 
      | header            |
      | Let's get started |

  @Video_Block
  Scenario Outline: Verify the Video block present on Asset Based Lending page
    And I should see the "<header>" as Video block header on Asset Based Lending page

    Examples: 
      | header                                           |
      | How Asset Based Lending could help your business |

  @ImageCopySection
  Scenario Outline: Verify the different label present Image Copy Sections
    And I should see the "<title>" as a header for Image copy Section on Asset Based Lending page
    And I should be able to click on the Find out more on the Bad debt protection image copy link and redirected to the respective page

    Examples: 
      | title               |
      | At a glance         |
      | Bad debt protection |

  @DocumentCards
  Scenario Outline: Verify the different label present Documents option
    And I should see the "<title>" Cards under Documents option on Asset Based Lending page

    Examples: 
      | title                             |
      | Asset Based Lending Product Sheet |

  @YellowBanner
  Scenario Outline: Verify the yellow banner present on the page
    And I should see "<CTAbutton>" CTA banner on the Asset Based Lending page
    And I should able to click on the yellow CTA banner abd redirected to "<pageTitle>" page

    Examples: 
      | CTAbutton                  | pageTitle                            |
      | Get in touch with our team | Contact Details for Business Finance |
