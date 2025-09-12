@PersonalSavingsFormsDocumentsCard
Feature: Important Personal Savings Forms and documents page
  I want to verify the compTwonts in this page.

  Background: 
    Given I am on a Aldermore home page
    When I navigate to Fixed Rate Savings Account page
    Then I shoud see Important personal savings forms and documents card
    When I click on this card
    Then it should redirect me to Personal savings forms and documents page

  @Masthead
  Scenario Outline: Verify the 'Important Personal Savings Forms and documents' header
    Then I should see the "<header>" as the header for the Important Personal Savings Forms and documents page
    And I should be able to click on back link and should be redirected to Personal savings help and support page

    Examples: 
      | header                                         |
      | Personal savings forms and documents |

  @DocumentTable
  Scenario: Verify the Document table on the page.
    Then I should see the documnet table on the page
    And I should be able to download any of the document from the table
    And I should be able to sort the table based on the columns
