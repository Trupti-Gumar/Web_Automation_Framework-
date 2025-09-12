@ResidentialOwnerOccupied
Feature: Residential owner occupied page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Residential owner occupied link
    Then I should navigate to Residential owner occupied page

  @Masthead
  Scenario Outline: Verify the Residential owner occupied page header
    And I should see the "<header>" as the header for the Residential owner occupied page

    Examples: 
      | header                               |
      | Residential mortgages |

  @Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on the Residential owner occupied page

    Examples: 
      | header      |
      | Quick links |

  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Residential owner occupied page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle                 | pageHeader                            				  |
      | Documents								  | Residential Mortgage Documents - Intermediaries |
      | Login to submit business  | Residential Owner-Occupied Mortgages 			   		|
      | Calculators    						| Affordability Calculators - Intermediaries      |

  @USP
  Scenario Outline: Verify the Unique Selling Points present on this page
    And I should see the "<USPHeader>" as USP sub header on the Residential owner occupied page

    Examples: 
      | USPHeader                 |
      | Human underwriting        |
      | Self-employed specialists |
      | Adverse credit            |
      | High LTV available        |

  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section present on the page
    And I should see the "<header>" as the header for the "<headerNum>"  image copy section on the Residential owner occupied page

    Examples: 
      | header                               | headerNum |
      | Contact us      										 | First     |
#      | For your clients with adverse credit | Second    |

  @UsefulLinks
  Scenario Outline: Verify the Useful links present on the Residential owner occupied page.
    And I shoud be able to clik on "<linkTitle>" link on Residential owner occupied page and redirected to the "<pageTitle>" page

    Examples: 
      | linkTitle                               | pageTitle                                                      |
      | View our latest service levels		      | Our Latest Mortgage Turnaround Times                           |
      | Our Platinum Broker service proposition | Platinum Broker Service Propositions                           |
      | Residential mortgage documents          | Residential Mortgage Documents - Intermediaries								 |

#  @YellowCTABanner
#  Scenario Outline: Verify the CTA Banner present on the page.
#    And I shoukd be able to see the "<header>" CTA banner on Residential owner occupied page
#    And I should be click on the CTA banner and redirected to the respective page

#    Examples: 
#      | header                                        |
#      | Login to submit business, or register with us |
