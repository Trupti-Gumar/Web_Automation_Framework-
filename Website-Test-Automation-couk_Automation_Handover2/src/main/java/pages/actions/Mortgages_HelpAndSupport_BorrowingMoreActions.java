package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_HelpAndSupport_BorrowingMoreLocators;
import utils.SeleniumDriver;

public class Mortgages_HelpAndSupport_BorrowingMoreActions {
	
	Mortgages_HelpAndSupport_BorrowingMoreLocators BorrowingLocators = new Mortgages_HelpAndSupport_BorrowingMoreLocators();
	
	public Mortgages_HelpAndSupport_BorrowingMoreActions() {
		this.BorrowingLocators = new Mortgages_HelpAndSupport_BorrowingMoreLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BorrowingLocators);
	}

	public String getDropdownOption() {
		return SeleniumDriver.GetElementText(BorrowingLocators.dropDownOption1);
	}
	
	public void clickedTheLink() {
		SeleniumDriver.clickElement(BorrowingLocators.dropDownOption1, "Borrowing More");
	}
	 
	public String getPageTitle() {
		return SeleniumDriver.GetElementText(BorrowingLocators.PageTitle);
	}
	
	public String getHeaderImageSection(String value) {
		switch(value)
		{
		case"Here's what you could borrow money for:":
			return BorrowingLocators.ImageTitle1.getText();
			
		case"Our eligibility checklist":
			return BorrowingLocators.ImageTitle2.getText();	
		default:
		    throw new IllegalArgumentException("Invalid value: " + value);
		}
	}
	
//	public void ClickTheLinkOnImageSection(String header) {
//		String Actual = SeleniumDriver.GetElementText(BorrowingLocators.ImageLink);
//		String Expected = header;
//		assertEquals(Actual, Expected);
//		SeleniumDriver.clickElement(BorrowingLocators.ImageLink, "Get In Touch");
//	}
	
	public void ClickTheLinkOnQuickLinkSection(String header) {
		String Actual = SeleniumDriver.GetElementText(BorrowingLocators.ImageLink);
		String Expected = header;
		assertEquals(Actual, Expected);
		SeleniumDriver.clickElement(BorrowingLocators.ImageLink, "Get In Touch");
	}
	
	public String getLinkPageTitle() {
		return SeleniumDriver.GetElementText(BorrowingLocators.LinkPageTitle);
	}
}
