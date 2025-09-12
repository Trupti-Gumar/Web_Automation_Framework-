

@MortgagesHelpandSupport
Feature: Mortgages Help and Support
  I want to verify the component in Mortgages Help and support page

Background: 
	Given I am on a Aldermore page
	Then  I navigate to Mortgages dropdown option
	
@MortgagesHelpAndSupport
Scenario Outline: Verify the Mortagages Help and Support header
		Then  I see as an option "<MenuItem>"
		And   I clicked
		Then  Redirected "<PageTitle>" page should be displayed

Examples:
     |MenuItem                  | PageTitle 			 					 |
     |Mortgages help and support| Mortgages help and support |
     
     
@CardHeader
Scenario Outline: Verify the CardHeader Present on the page 
    Then I navigate to Mortgages help and support page 
    And  I see "<CardHeader>" present on the page 
    
Examples:
     |CardHeader           										     |
     |Payments																		 |
     |Fees, statements and balances								 |   
     |Managing your mortgage                       |
     |Borrowing more                               |
     |Switching your mortgage							         |
     |Mortgage jargon buster                       |
     |Applying for a mortgage											 |
     |Mortgages contact information								 |
  
 #@Links
  #Scenario Outline: verify the Links present on the page
   #Then I navigate to Mortgages help and support page 
   #And  I see the "<links>" present on the page 
   #
   #Examples: 
    #|links| 
#	  |What's a decision in principle?    																		| 
#		|What's the difference between a fixed rate and variable rate mortgage?	|
#		|What's the difference between an interest only and repayment mortgage?	|
#		|Do you offer buy to let mortgages?																			|
#		|Fees, statements and balances																					|
#		|Can I pay off my mortgage in full?																			|
#		|Can I remove a name from my mortgage?																	|
#		|I've changed my name. Can I update my mortgage account?								|
		
		
@ImageSection
Scenario Outline: Verify the Header on ImageSection 
 Then I navigate to Mortgages help and support page 
 And  I should see the "<ImageSection>"	header present on the page
 
 Examples:
 |ImageSection|
 |Mortgage customers with money worries|
		
		
#@CTACardHeader
#Scenario Outline: Verify the CTA link present on Card Header 
 #Then I navigate to Mortgages help and support page
 #And I clicked on CTA button present on Card Header and redirected to "<PageTitle>" 
 #
 #Examples:
 #|PageTitle              |
 #|Your mortgage payments |
 
 @CTAImageSection
 Scenario Outline: Verify the CTA button present on Image section 
 Then I navigate to Mortgages help and support page
 And  I click on "<CTAButton>" present on the Image Section
 Then I should redirected to next "<page>"

Examples:
|CTAButton               |page                        |
|Find out how we can help|Customers with money worries|

		
		
		
		
		
		