package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.Help_PersonalSavingsHelpLocators;
import utils.SeleniumDriver;

public class Help_PersonalSavingsHelpActions {

	Help_PersonalSavingsHelpLocators help_PersonalSavingsHelpLocators = new Help_PersonalSavingsHelpLocators();

public Help_PersonalSavingsHelpActions() {
	this.help_PersonalSavingsHelpLocators = new Help_PersonalSavingsHelpLocators();
	PageFactory.initElements(SeleniumDriver.getDriver(), help_PersonalSavingsHelpLocators);
}

public WebElement AcceptCookiesBtn() {
	return help_PersonalSavingsHelpLocators.AcceptCookiesBtn;
}

public WebElement HelpLink() {
	return help_PersonalSavingsHelpLocators.HelpOption;
}

public WebElement PersonalSavingsHelpCard() {
	return help_PersonalSavingsHelpLocators.PersonalSavingsHelpCardHeader;
}

public WebElement PersonalSavingsHelpPageHeader() {
	return help_PersonalSavingsHelpLocators.PersonalSavingsHelpPageHeader;
}

public String getFrequentQuestionHeader(String header) {

	switch (header) {

	case "Will my savings be covered by the FSCS?":
		return help_PersonalSavingsHelpLocators.FrequentQuestionText1.getText();
	case "How do I pay money into my account?":
		return help_PersonalSavingsHelpLocators.FrequentQuestionText2.getText();
	case "How do I log in?":
		return help_PersonalSavingsHelpLocators.FrequentQuestionText3.getText();
	case "How do I withdraw money from my account?":
		return help_PersonalSavingsHelpLocators.FrequentQuestionText4.getText();
	case "What happens at maturity of my Fixed Rate Account?":
		return help_PersonalSavingsHelpLocators.FrequentQuestionText5.getText();
	case "What does the base rate change mean for my interest rate?":
		return help_PersonalSavingsHelpLocators.FrequentQuestionText6.getText();
	case "What is a personal savings allowance?":
		return help_PersonalSavingsHelpLocators.FrequentQuestionText7.getText();

	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public String getFrequentQuestionPageTitle(String pageTitle) {
	
	switch (pageTitle) {

	case "Financial Services Compensation Scheme":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.FrequentQuestionText1);		
	case "What sort code and account reference will I need to deposit?":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.FrequentQuestionText2);
	case "How do I log in to my online account? - Internet Banking":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.FrequentQuestionText3);
	case "Withdrawing Money - Personal Savings FAQs":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.FrequentQuestionText4);
	case "What happens at maturity of my fixed rate account?":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.FrequentQuestionText5);
	case "Bank of England Base Rate Changes":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.FrequentQuestionText6);
	case "ISA: What is the personal savings allowance?":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.FrequentQuestionText7);
	
	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}

public String getCardHeader(String header) {

	switch (header) {

	case "Safer savings":
		return help_PersonalSavingsHelpLocators.CardHeader1.getText();
	case "Opening an account and paying money in":
		return help_PersonalSavingsHelpLocators.CardHeader2.getText();
	case "Using online banking":
		return help_PersonalSavingsHelpLocators.CardHeader3.getText();
	case "Statements and balances":
		return help_PersonalSavingsHelpLocators.CardHeader4.getText();
	case "Account maturities and transfers":
		return help_PersonalSavingsHelpLocators.CardHeader5.getText();
	case "Withdrawing money and closing your account":
		return help_PersonalSavingsHelpLocators.CardHeader6.getText();
	case "ISA help":
		return help_PersonalSavingsHelpLocators.CardHeader7.getText();

	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public String getPageTitle(String pageTitle) {
	
	switch (pageTitle) {

	case "Safer Savings - How We Protect You":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.CardHeaderLink1);		
	case "Account Opening and Depositing Funds FAQs":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.CardHeaderLink2);
	case "Internet Banking - Personal Savings FAQs":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.CardHeaderLink3);
	case "Statements & Balances - Personal Savings FAQs":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.CardHeaderLink4);
	case "Account maturities and transfers FAQs":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.CardHeaderLink5);
	case "Withdrawing Money - Personal Savings FAQs":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.CardHeaderLink6);
	case "ISA help - Personal Savings FAQs":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.CardHeaderLink7);	

	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}	

public String getImageCopyHeader(String header) {

	switch (header) {

	case "FSCS Protection":
		return help_PersonalSavingsHelpLocators.ImageCopyHeader1.getText();
	case "What to do when someone dies":
		return help_PersonalSavingsHelpLocators.ImageCopyHeader2.getText();
	
	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public String getImageCopyLinks(String header) {

	switch (header) {

	case "Find out more about FSCS Protection":
		return help_PersonalSavingsHelpLocators.ImageCopyLink1.getText();
	case "Bereavement guide":
		return help_PersonalSavingsHelpLocators.ImageCopyLink2.getText();
		
	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public String getImageCopyPageTitle(String pageTitle) {
	
	switch (pageTitle) {

	case "Financial Services Compensation Scheme":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.ImageCopyLink1);		
	case "Bereavement Guide - Personal Savings":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.ImageCopyLink2);
		
	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}	

public String getContactCardHeader(String header) {

	switch (header) {

	case "Call us":
		return help_PersonalSavingsHelpLocators.ContactCardHeader1.getText();
	case "Email us":
		return help_PersonalSavingsHelpLocators.ContactCardHeader2.getText();
	case "Message us":
		return help_PersonalSavingsHelpLocators.ContactCardHeader3.getText();
	case "Opening hours":
		return help_PersonalSavingsHelpLocators.ContactCardHeader4.getText();
	case "Contact us by post":
		return help_PersonalSavingsHelpLocators.ContactCardHeader5.getText();
	
	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public WebElement MastheadBlackboxHeader() {
	return help_PersonalSavingsHelpLocators.MastheadBlackboxHeader;
}

public String getMastheadBlackboxLinkPage(String pageTitle) {

	switch (pageTitle) {

	case "Forms & Documents - Personal Savings":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.MastheadBlackboxLink1);
	case "Bereavement Guide - Personal Savings":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.MastheadBlackboxLink2);	
	case "Financial Services Compensation Scheme":
		return SeleniumDriver.getPageTitle(help_PersonalSavingsHelpLocators.MastheadBlackboxLink3);	

	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}

}

