package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.SavingsAccountActions;
import utils.SeleniumDriver;

public class SavingsAccountSteps {

	SavingsAccountActions savingsAccountActions = new SavingsAccountActions();

	@Given("I am on a Aldermore home page")
	public void i_am_on_aldermore_home_page() {
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(savingsAccountActions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(savingsAccountActions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(savingsAccountActions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("I navigate to Savings Account page")
	public void i_navigate_to_savings_account_page() {

		SeleniumDriver.clickOnElement(savingsAccountActions.SavingsLink());
		SeleniumDriver.clickOnElement(savingsAccountActions.SavingsAccountLink());
	}

	@Then("I should see the {string} as the header for the Savings Account page")
	public void i_should_see_the_as_the_header_for_the_savings_account_page(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.SavingsAccPageHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the FSCS logo on the Savings Account page")
	public void i_should_see_the_fscs_logo_on_the_savings_account_page() {

		boolean Actual = SeleniumDriver.isElementPresent(savingsAccountActions.FSCSLogo());
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as the header for the Easy Access Account card")
	public void i_should_see_as_the_header_for_the_easy_access_account_card(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.EasyAccessAccHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the card and redirected to Easy Access Account page")
	public void i_should_be_able_to_click_on_the_card_and_redirected_to_easy_access_account_page() {

		String Actual = SeleniumDriver.getPageTitle(savingsAccountActions.EasyAccessAcclink());
		String Expected = "Personal Easy Access Savings Accounts | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as the header for the Fixed Rate Account card")
	public void i_should_see_as_the_header_for_the_fixed_rate_account_card(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.FixedrateAccountHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the card and redirected to Fixed Rate Account page")
	public void i_should_be_able_to_click_on_the_card_and_redirected_to_fixed_rate_account_page() {

		String Actual = SeleniumDriver.getPageTitle(savingsAccountActions.FixedrateAccountLink());
		String Expected = "All Personal Fixed Rate Savings Accounts | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as the header for the Notice Account card")
	public void i_should_see_as_the_header_for_the_notice_account_card(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.NoticeAccHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the card and redirected to Notice savings Account page")
	public void i_should_be_able_to_click_on_the_card_and_redirected_to_notice_savings_account_page() {

		String Actual = SeleniumDriver.getPageTitle(savingsAccountActions.NoticeAccLink());
		String Expected = "All Notice Savings Accounts | Aldermore Bank";
		assertEquals(Actual, Expected);

	}

	@Then("I should see {string} as the header for the Cash ISAs card")
	public void i_should_see_as_the_header_for_the_cash_is_as_card(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.CashISAHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the card and redirected to Cash ISAs page")
	public void i_should_be_able_to_click_on_the_card_and_redirected_to_cash_is_as_page() {

		String Actual = SeleniumDriver.getPageTitle(savingsAccountActions.CashISALink());
		String Expected = "All Cash ISA Savings Accounts | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as the header for the Easy access business savings card")
	public void i_should_see_as_the_header_for_the_easy_access_business_savings_card(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.EasyAccessBusinessSavingsHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the card and redirected to Easy access business savings page")
	public void i_should_be_able_to_click_on_the_card_and_redirected_to_easy_access_business_savings_page() {

		String Actual = SeleniumDriver.getPageTitle(savingsAccountActions.EasyAccessBusinessSavingsLink());
		String Expected = "Easy Access Business Savings Accounts | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as the header for the Fixed rate business savings card")
	public void i_should_see_as_the_header_for_the_fixed_rate_business_savings_card(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.FixedrateBusinessSavingsHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the card and redirected to Fixed rate business savings page")
	public void i_should_be_able_to_click_on_the_card_and_redirected_to_fixed_rate_business_savings_page() {

		String Actual = SeleniumDriver.getPageTitle(savingsAccountActions.FixedrateBusinessSavingsLink());
		String Expected = "All Business Fixed Rate Savings Accounts | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as the header for the Corporate deposits card")
	public void i_should_see_as_the_header_for_the_corporate_deposits_card(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.CorporateDepositsHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the card and redirected to Corporate deposits page")
	public void i_should_be_able_to_click_on_the_card_and_redirected_to_corporate_deposits_page() {

		String Actual = SeleniumDriver.getPageTitle(savingsAccountActions.CorporateDepositsLink());
		String Expected = "Bespoke Corporate Deposit Solutions | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@When("I should see the {string} as the header for the image copy section on the Savings Account page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_savings_account_page(String header) {

		String Actual = SeleniumDriver.GetElementText(savingsAccountActions.ImagecopyHeader());
		String Expected = header;
		assertEquals(Actual, Expected);

	}
}
