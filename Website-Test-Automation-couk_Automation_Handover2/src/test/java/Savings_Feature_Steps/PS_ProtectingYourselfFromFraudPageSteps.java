package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.ProtectingYourselfFromFraudPageActions;
import utils.SeleniumDriver;

public class PS_ProtectingYourselfFromFraudPageSteps {

	ProtectingYourselfFromFraudPageActions protectingYourselfFromFraudPageActions = new ProtectingYourselfFromFraudPageActions();

	@Then("I shoud see Protecting yourself from fraud card")
	public void i_shoud_see_protecting_yourself_from_fraud_card() {

		boolean Actual = SeleniumDriver
				.isElementPresent(protectingYourselfFromFraudPageActions.ProtectingYourselfFromFraudLink());
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}

	@When("I click on Protecting yourself from frau card")
	public void i_click_on_protecting_yourself_from_frau_card() {

		SeleniumDriver.clickOnElement(protectingYourselfFromFraudPageActions.ProtectingYourselfFromFraudLink());
	}

	@Then("it should redirect me to Protecting yourself from fraud page")
	public void it_should_redirect_me_to_protecting_yourself_from_fraud_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Online Security and Fraud Protection | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Important Protecting yourself from fraud page")
	public void i_should_see_the_as_the_header_for_the_important_protecting_yourself_from_fraud_page(String header) {

		String Actual = SeleniumDriver.GetElementText(protectingYourselfFromFraudPageActions.MastheadHeader());
		String Expected = header;
		assertEquals(Actual, Expected);

	}

	@Then("I should the {string} Text area present on the page")
	public void i_should_the_text_area_present_on_the_page(String header) {

		String Actual = protectingYourselfFromFraudPageActions.getTextAreaBlockHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} accordain on the page")
	public void i_should_see_the_accordain_on_the_page(String header) {

		String Actual = SeleniumDriver.GetElementText(protectingYourselfFromFraudPageActions.AccordianHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to expand the accordians upon clicking on it")
	public void i_should_be_able_to_expand_the_accordians_upon_clicking_on_it() {

		SeleniumDriver.clickOnElement(protectingYourselfFromFraudPageActions.AccordianLink());
		boolean Actual = SeleniumDriver.isElementPresent(protectingYourselfFromFraudPageActions.AccordianTextArea());
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}

}
