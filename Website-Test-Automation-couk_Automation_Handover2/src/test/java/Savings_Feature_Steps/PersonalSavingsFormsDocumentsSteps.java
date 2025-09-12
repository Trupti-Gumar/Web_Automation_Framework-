package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.PersonalSavingsFormsDocumentsActions;
import utils.SeleniumDriver;

public class PersonalSavingsFormsDocumentsSteps {

	PersonalSavingsFormsDocumentsActions personalSavingsFormsDocumentsActions = new PersonalSavingsFormsDocumentsActions();

	@Then("I shoud see Important personal savings forms and documents card")
	public void view_card() {

		boolean Actual = SeleniumDriver.isElementPresent(personalSavingsFormsDocumentsActions.cardLink());
		boolean Expected = true;

		assertEquals(Actual, Expected);
	}

	@When("I click on this card")
	public void clickOnCard() {

		SeleniumDriver.clickOnElement(personalSavingsFormsDocumentsActions.cardLink());
	}

	@Then("it should redirect me to Personal savings forms and documents page")
	public void go_to_card_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Forms & Documents - Personal Savings | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Important Personal Savings Forms and documents page")
	public void verify_header(String header) {

		String Actual = SeleniumDriver.GetElementText(personalSavingsFormsDocumentsActions.mastheadHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@And("I should be able to click on back link and should be redirected to Personal savings help and support page")
	public void verify_backlink() {

		SeleniumDriver.waitForElementClickable(personalSavingsFormsDocumentsActions.backLink());
		String Actual = SeleniumDriver.getPageTitle(personalSavingsFormsDocumentsActions.backLink());
		String Expected = "Help & Support for Personal Savings Customers | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the documnet table on the page")
	public void verify_doctable() {

		boolean Actual = SeleniumDriver.isElementPresent(personalSavingsFormsDocumentsActions.documentTableHeader());
		boolean Expected = true;

		assertEquals(Actual, Expected);
		
	}

	@And("I should be able to download any of the document from the table")
	public void verify_download_doc() {

		SeleniumDriver.getPageTitle(personalSavingsFormsDocumentsActions.downloadDocumentLink());
		SeleniumDriver.waitForPageToLoad();
		//SeleniumDriver.getDriver().navigate().back();
	}

	@And("I should be able to sort the table based on the columns")
	public void verify_sorting_table() {

		SeleniumDriver.clickOnElement(personalSavingsFormsDocumentsActions.documentTableHeader());
		
	}

}
