package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_ResidentialmortgagedocumentsLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ResidentialmortgagedocumentsActions {

	Intermediaries_MortgageHome_ResidentialmortgagedocumentsLocators ResidentialmortgagedocumentsLocators = null;

	public Intermediaries_MortgageHome_ResidentialmortgagedocumentsActions() {

		this.ResidentialmortgagedocumentsLocators = new Intermediaries_MortgageHome_ResidentialmortgagedocumentsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ResidentialmortgagedocumentsLocators);
	}

	public WebElement ResidentialmortgagedocumentsLink() {

		return ResidentialmortgagedocumentsLocators.ResidentialmortgagedocumentsLink;
	}

	public WebElement MastheadHeader() {

		return ResidentialmortgagedocumentsLocators.MastheadHeader;
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Buy to let mortgage documents":
			return ResidentialmortgagedocumentsLocators.CardHeader1.getText();
			
		case "Product switching documents":
			return ResidentialmortgagedocumentsLocators.CardHeader2.getText();
			
		case "Commercial mortgage documents":
			return ResidentialmortgagedocumentsLocators.CardHeader3.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Buy to Let Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(ResidentialmortgagedocumentsLocators.CardLink1);
			
		case "Mortgage Product Switch Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(ResidentialmortgagedocumentsLocators.CardLink2);
			
		case "Commercial Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(ResidentialmortgagedocumentsLocators.CardLink3);
			
				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	

}
