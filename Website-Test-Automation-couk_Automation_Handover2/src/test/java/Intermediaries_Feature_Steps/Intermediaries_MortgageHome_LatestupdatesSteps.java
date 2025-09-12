package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_LatestupdatesActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_LatestupdatesSteps {
	
	Intermediaries_MortgageHome_LatestupdatesActions LatestupdatesActions = new Intermediaries_MortgageHome_LatestupdatesActions();

	@Then("I click on Latest updates link")
	public void i_click_on_Latest_updates_link() {
		
		SeleniumDriver.waitForElementClickable(LatestupdatesActions.LatestupdatesLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(LatestupdatesActions.LatestupdatesLink());
	}

	@Then("I should navigate to Latest updates page")
	public void i_should_navigate_to_Latest_updates_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Latest Mortgage Updates for Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Latest updates page")
	public void i_should_see_the_as_the_header_for_the_Latest_updates_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(LatestupdatesActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this recent intermediary updates link {string} present on the Latest updates page")
	public void i_should_see_this_recent_intermediary_updates_link_present_on_the_Latest_updates_page(String header) {
	    
		String Actual = LatestupdatesActions.getLinkText(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on this {string} recent intermediary updates link on the Latest updates page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_recent_intermediary_updates_on_the_Latest_updates_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = LatestupdatesActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
}
