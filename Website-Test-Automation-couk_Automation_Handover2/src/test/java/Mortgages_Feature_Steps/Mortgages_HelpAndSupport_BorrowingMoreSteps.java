package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_HelpAndSupport_BorrowingMoreActions;

public class Mortgages_HelpAndSupport_BorrowingMoreSteps {

	Mortgages_HelpAndSupport_BorrowingMoreActions BorrowingActions = new Mortgages_HelpAndSupport_BorrowingMoreActions();

	@Then("I should see the {string} as options")
	public void i_should_see_the_dropdow_as_options(String option) {
		String Actual = BorrowingActions.getDropdownOption();
		String Expected = option;
		assertEquals(Actual, Expected);
	}
	
	@And("Clicked the link")
	public void Clicked_the_link() {
		BorrowingActions.clickedTheLink();
	}
	
	@Then("I should be redirected to the {string}")
	public void i_should_be_redirected_to_the_PageTitle(String header) {
		String Actual = BorrowingActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Borrowing more page")
	public void i_navigate_to_borrowing_more_page() {
		BorrowingActions.clickedTheLink();
	}
	
	@And("{string} on the Image section")
	public void i_should_see_the_header_on_the_Image_section(String header) {
		String Actual = BorrowingActions.getHeaderImageSection(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
//	@Then("I will click the {string} on the ImageSection")
//	public void i_will_click_the_link_on_the_ImageSection(String header){
//		BorrowingActions.ClickTheLinkOnImageSection(header);
//	}
	
	@Then("I will click the {string} on the QuickLinkSection")
	public void i_will_click_the_link_on_the_QuickLinkSection(String header){
		BorrowingActions.ClickTheLinkOnQuickLinkSection(header);
	}
	
	@And("It will redirected to {string}")
	public void it_will_redirected_to_pageTitle(String header) {
		String Actual = BorrowingActions.getLinkPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
}
