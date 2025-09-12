package Login_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.LoginPageActions;
import utils.SeleniumDriver;

public class LoginSteps {

	LoginPageActions loginPageActions = new LoginPageActions();
	
	@Given("I am on a Aldermore home page")
	public void i_am_on_aldermore_home_page() {
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(loginPageActions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(loginPageActions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(loginPageActions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Then("I click on Login link")
	public void i_click_on_Login_link() {
		
		SeleniumDriver.waitForElementClickable(loginPageActions.LoginLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(loginPageActions.LoginLink());
	}

	@Then("I should navigate to Login page")
	public void i_should_navigate_to_Login_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Log into your Aldermore Online Account | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} as the header for the Login page")
	public void i_should_see_the_as_the_header_for_the_Insights_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(loginPageActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should see the NavigationBar options {string} present on the Login page")
	public void i_should_see_NavigationBar_options_present_on_the_Login_page(String header) {
	    
		String Actual = loginPageActions.getNavigationBarOptions(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should see these Text headers {string} present on the Login page")
	public void i_should_see_these_Text_headers_present_on_the_Login_page(String header) {
	    
		String Actual = loginPageActions.getTextHeaders(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should see these card headers {string} present on the Login page")
	public void i_should_see_these_card_headers_present_on_the_Login_page(String header) {
	    
		String Actual = loginPageActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on this {string} cardlink on the Login page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_on_the_Login_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = loginPageActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
