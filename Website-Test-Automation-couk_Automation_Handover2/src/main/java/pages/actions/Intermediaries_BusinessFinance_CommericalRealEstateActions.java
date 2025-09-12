package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_BusinessFinance_CommericalRealEstateLocators;
import utils.SeleniumDriver;

public class Intermediaries_BusinessFinance_CommericalRealEstateActions {

	Intermediaries_BusinessFinance_CommericalRealEstateLocators RealEstateLocators = new 
			Intermediaries_BusinessFinance_CommericalRealEstateLocators();
	
	public Intermediaries_BusinessFinance_CommericalRealEstateActions() {
		this.RealEstateLocators = new Intermediaries_BusinessFinance_CommericalRealEstateLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), RealEstateLocators);
	}
	
	
	public WebElement clickOnCommercialRealEstate() {
		return RealEstateLocators.CommericalRealEstate;
	} 
	
	public WebElement getRealCommercialEstateHeader() {
		return RealEstateLocators.CommericalRealEstateHeader;
	}
	
	public WebElement getBlackBoxheader() {
		return RealEstateLocators.CommericalRealEstateQuickHeader;
	}
	
	public WebElement getQuickLinkPageTitle(String header) {
		switch(header) {
		case"Get in touch":
			return RealEstateLocators.QuickLink1;
		case"Useful documents":
			return RealEstateLocators.QuickLink2;
		default: 
			throw new IllegalArgumentException("Invalid Header :" + header);
		}
	}
	
	public String getUSPHeader(String header) {
		switch(header) {
		case"Funding":
			return RealEstateLocators.USPheader1.getText();
		case"One stop shop":
			return RealEstateLocators.USPheader2.getText();
		case"Sustainability focus":
			return RealEstateLocators.USPheader3.getText();
			default:
				throw new IllegalArgumentException("Invalid Value :" + header);
		}
	}
	
	public String getImageHeader(String header) {
		switch(header) {
		case"Purpose built student accommodation (PBSA)":
			return RealEstateLocators.ImageHeader1.getText();
		case"Care homes":
			return RealEstateLocators.ImageHeader2.getText();
		case"Build to Rent (BTR)":
			return RealEstateLocators.ImageHeader3.getText();
		default:
			throw new IllegalArgumentException("Invalid Value :" + header);
		}
	}
	
	public WebElement getCardHeaderPageTitle(String header) {
		switch(header) {
		case "Commercial mortgages":
			return RealEstateLocators.CardHeader1;
		case"Property Development":
			return RealEstateLocators.CardHeader2;
		default:
			throw new IllegalArgumentException("Invlaid Value : " + header);
		
		}
	}
	
	public String getCTAPageTitle(String header) {
			return SeleniumDriver.getPageTitle(RealEstateLocators.CTABanner);
		}	
}

