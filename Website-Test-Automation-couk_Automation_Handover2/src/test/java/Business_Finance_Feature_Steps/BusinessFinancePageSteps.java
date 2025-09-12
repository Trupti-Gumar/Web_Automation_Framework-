package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinancePageActions;
import utils.SeleniumDriver;

public class BusinessFinancePageSteps {

	BusinessFinancePageActions businessFinancePageActions = new BusinessFinancePageActions();
	
	@Given("I am landed on Aldermore page")
	public void i_am_on_aldermore_page() {
		
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(businessFinancePageActions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(businessFinancePageActions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(businessFinancePageActions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	@When("I click on the Business finance option")
	public void i_click_on_the_business_finance_dropdown_option() {

		SeleniumDriver.clickElementWithJavaScript(businessFinancePageActions.BusinessFinanceNavigationLink());
		SeleniumDriver.clickElementWithJavaScript(businessFinancePageActions.BusinessFinanceLink());
	}

	@Then("I should see the {string} as header")
	public void i_should_see_the_as_options(String header) {

		String Actual = SeleniumDriver.GetElementText(businessFinancePageActions.BusinessFinanceHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String header) {

		businessFinancePageActions.clickOnBusinessFinanceOptionsLinks(header);

	}

	@Then("I should be redirected to the {string}")
	public void i_should_be_redirected_to_the(String header) {

		String Actual = businessFinancePageActions.getBusinessFinanceOptionsPageTitle(header);
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Invalid page");
	}

	@Then("I should see the {string} present under Business finance option")
	public void i_should_see_the_present_under_business_finance_option(String header) {

		String Actual = businessFinancePageActions.verifyBusinessFinanceSubOptions(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} present on Business finance page")
	public void i_should_see_the_present_under_help_and_support_options(String header) {

		String Actual = businessFinancePageActions.verifyHelpAndSupportSubOptions(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
}
