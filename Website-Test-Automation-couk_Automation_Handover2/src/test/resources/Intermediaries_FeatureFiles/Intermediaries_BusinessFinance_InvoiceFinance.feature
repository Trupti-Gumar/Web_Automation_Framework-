@Internediaries_BusinessFinance_InvoiceFincance

Feature: Internediaries AInvoicesset Finance home page
  I want to verify the components in this page
  
  
 Background: 
    Given I am on a Aldermore home page
    When  I click on Intermediaries link
    Then  I should navigate to Internediaries home page
    Then  I click on Business finance dropdown
    And   I click on Invoice Finance page 
    
 @InvoiceFinance_Intermediaries   
 Scenario Outline: Verify the Intermediaies Invoice Finnace Page 
 Then I should see the "<header>" for the Invoice finance Home page
     
	Examples: 
   | header          |
   | Invoice Finance |
   
@Masthead_BlackboxInvoiceFinance
Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on Invoice Finance page
    Examples: 
      | header      |
      | Quick links |  
   
 @Masthead_Blackbox_Links_InvoiceFinance
 Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Invoice Finance page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle                | pageHeader                            			                 |
      | Get in touch             | Invoice Finance Contact Information for Intermediaries      |       		
      | Invoice finance documents| Invoice Finance Documents for Intermediaries Aldermore Bank |

 @USP_InvoiceFinance
 Scenario Outline: Verify the Unique Selling Points present on this page
    And I should see the "<USPHeader>" as USP sub header on the Invoice Finance Page
    
    Examples: 
      | USPHeader  |
      | Flexible funding    |
      | Long-term partners  |
      | Same day funds      |
      |Online account access|
      
      
@ImageSecionHeader_InvoiceFinance
Scenario Outline: Verify the Image Section header present on page 
    Then I should see the "<Imageheader>" on the Invoice Finance Page 
    	Examples: 
    	|Imageheader| 
    	|Our products|
    	|Who we fund|
    	|What we fund|
    	
    	
@YellowCTABanner
 Scenario Outline: Verify the Yellow CTA beener present on Invoice Finance page 
 And I should see the "<CTAbanner>" present on the Invoice Finance page 
 And I click and redirected to "<CTAPageTitle>"
 
 Examples: 
 |CTAbanner   | CTAPageTitle             														 |
 |Get in touch|Invoice Finance Contact Information for Intermediaries|
      
      
      
      
      
      
      
      
      
      