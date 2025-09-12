@Help_PersonalSavingsHelp
Feature: Help_Personal Savings Help Page
  I want to verify the components in this page
  
  Background: 
    Given I am on Aldermore home page
    When I navigate to the Help page
    And I navigate to Personal Savings Help page

  Scenario Outline: Verify the Help page Header
    Then I should see the "<header>" as the header for the Personal Savings Help page

    Examples: 
      | header           									|
      | Personal savings help and support |
      
   
   @Frequently_asked_questions
   
   Scenario Outline: Verify the Frequently asked questions present on the page.
    Then I should see this "<QuestionTitle>" Frequent Question on the Personal Savings Help page
    And I should be able to click on this "<QuestionTitle>" Frequent Question link and redirected to the "<pageHeader>" page
      
    Examples: 
      | QuestionTitle                           									| pageHeader 																									|
      | Will my savings be covered by the FSCS? 									| Financial Services Compensation Scheme  										|
      | How do I pay money into my account?        								| What sort code and account reference will I need to deposit?|
      | How do I log in?                													| How do I log in to my online account? - Internet Banking		|
      | How do I withdraw money from my account?         					| Withdrawing Money - Personal Savings FAQs 									|
      | What happens at maturity of my Fixed Rate Account?        | What happens at maturity of my fixed rate account?					|
      | What does the base rate change mean for my interest rate? | Bank of England Base Rate Changes 													|
      | What is a personal savings allowance?				           		| ISA: What is the personal savings allowance?								|
      

   @Cards
   Scenario Outline: Verify the card present on the page.
    Then I should see this "<CardTitle>" card on the Personal Savings Help page
    And I should be able to click on this "<CardTitle>" cardlink and redirected to the respective "<pageHeader>" page
    
    Examples: 
      | CardTitle                      						| pageHeader                                    |
      | Safer savings          										| Safer Savings - How We Protect You   					|
      | Opening an account and paying money in 		| Account Opening and Depositing Funds FAQs     |
      | Using online banking                 			| Internet Banking - Personal Savings FAQs      |
      | Statements and balances         					| Statements & Balances - Personal Savings FAQs |
      | Account maturities and transfers          | Account maturities and transfers FAQs         |
			| Withdrawing money and closing your account| Withdrawing Money - Personal Savings FAQs     |
      | ISA help					           							| ISA help - Personal Savings FAQs					    |
      
      
  @ImageCopy   
  Scenario Outline: Verify the Image copy section contents on the page
    Then I should see the "<imageCopyHeader>" as the header for the Image copy section on Personal Savings Help page

    Examples: 
      | imageCopyHeader              |
      | FSCS Protection   					 |
      | What to do when someone dies |
      
      
  @ImageCopy      
  Scenario Outline: Verify the Image Copy section redirect to the page.
   And I should see "<imageCopyLink>" the image copy link on the Personal Savings Help page
   And I should be able to click on this "<imageCopyLink>" image copy link and redirected to the "<pageHeader>" respective page
    
    Examples: 
      | imageCopyLink                  	  	 | pageHeader                               |
      | Find out more about FSCS Protection  | Financial Services Compensation Scheme   |
    	| Bereavement guide										 | Bereavement Guide - Personal Savings     |
    	
  @Contact_Cards
   Scenario Outline: Verify the contact card present on the Personal Savings Help page.
    Then I should see this "<ContactCardTitle>" contact card on the Personal Savings Help page  	
    
     Examples: 
      | ContactCardTitle    |
      | Call us   					|
      | Email us  					|
    	| Message us          |
      | Opening hours   	  |
      | Contact us by post  |
    	

 @Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on the Personal Savings Help page

    Examples: 
      | header       |
      | Useful links |

  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Personal Savings Help page and redirected to the respective "<pageHeader>" page

    Examples: 
      | linkTitle                 						| pageHeader                            |
      | Forms and documents							  		| Forms & Documents - Personal Savings  |
      | Bereavement guide						  				| Bereavement Guide - Personal Savings  |
      | Financial Services Compensation Scheme| Financial Services Compensation Scheme|
      
      
      
      
      
      
      
      