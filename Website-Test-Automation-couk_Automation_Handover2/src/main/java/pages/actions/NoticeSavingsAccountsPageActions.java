package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class NoticeSavingsAccountsPageActions {

	NoticeSavingsAccountsPageLocators noticeSavingsAccountsPageLocators = null;

	public NoticeSavingsAccountsPageActions() {
		this.noticeSavingsAccountsPageLocators = new NoticeSavingsAccountsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), noticeSavingsAccountsPageLocators);
	}

	public void navigateToToNoticeSavingsAccounts() {
		//noticeSavingsAccountsPageLocators.SavingsNavLink.click();
		//noticeSavingsAccountsPageLocators.NoticeSavingsAccountLink.click();
		
		SeleniumDriver.clickElementWithJavaScript(noticeSavingsAccountsPageLocators.SavingsNavLink);
		SeleniumDriver.clickElementWithJavaScript(noticeSavingsAccountsPageLocators.NoticeSavingsAccountLink);
	}

	public String getNoticeSavingsAccountHeader() {
		return noticeSavingsAccountsPageLocators.NoticeSavingsAccountHeader.getText();
	}

	// 30 day notice account card values

	public void moveToThirtyDayNoiceAccountProductCard() {
		SeleniumDriver.moveToElement(noticeSavingsAccountsPageLocators.ThirtyDaysTermValue);
	}

	public String getThirtyDaysInterestValue() {
		return noticeSavingsAccountsPageLocators.ThirtyDaysInterestValue.getText();
	}

	public String getThirtyDaysOpeningBalanceValue() {
		String string = noticeSavingsAccountsPageLocators.ThirtyDaysOpeningBalanceValue.getText();
		String resultString =string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getThirtyDaysTermValue() {
		return noticeSavingsAccountsPageLocators.ThirtyDaysTermValue.getText();
	}

	public String getThirtyDaysNoticeAccountHeader() {
		return noticeSavingsAccountsPageLocators.ThirtyDaysNoticeAccountHeader.getText();
	}

	// 120 day notice account card values

	public void moveTo120DayNoiceAccountProductCard() {
		SeleniumDriver.moveToElement(noticeSavingsAccountsPageLocators.days120TermValue);
	}

	public String get120DaysInterestValue() {
		return noticeSavingsAccountsPageLocators.days120InterestValue.getText();
	}

	public String get120DaysOpeningBalanceValue() {
		String string = noticeSavingsAccountsPageLocators.days120OpeningBalanceValue.getText();
		String resultString =string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String get120DaysTermValue() {
		return noticeSavingsAccountsPageLocators.days120TermValue.getText();
	}

	public String getOneTwentyDaysNoticeAccHeader() {
		return noticeSavingsAccountsPageLocators.OneTwentyDaysNoticeAccHeader.getText();
	}

	// USP Section

	public boolean isUSPSectionPresent() {
		return noticeSavingsAccountsPageLocators.USPSection.isDisplayed();
	}

	// Image Copy Section

	public String getImageCopySectionHeader1() {
		return noticeSavingsAccountsPageLocators.ImageCopySectionHeader1.getText();
	}

	public String getImageCopySectionHeader2() {
		return noticeSavingsAccountsPageLocators.ImageCopySectionHeader2.getText();
	}

	public void clickOnFindOutMoreBuuton() {
		noticeSavingsAccountsPageLocators.FindOutMoreLinkforFSCS.click();
	}

	public void moveToImageCopySectionHeader1() {
		SeleniumDriver.moveToElement(noticeSavingsAccountsPageLocators.ImageCopySectionHeader1);
	}

	public void moveToImageCopySectionHeader2() {
		SeleniumDriver.moveToElement(noticeSavingsAccountsPageLocators.ImageCopySectionHeader2);
	}

	// Notice account FAQs

	public String getFAQHeader() {
		return noticeSavingsAccountsPageLocators.FAQHeader.getText();
	}

	public void ClickOnAccordianHeader() {
		noticeSavingsAccountsPageLocators.AccordianHeader.click();
	}

	public boolean isAccordainTextBlockPresent() {
		return noticeSavingsAccountsPageLocators.AccordianTextBlock.isDisplayed();
	}

}
