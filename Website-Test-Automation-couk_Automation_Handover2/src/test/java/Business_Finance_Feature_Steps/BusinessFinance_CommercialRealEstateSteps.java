package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BS_CommercialRealEstatePageActions;
import utils.SeleniumDriver;

public class BusinessFinance_CommercialRealEstateSteps {
	
	BS_CommercialRealEstatePageActions CommercialRealEstatePageActions = new BS_CommercialRealEstatePageActions();

	@When("I click on the Commercial Real Estate option")
	public void i_click_on_the_commercial_real_estate_option() {

		SeleniumDriver.clickOnElement(CommercialRealEstatePageActions.CommercialRealEstate());
	}

	@Then("I should be naviagated to Commercial Real Estate page")
	public void i_should_be_naviagated_to_commercial_real_estate_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Commercial Real Estate Finance | Aldermore Bank";
		assertTrue(Actual.contains(Expected),"Invalid page title");
	}

	@Then("I should see {string} on Commercial Real Estate header")
	public void i_should_see_on_commercial_real_estate_header(String header) {

		String Actual = SeleniumDriver
				.GetElementText(CommercialRealEstatePageActions.mastHeadHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(CommercialRealEstatePageActions.mastHeadHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on  {string} card on Commercial Real Estate page and redirected to respective page")
	public void i_should_be_able_to_click_on_card_on_commercial_real_estate_page_and_redirected_to_respective_page(
			String title) {
		String Actual = CommercialRealEstatePageActions.getCardPageTitle(title);
		String Expected =title;
		assertTrue(Actual.contains(Expected),"Invalid page title");
	}

	@Then("I should be able to click on Yellow CTA Banner on Commercial Real Estate page and redirected to respective page")
	public void i_should_be_able_to_click_on_yellow_cta_banner_on_commercial_real_estate_page_and_redirected_to_respective_page() {

		String Actual = SeleniumDriver.getPageTitle(CommercialRealEstatePageActions.yellowCTABanner());
		String Expected = "Contact Details for Business Finance | Aldermore Bank";
		assertTrue(Actual.contains(Expected),"Invalid page title");
	}

}
