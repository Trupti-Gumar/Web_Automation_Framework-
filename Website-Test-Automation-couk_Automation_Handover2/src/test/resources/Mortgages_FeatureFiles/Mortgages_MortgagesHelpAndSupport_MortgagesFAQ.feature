@Mortgages_MortgagesHelpAndSupport_MortgagesFAQ

Feature: Mortgages FAQ
  I want to verify the component in Mortgages FAQ page
  
  Background: 
	Given Aldermore home dispalyed 
	When  I navigate to Mortgages help and support page
	
@MortgagesFAQCardName
Scenario Outline: Verify the Mortgages FAQ header
	Then  CTA button "<cardName>" displayed
	When  CTA button clicked
	Then  "<pageTitle>" page will be displayed
   
   	  Examples:
		   | cardName      | pageTitle    |
	     | Mortgage FAQs | Mortgage FAQs|
	     
@SubHeader     
Scenario Outline: Verify the Subheader On the page
  Then I naviagte to Mortgages FAQ page 
  And I will see the "<Subheader>" on the page 
  
  Examples:
  |Subheader|
  |General mortgage FAQs|
  |Applying for a mortgage with Aldermore|
  |Existing Aldermore customers|
  
  @Cards
 Scenario Outline: Verify the Card Name on the Page 
 Then I naviagte to Mortgages FAQ page 
 And  "<Cards>" present on the page
 When I click "<Cards>" 
 Then I redirected to cardName "<PageTitle>"
 
 Examples: 
 |Cards                     |PageTitle|
 |Mortgages help and support|Mortgages help and support|
 |Borrowing more            |Borrow more|
 |Money worries             |Customers with money worries|
 