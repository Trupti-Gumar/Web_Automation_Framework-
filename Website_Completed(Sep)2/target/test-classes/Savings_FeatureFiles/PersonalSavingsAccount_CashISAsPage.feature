#Masthead medium
#USP
#Image Copy
#Image Copy
#1 year fixed rate ISA
#2 year fixed rate ISA
#3 year fixed rate ISA
#30 Days ISA
#Image copy Section
#FAQ
@PSCash_ISAs
Feature: Cash ISAs
  I want to verify the components in this page.

  Background: 
    Given I am on a Aldermore home page
    When I navigate to Cash ISAs page

  @Masthead_Medium
  Scenario Outline: Verify the Cash ISAs header
    Then I should see the "<header>" as the header for the Cash ISAs page

    Examples: 
      | header    |
      | Cash ISAs |

  @USP_Section
  Scenario: Verify the USP section present on the Cash ISAs page
    Then I should see the USP section on the page

  @Image_Copy_Section
  Scenario Outline: Verify the Image copy section present on the Cash ISAs
    Then I should see the "<header>" as the header for the "<headerNum>"  image copy section on the Cash ISAs page

    Examples: 
      | header                         | headerNum |
      | What is a Cash ISA?            | First     |
      | Looking to open multiple ISAs? | Second    |
      | ISA Transfers                  | Third     |

  Scenario Outline: Verify the Image copy section link
    Then I should be able to click on ISA Transfers  Image copy CTA button and should be redirected to "<pageTitle>" page

    Examples: 
      | pageTitle                                           |
      | Can I transfer some or all of my existing cash ISA? |

  @CashISAFAQs
  Scenario Outline: Verify Cash ISA FAQs present on Double access savings account page
    Then I should see the Cash ISA FAQs header "<header>"  on Cash ISA page
    And I should see the Accordians on the Cash ISA FAQs section
    And I should see the more card header "<moreCardHeader>" on Cash ISA FAQs section
    And I should be able to click on More Card Help and Support CTA button should be redirected to "<pageTitle>" page

    Examples: 
      | header        | moreCardHeader                         | pageTitle                                     |
      | Cash ISA FAQs | Haven't found what you're looking for? | Help & Support for Personal Savings Customers |
  #@OneYearFixedRateISA
  #Scenario Outline: Verify the values present on the 1 year fixed rate cash ISA product card
    #Then I should see the 1 year fixed rate cash ISA Product Card
    #When I check the "<content>" on the 1 year fixed rate cash ISA card
    #Then I should see the "<content>" value as "<value>" on the 1 year fixed rate cash ISA card page
#
    #Examples: 
      #| content                 | value          |
      #| Interest rate(*AER)     | 4.00 % Fixed   |
      #| Minimum opening balance | 1,000 - 20,000 |
      #| Term                    | 1 year         |
#
  #@TwoYearFixedRateISA
  #Scenario Outline: Verify the values present on the 2 year fixed rate cash ISA product card
    #Then I should see the 2 year fixed rate cash ISA Product Card
    #When I check the "<content>" on the 2 year fixed rate cash ISA card
    #Then I should see the "<content>" value as "<value>" on the 2 year fixed rate cash ISA card page
#
    #Examples: 
      #| content                 | value          |
      #| Interest rate(*AER)     | 4.05 % Fixed   |
      #| Minimum opening balance | 1,000 - 20,000 |
      #| Term                    | 2 years        |
#
  #@ThreeYearFixedRateISA
  #Scenario Outline: Verify the values present on the 3 year fixed rate cash ISA product card
    #Then I should see the 3 year fixed rate cash ISA Product Card
    #When I check the "<content>" on the 3 year fixed rate cash ISA card
    #Then I should see the "<content>" value as "<value>" on the 3 year fixed rate cash ISA card page
#
    #Examples: 
      #| content                 | value          |
      #| Interest rate(*AER)     | 4.15 % Fixed   |
      #| Minimum opening balance | 1,000 - 20,000 |
      #| Term                    | 3 years        |
#
  #@ThirtyDayNoticeCashISA
  #Scenario Outline: Verify the values present on the 30 day notice cash ISA product card
    #Then I should see the 30 day notice cash ISA Product Card
    #When I check the "<content>" on the 30 day notice cash ISA card
    #Then I should see the "<content>" value as "<value>" on the 30 day notice cash ISA card page
#
    #Examples: 
      #| content                 | value           |
      #| Interest rate(*AER)     | 3.20 % Variable |
      #| Minimum opening balance | 1,000 - 20,000  |
      #| Term                    | 30 days' notice |
