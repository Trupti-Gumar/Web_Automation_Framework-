package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessSavingsAccountPageLocators;
import utils.SeleniumDriver;

public class BusinessSavingsAccountActions {

	BusinessSavingsAccountPageLocators businessSavingsAccountPageLocators = null;

	public BusinessSavingsAccountActions() {

		this.businessSavingsAccountPageLocators = new BusinessSavingsAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), businessSavingsAccountPageLocators);

	}

	public void navigateToBusinessSavingsAccountPage() {
		businessSavingsAccountPageLocators.savingsNavLink.click();
		businessSavingsAccountPageLocators.BusinessSavingsAccountsLink.click();
	}

	// Masthead

	public String getBSAHeader() {
		return businessSavingsAccountPageLocators.BSAHeader.getText();
	}

	public boolean isUSPSectionPresent() {
		return businessSavingsAccountPageLocators.USPSection.isDisplayed();
	}

	// Product Cards

	public void moveToProductCards() {
		SeleniumDriver.moveToElement(businessSavingsAccountPageLocators.OneYearFixedRateSavingsAccountCTALink);
	}

	public String getOneYearFixedRateSavingsAccountHeader() {
		return businessSavingsAccountPageLocators.OneYearFixedRateSavingsAccountHeader.getText();
	}

	// FAQ Section

	public String getFAQHeader() {
		return businessSavingsAccountPageLocators.FAQHeader.getText();
	}

	public void moveToFAQ() {
		SeleniumDriver.moveToElement(businessSavingsAccountPageLocators.FAQHeader);
	}

	public WebElement FAQAccordian() {

		return businessSavingsAccountPageLocators.FAQAccordian;
	}

	public WebElement FAQAccordianTextBlock() {

		return businessSavingsAccountPageLocators.FAQAccordianTextBlock;
	}

	// Image Copy Section

	public WebElement imageCopySectionHeader1() {

		return businessSavingsAccountPageLocators.imageCopySectionHeader1;
	}

	public WebElement imageCopySectionHeader2() {

		return businessSavingsAccountPageLocators.imageCopySectionHeader2;
	}

	public String getImageCopyHeader(String header) {

		switch (header) {

		case "Keeping your money safe":

			return businessSavingsAccountPageLocators.imageCopySectionHeader1.getText();

		case "Celebrating small businesses":

			return businessSavingsAccountPageLocators.imageCopySectionHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

}
