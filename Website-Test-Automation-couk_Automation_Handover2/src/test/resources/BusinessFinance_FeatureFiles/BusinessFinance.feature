#navigation-menu__dropdown-container
#completed
@Business_financePage
Feature: Business finance
  I want to verify the dropdown options in Business finance page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance option

  Scenario Outline: Verify the Business finance Header
    Then I should see the "<header>" as header

    Examples: 
      | header           |
      | Business Finance |

  Scenario Outline: Verify the Cards present on Business finance page
    Then I should see the "<cardheader>" present on Business finance page

    Examples: 
      | cardheader             |
      | Invoice Finance        |
      | Asset Finance          |
      | Commercial Real Estate |
