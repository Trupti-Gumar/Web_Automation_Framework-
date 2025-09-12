@Intermediaries
Feature: Intermediaries
I want to verify the component in  this page 

Background: 
Given On Aldermore page
Then  I navigate to ContactUs page under Help and Support option

@IntermediariesTitle
Scenario Outline: Verify the Intermediaries header
	Then  "<cardName>" CTA button
	When  Clicked button
	Then  respective "<pageTitle>" displayed
   
   	  Examples:
		   | cardName  	      | pageTitle                              |
	     | Intermediaries | Contact information for intermediaries |
	     
	     
@IntermediariesCardName
Scenario Outline: Verify the Cards header in Intermediaries Page
	Then I navigate to Intermediaries Page
	Then I "<CardHeader>" on the page
	
Examples:
|CardHeader|	
|Residential and Buy to Let mortgages|
|Invoice finance|
|Asset finance|
|Commercial mortgages|
|Property development finance|


@IntermediariesCardPageTitle
Scenario Outline: Verify the PageTitle for the Card 
	Then I navigate to Intermediaries Page
	When I will click "<CardsName>" and redirected to "<PageTitle>"
	
Examples: 
|Cards       |CardsName                           |PageTitle|
|First Card  |Residential and Buy to Let mortgages|Contact us - residential and buy to let mortgages|
|Second Card |Invoice finance                     |Contact us - Invoice Finance|
|Third Card  |Asset finance                       |Contact us - Asset Finance|
|Fourth Card |Commercial mortgages                |Contact us - Commercial Mortgages|
|Fifth Card  |Property development finance        |Contact us - Property Development Finance|