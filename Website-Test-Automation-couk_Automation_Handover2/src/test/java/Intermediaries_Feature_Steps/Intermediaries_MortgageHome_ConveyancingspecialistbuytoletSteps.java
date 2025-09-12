package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_ConveyancingspecialistbuytoletActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ConveyancingspecialistbuytoletSteps {
	
	Intermediaries_MortgageHome_ConveyancingspecialistbuytoletActions ConveyancingspecialistbuytoletActions = new Intermediaries_MortgageHome_ConveyancingspecialistbuytoletActions();

	@Then("I click on Conveyancing specialist buy to let link")
	public void i_click_on_Conveyancing_specialist_buy_to_let_link() {
		
		SeleniumDriver.waitForElementClickable(ConveyancingspecialistbuytoletActions.ConveyancingspecialistbuytoletLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(ConveyancingspecialistbuytoletActions.ConveyancingspecialistbuytoletLink());
	}

	@Then("I should navigate to Conveyancing specialist buy to let page")
	public void i_should_navigate_to_Conveyancing_specialist_buy_to_let_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Conveyancing guidelines - Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Conveyancing specialist buy to let page")
	public void i_should_see_the_as_the_header_for_the_Conveyancing_specialist_buy_to_let_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ConveyancingspecialistbuytoletActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} cards on the Conveyancing specialist buy to let page")
	public void i_should_see_this_cards_on_the_Conveyancing_specialist_buy_to_let_page(String header) {
	    
		String Actual = ConveyancingspecialistbuytoletActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink on the Conveyancing specialist buy to let page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_on_the_Conveyancing_specialist_buy_to_let_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = ConveyancingspecialistbuytoletActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
