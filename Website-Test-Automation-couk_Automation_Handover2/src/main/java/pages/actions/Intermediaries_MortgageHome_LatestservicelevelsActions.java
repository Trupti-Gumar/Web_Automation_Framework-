package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_LatestservicelevelsLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_LatestservicelevelsActions {

	Intermediaries_MortgageHome_LatestservicelevelsLocators LatestservicelevelsLocators = null;

	public Intermediaries_MortgageHome_LatestservicelevelsActions() {

		this.LatestservicelevelsLocators = new Intermediaries_MortgageHome_LatestservicelevelsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), LatestservicelevelsLocators);
	}

	public WebElement LatestservicelevelsLink() {

		return LatestservicelevelsLocators.LatestservicelevelsLink;
	}

	public WebElement MastheadHeader() {

		return LatestservicelevelsLocators.MastheadHeader;
	}

	public String getHeadingText(String header) {

		switch (header) {
		case "Initial packaging review - for all cases":
		//case "Initial packaging review – for all cases":
			//SeleniumDriver.waitForElementClickable(LatestservicelevelsLocators.CardHeaderText1);
			System.out.println("LocatorLocator" + LatestservicelevelsLocators.CardHeaderText1.getText() );
			return LatestservicelevelsLocators.CardHeaderText1.getText();
			
		case "Residential and standard buy to let":
			return LatestservicelevelsLocators.CardHeaderText2.getText();
			
		case "Specialist buy to let":
			return LatestservicelevelsLocators.CardHeaderText3.getText();
			
		case "Residential and Buy to let submission guide":
			return LatestservicelevelsLocators.CardHeaderText4.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value123: " + header);

		}
	}
	
}
