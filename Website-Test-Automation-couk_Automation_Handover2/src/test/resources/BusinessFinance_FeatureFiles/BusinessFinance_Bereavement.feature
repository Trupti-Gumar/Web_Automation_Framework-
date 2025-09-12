#text-block text-block-grey
#Completed
@BSBereavementGuide
Feature: Bereavement Guide
  I want to verify the component in this page

  Background: 
    Given I am landed on Aldermore page
    When I click on the Business finance dropdown option
    Then I should see the Business finance options
    When I click on the Bereavement Guide option
    Then I should be naviagated to Bereavement Guide page

  @Masthead
  Scenario Outline: Verify the Bereavement Guide header
    And I should see "<header>" on Bereavement Guide page header

    Examples: 
      | header      |
      | Bereavement |

  @TextBlock
  Scenario Outline: Verify the different textblock present on the page
    And I should see "<header>" textblock on the Bereavement Guide page

    Examples: 
      | header             |
      | What to do first   |
      | Terms you'll hear |
      | Who else can help  |

  @Accordian
  Scenario Outline: Verify the Accordian section on the page
    And I should see "<header>" as accordian header on the Bereavement Guide page
    And I should be able to expand accordian links

    Examples: 
      | header            |
      | How to contact us |
