@Internediaries_BusinessFinance_CommercialRealEstate

Feature: Internediaries Commercial Real Estate home page
  I want to verify the components in this page
  
   Background: 
    Given I am on a Aldermore home page
    When  I click on Intermediaries link
    Then  I should navigate to Internediaries home page
    Then  I click on Business finance dropdown
    And   I click on Commercial Real Estate
    
 @RealCommericialEstate_Intermediaries   
 Scenario Outline: Verify the Intermediaies Real Commercial Estate Page 
 Then I should see the "<header>" for the Real Commercial Estate Page 
     
	Examples: 
   | header          				|
   | Commercial Real Estate |
   
 @Masthead_BlackboxRealCommercialEstate
Scenario Outline: Verify the Masthead black box present on the page
And I should see the "<header>" as the header for the Masthead black box on Real Commercial Estate Page
    Examples: 
      | header      |
      | Quick links | 
      
 @Masthead_Blackbox_Links_RealCommercialEstate
 Scenario Outline: Verify the Masthead black box links present on the page
And I should be able to click on the "<linkTitle>" link present on the Real Commercial Estate Page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle       | pageHeader                        							 |
      | Get in touch    | Contact us - Commercial Mortgages 							 |       		
      | Useful documents| Commercial mortgage documents for intermediaries |
      
@USPSection_RealCommercialEstate
Scenario Outline: Verify the USP section Present on the page 
And I should see the "<USP>" section header present on the page 

		Examples: 
		|USP|    
		|Funding| 
		|One stop shop| 
		|Sustainability focus|
		
		
@ImageSecionHeader_RealCommercialEstate
Scenario Outline: Verify the Image Section header present on page 
Then I should see the "<Imageheader>" on Real Commercial Estate Page
    	Examples: 
    	|Imageheader| 
    	|Purpose built student accommodation (PBSA)|
    	|Care homes|
    	|Build to Rent (BTR)|
    	
@CardHeader_RealCOmmercialEstate
Scenario Outline: Verify the Card header present on page  	
Then I should see the "<CardHeader>" present on the page and should redirected to "<PageTitle>" after clicking

Examples:
|CardHeader					 |PageTitle										|
|Commercial mortgages|Commercial mortgages				|
|Property Development|Property Development Finance|
  
  
@YellowCTABanner
 Scenario Outline: Verify the Yellow CTA beener present on Invoice Finance page 
 And I should see the "<CTAbanner>" present on the Real Commercial Estate Page and redirected to "<CTAPageTitle>"
 
 Examples: 
 |CTAbanner   | CTAPageTitle             						|
 |Get in touch|Aldermore for Intermediaries Contact |
  
  