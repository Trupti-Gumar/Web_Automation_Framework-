package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_BusinessFinance_AssetFinanceLocators;
import utils.SeleniumDriver;

public class Intermediaries_BusinessFinance_AssetFinanceActions {
	
	Intermediaries_BusinessFinance_AssetFinanceLocators AssetFinanceLocators = 
			new Intermediaries_BusinessFinance_AssetFinanceLocators();
	
	public Intermediaries_BusinessFinance_AssetFinanceActions() {
		this.AssetFinanceLocators = new Intermediaries_BusinessFinance_AssetFinanceLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), AssetFinanceLocators);
	}
	
	public WebElement AssetFinance_Intermediaries() {
		return AssetFinanceLocators.AssetFinance;
	}

	public WebElement getPagetitle() {
		return AssetFinanceLocators.MastheadHeader;
	}
	
	public WebElement getBlackBoxHeader() {
		return AssetFinanceLocators.BlackBoxheader;
	}
	
	public String getUSPSubheader(String header) {
		switch(header) {
		case"Expertise":
			return AssetFinanceLocators.USPheader1.getText();
		case"Funding":
			return AssetFinanceLocators.USPheader2.getText();
		case"Service":
			return AssetFinanceLocators.USPheader3.getText();
		default:
			throw new IllegalArgumentException("Invalid Value :" + header);
		}
	}
	
	public String getBalckboxheader(String header) {
		switch(header) {
		case"Get in touch":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.BlackBoxOption1);
		case"Asset finance documents":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.BlackBoxOption2);
		case "Log in to Asset Backer" : 
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.BlackBoxOption3);
		default: 
			throw new IllegalArgumentException("Invalid Value :" + header);
		}
	}
	
	public String getCardsPageTile(String header) {
		switch(header) {
		case"Our products":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.Card1);
		case"Our sectors":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.Card2); 
		case"Our services":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.Card3); 
		case"Asset Backer":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.Card4); 
		case"Wholesale finance":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.Card5); 	
		case"Finance and Leasing Association (FLA)":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.Card6); 				
		case"National Association of Commercial Finance Borkers(NACFB)":
			return SeleniumDriver.getPageTitle(AssetFinanceLocators.Card7); 	
		default: 
			throw new IllegalArgumentException("Invlaid Value : " + header);
		}
	}
	
	public String getCTABannerTitle() {
		return AssetFinanceLocators.CTABanner1.getText();
	}
	
	public String getCTABannerPageTitle() {
		return AssetFinanceLocators.CTABannerPageTitle.getText();
	}
}
