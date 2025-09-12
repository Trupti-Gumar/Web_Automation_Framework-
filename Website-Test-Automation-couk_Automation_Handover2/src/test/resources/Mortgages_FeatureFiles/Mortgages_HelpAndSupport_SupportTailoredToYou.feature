@Mortgages_HelpAndSupport_SupportTailoredToYou

Feature: Support Tailored To You
I want to verify the Component on the page 

Background: 
Given I am on a Aldermore page
When  I navigate to Mortgages dropdown option
Then  I navigate to Help page

@SupportTailoredToYou
Scenario Outline: Verify Support Tailored To You Page component
Then I see "<Card>" present on page
And I clicked on the card 
Then I redirected to the Card "<PageTitle>"

Examples: 
|Card                   |PageTitle|
|Support tailored to you|Support tailored to you|

@ImageSection
Scenario Outline: Verify the Image Section Present on the Page 
Then I navigate to the Support Tailored To You Page
And  "<ImageSection>" header should be present on the page 

Examples: 
|ImageSection|
|How we can support you|
|Customers with money worries|
|Bereavement|



@ImageSectionLink
Scenario Outline: Verify the link present on the Image Section 
Then I navigate to the Support Tailored To You Page
And "<Links>" present on the Image Section and redirected to "<PageTitle>"

Examples: 
|Links                                            |PageTitle|
|Get in touch                                     |Contact us|
|Support for mortgage customers with money worries      |404 - page not found|
|Support for asset finance customers with money worries|404 - page not found|
|Bereavement guide|Bereavement|




