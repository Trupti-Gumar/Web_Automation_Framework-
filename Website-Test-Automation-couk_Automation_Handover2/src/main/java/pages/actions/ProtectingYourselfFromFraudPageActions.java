package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.ProtectingYourselfFromFraudPageLocators;
import utils.SeleniumDriver;

public class ProtectingYourselfFromFraudPageActions {

	ProtectingYourselfFromFraudPageLocators protectingYourselfFromFraudPageLocators = null;

	public ProtectingYourselfFromFraudPageActions() {

		this.protectingYourselfFromFraudPageLocators = new ProtectingYourselfFromFraudPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), protectingYourselfFromFraudPageLocators);
	}

	public WebElement ProtectingYourselfFromFraudLink() {

		return protectingYourselfFromFraudPageLocators.ProtectingYourselfFromFraudLink;
	}

	public WebElement MastheadHeader() {

		return protectingYourselfFromFraudPageLocators.MastheadHeader;
	}

	public WebElement AccordianHeader() {

		return protectingYourselfFromFraudPageLocators.AccordianHeader;
	}

	public WebElement AccordianLink() {

		return protectingYourselfFromFraudPageLocators.AccordianLink;
	}

	public WebElement AccordianTextArea() {

		return protectingYourselfFromFraudPageLocators.AccordianTextArea;
	}

	public String getTextAreaBlockHeader(String header) {

		switch (header) {

		case "Do you think you've been a victim of fraud?":
			return protectingYourselfFromFraudPageLocators.TextAreaHeader1.getText();

		case "Identity fraud":
			return protectingYourselfFromFraudPageLocators.TextAreaHeader2.getText();

		case "Shopping online":
			return protectingYourselfFromFraudPageLocators.TextAreaHeader3.getText();

		case "Money mules":
			return protectingYourselfFromFraudPageLocators.TextAreaHeader4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

}
