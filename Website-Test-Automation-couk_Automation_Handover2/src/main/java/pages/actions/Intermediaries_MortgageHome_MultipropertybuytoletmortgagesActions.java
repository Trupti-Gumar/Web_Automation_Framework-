package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_MultipropertybuytoletmortgagesLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_MultipropertybuytoletmortgagesActions {

	Intermediaries_MortgageHome_MultipropertybuytoletmortgagesLocators MultipropertybuytoletmortgagesLocators = null;

	public Intermediaries_MortgageHome_MultipropertybuytoletmortgagesActions() {

		this.MultipropertybuytoletmortgagesLocators = new Intermediaries_MortgageHome_MultipropertybuytoletmortgagesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), MultipropertybuytoletmortgagesLocators);
	}

	public WebElement MultipropertybuytoletmortgagesLink() {

		return MultipropertybuytoletmortgagesLocators.MultipropertybuytoletmortgagesLink;
	}

	public WebElement MastheadHeader() {

		return MultipropertybuytoletmortgagesLocators.MastheadHeader;
	}

	public WebElement MastheadBlackboxHeader() {

		return MultipropertybuytoletmortgagesLocators.MastheadBlackboxHeader;
	}

	public String getMastheadBlackboxLinkPage(String header) {

		switch (header) {

		case "Documents":
			return SeleniumDriver.getPageTitle(MultipropertybuytoletmortgagesLocators.MastheadBlackboxLink1);

		case "Calculators":
			return SeleniumDriver.getPageTitle(MultipropertybuytoletmortgagesLocators.MastheadBlackboxLink2);

		case "Log in to submit business":
			return SeleniumDriver.getPageTitle(MultipropertybuytoletmortgagesLocators.MastheadBlackboxLink3);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getUSPHeader(String header) {

		switch (header) {

		case "One application":
			return MultipropertybuytoletmortgagesLocators.USPHeader1.getText();

		case "Packaging and underwriting":
			return MultipropertybuytoletmortgagesLocators.USPHeader2.getText();

		case "Expert team":
			return MultipropertybuytoletmortgagesLocators.USPHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return MultipropertybuytoletmortgagesLocators.ImageCopyHeader1.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}

	public String getUsfulLinkPageTitle(String header) {

		switch (header) {

		case "View our latest turnaround times":
			return SeleniumDriver.getPageTitle(MultipropertybuytoletmortgagesLocators.UsefulLink1);

		case "Product and eligibility guides":
			return SeleniumDriver.getPageTitle(MultipropertybuytoletmortgagesLocators.UsefulLink2);

		case "Affordability calculators":
			return SeleniumDriver.getPageTitle(MultipropertybuytoletmortgagesLocators.UsefulLink3);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getLoginCardHeader(String header) {

		switch (header) {

		case "Specialist buy to let mortgage portal":
			return MultipropertybuytoletmortgagesLocators.SpecialistbuytoletLoginCardHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getLoginCardLinkPage(String header) {

		switch (header) {

		case "Specialist buy to let mortgage portal":
			return SeleniumDriver.getPageTitle(MultipropertybuytoletmortgagesLocators.SpecialistbuytoletLoginCardLink);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}


}
