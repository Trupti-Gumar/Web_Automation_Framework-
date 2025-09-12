package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.PersonalSavingsAccount_RegularSaverAccountLocators;
import utils.SeleniumDriver;

public class PersonalSavingsAccount_RegularSaverAccountActions {

	PersonalSavingsAccount_RegularSaverAccountLocators PS_RegularSaverAccountLocators = null;

	public PersonalSavingsAccount_RegularSaverAccountActions() {

		this.PS_RegularSaverAccountLocators = new PersonalSavingsAccount_RegularSaverAccountLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), PS_RegularSaverAccountLocators);
	}

	public WebElement MastheadHeader() {

		return PS_RegularSaverAccountLocators.MastheadHeader;
	}
	
	public WebElement Personalsavingshelpandsupport() {

		return PS_RegularSaverAccountLocators.Personalsavingshelpandsupport;
	}

	public WebElement RegularSavingsLinks() {

		return PS_RegularSaverAccountLocators.RegularSavingsLinks;
	}

	public WebElement ImageCopyHeader() {

		return PS_RegularSaverAccountLocators.ImageCopyHeader;
	}

	public WebElement AccordianHeader() {

		return PS_RegularSaverAccountLocators.AccordianHeader;
	}

	public WebElement AccordianLink() {

		return PS_RegularSaverAccountLocators.AccordianLink;
	}

	public WebElement AccordianText() {

		return PS_RegularSaverAccountLocators.AccordianText;
	}

	public WebElement MoreCardHeader() {

		return PS_RegularSaverAccountLocators.MoreCardHeader;
	}

	public WebElement MoreCardLink() {

		return PS_RegularSaverAccountLocators.MoreCardLink;
	}

	public WebElement TextBlockHeader() {

		return PS_RegularSaverAccountLocators.TextBlockHeader;
	}
	
	public WebElement SavingsLink() {

		return PS_RegularSaverAccountLocators.SavingsLink;
	}

	public String getUSPHeader(String header) {

		switch (header) {

		case "Open an account with...":

			return PS_RegularSaverAccountLocators.USPHeader1.getText();

		case "Easy account opening":

			return PS_RegularSaverAccountLocators.USPHeader2.getText();

		case "Rated \"Excellent\"":

			return PS_RegularSaverAccountLocators.USPHeader3.getText();

		case "Award winning":

			return PS_RegularSaverAccountLocators.USPHeader4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

}
