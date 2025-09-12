package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.MotorFinanceLocators;
import utils.SeleniumDriver;

public class MotorFinance_Actions {

	MotorFinanceLocators motorFinanceLocators = null;
	
	public MotorFinance_Actions() {
		
		this.motorFinanceLocators = new MotorFinanceLocators();
	  PageFactory.initElements(SeleniumDriver.getDriver(), motorFinanceLocators);
	}
	
	public WebElement AcceptCookiesBtn() {
		return motorFinanceLocators.AcceptCookiesBtn;
	}
	
	public WebElement MotorfinanceLink() {
		return motorFinanceLocators.MotorfinanceLink;
	}
	
	public WebElement MotorFinanceLink() {
		return motorFinanceLocators.MotorFinanceLink;
	}
		
	public String MotorFinancePageHeader(String header) {

		switch (header) {

		case "Motor Finance":
			return SeleniumDriver.getPageTitle(motorFinanceLocators.MotorFinanceLink);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
}
