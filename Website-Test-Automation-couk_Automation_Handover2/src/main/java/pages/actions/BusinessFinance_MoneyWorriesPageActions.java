package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessFinance_MoneyWorriesPageLocators;
import utils.SeleniumDriver;

public class BusinessFinance_MoneyWorriesPageActions {

	BusinessFinance_MoneyWorriesPageLocators BF_MoneyWorriesPageLocators = null;

	public BusinessFinance_MoneyWorriesPageActions() {

		this.BF_MoneyWorriesPageLocators = new BusinessFinance_MoneyWorriesPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BF_MoneyWorriesPageLocators);
	}

	public WebElement MoneyWorriesLink() {

		return BF_MoneyWorriesPageLocators.MoneyWorriesLink;
	}

	public WebElement MastheadHeader() {

		return BF_MoneyWorriesPageLocators.MastheadHeader;
	}

	public WebElement ImageCopyLink3() {

		return BF_MoneyWorriesPageLocators.ImageCopyLink3;
	}

	public WebElement ImageCopyLink4() {

		return BF_MoneyWorriesPageLocators.ImageCopyLink4;
	}

	public String getImageCopyHeader(String titleNum) {

		switch (titleNum) {

		case "First":
			return BF_MoneyWorriesPageLocators.ImageCopyHeader1.getText();

		case "Second":
			return BF_MoneyWorriesPageLocators.ImageCopyHeader2.getText();

		case "Third":
			return BF_MoneyWorriesPageLocators.ImageCopyHeader3.getText();

		case "Fourth":
			return BF_MoneyWorriesPageLocators.ImageCopyHeader4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + titleNum);

		}
	}

}
