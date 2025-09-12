package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;

public class LoginPageActions {
	
	LoginPageLocators loginPageLocators = null;
	
	public LoginPageActions() {

		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);
	}
	
	public WebElement AcceptCookiesBtn() {
		return loginPageLocators.AcceptCookiesBtn;
	}
	
	public WebElement LoginLink() {
		return loginPageLocators.LoginLink;
	}

	public WebElement MastheadHeader() {

		return loginPageLocators.MastheadHeader;
	}
	
	public String getNavigationBarOptions(String header) {

		switch (header) {

		case "All":
			return loginPageLocators.TabHeader1.getText();
			
		case "Savings":
			return loginPageLocators.TabHeader2.getText();
			
		case "Mortgages":
			return loginPageLocators.TabHeader3.getText();
			
		case "Business finance":
			return loginPageLocators.TabHeader4.getText();
					
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getTextHeaders(String header) {

		switch (header) {

		case "Savings":
			return loginPageLocators.TextHeader1.getText();
			
		case "Mortgages":
			return loginPageLocators.TextHeader2.getText();
			
		case "Business finance":
			return loginPageLocators.TextHeader3.getText();
							
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getCardHeader(String header) {

		switch (header) {

		case "Personal savings internet banking":
			return loginPageLocators.CardHeader1.getText();
			
		case "Business savings internet banking":
			return loginPageLocators.CardHeader2.getText();
			
		case "Residential mortgages broker portal":
			return loginPageLocators.CardHeader3.getText();
			
		case "Specialist buy to let mortgage portal":
			return loginPageLocators.CardHeader4.getText();
			
		case "Asset finance Asset Backer":
			return loginPageLocators.CardHeader5.getText();
			
		case "Invoice finance E3":
			return loginPageLocators.CardHeader6.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Login":
			return SeleniumDriver.getPageTitle(loginPageLocators.CardLink1);
			
		case "Log in":
			return SeleniumDriver.getPageTitle(loginPageLocators.CardLink2);
			
		case "Aldermore Residential - Login":
			return SeleniumDriver.getPageTitle(loginPageLocators.CardLink3);
			
		case "Aldermore Commercial - Login":
			return SeleniumDriver.getPageTitle(loginPageLocators.CardLink4);
			
		case "Asset finance Asset Backer":
			return SeleniumDriver.getPageTitle(loginPageLocators.CardLink5);
			
		case "E3 login page":
			return SeleniumDriver.getPageTitle(loginPageLocators.CardLink6);
			
				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	
}
