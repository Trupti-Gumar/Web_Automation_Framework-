package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.eo.Se;
import pages.locators.Mortgages_HelpAndSupportLocators;
import utils.SeleniumDriver;

public class Mortgages_HelpAndSupportActions {

	Mortgages_HelpAndSupportLocators helpLocators = new Mortgages_HelpAndSupportLocators();

public Mortgages_HelpAndSupportActions() {
	this.helpLocators = new Mortgages_HelpAndSupportLocators();
	PageFactory.initElements(SeleniumDriver.getDriver(), helpLocators);
}


public String getDropdwonOption() {
	return SeleniumDriver.GetElementText(helpLocators.HelpandSupportOption);
}

public void clicktheLink() {
SeleniumDriver.clickElement(helpLocators.HelpandSupportOption, "Help and Support");
}

public String getPageTitleHeader() {
	return helpLocators.redirectedPageTitle.getText();
}

public void navigateToHelpPage() {
	SeleniumDriver.clickElement(helpLocators.HelpandSupportOption, "Help and Support");
}

public String getCardHeaderOnPage(String value) {
	switch(value) {
	case"Supporting you":
		return SeleniumDriver.GetElementText(helpLocators.CardHeader1);
	case"Bereavement guide":
		return SeleniumDriver.GetElementText(helpLocators.CardHeader2);
	case"Cost of living":
		return SeleniumDriver.GetElementText(helpLocators.CardHeader3);
	case"Personal savings help":
		return SeleniumDriver.GetElementText(helpLocators.CardHeader4);
	case"Business savings help":
		return SeleniumDriver.GetElementText(helpLocators.CardHeader5);
	case"Mortgages help":
		return SeleniumDriver.GetElementText(helpLocators.CardHeader6);
	case"Business finance":
		return SeleniumDriver.GetElementText(helpLocators.CardHeader7);
	case"Complaint process":
		return SeleniumDriver.GetElementText(helpLocators.CardHeader8);
	default:
		throw new IllegalArgumentException("Invalid value: " + value);
	
	}
  }

public String getImageSectionHeader(String value) {
	switch(value) {
	case"Protecting yourself from fraud":
		return SeleniumDriver.GetElementText(helpLocators.ImageSectionCard1);
	case"Bank of England base rate changes":
		return SeleniumDriver.GetElementText(helpLocators.ImageSectionCard2);	
	default:
		throw new IllegalArgumentException("Invalid value: " + value);		
	}
	
}

public void getBlackBoxOption(String header) {
	String Actual = SeleniumDriver.GetElementText(helpLocators.BlackBoxHeader);
	String Expected = header;
	assertEquals(Actual, Expected);
}

public void navigateToPageTitle(String PageTitle) {
	SeleniumDriver.clickElement(helpLocators.clickOnBlackOption, "Contact Us");
	String Actual = SeleniumDriver.GetElementText(helpLocators.PageTitleHeader);
	String Expected = PageTitle;
	assertEquals(Actual, Expected);
}

public void clickOnCardHeader(String header) {
	SeleniumDriver.clickElement(helpLocators.CardHeader4, "Card Options");
	String Actual = SeleniumDriver.GetElementText(helpLocators.CardPageTitleheader);
	String Expected = header;
	assertEquals(Actual, Expected);
}
}

