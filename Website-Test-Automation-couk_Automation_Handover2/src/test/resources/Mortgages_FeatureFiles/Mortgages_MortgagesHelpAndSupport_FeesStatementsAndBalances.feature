@Fees,_statements_and_balances

Feature: Fees, statements and balances
I want to verify the component in  this page 

Background: 
	Given Aldermore home dispalyed 
	When  I navigate to Mortgages help and support page

@Fees,_statements_and_balancesPageTitle
Scenario Outline: Verify the Fees, statements and balances  header
	Then  "<cardName>" CTA button displayed
	When  clicked on CTA button
	Then  Naviagated to respective "<pageTitle>" page
   
   	  Examples:
		 | cardName  					           | pageTitle                     |
	   | Fees, statements and balances | Fees, statements and balances |
		 
@SubHeader	 
Scenario Outline: Verify the "<NavigationBar>" present on the page 
	Then  I navigate to Fees, statements and balances page
	And   "<NavigationBar>" present on the page to be validated

   	  Examples:
		 | NavigationBar      			| 
		 | Your annual statement 		|
		 | Your remaining balance.		|
		 | Your certificate of interest |
		 

@Links		 
Scenario Outline: Verify CTA link on "<NavigationBar>" present on the page 
	Then  I navigate to Fees, statements and balances page
  And   I see the "<link>" present on the subheader
	Then  i redirected on "<pageTitle>" when clicked to links

   	  Examples:
		   |link                           | pageTitle            |
	     |Request a statement.           | 404 - page not found |
	     |Request a certificate of interest|My mortgage information|
		 
		 
@BlackBox
Scenario Outline: Verify the links present on the Quick Links box 
 Then I navigate to Fees, statements and balances page
 And  I see the "<QuickLink>" header on the page 
 
 Examples:
 |QuickLink|
 |Quick links			|
 |Help and support|
 |Mortgage FAQs		|
		

@BlackBoxLink
Scenario Outline: Verify the links present on the Quick Links box 
 Then I navigate to Fees, statements and balances page
 And  I clicked the "<link>" 
 Then redirected to "<PageTitle>"
 
 Examples:
 |Links           | PageTitle  |
 |Help and support| Mortgages help and support   |
 |Mortgage FAQs		| Mortgage FAQs                |
				
		
		
		
		
		
		