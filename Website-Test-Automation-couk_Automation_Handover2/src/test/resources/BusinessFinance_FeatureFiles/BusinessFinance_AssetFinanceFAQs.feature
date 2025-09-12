#text-block text-block-grey
#Completed
@Asset_finance_FAQs
Feature: Asset finance FAQs
  I want to verify the component in this page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Asset Finance FAQ option
    Then I should be naviagated to Asset Finance FAQ page

  Scenario Outline: Verify the Asset Finance FAQs present on the page
    And I should see the Asset Finance FAQs header "<header>"  on Asset Finance FAQ page
    And I should see the Asset Finance FAQs Accordians on the Asset Finance FAQ page
    And I should be able to click on Asset Finance CTA button and should be directed to "<pageTite>" page

    Examples: 
      | header               | pageTite                               |
      | Asset Finance - FAQs | Asset Finance Solutions for Businesses |
