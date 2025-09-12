@SavingsAccount
Feature: Savings Account page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I navigate to Savings Account page

  @Masthead_Medium
  Scenario Outline: Verify the Savings Account page header
    Then I should see the "<header>" as the header for the Savings Account page
    And I should see the FSCS logo on the Savings Account page

    Examples: 
      | header           |
      | Savings accounts |

  @EasyAccessAccountCard
  Scenario Outline: Verify the Easy Access Account card on the Savings Account page
    Then I should see "<header>" as the header for the Easy Access Account card
    And I should be able to click on the card and redirected to Easy Access Account page

    Examples: 
      | header               |
      | Easy access accounts |

  @FixedRateAccountCard
  Scenario Outline: Verify the Fixed rate Account card on the Savings Account page
    Then I should see "<header>" as the header for the Fixed Rate Account card
    And I should be able to click on the card and redirected to Fixed Rate Account page

    Examples: 
      | header              |
      | Fixed rate accounts |

  @NoticeAccountCard
  Scenario Outline: Verify the Notice Account card on the Savings Account page
    Then I should see "<header>" as the header for the Notice Account card
    And I should be able to click on the card and redirected to Notice savings Account page

    Examples: 
      | header          |
      | Notice accounts |

  @CashISAs
  Scenario Outline: Verify the Cash ISAs card on the Savings Account page
    Then I should see "<header>" as the header for the Cash ISAs card
    And I should be able to click on the card and redirected to Cash ISAs page

    Examples: 
      | header    |
      | Cash ISAs |

  @Easy_access_business_savings
  Scenario Outline: Verify the Easy access business savings card on the Savings Account page
    Then I should see "<header>" as the header for the Easy access business savings card
    And I should be able to click on the card and redirected to Easy access business savings page

    Examples: 
      | header                       |
      | Easy access business savings |

  @Fixed_rate_business_savings
  Scenario Outline: Verify the Fixed rate business savings card on the Savings Account page
    Then I should see "<header>" as the header for the Fixed rate business savings card
    And I should be able to click on the card and redirected to Fixed rate business savings page

    Examples: 
      | header                      |
      | Fixed rate business savings |

  @Corporate_deposits
  Scenario Outline: Verify the Corporate deposits card on the Savings Account page
    Then I should see "<header>" as the header for the Corporate deposits card
    And I should be able to click on the card and redirected to Corporate deposits page

    Examples: 
      | header             |
      | Corporate deposits |

  @ImageCopySection
  Scenario Outline: Verify the Image copy section present on the Savings Account page
    And I should see the "<header>" as the header for the image copy section on the Savings Account page

    Examples: 
      | header                         |
      | Award winning savings accounts |
