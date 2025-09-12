package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class CashISAPageActions {

	CashISAPageLocators cashISAPageLocators = null;

	public CashISAPageActions() {
		this.cashISAPageLocators = new CashISAPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), cashISAPageLocators);
	}

	public void navigateToCashISAPage() {
		cashISAPageLocators.savingsNavLink.click();
		cashISAPageLocators.CashISALink.click();
	}

	public String getCashISAHeader() {
		return cashISAPageLocators.CashISAHeader.getText();
	}
	
	//View Buttons
	
	public WebElement OneYearISAViewLink() {
		return cashISAPageLocators.OneYearISAViewLink;
	}
	
	public WebElement TwoYearISAViewLink() {
		return cashISAPageLocators.TwoYearISAViewLink;
	}
	
	public WebElement ThreeYearISAViewLink() {
		return cashISAPageLocators.ThreeYearISAViewLink;
	}
	
	public WebElement ThirtyDaysNoticeCashISAViewLink() {
		return cashISAPageLocators.ThirtyDaysNoticeCashISAViewLink;
	}
	
	public WebElement applyButton() {
		return cashISAPageLocators.applyButton;
	}
	

	// Image Copy Section

	public String getImageCopySectionHeader1() {
		return cashISAPageLocators.ImageCopySectionHeader1.getText();
	}

	public String getImageCopySectionHeader2() {
		return cashISAPageLocators.ImageCopySectionHeader2.getText();
	}

	public String getImageCopySectionHeader3() {
		return cashISAPageLocators.ImageCopySectionHeader3.getText();
	}

	public void clickOnISATransferButton() {
		cashISAPageLocators.ISATransferButton.click();
	}
	// 1 year fixed rate cash ISA

	public void moveToOneYearFixedRateISAProductCard() {
		SeleniumDriver.moveToElement(cashISAPageLocators.OneYearFixedRateISATermValue);
	}

	public String getOneYearFixedRateISAProductCardInterestValue() {
		return cashISAPageLocators.OneYearFixedRateISAInterestValue.getText();
	}

	public String getOneYearFixedRateISAOpeningBalanceValue() {
		String string = cashISAPageLocators.OneYearFixedRateISAOpeningBalanceValue.getText();
		String[] splitString = string.replace("£", "").split("-");
		String resString = splitString[0] + "-" + splitString[1];
		return resString;
	}

	public String getOneYearFixedRateISATermValue() {
		return cashISAPageLocators.OneYearFixedRateISATermValue.getText();
	}

	public String getOneYearFixedRateISAHeader() {
		return cashISAPageLocators.OneYearFixedRateISAHeader.getText();
	}

	// 2 year fixed rate cash ISA

	public void moveToTwoYearFixedRateISAProductCard() {
		SeleniumDriver.moveToElement(cashISAPageLocators.TwoYearFixedRateISATermValue);
	}

	public String getTwoYearFixedRateISAProductCardInterestValue() {
		return cashISAPageLocators.TwoYearFixedRateISAInterestValue.getText();
	}

	public String getTwoYearFixedRateISAOpeningBalanceValue() {
		String string = cashISAPageLocators.TwoYearFixedRateISAOpeningBalanceValue.getText();
		String[] splitString = string.replace("£", "").split("-");
		String resString = splitString[0] + "-" + splitString[1];
		return resString;
	}

	public String getTwoYearFixedRateISATermValue() {
		return cashISAPageLocators.TwoYearFixedRateISATermValue.getText();
	}

	public String getTwoYearFixedRateISAHeader() {
		return cashISAPageLocators.TwoYearFixedRateISAHeader.getText();
	}

	// 3 year fixed rate cash ISA

	public void moveToThreeYearFixedRateISAProductCard() {
		SeleniumDriver.moveToElement(cashISAPageLocators.ThreeYearFixedRateISATermValue);
	}

	public String getThreeYearFixedRateISAProductCardInterestValue() {
		return cashISAPageLocators.ThreeYearFixedRateISAInterestValue.getText();
	}

	public String getThreeYearFixedRateISAOpeningBalanceValue() {
		String string = cashISAPageLocators.ThreeYearFixedRateISAOpeningBalanceValue.getText();
		String[] splitString = string.replace("£", "").split("-");
		String resString = splitString[0] + "-" + splitString[1];
		return resString;
	}

	public String getThreeYearFixedRateISATermValue() {
		return cashISAPageLocators.ThreeYearFixedRateISATermValue.getText();
	}

	public String getThreeYearFixedRateISAHeader() {
		return cashISAPageLocators.ThreeYearFixedRateISAHeader.getText();
	}

	// 30 day notice cash ISA

	public void moveToThirtyDaysNoticeCashISA() {
		SeleniumDriver.moveToElement(cashISAPageLocators.ThirtyDaysNoticeCashISATermValue);
	}

	public String getThirtyDaysNoticeCashISAInterestValue() {
		return cashISAPageLocators.ThirtyDaysNoticeCashISAInterestValue.getText();
	}

	public String getThirtyDaysNoticeCashISAOpeningBalanceValue() {
		String string = cashISAPageLocators.ThirtyDaysNoticeCashISAOpeningBalanceValue.getText();
		String[] splitString = string.replace("£", "").split("-");
		String resString = splitString[0] + "-" + splitString[1];
		return resString;
	}

	public String getThirtyDaysNoticeCashISATermValue() {
		return cashISAPageLocators.ThirtyDaysNoticeCashISATermValue.getText();
	}

	public String getThirtyDaysNoticeCashISAHeader() {
		return cashISAPageLocators.ThirtyDaysNoticeCashISAHeader.getText();
	}
	
	//FAQ
	
	public String getFAQHeader() {
		return cashISAPageLocators.FAQHeader.getText();
	}
	
	public boolean verifyAccordianOnthePage() {
		
		cashISAPageLocators.AccordianLink.click();
		return cashISAPageLocators.AccordianTextBlock.isDisplayed();
	}
	
	public String getMoreCardHeaderOnFAQ() {
		return cashISAPageLocators.MoreCardHeaderOnFAQ.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
