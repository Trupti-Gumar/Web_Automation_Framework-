package Help_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Help_BusinessSavingsHelpActions;
import utils.SeleniumDriver;

public class Help_BusinessSavingsHelpSteps {

	Help_BusinessSavingsHelpActions help_BusinessSavingsHelpActions = new Help_BusinessSavingsHelpActions();

	@Given("I am on this Aldermore home page")
	public void i_am_on_this_aldermore_home_page() {
	    
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(help_BusinessSavingsHelpActions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(help_BusinessSavingsHelpActions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(help_BusinessSavingsHelpActions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	@When("I navigate in to the Help page")
	public void i_navigate_in_to_the_help_page() {
		SeleniumDriver.clickOnElement(help_BusinessSavingsHelpActions.HelpLink());
	}
	
	@And("I navigate to Business Savings Help page")
	public void i_navigate_to_Business_savings_help_page() {
		SeleniumDriver.clickOnElement(help_BusinessSavingsHelpActions.BusinessSavingsHelpCard());
	}
	
	@Then("I should see the {string} as the header for the Business Savings Help page")
	public void i_should_see_the_as_the_header_for_the_Business_Savings_Help_page(String header) {

		String Actual = SeleniumDriver.GetElementText(help_BusinessSavingsHelpActions.BusinessSavingsHelpPageHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see this {string} Popular Question on the Business Savings Help page")
	public void i_should_see_this_Popular_Question_on_the_Business_Savings_Help_page(String header) {
	    
		String Actual = help_BusinessSavingsHelpActions.getPopularQuestionHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on this {string} Popular Question link and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_Popular_Question_link_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = help_BusinessSavingsHelpActions.getPopularQuestionPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should see this {string} card on the Business Savings Help page")
	public void i_should_see_this_card_on_the_Business_Savings_Help_page(String header) {
	    
		String Actual = help_BusinessSavingsHelpActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on the {string} cardlink and redirected to the respective {string} page")
	public void i_should_be_able_to_click_on_the_cardlink_and_redirected_to_the_respective_page(String header, String pageTitle) {
	    
		String Actual = help_BusinessSavingsHelpActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should be able to click on the Forgotten password reset button and redirected to the {string} respective page")
	public void i_should_be_able_to_click_on_the_Forgotten_password_reset_button_and_redirected_to_the_respective_page(String header) {
	        
	    String Actual = help_BusinessSavingsHelpActions.getForgottenPasswordResetPageTitle(header);
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should see the {string} as the header for the Masthead black box on the Business Savings Help page")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box_on_the_Business_Savings_Help_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(help_BusinessSavingsHelpActions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} link present on the Business Savings Help page and redirected to the respective {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_Business_Savings_Help_page_and_redirected_to_the_respective_page(String header, String pageTitle) {
	   
		String Actual = help_BusinessSavingsHelpActions.getMastheadBlackboxLinkPage(pageTitle);
	    String Expected = pageTitle;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

}
