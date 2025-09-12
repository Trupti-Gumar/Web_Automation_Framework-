package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesActions;

public class Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesSteps {

	Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesActions
	FSABActions = new Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesActions();
	
	@Then("{string} CTA button displayed")
	public void CTAcardButton_displayed(String header) {
		String Actual = FSABActions.getCardTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("clicked on CTA button")
	public void Clicked_on_CTA_button() {
		FSABActions.clickOnCard();
	}
	
	@Then("Naviagated to respective {string} page")
	public void Naviagated_to_respective_pageTitle(String header) {
		String Actual = FSABActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Fees, statements and balances page")
	public void i_navigate_to_Fees_statement_and_balances_page() {
		FSABActions.clickOnCard();
	}
	
	@And("{string} present on the page to be validated")
	public void i_should_see_USPSection_present_on_the_page(String header) {
		String Actual = FSABActions.getUSPsectionOptons(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I see the {string} present on the subheader")
	public void i_see_the_link_present_on_the_subheader(String link) {
		FSABActions.ClickedOnLink(link);
	}
	
	@Then ("i redirected on {string} when clicked to links")
	public void i_redirected_on_page_when_clicked_to_links(String PageTitle) {
	    String Actual = FSABActions.getLinkPageTitle(PageTitle);
	    String Expected = PageTitle;
	    assertEquals(Actual, Expected);
		
	}
	
	@And("I see the {string} header on the page")
	public void i_see_the_subheader_on_the_page(String header) {
		String Actual = FSABActions.getQuicklinkheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I clicked the {string}")
	public void i_clicked_the_link(String link) 
	{
		FSABActions.clickOnTheLink(link);
	}
	
	@Then("redirected to {string}")
	public void redirected_to_PageTitle(String Pagetitle) {
		String Actual = FSABActions.getPagetitle(Pagetitle);
		String Expected = Pagetitle;
		assertEquals(Actual, Expected);
	}
}
