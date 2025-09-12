@CommercialMortgages
Feature: Commercial mortgages
  I want to verify Commercial mortgages page

Background: 
    Given I am on the Aldermore page
    When  I navigate to Mortgages dropdown option
    
  @Commercial_Mortgages
  Scenario Outline: Verify Commercial Mortgages page
	 Then  I see the "<headerlink>" as option 
	 And  I see and click link
   Then  I redirected to "<PageTitle>" 
   
  Examples:
    |headerlink           | PageTitle            |
    |Commercial mortgages | Commercial mortgages |

  @USPSection
  Scenario Outline: Verify USP section on the page 
    Then I navigated to Commercial mortgages page
    And  I should see the "<USPSection>" on the page

    Examples: 
		|USPSection|
		|We treat you as an individual|
		|Up to 75% LTV available|
		|Borrow 1m-25m|
		|Expert personal support|

	@ImageSection
	Scenario Outline: Verify the Image Section header
		Then I navigated to Commercial mortgages page
		And  I should see the Image section "<header>" on the page 
		
		Examples:
		|header|
		|Commercial mortgage specialists|
		|Product highlights|
		|VAT loans|
		
@cardheader
Scenario Outline: Verify CardHeader On the page 
	  Then I navigated to Commercial mortgages page
	  And  I see the "<cardheader>" on the page 
	  
	  Examples: 
	  |cardheader|
	  |Property development finance|
	  |Business finance|
	  |Business savings accounts|	  
	  
	  
@BottomLink
Scenario Outline: Verify the bottom link on the page 
		Then I navigated to Commercial mortgages page   
		And  I click the "<bottomLink>" and redirected to the "<PageTitle>" 
		
	 Examples:
	 |bottomLink                            |PageTitle |
	 |Speak to our commercial mortgages team|Contact information for mortgage customers|
	  
	  
@blackBox 
Scenario Outline: Verify the BlackBox header
	  Then I navigated to Commercial mortgages page
	  And I see "<BlackBoxHeader>" on the page 
	  
	  Examples: 
	  |BlackBoxHeader|
	  |Get in touch|
