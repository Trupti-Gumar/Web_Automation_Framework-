@Personal_Savings_Account
Feature: Personal Savings Account
  I want to verify the components in this page.

  Scenario Outline: Verify the Personal Savings Account header
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the "<header>" as the header for the page

    Examples: 
      | header                    |
      | Personal savings accounts |

  Scenario Outline: Verify the Unique Selling Points present on this page
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the "<USPHeader>" as USP sub header

    Examples: 
      | USPHeader                        |
      | FSCS Protected                   |
      | Easy account opening             |
      | Rated "excellent"                |
      | Consistently competitive returns |

  @LabelTest
  Scenario Outline: Verify the different labels present on the Product Card Savings
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the Easy Access Account Product Card
    And I should see the "<label>" label present on the Product card page

    Examples: 
      | label                                                                                                                  |
      | Interest rate (AER*)                                                                                                   |
      | Term                                                                                                                   |
      | Suitable if you                                                                                                        |
      | *AER stands for annual equivalent rate and illustrates the interest rate if it was paid and compounded once each year. |
      | Minimum opening balance                                                                                                |

  @EasyAccessAccount
  Scenario Outline: Verify the values present on the Easy access account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the Easy Access Account Product Card
    When I check the "<content>" on the Easy access account card
    Then I should see the "<content>" value as "<value>" on the Easy access account card

    Examples: 
      | content                 | value          |
      | Interest rate(*AER)     | 4.50% Variable |
      | Minimum opening balance |          100 |

  #| Term                    | N/A             |
  @ThirtyDaysNoticeAccount
  Scenario Outline: Verify the values present on the 30 day notice account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 30 day notice account Product Card
    When I check the "<content>" on the 30 day notice account card
    Then I should see the "<content>" value as "<value>" on the 30 day notice account card

    Examples: 
      | content                 | value           |
      | Interest rate(*AER)     | 4.55% Variable  |
      | Minimum opening balance |           1,000 |
      | Term                    | 30 days' notice |

  @OneTwentyDaysNoticeAccount
  Scenario Outline: Verify the values present on the 120 day notice account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 120 day notice account Product Card
    When I check the "<content>" on the 120 day notice account card
    Then I should see the "<content>" value as "<value>" on the 120 day notice account card

    Examples: 
      | content                 | value            |
      | Interest rate(*AER)     | 4.80% Variable   |
      | Minimum opening balance |            1,000 |
      | Term                    | 120 days' notice |

  @OneYearFixedRate
  Scenario Outline: Verify the values present on the 1 year fixed rate account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 1 year fixed rate account Product Card
    When I check the "<content>" on the 1 year fixed rate account card
    Then I should see the "<content>" value as "<value>" on the 1 year fixed rate account card

    Examples: 
      | content                 | value  |
      | Interest rate(*AER)     | 5.00%  |
      | Minimum opening balance |  1,000 |
      | Term                    | 1 Year |

  @TwoYearFixedRate
  Scenario Outline: Verify the values present on the 2 year fixed rate account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 2 year fixed rate account Product Card
    When I check the "<content>" on the 2 year fixed rate account card
    Then I should see the "<content>" value as "<value>" on the 2 year fixed rate account card

    Examples: 
      | content                 | value   |
      | Interest rate(*AER)     | 4.60%   |
      | Minimum opening balance |   1,000 |
      | Term                    | 2 years |

  @ThreeYearFixedRate
  Scenario Outline: Verify the values present on the 3 year fixed rate account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 3 year fixed rate account Product Card
    When I check the "<content>" on the 3 year fixed rate account card
    Then I should see the "<content>" value as "<value>" on the 3 year fixed rate account card

    Examples: 
      | content                 | value   |
      | Interest rate(*AER)     | 4.40%   |
      | Minimum opening balance |   1,000 |
      | Term                    | 3 years |

  @FourYearFixedRate
  Scenario Outline: Verify the values present on the 4 year fixed rate account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 4 year fixed rate account Product Card
    When I check the "<content>" on the 4 year fixed rate account card
    Then I should see the "<content>" value as "<value>" on the 4 year fixed rate account card

    Examples: 
      | content                 | value       |
      | Interest rate(*AER)     | 4.10% |
      | Minimum opening balance |       1,000 |
      | Term                    | 4 years     |

  @FiveYearFixedRate
  Scenario Outline: Verify the values present on the 5 year fixed rate account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 5 year fixed rate account Product Card
    When I check the "<content>" on the 5 year fixed rate account card
    Then I should see the "<content>" value as "<value>" on the 5 year fixed rate account card

    Examples: 
      | content                 | value       |
      | Interest rate(*AER)     | 4.10% |
      | Minimum opening balance |       1,000 |
      | Term                    | 5 years     |

  @OneYearFixedRateISA
  Scenario Outline: Verify the values present on the 1 year fixed rate cash ISA product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 1 year fixed rate cash ISA Product Card
    When I check the "<content>" on the 1 year fixed rate cash ISA card
    Then I should see the "<content>" value as "<value>" on the 1 year fixed rate cash ISA card

    Examples: 
      | content                 | value       |
      | Interest rate(*AER)     | 4.90% Fixed |
      | Minimum opening balance |       1,000 |
      | Term                    | 1 year      |

  @TwoYearFixedRateISA
  Scenario Outline: Verify the values present on the 2 year fixed rate cash ISA product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 2 year fixed rate cash ISA Product Card
    When I check the "<content>" on the 2 year fixed rate cash ISA card
    Then I should see the "<content>" value as "<value>" on the 2 year fixed rate cash ISA card

    Examples: 
      | content                 | value       |
      | Interest rate(*AER)     | 4.50% Fixed |
      | Minimum opening balance |       1,000 |
      | Term                    | 2 years     |

  @ThreeYearFixedRateISA
  Scenario Outline: Verify the values present on the 3 year fixed rate cash ISA product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 3 year fixed rate cash ISA Product Card
    When I check the "<content>" on the 3 year fixed rate cash ISA card
    Then I should see the "<content>" value as "<value>" on the 3 year fixed rate cash ISA card

    Examples: 
      | content                 | value       |
      | Interest rate(*AER)     | 4.40% Fixed |
      | Minimum opening balance |       1,000 |
      | Term                    | 3 years     |

  @ThirtyDayNoticeCashISA
  Scenario Outline: Verify the values present on the 30 day notice cash ISA product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the 30 day notice cash ISA Product Card
    When I check the "<content>" on the 30 day notice cash ISA card
    Then I should see the "<content>" value as "<value>" on the 30 day notice cash ISA card

    Examples: 
      | content                 | value           |
      | Interest rate(*AER)     | 4.50% Variable  |
      | Minimum opening balance |           1,000 |
      | Term                    | 30 days' notice |

  @DoubleAccessAccount
  Scenario Outline: Verify the values present on the Double access account product card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the Double access account Product Card
    When I check the "<content>" on the Double access account card
    Then I should see the "<content>" value as "<value>" on the Double access account card

    Examples: 
      | content                 | value                           |
      | Interest rate1(*AER)    | 4.90% Up to two withdrawals     |
      | Interest rate2(*AER)    | 1.50% Three or more withdrawals |
      | Minimum opening balance |                           1,000 |

  #| Term                    | N/A                              |
  @ProductCardCTAButton
  Scenario Outline: Verify the CTA angled buton on the Savings Product Card
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the "<cardName>" CTA button
    When I click on the button
    Then I should be redirected to the "<cardTitle>" page

    Examples: 
      | cardTitle                                     | cardName                          |
      | Easy Access Account - Personal Savings        | Easy access account               |
      | Double Access Account - Personal Savings      | Double access account             |
      | 30 Day Notice Savings Account                 | 30 day notice account             |
      | 120 Day Notice Savings Account                | 120 day notice account            |
      | 1 Year Fixed Rate Savings Account             | 1 year fixed rate savings account |
      | 2 Year Fixed Rate Savings Account             | 2 year fixed rate savings account |
      | 3 Year Fixed Rate Savings Account             | 3 year fixed rate savings account |
      | 4 Year Fixed Rate Savings Account             | 4 year fixed rate savings account |
      | 5 Year Fixed Rate Savings Account             | 5 year fixed rate savings account |
      | 1 Year Fixed Rate Cash ISA - Personal Savings | 1 year fixed rate cash ISA        |
      | 2 Year Fixed Rate Cash ISA - Personal Savings | 2 year fixed rate cash ISA        |
      | 3 Year Fixed Rate Cash ISA - Personal Savings | 3 year fixed rate cash ISA        |
      | 30 Day Notice Cash ISA - Personal Savings     | 30 day notice cash ISA            |

  Scenario Outline: Verify the Image copy section contents on the page
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the Image copy secion on the page
    And I should see the "<header>" as the header for the Image copy secion

    Examples: 
      | header                  |
      | Keeping your money safe |

  Scenario Outline: Verify the "<cardHeader>" Card present on the page
    Given I am on a Aldermore home page
    When I navigate to Personal Savings Account page
    Then I should see the "<cardHeader>" Card on the page
    And I should be able to click on the "<cardHeader>" link
    Then I should be redirected to the "<cardHeader>" card page

    Examples: 
      | cardHeader                                     |
      | Important personal savings forms and documents |
      | Existing customer log in                       |
