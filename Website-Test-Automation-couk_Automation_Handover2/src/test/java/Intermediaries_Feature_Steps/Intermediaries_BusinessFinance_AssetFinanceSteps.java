package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_BusinessFinance_AssetFinanceActions;
import utils.SeleniumDriver;

public class Intermediaries_BusinessFinance_AssetFinanceSteps {

	
	Intermediaries_BusinessFinance_AssetFinanceActions AssetFinanceActions = new 
			Intermediaries_BusinessFinance_AssetFinanceActions();
	
	@Then("I click on Asset Finance option")
	public void i_click_on_asset_finance_option() {
		SeleniumDriver.clickElementWithJavaScript(AssetFinanceActions.AssetFinance_Intermediaries());
	}
	
	@And("I should see the {string} for the Asset finance Home page")
	public void i_should_see_the_option_for_asset_finance_home_page(String header) {
		String Actual = SeleniumDriver.GetElementText(AssetFinanceActions.getPagetitle());    
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	@Then("I should see the {string} as the header for the Masthead black box on Asset Finance page")
	public void i_should_see_the_header_for_masthead_black_box_on_asset_Finance_page(String header) {
		String Actual = SeleniumDriver.GetElementText(AssetFinanceActions.getBlackBoxHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on the {string} link present on the Asset Finance page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_Blackbox_option_link_present_on_the_asset_finance_page(String header, String title) {
		String Actual = AssetFinanceActions.getBalckboxheader(header);
		String Expected = title;
		assertTrue(Actual.contains(Expected));
	}
	
	@Then("I should see the {string} as USP sub header on the Asset Finance Page")
	public void i_should_see_the_sub_header_on_the_asset_finance_page(String header) {
		String Actual = AssetFinanceActions.getUSPSubheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on the {string} card and redirected to {string}")
	public void i_should_be_able_to_click_on_the_cards_and_redirected_to_pagetitle(String header, String title) {
		String Actual = AssetFinanceActions.getCardsPageTile(header);
		String Expected = title;
		assertTrue(Actual.contains(Expected));
		
	}
	
	@And("I should see the {string} present on the page")
	public void i_should_see_the_CTABanner_present_on_the_page(String CTABanner) {
		String Actual = AssetFinanceActions.getCTABannerTitle();
		String Expected = CTABanner;
		assertEquals(Actual, Expected);
	}
	
	@And("I click and redirected to the page")
	public void i_click_and_redirected_to_the_page() {
		String Actual = AssetFinanceActions.getCTABannerPageTitle();
		String Expected = "Asset Finance";
		assertEquals(Actual, Expected);
	}
	
}
