@Business_finance_customers

Feature: Business finance customers
I want to verify the component in  this page

Background: 
Given On Aldermore page
Then  I navigate to ContactUs page under Help and Support option

@BusinessFinanceCustomer
Scenario Outline: Verify the Business finance customers header
	Then  See the "<cardName>" CTA button
	When  clicked CTA card button
	Then  naviagated to respective "<pageTitle>" page
   
   	  Examples:
		   | cardName                   | pageTitle                      			               |
	     | Business finance customers | Contact information for Business finance customers |
		 
@BusinessFinanceCustomersubheader		 
Scenario Outline: Verify "<TextHeader>" present under page
	Then  I navigate to Business finance customers page
	And   I should see "<TextHeader>" under the page 
	
	  Examples:
		   | TextHeader       	                 | 
	     | Business Finance contact information|

	     
@BusinessFinanceCustomerExpands    
Scenario: Verify Business Finance contact information expands otpions
	Then  I navigate to Business finance customers page
	And   I should be click on Business Finance contact information accordian and it should expand 
	