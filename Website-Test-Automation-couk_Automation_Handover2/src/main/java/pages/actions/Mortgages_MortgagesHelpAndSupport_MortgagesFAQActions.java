package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_MortgagesHelpAndSupport_MortgagesFAQLocators;
import utils.SeleniumDriver;

public class Mortgages_MortgagesHelpAndSupport_MortgagesFAQActions {

	
	Mortgages_MortgagesHelpAndSupport_MortgagesFAQLocators FAQLocators 
	 = new Mortgages_MortgagesHelpAndSupport_MortgagesFAQLocators();
	
	public Mortgages_MortgagesHelpAndSupport_MortgagesFAQActions() {
		this.FAQLocators = new Mortgages_MortgagesHelpAndSupport_MortgagesFAQLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), FAQLocators);
	}
	
	public String getCardName() {
		return FAQLocators.CardName.getText();
	}

    public void clickedFAQs() {
    	SeleniumDriver.clickElement(FAQLocators.CTACardName, "Mortages FAQs");
    }
    
    public String getPageTitle() {
    	return FAQLocators.CardPageTitle.getText();
    }
    
    public String getSubheader(String value) {
    	switch(value) {
    	case"General mortgage FAQs":
    		return FAQLocators.Card1.getText();
    	case"Applying for a mortgage with Aldermore":
    		return FAQLocators.Card2.getText();
       	case"Existing Aldermore customers":
    		return FAQLocators.Card3.getText();	
    	default:
    		throw new IllegalArgumentException("Invalid Value :" + value);
    	}
    	
    }
    
    public String getCardsName(String value) {
    	switch(value) {
    	case"Mortgages help and support":
    		return FAQLocators.Cardname1.getText();
    	case"Borrowing more":
    		return FAQLocators.Cardname2.getText();
    	case"Money worries":
    		return FAQLocators.Cardname3.getText();
    	default:
    		throw new IllegalArgumentException("Invalid value : " + value);
    	}
    }
    public void clickTheCTAlink(String value) {
    	switch(value) 
    	{	
    	case"Mortgages help and support":
    		 FAQLocators.CTACard1.click();
    	case"Borrowing more":
    		 FAQLocators.CTACard2.click();
    	case"Money worries":
    		 FAQLocators.CTACard3.click();
    	}
    }
    public String getPageTitle(String Value) {
    	switch(Value) {
    	case"Mortgages help and support":
    		return FAQLocators.PageTitle1.getText();
    	case"Borrow more":
    		return FAQLocators.PageTitle2.getText();
    	case"Customers with money worries":
    		return FAQLocators.PageTitle3.getText();
    	default: 
    		throw new IllegalArgumentException(Value);
    	}
    }
}
