package steps;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.AldermorePageActions;
import utils.SeleniumDriver;

public class AldermorePageSteps {

	AldermorePageActions aldermorePageActions = new AldermorePageActions();

	@Given("I am on Aldermore page")
	public void i_am_on_aldermore_page() {
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(aldermorePageActions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(aldermorePageActions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(aldermorePageActions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@When("I view the Masthead Homepage section")
	public void i_view_the_masthead_homepage_section() {

	}

	@Then("I should see the {string} as header for the Masthead homepage")
	public void i_should_see_the_as_header_for_the_masthead_homepage(String header) {
		String ActualText = aldermorePageActions.getmastheadHomepageHeaderText();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@And("Description should be displayed on the page")
	public void description_should_be_displayed_on_the_page() {

		boolean actualResult = aldermorePageActions.getmastheadHomepageDescriptionElement().isDisplayed();
		boolean expectedResult = true;
		assertEquals(actualResult, expectedResult, "Element not present on the page");
	}

	@And("Scroll Down button should be displayed on the page")
	public void scroll_down_button_should_be_displayed_on_the_page() {

		boolean actualResult = aldermorePageActions.getmastheadHomepageScrollDownElement().isDisplayed();
		boolean expectedResult = true;
		assertEquals(actualResult, expectedResult, "Element not present on the page");
	}

	@When("I view the Unique Selling Point Section")
	public void i_view_the_unique_selling_point_section() {

	}

	@Then("I Should see the {string} as section header")
	public void i_should_see_the_as_section_header(String header) {
		String ActualText = aldermorePageActions.getuniqueSellingPointHeaderText();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@Then("I should see the {string} as sub header")
	public void i_should_see_the_as_sub_header(String subHeader) {
		String ActualText;
		String Expectedtext;

		switch (subHeader) {
		case "Promoting inclusivity":
			ActualText = aldermorePageActions.getUniqueSellingpointPromotinginclusivitySubHeaderText();
			Expectedtext = subHeader;

			break;
		case "Distinctly human":
			ActualText = aldermorePageActions.getUniqueSellingpointDistinctivelyhumanSubHeaderText();
			Expectedtext = subHeader;
			break;
		case "Enabling ambition":
			ActualText = aldermorePageActions.getUniqueSellingpointEnablingambitionSubHeaderText();
			Expectedtext = subHeader;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + subHeader);
		}
		// aldermorePageActions.moveToButtonElement();
		assertEquals(ActualText, Expectedtext);
	}

	@And("I should see the {string} as description")
	public void i_should_see_the_as_description(String description) {
		/*
		 * String ActualText; String Expectedtext;
		 * 
		 * switch (description) { case "3.00 %": ActualText =
		 * aldermorePageActions.getInterestValueDoublerate1(); Expectedtext =
		 * description;
		 * 
		 * break; case "1.30 %": ActualText =
		 * aldermorePageActions.getInterestValueDoublerate2(); Expectedtext =
		 * description; break; case "£1.50 - No max balance": ActualText =
		 * aldermorePageActions.getMinOpeningBalanceValue2(); Expectedtext =
		 * description; break;
		 * 
		 * default: throw new IllegalArgumentException("Invalid value: " + description);
		 * } //aldermorePageActions.moveToButtonElement(); assertEquals(ActualText,
		 * Expectedtext);
		 */
	}

	@When("I navigate to the Savings block")
	public void i_navigate_to_the_savings_block() {
		aldermorePageActions.moveToSavingsBlock();
	}

	@Then("I should see the Savings Block Header {string} displayed")
	public void i_should_see_the_savings_block_header_displayed(String header) {
		String ActualText = aldermorePageActions.getSavingsBlockHeaderText();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@And("the Savings button {string} should be present")
	public void the_savings_button_should_be_present(String button) {
		String ActualText = aldermorePageActions.getSavingsBlockButtonText();
		String Expectedtext = button;
		assertEquals(ActualText, Expectedtext);
	}

	@When("I click on the Savings button")
	public void i_click_on_the_savings_button() {
		aldermorePageActions.clickOnSavingsBlockButton();
	}

	@Then("I should be redirected to the savings account page")
	public void i_should_be_redirected_to_the_savings_account_page() {
		String ActualTitle = SeleniumDriver.getDriver().getTitle();
		String ExpectedTitle = "Savings Accounts for Individuals & Businesses | Aldermore Bank";
		assertEquals(ActualTitle, ExpectedTitle);
	}

	@When("I navigate to the Mortgages block")
	public void i_navigate_to_the_mortgages_block() {
		aldermorePageActions.moveToMortgageBlock();
	}

	@Then("I should see the Mortgages Block Header {string} displayed")
	public void i_should_see_the_Mortgages_header_displayed(String header) {
		String ActualText = aldermorePageActions.getMortgagesBlockHeaderText();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@And("the Mortgages button {string} should be present")
	public void the_mortgages_button_should_be_present(String button) {
		String ActualText = aldermorePageActions.getMortgagesBlockButtonText();
		String Expectedtext = button;
		assertEquals(ActualText, Expectedtext);
	}

	@When("I click on the Mortgages button")
	public void i_click_on_the_mortgages_button() {
		aldermorePageActions.clickOnMortgagesBlockButton();
	}

	@Then("I should be redirected to the Mortgages page")
	public void i_should_be_redirected_to_the_mortgages_page() {
		String ActualTitle = SeleniumDriver.getDriver().getTitle();
		String ExpectedTitle = "Specialist Mortgage Lender | Aldermore Bank";
		assertEquals(ActualTitle, ExpectedTitle);
	}

	@When("I navigate to the Business finance section")
	public void i_navigate_to_the_business_finance_section() {
		aldermorePageActions.moveToBusinessFinance();
	}

	@Then("I should see the Business finance Header {string} displayed")
	public void i_should_see_the_Business_Finance_header_displayed(String header) {
		String ActualText = aldermorePageActions.getBusinessFinanceHeaderText();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@And("the Business finance button {string} should be present")
	public void the_business_finance_button_should_be_present(String button) {
		String ActualText = aldermorePageActions.getBusinessFinanceButtonText();
		String Expectedtext = button;
		assertEquals(ActualText, Expectedtext);
	}

	@When("I click on the Business finance button")
	public void i_click_on_the_business_finance_button() {
		aldermorePageActions.clickOnBusinessFinanceButton();
	}

	@Then("I should be redirected to the Business finance page")
	public void i_should_be_redirected_to_the_business_finance_page() {
		String ActualTitle = SeleniumDriver.getDriver().getTitle();
		//String expected = "Business Finance | Aldermore Bank";

		String ExpectedTitle = "Business Finance | Aldermore Bank";
		assertEquals(ActualTitle, ExpectedTitle);
	}

	@When("I navigate to the Intermediaries Banner section")
	public void i_navigate_to_the_intermediaries_banner_section() {
		aldermorePageActions.moveToIntermediariesBanner();
	}

	@Then("I should see the Intermediaries Banner Header {string} displayed")
	public void i_should_see_the_intermediaries_Banner_header_displayed(String header) {
		String ActualText = aldermorePageActions.getIntermediariesBannerHeaderText();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@And("the Intermediaries Banner link {string} should be present")
	public void the_intermediaries_banner_link_should_be_present(String button) {
		String ActualText = aldermorePageActions.getIntermediariesBannerLinkText();
		String Expectedtext = button;
		assertEquals(ActualText, Expectedtext);
	}

	@When("I click on the Find out more link")
	public void i_click_on_the_find_out_more_link() {
		aldermorePageActions.clickOnIntermediariesBanner();
	}

	@Then("I should be redirected to the Intermediaries Banner page")
	public void i_should_be_redirected_to_the_Intermediaries_Banner_page() {
		String ActualTitle = SeleniumDriver.getDriver().getTitle();
		String ExpectedTitle = "Intermediaries | Aldermore Bank";
		assertEquals(ActualTitle, ExpectedTitle);
	}

}
