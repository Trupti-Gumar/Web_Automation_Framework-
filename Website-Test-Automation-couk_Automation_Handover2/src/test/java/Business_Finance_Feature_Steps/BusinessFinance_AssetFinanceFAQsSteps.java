package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinance_AssetFinanceFAQsActions;
import utils.SeleniumDriver;

public class BusinessFinance_AssetFinanceFAQsSteps {
	
	BusinessFinance_AssetFinanceFAQsActions businessFinance_AssetFinanceFAQsActions = new BusinessFinance_AssetFinanceFAQsActions();

	@When("I click on the Asset Finance FAQ option")
	public void i_click_on_the_asset_finance_faq_option() {

		SeleniumDriver.clickOnElement(businessFinance_AssetFinanceFAQsActions.AssetFinanceFAQLink());
	}

	@Then("I should be naviagated to Asset Finance FAQ page")
	public void i_should_be_naviagated_to_asset_finance_faq_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Frequently Asked Questions: Asset Finance | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Asset Finance FAQs header {string}  on Asset Finance FAQ page")
	public void i_should_see_the_asset_finance_fa_qs_header_on_asset_finance_faq_page(String header) {

		String Actual = SeleniumDriver.GetElementText(businessFinance_AssetFinanceFAQsActions.AssetFinanceFAQHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Asset Finance FAQs Accordians on the Asset Finance FAQ page")
	public void i_should_see_the_asset_finance_fa_qs_accordians_on_the_asset_finance_faq_page() {

SeleniumDriver.clickOnElement(businessFinance_AssetFinanceFAQsActions.AssetFinanceFAQAccordian());
		
		boolean Actual = SeleniumDriver.isElementPresent(businessFinance_AssetFinanceFAQsActions.AssetFinanceFAQTextBlock());
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on Asset Finance CTA button and should be directed to {string} page")
	public void i_should_be_able_to_click_on_asset_finance_cta_button_and_should_be_directed_to_page(String header) {

		String Actual=SeleniumDriver.getPageTitle(businessFinance_AssetFinanceFAQsActions.AssetFinanceBackLink());
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Invalid Page");
	}
}
