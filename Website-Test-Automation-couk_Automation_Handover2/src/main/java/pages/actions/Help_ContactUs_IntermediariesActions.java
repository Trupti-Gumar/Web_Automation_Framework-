package pages.actions;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.sl.In;
import pages.locators.Help_ContactUs_IntermediariesLocators;
import utils.SeleniumDriver;

public class Help_ContactUs_IntermediariesActions {

	
	Help_ContactUs_IntermediariesLocators IntermediariesLocators 
	= new Help_ContactUs_IntermediariesLocators();
	
	public Help_ContactUs_IntermediariesActions() {
		this.IntermediariesLocators = new Help_ContactUs_IntermediariesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), IntermediariesLocators);
	}
	
	public String getCardName() {
		return SeleniumDriver.GetElementText(IntermediariesLocators.IntermediariesCardname);
	}
	
	public void CardClicked() {
		SeleniumDriver.clickOnElement(IntermediariesLocators.IntermediariesCTAButton);
	}
	
	public String getIntermiadriesPageTitle() {
		return SeleniumDriver.GetElementText(IntermediariesLocators.IntermediariesPageTitle);
	}
	
	public String getCardheader(String value) {
		switch(value) {
		case"Residential and Buy to Let mortgages":
			return SeleniumDriver.GetElementText(IntermediariesLocators.Card1);
		case"Invoice finance":
			return SeleniumDriver.GetElementText(IntermediariesLocators.Card2);
		case"Asset finance":
			return SeleniumDriver.GetElementText(IntermediariesLocators.Card3);
		case"Commercial mortgages":
			return SeleniumDriver.GetElementText(IntermediariesLocators.Card4);
		case"Property development finance":
			return SeleniumDriver.GetElementText(IntermediariesLocators.Card5);
		default:
			throw new IllegalArgumentException("Invalid Value :" + value);
					
		}
	}
	
	public void ClickCards(String value)
	{
		switch(value) {
		case"Residential and Buy to Let mortgages":
			SeleniumDriver.clickElement(IntermediariesLocators.CardCTA1, "Residential and Buy to Let mortgages");
		case"Invoice finance":
			SeleniumDriver.clickElement(IntermediariesLocators.CardCTA2, "Invoice finance");
		case"Asset finance":
			SeleniumDriver.clickElement(IntermediariesLocators.CardCTA3, "Asset finance");
		case"Commercial mortgages":
			SeleniumDriver.clickElement(IntermediariesLocators.CardCTA4, "Commercial mortgages");
		case"Property development finance":
			SeleniumDriver.clickElement(IntermediariesLocators.CardCTA5, "Property development finance");
		}
	}
	
	public String getPageTitle() {
           SeleniumDriver.verifytheLink(IntermediariesLocators.CardCTA1);
           return SeleniumDriver.getDriver().getTitle();
		}
		
	}
