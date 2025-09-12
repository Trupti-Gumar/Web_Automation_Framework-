
@MoneyWorries
Feature: Mortgages Money Worries
  I want to verify the component in Mortgages Help and support page
  
  Background: 
	Given I am on a Aldermore page
	Then  I navigate to Mortgages dropdown option
	
		
@MortgagesMoneyWorries
Scenario Outline: Verify the Mortagages Money Worries header
		Then  I see option "<MenuItem>"
		And   I clicked option
		Then  "<PageTitle>" Redirected page should be displayed

Examples:
     |MenuItem     | PageTitle 		                |
     |Money worries| Customers with money worries |
     
#@USPSection
#Scenario Outline: Verify the USP section present on the page 
#	Then I direct toward Money Worries page
#	And I see the "<UPSHeader>" header present on the page
#	
#	Examples: 
#	| UPSHeader 			        |  
#	| What we'll talk about   |
#	| Your finances			      |
#	| Getting back on track	  |
#	| Who else can help?      |
#	| What you need to know.	|


@ImageSection
Scenario Outline: Verify the Image section present on the page 
	Then I direct toward Money Worries page
	And I see the "<ImageSection>" header present on the page
	
	Examples: 
	| ImageSection		                          |  
	| Help us to understand the bigger picture  |
	| What we'll talk about		                  |

				
		
@Links
Scenario Outline: Verify the Links present on the page
 And I direct toward Money Worries page
 Then I see "<Links>" on the page under ImageSection 
 And I click on link and redirected on the "<PageTitle>"
 
 Examples:
 |Links|	PageTitle|
 |Complete our income and expenditure form|Income and expenditure form|
 