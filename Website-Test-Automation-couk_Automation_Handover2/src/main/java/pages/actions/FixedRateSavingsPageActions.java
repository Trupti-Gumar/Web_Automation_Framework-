package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.locators.*;
import utils.SeleniumDriver;

public class FixedRateSavingsPageActions {

	FixedRateAccountPageLocators fixedRateAccountPageLocators = null;

	public FixedRateSavingsPageActions() {
		this.fixedRateAccountPageLocators = new FixedRateAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), fixedRateAccountPageLocators);
	}

	public void navigateToFixedRateSavingsPage() {
		fixedRateAccountPageLocators.SavingsNavLink.click();
		fixedRateAccountPageLocators.FixedRateSavingsLink.click();
	}

	public String getFixedRateSavingsHeader() {
		return fixedRateAccountPageLocators.FixedRateSavingsHeader.getText();
	}

	public String getImageCopyHeader1() {
		return fixedRateAccountPageLocators.ImageCopyHeader1.getText();
	}
	public boolean isImageCopyHeader1Present() {
		return fixedRateAccountPageLocators.ImageCopyHeader1.isDisplayed();
	}
	
	public boolean isImageCopyHeader2Present() {
		return fixedRateAccountPageLocators.ImageCopyHeader2.isDisplayed();
	}
	
	
	public String getImageCopyHeader2() {
		return fixedRateAccountPageLocators.ImageCopyHeader2.getText();
	}
	
	public void clickOnImageCopylink() {
		fixedRateAccountPageLocators.ImageCopylink.click();
	}
	
	public String getFAQHeader() {
		return fixedRateAccountPageLocators.FAQHeader.getText();
	}
	
	public boolean isFAQComponentPresent() {
		return fixedRateAccountPageLocators.FAQHeader.isDisplayed();
	}
	
	public void clickOnAccordianlink() {
		fixedRateAccountPageLocators.Accordian.click();
	}
	
	public boolean isAccordianBlockPresent() {
		return fixedRateAccountPageLocators.AccordianBlock.isDisplayed();
	}
	
	public String getMoreCardOnFAQ() {
		return fixedRateAccountPageLocators.MoreCardOnFAQ.getText();
	}
	
	public void getMoreCardOnFAQLink() {
		fixedRateAccountPageLocators.MoreCardOnFAQLink.click();
	}
	
	//Cards
	
	public String getCardHeader1() {
		return fixedRateAccountPageLocators.CardHeader1.getText();
	}
	
	public String getCardHeader2() {
		return fixedRateAccountPageLocators.CardHeader2.getText();
	}
	
	public void clickOnCardLink1() {
		//fixedRateAccountPageLocators.CardLink1.click();
		WebElement element=SeleniumDriver.waitDriver.until
				(ExpectedConditions.elementToBeClickable(fixedRateAccountPageLocators.CardLink1));
				
				((JavascriptExecutor)SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	public void clickOnCardLink2() {
		//fixedRateAccountPageLocators.CardLink2.click();
		
		WebElement element=SeleniumDriver.waitDriver.until
				(ExpectedConditions.elementToBeClickable(fixedRateAccountPageLocators.CardLink2));
				
				((JavascriptExecutor)SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	public WebElement USPSection() {
		
		return fixedRateAccountPageLocators.USPSection;
	}
	
}
