package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.locators.*;
import utils.SeleniumDriver;

public class DoubleAccessSavingsAccountActions {

	DoubleAccessSavingsAccountLocators doubleAccessSavingsAccountLocators = null;

	public DoubleAccessSavingsAccountActions() {
		this.doubleAccessSavingsAccountLocators = new DoubleAccessSavingsAccountLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), doubleAccessSavingsAccountLocators);
	}

	public void navigateToDoubleAccessSavingsAccountPage() {
		doubleAccessSavingsAccountLocators.SavingsNavLink.click();
		doubleAccessSavingsAccountLocators.DoubleAccessAccountLink.click();
	}

	public String getDoubleAccessAccountHeader() {
		return doubleAccessSavingsAccountLocators.DoubleAccessAccountHeader.getText();
	}

	// Double access account card values
	
	public WebElement DoubleAccessViewBtn() {
		return doubleAccessSavingsAccountLocators.DoubleAccessViewBtn;
	}

	public void moveToDoubleAccessAccount() {
		SeleniumDriver.moveToElement(doubleAccessSavingsAccountLocators.DoubleAccessAccountInterestValue2);
	}

	public String getDoubleAccessAccountInterestValue1() {
		return doubleAccessSavingsAccountLocators.DoubleAccessAccountInterestValue1.getText();
	}

	public String getDoubleAccessAccountInterestValue2() {
		return doubleAccessSavingsAccountLocators.DoubleAccessAccountInterestValue2.getText();
	}

	public String getDoubleAccessAccountOpeningBalanceValue() {
		String string = doubleAccessSavingsAccountLocators.DoubleAccessAccountOpeningBalanceValue.getText();
		String resultString =string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getDoubleAccessAccountTermValue() {
		return doubleAccessSavingsAccountLocators.DoubleAccessAccountTermValue.getText();
	}

	public String getDoubleAccessAccHeader() {
		return doubleAccessSavingsAccountLocators.DoubleAccessAccHeader.getText();
	}
	
	//Image Copy Section 
	
	public String getImgCpySectionHeader1() {
		return doubleAccessSavingsAccountLocators.ImageCopySectionHeader1.getText();
	}
	
	public void moveToImgCpySectionHeader1() {
		SeleniumDriver.moveToElement(doubleAccessSavingsAccountLocators.ImageCopySectionHeader1);
	}
	
	
	
	//Image copy Section-FSCS Protection
	
	public String getImgCpySectionHeader2() {
		return doubleAccessSavingsAccountLocators.ImageCopySectionHeader2.getText();
	}
	
	public void moveToImgCpySectionHeader2() {
		SeleniumDriver.moveToElement(doubleAccessSavingsAccountLocators.ImageCopySectionHeader2);
	}
	
	//FAQ
	
	public String getDAAFAQHeader() {
		return doubleAccessSavingsAccountLocators.DAAFAQHeader.getText();
	}
	
	public boolean isAccordianPresent() {
		doubleAccessSavingsAccountLocators.AccordianLink.click();
		return doubleAccessSavingsAccountLocators.AccordianLink.isDisplayed();
	}
	
	public String getMoreCardHeaderOnFAQ() {
		return doubleAccessSavingsAccountLocators.MoreCardHeaderOnFAQ.getText();
	}
	
	
	//Cards
	
	public String getCardHeader1() {
		return doubleAccessSavingsAccountLocators.CardHeader1.getText();
	}
	
	public String getCardHeader2() {
		return doubleAccessSavingsAccountLocators.CardHeader2.getText();
	}
	
	public void clickOnCardLink1() {
		//fixedRateAccountPageLocators.CardLink1.click();
		WebElement element=SeleniumDriver.waitDriver.until
				(ExpectedConditions.elementToBeClickable(doubleAccessSavingsAccountLocators.CardLink1));
				
				((JavascriptExecutor)SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	
	public void clickOnCardLink2() {
		//fixedRateAccountPageLocators.CardLink2.click();
		
		WebElement element=SeleniumDriver.waitDriver.until
				(ExpectedConditions.elementToBeClickable(doubleAccessSavingsAccountLocators.CardLink2));
				
				((JavascriptExecutor)SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	
	
	
	
	
	
	
}
