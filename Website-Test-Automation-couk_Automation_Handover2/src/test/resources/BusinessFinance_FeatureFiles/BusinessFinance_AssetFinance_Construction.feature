#masthead
#masthead-black-box
#BDMcards
#ImageSection
#VideoBlock
#USP
#Completed
@BSConstruction
Feature: Construction
  I want to verify the components present in the cards page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Asset Finance option
    Then I should be naviagated to Asset Finance page
    And I should see Construction card on the page
    When I click on Construction card CTA button
    Then I should redirected to Construction page

  @MastheadMedium
  Scenario Outline: Verify the Masthead component on Construction page
    And I should see "<header>" on Construction page header

    Examples: 
      | header       |
      | Construction |

  #@MastheadBlackBox
  #Scenario Outline: Verify Masthead black box contents on Construction page
    #And I should see "<header>" as header for the Masthead black box on Construction page
    #And I should be able to click on Get in touch CTA button and redirected to respective page
#
    #Examples: 
      #| header             |
      #| We're here to help |

  @USP
  Scenario Outline: Verify the Unique Selling Points present on Construction page
    And I should see the "<USPHeader>" as USP sub header on Construction page

    Examples: 
      | USPHeader |
      | Expertise |
      | Funding   |
      | Service   |

  @Video_Block
  Scenario Outline: Verify the Video block present on Construction page
    And I should see the "<header>" as Video block header on Construction page

    Examples: 
      | header          |
      | Watch our video |

  @ImageCopySection
  Scenario Outline: Verify the different label present Image Copy Sections
    And I should see the "<title>" as a header for Image copy Section on Construction page

    Examples: 
      | title                 |
      | What we can finance   |
      | Our finance solutions |

  @BDM_Card
  Scenario Outline: Verify the BDM Card component on Construction page
    And I should see "<header>" as the BDM Card header on Construction page

    Examples: 
      | header      |
      | Jon Burrell |
