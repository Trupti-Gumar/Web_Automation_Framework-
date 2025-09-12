@Residentialmortgages 

Feature: Residential mortgages
I want to verify the menu in this page.

 Background: 
    Given I am on the Aldermore page
    When  I navigate to Mortgages dropdown option

@Masthead-small
Scenario Outline: Verify Residential mortgages header
Then  I should see "<MenuItem>" as a Link
And   I click on the MenuItem link 
Then  I should be redirected to the "<PageTitle>" page

Examples:
     |MenuItem             | PageTitle 			       |
     |Residential mortgages| Residential mortgages |
	 

@CardHeaders 
Scenario Outline: Verify the "<CardHeader>" present in the page 
Then  I navigate to Residential mortgages page  
Then  I should see the "<CardHeader>" CTA button on Residential mortgages page

Examples: 
     |CardHeader                                 					  |
     |Mortgages for customers with credit issues          	|
     |Self-employed mortgages                     					|
     |First time buyer mortgages                  					|
     |Why use a mortgage broker? Here’s 10 great reasons    |
     |Divorce and mortgages – What you need to know         |

	 
@CardHeaderPageTitle	 
Scenario Outline: Verify CTA Link present on "<CardHeader>"  
Then I navigate to Residential mortgages page    
And  I should see the "<CardHeader>" CTA button on Residential mortgages page
And  I should click on CTA button and I should be redirected to "<PageTitle>"

Examples: 
     |CardHeader                                          | PageTitle 												         	          |
     |Mortgages for customers with credit issues          | Mortgages for customers with credit issues            |
     |Self-employed mortgages                             | Self-employed mortgages                               |
     |First time buyer mortgages                          | First time buyer mortgages                            |
     |Why use a mortgage broker? Here’s 10 great reasons  | 10 Reasons to Use a Mortgage Broker - Expert Insights |
     |Divorce and mortgages – What you need to know       | How Divorce Affects Mortgage: What You Need to Know   |

@ImageSection
Scenario Outline: Verify headers on Image copy section	
Then  I navigate to Residential mortgages page 
Then  I should see the "<header>" on the Image section 

Examples: 
	| header 				   						  |
	| We take a different approach  |

#@FAQHeader
#Scenario Outline: Verify Residential mortgages FAQs section links 
#Then I navigate to Residential mortgages page 
#And  I should see the Residential mortgages FAQs header "<header>" on page
#And  I should see the more card header "<moreCardHeader>" on FAQs section
#And  I should be able to click on FAQs CTA button and should be redirected to "<pageTitle>" page
#
 #Examples:      
 #			| header             				| moreCardHeader      							  | pageTitle 							  |
      #| Residential mortgage FAQs | Not found what you're looking for?  | Mortgages help and support|                                                                                     



 @Masthead_BlackBox
 Scenario Outline: Verify the Masthead Black box contents on Mortgage residential page
 Then I navigate to Residential mortgages page
 And  I should see the "<header>" for Masthead Black box on residential mortgage page

 Examples: 
      | header      |
      | Quick links | 

@BlackBox_Options1
Scenario Outline: Verify the options1 on Masthead Blackbox on Mortgage residential page
Then I navigate to Residential mortgages page 
And  I should see the "<options>" present on masthead Blackbox
And  I should click on options present on masthead blackbox and should be redirected to "<PageTitle>"

Examples: 
  |options          | PageTitle                     | 
  |Customer support | Mortgages help and support    |


@BlackBox_Options2
Scenario Outline: Verify the options2 on Masthead Blackbox on Mortgage residential page
Then I navigate to Residential mortgages page 
And  I should see "<options>" present on masthead Blackbox
And  I should click on masthead option and should be redirected to "<PageTitle>"

Examples: 
  |options      | PageTitle     | 
  |Mortgage FAQs| Mortgage FAQs |



#@BlackBox_Options3
#Scenario Outline: Verify the options3 on Masthead Blackbox on Mortgage residential page
#Then I navigate to Residential mortgages page 
#And  I should see "<options>" present on the masthead Blackbox
#And  I should click on the masthead option and should be redirected to "<PageTitle>"
#
#Examples: 
  #|options       | PageTitle                     | 
  #|Visit our blog| Fulfil your hopes and dreams. |

  
@BlackBox_Options3
Scenario Outline: Verify the options3 on Masthead Blackbox on Mortgage residential page
Then I navigate to Residential mortgages page 
And  I should see "<options>" present on masthead Blackbox
And  I should click on masthead option and should be redirected to "<PageTitle>"

Examples: 
  |options             | PageTitle            | 
  |Buy to let mortgages| Buy to let mortgages |