package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.HelpAndSupport_BankOfEnglandBaseRateLocators;
import utils.SeleniumDriver;

public class HelpAndSupport_BankOfEnglandBaseRateActions {

	HelpAndSupport_BankOfEnglandBaseRateLocators helpAndSupport_BankOfEnglandBaseRateLocators = null;

	public HelpAndSupport_BankOfEnglandBaseRateActions() {

		this.helpAndSupport_BankOfEnglandBaseRateLocators = new HelpAndSupport_BankOfEnglandBaseRateLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), helpAndSupport_BankOfEnglandBaseRateLocators);
	}

	public WebElement SavingsLink() {

		return helpAndSupport_BankOfEnglandBaseRateLocators.SavingsLink;
	}
	
	public WebElement helpAndSupportLink() {

		return helpAndSupport_BankOfEnglandBaseRateLocators.helpAndSupportLink;
	}

	public WebElement BankOFEnglandBaseRate() {

		return helpAndSupport_BankOfEnglandBaseRateLocators.BankOFEnglandBaseRate;
	}

	public WebElement MastheadHeader() {

		return helpAndSupport_BankOfEnglandBaseRateLocators.MastheadHeader;
	}

	// Accordian

	public WebElement AccordianHeader() {

		return helpAndSupport_BankOfEnglandBaseRateLocators.AccordianHeader;
	}

	public WebElement AccordianLink() {

		return helpAndSupport_BankOfEnglandBaseRateLocators.AccordianLink;
	}

	public WebElement AccordianLinkTextBlock() {

		return helpAndSupport_BankOfEnglandBaseRateLocators.AccordianLinkTextBlock;
	}

	// Cards

	public String getCradsHeader(String header) {

		switch (header) {

		case "Personal savings help and support":

			return helpAndSupport_BankOfEnglandBaseRateLocators.PersonalsavingshelpandsupportCardHeader.getText();

		case "Mortgages help and support":

			return helpAndSupport_BankOfEnglandBaseRateLocators.MortgageshelpandsupportCardHeader.getText();

		default:

			throw new IllegalArgumentException("Invalid value: " + header);
		}
	}

	public String getCardLinkPages(String title) {

		switch (title) {

		case "Personal savings help and support":

			return SeleniumDriver
					.getPageTitle(helpAndSupport_BankOfEnglandBaseRateLocators.PersonalsavingshelpandsupportCardLink);

		case "Mortgages help and support":

			return SeleniumDriver
					.getPageTitle(helpAndSupport_BankOfEnglandBaseRateLocators.MortgageshelpandsupportCardLink);

		default:

			throw new IllegalArgumentException("Invalid value: " + title);
		}

	}

}
