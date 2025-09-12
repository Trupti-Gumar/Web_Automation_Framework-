package Help_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Help_PersonalSavingsHelpActions;
import utils.SeleniumDriver;

public class Help_PersonalSavingsHelpSteps {

	Help_PersonalSavingsHelpActions help_PersonalSavingsHelpActions = new Help_PersonalSavingsHelpActions();

	@Given("I am on Aldermore home page")
	public void i_am_on_a_aldermore_home_page() {
	    
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(help_PersonalSavingsHelpActions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(help_PersonalSavingsHelpActions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(help_PersonalSavingsHelpActions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	@When("I navigate to the Help page")
	public void i_navigate_to_the_help_page() {
		SeleniumDriver.clickOnElement(help_PersonalSavingsHelpActions.HelpLink());
	}
	
	@And("I navigate to Personal Savings Help page")
	public void i_navigate_to_personal_savings_help_page() {
		SeleniumDriver.clickOnElement(help_PersonalSavingsHelpActions.PersonalSavingsHelpCard());
	}
	
	@Then("I should see the {string} as the header for the Personal Savings Help page")
	public void i_should_see_the_as_the_header_for_the_Personal_Savings_Help_page(String header) {

		String Actual = SeleniumDriver.GetElementText(help_PersonalSavingsHelpActions.PersonalSavingsHelpPageHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see this {string} Frequent Question on the Personal Savings Help page")
	public void i_should_see_this_Frequent_Question_on_the_Personal_Savings_Help_page(String header) {
	    
		String Actual = help_PersonalSavingsHelpActions.getFrequentQuestionHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on this {string} Frequent Question link and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_Frequent_Question_link_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = help_PersonalSavingsHelpActions.getFrequentQuestionPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should see this {string} card on the Personal Savings Help page")
	public void i_should_see_this_card_on_the_Personal_Savings_Help_page(String header) {
	    
		String Actual = help_PersonalSavingsHelpActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on this {string} cardlink and redirected to the respective {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_and_redirected_to_the_respective_page(String header, String pageTitle) {
	    
		String Actual = help_PersonalSavingsHelpActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should see the {string} as the header for the Image copy section on Personal Savings Help page")
	public void i_should_see_the_as_the_header_for_the_Image_copy_section_on_Personal_Savings_Help_page(String header) {
	    
		String Actual = help_PersonalSavingsHelpActions.getImageCopyHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should see {string} the image copy link on the Personal Savings Help page")
	public void i_should_see_the_image_copy_link_on_the_Personal_Savings_Help_page(String header) {
	    
		String Actual = help_PersonalSavingsHelpActions.getImageCopyLinks(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	
	@Then("I should be able to click on this {string} image copy link and redirected to the {string} respective page")
	public void i_should_be_able_to_click_on_this_image_copy_link_and_redirected_to_the_respective_page(String header, String pageTitle) {
	    
		String Actual = help_PersonalSavingsHelpActions.getImageCopyPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	
	@Then("I should see this {string} contact card on the Personal Savings Help page")
	public void i_should_see_this_contact_card_on_the_Personal_Savings_Help_page(String header) {
	    
		String Actual = help_PersonalSavingsHelpActions.getContactCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} as the header for the Masthead black box on the Personal Savings Help page")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box_on_the_Personal_Savings_Help_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(help_PersonalSavingsHelpActions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} link present on the Personal Savings Help page and redirected to the respective {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_Personal_Savings_Help_page_and_redirected_to_the_respective_page(String header, String pageTitle) {
	   
		String Actual = help_PersonalSavingsHelpActions.getMastheadBlackboxLinkPage(pageTitle);
	    String Expected = pageTitle;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

}
