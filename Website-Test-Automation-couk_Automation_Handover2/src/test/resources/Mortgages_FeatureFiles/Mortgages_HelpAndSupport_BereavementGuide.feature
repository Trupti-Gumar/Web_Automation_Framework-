@Bereavement_guide

Feature: Bereavement guide
I want to verify the components in this page.

Background:
Given I am on a Aldermore page
When  I navigate to Mortgages dropdown option

@BereavementGuide
Scenario Outline: Verify the Bereavement guide page 
Then "<options>" present in the dropdown 
And option clicked 
Then "<PageTitle>" will be displayed once redirected

Examples:
|options|PageTitle|
|Bereavement guide|Bereavement|


@PageHeader
Scenario Outline: Verify the header present on the page
Then I should naviagte to Bereavement guide page
And  headerlink "<header>" present on the page 

Examples: 
|header|
|What to do first|
|Terms you'll hear|
|Who else can help|
|How to contact us|


#@Links
#Scenario Outline: verify the link present in the page 
#Then I should naviagte to Bereavement guide page
#And I should click on the "<link>" present under the header and redirected to "<PageTitle>"
#
#Examples: 
#|link|PageTitle|
#|bereavement guide for personal savings customers.|What to do when someone dies|
