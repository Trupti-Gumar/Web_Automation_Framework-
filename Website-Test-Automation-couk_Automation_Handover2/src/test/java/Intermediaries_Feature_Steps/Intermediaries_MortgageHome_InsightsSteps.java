package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_InsightsActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_InsightsSteps {
	
	Intermediaries_MortgageHome_InsightsActions InsightsActions = new Intermediaries_MortgageHome_InsightsActions();

	@Then("I click on Insights link")
	public void i_click_on_Insights_link() {
		
		SeleniumDriver.waitForElementClickable(InsightsActions.InsightsLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(InsightsActions.InsightsLink());
	}

	@Then("I should navigate to Insights page")
	public void i_should_navigate_to_Insights_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Insights for Mortgage Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Insights page")
	public void i_should_see_the_as_the_header_for_the_Insights_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(InsightsActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} cards on the Insights page")
	public void i_should_see_this_cards_on_the_Insights_page(String header) {
	    
		String Actual = InsightsActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink on the Insights page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_on_the_Insights_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = InsightsActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
