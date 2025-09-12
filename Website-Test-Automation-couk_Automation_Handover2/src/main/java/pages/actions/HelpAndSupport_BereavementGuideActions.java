package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.HelpAndSupport_BereavementGuideLocators;
import utils.SeleniumDriver;

public class HelpAndSupport_BereavementGuideActions {

	HelpAndSupport_BereavementGuideLocators helpAndSupport_BereavementGuideLocators = null;

	public HelpAndSupport_BereavementGuideActions() {

		this.helpAndSupport_BereavementGuideLocators = new HelpAndSupport_BereavementGuideLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), helpAndSupport_BereavementGuideLocators);
	}

	public WebElement SavingsLink() {

		return helpAndSupport_BereavementGuideLocators.SavingsLink;
	}

	public WebElement BereavementLink() {

		return helpAndSupport_BereavementGuideLocators.BereavementLink;
	}

	// Masthead small

	public WebElement MastheadHeader() {

		return helpAndSupport_BereavementGuideLocators.MastheadHeader;
	}

	// Text Blocks

	public String getTextBlockHeaders(String header) {

		switch (header) {

		case "What do I need to do?":

			return helpAndSupport_BereavementGuideLocators.TextBlock1.getText();

		case "Terms you'll hear":

			return helpAndSupport_BereavementGuideLocators.TextBlock2.getText();

		case "If you need help with funeral expenses:":

			return helpAndSupport_BereavementGuideLocators.TextBlock3.getText();

		case "If you need help paying inheritance tax:":

			return helpAndSupport_BereavementGuideLocators.TextBlock4.getText();

		case "We're here to help":

			return helpAndSupport_BereavementGuideLocators.TextBlock5.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	// Accordian

	public WebElement Accordianheader() {

		return helpAndSupport_BereavementGuideLocators.Accordianheader;
	}

	public WebElement AccordianLink() {

		return helpAndSupport_BereavementGuideLocators.AccordianLink;
	}

	public WebElement AccordianTextBlock() {

		return helpAndSupport_BereavementGuideLocators.AccordianTextBlock;
	}

	// Morecard

	public WebElement MorecardTitle() {

		return helpAndSupport_BereavementGuideLocators.MorecardTitle;
	}

	public WebElement MorecardLink() {

		return helpAndSupport_BereavementGuideLocators.MorecardLink;
	}

	// Cards

	public String getCardHeaders(String header) {

		switch (header) {

		case "Personal savings help and support":

			return helpAndSupport_BereavementGuideLocators.PersonalSavingsCardHeader.getText();

		case "Contact us":

			return helpAndSupport_BereavementGuideLocators.ContactUsCardHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public String getCardLinkPageTitle(String pageTitle) {

		switch (pageTitle) {

		case "Personal savings help and support":

			return SeleniumDriver.getPageTitle(helpAndSupport_BereavementGuideLocators.PersonalSavingsCardLink);

		case "Contact us":

			return SeleniumDriver.getPageTitle(helpAndSupport_BereavementGuideLocators.ContactUsCardLink);

		default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}

}
