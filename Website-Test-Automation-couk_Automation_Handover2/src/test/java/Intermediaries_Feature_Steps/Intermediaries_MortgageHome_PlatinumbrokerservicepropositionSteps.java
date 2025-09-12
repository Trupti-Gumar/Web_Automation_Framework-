package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_PlatinumbrokerservicepropositionActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_PlatinumbrokerservicepropositionSteps {
	
	Intermediaries_MortgageHome_PlatinumbrokerservicepropositionActions PlatinumbrokerservicepropositionActions = new Intermediaries_MortgageHome_PlatinumbrokerservicepropositionActions();

	@Then("I click on Platinum Broker service proposition link")
	public void i_click_on_Platinum_broker_service_proposition_link() {
		
		SeleniumDriver.waitForElementClickable(PlatinumbrokerservicepropositionActions.PlatinumbrokerservicepropositionLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(PlatinumbrokerservicepropositionActions.PlatinumbrokerservicepropositionLink());
	}

	@Then("I should navigate to Platinum Broker service proposition page")
	public void i_should_navigate_to_Platinum_broker_service_proposition_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Platinum Broker Service Propositions | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Platinum Broker service proposition page")
	public void i_should_see_the_as_the_header_for_the_Platinum_broker_service_proposition_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(PlatinumbrokerservicepropositionActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the {string} image copy section on the Platinum Broker service proposition page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_Platinum_broker_service_proposition_page(String header, String headerNum) {
	   
		String Actual = PlatinumbrokerservicepropositionActions.getImageCopyHeader(headerNum) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should see these {string} cards on the Platinum Broker service proposition page")
	public void i_should_see_these_cards_on_the_Platinum_broker_service_proposition_page(String header) {
	    
		String Actual = PlatinumbrokerservicepropositionActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink and redirected to the {string} Platinum Broker service proposition page")
	public void i_should_be_able_to_click_on_this_cardlink_and_redirected_to_the_Platinum_Broker_service_proposition_page(String header, String pageTitle) {
	    
		String Actual = PlatinumbrokerservicepropositionActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    System.out.println("Actual" + Actual + "Expected" + Expected);
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
