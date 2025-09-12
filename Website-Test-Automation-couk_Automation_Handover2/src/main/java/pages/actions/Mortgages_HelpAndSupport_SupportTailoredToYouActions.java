package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_HelpAndSupport_SupportTailoredToYouLocators;
import utils.SeleniumDriver;

public class Mortgages_HelpAndSupport_SupportTailoredToYouActions {
	
	Mortgages_HelpAndSupport_SupportTailoredToYouLocators SupportTailoredLocators = new Mortgages_HelpAndSupport_SupportTailoredToYouLocators();
	
	public Mortgages_HelpAndSupport_SupportTailoredToYouActions() {
		this.SupportTailoredLocators = new Mortgages_HelpAndSupport_SupportTailoredToYouLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), SupportTailoredLocators);
	}
	
	public String getCardOptionText() {
		return SeleniumDriver.GetElementText(SupportTailoredLocators.cardOption);
	}
	
	public void ClckedTheCard() {
		SeleniumDriver.clickElement(SupportTailoredLocators.CTACardOption, "Support tailored to you");	
	}
	
	public String getCardPageTitle() {
		return SeleniumDriver.GetElementText(SupportTailoredLocators.CardPageTitle);
	}
	public String getImageSectionHeader(String value) {
		switch(value) {
		case"How we can support you":
			return SupportTailoredLocators.ImageSection1.getText();
		case"Customers with money worries":
			return SupportTailoredLocators.ImageSection2.getText();	
		case"Bereavement":
			return SupportTailoredLocators.ImageSection3.getText();	
		default: 
			throw new IllegalArgumentException("Invalid value: " + value);
		}
	}
	
	public void ClickedonLink(String value) {
		switch(value) {
		case"Get in touch":
			SeleniumDriver.clickElement(SupportTailoredLocators.Link1, "Get in touch");
			break;
		case"Support for mortgage customers with money worries":
			SeleniumDriver.clickElement(SupportTailoredLocators.Link2, "Support for mortgage customers with money worries");
			break;
		case"Support for asset finance customers with money worries":
			SeleniumDriver.clickElement(SupportTailoredLocators.Link3, "Support for asset finance customers with money worries");
			break;
		case"Bereavement guide":
			SeleniumDriver.clickElement(SupportTailoredLocators.Link4, "Bereavement guide");
			break;
		}
	}
	
	public String getCardPageTitle(String value) {
		switch(value) {
		case"Contact us":
			return SeleniumDriver.GetElementText(SupportTailoredLocators.PageTitle1);
		case"404 - page not found":
			return SeleniumDriver.GetElementText(SupportTailoredLocators.PageTitle2);
		case"404 - page not found ":
			return SeleniumDriver.GetElementText(SupportTailoredLocators.PageTitle3);
		case"Bereavement":
			return SeleniumDriver.GetElementText(SupportTailoredLocators.PageTitle4);
		default:
			throw new IllegalArgumentException("Invalid Value :" + value);
		}
		
		}
	}

