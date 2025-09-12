package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageLocators;
import utils.SeleniumDriver;

public class Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageActions {

	Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageLocators ManageLocators = 
			new Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageLocators();

	public Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageActions() {
		this.ManageLocators = new Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ManageLocators);
	}
	
	public String getCardTitle() {
		return ManageLocators.cardOption.getText();
	}
	
	public void clickCardButton() {
		ManageLocators.cardOptionCTA.click();
	}
	
	public String getPageTitle() {
		return ManageLocators.PAgeTitle.getText();
	}
	
	public String getHeaderOnPage() {
		return ManageLocators.header.getText();
	}
	
	public String getSubheaderTitle(String value) {
		switch(value) {
		case"Can I make a change to my mortgage term?":
			return SeleniumDriver.GetElementText(ManageLocators.subheader1);
		case"Can I change my repayment type?":
			return SeleniumDriver.GetElementText(ManageLocators.subheader2);
		case"I'd like to move home - can I take my existing mortgage with me?":
			return SeleniumDriver.GetElementText(ManageLocators.subheader3);
		case"How do I change the name on my mortgage?":
			return SeleniumDriver.GetElementText(ManageLocators.subheader4);
		case"How do I add or remove someone from my account?":
			return SeleniumDriver.GetElementText(ManageLocators.subheader5);
		case"Can I take out additional borrowing?":
			return SeleniumDriver.GetElementText(ManageLocators.subheader6);
		case"How do I switch to a new mortgage rate?":
			return SeleniumDriver.GetElementText(ManageLocators.subheader7);
		case"I would like to start renting my home. Can you help?":
			return SeleniumDriver.GetElementText(ManageLocators.subheader8);
		default: 
				throw new IllegalArgumentException("Invalid Value : " + value);
		}
		
	}
}
