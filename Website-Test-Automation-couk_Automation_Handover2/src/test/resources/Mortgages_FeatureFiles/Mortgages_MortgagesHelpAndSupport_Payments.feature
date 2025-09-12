

@MortgagesHelpAndSupport_Payments

Feature: Payments
I want to verify the component in  this page 

Background:
	Given Aldermore home dispalyed 
	When  I navigate to Mortgages help and support page  

@PaymentsTitle
Scenario Outline: Verify the Payments header
	Then  I should see the "<cardName>" CTA button
	When  I click on the button
	Then  I should be naviagated to respective "<pageTitle>" page
   
Examples:
		  | cardName  | pageTitle              |
	    | Payments  | Your mortgage payments |
		 
@USPSection		 
Scenario Outline: Verify the USPSection present on the page 
	Then  I navigate to Payments page
	And   I should see "<NavigationBar>" on the page

   	  Examples:
		 | 	NavigationBar      		| 
		 |  Your first payment		|
		 |	Ways to pay        		| 
		 |	Make an overpayment 	|
		 |  Repaying your balance 	|
		 |  Variable rate mortgages |
		 
@Link		 
Scenario Outline: Verify CTA link on present on the page 
	Then  I navigate to Payments page
	And   I verify the "<Subheader>" on the page
	And   I clicked "<links>"
	Then  I should be redirected to respective "<pageTitle>" page 

   	  Examples:
		 | 	Subheader                                              |links         | pageTitle                    |
	   |  The Aldermore Managed Rate and variable rate mortgages.|money worries | Customers with money worries |
	   |  Repaying the outstanding balance on your mortgage.  	 |here.         | Switching your mortgage      | 

@ImageSection
Scenario Outline: Verify the Image copy section contents on the page
	Then I navigate to Payments page
	And I should see the "<ImageSection>" header on the page
	
	  Examples:
		| ImageSection |
		| Ways to pay  |

@FAQHeader
Scenario Outline: Verify Payments FAQs section links 
Then I navigate to Payments page 
And  I should see the Payments FAQs header "<header>" on page
And  I should see the more card header "<moreCardHeader>" on Payments FAQs section
And  I click on FAQs CTA button and should be redirected to "<pageTitle>" page

 Examples:      
 			| header             				 | moreCardHeader      	  | pageTitle 							  |
      | Frequently asked questions | Do you need more help? | Mortgages help and support|  		

		 
	   		 
		 
		 
		 