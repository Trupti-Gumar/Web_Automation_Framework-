#masthead
#masthead-black-box
#cards
#ImageSection
#This card is not available on the page
#@Bad_Debt_Protection
#Feature: Bad Debt Protection
  #I want to verify the components present in the cards page
#
  #Background: 
    #Given I am landed on Aldermore page
    #When I click on the Business finance dropdown option
    #Then I should see the Business finance options
    #When I click on the Invoice Finance option
    #Then I should be naviagated to Invoice Finance page
    #And I should see Bad Debt Protection card on the page
    #When I click on Bad Debt Protection card CTA button
    #Then I should redirected to Bad Debt Protection page
#
  #@MastheadMedium
  #Scenario Outline: Verify the Bad Debt Protection header
    #And I should see "<header>" on Bad Debt Protection page header
#
    #Examples: 
      #| header              |
      #| Bad Debt Protectio |
#
  #@MastheadBlackBox
  #Scenario Outline: Verify Masthead black box contents
    #And I should see "<header>" as header for the Masthead black box
    #And I should see contact number on the Masthead black box
    #And I should see Request a call back on the Masthead black box
    #And I should see Email us on the Masthead black box
#
    #Examples: 
      #| header            |
      #| Let's get started |
#
  #@Video_Block
  #Scenario Outline: Verify the Video block present on Bad Debt Protection page
    #And I should see the "<header>" as Video block header on Bad Debt Protection page
#
    #Examples: 
      #| header                       |
      #| What is Bad Debt Protection? |
#
  #@ImageCopySection
  #Scenario Outline: Verify the different label present Image Copy Sections
    #When I click on "<quickLink>" option on Bad Debt Protection page
    #Then I should see the "<title>" as a header for Image copy Section on Bad Debt Protection page
#
    #Examples: 
      #| title                                         | quickLink        |
      #| How Bad Debt Protection works                 | How does it work |
      #| Is Bad Debt Protection right for my business? | Who can we help? |
#
  #@USP
  #Scenario Outline: Verify the Unique Selling Points present on Bad Debt Protection page
    #And I should see the "<USPHeader>" as USP sub header on Bad Debt Protection page
#
    #Examples: 
      #| USPHeader                |
      #| Flexible and transparent |
      #| Day to day support       |
      #| Part of your team        |
#
  #@Blog_Quote
  #Scenario: Verify the Blog Quote present on Bad Debt Protection page
    #And I should see Blog Quote on Bad Debt Protection page
#
  #@DocumentCards
  #Scenario Outline: Verify the different label present Documents option
    #When I click on Documents option on Bad Debt Protection page
    #Then I should see the "<title>" Cards under Documents option on Bad Debt Protection page
#
    #Examples: 
      #| title                             |
      #| Bad Debt Protection Product Sheet |
#
  #@YellowBanner
  #Scenario Outline: Verify the yellow banner present on the page
    #And I should see "<CTAbutton>" CTA banner on the Bad Debt Protection page
    #And I should able to click on the yellow CTA banner abd redirected to "<pageTitle>" page
#
    #Examples: 
      #| CTAbutton          | pageTitle                                          |
      #| Request a callback | Contact information for business finance customers |
