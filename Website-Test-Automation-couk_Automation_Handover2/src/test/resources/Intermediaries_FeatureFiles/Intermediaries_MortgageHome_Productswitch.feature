@Productswitch
Feature: Buy to let mortgages page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Product switch link
    Then I should navigate to Product switch page

  @Masthead
  Scenario Outline: Verify the Product switch page header
    And I should see the "<header>" as the header for the Product switch page

    Examples: 
      | header                 |
      | Hassle free product switching	 |

  @Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on the Product switch page

    Examples: 
      | header      |
      | Quick links |

  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Product switch page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle                 | pageHeader                            				  		|
      | Product switch guide			| Mortgage Product Switch Documents - Intermediaries  |
 #     | How to switch guide				| how-to-switch-your-clients-online.pdf      					|
      | Login to switch 				  | Aldermore Residential - Login 			   							|

  @USP
  Scenario Outline: Verify the Unique Selling Points present on this page
    And I should see the "<USPHeader>" as USP sub header on the Product switch page

    Examples: 
      | USPHeader                 |
      | Great rewards       			|
      | Fee free & hassle free 		|
      | Switch alerts          	  |
      | Residential Broker portal |

  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section present on the page
    And I should see the "<header>" as the header for the "<headerNum>" image copy section on the Product switch page

    Examples: 
      | header                               | headerNum |
      | Who can switch?      								 | First     |
      | How to switch your clients					 | Second    |

  @Cards
   Scenario Outline: Verify the useful documents card present on the page.
    And I should see this "<CardTitle>" useful documents card on the Product switch page
    
    Examples: 
     | CardTitle                         |
     | Product switch mortgage guide     |
     | How to switch your clients online |
     | View all documents 							 |
     
   @Cards
   Scenario Outline: Verify the cardlink redirect to the page.
    And I should be able to click on this "<CardTitle>" cardlink on the Product switch page and redirected to the "<pageHeader>" page
    
    Examples: 
     | CardTitle             | pageHeader																			|
     | View all documents	   | Mortgage Documents for Intermediaries 					|
      
      
   @CTA_Banner
   Scenario Outline: Verify the CTA Banner present on the page
    And I should see this "<CTABannerTitle>" Banner on the Product switch page
    And I should be able to click on the "<CTABannerTitle>" Banner on the Product switch page and redirected to the "<pageTitle>" page

    Examples: 
      | CTABannerTitle             	 | pageTitle 										|
      | Login or register to submit business     | Aldermore Residential - Login|
