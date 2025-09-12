package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_CommercialMortgagesLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_CommercialMortgagesActions {
	
Intermediaries_MortgageHome_CommercialMortgagesLocators CommercialMortgagesLocators 
= new Intermediaries_MortgageHome_CommercialMortgagesLocators();

public Intermediaries_MortgageHome_CommercialMortgagesActions() {

	this.CommercialMortgagesLocators = new Intermediaries_MortgageHome_CommercialMortgagesLocators();
	PageFactory.initElements(SeleniumDriver.getDriver(), CommercialMortgagesLocators);
}

public WebElement MortgageHome() {
	return CommercialMortgagesLocators.MortgageHome;
}

public WebElement CommercialMortgagesLink() {
	return CommercialMortgagesLocators.CommericalMortgages;
}

public WebElement MastheadHeader() {
	return CommercialMortgagesLocators.CommericalMortgagesPage;
}

public WebElement getImageHeader(){
	return CommercialMortgagesLocators.ImageSectionHeader;
}

public WebElement getMastheadBlackBoxheader() {
	return CommercialMortgagesLocators.QuickLinkheader;
}

public String getMastheadBlackboxLinkPage(String header) {

	switch (header) {

	case "Get in touch":
		return SeleniumDriver.getPageTitle(CommercialMortgagesLocators.MastheadBlackboxLink1);
	case "Commercial mortgage documents":
		return SeleniumDriver.getPageTitle(CommercialMortgagesLocators.MastheadBlackboxLink2);	
	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
} 

public String getDocumentheaders(String title) {
	
	switch (title) {
	case "Commercial mortgages application form":
		return SeleniumDriver.getPageTitle(CommercialMortgagesLocators.DocumentHeader1);
	case "Commercial mortgages legal fee scale":
		return SeleniumDriver.getPageTitle(CommercialMortgagesLocators.DocumentHeader2);	
	case "Commercial mortgages tariff of charges":
		return SeleniumDriver.getPageTitle(CommercialMortgagesLocators.DocumentHeader3);
	case "Regional lending team map":
		return SeleniumDriver.getPageTitle(CommercialMortgagesLocators.DocumentHeader4);
	default:
		throw new IllegalArgumentException("Invalid value: " + title);

	}
	
 }

}
