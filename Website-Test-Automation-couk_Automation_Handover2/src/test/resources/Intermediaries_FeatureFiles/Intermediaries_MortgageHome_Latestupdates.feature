@Latestupdates
Feature: Latest updates page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Latest updates link
    Then I should navigate to Latest updates page

  @Masthead
  Scenario Outline: Verify the Latest updates page header
    And I should see the "<header>" as the header for the Latest updates page

    Examples: 
      | header         |
      | Latest updates |

 
  @Links
   Scenario Outline: Verify the recent intermediary updates present on the page.
    And I should see this recent intermediary updates link "<RecentIntermediaryUpdatesLink>" present on the Latest updates page
    
    Examples: 
     | RecentIntermediaryUpdatesLink |
     | current turnaround times.     |
     
     
 @Links
   Scenario Outline: Verify the recent intermediary updates page.
    And I should be able to click on this "<RecentIntermediaryUpdatesLink>" recent intermediary updates link on the Latest updates page and redirected to the "<pageHeader>" page
    
    Examples: 
     | RecentIntermediaryUpdatesLink | pageHeader | 
     | current turnaround times.     | Our Latest Mortgage Turnaround Times |  
  