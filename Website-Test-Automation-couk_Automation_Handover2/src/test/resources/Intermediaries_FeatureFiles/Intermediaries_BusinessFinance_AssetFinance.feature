@Intermediaries_Businessfinance_AssetFinance
Feature: Internediaries Asset Finance home page
  I want to verify the components in this page.
  
  
Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    Then I click on Business finance dropdown
    And  I click on Asset Finance option
 
 @MastheadAssetFinance
Scenario Outline: Verify the Intermediaries Asset Finance Home page header
    And I should see the "<header>" for the Asset finance Home page

    Examples: 
      | header        |
      | Asset Finance |
      
 
@Masthead_BlackboxAssetFinance
Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on Asset Finance page
    Examples: 
      | header      |
      | Quick links |  
 
 @Masthead_Blackbox_Links_AssetFinance
 Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Asset Finance page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle              | pageHeader                             |
      | Get in touch           | Contact us - Asset Finance             |
      | Asset finance documents| Asset finance documents for brokers    |
      | Log in to Asset Backer | Log in                                 |     
      
@USP_AssetFinance
 Scenario Outline: Verify the Unique Selling Points present on this page
    And I should see the "<USPHeader>" as USP sub header on the Asset Finance Page

    Examples: 
      | USPHeader  |
      | Expertise  |
      | Funding    |
      | Service    |

 @CardHeader_AssetFinance
 Scenario Outline: Verify the Cardheader present on the page 
 And I should be able to click on the "<CardHeader>" card and redirected to "<PageTitle>"
 Examples:
 |CardHeader																									|PageTitle																				 |    
 |Our products																								|Our Asset Finance products												 | 
 |Our sectors																									|Our Asset Finance sectors												 |
 |Our services																								|Our Asset Finance services												 |
 |Asset Backer																								|Asset Backer							  											 |
 |Wholesale finance																						|Wholesale Asset Finance													 |
 |Finance and Leasing Association (FLA)											  |Finance and Leasing Association									 |
 |National Association of Commercial Finance Borkers(NACFB)   |National Association of Commercial Finance Borkers|
 
 @YellowCTABanner
 Scenario Outline: Verify the Yellow CTA beener present on the page 
 And I should see the "<CTAbanner>" present on the page 
 And I click and redirected to the page
 
 Examples: 
 |CTAbanner|
 |Get in touch|
 
 