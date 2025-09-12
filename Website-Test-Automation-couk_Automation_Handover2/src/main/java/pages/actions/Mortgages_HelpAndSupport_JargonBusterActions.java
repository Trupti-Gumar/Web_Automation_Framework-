package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_HelpAndSupport_JargonBusterLocators;
import utils.SeleniumDriver;

public class Mortgages_HelpAndSupport_JargonBusterActions {
	Mortgages_HelpAndSupport_JargonBusterLocators JargonLocators = new Mortgages_HelpAndSupport_JargonBusterLocators();
	
	public Mortgages_HelpAndSupport_JargonBusterActions() {
		this.JargonLocators = new Mortgages_HelpAndSupport_JargonBusterLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), JargonLocators);
	}
	
	public String getCardName() {
		return JargonLocators.Cardname.getText();
	}
	
	public void clickOnCTAButton() {
		SeleniumDriver.clickElement(JargonLocators.CardCTAButton, "Jargon Buster");
	}
	
	public String getPageTitle() {
		return JargonLocators.PageTitle.getText();
	}
	
	public void ClickOnCTALink() {
		SeleniumDriver.clickElement(JargonLocators.CTALink, "Browse our mortgages");
	}
	
	public String getCTALinkText() {
	 return JargonLocators.CTALink.getText();
	}
	
	public String getCTAPageTitle() {
		return JargonLocators.CTAPageTitle.getText();
	}
}
