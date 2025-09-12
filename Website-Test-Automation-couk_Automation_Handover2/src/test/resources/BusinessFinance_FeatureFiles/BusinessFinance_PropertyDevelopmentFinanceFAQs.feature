#text-block text-block-grey
#Completed
@Property_development_finance_FAQs
Feature: Property development finance FAQs
  I want to verify the component in this page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Property development finance FAQ option
    Then I should be naviagated to Property development finance FAQ page

  Scenario Outline: Verify the Property development Finance FAQs present on the page
    And I should see the Property development Finance FAQs header "<header>"  on Property development Finance FAQ page
    And I should see the Property development Finance FAQs Accordians on the Property development Finance FAQ page
    And I should be able to click on Property development Finance CTA button and should be directed to "<pageTite>" page

    Examples: 
      | header                              | pageTite                     |
      | Property Development Finance - FAQs | Property Development Finance |
