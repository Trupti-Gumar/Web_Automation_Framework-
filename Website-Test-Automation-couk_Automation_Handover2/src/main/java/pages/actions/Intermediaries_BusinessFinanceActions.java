package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_BusinessFinanceLocators;
import utils.SeleniumDriver;

public class Intermediaries_BusinessFinanceActions {
	
	Intermediaries_BusinessFinanceLocators BusinessFinanceLocators 
	= new Intermediaries_BusinessFinanceLocators();
	
	public Intermediaries_BusinessFinanceActions() {
		this.BusinessFinanceLocators = new Intermediaries_BusinessFinanceLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BusinessFinanceLocators);
	}
	
	public WebElement BusinessFinanceDropdown() {
		return BusinessFinanceLocators.BusinessFinanceDropdown;
	}

	public WebElement BusinessFinance_Intermediaries() {
		return BusinessFinanceLocators.BusinessFinanceOptions;
	}
	
	public WebElement Mastheadheader() {
		return BusinessFinanceLocators.MastheadHeader;
	}
	
	public String getCardHeader(String header) {
		switch(header) {
		case"Asset Finance":
			return BusinessFinanceLocators.CardHeader1.getText();
		case"Invoice Finance":
			return BusinessFinanceLocators.CardHeader2.getText();
		case"Commercial Real Estate":
			return BusinessFinanceLocators.CardHeader3.getText();
			default: 
				throw new IllegalArgumentException("Invalid Header : " + header);
		}

	}
	
	public String getCardPageTitle(String header) {
		switch(header) {
		case"Asset Finance":
			return SeleniumDriver.getPageTitle(BusinessFinanceLocators.PageTitle1);
		case"Invoice Finance":
			return SeleniumDriver.getPageTitle(BusinessFinanceLocators.PageTitle2);
		case"Commercial Real Estate":
			return SeleniumDriver.getPageTitle(BusinessFinanceLocators.PageTitle3);
			default: 
				throw new IllegalArgumentException("Invalid Page : " + header);
		
		}
	}
	
}
