@Multipropertybuytoletmortgages
Feature: Multi property buy to let mortgages page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Multi property buy to let mortgages link
    Then I should navigate to Multi property buy to let mortgages page

  @Masthead
  Scenario Outline: Verify the Multi property buy to let mortgages page header
    And I should see the "<header>" as the header for the Multi property buy to let mortgages page

    Examples: 
      | header                							 |
      | Multi property buy to let mortgages	 |

  @Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on the Multi property buy to let mortgages page

    Examples: 
      | header      |
      | Quick links |

  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Multi property buy to let mortgages page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle                 | pageHeader                            				  |
      | Products and rates - download documents								  | Buy to Let Mortgage Documents - Intermediaries  |
      | Calculators								| Affordability Calculators - Intermediaries      |
      | Log in to submit business | Multi property buy to let mortgages 			   		|

  #@USP
  #Scenario Outline: Verify the Unique Selling Points present on this page
    #And I should see the "<USPHeader>" as USP sub header on the Multi property buy to let mortgages page
#
    #Examples: 
      #| USPHeader                 |
      #| One application           |
      #| Packaging and underwriting|
      #| Expert team               |
#
  #@Image_Copy_Section
  #Scenario Outline: Verify the Image copy section present on the page
    #And I should see the "<header>" as the header for the "<headerNum>" image copy section on the Multi property buy to let mortgages page
#
    #Examples: 
      #| header                               | headerNum |
      #| Contact us      										 | First     |
#
  #@UsefulLinks
  #Scenario Outline: Verify the Useful links present on the Multi property buy to let mortgages page.
    #And I shoud be able to click on "<linkTitle>" link on Multi property buy to let mortgages page and redirected to the "<pageTitle>" page
#
    #Examples: 
      #| linkTitle                               | pageTitle                                                      |
      #| View our latest turnaround times  		  | Our Latest Mortgage Turnaround Times                           |
      #| Product and eligibility guides  				| Buy to Let Mortgage Documents - Intermediaries                 |
      #| Affordability calculators         			| Affordability Calculators - Intermediaries										 |
      #
      #
  #@Login_Cards
  #Scenario Outline: Verify the Login Cards present on the page
    #And I should see "<logincardTitle>" login card header on the Multi property buy to let mortgages page
    #And I should be able to click on the "<logincardTitle>" login card button on the Multi property buy to let mortgages page and redirected to the "<pageTitle>" page
#
    #Examples: 
      #| logincardTitle             							| pageTitle 										|
      #| Specialist buy to let mortgage portal   | Aldermore Commercial - Login	|
#
