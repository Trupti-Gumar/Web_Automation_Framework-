package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_InsightsLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_InsightsActions {

	Intermediaries_MortgageHome_InsightsLocators InsightsLocators = null;

	public Intermediaries_MortgageHome_InsightsActions() {

		this.InsightsLocators = new Intermediaries_MortgageHome_InsightsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), InsightsLocators);
	}

	public WebElement InsightsLink() {

		return InsightsLocators.InsightsLink;
	}

	public WebElement MastheadHeader() {

		return InsightsLocators.MastheadHeader;
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Storm before the Calm?":
			return InsightsLocators.CardHeader1.getText();
			
		case "Understanding the New Build Sector":
			return InsightsLocators.CardHeader2.getText();
			
		case "5 Easy Ways to Refresh your Business":
			return InsightsLocators.CardHeader3.getText();
			
		case "5 Ways to get into the New Build Sector":
			return InsightsLocators.CardHeader4.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Storm before the Calm?":
			return SeleniumDriver.getPageTitle(InsightsLocators.CardLink1);
			
		case "Understanding the New Build Sector":
			return SeleniumDriver.getPageTitle(InsightsLocators.CardLink2);
			
		case "5 Easy Ways to Refresh Your Business":
			return SeleniumDriver.getPageTitle(InsightsLocators.CardLink3);
			
		case "5 Ways to get into the New Build Sector":
			return SeleniumDriver.getPageTitle(InsightsLocators.CardLink4);
			
				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	

}
