package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_HelpAndSupport_SupportTailoredToYouActions;

public class Mortgages_HelpAndSupport_SupportTailoredToYouSteps {

	Mortgages_HelpAndSupport_SupportTailoredToYouActions SupportTailoredAction = new Mortgages_HelpAndSupport_SupportTailoredToYouActions();

	@Then("I see {string} present on page")
    public void i_see_CardOption_present_on_page(String header) {
		String Actual = SupportTailoredAction.getCardOptionText();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I clicked on the card")
	public void i_clicked_on_the_card() {
		SupportTailoredAction.ClckedTheCard();
	}
	
	@Then("I redirected to the Card {string}")
	public void i_redirected_to_the_card_PageTitle(String header) {
		String Actual = SupportTailoredAction.getCardPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to the Support Tailored To You Page")
	public void i_navigate_to_the_support_tailored_to_you_page() {
		SupportTailoredAction.ClckedTheCard();
	}
	
	@And("{string} header should be present on the page")
	public void ImageSection_header_should_be_present_on_the_page(String header) {
		String Actual = SupportTailoredAction.getImageSectionHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("{string} present on the Image Section and redirected to {string}")
	public void Clicked_on_link_present_on_the_image_section_and_redirected_to_PageTitle(String header, String PageTitle) {
		SupportTailoredAction.ClickedonLink(header);
		String Actual = SupportTailoredAction.getCardPageTitle(PageTitle);
		String Expected = PageTitle;
		assertEquals(Actual,Expected);
	}
}
