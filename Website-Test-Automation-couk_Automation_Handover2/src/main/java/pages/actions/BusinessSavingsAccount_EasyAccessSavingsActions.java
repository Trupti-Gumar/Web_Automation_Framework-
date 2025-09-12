package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessSavingsAccount_EasyAccessSavingsLocators;
import utils.SeleniumDriver;

public class BusinessSavingsAccount_EasyAccessSavingsActions {

	BusinessSavingsAccount_EasyAccessSavingsLocators BSEasyAccessSavingsLocators = null;

	public BusinessSavingsAccount_EasyAccessSavingsActions() {

		this.BSEasyAccessSavingsLocators = new BusinessSavingsAccount_EasyAccessSavingsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BSEasyAccessSavingsLocators);

	}
	
	public WebElement SavingsLink() {
		return BSEasyAccessSavingsLocators.SavingsLink;
	}
	
	public WebElement EasyAccessAccountLink() {
		return BSEasyAccessSavingsLocators.EasyAccessAccountLink;
	}
	

	// Masthead

	public WebElement EasyAccessAccountHeader() {
		return BSEasyAccessSavingsLocators.EasyAccessAccountHeader;
	}

	// Image Copy Section

	public String getImageCopyHeader(String header) {

		switch (header) {

		case "Benefits of an easy access account":
			return BSEasyAccessSavingsLocators.ImageCopyHeader1.getText();

		case "Celebrating small businesses":
			return BSEasyAccessSavingsLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	// Fixed Rate FAQ

	public WebElement FAQHeader() {
		return BSEasyAccessSavingsLocators.FAQHeader;
	}

	public WebElement Accordian() {
		return BSEasyAccessSavingsLocators.Accordian;
	}

	public WebElement AccordianBlock() {
		return BSEasyAccessSavingsLocators.AccordianBlock;
	}

	// More Card

	public WebElement MoreCardOnFAQ() {
		return BSEasyAccessSavingsLocators.MoreCardOnFAQ;
	}

	public WebElement MoreCardOnFAQLink() {
		return BSEasyAccessSavingsLocators.MoreCardOnFAQLink;
	}

	// Easy access savings account Product Card Values

	public WebElement EasyAccessProductCardHeader() {
		return BSEasyAccessSavingsLocators.EasyAccessAccountProductCardHeader;
	}

	public WebElement EasyAccessAccountViewLink() {
		return BSEasyAccessSavingsLocators.EasyAccessAccountViewLink;
	}

	public String getEasyAccessProductCardValues(String content) {

		switch (content) {

		case "Interest rate(*AER)":
			return BSEasyAccessSavingsLocators.EasyAccessAccountInterestValue.getText();

		case "Minimum opening balance":

			String string = BSEasyAccessSavingsLocators.EasyAccessAccountOpeningBalance.getText();
			String resultString= string.replace("£", "");
			String[] splitString = string.replace("£", "").split("-");
			//String resString = splitString[0] + "-" + splitString[1];
			return resultString;

		default:
			throw new IllegalArgumentException("Invalid value: " + content);

		}

	}

}
