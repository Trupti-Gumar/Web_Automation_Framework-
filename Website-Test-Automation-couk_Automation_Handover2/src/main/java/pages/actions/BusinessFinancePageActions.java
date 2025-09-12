package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class BusinessFinancePageActions {

	BusinessFinancePageLocators businessFinancePageLocators = null;

	public BusinessFinancePageActions() {

		this.businessFinancePageLocators = new BusinessFinancePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), businessFinancePageLocators);
	}

	public String verifyBusinessFinanceOptions(String header) {

		switch (header) {

		case "Business finance":
			return businessFinancePageLocators.BusinessFinanceMenuItem.getText();

		case "Help and support":
			return businessFinancePageLocators.HelpAndSupportMenuItem.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public WebElement AcceptCookiesBtn() {
		return businessFinancePageLocators.AcceptCookiesBtn;
	}

	public WebElement BusinessFinanceNavigationLink() {

		return businessFinancePageLocators.BusinessFinanceNavigationLink;
	}
	
	public WebElement BusinessFinanceLink() {

		return businessFinancePageLocators.BusinessFinanceLink;
	}
	
	public WebElement BusinessFinanceHeader() {

		return businessFinancePageLocators.BusinessFinanceHeader;
	}

	public void clickOnBusinessFinanceOptionsLinks(String header) {

		switch (header) {

		case "Business finance":

			WebElement element = businessFinancePageLocators.BusinessFinanceMenuItem;
			((JavascriptExecutor) SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element);
			break;
		case "Help and support":

			WebElement element1 = businessFinancePageLocators.HelpAndSupportMenuItem;
			((JavascriptExecutor) SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element1);
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public String getBusinessFinanceOptionsPageTitle(String header) {

		switch (header) {

		case "Business Finance":

			return SeleniumDriver.getDriver().getTitle();

		case "Help and Support":

			return SeleniumDriver.getDriver().getTitle();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public String verifyBusinessFinanceSubOptions(String header) {

		switch (header) {

		case "Invoice finance":
			return businessFinancePageLocators.InvoiceFinanceMenuItem.getText();

		case "Asset finance":
			return businessFinancePageLocators.AssetFinanceMenuItem.getText();

		case "Commercial Real Estate":
			return businessFinancePageLocators.CommercialRealEstateMenuItem.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String verifyHelpAndSupportSubOptions(String header) {

		switch (header) {

		case "Invoice Finance":
			return businessFinancePageLocators.InvoiceFinanceHeader.getText();

		case "Asset Finance":
			return businessFinancePageLocators.AssetFinanceHeader.getText();

		case "Commercial Real Estate":
			return businessFinancePageLocators.CommercialRealEstateHeader.getText();

		

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

}
