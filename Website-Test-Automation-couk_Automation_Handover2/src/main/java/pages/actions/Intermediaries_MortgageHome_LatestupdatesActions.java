package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_LatestupdatesLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_LatestupdatesActions {

	Intermediaries_MortgageHome_LatestupdatesLocators LatestupdatesLocators = null;

	public Intermediaries_MortgageHome_LatestupdatesActions() {

		this.LatestupdatesLocators = new Intermediaries_MortgageHome_LatestupdatesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), LatestupdatesLocators);
	}

	public WebElement LatestupdatesLink() {

		return LatestupdatesLocators.LatestupdatesLink;
	}

	public WebElement MastheadHeader() {

		return LatestupdatesLocators.MastheadHeader;
	}

	public String getLinkText(String header) {

		switch (header) {

		case "current turnaround times.":
			return LatestupdatesLocators.recentIntermediaryUpdatesLink.getText();
				
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Our Latest Mortgage Turnaround Times":
			return SeleniumDriver.getPageTitle(LatestupdatesLocators.recentIntermediaryUpdatesLink);
			
		default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}
	
}
