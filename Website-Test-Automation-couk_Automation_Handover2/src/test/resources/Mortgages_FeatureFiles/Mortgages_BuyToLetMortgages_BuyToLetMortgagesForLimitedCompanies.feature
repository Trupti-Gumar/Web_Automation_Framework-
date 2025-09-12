@Buy_to_let_mortgages_for_limited_companies

Feature: Buy to let mortgages for limited companies
I want to verify the component in this page.

Background: 
Given I am on the Aldermore page
When  I see Mortgages dropdown option

@Buytoletmortgagesforlimitedcompanies
Scenario Outline: Verify Buy to let mortgages for limited companies header
Then  I see "<MenuItem>" as a Link
And   I click link 
Then  I redirected to the "<PageTitle>" page

Examples:
     |MenuItem                                  | PageTitle   												       |
     |Buy to let limited company mortgages      | Buy to let mortgages for limited companies |
	
@USPHeader		
Scenario Outline: Verify the Unique selling point present on the page 
Then I navigate to Buy to let mortgages for limited companies page  
Then I see the "<UPSHeader>" as the USP sub header 
	
Examples: 
	| UPSHeader 				                      		 |  
	| Buy to let mortgages for limited companies   | 
	| Specialists in portfolio landlord lending    |
	| Human underwriting                           |
	| Expert support        											 |	
	 
@ImageSection	 
Scenario Outline: Verify headers on Image copy section
Then  I navigate to Buy to let mortgages for limited companies page 	
Then  I see the "<header>" on the Image section 

Examples: 
	|header 	      															|
	|Limited company buy to let mortgages         |
	|The changing tax landscape                   |
	|Multiple properties on one application       | 
		
@BlackBox
Scenario Outline: Verify the BlackBox present on the page 
Then I navigate to Buy to let mortgages for limited companies page 
Then I see the Blackbox present on the page and should verify the "<header>" 

Examples: 
|header|
|Let's get started|

@CardHeader
Scenario Outline: Verify the CardHeader present on the page 
Then I navigate to Buy to let mortgages for limited companies page
Then "<cardheader>" is present on the page 
Examples:
|cardheader																														|
|Buy to let mortgages                       													|
|Residential mortgages       													                |
|Mortgages help and support                 													|
|10 tips for first time buy to let landlords													|
|Top tips for expanding your buy to let portfolio											|
|Looking to make a buy to let investment? Check out Manchester…  			|
|Understanding complex buy to let mortgages: 5 things you need to know|

@FAQ
Scenario Outline: Verify the FAQ header present on the page 
Then I navigate to Buy to let mortgages for limited companies page
Then "<FAQheader>" on the page 
Examples:
|FAQheader|
|Limited company buy to let mortgage FAQs|


