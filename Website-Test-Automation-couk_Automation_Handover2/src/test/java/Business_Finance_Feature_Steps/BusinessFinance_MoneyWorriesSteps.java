package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinance_MoneyWorriesPageActions;
import utils.SeleniumDriver;

public class BusinessFinance_MoneyWorriesSteps {
	
	BusinessFinance_MoneyWorriesPageActions BF_MoneyWorriesPageActions = new BusinessFinance_MoneyWorriesPageActions();

	@When("I click on the Money Worries option")
	public void i_click_on_the_money_worries_option() {
	    
		SeleniumDriver.clickOnElement(BF_MoneyWorriesPageActions.MoneyWorriesLink());
		
	}

	@Then("I should be naviagated to Money Worries page")
	public void i_should_be_naviagated_to_money_worries_page() {
	    
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Money Worries and the Cost of Living Crisis | Aldermore Bank";
		assertTrue(Actual.contains(Expected),"Invalid page title");
	}

	@Then("I should see {string} on Money Worries page header")
	public void i_should_see_on_money_worries_page_header(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(BF_MoneyWorriesPageActions.MastheadHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as a {string} Image copy header on Money Worries page")
	public void i_should_see_the_as_a_image_copy_header_on_money_worries_page(String title, String titleNum) {
	    
		String Actual =BF_MoneyWorriesPageActions.getImageCopyHeader(titleNum) ;
		String Expected = title;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the Find out more on the Bank of England base rate changes image copy link and redirected to the respective page")
	public void i_should_be_able_to_click_on_the_find_out_more_on_the_bank_of_england_base_rate_changes_image_copy_link_and_redirected_to_the_respective_page() {
	    
		String Actual = SeleniumDriver.getPageTitle(BF_MoneyWorriesPageActions.ImageCopyLink3());
		String Expected = "Bank of England Base Rate Changes | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the link on the Being scam savvy image copy link and redirected to the respective page")
	public void i_should_be_able_to_click_on_the_link_on_the_being_scam_savvy_image_copy_link_and_redirected_to_the_respective_page() {
	    
		String Actual = SeleniumDriver.getPageTitle(BF_MoneyWorriesPageActions.ImageCopyLink4());
		String Expected = "Online Security and Fraud Protection | Aldermore Bank";
		assertEquals(Actual, Expected);
	}
}
