@PSThreeYearFixedRateCashISA
Feature: Three Year Fixed Rate Cash ISA Product Card page
  I want to verify the compThreents in this page.

  Background: 
    Given I am on a Aldermore home page
    When I navigate to Cash ISAs page
    Then I should see Three Year Fixed Rate Cash ISA  Product Card
    When I click on the view account button for the Three Year Fixed Rate Cash ISA Product Card
    Then I should navigate to Three Year Fixed Rate Cash ISA page

  @Masthead_Small
  Scenario Outline: Verify the Three Year Fixed Rate Cash ISA header
    And I should see the "<header>" as the header for the Three Year Fixed Rate Cash ISA page

    Examples: 
      | header                     |
      | 3 year fixed rate cash ISA |

  @Masthead_BlackBox
  Scenario Outline: Verify the Masthead Black box contents
    And I should see the "<header>" as the header for the Masthead Black box
    And I should see the "<title>" as the secondary title for the Masthead Black box
    And I Shoud see CTA button "<CTAtitle>"
    #When I click on CTA button
    And I should click on the CTA buton and redirected to account opening form page for 3 year fixed rate cash ISA
    And I should be able to click on login link and redirected to the Online Banking login page

    Examples: 
      | header        | title              | CTAtitle  |
      | New customers | Existing customers | Apply now |

  @ThreeYearFixedRateCardValues
  Scenario Outline: Verify the Interest rate product card values
    And I should see the Three Year Fixed Rate Cash ISA Product Card
    When I check the "<content>" on the Three Year Fixed Rate Cash ISA Product Card
    Then I should see the "<content>" value as "<value>" on the Three Year Fixed Rate Cash ISA Product Card

    Examples: 
      | content                 | value   |
      | Interest rate(*AER)     | 4.40%   |
      | Minimum opening balance |   1,000 |
      | Term                    | 3 years |
      | Gross monthly interest  | 4.31%   |
      | Gross annual interest   | 4.40%   |

  @Product_Summary_FAQ
  Scenario Outline: Verify Product summary FAQs present on Three Year Fixed Rate Cash ISA page
    And I should see the Product summary FAQs header "<header>"  on Three Year Fixed Rate Cash ISA page
    And I should see the Product summary FAQs Accordians on the Three Year Fixed Rate Cash ISA section
    When I click on accordion
    Then accordion is expanded

    Examples: 
      | header      |
      | Summary box |

  @CTA_Banner_Yellow
  Scenario: Verify the Yellow CTA banner on the Three Year Fixed Rate Cash ISA page
    And I should see the Yellow CTA banner on the Three Year Fixed Rate Cash ISA page
    And I should be able to click on Yellow CTA banner on Three Year Fixed Rate Cash ISA page and rediredcted to the corresponding page

  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section present on the Three Year Fixed Rate Cash ISA page
    And I should see the "<header>" as the header for the "<headerNum>"  image copy section on the Three Year Fixed Rate Cash ISA page

    Examples: 
      | header             | headerNum |
      #| Eligibility        | First     |
      | Opening an account | Second    |
      | ISA Transfers      | Third     |

  @Image_Copy_Section_Link_test
  Scenario Outline: Verify the Image copy section link
    And I should be able to click on ISA Transfers  Image copy CTA button and should be redirected to "<pageTitle>" page

    Examples: 
      | pageTitle                                           |
      | Can I transfer some or all of my existing cash ISA? |

  @CashISAFAQs
  Scenario Outline: Verify Cash ISA FAQs present on Three Year Fixed Rate Cash ISA page
    And I should see the Cash ISA FAQs header "<header>"  on Three Year Fixed Rate Cash ISA page
    And I should see the Cash ISA FAQs Accordians on the Three Year Fixed Rate Cash ISA section
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
      | header                                 | CTAtitle         | pageTitle                                     |
      | Haven't found what you're looking for? | Help and support | Help & Support for Personal Savings Customers |

  @Cards1
  Scenario Outline: Verify the Fixed rate cash ISAs summary box card present on the Three Year Fixed Rate Cash ISA page
    And I should see the "<header>" as the header for the Fixed rate cash ISAs summary box card on the Three Year Fixed Rate Cash ISA page
    And I should be able to click on the download document for Fixed rate cash ISAs summary box card and downlaod the corresponding page

    Examples: 
      | header                           |
      | Fixed rate cash ISAs summary box |

  @Cards2
  Scenario Outline: Verify the Personal Savings Terms and Conditions card present on the Three Year Fixed Rate Cash ISA page
    And I should see the "<header>" as the header for the Personal Savings Terms and Conditions card on the Three Year Fixed Rate Cash ISA page
    And I should be able to click on the download document for Personal Savings Terms and Conditions card and downlaod the corresponding page

    Examples: 
      | header                                |
      | Personal Savings Terms and Conditions |

  @CTA_Banner_White
  Scenario: Verify the White CTA banner on the Three Year Fixed Rate Cash ISA page
    And I should see the White CTA banner on the Three Year Fixed Rate Cash ISA page
    And I should be able to click on White CTA banner on Three Year Fixed Rate Cash ISA page and rediredcted to the corresponding page
