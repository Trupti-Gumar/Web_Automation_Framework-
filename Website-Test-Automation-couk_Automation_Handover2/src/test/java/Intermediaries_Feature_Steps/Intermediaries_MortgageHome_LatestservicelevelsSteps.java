package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_LatestservicelevelsActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_LatestservicelevelsSteps {
	
	Intermediaries_MortgageHome_LatestservicelevelsActions LatestservicelevelsActions = new Intermediaries_MortgageHome_LatestservicelevelsActions();

	@Then("I click on Latest service levels link")
	public void i_click_on_Latest_service_levels_link() {
		
		SeleniumDriver.waitForElementClickable(LatestservicelevelsActions.LatestservicelevelsLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(LatestservicelevelsActions.LatestservicelevelsLink());
	}

	@Then("I should navigate to Latest service levels page")
	public void i_should_navigate_to_Latest_service_levels_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Our Latest Mortgage Turnaround Times | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Latest service levels page")
	public void i_should_see_the_as_the_header_for_the_Latest_service_levels_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(LatestservicelevelsActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} headers on the Latest service levels page")
	public void i_should_see_this_headers_on_the_Latest_service_levels_page(String header) {
	    
		String Actual = LatestservicelevelsActions.getHeadingText(header) ;
		System.out.println("Actual" + Actual);
	    String Expected = header;
	    System.out.println("Expected" +Expected);
	    
	    assertEquals(Actual, Expected);
	}
	
}
