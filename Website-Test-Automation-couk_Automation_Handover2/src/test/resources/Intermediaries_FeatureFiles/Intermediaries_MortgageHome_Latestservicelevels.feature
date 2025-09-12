@Latestservicelevels
Feature: Latest service levels page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Latest service levels link
    Then I should navigate to Latest service levels page

  #@Masthead
  #Scenario Outline: Verify the Latest service levels page header
    #And I should see the "<header>" as the header for the Latest service levels page
#
    #Examples: 
      #| header                |
      #| Latest service levels |

 
  @Headers
   Scenario Outline: Verify the headers present on the page.
    And I should see this "<CardHeaderText>" headers on the Latest service levels page
    
    Examples: 
     | CardHeaderText                  			  		|
     | Initial packaging review - for all cases   |
     #| Residential and standard buy to let	      |
     #| Specialist buy to let	 										|
     #| Residential and Buy to let submission guide|
  