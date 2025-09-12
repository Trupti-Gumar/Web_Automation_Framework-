package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_Mortgages_ToolsandlatestinformationLocators;
import utils.SeleniumDriver;

public class Intermediaries_Mortgages_ToolsandlatestinformationActions {

	Intermediaries_Mortgages_ToolsandlatestinformationLocators ToolsandlatestinformationLocators = null;

	public Intermediaries_Mortgages_ToolsandlatestinformationActions() {

		this.ToolsandlatestinformationLocators = new Intermediaries_Mortgages_ToolsandlatestinformationLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ToolsandlatestinformationLocators);
	}

	public WebElement ToolsandlatestinformationLink() {

		return ToolsandlatestinformationLocators.ToolsandlatestinformationLink;
	}

	public WebElement MastheadHeader() {

		return ToolsandlatestinformationLocators.MastheadHeader;
	}

	public String getCardHeader(String header) {

		switch (header) {

		case "Affordability calculators":
			return ToolsandlatestinformationLocators.CardHeader1.getText();
			
		case "Latest service levels":
			return ToolsandlatestinformationLocators.CardHeader2.getText();
			
		case "Latest news and updates":
			return ToolsandlatestinformationLocators.CardHeader3.getText();
			
		case "Residential and Buy to Let contact information":
			return ToolsandlatestinformationLocators.CardHeader4.getText();
			
		case "Commercial mortgages contact information":
			return ToolsandlatestinformationLocators.CardHeader5.getText();
			
		case "Platinum Broker service proposition":
			return ToolsandlatestinformationLocators.CardHeader6.getText();
			
		case "We're backing you and your clients":
			return ToolsandlatestinformationLocators.CardHeader7.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Affordability Calculators - Intermediaries":
			return SeleniumDriver.getPageTitle(ToolsandlatestinformationLocators.CardLink1);
			
		case "Our Latest Mortgage Turnaround Times":
			return SeleniumDriver.getPageTitle(ToolsandlatestinformationLocators.CardLink2);
			
		case "Latest Mortgage Updates for Intermediaries":
			return SeleniumDriver.getPageTitle(ToolsandlatestinformationLocators.CardLink3);
			
		case "Residential & Buy to Let Mortgages Contacts for Intermediaries":
			return SeleniumDriver.getPageTitle(ToolsandlatestinformationLocators.CardLink4);
			
		case "Commercial Mortgages Contact Information for Intermediaries":
			return SeleniumDriver.getPageTitle(ToolsandlatestinformationLocators.CardLink5);
			
		case "Platinum Broker Service Propositions":
			return SeleniumDriver.getPageTitle(ToolsandlatestinformationLocators.CardLink6);

		case "Core Propositions for Mortgage Intermediaries":
			return SeleniumDriver.getPageTitle(ToolsandlatestinformationLocators.CardLink7);
			
				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	

}
