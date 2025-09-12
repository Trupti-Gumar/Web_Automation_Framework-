package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_Homepage_Locators;
import utils.SeleniumDriver;

public class Intermediaries_Homepage_Actions {

	Intermediaries_Homepage_Locators intermediaries_Homepage_Locators = null;
	
	public Intermediaries_Homepage_Actions() {
		
		this.intermediaries_Homepage_Locators = new Intermediaries_Homepage_Locators();
	  PageFactory.initElements(SeleniumDriver.getDriver(), intermediaries_Homepage_Locators);
	}
	
	public WebElement AcceptCookiesBtn() {
		return intermediaries_Homepage_Locators.AcceptCookiesBtn;
	}
	
	public WebElement IntermediariesLink() {
		return intermediaries_Homepage_Locators.IntermediariesLink;
	}
	
	public WebElement MastheadHeader() {
		return intermediaries_Homepage_Locators.MastheadHeader;
	}
	
	public String getCardHeaders(String header) {
		
		switch (header) {

		case "Mortgage intermediaries":
			return intermediaries_Homepage_Locators.MortgageIntermediariesCardHeader.getText();

		case "Residential mortgages":
			return intermediaries_Homepage_Locators.ResidentialowneroccupiedmortgagesCardHeader.getText();
			
		case "Buy to let mortgages":
			return intermediaries_Homepage_Locators.BuytoletmortgagesCardHeader.getText();
			
		case "Commercial mortgages":
			return intermediaries_Homepage_Locators.CommercialMortgagesCardHeader.getText();
			
		case "Product switching":
			return intermediaries_Homepage_Locators.ProductswitchCardHeader.getText();
			
		case "Asset finance":
			return intermediaries_Homepage_Locators.AssetfinanceCardHeader.getText();
			
		case "Invoice finance":
			return intermediaries_Homepage_Locators.InvoicefinanceCardHeader.getText();
			
		case "Property development finance":
			return intermediaries_Homepage_Locators.PropertydevelopmentfinanceCardHeader.getText();
			

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Mortgage Intermediaries":
			return SeleniumDriver.getPageTitle(intermediaries_Homepage_Locators.MortgageIntermediariesCardLink);

		case "Residential Owner-Occupied Mortgages":
			return SeleniumDriver.getPageTitle(intermediaries_Homepage_Locators.ResidentialowneroccupiedmortgagesCardLink);
			
		case "Buy to Let Mortgage Intermediaries":
			return SeleniumDriver.getPageTitle(intermediaries_Homepage_Locators.BuytoletmortgagesCardLink);
			
		case "Commercial Mortgages":
			return SeleniumDriver.getPageTitle(intermediaries_Homepage_Locators.CommercialMortgagesCardLink);
			
		case "Mortgage Product Switch - Intermediaries":
			return SeleniumDriver.getPageTitle(intermediaries_Homepage_Locators.ProductswitchCardLink);
			
		case "Asset Finance for Intermediaries":
			return SeleniumDriver.getPageTitle(intermediaries_Homepage_Locators.AssetfinanceCardLink);
			
		case "Invoice Finance for Intermediaries":
			return SeleniumDriver.getPageTitle(intermediaries_Homepage_Locators.InvoicefinanceCardLink);
			
		case "Property Development Finance for Brokers":
			return SeleniumDriver.getPageTitle(intermediaries_Homepage_Locators.PropertydevelopmentfinanceCardLink);
			

		default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
