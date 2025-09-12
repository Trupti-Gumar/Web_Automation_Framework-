package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinance_AssetFinancePageActions;
import utils.SeleniumDriver;

public class BusinessFinance_AssetFinanceSteps {

	BusinessFinance_AssetFinancePageActions businessFinance_AssetFinancePageActions = new BusinessFinance_AssetFinancePageActions();

	@When("I click on the Asset Finance option")
	public void i_click_on_the_asset_finance_option() {

		SeleniumDriver.clickOnElement(businessFinance_AssetFinancePageActions.AssetFinanceLink());

	}

	@Then("I should be naviagated to Asset Finance page")
	public void i_should_be_naviagated_to_asset_finance_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Asset Finance Solutions for Businesses | Aldermore Bank";
		assertEquals(Actual, Expected);

	}

	@Then("I should see {string} on Asset Finance page header")
	public void i_should_see_on_asset_finance_page_header(String header) {

		String Actual = SeleniumDriver.GetElementText(businessFinance_AssetFinancePageActions.AssetFinanceHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as USP sub header on Asset Finance page")
	public void i_should_see_the_as_usp_sub_header_on_asset_finance_page(String header) {

		String Actual = businessFinance_AssetFinancePageActions.verifyUSPSubHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}

	@Then("I should see the {string} Card on Asset Finance page")
	public void i_should_see_the_card_on_asset_finance_page(String header) {

		String Actual = businessFinance_AssetFinancePageActions.VerfyCardHeaders(header);
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected));
	}

	@Then("I should be able to click on  {string} card on Asset Finance page and redirected to respective page")
	public void i_should_be_able_to_click_on_card_on_asset_finance_page_and_redirected_to_respective_page(
			String header) {

		String Actual = businessFinance_AssetFinancePageActions.VerfyCardLinkPages(header);
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Invalid Page");
	}

	@Then("I should see the Asset Finance FAQs header {string}  on Asset Finance page")
	public void i_should_see_the_asset_finance_fa_qs_header_on_asset_finance_page(String header) {

		String Actual = SeleniumDriver.GetElementText(businessFinance_AssetFinancePageActions.AssetFinanceFAQHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Asset Finance FAQs Accordians on the Asset Finance page")
	public void i_should_see_the_asset_finance_fa_qs_accordians_on_the_asset_finance_page() {

		SeleniumDriver.clickOnElement(businessFinance_AssetFinancePageActions.AssetFinanceFAQAccordian());
		
		boolean Actual = SeleniumDriver.isElementPresent(businessFinance_AssetFinancePageActions.AssetFinanceFAQATextBlock());
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the more card header {string} on Asset Finance FAQs section")
	public void i_should_see_the_more_card_header_on_asset_finance_fa_qs_section(String header) {

		String Actual = SeleniumDriver.GetElementText(businessFinance_AssetFinancePageActions.MoreCardTitle());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on View Asset Finance FAQs CTA button and should be redirected to {string} page")
	public void i_should_be_able_to_click_on_view_asset_finance_fa_qs_cta_button_and_should_be_redirected_to_page(
			String header) {

		String Actual = SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageActions.MoreCardLink());
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Invalid Page");
	}

	@Then("I should see the {string} as header for the Award component on Asset Finance page")
	public void i_should_see_the_as_header_for_the_award_component_on_asset_finance_page(String header) {

		String Actual = SeleniumDriver.GetElementText(businessFinance_AssetFinancePageActions.AwardHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on Customer Success story card and should be redirected to {string} page")
	public void i_should_be_able_to_click_on_customer_success_story_card_and_should_be_redirected_to_page(
			String header) {

		String Actual = SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageActions.CustomerstoriesCard());
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}

	@Then("I should be able to click on Business Finance card and should be redirected to {string} page")
	public void i_should_be_able_to_click_on_business_finance_card_and_should_be_redirected_to_page(String header) {

		String Actual = SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageActions.BusinessfinanceCard());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on Help and Support card and should be redirected to {string} page")
	public void i_should_be_able_to_click_on_help_and_support_card_and_should_be_redirected_to_page(String header) {

		String Actual = SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageActions.HelpSupportCard());
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
}
