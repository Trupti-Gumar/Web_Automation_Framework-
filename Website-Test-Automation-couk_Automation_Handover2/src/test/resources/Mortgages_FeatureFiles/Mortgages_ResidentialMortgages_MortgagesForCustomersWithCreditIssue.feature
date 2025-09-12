
@Mortgages_for_customers_with_credit_issue

Feature: Mortgages for customers with credit issue
I want to verify the component in this page.

Background: 
    Given I am on Aldermore page
    When  I navigate to Mortgages dropdown options
    
@CustomerCreditPageTitle
Scenario Outline: Verify Mortgages for customers with credit issue header
Then  I should see "<MenuItem>" in the dropdown 
When   I click on the option
Then  I should be redirected to "<PageTitle>" page


Examples:
    |MenuItem                        | PageTitle				    				              |	
    |Customers with credit problems  | Mortgages for customers with credit problems|
	
	
@ImageSectionHeader
Scenario Outline: Verify headers on Image copy section
Then  I navigate to Mortgages for customers with credit issue page 	
Then  I should see the "<header>" on Image section in the page

Examples: 
	| header 		                   |
	| We take a different approach |
	
	
	
#@FAQHeader
#Scenario Outline: Verify Mortgages for customers with credit issues FAQs section links 
#Then I navigate to Mortgages for customers with credit issue page  	 
#And  I should see the Customer Credit mortgages FAQs header "<header>" on page
#And  I should see the more card header "<moreCardHeader>" on Customer Credit Issue section
#And  I should click on CTA button and should be redirected to "<pageTitle>" page
#
 #Examples:      
 #			| header            | moreCardHeader      							  | pageTitle    |
      #| Popular questions | Not found what you're looking for?  | Mortgage FAQs|  
      #
      
      
@CardHeader
Scenario Outline: Verify CardHeader present on the page 
Then I navigate to Mortgages for customers with credit issue page  	
And  I should see "<cardHeader>" present on the page 

Examples:
   |cardHeader                       | 
   |First time buyer mortgages       |
	 |Self-employed mortgages          |
	 |Buy to let mortgages             |
