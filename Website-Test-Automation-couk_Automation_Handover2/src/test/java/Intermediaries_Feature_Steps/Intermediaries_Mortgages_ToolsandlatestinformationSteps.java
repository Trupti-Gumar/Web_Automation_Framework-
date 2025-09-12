package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_Mortgages_ToolsandlatestinformationActions;
import utils.SeleniumDriver;

public class Intermediaries_Mortgages_ToolsandlatestinformationSteps {
	
	Intermediaries_Mortgages_ToolsandlatestinformationActions ToolsandlatestinformationActions = new Intermediaries_Mortgages_ToolsandlatestinformationActions();

	@Then("I click on Tools and latest information link")
	public void i_click_on_Tools_and_latest_information_link() {
		
		SeleniumDriver.waitForElementClickable(ToolsandlatestinformationActions.ToolsandlatestinformationLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(ToolsandlatestinformationActions.ToolsandlatestinformationLink());
	}

	@Then("I should navigate to Tools and latest information page")
	public void i_should_navigate_to_Tools_and_latest_information_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Mortgage Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Tools and latest information page")
	public void i_should_see_the_as_the_header_for_the_Tools_and_latest_information_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ToolsandlatestinformationActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} cards on the Tools and latest information page")
	public void i_should_see_this_cards_on_the_Tools_and_latest_information_page(String header) {
	    
		String Actual = ToolsandlatestinformationActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink on the Tools and latest information page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_on_the_Tools_and_latest_information_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = ToolsandlatestinformationActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
