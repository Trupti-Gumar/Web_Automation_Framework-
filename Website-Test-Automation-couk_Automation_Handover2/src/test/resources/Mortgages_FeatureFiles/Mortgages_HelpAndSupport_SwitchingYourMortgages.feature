
@Mortgages_HelpAndSupport_SwitchingYourMortgages
Feature: Switching Your Mortgages
I want to verify the component in  this page

Background:
	Given Aldermore home dispalyed 
	When  I navigate to Mortgages help and support page

  @SwitchingYourMortgagesCardName
  Scenario Outline: Verify the Component for the page 
  Then  "<cardName>" CTA is visible
	When  clicked CTA button
	Then  "<pageTitle>" will be visible 
  
  Examples: 
  |cardName               |pageTitle               |
  |Switching your mortgage|Switching your mortgage |
  
  @SwitchingYourMortgagesSubheader
  Scenario Outline: Verify the SubHeader present on the page 
  Then I naviagte to Switching your mortgage page
  And I can see "<Subheader>" on the page
  
  Examples:
  |Subheader|
  |Ready to switch?|
  |Fee free|
  |Hassle free|
  |Dedicated support|
  |Switch early|
  
  @SwitchingYourMortgagesImageSection
  Scenario Outline: Verify the Image Section On the page 
  Then I naviagte to Switching your mortgage page
  And "<ImageSection>" header present on page 
  
  Examples:
  |ImageSection|
  |When can you switch?|
  |Who can switch?|
  |Your Service Choice|
  