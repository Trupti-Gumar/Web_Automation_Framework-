@Self-employed_mortgages

Feature: Self-employed mortgages
I want to verify the component in this page.

Background: 
Given I am on Aldermore page
When  I navigate to Mortgage dropdown option  

@SelfEmployedmortgages
Scenario Outline: Verify Self-employed mortgages header
Then  I should see "<MenuItem>" in dropdown
And   I click on the dropdown option. 
Then  I should be redirected to the option "<PageTitle>"

Examples:
    | MenuItem                | PageTitle			  |
    | Self-employed mortgages | Self-employed mortgages |


@ImageSection
Scenario Outline: Verify headers on Image copy section
And   I navigate to Self-employed mortgages page 	
Then  I should see "<header>" on the Image section 

Examples: 
	| header 	      								|
	| We take a different approach  |

	
#@FAQsHeader
#Scenario Outline: Verify Self-employed mortgages section links 
#Then I navigate to Self-employed mortgages page 
#And  I should see the Self-employed mortgages FAQs "<header>" on page
#And  I should see the more card header "<moreCardHeader>" on Self-Employed page section
#And  I should click on CTA button and should redirected to "<pageTitle>" page
#
 #Examples:      
 #			| header            | moreCardHeader      							  | pageTitle    |
      #| Popular questions | Not found what you're looking for?  | Mortgage FAQs|  
	

@CardHeader
Scenario Outline: Verify CardHeader present on the page 
Then I navigate to Self-employed mortgages page	
And  I should see "<cardHeader>" present on page 

Examples:
   |cardHeader| 
   |First time buyer mortgages|
	 |Buy to let mortgages |
	 |Mortgages for customers with credit problems|
	 |Self-employed? Here's 6 top tips to help you get a mortgage|
	 |Why use a mortgage broker? Here’s 10 great reasons|
	