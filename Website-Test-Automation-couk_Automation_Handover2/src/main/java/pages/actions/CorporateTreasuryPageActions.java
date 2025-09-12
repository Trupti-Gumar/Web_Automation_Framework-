package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CorporateTreasuryPageLocators;
import utils.SeleniumDriver;

public class CorporateTreasuryPageActions {

	CorporateTreasuryPageLocators corporateTreasuryPageLocators = null;

	public CorporateTreasuryPageActions() {

		this.corporateTreasuryPageLocators = new CorporateTreasuryPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), corporateTreasuryPageLocators);
	}

	// USP

	public String getUSPSubHeaders(String header) {

		switch (header) {

		case "Financial strength":

			SeleniumDriver.moveToElement(corporateTreasuryPageLocators.USPSubHeader4);

			return corporateTreasuryPageLocators.USPSubHeader1.getText();

		case "Flexible deposit options":

			SeleniumDriver.moveToElement(corporateTreasuryPageLocators.USPSubHeader4);

			return corporateTreasuryPageLocators.USPSubHeader2.getText();

		case "Human approach":

			SeleniumDriver.moveToElement(corporateTreasuryPageLocators.USPSubHeader4);

			return corporateTreasuryPageLocators.USPSubHeader3.getText();

		case "Competitive returns":

			SeleniumDriver.moveToElement(corporateTreasuryPageLocators.USPSubHeader4);

			return corporateTreasuryPageLocators.USPSubHeader4.getText();

		default:

			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public WebElement Savingstab() {

		return corporateTreasuryPageLocators.Savingstab;

	}

	public WebElement CorporatedepositsMenuItem() {

		return corporateTreasuryPageLocators.CorporatedepositsMenuItem;

	}

	public WebElement CorporatedepositsHeader() {

		return corporateTreasuryPageLocators.CorporatedepositsHeader;

	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {

		return corporateTreasuryPageLocators.ImageCopyHeader1;

	}

	public WebElement ImageCopyHeader2() {

		return corporateTreasuryPageLocators.ImageCopyHeader2;

	}

	public String getImageCopyHeaders(String header) {

		switch (header) {

		case "Specialists across a range of industries":

			SeleniumDriver.moveToElement(corporateTreasuryPageLocators.ImageCopyHeader1);

			return corporateTreasuryPageLocators.ImageCopyHeader1.getText();

//		case "Our deposit solutions are suitable for:":
//
//			SeleniumDriver.moveToElement(corporateTreasuryPageLocators.ImageCopyHeader2);
//
//			return corporateTreasuryPageLocators.ImageCopyHeader2.getText();

		default:

			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	// BDM Card

	public WebElement BDMCardHeader() {

		return corporateTreasuryPageLocators.BDMCardHeader;

	}

	// Yellow CTA banner

	public WebElement YellowCTABanner() {

		return corporateTreasuryPageLocators.YellowCTABanner;

	}
	
	public WebElement corporateTrasuryCard() {

		return corporateTreasuryPageLocators.corporateTrasuryCard;

	}
	
	public WebElement FSCSCard() {

		return corporateTreasuryPageLocators.FSCSCard;

	}

}
