@AldermoreHomePage
Feature: Aldermore Homepage
  I want to use this template for my feature file

  Background: 
    Given I am on Aldermore page

  @Masthead_Homepage
  Scenario Outline: Verify the Masthead Homepage contents
    When I view the Masthead Homepage section
    Then I should see the "<Header>" as header for the Masthead homepage
    And Description should be displayed on the page

    Examples: 
      | Header                      |
      | Backing you to achieve more |

  @Unique_Selling_points
  Scenario Outline: Verify the unique selling points contents
    When I view the Unique Selling Point Section
    Then I Should see the "<header>" as section header

    Examples: 
      | header                 |
      | Proud to be different. |

  @Unique_Selling_points
  Scenario Outline: Verify the unique selling points contents
    When I view the Unique Selling Point Section
    Then I should see the "<subheader>" as sub header

    Examples: 
      | subheader             | copy   |
      | Promoting inclusivity | copy 1 |
      | Distinctly human   | copy 2 |
      | Enabling ambition     | Copy 3 |

  @Savings_Block
  Scenario Outline: Verify Savings Block Header and button
    When I navigate to the Savings block
    Then I should see the Savings Block Header "<header>" displayed
    And the Savings button "<button>" should be present
    When I click on the Savings button
    Then I should be redirected to the savings account page

    Examples: 
      | header  | button  |
      | Savings | Savings |

  @Mortgages_Block
  Scenario Outline: Verify Mortgages Block Header and button
    When I navigate to the Mortgages block
    Then I should see the Mortgages Block Header "<header>" displayed
    And the Mortgages button "<button>" should be present
    When I click on the Mortgages button
    Then I should be redirected to the Mortgages page

    Examples: 
      | header    | button    |
      | Mortgages | Mortgages |

  @Business_Finance
  Scenario Outline: Verify Business finance Header and button
    When I navigate to the Business finance section
    Then I should see the Business finance Header "<header>" displayed
    And the Business finance button "<button>" should be present
    When I click on the Business finance button
    Then I should be redirected to the Business finance page

    Examples: 
      | header           | button           |
      | Business finance | Business finance |

  @Intermediaries_Banner
  Scenario Outline: Verify Intermediaries Banner  Header and link
    When I navigate to the Intermediaries Banner section
    Then I should see the Intermediaries Banner Header "<header>" displayed
    And the Intermediaries Banner link "<link>" should be present
    When I click on the Find out more link
    Then I should be redirected to the Intermediaries Banner page

    Examples: 
      | header         | link          |
      | Intermediaries | Find out more |
