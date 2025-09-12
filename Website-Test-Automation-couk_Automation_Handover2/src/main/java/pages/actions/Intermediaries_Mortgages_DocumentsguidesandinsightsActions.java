package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_Mortgages_DocumentsguidesandinsightsLocators;
import utils.SeleniumDriver;

public class Intermediaries_Mortgages_DocumentsguidesandinsightsActions {

	Intermediaries_Mortgages_DocumentsguidesandinsightsLocators DocumentsguidesandinsightsLocators = null;

	public Intermediaries_Mortgages_DocumentsguidesandinsightsActions() {

		this.DocumentsguidesandinsightsLocators = new Intermediaries_Mortgages_DocumentsguidesandinsightsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), DocumentsguidesandinsightsLocators);
	}

	public WebElement DocumentsguidesandinsightsLink() {

		return DocumentsguidesandinsightsLocators.DocumentsguidesandinsightsLink;
	}

	public WebElement MastheadHeader() {

		return DocumentsguidesandinsightsLocators.MastheadHeader;
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Residential mortgage documents":
			return DocumentsguidesandinsightsLocators.CardHeader1.getText();
			
		case "Buy to let mortgage documents":
			return DocumentsguidesandinsightsLocators.CardHeader2.getText();
			
		case "Commercial mortgage documents":
			return DocumentsguidesandinsightsLocators.CardHeader3.getText();
			
		case "Product switching":
			return DocumentsguidesandinsightsLocators.CardHeader4.getText();
			
		case "Conveyancing documents":
			return DocumentsguidesandinsightsLocators.CardHeader5.getText();
			
		case "Latest insight and news - Intermediaries blog":
			return DocumentsguidesandinsightsLocators.CardHeader6.getText();
			
		case "See our latest service levels":
			return DocumentsguidesandinsightsLocators.CardHeader7.getText();
			
		case "Speak to our team":
			SeleniumDriver.waitForElementClickable(DocumentsguidesandinsightsLocators.CardHeader8);
			return DocumentsguidesandinsightsLocators.CardHeader8.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Residential Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(DocumentsguidesandinsightsLocators.CardLink1);
			
		case "Buy to Let Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(DocumentsguidesandinsightsLocators.CardLink2);
			
		case "Commercial Mortgage Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(DocumentsguidesandinsightsLocators.CardLink3);
			
		case "Mortgage Product Switch Documents - Intermediaries":
			return SeleniumDriver.getPageTitle(DocumentsguidesandinsightsLocators.CardLink4);
			
		case "Conveyancing guidelines - Intermediaries":
			return SeleniumDriver.getPageTitle(DocumentsguidesandinsightsLocators.CardLink5);
			
		case "Our Latest Mortgage Turnaround Times":
			return SeleniumDriver.getPageTitle(DocumentsguidesandinsightsLocators.CardLink6);

		case "Residential & Buy to Let Mortgages Contacts for Intermediaries":
			return SeleniumDriver.getPageTitle(DocumentsguidesandinsightsLocators.CardLink7);
			
			default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	

}
