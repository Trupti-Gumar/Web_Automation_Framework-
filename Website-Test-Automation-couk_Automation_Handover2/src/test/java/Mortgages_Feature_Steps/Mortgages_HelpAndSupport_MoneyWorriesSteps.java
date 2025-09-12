package Mortgages_Feature_Steps;


import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_HelpAndSupport_MoneyWorriesActions;

public class Mortgages_HelpAndSupport_MoneyWorriesSteps {
	
	Mortgages_HelpAndSupport_MoneyWorriesActions MoneyWorriesActions = new Mortgages_HelpAndSupport_MoneyWorriesActions();
	
	@Then("I see option {string}")
	public void i_seee_options(String option) {
		String Actual = MoneyWorriesActions.getOptionText();
		String Expected = option;
		assertEquals(Actual, Expected);
	}
	
	@And("I clicked option")
	public void i_clicked_option() {
		MoneyWorriesActions.clickedToOption();
	}
	
	@Then("{string} Redirected page should be displayed")
	public void redirected_page_should_be_displyed(String header) {
		String Actual = MoneyWorriesActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I direct toward Money Worries page")
	public void i_direct_toward_money_worries_page() {
		MoneyWorriesActions.navigateToMoneyWorries();
	}
	
//	@And("I see the {string} header present on the page")
//	public void i_see_the_header_present_on_the_page(String USPSection) {
//		String Actual = MoneyWorriesActions.getUSPsectionTitle(USPSection);
//		String Expected = USPSection;
//		assertEquals(Actual, Expected);
//	}
	
	@And("I see the {string} header present on the page")
	public void i_see_the_header_present_on_the_page(String USPSection) {
		String Actual = MoneyWorriesActions.getImagesectionTitle(USPSection);
		String Expected = USPSection;
		assertEquals(Actual, Expected);
	}
	
	
	@Then("I see {string} on the page under ImageSection")
	public void i_see_link_on_the_page_under_imageSection(String header) {
		String Actual = MoneyWorriesActions.getLinkTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I click on link and redirected on the {string}")
	public void i_click_on_link_and_redirected_on_the_pageTitle(String header) {
		String Actual = MoneyWorriesActions.getLinkPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
 
	
}
