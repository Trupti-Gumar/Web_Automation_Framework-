package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.HelpAndSupport_FSCS_ProtectionLocators;
import utils.SeleniumDriver;

public class HelpAndSupport_FSCS_ProtectionActions {

	HelpAndSupport_FSCS_ProtectionLocators helpAndSupport_FSCS_ProtectionLocators = null;

	public HelpAndSupport_FSCS_ProtectionActions() {

		this.helpAndSupport_FSCS_ProtectionLocators = new HelpAndSupport_FSCS_ProtectionLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), helpAndSupport_FSCS_ProtectionLocators);
	}

	public WebElement SavingsLink() {

		return helpAndSupport_FSCS_ProtectionLocators.SavingsLink;
	}

	public WebElement FSCSProtectionLink() {

		return helpAndSupport_FSCS_ProtectionLocators.FSCSProtectionLink;
	}

	// Masthead

	public WebElement MastheadHeader() {

		return helpAndSupport_FSCS_ProtectionLocators.MastheadHeader;
	}

	// Cards

	public String getCardHeaders(String header) {

		switch (header) {

		case "Personal savings help":

			return helpAndSupport_FSCS_ProtectionLocators.PersonalSavingsHelpCardHeader.getText();

		case "Personal savings log in":

			return helpAndSupport_FSCS_ProtectionLocators.PersonalSavingsLoginCardHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public String getCardLinkPageTitle(String pageTitle) {

		switch (pageTitle) {

		case "Personal savings help":

			return SeleniumDriver.getPageTitle(helpAndSupport_FSCS_ProtectionLocators.PersonalSavingsHelpCardLink);

		case "Personal savings log in":

			return SeleniumDriver.getPageTitle(helpAndSupport_FSCS_ProtectionLocators.PersonalSavingsLoginCardLink);

		default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}

	// Image Copy Section

	public WebElement ImageCopySectionHeader() {

		return helpAndSupport_FSCS_ProtectionLocators.ImageCopySectionHeader;
	}

	public WebElement TakeFiveWebsiteLink() {

		return helpAndSupport_FSCS_ProtectionLocators.TakeFiveWebsiteLink;
	}

}
