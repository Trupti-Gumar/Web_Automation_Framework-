package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.MotorFinancebyMotoNovoLocators;
import utils.SeleniumDriver;

public class MotorFinancebyMotoNovo_Actions {

	MotorFinancebyMotoNovoLocators motorFinancebyMotoNovoLocators = null;
	
	public MotorFinancebyMotoNovo_Actions() {
		
		this.motorFinancebyMotoNovoLocators = new MotorFinancebyMotoNovoLocators();
	  PageFactory.initElements(SeleniumDriver.getDriver(), motorFinancebyMotoNovoLocators);
	}
	
	public WebElement AcceptCookiesBtn() {
		return motorFinancebyMotoNovoLocators.AcceptCookiesBtn;
	}
	
	public WebElement MotorfinanceLink() {
		return motorFinancebyMotoNovoLocators.MotorfinanceLink;
	}
	
	public WebElement MotorFinancebyMotoNovoLink() {
		return motorFinancebyMotoNovoLocators.MotorFinancebyMotoNovoLink;
	}
	
	public WebElement MotorFinancebyMotoNovoPageHeader() {
		return motorFinancebyMotoNovoLocators.MotorFinancebyMotoNovoPageHeader;
	}
	
	public WebElement MastheadBlackboxHeader() {
		return motorFinancebyMotoNovoLocators.MastheadBlackboxHeader;
	}
	
	public String getMastheadBlackboxLinkPage(String header) {

		switch (header) {

		case "Find a car":
			return SeleniumDriver.getPageTitle(motorFinancebyMotoNovoLocators.MastheadBlackboxLink1);

		case "Visit website":
			return SeleniumDriver.getPageTitle(motorFinancebyMotoNovoLocators.MastheadBlackboxLink2);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
}
