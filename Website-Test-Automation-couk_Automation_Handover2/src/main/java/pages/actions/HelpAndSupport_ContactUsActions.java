package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.HelpAndSupport_ContactUsLocators;
import utils.SeleniumDriver;

public class HelpAndSupport_ContactUsActions {

	HelpAndSupport_ContactUsLocators helpAndSupport_ContactUsLocators = null;

	public HelpAndSupport_ContactUsActions() {

		this.helpAndSupport_ContactUsLocators = new HelpAndSupport_ContactUsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), helpAndSupport_ContactUsLocators);
	}

	public WebElement SavingsLink() {

		return helpAndSupport_ContactUsLocators.SavingsLink;
	}

	public WebElement ContactUSLink() {

		return helpAndSupport_ContactUsLocators.ContactUSLink;
	}

	public WebElement AlertComponent() {

		return helpAndSupport_ContactUsLocators.AlertComponent;
	}

	public WebElement AlertExpandCollapseButton() {

		return helpAndSupport_ContactUsLocators.AlertExpandCollapseButton;
	}

	public WebElement MastheadBackLink() {

		return helpAndSupport_ContactUsLocators.MastheadBackLink;
	}

	public WebElement MastheadHeader() {

		return helpAndSupport_ContactUsLocators.MastheadHeader;
	}

	public WebElement EmailUSContactCard() {

		return helpAndSupport_ContactUsLocators.EmailUSContactCard;
	}

	public WebElement MessageUSContactCard() {

		return helpAndSupport_ContactUsLocators.MessageUSContactCard;
	}

	public WebElement WriteToUSContactCard() {

		return helpAndSupport_ContactUsLocators.WriteToUSContactCard;
	}

	public WebElement CallUSContactCard() {

		return helpAndSupport_ContactUsLocators.CallUSContactCard;
	}
	
	public WebElement PersonalsavingsLink() {

		return helpAndSupport_ContactUsLocators.PersonalsavingsLink;
	}

	public String getConatctCardHeaders(String header) {

		switch (header) {

		case "Email us":

			return SeleniumDriver.GetElementText(EmailUSContactCard());

		case "Message us":

			return SeleniumDriver.GetElementText(MessageUSContactCard());

		case "Write to us":

			return SeleniumDriver.GetElementText(WriteToUSContactCard());

		case "Call us":

			return SeleniumDriver.GetElementText(CallUSContactCard());

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

}
