package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_HelpAndSupport_BereavementGuideActions;

public class Mortgages_HelpAndSupport_BereavementGuideSteps {
	
	Mortgages_HelpAndSupport_BereavementGuideActions BereavementGuideActions = new Mortgages_HelpAndSupport_BereavementGuideActions();

	@Then("{string} present in the dropdown")
	public void options_present_in_the_dropdown(String header) {
		String Actual = BereavementGuideActions.getDropdownOption();
		String Expected =header;
		assertEquals(Actual, Expected);
	}
	
	@And("option clicked")
	public void options_clicked() {
		BereavementGuideActions.clickedtheOption();
	}
	
	@Then("{string} will be displayed once redirected")
	public void PageTitle_will_be_displayed_once_redirected(String header) {
		String Actual = BereavementGuideActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should naviagte to Bereavement guide page")
	public void i_should_navigate_to_Bereavement_guide_page() {
		BereavementGuideActions.clickedtheOption();
	}
	
	@And("headerlink {string} present on the page")
	public void i_should_see_the_headers_present_on_the_page(String header) {
		String Actual = BereavementGuideActions.getHeadersPresentonPage(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should click on the {string} present under the header and redirected to {string}")
	public void i_should_click_on_the_link_present_under_the_header_and_redirected_to_pageTitle(String link, String header) {
		BereavementGuideActions.ClickOntheLink(link);
		String Actual = BereavementGuideActions.getRedirectedtoPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
}
