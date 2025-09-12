package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_PlatinumbrokerservicepropositionLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_PlatinumbrokerservicepropositionActions {

	Intermediaries_MortgageHome_PlatinumbrokerservicepropositionLocators PlatinumbrokerservicepropositionLocators = null;

	public Intermediaries_MortgageHome_PlatinumbrokerservicepropositionActions() {

		this.PlatinumbrokerservicepropositionLocators = new Intermediaries_MortgageHome_PlatinumbrokerservicepropositionLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), PlatinumbrokerservicepropositionLocators);
	}

	public WebElement PlatinumbrokerservicepropositionLink() {

		return PlatinumbrokerservicepropositionLocators.PlatinumbrokerservicepropositionLink;
	}

	public WebElement MastheadHeader() {

		return PlatinumbrokerservicepropositionLocators.MastheadHeader;
	}

	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return PlatinumbrokerservicepropositionLocators.ImageCopyHeader1.getText();

		case "Second":
			return PlatinumbrokerservicepropositionLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Affordability calculators":
			return PlatinumbrokerservicepropositionLocators.CardHeader1.getText();
			
		case "Product & eligibility guides":
			return PlatinumbrokerservicepropositionLocators.CardHeader2.getText();
			
		case "Contact us":
			return PlatinumbrokerservicepropositionLocators.CardHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Affordability Calculators - Intermediaries":
			return SeleniumDriver.getPageTitle(PlatinumbrokerservicepropositionLocators.CardLink1);
			
		case "Mortgage Documents for Intermediaries":
			return SeleniumDriver.getPageTitle(PlatinumbrokerservicepropositionLocators.CardLink2);
			
		case "Aldermore for Intermediaries Contact":
			SeleniumDriver.waitForElementClickable(PlatinumbrokerservicepropositionLocators.CardLink3);
			return SeleniumDriver.getPageTitle(PlatinumbrokerservicepropositionLocators.CardLink3);

				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	

}
