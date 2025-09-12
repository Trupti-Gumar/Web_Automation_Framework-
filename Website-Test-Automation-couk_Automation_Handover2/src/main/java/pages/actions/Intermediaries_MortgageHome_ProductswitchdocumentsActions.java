package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_ProductswitchdocumentsLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ProductswitchdocumentsActions {

	Intermediaries_MortgageHome_ProductswitchdocumentsLocators ProductswitchdocumentsLocators = null;

	public Intermediaries_MortgageHome_ProductswitchdocumentsActions() {

		this.ProductswitchdocumentsLocators = new Intermediaries_MortgageHome_ProductswitchdocumentsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ProductswitchdocumentsLocators);
	}

	public WebElement ProductswitchdocumentsLink() {

		return ProductswitchdocumentsLocators.ProductswitchdocumentsLink;
	}

	public WebElement MastheadHeader() {

		return ProductswitchdocumentsLocators.MastheadHeader;
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Buy to let mortgage documents":
			return ProductswitchdocumentsLocators.CardHeader1.getText();
			
		case "Residential mortgage documents":
			return ProductswitchdocumentsLocators.CardHeader2.getText();
			
		case "Commercial mortgage documents":
			return ProductswitchdocumentsLocators.CardHeader3.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Buy to Let Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(ProductswitchdocumentsLocators.CardLink1);
			
		case "Residential Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(ProductswitchdocumentsLocators.CardLink2);
			
		case "Commercial Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(ProductswitchdocumentsLocators.CardLink3);
			
				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	

}
