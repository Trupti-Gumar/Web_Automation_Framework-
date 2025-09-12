package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.eo.Se;
import pages.locators.HelpLocators;
import utils.SeleniumDriver;

public class HelpActions {

	HelpLocators helpLocators = new HelpLocators();

public HelpActions() {
	this.helpLocators = new HelpLocators();
	PageFactory.initElements(SeleniumDriver.getDriver(), helpLocators);
}

public WebElement AcceptCookiesBtn() {
	return helpLocators.AcceptCookiesBtn;
}

public WebElement HelpLink() {
	return helpLocators.HelpOption;
}

public WebElement HelpPageHeader() {
	return helpLocators.HelpPageHeader;
}

public String getCardHeader(String header) {

	switch (header) {

	case "Support tailored to you":
		return helpLocators.SupportTailoredToYouCardHeader.getText();
	case "Bereavement":
		return helpLocators.BereavementCardHeader.getText();
	case "Money worries":
		return helpLocators.MoneyWorriesCardHeader.getText();
	case "Personal savings help":
		return helpLocators.PersonalsavingshelpCardHeader.getText();
	case "Business savings help":
		return helpLocators.BusinesssavingshelpCardHeader.getText();
	case "Mortgages help":
		return helpLocators.MortgageshelpCardHeader.getText();
	case "Business finance help":
		return helpLocators.BusinessfinancehelpCardHeader.getText();
	case "Complaints":
		return helpLocators.ComplaintsCardHeader.getText();

	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public String getPageTitle(String pageTitle) {
	
	switch (pageTitle) {

	case "Tailored Support - How We Can Help You":
		return SeleniumDriver.getPageTitle(helpLocators.SupportTailoredToYouCardHeaderLink);		
	case "Bereavement Guide":
		return SeleniumDriver.getPageTitle(helpLocators.BereavementCardHeaderLink);
	case "Money Worries and the Cost of Living Crisis":
		return SeleniumDriver.getPageTitle(helpLocators.MoneyWorriesCardHeaderLink);
	case "Help & Support for Personal Savings Customers":
		return SeleniumDriver.getPageTitle(helpLocators.PersonalsavingshelpCardHeaderLink);
	case "Help & Support for Business Savings Customers":
		return SeleniumDriver.getPageTitle(helpLocators.BusinesssavingshelpCardHeaderLink);
	case "Mortgages Help & Support":
		return SeleniumDriver.getPageTitle(helpLocators.MortgageshelpCardHeaderLink);
	//case "Business Finance Solutions":
		//return SeleniumDriver.getPageTitle(helpLocators.BusinessfinancehelpCardHeaderLink);
	case "Business finance help":
	//case "Business Finance Solutions":
	    return SeleniumDriver.getPageTitle(helpLocators.BusinessfinancehelpCardHeaderLink);

	case "Our Complaint Process":
		return SeleniumDriver.getPageTitle(helpLocators.ComplaintsCardHeaderLink);	

	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}	

public String getImageCopyHeader(String header) {

	switch (header) {

	case "Protecting yourself from fraud":
		return helpLocators.ImageCopyHeader1.getText();
	case "Bank of England base rate changes":
		return helpLocators.ImageCopyHeader2.getText();
	case "Our purpose":
		return helpLocators.ImageCopyHeader3.getText();
	
	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public String getImageCopyLinks(String header) {

	switch (header) {

	case "Online security and protecting yourself from fraud":
		return helpLocators.ImageCopyLink1.getText();
	case "Find out more":
		return helpLocators.ImageCopyLink2.getText();
	case "Read more and download our Report to Society 2023":
		return helpLocators.ImageCopyLink3.getText();
	
	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}


public String getImageCopyPageTitle(String pageTitle) {
	
	switch (pageTitle) {

	case "Online Security and Fraud Protection":
		return SeleniumDriver.getPageTitle(helpLocators.ImageCopyLink1);		
	case "Bank of England Base Rate Changes":
		return SeleniumDriver.getPageTitle(helpLocators.ImageCopyLink2);
	case "Our purpose":
		return SeleniumDriver.getPageTitle(helpLocators.ImageCopyLink3);
	
	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}	

public WebElement MastheadBlackboxHeader() {
	return helpLocators.MastheadBlackboxHeader;
}

public String getMastheadBlackboxLinkPage(String header) {

	switch (header) {

	case "Contact us":
		return SeleniumDriver.getPageTitle(helpLocators.MastheadBlackboxButton);

	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}


}

