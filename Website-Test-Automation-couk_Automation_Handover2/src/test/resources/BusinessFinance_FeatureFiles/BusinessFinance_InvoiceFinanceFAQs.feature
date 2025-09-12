#masthead
#Completed
@Invoice_Finance_-_FAQs
Feature: Invoice Finance - FAQs
  I want to verify the component in this page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Invoice Finance FAQ option
    Then I should be naviagated to Invoice Finance FAQ page

  Scenario Outline: Verify the Invoice Finance FAQs present on the page
    And I should see the Invoice Finance FAQs header "<header>"  on Invoice Finance FAQ page
    And I should see the Invoice Finance FAQs Accordians on the Invoice Finance FAQ page
    And I should be able to click on Invoice Finance CTA button and should be directed to "<pageTite>" page

    Examples: 
      | header                 | pageTite        |
      | Invoice Finance - FAQs | Invoice Finance Solutions for Businesses |
