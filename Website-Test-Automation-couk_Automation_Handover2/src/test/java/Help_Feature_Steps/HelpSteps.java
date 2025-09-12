package Help_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.HelpActions;
import utils.SeleniumDriver;

public class HelpSteps {

	HelpActions helpActions = new HelpActions();

	@Given("I am on a Aldermore home page")
	public void i_am_on_a_aldermore_home_page() {
	    
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(helpActions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(helpActions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(helpActions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}	
	@When("I navigate to Help page")
	public void i_navigate_to_help_page() throws InterruptedException {
		SeleniumDriver.waitForElementClickable(helpActions.HelpLink());
		SeleniumDriver.clickOnElement(helpActions.HelpLink());
	}
	
	@Then("I should see the {string} as the header for the Help page")
	public void i_should_see_the_as_the_header_for_the_Help_page(String header) {

		String Actual = SeleniumDriver.GetElementText(helpActions.HelpPageHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see this {string} card on the Help page")
	public void i_should_see_this_card_on_the_Help_page(String header) {
	    
		String Actual = helpActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on this {string} cardlink and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = helpActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should see the {string} as the header for the Image copy section")
	public void i_should_see_the_as_the_header_for_the_Image_copy_section(String header) {
	    
		String Actual = helpActions.getImageCopyHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should see {string} the image copy link on the page")
	public void i_should_see_the_image_copy_link_on_the_page(String header) {
	    
		String Actual = helpActions.getImageCopyLinks(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	
	@Then("I should be able to click on this {string} image copy link and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_image_copy_link_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = helpActions.getImageCopyPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should see the {string} as the header for the Masthead black box on the Help page")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box_on_the_Help_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(helpActions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} link present on the Help page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_Help_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = helpActions.getMastheadBlackboxLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

}
