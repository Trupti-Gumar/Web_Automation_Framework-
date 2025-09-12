package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_AffordabilitycalculatorsActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_AffordabilitycalculatorsSteps {
	
	Intermediaries_MortgageHome_AffordabilitycalculatorsActions AffordabilitycalculatorsActions = new Intermediaries_MortgageHome_AffordabilitycalculatorsActions();

	@Then("I click on Affordability calculators link")
	public void i_click_on_Affordability_calculators_link() {
		
		SeleniumDriver.waitForElementClickable(AffordabilitycalculatorsActions.AffordabilitycalculatorsLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(AffordabilitycalculatorsActions.AffordabilitycalculatorsLink());
	}

	@Then("I should navigate to Affordability calculators page")
	public void i_should_navigate_to_Affordability_calculators_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Affordability Calculators - Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Affordability calculators page")
	public void i_should_see_the_as_the_header_for_the_Affordability_calculators_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(AffordabilitycalculatorsActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see these {string} tabs on the Affordability calculators page")
	public void i_should_see_these_tabs_on_the_Affordability_calculators_page(String header) {
	    
		String Actual = AffordabilitycalculatorsActions.getTabHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
}
