package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.MortgagePageActions;
import utils.SeleniumDriver;

public class MortgagesPageSteps {
	
	MortgagePageActions mortgagePageActions = new MortgagePageActions();
	
	@Given("I am on the Aldermore page")
	public void i_am_on_the_aldermore_home_page(){
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());
		try {
		boolean Cookies = SeleniumDriver.isElementPresent(mortgagePageActions.OneTrustCookies());
		if(Cookies = true) {
			
			SeleniumDriver.waitForElementClickable(mortgagePageActions.OneTrustCookies());
			SeleniumDriver.clickElement(mortgagePageActions.OneTrustCookies(), "Accept All Cookies");

		}
		}
		catch(Exception e)
		{
			
		}
	}

	@When("I navigate to Mortgages dropdown option")
	public void i_navigate_to_mortgages_dropdown_option() {
		SeleniumDriver.clickOnElement(mortgagePageActions.MortgageNavigationLink());
	}

	@Then("I should see the {string} as optionss")
	public void i_should_see_the_as_optionss(String header) {
         String Actual = mortgagePageActions.verifyMortgageOptions(header);
         String Expected = header;
         assertEquals(Actual, Expected);
	}

	@When("I click on the link")
	public void i_click_on_the_link() {
		SeleniumDriver.clickOnElement(mortgagePageActions.MortgageHeaderLink());
	}


	@Then("I should be redirected to {string}")
	public void i_should_be_redirected_to_(String PageTitle) {
		String Actual = mortgagePageActions.verifyMortgagePageTitle();
		String Expected = PageTitle;
		assertEquals(Actual,Expected);

	}
	
	@Then("I should be navigated to Mortgage Page")
	public void i_should_be_navigated_to_Mortgage_page() {
		SeleniumDriver.clickOnElement(mortgagePageActions.MortgageHeaderLink());
	}
	
	@Then("I should see the {string} CTA button present in the page")
	public void i_should_see_the_CTA_button(String header)
	{
		String Actual = mortgagePageActions.verifycardHeaderCTAbutton(header);
		String Expected = header;
		assertEquals(Actual,Expected);
		
	}
	
	
//    @And ("I should click CTAbutton and should be redirected to {string}")
//	public void i_should_be_redirected_to(String value)
//	{
//	
//		String ActualText;
//		String Expectedtext;
//
//		switch (value) {
//		case "Customers with credit issues":
//			ActualText = mortgagePageActions.getCustomersWithCreditIssuesPageTitle();
//			Expectedtext = value;
//			break;
//
//		case "Self-employed mortgages":
//			ActualText = mortgagePageActions.getSelfEmployedMortgagesPageTitle();
//			Expectedtext = value;
//			break;
//			
//		case "First time buyer mortgages":
//			ActualText = mortgagePageActions.getFirstTimeBuyerMortgagesPageTitle();
//			Expectedtext = value;
//			break;
//		case "Mortgages FAQs":
//			ActualText = mortgagePageActions.getMortgagesFAQsPageTitle();
//			Expectedtext = value;
//			break;
//		case "Mortgage guides":
//			ActualText = mortgagePageActions.getMortgageguidesPageTitle();
//			Expectedtext = value;
//			break;
//		case "Commercial mortgages":
//			ActualText = mortgagePageActions.getCommercialmortgagesPageTitle();
//			Expectedtext = value;
//			break;
//		case "Buy to let for limited companies":
//			ActualText = mortgagePageActions.getBuyToLetforlimitedCompaniesPageTitle();
//			Expectedtext = value;
//			break;
//		default:
//			throw new IllegalArgumentException("Invalid value: " + value);
//		}
//
//		assertEquals(ActualText, Expectedtext);
//		
//	}
	
	@Then ("I should see the USP section on Mortgage page")
	public void i_should_see_the_USP_section_on_mortgage_page() {
		boolean ActualResult = mortgagePageActions.isUSPSectionPresent();
		boolean ExpectedResult = true;
		assertEquals(ActualResult, ExpectedResult);
	}
	
	@Then("I should see the {string} for Masthead Black box on mortgage page")
	public void i_should_see_the_masthead_blackbox_on_mortgage_page(String header) {
		String Actual = mortgagePageActions.getQuickLinkBlackBoxheader();
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
	
	@Then ("I should click customers with credit issues card and should be redirected to {string}")
	public void i_should_click_on_card_present_on_mortgage_page_and_should_be_redirected_to_respective_page(String title)
	{
		String Actual = mortgagePageActions.getCustomersWithCreditIssuesPageTitle();
		String Expected = title;
		assertEquals(Actual, Expected);
	}
	
	@Then ("I should click Self-employed mortgages and should be redirected to {string}")
	public void i_should_click_on_card_present_on_page_and_should_be_redirected_to_respective_page(String title)
	{
		String Actual = mortgagePageActions.getSelfEmployedMortgagesPageTitle();
		String Expected = title;
		assertEquals(Actual, Expected);
	}
	
	@Then ("I should click First time buyer mortgages and should be redirected to {string}")
	public void i_should_click_on_First_time_buyer_mortgages_card_present_on_page_and_should_be_redirected_to_respective_page(String title)
	{
		String Actual = mortgagePageActions.getFirstTimeBuyerMortgagesPageTitle();
		String Expected = title;
		assertEquals(Actual, Expected);
	}
	
	@Then ("I should click Commercial mortgages and should be redirected to {string}")
	public void I_should_click_Commercial_mortgages_and_should_be_redirected_to_(String title)
	{
		String Actual = mortgagePageActions.getCommercialmortgagesPageTitle();
		String Expected = title;
		assertEquals(Actual, Expected);
	}
	
//	@Then ("I should click Mortgages FAQs and should be redirected to {string}")
//	public void I_should_click_Mortgages_FAQs_and_should_be_redirected_to_(String title)
//	{
//		String Actual = mortgagePageActions.getMortgagesFAQsPageTitle();
//		String Expected = title;
//		assertEquals(Actual, Expected);
//	}
	
	@Then ("I should click Mortgage guides and should be redirected to {string}")
	public void I_should_click_Mortgage_guides_and_should_be_redirected_to_(String title)
	{
		String Actual = mortgagePageActions.getMortgageguidesPageTitle();
		String Expected = title;
		assertEquals(Actual, Expected);
	}
	
	@Then ("I should click Buy to let for limited companies card and should be redirected to {string}")
	public void I_should_click_Buy_to_let_for_limited_companies_card_and_should_be_redirected_to_(String title)
	{
		String Actual = mortgagePageActions.getBuyToLetforlimitedCompaniesPageTitle();
		String Expected = title;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} in the Image Section")
	public void i_should_see_the_image_section_with_the_header_in_it(String header) {
		String Actual = mortgagePageActions.getImageSectionheader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the first {string} in the BlackBox Section")
	public void i_should_see_the_first_option_in_the_blackbox_section(String option )
	{
		String Actual = mortgagePageActions.getQuickLinkOption1();
		String Expected = option;
		assertEquals(Actual, Expected);
		
	}
	
	@Then("I should able to click that option and should be redirected to {string}")
	public void i_should_able_to_click_that_option_and_redirected_to(String PageTitle) {
		String Actual = mortgagePageActions.getPageTitleForOption1();
		String Expected = PageTitle;
		assertEquals(Actual, Expected);
		
	}
	
	@Then("I should see the second {string} in the BlackBox Section")
	public void i_should_see_the_second_option_in_the_blackbox_section(String option )
	{
		String Actual = mortgagePageActions.getQuickLinkOption2();
		String Expected = option;
		assertEquals(Actual, Expected);
		
	}
	
	@Then("I should be able to click the option and should be redirected to {string}")
	public void i_should_be_able_to_click_the_option_and_redirected_to(String PageTitle) {
		String Actual = mortgagePageActions.getPageTitleForOption2();
		String Expected = PageTitle;
		assertEquals(Actual, Expected);
		
	}
	
	@Then("I should see the third {string} in the BlackBox Section")
	public void i_should_see_the_third_option_in_the_blackbox_section(String option )
	{
		String Actual = mortgagePageActions.getQuickLinkOption3();
		String Expected = option;
		assertEquals(Actual, Expected);
		
	}
	
	@Then("I should click to the option and should be redirected to {string}")
	public void i_should_click_to_the_option_and_redirected_to(String PageTitle) {
		String Actual = mortgagePageActions.getPageTitleForOption3();
		String Expected = PageTitle;
		assertEquals(Actual, Expected);
		
	}
}
