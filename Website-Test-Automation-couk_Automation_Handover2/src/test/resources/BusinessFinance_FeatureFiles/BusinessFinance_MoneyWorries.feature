#Completed
@BSMoneyWorries
Feature: Money Worries
  I want to verify the component in this page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Money Worries option
    Then I should be naviagated to Money Worries page

  @Masthead
  Scenario Outline: Verify the Money Worries header
    And I should see "<header>" on Money Worries page header

    Examples: 
      | header                           |
      | Cost of living and money worries |

  @ImageCopySection
  Scenario Outline: Verify the Image Copy sections present on the page
    And I should see the "<title>" as a "<titleNum>" Image copy header on Money Worries page

    Examples: 
      | title                             | titleNum |
      | Customers with money worries      | First    |
      | Independent advice                | Second   |
      | Bank of England base rate changes | Third    |
      | Being scam savvy                  | Fourth   |

  @ImageCopyLinkedPage1
  Scenario: Verify the Image copy link pages.
    And I should be able to click on the Find out more on the Bank of England base rate changes image copy link and redirected to the respective page

  @ImageCopyLinkedPage2
  Scenario: Verify the Image copy link pages.
    And I should be able to click on the link on the Being scam savvy image copy link and redirected to the respective page
