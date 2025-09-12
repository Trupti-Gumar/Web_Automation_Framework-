package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHomePage_Locators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHomePage_Actions {

	Intermediaries_MortgageHomePage_Locators MortgageHomePage_Locators = null;

	public Intermediaries_MortgageHomePage_Actions() {

		this.MortgageHomePage_Locators = new Intermediaries_MortgageHomePage_Locators();
		PageFactory.initElements(SeleniumDriver.getDriver(), MortgageHomePage_Locators);

	}

	public WebElement MortgageHomeLink() {

		return MortgageHomePage_Locators.MortgageHomeLink;
	}

	public WebElement MortgageDropdown() {

		return MortgageHomePage_Locators.MortgageDropdown;
	}

	public WebElement MastheadHeader() {

		return MortgageHomePage_Locators.MastheadHeader;
	}

	public WebElement MastheadBlackBoxHeader() {

		return MortgageHomePage_Locators.MastheadBlackBoxHeader;
	}

	public WebElement CalculatorsLink() {

		return MortgageHomePage_Locators.CalculatorsLink;
	}

	public WebElement LatestServiceLevelsLink() {

		return MortgageHomePage_Locators.LatestServiceLevelsLink;
	}

	public WebElement ProductsEligibilityGuidesLink() {

		return MortgageHomePage_Locators.LoginToSubmitBusinessLink;
	}

	public WebElement AccordianHeader() {

		return MortgageHomePage_Locators.AccordianHeader;
	}

	public WebElement AccordianLink() {

		return MortgageHomePage_Locators.AccordianLink;
	}

	public WebElement AccordianText() {

		return MortgageHomePage_Locators.AccordianText;
	}

	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return MortgageHomePage_Locators.ImageCopyHeader1.getText();

		case "Second":
			return MortgageHomePage_Locators.ImageCopyHeader2.getText();
			
		case "Third":
			return MortgageHomePage_Locators.ImageCopyHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}

	public String getUSPHeader(String header) {

		switch (header) {

		case "10 day DIP guarantee":
			return MortgageHomePage_Locators.USPHeader1.getText();

		case "Free & remote valuations":
			return MortgageHomePage_Locators.USPHeader2.getText();

		case "Platinum broker":
			return MortgageHomePage_Locators.USPHeader3.getText();

		case "Simple client switching":
			return MortgageHomePage_Locators.USPHeader4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getMastheadBlackboxLinkPage(String header) {

		switch (header) {

		case "Calculators":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.CalculatorsLink);

		case "Latest service levels":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.LatestServiceLevelsLink);
			
		case "Log in to submit business":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.LoginToSubmitBusinessLink);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Residential mortgages":
			return MortgageHomePage_Locators.ResidentialmortgagesCardHeader.getText();

		case "Buy to let mortgages":
			return MortgageHomePage_Locators.BuyToLetCardHeader.getText();

		case "Multi property buy to let mortgages":
			return MortgageHomePage_Locators.MultipropertybuytoletCardHeader.getText();

		case "Commercial mortgages":
			return MortgageHomePage_Locators.CommercialmortgagesCardHeader.getText();

		case "Product switch":
			return MortgageHomePage_Locators.ProductswitchCardHeader.getText();
			
		case "Residential mortgage documents":
			return MortgageHomePage_Locators.ResidentialmortgageDocumentsCardHeader.getText();
			
		case "Buy to let mortgage documents":
			return MortgageHomePage_Locators.BuyToLetmortgageDocumentsCardHeader.getText();
			
		case "Product switch documents":
			return MortgageHomePage_Locators.ProductSwitchDocumentsCardHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getCardLinkPageTitle(String header) {

		switch (header) {

		case "Residential mortgages":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.ResidentialmortgagesCardLink);

		case "Buy to let mortgages":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.BuyToLetCardLink);

		case "Multi property buy to let mortgages":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.MultipropertybuytoletCardLink);

		case "Commercial mortgages":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.CommercialmortgagesCardLink);

		case "Product switch":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.ProductswitchCardLink);
			
		case "Residential mortgage documents":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.ResidentialmortgagedocumentsCardLink);

		case "Buy to let mortgage documents":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.BuytoletmortgagedocumentsCardLink);
			
		case "Product switch documents":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.ProductswitchdocumentsCardLink);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getUsfulLinkPageTitle(String header) {

		switch (header) {

		case "Platinum Broker service proposition":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.PlatinumBrokerServicePropositionLink);

		case "Product switch":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.ProductswitchLink);

		case "View our latest updates and news":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.ViewOurLatestUpdatesAndNewsLink);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getLoginCardHeader(String header) {

		switch (header) {

		case "Residential mortgages broker portal":
			return MortgageHomePage_Locators.ResidentialmortgagesbrokerportalLoginCardHeader.getText();

		case "Specialist buy to let mortgage portal":
			return MortgageHomePage_Locators.SpecialistbuytoletLoginCardHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getLoginCardLinkPage(String header) {

		switch (header) {

		case "Residential mortgages broker portal":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.ResidentialmortgagesbrokerportalLoginCardLink);

		case "Specialist buy to let mortgage portal":
			return SeleniumDriver.getPageTitle(MortgageHomePage_Locators.SpecialistbuytoletLoginCardLink);
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

}
