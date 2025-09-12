
@HelpandSupport
Feature: Help and Support
  I want to verify the component in Help and support page

Background: 
	Given I am on a Aldermore page
	Then  I see Mortgages dropdown option
	
@HelpAndSupport
 Scenario Outline: Verify the Help and Support header
		Then  I see "<MenuItem>" as an option
		And   I click the option
		Then  I redirected "<PageTitle>" page

Examples:
     |MenuItem        | PageTitle 			 |
     |Help and support| Help and support |

@CardHeader
Scenario Outline: Verify the "<cardName>" Card present on the page
    Then I navigate to Help page
    And I see the "<cardName>" Cards on the page

    Examples: 
      | cardName                  |
      | Personal savings help     |
      | Business savings help     |
      | Mortgages help            |
      | Business finance help     |
      | Complaints								|

@CardPageTitle
Scenario Outline: Verify the "<cardName>" Card present on the page
    Then I navigate to Help page
    And  I clicked on card and redirected to "<PageTitle>"

    Examples: 
      | PageTitle                         |
      | Personal savings help and support |

      
@ImageSection
  Scenario Outline: Verify the Image copy section contents on the page
    Then I navigate to Help page
    And I should see the "<header>" as the header for the Image copy secion

    Examples: 
      | header                            |
      | Protecting yourself from fraud    |
      | Bank of England base rate changes |

@BlackBox
  Scenario Outline: Verify the BlackBox Contents on the page
    Then I navigate to Help page
    And I clicked on the blackbox "<options>" and navigate to the "<pageTitle>"

    Examples: 
      |options     | pageTitle  |
      |Get in touch| Contact us |
