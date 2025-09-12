package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import pages.locators.AldermorePageLocators;
import utils.SeleniumDriver;

public class AldermorePageActions {

	AldermorePageLocators aldermorePageLocators = null;

	public AldermorePageActions() {
		this.aldermorePageLocators = new AldermorePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), aldermorePageLocators);
	}

	// Savings Product Card single access

	// Savings Product Card double access

	// Savings Product card double rate

	/*
	 * public String getInterestValueDoublerate1() { String text =
	 * aldermorePageLocators.interestRateValuedoubleRate1.getText(); String[] parts
	 * = text.split(" "); String resultString = parts[0] + " " + parts[1];
	 * 
	 * return resultString; }
	 * 
	 * public String getInterestValueDoublerate2() { String text =
	 * aldermorePageLocators.interestRateValuedoubleRate2.getText(); String[] parts
	 * = text.split(" "); String resultString = parts[0] + " " + parts[1];
	 * 
	 * return resultString; }
	 */

	// Masthead blog title

	/*
	 * public String clickOnBackLink() { 
	 * aldermorePageLocators.backLink.click();
	 * String newTabHandle = null; 
	 * String mainWindowHandle = SeleniumDriver.getDriver().getWindowHandle();
	 *  Set<String> allWindowHandles =
	 * SeleniumDriver.getDriver().getWindowHandles(); 
	 * for (String handle :allWindowHandles)
	 *  { 
	 *  if (!handle.equals(mainWindowHandle)) { 
	 *  newTabHandle = handle;
	 *  break; 
	 *  } 
	 *  }
	 * 
	 * // Switch to the new tab
	 * SeleniumDriver.getDriver().switchTo().window(newTabHandle); return
	 * SeleniumDriver.getDriver().getCurrentUrl(); 
	 * }
	 */

	// Unique Selling points

	// UAT
	// Masthead Homepage

	public String getmastheadHomepageHeaderText() {
		return aldermorePageLocators.mastheadHomepageHeader.getText();
	}

	public void mastheadHomepageDescriptionDisplayed() {
		SeleniumDriver.isElementPresent(aldermorePageLocators.mastheadHomepageDescription);
	}

	public void mastheadHomepageScrollDownButtonDisplayed() {
		SeleniumDriver.isElementPresent(aldermorePageLocators.mastheadHomepageScrollDownButton);

	}

	public WebElement getmastheadHomepageHeaderElement() {
		return aldermorePageLocators.mastheadHomepageHeader;
	}

	public WebElement getmastheadHomepageDescriptionElement() {
		return aldermorePageLocators.mastheadHomepageDescription;
	}

	public WebElement getmastheadHomepageScrollDownElement() {
		return aldermorePageLocators.mastheadHomepageScrollDownButton;
	}
	
	public WebElement AcceptCookiesBtn() {
		return aldermorePageLocators.AcceptCookiesBtn;
	}

	// Unique Selling points

	public String getuniqueSellingPointHeaderText() {
		return aldermorePageLocators.uniqueSellingPointHeader.getText();
	}

	public String getUniqueSellingpointPromotinginclusivitySubHeaderText() {
		return aldermorePageLocators.UniqueSellingpointPromotinginclusivity.getText();
	}

	public String getUniqueSellingpointDistinctivelyhumanSubHeaderText() {
		return aldermorePageLocators.UniqueSellingpointDistinctivelyhumanSubHeader.getText();
	}

	public String getUniqueSellingpointEnablingambitionSubHeaderText() {
		return aldermorePageLocators.UniqueSellingpointEnablingambitionSubHeader.getText();
	}

	public String getUniqueSellingpointAwardWinningSubDescText() {
		return aldermorePageLocators.UniqueSellingpointAwardWinningSubDesc.getText();
	}

	public String getUniqueSellingpointDistinctivelyhumanDescText() {
		return aldermorePageLocators.UniqueSellingpointDistinctivelyhumanDesc.getText();
	}

	public String getUniqueSellingpointBackingbusinessesDescText() {
		return aldermorePageLocators.UniqueSellingpointBackingbusinessesDesc.getText();
	}

	// Savings Block

	public void moveToSavingsBlock() {
		SeleniumDriver.moveToElement(aldermorePageLocators.SavingsBlockCTAButton);
	}

	public String getSavingsBlockHeaderText() {
		return aldermorePageLocators.SavingsBlockHeader.getText();
	}

	public String getSavingsBlockButtonText() {
		return aldermorePageLocators.SavingsBlockCTAButton.getText();
	}

	public void clickOnSavingsBlockButton() {
		SeleniumDriver.acceptCookiesIfPresent();

		aldermorePageLocators.SavingsBlockCTAButton.click();
	}

	// Mortgage Block

	public void moveToMortgageBlock() {
		

		SeleniumDriver.moveToElement(aldermorePageLocators.MortgageBlockCTAButton);
	}

	public String getMortgagesBlockHeaderText() {
		return aldermorePageLocators.MortgageBlockHeader.getText();
	}

	public String getMortgagesBlockButtonText() {
		return aldermorePageLocators.MortgageBlockCTAButton.getText();
	}

	public void clickOnMortgagesBlockButton() {
		SeleniumDriver.acceptCookiesIfPresent();
		aldermorePageLocators.MortgageBlockCTAButton.click();
	}

	// Business Finance Section

	public void moveToBusinessFinance() {
		SeleniumDriver.moveToElement(aldermorePageLocators.businessFinanceCTAButton);
	}

	public String getBusinessFinanceHeaderText() {
		return aldermorePageLocators.businessFinanceHeader.getText();
	}

	public String getBusinessFinanceButtonText() {
		

		return aldermorePageLocators.businessFinanceCTAButton.getText();
	}

	public void clickOnBusinessFinanceButton() {
		SeleniumDriver.acceptCookiesIfPresent();
		
		aldermorePageLocators.businessFinanceCTAButton.click();
		
	}

	// Intermediaries Banner

	public void moveToIntermediariesBanner() {
		SeleniumDriver.moveToElement(aldermorePageLocators.IntermediariesBannerLink);
	}

	public String getIntermediariesBannerHeaderText() {
		return aldermorePageLocators.IntermediariesBannerHeader.getText();
	}

	public String getIntermediariesBannerLinkText() {
		return aldermorePageLocators.IntermediariesBannerLink.getText();
	}

	public void clickOnIntermediariesBanner() {
		SeleniumDriver.acceptCookiesIfPresent();
		aldermorePageLocators.IntermediariesBannerLink.click();
	}
	
	
	
	

	

	
	    WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), null);

	    // ✅ Masthead header
	    public void verifyMastheadHeader() {
	        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//*[contains(normalize-space(text()), 'Backing you to achieve more')]")
	        ));
	        //Assert.assertTrue(header.isDisplayed(), "Masthead header not visible");
	    }

	    // ✅ Business Finance block
	    public void clickBusinessFinanceBlock() {
	        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//a[contains(@href,'business/finance')]")
	        ));
	        SeleniumDriver.clickOnElement(btn);
	    }

	    // ✅ Savings block
	    public void clickSavingsBlock() {
	        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//a[contains(@href,'business/savings')]")
	        ));
	        SeleniumDriver.clickOnElement(btn);
	    }

	    // ✅ Mortgages block
	    public void clickMortgagesBlock() {
	        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//a[contains(@href,'mortgages')]")
	        ));
	        SeleniumDriver.clickOnElement(btn);
	    }

	    // ✅ Intermediaries banner link
	    public void clickIntermediariesBanner() {
	        WebElement banner = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//a[contains(@href,'intermediaries')]")
	        ));
	        SeleniumDriver.clickOnElement(banner);
	    }
	}



