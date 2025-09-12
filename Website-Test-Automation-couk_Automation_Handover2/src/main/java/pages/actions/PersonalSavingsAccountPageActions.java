package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.locators.PersonalSavingsAccountPageLocators;
import utils.SeleniumDriver;

public class PersonalSavingsAccountPageActions {

	PersonalSavingsAccountPageLocators personalSavingsAccountPageLocators = null;

	public PersonalSavingsAccountPageActions() {
		this.personalSavingsAccountPageLocators = new PersonalSavingsAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), personalSavingsAccountPageLocators);
	}

	public void navigateToPersonalSavingsPage() {
		personalSavingsAccountPageLocators.savingsNavLink.click();
		personalSavingsAccountPageLocators.personalSavingsAcc.click();
	}

	public String getpersonalSavingsAccHeaderText() {
		return personalSavingsAccountPageLocators.personalSavingsAccHeader.getText();
	}

	// Unique Selling points

	public String getUSPSubHeaderFCSCText() {
		return personalSavingsAccountPageLocators.USPSubHeaderFCSC.getText();
	}

	public String getUSPSubHeaderEasyAccText() {
		return personalSavingsAccountPageLocators.USPSubHeaderEasyAcc.getText();
	}

	public String getUSPSubHeaderRatedExcellent() {
		return personalSavingsAccountPageLocators.USPSubHeaderRatedExcellent.getText();
	}

	public String getUSPSubHeaderConsistently() {
		return personalSavingsAccountPageLocators.USPSubHeaderConsistently.getText();
	}

	// Easy Access Account Card labels

	public void moveToEasyAccessAccountProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.AERFullForm);
	}

	public String getInterestRateLabel() {
		return personalSavingsAccountPageLocators.InterestRateLabel.getText();
	}

	public String getMinOpeningBalanceLabel() {
		return personalSavingsAccountPageLocators.MinOpeningBalanceLabel.getText();
	}

	public String getSuitableForYouLabel() {
		return personalSavingsAccountPageLocators.SuitableForYouLabel.getText();
	}

	public String getTermLabel() {
		return personalSavingsAccountPageLocators.TermLabel.getText();
	}

	public String getAERFullForm() {
		return personalSavingsAccountPageLocators.AERFullForm.getText();
	}
	
	public String getEasyAccessAccountHeader() {
		return personalSavingsAccountPageLocators.EasyAccessAccountHeader.getText();
	}
	
	public void clickOnEasyAccessAccountViewButton() {
		personalSavingsAccountPageLocators.EasyAccessAccountButton.click();
	}

	// Easy Access Account Product Card Values

	public String getEAAInterestRateValue() {
		return personalSavingsAccountPageLocators.EAAInterestRateValue.getText();
	}

	public String getEAAMinOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.EAAMinOpeningBalanceValue.getText();
		
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getEAATermValue() {
		return personalSavingsAccountPageLocators.EAATermValue.getText();
	}

	// 30 day notice account card values

	public void moveToThirtyDayNoiceAccountProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.ThirtyDaysTermValue);
	}

	public String getThirtyDaysInterestValue() {
		return personalSavingsAccountPageLocators.ThirtyDaysInterestValue.getText();
	}

	public String getThirtyDaysOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.ThirtyDaysOpeningBalanceValue.getText();
		
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getThirtyDaysTermValue() {
		return personalSavingsAccountPageLocators.ThirtyDaysTermValue.getText();
	}
	public String getThirtyDaysNoticeAccountHeader() {
		return personalSavingsAccountPageLocators.ThirtyDaysNoticeAccountHeader.getText();
	}
	
	public void clickOnThirtyDaysNoticeAccViewButton() {
		personalSavingsAccountPageLocators.ThirtyDaysNoticeAccButton.click();
	}
	

	// 120 day notice account card values

	public void moveTo120DayNoiceAccountProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.days120TermValue);
	}

	public String get120DaysInterestValue() {
		return personalSavingsAccountPageLocators.days120InterestValue.getText();
	}

	public String get120DaysOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.days120OpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String get120DaysTermValue() {
		return personalSavingsAccountPageLocators.days120TermValue.getText();
	}

	
	public String getOneTwentyDaysNoticeAccHeader() {
		return personalSavingsAccountPageLocators.OneTwentyDaysNoticeAccHeader.getText();
	}
	
	public void clickOnOneTwentyDaysNoticeAccViewButton() {
		personalSavingsAccountPageLocators.OneTwentyDaysNoticeAccButton.click();
	}
	
	
	
	// 1 year fixed rate account Product Card

	public void moveToOneYeareFixedProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.OneYeareFixedRateTermValue);
	}

	public String getOneYeareFixedProductCardInterestValue() {
		return personalSavingsAccountPageLocators.OneYeareFixedRateInterestValue.getText();
	}

	public String getOneYeareFixedRateOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.OneYeareFixedRateOpeningBalanceValue.getText();
		
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getOneYearFixedRateTermValue() {
		return personalSavingsAccountPageLocators.OneYeareFixedRateTermValue.getText();
	}
	
	public String getOneYeareFixedRateHeader() {
		return personalSavingsAccountPageLocators.OneYeareFixedRateHeader.getText();
	}
	
	public void clickOnOneYearFixedRateViewBtn() {
		personalSavingsAccountPageLocators.OneYeareFixedRateButon.click();
	}

	// 2 year fixed rate account Product Card

	public void moveToTwoYearFixedRateProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.TwoYearFixedRateTermValue);
	}

	public String getTwoYearFixedRateProductCardInterestValue() {
		return personalSavingsAccountPageLocators.TwoYearFixedRateInterestValue.getText();
	}

	public String getTwoYearFixedRateOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.TwoYearFixedRateOpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getTwoYearFixedRateTermValue() {
		return personalSavingsAccountPageLocators.TwoYearFixedRateTermValue.getText();
	}
	
	public String getTwoYeareFixedRateHeader() {
		return personalSavingsAccountPageLocators.TwoYeareFixedRateHeader.getText();
	}
	public void clickOnTwoYearFixedRateViewBtn() {
		personalSavingsAccountPageLocators.TwoYeareFixedRateButon.click();
	}
	

	// 3 year fixed rate account Product Card

	public void moveToThreeYearFixedRateProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.ThreeYearFixedRateTermValue);
	}

	public String getThreeYearFixedRateProductCardInterestValue() {
		return personalSavingsAccountPageLocators.ThreeYearFixedRateInterestValue.getText();
	}

	public String getThreeYearFixedRateOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.ThreeYearFixedRateOpeningBalanceValue.getText();
		
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getThreeYearFixedRateTermValue() {
		return personalSavingsAccountPageLocators.ThreeYearFixedRateTermValue.getText();
	}
	
	public String getThreeYeareFixedRateHeader() {
		return personalSavingsAccountPageLocators.ThreeYeareFixedRateHeader.getText();
	}
	
	public void clickOnThreeYearFixedRateViewBtn() {
		personalSavingsAccountPageLocators.ThreeYeareFixedRateButon.click();
	}

	// 4 year fixed rate account Product Card

	public void moveToFourYearFixedRateProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.FourYearFixedRateTermValue);
	}

	public String getFourYearFixedRateProductCardInterestValue() {
		return personalSavingsAccountPageLocators.FourYearFixedRateInterestValue.getText();
	}

	public String getFourYearFixedRateOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.FourYearFixedRateOpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getFourYearFixedRateTermValue() {
		return personalSavingsAccountPageLocators.FourYearFixedRateTermValue.getText();
	}
	
	public String getFourYeareFixedRateHeader() {
		return personalSavingsAccountPageLocators.FourYeareFixedRateHeader.getText();
	}
	
	public void clickOnFourYearFixedRateViewBtn() {
		personalSavingsAccountPageLocators.FourYeareFixedRateButon.click();
	}

	// 5 year fixed rate account Product Card

	public void moveToFiveYearFixedRateProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.FiveYearFixedRateTermValue);
	}

	public String getFiveYearFixedRateProductCardInterestValue() {
		return personalSavingsAccountPageLocators.FiveYearFixedRateInterestValue.getText();
	}

	public String getFiveYearFixedRateOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.FiveYearFixedRateOpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getFiveYearFixedRateTermValue() {
		return personalSavingsAccountPageLocators.FiveYearFixedRateTermValue.getText();
	}
	
	public String getFiveYeareFixedRateHeader() {
		return personalSavingsAccountPageLocators.FiveYeareFixedRateHeader.getText();
	}
	
	public void clickOnFiveYearFixedRateViewBtn() {
		personalSavingsAccountPageLocators.FiveYeareFixedRateButon.click();
	}

	// 1 year fixed rate cash ISA

	public void moveToOneYearFixedRateISAProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.OneYearFixedRateISATermValue);
	}

	public String getOneYearFixedRateISAProductCardInterestValue() {
		return personalSavingsAccountPageLocators.OneYearFixedRateISAInterestValue.getText();
	}

	public String getOneYearFixedRateISAOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.OneYearFixedRateISAOpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getOneYearFixedRateISATermValue() {
		return personalSavingsAccountPageLocators.OneYearFixedRateISATermValue.getText();
	}
	
	public String getOneYearFixedRateISAHeader() {
		return personalSavingsAccountPageLocators.OneYearFixedRateISAHeader.getText();
	}

	// 2 year fixed rate cash ISA

	public void moveToTwoYearFixedRateISAProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.TwoYearFixedRateISATermValue);
	}

	public String getTwoYearFixedRateISAProductCardInterestValue() {
		return personalSavingsAccountPageLocators.TwoYearFixedRateISAInterestValue.getText();
	}

	public String getTwoYearFixedRateISAOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.TwoYearFixedRateISAOpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getTwoYearFixedRateISATermValue() {
		return personalSavingsAccountPageLocators.TwoYearFixedRateISATermValue.getText();
	}
	
	public String getTwoYearFixedRateISAHeader() {
		return personalSavingsAccountPageLocators.TwoYearFixedRateISAHeader.getText();
	}

	// 3 year fixed rate cash ISA

	public void moveToThreeYearFixedRateISAProductCard() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.ThreeYearFixedRateISATermValue);
	}

	public String getThreeYearFixedRateISAProductCardInterestValue() {
		return personalSavingsAccountPageLocators.ThreeYearFixedRateISAInterestValue.getText();
	}

	public String getThreeYearFixedRateISAOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.ThreeYearFixedRateISAOpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getThreeYearFixedRateISATermValue() {
		return personalSavingsAccountPageLocators.ThreeYearFixedRateISATermValue.getText();
	}
	
	public String getThreeYearFixedRateISAHeader() {
		return personalSavingsAccountPageLocators.ThreeYearFixedRateISAHeader.getText();
	}

	// 30 day notice cash ISA

	public void moveToThirtyDaysNoticeCashISA() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.ThirtyDaysNoticeCashISATermValue);
	}

	public String getThirtyDaysNoticeCashISAInterestValue() {
		return personalSavingsAccountPageLocators.ThirtyDaysNoticeCashISAInterestValue.getText();
	}

	public String getThirtyDaysNoticeCashISAOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.ThirtyDaysNoticeCashISAOpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getThirtyDaysNoticeCashISATermValue() {
		return personalSavingsAccountPageLocators.ThirtyDaysNoticeCashISATermValue.getText();
	}
	
	public String getThirtyDaysNoticeCashISAHeader() {
		return personalSavingsAccountPageLocators.ThirtyDaysNoticeCashISAHeader.getText();
	}

	// Double access account

	public void moveToDoubleAccessAccount() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.DoubleAccessAccountTermValue);
	}

	public String getDoubleAccessAccountInterestValue1() {
		return personalSavingsAccountPageLocators.DoubleAccessAccountInterestValue1.getText();
	}

	public String getDoubleAccessAccountInterestValue2() {
		return personalSavingsAccountPageLocators.DoubleAccessAccountInterestValue2.getText();
	}

	public String getDoubleAccessAccountOpeningBalanceValue() {
		String string = personalSavingsAccountPageLocators.DoubleAccessAccountOpeningBalanceValue.getText();
		String resultString = string.replace("£","");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public String getDoubleAccessAccountTermValue() {
		return personalSavingsAccountPageLocators.DoubleAccessAccountTermValue.getText();
	}
	
	public String getDoubleAccessAccHeader() {
		return personalSavingsAccountPageLocators.DoubleAccessAccHeader.getText();
	}
	
	public WebElement DoubleAccessAccountButton() {
		return personalSavingsAccountPageLocators.DoubleAccessAccountButton;
	}

	// CTA angled butons

	public String getEasyAccessAccountPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.EasyAccessAccountButton);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getDoubleAccessAccountPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.DoubleAccessAccountButton);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getThirtyDaysNoticeAccButtonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.ThirtyDaysNoticeAccButton);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getOneTwentyDaysNoticeAccButtonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.OneTwentyDaysNoticeAccButton);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getOneYeareFixedRateButonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.OneYeareFixedRateButon);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getTwoYeareFixedRateButonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.TwoYeareFixedRateButon);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getThreeYeareFixedRateButonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.ThreeYeareFixedRateButon);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getFourYeareFixedRateButonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.FourYeareFixedRateButon);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getFiveYeareFixedRateButonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.FiveYeareFixedRateButon);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getOneYearFixedISAButtonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.OneYearFixedISAButton);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getTwoYearFixedISAButtonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.TwoYearFixedISAButton);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getThreeYearFixedISAButtonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.ThreeYearFixedISAButton);
		return SeleniumDriver.getDriver().getTitle();
	}

	public String getThirtyDaysNoticeCashISAButtonPageTitle() {
		SeleniumDriver.verifytheLink(personalSavingsAccountPageLocators.ThirtyDaysNoticeCashISAButton);
		return SeleniumDriver.getDriver().getTitle();
	}

	// Important personal savings forms and documents

	public String getImportantpersonalsavingsformsanddocumentsHeader() {
		return personalSavingsAccountPageLocators.ImportantpersonalsavingsformsanddocumentsHeader.getText();
	}

	public void clickImportantpersonalsavingsformsanddocumentsLink() {
		
		WebElement element=SeleniumDriver.waitDriver.until
		(ExpectedConditions.elementToBeClickable(personalSavingsAccountPageLocators.ImportantpersonalsavingsformsanddocumentsLink));
		
		((JavascriptExecutor)SeleniumDriver.getDriver()).executeScript("arguments[0].click();", element);
		
		/*Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(SeleniumDriver.getDriver().findElement(By.xpath("//h2[normalize-space()='Can we help?']")), 0, 0)
		.build().perform();
		personalSavingsAccountPageLocators.ImportantpersonalsavingsformsanddocumentsLink.click();*/
		SeleniumDriver.waitForPageToLoad();
		
	}
	public void moveToImportantpersonalsavingsformsanddocument() {
		SeleniumDriver.moveToElement(personalSavingsAccountPageLocators.ImportantpersonalsavingsformsanddocumentsLink);
	}
	
	//Existing customer log in
	
	public String getExistingCustomerLoginHeader() {
		return personalSavingsAccountPageLocators.ExistingCustomerLoginHeader.getText();
	}

	public void clickExistingCustomerLoginLink() {
		personalSavingsAccountPageLocators.ExistingCustomerLoginLink.click();
	}
	
	
	public void clickAcceptCookiesLink() {
		personalSavingsAccountPageLocators.AcceptCookies.click();
	}
	
	
	public String getImageCopySectionHeader() {
		return personalSavingsAccountPageLocators.ImageCopySectionHeader.getText();
	}
	
	public WebElement ThirtyDaysNoticeViewLink() {
		
		return personalSavingsAccountPageLocators.ThirtyDaysNoticeViewLink;
	}
	
public WebElement ExistingCustomerLoginLink() {
		
		return personalSavingsAccountPageLocators.ExistingCustomerLoginLink;
	}
	
	
public WebElement AcceptCookies() {
	
	return personalSavingsAccountPageLocators.AcceptCookies;
}
	
	
	
	
	
	
	
	
	
	

}
