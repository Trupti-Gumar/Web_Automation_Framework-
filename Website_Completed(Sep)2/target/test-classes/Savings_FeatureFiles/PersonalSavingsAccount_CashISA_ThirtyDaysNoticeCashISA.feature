@PSThirtyDaysNoticeCashISA
Feature: Thirty Days Notice Cash ISA Product Card page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I navigate to Cash ISAs page
    Then I should see Thirty Days Notice Cash ISA  Product Card
    When I click on the view account button for the Thirty Days Notice Cash ISA Product Card
    Then I should navigate to Thirty Days Notice Cash ISA page

  @Masthead_Small
  Scenario Outline: Verify the Thirty Days Notice Cash ISA header
    And I should see the "<header>" as the header for the Thirty Days Notice Cash ISA page

    Examples: 
      | header                 |
      | 30 day notice cash ISA |

  @Masthead_BlackBox
  Scenario Outline: Verify the Masthead Black box contents
    And I should see the "<header>" as the header for the Masthead Black box
    And I should see the "<title>" as the secondary title for the Masthead Black box
    And I Shoud see CTA button "<CTAtitle>"
    #When I click on CTA button
    And I should click on the CTA buton and redirected to account opening form page for 30 days fixed rate cash ISA
    And I should be able to click on login link and redirected to the Online Banking login page

    Examples: 
      | header        | title              | CTAtitle  |
      | New customers | Existing customers | Apply now |

  @ThirtyDaysNoticeCashISACardValues
  Scenario Outline: Verify the Interest rate product card values
    And I should see the Thirty Days Notice Cash ISA Product Card
    When I check the "<content>" on the Thirty Days Notice Cash ISA Product Card
    Then I should see the "<content>" value as "<value>" on the Thirty Days Notice Cash ISA Product Card

    Examples: 
      | content                 | value           |
      | Interest rate(*AER)     | 4.50%           |
      | Minimum opening balance |           1,000 |
      | Term                    | 30 days' notice |
      | Gross monthly interest  | 4.41%           |
      | Gross annual interest   | 4.50%           |

  @Product_Summary_FAQ
  Scenario Outline: Verify Product summary FAQs present on Thirty Days Notice Cash ISA page
    And I should see the Product summary FAQs header "<header>"  on Thirty Days Notice Cash ISA page
    And I should see the Product summary FAQs Accordians on the Thirty Days Notice Cash ISA section
    When I click on accordion
    Then accordion is expanded

    Examples: 
      | header          |
      | Product summary |

  @CTA_Banner_Yellow
  Scenario: Verify the Yellow CTA banner on the Thirty Days Notice Cash ISA page
    And I should see the Yellow CTA banner on the Thirty Days Notice Cash ISA page
    And I should be able to click on Yellow CTA banner on Thirty Days Notice Cash ISA page and rediredcted to the corresponding page

  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section present on the Thirty Days Notice Cash ISA page
    And I should see the "<header>" as the header for the "<headerNum>"  image copy section on the Thirty Days Notice Cash ISA page

    Examples: 
      | header             | headerNum |
      #| Eligibility        | First     |
      | Opening an account | Second    |
      | ISA Transfers      | Third     |

  @Image_Copy_Section_Link_test
  Scenario Outline: Verify the Image copy section link
    And I should be able to click on ISA Transfers  Image copy CTA button and should be redirected to "<pageTitle>" page

    Examples: 
      | pageTitle                            |
      | Can I transfer some or all of my existing cash ISA? |

  @CashISAFAQs
  Scenario Outline: Verify Cash ISA FAQs present on Thirty Days Notice Cash ISA page
    And I should see the Cash ISA FAQs header "<header>"  on Thirty Days Notice Cash ISA page
    And I should see the Cash ISA FAQs Accordians on the Thirty Days Notice Cash ISA section
    And I should be click on the Cash ISA FAQs accordian and it should expand

    Examples: 
      | header        |
      | Cash ISA FAQs |

  @Accordion_BlackBox
  Scenario Outline: Verify the Accordion Black box contents
    And I should see the "<header>" as the header for the accordion Black box
    And I Shoud see CTA text link  "<CTAtitle>"
    When I click on CTA text link
    Then I am redirected to "<pageTitle>" page

    Examples: 
      | header                                 | CTAtitle         | pageTitle                         |
      | Haven't found what you're looking for? | Help and support | Help & Support for Personal Savings Customers |

  @Cards
  Scenario Outline: Verify the Personal Savings Terms and Conditions card present on the Thirty Days Notice Cash ISA page
    And I should see the "<header>" as the header for the Personal Savings Terms and Conditions card on the Thirty Days Notice Cash ISA page
    And I should be able to click on the download document for Personal Savings Terms and Conditions card and downlaod the corresponding page

    Examples: 
      | header                                |
      | Personal Savings Terms and Conditions |

  @CTA_Banner_White
  Scenario: Verify the White CTA banner on the Thirty Days Notice Cash ISA page
    And I should see the White CTA banner on the Thirty Days Notice Cash ISA page
    And I should be able to click on White CTA banner on Thirty Days Notice Cash ISA page and rediredcted to the corresponding page
