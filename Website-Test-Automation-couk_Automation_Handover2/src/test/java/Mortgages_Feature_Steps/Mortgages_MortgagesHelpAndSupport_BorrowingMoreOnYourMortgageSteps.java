package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageActions;
import utils.SeleniumDriver;

public class Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageSteps {
	Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageActions
	BorrowActions = new Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageActions();
	
	@Then("{string} CTA button is visible")
	public void CardName_CTA_button_is_visible(String header) {
		String Actual = BorrowActions.getCardName();
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}

	@When("clicked Card CTA button")
	public void clickedCTAbutton() {
		BorrowActions.clickedCTAbutton();
	}
	
	@Then("{string} should be visible")
	public void PageTitle_should_be_visible(String header) {
		String Actual = BorrowActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Borrowing more on your mortgage page")
	public void i_naviagte_borrowing_more_on_your_mortgages_page() {
		BorrowActions.clickedCTAbutton();
	}
	
	@Then("I see the {string} in the ImageSection")
	public void i_see_the_headers_in_the_ImageSection(String header) {
		String Actual = BorrowActions.getImageSectionheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I click the {string} and rediretced to {string}")
	public void i_click_the_CTAlink_and_redirected_to_Pagetitle(String CTA, String header) {
		BorrowActions.clickCTImageCTAbutton(CTA);
		String Actual = BorrowActions.getCTAlinkPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
}
