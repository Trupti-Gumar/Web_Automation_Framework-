@Buytoletmortgages
Feature: Buy to let mortgages page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Buy to let mortgages link
    Then I should navigate to Buy to let mortgages page

  @Masthead
  Scenario Outline: Verify the Buy to let mortgages page header
    And I should see the "<header>" as the header for the Buy to let mortgages page

    Examples: 
      | header                 |
      | Buy to let mortgages	 |

  @Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on the Buy to let mortgages page

    Examples: 
      | header      |
      | Quick links |

  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Buy to let mortgages page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle                 | pageHeader                            				  |
      | Products and rates - download documents								  | Buy to Let Mortgage Documents - Intermediaries  |
      | Affordability calculator	| Affordability Calculators - Intermediaries      |
      | Log in to submit business  | Buy to Let Mortgage Intermediaries  			   		|

  @USP
  Scenario Outline: Verify the Unique Selling Points present on this page
    And I should see the "<USPHeader>" as USP sub header on the Buy to let mortgages page

    Examples: 
      | USPHeader                 |
      | Buy to let for limited companies        |
      | Multiple properties on one application |
      | We lend on most property types           |
      | Buy to let mortgages for smaller landlords      |

  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section present on the page
    And I should see the "<header>" as the header for the "<headerNum>" image copy section on the Buy to let mortgages page

    Examples: 
      | header                               | headerNum |
      | Contact us      										 | First     |
      | For your clients with adverse credit | Second    |

  @UsefulLinks
  Scenario Outline: Verify the Useful links present on the Buy to let mortgages page.
    And I shoud be able to click on "<linkTitle>" link on Buy to let mortgages page and redirected to the "<pageTitle>" page

    Examples: 
      | linkTitle                               | pageTitle                                                      |
      | Platinum Broker service proposition		  | Platinum Broker Service Propositions                           |
      | View our latest updates and news 				| Latest Mortgage Updates for Intermediaries                     |
      | Product switch          								| Mortgage Product Switch - Intermediaries											 |
      
      
   @Cards
   Scenario Outline: Verify the card present on the page.
    And I should see this "<CardTitle>" card on the Buy to let mortgages page
    
    Examples: 
     | CardTitle                     |
     | View all buy to let documents |
     
     @Cards
   Scenario Outline: Verify the cardlink redirect to the page.
    And I should be able to click on this "<CardTitle>" cardlink and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             | pageHeader																			|
     | Buy to let documents	 | Buy to Let Mortgage Documents - Intermediaries |
      
      
   @Login_Cards
  Scenario Outline: Verify the Login Cards present on the page
    And I should see "<logincardTitle>" login card header on the Buy to let mortgages page
    And I should be able to click on the "<logincardTitle>" login card button and redirected to the "<pageTitle>" page

    Examples: 
      | logincardTitle             							| pageTitle 										|
      | Residential mortgages broker portal     | Aldermore Residential - Login	|
      | Specialist buy to let mortgage portal   | Aldermore Commercial - Login  |    

