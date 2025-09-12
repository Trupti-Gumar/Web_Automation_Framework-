package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Business_Finance_PropertyDevelopementFinanceFAQActions;
import utils.SeleniumDriver;

public class Business_Finance_PropertyDevelopementFinanceFAQSteps {
	
	Business_Finance_PropertyDevelopementFinanceFAQActions BF_PropertyDevelopementFinanceFAQActions = new Business_Finance_PropertyDevelopementFinanceFAQActions();

	@When("I click on the Property development finance FAQ option")
	public void i_click_on_the_property_development_finance_faq_option() {
	   
		SeleniumDriver.clickOnElement(BF_PropertyDevelopementFinanceFAQActions.PropertydevelopmentfinanceFAQsLink());
	}

	@Then("I should be naviagated to Property development finance FAQ page")
	public void i_should_be_naviagated_to_property_development_finance_faq_page() {
	    
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "FAQs: Property Development Finance | Aldermore Bank";
		assertTrue(Actual.contains(Expected),"Invalid page title");
	}

	@Then("I should see the Property development Finance FAQs header {string}  on Property development Finance FAQ page")
	public void i_should_see_the_property_development_finance_fa_qs_header_on_property_development_finance_faq_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(BF_PropertyDevelopementFinanceFAQActions.MastheadHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}

	@Then("I should see the Property development Finance FAQs Accordians on the Property development Finance FAQ page")
	public void i_should_see_the_property_development_finance_fa_qs_accordians_on_the_property_development_finance_faq_page() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(BF_PropertyDevelopementFinanceFAQActions.AccordianLink());
		assertTrue(Actual);
	}

	@Then("I should be able to click on Property development Finance CTA button and should be directed to {string} page")
	public void i_should_be_able_to_click_on_property_development_finance_cta_button_and_should_be_directed_to_page(String title) {
	    
		String Actual = SeleniumDriver.getPageTitle(BF_PropertyDevelopementFinanceFAQActions.backlink());
		String Expected = title;
		assertTrue(Actual.contains(Expected),"Invalid page name");
		
		
	}
}
