package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_AffordabilitycalculatorsLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_AffordabilitycalculatorsActions {

	Intermediaries_MortgageHome_AffordabilitycalculatorsLocators AffordabilitycalculatorsLocators = null;

	public Intermediaries_MortgageHome_AffordabilitycalculatorsActions() {

		this.AffordabilitycalculatorsLocators = new Intermediaries_MortgageHome_AffordabilitycalculatorsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), AffordabilitycalculatorsLocators);
	}

	public WebElement AffordabilitycalculatorsLink() {

		return AffordabilitycalculatorsLocators.AffordabilitycalculatorsLink;
	}

	public WebElement MastheadHeader() {

		return AffordabilitycalculatorsLocators.MastheadHeader;
	}

	
	public String getTabHeader(String header) {

		switch (header) {

		case "Residential":
			return AffordabilitycalculatorsLocators.TabHeader1.getText();
			
		case "Buy to Let":
			return AffordabilitycalculatorsLocators.TabHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	

}
