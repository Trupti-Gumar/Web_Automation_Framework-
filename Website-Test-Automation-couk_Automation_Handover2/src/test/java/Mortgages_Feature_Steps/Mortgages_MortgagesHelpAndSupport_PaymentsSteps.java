package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_MortgagesHelpAndSupport_PaymentsActions;
import utils.SeleniumDriver;

public class Mortgages_MortgagesHelpAndSupport_PaymentsSteps {

	Mortgages_MortgagesHelpAndSupport_PaymentsActions PaymentActions = new Mortgages_MortgagesHelpAndSupport_PaymentsActions();
	
	@Given("Aldermore home dispalyed")
	public void Aldermore_home_page()
	{
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());
		try {
		boolean Cookies = SeleniumDriver.isElementPresent(PaymentActions.OneTrustCookies());
		if(Cookies = true) {
			
			SeleniumDriver.waitForElementClickable(PaymentActions.OneTrustCookies());
			SeleniumDriver.clickElement(PaymentActions.OneTrustCookies(), "Accept All Cookies");

		}
		}
		catch(Exception e)
		{
			
		}	
	}
	@Then("I should see the {string} CTA button")
	public void i_should_see_the_cardheader_CTA_button(String header) {
		String Actual = PaymentActions.getCardHeaderTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I click on the button")
	public void i_click_on_the_button() {
		PaymentActions.ClickCardCTAbutton();
	}
	
	@Then("I should be naviagated to respective {string} page")
	public void i_should_be_navigated_to_respective_page(String header) {
		String Actual = PaymentActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual , Expected);
	}
	
	@Then("I navigate to Payments page")
	public void i_navigate_to_payment_page() {
		PaymentActions.ClickCardCTAbutton();
	}
	
	@Then("I should see {string} on the page")
	public void i_should_see_navigationBar_on_the_page(String header) {
		String Actual = PaymentActions.getNavigationBarTitles(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} header on the page")
	public void i_should_see_the_ImageSection_header_on_the_page(String header) {
		String Actual = PaymentActions.getImageSectionHeader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I verify the {string} on the page")
	public void i_verify_the_header_on_the_page(String header) {
		String Actual = PaymentActions.getTheSubHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I clicked {string}")
	public void i_clicked(String link)
	{
		PaymentActions.clickLink(link);
	}
	
	@And("I should be redirected to respective {string} page")
	public void i_should_be_redirected_to_respective_page(String header) {
	   String Actual = PaymentActions.getLinkPageTitle(header);
	   String expected = header;
	   assertEquals(Actual, expected);
	}
	
@And("I should see the Payments FAQs header {string} on page")
public void i_should_see_the_payment_FAQs_header_on_page(String header) {
	String Actual = PaymentActions.getFAQsheader();
	String Expected = header;
	assertEquals(Actual, Expected);
   }

@And("I should see the more card header {string} on Payments FAQs section")
public void i_should_see_the_more_card_header_on_Payment_FAQs(String header) {
	String Actual = PaymentActions.getMoreCardHeader();
	String Expected = header;
	assertEquals(Actual, Expected);
}

@And("I click on FAQs CTA button and should be redirected to {string} page")
public void i_should_click_on_FAQs_CTA_Button_and_should_be_redirected_to_page(String header) {
	PaymentActions.ClickOnFAQsLink();
	String Actual = PaymentActions.getPageTitleFAQs();
	String Expected = header;
	assertEquals(Actual, Expected);
}
}
