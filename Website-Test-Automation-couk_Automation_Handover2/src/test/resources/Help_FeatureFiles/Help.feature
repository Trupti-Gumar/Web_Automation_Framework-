@Help
Feature: Help page
  I want to verify the components in this page
  
  Background: 
    Given I am on a Aldermore home page
    When I navigate to Help page

  Scenario Outline: Verify the Help page Header
    Then I should see the "<header>" as the header for the Help page

    Examples: 
      | header           |
      | Help and support |

   @Cards
   Scenario Outline: Verify the card present on the page.
    Then I should see this "<CardTitle>" card on the Help page
    

    Examples: 
      | CardTitle                      |
      | Personal savings help          |
      | Business savings help          |
      | Mortgages help                 |
      | Business finance help          |
      | Complaints                     |
      | Support tailored to you        | 
      | Bereavement					           |
      | Money worries   							 |

  @Cards
   Scenario Outline: Verify the cardlink redirect to the page.
    And I should be able to click on this "<CardTitle>" cardlink and redirected to the "<pageHeader>" page
    
    Examples: 
      | CardTitle                      | pageHeader                                      |
      | Personal savings help          | Help & Support for Personal Savings Customers   |
      | Business savings help          | Help & Support for Business Savings Customers   |
      | Mortgages help                 | Mortgages Help & Support                        |
      | Business finance help          | Business Finance Solutions                      |
      | Complaints                     | Our Complaint Process                           |
			| Support tailored to you        | Tailored Support - How We Can Help You          |
      | Bereavement					           | Bereavement Guide					                     |
      | Money worries                  | Money Worries and the Cost of Living Crisis     |
      
  @ImageCopy   
  Scenario Outline: Verify the Image copy section contents on the page
    Then I should see the "<imageCopyHeader>" as the header for the Image copy section

    Examples: 
      | imageCopyHeader                   |
      | Protecting yourself from fraud    |
      | Bank of England base rate changes |
      | Our purpose											  | 
      
      
  @ImageCopy      
  Scenario Outline: Verify the Image Copy section redirect to the page.
   And I should see "<imageCopyLink>" the image copy link on the page
   And I should be able to click on this "<imageCopyLink>" image copy link and redirected to the "<pageHeader>" page
    
    Examples: 
      | imageCopyLink                  										 | pageHeader                            |
      | Online security and protecting yourself from fraud | Online Security and Fraud Protection  |
     	| Find out more 																		 | Bank of England Base Rate Changes     |
 #			| Find out more 																		 | Our purpose  												 |

 @Masthead_Blackbox
  Scenario Outline: Verify the Masthead black box present on the page
    And I should see the "<header>" as the header for the Masthead black box on the Help page

    Examples: 
      | header       |
      | Get in touch |

  @Masthead_Blackbox_Links
  Scenario Outline: Verify the Masthead black box links present on the page
    And I should be able to click on the "<linkTitle>" link present on the Help page and redirected to the "<pageHeader>" page

    Examples: 
      | linkTitle                 | pageHeader                            	 |
      | Contact us							  | Contact Information - How to Contact Us  |