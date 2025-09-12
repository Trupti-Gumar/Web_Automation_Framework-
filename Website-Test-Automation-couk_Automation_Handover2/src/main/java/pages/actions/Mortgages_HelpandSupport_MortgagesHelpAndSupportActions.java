package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import pages.locators.Mortgages_HelpandSupport_MortgagesHelpAndSupportLocators;
import utils.SeleniumDriver;

public class Mortgages_HelpandSupport_MortgagesHelpAndSupportActions {
	
	Mortgages_HelpandSupport_MortgagesHelpAndSupportLocators SupportLocators = new Mortgages_HelpandSupport_MortgagesHelpAndSupportLocators();
	
	public Mortgages_HelpandSupport_MortgagesHelpAndSupportActions() {
		this.SupportLocators = new Mortgages_HelpandSupport_MortgagesHelpAndSupportLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), SupportLocators);
	}

	public String getDropDownOption() {
		return SupportLocators.MortgagesHelpandSupport.getText();
	}
	
	public void clickedTheOption() {
		SeleniumDriver.clickElement(SupportLocators.MortgagesHelpandSupport, "Mortgages help and Support");
	}
	
	public String getPageTitle() {
		return SupportLocators.MortgagesSupportPageTitle.getText();
	}
	
	public void navigateToMortgagesHelpAndSupport() {
		SeleniumDriver.clickElement(SupportLocators.MortgagesHelpandSupport, "Mortgages help and Support");
	}
	
	public String getCardHeaderTitle(String value) {
		switch(value) {
		case"Payments":
			return SupportLocators.CardHeader1.getText();
		case"Fees, statements and balances":
			return SupportLocators.CardHeader2.getText();	
		case"Managing your mortgage":
			return SupportLocators.CardHeader3.getText();
		case"Borrowing more":
			return SupportLocators.CardHeader4.getText();
		case"Switching your mortgage":
			return SupportLocators.CardHeader5.getText();
		case"Mortgage jargon buster":
			return SupportLocators.CardHeader6.getText();
		case"Applying for a mortgage":
			return SupportLocators.CardHeader7.getText();
		case"Mortgages contact information":
			return SupportLocators.CardHeader8.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
	}
	
	public String getLinksfromthepage(String value) {
		switch(value){
		case"What's a decision in principle?":
			return SupportLocators.Link1.getText();
		case"What's the difference between a fixed rate and variable rate mortgage?":
		    return SupportLocators.Link2.getText();
		case"What's the difference between an interest only and repayment mortgage?":
		    return SupportLocators.Link3.getText();
		case"Do you offer buy to let mortgages?":
		    return SupportLocators.Link4.getText(); 
		case"Fees, statements and balances":
		    return SupportLocators.Link5.getText(); 
		case"Can I pay off my mortgage in full?":
		    return SupportLocators.Link6.getText(); 
		case"Can I remove a name from my mortgage?":
		    return SupportLocators.Link7.getText();
		case"I've changed my name. Can I update my mortgage account?":
		    return SupportLocators.Link8.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + value);	
		}
		
	}
	
	public String getImagSectionheader(String value) {
		switch(value) {
		case"Mortgage customers with money worries":
			return SupportLocators.ImageSection1.getText();
		case"Bank of England base rate changes":
			return SupportLocators.ImageSection2.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + value);		
		}
	}
	
	public void ClickedonCardCTAButton() {
		   SeleniumDriver.waitForElementClickable(SupportLocators.CTACardButton1);
			SeleniumDriver.clickElement(SupportLocators.CTACardButton1, "Payments");
	}
	
	public String getCardPageTitle() {
		return SupportLocators.CTAPageTitle1.getText();
	}
	
	public void ClickedOnCTAButton(String value) {
		switch(value) {
		case"Find out how we can help":
		SeleniumDriver.clickElement(SupportLocators.CTAImageSection1, "Find out how we can help");
		break;
//		case"Find out more":
//		SeleniumDriver.clickElement(SupportLocators.CTAImageSection2, "Find out more");
//		break;
		}
	}
	
	public void handleTheCookies() {
		try {
		boolean Cookies = SeleniumDriver.isElementPresent(SupportLocators.OneTrustCookies);
		if(Cookies = true) {
			
			SeleniumDriver.waitForElementClickable(SupportLocators.OneTrustCookies);
			SeleniumDriver.clickElement(SupportLocators.OneTrustCookies, "Accept All Cookies");

		}
		}
		catch(Exception e)
		{
			
		}
	}
	
	public String getImageSectionCTAPageTitle(String header) {
		switch(header) {
		case"Customers with money worries":
		return SeleniumDriver.GetElementText(SupportLocators.CTAImageSectionPageTitle1);
//		case"Bank of England base rate changes":
//	    return SeleniumDriver.GetElementText(SupportLocators.CTAImageSectionPageTitle2);
		default:
			throw new IllegalArgumentException("Invalid value: " + header);	
		}
	}
}
