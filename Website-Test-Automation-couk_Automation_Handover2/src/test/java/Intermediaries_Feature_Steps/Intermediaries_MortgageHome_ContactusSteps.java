package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_ContactusActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ContactusSteps {
	
	Intermediaries_MortgageHome_ContactusActions ContactusActions = new Intermediaries_MortgageHome_ContactusActions();

	@Then("I click on Contactus link")
	public void i_click_on_Contactus_link() {
		
		SeleniumDriver.waitForElementClickable(ContactusActions.ContactusLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(ContactusActions.ContactusLink());
	}

	@Then("I should navigate to Contactus page")
	public void i_should_navigate_to_Contactus_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Residential & Buy to Let Mortgages Contacts for Intermediaries";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Contactus page")
	public void i_should_see_the_as_the_header_for_the_Contactus_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ContactusActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} headers on the Contactus page")
	public void i_should_see_this_headers_on_the_Contactus_page(String header) {
	    
		String Actual = ContactusActions.getHeadingText(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
}
