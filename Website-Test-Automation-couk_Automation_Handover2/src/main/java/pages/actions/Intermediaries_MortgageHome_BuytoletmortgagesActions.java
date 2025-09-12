package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_BuytoletmortgagesLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_BuytoletmortgagesActions {

	Intermediaries_MortgageHome_BuytoletmortgagesLocators BuytoletmortgagesLocators = null;

	public Intermediaries_MortgageHome_BuytoletmortgagesActions() {

		this.BuytoletmortgagesLocators = new Intermediaries_MortgageHome_BuytoletmortgagesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BuytoletmortgagesLocators);
	}

	public WebElement BuytoletmortgagesLink() {

		return BuytoletmortgagesLocators.BuytoletmortgagesLink;
	}

	public WebElement MastheadHeader() {

		return BuytoletmortgagesLocators.MastheadHeader;
	}

	public WebElement MastheadBlackboxHeader() {

		return BuytoletmortgagesLocators.MastheadBlackboxHeader;
	}

	public WebElement CTABanner() {

		return BuytoletmortgagesLocators.CTABanner;
	}

	public String getMastheadBlackboxLinkPage(String header) {

		switch (header) {

		case "Products and rates - download documents":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.MastheadBlackboxLink1);

		case "Affordability calculator":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.MastheadBlackboxLink2);

		case "Log in to submit business":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.MastheadBlackboxLink3);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getUSPHeader(String header) {

		switch (header) {

		case "Buy to let for limited companies":
			return BuytoletmortgagesLocators.USPHeader1.getText();

		case "Multiple properties on one application":
			return BuytoletmortgagesLocators.USPHeader2.getText();

		case "We lend on most property types":
			return BuytoletmortgagesLocators.USPHeader3.getText();

		case "Buy to let mortgages for smaller landlords":
			return BuytoletmortgagesLocators.USPHeader4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return BuytoletmortgagesLocators.ImageCopyHeader1.getText();

	//	case "Second":
	//		return ResidentialOwnerOccupiedLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}

	public String getUsfulLinkPageTitle(String header) {

		switch (header) {

		case "Platinum Broker service proposition":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.UsefulLink1);

		case "View our latest updates and news":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.UsefulLink2);

		case "Product switch":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.UsefulLink3);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getCardHeader(String header) {

		switch (header) {

		case "View all buy to let documents":
			return BuytoletmortgagesLocators.ViewallbuytoletdocumentsHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Buy to Let Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.ViewallbuytoletdocumentsCardLink);

				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	
	public String getLoginCardHeader(String header) {

		switch (header) {

		case "Residential mortgages broker portal":
			return BuytoletmortgagesLocators.ResidentialmortgagesbrokerportalLoginCardHeader.getText();

		case "Specialist buy to let mortgage portal":
			return BuytoletmortgagesLocators.SpecialistbuytoletLoginCardHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getLoginCardLinkPage(String header) {

		switch (header) {

		case "Residential mortgages broker portal":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.ResidentialmortgagesbrokerportalLoginCardLink);

		case "Specialist buy to let mortgage portal":
			return SeleniumDriver.getPageTitle(BuytoletmortgagesLocators.SpecialistbuytoletLoginCardLink);
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}


}
