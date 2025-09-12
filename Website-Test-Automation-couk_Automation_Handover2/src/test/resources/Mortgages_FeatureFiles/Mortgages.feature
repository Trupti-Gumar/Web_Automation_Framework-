@Mortgages
Feature: Mortgages
I want to verify the components in this page.


 Background: 
    Given I am on the Aldermore page
    When  I navigate to Mortgages dropdown option
    
@MastHead-Small
Scenario Outline: Verify mortgages page 
Then  I should see the "<headerlink>" as optionss  
When  I click on the link
Then  I should be redirected to "<PageTitle>"

Examples:
    |headerlink       | PageTitle |
    |Mortgages home   | Mortgages |
    
 @USPSection
 Scenario: Verify the USP section present on the Mortgage Page 
 Then I should be navigated to Mortgage Page
 Then I should see the USP section on Mortgage page
    
    
 @Masthead_BlackBox
 Scenario Outline: Verify the Masthead Black box contents on Mortgage page
 Then I should be navigated to Mortgage Page
 Then I should see the "<header>" for Masthead Black box on mortgage page

    Examples: 
      | header      |
      | Quick links | 
      
      
#####chnages in card header value##############           
@CardHeaders
Scenario Outline: Verify the "<CardHeader>" present in the page  
Then  I should be navigated to Mortgage Page 
Then  I should see the "<CardHeader>" CTA button present in the page

Examples: 
     |CardHeader                       						|
     |Mortgages for customers with credit issues  |
     |Self-employed mortgages          						|
     |First time buyer mortgages       						|
	   |Commercial mortgages             						|
	   |Buy to let mortgages for limited companies 	|
	   |Buy to let mortgages                        |
	   |Why use a mortgage broker? Here’s 10 great reasons|
	   |Divorce and mortgages – What you need to know|
	   	   
@Mortgages_for_customers_with_credit_issues_card
Scenario Outline: Verif the "<pagetitle>" for the card header 
Then  I should be navigated to Mortgage Page 
Then  I should click customers with credit issues card and should be redirected to "<PageTitle>"

Examples:
  |PageTitle                                                  | 
  |Mortgages for customers with credit problems - Aldermore Bank|
  
  
@Self-employed_mortgages
Scenario Outline: Verif the "<pagetitle>" for the card header 
Then  I should be navigated to Mortgage Page 
Then  I should click Self-employed mortgages and should be redirected to "<PageTitle>"

Examples:
  |PageTitle                                        | 
  |Mortgages for the Self-Employed - Aldermore Bank | 
 
 
@First_time_buyer_mortgages
Scenario Outline: Verif the "<pagetitle>" for the card header 
Then  I should be navigated to Mortgage Page 
Then  I should click First time buyer mortgages and should be redirected to "<PageTitle>"

Examples:
  |PageTitle               			                    | 
  |Mortgages for First Time Buyers - Aldermore Bank | 
  
 
@Commercial_mortgages 
Scenario Outline: Verif the "<pagetitle>" for the card header 
Then  I should be navigated to Mortgage Page 
Then  I should click Commercial mortgages and should be redirected to "<PageTitle>"

Examples:
  |PageTitle              								| 
  |Commercial Mortgages - Aldermore Bank  | 
   
   
#@Mortgages_FAQs  
#Scenario Outline: Verif the "<pagetitle>" for the card header 
#Then  I should be navigated to Mortgage Page 
#Then  I should click Mortgages FAQs and should be redirected to "<PageTitle>"
#
#Examples:
  #|PageTitle         | 
  #|Mortgages FAQs    | 
 
#@Mortgage_guides 
#Scenario Outline: Verif the "<pagetitle>" for the card header 
#Then  I should be navigated to Mortgage Page 
#Then  I should click Mortgage guides and should be redirected to "<PageTitle>"
#
#Examples:
  #|PageTitle         | 
  #|Mortgage guides   | 
 
@Buy_to_let_for_limited_companies  
Scenario Outline: Verif the "<pagetitle>" for the card header 
Then  I should be navigated to Mortgage Page 
Then  I should click Buy to let for limited companies card and should be redirected to "<PageTitle>"

Examples:
  |PageTitle                           												| 
  |Buy to Let Mortgages for Limited Companies - Aldermore Bank| 
  
 @Image_section 
 Scenario Outline: Verify the Image Section "<header>" 
 Then I should be navigated to Mortgage Page 
 Then I should see the "<header>" in the Image Section
 
 Examples: 
 | header                |
 | Why choose Aldermore? |
 
 
 @why_use_a_mortgage_broker
Scenario Outline: Verif the "<pagetitle>" for the card header 
Then  I should be navigated to Mortgage Page 
Then  I should click Buy to let for limited companies card and should be redirected to "<PageTitle>"

Examples:
  |PageTitle                           												| 
  |Buy to Let Mortgages for Limited Companies - Aldermore Bank| 
 
 @BlackBox_Option1
 Scenario Outline: Verify the first option present in BlackBox option
  Then I should be navigated to Mortgage Page
  Then I should see the first "<option>" in the BlackBox Section 
  And  I should able to click that option and should be redirected to "<PageTitle>"
 
 Examples: 
 | option               | PageTitle 					 |
 | Buy to let mortgages | Buy to let mortgages |
 
 
 @BlackBox_Option2
 Scenario Outline: Verify the first option present in BlackBox option
  Then I should be navigated to Mortgage Page
  Then I should see the second "<option>" in the BlackBox Section 
  And  I should be able to click the option and should be redirected to "<PageTitle>"
 
 Examples: 
 | option                | PageTitle 						 |
 | Residential mortgages | Residential mortgages |
 
#####newly added option############ 
 @BlackBox_Option3
 Scenario Outline: Verify the first option present in BlackBox option
  Then I should be navigated to Mortgage Page
  Then I should see the third "<option>" in the BlackBox Section 
  And  I should click to the option and should be redirected to "<PageTitle>"
 
 Examples: 
 | option           | PageTitle 			           |
 | Help and support | Mortgages help and support |