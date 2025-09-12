@AldermoreHomePage
Feature: Aldermore Homepage
  I want to use this template for my feature file
  
  @Footer_Menu_Accounts_and_products
  Scenario Outline: Verify the Accounts and products Options Menu Pages
    Given I see Aldermore page
    And   I will click to the "<FooterMenuOptions>" and verify the pagetile
        
    Examples: 
    |FooterMenuOptions   |
    |Personal savings    |
    |Business savings    |
    |Mortgages           |
    |Business finance    |
    |Intermediaries      | 
   
   
  @Footer_Menu_Help_and_support
  Scenario Outline: Verify the Help and support Options Menu Pages
    Given I see Aldermore page
    And   I will click to the "<FooterMenuOptions>" on Help and support page and verify the pagetile
        
    Examples: 
    |FooterMenuOptions   								|
		|Complaints													|
		|Contact us													|
		|Supporting during challenging times|
		|Online security and fraud					|	
		|Test Investor Link									|
		
  @Footer_Menu_About_us
  Scenario Outline: Verify the About us Options Menu Pages
    Given I see Aldermore page
    And   I will click to the "<FooterMenuOptions>" on About us page and verify the pagetile
        
    Examples: 
    |FooterMenuOptions   			|
		|About us                 |
		|Careers									|
		|Modern slavery statement |
		|Terms and conditions			|
		|Privacy policy						|
		|Cookie policy						|
		|Newsroom									|
		|Insights - our blog			|
		
@Help_&_Support_Card_Header
Scenario Outline: Verify the Card header on the footer page 
	Given I see Aldermore page	
	And   I can see the "<Help&Support>" card header on the footer page 

    Examples: 
    |Help&Support	     |	
    |Help and support  |
		
@Connect_with_usOptions
Scenario Outline: Verify the Connect with us on the footer page
	Given I see Aldermore page	
	And I can see the "<Options>" for Connect with us options on the footer page
	
	Examples: 
	|Options|
	|Linkedin|
	|Instagram|
	|YouTube|
	|Twitter|
	|Facebook|
	
	
@FooterLogo
Scenario Outline: Verify the footer logo 
  Given I see Aldermore page	
	And I see the aldermore "<Footerlogo>" on the page 
	
	Examples:
	|Footerlogo|
	|Aldermore|
		
@FSCSOption
	Scenario: Verify the FSCS on the footer page 
  Given I see Aldermore page	
	And I can see the FSCS Option on the page 

		
		
		