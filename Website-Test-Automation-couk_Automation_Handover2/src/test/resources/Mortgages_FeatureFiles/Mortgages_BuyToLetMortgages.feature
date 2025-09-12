
@Buy_to_let_mortgages

Feature: Buy to let mortgages
I want to verify the components in this page.

Background: 
Given I am on the Aldermore page
When  I see Mortgages dropdown option

@BuyToLetOption
Scenario Outline: Verify Buy to let mortgages page 
Then  I see "<headerlink>" as options  
When  I should click the link
Then  I should redirected to the "<pageTitle>"

Examples: 
	| headerlink 	   	     | pageTitle		 	      |
	| Buy to let mortgages | Buy to let mortgages |
		
@USPHeader		
Scenario Outline: Verify the Unique selling point present on the page 
Then I navigate to Buy to let mortgagess page 
Then I should see the "<UPSHeader>" as the USP sub header 
	
Examples:  
	| UPSHeader 				                          |  
	| Buy to let mortgages for limited companies  |
	| Multiple properties on one application      |
	| Looking to grow your buy to let portfolio   |
	| First time & accidental landlords           |
		
@ImageSection		
Scenario Outline: Verify Buy to let mortgages Image copy section
Then I navigate to Buy to let mortgagess page 
Then I should see "<Header>" as Image copy header

Examples: 
	|Header                                        |
	|We're backing buy to let landlords            |
	|Multiple properties on one application        |

 @Masthead_BlackBox
 Scenario Outline: Verify the Masthead Black box contents on Mortgage page
 Then I navigate to Buy to let mortgagess page 
 Then I should see "<header>" for Masthead Black box on Buy to Let Mortages page

  Examples: 
   | header                    |
   | Contact us to get started | 
      
		   
 #@BlackBox_Option1
 #Scenario Outline: Verify the first option present in BlackBox option
  #Then I navigate to Buy to let mortgagess page 
  #Then I should see first "<option>" in the BlackBox Section 
  #And  I should click that option and should be redirected to "<PageTitle>"
 #
 #Examples: 
 #| option                               | PageTitle 					 |
 #| Limited company buy to let mortgages | Buy to let mortgages for limited companies |
 #
 #
  #@BlackBox_Option2
 #Scenario Outline: Verify the first option present in BlackBox option
  #Then I navigate to Buy to let mortgagess page 
  #Then I should see second "<option>" in the BlackBox Section 
  #And  I should clicked to the option and should be redirected to "<PageTitle>"
 #
 #Examples: 
 #| option           | PageTitle 								 |
 #| Customer support | Mortgages help and support |
 #
 #
 #@BlackBox_Option3
 #Scenario Outline: Verify the first option present in BlackBox option
  #Then I navigate to Buy to let mortgagess page 
  #Then I should see third "<option>" in the BlackBox Section 
  #And  I clicked to the option and should be redirected to page
 #
 #Examples: 
 #| option            | 
 #| Request a callback| 
 #
 

@CardHeaders
Scenario Outline: Verify the "<CardHeader>" present in the page  
Then  I navigate to Buy to let mortgagess page 
Then  I should see "<CardHeader>" CTA button on the page

Examples: 
     |CardHeader                                                            |
     |Buy to let mortgages for limited companies                            |
     |Mortgages help and support          		                              |
     |Residential mortgages                                                 |
     |10 tips for first time buy to let landlords                           |
     |Top tips for expanding your buy to let portfolio                      |
     |Looking to make a buy to let investment? Check out Manchester…        |
     |Understanding complex buy to let mortgages: 5 things you need to know |
     
   
#@FAQHeader
#Scenario Outline: Verify Buy To Let Mortgages FAQs section links 
#Then I navigate to Buy to let mortgagess page  
#And  I should see the Buy to let mortgagess FAQs header "<header>" on page
#And  I should see the more card header "<moreCardHeader>" on Buy to let mortgagess page
#And  I clicked on FAQs CTA button and should be redirected to "<pageTitle>" page
#
 #Examples:      
 #			| header             			 | moreCardHeader      							  | pageTitle 							  |
      #| Buy to let mortgage FAQs | Not found what you are looking for?  | Mortgage FAQs|                                                                                     
     
     
@FAQHeader
Scenario Outline: Verify Buy To Let Mortgages FAQs section links     
 Then I navigate to Buy to let mortgagess page  
 And  I should see the Buy to let mortgagess FAQs header "<header>" on page		   
 		   
Examples:      
 			| header             			 |
      | Buy to let mortgage FAQs | 		   