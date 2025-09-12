@Jargon_buster

Feature: Jargon buster
I want to verify the component in  this page

Background: 
	Given Aldermore home dispalyed 
	When  I navigate to Mortgages help and support page

@JargonBusterCard
Scenario Outline: Verify the Jargon buster header
	Then  "<cardName>" CTA button
	When  CTA button will be clicked
	Then  Naviagte to respective "<pageTitle>" page
   
   	  Examples:
		   | cardName               | pageTitle      		 |
	     | Mortgage jargon buster | Mortgage jargon buster|
		 
		 
@CTALink		 
Scenario Outline: Verify the "<CTALink>" present in a page 
 Then Naviagte to Mortgage jargon buster page 
 And  I will click on the "<CTALink>" 
 Then I will navigate to "<PageTitle>" page
 
 Examples:
 |CTALink             |PageTitle  |
 |Browse our mortgages|Mortgages  |