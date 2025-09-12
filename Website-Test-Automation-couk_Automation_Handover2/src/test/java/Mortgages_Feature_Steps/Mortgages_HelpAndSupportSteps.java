package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_HelpAndSupportActions;

public class Mortgages_HelpAndSupportSteps {

	Mortgages_HelpAndSupportActions HelpActions = new Mortgages_HelpAndSupportActions();

	@Then("I see {string} as an option")
	public void i_see_the_dropDown_link(String header) {
		String Actual = HelpActions.getDropdwonOption();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I click the option")
	public void i_click_the_option() {
		HelpActions.clicktheLink();
	}
	
	@Then("I redirected {string} page")
	public void i_redirected_to_the_PageTitle_page(String header) {
		String Actual = HelpActions.getPageTitleHeader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I navigate to Help page")
	public void i_navigate_to_help_page() {
		HelpActions.navigateToHelpPage();
	}
	
	@And("I see the {string} Cards on the page")
	public void i_see_the_cardheader_on_the_page(String header) {
		String Actual = HelpActions.getCardHeaderOnPage(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} as the header for the Image copy secion")
	public void i_should_see_the_header_on_imageSection(String header) {
		String Actual = HelpActions.getImageSectionHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I clicked on the blackbox {string} and navigate to the {string}")
	public void i_clicked_on_the_blackbox_option_and_navigate_to_the_pageTitle(String options, String pageTitle) {
         HelpActions.getBlackBoxOption(options);
         HelpActions.navigateToPageTitle(pageTitle);
			
	}
	
	@And("I clicked on card and redirected to {string}")
	public void i_clicked_on_card_and_redirected_to_pageTitle(String header) {
		HelpActions.clickOnCardHeader(header);
	}

}
