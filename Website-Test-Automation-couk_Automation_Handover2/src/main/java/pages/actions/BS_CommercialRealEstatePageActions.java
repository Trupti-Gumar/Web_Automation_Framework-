package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BS_CommercialRealEstatePageLocators;
import utils.SeleniumDriver;

public class BS_CommercialRealEstatePageActions {
	
	BS_CommercialRealEstatePageLocators CommercialRealEstatePageLocators = null;
	
	public BS_CommercialRealEstatePageActions() {
		
		this.CommercialRealEstatePageLocators = new BS_CommercialRealEstatePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CommercialRealEstatePageLocators);
	}
	
	public WebElement CommercialRealEstate()
	{
		return CommercialRealEstatePageLocators.CommercialRealEstate;
	}
	
	public WebElement mastHeadHeader()
	{
		return CommercialRealEstatePageLocators.mastHeadHeader;
	}
	
	public WebElement yellowCTABanner()
	{
		return CommercialRealEstatePageLocators.yellowCTABanner;
	}
	
	public String getCardPageTitle(String cardTitle) {
		
		
		switch (cardTitle) {

		case "Commercial Mortgages":
			
			return SeleniumDriver.getPageTitle(CommercialRealEstatePageLocators.CommercialmortgagesCard);

		case "Property Development Finance":
			return SeleniumDriver.getPageTitle(CommercialRealEstatePageLocators.PropertydevelopmentfinanceCard);

		default:
			throw new IllegalArgumentException("Invalid value: " + cardTitle);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
