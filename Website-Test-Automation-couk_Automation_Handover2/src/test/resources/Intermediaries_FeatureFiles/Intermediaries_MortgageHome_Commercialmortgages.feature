@CommercialMortgages
Feature: Residential owner occupied page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And  I click on the Mortgages dropdown
    And  I click to Mortgage Home options 
    And  I click on Commercial Mortgages link
    Then I should navigate to Commercial Mortgages page

@CommercialMortgagesPage
 Scenario: Verify the Commercial Mortgages page header
    And I should see the header for the Commercial Mortgages page

@ImageSection
Scenario Outline: Verify the Image Section in the page 
 And "<ImageHeader>" present on the commerical mortgage page
 
 Examples:
 |ImageHeader|
 |Commercial mortgages key features|
  
 @Masthead_Blackbox
 Scenario Outline: Verify the Masthead black box present on the page
  And I should see the "<header>" as the header for the Masthead black box on the Commerical Mortgage Page
    Examples: 
      | header      |
      | Quick links |
            
      
  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on Commercial Mortgage page and redirected to the "<pageHeader>" 

    Examples: 
      | linkTitle                    | pageHeader                                                 |
      | Get in touch                 | Commercial Mortgages Contact Information for Intermediaries|
      | Commercial mortgage documents| Commercial Mortgage Documents - Intermediaries						  |

  
  @DocumentsHeader
  Scenario Outline: Verify the Documents header on the page 
  And I see the "<DocumentsHeader>" on the Commercial Mortgage Header
  Examples:
  |DocumentsHeader                          | 
  |Commercial mortgages application form    |   
  |Commercial mortgages legal fee scale     |
  |Commercial mortgages tariff of charges   |
  |Regional lending team map                |
      