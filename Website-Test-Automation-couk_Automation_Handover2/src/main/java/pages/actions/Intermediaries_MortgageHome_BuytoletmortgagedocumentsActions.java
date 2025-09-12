package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_BuytoletmortgagedocumentsLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_BuytoletmortgagedocumentsActions {

	Intermediaries_MortgageHome_BuytoletmortgagedocumentsLocators BuytoletmortgagedocumentsLocators = null;

	public Intermediaries_MortgageHome_BuytoletmortgagedocumentsActions() {

		this.BuytoletmortgagedocumentsLocators = new Intermediaries_MortgageHome_BuytoletmortgagedocumentsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BuytoletmortgagedocumentsLocators);
	}

	public WebElement BuytoletmortgagedocumentsLink() {

		return BuytoletmortgagedocumentsLocators.BuytoletmortgagedocumentsLink;
	}

	public WebElement MastheadHeader() {

		return BuytoletmortgagedocumentsLocators.MastheadHeader;
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Residential mortgage documents":
			return BuytoletmortgagedocumentsLocators.CardHeader1.getText();
			
		case "Product switching documents":
			return BuytoletmortgagedocumentsLocators.CardHeader2.getText();
			
		case "Commercial mortgage documents":
			return BuytoletmortgagedocumentsLocators.CardHeader3.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Residential Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(BuytoletmortgagedocumentsLocators.CardLink1);
			
		case "Mortgage Product Switch Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(BuytoletmortgagedocumentsLocators.CardLink2);
			
		case "Commercial Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(BuytoletmortgagedocumentsLocators.CardLink3);
			
				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	

}
