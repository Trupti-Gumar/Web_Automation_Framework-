package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_HelpandSupport_MortgagesHelpAndSupportActions;

public class Mortgages_HelpandSupport_MortgagesHelpAndSupportSteps {
	
	Mortgages_HelpandSupport_MortgagesHelpAndSupportActions SupportActions = new Mortgages_HelpandSupport_MortgagesHelpAndSupportActions();
	
	@Then("I see as an option {string}")
	public void i_see_as_an_option(String header) {
		String Actual = SupportActions.getDropDownOption();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I clicked")
	public void i_clicked() {
		SupportActions.clickedTheOption();
	}

	@Then("Redirected {string} page should be displayed")
	public void Redirected_PageTitle_page_should_be_displayed(String header) {
		String Actual = SupportActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
    @Then("I navigate to Mortgages help and support page")
    public void i_navigate_to_mortgages_help_and_support_page() {
    	SupportActions.navigateToMortgagesHelpAndSupport();
    }


    @And("I see {string} present on the page")
    public void i_see_PageTitle_present_on_the_page(String header) {
    	String Actual = SupportActions.getCardHeaderTitle(header);
    	String Expected = header;
    	assertEquals(Actual, Expected);
    }
    
    @Then("I see the {string} present on the page")
    public void i_see_the_Links_present_on_the_page(String header) {
    	String Actual = SupportActions.getLinksfromthepage(header);
    	String Expected = header;
    	assertEquals(Actual, Expected);
    }

    @Then("I should see the {string}	header present on the page")
    public void i_should_see_the_header_present_on_the_page(String header) {
    	String Actual = SupportActions.getImagSectionheader(header);
    	String Expected = header;
    	assertEquals(Actual, Expected);
    }
    
    @Then("I clicked on CTA button present on Card Header and redirected to {string}")
    public void i_clicked_on_CTA_button_present_on_card_header_and_redirected_to_PageTitle(String header) {
    	SupportActions.handleTheCookies();
    	SupportActions.ClickedonCardCTAButton();
    	String Actual = SupportActions.getCardPageTitle();
    	String Expected = header;
    	assertEquals(Actual, Expected);
    	
    }
    
    @Then("I click on {string} present on the Image Section")
    public void i_click_on_CTAButton_present_on_the_ImageSection(String header) {
    	SupportActions.ClickedOnCTAButton(header);
    }
    
    @And("I should redirected to next {string}")
    public void i_should_redirected_to_next_page(String header) {
    	SupportActions.handleTheCookies();
    	String Actual = SupportActions.getImageSectionCTAPageTitle(header);
    	String Expected = header;
    	assertEquals(Actual, Expected);
    }

}
