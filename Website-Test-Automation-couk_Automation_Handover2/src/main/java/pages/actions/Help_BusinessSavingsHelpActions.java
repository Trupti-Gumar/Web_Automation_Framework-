package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.Help_BusinessSavingsHelpLocators;
import utils.SeleniumDriver;

public class Help_BusinessSavingsHelpActions {

	Help_BusinessSavingsHelpLocators help_BusinessSavingsHelpLocators = new Help_BusinessSavingsHelpLocators();

public Help_BusinessSavingsHelpActions() {
	this.help_BusinessSavingsHelpLocators = new Help_BusinessSavingsHelpLocators();
	PageFactory.initElements(SeleniumDriver.getDriver(), help_BusinessSavingsHelpLocators);
}

public WebElement AcceptCookiesBtn() {
	return help_BusinessSavingsHelpLocators.AcceptCookiesBtn;
}

public WebElement HelpLink() {
	return help_BusinessSavingsHelpLocators.HelpOption;
}

public WebElement BusinessSavingsHelpCard() {
	return help_BusinessSavingsHelpLocators.BusinessSavingsHelpCardHeader;
}

public WebElement BusinessSavingsHelpPageHeader() {
	return help_BusinessSavingsHelpLocators.BusinessSavingsHelpPageHeader;
}

public String getPopularQuestionHeader(String header) {

	switch (header) {

	case "How do I pay money into my Business Savings Account?":
		return help_BusinessSavingsHelpLocators.PopularQuestionText1.getText();
	case "What happens when my Fixed Rate account matures?":
		return help_BusinessSavingsHelpLocators.PopularQuestionText2.getText();
	case "What do I do if I've forgotten my password or username?":
		return help_BusinessSavingsHelpLocators.PopularQuestionText3.getText();
	case "How do I withdraw money from my Business Savings Account?":
		return help_BusinessSavingsHelpLocators.PopularQuestionText4.getText();
	case "How do I set up additional users on my account?":
		return help_BusinessSavingsHelpLocators.PopularQuestionText5.getText();
	case "What is a significant owner?":
		return help_BusinessSavingsHelpLocators.PopularQuestionText6.getText();

	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public String getPopularQuestionPageTitle(String pageTitle) {
	
	switch (pageTitle) {

	case "How do I pay money into my Business Savings Account?":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.PopularQuestionText1);		
	case "What happens when my Fixed Rate savings account matures?":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.PopularQuestionText2);
	case "What do I do if I've forgotten my password or username?":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.PopularQuestionText3);
	case "How do I withdraw money from my Business Savings Account?":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.PopularQuestionText4);
	case "How do I set up multiple users on my Business Savings Account?":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.PopularQuestionText5);
	case "What's a controlling person or a significant owner?":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.PopularQuestionText6);
	
	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}

public String getCardHeader(String header) {

	switch (header) {

	case "Applications":
		return help_BusinessSavingsHelpLocators.CardHeader1.getText();
	case "Transfers and paying money in":
		return help_BusinessSavingsHelpLocators.CardHeader2.getText();
	case "Internet banking":
		return help_BusinessSavingsHelpLocators.CardHeader3.getText();
	case "Withdrawing money":
		return help_BusinessSavingsHelpLocators.CardHeader4.getText();
	case "Maturity":
		return help_BusinessSavingsHelpLocators.CardHeader5.getText();
	case "Closing your account":
		return help_BusinessSavingsHelpLocators.CardHeader6.getText();
	case "Security":
		return help_BusinessSavingsHelpLocators.CardHeader7.getText();

	default:
		throw new IllegalArgumentException("Invalid value: " + header);

	}
}

public String getPageTitle(String pageTitle) {
	
	switch (pageTitle) {

	case "Applications - Business Savings FAQs":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.CardHeaderLink1);		
	case "Transfers & Paying In - Business Savings FAQs":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.CardHeaderLink2);
	case "Internet Banking - Business Savings FAQs":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.CardHeaderLink3);
	case "Withdrawing Money - Business Savings FAQs":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.CardHeaderLink4);
	case "Maturity - Business Savings FAQs":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.CardHeaderLink5);
	case "Closing an Account - Business Savings FAQs":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.CardHeaderLink6);
	case "Security - Business Savings FAQs":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.CardHeaderLink7);	

	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}	

public String getForgottenPasswordResetPageTitle(String pageTitle) {

	switch (pageTitle) {

	case "Aldermore - Business Savings Customer Portal (dev)":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.ForgottenPasswordResetButton);
		//return help_BusinessSavingsHelpLocators.ForgottenPasswordResetButton.getText();
		
	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
} 

public WebElement MastheadBlackboxHeader() {
	return help_BusinessSavingsHelpLocators.MastheadBlackboxHeader;
}

public String getMastheadBlackboxLinkPage(String pageTitle) {

	switch (pageTitle) {

	case "Business savings forms and documents - Aldermore bank":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.MastheadBlackboxLink1);
	case "Log in":
		return SeleniumDriver.getPageTitle(help_BusinessSavingsHelpLocators.MastheadBlackboxLink2);		

	default:
		throw new IllegalArgumentException("Invalid value: " + pageTitle);

	}
}

}

