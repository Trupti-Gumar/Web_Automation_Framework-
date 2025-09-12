@tabs
Feature: Verify homepage tabs and their links are working

  Background:
    Given I am on the Aldermore homepage

  # ========================= Savings =========================
  Scenario Outline: Validate each link under "Savings" tab
    When I expand the "Savings" tab
    Then I should verify the link "<link>" under "Savings" tab is working
    And I should print the number of links under "Savings" tab in the console

    Examples:
      | link                        |
      | Personal savings accounts   |
      | Fixed rate savings          |
      | Cash ISAs                   |
      | Reward cash ISAs            |
      | Easy access savings         |
      | Double access savings       |
      | Regular savings             |
      | Notice savings              |
      | Business savings accounts   |
      | Corporate deposits          |
      | Help and support            |
      | Bereavement guide           |
      | Insights for Savers         |

  # ========================= Mortgages =========================
  Scenario Outline: Validate each link under "Mortgages" tab
    When I expand the "Mortgages" tab
    Then I should verify the link "<link>" under "Mortgages" tab is working
    And I should print the number of links under "Mortgages" tab in the console

    Examples:
      | link                                 |
      | Residential mortgages                |
      | First time buyer mortgages           |
      | Self-employed mortgages              |
      | Customers with credit problems       |
      | Switch your mortgage                 |
      | Buy to let mortgages                 |
      | Buy to let limited company mortgages |
      # | Help and support                     |
      | Money worries                        |
      | Mortgage charter                     |
      | Borrowing more                       |
      #| Bereavement guide                    |
      | Insights for homebuyers and landlords|

  # ========================= Motor Finance =========================
  Scenario Outline: Validate each link under "Motor Finance" tab
    When I expand the "Motor Finance" tab
    Then I should verify the link "<link>" under "Motor Finance" tab is working
    And I should print the number of links under "Motor Finance" tab in the console

    Examples:
      | link                                                  |
      | MotoNovo Finance                                      |
      | Motor finance                                        |
      | Commission complaints      |

  # ========================= Business Finance =========================
  Scenario Outline: Validate each link under "Business Finance" tab
    When I expand the "Business Finance" tab
    Then I should verify the link "<link>" under "Business Finance" tab is working
    And I should print the number of links under "Business Finance" tab in the console

    Examples:
      | link                                |
      | Business finance                    |
      | Invoice finance                     |
      | Asset finance                       |
      | Commercial Real Estate              |
      #| Help and support                    |
      | Invoice finance FAQs                |
      | Asset finance FAQs                  |
      | Property development finance FAQs   |
     # | Money worries                       |
     # | Bereavement guide                   |
      #| Insights                            |
      | Customer stories                    |
      | Insights for Businesses             |
