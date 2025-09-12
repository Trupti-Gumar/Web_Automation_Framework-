package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Intermediaries_Homepage_Actions;
import utils.SeleniumDriver;

public class Intermediaries_Homepage_Steps {
	
	Intermediaries_Homepage_Actions intermediaries_Homepage_Actions = new Intermediaries_Homepage_Actions();

	@Given("I am on a Aldermore home page")
	public void i_am_on_a_aldermore_home_page() {
	    
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(intermediaries_Homepage_Actions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(intermediaries_Homepage_Actions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(intermediaries_Homepage_Actions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("I click on Intermediaries link")
	public void i_click_on_intermediaries_link() {
	    
	    SeleniumDriver.clickElementWithJavaScript(intermediaries_Homepage_Actions.IntermediariesLink());
	}

	@Then("I should navigate to Internediaries home page")
	public void i_should_navigate_to_internediaries_home_page() {
	    
	    boolean Actual = SeleniumDriver.isElementPresent(intermediaries_Homepage_Actions.MastheadHeader());
	    boolean Expected = true;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Internediaries home page")
	public void i_should_see_the_as_the_header_for_the_internediaries_home_page(String header) {
	    
	    String Actual = SeleniumDriver.GetElementText(intermediaries_Homepage_Actions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I shoould see the {string} card on the Internediaries home page")
	public void i_shoould_see_the_on_the_internediaries_home_page(String header) {
	    
		String Actual = intermediaries_Homepage_Actions.getCardHeaders(header);
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = intermediaries_Homepage_Actions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

}
