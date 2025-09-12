package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinance_BereavementPageActions;
import utils.SeleniumDriver;

public class BusinessFinance_BereavementPageSteps {

	BusinessFinance_BereavementPageActions BF_BereavementPageActions = new BusinessFinance_BereavementPageActions();

	@When("I click on the Bereavement Guide option")
	public void i_click_on_the_bereavement_guide_option() {

		SeleniumDriver.clickOnElement(BF_BereavementPageActions.BereavementGuideLink());
	}

	@Then("I should be naviagated to Bereavement Guide page")
	public void i_should_be_naviagated_to_bereavement_guide_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Bereavement Guide | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} on Bereavement Guide page header")
	public void i_should_see_on_bereavement_guide_page_header(String header) {

		String Actual = SeleniumDriver.GetElementText(BF_BereavementPageActions.MastheadHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} textblock on the Bereavement Guide page")
	public void i_should_see_textblock_on_the_bereavement_guide_page(String header) {

		String Actual = BF_BereavementPageActions.getTextBlockHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);

	}

	@Then("I should see {string} as accordian header on the Bereavement Guide page")
	public void i_should_see_as_accordian_header_on_the_bereavement_guide_page(String header) {

		String Actual = SeleniumDriver.GetElementText(BF_BereavementPageActions.AccordianHeader());
		String Expected = header;
		assertEquals(Actual, Expected);

	}

	@Then("I should be able to expand accordian links")
	public void i_should_be_able_to_expand_accordian_links() {

		SeleniumDriver.clickOnElement(BF_BereavementPageActions.AccordianLink());

		boolean Actual = SeleniumDriver.isElementPresent(BF_BereavementPageActions.AccordianText());
		boolean Expected = true;
		assertEquals(Actual, Expected);

	}
}
