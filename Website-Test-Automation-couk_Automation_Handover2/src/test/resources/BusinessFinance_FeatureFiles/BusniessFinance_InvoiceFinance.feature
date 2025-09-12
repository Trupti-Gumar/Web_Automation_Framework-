#masthead
#progressbar
#masthead-black-box
#video-block__container
#cards
#progressbar
#ImageSection
@BFInvoice_Finance
Feature: Invoice Finance
  I want to verify the component in this page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Invoice Finance option
    Then I should be naviagated to Invoice Finance page

  @MastheadMedium
  Scenario Outline: Verify the Invoice Finance header
    And I should see "<header>" on Invoice Finance page header

    Examples: 
      | header          |
      | Invoice Finance |

  @MastheadBlackBox
  Scenario Outline: Verify Masthead black box contents
    And I should see "<header>" as header for the Masthead black box
    And I should see contact number on the Masthead black box
    #And I should see Request a call back on the Masthead black box
    And I should see Email us on the Masthead black box

    Examples: 
      | header      |
      | Get started |

  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section contents on Invoice Finance page
    And I should see the Image copy secion on Invoice Finance page
    And I should see the "<header>" as the header for the Image copy secion on Invoice Finance page

    Examples: 
      | header                           |
      | Supporting businesses like yours |

  @USP
  Scenario Outline: Verify the Unique Selling Points present on Invoice Finance page
    And I should see the "<USPHeader>" as USP sub header on Invoice Finance page

    Examples: 
      | USPHeader                 |
      | Flexible and transparent  |
      | Dedicated support         |
      | Same day payments         |
      | Online account management |

  @ImageCopySection1
  Scenario Outline: Verify the Image copy section present on Invoice Finance page
    And I should see the "<header>" as Image copy header on Invoice Finance page

    Examples: 
      | header                         |
      | How does Invoice Finance work? |

  @Cards
  Scenario Outline: Verify the Cards present on Invoice Finance page
    And I should see the "<cardName>" Card on Invoice Finance page
    And I should be able to click on  "<cardName>" card and redirected to respective page

    Examples: 
      | cardName            |
      | Invoice Discounting |
      | Factoring           |
      | Asset Based Lending |
      #| Bad Debt Protection |
      | Receivables Finance |

  @VideoBlock
  Scenario Outline: Verify the Video Block present on Invoice Finance page
    And I should see the "<header>" as Video Block header on Invoice Finance page

    Examples: 
      | header              |
      | Here's how it works |

  #@Process_block
  #Scenario Outline: Verify the CTA links present on the process block
  #And I should see the "<header>" CTA button for the progress bar option
  #
  #When I click on CTA link
  #Then I should verify the "<pageTitle>" for the progress bar option
  #And I should be able to click on "<header>" link and redirected to the "<pageTitle>" page
  #Examples:
  #| header                                 | pageTitle                              |
  #| Get in touch with us                   | Get in touch                           |
  #| Submit your invoices to us             | Submit your invoices                   |
  #| We advance you the funds               | We advance you the funds               |
  #| Repay us once the invoices are settled | Repay us once the invoices are settled |
  @FAQ
  Scenario Outline: Verify the Invoice Financing FAQs present on the page
    And I should see the Invoice Financing FAQs header "<header>"  on Invoice Finance page
    And I should see the Invoice Financing FAQs Accordians on the Invoice Finance page
    And I should see the more card header "<moreCardHeader>" on Invoice Financing FAQs section
    And I should be able to click on "View Invoice Finance FAQs" CTA button and should be redirected to "<pageTitle>" page

    Examples: 
      | header               | moreCardHeader                         | pageTitle            |
      | Invoice Finance FAQs | Haven't found what you're looking for? | Invoice Finance |

  @Image_Copy_Section
  Scenario Outline: Verify the CTA links on Image copy section contents
    And I should see the Image copy secion on Invoice Finance page
    And I should be able to click on the Image copy CTA link "<link>" and redirected to "<pageTitle>" page

    Examples: 
      | link                                                                                   | pageTitle                                 |
      | Find out how Aldermore supported Didsbury Gin with a flexible Invoice Finance facility | Didsbury Gin - Invoice Finance Case Study |
      #| More customer stories                                                                  | Aldermore bank                                     |
