package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_BusinessFinanceActions;
import utils.SeleniumDriver;

public class Intermediaries_BusinessFinanceSteps {
	
	Intermediaries_BusinessFinanceActions BusinessFinanceActions = new 
			Intermediaries_BusinessFinanceActions();
	
	@Then("I click on Business finance dropdown")
	public void i_click_on_business_finance_dropdown() {
		SeleniumDriver.clickElementWithJavaScript(BusinessFinanceActions.BusinessFinanceDropdown());
	}

	@And("I clicked on Business finance intermediaries option")
	public void i_clicked_on_business_finance_intermediaries_options() {
		SeleniumDriver.clickElementWithJavaScript(BusinessFinanceActions.BusinessFinance_Intermediaries());
	}
	
	@And("I should see the {string} as the header for the Business finance Home page")
	public void i_should_see_the_header_for_the_business_finance_Intermediaries_home_page(String header) {
		String Actual = SeleniumDriver.GetElementText(BusinessFinanceActions.Mastheadheader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I will verify the {string} on the page")
	public void i_will_verify_the_cardheader_on_the_page(String header) {
		String Actual = BusinessFinanceActions.getCardHeader(header);
		String Expected =header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I will click the {string} and naviagte to {string}")
	public void i_will_click_the_cardheader_and_navgate_to_PageTitle(String header, String title) {
		String Actual = BusinessFinanceActions.getCardPageTitle(header);
		String Expected = title;
		assertTrue(Actual.contains(Expected), "Page Not Found");
	}
	
	
}
