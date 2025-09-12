package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_ResidentialmortgagedocumentsActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ResidentialmortgagedocumentsSteps {
	
	Intermediaries_MortgageHome_ResidentialmortgagedocumentsActions ResidentialmortgagedocumentsActions = new Intermediaries_MortgageHome_ResidentialmortgagedocumentsActions();

	@Then("I click on Residential mortgage documents link")
	public void i_click_on_Residential_mortgage_documents_link() {
		
		SeleniumDriver.waitForElementClickable(ResidentialmortgagedocumentsActions.ResidentialmortgagedocumentsLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(ResidentialmortgagedocumentsActions.ResidentialmortgagedocumentsLink());
	}

	@Then("I should navigate to Residential mortgage documents page")
	public void i_should_navigate_to_Residential_mortgage_documents_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Residential Mortgage Documents - Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Residential mortgage documents page")
	public void i_should_see_the_as_the_header_for_the_Residential_mortgage_documents_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ResidentialmortgagedocumentsActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} cards on the Residential mortgage documents page")
	public void i_should_see_this_cards_on_the_Residential_mortgage_documents_page(String header) {
	    
		String Actual = ResidentialmortgagedocumentsActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink on the Residential mortgage documents page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_on_the_Residential_mortgage_documents_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = ResidentialmortgagedocumentsActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
