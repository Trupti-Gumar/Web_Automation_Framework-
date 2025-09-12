package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CorporateDeposit_TermsAndConditionsPageLocators;
import utils.SeleniumDriver;

public class CorporateDeposit_TermsAndConditionsPageActions {

	CorporateDeposit_TermsAndConditionsPageLocators corporateDeposit_TermsAndConditionsPageLocators = null;

	public CorporateDeposit_TermsAndConditionsPageActions() {

		this.corporateDeposit_TermsAndConditionsPageLocators = new CorporateDeposit_TermsAndConditionsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), corporateDeposit_TermsAndConditionsPageLocators);

	}

	public WebElement BackLink() {

		return corporateDeposit_TermsAndConditionsPageLocators.BackLink;
	}

	public WebElement TermsAndConditionLink() {

		return corporateDeposit_TermsAndConditionsPageLocators.TermsAndConditionLink;
	}

	public WebElement MastheadHeader() {

		return corporateDeposit_TermsAndConditionsPageLocators.MastheadHeader;
	}

	public WebElement AccordianHeader() {

		return corporateDeposit_TermsAndConditionsPageLocators.AccordianHeader;
	}

	public WebElement AccordianLink() {

		return corporateDeposit_TermsAndConditionsPageLocators.AccordianLink;
	}

	public WebElement AccordianText() {

		return corporateDeposit_TermsAndConditionsPageLocators.AccordianText;
	}

}
