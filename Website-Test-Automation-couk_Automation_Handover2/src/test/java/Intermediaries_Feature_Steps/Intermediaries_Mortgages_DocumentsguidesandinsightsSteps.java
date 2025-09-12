package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_Mortgages_DocumentsguidesandinsightsActions;
import utils.SeleniumDriver;

public class Intermediaries_Mortgages_DocumentsguidesandinsightsSteps {
	
	Intermediaries_Mortgages_DocumentsguidesandinsightsActions DocumentsguidesandinsightsActions = new Intermediaries_Mortgages_DocumentsguidesandinsightsActions();

	@Then("I click on Documents guides and insights link")
	public void i_click_on_Documents_guides_and_insights_link() {
		
		SeleniumDriver.waitForElementClickable(DocumentsguidesandinsightsActions.DocumentsguidesandinsightsLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(DocumentsguidesandinsightsActions.DocumentsguidesandinsightsLink());
	}

	@Then("I should navigate to Documents guides and insights page")
	public void i_should_navigate_to_Documents_guides_and_insights_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Mortgage Documents for Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Documents guides and insights page")
	public void i_should_see_the_as_the_header_for_the_Documents_guides_and_insights_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(DocumentsguidesandinsightsActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} cards on the Documents guides and insights page")
	public void i_should_see_this_cards_on_the_Documents_guides_and_insights_page(String header) {
		
		 
		String Actual = DocumentsguidesandinsightsActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink on the Documents guides and insights page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_on_the_Documents_guides_and_insights_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = DocumentsguidesandinsightsActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
