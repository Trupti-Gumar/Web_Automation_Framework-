package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageLocators;
import utils.SeleniumDriver;

public class Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageActions {
	
	Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageLocators BorrowLocators 
	= new Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageLocators();
	
	public Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageActions() {
		this.BorrowLocators = new Mortgages_MortgagesHelpAndSupport_BorrowingMoreOnYourMortgageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BorrowLocators);
	}

	
	public String getCardName() {
		return SeleniumDriver.GetElementText(BorrowLocators.CardName);
	}
	
	public void clickedCTAbutton() {
		SeleniumDriver.clickElement(BorrowLocators.CardNAmeCTA, "Borrowing More");
	}
	
	public String getPageTitle() {
		return SeleniumDriver.GetElementText(BorrowLocators.PageTitle);
		
	}
	
	public String getImageSectionheader(String value) {
		switch(value) {
		case"Here's what you could borrow money for:":
			return BorrowLocators.ImageHeader1.getText();
		case"Our eligibility checklist":
			return BorrowLocators.ImageHeader2.getText();
		case"Get in touch":
			return BorrowLocators.ImageHeader3.getText();
		default:
			throw new IllegalArgumentException("Invalid Value :" + value);
		}
	}
	
	public void clickCTImageCTAbutton(String CTA) {
		String actual = BorrowLocators.ImageCTAbutton.getText();
		String Expected = CTA;
		assertEquals(actual, Expected);
		SeleniumDriver.clickElement(BorrowLocators.ImageCTAbutton, "Get in Touch");
	}
	
	public String getCTAlinkPageTitle() {
		return SeleniumDriver.GetElementText(BorrowLocators.CTAPageTitle);
	}

}