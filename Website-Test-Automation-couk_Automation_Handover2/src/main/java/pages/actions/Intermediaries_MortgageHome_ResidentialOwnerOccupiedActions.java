package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_ResidentialOwnerOccupiedLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ResidentialOwnerOccupiedActions {

	Intermediaries_MortgageHome_ResidentialOwnerOccupiedLocators ResidentialOwnerOccupiedLocators = null;

	public Intermediaries_MortgageHome_ResidentialOwnerOccupiedActions() {

		this.ResidentialOwnerOccupiedLocators = new Intermediaries_MortgageHome_ResidentialOwnerOccupiedLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ResidentialOwnerOccupiedLocators);
	}

	public WebElement ResidentialowneroccupiedLink() {

		return ResidentialOwnerOccupiedLocators.ResidentialowneroccupiedLink;
	}

	public WebElement MastheadHeader() {

		return ResidentialOwnerOccupiedLocators.MastheadHeader;
	}

	public WebElement MastheadBlackboxHeader() {

		return ResidentialOwnerOccupiedLocators.MastheadBlackboxHeader;
	}

	public WebElement CTABanner() {

		return ResidentialOwnerOccupiedLocators.CTABanner;
	}

	public String getMastheadBlackboxLinkPage(String header) {

		switch (header) {

		case "Documents":
			return SeleniumDriver.getPageTitle(ResidentialOwnerOccupiedLocators.MastheadBlackboxLink1);

		case "Login to submit business":
			return SeleniumDriver.getPageTitle(ResidentialOwnerOccupiedLocators.MastheadBlackboxLink2);

		case "Calculators":
			return SeleniumDriver.getPageTitle(ResidentialOwnerOccupiedLocators.MastheadBlackboxLink3);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getUSPHeader(String header) {

		switch (header) {

		case "Human underwriting":
			return ResidentialOwnerOccupiedLocators.USPHeader1.getText();

		case "Self-employed specialists":
			return ResidentialOwnerOccupiedLocators.USPHeader2.getText();

		case "Adverse credit":
			return ResidentialOwnerOccupiedLocators.USPHeader3.getText();

		case "High LTV available":
			return ResidentialOwnerOccupiedLocators.USPHeader4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return ResidentialOwnerOccupiedLocators.ImageCopyHeader1.getText();

	//	case "Second":
	//		return ResidentialOwnerOccupiedLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}

	public String getUsfulLinkPageTitle(String header) {

		switch (header) {

		case "View our latest service levels":
			return SeleniumDriver.getPageTitle(ResidentialOwnerOccupiedLocators.UsefulLink1);

		case "Our Platinum Broker service proposition":
			return SeleniumDriver.getPageTitle(ResidentialOwnerOccupiedLocators.UsefulLink2);

		case "Residential mortgage documents":
			return SeleniumDriver.getPageTitle(ResidentialOwnerOccupiedLocators.UsefulLink3);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

}
