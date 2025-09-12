package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_ProductswitchdocumentsActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ProductswitchdocumentsSteps {
	
	Intermediaries_MortgageHome_ProductswitchdocumentsActions ProductswitchdocumentsActions = new Intermediaries_MortgageHome_ProductswitchdocumentsActions();

	@Then("I click on Product switch documents link")
	public void i_click_on_Product_switch_documents_link() {
		
		SeleniumDriver.waitForElementClickable(ProductswitchdocumentsActions.ProductswitchdocumentsLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(ProductswitchdocumentsActions.ProductswitchdocumentsLink());
	}

	@Then("I should navigate to Product switch documents page")
	public void i_should_navigate_to_Product_switch_documents_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Mortgage Product Switch Documents - Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Product switch documents page")
	public void i_should_see_the_as_the_header_for_the_Product_switch_documents_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ProductswitchdocumentsActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} cards on the Product switch documents page")
	public void i_should_see_this_cards_on_the_Product_switch_documents_page(String header) {
	    
		String Actual = ProductswitchdocumentsActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink on the Product switch documents page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_on_the_Product_switch_documents_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = ProductswitchdocumentsActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
