@ProtectingYourselfFromFraudCardPage
Feature: Protecting yourself from fraud page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I navigate to Fixed Rate Savings Account page
    Then I shoud see Protecting yourself from fraud card
    When I click on Protecting yourself from frau card
    Then it should redirect me to Protecting yourself from fraud page

  @Masthead
  Scenario Outline: Verify the 'Protecting yourself from fraud page' header
    And I should see the "<header>" as the header for the Important Protecting yourself from fraud page

    Examples: 
      | header                                             |
      | Online security and protecting yourself from fraud |

  @TextAreaBlock
  Scenario Outline: Verify the Text area blocks present on the page
    And I should the "<header>" Text area present on the page

    Examples: 
      | header                                      |
      | Do you think you've been a victim of fraud? |
      | Identity fraud                              |
      | Shopping online                             |
      | Money mules                                 |

  @Accordian
  Scenario Outline: Verify the Accordian "Latest Scams" present on the page
    And I should see the "<header>" accordain on the page
    And I should be able to expand the accordians upon clicking on it

    Examples: 
      | header       |
      | Latest scams |
