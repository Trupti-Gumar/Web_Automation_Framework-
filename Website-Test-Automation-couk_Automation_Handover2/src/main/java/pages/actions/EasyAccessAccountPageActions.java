package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.locators.EasyAccessAccountPageLocators;
import utils.SeleniumDriver;

public class EasyAccessAccountPageActions {

	EasyAccessAccountPageLocators easyAccessAccountPageLocators=null;
	
	public EasyAccessAccountPageActions() {
		this.easyAccessAccountPageLocators = new EasyAccessAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), easyAccessAccountPageLocators);
	}
	
	public void moveToEasyAccessAccountPage() {
		easyAccessAccountPageLocators.SavingsNavLink.click();
		easyAccessAccountPageLocators.EasyAccessAccLink.click();
	}
	
	//Easy Access Account product Card
	
	public String getEAAInterestRateValue() {
		return easyAccessAccountPageLocators.EAAInterestRateValue.getText();
	}

	public String getEAAMinOpeningBalanceValue() {
		String string = easyAccessAccountPageLocators.EAAMinOpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getEAATermValue() {
		return easyAccessAccountPageLocators.EAATermValue.getText();
	}
	public void moveToEasyAccessAccountProductCard() {
		SeleniumDriver.moveToElement(easyAccessAccountPageLocators.EAAMinOpeningBalanceValue);
	}
	
	//Masthead
	
	public String getEasyAccessAccHeader() {
		return easyAccessAccountPageLocators.EasyAccessAccHeader.getText();
	}
	
	//Image copy Section- Benefits of an easy access account
	
	
	public String getImgCpySectionHeader1() {
		return easyAccessAccountPageLocators.ImgCpySectionHeader1.getText();
	}
	
	public void moveToImgCpySectionHeader1() {
		SeleniumDriver.moveToElement(easyAccessAccountPageLocators.ImgCpySectionHeader1);
	}
	
	public WebElement USPSection() {
		
		return easyAccessAccountPageLocators.USPSection;
	}
	
	
	//Image copy Section-FSCS Protection
	
	public String getImgCpySectionHeader2() {
		return easyAccessAccountPageLocators.ImgCpySectionHeader2.getText();
	}
	
	public void moveToImgCpySectionHeader2() {
		SeleniumDriver.moveToElement(easyAccessAccountPageLocators.ImgCpySectionHeader2);
	}
	
	//Easy access account FAQs
	
	public String getEAAFAQHeader() {
		return easyAccessAccountPageLocators.EAAFAQHeader.getText();
	}
	
	public boolean isAccordianPresent() {
		easyAccessAccountPageLocators.AccordianLink.click();
		return easyAccessAccountPageLocators.AccordianLink.isDisplayed();
	}
	
	public String getMoreCardHeaderOnFAQ() {
		return easyAccessAccountPageLocators.MoreCardHeaderOnFAQ.getText();
	}
	
	//Cards
	
	public String getCardHeader1() {
		return easyAccessAccountPageLocators.CardHeader1.getText();
	}
	
	public String getCardHeader2() {
		return easyAccessAccountPageLocators.CardHeader2.getText();
	}
	
	public void clickOnCardLink1() {
		//fixedRateAccountPageLocators.CardLink1.click();
		WebElement element=SeleniumDriver.waitDriver.until
				(ExpectedConditions.elementToBeClickable(easyAccessAccountPageLocators.CardLink1));
				
				((JavascriptExecutor)SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	public void clickOnCardLink2() {
		//fixedRateAccountPageLocators.CardLink2.click();
		
		WebElement element=SeleniumDriver.waitDriver.until
				(ExpectedConditions.elementToBeClickable(easyAccessAccountPageLocators.CardLink2));
				
				((JavascriptExecutor)SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
