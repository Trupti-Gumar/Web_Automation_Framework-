@MortgageHome
Feature: Mortgage Home page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Mortgages Home
    Then I should navigate to Mortgage Home page

  @Masthead
  Scenario Outline: Verify the Mortgage Home page header
    And I should see the "<header>" as the header for the Mortgage Home page

    Examples: 
      | header                  |
      | Mortgage Intermediaries |

  @Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box

    Examples: 
      | header      |
      | Quick links |

  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle                  | pageHeader 													 |
      | Calculators                | Calculators													 |
      | Latest service levels      | Our Latest Mortgage Turnaround Times  |
      | Log in to submit business	 | Mortgage Intermediaries               | 
      
     

 # @USP
 # Scenario Outline: Verify the Unique Selling Points present on this page
 #  And I should see the "<USPHeader>" as USP sub header on the Mortgage Home page

 #   Examples: 
 #     | USPHeader                |
 #     | 10 day DIP guarantee     |
 #     | Free & remote valuations |
 #     | Platinum broker          |
 #     | Simple client switching  |

  @Cards
  Scenario Outline: Verify the cards presents on the page
    And I should see "<cardTitle>" card on the Mortgage Home page
    And I should be able to click on the "<cardTitle>" card on the Mortgage Home page and redirected to "<pageTitle>" page

    Examples: 
      | cardTitle                           | pageTitle                                |
      | Residential mortgages               | Residential Owner-Occupied Mortgages     |
      | Buy to let mortgages                | Buy to Let Mortgage Intermediaries       |
      | Multi property buy to let mortgages | Multi property buy to let mortgages      |
      | Commercial mortgages                | Commercial Mortgages for Intermediaries  |
      | Product switch                      | Mortgage Product Switch - Intermediaries |
      | Residential mortgage documents      | Residential Mortgage Documents - Intermediaries |
      | Buy to let mortgage documents       | Buy to Let Mortgage Documents - Intermediaries |
      | Product switch documents            | Mortgage Product Switch Documents - Intermediaries |

  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section present on the page (Calculators present under quick links)
    And I should see the "<header>" as the header for the "<headerNum>"  image copy section on the Mortgage Home page

    Examples: 
      | header                          | headerNum |
      | Calculators										  | First     |
      | Contact us			                | Second    |
      | Our Platinum Broker Proposition | Third    |

  #@MortgageIntermediaryFAQ
  #Scenario Outline: Verify Mortgage intermediary FAQs present on Mortgage Home page
    #And I should see the Mortgage intermediary FAQs header "<header>"  on Mortgage Home page
    #And I should be able to expand the accordian on Mortgage Home page
#
    #Examples: 
      #| header                     |
      #| Mortgage intermediary FAQs |
#
  #@UsefulLinks
  #Scenario Outline: Verify the Useful links present on the Mortgage Home page.
    #And I should be able to click on "<linkTitle>" link and redirected to the "<pageTitle>" page
#
    #Examples: 
      #| linkTitle                 							| pageTitle                           		   |
      #| Platinum Broker service proposition     | Platinum Broker Service Propositions 			 |
      #| Product switch            							| Mortgage Product Switch - Intermediaries   |
      #| View our latest updates and news 				| Latest Mortgage Updates for Intermediaries |
      #
      #
  #@Login_Cards
  #Scenario Outline: Verify the Login Cards present on the page
    #And I should see "<logincardTitle>" login card header on the Mortgage Home page
    #And I should be able to click on the "<logincardTitle>" logincardbutton and redirected to the "<pageTitle>" page
#
    #Examples: 
      #| logincardTitle             							| pageTitle 										|
      #| Residential mortgages broker portal     | Aldermore Residential - Login	|
      #| Specialist buy to let mortgage portal   | Aldermore Commercial - Login  |  
