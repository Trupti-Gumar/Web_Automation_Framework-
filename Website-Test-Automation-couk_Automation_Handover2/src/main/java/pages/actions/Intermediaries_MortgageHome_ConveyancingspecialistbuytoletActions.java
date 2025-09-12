package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_ConveyancingspecialistbuytoletLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ConveyancingspecialistbuytoletActions {

	Intermediaries_MortgageHome_ConveyancingspecialistbuytoletLocators ConveyancingspecialistbuytoletLocators = null;

	public Intermediaries_MortgageHome_ConveyancingspecialistbuytoletActions() {

		this.ConveyancingspecialistbuytoletLocators = new Intermediaries_MortgageHome_ConveyancingspecialistbuytoletLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ConveyancingspecialistbuytoletLocators);
	}

	public WebElement ConveyancingspecialistbuytoletLink() {

		return ConveyancingspecialistbuytoletLocators.ConveyancingspecialistbuytoletLink;
	}

	public WebElement MastheadHeader() {

		return ConveyancingspecialistbuytoletLocators.MastheadHeader;
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Multi property buy to let mortgage":
			return ConveyancingspecialistbuytoletLocators.CardHeader1.getText();
			
		case "Speak to our team":
			return ConveyancingspecialistbuytoletLocators.CardHeader2.getText();
			
		case "Buy to let mortgage documents":
			return ConveyancingspecialistbuytoletLocators.CardHeader3.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Multi property buy to let mortgages":
			return SeleniumDriver.getPageTitle(ConveyancingspecialistbuytoletLocators.CardLink1);
			
		case "Residential & Buy to Let Mortgages Contacts for Intermediaries":
			return SeleniumDriver.getPageTitle(ConveyancingspecialistbuytoletLocators.CardLink2);
			
		case "Buy to Let Mortgage Intermediaries":
			return SeleniumDriver.getPageTitle(ConveyancingspecialistbuytoletLocators.CardLink3);
			
				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	

}
