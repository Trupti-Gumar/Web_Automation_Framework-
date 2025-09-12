@Contactus
Feature: Contact us page
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I click on Intermediaries link
    Then I should navigate to Internediaries home page
    And I click on the Mortgages dropdown
    And I click on Contactus link
    Then I should navigate to Contactus page

  @Masthead
  Scenario Outline: Verify the Contact us page header
    And I should see the "<header>" as the header for the Contactus page

    Examples: 
      | header                 					      						 |
      | Contact us - residential and buy to let mortgages	 |

 
  @Headers
   Scenario Outline: Verify the headers present on the page.
    And I should see this "<HeaderText>" headers on the Contactus page
    
    Examples: 
     | HeaderText                      			  				|
     | New and existing case enquiries   					  	|
     | Find your Relationship Manager - new enquiries	|
     | Other contact information	 										|
     
  