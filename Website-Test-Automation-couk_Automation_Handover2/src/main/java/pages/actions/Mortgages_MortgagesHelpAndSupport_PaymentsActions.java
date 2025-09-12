package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_MortgagesHelpAndSupport_PaymentsLocators;
import utils.SeleniumDriver;

public class Mortgages_MortgagesHelpAndSupport_PaymentsActions {
	
	Mortgages_MortgagesHelpAndSupport_PaymentsLocators PaymentsLocator = new Mortgages_MortgagesHelpAndSupport_PaymentsLocators();

	public Mortgages_MortgagesHelpAndSupport_PaymentsActions(){
		this.PaymentsLocator = new Mortgages_MortgagesHelpAndSupport_PaymentsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), PaymentsLocator);
	}
	
	public WebElement OneTrustCookies() {
		return PaymentsLocator.OneTrustCookies;
	}
	public String getCardHeaderTitle() {
		return SeleniumDriver.GetElementText(PaymentsLocator.CardHeader1);
	}
	
	public void ClickCardCTAbutton() {
		SeleniumDriver.clickElement(PaymentsLocator.CardCTAButton, "Payments");
	}
	
	public String getPageTitle() {
		return SeleniumDriver.GetElementText(PaymentsLocator.CardPageTitle);
	}
	
	public String getNavigationBarTitles(String value) {
		switch(value) {
		case"Your first payment":
			return SeleniumDriver.GetElementText(PaymentsLocator.NavigationOption1);
		case"Ways to pay":
			return SeleniumDriver.GetElementText(PaymentsLocator.NavigationOption2);
		case"Make an overpayment":
			return SeleniumDriver.GetElementText(PaymentsLocator.NavigationOption3);
		case"Repaying your balance":
			return SeleniumDriver.GetElementText(PaymentsLocator.NavigationOption4);
		case"Variable rate mortgages":
			return SeleniumDriver.GetElementText(PaymentsLocator.NavigationOption5);
			default:
				throw new IllegalArgumentException("Invlaid Value : " + value);
		}
	}
		
	public String getImageSectionHeader() {
			return SeleniumDriver.GetElementText(PaymentsLocator.ImageSectionHeader);
		}
	
	public String getTheSubHeader(String value) {
		switch(value) {
		case"The Aldermore Managed Rate and variable rate mortgages.":
			return PaymentsLocator.subHeader1.getText();
		case"Repaying the outstanding balance on your mortgage.":
			return PaymentsLocator.subHeader2.getText();
		default:
		throw new IllegalArgumentException("Invalid Value : " + value);
		}
		
	}
	
	public void clickLink(String value) {
		switch(value) {
		case"money worries":
			SeleniumDriver.clickElement(PaymentsLocator.Link1, "money worries");
		case"here.":
		  SeleniumDriver.clickElement(PaymentsLocator.Link2, "here.");
		}
	}
	
	public String getLinkPageTitle(String value) {
		switch(value) {
		case"Customers with money worries":
		    return SeleniumDriver.GetElementText(PaymentsLocator.LinkPageTitle1);
		case"Switching your mortgage":
			return SeleniumDriver.GetElementText(PaymentsLocator.LinkPageTitle2);
		default:
			throw new IllegalArgumentException("Invalid Value : " + value);
		}
	}
	
	public String getFAQsheader() {
		return SeleniumDriver.GetElementText(PaymentsLocator.FAQs);
	}
	
	public String getMoreCardHeader() {
		return SeleniumDriver.GetElementText(PaymentsLocator.moreheader);
	}
	
	public String getPageTitleFAQs() {
		return SeleniumDriver.GetElementText(PaymentsLocator.CTAButtonPageTitle);
	}
	
	public void ClickOnFAQsLink() {
		SeleniumDriver.clickElement(PaymentsLocator.PageTitle, "Mortagage Help And Support");
	}
}
