package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.MotoNovoFinanceLocators;
import utils.SeleniumDriver;

public class MotoNovoFinance_Actions {

	MotoNovoFinanceLocators motoNovoFinanceLocators = null;
	
	public MotoNovoFinance_Actions() {
		
		this.motoNovoFinanceLocators = new MotoNovoFinanceLocators();
	  PageFactory.initElements(SeleniumDriver.getDriver(), motoNovoFinanceLocators);
	}
	
	public WebElement AcceptCookiesBtn() {
		return motoNovoFinanceLocators.AcceptCookiesBtn;
	}
	
	public WebElement MotorfinanceLink() {
		return motoNovoFinanceLocators.MotorfinanceLink;
	}
	
	public WebElement MotoNovoFinanceLink() {
		return motoNovoFinanceLocators.MotoNovoFinanceLink;
	}
		
	public String MotoNovoFinancePageHeader(String header) {
		
		switch (header) {
		

		case "Motonovo Finance":
			return SeleniumDriver.getPageTitle(motoNovoFinanceLocators.MotoNovoFinancePageHeader);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getMotoNovoFinancePageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Motonovo Finance":
			return SeleniumDriver.getPageTitle(motoNovoFinanceLocators.MotoNovoFinanceLink);
					
				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	
}
