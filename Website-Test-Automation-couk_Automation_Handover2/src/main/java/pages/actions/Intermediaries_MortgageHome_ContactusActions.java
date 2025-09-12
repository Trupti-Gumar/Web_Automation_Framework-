package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_ContactusLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ContactusActions {

	Intermediaries_MortgageHome_ContactusLocators ContactusLocators = null;

	public Intermediaries_MortgageHome_ContactusActions() {

		this.ContactusLocators = new Intermediaries_MortgageHome_ContactusLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ContactusLocators);
	}

	public WebElement ContactusLink() {

		return ContactusLocators.ContactusLink;
	}

	public WebElement MastheadHeader() {

		return ContactusLocators.MastheadHeader;
	}

	public String getHeadingText(String header) {

		switch (header) {

		case "New and existing case enquiries":
			return ContactusLocators.CardHeader1.getText();
			
		case "Find your Relationship Manager - new enquiries":
			return ContactusLocators.CardHeader2.getText();
			
		case "Other contact information":
			return ContactusLocators.CardHeader3.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
}
